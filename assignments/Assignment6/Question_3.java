package Assignment6;

import java.util.Arrays;
import java.util.HashMap;

/*      Given two strings s and t , write a function to determine if t is an anagram of s.

        Example 1:

        Input: s = "anagram", t = "nagaram"
        Output: true
        Example 2:

        Input: s = "rat", t = "car"
        Output: false
        Note:
        You may assume the string contains only lowercase alphabets.

        Follow up:
        What if the inputs contain unicode characters? How would you adapt your solution to such case?

 */

public class Question_3 {

    public boolean isAnagram(String s, String t) {

        HashMap<Character,Integer> map=new HashMap<>();

        if (s.length() != t.length()) {
            return false;
        }
        /*
        To examine if t is a rearrangement of s, we can count occurrences of each letter in the two strings and compare
        them.
        Do we need two counter tables for comparison? No.
        Because we could increment the counter for each letter in s and decrement the counter for each letter in t,
        then check if the counter reaches back to zero.
         */
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0) + 1); //increment counter for s
            map.put(t.charAt(i),map.getOrDefault(t.charAt(i),0) - 1); //decrement counter for t
        }

        /* map.keySet():
         The java.util.HashMap.keySet() method in Java is used to create a set out of the key elements contained in
         the hash map. It basically returns a set view of the keys or we can create a new set and store the key
         elements in them.
         */
        for (char c : map.keySet()) {
            //after increment the counter in s and decrement the counter in t, the counter should reach back to zero
            //since their occurrences should be the same. The only difference between s and t is their order, but their
            //occurrence should be the same
            if (map.get(c) != 0) {
                return false;
            }
        }
        return true;
    }

    //another solution that works but I think the above solution with the HashMap is more relevant to what we have been
    //taught in class 6
    public boolean isAnagram2(String s, String t) {
     if (s.length() != t.length()) {
         return false;
     }

     char[] str1 = s.toCharArray();
     char[] str2 = t.toCharArray();

     //Arrays.sort(): to sort a subArray if arr[]
     Arrays.sort(str1);
     Arrays.sort(str2);

     return Arrays.equals(str1, str2);
    }

}
