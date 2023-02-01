package Proyecto1;

//clase creada clientes dentro de esta creamos dos atributos que son cedula y cliente
public class Clientes {
 //INTANCIAMOS ESTOS ATRIBUTOS QUE ESTARAN ENCAPSULADOS EN PRIVADO
    private int Cedula;
    private String Nombre;

    // los metodos get sirven para recuperar los datos que pertenecen a cada atributo instanciados
    public int getCedula(){
        return Cedula;
    }
    public String getNombre(){
        return Nombre;
    }

    //este seria el constructor donde se almacenaran los datos
    public Clientes(int Cedula, String Nombre){
        /*La utilización de this en el tercer constructor de la clase, permite referirse directamente al objeto en sí,
         en lugar de permitir que el ámbito actual defina la resolución de variables,
         al utilizar i como parámetro formal y después this para acceder a la variable de instancia del objeto actual
         */
        this.Cedula = Cedula;
        this.Nombre = Nombre;
    }



}
