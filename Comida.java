
/**
 * Write a description of class Comida here.
 *
 * @author (Aitor Diez)
 * @version (Version 1.0)
 */
public class Comida
{
    // instance variables - replace the example below with your own
    private String nombreComida;
    private int cantidadDeCalorias;
    private int calorias;
    /**
     * Constructor for objects of class Comida
     */
    public Comida(String nombreComida, int cantidadDeCalorias)
    {
        // initialise instance variables
        this.nombreComida=nombreComida;
        this.cantidadDeCalorias=cantidadDeCalorias;
        int calorias=0;
    }


    /**
     * Metodo para obtener el nombre de la comida
     */
    public String getNombreComida(){
        return nombreComida;
    }
    
    /**
     * Metodo para obtener las calorias de la comida
     */
    public int getCalorias(){
        return cantidadDeCalorias;
    }
    

}