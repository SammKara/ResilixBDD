package com.Resilix.testbase;

import com.Resilix.pages.LoginPage;
import com.Resilix.pages.MainPage;

public class PageInitializer extends BaseClass {

	public static LoginPage loginPage;
	public static MainPage mainPage;

	

	public static void initialize() {
		// initialize pages
		loginPage = new LoginPage();
		mainPage = new MainPage();
		
	}

}
