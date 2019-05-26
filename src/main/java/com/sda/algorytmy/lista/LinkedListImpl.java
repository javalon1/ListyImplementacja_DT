package com.sda.algorytmy.lista;

public class LinkedListImpl<E> implements MyList<E>{

    @Override
    public String toString() {
        return "LinkedListImpl{" +
                "head=" + head +
                ", size=" + size +
                '}';
    }

    private Node head;
    private int size = 0;
    public LinkedListImpl(){

    }
    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean add(E e) {
        if(size==0){
            head = new Node(e);
        } else {

            Node tmp = head;
            head = new Node(e);
            head.next = tmp;
        }
        size++;
        return true;
    }

    @Override
    public boolean remove(int index) {
        return false;
    }
    class Node{
        @Override
        public String toString() {
            return "Node{" +
                    "next=" + next +
                    ", data=" + data +
                    '}';
        }

        private Node next;
        private Object data;

        public Node(Object data){
            this.data = data;
        }
        public Object getData(){
            return data;
        }
    }
}
