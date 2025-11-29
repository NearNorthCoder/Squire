/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.client.config.Config
 *  net.runelite.client.config.ConfigGroup
 *  net.runelite.client.config.ConfigItem
 *  net.runelite.client.config.ConfigSection
 *  net.runelite.client.config.Range
 */
package gg.squire.basics.loot;

import java.util.Set;
import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.ConfigSection;
import net.runelite.client.config.Range;

@ConfigGroup(value="squirelooter")
public interface LooterConfig
extends Config {
    @ConfigSection(name="Bones Settings", description="Settings related to looting bones", position=30)
    public static final  String bonesSettings;
    @ConfigSection(name="Loot Settings", description="Settings related to looting", position=10)
    public static final  String lootSettings;
    @ConfigSection(name="Head Settings", description="Settings related to looting heads", position=40)
    public static final  String headSettings;
    @ConfigSection(name="Herb Settings", description="Settings related to looting herbs", position=20)
    public static final  String herbSettings;

    @ConfigItem(position=21, keyName="safespot", name="Safespot", description="Walks back to the tile you started at", section="Loot Settings")
    default public boolean safespot() {
        return 1 != 0;
    }

    @ConfigItem(keyName="herbsToLoot", name="Herbs To Loot", description="What rune type of herbs to loot", position=22, section="Herb Settings")
    default public Set<aG> herbsToLoot() {
        return Set.of();
    }

    @ConfigItem(position=31, keyName="lootBones", name="Loot Bones / Ashes", description="Loots ashes and bones", section="Bones Settings")
    default public boolean lootBones() {
        return 1 != 0;
    }

    @Range(min=1, max=32)
    @ConfigItem(position=22, keyName="range", name="Loot range", description="How many tiles at most to take loot from", section="Loot Settings")
    default public int lootRange() {
        return 0x3D ^ 0x37;
    }

    @ConfigItem(position=12, keyName="alchIds", name="Alch Loot Ids", description="Specify items to alch by ids (separate with commas)", section="Loot Settings")
    default public String alch() {
        return "";
    }

    @ConfigItem(position=14, keyName="Loot Above Value", name="Loot Above Value", description="Loot Above Value", section="Loot Settings")
    default public int lootValue() {
        return -(0xFFFFAFFE & 0x7467) & (0xFFFFFFEF & 0x37FD);
    }

    @ConfigItem(position=12, keyName="lootCustom", name="Custom Loot Ids", description="Specify custom items to loot by ids (separate with commas)", section="Loot Settings")
    default public String custom() {
        return "";
    }

    @ConfigItem(position=32, keyName="buryBones", name="Bury Bones / Scatter Ashes", description="Scatters ashes and buries bones", section="Bones Settings")
    default public boolean buryBones() {
        return 1 != 0;
    }

    @ConfigItem(position=41, keyName="lootHeads", name="Loot Ensouled Heads", description="Loots Ensouled Heads", section="Head Settings")
    default public boolean lootHeads() {
        return 1 != 0;
    }

    @ConfigItem(position=15, keyName="lootStackableInInventory", name="Loot Stackable In Inventory", description="Loot Stackable Items that we have in inventory", section="Loot Settings")
    default public boolean lootStackable() {
        return 1 != 0;
    }

    @ConfigItem(position=42, keyName="soulBearer", name="Use Soul Bearer", description="Use Soul Bearer", section="Head Settings")
    default public boolean useSoulBearer() {
        return 1 != 0;
    }

    @ConfigItem(position=21, keyName="lootHerbs", name="Loot Herbs", description="Loots Herbs", section="Herb Settings")
    default public boolean lootHerbs() {
        return 1 != 0;
    }

    static {
        herbSettings = "Herb Settings";
        bonesSettings = "Bones Settings";
        headSettings = "Head Settings";
        lootSettings = "Loot Settings";
    }
}

