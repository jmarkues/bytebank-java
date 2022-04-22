public class Conta {
    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;

    private static int total;

    public Conta(int numero, int agencia) {
        this.numero = numero;
        this.agencia = agencia;
        System.out.println("Estou criando uma CONTA! " +
                "Agencia: " + agencia + " Número: " + numero);
        Conta.total++;
        System.out.println("O total de contas é de " + Conta.total);
    }

    //Deposita um determinado valor a conta bancária
    public void deposita(double valor) {
        this.saldo += valor;
        System.out.println("Depósito realizado com sucesso.");
    }

    //Saca um determinado valor da conta bancária
    public boolean saca(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            System.out.println("Saque realizado com sucesso.");
            return true;
        } else {
            System.out.println("Saldo insuficiente.");
            return false;
        }
    }

    //Transfere um determinado valor para outra conta bancária
    public boolean transfere(double valor, Conta destino) {
        if (saca(valor)) {
            destino.deposita(valor);
            System.out.println("Transferência efetuada com sucesso.");
            return true;

        }
        System.out.println("Saldo insuficiente.");
        return false;
    }

    //Retorna o saldo bancário
    public double getSaldo() {
        System.out.println("O sado é de R$ " + this.saldo + ".");
        return this.saldo;
    }

    //Retorna o número da conta bancária
    public int getNumero() {
        System.out.println("O número é " + this.numero + ".");
        return this.numero;
    }

    //Atribui um numero a conta bancária
    public void setNumero(int numero) {
        if (numero <= 0) {
            System.out.println("Não é permitido número menor ou igual a zero.");
            return;
        }
        this.numero = numero;
    }

    //Retorna a agencia da conta bancária
    public int getAgencia() {
        System.out.println("A agencia é " + this.agencia + ".");
        return this.agencia;
    }

    //Atribui uma agencia para a conta bancária
    public void setAgencia(int agencia) {
        if (agencia <= 0) {
            System.out.println("Não é permitido agencia menor ou igual a zero.");
            return;
        }
        this.agencia = agencia;
    }

    //Atribui um titular a conta
    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    //Retorna o Titular de uma determinada conta bancária
    public Cliente getTitular() {
        System.out.println("O titular dessa conta é " + titular + ".");
        return titular;
    }

    //Retorna a quantidade de contas criadas
    public static int getTotal() {
        return Conta.total;
    }
}