package com.reddys.it.client.ui;

import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;
import com.reddys.it.client.ui.View;
import com.reddys.it.utils.UIUtil;

public class ApplicationFormView implements View{

	VerticalPanel rootPanel = new VerticalPanel();
	@Override
	public void createUI() {
		
		Label applicationNumberLbl = UIUtil.getLabel("Application Number");
		TextBox applicationNumber = UIUtil.getTextBox();
		
		HorizontalPanel anPanel = new HorizontalPanel();
		anPanel.add(applicationNumberLbl);
		anPanel.add(applicationNumber);
		
		rootPanel.add(anPanel);
	}

	@Override 
	public Widget getUI() {
		return rootPanel;
	}

}
