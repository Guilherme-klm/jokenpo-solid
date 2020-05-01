package com.jokenpo.service;

import com.jokenpo.model.Jogador1;
import com.jokenpo.model.Jogador2;

public class JokenpoService {

    public Jogada jogada = new Jogada();

    public Jogador1 setJogadaJogador1 (String jogador1) {
        return jogada.tipoJogadaJogador1(jogador1);
    }

    public Jogador2 setJogadaJogador2 (String jogador2) {
        return jogada.tipoJogadaJogador2(jogador2);
    }

    public String validaJogadas (Jogador1 jogador1, Jogador2 jogador2) {
       return jogada.validaJogadas(jogador1, jogador2);
    }

}
