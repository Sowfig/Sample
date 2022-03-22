package org.test;

import java.util.HashMap;

public class Occurance {

	public static void main(String[] args) {
		String s = "Sowfig";

		HashMap<String, Integer> map = new HashMap<String, Integer>();

		String[] split = s.split(" ");

		for (String string : split) {
			Integer integer = map.get(string);
			if (integer==null) 
				map.put(string, 1);
			else 
				map.put(string, integer+1);



		}

		System.out.println(map);
	}

}
