/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.widgets.Prayers
 */
package k.-.u.u.l.i.s.r.c.d.-.q.u.e.u.e.e.s.s.l;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.duke.SquireDukeSucellus;
import gg.squire.duke.SquireDukeSucellusConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import k.-.u.u.l.i.s.r.c.d.-.q.u.e.u.e.e.s.s.l.a;
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Prayers;

@TaskDesc(name="Drinking prayer", priority=10000)
public class v
extends Task {
    private final /* synthetic */ SquireDukeSucellus aM;
    private final /* synthetic */ a aO;
    private static /* synthetic */ String[] lIllIlIlIIII;
    private static /* synthetic */ int[] lIllIlIlIIIl;
    private final /* synthetic */ SquireDukeSucellusConfig aN;

    private static boolean lllIIllllIlIIl(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lllIIllllIllII(int n2) {
        return n2 != 0;
    }

    private static String lllIIllllIIllI(String lllllllllllllllIlIlllllIIIIlIIIl, String lllllllllllllllIlIlllllIIIIlIlIl) {
        lllllllllllllllIlIlllllIIIIlIIIl = new String(Base64.getDecoder().decode(lllllllllllllllIlIlllllIIIIlIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlIlllllIIIIlIlII = new StringBuilder();
        char[] lllllllllllllllIlIlllllIIIIlIIll = lllllllllllllllIlIlllllIIIIlIlIl.toCharArray();
        int lllllllllllllllIlIlllllIIIIlIIlI = lIllIlIlIIIl[0];
        char[] lllllllllllllllIlIlllllIIIIIllII = lllllllllllllllIlIlllllIIIIlIIIl.toCharArray();
        int lllllllllllllllIlIlllllIIIIIlIll = lllllllllllllllIlIlllllIIIIIllII.length;
        int lllllllllllllllIlIlllllIIIIIlIlI = lIllIlIlIIIl[0];
        while (v.lllIIllllIllIl(lllllllllllllllIlIlllllIIIIIlIlI, lllllllllllllllIlIlllllIIIIIlIll)) {
            char lllllllllllllllIlIlllllIIIIlIlll = lllllllllllllllIlIlllllIIIIIllII[lllllllllllllllIlIlllllIIIIIlIlI];
            lllllllllllllllIlIlllllIIIIlIlII.append((char)(lllllllllllllllIlIlllllIIIIlIlll ^ lllllllllllllllIlIlllllIIIIlIIll[lllllllllllllllIlIlllllIIIIlIIlI % lllllllllllllllIlIlllllIIIIlIIll.length]));
            0;
            ++lllllllllllllllIlIlllllIIIIlIIlI;
            ++lllllllllllllllIlIlllllIIIIIlIlI;
            0;
            if (2 != ((0xF0 ^ 0xA0) & ~(0x69 ^ 0x39))) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIlIlllllIIIIlIlII);
    }

    private static boolean lllIIllllIllIl(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lllIIllllIlIll(int n2) {
        return n2 == 0;
    }

    private static boolean lllIIllllIlIlI(Object object) {
        return object == null;
    }

    private static void lllIIllllIlIII() {
        lIllIlIlIIIl = new int[4];
        v.lIllIlIlIIIl[0] = (0x54 ^ 0x78 ^ (0xE2 ^ 0x97)) & (0xD ^ 0x4F ^ (0x38 ^ 0x23) ^ -1);
        v.lIllIlIlIIIl[1] = 1;
        v.lIllIlIlIIIl[2] = 2;
        v.lIllIlIlIIIl[3] = 3;
    }

    private static String lllIIllllIIlIl(String lllllllllllllllIlIlllllIIIlIIlII, String lllllllllllllllIlIlllllIIIlIIlIl) {
        try {
            SecretKeySpec lllllllllllllllIlIlllllIIIlIlIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlllllIIIlIIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIlllllIIIlIlIII = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIlllllIIIlIlIII.init(lIllIlIlIIIl[2], lllllllllllllllIlIlllllIIIlIlIIl);
            return new String(lllllllllllllllIlIlllllIIIlIlIII.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlllllIIIlIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIlllllIIIlIIlll) {
            lllllllllllllllIlIlllllIIIlIIlll.printStackTrace();
            return null;
        }
    }

    private static void lllIIllllIIlll() {
        lIllIlIlIIII = new String[lIllIlIlIIIl[3]];
        v.lIllIlIlIIII[v.lIllIlIlIIIl[0]] = v."Drink";
        v.lIllIlIlIIII[v.lIllIlIlIIIl[1]] = v."prayer potion";
        v.lIllIlIlIIII[v.lIllIlIlIIIl[2]] = v."super restore";
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        if (v.lllIIllllIlIIl(Prayers.getPoints(), this.aN.drinkPrayerAt())) {
            return lIllIlIlIIIl[0];
        }
        Item lllllllllllllllIlIlllllIIIllIIII = Inventory.getFirst(item -> {
            int n2;
            if (!v.lllIIllllIlIll(item.getName().toLowerCase().contains(lIllIlIlIIII[lIllIlIlIIIl[1]]) ? 1 : 0) || v.lllIIllllIllII(item.getName().toLowerCase().contains(lIllIlIlIIII[lIllIlIlIIIl[2]]) ? 1 : 0)) {
                n2 = lIllIlIlIIIl[1];
                0;
                if ((4 ^ 0) == 0) {
                    return ((5 ^ 9) & ~(0xBB ^ 0xB7)) != 0;
                }
            } else {
                n2 = lIllIlIlIIIl[0];
            }
            return n2 != 0;
        });
        if (v.lllIIllllIlIlI(lllllllllllllllIlIlllllIIIllIIII)) {
            return lIllIlIlIIIl[0];
        }
        var1_1.interact(lIllIlIlIIII[lIllIlIlIIIl[0]]);
        return lIllIlIlIIIl[1];
    }

    static {
        v.lllIIllllIlIII();
        v.lllIIllllIIlll();
    }

    @Inject
    public v(SquireDukeSucellus squireDukeSucellus, SquireDukeSucellusConfig squireDukeSucellusConfig) {
        this.aM = squireDukeSucellus;
        this.aN = squireDukeSucellusConfig;
        this.aO = squireDukeSucellus.s();
    }
}

