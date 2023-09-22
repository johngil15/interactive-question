# Interactive Questions

### Inicio

Para crear mi algoritmo utilice las siguientes variables:

- Las varibles **resultOne, resultTwo, resultThree, resultFour** son para almacenar la respuesta 1, 2, 3 y 4.
- La variable **points** almacena el total de puntos.
- La variable **attemps** almacena los intentos que tiene el usuario para responder cada pregunta.

```java
// Start
Scanner tickets = new Scanner(System.in);

String resultOne, resultTwo, resultThree, resultFour, valoration;
Integer points = 0, attempts;

System.out.println("------------------------------------------------------------------------------------------------------------");
System.out.println("La puntuación maxima es de 8 puntos, con 6 puntos la calificación es positiva, de lo contrario, es negativa.");
System.out.println("Tienes dos intentos por cada pregunta, te deseo buena suerte.");
System.out.println("------------------------------------------------------------------------------------------------------------");
```

### Proceso

La lógica de mi algoritmo se basa en una estructura de programación llamada **while,** básicamente se utiliza para llevar control de la cantidad de intentos que tiene el usuario para responder cada pregunta.

El comportamiento del cada ciclo es el siguiente:

1. Muestra la pregunta al usuario.
2. Obtiene la información de la respuesta.
3. Valida con la estructura de programación **if**, si la respuesta es correcta.
4. Si la pregunta es correcta almacena los 2 puntos.
5. Si la pregunta es incorrecta suma el intento en la variable **attempts** y muestra al usuario que la respuesta es incorrecta.

```java
// Process
// One question
attempts = 0;
while (attempts < 2) {
  System.out.println("Donde es la sede deportiva de futbol para los partidos de la Selección Colombia?");
  resultOne = tickets.next();

  if (resultOne == "Barranquilla" || resultOne == "barranquilla") {
    points = 2;
    attempts = 2;
      
  } else {
    attempts = attempts + 1;
    System.out.println("La respuesta es incorrecta.");
  }
}
```

De la misma forma es el funcionamiento para las demás preguntas.

```java
// Second question
attempts = 0;
while (attempts < 2) {
  System.out.println("Quien es el maximo goleador de la selección Colombia?");
  resultTwo = tickets.nextLine();

  if (resultTwo == "Falcao Garcia" || resultTwo == "falcao garcia") {
    points = 2;
    attempts = 2;
      
  } else {
    attempts = attempts + 1;
    System.out.println("La respuesta es incorrecta.");
  }
}

// Third quesrion
attempts = 0;
while (attempts < 2) {
  System.out.println("Quien es el maximo asistidor de la selección Colombia?");
  resultThree = tickets.nextLine();

  if (resultThree == "James Rodriguez" || resultThree == "james rodriguez") {
    points = 2;
    attempts = 2;
      
  } else {
    attempts = attempts + 1;
    System.out.println("La respuesta es incorrecta.");
  }
}

// Fourth question
attempts = 0;
while (attempts < 2) {
  System.out.println("Cual es el único titulo que ha ganado la selección Colombia?");
  resultFour = tickets.nextLine();

  if (resultFour == "Copa America" || resultFour == "copa america") {
    points = 2;
    attempts = 2;
      
  } else {
    attempts = attempts + 1;
    System.out.println("La respuesta es incorrecta.");
  }
}
```

### Salida

En la salida de mi algoritmo valido el total de puntos y defino si la calificación fue positiva o negativa.

```java
// Finish
if (points >= 6) {
  valoration = "Positiva";
} else {
  valoration = "Negativa";
}

System.out.println("--------------------------------------");
System.out.println("| Total de puntos | Valoración final |");
System.out.println("--------------------------------------");
System.out.println("|       " + points + "         |     " + valoration + "     |");
System.out.println("--------------------------------------");
```# interactive-question
