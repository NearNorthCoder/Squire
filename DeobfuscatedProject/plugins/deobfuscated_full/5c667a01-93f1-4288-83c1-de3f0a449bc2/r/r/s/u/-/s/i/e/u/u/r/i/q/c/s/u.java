/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.NPC
 *  net.runelite.api.TileItem
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.items.Inventory
 */
package r.r.s.u.-.s.i.e.u.u.r.i.q.c.s;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.scurrius.SquireScurrius;
import gg.squire.scurrius.SquireScurriusConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.runelite.api.TileItem;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.items.Inventory;
import r.r.s.u.-.s.i.e.u.u.r.i.q.c.s.b;
import r.r.s.u.-.s.i.e.u.u.r.i.q.c.s.d;

/* TASK: Looting and burying bones -> LootingandburyingbonesTask */
@TaskDesc(name="Looting and burying bones", blocking=true, priority=10000)
public class u
extends Task {
    private final /* synthetic */ SquireScurriusConfig ah;
    private /* synthetic */ b c;
    private static /* synthetic */ String[] lIIlIllIIIIII;
    private static /* synthetic */ int[] lIIlIllIIIIIl;
    private final /* synthetic */ SquireScurrius ag;

    private static boolean lIlIllIIlIlIIlI(int n2) {
        return n2 != 0;
    }

    static {
        u.lIlIllIIlIIlllI();
        u.lIlIllIIlIIllIl();
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var3_3;
        u var10;
        if (u.lIlIllIIlIIllll(this.ah.lootBigBones() ? 1 : 0)) {
            return lIIlIllIIIIIl[0];
        }
        if (u.lIlIllIIlIIllll(var10.ag.c() ? 1 : 0)) {
            return lIIlIllIIIIIl[0];
        }
        String[] stringArray = new String[lIIlIllIIIIIl[1]];
        stringArray[u.lIIlIllIIIIIl[0]] = lIIlIllIIIIII[lIIlIllIIIIIl[0]];
        NPC var20 = NPCs.getNearest((String[])stringArray);
        if (u.lIlIllIIlIlIIII(var20)) {
            return lIIlIllIIIIIl[0];
        }
        int[] nArray = new int[lIIlIllIIIIIl[1]];
        nArray[u.lIIlIllIIIIIl[0]] = lIIlIllIIIIIl[2];
        Item var16 = Inventory.getFirst((int[])nArray);
        if (u.lIlIllIIlIlIIII(var16)) {
            var16.interact(lIIlIllIIIIII[lIIlIllIIIIIl[1]]);
            return lIIlIllIIIIIl[1];
        }
        TileItem var23 = TileItems.getNearest(tileItem -> tileItem.getName().equals(lIIlIllIIIIII[lIIlIllIIIIIl[7]]));
        if (u.lIlIllIIlIlIIIl(var23)) {
            return lIIlIllIIIIIl[0];
        }
        if (u.lIlIllIIlIlIIlI(Inventory.isFull() ? 1 : 0)) {
            Item var25 = Inventory.getFirst(item -> d.z.contains(item.getName()));
            if (u.lIlIllIIlIlIIII(var25)) {
                var25.interact(lIIlIllIIIIII[lIIlIllIIIIIl[3]]);
                return lIIlIllIIIIIl[1];
            }
            Item var8 = Inventory.getFirst(item -> {
                String[] stringArray = new String[lIIlIllIIIIIl[1]];
                stringArray[u.lIIlIllIIIIIl[0]] = lIIlIllIIIIII[lIIlIllIIIIIl[6]];
                return item.hasAction(stringArray);
            });
            if (u.lIlIllIIlIlIIIl(var8)) {
                var10.ag.e(lIIlIllIIIIIl[1]);
                return lIIlIllIIIIIl[0];
            }
            var8.interact(lIIlIllIIIIII[lIIlIllIIIIIl[4]]);
            return lIIlIllIIIIIl[1];
        }
        var3_3.interact(lIIlIllIIIIII[lIIlIllIIIIIl[5]]);
        return lIIlIllIIIIIl[1];
    }

    private static boolean lIlIllIIlIlIIII(Object object) {
        return object != null;
    }

    @Inject
    public u(SquireScurrius squireScurrius, SquireScurriusConfig squireScurriusConfig) {
        this.ah = squireScurriusConfig;
        this.ag = squireScurrius;
        this.c = squireScurrius.n();
    }

    private static boolean lIlIllIIlIIllll(int n2) {
        return n2 == 0;
    }

    private static void lIlIllIIlIIllIl() {
        lIIlIllIIIIII = new String[lIIlIllIIIIIl[8]];
        u.lIIlIllIIIIII[u.lIIlIllIIIIIl[0]] = u."Scurrius";
        u.lIIlIllIIIIII[u.lIIlIllIIIIIl[1]] = u."Bury";
        u.lIIlIllIIIIII[u.lIIlIllIIIIIl[3]] = u."Drop";
        u.lIIlIllIIIIII[u.lIIlIllIIIIIl[4]] = u."Eat";
        u.lIIlIllIIIIII[u.lIIlIllIIIIIl[5]] = u."Take";
        u.lIIlIllIIIIII[u.lIIlIllIIIIIl[6]] = u."Eat";
        u.lIIlIllIIIIII[u.lIIlIllIIIIIl[7]] = u."Big bones";
    }

    private static boolean lIlIllIIlIlIIIl(Object object) {
        return object == null;
    }

    private static void lIlIllIIlIIlllI() {
        lIIlIllIIIIIl = new int[10];
        u.lIIlIllIIIIIl[0] = (0x58 ^ 0x1D) & ~(0x50 ^ 0x15);
        u.lIIlIllIIIIIl[1] = 1;
        u.lIIlIllIIIIIl[2] = 0xFFFFF637 & 0xBDC;
        u.lIIlIllIIIIIl[3] = 2;
        u.lIIlIllIIIIIl[4] = 3;
        u.lIIlIllIIIIIl[5] = 0x41 ^ 0x45;
        u.lIIlIllIIIIIl[6] = 0x5E ^ 0x5B;
        u.lIIlIllIIIIIl[7] = 0x9D ^ 0x9B;
        u.lIIlIllIIIIIl[8] = 0x6D ^ 0x6A;
        u.lIIlIllIIIIIl[9] = 0x3C ^ 0x34;
    }

    private static String lIlIllIIlIIlIll(String var5, String var21) {
        try {
            SecretKeySpec var12 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var21.getBytes(StandardCharsets.UTF_8)), lIIlIllIIIIIl[9]), "DES");
            Cipher var15 = Cipher.getInstance("DES");
            var15.init(lIIlIllIIIIIl[3], var12);
            return new String(var15.doFinal(Base64.getDecoder().decode(var5.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var4) {
            var4.printStackTrace();
            return null;
        }
    }

    private static String lIlIllIIlIIllII(String var2, String var14) {
        try {
            SecretKeySpec var19 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var14.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var13 = Cipher.getInstance("Blowfish");
            var13.init(lIIlIllIIIIIl[3], var19);
            return new String(var13.doFinal(Base64.getDecoder().decode(var2.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var22) {
            var22.printStackTrace();
            return null;
        }
    }

    private static String lIlIllIIlIIlIlI(String var6, String var11) {
        var6 = new String(Base64.getDecoder().decode(var6.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var7 = new StringBuilder();
        char[] var3 = var11.toCharArray();
        int var24 = lIIlIllIIIIIl[0];
        char[] var17 = var6.toCharArray();
        int var18 = var17.length;
        int var9 = lIIlIllIIIIIl[0];
        while (u.lIlIllIIlIlIIll(var9, var18)) {
            char var1 = var17[var9];
            var7.append((char)(var1 ^ var3[var24 % var3.length]));
            0;
            ++var24;
            ++var9;
            0;
            if (1 < (0x6E ^ 0x6A)) continue;
            return null;
        }
        return String.valueOf(var7);
    }

    private static boolean lIlIllIIlIlIIll(int n2, int n3) {
        return n2 < n3;
    }
}

