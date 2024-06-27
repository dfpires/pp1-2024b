public class Exe1Testa {

    public static void main(String args[]){
        Exe1Biblioteca biblio = new Exe1Biblioteca("Biblio A");
        biblio.adicionaLivro("Introdução a Java");
        System.out.println(biblio.toString());
    }
}
