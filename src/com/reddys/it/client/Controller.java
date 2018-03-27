package com.reddys.it.client;

import com.google.gwt.user.client.ui.RootLayoutPanel;
import com.reddys.it.client.ui.LayoutView;

public class Controller {
	
	public void execute(RootLayoutPanel rootLayoutPanel){
		LayoutView homeView = new LayoutView();
		rootLayoutPanel.add(homeView.getGUI());
	}
}
