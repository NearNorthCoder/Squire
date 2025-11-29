package gg.squire.basics.combat.AutoAttacker;

import i.i.b.s.c.q.r.s.s.p000.u.a.e.G;
import i.i.b.s.c.q.r.s.s.p000.u.a.e.H;
import i.i.b.s.c.q.r.s.s.p000.u.a.e.I;
import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.ConfigSection;
import net.runelite.client.config.Range;
import net.unethicalite.api.movement.pathfinder.model.TeleportSpell;
@ConfigGroup("squireattacker")
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:gg/squire/basics/combat/AutoAttacker/AutoAttackConfig.class */
public interface AutoAttackConfig extends Config {
    @ConfigSection(name = "Attack Settings", description = "Settings related to attacking", position = 10)
    public static final /* synthetic */ String attackSettings = "Attack Settings";
    @ConfigSection(name = "Teleport Settings", description = "Settings related to teleporting", position = 20)
    public static final /* synthetic */ String teleportSettings = "Teleport Settings";
    @ConfigSection(name = "Special Settings", description = "Settings related to Special Attacks", position = 30)
    public static final /* synthetic */ String specialSettings = "Special Settings";

    @ConfigItem(keyName = "safeSpot", name = "Safe spot", description = "Safe spot will force your character to always return to the tile you started the script on", position = 15, section = "Attack Settings")
    default boolean safeSpot() {
        return (true ^ true) & ((true ^ true) ^ true);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [boolean, int] */
    @ConfigItem(position = 12, keyName = "fillSlayer", name = "Auto fill above with slayer task", description = "Auto fill NPC to attack with slayer task", section = "Attack Settings")
    default boolean fillSlayer() {
        return " ".length();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [boolean, int] */
    @ConfigItem(position = 21, keyName = "teleport", name = "Teleport after task", description = "Teleport after task", section = "Teleport Settings")
    default boolean teleportAfterTask() {
        return " ".length();
    }

    @ConfigItem(position = 24, keyName = "teleportItem", name = " ", hidden = true, unhide = "teleportType", unhideValue = "ITEM", description = "Teleportation spell", section = "Teleport Settings")
    default H teleportItem() {
        return H.CONSTRUCTION_CAPE;
    }

    @ConfigItem(position = 11, keyName = "npcAttack", name = "NPC to attack", description = "NPC to attack", section = "Attack Settings")
    default String npcName() {
        return "Turoth";
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [boolean, int] */
    @ConfigItem(keyName = "specAttack", name = "Use Special Attack", description = "Use Special Attack", position = 31, section = "Special Settings")
    default boolean useSpecialAttack() {
        return " ".length();
    }

    @ConfigItem(position = 13, keyName = "npcDistance", name = "NPC distance", description = "Attack NPCS within X tiles", section = "Attack Settings")
    @Range(max = 16)
    default int npcDistance() {
        return "   ".length();
    }

    @ConfigItem(position = 23, keyName = "teleportSpell", name = " ", hidden = true, unhide = "teleportType", unhideValue = "SPELL", description = "Teleportation spell", section = "Teleport Settings")
    default TeleportSpell teleportSpell() {
        return TeleportSpell.VARROCK_TELEPORT;
    }

    @ConfigItem(keyName = "specialWeapon", name = "Wep", description = "Which Weapon to use special attack with", position = 32, hidden = true, unhide = "specAttack", section = "Special Settings")
    default G specWeapon() {
        return G.DRAGON_BATTLEAXE;
    }

    @ConfigItem(position = 22, keyName = "teleportType", name = "Teleport Type", description = "Teleportation Type", section = "Teleport Settings")
    default I teleportType() {
        return I.ITEM;
    }

    @ConfigItem(position = 14, keyName = "exactName", name = "Exact NPC name", description = "Are you using the exact npc name or does the npc name contain your value", section = "Attack Settings")
    default boolean exactName() {
        return (true ^ true) & ((true ^ true) ^ true);
    }

    @ConfigItem(keyName = "safeSpotRadius", name = "Safe spot radius", description = "Radius of the safe spot to return to. 0 will always return to the same tile, 1 will return to a 1 tile radius of safespot", position = 16, hidden = true, unhide = "safeSpot", section = "Attack Settings")
    default int safeSpotRadius() {
        return " ".length();
    }
}
