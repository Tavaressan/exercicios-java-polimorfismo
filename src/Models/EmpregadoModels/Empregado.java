package Models.EmpregadoModels;

import java.util.Objects;

public abstract sealed class Empregado permits Gerente, Vendedor, Atendente {
    protected String nome;
    protected String email;
    protected String senha;
    protected boolean eAdministrador;
    private boolean emailIgual;
    private boolean senhaIgual;

    public Empregado(String nome,
                     boolean eAdministrador,
                     String email,
                     String senha) {
        this.nome = nome;
        this.eAdministrador = eAdministrador;
        this.senha = senha;
        this.email = email;
    }

    public Empregado() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean iseAdministrador() {
        return eAdministrador;
    }

    public void seteAdministrador(boolean eAdministrador) {
        this.eAdministrador = eAdministrador;
    }

    @Override
    public String toString() {
        return String.format(
                "Nome: %s\nE-mail: %s\n%s",
                nome,
                email,
                eAdministrador ? "É administrador" : "Não é administrador");
    }

    public String realizarLogin(String emailInserido, String senhaInserida) {
        emailIgual = Objects.equals(emailInserido, this.email);
        senhaIgual = Objects.equals(senhaInserida, this.senha);
        return (emailIgual && senhaIgual) ? "Acesso permitido!" : "Acesso negado";
    }

    public String realizarLogoff() {
        boolean loginRealizado = emailIgual && senhaIgual;
        return (loginRealizado) ? "Logoff feito com sucesso" : "Você não está logado";
    }

    public void alterarDados(String nome,
                             boolean eAdministrador,
                             String email,
                             String senha) {
        setNome(nome);
        seteAdministrador(eAdministrador);
        setEmail(email);
        setSenha(senha);
    }

    /**
     * Altera a senha do empregado.
     *
     * @param senhaAntiga A senha atual do empregado
     * @param senhaNova   A nova senha desejada
     */
    public void alterarSenha(String senhaAntiga, String senhaNova) {
        senhaIgual = Objects.equals(senhaAntiga, this.senha);
        if (senhaIgual) senha = senhaNova;
        else System.out.println("A senha antiga não corresponde com sua senha original. Tente novamente.");
    }
}

