# pruebaFarmaTodo

INDICACIONES:

ApiAdditionNumbers:
Se recomienda la api en el servidor inplementando el link localhost:8080/calculateNumbers/{digit}, donde digit corresponde a la cantidad de numeros naturales que se han de sumar.

Tambien se puede probar la api en programas de peticiones http como postman, con la petición GET (http://localhost:8080/calculateNumbers/{digit}.

ApiHappyNumbers:
No se puede correr en el servidor ya que los datos de numeros requeridos se ingresan por medio de una peticion http(POST). Por tal razón se debeprobar en un programa de peticiones http con la petición POST: http://localhost:8080/happyNumbers.

ApiPetition:
Se debe crear una base de datos en MySQL con el nombre: db_pruebafarmatodo.
se realizan las peticiones http por medio de un programa de peticiones como postman, a través de la petición GET: http://localhost:8080/petition.