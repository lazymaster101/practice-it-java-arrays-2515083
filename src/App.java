public class App {
  
  public static void printTriangle(Object[] arr) {
    for(int x=0; x<arr.length; x++){
      for(int y=0; y<=x; y++){
        System.out.print(arr[y]);
      }
      System.out.println();
    }
 }
    
  public static void main(String args[]) {
    printTriangle(new Integer[] {1, 2, 3, 4});
    printTriangle(new Character[] {'A', 'B', 'C', 'D', 'E'});
    printTriangle(new String[] {});
    printTriangle(new String[] {"Hello"});
    printTriangle(new String[] {"Hello", "There", "Friend"});
  }
}