package Models.EmpregadoModels;

import java.util.Objects;

public non-sealed class Gerente extends Empregado {

    public Gerente(String nome,
                   boolean eAdministrador,
                   String email,
                   String senha) {
        super(nome, eAdministrador, senha, email);
    }

    public Gerente() {
    }

    @Override
    public void seteAdministrador(boolean eAdministrador) {
        this.eAdministrador = true;
        super.seteAdministrador(eAdministrador);
    }

    @Override
    public String toString() {
        return String.format(
                "Nome: %s\nE-mail: %s\n%s",
                nome,
                email,
                eAdministrador ? "É administrador" : "Não é administrador");
    }


    public String gerarRelatorioFinanceiro (Vendedor vendedor, Atendente atendente) {
        int quantidadeVendas = vendedor.getQuantidadeVendas();
        double valorEmCaixa = atendente.getValorEmCaixa();

        return String.format(
                "\n<===Relatório Financeiro==> \n Quantidade de vendas: %d \n Valor em Caixa: R$ %.2f \n<=========================>\n", quantidadeVendas, valorEmCaixa);
    }

    public String consultarVendas (Vendedor vendedor) {
        int quantidadeVendas = vendedor.getQuantidadeVendas();

        return String.format(
                "<===Consulta de Vendas==> \n Quantidade de vendas: %d \n <=======================>\n", quantidadeVendas);
    }
}

