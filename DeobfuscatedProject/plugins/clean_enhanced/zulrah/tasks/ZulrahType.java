/*
 * Deobfuscated Zulrah Type Enum
 * Represents Zulrah's combat form/attack style
 */
package gg.squire.zulrah.tasks;

/**
 * Zulrah's combat forms throughout the fight.
 *
 * RANGE (Green) - Uses ranged attacks, pray Range
 * MAGIC (Blue/Tanzanite) - Uses magic attacks, pray Mage
 * MELEE (Red/Magma) - Uses melee attacks, must dodge (no overhead protection)
 * JAD phases - Rapidly switches between range and mage attacks
 */
public enum ZulrahType {
    RANGE,          // Green form - ranged attacks
    MAGIC,          // Blue/Tanzanite form - magic attacks
    MELEE,          // Red/Magma form - melee attacks, must dodge
    JAD_RANGE_FIRST,  // Jad phase starting with range attack
    JAD_MAGIC_FIRST;  // Jad phase starting with mage attack
}
