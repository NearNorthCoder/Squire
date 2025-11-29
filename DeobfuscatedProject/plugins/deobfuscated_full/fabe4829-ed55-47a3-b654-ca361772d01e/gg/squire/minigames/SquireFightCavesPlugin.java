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
import h.-.q.i.r.s.u.s.i.e.v.a.c.g.-.t.e.f.b;
import h.-.q.i.r.s.u.s.i.e.v.a.c.g.-.t.e.f.c;
import h.-.q.i.r.s.u.s.i.e.v.a.c.g.-.t.e.f.e;
import h.-.q.i.r.s.u.s.i.e.v.a.c.g.-.t.e.f.f;
import h.-.q.i.r.s.u.s.i.e.v.a.c.g.-.t.e.f.h;
import h.-.q.i.r.s.u.s.i.e.v.a.c.g.-.t.e.f.i;
import h.-.q.i.r.s.u.s.i.e.v.a.c.g.-.t.e.f.j;
import h.-.q.i.r.s.u.s.i.e.v.a.c.g.-.t.e.f.k;
import h.-.q.i.r.s.u.s.i.e.v.a.c.g.-.t.e.f.n;
import h.-.q.i.r.s.u.s.i.e.v.a.c.g.-.t.e.f.o;
import h.-.q.i.r.s.u.s.i.e.v.a.c.g.-.t.e.f.p;
import h.-.q.i.r.s.u.s.i.e.v.a.c.g.-.t.e.f.q;
import h.-.q.i.r.s.u.s.i.e.v.a.c.g.-.t.e.f.r;
import h.-.q.i.r.s.u.s.i.e.v.a.c.g.-.t.e.f.s;
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
    public static /* synthetic */ boolean g;
    public static /* synthetic */ int i;
    @Inject
    private /* synthetic */ FightCavesInfoBox c;
    @Inject
    private /* synthetic */ OverlayManager b;
    private final /* synthetic */ int m = 2625;
    public static /* synthetic */ String h;
    private static /* synthetic */ String[] llIIIlllIlIl;
    @Inject
    private /* synthetic */ f e;
    public static /* synthetic */ int j;
    private final /* synthetic */ int n = 2647;
    public static /* synthetic */ boolean f;
    private static /* synthetic */ int[] llIIIlllIllI;
    @Inject
    private /* synthetic */ SquireFightCavesConfig d;
    private final /* synthetic */ int l = 2633;
    private static final /* synthetic */ Logger a;
    public static /* synthetic */ long k;
    private final /* synthetic */ int o = 2637;

    @Subscribe
    public void a(ChatMessage chatMessage) {
        if (SquireFightCavesPlugin.llllIlllIIIlII(chatMessage.getType(), ChatMessageType.GAMEMESSAGE) && SquireFightCavesPlugin.llllIlllIIIllI(chatMessage.getMessage().contains(llIIIlllIlIl[llIIIlllIllI[4]]) ? 1 : 0)) {
            0;
            h.-.q.i.r.s.u.s.i.e.v.a.c.g.-.t.e.f.f.a(llIIIlllIllI[6]);
            0;
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
                        0;
                        if (-1 >= 0) {
                            return false;
                        }
                    } else {
                        bl = llIIIlllIllI[4];
                    }
                    return bl;
                }).forEach(this::a);
                h.-.q.i.r.s.u.s.i.e.v.a.c.g.-.t.e.f.e.g().filter(e2 -> {
                    boolean bl;
                    if (SquireFightCavesPlugin.llllIlllIIIlIl(e2.i(), n2)) {
                        bl = llIIIlllIllI[6];
                        0;
                        if (-1 != -1) {
                            return ((0x93 ^ 0xB9 ^ (0xA6 ^ 0x8B)) & (0x5F ^ 0x78 ^ (8 ^ 0x28) ^ -1)) != 0;
                        }
                    } else {
                        bl = llIIIlllIllI[4];
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
        void var11;
        if (SquireFightCavesPlugin.llllIlllIIIlII(inventoryChanged.getChangeType(), InventoryChanged.ChangeType.ITEM_REMOVED)) {
            return;
        }
        if (SquireFightCavesPlugin.llllIlllIIIlII(var11.getChangeType(), InventoryChanged.ChangeType.ITEM_ADDED) && SquireFightCavesPlugin.llllIlllIIIlIl(var11.getItemId(), llIIIlllIllI[14])) {
            i += llIIIlllIllI[6];
            g = llIIIlllIllI[6];
        }
    }

    private void b(e e2) {
        0;
        h.-.q.i.r.s.u.s.i.e.v.a.c.g.-.t.e.f.f.b(e2.i());
    }

    private static String llllIlllIIIIII(String var1, String var14) {
        try {
            SecretKeySpec var8 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var14.getBytes(StandardCharsets.UTF_8)), llIIIlllIllI[13]), "DES");
            Cipher var6 = Cipher.getInstance("DES");
            var6.init(llIIIlllIllI[7], var8);
            return new String(var6.doFinal(Base64.getDecoder().decode(var1.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var12) {
            var12.printStackTrace();
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
        NPC var4;
        SquireFightCavesPlugin var5;
        void var13;
        0;
        if (SquireFightCavesPlugin.llllIlllIIlIII(h.-.q.i.r.s.u.s.i.e.v.a.c.g.-.t.e.f.f.n() ? 1 : 0)) {
            if (SquireFightCavesPlugin.llllIlllIIIllI(animationChanged.getActor().equals(h.-.q.i.r.s.u.s.i.e.v.a.c.g.-.t.e.f.n.b(h.-.q.i.r.s.u.s.i.e.v.a.c.g.-.t.e.f.b.BLOB)) ? 1 : 0) && SquireFightCavesPlugin.llllIlllIIIlIl(animationChanged.getActor().getAnimation(), llIIIlllIllI[1])) {
                0;
                h.-.q.i.r.s.u.s.i.e.v.a.c.g.-.t.e.f.f.b(llIIIlllIllI[4]);
                0;
                h.-.q.i.r.s.u.s.i.e.v.a.c.g.-.t.e.f.f.i(Static.getClient().getTickCount());
                0;
                a.info("Setting blob attack: " + h.-.q.i.r.s.u.s.i.e.v.a.c.g.-.t.e.f.f.w());
            }
            if (SquireFightCavesPlugin.llllIlllIIIllI(var13.getActor().equals(h.-.q.i.r.s.u.s.i.e.v.a.c.g.-.t.e.f.n.b(h.-.q.i.r.s.u.s.i.e.v.a.c.g.-.t.e.f.b.RANGER)) ? 1 : 0) && SquireFightCavesPlugin.llllIlllIIIlIl(var13.getActor().getAnimation(), llIIIlllIllI[0])) {
                f cfr_ignored_0 = var5.e;
                0;
                h.-.q.i.r.s.u.s.i.e.v.a.c.g.-.t.e.f.f.b(llIIIlllIllI[4]);
                f cfr_ignored_1 = var5.e;
                0;
                h.-.q.i.r.s.u.s.i.e.v.a.c.g.-.t.e.f.f.g(Static.getClient().getTickCount());
                f cfr_ignored_2 = var5.e;
                0;
                a.info("" + h.-.q.i.r.s.u.s.i.e.v.a.c.g.-.t.e.f.f.u());
            }
            if (SquireFightCavesPlugin.llllIlllIIIllI(var13.getActor().equals(h.-.q.i.r.s.u.s.i.e.v.a.c.g.-.t.e.f.n.b(h.-.q.i.r.s.u.s.i.e.v.a.c.g.-.t.e.f.b.MAGER)) ? 1 : 0) && SquireFightCavesPlugin.llllIlllIIIlIl(var13.getActor().getAnimation(), llIIIlllIllI[2])) {
                f cfr_ignored_3 = var5.e;
                0;
                h.-.q.i.r.s.u.s.i.e.v.a.c.g.-.t.e.f.f.b(llIIIlllIllI[4]);
                f cfr_ignored_4 = var5.e;
                0;
                h.-.q.i.r.s.u.s.i.e.v.a.c.g.-.t.e.f.f.f(Static.getClient().getTickCount());
            }
            if (SquireFightCavesPlugin.llllIlllIIIllI(var13.getActor().equals(h.-.q.i.r.s.u.s.i.e.v.a.c.g.-.t.e.f.n.b(h.-.q.i.r.s.u.s.i.e.v.a.c.g.-.t.e.f.b.MELEER)) ? 1 : 0) && SquireFightCavesPlugin.llllIlllIIIlIl(var13.getActor().getAnimation(), llIIIlllIllI[3])) {
                f cfr_ignored_5 = var5.e;
                0;
                h.-.q.i.r.s.u.s.i.e.v.a.c.g.-.t.e.f.f.b(llIIIlllIllI[4]);
                f cfr_ignored_6 = var5.e;
                0;
                h.-.q.i.r.s.u.s.i.e.v.a.c.g.-.t.e.f.f.d(Static.getClient().getTickCount());
                a.info("client tick count = " + Static.getClient().getTickCount());
            }
        }
        if (SquireFightCavesPlugin.llllIlllIIlIIl(var4 = NPCs.getNearest((int[])h.-.q.i.r.s.u.s.i.e.v.a.c.g.-.t.e.f.c.v)) && SquireFightCavesPlugin.llllIlllIIIllI(var13.getActor().equals(h.-.q.i.r.s.u.s.i.e.v.a.c.g.-.t.e.f.n.b(h.-.q.i.r.s.u.s.i.e.v.a.c.g.-.t.e.f.b.JAD)) ? 1 : 0)) {
            if (SquireFightCavesPlugin.llllIlllIIIlIl(var13.getActor().getAnimation(), llIIIlllIllI[15])) {
                f cfr_ignored_7 = var5.e;
                0;
                h.-.q.i.r.s.u.s.i.e.v.a.c.g.-.t.e.f.f.c(Static.getClient().getTickCount());
            }
            if (SquireFightCavesPlugin.llllIlllIIIlIl(var13.getActor().getAnimation(), llIIIlllIllI[16])) {
                f cfr_ignored_8 = var5.e;
                0;
                h.-.q.i.r.s.u.s.i.e.v.a.c.g.-.t.e.f.f.c(Static.getClient().getTickCount());
            }
        }
    }

    private static void llllIlllIIIIlI() {
        llIIIlllIlIl = new String[llIIIlllIllI[10]];
        SquireFightCavesPlugin.llIIIlllIlIl[SquireFightCavesPlugin.llIIIlllIllI[4]] = SquireFightCavesPlugin."<col=ef1020>Wave:";
        SquireFightCavesPlugin.llIIIlllIlIl[SquireFightCavesPlugin.llIIIlllIllI[6]] = SquireFightCavesPlugin.":";
        SquireFightCavesPlugin.llIIIlllIlIl[SquireFightCavesPlugin.llIIIlllIllI[7]] = SquireFightCavesPlugin."[^\\d.]";
        SquireFightCavesPlugin.llIIIlllIlIl[SquireFightCavesPlugin.llIIIlllIllI[8]] = SquireFightCavesPlugin."";
        SquireFightCavesPlugin.llIIIlllIlIl[SquireFightCavesPlugin.llIIIlllIllI[9]] = SquireFightCavesPlugin."None";
    }

    protected void onStop() {
        this.b.remove((Overlay)this.c);
        0;
    }

    private static boolean llllIlllIIIlIl(int n2, int n3) {
        return n2 == n3;
    }

    private static void llllIlllIIIIll() {
        llIIIlllIllI = new int[17];
        SquireFightCavesPlugin.llIIIlllIllI[0] = -(0xFFFFF0BF & 0x6FC7) & (0xFFFFFADF & 0x6FEF);
        SquireFightCavesPlugin.llIIIlllIllI[1] = -(0xFFFFEDFF & 0x36B1) & (0xFFFFBEF5 & 0x6FFB);
        SquireFightCavesPlugin.llIIIlllIllI[2] = -(0xFFFFB5ED & 0x5B13) & (0xFFFF9BF7 & 0x7F5F);
        SquireFightCavesPlugin.llIIIlllIllI[3] = 0xFFFFEACF & 0x1F7D;
        SquireFightCavesPlugin.llIIIlllIllI[4] = (0 ^ 0x32) & ~(0x8C ^ 0xBE);
        SquireFightCavesPlugin.llIIIlllIllI[5] = 111 + 93 - 96 + 19 ^ (0x6B ^ 0x1D);
        SquireFightCavesPlugin.llIIIlllIllI[6] = 1;
        SquireFightCavesPlugin.llIIIlllIllI[7] = 2;
        SquireFightCavesPlugin.llIIIlllIllI[8] = 3;
        SquireFightCavesPlugin.llIIIlllIllI[9] = 0x7F ^ 0x7B;
        SquireFightCavesPlugin.llIIIlllIllI[10] = 0xBE ^ 0x97 ^ (0x42 ^ 0x6E);
        SquireFightCavesPlugin.llIIIlllIllI[11] = 97 + 106 - 154 + 143 ^ 133 + 109 - 52 + 8;
        SquireFightCavesPlugin.llIIIlllIllI[12] = 0x40 ^ 0x47;
        SquireFightCavesPlugin.llIIIlllIllI[13] = 0xA0 ^ 0xA8;
        SquireFightCavesPlugin.llIIIlllIllI[14] = -(0xFFFFC06E & 0x7FD7) & (0xFFFFDFFF & 0x79EF);
        SquireFightCavesPlugin.llIIIlllIllI[15] = -(0xFFFFD783 & 0x7D7D) & (0xFFFFDF7E & 0x7FDD);
        SquireFightCavesPlugin.llIIIlllIllI[16] = -(0xFFFFFCE3 & 0x231F) & (0xFFFFFE6A & 0x2BF7);
    }

    public SquireFightCavesPlugin() {
        this.l = llIIIlllIllI[0];
        this.m = llIIIlllIllI[1];
        this.n = llIIIlllIllI[2];
        this.o = llIIIlllIllI[3];
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
        classArray[SquireFightCavesPlugin.llIIIlllIllI[4]] = q.class;
        classArray[SquireFightCavesPlugin.llIIIlllIllI[6]] = s.class;
        classArray[SquireFightCavesPlugin.llIIIlllIllI[7]] = p.class;
        classArray[SquireFightCavesPlugin.llIIIlllIllI[8]] = r.class;
        classArray[SquireFightCavesPlugin.llIIIlllIllI[9]] = o.class;
        classArray[SquireFightCavesPlugin.llIIIlllIllI[10]] = j.class;
        classArray[SquireFightCavesPlugin.llIIIlllIllI[11]] = h.class;
        classArray[SquireFightCavesPlugin.llIIIlllIllI[12]] = i.class;
        classArray[SquireFightCavesPlugin.llIIIlllIllI[13]] = k.class;
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

    private static String llllIlllIIIIIl(String var2, String var7) {
        try {
            SecretKeySpec var3 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var7.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var10 = Cipher.getInstance("Blowfish");
            var10.init(llIIIlllIllI[7], var3);
            return new String(var10.doFinal(Base64.getDecoder().decode(var2.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var9) {
            var9.printStackTrace();
            return null;
        }
    }
}

