/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Quest
 *  net.runelite.api.QuestState
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 *  net.unethicalite.api.quests.Quests
 *  net.unethicalite.api.widgets.Dialog
 */
package -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l;

import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.a;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.ab;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.as;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.b;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.d;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.e;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.f;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.g;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.j;
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
import net.runelite.api.Quest;
import net.runelite.api.QuestState;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.quests.Quests;
import net.unethicalite.api.widgets.Dialog;

public class F
implements ab {
    public static /* synthetic */ WorldPoint dT;
    static /* synthetic */ int dk;
    public static /* synthetic */ WorldPoint fp;
    static /* synthetic */ String[] cG;
    public static /* synthetic */ WorldPoint fl;
    public static /* synthetic */ WorldPoint fo;
    public static /* synthetic */ WorldPoint fn;
    public static /* synthetic */ WorldPoint fq;
    public static /* synthetic */ List<d> bx;
    public static /* synthetic */ boolean bv;
    private static /* synthetic */ int[] lIIIIlIllI;
    private static /* synthetic */ String[] lIIIIlIlIl;
    public static /* synthetic */ WorldPoint fm;
    public static /* synthetic */ int fk;
    static /* synthetic */ WorldArea fs;
    static /* synthetic */ WorldArea fr;

    private static String lllIIIIllllI(String lllIllIIlIIl, String lllIllIIlIII) {
        try {
            SecretKeySpec lllIllIIllII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllIllIIlIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllIllIIlIll = Cipher.getInstance("Blowfish");
            lllIllIIlIll.init(lIIIIlIllI[3], lllIllIIllII);
            return new String(lllIllIIlIll.doFinal(Base64.getDecoder().decode(lllIllIIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllIllIIlIlI) {
            lllIllIIlIlI.printStackTrace();
            return null;
        }
    }

    private static boolean lllIIIlIlIlI(Object object, Object object2) {
        return object == object2;
    }

    @Override
    public boolean ae() {
        return lIIIIlIllI[1];
    }

    /*
     * WARNING - void declaration
     */
    private static boolean an() {
        void lllIllllllIl;
        int[] nArray = new int[lIIIIlIllI[7]];
        nArray[F.lIIIIlIllI[1]] = lIIIIlIllI[8];
        nArray[F.lIIIIlIllI[0]] = lIIIIlIllI[9];
        nArray[F.lIIIIlIllI[3]] = lIIIIlIllI[10];
        nArray[F.lIIIIlIllI[6]] = lIIIIlIllI[11];
        nArray[F.lIIIIlIllI[4]] = lIIIIlIllI[12];
        nArray[F.lIIIIlIllI[13]] = lIIIIlIllI[5];
        nArray[F.lIIIIlIllI[14]] = lIIIIlIllI[15];
        nArray[F.lIIIIlIllI[16]] = lIIIIlIllI[17];
        nArray[F.lIIIIlIllI[18]] = lIIIIlIllI[19];
        nArray[F.lIIIIlIllI[20]] = lIIIIlIllI[21];
        int[] nArray2 = nArray;
        int lllIllllllII = lIIIIlIllI[1];
        while (F.lllIIIlIIIlI(lllIllllllII, ((void)lllIllllllIl).length)) {
            int[] nArray3 = new int[lIIIIlIllI[0]];
            nArray3[F.lIIIIlIllI[1]] = lllIllllllIl[lllIllllllII];
            if (F.lllIIIlIIIll(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                return lIIIIlIllI[1];
            }
            ++lllIllllllII;
            0;
            if (1 > -1) continue;
            return false;
        }
        return lIIIIlIllI[0];
    }

    @Override
    public int af() {
        try {
            F.bG();
            0;
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (2 <= ((0x8B ^ 0xBE) & ~(0x4E ^ 0x7B))) {
            return (0xD2 ^ 0x8C) & ~(0xD5 ^ 0x8B);
        }
        return lIIIIlIllI[110];
    }

    private static boolean lllIIIlIlIIl(int n2, int n3) {
        return n2 != n3;
    }

    private static void Q() {
        d lllIlllllIII;
        block22: {
            block21: {
                Object lllIlllllIIl;
                block20: {
                    block19: {
                        block18: {
                            block17: {
                                int[] nArray = new int[lIIIIlIllI[0]];
                                nArray[F.lIIIIlIllI[1]] = lIIIIlIllI[9];
                                if (!F.lllIIIlIIIIl(Bank.contains((int[])nArray) ? 1 : 0)) break block17;
                                int[] nArray2 = new int[lIIIIlIllI[0]];
                                nArray2[F.lIIIIlIllI[1]] = lIIIIlIllI[9];
                                if (!F.lllIIIlIIIIl(Bank.contains((int[])nArray2) ? 1 : 0)) break block18;
                                int[] nArray3 = new int[lIIIIlIllI[0]];
                                nArray3[F.lIIIIlIllI[1]] = lIIIIlIllI[9];
                                if (!F.lllIIIlIIIlI(Bank.getFirst((int[])nArray3).getQuantity(), lIIIIlIllI[7])) break block18;
                            }
                            lllIlllllIIl = new d(lIIIIlIllI[9], lIIIIlIllI[7], e.c(lIIIIlIllI[104], lIIIIlIllI[105]));
                            bx.add((d)lllIlllllIIl);
                            0;
                        }
                        int[] nArray = new int[lIIIIlIllI[0]];
                        nArray[F.lIIIIlIllI[1]] = lIIIIlIllI[10];
                        if (F.lllIIIlIIIll(Bank.contains((int[])nArray) ? 1 : 0)) {
                            lllIlllllIIl = new d(lIIIIlIllI[10], lIIIIlIllI[0], lIIIIlIllI[106]);
                            bx.add((d)lllIlllllIIl);
                            0;
                        }
                        int[] nArray4 = new int[lIIIIlIllI[0]];
                        nArray4[F.lIIIIlIllI[1]] = lIIIIlIllI[11];
                        if (F.lllIIIlIIIll(Bank.contains((int[])nArray4) ? 1 : 0)) {
                            lllIlllllIIl = new d(lIIIIlIllI[11], lIIIIlIllI[0], lIIIIlIllI[106]);
                            bx.add((d)lllIlllllIIl);
                            0;
                        }
                        int[] nArray5 = new int[lIIIIlIllI[0]];
                        nArray5[F.lIIIIlIllI[1]] = lIIIIlIllI[12];
                        if (F.lllIIIlIIIll(Bank.contains((int[])nArray5) ? 1 : 0)) {
                            lllIlllllIIl = new d(lIIIIlIllI[12], lIIIIlIllI[0], lIIIIlIllI[106]);
                            bx.add((d)lllIlllllIIl);
                            0;
                        }
                        int[] nArray6 = new int[lIIIIlIllI[0]];
                        nArray6[F.lIIIIlIllI[1]] = lIIIIlIllI[5];
                        if (!F.lllIIIlIIIIl(Bank.contains((int[])nArray6) ? 1 : 0)) break block19;
                        int[] nArray7 = new int[lIIIIlIllI[0]];
                        nArray7[F.lIIIIlIllI[1]] = lIIIIlIllI[5];
                        if (!F.lllIIIlIIIIl(Bank.contains((int[])nArray7) ? 1 : 0)) break block20;
                        int[] nArray8 = new int[lIIIIlIllI[0]];
                        nArray8[F.lIIIIlIllI[1]] = lIIIIlIllI[5];
                        if (!F.lllIIIlIIIlI(Bank.getFirst((int[])nArray8).getQuantity(), lIIIIlIllI[6])) break block20;
                    }
                    lllIlllllIIl = new d(lIIIIlIllI[5], lIIIIlIllI[4], lIIIIlIllI[106]);
                    bx.add((d)lllIlllllIIl);
                    0;
                }
                int[] nArray = new int[lIIIIlIllI[0]];
                nArray[F.lIIIIlIllI[1]] = lIIIIlIllI[15];
                if (F.lllIIIlIIIll(Bank.contains((int[])nArray) ? 1 : 0)) {
                    lllIlllllIIl = new d(lIIIIlIllI[15], lIIIIlIllI[0], lIIIIlIllI[106]);
                    bx.add((d)lllIlllllIIl);
                    0;
                }
                int[] nArray9 = new int[lIIIIlIllI[0]];
                nArray9[F.lIIIIlIllI[1]] = lIIIIlIllI[17];
                if (F.lllIIIlIIIll(Bank.contains((int[])nArray9) ? 1 : 0)) {
                    lllIlllllIIl = new d(lIIIIlIllI[17], lIIIIlIllI[0], lIIIIlIllI[106]);
                    bx.add((d)lllIlllllIIl);
                    0;
                }
                int[] nArray10 = new int[lIIIIlIllI[0]];
                nArray10[F.lIIIIlIllI[1]] = lIIIIlIllI[19];
                if (F.lllIIIlIIIll(Bank.contains((int[])nArray10) ? 1 : 0)) {
                    lllIlllllIIl = new d(lIIIIlIllI[19], lIIIIlIllI[0], lIIIIlIllI[106]);
                    bx.add((d)lllIlllllIIl);
                    0;
                }
                if (F.lllIIIlIIIll(Bank.contains((Predicate)(lllIlllllIIl = item -> item.getName().toLowerCase().contains(lIIIIlIlIl[lIIIIlIllI[112]]))) ? 1 : 0)) {
                    lllIlllllIII = new d(lIIIIlIllI[107], lIIIIlIllI[13], lIIIIlIllI[108]);
                    bx.add(lllIlllllIII);
                    0;
                }
                int[] nArray11 = new int[lIIIIlIllI[0]];
                nArray11[F.lIIIIlIllI[1]] = lIIIIlIllI[8];
                if (!F.lllIIIlIIIIl(Bank.contains((int[])nArray11) ? 1 : 0)) break block21;
                int[] nArray12 = new int[lIIIIlIllI[0]];
                nArray12[F.lIIIIlIllI[1]] = lIIIIlIllI[8];
                if (!F.lllIIIlIIIIl(Bank.contains((int[])nArray12) ? 1 : 0)) break block22;
                int[] nArray13 = new int[lIIIIlIllI[0]];
                nArray13[F.lIIIIlIllI[1]] = lIIIIlIllI[8];
                if (!F.lllIIIlIIIlI(Bank.getFirst((int[])nArray13).getQuantity(), lIIIIlIllI[7])) break block22;
            }
            lllIlllllIII = new d(lIIIIlIllI[8], lIIIIlIllI[53], lIIIIlIllI[109]);
            bx.add(lllIlllllIII);
            0;
        }
        int[] nArray = new int[lIIIIlIllI[0]];
        nArray[F.lIIIIlIllI[1]] = lIIIIlIllI[21];
        if (F.lllIIIlIIIll(Bank.contains((int[])nArray) ? 1 : 0)) {
            lllIlllllIII = new d(lIIIIlIllI[21], lIIIIlIllI[6], j.ch);
            bx.add(lllIlllllIII);
            0;
        }
    }

    private static boolean lllIIIlIIIlI(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lllIIIlIIlll(int n2, int n3) {
        return n2 <= n3;
    }

    static {
        F.lllIIIlIIIII();
        F.lllIIIIlllll();
        bx = new ArrayList<d>();
        fk = lIIIIlIllI[113];
        dT = new WorldPoint(lIIIIlIllI[114], lIIIIlIllI[115], lIIIIlIllI[1]);
        fl = new WorldPoint(lIIIIlIllI[116], lIIIIlIllI[115], lIIIIlIllI[1]);
        fm = new WorldPoint(lIIIIlIllI[117], lIIIIlIllI[118], lIIIIlIllI[1]);
        fn = new WorldPoint(lIIIIlIllI[67], lIIIIlIllI[115], lIIIIlIllI[1]);
        fo = new WorldPoint(lIIIIlIllI[119], lIIIIlIllI[120], lIIIIlIllI[1]);
        fp = new WorldPoint(lIIIIlIllI[121], lIIIIlIllI[122], lIIIIlIllI[1]);
        fq = new WorldPoint(lIIIIlIllI[123], lIIIIlIllI[124], lIIIIlIllI[1]);
        fr = new WorldArea(lIIIIlIllI[125], lIIIIlIllI[126], lIIIIlIllI[61], lIIIIlIllI[87], lIIIIlIllI[1]);
        fs = new WorldArea(lIIIIlIllI[67], lIIIIlIllI[127], lIIIIlIllI[25], lIIIIlIllI[13], lIIIIlIllI[1]);
        String[] stringArray = new String[lIIIIlIllI[20]];
        stringArray[F.lIIIIlIllI[1]] = lIIIIlIlIl[lIIIIlIllI[128]];
        stringArray[F.lIIIIlIllI[0]] = lIIIIlIlIl[lIIIIlIllI[129]];
        stringArray[F.lIIIIlIllI[3]] = lIIIIlIlIl[lIIIIlIllI[130]];
        stringArray[F.lIIIIlIllI[6]] = lIIIIlIlIl[lIIIIlIllI[131]];
        stringArray[F.lIIIIlIllI[4]] = lIIIIlIlIl[lIIIIlIllI[132]];
        stringArray[F.lIIIIlIllI[13]] = lIIIIlIlIl[lIIIIlIllI[133]];
        stringArray[F.lIIIIlIllI[14]] = lIIIIlIlIl[lIIIIlIllI[134]];
        stringArray[F.lIIIIlIllI[16]] = lIIIIlIlIl[lIIIIlIllI[135]];
        stringArray[F.lIIIIlIllI[18]] = lIIIIlIlIl[lIIIIlIllI[136]];
        cG = stringArray;
        dk = lIIIIlIllI[1];
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean ah() {
        int n2;
        if (F.lllIIIlIlIlI(Quests.getState((Quest)Quest.PLAGUE_CITY), QuestState.FINISHED)) {
            int[] nArray = new int[lIIIIlIllI[0]];
            nArray[F.lIIIIlIllI[1]] = lIIIIlIllI[102];
            if (F.lllIIIlIIIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                n2 = lIIIIlIllI[0];
                0;
                if (2 >= ((0xC5 ^ 0x8B) & ~(0xD1 ^ 0x9F))) return n2 != 0;
                return false;
            }
        }
        n2 = lIIIIlIllI[1];
        return n2 != 0;
    }

    private static boolean lllIIIlIIlIl(int n2) {
        return n2 > 0;
    }

    @Override
    public String ag() {
        return lIIIIlIlIl[lIIIIlIllI[111]];
    }

    public static void bG() {
        if (F.lllIIIlIIIIl(bv ? 1 : 0)) {
            b.a(bx);
            if (F.lllIIIlIIIlI(bx.size(), lIIIIlIllI[0])) {
                System.out.println(lIIIIlIlIl[lIIIIlIllI[1]]);
                bv = lIIIIlIllI[1];
            }
        }
        if (F.lllIIIlIIIll(bv ? 1 : 0)) {
            BankLocation llllIIIIIIII;
            if (F.lllIIIlIIIll(F.an() ? 1 : 0) && F.lllIIIlIIIlI(e.j(fk), lIIIIlIllI[0])) {
                llllIIIIIIII = BankLocation.getNearest();
                if (F.lllIIIlIIlII(llllIIIIIIII) && F.lllIIIlIIIll(llllIIIIIIII.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderGWD.c = lIIIIlIlIl[lIIIIlIllI[0]];
                    a.a(llllIIIIIIII);
                }
                if (F.lllIIIlIIlII(llllIIIIIIII) && F.lllIIIlIIIIl(llllIIIIIIII.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (F.lllIIIlIIIll(Bank.isOpen() ? 1 : 0)) {
                        a.a();
                        Time.sleepUntil(() -> Bank.isOpen(), (int)lIIIIlIllI[2]);
                        0;
                    }
                    if (F.lllIIIlIIIIl(Bank.isOpen() ? 1 : 0)) {
                        AccBuilderGWD.c = lIIIIlIlIl[lIIIIlIllI[3]];
                        if (F.lllIIIlIIlIl(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks((int)lIIIIlIllI[4]);
                            0;
                        }
                        if (F.lllIIIlIIlIl(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks((int)lIIIIlIllI[3]);
                            0;
                        }
                        int[] nArray = new int[lIIIIlIllI[0]];
                        nArray[F.lIIIIlIllI[1]] = lIIIIlIllI[5];
                        if (F.lllIIIlIIIIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                            int[] nArray2 = new int[lIIIIlIllI[0]];
                            nArray2[F.lIIIIlIllI[1]] = lIIIIlIllI[5];
                            if (F.lllIIIlIIIlI(Bank.getFirst((int[])nArray2).getQuantity(), lIIIIlIllI[4])) {
                                F.Q();
                                System.out.println(lIIIIlIlIl[lIIIIlIllI[6]]);
                                bv = lIIIIlIllI[0];
                                return;
                            }
                        }
                        int[] nArray3 = new int[lIIIIlIllI[7]];
                        nArray3[F.lIIIIlIllI[1]] = lIIIIlIllI[8];
                        nArray3[F.lIIIIlIllI[0]] = lIIIIlIllI[9];
                        nArray3[F.lIIIIlIllI[3]] = lIIIIlIllI[10];
                        nArray3[F.lIIIIlIllI[6]] = lIIIIlIllI[11];
                        nArray3[F.lIIIIlIllI[4]] = lIIIIlIllI[12];
                        nArray3[F.lIIIIlIllI[13]] = lIIIIlIllI[5];
                        nArray3[F.lIIIIlIllI[14]] = lIIIIlIllI[15];
                        nArray3[F.lIIIIlIllI[16]] = lIIIIlIllI[17];
                        nArray3[F.lIIIIlIllI[18]] = lIIIIlIllI[19];
                        nArray3[F.lIIIIlIllI[20]] = lIIIIlIllI[21];
                        if (F.lllIIIlIIIll(e.d(nArray3) ? 1 : 0)) {
                            F.Q();
                            System.out.println(lIIIIlIlIl[lIIIIlIllI[4]]);
                            bv = lIIIIlIllI[0];
                            return;
                        }
                        int[] nArray4 = new int[lIIIIlIllI[7]];
                        nArray4[F.lIIIIlIllI[1]] = lIIIIlIllI[8];
                        nArray4[F.lIIIIlIllI[0]] = lIIIIlIllI[9];
                        nArray4[F.lIIIIlIllI[3]] = lIIIIlIllI[10];
                        nArray4[F.lIIIIlIllI[6]] = lIIIIlIllI[11];
                        nArray4[F.lIIIIlIllI[4]] = lIIIIlIllI[12];
                        nArray4[F.lIIIIlIllI[13]] = lIIIIlIllI[5];
                        nArray4[F.lIIIIlIllI[14]] = lIIIIlIllI[15];
                        nArray4[F.lIIIIlIllI[16]] = lIIIIlIllI[17];
                        nArray4[F.lIIIIlIllI[18]] = lIIIIlIllI[19];
                        nArray4[F.lIIIIlIllI[20]] = lIIIIlIllI[21];
                        if (F.lllIIIlIIIIl(e.d(nArray4) ? 1 : 0)) {
                            a.a(lIIIIlIllI[8], lIIIIlIllI[13]);
                            a.a(lIIIIlIllI[9], lIIIIlIllI[13]);
                            a.a(lIIIIlIllI[11], lIIIIlIllI[0]);
                            a.a(lIIIIlIllI[10], lIIIIlIllI[0]);
                            a.a(lIIIIlIllI[12], lIIIIlIllI[0]);
                            a.a(lIIIIlIllI[5], lIIIIlIllI[4]);
                            a.a(lIIIIlIllI[15], lIIIIlIllI[0]);
                            a.a(lIIIIlIllI[17], lIIIIlIllI[0]);
                            a.a(lIIIIlIllI[19], lIIIIlIllI[0]);
                            a.a(lIIIIlIllI[21], lIIIIlIllI[6]);
                        }
                    }
                }
            }
            if (F.lllIIIlIIIIl(Inventory.contains((int[])f.bc) ? 1 : 0) && F.lllIIIlIIIlI(Movement.getRunEnergy(), lIIIIlIllI[22])) {
                Inventory.getFirst((int[])f.bc).interact(lIIIIlIlIl[lIIIIlIllI[13]]);
                Time.sleepTicks((int)lIIIIlIllI[0]);
                0;
            }
            if (F.lllIIIlIIIIl(F.an() ? 1 : 0) && F.lllIIIlIIIll(e.j(fk))) {
                if (F.lllIIIlIIllI(Players.getLocal().getWorldLocation().distanceTo(dT), lIIIIlIllI[4])) {
                    AccBuilderGWD.c = lIIIIlIlIl[lIIIIlIllI[14]];
                    if (F.lllIIIlIIlll(Players.getLocal().getWorldLocation().distanceTo(b.K), lIIIIlIllI[23])) {
                        String[] stringArray = new String[lIIIIlIllI[0]];
                        stringArray[F.lIIIIlIllI[1]] = lIIIIlIlIl[lIIIIlIllI[16]];
                        Inventory.getFirst((String[])stringArray).interact(lIIIIlIlIl[lIIIIlIllI[18]]);
                        Time.sleepTicks((int)lIIIIlIllI[14]);
                        0;
                    }
                    if (F.lllIIIlIIIIl(Dialog.isOpen() ? 1 : 0)) {
                        Dialog.close();
                    }
                    Movement.walkTo((WorldPoint)dT);
                    0;
                    Time.sleepTicks((int)lIIIIlIllI[0]);
                    0;
                }
                if (F.lllIIIlIIlll(Players.getLocal().getWorldLocation().distanceTo(dT), lIIIIlIllI[4])) {
                    AccBuilderGWD.c = lIIIIlIlIl[lIIIIlIllI[20]];
                    g.a(lIIIIlIlIl[lIIIIlIllI[7]], cG);
                }
            }
            if (F.lllIIIlIlIII(e.j(fk), lIIIIlIllI[0])) {
                if (F.lllIIIlIIllI(Players.getLocal().getWorldLocation().distanceTo(fl), lIIIIlIllI[4])) {
                    AccBuilderGWD.c = lIIIIlIlIl[lIIIIlIllI[24]];
                    Movement.walkTo((WorldPoint)fl);
                    0;
                    Time.sleepTicks((int)lIIIIlIllI[0]);
                    0;
                }
                if (F.lllIIIlIIlll(Players.getLocal().getWorldLocation().distanceTo(fl), lIIIIlIllI[4])) {
                    AccBuilderGWD.c = lIIIIlIlIl[lIIIIlIllI[25]];
                    g.a(lIIIIlIlIl[lIIIIlIllI[26]], cG);
                }
            }
            if (F.lllIIIlIlIII(e.j(fk), lIIIIlIllI[3])) {
                String[] stringArray = new String[lIIIIlIllI[0]];
                stringArray[F.lIIIIlIllI[1]] = lIIIIlIlIl[lIIIIlIllI[27]];
                if (F.lllIIIlIIIll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    if (F.lllIIIlIIllI(Players.getLocal().getWorldLocation().distanceTo(fl), lIIIIlIllI[3])) {
                        AccBuilderGWD.c = lIIIIlIlIl[lIIIIlIllI[28]];
                        Movement.walkTo((WorldPoint)fl);
                        0;
                        Time.sleepTicks((int)lIIIIlIllI[0]);
                        0;
                    }
                    if (F.lllIIIlIIlll(Players.getLocal().getWorldLocation().distanceTo(fl), lIIIIlIllI[3])) {
                        AccBuilderGWD.c = lIIIIlIlIl[lIIIIlIllI[29]];
                        String[] stringArray2 = new String[lIIIIlIllI[0]];
                        stringArray2[F.lIIIIlIllI[1]] = lIIIIlIlIl[lIIIIlIllI[30]];
                        TileItems.getNearest((String[])stringArray2).interact(lIIIIlIlIl[lIIIIlIllI[31]]);
                        Time.sleepTicks((int)lIIIIlIllI[3]);
                        0;
                    }
                }
                String[] stringArray3 = new String[lIIIIlIllI[0]];
                stringArray3[F.lIIIIlIllI[1]] = lIIIIlIlIl[lIIIIlIllI[32]];
                if (F.lllIIIlIIIIl(Inventory.contains((String[])stringArray3) ? 1 : 0)) {
                    if (F.lllIIIlIIllI(Players.getLocal().getWorldLocation().distanceTo(dT), lIIIIlIllI[4])) {
                        AccBuilderGWD.c = lIIIIlIlIl[lIIIIlIllI[23]];
                        Movement.walkTo((WorldPoint)dT);
                        0;
                        Time.sleepTicks((int)lIIIIlIllI[0]);
                        0;
                    }
                    if (F.lllIIIlIIlll(Players.getLocal().getWorldLocation().distanceTo(dT), lIIIIlIllI[4])) {
                        AccBuilderGWD.c = lIIIIlIlIl[lIIIIlIllI[33]];
                        g.a(lIIIIlIlIl[lIIIIlIllI[34]], cG);
                    }
                }
            }
            if (!F.lllIIIlIlIIl(e.j(fk), lIIIIlIllI[6]) || !F.lllIIIlIlIIl(e.j(fk), lIIIIlIllI[4]) || !F.lllIIIlIlIIl(e.j(fk), lIIIIlIllI[13]) || F.lllIIIlIlIII(e.j(fk), lIIIIlIllI[14])) {
                AccBuilderGWD.c = lIIIIlIlIl[lIIIIlIllI[35]];
                if (F.lllIIIlIIIll(Players.getLocal().getWorldLocation().equals((Object)fm) ? 1 : 0)) {
                    Movement.walkTo((WorldPoint)fm);
                    0;
                    Time.sleepTicks((int)lIIIIlIllI[0]);
                    0;
                }
                if (F.lllIIIlIIIIl(Players.getLocal().getWorldLocation().equals((Object)fm) ? 1 : 0)) {
                    int[] nArray = new int[lIIIIlIllI[0]];
                    nArray[F.lIIIIlIllI[1]] = lIIIIlIllI[5];
                    String[] stringArray = new String[lIIIIlIllI[0]];
                    stringArray[F.lIIIIlIllI[1]] = lIIIIlIlIl[lIIIIlIllI[36]];
                    Inventory.getFirst((int[])nArray).useOn(TileObjects.getNearest((String[])stringArray));
                    Time.sleepTicks((int)lIIIIlIllI[3]);
                    0;
                }
            }
            if (F.lllIIIlIlIII(e.j(fk), lIIIIlIllI[16])) {
                if (F.lllIIIlIIIll(Players.getLocal().getWorldLocation().equals((Object)fm) ? 1 : 0)) {
                    Movement.walkTo((WorldPoint)fm);
                    0;
                    Time.sleepTicks((int)lIIIIlIllI[0]);
                    0;
                }
                if (F.lllIIIlIIIIl(Players.getLocal().getWorldLocation().equals((Object)fm) ? 1 : 0)) {
                    int[] nArray = new int[lIIIIlIllI[0]];
                    nArray[F.lIIIIlIllI[1]] = lIIIIlIllI[12];
                    Inventory.getFirst((int[])nArray).interact(lIIIIlIlIl[lIIIIlIllI[37]]);
                    Time.sleepTicks((int)lIIIIlIllI[3]);
                    0;
                }
            }
            if (F.lllIIIlIlIII(e.j(fk), lIIIIlIllI[18])) {
                AccBuilderGWD.c = lIIIIlIlIl[lIIIIlIllI[38]];
                String[] stringArray = new String[lIIIIlIllI[0]];
                stringArray[F.lIIIIlIllI[1]] = lIIIIlIlIl[lIIIIlIllI[39]];
                if (F.lllIIIlIIlII(TileObjects.getNearest((String[])stringArray)) && F.lllIIIlIIIll(Dialog.isOpen() ? 1 : 0)) {
                    String[] stringArray4 = new String[lIIIIlIllI[0]];
                    stringArray4[F.lIIIIlIllI[1]] = lIIIIlIlIl[lIIIIlIllI[40]];
                    TileObjects.getNearest((String[])stringArray4).interact(lIIIIlIlIl[lIIIIlIllI[41]]);
                    Time.sleepTicks((int)lIIIIlIllI[7]);
                    0;
                    String[] stringArray5 = new String[lIIIIlIllI[0]];
                    stringArray5[F.lIIIIlIllI[1]] = lIIIIlIlIl[lIIIIlIllI[42]];
                    String[] stringArray6 = new String[lIIIIlIllI[0]];
                    stringArray6[F.lIIIIlIllI[1]] = lIIIIlIlIl[lIIIIlIllI[43]];
                    Inventory.getFirst((String[])stringArray5).useOn(TileObjects.getNearest((String[])stringArray6));
                    Time.sleepTicks((int)lIIIIlIllI[3]);
                    0;
                }
                g.a(cG);
            }
            if (F.lllIIIlIlIII(e.j(fk), lIIIIlIllI[20])) {
                AccBuilderGWD.c = lIIIIlIlIl[lIIIIlIllI[44]];
                g.a(lIIIIlIlIl[lIIIIlIllI[45]], cG);
            }
            if (F.lllIIIlIlIII(e.j(fk), lIIIIlIllI[7])) {
                dk = lIIIIlIllI[1];
                if (F.lllIIIlIIIll(fr.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderGWD.c = lIIIIlIlIl[lIIIIlIllI[46]];
                    String[] stringArray = new String[lIIIIlIllI[0]];
                    stringArray[F.lIIIIlIllI[1]] = lIIIIlIlIl[lIIIIlIllI[47]];
                    if (F.lllIIIlIIlII(TileObjects.getNearest((String[])stringArray)) && F.lllIIIlIIIll(Dialog.isOpen() ? 1 : 0)) {
                        int[] nArray = new int[lIIIIlIllI[0]];
                        nArray[F.lIIIIlIllI[1]] = lIIIIlIllI[48];
                        if (F.lllIIIlIIIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                            int[] nArray5 = new int[lIIIIlIllI[0]];
                            nArray5[F.lIIIIlIllI[1]] = lIIIIlIllI[48];
                            Inventory.getFirst((int[])nArray5).interact(lIIIIlIlIl[lIIIIlIllI[49]]);
                        }
                        String[] stringArray7 = new String[lIIIIlIllI[0]];
                        stringArray7[F.lIIIIlIllI[1]] = lIIIIlIlIl[lIIIIlIllI[50]];
                        TileObjects.getNearest((String[])stringArray7).interact(lIIIIlIlIl[lIIIIlIllI[51]]);
                        Time.sleepTicks((int)lIIIIlIllI[4]);
                        0;
                    }
                    g.a(cG);
                }
                if (F.lllIIIlIIIIl(fr.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderGWD.c = lIIIIlIlIl[lIIIIlIllI[52]];
                    g.a(lIIIIlIlIl[lIIIIlIllI[53]], cG);
                }
            }
            if (!F.lllIIIlIlIIl(e.j(fk), lIIIIlIllI[23]) || F.lllIIIlIlIII(e.j(fk), lIIIIlIllI[33])) {
                g.a(cG);
                if (F.lllIIIlIIllI(Players.getLocal().getWorldLocation().distanceTo(fn), lIIIIlIllI[6]) && F.lllIIIlIIIll(Dialog.isOpen() ? 1 : 0)) {
                    AccBuilderGWD.c = lIIIIlIlIl[lIIIIlIllI[54]];
                    Movement.walkTo((WorldPoint)fn);
                    0;
                    Time.sleepTicks((int)lIIIIlIllI[0]);
                    0;
                }
                if (F.lllIIIlIIlll(Players.getLocal().getWorldLocation().distanceTo(fn), lIIIIlIllI[6]) && F.lllIIIlIIIll(Dialog.isOpen() ? 1 : 0)) {
                    AccBuilderGWD.c = lIIIIlIlIl[lIIIIlIllI[55]];
                    g.a(lIIIIlIlIl[lIIIIlIllI[56]], cG);
                }
            }
            if (F.lllIIIlIlIII(e.j(fk), lIIIIlIllI[34])) {
                if (F.lllIIIlIIIll(Players.getLocal().getWorldLocation().getPlane())) {
                    AccBuilderGWD.c = lIIIIlIlIl[lIIIIlIllI[57]];
                    String[] stringArray = new String[lIIIIlIllI[0]];
                    stringArray[F.lIIIIlIllI[1]] = lIIIIlIlIl[lIIIIlIllI[58]];
                    TileObjects.getNearest((String[])stringArray).interact(lIIIIlIlIl[lIIIIlIllI[59]]);
                    Time.sleepTicks((int)lIIIIlIllI[4]);
                    0;
                }
                if (F.lllIIIlIlIII(Players.getLocal().getWorldLocation().getPlane(), lIIIIlIllI[0])) {
                    g.a(lIIIIlIlIl[lIIIIlIllI[60]], cG);
                }
            }
            if (F.lllIIIlIlIII(e.j(fk), lIIIIlIllI[35])) {
                if (F.lllIIIlIIllI(Players.getLocal().getWorldLocation().distanceTo(fo), lIIIIlIllI[6])) {
                    AccBuilderGWD.c = lIIIIlIlIl[lIIIIlIllI[61]];
                    Movement.walkTo((WorldPoint)fo);
                    0;
                    Time.sleepTicks((int)lIIIIlIllI[0]);
                    0;
                }
                if (F.lllIIIlIIlll(Players.getLocal().getWorldLocation().distanceTo(fo), lIIIIlIllI[6]) && F.lllIIIlIIIll(Dialog.isOpen() ? 1 : 0)) {
                    String[] stringArray = new String[lIIIIlIllI[0]];
                    stringArray[F.lIIIIlIllI[1]] = lIIIIlIlIl[lIIIIlIllI[62]];
                    TileObjects.getNearest((String[])stringArray).interact(lIIIIlIlIl[lIIIIlIllI[22]]);
                    Time.sleepTicks((int)lIIIIlIllI[3]);
                    0;
                }
                g.a(cG);
            }
            if (F.lllIIIlIlIII(e.j(fk), lIIIIlIllI[36])) {
                if (F.lllIIIlIIllI(Players.getLocal().getWorldLocation().distanceTo(fp), lIIIIlIllI[6])) {
                    AccBuilderGWD.c = lIIIIlIlIl[lIIIIlIllI[63]];
                    Movement.walkTo((WorldPoint)fp);
                    0;
                    Time.sleepTicks((int)lIIIIlIllI[0]);
                    0;
                }
                if (F.lllIIIlIIlll(Players.getLocal().getWorldLocation().distanceTo(fp), lIIIIlIllI[6])) {
                    AccBuilderGWD.c = lIIIIlIlIl[lIIIIlIllI[64]];
                    if (F.lllIIIlIIIll(Dialog.isOpen() ? 1 : 0)) {
                        int[] nArray = new int[lIIIIlIllI[0]];
                        nArray[F.lIIIIlIllI[1]] = lIIIIlIllI[65];
                        NPCs.getNearest((int[])nArray).interact(lIIIIlIlIl[lIIIIlIllI[66]]);
                    }
                    g.a(cG);
                }
            }
            if (F.lllIIIlIlIII(e.j(fk), lIIIIlIllI[37])) {
                llllIIIIIIII = new WorldArea(lIIIIlIllI[67], lIIIIlIllI[68], lIIIIlIllI[18], lIIIIlIllI[13], lIIIIlIllI[1]);
                if (F.lllIIIlIIIll(llllIIIIIIII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderGWD.c = lIIIIlIlIl[lIIIIlIllI[69]];
                    Movement.walkTo((WorldPoint)fq);
                    0;
                    Time.sleepTicks((int)lIIIIlIllI[0]);
                    0;
                }
                if (F.lllIIIlIIIIl(llllIIIIIIII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderGWD.c = lIIIIlIlIl[lIIIIlIllI[70]];
                    g.a(lIIIIlIlIl[lIIIIlIllI[71]], cG);
                }
            }
            if (F.lllIIIlIlIII(e.j(fk), lIIIIlIllI[38])) {
                String[] stringArray = new String[lIIIIlIllI[0]];
                stringArray[F.lIIIIlIllI[1]] = lIIIIlIlIl[lIIIIlIllI[72]];
                if (F.lllIIIlIIIll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    AccBuilderGWD.c = lIIIIlIlIl[lIIIIlIllI[73]];
                    int[] nArray = new int[lIIIIlIllI[0]];
                    nArray[F.lIIIIlIllI[1]] = lIIIIlIllI[15];
                    if (F.lllIIIlIIIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        int[] nArray6 = new int[lIIIIlIllI[0]];
                        nArray6[F.lIIIIlIllI[1]] = lIIIIlIllI[15];
                        int[] nArray7 = new int[lIIIIlIllI[0]];
                        nArray7[F.lIIIIlIllI[1]] = lIIIIlIllI[17];
                        Inventory.getFirst((int[])nArray6).useOn(Inventory.getFirst((int[])nArray7));
                        Time.sleepTicks((int)lIIIIlIllI[0]);
                        0;
                    }
                    int[] nArray8 = new int[lIIIIlIllI[0]];
                    nArray8[F.lIIIIlIllI[1]] = lIIIIlIllI[19];
                    if (F.lllIIIlIIIIl(Inventory.contains((int[])nArray8) ? 1 : 0)) {
                        int[] nArray9 = new int[lIIIIlIllI[0]];
                        nArray9[F.lIIIIlIllI[1]] = lIIIIlIllI[19];
                        String[] stringArray8 = new String[lIIIIlIllI[0]];
                        stringArray8[F.lIIIIlIllI[1]] = lIIIIlIlIl[lIIIIlIllI[74]];
                        Inventory.getFirst((int[])nArray9).useOn(Inventory.getFirst((String[])stringArray8));
                        Time.sleepTicks((int)lIIIIlIllI[0]);
                        0;
                    }
                }
                String[] stringArray9 = new String[lIIIIlIllI[0]];
                stringArray9[F.lIIIIlIllI[1]] = lIIIIlIlIl[lIIIIlIllI[75]];
                if (F.lllIIIlIIIIl(Inventory.contains((String[])stringArray9) ? 1 : 0)) {
                    AccBuilderGWD.c = lIIIIlIlIl[lIIIIlIllI[76]];
                    g.a(lIIIIlIlIl[lIIIIlIllI[77]], cG);
                }
            }
            if (F.lllIIIlIlIII(e.j(fk), lIIIIlIllI[39])) {
                String[] stringArray = new String[lIIIIlIllI[0]];
                stringArray[F.lIIIIlIllI[1]] = lIIIIlIlIl[lIIIIlIllI[78]];
                if (F.lllIIIlIIIll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    g.a(lIIIIlIlIl[lIIIIlIllI[79]], cG);
                }
                String[] stringArray10 = new String[lIIIIlIllI[0]];
                stringArray10[F.lIIIIlIllI[1]] = lIIIIlIlIl[lIIIIlIllI[80]];
                if (F.lllIIIlIIIIl(Inventory.contains((String[])stringArray10) ? 1 : 0)) {
                    if (F.lllIIIlIIIll(fs.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && F.lllIIIlIIllI(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lIIIIlIllI[81], lIIIIlIllI[82], lIIIIlIllI[1])), lIIIIlIllI[7])) {
                        if (F.lllIIIlIIllI(Players.getLocal().getWorldLocation().distanceTo(fo), lIIIIlIllI[6])) {
                            AccBuilderGWD.c = lIIIIlIlIl[lIIIIlIllI[83]];
                            Movement.walkTo((WorldPoint)fo);
                            0;
                            Time.sleepTicks((int)lIIIIlIllI[0]);
                            0;
                        }
                        if (F.lllIIIlIIlll(Players.getLocal().getWorldLocation().distanceTo(fo), lIIIIlIllI[6]) && F.lllIIIlIIIll(Dialog.isOpen() ? 1 : 0)) {
                            String[] stringArray11 = new String[lIIIIlIllI[0]];
                            stringArray11[F.lIIIIlIllI[1]] = lIIIIlIlIl[lIIIIlIllI[84]];
                            TileObjects.getNearest((String[])stringArray11).interact(lIIIIlIlIl[lIIIIlIllI[85]]);
                            Time.sleepTicks((int)lIIIIlIllI[3]);
                            0;
                        }
                        g.a(cG);
                    }
                    if (F.lllIIIlIIIIl(fs.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        String[] stringArray12 = new String[lIIIIlIllI[0]];
                        stringArray12[F.lIIIIlIllI[1]] = lIIIIlIlIl[lIIIIlIllI[86]];
                        if (F.lllIIIlIIIll(Inventory.contains((String[])stringArray12) ? 1 : 0)) {
                            AccBuilderGWD.c = lIIIIlIlIl[lIIIIlIllI[87]];
                            int[] nArray = new int[lIIIIlIllI[0]];
                            nArray[F.lIIIIlIllI[1]] = lIIIIlIllI[88];
                            TileObjects.getNearest((int[])nArray).interact(lIIIIlIlIl[lIIIIlIllI[89]]);
                            Time.sleepTicks((int)lIIIIlIllI[6]);
                            0;
                        }
                        String[] stringArray13 = new String[lIIIIlIllI[0]];
                        stringArray13[F.lIIIIlIllI[1]] = lIIIIlIlIl[lIIIIlIllI[90]];
                        if (F.lllIIIlIIIIl(Inventory.contains((String[])stringArray13) ? 1 : 0)) {
                            String[] stringArray14 = new String[lIIIIlIllI[0]];
                            stringArray14[F.lIIIIlIllI[1]] = lIIIIlIlIl[lIIIIlIllI[91]];
                            TileObjects.getNearest((String[])stringArray14).interact(lIIIIlIlIl[lIIIIlIllI[92]]);
                            Time.sleepTicks((int)lIIIIlIllI[6]);
                            0;
                        }
                        g.a(cG);
                    }
                    if (F.lllIIIlIIllI(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lIIIIlIllI[81], lIIIIlIllI[82], lIIIIlIllI[1])), lIIIIlIllI[3])) {
                        String[] stringArray15 = new String[lIIIIlIllI[0]];
                        stringArray15[F.lIIIIlIllI[1]] = lIIIIlIlIl[lIIIIlIllI[93]];
                        if (F.lllIIIlIIIIl(Inventory.contains((String[])stringArray15) ? 1 : 0)) {
                            AccBuilderGWD.c = lIIIIlIlIl[lIIIIlIllI[94]];
                            Movement.walkTo((WorldPoint)new WorldPoint(lIIIIlIllI[81], lIIIIlIllI[82], lIIIIlIllI[1]));
                            0;
                            Time.sleepTicks((int)lIIIIlIllI[0]);
                            0;
                        }
                    }
                    if (F.lllIIIlIIlll(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lIIIIlIllI[81], lIIIIlIllI[82], lIIIIlIllI[1])), lIIIIlIllI[3])) {
                        AccBuilderGWD.c = lIIIIlIlIl[lIIIIlIllI[95]];
                        g.a(lIIIIlIlIl[lIIIIlIllI[96]], cG);
                    }
                }
            }
            if (F.lllIIIlIlIII(e.j(fk), lIIIIlIllI[40])) {
                if (F.lllIIIlIIllI(Players.getLocal().getWorldLocation().distanceTo(dT), lIIIIlIllI[4])) {
                    AccBuilderGWD.c = lIIIIlIlIl[lIIIIlIllI[97]];
                    if (F.lllIIIlIIlll(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lIIIIlIllI[81], lIIIIlIllI[82], lIIIIlIllI[1])), lIIIIlIllI[3])) {
                        String[] stringArray = new String[lIIIIlIllI[0]];
                        stringArray[F.lIIIIlIllI[1]] = lIIIIlIlIl[lIIIIlIllI[98]];
                        Inventory.getFirst((String[])stringArray).interact(lIIIIlIlIl[lIIIIlIllI[99]]);
                        Time.sleepTicks((int)lIIIIlIllI[13]);
                        0;
                    }
                    Movement.walkTo((WorldPoint)dT);
                    0;
                    Time.sleepTicks((int)lIIIIlIllI[0]);
                    0;
                }
                if (F.lllIIIlIIlll(Players.getLocal().getWorldLocation().distanceTo(dT), lIIIIlIllI[4])) {
                    AccBuilderGWD.c = lIIIIlIlIl[lIIIIlIllI[100]];
                    g.a(lIIIIlIlIl[lIIIIlIllI[101]], cG);
                }
            }
            if (!F.lllIIIlIlIIl(e.j(fk), lIIIIlIllI[41]) || F.lllIIIlIlIII(e.j(fk), lIIIIlIllI[42])) {
                int[] nArray = new int[lIIIIlIllI[0]];
                nArray[F.lIIIIlIllI[1]] = lIIIIlIllI[102];
                if (F.lllIIIlIIIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    if (F.lllIIIlIIIlI(dk, lIIIIlIllI[0])) {
                        as.nj += lIIIIlIllI[0];
                        as.u(AccBuilderGWD.m);
                        dk += lIIIIlIllI[0];
                        as.nj = lIIIIlIllI[1];
                    }
                    int[] nArray10 = new int[lIIIIlIllI[0]];
                    nArray10[F.lIIIIlIllI[1]] = lIIIIlIllI[102];
                    Inventory.getFirst((int[])nArray10).interact(lIIIIlIlIl[lIIIIlIllI[103]]);
                    Time.sleepTicks((int)lIIIIlIllI[3]);
                    0;
                    g.a(cG);
                }
            }
        }
    }

    private static String lllIIIIlllII(String lllIllIllIIl, String lllIllIllIII) {
        lllIllIllIIl = new String(Base64.getDecoder().decode(lllIllIllIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllIllIlllII = new StringBuilder();
        char[] lllIllIllIll = lllIllIllIII.toCharArray();
        int lllIllIllIlI = lIIIIlIllI[1];
        char[] lllIllIlIlII = lllIllIllIIl.toCharArray();
        int lllIllIlIIll = lllIllIlIlII.length;
        int lllIllIlIIlI = lIIIIlIllI[1];
        while (F.lllIIIlIIIlI(lllIllIlIIlI, lllIllIlIIll)) {
            char lllIllIlllll = lllIllIlIlII[lllIllIlIIlI];
            lllIllIlllII.append((char)(lllIllIlllll ^ lllIllIllIll[lllIllIllIlI % lllIllIllIll.length]));
            0;
            ++lllIllIllIlI;
            ++lllIllIlIIlI;
            0;
            if (-1 < 1) continue;
            return null;
        }
        return String.valueOf(lllIllIlllII);
    }

    private static String lllIIIIlllIl(String lllIlllIlllI, String lllIlllIllIl) {
        try {
            SecretKeySpec lllIllllIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllIlllIllIl.getBytes(StandardCharsets.UTF_8)), lIIIIlIllI[18]), "DES");
            Cipher lllIllllIIII = Cipher.getInstance("DES");
            lllIllllIIII.init(lIIIIlIllI[3], lllIllllIIIl);
            return new String(lllIllllIIII.doFinal(Base64.getDecoder().decode(lllIlllIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllIlllIllll) {
            lllIlllIllll.printStackTrace();
            return null;
        }
    }

    private static boolean lllIIIlIIIIl(int n2) {
        return n2 != 0;
    }

    private static boolean lllIIIlIIlII(Object object) {
        return object != null;
    }

    private static boolean lllIIIlIIIll(int n2) {
        return n2 == 0;
    }

    private static boolean lllIIIlIIllI(int n2, int n3) {
        return n2 > n3;
    }

    private static void lllIIIIlllll() {
        lIIIIlIlIl = new String[lIIIIlIllI[137]];
        F.lIIIIlIlIl[F.lIIIIlIllI[1]] = F."Finished buying items, switching back to quest";
        F.lIIIIlIlIl[F.lIIIIlIllI[0]] = F."Nav to bank";
        F.lIIIIlIlIl[F.lIIIIlIllI[3]] = F."Handling banking";
        F.lIIIIlIlIl[F.lIIIIlIllI[6]] = F."We are missing quest supplies, switching to BUYING";
        F.lIIIIlIlIl[F.lIIIIlIllI[4]] = F."We are missing quest supplies, switching to BUYING";
        F.lIIIIlIlIl[F.lIIIIlIllI[13]] = F."Drink";
        F.lIIIIlIlIl[F.lIIIIlIllI[14]] = F."Nav to start";
        F.lIIIIlIlIl[F.lIIIIlIllI[16]] = F."Camelot teleport";
        F.lIIIIlIlIl[F.lIIIIlIllI[18]] = F."Break";
        F.lIIIIlIlIl[F.lIIIIlIllI[20]] = F."Starting quest";
        F.lIIIIlIlIl[F.lIIIIlIllI[7]] = F."Edmond";
        F.lIIIIlIlIl[F.lIIIIlIllI[24]] = F."Nav to picture";
        F.lIIIIlIlIl[F.lIIIIlIllI[25]] = F."Handling chat";
        F.lIIIIlIlIl[F.lIIIIlIllI[26]] = F."Alrena";
        F.lIIIIlIlIl[F.lIIIIlIllI[27]] = F."Picture";
        F.lIIIIlIlIl[F.lIIIIlIllI[28]] = F."Nav to picture";
        F.lIIIIlIlIl[F.lIIIIlIllI[29]] = F."Handling chat";
        F.lIIIIlIlIl[F.lIIIIlIllI[30]] = F."Picture";
        F.lIIIIlIlIl[F.lIIIIlIllI[31]] = F."Take";
        F.lIIIIlIlIl[F.lIIIIlIllI[32]] = F."Picture";
        F.lIIIIlIlIl[F.lIIIIlIllI[23]] = F."Nav to start";
        F.lIIIIlIlIl[F.lIIIIlIllI[33]] = F."Talking edmond";
        F.lIIIIlIlIl[F.lIIIIlIllI[34]] = F."Edmond";
        F.lIIIIlIlIl[F.lIIIIlIllI[35]] = F."Using water on mud";
        F.lIIIIlIlIl[F.lIIIIlIllI[36]] = F."Mud patch";
        F.lIIIIlIlIl[F.lIIIIlIllI[37]] = F."Dig";
        F.lIIIIlIlIl[F.lIIIIlIllI[38]] = F."Setting rope";
        F.lIIIIlIlIl[F.lIIIIlIllI[39]] = F."Grill";
        F.lIIIIlIlIl[F.lIIIIlIllI[40]] = F."Grill";
        F.lIIIIlIlIl[F.lIIIIlIllI[41]] = F."Open";
        F.lIIIIlIlIl[F.lIIIIlIllI[42]] = F."Rope";
        F.lIIIIlIlIl[F.lIIIIlIllI[43]] = F."Grill";
        F.lIIIIlIlIl[F.lIIIIlIllI[44]] = F."Talking edmond";
        F.lIIIIlIlIl[F.lIIIIlIllI[45]] = F."Edmond";
        F.lIIIIlIlIl[F.lIIIIlIllI[46]] = F."Entering west ardy";
        F.lIIIIlIlIl[F.lIIIIlIllI[47]] = F."Pipe";
        F.lIIIIlIlIl[F.lIIIIlIllI[49]] = F."Wear";
        F.lIIIIlIlIl[F.lIIIIlIllI[50]] = F."Pipe";
        F.lIIIIlIlIl[F.lIIIIlIllI[51]] = F."Climb-up";
        F.lIIIIlIlIl[F.lIIIIlIllI[52]] = F."Talk npc";
        F.lIIIIlIlIl[F.lIIIIlIllI[53]] = F."Jethick";
        F.lIIIIlIlIl[F.lIIIIlIllI[54]] = F."Nav to tall hosue";
        F.lIIIIlIlIl[F.lIIIIlIllI[55]] = F."Talk npc";
        F.lIIIIlIlIl[F.lIIIIlIllI[56]] = F."Martha Rehnison";
        F.lIIIIlIlIl[F.lIIIIlIllI[57]] = F."Going upstairs";
        F.lIIIIlIlIl[F.lIIIIlIllI[58]] = F."Stairs";
        F.lIIIIlIlIl[F.lIIIIlIllI[59]] = F."Walk-up";
        F.lIIIIlIlIl[F.lIIIIlIllI[60]] = F."Milli Rehnison";
        F.lIIIIlIlIl[F.lIIIIlIllI[61]] = F."Nav to SE house";
        F.lIIIIlIlIl[F.lIIIIlIllI[62]] = F."Door";
        F.lIIIIlIlIl[F.lIIIIlIllI[22]] = F."Open";
        F.lIIIIlIlIl[F.lIIIIlIllI[63]] = F."Nav to clerk";
        F.lIIIIlIlIl[F.lIIIIlIllI[64]] = F."Talk npc";
        F.lIIIIlIlIl[F.lIIIIlIllI[66]] = F."Talk-to";
        F.lIIIIlIlIl[F.lIIIIlIllI[69]] = F."Nav to bravek";
        F.lIIIIlIlIl[F.lIIIIlIllI[70]] = F."Talk npc";
        F.lIIIIlIlIl[F.lIIIIlIllI[71]] = F."Bravek";
        F.lIIIIlIlIl[F.lIIIIlIllI[72]] = F."Hangover cure";
        F.lIIIIlIlIl[F.lIIIIlIllI[73]] = F."Making hangover cure";
        F.lIIIIlIlIl[F.lIIIIlIllI[74]] = F."Chocolatey milk";
        F.lIIIIlIlIl[F.lIIIIlIllI[75]] = F."Hangover cure";
        F.lIIIIlIlIl[F.lIIIIlIllI[76]] = F."Talk npc";
        F.lIIIIlIlIl[F.lIIIIlIllI[77]] = F."Bravek";
        F.lIIIIlIlIl[F.lIIIIlIllI[78]] = F."Warrant";
        F.lIIIIlIlIl[F.lIIIIlIllI[79]] = F."Bravek";
        F.lIIIIlIlIl[F.lIIIIlIllI[80]] = F."Warrant";
        F.lIIIIlIlIl[F.lIIIIlIllI[83]] = F."Nav to SE house";
        F.lIIIIlIlIl[F.lIIIIlIllI[84]] = F."Door";
        F.lIIIIlIlIl[F.lIIIIlIllI[85]] = F."Open";
        F.lIIIIlIlIl[F.lIIIIlIllI[86]] = F."A small key";
        F.lIIIIlIlIl[F.lIIIIlIllI[87]] = F."Searching barrel";
        F.lIIIIlIlIl[F.lIIIIlIllI[89]] = F."Search";
        F.lIIIIlIlIl[F.lIIIIlIllI[90]] = F."A small key";
        F.lIIIIlIlIl[F.lIIIIlIllI[91]] = F."Spooky stairs";
        F.lIIIIlIlIl[F.lIIIIlIllI[92]] = F."Walk-down";
        F.lIIIIlIlIl[F.lIIIIlIllI[93]] = F."A small key";
        F.lIIIIlIlIl[F.lIIIIlIllI[94]] = F."Nav to elena";
        F.lIIIIlIlIl[F.lIIIIlIllI[95]] = F."Talk elena";
        F.lIIIIlIlIl[F.lIIIIlIllI[96]] = F."Elena";
        F.lIIIIlIlIl[F.lIIIIlIllI[97]] = F."Nav to start";
        F.lIIIIlIlIl[F.lIIIIlIllI[98]] = F."Camelot teleport";
        F.lIIIIlIlIl[F.lIIIIlIllI[99]] = F."Break";
        F.lIIIIlIlIl[F.lIIIIlIllI[100]] = F."finish quest";
        F.lIIIIlIlIl[F.lIIIIlIllI[101]] = F."Edmond";
        F.lIIIIlIlIl[F.lIIIIlIllI[103]] = F."Read";
        F.lIIIIlIlIl[F.lIIIIlIllI[111]] = F."Plague City";
        F.lIIIIlIlIl[F.lIIIIlIllI[112]] = F."ring of wealth (";
        F.lIIIIlIlIl[F.lIIIIlIllI[128]] = F."Yes.";
        F.lIIIIlIlIl[F.lIIIIlIllI[129]] = F."What's happened to her?";
        F.lIIIIlIlIl[F.lIIIIlIllI[130]] = F."Yes, I'll return it for you.";
        F.lIIIIlIlIl[F.lIIIIlIllI[131]] = F."I fear not a mere plague.";
        F.lIIIIlIlIl[F.lIIIIlIllI[132]] = F."I need permission to enter a plague house.";
        F.lIIIIlIlIl[F.lIIIIlIllI[133]] = F."This is urgent though! Someone's been kidnapped!";
        F.lIIIIlIlIl[F.lIIIIlIllI[134]] = F."This is really important though!";
        F.lIIIIlIlIl[F.lIIIIlIllI[135]] = F."Do you know what's in the cure?";
        F.lIIIIlIlIl[F.lIIIIlIllI[136]] = F."They won't listen to me!";
    }

    private static void lllIIIlIIIII() {
        lIIIIlIllI = new int[138];
        F.lIIIIlIllI[0] = 1;
        F.lIIIIlIllI[1] = (0xC1 ^ 0xA2) & ~(0x39 ^ 0x5A);
        F.lIIIIlIllI[2] = 0xFFFF93EB & 0x7F9C;
        F.lIIIIlIllI[3] = 2;
        F.lIIIIlIllI[4] = 0x84 ^ 0x98 ^ (0x5F ^ 0x47);
        F.lIIIIlIllI[5] = -(0xFFFFF0F5 & 0x7F6F) & (0xFFFFFFED & 0x77FF);
        F.lIIIIlIllI[6] = 3;
        F.lIIIIlIllI[7] = 52 + 7 - -2 + 90 ^ 149 + 142 - 186 + 52;
        F.lIIIIlIllI[8] = -(0xFFFFD0D1 & 0x6FBF) & (0xFFFFFFDF & 0x5FF7);
        F.lIIIIlIllI[9] = 0xFFFFFF4F & 0x1FFA;
        F.lIIIIlIllI[10] = -(0xFFFFA5F7 & 0x7BAA) & (0xFFFFF9FF & 0x2FEF);
        F.lIIIIlIllI[11] = 0xFFFFFFFF & 0x3BA;
        F.lIIIIlIllI[12] = 0xFFFF9FFB & 0x63BC;
        F.lIIIIlIllI[13] = 0xC2 ^ 0xC7;
        F.lIIIIlIllI[14] = 0x20 ^ 0x26;
        F.lIIIIlIllI[15] = 0xFFFF9FF7 & 0x67BF;
        F.lIIIIlIllI[16] = 0x42 ^ 0x45;
        F.lIIIIlIllI[17] = -(0xFFFFF1DB & 0x3E7D) & (0xFFFFBFDF & 0x77FF);
        F.lIIIIlIllI[18] = 0x4E ^ 0x46;
        F.lIIIIlIllI[19] = (0x20 ^ 0x46) + (0x1C ^ 0x29) - (0x5B ^ 0x62) + (41 + 74 - 38 + 56);
        F.lIIIIlIllI[20] = 20 + 9 - 22 + 154 ^ 137 + 0 - 101 + 132;
        F.lIIIIlIllI[21] = 0xFFFFBFF1 & 0x715F;
        F.lIIIIlIllI[22] = 153 + 154 - 262 + 118 ^ 61 + 3 - 57 + 138;
        F.lIIIIlIllI[23] = 0x1A ^ 0xE;
        F.lIIIIlIllI[24] = 0xAE ^ 0xBD ^ (0x51 ^ 0x49);
        F.lIIIIlIllI[25] = 39 + 22 - -100 + 10 ^ 130 + 53 - 116 + 100;
        F.lIIIIlIllI[26] = 0x88 ^ 0x85;
        F.lIIIIlIllI[27] = 24 + 140 - 48 + 35 ^ 84 + 40 - -23 + 6;
        F.lIIIIlIllI[28] = 1 ^ 0xE;
        F.lIIIIlIllI[29] = 0x5D ^ 0x4D;
        F.lIIIIlIllI[30] = 0x7F ^ 0x6E;
        F.lIIIIlIllI[31] = 0xD2 ^ 0xC0;
        F.lIIIIlIllI[32] = 114 + 106 - 150 + 71 ^ 24 + 5 - -113 + 16;
        F.lIIIIlIllI[33] = 0x25 ^ 0x30;
        F.lIIIIlIllI[34] = 0xAA ^ 0xBC;
        F.lIIIIlIllI[35] = 0x3A ^ 0xE ^ (0xA8 ^ 0x8B);
        F.lIIIIlIllI[36] = 0x60 ^ 0x78;
        F.lIIIIlIllI[37] = 0x8B ^ 0x92;
        F.lIIIIlIllI[38] = 0xC1 ^ 0xA7 ^ (0x14 ^ 0x68);
        F.lIIIIlIllI[39] = 93 + 95 - 28 + 27 ^ 74 + 140 - 171 + 117;
        F.lIIIIlIllI[40] = 0x66 ^ 0x23 ^ (0xD0 ^ 0x89);
        F.lIIIIlIllI[41] = 0x90 ^ 0x8D;
        F.lIIIIlIllI[42] = 0x62 ^ 0x7C;
        F.lIIIIlIllI[43] = 0x47 ^ 0x58;
        F.lIIIIlIllI[44] = 0x85 ^ 0x8D ^ (0x6D ^ 0x45);
        F.lIIIIlIllI[45] = 0xF7 ^ 0xAB ^ (0x39 ^ 0x44);
        F.lIIIIlIllI[46] = 0x12 ^ 0x43 ^ (0x25 ^ 0x56);
        F.lIIIIlIllI[47] = 9 ^ 0x5F ^ (0x56 ^ 0x23);
        F.lIIIIlIllI[48] = 0xFFFFEFFE & 0x15E3;
        F.lIIIIlIllI[49] = 0xBB ^ 0x91 ^ (0x1F ^ 0x11);
        F.lIIIIlIllI[50] = 0xF ^ 0x2A;
        F.lIIIIlIllI[51] = 61 + 206 - 49 + 12 ^ 121 + 100 - 89 + 60;
        F.lIIIIlIllI[52] = 0xA5 ^ 0x82;
        F.lIIIIlIllI[53] = 0x19 ^ 0x31;
        F.lIIIIlIllI[54] = 0x20 ^ 0x56 ^ (0xD0 ^ 0x8F);
        F.lIIIIlIllI[55] = 0x79 ^ 5 ^ (0x96 ^ 0xC0);
        F.lIIIIlIllI[56] = 0x54 ^ 8 ^ (0x1B ^ 0x6C);
        F.lIIIIlIllI[57] = 0x22 ^ 0xE;
        F.lIIIIlIllI[58] = 45 + 110 - 152 + 152 ^ 22 + 64 - 6 + 102;
        F.lIIIIlIllI[59] = 0x30 ^ 0x62 ^ (0x62 ^ 0x1E);
        F.lIIIIlIllI[60] = 129 + 30 - 11 + 4 ^ 86 + 114 - 105 + 88;
        F.lIIIIlIllI[61] = 111 + 154 - 173 + 83 ^ 114 + 129 - 143 + 59;
        F.lIIIIlIllI[62] = 85 + 22 - -19 + 56 ^ 114 + 126 - 148 + 43;
        F.lIIIIlIllI[63] = 0x1C ^ 0x2F;
        F.lIIIIlIllI[64] = 0xFC ^ 0xB1 ^ (0xD8 ^ 0xA1);
        F.lIIIIlIllI[65] = 0xFFFFF5BF & 0x1ADF;
        F.lIIIIlIllI[66] = 0x7B ^ 0x4E;
        F.lIIIIlIllI[67] = 0xFFFF99F3 & 0x6FEF;
        F.lIIIIlIllI[68] = 0xFFFFDCFA & 0x2FF5;
        F.lIIIIlIllI[69] = 138 + 22 - 1 + 3 ^ 13 + 0 - -68 + 67;
        F.lIIIIlIllI[70] = 0xB4 ^ 0x83;
        F.lIIIIlIllI[71] = 0xAF ^ 0x97;
        F.lIIIIlIllI[72] = 0xF ^ 0x36;
        F.lIIIIlIllI[73] = 106 + 113 - 208 + 165 ^ 94 + 94 - 95 + 45;
        F.lIIIIlIllI[74] = 0xD2 ^ 0x86 ^ (0x43 ^ 0x2C);
        F.lIIIIlIllI[75] = 0x60 ^ 0x5C;
        F.lIIIIlIllI[76] = 0x2A ^ 0x7E ^ (0xAE ^ 0xC7);
        F.lIIIIlIllI[77] = 0x29 ^ 0x17;
        F.lIIIIlIllI[78] = 0xA9 ^ 0xB3 ^ (0xA4 ^ 0x81);
        F.lIIIIlIllI[79] = 0x97 ^ 0x9A ^ (0xC8 ^ 0x85);
        F.lIIIIlIllI[80] = 0x81 ^ 0xC0;
        F.lIIIIlIllI[81] = -(0xFFFFB71B & 0x7EE6) & (0xFFFFBFFF & 0x7FEF);
        F.lIIIIlIllI[82] = 0xFFFFEDEE & 0x37D9;
        F.lIIIIlIllI[83] = 0x20 ^ 0x24 ^ (0x63 ^ 0x25);
        F.lIIIIlIllI[84] = 0x41 ^ 2;
        F.lIIIIlIllI[85] = 0x62 ^ 0x26;
        F.lIIIIlIllI[86] = 0xC8 ^ 0x8D;
        F.lIIIIlIllI[87] = 10 + 46 - 43 + 119 ^ 40 + 64 - -86 + 4;
        F.lIIIIlIllI[88] = 0xFFFF89EE & 0x7FF3;
        F.lIIIIlIllI[89] = 0xDE ^ 0x99;
        F.lIIIIlIllI[90] = 0xE4 ^ 0xAC;
        F.lIIIIlIllI[91] = 0x7F ^ 0x36;
        F.lIIIIlIllI[92] = 0x4E ^ 4;
        F.lIIIIlIllI[93] = 0x61 ^ 0x74 ^ (0x9D ^ 0xC3);
        F.lIIIIlIllI[94] = 0xFF ^ 0xB3;
        F.lIIIIlIllI[95] = 0xD1 ^ 0x9C;
        F.lIIIIlIllI[96] = 0x50 ^ 0x1E;
        F.lIIIIlIllI[97] = 0xE8 ^ 0xA7;
        F.lIIIIlIllI[98] = 0xCE ^ 0x9E;
        F.lIIIIlIllI[99] = 0xF5 ^ 0xA4;
        F.lIIIIlIllI[100] = 0x61 ^ 0x20 ^ (0x72 ^ 0x61);
        F.lIIIIlIllI[101] = 0x2F ^ 0x7C;
        F.lIIIIlIllI[102] = 0xFFFFD5EF & 0x2FF1;
        F.lIIIIlIllI[103] = 0x60 ^ 5 ^ (0x15 ^ 0x24);
        F.lIIIIlIllI[104] = -(0xFFFFBEE7 & 0x599F) & (0xFFFFFFFF & 0x1DFE);
        F.lIIIIlIllI[105] = 0xFFFFEFC1 & 0x167E;
        F.lIIIIlIllI[106] = -(0xFFFFBAFF & 0x57C3) & (0xFFFFBFFE & 0x77DF);
        F.lIIIIlIllI[107] = 0xFFFFAFCD & 0x7EFE;
        F.lIIIIlIllI[108] = 0xFFFFEDFB & 0x73AC;
        F.lIIIIlIllI[109] = 0xFFFF97B5 & 0x6BCE;
        F.lIIIIlIllI[110] = 79 + 116 - 94 + 113 ^ 12 + 124 - 126 + 168;
        F.lIIIIlIllI[111] = 0xFB ^ 0xAE;
        F.lIIIIlIllI[112] = 0x49 ^ 0x7D ^ (0x42 ^ 0x20);
        F.lIIIIlIllI[113] = 72 + 13 - -65 + 15;
        F.lIIIIlIllI[114] = 0xFFFFDE2E & 0x2BD9;
        F.lIIIIlIllI[115] = 0xFFFF8FB7 & 0x7D4D;
        F.lIIIIlIllI[116] = -(0xFFFFF5F5 & 0x7E5B) & (0xFFFFFF5F & 0x7EFF);
        F.lIIIIlIllI[117] = 0xFFFFCA26 & 0x3FDF;
        F.lIIIIlIllI[118] = 0xFFFFBF2C & 0x4DD7;
        F.lIIIIlIllI[119] = -(0xFFFFFCBF & 0x7753) & (0xFFFFFDFF & 0x7FFE);
        F.lIIIIlIllI[120] = -(0xFFFFFB37 & 0x55FD) & (0xFFFFDDFE & Short.MAX_VALUE);
        F.lIIIIlIllI[121] = -1 & (0xFFFFDBFF & 0x2DDF);
        F.lIIIIlIllI[122] = 0xFFFF8EF7 & 0x7DFD;
        F.lIIIIlIllI[123] = -(0xFFFFE3BF & 0x5C53) & (0xFFFFD9FF & 0x6FF7);
        F.lIIIIlIllI[124] = -(0xFFFFDDA5 & 0x335F) & (0xFFFFBDF7 & 0x5FFE);
        F.lIIIIlIllI[125] = -(0xFFFFF1F7 & 0x7E2A) & (0xFFFFFFFF & 0x79EF);
        F.lIIIIlIllI[126] = 0xFFFF9EF1 & 0x6DCF;
        F.lIIIIlIllI[127] = -(0xFFFFDFBA & 0x235F) & (0xFFFFEFDF & 0x1FFD);
        F.lIIIIlIllI[128] = 0xEF ^ 0xB8;
        F.lIIIIlIllI[129] = 0xFA ^ 0xA2;
        F.lIIIIlIllI[130] = 0x6E ^ 0x37;
        F.lIIIIlIllI[131] = 0x20 ^ 0x7A;
        F.lIIIIlIllI[132] = 0x58 ^ 3;
        F.lIIIIlIllI[133] = 0xF5 ^ 0xB4 ^ (0xBA ^ 0xA7);
        F.lIIIIlIllI[134] = 0xFA ^ 0xA7;
        F.lIIIIlIllI[135] = 0x53 ^ 0x54 ^ (0x6B ^ 0x32);
        F.lIIIIlIllI[136] = 0x35 ^ 0x73 ^ (0x30 ^ 0x29);
        F.lIIIIlIllI[137] = 0x35 ^ 0x55;
    }

    private static boolean lllIIIlIlIII(int n2, int n3) {
        return n2 == n3;
    }
}

