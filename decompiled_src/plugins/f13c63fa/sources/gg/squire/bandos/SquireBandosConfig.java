package gg.squire.bandos;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import q.s.r.i.e.s.o.u.a.d.n.p000.b.c;
@ConfigGroup("squirebandos")
/* loaded from: f13c63fa-3e76-4035-9dfa-e833a382cd4c.jar:gg/squire/bandos/SquireBandosConfig.class */
public interface SquireBandosConfig extends Config {
    @ConfigItem(keyName = "bandos.altarteleport", name = "Teleport out using altar", description = "Uses the teleport option on the altar to leave the room", position = 11)
    default boolean altarTeleport() {
        return (true ^ true) & ((true ^ true) ^ true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ConfigItem(keyName = "looting.walk", name = "Turn off run for looting", description = "Turns off run to save energy for looting", position = 13)
    default boolean turnOffRun() {
        return ((115 ^ 78) ^ (23 ^ 47)) & (((((97 + 48) - 100) + 85) ^ (((29 + 0) - (-96)) + 10)) ^ (-" ".length()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ConfigItem(keyName = "cannon.pickup", name = "Pick up cannon", description = "Picks up cannon before teleporting out", position = 9)
    default boolean pickupCannon() {
        return ((11 ^ 96) ^ (121 ^ 32)) & (((44 ^ 5) ^ (218 ^ 193)) ^ (-" ".length()));
    }

    @ConfigItem(keyName = "bandos.alch", name = "Use High Alchemy", description = "Uses high alchemy on rune items dropped by bandos", position = 10)
    default boolean alch() {
        return (true ^ true) & ((true ^ true) ^ true);
    }

    @ConfigItem(keyName = "bandos.rangeprayer", name = "Range prayer", description = "What range prayer to use", position = 12)
    default c rangePrayer() {
        return c.EAGLE_EYE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ConfigItem(keyName = "minions.bp", name = "Use blowpipe version minions", description = "Swaps to blowpipe for minions", position = 14)
    default boolean useBlowpipe() {
        return ((((94 + 10) - 12) + 45) ^ (((152 + 67) - 112) + 65)) & (((33 ^ 36) ^ (3 ^ 35)) ^ (-" ".length()));
    }
}
