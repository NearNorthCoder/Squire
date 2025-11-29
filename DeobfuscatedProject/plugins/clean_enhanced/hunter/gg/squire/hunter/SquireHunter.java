/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Provides
 *  gg.squire.client.plugins.SquirePlugin
 *  javax.inject.Inject
 *  net.runelite.api.Skill
 *  net.runelite.client.config.ConfigManager
 *  net.runelite.client.eventbus.EventBus
 *  net.runelite.client.eventbus.Subscribe
 *  net.runelite.client.plugins.PluginDescriptor
 *  net.runelite.client.ui.overlay.Overlay
 *  net.runelite.client.ui.overlay.OverlayManager
 *  net.unethicalite.api.events.ExperienceGained
 */
package gg.squire.hunter;

import com.google.inject.Provides;
import gg.squire.hunter.CheckingSnareTask;
import gg.squire.hunter.ResettingBirdSnareTask;
import gg.squire.hunter.DroppingItemsTask;
import gg.squire.hunter.LootingBirdSnareTask;
import gg.squire.hunter.SetupBirdSnareTask;
import gg.squire.hunter.HunterManager;
import gg.squire.hunter.ResettingBoxTrapTask;
import gg.squire.hunter.SetupBoxTrapTask;
import gg.squire.hunter.HuntingKebbitsTask;
import gg.squire.hunter.CheckingNetTrapTask;
import gg.squire.hunter.LootingItemsFromAFailedTrapTask;
import gg.squire.hunter.SettingUpNetTrapTask;
import gg.squire.hunter.DismantlingPitfallTrapTask;
import gg.squire.hunter.DroppingItemsTask;
import gg.squire.hunter.GettingALogTask;
import gg.squire.hunter.JumpingPitfallTrapTask;
import gg.squire.hunter.SettingPitfallTrapTask;
import gg.squire.hunter.TeasingAnimalTask;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.hunter.SquireHunterConfig;
import gg.squire.hunter.overlay.HunterInfoBox;
import javax.inject.Inject;
import net.runelite.api.Skill;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayManager;
import net.unethicalite.api.events.ExperienceGained;

@PluginDescriptor(name="Squire Hunter", enabledByDefault=false)
public class SquireHunter
extends SquirePlugin {
    @Inject
    private  a d;
    private final  Class<?>[] a;
    @Inject
    private  HunterInfoBox c;
    private  int f;
    @Inject
    private  OverlayManager b;
    
    @Inject
    private  EventBus e;

    protected void onStart() {
        this.f = var1[1];
        this.b.add((Overlay)this.c);
        0;
        this.e.register((Object)this.d);
    }

    protected Class<?>[] tasks() {
        return this.a;
    }

    protected void onStop() {
        this.b.remove((Overlay)this.c);
        0;
        this.e.unregister((Object)this.d);
    }

    public SquireHunter() {
        Class[] classArray = new Class[var1[0]];
        classArray[SquireHunter.var1[1]] = CheckingNetTrapTask.class;
        classArray[SquireHunter.var1[2]] = SettingUpNetTrapTask.class;
        classArray[SquireHunter.var1[3]] = LootingItemsFromAFailedTrapTask.class;
        classArray[SquireHunter.var1[4]] = SetupBirdSnareTask.class;
        classArray[SquireHunter.var1[5]] = LootingBirdSnareTask.class;
        classArray[SquireHunter.var1[6]] = ResettingBirdSnareTask.class;
        classArray[SquireHunter.var1[7]] = DroppingItemsTask.class;
        classArray[SquireHunter.var1[8]] = CheckingSnareTask.class;
        classArray[SquireHunter.var1[9]] = SetupBoxTrapTask.class;
        classArray[SquireHunter.var1[10]] = ResettingBoxTrapTask.class;
        classArray[SquireHunter.var1[11]] = HuntingKebbitsTask.class;
        classArray[SquireHunter.var1[12]] = GettingALogTask.class;
        classArray[SquireHunter.var1[13]] = SettingPitfallTrapTask.class;
        classArray[SquireHunter.var1[14]] = DroppingItemsTask.class;
        classArray[SquireHunter.var1[15]] = TeasingAnimalTask.class;
        classArray[SquireHunter.var1[16]] = JumpingPitfallTrapTask.class;
        classArray[SquireHunter.var1[17]] = DismantlingPitfallTrapTask.class;
        this.a = classArray;
        this.f = var1[1];
    }

    @Provides
    SquireHunterConfig a(ConfigManager configManager) {
        return (SquireHunterConfig)configManager.getConfig(SquireHunterConfig.class);
    }

    @Subscribe
    public void a(ExperienceGained experienceGained) {
        if (SquireHunter.var2(experienceGained.getSkill(), Skill.HUNTER)) {
            this.f += var1[2];
        }
    }

    static {
        SquireHunter.var3();
    }

    private static boolean var2(Object object, Object object2) {
        return object == object2;
    }

    public int a() {
        return this.f;
    }

    private static void var3() {
        var1 = new int[18];
        SquireHunter.var1[0] = 22 + 112 - 51 + 55 ^ 123 + 58 - 55 + 29;
        SquireHunter.var1[1] = (71 + 216 - 265 + 204 ^ 85 + 78 - 60 + 28) & (0x4D ^ 0x26 ^ (0x9B ^ 0x91) ^ -1);
        SquireHunter.var1[2] = 1;
        SquireHunter.var1[3] = 2;
        SquireHunter.var1[4] = 3;
        SquireHunter.var1[5] = 0xC0 ^ 0xC4;
        SquireHunter.var1[6] = 0xBA ^ 0xBF;
        SquireHunter.var1[7] = 93 + 85 - 60 + 19 ^ 46 + 30 - 12 + 79;
        SquireHunter.var1[8] = 0x5C ^ 0x5B;
        SquireHunter.var1[9] = 120 + 88 - 98 + 74 ^ 96 + 149 - 156 + 87;
        SquireHunter.var1[10] = 26 + 120 - 127 + 108 ^ (0x3B ^ 0x4D);
        SquireHunter.var1[11] = 0xE ^ 4;
        SquireHunter.var1[12] = 3 ^ (0x89 ^ 0x81);
        SquireHunter.var1[13] = 0x5F ^ 0x53;
        SquireHunter.var1[14] = 84 + 31 - 89 + 120 ^ 46 + 134 - 52 + 31;
        SquireHunter.var1[15] = 0x5F ^ 0x68 ^ (0x2E ^ 0x17);
        SquireHunter.var1[16] = 0xB2 ^ 0x8D ^ (0x97 ^ 0xA7);
        SquireHunter.var1[17] = 43 + 18 - -5 + 85 ^ 119 + 83 - 183 + 116;
    }
}

