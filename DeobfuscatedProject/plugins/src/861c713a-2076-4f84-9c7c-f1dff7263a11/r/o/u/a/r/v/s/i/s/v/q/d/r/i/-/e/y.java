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
package r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.vardorvis.SquireVardorvis;
import gg.squire.vardorvis.SquireVardorvisConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Prayers;
import r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.e;

@TaskDesc(name="Drinking prayer", priority=10000)
public class y
extends Task {
    private static /* synthetic */ int[] lIlIlIIIlIllI;
    private final /* synthetic */ SquireVardorvis aq;
    private final /* synthetic */ e as;
    private final /* synthetic */ SquireVardorvisConfig ar;
    private static /* synthetic */ String[] lIlIlIIIlIlIl;

    static {
        y.lIllllIlIlllIIl();
        y.lIllllIlIlllIII();
    }

    private static void lIllllIlIlllIIl() {
        lIlIlIIIlIllI = new int[5];
        y.lIlIlIIIlIllI[0] = (168 + 42 - 146 + 153 ^ 10 + 95 - 83 + 177) & (0xF6 ^ 0x84 ^ (0x26 ^ 0x4A) ^ -" ".length());
        y.lIlIlIIIlIllI[1] = " ".length();
        y.lIlIlIIIlIllI[2] = "  ".length();
        y.lIlIlIIIlIllI[3] = "   ".length();
        y.lIlIlIIIlIllI[4] = 9 ^ 0x62 ^ (8 ^ 0x6B);
    }

    private static String lIllllIlIllIllI(String llllllllllllllIllIllIIIlIIIlIlIl, String llllllllllllllIllIllIIIlIIIlIllI) {
        try {
            SecretKeySpec llllllllllllllIllIllIIIlIIIllIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIllIIIlIIIlIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllIllIIIlIIIllIIl = Cipher.getInstance("Blowfish");
            llllllllllllllIllIllIIIlIIIllIIl.init(lIlIlIIIlIllI[2], llllllllllllllIllIllIIIlIIIllIlI);
            return new String(llllllllllllllIllIllIIIlIIIllIIl.doFinal(Base64.getDecoder().decode(llllllllllllllIllIllIIIlIIIlIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllIllIIIlIIIllIII) {
            llllllllllllllIllIllIIIlIIIllIII.printStackTrace();
            return null;
        }
    }

    private static String lIllllIlIllIlll(String llllllllllllllIllIllIIIlIIIIlIII, String llllllllllllllIllIllIIIlIIIIIlll) {
        try {
            SecretKeySpec llllllllllllllIllIllIIIlIIIIllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIllIIIlIIIIIlll.getBytes(StandardCharsets.UTF_8)), lIlIlIIIlIllI[4]), "DES");
            Cipher llllllllllllllIllIllIIIlIIIIllII = Cipher.getInstance("DES");
            llllllllllllllIllIllIIIlIIIIllII.init(lIlIlIIIlIllI[2], llllllllllllllIllIllIIIlIIIIllIl);
            return new String(llllllllllllllIllIllIIIlIIIIllII.doFinal(Base64.getDecoder().decode(llllllllllllllIllIllIIIlIIIIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllIllIIIlIIIIlIll) {
            llllllllllllllIllIllIIIlIIIIlIll.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        if (y.lIllllIlIlllIlI(Prayers.getPoints(), this.ar.drinkPrayerAt())) {
            return lIlIlIIIlIllI[0];
        }
        Item llllllllllllllIllIllIIIlIIlIIIIl = Inventory.getFirst(item -> {
            int n2;
            if (!y.lIllllIlIllllII(item.getName().toLowerCase().contains(lIlIlIIIlIlIl[lIlIlIIIlIllI[1]]) ? 1 : 0) || y.lIllllIlIllllIl(item.getName().toLowerCase().contains(lIlIlIIIlIlIl[lIlIlIIIlIllI[2]]) ? 1 : 0)) {
                n2 = lIlIlIIIlIllI[1];
                "".length();
                if ("   ".length() <= -" ".length()) {
                    return ("   ".length() & ("   ".length() ^ -" ".length())) != 0;
                }
            } else {
                n2 = lIlIlIIIlIllI[0];
            }
            return n2 != 0;
        });
        if (y.lIllllIlIlllIll(llllllllllllllIllIllIIIlIIlIIIIl)) {
            return lIlIlIIIlIllI[0];
        }
        var1_1.interact(lIlIlIIIlIlIl[lIlIlIIIlIllI[0]]);
        return lIlIlIIIlIllI[1];
    }

    private static boolean lIllllIlIlllIlI(int n2, int n3) {
        return n2 > n3;
    }

    private static void lIllllIlIlllIII() {
        lIlIlIIIlIlIl = new String[lIlIlIIIlIllI[3]];
        y.lIlIlIIIlIlIl[y.lIlIlIIIlIllI[0]] = y.lIllllIlIllIllI("bNgV8YDiAZo=", "UzwDV");
        y.lIlIlIIIlIlIl[y.lIlIlIIIlIllI[1]] = y.lIllllIlIllIllI("FhoksnwJ5uz7D02egQClng==", "GpLrE");
        y.lIlIlIIIlIlIl[y.lIlIlIIIlIllI[2]] = y.lIllllIlIllIlll("M5v+jprxl0hJUzRcjkA96Q==", "RaYvQ");
    }

    private static boolean lIllllIlIlllIll(Object object) {
        return object == null;
    }

    private static boolean lIllllIlIllllII(int n2) {
        return n2 == 0;
    }

    private static boolean lIllllIlIllllIl(int n2) {
        return n2 != 0;
    }

    @Inject
    public y(SquireVardorvis squireVardorvis, SquireVardorvisConfig squireVardorvisConfig) {
        this.aq = squireVardorvis;
        this.ar = squireVardorvisConfig;
        this.as = squireVardorvis.j();
    }
}

