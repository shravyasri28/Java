class Calculator{
  public int add(n1,n2){
    int r=n1+n2;
    return r;
  }
}
class Demo{
  public static void main(String[] args){
    int num1=2;
    int num2=8;
    Calculator obj=new Calculator;
    int result=obj.add(num1,num2);
    System.out.println(result);
  }
}
