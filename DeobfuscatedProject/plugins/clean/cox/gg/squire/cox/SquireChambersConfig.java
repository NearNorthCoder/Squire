/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.client.config.Config
 *  net.runelite.client.config.ConfigGroup
 *  net.runelite.client.config.ConfigItem
 *  net.runelite.client.config.ConfigSection
 *  net.runelite.client.config.ConfigStorageBox
 *  net.runelite.client.config.Range
 *  net.runelite.client.plugins.squire.bankloadouts.BankLoadout
 */
package gg.squire.cox;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.ConfigSection;
import net.runelite.client.config.ConfigStorageBox;
import net.runelite.client.config.Range;
import net.runelite.client.plugins.squire.bankloadouts.BankLoadout;

@ConfigGroup(value="squireraids")
public interface SquireChambersConfig
extends Config {
    @ConfigSection(name="Puzzle Rooms", description="Settings to configure Puzzle rooms", position=50)
    public static final /* synthetic */ String PUZZLE_SETTINGS;
    @ConfigSection(name="World Hopping Settings", description="World Hopping settings", position=40)
    public static final /* synthetic */ String HOPPING_SETTINGS;
    @ConfigSection(name="Combat Rooms", description="Settings to configure Combat rooms", position=50)
    public static final /* synthetic */ String COMBAT_SETTINGS;
    @ConfigSection(name="Olm", description="Settings to configure Olm", position=500)
    public static final /* synthetic */ String OLM_SETTINGS;

    @Range(min=20, max=80)
    @ConfigItem(position=4, keyName="olmMeleeThreshold", name="Melee Threshold", description="HP to stop attacking melee hand", section="Olm Settings")
    default public int meleeThreshold() {
        return 0xD ^ 0x2D ^ (0x4D ^ 0x45);
    }

    @ConfigItem(position=1, keyName="extraInfo", name="Display advanced Info box", description="Display advanced Info box")
    default public boolean extraInfo() {
        return ((0x75 ^ 0x3A ^ (0x4B ^ 0x42)) & (0xE ^ 0x17 ^ (0x6A ^ 0x35) ^ -" ".length())) != 0;
    }

    @ConfigItem(position=3, keyName="vasaToggle", name="Vasa: Testing", description="Vasa toggle for testing", section="Combat Room Settings", hidden=true, unhide="enableVasa", unhideValue="true")
    default public boolean vasaToggle() {
        return ((0xEF ^ 0xAE) & ~(0xD4 ^ 0x95)) != 0;
    }

    @ConfigItem(position=1, keyName="enableMuttadiles", name="Enable Muttadiles", description="Enable Muttadiles room", section="Combat Room Settings")
    default public boolean enableMuttadiles() {
        return " ".length() != 0;
    }

    @ConfigItem(keyName="worldsHopping", name="Hopping worlds", description="Specify which worlds you want to hop between during raids. If left empty it will choose worlds for you", section="Hopping Settings", position=13)
    default public String worldsHopping() {
        return "336,368,369";
    }

    @ConfigItem(position=3, keyName="enableCrabs", name="Enable Crabs", description="Enable Crabs room", section="Puzzle Room Settings")
    default public boolean enableCrabs() {
        return " ".length() != 0;
    }

    @ConfigItem(position=2, keyName="enableThieving", name="Enable Thieving", description="Enable Thieving room", section="Puzzle Room Settings")
    default public boolean enableThieving() {
        return " ".length() != 0;
    }

    @ConfigItem(position=0, keyName="tightropeBody", name="Tightrope: Swap body for rangers", description="Swap to melee body for rangers", section="Puzzle Room Settings", hidden=true, unhide="enableTightrope", unhideValue="true")
    default public boolean tightropeBody() {
        return " ".length() != 0;
    }

    @ConfigItem(name="Anonymize discord", description="Enabling this will replace your discord username with anonymous in the #cox-loot channel", keyName="anonymize", position=4)
    default public boolean anonymize() {
        return " ".length() != 0;
    }

    @ConfigItem(position=1, keyName="enableHopping", name="Hop after each raid", description="Hop worlds after each raid", section="Hopping Settings")
    default public boolean enableHopping() {
        return ((0x1D ^ 0x14) & ~(0xC8 ^ 0xC1)) != 0;
    }

    @ConfigItem(position=0, keyName="enableTekton", name="Enable Tekton", description="Enable Tekton room", section="Combat Room Settings")
    default public boolean enableTekton() {
        return " ".length() != 0;
    }

    @ConfigItem(position=4, keyName="enableVespula", name="Enable Vespula", description="Enable Vespula room", section="Combat Room Settings")
    default public boolean enableVespula() {
        return " ".length() != 0;
    }

    @ConfigItem(position=3, keyName="pickupDroppedBrews", name="Pick up dropped brews?", description="Pick up brews that were dropped to make inventory space")
    default public boolean pickupBrews() {
        return ((0x47 ^ 6 ^ (6 ^ 0)) & (50 + 85 - 77 + 159 ^ 43 + 133 - 148 + 130 ^ -" ".length())) != 0;
    }

    @ConfigItem(position=2, keyName="pause", name="Pause", description="pause")
    default public boolean pause() {
        return ((0x6B ^ 0x4E) & ~(0x6C ^ 0x49)) != 0;
    }

    @ConfigItem(position=2, keyName="enableGuardians", name="Enable Guardians", description="Enable Guardians room", section="Combat Room Settings")
    default public boolean enableGuardians() {
        return " ".length() != 0;
    }

    @ConfigItem(position=3, keyName="enableVasa", name="Enable Vasa", description="Enable Vasa room", section="Combat Room Settings")
    default public boolean enableVasa() {
        return " ".length() != 0;
    }

    @ConfigItem(position=1, keyName="enableIceDemon", name="Enable Ice Demon", description="Enable Ice Demon room", section="Puzzle Room Settings")
    default public boolean enableIceDemon() {
        return " ".length() != 0;
    }

    @ConfigItem(position=3, keyName="olmMageThreshold", name="Mage Threshold", description="HP to stop attacking mage hand", section="Olm Settings")
    @Range(min=20, max=80)
    default public int mageThreshold() {
        return 0x49 ^ 0x61;
    }

    @ConfigItem(position=0, keyName="bankLoadout", name="Bank loadout", description="Bank loadout")
    default public ConfigStorageBox<BankLoadout> bankLoadout() {
        return new ConfigStorageBox("bankloadout", "None");
    }

    @ConfigItem(position=0, keyName="flinchTekton", name="Tekton: Flinch", description="Can disable this if using a 4 tick weapon", section="Combat Room Settings", hidden=true, unhide="enableTekton", unhideValue="true")
    default public boolean flinchTekton() {
        return " ".length() != 0;
    }

    @ConfigItem(position=0, keyName="enableTightrope", name="Enable Tightrope", description="Enable Tightrope room", section="Puzzle Room Settings")
    default public boolean enableTightrope() {
        return " ".length() != 0;
    }

    static {
        COMBAT_SETTINGS = "Combat Room Settings";
        PUZZLE_SETTINGS = "Puzzle Room Settings";
        HOPPING_SETTINGS = "Hopping Settings";
        OLM_SETTINGS = "Olm Settings";
    }
}

