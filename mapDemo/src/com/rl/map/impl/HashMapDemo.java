package com.rl.map.impl;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {
	public static void main(String[] args)
	{
		//创建HashMap实例
	    //HashMap<String,Object> hm=new HashMap<String,Object>();
		HashMap<String,Person> hm=new HashMap<String,Person>();
	    hm.put("齐天大圣",new Person("孙悟空",500));
	    hm.put("二师兄",new Person("猪八戒",300));
	    hm.put(null,new Person("唐僧",30));
	    Set<Entry<String, Person>> PersonSet=hm.entrySet();
	    for(Entry<String, Person> per:PersonSet)
	    {
	    	String key=per.getKey();
	    	Person value=per.getValue();
	    	System.out.println("代号"+key+" 人："+value);
	    }
	}
   
}
