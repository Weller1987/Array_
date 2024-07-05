package array_67;

import java.util.Arrays;
import java.util.Scanner;

public class array_02 {

	public static void main(String[] args) {
        int[] x = {1, 4, 23, 7, 82, 12, 43, 21, 36, 3};
        char[] y = {'a', 'b', 'c'};
        char[] fnameChar = new char[20]; 
        String fnameString; 
        boolean[] bool1 = {true, false, true, false, false};
        float[] f = {0.11030885f, 0.30249763f, 0.25212837f, 0.17135252f, 0.24648858f, 0.84376765f};
        
        System.out.println("size array x: " + x.length);
        System.out.println("size array y: " + y.length);
        System.out.println("size array bool1: " + bool1.length);
        System.out.println("size array f: " + f.length);

        System.out.println("starting address x: " + Arrays.hashCode(x));
        System.out.println("end address x: " + (Arrays.hashCode(x) + x.length - 1));

        System.out.println("starting address y: " + Arrays.hashCode(y));
        System.out.println("end address y: " + (Arrays.hashCode(y) + y.length - 1));

        System.out.print("name: ");
        @SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
        fnameChar = scanner.nextLine().toCharArray();

        System.out.println("size fnameChar: " + fnameChar.length);

        System.out.println("starting address fnameChar: " + Arrays.hashCode(fnameChar));

        System.out.println("end address fnameChar: " + (Arrays.hashCode(fnameChar) + fnameChar.length - 1));

        fnameString = new String(fnameChar);

        System.out.println("size fnameString: " + fnameString.length());

        System.out.println("starting address fnameString: " + System.identityHashCode(fnameString));

        System.out.println("end address fnameString: " + (System.identityHashCode(fnameString) + fnameString.length() - 1));

	}

}
