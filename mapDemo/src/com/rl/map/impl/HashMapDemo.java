package com.rl.map.impl;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {
	public static void main(String[] args)
	{
		//����HashMapʵ��
	    //HashMap<String,Object> hm=new HashMap<String,Object>();
		HashMap<String,Person> hm=new HashMap<String,Person>();
	    hm.put("�����ʥ",new Person("�����",500));
	    hm.put("��ʦ��",new Person("��˽�",300));
	    hm.put(null,new Person("��ɮ",30));
	    Set<Entry<String, Person>> PersonSet=hm.entrySet();
	    for(Entry<String, Person> per:PersonSet)
	    {
	    	String key=per.getKey();
	    	Person value=per.getValue();
	    	System.out.println("����"+key+" �ˣ�"+value);
	    }
	}
   
}
