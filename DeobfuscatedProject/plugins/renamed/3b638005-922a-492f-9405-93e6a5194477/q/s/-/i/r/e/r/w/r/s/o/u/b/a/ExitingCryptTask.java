/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.TileObjects
 */
package q.s.-.i.r.e.r.w.r.s.o.u.b.a;

import gg.squire.barrows.SquireBarrows;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.TileObjects;
import q.s.-.i.r.e.r.w.r.s.o.u.b.a.DEnum;

/* TASK: Exiting crypt -> ExitingcryptTask */
@TaskDesc(name="Exiting crypt", priority=150, blocking=true)
public class ExitingCryptTask
extends Task {
    private static /* synthetic */ String[] llllIlIlIll;
    private static /* synthetic */ int[] llllIlIllII;
    private final /* synthetic */ SquireBarrows W;

    private static void lIllIlIlllIIII() {
        llllIlIllII = new int[4];
        p.llllIlIllII[0] = (0x2E ^ 0x72) & ~(0x45 ^ 0x19);
        p.llllIlIllII[1] = 0xCA ^ 0x97 ^ (0x54 ^ 0xC);
        p.llllIlIllII[2] = 1;
        p.llllIlIllII[3] = 2;
    }

    private static String lIllIlIllIllIl(String var14, String var15) {
        try {
            SecretKeySpec var10 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var15.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var3 = Cipher.getInstance("Blowfish");
            var3.init(llllIlIllII[3], var10);
            return new String(var3.doFinal(Base64.getDecoder().decode(var14.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var6) {
            var6.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIlIlllIlll(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIllIlIlllIllI(int n2) {
        return n2 != 0;
    }

    static {
        p.lIllIlIlllIIII();
        p.lIllIlIllIllll();
    }

    private static boolean lIllIlIlllIIll(Object object, Object object2) {
        return object != object2;
    }

    private static boolean lIllIlIlllIlIl(int n2, int n3) {
        return n2 < n3;
    }

    private static void lIllIlIllIllll() {
        llllIlIlIll = new String[llllIlIllII[3]];
        p.llllIlIlIll[p.llllIlIllII[0]] = p."Staircase";
        p.llllIlIlIll[p.llllIlIllII[2]] = p."Climb-up";
    }

    @Inject
    public p(SquireBarrows squireBarrows) {
        this.W = squireBarrows;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_2;
        p var7;
        if (p.lIllIlIlllIIIl(this.W.h() ? 1 : 0)) {
            return llllIlIllII[0];
        }
        if (p.lIllIlIlllIIIl(var7.W.a(var7.W.s()) ? 1 : 0) && p.lIllIlIlllIIlI((Object)var7.W.r())) {
            return llllIlIllII[0];
        }
        if (p.lIllIlIlllIIIl(var7.W.a(var7.W.s()) ? 1 : 0) && p.lIllIlIlllIIll((Object)var7.W.r(), (Object)var7.W.s())) {
            return llllIlIllII[0];
        }
        if (p.lIllIlIlllIlII((Object)var7.W.r(), (Object)var7.W.s())) {
            int var4 = llllIlIllII[0];
            d[] var16 = d.values();
            int var19 = var16.length;
            int var8 = llllIlIllII[0];
            while (p.lIllIlIlllIlIl(var8, var19)) {
                d var17 = var16[var8];
                if (p.lIllIlIlllIllI(var7.W.a(var17) ? 1 : 0)) {
                    ++var4;
                }
                ++var8;
                0;
                
                return false;
            }
            if (p.lIllIlIlllIlll(var4, llllIlIllII[1])) {
                return llllIlIllII[0];
            }
        }
        String[] stringArray = new String[llllIlIllII[2]];
        stringArray[p.llllIlIllII[0]] = llllIlIlIll[llllIlIllII[0]];
        TileObject var4 = TileObjects.getNearest((String[])stringArray);
        if (p.lIllIlIlllIIlI(var4)) {
            return llllIlIllII[0];
        }
        var1_2.interact(llllIlIlIll[llllIlIllII[2]]);
        return llllIlIllII[2];
    }

    private static boolean lIllIlIlllIIIl(int n2) {
        return n2 == 0;
    }

    private static boolean lIllIlIlllIlII(Object object, Object object2) {
        return object == object2;
    }

    private static String lIllIlIllIlllI(String var13, String var12) {
        var13 = new String(Base64.getDecoder().decode(var13.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var11 = new StringBuilder();
        char[] var5 = var12.toCharArray();
        int var2 = llllIlIllII[0];
        char[] var18 = var13.toCharArray();
        int var20 = var18.length;
        int var1 = llllIlIllII[0];
        while (p.lIllIlIlllIlIl(var1, var20)) {
            char var9 = var18[var1];
            var11.append((char)(var9 ^ var5[var2 % var5.length]));
            0;
            ++var2;
            ++var1;
            0;
            if (-1 < 3) continue;
            return null;
        }
        return String.valueOf(var11);
    }

    private static boolean lIllIlIlllIIlI(Object object) {
        return object == null;
    }
}

