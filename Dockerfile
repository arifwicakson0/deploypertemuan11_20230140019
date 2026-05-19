FROM eclipse-temurin:25-jdk
ARG JAR_FILE=target/*.jar
COPY ./target/demo.jar app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]
EXPOSE 8080