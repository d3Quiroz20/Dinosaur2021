
/**
 * Write a description of class DinoDriver1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DinoDriver1
{
   public static void main (String[]args)
   {
       Dinosaur d1 = new Dinosaur();
       Dinosaur d2 = new Dinosaur("TRex");
       
       
       Dinosaur[] pop = Dinosaur [10];
       
       for(int i = 0; i < pop.length; i++)//loop
       {
           pop[i] = new Dinosaur (" TRex ");
           int rand = (int) (Math.random()*40);
           for(int j = 0; j< (int)(Math.random()*40); j++)
           {
               pop[i].ageUp();
           }
       }
       
       // Age up all dinos to a random age between 0-35
       
       
       for(int i = 0; i < pop.length; i++)
            System.out.println(pop[i]);
           
       
       
   }
}
