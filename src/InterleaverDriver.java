/**
 * CISC 380
 * Algorithms Assignment X
 *
 * Driver file for the Interleaver class
 * Tests the isInterleaved method.
 *
 *
 *  This driver file contains example test cases to get you started.
 *  You should include more test cases to ensure that your implemenetation works correctly.
 *  You do NOT need to submit this file.
 *
 * @author Daniel Taufiq
 * Due Date: 03/16/2020
 */

public class InterleaverDriver{


    public static void main(String[] args){
        try{
            Interleaver interleaver = new Interleaver();

            System.out.println( interleaver.isInterleaved("abc","dcab","abdccab") ); //true
            System.out.println( interleaver.isInterleaved("abc","dcab","acdcbab") ); //false
            System.out.println( interleaver.isInterleaved("abc","","abc") ); //true
            System.out.println( interleaver.isInterleaved("aabcc","dbbca","aadbbcbcac") ); //true
            System.out.println( interleaver.isInterleaved("aabcc","dbbca","aadbbbaccc") ); //false
			System.out.println( interleaver.isInterleaved("xxy","xxz","xxzxxxy") ); //false
			System.out.println( interleaver.isInterleaved("XY", "WZ", "WZXY") ); //true
			System.out.println( interleaver.isInterleaved("XY", "X", "XXY") ); //true
			System.out.println( interleaver.isInterleaved("YX", "X", "XXY") ); //false
			System.out.println( interleaver.isInterleaved("XXY", "XXZ", "XXXXZY") ); //true
			System.out.println( interleaver.isInterleaved("ade", "ab", "adabe") ); //true
			System.out.println( interleaver.isInterleaved("", "", "") ); //true

        }catch( Exception e){
            e.printStackTrace();
        }


    }//main


}