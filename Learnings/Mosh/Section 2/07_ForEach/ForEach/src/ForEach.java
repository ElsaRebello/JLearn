public class ForEach {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");
        String array[] = {"Apple", "Mango", "Banana"};

        for (int i = 0; i < array.length; i++ ) {
            System.out.println(array[i]);
        }

        for (String fruit : array) {
            System.out.println(fruit);
        }
    }
}
