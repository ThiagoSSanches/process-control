
import java.util.Date;

public class Processo implements Comparable<Processo>{
    private String processo;
    private Date data;

    public Processo(String processo, Date data) {
        this.processo = processo;
        this.data = data;
    }

    public String getProcesso() {
        return processo;
    }

    public Date getData() {
        return data;
    }


    @Override
    public String toString() {
        return "Processos lançados{" +
                "processo='" + processo + '\'' +
                ", data da última cobrança=" + data +
                '}';
    }

    @Override
    public int compareTo(Processo outroProcesso) {
        return getData().compareTo(outroProcesso.getData());
    }
}
