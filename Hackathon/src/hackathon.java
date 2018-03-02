import java.io.*;
import java.util.*;
public class hackathon {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double number1 = scan.nextDouble();
        double number2 = scan.nextDouble();
        int lines = scan.nextInt();
        for(int i = 0; i< lines; i++){
            double input = scan.nextDouble();
            String type = scan.next();
            if (type.equals("A"))
                System.out.println(input*(number2/number1));
            else 
                System.out.println(input*(number1/number2));
        }
    }
}

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int N = scan.nextInt();
        int M = scan.nextInt();
        for (int i=0;i<M;i++){
            int time=s.nextInt();
        }
    }
}