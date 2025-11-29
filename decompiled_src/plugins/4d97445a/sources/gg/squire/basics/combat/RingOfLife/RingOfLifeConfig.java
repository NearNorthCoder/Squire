package gg.squire.basics.combat.RingOfLife;

import i.i.b.s.c.q.r.s.s.p000.u.a.e.H;
import i.i.b.s.c.q.r.s.s.p000.u.a.e.I;
import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.ConfigSection;
import net.runelite.client.config.Range;
import net.unethicalite.api.movement.pathfinder.model.TeleportSpell;
@ConfigGroup("squirerol")
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:gg/squire/basics/combat/RingOfLife/RingOfLifeConfig.class */
public interface RingOfLifeConfig extends Config {
    @ConfigSection(name = "Ring of Life", description = "Settings related to the Ring of Life plugin", position = 1)
    public static final /* synthetic */ String rolSettings = "Ring of Life";
    @ConfigSection(name = "Teleport Settings", description = "Settings related to teleporting", position = 10)
    public static final /* synthetic */ String teleportSettings = "Teleport Settings";

    @ConfigItem(position = 11, keyName = "teleportHP", name = "Teleport health", description = "Health to teleport at", section = "Teleport Settings")
    @Range(max = 99, min = 3)
    default int teleHP() {
        return (9 ^ 58) ^ " ".length();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [boolean, int] */
    @ConfigItem(position = 1, keyName = "logOutIfTriggered", name = "Log out if triggered?", description = "Stops all Squire plugins and logs you out if RoL is triggered.", section = "Ring of Life")
    default boolean logOutOnTrigger() {
        return " ".length();
    }

    @ConfigItem(position = 1, keyName = "teleportType", name = " ", description = "Type of teleport to use", section = "Teleport Settings")
    default I teleportType() {
        return I.SPELL;
    }

    @ConfigItem(position = 11, keyName = "teleportItem", name = " ", description = "Teleportation item", section = "Teleport Settings", hidden = true, unhide = "teleportType", unhideValue = "ITEM")
    default H teleportItem() {
        return H.CONSTRUCTION_CAPE;
    }

    @ConfigItem(position = 11, keyName = "teleportSpell", name = " ", description = "Teleportation spell", section = "Teleport Settings", hidden = true, unhide = "teleportType", unhideValue = "SPELL")
    default TeleportSpell teleportSpell() {
        return TeleportSpell.VARROCK_TELEPORT;
    }
}
