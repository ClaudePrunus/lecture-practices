package com.revature.drivers;

import java.util.Scanner;

import com.revature.models.Wizard;
import com.revature.serviceLayer.WizardService;
import com.revature.serviceLayer.WizardServiceImpl;

public class WizardDriver {

	private static WizardService wizardService = new WizardServiceImpl();
	private static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Welcome to Hogwarts! Please enter info below: ");
		
		System.out.print("Please enter a  name: ");
		String name = in.next();
		
		System.out.print("Please enter a spell: ");
		String spell = in.next();
		
		optionsMenu();
		
		System.out.println("Selection: ");
		
		int selection =  in.nextInt();
		
		switch (selection) {
		case 1:
			wizardService.createNewWizard(new Wizard(0, name, spell));
			break;

		default:
			System.out.println("You choose an unavailable option. Please try again.");
			break;
		}

	}
	
	public static void optionsMenu () {
		System.out.println("Choose from the following options: ");
		System.out.println("1 - Add");
		System.out.println("-------------------");
	}

}
