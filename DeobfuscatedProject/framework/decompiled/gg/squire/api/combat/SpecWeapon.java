/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Item
 *  net.runelite.client.game.ItemVariationMapping
 */
package gg.squire.api.combat;

import net.runelite.api.Item;
import net.runelite.client.game.ItemVariationMapping;
import net.unethicalite.api.items.Inventory;

public enum SpecWeapon {
    DRAGON_BATTLEAXE(1377, 100, false),
    DRAGON_CLAWS(13652, 50, true),
    DRAGON_DAGGER(1215, 25, false),
    DRAGON_DAGGER_P(1231, 25, false),
    DRAGON_DAGGER_PP(5680, 25, false),
    DRAGON_DAGGER_PPP(5698, 25, false),
    DRAGON_HALBERD(3204, 30, true),
    DRAGON_LONGSWORD(1305, 25, false),
    DRAGON_MACE(1434, 25, false),
    DRAGON_WARHAMMER(13576, 50, false),
    ARMADYL_GODSWORD(11802, 50, true),
    BANDOS_GODSWORD(11804, 50, true),
    SARADOMIN_GODSWORD(11806, 50, true),
    SARADOMIN_SWORD(11838, 100, true),
    SARADOMIN_BLESSED_SWORD(12809, 65, true),
    VOIDWAKER(27690, 50, false),
    TOXIC_BLOWPIPE(12926, 50, true),
    OSMUMTENS_FANG(26219, 25, true),
    CRYSTAL_HALBERD(23987, 30, true);

    private final int itemID;
    private final int specAmount;
    private final boolean twoHanded;

    private SpecWeapon(int itemID, int specAmount, boolean twoHanded) {
        this.itemID = itemID;
        this.specAmount = specAmount;
        this.twoHanded = twoHanded;
    }

    public Item getInventoryItem() {
        int map = ItemVariationMapping.map((int)this.getItemID());
        return Inventory.getFirst(i -> ItemVariationMapping.getVariations((int)map).contains(i.getId()));
    }

    public boolean matches(Item item) {
        if (item == null) {
            return false;
        }
        int map = ItemVariationMapping.map((int)item.getId());
        return ItemVariationMapping.getVariations((int)map).contains(this.getItemID());
    }

    public static SpecWeapon forId(int itemId) {
        int map = ItemVariationMapping.map((int)itemId);
        for (SpecWeapon specWeapon : SpecWeapon.values()) {
            if (!ItemVariationMapping.getVariations((int)map).contains(specWeapon.getItemID())) continue;
            return specWeapon;
        }
        return null;
    }

    public int getItemID() {
        return this.itemID;
    }

    public int getSpecAmount() {
        return this.specAmount;
    }

    public boolean isTwoHanded() {
        return this.twoHanded;
    }
}
