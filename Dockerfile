FROM openjdk:11-jre-slim

COPY target/apple.jar .

ENTRYPOINT exec java -jar apple.jar
