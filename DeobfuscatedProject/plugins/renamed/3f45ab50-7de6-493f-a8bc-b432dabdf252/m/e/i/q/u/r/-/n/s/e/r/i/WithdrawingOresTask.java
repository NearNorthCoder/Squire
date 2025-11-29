/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
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

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.mining.SquireMiner;
import gg.squire.mining.SquireMinerConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import m.e.i.q.u.r.-.n.s.e.r.i.C_Unknown;
import m.e.i.q.u.r.-.n.s.e.r.i.T_Unknown;
import net.runelite.api.Locatable;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;

/* TASK: Withdrawing ores -> WithdrawingoresTask */
@TaskDesc(name="Withdrawing ores", priority=20, blocking=true)
public class WithdrawingOresTask
extends C_Unknown {
    private final /* synthetic */ WorldPoint af;
    private static /* synthetic */ int[] lllllIIIIIll;
    private static final /* synthetic */ int ae;
    private static /* synthetic */ String[] lllllIIIIIlI;

    private static boolean lIIlIIlIIIllIlI(int n2) {
        return n2 == 0;
    }

    private static void lIIlIIlIIIllIII() {
        lllllIIIIIlI = new String[lllllIIIIIll[3]];
        H.lllllIIIIIlI[H.lllllIIIIIll[2]] = H."Search";
    }

    private static boolean lIIlIIlIIIllIll(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean t() {
        void var1_1;
        H var2;
        if (H.lIIlIIlIIIllIlI(this.Z.O() ? 1 : 0)) {
            return lllllIIIIIll[2];
        }
        int[] nArray = new int[lllllIIIIIll[3]];
        nArray[H.lllllIIIIIll[2]] = lllllIIIIIll[4];
        if (H.lIIlIIlIIIllIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return lllllIIIIIll[2];
        }
        if (!H.lIIlIIlIIIllIlI(Inventory.isFull() ? 1 : 0) || !H.lIIlIIlIIIllIll(var2.Z.D()) || H.lIIlIIlIIIlllII(var2.Z.M(), lllllIIIIIll[3])) {
            return lllllIIIIIll[2];
        }
        int[] nArray2 = new int[lllllIIIIIll[3]];
        nArray2[H.lllllIIIIIll[2]] = lllllIIIIIll[5];
        TileObject var1 = TileObjects.getNearest((int[])nArray2);
        if (H.lIIlIIlIIIlllIl(var1)) {
            return lllllIIIIIll[2];
        }
        Player var7 = Players.getLocal();
        if (H.lIIlIIlIIIlllII(var1.distanceTo((Locatable)var7), lllllIIIIIll[6])) {
            Movement.walkTo((WorldPoint)var2.af);
            0;
            return lllllIIIIIll[3];
        }
        var1_1.interact(lllllIIIIIlI[lllllIIIIIll[2]]);
        return lllllIIIIIll[3];
    }

    private static boolean lIIlIIlIIIlllII(int n2, int n3) {
        return n2 > n3;
    }

    @Inject
    public H(SquireMinerConfig squireMinerConfig, SquireMiner squireMiner, T t2) {
        super(squireMinerConfig, squireMiner, t2);
        this.af = new WorldPoint(lllllIIIIIll[0], lllllIIIIIll[1], lllllIIIIIll[2]);
    }

    private static String lIIlIIlIIIlIlll(String var4, String var3) {
        try {
            SecretKeySpec var8 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var3.getBytes(StandardCharsets.UTF_8)), lllllIIIIIll[7]), "DES");
            Cipher var5 = Cipher.getInstance("DES");
            var5.init(lllllIIIIIll[8], var8);
            return new String(var5.doFinal(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var6) {
            var6.printStackTrace();
            return null;
        }
    }

    static {
        H.lIIlIIlIIIllIIl();
        H.lIIlIIlIIIllIII();
        ae = lllllIIIIIll[5];
    }

    private static void lIIlIIlIIIllIIl() {
        lllllIIIIIll = new int[9];
        H.lllllIIIIIll[0] = 0xFFFFDFAF & 0x2EF5;
        H.lllllIIIIIll[1] = -(0xFFFFE9EB & 0x7F75) & (0xFFFFFFFF & 0x7F7B);
        H.lllllIIIIIll[2] = (0x1B ^ 0x5A) & ~(0x34 ^ 0x75);
        H.lllllIIIIIll[3] = 1;
        H.lllllIIIIIll[4] = 0xFFFFFEFF & 0x2FEB;
        H.lllllIIIIIll[5] = -(0xFFFFFFFA & 0x13AD) & (0xFFFFFFF7 & 0x7BEF);
        H.lllllIIIIIll[6] = 0x86 ^ 0x83;
        H.lllllIIIIIll[7] = 127 + 127 - 122 + 2 ^ 50 + 63 - 36 + 65;
        H.lllllIIIIIll[8] = 2;
    }

    private static boolean lIIlIIlIIIlllIl(Object object) {
        return object == null;
    }
}

