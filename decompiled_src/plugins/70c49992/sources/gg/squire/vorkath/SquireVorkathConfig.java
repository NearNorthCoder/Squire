package gg.squire.vorkath;

import i.v.k.o.p000.u.s.e.r.a.q.r.t.h.EnumC0002c;
import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.ConfigSection;
import net.runelite.client.config.ConfigStorageBox;
import net.runelite.client.config.Range;
import net.runelite.client.plugins.squire.bankloadouts.BankLoadout;
@ConfigGroup("squirevorkath")
/* loaded from: 70c49992-0f4a-4f1f-b83d-1bdcbc531725.jar:gg/squire/vorkath/SquireVorkathConfig.class */
public interface SquireVorkathConfig extends Config {
    @ConfigSection(name = "Fight settings", description = "Fight settings", position = 0)
    public static final /* synthetic */ String FIGHT_SETTINGS = "fight";
    @ConfigSection(name = "Bank settings", description = "Bank settings", position = 1)
    public static final /* synthetic */ String BANK_SETTINGS = "bank";
    public static final /* synthetic */ String GROUP = "squirevorkath";

    @ConfigItem(keyName = "eatAt", name = "Eat at HP", description = "Eat at this HP", position = 1, section = "fight")
    @Range(min = 20, max = 80)
    default int eatAtHP() {
        return (((108 + 75) - 154) + 109) ^ (((157 + 96) - 179) + 86);
    }

    @ConfigItem(keyName = "debug", name = "Debug more info", description = "Adds debugging info to fight", position = 4, section = "fight")
    default boolean debug() {
        return (true ^ true) & ((true ^ true) ^ true);
    }

    @ConfigItem(keyName = "minFood", name = "Multi-kill food", description = "How many food should we have in inventory to start another kill?", position = 1, section = "fight")
    @Range(max = 28)
    default int multiple() {
        return ((68 ^ 1) ^ (191 ^ 161)) & (((114 ^ 10) ^ (76 ^ 111)) ^ (-" ".length()));
    }

    @ConfigItem(keyName = "bankLoadout", name = "Bank loadout", description = "Select bank loadout", position = 1, section = "bank")
    default ConfigStorageBox<BankLoadout> bankLoadout() {
        return new ConfigStorageBox<>("bankloadout", "None");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ConfigItem(keyName = "alch", name = "Alch items", description = "Alchs common highly valuable drops (rune/dragon)", position = 3, section = "fight")
    default boolean alch() {
        return ((((51 + 119) - 98) + 69) ^ (((33 + 142) - 106) + 109)) & (((((129 + 44) - 164) + 151) ^ (((30 + 38) - 26) + 117)) ^ (-" ".length()));
    }

    @ConfigItem(keyName = "bankLocation", name = "Bank location", description = "Select bank location", position = 2, section = "bank")
    default EnumC0002c bankLocation() {
        return EnumC0002c.FEROX_ENCLAVE;
    }
}
