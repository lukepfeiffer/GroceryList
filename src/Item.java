public class Item {
	private String quantity;
	private String name;
	
	public Item(String name, String quantity){
		this.name = name;
		this.quantity = quantity;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return this.name;
	}
	
	public void setQuantity(String quantity){
		this.quantity = quantity;
	}
	
	public String getQuantity(){
		return this.quantity;
	}

	public String toString(){
		String returnString = name + ", " + quantity;
		return returnString;
	}
}