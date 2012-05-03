package org.eric.study.patterns.observer;

import java.util.Observable;
import java.util.Observer;

public class Mother implements Observer {

	public void update(Observable o, Object arg) {

		if((o instanceof Children))
		{
			if(((String)arg).equals("fight"))
				System.out.println("Mother，他和别人打架了");  
			else if(((String)arg).equals("scholarship"))
				System.out.println("告诉Mother,他得到了奖学金");  
		}
	}

}
