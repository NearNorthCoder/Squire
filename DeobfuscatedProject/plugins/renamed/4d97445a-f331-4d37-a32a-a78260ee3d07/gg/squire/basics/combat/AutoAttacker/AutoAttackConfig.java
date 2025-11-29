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
package gg.squire.basics.combat.AutoAttacker;

import i.i.b.s.c.q.r.s.s.-.u.a.e.GEnum;
import i.i.b.s.c.q.r.s.s.-.u.a.e.HEnum;
import i.i.b.s.c.q.r.s.s.-.u.a.e.IEnum;
import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.ConfigSection;
import net.runelite.client.config.Range;
import net.unethicalite.api.movement.pathfinder.model.TeleportSpell;

@ConfigGroup(value="squireattacker")
public interface AutoAttackConfig
extends Config {
    @ConfigSection(name="Teleport Settings", description="Settings related to teleporting", position=20)
    public static final /* synthetic */ String teleportSettings;
    @ConfigSection(name="Attack Settings", description="Settings related to attacking", position=10)
    public static final /* synthetic */ String attackSettings;
    @ConfigSection(name="Special Settings", description="Settings related to Special Attacks", position=30)
    public static final /* synthetic */ String specialSettings;

    static {
        attackSettings = "Attack Settings";
        teleportSettings = "Teleport Settings";
        specialSettings = "Special Settings";
    }

    @ConfigItem(keyName="safeSpot", name="Safe spot", description="Safe spot will force your character to always return to the tile you started the script on", position=15, section="Attack Settings")
    default public boolean safeSpot() {
        return false;
    }

    @ConfigItem(position=12, keyName="fillSlayer", name="Auto fill above with slayer task", description="Auto fill NPC to attack with slayer task", section="Attack Settings")
    default public boolean fillSlayer() {
        return 1 != 0;
    }

    @ConfigItem(position=21, keyName="teleport", name="Teleport after task", description="Teleport after task", section="Teleport Settings")
    default public boolean teleportAfterTask() {
        return 1 != 0;
    }

    @ConfigItem(position=24, keyName="teleportItem", name=" ", hidden=true, unhide="teleportType", unhideValue="ITEM", description="Teleportation spell", section="Teleport Settings")
    default public H teleportItem() {
        return H.CONSTRUCTION_CAPE;
    }

    @ConfigItem(position=11, keyName="npcAttack", name="NPC to attack", description="NPC to attack", section="Attack Settings")
    default public String npcName() {
        return "Turoth";
    }

    @ConfigItem(keyName="specAttack", name="Use Special Attack", description="Use Special Attack", position=31, section="Special Settings")
    default public boolean useSpecialAttack() {
        return 1 != 0;
    }

    @ConfigItem(position=13, keyName="npcDistance", name="NPC distance", description="Attack NPCS within X tiles", section="Attack Settings")
    @Range(max=16)
    default public int npcDistance() {
        return 3;
    }

    @ConfigItem(position=23, keyName="teleportSpell", name=" ", hidden=true, unhide="teleportType", unhideValue="SPELL", description="Teleportation spell", section="Teleport Settings")
    default public TeleportSpell teleportSpell() {
        return TeleportSpell.VARROCK_TELEPORT;
    }

    @ConfigItem(keyName="specialWeapon", name="Wep", description="Which Weapon to use special attack with", position=32, hidden=true, unhide="specAttack", section="Special Settings")
    default public G specWeapon() {
        return G.DRAGON_BATTLEAXE;
    }

    @ConfigItem(position=22, keyName="teleportType", name="Teleport Type", description="Teleportation Type", section="Teleport Settings")
    default public I teleportType() {
        return I.ITEM;
    }

    @ConfigItem(position=14, keyName="exactName", name="Exact NPC name", description="Are you using the exact npc name or does the npc name contain your value", section="Attack Settings")
    default public boolean exactName() {
        return false;
    }

    @ConfigItem(keyName="safeSpotRadius", name="Safe spot radius", description="Radius of the safe spot to return to. 0 will always return to the same tile, 1 will return to a 1 tile radius of safespot", position=16, hidden=true, unhide="safeSpot", section="Attack Settings")
    default public int safeSpotRadius() {
        return 1;
    }
}

