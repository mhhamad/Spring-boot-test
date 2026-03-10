# Use Java 21 base image
FROM eclipse-temurin:21-jdk-alpine

# Build argument (path to jar)
ARG JAR_FILE=target/*.jar

# Copy jar file into container
COPY ${JAR_FILE} app.jar

# Expose Spring Boot port
EXPOSE 8080

# Run the application
ENTRYPOINT ["java","-jar","/app.jar"]