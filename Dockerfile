# Use an official OpenJDK runtime as a parent image
FROM openjdk:17.0.1-jdk-slim

# Set the working directory to /app
WORKDIR /app

# Copy the application JAR file into the container at /app
COPY build/libs/grocery-price-detector-0.0.1-SNAPSHOT.jar .

# Make port 8080 available to the world outside this container
EXPOSE 8080

# Run the application
CMD ["java", "-jar", "grocery-price-detector-0.0.1-SNAPSHOT.jar"]
