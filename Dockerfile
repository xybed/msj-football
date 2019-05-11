FROM openjdk:8-jdk-alpine
ARG version
ADD target/msj-football-${version}.jar app.jar
ENV JAVA_OPTS=""

ENTRYPOINT exec java $JAVA_OPTS -jar /app.jar --spring.profiles.active=prod