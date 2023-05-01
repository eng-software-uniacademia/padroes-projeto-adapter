import java.util.HashMap;
import java.util.List;

public class Caderno {
    private final HashMap<Integer, String> linhas;
    private final CadernoAdapter cadernoAdapter;

    public Caderno() {
        linhas = new HashMap<>();
        cadernoAdapter = new CadernoAdapter(this);
    }

    public void addLinha(String linha) {
        var ultimaLinha = linhas.size() + 1;
        linhas.put(ultimaLinha, linha);
    }

    public void addLinhas(List<String> linhas) {
        cadernoAdapter.addLinhas(linhas);
    }

    public HashMap<Integer, String> getLinhas() {
        return linhas;
    }
}
