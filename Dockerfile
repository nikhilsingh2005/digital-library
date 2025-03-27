# Use a valid Maven image with JDK 21
FROM maven:3.9.6-eclipse-temurin-21 AS builder
WORKDIR /app

# Copy the project files
COPY . .

# Grant execute permission to mvnw (fixes permission issue)
RUN chmod +x mvnw

# Build the application (creates target/*.jar)
RUN ./mvnw clean package -DskipTests

# Use a minimal OpenJDK image for the final container
FROM openjdk:21-jdk-slim
WORKDIR /app

# Copy the built JAR from the builder stage
COPY --from=builder /app/target/*.jar app.jar

# Expose the application's port
EXPOSE 8080

# Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]
