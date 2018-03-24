package com.reddys.it.client.ui;

import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.DockLayoutPanel;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.Widget;
import com.reddys.it.utils.UIUtil;

public class LayoutView {
	
	private static DockLayoutPanel layout;
	private Widget contentPanel;

	public LayoutView() {
		createLayout();
	}
	
	public Widget getGUI() {
		return layout;
	}
	
	public void createLayout() {
		layout = new DockLayoutPanel(Unit.PCT);
		HTML northPanel = new HTML("Header");
		northPanel.getElement().getStyle().setProperty("border", "black solid 1px");
		HTML southPanel = new HTML("Footer");
		southPanel.getElement().getStyle().setProperty("border", "black solid 1px");
		HTML westPanel = new HTML("Navigation");
		westPanel.getElement().getStyle().setProperty("border", "black solid 1px");
		contentPanel = new HTML("Content");
		layout.addNorth(northPanel,10);
		layout.addSouth(southPanel,10);
		View menu = new MenuView();
		layout.addWest(menu.getView(),15);
		layout.add(contentPanel);
	}
	
	public static void updateContentPanel(Widget contentPanel) {
		Widget currentContentPanel = layout.getWidget(3);
		layout.insertLineStart(contentPanel, 100, currentContentPanel);
		if(!UIUtil.isNull(currentContentPanel))
			layout.remove(currentContentPanel);
		
	}
}