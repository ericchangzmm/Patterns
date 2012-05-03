package org.eric.study.patterns.observer;

public class Main {

	public static void main(String[] args) {
		
		Children children = new Children();
		
		children.addObserver(new Parent());
		children.addObserver(new Mother());
		
		children.setState("fight");  
		children.setState("scholarship");  
	}

}
