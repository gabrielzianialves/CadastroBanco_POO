package classes;

public class Cliente extends Pessoa {
    private Conta conta; // instancia um objeto do tipo Conta associada ao cliente

    // construtor
    public Cliente(String nome, String endereco, String telefone, String cpf, Conta conta) {
        super(nome, endereco, telefone, cpf);
        this.conta = conta;
    }

    // get e set

    public Conta getConta() {
        return conta;
    }
    public void setConta(Conta conta) {
        this.conta = conta;
    }

}
