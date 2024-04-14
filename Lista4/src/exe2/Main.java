package exe2;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String args[]){
        List<CartaoWeb> cartoes = new ArrayList<CartaoWeb>();
        cartoes.add(new Aniversario("Pedro"));
        cartoes.add(new Namorados("João"));
        cartoes.add(new Natal("Maria"));

        for( CartaoWeb item: cartoes){
            item.showMessage();// polimorfismo
        }
    }
}
