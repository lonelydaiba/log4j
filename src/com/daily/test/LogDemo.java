package com.daily.test;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class LogDemo {
	private final static Logger log =LogManager.getLogger(LogDemo.class);
	public static void main(String[] args) {
		//ʹ��Ĭ�ϵ�������Ϣ������Ҫдlog4j.properties
        //������־�������Ϊinfo���⽫���������ļ������õļ���
        //log.setLevel(Level.INFO);
		log.debug("hello world!");
		log.warn("hello world!");
		log.info("hello world!!");
		log.error("hello world!");
	}
}
