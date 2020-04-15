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
public abstract class PlayableCharacter {

      
    private int currenthp;
    private int level;
    private int maxhp;
    private int xp;
    private int attackdmg;
    private String classname;

    /**
     * @return the currenthp
     */
    public int getCurrenthp() {
        return currenthp;
    }

    /**
     * @param currenthp the currenthp to set
     */
    public void setCurrenthp(int currenthp) {
        this.currenthp = currenthp;
    }

    /**
     * @return the level
     */
    public int getLevel() {
        return level;
    }

    /**
     * @param level the level to set
     */
    public void setLevel(int level) {
        this.level = level;
    }

    /**
     * @return the maxhp
     */
    public int getMaxhp() {
        return maxhp;
    }

    /**
     * @param maxhp the maxhp to set
     */
    public void setMaxhp(int maxhp) {
        this.maxhp = maxhp;
    }

    /**
     * @return the xp
     */
    public int getXp() {
        return xp;
    }

    /**
     * @param xp the xp to set
     */
    public void setXp(int xp) {
        this.xp = xp;
    }

    /**
     * @return the attackdmg
     */
    public int getAttackdmg() {
        return attackdmg;
    }

    /**
     * @param attackdmg the attackdmg to set
     */
    public void setAttackdmg(int attackdmg) {
        this.attackdmg = attackdmg;
    }

    /**
     * @return the classname
     */
    public String getClassname() {
        return classname;
    }
    
    /**
     * @param classname the classname to set
     */
    public void setClassname(String classname) {
        this.classname = classname;
    }
       
}
