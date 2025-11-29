/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
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

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.mining.SquireMiner;
import gg.squire.mining.SquireMinerConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import m.e.i.q.u.r.-.n.s.e.r.i.a;
import net.runelite.api.Locatable;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;

@TaskDesc(name="Mining sandstone")
public class J
extends Task {
    private static /* synthetic */ int[] lllllIllllIl;
    private static /* synthetic */ String[] lllllIllllII;
    private final /* synthetic */ SquireMiner aj;
    private final /* synthetic */ SquireMinerConfig ak;
    public static final /* synthetic */ int ai;

    private static boolean lIIlIlIIIIIlIll(int n2, int n3) {
        return n2 < n3;
    }

    @Inject
    public J(SquireMiner squireMiner, SquireMinerConfig squireMinerConfig) {
        this.aj = squireMiner;
        this.ak = squireMinerConfig;
    }

    private static String lIIlIIlllllllll(String lllllllllllllllIIlIIlIIIIlIIIIll, String lllllllllllllllIIlIIlIIIIlIIIIlI) {
        lllllllllllllllIIlIIlIIIIlIIIIll = new String(Base64.getDecoder().decode(lllllllllllllllIIlIIlIIIIlIIIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIlIIlIIIIlIIIllI = new StringBuilder();
        char[] lllllllllllllllIIlIIlIIIIlIIIlIl = lllllllllllllllIIlIIlIIIIlIIIIlI.toCharArray();
        int lllllllllllllllIIlIIlIIIIlIIIlII = lllllIllllIl[0];
        char[] lllllllllllllllIIlIIlIIIIIlllllI = lllllllllllllllIIlIIlIIIIlIIIIll.toCharArray();
        int lllllllllllllllIIlIIlIIIIIllllIl = lllllllllllllllIIlIIlIIIIIlllllI.length;
        int lllllllllllllllIIlIIlIIIIIllllII = lllllIllllIl[0];
        while (J.lIIlIlIIIIIlIll(lllllllllllllllIIlIIlIIIIIllllII, lllllllllllllllIIlIIlIIIIIllllIl)) {
            char lllllllllllllllIIlIIlIIIIlIIlIIl = lllllllllllllllIIlIIlIIIIIlllllI[lllllllllllllllIIlIIlIIIIIllllII];
            lllllllllllllllIIlIIlIIIIlIIIllI.append((char)(lllllllllllllllIIlIIlIIIIlIIlIIl ^ lllllllllllllllIIlIIlIIIIlIIIlIl[lllllllllllllllIIlIIlIIIIlIIIlII % lllllllllllllllIIlIIlIIIIlIIIlIl.length]));
            "".length();
            ++lllllllllllllllIIlIIlIIIIlIIIlII;
            ++lllllllllllllllIIlIIlIIIIIllllII;
            "".length();
            if (-" ".length() <= 0) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIIlIIlIIIIlIIIllI);
    }

    private static boolean lIIlIlIIIIIIIll(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIIlIlIIIIIlIII(Object object) {
        return object == null;
    }

    private static boolean lIIlIlIIIIIlIIl(int n2, int n3) {
        return n2 <= n3;
    }

    private static String lIIlIIllllllllI(String lllllllllllllllIIlIIlIIIIIllIIll, String lllllllllllllllIIlIIlIIIIIllIIlI) {
        try {
            SecretKeySpec lllllllllllllllIIlIIlIIIIIllIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIIlIIIIIllIIlI.getBytes(StandardCharsets.UTF_8)), lllllIllllIl[9]), "DES");
            Cipher lllllllllllllllIIlIIlIIIIIllIlIl = Cipher.getInstance("DES");
            lllllllllllllllIIlIIlIIIIIllIlIl.init(lllllIllllIl[8], lllllllllllllllIIlIIlIIIIIllIllI);
            return new String(lllllllllllllllIIlIIlIIIIIllIlIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIIlIIIIIllIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIlIIlIIIIIllIlII) {
            lllllllllllllllIIlIIlIIIIIllIlII.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIlIIIIIIllI(int n2) {
        return n2 != 0;
    }

    private static boolean lIIlIlIIIIIIIlI(Object object, Object object2) {
        return object != object2;
    }

    private static boolean lIIlIlIIIIIIlll(int n2, int n3) {
        return n2 >= n3;
    }

    static {
        J.lIIlIlIIIIIIIIl();
        J.lIIlIlIIIIIIIII();
        ai = lllllIllllIl[7];
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var2_2;
        TileObject lllllllllllllllIIlIIlIIIIlIlIlll;
        J lllllllllllllllIIlIIlIIIIlIllIIl;
        if (J.lIIlIlIIIIIIIlI((Object)this.ak.activity(), (Object)a.SANDSTONE)) {
            return lllllIllllIl[0];
        }
        int[] nArray = new int[lllllIllllIl[1]];
        nArray[J.lllllIllllIl[0]] = lllllIllllIl[2];
        if (J.lIIlIlIIIIIIIll(Inventory.getCount((int[])nArray), lllllllllllllllIIlIIlIIIIlIllIIl.ak.waterskins())) {
            int[] nArray2 = new int[lllllIllllIl[1]];
            nArray2[J.lllllIllllIl[0]] = lllllIllllIl[2];
            Inventory.getFirst((int[])nArray2).interact(lllllIllllII[lllllIllllIl[0]]);
        }
        Player lllllllllllllllIIlIIlIIIIlIllIII = Players.getLocal();
        if (!J.lIIlIlIIIIIIlII(Inventory.isFull() ? 1 : 0) || !J.lIIlIlIIIIIIlIl(lllllllllllllllIIlIIlIIIIlIllIII) || !J.lIIlIlIIIIIIlII(lllllllllllllllIIlIIlIIIIlIllIII.isAnimating() ? 1 : 0) || J.lIIlIlIIIIIIllI(lllllllllllllllIIlIIlIIIIlIllIII.isMoving() ? 1 : 0)) {
            return lllllIllllIl[0];
        }
        if (J.lIIlIlIIIIIIlII(Movement.isRunEnabled() ? 1 : 0) && J.lIIlIlIIIIIIlll(Movement.getRunEnergy(), lllllIllllIl[3])) {
            Movement.toggleRun();
        }
        if (J.lIIlIlIIIIIlIII(lllllllllllllllIIlIIlIIIIlIlIlll = TileObjects.getNearest(tileObject -> {
            int n2;
            if (J.lIIlIlIIIIIlIlI(tileObject.getId(), lllllIllllIl[7]) && J.lIIlIlIIIIIIllI(this.ak.area().a(tileObject.getWorldLocation()) ? 1 : 0)) {
                n2 = lllllIllllIl[1];
                "".length();
                if (((29 + 165 - 21 + 37 ^ 90 + 111 - 193 + 137) & ("   ".length() ^ (0x31 ^ 0x71) ^ -" ".length())) != ((0x85 ^ 0xA5 ^ (0x40 ^ 0x6E)) & (0xD7 ^ 0xC0 ^ (0x3B ^ 0x22) ^ -" ".length()))) {
                    return ((0xE6 ^ 0x9D ^ (0x4B ^ 0)) & (0x28 ^ 0x23 ^ (0x31 ^ 0xA) ^ -" ".length())) != 0;
                }
            } else {
                n2 = lllllIllllIl[0];
            }
            return n2 != 0;
        }))) {
            Movement.walkTo((WorldPoint)new WorldPoint(lllllIllllIl[4], lllllIllllIl[5], lllllIllllIl[0]), (boolean)lllllIllllIl[0]);
            "".length();
            return lllllIllllIl[1];
        }
        if (J.lIIlIlIIIIIIllI(Movement.isRunEnabled() ? 1 : 0) && J.lIIlIlIIIIIlIIl(Players.getLocal().distanceTo((Locatable)lllllllllllllllIIlIIlIIIIlIlIlll), lllllIllllIl[6])) {
            lllllllllllllllIIlIIlIIIIlIllIIl.aj.a();
        }
        var2_2.interact(lllllIllllII[lllllIllllIl[1]]);
        return lllllIllllIl[1];
    }

    private static boolean lIIlIlIIIIIlIlI(int n2, int n3) {
        return n2 == n3;
    }

    private static void lIIlIlIIIIIIIIl() {
        lllllIllllIl = new int[10];
        J.lllllIllllIl[0] = (0x8C ^ 0x83) & ~(0x33 ^ 0x3C);
        J.lllllIllllIl[1] = " ".length();
        J.lllllIllllIl[2] = 0xFFFFD7FF & 0x2F1F;
        J.lllllIllllIl[3] = 0x56 ^ 0x4F;
        J.lllllIllllIl[4] = -(0xFFFFB38C & 0x5EFF) & (0xFFFF9FEB & 0x7EFF);
        J.lllllIllllIl[5] = -(0xFFFFBCAD & 0x53F2) & (0xFFFF9BFF & Short.MAX_VALUE);
        J.lllllIllllIl[6] = 150 + 54 - 64 + 34 ^ 168 + 50 - 141 + 93;
        J.lllllIllllIl[7] = -(0xFFFFD3ED & 0x7F97) & (0xFFFFFFFF & 0x7FFE);
        J.lllllIllllIl[8] = "  ".length();
        J.lllllIllllIl[9] = 0x55 ^ 0x23 ^ (0x7D ^ 3);
    }

    private static boolean lIIlIlIIIIIIlII(int n2) {
        return n2 == 0;
    }

    private static void lIIlIlIIIIIIIII() {
        lllllIllllII = new String[lllllIllllIl[8]];
        J.lllllIllllII[J.lllllIllllIl[0]] = J.lIIlIIllllllllI("vtJm/7+CzCY=", "THdxn");
        J.lllllIllllII[J.lllllIllllIl[1]] = J.lIIlIIlllllllll("KDM0MQ==", "eZZTC");
    }

    private static boolean lIIlIlIIIIIIlIl(Object object) {
        return object != null;
    }
}

