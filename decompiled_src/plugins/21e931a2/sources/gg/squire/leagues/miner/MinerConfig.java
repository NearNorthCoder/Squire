package gg.squire.leagues.miner;

import i.e.u.e.s.r.a.l.q.p000.p0010.s.p0022.p0032.u.e.p004.g.p0055.d;
import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
@ConfigGroup("leaguesminer")
/* loaded from: 21e931a2-dcd2-41bf-996b-cb50a8d5161d.jar:gg/squire/leagues/miner/MinerConfig.class */
public interface MinerConfig extends Config {
    @ConfigItem(keyName = "rocks", name = "Choose rocks", description = "Rocks to mine, must be in Fossil island or elf mine, standing near rocks", position = 5)
    default d getRockType() {
        return d.RUNE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ConfigItem(keyName = "note", name = "Note items banker note", description = "Must have banker note in inventory", position = 6)
    default boolean getuseBankerNote() {
        return ((20 ^ 115) ^ (82 ^ 111)) & (((113 ^ 71) ^ (0 ^ 108)) ^ (-" ".length()));
    }

    @ConfigItem(keyName = "note", name = " or the Priff underground mine", description = "Must have banker note in inventory", position = 1)
    default boolean text2() {
        return (true ^ true) & ((true ^ true) ^ true);
    }

    @ConfigItem(keyName = "note", name = "Only works at fossil island mine", description = "Must have banker note in inventory", position = 0)
    default boolean text() {
        return (true ^ true) & ((true ^ true) ^ true);
    }
}
