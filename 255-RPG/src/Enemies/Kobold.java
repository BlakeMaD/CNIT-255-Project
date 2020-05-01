package Enemies;

public class Kobold extends Enemies
{
    public Kobold(int level){

        if (level < 10)
        {
            setHP(20);
            
            setXP(15);
            setDMG(3);
        }
        else if (level < 20 && level >= 10)
        {
            setHP(30);
            
            setXP(8);
            setDMG(5);
        }
        else if (level < 30 && level >= 20)
        {
            setHP(40);
            
            setXP(4);
            setDMG(7);
        }
    }
}

