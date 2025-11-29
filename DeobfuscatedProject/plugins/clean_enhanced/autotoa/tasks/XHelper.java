/*
 * Decompiled with CFR 0.152.
 *
 * Could not load the following classes:
 *  com.openosrs.client.util.WeaponStyle
 *  net.runelite.api.Prayer
 */
package gg.squire.autotoa.tasks;

import com.openosrs.client.util.WeaponStyle;
import net.runelite.api.Prayer;

/**
 * PrayerWeaponMapper - Maps prayer and weapon style enums to array indices.
 *
 * This class provides mappings for:
 * - Prayer enum to indices (for switch-like behavior)
 * - WeaponStyle enum to indices (for switch-like behavior)
 *
 * Used for combat calculations and style switching in Tombs of Amascut.
 * The decompiler generated this as a replacement for switch statements.
 */
class PrayerWeaponMapper {

    /** Array mapping WeaponStyle enum ordinals to style indices */
    static final int[] WEAPON_STYLE_TO_INDEX;

    /** Array mapping Prayer enum ordinals to prayer indices */
    static final int[] PRAYER_TO_INDEX;

    /** Helper array containing index values used during initialization */
    private static int[] INDICES;

    /**
     * Initializes the index values array.
     * Values represent:
     * [0] = 1 (Melee/ProtectMelee)
     * [1] = 2 (Range/ProtectMissiles)
     * [2] = 3 (Magic/ProtectMagic)
     * [3] = 4 (Ultimate Strength)
     * [4] = 5 (Chivalry)
     * [5] = 6 (Piety)
     * [6] = 7 (Rigour)
     * [7] = 8 (Augury)
     */
    private static void initializeIndices() {
        INDICES = new int[8];
        PrayerWeaponMapper.INDICES[0] = 1;
        PrayerWeaponMapper.INDICES[1] = 2;
        PrayerWeaponMapper.INDICES[2] = 3;
        PrayerWeaponMapper.INDICES[3] = 0xB6 ^ 0xB2;  // 4
        PrayerWeaponMapper.INDICES[4] = 0x41 ^ 0x44;  // 5
        PrayerWeaponMapper.INDICES[5] = 127 + 98 - 162 + 91 ^ 38 + 143 - 76 + 51;  // 6
        PrayerWeaponMapper.INDICES[6] = 0x24 ^ 0x53 ^ (0xB3 ^ 0xC3);  // 7
        PrayerWeaponMapper.INDICES[7] = 5 ^ 0xD;  // 8
    }

    static {
        // Initialize index values
        PrayerWeaponMapper.initializeIndices();

        // Create Prayer mapping array
        PRAYER_TO_INDEX = new int[Prayer.values().length];

        // Map protection prayers (indices 1-3)
        try {
            PrayerWeaponMapper.PRAYER_TO_INDEX[Prayer.PROTECT_FROM_MELEE.ordinal()] = INDICES[0];
        } catch (NoSuchFieldError e) {
            // Ignore if prayer not found
        }

        try {
            PrayerWeaponMapper.PRAYER_TO_INDEX[Prayer.PROTECT_FROM_MISSILES.ordinal()] = INDICES[1];
        } catch (NoSuchFieldError e) {
            // Ignore if prayer not found
        }

        try {
            PrayerWeaponMapper.PRAYER_TO_INDEX[Prayer.PROTECT_FROM_MAGIC.ordinal()] = INDICES[2];
        } catch (NoSuchFieldError e) {
            // Ignore if prayer not found
        }

        // Map offensive prayers (indices 4-8)
        try {
            PrayerWeaponMapper.PRAYER_TO_INDEX[Prayer.ULTIMATE_STRENGTH.ordinal()] = INDICES[3];
        } catch (NoSuchFieldError e) {
            // Ignore if prayer not found
        }

        try {
            PrayerWeaponMapper.PRAYER_TO_INDEX[Prayer.CHIVALRY.ordinal()] = INDICES[4];
        } catch (NoSuchFieldError e) {
            // Ignore if prayer not found
        }

        try {
            PrayerWeaponMapper.PRAYER_TO_INDEX[Prayer.PIETY.ordinal()] = INDICES[5];
        } catch (NoSuchFieldError e) {
            // Ignore if prayer not found
        }

        try {
            PrayerWeaponMapper.PRAYER_TO_INDEX[Prayer.RIGOUR.ordinal()] = INDICES[6];
        } catch (NoSuchFieldError e) {
            // Ignore if prayer not found
        }

        try {
            PrayerWeaponMapper.PRAYER_TO_INDEX[Prayer.AUGURY.ordinal()] = INDICES[7];
        } catch (NoSuchFieldError e) {
            // Ignore if prayer not found
        }

        // Create WeaponStyle mapping array
        WEAPON_STYLE_TO_INDEX = new int[WeaponStyle.values().length];

        // Map weapon styles (indices 1-3)
        try {
            PrayerWeaponMapper.WEAPON_STYLE_TO_INDEX[WeaponStyle.MELEE.ordinal()] = INDICES[0];
        } catch (NoSuchFieldError e) {
            // Ignore if weapon style not found
        }

        try {
            PrayerWeaponMapper.WEAPON_STYLE_TO_INDEX[WeaponStyle.RANGE.ordinal()] = INDICES[1];
        } catch (NoSuchFieldError e) {
            // Ignore if weapon style not found
        }

        try {
            PrayerWeaponMapper.WEAPON_STYLE_TO_INDEX[WeaponStyle.MAGIC.ordinal()] = INDICES[2];
        } catch (NoSuchFieldError e) {
            // Ignore if weapon style not found
        }
    }
}
