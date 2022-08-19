package n1656.easy.designAnOrderedStream;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {

    /**
     * Your OrderedStream object will be instantiated and called as such:
     * OrderedStream obj = new OrderedStream(n);
     * List<String> param_1 = obj.insert(idKey,value);
     */

    class OrderedStream {
        int ptr;
        int n;
        Map<Integer, String> map;

        public OrderedStream(int n) {
            this.ptr = 1;
            this.n = n;
            this.map = new HashMap<Integer, String>();
        }

        public List<String> insert(int idKey, String value) {
            map.put(idKey, value);
            List<String> list = new ArrayList<String>();
            if (idKey == ptr) {
                for (int i = ptr; i <= n && map.containsKey(i); i++) {
                    list.add(map.get(i));
                    ptr = i + 1;
                }
            }
            return list;
        }
    }
}
