package hw5;

public class AlinaDoWhileSemp {

  public static void main(String[] args) {

    String[] fruitArray = new String[4];
    fruitArray[0] = "apple";
    fruitArray[1] = "banana";
    fruitArray[2] = "orange";
    fruitArray[3] = "lemon";


    int index2 = 0;
    System.out.println("do while");
    do {
      System.out.println(fruitArray[index2]);
      index2++;
    }
    while (index2 < fruitArray.length);
  }
}