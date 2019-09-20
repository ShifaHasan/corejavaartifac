package com.sg.j8.simpleArrayProm;

public class LinkList {

    Node first;
    Node last;

    private class Node{
        Node next;
        Object data;
    }

    void addFirst(Object obj){
        Node newNode = new Node();
        newNode.data = obj;
        if(this.first ==null)
        {
            this.first = newNode;
            this.last = newNode;
            newNode.next = null;
        }else{
            newNode.next =this.first;
            this.first =newNode;
        }
    }
    void addLast(Object obj) {
        Node newNode = new Node();
        newNode.data = obj;
        if (this.first == null) {
            newNode.next = null;
            this.first = newNode;
            this.last = newNode;
        } else {
            newNode.next = null;
            this.last.next = newNode;
            this.last = newNode;
        }
    }

    Object getFirst(){
        return this.first.data;
    }

    Object getLast() throws NoSuchFieldException {
        if (first == null) {
            throw new NoSuchFieldException();
        } else {
            return this.last.data;
        }
    }


    int size(){
        int i=0;
        Node node = this.first;
        while(node.next !=null){
            i++;
            node = node.next;
        }
        return i;
    }

    public static void main(String[] args) {
        LinkList ls = new LinkList();
        ls.addFirst("Test");
    }

}
