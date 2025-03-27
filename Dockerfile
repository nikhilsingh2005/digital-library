# Use an official OpenJDK runtime as a parent image
FROM openjdk:21-jdk-alpine

# Set the working directory in the container
WORKDIR /app

# Copy the packaged jar file into the container
# Ensure that you have built the jar using 'mvn clean install' or 'mvn clean package'
COPY target/digital-library-0.0.1-SNAPSHOT.jar app.jar

# Expose the port your application will run on (default 8080)
EXPOSE 8080

# Run the jar file
ENTRYPOINT ["java", "-jar", "app.jar"]
