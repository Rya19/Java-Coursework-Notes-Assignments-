import java.util.*;

public class queuestack11ch20 {
  public static void main(String[] args) {
    PriorityQueue<String> queue1 = new PriorityQueue<>();
    queue1.offer("Oklahoma"); //offer used to put into p-queue
    queue1.offer("Indiana");
    queue1.offer("Georgia");
    queue1.offer("Texas");

    System.out.println("Priority queue using Comparable:");
    while (queue1.size() > 0) {
      System.out.print(queue1.remove() + " "); //remove top element from it
    }

    PriorityQueue<String> queue2 = new PriorityQueue<>(4, Collections.reverseOrder());
    //PriorityQueue<String> queue2 = new PriorityQueue<>(4, (e1, e2) -> e1.length() - e2.length());
    queue2.offer("Oklahoma");
    queue2.offer("Indiana");
    queue2.offer("Georgia");
    queue2.offer("Texas");

    System.out.println("\nPriority queue using Comparator:");
    while (queue2.size() > 0) {
      System.out.print(queue2.remove() + " ");
    }
  }
}