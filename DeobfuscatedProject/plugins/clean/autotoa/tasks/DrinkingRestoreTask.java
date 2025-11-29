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
import gg.squire.autotoa.tasks.AutotoaManager;
import gg.squire.autotoa.tasks.AutotoaTaskBase;
import gg.squire.autotoa.tasks.GameEnum95;

@TaskDesc(name="Drinking restore", priority=85)
public class DrinkingRestoreTask
extends AutotoaTaskBase {

    private final  C cL;

        return String.valueOf(var1);
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
    protected DrinkingRestoreTask(Client client, C c2) {
        super(client);
        this.cL = c2;
    }

    private static void lIIllllIlllIll() {
        llIIIllIIlI = new String[llIIIllIIll[6]];
        ah.llIIIllIIlI[ah.llIIIllIIll[1]] = "Drink";
        ah.llIIIllIIlI[ah.llIIIllIIll[2]] = "restore";
        ah.llIIIllIIlI[ah.llIIIllIIll[3]] = "Sanfew";
        ah.llIIIllIIlI[ah.llIIIllIIll[0]] = "Attack";
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        int n2;
        ah var2;
        void var3;
        int n3;
        Skill[] skillArray = new Skill[llIIIllIIll[0]];
        skillArray[ah.llIIIllIIll[1]] = Skill.STRENGTH;
        skillArray[ah.llIIIllIIll[2]] = Skill.MAGIC;
        skillArray[ah.llIIIllIIll[3]] = Skill.RANGED;
        Skill[] skillArray2 = skillArray;
        if (ah.lIIllllIllllIl(Skills.getBoostedLevel((Skill)Skill.PRAYER), llIIIllIIll[4])) {
            n3 = llIIIllIIll[2];

            if (-1 < -1) {
                return false;
            }
        } else {
            n3 = llIIIllIIll[1];
        }
        int var4 = n3;
        void var5 = var3;
        int llllllllllllllllIlIIIIllIllIIIIl22 = ((void)var5).length;
        int var6 = llIIIllIIll[1];
        while (ah.lIIllllIlllllI(var6, llllllllllllllllIlIIIIllIllIIIIl22)) {
            void var7 = var5[var6];
            if (ah.lIIllllIlllllI(var2.cu.getBoostedSkillLevel((Skill)var7), var2.cu.getRealSkillLevel((Skill)var7))) {
                var4 = llIIIllIIll[2];

                if (((0x5D ^ 0x7B) & ~(0x4A ^ 0x6C)) >= 0) break;
                return false;
            }
            ++var6;

            if (1 == 1) continue;
            return ((0x4F ^ 0x67 ^ (0x14 ^ 0x36)) & (0x8B ^ 0x8C ^ (0x8A ^ 0x87) ^ -1)) != 0;
        }
        if (ah.lIIllllIllllll(var4)) {
            return llIIIllIIll[1];
        }
        if (!ah.lIIlllllIIIIII(var2.aX()) || ah.lIIlllllIIIIIl(NPCs.getNearest(nPC -> {
            String[] stringArray = new String[llIIIllIIll[2]];
            stringArray[ah.llIIIllIIll[1]] = llIIIllIIlI[llIIIllIIll[0]];
            return nPC.hasAction(stringArray);
        }))) {
            n2 = llIIIllIIll[2];

        } else {
            n2 = llIIIllIIll[1];
        }
        if (ah.lIIllllIllllll(var5 = n2)) {
            return llIIIllIIll[1];
        }
        if (ah.lIIlllllIIIIlI(var2.aX()) && ah.lIIlllllIIIIII(var2.aY())) {
            return llIIIllIIll[1];
        }
        if (ah.lIIlllllIIIIlI(Vars.getBit((int)llIIIllIIll[5]))) {
            return llIIIllIIll[1];
        }
        Item llllllllllllllllIlIIIIllIllIIIIl22 = Inventory.getFirst(item -> {
            int n2;
            if (!ah.lIIllllIllllll(e.TEARS_OF_ELIDINIS.d(item.getId()) ? 1 : 0) || !ah.lIIllllIllllll(item.getName().contains(llIIIllIIlI[llIIIllIIll[2]]) ? 1 : 0) || ah.lIIlllllIIIIll(item.getName().contains(llIIIllIIlI[llIIIllIIll[3]]) ? 1 : 0)) {
                n2 = llIIIllIIll[2];

                if (((0x8C ^ 0xAA) & ~(0x37 ^ 0x11)) < 0) {
                    return false;
                }
            } else {
                n2 = llIIIllIIll[1];
            }
            return n2 != 0;
        });
        if (ah.lIIlllllIIIIIl(llllllllllllllllIlIIIIllIllIIIIl22) && ah.lIIlllllIIIIll(var2.cL.am() ? 1 : 0)) {
            llllllllllllllllIlIIIIllIllIIIIl22.interact(llIIIllIIlI[llIIIllIIll[1]]);
            var2.cL.ao();
            return llIIIllIIll[2];
        }
        return llIIIllIIll[1];
    }
}

