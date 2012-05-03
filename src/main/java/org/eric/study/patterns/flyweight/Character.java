package org.eric.study.patterns.flyweight;

/**
 * Flyweight
 * 抽象享元角色（Flyweight）：此角色是所有的具体享元类的超类，为这些类规定出需要实现的公共接口或抽象类。那些需要外蕴状态(External
 * State)的操作可以通过方法的参数传入。抽象享元的接口使得享元变得可能，但是并不强制子类实行共享，因此并非所有的享元对象都是可以共享的。
 * 
 * @author eric.zhang
 * 
 */
public abstract class Character {

	protected char symbol;
	protected int width;
	protected int height;
	protected int ascent;
	protected int descent;
	protected int pointSize;

	public abstract void Display(int pointSize);
}
