package com.rl.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo {
	
  public static void main(String[] args)
  {
	  Map<String,String> map=new HashMap<String,String>();
	  map.put("100", "张飞");
	  map.put("101", "鲁智深");
	  map.put("102", "林冲");
//	  addTest(map);
//	  getTest(map);
//	  ketSetTest(map);
	  valueTest(map);
	  Update(map);
	  loopTest(map);
  }
  public static void addTest(Map<String,String> map)
  {
	  //map.clear();
	  String value=map.remove("100");
	  System.out.println(map);
  }
  public static void getTest(Map<String,String> map)
  {
	  String value=map.get("100");
	  System.out.println(value);
  }
  public static void ketSetTest(Map<String,String> map)
  {
	  
	  Set<String> set=map.keySet();
	  System.out.println(set);
  }
  public static  void valueTest(Map<String,String> map)
  {
	  Collection<String> coll= map.values();
	  System.out.println(coll);
	  int length=map.size();
	  boolean isExist=map.containsKey("100");
	  System.out.println(isExist);
	  boolean isExistVal=map.containsValue("test");
	  boolean isEmpty=map.isEmpty();//判断是否为空
  }
  public static void Update(Map<String,String> map)
  {
	  map.put("100", "林同学");
	  System.out.println(map);
  }
  public static void loopTest(Map<String,String> map)
  {
	  //遍历
	  Set<String> set=map.keySet();
	  for(String key:set)
	  {
		  String value=map.get(key);
		  System.out.println(value);
	  }
	  Set<Entry<String,String>> set1=map.entrySet();
	  //如果在Map.Entry后面对集合进行修改，那么就会同步到entry中
	  map.put("108", "王同学");
	  for(Entry<String,String> entry:set1)
	  {
		  //获得键
		  String key=entry.getKey();
		  String value1=entry.getValue();
		  System.out.println("key:"+key+" value:"+value1);
	  }
  }
  
}
