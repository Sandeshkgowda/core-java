package com.xworkz.chatapp;

import com.xworkz.chatapp.chat.ChatShop;

public class ChatShopTester {
 public static void main(String[] args) {
	 String chatMenu[] = new String [5];
	 chatMenu[0] = "pani puri";
	 chatMenu[1] = "bele puri";
	 chatMenu[2] = "masl puri";
	 chatMenu[3] = "tika puri";
	 chatMenu[4] = "sev puri";
	 String juiceMenu[] = new String [6];
	 juiceMenu[0] = "organe juice";
	 juiceMenu[1] = "apple juice";
	 juiceMenu[2] = "grapes juice";
	 juiceMenu[3] = "butterfruit juice";
	 juiceMenu[4] = "watermelon juice";
	 juiceMenu[5] = "kiwi juice";
	 String chineseMenu[] = new String[5];
	 chineseMenu[0] = "gopi munchuri";
	 chineseMenu[1] = "noodles";
	 chineseMenu[2] = "panner munchuri";
	 chineseMenu[3] = "mushroom dry";
	 chineseMenu[4] = "fench fry";
	 
	ChatShop chat = new ChatShop("bangarpet","Banglore",chatMenu,juiceMenu,chineseMenu);
	chat.menu();
}
}
