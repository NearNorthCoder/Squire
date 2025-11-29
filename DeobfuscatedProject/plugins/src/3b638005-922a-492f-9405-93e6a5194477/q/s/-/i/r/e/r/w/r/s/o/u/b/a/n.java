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
        void llllllllllllllllIIIllIllllIllllI;
        n llllllllllllllllIIIllIllllIlllll;
        d d2 = this.S.s();
        if (n.lIllIlIIIlllll((Object)d2)) {
            return llllIIllIII[4];
        }
        if (!n.lIllIlIIlIIIII(llllllllllllllllIIIllIllllIlllll.S.i() ? 1 : 0) || n.lIllIlIIlIIIII(llllllllllllllllIIIllIllllIlllll.S.h() ? 1 : 0)) {
            return llllIIllIII[4];
        }
        NPC llllllllllllllllIIIllIllllIlllIl = NPCs.getNearest(arg_0 -> n.a((d)llllllllllllllllIIIllIllllIllllI, arg_0));
        if (n.lIllIlIIIlllll(llllllllllllllllIIIllIllllIlllIl)) {
            return llllIIllIII[4];
        }
        SpellBook.Standard llllllllllllllllIIIllIllllIlllII = SpellBook.Standard.IBAN_BLAST;
        int[] nArray = new int[llllIIllIII[5]];
        nArray[n.llllIIllIII[4]] = llllIIllIII[6];
        nArray[n.llllIIllIII[7]] = llllIIllIII[8];
        nArray[n.llllIIllIII[9]] = llllIIllIII[10];
        if (n.lIllIlIIlIIIIl(Equipment.contains((int[])nArray) ? 1 : 0) && n.lIllIlIIlIIIIl(Magic.canCast((Spell)llllllllllllllllIIIllIllllIlllII) ? 1 : 0) && n.lIllIlIIlIIIII(Magic.isAutoCasting() ? 1 : 0)) {
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
        if (n.lIllIlIIlIIIll(Combat.getSpecEnergy(), llllllllllllllllIIIllIllllIlllll.e((d)llllllllllllllllIIIllIllllIllllI))) {
            n3 = llllIIllIII[7];
            "".length();
            if ("   ".length() != "   ".length()) {
                return ((72 + 68 - 96 + 141 ^ 19 + 30 - -23 + 97) & (131 + 34 - -1 + 1 ^ 71 + 99 - 51 + 64 ^ -" ".length())) != 0;
            }
        } else {
            n3 = llllllllllllllllIIIllIllllIllIll2 = llllIIllIII[4];
        }
        if (n.lIllIlIIlIIIIl(llllllllllllllllIIIllIllllIlllll.f((d)llllllllllllllllIIIllIllllIllllI) ? 1 : 0) && n.lIllIlIIlIIIIl(llllllllllllllllIIIllIllllIllIll2)) {
            n2 = llllIIllIII[7];
            "".length();
            if ("   ".length() < ((0x5C ^ 0xF) & ~(0x74 ^ 0x27))) {
                return ((0x52 ^ 0x65) & ~(0x55 ^ 0x62)) != 0;
            }
        } else {
            n2 = llllIIllIII[4];
        }
        if (n.lIllIlIIlIIIIl(llllllllllllllllIIIllIllllIllIlI2 = n2)) {
            if (n.lIllIlIIlIIIII(Gear.isEquipped((int[])llllllllllllllllIIIllIllllIlllll.U.d((d)llllllllllllllllIIIllIllllIllllI)) ? 1 : 0)) {
                Log.info((String)llllIIlIlll[llllIIllIII[7]]);
                Gear.swapTo((int[])llllllllllllllllIIIllIllllIlllll.U.d((d)llllllllllllllllIIIllIllllIllllI));
                "".length();
                return llllIIllIII[7];
            }
            if (n.lIllIlIIlIIIII(Combat.isSpecEnabled() ? 1 : 0)) {
                Log.info((String)llllIIlIlll[llllIIllIII[9]]);
                Combat.toggleSpec();
                return llllIIllIII[7];
            }
        }
        if (n.lIllIlIIlIIIII(llllllllllllllllIIIllIllllIllIlI2) && n.lIllIlIIlIIIII(Gear.isEquipped((int[])llllllllllllllllIIIllIllllIlllll.U.c((d)llllllllllllllllIIIllIllllIllllI)) ? 1 : 0)) {
            Gear.swapTo((int[])llllllllllllllllIIIllIllllIlllll.U.c((d)llllllllllllllllIIIllIllllIllllI));
            "".length();
        }
        if (n.lIllIlIIlIIlII(Players.getLocal().getInteracting(), llllllllllllllllIIIllIllllIlllIl)) {
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
        n llllllllllllllllIIIllIllllIIlIll;
        void llllllllllllllllIIIllIllllIIlIlI;
        if (n.lIllIlIIlIIlII((Object)d2, (Object)d.AHRIM) && n.lIllIlIIlIIIIl(this.T.specOnAhrim() ? 1 : 0)) {
            return llllIIllIII[7];
        }
        if (n.lIllIlIIlIIlII(llllllllllllllllIIIllIllllIIlIlI, (Object)d.KARIL) && n.lIllIlIIlIIIIl(llllllllllllllllIIIllIllllIIlIll.T.specOnKaril() ? 1 : 0)) {
            n2 = llllIIllIII[7];
            "".length();
            if (((0xF3 ^ 0x8B ^ (0x60 ^ 0x42)) & (0x65 ^ 0x18 ^ (0x65 ^ 0x42) ^ -" ".length())) == (0xD6 ^ 0xAF ^ (0xEC ^ 0x91))) {
                return ((6 + 45 - -44 + 48 ^ 140 + 176 - 304 + 169) & (0xF9 ^ 0xC5 ^ (0x8B ^ 0x8D) ^ -" ".length())) != 0;
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
        n.llllIIlIlll[n.llllIIllIII[4]] = n.lIllIlIIIllIll("OAYFGlMaEgIBGhcUUTwxOD1RNz84ICU=", "ysqus");
        n.llllIIlIlll[n.llllIIllIII[7]] = n.lIllIlIIIllIll("NjYqCBkMLyxYHQphOAgMBmEsHQgX", "eAKxi");
        n.llllIIlIlll[n.llllIIllIII[9]] = n.lIllIlIIIllIll("EAIMKRgtAwxuBzQICA==", "DmkNt");
        n.llllIIlIlll[n.llllIIllIII[5]] = n.lIllIlIIIllIll("AiEtDCko", "CUYmJ");
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
        n.llllIIllIII[0] = -" ".length();
        n.llllIIllIII[1] = -(0xFFFFF3D3 & 0x3EAF) & (0xFFFFFFFF & 0x37BB);
        n.llllIIllIII[2] = 0xFFFFAF9A & 0x53EF;
        n.llllIIllIII[3] = 9 ^ 3;
        n.llllIIllIII[4] = (2 ^ 0x61) & ~(0x42 ^ 0x21);
        n.llllIIllIII[5] = "   ".length();
        n.llllIIllIII[6] = 0xFFFFF583 & 0xFFD;
        n.llllIIllIII[7] = " ".length();
        n.llllIIllIII[8] = 0xFFFFF7FF & 0x3972;
        n.llllIIllIII[9] = "  ".length();
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
            "".length();
            if ("  ".length() == 0) {
                return ((2 ^ 0x1C ^ (0xBF ^ 0xB7)) & (0xE4 ^ 0x92 ^ (0xA ^ 0x6A) ^ -" ".length())) != 0;
            }
        } else {
            n2 = llllIIllIII[4];
        }
        return n2 != 0;
    }

    private static boolean lIllIlIIIlllll(Object object) {
        return object == null;
    }

    private static String lIllIlIIIllIll(String llllllllllllllllIIIllIlllIllIllI, String llllllllllllllllIIIllIlllIllIlIl) {
        llllllllllllllllIIIllIlllIllIllI = new String(Base64.getDecoder().decode(llllllllllllllllIIIllIlllIllIllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllIIIllIlllIlllIIl = new StringBuilder();
        char[] llllllllllllllllIIIllIlllIlllIII = llllllllllllllllIIIllIlllIllIlIl.toCharArray();
        int llllllllllllllllIIIllIlllIllIlll = llllIIllIII[4];
        char[] llllllllllllllllIIIllIlllIllIIIl = llllllllllllllllIIIllIlllIllIllI.toCharArray();
        int llllllllllllllllIIIllIlllIllIIII = llllllllllllllllIIIllIlllIllIIIl.length;
        int llllllllllllllllIIIllIlllIlIllll = llllIIllIII[4];
        while (n.lIllIlIIlIIllI(llllllllllllllllIIIllIlllIlIllll, llllllllllllllllIIIllIlllIllIIII)) {
            char llllllllllllllllIIIllIlllIllllII = llllllllllllllllIIIllIlllIllIIIl[llllllllllllllllIIIllIlllIlIllll];
            llllllllllllllllIIIllIlllIlllIIl.append((char)(llllllllllllllllIIIllIlllIllllII ^ llllllllllllllllIIIllIlllIlllIII[llllllllllllllllIIIllIlllIllIlll % llllllllllllllllIIIllIlllIlllIII.length]));
            "".length();
            ++llllllllllllllllIIIllIlllIllIlll;
            ++llllllllllllllllIIIllIlllIlIllll;
            "".length();
            if (-(0x5E ^ 0x5A) <= 0) continue;
            return null;
        }
        return String.valueOf(llllllllllllllllIIIllIlllIlllIIl);
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
        void llllllllllllllllIIIllIllllIlIIlI;
        n llllllllllllllllIIIllIllllIlIIll;
        if (n.lIllIlIIlIIlIl((Object)d2, (Object)d.AHRIM) && n.lIllIlIIlIIlIl((Object)d2, (Object)d.KARIL)) {
            return llllIIllIII[1];
        }
        EquipmentSetup llllllllllllllllIIIllIllllIlIIIl = (EquipmentSetup)llllllllllllllllIIIllIllllIlIIll.T.karilSpecGear().selected(EquipmentSetup.class);
        EquipmentSetup llllllllllllllllIIIllIllllIlIIII = (EquipmentSetup)llllllllllllllllIIIllIllllIlIIll.T.ahrimSpecGear().selected(EquipmentSetup.class);
        int llllllllllllllllIIIllIllllIIllll = llllIIllIII[0];
        int llllllllllllllllIIIllIllllIIlllI = llllIIllIII[0];
        if (n.lIllIlIIlIIIlI(llllllllllllllllIIIllIllllIlIIII)) {
            llllllllllllllllIIIllIllllIIllll = llllllllllllllllIIIllIllllIlIIII.get(EquipmentInventorySlot.WEAPON);
        }
        if (n.lIllIlIIlIIIlI(llllllllllllllllIIIllIllllIlIIIl)) {
            llllllllllllllllIIIllIllllIIlllI = llllllllllllllllIIIllIllllIlIIIl.get(EquipmentInventorySlot.WEAPON);
        }
        if (n.lIllIlIIlIIlII(llllllllllllllllIIIllIllllIlIIlI, (Object)d.AHRIM)) {
            n2 = llllllllllllllllIIIllIllllIIllll;
            "".length();
            if ("   ".length() <= "  ".length()) {
                return (0x53 ^ 0x6E) & ~(3 ^ 0x3E);
            }
        } else {
            n2 = llllllllllllllllIIIllIllllIIlllI;
        }
        return n.g(n2);
    }
}

