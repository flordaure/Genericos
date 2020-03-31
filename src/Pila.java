import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Pila <T> {


    private LinkedList<T> pilita;


    public Pila(){
    this.pilita= new LinkedList<T>();

    }


    public void Push (T element){
        this.pilita.addFirst(element);
    }

    public T Pop (){

        T aux=this.pilita.getFirst();
        this.pilita.removeFirst();
        return aux;
    }

    public int Size(){
        return this.pilita.size();
    }
}


