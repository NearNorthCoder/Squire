/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.TileItem
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Reachable
 */
package c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o;

import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.u_Unknown;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.WEnum;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.cox.SquireChambersConfig;
import gg.squire.cox.SquireChambersPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.TileItem;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Reachable;

/* TASK: Pick Seeds -> PickseedsTask */
@TaskDesc(name="Pick Seeds", priority=30000, blocking=true)
public class PickSeedsTask
extends Task {
    private final /* synthetic */ SquireChambersConfig cQ;
    private final /* synthetic */ SquireChambersPlugin cP;
    private static /* synthetic */ int[] lIlIIIllIlIl;
    private static /* synthetic */ String[] lIlIIIllIlII;

    private static void llIlIllIlIllll() {
        lIlIIIllIlIl = new int[8];
        aj.lIlIIIllIlIl[0] = 1;
        aj.lIlIIIllIlIl[1] = (0x23 ^ 0xA) & ~(0xAC ^ 0x85);
        aj.lIlIIIllIlIl[2] = 0xFFFFD5BD & 0x7BEF;
        aj.lIlIIIllIlIl[3] = 0x6A ^ 0x6F;
        aj.lIlIIIllIlIl[4] = 3;
        aj.lIlIIIllIlIl[5] = 2;
        aj.lIlIIIllIlIl[6] = 152 + 44 - 152 + 132 ^ 64 + 105 - 13 + 24;
        aj.lIlIIIllIlIl[7] = 0x3D ^ 0x35;
    }

    private static boolean llIlIllIllIlII(int n2) {
        return n2 == 0;
    }

    protected int cq() {
        return Inventory.getCount(item -> item.getName().startsWith(lIlIIIllIlII[lIlIIIllIlIl[0]]));
    }

    private static String llIlIllIlIllII(String var16, String var13) {
        try {
            SecretKeySpec var18 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var13.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var8 = Cipher.getInstance("Blowfish");
            var8.init(lIlIIIllIlIl[5], var18);
            return new String(var8.doFinal(Base64.getDecoder().decode(var16.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var20) {
            var20.printStackTrace();
            return null;
        }
    }

    private static boolean llIlIllIllIlll(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean llIlIllIllIllI(int n2) {
        return n2 != 0;
    }

    @Inject
    public aj(SquireChambersPlugin squireChambersPlugin, SquireChambersConfig squireChambersConfig) {
        this.cP = squireChambersPlugin;
        this.cQ = squireChambersConfig;
    }

    private static String llIlIllIlIllIl(String var4, String var6) {
        var4 = new String(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var12 = new StringBuilder();
        char[] var1 = var6.toCharArray();
        int var15 = lIlIIIllIlIl[1];
        char[] var7 = var4.toCharArray();
        int var9 = var7.length;
        int var14 = lIlIIIllIlIl[1];
        while (aj.llIlIllIlllIII(var14, var9)) {
            char var22 = var7[var14];
            var12.append((char)(var22 ^ var1[var15 % var1.length]));
            0;
            ++var15;
            ++var14;
            0;
            if (-1 <= 0) continue;
            return null;
        }
        return String.valueOf(var12);
    }

    private static boolean llIlIllIllIIII(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean llIlIllIllIIlI(int n2, int n3) {
        return n2 >= n3;
    }

    protected int cp() {
        return Inventory.getCount(item -> item.getName().startsWith(lIlIIIllIlII[lIlIIIllIlIl[5]]));
    }

    private static boolean llIlIllIllIIIl(Object object, Object object2) {
        return object == object2;
    }

    private static boolean llIlIllIllIlIl(Object object) {
        return object == null;
    }

    private static String llIlIllIlIlIll(String var3, String var5) {
        try {
            SecretKeySpec var19 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var5.getBytes(StandardCharsets.UTF_8)), lIlIIIllIlIl[7]), "DES");
            Cipher var17 = Cipher.getInstance("DES");
            var17.init(lIlIIIllIlIl[5], var19);
            return new String(var17.doFinal(Base64.getDecoder().decode(var3.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var2) {
            var2.printStackTrace();
            return null;
        }
    }

    private static void llIlIllIlIlllI() {
        lIlIIIllIlII = new String[lIlIIIllIlIl[6]];
        aj.lIlIIIllIlII[aj.lIlIIIllIlIl[1]] = aj."Take";
        aj.lIlIIIllIlII[aj.lIlIIIllIlIl[0]] = aj."Revitalisation";
        aj.lIlIIIllIlII[aj.lIlIIIllIlIl[5]] = aj."Xeric's aid";
        aj.lIlIIIllIlII[aj.lIlIIIllIlIl[4]] = aj."Attack";
    }

    static {
        aj.llIlIllIlIllll();
        aj.llIlIllIlIlllI();
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var2_2;
        aj var21;
        int[] nArray = new int[lIlIIIllIlIl[0]];
        nArray[aj.lIlIIIllIlIl[1]] = lIlIIIllIlIl[2];
        if (aj.llIlIllIllIIII(Inventory.getCount((boolean)lIlIIIllIlIl[0], (int[])nArray), lIlIIIllIlIl[3])) {
            return lIlIIIllIlIl[1];
        }
        if (aj.llIlIllIllIIIl((Object)u.bh(), (Object)w.REACHED_BOTTOM)) {
            return lIlIIIllIlIl[1];
        }
        if (aj.llIlIllIllIIlI(var21.cq(), lIlIIIllIlIl[4])) {
            return lIlIIIllIlIl[1];
        }
        if (!aj.llIlIllIllIIll(var21.cP.L()) || aj.llIlIllIllIlII(var21.cP.L().a((Locatable)Players.getLocal()) ? 1 : 0)) {
            return lIlIIIllIlIl[1];
        }
        NPC var10 = NPCs.getNearest(nPC -> {
            int n2;
            String[] stringArray = new String[lIlIIIllIlIl[0]];
            stringArray[aj.lIlIIIllIlIl[1]] = lIlIIIllIlII[lIlIIIllIlIl[4]];
            if (aj.llIlIllIllIllI(nPC.hasAction(stringArray) ? 1 : 0) && aj.llIlIllIllIllI(this.cP.L().a((Locatable)nPC) ? 1 : 0)) {
                n2 = lIlIIIllIlIl[0];
                0;
                if (1 < 0) {
                    return ((0xED ^ 0x8B ^ (0x73 ^ 7)) & (33 + 28 - -82 + 4 ^ 97 + 66 - 129 + 95 ^ -1)) != 0;
                }
            } else {
                n2 = lIlIIIllIlIl[1];
            }
            return n2 != 0;
        });
        if (aj.llIlIllIllIIll(var10)) {
            return lIlIIIllIlIl[1];
        }
        TileItem var11 = TileItems.getNearest(tileItem -> {
            int n2;
            if (aj.llIlIllIllIlll(tileItem.getId(), lIlIIIllIlIl[2]) && aj.llIlIllIllIllI(Reachable.isInteractable((Locatable)tileItem) ? 1 : 0) && aj.llIlIllIllIllI(this.cP.L().a((Locatable)tileItem) ? 1 : 0)) {
                n2 = lIlIIIllIlIl[0];
                0;
                if (3 == 0) {
                    return false;
                }
            } else {
                n2 = lIlIIIllIlIl[1];
            }
            return n2 != 0;
        });
        if (aj.llIlIllIllIlIl(var11)) {
            return lIlIIIllIlIl[1];
        }
        if (aj.llIlIllIllIllI(Inventory.isFull() ? 1 : 0)) {
            int[] nArray2 = new int[lIlIIIllIlIl[0]];
            nArray2[aj.lIlIIIllIlIl[1]] = lIlIIIllIlIl[2];
            if (aj.llIlIllIllIlII(Inventory.contains((int[])nArray2) ? 1 : 0)) {
                var21.cP.x();
                0;
                return lIlIIIllIlIl[0];
            }
        }
        var2_2.interact(lIlIIIllIlII[lIlIIIllIlIl[1]]);
        return lIlIIIllIlIl[0];
    }

    private static boolean llIlIllIllIIll(Object object) {
        return object != null;
    }

    private static boolean llIlIllIlllIII(int n2, int n3) {
        return n2 < n3;
    }
}

