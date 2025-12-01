# Stage 1: Build the application
FROM openjdk:17-jdk-alpine


# Copy the JAR file from the builder stage
COPY target/*.jar app.jar


ENTRYPOINT ["java", "-jar", "app.jar"]

# Expose the port the app will run on
EXPOSE 8080
