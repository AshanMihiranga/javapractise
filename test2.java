class test2{
public void meth1(){
System.out.println("the program");
}
public void meth2(){
System.out.println("is still loading");
}
public static void main(String[] args){
test2 x=new test2();
x.meth1();
x.meth2();
x.meth3();
}
public void meth3(){
System.out.println("wait");
}
}