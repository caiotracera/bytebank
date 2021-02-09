public class TestaBanco {
    public static void main(String[] args) {
        Conta contaDoCaio = new Conta();

        contaDoCaio.titular = new Cliente();
        contaDoCaio.titular.nome = "Caio Tracera";
        contaDoCaio.titular.cpf = "222.222.222-22";
        contaDoCaio.titular.profissao = "Programador";
        contaDoCaio.deposita(100);

        System.out.println(contaDoCaio.titular.nome);
    }
}
