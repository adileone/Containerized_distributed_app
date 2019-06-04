# Progetto Architettura dei sistemi software

Progetto del corso di Architettura dei sistemi software relativo alla sperimentazione pratica di 
alcune tecnologie studiate durante il corso.

Riguarda la realizzazione di una semplice applicazione distribuita, composta da tre servizi ai quali possono essere associati diversi profili, nonché il rilascio di questa applicazione in un opportuno ambiente di esecuzione distribuito (Docker).

Terna di servizi A, B e C, che comunicano tra loro  tramite invocazioni remote con REST e 
comunicazione asincrona con Kafka. Per ciascun servizio possono esserci più istanze in esecuzione, 
ciascuna con un proprio nome (ad esempio, Alice, Barbara e Carlo). 

Un servizio principale A, che può ricevere richieste da un client HTTP/REST esterno, per le 
operazioni POST / e GET /.  

Un servizio secondario B, che è un ascoltatore di messaggi dal canale Z.

Un  servizio  secondario  C,  che  può  ricevere  richieste  da  un  client  HTTP/REST,  per  le 
operazioni POST / e GET /.  

![Alt text](arc.jpg?raw=true "arc")

Tecnologie utilizzate:

-Spring Boot/Spring Cloud.  
-Kafka
-Eureka(service  discovery)
-Ribbon  e  Feign  (per le chiamate rest)
-Zuul (per esporre il servizio offerto da A sulla porta 8080 di localhost).

