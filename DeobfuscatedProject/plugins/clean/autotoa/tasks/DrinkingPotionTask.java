/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.EquipmentInventorySlot
 *  net.runelite.api.Item
 *  net.runelite.api.Skill
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.autotoa.tasks;

import com.google.inject.Inject;
import gg.squire.autotoa.SquireAutoTOA;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.EquipmentInventorySlot;
import net.runelite.api.Item;
import net.runelite.api.Skill;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import gg.squire.autotoa.tasks.AutotoaManager;
import gg.squire.autotoa.tasks.AutotoaTaskBase;
import gg.squire.autotoa.tasks.GameEnum90;

@TaskDesc(name="Drinking potion", priority=200)
public class DrinkingPotionTask
extends AutotoaTaskBase {
    private final  C cI;

    private final  SquireAutoTOA cJ;

    private static boolean lIlIIlIIIlllll(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIlIIlIIIlllII(int n2) {
        return n2 == 0;
    }

    private static boolean lIlIIlIIIlllIl(int n2) {
        return n2 > 0;
    }

    private static boolean lIlIIlIIlIIIII(Object object) {
        return object != null;
    }

    private static void lIlIIlIIIllIIl() {
        llIlIIIIIll = new String[llIlIIIIlII[2]];
        af.llIlIIIIIll[af.llIlIIIIlII[0]] = "Drink";
    }

    static {
        af.lIlIIlIIIllIlI();
        af.lIlIIlIIIllIIl();
    }

    public boolean run() {
        af var1;
        if (af.lIlIIlIIIllIll(this.cJ.e() ? 1 : 0)) {
            return llIlIIIIlII[0];
        }
        if (af.lIlIIlIIIlllII(var1.bc() ? 1 : 0)) {
            return llIlIIIIlII[0];
        }
        if (af.lIlIIlIIIlllIl(Vars.getBit((int)llIlIIIIlII[1]))) {
            return llIlIIIIlII[0];
        }
        if (af.lIlIIlIIIlllII(var1.cI.am() ? 1 : 0)) {
            return llIlIIIIlII[0];
        }
        Item var2 = Equipment.fromSlot((EquipmentInventorySlot)EquipmentInventorySlot.WEAPON);
        a[] var3 = a.a(var2);
        int var4 = var3.length;
        int var5 = llIlIIIIlII[0];
        while (af.lIlIIlIIIllllI(var5, var4)) {
            a var6 = var3[var5];
            Skill[] var7 = var6.m();
            int var8 = var7.length;
            int var9 = llIlIIIIlII[0];
            while (af.lIlIIlIIIllllI(var9, var8)) {
                Item var10;
                Skill var11 = var7[var9];
                int var12 = (int)(0.5 * (double)var6.a(var11));
                if (af.lIlIIlIIIlllll(Skills.getLevel((Skill)var11) + var12, Skills.getBoostedLevel((Skill)var11)) && af.lIlIIlIIlIIIII(var10 = Inventory.getFirst(item -> item.getName().startsWith(var6.l())))) {
                    var10.interact(llIlIIIIIll[llIlIIIIlII[0]]);
                    var1.cI.ao();
                    return llIlIIIIlII[2];
                }
                ++var9;

                if ((86 + 52 - 39 + 70 ^ 22 + 94 - -37 + 20) > 0) continue;
                return ((124 + 113 - 98 + 22 ^ 50 + 107 - 78 + 69) & (0xA7 ^ 0x85 ^ (0x21 ^ 0x36) ^ -1)) != 0;
            }
            ++var5;

            if (((0xA1 ^ 0x8B) & ~(0x28 ^ 2)) >= 0) continue;
            return false;
        }
        return llIlIIIIlII[0];
    }

    @Inject
    protected DrinkingPotionTask(Client client, C c2, SquireAutoTOA squireAutoTOA) {
        super(client);
        this.cI = c2;
        this.cJ = squireAutoTOA;
    }

    private static boolean lIlIIlIIIllllI(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIlIIlIIIllIll(int n2) {
        return n2 != 0;
    }
}

