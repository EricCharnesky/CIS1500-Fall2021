/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guifun;

/**
 *
 * @author EricC
 */
public class Room {
    private NPC npc;
    
    public Room(){
        npc = null;
    }

    public NPC getNpc() {
        return npc;
    }

    public void setNpc(NPC npc) {
        this.npc = npc;
    }
    
    
}
