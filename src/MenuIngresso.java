import Models.IngressoModels.Ingresso;
import Models.IngressoModels.IngressoFamilia;
import Models.IngressoModels.IngressoMeiaEntrada;

public class MenuIngresso {

    public static void main(String[] args) {
        Ingresso ingresso = new Ingresso("Tarzan", 20, true);
        IngressoMeiaEntrada ingressoMeiaEntrada = new IngressoMeiaEntrada("Tarzan", 20, false, "1234");
        IngressoFamilia ingresoFamilia = new IngressoFamilia("Minecraft", 25, true, 4);

        var i1 = ingresso.toString();
        var i2 = ingressoMeiaEntrada.toString();
        var i3 = ingresoFamilia.toString();

        System.out.println(i1);
        System.out.println("<================>\n");
        System.out.println(i2);
        System.out.println("<================>\n");
        System.out.println(i3);


        imprimeIngresso(new Ingresso());
        imprimeIngresso(new IngressoFamilia());
        imprimeIngresso(new IngressoMeiaEntrada());
    }

    public static void imprimeIngresso(Ingresso ingresso) {
        System.out.printf("<=======%s=======>\n", ingresso.getClass().getCanonicalName());
        switch (ingresso){
            case IngressoFamilia ingressoFamilia -> {
            ingressoFamilia.setNomeFilme("Os Sem Florestas");
            ingressoFamilia.setNumeroPessoas(4);
            ingressoFamilia.setValor(20);
            ingressoFamilia.setDubladoOuLegendado(true);



            System.out.println(ingressoFamilia.getNomeFilme());
            System.out.println(ingressoFamilia.getValor());
            System.out.println(ingressoFamilia.getDubladoOuLegendado());
            System.out.println(ingressoFamilia.getNumeroPessoas());
            }
            case IngressoMeiaEntrada ingressoMeiaEntrada -> {
                ingressoMeiaEntrada.setNomeFilme("Barbie");
                ingressoMeiaEntrada.setValor(20);
                ingressoMeiaEntrada.setDubladoOuLegendado(true);
                ingressoMeiaEntrada.setCodigoMeiaEntrada("1234");


                System.out.println(ingressoMeiaEntrada.getNomeFilme());
                System.out.println(ingressoMeiaEntrada.getValor());
                System.out.println(ingressoMeiaEntrada.getDubladoOuLegendado());
                System.out.println(ingressoMeiaEntrada.getCodigoMeiaEntrada());
            }
            case Ingresso ingresso1 -> {
                ingresso1.setNomeFilme("Tarzan");
                ingresso1.setValor(20);
                ingresso1.setDubladoOuLegendado(false);


                System.out.println(ingresso1.getNomeFilme());
                System.out.println(ingresso1.getValor());
                System.out.println(ingresso1.getDubladoOuLegendado());
            }
        }
        System.out.println("<================>\n");
    }
}