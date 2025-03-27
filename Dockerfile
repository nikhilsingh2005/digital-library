# Use the official OpenJDK 21 image (Debian-based, slim version for smaller size)
FROM openjdk:21-jdk-slim

# Set the working directory inside the container
WORKDIR /app

# Copy the JAR file from the target directory into the container
COPY target/digital-library-0.0.1-SNAPSHOT.jar app.jar

# Expose the application's port (Spring Boot default is 8080)
EXPOSE 8080

# Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]
