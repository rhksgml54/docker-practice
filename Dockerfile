FROM eclipse-temurin:17-jdk

WORKDIR /app

COPY build/libs/myapp.jap app.jar

ENTRYPOINT ["java", ".jar", "app.jar"]