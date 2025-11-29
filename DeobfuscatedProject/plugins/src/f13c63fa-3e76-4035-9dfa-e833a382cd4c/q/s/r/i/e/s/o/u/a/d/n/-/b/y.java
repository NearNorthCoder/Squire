/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.unethicalite.api.items.Inventory
 */
package q.s.r.i.e.s.o.u.a.d.n.-.b;

import com.google.inject.Inject;
import gg.squire.bandos.SquireBandosConfig;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;
import q.s.r.i.e.s.o.u.a.d.n.-.b.e;

@TaskDesc(name="Equipping Bowfa")
public class y
extends Task {
    private static /* synthetic */ int[] llIlllIllII;
    private final /* synthetic */ SquireBandosConfig ay;
    private static /* synthetic */ String[] llIlllIlIlI;
    private final /* synthetic */ e az;

    private static boolean lIlIlIlllIlIII(int n2) {
        return n2 != 0;
    }

    private static String lIlIlIllIllIlI(String llllllllllllllllIIlIlIlIIllIIIIl, String llllllllllllllllIIlIlIlIIllIIIlI) {
        try {
            SecretKeySpec llllllllllllllllIIlIlIlIIllIIllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlIlIlIIllIIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllIIlIlIlIIllIIlIl = Cipher.getInstance("Blowfish");
            llllllllllllllllIIlIlIlIIllIIlIl.init(llIlllIllII[2], llllllllllllllllIIlIlIlIIllIIllI);
            return new String(llllllllllllllllIIlIlIlIIllIIlIl.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlIlIlIIllIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIIlIlIlIIllIIlII) {
            llllllllllllllllIIlIlIlIIllIIlII.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIlIlllIIlll(int n2) {
        return n2 == 0;
    }

    private static String lIlIlIllIllIIl(String llllllllllllllllIIlIlIlIIlllIIII, String llllllllllllllllIIlIlIlIIllIllIl) {
        try {
            SecretKeySpec llllllllllllllllIIlIlIlIIlllIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlIlIlIIllIllIl.getBytes(StandardCharsets.UTF_8)), llIlllIllII[4]), "DES");
            Cipher llllllllllllllllIIlIlIlIIlllIIlI = Cipher.getInstance("DES");
            llllllllllllllllIIlIlIlIIlllIIlI.init(llIlllIllII[2], llllllllllllllllIIlIlIlIIlllIIll);
            return new String(llllllllllllllllIIlIlIlIIlllIIlI.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlIlIlIIlllIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIIlIlIlIIlllIIIl) {
            llllllllllllllllIIlIlIlIIlllIIIl.printStackTrace();
            return null;
        }
    }

    private static void lIlIlIllIlllII() {
        llIlllIlIlI = new String[llIlllIllII[3]];
        y.llIlllIlIlI[y.llIlllIllII[0]] = y.lIlIlIllIllIIl("71E5o3oKiUA=", "PrnLp");
        y.llIlllIlIlI[y.llIlllIllII[1]] = y.lIlIlIllIllIlI("ZzbU9x7GVqIKTVRkYtYzMw==", "YxoxU");
        y.llIlllIlIlI[y.llIlllIllII[2]] = y.lIlIlIllIllIIl("TZHWpIK2PrQkpTaemhLxeA==", "jsWaV");
    }

    @Inject
    public y(SquireBandosConfig squireBandosConfig, e e2) {
        this.ay = squireBandosConfig;
        this.az = e2;
    }

    static {
        y.lIlIlIlllIIllI();
        y.lIlIlIllIlllII();
    }

    private static void lIlIlIlllIIllI() {
        llIlllIllII = new int[5];
        y.llIlllIllII[0] = (0xF4 ^ 0xC1 ^ (0xAF ^ 0xA6)) & (17 + 145 - 42 + 62 ^ 115 + 84 - 193 + 132 ^ -" ".length());
        y.llIlllIllII[1] = " ".length();
        y.llIlllIllII[2] = "  ".length();
        y.llIlllIllII[3] = "   ".length();
        y.llIlllIllII[4] = 0x62 ^ 0x6A;
    }

    public boolean run() {
        y llllllllllllllllIIlIlIlIIllllIll;
        if (y.lIlIlIlllIIlll(this.ay.useBlowpipe() ? 1 : 0)) {
            return llIlllIllII[0];
        }
        if (y.lIlIlIlllIlIII(llllllllllllllllIIlIlIlIIllllIll.az.v() ? 1 : 0) && y.lIlIlIlllIIlll(llllllllllllllllIIlIlIlIIllllIll.az.s() ? 1 : 0)) {
            return llIlllIllII[0];
        }
        Item llllllllllllllllIIlIlIlIIllllIlI = Inventory.getFirst(item -> {
            boolean bl;
            if (!y.lIlIlIlllIIlll(item.getName().contains(llIlllIlIlI[llIlllIllII[1]]) ? 1 : 0) || y.lIlIlIlllIlIII(item.getName().contains(llIlllIlIlI[llIlllIllII[2]]) ? 1 : 0)) {
                bl = llIlllIllII[1];
                "".length();
                if (((0x56 ^ 0x75) & ~(0x74 ^ 0x57)) != ((0xB9 ^ 0xA6) & ~(0x6C ^ 0x73))) {
                    return ((0xFE ^ 0xBD) & ~(0x1A ^ 0x59)) != 0;
                }
            } else {
                bl = llIlllIllII[0];
            }
            return bl;
        });
        if (y.lIlIlIlllIlIIl(llllllllllllllllIIlIlIlIIllllIlI)) {
            llllllllllllllllIIlIlIlIIllllIlI.interact(llIlllIlIlI[llIlllIllII[0]]);
            return llIlllIllII[1];
        }
        return llIlllIllII[0];
    }

    private static boolean lIlIlIlllIlIIl(Object object) {
        return object != null;
    }
}

