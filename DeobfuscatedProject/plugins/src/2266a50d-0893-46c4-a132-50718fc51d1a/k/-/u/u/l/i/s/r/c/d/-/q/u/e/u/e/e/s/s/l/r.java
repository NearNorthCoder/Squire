/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Actor
 *  net.runelite.api.GraphicsObject
 *  net.runelite.api.Locatable
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
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import k.-.u.u.l.i.s.r.c.d.-.q.u.e.u.e.e.s.s.l.a;
import k.-.u.u.l.i.s.r.c.d.-.q.u.e.u.e.e.s.s.l.e;
import net.runelite.api.Actor;
import net.runelite.api.GraphicsObject;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.client.Static;

@TaskDesc(name="Attack Duke East", priority=300, blocking=true)
public class r
extends Task {
    final /* synthetic */ SquireDukeSucellus aC;
    final /* synthetic */ a aD;
    private static /* synthetic */ int[] lIllIlllllll;
    private static /* synthetic */ String[] lIllIllllllI;

    private static boolean lllIlIlIIlIllI(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var2_2;
        r lllllllllllllllIlIlllIIlIlIlllII;
        NPC nPC2 = NPCs.getNearest(nPC -> {
            int n2;
            if (r.lllIlIlIIlIllI(nPC.getName().equals(lIllIllllllI[lIllIlllllll[5]]) ? 1 : 0)) {
                String[] stringArray = new String[lIllIlllllll[1]];
                stringArray[r.lIllIlllllll[0]] = lIllIllllllI[lIllIlllllll[3]];
                if (r.lllIlIlIIlIllI(nPC.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lIllIlllllll[1];
                    "".length();
                    if (((0x5B ^ 0x65) & ~(0x73 ^ 0x4D)) == ((0xB2 ^ 0x8F) & ~(0x25 ^ 0x18))) return n2 != 0;
                    return ((0x6D ^ 0x47) & ~(0xB ^ 0x21)) != 0;
                }
            }
            n2 = lIllIlllllll[0];
            return n2 != 0;
        });
        if (r.lllIlIlIIlIlIl(nPC2)) {
            return lIllIlllllll[0];
        }
        TileObject lllllllllllllllIlIlllIIlIlIllIlI = TileObjects.getNearest(tileObject -> {
            int n2;
            if (r.lllIlIlIIlIllI(tileObject.getName().equals(lIllIllllllI[lIllIlllllll[2]]) ? 1 : 0)) {
                String[] stringArray = new String[lIllIlllllll[1]];
                stringArray[r.lIllIlllllll[0]] = lIllIllllllI[lIllIlllllll[4]];
                if (r.lllIlIlIIlIllI(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lIllIlllllll[1];
                    "".length();
                    if (null == null) return n2 != 0;
                    return ((0x5D ^ 0x45) & ~(0x3E ^ 0x26)) != 0;
                }
            }
            n2 = lIllIlllllll[0];
            return n2 != 0;
        });
        if (r.lllIlIlIIlIlIl(lllllllllllllllIlIlllIIlIlIllIlI)) {
            return lIllIlllllll[0];
        }
        Player lllllllllllllllIlIlllIIlIlIllIIl = Players.getLocal();
        if (r.lllIlIlIIlIlIl(lllllllllllllllIlIlllIIlIlIllIIl)) {
            return lIllIlllllll[0];
        }
        if (!r.lllIlIlIIlIllI(e.l(lllllllllllllllIlIlllIIlIlIllIlI).contains((Locatable)lllllllllllllllIlIlllIIlIlIllIIl) ? 1 : 0) || r.lllIlIlIIlIlll(e.r(lllllllllllllllIlIlllIIlIlIllIlI) ? 1 : 0)) {
            return lIllIlllllll[0];
        }
        GraphicsObject lllllllllllllllIlIlllIIlIlIllIII = lllllllllllllllIlIlllIIlIlIlllII.aD.B();
        int lllllllllllllllIlIlllIIlIlIlIlll = Static.getClient().getTickCount();
        lllllllllllllllIlIlllIIlIlIlllII.aC.b(lIllIlllllll[1]);
        if (r.lllIlIlIIllIII(lllllllllllllllIlIlllIIlIlIlIlll - lllllllllllllllIlIlllIIlIlIlllII.aD.D(), lIllIlllllll[2]) && r.lllIlIlIIllIIl(lllllllllllllllIlIlllIIlIlIlIlll - lllllllllllllllIlIlllIIlIlIlllII.aD.C(), lIllIlllllll[3])) {
            void lllllllllllllllIlIlllIIlIlIllIll;
            int lllllllllllllllIlIlllIIlIlIlIlIl;
            int n2;
            Actor lllllllllllllllIlIlllIIlIlIlIllI = Players.getLocal().getInteracting();
            if (r.lllIlIlIIllIlI(lllllllllllllllIlIlllIIlIlIlIllI) && r.lllIlIlIIlIllI(lllllllllllllllIlIlllIIlIlIlIllI.hasAction(lIllIllllllI[lIllIlllllll[0]]::equals) ? 1 : 0)) {
                n2 = lIllIlllllll[1];
                "".length();
                if ((0x57 ^ 0x53) == "  ".length()) {
                    return ((0x97 ^ 0x8A) & ~(0x82 ^ 0x9F)) != 0;
                }
            } else {
                n2 = lIllIlllllll[0];
            }
            if (r.lllIlIlIIlIllI(lllllllllllllllIlIlllIIlIlIlIlIl = n2)) {
                return lIllIlllllll[1];
            }
            lllllllllllllllIlIlllIIlIlIllIll.interact(lIllIllllllI[lIllIlllllll[1]]);
            return lIllIlllllll[1];
        }
        Movement.setDestination((WorldPoint)e.o((TileObject)var2_2));
        return lIllIlllllll[1];
    }

    private static boolean lllIlIlIIllIII(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lllIlIlIIlIlIl(Object object) {
        return object == null;
    }

    private static void lllIlIlIIlIlII() {
        lIllIlllllll = new int[8];
        r.lIllIlllllll[0] = (0xA9 ^ 0xC1 ^ (0x51 ^ 0x68)) & (0xA2 ^ 0xC0 ^ (0x21 ^ 0x12) ^ -" ".length());
        r.lIllIlllllll[1] = " ".length();
        r.lIllIlllllll[2] = "  ".length();
        r.lIllIlllllll[3] = 0x45 ^ 0x40;
        r.lIllIlllllll[4] = "   ".length();
        r.lIllIlllllll[5] = 0x4B ^ 0x4F;
        r.lIllIlllllll[6] = 2 ^ 0x2D ^ (0x55 ^ 0x7C);
        r.lIllIlllllll[7] = 0x43 ^ 0x4B;
    }

    private static boolean lllIlIlIIllIIl(int n2, int n3) {
        return n2 != n3;
    }

    @Inject
    public r(SquireDukeSucellus squireDukeSucellus) {
        this.aC = squireDukeSucellus;
        this.aD = squireDukeSucellus.s();
    }

    private static String lllIlIlIIlIIlI(String lllllllllllllllIlIlllIIlIlIIIllI, String lllllllllllllllIlIlllIIlIlIIIIII) {
        lllllllllllllllIlIlllIIlIlIIIllI = new String(Base64.getDecoder().decode(lllllllllllllllIlIlllIIlIlIIIllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlIlllIIlIlIIIlII = new StringBuilder();
        char[] lllllllllllllllIlIlllIIlIlIIIIll = lllllllllllllllIlIlllIIlIlIIIIII.toCharArray();
        int lllllllllllllllIlIlllIIlIlIIIIlI = lIllIlllllll[0];
        char[] lllllllllllllllIlIlllIIlIIllllII = lllllllllllllllIlIlllIIlIlIIIllI.toCharArray();
        int lllllllllllllllIlIlllIIlIIlllIll = lllllllllllllllIlIlllIIlIIllllII.length;
        int lllllllllllllllIlIlllIIlIIlllIlI = lIllIlllllll[0];
        while (r.lllIlIlIIllIll(lllllllllllllllIlIlllIIlIIlllIlI, lllllllllllllllIlIlllIIlIIlllIll)) {
            char lllllllllllllllIlIlllIIlIlIIIlll = lllllllllllllllIlIlllIIlIIllllII[lllllllllllllllIlIlllIIlIIlllIlI];
            lllllllllllllllIlIlllIIlIlIIIlII.append((char)(lllllllllllllllIlIlllIIlIlIIIlll ^ lllllllllllllllIlIlllIIlIlIIIIll[lllllllllllllllIlIlllIIlIlIIIIlI % lllllllllllllllIlIlllIIlIlIIIIll.length]));
            "".length();
            ++lllllllllllllllIlIlllIIlIlIIIIlI;
            ++lllllllllllllllIlIlllIIlIIlllIlI;
            "".length();
            if (-(19 + 122 - 23 + 18 ^ 105 + 52 - 61 + 44) <= 0) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIlIlllIIlIlIIIlII);
    }

    private static String lllIlIlIIIllIl(String lllllllllllllllIlIlllIIlIIlIllll, String lllllllllllllllIlIlllIIlIIllIIII) {
        try {
            SecretKeySpec lllllllllllllllIlIlllIIlIIllIlII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlllIIlIIllIIII.getBytes(StandardCharsets.UTF_8)), lIllIlllllll[7]), "DES");
            Cipher lllllllllllllllIlIlllIIlIIllIIll = Cipher.getInstance("DES");
            lllllllllllllllIlIlllIIlIIllIIll.init(lIllIlllllll[2], lllllllllllllllIlIlllIIlIIllIlII);
            return new String(lllllllllllllllIlIlllIIlIIllIIll.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlllIIlIIlIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIlllIIlIIllIIlI) {
            lllllllllllllllIlIlllIIlIIllIIlI.printStackTrace();
            return null;
        }
    }

    static {
        r.lllIlIlIIlIlII();
        r.lllIlIlIIlIIll();
    }

    private static boolean lllIlIlIIllIlI(Object object) {
        return object != null;
    }

    private static boolean lllIlIlIIlIlll(int n2) {
        return n2 == 0;
    }

    private static boolean lllIlIlIIllIll(int n2, int n3) {
        return n2 < n3;
    }

    private static void lllIlIlIIlIIll() {
        lIllIllllllI = new String[lIllIlllllll[6]];
        r.lIllIllllllI[r.lIllIlllllll[0]] = r.lllIlIlIIIllIl("hbnZ54ogQSc=", "KIelQ");
        r.lIllIllllllI[r.lIllIlllllll[1]] = r.lllIlIlIIIllIl("PvEXATWZ9QA=", "gtNhG");
        r.lIllIllllllI[r.lIllIlllllll[2]] = r.lllIlIlIIIllIl("/DiKW46NxFY=", "OiRpS");
        r.lIllIllllllI[r.lIllIlllllll[4]] = r.lllIlIlIIIllIl("ua1KSP8HsoqKA+7g8kObCA==", "xnBbm");
        r.lIllIllllllI[r.lIllIlllllll[5]] = r.lllIlIlIIlIIlI("BSwqF2MSLCIXLy0sMg==", "AYArC");
        r.lIllIllllllI[r.lIllIlllllll[3]] = r.lllIlIlIIlIIlI("JwIzKCoN", "fvGII");
    }
}

