class MultiDimArray{
  public static void main(String[] args){
    int arr[][]=new int[3][4];
    arr[0][0]=12;
    arr[0][1]=87;
    arr[0][2]=92;
    arr[0][3]=24;
    arr[1][0]=78;
    arr[1][1]=29;
    arr[1][2]=93;
    arr[1][3]=18;
    arr[2][0]=56;
    arr[2][1]=89;
    arr[2][2]=90;
    arr[2][3]=32;
    for(int i=0;i<=2;i++){
      for(int j=0;j<=3;j++){
        System.out.print(arr[i][j]+" ");
      }
      System.out.println();
    }
    int arr1[][]=new int[3][4];
    for(int i=0;i<=2;i++){
      for(int j=0;j<=3;j++){
        arr1[i][j]=(int)(Math.random()*10);
      }
    }
    for(int i=0;i<=2;i++){
      for(int j=0;j<=3;j++){
        System.out.print(arr1[i][j]+" ");
      }
      System.out.println();
    }
    for(int n[]:arr){
      for(int m:n){
        System.out.print(m+" ");}
      System.out.println();
    }
  }
}
    
