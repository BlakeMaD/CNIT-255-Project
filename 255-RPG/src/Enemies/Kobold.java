package Enemies;

public class Kobold extends Enemies
{
    private int level = PlayableCharacter.getlevel();

    if (level < 10)
    {
        setHP(20);
        setAG(10);
        setXP(15);
        setDMG(5);
    }
    else if (level < 20 && level >= 10)
    {
        setHP(30);
        setAG(15);
        setXP(35);
        setDMG(10);
    }
    else if (level < 30 && level >= 20)
    {
        setHP(45);
        setAG(25);
        setXP(60);
        setDMG(15);
    }
}

