/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.unethicalite.api.items.GrandExchange
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.widgets.Widgets
 */
package i.i.b.s.c.q.r.s.s.-.u.a.e;

import com.google.inject.Inject;
import gg.squire.basics.membership.SquireMembershipBuyer;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.unethicalite.api.items.GrandExchange;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Widgets;

/* TASK: Redeeming Bond -> RedeemingbondTask */
@TaskDesc(name="Redeeming Bond")
public class RedeemingBondTask
extends Task {
    private static /* synthetic */ String[] llllIlll;
    private final /* synthetic */ SquireMembershipBuyer fi;
    private static /* synthetic */ int[] lllllIII;

    private static void llIllIIIIl() {
        llllIlll = new String[lllllIII[4]];
        aY.llllIlll[aY.lllllIII[1]] = aY."Close";
        aY.llllIlll[aY.lllllIII[0]] = aY."Redeem";
    }

    private static boolean llIllIIlIl(Object object) {
        return object != null;
    }

    private static String llIlIlllll(String llIlIIIIlllIlll, String llIlIIIIlllIllI) {
        llIlIIIIlllIlll = new String(Base64.getDecoder().decode(llIlIIIIlllIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llIlIIIIllllIlI = new StringBuilder();
        char[] llIlIIIIllllIIl = llIlIIIIlllIllI.toCharArray();
        int llIlIIIIllllIII = lllllIII[1];
        char[] llIlIIIIlllIIlI = llIlIIIIlllIlll.toCharArray();
        int llIlIIIIlllIIIl = llIlIIIIlllIIlI.length;
        int llIlIIIIlllIIII = lllllIII[1];
        while (aY.llIllIIllI(llIlIIIIlllIIII, llIlIIIIlllIIIl)) {
            char llIlIIIIlllllIl = llIlIIIIlllIIlI[llIlIIIIlllIIII];
            llIlIIIIllllIlI.append((char)(llIlIIIIlllllIl ^ llIlIIIIllllIIl[llIlIIIIllllIII % llIlIIIIllllIIl.length]));
            0;
            ++llIlIIIIllllIII;
            ++llIlIIIIlllIIII;
            0;
            if ((0xB0 ^ 0xC0 ^ (0xF2 ^ 0x87)) != 0) continue;
            return null;
        }
        return String.valueOf(llIlIIIIllllIlI);
    }

    private static void llIllIIIlI() {
        lllllIII = new int[11];
        aY.lllllIII[0] = 1;
        aY.lllllIII[1] = (0x45 ^ 0x4F ^ (0x28 ^ 0x61)) & (0x65 ^ 0xA ^ (0x4B ^ 0x67) ^ -1);
        aY.lllllIII[2] = -(0xFFFFEB72 & 0x1C9F) & (0xFFFFBFD9 & 0x7BBF);
        aY.lllllIII[3] = 0xFFFFB3FB & 0x4DD5;
        aY.lllllIII[4] = 2;
        aY.lllllIII[5] = 0xAE ^ 0xA5;
        aY.lllllIII[6] = -(0xFFFFFCBD & 0x73E3) & (0xFFFFF3FD & Short.MAX_VALUE);
        aY.lllllIII[7] = 0x14 ^ 0x11;
        aY.lllllIII[8] = 42 + 27 - 42 + 108 ^ 139 + 1 - 43 + 53;
        aY.lllllIII[9] = 0xFFFFE76F & 0x19B1;
        aY.lllllIII[10] = 0x82 ^ 0x8A;
    }

    public boolean run() {
        int[] nArray = new int[lllllIII[0]];
        nArray[aY.lllllIII[1]] = lllllIII[2];
        if (aY.llIllIIIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return lllllIII[1];
        }
        if (aY.llIllIIlII(GrandExchange.isOpen() ? 1 : 0)) {
            Widgets.get((int)lllllIII[3], (int)lllllIII[4]).getChild(lllllIII[5]).interact(llllIlll[lllllIII[1]]);
        }
        if (aY.llIllIIlIl(Widgets.get((int)lllllIII[6], (int)lllllIII[0])) && aY.llIllIIlII(Widgets.get((int)lllllIII[6], (int)lllllIII[7]).isVisible() ? 1 : 0)) {
            if (aY.llIllIIlIl(Widgets.get((int)lllllIII[6], (int)lllllIII[8])) && aY.llIllIIlII(Widgets.get((int)lllllIII[6], (int)lllllIII[8]).isVisible() ? 1 : 0)) {
                Widgets.get((int)lllllIII[6], (int)lllllIII[8]).interact(lllllIII[1]);
                Widgets.get((int)lllllIII[9], (int)lllllIII[10]).interact(lllllIII[1]);
                return lllllIII[0];
            }
        } else {
            int[] nArray2 = new int[lllllIII[0]];
            nArray2[aY.lllllIII[1]] = lllllIII[2];
            Inventory.getFirst((int[])nArray2).interact(llllIlll[lllllIII[0]]);
        }
        return lllllIII[0];
    }

    @Inject
    public aY(SquireMembershipBuyer squireMembershipBuyer) {
        this.fi = squireMembershipBuyer;
    }

    private static String llIllIIIII(String llIlIIIIllIIlIl, String llIlIIIIllIIllI) {
        try {
            SecretKeySpec llIlIIIIllIlIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llIlIIIIllIIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llIlIIIIllIlIIl = Cipher.getInstance("Blowfish");
            llIlIIIIllIlIIl.init(lllllIII[4], llIlIIIIllIlIlI);
            return new String(llIlIIIIllIlIIl.doFinal(Base64.getDecoder().decode(llIlIIIIllIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llIlIIIIllIlIII) {
            llIlIIIIllIlIII.printStackTrace();
            return null;
        }
    }

    private static boolean llIllIIllI(int n2, int n3) {
        return n2 < n3;
    }

    static {
        aY.llIllIIIlI();
        aY.llIllIIIIl();
    }

    private static boolean llIllIIIll(int n2) {
        return n2 == 0;
    }

    private static boolean llIllIIlII(int n2) {
        return n2 != 0;
    }
}

