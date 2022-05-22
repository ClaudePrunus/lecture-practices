package com.revature.dataLayer;

import com.revature.models.Wizard;

public interface DummyWizardData {

	boolean add(Wizard w);
	void delete(Wizard w);
	Wizard get(int index);
}
