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
public class Warrior extends PlayableCharacter {
    public Warrior(){
        setMaxhp(20);
        setCurrenthp(20);
        setLevel(1);
        setClassname("Warrior");
        setXp(0);
        setAttackdmg(4);
    }
}
