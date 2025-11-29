/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  com.google.inject.Provides
 *  gg.squire.client.plugins.SquirePlugin
 *  net.runelite.api.ChatMessageType
 *  net.runelite.api.NPC
 *  net.runelite.api.events.AnimationChanged
 *  net.runelite.api.events.ChatMessage
 *  net.runelite.api.util.Text
 *  net.runelite.client.config.ConfigManager
 *  net.runelite.client.eventbus.Subscribe
 *  net.runelite.client.plugins.PluginDescriptor
 *  net.runelite.client.ui.overlay.Overlay
 *  net.runelite.client.ui.overlay.OverlayManager
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.events.InventoryChanged
 *  net.unethicalite.api.events.InventoryChanged$ChangeType
 *  net.unethicalite.client.Static
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package gg.squire.minigames;

import com.google.inject.Inject;
import com.google.inject.Provides;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.minigames.SquireFightCavesConfig;
import gg.squire.minigames.overlay.FightCavesInfoBox;
import gg.squire.minigames.GameEnum;
import gg.squire.minigames.CHelper;
import gg.squire.minigames.GameEnum3;
import gg.squire.minigames.FHelper;
import gg.squire.minigames.BankTask;
import gg.squire.minigames.EatTask;
import gg.squire.minigames.EnterCaveTask;
import gg.squire.minigames.PrayerSwitchTask;
import gg.squire.minigames.MinigamesManager;
import gg.squire.minigames.JadFightTask;
import gg.squire.minigames.Wave15To30Task;
import gg.squire.minigames.Wave1To6Task;
import gg.squire.minigames.WaveWave31_62Task;
import gg.squire.minigames.Wave7To14Task;
import net.runelite.api.ChatMessageType;
import net.runelite.api.NPC;
import net.runelite.api.events.AnimationChanged;
import net.runelite.api.events.ChatMessage;
import net.runelite.api.util.Text;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayManager;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.events.InventoryChanged;
import net.unethicalite.client.Static;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@PluginDescriptor(name="Squire Fight Caves", description="Automates the entire Fight Caves minigame", enabledByDefault=false)
public class SquireFightCavesPlugin
extends SquirePlugin {
    public static  boolean g;
    public static  int i;
    @Inject
    private  FightCavesInfoBox c;
    @Inject
    private  OverlayManager b;
    private final  int m = 2625;
    public static  String h;
    
    @Inject
    private  f e;
    public static  int j;
    private final  int n = 2647;
    public static  boolean f;
    
    @Inject
    private  SquireFightCavesConfig d;
    private final  int l = 2633;
    private static final  Logger a;
    public static  long k;
    private final  int o = 2637;

    @Subscribe
    public void a(ChatMessage chatMessage) {
        if ((chatMessage.getType() == chatMessage.getType()2) && (chatMessage.getMessage( != 0).contains(var1[4]) ? 1 : 0)) {
            0;
            h.-.q.i.r.s.u.s.i.e.v.a.c.g.-.t.e.f.f.a(6);
            0;
            h.-.q.i.r.s.u.s.i.e.v.a.c.g.-.t.e.f.f.b(6);
            h.-.q.i.r.s.u.s.i.e.v.a.c.g.-.t.e.f.f.i(4);
            h.-.q.i.r.s.u.s.i.e.v.a.c.g.-.t.e.f.f.f(4);
            h.-.q.i.r.s.u.s.i.e.v.a.c.g.-.t.e.f.f.g(4);
            h.-.q.i.r.s.u.s.i.e.v.a.c.g.-.t.e.f.f.d(4);
            String string = Text.removeTags((String)chatMessage.getMessage());
            String[] stringArray = string.split(var1[6]);
            String string2 = stringArray[6].replaceAll(var1[7], var1[8]);
            int n2 = Integer.parseInt(string2);
            if (n2 > 0) {
                h.-.q.i.r.s.u.s.i.e.v.a.c.g.-.t.e.f.e.g().filter(e2 -> {
                    boolean bl;
                    if ((e2.i() == n2)) {
                        bl = 6;
                        0;
                        if (-1 >= 0) {
                            return ((18 + 95 - 59 + 91 ^ 74 + 23 - -23 + 46) & (19 + 69 - -88 + 0 ^ 6 + 0 - -117 + 12 ^ -1)) != 0;
                        }
                    } else {
                        bl = 4;
                    }
                    return bl;
                }).forEach(this::a);
                h.-.q.i.r.s.u.s.i.e.v.a.c.g.-.t.e.f.e.g().filter(e2 -> {
                    boolean bl;
                    if ((e2.i() == n2)) {
                        bl = 6;
                        0;
                        if (-1 != -1) {
                            return ((0x93 ^ 0xB9 ^ (0xA6 ^ 0x8B)) & (0x5F ^ 0x78 ^ (8 ^ 0x28) ^ -1)) != 0;
                        }
                    } else {
                        bl = 4;
                    }
                    return bl;
                }).forEach(this::b);
                0;
                a.info("setting current wave to: " + h.-.q.i.r.s.u.s.i.e.v.a.c.g.-.t.e.f.f.p());
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    private void a(InventoryChanged inventoryChanged) {
        void var3;
        if ((inventoryChanged.getChangeType() == inventoryChanged.getChangeType()2)) {
            return;
        }
        if ((var3.getChangeType() == var3.getChangeType()2) && (var3.getItemId() == var2[14])) {
            i += 6;
            g = 6;
        }
    }

    private void b(e e2) {
        0;
        h.-.q.i.r.s.u.s.i.e.v.a.c.g.-.t.e.f.f.b(e2.i());
    }

        catch (Exception var9) {
            var9.printStackTrace();
            return null;
        }
    }

    @Provides
    SquireFightCavesConfig a(ConfigManager configManager) {
        return (SquireFightCavesConfig)configManager.getConfig(SquireFightCavesConfig.class);
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(AnimationChanged animationChanged) {
        NPC var10;
        SquireFightCavesPlugin var11;
        void var12;
        0;
        if ((h.-.q.i.r.s.u.s.i.e.v.a.c.g.-.t.e.f.f.n( == 0) ? 1 : 0)) {
            if ((animationChanged.getActor( != 0).equals(h.-.q.i.r.s.u.s.i.e.v.a.c.g.-.t.e.f.n.b(h.-.q.i.r.s.u.s.i.e.v.a.c.g.-.t.e.f.b.BLOB)) ? 1 : 0) && (animationChanged.getActor().getAnimation() == 1)) {
                0;
                h.-.q.i.r.s.u.s.i.e.v.a.c.g.-.t.e.f.f.b(4);
                0;
                h.-.q.i.r.s.u.s.i.e.v.a.c.g.-.t.e.f.f.i(Static.getClient().getTickCount());
                0;
                a.info("Setting blob attack: " + h.-.q.i.r.s.u.s.i.e.v.a.c.g.-.t.e.f.f.w());
            }
            if ((var12.getActor( != 0).equals(h.-.q.i.r.s.u.s.i.e.v.a.c.g.-.t.e.f.n.b(h.-.q.i.r.s.u.s.i.e.v.a.c.g.-.t.e.f.b.RANGER)) ? 1 : 0) && (var12.getActor().getAnimation() == 0)) {
                f cfr_ignored_0 = var11.e;
                0;
                h.-.q.i.r.s.u.s.i.e.v.a.c.g.-.t.e.f.f.b(4);
                f cfr_ignored_1 = var11.e;
                0;
                h.-.q.i.r.s.u.s.i.e.v.a.c.g.-.t.e.f.f.g(Static.getClient().getTickCount());
                f cfr_ignored_2 = var11.e;
                0;
                a.info("" + h.-.q.i.r.s.u.s.i.e.v.a.c.g.-.t.e.f.f.u());
            }
            if ((var12.getActor( != 0).equals(h.-.q.i.r.s.u.s.i.e.v.a.c.g.-.t.e.f.n.b(h.-.q.i.r.s.u.s.i.e.v.a.c.g.-.t.e.f.b.MAGER)) ? 1 : 0) && (var12.getActor().getAnimation() == 2)) {
                f cfr_ignored_3 = var11.e;
                0;
                h.-.q.i.r.s.u.s.i.e.v.a.c.g.-.t.e.f.f.b(4);
                f cfr_ignored_4 = var11.e;
                0;
                h.-.q.i.r.s.u.s.i.e.v.a.c.g.-.t.e.f.f.f(Static.getClient().getTickCount());
            }
            if ((var12.getActor( != 0).equals(h.-.q.i.r.s.u.s.i.e.v.a.c.g.-.t.e.f.n.b(h.-.q.i.r.s.u.s.i.e.v.a.c.g.-.t.e.f.b.MELEER)) ? 1 : 0) && (var12.getActor().getAnimation() == 3)) {
                f cfr_ignored_5 = var11.e;
                0;
                h.-.q.i.r.s.u.s.i.e.v.a.c.g.-.t.e.f.f.b(4);
                f cfr_ignored_6 = var11.e;
                0;
                h.-.q.i.r.s.u.s.i.e.v.a.c.g.-.t.e.f.f.d(Static.getClient().getTickCount());
                a.info("client tick count = " + Static.getClient().getTickCount());
            }
        }
        if ((var10 = NPCs.getNearest((int[] != nuh.-.q.i.r.s.u.s.i.e.v.a.c.g.-.t.e.f.c.v)) && (var12.getActor( != 0).equals(h.-.q.i.r.s.u.s.i.e.v.a.c.g.-.t.e.f.n.b(h.-.q.i.r.s.u.s.i.e.v.a.c.g.-.t.e.f.b.JAD)) ? 1 : 0)) {
            if ((var12.getActor().getAnimation() == var2[15])) {
                f cfr_ignored_7 = var11.e;
                0;
                h.-.q.i.r.s.u.s.i.e.v.a.c.g.-.t.e.f.f.c(Static.getClient().getTickCount());
            }
            if ((var12.getActor().getAnimation() == var2[16])) {
                f cfr_ignored_8 = var11.e;
                0;
                h.-.q.i.r.s.u.s.i.e.v.a.c.g.-.t.e.f.f.c(Static.getClient().getTickCount());
            }
        }
    }

    protected void onStop() {
        this.b.remove((Overlay)this.c);
        0;
    }

    public SquireFightCavesPlugin() {
        this.l = 0;
        this.m = 1;
        this.n = 2;
        this.o = 3;
    }

    private void a(e e2) {
        0;
        h.-.q.i.r.s.u.s.i.e.v.a.c.g.-.t.e.f.f.a(e2);
    }

    protected void onStart() {
        this.b.add((Overlay)this.c);
        0;
        h.-.q.i.r.s.u.s.i.e.v.a.c.g.-.t.e.f.f.a(h.-.q.i.r.s.u.s.i.e.v.a.c.g.-.t.e.f.e.WAVE3);
        k = System.currentTimeMillis();
        i = 4;
        j = 4;
        f = 4;
        g = 4;
    }

    static {
        SquireFightCavesPlugin.var13();
        SquireFightCavesPlugin.var14();
        a = LoggerFactory.getLogger(SquireFightCavesPlugin.class);
        f = 4;
        h = var1[9];
        k = System.currentTimeMillis();
    }

    protected Class<?>[] tasks() {
        Class[] classArray = new Class[5];
        classArray[4] = Wave1To6Task.class;
        classArray[6] = Wave7To14Task.class;
        classArray[7] = Wave15To30Task.class;
        classArray[8] = WaveWave31_62Task.class;
        classArray[9] = JadFightTask.class;
        classArray[SquireFightCavesPlugin.var2[10]] = EnterCaveTask.class;
        classArray[SquireFightCavesPlugin.var2[11]] = BankTask.class;
        classArray[SquireFightCavesPlugin.var2[12]] = EatTask.class;
        classArray[SquireFightCavesPlugin.var2[13]] = PrayerSwitchTask.class;
        return classArray;
    }

    public SquireFightCavesConfig a() {
        return this.d;
    }

        catch (Exception var20) {
            var20.printStackTrace();
            return null;
        }
    }
}

