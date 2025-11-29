/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.Player
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.client.Static
 */
package p.s.o.t.u.m.r.s.i.e.s.-.o.e.r.q;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.tempoross.SquireTempoross;
import gg.squire.tempoross.SquireTemporossConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.client.Static;
import p.s.o.t.u.m.r.s.i.e.s.-.o.e.r.q.a;
import p.s.o.t.u.m.r.s.i.e.s.-.o.e.r.q.x;

@TaskDesc(name="Boarding ship", priority=10, blocking=true)
public class w
extends x {
    private static /* synthetic */ int[] lIIllIlllIIll;
    private /* synthetic */ int ak;
    private static /* synthetic */ String[] lIIllIlllIIlI;

    private static boolean lIllIIIllIIlIIl(int n2) {
        return n2 != 0;
    }

    private static String lIllIIIllIIIIll(String llllllllllllllIlllIllIlllllIIlll, String llllllllllllllIlllIllIlllllIIllI) {
        try {
            SecretKeySpec llllllllllllllIlllIllIlllllIlIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIllIlllllIIllI.getBytes(StandardCharsets.UTF_8)), lIIllIlllIIll[10]), "DES");
            Cipher llllllllllllllIlllIllIlllllIlIIl = Cipher.getInstance("DES");
            llllllllllllllIlllIllIlllllIlIIl.init(lIIllIlllIIll[6], llllllllllllllIlllIllIlllllIlIlI);
            return new String(llllllllllllllIlllIllIlllllIlIIl.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIllIlllllIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIlllIllIlllllIlIII) {
            llllllllllllllIlllIllIlllllIlIII.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIIIllIIlIll(int n2, int n3) {
        return n2 <= n3;
    }

    static {
        w.lIllIIIllIIIlll();
        w.lIllIIIllIIIllI();
    }

    private static boolean lIllIIIllIIllII(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean al() {
        void var2_2;
        void llllllllllllllIlllIllIllllllIlll;
        Player player = Players.getLocal();
        if (w.lIllIIIllIIlIII(player)) {
            return lIIllIlllIIll[0];
        }
        if (w.lIllIIIllIIlIIl(Static.getClient().isInInstancedRegion() ? 1 : 0)) {
            return lIIllIlllIIll[0];
        }
        String[] stringArray = new String[lIIllIlllIIll[1]];
        stringArray[w.lIIllIlllIIll[0]] = lIIllIlllIIlI[lIIllIlllIIll[0]];
        if (w.lIllIIIllIIlIlI(Inventory.contains((String[])stringArray) ? 1 : 0)) {
            llllllllllllllIlllIllIlllllllIII.ak = lIIllIlllIIll[0];
            return lIIllIlllIIll[0];
        }
        TileObject llllllllllllllIlllIllIllllllIllI = TileObjects.getNearest(tileObject -> {
            int n2;
            if (w.lIllIIIllIIlIIl(tileObject.getName().contains(lIIllIlllIIlI[lIIllIlllIIll[7]]) ? 1 : 0)) {
                String[] stringArray = new String[lIIllIlllIIll[1]];
                stringArray[w.lIIllIlllIIll[0]] = lIIllIlllIIlI[lIIllIlllIIll[8]];
                if (w.lIllIIIllIIlIIl(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lIIllIlllIIll[1];
                    "".length();
                    if ((0x71 ^ 0x75) != "  ".length()) return n2 != 0;
                    return ((0x21 ^ 0x14) & ~(0x25 ^ 0x10)) != 0;
                }
            }
            n2 = lIIllIlllIIll[0];
            return n2 != 0;
        });
        if (w.lIllIIIllIIlIII(llllllllllllllIlllIllIllllllIllI)) {
            return lIIllIlllIIll[0];
        }
        int[] nArray = new int[lIIllIlllIIll[1]];
        nArray[w.lIIllIlllIIll[0]] = lIIllIlllIIll[4];
        TileObject llllllllllllllIlllIllIllllllIlIl = TileObjects.getFirstAt((int)lIIllIlllIIll[2], (int)lIIllIlllIIll[3], (int)lIIllIlllIIll[0], (int[])nArray);
        if (w.lIllIIIllIIlIII(llllllllllllllIlllIllIllllllIlIl)) {
            return lIIllIlllIIll[0];
        }
        if (!w.lIllIIIllIIlIll(llllllllllllllIlllIllIllllllIlll.getWorldLocation().getX(), llllllllllllllIlllIllIllllllIlIl.getWorldLocation().getX()) || w.lIllIIIllIIlIIl(llllllllllllllIlllIllIllllllIlll.isMoving() ? 1 : 0)) {
            return lIIllIlllIIll[0];
        }
        var2_2.interact(lIIllIlllIIlI[lIIllIlllIIll[1]]);
        this.sleepWhile(lIIllIlllIIll[5], () -> {
            boolean bl;
            if (!w.lIllIIIllIIlIlI(player.isMoving() ? 1 : 0) || w.lIllIIIllIIlIIl(Inventory.contains(item -> {
                int n2;
                if (w.lIllIIIllIIlIIl(item.getName().contains(lIIllIlllIIlI[lIIllIlllIIll[6]]) ? 1 : 0)) {
                    String[] stringArray = new String[lIIllIlllIIll[1]];
                    stringArray[w.lIIllIlllIIll[0]] = lIIllIlllIIlI[lIIllIlllIIll[5]];
                    if (w.lIllIIIllIIlIlI(item.hasAction(stringArray) ? 1 : 0)) {
                        n2 = lIIllIlllIIll[1];
                        "".length();
                        if ((0x7E ^ 0x7A) > " ".length()) return n2 != 0;
                        return ((0x98 ^ 0xA0) & ~(0x63 ^ 0x5B)) != 0;
                    }
                }
                n2 = lIIllIlllIIll[0];
                return n2 != 0;
            }) ? 1 : 0)) {
                bl = lIIllIlllIIll[1];
                "".length();
                if ("   ".length() == 0) {
                    return ((0xF2 ^ 0xC1) & ~(0x36 ^ 5)) != 0;
                }
            } else {
                bl = lIIllIlllIIll[0];
            }
            return bl;
        });
        return lIIllIlllIIll[1];
    }

    private static boolean lIllIIIllIIlIlI(int n2) {
        return n2 == 0;
    }

    private static String lIllIIIllIIIlII(String llllllllllllllIlllIllIllllIlIIlI, String llllllllllllllIlllIllIllllIlIllI) {
        llllllllllllllIlllIllIllllIlIIlI = new String(Base64.getDecoder().decode(llllllllllllllIlllIllIllllIlIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIlllIllIllllIlIlIl = new StringBuilder();
        char[] llllllllllllllIlllIllIllllIlIlII = llllllllllllllIlllIllIllllIlIllI.toCharArray();
        int llllllllllllllIlllIllIllllIlIIll = lIIllIlllIIll[0];
        char[] llllllllllllllIlllIllIllllIIllIl = llllllllllllllIlllIllIllllIlIIlI.toCharArray();
        int llllllllllllllIlllIllIllllIIllII = llllllllllllllIlllIllIllllIIllIl.length;
        int llllllllllllllIlllIllIllllIIlIll = lIIllIlllIIll[0];
        while (w.lIllIIIllIIllII(llllllllllllllIlllIllIllllIIlIll, llllllllllllllIlllIllIllllIIllII)) {
            char llllllllllllllIlllIllIllllIllIII = llllllllllllllIlllIllIllllIIllIl[llllllllllllllIlllIllIllllIIlIll];
            llllllllllllllIlllIllIllllIlIlIl.append((char)(llllllllllllllIlllIllIllllIllIII ^ llllllllllllllIlllIllIllllIlIlII[llllllllllllllIlllIllIllllIlIIll % llllllllllllllIlllIllIllllIlIlII.length]));
            "".length();
            ++llllllllllllllIlllIllIllllIlIIll;
            ++llllllllllllllIlllIllIllllIIlIll;
            "".length();
            if ((0x46 ^ 0x42) != 0) continue;
            return null;
        }
        return String.valueOf(llllllllllllllIlllIllIllllIlIlIl);
    }

    private static String lIllIIIllIIIlIl(String llllllllllllllIlllIllIllllIIIIII, String llllllllllllllIlllIllIlllIllllll) {
        try {
            SecretKeySpec llllllllllllllIlllIllIllllIIIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIllIlllIllllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIlllIllIllllIIIlII = Cipher.getInstance("Blowfish");
            llllllllllllllIlllIllIllllIIIlII.init(lIIllIlllIIll[6], llllllllllllllIlllIllIllllIIIlIl);
            return new String(llllllllllllllIlllIllIllllIIIlII.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIllIllllIIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIlllIllIllllIIIIll) {
            llllllllllllllIlllIllIllllIIIIll.printStackTrace();
            return null;
        }
    }

    private static void lIllIIIllIIIllI() {
        lIIllIlllIIlI = new String[lIIllIlllIIll[9]];
        w.lIIllIlllIIlI[w.lIIllIlllIIll[0]] = w.lIllIIIllIIIIll("vDW7i16EzZo=", "mTTec");
        w.lIIllIlllIIlI[w.lIIllIlllIIll[1]] = w.lIllIIIllIIIlII("MBov", "eiJDW");
        w.lIIllIlllIIlI[w.lIIllIlllIIll[6]] = w.lIllIIIllIIIlIl("fr/V/qm4L0E=", "OfdIb");
        w.lIIllIlllIIlI[w.lIIllIlllIIll[5]] = w.lIllIIIllIIIlIl("1wmkp+0HZA8=", "hFcLl");
        w.lIIllIlllIIlI[w.lIIllIlllIIll[7]] = w.lIllIIIllIIIlII("HxcgCyRoBiEDJg==", "HvTnV");
        w.lIIllIlllIIlI[w.lIIllIlllIIll[8]] = w.lIllIIIllIIIlII("LDcn", "yDBHt");
    }

    @Inject
    protected w(a a2, SquireTemporossConfig squireTemporossConfig, Client client, SquireTempoross squireTempoross) {
        super(a2, squireTemporossConfig, client, squireTempoross);
        this.ak = lIIllIlllIIll[0];
    }

    private static boolean lIllIIIllIIlIII(Object object) {
        return object == null;
    }

    private static void lIllIIIllIIIlll() {
        lIIllIlllIIll = new int[11];
        w.lIIllIlllIIll[0] = (0xE3 ^ 0xB2 ^ (0x8D ^ 0x83)) & (0x53 ^ 0 ^ (0x82 ^ 0x8E) ^ -" ".length());
        w.lIIllIlllIIll[1] = " ".length();
        w.lIIllIlllIIll[2] = -(0xFFFFFAFF & 0x37C1) & (0xFFFFBFFF & 0x7EFF);
        w.lIIllIlllIIll[3] = -(0xFFFFF623 & 0x7DDE) & (0xFFFFFFFB & 0x7F1D);
        w.lIIllIlllIIll[4] = 0xFFFFE15D & 0xBFFB;
        w.lIIllIlllIIll[5] = "   ".length();
        w.lIIllIlllIIll[6] = "  ".length();
        w.lIIllIlllIIll[7] = 0x75 ^ 0x71;
        w.lIIllIlllIIll[8] = 88 + 125 - 176 + 109 ^ 105 + 149 - 107 + 4;
        w.lIIllIlllIIll[9] = 0x2E ^ 0x28;
        w.lIIllIlllIIll[10] = 0xD2 ^ 0x85 ^ (0x4D ^ 0x12);
    }
}

