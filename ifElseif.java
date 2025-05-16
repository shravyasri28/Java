class ifElseif{
  public static void main(String[] args){
    int x=12;
    int y=748;
    int z=89;
    if(x>y && x>z)
      System.out.println(x);
    else if(y>x && y>z)
      System.out.println(y);
    else
      System.out.println(z);
  }
}
