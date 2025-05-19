class Addition{
  public int add(int n1,int n2,int n3){
    return n1+n2+n3;
  }
  public int add(int n1,int n2){
    return n1+n2;
  }
  public double add(double n1,int n2){
    return n1+n2;
  }
}
class methodOverLoading{
  public static void main(String[] args){
    Addition obj=new Addition();
    int res=obj.add(9,8);
    System.out.println(res);
  }
}
