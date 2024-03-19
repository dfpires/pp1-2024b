package rh;
public class Diretor extends Funcionario{
    private int acoesEmpresa; // qtde de ações
    public Diretor() {
        super();
    }
    public Diretor(String nome, String endereco, String cpf, float salario, int acoesEmpresa) {
        super(nome, endereco, cpf, salario);
        this.setAcoesEmpresa(acoesEmpresa);
    }
    public int getAcoesEmpresa() {
        return acoesEmpresa;
    }
    public void setAcoesEmpresa(int acoesEmpresa) {
        this.acoesEmpresa = acoesEmpresa;
    }
    @Override
    public String toString() {
        return "Diretor{" +
                super.toString() + "acoesEmpresa=" + acoesEmpresa +
                '}';
    }
    @Override
    public float calculaSalario() {
        return super.calculaSalario() + ((this.acoesEmpresa * 2) / 12.0f);
    }
}
