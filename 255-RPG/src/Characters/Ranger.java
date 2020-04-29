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
public class Ranger extends PlayableCharacter{
    public Ranger(){
        setMaxhp(16);
        setCurrenthp(16);
        setLevel(1);
        setClassname("Ranger");
        setXp(0);
        setAttackdmg(6);
    }
}
