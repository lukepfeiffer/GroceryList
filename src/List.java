public class List {
	private Item [] items;
	private String name;
	private double budget;
	
	public List(String name, double budget, Item[] items){
		this.items = items;
		this.budget = budget;
		this.name = name;
	}
	
	public double getBudget(){
		return this.budget;
	}
	
	public void setBudget(double budget){
		this.budget = budget;
	}
	
	public String getName(){
		return this.name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public Item[] getItems(){
		return this.items;
	}
	
	public void setItems(Item[] items){
		this.items = items;
	}
	
	/*
	 * Sorts the items of the list in alphabetical order
	 * @params none
	 */
	public Item[] alphabetizeItems() {
		int length = this.items.length;
		Item tempItem;
		
		for (int i = 0; i < length - 1; i++) {
			for (int j = 0; j < length - i - 1; j++) {
				if (items[j + 1].getName().compareTo(items[j].getName()) < 0) {
					tempItem = items[j];
					items[j] = items[j + 1];
					items[j + 1] = tempItem;
				}
			}
		}
		return items;
	}
	
	public void addItem(Item item){
		
	}
	
	public boolean isFull(){
		Item [] items = this.items;
		int length = items.length;
		
		if(items[length-1] == null){
			return false;
		} else {
			return true;
		}
		
	}
	
	public String toString(){
		this.alphabetizeItems();

		Item [] items = this.items;
		int length = this.items.length;
		String returnString = "";
		returnString += this.name + "\n";
		
		for(int i = 0; i < length; ++i){
			returnString += "\t" + items[i].toString() + "\n";
		}
		
		returnString += "\n\tBudget: " + this.getBudget();
		
		return returnString;
	}
}