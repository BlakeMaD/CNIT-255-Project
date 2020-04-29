package Enemies;

public class Goblin etends Enemies
{
    if (PlayableCharacter.level < 10)
    {
        setHP(10);
        setAG(5);
        setXP(10);
        setDMG(2);
    }
    else if (PlayableCharacter.level < 20 && PlayableCharacter.level >= 10)
    {
        setHP(20);
        setAG(10);
        setXP(25);
        setDMG(5);
    }
    else if (PlayableCharacter.level < 30 && PlayableCharacter.level >= 20)
    {
        setHP(35);
        setAG(20);
        setXP(40);
        setDMG(10);
    }
}
