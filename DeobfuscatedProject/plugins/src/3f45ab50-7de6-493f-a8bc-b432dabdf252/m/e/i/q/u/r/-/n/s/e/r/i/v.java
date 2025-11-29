/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
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
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import m.e.i.q.u.r.-.n.s.e.r.i.a;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;

@TaskDesc(name="Mining guild iron")
public class v
extends Task {
    private static /* synthetic */ int[] llllllIlIllI;
    private static final /* synthetic */ int[] G;
    private final /* synthetic */ SquireMinerConfig H;
    private static /* synthetic */ String[] llllllIlIlIl;
    private static final /* synthetic */ WorldPoint F;

    private static void lIIlIlIIlIlIlII() {
        llllllIlIllI = new int[8];
        v.llllllIlIllI[0] = (134 + 114 - 170 + 83 ^ 35 + 128 - 43 + 11) & (0x95 ^ 0xB6 ^ " ".length() ^ -" ".length());
        v.llllllIlIllI[1] = " ".length();
        v.llllllIlIllI[2] = "  ".length();
        v.llllllIlIllI[3] = -(0xFFFFFFDB & 0x7435) & (0xFFFFFFFF & 0x7FDD);
        v.llllllIlIllI[4] = -(0xFFFFB797 & 0x5A6F) & (0xFFFFFFFF & 0x37FF);
        v.llllllIlIllI[5] = -(0xFFFFBEE5 & 0x531B) & (0xFFFFBF6E & 0x7EF5);
        v.llllllIlIllI[6] = 0xFFFFFCFF & 0x2F65;
        v.llllllIlIllI[7] = 0x93 ^ 0x9B;
    }

    private static boolean lIIlIlIIlIlIlll(int n2) {
        return n2 == 0;
    }

    private static String lIIlIlIIlIlIIlI(String lllllllllllllllIIlIIIllIIlIIllII, String lllllllllllllllIIlIIIllIIlIIllIl) {
        try {
            SecretKeySpec lllllllllllllllIIlIIIllIIlIlIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIIIllIIlIIllIl.getBytes(StandardCharsets.UTF_8)), llllllIlIllI[7]), "DES");
            Cipher lllllllllllllllIIlIIIllIIlIlIIII = Cipher.getInstance("DES");
            lllllllllllllllIIlIIIllIIlIlIIII.init(llllllIlIllI[2], lllllllllllllllIIlIIIllIIlIlIIIl);
            return new String(lllllllllllllllIIlIIIllIIlIlIIII.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIIIllIIlIIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIlIIIllIIlIIllll) {
            lllllllllllllllIIlIIIllIIlIIllll.printStackTrace();
            return null;
        }
    }

    @Inject
    public v(SquireMinerConfig squireMinerConfig) {
        this.H = squireMinerConfig;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        if (v.lIIlIlIIlIlIlIl((Object)this.H.activity(), (Object)a.GUILD_IRON)) {
            return llllllIlIllI[0];
        }
        if (v.lIIlIlIIlIlIllI(Inventory.isFull() ? 1 : 0)) {
            return llllllIlIllI[0];
        }
        if (v.lIIlIlIIlIlIlll(F.equals((Object)Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (v.lIIlIlIIlIlIllI(Movement.shouldWalk() ? 1 : 0)) {
                Movement.walkTo((WorldPoint)F);
                "".length();
            }
            return llllllIlIllI[1];
        }
        if (v.lIIlIlIIlIlIllI(Players.getLocal().isAnimating() ? 1 : 0)) {
            return llllllIlIllI[0];
        }
        TileObject lllllllllllllllIIlIIIllIIlIlIllI = TileObjects.getFirstSurrounding((WorldPoint)F, (int)llllllIlIllI[2], (int[])G);
        if (v.lIIlIlIIlIllIII(lllllllllllllllIIlIIIllIIlIlIllI)) {
            return llllllIlIllI[0];
        }
        var1_1.interact(llllllIlIlIl[llllllIlIllI[0]]);
        this.sleep(llllllIlIllI[2]);
        return llllllIlIllI[1];
    }

    private static boolean lIIlIlIIlIlIlIl(Object object, Object object2) {
        return object != object2;
    }

    private static void lIIlIlIIlIlIIll() {
        llllllIlIlIl = new String[llllllIlIllI[1]];
        v.llllllIlIlIl[v.llllllIlIllI[0]] = v.lIIlIlIIlIlIIlI("H8D1aYni0kM=", "imtFg");
    }

    static {
        v.lIIlIlIIlIlIlII();
        v.lIIlIlIIlIlIIll();
        F = new WorldPoint(llllllIlIllI[3], llllllIlIllI[4], llllllIlIllI[0]);
        int[] nArray = new int[llllllIlIllI[2]];
        nArray[v.llllllIlIllI[0]] = llllllIlIllI[5];
        nArray[v.llllllIlIllI[1]] = llllllIlIllI[6];
        G = nArray;
    }

    private static boolean lIIlIlIIlIlIllI(int n2) {
        return n2 != 0;
    }

    private static boolean lIIlIlIIlIllIII(Object object) {
        return object == null;
    }
}

