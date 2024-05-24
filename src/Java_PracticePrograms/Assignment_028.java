package Java_PracticePrograms;

//Java Program to Print only diagonal elements from 2X2 Array.
public class Assignment_028 {
    public static void main(String[] args) {
        int[][] array ={{3,4,5},
                        {6,8,9},
                        {9,2,6}};
       // o/p should be 3,8,6
       // System.out.println(array.length);
        for (int i = 0; i < array.length; i++)
        {
            for (int j = 0; j < array.length; j++)
            {
                if(i == j)
                {
                    System.out.println(array[i][j]);
                }
            }

        }

    }
}
