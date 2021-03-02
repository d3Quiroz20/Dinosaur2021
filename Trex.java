
public class Trex extends dinosaur
{
    // instance variables - replace the example below with your own
    private int x;
    private int numEaten;

    /**
     * Constructor for objects of class Trex
     */
    public Trex()
    {
        //supper() --> must be the first line of a  constructor
        super("TRex"); // calls the constructor of the parent class
        
        this.numEaten=0;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return this.getType() +" "+this.getHealth();
    }
    public boolean attack(dinosur other)
    {
    // code this method such that if other is a TRex, this wins
    // 5)% if other is Velo this wins 60%, if a brona, this wins
    // 75%
    int myRand= (int)(Math.random()*40)+60;
    int otherRand;
    
    int myWeighting;
    int otherWeighting;
    
    double temp;
    
    
    
    
    
    if(other.getType().equals("TRex"))
    {
        otherRand = (int)(Math.random()*40)+55;
    }
    else if (other.getType().equals("Velo"))
    {
        if(Math.random()>0.4)
            result = true;
    }
    else if (other.getType().equals("bronta"))
    {
        if(Math.random()>0.25)
            result = true;
    }
    return result;
    
     public String toString()
    {
        return this.getType()+" "+ this.getWins() +" "+ this.getBattleCount;
    }
    
    
    
    
    
    
    }
}
