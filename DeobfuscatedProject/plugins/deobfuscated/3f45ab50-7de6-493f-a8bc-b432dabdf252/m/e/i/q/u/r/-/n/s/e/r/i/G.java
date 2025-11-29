/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Locatable
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.DepositBox
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
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
import m.e.i.q.u.r.-.n.s.e.r.i.C;
import m.e.i.q.u.r.-.n.s.e.r.i.T;
import net.runelite.api.Locatable;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.DepositBox;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;

@TaskDesc(name="Depositing ores", priority=19, blocking=true)
public class G
extends C {
    private static /* synthetic */ String[] lllllIlIIIll;
    private static /* synthetic */ int[] lllllIlIlIII;
    private final /* synthetic */ int[] ad;

    private static boolean lIIlIIllIlIlIIl(int n2) {
        return n2 != 0;
    }

    static {
        G.lIIlIIllIlIIlll();
        G.lIIlIIllIIlIlll();
    }

    @Inject
    public G(SquireMinerConfig squireMinerConfig, SquireMiner squireMiner, T t2) {
        super(squireMinerConfig, squireMiner, t2);
        int[] nArray = new int[lllllIlIlIII[0]];
        nArray[G.lllllIlIlIII[1]] = lllllIlIlIII[2];
        nArray[G.lllllIlIlIII[3]] = lllllIlIlIII[4];
        nArray[G.lllllIlIlIII[5]] = lllllIlIlIII[6];
        nArray[G.lllllIlIlIII[7]] = lllllIlIlIII[8];
        nArray[G.lllllIlIlIII[9]] = lllllIlIlIII[10];
        nArray[G.lllllIlIlIII[11]] = lllllIlIlIII[12];
        nArray[G.lllllIlIlIII[13]] = lllllIlIlIII[14];
        nArray[G.lllllIlIlIII[15]] = lllllIlIlIII[16];
        nArray[G.lllllIlIlIII[17]] = lllllIlIlIII[18];
        nArray[G.lllllIlIlIII[19]] = lllllIlIlIII[20];
        nArray[G.lllllIlIlIII[21]] = lllllIlIlIII[22];
        this.ad = nArray;
    }

    private static void lIIlIIllIIlIlll() {
        lllllIlIIIll = new String[lllllIlIlIII[3]];
        G.lllllIlIIIll[G.lllllIlIlIII[1]] = G."Deposit";
    }

    private static boolean lIIlIIllIlIlIlI(Object object) {
        return object == null;
    }

    private static String lIIlIIllIIlIllI(String lllllllllllllllIIlIIlIlIlIIIllIl, String lllllllllllllllIIlIIlIlIlIIIlllI) {
        try {
            SecretKeySpec lllllllllllllllIIlIIlIlIlIIlIIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIIlIlIlIIIlllI.getBytes(StandardCharsets.UTF_8)), lllllIlIlIII[17]), "DES");
            Cipher lllllllllllllllIIlIIlIlIlIIlIIIl = Cipher.getInstance("DES");
            lllllllllllllllIIlIIlIlIlIIlIIIl.init(lllllIlIlIII[5], lllllllllllllllIIlIIlIlIlIIlIIlI);
            return new String(lllllllllllllllIIlIIlIlIlIIlIIIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIIlIlIlIIIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIlIIlIlIlIIlIIII) {
            lllllllllllllllIIlIIlIlIlIIlIIII.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean t() {
        G lllllllllllllllIIlIIlIlIlIIllIII;
        if (G.lIIlIIllIlIlIII(this.Z.O() ? 1 : 0)) {
            return lllllIlIlIII[1];
        }
        if (G.lIIlIIllIlIlIII(Inventory.contains(item -> T.av.contains(item.getId())) ? 1 : 0)) {
            if (G.lIIlIIllIlIlIII(lllllllllllllllIIlIIlIlIlIIllIII.Z.D())) {
                lllllllllllllllIIlIIlIlIlIIllIII.Z.a(lllllIlIlIII[1]);
            }
            return lllllIlIlIII[1];
        }
        int[] nArray = new int[lllllIlIlIII[3]];
        nArray[G.lllllIlIlIII[1]] = lllllIlIlIII[23];
        if (G.lIIlIIllIlIlIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
            int[] nArray2 = new int[lllllIlIlIII[3]];
            nArray2[G.lllllIlIlIII[1]] = lllllIlIlIII[23];
            Inventory.dropAll((int[])nArray2);
            0;
            return lllllIlIlIII[3];
        }
        if (G.lIIlIIllIlIlIIl(DepositBox.isOpen() ? 1 : 0)) {
            DepositBox.depositAllItems((int[])lllllllllllllllIIlIIlIlIlIIllIII.ad);
            return lllllIlIlIII[3];
        }
        int[] nArray3 = new int[lllllIlIlIII[3]];
        nArray3[G.lllllIlIlIII[1]] = lllllIlIlIII[24];
        TileObject lllllllllllllllIIlIIlIlIlIIlIlll = TileObjects.getNearest((int[])nArray3);
        if (G.lIIlIIllIlIlIlI(lllllllllllllllIIlIIlIlIlIIlIlll)) {
            return lllllIlIlIII[1];
        }
        if (G.lIIlIIllIlIlIII(Reachable.isInteractable((Locatable)lllllllllllllllIIlIIlIlIlIIlIlll) ? 1 : 0)) {
            Movement.walkTo((Locatable)lllllllllllllllIIlIIlIlIlIIlIlll);
            0;
            return lllllIlIlIII[3];
        }
        if (G.lIIlIIllIlIlIIl(Movement.shouldWalk() ? 1 : 0)) {
            lllllllllllllllIIlIIlIlIlIIlIlll.interact(lllllIlIIIll[lllllIlIlIII[1]]);
        }
        return lllllIlIlIII[3];
    }

    private static void lIIlIIllIlIIlll() {
        lllllIlIlIII = new int[25];
        G.lllllIlIlIII[0] = 0x16 ^ 0x1D;
        G.lllllIlIlIII[1] = (0x6E ^ 0x53 ^ (0xA8 ^ 0xB8)) & (133 + 39 - 148 + 146 ^ 134 + 128 - 209 + 82 ^ -1);
        G.lllllIlIlIII[2] = -(0xFFFFDF33 & 0x24FF) & (0xFFFFDDF7 & 0x27FF);
        G.lllllIlIlIII[3] = 1;
        G.lllllIlIlIII[4] = 0xFFFFAFEC & 0x7EFF;
        G.lllllIlIlIII[5] = 2;
        G.lllllIlIlIII[6] = 0xFFFFE5BF & 0x1BFC;
        G.lllllIlIlIII[7] = 3;
        G.lllllIlIlIII[8] = 0xFFFFEFBF & 0x11FF;
        G.lllllIlIlIII[9] = 0x54 ^ 0x75 ^ (0x2D ^ 8);
        G.lllllIlIlIII[10] = -(0xFFFFF73F & 0x7CE7) & (0xFFFFF5FF & 0x7FE7);
        G.lllllIlIlIII[11] = 0x7F ^ 0x7A;
        G.lllllIlIlIII[12] = 0xFFFFC1EB & 0x3FD7;
        G.lllllIlIlIII[13] = 0x4D ^ 0x41 ^ (0x7B ^ 0x71);
        G.lllllIlIlIII[14] = -(0xFFFFFBE9 & 0x24BF) & (0xFFFFBFFF & 0x66FF);
        G.lllllIlIlIII[15] = 0x36 ^ 0x31;
        G.lllllIlIlIII[16] = 0xFFFF87F7 & 0x7E5D;
        G.lllllIlIlIII[17] = 0xB6 ^ 0x97 ^ (0xB9 ^ 0x90);
        G.lllllIlIlIII[18] = 0xFFFFAFF3 & 0x565F;
        G.lllllIlIlIII[19] = 0xA ^ 3;
        G.lllllIlIlIII[20] = -(0xFFFFD969 & 0x7E9F) & (0xFFFFDFD9 & 0x7E7F);
        G.lllllIlIlIII[21] = 51 + 4 - -67 + 50 ^ 51 + 27 - 47 + 135;
        G.lllllIlIlIII[22] = -(0xFFFFFEA5 & 0x69FB) & (0xFFFFEEFF & Short.MAX_VALUE);
        G.lllllIlIlIII[23] = 0xFFFFFEFB & 0x2FEF;
        G.lllllIlIlIII[24] = -(0xFFFFFBAD & 0xE7F) & (0xFFFFFF7F & 0x6FFD);
    }

    private static boolean lIIlIIllIlIlIII(int n2) {
        return n2 == 0;
    }
}

