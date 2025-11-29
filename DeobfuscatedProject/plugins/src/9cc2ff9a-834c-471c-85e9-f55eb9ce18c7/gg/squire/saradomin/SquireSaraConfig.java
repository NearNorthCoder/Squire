/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.client.config.Config
 *  net.runelite.client.config.ConfigGroup
 *  net.runelite.client.config.ConfigItem
 *  net.runelite.client.config.ConfigStorageBox
 *  net.runelite.client.config.Range
 *  net.runelite.client.plugins.squire.bankloadouts.BankLoadout
 */
package gg.squire.saradomin;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.ConfigStorageBox;
import net.runelite.client.config.Range;
import net.runelite.client.plugins.squire.bankloadouts.BankLoadout;
import u.i.a.a.-.s.m.n.i.q.d.r.r.s.o.e.i;

@ConfigGroup(value="squire_saradomin")
public interface SquireSaraConfig
extends Config {
    public static final /* synthetic */ String SQUIRE_SARA_GROUP;

    @ConfigItem(keyName="sara.alch", name="Enable alching", description="Should the plugin alch stuff", position=15)
    default public boolean alch() {
        return " ".length() != 0;
    }

    static {
        SQUIRE_SARA_GROUP = "squire_saradomin";
    }

    @Range(min=20, max=80)
    @ConfigItem(keyName="sara.eatrange", name="Eat at hp", description="At what hp should the plugin eat food?", position=14)
    default public int eatFoodAt() {
        return 0x5A ^ 0x68;
    }

    @ConfigItem(keyName="kc.spirituals", name="Spiritual mages", description="Should we get kc on spiritual mages?", position=16)
    default public boolean kcSpirituals() {
        return " ".length() != 0;
    }

    @ConfigItem(keyName="minions.bp", name="Use blowpipe", description="Swaps to blowpipe for killing minions", position=14)
    default public boolean useBlowpipe() {
        return ((0x1F ^ 0x23 ^ (0x70 ^ 0x14)) & (0xD5 ^ 0x85 ^ (0xB0 ^ 0xB8) ^ -" ".length())) != 0;
    }

    @ConfigItem(keyName="sara.rangeprayer", name="Range prayer", description="What range prayer to use", position=12)
    default public i rangePrayer() {
        return i.EAGLE_EYE;
    }

    @ConfigItem(keyName="looting.walk", name="Turn off run for looting", description="Turns off run to save energy for looting", position=13)
    default public boolean turnOffRun() {
        return ((0x42 ^ 0x38 ^ (0x37 ^ 0x75)) & (127 + 115 - 194 + 87 ^ 61 + 40 - -9 + 81 ^ -" ".length())) != 0;
    }

    @ConfigItem(name="Bank Loadout", description="What bank loadout to get for saradomin?", keyName="bank.loadout", position=0)
    default public ConfigStorageBox<BankLoadout> bankLoadout() {
        return new ConfigStorageBox("bankloadout", "None");
    }

    @ConfigItem(keyName="sara.altarteleport", name="Teleport out using altar", description="Uses the teleport option on the altar to leave the room", position=11)
    default public boolean altarTeleport() {
        return (" ".length() & ~" ".length()) != 0;
    }
}

