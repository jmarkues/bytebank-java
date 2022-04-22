public class TestaCliente {
    public static void main(String[] args) {
        Conta conta = new Conta(300, 200);
        Cliente joao = new Cliente();

        joao.setNome("João Markues");
        joao.getNome();
        joao.setCpf("255.255.255-25");
        joao.setProfissao("Programador");
        joao.getCpf();
        joao.getProfissao();
        conta.setTitular(joao);
        conta.getTitular().getNome();

    }
}