/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.inject.Singleton
 *  net.runelite.api.GameState
 *  net.runelite.api.NPC
 *  net.runelite.api.events.GameStateChanged
 *  net.runelite.api.events.WidgetLoaded
 *  net.runelite.api.widgets.Widget
 *  net.runelite.client.eventbus.Subscribe
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.widgets.Widgets
 *  net.unethicalite.client.Static
 */
package q.-.t.a.o.u.i.-.o.u.t.e.s.a.r;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Singleton;
import net.runelite.api.GameState;
import net.runelite.api.NPC;
import net.runelite.api.events.GameStateChanged;
import net.runelite.api.events.WidgetLoaded;
import net.runelite.api.widgets.Widget;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.widgets.Widgets;
import net.unethicalite.client.Static;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.EEnum;

@Singleton
public class C_Unknown {
    private static final /* synthetic */ int bc;
    private static final /* synthetic */ int bb;
    private static /* synthetic */ int[] llIIllIIIIl;
    private final /* synthetic */ Map<e, Integer> bd;
    private /* synthetic */ int be;
    private /* synthetic */ int bf;
    private static /* synthetic */ String[] llIIllIIIII;

    private static boolean lIlIIIIlllllll(int n2) {
        return n2 == 0;
    }

    private static boolean lIlIIIlIIIIIlI(int n2) {
        return n2 > 0;
    }

    /*
     * WARNING - void declaration
     */
    public boolean j(int n2) {
        void var1;
        int[] nArray = Static.getClient().getMapRegions();
        int n3 = nArray.length;
        int var41 = llIIllIIIIl[2];
        while (C.lIlIIIIlllllIl(var41, (int)var1)) {
            void var17;
            void var16;
            void var21 = var16[var41];
            if (C.lIlIIIlIIIIIII((int)var21, (int)var17)) {
                return llIIllIIIIl[1];
            }
            ++var41;
            0;
            
            return ((81 + 29 - 93 + 113 ^ 102 + 84 - 110 + 67) & (0xB7 ^ 0x99 ^ (0xA6 ^ 0x85) ^ -1)) != 0;
        }
        return llIIllIIIIl[2];
    }

    private static boolean lIlIIIlIIIIIll(Object object) {
        return object == null;
    }

    public boolean al() {
        boolean bl2;
        if (C.lIlIIIIllllIll(Static.getClient().getTickCount() - this.be, llIIllIIIIl[0])) {
            bl2 = llIIllIIIIl[1];
            0;
            if (((0x33 ^ 0x75 ^ (4 ^ 0x7D)) & (0xF2 ^ 0xB0 ^ (0x74 ^ 9) ^ -1)) < 0) {
                return ((60 + 35 - 85 + 133 ^ 49 + 93 - 98 + 102) & (0xDB ^ 0x87 ^ (0x83 ^ 0xC2) ^ -1)) != 0;
            }
        } else {
            bl2 = llIIllIIIIl[2];
        }
        return bl2;
    }

