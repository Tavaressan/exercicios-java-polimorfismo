package Models.RelogioModels;

import java.util.Objects;

public abstract sealed class Relogio permits RelogioBrasileiro, RelogioAmericano {
    protected int hora;
    protected int minuto;
    protected int segundo;

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        if (hora > 0 && hora < 24) {
            this.hora = hora;
        } else System.out.println("Insira uma hora válida.");

    }

    public int getSegundo() {
        return segundo;
    }

    public void setSegundo(int segundo) {
        if (segundo >= 0 && segundo < 60) {
            this.segundo = segundo;
        } else System.out.println("Insira um segundo válido.");
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        if (minuto > 0 && minuto < 59) {
            this.minuto = minuto;
        } else System.out.println("Insira um minuto válido.");
    }

    public String retornaHora (int hora, int minuto, int segundo) {
        return String.format("%02d:%02d:%02d", hora, minuto, segundo);
    }

    public String formataRelogio () {
        return "";
    }
}
