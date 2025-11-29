package k.p000.u.u.l.i.s.r.c.d.p001.q.u.e.u.e.e.s.s.l;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.TileObject;
import net.runelite.client.plugins.squire.BankLoadouts;
import net.runelite.client.plugins.squire.bankloadouts.BankLoadout;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.movement.Movement;
@TaskDesc(name = "Withdrawing items", priority = 2147482647, blocking = true)
/* renamed from: k.-.u.u.l.i.s.r.c.d.-.q.u.e.u.e.e.s.s.l.q  reason: invalid package and case insensitive filesystem */
/* loaded from: 2266a50d-0893-46c4-a132-50718fc51d1a.jar:k/-/u/u/l/i/s/r/c/d/-/q/u/e/u/e/e/s/s/l/q.class */
public class C0016q extends AbstractC0013n {
    private static /* synthetic */ int[] lIllIlIllllI;
    private static /* synthetic */ String[] lIllIlIlllIl;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v29, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v36, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v42, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v46, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v48, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v16, types: [boolean] */
    @Override // k.p000.u.u.l.i.s.r.c.d.p001.q.u.e.u.e.e.s.s.l.AbstractC0013n
    public boolean R() {
        if (lllIlIIIlIIllI(P() ? 1 : 0)) {
            return lIllIlIllllI[0];
        }
        BankLoadout Q = Q();
        if (lllIlIIIlIIlll(Q)) {
            Log.error(lIllIlIlllIl[lIllIlIllllI[0]]);
            return lIllIlIllllI[0];
        } else if (lllIlIIIlIIllI(Q.needsToBank() ? 1 : 0)) {
            Log.info(lIllIlIlllIl[lIllIlIllllI[1]]);
            this.w.g(lIllIlIllllI[0]);
            return lIllIlIllllI[0];
        } else if (!lllIlIIIlIIllI(Bank.isOpen() ? 1 : 0)) {
            if (lllIlIIIlIIllI(BankLoadouts.withdrawWithRetries(Q, lIllIlIllllI[4]).booleanValue() ? 1 : 0)) {
                Log.info(lIllIlIlllIl[lIllIlIllllI[5]]);
            }
            return lIllIlIllllI[1];
        } else {
            TileObject nearest = TileObjects.getNearest(this.ae.bank().H(), tileObject -> {
                String[] strArr = new String[lIllIlIllllI[1]];
                strArr[lIllIlIllllI[0]] = lIllIlIlllIl[lIllIlIllllI[6]];
                if (!lllIlIIIlIIllI(tileObject.hasAction(strArr) ? 1 : 0) || lllIlIIIlIlIII(tileObject.getName().contains(lIllIlIlllIl[lIllIlIllllI[7]]) ? 1 : 0)) {
                    ?? r0 = lIllIlIllllI[1];
                    "".length();
                    return !((true ^ true) ^ (true ^ true)) ? ((((76 + 142) - 184) + 132) ^ (((76 + 24) - 72) + 111)) & (((103 ^ 68) ^ (157 ^ 147)) ^ (-" ".length())) : r0;
                }
                return lIllIlIllllI[0];
            });
            if (lllIlIIIlIIlll(nearest)) {
                Movement.walkTo(this.ae.bank().H());
                "".length();
                return lIllIlIllllI[1];
            }
            String[] strArr = new String[lIllIlIllllI[2]];
            strArr[lIllIlIllllI[0]] = lIllIlIlllIl[lIllIlIllllI[2]];
            strArr[lIllIlIllllI[1]] = lIllIlIlllIl[lIllIlIllllI[3]];
            nearest.interact(strArr);
            return lIllIlIllllI[1];
        }
    }

    private static boolean lllIlIIIlIIllI(int i) {
        return i == 0;
    }

    private static boolean lllIlIIIlIlIII(int i) {
        return i != 0;
    }

    private static boolean lllIlIIIlIlIIl(int i, int i2) {
        return i < i2;
    }

    private static boolean lllIlIIIlIIlll(Object obj) {
        return obj == null;
    }

