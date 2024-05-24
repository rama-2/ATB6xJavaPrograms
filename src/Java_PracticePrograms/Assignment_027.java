package Java_PracticePrograms;
//Java program to find the largest of the Array elements
public class Assignment_027 {
    public static void main(String[] args) {
        int[] array = {23, 64, 10, 220, 405};
        int max =0;

        for (int i = 0; i < array.length ; i++)
        {
            if(array[i]> max)
            {
                max = array[i];
            }

        }
        System.out.println(max);
    }
}
