/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 */
package p.s.o.t.u.m.r.s.i.e.s.-.o.e.r.q;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.tempoross.SquireTempoross;
import gg.squire.tempoross.SquireTemporossConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import p.s.o.t.u.m.r.s.i.e.s.-.o.e.r.q.a;
import p.s.o.t.u.m.r.s.i.e.s.-.o.e.r.q.c;
import p.s.o.t.u.m.r.s.i.e.s.-.o.e.r.q.l;

/* TASK: Harpooning pools -> HarpooningpoolsTask */
@TaskDesc(name="Harpooning pools", priority=600, blocking=true)
public class k
extends l {
    private static /* synthetic */ String[] lIIlllIIIlllI;
    public static final /* synthetic */ int am;
    private final /* synthetic */ Random an;
    private /* synthetic */ boolean ao;
    public static final /* synthetic */ int al;
    private /* synthetic */ int aq;
    private /* synthetic */ int ap;
    private static /* synthetic */ int[] lIIlllIIlIIIl;

    private static boolean lIllIIlIlIllIlI(int n2, int n3) {
        return n2 < n3;
    }

    private static String lIllIIlIlIIIllI(String var12, String var11) {
        var12 = new String(Base64.getDecoder().decode(var12.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var9 = new StringBuilder();
        char[] var2 = var11.toCharArray();
        int var13 = lIIlllIIlIIIl[0];
        char[] var7 = var12.toCharArray();
        int var18 = var7.length;
        int var3 = lIIlllIIlIIIl[0];
        while (k.lIllIIlIlIllIlI(var3, var18)) {
            char var6 = var7[var3];
            var9.append((char)(var6 ^ var2[var13 % var2.length]));
            0;
            ++var13;
            ++var3;
            0;
            
            return null;
        }
        return String.valueOf(var9);
    }

    @Inject
    protected k(a a2, SquireTemporossConfig squireTemporossConfig, Client client, SquireTempoross squireTempoross) {
        super(a2, squireTemporossConfig, client, squireTempoross);
        this.an = new Random();
        this.ao = lIIlllIIlIIIl[0];
        this.aq = this.an.nextInt(lIIlllIIlIIIl[1]) + lIIlllIIlIIIl[2];
    }

    private static boolean lIllIIlIlIllIll(Object object) {
        return object != null;
    }

    private static boolean lIllIIlIlIlIlll(Object object) {
        return object == null;
    }

    private static void lIllIIlIlIIIlll() {
        lIIlllIIIlllI = new String[lIIlllIIlIIIl[9]];
        k.lIIlllIIIlllI[k.lIIlllIIlIIIl[0]] = k."Harpoon";
        k.lIIlllIIIlllI[k.lIIlllIIlIIIl[3]] = k."Douse";
    }

    static {
        k.lIllIIlIlIIlllI();
        k.lIllIIlIlIIIlll();
        am = lIIlllIIlIIIl[11];
        al = lIIlllIIlIIIl[10];
    }

    private static boolean lIllIIlIlIlIllI(int n2) {
        return n2 != 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean ak() {
        int n2;
        block2: {
            block3: {
                if (!k.lIllIIlIlIlIlIl(this.ar.M() ? 1 : 0) || !k.lIllIIlIlIlIllI(this.ar.L() ? 1 : 0) || !k.lIllIIlIlIlIllI(this.ar.m() ? 1 : 0)) break block2;
                if (!k.lIllIIlIlIlIllI(this.as.solo() ? 1 : 0)) break block3;
                int[] nArray = new int[lIIlllIIlIIIl[3]];
                nArray[k.lIIlllIIlIIIl[0]] = lIIlllIIlIIIl[4];
                if (!k.lIllIIlIlIlIlIl(Inventory.contains((int[])nArray) ? 1 : 0)) break block2;
                int[] nArray2 = new int[lIIlllIIlIIIl[3]];
                nArray2[k.lIIlllIIlIIIl[0]] = lIIlllIIlIIIl[5];
                if (!k.lIllIIlIlIlIlIl(Inventory.contains((int[])nArray2) ? 1 : 0)) break block2;
            }
            n2 = lIIlllIIlIIIl[3];
            0;
            if (3 < (0xC4 ^ 0xC0)) return n2 != 0;
            return false;
        }
        n2 = lIIlllIIlIIIl[0];
        return n2 != 0;
    }

    private static boolean lIllIIlIlIlllII(int n2, int n3) {
        return n2 != n3;
    }

    private static void lIllIIlIlIIlllI() {
        lIIlllIIlIIIl = new int[14];
        k.lIIlllIIlIIIl[0] = (0x6E ^ 0x27) & ~(0x8F ^ 0xC6);
        k.lIIlllIIlIIIl[1] = 0x20 ^ 0x2A;
        k.lIIlllIIlIIIl[2] = 0x51 ^ 0x70 ^ (0x2E ^ 0x1B);
        k.lIIlllIIlIIIl[3] = 1;
        k.lIIlllIIlIIIl[4] = -(0xFFFF9F7D & 0x6CA3) & (0xFFFFFFFF & 0x6FFD);
        k.lIIlllIIlIIIl[5] = 0xFFFFEFDD & 0x73FE;
        k.lIIlllIIlIIIl[6] = 0xFFFFE94B & 0x3FFF;
        k.lIIlllIIlIIIl[7] = -(0xFFFF9E85 & 0x63FF) & (0xFFFFFBCE & 0x2FFF);
        k.lIIlllIIlIIIl[8] = 92 + 29 - 20 + 28 ^ 61 + 38 - 98 + 131;
        k.lIIlllIIlIIIl[9] = 2;
        k.lIIlllIIlIIIl[10] = 0xFFFFCBFA & 0x3745;
        k.lIIlllIIlIIIl[11] = -(0xFFFFD41F & 0x2FED) & (0xFFFFEFDF & 0x1EFF);
        k.lIIlllIIlIIIl[12] = 0x6E ^ 6 ^ (0x7E ^ 0x12);
        k.lIIlllIIlIIIl[13] = 0xFFFFF1C7 & 0x2FFB;
    }

    private static boolean lIllIIlIlIllIIl(int n2, int n3) {
        return n2 == n3;
    }

    private static String lIllIIlIlIIIlII(String var20, String var17) {
        try {
            SecretKeySpec var14 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var17.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var16 = Cipher.getInstance("Blowfish");
            var16.init(lIIlllIIlIIIl[9], var14);
            return new String(var16.doFinal(Base64.getDecoder().decode(var20.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var5) {
            var5.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean al() {
        int llllllllllllllIlllIlIllllllllllI22;
        void v2;
        c llllllllllllllIlllIlIllllllllllI22;
        void var1;
        void var10;
        k var15;
        void var4;
        int[] nArray = new int[lIIlllIIlIIIl[3]];
        nArray[k.lIIlllIIlIIIl[0]] = lIIlllIIlIIIl[6];
        NPC nPC2 = NPCs.getNearest((WorldPoint)this.ar.N().ag(), (int[])nArray);
        int[] nArray2 = new int[lIIlllIIlIIIl[3]];
        nArray2[k.lIIlllIIlIIIl[0]] = lIIlllIIlIIIl[7];
        NPC nPC3 = NPCs.getNearest((WorldPoint)this.ar.N().ag(), (int[])nArray2);
        Player player = Players.getLocal();
        if (k.lIllIIlIlIlIlll(player)) {
            return lIIlllIIlIIIl[0];
        }
        if (k.lIllIIlIlIlIlIl(Movement.isRunEnabled() ? 1 : 0) && (!k.lIllIIlIlIlIlIl(var4.isMoving() ? 1 : 0) || k.lIllIIlIlIlIllI(var4.isAnimating() ? 1 : 0)) && k.lIllIIlIlIllIII(Movement.getRunEnergy(), var15.aq)) {
            Movement.toggleRun();
            var15.aq = var15.an.nextInt(lIIlllIIlIIIl[1]) + lIIlllIIlIIIl[2];
        }
        if (k.lIllIIlIlIlIlll(var10) && k.lIllIIlIlIlIlll(var1) && k.lIllIIlIlIllIII(var4.distanceTo((llllllllllllllIlllIlIllllllllllI22 = var15.ar.N()).ag()), lIIlllIIlIIIl[8])) {
            return var15.ar.f(llllllllllllllIlllIlIllllllllllI22.ag());
        }
        if (k.lIllIIlIlIlIllI(var15.as.solo() ? 1 : 0)) {
            llllllllllllllIlllIlIllllllllllI22 = NPCs.getNearest(nPC -> {
                int n2;
                if (k.lIllIIlIlIllIIl(nPC.getId(), lIIlllIIlIIIl[13])) {
                    String[] stringArray = new String[lIIlllIIlIIIl[3]];
                    stringArray[k.lIIlllIIlIIIl[0]] = lIIlllIIIlllI[lIIlllIIlIIIl[3]];
                    if (k.lIllIIlIlIlIllI(nPC.hasAction(stringArray) ? 1 : 0)) {
                        n2 = lIIlllIIlIIIl[3];
                        0;
                        if (2 > 0) return n2 != 0;
                        return (2 & (2 ^ -1)) != 0;
                    }
                }
                n2 = lIIlllIIlIIIl[0];
                return n2 != 0;
            });
            int var19 = var15.au.c();
            if (k.lIllIIlIlIlIlll(llllllllllllllIlllIlIllllllllllI22)) {
                int var8 = var15.ar.E();
                if (k.lIllIIlIlIllIIl(var8, lIIlllIIlIIIl[3]) && k.lIllIIlIlIllIlI(var19, var15.ar.F())) {
                    var15.ar.d(lIIlllIIlIIIl[0]);
                    var15.ar.u();
                    var15.ao = lIIlllIIlIIIl[0];
                    return lIIlllIIlIIIl[0];
                }
                if (k.lIllIIlIlIllIIl(var8, lIIlllIIlIIIl[9]) && k.lIllIIlIlIllIlI(var19, var15.ar.G())) {
                    var15.ar.d(lIIlllIIlIIIl[0]);
                    var15.ar.u();
                    var15.ao = lIIlllIIlIIIl[0];
                    return lIIlllIIlIIIl[0];
                }
            }
        }
        if (k.lIllIIlIlIllIll(var10) && k.lIllIIlIlIlIllI(var10.equals(var4.getInteracting()) ? 1 : 0)) {
            int llllllllllllllIlllIlIllllllllllI22 = var4.getAnimation();
            var10.getWorldArea().distanceTo2D(var4.getWorldLocation());
            0;
            if (k.lIllIIlIlIlIllI(var4.isAnimating() ? 1 : 0) && k.lIllIIlIlIlllII(llllllllllllllIlllIlIllllllllllI22, lIIlllIIlIIIl[10]) && k.lIllIIlIlIlllII(llllllllllllllIlllIlIllllllllllI22, lIIlllIIlIIIl[11])) {
                var15.ao = lIIlllIIlIIIl[3];
            }
            return lIIlllIIlIIIl[0];
        }
        if (k.lIllIIlIlIllIll(var10)) {
            v2 = var10;
            0;
            if (-1 > 1) {
                return ((0x5F ^ 0x43 ^ (0xA9 ^ 0x89)) & (57 + 137 - 137 + 116 ^ 80 + 139 - 80 + 6 ^ -1)) != 0;
            }
        } else {
            v2 = var1;
        }
        if (k.lIllIIlIlIllIII(llllllllllllllIlllIlIllllllllllI22 = var4.distanceTo((Locatable)v2), lIIlllIIlIIIl[12])) {
            if (k.lIllIIlIlIlIllI(Movement.shouldWalk() ? 1 : 0)) {
                void v4;
                a a2 = var15.ar;
                if (k.lIllIIlIlIllIll(var10)) {
                    v4 = var10;
                    0;
                    
                    }
                } else {
                    v4 = var1;
                }
                return a2.c((NPC)v4);
            }
            return lIIlllIIlIIIl[3];
        }
        if (k.lIllIIlIlIlIlll(var10)) {
            if (k.lIllIIlIlIlIllI(var15.ao ? 1 : 0)) {
                var15.ar.d(lIIlllIIlIIIl[0]);
                var15.ar.u();
                var15.ao = lIIlllIIlIIIl[0];
            }
            return lIIlllIIlIIIl[0];
        }
        return this.ar.a(nPC2, lIIlllIIIlllI[lIIlllIIlIIIl[0]]);
    }

    private static boolean lIllIIlIlIllIII(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIllIIlIlIlIlIl(int n2) {
        return n2 == 0;
    }
}

