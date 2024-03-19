package rh;

public class Assistente extends Funcionario{
    private float horaExtra;
    public Assistente(){
        super(); // chama construtor da classe Pai
    }

    public Assistente(String nome, String endereco, String cpf,
                      float salario, float horaExtra) {
        // chama construtor da classe Pai
        super(nome, endereco, cpf, salario);
        this.horaExtra = horaExtra;
    }
}
