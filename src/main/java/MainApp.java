import entities.*;
import services.*;

public class MainApp {
    public static void main(String[] args) {
        ItemServices is = new ItemServices();
        WitchServices ws = new WitchServices();
        ShopServices ss = new ShopServices();
        System.out.println(is.findById(Item.class, 1).getName());
        System.out.println(ws.findById(Witch.class, 1).getName());
        System.out.println(ss.findById(Shop.class, 1).getName());


    }
}
