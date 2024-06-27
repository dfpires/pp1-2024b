public abstract class Exe2Moradia {
    protected String endereco;
    public Exe2Moradia() {

    }
    public Exe2Moradia(String endereco) {
        this.endereco = endereco;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Exe2Moradia{" +
                "endereco='" + endereco + '\'' +
                '}';
    }
}
