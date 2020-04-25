package com.jokenpo.service;

import com.jokenpo.model.Jogador1;
import com.jokenpo.model.Jogador2;
import com.jokenpo.types.JokenpoTypes;

public class ValidaJogada {

    public String validaJogada (Jogador1 jogador1, Jogador2 jogador2) {
        String jogadaJogador1 = jogador1.getJogada().toUpperCase().trim();
        String jogadaJogador2 = jogador2.getJogada().toUpperCase().trim();

        if (jogadaJogador1.equals(JokenpoTypes.PAPEL.getValue()) && jogadaJogador2.equals(JokenpoTypes.PEDRA.getValue())) {
           return "Jogador 1 Venceu!";
        }

        else if (jogadaJogador1.equals(JokenpoTypes.PEDRA.getValue()) && jogadaJogador2.equals(JokenpoTypes.TESOURA.getValue())) {
            return "Jogador 1 Venceu!";
        }

        else if (jogadaJogador1.equals(JokenpoTypes.TESOURA.getValue()) && jogadaJogador2.equals(JokenpoTypes.PAPEL.getValue())) {
            return "Jogador 1 Venceu!";
        }

        else if (jogadaJogador2.equals(JokenpoTypes.PAPEL.getValue()) && jogadaJogador1.equals(JokenpoTypes.PEDRA.getValue())) {
            return "Jogador 2 Venceu!";
        }

        else if (jogadaJogador2.equals(JokenpoTypes.PEDRA.getValue()) && jogadaJogador1.equals(JokenpoTypes.TESOURA.getValue())) {
            return "Jogador 2 Venceu!";
        }

        else if (jogadaJogador2.equals(JokenpoTypes.TESOURA.getValue()) && jogadaJogador1.equals(JokenpoTypes.PAPEL.getValue())) {
            return "Jogador 2 Venceu!";
        }
        return "Empate!";
    }

    public boolean verificaTipoDaJogada (Jogador1 jogador1, Jogador2 jogador2) {
        if (Integer.class.equals(jogador1.getJogada()) || Integer.class.equals(jogador2.getJogada())) return true;

        return false;
    }
}