package pundeyJava;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class FirstUniqueChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getFirstUniqueChar("leetcodel"));
	}

	static int getFirstUniqueChar(String s) {
		int min = Integer.MAX_VALUE;
		Map<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			char curr = s.charAt(i);
			if (!map.containsKey(curr)) {
				map.put(curr, i);
			} else {
				map.put(curr, -1);
			}
		}

		for (char c : map.keySet()) {
			if (map.get(c) > -1 && map.get(c) < min)
				min = map.get(c);
		}

		return min == Integer.MAX_VALUE ? -1 : min;
	}

}
