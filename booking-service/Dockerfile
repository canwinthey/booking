FROM openjdk:8-jdk-alpine
EXPOSE 8082
ADD target/booking-service-0.0.1-SNAPSHOT.jar booking-service-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["sh", "-c", "java -jar booking-service-0.0.1-SNAPSHOT.jar"]