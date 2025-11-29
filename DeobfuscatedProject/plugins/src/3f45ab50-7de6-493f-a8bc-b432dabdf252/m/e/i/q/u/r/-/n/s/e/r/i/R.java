/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 */
package m.e.i.q.u.r.-.n.s.e.r.i;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.mining.SquireMinerConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import m.e.i.q.u.r.-.n.s.e.r.i.S;
import net.runelite.api.Item;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;

@TaskDesc(name="Moving towards Shantay", priority=10, blocking=true)
public class R
extends S {
    private static /* synthetic */ String[] llllllIllIIl;
    private static /* synthetic */ int[] llllllIllIlI;

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean t() {
        void var1_1;
        if (!R.lIIlIlIIllIIlIl(this.z() ? 1 : 0) || R.lIIlIlIIllIIllI(this.y())) {
            return llllllIllIlI[0];
        }
        int[] nArray = new int[llllllIllIlI[1]];
        nArray[R.llllllIllIlI[0]] = llllllIllIlI[2];
        TileObject lllllllllllllllIIlIIIllIIIIIIllI = TileObjects.getNearest((int[])nArray);
        if (R.lIIlIlIIllIIlll(lllllllllllllllIIlIIIllIIIIIIllI)) {
            if (R.lIIlIlIIllIIlIl(Movement.shouldWalk() ? 1 : 0)) {
                Movement.walkTo((WorldPoint)new WorldPoint(llllllIllIlI[3], llllllIllIlI[4], llllllIllIlI[0]));
                "".length();
                return llllllIllIlI[1];
            }
            int[] nArray2 = new int[llllllIllIlI[1]];
            nArray2[R.llllllIllIlI[0]] = llllllIllIlI[5];
            Item lllllllllllllllIIlIIIllIIIIIIlIl = Inventory.getFirst((int[])nArray2);
            if (R.lIIlIlIIllIlIII(lllllllllllllllIIlIIIllIIIIIIlIl)) {
                lllllllllllllllIIlIIIllIIIIIIlIl.drop();
                return llllllIllIlI[1];
            }
            return llllllIllIlI[0];
        }
        var1_1.interact(llllllIllIIl[llllllIllIlI[0]]);
        return llllllIllIlI[1];
    }

    private static boolean lIIlIlIIllIIlIl(int n2) {
        return n2 != 0;
    }

    private static void lIIlIlIIllIIIll() {
        llllllIllIIl = new String[llllllIllIlI[1]];
        R.llllllIllIIl[R.llllllIllIlI[0]] = R.lIIlIlIIllIIIlI("Jz8WxIyfU6knDwfjefP4dg==", "zeqap");
    }

    private static boolean lIIlIlIIllIIlll(Object object) {
        return object == null;
    }

    private static void lIIlIlIIllIIlII() {
        llllllIllIlI = new int[7];
        R.llllllIllIlI[0] = (1 ^ 0x6D ^ (0xE5 ^ 0x90)) & (155 + 5 - 156 + 178 ^ 83 + 146 - 144 + 90 ^ -" ".length());
        R.llllllIllIlI[1] = " ".length();
        R.llllllIllIlI[2] = 0xFFFFA3FE & 0xFD6F;
        R.llllllIllIlI[3] = -(0xFFFFFF92 & 0x736F) & (0xFFFFFFFF & 0x7F7F);
        R.llllllIllIlI[4] = 0xFFFFDFBF & 0x2B5B;
        R.llllllIllIlI[5] = 0xFFFFF7FF & 0xF27;
        R.llllllIllIlI[6] = "  ".length();
    }

    static {
        R.lIIlIlIIllIIlII();
        R.lIIlIlIIllIIIll();
    }

    private static boolean lIIlIlIIllIIllI(int n2) {
        return n2 > 0;
    }

    private static boolean lIIlIlIIllIlIII(Object object) {
        return object != null;
    }

    private static String lIIlIlIIllIIIlI(String lllllllllllllllIIlIIIlIllllllIll, String lllllllllllllllIIlIIIlIllllllIlI) {
        try {
            SecretKeySpec lllllllllllllllIIlIIIllIIIIIIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIIIlIllllllIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIlIIIlIlllllllll = Cipher.getInstance("Blowfish");
            lllllllllllllllIIlIIIlIlllllllll.init(llllllIllIlI[6], lllllllllllllllIIlIIIllIIIIIIIII);
            return new String(lllllllllllllllIIlIIIlIlllllllll.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIIIlIllllllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIlIIIlIllllllllI) {
            lllllllllllllllIIlIIIlIllllllllI.printStackTrace();
            return null;
        }
    }

    @Inject
    protected R(SquireMinerConfig squireMinerConfig) {
        super(squireMinerConfig);
    }
}

