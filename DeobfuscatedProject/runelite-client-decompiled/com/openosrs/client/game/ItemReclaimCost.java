/*
 * Decompiled with CFR 0.152.
 */
package com.openosrs.client.game;

import com.google.common.collect.ImmutableMap;
import javax.annotation.Nullable;

public enum ItemReclaimCost {
    FIRE_CAPE(6570, 50000),
    FIRE_MAX_CAPE(13329, 99000),
    INFERNAL_CAPE(21295, 50000),
    INFERNAL_MAX_CAPE(21284, 99000),
    AVAS_ASSEMBLER(22109, 75000),
    ASSEMBLER_MAX_CAPE(21898, 99000),
    IMBUED_GUTHIX_CAPE(21793, 75000),
    IMBUED_GUTHIX_MAX_CAPE(13335, 99000),
    IMBUED_SARADOMIN_CAPE(21791, 75000),
    IMBUED_SARADOMIN_MAX_CAPE(13331, 99000),
    IMBUED_ZAMORAK_CAPE(21795, 75000),
    IMBUED_ZAMORAK_MAX_CAPE(13333, 99000),
    BRONZE_DEFENDER(8844, 1000),
    IRON_DEFENDER(8845, 2000),
    STEEL_DEFENDER(8846, 2500),
    BLACK_DEFENDER(8847, 5000),
    MITHRIL_DEFENDER(8848, 15000),
    ADAMANT_DEFENDER(8849, 25000),
    RUNE_DEFENDER(8850, 35000),
    DRAGON_DEFENDER(12954, 40000),
    AVERNIC_DEFENDER(22322, 1000000),
    VOID_MAGE_HELM(11663, 40000),
    VOID_RANGER_HELM(11664, 40000),
    VOID_MELEE_HELM(11665, 40000),
    VOID_KNIGHT_TOP(8839, 45000),
    VOID_KNIGHT_ROBE(8840, 45000),
    VOID_KNIGHT_GLOVES(8842, 30000),
    ELITE_VOID_TOP(13072, 50000),
    ELITE_VOID_ROBE(13073, 50000),
    FIGHTER_HAT(10548, 45000),
    RANGER_HAT(10550, 45000),
    HEALER_HAT(10547, 45000),
    FIGHTER_TORSO(10551, 50000),
    PENANCE_SKIRT(10555, 20000),
    SARADOMIN_HALO(12637, 25000),
    ZAMORAK_HALO(12638, 25000),
    GUTHIX_HALO(12639, 25000),
    DECORATIVE_MAGIC_HAT(11898, 5000),
    DECORATIVE_MAGIC_ROBE_TOP(11896, 5000),
    DECORATIVE_MAGIC_ROBE_LEGS(11897, 5000),
    DECORATIVE_RANGE_TOP(11899, 5000),
    DECORATIVE_RANGE_BOTTOM(11900, 5000),
    DECORATIVE_RANGE_QUIVER(11901, 5000),
    GOLD_DECORATIVE_HELM(4511, 5000),
    GOLD_DECORATIVE_BODY(4509, 5000),
    GOLD_DECORATIVE_LEGS(4510, 5000),
    GOLD_DECORATIVE_SKIRT(11895, 5000),
    GOLD_DECORATIVE_SHIELD(4512, 5000),
    GOLD_DECORATIVE_SWORD(4508, 5000),
    GRANITE_MAUL(24225, 375000),
    GRANITE_MAUL_OR(24227, 375000);

    private static final ImmutableMap<Integer, ItemReclaimCost> idMap;
    private final int itemID;
    private final int value;

    @Nullable
    public static ItemReclaimCost of(int itemId) {
        return idMap.get(itemId);
    }

    public static boolean breaksOnDeath(int itemId) {
        return idMap.containsKey(itemId);
    }

    private ItemReclaimCost(int itemID, int value) {
        this.itemID = itemID;
        this.value = value;
    }

    public int getItemID() {
        return this.itemID;
    }

    public int getValue() {
        return this.value;
    }

    static {
        ImmutableMap.Builder<Integer, ItemReclaimCost> builder = ImmutableMap.builder();
        for (ItemReclaimCost items : ItemReclaimCost.values()) {
            builder.put(items.itemID, items);
        }
        idMap = builder.build();
    }
}

