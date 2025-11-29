/*
 * Decompiled with CFR 0.152.
 *
 * Could not load the following classes:
 *  net.runelite.api.EquipmentInventorySlot
 *  net.runelite.api.Item
 *  net.unethicalite.api.items.Equipment
 */
package gg.squire.autotoa.tasks;

import java.util.List;
import net.runelite.api.EquipmentInventorySlot;
import net.runelite.api.Item;
import net.unethicalite.api.items.Equipment;

/**
 * Represents weapons with special attacks and their energy requirements.
 * Used to determine which special attacks are available for TOA combat.
 */
public enum SpecialWeapon {
    DRAGON_DAGGER(List.of(1215, 1231, 5680, 5698, 20407), 50),
    BANDOS_GODSWORD(List.of(11804, 11806), 22245),
    TOXIC_BLOWPIPE(List.of(12926), 22245),
    OSMUMTENS_FANG(List.of(26219, 27070), 50),
    DRAGON_CLAWS(List.of(13652), 22245),
    VOIDWAKER(List.of(27690, 27693), 22245),
    ZARYTE_CROSSBOW(List.of(26374, 26375), 22447);

    private final List<Integer> itemIds;
    private final int specialEnergyRequired;

    SpecialWeapon(List<Integer> itemIds, int specialEnergyRequired) {
        this.itemIds = itemIds;
        this.specialEnergyRequired = specialEnergyRequired;
    }

    /**
     * Gets the list of item IDs for this weapon.
     * @return list of item IDs
     */
    public List<Integer> getItemIds() {
        return this.itemIds;
    }

    /**
     * Gets the special attack energy required (as a percentage).
     * @return the special attack energy requirement
     */
    public int getSpecialEnergyRequired() {
        return this.specialEnergyRequired;
    }

    /**
     * Gets the halved special attack energy (for calculations).
     * @return half of the special attack energy
     */
    public int getHalfSpecialEnergy() {
        return this.specialEnergyRequired / 8;
    }

    /**
     * Gets the special attack energy requirement for the currently equipped weapon.
     * @return the energy requirement, or -1 if no special weapon is equipped
     */
    public static int getEquippedWeaponSpecialEnergy() {
        Item weapon = Equipment.fromSlot(EquipmentInventorySlot.WEAPON);
        if (weapon == null) {
            return -1;
        }

        for (SpecialWeapon specialWeapon : values()) {
            if (specialWeapon.getItemIds().contains(weapon.getId())) {
                return specialWeapon.getHalfSpecialEnergy();
            }
        }

        return -1;
    }

    /**
     * Gets the special attack energy for specific item IDs.
     * @param itemIds the item IDs to check
     * @return the energy requirement, or -1 if not found
     */
    public static int getSpecialEnergyForItems(int... itemIds) {
        for (SpecialWeapon weapon : values()) {
            for (int itemId : itemIds) {
                if (weapon.getItemIds().contains(itemId)) {
                    return weapon.getHalfSpecialEnergy();
                }
            }
        }
        return -1;
    }
}
