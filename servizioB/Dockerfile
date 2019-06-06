########################################################
# Dockerfile per il servizioB - profilo Bruno
########################################################

FROM openjdk:8-jdk 

ADD build/libs/servizioB-0.0.1-SNAPSHOT.jar servizioB-0.0.1-SNAPSHOT.jar

EXPOSE 8081

ENTRYPOINT ["java", "-Xmx128m", "-Xms128m"]

CMD ["-jar", "-Dspring.profiles.active=bruno", "servizioB-0.0.1-SNAPSHOT.jar"]
