//Q3: Java program to implement two Stacks in a single array.
import java.util.*;
class Stacks2{
	int[] ar;
	int size;
	int top1, top2;
	Stacks2(int n){
		size = n;
		ar = new int[n];
		top1 = n / 2 + 1;
		top2 = n / 2;
	}
	
	void push1(int a){
		if(top1>0){
			top1--;
			ar[top1]=a;
		}
		else{
			//System.out.println("Stack overflow : "+a);
			return;
		}
	}
	
	void push2(int a){
		if(top2< size-1){
			top2++;
			ar[top2]=a;
		}
		else{
			//System.out.println("Stack overflow: " +a);
			return;
		}
	}
	int pop1(){
		if(top1<= size/2){
			int a = ar[top1];
			top1++;
			return a;
		}
		else{
			System.out.print("Stack Underflow ");
			System.exit(1);
		}
		return 0;
	}
	
	int pop2(){
			if(top2 >= size / 2 + 1){
				int a = ar[top2];
				top2--;
				return a;
			}
			else{
				System.out.print("Stack Underflow");
				System.exit(1);
			}
			return 1;
	}
};
class Q3{
	public static void main(String[] args){
		Stacks2 r = new Stacks2(5);
		r.push1(5);
		r.push2(10);
		r.push2(40);
		r.push1(11);
		r.push2(7);
		r.push2(15);
		System.out.println("Popped element from stack1 is "+r.pop1());
		
		System.out.println("Popped element from stack2 is "+r.pop2());
	}
	
	
}