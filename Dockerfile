FROM openjdk:8-jdk-alpine
MAINTAINER  Nijo George Payyappilly<nijomon@gmail.com>

EXPOSE 8080
ADD /target/spring-kotlin-app-0.0.1-SNAPSHOT.jar spring-kotlin-app.jar
ENTRYPOINT ["java", "-jar", "spring-kotlin-app.jar"]