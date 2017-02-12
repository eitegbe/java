
import java.util.*;

public class NextGreaterElement {
	

	public static void main(String[] args) {

		int[] arrays = new int[]{98,54,12,20};

		/*int[] result = findNextElement(arrays);
		for (int i: result) {
			System.out.println(i);
		}*/
		findNextElementUsingstacks(arrays);

	}

	public static int[] findNextElement(int[] arrays) {
	    if (arrays.length == 0 || arrays == null) {
	    	return new int[]{-1};
	    }

	    int length = arrays.length;
	    int[] result = new int[length];
	    for (int i=0; i<length;i++) {

	    	int j = i+1;
	    	for(;j<length;j++) {
	    		if(arrays[j] > arrays[i]) {
	    			break;
	    		}
	    	}

	    	if (j== length) {
	    		result[i] = -1;
	    	}
	    	else {
	    		result[i] = arrays[j];
	    	}
	    }

	    return result;
	}

	public static void findNextElementUsingstacks(int[] arrays) {
		 if (arrays.length == 0 || arrays == null) {
	    	return;
	    }

	    int length = arrays.length;
	    int[] result = new int[length];
	    Stack<Integer> stack = new Stack<>();

	    for (int i=0;i<length;i++) {
	    	while(!stack.isEmpty() && arrays[i]>stack.peek()) {
	    		System.out.println("The next great element of "+stack.pop() + " is "+arrays[i]);
	    	}
	    	stack.push(arrays[i]);
	    }

	    while(!stack.isEmpty()) {
	    	System.out.println("The next great element of "+stack.pop() + " is "+ -1);
	    }
	}


}