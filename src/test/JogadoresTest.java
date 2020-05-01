package test;

import com.jokenpo.model.Jogador1;
import com.jokenpo.model.Jogador2;
import com.jokenpo.service.JokenpoService;
import org.junit.Assert;
import org.junit.Test;

public class JogadoresTest {

    private Jogador1 jogador1 = new Jogador1();
    private Jogador2 jogador2 = new Jogador2();
    private JokenpoService jokenpoService = new JokenpoService();

    @Test
    public void deveSalvarJogadaDoJogadorUmCerta () {
        String jogadaJogador1 = "Pedra";

        jogador1 = jokenpoService.setJogadaJogador1(jogadaJogador1);

        Assert.assertEquals("PEDRA", jogador1.getJogada());
    }

    @Test
    public void deveSalvarJogadaDoJogadorDoisCerta () {
        String jogadaJogador2 = "Pedra";

        jogador2 = jokenpoService.setJogadaJogador2(jogadaJogador2);

        Assert.assertEquals("PEDRA", jogador2.getJogada());
    }

    @Test
    public void deveSalvarJogadaDoJogadorUmJogadorDoisCerta () {
        String jogadaJogador1 = "Pedra";
        String jogadaJogador2 = "Pedra";

        jogador1 = jokenpoService.setJogadaJogador1(jogadaJogador1);
        jogador2 = jokenpoService.setJogadaJogador2(jogadaJogador2);

        Assert.assertEquals("PEDRA", jogador1.getJogada());
        Assert.assertEquals("PEDRA", jogador2.getJogada());
    }

}
