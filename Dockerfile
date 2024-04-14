FROM maven:3.9.6-eclipse-temurin-17-focal AS builder

# Copia solo los archivos necesarios para la resolución de dependencias
COPY pom.xml /build/
COPY src /build/src/

# Cambia al directorio de construcción
WORKDIR /build

# Compila el proyecto sin ejecutar los tests
RUN mvn clean package -DskipTests

# Etapa final: crear la imagen de producción
FROM eclipse-temurin:17-focal

ENV DATABASE_URL=jdbc:mariadb://localhost:3306/mydatabase

# Copia el archivo JAR generado desde la etapa anterior
COPY --from=builder /build/target/crud-0.0.1-SNAPSHOT.jar /app/java-app.jar

# Define el directorio de trabajo
WORKDIR /app

# Define el comando por defecto
CMD ["java", "-jar", "java-app.jar"]
