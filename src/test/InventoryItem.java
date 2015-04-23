package test;

public class InventoryItem {
	
	String itemNumber; //scanned barcode number
	String location; //where it is stored
	String itemEOQ;
	String itemName; //actual name
	String itemSize; //big vs. small
	int itemPackage; //how many items are in a package
	int itemQuantity; //how many packages are in storage room
	
	public InventoryItem(String itemNumber, String location, String itemEOQ, String itemName, String itemSize, int itemPackage, int itemQuantity){
		this.itemNumber = itemNumber;
		this.location = location;
		this.itemEOQ = itemEOQ;
		this.itemName = itemName;
		this.itemSize = itemSize;
		this.itemPackage = itemPackage;
		this.itemQuantity = itemQuantity;
	}
	
	//getters and setters
	public String getItemNumber() {
		return itemNumber;
	}
	public void setItemNumber(String itemNumber) {
		this.itemNumber = itemNumber;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getItemEOQ() {
		return itemEOQ;
	}
	public void setItemEOQ(String itemEOQ) {
		this.itemEOQ = itemEOQ;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getItemSize() {
		return itemSize;
	}
	public void setItemSize(String itemSize) {
		this.itemSize = itemSize;
	}
	public int getItemPackage() {
		return itemPackage;
	}
	public void setItemPackage(int itemPackage) {
		this.itemPackage = itemPackage;
	}
	public int getItemQuantity() {
		return itemQuantity;
	}
	public void setItemQuantity(int itemQuantity) {
		this.itemQuantity = itemQuantity;
	}
}
