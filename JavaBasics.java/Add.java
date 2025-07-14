public class Add{
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        swap(a, b);
        // swap(a, b); // This will still print 10, as swap does not change a and b
        System.out.print(a);
    }

    public static void swap(int num1, int num2){
        int temp = num1;
        num1 = num2;
        num2 = temp;
        

    }
}