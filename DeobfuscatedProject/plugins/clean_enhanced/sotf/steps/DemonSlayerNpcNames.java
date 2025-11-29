package gg.squire.sotf.steps;

import java.util.HashMap;

/**
 * Mapping of NPC IDs to NPC names for Demon Slayer quest.
 * Used to identify quest-related NPCs during quest progression.
 */
class DemonSlayerNpcNames extends HashMap<Integer, String> {

    public DemonSlayerNpcNames() {
        // Demon Slayer quest NPCs
        this.put(0, "Carlem");
        this.put(1, "Aber");
        this.put(2, "Camerinthum");
        this.put(3, "Purchai");
        this.put(4, "Gabindo");
    }
}
