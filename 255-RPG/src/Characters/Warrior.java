/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Characters;

/**
 *
 * @author blake
 */
public class Warrior implements PlayableCharacter {
   
    /**
     * @return the currenthp
     */
    @Override
    public int getCurrenthp() {
        return currenthp;
    }

    /**
     * @param currenthp the currenthp to set
     */
    @Override
    public void setCurrenthp(int currenthp) {
        this.currenthp = currenthp;
    }

    /**
     * @return the level
     */
    @Override
    public int getLevel() {
        return level;
    }

    /**
     * @param level the level to set
     */
    @Override
    public void setLevel(int level) {
        this.level = level;
    }

    /**
     * @return the maxhp
     */
    @Override
    public int getMaxhp() {
        return maxhp;
    }

    /**
     * @param maxhp the maxhp to set
     */
    @Override
    public void setMaxhp(int maxhp) {
        this.maxhp = maxhp;
    }

    /**
     * @return the xp
     */
    @Override
    public int getXp() {
        return xp;
    }

    /**
     * @param xp the xp to set
     */
    @Override
    public void setXp(int xp) {
        this.xp = xp;
    }

    /**
     * @return the attackdmg
     */
    @Override
    public int getAttackdmg() {
        return attackdmg;
    }

    /**
     * @param attackdmg the attackdmg to set
     */
    @Override
    public void setAttackdmg(int attackdmg) {
        this.attackdmg = attackdmg;
    }

    
    private int currenthp;
    private int level;
    private int maxhp;
    private int xp;
    private int attackdmg;
    

    public Warrior(){
        this.maxhp = 20;
        this.currenthp = 20;
        this.level = 1;
        this.xp = 0;
        this.attackdmg = 4;
    }
}
