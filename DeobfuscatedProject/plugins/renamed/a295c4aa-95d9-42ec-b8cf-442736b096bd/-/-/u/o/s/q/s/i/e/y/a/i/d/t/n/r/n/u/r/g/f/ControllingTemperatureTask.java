/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.movement.Movement
 */
package -.-.u.o.s.q.s.i.e.y.a.i.d.t.n.r.n.u.r.g.f;

import -.-.u.o.s.q.s.i.e.y.a.i.d.t.n.r.n.u.r.g.f.a_Unknown;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.giantsfoundry.SquireGiantsFoundry;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Movement;

/* TASK: Controlling Temperature -> ControllingtemperatureTask */
@TaskDesc(name="Controlling Temperature", priority=2147483297, blocking=true)
public class ControllingTemperatureTask
extends Task {
    private static /* synthetic */ int[] llIlIllIIlIl;
    public static final /* synthetic */ int ag;
    private static final /* synthetic */ int ak;
    private static /* synthetic */ String[] llIlIllIIlII;
    private final /* synthetic */ SquireGiantsFoundry af;
    private static final /* synthetic */ int al;
    private static final /* synthetic */ int ah;
    private static final /* synthetic */ int ai;
    private static final /* synthetic */ int aj;
    private /* synthetic */ boolean ao;
    private /* synthetic */ TileObject an;
    private final /* synthetic */ a am;

    /*
     * WARNING - void declaration
     */
    protected boolean a(TileObject tileObject) {
        boolean bl;
        void var2;
        void var15;
        WorldPoint worldPoint = Movement.getDestination();
        if (!p.lIIIIIlllIIllIl(worldPoint) || p.lIIIIIlllIIlIlI(Players.getLocal().isMoving() ? 1 : 0)) {
            return llIlIllIIlIl[0];
        }
        WorldArea var5 = var15.getWorldLocation().toWorldArea();
        if (!p.lIIIIIlllIIlIlI(var5.contains((WorldPoint)var2) ? 1 : 0) || p.lIIIIIlllIIlIIl(var5.isInMeleeDistance((WorldPoint)var2) ? 1 : 0)) {
            bl = llIlIllIIlIl[3];
            0;
            if (-2 > 0) {
                return false;
            }
        } else {
            bl = llIlIllIIlIl[0];
        }
        return bl;
    }

    private static void lIIIIIlllIIlIII() {
        llIlIllIIlIl = new int[13];
        p.llIlIllIIlIl[0] = (0x33 ^ 2) & ~(0x91 ^ 0xA0);
        p.llIlIllIIlIl[1] = -1;
        p.llIlIllIIlIl[2] = 0x44 ^ 0x41;
        p.llIlIllIIlIl[3] = 1;
        p.llIlIllIIlIl[4] = 0xFFFFBE7C & 0xEFDB;
        p.llIlIllIIlIl[5] = 0x82 ^ 0x96;
        p.llIlIllIIlIl[6] = -(0xFFFFD479 & 0x7BAF) & (0xFFFFFEFF & 0xFF7F);
        p.llIlIllIIlIl[7] = 0xB4 ^ 0xAD;
        p.llIlIllIIlIl[8] = 2;
        p.llIlIllIIlIl[9] = 3;
        p.llIlIllIIlIl[10] = -(0xFFFFCDCF & 0x7E71) & (0xFFFFCF7F & 0x7FFB);
        p.llIlIllIIlIl[11] = 0xFFFFEBC5 & 0x177A;
        p.llIlIllIIlIl[12] = 0xE8 ^ 0xA2 ^ (0xF7 ^ 0xB9);
    }

    private static boolean lIIIIIlllIIlllI(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean lIIIIIlllIIlIIl(int n2) {
        return n2 != 0;
    }

    private static boolean lIIIIIlllIIllIl(Object object) {
        return object != null;
    }

    private static String lIIIIIlllIIIllI(String var10, String var16) {
        try {
            SecretKeySpec var3 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var16.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var20 = Cipher.getInstance("Blowfish");
            var20.init(llIlIllIIlIl[8], var3);
            return new String(var20.doFinal(Base64.getDecoder().decode(var10.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var6) {
            var6.printStackTrace();
            return null;
        }
    }

    @Inject
    public p(SquireGiantsFoundry squireGiantsFoundry, a a2) {
        this.af = squireGiantsFoundry;
        this.am = a2;
    }

    static {
        p.lIIIIIlllIIlIII();
        p.lIIIIIlllIIIlll();
        ag = llIlIllIIlIl[5];
        ak = llIlIllIIlIl[10];
        ah = llIlIllIIlIl[6];
        ai = llIlIllIIlIl[4];
        al = llIlIllIIlIl[7];
        aj = llIlIllIIlIl[11];
    }

    private static String lIIIIIlllIIIlIl(String var24, String var17) {
        var24 = new String(Base64.getDecoder().decode(var24.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var26 = new StringBuilder();
        char[] var23 = var17.toCharArray();
        int var21 = llIlIllIIlIl[0];
        char[] var8 = var24.toCharArray();
        int var25 = var8.length;
        int var18 = llIlIllIIlIl[0];
        while (p.lIIIIIlllIIllll(var18, var25)) {
            char var22 = var8[var18];
            var26.append((char)(var22 ^ var23[var21 % var23.length]));
            0;
            ++var21;
            ++var18;
            0;
            if ((0x14 ^ 0x11) != 0) continue;
            return null;
        }
        return String.valueOf(var26);
    }

    public boolean run() {
        boolean bl;
        p var11;
        if (p.lIIIIIlllIIlIIl(this.af.c() ? 1 : 0)) {
            return llIlIllIIlIl[0];
        }
        if (p.lIIIIIlllIIlIlI(var11.am.f() ? 1 : 0)) {
            return llIlIllIIlIl[0];
        }
        if (p.lIIIIIlllIIlIll(var11.am.m(), llIlIllIIlIl[1])) {
            return llIlIllIIlIl[0];
        }
        if (p.lIIIIIlllIIllII(var11.an) && p.lIIIIIlllIIlIIl(var11.am.n() ? 1 : 0)) {
            return llIlIllIIlIl[0];
        }
        int var27 = var11.am.m();
        int var12 = var11.am.l();
        if (p.lIIIIIlllIIllIl(var11.an) && p.lIIIIIlllIIlllI(Math.abs(var27 - var12), llIlIllIIlIl[2]) && p.lIIIIIlllIIlIIl(var11.am.n() ? 1 : 0)) {
            var11.an = null;
            var11.ao = llIlIllIIlIl[0];
            Movement.setDestination((WorldPoint)Players.getLocal().getWorldLocation());
            return llIlIllIIlIl[3];
        }
        if (p.lIIIIIlllIIllIl(var11.an) && p.lIIIIIlllIIlIIl(var11.a(var11.an) ? 1 : 0)) {
            return llIlIllIIlIl[3];
        }
        int var14 = llIlIllIIlIl[0];
        if (p.lIIIIIlllIIllll(var12, var27)) {
            var14 = var11.b(var12, var27) ? 1 : 0;
            0;
            if (2 > 2) {
                return false;
            }
        } else {
            bl = var11.a(var12, var27);
        }
        return bl;
    }

    private static boolean lIIIIIlllIlIIIl(Object object, Object object2) {
        return object == object2;
    }

    /*
     * WARNING - void declaration
     */
    private boolean a(int n2, int n3) {
        int n4;
        String string;
        void var7;
        int n5;
        void var1;
        p var19;
        int n6 = n2 - n3;
        int[] nArray = new int[llIlIllIIlIl[3]];
        nArray[p.llIlIllIIlIl[0]] = llIlIllIIlIl[4];
        TileObject tileObject = TileObjects.getNearest((int[])nArray);
        if (p.lIIIIIlllIIllII(tileObject)) {
            return llIlIllIIlIl[0];
        }
        int n7 = var19.ao;
        if (p.lIIIIIlllIlIIII((int)var1, llIlIllIIlIl[5])) {
            n5 = llIlIllIIlIl[3];
            0;
            if (((147 + 154 - 215 + 139 ^ 3 + 130 - 118 + 176) & (0x7E ^ 0x5D ^ (0x67 ^ 0x1A) ^ -1)) > 0) {
                return ((0xA ^ 0x5A ^ (0x1D ^ 0x57)) & (104 + 157 - 208 + 116 ^ 22 + 18 - -75 + 64 ^ -1)) != 0;
            }
        } else {
            n5 = llIlIllIIlIl[0];
        }
        if (p.lIIIIIlllIIlIll(n7, n5) && p.lIIIIIlllIlIIIl(var19.an, var7)) {
            return llIlIllIIlIl[3];
        }
        if (p.lIIIIIlllIlIIII((int)var1, llIlIllIIlIl[5])) {
            string = llIlIllIIlII[llIlIllIIlIl[0]];
            0;
            
            }
        } else {
            string = llIlIllIIlII[llIlIllIIlIl[3]];
        }
        var7.interact(string);
        var19.an = var7;
        if (p.lIIIIIlllIlIIII((int)var1, llIlIllIIlIl[5])) {
            n4 = llIlIllIIlIl[3];
            0;
            if (3 != 3) {
                return ((0x4C ^ 0x79 ^ (0x48 ^ 0x27)) & (124 + 233 - 146 + 34 ^ 57 + 160 - 117 + 75 ^ -1)) != 0;
            }
        } else {
            n4 = llIlIllIIlIl[0];
        }
        var19.ao = n4;
        return llIlIllIIlIl[3];
    }

    private static boolean lIIIIIlllIIllll(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * WARNING - void declaration
     */
    private boolean b(int n2, int n3) {
        String string;
        int n4;
        void var13;
        int n5;
        void var4;
        p var9;
        int n6 = n3 - n2;
        int[] nArray = new int[llIlIllIIlIl[3]];
        nArray[p.llIlIllIIlIl[0]] = llIlIllIIlIl[6];
        TileObject tileObject = TileObjects.getNearest((int[])nArray);
        if (p.lIIIIIlllIIllII(tileObject)) {
            return llIlIllIIlIl[0];
        }
        int n7 = var9.ao;
        if (p.lIIIIIlllIlIIII((int)var4, llIlIllIIlIl[7])) {
            n5 = llIlIllIIlIl[3];
            0;
            if (2 <= 0) {
                return (2 & ~2) != 0;
            }
        } else {
            n5 = llIlIllIIlIl[0];
        }
        if (p.lIIIIIlllIIlIll(n7, n5) && p.lIIIIIlllIlIIIl(var9.an, var13)) {
            return llIlIllIIlIl[3];
        }
        if (p.lIIIIIlllIlIIII((int)var4, llIlIllIIlIl[7])) {
            n4 = llIlIllIIlIl[3];
            0;
            if (((0xB2 ^ 0xAA) & ~(0xAE ^ 0xB6)) != ((0x74 ^ 0x34) & ~(0x61 ^ 0x21))) {
                return false;
            }
        } else {
            var9.ao = llIlIllIIlIl[0];
            n4 = var9.ao ? 1 : 0;
        }
        if (p.lIIIIIlllIlIIII((int)var4, llIlIllIIlIl[7])) {
            string = llIlIllIIlII[llIlIllIIlIl[8]];
            0;
            
            }
        } else {
            string = llIlIllIIlII[llIlIllIIlIl[9]];
        }
        var13.interact(string);
        this.an = tileObject;
        return llIlIllIIlIl[3];
    }

    private static boolean lIIIIIlllIIlIlI(int n2) {
        return n2 == 0;
    }

    private static void lIIIIIlllIIIlll() {
        llIlIllIIlII = new String[llIlIllIIlIl[12]];
        p.llIlIllIIlII[p.llIlIllIIlIl[0]] = p."Quench-preform";
        p.llIlIllIIlII[p.llIlIllIIlIl[3]] = p."Cool-preform";
        p.llIlIllIIlII[p.llIlIllIIlIl[8]] = p."Dunk-preform";
        p.llIlIllIIlII[p.llIlIllIIlIl[9]] = p."Heat-preform";
    }

    private static boolean lIIIIIlllIIllII(Object object) {
        return object == null;
    }

    private static boolean lIIIIIlllIlIIII(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIIIIIlllIIlIll(int n2, int n3) {
        return n2 == n3;
    }
}

