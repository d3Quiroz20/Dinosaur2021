

public class Velo
{
    
    private int x;

    /**
     * Constructor for objects of class Velo
     */
    public Velo()
    {
        super ("Velo");
        this.numEaten = 0;
    }
    public boolean attack(Dinosaur other)
    {
        boolean result = false;
            if(other.getType().equals("Velo"))
            {
                if(Math.random()>0.5)
                    result = true;
            }
            else if(other.getType().equals("Trex"))
            {
                if(Math.random()>0.5)5)
                    result = true;
            }
            else if(other.getType().equals("bronta"))
            {
                if(Math.random()>0.25)
                    result = true;
            }
        
    
    }
    public String toString()
    {
        return this.getType()+" "+ this.getWins() +" "+ this.getBattleCount;
    }
  
}
