/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.magic.Thralls
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
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.magic.Thralls;

@TaskDesc(name="Using thrall", priority=4999)
public class C
extends Task {
    private static /* synthetic */ String[] lIllIIllllIl;
    private static /* synthetic */ int[] lIllIIlllllI;
    private final /* synthetic */ a be;
    private final /* synthetic */ SquireDukeSucellus bd;

    private static String lllIIllIIlIIll(String lllllllllllllllIllIIIIIIlIIlIlII, String lllllllllllllllIllIIIIIIlIIlIIll) {
        lllllllllllllllIllIIIIIIlIIlIlII = new String(Base64.getDecoder().decode(lllllllllllllllIllIIIIIIlIIlIlII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIllIIIIIIlIIlIIlI = new StringBuilder();
        char[] lllllllllllllllIllIIIIIIlIIlIIIl = lllllllllllllllIllIIIIIIlIIlIIll.toCharArray();
        int lllllllllllllllIllIIIIIIlIIlIIII = lIllIIlllllI[0];
        char[] lllllllllllllllIllIIIIIIlIIIlIlI = lllllllllllllllIllIIIIIIlIIlIlII.toCharArray();
        int lllllllllllllllIllIIIIIIlIIIlIIl = lllllllllllllllIllIIIIIIlIIIlIlI.length;
        int lllllllllllllllIllIIIIIIlIIIlIII = lIllIIlllllI[0];
        while (C.lllIIllIIllIIl(lllllllllllllllIllIIIIIIlIIIlIII, lllllllllllllllIllIIIIIIlIIIlIIl)) {
            char lllllllllllllllIllIIIIIIlIIlIlIl = lllllllllllllllIllIIIIIIlIIIlIlI[lllllllllllllllIllIIIIIIlIIIlIII];
            lllllllllllllllIllIIIIIIlIIlIIlI.append((char)(lllllllllllllllIllIIIIIIlIIlIlIl ^ lllllllllllllllIllIIIIIIlIIlIIIl[lllllllllllllllIllIIIIIIlIIlIIII % lllllllllllllllIllIIIIIIlIIlIIIl.length]));
            0;
            ++lllllllllllllllIllIIIIIIlIIlIIII;
            ++lllllllllllllllIllIIIIIIlIIIlIII;
            0;
            if (null == null) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIllIIIIIIlIIlIIlI);
    }

    private static void lllIIllIIlIlII() {
        lIllIIllllIl = new String[lIllIIlllllI[4]];
        C.lIllIIllllIl[C.lIllIIlllllI[0]] = C."Gate";
        C.lIllIIllllIl[C.lIllIIlllllI[1]] = C."Quick-escape";
        C.lIllIIllllIl[C.lIllIIlllllI[2]] = C."Duke Sucellus";
        C.lIllIIllllIl[C.lIllIIlllllI[3]] = C."Attack";
    }

    private static boolean lllIIllIIlIllI(int n2) {
        return n2 == 0;
    }

    @Inject
    public C(SquireDukeSucellus squireDukeSucellus, a a2) {
        this.bd = squireDukeSucellus;
        this.be = a2;
    }

    private static boolean lllIIllIIllIII(int n2) {
        return n2 != 0;
    }

    static {
        C.lllIIllIIlIlIl();
        C.lllIIllIIlIlII();
    }

    private static boolean lllIIllIIllIIl(int n2, int n3) {
        return n2 < n3;
    }

    public boolean run() {
        if (C.lllIIllIIlIllI(Thralls.canUse() ? 1 : 0)) {
            return lIllIIlllllI[0];
        }
        NPC lllllllllllllllIllIIIIIIlIlIIlIl = NPCs.getNearest(nPC -> {
            int n2;
            if (C.lllIIllIIllIII(nPC.getName().equals(lIllIIllllIl[lIllIIlllllI[2]]) ? 1 : 0)) {
                String[] stringArray = new String[lIllIIlllllI[1]];
                stringArray[C.lIllIIlllllI[0]] = lIllIIllllIl[lIllIIlllllI[3]];
                if (C.lllIIllIIllIII(nPC.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lIllIIlllllI[1];
                    0;
                    if (((0xA ^ 0x25) & ~(0x24 ^ 0xB)) == 0) return n2 != 0;
                    return ((0x42 ^ 0x5D) & ~(0xDD ^ 0xC2)) != 0;
                }
            }
            n2 = lIllIIlllllI[0];
            return n2 != 0;
        });
        if (C.lllIIllIIlIlll(lllllllllllllllIllIIIIIIlIlIIlIl)) {
            return lIllIIlllllI[0];
        }
        TileObject lllllllllllllllIllIIIIIIlIlIIlII = TileObjects.getNearest(tileObject -> {
            int n2;
            if (C.lllIIllIIllIII(tileObject.getName().equals(lIllIIllllIl[lIllIIlllllI[0]]) ? 1 : 0)) {
                String[] stringArray = new String[lIllIIlllllI[1]];
                stringArray[C.lIllIIlllllI[0]] = lIllIIllllIl[lIllIIlllllI[1]];
                if (C.lllIIllIIllIII(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lIllIIlllllI[1];
                    0;
                    if (((0x67 ^ 0x39 ^ (0x56 ^ 0x2A)) & (0xD8 ^ 0xC1 ^ (0x2B ^ 0x10) ^ -1)) <= (((0xF2 ^ 0xAF) & ~(0x66 ^ 0x3B) ^ (0x9E ^ 0xC4)) & (0x76 ^ 0x38 ^ (0 ^ 0x14) ^ -1))) return n2 != 0;
                    return ((11 + 53 - -20 + 96 ^ 35 + 87 - 24 + 64) & (0xBE ^ 0x9A ^ (0xA5 ^ 0x97) ^ -1)) != 0;
                }
            }
            n2 = lIllIIlllllI[0];
            return n2 != 0;
        });
        if (C.lllIIllIIlIlll(lllllllllllllllIllIIIIIIlIlIIlII)) {
            return lIllIIlllllI[0];
        }
        Player lllllllllllllllIllIIIIIIlIlIIIll = Players.getLocal();
        if (C.lllIIllIIlIlll(lllllllllllllllIllIIIIIIlIlIIIll)) {
            return lIllIIlllllI[0];
        }
        if (C.lllIIllIIlIllI(e.l(lllllllllllllllIllIIIIIIlIlIIlII).contains((Locatable)lllllllllllllllIllIIIIIIlIlIIIll) ? 1 : 0) && C.lllIIllIIlIllI(e.q(lllllllllllllllIllIIIIIIlIlIIlII) ? 1 : 0) && C.lllIIllIIlIllI(e.r(lllllllllllllllIllIIIIIIlIlIIlII) ? 1 : 0)) {
            return lIllIIlllllI[0];
        }
        return Thralls.useBestThrall();
    }

    private static String lllIIllIIlIIlI(String lllllllllllllllIllIIIIIIIlllllIl, String lllllllllllllllIllIIIIIIIlllllII) {
        try {
            SecretKeySpec lllllllllllllllIllIIIIIIlIIIIIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIIIIIIIlllllII.getBytes(StandardCharsets.UTF_8)), lIllIIlllllI[5]), "DES");
            Cipher lllllllllllllllIllIIIIIIlIIIIIIl = Cipher.getInstance("DES");
            lllllllllllllllIllIIIIIIlIIIIIIl.init(lIllIIlllllI[2], lllllllllllllllIllIIIIIIlIIIIIlI);
            return new String(lllllllllllllllIllIIIIIIlIIIIIIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIIIIIIIlllllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIllIIIIIIlIIIIIII) {
            lllllllllllllllIllIIIIIIlIIIIIII.printStackTrace();
            return null;
        }
    }

    private static void lllIIllIIlIlIl() {
        lIllIIlllllI = new int[6];
        C.lIllIIlllllI[0] = (0x83 ^ 0x92) & ~(0x91 ^ 0x80);
        C.lIllIIlllllI[1] = 1;
        C.lIllIIlllllI[2] = 2;
        C.lIllIIlllllI[3] = 3;
        C.lIllIIlllllI[4] = 9 ^ 0xD;
        C.lIllIIlllllI[5] = 0x1D ^ 0x6A ^ 85 + 31 - -5 + 6;
    }

    private static boolean lllIIllIIlIlll(Object object) {
        return object == null;
    }
}

