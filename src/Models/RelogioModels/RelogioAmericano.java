package Models.RelogioModels;

public non-sealed class RelogioAmericano extends Relogio {
    @Override
    public void setHora(int hora) {
        if (hora < 12 && hora > 0) super.setHora(hora);
        else System.out.println("Insira uma hora válida para o padrão norte-americano (0 A.M até 12 P.M. ).");
    }

    @Override
    public String formataRelogio() {
        String periodo = hora >= 12 ? "PM" : "AM";
        int horaFormatada = hora > 12 ? hora - 12 : hora;
        return String.format("%02d:%02d:%02d %s", horaFormatada, minuto, segundo, periodo);
    }
}
