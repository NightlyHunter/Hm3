import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by night on 12.07.2017.
 */
public class Hm3 {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);

        System.out.print("Введите размер массива: ");
        int arrSize = data.nextInt();
        int testArray[] = new int[arrSize];
        System.out.print("Введите элементы массива:");
        for (int i=0; i<testArray.length; i++){
            testArray[i] = data.nextInt();
        }
        int min = testArray[1];
        for (int i=0; i<testArray.length; i++){
            if (min>testArray[i])
                min=testArray[i];
        }

        int max = testArray[1];
        for (int i=0; i<testArray.length; i++){
            if (max<testArray[i])
                max=testArray[i];
        }
        System.out.println("Минимальное число = "+min+" \nМаксимальное число = "+max);
        int b=0;
        for (int i=0; i<testArray.length; i++){
            if (testArray[i]==5) b++;
        }
        System.out.println("Количество чесел 5 в массиве = "+b);

        Arrays.sort(testArray);

        System.out.println("Отсортированный массив:");
        for (int i=0; i<testArray.length; i++){
            System.out.print(testArray[i]);
        }
    }
}
