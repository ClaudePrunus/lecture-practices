package com.revature.serviceTests;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.verify;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import com.revature.dataLayer.DummyWizardDataImpl;
import com.revature.models.Wizard;
import com.revature.serviceLayer.WizardServiceImpl;

public class MyServiceTest {
	
	//Class to be tested
	private WizardServiceImpl wizardService;
	
	//dependencies (will be mocked)
	private static DummyWizardDataImpl wizardDataMock;
	
	//test data
	private static Wizard w;
	
	@Before
	public void setUp() throws Exception {
		/* Mockito setup */
		//1. mock the depending classes
		wizardDataMock = Mockito.mock(DummyWizardDataImpl.class);
		
		//2. inject your service with mocked classes
		wizardService = new WizardServiceImpl(wizardDataMock);
		
		//3. provide a wizard stub to test with
		w = new Wizard();
		w.setId(1);
		w.setName("Harry Potter");
		w.setSpell("Patronus");
	}
	/*
	 *This would be a test for an application's service layer with Mockito 
	 */
	
	@Test
	public void addingWizard_positive_test() {
		//arrange
		//here, we are telling Mockito what to do with our mock method calls
		//and what to expect in return from that call
		when(wizardDataMock.add(w)).thenReturn(true);
		
		//act
		//run targeted test method with service injector
		wizardService.createNewWizard(w);
		
		//assert
		//verify that the dao mock ran with injector
		verify(wizardDataMock, times(1)).add(w);
	}

}
