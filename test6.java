class test6{
public int addNumbers(int a,int b){
int sum=a+b;
return sum;
}
public static void main (String[]nargs){
int num1=10,num2=30,result;
test6 y=new test6();
result=y.addNumbers(num1,num2);
System.out.println("sum of" +num1 + "and" +num2+ "is" + result );
}
}