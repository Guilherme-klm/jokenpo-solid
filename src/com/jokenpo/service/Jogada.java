package com.jokenpo.service;

import com.jokenpo.model.Jogador1;
import com.jokenpo.model.Jogador2;

public class Jogada {

    private ValidaJogada validaJogada;
    
    public Jogador1 tipoJogadaJogador1(String jogada) {
        Jogador1 jogador1 = new Jogador1();
        jogador1.setJogada(jogada);
        return jogador1;
    }
    
    public Jogador2 tipoJogadaJogador2(String jogada) {
        Jogador2 jogador2 = new Jogador2();
        jogador2.setJogada(jogada);
        return jogador2;
    }

    public String validaJogadas (Jogador1 jogador1, Jogador2 jogador2) throws Exception {
        if (validaJogada.verificaTipoDaJogada(jogador1, jogador2))
            throw new Exception("Jogada inválida");

        return validaJogada.validaJogada(jogador1, jogador2);
    }
}
