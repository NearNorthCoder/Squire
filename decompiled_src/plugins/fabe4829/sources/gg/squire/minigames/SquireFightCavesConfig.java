package gg.squire.minigames;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.ConfigSection;
import net.runelite.client.config.ConfigStorageBox;
import net.runelite.client.plugins.squire.bankloadouts.BankLoadout;
@ConfigGroup("squirefightcaves")
/* loaded from: fabe4829-ed55-47a3-b654-ca361772d01e.jar:gg/squire/minigames/SquireFightCavesConfig.class */
public interface SquireFightCavesConfig extends Config {
    public static final /* synthetic */ String CONFIG_GROUP = "squirefightcaves";
    @ConfigSection(name = "General", description = "General settings", position = 0, keyName = "generalSection")
    public static final /* synthetic */ String GENERAL = "General";

    /* JADX WARN: Multi-variable type inference failed */
    @ConfigItem(position = 1, keyName = "stopAfterCape", name = "Stop after 1 cape", description = "Stops after getting a firecape", section = "General")
    default boolean stopAfterCape() {
        return ((41 ^ 111) ^ (11 ^ 65)) & (((((31 + 125) - 47) + 26) ^ (((33 + 99) - 9) + 16)) ^ (-" ".length()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ConfigItem(position = 2, keyName = "showExtraInfo", name = "Show Extra Debug", description = "show extra debug", section = "General")
    default boolean showExtraInfoOnUI() {
        return ((45 ^ 104) ^ (108 ^ 28)) & ((" ".length() ^ (24 ^ 44)) ^ (-" ".length()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ConfigItem(position = 0, keyName = "useLongRange", name = "Avoid Defence XP", description = "Turn on to not use long range on healers, will increase death chance", section = "General")
    default boolean avoidDefXp() {
        return ((43 ^ 58) ^ (111 ^ 71)) & (((76 ^ 88) ^ (172 ^ 129)) ^ (-" ".length()));
    }

    @ConfigItem(position = 3, keyName = "bankloadout", name = "Bank Loadout", description = "Loadout to use to for bank + fight", section = "General")
    default ConfigStorageBox<BankLoadout> bankLoadout() {
        return new ConfigStorageBox<>("bankloadout", "None");
    }
}
