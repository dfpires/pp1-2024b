package main;
import cliente.Cliente;
public class TestaCliente {
    public static void main(String args[]) {
        Cliente obj1 = new Cliente();
        Cliente obj2 =
                new Cliente("123456-8", "1234-6", "Fulano", 0);
        obj2.depositar(4000);
        obj2.sacar(3000);
        System.out.println(obj2.toString());
    }
}
