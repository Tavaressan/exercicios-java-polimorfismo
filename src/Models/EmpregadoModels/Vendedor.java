package Models.EmpregadoModels;

public non-sealed class Vendedor extends Empregado {
    protected int quantidadeVendas;

    public Vendedor(String nome,
                    boolean eAdministrador,
                    String senha,
                    String email,
                    int quantidadeVendas) {
        super(nome, eAdministrador, senha, email);
        this.eAdministrador = false;
        this.quantidadeVendas = quantidadeVendas;
    }

    public Vendedor() {
    }

    public int getQuantidadeVendas() {
        return quantidadeVendas;
    }

    public void setQuantidadeVendas(int quantidadeVendas) {
        this.quantidadeVendas = quantidadeVendas;
    }

    @Override
    public void seteAdministrador(boolean eAdministrador) {
        this.eAdministrador = false;
        super.seteAdministrador(eAdministrador);
    }

    @Override
    public String toString() {
        return String.format(
                "Nome: %s\nE-mail: %s\n%s\nQuantidade de Vendas: %d",
                nome,
                email,
                eAdministrador ? "É administrador" : "Não é administrador",
                quantidadeVendas
        );
    }


    public void alterarDados(String nome, boolean eAdministrador, String email, String senha, int quantidadeVendas) {
        super.alterarDados(nome, eAdministrador, email, senha);
        this.quantidadeVendas = quantidadeVendas;
    }

    public String consultarVendas (Vendedor vendedor) {
        int quantidadeVendas = vendedor.getQuantidadeVendas();

        return String.format(
                "\n<===Consulta de Vendas==> \n Quantidade de vendas: %d \n <=========================>\n", quantidadeVendas);
    }
}

