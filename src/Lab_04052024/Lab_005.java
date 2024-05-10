package Lab_04052024;
//Maximum of 2D array.
public class Lab_005 {
    public static void main(String[] args) {
        int[][] array = {{2,3,4},{15,7,9},{7,8,10}
        };
        int max_sal =0;
        for (int i = 0; i <=array.length-1; i++)
        {
            for (int j = 0; j <=array.length-1 ; j++)
            {
                if(max_sal<array[i][j])
                {
                    max_sal = array[i][j];

                }
            }
        }
        System.out.println(max_sal);
    }
}
