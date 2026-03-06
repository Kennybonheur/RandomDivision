import java.util.random.RandomGenerator;
public class division{
    public static int[] generate(int start, int end, int sz){
        RandomGenerator generator = RandomGenerator.getDefault();
        int [] numbers = new int[sz];
        
        for (int i=0; i<sz; ++i)
            if (generator.nextInt(start, end) != 0)
                numbers[i] = generator.nextInt(start, end);
        
        return numbers;
    }
    

    public static void printArray( int[] numbers) {
        for (int n : numbers) {
            System.out.print(n + " ");
        }
        System.out.println();
    }
    public static void calculate(int []numbers){
        double[] div = new double[numbers.length-1];
        for (int i =0; i<numbers.length-1; ++i){
            div[i] = (double) numbers[i]/numbers[i+1];
            System.out.print(numbers[i] + "/" + numbers[i+1] + " = " + div[i] + "\n");
        }

    }
        
    

    public static void main (String []args){
        int[] numbers = generate(1, 20, 30);
        System.out.print("The generated values:\n");
        printArray(numbers);
        System.out.println("The result of the division is:\n ");
        calculate(numbers);

    }
}