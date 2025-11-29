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
package r.r.s.u.-.s.i.e.u.u.r.i.q.c.s;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.scurrius.SquireScurrius;
import gg.squire.scurrius.SquireScurriusConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Prayers;
import r.r.s.u.-.s.i.e.u.u.r.i.q.c.s.b;

@TaskDesc(name="Drinking prayer", priority=10000)
public class p
extends Task {
    private final /* synthetic */ SquireScurriusConfig aa;
    private final /* synthetic */ b ab;
    private static /* synthetic */ String[] lIIlIllIIlIlI;
    private static /* synthetic */ int[] lIIlIllIIlIll;
    private final /* synthetic */ SquireScurrius Z;

    private static String lIlIllIIlllIIII(String llllllllllllllIllllIlIllIlIIIIlI, String llllllllllllllIllllIlIllIIllllII) {
        llllllllllllllIllllIlIllIlIIIIlI = new String(Base64.getDecoder().decode(llllllllllllllIllllIlIllIlIIIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllllIlIllIlIIIIII = new StringBuilder();
        char[] llllllllllllllIllllIlIllIIllllll = llllllllllllllIllllIlIllIIllllII.toCharArray();
        int llllllllllllllIllllIlIllIIlllllI = lIIlIllIIlIll[0];
        char[] llllllllllllllIllllIlIllIIlllIII = llllllllllllllIllllIlIllIlIIIIlI.toCharArray();
        int llllllllllllllIllllIlIllIIllIlll = llllllllllllllIllllIlIllIIlllIII.length;
        int llllllllllllllIllllIlIllIIllIllI = lIIlIllIIlIll[0];
        while (p.lIlIllIIllllIII(llllllllllllllIllllIlIllIIllIllI, llllllllllllllIllllIlIllIIllIlll)) {
            char llllllllllllllIllllIlIllIlIIIIll = llllllllllllllIllllIlIllIIlllIII[llllllllllllllIllllIlIllIIllIllI];
            llllllllllllllIllllIlIllIlIIIIII.append((char)(llllllllllllllIllllIlIllIlIIIIll ^ llllllllllllllIllllIlIllIIllllll[llllllllllllllIllllIlIllIIlllllI % llllllllllllllIllllIlIllIIllllll.length]));
            "".length();
            ++llllllllllllllIllllIlIllIIlllllI;
            ++llllllllllllllIllllIlIllIIllIllI;
            "".length();
            if (null == null) continue;
            return null;
        }
        return String.valueOf(llllllllllllllIllllIlIllIlIIIIII);
    }

    private static boolean lIlIllIIlllIlll(int n2) {
        return n2 != 0;
    }

    private static boolean lIlIllIIlllIlIl(Object object) {
        return object == null;
    }

    private static String lIlIllIIlllIIIl(String llllllllllllllIllllIlIllIIlIlIll, String llllllllllllllIllllIlIllIIlIllII) {
        try {
            SecretKeySpec llllllllllllllIllllIlIllIIllIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllllIlIllIIlIllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllllIlIllIIlIllll = Cipher.getInstance("Blowfish");
            llllllllllllllIllllIlIllIIlIllll.init(lIIlIllIIlIll[2], llllllllllllllIllllIlIllIIllIIII);
            return new String(llllllllllllllIllllIlIllIIlIllll.doFinal(Base64.getDecoder().decode(llllllllllllllIllllIlIllIIlIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllllIlIllIIlIlllI) {
            llllllllllllllIllllIlIllIIlIlllI.printStackTrace();
            return null;
        }
    }

    @Inject
    public p(SquireScurrius squireScurrius, SquireScurriusConfig squireScurriusConfig) {
        this.Z = squireScurrius;
        this.aa = squireScurriusConfig;
        this.ab = squireScurrius.n();
    }

    private static boolean lIlIllIIllllIII(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIlIllIIlllIlII(int n2, int n3) {
        return n2 > n3;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        if (p.lIlIllIIlllIlII(Prayers.getPoints(), this.aa.drinkPrayerAt())) {
            return lIIlIllIIlIll[0];
        }
        Item llllllllllllllIllllIlIllIlIIllll = Inventory.getFirst(item -> {
            int n2;
            if (!p.lIlIllIIlllIllI(item.getName().toLowerCase().contains(lIIlIllIIlIlI[lIIlIllIIlIll[1]]) ? 1 : 0) || p.lIlIllIIlllIlll(item.getName().toLowerCase().contains(lIIlIllIIlIlI[lIIlIllIIlIll[2]]) ? 1 : 0)) {
                n2 = lIIlIllIIlIll[1];
                "".length();
                if (" ".length() < 0) {
                    return ((5 ^ 0x28) & ~(0xAD ^ 0x80)) != 0;
                }
            } else {
                n2 = lIIlIllIIlIll[0];
            }
            return n2 != 0;
        });
        if (p.lIlIllIIlllIlIl(llllllllllllllIllllIlIllIlIIllll)) {
            return lIIlIllIIlIll[0];
        }
        var1_1.interact(lIIlIllIIlIlI[lIIlIllIIlIll[0]]);
        return lIIlIllIIlIll[1];
    }

    private static void lIlIllIIlllIIll() {
        lIIlIllIIlIll = new int[4];
        p.lIIlIllIIlIll[0] = (74 + 91 - 17 + 7 ^ 48 + 39 - -2 + 67) & (56 + 82 - 97 + 87 ^ 2 + 90 - 16 + 59 ^ -" ".length());
        p.lIIlIllIIlIll[1] = " ".length();
        p.lIIlIllIIlIll[2] = "  ".length();
        p.lIIlIllIIlIll[3] = "   ".length();
    }

    private static void lIlIllIIlllIIlI() {
        lIIlIllIIlIlI = new String[lIIlIllIIlIll[3]];
        p.lIIlIllIIlIlI[p.lIIlIllIIlIll[0]] = p.lIlIllIIlllIIII("PD8mCyE=", "xMOeJ");
        p.lIIlIllIIlIlI[p.lIIlIllIIlIll[1]] = p.lIlIllIIlllIIII("BT8YDw4HbQkZHxwiFw==", "uMyvk");
        p.lIIlIllIIlIlI[p.lIIlIllIIlIll[2]] = p.lIlIllIIlllIIIl("7tiSJL6HHzhBLJRayFT1LQ==", "mGWdf");
    }

    static {
        p.lIlIllIIlllIIll();
        p.lIlIllIIlllIIlI();
    }

    private static boolean lIlIllIIlllIllI(int n2) {
        return n2 == 0;
    }
}

