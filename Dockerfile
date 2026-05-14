FROM openjdk:17-jdk-slim

WORKDIR /app

COPY build/libs/myapp.jap app.jar

ENTRYPOINT ["java", ".jar", "app.jar"]