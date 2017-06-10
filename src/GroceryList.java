import java.util.Scanner;

public class GroceryList {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		boolean flag = true;
		Item [] items = new Item[4];

		System.out.println("Name of list: ");
		String listName = scan.nextLine();
		
		System.out.println("Proposed budget: ");
		double listBudget = scan.nextDouble();
		
		
		List itemList = new List(listName, listBudget, items );
		while(flag){
			
			System.out.println(itemList.toString());
			System.out.println("Options:\n\t1. Add Item\n\t2. Delete Item\n\t3. Done\nEnter the number of the command*");
			int choice = scan.nextInt();
			
			if(choice == 1){
				System.out.println("Item name: ");
				String itemName = scan.next();
				
				System.out.println("Quantity of " + itemName + "?");
				String itemQuantity = scan.next();
				
				Item tempItem = new Item(itemName, itemQuantity);
				
				itemList.addItem(tempItem);
				System.out.println("Item added!");
			}
		}
		
		System.out.println(itemList.toString());
		scan.close();
	}
}