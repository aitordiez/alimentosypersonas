
/**
 * Write a description of class Persona here.
 *
 * @author (Aitor Diez)
 * @version (a version number or a date)
 */
public class Persona
{
    //Nombre de la persona
    private String nombre;
    //Si es hombre o mujer
    private boolean hombre;
    //El peso de la persona
    private int peso=0;
    //La altura de la persona
    private int altura=0;
    //La edad de la persona
    private int edad=0;
    private int calorias=0;
    /**
     * Constructor for objects of class Persona
     */
    public Persona(String nombre, boolean sexo, int peso, int altura, int edad)
    {
        this.nombre=nombre;
        this.hombre=hombre;
        this.peso=peso;
        this.altura=altura;
        this.edad=edad;
    }
    
    /**
     * Método para dar de comer a la persona
     */
    public int comer(Comida comer){
        int comidaIngerida=0;
        int hombre= (10 * peso) + (6 * altura) + (5 * edad) + 5;
        int mujer= (10 * peso) + (6 * altura) + (5 * edad) -161;
        if(comer.getCalorias() > hombre && comer.getCalorias()  > mujer){
            comidaIngerida=-1;
        }else{
            calorias = calorias + comer.getCalorias();
            comidaIngerida= comer.getCalorias();
        }
        return comidaIngerida;
    }

    }
    

   

