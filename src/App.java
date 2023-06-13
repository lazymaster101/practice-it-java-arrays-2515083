public class App {
  
  public static Integer findSecondSmallestItem(Integer[] arr) {
    if(arr.length==0||arr.length==1){
      return null;
    }
    // int smallest=arr[0];
    // int secondsmallest=smallest;
    // for(int x=0; x<arr.length; x++){
    //   if(arr[x]<smallest){
    //     int temp=smallest;
    //     smallest=arr[x];
    //     secondsmallest=temp;
    //   }
    //   else if(arr[x]<secondsmallest){
    //     secondsmallest=arr[x];
    //   }
    // }
    // return secondsmallest;
  }
    
  public static void main(String args[]) {
    Integer[] arr = new Integer[]{ 5, 8, 3, 2, 6 };
    System.out.println(findSecondSmallestItem(arr));
    
    Integer[] arr2 = new Integer[]{ 3, 8, 5, 2, 6 };
    System.out.println(findSecondSmallestItem(arr2));
    
    Integer[] arr3 = new Integer[]{ 6, 8, 5, 2, 3 };
    System.out.println(findSecondSmallestItem(arr3));
    
    Integer[] arr4 = new Integer[]{ 3, 3, 3, 3, 3 };
    System.out.println(findSecondSmallestItem(arr4));
    
    Integer[] arr5 = new Integer[]{ 3, 3, 3, 2, 3 };
    System.out.println(findSecondSmallestItem(arr5));
    
    Integer[] arr6 = new Integer[]{ 3, 4, 3, 3, 3 };
    System.out.println(findSecondSmallestItem(arr6));
    
    Integer[] arrEmpty = new Integer[] {};
    System.out.println(findSecondSmallestItem(arrEmpty));
    
    Integer[] arrOne = new Integer[] { 1 };
    System.out.println(findSecondSmallestItem(arrOne));
    }
}