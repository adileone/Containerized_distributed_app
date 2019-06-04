#!/bin/bash

# Client per comunicare avvistamenti tramite chiamate REST

echo POST to serviceA animal=lupo &
	
curl --data 'animal=lupo' http://localhost:8080/servizioa/ &

echo POST to serviceA/kafka animal=cane &

curl --data 'animal=cane' http://localhost:8080/servizioa/kafka &

echo GET to serviceA/ to retrieve sightings list &

curl http://localhost:8080/servizioa
