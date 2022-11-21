package com.xworkz.chatapp.chat;

public class ChatShop {
	public String name;
	public String address;
	public String chatMenu[];
	public String juiceMenu[];
	public String chineseMenu[];
	
	public ChatShop(String name,String address,String chatMenu[],String juiceMenu[],String chineseMenu[]) {
		this.name = name;
		this.address = address;
		this.chatMenu= chatMenu;
		this.juiceMenu = juiceMenu;
		this.chineseMenu = chineseMenu;
	}
	public void menu() {
		System.out.println("welcome ");
		System.out.println("the name of the shop "+ name);
		System.out.println("the address of the shop "+ address);
		for (int i = 0; i < chatMenu.length; i++) {
			System.out.println("the menu are "+ chatMenu[i]);
		}
		for (int i = 0; i < juiceMenu.length; i++) {
			System.out.println("the menu of juice are "+ juiceMenu[i]);
		}
		for (int i = 0; i < chineseMenu.length; i++) {
			System.out.println("the menu of chinese are "+ chineseMenu[i]);
		}
		System.out.println("thank u visit again");
	}
}
