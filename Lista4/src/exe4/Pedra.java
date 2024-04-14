package exe4;

public class Pedra extends Coisa {
    @Override
    public String quemSouEu() {
        return "Pedra";
    }

    @Override
    public void compara(Coisa c) {
        if (c.quemSouEu().equals("Pedra")){
            System.out.println("Houve empate");
        }
        else if (c.quemSouEu().equals("Papel")){
            System.out.println("Pedra perde Papel");
        }
        else if (c.quemSouEu().equals("Tesoura")){
            System.out.println("Pedra ganha Tesoura");
        }
        else {
            System.out.println("Impossível calcular");
        }
    }
}
