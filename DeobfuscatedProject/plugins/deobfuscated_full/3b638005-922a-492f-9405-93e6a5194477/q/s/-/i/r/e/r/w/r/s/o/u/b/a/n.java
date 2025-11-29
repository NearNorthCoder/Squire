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
package q.s.-.i.r.e.r.w.r.s.o.u.b.a;

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
import q.s.-.i.r.e.r.w.r.s.o.u.b.a.a;
import q.s.-.i.r.e.r.w.r.s.o.u.b.a.d;

/* TASK: Attacking brother -> AttackingbrotherTask */
@TaskDesc(name="Attacking brother", priority=13337, blocking=true)
public class n
extends Task {
    private static final /* synthetic */ int R;
    private final /* synthetic */ SquireBarrows S;
    private final /* synthetic */ a U;
    private static /* synthetic */ int[] llllIIllIII;
    private final /* synthetic */ SquireBarrowsConfig T;
    private static /* synthetic */ String[] llllIIlIlll;

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
        void var10;
        n var2;
        d d2 = this.S.s();
        if (n.lIllIlIIIlllll((Object)d2)) {
            return llllIIllIII[4];
        }
        if (!n.lIllIlIIlIIIII(var2.S.i() ? 1 : 0) || n.lIllIlIIlIIIII(var2.S.h() ? 1 : 0)) {
            return llllIIllIII[4];
        }
        NPC var15 = NPCs.getNearest(arg_0 -> n.a((d)var10, arg_0));
        if (n.lIllIlIIIlllll(var15)) {
            return llllIIllIII[4];
        }
        SpellBook.Standard var16 = SpellBook.Standard.IBAN_BLAST;
        int[] nArray = new int[llllIIllIII[5]];
        nArray[n.llllIIllIII[4]] = llllIIllIII[6];
        nArray[n.llllIIllIII[7]] = llllIIllIII[8];
        nArray[n.llllIIllIII[9]] = llllIIllIII[10];
        if (n.lIllIlIIlIIIIl(Equipment.contains((int[])nArray) ? 1 : 0) && n.lIllIlIIlIIIIl(Magic.canCast((Spell)var16) ? 1 : 0) && n.lIllIlIIlIIIII(Magic.isAutoCasting() ? 1 : 0)) {
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
        if (n.lIllIlIIlIIIll(Combat.getSpecEnergy(), var2.e((d)var10))) {
            n3 = llllIIllIII[7];
            0;
            if (3 != 3) {
                return false;
            }
        } else {
            n3 = llllllllllllllllIIIllIllllIllIll2 = llllIIllIII[4];
        }
        if (n.lIllIlIIlIIIIl(var2.f((d)var10) ? 1 : 0) && n.lIllIlIIlIIIIl(llllllllllllllllIIIllIllllIllIll2)) {
            n2 = llllIIllIII[7];
            0;
            if (3 < ((0x5C ^ 0xF) & ~(0x74 ^ 0x27))) {
                return false;
            }
        } else {
            n2 = llllIIllIII[4];
        }
        if (n.lIllIlIIlIIIIl(llllllllllllllllIIIllIllllIllIlI2 = n2)) {
            if (n.lIllIlIIlIIIII(Gear.isEquipped((int[])var2.U.d((d)var10)) ? 1 : 0)) {
                Log.info((String)llllIIlIlll[llllIIllIII[7]]);
                Gear.swapTo((int[])var2.U.d((d)var10));
                0;
                return llllIIllIII[7];
            }
            if (n.lIllIlIIlIIIII(Combat.isSpecEnabled() ? 1 : 0)) {
                Log.info((String)llllIIlIlll[llllIIllIII[9]]);
                Combat.toggleSpec();
                return llllIIllIII[7];
            }
        }
        if (n.lIllIlIIlIIIII(llllllllllllllllIIIllIllllIllIlI2) && n.lIllIlIIlIIIII(Gear.isEquipped((int[])var2.U.c((d)var10)) ? 1 : 0)) {
            Gear.swapTo((int[])var2.U.c((d)var10));
            0;
        }
        if (n.lIllIlIIlIIlII(Players.getLocal().getInteracting(), var15)) {
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
        n var14;
        void var7;
        if (n.lIllIlIIlIIlII((Object)d2, (Object)d.AHRIM) && n.lIllIlIIlIIIIl(this.T.specOnAhrim() ? 1 : 0)) {
            return llllIIllIII[7];
        }
        if (n.lIllIlIIlIIlII(var7, (Object)d.KARIL) && n.lIllIlIIlIIIIl(var14.T.specOnKaril() ? 1 : 0)) {
            n2 = llllIIllIII[7];
            0;
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
        n.llllIIlIlll[n.llllIIllIII[4]] = n."Auto casting IBAN BLAST";
        n.llllIIlIlll[n.llllIIllIII[7]] = n."Swapping to spec gear";
        n.llllIIlIlll[n.llllIIllIII[9]] = n."Toggling spec";
        n.llllIIlIlll[n.llllIIllIII[5]] = n."Attack";
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

    private static void lIllIlIIIlllIl() {
        llllIIllIII = new int[16];
        n.llllIIllIII[0] = -1;
        n.llllIIllIII[1] = -(0xFFFFF3D3 & 0x3EAF) & (0xFFFFFFFF & 0x37BB);
        n.llllIIllIII[2] = 0xFFFFAF9A & 0x53EF;
        n.llllIIllIII[3] = 9 ^ 3;
        n.llllIIllIII[4] = (2 ^ 0x61) & ~(0x42 ^ 0x21);
        n.llllIIllIII[5] = 3;
        n.llllIIllIII[6] = 0xFFFFF583 & 0xFFD;
        n.llllIIllIII[7] = 1;
        n.llllIIllIII[8] = 0xFFFFF7FF & 0x3972;
        n.llllIIllIII[9] = 2;
        n.llllIIllIII[10] = 0xFFFFED83 & 0x17FE;
        n.llllIIllIII[11] = -(0xFFFFFDBF & 0x77C6) & (0xFFFFFDFF & 0x251779F);
        n.llllIIllIII[12] = 0x52 ^ 0x6B;
        n.llllIIllIII[13] = 0xFFFF996B & 0xC96695;
        n.llllIIllIII[14] = 0x34 ^ 0x1B;
        n.llllIIllIII[15] = 11 + 2 - -132 + 5 ^ 91 + 24 - 47 + 78;
    }

    static {
        n.lIllIlIIIlllIl();
        n.lIllIlIIIlllII();
        R = llllIIllIII[2];
    }

    private static boolean lIllIlIIlIIllI(int n2, int n3) {
        return n2 < n3;
    }

    private static /* synthetic */ boolean a(d d2, NPC nPC) {
        int n2;
        if (n.lIllIlIIlIIIII(nPC.isDead() ? 1 : 0) && n.lIllIlIIlIIIIl(nPC.getName().contains(d2.C()) ? 1 : 0) && n.lIllIlIIlIIlII(nPC.getInteracting(), Players.getLocal())) {
            n2 = llllIIllIII[7];
            0;
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

    private static String lIllIlIIIllIll(String var5, String var9) {
        var5 = new String(Base64.getDecoder().decode(var5.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var1 = new StringBuilder();
        char[] var20 = var9.toCharArray();
        int var21 = llllIIllIII[4];
        char[] var17 = var5.toCharArray();
        int var4 = var17.length;
        int var18 = llllIIllIII[4];
        while (n.lIllIlIIlIIllI(var18, var4)) {
            char var13 = var17[var18];
            var1.append((char)(var13 ^ var20[var21 % var20.length]));
            0;
            ++var21;
            ++var18;
            0;
            if (-(0x5E ^ 0x5A) <= 0) continue;
            return null;
        }
        return String.valueOf(var1);
    }

    @Inject
    public n(SquireBarrows squireBarrows, SquireBarrowsConfig squireBarrowsConfig, a a2) {
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
        void var19;
        n var3;
        if (n.lIllIlIIlIIlIl((Object)d2, (Object)d.AHRIM) && n.lIllIlIIlIIlIl((Object)d2, (Object)d.KARIL)) {
            return llllIIllIII[1];
        }
        EquipmentSetup var12 = (EquipmentSetup)var3.T.karilSpecGear().selected(EquipmentSetup.class);
        EquipmentSetup var8 = (EquipmentSetup)var3.T.ahrimSpecGear().selected(EquipmentSetup.class);
        int var11 = llllIIllIII[0];
        int var6 = llllIIllIII[0];
        if (n.lIllIlIIlIIIlI(var8)) {
            var11 = var8.get(EquipmentInventorySlot.WEAPON);
        }
        if (n.lIllIlIIlIIIlI(var12)) {
            var6 = var12.get(EquipmentInventorySlot.WEAPON);
        }
        if (n.lIllIlIIlIIlII(var19, (Object)d.AHRIM)) {
            n2 = var11;
            0;
            if (3 <= 2) {
                return (0x53 ^ 0x6E) & ~(3 ^ 0x3E);
            }
        } else {
            n2 = var6;
        }
        return n.g(n2);
    }
}

