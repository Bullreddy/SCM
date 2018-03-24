package com.reddys.it.utils;

import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;

public class UIUtil {
	
	public static Button getButton(String displayText) {
		Button button = new Button(displayText);
		return button;
	}

	public static Button getButton(String id,String displayText) {
		Button button = new Button(displayText);
		return button;
	}
	
	public static TextBox getTextBox() {
		TextBox textBox = new TextBox();
		return textBox;
	}
	
	public static Label getLabel(String text) {
		return new Label(text);
	}
	
	public static boolean isNull(Widget widget) {
		return null == widget;
	}
	
}
