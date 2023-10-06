package hw5;

import java.util.HashSet;
import java.util.Set;

public class AlinaArraysHashSet {

    public static void main(String[] args) {

      HashSet<String> fruit = new HashSet<String>();

      fruit.add("apple");
      fruit.add("banana");
      fruit.add("mango");
      fruit.add("coconut");
      fruit.add("orange");

      //вывести список
      System.out.println("at the beginning...");
      System.out.println(fruit);

      // удалить "яблоко"

      fruit.remove("apple");

      //вывести список
      System.out.println("final list");
      System.out.println(fruit);



    }
  }

