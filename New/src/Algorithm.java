
public class Algorithm {
	
	//Encapsulation implementation
	
	private String name;
	
	//Set method
	void set(String name) {
		this.name = name;
	}
	
	//Get method
	void get() {
		System.out.println(this.name);
	}
	
	public Algorithm(String lName) {
		System.out.println(lName);
	}
	
	//stack implementation
	public class Stack{
		String arr[];
		int maxSize;
		int num = 0;
		
		public Stack(int size) {
			maxSize = size;
			arr = new String[maxSize];
		}
		
		void push(String data) {
			this.arr[num] = data;
			num = num + 1;
		}
		
		String pop() {
			return arr[num--];
		}
		
		void empty() {
			
		}
		
		void printArray() {
			for(String list:arr) {
				System.out.println(list);
			}
		}
		
		String myName = "muzo";
	}
	
	public static void main(String[] args) 
	{
		Algorithm setterGetter = new Algorithm("muzo");
		//Algorithm constructor = new Algorithm();
		
		//setterGetter.set("abubakar");
		//setterGetter.get();
		

		Algorithm.Stack stack = setterGetter.new Stack(4);
		
		stack.push("abdallah");
		stack.push("mussa");
		stack.pop();
		stack.printArray();
	}

}




