/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 */
package c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o;

import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.bg;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.cox.SquireChambersConfig;
import gg.squire.cox.SquireChambersPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;

/* TASK: Prep Pick Herbs -> PreppickherbsTask */
@TaskDesc(name="Prep Pick Herbs", priority=21000, blocking=true)
public class be
extends bg {
    private static /* synthetic */ int[] lIlIIIIIlIII;
    private static /* synthetic */ String[] lIlIIIIIIlll;

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean dY() {
        void var1_1;
        be var8;
        int[] nArray = new int[lIlIIIIIlIII[0]];
        nArray[be.lIlIIIIIlIII[1]] = lIlIIIIIlIII[2];
        if (be.llIlIlIIIIlIII(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return lIlIIIIIlIII[1];
        }
        int[] nArray2 = new int[lIlIIIIIlIII[0]];
        nArray2[be.lIlIIIIIlIII[1]] = em;
        TileObject var6 = TileObjects.getNearest((int[])nArray2);
        if (be.llIlIlIIIIlIIl(var8.eh(), var8.ed())) {
            return lIlIIIIIlIII[1];
        }
        if (be.llIlIlIIIIlIlI(var6)) {
            return lIlIIIIIlIII[1];
        }
        if (!be.llIlIlIIIIlIll(Inventory.isFull() ? 1 : 0) || be.llIlIlIIIIllII(var8.eg(), var8.ek())) {
            return lIlIIIIIlIII[1];
        }
        if (be.llIlIlIIIIlIII(var8.bS.isAnimating() ? 1 : 0)) {
            System.out.println(lIlIIIIIIlll[lIlIIIIIlIII[1]]);
            return lIlIIIIIlIII[0];
        }
        var1_1.interact(lIlIIIIIIlll[lIlIIIIIlIII[0]]);
        this.sleep(lIlIIIIIlIII[3]);
        return lIlIIIIIlIII[0];
    }

    private static boolean llIlIlIIIIlIIl(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean llIlIlIIIIlIlI(Object object) {
        return object == null;
    }

    @Inject
    protected be(SquireChambersPlugin squireChambersPlugin, SquireChambersConfig squireChambersConfig, Client client) {
        super(squireChambersPlugin, squireChambersConfig, client);
    }

    private static String llIlIlIIIIIlII(String var5, String var12) {
        var5 = new String(Base64.getDecoder().decode(var5.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var4 = new StringBuilder();
        char[] var1 = var12.toCharArray();
        int var7 = lIlIIIIIlIII[1];
        char[] var9 = var5.toCharArray();
        int var16 = var9.length;
        int var11 = lIlIIIIIlIII[1];
        while (be.llIlIlIIIIlIIl(var11, var16)) {
            char var10 = var9[var11];
            var4.append((char)(var10 ^ var1[var7 % var1.length]));
            0;
            ++var7;
            ++var11;
            0;
            if (-1 != 1) continue;
            return null;
        }
        return String.valueOf(var4);
    }

    private static String llIlIlIIIIIlIl(String var15, String var3) {
        try {
            SecretKeySpec var13 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var3.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var2 = Cipher.getInstance("Blowfish");
            var2.init(lIlIIIIIlIII[3], var13);
            return new String(var2.doFinal(Base64.getDecoder().decode(var15.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var14) {
            var14.printStackTrace();
            return null;
        }
    }

    private static void llIlIlIIIIIlll() {
        lIlIIIIIlIII = new int[4];
        be.lIlIIIIIlIII[0] = 1;
        be.lIlIIIIIlIII[1] = (0x8A ^ 0xA1 ^ (0x33 ^ 1)) & (0x78 ^ 5 ^ (0x31 ^ 0x55) ^ -1);
        be.lIlIIIIIlIII[2] = -(0xFFFFFE5F & 0x2FF1) & (0xFFFFFFFC & Short.MAX_VALUE);
        be.lIlIIIIIlIII[3] = 2;
    }

    private static void llIlIlIIIIIllI() {
        lIlIIIIIIlll = new String[lIlIIIIIlIII[3]];
        be.lIlIIIIIIlll[be.lIlIIIIIlIII[1]] = be."Picking up herbs";
        be.lIlIIIIIIlll[be.lIlIIIIIlIII[0]] = be."Pick";
    }

    static {
        be.llIlIlIIIIIlll();
        be.llIlIlIIIIIllI();
    }

    private static boolean llIlIlIIIIlIII(int n2) {
        return n2 != 0;
    }

    private static boolean llIlIlIIIIlIll(int n2) {
        return n2 == 0;
    }

    private static boolean llIlIlIIIIllII(int n2, int n3) {
        return n2 <= n3;
    }
}

