#!/bin/bash

# Script per avviare l'applicazione Avvistamenti

if echo dump | nc localhost 2181 | grep -q brokers ; then 

	echo Running AVVISTAMENTI [Eureka + Kafka + Ribbon + Feign + Hystrix + Zuul Gateway]

	echo Starting Eureka Server  
	java -Xms64m -Xmx128m -jar eureka-server/build/libs/eureka-server-0.0.1-SNAPSHOT.jar &

	echo Starting avvistamenti Services [servizioA:alice*1 + servizioB:bruno*1 + servizioC:carlo*1]
	java -Xms64m -Xmx128m -jar -Dspring.profiles.active=alice servizioA/build/libs/servizioA-0.0.1-SNAPSHOT.jar &
	java -Xms64m -Xmx128m -jar -Dspring.profiles.active=bruno servizioB/build/libs/servizioB-0.0.1-SNAPSHOT.jar &
	java -Xms64m -Xmx128m -jar -Dspring.profiles.active=carlo servizioC/build/libs/servizioC-0.0.1-SNAPSHOT.jar &

	echo Starting Zuul Gateway

	java -Xms64m -Xmx128m -jar zuul-gateway/build/libs/zuul-gateway-0.0.1-SNAPSHOT.jar

else 
		echo please start Kafka first ... run start-kafka.sh as root
fi
