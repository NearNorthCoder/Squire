/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.runelite.api.Skill
 *  net.unethicalite.api.Locations
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.gorillas.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.gorillas.SquireGorillaConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.Skill;
import net.unethicalite.api.Locations;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Inventory;
import gg.squire.gorillas.tasks.GorillasTaskBase;

@TaskDesc(name="Restoring stats", priority=101, blocking=true)
public class RestoringStatsTask
extends GorillasTaskBase {

        return String.valueOf(var1);
    }

    /*
     * WARNING - void declaration
     */
    private boolean M() {
        int var2;
        Item var3;
        void var4;
        int n2 = llIIlIIllIll[1];
        Skill[] skillArray = Skill.values();
        int n3 = skillArray.length;
        int var5 = llIIlIIllIll[1];
        while (m.lllllIlIIIIlll(var5, (int)var4)) {
            void var6 = var3[var5];
            if (m.lllllIlIIIIlll(Skills.getBoostedLevel((Skill)var6), Skills.getLevel((Skill)var6))) {
                var2 = llIIlIIllIll[2];
            }
            ++var5;

            if (-1 < 1) continue;
            return ((0xE7 ^ 0xBB ^ (0x68 ^ 0x56)) & (75 + 7 - 27 + 112 ^ 16 + 20 - -54 + 107 ^ -1)) != 0;
        }
        if (m.lllllIlIIIIIlI(var2)) {
            return llIIlIIllIll[1];
        }
        var3 = Inventory.getFirst(item -> item.getName().toLowerCase().contains(llIIlIIllIlI[llIIlIIllIll[6]]));
        if (m.lllllIlIIIIlIl(var3)) {
            return Combat.drinkBoostingPotion((int)llIIlIIllIll[4]);
        }
        skillArray.interact(llIIlIIllIlI[llIIlIIllIll[5]]);
        return llIIlIIllIll[2];
    }

    @Inject
    public RestoringStatsTask(SquireGorillaConfig squireGorillaConfig, Client client) {
        super(squireGorillaConfig, client);
    }

    public boolean run() {
        m var7;
        if (m.lllllIlIIIIIlI(Locations.isRegionLoaded((int)llIIlIIllIll[0]) ? 1 : 0)) {
            return llIIlIIllIll[1];
        }
        if (m.lllllIlIIIIIll(var7.L() ? 1 : 0)) {
            return llIIlIIllIll[2];
        }
        if (m.lllllIlIIIIIll(var7.M() ? 1 : 0)) {
            return llIIlIIllIll[2];
        }
        return this.K();
    }

    /*
     * WARNING - void declaration
     */
    private boolean L() {
        void var1_1;
        if (m.lllllIlIIIIllI(Combat.getMissingHealth())) {
            return llIIlIIllIll[1];
        }
        Item var8 = Inventory.getFirst(item -> {
            int n2;
            String[] stringArray = new String[llIIlIIllIll[2]];
            stringArray[m.llIIlIIllIll[1]] = llIIlIIllIlI[llIIlIIllIll[7]];
            if (!m.lllllIlIIIIIlI(item.hasAction(stringArray) ? 1 : 0) || m.lllllIlIIIIIll(item.getName().startsWith(llIIlIIllIlI[llIIlIIllIll[8]]) ? 1 : 0)) {
                n2 = llIIlIIllIll[2];

                if (-(0x11 ^ 0x14) >= 0) {
                    return false;
                }
            } else {
                n2 = llIIlIIllIll[1];
            }
            return n2 != 0;
        });
        if (m.lllllIlIIIIlIl(var8)) {
            return llIIlIIllIll[1];
        }
        String[] stringArray = new String[llIIlIIllIll[3]];
        stringArray[m.llIIlIIllIll[1]] = llIIlIIllIlI[llIIlIIllIll[2]];
        stringArray[m.llIIlIIllIll[2]] = llIIlIIllIlI[llIIlIIllIll[3]];
        var1_1.interact(stringArray);
        return llIIlIIllIll[2];
    }

    /*
     * WARNING - void declaration
     */
    private boolean K() {
        void var1_1;
        if (m.lllllIlIIIIlII(Skills.getBoostedLevel((Skill)Skill.PRAYER), Skills.getLevel((Skill)Skill.PRAYER))) {
            return llIIlIIllIll[1];
        }
        Item var9 = Inventory.getFirst(item -> {
            int n2;
            if (!m.lllllIlIIIIIlI(item.getName().startsWith(llIIlIIllIlI[llIIlIIllIll[9]]) ? 1 : 0) || m.lllllIlIIIIIll(item.getName().startsWith(llIIlIIllIlI[llIIlIIllIll[10]]) ? 1 : 0)) {
                n2 = llIIlIIllIll[2];

                if (2 > 2) {
                    return ((44 + 2 - -102 + 27 ^ 95 + 58 - 74 + 79) & (0xA1 ^ 0xA4 ^ (0x4E ^ 0x7A) ^ -1)) != 0;
                }
            } else {
                n2 = llIIlIIllIll[1];
            }
            return n2 != 0;
        });
        if (m.lllllIlIIIIlIl(var9)) {
            return llIIlIIllIll[1];
        }
        var1_1.interact(llIIlIIllIlI[llIIlIIllIll[1]]);
        return llIIlIIllIll[2];
    }

    private static boolean lllllIlIIIIlll(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lllllIlIIIIlIl(Object object) {
        return object == null;
    }

    private static boolean lllllIlIIIIllI(int n2) {
        return n2 <= 0;
    }

    private static boolean lllllIlIIIIIlI(int n2) {
        return n2 == 0;
    }

    static {
        m.lllllIlIIIIIIl();
        m.lllllIlIIIIIII();
    }

    private static boolean lllllIlIIIIlII(int n2, int n3) {
        return n2 >= n3;
    }

    private static void lllllIlIIIIIII() {
        llIIlIIllIlI = new String[llIIlIIllIll[11]];
        m.llIIlIIllIlI[m.llIIlIIllIll[1]] = "Drink";
        m.llIIlIIllIlI[m.llIIlIIllIll[2]] = "Eat";
        m.llIIlIIllIlI[m.llIIlIIllIll[3]] = "Drink";
        m.llIIlIIllIlI[m.llIIlIIllIll[5]] = "Drink";
        m.llIIlIIllIlI[m.llIIlIIllIll[6]] = "restore";
        m.llIIlIIllIlI[m.llIIlIIllIll[7]] = "Eat";
        m.llIIlIIllIlI[m.llIIlIIllIll[8]] = "Saradomin brew";
        m.llIIlIIllIlI[m.llIIlIIllIll[9]] = "Prayer";
        m.llIIlIIllIlI[m.llIIlIIllIll[10]] = "Super restore";
    }

    private static boolean lllllIlIIIIIll(int n2) {
        return n2 != 0;
    }
}

