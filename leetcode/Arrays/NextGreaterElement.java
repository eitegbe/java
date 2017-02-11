public class NextGreaterElement {
	

	public static void main(String[] args) {

		int[] arrays = new int[]{98,54,12,20};

		int[] result = findNextElement(arrays);
		for (int i: result) {
			System.out.println(i);
		}


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


}