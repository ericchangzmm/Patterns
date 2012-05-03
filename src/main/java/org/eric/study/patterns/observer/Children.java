package org.eric.study.patterns.observer;

import java.util.Observable;

public class Children extends Observable{

	private String state;

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
		
		setChanged();
		notifyObservers(state);
	}
	
	
}
