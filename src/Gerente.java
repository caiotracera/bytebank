public class Gerente extends Funcionario {
    private int senha;

    public Gerente(String nome, String cpf, double salario) {
        super(nome, cpf, salario);
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public double getBonificacao() {
        return super.getSalario();
    }

    public boolean autentica(int senha) {
        if (this.senha == senha) {
            return true;
        }
        return false;
    }
}
