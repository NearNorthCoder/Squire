/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.items.Shop
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 */
package m.e.i.q.u.r.-.n.s.e.r.i;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.mining.SquireMinerConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import m.e.i.q.u.r.-.n.s.e.r.i.a;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.items.Shop;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;

@TaskDesc(name="Restocking")
public class t
extends Task {
    private static /* synthetic */ int[] lllllIIllllI;
    private static /* synthetic */ String[] lllllIIlllIl;
    private final /* synthetic */ SquireMinerConfig D;

    private static boolean lIIlIIllIIIIlll(Object object) {
        return object != null;
    }

    static {
        t.lIIlIIllIIIIIIl();
        t.lIIlIIllIIIIIII();
    }

    @Inject
    public t(SquireMinerConfig squireMinerConfig) {
        this.D = squireMinerConfig;
    }

    private static boolean lIIlIIllIIIIlIl(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIIlIIllIIIIIll(int n2) {
        return n2 != 0;
    }

    public boolean run() {
        if (t.lIIlIIllIIIIIlI((Object)this.D.activity(), (Object)a.GRANITE)) {
            return lllllIIllllI[0];
        }
        int[] nArray = new int[lllllIIllllI[1]];
        nArray[t.lllllIIllllI[0]] = lllllIIllllI[2];
        nArray[t.lllllIIllllI[3]] = lllllIIllllI[4];
        nArray[t.lllllIIllllI[5]] = lllllIIllllI[6];
        nArray[t.lllllIIllllI[7]] = lllllIIllllI[8];
        if (t.lIIlIIllIIIIIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return lllllIIllllI[0];
        }
        int[] nArray2 = new int[lllllIIllllI[3]];
        nArray2[t.lllllIIllllI[0]] = lllllIIllllI[2];
        if (t.lIIlIIllIIIIlII(Inventory.getCount((int[])nArray2), lllllIIllllI[9])) {
            int[] nArray3 = new int[lllllIIllllI[3]];
            nArray3[t.lllllIIllllI[0]] = lllllIIllllI[2];
            Inventory.getFirst((int[])nArray3).interact(lllllIIlllIl[lllllIIllllI[0]]);
            return lllllIIllllI[0];
        }
        int[] nArray4 = new int[lllllIIllllI[3]];
        nArray4[t.lllllIIllllI[0]] = lllllIIllllI[10];
        NPC lllllllllllllllIIlIIlIllIlIlIlII = NPCs.getNearest((int[])nArray4);
        if (t.lIIlIIllIIIIIll(Shop.isOpen() ? 1 : 0)) {
            if (t.lIIlIIllIIIIlIl(Shop.getStock((int)lllllIIllllI[2]), lllllIIllllI[9])) {
                Shop.sellFive((int)lllllIIllllI[11]);
                return lllllIIllllI[0];
            }
            if (t.lIIlIIllIIIIllI(Shop.getStock((int)lllllIIllllI[2]), lllllIIllllI[9])) {
                Shop.buyFifty((int)lllllIIllllI[2]);
                return lllllIIllllI[0];
            }
        }
        if (t.lIIlIIllIIIIlll(lllllllllllllllIIlIIlIllIlIlIlII) && t.lIIlIIllIIIIIll(Reachable.isInteractable((Locatable)lllllllllllllllIIlIIlIllIlIlIlII) ? 1 : 0) && t.lIIlIIllIIIlIII(Shop.isOpen() ? 1 : 0)) {
            lllllllllllllllIIlIIlIllIlIlIlII.interact(lllllIIlllIl[lllllIIllllI[3]]);
            0;
            if (null != null) {
                return ((0x3E ^ 0xF) & ~(0x3E ^ 0xF)) != 0;
            }
        } else {
            int[] nArray5 = new int[lllllIIllllI[3]];
            nArray5[t.lllllIIllllI[0]] = lllllIIllllI[12];
            if (t.lIIlIIllIIIIIll(Inventory.contains((int[])nArray5) ? 1 : 0)) {
                int[] nArray6 = new int[lllllIIllllI[3]];
                nArray6[t.lllllIIllllI[0]] = lllllIIllllI[12];
                Inventory.getFirst((int[])nArray6).interact(lllllIIlllIl[lllllIIllllI[5]]);
                return lllllIIllllI[3];
            }
            Movement.walkTo((WorldPoint)new WorldPoint(lllllIIllllI[13], lllllIIllllI[14], lllllIIllllI[0]));
            0;
            return lllllIIllllI[3];
        }
        return lllllIIllllI[3];
    }

    private static String lIIlIIlIlllllll(String lllllllllllllllIIlIIlIllIIllllII, String lllllllllllllllIIlIIlIllIIlllIll) {
        lllllllllllllllIIlIIlIllIIllllII = new String(Base64.getDecoder().decode(lllllllllllllllIIlIIlIllIIllllII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIlIIlIllIIlllIlI = new StringBuilder();
        char[] lllllllllllllllIIlIIlIllIIlllIIl = lllllllllllllllIIlIIlIllIIlllIll.toCharArray();
        int lllllllllllllllIIlIIlIllIIlllIII = lllllIIllllI[0];
        char[] lllllllllllllllIIlIIlIllIIllIIlI = lllllllllllllllIIlIIlIllIIllllII.toCharArray();
        int lllllllllllllllIIlIIlIllIIllIIIl = lllllllllllllllIIlIIlIllIIllIIlI.length;
        int lllllllllllllllIIlIIlIllIIllIIII = lllllIIllllI[0];
        while (t.lIIlIIllIIIIlIl(lllllllllllllllIIlIIlIllIIllIIII, lllllllllllllllIIlIIlIllIIllIIIl)) {
            char lllllllllllllllIIlIIlIllIIllllIl = lllllllllllllllIIlIIlIllIIllIIlI[lllllllllllllllIIlIIlIllIIllIIII];
            lllllllllllllllIIlIIlIllIIlllIlI.append((char)(lllllllllllllllIIlIIlIllIIllllIl ^ lllllllllllllllIIlIIlIllIIlllIIl[lllllllllllllllIIlIIlIllIIlllIII % lllllllllllllllIIlIIlIllIIlllIIl.length]));
            0;
            ++lllllllllllllllIIlIIlIllIIlllIII;
            ++lllllllllllllllIIlIIlIllIIllIIII;
            0;
            if ((0x3F ^ 0x3A) > 0) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIIlIIlIllIIlllIlI);
    }

    private static String lIIlIIlIllllllI(String lllllllllllllllIIlIIlIllIlIIllII, String lllllllllllllllIIlIIlIllIlIIlIll) {
        try {
            SecretKeySpec lllllllllllllllIIlIIlIllIlIIllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIIlIllIlIIlIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIlIIlIllIlIIlllI = Cipher.getInstance("Blowfish");
            lllllllllllllllIIlIIlIllIlIIlllI.init(lllllIIllllI[5], lllllllllllllllIIlIIlIllIlIIllll);
            return new String(lllllllllllllllIIlIIlIllIlIIlllI.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIIlIllIlIIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIlIIlIllIlIIllIl) {
            lllllllllllllllIIlIIlIllIlIIllIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIIllIIIIllI(int n2, int n3) {
        return n2 >= n3;
    }

    private static void lIIlIIllIIIIIII() {
        lllllIIlllIl = new String[lllllIIllllI[7]];
        t.lllllIIlllIl[t.lllllIIllllI[0]] = t."Drop";
        t.lllllIIlllIl[t.lllllIIllllI[3]] = t."Trade";
        t.lllllIIlllIl[t.lllllIIllllI[5]] = t."Drop";
    }

    private static void lIIlIIllIIIIIIl() {
        lllllIIllllI = new int[15];
        t.lllllIIllllI[0] = (0xBC ^ 0xA9 ^ (0xB9 ^ 0xB6)) & (56 + 46 - -54 + 34 ^ 91 + 23 - 112 + 162 ^ -1);
        t.lllllIIllllI[1] = 0xA ^ 0xE;
        t.lllllIIllllI[2] = 0xFFFF8FDF & 0x773F;
        t.lllllIIllllI[3] = 1;
        t.lllllIIllllI[4] = 0xFFFFC7F1 & 0x3F2F;
        t.lllllIIllllI[5] = 2;
        t.lllllIIllllI[6] = 0xFFFFAF7F & 0x57A3;
        t.lllllIIllllI[7] = 3;
        t.lllllIIllllI[8] = 0xFFFFBF65 & 0x47BF;
        t.lllllIIllllI[9] = 36 + 181 - 57 + 53 ^ 170 + 166 - 168 + 25;
        t.lllllIIllllI[10] = 0xFFFFBFFF & 0x4729;
        t.lllllIIllllI[11] = -(0xFFFFBF8F & 0x7078) & (0xFFFFBF37 & 0x77EF);
        t.lllllIIllllI[12] = -(0xFFFFB8DD & 0x7FA3) & (0xFFFFBFA7 & Short.MAX_VALUE);
        t.lllllIIllllI[13] = 0xFFFFAF78 & 0x5CEF;
        t.lllllIIllllI[14] = -(0xFFFFD47D & 0x6FC3) & (0xFFFFFFEF & 0x4FFB);
    }

    private static boolean lIIlIIllIIIIIlI(Object object, Object object2) {
        return object != object2;
    }

    private static boolean lIIlIIllIIIlIII(int n2) {
        return n2 == 0;
    }

    private static boolean lIIlIIllIIIIlII(int n2, int n3) {
        return n2 > n3;
    }
}

