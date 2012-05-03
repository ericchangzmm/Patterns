package org.eric.study.patterns.memento;

public class Main {

	public static void main(String[] args) {

		WindowsSystem winxp = new WindowsSystem();// Winxp系统
		User user = new User();// 某一用户

		winxp.setState("好的状态"); // Winxp处于好的运行状态

		user.saveMemento(winxp.createMemento()); // 用户对系统进行备份，Winxp系统要产生备份文件

		winxp.setState("坏的状态"); // Winxp处于不好的运行状态

		// 用户发恢复命令，系统进行恢复
		winxp.restoreMemento(user.retrieveMemento());

		System.out.println("当前系统处于" + winxp.getState());
	}

}
