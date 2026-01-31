import java.util.ArrayList;
import java.util.List;

public class Meal {
    private List<Item>items = new ArrayList<>();

    public void addItem(Item item){
        items.add(item);
    }
    public void showItem(){
        for(Item item:items){
            System.out.println("Meal Name : "+ item.name());
            System.out.println("Packed by "+item.packing().pack());
            System.out.println("Price: "+item.price());
        }
    }
    public float getCost(){
        float cost = 0.0f;
        for(Item item: items){
            cost+=item.price();
        }
        return cost;
    }
}
