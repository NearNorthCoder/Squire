/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.Locatable
 *  net.runelite.api.Player
 *  net.runelite.api.Skill
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.items.Inventory
 */
package c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o;

import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.NEnum;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.k_Unknown;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.n_Unknown;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.u_Unknown;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.cox.SquireChambersPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.Player;
import net.runelite.api.Skill;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Inventory;

/* TASK: Eating food -> EatingfoodTask */
@TaskDesc(name="Eating food", priority=30000)
public class EatingFoodTask
extends Task {
    private final /* synthetic */ SquireChambersPlugin cH;
    private static /* synthetic */ String[] lIlIIIIIIlIl;
    private static /* synthetic */ int[] lIlIIIIIIllI;
    /* synthetic */ boolean cE;
    /* synthetic */ int cD;
    private final /* synthetic */ k cG;

    private static String llIlIIllllIllI(String var24, String var27) {
        try {
            SecretKeySpec var3 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var27.getBytes(StandardCharsets.UTF_8)), lIlIIIIIIllI[10]), "DES");
            Cipher var15 = Cipher.getInstance("DES");
            var15.init(lIlIIIIIIllI[7], var3);
            return new String(var15.doFinal(Base64.getDecoder().decode(var24.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var7) {
            var7.printStackTrace();
            return null;
        }
    }

    private boolean ct() {
        if (ae.llIlIIllllllll(u.be() ? 1 : 0)) {
            return lIlIIIIIIllI[0];
        }
        Player var8 = Players.getLocal();
        if (!ae.llIlIIlllllllI(u.bg(), lIlIIIIIIllI[4]) || ae.llIlIIlllllIlI(var8.getPlane())) {
            return lIlIIIIIIllI[0];
        }
        TileObject var1 = TileObjects.getNearest(tileObject -> {
            int n2;
            if (ae.llIlIIlllllIlI(tileObject.getName().contains(lIlIIIIIIlIl[lIlIIIIIIllI[1]]) ? 1 : 0)) {
                String[] stringArray = new String[lIlIIIIIIllI[2]];
                stringArray[ae.lIlIIIIIIllI[0]] = lIlIIIIIIlIl[lIlIIIIIIllI[4]];
                if (ae.llIlIIlllllIlI(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lIlIIIIIIllI[2];
                    0;
                    if ((2 & ~2) != -1) return n2 != 0;
                    return false;
                }
            }
            n2 = lIlIIIIIIllI[0];
            return n2 != 0;
        });
        if (ae.llIlIlIIIIIIII(var1)) {
            return lIlIIIIIIllI[0];
        }
        if (ae.llIlIlIIIIIIIl(var8.getWorldY(), var1.getWorldY())) {
            return lIlIIIIIIllI[0];
        }
        return lIlIIIIIIllI[2];
    }

    private static boolean llIlIIllllllIl(int n2, int n3) {
        return n2 < n3;
    }

    private static void llIlIIllllIlll() {
        lIlIIIIIIlIl = new String[lIlIIIIIIllI[14]];
        ae.lIlIIIIIIlIl[ae.lIlIIIIIIllI[0]] = ae."Drink";
        ae.lIlIIIIIIlIl[ae.lIlIIIIIIllI[2]] = ae."Drink";
        ae.lIlIIIIIIlIl[ae.lIlIIIIIIllI[7]] = ae."Vasa";
        ae.lIlIIIIIIlIl[ae.lIlIIIIIIllI[1]] = ae."Mystical barrier";
        ae.lIlIIIIIIlIl[ae.lIlIIIIIIllI[4]] = ae."Quick-pass";
        ae.lIlIIIIIIlIl[ae.lIlIIIIIIllI[3]] = ae."Super restore";
        ae.lIlIIIIIIlIl[ae.lIlIIIIIIllI[8]] = ae."Revitalisation";
        ae.lIlIIIIIIlIl[ae.lIlIIIIIIllI[9]] = ae."Drink";
        ae.lIlIIIIIIlIl[ae.lIlIIIIIIllI[10]] = ae."Saradomin brew";
        ae.lIlIIIIIIlIl[ae.lIlIIIIIIllI[11]] = ae."Drink";
        ae.lIlIIIIIIlIl[ae.lIlIIIIIIllI[12]] = ae."Xeric's aid";
        ae.lIlIIIIIIlIl[ae.lIlIIIIIIllI[13]] = ae."Drink";
    }

    private static String llIlIIllllIlIl(String var5, String var25) {
        try {
            SecretKeySpec var17 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var25.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var9 = Cipher.getInstance("Blowfish");
            var9.init(lIlIIIIIIllI[7], var17);
            return new String(var9.doFinal(Base64.getDecoder().decode(var5.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var6) {
            var6.printStackTrace();
            return null;
        }
    }

    protected boolean cx() {
        boolean bl2;
        if (ae.llIlIIlllllllI(Skills.getBoostedLevel((Skill)Skill.ATTACK) + lIlIIIIIIllI[3], Skills.getLevel((Skill)Skill.ATTACK))) {
            bl2 = lIlIIIIIIllI[2];
            0;
            if ((0x67 ^ 0x63) < -1) {
                return (1 & ~1) != 0;
            }
        } else {
            bl2 = lIlIIIIIIllI[0];
        }
        return bl2;
    }

    private static boolean llIlIlIIIIIIII(Object object) {
        return object == null;
    }

    private static boolean llIlIlIIIIIIll(Object object, Object object2) {
        return object == object2;
    }

    private static void llIlIIlllllIII() {
        lIlIIIIIIllI = new int[15];
        ae.lIlIIIIIIllI[0] = (55 + 24 - 29 + 140 ^ 128 + 84 - 182 + 124) & (2 + 35 - -49 + 90 ^ 133 + 38 - 95 + 72 ^ -1);
        ae.lIlIIIIIIllI[1] = 3;
        ae.lIlIIIIIIllI[2] = 1;
        ae.lIlIIIIIIllI[3] = 121 + 8 - 103 + 102 ^ 2 + 89 - -24 + 18;
        ae.lIlIIIIIIllI[4] = 0x10 ^ 0x14;
        ae.lIlIIIIIIllI[5] = 77 + 95 - 76 + 145 ^ 113 + 181 - 174 + 75;
        ae.lIlIIIIIIllI[6] = 0x57 ^ 0x43;
        ae.lIlIIIIIIllI[7] = 2;
        ae.lIlIIIIIIllI[8] = 0x9F ^ 0x99;
        ae.lIlIIIIIIllI[9] = 0xE6 ^ 0xB8 ^ (0xFB ^ 0xA2);
        ae.lIlIIIIIIllI[10] = 133 + 134 - 137 + 8 ^ 24 + 52 - -30 + 24;
        ae.lIlIIIIIIllI[11] = 0x2C ^ 0x25;
        ae.lIlIIIIIIllI[12] = 0x68 ^ 0x62;
        ae.lIlIIIIIIllI[13] = 16 + 86 - 101 + 145 ^ 140 + 151 - 146 + 8;
        ae.lIlIIIIIIllI[14] = 0x5A ^ 0x56;
    }

    private static boolean llIlIIlllllIlI(int n2) {
        return n2 != 0;
    }

    private static boolean llIlIIllllllll(int n2) {
        return n2 == 0;
    }

    private static boolean llIlIlIIIIIIlI(Object object) {
        return object != null;
    }

    private static boolean llIlIIllllllII(int n2) {
        return n2 < 0;
    }

    private static boolean llIlIIlllllIll(int n2, int n3) {
        return n2 > n3;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var11;
        ae var21;
        int n2 = this.cA();
        if (ae.llIlIIlllllIlI(this.ct() ? 1 : 0) && ae.llIlIIlllllIlI(this.cx() ? 1 : 0) && ae.llIlIIlllllIll(Combat.getCurrentHealth(), n2) && ae.llIlIIllllllII(ae.llIlIIlllllIIl(Combat.getHealthPercent(), 95.0)) && ae.llIlIIllllllIl(this.cG.aJ(), lIlIIIIIIllI[1]) && ae.llIlIIlllllIll(this.cG.aK(), lIlIIIIIIllI[2])) {
            this.cy();
            0;
            return lIlIIIIIIllI[2];
        }
        if (ae.llIlIIlllllIlI(var21.cx() ? 1 : 0) && ae.llIlIIlllllllI(var21.cD, lIlIIIIIIllI[1])) {
            var21.cE = lIlIIIIIIllI[0];
        }
        if (ae.llIlIIllllllIl(Combat.getCurrentHealth(), (int)var11)) {
            if (ae.llIlIIllllllll(var21.cE ? 1 : 0)) {
                var21.cD = lIlIIIIIIllI[0];
            }
            var21.cE = lIlIIIIIIllI[2];
        }
        if (ae.llIlIIllllllll(var21.cE ? 1 : 0)) {
            return lIlIIIIIIllI[0];
        }
        if (ae.llIlIIllllllIl(var21.cD, lIlIIIIIIllI[1])) {
            var21.cy();
            0;
            var21.cD += lIlIIIIIIllI[2];
            return lIlIIIIIIllI[2];
        }
        this.cz();
        0;
        return lIlIIIIIIllI[2];
    }

    private static boolean llIlIIlllllllI(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean llIlIlIIIIIIIl(int n2, int n3) {
        return n2 <= n3;
    }

    static {
        ae.llIlIIlllllIII();
        ae.llIlIIllllIlll();
    }

    protected boolean cy() {
        Item var4;
        Item item2 = Inventory.getFirst(item -> {
            int n2;
            if (ae.llIlIIlllllIlI(item.getName().startsWith(lIlIIIIIIlIl[lIlIIIIIIllI[12]]) ? 1 : 0)) {
                String[] stringArray = new String[lIlIIIIIIllI[2]];
                stringArray[ae.lIlIIIIIIllI[0]] = lIlIIIIIIlIl[lIlIIIIIIllI[13]];
                if (ae.llIlIIlllllIlI(item.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lIlIIIIIIllI[2];
                    0;
                    if (((0x85 ^ 0xAD) & ~(0x26 ^ 0xE)) > -1) return n2 != 0;
                    return false;
                }
            }
            n2 = lIlIIIIIIllI[0];
            return n2 != 0;
        });
        if (ae.llIlIlIIIIIIII(item2)) {
            var4 = Inventory.getFirst(item -> {
                int n2;
                if (ae.llIlIIlllllIlI(item.getName().startsWith(lIlIIIIIIlIl[lIlIIIIIIllI[10]]) ? 1 : 0)) {
                    String[] stringArray = new String[lIlIIIIIIllI[2]];
                    stringArray[ae.lIlIIIIIIllI[0]] = lIlIIIIIIlIl[lIlIIIIIIllI[11]];
                    if (ae.llIlIIlllllIlI(item.hasAction(stringArray) ? 1 : 0)) {
                        n2 = lIlIIIIIIllI[2];
                        0;
                        if (1 < 3) return n2 != 0;
                        return ((0x2B ^ 0x7D ^ (0x76 ^ 0x6B)) & (0x4C ^ 7 ^ (0xFD ^ 0xB4) & ~(0xFD ^ 0xB4) ^ -1)) != 0;
                    }
                }
                n2 = lIlIIIIIIllI[0];
                return n2 != 0;
            });
        }
        if (ae.llIlIlIIIIIIII(var4)) {
            return lIlIIIIIIllI[0];
        }
        item2.interact(lIlIIIIIIlIl[lIlIIIIIIllI[0]]);
        this.sleep(lIlIIIIIIllI[1]);
        return lIlIIIIIIllI[2];
    }

    protected boolean cz() {
        Item item2 = Inventory.getFirst(item -> {
            int n2;
            if (!ae.llIlIIllllllll(item.getName().startsWith(lIlIIIIIIlIl[lIlIIIIIIllI[3]]) ? 1 : 0) || ae.llIlIIlllllIlI(item.getName().startsWith(lIlIIIIIIlIl[lIlIIIIIIllI[8]]) ? 1 : 0)) {
                Item var13;
                String[] stringArray = new String[lIlIIIIIIllI[2]];
                stringArray[ae.lIlIIIIIIllI[0]] = lIlIIIIIIlIl[lIlIIIIIIllI[9]];
                if (ae.llIlIIlllllIlI(var13.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lIlIIIIIIllI[2];
                    0;
                    if (-2 <= 0) return n2 != 0;
                    return ((0x65 ^ 0x71 ^ (0x17 ^ 0x32)) & (0x50 ^ 0x6F ^ (0x40 ^ 0x4E) ^ -1)) != 0;
                }
            }
            n2 = lIlIIIIIIllI[0];
            return n2 != 0;
        });
        if (ae.llIlIlIIIIIIII(item2)) {
            return lIlIIIIIIllI[0];
        }
        item2.interact(lIlIIIIIIlIl[lIlIIIIIIllI[2]]);
        this.sleep(lIlIIIIIIllI[1]);
        return lIlIIIIIIllI[2];
    }

    /*
     * WARNING - void declaration
     */
    private int cA() {
        void var10;
        n n2 = this.cH.L();
        if (!ae.llIlIlIIIIIIlI(n2) || ae.llIlIIllllllll(n2.a((Locatable)Players.getLocal()) ? 1 : 0)) {
            return lIlIIIIIIllI[5];
        }
        N var12 = var10.aM();
        if (ae.llIlIlIIIIIIll((Object)var12, (Object)N.VASA) && ae.llIlIlIIIIIIlI(NPCs.getNearest(nPC -> nPC.getName().contains(lIlIIIIIIlIl[lIlIIIIIIllI[7]])))) {
            return lIlIIIIIIllI[6];
        }
        if (ae.llIlIlIIIIIIll((Object)var12, (Object)N.VESPULA)) {
            return lIlIIIIIIllI[0];
        }
        return lIlIIIIIIllI[5];
    }

    private static int llIlIIlllllIIl(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    @Inject
    public ae(SquireChambersPlugin squireChambersPlugin) {
        this.cD = lIlIIIIIIllI[0];
        this.cE = lIlIIIIIIllI[0];
        this.cG = squireChambersPlugin.A();
        this.cH = squireChambersPlugin;
    }

    private static String llIlIIllllIlII(String var19, String var18) {
        var19 = new String(Base64.getDecoder().decode(var19.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var2 = new StringBuilder();
        char[] var16 = var18.toCharArray();
        int var20 = lIlIIIIIIllI[0];
        char[] var14 = var19.toCharArray();
        int var23 = var14.length;
        int var26 = lIlIIIIIIllI[0];
        while (ae.llIlIIllllllIl(var26, var23)) {
            char var22 = var14[var26];
            var2.append((char)(var22 ^ var16[var20 % var16.length]));
            0;
            ++var20;
            ++var26;
            0;
            
            return null;
        }
        return String.valueOf(var2);
    }
}

