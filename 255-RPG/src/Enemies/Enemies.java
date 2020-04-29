package Enemies;

public abstract class Enemy
{
    private int HP;
    private int DMG;
    private int playerlvl = PlayableCharacter.level;
    private  object itemdrop; 
    private int xpdrop;
    private int agility;

    public void setHP(int hp)
    {
        this.hp = HP;
    }

    public void setDMG(int hit)
    {
        this.hit = DMG;
    }
    
    public giveDMG(DMG)
    {
        int damage;
        damage = Random().nextInt(DMG);
        return damage;
    }
    
    public void setAG(int AG)
    {
        this.AG = agility;
    }

    public void setXP(int XP)
    {
        this.XP = xpdrop; 
    }
}