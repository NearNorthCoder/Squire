/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Actor
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

@TaskDesc(name="Attack Duke West", priority=300, blocking=true)
public class s
extends Task {
    private static /* synthetic */ String[] lIllIlIIlllI;
    final /* synthetic */ a aF;
    private static /* synthetic */ int[] lIllIlIIllll;
    final /* synthetic */ SquireDukeSucellus aE;

    private static String lllIIlllIllIll(String lllllllllllllllIlIlllllIIlIIlIll, String lllllllllllllllIlIlllllIIlIIlIlI) {
        try {
            SecretKeySpec lllllllllllllllIlIlllllIIlIlIIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlllllIIlIIlIlI.getBytes(StandardCharsets.UTF_8)), lIllIlIIllll[7]), "DES");
            Cipher lllllllllllllllIlIlllllIIlIIllll = Cipher.getInstance("DES");
            lllllllllllllllIlIlllllIIlIIllll.init(lIllIlIIllll[1], lllllllllllllllIlIlllllIIlIlIIII);
            return new String(lllllllllllllllIlIlllllIIlIIllll.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlllllIIlIIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIlllllIIlIIlllI) {
            lllllllllllllllIlIlllllIIlIIlllI.printStackTrace();
            return null;
        }
    }

    private static boolean lllIIllllIIlII(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lllIIlllIlllll(int n2) {
        return n2 != 0;
    }

    private static String lllIIlllIllIIl(String lllllllllllllllIlIlllllIIlIllIlI, String lllllllllllllllIlIlllllIIlIlIlll) {
        try {
            SecretKeySpec lllllllllllllllIlIlllllIIlIlllIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlllllIIlIlIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIlllllIIlIlllII = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIlllllIIlIlllII.init(lIllIlIIllll[1], lllllllllllllllIlIlllllIIlIlllIl);
            return new String(lllllllllllllllIlIlllllIIlIlllII.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlllllIIlIllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIlllllIIlIllIll) {
            lllllllllllllllIlIlllllIIlIllIll.printStackTrace();
            return null;
        }
    }

    private static boolean lllIIlllIllllI(Object object) {
        return object == null;
    }

    private static boolean lllIIllllIIIlI(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean lllIIllllIIIll(Object object) {
        return object != null;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var2_2;
        s lllllllllllllllIlIlllllIlIIIIlII;
        NPC nPC2 = NPCs.getNearest(nPC -> {
            int n2;
            if (s.lllIIlllIlllll(nPC.getName().equals(lIllIlIIlllI[lIllIlIIllll[5]]) ? 1 : 0)) {
                String[] stringArray = new String[lIllIlIIllll[3]];
                stringArray[s.lIllIlIIllll[0]] = lIllIlIIlllI[lIllIlIIllll[2]];
                if (s.lllIIlllIlllll(nPC.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lIllIlIIllll[3];
                    "".length();
                    if (((0x7D ^ 0x3A) & ~(0xF7 ^ 0xB0)) == 0) return n2 != 0;
                    return ((0x80 ^ 0x8A) & ~(0x2F ^ 0x25)) != 0;
                }
            }
            n2 = lIllIlIIllll[0];
            return n2 != 0;
        });
        if (s.lllIIlllIllllI(nPC2)) {
            return lIllIlIIllll[0];
        }
        TileObject lllllllllllllllIlIlllllIlIIIIIlI = TileObjects.getNearest(tileObject -> {
            int n2;
            if (s.lllIIlllIlllll(tileObject.getName().equals(lIllIlIIlllI[lIllIlIIllll[1]]) ? 1 : 0)) {
                String[] stringArray = new String[lIllIlIIllll[3]];
                stringArray[s.lIllIlIIllll[0]] = lIllIlIIlllI[lIllIlIIllll[4]];
                if (s.lllIIlllIlllll(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lIllIlIIllll[3];
                    "".length();
                    if (((0x42 ^ 0x46) & ~(0x34 ^ 0x30)) < "   ".length()) return n2 != 0;
                    return ((0x12 ^ 0x3A) & ~(0x36 ^ 0x1E)) != 0;
                }
            }
            n2 = lIllIlIIllll[0];
            return n2 != 0;
        });
        if (s.lllIIlllIllllI(lllllllllllllllIlIlllllIlIIIIIlI)) {
            return lIllIlIIllll[0];
        }
        Player lllllllllllllllIlIlllllIlIIIIIIl = Players.getLocal();
        if (s.lllIIlllIllllI(lllllllllllllllIlIlllllIlIIIIIIl)) {
            return lIllIlIIllll[0];
        }
        if (!s.lllIIlllIlllll(e.l(lllllllllllllllIlIlllllIlIIIIIlI).contains((Locatable)lllllllllllllllIlIlllllIlIIIIIIl) ? 1 : 0) || s.lllIIllllIIIII(e.q(lllllllllllllllIlIlllllIlIIIIIlI) ? 1 : 0)) {
            return lIllIlIIllll[0];
        }
        int lllllllllllllllIlIlllllIlIIIIIII = Static.getClient().getTickCount();
        lllllllllllllllIlIlllllIlIIIIlII.aE.b(lIllIlIIllll[0]);
        if (s.lllIIllllIIIIl(lllllllllllllllIlIlllllIlIIIIIII - lllllllllllllllIlIlllllIlIIIIlII.aF.D(), lIllIlIIllll[1]) && s.lllIIllllIIIlI(lllllllllllllllIlIlllllIlIIIIIII - lllllllllllllllIlIlllllIlIIIIlII.aF.C(), lIllIlIIllll[2])) {
            void lllllllllllllllIlIlllllIlIIIIIll;
            int lllllllllllllllIlIlllllIIllllllI;
            int n2;
            Actor lllllllllllllllIlIlllllIIlllllll = Players.getLocal().getInteracting();
            if (s.lllIIllllIIIll(lllllllllllllllIlIlllllIIlllllll) && s.lllIIlllIlllll(lllllllllllllllIlIlllllIIlllllll.hasAction(lIllIlIIlllI[lIllIlIIllll[0]]::equals) ? 1 : 0)) {
                n2 = lIllIlIIllll[3];
                "".length();
                if ("  ".length() != "  ".length()) {
                    return ((0x5B ^ 0x46 ^ (0x30 ^ 0x21)) & (111 + 55 - 148 + 137 ^ 86 + 111 - 129 + 83 ^ -" ".length())) != 0;
                }
            } else {
                n2 = lIllIlIIllll[0];
            }
            if (s.lllIIlllIlllll(lllllllllllllllIlIlllllIIllllllI = n2)) {
                return lIllIlIIllll[3];
            }
            lllllllllllllllIlIlllllIlIIIIIll.interact(lIllIlIIlllI[lIllIlIIllll[3]]);
            return lIllIlIIllll[3];
        }
        Movement.setDestination((WorldPoint)e.m((TileObject)var2_2));
        return lIllIlIIllll[3];
    }

    private static boolean lllIIllllIIIII(int n2) {
        return n2 == 0;
    }

    @Inject
    public s(SquireDukeSucellus squireDukeSucellus) {
        this.aE = squireDukeSucellus;
        this.aF = squireDukeSucellus.s();
    }

    private static void lllIIlllIlllII() {
        lIllIlIIlllI = new String[lIllIlIIllll[6]];
        s.lIllIlIIlllI[s.lIllIlIIllll[0]] = s.lllIIlllIllIIl("3cSKh6jOeGo=", "pafRa");
        s.lIllIlIIlllI[s.lIllIlIIllll[3]] = s.lllIIlllIllIlI("KhwQEBoA", "khdqy");
        s.lIllIlIIlllI[s.lIllIlIIllll[1]] = s.lllIIlllIllIlI("FhIHAQ==", "Qssdz");
        s.lIllIlIIlllI[s.lIllIlIIllll[4]] = s.lllIIlllIllIIl("GxeEvIP97/Vu2W2FkD3fzw==", "FCxYe");
        s.lIllIlIIlllI[s.lIllIlIIllll[5]] = s.lllIIlllIllIll("FD38bAdfl3DornmKxW9PPg==", "reZtP");
        s.lIllIlIIlllI[s.lIllIlIIllll[2]] = s.lllIIlllIllIlI("AgIVCjAo", "CvakS");
    }

    private static boolean lllIIllllIIIIl(int n2, int n3) {
        return n2 > n3;
    }

    private static String lllIIlllIllIlI(String lllllllllllllllIlIlllllIIllIlIlI, String lllllllllllllllIlIlllllIIllIlllI) {
        lllllllllllllllIlIlllllIIllIlIlI = new String(Base64.getDecoder().decode(lllllllllllllllIlIlllllIIllIlIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlIlllllIIllIllIl = new StringBuilder();
        char[] lllllllllllllllIlIlllllIIllIllII = lllllllllllllllIlIlllllIIllIlllI.toCharArray();
        int lllllllllllllllIlIlllllIIllIlIll = lIllIlIIllll[0];
        char[] lllllllllllllllIlIlllllIIllIIlIl = lllllllllllllllIlIlllllIIllIlIlI.toCharArray();
        int lllllllllllllllIlIlllllIIllIIlII = lllllllllllllllIlIlllllIIllIIlIl.length;
        int lllllllllllllllIlIlllllIIllIIIll = lIllIlIIllll[0];
        while (s.lllIIllllIIlII(lllllllllllllllIlIlllllIIllIIIll, lllllllllllllllIlIlllllIIllIIlII)) {
            char lllllllllllllllIlIlllllIIlllIIII = lllllllllllllllIlIlllllIIllIIlIl[lllllllllllllllIlIlllllIIllIIIll];
            lllllllllllllllIlIlllllIIllIllIl.append((char)(lllllllllllllllIlIlllllIIlllIIII ^ lllllllllllllllIlIlllllIIllIllII[lllllllllllllllIlIlllllIIllIlIll % lllllllllllllllIlIlllllIIllIllII.length]));
            "".length();
            ++lllllllllllllllIlIlllllIIllIlIll;
            ++lllllllllllllllIlIlllllIIllIIIll;
            "".length();
            if ("  ".length() >= 0) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIlIlllllIIllIllIl);
    }

    static {
        s.lllIIlllIlllIl();
        s.lllIIlllIlllII();
    }

    private static void lllIIlllIlllIl() {
        lIllIlIIllll = new int[8];
        s.lIllIlIIllll[0] = (0x2A ^ 0x34) & ~(0x8F ^ 0x91);
        s.lIllIlIIllll[1] = "  ".length();
        s.lIllIlIIllll[2] = 166 + 95 - 259 + 193 ^ 100 + 70 - 151 + 179;
        s.lIllIlIIllll[3] = " ".length();
        s.lIllIlIIllll[4] = "   ".length();
        s.lIllIlIIllll[5] = 0x32 ^ 0x7F ^ (0xE4 ^ 0xAD);
        s.lIllIlIIllll[6] = 63 + 116 - 60 + 41 ^ 132 + 151 - 184 + 67;
        s.lIllIlIIllll[7] = 0x2E ^ 0x26;
    }
}

