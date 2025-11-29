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
        this.f = lllIlllIlIII[1];
        this.b.add((Overlay)this.c);

        this.e.register((Object)this.d);
    }

    protected Class<?>[] tasks() {
        return this.a;
    }

    protected void onStop() {
        this.b.remove((Overlay)this.c);

        this.e.unregister((Object)this.d);
    }

    public SquireHunter() {
        Class[] classArray = new Class[lllIlllIlIII[0]];
        classArray[SquireHunter.lllIlllIlIII[1]] = CheckingNetTrapTask.class;
        classArray[SquireHunter.lllIlllIlIII[2]] = SettingUpNetTrapTask.class;
        classArray[SquireHunter.lllIlllIlIII[3]] = LootingItemsFromAFailedTrapTask.class;
        classArray[SquireHunter.lllIlllIlIII[4]] = SetupBirdSnareTask.class;
        classArray[SquireHunter.lllIlllIlIII[5]] = LootingBirdSnareTask.class;
        classArray[SquireHunter.lllIlllIlIII[6]] = ResettingBirdSnareTask.class;
        classArray[SquireHunter.lllIlllIlIII[7]] = DroppingItemsTask.class;
        classArray[SquireHunter.lllIlllIlIII[8]] = CheckingSnareTask.class;
        classArray[SquireHunter.lllIlllIlIII[9]] = SetupBoxTrapTask.class;
        classArray[SquireHunter.lllIlllIlIII[10]] = ResettingBoxTrapTask.class;
        classArray[SquireHunter.lllIlllIlIII[11]] = HuntingKebbitsTask.class;
        classArray[SquireHunter.lllIlllIlIII[12]] = GettingALogTask.class;
        classArray[SquireHunter.lllIlllIlIII[13]] = SettingPitfallTrapTask.class;
        classArray[SquireHunter.lllIlllIlIII[14]] = DroppingItemsTask.class;
        classArray[SquireHunter.lllIlllIlIII[15]] = TeasingAnimalTask.class;
        classArray[SquireHunter.lllIlllIlIII[16]] = JumpingPitfallTrapTask.class;
        classArray[SquireHunter.lllIlllIlIII[17]] = DismantlingPitfallTrapTask.class;
        this.a = classArray;
        this.f = lllIlllIlIII[1];
    }

    @Provides
    SquireHunterConfig a(ConfigManager configManager) {
        return (SquireHunterConfig)configManager.getConfig(SquireHunterConfig.class);
    }

    @Subscribe
    public void a(ExperienceGained experienceGained) {
        if (SquireHunter.lIIIllIlllIIlII(experienceGained.getSkill(), Skill.HUNTER)) {
            this.f += lllIlllIlIII[2];
        }
    }

    static {
        SquireHunter.lIIIllIlllIIIll();
    }

    private static boolean lIIIllIlllIIlII(Object object, Object object2) {
        return object == object2;
    }

    public int a() {
        return this.f;
    }

}