    private static String lllIlIIIlIIIll(String lllllllllllllllIlIllllIIIIllllII, String lllllllllllllllIlIllllIIIIlllIll) {
        try {
            SecretKeySpec lllllllllllllllIlIllllIIIIllllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIllllIIIIlllIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIllllIIIIlllllI = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIllllIIIIlllllI.init(lIllIlIllllI[2], lllllllllllllllIlIllllIIIIllllll);
            return new String(lllllllllllllllIlIllllIIIIlllllI.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIllllIIIIllllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIllllIIIIllllIl) {
            lllllllllllllllIlIllllIIIIllllIl.printStackTrace();
            return null;
        }
    }

    private static void lllIlIIIlIIlIl() {
        lIllIlIllllI = new int[10];
        lIllIlIllllI[0] = (37 ^ 99) & ((103 ^ 33) ^ (-1));
        lIllIlIllllI[1] = " ".length();
        lIllIlIllllI[2] = "  ".length();
        lIllIlIllllI[3] = "   ".length();
        lIllIlIllllI[4] = (122 ^ 107) ^ (179 ^ 168);
        lIllIlIllllI[5] = (162 ^ 139) ^ (89 ^ 116);
        lIllIlIllllI[6] = 184 ^ 189;
        lIllIlIllllI[7] = 160 ^ 166;
        lIllIlIllllI[8] = 8 ^ 15;
        lIllIlIllllI[9] = (91 ^ 23) ^ (222 ^ 154);
    }

    static {
        lllIlIIIlIIlIl();
        lllIlIIIlIIlII();
    }

    private static void lllIlIIIlIIlII() {
        lIllIlIlllIl = new String[lIllIlIllllI[8]];
        lIllIlIlllIl[lIllIlIllllI[0]] = lllIlIIIlIIIIl("y2MhJn5BLX3el41T1b5uyDr3cGEODxhUFIKfrz4vRB8=", "OJRrZ");
        lIllIlIlllIl[lIllIlIllllI[1]] = lllIlIIIlIIIIl("dosoHLzDg+BpvkQIv6qsPg==", "qgVrn");
        lIllIlIlllIl[lIllIlIllllI[2]] = lllIlIIIlIIIIl("JX4CTSwmx6A=", "lIARC");
        lIllIlIlllIl[lIllIlIllllI[3]] = lllIlIIIlIIIlI("OyQiKQ==", "yELBp");
        lIllIlIlllIl[lIllIlIllllI[5]] = lllIlIIIlIIIll("pS+P+X2TQzH94BacmACdIOVz6S2/gf6gUXaBebtYJBwqa1x5+OszHg==", "gGPel");
        lIllIlIlllIl[lIllIlIllllI[6]] = lllIlIIIlIIIll("C+tDHD4rkuU=", "MOWiR");
        lIllIlIlllIl[lIllIlIllllI[7]] = lllIlIIIlIIIll("u2rJp5mfldY=", "EkBut");
    }

    private static String lllIlIIIlIIIIl(String lllllllllllllllIlIllllIIIllIIIIl, String lllllllllllllllIlIllllIIIllIIIII) {
        try {
            SecretKeySpec lllllllllllllllIlIllllIIIllIIlII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIllllIIIllIIIII.getBytes(StandardCharsets.UTF_8)), lIllIlIllllI[9]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIllIlIllllI[2], lllllllllllllllIlIllllIIIllIIlII);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIllllIIIllIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIllllIIIllIIIlI) {
            lllllllllllllllIlIllllIIIllIIIlI.printStackTrace();
            return null;
        }
    }

    private static String lllIlIIIlIIIlI(String lllllllllllllllIlIllllIIIlIlIIIl, String lllllllllllllllIlIllllIIIlIlIIII) {
        String lllllllllllllllIlIllllIIIlIlIIIl2 = new String(Base64.getDecoder().decode(lllllllllllllllIlIllllIIIlIlIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlIllllIIIlIIllll = new StringBuilder();
        char[] lllllllllllllllIlIllllIIIlIIlllI = lllllllllllllllIlIllllIIIlIlIIII.toCharArray();
        int lllllllllllllllIlIllllIIIlIIllIl = lIllIlIllllI[0];
        char[] charArray = lllllllllllllllIlIllllIIIlIlIIIl2.toCharArray();
        int lllllllllllllllIlIllllIIIlIIIllI = charArray.length;
        int i = lIllIlIllllI[0];
        while (lllIlIIIlIlIIl(i, lllllllllllllllIlIllllIIIlIIIllI)) {
            char lllllllllllllllIlIllllIIIlIlIIlI = charArray[i];
            lllllllllllllllIlIllllIIIlIIllll.append((char) (lllllllllllllllIlIllllIIIlIlIIlI ^ lllllllllllllllIlIllllIIIlIIlllI[lllllllllllllllIlIllllIIIlIIllIl % lllllllllllllllIlIllllIIIlIIlllI.length]));
            "".length();
            lllllllllllllllIlIllllIIIlIIllIl++;
            i++;
            "".length();
            if ((-"  ".length()) > 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIlIllllIIIlIIllll);
    }
}
