/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.client.config.Config
 *  net.runelite.client.config.ConfigGroup
 *  net.runelite.client.config.ConfigItem
 *  net.runelite.client.config.Range
 */
package gg.squire.tithefarm;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.Range;
import r.m.-.a.e.u.i.t.i.f.e.t.q.h.r.s.-.a;
import r.m.-.a.e.u.i.t.i.f.e.t.q.h.r.s.-.c;
import r.m.-.a.e.u.i.t.i.f.e.t.q.h.r.s.-.h;

@ConfigGroup(value="squiretithefarm")
public interface SquireTitheConfig
extends Config {
    @ConfigItem(position=1, keyName="fruitType", name="Fruit type", description="What fruit to plant")
    default public c fruit() {
        return c.BEST_OPTION;
    }

    @ConfigItem(position=6, keyName="herbBox", name="Buy items", description="Uses points to buy stuff before re-entering")
    default public a buyItems() {
        return a.SEED_PACK;
    }

    @ConfigItem(position=2, keyName="rotation", name="Rotation", description="What rotation to run")
    default public h rotation() {
        return h.ROTATION_25;
    }

    @ConfigItem(position=3, keyName="wait", name="Wait for energy", description="Waits for energy at the start of a run")
    default public boolean waitForEnergy() {
        return false;
    }

    @ConfigItem(position=5, keyName="depositFruitAt", name="Deposit Quantity", description="At what quantity of fruit should we deposit?")
    @Range(min=100, max=2500)
    default public int depositFruitAt() {
        return -(0xFFFFF4CB & 0x6B3F) & (0xFFFFFBFE & 0x65FF);
    }

    @ConfigItem(position=4, keyName="useEnergyAt", name="Use energy boost at", description="At what run energy should we drink our boosts?")
    @Range(min=1, max=99)
    default public int energyBoostAt() {
        return 0x4D ^ 1 ^ (0x34 ^ 0x44);
    }
}

