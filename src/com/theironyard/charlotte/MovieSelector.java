package com.theironyard.charlotte;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by kelseynewman on 4/30/17.
 */
public class MovieSelector {

  public static void movieSelector() throws FileNotFoundException {

    ArrayList<String> movies = new ArrayList<>();

    File file = new File("movies.csv");
    Scanner scanner = new Scanner(file);
    while (scanner.hasNext()) {
      String movie = scanner.nextLine();
      movies.add(movie);
    }
    int randomMovie = (int) (Math.random() * 14);

    String selected = movies.get(randomMovie);

    //System.out.println(selected);

    ArrayList<String> tieBreaker = new ArrayList<>();
    tieBreaker.add(movies.get(8));//The Wild One
    tieBreaker.add(selected);

    int theEqualizer = (int) (Math.random() * 2);

    System.out.println("And the winner is: " + (tieBreaker.get(theEqualizer)));
  }
}

