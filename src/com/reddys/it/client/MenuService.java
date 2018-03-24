package com.reddys.it.client;

import java.util.List;

import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;
import com.reddys.it.shared.data.MenuData;

@RemoteServiceRelativePath("MenuService")
public interface MenuService extends RemoteService {

	public List<MenuData> getMenus() ;

}
