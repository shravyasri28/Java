class Application{
  public void playMusic(){
    System.out.println("Music is Playing...");
  }
  public String getMeAPen(int cost){
    if(cost>=8)
      return "Pen Delivered";
    else
      return "Not Delivered";
  }
}
class methods{
  public static void main(String[] args){
    Application obj=new Application();
    obj.playMusic();
    String pen=obj.getMeAPen(10);
    System.out.println(pen);
  }
}
