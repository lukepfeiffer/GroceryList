public class ArrayHelper {
	public static Item [] doubleArraySize(Item [] items){
		int length = items.length;
		Item[] returnArray = new Item[length*2];
		
		for(int i = 0; i < length; ++i){
			returnArray[i] = items[i];
		}
		
		return returnArray;	
	}
}