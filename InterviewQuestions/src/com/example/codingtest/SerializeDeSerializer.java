package com.example.codingtest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class SerializeDeSerializer implements Serializable {
	
	private List<Item> itemList = new ArrayList<Item>();

	
	public void setItemList(){
		Item item1 = new Item(1,"Pen");
		Item item2 = new Item(2,"Pencil");
		itemList.add(item1);
		itemList.add(item2);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SerializeDeSerializer de = new SerializeDeSerializer();
		de.setItemList();
		
		FileOutputStream outputS;
		try {
			outputS = new FileOutputStream("E://filetemp.txt");
			ObjectOutputStream objOutput = new ObjectOutputStream(outputS);
			objOutput.writeObject(de.getItemList());
			objOutput.flush();
			objOutput.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		FileInputStream inputS;
		try {
			inputS = new FileInputStream("E://filetemp.txt");
			ObjectInputStream objInput = new ObjectInputStream(inputS);
			List<Item> itemList = (List<Item>) objInput.readObject();
			objInput.close();
			
			for(Item it : itemList) {
				System.out.println(it.getItemNo()+":" + it.getItemName());
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
				
	}
	
	
	public List<Item> getItemList() {
		return itemList;
	}
	public void setItemList(List<Item> itemList) {
		this.itemList = itemList;
	}


	class Item implements Serializable {
		private int itemNo;
		private String itemName;
		
		public Item() {
			
		}
		
		public Item(int itemNo,String itemName){
			this.itemNo = itemNo;
			this.setItemName(itemName);
		}
		public int getItemNo() {
			return itemNo;
		}
		public void setItemNo(int itemNo) {
			this.itemNo = itemNo;
		}

		public String getItemName() {
			return itemName;
		}

		public void setItemName(String itemName) {
			this.itemName = itemName;
		}
		
	}

}
