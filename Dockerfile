FROM maven:3.9.6-eclipse-temurin-17-focal
#RUN mvn clean package
COPY /target/crud-0.0.1-SNAPSHOT.jar java-app.jar
CMD echo "corriendo la app ejecutandose ejecutablemente"
ENTRYPOINT [ "java", "-jar", "java-app.jar" ]
