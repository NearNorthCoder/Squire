package gg.squire.slayer;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.ConfigSection;
import net.runelite.client.config.Range;
import s.s.e.u.p.i.r.r.p000.q.a.e.k.r.l.u.i.p.e.t.p001.a;
@ConfigGroup("squireskipper")
/* loaded from: 2e35b2d3-afef-4589-b5f3-450cbc042322.jar:gg/squire/slayer/SquireSkipperConfig.class */
public interface SquireSkipperConfig extends Config {
    @ConfigSection(name = "Supplies", description = "Settings related to checking your slayer task", position = 20)
    public static final /* synthetic */ String suppliesSettings = "Check Task";
    @ConfigSection(name = "Hunt Settings", description = "Settings related to hunting tasks", position = 40)
    public static final /* synthetic */ String HUNT_SETTINGS = "Hunt Settings";
    @ConfigSection(name = "Food Settings", description = "Settings related to food", position = 30)
    public static final /* synthetic */ String foodSettings = "Food Settings";

    @ConfigItem(position = 3, keyName = "huntTaskMaster", name = "Task master", description = "Task master to hunt at", section = "Hunt Settings", hidden = true, unhide = "huntTask")
    default a taskMaster() {
        return a.KONAR;
    }

    @ConfigItem(position = 2, keyName = "huntTaskName", name = "Task name", description = "Task name to hunt for", section = "Hunt Settings", hidden = true, unhide = "huntTask")
    default String huntTaskName() {
        return "Hydra";
    }

    @ConfigItem(position = 26, keyName = "eatHP", name = "Eat at HP", description = "Eat HP", section = "Check Task")
    @Range(max = 99)
    default int eatHP() {
        return 107 ^ 89;
    }

    @ConfigItem(position = 31, keyName = "food", name = "Food", description = "Food", section = "Food Settings")
    default int foodID() {
        return (-19649) & 23799;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [boolean, int] */
    @ConfigItem(position = 23, keyName = "antiP", name = "Anti Poison", description = "Anti Poison", section = "Check Task")
    default boolean antiPoison() {
        return " ".length();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [boolean, int] */
    @ConfigItem(position = 24, keyName = "slayerRing", name = "Slayer Ring", description = "Slayer Ring", section = "Check Task")
    default boolean slayerRing() {
        return " ".length();
    }

    @ConfigItem(position = 32, keyName = "foodAmount", name = "Amount Of Food", description = "FoodAmount", section = "Food Settings")
    default int foodAmount() {
        return "   ".length();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [boolean, int] */
    @ConfigItem(position = 33, keyName = "sipStam", name = "Drink Stamina", description = "Drink Stamina", section = "Food Settings")
    default boolean sipStam() {
        return " ".length();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [boolean, int] */
    @ConfigItem(position = 22, keyName = "gamesNecklace", name = "Games Necklace", description = "Games Necklace", section = "Check Task")
    default boolean gamesNecklace() {
        return " ".length();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [boolean, int] */
    @ConfigItem(position = 1, keyName = "huntTask", name = "Hunt a task", description = "Will hunt a specific task by turael skipping until you get the task", section = "Hunt Settings")
    default boolean huntTask() {
        return " ".length();
    }
}
