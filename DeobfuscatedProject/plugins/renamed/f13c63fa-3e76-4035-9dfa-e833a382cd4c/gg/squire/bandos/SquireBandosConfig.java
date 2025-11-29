/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.client.config.Config
 *  net.runelite.client.config.ConfigGroup
 *  net.runelite.client.config.ConfigItem
 */
package gg.squire.bandos;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import q.s.r.i.e.s.o.u.a.d.n.-.b.CEnum;

@ConfigGroup(value="squirebandos")
public interface SquireBandosConfig
extends Config {
    @ConfigItem(keyName="bandos.altarteleport", name="Teleport out using altar", description="Uses the teleport option on the altar to leave the room", position=11)
    default public boolean altarTeleport() {
        return false;
    }

    @ConfigItem(keyName="looting.walk", name="Turn off run for looting", description="Turns off run to save energy for looting", position=13)
    default public boolean turnOffRun() {
        return ((0x73 ^ 0x4E ^ (0x17 ^ 0x2F)) & (97 + 48 - 100 + 85 ^ 29 + 0 - -96 + 10 ^ -1)) != 0;
    }

    @ConfigItem(keyName="cannon.pickup", name="Pick up cannon", description="Picks up cannon before teleporting out", position=9)
    default public boolean pickupCannon() {
        return ((0xB ^ 0x60 ^ (0x79 ^ 0x20)) & (0x2C ^ 5 ^ (0xDA ^ 0xC1) ^ -1)) != 0;
    }

    @ConfigItem(keyName="bandos.alch", name="Use High Alchemy", description="Uses high alchemy on rune items dropped by bandos", position=10)
    default public boolean alch() {
        return false;
    }

    @ConfigItem(keyName="bandos.rangeprayer", name="Range prayer", description="What range prayer to use", position=12)
    default public c rangePrayer() {
        return c.EAGLE_EYE;
    }

    @ConfigItem(keyName="minions.bp", name="Use blowpipe version minions", description="Swaps to blowpipe for minions", position=14)
    default public boolean useBlowpipe() {
        return ((94 + 10 - 12 + 45 ^ 152 + 67 - 112 + 65) & (0x21 ^ 0x24 ^ (3 ^ 0x23) ^ -1)) != 0;
    }
}

