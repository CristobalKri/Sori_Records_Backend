# Stage 1: Build the application
FROM dvmarques/openjdk-17-jdk-alpine-with-timezone

# Copy the JAR file from the builder stage
COPY target/*.jar app.jar

# Expose the port the app will run on
EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]