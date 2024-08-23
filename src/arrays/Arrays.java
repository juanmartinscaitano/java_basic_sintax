package arrays;

public class Arrays {
    public static void main(String[] args) {
        Integer [] array = new Integer [] {2,4,10,15,5,3};


        System.out.println("index 3 = " + array [3]);

        for (int i=0; i < array.length; i++) {
            Integer elemento = array [i];
            System.out.println(elemento);
        }
    }

}
