# Use Java 21 base image
FROM eclipse-temurin:21-jdk-alpine

# Working directory
WORKDIR /app

# Build argument
ARG JAR_FILE=target/SpringBoot_2-0.0.1-SNAPSHOT.jar

# Copy jar file
COPY ${JAR_FILE} app.jar

# Expose port
EXPOSE 8080

# Run the application
ENTRYPOINT ["java","-jar","app.jar"]