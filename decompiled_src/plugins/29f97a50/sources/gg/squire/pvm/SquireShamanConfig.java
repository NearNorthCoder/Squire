package gg.squire.pvm;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.ConfigSection;
import net.runelite.client.config.Range;
import s.h.p000.m.a.n.u.r.i.s.q.a.s.e.d;
import s.h.p000.m.a.n.u.r.i.s.q.a.s.e.e;
import s.h.p000.m.a.n.u.r.i.s.q.a.s.e.f;
import s.h.p000.m.a.n.u.r.i.s.q.a.s.e.g;
import s.h.p000.m.a.n.u.r.i.s.q.a.s.e.h;
@ConfigGroup("squireshamans")
/* loaded from: 29f97a50-4c1f-4047-b5b1-e3e7ab557a1b.jar:gg/squire/pvm/SquireShamanConfig.class */
public interface SquireShamanConfig extends Config {
    @ConfigSection(name = "Fight Settings", description = "Settings related to killing Shamans", position = 10)
    public static final /* synthetic */ String SHAMAN_SETTINGS = "Fight Settings";
    @ConfigSection(name = "Bank Settings", description = "Bank options", position = 20)
    public static final /* synthetic */ String BANK_SETTINGS = "Bank Settings";
    @ConfigSection(name = "Loot Settings", description = "Loot options", position = 30)
    public static final /* synthetic */ String LOOT_SETTINGS = "Loot Settings";

    /* JADX WARN: Type inference failed for: r0v1, types: [boolean, int] */
    @ConfigItem(position = 32, keyName = "runepouch", name = "Rune Pouch", description = "High alchs are in the rune pouch?", section = "Loot Settings")
    default boolean runePouch() {
        return " ".length();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [boolean, int] */
    @ConfigItem(position = 13, keyName = "Pray Flick", name = "Pray Flick", description = "Performs 1t pray flicking whilst fighting", section = "Fight Settings")
    default boolean prayFlick() {
        return " ".length();
    }

    @ConfigItem(position = 28, keyName = "Teleport Method", name = "Teleport Method", description = "Teleport Method", section = "Bank Settings")
    default h teleportItem() {
        return h.ARDY_CLOAK;
    }

    @ConfigItem(position = 31, keyName = "Loot Above Value", name = "Loot Above Value", description = "Loot Above Value", section = "Loot Settings")
    default int lootValue() {
        return (-((-12738) & 29175)) & (-10243) & 31679;
    }

    @ConfigItem(position = 21, keyName = "Food ID", name = "Food ID", description = "Food ID", section = "Bank Settings")
    default e food() {
        return e.KARAMBWAN;
    }

    @ConfigItem(position = 22, keyName = "Amount Of Food", name = "Amount Of Food", description = "Amount Of Food", section = "Bank Settings")
    @Range(min = 1, max = 16)
    default int foodAmount() {
        return (8 ^ 30) ^ (142 ^ 146);
    }

    @ConfigItem(position = 23, keyName = "Remedy", name = "Poison Remedy", description = "Cure item to use for poison", section = "Bank Settings")
    default d cure() {
        return d.SUPERANTIPOISON;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ConfigItem(position = 14, keyName = "bonecrusher", name = "Use Bonecrusher", description = "Enables the usage of bone crusher", section = "Fight Settings")
    default boolean boneCrusher() {
        return ((167 ^ 154) ^ (93 ^ 44)) & (((55 ^ 94) ^ (98 ^ 71)) ^ (-" ".length())) & ((((139 ^ 163) ^ (200 ^ 166)) & (((132 ^ 169) ^ (71 ^ 44)) ^ (-" ".length()))) ^ (-" ".length()));
    }

    @ConfigItem(position = 11, keyName = "Room", name = "Room", description = "Room to fight", section = "Fight Settings")
    default g room() {
        return g.FIRST_ROOM;
    }

    @ConfigItem(position = 31, keyName = "weapon.id", name = "Weapon ID", description = "Enter an id here if you catch the bot getting stuck trying to fight with dramen staff", section = "Loot Settings")
    default int weapon() {
        return (-2695) & 28559;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [boolean, int] */
    @ConfigItem(position = 31, keyName = "highalch", name = "High Alching", description = "High alchs rune/stave drops", section = "Loot Settings")
    default boolean alch() {
        return " ".length();
    }

    @ConfigItem(position = 12, keyName = "eatAt", name = "Eat at HP", description = "What hp to eat food at", section = "Fight Settings")
    @Range(min = 1, max = 99)
    default int eatAt() {
        return (124 ^ 32) ^ (105 ^ 116);
    }

    @ConfigItem(position = 25, keyName = "RangePotion", name = "Range Potion", description = "Range Potion type to use", section = "Bank Settings")
    default f rangePotion() {
        return f.RANGE_POTION;
    }

    @ConfigItem(position = 29, keyName = "stamina", name = "Use Stamina", description = "Brings a stamina potion to restore run energy", section = "Bank Settings")
    default boolean stamina() {
        return (true ^ true) & ((!true) ^ true);
    }

    @ConfigItem(position = 27, keyName = "PrayerPotionAmount", name = "Amount of Prayer Potions", description = "Amount of prayer potions to take", section = "Bank Settings")
    @Range(max = 4)
    default int prayerPotionAmount() {
        return " ".length();
    }

    @ConfigItem(position = 24, keyName = "Amount Of Remedies", name = "Amount Of Remedies", description = "Amount Of Remedies", section = "Bank Settings")
    @Range(min = 1, max = 8)
    default int amountOfRemedies() {
        return 72 ^ 77;
    }

    @ConfigItem(position = 26, keyName = "RangePotionAmount", name = "Amount of Range Potions", description = "Amount of range potons to take", section = "Bank Settings")
    @Range(max = 5)
    default int rangePotionAmount() {
        return "  ".length();
    }
}
