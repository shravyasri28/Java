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
    String day="Friday";
    String res="";
    res=switch(day){
        case "Monday","Tuesday" :yield "6am";
      case "Wednesday","Thursday","Friday" :yield "7am";
      default :yield "10am";  
    };
    System.out.println(res);
  }
