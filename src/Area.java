import java.util.ArrayList;
import java.util.List;

public class Area {
    private String unidade;
    private List<Processo> processos;

    public Area(String unidade) {
        this.unidade = unidade;
        this.processos = new ArrayList<Processo>();
    }


    public boolean lancaProcesso(Processo process){
        this.processos.add(process);
        return true;
    }

    public String getUnidade() {
        return unidade;
    }

    public List<Processo> getProcessos() {
        return processos;
    }
}
