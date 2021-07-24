class test8{
public int subtractionNumbers(int a,int b){
int sub=a-b;
return sub;
}
public static void main (String[] args){
int num1=40,num2=30,result;
test8 y=new test8();
result=y.subtractionNumbers(num1,num2);
System.out.println("subtraction of"+" "+num1+" "+"and"+" "+num2+" "+"is"+" "+ result );
}
}