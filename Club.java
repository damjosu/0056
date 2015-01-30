import java.util.ArrayList;
/**
 * Store details of club memberships.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Club
{
    // The club's members.
    private ArrayList<Membership> members;

    /**
     * Constructor for objects of class Club
     */
    public Club()
    {
        members = new ArrayList<>();        
    }

    /**
     * Add a new member to the club's list of members.
     * @param member The member object to be added.
     */
    public void join(Membership member)
    {
        members.add(member);
    }

    /**
     * @return The number of members (Membership objects) in
     *         the club.
     */
    public int numberOfMembers()
    {
        return members.size();
    }

    /** 
     * Calcula el numero de socios que se dieron de alta en un mes determinado. 
     * El año no nos importa. En caso de que el parametro contenga un valor 
     * no valido se muestra por pantalla el error.
     * @param month El mes en el que estamos interesados
     * @return El numero de socios que se dieron de alta dicho mes
     */
    public int joinedMonth(int month)
    {
        int miembrosDadosDeAlta = 0;
        if (month > 0 && month < 12)
        {
            for (Membership member : members)
            {
                if (member.getMonth() == month)
                {
                    miembrosDadosDeAlta++;
                }
            }
        }
        else
        {
            System.out.println("Mes introducido no válido.");
        }
        return miembrosDadosDeAlta;
    }

    /** 
     * Todos los socios que se han dado de alta un determinado mes de un determinado año se
     * dan de baja. En caso de que el parametro month contenga un valor no valido se muestra 
     * por pantalla el error.
     * @param month El mes en el que estamos interesados
     * @param year El año en el que estamos interesados
     * @return Una coleccion con los socios que se han dado de baja del club
     */
    public ArrayList<Membership> purge(int month, int year)
    {
        ArrayList<Membership> nueva = new ArrayList<>();        
        if ((month > 0 && month < 12) && (year > 1990 && year < 2015))
        {
            for (Membership member : members)
            {
                if (member.getMonth() == month && member.getYear() == year)
                {
                    nueva.add(member);
                    members.remove(member);                    
                }
            }
        }
        else
        {
            System.out.println("Mes o año introducido no válido.");
        }
        return nueva;
    }
}
