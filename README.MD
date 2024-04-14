# Indicaciones para ejecutar

### 1. Clonar el repositorio
git clone git@github.com:Jonathan-Criollo/Parcial_1_GT02_Grupo_5.git

### 2. Abrimos el proyecto en VScode

### 3. Abrimos docker-desktop

### 4. En la terminal ejecutamos
(solo asi pudimos xd) 
mvn clean package -DskipTests

### 5. Levantamos proyecto sin rastro de caché
docker-compose down && docker-compose build --no-cache && docker-compose up -d

### 6. Abrimos el localhost 8080

http://localhost:8080/users

# Integrantes del grupo:
- Jonathan Rolando Criollo Melchor	:CM21020
- Marcos David Guillén Fernández	:GF21027
- Francisco Javier Peraza Martínez	:PM18077
