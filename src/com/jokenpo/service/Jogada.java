package com.jokenpo.service;

import com.jokenpo.model.Jogador1;
import com.jokenpo.model.Jogador2;
import com.jokenpo.types.JokenpoTypes;

public class Jogada {

    public Jogador1 tipoJogadaJogador1(String jogada) {
        Jogador1 jogador1 = new Jogador1(jogada.toUpperCase().trim());
        return jogador1;
    }
    
    public Jogador2 tipoJogadaJogador2(String jogada) {
        Jogador2 jogador2 = new Jogador2(jogada.toUpperCase().trim());
        return jogador2;
    }

    public String validaJogadas (Jogador1 jogador1, Jogador2 jogador2) {
        if (verificaTipoDaJogadaJogador1(jogador1) || verificaTipoDaJogadaJogador2(jogador2))
            return "Jogada inválida";

        return validaJogada(jogador1, jogador2);
    }

    public String validaJogada (Jogador1 jogador1, Jogador2 jogador2) {
        String jogadaJogador1 = jogador1.getJogada();
        String jogadaJogador2 = jogador2.getJogada();

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

    public boolean verificaTipoDaJogadaJogador1 (Jogador1 jogador1) {
        if (jogador1.getJogada().equals("PEDRA") || jogador1.getJogada().equals("PAPEL") || jogador1.getJogada().equals("TESOURA")) return false;

        return true;
    }

    public boolean verificaTipoDaJogadaJogador2 (Jogador2 jogador2) {
        if (jogador2.getJogada().equals("PEDRA") || jogador2.getJogada().equals("PAPEL") || jogador2.getJogada().equals("TESOURA")) return false;

        return true;
    }
}
