package gg.squire.tithefarm;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.Range;
import r.m.p000.a.e.u.i.t.i.f.e.t.q.h.r.s.p001.a;
import r.m.p000.a.e.u.i.t.i.f.e.t.q.h.r.s.p001.c;
import r.m.p000.a.e.u.i.t.i.f.e.t.q.h.r.s.p001.h;
@ConfigGroup("squiretithefarm")
/* loaded from: afc9cf98-0627-4d2a-8a9e-4e9657a2fb2d.jar:gg/squire/tithefarm/SquireTitheConfig.class */
public interface SquireTitheConfig extends Config {
    @ConfigItem(position = 1, keyName = "fruitType", name = "Fruit type", description = "What fruit to plant")
    default c fruit() {
        return c.BEST_OPTION;
    }

    @ConfigItem(position = 6, keyName = "herbBox", name = "Buy items", description = "Uses points to buy stuff before re-entering")
    default a buyItems() {
        return a.SEED_PACK;
    }

    @ConfigItem(position = 2, keyName = "rotation", name = "Rotation", description = "What rotation to run")
    default h rotation() {
        return h.ROTATION_25;
    }

    @ConfigItem(position = 3, keyName = "wait", name = "Wait for energy", description = "Waits for energy at the start of a run")
    default boolean waitForEnergy() {
        return (true ^ true) & ((true ^ true) ^ true);
    }

    @ConfigItem(position = 5, keyName = "depositFruitAt", name = "Deposit Quantity", description = "At what quantity of fruit should we deposit?")
    @Range(min = 100, max = 2500)
    default int depositFruitAt() {
        return (-((-2869) & 27455)) & (-1026) & 26111;
    }

    @ConfigItem(position = 4, keyName = "useEnergyAt", name = "Use energy boost at", description = "At what run energy should we drink our boosts?")
    @Range(min = 1, max = 99)
    default int energyBoostAt() {
        return (77 ^ 1) ^ (52 ^ 68);
    }
}
