package Enemies;
import java.util.concurrent.ThreadLocalRandom;

public abstract class Enemies
{
    private int HP;
    private int DMG;
    private int xpdrop;
    private int agility;

    /**
     * @return the HP
     */
    public int getHP() {
        return HP;
    }

    /**
     * @return the DMG
     */
    public int getDMG() {
        return DMG;
    }

    /**
     * @return the xpdrop
     */
    public int getXpdrop() {
        return xpdrop;
    }

    /**
     * @return the agility
     */
    public int getAgility() {
        return agility;
    }
   
    public void setHP(int HP)
    {
        this.HP = HP;
    }

    public void setDMG(int DMG)
    {
        this.DMG = DMG;
    }
    
    public int giveDMG(int DMG)
    {
        int damage;
        damage = ThreadLocalRandom.current().nextInt(0, DMG + 1);
        return damage;
    }
    
    public void setAG(int agility)
    {
        this.agility = agility;
    }

    public void setXP(int XP)
    {
        this.xpdrop = XP; 
    }
}