/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.widgets.Widget
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.widgets.Widgets
 */
package q.i.e.u.s.s.o.e.i.n.l.f.-.r.o.-.p.-.m.r.o;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.moons.SquireMoonsOfPeril;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.widgets.Widgets;

@TaskDesc(name="Deposit and exit")
public class e
extends Task {
    private static /* synthetic */ int[] lIIIIIIIlIlll;
    private static /* synthetic */ String[] lIIIIIIIlIIll;
    final /* synthetic */ WorldArea M;

    private static boolean lIIlIllIlIlllII(int n) {
        return n != 0;
    }

    private static void lIIlIllIlIllIIl() {
        lIIIIIIIlIlll = new int[18];
        e.lIIIIIIIlIlll[0] = -(0xFFFFBE39 & 0x69EF) & (0xFFFFADFF & 0x7FFB);
        e.lIIIIIIIlIlll[1] = 0xFFFFE57B & 0x3FDD;
        e.lIIIIIIIlIlll[2] = 0x6A ^ 0x41;
        e.lIIIIIIIlIlll[3] = 0xB9 ^ 0x93;
        e.lIIIIIIIlIlll[4] = (0x35 ^ 0x50 ^ (0x88 ^ 0xA6)) & (99 + 99 - 98 + 103 ^ 13 + 25 - 9 + 99 ^ -" ".length());
        e.lIIIIIIIlIlll[5] = 0xFFFFEED6 & 0x37AB;
        e.lIIIIIIIlIlll[6] = " ".length();
        e.lIIIIIIIlIlll[7] = 0xFFFFE7EB & 0x3E97;
        e.lIIIIIIIlIlll[8] = -(0xFFFFFB63 & 0x5DE) & (0xFFFFB7F5 & 0x6FCF);
        e.lIIIIIIIlIlll[9] = -(0xFFFFEC5F & 0x7BA9) & (0xFFFFEB6F & 0x7FFC);
        e.lIIIIIIIlIlll[10] = 0x78 ^ 0x26 ^ (0x1A ^ 0x50);
        e.lIIIIIIIlIlll[11] = "  ".length();
        e.lIIIIIIIlIlll[12] = "   ".length();
        e.lIIIIIIIlIlll[13] = 0x78 ^ 0x7C;
        e.lIIIIIIIlIlll[14] = -(0xFFFFDAF1 & 0x6F1F) & (0xFFFFEFFD & 0x5FFB);
        e.lIIIIIIIlIlll[15] = -(0xFFFFDD9C & 0x32E7) & (0xFFFFFFFF & 0x35FF);
        e.lIIIIIIIlIlll[16] = 0x8A ^ 0xB3 ^ (0xFB ^ 0xC7);
        e.lIIIIIIIlIlll[17] = 0x36 ^ 0x3E;
    }

    private static String lIIlIllIlIIllll(String lllllllllllllllIIIllllllIIIIllll, String lllllllllllllllIIIllllllIIIIllII) {
        try {
            SecretKeySpec lllllllllllllllIIIllllllIIIlIIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIllllllIIIIllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIIllllllIIIlIIIl = Cipher.getInstance("Blowfish");
            lllllllllllllllIIIllllllIIIlIIIl.init(lIIIIIIIlIlll[11], lllllllllllllllIIIllllllIIIlIIlI);
            return new String(lllllllllllllllIIIllllllIIIlIIIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIllllllIIIIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIIllllllIIIlIIII) {
            lllllllllllllllIIIllllllIIIlIIII.printStackTrace();
            return null;
        }
    }

    static {
        e.lIIlIllIlIllIIl();
        e.lIIlIllIlIlIllI();
    }

    private static void lIIlIllIlIlIllI() {
        lIIIIIIIlIIll = new String[lIIIIIIIlIlll[16]];
        e.lIIIIIIIlIIll[e.lIIIIIIIlIlll[4]] = e.lIIlIllIlIIllll("RVgnm9hz977XkPhz82Zdk1bjNcUnnuE1", "jQuzo");
        e.lIIIIIIIlIIll[e.lIIIIIIIlIlll[6]] = e.lIIlIllIlIlIIIl("mTnYCWgYkYhFi+RH8hLsFA==", "vZLEJ");
        e.lIIIIIIIlIIll[e.lIIIIIIIlIlll[11]] = e.lIIlIllIlIIllll("Gg4FFa86SY5AfKHL3kzR0xgGMTemrYZ1", "PaoUR");
        e.lIIIIIIIlIIll[e.lIIIIIIIlIlll[12]] = e.lIIlIllIlIlIlIl("Hi0gA1s6JCEfAykk", "NLSpv");
        e.lIIIIIIIlIIll[e.lIIIIIIIlIlll[13]] = e.lIIlIllIlIlIlIl("LzQhJTYEOTA=", "jZUWW");
    }

    public boolean run() {
        e lllllllllllllllIIIllllllIlIIIIII;
        if (e.lIIlIllIlIllIlI(Vars.getBit((int)lIIIIIIIlIlll[5]), lIIIIIIIlIlll[6]) && e.lIIlIllIlIllIlI(Vars.getBit((int)lIIIIIIIlIlll[7]), lIIIIIIIlIlll[6]) && e.lIIlIllIlIllIlI(Vars.getBit((int)lIIIIIIIlIlll[8]), lIIIIIIIlIlll[6])) {
            return lIIIIIIIlIlll[4];
        }
        if (e.lIIlIllIlIllIll(lllllllllllllllIIIllllllIlIIIIII.M.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            return lIIIIIIIlIlll[4];
        }
        if (e.lIIlIllIlIlllII(lllllllllllllllIIIllllllIlIIIIII.M.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            TileObject lllllllllllllllIIIllllllIIlllllI;
            Widget lllllllllllllllIIIllllllIIllllll = Widgets.get((int)lIIIIIIIlIlll[9], (int)lIIIIIIIlIlll[10]);
            if (e.lIIlIllIlIlllIl(lllllllllllllllIIIllllllIIllllll)) {
                SquireMoonsOfPeril.g = lIIIIIIIlIIll[lIIIIIIIlIlll[4]];
                lllllllllllllllIIIllllllIIllllll.interact(lIIIIIIIlIIll[lIIIIIIIlIlll[6]]);
                return lIIIIIIIlIlll[6];
            }
            if (e.lIIlIllIlIllllI(lllllllllllllllIIIllllllIIllllll) && e.lIIlIllIlIlllIl(lllllllllllllllIIIllllllIIlllllI = TileObjects.getNearest(tileObject -> {
                int n;
                if (e.lIIlIllIlIlllII(tileObject.getName().contains(lIIIIIIIlIIll[lIIIIIIIlIlll[13]]) ? 1 : 0) && e.lIIlIllIlIlllll(tileObject.getWorldLocation().distanceTo(new WorldPoint(lIIIIIIIlIlll[14], lIIIIIIIlIlll[15], lIIIIIIIlIlll[4])), lIIIIIIIlIlll[16])) {
                    n = lIIIIIIIlIlll[6];
                    "".length();
                    if (((0x2A ^ 7) & ~(0x31 ^ 0x1C)) <= -" ".length()) {
                        return ((0xA6 ^ 0x9E) & ~(0x87 ^ 0xBF)) != 0;
                    }
                } else {
                    n = lIIIIIIIlIlll[4];
                }
                return n != 0;
            }))) {
                SquireMoonsOfPeril.g = lIIIIIIIlIIll[lIIIIIIIlIlll[11]];
                lllllllllllllllIIIllllllIIlllllI.interact(lIIIIIIIlIIll[lIIIIIIIlIlll[12]]);
                return lIIIIIIIlIlll[6];
            }
        }
        return lIIIIIIIlIlll[4];
    }

    private static boolean lIIlIllIllIIIII(int n, int n2) {
        return n < n2;
    }

    private static String lIIlIllIlIlIIIl(String lllllllllllllllIIIllllllIIIlllII, String lllllllllllllllIIIllllllIIIllIIl) {
        try {
            SecretKeySpec lllllllllllllllIIIllllllIIIlllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIllllllIIIllIIl.getBytes(StandardCharsets.UTF_8)), lIIIIIIIlIlll[17]), "DES");
            Cipher lllllllllllllllIIIllllllIIIllllI = Cipher.getInstance("DES");
            lllllllllllllllIIIllllllIIIllllI.init(lIIIIIIIlIlll[11], lllllllllllllllIIIllllllIIIlllll);
            return new String(lllllllllllllllIIIllllllIIIllllI.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIllllllIIIlllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIIllllllIIIlllIl) {
            lllllllllllllllIIIllllllIIIlllIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIllIlIllIll(int n) {
        return n == 0;
    }

    private static String lIIlIllIlIlIlIl(String lllllllllllllllIIIllllllIIllIIIl, String lllllllllllllllIIIllllllIIllIIII) {
        lllllllllllllllIIIllllllIIllIIIl = new String(Base64.getDecoder().decode(lllllllllllllllIIIllllllIIllIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIIllllllIIlIllll = new StringBuilder();
        char[] lllllllllllllllIIIllllllIIlIlllI = lllllllllllllllIIIllllllIIllIIII.toCharArray();
        int lllllllllllllllIIIllllllIIlIllIl = lIIIIIIIlIlll[4];
        char[] lllllllllllllllIIIllllllIIlIIlll = lllllllllllllllIIIllllllIIllIIIl.toCharArray();
        int lllllllllllllllIIIllllllIIlIIllI = lllllllllllllllIIIllllllIIlIIlll.length;
        int lllllllllllllllIIIllllllIIlIIlIl = lIIIIIIIlIlll[4];
        while (e.lIIlIllIllIIIII(lllllllllllllllIIIllllllIIlIIlIl, lllllllllllllllIIIllllllIIlIIllI)) {
            char lllllllllllllllIIIllllllIIllIIlI = lllllllllllllllIIIllllllIIlIIlll[lllllllllllllllIIIllllllIIlIIlIl];
            lllllllllllllllIIIllllllIIlIllll.append((char)(lllllllllllllllIIIllllllIIllIIlI ^ lllllllllllllllIIIllllllIIlIlllI[lllllllllllllllIIIllllllIIlIllIl % lllllllllllllllIIIllllllIIlIlllI.length]));
            "".length();
            ++lllllllllllllllIIIllllllIIlIllIl;
            ++lllllllllllllllIIIllllllIIlIIlIl;
            "".length();
            if (-" ".length() < 0) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIIIllllllIIlIllll);
    }

    private static boolean lIIlIllIlIllllI(Object object) {
        return object == null;
    }

    private static boolean lIIlIllIlIlllll(int n, int n2) {
        return n <= n2;
    }

    private static boolean lIIlIllIlIllIlI(int n, int n2) {
        return n == n2;
    }

    public e() {
        this.M = new WorldArea(lIIIIIIIlIlll[0], lIIIIIIIlIlll[1], lIIIIIIIlIlll[2], lIIIIIIIlIlll[3], lIIIIIIIlIlll[4]);
    }

    private static boolean lIIlIllIlIlllIl(Object object) {
        return object != null;
    }
}

