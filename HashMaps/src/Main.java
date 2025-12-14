import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        map.put(4, "four");

        // map.remove(3);

        System.out.println(map);
        System.out.println(map.get(1)); // 1 is the key
        System.out.println(map.containsKey(1));

        if(map.containsValue("one")) {
            System.out.println(map.get(1));
        }
        else {
            System.out.println("Key not found");
        }

        System.out.println(map.containsValue("one"));

        System.out.println(map.size());
        for(int key : map.keySet()) {
            System.out.println(key + " is " + map.get(key));
        }
    }
}
