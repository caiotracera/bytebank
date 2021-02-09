public class TesteSacaNegativo {
    public static void main(String[] args) {
        Conta conta = new Conta(2, 25);
        conta.deposita(100);
        conta.saca(200);
    }
}
