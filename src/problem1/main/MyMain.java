/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
package problem1.main;
// executable class

import problem1.mybst.MyBinarySearchTree;

public class MyMain {
    public static void main(String[] args) {
        MyBinarySearchTree obj = new MyBinarySearchTree();
        obj.insert(20);
        obj.insert(22);
        obj.insert(21);
        obj.insert(10);
        obj.insert(11);
        obj.insert(5);
        obj.insert(60);
        obj.insert(59);
        System.out.print("Left Child nodes are: ");
        obj.printLeftNode(obj.root);
        System.out.println();
        System.out.println("No of nodes that doesnt have a left chuld node are: " + obj.getCount());
    }
}
