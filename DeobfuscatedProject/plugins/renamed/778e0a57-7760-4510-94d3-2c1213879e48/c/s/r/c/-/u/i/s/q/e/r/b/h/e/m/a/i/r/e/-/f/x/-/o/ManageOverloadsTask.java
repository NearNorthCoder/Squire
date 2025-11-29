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
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.cox.SquireChambersConfig;
import gg.squire.cox.SquireChambersPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
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

/* TASK: Manage Overloads -> ManageoverloadsTask */
@TaskDesc(name="Manage Overloads", priority=30000, blocking=true)
public class ManageOverloadsTask
extends Task {
    private final /* synthetic */ SquireChambersConfig cO;
    private static /* synthetic */ String[] lIlIIlIIlllI;
    private final /* synthetic */ SquireChambersPlugin cN;
    private static /* synthetic */ int[] lIlIIlIlIlIl;

    protected int cq() {
        return Inventory.getCount(item -> item.getName().startsWith(lIlIIlIIlllI[lIlIIlIlIlIl[2]]));
    }

    private static boolean llIllIIlIlIlII(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean llIllIIlIIllll(int n2) {
        return n2 == 0;
    }

    private static boolean llIllIIlIlIIII(int n2) {
        return n2 != 0;
    }

    @Inject
    public ai(SquireChambersPlugin squireChambersPlugin, SquireChambersConfig squireChambersConfig) {
        this.cN = squireChambersPlugin;
        this.cO = squireChambersConfig;
    }

    private static boolean llIllIIlIIlllI(int n2, int n3) {
        return n2 <= n3;
    }

    private static String llIllIIIllllII(String var11, String var13) {
        try {
            SecretKeySpec var8 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var13.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var5 = Cipher.getInstance("Blowfish");
            var5.init(lIlIIlIlIlIl[4], var8);
            return new String(var5.doFinal(Base64.getDecoder().decode(var11.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var1) {
            var1.printStackTrace();
            return null;
        }
    }

    private static String llIllIIlIIlIll(String var10, String var6) {
        var10 = new String(Base64.getDecoder().decode(var10.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var3 = new StringBuilder();
        char[] var4 = var6.toCharArray();
        int var14 = lIlIIlIlIlIl[1];
        char[] var2 = var10.toCharArray();
        int var15 = var2.length;
        int var7 = lIlIIlIlIlIl[1];
        while (ai.llIllIIlIlIlII(var7, var15)) {
            char var9 = var2[var7];
            var3.append((char)(var9 ^ var4[var14 % var4.length]));
            0;
            ++var14;
            ++var7;
            0;
            if (-1 < 0) continue;
            return null;
        }
        return String.valueOf(var3);
    }

    private static void llIllIIlIIllIl() {
        lIlIIlIlIlIl = new int[6];
        ai.lIlIIlIlIlIl[0] = 0x2E ^ 8 ^ (1 ^ 0x23);
        ai.lIlIIlIlIlIl[1] = (211 + 127 - 312 + 226 ^ 44 + 130 - -6 + 9) & (2 ^ (0x17 ^ 0x54) ^ -1);
        ai.lIlIIlIlIlIl[2] = 1;
        ai.lIlIIlIlIlIl[3] = 0xFFFFD31D & 0x7EE6;
        ai.lIlIIlIlIlIl[4] = 2;
        ai.lIlIIlIlIlIl[5] = 3;
    }

    protected int cp() {
        return Inventory.getCount(item -> item.getName().startsWith(lIlIIlIIlllI[lIlIIlIlIlIl[4]]));
    }

    static {
        ai.llIllIIlIIllIl();
        ai.llIllIIlIIllII();
    }

    private static void llIllIIlIIllII() {
        lIlIIlIIlllI = new String[lIlIIlIlIlIl[0]];
        ai.lIlIIlIIlllI[ai.lIlIIlIlIlIl[1]] = ai."Take";
        ai.lIlIIlIIlllI[ai.lIlIIlIlIlIl[2]] = ai."Revitalisation";
        ai.lIlIIlIIlllI[ai.lIlIIlIlIlIl[4]] = ai."Xeric's aid";
        ai.lIlIIlIIlllI[ai.lIlIIlIlIlIl[5]] = ai."Attack";
    }

    private static boolean llIllIIlIlIIIl(Object object) {
        return object != null;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var2_2;
        ai var16;
        if (!ai.llIllIIlIIlllI(u.bg(), lIlIIlIlIlIl[0]) || ai.llIllIIlIIllll(Players.getLocal().getPlane())) {
            return lIlIIlIlIlIl[1];
        }
        int[] nArray = new int[lIlIIlIlIlIl[2]];
        nArray[ai.lIlIIlIlIlIl[1]] = lIlIIlIlIlIl[3];
        if (ai.llIllIIlIlIIII(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return lIlIIlIlIlIl[1];
        }
        NPC var17 = NPCs.getNearest(nPC -> {
            int n2;
            String[] stringArray = new String[lIlIIlIlIlIl[2]];
            stringArray[ai.lIlIIlIlIlIl[1]] = lIlIIlIIlllI[lIlIIlIlIlIl[5]];
            if (ai.llIllIIlIlIIII(nPC.hasAction(stringArray) ? 1 : 0) && ai.llIllIIlIlIIII(this.cN.L().a((Locatable)nPC) ? 1 : 0)) {
                n2 = lIlIIlIlIlIl[2];
                0;
                if (2 >= (0xA8 ^ 0xB5 ^ (0x5F ^ 0x46))) {
                    return false;
                }
            } else {
                n2 = lIlIIlIlIlIl[1];
            }
            return n2 != 0;
        });
        if (ai.llIllIIlIlIIIl(var17)) {
            return lIlIIlIlIlIl[1];
        }
        TileItem var12 = TileItems.getNearest(tileItem -> {
            int n2;
            if (ai.llIllIIlIlIIll(tileItem.getId(), lIlIIlIlIlIl[3]) && ai.llIllIIlIlIIII(Reachable.isInteractable((Locatable)tileItem) ? 1 : 0) && ai.llIllIIlIlIIII(this.cN.L().a((Locatable)tileItem) ? 1 : 0)) {
                n2 = lIlIIlIlIlIl[2];
                0;
                if (1 != 1) {
                    return false;
                }
            } else {
                n2 = lIlIIlIlIlIl[1];
            }
            return n2 != 0;
        });
        if (ai.llIllIIlIlIIlI(var12)) {
            return lIlIIlIlIlIl[1];
        }
        if (ai.llIllIIlIlIIII(Inventory.isFull() ? 1 : 0)) {
            var16.cN.x();
            0;
            return lIlIIlIlIlIl[2];
        }
        var2_2.interact(lIlIIlIIlllI[lIlIIlIlIlIl[1]]);
        return lIlIIlIlIlIl[2];
    }

    private static boolean llIllIIlIlIIll(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean llIllIIlIlIIlI(Object object) {
        return object == null;
    }
}

