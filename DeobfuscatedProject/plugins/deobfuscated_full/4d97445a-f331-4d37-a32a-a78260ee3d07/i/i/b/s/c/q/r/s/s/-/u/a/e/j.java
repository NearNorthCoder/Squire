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
package i.i.b.s.c.q.r.s.s.-.u.a.e;

import com.google.inject.Inject;
import gg.squire.basics.cerberus.SquireCerberusConfig;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import i.i.b.s.c.q.r.s.s.-.u.a.e.a;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Prayers;

/* TASK: Drinking prayer potion -> DrinkingprayerpotionTask */
@TaskDesc(name="Drinking prayer potion", priority=150)
public class j
extends Task {
    private static /* synthetic */ String[] lIlIIIllI;
    private static /* synthetic */ int[] lIlIIIlll;
    private final /* synthetic */ a al;
    private final /* synthetic */ SquireCerberusConfig ak;

    private static void lIIIlllllIl() {
        lIlIIIlll = new int[5];
        j.lIlIIIlll[0] = (0x89 ^ 0xA7) & ~(0x4E ^ 0x60);
        j.lIlIIIlll[1] = 1;
        j.lIlIIIlll[2] = 2;
        j.lIlIIIlll[3] = 3;
        j.lIlIIIlll[4] = 0xF ^ 7;
    }

    private static boolean lIIlIIIIIlI(int n2) {
        return n2 == 0;
    }

    static {
        j.lIIIlllllIl();
        j.lIIIlllllII();
    }

    private static boolean lIIIlllllll(Object object) {
        return object == null;
    }

    private static String lIIIllllIlI(String llIIIIlIlIlIllI, String llIIIIlIlIlIlIl) {
        try {
            SecretKeySpec llIIIIlIlIllIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llIIIIlIlIlIlIl.getBytes(StandardCharsets.UTF_8)), lIlIIIlll[4]), "DES");
            Cipher llIIIIlIlIllIlI = Cipher.getInstance("DES");
            llIIIIlIlIllIlI.init(lIlIIIlll[2], llIIIIlIlIllIll);
            return new String(llIIIIlIlIllIlI.doFinal(Base64.getDecoder().decode(llIIIIlIlIlIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llIIIIlIlIllIIl) {
            llIIIIlIlIllIIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIllllllI(Object object) {
        return object != null;
    }

    private static boolean lIIlIIIIIll(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIIlIIIIIII(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIIlIIIIIIl(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        j llIIIIlIllIIIll;
        if (!j.lIIIllllllI(this.al.k()) || j.lIIIlllllll(this.al.k().y())) {
            return lIlIIIlll[0];
        }
        if (j.lIIlIIIIIII(Prayers.getPoints(), llIIIIlIllIIIll.ak.drinkAtPrayer()) && j.lIIlIIIIIIl(llIIIIlIllIIIll.al.h().isEmpty() ? 1 : 0)) {
            return lIlIIIlll[0];
        }
        if (j.lIIlIIIIIII(Prayers.getPoints(), llIIIIlIllIIIll.ak.drinkAtPrayerGhost())) {
            return lIlIIIlll[0];
        }
        Item llIIIIlIllIIIlI = Inventory.getFirst(item -> {
            boolean bl2;
            if (!j.lIIlIIIIIlI(item.getName().startsWith(lIlIIIllI[lIlIIIlll[1]]) ? 1 : 0) || j.lIIlIIIIIIl(item.getName().startsWith(lIlIIIllI[lIlIIIlll[2]]) ? 1 : 0)) {
                bl2 = lIlIIIlll[1];
                0;
                if ((0x31 ^ 0x35) < -1) {
                    return false;
                }
            } else {
                bl2 = lIlIIIlll[0];
            }
            return bl2;
        });
        if (j.lIIIlllllll(llIIIIlIllIIIlI)) {
            return lIlIIIlll[0];
        }
        var1_1.interact(lIlIIIllI[lIlIIIlll[0]]);
        return lIlIIIlll[1];
    }

    private static void lIIIlllllII() {
        lIlIIIllI = new String[lIlIIIlll[3]];
        j.lIlIIIllI[j.lIlIIIlll[0]] = j."Drink";
        j.lIlIIIllI[j.lIlIIIlll[1]] = j."Prayer";
        j.lIlIIIllI[j.lIlIIIlll[2]] = j."Super rest";
    }

    private static String lIIIllllIll(String llIIIIlIlIIIIll, String llIIIIlIlIIIlll) {
        llIIIIlIlIIIIll = new String(Base64.getDecoder().decode(llIIIIlIlIIIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llIIIIlIlIIIllI = new StringBuilder();
        char[] llIIIIlIlIIIlIl = llIIIIlIlIIIlll.toCharArray();
        int llIIIIlIlIIIlII = lIlIIIlll[0];
        char[] llIIIIlIIlllllI = llIIIIlIlIIIIll.toCharArray();
        int llIIIIlIIllllIl = llIIIIlIIlllllI.length;
        int llIIIIlIIllllII = lIlIIIlll[0];
        while (j.lIIlIIIIIll(llIIIIlIIllllII, llIIIIlIIllllIl)) {
            char llIIIIlIlIIlIIl = llIIIIlIIlllllI[llIIIIlIIllllII];
            llIIIIlIlIIIllI.append((char)(llIIIIlIlIIlIIl ^ llIIIIlIlIIIlIl[llIIIIlIlIIIlII % llIIIIlIlIIIlIl.length]));
            0;
            ++llIIIIlIlIIIlII;
            ++llIIIIlIIllllII;
            0;
            if (1 > 0) continue;
            return null;
        }
        return String.valueOf(llIIIIlIlIIIllI);
    }

    @Inject
    private j(SquireCerberusConfig squireCerberusConfig, a a2) {
        this.ak = squireCerberusConfig;
        this.al = a2;
    }
}

