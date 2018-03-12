FROM openjdk:8-jdk-slim
ADD ./target/spring-cloud-scaffold-0.0.1-SNAPSHOT.jar /app/spring-cloud-scaffold.jar
RUN sh -c 'touch /app/spring-cloud-scaffold.jar'
WORKDIR /app