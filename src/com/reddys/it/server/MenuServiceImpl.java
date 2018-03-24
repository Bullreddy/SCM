package com.reddys.it.server;

import java.util.List;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import com.reddys.it.client.MenuService;
import com.reddys.it.shared.data.MenuData;
import com.reddys.it.utils.MenuUtil;

public class MenuServiceImpl extends RemoteServiceServlet implements MenuService {

	@Override
	public List<MenuData> getMenus() {
		return new MenuUtil().readMenuFromFile();
	}

}
