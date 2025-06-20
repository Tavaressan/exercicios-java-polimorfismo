package Models.IngressoModels;

public non-sealed class IngressoMeiaEntrada extends Ingresso {

    private String codigoMeiaEntrada;

    public IngressoMeiaEntrada(String nomeFilme,
                               double valor,
                               boolean dubladoOuLegendado, String codigoMeiaEntrada) {
        super(nomeFilme, valor, dubladoOuLegendado);
        this.valor /= 2;
        this.codigoMeiaEntrada = codigoMeiaEntrada;
    }

    public IngressoMeiaEntrada() {

    }

    @Override
    public void setValor(double valor) {
        this.valor = valor / 2;
    }

    public String getCodigoMeiaEntrada() {
        return codigoMeiaEntrada;
    }

    public void setCodigoMeiaEntrada(String codigoMeiaEntrada) {
        this.codigoMeiaEntrada = codigoMeiaEntrada;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("\nCódigo Meia-Entrada: %s", codigoMeiaEntrada);
    }
}
