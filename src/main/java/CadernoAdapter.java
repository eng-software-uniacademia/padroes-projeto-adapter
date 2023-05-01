import java.util.List;

public class CadernoAdapter {
    private final Caderno caderno;

    public CadernoAdapter(Caderno caderno) {
        this.caderno = caderno;
    }

    public void addLinhas(List<String> linhas) {
        for (var linha : linhas) {
            caderno.addLinha(linha);
        }
    }
}
