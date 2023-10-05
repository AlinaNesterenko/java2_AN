package hw5;

import java.util.ArrayList;

public class AlinaArraysFor2 {

  public static void main(String[] args) {

    ArrayList<String> fruitArray = new ArrayList<String>(5);

    // добавить элементы

    fruitArray.add("apple");
    fruitArray.add("pineapple");
    fruitArray.add("coconut");
    fruitArray.add("lemon");

    // добавить в середину списка
    fruitArray.add(2, "mango");

    // вывести имеющийся список и пометить имена длиннее 5 букв
    System.out.println("At the beginning");

    for (String fruitBoxName : fruitArray) {
      if (fruitBoxName.length() == 5)
        System.out.println(fruitBoxName);
      else System.out.println(fruitBoxName + " is too long name");
    }
    // удалить яблоко

    fruitArray.remove("apple");

    System.out.println("NEW list w/o apple");
    // вывести новый список

    for (String fruitBoxName : fruitArray) {
      System.out.println(fruitBoxName);

    }
  }
}