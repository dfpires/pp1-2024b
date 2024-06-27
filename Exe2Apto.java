public class Exe2Apto extends Exe2Moradia{
    private int nro;
    public Exe2Apto(){
        super();
    }

    public Exe2Apto(String endereco, int nro) {
        super(endereco);
        this.nro = nro;
    }

    public int getNro() {
        return nro;
    }

    public void setNro(int nro) {
        this.nro = nro;
    }

    @Override
    public String toString() {
        return "Exe2Apto{" +
                "nro=" + nro +
                super.toString() +
                '}';
    }
}
