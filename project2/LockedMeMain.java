package com.assited.project2;

public class LockedMeMain {

	public static void main(String[] args) {
		
		// Create "main" folder if not present in current folder structure
		FileOperations.createMainFolderIfNotPresent("main");
		
		MenuOptions.printWelcomeScreen("LockedMe", "Ramu rasamsetti");
		
		HandleOptions.handleWelcomeScreenInput();
	}

	
}