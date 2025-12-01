package gg.squire.saradomin;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.ConfigStorageBox;
import net.runelite.client.config.Range;
import net.runelite.client.plugins.squire.bankloadouts.BankLoadout;
import u.i.a.a.p000.s.m.n.i.q.d.r.r.s.o.e.EnumC0008i;
@ConfigGroup("squire_saradomin")
/* loaded from: 9cc2ff9a-834c-471c-85e9-f55eb9ce18c7.jar:gg/squire/saradomin/SquireSaraConfig.class */
public interface SquireSaraConfig extends Config {
    public static final /* synthetic */ String SQUIRE_SARA_GROUP = "squire_saradomin";

    /* JADX WARN: Type inference failed for: r0v1, types: [int, boolean] */
    @ConfigItem(keyName = "sara.alch", name = "Enable alching", description = "Should the plugin alch stuff", position = 15)
    default boolean alch() {
        return " ".length();
    }

    @ConfigItem(keyName = "sara.eatrange", name = "Eat at hp", description = "At what hp should the plugin eat food?", position = 14)
    @Range(min = 20, max = 80)
    default int eatFoodAt() {
        return 90 ^ 104;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [int, boolean] */
    @ConfigItem(keyName = "kc.spirituals", name = "Spiritual mages", description = "Should we get kc on spiritual mages?", position = 16)
    default boolean kcSpirituals() {
        return " ".length();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ConfigItem(keyName = "minions.bp", name = "Use blowpipe", description = "Swaps to blowpipe for killing minions", position = 14)
    default boolean useBlowpipe() {
        return ((31 ^ 35) ^ (112 ^ 20)) & (((213 ^ 133) ^ (176 ^ 184)) ^ (-" ".length()));
    }

    @ConfigItem(keyName = "sara.rangeprayer", name = "Range prayer", description = "What range prayer to use", position = 12)
    default EnumC0008i rangePrayer() {
        return EnumC0008i.EAGLE_EYE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ConfigItem(keyName = "looting.walk", name = "Turn off run for looting", description = "Turns off run to save energy for looting", position = 13)
    default boolean turnOffRun() {
        return ((66 ^ 56) ^ (55 ^ 117)) & (((((127 + 115) - 194) + 87) ^ (((61 + 40) - (-9)) + 81)) ^ (-" ".length()));
    }

    @ConfigItem(name = "Bank Loadout", description = "What bank loadout to get for saradomin?", keyName = "bank.loadout", position = 0)
    default ConfigStorageBox<BankLoadout> bankLoadout() {
        return new ConfigStorageBox<>("bankloadout", "None");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ConfigItem(keyName = "sara.altarteleport", name = "Teleport out using altar", description = "Uses the teleport option on the altar to leave the room", position = 11)
    default boolean altarTeleport() {
        return " ".length() & (" ".length() ^ (-1));
    }
}
