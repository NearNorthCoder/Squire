package gg.squire.cox;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.ConfigSection;
import net.runelite.client.config.ConfigStorageBox;
import net.runelite.client.config.Range;
import net.runelite.client.plugins.squire.bankloadouts.BankLoadout;
@ConfigGroup("squireraids")
/* loaded from: 778e0a57-7760-4510-94d3-2c1213879e48.jar:gg/squire/cox/SquireChambersConfig.class */
public interface SquireChambersConfig extends Config {
    @ConfigSection(name = "Combat Rooms", description = "Settings to configure Combat rooms", position = 50)
    public static final /* synthetic */ String COMBAT_SETTINGS = "Combat Room Settings";
    @ConfigSection(name = "Puzzle Rooms", description = "Settings to configure Puzzle rooms", position = 50)
    public static final /* synthetic */ String PUZZLE_SETTINGS = "Puzzle Room Settings";
    @ConfigSection(name = "World Hopping Settings", description = "World Hopping settings", position = 40)
    public static final /* synthetic */ String HOPPING_SETTINGS = "Hopping Settings";
    @ConfigSection(name = "Olm", description = "Settings to configure Olm", position = 500)
    public static final /* synthetic */ String OLM_SETTINGS = "Olm Settings";

    @ConfigItem(position = 4, keyName = "olmMeleeThreshold", name = "Melee Threshold", description = "HP to stop attacking melee hand", section = "Olm Settings")
    @Range(min = 20, max = 80)
    default int meleeThreshold() {
        return (13 ^ 45) ^ (77 ^ 69);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ConfigItem(position = 1, keyName = "extraInfo", name = "Display advanced Info box", description = "Display advanced Info box")
    default boolean extraInfo() {
        return ((117 ^ 58) ^ (75 ^ 66)) & (((14 ^ 23) ^ (106 ^ 53)) ^ (-" ".length()));
    }

    @ConfigItem(position = 3, keyName = "vasaToggle", name = "Vasa: Testing", description = "Vasa toggle for testing", section = "Combat Room Settings", hidden = true, unhide = "enableVasa", unhideValue = "true")
    default boolean vasaToggle() {
        return (true ^ true) & ((true ^ true) ^ true);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [int, boolean] */
    @ConfigItem(position = 1, keyName = "enableMuttadiles", name = "Enable Muttadiles", description = "Enable Muttadiles room", section = "Combat Room Settings")
    default boolean enableMuttadiles() {
        return " ".length();
    }

    @ConfigItem(keyName = "worldsHopping", name = "Hopping worlds", description = "Specify which worlds you want to hop between during raids. If left empty it will choose worlds for you", section = "Hopping Settings", position = 13)
    default String worldsHopping() {
        return "336,368,369";
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [int, boolean] */
    @ConfigItem(position = 3, keyName = "enableCrabs", name = "Enable Crabs", description = "Enable Crabs room", section = "Puzzle Room Settings")
    default boolean enableCrabs() {
        return " ".length();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [int, boolean] */
    @ConfigItem(position = 2, keyName = "enableThieving", name = "Enable Thieving", description = "Enable Thieving room", section = "Puzzle Room Settings")
    default boolean enableThieving() {
        return " ".length();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [int, boolean] */
    @ConfigItem(position = 0, keyName = "tightropeBody", name = "Tightrope: Swap body for rangers", description = "Swap to melee body for rangers", section = "Puzzle Room Settings", hidden = true, unhide = "enableTightrope", unhideValue = "true")
    default boolean tightropeBody() {
        return " ".length();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [int, boolean] */
    @ConfigItem(name = "Anonymize discord", description = "Enabling this will replace your discord username with anonymous in the #cox-loot channel", keyName = "anonymize", position = 4)
    default boolean anonymize() {
        return " ".length();
    }

    @ConfigItem(position = 1, keyName = "enableHopping", name = "Hop after each raid", description = "Hop worlds after each raid", section = "Hopping Settings")
    default boolean enableHopping() {
        return (true ^ true) & ((true ^ true) ^ true);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [int, boolean] */
    @ConfigItem(position = 0, keyName = "enableTekton", name = "Enable Tekton", description = "Enable Tekton room", section = "Combat Room Settings")
    default boolean enableTekton() {
        return " ".length();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [int, boolean] */
    @ConfigItem(position = 4, keyName = "enableVespula", name = "Enable Vespula", description = "Enable Vespula room", section = "Combat Room Settings")
    default boolean enableVespula() {
        return " ".length();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ConfigItem(position = 3, keyName = "pickupDroppedBrews", name = "Pick up dropped brews?", description = "Pick up brews that were dropped to make inventory space")
    default boolean pickupBrews() {
        return ((71 ^ 6) ^ (6 ^ 0)) & (((((50 + 85) - 77) + 159) ^ (((43 + 133) - 148) + 130)) ^ (-" ".length()));
    }

    @ConfigItem(position = 2, keyName = "pause", name = "Pause", description = "pause")
    default boolean pause() {
        return (true ^ true) & ((true ^ true) ^ true);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [int, boolean] */
    @ConfigItem(position = 2, keyName = "enableGuardians", name = "Enable Guardians", description = "Enable Guardians room", section = "Combat Room Settings")
    default boolean enableGuardians() {
        return " ".length();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [int, boolean] */
    @ConfigItem(position = 3, keyName = "enableVasa", name = "Enable Vasa", description = "Enable Vasa room", section = "Combat Room Settings")
    default boolean enableVasa() {
        return " ".length();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [int, boolean] */
    @ConfigItem(position = 1, keyName = "enableIceDemon", name = "Enable Ice Demon", description = "Enable Ice Demon room", section = "Puzzle Room Settings")
    default boolean enableIceDemon() {
        return " ".length();
    }

    @ConfigItem(position = 3, keyName = "olmMageThreshold", name = "Mage Threshold", description = "HP to stop attacking mage hand", section = "Olm Settings")
    @Range(min = 20, max = 80)
    default int mageThreshold() {
        return 73 ^ 97;
    }

    @ConfigItem(position = 0, keyName = "bankLoadout", name = "Bank loadout", description = "Bank loadout")
    default ConfigStorageBox<BankLoadout> bankLoadout() {
        return new ConfigStorageBox<>("bankloadout", "None");
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [int, boolean] */
    @ConfigItem(position = 0, keyName = "flinchTekton", name = "Tekton: Flinch", description = "Can disable this if using a 4 tick weapon", section = "Combat Room Settings", hidden = true, unhide = "enableTekton", unhideValue = "true")
    default boolean flinchTekton() {
        return " ".length();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [int, boolean] */
    @ConfigItem(position = 0, keyName = "enableTightrope", name = "Enable Tightrope", description = "Enable Tightrope room", section = "Puzzle Room Settings")
    default boolean enableTightrope() {
        return " ".length();
    }
}
