
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static <T extends Comparable<T>> T findMax(T a,T b,T c){
       T max= a;
        if(b.compareTo(max)>0){
            max=b;
        }
        if(c.compareTo(max)>0){
            max=c;
        }
        return max;
    }
    public static void main(String[] args) {
        System.out.println("Welcome to MIN-MAX Program");
        System.out.println("Max integer 1st :" + findMax(9,6,3));
        System.out.println("Max float 2nd :" + findMax(6.2,9.5,3.6));
        System.out.println("Max in 3rd :" + findMax(3,6,9));
    }
}