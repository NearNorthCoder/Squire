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
package gg.squire.pvm;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.ConfigSection;
import net.runelite.client.config.Range;
import s.h.-.m.a.n.u.r.i.s.q.a.s.e.d;
import s.h.-.m.a.n.u.r.i.s.q.a.s.e.e;
import s.h.-.m.a.n.u.r.i.s.q.a.s.e.f;
import s.h.-.m.a.n.u.r.i.s.q.a.s.e.g;
import s.h.-.m.a.n.u.r.i.s.q.a.s.e.h;

@ConfigGroup(value="squireshamans")
public interface SquireShamanConfig
extends Config {
    @ConfigSection(name="Bank Settings", description="Bank options", position=20)
    public static final /* synthetic */ String BANK_SETTINGS;
    @ConfigSection(name="Loot Settings", description="Loot options", position=30)
    public static final /* synthetic */ String LOOT_SETTINGS;
    @ConfigSection(name="Fight Settings", description="Settings related to killing Shamans", position=10)
    public static final /* synthetic */ String SHAMAN_SETTINGS;

    @ConfigItem(position=32, keyName="runepouch", name="Rune Pouch", description="High alchs are in the rune pouch?", section="Loot Settings")
    default public boolean runePouch() {
        return 1 != 0;
    }

    @ConfigItem(position=13, keyName="Pray Flick", name="Pray Flick", description="Performs 1t pray flicking whilst fighting", section="Fight Settings")
    default public boolean prayFlick() {
        return 1 != 0;
    }

    @ConfigItem(position=28, keyName="Teleport Method", name="Teleport Method", description="Teleport Method", section="Bank Settings")
    default public h teleportItem() {
        return h.ARDY_CLOAK;
    }

    @ConfigItem(position=31, keyName="Loot Above Value", name="Loot Above Value", description="Loot Above Value", section="Loot Settings")
    default public int lootValue() {
        return -(0xFFFFCE3E & 0x71F7) & (0xFFFFD7FD & 0x7BBF);
    }

    @ConfigItem(position=21, keyName="Food ID", name="Food ID", description="Food ID", section="Bank Settings")
    default public e food() {
        return e.KARAMBWAN;
    }

    @Range(min=1, max=16)
    @ConfigItem(position=22, keyName="Amount Of Food", name="Amount Of Food", description="Amount Of Food", section="Bank Settings")
    default public int foodAmount() {
        return 8 ^ 0x1E ^ (0x8E ^ 0x92);
    }

    @ConfigItem(position=23, keyName="Remedy", name="Poison Remedy", description="Cure item to use for poison", section="Bank Settings")
    default public d cure() {
        return d.SUPERANTIPOISON;
    }

    @ConfigItem(position=14, keyName="bonecrusher", name="Use Bonecrusher", description="Enables the usage of bone crusher", section="Fight Settings")
    default public boolean boneCrusher() {
        return ((0xA7 ^ 0x9A ^ (0x5D ^ 0x2C)) & (0x37 ^ 0x5E ^ (0x62 ^ 0x47) ^ -1) & ((0x8B ^ 0xA3 ^ (0xC8 ^ 0xA6)) & (0x84 ^ 0xA9 ^ (0x47 ^ 0x2C) ^ -1) ^ -1)) != 0;
    }

    @ConfigItem(position=11, keyName="Room", name="Room", description="Room to fight", section="Fight Settings")
    default public g room() {
        return g.FIRST_ROOM;
    }

    @ConfigItem(position=31, keyName="weapon.id", name="Weapon ID", description="Enter an id here if you catch the bot getting stuck trying to fight with dramen staff", section="Loot Settings")
    default public int weapon() {
        return 0xFFFFF579 & 0x6F8F;
    }

    @ConfigItem(position=31, keyName="highalch", name="High Alching", description="High alchs rune/stave drops", section="Loot Settings")
    default public boolean alch() {
        return 1 != 0;
    }

    @ConfigItem(position=12, keyName="eatAt", name="Eat at HP", description="What hp to eat food at", section="Fight Settings")
    @Range(min=1, max=99)
    default public int eatAt() {
        return 0x7C ^ 0x20 ^ (0x69 ^ 0x74);
    }

    @ConfigItem(position=25, keyName="RangePotion", name="Range Potion", description="Range Potion type to use", section="Bank Settings")
    default public f rangePotion() {
        return f.RANGE_POTION;
    }

    static {
        SHAMAN_SETTINGS = "Fight Settings";
        BANK_SETTINGS = "Bank Settings";
        LOOT_SETTINGS = "Loot Settings";
    }

    @ConfigItem(position=29, keyName="stamina", name="Use Stamina", description="Brings a stamina potion to restore run energy", section="Bank Settings")
    default public boolean stamina() {
        return false;
    }

    @ConfigItem(position=27, keyName="PrayerPotionAmount", name="Amount of Prayer Potions", description="Amount of prayer potions to take", section="Bank Settings")
    @Range(max=4)
    default public int prayerPotionAmount() {
        return 1;
    }

    @ConfigItem(position=24, keyName="Amount Of Remedies", name="Amount Of Remedies", description="Amount Of Remedies", section="Bank Settings")
    @Range(min=1, max=8)
    default public int amountOfRemedies() {
        return 0x48 ^ 0x4D;
    }

    @ConfigItem(position=26, keyName="RangePotionAmount", name="Amount of Range Potions", description="Amount of range potons to take", section="Bank Settings")
    @Range(max=5)
    default public int rangePotionAmount() {
        return 2;
    }
}

