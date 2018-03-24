package com.reddys.it.client.ui;

import com.google.gwt.user.client.ui.Widget;

public interface View {
	
	public void createUI();
	
	public Widget getUI();
	
	public default Widget getView() {
		createUI();
		return getUI();
	}

}
