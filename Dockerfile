# Use the official image as a parent image.
FROM openjdk:11.0.2-oracle

#Maintainer Information
LABEL maintainer="npayyappilly@expedia.com"

# Inform Docker that the container is listening on the specified port at runtime.
EXPOSE 8080

# Add the file from your host to your current location.
ADD /target/spring-kotlin-app-0.0.1-SNAPSHOT.jar spring-kotlin-app.jar

# Run the specified service within the container.
ENTRYPOINT ["java", "-jar", "spring-kotlin-app.jar"]
