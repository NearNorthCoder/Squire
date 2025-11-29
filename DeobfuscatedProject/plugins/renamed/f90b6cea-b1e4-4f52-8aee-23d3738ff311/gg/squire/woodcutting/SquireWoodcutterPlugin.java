/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Provides
 *  gg.squire.client.plugins.SquirePlugin
 *  javax.inject.Inject
 *  net.runelite.api.ChatMessageType
 *  net.runelite.api.Skill
 *  net.runelite.api.TileItem
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.events.ChatMessage
 *  net.runelite.api.events.GameTick
 *  net.runelite.client.config.ConfigManager
 *  net.runelite.client.eventbus.Subscribe
 *  net.runelite.client.plugins.PluginDescriptor
 *  net.runelite.client.ui.overlay.Overlay
 *  net.runelite.client.ui.overlay.OverlayManager
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.events.ExperienceGained
 *  net.unethicalite.api.items.Inventory
 *  org.pf4j.Extension
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package gg.squire.woodcutting;

import com.google.inject.Provides;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.woodcutting.SquireWoodcutterConfig;
import gg.squire.woodcutting.overlay.WCGInfoBox;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.time.Instant;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.ChatMessageType;
import net.runelite.api.Skill;
import net.runelite.api.TileItem;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.events.ChatMessage;
import net.runelite.api.events.GameTick;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayManager;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.events.ExperienceGained;
import net.unethicalite.api.items.Inventory;
import org.pf4j.Extension;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import w.r.e.i.d.r.q.u.e.-.c.u.o.s.o.t.t.AEnum;
import w.r.e.i.d.r.q.u.e.-.c.u.o.s.o.t.t.BankingTask;
import w.r.e.i.d.r.q.u.e.-.c.u.o.s.o.t.t.ChoppingTask;
import w.r.e.i.d.r.q.u.e.-.c.u.o.s.o.t.t.DroppingLogsTask;
import w.r.e.i.d.r.q.u.e.-.c.u.o.s.o.t.t.FletchingLogsTask;
import w.r.e.i.d.r.q.u.e.-.c.u.o.s.o.t.t.PickingUpNestTask;
import w.r.e.i.d.r.q.u.e.-.c.u.o.s.o.t.t.UsingSpecialAttackTask;
import w.r.e.i.d.r.q.u.e.-.c.u.o.s.o.t.t.CheckingStateTask;
import w.r.e.i.d.r.q.u.e.-.c.u.o.s.o.t.t.MovingToNextTreeTask;
import w.r.e.i.d.r.q.u.e.-.c.u.o.s.o.t.t.ChoppingFastTask;
import w.r.e.i.d.r.q.u.e.-.c.u.o.s.o.t.t.TrackingTheTreeTask;
import w.r.e.i.d.r.q.u.e.-.c.u.o.s.o.t.t.WalkingToNextTileTask;

