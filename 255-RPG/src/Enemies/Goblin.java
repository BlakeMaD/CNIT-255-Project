package Enemies;

public class Goblin etends Enemies
{
    int level = PlayableCharacter.getlevel();

    if (level < 10)
    {
        setHP(10);
        setAG(5);
        setXP(10);
        setDMG(2);
    }
    else if (level < 20 && level >= 10)
    {
        setHP(20);
        setAG(10);
        setXP(25);
        setDMG(5);
    }
    else if (level < 30 && level >= 20)
    {
        setHP(35);
        setAG(20);
        setXP(40);
        setDMG(10);
    }
}
