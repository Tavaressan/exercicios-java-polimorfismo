package Models.IngressoModels;

public sealed class Ingresso permits IngressoFamilia, IngressoMeiaEntrada {
    protected String nomeFilme;
    protected double valor;
    protected boolean dubladoOuLegendado;

    public Ingresso(String nomeFilme, double valor, boolean dubladoOuLegendado) {
        this.nomeFilme = nomeFilme;
        this.valor = valor;
        this.dubladoOuLegendado = dubladoOuLegendado;
    }

    public Ingresso() {

    }

    public String getNomeFilme() {
        return nomeFilme;
    }

    public void setNomeFilme(String nomeFilme) {
        this.nomeFilme = nomeFilme;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getDubladoOuLegendado() {
        var mensagem = dubladoOuLegendado ? "Dublado" : "Legendado";
        return mensagem;
    }

    public void setDubladoOuLegendado(boolean dubladoOuLegendado) {
        this.dubladoOuLegendado = dubladoOuLegendado;
    }

    @Override
    public String toString() {
        return String.format(
                "Filme: %s\nValor: R$ %.2f\n%s",
                nomeFilme,
                valor,
                dubladoOuLegendado ? "Dublado" : "Legendado"
        );
    }
}
