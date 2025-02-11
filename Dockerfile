# 1️⃣ Use Java 21 base image
FROM openjdk:21-jdk-slim

# 3️⃣ Copy the JAR file into the container
COPY ./target/SpringBoot-MongoDB-Demo-0.0.1-SNAPSHOT.jar app.jar

# 4️⃣ Expose port 8080 (or the port your app uses)
EXPOSE 8080

# 5️⃣ Run the Spring Boot application
ENTRYPOINT ["java", "-jar", "/app.jar"]
