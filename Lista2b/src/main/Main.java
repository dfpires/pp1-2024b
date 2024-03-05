//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
package main;
import produto.Produto;
public class Main {
    public static void main(String[] args) {

        Produto obj = new Produto();
        obj.setCodigo(10);
        obj.setCodigo(-5);
        obj.setQtde(30);
        obj.setQtde(-30);
        obj.setNota(40);
        obj.setNota(7);

        Produto obj2 = new Produto(10, 200, 9);

        Produto obj3 = new Produto(-10, -200, 200);
        System.out.println("Código " + obj3.getCodigo() +
                " Nota " + obj3.getNota());
    }
}