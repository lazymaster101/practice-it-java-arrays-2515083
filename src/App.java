import java.util.Arrays;

import javax.swing.text.DefaultStyledDocument.ElementSpec;

public class App {
  
  public static Object[] rotateRight(Object[] arr) {
	  Object[] newarr=new Object[arr.length];
    for(int x=0; x<newarr.length; x++){
        if(x==0){
          newarr[x]=arr[arr.length-1];
        }
        else{
          newarr[x]=arr[x-1];
        }
    }
    // newarr[0]=arr[arr.length-1];
    // newarr[1]=arr[0];
    // newarr[2]=arr[1];
    // newarr[3]=arr[2];
    // newarr[4]=arr[3];
    return newarr;
  }
  
  public static void main(String args[]) {
    Object[] arr = new Integer[] {1, 2, 3, 4, 5};
      
    arr = rotateRight(arr);
    System.out.println(Arrays.toString(arr));
    arr = rotateRight(arr);
    System.out.println(Arrays.toString(arr));
    arr = rotateRight(arr);
    System.out.println(Arrays.toString(arr));
    arr = rotateRight(arr);
    System.out.println(Arrays.toString(arr));
    arr = rotateRight(arr);
    System.out.println(Arrays.toString(arr));
    
    Object[] arr2 = new String[] {"Hello", "there", "my friend"};
    
    arr2 = rotateRight(arr2);
    System.out.println(Arrays.toString(arr2));
    arr2 = rotateRight(arr2);
    System.out.println(Arrays.toString(arr2));
    arr2 = rotateRight(arr2);
    System.out.println(Arrays.toString(arr2));
  }
}