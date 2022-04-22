public class TestaValores {
    public static void main(String[] args) {
        Conta conta = new Conta(255, 255);
        Conta conta2 = new Conta(215, 245);

        conta.deposita(1000);
        conta.saca(200);
        conta.transfere(200, conta2);
        conta.getSaldo();
        conta.getNumero();
        conta.getAgencia();

    }
}
