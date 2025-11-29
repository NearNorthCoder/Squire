package gg.squire.zammy;

import m.e.a.i.z.m.r.p000.q.s.y.u.EnumC0000a;
import m.e.a.i.z.m.r.p000.q.s.y.u.EnumC0001b;
import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.ConfigStorageBox;
import net.runelite.client.config.Range;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
@ConfigGroup("squirezammy")
/* loaded from: f8a8c131-0c60-4150-a875-6d5d0cb07058.jar:gg/squire/zammy/SquireZammyConfig.class */
public interface SquireZammyConfig extends Config {
    public static final /* synthetic */ String ZAMMY_CONFIG_GROUP = "squirezammy";

    @ConfigItem(keyName = "zammy.eatrange", name = "Eat at hp", description = "At what hp should the plugin eat food?", position = 14)
    @Range(min = 20, max = 80)
    default int eatFoodAt() {
        return 23 ^ 37;
    }

    @ConfigItem(keyName = "looting.walk", name = "Turn off run for looting", description = "Turns off run to save energy for looting", position = 13)
    default boolean turnOffRun() {
        return (true ^ true) & ((true ^ true) ^ true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ConfigItem(keyName = "zammy.altarteleport", name = "Teleport out using altar", description = "Uses the teleport option on the altar to leave the room", position = 11)
    default boolean altarTeleport() {
        return ((36 ^ 21) ^ (14 ^ 104)) & (((31 ^ 76) ^ (56 ^ 60)) ^ (-" ".length()));
    }

    @ConfigItem(keyName = "zammy.mageprayer", name = "Mage prayer", description = "What mage prayer to use", position = 12)
    default EnumC0000a magePrayer() {
        return EnumC0000a.MYSTIC_MIGHT;
    }

    @ConfigItem(keyName = "zammy.rangeprayer", name = "Range prayer", description = "What range prayer to use", position = 12)
    default EnumC0001b rangePrayer() {
        return EnumC0001b.EAGLE_EYE;
    }

    @ConfigItem(name = "Ranged Gear", description = "The ranged gear (with bowfa) for killing zammy", keyName = "general.gear.range", position = 15)
    default ConfigStorageBox<EquipmentSetup> rangedGear() {
        return new ConfigStorageBox<>("equipmentsetup", "");
    }

    @ConfigItem(name = "Mage gear", description = "The mage gear for healing on zammy minions", keyName = "general.gear.mage", position = 17)
    default ConfigStorageBox<EquipmentSetup> mageGear() {
        return new ConfigStorageBox<>("equipmentsetup", "");
    }

    @ConfigItem(keyName = "minions.bp", name = "Use blowpipe spec", description = "Swaps to blowpipe for spec heal on minions", position = 14)
    default boolean useBlowpipe() {
        return (true ^ true) & ((true ^ true) ^ true);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [boolean, int] */
    @ConfigItem(keyName = "zammy.barrage", name = "Use barrage", description = "Swaps to barrage usage instead of burst", position = 14)
    default boolean useBloodBarrage() {
        return " ".length();
    }
}
