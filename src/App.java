import java.util.Scanner;

public class App {
  public static void main(String[] args) throws Exception {
    // Start
    Scanner tickets = new Scanner(System.in);

    String resultOne, resultTwo, resultThree, resultFour, valoration;
    Integer points = 8, attempts;

    System.out.println("------------------------------------------------------------------------------------------------------------");
    System.out.println("La puntuación maxima es de 8 puntos, con 6 puntos la calificación es positiva, de lo contrario, es negativa.");
    System.out.println("Tienes dos intentos por cada pregunta, te deseo buena suerte.");
    System.out.println("------------------------------------------------------------------------------------------------------------");

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
  }
}