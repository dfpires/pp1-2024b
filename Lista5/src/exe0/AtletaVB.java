package exe0;

public class AtletaVB implements JogadorVolei, JogadorBasquete{
    @Override
    public void baterLanceLivre() {
        System.out.println("AtletaVB bateu lance livre");
    }

    @Override
    public void fazerBandeja() {
        System.out.println("AtletaVB fez bandeja");
    }

    @Override
    public void sacar() {
        System.out.println("AtletaVB sacou");
    }

    @Override
    public void cortar() {
        System.out.println("AtletaVB cortou");
    }
}
