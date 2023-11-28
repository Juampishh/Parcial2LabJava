import java.io.*;

public class Empleado implements Serializable {
    private transient int id;
    private String nombre;
    private String Salario;

    public Empleado() {
    }
    public Empleado( String nombre, String salario) {

        this.nombre = nombre;
        Salario = salario;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSalario() {
        return Salario;
    }

    public void setSalario(String salario) {
        Salario = salario;
    }
    public static void main(String[] args) {
        Empleado empleado = new Empleado("Juan", "1000");
        try{
            System.out.println("Serializando el objeto");
            System.out.println(empleado.getNombre());
            System.out.println(empleado.getSalario());
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("empleado.dat"));
            oos.writeObject(empleado);
            oos.close();
        }catch (IOException e){
            e.printStackTrace();
        }

        //Deserializar el objeto
        try{
            System.out.println("Deserializando el objeto");
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("empleado.dat"));
            Empleado empleado1 = (Empleado) ois.readObject();
            System.out.println(empleado1.getNombre());
            System.out.println(empleado1.getSalario());
            ois.close();
    }catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
