package CollectionMap;

import java.util.*;

public class CollectionHashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        LinkedHashMap<Integer, String> linkedHashMap= new LinkedHashMap<>(16, 0.75f, true);
        Hashtable<String, Integer> hashtable= new Hashtable<>();
        WeakHashMap<String, Integer> weakHashMap = new WeakHashMap<>();
        IdentityHashMap<String, Integer> identityHashMap = new IdentityHashMap<>();
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        hashMap.put("FB", 1);
        hashMap.put("Ea", 2);

        hashMap.keySet().stream().forEach(n-> System.out.println(n.hashCode()));

        System.out.println(hashMap);
//        hashMap.entrySet().contains(1);


        linkedHashMap.put(1,"a");
        linkedHashMap.put(2,"b");
        linkedHashMap.put(3,"c");
        linkedHashMap.put(4,"d");
        linkedHashMap.put(5,"e");
        linkedHashMap.put(6,"f");
        System.out.println(linkedHashMap);

        linkedHashMap.get(1);
        linkedHashMap.get(3);

        System.out.println("linkedHAshMAp");
        System.out.println(linkedHashMap);


        System.out.println("------------Weak Hash Map------------");

        HashMap<Integer, String> hashMap1 = new HashMap<>();
        Integer key1=  Integer.valueOf(100);
        hashMap1.put(key1, "Hash Value");

        System.out.println(hashMap1);

        WeakHashMap<Integer, String> weakHashMap1 = new WeakHashMap<>();
        Integer key2= Integer.valueOf(200);
        weakHashMap1.put(key2, "weak hash map");

        System.out.println(weakHashMap1);

        key2=null;
        key1=null;


//        System.gc();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(hashMap1);
        System.out.println(weakHashMap1);

    }


}
