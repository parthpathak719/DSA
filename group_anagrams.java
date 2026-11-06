import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.LinkedHashMap;
import java.util.Arrays;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int n = strs.length;
        Map<String, List<String>> map = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            char[] c = strs[i].toCharArray();
            Arrays.sort(c);
            String a = new String(c);
            if (!map.containsKey(a)) {
                map.put(a, new ArrayList<>());
            }
            map.get(a).add(strs[i]);
        }
        return new ArrayList<>(map.values());
    }
}