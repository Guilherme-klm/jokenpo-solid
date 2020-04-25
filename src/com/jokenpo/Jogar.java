package com.jokenpo;

import com.jokenpo.model.Jogador1;
import com.jokenpo.model.Jogador2;
import com.jokenpo.service.JokenpoService;

import java.util.Scanner;

public class Jogar {

    private static JokenpoService jokenpoService;

    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);

        String jogadaJogador1 = scan.next();
        String jogadaJogador2 = scan.next();

        Jogador1 jogador1 = jokenpoService.setJogadaJogador1(jogadaJogador1);
        Jogador2 jogador2 = jokenpoService.setJogadaJogador2(jogadaJogador2);

       jokenpoService.validaJogadas(jogador1, jogador2);
    }
}
