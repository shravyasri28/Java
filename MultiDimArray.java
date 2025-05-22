class MultiDimArray{
  public static void main(String[] args){
    int arr[][]=new int[3][4];
    arr[0][0]=12;
    arr[0][1]=12;
    arr[0][2]=12;
    arr[0][3]=12;
    arr[1][0]=12;
    arr[1][1]=12;
    arr[1][2]=12;
    arr[1][3]=12;
    arr[2][0]=12;
    arr[2][1]=12;
    arr[2][2]=12;
    arr[2][3]=12;
    for(int i=0;i<=2;i++){
      for(int j=0;j<=3;j++){
        System.out.print(arr[i][j]);
      }
      System.out.println();
    }
    int arr1[][]=new int[3][4];
    for(int i=0;i<=2;i++){
      for(int j=0;j<=3;j++){
        arr1[i][j]=(int)((Math.random)*10);
      }
    }
    for(int i=0;i<=2;i++){
      for(int j=0;j<=3;j++){
        System.out.print(arr1[i][j]);
      }
      System.out.println();
    }
    for(int n[]:arr){
      for(int m:n){
        System.out.println(m+" ");}
      System.out.println();
    }
  }
}
    
