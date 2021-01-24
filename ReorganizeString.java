package pundeyJava;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.PriorityQueue;

public class ReorganizeString {

	public static void main(String[] args) {
		System.out.println(getArrangedString());

	}

	private static String getArrangedString() {
		// TODO Auto-generated method stub
		String str = "dddddddcaab";
		Map<Character, Integer> counts = new HashMap<>();
		for (char c : str.toCharArray()) {
			counts.put(c, counts.getOrDefault(c, 0) + 1);
		}
		for (Character name : counts.keySet()) {
			String key = name.toString();
			String value = counts.get(name).toString();
			System.out.println(key + " " + value);
		}

		PriorityQueue<Character> maxHeap = new PriorityQueue<>((a, b) -> counts.get(b) - counts.get(a));
		maxHeap.addAll(counts.keySet());

		System.out.println(maxHeap);
		StringBuilder result = new StringBuilder();
		while (maxHeap.size() > 1) {
			char curr = maxHeap.remove();
			char next = maxHeap.remove();
			result.append(curr);
			result.append(next);

			counts.put(curr, counts.get(curr) - 1);
			counts.put(next, counts.get(next) - 1);
			if (counts.get(curr) > 0) {
				maxHeap.add(curr);
			}
			if (counts.get(next) > 0) {
				maxHeap.add(next);
			}
		}

		if (!maxHeap.isEmpty()) {
			char last = maxHeap.remove();
			if (counts.get(last) > 1)
				return "";

			result.append(last);
		}
		return result.toString();
	}

}
