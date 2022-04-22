public class Cliente {

    private String nome;
    private String cpf;
    private String profissao;

    //Retorna o nome do titular
    public String getNome() {
        System.out.println("O nome do cliente é " + nome + ".");
        return nome;
    }
    //Atribui um nome ao titular
    public void setNome(String nome) {
        System.out.println("Novo nome atribuido com sucesso.");
        this.nome = nome;
    }

    //Retorna o CPF do titular
    public String getCpf() {
        System.out.println("O cpf do cliente é " + cpf + ".");
        return cpf;
    }

    //Atribui um CPF ao titular
    public void setCpf(String cpf) {
        System.out.println("Novo CPF cadastrado " + cpf + ".");
        this.cpf = cpf;
    }

    //Retorna a profissão do titular
    public String getProfissao() {
        System.out.println("A profissão do cliente é " + profissao + ".");
        return profissao;
    }

    //Atribui uma profissão ao titular
    public void setProfissao(String profissao) {
        System.out.println("Nova profissão cadastrada " + profissao + ".");
        this.profissao = profissao;
    }

}