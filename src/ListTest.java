import static org.junit.Assert.*;

import org.junit.Test;

public class ListTest {
	Item itemOne = new Item("Carrots", "5lbs");
	Item itemTwo = new Item("Apple", "5lbs");
	Item itemThree = new Item("Banana", "10lbs");
	Item [] itemArray = { itemOne, itemTwo, itemThree };
	List list = new List("Long list", 100.22, itemArray);
	
	@Test
	public void toStringTest() {
		String expected = "Long list\n\tApple, 5lbs\n\tBanana, 10lbs\n\tCarrots, 5lbs\n\n\tBudget: " 
	                      + 100.22;

		assertEquals(expected, list.toString());
	}
	
	@Test
	public void alphabetizeTest(){
		Item[] sorted = list.alphabetizeItems();
		Item[] items = list.getItems();
		String [] expectedNamesOrder = {"Apple", "Banana", "Carrots"};
		String [] actualNamesOrder = {items[0].getName(), items[1].getName(), items[2].getName()};
		assertArrayEquals(expectedNamesOrder, actualNamesOrder);
	}
	
	@Test
	public void isFullTest(){
		assertEquals(true, list.isFull());
	}
	
	@Test
	public void addItem(){
		Item itemFour = new Item("Caramel", "1oz");
		list.addItem(itemFour);
		assertEquals(itemFour, list.getItems()[3]);
	}
}
