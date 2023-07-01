package Maps;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author Ahmed Nabil
 */
public class _49_GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<List<Integer>, List<String>> map = new HashMap<>();
        for(String s : strs) {
            int[] count = new int[26];
            for(char c: s.toCharArray()) {
                count[c - 'a']++;
            }
            List<Integer> countList = Arrays.stream(count).boxed().toList();
            if(!map.containsKey(countList)) {
                map.put(countList, new ArrayList<>());
            }
            map.get(countList).add(s);
        }
        return new ArrayList<>(map.values());
    }

    public List<List<String>> groupAnagrams_functionalSolution(String[] strs) {
        return Arrays.stream(strs)
                .collect(Collectors.groupingBy(this::getAnagram))
                .values()
                .stream()
                .toList();
    }
    private List<Integer> getAnagram(String s) {
        int[] count = new int[26];
        for(char c: s.toCharArray()) {
            count[c - 'a']++;
        }
        return Arrays.stream(count).boxed().toList();
    }
}
