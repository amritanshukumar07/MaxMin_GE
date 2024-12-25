
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static Integer findMax(Integer a,Integer b,Integer c){
        Integer max= a;
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
        System.out.println("Max in 1st :" + findMax(9,6,3));
        System.out.println("Max in 2nd :" + findMax(6,9,3));
        System.out.println("Max in 3rd :" + findMax(3,6,9));
    }
}