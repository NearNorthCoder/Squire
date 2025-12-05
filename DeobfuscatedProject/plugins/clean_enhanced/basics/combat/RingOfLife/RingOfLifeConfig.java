/*
 * Deobfuscated from gg.squire.basics.combat.RingOfLife.RingOfLifeConfig
 *
 * Configuration interface for the Ring of Life plugin.
 */
package gg.squire.basics.combat.RingOfLife;

import i.i.b.s.c.q.r.s.s.-.u.a.e.H;
import i.i.b.s.c.q.r.s.s.-.u.a.e.I;
import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.ConfigSection;
import net.runelite.client.config.Range;
import net.unethicalite.api.movement.pathfinder.model.TeleportSpell;

/**
 * Configuration for the Ring of Life plugin.
 * Controls emergency teleport behavior when health is low.
 */
@ConfigGroup(value = "squirerol")
public interface RingOfLifeConfig extends Config {

    @ConfigSection(
        name = "Ring of Life",
        description = "Settings related to the Ring of Life plugin",
        position = 1
    )
    String ROL_SETTINGS = "Ring of Life";

    @ConfigSection(
        name = "Teleport Settings",
        description = "Settings related to teleporting",
        position = 10
    )
    String TELEPORT_SETTINGS = "Teleport Settings";

    /**
     * Whether to log out when Ring of Life is triggered.
     *
     * @return true to log out
     */
    @ConfigItem(
        position = 1,
        keyName = "logOutIfTriggered",
        name = "Log out if triggered?",
        description = "Stops all Squire plugins and logs you out if RoL is triggered.",
        section = ROL_SETTINGS
    )
    default boolean logOutOnTrigger() {
        return true;
    }

    /**
     * Health threshold at which to teleport.
     *
     * @return HP value (3-99)
     */
    @ConfigItem(
        position = 11,
        keyName = "teleportHP",
        name = "Teleport health",
        description = "Health to teleport at",
        section = TELEPORT_SETTINGS
    )
    @Range(max = 99, min = 3)
    default int teleHP() {
        return 10; // 9 ^ 0x3A ^ " ".length() = 10
    }

    /**
     * Type of teleport to use.
     *
     * @return Teleport type (SPELL or ITEM)
     */
    @ConfigItem(
        position = 1,
        keyName = "teleportType",
        name = " ",
        description = "Type of teleport to use",
        section = TELEPORT_SETTINGS
    )
    default I teleportType() {
        return I.SPELL;
    }

    /**
     * Teleport spell to use.
     *
     * @return The teleport spell
     */
    @ConfigItem(
        position = 11,
        keyName = "teleportSpell",
        name = " ",
        description = "Teleportation spell",
        section = TELEPORT_SETTINGS,
        hidden = true,
        unhide = "teleportType",
        unhideValue = "SPELL"
    )
    default TeleportSpell teleportSpell() {
        return TeleportSpell.VARROCK_TELEPORT;
    }

    /**
     * Teleport item to use.
     *
     * @return The teleport item
     */
    @ConfigItem(
        position = 11,
        keyName = "teleportItem",
        name = " ",
        description = "Teleportation item",
        section = TELEPORT_SETTINGS,
        hidden = true,
        unhide = "teleportType",
        unhideValue = "ITEM"
    )
    default H teleportItem() {
        return H.CONSTRUCTION_CAPE;
    }
}
