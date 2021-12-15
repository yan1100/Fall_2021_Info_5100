package Q2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Q2 {
    public static void main(String[] args) {
        String[] sts1 = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(rearrangeAnagram(sts1));

        String[] sts2 = {""};
        System.out.println(rearrangeAnagram(sts2));

        String[] sts3 = {"a"};
        System.out.println(rearrangeAnagram(sts3));

    }
    public static List<List<String>> rearrangeAnagram(String[] strs) {
        HashMap<String, List> map = new HashMap<>();
        for (String s : strs) {
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            String key = String.valueOf(charArray);
            if (!map.containsKey(key)) {
                map.put(key,new ArrayList());
            }
            map.get(key).add(s);
        }
        return new ArrayList(map.values());
    }
}

