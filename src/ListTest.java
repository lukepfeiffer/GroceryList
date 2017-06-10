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
		String expected = "Long list\n\t1. Apple, 5lbs\n\t2. Banana, 10lbs\n\t3. Carrots, 5lbs\n\n\tBudget: " 
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
	
	@Test
	public void finalIndexTest(){
		list.setItems(ArrayHelper.doubleArraySize(list.getItems() ) );
		assertEquals(list.finalValidIndex(), 3);
		
		Item [] newItems = new Item[3];
		list.setItems(newItems);
		assertEquals(list.finalValidIndex(), 0);

	}
}
