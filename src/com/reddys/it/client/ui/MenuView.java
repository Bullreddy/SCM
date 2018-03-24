package com.reddys.it.client.ui;

import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Anchor;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HasVerticalAlignment;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.StackLayoutPanel;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;
import com.reddys.it.client.MenuServiceAsync;
import com.reddys.it.client.ui.presenter.Presenter;
import com.reddys.it.shared.data.MenuData;

import java.util.List;

import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.dom.client.Style.VerticalAlign;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.layout.client.Layout.Alignment;

public class MenuView implements View {

	private StackLayoutPanel stackPanel;

	@Override
	public void createUI() {
		// Create a new stack layout panel.
		stackPanel = new StackLayoutPanel(Unit.PCT);
		stackPanel.setHeight("100%");

		constructMenus();
	}

	private void constructMenus() {
		MenuServiceAsync.Util.getInstance().getMenus(new AsyncCallback<List<MenuData>>() {

			@Override
			public void onSuccess(List<MenuData> menus) {
				addItems(menus);
			}

			@Override
			public void onFailure(Throwable arg0) {
				Window.alert("failure"+arg0);
			}
		});
	}

	private void addItems(List<MenuData> menus) {
		Widget header =null;
		Widget submenus =null;
		if(menus!=null) {
			for(MenuData menu:menus) {
				header = createHeaderWidget(
						menu.getDisplayName());
				if(menu.getSubMenus()!=null) {
					submenus = addSubItems(menu.getSubMenus());
				stackPanel.add(submenus,header, 7);
				}
			}
		}
		//stackPanel.add(new HTML("SAMPLE"));
	}

	private Widget addSubItems(List<MenuData> subMenus) {
		VerticalPanel subMenuPanel = new VerticalPanel();
		subMenuPanel.setWidth("100%");
		subMenuPanel.setHeight("100%");
		for(MenuData menu:subMenus)
			subMenuPanel.add(createMenuLink(menu));
		return subMenuPanel;
	}

	private Widget createMenuLink(MenuData menu) {
		Anchor anchor = new Anchor(menu.getDisplayName());
		anchor.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				updateView(menu);
			}

		});
		return anchor;
	}
	
	private void updateView(MenuData menu) {
		View view = null;
		Presenter presenter = null;
		LayoutView.updateContentPanel(view.getUI());
		presenter.go(view);
		
	}

	@Override
	public Widget getUI() {
		return stackPanel;
	}

	/**
	 * Create a widget to display in the header that includes an image and some
	 * text.
	 * 
	 * @param text the header text
	 * @param image the {@link ImageResource} to add next to the header
	 * @return the header widget
	 */
	private Widget createHeaderWidget(String text) {
		// Add the image and text to a horizontal panel
		HorizontalPanel hPanel = new HorizontalPanel();
		hPanel.setHeight("100%");
		hPanel.setSpacing(0);
		hPanel.setVerticalAlignment(HasVerticalAlignment.ALIGN_TOP);
		HTML headerText = new HTML(text);
		headerText.setStyleName("cw-StackPanelHeader");
		hPanel.add(headerText);
		return new SimplePanel(hPanel);
	}

}
