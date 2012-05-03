package org.eric.study.patterns.flyweight;

/**
 * 具体享元(ConcreteFlyweight)角色：实现抽象享元角色所规定的接口。如果有内蕴状态的话，必须负责为内蕴状态提供存储空间。
 * 享元对象的内蕴状态必须与对象所处的周围环境无关
 * ，从而使得享元对象可以在系统内共享。有时候具体享元角色又叫做单纯具体享元角色，因为复合享元角色是由单纯具体享元角色通过复合而成的。
 * 
 * @author eric.zhang
 * 
 */
public class CharacterZ extends Character {

	public CharacterZ() {
		this.symbol = 'Z';
		this.height = 100;
		this.width = 100;
		this.ascent = 68;
		this.descent = 0;
	}

	@Override
	public void Display(int pointSize) {
		this.pointSize = pointSize;
		System.out.println(this.symbol + " (pointsize " + this.pointSize + ")");
	}

}
