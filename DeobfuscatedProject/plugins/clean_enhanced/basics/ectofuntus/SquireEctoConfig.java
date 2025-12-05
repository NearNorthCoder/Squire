/*
 * Deobfuscated from SquireEctoConfig
 * Package: gg.squire.basics.ectofuntus
 *
 * Configuration for Ectofuntus prayer training plugin.
 * Manages loadouts for different phases and teleport item selection.
 */
package gg.squire.basics.ectofuntus;

import i.i.b.s.c.q.r.s.s.-.u.a.e.an;  // BankItemEnum
import i.i.b.s.c.q.r.s.s.-.u.a.e.ao;  // BonesEnum
import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.ConfigSection;
import net.runelite.client.config.ConfigStorageBox;
import net.runelite.client.plugins.squire.bankloadouts.BankLoadout;

/**
 * Configuration for Ectofuntus prayer training.
 * Handles loadout management for each phase of the ectofuntus cycle.
 */
@ConfigGroup(value="squireecto")
public interface SquireEctoConfig extends Config {

    /** Prayer settings section */
    public static final String PRAYER = "prayer";

    /** Loadouts settings section */
    public static final String LOADOUTS = "loadouts";

    /**
     * Type of bones to use for prayer training.
     *
     * @return selected bone type (default: DRAGON_BONES)
     */
    @ConfigItem(
        keyName="bonesToUse",
        name="Bones to use",
        description="What bones are we using?",
        section="prayer",
        position=1
    )
    default ao bonesToUse() {
        return ao.DRAGON_BONES;
    }

    /**
     * Item to use for banking teleport.
     *
     * @return teleport item selection (default: FISHING_CAPE)
     */
    @ConfigItem(
        keyName="bankItem",
        name="Bank Item",
        description="What item should we be using to get to the bank?",
        position=10,
        section="prayer"
    )
    default an bankItem() {
        return an.FISHING_CAPE;
    }

    /**
     * Loadout for grinding bones phase.
     * Should contain bones and empty pots.
     *
     * @return grind phase loadout
     */
    @ConfigItem(
        keyName="grindLoadout",
        name="Grind loadout",
        description="Loadout with bones and pots",
        position=1,
        section="loadouts"
    )
    default ConfigStorageBox<BankLoadout> grindLoadout() {
        return new ConfigStorageBox<>("bankloadout", "None");
    }

    /**
     * Loadout for collecting slime phase.
     * Should contain empty buckets.
     *
     * @return slime collection loadout
     */
    @ConfigItem(
        keyName="slimeLoadout",
        name="Bucket loadout",
        description="Loadout with buckets",
        position=2,
        section="loadouts"
    )
    default ConfigStorageBox<BankLoadout> slimeLoadout() {
        return new ConfigStorageBox<>("bankloadout", "None");
    }

    /**
     * Loadout for offering phase.
     * Should contain ground bones and buckets of slime.
     *
     * @return offering phase loadout
     */
    @ConfigItem(
        keyName="prayLoadout",
        name="Offering loadout",
        description="Loadout with ground bones and buckets of slime",
        position=3,
        section="loadouts"
    )
    default ConfigStorageBox<BankLoadout> prayLoadout() {
        return new ConfigStorageBox<>("bankloadout", "None");
    }
}
