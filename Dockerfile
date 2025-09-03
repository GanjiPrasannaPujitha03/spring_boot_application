# Use Java 17 slim image
FROM openjdk:17-jdk-slim

# Maintainer info
LABEL maintainer="prasannapujitha03@gmail.com"

# Set working directory
WORKDIR /app

# Copy the built jar into the container
COPY target/simple-hello-Pujitha-1.0.0.jar hello-pujitha.jar

# Expose port 8080
EXPOSE 8080

# Run the jar file
ENTRYPOINT ["java", "-jar", "hello-pujitha.jar"]
