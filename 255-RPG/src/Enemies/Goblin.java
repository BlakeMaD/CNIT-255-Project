package Enemies;

public class Goblin extends Enemies
{
    public Goblin(int level){

        if (level < 10)
        {
            setHP(15);
            
            setXP(10);
            setDMG(2);
        }
        else if (level < 20 && level >= 10)
        {
            setHP(20);
            
            setXP(5);
            setDMG(4);
        }
        else if (level < 30 && level >= 20)
        {
            setHP(25);
            
            setXP(2);
            setDMG(6);
        }
    }
}

