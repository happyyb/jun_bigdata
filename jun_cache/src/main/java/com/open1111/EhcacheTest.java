package com.open1111;

import net.sf.ehcache.Cache;
import net.sf.ehcache.CacheManager;
import net.sf.ehcache.Element;

public class EhcacheTest {

	public static void main(String[] args) {
		// ����ehcache.xml�����ļ�����Cache������
		CacheManager manager=CacheManager.create("./src/main/resources/ehcache.xml");
		Cache c=manager.getCache("a"); // ��ȡָ��cache
		Element e=new Element("java1234","ţ��");
		c.put(e); // ��һ��Ԫ����ӵ�Cache��
		
		Element e2=c.get("java1234"); // ����key��ȡ����Ԫ��
		System.out.println(e2);
		System.out.println(e2.getObjectValue());
		
		c.flush(); // ˢ�»���
		manager.shutdown(); // �رջ��������
		
	}
}
