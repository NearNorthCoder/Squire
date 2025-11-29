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
import gg.squire.minigames.GameEnum11;
import gg.squire.minigames.FHelper;
import gg.squire.minigames.BankTask;
import gg.squire.minigames.EatTask;
import gg.squire.minigames.EnterCaveTask;
import gg.squire.minigames.PrayerSwitchTask;
import gg.squire.minigames.NHelper;
import gg.squire.minigames.JadFightTask;
import gg.squire.minigames.Wave15To30Task;
import gg.squire.minigames.Wave1To6Task;
import gg.squire.minigames.WaveWave31_62Task;
import gg.squire.minigames.Wave7To14Task;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
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
        if (SquireFightCavesPlugin.llllIlllIIIlII(chatMessage.getType(), ChatMessageType.GAMEMESSAGE) && SquireFightCavesPlugin.llllIlllIIIllI(chatMessage.getMessage().contains(llIIIlllIlIl[llIIIlllIllI[4]]) ? 1 : 0)) {

            h.-.q.i.r.s.u.s.i.e.v.a.c.g.-.t.e.f.f.a(llIIIlllIllI[6]);

            h.-.q.i.r.s.u.s.i.e.v.a.c.g.-.t.e.f.f.b(llIIIlllIllI[6]);
            h.-.q.i.r.s.u.s.i.e.v.a.c.g.-.t.e.f.f.i(llIIIlllIllI[4]);
            h.-.q.i.r.s.u.s.i.e.v.a.c.g.-.t.e.f.f.f(llIIIlllIllI[4]);
            h.-.q.i.r.s.u.s.i.e.v.a.c.g.-.t.e.f.f.g(llIIIlllIllI[4]);
            h.-.q.i.r.s.u.s.i.e.v.a.c.g.-.t.e.f.f.d(llIIIlllIllI[4]);
            String string = Text.removeTags((String)chatMessage.getMessage());
            String[] stringArray = string.split(llIIIlllIlIl[llIIIlllIllI[6]]);
            String string2 = stringArray[llIIIlllIllI[6]].replaceAll(llIIIlllIlIl[llIIIlllIllI[7]], llIIIlllIlIl[llIIIlllIllI[8]]);
            int n2 = Integer.parseInt(string2);
            if (SquireFightCavesPlugin.llllIlllIIIlll(n2)) {
                h.-.q.i.r.s.u.s.i.e.v.a.c.g.-.t.e.f.e.g().filter(e2 -> {
                    boolean bl;
                    if (SquireFightCavesPlugin.llllIlllIIIlIl(e2.i(), n2)) {
                        bl = llIIIlllIllI[6];

                    } else {
                        bl = llIIIlllIllI[4];
                    }
                    return bl;
                }).forEach(this::a);
                h.-.q.i.r.s.u.s.i.e.v.a.c.g.-.t.e.f.e.g().filter(e2 -> {
                    boolean bl;
                    if (SquireFightCavesPlugin.llllIlllIIIlIl(e2.i(), n2)) {
                        bl = llIIIlllIllI[6];

                        if (-1 != -1) {
                            return ((0x93 ^ 0xB9 ^ (0xA6 ^ 0x8B)) & (0x5F ^ 0x78 ^ (8 ^ 0x28) ^ -1)) != 0;
                        }
                    } else {
                        bl = llIIIlllIllI[4];
                    }
                    return bl;
                }).forEach(this::b);

                a.info("setting current wave to: " + h.-.q.i.r.s.u.s.i.e.v.a.c.g.-.t.e.f.f.p());
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    private void a(InventoryChanged inventoryChanged) {
        void var1;
        if (SquireFightCavesPlugin.llllIlllIIIlII(inventoryChanged.getChangeType(), InventoryChanged.ChangeType.ITEM_REMOVED)) {
            return;
        }
        if (SquireFightCavesPlugin.llllIlllIIIlII(var1.getChangeType(), InventoryChanged.ChangeType.ITEM_ADDED) && SquireFightCavesPlugin.llllIlllIIIlIl(var1.getItemId(), llIIIlllIllI[14])) {
            i += llIIIlllIllI[6];
            g = llIIIlllIllI[6];
        }
    }

    private void b(e e2) {

        h.-.q.i.r.s.u.s.i.e.v.a.c.g.-.t.e.f.f.b(e2.i());
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
        NPC var2;
        SquireFightCavesPlugin var3;
        void var4;

        if (SquireFightCavesPlugin.llllIlllIIlIII(h.-.q.i.r.s.u.s.i.e.v.a.c.g.-.t.e.f.f.n() ? 1 : 0)) {
            if (SquireFightCavesPlugin.llllIlllIIIllI(animationChanged.getActor().equals(h.-.q.i.r.s.u.s.i.e.v.a.c.g.-.t.e.f.n.b(h.-.q.i.r.s.u.s.i.e.v.a.c.g.-.t.e.f.b.BLOB)) ? 1 : 0) && SquireFightCavesPlugin.llllIlllIIIlIl(animationChanged.getActor().getAnimation(), llIIIlllIllI[1])) {

                h.-.q.i.r.s.u.s.i.e.v.a.c.g.-.t.e.f.f.b(llIIIlllIllI[4]);

                h.-.q.i.r.s.u.s.i.e.v.a.c.g.-.t.e.f.f.i(Static.getClient().getTickCount());

                a.info("Setting blob attack: " + h.-.q.i.r.s.u.s.i.e.v.a.c.g.-.t.e.f.f.w());
            }
            if (SquireFightCavesPlugin.llllIlllIIIllI(var4.getActor().equals(h.-.q.i.r.s.u.s.i.e.v.a.c.g.-.t.e.f.n.b(h.-.q.i.r.s.u.s.i.e.v.a.c.g.-.t.e.f.b.RANGER)) ? 1 : 0) && SquireFightCavesPlugin.llllIlllIIIlIl(var4.getActor().getAnimation(), llIIIlllIllI[0])) {
                f cfr_ignored_0 = var3.e;

                h.-.q.i.r.s.u.s.i.e.v.a.c.g.-.t.e.f.f.b(llIIIlllIllI[4]);
                f cfr_ignored_1 = var3.e;

                h.-.q.i.r.s.u.s.i.e.v.a.c.g.-.t.e.f.f.g(Static.getClient().getTickCount());
                f cfr_ignored_2 = var3.e;

                a.info("" + h.-.q.i.r.s.u.s.i.e.v.a.c.g.-.t.e.f.f.u());
            }
            if (SquireFightCavesPlugin.llllIlllIIIllI(var4.getActor().equals(h.-.q.i.r.s.u.s.i.e.v.a.c.g.-.t.e.f.n.b(h.-.q.i.r.s.u.s.i.e.v.a.c.g.-.t.e.f.b.MAGER)) ? 1 : 0) && SquireFightCavesPlugin.llllIlllIIIlIl(var4.getActor().getAnimation(), llIIIlllIllI[2])) {
                f cfr_ignored_3 = var3.e;

                h.-.q.i.r.s.u.s.i.e.v.a.c.g.-.t.e.f.f.b(llIIIlllIllI[4]);
                f cfr_ignored_4 = var3.e;

                h.-.q.i.r.s.u.s.i.e.v.a.c.g.-.t.e.f.f.f(Static.getClient().getTickCount());
            }
            if (SquireFightCavesPlugin.llllIlllIIIllI(var4.getActor().equals(h.-.q.i.r.s.u.s.i.e.v.a.c.g.-.t.e.f.n.b(h.-.q.i.r.s.u.s.i.e.v.a.c.g.-.t.e.f.b.MELEER)) ? 1 : 0) && SquireFightCavesPlugin.llllIlllIIIlIl(var4.getActor().getAnimation(), llIIIlllIllI[3])) {
                f cfr_ignored_5 = var3.e;

                h.-.q.i.r.s.u.s.i.e.v.a.c.g.-.t.e.f.f.b(llIIIlllIllI[4]);
                f cfr_ignored_6 = var3.e;

                h.-.q.i.r.s.u.s.i.e.v.a.c.g.-.t.e.f.f.d(Static.getClient().getTickCount());
                a.info("client tick count = " + Static.getClient().getTickCount());
            }
        }
        if (SquireFightCavesPlugin.llllIlllIIlIIl(var2 = NPCs.getNearest((int[])h.-.q.i.r.s.u.s.i.e.v.a.c.g.-.t.e.f.c.v)) && SquireFightCavesPlugin.llllIlllIIIllI(var4.getActor().equals(h.-.q.i.r.s.u.s.i.e.v.a.c.g.-.t.e.f.n.b(h.-.q.i.r.s.u.s.i.e.v.a.c.g.-.t.e.f.b.JAD)) ? 1 : 0)) {
            if (SquireFightCavesPlugin.llllIlllIIIlIl(var4.getActor().getAnimation(), llIIIlllIllI[15])) {
                f cfr_ignored_7 = var3.e;

                h.-.q.i.r.s.u.s.i.e.v.a.c.g.-.t.e.f.f.c(Static.getClient().getTickCount());
            }
            if (SquireFightCavesPlugin.llllIlllIIIlIl(var4.getActor().getAnimation(), llIIIlllIllI[16])) {
                f cfr_ignored_8 = var3.e;

                h.-.q.i.r.s.u.s.i.e.v.a.c.g.-.t.e.f.f.c(Static.getClient().getTickCount());
            }
        }
    }

    private static void llllIlllIIIIlI() {
        llIIIlllIlIl = new String[llIIIlllIllI[10]];
        SquireFightCavesPlugin.llIIIlllIlIl[SquireFightCavesPlugin.llIIIlllIllI[4]] = "<col=ef1020>Wave:";
        SquireFightCavesPlugin.llIIIlllIlIl[SquireFightCavesPlugin.llIIIlllIllI[6]] = ":";
        SquireFightCavesPlugin.llIIIlllIlIl[SquireFightCavesPlugin.llIIIlllIllI[7]] = "[^\\d.]";
        SquireFightCavesPlugin.llIIIlllIlIl[SquireFightCavesPlugin.llIIIlllIllI[8]] = SquireFightCavesPlugin.llllIlllIIIIIl("yevMBovc7QA=", "VaNGI");
        SquireFightCavesPlugin.llIIIlllIlIl[SquireFightCavesPlugin.llIIIlllIllI[9]] = "None";
    }

    protected void onStop() {
        this.b.remove((Overlay)this.c);

    }

    private static boolean llllIlllIIIlIl(int n2, int n3) {
        return n2 == n3;
    }

    public SquireFightCavesPlugin() {
        this.l = llIIIlllIllI[0];
        this.m = llIIIlllIllI[1];
        this.n = llIIIlllIllI[2];
        this.o = llIIIlllIllI[3];
    }

    private void a(e e2) {

        h.-.q.i.r.s.u.s.i.e.v.a.c.g.-.t.e.f.f.a(e2);
    }

    protected void onStart() {
        this.b.add((Overlay)this.c);

        h.-.q.i.r.s.u.s.i.e.v.a.c.g.-.t.e.f.f.a(h.-.q.i.r.s.u.s.i.e.v.a.c.g.-.t.e.f.e.WAVE3);
        k = System.currentTimeMillis();
        i = llIIIlllIllI[4];
        j = llIIIlllIllI[4];
        f = llIIIlllIllI[4];
        g = llIIIlllIllI[4];
    }

    static {
        SquireFightCavesPlugin.llllIlllIIIIll();
        SquireFightCavesPlugin.llllIlllIIIIlI();
        a = LoggerFactory.getLogger(SquireFightCavesPlugin.class);
        f = llIIIlllIllI[4];
        h = llIIIlllIlIl[llIIIlllIllI[9]];
        k = System.currentTimeMillis();
    }

    private static boolean llllIlllIIIlll(int n2) {
        return n2 > 0;
    }

    protected Class<?>[] tasks() {
        Class[] classArray = new Class[llIIIlllIllI[5]];
        classArray[SquireFightCavesPlugin.llIIIlllIllI[4]] = Wave1To6Task.class;
        classArray[SquireFightCavesPlugin.llIIIlllIllI[6]] = Wave7To14Task.class;
        classArray[SquireFightCavesPlugin.llIIIlllIllI[7]] = Wave15To30Task.class;
        classArray[SquireFightCavesPlugin.llIIIlllIllI[8]] = WaveWave31_62Task.class;
        classArray[SquireFightCavesPlugin.llIIIlllIllI[9]] = JadFightTask.class;
        classArray[SquireFightCavesPlugin.llIIIlllIllI[10]] = EnterCaveTask.class;
        classArray[SquireFightCavesPlugin.llIIIlllIllI[11]] = BankTask.class;
        classArray[SquireFightCavesPlugin.llIIIlllIllI[12]] = EatTask.class;
        classArray[SquireFightCavesPlugin.llIIIlllIllI[13]] = PrayerSwitchTask.class;
        return classArray;
    }

    private static boolean llllIlllIIIllI(int n2) {
        return n2 != 0;
    }

    private static boolean llllIlllIIlIII(int n2) {
        return n2 == 0;
    }

    public SquireFightCavesConfig a() {
        return this.d;
    }

    private static boolean llllIlllIIIlII(Object object, Object object2) {
        return object == object2;
    }

    private static boolean llllIlllIIlIIl(Object object) {
        return object != null;
    }

}

