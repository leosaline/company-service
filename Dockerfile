FROM openjdk:20-jdk-slim
VOLUME /tmp
ADD /target/*.jar app.jar
EXPOSE 9003
ENTRYPOINT ["java","-jar","/app.jar"]