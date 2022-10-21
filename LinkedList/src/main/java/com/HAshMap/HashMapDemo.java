package com.HAshMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, String> map = new HashMap<Integer, String>();

		// adding elements
		map.put(101, "Mitul");
		map.put(102, "Shubham");
		map.put(103, "Prithwish");
		map.put(104, "Sweety");
		map.put(105, "Swarupa");

		System.out.println(map);

		// to iterate convert to set

		Set<Entry<Integer, String>> set1 = map.entrySet();
		Iterator<Entry<Integer, String>> itr = set1.iterator();

		while (itr.hasNext()) {
			// key value separately
			Map.Entry<Integer, String> pair = itr.next();

			System.out.println(pair.getKey() + "  " + pair.getValue());
		}

		System.out.println("----------------------------------");

		// 2nd way

		for (Map.Entry<Integer, String> data : map.entrySet()) {
			System.out.println(data.getKey() + "  " + data.getValue());
		}

	}

}
