package ru.lesson1;

/* lesson 2 Задание 1
public class mainApp {
    public static void main(String[] args){
        int massiv[] = new int[10];
        massiv[0] = 1;
        massiv[1] = 1;
        massiv[2] = 0;
        massiv[3] = 0;
        massiv[4] = 1;
        massiv[5] = 0;
        massiv[6] = 1;
        massiv[7] = 1;
        massiv[8] = 0;
        massiv[9] = 0;
        for (int i = 0; i<10; i++)
        {
            System.out.print(massiv[i]) ;
        }
        System.out.println();
        for (int i =0; i<10; i++)
        {
            if (massiv[i] == 0)
            {
                massiv[i] = 1;
            }
            else
            {
                massiv[i] = 0;
            }
            System.out.print(massiv[i]) ;
        }


    }
}

*/

/* Задание 2
public class mainApp {
    public static void main(String[] args) {
        int massiv[] = new int[8];
        int a = 0;
        for (int i = 0; i<8; i++)
        {
              massiv[i] = a;
              a = a + 3;
        }
        for (int i = 0; i<8; i++)
        {
            System.out.print(massiv[i] + " ") ;
        }
    }
}
*/

/* Задание 3
public class mainApp {
    public static void main(String[] args) {
        int massiv[] = new int[12];
        massiv[0] = 1;
        massiv[1] = 5;
        massiv[2] = 3;
        massiv[3] = 2;
        massiv[4] = 11;
        massiv[5] = 4;
        massiv[6] = 5;
        massiv[7] = 2;
        massiv[8] = 4;
        massiv[9] = 8;
        massiv[10] = 9;
        massiv[11] = 1;
            for (int i = 0; i<12; i++)
        {
            System.out.print(massiv[i] + " ") ;

        }
        System.out.println();
            for (int i =0; i<12; i++)
            {
                if (massiv[i] <6) {
                    massiv [i] = massiv [i] * 2;
                }

            }
        for (int i = 0; i<12; i++)
        {
            System.out.print(massiv[i] + " ") ;
        }

    }
    }

 */
/* Задание 4
public class mainApp {
    public static void main(String[] args) {
        int[][] twoMassiv = {{0, 0, 0}, {0, 0, 0},{0, 0, 0}};

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(" " + twoMassiv[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("----------------------");
        for (int i = 0; i < 3; i++)

        {
            for (int j = 0; j<3; j++)
            {
                if ((i == j) || (i+j == 2)) {
                    twoMassiv[i][j] = 1;
                }
                else {
                    twoMassiv[i][j] = 0;
                }
            }
        }


        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(" " + twoMassiv[i][j] + " ");
            }
            System.out.println();
        }

    }
}

 */
/* Задание 5
public class mainApp {
    public static void main(String[] args) {
        int min = 0;
        int max = 0;
             int massiv[] = new int[10];
         massiv[0] = 7;
         massiv[1] = 13;
         massiv[2] = 22;
         massiv[3] = 4;
         massiv[4] = 64;
         massiv[5] = 13;
         massiv[6] = 41;
         massiv[7] = 55;
         massiv[8] = 43;
         massiv[9] = 2;
            for (int i = 0; i < 10; i++) {
                if (massiv[i] > max) {
                    max = massiv[i];
            }
            for (int j = 0; j < 10; j++) {
               if (massiv[j] < max) {
                   min = massiv[j];
                }

            }

        } System.out.println(max);
       System.out.println(min);
    }

}

 */
/*
public class mainApp {
    public static void main(String[] args) {

int massive[] = {1,1,1,1,1,1,1,1,2,2};
System.out.print(equal(massive));
    }
    public static boolean equal (int[] array)
    {
        int summ1 = 0, summ2 = 0;
        int razdelitel = 6;
        for (int i = 0; i < razdelitel; i++)
        {
            summ1 = summ1 + array[i];
        }
        for (int i = razdelitel; i < 10; i++)
        {
            summ2 = summ2 + array[i];
        }
        boolean b = summ1 == summ2;
        return b;
    }
    }*/
public class mainApp {
    public static void main(String[] args) {

    }
    }