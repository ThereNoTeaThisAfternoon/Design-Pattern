package jkdSrc;

import java.util.HashMap;
import java.util.Map;

public class Composite {
	public static void main(String[] args) {
		/**
		 * Map 就是一个抽象的构建（类似Component）
		 * HashMap是一个中间的构建（Composite），实现了相关的方法
		 * put、putAll
		 * Node 是HashMap的静态内部类，类似叶子节点，没有put、putAll、remove方法。
		 * static class Node<K,V> implements Map.Entry<K,V>
		 * 
		 */
		
		
		Map<Integer, String> hashMap = new HashMap<Integer, String>();
		hashMap.put(0, "东游记");// 直接存放在叶子节点（Node）

		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "西游记");
		map.put(2, "红楼梦");
		hashMap.putAll(map);
		
		System.out.println(hashMap);
	}
}
