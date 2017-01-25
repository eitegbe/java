public class Stacks {
	private int size;
	private int index;
	private int[] stacks;

	public Stacks(int size) {
		this.size = size;
		this.stacks = new int[size];
		this.index = 0;
	}

	public boolean isEmpty() {
		return this.index == 0;
	}

	public void push(int a) {
		if(this.isFull()) {
		  this.resize();
		}
        
		stacks[index] = a;
		index++;
	}

	public int peek() {
		if (this.isEmpty()) {
			return -1;
		}

		int a = stacks[index-1];
		return a;
	}

	private boolean isFull() {
		return this.index == this.size;
	}

	public int pop() {
		if (this.isEmpty()) {
			System.out.println("Is Empty..");
			return -1;
		} 
		int a = stacks[index];
		index--;
		return a;
	}

	private void resize() {
		int size = 2 * this.index;
		int[] temp = new int[size];
		int l = temp.length;
		for (int i=0;i<this.index;i++) {
			temp[i] = this.stacks[i];
		}

		this.size = l;

		this.stacks = temp;
	}

	public int count() {
		return this.index;
	}

	public int capacity() {
		return this.size;
	}

	public static void main(String[] args) {
			Stacks s = new Stacks(2);
			s.push(10);
			s.push(12);
			s.push(7);
			System.out.println(s.peek());
			s.push(11);
			s.push(20);
			System.out.println(s.count());
			System.out.println(s.capacity());
	}
}