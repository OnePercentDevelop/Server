import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Test {
	public static void main(String[] args) {
		List<Map<String, Object>> list = new LinkedList<Map<String, Object>>();
		Map<String,Object> map = new HashMap<String, Object>();
		TreeMap<String,Object> tm = new TreeMap<String,Object>();
		tm.put("ex1_value", 1);
		tm.put("ex1_count", 5);
		tm.put("ex2_value", 2);
		tm.put("ex3_value", 3);
		tm.put("ex4_value", 4);
//		tm.descendingKeySet();
		list.add(tm);
		
		System.out.println(list.get(0).keySet());
		
	}
	public static List sortByValue(final Map map) {
        List<String> list = new ArrayList();
        list.addAll(map.keySet());
         
        Collections.sort(list,new Comparator() {
             
            public int compare(Object o1,Object o2) {
                Object v1 = map.get(o1);
                Object v2 = map.get(o2);
                 
                return ((Comparable) v2).compareTo(v1);
            }
             
        });
        Collections.reverse(list); // 주석시 오름차순
        return list;
    }



}
