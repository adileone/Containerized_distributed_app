########################################################
# Dockerfile per il servizioC - profilo Carlo
########################################################

FROM openjdk:8-jdk 

ADD build/libs/servizioC-0.0.1-SNAPSHOT.jar servizioC-0.0.1-SNAPSHOT.jar

EXPOSE 8082

ENTRYPOINT ["java", "-Xmx128m", "-Xms128m"]

CMD ["-jar", "-Dspring.profiles.active=carlo", "servizioC-0.0.1-SNAPSHOT.jar"]
