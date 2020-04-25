package com.jokenpo;

import com.jokenpo.model.Jogador1;
import com.jokenpo.model.Jogador2;
import com.jokenpo.service.JokenpoService;

import java.util.Scanner;

public class Jogar {

    private static JokenpoService jokenpoService;
    private static Jogador1 jogador1;
    private static Jogador2 jogador2;

    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);

        System.out.println("Jogador 1");
        String jogadaJogador1 = scan.next();

        System.out.println("Jogador 2");
        String jogadaJogador2 = scan.next();

        jogador1 = jokenpoService.setJogadaJogador1(jogadaJogador1);
        jogador2 = jokenpoService.setJogadaJogador2(jogadaJogador2);

       jokenpoService.validaJogadas(jogador1, jogador2);
    }
}
