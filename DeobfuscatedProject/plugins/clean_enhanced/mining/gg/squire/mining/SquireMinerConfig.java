package gg.squire.mining;

import net.runelite.client.config.*;
import net.runelite.client.plugins.squire.bankloadouts.BankLoadout;

/**
 * Configuration for the Squire Miner plugin.
 */
@ConfigGroup("squiremlm")
public interface SquireMinerConfig extends Config {
    String MINING_SETTINGS = "Mining Settings";

    /**
     * Gets the selected mining activity.
     *
     * @return the mining activity
     */
    @ConfigItem(
        keyName = "activity",
        name = "Mining Activity",
        description = "What do you want to mine?",
        position = 1,
        section = MINING_SETTINGS
    )
    default MiningActivity activity() {
        return MiningActivity.MOTHERLODE_MINE;
    }

    /**
     * Gets the Motherlode Mine area to mine in.
     *
     * @return the MLM area
     */
    @ConfigItem(
        keyName = "motherlodeMineArea",
        name = "Area to mine",
        description = "What area do you want to mine?",
        position = 2,
        section = MINING_SETTINGS,
        hidden = true,
        unhide = "activity",
        unhideValue = "MOTHERLODE_MINE"
    )
    default MotherlodeMineArea mlmArea() {
        return MotherlodeMineArea.UPPER_FLOOR;
    }

    /**
     * Whether to hop worlds periodically in MLM.
     *
     * @return true to hop worlds
     */
    @ConfigItem(
        keyName = "motherlodeHop",
        name = "Hop Worlds",
        description = "Hop worlds every 250 ore veins mined to prevent reports?",
        position = 3,
        section = MINING_SETTINGS,
        hidden = true,
        unhide = "activity",
        unhideValue = "MOTHERLODE_MINE"
    )
    default boolean hop() {
        return true;
    }

    /**
     * Whether to deposit upstairs in MLM upper floor.
     *
     * @return true to deposit upstairs
     */
    @ConfigItem(
        keyName = "motherlodeDepositUpstairs",
        name = "Deposit upstairs",
        description = "Deposit upstairs?",
        position = 3,
        section = MINING_SETTINGS,
        hidden = true,
        unhide = "motherlodeMineArea",
        unhideValue = "UPPER_FLOOR"
    )
    default boolean depositUpstairs() {
        return false;
    }

    /**
     * Gets the sandstone/gem quarry area.
     *
     * @return the quarry area
     */
    @ConfigItem(
        keyName = "sandstoneArea",
        name = "Quarry Area",
        description = "Where to mine in the quarry",
        position = 4,
        hidden = true,
        unhide = "activity",
        unhideValue = "SANDSTONE"
    )
    default GemRockArea area() {
        return GemRockArea.WEST_FOUR;
    }

    /**
     * Gets the bank loadout for superheat mining.
     *
     * @return the bank loadout
     */
    @ConfigItem(
        keyName = "bankLoadout",
        name = "Bank Loadout",
        description = "What do you want to bank?",
        position = 4,
        section = MINING_SETTINGS,
        hidden = true,
        unhide = "activity",
        unhideValue = "SUPERHEAT_MINE"
    )
    default ConfigStorageBox<BankLoadout> bankLoadout() {
        return new ConfigStorageBox<>("bankloadout", "None");
    }

    /**
     * Whether to use humidify spell for waterskins.
     *
     * @return true to use humidify
     */
    @ConfigItem(
        keyName = "humidify",
        name = "Humidify",
        description = "Use Humidify to refill waterskins",
        position = 11,
        hidden = true,
        unhide = "activity",
        unhideValue = "GRANITE||SANDSTONE"
    )
    default boolean humidify() {
        return true;
    }

    /**
     * Gets the number of waterskins to bring.
     *
     * @return number of waterskins
     */
    @ConfigItem(
        keyName = "amount of waterskins",
        name = "Amount Of Waterskins",
        description = "Amount Of Waterskins",
        position = 13,
        hidden = true,
        unhide = "activity",
        unhideValue = "SANDSTONE||GRANITE"
    )
    default int waterskins() {
        return 10;
    }

    /**
     * Whether to deposit sandstone when inventory is full.
     *
     * @return true to deposit
     */
    @ConfigItem(
        keyName = "deposit",
        name = "Deposit Sandstone",
        description = "Deposits the sandstone when your inventory is full",
        position = 14,
        hidden = true,
        unhide = "activity",
        unhideValue = "SANDSTONE"
    )
    default boolean deposit() {
        return true;
    }

    /**
     * Gets the amethyst crafting option.
     *
     * @return the gem type to craft
     */
    @ConfigItem(
        keyName = "chisel",
        name = "Craft amethyst item",
        description = "Do you want to craft them into amethyst items?",
        position = 1,
        hidden = true,
        unhide = "activity",
        unhideValue = "AMETHYST"
    )
    default GemType craft() {
        return GemType.DISABLE;
    }

    @ConfigSection(
        name = "Mining Settings",
        description = "Settings",
        position = 0
    )
    String SECTION_MINING = "Mining Settings";
}
