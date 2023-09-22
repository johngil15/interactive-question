Algoritmo interactiveQuestion
	// Start
	Definir resultOne, resultTwo, resultThree, resultFour, valoration Como Cadena
	Definir points, attempts Como Entero
	points <- 0
	Escribir '************************************************************************'
	Escribir 'La puntuación maxima es de 8 puntos, con 6 puntos la calificación es positiva, de lo contrario, es negativa.'
	Escribir 'Tienes dos intentos por cada pregunta, te deseo buena suerte.'
	Escribir '************************************************************************'

	// Process
	// One question
	attempts <- 0
	Mientras attempts<2 Hacer
		Escribir 'Donde es la sede deportiva de futbol para los partidos de la Selección Colombia'
		Leer resultOne
		Si resultOne=='Barranquilla' O resultOne=='barranquilla' Entonces
			points <- 2
			attempts <- 2
		SiNo
			attempts <- attempts+1
			Escribir 'La respuesta es incorrecta'
		FinSi
	FinMientras

	// Second question
	attempts <- 0
	Mientras attempts<2 Hacer
		Escribir 'Quien es el maximo goleador de la selección Colombia'
		Leer resultTwo
		Si resultTwo=='Falcao Garcia' O resultTwo=='falcao garcia' Entonces
			points <- points+2
			attempts <- 2
		SiNo
			attempts <- attempts+1
			Escribir 'La respuesta es incorrecta'
		FinSi
	FinMientras

	// Third quesrion
	attempts <- 0
	Mientras attempts<2 Hacer
		Escribir 'Quien es el maximo asistidor de la selección Colombia'
		Leer resultThree
		Si resultThree=='James Rodriguez' O resultThree=='james rodriguez' Entonces
			points <- points+2
			attempts <- 2
		SiNo
			attempts <- attempts+1
			Escribir 'La respuesta es incorrecta'
		FinSi
	FinMientras

	// Fourth question
	attempts <- 0
	Mientras attempts<2 Hacer
		Escribir 'Cual es el único titulo que ha ganado la selección Colombia'
		Leer resultFour
		Si resultFour=='Copa America' O resultFour=='copa america' Entonces
			points <- points+2
			attempts <- 2
		SiNo
			attempts <- attempts+1
			Escribir 'La respuesta es incorrecta'
		FinSi
	FinMientras

	// Finish
	Si points>=6 Entonces
		valoration <- 'Positiva'
	SiNo
		valoration <- 'Negativa'
	FinSi

	Escribir '--------------------------------------'
	Escribir '| Total de puntos | Valoración final |'
	Escribir '--------------------------------------'
	Escribir '|       ', points, '         |     ', valoration, '     |'
	Escribir '--------------------------------------'
FinAlgoritmo
