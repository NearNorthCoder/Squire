/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  javax.inject.Inject
 *  net.runelite.api.EquipmentInventorySlot
 *  net.runelite.api.NPC
 *  net.runelite.api.widgets.Widget
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.game.Gear
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.magic.Magic
 *  net.unethicalite.api.magic.Spell
 *  net.unethicalite.api.magic.SpellBook$Standard
 *  net.unethicalite.client.Static
 */
package gg.squire.barrows.tasks;

import gg.squire.barrows.SquireBarrows;
import gg.squire.barrows.SquireBarrowsConfig;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import javax.inject.Inject;
import net.runelite.api.EquipmentInventorySlot;
import net.runelite.api.NPC;
import net.runelite.api.widgets.Widget;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.game.Gear;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.magic.Spell;
import net.unethicalite.api.magic.SpellBook;
import net.unethicalite.client.Static;
import gg.squire.barrows.tasks.BarrowsManager;
import gg.squire.barrows.tasks.GameEnum2;

@TaskDesc(name="Attacking brother", priority=13337, blocking=true)
public class AttackingBrotherTask
extends Task {
    private static final  int R;
    private final  SquireBarrows S;
    private final  a U;
    
    private final  SquireBarrowsConfig T;

    private static boolean var3(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean var4(Object object, Object object2) {
        return object == object2;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var2_2;
        int llllllllllllllllIIIllIllllIllIlI2;
        int n2;
        int llllllllllllllllIIIllIllllIllIll2;
        int n3;
        void var5;
        n var6;
        d d2 = this.S.s();
        if (n.var7((Object)d2)) {
            return var1[4];
        }
        if (!n.var8(var6.S.i() ? 1 : 0) || n.var8(var6.S.h() ? 1 : 0)) {
            return var1[4];
        }
        NPC var9 = NPCs.getNearest(arg_0 -> n.a((d)var5, arg_0));
        if (n.var7(var9)) {
            return var1[4];
        }
        SpellBook.Standard var10 = SpellBook.Standard.IBAN_BLAST;
        int[] nArray = new int[var1[5]];
        nArray[n.var1[4]] = var1[6];
        nArray[n.var1[7]] = var1[8];
        nArray[n.var1[9]] = var1[10];
        if (n.var11(Equipment.contains((int[])nArray) ? 1 : 0) && n.var11(Magic.canCast((Spevar10) ? 1 : 0) && n.var8(Magic.isAutoCasting() ? 1 : 0)) {
            Widget llllllllllllllllIIIllIllllIllIlI2;
            Log.info((String)var2[var1[4]]);
            Widget llllllllllllllllIIIllIllllIllIll2 = Static.getClient().getWidget(var1[11]);
            if (n.var12(llllllllllllllllIIIllIllllIllIll2)) {
                llllllllllllllllIIIllIllllIllIll2.interact(var1[7], var1[12], var1[0], var1[11]);
            }
            if (n.var12(llllllllllllllllIIIllIllllIllIlI2 = Static.getClient().getWidget(var1[13]))) {
                llllllllllllllllIIIllIllllIllIlI2.interact(var1[7], var1[12], var1[14], var1[13]);
            }
            return var1[7];
        }
        if (n.var13(Combat.getSpecEnergy(), var6.e((d)var5))) {
            n3 = var1[7];
            0;
            if (3 != 3) {
                return ((72 + 68 - 96 + 141 ^ 19 + 30 - -23 + 97) & (131 + 34 - -1 + 1 ^ 71 + 99 - 51 + 64 ^ -1)) != 0;
            }
        } else {
            n3 = llllllllllllllllIIIllIllllIllIll2 = var1[4];
        }
        if (n.var11(var6.f((d)var5) ? 1 : 0) && n.var11(llllllllllllllllIIIllIllllIllIll2)) {
            n2 = var1[7];
            0;
            if (3 < ((0x5C ^ 0xF) & ~(0x74 ^ 0x27))) {
                return ((0x52 ^ 0x65) & ~(0x55 ^ 0x62)) != 0;
            }
        } else {
            n2 = var1[4];
        }
        if (n.var11(llllllllllllllllIIIllIllllIllIlI2 = n2)) {
            if (n.var8(Gear.isEquipped((int[])var6.U.d((d)var5)) ? 1 : 0)) {
                Log.info((String)var2[var1[7]]);
                Gear.swapTo((int[])var6.U.d((d)var5));
                0;
                return var1[7];
            }
            if (n.var8(Combat.isSpecEnabled() ? 1 : 0)) {
                Log.info((String)var2[var1[9]]);
                Combat.toggleSpec();
                return var1[7];
            }
        }
        if (n.var8(llllllllllllllllIIIllIllllIllIlI2) && n.var8(Gear.isEquipped((int[])var6.U.c((d)var5)) ? 1 : 0)) {
            Gear.swapTo((int[])var6.U.c((d)var5));
            0;
        }
        if (n.var4(Players.getLocal().getInteracting(), var9)) {
            return var1[7];
        }
        var2_2.interact(var2[var1[5]]);
        this.S.a((NPC)var2_2);
        return var1[7];
    }

    /*
     * WARNING - void declaration
     */
    private boolean f(d d2) {
        int n2;
        n var14;
        void var15;
        if (n.var4((Object)d2, (Object)d.AHRIM) && n.var11(this.T.specOnAhrim() ? 1 : 0)) {
            return var1[7];
        }
        if (n.var4(var15, (Object)d.KARIL) && n.var11(var14.T.specOnKaril() ? 1 : 0)) {
            n2 = var1[7];
            0;
            if (((0xF3 ^ 0x8B ^ (0x60 ^ 0x42)) & (0x65 ^ 0x18 ^ (0x65 ^ 0x42) ^ -1)) == (0xD6 ^ 0xAF ^ (0xEC ^ 0x91))) {
                return ((6 + 45 - -44 + 48 ^ 140 + 176 - 304 + 169) & (0xF9 ^ 0xC5 ^ (0x8B ^ 0x8D) ^ -1)) != 0;
            }
        } else {
            n2 = var1[4];
        }
        return n2 != 0;
    }

    public static int g(int n2) {
        if (n.var3(n2, var1[0])) {
            return var1[1];
        }
        int n3 = Static.getClient().getEnum(var1[2]).getIntValue(n2);
        return n3 / var1[3];
    }

    private static void var16() {
        var2 = new String[var1[15]];
        n.var2[n.var1[4]] = "Auto casting IBAN BLAST";
        n.var2[n.var1[7]] = "Swapping to spec gear";
        n.var2[n.var1[9]] = "Toggling spec";
        n.var2[n.var1[5]] = "Attack";
    }

    private static boolean var17(Object object, Object object2) {
        return object != object2;
    }

    private static boolean var13(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean var11(int n2) {
        return n2 != 0;
    }

    private static void var18() {
        var1 = new int[16];
        n.var1[0] = -1;
        n.var1[1] = -(0xFFFFF3D3 & 0x3EAF) & (0xFFFFFFFF & 0x37BB);
        n.var1[2] = 0xFFFFAF9A & 0x53EF;
        n.var1[3] = 9 ^ 3;
        n.var1[4] = (2 ^ 0x61) & ~(0x42 ^ 0x21);
        n.var1[5] = 3;
        n.var1[6] = 0xFFFFF583 & 0xFFD;
        n.var1[7] = 1;
        n.var1[8] = 0xFFFFF7FF & 0x3972;
        n.var1[9] = 2;
        n.var1[10] = 0xFFFFED83 & 0x17FE;
        n.var1[11] = -(0xFFFFFDBF & 0x77C6) & (0xFFFFFDFF & 0x251779F);
        n.var1[12] = 0x52 ^ 0x6B;
        n.var1[13] = 0xFFFF996B & 0xC96695;
        n.var1[14] = 0x34 ^ 0x1B;
        n.var1[15] = 11 + 2 - -132 + 5 ^ 91 + 24 - 47 + 78;
    }

    static {
        n.var18();
        n.var16();
        R = var1[2];
    }

    private static boolean var19(int n2, int n3) {
        return n2 < n3;
    }

    private static  boolean a(d d2, NPC nPC) {
        int n2;
        if (n.var8(nPC.isDead() ? 1 : 0) && n.var11(nPC.getName().contains(d2.C()) ? 1 : 0) && n.var4(nPC.getInteracting(), Players.getLocal())) {
            n2 = var1[7];
            0;
            
        } else {
            n2 = var1[4];
        }
        return n2 != 0;
    }

    private static boolean var7(Object object) {
        return object == null;
    }

    private static String var20(String var21, String var22) {
        var21 = new String(Base64.getDecoder().decode(var21.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var23 = new StringBuilder();
        char[] var24 = var22.toCharArray();
        int var25 = var1[4];
        char[] var26 = var21.toCharArray();
        int var27 = var26.length;
        int var28 = var1[4];
        while (n.var19(var28, var27)) {
            char var29 = var26[var28];
            var23.append((char)(var29 ^ var24[var25 % var24.length]));
            0;
            ++var25;
            ++var28;
            0;
            if (-(0x5E ^ 0x5A) <= 0) continue;
            return null;
        }
        return String.valueOf(var23);
    }

    @Inject
    public AttackingBrotherTask(SquireBarrows squireBarrows, SquireBarrowsConfig squireBarrowsConfig, a a2) {
        this.S = squireBarrows;
        this.T = squireBarrowsConfig;
        this.U = a2;
    }

    private static boolean var12(Object object) {
        return object != null;
    }

    private static boolean var8(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    private int e(d d2) {
        int n2;
        void var30;
        n var31;
        if (n.var17((Object)d2, (Object)d.AHRIM) && n.var17((Object)d2, (Object)d.KARIL)) {
            return var1[1];
        }
        EquipmentSetup var32 = (EquipmentSetup)var31.T.karilSpecGear().selected(EquipmentSetup.class);
        EquipmentSetup var33 = (EquipmentSetup)var31.T.ahrimSpecGear().selected(EquipmentSetup.class);
        int var34 = var1[0];
        int var35 = var1[0];
        if (n.var12(var33)) {
            var34 = var33.get(EquipmentInventorySlot.WEAPON);
        }
        if (n.var12(var32)) {
            var35 = var32.get(EquipmentInventorySlot.WEAPON);
        }
        if (n.var4(var30, (Object)d.AHRIM)) {
            n2 = var34;
            0;
            if (3 <= 2) {
                return (0x53 ^ 0x6E) & ~(3 ^ 0x3E);
            }
        } else {
            n2 = var35;
        }
        return n.g(n2);
    }
}

