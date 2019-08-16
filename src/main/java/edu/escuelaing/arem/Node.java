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
public class Node {
    
    Node next;
    private float data;
    
    public Node(float data) {
        this.data = data;
    }
    
    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public float getData() {
        return data;
    }

    public void setData(float data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Node{" + "next=" + next + ", data=" + data + '}';
    }
    
}
