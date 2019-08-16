/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.escuelaing.arem;

/**
 *
 * @author Sergio Ruiz
 */
public class LinkedList {
    
    private Node head;
    
    public void append(float data) {
        if(head == null) {
            head = new Node(data);
            return;
        }
    
        Node current = head;
        while(current.getNext() != null) {
            current = current.getNext();
        }
        current.next = new Node(data);
    }
    
    public void prepend(float data) {
    
        Node newHead = new Node(data);
        newHead.next = head;
        head = newHead;
        
    }
    
    public void delete(float data) {
    
        if(head == null) return;
        if(head.getData() == data) {
            head = head.getNext();
            return;
        }
        
        Node current = head;
        while(current.getNext() != null) {
            if (current.getNext().getData() == data) {
                current.next = current.next.next;
                return;
            }
            current = current.next;
        } 
        
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    @Override
    public String toString() {
        return "LinkedList{" + "head=" + head + '}';
    }
    
}