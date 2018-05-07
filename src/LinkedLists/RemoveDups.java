package LinkedLists;

import util.Rnd;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by chris luczkow on 5/2/2018.
 */
public class RemoveDups {

    private class Node {

        private int data;
        private Node next;

        private Node(Node head, int data) {
            this.data = data;
            if (head != null) {
                this.next = head;
            }
        }
    }

    public static void main(String[] args) {

        RemoveDups rd = new RemoveDups();
        Node head = null;
        for (int i = 0; i < 20; i++) {
            head = rd.new Node(head, Rnd.Int(10));
        }

        outputList(head);

        removeDups(head);
    }

    private static void removeDups(Node head) {

        Set<Integer> values = new HashSet<>();
        Node node = head;
        values.add(node.data);

        while (node.next != null) {
            if (values.contains(node.next.data)) {
                node.next = node.next.next;
            }
            else {
                values.add(node.next.data);
                node = node.next;
            }
        }

        outputList(head);
    }

    private static void outputList(Node head) {

        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }
}
