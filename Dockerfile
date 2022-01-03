FROM openjdk:8-jdk-alpine
EXPOSE 8888
ARG JAR_FILE=products/target/products-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} products-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/products-0.0.1-SNAPSHOT.jar"]