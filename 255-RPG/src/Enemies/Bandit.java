package Enemies;

public class Bandit extends Enemies
{
    public Bandit(int level){
    
        if ( level < 10)
        {
            setHP(10);
            
            setXP(20);
            setDMG(10);
        }
        else if (level < 20 && level >= 10)
        {
            setHP(15);
            
            setXP(10);
            setDMG(12);
        }
        else if (level < 30 && level >= 20)
        {
            setHP(20);
            setXP(5);
            setDMG(15);
        }
    }
}
