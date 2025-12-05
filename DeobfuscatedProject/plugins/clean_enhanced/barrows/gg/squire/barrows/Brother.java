/*
 * Decompiled with CFR 0.152.
 * Deobfuscated for Squire Barrows Plugin
 *
 * Represents each of the six Barrows brothers with their locations,
 * combat levels, and varbit IDs for tracking which have been killed.
 */
package gg.squire.barrows;

import net.runelite.api.Actor;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;

/**
 * Enum representing the six Barrows brothers.
 * Each brother has a unique location, combat level, and varbit ID.
 */
public enum Brother {
    DHAROK("Dharok", 115, new WorldPoint(3574, 3298, 0), 457),
    GUTHAN("Guthan", 115, new WorldPoint(3577, 3283, 0), 459),
    KARIL("Karil", 98, new WorldPoint(3565, 3275, 0), 460),
    AHRIM("Ahrim", 98, new WorldPoint(3565, 3288, 0), 458),
    TORAG("Torag", 115, new WorldPoint(3553, 3283, 0), 462),
    VERAC("Verac", 115, new WorldPoint(3556, 3298, 0), 461);

    private final String name;
    private final int combatLevel;
    private final WorldPoint location;
    private final int killedVarbit;

    /**
     * Creates a new Brother enum value.
     *
     * @param name The brother's name
     * @param combatLevel The brother's combat level
     * @param location The brother's mound location
     * @param killedVarbit The varbit ID that tracks if this brother has been killed
     */
    Brother(String name, int combatLevel, WorldPoint location, int killedVarbit) {
        this.name = name;
        this.combatLevel = combatLevel;
        this.location = location;
        this.killedVarbit = killedVarbit;
    }

    /**
     * Gets the brother's name.
     *
     * @return The name of the brother
     */
    public String getName() {
        return this.name;
    }

    /**
     * Gets the brother's mound location.
     *
     * @return The WorldPoint of the brother's mound
     */
    public WorldPoint getLocation() {
        return this.location;
    }

    /**
     * Gets the combat level of the brother.
     *
     * @return The combat level
     */
    public int getCombatLevel() {
        return this.combatLevel;
    }

    /**
     * Gets the varbit ID that indicates if this brother has been killed.
     *
     * @return The varbit ID
     */
    public int getKilledVarbit() {
        return this.killedVarbit;
    }

    /**
     * Checks if the given actor is a Barrows brother interacting with the local player.
     *
     * @param actor The actor to check
     * @return True if the actor is a brother and is interacting with the player
     */
    public static boolean isBrotherAttackingPlayer(Actor actor) {
        if (actor.getInteracting() != Players.getLocal()) {
            return false;
        }

        for (Brother brother : Brother.values()) {
            if (actor.getName().toLowerCase().contains(brother.getName().toLowerCase())) {
                return true;
            }
        }

        return false;
    }
}
