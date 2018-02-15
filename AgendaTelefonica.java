import java.util.HashMap;
/**
 * Write a description of class AgendaTelefonica here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AgendaTelefonica
{
    HashMap<String, String> agenda;

    /**
     * Constructor for objects of class AgendaTelefonica
     */
    public AgendaTelefonica()
    {
        // initialise instance variables
        agenda = new HashMap<>();
    }

    /**
     * añadir numero de contacto
     */
    public void enterNumber(String name , String number)
    {
        agenda.put(name, number);
    }

    /**
     * muestra el numero asociado a un nombre
     */
    public void lookupNumber(String name)
    {
        System.out.println(agenda.get(name));
    }
}
