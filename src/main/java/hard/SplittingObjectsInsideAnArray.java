package hard;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class SplittingObjectsInsideAnArray {

    public static List<Fruit> splitBunches(List<Fruit> bunches) {
        List<Fruit> result = new ArrayList<>();
        for(Fruit fruit: bunches){
            int quantity = fruit.getQuantity();
            if(quantity>1){
                fruit.setQuantity(1);
                for(int i=0;i<quantity;i++){
                    result.add(fruit);
                }
            }else{
                result.add(fruit);
            }
        }
        return result;
    }


    @Test
    public void test01() {
        List<Fruit> b = new ArrayList<Fruit>();
        b.add(new Fruit("bananas", 1));
        List<Fruit> r = new ArrayList<Fruit>();
        b.forEach((f) -> { for(int i = 0; i < f.getQuantity(); i++) r.add(new Fruit(f.getName(), 1)); });
        assertEquals(r.toString(), splitBunches(b).toString());
    }

    @Test
    public void test02() {
        List<Fruit> b = new ArrayList<Fruit>();
        b.add(new Fruit("bananas", 2));
        List<Fruit> r = new ArrayList<Fruit>();
        b.forEach((f) -> { for(int i = 0; i < f.getQuantity(); i++) r.add(new Fruit(f.getName(), 1)); });
        assertEquals(r.toString(), splitBunches(b).toString());
    }

    @Test
    public void test03() {
        List<Fruit> b = new ArrayList<Fruit>();
        String[] fruit = new String[] {"bananas", "grapes"};
        int[] quantity = new int[] {2, 2};
        for(int i = 0; i < fruit.length; i++) b.add(new Fruit(fruit[i], quantity[i]));
        List<Fruit> r = new ArrayList<Fruit>();
        b.forEach((f) -> { for(int i = 0; i < f.getQuantity(); i++) r.add(new Fruit(f.getName(), 1)); });
        assertEquals(r.toString(), splitBunches(b).toString());
    }

    @Test
    public void test04() {
        List<Fruit> b = new ArrayList<Fruit>();
        String[] fruit = new String[] {"cherry tomatoes", "bananas", "grapes", "cherry tomatoes"};
        int[] quantity = new int[] {2, 1, 2, 3};
        for(int i = 0; i < fruit.length; i++) b.add(new Fruit(fruit[i], quantity[i]));
        List<Fruit> r = new ArrayList<Fruit>();
        b.forEach((f) -> { for(int i = 0; i < f.getQuantity(); i++) r.add(new Fruit(f.getName(), 1)); });
        assertEquals(r.toString(), splitBunches(b).toString());
    }



}

class Fruit {
    private String name;
    private int quantity;

    public Fruit(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getName() {
        return this.name;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public String toString() {
        return String.format("{name: %s, quantity: %d}", this.name, this.quantity);
    }
}