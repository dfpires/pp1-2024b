package exe0;
public class AtletaFV implements JogadorVolei, JogadorFutebol{
    @Override
    public void baterPenalti() {
        System.out.println("AtletaFV bateu pênalti");
    }
    @Override
    public void baterEscanteio() {
        System.out.println("AtletaFV bateu escanteio");
    }
    @Override
    public void sacar() {
        System.out.println("AtletaFV sacou");
    }
    @Override
    public void cortar() {
        System.out.println("AtletaFV cortou");
    }
}
