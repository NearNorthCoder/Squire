package gg.squire.hunter;

import e.t.r.i.s.h.q.n.r.u.p000.u.e.EnumC0002c;
import e.t.r.i.s.h.q.n.r.u.p000.u.e.EnumC0003d;
import e.t.r.i.s.h.q.n.r.u.p000.u.e.EnumC0004e;
import e.t.r.i.s.h.q.n.r.u.p000.u.e.i;
import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
@ConfigGroup("squirehunter")
/* loaded from: e2a56d76-bd9d-40c9-839c-e5b25fb4c3a0.jar:gg/squire/hunter/SquireHunterConfig.class */
public interface SquireHunterConfig extends Config {
    @ConfigItem(position = 4, keyName = "pitfallAnimal", name = "Animal", hidden = true, unhide = "hunterMethod", unhideValue = "PITFALL", description = "What animal do you want to trap in pitfalls?")
    default i pitfallAnimal() {
        return i.SUNLIGHT_ANTELOPE;
    }

    @ConfigItem(position = 2, keyName = "chinLocation", name = "Location", hidden = true, unhide = "hunterMethod", unhideValue = "CHINS", description = "What location do you want to hunt chinchompas at?")
    default EnumC0003d chinLocation() {
        return EnumC0003d.FELDIP_HILLS_SOUTH;
    }

    @ConfigItem(position = 1, keyName = "hunterMethod", name = "Hunter method", description = "Specify the method to use for hunter")
    default EnumC0004e method() {
        return EnumC0004e.SALLIES;
    }

    @ConfigItem(position = 4, keyName = "birdLocation", name = "Location", hidden = true, unhide = "hunterMethod", unhideValue = "BIRDS", description = "What location do you want to hunt birds at?")
    default EnumC0002c birdLocation() {
        return EnumC0002c.FELDIP_HILLS_SOUTH;
    }

    @ConfigItem(position = 3, keyName = "tickManipulation", name = "Tick Manipulation", description = "Do you want to use tick manipulation methods?", hidden = true, unhide = "hunterMethod", unhideValue = "CHINS")
    default boolean tickManipulation() {
        return (true ^ true) & ((true ^ true) ^ true);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [boolean, int] */
    @ConfigItem(position = 5, keyName = "buryBones", name = "Bury Bones", hidden = true, unhide = "hunterMethod", unhideValue = "BIRDS||FALCONRY||PITFALL", description = "Bury Bones?")
    default boolean buryBones() {
        return " ".length();
    }
}
