/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.client.plugins.squire.BankLoadouts
 *  net.runelite.client.plugins.squire.bankloadouts.BankLoadout
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.movement.Movement
 */
package k.-.u.u.l.i.s.r.c.d.-.q.u.e.u.e.e.s.s.l;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import k.-.u.u.l.i.s.r.c.d.-.q.u.e.u.e.e.s.s.l.n;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.plugins.squire.BankLoadouts;
import net.runelite.client.plugins.squire.bankloadouts.BankLoadout;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.movement.Movement;

@TaskDesc(name="Withdrawing items", priority=2147482647, blocking=true)
public class q
extends n {
    private static /* synthetic */ int[] lIllIlIllllI;
    private static /* synthetic */ String[] lIllIlIlllIl;

    @Override
    public boolean R() {
        q lllllllllllllllIlIllllIIIllIllIl;
        if (q.lllIlIIIlIIllI(this.P() ? 1 : 0)) {
            return lIllIlIllllI[0];
        }
        BankLoadout lllllllllllllllIlIllllIIIllIllII = lllllllllllllllIlIllllIIIllIllIl.Q();
        if (q.lllIlIIIlIIlll(lllllllllllllllIlIllllIIIllIllII)) {
            Log.error((String)lIllIlIlllIl[lIllIlIllllI[0]]);
            return lIllIlIllllI[0];
        }
        if (q.lllIlIIIlIIllI(lllllllllllllllIlIllllIIIllIllII.needsToBank() ? 1 : 0)) {
            Log.info((String)lIllIlIlllIl[lIllIlIllllI[1]]);
            lllllllllllllllIlIllllIIIllIllIl.w.g(lIllIlIllllI[0]);
            return lIllIlIllllI[0];
        }
        if (q.lllIlIIIlIIllI(Bank.isOpen() ? 1 : 0)) {
            TileObject lllllllllllllllIlIllllIIIllIlIll = TileObjects.getNearest((WorldPoint)lllllllllllllllIlIllllIIIllIllIl.ae.bank().H(), tileObject -> {
                boolean bl;
                String[] stringArray = new String[lIllIlIllllI[1]];
                stringArray[q.lIllIlIllllI[0]] = lIllIlIlllIl[lIllIlIllllI[6]];
                if (!q.lllIlIIIlIIllI(tileObject.hasAction(stringArray) ? 1 : 0) || q.lllIlIIIlIlIII(tileObject.getName().contains(lIllIlIlllIl[lIllIlIllllI[7]]) ? 1 : 0)) {
                    bl = lIllIlIllllI[1];
                    "".length();
                    if ((0x43 ^ 0x6B ^ (0x1A ^ 0x36)) == 0) {
                        return ((76 + 142 - 184 + 132 ^ 76 + 24 - 72 + 111) & (0x67 ^ 0x44 ^ (0x9D ^ 0x93) ^ -" ".length())) != 0;
                    }
                } else {
                    bl = lIllIlIllllI[0];
                }
                return bl;
            });
            if (q.lllIlIIIlIIlll(lllllllllllllllIlIllllIIIllIlIll)) {
                Movement.walkTo((WorldPoint)lllllllllllllllIlIllllIIIllIllIl.ae.bank().H());
                "".length();
                return lIllIlIllllI[1];
            }
            String[] stringArray = new String[lIllIlIllllI[2]];
            stringArray[q.lIllIlIllllI[0]] = lIllIlIlllIl[lIllIlIllllI[2]];
            stringArray[q.lIllIlIllllI[1]] = lIllIlIlllIl[lIllIlIllllI[3]];
            lllllllllllllllIlIllllIIIllIlIll.interact(stringArray);
            return lIllIlIllllI[1];
        }
        if (q.lllIlIIIlIIllI(BankLoadouts.withdrawWithRetries((BankLoadout)lllllllllllllllIlIllllIIIllIllII, (int)lIllIlIllllI[4]).booleanValue() ? 1 : 0)) {
            Log.info((String)lIllIlIlllIl[lIllIlIllllI[5]]);
        }
        return lIllIlIllllI[1];
    }

    private static boolean lllIlIIIlIIllI(int n2) {
        return n2 == 0;
    }

    private static boolean lllIlIIIlIlIII(int n2) {
        return n2 != 0;
    }

    private static boolean lllIlIIIlIlIIl(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lllIlIIIlIIlll(Object object) {
        return object == null;
    }

    private static String lllIlIIIlIIIll(String lllllllllllllllIlIllllIIIIllllII, String lllllllllllllllIlIllllIIIIlllIIl) {
        try {
            SecretKeySpec lllllllllllllllIlIllllIIIIllllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIllllIIIIlllIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIllllIIIIlllllI = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIllllIIIIlllllI.init(lIllIlIllllI[2], lllllllllllllllIlIllllIIIIllllll);
            return new String(lllllllllllllllIlIllllIIIIlllllI.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIllllIIIIllllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIllllIIIIllllIl) {
            lllllllllllllllIlIllllIIIIllllIl.printStackTrace();
            return null;
        }
    }

    private static void lllIlIIIlIIlIl() {
        lIllIlIllllI = new int[10];
        q.lIllIlIllllI[0] = (0x25 ^ 0x63) & ~(0x67 ^ 0x21);
        q.lIllIlIllllI[1] = " ".length();
        q.lIllIlIllllI[2] = "  ".length();
        q.lIllIlIllllI[3] = "   ".length();
        q.lIllIlIllllI[4] = 0x7A ^ 0x6B ^ (0xB3 ^ 0xA8);
        q.lIllIlIllllI[5] = 0xA2 ^ 0x8B ^ (0x59 ^ 0x74);
        q.lIllIlIllllI[6] = 0xB8 ^ 0xBD;
        q.lIllIlIllllI[7] = 0xA0 ^ 0xA6;
        q.lIllIlIllllI[8] = 8 ^ 0xF;
        q.lIllIlIllllI[9] = 0x5B ^ 0x17 ^ (0xDE ^ 0x9A);
    }

    static {
        q.lllIlIIIlIIlIl();
        q.lllIlIIIlIIlII();
    }

    private static void lllIlIIIlIIlII() {
        lIllIlIlllIl = new String[lIllIlIllllI[8]];
        q.lIllIlIlllIl[q.lIllIlIllllI[0]] = q.lllIlIIIlIIIIl("y2MhJn5BLX3el41T1b5uyDr3cGEODxhUFIKfrz4vRB8=", "OJRrZ");
        q.lIllIlIlllIl[q.lIllIlIllllI[1]] = q.lllIlIIIlIIIIl("dosoHLzDg+BpvkQIv6qsPg==", "qgVrn");
        q.lIllIlIlllIl[q.lIllIlIllllI[2]] = q.lllIlIIIlIIIIl("JX4CTSwmx6A=", "lIARC");
        q.lIllIlIlllIl[q.lIllIlIllllI[3]] = q.lllIlIIIlIIIlI("OyQiKQ==", "yELBp");
        q.lIllIlIlllIl[q.lIllIlIllllI[5]] = q.lllIlIIIlIIIll("pS+P+X2TQzH94BacmACdIOVz6S2/gf6gUXaBebtYJBwqa1x5+OszHg==", "gGPel");
        q.lIllIlIlllIl[q.lIllIlIllllI[6]] = q.lllIlIIIlIIIll("C+tDHD4rkuU=", "MOWiR");
        q.lIllIlIlllIl[q.lIllIlIllllI[7]] = q.lllIlIIIlIIIll("u2rJp5mfldY=", "EkBut");
    }

    private static String lllIlIIIlIIIIl(String lllllllllllllllIlIllllIIIlIlllll, String lllllllllllllllIlIllllIIIllIIIII) {
        try {
            SecretKeySpec lllllllllllllllIlIllllIIIllIIlII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIllllIIIllIIIII.getBytes(StandardCharsets.UTF_8)), lIllIlIllllI[9]), "DES");
            Cipher lllllllllllllllIlIllllIIIllIIIll = Cipher.getInstance("DES");
            lllllllllllllllIlIllllIIIllIIIll.init(lIllIlIllllI[2], lllllllllllllllIlIllllIIIllIIlII);
            return new String(lllllllllllllllIlIllllIIIllIIIll.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIllllIIIlIlllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIllllIIIllIIIlI) {
            lllllllllllllllIlIllllIIIllIIIlI.printStackTrace();
            return null;
        }
    }

    private static String lllIlIIIlIIIlI(String lllllllllllllllIlIllllIIIlIIllII, String lllllllllllllllIlIllllIIIlIIlIll) {
        lllllllllllllllIlIllllIIIlIIllII = new String(Base64.getDecoder().decode(lllllllllllllllIlIllllIIIlIIllII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlIllllIIIlIIllll = new StringBuilder();
        char[] lllllllllllllllIlIllllIIIlIIlllI = lllllllllllllllIlIllllIIIlIIlIll.toCharArray();
        int lllllllllllllllIlIllllIIIlIIllIl = lIllIlIllllI[0];
        char[] lllllllllllllllIlIllllIIIlIIIlll = lllllllllllllllIlIllllIIIlIIllII.toCharArray();
        int lllllllllllllllIlIllllIIIlIIIllI = lllllllllllllllIlIllllIIIlIIIlll.length;
        int lllllllllllllllIlIllllIIIlIIIlIl = lIllIlIllllI[0];
        while (q.lllIlIIIlIlIIl(lllllllllllllllIlIllllIIIlIIIlIl, lllllllllllllllIlIllllIIIlIIIllI)) {
            char lllllllllllllllIlIllllIIIlIlIIlI = lllllllllllllllIlIllllIIIlIIIlll[lllllllllllllllIlIllllIIIlIIIlIl];
            lllllllllllllllIlIllllIIIlIIllll.append((char)(lllllllllllllllIlIllllIIIlIlIIlI ^ lllllllllllllllIlIllllIIIlIIlllI[lllllllllllllllIlIllllIIIlIIllIl % lllllllllllllllIlIllllIIIlIIlllI.length]));
            "".length();
            ++lllllllllllllllIlIllllIIIlIIllIl;
            ++lllllllllllllllIlIllllIIIlIIIlIl;
            "".length();
            if (-"  ".length() <= 0) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIlIllllIIIlIIllll);
    }
}

