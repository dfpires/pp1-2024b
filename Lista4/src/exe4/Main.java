package exe4;

import javax.swing.*;
import java.util.Random;

public class Main {
    public static void main(String args[]){
        String user = JOptionPane.showInputDialog("Digite 1. Papel 2. Pedra 3. Tesoura");
        Coisa escolhaUsuario;
        switch(user){
            case "1": escolhaUsuario = new Papel(); break;
            case "2": escolhaUsuario = new Pedra(); break;
            case "3": escolhaUsuario = new Tesoura(); break;
            default: escolhaUsuario = new Papel();
                     System.out.println("Escolha inválida, você jogará com Papel");
        }
        // escolha do PC
        Random rand = new Random();
        int pc = rand.nextInt(3);
        Coisa escolhaPc;
        switch(pc){
            case 0:  escolhaPc = new Papel(); break;
            case 1:  escolhaPc = new Pedra(); break;
            default: escolhaPc = new Tesoura();
        }
        // joga
        escolhaUsuario.compara(escolhaPc);
    }
}
