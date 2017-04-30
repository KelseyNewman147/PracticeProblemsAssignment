package com.theironyard.charlotte;

import java.io.FileNotFoundException;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
    //	fizzBuzz();
        //interviewFizzBuzz(100);
       // fibSeq(12);
//      MovieSelector.movieSelector();
      KidFriendlyStuff.kidMovies();
    }

    public static void fizzBuzz() {
        for (int i = 1; i <= 100; i++)
            if (i % 3 == 0 && i % 5 != 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0 && i % 3 != 0) {
                System.out.println("Buzz");
            } else if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else {
                System.out.println(String.valueOf(i));
            }

//            (defn fizz-buzz
//        (when < x 100)
//        (if true?
//                (and ( mod x 3) (mod x 5) 0)
//        (println "fizzbuzz"))
    }

	public static String [] interviewFizzBuzz(int counter)
	{
		String [] output = new String[counter];
		for (int i = 1; i <= counter; i++)
		{
			if (i % 3 == 0 && i % 5 == 0)
			{
				output[i-1] = "FizzBuzz";
				//System.out.println("FizzBuzz");
			}
			else if (i % 3 == 0)
			{
				output[i-1] = "Fizz";
				//System.out.println("Fizz");
			}
			else if (i % 5 == 0)
			{
				output[i-1] = "Buzz";
				//System.out.println("Buzz");
			}
			else
			{
				output[i-1] = String.valueOf(i);
				//System.out.println(String.valueOf(i));

			}
		}
		System.out.println(Arrays.toString(output));
		return output;
    }

    public static int[] fibSeq(int x) {
        int[] fib = new int[x];
        fib[0] = 0;
        fib[1] = 1;
        for (int i = 2; i < x; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        return fib;
    }

    public static int boost(Integer x) {

        String valueX = Integer.toString(x);

        Integer[] digitsX = new Integer[valueX.length()];
        for (Integer i = (valueX.length() - 1); i >= 0; i--) {
            digitsX[i] = x % 10;
            x = x / 10;
            if (i == 9) {
                digitsX[i] = 0;
            } else {
                digitsX[i] += 1;
            }
        }
        valueX = "";
        for (int n : digitsX) {
            valueX = valueX + n;
        }
        return Integer.valueOf(valueX);
    }


}




