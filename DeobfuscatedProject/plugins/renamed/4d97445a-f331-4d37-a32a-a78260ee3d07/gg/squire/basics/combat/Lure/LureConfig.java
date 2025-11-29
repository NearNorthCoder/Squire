/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.client.config.Config
 *  net.runelite.client.config.ConfigGroup
 *  net.runelite.client.config.ConfigItem
 *  net.runelite.client.config.Keybind
 */
package gg.squire.basics.combat.Lure;

import i.i.b.s.c.q.r.s.s.-.u.a.e.NEnum;
import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.Keybind;

@ConfigGroup(value="squirelurer")
public interface LureConfig
extends Config {
    @ConfigItem(position=3, name="Use Secondary?", description="using a secondary?", keyName="useSecondary")
    default public boolean usingSecondary() {
        return 1 != 0;
    }

    @ConfigItem(position=1, name="Tagging weapon ID", description="What weapon to tag monsters with", keyName="tagging")
    default public int tagging() {
        return -(0xFFFFEEA3 & 0x75FD) & (0xFFFFF7FD & 0x6FFF);
    }

    @ConfigItem(position=5, name="Activation key", description="Key to activate", keyName="activate")
    default public Keybind activate() {
        return Keybind.NOT_SET;
    }

    @ConfigItem(position=4, name="Secondary weapon ID", hidden=true, unhide="useSecondary", description="What weapon to kill monsters with", keyName="secondaryID")
    default public int secondaryWeaponID() {
        return 0xFFFFBE3F & 0x73D9;
    }

    @ConfigItem(position=0, name="Monster to lure", description="What monster does the account need to lure", keyName="luring")
    default public N luring() {
        return N.DUST_DEVIL;
    }

    @ConfigItem(position=2, name="Primary weapon ID", description="What weapon to tag monsters with", keyName="primaryID")
    default public int primaryWeaponID() {
        return 0xFFFFF67F & 0x5B8E;
    }
}

