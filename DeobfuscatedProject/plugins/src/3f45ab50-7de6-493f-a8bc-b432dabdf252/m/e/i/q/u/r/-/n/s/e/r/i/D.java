/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Locatable
 *  net.runelite.api.Player
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 */
package m.e.i.q.u.r.-.n.s.e.r.i;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.mining.SquireMiner;
import gg.squire.mining.SquireMinerConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import m.e.i.q.u.r.-.n.s.e.r.i.C;
import m.e.i.q.u.r.-.n.s.e.r.i.T;
import net.runelite.api.Locatable;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;

@TaskDesc(name="Repairing struts", priority=25, blocking=true)
public class D
extends C {
    private final /* synthetic */ WorldPoint aa;
    private final /* synthetic */ WorldPoint ab;
    private static /* synthetic */ int[] lllllIIlIllI;
    private static /* synthetic */ String[] lllllIIlIlIl;

    private static boolean lIIlIIlIllIlIII(Object object) {
        return object == null;
    }

    private static void lIIlIIlIllIIlII() {
        lllllIIlIllI = new int[13];
        D.lllllIIlIllI[0] = 0xFFFFEEAE & 0x1FF9;
        D.lllllIIlIllI[1] = 0xFFFFFF29 & 0x16FF;
        D.lllllIIlIllI[2] = (0xB ^ 0x4F) & ~(0x14 ^ 0x50);
        D.lllllIIlIllI[3] = 0xFFFFFF9F & 0xEFD;
        D.lllllIIlIllI[4] = -(0xFFFFED9D & 0x1BEF) & (0xFFFFDFFF & 0x3FAF);
        D.lllllIIlIllI[5] = " ".length();
        D.lllllIIlIllI[6] = "  ".length();
        D.lllllIIlIllI[7] = 0xFFFFFF7B & 0x9AF;
        D.lllllIIlIllI[8] = 0xFFFFFFFF & 0x2EEB;
        D.lllllIIlIllI[9] = "   ".length();
        D.lllllIIlIllI[10] = 0x54 ^ 0x5C;
        D.lllllIIlIllI[11] = " ".length() ^ (0xC7 ^ 0xC2);
        D.lllllIIlIllI[12] = 0x6B ^ 0x3B ^ (0x6C ^ 0x39);
    }

    static {
        D.lIIlIIlIllIIlII();
        D.lIIlIIlIllIIIll();
    }

    @Inject
    public D(SquireMinerConfig squireMinerConfig, SquireMiner squireMiner, T t2) {
        super(squireMinerConfig, squireMiner, t2);
        this.aa = new WorldPoint(lllllIIlIllI[0], lllllIIlIllI[1], lllllIIlIllI[2]);
        this.ab = new WorldPoint(lllllIIlIllI[3], lllllIIlIllI[4], lllllIIlIllI[2]);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean t() {
        void var3_4;
        D lllllllllllllllIIlIIlIlllllllllI;
        if (D.lIIlIIlIllIIlIl(this.Z.M())) {
            return lllllIIlIllI[2];
        }
        if (D.lIIlIIlIllIIlIl(lllllllllllllllIIlIIlIlllllllllI.Z.J() ? 1 : 0)) {
            return lllllIIlIllI[2];
        }
        String[] stringArray = new String[lllllIIlIllI[5]];
        stringArray[D.lllllIIlIllI[2]] = lllllIIlIlIl[lllllIIlIllI[2]];
        List lllllllllllllllIIlIIlIllllllllIl = TileObjects.getAll((String[])stringArray);
        if (D.lIIlIIlIllIIllI(lllllllllllllllIIlIIlIllllllllIl.size(), lllllIIlIllI[6])) {
            return lllllIIlIllI[2];
        }
        if (D.lIIlIIlIllIIlIl(Movement.shouldWalk() ? 1 : 0)) {
            return lllllIIlIllI[2];
        }
        Player lllllllllllllllIIlIIlIllllllllII = Players.getLocal();
        int[] nArray = new int[lllllIIlIllI[5]];
        nArray[D.lllllIIlIllI[2]] = lllllIIlIllI[7];
        if (D.lIIlIIlIllIIlIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
            if (D.lIIlIIlIllIIlll(Inventory.isFull() ? 1 : 0)) {
                int[] nArray2 = new int[lllllIIlIllI[5]];
                nArray2[D.lllllIIlIllI[2]] = lllllIIlIllI[8];
                if (D.lIIlIIlIllIIlll(Inventory.contains((int[])nArray2) ? 1 : 0)) {
                    int[] nArray3 = new int[lllllIIlIllI[5]];
                    nArray3[D.lllllIIlIllI[2]] = lllllIIlIllI[8];
                    Inventory.getFirst((int[])nArray3).drop();
                    return lllllIIlIllI[5];
                }
            }
            String[] stringArray2 = new String[lllllIIlIllI[5]];
            stringArray2[D.lllllIIlIllI[2]] = lllllIIlIlIl[lllllIIlIllI[5]];
            TileObject lllllllllllllllIIlIIlIlllllllIll = TileObjects.getNearest((WorldPoint)lllllllllllllllIIlIIlIlllllllllI.aa, (String[])stringArray2);
            if (D.lIIlIIlIllIlIII(lllllllllllllllIIlIIlIlllllllIll)) {
                return lllllIIlIllI[2];
            }
            if (D.lIIlIIlIllIlIIl(lllllllllllllllIIlIIlIlllllllIll.distanceTo((Locatable)lllllllllllllllIIlIIlIllllllllII), lllllIIlIllI[6])) {
                Movement.walkTo((WorldPoint)lllllllllllllllIIlIIlIlllllllllI.aa);
                "".length();
                return lllllIIlIllI[5];
            }
            lllllllllllllllIIlIIlIlllllllIll.interact(lllllIIlIlIl[lllllIIlIllI[6]]);
            return lllllIIlIllI[5];
        }
        String[] stringArray3 = new String[lllllIIlIllI[5]];
        stringArray3[D.lllllIIlIllI[2]] = lllllIIlIlIl[lllllIIlIllI[9]];
        TileObject lllllllllllllllIIlIIlIlllllllIll = TileObjects.getNearest((String[])stringArray3);
        if (D.lIIlIIlIllIlIII(lllllllllllllllIIlIIlIlllllllIll)) {
            return lllllIIlIllI[2];
        }
        if (D.lIIlIIlIllIlIIl(lllllllllllllllIIlIIlIlllllllIll.distanceTo((Locatable)lllllllllllllllIIlIIlIllllllllII), lllllIIlIllI[10])) {
            Movement.walkTo((WorldPoint)lllllllllllllllIIlIIlIlllllllllI.ab);
            "".length();
            return lllllIIlIllI[5];
        }
        var3_4.interact(lllllIIlIlIl[lllllIIlIllI[11]]);
        return lllllIIlIllI[5];
    }

    private static boolean lIIlIIlIllIIlll(int n2) {
        return n2 != 0;
    }

    private static boolean lIIlIIlIllIIllI(int n2, int n3) {
        return n2 < n3;
    }

    private static String lIIlIIlIllIIIlI(String lllllllllllllllIIlIIlIllllIllIll, String lllllllllllllllIIlIIlIllllIllIlI) {
        try {
            SecretKeySpec lllllllllllllllIIlIIlIllllIllllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIIlIllllIllIlI.getBytes(StandardCharsets.UTF_8)), lllllIIlIllI[10]), "DES");
            Cipher lllllllllllllllIIlIIlIllllIlllIl = Cipher.getInstance("DES");
            lllllllllllllllIIlIIlIllllIlllIl.init(lllllIIlIllI[6], lllllllllllllllIIlIIlIllllIllllI);
            return new String(lllllllllllllllIIlIIlIllllIlllIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIIlIllllIllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIlIIlIllllIlllII) {
            lllllllllllllllIIlIIlIllllIlllII.printStackTrace();
            return null;
        }
    }

    private static void lIIlIIlIllIIIll() {
        lllllIIlIlIl = new String[lllllIIlIllI[12]];
        D.lllllIIlIlIl[D.lllllIIlIllI[2]] = D.lIIlIIlIllIIIIl("KxgkBQQHSjgaExwe", "ijKna");
        D.lllllIIlIlIl[D.lllllIIlIllI[5]] = D.lIIlIIlIllIIIlI("/f3By3WFDok=", "mDljk");
        D.lllllIIlIlIl[D.lllllIIlIllI[6]] = D.lIIlIIlIllIIIIl("KzU5JgsQ", "xPXTh");
        D.lllllIIlIlIl[D.lllllIIlIllI[9]] = D.lIIlIIlIllIIIIl("EAENBg08UxEZGicH", "Rsbmh");
        D.lllllIIlIlIl[D.lllllIIlIllI[11]] = D.lIIlIIlIllIIIIl("CzgkOgox", "CYIWo");
    }

    private static boolean lIIlIIlIllIlIIl(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIIlIIlIllIIlIl(int n2) {
        return n2 == 0;
    }

    private static String lIIlIIlIllIIIIl(String lllllllllllllllIIlIIlIlllllIlIll, String lllllllllllllllIIlIIlIlllllIllll) {
        lllllllllllllllIIlIIlIlllllIlIll = new String(Base64.getDecoder().decode(lllllllllllllllIIlIIlIlllllIlIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIlIIlIlllllIlllI = new StringBuilder();
        char[] lllllllllllllllIIlIIlIlllllIllIl = lllllllllllllllIIlIIlIlllllIllll.toCharArray();
        int lllllllllllllllIIlIIlIlllllIllII = lllllIIlIllI[2];
        char[] lllllllllllllllIIlIIlIlllllIIllI = lllllllllllllllIIlIIlIlllllIlIll.toCharArray();
        int lllllllllllllllIIlIIlIlllllIIlIl = lllllllllllllllIIlIIlIlllllIIllI.length;
        int lllllllllllllllIIlIIlIlllllIIlII = lllllIIlIllI[2];
        while (D.lIIlIIlIllIIllI(lllllllllllllllIIlIIlIlllllIIlII, lllllllllllllllIIlIIlIlllllIIlIl)) {
            char lllllllllllllllIIlIIlIllllllIIIl = lllllllllllllllIIlIIlIlllllIIllI[lllllllllllllllIIlIIlIlllllIIlII];
            lllllllllllllllIIlIIlIlllllIlllI.append((char)(lllllllllllllllIIlIIlIllllllIIIl ^ lllllllllllllllIIlIIlIlllllIllIl[lllllllllllllllIIlIIlIlllllIllII % lllllllllllllllIIlIIlIlllllIllIl.length]));
            "".length();
            ++lllllllllllllllIIlIIlIlllllIllII;
            ++lllllllllllllllIIlIIlIlllllIIlII;
            "".length();
            if (null == null) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIIlIIlIlllllIlllI);
    }
}

