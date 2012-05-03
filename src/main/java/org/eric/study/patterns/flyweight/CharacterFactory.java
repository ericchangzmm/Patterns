package org.eric.study.patterns.flyweight;

import java.util.Hashtable;

/**
 * 享元工厂(FlyweightFactoiy)角色：本角色负责创建和管理享元角色。本角色必须保证享元对象可以被系统适当地共享。
 * 当一个客户端对象请求一个享元对象的时候
 * ，享元工厂角色需要检查系统中是否已经有一个符合要求的享元对象，如果已经有了，享元工厂角色就应当提供这个已有的享元对象；
 * 如果系统中没有一个适当的享元对象的话，享元工厂角色就应当创建一个新的合适的享元对象。
 * 
 * @author eric.zhang
 * 
 */
public class CharacterFactory {

	private Hashtable characters = new Hashtable();

	public Character GetCharacter(char key) {

		Character character = (Character)characters.get(key);  
		if (character == null)  
	      {  
	        switch (key)  
	        {  
	          case 'A': character = new CharacterA(); break;  
	          case 'B': character = new CharacterB(); break;  
	            //  
	          case 'Z': character = new CharacterZ(); break;  
	        }  
	        characters.put(key, character);  
	      }  
	      return character;  
	}
}
