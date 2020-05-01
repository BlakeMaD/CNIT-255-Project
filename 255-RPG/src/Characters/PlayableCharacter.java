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
public interface PlayableCharacter {
    
    public int MAXLVL = 30;
    int getCurrenthp();
    void setCurrenthp(int currenthp);
    int getLevel();
    void setLevel(int level);
    int getMaxhp();
    void setMaxhp(int maxhp);
    int getXp();
    void setXp(int xp);
    int getAttackdmg();
    void setAttackdmg(int attackdmg);

}
