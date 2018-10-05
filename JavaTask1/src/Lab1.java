import java.util.Scanner;
class Lab1 {
    public static void main(String[] args)
    {
        System.out.println("Ведіть розмір матриці: ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[][] matrix = new int[n][n];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 100);
            }
        }
        System.out.println("Сгенерована матриця:");
        for (int i =0;i<matrix.length;i++,System.out.println())
        {
            for (int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
        }
        for (int i = 0; i < matrix.length; i++)
        {
            for (int start = 0, end = matrix[i].length - 1; start < end; start++, end--)
            {
                int temp = matrix[i][start];
                matrix[i][start] = matrix[i][end];
                matrix[i][end] = temp;
            }
        }
        System.out.println("Після виконання дій:");
        for (int i =0;i<matrix.length;i++,System.out.println())
        {
            for (int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
        }


    }
}