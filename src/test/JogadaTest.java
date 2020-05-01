package test;

import com.jokenpo.model.Jogador1;
import com.jokenpo.model.Jogador2;
import com.jokenpo.service.JokenpoService;
import org.junit.Assert;
import org.junit.Test;

public class JogadaTest {

    private Jogador1 jogador1 = new Jogador1();
    private Jogador2 jogador2 = new Jogador2();
    private JokenpoService jokenpoService = new JokenpoService();

    @Test
    public void deveEstarIncorretoJogadaDoJogadorUm () {
        String jogadaJogador1 = "bbbbb";
        String jogadaJogador2 = "Pedra";

        jogador1 = jokenpoService.setJogadaJogador1(jogadaJogador1);
        jogador2 = jokenpoService.setJogadaJogador2(jogadaJogador2);

        Assert.assertEquals("Jogada inválida", jokenpoService.validaJogadas(jogador1,jogador2));
        Assert.assertEquals("BBBBB", jogador1.getJogada());
        Assert.assertEquals("PEDRA", jogador2.getJogada());
    }

    @Test
    public void deveEstarIncorretoJogadaDoJogadorDois () {
        String jogadaJogador1 = "Tesoura";
        String jogadaJogador2 = "aaaaa";

        jogador1 = jokenpoService.setJogadaJogador1(jogadaJogador1);
        jogador2 = jokenpoService.setJogadaJogador2(jogadaJogador2);

        Assert.assertEquals("Jogada inválida", jokenpoService.validaJogadas(jogador1,jogador2));
        Assert.assertEquals("TESOURA", jogador1.getJogada());
        Assert.assertEquals("AAAAA", jogador2.getJogada());
    }

    @Test
    public void deveEstarIncorretoJogadaDoJogadorUmJogadorDois () {
        String jogadaJogador1 = "bbbbb";
        String jogadaJogador2 = "aaaaa";

        jogador1 = jokenpoService.setJogadaJogador1(jogadaJogador1);
        jogador2 = jokenpoService.setJogadaJogador2(jogadaJogador2);

        Assert.assertEquals("Jogada inválida", jokenpoService.validaJogadas(jogador1,jogador2));
        Assert.assertEquals("BBBBB", jogador1.getJogada());
        Assert.assertEquals("AAAAA", jogador2.getJogada());
    }

    @Test
    public void deveVencerJogadorUmComPedra () {
        String jogadaJogador1 = "Pedra";
        String jogadaJogador2 = "Tesoura";

        jogador1 = jokenpoService.setJogadaJogador1(jogadaJogador1);
        jogador2 = jokenpoService.setJogadaJogador2(jogadaJogador2);

        Assert.assertEquals("Jogador 1 Venceu!", jokenpoService.validaJogadas(jogador1,jogador2));
    }

    @Test
    public void deveVencerJogadorUmComPapel () {
        String jogadaJogador1 = "Papel";
        String jogadaJogador2 = "Pedra";

        jogador1 = jokenpoService.setJogadaJogador1(jogadaJogador1);
        jogador2 = jokenpoService.setJogadaJogador2(jogadaJogador2);

        Assert.assertEquals("Jogador 1 Venceu!", jokenpoService.validaJogadas(jogador1,jogador2));
    }

    @Test
    public void deveVencerJogadorUmComTesoura () {
        String jogadaJogador1 = "Tesoura";
        String jogadaJogador2 = "Papel";

        jogador1 = jokenpoService.setJogadaJogador1(jogadaJogador1);
        jogador2 = jokenpoService.setJogadaJogador2(jogadaJogador2);

        Assert.assertEquals("Jogador 1 Venceu!", jokenpoService.validaJogadas(jogador1,jogador2));
    }

    @Test
    public void deveVencerJogadorDoisComPedra () {
        String jogadaJogador1 = "Tesoura";
        String jogadaJogador2 = "Pedra";

        jogador1 = jokenpoService.setJogadaJogador1(jogadaJogador1);
        jogador2 = jokenpoService.setJogadaJogador2(jogadaJogador2);

        Assert.assertEquals("Jogador 2 Venceu!", jokenpoService.validaJogadas(jogador1,jogador2));
    }

    @Test
    public void deveVencerJogadorDoisComPapel () {
        String jogadaJogador1 = "Pedra";
        String jogadaJogador2 = "Papel";

        jogador1 = jokenpoService.setJogadaJogador1(jogadaJogador1);
        jogador2 = jokenpoService.setJogadaJogador2(jogadaJogador2);

        Assert.assertEquals("Jogador 2 Venceu!", jokenpoService.validaJogadas(jogador1,jogador2));
    }

    @Test
    public void deveVencerJogadorDoisComTesoura () {
        String jogadaJogador1 = "Papel";
        String jogadaJogador2 = "Tesoura";

        jogador1 = jokenpoService.setJogadaJogador1(jogadaJogador1);
        jogador2 = jokenpoService.setJogadaJogador2(jogadaJogador2);

        Assert.assertEquals("Jogador 2 Venceu!", jokenpoService.validaJogadas(jogador1,jogador2));
    }
}