    private static boolean lIlIIIIlllllIl(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * WARNING - void declaration
     */
    public void a(e e2) {
        void var15;
        Widget widget = this.at();
        if (!C.lIlIIIIlllllII(widget) || C.lIlIIIlIIIIIll(widget.getChildren())) {
            return;
        }
        Widget[] var30 = var15.getChildren();
        int var10 = var30.length;
        int var7 = llIIllIIIIl[2];
        while (C.lIlIIIIlllllIl(var7, var10)) {
            void var25;
            Widget var26 = var30[var7];
            if (C.lIlIIIIllllllI(var25.p().contains(var26.getItemId()) ? 1 : 0)) {
                if (C.lIlIIIlIIIIIII(var26.getItemId(), llIIllIIIIl[10])) {
                    0;
                    if (2 == 1) {
                        return;
                    }
                } else {
                    C var6;
                    var6.bd.put((e)var25, var6.bd.getOrDefault(var25, llIIllIIIIl[2]) - llIIllIIIIl[1]);
                    0;
                    if (C.lIlIIIlIIIIlII(var6.bd.get(var25))) {
                        var6.bd.remove(var25);
                        0;
                    }
                    var26.interact(llIIllIIIII[llIIllIIIIl[2]]);
                    return;
                }
            }
            ++var7;
            0;
            if (1 != (7 + 67 - 17 + 130 ^ 120 + 15 - 35 + 91)) continue;
            return;
        }
    }

    public boolean am() {
        int n2;
        if (C.lIlIIIIllllIll(Static.getClient().getTickCount() - this.bf, llIIllIIIIl[0]) && C.lIlIIIIllllIll(Static.getClient().getTickCount() - this.be, llIIllIIIIl[0])) {
            n2 = llIIllIIIIl[1];
            0;
            if (-(0xB ^ 0xF) >= 0) {
                return false;
            }
        } else {
            n2 = llIIllIIIIl[2];
        }
        return n2 != 0;
    }

    public Widget at() {
        return Widgets.get((int)llIIllIIIIl[11], (int)llIIllIIIIl[12]);
    }

    public boolean au() {
        return Widgets.isVisible((Widget)this.at());
    }

    private static void lIlIIIIllllIIl() {
        llIIllIIIII = new String[llIIllIIIIl[13]];
        C.llIIllIIIII[C.llIIllIIIIl[2]] = C."Withdraw-1";
        C.llIIllIIIII[C.llIIllIIIIl[1]] = C."Obelisk";
    }

    public Map<e, Integer> av() {
        return this.bd;
    }

    /*
     * WARNING - void declaration
     */
    public boolean ap() {
        boolean bl2;
        int var4;
        int n2;
        void var20;
        C var38;
        List list = NPCs.getAll(nPC -> {
            boolean bl2;
            if (C.lIlIIIlIIIIlIl(nPC.getInteracting(), Players.getLocal())) {
                bl2 = llIIllIIIIl[1];
                0;
                if (1 < 1) {
                    return ((0x7F ^ 0x59 ^ (0x48 ^ 0xC)) & (42 + 189 - 182 + 151 ^ 144 + 80 - 202 + 148 ^ -1)) != 0;
                }
            } else {
                bl2 = llIIllIIIIl[2];
            }
            return bl2;
        });
        NPC nPC2 = NPCs.getNearest(nPC -> nPC.getName().contains(llIIllIIIII[llIIllIIIIl[1]]));
        if (C.lIlIIIIlllllII(nPC2)) {
            boolean bl3;
            if (C.lIlIIIIlllllIl(Combat.getCurrentHealth(), llIIllIIIIl[3])) {
                bl3 = llIIllIIIIl[1];
                0;
                if (2 != 2) {
                    return ((0xD9 ^ 0xA1 ^ (0xA ^ 0x22)) & (0x73 ^ 0x75 ^ (0x62 ^ 0x34) ^ -1)) != 0;
                }
            } else {
                bl3 = llIIllIIIIl[2];
            }
            return bl3;
        }
        if (C.lIlIIIIllllllI(var38.aq() ? 1 : 0)) {
            boolean bl4;
            if (C.lIlIIIIlllllIl(Combat.getCurrentHealth(), llIIllIIIIl[4])) {
                bl4 = llIIllIIIIl[1];
                0;
                if (-2 > 0) {
                    return ((0x49 ^ 0x59 ^ (0x10 ^ 0x4D)) & (220 + 73 - 194 + 127 ^ 30 + 128 - 155 + 172 ^ -1)) != 0;
                }
            } else {
                bl4 = llIIllIIIIl[2];
            }
            return bl4;
        }
        if (C.lIlIIIIllllllI(var20.isEmpty() ? 1 : 0)) {
            n2 = llIIllIIIIl[5];
            0;
            if (-1 >= 0) {
                return false;
            }
        } else {
            n2 = var4 = llIIllIIIIl[6];
        }
        if (C.lIlIIIIlllllIl(Combat.getCurrentHealth(), var4)) {
            bl2 = llIIllIIIIl[1];
            0;
            if (1 <= ((0x7C ^ 0x65) & ~(0x7E ^ 0x67))) {
                return false;
            }
        } else {
            bl2 = llIIllIIIIl[2];
        }
        return bl2;
    }

    public void ao() {
        this.bf = Static.getClient().getTickCount();
    }

    public boolean as() {
        boolean bl2;
        if (C.lIlIIIlIIIIIlI(Static.getClient().getTickCount() - this.bf)) {
            bl2 = llIIllIIIIl[1];
            0;
            if (-(0x1A ^ 0x1E) >= 0) {
                return false;
            }
        } else {
            bl2 = llIIllIIIIl[2];
        }
        return bl2;
    }

    private static String lIlIIIIlllIlll(String var14, String var31) {
        try {
            SecretKeySpec var2 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var31.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var40 = Cipher.getInstance("Blowfish");
            var40.init(llIIllIIIIl[13], var2);
            return new String(var40.doFinal(Base64.getDecoder().decode(var14.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var22) {
            var22.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIIIIllllllI(int n2) {
        return n2 != 0;
    }

    public C() {
        this.bd = new HashMap<e, Integer>();
    }

    public void an() {
        this.be = Static.getClient().getTickCount();
    }

    static {
        C.lIlIIIIllllIlI();
        C.lIlIIIIllllIIl();
        bb = llIIllIIIIl[11];
        bc = llIIllIIIIl[12];
    }

    private static boolean lIlIIIIllllIll(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIlIIIIlllllII(Object object) {
        return object != null;
    }

    @Subscribe
    public void a(GameStateChanged gameStateChanged) {
        if (C.lIlIIIlIIIIlIl(gameStateChanged.getGameState(), GameState.LOGGED_IN) && C.lIlIIIIlllllll(Static.getClient().isInInstancedRegion() ? 1 : 0)) {
            this.bd.clear();
        }
    }

    private static void lIlIIIIllllIlI() {
        llIIllIIIIl = new int[15];
        C.llIIllIIIIl[0] = 0xB7 ^ 0xB3;
        C.llIIllIIIIl[1] = 1;
        C.llIIllIIIIl[2] = (46 + 9 - -191 + 0 ^ 105 + 166 - 259 + 172) & (192 + 203 - 169 + 15 ^ 112 + 49 - 60 + 90 ^ -1);
        C.llIIllIIIIl[3] = 0xD ^ 0x40 ^ 77 + 84 - 89 + 55;
        C.llIIllIIIIl[4] = 0x3B ^ 0x7D;
        C.llIIllIIIIl[5] = 0xBB ^ 0xA5;
        C.llIIllIIIIl[6] = 0x42 ^ 0x6A;
        C.llIIllIIIIl[7] = 0xFFFFBFFA & 0x7D55;
        C.llIIllIIIIl[8] = 0xFFFFFB54 & 0x3FFB;
        C.llIIllIIIIl[9] = 0xB6 ^ 0x95;
        C.llIIllIIIIl[10] = -1;
        C.llIIllIIIIl[11] = -(0xFFFFD0AB & 0x7FD5) & (0xFFFFD7EB & 0x7B9E);
        C.llIIllIIIIl[12] = 167 + 123 - 108 + 1 ^ 134 + 61 - 87 + 70;
        C.llIIllIIIIl[13] = 2;
        C.llIIllIIIIl[14] = 0x65 ^ 0x6D;
    }

    private static String lIlIIIIllllIII(String var5, String var29) {
        try {
            SecretKeySpec var39 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var29.getBytes(StandardCharsets.UTF_8)), llIIllIIIIl[14]), "DES");
            Cipher var28 = Cipher.getInstance("DES");
            var28.init(llIIllIIIIl[13], var39);
            return new String(var28.doFinal(Base64.getDecoder().decode(var5.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var27) {
            var27.printStackTrace();
            return null;
        }
    }

    public boolean aq() {
        boolean bl2;
        if (!C.lIlIIIIlllllll(this.j(llIIllIIIIl[7]) ? 1 : 0) || C.lIlIIIIllllllI(this.j(llIIllIIIIl[8]) ? 1 : 0)) {
            bl2 = llIIllIIIIl[1];
            0;
            if ((0x8E ^ 0x8A) < 0) {
                return ((0x21 ^ 0x6C) & ~(0x6A ^ 0x27) & ~((0x41 ^ 6) & ~(0xD4 ^ 0x93))) != 0;
            }
        } else {
            bl2 = llIIllIIIIl[2];
        }
        return bl2;
    }

    /*
     * WARNING - void declaration
     */
    public void a(Widget widget) {
        void var23;
        if (!C.lIlIIIIlllllII(widget) || C.lIlIIIlIIIIIll(widget.getChildren())) {
            return;
        }
        Widget[] var9 = var23.getChildren();
        int var34 = var9.length;
        int var3 = llIIllIIIIl[2];
        while (C.lIlIIIIlllllIl(var3, var34)) {
            Widget var32 = var9[var3];
            int var18 = var32.getItemId();
            if (C.lIlIIIlIIIIIII(var18, llIIllIIIIl[10])) {
                0;
                if (-2 > 0) {
                    return;
                }
            } else {
                C var11;
                e var12 = e.c(var18);
                int var8 = var11.bd.getOrDefault((Object)var12, llIIllIIIIl[2]);
                var11.bd.put(var12, var8 + var32.getItemQuantity());
                0;
            }
            ++var3;
            0;
            if (1 != 0) continue;
            return;
        }
    }

    private static boolean lIlIIIlIIIIIIl(int n2, int n3) {
        return n2 <= n3;
    }

    public boolean ar() {
        boolean bl2;
        if (C.lIlIIIlIIIIIIl(Combat.getCurrentHealth(), llIIllIIIIl[9])) {
            bl2 = llIIllIIIIl[1];
            0;
            if (((0x67 ^ 0x52 ^ (0x8B ^ 0xB9)) & (102 + 75 - 165 + 119 ^ 108 + 95 - 180 + 109 ^ -1)) > 1) {
                return ((96 + 88 - 152 + 114 ^ 62 + 38 - 56 + 87) & (0x4D ^ 2 ^ (0xFA ^ 0xA4) ^ -1)) != 0;
            }
        } else {
            bl2 = llIIllIIIIl[2];
        }
        return bl2;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(WidgetLoaded widgetLoaded) {
        if (C.lIlIIIlIIIIIII(widgetLoaded.getGroupId(), llIIllIIIIl[11])) {
            void var35;
            C var33;
            Widget widget = this.at();
            if (!C.lIlIIIIlllllII(widget) || C.lIlIIIlIIIIIll(widget.getChildren())) {
                return;
            }
            var33.bd.clear();
            Widget[] var42 = var35.getChildren();
            int var19 = var42.length;
            int var13 = llIIllIIIIl[2];
            while (C.lIlIIIIlllllIl(var13, var19)) {
                Widget var24 = var42[var13];
                if (C.lIlIIIlIIIIIII(var24.getItemId(), llIIllIIIIl[10])) {
                    0;
                    if (3 <= 0) {
                        return;
                    }
                } else {
                    e var36 = e.c(var24.getItemId());
                    int var37 = var33.bd.getOrDefault((Object)var36, llIIllIIIIl[2]);
                    var33.bd.put(var36, var37 + var24.getItemQuantity());
                    0;
                }
                ++var13;
                0;
                if (((0xC9 ^ 0xA5 ^ (0x23 ^ 0x53)) & (0xB9 ^ 0xC3 ^ (0x33 ^ 0x55) ^ -1)) == 0) continue;
                return;
            }
        }
    }

    private static boolean lIlIIIlIIIIlII(int n2) {
        return n2 <= 0;
    }

    private static boolean lIlIIIlIIIIlIl(Object object, Object object2) {
        return object == object2;
    }

    private static boolean lIlIIIlIIIIIII(int n2, int n3) {
        return n2 == n3;
    }
}

