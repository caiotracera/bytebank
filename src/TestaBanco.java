public class TestaBanco {
    public static void main(String[] args) {
        Conta contaDoCaio = new Conta();

        contaDoCaio.titular = new Cliente();
        contaDoCaio.titular.setNome("Caio Tracera");
        contaDoCaio.titular.setCpf("222.222.222-22");
        contaDoCaio.titular.setProfissao("Programador");;
        contaDoCaio.deposita(100);

        System.out.println(contaDoCaio.titular.getNome());
    }
}
