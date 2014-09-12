package com.wolf.list.index;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

//索引的实现
public class Tmap {
	Map tMap = new HashMap();
	ArrayList tList = new ArrayList();

	public void putData(Object data, Object value) {
		ArrayList list = (ArrayList) tMap.get(data);
		if (list == null) {
			list = new ArrayList();
			tMap.put(data, list);// ////
		}
		list.add(value);
		tList.add(value);
	}

	public ArrayList getData(Object data) {
		ArrayList list = (ArrayList) tMap.get(data);
		return list;
	}

	public Map getMap() {
		return tMap;
	}

	public static void main(String[] args) {
		Tmap tmap = new Tmap();
		for (int i = 1; i < 5; i++) {
			tmap.putData(new Long(i), new Long(i));
		}
		// remove 删除映射关系
		// tmap.getMap().remove(new Long(1));
		ArrayList list = (ArrayList) tmap.getData(new Long(1));
		if (list == null) {
			System.out.println("null");
		} else {
			System.out.println(list.toString());
		}
		//
		// System.gc();
	}
}
