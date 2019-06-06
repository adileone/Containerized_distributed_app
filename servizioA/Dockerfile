########################################################
# Dockerfile per il servizioA - profilo Alice
########################################################

FROM openjdk:8-jdk 

ADD build/libs/servizioA-0.0.1-SNAPSHOT.jar servizioA-0.0.1-SNAPSHOT.jar

EXPOSE 8083

ENTRYPOINT ["java", "-Xmx128m", "-Xms128m"]

CMD ["-jar", "-Dspring.profiles.active=alice", "servizioA-0.0.1-SNAPSHOT.jar"]
