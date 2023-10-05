package hw5;

import java.util.Locale;

public class AlinaArraysFor {

    public static void main(String[] args){

      String[] fruitArray = new String[4];
      fruitArray[0] = "apple";
      fruitArray[1] = "banana";
      fruitArray[2] = "orange";
      fruitArray[3] = "lemon";


      for (int i = 0; i < fruitArray.length ; i++) {
        fruitArray[i] = fruitArray[i].toUpperCase(Locale.ROOT);
        System.out.println(fruitArray[i]);
      }

    }
  }
