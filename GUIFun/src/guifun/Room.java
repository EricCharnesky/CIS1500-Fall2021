package guifun;

import java.util.Random;

public class Room {

    private NPC npc;
    private int gold;
    private boolean blocked;

    public Room() {

        Random random = new Random();

        if (random.nextInt(2) == 1) {
            npc = null;
        } else {
            npc = new NPC();
        }

        gold = random.nextInt(100) + 1;

        // more random values to check if true or not
        blocked = false;
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public boolean isBlocked() {
        return blocked;
    }

    public NPC getNpc() {
        return npc;
    }

    public void setNpc(NPC npc) {
        this.npc = npc;
    }

}
