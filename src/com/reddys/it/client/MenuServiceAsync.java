package com.reddys.it.client;

import java.util.List;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.reddys.it.shared.data.MenuData;

public interface MenuServiceAsync {
	
	void getMenus(AsyncCallback<List<MenuData>> callback);
	
    /**
     * Utility class to get the RPC Async interface from client-side code
     */
    public static final class Util 
    { 
        private static MenuServiceAsync instance;

        public static final MenuServiceAsync getInstance()
        {
            if ( instance == null )
            {
                instance = (MenuServiceAsync) GWT.create( MenuService.class );
            }
            return instance;
        }

        private Util()
        {
            // Utility class should not be instantiated
        }
    }


}
