/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.NPC
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.movement.Movement
 */
package k.-.u.u.l.i.s.r.c.d.-.q.u.e.u.e.e.s.s.l;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.duke.SquireDukeSucellus;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import k.-.u.u.l.i.s.r.c.d.-.q.u.e.u.e.e.s.s.l.a;
import k.-.u.u.l.i.s.r.c.d.-.q.u.e.u.e.e.s.s.l.e;
import net.runelite.api.NPC;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Movement;

@TaskDesc(name="Swapping Sides", priority=301, blocking=true)
public class B
extends Task {
    final /* synthetic */ SquireDukeSucellus bb;
    final /* synthetic */ a bc;
    private static /* synthetic */ String[] lIllIlIIllIl;
    private static /* synthetic */ int[] lIllIlIllIlI;

    private static void lllIIlllIllIII() {
        lIllIlIIllIl = new String[lIllIlIllIlI[4]];
        B.lIllIlIIllIl[B.lIllIlIllIlI[0]] = B.lllIIlllIlIlIl("FoKjsPoeGSE=", "bDnMc");
        B.lIllIlIIllIl[B.lIllIlIllIlI[1]] = B.lllIIlllIlIllI("EB4zMC1sDikwJzEO", "AkZSF");
        B.lIllIlIIllIl[B.lIllIlIllIlI[2]] = B.lllIIlllIlIlll("WxO3uYnNYZiPlNX6LYy5ww==", "MthGp");
        B.lIllIlIIllIl[B.lIllIlIllIlI[3]] = B.lllIIlllIlIlIl("U2G0ZT+2+Os=", "KhLyY");
    }

    private static boolean lllIlIIIIlIlll(int n2, int n3) {
        return n2 < n3;
    }

    static {
        B.lllIlIIIIlIIll();
        B.lllIIlllIllIII();
    }

    private static boolean lllIlIIIIlIllI(int n2) {
        return n2 != 0;
    }

    private static String lllIIlllIlIlll(String lllllllllllllllIlIllllIIllIlIlIl, String lllllllllllllllIlIllllIIllIlIIlI) {
        try {
            SecretKeySpec lllllllllllllllIlIllllIIllIllIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIllllIIllIlIIlI.getBytes(StandardCharsets.UTF_8)), lIllIlIllIlI[5]), "DES");
            Cipher lllllllllllllllIlIllllIIllIlIlll = Cipher.getInstance("DES");
            lllllllllllllllIlIllllIIllIlIlll.init(lIllIlIllIlI[2], lllllllllllllllIlIllllIIllIllIII);
            return new String(lllllllllllllllIlIllllIIllIlIlll.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIllllIIllIlIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIllllIIllIlIllI) {
            lllllllllllllllIlIllllIIllIlIllI.printStackTrace();
            return null;
        }
    }

    private static String lllIIlllIlIlIl(String lllllllllllllllIlIllllIIllIIlIII, String lllllllllllllllIlIllllIIllIIIlIl) {
        try {
            SecretKeySpec lllllllllllllllIlIllllIIllIIlIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIllllIIllIIIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIllllIIllIIlIlI = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIllllIIllIIlIlI.init(lIllIlIllIlI[2], lllllllllllllllIlIllllIIllIIlIll);
            return new String(lllllllllllllllIlIllllIIllIIlIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIllllIIllIIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIllllIIllIIlIIl) {
            lllllllllllllllIlIllllIIllIIlIIl.printStackTrace();
            return null;
        }
    }

    private static String lllIIlllIlIllI(String lllllllllllllllIlIllllIIlIlllIII, String lllllllllllllllIlIllllIIlIllIIlI) {
        lllllllllllllllIlIllllIIlIlllIII = new String(Base64.getDecoder().decode(lllllllllllllllIlIllllIIlIlllIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlIllllIIlIllIllI = new StringBuilder();
        char[] lllllllllllllllIlIllllIIlIllIlIl = lllllllllllllllIlIllllIIlIllIIlI.toCharArray();
        int lllllllllllllllIlIllllIIlIllIlII = lIllIlIllIlI[0];
        char[] lllllllllllllllIlIllllIIlIlIlllI = lllllllllllllllIlIllllIIlIlllIII.toCharArray();
        int lllllllllllllllIlIllllIIlIlIllIl = lllllllllllllllIlIllllIIlIlIlllI.length;
        int lllllllllllllllIlIllllIIlIlIllII = lIllIlIllIlI[0];
        while (B.lllIlIIIIlIlll(lllllllllllllllIlIllllIIlIlIllII, lllllllllllllllIlIllllIIlIlIllIl)) {
            char lllllllllllllllIlIllllIIlIlllIIl = lllllllllllllllIlIllllIIlIlIlllI[lllllllllllllllIlIllllIIlIlIllII];
            lllllllllllllllIlIllllIIlIllIllI.append((char)(lllllllllllllllIlIllllIIlIlllIIl ^ lllllllllllllllIlIllllIIlIllIlIl[lllllllllllllllIlIllllIIlIllIlII % lllllllllllllllIlIllllIIlIllIlIl.length]));
            "".length();
            ++lllllllllllllllIlIllllIIlIllIlII;
            ++lllllllllllllllIlIllllIIlIlIllII;
            "".length();
            if (" ".length() < "   ".length()) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIlIllllIIlIllIllI);
    }

    private static boolean lllIlIIIIlIlII(int n2) {
        return n2 == 0;
    }

    @Inject
    public B(SquireDukeSucellus squireDukeSucellus) {
        this.bb = squireDukeSucellus;
        this.bc = squireDukeSucellus.s();
    }

    private static void lllIlIIIIlIIll() {
        lIllIlIllIlI = new int[6];
        B.lIllIlIllIlI[0] = (0xB ^ 0x34) & ~(3 ^ 0x3C);
        B.lIllIlIllIlI[1] = " ".length();
        B.lIllIlIllIlI[2] = "  ".length();
        B.lIllIlIllIlI[3] = "   ".length();
        B.lIllIlIllIlI[4] = 0x32 ^ 0x36;
        B.lIllIlIllIlI[5] = 0x75 ^ 0x7D;
    }

    private static boolean lllIlIIIIlIlIl(Object object) {
        return object == null;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var2_2;
        B lllllllllllllllIlIllllIIlllIIlII;
        if (B.lllIlIIIIlIlII(this.bb.k() ? 1 : 0)) {
            return lIllIlIllIlI[0];
        }
        NPC lllllllllllllllIlIllllIIlllIIIll = NPCs.getNearest(nPC -> {
            int n2;
            if (B.lllIlIIIIlIllI(nPC.getName().equals(lIllIlIIllIl[lIllIlIllIlI[2]]) ? 1 : 0)) {
                String[] stringArray = new String[lIllIlIllIlI[1]];
                stringArray[B.lIllIlIllIlI[0]] = lIllIlIIllIl[lIllIlIllIlI[3]];
                if (B.lllIlIIIIlIllI(nPC.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lIllIlIllIlI[1];
                    "".length();
                    if (null == null) return n2 != 0;
                    return ((0x9E ^ 0x92) & ~(0x89 ^ 0x85)) != 0;
                }
            }
            n2 = lIllIlIllIlI[0];
            return n2 != 0;
        });
        if (B.lllIlIIIIlIlIl(lllllllllllllllIlIllllIIlllIIIll)) {
            lllllllllllllllIlIllllIIlllIIlII.bb.c(lIllIlIllIlI[0]);
            return lIllIlIllIlI[0];
        }
        TileObject lllllllllllllllIlIllllIIlllIIIlI = TileObjects.getNearest(tileObject -> {
            int n2;
            if (B.lllIlIIIIlIllI(tileObject.getName().equals(lIllIlIIllIl[lIllIlIllIlI[0]]) ? 1 : 0)) {
                String[] stringArray = new String[lIllIlIllIlI[1]];
                stringArray[B.lIllIlIllIlI[0]] = lIllIlIIllIl[lIllIlIllIlI[1]];
                if (B.lllIlIIIIlIllI(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lIllIlIllIlI[1];
                    "".length();
                    if ("  ".length() != 0) return n2 != 0;
                    return (" ".length() & ~" ".length()) != 0;
                }
            }
            n2 = lIllIlIllIlI[0];
            return n2 != 0;
        });
        if (B.lllIlIIIIlIlIl(lllllllllllllllIlIllllIIlllIIIlI)) {
            return lIllIlIllIlI[0];
        }
        int lllllllllllllllIlIllllIIlllIIIIl = lllllllllllllllIlIllllIIlllIIlII.bc.j() ? 1 : 0;
        if (B.lllIlIIIIlIllI(lllllllllllllllIlIllllIIlllIIIIl)) {
            if (B.lllIlIIIIlIllI(e.q(lllllllllllllllIlIllllIIlllIIIlI) ? 1 : 0)) {
                lllllllllllllllIlIllllIIlllIIlII.bb.c(lIllIlIllIlI[0]);
                return lIllIlIllIlI[0];
            }
            Movement.setDestination((WorldPoint)e.m(lllllllllllllllIlIllllIIlllIIIlI));
            return lIllIlIllIlI[1];
        }
        if (B.lllIlIIIIlIllI(e.r(lllllllllllllllIlIllllIIlllIIIlI) ? 1 : 0)) {
            lllllllllllllllIlIllllIIlllIIlII.bb.c(lIllIlIllIlI[0]);
        }
        Movement.setDestination((WorldPoint)e.o((TileObject)var2_2));
        return lIllIlIllIlI[1];
    }
}

