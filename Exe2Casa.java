public class Exe2Casa extends Exe2Moradia{
    private float quintal;

    public Exe2Casa() {
        this.quintal = quintal;
    }
    public Exe2Casa(String endereco, float quintal) {
        super(endereco);
        this.quintal = quintal;
    }

    public float getQuintal() {
        return quintal;
    }

    public void setQuintal(float quintal) {
        this.quintal = quintal;
    }

    @Override
    public String toString() {
        return "Exe2Casa{" +
                "quintal=" + quintal +
                super.toString() +
                '}';
    }
}
