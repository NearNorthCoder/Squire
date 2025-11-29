package gg.squire.basics.combat.Lure;

import i.i.b.s.c.q.r.s.s.p000.u.a.e.N;
import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.Keybind;
@ConfigGroup("squirelurer")
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:gg/squire/basics/combat/Lure/LureConfig.class */
public interface LureConfig extends Config {
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean, int] */
    @ConfigItem(position = 3, name = "Use Secondary?", description = "using a secondary?", keyName = "useSecondary")
    default boolean usingSecondary() {
        return " ".length();
    }

    @ConfigItem(position = 1, name = "Tagging weapon ID", description = "What weapon to tag monsters with", keyName = "tagging")
    default int tagging() {
        return (-((-4445) & 30205)) & (-2051) & 28671;
    }

    @ConfigItem(position = 5, name = "Activation key", description = "Key to activate", keyName = "activate")
    default Keybind activate() {
        return Keybind.NOT_SET;
    }

    @ConfigItem(position = 4, name = "Secondary weapon ID", hidden = true, unhide = "useSecondary", description = "What weapon to kill monsters with", keyName = "secondaryID")
    default int secondaryWeaponID() {
        return (-16833) & 29657;
    }

    @ConfigItem(position = 0, name = "Monster to lure", description = "What monster does the account need to lure", keyName = "luring")
    default N luring() {
        return N.DUST_DEVIL;
    }

    @ConfigItem(position = 2, name = "Primary weapon ID", description = "What weapon to tag monsters with", keyName = "primaryID")
    default int primaryWeaponID() {
        return (-2433) & 23438;
    }
}
