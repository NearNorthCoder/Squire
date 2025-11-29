/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.coords.RegionPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 */
package u.i.r.d.s.e.r.q.y.a.h.-;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.coords.RegionPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import u.i.r.d.s.e.r.q.y.a.h.-.a;

/* TASK: Entering hydra room -> EnteringhydraroomTask */
@TaskDesc(name="Entering hydra room", priority=5, blocking=true)
public class n
extends Task {
    public static final /* synthetic */ int ao;
    private static /* synthetic */ String[] llllIIlIllII;
    private static /* synthetic */ int[] llllIIlIllIl;
    private final /* synthetic */ a ap;

    private static boolean lIIIllllllllIIl(Object object) {
        return object == null;
    }

    private static String lIIIlllllllIlII(String var6, String var8) {
        var6 = new String(Base64.getDecoder().decode(var6.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var1 = new StringBuilder();
        char[] var13 = var8.toCharArray();
        int var16 = llllIIlIllIl[0];
        char[] var10 = var6.toCharArray();
        int var5 = var10.length;
        int var14 = llllIIlIllIl[0];
        while (n.lIIIllllllllIlI(var14, var5)) {
            char var11 = var10[var14];
            var1.append((char)(var11 ^ var13[var16 % var13.length]));
            0;
            ++var16;
            ++var14;
            0;
            if (((0x40 ^ 0x1E) & ~(0x70 ^ 0x2E)) < 1) continue;
            return null;
        }
        return String.valueOf(var1);
    }

    private static String lIIIlllllllIIll(String var4, String var7) {
        try {
            SecretKeySpec var15 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var7.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var2 = Cipher.getInstance("Blowfish");
            var2.init(llllIIlIllIl[3], var15);
            return new String(var2.doFinal(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var3) {
            var3.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIllllllllIlI(int n2, int n3) {
        return n2 < n3;
    }

    @Inject
    public n(a a2) {
        this.ap = a2;
    }

    static {
        n.lIIIlllllllIllI();
        n.lIIIlllllllIlIl();
        ao = llllIIlIllIl[1];
    }

    private static void lIIIlllllllIllI() {
        llllIIlIllIl = new int[4];
        n.llllIIlIllIl[0] = (0x40 ^ 0x1D) & ~(0xC0 ^ 0x9D);
        n.llllIIlIllIl[1] = 0x74 ^ 0x26 ^ (0x66 ^ 0x17);
        n.llllIIlIllIl[2] = 1;
        n.llllIIlIllIl[3] = 2;
    }

    private static boolean lIIIlllllllIlll(int n2) {
        return n2 == 0;
    }

    private static boolean lIIIllllllllIII(int n2, int n3) {
        return n2 > n3;
    }

    private static void lIIIlllllllIlIl() {
        llllIIlIllII = new String[llllIIlIllIl[3]];
        n.llllIIlIllII[n.llllIIlIllIl[0]] = n."Alchemical door";
        n.llllIIlIllII[n.llllIIlIllIl[2]] = n."Quick-open";
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var2_2;
        if (n.lIIIlllllllIlll(this.ap.g() ? 1 : 0)) {
            return llllIIlIllIl[0];
        }
        RegionPoint var12 = RegionPoint.fromWorld((WorldPoint)Players.getLocal().getWorldLocation());
        if (n.lIIIllllllllIII(var12.getX(), llllIIlIllIl[1])) {
            return llllIIlIllIl[0];
        }
        String[] stringArray = new String[llllIIlIllIl[2]];
        stringArray[n.llllIIlIllIl[0]] = llllIIlIllII[llllIIlIllIl[0]];
        TileObject var9 = TileObjects.getNearest((String[])stringArray);
        if (n.lIIIllllllllIIl(var9)) {
            return llllIIlIllIl[0];
        }
        var2_2.interact(llllIIlIllII[llllIIlIllIl[2]]);
        return llllIIlIllIl[2];
    }
}

