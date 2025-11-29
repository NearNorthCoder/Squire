/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Locatable
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.commons.Rand
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Reachable
 */
package m.e.i.q.u.r.-.n.s.e.r.i;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.mining.SquireMinerConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import m.e.i.q.u.r.-.n.s.e.r.i.a;
import net.runelite.api.Locatable;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Rand;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Reachable;

@TaskDesc(name="Mining amethyst")
public class x
extends Task {
    private static final /* synthetic */ List<Integer> M;
    private static final /* synthetic */ WorldPoint K;
    private static /* synthetic */ String[] lllllIIIIlII;
    private final /* synthetic */ SquireMinerConfig N;
    private static final /* synthetic */ WorldPoint L;
    private static /* synthetic */ int[] lllllIIIIlIl;

    private static void lIIlIIlIIIlllll() {
        lllllIIIIlII = new String[lllllIIIIlIl[4]];
        x.lllllIIIIlII[x.lllllIIIIlIl[0]] = x.lIIlIIlIIIllllI("xzU77gbcrQY=", "TsRVQ");
    }

    private static boolean lIIlIIlIIlIIIlI(int n2) {
        return n2 != 0;
    }

    private static int lIIlIIlIIlIIlIl(float f2, float f3) {
        return f2 == f3 ? 0 : (f2 > f3 ? 1 : -1);
    }

    private static String lIIlIIlIIIllllI(String lllllllllllllllIIlIIllIlIllIlIIl, String lllllllllllllllIIlIIllIlIllIlIlI) {
        try {
            SecretKeySpec lllllllllllllllIIlIIllIlIllIlllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIIllIlIllIlIlI.getBytes(StandardCharsets.UTF_8)), lllllIIIIlIl[1]), "DES");
            Cipher lllllllllllllllIIlIIllIlIllIllIl = Cipher.getInstance("DES");
            lllllllllllllllIIlIIllIlIllIllIl.init(lllllIIIIlIl[11], lllllllllllllllIIlIIllIlIllIlllI);
            return new String(lllllllllllllllIIlIIllIlIllIllIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIIllIlIllIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIlIIllIlIllIllII) {
            lllllllllllllllIIlIIllIlIllIllII.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var2_2;
        WorldPoint lllllllllllllllIIlIIllIlIllllIlI;
        TileObject lllllllllllllllIIlIIllIlIllllIIl;
        WorldPoint worldPoint;
        if (x.lIIlIIlIIlIIIIl((Object)this.N.activity(), (Object)a.AMETHYST)) {
            return lllllIIIIlIl[0];
        }
        if (x.lIIlIIlIIlIIIlI(Inventory.isFull() ? 1 : 0)) {
            return lllllIIIIlIl[0];
        }
        if (x.lIIlIIlIIlIIIlI(Players.getLocal().isAnimating() ? 1 : 0)) {
            x lllllllllllllllIIlIIllIlIllllIll;
            lllllllllllllllIIlIIllIlIllllIll.sleep(Rand.nextInt((int)lllllIIIIlIl[1], (int)lllllIIIIlIl[2]));
            return lllllIIIIlIl[0];
        }
        if (x.lIIlIIlIIlIIIll(Vars.getBit((int)lllllIIIIlIl[3]))) {
            worldPoint = K;
            "".length();
            if (((0x23 ^ 0x29) & ~(0x42 ^ 0x48)) > "   ".length()) {
                return ((0x5D ^ 0x18) & ~(0x28 ^ 0x6D)) != 0;
            }
        } else {
            worldPoint = L;
        }
        if (x.lIIlIIlIIlIIlII(lllllllllllllllIIlIIllIlIllllIIl = TileObjects.getNearest((WorldPoint)(lllllllllllllllIIlIIllIlIllllIlI = worldPoint), tileObject -> {
            int n2;
            if (x.lIIlIIlIIlIIIlI(M.contains(tileObject.getId()) ? 1 : 0) && x.lIIlIIlIIlIIIlI(Players.getAll(player -> {
                int n2;
                if (x.lIIlIIlIIlIIIlI(player.isAnimating() ? 1 : 0) && x.lIIlIIlIIlIIllI(x.lIIlIIlIIlIIlIl(player.getWorldLocation().distanceToHypotenuse(tileObject.getWorldLocation()), 1.0f))) {
                    n2 = lllllIIIIlIl[4];
                    "".length();
                    if ("   ".length() == " ".length()) {
                        return ((0x40 ^ 0xA ^ (0xAF ^ 0xBB)) & (191 + 63 - 248 + 219 ^ 110 + 46 - 145 + 180 ^ -" ".length())) != 0;
                    }
                } else {
                    n2 = lllllIIIIlIl[0];
                }
                return n2 != 0;
            }).isEmpty() ? 1 : 0) && x.lIIlIIlIIlIIIlI(Reachable.isInteractable((Locatable)tileObject) ? 1 : 0)) {
                n2 = lllllIIIIlIl[4];
                "".length();
                if ("  ".length() < 0) {
                    return ((9 ^ 0x16) & ~(0x42 ^ 0x5D)) != 0;
                }
            } else {
                n2 = lllllIIIIlIl[0];
            }
            return n2 != 0;
        }))) {
            return lllllIIIIlIl[0];
        }
        var2_2.interact(lllllIIIIlII[lllllIIIIlIl[0]]);
        return lllllIIIIlIl[4];
    }

    private static boolean lIIlIIlIIlIIllI(int n2) {
        return n2 == 0;
    }

    private static boolean lIIlIIlIIlIIIll(int n2) {
        return n2 > 0;
    }

    private static boolean lIIlIIlIIlIIIIl(Object object, Object object2) {
        return object != object2;
    }

    static {
        x.lIIlIIlIIlIIIII();
        x.lIIlIIlIIIlllll();
        K = new WorldPoint(lllllIIIIlIl[5], lllllIIIIlIl[6], lllllIIIIlIl[0]);
        L = new WorldPoint(lllllIIIIlIl[7], lllllIIIIlIl[8], lllllIIIIlIl[0]);
        M = List.of(Integer.valueOf(lllllIIIIlIl[9]), Integer.valueOf(lllllIIIIlIl[10]));
    }

    private static void lIIlIIlIIlIIIII() {
        lllllIIIIlIl = new int[12];
        x.lllllIIIIlIl[0] = (0x85 ^ 0xC5) & ~(0x87 ^ 0xC7);
        x.lllllIIIIlIl[1] = 0x40 ^ 0x48;
        x.lllllIIIIlIl[2] = 0x9B ^ 0x94;
        x.lllllIIIIlIl[3] = -(0xFFFFDE73 & 0x6F8D) & (0xFFFFFF75 & 0x5FFB);
        x.lllllIIIIlIl[4] = " ".length();
        x.lllllIIIIlIl[5] = 0xFFFFDBBF & 0x2FFF;
        x.lllllIIIIlIl[6] = -(0xFFFFF7CF & 0x583C) & (0xFFFFF7FB & 0x7DFF);
        x.lllllIIIIlIl[7] = 0xFFFFFFD7 & 0xBFB;
        x.lllllIIIIlIl[8] = 0xFFFFF5EF & 0x2FF8;
        x.lllllIIIIlIl[9] = 0xFFFFBD7C & 0x6EFF;
        x.lllllIIIIlIl[10] = -(0xFFFFF0AB & 0x4FD5) & (0xFFFFEDFF & 0x7EFD);
        x.lllllIIIIlIl[11] = "  ".length();
    }

    private static boolean lIIlIIlIIlIIlII(Object object) {
        return object == null;
    }

    @Inject
    public x(SquireMinerConfig squireMinerConfig) {
        this.N = squireMinerConfig;
    }
}

