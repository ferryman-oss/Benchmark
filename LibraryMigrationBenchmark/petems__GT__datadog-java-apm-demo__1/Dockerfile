FROM amazoncorretto:11-alpine3.16-jdk

RUN apk update && \
    apk add maven

COPY src src
COPY pom.xml .
RUN mvn clean install

RUN apk add curl

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "target/datadogjavaapmdemo-0.0.1-SNAPSHOT.jar"]
