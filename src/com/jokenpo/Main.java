package com.jokenpo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("|--jokenpo--|");
        int jogada1;
        int jogada2;

        boolean jogada1Valida = false;
        boolean jogada2Valida = false;

        do {

            System.out.println("> ESCOLHA UMA JOGADA:");
            System.out.println(">| PEDRA - 0 | PAPEL - 1 | TESOURA - 2 |");
            System.out.print("> Jogador 1: ");
            jogada1 = scanner.nextInt();
            System.out.print("> Jogador 2: ");
            jogada2 = scanner.nextInt();

            if(jogada1 == 0 || jogada1 == 1 || jogada1 == 2) {
                jogada1Valida = true;
            }

            if(jogada2 == 0 || jogada2 == 1 || jogada2 == 2) {
                jogada2Valida = true;
            }

            if(!jogada1Valida || !jogada2Valida) {

                System.out.println("Jogada invalida!");

            } else {

                String nomeJogada1 = getNomeJogada(jogada1);
                String nomeJogada2 = getNomeJogada(jogada2);

                String resultado = "Resultado Invalido";

                if(nomeJogada1 == nomeJogada2) {
                    resultado = "Empate";
                } else if(nomeJogada1 == "PEDRA" && nomeJogada2 == "PAPEL") {
                    resultado = "Papel venceu!";
                }
                 else if(nomeJogada1 == "PEDRA" && nomeJogada2 == "TESOURA") {
                    resultado = "Pedra venceu!";
                }
                 else if(nomeJogada1 == "PAPEL" && nomeJogada2 == "PEDRA") {
                    resultado = "Papel venceu!";
                }
                 else if(nomeJogada1 == "PAPEL" && nomeJogada2 == "TESOURA") {
                    resultado = "Tesoura venceu!";
                }
                 else if(nomeJogada1 == "TESOURA" && nomeJogada2 == "PEDRA") {
                    resultado = "Pedra venceu!";
                }
                 else if(nomeJogada1 == "TESOURA" && nomeJogada2 == "PAPEL") {
                    resultado = "Tesoura venceu!";
                }

                System.out.println(resultado);
            }

        } while(!jogada1Valida || !jogada2Valida);
        
        scanner.close();

    }

    private static String getNomeJogada(int jogada) {

        String nomeJogada = "Jogada invalida!";

        if(jogada == 0) {
            nomeJogada = "PEDRA";
        } else if(jogada == 1) {
            nomeJogada = "PAPEL";
        } else {
            nomeJogada = "TESOURA";
        }

        return nomeJogada;

    }

}
