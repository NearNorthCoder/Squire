/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.runelite.api.Skill
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.items.Inventory
 */
package q.-.t.a.o.u.i.-.o.u.t.e.s.a.r;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.Skill;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Inventory;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.C;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.Z;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.e;

/* TASK: Drinking restore -> DrinkingrestoreTask */
@TaskDesc(name="Drinking restore", priority=85)
public class ah
extends Z {
    private static /* synthetic */ int[] llIIIllIIll;
    private static /* synthetic */ String[] llIIIllIIlI;
    private final /* synthetic */ C cL;

    private static void lIIllllIllllII() {
        llIIIllIIll = new int[7];
        ah.llIIIllIIll[0] = 3;
        ah.llIIIllIIll[1] = (0x98 ^ 0xB3 ^ (0x54 ^ 0x6A)) & (109 + 103 - 137 + 135 ^ 12 + 43 - 1 + 145 ^ -1);
        ah.llIIIllIIll[2] = 1;
        ah.llIIIllIIll[3] = 2;
        ah.llIIIllIIll[4] = 0x47 ^ 8 ^ (0x75 ^ 0x2E);
        ah.llIIIllIIll[5] = -(0xFFFFD5FD & 0x2EC7) & (0xFFFFBFEF & 0x7CDC);
        ah.llIIIllIIll[6] = 0xB8 ^ 0xBC;
    }

    private static String lIIllllIlllIIl(String var1, String var16) {
        var1 = new String(Base64.getDecoder().decode(var1.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var9 = new StringBuilder();
        char[] var14 = var16.toCharArray();
        int var7 = llIIIllIIll[1];
        char[] var5 = var1.toCharArray();
        int var12 = var5.length;
        int var17 = llIIIllIIll[1];
        while (ah.lIIllllIlllllI(var17, var12)) {
            char var10 = var5[var17];
            var9.append((char)(var10 ^ var14[var7 % var14.length]));
            0;
            ++var7;
            ++var17;
            0;
            if ((0xC3 ^ 0xC7) != 2) continue;
            return null;
        }
        return String.valueOf(var9);
    }

    private static boolean lIIlllllIIIIIl(Object object) {
        return object != null;
    }

    private static boolean lIIlllllIIIIlI(int n2) {
        return n2 > 0;
    }

    private static boolean lIIllllIllllll(int n2) {
        return n2 == 0;
    }

    static {
        ah.lIIllllIllllII();
        ah.lIIllllIlllIll();
    }

    private static boolean lIIllllIlllllI(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIIllllIllllIl(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean lIIlllllIIIIII(int n2) {
        return n2 <= 0;
    }

    private static boolean lIIlllllIIIIll(int n2) {
        return n2 != 0;
    }

    @Inject
    protected ah(Client client, C c2) {
        super(client);
        this.cL = c2;
    }

    private static void lIIllllIlllIll() {
        llIIIllIIlI = new String[llIIIllIIll[6]];
        ah.llIIIllIIlI[ah.llIIIllIIll[1]] = ah."Drink";
        ah.llIIIllIIlI[ah.llIIIllIIll[2]] = ah."restore";
        ah.llIIIllIIlI[ah.llIIIllIIll[3]] = ah."Sanfew";
        ah.llIIIllIIlI[ah.llIIIllIIll[0]] = ah."Attack";
    }

    private static String lIIllllIlllIlI(String var20, String var13) {
        try {
            SecretKeySpec var4 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var13.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var2 = Cipher.getInstance("Blowfish");
            var2.init(llIIIllIIll[3], var4);
            return new String(var2.doFinal(Base64.getDecoder().decode(var20.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var18) {
            var18.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        int n2;
        ah var6;
        void var15;
        int n3;
        Skill[] skillArray = new Skill[llIIIllIIll[0]];
        skillArray[ah.llIIIllIIll[1]] = Skill.STRENGTH;
        skillArray[ah.llIIIllIIll[2]] = Skill.MAGIC;
        skillArray[ah.llIIIllIIll[3]] = Skill.RANGED;
        Skill[] skillArray2 = skillArray;
        if (ah.lIIllllIllllIl(Skills.getBoostedLevel((Skill)Skill.PRAYER), llIIIllIIll[4])) {
            n3 = llIIIllIIll[2];
            0;
            if (-1 < -1) {
                return false;
            }
        } else {
            n3 = llIIIllIIll[1];
        }
        int var19 = n3;
        void var3 = var15;
        int llllllllllllllllIlIIIIllIllIIIIl22 = ((void)var3).length;
        int var11 = llIIIllIIll[1];
        while (ah.lIIllllIlllllI(var11, llllllllllllllllIlIIIIllIllIIIIl22)) {
            void var8 = var3[var11];
            if (ah.lIIllllIlllllI(var6.cu.getBoostedSkillLevel((Skill)var8), var6.cu.getRealSkillLevel((Skill)var8))) {
                var19 = llIIIllIIll[2];
                0;
                if (((0x5D ^ 0x7B) & ~(0x4A ^ 0x6C)) >= 0) break;
                return false;
            }
            ++var11;
            0;
            if (1 == 1) continue;
            return ((0x4F ^ 0x67 ^ (0x14 ^ 0x36)) & (0x8B ^ 0x8C ^ (0x8A ^ 0x87) ^ -1)) != 0;
        }
        if (ah.lIIllllIllllll(var19)) {
            return llIIIllIIll[1];
        }
        if (!ah.lIIlllllIIIIII(var6.aX()) || ah.lIIlllllIIIIIl(NPCs.getNearest(nPC -> {
            String[] stringArray = new String[llIIIllIIll[2]];
            stringArray[ah.llIIIllIIll[1]] = llIIIllIIlI[llIIIllIIll[0]];
            return nPC.hasAction(stringArray);
        }))) {
            n2 = llIIIllIIll[2];
            0;
            if (-2 > 0) {
                return ((0xE4 ^ 0xAA ^ (0x5F ^ 0x3A)) & (21 + 128 - 106 + 89 ^ 3 + 8 - -37 + 127 ^ -1)) != 0;
            }
        } else {
            n2 = llIIIllIIll[1];
        }
        if (ah.lIIllllIllllll(var3 = n2)) {
            return llIIIllIIll[1];
        }
        if (ah.lIIlllllIIIIlI(var6.aX()) && ah.lIIlllllIIIIII(var6.aY())) {
            return llIIIllIIll[1];
        }
        if (ah.lIIlllllIIIIlI(Vars.getBit((int)llIIIllIIll[5]))) {
            return llIIIllIIll[1];
        }
        Item llllllllllllllllIlIIIIllIllIIIIl22 = Inventory.getFirst(item -> {
            int n2;
            if (!ah.lIIllllIllllll(e.TEARS_OF_ELIDINIS.d(item.getId()) ? 1 : 0) || !ah.lIIllllIllllll(item.getName().contains(llIIIllIIlI[llIIIllIIll[2]]) ? 1 : 0) || ah.lIIlllllIIIIll(item.getName().contains(llIIIllIIlI[llIIIllIIll[3]]) ? 1 : 0)) {
                n2 = llIIIllIIll[2];
                0;
                if (((0x8C ^ 0xAA) & ~(0x37 ^ 0x11)) < 0) {
                    return false;
                }
            } else {
                n2 = llIIIllIIll[1];
            }
            return n2 != 0;
        });
        if (ah.lIIlllllIIIIIl(llllllllllllllllIlIIIIllIllIIIIl22) && ah.lIIlllllIIIIll(var6.cL.am() ? 1 : 0)) {
            llllllllllllllllIlIIIIllIllIIIIl22.interact(llIIIllIIlI[llIIIllIIll[1]]);
            var6.cL.ao();
            return llIIIllIIll[2];
        }
        return llIIIllIIll[1];
    }
}

