import Models.RelogioModels.Relogio;
import Models.RelogioModels.RelogioBrasileiro;
import Models.RelogioModels.RelogioAmericano;

public class MenuRelogio {
    public static void main(String[] args) {
        imprimeRelogio(new RelogioBrasileiro());
        imprimeRelogio(new RelogioAmericano());
    }

    public static void imprimeRelogio(Relogio relogio) {
        System.out.printf("<=======%s=======>\n", relogio.getClass().getCanonicalName());
        switch (relogio) {
            case RelogioBrasileiro relogioBrasileiro -> {
                relogioBrasileiro.setHora(14);
                relogioBrasileiro.setMinuto(30);
                relogioBrasileiro.setSegundo(45);

                System.out.println("Hora Atual:");
                System.out.println(relogioBrasileiro.retornaHora(
                    relogioBrasileiro.getHora(),
                    relogioBrasileiro.getMinuto(),
                    relogioBrasileiro.getSegundo()
                ));

                System.out.println("Hora Formatada:");
                System.out.println(relogioBrasileiro.formataRelogio("14:30:45"));
            }
            case RelogioAmericano relogioAmericano -> {
                relogioAmericano.setHora(10);
                relogioAmericano.setMinuto(15);
                relogioAmericano.setSegundo(30);

                System.out.println("Hora Atual (AM/PM):");
                System.out.println(relogioAmericano.retornaHora(
                    relogioAmericano.getHora(),
                    relogioAmericano.getMinuto(),
                    relogioAmericano.getSegundo()
                ));

                System.out.println("Hora Formatada:");
                System.out.println(relogioAmericano.formataRelogio());
            }
        }
        System.out.println("<================>\n");
    }
}
