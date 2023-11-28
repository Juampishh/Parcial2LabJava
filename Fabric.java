
//EJERCICIO 3 ERROR EN TIEMPO DE COMPILACION
/*
public class Fabric extends Thread{
    public static void main(String[] args){
        Thread t = new Thread(new Fabric());
        Thread t2 = new Thread(new Fabric());
        t.start();
        t2.start();
    }
    public static void run(){
        for(int i = 0; i < 2; i++){
            System.out.println(Thread.currentThread().getName() + " ");
        }
    }
}
*/

//PREGUNTAS SOBRE THREADS
//Todas las clases de Exception heredan de la clase Throwable
