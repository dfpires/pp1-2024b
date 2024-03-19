//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // crie três produtos, prod1, prod2 e prod3, com valores
        // quaisquer para suas variáveis
        Product prod1 = new Product(1, 6.5f, "Bolacha");
        Product prod2 = new Product(2, 2.5f, "Chiclete");
        Product prod3 = new Product(3, 12.0f, "Chocolate");
        // crie dois carrinhos de compra
        // o primeiro carrinho deve conter os itens de carrinho
        // relacionados aos produtos prod1 e prod2
        ShoppingCart shop1 = new ShoppingCart(100, 0);
        shop1.addCarItem(10, 10, prod1);
        shop1.addCarItem(11, 5, prod2);
        System.out.println(shop1.toString());

        // o segundo carrinho deve conter os itens de carrinho
        // relacionados aos produtos prod2 e prod3
        // os valores dos itens de carrinho e dos carrinhos podem
        // ter valores quaisquer


    }
}