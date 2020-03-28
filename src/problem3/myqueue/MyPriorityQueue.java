/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:15 PM
 */
package problem3.myqueue;

import problem3.node.Node;
import problem5.student.Student;

public class MyPriorityQueue {
    Node head;

    public MyPriorityQueue() {
        head = null;
    }

    public void insert(String name, int roll) {
        Node newNode = new Node();
        Student obj = new Student();
        obj.setName(name);
        obj.setRoll(roll);
        newNode.setObj(obj);
        Node temp = head;
    }
}