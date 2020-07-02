/**
 * CISC 380
 * Algorithms Assignment 3
 *
 * Implements a dynamic programming solution to the Interleaving Strings problem.
 *
 * @author Daniel Taufiq
 * Due Date: 03/16/2020
 */

public class Interleaver{

	String Xstring;
	String Ystring;
	String Zstring;
	Boolean I[][];

    public Interleaver(){
        //YOUR CODE HERE
		Xstring = "";
		Ystring = "";
		Zstring = "";


    }//constructor

    /**
     * Finds if the two strings x and y are an interleaving of string z
     *
     * The string Z is an interleaving of X and Y if it can be obtained
     * by interleaving the characters in X and Y in a way that
     * maintains the left-to-right order of the c in X and Y:
     *
     * @param x the first string that composes an interleaving
     * @param y the second string that composes an interleaving
     * @param z the string to check for an interleaving
     * @return True, if the string z is an interleaving of x and y. False otherwise.
     *
     */

    /*
    	Runtime:
     */
    public Boolean isInterleaved(String x, String y, String z){

		Xstring = x;//set global Xstring to x
		Ystring = y;//set global Ystring to y
		Zstring = z;//set global Zstring to z
		I = new Boolean[x.length() + 1][y.length() + 1];

//		//fill the I array to all null
//		for (int i = 0; i < x.length(); i++)
//		{
//			for (int j = 0; j < y.length(); j++)
//			{
//		    	I[i][j] = null;
//			}
//        }

		if(z.length() != (x.length() + y.length()))
		{//z is not the same length as x + y return false
			return false;
		}

		if(z.length() == 0 && x.length() + y.length() == 0)
		{//all empty strings return true
			return true;
		}

		//if(x.length() == 0)
		//{//call isInterleaved, if length of x is 0 don't make -1
			//return isInterleaved(x.length(), y.length() - 1);
		//}
		//else if(y.length() == 0)
		//{//call isInterleaved, if length of y is 0 don't make -1
		//	return isInterleaved(x.length() - 1, y.length());
		//}
		//else
		//{//call isInterleaved as normal
			return isInterleaved(x.length() - 1, y.length() - 1);
		//}

    }//isInterleaved

	private Boolean isInterleaved(int i, int j)
	{
		int zloc = i + j + 1;//get index for z
		//System.out.println("i = " + i);
		//System.out.println("j = " + j);
		//System.out.println("zloc = " + zloc);
		//System.out.println("z = " + Zstring.charAt(zloc));
		//System.out.println("x = " + Xstring.charAt(i));
		//System.out.println("y = " + Ystring.charAt(j));


		if(i < 0 && j < 0 && zloc < 0)
		{//All strings empty then set to true
			//System.out.println("both empty");
			I[i + 1][j+ 1] = true;
			return I[i+ 1][j+ 1];
		}
		else if(i < 0 && Zstring.charAt(j) == Ystring.charAt(j))
		{//x is empty and character in z and y are equal
			//System.out.println("x equals 0");
			if(j > 0)
			{
				I[i+ 1][j+ 1] = isInterleaved(i, j-1);
			}
			else
			{
				I[i+ 1][j+ 1] = true;
			}
			return I[i+ 1][j+ 1];
		}
		else if(j < 0 && Zstring.charAt(i) == Xstring.charAt(i))
		{//y is empty and character in z and x are equal
			//System.out.println("y equals 0");
			if(i > 0)
			{
				I[i+ 1][j+ 1] = isInterleaved(i-1, j);
			}
			else
			{
				I[i+ 1][j+ 1] = true;
			}
			return I[i+ 1][j+ 1];
		}

		if(I[i+ 1][j+ 1] != null)
		{
			return I[i+ 1][j+ 1];
		}

		if(Zstring.charAt(zloc) == Xstring.charAt(i) && (Xstring.charAt(i) != Ystring.charAt(j)))
		{//z equals x but not y
			//System.out.println("first");
			I[i+ 1][j+ 1] = isInterleaved(i-1, j);
			return I[i+ 1][j+ 1];
		}
		else if(Zstring.charAt(zloc) == Ystring.charAt(j) && (Ystring.charAt(j) != Xstring.charAt(i)))
		{// z equals y but not x
			//System.out.println("second");
			I[i+ 1][j+ 1]= isInterleaved(i, j-1);
			return I[i+ 1][j+ 1];
		}
		else if(Zstring.charAt(zloc) == Ystring.charAt(j) && (Zstring.charAt(zloc) == Xstring.charAt(i)))
		{// z equals y and x then choose the best one
			//System.out.println("third");
			I[i+ 1][j+ 1] = isInterleaved(i, j-1) || isInterleaved(i-1, j);
			return I[i+ 1][j+ 1];
		}
		else if(Zstring.charAt(zloc) != Ystring.charAt(j) && Zstring.charAt(zloc) != Xstring.charAt(i))
		{//none are equal
			//System.out.println("last");
			I[i+ 1][j+ 1] = false;
			return I[i+ 1][j+ 1];
		}

		return I[i+ 1][j+ 1];
	}
    /**
     * Returns a string representation of the solution of the interleaved string problem.
     *
     * The return value is a string whose length is equal to z.
     * All characters in z are replaced by character "x" if they come from the string "x",
     * and all characters in z are replaced by the character "y" if they come from the string y.
     *
     * For example, on an input of x = "ab", y = "cd", and z = "abcd", then the output shall be the string "xxyy".
     *
     * @param x the first string that composes an interleaving
     * @param y the second string that composes an interleaving
     * @param z the string to check for an interleaving
     * @return A string representation of the solution
     */
    public String getSolution(String x, String y, String z){

        //YOUR CODE HERE

        return null;

    }

}//class