/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.NPC
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.movement.Movement
 */
package k.-.u.u.l.i.s.r.c.d.-.q.u.e.u.e.e.s.s.l;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.duke.SquireDukeSucellus;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import k.-.u.u.l.i.s.r.c.d.-.q.u.e.u.e.e.s.s.l.a;
import k.-.u.u.l.i.s.r.c.d.-.q.u.e.u.e.e.s.s.l.e;
import net.runelite.api.NPC;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Movement;

/* TASK: Swapping Sides -> SwappingsidesTask */
@TaskDesc(name="Swapping Sides", priority=301, blocking=true)
public class B
extends Task {
    final /* synthetic */ SquireDukeSucellus bb;
    final /* synthetic */ a bc;
    private static /* synthetic */ String[] lIllIlIIllIl;
    private static /* synthetic */ int[] lIllIlIllIlI;

    private static void lllIIlllIllIII() {
        lIllIlIIllIl = new String[lIllIlIllIlI[4]];
        B.lIllIlIIllIl[B.lIllIlIllIlI[0]] = B."Gate";
        B.lIllIlIIllIl[B.lIllIlIllIlI[1]] = B."Quick-escape";
        B.lIllIlIIllIl[B.lIllIlIllIlI[2]] = B."Duke Sucellus";
        B.lIllIlIIllIl[B.lIllIlIllIlI[3]] = B."Attack";
    }

    private static boolean lllIlIIIIlIlll(int n2, int n3) {
        return n2 < n3;
    }

    static {
        B.lllIlIIIIlIIll();
        B.lllIIlllIllIII();
    }

    private static boolean lllIlIIIIlIllI(int n2) {
        return n2 != 0;
    }

    private static String lllIIlllIlIlll(String var17, String var15) {
        try {
            SecretKeySpec var10 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var15.getBytes(StandardCharsets.UTF_8)), lIllIlIllIlI[5]), "DES");
            Cipher var12 = Cipher.getInstance("DES");
            var12.init(lIllIlIllIlI[2], var10);
            return new String(var12.doFinal(Base64.getDecoder().decode(var17.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var22) {
            var22.printStackTrace();
            return null;
        }
    }

    private static String lllIIlllIlIlIl(String var18, String var3) {
        try {
            SecretKeySpec var9 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var3.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var19 = Cipher.getInstance("Blowfish");
            var19.init(lIllIlIllIlI[2], var9);
            return new String(var19.doFinal(Base64.getDecoder().decode(var18.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var6) {
            var6.printStackTrace();
            return null;
        }
    }

    private static String lllIIlllIlIllI(String var7, String var13) {
        var7 = new String(Base64.getDecoder().decode(var7.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var8 = new StringBuilder();
        char[] var16 = var13.toCharArray();
        int var21 = lIllIlIllIlI[0];
        char[] var2 = var7.toCharArray();
        int var5 = var2.length;
        int var14 = lIllIlIllIlI[0];
        while (B.lllIlIIIIlIlll(var14, var5)) {
            char var23 = var2[var14];
            var8.append((char)(var23 ^ var16[var21 % var16.length]));
            0;
            ++var21;
            ++var14;
            0;
            if (1 < 3) continue;
            return null;
        }
        return String.valueOf(var8);
    }

    private static boolean lllIlIIIIlIlII(int n2) {
        return n2 == 0;
    }

    @Inject
    public B(SquireDukeSucellus squireDukeSucellus) {
        this.bb = squireDukeSucellus;
        this.bc = squireDukeSucellus.s();
    }

    private static void lllIlIIIIlIIll() {
        lIllIlIllIlI = new int[6];
        B.lIllIlIllIlI[0] = (0xB ^ 0x34) & ~(3 ^ 0x3C);
        B.lIllIlIllIlI[1] = 1;
        B.lIllIlIllIlI[2] = 2;
        B.lIllIlIllIlI[3] = 3;
        B.lIllIlIllIlI[4] = 0x32 ^ 0x36;
        B.lIllIlIllIlI[5] = 0x75 ^ 0x7D;
    }

    private static boolean lllIlIIIIlIlIl(Object object) {
        return object == null;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var2_2;
        B var4;
        if (B.lllIlIIIIlIlII(this.bb.k() ? 1 : 0)) {
            return lIllIlIllIlI[0];
        }
        NPC var1 = NPCs.getNearest(nPC -> {
            int n2;
            if (B.lllIlIIIIlIllI(nPC.getName().equals(lIllIlIIllIl[lIllIlIllIlI[2]]) ? 1 : 0)) {
                String[] stringArray = new String[lIllIlIllIlI[1]];
                stringArray[B.lIllIlIllIlI[0]] = lIllIlIIllIl[lIllIlIllIlI[3]];
                if (B.lllIlIIIIlIllI(nPC.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lIllIlIllIlI[1];
                    0;
                    if (null == null) return n2 != 0;
                    return false;
                }
            }
            n2 = lIllIlIllIlI[0];
            return n2 != 0;
        });
        if (B.lllIlIIIIlIlIl(var1)) {
            var4.bb.c(lIllIlIllIlI[0]);
            return lIllIlIllIlI[0];
        }
        TileObject var20 = TileObjects.getNearest(tileObject -> {
            int n2;
            if (B.lllIlIIIIlIllI(tileObject.getName().equals(lIllIlIIllIl[lIllIlIllIlI[0]]) ? 1 : 0)) {
                String[] stringArray = new String[lIllIlIllIlI[1]];
                stringArray[B.lIllIlIllIlI[0]] = lIllIlIIllIl[lIllIlIllIlI[1]];
                if (B.lllIlIIIIlIllI(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lIllIlIllIlI[1];
                    0;
                    if (2 != 0) return n2 != 0;
                    return (1 & ~1) != 0;
                }
            }
            n2 = lIllIlIllIlI[0];
            return n2 != 0;
        });
        if (B.lllIlIIIIlIlIl(var20)) {
            return lIllIlIllIlI[0];
        }
        int var11 = var4.bc.j() ? 1 : 0;
        if (B.lllIlIIIIlIllI(var11)) {
            if (B.lllIlIIIIlIllI(e.q(var20) ? 1 : 0)) {
                var4.bb.c(lIllIlIllIlI[0]);
                return lIllIlIllIlI[0];
            }
            Movement.setDestination((WorldPoint)e.m(var20));
            return lIllIlIllIlI[1];
        }
        if (B.lllIlIIIIlIllI(e.r(var20) ? 1 : 0)) {
            var4.bb.c(lIllIlIllIlI[0]);
        }
        Movement.setDestination((WorldPoint)e.o((TileObject)var2_2));
        return lIllIlIllIlI[1];
    }
}

