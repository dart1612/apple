FROM openjdk:11-jre-slim

COPY target/apple-0.0.1-SNAPSHOT.jar .

ENTRYPOINT exec java -jar apple.jar
