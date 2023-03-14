package Solutions.LeetCode75.Level1.Day2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class isomorphicStrings {

    public boolean isIsomorphic(String s, String t) {
        if(s!=null && t!=null){
            if(s.length()!=t.length()){
                return false;
            }
            Map<Character, Character> compareMap = new HashMap<>();
            Set<Character> mappedCharacterSet = new HashSet<>();

            for (int i = 0; i<s.length(); i++){
                char x = s.charAt(i);
                char y = t.charAt(i);
                if (compareMap.containsKey(x)){
                    if(compareMap.get(x) != y){
                        return false;
                    }
                } else {
                    if(mappedCharacterSet.contains(y)) {
                        return false;
                    }
                    compareMap.put(x,y);
                    mappedCharacterSet.add(y);
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        isomorphicStrings solution = new isomorphicStrings();
        System.out.println(solution.isIsomorphic("title", "paper"));
        System.out.println(solution.isIsomorphic("egg", "add"));
        System.out.println(solution.isIsomorphic("foo", "bar"));
        System.out.println(solution.isIsomorphic("badc", "baba"));
        System.out.println(solution.isIsomorphic("leet", "code"));
    }
}
