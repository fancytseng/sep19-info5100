package Assignment6;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Question_4 {
    /*  1.Count the occurrences of each char;
        2.Compare if the numbers of distinct chars and distinct counts are equal.
    */

    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();

        //use a key "a" to traverse in arr and see if we can see the key
        for (int a : arr)
            //put key "a", into the Map "map"
            //store a count "1" (1+0) if not seen the key before else
            //store a count "1 (the count of key itself) + how many times a appeared later when we traverse in the arr" (1 + count(a))
            map.put(a, 1 + map.getOrDefault(a, 0));

        //"map.size()" : size of distinct chars
        //"set.size()" : size of that distinct counts

        HashSet<Integer> set = new HashSet<>(map.values());
        return map.size() == set.size();
    }
}

/*
Map<K,V> is an interface, HashMap<K,V> is a class that implements Map . ... Map is an interface; HashMap is a
particular implementation of that interface. HashMap uses a collection of hashed key values to do its lookup.

Like List<> list = new ArrayList<>();
List is an interface
ArrayList is a class that implements List
https://stackoverflow.com/questions/9852831/polymorphism-why-use-list-list-new-arraylist-instead-of-arraylist-list-n
 */