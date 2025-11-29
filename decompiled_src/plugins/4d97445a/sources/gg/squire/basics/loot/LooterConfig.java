package gg.squire.basics.loot;

import i.i.b.s.c.q.r.s.s.p000.u.a.e.aG;
import java.util.Set;
import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.ConfigSection;
import net.runelite.client.config.Range;
@ConfigGroup("squirelooter")
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:gg/squire/basics/loot/LooterConfig.class */
public interface LooterConfig extends Config {
    @ConfigSection(name = "Herb Settings", description = "Settings related to looting herbs", position = 20)
    public static final /* synthetic */ String herbSettings = "Herb Settings";
    @ConfigSection(name = "Bones Settings", description = "Settings related to looting bones", position = 30)
    public static final /* synthetic */ String bonesSettings = "Bones Settings";
    @ConfigSection(name = "Head Settings", description = "Settings related to looting heads", position = 40)
    public static final /* synthetic */ String headSettings = "Head Settings";
    @ConfigSection(name = "Loot Settings", description = "Settings related to looting", position = 10)
    public static final /* synthetic */ String lootSettings = "Loot Settings";

    /* JADX WARN: Type inference failed for: r0v1, types: [boolean, int] */
    @ConfigItem(position = 21, keyName = "safespot", name = "Safespot", description = "Walks back to the tile you started at", section = "Loot Settings")
    default boolean safespot() {
        return " ".length();
    }

    @ConfigItem(keyName = "herbsToLoot", name = "Herbs To Loot", description = "What rune type of herbs to loot", position = 22, section = "Herb Settings")
    default Set<aG> herbsToLoot() {
        return Set.of();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [boolean, int] */
    @ConfigItem(position = 31, keyName = "lootBones", name = "Loot Bones / Ashes", description = "Loots ashes and bones", section = "Bones Settings")
    default boolean lootBones() {
        return " ".length();
    }

    @ConfigItem(position = 22, keyName = "range", name = "Loot range", description = "How many tiles at most to take loot from", section = "Loot Settings")
    @Range(min = 1, max = 32)
    default int lootRange() {
        return 61 ^ 55;
    }

    @ConfigItem(position = 12, keyName = "alchIds", name = "Alch Loot Ids", description = "Specify items to alch by ids (separate with commas)", section = "Loot Settings")
    default String alch() {
        return "";
    }

    @ConfigItem(position = 14, keyName = "Loot Above Value", name = "Loot Above Value", description = "Loot Above Value", section = "Loot Settings")
    default int lootValue() {
        return (-((-20482) & 29799)) & (-17) & 14333;
    }

    @ConfigItem(position = 12, keyName = "lootCustom", name = "Custom Loot Ids", description = "Specify custom items to loot by ids (separate with commas)", section = "Loot Settings")
    default String custom() {
        return "";
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [boolean, int] */
    @ConfigItem(position = 32, keyName = "buryBones", name = "Bury Bones / Scatter Ashes", description = "Scatters ashes and buries bones", section = "Bones Settings")
    default boolean buryBones() {
        return " ".length();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [boolean, int] */
    @ConfigItem(position = 41, keyName = "lootHeads", name = "Loot Ensouled Heads", description = "Loots Ensouled Heads", section = "Head Settings")
    default boolean lootHeads() {
        return " ".length();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [boolean, int] */
    @ConfigItem(position = 15, keyName = "lootStackableInInventory", name = "Loot Stackable In Inventory", description = "Loot Stackable Items that we have in inventory", section = "Loot Settings")
    default boolean lootStackable() {
        return " ".length();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [boolean, int] */
    @ConfigItem(position = 42, keyName = "soulBearer", name = "Use Soul Bearer", description = "Use Soul Bearer", section = "Head Settings")
    default boolean useSoulBearer() {
        return " ".length();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [boolean, int] */
    @ConfigItem(position = 21, keyName = "lootHerbs", name = "Loot Herbs", description = "Loots Herbs", section = "Herb Settings")
    default boolean lootHerbs() {
        return " ".length();
    }
}
