package Enemies;

public class Kobold etends Enemies
{
    if (PlayableCharacter.level < 10)
    {
        setHP(20);
        setAG(10);
        setXP(15);
        setDMG(5);
    }
    else if (PlayableCharacter.level < 20 && PlayableCharacter.level >= 10)
    {
        setHP(30);
        setAG(15);
        setXP(35);
        setDMG(10);
    }
    else if (PlayableCharacter.level < 30 && PlayableCharacter.level >= 20)
    {
        setHP(45);
        setAG(25);
        setXP(60);
        setDMG(15);
    }
}