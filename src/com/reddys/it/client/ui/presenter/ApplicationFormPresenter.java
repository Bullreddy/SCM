package com.reddys.it.client.ui.presenter;

import com.reddys.it.client.ui.View;

public class ApplicationFormPresenter implements Presenter{

	private View view;
	
	@Override
	public void go(View view) {
		this.view = view;
	}

}
