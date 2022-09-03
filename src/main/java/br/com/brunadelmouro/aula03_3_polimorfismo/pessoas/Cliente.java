package br.com.brunadelmouro.aula03_3_polimorfismo.pessoas;

public class Cliente extends Pessoa {

    public Cliente(final String nome, final String cpf, final Double saldo) {
        super(nome, cpf, saldo);
    }

    public void descontaSaldo(Double valorLavagem, String veiculo){
        this.saldo -= valorLavagem;
        System.out.println("Cliente " + this.getNome() + " lavou seu " + veiculo.substring(58) + " e seu saldo atual é de: " + this.saldo);
    }
}
