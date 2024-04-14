package exe4;

public class Tesoura extends Coisa{
    @Override
    public String quemSouEu() {
        return "Tesoura";
    }

    @Override
    public void compara(Coisa c) {
        if (c.quemSouEu().equals("Tesoura")){
            System.out.println("Houve empate");
        }
        else if (c.quemSouEu().equals("Papel")){
            System.out.println("Tesoura ganha Papel");
        }
        else if (c.quemSouEu().equals("Pedra")){
            System.out.println("Tesoura perde Pedra");
        }
        else {
            System.out.println("Impossível calcular");
        }
    }
}
