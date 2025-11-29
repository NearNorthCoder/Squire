/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 */
package k.-.u.u.l.i.s.r.c.d.-.q.u.e.u.e.e.s.s.l;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.duke.SquireDukeSucellus;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import k.-.u.u.l.i.s.r.c.d.-.q.u.e.u.e.e.s.s.l.a_Unknown;
import k.-.u.u.l.i.s.r.c.d.-.q.u.e.u.e.e.s.s.l.e_Unknown;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;

/* TASK: Collect Salax Salt -> CollectsalaxsaltTask */
@TaskDesc(name="Collect Salax Salt", priority=80, blocking=true)
public class CollectSalaxSaltTask
extends Task {
    private final /* synthetic */ a bG;
    private final /* synthetic */ SquireDukeSucellus bF;
    private static /* synthetic */ int[] lIllIIlllIlI;
    private static /* synthetic */ String[] lIllIIlllIIl;

    static {
        Q.lllIIllIIIlIIl();
        Q.lllIIllIIIlIII();
    }

    private static String lllIIllIIIIlll(String var3, String var1) {
        var3 = new String(Base64.getDecoder().decode(var3.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var18 = new StringBuilder();
        char[] var4 = var1.toCharArray();
        int var9 = lIllIIlllIlI[0];
        char[] var2 = var3.toCharArray();
        int var19 = var2.length;
        int var6 = lIllIIlllIlI[0];
        while (Q.lllIIllIIlIIII(var6, var19)) {
            char var15 = var2[var6];
            var18.append((char)(var15 ^ var4[var9 % var4.length]));
            0;
            ++var9;
            ++var6;
            0;
            if (2 > ((0xAB ^ 0x87) & ~(0x49 ^ 0x65))) continue;
            return null;
        }
        return String.valueOf(var18);
    }

    private static String lllIIllIIIIllI(String var17, String var12) {
        try {
            SecretKeySpec var16 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var12.getBytes(StandardCharsets.UTF_8)), lIllIIlllIlI[8]), "DES");
            Cipher var11 = Cipher.getInstance("DES");
            var11.init(lIllIIlllIlI[3], var16);
            return new String(var11.doFinal(Base64.getDecoder().decode(var17.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    private static boolean lllIIllIIIllIl(int n2, int n3) {
        return n2 >= n3;
    }

    private static void lllIIllIIIlIII() {
        lIllIIlllIIl = new String[lIllIIlllIlI[7]];
        Q.lIllIIlllIIl[Q.lIllIIlllIlI[0]] = Q."Salax salt";
        Q.lIllIIlllIIl[Q.lIllIIlllIlI[1]] = Q."Salt Deposit";
        Q.lIllIIlllIIl[Q.lIllIIlllIlI[3]] = Q."Mine";
        Q.lIllIIlllIIl[Q.lIllIIlllIlI[5]] = Q."Gate";
        Q.lIllIIlllIIl[Q.lIllIIlllIlI[6]] = Q."Quick-escape";
    }

    private static boolean lllIIllIIlIIII(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lllIIllIIIlIll(Object object) {
        return object == null;
    }

    @Inject
    public Q(SquireDukeSucellus squireDukeSucellus) {
        this.bF = squireDukeSucellus;
        this.bG = squireDukeSucellus.s();
    }

    private static boolean lllIIllIIIlllI(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lllIIllIIIlIlI(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var4_4;
        NPC var13;
        if (Q.lllIIllIIIlIlI(this.bG.x())) {
            return lIllIIlllIlI[0];
        }
        TileObject var5 = TileObjects.getNearest(tileObject -> {
            int n2;
            if (Q.lllIIllIIIlIlI(tileObject.getName().equals(lIllIIlllIIl[lIllIIlllIlI[5]]) ? 1 : 0)) {
                String[] stringArray = new String[lIllIIlllIlI[1]];
                stringArray[Q.lIllIIlllIlI[0]] = lIllIIlllIIl[lIllIIlllIlI[6]];
                if (Q.lllIIllIIIlIlI(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lIllIIlllIlI[1];
                    0;
                    if ((0x99 ^ 0x9D) == (0x6D ^ 0x69)) return n2 != 0;
                    return (3 & ~3) != 0;
                }
            }
            n2 = lIllIIlllIlI[0];
            return n2 != 0;
        });
        if (Q.lllIIllIIIlIll(var5)) {
            return lIllIIlllIlI[0];
        }
        Player var14 = Players.getLocal();
        if (Q.lllIIllIIIlIll(var14)) {
            return lIllIIlllIlI[0];
        }
        String[] stringArray = new String[lIllIIlllIlI[1]];
        stringArray[Q.lIllIIlllIlI[0]] = lIllIIlllIIl[lIllIIlllIlI[0]];
        Item var7 = Inventory.getFirst((String[])stringArray);
        if (Q.lllIIllIIIllII(var7) && Q.lllIIllIIIllIl(var7.getQuantity(), lIllIIlllIlI[2])) {
            return lIllIIlllIlI[0];
        }
        String[] stringArray2 = new String[lIllIIlllIlI[1]];
        stringArray2[Q.lIllIIlllIlI[0]] = lIllIIlllIIl[lIllIIlllIlI[1]];
        TileObject var10 = TileObjects.getNearest((String[])stringArray2);
        if (Q.lllIIllIIIlIll(var10)) {
            return lIllIIlllIlI[0];
        }
        if (Q.lllIIllIIIlIlI(e.i(var5).contains((Locatable)var14) ? 1 : 0) && Q.lllIIllIIIllII(var13 = NPCs.getNearest(nPC -> {
            int n2;
            if (Q.lllIIllIIIlllI(nPC.getId(), e.I) && Q.lllIIllIIIllll(nPC.getGraphic(), lIllIIlllIlI[4])) {
                n2 = lIllIIlllIlI[1];
                0;
                if (-(5 ^ 1) >= 0) {
                    return false;
                }
            } else {
                n2 = lIllIIlllIlI[0];
            }
            return n2 != 0;
        }))) {
            return lIllIIlllIlI[1];
        }
        var4_4.interact(lIllIIlllIIl[lIllIIlllIlI[3]]);
        return lIllIIlllIlI[1];
    }

    private static boolean lllIIllIIIllII(Object object) {
        return object != null;
    }

    private static boolean lllIIllIIIllll(int n2, int n3) {
        return n2 != n3;
    }

    private static void lllIIllIIIlIIl() {
        lIllIIlllIlI = new int[9];
        Q.lIllIIlllIlI[0] = (0x2F ^ 0x5B ^ (0x6E ^ 0x47)) & (127 + 173 - 248 + 203 ^ 87 + 121 - 129 + 83 ^ -1);
        Q.lIllIIlllIlI[1] = 1;
        Q.lIllIIlllIlI[2] = 0x7E ^ 0x72;
        Q.lIllIIlllIlI[3] = 2;
        Q.lIllIIlllIlI[4] = -1;
        Q.lIllIIlllIlI[5] = 3;
        Q.lIllIIlllIlI[6] = 0xBF ^ 0xBB;
        Q.lIllIIlllIlI[7] = 0x5E ^ 0x5B;
        Q.lIllIIlllIlI[8] = 89 + 110 - 171 + 106 ^ 70 + 67 - 30 + 35;
    }
}

