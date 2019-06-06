#!/bin/bash

# Script per avviare l'applicazione Avvistamenti

if echo dump | nc localhost 2181 | grep -q brokers ; then 

	echo Running AVVISTAMENTI [Eureka + Kafka + Ribbon + Feign + Hystrix + Zuul Gateway] &

	echo Starting Eureka Server  
	java -Xms64m -Xmx128m -jar eureka-server/build/libs/eureka-server-0.0.1-SNAPSHOT.jar &
	sleep 2 &
	echo Starting avvistamenti: servizioA:alice*1 &
	java -Xms64m -Xmx128m -jar -Dspring.profiles.active=alice -Deureka.client.serviceUrl.defaultZone=http://localhost:8761/eureka/ -Dspring.kafka.bootstrap-servers=localhost:9092 servizioA/build/libs/servizioA-0.0.1-SNAPSHOT.jar &
	sleep 2 &
	echo Starting avvistamenti: servizioB:bruno*1 &
	java -Xms64m -Xmx128m -jar -Dspring.profiles.active=bruno -Deureka.client.serviceUrl.defaultZone=http://localhost:8761/eureka/ -Dspring.kafka.bootstrap-servers=localhost:9092 servizioB/build/libs/servizioB-0.0.1-SNAPSHOT.jar &
	sleep 2 &
	echo Starting avvistamenti: servizioC:carlo*1 &
	java -Xms64m -Xmx128m -jar -Dspring.profiles.active=carlo -Deureka.client.serviceUrl.defaultZone=http://localhost:8761/eureka/ servizioC/build/libs/servizioC-0.0.1-SNAPSHOT.jar &
	sleep 2 &
	echo Starting Zuul Gateway &
	java -Xms64m -Xmx128m -jar -Deureka.client.serviceUrl.defaultZone=http://localhost:8761/eureka/ zuul-gateway/build/libs/zuul-gateway-0.0.1-SNAPSHOT.jar

else 
		echo please start Kafka first ... run start-kafka.sh as root
fi
