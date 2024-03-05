package cliente;
public class Cliente {
    private String nroConta, nroAgencia, nome;
    private float saldo;
    public Cliente() {
    }
    public Cliente(String nroConta, String nroAgencia, String nome, float saldo) {
        this.setNroConta(nroConta);
        this.setNroAgencia(nroAgencia);
        this.setNome(nome);
        this.setSaldo(saldo);
    }
    public void setNroConta(String nroConta) {
        if (nroConta.length() == 8 && nroConta.charAt(6) == '-') {
            this.nroConta = nroConta;
        }
        else {
            System.out.println("Nro conta inválido");
        }
    }
    public void setNroAgencia(String nroAgencia) {
        if (nroAgencia.length() == 6 && nroAgencia.charAt(4) == '-') {
            this.nroAgencia = nroAgencia;
        }
        else {
            System.out.println("Nro agência inválido");
        }
    }
    public void setNome(String nome) {
        if (nome.length() <= 30){
            this.nome = nome;
        }
        else {
            System.out.println("Nome inválido");
        }
    }
    public void setSaldo(float saldo) {
        if (saldo >= 0){
            this.saldo = saldo;
        }
        else {
            System.out.println("Saldo não pode ficar negativo");
        }
    }
    public void sacar(float x){
        this.setSaldo(this.saldo - x);
    }
    public void depositar(float x){
        this.setSaldo(this.saldo + x);
    }

    public String getNroConta() {
        return nroConta;
    }

    public String getNroAgencia() {
        return nroAgencia;
    }

    public String getNome() {
        return nome;
    }

    public float getSaldo() {
        return saldo;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nroConta='" + nroConta + '\'' +
                ", nroAgencia='" + nroAgencia + '\'' +
                ", nome='" + nome + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
