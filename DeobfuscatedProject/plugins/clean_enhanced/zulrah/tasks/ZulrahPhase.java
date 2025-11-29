/*
 * Deobfuscated Zulrah Phase Enum
 * Tracks Zulrah's position, combat type, and player safe spots throughout the fight
 */
package gg.squire.zulrah.tasks;

import net.runelite.api.coords.WorldPoint;

/**
 * Represents each phase/position of the Zulrah fight.
 *
 * GREEN_ = Range form (green colored Zulrah)
 * TANZ_ = Magic form (blue/tanzanite colored Zulrah)
 * MAGMA_ = Melee form (red/magma colored Zulrah)
 * JAD_ = Jad phase where Zulrah rapidly switches attack styles
 *
 * The suffix indicates:
 * - The player's safe spot position (E=East, W=West, NE=NorthEast, etc.)
 * - Zulrah's position (CENTER, EAST, WEST, SOUTH)
 */
public enum ZulrahPhase {
    // Initial phase - Range form at center
    INITIAL(ZulrahType.RANGE, SafeSpot.NORTH_EAST, ZulrahPosition.CENTER),

    // Green (Range) phases
    GREEN_EAST_NE(ZulrahType.RANGE, SafeSpot.NORTH_EAST, ZulrahPosition.EAST),
    GREEN_EAST_CE(ZulrahType.RANGE, SafeSpot.CENTER_EAST, ZulrahPosition.EAST),
    GREEN_EAST_E(ZulrahType.RANGE, SafeSpot.EAST, ZulrahPosition.EAST),
    GREEN_CENTER_W(ZulrahType.RANGE, SafeSpot.WEST, ZulrahPosition.CENTER),
    GREEN_CENTER_E(ZulrahType.RANGE, SafeSpot.EAST, ZulrahPosition.CENTER),
    GREEN_WEST_W(ZulrahType.RANGE, SafeSpot.WEST, ZulrahPosition.WEST),
    GREEN_SOUTH_W(ZulrahType.RANGE, SafeSpot.WEST, ZulrahPosition.SOUTH),
    GREEN_SOUTH_E(ZulrahType.RANGE, SafeSpot.EAST, ZulrahPosition.SOUTH),

    // Tanzanite (Magic) phases
    TANZ_EAST_NE(ZulrahType.MAGIC, SafeSpot.NORTH_EAST, ZulrahPosition.EAST),
    TANZ_EAST_E(ZulrahType.MAGIC, SafeSpot.EAST, ZulrahPosition.EAST),
    TANZ_WEST_W(ZulrahType.MAGIC, SafeSpot.WEST, ZulrahPosition.WEST),
    TANZ_CENTER_NE(ZulrahType.MAGIC, SafeSpot.NORTH_EAST, ZulrahPosition.CENTER),
    TANZ_CENTER_E(ZulrahType.MAGIC, SafeSpot.EAST, ZulrahPosition.CENTER),
    TANZ_SOUTH_CW(ZulrahType.MAGIC, SafeSpot.CENTER_WEST, ZulrahPosition.SOUTH),
    TANZ_SOUTH_C(ZulrahType.MAGIC, SafeSpot.CENTER, ZulrahPosition.SOUTH),

    // Magma (Melee) phases - must dodge, cannot stand still
    MAGMA_CENTER_E(ZulrahType.MELEE, SafeSpot.EAST, ZulrahPosition.CENTER),
    MAGMA_CENTER_NW(ZulrahType.MELEE, SafeSpot.NORTH_WEST, ZulrahPosition.CENTER),
    MAGMA_CENTER_NE(ZulrahType.MELEE, SafeSpot.NORTH_EAST, ZulrahPosition.CENTER),
    MAGMA_CENTER_W(ZulrahType.MELEE, SafeSpot.WEST, ZulrahPosition.CENTER),

    // Jad phases - requires prayer switching
    JAD_PHASE_E(ZulrahType.JAD_MAGIC_FIRST, SafeSpot.EAST, ZulrahPosition.EAST),
    JAD_PHASE_W(ZulrahType.JAD_RANGE_FIRST, SafeSpot.WEST, ZulrahPosition.WEST);

    private final ZulrahType zulrahType;
    private final SafeSpot safeSpot;
    private final ZulrahPosition zulrahPosition;

    ZulrahPhase(ZulrahType zulrahType, SafeSpot safeSpot, ZulrahPosition zulrahPosition) {
        this.zulrahType = zulrahType;
        this.safeSpot = safeSpot;
        this.zulrahPosition = zulrahPosition;
    }

    /**
     * @return The combat type Zulrah is using in this phase
     */
    public ZulrahType getZulrahType() {
        return this.zulrahType;
    }

    /**
     * @return true if this is a Jad phase requiring prayer switching
     */
    public boolean isJadPhase() {
        return this.zulrahType == ZulrahType.JAD_RANGE_FIRST ||
               this.zulrahType == ZulrahType.JAD_MAGIC_FIRST;
    }

    /**
     * @return true if Zulrah is using melee attacks (must dodge)
     */
    public boolean isMeleePhase() {
        return this.zulrahType == ZulrahType.MELEE;
    }

    /**
     * @return true if Zulrah is using magic attacks
     */
    public boolean isMagicPhase() {
        return this.zulrahType == ZulrahType.MAGIC;
    }

    /**
     * @return true if Zulrah is using ranged attacks
     */
    public boolean isRangePhase() {
        return this.zulrahType == ZulrahType.RANGE;
    }

    /**
     * @return true if Zulrah is at center position
     */
    public boolean isAtCenter() {
        return this.zulrahPosition == ZulrahPosition.CENTER;
    }

    /**
     * Calculate the player's safe spot world point from instance base
     */
    public WorldPoint getSafeSpotLocation(WorldPoint instanceBase) {
        return instanceBase.dx(this.safeSpot.getXOffset()).dy(this.safeSpot.getYOffset());
    }

    /**
     * Calculate Zulrah's world point from instance base
     */
    public WorldPoint getZulrahLocation(WorldPoint instanceBase) {
        return instanceBase.dx(this.zulrahPosition.getXOffset() - 2)
                          .dy(this.zulrahPosition.getYOffset() - 2);
    }
}
