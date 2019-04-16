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
	  map.put("100", "�ŷ�");
	  map.put("101", "³����");
	  map.put("102", "�ֳ�");
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
	  boolean isEmpty=map.isEmpty();//�ж��Ƿ�Ϊ��
  }
  public static void Update(Map<String,String> map)
  {
	  map.put("100", "��ͬѧ");
	  System.out.println(map);
  }
  public static void loopTest(Map<String,String> map)
  {
	  //����
	  Set<String> set=map.keySet();
	  for(String key:set)
	  {
		  String value=map.get(key);
		  System.out.println(value);
	  }
	  Set<Entry<String,String>> set1=map.entrySet();
	  //�����Map.Entry����Լ��Ͻ����޸ģ���ô�ͻ�ͬ����entry��
	  map.put("108", "��ͬѧ");
	  for(Entry<String,String> entry:set1)
	  {
		  //��ü�
		  String key=entry.getKey();
		  String value1=entry.getValue();
		  System.out.println("key:"+key+" value:"+value1);
	  }
  }
  
}
