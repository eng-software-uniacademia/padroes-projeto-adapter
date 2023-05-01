import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CadernoTest {
    @Test
    void deveRetornarLinhaCaderno() {
        var caderno = new Caderno();
        caderno.addLinha("linha 1");

        assertEquals("{1=linha 1}", caderno.getLinhas().toString());
    }

    @Test
    void deveRetornarLinhasCaderno() {
        var linhas = new ArrayList<String>();
        linhas.add("linha 1");
        linhas.add("linha 2");
        linhas.add("linha 3");

        var caderno = new Caderno();
        caderno.addLinhas(linhas);

        assertEquals("{1=linha 1, 2=linha 2, 3=linha 3}", caderno.getLinhas().toString());
    }
}
