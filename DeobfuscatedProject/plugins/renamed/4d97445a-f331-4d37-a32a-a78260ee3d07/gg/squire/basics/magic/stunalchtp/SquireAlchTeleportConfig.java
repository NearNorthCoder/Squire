/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.client.config.Config
 *  net.runelite.client.config.ConfigGroup
 *  net.runelite.client.config.ConfigItem
 */
package gg.squire.basics.magic.stunalchtp;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

@ConfigGroup(value="squirestuntelealchconfig")
public interface SquireAlchTeleportConfig
extends Config {
    @ConfigItem(keyName="stunAlch", name="Tele Alch only?", description="Only does tele alch, no stun", position=1)
    default public boolean stunAlchOnly() {
        return ((0x59 ^ 0x7A ^ (0x11 ^ 0x34)) & (96 + 32 - 118 + 132 ^ 130 + 96 - 168 + 78 ^ -1)) != 0;
    }
}

