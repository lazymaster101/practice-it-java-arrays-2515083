import java.util.Arrays;

public class App {

  public static void moveZerosToTheEnd(int[] arr) {
    for(int x=0; x<arr.length; x++){
      if(arr[x]==0){
        for(int y=x; y<arr.length; y++){
          if(arr[y]!=0){
            arr[x]=arr[y];
            arr[y]=0;
            break;
          }
        }
      }
    }
  }

  public static void main(String[] args) {
    int[] arr = new int[] {1, 1, 0, 0, 0, 1, 0};
    System.out.println(Arrays.toString(arr));
    moveZerosToTheEnd(arr);
    System.out.println(Arrays.toString(arr));
    System.out.println();

    int[] arr2 = new int[] {0, 0, 1, 2, 3, 0, 4};
    System.out.println(Arrays.toString(arr2));
    moveZerosToTheEnd(arr2);
    System.out.println(Arrays.toString(arr2));
    System.out.println();

    int[] arr3 = new int[] {0, 0};
    System.out.println(Arrays.toString(arr3));
    moveZerosToTheEnd(arr3);
    System.out.println(Arrays.toString(arr3));
    System.out.println();

    int[] arr4 = new int[] {2, 9, 1};
    System.out.println(Arrays.toString(arr4));
    moveZerosToTheEnd(arr4);
    System.out.println(Arrays.toString(arr4));
    System.out.println();

    int[] arr5 = new int[] {0, 10, 0};
    System.out.println(Arrays.toString(arr5));
    moveZerosToTheEnd(arr5);
    System.out.println(Arrays.toString(arr5));
    System.out.println();

    int[] arr6 = new int[] {3, 0, 0};
    System.out.println(Arrays.toString(arr6));
    moveZerosToTheEnd(arr6);
    System.out.println(Arrays.toString(arr6));
    System.out.println();

    int[] arr7 = new int[] {};
    System.out.println(Arrays.toString(arr7));
    moveZerosToTheEnd(arr7);
    System.out.println(Arrays.toString(arr7));
    System.out.println();
  }
}