import entities.Item;
import services.ItemServices;

public class MainApp {
    public static void main(String[] args) {
        ItemServices s = new ItemServices();
        System.out.println(s.findById(1).getName());

//        Item water = new Item(8,"Water",0);
//        s.update(water);
//        System.out.println(s.findById(8).getName());

        Item newItem = new Item("Brownie",2);
        s.create(newItem);


    }
}
