class whileLoop{
  public static void main(String[] args){
    int i=0;
    while(i<=3){
      System.out.println("Hai" + i);
      int j=0;
      while(j<=2){
        System.out.println("Hello" + j);
        j++;
      }
      i++;
    }
    System.out.println("Bye" + i);
  }
}
