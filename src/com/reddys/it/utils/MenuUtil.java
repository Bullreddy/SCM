package com.reddys.it.utils;

import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.List;

import com.reddys.it.shared.data.MenuData;
import com.thoughtworks.xstream.XStream;

public class MenuUtil {
	
	private XStream xStream;
	
	public MenuUtil(){
		xStream = new XStream();
		configure(xStream);
	}
	
	private void configure(XStream xStream) {
		xStream.ignoreUnknownElements();
		setAlias(xStream);
	}

	public List<MenuData> readMenuFromFile() {
		InputStream inputStream = MenuUtil.class.getResourceAsStream("menu.xml");
		List<MenuData> menus = (List<MenuData>) xStream.fromXML(inputStream);
		System.out.println("menus "+menus);
		return menus;
	}
	
	private void setAlias(XStream xStream) {
		xStream.alias("menu", MenuData.class);
		xStream.alias("menus", List.class);
		xStream.aliasField("menus", MenuData.class,"subMenus");
	}
	
	public static void main(String args[]) throws FileNotFoundException {
		MenuUtil util = new MenuUtil();
		//util.setAlias(xstream);
		//System.out.println(xstream.toXML(util.readMenuFromFile()));
		System.out.println(util.readMenuFromFile());
	}

}
