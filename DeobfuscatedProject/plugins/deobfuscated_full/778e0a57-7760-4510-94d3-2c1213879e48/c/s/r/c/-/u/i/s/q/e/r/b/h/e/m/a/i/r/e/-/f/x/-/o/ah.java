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

import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.N;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.u;
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

/* TASK: Pickup enhance -> PickupenhanceTask */
@TaskDesc(name="Pickup enhance", priority=30000, blocking=true)
public class ah
extends Task {
    private final /* synthetic */ SquireChambersConfig cM;
    private static /* synthetic */ String[] lIIlllllIIII;
    private final /* synthetic */ SquireChambersPlugin cL;
    private static /* synthetic */ int[] lIIlllllIIIl;

    private static boolean llIlIIlIIlIIll(Object object) {
        return object != null;
    }

    static {
        ah.llIlIIlIIlIIlI();
        ah.llIlIIlIIlIIIl();
    }

    protected int cp() {
        return Inventory.getCount(item -> item.getName().startsWith(lIIlllllIIII[lIIlllllIIIl[3]]));
    }

    private static boolean llIlIIlIIllIIl(int n2, int n3) {
        return n2 < n3;
    }

    @Inject
    public ah(SquireChambersPlugin squireChambersPlugin, SquireChambersConfig squireChambersConfig) {
        this.cL = squireChambersPlugin;
        this.cM = squireChambersConfig;
    }

    protected int cq() {
        return Inventory.getCount(item -> item.getName().startsWith(lIIlllllIIII[lIIlllllIIIl[2]]));
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var2_2;
        ah var19;
        if (!ah.llIlIIlIIlIIll(this.cL.C()) || ah.llIlIIlIIlIlII(this.cL.C().e().contains((Object)N.VESPULA) ? 1 : 0)) {
            return lIIlllllIIIl[0];
        }
        if (!ah.llIlIIlIIlIlIl(u.bg(), lIIlllllIIIl[1]) || ah.llIlIIlIIlIlII(Players.getLocal().getPlane())) {
            return lIIlllllIIIl[0];
        }
        if (ah.llIlIIlIIlIllI(Inventory.contains(item -> item.getName().toLowerCase().contains(lIIlllllIIII[lIIlllllIIIl[1]])) ? 1 : 0)) {
            return lIIlllllIIIl[0];
        }
        NPC var3 = NPCs.getNearest(nPC -> {
            int n2;
            String[] stringArray = new String[lIIlllllIIIl[2]];
            stringArray[ah.lIIlllllIIIl[0]] = lIIlllllIIII[lIIlllllIIIl[5]];
            if (ah.llIlIIlIIlIllI(nPC.hasAction(stringArray) ? 1 : 0) && ah.llIlIIlIIlIllI(this.cL.L().a((Locatable)nPC) ? 1 : 0)) {
                n2 = lIIlllllIIIl[2];
                0;
                if (((0x50 ^ 0x7D) & ~(0x94 ^ 0xB9)) < ((0x85 ^ 0xC1) & ~(0xD5 ^ 0x91))) {
                    return false;
                }
            } else {
                n2 = lIIlllllIIIl[0];
            }
            return n2 != 0;
        });
        if (ah.llIlIIlIIlIIll(var3)) {
            return lIIlllllIIIl[0];
        }
        TileItem var6 = TileItems.getNearest(tileItem -> {
            int n2;
            if (ah.llIlIIlIIllIII(tileItem.getId(), lIIlllllIIIl[4]) && ah.llIlIIlIIlIllI(Reachable.isInteractable((Locatable)tileItem) ? 1 : 0) && ah.llIlIIlIIlIllI(this.cL.L().a((Locatable)tileItem) ? 1 : 0)) {
                n2 = lIIlllllIIIl[2];
                0;
                
                }
            } else {
                n2 = lIIlllllIIIl[0];
            }
            return n2 != 0;
        });
        if (ah.llIlIIlIIlIlll(var6)) {
            return lIIlllllIIIl[0];
        }
        if (ah.llIlIIlIIlIllI(Inventory.isFull() ? 1 : 0)) {
            var19.cL.x();
            0;
            return lIIlllllIIIl[2];
        }
        var2_2.interact(lIIlllllIIII[lIIlllllIIIl[0]]);
        return lIIlllllIIIl[2];
    }

    private static void llIlIIlIIlIIlI() {
        lIIlllllIIIl = new int[8];
        ah.lIIlllllIIIl[0] = (61 + 199 - 144 + 92 ^ 12 + 88 - -8 + 50) & (0x38 ^ 6 ^ (0x3E ^ 0x4E) ^ -1);
        ah.lIIlllllIIIl[1] = 0xF ^ 0xB;
        ah.lIIlllllIIIl[2] = 1;
        ah.lIIlllllIIIl[3] = 2;
        ah.lIIlllllIIIl[4] = -(0xFFFFBF11 & 0x62FF) & (0xFFFFF7FD & 0x7BFE);
        ah.lIIlllllIIIl[5] = 3;
        ah.lIIlllllIIIl[6] = 128 + 138 - 249 + 123 ^ 132 + 72 - 134 + 67;
        ah.lIIlllllIIIl[7] = 0x29 ^ 0x5B ^ (0xE ^ 0x74);
    }

    private static boolean llIlIIlIIlIlIl(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean llIlIIlIIlIlll(Object object) {
        return object == null;
    }

    private static String llIlIIlIIIllll(String var14, String var20) {
        try {
            SecretKeySpec var18 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var20.getBytes(StandardCharsets.UTF_8)), lIIlllllIIIl[7]), "DES");
            Cipher var5 = Cipher.getInstance("DES");
            var5.init(lIIlllllIIIl[3], var18);
            return new String(var5.doFinal(Base64.getDecoder().decode(var14.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var10) {
            var10.printStackTrace();
            return null;
        }
    }

    private static boolean llIlIIlIIlIllI(int n2) {
        return n2 != 0;
    }

    private static boolean llIlIIlIIlIlII(int n2) {
        return n2 == 0;
    }

    private static String llIlIIlIIlIIII(String var1, String var7) {
        var1 = new String(Base64.getDecoder().decode(var1.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var8 = new StringBuilder();
        char[] var13 = var7.toCharArray();
        int var2 = lIIlllllIIIl[0];
        char[] var4 = var1.toCharArray();
        int var9 = var4.length;
        int var15 = lIIlllllIIIl[0];
        while (ah.llIlIIlIIllIIl(var15, var9)) {
            char var17 = var4[var15];
            var8.append((char)(var17 ^ var13[var2 % var13.length]));
            0;
            ++var2;
            ++var15;
            0;
            if (((96 + 138 - 116 + 39 ^ 92 + 166 - 123 + 55) & (146 + 130 - 114 + 8 ^ 57 + 136 - 119 + 63 ^ -1)) == ((0x28 ^ 0x5C ^ (2 ^ 0x7C)) & (0x38 ^ 0x1D ^ (0x4A ^ 0x65) ^ -1))) continue;
            return null;
        }
        return String.valueOf(var8);
    }

    private static String llIlIIlIIIlllI(String var11, String var22) {
        try {
            SecretKeySpec var21 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var22.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var12 = Cipher.getInstance("Blowfish");
            var12.init(lIIlllllIIIl[3], var21);
            return new String(var12.doFinal(Base64.getDecoder().decode(var11.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var16) {
            var16.printStackTrace();
            return null;
        }
    }

    private static boolean llIlIIlIIllIII(int n2, int n3) {
        return n2 == n3;
    }

    private static void llIlIIlIIlIIIl() {
        lIIlllllIIII = new String[lIIlllllIIIl[6]];
        ah.lIIlllllIIII[ah.lIIlllllIIIl[0]] = ah."Take";
        ah.lIIlllllIIII[ah.lIIlllllIIIl[2]] = ah."Revitalisation";
        ah.lIIlllllIIII[ah.lIIlllllIIIl[3]] = ah."Xeric's aid";
        ah.lIIlllllIIII[ah.lIIlllllIIIl[5]] = ah."Attack";
        ah.lIIlllllIIII[ah.lIIlllllIIIl[1]] = ah."prayer enhance";
    }
}

