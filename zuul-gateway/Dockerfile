########################################################
# Dockerfile per Zuul
########################################################

FROM openjdk:8-jdk 

ADD build/libs/zuul-gateway-0.0.1-SNAPSHOT.jar zuul-gateway-0.0.1-SNAPSHOT.jar

EXPOSE 8080

ENTRYPOINT ["java","-jar","zuul-gateway-0.0.1-SNAPSHOT.jar"]
