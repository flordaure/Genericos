public class Main {
    public static void main(String[] args) {

        Persona persona = new Persona("flor", "daure", 33558961);
        Persona persona2 = new Persona("coty", "goldoni", 6221607);
        Persona persona3 = new Persona("erik", "dell", 34949484);

        Generica<Persona> prueba = new Generica<Persona>();

        prueba.Add(persona);
        prueba.Add(persona2);
        prueba.Add(persona3);

        System.out.println(prueba.ValidaExistencia(persona2));
        System.out.println(prueba.ValidaExistencia(persona3));

        Generica<Integer> prueba2 = new Generica();

        prueba2.Add(1);
        prueba2.Add(3);
        prueba2.Add(4);

        System.out.println(prueba2.Maximo());
        System.out.println(prueba.Maximo());
        System.out.println(prueba2.Min());

        prueba.Show();
        Persona person = prueba.RemoveElement();

        System.out.println("El elemento removido es: " + person);

        prueba.Show();

        Generica prueba3 = new Generica();

        prueba3.Add(1);
        prueba3.Add("Flor");
        prueba3.Show();


        Pila<Integer> pilita = new Pila();
        pilita.Push(1);
        pilita.Push(2);
        pilita.Push(3);

        int aux=pilita.Pop();
        System.out.println(aux);

        System.out.println(pilita.Size());


    }
}
