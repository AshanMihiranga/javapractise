class Fibonacci {
	public static void main(String args[]){
		int num1=0,num2=1,fib;
		System.out.print("0 1");
		int count;
		for(count=3;count<=10;count++){
			fib=num1+num2;
			num1=num2;
			num2=fib;
			System.out.print(" "+ fib);
			}
			System.out.println(" are the fibonacci numbers upto "+count);	
			}
		}
	
