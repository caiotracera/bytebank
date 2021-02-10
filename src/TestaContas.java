public class TestaContas {
    public static void main(String[] args) {
        Conta cc = new ContaCorrente(111,111);
        cc.deposita(100);

        Conta cp = new ContaPoupanca(222,222);
        cp.deposita(200);

        cc.transfere(10, cp);
        System.out.println(cc.getSaldo() + " / " + cp.getSaldo());
    }
}
