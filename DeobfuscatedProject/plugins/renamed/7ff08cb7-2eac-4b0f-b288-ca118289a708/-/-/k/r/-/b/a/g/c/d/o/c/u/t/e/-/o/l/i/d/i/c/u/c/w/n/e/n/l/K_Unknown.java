/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Prayer
 *  net.runelite.api.Skill
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Bank$WithdrawMode
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.Walker
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 *  net.unethicalite.api.widgets.Dialog
 *  net.unethicalite.api.widgets.Prayers
 */
package -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l;

import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.H_Unknown;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.N_Unknown;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.a_Unknown;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.ab_Unknown;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.aq_Unknown;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.as_Unknown;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.b_Unknown;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.d;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.e_Unknown;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.f_Unknown;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.g_Unknown;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.j;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.m_Unknown;
import gg.squire.account.AccBuilderGWD;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Prayer;
import net.runelite.api.Skill;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.Walker;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Prayers;

public class K_Unknown
implements ab {
    public static final /* synthetic */ WorldPoint fP;
    public static final /* synthetic */ WorldPoint fR;
    public static final /* synthetic */ WorldPoint fN;
    static /* synthetic */ int fX;
    public static final /* synthetic */ WorldPoint fU;
    public static final /* synthetic */ WorldPoint fT;
    public static final /* synthetic */ WorldPoint fW;
    public static final /* synthetic */ WorldPoint fV;
    private static /* synthetic */ int[] llIlllIlI;
    private static /* synthetic */ String[] llIlllIII;
    static /* synthetic */ int dk;
    public static /* synthetic */ List<d> bx;
    public static /* synthetic */ String[] cG;
    public static /* synthetic */ boolean bv;
    public static final /* synthetic */ WorldPoint fQ;
    static /* synthetic */ boolean dl;
    static /* synthetic */ WorldArea fY;
    public static final /* synthetic */ WorldPoint fO;
    static /* synthetic */ WorldArea fZ;
    public static final /* synthetic */ WorldPoint fS;

    private static boolean lIlllIlIllII(int n2, int n3) {
        return n2 < n3;
    }

    public static void cg() {
        block83: {
            Object lIIIIlIlIlIIll;
            BankLocation lIIIIlIlIlIlII2;
            block84: {
                block89: {
                    block86: {
                        block88: {
                            block87: {
                                block85: {
                                    if (K.lIlllIlIlIll(bv ? 1 : 0)) {
                                        b.a(bx);
                                        if (K.lIlllIlIllII(bx.size(), llIlllIlI[0])) {
                                            System.out.println(llIlllIII[llIlllIlI[1]]);
                                            bv = llIlllIlI[1];
                                        }
                                    }
                                    if (!K.lIlllIlIllIl(bv ? 1 : 0)) break block83;
                                    if (K.lIlllIlIllII(Skills.getLevel((Skill)Skill.MAGIC), llIlllIlI[2])) {
                                        m.ak();
                                    }
                                    if (K.lIlllIlIlllI(Skills.getLevel((Skill)Skill.MAGIC), llIlllIlI[2]) && K.lIlllIlIllII(Skills.getLevel((Skill)Skill.PRAYER), llIlllIlI[3])) {
                                        aq.ea();
                                    }
                                    if (K.lIlllIlIlllI(Skills.getLevel((Skill)Skill.PRAYER), llIlllIlI[3]) && K.lIlllIlIlIll(Inventory.contains((int[])f.bh) ? 1 : 0)) {
                                        Inventory.getFirst((int[])f.bh).interact(llIlllIII[llIlllIlI[0]]);
                                    }
                                    if (!K.lIlllIlIllIl(K.an() ? 1 : 0) || !K.lIlllIlIllII(e.j(fX), llIlllIlI[0]) || !K.lIlllIlIlllI(Skills.getLevel((Skill)Skill.MAGIC), llIlllIlI[2]) || !K.lIlllIlIlllI(Skills.getLevel((Skill)Skill.PRAYER), llIlllIlI[3])) break block84;
                                    lIIIIlIlIlIlII2 = BankLocation.getNearest();
                                    if (K.lIlllIlIllll(lIIIIlIlIlIlII2) && K.lIlllIlIllIl(lIIIIlIlIlIlII2.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                        AccBuilderGWD.c = llIlllIII[llIlllIlI[4]];
                                        a.a(lIIIIlIlIlIlII2);
                                    }
                                    if (!K.lIlllIlIllll(lIIIIlIlIlIlII2) || !K.lIlllIlIlIll(lIIIIlIlIlIlII2.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block84;
                                    if (K.lIlllIlIllIl(Bank.isOpen() ? 1 : 0)) {
                                        a.a();
                                        Time.sleepUntil(() -> Bank.isOpen(), (int)llIlllIlI[5]);
                                        0;
                                    }
                                    if (!K.lIlllIlIlIll(Bank.isOpen() ? 1 : 0)) break block84;
                                    AccBuilderGWD.c = llIlllIII[llIlllIlI[6]];
                                    if (K.lIlllIllIIII(Inventory.getAll().size())) {
                                        Bank.depositInventory();
                                        Time.sleepTicks((int)llIlllIlI[7]);
                                        0;
                                    }
                                    if (K.lIlllIllIIII(Equipment.getAll().size())) {
                                        Bank.depositEquipment();
                                        Time.sleepTicks((int)llIlllIlI[4]);
                                        0;
                                    }
                                    int[] nArray = new int[llIlllIlI[0]];
                                    nArray[K.llIlllIlI[1]] = llIlllIlI[8];
                                    if (!K.lIlllIlIlIll(Bank.contains((int[])nArray) ? 1 : 0)) break block85;
                                    int[] nArray2 = new int[llIlllIlI[0]];
                                    nArray2[K.llIlllIlI[1]] = llIlllIlI[8];
                                    if (!K.lIlllIlIlllI(Bank.getFirst((int[])nArray2).getQuantity(), llIlllIlI[9])) break block86;
                                }
                                int[] nArray = new int[llIlllIlI[0]];
                                nArray[K.llIlllIlI[1]] = llIlllIlI[10];
                                if (!K.lIlllIlIlIll(Bank.contains((int[])nArray) ? 1 : 0)) break block87;
                                int[] nArray3 = new int[llIlllIlI[0]];
                                nArray3[K.llIlllIlI[1]] = llIlllIlI[10];
                                if (!K.lIlllIlIlllI(Bank.getFirst((int[])nArray3).getQuantity(), llIlllIlI[9])) break block86;
                            }
                            int[] nArray = new int[llIlllIlI[0]];
                            nArray[K.llIlllIlI[1]] = llIlllIlI[11];
                            if (!K.lIlllIlIlIll(Bank.contains((int[])nArray) ? 1 : 0)) break block88;
                            int[] nArray4 = new int[llIlllIlI[0]];
                            nArray4[K.llIlllIlI[1]] = llIlllIlI[11];
                            if (!K.lIlllIlIlllI(Bank.getFirst((int[])nArray4).getQuantity(), llIlllIlI[9])) break block86;
                        }
                        int[] nArray = new int[llIlllIlI[0]];
                        nArray[K.llIlllIlI[1]] = llIlllIlI[12];
                        if (!K.lIlllIlIlIll(Bank.contains((int[])nArray) ? 1 : 0)) break block89;
                        int[] nArray5 = new int[llIlllIlI[0]];
                        nArray5[K.llIlllIlI[1]] = llIlllIlI[12];
                        if (!K.lIlllIlIllII(Bank.getFirst((int[])nArray5).getQuantity(), llIlllIlI[13])) break block89;
                    }
                    K.Q();
                    System.out.println(llIlllIII[llIlllIlI[7]]);
                    bv = llIlllIlI[0];
                    return;
                }
                int[] nArray = new int[llIlllIlI[13]];
                nArray[K.llIlllIlI[1]] = llIlllIlI[14];
                nArray[K.llIlllIlI[0]] = llIlllIlI[12];
                nArray[K.llIlllIlI[4]] = llIlllIlI[15];
                nArray[K.llIlllIlI[6]] = llIlllIlI[11];
                nArray[K.llIlllIlI[7]] = llIlllIlI[10];
                nArray[K.llIlllIlI[16]] = llIlllIlI[8];
                if (K.lIlllIlIllIl(e.d(nArray) ? 1 : 0)) {
                    K.Q();
                    System.out.println(llIlllIII[llIlllIlI[16]]);
                    bv = llIlllIlI[0];
                    return;
                }
                while (K.lIlllIlIllIl(H.bT() ? 1 : 0)) {
                    H.bR();
                    Time.sleepTicks((int)llIlllIlI[0]);
                    0;
                    0;
                    if (3 >= 3) continue;
                    return;
                }
                if (K.lIlllIlIllIl(Bank.isOpen() ? 1 : 0)) {
                    a.a();
                    Time.sleepTicks((int)llIlllIlI[13]);
                    0;
                }
                int[] nArray6 = new int[llIlllIlI[17]];
                nArray6[K.llIlllIlI[1]] = llIlllIlI[14];
                nArray6[K.llIlllIlI[0]] = llIlllIlI[12];
                nArray6[K.llIlllIlI[4]] = llIlllIlI[15];
                nArray6[K.llIlllIlI[6]] = llIlllIlI[18];
                nArray6[K.llIlllIlI[7]] = llIlllIlI[11];
                nArray6[K.llIlllIlI[16]] = llIlllIlI[10];
                nArray6[K.llIlllIlI[13]] = llIlllIlI[8];
                if (K.lIlllIlIlIll(e.d(nArray6) ? 1 : 0)) {
                    a.a(llIlllIlI[18], llIlllIlI[7]);
                    a.b(f.aU, llIlllIlI[0]);
                    a.a(llIlllIlI[12], llIlllIlI[13]);
                    a.a(llIlllIlI[19], llIlllIlI[20]);
                    a.a(llIlllIlI[15], llIlllIlI[6]);
                    a.a(llIlllIlI[14], llIlllIlI[21]);
                    int[] nArray7 = new int[llIlllIlI[0]];
                    nArray7[K.llIlllIlI[1]] = llIlllIlI[8];
                    if (K.lIlllIlIlIll(Bank.contains((int[])nArray7) ? 1 : 0)) {
                        int[] nArray8 = new int[llIlllIlI[0]];
                        nArray8[K.llIlllIlI[1]] = llIlllIlI[8];
                        if (K.lIlllIlIllII(Inventory.getCount((int[])nArray8), llIlllIlI[0])) {
                            Bank.withdraw((int)llIlllIlI[8], (int)llIlllIlI[22], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                            Time.sleepTicks((int)llIlllIlI[0]);
                            0;
                            Time.sleepUntil(() -> {
                                boolean bl;
                                int[] nArray = new int[llIlllIlI[0]];
                                nArray[K.llIlllIlI[1]] = llIlllIlI[8];
                                if (K.lIlllIllIIII(Inventory.getCount((int[])nArray))) {
                                    bl = llIlllIlI[0];
                                    0;
                                    if (2 < ((0x52 ^ 0x2F ^ (0xA5 ^ 0x85)) & (0xC ^ 4 ^ (0x1F ^ 0x4A) ^ -1))) {
                                        return ((0xBE ^ 0x87 ^ (0xE3 ^ 0x84)) & (10 + 56 - -86 + 42 ^ 87 + 35 - 46 + 80 ^ -1)) != 0;
                                    }
                                } else {
                                    bl = llIlllIlI[1];
                                }
                                return bl;
                            }, (int)llIlllIlI[5]);
                            0;
                        }
                    }
                    int[] nArray9 = new int[llIlllIlI[0]];
                    nArray9[K.llIlllIlI[1]] = llIlllIlI[11];
                    if (K.lIlllIlIlIll(Bank.contains((int[])nArray9) ? 1 : 0)) {
                        int[] nArray10 = new int[llIlllIlI[0]];
                        nArray10[K.llIlllIlI[1]] = llIlllIlI[11];
                        if (K.lIlllIlIllII(Inventory.getCount((int[])nArray10), llIlllIlI[0])) {
                            Bank.withdraw((int)llIlllIlI[11], (int)llIlllIlI[23], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                            Time.sleepTicks((int)llIlllIlI[0]);
                            0;
                            Time.sleepUntil(() -> {
                                boolean bl;
                                int[] nArray = new int[llIlllIlI[0]];
                                nArray[K.llIlllIlI[1]] = llIlllIlI[11];
                                if (K.lIlllIllIIII(Inventory.getCount((int[])nArray))) {
                                    bl = llIlllIlI[0];
                                    0;
                                    if (1 <= 0) {
                                        return ((0x54 ^ 0x16 ^ (0xE1 ^ 0x83)) & (0xEA ^ 0x9E ^ (0x6D ^ 0x39) ^ -1)) != 0;
                                    }
                                } else {
                                    bl = llIlllIlI[1];
                                }
                                return bl;
                            }, (int)llIlllIlI[5]);
                            0;
                        }
                    }
                    if (K.lIlllIlIllII(Skills.getLevel((Skill)Skill.MAGIC), llIlllIlI[2])) {
                        a.a(llIlllIlI[10], llIlllIlI[22]);
                    }
                }
            }
            if (K.lIlllIlIlIll(Inventory.contains((int[])f.bc) ? 1 : 0) && K.lIlllIlIllII(Movement.getRunEnergy(), llIlllIlI[24])) {
                Inventory.getFirst((int[])f.bc).interact(llIlllIII[llIlllIlI[13]]);
                Time.sleepTicks((int)llIlllIlI[0]);
                0;
            }
            if (K.lIlllIllIIIl(K.lIlllIlIlIlI(e.w(), 50.0))) {
                int[] nArray = new int[llIlllIlI[0]];
                nArray[K.llIlllIlI[1]] = llIlllIlI[19];
                if (K.lIlllIlIlIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    int[] nArray11 = new int[llIlllIlI[0]];
                    nArray11[K.llIlllIlI[1]] = llIlllIlI[19];
                    Inventory.getFirst((int[])nArray11).interact(llIlllIII[llIlllIlI[17]]);
                    Time.sleepTicks((int)llIlllIlI[0]);
                    0;
                }
            }
            if (K.lIlllIlIlIll(K.an() ? 1 : 0) && K.lIlllIlIllII(e.j(fX), llIlllIlI[0])) {
                if (K.lIlllIlIllIl(fY.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    K.ch();
                }
                if (K.lIlllIlIlIll(fY.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    g.a(llIlllIII[llIlllIlI[20]], cG);
                }
            }
            if ((!K.lIlllIllIIlI(e.j(fX), llIlllIlI[0]) || !K.lIlllIllIIlI(e.j(fX), llIlllIlI[4]) || K.lIlllIllIIll(e.j(fX), llIlllIlI[6])) && K.lIlllIlIllIl(fY.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && K.lIlllIlIllIl(fZ.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                if (K.lIlllIllIlII(Players.getLocal().getWorldLocation().distanceTo(fO), llIlllIlI[20]) && K.lIlllIlIllIl(Dialog.isOpen() ? 1 : 0)) {
                    AccBuilderGWD.c = llIlllIII[llIlllIlI[25]];
                    Movement.walkTo((WorldPoint)fO);
                    0;
                    Time.sleepTicks((int)llIlllIlI[0]);
                    0;
                }
                if (K.lIlllIllIlIl(Players.getLocal().getWorldLocation().distanceTo(fO), llIlllIlI[20])) {
                    g.a(llIlllIII[llIlllIlI[21]], cG);
                }
            }
            if (K.lIlllIllIIll(e.j(fX), llIlllIlI[7])) {
                dk = llIlllIlI[1];
                if (K.lIlllIlIllIl(Vars.getBit((int)llIlllIlI[26]))) {
                    if (K.lIlllIllIlII(Players.getLocal().getWorldLocation().distanceTo(fQ), llIlllIlI[7])) {
                        AccBuilderGWD.c = llIlllIII[llIlllIlI[27]];
                        Movement.walkTo((WorldPoint)fQ);
                        0;
                        Time.sleepTicks((int)llIlllIlI[0]);
                        0;
                    }
                    if (K.lIlllIllIlIl(Players.getLocal().getWorldLocation().distanceTo(fQ), llIlllIlI[7])) {
                        String[] stringArray = new String[llIlllIlI[0]];
                        stringArray[K.llIlllIlI[1]] = llIlllIII[llIlllIlI[28]];
                        String[] stringArray2 = new String[llIlllIlI[0]];
                        stringArray2[K.llIlllIlI[1]] = llIlllIII[llIlllIlI[2]];
                        if (K.lIlllIlIlIll(TileObjects.getNearest((String[])stringArray).hasAction(stringArray2) ? 1 : 0)) {
                            String[] stringArray3 = new String[llIlllIlI[0]];
                            stringArray3[K.llIlllIlI[1]] = llIlllIII[llIlllIlI[29]];
                            TileObjects.getNearest((String[])stringArray3).interact(llIlllIII[llIlllIlI[30]]);
                            Time.sleepTicks((int)llIlllIlI[6]);
                            0;
                        }
                        String[] stringArray4 = new String[llIlllIlI[0]];
                        stringArray4[K.llIlllIlI[1]] = llIlllIII[llIlllIlI[31]];
                        String[] stringArray5 = new String[llIlllIlI[0]];
                        stringArray5[K.llIlllIlI[1]] = llIlllIII[llIlllIlI[32]];
                        if (K.lIlllIlIllIl(TileObjects.getNearest((String[])stringArray4).hasAction(stringArray5) ? 1 : 0)) {
                            g.a(llIlllIII[llIlllIlI[33]], cG);
                        }
                    }
                }
                if (K.lIlllIllIIll(Vars.getBit((int)llIlllIlI[26]), llIlllIlI[0]) && K.lIlllIlIllIl(Vars.getBit((int)llIlllIlI[34]))) {
                    if (K.lIlllIllIlII(Players.getLocal().getWorldLocation().distanceTo(fR), llIlllIlI[13])) {
                        AccBuilderGWD.c = llIlllIII[llIlllIlI[35]];
                        Movement.walkTo((WorldPoint)fR);
                        0;
                        Time.sleepTicks((int)llIlllIlI[0]);
                        0;
                    }
                    if (K.lIlllIllIlIl(Players.getLocal().getWorldLocation().distanceTo(fR), llIlllIlI[13])) {
                        g.a(llIlllIII[llIlllIlI[36]], cG);
                    }
                }
                if (K.lIlllIllIIll(Vars.getBit((int)llIlllIlI[26]), llIlllIlI[0]) && K.lIlllIllIIll(Vars.getBit((int)llIlllIlI[34]), llIlllIlI[0]) && K.lIlllIlIllIl(Vars.getBit((int)llIlllIlI[37]))) {
                    if (K.lIlllIllIlII(Players.getLocal().getWorldLocation().distanceTo(fS), llIlllIlI[13])) {
                        AccBuilderGWD.c = llIlllIII[llIlllIlI[38]];
                        Movement.walkTo((WorldPoint)fS);
                        0;
                        Time.sleepTicks((int)llIlllIlI[0]);
                        0;
                    }
                    if (K.lIlllIllIlIl(Players.getLocal().getWorldLocation().distanceTo(fS), llIlllIlI[13])) {
                        g.a(llIlllIII[llIlllIlI[39]], cG);
                    }
                }
                if (K.lIlllIllIIll(Vars.getBit((int)llIlllIlI[26]), llIlllIlI[0]) && K.lIlllIllIIll(Vars.getBit((int)llIlllIlI[34]), llIlllIlI[0]) && K.lIlllIllIIll(Vars.getBit((int)llIlllIlI[37]), llIlllIlI[0])) {
                    if (K.lIlllIllIlII(Players.getLocal().getWorldLocation().distanceTo(fT), llIlllIlI[4])) {
                        AccBuilderGWD.c = llIlllIII[llIlllIlI[40]];
                        Movement.walkTo((WorldPoint)fT);
                        0;
                        Time.sleepTicks((int)llIlllIlI[0]);
                        0;
                    }
                    if (K.lIlllIllIlIl(Players.getLocal().getWorldLocation().distanceTo(fT), llIlllIlI[4])) {
                        AccBuilderGWD.c = llIlllIII[llIlllIlI[41]];
                        if (K.lIlllIlIllIl(Dialog.isOpen() ? 1 : 0)) {
                            String[] stringArray = new String[llIlllIlI[0]];
                            stringArray[K.llIlllIlI[1]] = llIlllIII[llIlllIlI[42]];
                            TileObjects.getNearest((String[])stringArray).interact(llIlllIII[llIlllIlI[43]]);
                            Time.sleepTicks((int)llIlllIlI[6]);
                            0;
                        }
                        int lIIIIlIlIlIlII2 = Vars.getBit((int)llIlllIlI[44]);
                        lIIIIlIlIlIIll = Dialog.getOptions();
                        if (K.lIlllIlIllIl(lIIIIlIlIlIIll.isEmpty() ? 1 : 0)) {
                            System.out.println("Selecting " + lIIIIlIlIlIlII2);
                            if (K.lIlllIlIllIl(lIIIIlIlIlIlII2)) {
                                String[] stringArray = new String[llIlllIlI[0]];
                                stringArray[K.llIlllIlI[1]] = llIlllIII[llIlllIlI[45]];
                                Dialog.chooseOption((String[])stringArray);
                                0;
                            }
                            if (K.lIlllIllIIll(lIIIIlIlIlIlII2, llIlllIlI[0])) {
                                String[] stringArray = new String[llIlllIlI[0]];
                                stringArray[K.llIlllIlI[1]] = llIlllIII[llIlllIlI[46]];
                                Dialog.chooseOption((String[])stringArray);
                                0;
                            }
                            if (K.lIlllIllIIll(lIIIIlIlIlIlII2, llIlllIlI[4])) {
                                String[] stringArray = new String[llIlllIlI[0]];
                                stringArray[K.llIlllIlI[1]] = llIlllIII[llIlllIlI[47]];
                                Dialog.chooseOption((String[])stringArray);
                                0;
                            }
                            if (K.lIlllIllIIll(lIIIIlIlIlIlII2, llIlllIlI[6])) {
                                String[] stringArray = new String[llIlllIlI[0]];
                                stringArray[K.llIlllIlI[1]] = llIlllIII[llIlllIlI[48]];
                                Dialog.chooseOption((String[])stringArray);
                                0;
                            }
                            Time.sleepTicks((int)llIlllIlI[4]);
                            0;
                        }
                    }
                }
            }
            if (K.lIlllIllIIll(e.j(fX), llIlllIlI[16])) {
                lIIIIlIlIlIlII2 = new WorldArea(llIlllIlI[49], llIlllIlI[50], llIlllIlI[17], llIlllIlI[16], llIlllIlI[1]);
                if (K.lIlllIlIllIl(Players.getLocal().getWorldLocation().getPlane())) {
                    lIIIIlIlIlIIll = new WorldArea(llIlllIlI[51], llIlllIlI[50], llIlllIlI[28], llIlllIlI[13], llIlllIlI[1]);
                    WorldArea lIIIIlIlIlIIlI = new WorldArea(llIlllIlI[51], llIlllIlI[52], llIlllIlI[7], llIlllIlI[16], llIlllIlI[1]);
                    WorldArea lIIIIlIlIlIIIl = new WorldArea(llIlllIlI[53], llIlllIlI[54], llIlllIlI[7], llIlllIlI[4], llIlllIlI[1]);
                    WorldArea lIIIIlIlIlIIII = new WorldArea(llIlllIlI[53], llIlllIlI[52], llIlllIlI[6], llIlllIlI[6], llIlllIlI[1]);
                    if (K.lIlllIllIlII(Players.getLocal().getWorldLocation().distanceTo(fU), llIlllIlI[4]) && K.lIlllIlIllIl(lIIIIlIlIlIIll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && K.lIlllIlIllIl(lIIIIlIlIlIIlI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && K.lIlllIlIllIl(lIIIIlIlIlIIIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && K.lIlllIlIllIl(lIIIIlIlIlIIII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderGWD.c = llIlllIII[llIlllIlI[55]];
                        Movement.walkTo((WorldPoint)fU);
                        0;
                        Time.sleepTicks((int)llIlllIlI[0]);
                        0;
                    }
                    if (K.lIlllIllIlIl(Players.getLocal().getWorldLocation().distanceTo(fU), llIlllIlI[4]) && K.lIlllIlIllIl(lIIIIlIlIlIlII2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        String[] stringArray = new String[llIlllIlI[0]];
                        stringArray[K.llIlllIlI[1]] = llIlllIII[llIlllIlI[56]];
                        TileObjects.getNearest((String[])stringArray).interact(llIlllIII[llIlllIlI[57]]);
                        Time.sleepTicks((int)llIlllIlI[4]);
                        0;
                    }
                    if (K.lIlllIlIlIll(lIIIIlIlIlIlII2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        if (K.lIlllIllIlII(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llIlllIlI[58], llIlllIlI[59], llIlllIlI[1])), llIlllIlI[4])) {
                            Movement.walkTo((WorldPoint)new WorldPoint(llIlllIlI[58], llIlllIlI[59], llIlllIlI[1]));
                            0;
                            Time.sleepTicks((int)llIlllIlI[0]);
                            0;
                        }
                        if (K.lIlllIllIlIl(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llIlllIlI[58], llIlllIlI[59], llIlllIlI[1])), llIlllIlI[4])) {
                            String[] stringArray = new String[llIlllIlI[0]];
                            stringArray[K.llIlllIlI[1]] = llIlllIII[llIlllIlI[60]];
                            String[] stringArray6 = new String[llIlllIlI[0]];
                            stringArray6[K.llIlllIlI[1]] = llIlllIII[llIlllIlI[61]];
                            if (K.lIlllIlIlIll(TileObjects.getNearest((String[])stringArray).hasAction(stringArray6) ? 1 : 0)) {
                                String[] stringArray7 = new String[llIlllIlI[0]];
                                stringArray7[K.llIlllIlI[1]] = llIlllIII[llIlllIlI[62]];
                                TileObjects.getNearest((String[])stringArray7).interact(llIlllIII[llIlllIlI[63]]);
                                Time.sleepTicks((int)llIlllIlI[4]);
                                0;
                            }
                            String[] stringArray8 = new String[llIlllIlI[0]];
                            stringArray8[K.llIlllIlI[1]] = llIlllIII[llIlllIlI[64]];
                            String[] stringArray9 = new String[llIlllIlI[0]];
                            stringArray9[K.llIlllIlI[1]] = llIlllIII[llIlllIlI[65]];
                            if (K.lIlllIlIllIl(TileObjects.getNearest((String[])stringArray8).hasAction(stringArray9) ? 1 : 0)) {
                                String[] stringArray10 = new String[llIlllIlI[0]];
                                stringArray10[K.llIlllIlI[1]] = llIlllIII[llIlllIlI[66]];
                                TileObjects.getNearest((String[])stringArray10).interact(llIlllIII[llIlllIlI[67]]);
                                Time.sleepTicks((int)llIlllIlI[16]);
                                0;
                            }
                        }
                        if (!K.lIlllIlIllIl(lIIIIlIlIlIIll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || !K.lIlllIlIllIl(lIIIIlIlIlIIlI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || !K.lIlllIlIllIl(lIIIIlIlIlIIIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || K.lIlllIlIlIll(lIIIIlIlIlIIII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            String[] stringArray = new String[llIlllIlI[0]];
                            stringArray[K.llIlllIlI[1]] = llIlllIII[llIlllIlI[68]];
                            TileObjects.getNearest((String[])stringArray).interact(llIlllIII[llIlllIlI[69]]);
                            Time.sleepTicks((int)llIlllIlI[16]);
                            0;
                        }
                    }
                }
                if (K.lIlllIllIIll(Players.getLocal().getWorldLocation().getPlane(), llIlllIlI[0])) {
                    AccBuilderGWD.c = llIlllIII[llIlllIlI[70]];
                    String[] stringArray = new String[llIlllIlI[0]];
                    stringArray[K.llIlllIlI[1]] = llIlllIII[llIlllIlI[3]];
                    if (K.lIlllIlIllll(TileObjects.getNearest((String[])stringArray))) {
                        String[] stringArray11 = new String[llIlllIlI[0]];
                        stringArray11[K.llIlllIlI[1]] = llIlllIII[llIlllIlI[71]];
                        TileObjects.getNearest((String[])stringArray11).interact(llIlllIII[llIlllIlI[72]]);
                        Time.sleepTicks((int)llIlllIlI[16]);
                        0;
                    }
                    String[] stringArray12 = new String[llIlllIlI[0]];
                    stringArray12[K.llIlllIlI[1]] = llIlllIII[llIlllIlI[73]];
                    if (K.lIlllIlIllll(TileObjects.getNearest((String[])stringArray12))) {
                        String[] stringArray13 = new String[llIlllIlI[0]];
                        stringArray13[K.llIlllIlI[1]] = llIlllIII[llIlllIlI[74]];
                        TileObjects.getNearest((String[])stringArray13).interact(llIlllIII[llIlllIlI[24]]);
                        Time.sleepTicks((int)llIlllIlI[4]);
                        0;
                    }
                }
            }
            if (K.lIlllIllIIll(e.j(fX), llIlllIlI[13])) {
                if (K.lIlllIlIllIl(fY.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    K.ch();
                }
                if (K.lIlllIlIlIll(fY.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    g.a(llIlllIII[llIlllIlI[75]], cG);
                }
            }
            if (K.lIlllIllIIll(e.j(fX), llIlllIlI[17])) {
                if (K.lIlllIllIlII(Players.getLocal().getWorldLocation().distanceTo(fW), llIlllIlI[25])) {
                    AccBuilderGWD.c = llIlllIII[llIlllIlI[76]];
                    Movement.walkTo((WorldPoint)fW);
                    0;
                    Time.sleepTicks((int)llIlllIlI[4]);
                    0;
                }
                if (K.lIlllIllIlIl(Players.getLocal().getWorldLocation().distanceTo(fW), llIlllIlI[25])) {
                    if (K.lIlllIlIllIl(m.ap() ? 1 : 0)) {
                        m.aq();
                    }
                    String[] stringArray = new String[llIlllIlI[0]];
                    stringArray[K.llIlllIlI[1]] = llIlllIII[llIlllIlI[77]];
                    lIIIIlIlIlIlII2 = NPCs.getNearest((String[])stringArray);
                    lIIIIlIlIlIIll = NPCs.getNearest(nPC -> {
                        int n2;
                        if (K.lIlllIlIlIll(nPC.getName().contains(llIlllIII[llIlllIlI[111]]) ? 1 : 0) && K.lIlllIllIlll(nPC.getInteracting(), Players.getLocal())) {
                            n2 = llIlllIlI[0];
                            0;
                            if ((0x34 ^ 0x30) <= 3) {
                                return false;
                            }
                        } else {
                            n2 = llIlllIlI[1];
                        }
                        return n2 != 0;
                    });
                    if (K.lIlllIlIllll(lIIIIlIlIlIlII2) && K.lIlllIllIllI(lIIIIlIlIlIIll)) {
                        String[] stringArray14 = new String[llIlllIlI[0]];
                        stringArray14[K.llIlllIlI[1]] = llIlllIII[llIlllIlI[78]];
                        if (K.lIlllIlIllIl(lIIIIlIlIlIlII2.hasAction(stringArray14) ? 1 : 0)) {
                            g.a(llIlllIII[llIlllIlI[79]], cG);
                        }
                        String[] stringArray15 = new String[llIlllIlI[0]];
                        stringArray15[K.llIlllIlI[1]] = llIlllIII[llIlllIlI[80]];
                        if (K.lIlllIlIlIll(lIIIIlIlIlIlII2.hasAction(stringArray15) ? 1 : 0) && K.lIlllIllIllI(Players.getLocal().getInteracting())) {
                            AccBuilderGWD.c = llIlllIII[llIlllIlI[81]];
                            if (K.lIlllIlIllIl(Prayers.isEnabled((Prayer)Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                                Prayers.toggle((Prayer)Prayer.PROTECT_FROM_MELEE);
                            }
                        }
                    }
                    if (K.lIlllIlIllII(Prayers.getPoints(), llIlllIlI[40]) && K.lIlllIlIlIll(Inventory.contains((int[])f.aZ) ? 1 : 0)) {
                        Inventory.getFirst((int[])f.aZ).interact(llIlllIII[llIlllIlI[82]]);
                        Time.sleepTicks((int)llIlllIlI[0]);
                        0;
                    }
                    g.a(cG);
                }
            }
            if (K.lIlllIllIIll(e.j(fX), llIlllIlI[20])) {
                String[] stringArray = new String[llIlllIlI[0]];
                stringArray[K.llIlllIlI[1]] = llIlllIII[llIlllIlI[83]];
                if (K.lIlllIlIllIl(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    AccBuilderGWD.c = llIlllIII[llIlllIlI[84]];
                    String[] stringArray16 = new String[llIlllIlI[0]];
                    stringArray16[K.llIlllIlI[1]] = llIlllIII[llIlllIlI[85]];
                    TileItems.getNearest((String[])stringArray16).interact(llIlllIII[llIlllIlI[86]]);
                    Time.sleepTicks((int)llIlllIlI[7]);
                    0;
                }
                String[] stringArray17 = new String[llIlllIlI[0]];
                stringArray17[K.llIlllIlI[1]] = llIlllIII[llIlllIlI[87]];
                if (K.lIlllIlIlIll(Inventory.contains((String[])stringArray17) ? 1 : 0)) {
                    if (K.lIlllIlIlIll(Prayers.isEnabled((Prayer)Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                        Prayers.toggle((Prayer)Prayer.PROTECT_FROM_MELEE);
                    }
                    if (K.lIlllIlIllIl(fY.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        K.ch();
                    }
                    if (K.lIlllIlIlIll(fY.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        if (K.lIlllIlIllII(dk, llIlllIlI[0])) {
                            as.nf += llIlllIlI[0];
                            as.u(AccBuilderGWD.m);
                            dk += llIlllIlI[0];
                            as.nf = llIlllIlI[1];
                            dl = llIlllIlI[1];
                        }
                        g.a(llIlllIII[llIlllIlI[88]], cG);
                    }
                }
            }
            g.a(cG);
        }
    }

    /*
     * WARNING - void declaration
     */
    private static void ch() {
        if (K.lIlllIllIlII(Players.getLocal().getWorldLocation().distanceTo(fN), llIlllIlI[4])) {
            void lIIIIlIlIIlIII;
            void lIIIIlIlIIlIIl;
            void lIIIIlIlIIlIll;
            AccBuilderGWD.c = llIlllIII[llIlllIlI[89]];
            WorldArea worldArea = new WorldArea(llIlllIlI[90], llIlllIlI[91], llIlllIlI[92], llIlllIlI[93], llIlllIlI[1]);
            WorldPoint worldPoint = new WorldPoint(llIlllIlI[94], llIlllIlI[95], llIlllIlI[1]);
            WorldArea worldArea2 = new WorldArea(llIlllIlI[96], llIlllIlI[97], llIlllIlI[35], llIlllIlI[7], llIlllIlI[1]);
            WorldArea worldArea3 = new WorldArea(llIlllIlI[98], llIlllIlI[99], llIlllIlI[20], llIlllIlI[16], llIlllIlI[1]);
            if (K.lIlllIlIlIll(Dialog.isOpen() ? 1 : 0)) {
                Dialog.close();
            }
            if (K.lIlllIlIllIl(lIIIIlIlIIlIll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                Equipment.getFirst((int[])f.aU).interact(llIlllIII[llIlllIlI[100]]);
                Time.sleepTicks((int)llIlllIlI[16]);
                0;
            }
            if (K.lIlllIlIllIl(N.jx.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                Movement.walkTo((WorldPoint)N.jy);
                0;
            }
            if (K.lIlllIlIlIll(N.jx.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && K.lIlllIlIllIl(lIIIIlIlIIlIIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && K.lIlllIlIllIl(lIIIIlIlIIlIII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && K.lIlllIlIllIl(fY.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && K.lIlllIlIllIl(fZ.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                Walker.stepAlong(List.of(N.iD));
                0;
                Time.sleepTicks((int)llIlllIlI[0]);
                0;
            }
            if (!K.lIlllIlIllIl(lIIIIlIlIIlIIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || K.lIlllIlIlIll(lIIIIlIlIIlIII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                String[] stringArray = new String[llIlllIlI[0]];
                stringArray[K.llIlllIlI[1]] = llIlllIII[llIlllIlI[101]];
                TileObjects.getNearest((String[])stringArray).interact(llIlllIII[llIlllIlI[102]]);
                Time.sleepTicks((int)llIlllIlI[7]);
                0;
            }
            if ((!K.lIlllIlIllIl(fY.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || K.lIlllIlIlIll(fZ.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) && K.lIlllIllIlII(Players.getLocal().getWorldLocation().distanceTo(fN), llIlllIlI[4])) {
                Movement.walkTo((WorldPoint)fN);
                0;
                Time.sleepTicks((int)llIlllIlI[0]);
                0;
            }
        }
    }

    @Override
    public boolean ae() {
        return llIlllIlI[1];
    }

    static {
        K.lIlllIlIlIIl();
        K.lIlllIlIlIII();
        fN = new WorldPoint(llIlllIlI[112], llIlllIlI[113], llIlllIlI[1]);
        fO = new WorldPoint(llIlllIlI[114], llIlllIlI[115], llIlllIlI[1]);
        fP = new WorldPoint(llIlllIlI[116], llIlllIlI[117], llIlllIlI[1]);
        fQ = new WorldPoint(llIlllIlI[118], llIlllIlI[119], llIlllIlI[1]);
        fR = new WorldPoint(llIlllIlI[120], llIlllIlI[121], llIlllIlI[1]);
        fS = new WorldPoint(llIlllIlI[122], llIlllIlI[123], llIlllIlI[1]);
        fT = new WorldPoint(llIlllIlI[124], llIlllIlI[125], llIlllIlI[1]);
        fU = new WorldPoint(llIlllIlI[124], llIlllIlI[126], llIlllIlI[1]);
        fV = new WorldPoint(llIlllIlI[127], llIlllIlI[54], llIlllIlI[1]);
        fW = new WorldPoint(llIlllIlI[128], llIlllIlI[129], llIlllIlI[1]);
        bx = new ArrayList<d>();
        String[] stringArray = new String[llIlllIlI[13]];
        stringArray[K.llIlllIlI[1]] = llIlllIII[llIlllIlI[130]];
        stringArray[K.llIlllIlI[0]] = llIlllIII[llIlllIlI[131]];
        stringArray[K.llIlllIlI[4]] = llIlllIII[llIlllIlI[132]];
        stringArray[K.llIlllIlI[6]] = llIlllIII[llIlllIlI[133]];
        stringArray[K.llIlllIlI[7]] = llIlllIII[llIlllIlI[134]];
        stringArray[K.llIlllIlI[16]] = llIlllIII[llIlllIlI[135]];
        cG = stringArray;
        fX = llIlllIlI[136];
        fY = new WorldArea(llIlllIlI[137], llIlllIlI[113], llIlllIlI[21], llIlllIlI[13], llIlllIlI[1]);
        fZ = new WorldArea(llIlllIlI[138], llIlllIlI[139], llIlllIlI[48], llIlllIlI[30], llIlllIlI[1]);
    }

    private static boolean lIlllIllIIII(int n2) {
        return n2 > 0;
    }

    @Override
    public String ag() {
        return llIlllIII[llIlllIlI[109]];
    }

    private static boolean lIlllIllIlIl(int n2, int n3) {
        return n2 <= n3;
    }

    private static String lIlllIIlllII(String lIIIIlIIIlIlll, String lIIIIlIIIlIllI) {
        lIIIIlIIIlIlll = new String(Base64.getDecoder().decode(lIIIIlIIIlIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lIIIIlIIIlIlIl = new StringBuilder();
        char[] lIIIIlIIIlIlII = lIIIIlIIIlIllI.toCharArray();
        int lIIIIlIIIlIIll = llIlllIlI[1];
        char[] lIIIIlIIIIllIl = lIIIIlIIIlIlll.toCharArray();
        int lIIIIlIIIIllII = lIIIIlIIIIllIl.length;
        int lIIIIlIIIIlIll = llIlllIlI[1];
        while (K.lIlllIlIllII(lIIIIlIIIIlIll, lIIIIlIIIIllII)) {
            char lIIIIlIIIllIII = lIIIIlIIIIllIl[lIIIIlIIIIlIll];
            lIIIIlIIIlIlIl.append((char)(lIIIIlIIIllIII ^ lIIIIlIIIlIlII[lIIIIlIIIlIIll % lIIIIlIIIlIlII.length]));
            0;
            ++lIIIIlIIIlIIll;
            ++lIIIIlIIIIlIll;
            0;
            if (-1 < 1) continue;
            return null;
        }
        return String.valueOf(lIIIIlIIIlIlIl);
    }

    private static boolean lIlllIllIIlI(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean lIlllIllIlll(Object object, Object object2) {
        return object == object2;
    }

    @Override
    public boolean ah() {
        boolean bl;
        if (K.lIlllIlIlllI(e.j(fX), llIlllIlI[25])) {
            bl = llIlllIlI[0];
            0;
            if ((0x48 ^ 0x45 ^ (0x24 ^ 0x2D)) < 0) {
                return ((0x1E ^ 4 ^ (0x42 ^ 0x44)) & (0x79 ^ 0x19 ^ (7 ^ 0x7B) ^ -1)) != 0;
            }
        } else {
            bl = llIlllIlI[1];
        }
        return bl;
    }

    private static String lIlllIIllIlI(String lIIIIlIIllIIlI, String lIIIIlIIllIIll) {
        try {
            SecretKeySpec lIIIIlIIllIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIIIIlIIllIIll.getBytes(StandardCharsets.UTF_8)), llIlllIlI[20]), "DES");
            Cipher lIIIIlIIllIllI = Cipher.getInstance("DES");
            lIIIIlIIllIllI.init(llIlllIlI[4], lIIIIlIIllIlll);
            return new String(lIIIIlIIllIllI.doFinal(Base64.getDecoder().decode(lIIIIlIIllIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIIIIlIIllIlIl) {
            lIIIIlIIllIlIl.printStackTrace();
            return null;
        }
    }

    private static void lIlllIlIlIIl() {
        llIlllIlI = new int[141];
        K.llIlllIlI[0] = 1;
        K.llIlllIlI[1] = (0x46 ^ 0x50 ^ (0x15 ^ 0x26)) & (0x56 ^ 0x35 ^ (0x40 ^ 6) ^ -1);
        K.llIlllIlI[2] = 0x39 ^ 0x34;
        K.llIlllIlI[3] = 42 + 136 - 85 + 87 ^ 65 + 126 - 135 + 97;
        K.llIlllIlI[4] = 2;
        K.llIlllIlI[5] = -(0xFFFFDD6D & 0x2EFA) & (0xFFFFBFEF & 0x5FFF);
        K.llIlllIlI[6] = 3;
        K.llIlllIlI[7] = 0x8E ^ 0x8A;
        K.llIlllIlI[8] = -(0xFFFFF4CF & 0x7BF1) & (0xFFFFF2FE & 0x7FEF);
        K.llIlllIlI[9] = -(0xFFFFFCFF & 0x3F17) & (0xFFFFBFFF & 0x7FFE);
        K.llIlllIlI[10] = -(0xFFFFFFFF & 0x5D81) & (0xFFFFFFFD & 0x5FAF);
        K.llIlllIlI[11] = -(0xFFFFEF1E & 0x3DF7) & (0xFFFFFFBF & 0x2F7F);
        K.llIlllIlI[12] = 0xFFFFF5FF & 0xFE7;
        K.llIlllIlI[13] = 0xDF ^ 0xC7 ^ (0x4F ^ 0x51);
        K.llIlllIlI[14] = -(0xFFFFEFBF & 0x30E9) & (0xFFFFFFEF & 0x3FFF);
        K.llIlllIlI[15] = 0xFFFFEFCA & 0x19B7;
        K.llIlllIlI[16] = 0xC0 ^ 0xC5;
        K.llIlllIlI[17] = 0x2E ^ 0x64 ^ (1 ^ 0x4C);
        K.llIlllIlI[18] = 0xFFFFB5D3 & 0x7B7D;
        K.llIlllIlI[19] = 0xFFFF857F & 0x7BFB;
        K.llIlllIlI[20] = 0xC ^ 4;
        K.llIlllIlI[21] = 0xB5 ^ 0x91 ^ (0x34 ^ 0x1A);
        K.llIlllIlI[22] = 0xFFFFD1FC & 0x2FF7;
        K.llIlllIlI[23] = -(0xFFFFCA37 & 0x7DEB) & (0xFFFFCFFE & 0x7DFF);
        K.llIlllIlI[24] = 0x8A ^ 0x9D ^ (0x57 ^ 0x72);
        K.llIlllIlI[25] = 0xC0 ^ 0xAD ^ (0x2C ^ 0x48);
        K.llIlllIlI[26] = 0xFFFF8E78 & 0x73DF;
        K.llIlllIlI[27] = 0x18 ^ 0x45 ^ (0x29 ^ 0x7F);
        K.llIlllIlI[28] = 0x56 ^ 0x71 ^ (0x5F ^ 0x74);
        K.llIlllIlI[29] = 23 + 75 - 77 + 122 ^ 106 + 51 - 91 + 63;
        K.llIlllIlI[30] = 155 + 152 - 168 + 25 ^ 162 + 61 - 145 + 93;
        K.llIlllIlI[31] = 0x9B ^ 0x8B;
        K.llIlllIlI[32] = 76 + 43 - 115 + 153 ^ 50 + 22 - 46 + 114;
        K.llIlllIlI[33] = 0x3C ^ 0x50 ^ (0x6E ^ 0x10);
        K.llIlllIlI[34] = -(0xFFFFAEDF & 0x7529) & (0xFFFFBFFF & 0x665F);
        K.llIlllIlI[35] = 0xA4 ^ 0xAE ^ (0x2C ^ 0x35);
        K.llIlllIlI[36] = 0x42 ^ 0x56;
        K.llIlllIlI[37] = 0xFFFFCBDB & 0x367D;
        K.llIlllIlI[38] = 0x65 ^ 0x70;
        K.llIlllIlI[39] = 0x78 ^ 0x6E;
        K.llIlllIlI[40] = 126 + 34 - 154 + 135 ^ 142 + 116 - 193 + 89;
        K.llIlllIlI[41] = 0x73 ^ 0x6B;
        K.llIlllIlI[42] = 125 + 47 - 124 + 94 ^ 103 + 19 - 68 + 97;
        K.llIlllIlI[43] = 0x44 ^ 0x5E;
        K.llIlllIlI[44] = -(75 + 104 - 155 + 106) & (0xFFFF93FB & 0x6EDF);
        K.llIlllIlI[45] = 1 ^ (0x51 ^ 0x4B);
        K.llIlllIlI[46] = 116 + 73 - 97 + 55 ^ 119 + 124 - 205 + 105;
        K.llIlllIlI[47] = 0x86 ^ 0xC3 ^ (0xEA ^ 0xB2);
        K.llIlllIlI[48] = 0xAD ^ 0xB3;
        K.llIlllIlI[49] = -(0xFFFFFCED & 0x4333) & (0xFFFFDDE9 & 0x6BFF);
        K.llIlllIlI[50] = -(0xFFFFFF59 & 0x73AF) & (0xFFFFFFFF & 0x7FBE);
        K.llIlllIlI[51] = 0xFFFF8DE5 & 0x7BDE;
        K.llIlllIlI[52] = -(0xFFFFB96F & 0x77D1) & (0xFFFFFFFF & 0x3DF3);
        K.llIlllIlI[53] = 0xFFFFDFFF & 0x29C6;
        K.llIlllIlI[54] = 0xFFFFBEB7 & 0x4DFD;
        K.llIlllIlI[55] = 0xBC ^ 0xA3;
        K.llIlllIlI[56] = 0x81 ^ 0xA1;
        K.llIlllIlI[57] = 0x52 ^ 0x73;
        K.llIlllIlI[58] = 0xFFFFBDEB & 0x4BDF;
        K.llIlllIlI[59] = -(0xFFFFDBD5 & 0x352B) & (0xFFFFBFBB & 0x5DFD);
        K.llIlllIlI[60] = 2 ^ 0x71 ^ (0x74 ^ 0x25);
        K.llIlllIlI[61] = 0x78 ^ 0x5B;
        K.llIlllIlI[62] = 0x6B ^ 0x55 ^ (0x9B ^ 0x81);
        K.llIlllIlI[63] = 95 + 9 - -26 + 34 ^ 32 + 43 - -42 + 12;
        K.llIlllIlI[64] = 0x85 ^ 0xA3;
        K.llIlllIlI[65] = 0xA ^ 0x2D;
        K.llIlllIlI[66] = 0xB0 ^ 0x98;
        K.llIlllIlI[67] = 0x11 ^ 0x38;
        K.llIlllIlI[68] = 0x23 ^ 0x2E ^ (0x12 ^ 0x35);
        K.llIlllIlI[69] = 0x6E ^ 0x45;
        K.llIlllIlI[70] = 0x29 ^ 0xF ^ (0xBB ^ 0xB1);
        K.llIlllIlI[71] = 120 + 56 - 89 + 45 ^ 28 + 48 - -68 + 26;
        K.llIlllIlI[72] = 2 ^ (0x63 ^ 0x4E);
        K.llIlllIlI[73] = 0x7C ^ 0x4C;
        K.llIlllIlI[74] = 0x89 ^ 0xB8;
        K.llIlllIlI[75] = 0xC2 ^ 0x8A ^ (0xE ^ 0x75);
        K.llIlllIlI[76] = 0x53 ^ 0x67;
        K.llIlllIlI[77] = 0x93 ^ 0xA6;
        K.llIlllIlI[78] = 0x29 ^ 0x1F;
        K.llIlllIlI[79] = 112 + 16 - 35 + 48 ^ 182 + 25 - 182 + 161;
        K.llIlllIlI[80] = 0xA3 ^ 0x9B;
        K.llIlllIlI[81] = 0xFA ^ 0xC3;
        K.llIlllIlI[82] = 0x5A ^ 0x7E ^ (0xBC ^ 0xA2);
        K.llIlllIlI[83] = 10 + 117 - 16 + 51 ^ 142 + 132 - 147 + 26;
        K.llIlllIlI[84] = 144 + 56 - 93 + 73 ^ 126 + 70 - 84 + 24;
        K.llIlllIlI[85] = 32 + 98 - -46 + 9 ^ 2 + 49 - -45 + 36;
        K.llIlllIlI[86] = 0x22 ^ 0x1C;
        K.llIlllIlI[87] = 0x5A ^ 0x15 ^ (0x55 ^ 0x25);
        K.llIlllIlI[88] = 0x62 ^ 0x18 ^ (0xFB ^ 0xC1);
        K.llIlllIlI[89] = 0xDF ^ 0x9E;
        K.llIlllIlI[90] = -(0xFFFFDBBD & 0x76DB) & (0xFFFFDFFE & 0x7BFB);
        K.llIlllIlI[91] = 0xFFFFAFFB & 0x5BF4;
        K.llIlllIlI[92] = 39 + 34 - -136 + 21;
        K.llIlllIlI[93] = 104 + 25 - 102 + 127;
        K.llIlllIlI[94] = -(0xFFFFF59D & 0x5A7F) & (0xFFFFD9FF & Short.MAX_VALUE);
        K.llIlllIlI[95] = -(64 + 149 - 175 + 127) & (0xFFFF9EF7 & 0x6DFF);
        K.llIlllIlI[96] = 0xFFFFDFF7 & 0x29DF;
        K.llIlllIlI[97] = 0xFFFFFEF3 & 0xD5E;
        K.llIlllIlI[98] = -(0xFFFFEF7D & 0x36A7) & (0xFFFFAFFF & 0x7FF6);
        K.llIlllIlI[99] = -(0xFFFFD92E & 0x67F5) & (0xFFFFCDFF & 0x7F77);
        K.llIlllIlI[100] = 0x1F ^ 0x5D;
        K.llIlllIlI[101] = 0x25 ^ 0x66;
        K.llIlllIlI[102] = 0x4F ^ 0xB;
        K.llIlllIlI[103] = (0xC8 ^ 0x8F) + (117 + 75 - 187 + 156) - (83 + 138 - 124 + 94) + (92 + 5 - 48 + 110);
        K.llIlllIlI[104] = 0xFFFFBFEC & 0x6EDF;
        K.llIlllIlI[105] = 0xFFFFE9EE & 0x77B9;
        K.llIlllIlI[106] = -(0xFFFFFD6B & 0x47B5) & (0xFFFFFFBA & 0x7FFD);
        K.llIlllIlI[107] = -(0xFFFFEBFB & 0x5C7E) & (0xFFFFCFFD & 0x7BFF);
        K.llIlllIlI[108] = 0x7B ^ 0x1F;
        K.llIlllIlI[109] = 37 + 96 - 127 + 241 ^ 139 + 164 - 301 + 176;
        K.llIlllIlI[110] = 0x2F ^ 0x10 ^ (0x4A ^ 0x33);
        K.llIlllIlI[111] = 5 ^ 0x4D ^ (0x47 ^ 0x48);
        K.llIlllIlI[112] = -(0xFFFFF119 & 0x5EF7) & (0xFFFFFBFF & 0x5DFB);
        K.llIlllIlI[113] = 0xFFFFBCFF & 0x4F5F;
        K.llIlllIlI[114] = 0xFFFF9BF9 & 0x6DDE;
        K.llIlllIlI[115] = 0xFFFF9DE7 & 0x6E9F;
        K.llIlllIlI[116] = 0xFFFFBFDE & 0x49FD;
        K.llIlllIlI[117] = -(0xFFFF97C6 & 0x7A3D) & (0xFFFFBEBF & 0x5FFB);
        K.llIlllIlI[118] = -(0xFFFFB7B3 & 0x786E) & (0xFFFFBFFF & 0x79FF);
        K.llIlllIlI[119] = -(0xFFFFD3BB & 0x7F4F) & (0xFFFFFFFE & 0x5FBF);
        K.llIlllIlI[120] = -(0xFFFFFF5D & 0x74A7) & (0xFFFFFFFF & 0x7DC7);
        K.llIlllIlI[121] = 0xFFFFCEFF & 0x3DBC;
        K.llIlllIlI[122] = -(0xFFFFF4BE & 0x2F6D) & (0xFFFFBDFF & 0x6FEB);
        K.llIlllIlI[123] = 0xFFFFEEE5 & 0x1DBE;
        K.llIlllIlI[124] = 0xFFFFDFDF & 0x29EE;
        K.llIlllIlI[125] = -(0xFFFFEB77 & 0x75BF) & (0xFFFFFDFF & 0x6FBF);
        K.llIlllIlI[126] = -(0xFFFFB49F & 0x6B6E) & (0xFFFFACBF & Short.MAX_VALUE);
        K.llIlllIlI[127] = 0xFFFFD9DF & 0x2FE7;
        K.llIlllIlI[128] = -(0xFFFFFEEE & 0x3777) & (0xFFFFFFFF & 0x3FFF);
        K.llIlllIlI[129] = -(0xFFFFC23A & 0x3FD7) & (0xFFFFAEF3 & 0x5FFF);
        K.llIlllIlI[130] = 0x91 ^ 0x99 ^ (0x58 ^ 0x18);
        K.llIlllIlI[131] = 0x5F ^ 0x2B ^ (0xFF ^ 0xC2);
        K.llIlllIlI[132] = 0xF9 ^ 0xB3;
        K.llIlllIlI[133] = 0x37 ^ 0x7C;
        K.llIlllIlI[134] = 0xED ^ 0xA1;
        K.llIlllIlI[135] = 0x52 ^ 0x1F;
        K.llIlllIlI[136] = 2 + 188 - 42 + 44 ^ 19 + 32 - -104 + 20;
        K.llIlllIlI[137] = -(0xFFFFF41D & 0x3FE3) & (0xFFFFBFEB & 0x7DFE);
        K.llIlllIlI[138] = -(0xFFFFFEFD & 0x732B) & (0xFFFFFBFB & 0x7FFD);
        K.llIlllIlI[139] = 0xFFFFFDDF & 0xE79;
        K.llIlllIlI[140] = 0x70 ^ 0x3E;
    }

    private static String lIlllIIllIll(String lIIIIlIIlIIlIl, String lIIIIlIIlIIlII) {
        try {
            SecretKeySpec lIIIIlIIlIlIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIIIIlIIlIIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIIIIlIIlIlIIl = Cipher.getInstance("Blowfish");
            lIIIIlIIlIlIIl.init(llIlllIlI[4], lIIIIlIIlIlIlI);
            return new String(lIIIIlIIlIlIIl.doFinal(Base64.getDecoder().decode(lIIIIlIIlIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIIIIlIIlIlIII) {
            lIIIIlIIlIlIII.printStackTrace();
            return null;
        }
    }

    private static boolean lIlllIlIlIll(int n2) {
        return n2 != 0;
    }

    private static boolean lIlllIllIllI(Object object) {
        return object == null;
    }

    private static boolean lIlllIllIIIl(int n2) {
        return n2 < 0;
    }

    private static boolean lIlllIllIIll(int n2, int n3) {
        return n2 == n3;
    }

    private static int lIlllIlIlIlI(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    private static boolean lIlllIlIllll(Object object) {
        return object != null;
    }

    private static boolean lIlllIlIlllI(int n2, int n3) {
        return n2 >= n3;
    }

    @Override
    public int af() {
        try {
            K.cg();
            0;
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (2 == 0) {
            return (0x27 ^ 0x16) & ~(0x24 ^ 0x15);
        }
        return llIlllIlI[108];
    }

    private static boolean lIlllIllIlII(int n2, int n3) {
        return n2 > n3;
    }

    /*
     * WARNING - void declaration
     */
    private static boolean an() {
        void lIIIIlIlIIIlIl;
        int[] nArray = new int[llIlllIlI[6]];
        nArray[K.llIlllIlI[1]] = llIlllIlI[14];
        nArray[K.llIlllIlI[0]] = llIlllIlI[12];
        nArray[K.llIlllIlI[4]] = llIlllIlI[15];
        int[] nArray2 = nArray;
        int lIIIIlIlIIIlII = llIlllIlI[1];
        while (K.lIlllIlIllII(lIIIIlIlIIIlII, ((void)lIIIIlIlIIIlIl).length)) {
            int[] nArray3 = new int[llIlllIlI[0]];
            nArray3[K.llIlllIlI[1]] = lIIIIlIlIIIlIl[lIIIIlIlIIIlII];
            if (K.lIlllIlIllIl(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                return llIlllIlI[1];
            }
            ++lIIIIlIlIIIlII;
            0;
            if (-1 == -1) continue;
            return ((0x94 ^ 0x9F ^ (0x51 ^ 0x60)) & (0x70 ^ 0x4E ^ (0x63 ^ 0x67) ^ -1)) != 0;
        }
        return llIlllIlI[0];
    }

    private static boolean lIlllIlIllIl(int n2) {
        return n2 == 0;
    }

    private static void lIlllIlIlIII() {
        llIlllIII = new String[llIlllIlI[140]];
        K.llIlllIII[K.llIlllIlI[1]] = K."Finished buying items, switching back to quest";
        K.llIlllIII[K.llIlllIlI[0]] = K."Drop";
        K.llIlllIII[K.llIlllIlI[4]] = K."Nav to bank";
        K.llIlllIII[K.llIlllIlI[6]] = K."Handling banking";
        K.llIlllIII[K.llIlllIlI[7]] = K."We are missing runes, switching to BUYING";
        K.llIlllIII[K.llIlllIlI[16]] = K."We are missing quest supplies, switching to BUYING";
        K.llIlllIII[K.llIlllIlI[13]] = K."Drink";
        K.llIlllIII[K.llIlllIlI[17]] = K."Eat";
        K.llIlllIII[K.llIlllIlI[20]] = K."King Bolren";
        K.llIlllIII[K.llIlllIlI[25]] = K."Nav to commander";
        K.llIlllIII[K.llIlllIlI[21]] = K."Commander Montai";
        K.llIlllIII[K.llIlllIlI[27]] = K."Nav to tracker";
        K.llIlllIII[K.llIlllIlI[28]] = K."Door";
        K.llIlllIII[K.llIlllIlI[2]] = K."Open";
        K.llIlllIII[K.llIlllIlI[29]] = K."Door";
        K.llIlllIII[K.llIlllIlI[30]] = K."Open";
        K.llIlllIII[K.llIlllIlI[31]] = K."Door";
        K.llIlllIII[K.llIlllIlI[32]] = K."Open";
        K.llIlllIII[K.llIlllIlI[33]] = K."Tracker gnome 2";
        K.llIlllIII[K.llIlllIlI[35]] = K."Nav to tracker";
        K.llIlllIII[K.llIlllIlI[36]] = K."Tracker gnome 1";
        K.llIlllIII[K.llIlllIlI[38]] = K."Nav to tracker";
        K.llIlllIII[K.llIlllIlI[39]] = K."Tracker gnome 3";
        K.llIlllIII[K.llIlllIlI[40]] = K."Nav to ballista";
        K.llIlllIII[K.llIlllIlI[41]] = K."Firing";
        K.llIlllIII[K.llIlllIlI[42]] = K."Ballista";
        K.llIlllIII[K.llIlllIlI[43]] = K."Fire";
        K.llIlllIII[K.llIlllIlI[45]] = K."0001";
        K.llIlllIII[K.llIlllIlI[46]] = K."0002";
        K.llIlllIII[K.llIlllIlI[47]] = K."0003";
        K.llIlllIII[K.llIlllIlI[48]] = K."0004";
        K.llIlllIII[K.llIlllIlI[55]] = K."Nav to crumble";
        K.llIlllIII[K.llIlllIlI[56]] = K."Crumbled wall";
        K.llIlllIII[K.llIlllIlI[57]] = K."Climb-over";
        K.llIlllIII[K.llIlllIlI[60]] = K."Door";
        K.llIlllIII[K.llIlllIlI[61]] = K."Open";
        K.llIlllIII[K.llIlllIlI[62]] = K."Door";
        K.llIlllIII[K.llIlllIlI[63]] = K."Open";
        K.llIlllIII[K.llIlllIlI[64]] = K."Door";
        K.llIlllIII[K.llIlllIlI[65]] = K."Open";
        K.llIlllIII[K.llIlllIlI[66]] = K."Ladder";
        K.llIlllIII[K.llIlllIlI[67]] = K."Climb-up";
        K.llIlllIII[K.llIlllIlI[68]] = K."Ladder";
        K.llIlllIII[K.llIlllIlI[69]] = K."Climb-up";
        K.llIlllIII[K.llIlllIlI[70]] = K."Grab orb";
        K.llIlllIII[K.llIlllIlI[3]] = K."Closed chest";
        K.llIlllIII[K.llIlllIlI[71]] = K."Closed chest";
        K.llIlllIII[K.llIlllIlI[72]] = K."Open";
        K.llIlllIII[K.llIlllIlI[73]] = K."Open chest";
        K.llIlllIII[K.llIlllIlI[74]] = K."Open chest";
        K.llIlllIII[K.llIlllIlI[24]] = K."Search";
        K.llIlllIII[K.llIlllIlI[75]] = K."King Bolren";
        K.llIlllIII[K.llIlllIlI[76]] = K."Travel to final fight";
        K.llIlllIII[K.llIlllIlI[77]] = K."Khazard warlord";
        K.llIlllIII[K.llIlllIlI[78]] = K."Attack";
        K.llIlllIII[K.llIlllIlI[79]] = K."Khazard warlord";
        K.llIlllIII[K.llIlllIlI[80]] = K."Attack";
        K.llIlllIII[K.llIlllIlI[81]] = K."Handle fight";
        K.llIlllIII[K.llIlllIlI[82]] = K."Drink";
        K.llIlllIII[K.llIlllIlI[83]] = K."Orbs of protection";
        K.llIlllIII[K.llIlllIlI[84]] = K."Taking orbs";
        K.llIlllIII[K.llIlllIlI[85]] = K."Orbs of protection";
        K.llIlllIII[K.llIlllIlI[86]] = K."Take";
        K.llIlllIII[K.llIlllIlI[87]] = K."Orbs of protection";
        K.llIlllIII[K.llIlllIlI[88]] = K."King Bolren";
        K.llIlllIII[K.llIlllIlI[89]] = K."Nav to start";
        K.llIlllIII[K.llIlllIlI[100]] = K."Castle Wars";
        K.llIlllIII[K.llIlllIlI[101]] = K."Loose Railing";
        K.llIlllIII[K.llIlllIlI[102]] = K."Squeeze-through";
        K.llIlllIII[K.llIlllIlI[109]] = K."Tree Gnome Village";
        K.llIlllIII[K.llIlllIlI[110]] = K."ring of wealth (";
        K.llIlllIII[K.llIlllIlI[111]] = K."trooper";
        K.llIlllIII[K.llIlllIlI[130]] = K."Can I help at all?";
        K.llIlllIII[K.llIlllIlI[131]] = K."I would be glad to help.";
        K.llIlllIII[K.llIlllIlI[132]] = K."Ok, I'll gather some wood.";
        K.llIlllIII[K.llIlllIlI[133]] = K."I'll try my best.";
        K.llIlllIII[K.llIlllIlI[134]] = K."I will find the warlord and bring back the orbs.";
        K.llIlllIII[K.llIlllIlI[135]] = K."Yes.";
    }

    private static void Q() {
        block33: {
            d lIIIIlIlIIIIII;
            block32: {
                block31: {
                    block30: {
                        block29: {
                            block28: {
                                block27: {
                                    block26: {
                                        block25: {
                                            block24: {
                                                Object lIIIIlIlIIIIIl;
                                                block23: {
                                                    block22: {
                                                        int[] nArray = new int[llIlllIlI[0]];
                                                        nArray[K.llIlllIlI[1]] = llIlllIlI[12];
                                                        if (!K.lIlllIlIlIll(Bank.contains((int[])nArray) ? 1 : 0)) break block22;
                                                        int[] nArray2 = new int[llIlllIlI[0]];
                                                        nArray2[K.llIlllIlI[1]] = llIlllIlI[12];
                                                        if (!K.lIlllIlIlIll(Bank.contains((int[])nArray2) ? 1 : 0)) break block23;
                                                        int[] nArray3 = new int[llIlllIlI[0]];
                                                        nArray3[K.llIlllIlI[1]] = llIlllIlI[12];
                                                        if (!K.lIlllIlIllII(Bank.getFirst((int[])nArray3).getQuantity(), llIlllIlI[13])) break block23;
                                                    }
                                                    lIIIIlIlIIIIIl = new d(llIlllIlI[12], llIlllIlI[13], llIlllIlI[103]);
                                                    bx.add((d)lIIIIlIlIIIIIl);
                                                    0;
                                                }
                                                if (K.lIlllIlIllIl(Bank.contains((Predicate)(lIIIIlIlIIIIIl = item -> item.getName().toLowerCase().contains(llIlllIII[llIlllIlI[110]]))) ? 1 : 0)) {
                                                    lIIIIlIlIIIIII = new d(llIlllIlI[104], llIlllIlI[16], llIlllIlI[105]);
                                                    bx.add(lIIIIlIlIIIIII);
                                                    0;
                                                }
                                                int[] nArray = new int[llIlllIlI[0]];
                                                nArray[K.llIlllIlI[1]] = llIlllIlI[15];
                                                if (K.lIlllIlIlIll(Bank.contains((int[])nArray) ? 1 : 0)) {
                                                    int[] nArray4 = new int[llIlllIlI[0]];
                                                    nArray4[K.llIlllIlI[1]] = llIlllIlI[15];
                                                    if (K.lIlllIlIllII(Bank.getFirst((int[])nArray4).getQuantity(), llIlllIlI[7])) {
                                                        int[] nArray5 = new int[llIlllIlI[0]];
                                                        nArray5[K.llIlllIlI[1]] = llIlllIlI[15];
                                                        lIIIIlIlIIIIII = new d(llIlllIlI[15], llIlllIlI[7] - Bank.getFirst((int[])nArray5).getQuantity(), llIlllIlI[106]);
                                                        bx.add(lIIIIlIlIIIIII);
                                                        0;
                                                    }
                                                }
                                                int[] nArray6 = new int[llIlllIlI[0]];
                                                nArray6[K.llIlllIlI[1]] = llIlllIlI[10];
                                                if (!K.lIlllIlIlIll(Bank.contains((int[])nArray6) ? 1 : 0)) break block24;
                                                int[] nArray7 = new int[llIlllIlI[0]];
                                                nArray7[K.llIlllIlI[1]] = llIlllIlI[10];
                                                if (!K.lIlllIlIlIll(Bank.contains((int[])nArray7) ? 1 : 0)) break block25;
                                                int[] nArray8 = new int[llIlllIlI[0]];
                                                nArray8[K.llIlllIlI[1]] = llIlllIlI[10];
                                                if (!K.lIlllIlIllII(Bank.getFirst((int[])nArray8).getQuantity(), llIlllIlI[9])) break block25;
                                            }
                                            lIIIIlIlIIIIII = new d(llIlllIlI[10], llIlllIlI[9], llIlllIlI[21]);
                                            bx.add(lIIIIlIlIIIIII);
                                            0;
                                        }
                                        int[] nArray = new int[llIlllIlI[0]];
                                        nArray[K.llIlllIlI[1]] = llIlllIlI[8];
                                        if (!K.lIlllIlIlIll(Bank.contains((int[])nArray) ? 1 : 0)) break block26;
                                        int[] nArray9 = new int[llIlllIlI[0]];
                                        nArray9[K.llIlllIlI[1]] = llIlllIlI[8];
                                        if (!K.lIlllIlIlIll(Bank.contains((int[])nArray9) ? 1 : 0)) break block27;
                                        int[] nArray10 = new int[llIlllIlI[0]];
                                        nArray10[K.llIlllIlI[1]] = llIlllIlI[8];
                                        if (!K.lIlllIlIllII(Bank.getFirst((int[])nArray10).getQuantity(), llIlllIlI[9])) break block27;
                                    }
                                    lIIIIlIlIIIIII = new d(llIlllIlI[8], llIlllIlI[9], llIlllIlI[21]);
                                    bx.add(lIIIIlIlIIIIII);
                                    0;
                                }
                                int[] nArray = new int[llIlllIlI[0]];
                                nArray[K.llIlllIlI[1]] = llIlllIlI[11];
                                if (!K.lIlllIlIlIll(Bank.contains((int[])nArray) ? 1 : 0)) break block28;
                                int[] nArray11 = new int[llIlllIlI[0]];
                                nArray11[K.llIlllIlI[1]] = llIlllIlI[11];
                                if (!K.lIlllIlIlIll(Bank.contains((int[])nArray11) ? 1 : 0)) break block29;
                                int[] nArray12 = new int[llIlllIlI[0]];
                                nArray12[K.llIlllIlI[1]] = llIlllIlI[11];
                                if (!K.lIlllIlIllII(Bank.getFirst((int[])nArray12).getQuantity(), llIlllIlI[9])) break block29;
                            }
                            lIIIIlIlIIIIII = new d(llIlllIlI[11], llIlllIlI[9], llIlllIlI[21]);
                            bx.add(lIIIIlIlIIIIII);
                            0;
                        }
                        int[] nArray = new int[llIlllIlI[0]];
                        nArray[K.llIlllIlI[1]] = llIlllIlI[15];
                        if (K.lIlllIlIllIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                            lIIIIlIlIIIIII = new d(llIlllIlI[15], llIlllIlI[7], llIlllIlI[106]);
                            bx.add(lIIIIlIlIIIIII);
                            0;
                        }
                        int[] nArray13 = new int[llIlllIlI[0]];
                        nArray13[K.llIlllIlI[1]] = llIlllIlI[18];
                        if (!K.lIlllIlIlIll(Bank.contains((int[])nArray13) ? 1 : 0)) break block30;
                        int[] nArray14 = new int[llIlllIlI[0]];
                        nArray14[K.llIlllIlI[1]] = llIlllIlI[18];
                        if (!K.lIlllIlIllII(Bank.getFirst((int[])nArray14).getQuantity(), llIlllIlI[7])) break block31;
                    }
                    lIIIIlIlIIIIII = new d(llIlllIlI[18], llIlllIlI[7], j.ch);
                    bx.add(lIIIIlIlIIIIII);
                    0;
                }
                int[] nArray = new int[llIlllIlI[0]];
                nArray[K.llIlllIlI[1]] = llIlllIlI[14];
                if (!K.lIlllIlIlIll(Bank.contains((int[])nArray) ? 1 : 0)) break block32;
                int[] nArray15 = new int[llIlllIlI[0]];
                nArray15[K.llIlllIlI[1]] = llIlllIlI[14];
                if (!K.lIlllIlIlIll(Bank.contains((int[])nArray15) ? 1 : 0)) break block33;
                int[] nArray16 = new int[llIlllIlI[0]];
                nArray16[K.llIlllIlI[1]] = llIlllIlI[14];
                if (!K.lIlllIlIllII(Bank.getFirst((int[])nArray16).getQuantity(), llIlllIlI[30])) break block33;
            }
            lIIIIlIlIIIIII = new d(llIlllIlI[14], llIlllIlI[66], llIlllIlI[107]);
            bx.add(lIIIIlIlIIIIII);
            0;
        }
    }
}

