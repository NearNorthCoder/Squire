/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package s.r.i.t.g.n.-.u.h.i.q.i.e.v.e;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.thieving.SquireThieving;
import gg.squire.thieving.SquireThievingConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* TASK: Handling dodgy necklaces -> HandlingdodgynecklacesTask */
@TaskDesc(name="Handling dodgy necklaces", priority=50, blocking=true)
public class y
extends Task {
    private final /* synthetic */ SquireThievingConfig am;
    private final /* synthetic */ SquireThieving an;
    private static /* synthetic */ String[] lIIlllIIIIIlI;
    private static final /* synthetic */ Logger al;
    private static /* synthetic */ int[] lIIlllIIIIIll;

    static {
        y.lIllIIlIIIllllI();
        y.lIllIIlIIIlllIl();
        al = LoggerFactory.getLogger(y.class);
    }

    private static boolean lIllIIlIIIlllll(int n2) {
        return n2 == 0;
    }

    @Inject
    public y(SquireThievingConfig squireThievingConfig, SquireThieving squireThieving) {
        this.am = squireThievingConfig;
        this.an = squireThieving;
    }

    private static void lIllIIlIIIllllI() {
        lIIlllIIIIIll = new int[5];
        y.lIIlllIIIIIll[0] = (0x53 ^ 0x72 ^ (0xAB ^ 0x85)) & (5 + 119 - 12 + 35 ^ 68 + 16 - -27 + 45 ^ -1);
        y.lIIlllIIIIIll[1] = 1;
        y.lIIlllIIIIIll[2] = -(0xFFFFFD3D & 0x2FEB) & (0xFFFFFFFF & 0x7FBF);
        y.lIIlllIIIIIll[3] = 0x99 ^ 0x91;
        y.lIIlllIIIIIll[4] = 2;
    }

    private static boolean lIllIIlIIlIIIIl(int n2) {
        return n2 != 0;
    }

    private static void lIllIIlIIIlllIl() {
        lIIlllIIIIIlI = new String[lIIlllIIIIIll[1]];
        y.lIIlllIIIIIlI[y.lIIlllIIIIIll[0]] = y."Wear";
    }

    private static boolean lIllIIlIIlIIIII(int n2) {
        return n2 <= 0;
    }

    public boolean run() {
        y var3;
        if (y.lIllIIlIIIlllll(this.am.dodgyNecklace() ? 1 : 0)) {
            return lIIlllIIIIIll[0];
        }
        if (y.lIllIIlIIlIIIII(var3.am.dodgyNecklaceAmount())) {
            return lIIlllIIIIIll[0];
        }
        int[] nArray = new int[lIIlllIIIIIll[1]];
        nArray[y.lIIlllIIIIIll[0]] = lIIlllIIIIIll[2];
        if (y.lIllIIlIIlIIIIl(Equipment.contains((int[])nArray) ? 1 : 0)) {
            return lIIlllIIIIIll[0];
        }
        int[] nArray2 = new int[lIIlllIIIIIll[1]];
        nArray2[y.lIIlllIIIIIll[0]] = lIIlllIIIIIll[2];
        if (y.lIllIIlIIIlllll(Equipment.contains((int[])nArray2) ? 1 : 0)) {
            int[] nArray3 = new int[lIIlllIIIIIll[1]];
            nArray3[y.lIIlllIIIIIll[0]] = lIIlllIIIIIll[2];
            if (y.lIllIIlIIlIIIIl(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                int[] nArray4 = new int[lIIlllIIIIIll[1]];
                nArray4[y.lIIlllIIIIIll[0]] = lIIlllIIIIIll[2];
                Inventory.getFirst((int[])nArray4).interact(lIIlllIIIIIlI[lIIlllIIIIIll[0]]);
                return lIIlllIIIIIll[1];
            }
        }
        return lIIlllIIIIIll[0];
    }

    private static String lIllIIlIIIlllII(String var4, String var1) {
        try {
            SecretKeySpec var2 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var1.getBytes(StandardCharsets.UTF_8)), lIIlllIIIIIll[3]), "DES");
            Cipher var6 = Cipher.getInstance("DES");
            var6.init(lIIlllIIIIIll[4], var2);
            return new String(var6.doFinal(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var5) {
            var5.printStackTrace();
            return null;
        }
    }
}

