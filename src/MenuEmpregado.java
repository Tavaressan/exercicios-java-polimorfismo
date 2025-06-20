import Models.EmpregadoModels.*;

public class MenuEmpregado {
    public static void main(String[] args) {
//        Gerente gerente = new Gerente("Carlos", false, "senha123", "carlos@mail.com");
//        Vendedor vendedor = new Vendedor("Vânia", true, "senha!", "vania@mail.com", 10);
//        Atendente atendente = new Atendente("Ana", true, "senha@", "ana@mail.com", 5000);
//
//        var e1 = gerente.toString();
//        var e2 = vendedor.toString();
//        var e3 = atendente.toString();
//
//        System.out.println(e1);
//        System.out.println("<================>\n");
//        System.out.println(e2);
//        System.out.println("<================>\n");
//        System.out.println(e3);
//        System.out.println("<================>\n");
//
        imprimeEmpregado(new Gerente());
        imprimeEmpregado(new Vendedor());
        imprimeEmpregado(new Atendente());
    }

    public static void imprimeEmpregado(Empregado empregado) {
        Gerente gerente1 = new Gerente("Carlos", false, "senha123", "carlos@mail.com");
        Vendedor vendedor1 = new Vendedor("Vânia", true, "senha!", "vania@mail.com", 10);
        Atendente atendente1 = new Atendente("Ana", true, "senha@", "ana@mail.com", 5000);
        System.out.printf("<=======%s=======>\n", empregado.getClass().getCanonicalName());
        switch (empregado) {
            case Atendente atendente -> {
                atendente.setNome("Ana");
                atendente.setEmail("ana@mail.com");
                atendente.setSenha("senha@");
                atendente.seteAdministrador(false);
                atendente.receberPagamento(2000);
                atendente.realizarLogin("ana@mail.com", "senha@" );
                atendente.realizarLogoff();
                atendente.alterarSenha("senha@","senha#");

                System.out.println(atendente.getNome());
                System.out.println(atendente.getEmail());
                System.out.println(atendente.getSenha());
                System.out.println(atendente.iseAdministrador());
                System.out.println(atendente.getValorEmCaixa());
            }
            case Vendedor vendedor -> {
                vendedor.setNome("Vânia");
                vendedor.setEmail("vania@mail.com");
                vendedor.setSenha("senha!");
                vendedor.seteAdministrador(false);
                vendedor.setQuantidadeVendas(10);
                vendedor.consultarVendas(vendedor);
                vendedor.alterarDados("Vanilda", true, "vanilda@mai.com", "nomenovo", 15);

                System.out.println(vendedor.getNome());
                System.out.println(vendedor.getEmail());
                System.out.println(vendedor.getSenha());
                System.out.println(vendedor.iseAdministrador());
                System.out.println(vendedor.getQuantidadeVendas());
            }
            case Gerente gerente -> {
                gerente.setNome("Carlos");
                gerente.setEmail("carlos@mail.com");
                gerente.setSenha("senha123");
                gerente.seteAdministrador(true);


                System.out.println(gerente.getNome());
                System.out.println(gerente.getEmail());
                System.out.println(gerente.getSenha());
                System.out.println(gerente.iseAdministrador());
                System.out.println(gerente.gerarRelatorioFinanceiro(vendedor1, atendente1));
                System.out.println(gerente.consultarVendas(vendedor1));
            }
        }
        System.out.println("<================>\n");
    }
}
