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
 *  net.unethicalite.client.Static
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.nightmare.SquireNightmareConfig;
import gg.squire.nightmare.SquireNightmarePlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Prayers;
import net.unethicalite.client.Static;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@TaskDesc(name="Restoring Prayer", priority=2)
public class ar
extends Task {
    private static final /* synthetic */ Logger en;
    private static /* synthetic */ String[] llllIIlIlllI;
    private final /* synthetic */ SquireNightmareConfig eo;
    private final /* synthetic */ SquireNightmarePlugin ep;
    private static /* synthetic */ int[] llllIIllIIII;

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        ar lllllllllllllllIIlIlllIlIlIIIllI;
        if (ar.lIIIllllllIllIl(Static.getClient().isInInstancedRegion() ? 1 : 0)) {
            return llllIIllIIII[0];
        }
        if (ar.lIIIllllllIlllI(lllllllllllllllIIlIlllIlIlIIIllI.ep.aq() ? 1 : 0)) {
            return llllIIllIIII[0];
        }
        Item lllllllllllllllIIlIlllIlIlIIIIll = Inventory.getFirst(item -> {
            int n2;
            String string = item.getName().toLowerCase();
            if (!ar.lIIIllllllIllIl(string.contains(llllIIlIlllI[llllIIllIIII[2]]) ? 1 : 0) || !ar.lIIIllllllIllIl(string.contains(llllIIlIlllI[llllIIllIIII[3]]) ? 1 : 0) || ar.lIIIllllllIlllI(string.contains(llllIIlIlllI[llllIIllIIII[1]]) ? 1 : 0)) {
                n2 = llllIIllIIII[2];
                0;
                if (2 == 0) {
                    return ((0x42 ^ 0x46 ^ (4 ^ 0xF)) & (0xFD ^ 0xBA ^ (0x76 ^ 0x3E) ^ -1)) != 0;
                }
            } else {
                n2 = llllIIllIIII[0];
            }
            return n2 != 0;
        });
        if (ar.lIIIllllllIllll(Prayers.getPoints(), lllllllllllllllIIlIlllIlIlIIIllI.eo.restorePrayerAt())) {
            return llllIIllIIII[0];
        }
        if (ar.lIIIlllllllIIII(lllllllllllllllIIlIlllIlIlIIIIll)) {
            return llllIIllIIII[0];
        }
        var1_1.interact(llllIIlIlllI[llllIIllIIII[0]]);
        this.sleep(llllIIllIIII[1]);
        return llllIIllIIII[2];
    }

    static {
        ar.lIIIllllllIlIll();
        ar.lIIIllllllIlIlI();
        en = LoggerFactory.getLogger(ar.class);
    }

    private static void lIIIllllllIlIlI() {
        llllIIlIlllI = new String[llllIIllIIII[4]];
        ar.llllIIlIlllI[ar.llllIIllIIII[0]] = ar."Drink";
        ar.llllIIlIlllI[ar.llllIIllIIII[2]] = ar."prayer";
        ar.llllIIlIlllI[ar.llllIIllIIII[3]] = ar."restore";
        ar.llllIIlIlllI[ar.llllIIllIIII[1]] = ar."sanfew";
    }

    @Inject
    protected ar(SquireNightmareConfig squireNightmareConfig, SquireNightmarePlugin squireNightmarePlugin) {
        this.eo = squireNightmareConfig;
        this.ep = squireNightmarePlugin;
    }

    private static boolean lIIIllllllIllll(int n2, int n3) {
        return n2 > n3;
    }

    private static String lIIIllllllIIlll(String lllllllllllllllIIlIlllIlIIlIlIlI, String lllllllllllllllIIlIlllIlIIlIIlll) {
        try {
            SecretKeySpec lllllllllllllllIIlIlllIlIIlIllIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIlllIlIIlIIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIlIlllIlIIlIllII = Cipher.getInstance("Blowfish");
            lllllllllllllllIIlIlllIlIIlIllII.init(llllIIllIIII[3], lllllllllllllllIIlIlllIlIIlIllIl);
            return new String(lllllllllllllllIIlIlllIlIIlIllII.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIlllIlIIlIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIlIlllIlIIlIlIll) {
            lllllllllllllllIIlIlllIlIIlIlIll.printStackTrace();
            return null;
        }
    }

    private static void lIIIllllllIlIll() {
        llllIIllIIII = new int[6];
        ar.llllIIllIIII[0] = (0x6A ^ 0x4A ^ (0xD2 ^ 0xBA)) & (63 + 32 - -39 + 68 ^ 23 + 94 - 56 + 69 ^ -1);
        ar.llllIIllIIII[1] = 3;
        ar.llllIIllIIII[2] = 1;
        ar.llllIIllIIII[3] = 2;
        ar.llllIIllIIII[4] = 0x70 ^ 0x43 ^ (0x7C ^ 0x4B);
        ar.llllIIllIIII[5] = 0xD3 ^ 0xC6 ^ (0x75 ^ 0x68);
    }

    private static boolean lIIIllllllIllIl(int n2) {
        return n2 == 0;
    }

    private static String lIIIllllllIIlIl(String lllllllllllllllIIlIlllIlIIllIlIl, String lllllllllllllllIIlIlllIlIIllIlII) {
        try {
            SecretKeySpec lllllllllllllllIIlIlllIlIIlllIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIlllIlIIllIlII.getBytes(StandardCharsets.UTF_8)), llllIIllIIII[5]), "DES");
            Cipher lllllllllllllllIIlIlllIlIIlllIIl = Cipher.getInstance("DES");
            lllllllllllllllIIlIlllIlIIlllIIl.init(llllIIllIIII[3], lllllllllllllllIIlIlllIlIIlllIlI);
            return new String(lllllllllllllllIIlIlllIlIIlllIIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIlllIlIIllIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIlIlllIlIIlllIII) {
            lllllllllllllllIIlIlllIlIIlllIII.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIllllllIlllI(int n2) {
        return n2 != 0;
    }

    private static boolean lIIIlllllllIIII(Object object) {
        return object == null;
    }
}

