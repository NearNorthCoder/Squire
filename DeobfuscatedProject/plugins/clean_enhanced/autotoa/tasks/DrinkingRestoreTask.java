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
package gg.squire.autotoa.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.Skill;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Inventory;
import gg.squire.autotoa.tasks.AutotoaManager;
import gg.squire.autotoa.tasks.AutotoaManager;
import gg.squire.autotoa.tasks.GameEnum12;

@TaskDesc(name="Drinking restore", priority=85)
public class DrinkingRestoreTask
extends AutotoaManager {

    private final  C cL;

    private static void var3() {
        var1 = new int[7];
        ah.var1[0] = 3;
        ah.var1[1] = (0x98 ^ 0xB3 ^ (0x54 ^ 0x6A)) & (109 + 103 - 137 + 135 ^ 12 + 43 - 1 + 145 ^ -1);
        ah.var1[2] = 1;
        ah.var1[3] = 2;
        ah.var1[4] = 0x47 ^ 8 ^ (0x75 ^ 0x2E);
        ah.var1[5] = -(0xFFFFD5FD & 0x2EC7) & (0xFFFFBFEF & 0x7CDC);
        ah.var1[6] = 0xB8 ^ 0xBC;
    }

    private static String var4(String var5, String var6) {
        var5 = new String(Base64.getDecoder().decode(var5.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var7 = new StringBuilder();
        char[] var8 = var6.toCharArray();
        int var9 = var1[1];
        char[] var10 = var5.toCharArray();
        int var11 = var10.length;
        int var12 = var1[1];
        while (ah.var13(var12, var11)) {
            char var14 = var10[var12];
            var7.append((char)(var14 ^ var8[var9 % var8.length]));
            0;
            ++var9;
            ++var12;
            0;
            if ((0xC3 ^ 0xC7) != 2) continue;
            return null;
        }
        return String.valueOf(var7);
    }

    private static boolean var15(Object object) {
        return object != null;
    }

    private static boolean var16(int n2) {
        return n2 > 0;
    }

    private static boolean var17(int n2) {
        return n2 == 0;
    }

    static {
        ah.var3();
        ah.var18();
    }

    private static boolean var13(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean var19(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean var20(int n2) {
        return n2 <= 0;
    }

    private static boolean var21(int n2) {
        return n2 != 0;
    }

    @Inject
    protected DrinkingRestoreTask(Client client, C c2) {
        super(client);
        this.cL = c2;
    }

    private static void var18() {
        var2 = new String[var1[6]];
        ah.var2[ah.var1[1]] = "Drink";
        ah.var2[ah.var1[2]] = "restore";
        ah.var2[ah.var1[3]] = "Sanfew";
        ah.var2[ah.var1[0]] = "Attack";
    }

        catch (Exception var27) {
            var27.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        int n2;
        ah var28;
        void var29;
        int n3;
        Skill[] skillArray = new Skill[var1[0]];
        skillArray[ah.var1[1]] = Skill.STRENGTH;
        skillArray[ah.var1[2]] = Skill.MAGIC;
        skillArray[ah.var1[3]] = Skill.RANGED;
        Skill[] skillArray2 = skillArray;
        if (ah.var19(Skills.getBoostedLevel((SkiSkill.PRAYER), var1[4])) {
            n3 = var1[2];
            0;
            if (-1 < -1) {
                return ((0x1D ^ 0x7C) & ~(0xDF ^ 0xBE)) != 0;
            }
        } else {
            n3 = var1[1];
        }
        int var30 = n3;
        void var31 = var29;
        int llllllllllllllllIlIIIIllIllIIIIl22 = ((void)var31).length;
        int var32 = var1[1];
        while (ah.var13(var32, llllllllllllllllIlIIIIllIllIIIIl22)) {
            void var33 = var31[var32];
            if (ah.var13(var28.cu.getBoostedSkillLevel((Skivar33), var28.cu.getRealSkillLevel((Skivar33))) {
                var30 = var1[2];
                0;
                if (((0x5D ^ 0x7B) & ~(0x4A ^ 0x6C)) >= 0) break;
                return ((0x25 ^ 0xA) & ~(0x1E ^ 0x31)) != 0;
            }
            ++var32;
            0;
            if (1 == 1) continue;
            return ((0x4F ^ 0x67 ^ (0x14 ^ 0x36)) & (0x8B ^ 0x8C ^ (0x8A ^ 0x87) ^ -1)) != 0;
        }
        if (ah.var17(var30)) {
            return var1[1];
        }
        if (!ah.var20(var28.aX()) || ah.var15(NPCs.getNearest(nPC -> {
            String[] stringArray = new String[var1[2]];
            stringArray[ah.var1[1]] = var2[var1[0]];
            return nPC.hasAction(stringArray);
        }))) {
            n2 = var1[2];
            0;
            if (-2 > 0) {
                return ((0xE4 ^ 0xAA ^ (0x5F ^ 0x3A)) & (21 + 128 - 106 + 89 ^ 3 + 8 - -37 + 127 ^ -1)) != 0;
            }
        } else {
            n2 = var1[1];
        }
        if (ah.var17(var31 = n2)) {
            return var1[1];
        }
        if (ah.var16(var28.aX()) && ah.var20(var28.aY())) {
            return var1[1];
        }
        if (ah.var16(Vars.getBit((int)var1[5]))) {
            return var1[1];
        }
        Item llllllllllllllllIlIIIIllIllIIIIl22 = Inventory.getFirst(item -> {
            int n2;
            if (!ah.var17(e.TEARS_OF_ELIDINIS.d(item.getId()) ? 1 : 0) || !ah.var17(item.getName().contains(var2[var1[2]]) ? 1 : 0) || ah.var21(item.getName().contains(var2[var1[3]]) ? 1 : 0)) {
                n2 = var1[2];
                0;
                if (((0x8C ^ 0xAA) & ~(0x37 ^ 0x11)) < 0) {
                    return ((0x9F ^ 0x96) & ~(0x77 ^ 0x7E)) != 0;
                }
            } else {
                n2 = var1[1];
            }
            return n2 != 0;
        });
        if (ah.var15(llllllllllllllllIlIIIIllIllIIIIl22) && ah.var21(var28.cL.am() ? 1 : 0)) {
            llllllllllllllllIlIIIIllIllIIIIl22.interact(var2[var1[1]]);
            var28.cL.ao();
            return var1[2];
        }
        return var1[1];
    }
}

