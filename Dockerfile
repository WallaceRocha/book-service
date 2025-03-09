FROM maven:3.8.6-openjdk-18-slim AS build
WORKDIR /home/app

COPY ./pom.xml /home/app/pom.xml
COPY ./src/main/java/dev/stonehold/book_service/BookServiceApplication.java /home/app/src/main/java/dev/stonehold/book_service/BookServiceApplication.java
RUN mvn -f /home/app/pom.xml clean package -Pdocker

COPY . /home/app
RUN mvn -f /home/app/pom.xml clean package -Pdocker

FROM openjdk:18.0-slim
EXPOSE 8080
COPY --from=build /home/app/target/*.jar app.jar
ENTRYPOINT [ "sh", "-c",  "java -jar /app.jar" ]