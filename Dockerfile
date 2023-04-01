FROM openjdk:11-jre-slim

COPY apple.jar .

ENTRYPOINT exec java -jar apple.jar
