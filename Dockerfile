FROM openjdk:11-slim
COPY ./target/java-maven-template-1.0-SNAPSHOT.jar /app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]



