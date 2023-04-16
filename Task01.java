import java.io.File;
import java.io.FileWriter;

public class Task01 {

    public static void main(String[] args) {
    /*Реализуйте 3 метода, чтобы в каждом из них получить разные исключения*/
        System.out.print(getFileSize(new File("333")));
        System.out.print(div(10, 0));
        outputValue();
        
    }


    public static long getFileSize(File file){
        if(!file.exists()){
            return -1;
        }
        return file.length();
    }
 
    public static int div(int a, int b)  {

    if (b == 0){
      throw new RuntimeException(" На ноль делить запрещено!");
    } 
    return a/b;

    }

    public static void outputValue(){
        int[] array = new int[10];
        System.out.print(array[1000]);
    } 
}