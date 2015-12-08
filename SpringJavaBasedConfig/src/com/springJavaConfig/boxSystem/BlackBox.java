package com.springJavaConfig.boxSystem;

public class BlackBox implements Box {

	private Item boxItem;
	
	public BlackBox(Item item){
		boxItem = item;
	}
	
	public void showBox() {
		boxItem.showItem();
	}

}
