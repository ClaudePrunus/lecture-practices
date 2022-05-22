package com.revature.serviceLayer;

import com.revature.models.Wizard;

public interface WizardService {
	
	void createNewWizard(Wizard w);
	void deleteWizard(Wizard w);
	Wizard getWizard(int index);
}
