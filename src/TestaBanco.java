public class TestaBanco {
    public static void main(String[] args) {
        Cliente primeiroCliente = new Cliente();
        primeiroCliente.nome = "Caio Tracera";
        primeiroCliente.cpf = "222.222.222-22";
        primeiroCliente.profissao = "Programador";

        Conta contaDoCaio = new Conta();
        contaDoCaio.deposita(100);
        contaDoCaio.titular = primeiroCliente;

        System.out.println(contaDoCaio.titular.nome);
    }
}
