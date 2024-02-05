package org.example;


import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                Random random = new Random();

                String[] opciones = {"piedra", "papel", "tijera"};

                int victorias = 0;
                int derrotas = 0;
                int empates = 0;

                while (true) {
                    System.out.println("Elige: piedra, papel o tijera (o 'salir' para terminar): ");
                    String eleccionJugador = scanner.nextLine().toLowerCase();

                    if (eleccionJugador.equals("salir")) {
                        System.out.println("¡Hasta luego!");
                        break;
                    }

                    if (!eleccionJugador.equals("piedra") && !eleccionJugador.equals("papel") && !eleccionJugador.equals("tijera")) {
                        System.out.println("Elección no válida. Por favor, elige piedra, papel o tijera.");
                        continue;
                    }

                    int indiceComputadora = random.nextInt(3);
                    String eleccionComputadora = opciones[indiceComputadora];

                    System.out.println("La computadora eligió: " + eleccionComputadora);

                    if (eleccionJugador.equals(eleccionComputadora)) {
                        System.out.println("¡Empate!");
                        empates++;
                    } else if ((eleccionJugador.equals("piedra") && eleccionComputadora.equals("tijera")) ||
                            (eleccionJugador.equals("papel") && eleccionComputadora.equals("piedra")) ||
                            (eleccionJugador.equals("tijera") && eleccionComputadora.equals("papel"))) {
                        System.out.println("¡Ganaste!");
                        victorias++;
                    } else {
                        System.out.println("¡Perdiste!");
                        derrotas++;
                    }
                }

                System.out.println("Resultados: Victorias: " + victorias + ", Derrotas: " + derrotas + ", Empates: " + empates);

                scanner.close();


    }
}