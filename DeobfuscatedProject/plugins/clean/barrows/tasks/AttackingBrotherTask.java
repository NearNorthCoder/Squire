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
import java.nio.charset.StandardCharsets;
import java.util.Base64;
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
import gg.squire.barrows.tasks.GameEnum20;

@TaskDesc(name="Attacking brother", priority=13337, blocking=true)
public class AttackingBrotherTask
extends Task {
    private static final  int R;
    private final  SquireBarrows S;
    private final  a U;
    
    private final  SquireBarrowsConfig T;

    private static boolean lIllIlIIIllllI(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIllIlIIlIIlII(Object object, Object object2) {
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
        void var1;
        n var2;
        d d2 = this.S.s();
        if (n.lIllIlIIIlllll((Object)d2)) {
            return llllIIllIII[4];
        }
        if (!n.lIllIlIIlIIIII(var2.S.i() ? 1 : 0) || n.lIllIlIIlIIIII(var2.S.h() ? 1 : 0)) {
            return llllIIllIII[4];
        }
        NPC var3 = NPCs.getNearest(arg_0 -> n.a((GameEnum20) ar1, arg_0));
        if (n.lIllIlIIIlllll(var3)) {
            return llllIIllIII[4];
        }
        SpellBook.Standard var4 = SpellBook.Standard.IBAN_BLAST;
        int[] nArray = new int[llllIIllIII[5]];
        nArray[n.llllIIllIII[4]] = llllIIllIII[6];
        nArray[n.llllIIllIII[7]] = llllIIllIII[8];
        nArray[n.llllIIllIII[9]] = llllIIllIII[10];
        if (n.lIllIlIIlIIIIl(Equipment.contains((int[])nArray) ? 1 : 0) && n.lIllIlIIlIIIIl(Magic.canCast((Spell)var4) ? 1 : 0) && n.lIllIlIIlIIIII(Magic.isAutoCasting() ? 1 : 0)) {
            Widget llllllllllllllllIIIllIllllIllIlI2;
            Log.info((String)llllIIlIlll[llllIIllIII[4]]);
            Widget llllllllllllllllIIIllIllllIllIll2 = Static.getClient().getWidget(llllIIllIII[11]);
            if (n.lIllIlIIlIIIlI(llllllllllllllllIIIllIllllIllIll2)) {
                llllllllllllllllIIIllIllllIllIll2.interact(llllIIllIII[7], llllIIllIII[12], llllIIllIII[0], llllIIllIII[11]);
            }
            if (n.lIllIlIIlIIIlI(llllllllllllllllIIIllIllllIllIlI2 = Static.getClient().getWidget(llllIIllIII[13]))) {
                llllllllllllllllIIIllIllllIllIlI2.interact(llllIIllIII[7], llllIIllIII[12], llllIIllIII[14], llllIIllIII[13]);
            }
            return llllIIllIII[7];
        }
        if (n.lIllIlIIlIIIll(Combat.getSpecEnergy(), var2.e((GameEnum20) ar1))) {
            n3 = llllIIllIII[7];

            if (3 != 3) {
                return false;
            }
        } else {
            n3 = llllllllllllllllIIIllIllllIllIll2 = llllIIllIII[4];
        }
        if (n.lIllIlIIlIIIIl(var2.f((GameEnum20) ar1) ? 1 : 0) && n.lIllIlIIlIIIIl(llllllllllllllllIIIllIllllIllIll2)) {
            n2 = llllIIllIII[7];

            if (3 < ((0x5C ^ 0xF) & ~(0x74 ^ 0x27))) {
                return false;
            }
        } else {
            n2 = llllIIllIII[4];
        }
        if (n.lIllIlIIlIIIIl(llllllllllllllllIIIllIllllIllIlI2 = n2)) {
            if (n.lIllIlIIlIIIII(Gear.isEquipped((int[])var2.U.d((GameEnum20) ar1)) ? 1 : 0)) {
                Log.info((String)llllIIlIlll[llllIIllIII[7]]);
                Gear.swapTo((int[])var2.U.d((GameEnum20) ar1));

                return llllIIllIII[7];
            }
            if (n.lIllIlIIlIIIII(Combat.isSpecEnabled() ? 1 : 0)) {
                Log.info((String)llllIIlIlll[llllIIllIII[9]]);
                Combat.toggleSpec();
                return llllIIllIII[7];
            }
        }
        if (n.lIllIlIIlIIIII(llllllllllllllllIIIllIllllIllIlI2) && n.lIllIlIIlIIIII(Gear.isEquipped((int[])var2.U.c((GameEnum20) ar1)) ? 1 : 0)) {
            Gear.swapTo((int[])var2.U.c((GameEnum20) ar1));

        }
        if (n.lIllIlIIlIIlII(Players.getLocal().getInteracting(), var3)) {
            return llllIIllIII[7];
        }
        var2_2.interact(llllIIlIlll[llllIIllIII[5]]);
        this.S.a((NPC)var2_2);
        return llllIIllIII[7];
    }

    /*
     * WARNING - void declaration
     */
    private boolean f(d d2) {
        int n2;
        n var5;
        void var6;
        if (n.lIllIlIIlIIlII((Object)d2, (Object)d.AHRIM) && n.lIllIlIIlIIIIl(this.T.specOnAhrim() ? 1 : 0)) {
            return llllIIllIII[7];
        }
        if (n.lIllIlIIlIIlII(var6, (Object)d.KARIL) && n.lIllIlIIlIIIIl(var5.T.specOnKaril() ? 1 : 0)) {
            n2 = llllIIllIII[7];

            if (((0xF3 ^ 0x8B ^ (0x60 ^ 0x42)) & (0x65 ^ 0x18 ^ (0x65 ^ 0x42) ^ -1)) == (0xD6 ^ 0xAF ^ (0xEC ^ 0x91))) {
                return ((6 + 45 - -44 + 48 ^ 140 + 176 - 304 + 169) & (0xF9 ^ 0xC5 ^ (0x8B ^ 0x8D) ^ -1)) != 0;
            }
        } else {
            n2 = llllIIllIII[4];
        }
        return n2 != 0;
    }

    public static int g(int n2) {
        if (n.lIllIlIIIllllI(n2, llllIIllIII[0])) {
            return llllIIllIII[1];
        }
        int n3 = Static.getClient().getEnum(llllIIllIII[2]).getIntValue(n2);
        return n3 / llllIIllIII[3];
    }

    private static void lIllIlIIIlllII() {
        llllIIlIlll = new String[llllIIllIII[15]];
        n.llllIIlIlll[n.llllIIllIII[4]] = "Auto casting IBAN BLAST";
        n.llllIIlIlll[n.llllIIllIII[7]] = "Swapping to spec gear";
        n.llllIIlIlll[n.llllIIllIII[9]] = "Toggling spec";
        n.llllIIlIlll[n.llllIIllIII[5]] = "Attack";
    }

    private static boolean lIllIlIIlIIlIl(Object object, Object object2) {
        return object != object2;
    }

    private static boolean lIllIlIIlIIIll(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIllIlIIlIIIIl(int n2) {
        return n2 != 0;
    }

    static {
        n.lIllIlIIIlllIl();
        n.lIllIlIIIlllII();
        R = llllIIllIII[2];
    }

    private static boolean lIllIlIIlIIllI(int n2, int n3) {
        return n2 < n3;
    }

    private static  boolean a(d d2, NPC nPC) {
        int n2;
        if (n.lIllIlIIlIIIII(nPC.isDead() ? 1 : 0) && n.lIllIlIIlIIIIl(nPC.getName().contains(d2.C()) ? 1 : 0) && n.lIllIlIIlIIlII(nPC.getInteracting(), Players.getLocal())) {
            n2 = llllIIllIII[7];

            if (2 == 0) {
                return ((2 ^ 0x1C ^ (0xBF ^ 0xB7)) & (0xE4 ^ 0x92 ^ (0xA ^ 0x6A) ^ -1)) != 0;
            }
        } else {
            n2 = llllIIllIII[4];
        }
        return n2 != 0;
    }

    private static boolean lIllIlIIIlllll(Object object) {
        return object == null;
    }

        return String.valueOf(var7);
    }

    @Inject
    public AttackingBrotherTask(SquireBarrows squireBarrows, SquireBarrowsConfig squireBarrowsConfig, a a2) {
        this.S = squireBarrows;
        this.T = squireBarrowsConfig;
        this.U = a2;
    }

    private static boolean lIllIlIIlIIIlI(Object object) {
        return object != null;
    }

    private static boolean lIllIlIIlIIIII(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    private int e(d d2) {
        int n2;
        void var8;
        n var9;
        if (n.lIllIlIIlIIlIl((Object)d2, (Object)d.AHRIM) && n.lIllIlIIlIIlIl((Object)d2, (Object)d.KARIL)) {
            return llllIIllIII[1];
        }
        EquipmentSetup var10 = (EquipmentSetup)var9.T.karilSpecGear().selected(EquipmentSetup.class);
        EquipmentSetup var11 = (EquipmentSetup)var9.T.ahrimSpecGear().selected(EquipmentSetup.class);
        int var12 = llllIIllIII[0];
        int var13 = llllIIllIII[0];
        if (n.lIllIlIIlIIIlI(var11)) {
            var12 = var11.get(EquipmentInventorySlot.WEAPON);
        }
        if (n.lIllIlIIlIIIlI(var10)) {
            var13 = var10.get(EquipmentInventorySlot.WEAPON);
        }
        if (n.lIllIlIIlIIlII(var8, (Object)d.AHRIM)) {
            n2 = var12;

            if (3 <= 2) {
                return (0x53 ^ 0x6E) & ~(3 ^ 0x3E);
            }
        } else {
            n2 = var13;
        }
        return n.g(n2);
    }
}

