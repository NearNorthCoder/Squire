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
        be lllllllllllllllIlllIIlIIllIIIIIl;
        int[] nArray = new int[lIlIIIIIlIII[0]];
        nArray[be.lIlIIIIIlIII[1]] = lIlIIIIIlIII[2];
        if (be.llIlIlIIIIlIII(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return lIlIIIIIlIII[1];
        }
        int[] nArray2 = new int[lIlIIIIIlIII[0]];
        nArray2[be.lIlIIIIIlIII[1]] = em;
        TileObject lllllllllllllllIlllIIlIIllIIIIII = TileObjects.getNearest((int[])nArray2);
        if (be.llIlIlIIIIlIIl(lllllllllllllllIlllIIlIIllIIIIIl.eh(), lllllllllllllllIlllIIlIIllIIIIIl.ed())) {
            return lIlIIIIIlIII[1];
        }
        if (be.llIlIlIIIIlIlI(lllllllllllllllIlllIIlIIllIIIIII)) {
            return lIlIIIIIlIII[1];
        }
        if (!be.llIlIlIIIIlIll(Inventory.isFull() ? 1 : 0) || be.llIlIlIIIIllII(lllllllllllllllIlllIIlIIllIIIIIl.eg(), lllllllllllllllIlllIIlIIllIIIIIl.ek())) {
            return lIlIIIIIlIII[1];
        }
        if (be.llIlIlIIIIlIII(lllllllllllllllIlllIIlIIllIIIIIl.bS.isAnimating() ? 1 : 0)) {
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

    private static String llIlIlIIIIIlII(String lllllllllllllllIlllIIlIIlIllIlIl, String lllllllllllllllIlllIIlIIlIllIlII) {
        lllllllllllllllIlllIIlIIlIllIlIl = new String(Base64.getDecoder().decode(lllllllllllllllIlllIIlIIlIllIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlllIIlIIlIllIIll = new StringBuilder();
        char[] lllllllllllllllIlllIIlIIlIllIIlI = lllllllllllllllIlllIIlIIlIllIlII.toCharArray();
        int lllllllllllllllIlllIIlIIlIllIIIl = lIlIIIIIlIII[1];
        char[] lllllllllllllllIlllIIlIIlIlIlIll = lllllllllllllllIlllIIlIIlIllIlIl.toCharArray();
        int lllllllllllllllIlllIIlIIlIlIlIlI = lllllllllllllllIlllIIlIIlIlIlIll.length;
        int lllllllllllllllIlllIIlIIlIlIlIIl = lIlIIIIIlIII[1];
        while (be.llIlIlIIIIlIIl(lllllllllllllllIlllIIlIIlIlIlIIl, lllllllllllllllIlllIIlIIlIlIlIlI)) {
            char lllllllllllllllIlllIIlIIlIllIllI = lllllllllllllllIlllIIlIIlIlIlIll[lllllllllllllllIlllIIlIIlIlIlIIl];
            lllllllllllllllIlllIIlIIlIllIIll.append((char)(lllllllllllllllIlllIIlIIlIllIllI ^ lllllllllllllllIlllIIlIIlIllIIlI[lllllllllllllllIlllIIlIIlIllIIIl % lllllllllllllllIlllIIlIIlIllIIlI.length]));
            0;
            ++lllllllllllllllIlllIIlIIlIllIIIl;
            ++lllllllllllllllIlllIIlIIlIlIlIIl;
            0;
            if (-1 != 1) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIlllIIlIIlIllIIll);
    }

    private static String llIlIlIIIIIlIl(String lllllllllllllllIlllIIlIIlIlIIIII, String lllllllllllllllIlllIIlIIlIIlllIl) {
        try {
            SecretKeySpec lllllllllllllllIlllIIlIIlIlIIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlllIIlIIlIIlllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlllIIlIIlIlIIIlI = Cipher.getInstance("Blowfish");
            lllllllllllllllIlllIIlIIlIlIIIlI.init(lIlIIIIIlIII[3], lllllllllllllllIlllIIlIIlIlIIIll);
            return new String(lllllllllllllllIlllIIlIIlIlIIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllIlllIIlIIlIlIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlllIIlIIlIlIIIIl) {
            lllllllllllllllIlllIIlIIlIlIIIIl.printStackTrace();
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

