public class Exe2Testa {

    public static void polimorfismo(Exe2Moradia camaleao){
        System.out.println(camaleao.toString());

    }
    public static void main(String args[]){
        Exe2Apto apt = new Exe2Apto("Centro", 31);
        polimorfismo(apt);

        Exe2Casa cas = new Exe2Casa("estação", 120);
        polimorfismo(cas);
    }
}
