package Controller;

import java.util.EmptyStackException;

public class ContactManager {
    public QueueG() {
        this.primeroC= null;
        this.ultimo = null;
    }



    public void add(T value){
        NodeGeneric<T> newNode = new NodeGeneric<T>(value);
        if(isEmpty()){
            primeroC= newNode;
            ultimo = newNode;
        }else{
            ultimo.setNext(newNode);
            ultimo = newNode;
        }
        size++;
    }
    public T remove(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        T aux = primeroC.getValue();
        primeroC = primeroC.getNext();
        size--;
        return aux;
        
    }

    public T peek(){
        if(isEmpty())
            throw new EmptyStackException();

        return primeroC.getValue();
       
    }
    public T findContactByName(String name) {
        NodeGeneric<T> current = primeroC;
        while (current != null) {
            if (current.getValue().toString().equalsIgnoreCase(name)) {
                return current.getValue();
            }
            current = current.getNext();
        }
        return null;
    }
    
    public T deleteContactByName(String name) {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
    
        NodeGeneric<T> current = primeroC;
        NodeGeneric<T> previous = null;
    
        while (current != null) {
            if (current.getValue().toString().equalsIgnoreCase(name)) {
                if (previous == null) {
                    primeroC = current.getNext();
                    if (primeroC == null) {
                        ultimo = null;
                    }
                } else {
                    previous.setNext(current.getNext());
                    if (current == ultimo) {
                        ultimo = previous;
                    }
                }
                size--;
                return current.getValue();
            }
            previous = current;
            current = current.getNext();
        }
        return null;
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return primeroC == null;
    }

    public void printStack() {
        if (isEmpty()) {
            System.out.println("La cola está vacía.");
            return;
        }
    
        NodeGeneric<T> aux = MenuController;
        while (aux != null) {
            System.out.print(aux.getValue());
            if (aux.getNext() != null) {
                System.out.print("/");
            }
            aux = aux.getNext();
            
        }
        System.out.println();
    }
}
