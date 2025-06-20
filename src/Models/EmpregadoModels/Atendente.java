package Models.EmpregadoModels;

public non-sealed class Atendente extends Empregado {
    protected double valorEmCaixa;

    public Atendente(String nome,
                     boolean eAdministrador,
                     String senha,
                     String email,
                     double valorEmCaixa) {
        super(nome, eAdministrador, senha, email);
        this.eAdministrador = false;
        this.valorEmCaixa = valorEmCaixa;
    }

    public Atendente() {
    }

    public double getValorEmCaixa() {
        return valorEmCaixa;
    }

    public void setValorEmCaixa(double valorEmCaixa) {
        this.valorEmCaixa = valorEmCaixa;
    }

    @Override
    public void seteAdministrador(boolean eAdministrador) {
        this.eAdministrador = false;
        super.seteAdministrador(eAdministrador);
    }

    @Override
    public String toString() {
        return String.format(
                "\n Nome: %s\n E-mail: %s\n %s\n Valor em Caixa: R$ %.2f\n",
                nome,
                email,
                eAdministrador ? "É administrador" : "Não é administrador",
                valorEmCaixa
        );
    }


    public void alterarDados(String nome, boolean eAdministrador, String email, String senha, double valorEmCaixa) {
        super.alterarDados(nome, eAdministrador, email, senha);
        this.valorEmCaixa = valorEmCaixa;
    }

    public void receberPagamento(double valor) {
        valorEmCaixa += valor;
    }
}