@PluginDescriptor(name="Squire Woodcutter", enabledByDefault=false)
@Extension
public class SquireWoodcutterPlugin
extends SquirePlugin {
    private /* synthetic */ WorldArea l;
    private final /* synthetic */ int[] o;
    private /* synthetic */ boolean m;
    private final /* synthetic */ int[] e;
    @Inject
    private /* synthetic */ OverlayManager i;
    public static /* synthetic */ int b;
    private static /* synthetic */ int[] lIllIIIIIIllI;
    private /* synthetic */ Instant k;
    @Inject
    private /* synthetic */ SquireWoodcutterConfig h;
    @Inject
    private /* synthetic */ WCGInfoBox j;
    private final /* synthetic */ List<Integer> f;
    private final /* synthetic */ int g = 4;
    private static /* synthetic */ String[] lIllIIIIIIlIl;
    private /* synthetic */ int n;
    private static final /* synthetic */ Logger a;
    public static /* synthetic */ int c;
    private final /* synthetic */ WorldArea d;

    public void a(boolean bl) {
        this.m = bl;
    }

    private static boolean llIIIIlllllIlIl(Object object) {
        return object != null;
    }

    private static boolean llIIIIllllllIll(Object object, Object object2) {
        return object == object2;
    }

    protected Class<?>[] tasks() {
        Class[] classArray = new Class[lIllIIIIIIllI[26]];
        classArray[SquireWoodcutterPlugin.lIllIIIIIIllI[4]] = g.class;
        classArray[SquireWoodcutterPlugin.lIllIIIIIIllI[7]] = h.class;
        classArray[SquireWoodcutterPlugin.lIllIIIIIIllI[9]] = j.class;
        classArray[SquireWoodcutterPlugin.lIllIIIIIIllI[11]] = m.class;
        classArray[SquireWoodcutterPlugin.lIllIIIIIIllI[5]] = k.class;
        classArray[SquireWoodcutterPlugin.lIllIIIIIIllI[23]] = l.class;
        classArray[SquireWoodcutterPlugin.lIllIIIIIIllI[24]] = c.class;
        classArray[SquireWoodcutterPlugin.lIllIIIIIIllI[25]] = b.class;
        classArray[SquireWoodcutterPlugin.lIllIIIIIIllI[17]] = f.class;
        classArray[SquireWoodcutterPlugin.lIllIIIIIIllI[27]] = e.class;
        classArray[SquireWoodcutterPlugin.lIllIIIIIIllI[28]] = d.class;
        return classArray;
    }

    private static void llIIIIllllIllIl() {
        lIllIIIIIIlIl = new String[lIllIIIIIIllI[25]];
        SquireWoodcutterPlugin.lIllIIIIIIlIl[SquireWoodcutterPlugin.lIllIIIIIIllI[4]] = SquireWoodcutterPlugin."Squire Woodcutting has been started.";
        SquireWoodcutterPlugin.lIllIIIIIIlIl[SquireWoodcutterPlugin.lIllIIIIIIllI[7]] = SquireWoodcutterPlugin."[SQUIRE] - Woodcutting has been stopped.";
        SquireWoodcutterPlugin.lIllIIIIIIlIl[SquireWoodcutterPlugin.lIllIIIIIIllI[9]] = SquireWoodcutterPlugin."nest";
        SquireWoodcutterPlugin.lIllIIIIIIlIl[SquireWoodcutterPlugin.lIllIIIIIIllI[11]] = SquireWoodcutterPlugin."get some";
        SquireWoodcutterPlugin.lIllIIIIIIlIl[SquireWoodcutterPlugin.lIllIIIIIIllI[5]] = SquireWoodcutterPlugin."nest";
        SquireWoodcutterPlugin.lIllIIIIIIlIl[SquireWoodcutterPlugin.lIllIIIIIIllI[23]] = SquireWoodcutterPlugin."stock";
        SquireWoodcutterPlugin.lIllIIIIIIlIl[SquireWoodcutterPlugin.lIllIIIIIIllI[24]] = SquireWoodcutterPlugin."nest";
    }

    public List<Integer> l() {
        return this.f;
    }

    private static void llIIIIlllllIlII() {
        lIllIIIIIIllI = new int[31];
        SquireWoodcutterPlugin.lIllIIIIIIllI[0] = 0xFFFFCFF2 & 0x3E7F;
        SquireWoodcutterPlugin.lIllIIIIIIllI[1] = -(0xFFFFFF0F & 0x51FB) & (0xFFFFDFFF & Short.MAX_VALUE);
        SquireWoodcutterPlugin.lIllIIIIIIllI[2] = 0x2D ^ 0x3A;
        SquireWoodcutterPlugin.lIllIIIIIIllI[3] = 0x6E ^ 0x63;
        SquireWoodcutterPlugin.lIllIIIIIIllI[4] = (0xE2 ^ 0xA8 ^ (0x7A ^ 0x27)) & (4 + 32 - 8 + 161 ^ 30 + 124 - 113 + 129 ^ -1);
        SquireWoodcutterPlugin.lIllIIIIIIllI[5] = 0x19 ^ 0x1D;
        SquireWoodcutterPlugin.lIllIIIIIIllI[6] = 204 + 69 - 237 + 193 + (0x75 ^ 0x61) - (0x47 ^ 0x1C) + (0x48 ^ 0x13);
        SquireWoodcutterPlugin.lIllIIIIIIllI[7] = 1;
        SquireWoodcutterPlugin.lIllIIIIIIllI[8] = 22 + 184 - 134 + 179;
        SquireWoodcutterPlugin.lIllIIIIIIllI[9] = 2;
        SquireWoodcutterPlugin.lIllIIIIIIllI[10] = 95 + 90 - 75 + 143;
        SquireWoodcutterPlugin.lIllIIIIIIllI[11] = 3;
        SquireWoodcutterPlugin.lIllIIIIIIllI[12] = (0x10 ^ 0x59) + (0x96 ^ 0xAC) - -(0xC0 ^ 0xB4) + (0x63 ^ 0x6B);
        SquireWoodcutterPlugin.lIllIIIIIIllI[13] = (0x6C ^ 0x68) + (0xF0 ^ 0x80) - -(0x4D ^ 0x1E) + ((0x22 ^ 0x15) & ~(0x74 ^ 0x43));
        SquireWoodcutterPlugin.lIllIIIIIIllI[14] = 182 + 149 - 171 + 41;
        SquireWoodcutterPlugin.lIllIIIIIIllI[15] = 12 + 57 - 15 + 149;
        SquireWoodcutterPlugin.lIllIIIIIIllI[16] = 71 + 48 - -15 + 71;
        SquireWoodcutterPlugin.lIllIIIIIIllI[17] = 0xAA ^ 0xA2;
        SquireWoodcutterPlugin.lIllIIIIIIllI[18] = 0xFFFFA3BB & 0x5FF6;
        SquireWoodcutterPlugin.lIllIIIIIIllI[19] = -(0xFFFFFC4B & 0x27F5) & (0xFFFFFDFF & 0x3EFD);
        SquireWoodcutterPlugin.lIllIIIIIIllI[20] = 0xFFFFFCBD & 0x1BFE;
        SquireWoodcutterPlugin.lIllIIIIIIllI[21] = 14 + 232 - 46 + 33;
        SquireWoodcutterPlugin.lIllIIIIIIllI[22] = 0xFFFFC793 & 0x3FFF;
        SquireWoodcutterPlugin.lIllIIIIIIllI[23] = 0xC1 ^ 0xC4;
        SquireWoodcutterPlugin.lIllIIIIIIllI[24] = 0x1D ^ 0x5F ^ (0x15 ^ 0x51);
        SquireWoodcutterPlugin.lIllIIIIIIllI[25] = 0x98 ^ 0x9F;
        SquireWoodcutterPlugin.lIllIIIIIIllI[26] = 0xBF ^ 0xB4;
        SquireWoodcutterPlugin.lIllIIIIIIllI[27] = 0x40 ^ 0x49;
        SquireWoodcutterPlugin.lIllIIIIIIllI[28] = 0x48 ^ 8 ^ (0x58 ^ 0x12);
        SquireWoodcutterPlugin.lIllIIIIIIllI[29] = -(0xFFFFF80B & 0x27FD) & (0xFFFFF4DF & 0x3FA9);
        SquireWoodcutterPlugin.lIllIIIIIIllI[30] = -(0xFFFFF67E & 0x3993) & (0xFFFFBCFD & 0x77F3);
    }

    static {
        SquireWoodcutterPlugin.llIIIIlllllIlII();
        SquireWoodcutterPlugin.llIIIIllllIllIl();
        a = LoggerFactory.getLogger(SquireWoodcutterPlugin.class);
    }

    public void a(int n) {
        this.n = n;
    }

    /*
     * WARNING - void declaration
     */
    public int[] i() {
        SquireWoodcutterPlugin var14;
        int[] nArray = this.o;
        if (SquireWoodcutterPlugin.llIIIIllllllIll((Object)this.h.tree(), (Object)w.r.e.i.d.r.q.u.e.-.c.u.o.s.o.t.t.AEnum.TEAK)) {
            return Arrays.stream(nArray).filter(n -> {
                boolean bl;
                if (SquireWoodcutterPlugin.llIIIIllllllIII(n, lIllIIIIIIllI[19])) {
                    bl = lIllIIIIIIllI[7];
                    0;
                    
                    }
                } else {
                    bl = lIllIIIIIIllI[4];
                }
                return bl;
            }).toArray();
        }
        if (SquireWoodcutterPlugin.llIIIIllllllIll((Object)var14.h.tree(), (Object)w.r.e.i.d.r.q.u.e.-.c.u.o.s.o.t.t.AEnum.MAHOGANY)) {
            void var18;
            return Arrays.stream((int[])var18).filter(n -> {
                boolean bl;
                if (SquireWoodcutterPlugin.llIIIIllllllIII(n, lIllIIIIIIllI[20])) {
                    bl = lIllIIIIIIllI[7];
                    0;
                    if (2 == 0) {
                        return false;
                    }
                } else {
                    bl = lIllIIIIIIllI[4];
                }
                return bl;
            }).toArray();
        }
        return nArray;
    }

    public int m() {
        Objects.requireNonNull(this);
        0;
        return lIllIIIIIIllI[5];
    }

    protected void onStop() {
        this.i.remove((Overlay)this.j);
        0;
        b = lIllIIIIIIllI[4];
        c = lIllIIIIIIllI[4];
        a.info(lIllIIIIIIlIl[lIllIIIIIIllI[7]]);
    }

    private static boolean llIIIIllllllIIl(int n, int n2) {
        return n == n2;
    }

    public boolean p() {
        return this.m;
    }

    public void a(WorldArea worldArea) {
        this.l = worldArea;
    }

    private static boolean llIIIIllllllIII(int n, int n2) {
        return n != n2;
    }

    @Subscribe
    public void a(GameTick gameTick) {
        this.n += lIllIIIIIIllI[7];
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean f() {
        int n;
        block2: {
            block3: {
                int[] nArray = new int[lIllIIIIIIllI[7]];
                nArray[SquireWoodcutterPlugin.lIllIIIIIIllI[4]] = lIllIIIIIIllI[21];
                if (!SquireWoodcutterPlugin.llIIIIlllllIlll(Inventory.contains((int[])nArray) ? 1 : 0)) break block2;
                int[] nArray2 = new int[lIllIIIIIIllI[7]];
                nArray2[SquireWoodcutterPlugin.lIllIIIIIIllI[4]] = lIllIIIIIIllI[22];
                if (!SquireWoodcutterPlugin.llIIIIlllllIlll(Inventory.contains((int[])nArray2) ? 1 : 0)) break block2;
                int[] nArray3 = new int[lIllIIIIIIllI[7]];
                nArray3[SquireWoodcutterPlugin.lIllIIIIIIllI[4]] = lIllIIIIIIllI[6];
                if (!SquireWoodcutterPlugin.llIIIIllllllIlI(Inventory.contains((int[])nArray3) ? 1 : 0)) break block3;
                int[] nArray4 = new int[lIllIIIIIIllI[7]];
                nArray4[SquireWoodcutterPlugin.lIllIIIIIIllI[4]] = lIllIIIIIIllI[8];
                if (!SquireWoodcutterPlugin.llIIIIllllllIlI(Inventory.contains((int[])nArray4) ? 1 : 0)) break block3;
                int[] nArray5 = new int[lIllIIIIIIllI[7]];
                nArray5[SquireWoodcutterPlugin.lIllIIIIIIllI[4]] = lIllIIIIIIllI[12];
                if (!SquireWoodcutterPlugin.llIIIIlllllIlll(Inventory.contains((int[])nArray5) ? 1 : 0)) break block2;
            }
            n = lIllIIIIIIllI[7];
            0;
            if (null == null) return n != 0;
            return ((0xAD ^ 0x97 ^ (0x2E ^ 0x3A)) & (9 ^ 0 ^ (0x9D ^ 0xBA) ^ -1)) != 0;
        }
        n = lIllIIIIIIllI[4];
        return n != 0;
    }

    private static String llIIIIllllIlIlI(String var13, String var6) {
        var13 = new String(Base64.getDecoder().decode(var13.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var8 = new StringBuilder();
        char[] var3 = var6.toCharArray();
        int var2 = lIllIIIIIIllI[4];
        char[] var4 = var13.toCharArray();
        int var22 = var4.length;
        int var23 = lIllIIIIIIllI[4];
        while (SquireWoodcutterPlugin.llIIIIlllllllII(var23, var22)) {
            char var5 = var4[var23];
            var8.append((char)(var5 ^ var3[var2 % var3.length]));
            0;
            ++var2;
            ++var23;
            0;
            
            return null;
        }
        return String.valueOf(var8);
    }

    private static String llIIIIllllIllII(String var11, String var17) {
        try {
            SecretKeySpec var20 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var17.getBytes(StandardCharsets.UTF_8)), lIllIIIIIIllI[17]), "DES");
            Cipher var15 = Cipher.getInstance("DES");
            var15.init(lIllIIIIIIllI[9], var20);
            return new String(var15.doFinal(Base64.getDecoder().decode(var11.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var9) {
            var9.printStackTrace();
            return null;
        }
    }

    public boolean c() {
        boolean bl;
        if (!SquireWoodcutterPlugin.llIIIIllllllIlI(this.h.fastTickChop() ? 1 : 0) || SquireWoodcutterPlugin.llIIIIlllllIlll(this.h.tickChop() ? 1 : 0)) {
            bl = lIllIIIIIIllI[7];
            0;
            if (((0xA0 ^ 0xB6) & ~(0x64 ^ 0x72)) != 0) {
                return false;
            }
        } else {
            bl = lIllIIIIIIllI[4];
        }
        return bl;
    }

    private static boolean llIIIIlllllIlll(int n) {
        return n != 0;
    }

    public int q() {
        return this.n;
    }

    public WorldArea o() {
        return this.l;
    }

    private static boolean llIIIIlllllIllI(Object object, Object object2) {
        return object != object2;
    }

    public boolean g() {
        int n;
        int[] nArray = new int[lIllIIIIIIllI[7]];
        nArray[SquireWoodcutterPlugin.lIllIIIIIIllI[4]] = this.h.tree().s();
        if (SquireWoodcutterPlugin.llIIIIllllllIlI(Inventory.contains((int[])nArray) ? 1 : 0) && SquireWoodcutterPlugin.llIIIIllllllIlI(Inventory.contains(item -> item.getName().toLowerCase().contains(lIllIIIIIIlIl[lIllIIIIIIllI[23]])) ? 1 : 0) && SquireWoodcutterPlugin.llIIIIllllllIlI(Inventory.contains(item -> item.getName().toLowerCase().contains(lIllIIIIIIlIl[lIllIIIIIIllI[5]])) ? 1 : 0) && SquireWoodcutterPlugin.llIIIIlllllIlll(this.c() ? 1 : 0) && SquireWoodcutterPlugin.llIIIIlllllIlll(this.d() ? 1 : 0)) {
            n = lIllIIIIIIllI[7];
            0;
            
            }
        } else {
            n = lIllIIIIIIllI[4];
        }
        return n != 0;
    }

    public WorldArea j() {
        return this.d;
    }

    private static String llIIIIllllIlIll(String var1, String var12) {
        try {
            SecretKeySpec var21 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var12.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var19 = Cipher.getInstance("Blowfish");
            var19.init(lIllIIIIIIllI[9], var21);
            return new String(var19.doFinal(Base64.getDecoder().decode(var1.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var7) {
            var7.printStackTrace();
            return null;
        }
    }

    public void h() {
        int n;
        SquireWoodcutterPlugin var24;
        if (SquireWoodcutterPlugin.llIIIIlllllIlll(Inventory.contains((int[])this.e) ? 1 : 0)) {
            int[] nArray = new int[lIllIIIIIIllI[7]];
            nArray[SquireWoodcutterPlugin.lIllIIIIIIllI[4]] = lIllIIIIIIllI[22];
            Inventory.getFirst((int[])this.e).useOn(Inventory.getFirst((int[])nArray));
        }
        if (SquireWoodcutterPlugin.llIIIIlllllIlll(var24.h.tree().equals((Object)w.r.e.i.d.r.q.u.e.-.c.u.o.s.o.t.t.AEnum.MAHOGANY) ? 1 : 0)) {
            n = lIllIIIIIIllI[19];
            0;
            if (-(28 + 99 - 66 + 135 ^ 110 + 55 - 157 + 184) > 0) {
                return;
            }
        } else {
            n = lIllIIIIIIllI[20];
        }
        int var10 = n;
        int[] nArray = new int[lIllIIIIIIllI[7]];
        nArray[SquireWoodcutterPlugin.lIllIIIIIIllI[4]] = lIllIIIIIIllI[18];
        if (SquireWoodcutterPlugin.llIIIIlllllIlll(Inventory.contains((int[])nArray) ? 1 : 0)) {
            int[] nArray2 = new int[lIllIIIIIIllI[7]];
            nArray2[SquireWoodcutterPlugin.lIllIIIIIIllI[4]] = lIllIIIIIIllI[18];
            int[] nArray3 = new int[lIllIIIIIIllI[7]];
            nArray3[SquireWoodcutterPlugin.lIllIIIIIIllI[4]] = var10;
            Inventory.getFirst((int[])nArray2).useOn(Inventory.getFirst((int[])nArray3));
        }
    }

    public Instant getStarted() {
        return this.k;
    }

    public SquireWoodcutterPlugin() {
        this.d = new WorldArea(lIllIIIIIIllI[0], lIllIIIIIIllI[1], lIllIIIIIIllI[2], lIllIIIIIIllI[3], lIllIIIIIIllI[4]);
        int[] nArray = new int[lIllIIIIIIllI[5]];
        nArray[SquireWoodcutterPlugin.lIllIIIIIIllI[4]] = lIllIIIIIIllI[6];
        nArray[SquireWoodcutterPlugin.lIllIIIIIIllI[7]] = lIllIIIIIIllI[8];
        nArray[SquireWoodcutterPlugin.lIllIIIIIIllI[9]] = lIllIIIIIIllI[10];
        nArray[SquireWoodcutterPlugin.lIllIIIIIIllI[11]] = lIllIIIIIIllI[12];
        this.e = nArray;
        this.f = List.of(Integer.valueOf(lIllIIIIIIllI[13]), Integer.valueOf(lIllIIIIIIllI[14]), Integer.valueOf(lIllIIIIIIllI[15]), Integer.valueOf(lIllIIIIIIllI[16]));
        this.g = lIllIIIIIIllI[5];
        this.m = lIllIIIIIIllI[4];
        this.n = lIllIIIIIIllI[4];
        int[] nArray2 = new int[lIllIIIIIIllI[17]];
        nArray2[SquireWoodcutterPlugin.lIllIIIIIIllI[4]] = lIllIIIIIIllI[18];
        nArray2[SquireWoodcutterPlugin.lIllIIIIIIllI[7]] = lIllIIIIIIllI[19];
        nArray2[SquireWoodcutterPlugin.lIllIIIIIIllI[9]] = lIllIIIIIIllI[20];
        nArray2[SquireWoodcutterPlugin.lIllIIIIIIllI[11]] = lIllIIIIIIllI[21];
        nArray2[SquireWoodcutterPlugin.lIllIIIIIIllI[5]] = lIllIIIIIIllI[22];
        nArray2[SquireWoodcutterPlugin.lIllIIIIIIllI[23]] = lIllIIIIIIllI[6];
        nArray2[SquireWoodcutterPlugin.lIllIIIIIIllI[24]] = lIllIIIIIIllI[8];
        nArray2[SquireWoodcutterPlugin.lIllIIIIIIllI[25]] = lIllIIIIIIllI[12];
        this.o = nArray2;
    }

    public boolean b() {
        boolean bl;
        if (!SquireWoodcutterPlugin.llIIIIllllllIII(Players.getLocal().getAnimation(), lIllIIIIIIllI[29]) || SquireWoodcutterPlugin.llIIIIllllllIIl(Players.getLocal().getAnimation(), lIllIIIIIIllI[30])) {
            bl = lIllIIIIIIllI[7];
            0;
            if (((0x2D ^ 0x1E) & ~(0xB4 ^ 0x87)) != 0) {
                return false;
            }
        } else {
            bl = lIllIIIIIIllI[4];
        }
        return bl;
    }

    @Provides
    SquireWoodcutterConfig a(ConfigManager configManager) {
        return (SquireWoodcutterConfig)configManager.getConfig(SquireWoodcutterConfig.class);
    }

    public boolean d() {
        boolean bl;
        if (!SquireWoodcutterPlugin.llIIIIllllllIlI(this.e() ? 1 : 0) || SquireWoodcutterPlugin.llIIIIlllllIlll(this.f() ? 1 : 0)) {
            bl = lIllIIIIIIllI[7];
            0;
            if (3 <= -1) {
                return false;
            }
        } else {
            bl = lIllIIIIIIllI[4];
        }
        return bl;
    }

    public int[] k() {
        return this.e;
    }

    private boolean e() {
        boolean bl;
        a a2 = this.h.tree();
        int[] nArray = new int[lIllIIIIIIllI[7]];
        nArray[SquireWoodcutterPlugin.lIllIIIIIIllI[4]] = lIllIIIIIIllI[18];
        if (SquireWoodcutterPlugin.llIIIIlllllIlll(Inventory.contains((int[])nArray) ? 1 : 0) && SquireWoodcutterPlugin.llIIIIllllllIll((Object)a2, (Object)w.r.e.i.d.r.q.u.e.-.c.u.o.s.o.t.t.AEnum.TEAK)) {
            int[] nArray2 = new int[lIllIIIIIIllI[7]];
            nArray2[SquireWoodcutterPlugin.lIllIIIIIIllI[4]] = lIllIIIIIIllI[20];
            bl = Inventory.contains((int[])nArray2);
            0;
            if (2 < -1) {
                return ((0 + 44 - -55 + 71 ^ 152 + 158 - 189 + 62) & (0x20 ^ 0x37 ^ (0x6C ^ 0x66) ^ -1)) != 0;
            }
        } else {
            int[] nArray3 = new int[lIllIIIIIIllI[7]];
            nArray3[SquireWoodcutterPlugin.lIllIIIIIIllI[4]] = lIllIIIIIIllI[19];
            bl = Inventory.contains((int[])nArray3);
        }
        return bl;
    }

    @Subscribe
    public void a(ExperienceGained experienceGained) {
        if (SquireWoodcutterPlugin.llIIIIllllllIll(experienceGained.getSkill(), Skill.WOODCUTTING)) {
            this.n = lIllIIIIIIllI[4];
        }
    }

    protected void onStart() {
        this.i.add((Overlay)this.j);
        0;
        this.k = Instant.now();
        a.info(lIllIIIIIIlIl[lIllIIIIIIllI[4]]);
        if (SquireWoodcutterPlugin.llIIIIlllllIlIl(Players.getLocal())) {
            this.a(Players.getLocal().getWorldArea());
        }
    }

    public boolean a() {
        boolean bl;
        TileItem tileItem2 = TileItems.getNearest(tileItem -> tileItem.getName().toLowerCase().contains(lIllIIIIIIlIl[lIllIIIIIIllI[24]]));
        if (SquireWoodcutterPlugin.llIIIIlllllIlIl(tileItem2)) {
            bl = lIllIIIIIIllI[7];
            0;
            if (-3 > 0) {
                return ((163 + 15 - -22 + 27 ^ 128 + 53 - 12 + 22) & (0xFF ^ 0x8D ^ (0xB9 ^ 0x97) ^ -1)) != 0;
            }
        } else {
            bl = lIllIIIIIIllI[4];
        }
        return bl;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(ChatMessage chatMessage) {
        void var16;
        if (SquireWoodcutterPlugin.llIIIIlllllIllI(chatMessage.getType(), ChatMessageType.GAMEMESSAGE) && SquireWoodcutterPlugin.llIIIIlllllIllI(chatMessage.getType(), ChatMessageType.SPAM)) {
            return;
        }
        if (SquireWoodcutterPlugin.llIIIIlllllIlll(var16.getMessage().contains(lIllIIIIIIlIl[lIllIIIIIIllI[9]]) ? 1 : 0)) {
            c += lIllIIIIIIllI[7];
        }
        if (SquireWoodcutterPlugin.llIIIIlllllIlll(var16.getMessage().contains(lIllIIIIIIlIl[lIllIIIIIIllI[11]]) ? 1 : 0)) {
            b += lIllIIIIIIllI[7];
        }
    }

    private static boolean llIIIIllllllIlI(int n) {
        return n == 0;
    }

    public SquireWoodcutterConfig n() {
        return this.h;
    }

    private static boolean llIIIIlllllllII(int n, int n2) {
        return n < n2;
    }
}

