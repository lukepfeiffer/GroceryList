import static org.junit.Assert.*;

import org.junit.Test;

public class ItemTest {

	@Test
	public void toStringTest() {
		Item item = new Item("Banana", "5lbs");
		String expected = "Banana, 5lbs";
		assertEquals(item.toString(), expected);
		
		item = new Item("Apple", "2lbs");
		expected = "Apple, 2lbs";
		assertEquals(item.toString(), expected);
		
		item = new Item("Soy Sauce", "16oz");
		expected = "Soy Sauce, 16oz";
		assertEquals(item.toString(), expected);
	}
	
	@Test
	public void getterTests(){
		Item item = new Item("banana", "5lbs");
		String expectedName = "banana";
		String expectedQuantity = "5lbs";
		assertEquals(item.getName(), expectedName);
		assertEquals(item.getQuantity(), expectedQuantity);
		
		item = new Item("apple", "2lbs");
		expectedName = "apple";
		expectedQuantity = "2lbs";
		assertEquals(item.getName(), expectedName);
		assertEquals(item.getQuantity(), expectedQuantity);
	}
	
	@Test
	public void settersTests(){
		Item item = new Item("banana", "5lbs");
		String expectedName = "apple";
		String expectedQuantity = "2lbs";
		item.setName("apple");
		item.setQuantity("2lbs");

		assertEquals(item.getName(), expectedName);
		assertEquals(item.getQuantity(), expectedQuantity);
		
		item = new Item("apple", "2lbs");
		expectedName = "banana";
		expectedQuantity = "5lbs";
		item.setName("banana");
		item.setQuantity("5lbs");
		assertEquals(item.getName(), expectedName);
		assertEquals(item.getQuantity(), expectedQuantity);
	}
	
	

}
