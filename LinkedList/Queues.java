class Nodes<T>  {

	private T data;
	private Nodes<T> next;

	public Nodes(T data) {
		this(data, null);
	}

	public Nodes(T data, Nodes<T> next) {
		this.data = data;
		this.next = next;
	}

	public void setNextNode(Nodes<T> next) {
		this.next = next;
	}

	public Nodes<T> getNextNode() {
		return this.next;
	}

	public T getData() {
		return this.data;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("This data contains value ").append(this.data);
		return sb.toString();
	}
}

public class Queues<T>  {

	private Nodes<T> front;
	private Nodes<T> rear;
	private int count;

    public Queues() {
    	this.front = null;
    	this.rear = null;
    	this.count = 0;
    }

    public boolean isEmpty() {
    	return (this.front == null && this.rear == null) || this.count ==0;
    }

    public void enqueue(T value) {
    	Nodes<T> a = new Nodes<T>(value);
       if (this.isEmpty()) {
       		//Nodes a = new Nodes(value);
       		a.setNextNode(this.rear);
       		this.rear = a;
       		this.front = a;
       }

       else{
       		this.rear.setNextNode(a);
       		this.rear = a;
       }
       this.count += 1;
    }
    public T dequeue() {

    	if(this.isEmpty()) {
    		return null;
    	}
    	T value = this.front.getData();
    	front = front.getNextNode();
    	count -= 1;

    	if (count == 0) {
    		this.front = null;
    		this.rear = null;
    	}
    	return value;
    }

    public T peek() {

    	if(this.isEmpty()) {
    		return null;
    	}

    	T value = this.front.getData();
    	return value;
    }

    public int getCount() {
    	return this.count;
    }

	public static void main(String[] args) {

		Queues<Integer> q = new Queues<>();
		q.enqueue(10);
		q.enqueue(100);
    q.enqueue(200);
    q.enqueue(78);
    q.enqueue(890);
		// System.out.println(q.peek());
  //   System.out.println("Count: "+q.count);
  //   System.out.println("Pop: "+q.dequeue());
  //   System.out.println("Count: "+q.count);
    while(!q.isEmpty()) {
      System.out.println("Count: "+q.getCount());
       //= q.deque();
      System.out.println(q.dequeue());
      System.out.println("New Count: "+q.getCount());
    }

	}
}