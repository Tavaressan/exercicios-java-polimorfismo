package Models.RelogioModels;

public non-sealed class RelogioBrasileiro extends Relogio {
    public String formataRelogio(String relogio) {
        String[] partes = relogio.split(":");
        hora = Integer.parseInt(partes[0]);
        this.minuto = Integer.parseInt(partes[1]);
        this.segundo = Integer.parseInt(partes[2]);
        return retornaHora(hora, minuto, segundo);
    }
}
