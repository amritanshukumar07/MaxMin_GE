import javax.xml.transform.dom.DOMLocator;
import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class GenMax<T extends Comparable<T>> {
    private T [] elements;
    public GenMax(T... elements){
        this.elements= elements;

    }
    public T findMax(){
        return  findMax(elements);
    }
    public T findMax(T... elements){
        T max= elements[0];
        for(T value : elements){
            if(value.compareTo(max)>0){
                max=value;
            }
        }
        printMax(max);
        return max;
    }

    public void printMax(T max){
        System.out.println("Max value from print function: "+max);
    }

    }
    public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter strings separated by space");
            try{
                String line= sc.nextLine();
                String[] strings = line.split(" ");
                GenMax<String> strMax= new GenMax<>(strings);
                System.out.println("Max string: "+ strMax.findMax());
            }
            catch (Exception e){
                System.out.println("Enter some strings");
            }

            System.out.println("Enter space separated integers");
            try{
                String line = sc.nextLine();
                String[] intStr= line.split(" ");
                Integer[] integers = new Integer[intStr.length];
                for(int i=0;i<intStr.length;i++){
                    integers[i]= Integer.parseInt(intStr[i]);
                }
                GenMax<Integer> intMax= new GenMax<>(integers);
                System.out.println("Max Integer: " + intMax.findMax());
            }
            catch (Exception e){
                System.out.println("Error!! Pleaase provide some integers");
            }
            System.out.println("Enter floats searated by space");
            try {
                String line = sc.nextLine();
                String[] floatStr= line.split(" ");
                Float[] floats= new Float[floatStr.length];
                for(int i=0; i< floatStr.length;i++){
                    floats[i]=Float.parseFloat(floatStr[i]);

                }
                GenMax<Float> floatMax=  new GenMax<>(floats);
                System.out.println("Max Float: "+ floatMax.findMax());
            }
            catch (Exception e){
                System.out.println("Enter float");
            }

            sc.close();
        }
    }