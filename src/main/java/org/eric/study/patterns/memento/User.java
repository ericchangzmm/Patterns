package org.eric.study.patterns.memento;

public class User {

	private Memento memento;

	//恢复系统  
	public Memento retrieveMemento() {
		return memento;
	}

	//保存系统  
	public void saveMemento(Memento memento) {
		this.memento = memento;
	}

}
