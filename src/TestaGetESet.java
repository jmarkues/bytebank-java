public class TestaGetESet {
    public static void main(String[] args) {

        Conta conta = new Conta(255, 222);
        conta.setNumero(275);
        System.out.println(conta.getNumero());
        conta.setAgencia(250);
        System.out.println(conta.getAgencia());

        Cliente paulo = new Cliente();
        paulo.setNome("Paulo Silvera");
        conta.setTitular(paulo);

        System.out.println(conta.getTitular().getNome());
    }
}