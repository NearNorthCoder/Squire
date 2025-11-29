/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.movement.Movement
 */
package s.r.i.t.g.n.-.u.h.i.q.i.e.v.e;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.movement.Movement;
import s.r.i.t.g.n.-.u.h.i.q.i.e.v.e.o;

class p
implements Runnable {
    private static /* synthetic */ int[] lIIlllIIlIlII;
    final /* synthetic */ o X;
    private static /* synthetic */ String[] lIIlllIIlIIll;
    final /* synthetic */ TileObject W;

    private static boolean lIllIIllIIIIllI(int n2, int n3) {
        return n2 < n3;
    }

    p(o o2, TileObject tileObject) {
        this.X = o2;
        this.W = tileObject;
    }

    static {
        p.lIllIIllIIIIlII();
        p.lIllIIllIIIIIll();
    }

    private static void lIllIIllIIIIIll() {
        lIIlllIIlIIll = new String[lIIlllIIlIlII[2]];
        p.lIIlllIIlIIll[p.lIIlllIIlIlII[0]] = p."Open";
        p.lIIlllIIlIIll[p.lIIlllIIlIlII[1]] = p."Open";
    }

    private static void lIllIIllIIIIlII() {
        lIIlllIIlIlII = new int[4];
        p.lIIlllIIlIlII[0] = (0xC0 ^ 0xBA ^ (0x42 ^ 0x6D)) & (0x2F ^ 0x20 ^ (0x33 ^ 0x69) ^ -1);
        p.lIIlllIIlIlII[1] = 1;
        p.lIIlllIIlIlII[2] = 2;
        p.lIIlllIIlIlII[3] = 0x66 ^ 0x4D ^ (0x30 ^ 0x13);
    }

    private static boolean lIllIIllIIIIlIl(int n2) {
        return n2 != 0;
    }

    @Override
    public void run() {
        if (p.lIllIIllIIIIlIl(this.W.hasAction(lIIlllIIlIIll[lIIlllIIlIlII[0]]::equals) ? 1 : 0)) {
            this.W.interact(lIIlllIIlIIll[lIIlllIIlIlII[1]]);
            return;
        }
        Movement.walkTo((WorldPoint)this.W.getWorldLocation().dy(lIIlllIIlIlII[1]));
        0;
    }

    private static String lIllIIllIIIIIlI(String var13, String var2) {
        var13 = new String(Base64.getDecoder().decode(var13.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var1 = new StringBuilder();
        char[] var5 = var2.toCharArray();
        int var4 = lIIlllIIlIlII[0];
        char[] var6 = var13.toCharArray();
        int var14 = var6.length;
        int var10 = lIIlllIIlIlII[0];
        while (p.lIllIIllIIIIllI(var10, var14)) {
            char var9 = var6[var10];
            var1.append((char)(var9 ^ var5[var4 % var5.length]));
            0;
            ++var4;
            ++var10;
            0;
            if (-1 < 0) continue;
            return null;
        }
        return String.valueOf(var1);
    }

    private static String lIllIIllIIIIIIl(String var3, String var7) {
        try {
            SecretKeySpec var11 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var7.getBytes(StandardCharsets.UTF_8)), lIIlllIIlIlII[3]), "DES");
            Cipher var12 = Cipher.getInstance("DES");
            var12.init(lIIlllIIlIlII[2], var11);
            return new String(var12.doFinal(Base64.getDecoder().decode(var3.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }
}

