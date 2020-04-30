/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Items;

/**
 *
 * @author Carter
 */
public abstract class KeyItems {
    private String itemName;
    private int totalUses;
    private boolean statusBossKey;
    
    public String getName(){
        return itemName;
    }
    public String setName(String itemName){
        return this.itemName = itemName;
    }
    
    public int getUses(){
        return totalUses;
    }
    public int setUses(int totalUses){
        return this.totalUses = totalUses - 1;
    }
    
    public boolean getBossKeyStatus(){
        return statusBossKey;
    }
    public boolean setBossKeyStatus(boolean statusBossKey){
        return this.statusBossKey;
    }
}
