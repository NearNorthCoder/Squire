/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.client.config.Config
 *  net.runelite.client.config.ConfigGroup
 *  net.runelite.client.config.ConfigItem
 *  net.runelite.client.config.ConfigSection
 *  net.runelite.client.config.Range
 */
package gg.squire.slayer;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.ConfigSection;
import net.runelite.client.config.Range;
import s.s.e.u.p.i.r.r.-.q.a.e.k.r.l.u.i.p.e.t.-.a;

@ConfigGroup(value="squireskipper")
public interface SquireSkipperConfig
extends Config {
    @ConfigSection(name="Hunt Settings", description="Settings related to hunting tasks", position=40)
    public static final /* synthetic */ String HUNT_SETTINGS;
    @ConfigSection(name="Supplies", description="Settings related to checking your slayer task", position=20)
    public static final /* synthetic */ String suppliesSettings;
    @ConfigSection(name="Food Settings", description="Settings related to food", position=30)
    public static final /* synthetic */ String foodSettings;

    @ConfigItem(position=3, keyName="huntTaskMaster", name="Task master", description="Task master to hunt at", section="Hunt Settings", hidden=true, unhide="huntTask")
    default public a taskMaster() {
        return a.KONAR;
    }

    @ConfigItem(position=2, keyName="huntTaskName", name="Task name", description="Task name to hunt for", section="Hunt Settings", hidden=true, unhide="huntTask")
    default public String huntTaskName() {
        return "Hydra";
    }

    @ConfigItem(position=26, keyName="eatHP", name="Eat at HP", description="Eat HP", section="Check Task")
    @Range(max=99)
    default public int eatHP() {
        return 0x6B ^ 0x59;
    }

    @ConfigItem(position=31, keyName="food", name="Food", description="Food", section="Food Settings")
    default public int foodID() {
        return 0xFFFFB33F & 0x5CF7;
    }

    @ConfigItem(position=23, keyName="antiP", name="Anti Poison", description="Anti Poison", section="Check Task")
    default public boolean antiPoison() {
        return 1 != 0;
    }

    @ConfigItem(position=24, keyName="slayerRing", name="Slayer Ring", description="Slayer Ring", section="Check Task")
    default public boolean slayerRing() {
        return 1 != 0;
    }

    @ConfigItem(position=32, keyName="foodAmount", name="Amount Of Food", description="FoodAmount", section="Food Settings")
    default public int foodAmount() {
        return 3;
    }

    static {
        suppliesSettings = "Check Task";
        HUNT_SETTINGS = "Hunt Settings";
        foodSettings = "Food Settings";
    }

    @ConfigItem(position=33, keyName="sipStam", name="Drink Stamina", description="Drink Stamina", section="Food Settings")
    default public boolean sipStam() {
        return 1 != 0;
    }

    @ConfigItem(position=22, keyName="gamesNecklace", name="Games Necklace", description="Games Necklace", section="Check Task")
    default public boolean gamesNecklace() {
        return 1 != 0;
    }

    @ConfigItem(position=1, keyName="huntTask", name="Hunt a task", description="Will hunt a specific task by turael skipping until you get the task", section="Hunt Settings")
    default public boolean huntTask() {
        return 1 != 0;
    }
}

