class forLoop{
  public static void main(String[] args){
    for(int i=1;i<=7;i++){
      System.out.println("DAY" +i);
      for(int j=0;j<=7;j++){
        System.out.println("  "+(j+9) +" - "+ (j+10));
      }
    }
  }
}
