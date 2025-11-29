package gg.squire.basics.secondaries;

import i.i.b.s.c.q.r.s.s.p000.u.a.e.bO;
import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
@ConfigGroup("squiresecondaries")
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:gg/squire/basics/secondaries/SecondariesConfig.class */
public interface SecondariesConfig extends Config {
    @ConfigItem(position = 10, keyName = "bank", name = "Bank", description = "Where to bank")
    default BankLocation bank() {
        return BankLocation.TREE_GNOME_STRONGHOLD_BANK;
    }

    @ConfigItem(position = 1, keyName = "secondary", name = "Secondary", description = "The secondary to collect")
    default bO secondary() {
        return bO.SNAPE_GRASS;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [boolean, int] */
    @ConfigItem(position = 2, keyName = "restoreInPoh", name = "Restore in POH", description = "Restore stats with POH pool")
    default boolean restoreInPoh() {
        return " ".length();
    }
}
