import rh.*;

public class Main {
    public static void exibeDados(Funcionario camaleao){
      System.out.println(camaleao.toString());
      System.out.println("Salário final " + camaleao.calculaSalario());
    }
    public static void main(String[] args) {
      Assistente as1 =
new Assistente("João", "Franca", "123", 3000, 10);
      exibeDados(as1);
      Gerente ge1 =
new Gerente("José", "Franca", "456", 5000, 2000);
        exibeDados(ge1);
      Diretor di1 =
new Diretor("Pedro", "Franca", "789", 10000, 1000);
        exibeDados(di1);
    }
}