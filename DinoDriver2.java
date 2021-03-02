
/**
 * Write a description of class DinoDriver2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DinoDriver2
{
   public static void main(string args[])
   {
   Dinsosaur[] pop = new Dinosaur[25];
   for (int i =0; i< pop.length; i++)
   {
       double rand = Math.random();
       if(rand < 0.33)
            pop[i] = new Velo();
       else if ( rand < .67)
       {
           pop[i] = new Velo();
       }
       else
            pop[i] = new Bronta();
          DinoDriver2.growUp(pop[i]);
   }
   
   //for(int i = 0; i<pop.length; i++)
   for( Dinosaur d : pop)
   {
      if(d.getHealth() > 0 )
        System.out.println(d);
   }
   
   
   
   for(int i = 0; i< pop.length; i++)
   {
       int rand = (int)(Math.random()*pop.length);
       if( pop[i].attack(pop[rand]) )
       {
           System.out.println("\t" + pop[i].toString());
       }    
   }
   
   
 
   
   
   
       
   }
   
   private static void battleRound(Dinosaur[] p)
   {
     System.out.println("\t"+p[0]);
     System.out.println("\t"+p[1]);

     
     for( Dinosaur d : p )
     {
         int rand = (int)(Math.random()*p.length);
         
         boolean attackerWon = p[0].atack(p[1]);
       if(attackerWon)
            p[0].update(p[1]);
       else
            p[1].update(p[0]);
     System.out.println("t"+p[0].attack(p[1]));
   }
   
   
   }
   private static void grownUp(Dinosaur d)
   {
       int rand = ((int)Math.random()*35);
       d.setBattleCount(rand);
       for(int i = 0; i < rand; i++)
            d.ageUp();
}
