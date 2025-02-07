# Imagen base
FROM openjdk:17-jdk-slim

# Definir directorio de trabajo
WORKDIR /app

# Copiar JAR generado por Maven
COPY target/delete-user-service-0.0.1-SNAPSHOT.jar app.jar

# Comando para ejecutar el microservicio
ENTRYPOINT ["java", "-jar", "/app.jar"]
