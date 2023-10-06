package hw5;

import java.util.PriorityQueue;

public class AlinaArraysQueue {
  public static void main(String[] args) {
    PriorityQueue<String> fruit = new PriorityQueue<String>();

    fruit.add("orange");
    fruit.add("lemon");
    fruit.add("apple");
    fruit.add("banana");
    fruit.add("mango");

    System.out.println("at the beginning...");
    for (String i : fruit){
      System.out.println(i);
    }

    // удалить первый элемент
    fruit.remove();
    System.out.println("after delete first");
    for (String i : fruit){
      System.out.println(i);
    }

    // удалить"апельсин"
    fruit.remove("orange");
    System.out.println("after delete orange");
    for (String i : fruit){
      System.out.println(i);
    }

    // вставить "грушу"
    fruit.offer("pear");
    System.out.println("after adding pear");
    for (String i : fruit){
      System.out.println(i);
    }
  }
}
