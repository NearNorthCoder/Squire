/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.client.config.Config
 *  net.runelite.client.config.ConfigGroup
 *  net.runelite.client.config.ConfigItem
 *  net.runelite.client.config.ConfigSection
 *  net.runelite.client.config.Range
 *  net.unethicalite.api.movement.pathfinder.model.TeleportSpell
 */
package gg.squire.basics.combat.RingOfLife;

import i.i.b.s.c.q.r.s.s.-.u.a.e.HEnum;
import i.i.b.s.c.q.r.s.s.-.u.a.e.IEnum;
import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.ConfigSection;
import net.runelite.client.config.Range;
import net.unethicalite.api.movement.pathfinder.model.TeleportSpell;

@ConfigGroup(value="squirerol")
public interface RingOfLifeConfig
extends Config {
    @ConfigSection(name="Ring of Life", description="Settings related to the Ring of Life plugin", position=1)
    public static final /* synthetic */ String rolSettings;
    @ConfigSection(name="Teleport Settings", description="Settings related to teleporting", position=10)
    public static final /* synthetic */ String teleportSettings;

    @Range(max=99, min=3)
    @ConfigItem(position=11, keyName="teleportHP", name="Teleport health", description="Health to teleport at", section="Teleport Settings")
    default public int teleHP() {
        return 9 ^ 0x3A ^ 1;
    }

    @ConfigItem(position=1, keyName="logOutIfTriggered", name="Log out if triggered?", description="Stops all Squire plugins and logs you out if RoL is triggered.", section="Ring of Life")
    default public boolean logOutOnTrigger() {
        return 1 != 0;
    }

    @ConfigItem(position=1, keyName="teleportType", name=" ", description="Type of teleport to use", section="Teleport Settings")
    default public I teleportType() {
        return I.SPELL;
    }

    @ConfigItem(position=11, keyName="teleportItem", name=" ", description="Teleportation item", section="Teleport Settings", hidden=true, unhide="teleportType", unhideValue="ITEM")
    default public H teleportItem() {
        return H.CONSTRUCTION_CAPE;
    }

    static {
        rolSettings = "Ring of Life";
        teleportSettings = "Teleport Settings";
    }

    @ConfigItem(position=11, keyName="teleportSpell", name=" ", description="Teleportation spell", section="Teleport Settings", hidden=true, unhide="teleportType", unhideValue="SPELL")
    default public TeleportSpell teleportSpell() {
        return TeleportSpell.VARROCK_TELEPORT;
    }
}

