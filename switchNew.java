class switchNew{
  public static void main(String[] args){
    String day="Tuesday";
    String res="";
    res=switch(day){
      case "Monday","Tuesday" -> "6am";
      case "Wednesday","Thursday","Friday" ->"7am";
      default -> "10am";  
    };
    System.out.println(res);
    String day1="Friday";
    String res1="";
    res1=switch(day1){
        case "Monday","Tuesday" :yield "6am";
      case "Wednesday","Thursday","Friday" :yield "7am";
      default :yield "10am";  
    };
    System.out.println(res1);
  }
}
