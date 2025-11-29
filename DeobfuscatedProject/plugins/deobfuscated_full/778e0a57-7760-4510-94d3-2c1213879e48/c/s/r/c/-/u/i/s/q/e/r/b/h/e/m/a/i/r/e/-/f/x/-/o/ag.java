/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.Skill
 *  net.runelite.api.TileItem
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Reachable
 */
package c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o;

import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.N;
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
import net.runelite.api.Skill;
import net.runelite.api.TileItem;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Reachable;

/* TASK: Pickup Dropped Brew -> PickupdroppedbrewTask */
@TaskDesc(name="Pickup Dropped Brew", priority=30000, blocking=true)
public class ag
extends Task {
    private static /* synthetic */ int[] lIlIlIlllIll;
    private final /* synthetic */ SquireChambersConfig cK;
    private static /* synthetic */ String[] lIlIlIlllIlI;
    private final /* synthetic */ SquireChambersPlugin cJ;

    private static boolean llIlllllIlIllI(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean llIlllllIlIlIl(int n2, int n3) {
        return n2 == n3;
    }

    static {
        ag.llIlllllIIlllI();
        ag.llIlllllIIllIl();
    }

    private static boolean llIlllllIIllll(int n2) {
        return n2 == 0;
    }

    private static boolean llIlllllIlIIll(int n2) {
        return n2 > 0;
    }

    private static boolean llIlllllIlIIlI(int n2) {
        return n2 != 0;
    }

    protected int cp() {
        return Inventory.getCount(item -> item.getName().startsWith(lIlIlIlllIlI[lIlIlIlllIll[8]]));
    }

    protected int cq() {
        return Inventory.getCount(item -> item.getName().startsWith(lIlIlIlllIlI[lIlIlIlllIll[7]]));
    }

    @Inject
    public ag(SquireChambersPlugin squireChambersPlugin, SquireChambersConfig squireChambersConfig) {
        this.cJ = squireChambersPlugin;
        this.cK = squireChambersConfig;
    }

    private static String llIlllllIIlIll(String var20, String var13) {
        try {
            SecretKeySpec var12 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var13.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var14 = Cipher.getInstance("Blowfish");
            var14.init(lIlIlIlllIll[7], var12);
            return new String(var14.doFinal(Base64.getDecoder().decode(var20.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var7) {
            var7.printStackTrace();
            return null;
        }
    }

    private static boolean llIlllllIlIlII(Object object) {
        return object == null;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var3_4;
        int lllllllllllllllIllIIllIlIllllllI22;
        NPC var18;
        ag var17;
        if (ag.llIlllllIIllll(this.cK.pickupBrews() ? 1 : 0)) {
            return lIlIlIlllIll[0];
        }
        if (ag.llIlllllIIllll(var17.cJ.E() ? 1 : 0)) {
            return lIlIlIlllIll[0];
        }
        if (ag.llIlllllIlIIII((Object)var17.cJ.L().aM(), (Object)N.SCAVENGERS)) {
            return lIlIlIlllIll[0];
        }
        if (ag.llIlllllIlIIII((Object)var17.cJ.L().aM(), (Object)N.TIGHTROPE)) {
            String[] stringArray = new String[lIlIlIlllIll[1]];
            stringArray[ag.lIlIlIlllIll[0]] = lIlIlIlllIlI[lIlIlIlllIll[0]];
            if (ag.llIlllllIIllll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                return lIlIlIlllIll[0];
            }
        }
        if (ag.llIlllllIlIIIl(var18 = NPCs.getNearest(nPC -> {
            int n2;
            String[] stringArray = new String[lIlIlIlllIll[1]];
            stringArray[ag.lIlIlIlllIll[0]] = lIlIlIlllIlI[lIlIlIlllIll[4]];
            if (ag.llIlllllIlIIlI(nPC.hasAction(stringArray) ? 1 : 0) && ag.llIlllllIlIIlI(this.cJ.L().a((Locatable)nPC) ? 1 : 0)) {
                n2 = lIlIlIlllIll[1];
                0;
                if (-(30 + 108 - 94 + 107 ^ 17 + 100 - 107 + 136) >= 0) {
                    return ((41 + 102 - -17 + 38 ^ 108 + 118 - 65 + 33) & (0x12 ^ 0x37 ^ (0x41 ^ 0x60) ^ -1)) != 0;
                }
            } else {
                n2 = lIlIlIlllIll[0];
            }
            return n2 != 0;
        }))) {
            return lIlIlIlllIll[0];
        }
        if (ag.llIlllllIlIIlI(Inventory.isFull() ? 1 : 0)) {
            return lIlIlIlllIll[0];
        }
        if (ag.llIlllllIlIIII((Object)var17.cJ.L().aM(), (Object)N.ICE_DEMON) && ag.llIlllllIlIIll(lllllllllllllllIllIIllIlIllllllI22 = lIlIlIlllIll[2] - var17.cJ.K() + (lIlIlIlllIll[3] - Skills.getLevel((Skill)Skill.WOODCUTTING)) / lIlIlIlllIll[4])) {
            return lIlIlIlllIll[0];
        }
        if (ag.llIlllllIlIIII((Object)var17.cJ.L().aM(), (Object)N.THIEVING) && ag.llIlllllIlIIll(lllllllllllllllIllIIllIlIllllllI22 = lIlIlIlllIll[5] - var17.cJ.J() + (lIlIlIlllIll[3] - Skills.getLevel((Skill)Skill.THIEVING)) / lIlIlIlllIll[6])) {
            return lIlIlIlllIll[0];
        }
        TileItem lllllllllllllllIllIIllIlIllllllI22 = TileItems.getNearest(tileItem -> {
            int n2;
            if (ag.llIlllllIlIlIl(tileItem.getId(), lIlIlIlllIll[10]) && ag.llIlllllIlIIlI(Reachable.isWalkable((WorldPoint)tileItem.getWorldLocation()) ? 1 : 0)) {
                n2 = lIlIlIlllIll[1];
                0;
                if (((0xF5 ^ 0xAF) & ~(0x49 ^ 0x13)) > (0xE ^ 0xA)) {
                    return false;
                }
            } else {
                n2 = lIlIlIlllIll[0];
            }
            return n2 != 0;
        });
        if (ag.llIlllllIlIIIl(lllllllllllllllIllIIllIlIllllllI22)) {
            return lIlIlIlllIll[0];
        }
        TileItem var4 = TileItems.getNearest(tileItem -> {
            int n2;
            if (ag.llIlllllIlIIlI(tileItem.getName().toLowerCase().contains(lIlIlIlllIlI[lIlIlIlllIll[9]]) ? 1 : 0) && ag.llIlllllIlIIlI(this.cJ.L().a((Locatable)tileItem) ? 1 : 0) && ag.llIlllllIlIIlI(Reachable.isWalkable((WorldPoint)tileItem.getWorldLocation()) ? 1 : 0)) {
                n2 = lIlIlIlllIll[1];
                0;
                if (1 <= 0) {
                    return false;
                }
            } else {
                n2 = lIlIlIlllIll[0];
            }
            return n2 != 0;
        });
        if (ag.llIlllllIlIlII(var4)) {
            return lIlIlIlllIll[0];
        }
        var3_4.interact(lIlIlIlllIlI[lIlIlIlllIll[1]]);
        return lIlIlIlllIll[1];
    }

    private static boolean llIlllllIlIIIl(Object object) {
        return object != null;
    }

    private static void llIlllllIIllIl() {
        lIlIlIlllIlI = new String[lIlIlIlllIll[11]];
        ag.lIlIlIlllIlI[ag.lIlIlIlllIll[0]] = ag."Keystone crystal";
        ag.lIlIlIlllIlI[ag.lIlIlIlllIll[1]] = ag."Take";
        ag.lIlIlIlllIlI[ag.lIlIlIlllIll[7]] = ag."Revitalisation";
        ag.lIlIlIlllIlI[ag.lIlIlIlllIll[8]] = ag."Xeric's aid";
        ag.lIlIlIlllIlI[ag.lIlIlIlllIll[9]] = ag."saradomin brew";
        ag.lIlIlIlllIlI[ag.lIlIlIlllIll[4]] = ag."Attack";
    }

    private static String llIlllllIIllII(String var9, String var15) {
        var9 = new String(Base64.getDecoder().decode(var9.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var10 = new StringBuilder();
        char[] var5 = var15.toCharArray();
        int var3 = lIlIlIlllIll[0];
        char[] var21 = var9.toCharArray();
        int var11 = var21.length;
        int var16 = lIlIlIlllIll[0];
        while (ag.llIlllllIlIllI(var16, var11)) {
            char var2 = var21[var16];
            var10.append((char)(var2 ^ var5[var3 % var5.length]));
            0;
            ++var3;
            ++var16;
            0;
            if ((0xBB ^ 0xBE) != 0) continue;
            return null;
        }
        return String.valueOf(var10);
    }

    private static void llIlllllIIlllI() {
        lIlIlIlllIll = new int[13];
        ag.lIlIlIlllIll[0] = (0x6C ^ 0x20) & ~(0x2F ^ 0x63);
        ag.lIlIlIlllIll[1] = 1;
        ag.lIlIlIlllIll[2] = 7 + 4 - -87 + 69 ^ 43 + 44 - -38 + 20;
        ag.lIlIlIlllIll[3] = 0x26 ^ 0x42;
        ag.lIlIlIlllIll[4] = 0xA3 ^ 0xB5 ^ (0x71 ^ 0x62);
        ag.lIlIlIlllIll[5] = 0xA0 ^ 0xBE;
        ag.lIlIlIlllIll[6] = 0xA5 ^ 0xC0 ^ (0xAF ^ 0xC0);
        ag.lIlIlIlllIll[7] = 2;
        ag.lIlIlIlllIll[8] = 3;
        ag.lIlIlIlllIll[9] = 0x1D ^ 0x19;
        ag.lIlIlIlllIll[10] = -(0xFFFFFA83 & 0x657D) & (0xFFFFFDBF & 0x7BED);
        ag.lIlIlIlllIll[11] = 0xA0 ^ 0xA6;
        ag.lIlIlIlllIll[12] = 0x8F ^ 0xBF ^ (0x10 ^ 0x28);
    }

    private static String llIlllllIIlIlI(String var6, String var22) {
        try {
            SecretKeySpec var8 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var22.getBytes(StandardCharsets.UTF_8)), lIlIlIlllIll[12]), "DES");
            Cipher var1 = Cipher.getInstance("DES");
            var1.init(lIlIlIlllIll[7], var8);
            return new String(var1.doFinal(Base64.getDecoder().decode(var6.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var19) {
            var19.printStackTrace();
            return null;
        }
    }

    private static boolean llIlllllIlIIII(Object object, Object object2) {
        return object == object2;
    }
}

