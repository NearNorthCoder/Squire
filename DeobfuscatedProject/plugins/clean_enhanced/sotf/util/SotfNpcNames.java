package gg.squire.sotf.util;

import java.util.HashMap;

/**
 * Lookup map for NPC names used in the Sins of the Father quest.
 *
 * This HashMap provides a mapping from integer indices to NPC names
 * that are referenced throughout the SOTF quest plugin. The NPCs include
 * various characters encountered during the quest.
 *
 * Note: The original implementation included an unused DES decryption method
 * that has been removed as it was not utilized in this lookup table.
 */
public class SotfNpcNames extends HashMap<Integer, String> {

    /**
     * Creates a new SotfNpcNames lookup map.
     *
     * Initializes the HashMap with NPC names indexed by integer keys:
     * <ul>
     *   <li>0 - Carlem</li>
     *   <li>1 - Aber</li>
     *   <li>2 - Camerinthum</li>
     *   <li>3 - Purchai</li>
     *   <li>4 - Gabindo</li>
     * </ul>
     */
    public SotfNpcNames() {
        // Initialize NPC name mappings
        this.put(0, "Carlem");
        this.put(1, "Aber");
        this.put(2, "Camerinthum");
        this.put(3, "Purchai");
        this.put(4, "Gabindo");
    }
}
