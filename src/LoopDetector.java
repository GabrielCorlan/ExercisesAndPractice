import java.util.Scanner;

public class LoopDetector {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int input;

        int ready = 0;
        int toFix = 0;
        int reject = 0;

        for (int i = 0; i < n; i++){
            input = sc.nextInt();
            if(input == 1) toFix++;
            else if (input == -1) reject++;
            else if (input == 0) ready++;
        }
        System.out.println(ready + " " + toFix + " " + reject);


        /*A detector compares the size of parts produced by a machine with the reference standard.

If the size of the part is larger, it can be sent to be fixed, and the detector prints the number 1.
If the size of the part is smaller, it is removed as a reject, and the detector prints the number -1.
If the part is perfect, it is sent to the box with products, that are ready to ship, and the detector prints 0.

Write a program, which takes the number of parts n as input, and then the sequence of detector prints.
The program should output numbers in a single line containing the number of parts ready to be shipped,
the number of parts to be fixed, and the number of rejects.

Sample Input 1:

14
0
-1
-1
1
0
0
0
0
0
1
0
-1
1
-1
Sample Output 1:

7 3 4*/
    }
}