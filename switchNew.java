class switchNew{
  public static void main(String[] args){
    String day="Tuesday";
    String res="";
    switch(day){
      case "Monday","Tuesday" -> return res="6am";
      case "Wednesday","Thursday","Friday" ->return res="7am";
      default -> res="10am";  
    };
    System.out.println(res);
  }
