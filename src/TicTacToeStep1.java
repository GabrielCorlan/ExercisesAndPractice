import java.util.Scanner;

public class TicTacToeStep1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String symbol = sc.nextLine();

        char[] arr = symbol.toCharArray();

        char[][] arr2 = new char[3][3];


        System.out.println("---------");
        int cell = 0;
            for (int i = 0; i < arr2.length; i++){

                System.out.print("| ");
                for (int j = 0; j < arr2[i].length; j++){

                    arr2[i][j] = arr[cell];

                    System.out.print(arr2[i][j] + " ");
                    cell++;

                }
                System.out.println("|");
            }



        System.out.println("---------");




        /*Description
In this stage, you should write a program that reads 9 symbols from the input and writes an appropriate 3x3 field.
Elements of the field can contain only 'X', 'O' and '_' symbols.

Note, that field has a specific format and should start and end with ---------, all lines in between should start and
end with '|' symbol and everything in the middle should be separated with a single space.

Examples
Examples below show how your output should look.

Example 1:

Enter cells: O_OXXO_XX
---------
| O _ O |
| X X O |
| _ X X |
---------
Example 2:

Enter cells: OXO__X_OX
---------
| O X O |
| _ _ X |
| _ O X |
---------
Example 3:

Enter cells: _XO__X___
---------
| _ X O |
| _ _ X |
| _ _ _ |
---------*/
    }
}
