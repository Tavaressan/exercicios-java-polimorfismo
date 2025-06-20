package Models.IngressoModels;

public non-sealed class IngressoFamilia extends Ingresso {
    private int numeroPessoas;

    public IngressoFamilia(String nomeFilme,
                           double valor,
                           boolean dubladoOuLegendado,
                           int numeroPessoas) {
        super(nomeFilme, valor, dubladoOuLegendado);
        this.numeroPessoas = numeroPessoas;
        double desconto = valor * 0.05;
        this.valor = (valor * numeroPessoas) - desconto;
    }

    public IngressoFamilia() {

    }


    @Override
    public void setValor (double valor){
        if (numeroPessoas >= 3){
            double desconto = valor * 0.05;
            this.valor = (valor * this.numeroPessoas) - desconto;
            return;
        }
        super.setValor(valor);
    }

    public void setValor (double valor, int numeroPessoas){
        if (numeroPessoas >= 3){
            double desconto = valor * 0.05;
            this.valor = (valor * this.numeroPessoas) - desconto;
            return;
        }
        super.setValor(valor);
    }

    public int getNumeroPessoas() {
        return numeroPessoas;
    }

    public void setNumeroPessoas(int numeroPessoas) {
        this.numeroPessoas = numeroPessoas;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("\nQuantidade de pessoas: %d", numeroPessoas);
    }
}
