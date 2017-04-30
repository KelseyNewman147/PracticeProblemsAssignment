package com.theironyard.charlotte;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by kelseynewman on 4/30/17.
 */
public class KidFriendlyStuff {

  public static void kidMovies() throws FileNotFoundException {

    ArrayList<String> kidMovies = new ArrayList<>();

    File file = new File("KidMovies.csv");
    Scanner scanner = new Scanner(file);
    while (scanner.hasNext()) {
      String movie = scanner.nextLine();
      kidMovies.add(movie);
    }

    int randomMovie = (int) (Math.random() * 15);

    String selected = kidMovies.get(randomMovie);

    System.out.println("And the winner is: " + selected);
  }

}
