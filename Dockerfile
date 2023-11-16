FROM openjdk:21
VOLUME /tmp
COPY run.sh .
COPY build/libs/*.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
