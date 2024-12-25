import javax.xml.transform.dom.DOMLocator;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main<T extends Comparable<T>> {
    private T a,b,c;

    public Main(T a, T b, T c){
        this.a=a;
        this.b=b;
        this.c=c;

    }
    public T findMax(){
        return  findMax(a,b,c);
    }
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
        Main<Integer> intMax= new Main<>(9,6,1);
        System.out.println("Max Integer : "+intMax.findMax());
        Main<Double> floatMax= new Main<>(6.2,9.5,3.6);
        System.out.println("Max Float"+ floatMax.findMax());
        Main<String> stringMax= new Main<>("guava","tea","zineapple");
        System.out.println("Maximum String : "+ stringMax.findMax());
        }
}