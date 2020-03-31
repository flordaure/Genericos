import java.util.ArrayList;
import java.util.List;

public class Generica <T extends Comparable> {

     private List<T> arreglo;

    public Generica() {

        this.arreglo = new ArrayList<T>();

    }

    public void Add (T objeto){
        this.arreglo.add(objeto);
    }
    public boolean ValidaExistencia(T objeto) {

        return this.arreglo.contains(objeto);
    }

    public T Maximo() {

        T max;
        max = this.arreglo.get(0);
        for (int i = 1; i < this.arreglo.size(); i++) {
            if (max.compareTo(this.arreglo.get(i)) < 0) {
                max = this.arreglo.get(i);
            }
        }
        return max;
    }

    public T Min(){
        T min;
        min=this.arreglo.get(0);
        for (int i=1; i<this.arreglo.size();i++){
            if(min.compareTo(this.arreglo.get(i))>0){
                min=this.arreglo.get(i);
            }
        }
        return min;
    }

    public T RemoveElement(){
        T element;

       element=this.arreglo.get(this.arreglo.size()-1);
       this.arreglo.remove(element);
       return element;
    }

    public void Show(){
        for (T p: this.arreglo) {
            System.out.println(p);

        }
    }
}
