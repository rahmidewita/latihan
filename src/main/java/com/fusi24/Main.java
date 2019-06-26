package com.fusi24;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = null;
		
		list.add("rahmi");
		list.add("dewita");
		list.get(0);
		
		//array list
		ArrayList<String> al = new ArrayList();
		
		//list with array list
		List<String> i = new ArrayList();
		
		//array basic
		int[][] array = new int [10][10];
		array[0][1] = 1;
		
		//map
		Map<String, String> map = new HashMap<String, String>();
		map.put("nama","rahmi dewita");
		map.get("nama");
		//
		Set<String> set = new HashSet<String>();
		set.add("rahmi");
		//colletion
		Collection<String> collection = null;
		System.out.println(list.toString());
		System.out.println(map.toString());
		System.out.println(set.toString());
		
	}

}
