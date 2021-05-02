import java.util.Scanner;
import java.util.ArrayList;
public class minecraft {
	
	static ArrayList<Integer> stackList = new ArrayList<Integer>();
	static ArrayList<Integer> remainingList = new ArrayList<Integer>();
	static ArrayList<Object> master = new ArrayList<>();
	
	public static ArrayList<Integer> stringToInt(ArrayList<String> stringNums) {
		
		ArrayList<Integer> temp = new ArrayList<Integer>(stringNums.size());
		
		for(int i = 0; i < stringNums.size(); i++) {
			temp.add(Integer.parseInt(stringNums.get(i)));
		}
		
		
		return temp;
	}
	
	public static void convertToStack(ArrayList<String> n) {
		
		ArrayList<Integer> temp = stringToInt(n);
		
		//convert to stack
		for(int i = 0; i < temp.size(); i++) {
			stackList.add(temp.get(i) / 64);
		}
		
		//obtain remainders
		for(int i = 0; i < temp.size(); i++) {
			remainingList.add(temp.get(i) % 64);
		}
	}
	
	public void zipData(ArrayList<String> x, ArrayList<Integer> y, ArrayList<Integer> z) {
		int size = x.size() + y.size() + z.size();
		
		
		//init master size
		for(int i = 0; i < size; i++) {
			master.add("");
		}
		System.out.println("Master Size: " + master.size());
		
		//input names to master
		for(int i = 0; i < x.size(); i++) {
			if(i == 0) {
				master.set(i, x.get(i));
			}
			else {
				master.set(i + (i * 2), x.get(i));
				
			}
		}
		
		
		//input stacks to master
		for(int i  = 1; i < y.size(); i++) {
			int count = 1;
			if(i == 1) {
				master.set(i, y.get(i));
			}
			else {
				master.set(count + 3, y.get(i));
			}
		}
		
		
	}
	
	
	public void printData(ArrayList<String> x, ArrayList<Integer> y, ArrayList<Integer> z) {
		
		for(int i  = 0; i < x.size(); i++) {
			for(int j  = 0; j < y.size(); j++) {
				for(int k  = 0; k < z.size(); k++) {
					
				}
			}
		}
		
		
	}
	
	
	
	
	
	
	public static void main(String[] args) {
//		Scanner input = new Scanner(System.in);
//		
//		System.out.println("Please input total number: ");
//		int temp = input.nextInt();
//		
//		int stack = temp / 64;
//		int remaining = temp % 64;
//		
//		if(stack == 1) {
//			if(remaining > 0) {
//				System.out.println(stack + " stack and " + remaining);
//			}
//			else {
//				System.out.println(stack + " stack");
//			}
//			
//		}
//		else if(stack > 1) {
//			if(remaining > 0) {
//				System.out.println(stack + " stacks and " + remaining);
//			}
//			else {
//				System.out.println(stack + " stack");
//			}
//			
//		}
		
		
	}

}
