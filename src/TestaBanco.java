public class TestaBanco {
    public static void main(String[] args) {
        Conta contaDoCaio = new Conta(2, 25);

        contaDoCaio.titular = new Cliente("Caio Tracera", "222.222.222-22" );
        contaDoCaio.titular.setProfissao("Programador");
        contaDoCaio.deposita(100);

        System.out.println(contaDoCaio.titular.getNome());
    }
}
