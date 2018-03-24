package com.reddys.it.shared.data;

import java.io.Serializable;
import java.util.List;


public class MenuData implements Serializable{
	
	private String key;
	
	private String displayName;
	
	private String clazzName;
	
	private List<MenuData> subMenus;
	
	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public String getClazzName() {
		return clazzName;
	}

	public void setClazzName(String clazzName) {
		this.clazzName = clazzName;
	}

	public List<MenuData> getSubMenus() {
		return subMenus;
	}

	public void setSubMenus(List<MenuData> subMenus) {
		this.subMenus = subMenus;
	}

}
