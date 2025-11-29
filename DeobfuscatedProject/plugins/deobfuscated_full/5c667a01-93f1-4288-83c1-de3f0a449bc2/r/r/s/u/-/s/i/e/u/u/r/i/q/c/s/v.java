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

/* TASK: Looting -> LootingTask */
@TaskDesc(name="Looting", blocking=true, priority=50000)
public class v
extends Task {
    private final /* synthetic */ SquireScurriusConfig aj;
    private static /* synthetic */ String[] lIIlIlIlIlllI;
    private static /* synthetic */ int[] lIIlIlIlIllll;
    private /* synthetic */ b c;
    private final /* synthetic */ SquireScurrius ai;

    private static void lIlIllIIIIllIll() {
        lIIlIlIlIllll = new int[7];
        v.lIIlIlIlIllll[0] = (0xE5 ^ 0x9E ^ (0x85 ^ 0xA0)) & (242 + 19 - 34 + 24 ^ 118 + 122 - 214 + 139 ^ -1);
        v.lIIlIlIlIllll[1] = 1;
        v.lIIlIlIlIllll[2] = 2;
        v.lIIlIlIlIllll[3] = 3;
        v.lIIlIlIlIllll[4] = 0xAC ^ 0x8B ^ (0x47 ^ 0x64);
        v.lIIlIlIlIllll[5] = 0x1A ^ 0x1F;
        v.lIIlIlIlIllll[6] = 0x1A ^ 0x12;
    }

    private static boolean lIlIllIIIIllllI(Object object) {
        return object == null;
    }

    private static boolean lIlIllIIIlIIIII(int n2, int n3) {
        return n2 < n3;
    }

    @Inject
    public v(SquireScurrius squireScurrius, SquireScurriusConfig squireScurriusConfig) {
        this.aj = squireScurriusConfig;
        this.ai = squireScurrius;
        this.c = squireScurrius.n();
    }

    private static boolean lIlIllIIIIlllll(int n2) {
        return n2 != 0;
    }

    private static void lIlIllIIIIllIlI() {
        lIIlIlIlIlllI = new String[lIIlIlIlIllll[5]];
        v.lIIlIlIlIlllI[v.lIIlIlIlIllll[0]] = v."Scurrius";
        v.lIIlIlIlIlllI[v.lIIlIlIlIllll[1]] = v."Drop";
        v.lIIlIlIlIlllI[v.lIIlIlIlIllll[2]] = v."Eat";
        v.lIIlIlIlIlllI[v.lIIlIlIlIllll[3]] = v."Take";
        v.lIIlIlIlIlllI[v.lIIlIlIlIllll[4]] = v."Eat";
    }

    private static String lIlIllIIIIlIlll(String var23, String var6) {
        try {
            SecretKeySpec var1 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var6.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var22 = Cipher.getInstance("Blowfish");
            var22.init(lIIlIlIlIllll[2], var1);
            return new String(var22.doFinal(Base64.getDecoder().decode(var23.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var19) {
            var19.printStackTrace();
            return null;
        }
    }

    private static String lIlIllIIIIllIIl(String var17, String var21) {
        var17 = new String(Base64.getDecoder().decode(var17.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var15 = new StringBuilder();
        char[] var12 = var21.toCharArray();
        int var11 = lIIlIlIlIllll[0];
        char[] var14 = var17.toCharArray();
        int var20 = var14.length;
        int var5 = lIIlIlIlIllll[0];
        while (v.lIlIllIIIlIIIII(var5, var20)) {
            char var2 = var14[var5];
            var15.append((char)(var2 ^ var12[var11 % var12.length]));
            0;
            ++var11;
            ++var5;
            0;
            if ((77 + 24 - -24 + 74 ^ 129 + 30 - -22 + 13) > 0) continue;
            return null;
        }
        return String.valueOf(var15);
    }

    private static boolean lIlIllIIIIlllII(int n2) {
        return n2 == 0;
    }

    static {
        v.lIlIllIIIIllIll();
        v.lIlIllIIIIllIlI();
    }

    private static String lIlIllIIIIllIII(String var18, String var4) {
        try {
            SecretKeySpec var10 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var4.getBytes(StandardCharsets.UTF_8)), lIIlIlIlIllll[6]), "DES");
            Cipher var8 = Cipher.getInstance("DES");
            var8.init(lIIlIlIlIllll[2], var10);
            return new String(var8.doFinal(Base64.getDecoder().decode(var18.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var3) {
            var3.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIllIIIIlllIl(Object object) {
        return object != null;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var2_2;
        TileItem var24;
        v var13;
        if (v.lIlIllIIIIlllII(this.ai.c() ? 1 : 0)) {
            return lIIlIlIlIllll[0];
        }
        String[] stringArray = new String[lIIlIlIlIllll[1]];
        stringArray[v.lIIlIlIlIllll[0]] = lIIlIlIlIlllI[lIIlIlIlIllll[0]];
        NPC var9 = NPCs.getNearest((String[])stringArray);
        if (v.lIlIllIIIIlllIl(var9)) {
            return lIIlIlIlIllll[0];
        }
        TileItem var16 = TileItems.getNearest(tileItem -> {
            boolean bl;
            if (!v.lIlIllIIIIlllII(d.v.contains(tileItem.getName()) ? 1 : 0) || v.lIlIllIIIIlllll(this.aj.lootBoosting() ? 1 : 0) && v.lIlIllIIIIlllll(d.y.contains(tileItem.getName()) ? 1 : 0)) {
                bl = lIIlIlIlIllll[1];
                0;
                if (-(0x5E ^ 0x5A ^ (0x94 ^ 0x88) & ~(0x76 ^ 0x6A)) > 0) {
                    return ((0xCE ^ 0xA0 ^ (0xAD ^ 0x86)) & (193 + 80 - 219 + 146 ^ 27 + 113 - 107 + 108 ^ -1)) != 0;
                }
            } else {
                bl = lIIlIlIlIllll[0];
            }
            return bl;
        });
        if (v.lIlIllIIIIllllI(var16)) {
            var24 = TileItems.getNearest(tileItem -> d.w.contains(tileItem.getName()));
            if (!v.lIlIllIIIIlllIl(var24) || v.lIlIllIIIIlllll(Inventory.isFull() ? 1 : 0)) {
                return lIIlIlIlIllll[0];
            }
            var16 = var24;
        }
        if (v.lIlIllIIIIlllll(Inventory.isFull() ? 1 : 0)) {
            var24 = Inventory.getFirst(item -> d.z.contains(item.getName()));
            if (v.lIlIllIIIIlllIl(var24)) {
                var24.interact(lIIlIlIlIlllI[lIIlIlIlIllll[1]]);
                return lIIlIlIlIllll[1];
            }
            Item var7 = Inventory.getFirst(item -> {
                String[] stringArray = new String[lIIlIlIlIllll[1]];
                stringArray[v.lIIlIlIlIllll[0]] = lIIlIlIlIlllI[lIIlIlIlIllll[4]];
                return item.hasAction(stringArray);
            });
            if (v.lIlIllIIIIllllI(var7)) {
                var13.ai.e(lIIlIlIlIllll[1]);
                return lIIlIlIlIllll[0];
            }
            var7.interact(lIIlIlIlIlllI[lIIlIlIlIllll[2]]);
            return lIIlIlIlIllll[1];
        }
        var2_2.interact(lIIlIlIlIlllI[lIIlIlIlIllll[3]]);
        return lIIlIlIlIllll[1];
    }
}

