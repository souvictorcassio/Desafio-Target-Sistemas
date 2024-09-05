import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Desafio3 {

    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("src/faturamento.json");
            JSONTokener tokener = new JSONTokener(fis);
            JSONObject jsonObject = new JSONObject(tokener);
            
            JSONArray vendasDiarias = jsonObject.getJSONArray("vendasDiarias");
            
            ArrayList<Double> faturamentos = new ArrayList<>();
            double somaFaturamento = 0;
            int diasComFaturamento = 0;

            double menorFaturamento = Double.MAX_VALUE;
            double maiorFaturamento = Double.MIN_VALUE;
            
            for (int i = 0; i < vendasDiarias.length(); i++) {
                JSONObject dia = vendasDiarias.getJSONObject(i);
                double faturamento = dia.getDouble("faturamento");
                
                if (faturamento > 0) {
                    faturamentos.add(faturamento);
                    somaFaturamento += faturamento;
                    diasComFaturamento++;

                    if (faturamento < menorFaturamento) {
                        menorFaturamento = faturamento;
                    }
                    if (faturamento > maiorFaturamento) {
                        maiorFaturamento = faturamento;
                    }
                }
            }
            
            double mediaFaturamento = somaFaturamento / diasComFaturamento;
            
            int diasAcimaDaMedia = 0;
            for (double faturamento : faturamentos) {
                if (faturamento > mediaFaturamento) {
                    diasAcimaDaMedia++;
                }
            }
            
            System.out.println("Menor faturamento diário: " + menorFaturamento);
            System.out.println("Maior faturamento diário: " + maiorFaturamento);
            System.out.println("Média de faturamento mensal: " + mediaFaturamento);
            System.out.println("Número de dias com faturamento acima da média: " + diasAcimaDaMedia);
            
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

