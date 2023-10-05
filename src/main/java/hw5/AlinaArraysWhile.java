package hw5;

public class AlinaArraysWhile {
  public static void main(String[] args) {

    String[] fruitArray = new String[] {"melon", "apple", "pineapple", "mango", "strawberries", "rasberries", "strawberries" };

    //выбрать ягоды

    int index = 0;

    while (index < fruitArray.length){
      if (fruitArray[index].contains("berries"))
        System.out.println(fruitArray[index]);
      index++;
    }


  }
}
