package gg.squire.woodcutting;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import w.r.e.i.d.r.q.u.e.p000.c.u.o.s.o.t.t.a;
@ConfigGroup("squirewcg")
/* loaded from: f90b6cea-b1e4-4f52-8aee-23d3738ff311.jar:gg/squire/woodcutting/SquireWoodcutterConfig.class */
public interface SquireWoodcutterConfig extends Config {
    /* JADX WARN: Multi-variable type inference failed */
    @ConfigItem(position = 4, keyName = "fasterTickChopping", name = "1.5t Chopping", description = "Should we 1.5t chop the logs? (Only Fossil Island)", disabledBy = "tickChopping", hidden = true, unhide = "treeToChop", unhideValue = "TEAK||MAHOGANY")
    default boolean fastTickChop() {
        return ((((187 + 171) - 356) + 234) ^ (((102 + 1) - 0) + 60)) & (((36 ^ 87) ^ (38 ^ 26)) ^ (-" ".length()));
    }

    @ConfigItem(position = 1, keyName = "treeToChop", name = "Tree", description = "Tree to chop")
    default a tree() {
        return a.TEAK;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [int, boolean] */
    @ConfigItem(position = 6, keyName = "banking", name = "Enable banking", description = "Will drop logs if disabled", disabledBy = "cutLogs")
    default boolean bank() {
        return " ".length();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [int, boolean] */
    @ConfigItem(position = 13, keyName = "pickUpNest", name = "Pick up nest", description = "Pick up bird nest?")
    default boolean pickUpNest() {
        return " ".length();
    }

    @ConfigItem(position = 5, keyName = "cutLogs", name = "Cut logs?", description = "Do you want to cut the logs into arrow shafts instead of banking?", disabledBy = "banking")
    default boolean cutLogs() {
        return (true ^ true) & ((true ^ true) ^ true);
    }

    @ConfigItem(position = 3, keyName = "tickChopping", name = "3t Chopping", description = "Should we 3 tick chop the logs?", disabledBy = "fasterTickChopping")
    default boolean tickChop() {
        return (true ^ true) & ((true ^ true) ^ true);
    }
}
