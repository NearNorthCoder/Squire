/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.client.Static
 */
package g.r.r.-.t.q.i.u.o.e.s;

import g.r.r.-.t.q.i.u.o.e.s.c;
import g.r.r.-.t.q.i.u.o.e.s.h;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.runecrafting.SquireGOTRPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.client.Static;

@TaskDesc(name="Leaving the altar", blocking=true, priority=5)
public class r
extends h {
    private static /* synthetic */ int[] llIlIIIIIlII;
    private static /* synthetic */ String[] llIlIIIIIIlI;

    private static boolean lIIIIIIIIIlIIII(Object object) {
        return object != null;
    }

    private static String lIIIIIIIIIIIlll(String lllllllllllllllIlIIlIlIlIlIIllll, String lllllllllllllllIlIIlIlIlIlIlIIII) {
        try {
            SecretKeySpec lllllllllllllllIlIIlIlIlIlIlIlII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIlIlIlIlIlIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIIlIlIlIlIlIIll = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIIlIlIlIlIlIIll.init(llIlIIIIIlII[3], lllllllllllllllIlIIlIlIlIlIlIlII);
            return new String(lllllllllllllllIlIIlIlIlIlIlIIll.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIlIlIlIlIIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIIlIlIlIlIlIIlI) {
            lllllllllllllllIlIIlIlIlIlIlIIlI.printStackTrace();
            return null;
        }
    }

    @Inject
    public r(SquireGOTRPlugin squireGOTRPlugin) {
        c[] cArray = new c[llIlIIIIIlII[0]];
        cArray[r.llIlIIIIIlII[1]] = c.ACTIVE;
        cArray[r.llIlIIIIIlII[2]] = c.FINISHING;
        cArray[r.llIlIIIIIlII[3]] = c.OUTSIDE;
        super(squireGOTRPlugin, cArray);
    }

    private static boolean lIIIIIIIIIIlIll(int n2) {
        return n2 <= 0;
    }

    private static void lIIIIIIIIIIlIlI() {
        llIlIIIIIlII = new int[5];
        r.llIlIIIIIlII[0] = "   ".length();
        r.llIlIIIIIlII[1] = (0x41 ^ 0x72 ^ (0xD2 ^ 0xB5)) & (223 + 82 - 197 + 121 ^ 14 + 2 - -109 + 52 ^ -" ".length());
        r.llIlIIIIIlII[2] = " ".length();
        r.llIlIIIIIlII[3] = "  ".length();
        r.llIlIIIIIlII[4] = 0xFFFFE8FF & Short.MAX_VALUE;
    }

    private static boolean lIIIIIIIIIIllIl(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    protected boolean ak() {
        void var2_2;
        r lllllllllllllllIlIIlIlIlIlIlllll;
        int lllllllllllllllIlIIlIlIlIlIllllI;
        int n2;
        int[] nArray = new int[llIlIIIIIlII[2]];
        nArray[r.llIlIIIIIlII[1]] = llIlIIIIIlII[4];
        if (!r.lIIIIIIIIIIlIll(Inventory.getCount((int[])nArray)) || r.lIIIIIIIIIIllII(this.aV.S(), Static.getClient().getTickCount())) {
            n2 = llIlIIIIIlII[2];
            "".length();
            if (-" ".length() < -" ".length()) {
                return ((0x24 ^ 0x2D) & ~(0x50 ^ 0x59)) != 0;
            }
        } else {
            n2 = llIlIIIIIlII[1];
        }
        if (!r.lIIIIIIIIIIllIl(lllllllllllllllIlIIlIlIlIlIllllI = n2) || r.lIIIIIIIIIIlllI(lllllllllllllllIlIIlIlIlIlIlllll.aV.g() ? 1 : 0)) {
            return llIlIIIIIlII[1];
        }
        TileObject lllllllllllllllIlIIlIlIlIlIlllIl = TileObjects.getNearest(tileObject -> {
            int n2;
            if (r.lIIIIIIIIIIlllI(tileObject.getName().contains(llIlIIIIIIlI[llIlIIIIIlII[2]]) ? 1 : 0) && r.lIIIIIIIIIIlllI(tileObject.hasAction(string -> {
                int n2;
                if (r.lIIIIIIIIIlIIII(string) && r.lIIIIIIIIIIlllI(string.equals(llIlIIIIIIlI[llIlIIIIIlII[3]]) ? 1 : 0)) {
                    n2 = llIlIIIIIlII[2];
                    "".length();
                    if ("   ".length() <= " ".length()) {
                        return ((0x69 ^ 0x3A) & ~(0x7E ^ 0x2D)) != 0;
                    }
                } else {
                    n2 = llIlIIIIIlII[1];
                }
                return n2 != 0;
            }) ? 1 : 0)) {
                n2 = llIlIIIIIlII[2];
                "".length();
                if ("   ".length() <= "  ".length()) {
                    return ((0x94 ^ 0xB1) & ~(0x3B ^ 0x1E)) != 0;
                }
            } else {
                n2 = llIlIIIIIlII[1];
            }
            return n2 != 0;
        });
        if (r.lIIIIIIIIIIllll(lllllllllllllllIlIIlIlIlIlIlllIl)) {
            return llIlIIIIIlII[1];
        }
        var2_2.interact(llIlIIIIIIlI[llIlIIIIIlII[1]]);
        this.b(llIlIIIIIlII[2], () -> Players.getLocal().isMoving());
        return llIlIIIIIlII[2];
    }

    static {
        r.lIIIIIIIIIIlIlI();
        r.lIIIIIIIIIIlIIl();
    }

    private static String lIIIIIIIIIIIllI(String lllllllllllllllIlIIlIlIlIIllllII, String lllllllllllllllIlIIlIlIlIlIIIIII) {
        lllllllllllllllIlIIlIlIlIIllllII = new String(Base64.getDecoder().decode(lllllllllllllllIlIIlIlIlIIllllII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlIIlIlIlIIllllll = new StringBuilder();
        char[] lllllllllllllllIlIIlIlIlIIlllllI = lllllllllllllllIlIIlIlIlIlIIIIII.toCharArray();
        int lllllllllllllllIlIIlIlIlIIllllIl = llIlIIIIIlII[1];
        char[] lllllllllllllllIlIIlIlIlIIllIlll = lllllllllllllllIlIIlIlIlIIllllII.toCharArray();
        int lllllllllllllllIlIIlIlIlIIllIllI = lllllllllllllllIlIIlIlIlIIllIlll.length;
        int lllllllllllllllIlIIlIlIlIIllIlIl = llIlIIIIIlII[1];
        while (r.lIIIIIIIIIlIIIl(lllllllllllllllIlIIlIlIlIIllIlIl, lllllllllllllllIlIIlIlIlIIllIllI)) {
            char lllllllllllllllIlIIlIlIlIlIIIIlI = lllllllllllllllIlIIlIlIlIIllIlll[lllllllllllllllIlIIlIlIlIIllIlIl];
            lllllllllllllllIlIIlIlIlIIllllll.append((char)(lllllllllllllllIlIIlIlIlIlIIIIlI ^ lllllllllllllllIlIIlIlIlIIlllllI[lllllllllllllllIlIIlIlIlIIllllIl % lllllllllllllllIlIIlIlIlIIlllllI.length]));
            "".length();
            ++lllllllllllllllIlIIlIlIlIIllllIl;
            ++lllllllllllllllIlIIlIlIlIIllIlIl;
            "".length();
            if (((62 + 128 - 171 + 130 ^ 64 + 40 - -10 + 66) & (0xFB ^ 0x8C ^ (0x3B ^ 0x6D) ^ -" ".length())) == 0) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIlIIlIlIlIIllllll);
    }

    private static boolean lIIIIIIIIIIlllI(int n2) {
        return n2 != 0;
    }

    private static void lIIIIIIIIIIlIIl() {
        llIlIIIIIIlI = new String[llIlIIIIIlII[0]];
        r.llIlIIIIIIlI[r.llIlIIIIIlII[1]] = r.lIIIIIIIIIIIllI("PAMS", "ipweo");
        r.llIlIIIIIIlI[r.llIlIIIIIlII[2]] = r.lIIIIIIIIIIIlll("qr49seXsJH4=", "wGooU");
        r.llIlIIIIIIlI[r.llIlIIIIIlII[3]] = r.lIIIIIIIIIIIllI("Lxof", "zizjO");
    }

    private static boolean lIIIIIIIIIlIIIl(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIIIIIIIIIIllII(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIIIIIIIIIIllll(Object object) {
        return object == null;
    }
}

