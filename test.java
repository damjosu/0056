
/**
 * Write a description of class test here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class test
{   
   public Club test(int month, int year)
   {
       Membership member1 = new Membership("Pepe", 10, 1999);
       Membership member2 = new Membership("Maria", 10, 1999);
       Membership member3 = new Membership("Alba", 10, 1999);
       Membership member4 = new Membership("Juan", 5, 1999);
       Membership member5 = new Membership("Pedro", 5, 1999);
       Club club1 = new Club();
       club1.add(member1);
       club1.add(member2);
       club1.add(member3);
       club1.add(member4);
       club1.add(member5);
       return club1.purge();  
       
    }
}
