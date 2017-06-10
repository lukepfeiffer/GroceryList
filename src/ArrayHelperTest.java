import static org.junit.Assert.*;

import org.junit.Test;

public class ArrayHelperTest {
	Item itemOne = new Item("Carrots", "5lbs");
	Item itemTwo = new Item("Apple", "5lbs");
	Item itemThree = new Item("Banana", "10lbs");
	Item [] itemArray = { itemOne, itemTwo, itemThree };
	List list = new List("Long list", 100.22, itemArray);
	
	@Test
	public void doubleArraySizeTest() {
		Item [] items = ArrayHelper.doubleArraySize(itemArray);
		assertEquals(items[0], itemArray[0]);
		assertEquals(items[1], itemArray[1]);
		assertEquals(items[2], itemArray[2]);
		assertEquals(items.length, 6);
	}
	
	@Test
	public void nextEmptyIndex(){
		Item [] items = new Item[5];
		items[0] = itemOne;
		int expected = 1;
		int actual = ArrayHelper.nextEmptyIndex(items);	
		
		System.out.println("actual: " + actual + " expected: " + expected);
		assertEquals(expected, actual);
		
		items[1] = itemTwo;
		expected = 2;
		actual = ArrayHelper.nextEmptyIndex(items);	
		System.out.println("actual: " + actual + " expected: " + expected);
		assertEquals(expected, actual);
		
		items[4] = itemThree;
		expected = 2;
		actual = ArrayHelper.nextEmptyIndex(items);	
		System.out.println("actual: " + actual + " expected: " + expected);

		assertEquals(expected, actual);
		
		items[2] = itemThree;
		expected = 3;
		actual = ArrayHelper.nextEmptyIndex(items);	
		System.out.println("actual: " + actual + " expected: " + expected);

		assertEquals(expected, actual);
	}

}
