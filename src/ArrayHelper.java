public class ArrayHelper {
	public static Item [] doubleArraySize(Item [] items){
		int length = items.length;
		Item[] returnArray = new Item[length*2];
		System.out.println(returnArray.length);
		for(int i = 0; i < length; ++i){
			returnArray[i] = items[i];
		}
		
		return returnArray;	
	}
	
	
	public static int nextEmptyIndex(Item [] items){
		int index = -1;
		
		for(int i = 0; i < items.length; ++i){
			if(items[i] == null){
				index = i;
				break;
			}
		}
		
		return index;
	}
}