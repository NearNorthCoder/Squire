/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  com.google.inject.Singleton
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.Player
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.client.Static
 */
package m.e.a.i.z.m.r.-.q.s.y.u;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import m.e.a.i.z.m.r.-.q.s.y.u.c;
import m.e.a.i.z.m.r.-.q.s.y.u.l;
import net.runelite.api.Item;
import net.runelite.api.Player;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.client.Static;

/* TASK: Placing cannon base -> PlaceCannonTask */
@TaskDesc(name="Placing cannon base", priority=20, blocking=true)
@Singleton
public class B
extends Task {
    private static final /* synthetic */ int az;
    private final /* synthetic */ c aD;
    private static final /* synthetic */ int aA;
    private /* synthetic */ int aE;
    private static final /* synthetic */ int aB;
    private static /* synthetic */ String[] lIllIIlIlIIll;
    private static /* synthetic */ int[] lIllIIlIlIlIl;
    private final /* synthetic */ l aC;

    public int Q() {
        return this.aE;
    }

    private static boolean llIIIllIIIlIlII(int n2) {
        return n2 != 0;
    }

    private boolean N() {
        return lIllIIlIlIlIl[0];
    }

    private static boolean llIIIllIIIlIlIl(Object object) {
        return object == null;
    }

    private static String llIIIllIIIIIlll(String var2, String var23) {
        try {
            SecretKeySpec var11 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var23.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var24 = Cipher.getInstance("Blowfish");
            var24.init(lIllIIlIlIlIl[9], var11);
            return new String(var24.doFinal(Base64.getDecoder().decode(var2.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var10) {
            var10.printStackTrace();
            return null;
        }
    }

    private static String llIIIllIIIIlIII(String var18, String var7) {
        try {
            SecretKeySpec var21 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var7.getBytes(StandardCharsets.UTF_8)), lIllIIlIlIlIl[11]), "DES");
            Cipher var4 = Cipher.getInstance("DES");
            var4.init(lIllIIlIlIlIl[9], var21);
            return new String(var4.doFinal(Base64.getDecoder().decode(var18.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var3) {
            var3.printStackTrace();
            return null;
        }
    }

    @Inject
    public B(l l2, c c2) {
        this.aE = lIllIIlIlIlIl[0];
        this.aC = l2;
        this.aD = c2;
    }

    public boolean run() {
        B var9;
        if (B.llIIIllIIIlIIIl(this.aC.B() ? 1 : 0)) {
            return lIllIIlIlIlIl[0];
        }
        int var12 = Static.getClient().getTickCount();
        if (B.llIIIllIIIlIIIl(var9.aC.A() ? 1 : 0) && B.llIIIllIIIlIIIl(var9.aC.D() ? 1 : 0) && B.llIIIllIIIlIIlI(var12, var9.aE) && (!B.llIIIllIIIlIIll(var9.aC.z(), lIllIIlIlIlIl[1]) || B.llIIIllIIIlIIlI(var12 - var9.aE, lIllIIlIlIlIl[2])) && B.llIIIllIIIlIlII(var9.aC.G() ? 1 : 0)) {
            Item var22;
            if (B.llIIIllIIIlIlII(Inventory.isFull() ? 1 : 0)) {
                int[] nArray = new int[lIllIIlIlIlIl[3]];
                nArray[B.lIllIIlIlIlIl[0]] = lIllIIlIlIlIl[4];
                var22 = Inventory.getFirst((int[])nArray);
                if (B.llIIIllIIIlIlIl(var22)) {
                    var22 = Inventory.getFirst(item -> item.hasAction(lIllIIlIlIIll[lIllIIlIlIlIl[7]]::equals));
                }
                if (B.llIIIllIIIlIlIl(var22)) {
                    return lIllIIlIlIlIl[0];
                }
                var22.interact(lIllIIlIlIIll[lIllIIlIlIlIl[0]]);
            }
            int[] nArray = new int[lIllIIlIlIlIl[3]];
            nArray[B.lIllIIlIlIlIl[0]] = lIllIIlIlIlIl[5];
            var22 = TileObjects.getNearest((int[])nArray);
            var22.interact(lIllIIlIlIIll[lIllIIlIlIlIl[3]]);
            return lIllIIlIlIlIl[3];
        }
        if (B.llIIIllIIIlIllI(var12 + lIllIIlIlIlIl[6] - lIllIIlIlIlIl[7], var9.aE)) {
            Movement.walkTo((WorldPoint)var9.aD.i());
            0;
        }
        if (B.llIIIllIIIlIlII(var9.aC.G() ? 1 : 0)) {
            return lIllIIlIlIlIl[0];
        }
        int[] nArray = new int[lIllIIlIlIlIl[3]];
        nArray[B.lIllIIlIlIlIl[0]] = lIllIIlIlIlIl[8];
        if (B.llIIIllIIIlIIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return var9.N();
        }
        Player var22 = Players.getLocal();
        WorldPoint var1 = var9.aD.h();
        if (B.llIIIllIIIlIlII(var22.getWorldLocation().equals((Object)var1) ? 1 : 0)) {
            int[] nArray2 = new int[lIllIIlIlIlIl[3]];
            nArray2[B.lIllIIlIlIlIl[0]] = lIllIIlIlIlIl[8];
            Item var5 = Inventory.getFirst((int[])nArray2);
            var5.interact(lIllIIlIlIIll[lIllIIlIlIlIl[9]]);
            var9.aE = var12 + lIllIIlIlIlIl[6];
            return lIllIIlIlIlIl[3];
        }
        if (B.llIIIllIIIlIIIl(var22.isMoving() ? 1 : 0)) {
            Movement.walkTo((WorldPoint)var1);
            0;
        }
        return lIllIIlIlIlIl[3];
    }

    private static boolean llIIIllIIIlIllI(int n2, int n3) {
        return n2 < n3;
    }

    private static String llIIIllIIIIIllI(String var8, String var14) {
        var8 = new String(Base64.getDecoder().decode(var8.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var19 = new StringBuilder();
        char[] var13 = var14.toCharArray();
        int var15 = lIllIIlIlIlIl[0];
        char[] var17 = var8.toCharArray();
        int var20 = var17.length;
        int var6 = lIllIIlIlIlIl[0];
        while (B.llIIIllIIIlIllI(var6, var20)) {
            char var16 = var17[var6];
            var19.append((char)(var16 ^ var13[var15 % var13.length]));
            0;
            ++var15;
            ++var6;
            0;
            
            return null;
        }
        return String.valueOf(var19);
    }

    static {
        B.llIIIllIIIlIIII();
        B.llIIIllIIIIllII();
        aB = lIllIIlIlIlIl[2];
        az = lIllIIlIlIlIl[6];
        aA = lIllIIlIlIlIl[1];
    }

    private static boolean llIIIllIIIlIIIl(int n2) {
        return n2 == 0;
    }

    private static boolean llIIIllIIIlIIll(int n2, int n3) {
        return n2 <= n3;
    }

    private static void llIIIllIIIlIIII() {
        lIllIIlIlIlIl = new int[12];
        B.lIllIIlIlIlIl[0] = (0x62 ^ 0x39) & ~(0x50 ^ 0xB);
        B.lIllIIlIlIlIl[1] = 0x23 ^ 0x16 ^ (0xEF ^ 0xC3);
        B.lIllIIlIlIlIl[2] = 37 + 4 - -14 + 145;
        B.lIllIIlIlIlIl[3] = 1;
        B.lIllIIlIlIlIl[4] = -(0xFFFF87F5 & 0x7D1F) & (0xFFFFFFFF & 0x1FF7);
        B.lIllIIlIlIlIl[5] = 0x2D ^ 0x2A;
        B.lIllIIlIlIlIl[6] = 0xFFFF9FD4 & 0x67FB;
        B.lIllIIlIlIlIl[7] = 3;
        B.lIllIIlIlIlIl[8] = 0x1F ^ 0x72 ^ (0x4C ^ 0x27);
        B.lIllIIlIlIlIl[9] = 2;
        B.lIllIIlIlIlIl[10] = 0x44 ^ 4 ^ (0x6D ^ 0x29);
        B.lIllIIlIlIlIl[11] = 0x77 ^ 0x7F;
    }

    private static boolean llIIIllIIIlIIlI(int n2, int n3) {
        return n2 > n3;
    }

    private static void llIIIllIIIIllII() {
        lIllIIlIlIIll = new String[lIllIIlIlIlIl[10]];
        B.lIllIIlIlIIll[B.lIllIIlIlIlIl[0]] = B."Eat";
        B.lIllIIlIlIIll[B.lIllIIlIlIlIl[3]] = B."Pick-up";
        B.lIllIIlIlIIll[B.lIllIIlIlIlIl[9]] = B."Set-up";
        B.lIllIIlIlIIll[B.lIllIIlIlIlIl[7]] = B."Eat";
    }
}

