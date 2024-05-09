package Lab_04052024;

public class Lab_001 {

    public static void main(String[] args) {
        //2d arrays -> which has rows and columns in an aray.
        //rows -> Harizontal
        //columns -> vertical

        int [][] array_2d = {
                {12, 13, 14},
                {12, 13, 55},
                {43,55, 12}
        };

        //another way of declaring 2d array

        int[][] array_2d_2  = new int[3][3];
        //When we just initialize array, it will have default value as Zero.
        //[0,0,0]
        //[0,0,0]
        //[0,0,0]
       // int array_2d_2[0][1] = 32;
        for (int i = 0; i < array_2d.length; i++)
        {
            for (int j = 0; j < array_2d[i].length; j++) {
                System.out.println(array_2d[i][j]);
            }
        }
    }
}
