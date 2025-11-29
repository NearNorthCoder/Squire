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
package q.-.t.a.o.u.i.-.o.u.t.e.s.a.r;

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
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.C_Unknown;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.Z_Unknown;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.PotionType;

/* TASK: Drinking potion -> DrinkingpotionTask */
@TaskDesc(name="Drinking potion", priority=200)
public class DrinkingPotionTask
extends Z_Unknown {
    private final /* synthetic */ C cI;
    private static /* synthetic */ String[] llIlIIIIIll;
    private static /* synthetic */ int[] llIlIIIIlII;
    private final /* synthetic */ SquireAutoTOA cJ;

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
        af.llIlIIIIIll[af.llIlIIIIlII[0]] = af."Drink";
    }

    static {
        af.lIlIIlIIIllIlI();
        af.lIlIIlIIIllIIl();
    }

    private static String lIlIIlIIIllIII(String var11, String var3) {
        try {
            SecretKeySpec var8 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var3.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var10 = Cipher.getInstance("Blowfish");
            var10.init(llIlIIIIlII[3], var8);
            return new String(var10.doFinal(Base64.getDecoder().decode(var11.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var6) {
            var6.printStackTrace();
            return null;
        }
    }

    public boolean run() {
        af var4;
        if (af.lIlIIlIIIllIll(this.cJ.e() ? 1 : 0)) {
            return llIlIIIIlII[0];
        }
        if (af.lIlIIlIIIlllII(var4.bc() ? 1 : 0)) {
            return llIlIIIIlII[0];
        }
        if (af.lIlIIlIIIlllIl(Vars.getBit((int)llIlIIIIlII[1]))) {
            return llIlIIIIlII[0];
        }
        if (af.lIlIIlIIIlllII(var4.cI.am() ? 1 : 0)) {
            return llIlIIIIlII[0];
        }
        Item var1 = Equipment.fromSlot((EquipmentInventorySlot)EquipmentInventorySlot.WEAPON);
        a[] var9 = a.a(var1);
        int var15 = var9.length;
        int var12 = llIlIIIIlII[0];
        while (af.lIlIIlIIIllllI(var12, var15)) {
            a var16 = var9[var12];
            Skill[] var13 = var16.m();
            int var5 = var13.length;
            int var14 = llIlIIIIlII[0];
            while (af.lIlIIlIIIllllI(var14, var5)) {
                Item var2;
                Skill var17 = var13[var14];
                int var7 = (int)(0.5 * (double)var16.a(var17));
                if (af.lIlIIlIIIlllll(Skills.getLevel((Skill)var17) + var7, Skills.getBoostedLevel((Skill)var17)) && af.lIlIIlIIlIIIII(var2 = Inventory.getFirst(item -> item.getName().startsWith(var16.l())))) {
                    var2.interact(llIlIIIIIll[llIlIIIIlII[0]]);
                    var4.cI.ao();
                    return llIlIIIIlII[2];
                }
                ++var14;
                0;
                if ((86 + 52 - 39 + 70 ^ 22 + 94 - -37 + 20) > 0) continue;
                return ((124 + 113 - 98 + 22 ^ 50 + 107 - 78 + 69) & (0xA7 ^ 0x85 ^ (0x21 ^ 0x36) ^ -1)) != 0;
            }
            ++var12;
            0;
            if (((0xA1 ^ 0x8B) & ~(0x28 ^ 2)) >= 0) continue;
            return false;
        }
        return llIlIIIIlII[0];
    }

    @Inject
    protected af(Client client, C c2, SquireAutoTOA squireAutoTOA) {
        super(client);
        this.cI = c2;
        this.cJ = squireAutoTOA;
    }

    private static void lIlIIlIIIllIlI() {
        llIlIIIIlII = new int[4];
        af.llIlIIIIlII[0] = (3 ^ 0x46) & ~(0x60 ^ 0x25);
        af.llIlIIIIlII[1] = -(0xFFFFCFD7 & 0x743B) & (0xFFFFFEBA & 0x7D5F);
        af.llIlIIIIlII[2] = 1;
        af.llIlIIIIlII[3] = 2;
    }

    private static boolean lIlIIlIIIllllI(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIlIIlIIIllIll(int n2) {
        return n2 != 0;
    }
}

