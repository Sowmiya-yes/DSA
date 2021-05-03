import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

final class StrImmutabl {
    private final int id;
    private final String name;
    private final HashMap<Integer, String> map;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

//    public HashMap<Integer, String> getMap() {
//        return (HashMap<Integer, String>) map.clone();
//    }

    public HashMap<Integer, String> getMap() {
        return map;
    }


//    public StrImmutabl(int id, String name, HashMap<Integer, String> map) {
//        this.id = id;
//        this.name = name;
//        Iterator<Integer> keys = map.keySet().iterator();
//        HashMap<Integer, String> newMap = new HashMap<>();
//        while(keys.hasNext()) {
//            Integer key = keys.next();
//            newMap.put(key, map.get(key));
//        }
//        this.map = newMap;
//    }


    public StrImmutabl(int id, String name, HashMap<Integer, String> map) {
        this.id = id;
        this.name = name;
        this.map = map;
    }
}

class StrImmutable {
    public static void main(String[] args) {
        int id = 10;
        String name = "name";
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "name");
        StrImmutabl strImmutable = new StrImmutabl(id, name, map);
        System.out.println(strImmutable.getId());
        System.out.println(strImmutable.getName());
        System.out.println(strImmutable.getMap());
        System.out.println(strImmutable.getName() == name);
        System.out.println(strImmutable.getMap() == map);
        id = 20;
        name = "name 2";
        map.put(2, "name 2");
        System.out.println(strImmutable.getId());
        System.out.println(strImmutable.getName());
        System.out.println(strImmutable.getMap());

        strImmutable.getMap().put(3, "name 3");
        System.out.println(strImmutable.getMap());

        System.out.println(name.concat("szd")); // new string created
        System.out.println(name);

        System.out.println(new String());  // empty string
    }
}
