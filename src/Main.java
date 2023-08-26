import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {

        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite o nome da unidade");
        String unidade = leitura.nextLine();
        Area proc = new Area(unidade);

        int sair = 1;
        while (sair != 0){
            System.out.println("Digite o processso");
            String processo = leitura.next();

            System.out.println("Digite a data da última cobrança dd/MM/yyyy");
            String data = leitura.next();

            SimpleDateFormat formata = new SimpleDateFormat("dd/MM/yyyy");
            Date date = formata.parse(data);

            Processo proce = new Processo(processo, date);

            boolean processoLancado = proc.lancaProcesso(proce);

            if (processoLancado) {
                System.out.println("Processo lançado!");
                System.out.println("Digite 0 para sair ou 1 para adicionar mais processos");
                sair = leitura.nextInt();
            }
        }
        System.out.println("*************************");
        System.out.println(proc.getUnidade() + " - PROCESSOS LANÇADOS:\n");
        System.out.println("Processo" + " - " + "Data da última cobrança");
        Collections.sort(proc.getProcessos());

        for (Processo p : proc.getProcessos()) {
            System.out.println(p.getProcesso() + " - " + p.getData());
        }
        System.out.println("\n***********************");

    }
}