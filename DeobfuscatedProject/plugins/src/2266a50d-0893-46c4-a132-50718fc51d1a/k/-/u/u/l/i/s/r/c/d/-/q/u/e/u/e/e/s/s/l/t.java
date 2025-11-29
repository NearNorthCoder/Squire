/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.client.Static
 */
package k.-.u.u.l.i.s.r.c.d.-.q.u.e.u.e.e.s.s.l;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.duke.SquireDukeSucellus;
import gg.squire.duke.SquireDukeSucellusConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import k.-.u.u.l.i.s.r.c.d.-.q.u.e.u.e.e.s.s.l.a;
import k.-.u.u.l.i.s.r.c.d.-.q.u.e.u.e.e.s.s.l.e;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.client.Static;

@TaskDesc(name="Dodge Gaze", priority=500, blocking=true)
public class t
extends Task {
    final /* synthetic */ SquireDukeSucellus aG;
    private static /* synthetic */ String[] lIllIlllIIlI;
    final /* synthetic */ a aH;
    private static /* synthetic */ int[] lIllIlllIIll;
    final /* synthetic */ SquireDukeSucellusConfig aI;

    private static boolean lllIlIIllIllll(Object object) {
        return object == null;
    }

    private static boolean lllIlIIlllIIIl(int n2, int n3) {
        return n2 <= n3;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var2_2;
        t lllllllllllllllIlIlllIlIIllIllll;
        NPC nPC2 = NPCs.getNearest(nPC -> nPC.getName().equals(lIllIlllIIlI[lIllIlllIIll[1]]));
        if (t.lllIlIIllIllll(nPC2)) {
            return lIllIlllIIll[0];
        }
        TileObject lllllllllllllllIlIlllIlIIllIllIl = TileObjects.getNearest(tileObject -> {
            int n2;
            if (t.lllIlIIlllIIII(tileObject.getName().equals(lIllIlllIIlI[lIllIlllIIll[0]]) ? 1 : 0)) {
                String[] stringArray = new String[lIllIlllIIll[2]];
                stringArray[t.lIllIlllIIll[0]] = lIllIlllIIlI[lIllIlllIIll[2]];
                if (t.lllIlIIlllIIII(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lIllIlllIIll[2];
                    "".length();
                    if (" ".length() < "   ".length()) return n2 != 0;
                    return ((0x2A ^ 1) & ~(0x2D ^ 6)) != 0;
                }
            }
            n2 = lIllIlllIIll[0];
            return n2 != 0;
        });
        if (t.lllIlIIllIllll(lllllllllllllllIlIlllIlIIllIllIl)) {
            return lIllIlllIIll[0];
        }
        Player lllllllllllllllIlIlllIlIIllIllII = Players.getLocal();
        if (t.lllIlIIllIllll(lllllllllllllllIlIlllIlIIllIllII)) {
            return lIllIlllIIll[0];
        }
        int lllllllllllllllIlIlllIlIIllIlIll = Static.getClient().getTickCount();
        int lllllllllllllllIlIlllIlIIllIlIlI = lllllllllllllllIlIlllIlIIllIlIll - lllllllllllllllIlIlllIlIIllIllll.aH.C();
        if (t.lllIlIIlllIIII(lllllllllllllllIlIlllIlIIllIllll.aI.safeDodge() ? 1 : 0) && !t.lllIlIIlllIIIl(lllllllllllllllIlIlllIlIIllIlIlI, lIllIlllIIll[1]) || t.lllIlIIlllIIlI(lllllllllllllllIlIlllIlIIllIllll.aI.safeDodge() ? 1 : 0) && t.lllIlIIlllIIll(lllllllllllllllIlIlllIlIIllIlIlI, lIllIlllIIll[1])) {
            return lIllIlllIIll[0];
        }
        if (t.lllIlIIlllIIII(e.r(lllllllllllllllIlIlllIlIIllIllIl) ? 1 : 0)) {
            Movement.setDestination((WorldPoint)e.o(lllllllllllllllIlIlllIlIIllIllIl));
            return lIllIlllIIll[2];
        }
        Movement.setDestination((WorldPoint)e.m((TileObject)var2_2));
        return lIllIlllIIll[2];
    }

    private static void lllIlIIllIllIl() {
        lIllIlllIIlI = new String[lIllIlllIIll[3]];
        t.lIllIlllIIlI[t.lIllIlllIIll[0]] = t.lllIlIIllIllII("1Z+YPtOH3Ac=", "npoyk");
        t.lIllIlllIIlI[t.lIllIlllIIll[2]] = t.lllIlIIllIllII("mKRLdiXbDtmltHkacX8mNw==", "EFPlg");
        t.lIllIlllIIlI[t.lIllIlllIIll[1]] = t.lllIlIIllIllII("Sx+J0+nWkOu+a9e2vjC2Hw==", "sJYgK");
    }

    @Inject
    public t(SquireDukeSucellus squireDukeSucellus, SquireDukeSucellusConfig squireDukeSucellusConfig) {
        this.aG = squireDukeSucellus;
        this.aH = squireDukeSucellus.s();
        this.aI = squireDukeSucellusConfig;
    }

    private static boolean lllIlIIlllIIlI(int n2) {
        return n2 == 0;
    }

    private static void lllIlIIllIlllI() {
        lIllIlllIIll = new int[4];
        t.lIllIlllIIll[0] = (0x39 ^ 0x6B) & ~(0x13 ^ 0x41);
        t.lIllIlllIIll[1] = "  ".length();
        t.lIllIlllIIll[2] = " ".length();
        t.lIllIlllIIll[3] = "   ".length();
    }

    private static boolean lllIlIIlllIIII(int n2) {
        return n2 != 0;
    }

    private static boolean lllIlIIlllIIll(int n2, int n3) {
        return n2 != n3;
    }

    private static String lllIlIIllIllII(String lllllllllllllllIlIlllIlIIlIllllI, String lllllllllllllllIlIlllIlIIlIlllll) {
        try {
            SecretKeySpec lllllllllllllllIlIlllIlIIllIIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlllIlIIlIlllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIlllIlIIllIIIlI = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIlllIlIIllIIIlI.init(lIllIlllIIll[1], lllllllllllllllIlIlllIlIIllIIIll);
            return new String(lllllllllllllllIlIlllIlIIllIIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlllIlIIlIllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIlllIlIIllIIIIl) {
            lllllllllllllllIlIlllIlIIllIIIIl.printStackTrace();
            return null;
        }
    }

    static {
        t.lllIlIIllIlllI();
        t.lllIlIIllIllIl();
    }
}

