import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Desafio3 {

    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("src/dados.json");
            JSONTokener tokener = new JSONTokener(fis);
            JSONArray faturamentoMensal = new JSONArray(tokener);

            double[] faturamentos = new double[faturamentoMensal.length()];

            for (int i = 0; i < faturamentoMensal.length(); i++) {
                JSONObject dia = faturamentoMensal.getJSONObject(i);
                faturamentos[i] = dia.getDouble("valor");
            }

            double menorFaturamento = Double.MAX_VALUE;
            double maiorFaturamento = Double.MIN_VALUE;
            double somaFaturamento = 0;
            int diasComFaturamento = 0;

            for (double valor : faturamentos) {
                if (valor > 0) {
                    if (valor < menorFaturamento) {
                        menorFaturamento = valor;
                    }
                    if (valor > maiorFaturamento) {
                        maiorFaturamento = valor;
                    }
                    somaFaturamento += valor;
                    diasComFaturamento++;
                }
            }

            double mediaMensal = somaFaturamento / diasComFaturamento;

            int diasAcimaDaMedia = 0;
            for (double valor : faturamentos) {
                if (valor > 0 && valor > mediaMensal) {
                    diasAcimaDaMedia++;
                }
            }

            System.out.printf("Menor faturamento: R$%.2f\n", menorFaturamento);
            System.out.printf("Maior faturamento: R$%.2f\n", maiorFaturamento);
            System.out.println("Dias com faturamento acima da média: " + diasAcimaDaMedia);

        } catch (FileNotFoundException e) {
            System.out.println("Arquivo JSON não encontrado: " + e.getMessage());
        }
    }
}