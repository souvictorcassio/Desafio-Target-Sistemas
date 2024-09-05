public class Desafio4 {
    public static void main(String[] args) {
        double sp = 67836.43, rj = 36678.66, mg = 29229.88, es = 27165.48, outrosEstados = 19849.53, faturamentoTotal;
        double spPorCento, rjPorCento, mgPorCento, esPorCento, outrosPorCento;

        faturamentoTotal = sp + rj + mg + es + outrosEstados;
        
        spPorCento = (sp/faturamentoTotal)*100;
        rjPorCento = (rj/faturamentoTotal)*100;
        mgPorCento = (mg/faturamentoTotal)*100;
        esPorCento = (es/faturamentoTotal)*100;
        outrosPorCento = (outrosEstados/faturamentoTotal)*100;

        System.out.println("=================================================");
        System.out.println("Valor do faturamento total dos estados: " + faturamentoTotal);
        System.out.println("=================================================");
        System.out.printf("São paulo contribuiu com %.2f%%\n", spPorCento);
        System.out.printf("Rio de janeiro contribuiu com %.2f%%\n", rjPorCento);
        System.out.printf("Minas gerais contribuiu com %.2f%%\n", mgPorCento);
        System.out.printf("Espírito santo contribuiu com %.2f%%\n", esPorCento);
        System.out.printf("Demais estados contribuiram com %.2f%%\n", outrosPorCento);

    }
}
