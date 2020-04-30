package Enemies;

public class Bandit etends Enemies
{
    int level = PlayableCharacter.getlevel();
    
    if ( level < 10)
    {
        setHP(30);
        setAG(15);
        setXP(20);
        setDMG(8);
    }
    else if (level < 20 && level >= 10)
    {
        setHP(50);
        setAG(20);
        setXP(45);
        setDMG(15);
    }
    else if (level < 30 && level >= 20)
    {
        setHP(75);
        setAG(25);
        setXP(80);
        setDMG(25);
    }
}