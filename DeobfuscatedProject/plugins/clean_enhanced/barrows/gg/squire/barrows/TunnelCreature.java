/*
 * Decompiled with CFR 0.152.
 * Deobfuscated for Squire Barrows Plugin
 *
 * Represents the various creatures found in the Barrows tunnels,
 * each with their reward potential values.
 */
package gg.squire.barrows;

/**
 * Enum representing creatures in the Barrows tunnels.
 * Each creature has a reward potential value that contributes to the chest reward.
 */
public enum TunnelCreature {
    CRYPT_RAT(175, "Crypt rat"),
    BLOODWORM(52, "Bloodworm"),
    CRYPT_SPIDER(8, "Crypt spider"),
    GIANT_CRYPT_RAT(76, "Giant crypt rat"),
    SKELETON(41, "Skeleton"),
    GIANT_CRYPT_SPIDER(50, "Giant crypt spider");

    private final int potential;
    private final String npcName;

    /**
     * Creates a new TunnelCreature enum value.
     *
     * @param potential The reward potential value for killing this creature
     * @param npcName The name of the NPC
     */
    TunnelCreature(int potential, String npcName) {
        this.potential = potential;
        this.npcName = npcName;
    }

    /**
     * Gets the reward potential value for this creature.
     *
     * @return The potential value
     */
    public int getPotential() {
        return this.potential;
    }

    /**
     * Gets the NPC name of this creature.
     *
     * @return The NPC name
     */
    public String getNpcName() {
        return this.npcName;
    }
}
