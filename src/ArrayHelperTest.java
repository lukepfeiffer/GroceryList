import static org.junit.Assert.*;

import org.junit.Test;

public class ArrayHelperTest {
	Item itemOne = new Item("Carrots", "5lbs");
	Item itemTwo = new Item("Apple", "5lbs");
	Item itemThree = new Item("Banana", "10lbs");
	Item [] itemArray = { itemOne, itemTwo, itemThree };
	List list = new List("Long list", 100.22, itemArray);
	
	@Test
	public void test() {
		Item [] items = ArrayHelper.doubleArraySize(itemArray);
		assertEquals(items[0], itemArray[0]);
		assertEquals(items[1], itemArray[1]);
		assertEquals(items[2], itemArray[2]);
		assertEquals(items.length, 6);
	}

}
