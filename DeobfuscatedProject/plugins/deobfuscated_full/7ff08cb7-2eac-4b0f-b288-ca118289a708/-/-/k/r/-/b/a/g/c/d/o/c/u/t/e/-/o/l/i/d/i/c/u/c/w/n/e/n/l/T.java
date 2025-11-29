/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Locatable
 *  net.runelite.api.Prayer
 *  net.runelite.api.Skill
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Bank$WithdrawMode
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 *  net.unethicalite.api.widgets.Dialog
 *  net.unethicalite.api.widgets.Prayers
 *  net.unethicalite.client.Static
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
import net.runelite.api.Locatable;
import net.runelite.api.Prayer;
import net.runelite.api.Skill;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Prayers;
import net.unethicalite.client.Static;

public class T
implements ab {
    public static final /* synthetic */ WorldPoint lb;
    public static final /* synthetic */ WorldPoint lc;
    public static /* synthetic */ String[] cG;
    static /* synthetic */ boolean lh;
    private static /* synthetic */ String[] llllIllll;
    static /* synthetic */ boolean dl;
    static /* synthetic */ boolean lg;
    public static final /* synthetic */ WorldPoint ld;
    public static final /* synthetic */ WorldPoint le;
    public static /* synthetic */ boolean bv;
    private static /* synthetic */ int[] lllllIllI;
    public static /* synthetic */ List<d> bx;
    static /* synthetic */ boolean lf;
    static /* synthetic */ boolean li;
    static /* synthetic */ int dk;

    @Override
    public boolean ah() {
        int n2;
        if (T.llIlIlIlllll(e.j(lllllIllI[14]), lllllIllI[23]) && T.llIlIlIlllII(Dialog.isOpen() ? 1 : 0)) {
            n2 = lllllIllI[1];
            0;
            if (-(0xBC ^ 0xAC ^ (0xA6 ^ 0xB3)) >= 0) {
                return ((0xD2 ^ 0xB1 ^ (0x29 ^ 0x19)) & (226 + 136 - 181 + 54 ^ 139 + 87 - 179 + 137 ^ -1)) != 0;
            }
        } else {
            n2 = lllllIllI[0];
        }
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    private static boolean an() {
        void lIlIlllIlIIll;
        int[] nArray = new int[lllllIllI[9]];
        nArray[T.lllllIllI[0]] = lllllIllI[19];
        nArray[T.lllllIllI[1]] = lllllIllI[37];
        nArray[T.lllllIllI[2]] = lllllIllI[46];
        nArray[T.lllllIllI[7]] = lllllIllI[39];
        int[] nArray2 = nArray;
        int lIlIlllIlIIlI = lllllIllI[0];
        while (T.llIlIlIllIll(lIlIlllIlIIlI, ((void)lIlIlllIlIIll).length)) {
            int[] nArray3 = new int[lllllIllI[1]];
            nArray3[T.lllllIllI[0]] = lIlIlllIlIIll[lIlIlllIlIIlI];
            if (T.llIlIlIlllII(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                return lllllIllI[0];
            }
            ++lIlIlllIlIIlI;
            0;
            if (3 > -1) continue;
            return false;
        }
        return lllllIllI[1];
    }

    private static String llIlIIllIIIl(String lIlIllIlIIIll, String lIlIllIlIIlII) {
        try {
            SecretKeySpec lIlIllIlIlIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIlIllIlIIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIlIllIlIIlll = Cipher.getInstance("Blowfish");
            lIlIllIlIIlll.init(lllllIllI[2], lIlIllIlIlIII);
            return new String(lIlIllIlIIlll.doFinal(Base64.getDecoder().decode(lIlIllIlIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIlIllIlIIllI) {
            lIlIllIlIIllI.printStackTrace();
            return null;
        }
    }

    private static boolean llIlIlIllllI(int n2) {
        return n2 > 0;
    }

    static {
        T.llIlIlIllIII();
        T.llIlIlIlIlII();
        lb = new WorldPoint(lllllIllI[341], lllllIllI[342], lllllIllI[0]);
        lc = new WorldPoint(lllllIllI[343], lllllIllI[344], lllllIllI[0]);
        ld = new WorldPoint(lllllIllI[345], lllllIllI[346], lllllIllI[1]);
        le = new WorldPoint(lllllIllI[347], lllllIllI[348], lllllIllI[0]);
        bx = new ArrayList<d>();
        String[] stringArray = new String[lllllIllI[43]];
        stringArray[T.lllllIllI[0]] = llllIllll[lllllIllI[349]];
        stringArray[T.lllllIllI[1]] = llllIllll[lllllIllI[350]];
        stringArray[T.lllllIllI[2]] = llllIllll[lllllIllI[351]];
        stringArray[T.lllllIllI[7]] = llllIllll[lllllIllI[352]];
        stringArray[T.lllllIllI[9]] = llllIllll[lllllIllI[353]];
        stringArray[T.lllllIllI[11]] = llllIllll[lllllIllI[354]];
        stringArray[T.lllllIllI[12]] = llllIllll[lllllIllI[355]];
        stringArray[T.lllllIllI[13]] = llllIllll[lllllIllI[356]];
        stringArray[T.lllllIllI[16]] = llllIllll[lllllIllI[357]];
        stringArray[T.lllllIllI[17]] = llllIllll[lllllIllI[358]];
        stringArray[T.lllllIllI[23]] = llllIllll[lllllIllI[359]];
        stringArray[T.lllllIllI[26]] = llllIllll[lllllIllI[360]];
        stringArray[T.lllllIllI[28]] = llllIllll[lllllIllI[361]];
        stringArray[T.lllllIllI[38]] = llllIllll[lllllIllI[362]];
        stringArray[T.lllllIllI[40]] = llllIllll[lllllIllI[363]];
        stringArray[T.lllllIllI[20]] = llllIllll[lllllIllI[364]];
        cG = stringArray;
    }

    public static void cW() {
        block211: {
            WorldPoint lIlIllllIIlIl;
            WorldPoint lIlIllllIIllI;
            BankLocation lIlIllllIIlll;
            block217: {
                block219: {
                    block221: {
                        block220: {
                            block218: {
                                block212: {
                                    block216: {
                                        block214: {
                                            block215: {
                                                block213: {
                                                    if (T.llIlIlIllIlI(bv ? 1 : 0)) {
                                                        AccBuilderGWD.c = llllIllll[lllllIllI[0]];
                                                        b.a(bx);
                                                        if (T.llIlIlIllIll(bx.size(), lllllIllI[1])) {
                                                            System.out.println(llllIllll[lllllIllI[1]]);
                                                            bv = lllllIllI[0];
                                                        }
                                                    }
                                                    if (!T.llIlIlIlllII(bv ? 1 : 0)) break block211;
                                                    String[] stringArray = new String[lllllIllI[1]];
                                                    stringArray[T.lllllIllI[0]] = llllIllll[lllllIllI[2]];
                                                    if (T.llIlIlIllIlI(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                                                        li = lllllIllI[1];
                                                        lh = lllllIllI[1];
                                                        lf = lllllIllI[1];
                                                        lg = lllllIllI[1];
                                                    }
                                                    int[] nArray = new int[lllllIllI[1]];
                                                    nArray[T.lllllIllI[0]] = lllllIllI[3];
                                                    if (T.llIlIlIllIlI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                                                        lh = lllllIllI[1];
                                                    }
                                                    int[] nArray2 = new int[lllllIllI[1]];
                                                    nArray2[T.lllllIllI[0]] = lllllIllI[4];
                                                    if (T.llIlIlIllIlI(Inventory.contains((int[])nArray2) ? 1 : 0)) {
                                                        lf = lllllIllI[1];
                                                    }
                                                    int[] nArray3 = new int[lllllIllI[1]];
                                                    nArray3[T.lllllIllI[0]] = lllllIllI[5];
                                                    if (T.llIlIlIllIlI(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                                                        lg = lllllIllI[1];
                                                    }
                                                    if (T.llIlIlIllIlI(Inventory.contains((int[])f.bc) ? 1 : 0) && T.llIlIlIllIll(Movement.getRunEnergy(), lllllIllI[6])) {
                                                        Inventory.getFirst((int[])f.bc).interact(llllIllll[lllllIllI[7]]);
                                                        Time.sleepTicks((int)lllllIllI[1]);
                                                        0;
                                                    }
                                                    if (T.llIlIlIllIlI(Inventory.contains((int[])f.aZ) ? 1 : 0) && T.llIlIlIllIll(Prayers.getPoints(), lllllIllI[8])) {
                                                        Inventory.getFirst((int[])f.aZ).interact(llllIllll[lllllIllI[9]]);
                                                    }
                                                    if (!T.llIlIlIllIll(Combat.getMissingHealth(), lllllIllI[10]) || T.llIlIlIlllIl(T.llIlIlIllIIl(e.w(), 51.0))) {
                                                        String[] stringArray2 = new String[lllllIllI[1]];
                                                        stringArray2[T.lllllIllI[0]] = llllIllll[lllllIllI[11]];
                                                        if (T.llIlIlIllIlI(Inventory.contains((String[])stringArray2) ? 1 : 0)) {
                                                            String[] stringArray3 = new String[lllllIllI[1]];
                                                            stringArray3[T.lllllIllI[0]] = llllIllll[lllllIllI[12]];
                                                            Inventory.getFirst((String[])stringArray3).interact(llllIllll[lllllIllI[13]]);
                                                        }
                                                    }
                                                    if (T.llIlIlIlllII(Movement.isRunEnabled() ? 1 : 0) && T.llIlIlIllllI(Movement.getRunEnergy())) {
                                                        Movement.toggleRun();
                                                    }
                                                    if (!T.llIlIlIlllII(T.an() ? 1 : 0) || !T.llIlIlIllIll(e.j(lllllIllI[14]), lllllIllI[2]) || !T.llIlIlIlllll(e.J(), lllllIllI[15])) break block212;
                                                    lIlIllllIIlll = BankLocation.getNearest();
                                                    if (T.llIlIllIIIII(lIlIllllIIlll) && T.llIlIlIlllII(lIlIllllIIlll.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                                        AccBuilderGWD.c = llllIllll[lllllIllI[16]];
                                                        Movement.walkTo((BankLocation)lIlIllllIIlll);
                                                        0;
                                                        Time.sleepTicks((int)lllllIllI[2]);
                                                        0;
                                                    }
                                                    if (!T.llIlIllIIIII(lIlIllllIIlll) || !T.llIlIlIllIlI(lIlIllllIIlll.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block212;
                                                    AccBuilderGWD.c = llllIllll[lllllIllI[17]];
                                                    if (T.llIlIlIlllII(Bank.isOpen() ? 1 : 0)) {
                                                        a.a();
                                                        Time.sleepUntil(() -> Bank.isOpen(), (int)lllllIllI[18]);
                                                        0;
                                                    }
                                                    if (!T.llIlIlIllIlI(Bank.isOpen() ? 1 : 0)) break block212;
                                                    if (T.llIlIlIllllI(Inventory.getAll().size())) {
                                                        Bank.depositInventory();
                                                        Time.sleepTicks((int)lllllIllI[9]);
                                                        0;
                                                    }
                                                    if (T.llIlIlIllllI(Equipment.getAll().size())) {
                                                        Bank.depositEquipment();
                                                        Time.sleepTicks((int)lllllIllI[2]);
                                                        0;
                                                    }
                                                    int[] nArray4 = new int[lllllIllI[1]];
                                                    nArray4[T.lllllIllI[0]] = lllllIllI[19];
                                                    if (!T.llIlIlIllIlI(Bank.contains((int[])nArray4) ? 1 : 0)) break block213;
                                                    int[] nArray5 = new int[lllllIllI[1]];
                                                    nArray5[T.lllllIllI[0]] = lllllIllI[19];
                                                    if (!T.llIlIlIlllll(Bank.getFirst((int[])nArray5).getQuantity(), lllllIllI[20])) break block214;
                                                }
                                                int[] nArray = new int[lllllIllI[1]];
                                                nArray[T.lllllIllI[0]] = lllllIllI[21];
                                                if (!T.llIlIlIllIlI(Bank.contains((int[])nArray) ? 1 : 0)) break block215;
                                                int[] nArray6 = new int[lllllIllI[1]];
                                                nArray6[T.lllllIllI[0]] = lllllIllI[21];
                                                if (!T.llIlIlIlllll(Bank.getFirst((int[])nArray6).getQuantity(), lllllIllI[20])) break block214;
                                            }
                                            int[] nArray = new int[lllllIllI[1]];
                                            nArray[T.lllllIllI[0]] = lllllIllI[22];
                                            if (!T.llIlIlIllIlI(Bank.contains((int[])nArray) ? 1 : 0)) break block216;
                                            int[] nArray7 = new int[lllllIllI[1]];
                                            nArray7[T.lllllIllI[0]] = lllllIllI[22];
                                            if (!T.llIlIlIllIll(Bank.getFirst((int[])nArray7).getQuantity(), lllllIllI[20])) break block216;
                                        }
                                        T.Q();
                                        System.out.println(llllIllll[lllllIllI[23]]);
                                        bv = lllllIllI[1];
                                        return;
                                    }
                                    int[] nArray = new int[lllllIllI[1]];
                                    nArray[T.lllllIllI[0]] = lllllIllI[24];
                                    if (T.llIlIlIllIlI(Bank.contains((int[])nArray) ? 1 : 0)) {
                                        int[] nArray8 = new int[lllllIllI[1]];
                                        nArray8[T.lllllIllI[0]] = lllllIllI[24];
                                        if (T.llIlIlIllIll(Bank.getFirst((int[])nArray8).getQuantity(), lllllIllI[25])) {
                                            T.Q();
                                            System.out.println(llllIllll[lllllIllI[26]]);
                                            bv = lllllIllI[1];
                                            return;
                                        }
                                    }
                                    int[] nArray9 = new int[lllllIllI[1]];
                                    nArray9[T.lllllIllI[0]] = lllllIllI[27];
                                    if (T.llIlIlIllIlI(Bank.contains((int[])nArray9) ? 1 : 0)) {
                                        int[] nArray10 = new int[lllllIllI[1]];
                                        nArray10[T.lllllIllI[0]] = lllllIllI[27];
                                        if (T.llIlIlIllIll(Bank.getFirst((int[])nArray10).getQuantity(), lllllIllI[7])) {
                                            T.Q();
                                            System.out.println(llllIllll[lllllIllI[28]]);
                                            bv = lllllIllI[1];
                                            return;
                                        }
                                    }
                                    int[] nArray11 = new int[lllllIllI[29]];
                                    nArray11[T.lllllIllI[0]] = lllllIllI[19];
                                    nArray11[T.lllllIllI[1]] = lllllIllI[22];
                                    nArray11[T.lllllIllI[2]] = lllllIllI[21];
                                    nArray11[T.lllllIllI[7]] = lllllIllI[30];
                                    nArray11[T.lllllIllI[9]] = lllllIllI[31];
                                    nArray11[T.lllllIllI[11]] = lllllIllI[32];
                                    nArray11[T.lllllIllI[12]] = lllllIllI[33];
                                    nArray11[T.lllllIllI[13]] = lllllIllI[34];
                                    nArray11[T.lllllIllI[16]] = lllllIllI[35];
                                    nArray11[T.lllllIllI[17]] = lllllIllI[36];
                                    nArray11[T.lllllIllI[23]] = lllllIllI[24];
                                    nArray11[T.lllllIllI[26]] = lllllIllI[27];
                                    nArray11[T.lllllIllI[28]] = lllllIllI[37];
                                    nArray11[T.lllllIllI[38]] = lllllIllI[39];
                                    nArray11[T.lllllIllI[40]] = lllllIllI[41];
                                    nArray11[T.lllllIllI[20]] = lllllIllI[42];
                                    nArray11[T.lllllIllI[43]] = lllllIllI[44];
                                    if (T.llIlIlIlllII(e.d(nArray11) ? 1 : 0)) {
                                        T.Q();
                                        System.out.println(llllIllll[lllllIllI[38]]);
                                        bv = lllllIllI[1];
                                        return;
                                    }
                                    int[] nArray12 = new int[lllllIllI[29]];
                                    nArray12[T.lllllIllI[0]] = lllllIllI[19];
                                    nArray12[T.lllllIllI[1]] = lllllIllI[22];
                                    nArray12[T.lllllIllI[2]] = lllllIllI[21];
                                    nArray12[T.lllllIllI[7]] = lllllIllI[30];
                                    nArray12[T.lllllIllI[9]] = lllllIllI[31];
                                    nArray12[T.lllllIllI[11]] = lllllIllI[32];
                                    nArray12[T.lllllIllI[12]] = lllllIllI[33];
                                    nArray12[T.lllllIllI[13]] = lllllIllI[34];
                                    nArray12[T.lllllIllI[16]] = lllllIllI[35];
                                    nArray12[T.lllllIllI[17]] = lllllIllI[36];
                                    nArray12[T.lllllIllI[23]] = lllllIllI[24];
                                    nArray12[T.lllllIllI[26]] = lllllIllI[27];
                                    nArray12[T.lllllIllI[28]] = lllllIllI[37];
                                    nArray12[T.lllllIllI[38]] = lllllIllI[39];
                                    nArray12[T.lllllIllI[40]] = lllllIllI[41];
                                    nArray12[T.lllllIllI[20]] = lllllIllI[42];
                                    nArray12[T.lllllIllI[43]] = lllllIllI[44];
                                    if (T.llIlIlIllIlI(e.d(nArray12) ? 1 : 0)) {
                                        a.a(lllllIllI[19], lllllIllI[11]);
                                        a.a(lllllIllI[22], lllllIllI[11]);
                                        a.a(lllllIllI[21], lllllIllI[11]);
                                        a.b(f.bc, lllllIllI[11]);
                                        a.a(lllllIllI[35], lllllIllI[13]);
                                        a.b(f.bm, lllllIllI[1]);
                                        a.a(lllllIllI[42], lllllIllI[1]);
                                        a.a(lllllIllI[44], lllllIllI[1]);
                                        a.a(lllllIllI[39], lllllIllI[1]);
                                        a.a(lllllIllI[36], lllllIllI[1]);
                                        a.a(lllllIllI[45], lllllIllI[2]);
                                        a.a(lllllIllI[46], lllllIllI[47]);
                                    }
                                }
                                if (T.llIlIlIllIlI(T.an() ? 1 : 0) && T.llIlIlIllIll(e.j(lllllIllI[14]), lllllIllI[1])) {
                                    if (T.llIlIllIIIIl(Players.getLocal().getWorldLocation().distanceTo(lb), lllllIllI[12])) {
                                        AccBuilderGWD.c = llllIllll[lllllIllI[40]];
                                        Movement.walkTo((WorldPoint)lb);
                                        0;
                                        Time.sleepTicks((int)lllllIllI[1]);
                                        0;
                                    }
                                    if (T.llIlIllIIIlI(Players.getLocal().getWorldLocation().distanceTo(lb), lllllIllI[12])) {
                                        AccBuilderGWD.c = llllIllll[lllllIllI[20]];
                                        g.a(llllIllll[lllllIllI[43]], cG, lllllIllI[1]);
                                    }
                                }
                                if (T.llIlIllIIIll(e.j(lllllIllI[14]), lllllIllI[1]) && T.llIlIlIllIlI(T.an() ? 1 : 0)) {
                                    lIlIllllIIlll = new WorldPoint(lllllIllI[48], lllllIllI[49], lllllIllI[0]);
                                    if (T.llIlIllIIIIl(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lIlIllllIIlll), lllllIllI[16])) {
                                        AccBuilderGWD.c = llllIllll[lllllIllI[29]];
                                        Movement.walkTo((WorldPoint)lIlIllllIIlll);
                                        0;
                                        Time.sleepTicks((int)lllllIllI[1]);
                                        0;
                                    }
                                    if (T.llIlIllIIIlI(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lIlIllllIIlll), lllllIllI[16])) {
                                        g.a(llllIllll[lllllIllI[50]], cG, lllllIllI[1]);
                                    }
                                }
                                if (!T.llIlIllIIIll(e.j(lllllIllI[14]), lllllIllI[2])) break block217;
                                dk = lllllIllI[0];
                                int[] nArray = new int[lllllIllI[1]];
                                nArray[T.lllllIllI[0]] = lllllIllI[44];
                                if (T.llIlIlIllIlI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                                    int[] nArray13 = new int[lllllIllI[1]];
                                    nArray13[T.lllllIllI[0]] = lllllIllI[44];
                                    if (T.llIlIlIlllII(Equipment.contains((int[])nArray13) ? 1 : 0)) {
                                        String[] stringArray = new String[lllllIllI[1]];
                                        stringArray[T.lllllIllI[0]] = llllIllll[lllllIllI[51]];
                                        Inventory.getFirst((String[])stringArray).interact(llllIllll[lllllIllI[10]]);
                                    }
                                }
                                if (T.llIlIlIllIlI(Inventory.contains(item -> item.getName().contains(llllIllll[lllllIllI[340]])) ? 1 : 0) && T.llIlIlIlllII(Equipment.contains(item -> item.getName().contains(llllIllll[lllllIllI[339]])) ? 1 : 0)) {
                                    Inventory.getFirst(item -> item.getName().contains(llllIllll[lllllIllI[338]])).interact(llllIllll[lllllIllI[52]]);
                                }
                                if (T.llIlIlIllIlI(Inventory.contains(item -> item.getName().contains(llllIllll[lllllIllI[337]])) ? 1 : 0) && T.llIlIlIlllII(Equipment.contains(item -> item.getName().contains(llllIllll[lllllIllI[336]])) ? 1 : 0)) {
                                    Inventory.getFirst(item -> item.getName().contains(llllIllll[lllllIllI[335]])).interact(llllIllll[lllllIllI[53]]);
                                }
                                if (!T.llIlIllIIlII(Vars.getBit((int)lllllIllI[54]), lllllIllI[1])) break block218;
                                String[] stringArray = new String[lllllIllI[1]];
                                stringArray[T.lllllIllI[0]] = llllIllll[lllllIllI[55]];
                                if (!T.llIlIlIlllII(Inventory.contains((String[])stringArray) ? 1 : 0) || !T.llIlIlIlllII(li ? 1 : 0)) break block219;
                            }
                            if (T.llIlIllIIIIl(Players.getLocal().getWorldLocation().distanceTo(lb), lllllIllI[12])) {
                                AccBuilderGWD.c = llllIllll[lllllIllI[8]];
                                if (T.llIlIlIllIlI(Inventory.isFull() ? 1 : 0)) {
                                    int[] nArray = new int[lllllIllI[1]];
                                    nArray[T.lllllIllI[0]] = lllllIllI[35];
                                    if (T.llIlIlIllIlI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                                        int[] nArray14 = new int[lllllIllI[1]];
                                        nArray14[T.lllllIllI[0]] = lllllIllI[35];
                                        Inventory.getFirst((int[])nArray14).interact(llllIllll[lllllIllI[56]]);
                                        Time.sleepTicks((int)lllllIllI[1]);
                                        0;
                                    }
                                }
                                Movement.walkTo((WorldPoint)lb);
                                0;
                                Time.sleepTicks((int)lllllIllI[1]);
                                0;
                            }
                            if (!T.llIlIllIIIlI(Players.getLocal().getWorldLocation().distanceTo(lb), lllllIllI[12])) break block219;
                            AccBuilderGWD.c = llllIllll[lllllIllI[57]];
                            if (T.llIlIlIlllII(Dialog.isOpen() ? 1 : 0)) {
                                g.a(llllIllll[lllllIllI[58]], cG, lllllIllI[1]);
                            }
                            if (T.llIlIllIIIll(Vars.getBit((int)lllllIllI[59]), lllllIllI[1])) {
                                String[] stringArray = new String[lllllIllI[2]];
                                stringArray[T.lllllIllI[0]] = llllIllll[lllllIllI[60]];
                                stringArray[T.lllllIllI[1]] = llllIllll[lllllIllI[61]];
                                g.a(stringArray);
                            }
                            if (T.llIlIllIIIll(Vars.getBit((int)lllllIllI[62]), lllllIllI[1])) {
                                String[] stringArray = new String[lllllIllI[1]];
                                stringArray[T.lllllIllI[0]] = llllIllll[lllllIllI[63]];
                                g.a(stringArray);
                            }
                            if (T.llIlIllIIIll(Vars.getBit((int)lllllIllI[64]), lllllIllI[1]) && !T.llIlIlIllIlI(Vars.getBit((int)lllllIllI[62]))) break block220;
                            String[] stringArray = new String[lllllIllI[1]];
                            stringArray[T.lllllIllI[0]] = llllIllll[lllllIllI[65]];
                            if (!T.llIlIlIlllII(Inventory.contains((String[])stringArray) ? 1 : 0)) break block221;
                        }
                        String[] stringArray = new String[lllllIllI[2]];
                        stringArray[T.lllllIllI[0]] = llllIllll[lllllIllI[15]];
                        stringArray[T.lllllIllI[1]] = llllIllll[lllllIllI[66]];
                        g.a(stringArray);
                    }
                    if (T.llIlIllIIIll(Vars.getBit((int)lllllIllI[67]), lllllIllI[1])) {
                        String[] stringArray = new String[lllllIllI[2]];
                        stringArray[T.lllllIllI[0]] = llllIllll[lllllIllI[68]];
                        stringArray[T.lllllIllI[1]] = llllIllll[lllllIllI[69]];
                        g.a(stringArray);
                    }
                    if (T.llIlIllIIIll(Vars.getBit((int)lllllIllI[54]), lllllIllI[1])) {
                        String[] stringArray = new String[lllllIllI[2]];
                        stringArray[T.lllllIllI[0]] = llllIllll[lllllIllI[70]];
                        stringArray[T.lllllIllI[1]] = llllIllll[lllllIllI[71]];
                        g.a(stringArray);
                    }
                }
                if ((T.llIlIlIlllII(Vars.getBit((int)lllllIllI[54])) && T.llIlIlIlllII(Vars.getBit((int)lllllIllI[67])) && !T.llIlIlIllIlI(Vars.getBit((int)lllllIllI[62])) || T.llIlIllIIIll(e.j(lllllIllI[72]), lllllIllI[20])) && T.llIlIlIlllII(Vars.getBit((int)lllllIllI[73]))) {
                    String[] stringArray = new String[lllllIllI[1]];
                    stringArray[T.lllllIllI[0]] = llllIllll[lllllIllI[74]];
                    if (T.llIlIlIllIlI(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                        lIlIllllIIlll = new WorldPoint(lllllIllI[75], lllllIllI[76], lllllIllI[0]);
                        String[] stringArray4 = new String[lllllIllI[1]];
                        stringArray4[T.lllllIllI[0]] = llllIllll[lllllIllI[77]];
                        if (T.llIlIllIIlIl(NPCs.getNearest((String[])stringArray4))) {
                            AccBuilderGWD.c = llllIllll[lllllIllI[78]];
                            Movement.walkTo((WorldPoint)lIlIllllIIlll);
                            0;
                            Time.sleepTicks((int)lllllIllI[1]);
                            0;
                        }
                        String[] stringArray5 = new String[lllllIllI[1]];
                        stringArray5[T.lllllIllI[0]] = llllIllll[lllllIllI[79]];
                        if (T.llIlIllIIIII(NPCs.getNearest((String[])stringArray5))) {
                            g.a(llllIllll[lllllIllI[80]], cG);
                        }
                    }
                }
                if (T.llIlIllIIIll(Vars.getBit((int)lllllIllI[73]), lllllIllI[1]) && (!T.llIlIlIllIlI(Vars.getBit((int)lllllIllI[81])) || T.llIlIlIlllII(lf ? 1 : 0))) {
                    String[] stringArray = new String[lllllIllI[1]];
                    stringArray[T.lllllIllI[0]] = llllIllll[lllllIllI[82]];
                    if (T.llIlIlIlllII(Inventory.contains((String[])stringArray) ? 1 : 0) && T.llIlIlIlllII(Vars.getBit((int)lllllIllI[83]))) {
                        T.cZ();
                    }
                    String[] stringArray6 = new String[lllllIllI[1]];
                    stringArray6[T.lllllIllI[0]] = llllIllll[lllllIllI[84]];
                    if (T.llIlIlIllIlI(Inventory.contains((String[])stringArray6) ? 1 : 0)) {
                        lIlIllllIIlll = new WorldPoint(lllllIllI[85], lllllIllI[86], lllllIllI[0]);
                        if (T.llIlIllIIIIl(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lIlIllllIIlll), lllllIllI[9]) && T.llIlIlIlllII(Vars.getBit((int)lllllIllI[81]))) {
                            AccBuilderGWD.c = llllIllll[lllllIllI[87]];
                            if (T.llIlIlIllIlI(Dialog.isOpen() ? 1 : 0)) {
                                Dialog.close();
                            }
                            Movement.walkTo((WorldPoint)lIlIllllIIlll);
                            0;
                            Time.sleepTicks((int)lllllIllI[1]);
                            0;
                        }
                        if (T.llIlIllIIIlI(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lIlIllllIIlll), lllllIllI[23])) {
                            if (T.llIlIlIlllII(Vars.getBit((int)lllllIllI[81]))) {
                                AccBuilderGWD.c = llllIllll[lllllIllI[88]];
                                String[] stringArray7 = new String[lllllIllI[1]];
                                stringArray7[T.lllllIllI[0]] = llllIllll[lllllIllI[89]];
                                if (T.llIlIlIllIlI(Inventory.contains((String[])stringArray7) ? 1 : 0)) {
                                    String[] stringArray8 = new String[lllllIllI[1]];
                                    stringArray8[T.lllllIllI[0]] = llllIllll[lllllIllI[90]];
                                    String[] stringArray9 = new String[lllllIllI[1]];
                                    stringArray9[T.lllllIllI[0]] = llllIllll[lllllIllI[91]];
                                    Inventory.getFirst((String[])stringArray8).useOn(TileObjects.getNearest((String[])stringArray9));
                                    Time.sleepTicks((int)lllllIllI[1]);
                                    0;
                                }
                                String[] stringArray10 = new String[lllllIllI[1]];
                                stringArray10[T.lllllIllI[0]] = llllIllll[lllllIllI[6]];
                                if (T.llIlIlIllIlI(Inventory.contains((String[])stringArray10) ? 1 : 0)) {
                                    String[] stringArray11 = new String[lllllIllI[1]];
                                    stringArray11[T.lllllIllI[0]] = llllIllll[lllllIllI[92]];
                                    String[] stringArray12 = new String[lllllIllI[1]];
                                    stringArray12[T.lllllIllI[0]] = llllIllll[lllllIllI[93]];
                                    Inventory.getFirst((String[])stringArray11).useOn(TileObjects.getNearest((String[])stringArray12));
                                    Time.sleepTicks((int)lllllIllI[1]);
                                    0;
                                }
                                String[] stringArray13 = new String[lllllIllI[1]];
                                stringArray13[T.lllllIllI[0]] = llllIllll[lllllIllI[94]];
                                if (T.llIlIlIllIlI(Inventory.contains((String[])stringArray13) ? 1 : 0)) {
                                    String[] stringArray14 = new String[lllllIllI[1]];
                                    stringArray14[T.lllllIllI[0]] = llllIllll[lllllIllI[95]];
                                    String[] stringArray15 = new String[lllllIllI[1]];
                                    stringArray15[T.lllllIllI[0]] = llllIllll[lllllIllI[96]];
                                    Inventory.getFirst((String[])stringArray14).useOn(TileObjects.getNearest((String[])stringArray15));
                                    Time.sleepTicks((int)lllllIllI[1]);
                                    0;
                                }
                                String[] stringArray16 = new String[lllllIllI[1]];
                                stringArray16[T.lllllIllI[0]] = llllIllll[lllllIllI[97]];
                                if (T.llIlIlIllIlI(Inventory.contains((String[])stringArray16) ? 1 : 0)) {
                                    String[] stringArray17 = new String[lllllIllI[1]];
                                    stringArray17[T.lllllIllI[0]] = llllIllll[lllllIllI[98]];
                                    String[] stringArray18 = new String[lllllIllI[1]];
                                    stringArray18[T.lllllIllI[0]] = llllIllll[lllllIllI[99]];
                                    Inventory.getFirst((String[])stringArray17).useOn(TileObjects.getNearest((String[])stringArray18));
                                    Time.sleepTicks((int)lllllIllI[1]);
                                    0;
                                }
                            }
                            if (T.llIlIllIIIll(Vars.getBit((int)lllllIllI[81]), lllllIllI[1])) {
                                String[] stringArray19 = new String[lllllIllI[1]];
                                stringArray19[T.lllllIllI[0]] = llllIllll[lllllIllI[100]];
                                if (T.llIlIlIllIlI(Inventory.contains((String[])stringArray19) ? 1 : 0)) {
                                    String[] stringArray20 = new String[lllllIllI[1]];
                                    stringArray20[T.lllllIllI[0]] = llllIllll[lllllIllI[101]];
                                    String[] stringArray21 = new String[lllllIllI[1]];
                                    stringArray21[T.lllllIllI[0]] = llllIllll[lllllIllI[102]];
                                    Inventory.getFirst((String[])stringArray20).useOn(TileObjects.getNearest((String[])stringArray21));
                                    Time.sleepTicks((int)lllllIllI[1]);
                                    0;
                                }
                                String[] stringArray22 = new String[lllllIllI[1]];
                                stringArray22[T.lllllIllI[0]] = llllIllll[lllllIllI[103]];
                                if (T.llIlIlIllIlI(Inventory.contains((String[])stringArray22) ? 1 : 0)) {
                                    String[] stringArray23 = new String[lllllIllI[1]];
                                    stringArray23[T.lllllIllI[0]] = llllIllll[lllllIllI[104]];
                                    String[] stringArray24 = new String[lllllIllI[1]];
                                    stringArray24[T.lllllIllI[0]] = llllIllll[lllllIllI[105]];
                                    Inventory.getFirst((String[])stringArray23).useOn(TileObjects.getNearest((String[])stringArray24));
                                    Time.sleepTicks((int)lllllIllI[1]);
                                    0;
                                }
                                String[] stringArray25 = new String[lllllIllI[1]];
                                stringArray25[T.lllllIllI[0]] = llllIllll[lllllIllI[106]];
                                if (T.llIlIlIllIlI(Inventory.contains((String[])stringArray25) ? 1 : 0)) {
                                    String[] stringArray26 = new String[lllllIllI[1]];
                                    stringArray26[T.lllllIllI[0]] = llllIllll[lllllIllI[107]];
                                    String[] stringArray27 = new String[lllllIllI[1]];
                                    stringArray27[T.lllllIllI[0]] = llllIllll[lllllIllI[108]];
                                    Inventory.getFirst((String[])stringArray26).useOn(TileObjects.getNearest((String[])stringArray27));
                                    Time.sleepTicks((int)lllllIllI[1]);
                                    0;
                                }
                                String[] stringArray28 = new String[lllllIllI[1]];
                                stringArray28[T.lllllIllI[0]] = llllIllll[lllllIllI[109]];
                                if (T.llIlIlIllIlI(Inventory.contains((String[])stringArray28) ? 1 : 0)) {
                                    String[] stringArray29 = new String[lllllIllI[1]];
                                    stringArray29[T.lllllIllI[0]] = llllIllll[lllllIllI[110]];
                                    String[] stringArray30 = new String[lllllIllI[1]];
                                    stringArray30[T.lllllIllI[0]] = llllIllll[lllllIllI[111]];
                                    Inventory.getFirst((String[])stringArray29).useOn(TileObjects.getNearest((String[])stringArray30));
                                    Time.sleepTicks((int)lllllIllI[1]);
                                    0;
                                }
                                String[] stringArray31 = new String[lllllIllI[1]];
                                stringArray31[T.lllllIllI[0]] = llllIllll[lllllIllI[112]];
                                lIlIllllIIllI = TileObjects.getNearest((String[])stringArray31);
                                if (T.llIlIllIIIII(lIlIllllIIllI) && T.llIlIlIlllII(lf ? 1 : 0)) {
                                    if (T.llIlIlIlllII(Reachable.isInteractable((Locatable)lIlIllllIIllI) ? 1 : 0)) {
                                        String[] stringArray32 = new String[lllllIllI[1]];
                                        stringArray32[T.lllllIllI[0]] = llllIllll[lllllIllI[113]];
                                        TileObjects.getNearest((String[])stringArray32).interact(llllIllll[lllllIllI[114]]);
                                        Time.sleepTicks((int)lllllIllI[16]);
                                        0;
                                    }
                                    if (T.llIlIlIllIlI(Reachable.isInteractable((Locatable)lIlIllllIIllI) ? 1 : 0) && T.llIlIlIlllII(Dialog.isOpen() ? 1 : 0)) {
                                        String[] stringArray33 = new String[lllllIllI[1]];
                                        stringArray33[T.lllllIllI[0]] = llllIllll[lllllIllI[115]];
                                        if (T.llIlIlIllIlI(lIlIllllIIllI.hasAction(stringArray33) ? 1 : 0)) {
                                            lIlIllllIIllI.interact(llllIllll[lllllIllI[116]]);
                                            Time.sleepTicks((int)lllllIllI[9]);
                                            0;
                                        }
                                        String[] stringArray34 = new String[lllllIllI[1]];
                                        stringArray34[T.lllllIllI[0]] = llllIllll[lllllIllI[117]];
                                        if (T.llIlIlIllIlI(lIlIllllIIllI.hasAction(stringArray34) ? 1 : 0)) {
                                            lIlIllllIIllI.interact(llllIllll[lllllIllI[118]]);
                                            Time.sleepTicks((int)lllllIllI[9]);
                                            0;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                if (T.llIlIllIIIll(Vars.getBit((int)lllllIllI[81]), lllllIllI[1]) && T.llIlIlIlllII(lf ? 1 : 0)) {
                    String[] stringArray = new String[lllllIllI[1]];
                    stringArray[T.lllllIllI[0]] = llllIllll[lllllIllI[119]];
                    if (T.llIlIlIllIlI(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                        String[] stringArray35 = new String[lllllIllI[1]];
                        stringArray35[T.lllllIllI[0]] = llllIllll[lllllIllI[120]];
                        String[] stringArray36 = new String[lllllIllI[1]];
                        stringArray36[T.lllllIllI[0]] = llllIllll[lllllIllI[121]];
                        Inventory.getFirst((String[])stringArray35).useOn(TileObjects.getNearest((String[])stringArray36));
                        Time.sleepTicks((int)lllllIllI[1]);
                        0;
                    }
                    String[] stringArray37 = new String[lllllIllI[1]];
                    stringArray37[T.lllllIllI[0]] = llllIllll[lllllIllI[122]];
                    if (T.llIlIlIllIlI(Inventory.contains((String[])stringArray37) ? 1 : 0)) {
                        String[] stringArray38 = new String[lllllIllI[1]];
                        stringArray38[T.lllllIllI[0]] = llllIllll[lllllIllI[123]];
                        String[] stringArray39 = new String[lllllIllI[1]];
                        stringArray39[T.lllllIllI[0]] = llllIllll[lllllIllI[124]];
                        Inventory.getFirst((String[])stringArray38).useOn(TileObjects.getNearest((String[])stringArray39));
                        Time.sleepTicks((int)lllllIllI[1]);
                        0;
                    }
                    String[] stringArray40 = new String[lllllIllI[1]];
                    stringArray40[T.lllllIllI[0]] = llllIllll[lllllIllI[125]];
                    if (T.llIlIlIllIlI(Inventory.contains((String[])stringArray40) ? 1 : 0)) {
                        String[] stringArray41 = new String[lllllIllI[1]];
                        stringArray41[T.lllllIllI[0]] = llllIllll[lllllIllI[126]];
                        String[] stringArray42 = new String[lllllIllI[1]];
                        stringArray42[T.lllllIllI[0]] = llllIllll[lllllIllI[127]];
                        Inventory.getFirst((String[])stringArray41).useOn(TileObjects.getNearest((String[])stringArray42));
                        Time.sleepTicks((int)lllllIllI[1]);
                        0;
                    }
                    String[] stringArray43 = new String[lllllIllI[1]];
                    stringArray43[T.lllllIllI[0]] = llllIllll[lllllIllI[128]];
                    if (T.llIlIlIllIlI(Inventory.contains((String[])stringArray43) ? 1 : 0)) {
                        String[] stringArray44 = new String[lllllIllI[1]];
                        stringArray44[T.lllllIllI[0]] = llllIllll[lllllIllI[129]];
                        String[] stringArray45 = new String[lllllIllI[1]];
                        stringArray45[T.lllllIllI[0]] = llllIllll[lllllIllI[130]];
                        Inventory.getFirst((String[])stringArray44).useOn(TileObjects.getNearest((String[])stringArray45));
                        Time.sleepTicks((int)lllllIllI[1]);
                        0;
                    }
                    String[] stringArray46 = new String[lllllIllI[1]];
                    stringArray46[T.lllllIllI[0]] = llllIllll[lllllIllI[25]];
                    lIlIllllIIlll = TileObjects.getNearest((String[])stringArray46);
                    if (T.llIlIllIIIII(lIlIllllIIlll) && T.llIlIlIlllII(lf ? 1 : 0)) {
                        if (T.llIlIlIlllII(Reachable.isInteractable((Locatable)lIlIllllIIlll) ? 1 : 0)) {
                            String[] stringArray47 = new String[lllllIllI[1]];
                            stringArray47[T.lllllIllI[0]] = llllIllll[lllllIllI[131]];
                            TileObjects.getNearest((String[])stringArray47).interact(llllIllll[lllllIllI[132]]);
                            Time.sleepTicks((int)lllllIllI[16]);
                            0;
                        }
                        if (T.llIlIlIllIlI(Reachable.isInteractable((Locatable)lIlIllllIIlll) ? 1 : 0) && T.llIlIlIlllII(Dialog.isOpen() ? 1 : 0)) {
                            String[] stringArray48 = new String[lllllIllI[1]];
                            stringArray48[T.lllllIllI[0]] = llllIllll[lllllIllI[133]];
                            if (T.llIlIlIllIlI(lIlIllllIIlll.hasAction(stringArray48) ? 1 : 0)) {
                                lIlIllllIIlll.interact(llllIllll[lllllIllI[134]]);
                                Time.sleepTicks((int)lllllIllI[9]);
                                0;
                            }
                            String[] stringArray49 = new String[lllllIllI[1]];
                            stringArray49[T.lllllIllI[0]] = llllIllll[lllllIllI[135]];
                            if (T.llIlIlIllIlI(lIlIllllIIlll.hasAction(stringArray49) ? 1 : 0)) {
                                lIlIllllIIlll.interact(llllIllll[lllllIllI[136]]);
                                Time.sleepTicks((int)lllllIllI[9]);
                                0;
                            }
                        }
                    }
                }
                if (T.llIlIlIllIlI(lf ? 1 : 0) && T.llIlIlIlllII(lg ? 1 : 0)) {
                    lIlIllllIIlll = new WorldPoint(lllllIllI[85], lllllIllI[86], lllllIllI[0]);
                    if (T.llIlIllIIIlI(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lIlIllllIIlll), lllllIllI[23])) {
                        int[] nArray = new int[lllllIllI[1]];
                        nArray[T.lllllIllI[0]] = lllllIllI[21];
                        Inventory.getFirst((int[])nArray).interact(llllIllll[lllllIllI[137]]);
                        Time.sleepTicks((int)lllllIllI[16]);
                        0;
                    }
                    lIlIllllIIllI = new WorldPoint(lllllIllI[138], lllllIllI[139], lllllIllI[0]);
                    if (T.llIlIlIlllII(Players.getLocal().getWorldLocation().equals((Object)lIlIllllIIllI) ? 1 : 0)) {
                        AccBuilderGWD.c = llllIllll[lllllIllI[140]];
                        if (T.llIlIlIlllII(Dialog.isOpen() ? 1 : 0)) {
                            Movement.walkTo((WorldPoint)lIlIllllIIllI);
                            0;
                            Time.sleepTicks((int)lllllIllI[1]);
                            0;
                        }
                        String[] stringArray = new String[lllllIllI[7]];
                        stringArray[T.lllllIllI[0]] = llllIllll[lllllIllI[141]];
                        stringArray[T.lllllIllI[1]] = llllIllll[lllllIllI[142]];
                        stringArray[T.lllllIllI[2]] = llllIllll[lllllIllI[143]];
                        g.a(stringArray);
                    }
                    if (T.llIlIlIllIlI(Players.getLocal().getWorldLocation().equals((Object)lIlIllllIIllI) ? 1 : 0)) {
                        AccBuilderGWD.c = llllIllll[lllllIllI[144]];
                        g.a(llllIllll[lllllIllI[145]], cG);
                    }
                }
                if (T.llIlIlIllIlI(lf ? 1 : 0) && T.llIlIlIllIlI(lg ? 1 : 0) && T.llIlIlIlllII(lh ? 1 : 0)) {
                    TileObject lIlIllllIIIIl;
                    TileObject lIlIllllIIIlI;
                    WorldArea lIlIllllIIIll;
                    String[] stringArray = new String[lllllIllI[1]];
                    stringArray[T.lllllIllI[0]] = llllIllll[lllllIllI[146]];
                    if (T.llIlIlIllIlI(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                        String[] stringArray50 = new String[lllllIllI[1]];
                        stringArray50[T.lllllIllI[0]] = llllIllll[lllllIllI[147]];
                        Inventory.getFirst((String[])stringArray50).interact(llllIllll[lllllIllI[148]]);
                    }
                    lIlIllllIIlll = new WorldArea(lllllIllI[149], lllllIllI[150], lllllIllI[51], lllllIllI[10], lllllIllI[0]);
                    lIlIllllIIllI = new WorldArea(lllllIllI[151], lllllIllI[152], lllllIllI[58], lllllIllI[58], lllllIllI[0]);
                    if (T.llIlIlIlllII(Players.getLocal().getWorldLocation().getPlane()) && T.llIlIlIlllII(lIlIllllIIlll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && T.llIlIlIlllII(lIlIllllIIllI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        lIlIllllIIlIl = new WorldPoint(lllllIllI[153], lllllIllI[154], lllllIllI[0]);
                        if (T.llIlIllIIIIl(Players.getLocal().getWorldLocation().distanceTo(lIlIllllIIlIl), lllllIllI[2])) {
                            AccBuilderGWD.c = llllIllll[lllllIllI[155]];
                            Movement.walkTo((WorldPoint)lIlIllllIIlIl);
                            0;
                            Time.sleepTicks((int)lllllIllI[1]);
                            0;
                        }
                        if (T.llIlIllIIIlI(Players.getLocal().getWorldLocation().distanceTo(lIlIllllIIlIl), lllllIllI[2])) {
                            String[] stringArray51 = new String[lllllIllI[1]];
                            stringArray51[T.lllllIllI[0]] = llllIllll[lllllIllI[156]];
                            TileObjects.getNearest((String[])stringArray51).interact(llllIllll[lllllIllI[157]]);
                            Time.sleepTicks((int)lllllIllI[11]);
                            0;
                        }
                    }
                    lIlIllllIIlIl = new WorldArea(lllllIllI[158], lllllIllI[159], lllllIllI[11], lllllIllI[16], lllllIllI[0]);
                    WorldArea lIlIllllIIlII = new WorldArea(lllllIllI[160], lllllIllI[161], lllllIllI[13], lllllIllI[7], lllllIllI[0]);
                    if (T.llIlIlIlllII(Players.getLocal().getWorldLocation().getPlane()) && T.llIlIlIllIlI(lIlIllllIIlll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        int[] nArray = new int[lllllIllI[1]];
                        nArray[T.lllllIllI[0]] = lllllIllI[162];
                        if (T.llIlIlIlllII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                            int[] nArray15 = new int[lllllIllI[1]];
                            nArray15[T.lllllIllI[0]] = lllllIllI[162];
                            if (T.llIlIllIIlIl(TileItems.getNearest((int[])nArray15)) && T.llIlIlIlllII(lIlIllllIIlII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && T.llIlIlIlllII(lIlIllllIIlIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && T.llIlIlIlllII(new WorldArea(lllllIllI[163], lllllIllI[164], lllllIllI[26], lllllIllI[12], lllllIllI[0]).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                AccBuilderGWD.c = llllIllll[lllllIllI[165]];
                                if (T.llIlIllIIlIl(Players.getLocal().getInteracting())) {
                                    int[] nArray16 = new int[lllllIllI[1]];
                                    nArray16[T.lllllIllI[0]] = lllllIllI[166];
                                    NPCs.getNearest((int[])nArray16).interact(llllIllll[lllllIllI[167]]);
                                    Time.sleepTicks((int)lllllIllI[11]);
                                    0;
                                }
                            }
                        }
                        int[] nArray17 = new int[lllllIllI[1]];
                        nArray17[T.lllllIllI[0]] = lllllIllI[162];
                        if (T.llIlIllIIIII(TileItems.getNearest((int[])nArray17))) {
                            int[] nArray18 = new int[lllllIllI[1]];
                            nArray18[T.lllllIllI[0]] = lllllIllI[162];
                            TileItems.getNearest((int[])nArray18).interact(llllIllll[lllllIllI[168]]);
                            Time.sleepTicks((int)lllllIllI[7]);
                            0;
                        }
                        int[] nArray19 = new int[lllllIllI[1]];
                        nArray19[T.lllllIllI[0]] = lllllIllI[162];
                        if (T.llIlIlIllIlI(Inventory.contains((int[])nArray19) ? 1 : 0) && T.llIlIlIlllII(lIlIllllIIlIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && T.llIlIlIlllII(lIlIllllIIlII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            lIlIllllIIIll = new WorldPoint(lllllIllI[169], lllllIllI[170], lllllIllI[0]);
                            if (T.llIlIlIlllII(Players.getLocal().getWorldLocation().equals((Object)lIlIllllIIIll) ? 1 : 0)) {
                                AccBuilderGWD.c = llllIllll[lllllIllI[171]];
                                e.c((WorldPoint)lIlIllllIIIll);
                                Time.sleepTicks((int)lllllIllI[2]);
                                0;
                            }
                            if (T.llIlIlIllIlI(Players.getLocal().getWorldLocation().equals((Object)lIlIllllIIIll) ? 1 : 0)) {
                                String[] stringArray52 = new String[lllllIllI[1]];
                                stringArray52[T.lllllIllI[0]] = llllIllll[lllllIllI[172]];
                                TileObjects.getNearest((String[])stringArray52).interact(llllIllll[lllllIllI[173]]);
                                Time.sleepTicks((int)lllllIllI[12]);
                                0;
                            }
                        }
                        if (!T.llIlIlIlllII(lIlIllllIIlIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || T.llIlIlIllIlI(lIlIllllIIlII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            lIlIllllIIIll = TileObjects.getNearest(tileObject -> {
                                int n2;
                                if (T.llIlIlIllIlI(tileObject.getName().contains(llllIllll[lllllIllI[334]]) ? 1 : 0) && T.llIlIlIllIlI(Reachable.isInteractable((Locatable)tileObject) ? 1 : 0)) {
                                    n2 = lllllIllI[1];
                                    0;
                                    if ((54 + 35 - -75 + 7 ^ 24 + 54 - -8 + 89) <= 2) {
                                        return ((0xF6 ^ 0xB3 ^ (0xA2 ^ 0xBD)) & (3 ^ 0x3A ^ (0xE ^ 0x6D) ^ -1)) != 0;
                                    }
                                } else {
                                    n2 = lllllIllI[0];
                                }
                                return n2 != 0;
                            });
                            AccBuilderGWD.c = llllIllll[lllllIllI[174]];
                            if (T.llIlIllIIIII(lIlIllllIIIll)) {
                                lIlIllllIIIll.interact(llllIllll[lllllIllI[175]]);
                                Time.sleepTicks((int)lllllIllI[7]);
                                0;
                            }
                        }
                    }
                    if (T.llIlIllIIIll(Players.getLocal().getWorldLocation().getPlane(), lllllIllI[1]) && T.llIlIlIlllII(new WorldArea(lllllIllI[176], lllllIllI[177], lllllIllI[11], lllllIllI[13], lllllIllI[1]).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        int[] nArray = new int[lllllIllI[1]];
                        nArray[T.lllllIllI[0]] = lllllIllI[178];
                        if (T.llIlIlIlllII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                            int[] nArray20 = new int[lllllIllI[1]];
                            nArray20[T.lllllIllI[0]] = lllllIllI[178];
                            if (T.llIlIllIIlIl(TileItems.getNearest((int[])nArray20))) {
                                AccBuilderGWD.c = llllIllll[lllllIllI[179]];
                                lIlIllllIIIll = NPCs.getNearest(nPC -> {
                                    int n2;
                                    if (T.llIlIlIllIlI(nPC.getName().contains(llllIllll[lllllIllI[333]]) ? 1 : 0) && T.llIlIllIIllI(nPC.getInteracting(), Players.getLocal()) && T.llIlIllIIIlI(nPC.getWorldLocation().distanceTo(Players.getLocal().getWorldLocation()), lllllIllI[1])) {
                                        n2 = lllllIllI[1];
                                        0;
                                        
                                        }
                                    } else {
                                        n2 = lllllIllI[0];
                                    }
                                    return n2 != 0;
                                });
                                if (T.llIlIllIIlIl(Players.getLocal().getInteracting()) && T.llIlIllIIlIl(lIlIllllIIIll)) {
                                    int[] nArray21 = new int[lllllIllI[1]];
                                    nArray21[T.lllllIllI[0]] = lllllIllI[180];
                                    NPCs.getNearest((int[])nArray21).interact(llllIllll[lllllIllI[181]]);
                                    Time.sleepTicks((int)lllllIllI[11]);
                                    0;
                                }
                            }
                        }
                        int[] nArray22 = new int[lllllIllI[1]];
                        nArray22[T.lllllIllI[0]] = lllllIllI[178];
                        if (T.llIlIllIIIII(TileItems.getNearest((int[])nArray22))) {
                            int[] nArray23 = new int[lllllIllI[1]];
                            nArray23[T.lllllIllI[0]] = lllllIllI[178];
                            TileItems.getNearest((int[])nArray23).interact(llllIllll[lllllIllI[182]]);
                            Time.sleepTicks((int)lllllIllI[7]);
                            0;
                        }
                        lIlIllllIIIll = new WorldArea(lllllIllI[183], lllllIllI[184], lllllIllI[12], lllllIllI[11], lllllIllI[1]);
                        int[] nArray24 = new int[lllllIllI[1]];
                        nArray24[T.lllllIllI[0]] = lllllIllI[178];
                        if (T.llIlIlIllIlI(Inventory.contains((int[])nArray24) ? 1 : 0) && T.llIlIlIlllII(lIlIllllIIIll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            lIlIllllIIIlI = new WorldPoint(lllllIllI[163], lllllIllI[170], lllllIllI[1]);
                            if (T.llIlIlIlllII(Players.getLocal().getWorldLocation().equals((Object)lIlIllllIIIlI) ? 1 : 0)) {
                                AccBuilderGWD.c = llllIllll[lllllIllI[185]];
                                e.c((WorldPoint)lIlIllllIIIlI);
                                Time.sleepTicks((int)lllllIllI[2]);
                                0;
                            }
                            if (T.llIlIlIllIlI(Players.getLocal().getWorldLocation().equals((Object)lIlIllllIIIlI) ? 1 : 0)) {
                                String[] stringArray53 = new String[lllllIllI[1]];
                                stringArray53[T.lllllIllI[0]] = llllIllll[lllllIllI[186]];
                                TileObjects.getNearest((String[])stringArray53).interact(llllIllll[lllllIllI[187]]);
                                Time.sleepTicks((int)lllllIllI[12]);
                                0;
                            }
                        }
                        if (T.llIlIlIllIlI(lIlIllllIIIll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && T.llIlIllIIIII(lIlIllllIIIlI = TileObjects.getNearest(tileObject -> {
                            int n2;
                            if (T.llIlIlIllIlI(tileObject.getName().contains(llllIllll[lllllIllI[332]]) ? 1 : 0) && T.llIlIlIllIlI(Reachable.isInteractable((Locatable)tileObject) ? 1 : 0)) {
                                n2 = lllllIllI[1];
                                0;
                                if ((56 + 135 - 178 + 157 ^ 66 + 81 - 111 + 138) <= 0) {
                                    return ((0x48 ^ 0x73 ^ (0x10 ^ 0x48)) & (128 + 138 - 35 + 19 ^ 23 + 140 - 68 + 58 ^ -1)) != 0;
                                }
                            } else {
                                n2 = lllllIllI[0];
                            }
                            return n2 != 0;
                        }))) {
                            lIlIllllIIIlI.interact(llllIllll[lllllIllI[188]]);
                            Time.sleepTicks((int)lllllIllI[7]);
                            0;
                        }
                    }
                    if (T.llIlIllIIIll(Players.getLocal().getWorldLocation().getPlane(), lllllIllI[2])) {
                        int[] nArray = new int[lllllIllI[1]];
                        nArray[T.lllllIllI[0]] = lllllIllI[189];
                        if (T.llIlIlIlllII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                            int[] nArray25 = new int[lllllIllI[1]];
                            nArray25[T.lllllIllI[0]] = lllllIllI[189];
                            if (T.llIlIllIIlIl(TileItems.getNearest((int[])nArray25))) {
                                AccBuilderGWD.c = llllIllll[lllllIllI[190]];
                                lIlIllllIIIll = NPCs.getNearest(nPC -> {
                                    int n2;
                                    if (T.llIlIlIllIlI(nPC.getName().contains(llllIllll[lllllIllI[331]]) ? 1 : 0) && T.llIlIllIIllI(nPC.getInteracting(), Players.getLocal()) && T.llIlIllIIIlI(nPC.getWorldLocation().distanceTo(Players.getLocal().getWorldLocation()), lllllIllI[1])) {
                                        n2 = lllllIllI[1];
                                        0;
                                        if (2 <= ((0xEC ^ 0xA9) & ~(0x15 ^ 0x50))) {
                                            return ((0xDE ^ 0x8E) & ~(0x94 ^ 0xC4) & ~((0x87 ^ 0xA7) & ~(0x22 ^ 2))) != 0;
                                        }
                                    } else {
                                        n2 = lllllIllI[0];
                                    }
                                    return n2 != 0;
                                });
                                if (T.llIlIllIIlIl(Players.getLocal().getInteracting()) && T.llIlIllIIlIl(lIlIllllIIIll)) {
                                    int[] nArray26 = new int[lllllIllI[1]];
                                    nArray26[T.lllllIllI[0]] = lllllIllI[191];
                                    NPCs.getNearest((int[])nArray26).interact(llllIllll[lllllIllI[192]]);
                                    Time.sleepTicks((int)lllllIllI[11]);
                                    0;
                                }
                            }
                        }
                        int[] nArray27 = new int[lllllIllI[1]];
                        nArray27[T.lllllIllI[0]] = lllllIllI[189];
                        if (T.llIlIllIIIII(TileItems.getNearest((int[])nArray27))) {
                            int[] nArray28 = new int[lllllIllI[1]];
                            nArray28[T.lllllIllI[0]] = lllllIllI[189];
                            TileItems.getNearest((int[])nArray28).interact(llllIllll[lllllIllI[193]]);
                            Time.sleepTicks((int)lllllIllI[7]);
                            0;
                        }
                        lIlIllllIIIll = new WorldArea(lllllIllI[149], lllllIllI[164], lllllIllI[10], lllllIllI[38], lllllIllI[2]);
                        int[] nArray29 = new int[lllllIllI[1]];
                        nArray29[T.lllllIllI[0]] = lllllIllI[189];
                        if (T.llIlIlIllIlI(Inventory.contains((int[])nArray29) ? 1 : 0) && T.llIlIlIlllII(lIlIllllIIIll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            lIlIllllIIIlI = new WorldPoint(lllllIllI[194], lllllIllI[159], lllllIllI[2]);
                            if (T.llIlIlIlllII(Players.getLocal().getWorldLocation().equals((Object)lIlIllllIIIlI) ? 1 : 0)) {
                                AccBuilderGWD.c = llllIllll[lllllIllI[195]];
                                e.c((WorldPoint)lIlIllllIIIlI);
                                Time.sleepTicks((int)lllllIllI[2]);
                                0;
                            }
                            if (T.llIlIlIllIlI(Players.getLocal().getWorldLocation().equals((Object)lIlIllllIIIlI) ? 1 : 0)) {
                                String[] stringArray54 = new String[lllllIllI[1]];
                                stringArray54[T.lllllIllI[0]] = llllIllll[lllllIllI[196]];
                                TileObjects.getNearest((String[])stringArray54).interact(llllIllll[lllllIllI[197]]);
                                Time.sleepTicks((int)lllllIllI[12]);
                                0;
                            }
                        }
                        if (T.llIlIlIllIlI(lIlIllllIIIll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && T.llIlIllIIIII(lIlIllllIIIlI = TileObjects.getNearest(tileObject -> {
                            int n2;
                            if (T.llIlIlIllIlI(tileObject.getName().contains(llllIllll[lllllIllI[330]]) ? 1 : 0) && T.llIlIlIllIlI(Reachable.isInteractable((Locatable)tileObject) ? 1 : 0)) {
                                n2 = lllllIllI[1];
                                0;
                                if (((0xF5 ^ 0xB4 ^ (0xC4 ^ 0xC2)) & (157 + 36 - 17 + 36 ^ 137 + 78 - 71 + 3 ^ -1)) != 0) {
                                    return ((0x71 ^ 0x5E ^ (0x96 ^ 0x98)) & (104 + 176 - 270 + 179 ^ 20 + 78 - 59 + 117 ^ -1)) != 0;
                                }
                            } else {
                                n2 = lllllIllI[0];
                            }
                            return n2 != 0;
                        }))) {
                            lIlIllllIIIlI.interact(llllIllll[lllllIllI[198]]);
                            Time.sleepTicks((int)lllllIllI[7]);
                            0;
                        }
                    }
                    if ((!T.llIlIlIlllII((lIlIllllIIIll = new WorldArea(lllllIllI[176], lllllIllI[177], lllllIllI[11], lllllIllI[13], lllllIllI[1])).contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || T.llIlIlIllIlI(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(lllllIllI[199], lllllIllI[200], lllllIllI[1])) ? 1 : 0)) && T.llIlIllIIIII(lIlIllllIIIlI = TileObjects.getNearest(tileObject -> {
                        int n2;
                        if (T.llIlIlIllIlI(tileObject.getName().contains(llllIllll[lllllIllI[328]]) ? 1 : 0) && T.llIlIlIllIlI(Reachable.isInteractable((Locatable)tileObject) ? 1 : 0)) {
                            String[] stringArray = new String[lllllIllI[1]];
                            stringArray[T.lllllIllI[0]] = llllIllll[lllllIllI[329]];
                            if (T.llIlIlIllIlI(tileObject.hasAction(stringArray) ? 1 : 0)) {
                                n2 = lllllIllI[1];
                                0;
                                if (-1 < 0) return n2 != 0;
                                return ((0x93 ^ 0xB8 ^ (0xA ^ 0x6B)) & (0x9C ^ 0x8E ^ (0x52 ^ 0xA) ^ -1)) != 0;
                            }
                        }
                        n2 = lllllIllI[0];
                        return n2 != 0;
                    }))) {
                        lIlIllllIIIlI.interact(llllIllll[lllllIllI[201]]);
                        Time.sleepTicks((int)lllllIllI[7]);
                        0;
                    }
                    if (T.llIlIlIllIlI((lIlIllllIIIlI = new WorldArea(lllllIllI[163], lllllIllI[164], lllllIllI[26], lllllIllI[12], lllllIllI[0])).contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && T.llIlIllIIIII(lIlIllllIIIIl = TileObjects.getNearest(tileObject -> {
                        int n2;
                        if (T.llIlIlIllIlI(tileObject.getName().contains(llllIllll[lllllIllI[326]]) ? 1 : 0) && T.llIlIlIllIlI(Reachable.isInteractable((Locatable)tileObject) ? 1 : 0)) {
                            String[] stringArray = new String[lllllIllI[1]];
                            stringArray[T.lllllIllI[0]] = llllIllll[lllllIllI[327]];
                            if (T.llIlIlIllIlI(tileObject.hasAction(stringArray) ? 1 : 0)) {
                                n2 = lllllIllI[1];
                                0;
                                if (((0x3F ^ 0x72 ^ (0x12 ^ 0x53)) & (0xF9 ^ 0xC4 ^ (0xA5 ^ 0x94) ^ -1)) == 0) return n2 != 0;
                                return ((82 + 28 - -61 + 0 ^ 77 + 126 - 195 + 176) & (0x4B ^ 0x2D ^ (0xFA ^ 0x8F) ^ -1)) != 0;
                            }
                        }
                        n2 = lllllIllI[0];
                        return n2 != 0;
                    }))) {
                        lIlIllllIIIIl.interact(llllIllll[lllllIllI[202]]);
                        Time.sleepTicks((int)lllllIllI[7]);
                        0;
                    }
                    lIlIllllIIIIl = new WorldArea(lllllIllI[194], lllllIllI[203], lllllIllI[43], lllllIllI[9], lllllIllI[0]);
                    WorldArea lIlIllllIIIII = new WorldArea(lllllIllI[204], lllllIllI[205], lllllIllI[13], lllllIllI[23], lllllIllI[0]);
                    WorldArea lIlIlllIlllll = new WorldArea(lllllIllI[169], lllllIllI[206], lllllIllI[11], lllllIllI[17], lllllIllI[0]);
                    if (T.llIlIlIllIlI(lIlIllllIIllI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        WorldPoint lIlIlllIlllII;
                        WorldPoint lIlIlllIlllIl;
                        WorldArea lIlIlllIllllI;
                        int[] nArray = new int[lllllIllI[1]];
                        nArray[T.lllllIllI[0]] = lllllIllI[207];
                        if (T.llIlIlIlllII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                            int[] nArray30 = new int[lllllIllI[1]];
                            nArray30[T.lllllIllI[0]] = lllllIllI[207];
                            if (T.llIlIllIIlIl(TileItems.getNearest((int[])nArray30)) && T.llIlIlIlllII(lIlIllllIIIIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && T.llIlIlIlllII(lIlIllllIIIII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && T.llIlIlIlllII(lIlIlllIlllll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                AccBuilderGWD.c = llllIllll[lllllIllI[208]];
                                lIlIlllIllllI = NPCs.getNearest(nPC -> {
                                    int n2;
                                    if (T.llIlIlIllIlI(nPC.getName().contains(llllIllll[lllllIllI[325]]) ? 1 : 0) && T.llIlIllIIllI(nPC.getInteracting(), Players.getLocal()) && T.llIlIllIIIlI(nPC.getWorldLocation().distanceTo(Players.getLocal().getWorldLocation()), lllllIllI[1])) {
                                        n2 = lllllIllI[1];
                                        0;
                                        if ((0x28 ^ 0x2C) <= 0) {
                                            return false;
                                        }
                                    } else {
                                        n2 = lllllIllI[0];
                                    }
                                    return n2 != 0;
                                });
                                if (T.llIlIllIIlIl(Players.getLocal().getInteracting()) && T.llIlIllIIlIl(lIlIlllIllllI)) {
                                    int[] nArray31 = new int[lllllIllI[1]];
                                    nArray31[T.lllllIllI[0]] = lllllIllI[209];
                                    NPCs.getNearest((int[])nArray31).interact(llllIllll[lllllIllI[210]]);
                                    Time.sleepTicks((int)lllllIllI[11]);
                                    0;
                                }
                            }
                        }
                        int[] nArray32 = new int[lllllIllI[1]];
                        nArray32[T.lllllIllI[0]] = lllllIllI[207];
                        if (T.llIlIllIIIII(TileItems.getNearest((int[])nArray32))) {
                            int[] nArray33 = new int[lllllIllI[1]];
                            nArray33[T.lllllIllI[0]] = lllllIllI[207];
                            TileItems.getNearest((int[])nArray33).interact(llllIllll[lllllIllI[211]]);
                            Time.sleepTicks((int)lllllIllI[7]);
                            0;
                        }
                        lIlIlllIllllI = new WorldArea(lllllIllI[169], lllllIllI[206], lllllIllI[11], lllllIllI[17], lllllIllI[0]);
                        int[] nArray34 = new int[lllllIllI[1]];
                        nArray34[T.lllllIllI[0]] = lllllIllI[207];
                        if (T.llIlIlIllIlI(Inventory.contains((int[])nArray34) ? 1 : 0) && T.llIlIlIlllII(lIlIlllIllllI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            lIlIlllIlllIl = new WorldPoint(lllllIllI[183], lllllIllI[212], lllllIllI[0]);
                            if (T.llIlIlIlllII(Players.getLocal().getWorldLocation().equals((Object)lIlIlllIlllIl) ? 1 : 0)) {
                                AccBuilderGWD.c = llllIllll[lllllIllI[213]];
                                e.c(lIlIlllIlllIl);
                                Time.sleepTicks((int)lllllIllI[2]);
                                0;
                            }
                            if (T.llIlIlIllIlI(Players.getLocal().getWorldLocation().equals((Object)lIlIlllIlllIl) ? 1 : 0)) {
                                String[] stringArray55 = new String[lllllIllI[1]];
                                stringArray55[T.lllllIllI[0]] = llllIllll[lllllIllI[214]];
                                TileObjects.getNearest((String[])stringArray55).interact(llllIllll[lllllIllI[215]]);
                                Time.sleepTicks((int)lllllIllI[12]);
                                0;
                            }
                        }
                        if (T.llIlIlIllIlI(lIlIlllIllllI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            int[] nArray35 = new int[lllllIllI[1]];
                            nArray35[T.lllllIllI[0]] = lllllIllI[216];
                            if (T.llIlIlIlllII(Inventory.contains((int[])nArray35) ? 1 : 0)) {
                                int[] nArray36 = new int[lllllIllI[1]];
                                nArray36[T.lllllIllI[0]] = lllllIllI[216];
                                if (T.llIlIllIIlIl(TileItems.getNearest((int[])nArray36))) {
                                    AccBuilderGWD.c = llllIllll[lllllIllI[217]];
                                    if (T.llIlIlIlllII(Prayers.isEnabled((Prayer)Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                                        Prayers.toggle((Prayer)Prayer.PROTECT_FROM_MELEE);
                                    }
                                    if (T.llIlIllIIlIl(Players.getLocal().getInteracting())) {
                                        int[] nArray37 = new int[lllllIllI[1]];
                                        nArray37[T.lllllIllI[0]] = lllllIllI[218];
                                        NPCs.getNearest((int[])nArray37).interact(llllIllll[lllllIllI[219]]);
                                        Time.sleepTicks((int)lllllIllI[11]);
                                        0;
                                    }
                                }
                            }
                            int[] nArray38 = new int[lllllIllI[1]];
                            nArray38[T.lllllIllI[0]] = lllllIllI[216];
                            if (T.llIlIllIIIII(TileItems.getNearest((int[])nArray38))) {
                                if (T.llIlIlIllIlI(Prayers.isEnabled((Prayer)Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                                    Prayers.toggle((Prayer)Prayer.PROTECT_FROM_MELEE);
                                }
                                int[] nArray39 = new int[lllllIllI[1]];
                                nArray39[T.lllllIllI[0]] = lllllIllI[216];
                                TileItems.getNearest((int[])nArray39).interact(llllIllll[lllllIllI[220]]);
                                Time.sleepTicks((int)lllllIllI[7]);
                                0;
                            }
                            lIlIlllIlllIl = new WorldArea(lllllIllI[169], lllllIllI[206], lllllIllI[11], lllllIllI[17], lllllIllI[0]);
                            int[] nArray40 = new int[lllllIllI[1]];
                            nArray40[T.lllllIllI[0]] = lllllIllI[216];
                            if (T.llIlIlIllIlI(Inventory.contains((int[])nArray40) ? 1 : 0) && T.llIlIlIllIlI(lIlIlllIlllIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && T.llIlIlIlllII(lIlIllllIIIII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && T.llIlIlIlllII(lIlIllllIIIIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                lIlIlllIlllII = new WorldPoint(lllllIllI[221], lllllIllI[222], lllllIllI[0]);
                                if (T.llIlIlIlllII(Players.getLocal().getWorldLocation().equals((Object)lIlIlllIlllII) ? 1 : 0)) {
                                    AccBuilderGWD.c = llllIllll[lllllIllI[223]];
                                    e.c(lIlIlllIlllII);
                                    Time.sleepTicks((int)lllllIllI[2]);
                                    0;
                                }
                                if (T.llIlIlIllIlI(Players.getLocal().getWorldLocation().equals((Object)lIlIlllIlllII) ? 1 : 0)) {
                                    String[] stringArray56 = new String[lllllIllI[1]];
                                    stringArray56[T.lllllIllI[0]] = llllIllll[lllllIllI[224]];
                                    TileObjects.getNearest((String[])stringArray56).interact(llllIllll[lllllIllI[225]]);
                                    Time.sleepTicks((int)lllllIllI[12]);
                                    0;
                                }
                            }
                        }
                        if (!T.llIlIlIlllII(lIlIllllIIIIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || T.llIlIlIllIlI(lIlIllllIIIII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            String[] stringArray57 = new String[lllllIllI[1]];
                            stringArray57[T.lllllIllI[0]] = llllIllll[lllllIllI[226]];
                            lIlIlllIlllIl = NPCs.getNearest((String[])stringArray57);
                            if (T.llIlIllIIIII(lIlIlllIlllIl)) {
                                int[] nArray41 = new int[lllllIllI[1]];
                                nArray41[T.lllllIllI[0]] = lllllIllI[227];
                                if (T.llIlIlIlllII(Inventory.contains((int[])nArray41) ? 1 : 0) && T.llIlIllIIlIl(Players.getLocal().getInteracting())) {
                                    if (T.llIlIlIlllII(Prayers.isEnabled((Prayer)Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                                        Prayers.toggle((Prayer)Prayer.PROTECT_FROM_MELEE);
                                    }
                                    lIlIlllIlllIl.interact(llllIllll[lllllIllI[228]]);
                                    Time.sleepTicks((int)lllllIllI[7]);
                                    0;
                                }
                            }
                            int[] nArray42 = new int[lllllIllI[1]];
                            nArray42[T.lllllIllI[0]] = lllllIllI[227];
                            if (T.llIlIllIIIII(TileItems.getNearest((int[])nArray42))) {
                                int[] nArray43 = new int[lllllIllI[1]];
                                nArray43[T.lllllIllI[0]] = lllllIllI[227];
                                TileItems.getNearest((int[])nArray43).interact(llllIllll[lllllIllI[229]]);
                                Time.sleepTicks((int)lllllIllI[2]);
                                0;
                            }
                            int[] nArray44 = new int[lllllIllI[1]];
                            nArray44[T.lllllIllI[0]] = lllllIllI[227];
                            if (T.llIlIlIllIlI(Inventory.contains((int[])nArray44) ? 1 : 0)) {
                                lIlIlllIlllII = new WorldPoint(lllllIllI[176], lllllIllI[230], lllllIllI[0]);
                                if (T.llIlIlIlllII(Players.getLocal().getWorldLocation().equals((Object)lIlIlllIlllII) ? 1 : 0)) {
                                    AccBuilderGWD.c = llllIllll[lllllIllI[231]];
                                    e.c(lIlIlllIlllII);
                                    Time.sleepTicks((int)lllllIllI[2]);
                                    0;
                                }
                                if (T.llIlIlIllIlI(Players.getLocal().getWorldLocation().equals((Object)lIlIlllIlllII) ? 1 : 0)) {
                                    String[] stringArray58 = new String[lllllIllI[1]];
                                    stringArray58[T.lllllIllI[0]] = llllIllll[lllllIllI[232]];
                                    TileObjects.getNearest((String[])stringArray58).interact(llllIllll[lllllIllI[233]]);
                                    Time.sleepTicks((int)lllllIllI[12]);
                                    0;
                                }
                            }
                        }
                        if (T.llIlIllIIIII(lIlIlllIlllIl = TileObjects.getNearest(tileObject -> {
                            int n2;
                            if (T.llIlIlIllIlI(tileObject.getName().contains(llllIllll[lllllIllI[324]]) ? 1 : 0) && T.llIlIlIllIlI(Reachable.isInteractable((Locatable)tileObject) ? 1 : 0)) {
                                n2 = lllllIllI[1];
                                0;
                                if (-1 >= 0) {
                                    return ((0xBD ^ 0xC0 ^ (0xA1 ^ 0xC7)) & (206 + 60 - 169 + 124 ^ 139 + 15 - 135 + 179 ^ -1)) != 0;
                                }
                            } else {
                                n2 = lllllIllI[0];
                            }
                            return n2 != 0;
                        }))) {
                            if (T.llIlIlIllIlI(Prayers.isEnabled((Prayer)Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                                Prayers.toggle((Prayer)Prayer.PROTECT_FROM_MELEE);
                            }
                            if (T.llIlIlIlllII(Dialog.isOpen() ? 1 : 0)) {
                                String[] stringArray59 = new String[lllllIllI[1]];
                                stringArray59[T.lllllIllI[0]] = llllIllll[lllllIllI[234]];
                                if (T.llIlIlIllIlI(lIlIlllIlllIl.hasAction(stringArray59) ? 1 : 0)) {
                                    lIlIlllIlllIl.interact(llllIllll[lllllIllI[235]]);
                                    Time.sleepTicks((int)lllllIllI[9]);
                                    0;
                                }
                                String[] stringArray60 = new String[lllllIllI[1]];
                                stringArray60[T.lllllIllI[0]] = llllIllll[lllllIllI[236]];
                                if (T.llIlIlIllIlI(lIlIlllIlllIl.hasAction(stringArray60) ? 1 : 0)) {
                                    lIlIlllIlllIl.interact(llllIllll[lllllIllI[237]]);
                                    Time.sleepTicks((int)lllllIllI[9]);
                                    0;
                                }
                            }
                        }
                    }
                }
                if (T.llIlIlIllIlI(lg ? 1 : 0) && T.llIlIlIllIlI(lh ? 1 : 0) && T.llIlIlIllIlI(lf ? 1 : 0) && T.llIlIlIlllII(li ? 1 : 0)) {
                    int[] nArray = new int[lllllIllI[1]];
                    nArray[T.lllllIllI[0]] = lllllIllI[3];
                    if (T.llIlIlIllIlI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        int[] nArray45 = new int[lllllIllI[1]];
                        nArray45[T.lllllIllI[0]] = lllllIllI[3];
                        int[] nArray46 = new int[lllllIllI[1]];
                        nArray46[T.lllllIllI[0]] = lllllIllI[5];
                        Inventory.getFirst((int[])nArray45).useOn(Inventory.getFirst((int[])nArray46));
                        Time.sleepTicks((int)lllllIllI[7]);
                        0;
                    }
                }
                if (T.llIlIlIllIlI(li ? 1 : 0)) {
                    String[] stringArray = new String[lllllIllI[1]];
                    stringArray[T.lllllIllI[0]] = llllIllll[lllllIllI[238]];
                    if (T.llIlIlIlllII(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                        T.cY();
                    }
                    String[] stringArray61 = new String[lllllIllI[1]];
                    stringArray61[T.lllllIllI[0]] = llllIllll[lllllIllI[239]];
                    if (T.llIlIlIllIlI(Inventory.contains((String[])stringArray61) ? 1 : 0)) {
                        if (T.llIlIllIIIIl(Players.getLocal().getWorldLocation().distanceTo(le), lllllIllI[9])) {
                            AccBuilderGWD.c = llllIllll[lllllIllI[240]];
                            if (T.llIlIlIllIlI(Dialog.isOpen() ? 1 : 0)) {
                                String[] stringArray62 = new String[lllllIllI[1]];
                                stringArray62[T.lllllIllI[0]] = llllIllll[lllllIllI[241]];
                                if (T.llIlIllIIlIl(NPCs.getNearest((String[])stringArray62))) {
                                    Dialog.close();
                                }
                            }
                            if (T.llIlIlIlllII(Dialog.isOpen() ? 1 : 0)) {
                                Movement.walkTo((WorldPoint)le);
                                0;
                                Time.sleepTicks((int)lllllIllI[1]);
                                0;
                            }
                            String[] stringArray63 = new String[lllllIllI[7]];
                            stringArray63[T.lllllIllI[0]] = llllIllll[lllllIllI[242]];
                            stringArray63[T.lllllIllI[1]] = llllIllll[lllllIllI[243]];
                            stringArray63[T.lllllIllI[2]] = llllIllll[lllllIllI[244]];
                            g.a(stringArray63);
                        }
                        if (T.llIlIllIIIlI(Players.getLocal().getWorldLocation().distanceTo(le), lllllIllI[9])) {
                            g.a(llllIllll[lllllIllI[245]], cG);
                        }
                    }
                }
            }
            if (T.llIlIllIIIll(e.j(lllllIllI[14]), lllllIllI[7])) {
                dk = lllllIllI[0];
                String[] stringArray = new String[lllllIllI[1]];
                stringArray[T.lllllIllI[0]] = llllIllll[lllllIllI[246]];
                lIlIllllIIlll = NPCs.getNearest((String[])stringArray);
                if (T.llIlIllIIlIl(lIlIllllIIlll) && T.llIlIlIlllII(Players.getLocal().getWorldLocation().getPlane())) {
                    AccBuilderGWD.c = llllIllll[lllllIllI[247]];
                    String[] stringArray64 = new String[lllllIllI[1]];
                    stringArray64[T.lllllIllI[0]] = llllIllll[lllllIllI[248]];
                    TileObjects.getNearest((String[])stringArray64).interact(llllIllll[lllllIllI[249]]);
                    Time.sleepTicks((int)lllllIllI[16]);
                    0;
                }
                if (T.llIlIllIIlIl(lIlIllllIIlll) && T.llIlIllIIIll(Players.getLocal().getWorldLocation().getPlane(), lllllIllI[1])) {
                    AccBuilderGWD.c = llllIllll[lllllIllI[250]];
                    String[] stringArray65 = new String[lllllIllI[1]];
                    stringArray65[T.lllllIllI[0]] = llllIllll[lllllIllI[251]];
                    TileObjects.getNearest((String[])stringArray65).interact(llllIllll[lllllIllI[252]]);
                    Time.sleepTicks((int)lllllIllI[7]);
                    0;
                }
                if (T.llIlIllIIIII(lIlIllllIIlll) && T.llIlIllIIIll(Players.getLocal().getWorldLocation().getPlane(), lllllIllI[1])) {
                    String[] stringArray66 = new String[lllllIllI[1]];
                    stringArray66[T.lllllIllI[0]] = llllIllll[lllllIllI[253]];
                    TileObjects.getNearest((String[])stringArray66).interact(llllIllll[lllllIllI[254]]);
                    Time.sleepTicks((int)lllllIllI[11]);
                    0;
                }
            }
            if (T.llIlIllIIIll(e.j(lllllIllI[14]), lllllIllI[12])) {
                AccBuilderGWD.c = llllIllll[lllllIllI[255]];
                String[] stringArray = new String[lllllIllI[1]];
                stringArray[T.lllllIllI[0]] = llllIllll[lllllIllI[256]];
                lIlIllllIIlll = NPCs.getNearest((String[])stringArray);
                if (T.llIlIllIIlIl(lIlIllllIIlll)) {
                    Equipment.getFirst(item -> item.getName().contains(llllIllll[lllllIllI[323]])).interact(llllIllll[lllllIllI[257]]);
                    Time.sleepTicks((int)lllllIllI[23]);
                    0;
                    Movement.walkTo((WorldPoint)new WorldPoint(lllllIllI[258], lllllIllI[259], lllllIllI[0]));
                    0;
                }
                if (T.llIlIllIIIII(lIlIllllIIlll)) {
                    g.a(llllIllll[lllllIllI[14]], cG, lllllIllI[1]);
                }
            }
            if (T.llIlIllIIIll(e.j(lllllIllI[14]), lllllIllI[13])) {
                if (T.llIlIlIlllII(Inventory.contains(item -> item.getName().contains(llllIllll[lllllIllI[322]])) ? 1 : 0)) {
                    T.cX();
                }
                if (T.llIlIlIllIlI(Inventory.contains(item -> item.getName().contains(llllIllll[lllllIllI[321]])) ? 1 : 0)) {
                    String[] stringArray = new String[lllllIllI[1]];
                    stringArray[T.lllllIllI[0]] = llllIllll[lllllIllI[72]];
                    if (T.llIlIllIIlIl(NPCs.getNearest((String[])stringArray)) && T.llIlIlIlllII(Players.getLocal().getWorldLocation().getPlane()) && T.llIlIlIlllII(Static.getClient().isInInstancedRegion() ? 1 : 0)) {
                        if (T.llIlIllIIIIl(Players.getLocal().getWorldLocation().distanceTo(le), lllllIllI[2])) {
                            AccBuilderGWD.c = llllIllll[lllllIllI[260]];
                            if (T.llIlIlIllIlI(Dialog.isOpen() ? 1 : 0)) {
                                String[] stringArray67 = new String[lllllIllI[1]];
                                stringArray67[T.lllllIllI[0]] = llllIllll[lllllIllI[261]];
                                if (T.llIlIllIIlIl(NPCs.getNearest((String[])stringArray67))) {
                                    Dialog.close();
                                }
                            }
                            if (T.llIlIlIlllII(Dialog.isOpen() ? 1 : 0)) {
                                Movement.walkTo((WorldPoint)le);
                                0;
                                Time.sleepTicks((int)lllllIllI[1]);
                                0;
                            }
                            String[] stringArray68 = new String[lllllIllI[7]];
                            stringArray68[T.lllllIllI[0]] = llllIllll[lllllIllI[262]];
                            stringArray68[T.lllllIllI[1]] = llllIllll[lllllIllI[263]];
                            stringArray68[T.lllllIllI[2]] = llllIllll[lllllIllI[264]];
                            g.a(stringArray68);
                        }
                        if (T.llIlIllIIIlI(Players.getLocal().getWorldLocation().distanceTo(le), lllllIllI[2]) && T.llIlIlIlllII(Players.getLocal().isMoving() ? 1 : 0)) {
                            String[] stringArray69 = new String[lllllIllI[1]];
                            stringArray69[T.lllllIllI[0]] = llllIllll[lllllIllI[265]];
                            TileObjects.getNearest((String[])stringArray69).interact(llllIllll[lllllIllI[266]]);
                            Time.sleepTicks((int)lllllIllI[13]);
                            0;
                        }
                    }
                    String[] stringArray70 = new String[lllllIllI[1]];
                    stringArray70[T.lllllIllI[0]] = llllIllll[lllllIllI[267]];
                    if (T.llIlIllIIIII(NPCs.getNearest((String[])stringArray70)) && T.llIlIllIIIll(Players.getLocal().getWorldLocation().getPlane(), lllllIllI[1])) {
                        g.a(llllIllll[lllllIllI[268]], cG);
                    }
                }
            }
            if (T.llIlIllIIIll(e.j(lllllIllI[14]), lllllIllI[16])) {
                lIlIllllIIlll = new WorldArea(lllllIllI[269], lllllIllI[270], lllllIllI[89], lllllIllI[79], lllllIllI[0]);
                if (T.llIlIlIlllII(lIlIllllIIlll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    lIlIllllIIllI = new WorldPoint(lllllIllI[271], lllllIllI[259], lllllIllI[0]);
                    if (T.llIlIllIIIIl(Players.getLocal().getWorldLocation().distanceTo(lIlIllllIIllI), lllllIllI[7])) {
                        AccBuilderGWD.c = llllIllll[lllllIllI[272]];
                        Movement.walkTo((WorldPoint)lIlIllllIIllI);
                        0;
                        Time.sleepTicks((int)lllllIllI[1]);
                        0;
                    }
                    if (T.llIlIllIIIlI(Players.getLocal().getWorldLocation().distanceTo(lIlIllllIIllI), lllllIllI[7])) {
                        String[] stringArray = new String[lllllIllI[1]];
                        stringArray[T.lllllIllI[0]] = llllIllll[lllllIllI[273]];
                        TileObjects.getNearest((String[])stringArray).interact(llllIllll[lllllIllI[274]]);
                        Time.sleepTicks((int)lllllIllI[9]);
                        0;
                    }
                }
                if (T.llIlIlIllIlI(lIlIllllIIlll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    String[] stringArray = new String[lllllIllI[1]];
                    stringArray[T.lllllIllI[0]] = llllIllll[lllllIllI[275]];
                    lIlIllllIIllI = NPCs.getNearest((String[])stringArray);
                    lIlIllllIIlIl = new WorldPoint(lllllIllI[276], lllllIllI[152], lllllIllI[0]);
                    if (T.llIlIllIIIIl(Players.getLocal().getWorldLocation().distanceTo(lIlIllllIIlIl), lllllIllI[7]) && T.llIlIllIIlIl(lIlIllllIIllI)) {
                        AccBuilderGWD.c = llllIllll[lllllIllI[277]];
                        Movement.walkTo((WorldPoint)lIlIllllIIlIl);
                        0;
                        Time.sleepTicks((int)lllllIllI[1]);
                        0;
                    }
                    if (T.llIlIllIIIIl(Players.getLocal().getWorldLocation().distanceTo(lIlIllllIIlIl), lllllIllI[7]) && T.llIlIllIIIII(lIlIllllIIllI) && T.llIlIlIlllII(Reachable.isInteractable((Locatable)lIlIllllIIllI) ? 1 : 0)) {
                        AccBuilderGWD.c = llllIllll[lllllIllI[278]];
                        Movement.walkTo((WorldPoint)lIlIllllIIlIl);
                        0;
                        Time.sleepTicks((int)lllllIllI[1]);
                        0;
                    }
                    if (T.llIlIllIIIII(lIlIllllIIllI) && T.llIlIlIlllII(Reachable.isInteractable((Locatable)lIlIllllIIllI) ? 1 : 0) && T.llIlIllIIIlI(Players.getLocal().getWorldLocation().distanceTo(lIlIllllIIlIl), lllllIllI[7]) && T.llIlIlIlllII(Dialog.isOpen() ? 1 : 0)) {
                        if (T.llIlIllIIIIl(Combat.getMissingHealth(), lllllIllI[9])) {
                            String[] stringArray71 = new String[lllllIllI[1]];
                            stringArray71[T.lllllIllI[0]] = llllIllll[lllllIllI[279]];
                            if (T.llIlIlIllIlI(Inventory.contains((String[])stringArray71) ? 1 : 0)) {
                                String[] stringArray72 = new String[lllllIllI[1]];
                                stringArray72[T.lllllIllI[0]] = llllIllll[lllllIllI[280]];
                                Inventory.getFirst((String[])stringArray72).interact(llllIllll[lllllIllI[281]]);
                                Time.sleepTicks((int)lllllIllI[1]);
                                0;
                            }
                        }
                        String[] stringArray73 = new String[lllllIllI[1]];
                        stringArray73[T.lllllIllI[0]] = llllIllll[lllllIllI[282]];
                        TileObjects.getNearest((String[])stringArray73).interact(llllIllll[lllllIllI[283]]);
                    }
                    if (T.llIlIllIIIII(lIlIllllIIllI) && T.llIlIlIllIlI(Reachable.isInteractable((Locatable)lIlIllllIIllI) ? 1 : 0)) {
                        AccBuilderGWD.c = llllIllll[lllllIllI[284]];
                        if (T.llIlIlIlllII(Prayers.isEnabled((Prayer)Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                            Prayers.toggle((Prayer)Prayer.PROTECT_FROM_MELEE);
                        }
                        if (T.llIlIlIlllII(Prayers.isEnabled((Prayer)Prayer.ULTIMATE_STRENGTH) ? 1 : 0)) {
                            Prayers.toggle((Prayer)Prayer.ULTIMATE_STRENGTH);
                        }
                        if (T.llIlIlIlllII(Prayers.isEnabled((Prayer)Prayer.INCREDIBLE_REFLEXES) ? 1 : 0)) {
                            Prayers.toggle((Prayer)Prayer.INCREDIBLE_REFLEXES);
                        }
                        String[] stringArray74 = new String[lllllIllI[1]];
                        stringArray74[T.lllllIllI[0]] = llllIllll[lllllIllI[285]];
                        if (T.llIlIlIllIlI(Inventory.contains((String[])stringArray74) ? 1 : 0)) {
                            String[] stringArray75 = new String[lllllIllI[1]];
                            stringArray75[T.lllllIllI[0]] = llllIllll[lllllIllI[286]];
                            Inventory.getFirst((String[])stringArray75).interact(llllIllll[lllllIllI[287]]);
                        }
                        if (T.llIlIlIllIlI(Inventory.isFull() ? 1 : 0)) {
                            String[] stringArray76 = new String[lllllIllI[1]];
                            stringArray76[T.lllllIllI[0]] = llllIllll[lllllIllI[288]];
                            Inventory.getFirst((String[])stringArray76).interact(llllIllll[lllllIllI[289]]);
                        }
                        if (T.llIlIllIIIll(Skills.getLevel((Skill)Skill.STRENGTH), Skills.getBoostedLevel((Skill)Skill.STRENGTH)) && T.llIlIlIllIlI(Inventory.contains(item -> item.getName().contains(llllIllll[lllllIllI[320]])) ? 1 : 0)) {
                            Inventory.getFirst(item -> item.getName().contains(llllIllll[lllllIllI[319]])).interact(llllIllll[lllllIllI[290]]);
                        }
                        if (T.llIlIlIllIll(Vars.getBit((int)lllllIllI[291]), lllllIllI[1]) && T.llIlIlIllIlI(Inventory.contains(item -> item.getName().contains(llllIllll[lllllIllI[318]])) ? 1 : 0)) {
                            Inventory.getFirst(item -> item.getName().contains(llllIllll[lllllIllI[317]])).interact(llllIllll[lllllIllI[292]]);
                        }
                        if (T.llIlIllIIlIl(Players.getLocal().getInteracting())) {
                            lIlIllllIIllI.interact(llllIllll[lllllIllI[293]]);
                            Time.sleepTicks((int)lllllIllI[1]);
                            0;
                        }
                    }
                }
            }
            if (T.llIlIllIIIll(e.j(lllllIllI[14]), lllllIllI[17])) {
                Prayers.disableAll();
                lIlIllllIIlll = new WorldPoint(lllllIllI[48], lllllIllI[49], lllllIllI[0]);
                if (T.llIlIllIIIIl(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lIlIllllIIlll), lllllIllI[16]) && T.llIlIllIIIll(Players.getLocal().getAnimation(), lllllIllI[294])) {
                    AccBuilderGWD.c = llllIllll[lllllIllI[295]];
                    Movement.walkTo((WorldPoint)lIlIllllIIlll);
                    0;
                    Time.sleepTicks((int)lllllIllI[1]);
                    0;
                }
                if (T.llIlIllIIIlI(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lIlIllllIIlll), lllllIllI[16])) {
                    if (T.llIlIlIllIll(dk, lllllIllI[1])) {
                        as.pX += lllllIllI[1];
                        as.u(AccBuilderGWD.m);
                        dk += lllllIllI[1];
                        as.pX = lllllIllI[0];
                        dl = lllllIllI[0];
                    }
                    g.a(llllIllll[lllllIllI[296]], cG, lllllIllI[1]);
                }
            }
            int[] nArray = new int[lllllIllI[1]];
            nArray[T.lllllIllI[0]] = lllllIllI[36];
            if (T.llIlIlIllIlI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray47 = new int[lllllIllI[1]];
                nArray47[T.lllllIllI[0]] = lllllIllI[36];
                if (T.llIlIlIlllII(Equipment.contains((int[])nArray47) ? 1 : 0) && T.llIlIlIllllI(e.j(lllllIllI[14]))) {
                    int[] nArray48 = new int[lllllIllI[1]];
                    nArray48[T.lllllIllI[0]] = lllllIllI[36];
                    Inventory.getFirst((int[])nArray48).interact(llllIllll[lllllIllI[297]]);
                }
            }
            String[] stringArray = new String[lllllIllI[1]];
            stringArray[T.lllllIllI[0]] = llllIllll[lllllIllI[298]];
            if (T.llIlIlIllIlI(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                li = lllllIllI[1];
                lh = lllllIllI[1];
                lf = lllllIllI[1];
                lg = lllllIllI[1];
            }
            int[] nArray49 = new int[lllllIllI[1]];
            nArray49[T.lllllIllI[0]] = lllllIllI[3];
            if (T.llIlIlIllIlI(Inventory.contains((int[])nArray49) ? 1 : 0)) {
                lh = lllllIllI[1];
            }
            int[] nArray50 = new int[lllllIllI[1]];
            nArray50[T.lllllIllI[0]] = lllllIllI[4];
            if (T.llIlIlIllIlI(Inventory.contains((int[])nArray50) ? 1 : 0)) {
                lf = lllllIllI[1];
            }
            int[] nArray51 = new int[lllllIllI[1]];
            nArray51[T.lllllIllI[0]] = lllllIllI[5];
            if (T.llIlIlIllIlI(Inventory.contains((int[])nArray51) ? 1 : 0)) {
                lg = lllllIllI[1];
            }
            if (T.llIlIllIIIll(e.j(lllllIllI[14]), lllllIllI[23])) {
                String[] stringArray77 = new String[lllllIllI[1]];
                stringArray77[T.lllllIllI[0]] = llllIllll[lllllIllI[299]];
                if (T.llIlIllIIIII(NPCs.getNearest((String[])stringArray77))) {
                    int[] nArray52 = new int[lllllIllI[1]];
                    nArray52[T.lllllIllI[0]] = lllllIllI[19];
                    if (T.llIlIlIllIlI(Inventory.contains((int[])nArray52) ? 1 : 0)) {
                        int[] nArray53 = new int[lllllIllI[1]];
                        nArray53[T.lllllIllI[0]] = lllllIllI[19];
                        Inventory.getFirst((int[])nArray53).interact(llllIllll[lllllIllI[300]]);
                        Time.sleepTicks((int)lllllIllI[12]);
                        0;
                    }
                }
            }
            if (T.llIlIllIIIll(e.j(lllllIllI[14]), lllllIllI[23]) && T.llIlIlIllIlI(Dialog.isOpen() ? 1 : 0)) {
                Dialog.close();
            }
            System.out.println("Setting: " + e.j(lllllIllI[14]));
        }
        g.a(new String[lllllIllI[0]]);
    }

    /*
     * WARNING - void declaration
     */
    private static void cX() {
        void lIlIlllIllIlI;
        BankLocation bankLocation = BankLocation.getNearest();
        if (T.llIlIllIIIII(bankLocation) && T.llIlIlIlllII(bankLocation.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderGWD.c = llllIllll[lllllIllI[301]];
            Movement.walkTo((BankLocation)bankLocation);
            0;
            Time.sleepTicks((int)lllllIllI[2]);
            0;
        }
        if (T.llIlIllIIIII(lIlIlllIllIlI) && T.llIlIlIllIlI(lIlIlllIllIlI.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderGWD.c = llllIllll[lllllIllI[302]];
            if (T.llIlIlIlllII(Bank.isOpen() ? 1 : 0)) {
                a.a();
                Time.sleepUntil(() -> Bank.isOpen(), (int)lllllIllI[18]);
                0;
            }
            if (T.llIlIlIllIlI(Bank.isOpen() ? 1 : 0)) {
                if (T.llIlIlIllllI(Inventory.getAll().size())) {
                    Bank.depositInventory();
                    Time.sleepTicks((int)lllllIllI[9]);
                    0;
                }
                a.a(lllllIllI[19], lllllIllI[11]);
                a.b(f.bc, lllllIllI[2]);
                a.a(lllllIllI[45], lllllIllI[9]);
                a.a(lllllIllI[41], lllllIllI[1]);
                a.a(lllllIllI[39], lllllIllI[1]);
                a.a(lllllIllI[46], lllllIllI[47]);
                int[] nArray = new int[lllllIllI[1]];
                nArray[T.lllllIllI[0]] = lllllIllI[36];
                if (T.llIlIlIlllII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    int[] nArray2 = new int[lllllIllI[1]];
                    nArray2[T.lllllIllI[0]] = lllllIllI[36];
                    if (T.llIlIlIlllII(Equipment.contains((int[])nArray2) ? 1 : 0)) {
                        Bank.withdraw((int)lllllIllI[36], (int)lllllIllI[1], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                    }
                }
                Bank.withdraw((int)lllllIllI[35], (int)(Inventory.getFreeSlots() - lllllIllI[1]), (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
            }
        }
    }

    private static boolean llIlIlIlllIl(int n2) {
        return n2 < 0;
    }

    private static boolean llIlIllIIIII(Object object) {
        return object != null;
    }

    private static int llIlIlIllIIl(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    private static boolean llIlIllIIllI(Object object, Object object2) {
        return object == object2;
    }

    private static void llIlIlIllIII() {
        lllllIllI = new int[366];
        T.lllllIllI[0] = (6 ^ 0x14) & ~(0xB0 ^ 0xA2);
        T.lllllIllI[1] = 1;
        T.lllllIllI[2] = 2;
        T.lllllIllI[3] = 0xFFFFFFFF & 0x5FF;
        T.lllllIllI[4] = 0xFFFFEE69 & 0x1797;
        T.lllllIllI[5] = -(0xFFFFD87E & 0x6FEF) & (0xFFFFFF6F & 0x4EFD);
        T.lllllIllI[6] = 115 + 70 - 87 + 90 ^ 40 + 13 - -32 + 57;
        T.lllllIllI[7] = 3;
        T.lllllIllI[8] = 108 + 13 - 57 + 104 ^ 153 + 59 - 147 + 111;
        T.lllllIllI[9] = 0x41 ^ 0 ^ (0x21 ^ 0x64);
        T.lllllIllI[10] = 0x97 ^ 0x83;
        T.lllllIllI[11] = 0xB2 ^ 0xB7;
        T.lllllIllI[12] = 0x49 ^ 0x4F;
        T.lllllIllI[13] = 0x30 ^ 0x37;
        T.lllllIllI[14] = (0x63 ^ 4) + (52 + 129 - 37 + 26) - (130 + 22 - 62 + 47) + (0x4E ^ 0x66);
        T.lllllIllI[15] = 0xA3 ^ 0x83;
        T.lllllIllI[16] = 0x64 ^ 0x6C;
        T.lllllIllI[17] = 0x67 ^ 0x33 ^ (0x68 ^ 0x35);
        T.lllllIllI[18] = -(0xFFFFFE6B & 0x25DC) & (0xFFFFB7EF & 0x7FDF);
        T.lllllIllI[19] = 0xFFFFFFEF & 0x1F57;
        T.lllllIllI[20] = 0x91 ^ 0x9E;
        T.lllllIllI[21] = -(0xFFFFFEE7 & 0x21BF) & (0xFFFFBFEF & Short.MAX_VALUE);
        T.lllllIllI[22] = 0xFFFFDF4F & 0x3FF8;
        T.lllllIllI[23] = 0xA0 ^ 0xAA;
        T.lllllIllI[24] = -(0xFFFFF1EF & 0x6F79) & (0xFFFFF76F & 0x6FFB);
        T.lllllIllI[25] = 0x73 ^ 0x29;
        T.lllllIllI[26] = 0x96 ^ 0x9D;
        T.lllllIllI[27] = 0xFFFFDFE9 & 0x23D6;
        T.lllllIllI[28] = 0x3F ^ 0x33;
        T.lllllIllI[29] = 0x14 ^ 0x4C ^ (0x6D ^ 0x24);
        T.lllllIllI[30] = 0xFFFFBFFF & 0x46FF;
        T.lllllIllI[31] = -(0xFFFFAAB5 & 0x7DCF) & (0xFFFFBFF7 & 0x6FFF);
        T.lllllIllI[32] = 0xFFFF87FD & 0x792F;
        T.lllllIllI[33] = 0xFFFFEBF6 & 0x17BF;
        T.lllllIllI[34] = -(0xFFFFFFE9 & 0x3497) & (0xFFFFFDEB & 0x3FBF);
        T.lllllIllI[35] = -(0x9A ^ 0x8F) & (0xFFFFDDDD & 0x23B7);
        T.lllllIllI[36] = 0xFFFFE634 & 0x1FCF;
        T.lllllIllI[37] = 0xFFFFBF55 & 0x71FB;
        T.lllllIllI[38] = 9 ^ 0x54 ^ (0x37 ^ 0x67);
        T.lllllIllI[39] = 0xFFFF8FFD & 0x7996;
        T.lllllIllI[40] = 70 + 163 - 56 + 6 ^ 62 + 97 - 130 + 156;
        T.lllllIllI[41] = -(0xFFFFD2E7 & 0x6F79) & (0xFFFFF3FF & 0x7FF7);
        T.lllllIllI[42] = -(0xFFFFF827 & 0x57FE) & (0xFFFFFEFF & 0x7FEF);
        T.lllllIllI[43] = 0xBF ^ 0xAF;
        T.lllllIllI[44] = -(0xFFFFB6DB & 0x59EF) & (0xFFFFB5FF & 0x5FFF);
        T.lllllIllI[45] = 0xFFFFDD97 & 0x2BEA;
        T.lllllIllI[46] = 0xFFFF9BF7 & 0x67EB;
        T.lllllIllI[47] = 0xFFFFFED8 & 0x3BBF;
        T.lllllIllI[48] = -(0xFFFFBC8F & 0x4773) & (0xFFFFEFFF & 0x1FFF);
        T.lllllIllI[49] = -(0xFFFFF7DF & 0x6A63) & (0xFFFFFFFF & 0x6FFF);
        T.lllllIllI[50] = 0x86 ^ 0x94;
        T.lllllIllI[51] = 101 + 15 - 38 + 130 ^ 192 + 158 - 250 + 95;
        T.lllllIllI[52] = 0x15 ^ 0;
        T.lllllIllI[53] = 15 + 54 - -34 + 50 ^ 56 + 19 - -40 + 28;
        T.lllllIllI[54] = -(0xFFFFC56B & 0x7ADD) & (0xFFFFEEE8 & 0x5FFF);
        T.lllllIllI[55] = 100 + 160 - 192 + 123 ^ 76 + 70 - 113 + 135;
        T.lllllIllI[56] = 0x64 ^ 0x7D;
        T.lllllIllI[57] = 0x85 ^ 0x9F;
        T.lllllIllI[58] = 0x33 ^ 0x28;
        T.lllllIllI[59] = 0xFFFFFEF7 & 0xFA9;
        T.lllllIllI[60] = 0 ^ 0x1C;
        T.lllllIllI[61] = 0xA2 ^ 0x9B ^ (0x3A ^ 0x1E);
        T.lllllIllI[62] = -(0xFFFFEBEF & 0x551D) & (0xFFFFEFEF & 0x5FBE);
        T.lllllIllI[63] = 0xF4 ^ 0xAA ^ (0x2B ^ 0x6B);
        T.lllllIllI[64] = 0xFFFF9EFF & 0x6F9E;
        T.lllllIllI[65] = 0x6C ^ 0x73;
        T.lllllIllI[66] = 0x6C ^ 0x4D;
        T.lllllIllI[67] = -(0xFFFFB7CF & 0x4971) & (0xFFFFAFDF & 0x5FFF);
        T.lllllIllI[68] = (0x55 ^ 0x14) & ~(0x6B ^ 0x2A) ^ (0xA0 ^ 0x82);
        T.lllllIllI[69] = 0x3F ^ 0x3A ^ (0x39 ^ 0x1F);
        T.lllllIllI[70] = 8 ^ 0x2C;
        T.lllllIllI[71] = 0xE2 ^ 0xC7;
        T.lllllIllI[72] = 102 + 62 - -8 + 5;
        T.lllllIllI[73] = -(0xFFFFFDD7 & 0x7A2D) & (0xFFFFFFFF & 0x7F2C);
        T.lllllIllI[74] = 0x58 ^ 0x7E;
        T.lllllIllI[75] = -(0xFFFFE2A6 & 0x3D7B) & (0xFFFFFBF7 & 0x2FEF);
        T.lllllIllI[76] = 0xFFFFEFAF & 0x1DFD;
        T.lllllIllI[77] = 0xA4 ^ 0xC1 ^ (0x3D ^ 0x7F);
        T.lllllIllI[78] = 0x37 ^ 0x1F;
        T.lllllIllI[79] = 0x59 ^ 0x70;
        T.lllllIllI[80] = 123 + 46 - 37 + 3 ^ 103 + 161 - 189 + 98;
        T.lllllIllI[81] = 0xFFFFFEE6 & 0xFBF;
        T.lllllIllI[82] = 0x26 ^ 0xD;
        T.lllllIllI[83] = -(0xFFFFF7DF & 0x387B) & (0xFFFFFFFF & 0x3EFF);
        T.lllllIllI[84] = 0x15 ^ 0x39;
        T.lllllIllI[85] = -(0xFFFFED17 & 0x36FD) & (0xFFFFFFFD & 0x2FFF);
        T.lllllIllI[86] = 0xFFFFE6F6 & 0x3F79;
        T.lllllIllI[87] = 0xBE ^ 0x93;
        T.lllllIllI[88] = 0x3E ^ 0x10;
        T.lllllIllI[89] = 0xD7 ^ 0xC3 ^ (0x1C ^ 0x27);
        T.lllllIllI[90] = 0x7B ^ 0x15 ^ (0xFD ^ 0xA3);
        T.lllllIllI[91] = 51 + 142 - 92 + 62 ^ 130 + 25 - 103 + 94;
        T.lllllIllI[92] = 2 ^ 0x31;
        T.lllllIllI[93] = 99 + 171 - 189 + 101 ^ 21 + 75 - 75 + 109;
        T.lllllIllI[94] = 0x68 ^ 0x1A ^ (0x46 ^ 1);
        T.lllllIllI[95] = 83 + 56 - 68 + 69 ^ 37 + 19 - 41 + 171;
        T.lllllIllI[96] = 0x22 ^ 0x13 ^ (0x86 ^ 0x80);
        T.lllllIllI[97] = 0x33 ^ 0xB;
        T.lllllIllI[98] = 25 + 9 - -57 + 52 ^ 159 + 131 - 204 + 96;
        T.lllllIllI[99] = 0x2A ^ 0x10;
        T.lllllIllI[100] = 0x11 ^ 0x2A;
        T.lllllIllI[101] = 0xA6 ^ 0x82 ^ (0x91 ^ 0x89);
        T.lllllIllI[102] = 0xB5 ^ 0x88;
        T.lllllIllI[103] = 0x3E ^ 0;
        T.lllllIllI[104] = 121 + 93 - 101 + 46 ^ 78 + 39 - 10 + 53;
        T.lllllIllI[105] = 0xF4 ^ 0xAE ^ (0x80 ^ 0x9A);
        T.lllllIllI[106] = 0x22 ^ 0x63;
        T.lllllIllI[107] = 0x8E ^ 0x8B ^ (0x67 ^ 0x20);
        T.lllllIllI[108] = 0x66 ^ 0x25;
        T.lllllIllI[109] = 124 + 91 - 128 + 112 ^ 62 + 81 - 107 + 95;
        T.lllllIllI[110] = 144 + 11 - 5 + 43 ^ 61 + 67 - 101 + 105;
        T.lllllIllI[111] = 0x63 ^ 0x25;
        T.lllllIllI[112] = 111 + 160 - 258 + 228 ^ 71 + 132 - 118 + 97;
        T.lllllIllI[113] = 0x56 ^ 0x1E;
        T.lllllIllI[114] = 0x24 ^ 0x6D;
        T.lllllIllI[115] = 0x14 ^ 0x5E;
        T.lllllIllI[116] = 0x2C ^ 0x67;
        T.lllllIllI[117] = 0xF8 ^ 0xB4;
        T.lllllIllI[118] = 0xD4 ^ 0x99;
        T.lllllIllI[119] = 0x4B ^ 5;
        T.lllllIllI[120] = 0x1E ^ 0x78 ^ (0x61 ^ 0x48);
        T.lllllIllI[121] = 3 ^ (0xD4 ^ 0x87);
        T.lllllIllI[122] = 3 ^ 0x52;
        T.lllllIllI[123] = 176 + 19 - 27 + 28 ^ 79 + 107 - 160 + 124;
        T.lllllIllI[124] = 0x73 ^ 0x2D ^ (0x31 ^ 0x3C);
        T.lllllIllI[125] = 67 + 90 - -26 + 48 ^ 78 + 114 - 128 + 115;
        T.lllllIllI[126] = 0x89 ^ 0xBE ^ (0xA3 ^ 0xC1);
        T.lllllIllI[127] = 0xED ^ 0xBB;
        T.lllllIllI[128] = 138 + 194 - 213 + 86 ^ 27 + 43 - -39 + 45;
        T.lllllIllI[129] = 0xF ^ 0x57;
        T.lllllIllI[130] = 0xAD ^ 0xA3 ^ (0xDE ^ 0x89);
        T.lllllIllI[131] = 0x55 ^ 0xE;
        T.lllllIllI[132] = 0x27 ^ 0x7B;
        T.lllllIllI[133] = 0xB3 ^ 0xBD ^ (0x14 ^ 0x47);
        T.lllllIllI[134] = 20 + 83 - -53 + 76 ^ 101 + 43 - 4 + 42;
        T.lllllIllI[135] = 0xE8 ^ 0xB7;
        T.lllllIllI[136] = 2 ^ 0x74 ^ (0x1C ^ 0xA);
        T.lllllIllI[137] = 0xA0 ^ 0xC1;
        T.lllllIllI[138] = -(0x43 ^ 0x59) & (0xFFFF8BFD & 0x7FDF);
        T.lllllIllI[139] = 0xFFFF9E75 & 0x6DFF;
        T.lllllIllI[140] = 0x2D ^ 0x4F;
        T.lllllIllI[141] = 0x1A ^ 0x79;
        T.lllllIllI[142] = 0xE4 ^ 0x80;
        T.lllllIllI[143] = 7 + 90 - -131 + 26 ^ 95 + 24 - 73 + 109;
        T.lllllIllI[144] = 0xD9 ^ 0xBF;
        T.lllllIllI[145] = 31 + 91 - -41 + 58 ^ 108 + 95 - 61 + 44;
        T.lllllIllI[146] = 0x7D ^ 0x15;
        T.lllllIllI[147] = 2 ^ 0x77 ^ (0x27 ^ 0x3B);
        T.lllllIllI[148] = 0xD5 ^ 0xBF;
        T.lllllIllI[149] = 0xFFFFEB7B & 0x1FEE;
        T.lllllIllI[150] = 0xFFFF8CF7 & 0x7FAE;
        T.lllllIllI[151] = -(0xFFFFF4B7 & 0x5F59) & (0xFFFFDFF4 & 0x7F7F);
        T.lllllIllI[152] = -(0xFFFF8A7D & 0x778E) & (0xFFFFA7EF & 0x7FBF);
        T.lllllIllI[153] = 0xFFFFABFD & 0x5F7F;
        T.lllllIllI[154] = 0xFFFFECBF & 0x1FF0;
        T.lllllIllI[155] = 0x83 ^ 0x98 ^ (0xD8 ^ 0xA8);
        T.lllllIllI[156] = 0x40 ^ 0x2C;
        T.lllllIllI[157] = 0x24 ^ 0x49;
        T.lllllIllI[158] = 0xFFFFCF6F & 0x3BF9;
        T.lllllIllI[159] = -(0xFFFFD7E9 & 0x3A57) & (0xFFFFBEFB & 0x5FF6);
        T.lllllIllI[160] = 0xFFFFDBFB & 0x2F6F;
        T.lllllIllI[161] = 0xFFFF8FBF & 0x7CF7;
        T.lllllIllI[162] = -(0xFFFFE379 & 0x5DFF) & (0xFFFFDF7F & 0x67FF);
        T.lllllIllI[163] = 0xFFFFAB73 & 0x5FFE;
        T.lllllIllI[164] = 0xFFFFFEEF & 0xDB5;
        T.lllllIllI[165] = 0xB2 ^ 0xC1 ^ (0xAE ^ 0xB3);
        T.lllllIllI[166] = -(0xFFFFD0FB & 0x3F67) & (0xFFFFFFE7 & 0x1FFB);
        T.lllllIllI[167] = 0x4A ^ 0x25;
        T.lllllIllI[168] = 0xF1 ^ 0x81 ^ (0x60 ^ 0x7F) & ~(0x20 ^ 0x3F);
        T.lllllIllI[169] = -(0xFFFFFBF3 & 0x241E) & (0xFFFFBF7F & 0x6BFF);
        T.lllllIllI[170] = 0xFFFFBCFD & 0x4FB7;
        T.lllllIllI[171] = 0xDC ^ 0xAD;
        T.lllllIllI[172] = 0x1D ^ 5 ^ (0xE2 ^ 0x88);
        T.lllllIllI[173] = 0xF7 ^ 0xC5 ^ (0xD ^ 0x4C);
        T.lllllIllI[174] = 0x2B ^ 0x5F;
        T.lllllIllI[175] = 62 + 85 - 1 + 76 ^ 38 + 94 - 111 + 150;
        T.lllllIllI[176] = -(0xFFFFF6A7 & 0x3D5F) & (0xFFFFBF7E & Short.MAX_VALUE);
        T.lllllIllI[177] = -(0xFFFFEA5B & 0x37FD) & (0xFFFFEEFE & 0x3FFD);
        T.lllllIllI[178] = -(0xFFFFA9F5 & 0x777F) & (0xFFFFBF7D & 0x67FE);
        T.lllllIllI[179] = 0x22 ^ 0x54;
        T.lllllIllI[180] = -(0xFFFFFAD9 & 0x157F) & (0xFFFFFFDF & 0x1FFF);
        T.lllllIllI[181] = 0x13 ^ 0x64;
        T.lllllIllI[182] = 117 + 243 - 208 + 93 ^ 94 + 56 - 102 + 93;
        T.lllllIllI[183] = 0xFFFFEFFB & 0x1B77;
        T.lllllIllI[184] = -(0xFFFFB349 & 0x7DFF) & (0xFFFFBFFF & 0x7DFC);
        T.lllllIllI[185] = 112 + 162 - 84 + 63 ^ 76 + 4 - -13 + 39;
        T.lllllIllI[186] = 0x2C ^ 0x56;
        T.lllllIllI[187] = 0x43 ^ 0x38;
        T.lllllIllI[188] = 0xD7 ^ 0xAB;
        T.lllllIllI[189] = 0xFFFFDF9B & 0x266D;
        T.lllllIllI[190] = 0x1E ^ 0x6E ^ (0x74 ^ 0x79);
        T.lllllIllI[191] = 0xFFFF9FFE & 0x6F85;
        T.lllllIllI[192] = 131 + 87 - 162 + 147 ^ 177 + 137 - 240 + 107;
        T.lllllIllI[193] = (0x11 ^ 0x32) + (0x5B ^ 0x5C) - -(0xC5 ^ 0x90) + ((0x55 ^ 0x7C) & ~(0x64 ^ 0x4D));
        T.lllllIllI[194] = 0xFFFFEB7F & 0x1FEC;
        T.lllllIllI[195] = 28 + 34 - 46 + 112;
        T.lllllIllI[196] = (0xF2 ^ 0x90) + (0x80 ^ 0xB5) - (0x86 ^ 0x9C) + (0x2B ^ 0x2F);
        T.lllllIllI[197] = 52 + 76 - 4 + 6;
        T.lllllIllI[198] = (0xCC ^ 0xB4) + (0x20 ^ 0x28) - (0xD6 ^ 0xA1) + (0xD6 ^ 0xAC);
        T.lllllIllI[199] = 0xFFFFFB7B & 0xFFF;
        T.lllllIllI[200] = 0xFFFFDEEF & 0x2DB8;
        T.lllllIllI[201] = 43 + 43 - 51 + 97;
        T.lllllIllI[202] = 67 + 90 - 84 + 60;
        T.lllllIllI[203] = -(0xFFFFFFFD & 0x1A46) & (0xFFFFBFF7 & Short.MAX_VALUE);
        T.lllllIllI[204] = -(0xFFFFFDAD & 0x32DB) & (0xFFFFBFFF & 0x7BFD);
        T.lllllIllI[205] = 0xFFFFA7AE & 0x7DFF;
        T.lllllIllI[206] = 0xFFFFBDFB & 0x67AF;
        T.lllllIllI[207] = 0xFFFFD69B & 0x2F6E;
        T.lllllIllI[208] = 40 + 113 - 67 + 48;
        T.lllllIllI[209] = -(0xF4 ^ 0xA6) & (0xFFFFAFFF & 0x5FDD);
        T.lllllIllI[210] = (0x6D ^ 0x16) + (48 + 96 - 117 + 103) - (67 + 2 - -117 + 59) + (76 + 59 - 83 + 75);
        T.lllllIllI[211] = (0x7E ^ 0x77) + (0x56 ^ 0x16) - (0xC ^ 0x2A) + (0x1A ^ 0x7F);
        T.lllllIllI[212] = -(0x45 ^ 0x16) & (0xFFFFBDFE & 0x67FF);
        T.lllllIllI[213] = (0x71 ^ 0x79) + (0x4A ^ 0x6B) - (0 ^ 0x28) + (66 + 93 - 84 + 61);
        T.lllllIllI[214] = 93 + 121 - 126 + 50;
        T.lllllIllI[215] = (0x30 ^ 5) + (0x93 ^ 0xC1) - (0x29 ^ 0x70) + (0x1F ^ 0x42);
        T.lllllIllI[216] = -(0xFFFFE575 & 0x7AEB) & (0xFFFFFF7B & 0x66EF);
        T.lllllIllI[217] = (0x6A ^ 0x58) + (0x4B ^ 0x73) - (0x40 ^ 0xC) + (0xAF ^ 0xC1);
        T.lllllIllI[218] = -(0xFFFFDD79 & 0x7ECF) & (0xFFFFFF7F & 0x5FFF);
        T.lllllIllI[219] = 63 + 73 - 105 + 110;
        T.lllllIllI[220] = (0x95 ^ 0xB9) + (0x43 ^ 0x48) - (0xC ^ 0x10) + (0x41 ^ 0x32);
        T.lllllIllI[221] = -(0xFFFFFF5F & 0x34AD) & (0xFFFFFF7F & 0x3FFD);
        T.lllllIllI[222] = 0xFFFFADF7 & 0x77BB;
        T.lllllIllI[223] = 71 + 9 - -25 + 38;
        T.lllllIllI[224] = (0xC ^ 0x72) + (10 + 99 - 52 + 77) - (18 + 34 - -92 + 71) + (0x1A ^ 0x79);
        T.lllllIllI[225] = (0x3B ^ 0x59) + (0xB ^ 0xD) - (0x6A ^ 0x24) + (0xE1 ^ 0x96);
        T.lllllIllI[226] = 25 + 81 - 40 + 80;
        T.lllllIllI[227] = 0xFFFFB73C & 0x4ECF;
        T.lllllIllI[228] = (0xE6 ^ 0xA9) + (0xE9 ^ 0xA5) - (0x4B ^ 0x7E) + (0xF ^ 0x22);
        T.lllllIllI[229] = 68 + 137 - 70 + 13;
        T.lllllIllI[230] = -(0x8F ^ 0xC6) & (0xFFFFFFFF & 0x25FF);
        T.lllllIllI[231] = (0x7E ^ 0x66) + (0x7A ^ 0x10) - (0x15 ^ 0x75) + (0x17 ^ 0x64);
        T.lllllIllI[232] = 68 + 28 - -33 + 21;
        T.lllllIllI[233] = (0x2B ^ 0x70) + (56 + 123 - 67 + 27) - (29 + 17 - -78 + 8) + (0x17 ^ 0x22);
        T.lllllIllI[234] = 1 + 104 - 104 + 151;
        T.lllllIllI[235] = (0x56 ^ 0x42) + (0xA1 ^ 0xC7) - (0xD3 ^ 0x83) + (0x41 ^ 0x2E);
        T.lllllIllI[236] = (0x9D ^ 0xC6) + (0x10 ^ 0xD) - -(0x16 ^ 0x12) + (0x6C ^ 0x72);
        T.lllllIllI[237] = (0xF1 ^ 0xC4) + (0xD5 ^ 0x90) - (0x6F ^ 0x73) + (0x72 ^ 0x4F);
        T.lllllIllI[238] = (0xCC ^ 0xA8) + 3 - (0xB0 ^ 0x86) + (0xC4 ^ 0xAF);
        T.lllllIllI[239] = 81 + 8 - -52 + 16;
        T.lllllIllI[240] = 105 + 95 - 120 + 78;
        T.lllllIllI[241] = 96 + 126 - 119 + 56;
        T.lllllIllI[242] = 102 + 158 - 185 + 85;
        T.lllllIllI[243] = (0x1D ^ 0x69) + (0x3D ^ 0x54) - (63 + 66 - 126 + 213) + (56 + 8 - -87 + 5);
        T.lllllIllI[244] = (0x2E ^ 0x6F) + (0x43 ^ 0x71) - -3 + (0x45 ^ 0x69);
        T.lllllIllI[245] = (0xA6 ^ 0x9A) + (0xDE ^ 0xB9) - (62 + 20 - -46 + 11) + (71 + 14 - -15 + 39);
        T.lllllIllI[246] = 133 + 20 - 63 + 74;
        T.lllllIllI[247] = 0 + 57 - -23 + 85;
        T.lllllIllI[248] = 30 + 88 - 113 + 143 + (0x1E ^ 0x42) - (85 + 81 - -23 + 23) + (95 + 115 - 200 + 128);
        T.lllllIllI[249] = 17 + 125 - 134 + 159;
        T.lllllIllI[250] = (0x6D ^ 0x56) + (7 ^ 0x38) - (0x37 ^ 0x1D) + (0x5C ^ 4);
        T.lllllIllI[251] = 117 + 33 - 139 + 158;
        T.lllllIllI[252] = 161 + 120 - 169 + 58;
        T.lllllIllI[253] = 146 + 154 - 133 + 4;
        T.lllllIllI[254] = 115 + 29 - 2 + 27 + (0x6B ^ 0xA) - (0xCF ^ 0xAC) + (0x6F ^ 0x6A);
        T.lllllIllI[255] = (0x3D ^ 0x40) + (0x37 ^ 0xF) - (0x2F ^ 0x17) + (0x40 ^ 0x70);
        T.lllllIllI[256] = 159 + 100 - 173 + 88;
        T.lllllIllI[257] = 150 + 72 - 124 + 77;
        T.lllllIllI[258] = 0xFFFFCEDB & 0x3D3E;
        T.lllllIllI[259] = -(0xFFFFBB65 & 0x75DF) & (0xFFFFBDFF & 0x7FFE);
        T.lllllIllI[260] = (0x19 ^ 0x53) + (0xD4 ^ 0x85) - (0x3F ^ 0x1E) + (0xE ^ 0x36);
        T.lllllIllI[261] = 82 + 36 - 93 + 154;
        T.lllllIllI[262] = 68 + 47 - 70 + 135;
        T.lllllIllI[263] = 86 + 136 - 124 + 83;
        T.lllllIllI[264] = 88 + 48 - -9 + 37;
        T.lllllIllI[265] = 118 + 102 - 113 + 76;
        T.lllllIllI[266] = (0xA4 ^ 0x88) + (0xCC ^ 0xBB) - (82 + 52 - -4 + 4) + (157 + 59 - 117 + 64);
        T.lllllIllI[267] = 55 + 8 - -110 + 12;
        T.lllllIllI[268] = (8 ^ 0x1E) + (0x56 ^ 4) - -(0x70 ^ 0x54) + (0x32 ^ 0x1C);
        T.lllllIllI[269] = -(0xFFFFF297 & 0x4D69) & (0xFFFFEFFF & 0x5B08);
        T.lllllIllI[270] = -(0xFFFFFF5D & 0x5AE3) & (0xFFFFFFD7 & Short.MAX_VALUE);
        T.lllllIllI[271] = 0xFFFF8B97 & 0x7F7A;
        T.lllllIllI[272] = (0xE2 ^ 0xC2) + (23 + 2 - -27 + 100) - (0x18 ^ 0x54) + (0xC ^ 0x43);
        T.lllllIllI[273] = 125 + 5 - 56 + 114;
        T.lllllIllI[274] = 119 + 91 - 158 + 75 + (0x8B ^ 0x95) - (0 ^ 0x38) + (0x1C ^ 0x44);
        T.lllllIllI[275] = (0x85 ^ 0xB4) + (61 + 100 - 140 + 140) - (0x69 ^ 0x14) + (0xDB ^ 0xB2);
        T.lllllIllI[276] = -(0xFFFFF5C1 & 0x6EFF) & (0xFFFFEFDD & Short.MAX_VALUE);
        T.lllllIllI[277] = 89 + 134 - 127 + 95;
        T.lllllIllI[278] = (0x77 ^ 0x34) + (0xB6 ^ 0x9A) - -(0xA4 ^ 0xBE) + (0x71 ^ 0x46);
        T.lllllIllI[279] = (0x11 ^ 0x62) + (1 ^ 0xB) - (0xC3 ^ 0xBB) + (54 + 25 - 65 + 174);
        T.lllllIllI[280] = 57 + 135 - 99 + 47 + (64 + 29 - -3 + 68) - (63 + 98 - 127 + 107) + (0xA1 ^ 0xBE);
        T.lllllIllI[281] = (0xC ^ 0x53) + (0xE ^ 0x2C) - -(0x6E ^ 0x78) + (0x13 ^ 0x3F);
        T.lllllIllI[282] = 154 + 164 - 164 + 42;
        T.lllllIllI[283] = 93 + 81 - 109 + 132;
        T.lllllIllI[284] = 178 + 117 - 247 + 150;
        T.lllllIllI[285] = 151 + 79 - 210 + 179;
        T.lllllIllI[286] = (0xFE ^ 0xB3) + (0x6A ^ 0x10) - (28 + 90 - 77 + 86) + (35 + 105 - 102 + 90);
        T.lllllIllI[287] = 128 + 42 - 17 + 48;
        T.lllllIllI[288] = 16 + 99 - 10 + 97;
        T.lllllIllI[289] = 125 + 125 - 225 + 178;
        T.lllllIllI[290] = 118 + 59 - 29 + 56;
        T.lllllIllI[291] = -(0xFFFFB7F3 & 0x785F) & (0xFFFFFFDF & 0x3FFF);
        T.lllllIllI[292] = 47 + 92 - 104 + 170;
        T.lllllIllI[293] = 73 + 110 - 115 + 65 + (0xDC ^ 0xA8) - (0x2B ^ 0x69) + (0x7B ^ 0x6C);
        T.lllllIllI[294] = -1;
        T.lllllIllI[295] = 37 + 203 - 160 + 127;
        T.lllllIllI[296] = (0xCC ^ 0x99) + (0x74 ^ 0x5A) - -(6 ^ 0x13) + (0x8F ^ 0xB7);
        T.lllllIllI[297] = 56 + 29 - -85 + 39;
        T.lllllIllI[298] = 133 + 164 - 123 + 36;
        T.lllllIllI[299] = 37 + 195 - 213 + 192;
        T.lllllIllI[300] = 134 + 56 - 38 + 26 + (0x5F ^ 0x10) - (104 + 198 - 138 + 41) + (16 + 6 - -21 + 117);
        T.lllllIllI[301] = 146 + 28 - -37 + 2;
        T.lllllIllI[302] = 202 + 192 - 209 + 29;
        T.lllllIllI[303] = 82 + 34 - 95 + 194;
        T.lllllIllI[304] = 72 + 1 - 3 + 146;
        T.lllllIllI[305] = -(0xFFFFB37E & 0x5DEF) & (0xFFFF977F & 0x7FEF);
        T.lllllIllI[306] = 6 + 110 - 9 + 56 + (0x7C ^ 0xE) - (0xD6 ^ 0x97) + (0x93 ^ 0x96);
        T.lllllIllI[307] = 208 + 193 - 392 + 209;
        T.lllllIllI[308] = 17 + 111 - 44 + 61 + (0x6A ^ 0x38) - (53 + 59 - 36 + 113) + (107 + 174 - 228 + 128);
        T.lllllIllI[309] = 0xFFFFBFEF & 0x43F8;
        T.lllllIllI[310] = -(0xFFFFA32F & 0x7DDE) & (0xFFFFFFEF & 0x6F3D);
        T.lllllIllI[311] = 0xFFFFF1F9 & 0x6FAE;
        T.lllllIllI[312] = 0xFFFFA8FF & 0xDFB8;
        T.lllllIllI[313] = 0xFFFFEFCF & 0x3EFC;
        T.lllllIllI[314] = 0xFFFF9555 & 0x6FBE;
        T.lllllIllI[315] = 70 + 40 - -4 + 13 + (0x53 ^ 0x2E) - (159 + 137 - 280 + 182) + (161 + 24 - 81 + 62);
        T.lllllIllI[316] = (0xF ^ 8) + (126 + 69 - 55 + 25) - (0xC4 ^ 0xA8) + (24 + 86 - 38 + 85);
        T.lllllIllI[317] = 79 + 80 - 117 + 180;
        T.lllllIllI[318] = 120 + 68 - 145 + 180;
        T.lllllIllI[319] = 86 + 193 - 235 + 180;
        T.lllllIllI[320] = 45 + 139 - 48 + 79 + (19 + 79 - 49 + 92) - (0xFFFFE5F7 & 0x1B3B) + (19 + 173 - 63 + 47);
        T.lllllIllI[321] = 154 + 188 - 308 + 192;
        T.lllllIllI[322] = 191 + 61 - 82 + 57;
        T.lllllIllI[323] = 148 + 77 - 199 + 123 + (0xF0 ^ 0x88) - (0xFFFF89DF & 0x772B) + (95 + 10 - 23 + 144);
        T.lllllIllI[324] = 9 + 146 - 77 + 151;
        T.lllllIllI[325] = 209 + 32 - 52 + 41;
        T.lllllIllI[326] = (0x45 ^ 0x2E) + (0xAD ^ 0xB8) - (0x45 ^ 0x59) + (16 + 119 - 32 + 28);
        T.lllllIllI[327] = 95 + 94 - 118 + 120 + (6 ^ 1) - (0x6F ^ 0x64) + (0x20 ^ 0xD);
        T.lllllIllI[328] = 229 + 55 - 168 + 117;
        T.lllllIllI[329] = (0x21 ^ 0x35) + (135 + 112 - 220 + 113) - (0x5A ^ 0x53) + (0xFC ^ 0xAF);
        T.lllllIllI[330] = 188 + 13 - 83 + 117;
        T.lllllIllI[331] = 187 + 17 - -7 + 0 + (0xA ^ 0x2C) - (25 + 143 - 17 + 7) + (101 + 56 - 68 + 56);
        T.lllllIllI[332] = 44 + 108 - 141 + 130 + (0xBA ^ 0xBD) - (0x53 ^ 0x34) + (7 + 77 - -59 + 49);
        T.lllllIllI[333] = (0x14 ^ 0x3F) + (0xF9 ^ 0x8A) - (0x4C ^ 0x57) + (0x46 ^ 0x2D);
        T.lllllIllI[334] = 181 + 77 - 28 + 9;
        T.lllllIllI[335] = (0x67 ^ 0x68) + (0xF1 ^ 0xBF) - (0x8D ^ 0x9E) + (0 + 116 - 99 + 149);
        T.lllllIllI[336] = 48 + 157 - 118 + 154;
        T.lllllIllI[337] = 150 + 37 - 46 + 23 + (92 + 5 - 3 + 133) - (0xFFFFFFBF & 0x14F) + (1 ^ 0x7B);
        T.lllllIllI[338] = 0 + 192 - 185 + 227 + (0x15 ^ 0x10) - (8 ^ 0x55) + (0x59 ^ 0x38);
        T.lllllIllI[339] = (6 ^ 0x71) + ((0x33 ^ 0x50) & ~(0x38 ^ 0x5B)) - -(0x44 ^ 0x5F) + (5 ^ 0x67);
        T.lllllIllI[340] = 111 + 203 - 143 + 74;
        T.lllllIllI[341] = -(0xFFFFB2BB & 0x4FCD) & (0xFFFFAEFF & 0x5FFF);
        T.lllllIllI[342] = 0xFFFFFFA3 & 0xD7E;
        T.lllllIllI[343] = 0xFFFFFFFF & 0xBFC;
        T.lllllIllI[344] = 0xFFFFFFBE & 0xDFF;
        T.lllllIllI[345] = -(0xFFFFF777 & 0x5BF9) & (0xFFFFDFFA & Short.MAX_VALUE);
        T.lllllIllI[346] = -(0xFFFFB679 & 0x7BAF) & (0xFFFFBEFE & 0x7FBF);
        T.lllllIllI[347] = 0xFFFFCBE6 & 0x3FFF;
        T.lllllIllI[348] = 0xFFFF9F83 & 0x6CFF;
        T.lllllIllI[349] = 35 + 108 - -9 + 12 + 1 - -(0xC6 ^ 0xC3) + (0x6F ^ 0x23);
        T.lllllIllI[350] = 237 + 151 - 169 + 28;
        T.lllllIllI[351] = 92 + 44 - 54 + 73 + (0x76 ^ 0x34) - (0x33 ^ 0x1A) + (0xC9 ^ 0x8D);
        T.lllllIllI[352] = 44 + 36 - -119 + 0 + (0x93 ^ 0xBB) - (97 + 115 - 141 + 77) + (76 + 76 - 22 + 28);
        T.lllllIllI[353] = 44 + 32 - 68 + 242;
        T.lllllIllI[354] = 47 + 182 - 18 + 40;
        T.lllllIllI[355] = 179 + 56 - 232 + 198 + (36 + 30 - 44 + 124) - (57 + 95 - 65 + 68) + (0x64 ^ 0x58);
        T.lllllIllI[356] = 245 + 93 - 328 + 243;
        T.lllllIllI[357] = 16 + 110 - -24 + 91 + (148 + 66 - 58 + 17) - (209 + 238 - 354 + 160) + (0xDC ^ 0x81);
        T.lllllIllI[358] = (0x42 ^ 0x1F) + (0xE1 ^ 0x8A) - -(0x91 ^ 0xA5) + 3;
        T.lllllIllI[359] = -(0xFFFFEBD4 & 0x3C7F) & (0xFFFFED7B & 0x3BD7);
        T.lllllIllI[360] = 0xFFFF8743 & 0x79BD;
        T.lllllIllI[361] = -(0xFFFFEB72 & 0x36FF) & (0xFFFFBBFF & 0x6773);
        T.lllllIllI[362] = 0xFFFFAFCB & 0x5137;
        T.lllllIllI[363] = 0xFFFFF9DE & 0x725;
        T.lllllIllI[364] = -(0xFFFFEF71 & 0x7AFF) & (0xFFFFFFF7 & 0x6B7D);
        T.lllllIllI[365] = 0xFFFFEF4F & 0x11B6;
    }

    /*
     * WARNING - void declaration
     */
    private static void cZ() {
        void lIlIlllIlIllI;
        BankLocation bankLocation = BankLocation.getNearest();
        if (T.llIlIllIIIII(bankLocation) && T.llIlIlIlllII(bankLocation.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderGWD.c = llllIllll[lllllIllI[306]];
            Movement.walkTo((BankLocation)bankLocation);
            0;
            Time.sleepTicks((int)lllllIllI[2]);
            0;
        }
        if (T.llIlIllIIIII(lIlIlllIlIllI) && T.llIlIlIllIlI(lIlIlllIlIllI.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderGWD.c = llllIllll[lllllIllI[307]];
            if (T.llIlIlIlllII(Bank.isOpen() ? 1 : 0)) {
                a.a();
                Time.sleepUntil(() -> Bank.isOpen(), (int)lllllIllI[18]);
                0;
            }
            if (T.llIlIlIllIlI(Bank.isOpen() ? 1 : 0)) {
                if (T.llIlIlIllllI(Inventory.getAll().size())) {
                    Bank.depositInventory();
                    Time.sleepTicks((int)lllllIllI[9]);
                    0;
                }
                a.a(lllllIllI[19], lllllIllI[11]);
                a.a(lllllIllI[22], lllllIllI[11]);
                a.a(lllllIllI[21], lllllIllI[11]);
                a.b(f.bc, lllllIllI[2]);
                a.a(lllllIllI[45], lllllIllI[7]);
                a.a(lllllIllI[33], lllllIllI[1]);
                a.a(lllllIllI[32], lllllIllI[1]);
                a.a(lllllIllI[30], lllllIllI[1]);
                a.a(lllllIllI[31], lllllIllI[1]);
                a.a(lllllIllI[46], lllllIllI[47]);
                Bank.withdraw((String)llllIllll[lllllIllI[308]], (int)lllllIllI[1], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                int[] nArray = new int[lllllIllI[1]];
                nArray[T.lllllIllI[0]] = lllllIllI[36];
                if (T.llIlIlIlllII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    int[] nArray2 = new int[lllllIllI[1]];
                    nArray2[T.lllllIllI[0]] = lllllIllI[36];
                    if (T.llIlIlIlllII(Equipment.contains((int[])nArray2) ? 1 : 0)) {
                        Bank.withdraw((int)lllllIllI[36], (int)lllllIllI[1], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                    }
                }
                a.a(lllllIllI[35], Inventory.getFreeSlots());
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    private static void cY() {
        void lIlIlllIllIII;
        BankLocation bankLocation = BankLocation.getNearest();
        if (T.llIlIllIIIII(bankLocation) && T.llIlIlIlllII(bankLocation.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderGWD.c = llllIllll[lllllIllI[303]];
            Movement.walkTo((BankLocation)bankLocation);
            0;
            Time.sleepTicks((int)lllllIllI[2]);
            0;
        }
        if (T.llIlIllIIIII(lIlIlllIllIII) && T.llIlIlIllIlI(lIlIlllIllIII.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderGWD.c = llllIllll[lllllIllI[304]];
            if (T.llIlIlIlllII(Bank.isOpen() ? 1 : 0)) {
                a.a();
                Time.sleepUntil(() -> Bank.isOpen(), (int)lllllIllI[18]);
                0;
            }
            if (T.llIlIlIllIlI(Bank.isOpen() ? 1 : 0)) {
                if (T.llIlIlIllllI(Inventory.getAll().size())) {
                    Bank.depositInventory();
                    Time.sleepTicks((int)lllllIllI[9]);
                    0;
                }
                a.a(lllllIllI[19], lllllIllI[11]);
                a.a(lllllIllI[22], lllllIllI[11]);
                a.a(lllllIllI[21], lllllIllI[11]);
                a.b(f.bc, lllllIllI[11]);
                a.a(lllllIllI[35], lllllIllI[11]);
                a.a(lllllIllI[45], lllllIllI[1]);
                a.a(lllllIllI[27], lllllIllI[7]);
                a.a(lllllIllI[34], lllllIllI[1]);
                a.a(lllllIllI[24], lllllIllI[25]);
                a.a(lllllIllI[305], lllllIllI[1]);
                a.a(lllllIllI[46], lllllIllI[47]);
                int[] nArray = new int[lllllIllI[1]];
                nArray[T.lllllIllI[0]] = lllllIllI[36];
                if (T.llIlIlIlllII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    int[] nArray2 = new int[lllllIllI[1]];
                    nArray2[T.lllllIllI[0]] = lllllIllI[36];
                    if (T.llIlIlIlllII(Equipment.contains((int[])nArray2) ? 1 : 0)) {
                        Bank.withdraw((int)lllllIllI[36], (int)lllllIllI[1], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                    }
                }
            }
        }
    }

    private static boolean llIlIlIllIlI(int n2) {
        return n2 != 0;
    }

    private static void Q() {
        block50: {
            d lIlIlllIIlllI;
            block49: {
                block48: {
                    block47: {
                        block46: {
                            block45: {
                                Object lIlIlllIIllll;
                                block44: {
                                    block43: {
                                        block42: {
                                            block41: {
                                                block40: {
                                                    block39: {
                                                        block38: {
                                                            block37: {
                                                                block36: {
                                                                    block35: {
                                                                        int[] nArray = new int[lllllIllI[1]];
                                                                        nArray[T.lllllIllI[0]] = lllllIllI[27];
                                                                        if (!T.llIlIlIllIlI(Bank.contains((int[])nArray) ? 1 : 0)) break block35;
                                                                        int[] nArray2 = new int[lllllIllI[1]];
                                                                        nArray2[T.lllllIllI[0]] = lllllIllI[27];
                                                                        if (!T.llIlIlIllIlI(Bank.contains((int[])nArray2) ? 1 : 0)) break block36;
                                                                        int[] nArray3 = new int[lllllIllI[1]];
                                                                        nArray3[T.lllllIllI[0]] = lllllIllI[27];
                                                                        if (!T.llIlIlIllIll(Bank.getFirst((int[])nArray3).getQuantity(), lllllIllI[7])) break block36;
                                                                    }
                                                                    lIlIlllIIllll = new d(lllllIllI[27], lllllIllI[7], lllllIllI[309]);
                                                                    bx.add((d)lIlIlllIIllll);
                                                                    0;
                                                                }
                                                                int[] nArray = new int[lllllIllI[1]];
                                                                nArray[T.lllllIllI[0]] = lllllIllI[35];
                                                                if (!T.llIlIlIllIlI(Bank.contains((int[])nArray) ? 1 : 0)) break block37;
                                                                int[] nArray4 = new int[lllllIllI[1]];
                                                                nArray4[T.lllllIllI[0]] = lllllIllI[35];
                                                                if (!T.llIlIlIllIlI(Bank.contains((int[])nArray4) ? 1 : 0)) break block38;
                                                                int[] nArray5 = new int[lllllIllI[1]];
                                                                nArray5[T.lllllIllI[0]] = lllllIllI[35];
                                                                if (!T.llIlIlIllIll(Bank.getFirst((int[])nArray5).getQuantity(), lllllIllI[63])) break block38;
                                                            }
                                                            lIlIlllIIllll = new d(lllllIllI[35], lllllIllI[63], lllllIllI[309]);
                                                            bx.add((d)lIlIlllIIllll);
                                                            0;
                                                        }
                                                        int[] nArray = new int[lllllIllI[1]];
                                                        nArray[T.lllllIllI[0]] = lllllIllI[39];
                                                        if (T.llIlIlIlllII(Bank.contains((int[])nArray) ? 1 : 0)) {
                                                            lIlIlllIIllll = new d(lllllIllI[39], lllllIllI[1], lllllIllI[310]);
                                                            bx.add((d)lIlIlllIIllll);
                                                            0;
                                                        }
                                                        int[] nArray6 = new int[lllllIllI[1]];
                                                        nArray6[T.lllllIllI[0]] = lllllIllI[41];
                                                        if (T.llIlIlIlllII(Bank.contains((int[])nArray6) ? 1 : 0)) {
                                                            lIlIlllIIllll = new d(lllllIllI[41], lllllIllI[1], lllllIllI[311]);
                                                            bx.add((d)lIlIlllIIllll);
                                                            0;
                                                        }
                                                        int[] nArray7 = new int[lllllIllI[1]];
                                                        nArray7[T.lllllIllI[0]] = lllllIllI[44];
                                                        if (T.llIlIlIlllII(Bank.contains((int[])nArray7) ? 1 : 0)) {
                                                            lIlIlllIIllll = new d(lllllIllI[44], lllllIllI[1], lllllIllI[312]);
                                                            bx.add((d)lIlIlllIIllll);
                                                            0;
                                                        }
                                                        int[] nArray8 = new int[lllllIllI[1]];
                                                        nArray8[T.lllllIllI[0]] = lllllIllI[42];
                                                        if (T.llIlIlIlllII(Bank.contains((int[])nArray8) ? 1 : 0)) {
                                                            lIlIlllIIllll = new d(lllllIllI[42], lllllIllI[7], lllllIllI[310]);
                                                            bx.add((d)lIlIlllIIllll);
                                                            0;
                                                        }
                                                        int[] nArray9 = new int[lllllIllI[1]];
                                                        nArray9[T.lllllIllI[0]] = lllllIllI[24];
                                                        if (!T.llIlIlIllIlI(Bank.contains((int[])nArray9) ? 1 : 0)) break block39;
                                                        int[] nArray10 = new int[lllllIllI[1]];
                                                        nArray10[T.lllllIllI[0]] = lllllIllI[24];
                                                        if (!T.llIlIlIllIlI(Bank.contains((int[])nArray10) ? 1 : 0)) break block40;
                                                        int[] nArray11 = new int[lllllIllI[1]];
                                                        nArray11[T.lllllIllI[0]] = lllllIllI[24];
                                                        if (!T.llIlIlIllIll(Bank.getFirst((int[])nArray11).getQuantity(), lllllIllI[25])) break block40;
                                                    }
                                                    lIlIlllIIllll = new d(lllllIllI[24], lllllIllI[25], lllllIllI[309]);
                                                    bx.add((d)lIlIlllIIllll);
                                                    0;
                                                }
                                                int[] nArray = new int[lllllIllI[1]];
                                                nArray[T.lllllIllI[0]] = lllllIllI[36];
                                                if (T.llIlIlIlllII(Bank.contains((int[])nArray) ? 1 : 0)) {
                                                    lIlIlllIIllll = new d(lllllIllI[36], lllllIllI[1], j.ch);
                                                    bx.add((d)lIlIlllIIllll);
                                                    0;
                                                }
                                                int[] nArray12 = new int[lllllIllI[1]];
                                                nArray12[T.lllllIllI[0]] = lllllIllI[34];
                                                if (T.llIlIlIlllII(Bank.contains((int[])nArray12) ? 1 : 0)) {
                                                    lIlIlllIIllll = new d(lllllIllI[34], lllllIllI[1], j.ch);
                                                    bx.add((d)lIlIlllIIllll);
                                                    0;
                                                }
                                                int[] nArray13 = new int[lllllIllI[1]];
                                                nArray13[T.lllllIllI[0]] = lllllIllI[33];
                                                if (T.llIlIlIlllII(Bank.contains((int[])nArray13) ? 1 : 0)) {
                                                    lIlIlllIIllll = new d(lllllIllI[33], lllllIllI[1], j.ch);
                                                    bx.add((d)lIlIlllIIllll);
                                                    0;
                                                }
                                                int[] nArray14 = new int[lllllIllI[1]];
                                                nArray14[T.lllllIllI[0]] = lllllIllI[32];
                                                if (T.llIlIlIlllII(Bank.contains((int[])nArray14) ? 1 : 0)) {
                                                    lIlIlllIIllll = new d(lllllIllI[32], lllllIllI[1], j.ch);
                                                    bx.add((d)lIlIlllIIllll);
                                                    0;
                                                }
                                                int[] nArray15 = new int[lllllIllI[1]];
                                                nArray15[T.lllllIllI[0]] = lllllIllI[30];
                                                if (T.llIlIlIlllII(Bank.contains((int[])nArray15) ? 1 : 0)) {
                                                    lIlIlllIIllll = new d(lllllIllI[30], lllllIllI[1], j.ch);
                                                    bx.add((d)lIlIlllIIllll);
                                                    0;
                                                }
                                                int[] nArray16 = new int[lllllIllI[1]];
                                                nArray16[T.lllllIllI[0]] = lllllIllI[31];
                                                if (T.llIlIlIlllII(Bank.contains((int[])nArray16) ? 1 : 0)) {
                                                    lIlIlllIIllll = new d(lllllIllI[31], lllllIllI[1], j.ch);
                                                    bx.add((d)lIlIlllIIllll);
                                                    0;
                                                }
                                                int[] nArray17 = new int[lllllIllI[1]];
                                                nArray17[T.lllllIllI[0]] = lllllIllI[37];
                                                if (!T.llIlIlIllIlI(Bank.contains((int[])nArray17) ? 1 : 0)) break block41;
                                                int[] nArray18 = new int[lllllIllI[1]];
                                                nArray18[T.lllllIllI[0]] = lllllIllI[37];
                                                if (!T.llIlIlIllIlI(Bank.contains((int[])nArray18) ? 1 : 0)) break block42;
                                                int[] nArray19 = new int[lllllIllI[1]];
                                                nArray19[T.lllllIllI[0]] = lllllIllI[37];
                                                if (!T.llIlIlIllIll(Bank.getFirst((int[])nArray19).getQuantity(), lllllIllI[23])) break block42;
                                            }
                                            lIlIlllIIllll = new d(lllllIllI[37], lllllIllI[23], j.ch);
                                            bx.add((d)lIlIlllIIllll);
                                            0;
                                        }
                                        int[] nArray = new int[lllllIllI[1]];
                                        nArray[T.lllllIllI[0]] = lllllIllI[45];
                                        if (!T.llIlIlIllIlI(Bank.contains((int[])nArray) ? 1 : 0)) break block43;
                                        int[] nArray20 = new int[lllllIllI[1]];
                                        nArray20[T.lllllIllI[0]] = lllllIllI[45];
                                        if (!T.llIlIlIllIlI(Bank.contains((int[])nArray20) ? 1 : 0)) break block44;
                                        int[] nArray21 = new int[lllllIllI[1]];
                                        nArray21[T.lllllIllI[0]] = lllllIllI[45];
                                        if (!T.llIlIlIllIll(Bank.getFirst((int[])nArray21).getQuantity(), lllllIllI[23])) break block44;
                                    }
                                    lIlIlllIIllll = new d(lllllIllI[45], lllllIllI[23], lllllIllI[47]);
                                    bx.add((d)lIlIlllIIllll);
                                    0;
                                }
                                if (T.llIlIlIlllII(Bank.contains((Predicate)(lIlIlllIIllll = item -> item.getName().toLowerCase().contains(llllIllll[lllllIllI[316]]))) ? 1 : 0)) {
                                    lIlIlllIIlllI = new d(lllllIllI[313], lllllIllI[11], lllllIllI[311]);
                                    bx.add(lIlIlllIIlllI);
                                    0;
                                }
                                int[] nArray = new int[lllllIllI[1]];
                                nArray[T.lllllIllI[0]] = lllllIllI[19];
                                if (!T.llIlIlIllIlI(Bank.contains((int[])nArray) ? 1 : 0)) break block45;
                                int[] nArray22 = new int[lllllIllI[1]];
                                nArray22[T.lllllIllI[0]] = lllllIllI[19];
                                if (!T.llIlIlIllIlI(Bank.contains((int[])nArray22) ? 1 : 0)) break block46;
                                int[] nArray23 = new int[lllllIllI[1]];
                                nArray23[T.lllllIllI[0]] = lllllIllI[19];
                                if (!T.llIlIlIllIll(Bank.getFirst((int[])nArray23).getQuantity(), lllllIllI[20])) break block46;
                            }
                            lIlIlllIIlllI = new d(lllllIllI[19], lllllIllI[10], lllllIllI[314]);
                            bx.add(lIlIlllIIlllI);
                            0;
                        }
                        int[] nArray = new int[lllllIllI[1]];
                        nArray[T.lllllIllI[0]] = lllllIllI[22];
                        if (!T.llIlIlIllIlI(Bank.contains((int[])nArray) ? 1 : 0)) break block47;
                        int[] nArray24 = new int[lllllIllI[1]];
                        nArray24[T.lllllIllI[0]] = lllllIllI[22];
                        if (!T.llIlIlIllIlI(Bank.contains((int[])nArray24) ? 1 : 0)) break block48;
                        int[] nArray25 = new int[lllllIllI[1]];
                        nArray25[T.lllllIllI[0]] = lllllIllI[22];
                        if (!T.llIlIlIllIll(Bank.getFirst((int[])nArray25).getQuantity(), lllllIllI[20])) break block48;
                    }
                    lIlIlllIIlllI = new d(lllllIllI[22], lllllIllI[10], lllllIllI[314]);
                    bx.add(lIlIlllIIlllI);
                    0;
                }
                int[] nArray = new int[lllllIllI[1]];
                nArray[T.lllllIllI[0]] = lllllIllI[21];
                if (!T.llIlIlIllIlI(Bank.contains((int[])nArray) ? 1 : 0)) break block49;
                int[] nArray26 = new int[lllllIllI[1]];
                nArray26[T.lllllIllI[0]] = lllllIllI[21];
                if (!T.llIlIlIllIlI(Bank.contains((int[])nArray26) ? 1 : 0)) break block50;
                int[] nArray27 = new int[lllllIllI[1]];
                nArray27[T.lllllIllI[0]] = lllllIllI[21];
                if (!T.llIlIlIllIll(Bank.getFirst((int[])nArray27).getQuantity(), lllllIllI[20])) break block50;
            }
            lIlIlllIIlllI = new d(lllllIllI[21], lllllIllI[10], lllllIllI[314]);
            bx.add(lIlIlllIIlllI);
            0;
        }
    }

    private static String llIlIIllIIlI(String lIlIllIIlIIII, String lIlIllIIlIlII) {
        lIlIllIIlIIII = new String(Base64.getDecoder().decode(lIlIllIIlIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lIlIllIIlIIll = new StringBuilder();
        char[] lIlIllIIlIIlI = lIlIllIIlIlII.toCharArray();
        int lIlIllIIlIIIl = lllllIllI[0];
        char[] lIlIllIIIlIll = lIlIllIIlIIII.toCharArray();
        int lIlIllIIIlIlI = lIlIllIIIlIll.length;
        int lIlIllIIIlIIl = lllllIllI[0];
        while (T.llIlIlIllIll(lIlIllIIIlIIl, lIlIllIIIlIlI)) {
            char lIlIllIIlIllI = lIlIllIIIlIll[lIlIllIIIlIIl];
            lIlIllIIlIIll.append((char)(lIlIllIIlIllI ^ lIlIllIIlIIlI[lIlIllIIlIIIl % lIlIllIIlIIlI.length]));
            0;
            ++lIlIllIIlIIIl;
            ++lIlIllIIIlIIl;
            0;
            if (3 >= 0) continue;
            return null;
        }
        return String.valueOf(lIlIllIIlIIll);
    }

    private static boolean llIlIllIIIlI(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean llIlIlIlllll(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean llIlIllIIlIl(Object object) {
        return object == null;
    }

    private static void llIlIlIlIlII() {
        llllIllll = new String[lllllIllI[365]];
        T.llllIllll[T.lllllIllI[0]] = T."Buying items";
        T.llllIllll[T.lllllIllI[1]] = T."Finished buying items, switching back to quest";
        T.llllIllll[T.lllllIllI[2]] = T."Crandor map";
        T.llllIllll[T.lllllIllI[7]] = T."Drink";
        T.llllIllll[T.lllllIllI[9]] = T."Drink";
        T.llllIllll[T.lllllIllI[11]] = T."Shark";
        T.llllIllll[T.lllllIllI[12]] = T."Shark";
        T.llllIllll[T.lllllIllI[13]] = T."Eat";
        T.llllIllll[T.lllllIllI[16]] = T."Nav to bank";
        T.llllIllll[T.lllllIllI[17]] = T."Handling banking";
        T.llllIllll[T.lllllIllI[23]] = T."We are missing teleports, switching to BUYING";
        T.llllIllll[T.lllllIllI[26]] = T."We are missing steel nails, switching to BUYING";
        T.llllIllll[T.lllllIllI[28]] = T."We are missing planks, switching to BUYING";
        T.llllIllll[T.lllllIllI[38]] = T."We are missing quest supplies, switching to BUYING";
        T.llllIllll[T.lllllIllI[40]] = T."Nav to champ guild";
        T.llllIllll[T.lllllIllI[20]] = T."Talking";
        T.llllIllll[T.lllllIllI[43]] = T."Guildmaster";
        T.llllIllll[T.lllllIllI[29]] = T."Nav to oziach";
        T.llllIllll[T.lllllIllI[50]] = T."Oziach";
        T.llllIllll[T.lllllIllI[51]] = T."Rune scimitar";
        T.llllIllll[T.lllllIllI[10]] = T."Wield";
        T.llllIllll[T.lllllIllI[52]] = T."Wear";
        T.llllIllll[T.lllllIllI[53]] = T."Wear";
        T.llllIllll[T.lllllIllI[55]] = T."Maze key";
        T.llllIllll[T.lllllIllI[8]] = T."Nav to champ guild";
        T.llllIllll[T.lllllIllI[56]] = T."Eat";
        T.llllIllll[T.lllllIllI[57]] = T."Talking";
        T.llllIllll[T.lllllIllI[58]] = T."Guildmaster";
        T.llllIllll[T.lllllIllI[60]] = T."Where can I find the right ship?";
        T.llllIllll[T.lllllIllI[61]] = T."I talked to Oziach...";
        T.llllIllll[T.lllllIllI[63]] = T."How can I protect myself from the dragon's breath?";
        T.llllIllll[T.lllllIllI[65]] = T."Maze key";
        T.llllIllll[T.lllllIllI[15]] = T."How can I find the route to Crandor?";
        T.llllIllll[T.lllllIllI[66]] = T."Where is Melzar's map piece?";
        T.llllIllll[T.lllllIllI[68]] = T."How can I find the route to Crandor?";
        T.llllIllll[T.lllllIllI[69]] = T."Where is Thalzar's map piece?";
        T.llllIllll[T.lllllIllI[70]] = T."How can I find the route to Crandor?";
        T.llllIllll[T.lllllIllI[71]] = T."Where is Lozar's map piece?";
        T.llllIllll[T.lllllIllI[74]] = T."Maze key";
        T.llllIllll[T.lllllIllI[77]] = T."Oracle";
        T.llllIllll[T.lllllIllI[78]] = T."Nav to oracle";
        T.llllIllll[T.lllllIllI[79]] = T."Oracle";
        T.llllIllll[T.lllllIllI[80]] = T."Oracle";
        T.llllIllll[T.lllllIllI[82]] = T."Lobster pot";
        T.llllIllll[T.lllllIllI[84]] = T."Lobster pot";
        T.llllIllll[T.lllllIllI[87]] = T."Nav to magic door";
        T.llllIllll[T.lllllIllI[88]] = T."Handling magic door";
        T.llllIllll[T.lllllIllI[89]] = T."Silk";
        T.llllIllll[T.lllllIllI[90]] = T."Silk";
        T.llllIllll[T.lllllIllI[91]] = T."Magic door";
        T.llllIllll[T.lllllIllI[6]] = T."Lobster pot";
        T.llllIllll[T.lllllIllI[92]] = T."Lobster pot";
        T.llllIllll[T.lllllIllI[93]] = T."Magic door";
        T.llllIllll[T.lllllIllI[94]] = T."Unfired bowl";
        T.llllIllll[T.lllllIllI[95]] = T."Unfired bowl";
        T.llllIllll[T.lllllIllI[96]] = T."Magic door";
        T.llllIllll[T.lllllIllI[97]] = T."Wizard's mind bomb";
        T.llllIllll[T.lllllIllI[98]] = T."Wizard's mind bomb";
        T.llllIllll[T.lllllIllI[99]] = T."Magic door";
        T.llllIllll[T.lllllIllI[100]] = T."Silk";
        T.llllIllll[T.lllllIllI[101]] = T."Silk";
        T.llllIllll[T.lllllIllI[102]] = T."Magic door";
        T.llllIllll[T.lllllIllI[103]] = T."Lobster pot";
        T.llllIllll[T.lllllIllI[104]] = T."Lobster pot";
        T.llllIllll[T.lllllIllI[105]] = T."Magic door";
        T.llllIllll[T.lllllIllI[106]] = T."Unfired bowl";
        T.llllIllll[T.lllllIllI[107]] = T."Unfired bowl";
        T.llllIllll[T.lllllIllI[108]] = T."Magic door";
        T.llllIllll[T.lllllIllI[109]] = T."Wizard's mind bomb";
        T.llllIllll[T.lllllIllI[110]] = T."Wizard's mind bomb";
        T.llllIllll[T.lllllIllI[111]] = T."Magic door";
        T.llllIllll[T.lllllIllI[112]] = T."Chest";
        T.llllIllll[T.lllllIllI[113]] = T."Magic door";
        T.llllIllll[T.lllllIllI[114]] = T."Open";
        T.llllIllll[T.lllllIllI[115]] = T."Open";
        T.llllIllll[T.lllllIllI[116]] = T."Open";
        T.llllIllll[T.lllllIllI[117]] = T."Search";
        T.llllIllll[T.lllllIllI[118]] = T."Search";
        T.llllIllll[T.lllllIllI[119]] = T."Silk";
        T.llllIllll[T.lllllIllI[120]] = T."Silk";
        T.llllIllll[T.lllllIllI[121]] = T."Magic door";
        T.llllIllll[T.lllllIllI[122]] = T."Lobster pot";
        T.llllIllll[T.lllllIllI[123]] = T."Lobster pot";
        T.llllIllll[T.lllllIllI[124]] = T."Magic door";
        T.llllIllll[T.lllllIllI[125]] = T."Unfired bowl";
        T.llllIllll[T.lllllIllI[126]] = T."Unfired bowl";
        T.llllIllll[T.lllllIllI[127]] = T."Magic door";
        T.llllIllll[T.lllllIllI[128]] = T."Wizard's mind bomb";
        T.llllIllll[T.lllllIllI[129]] = T."Wizard's mind bomb";
        T.llllIllll[T.lllllIllI[130]] = T."Magic door";
        T.llllIllll[T.lllllIllI[25]] = T."Chest";
        T.llllIllll[T.lllllIllI[131]] = T."Magic door";
        T.llllIllll[T.lllllIllI[132]] = T."Open";
        T.llllIllll[T.lllllIllI[133]] = T."Open";
        T.llllIllll[T.lllllIllI[134]] = T."Open";
        T.llllIllll[T.lllllIllI[135]] = T."Search";
        T.llllIllll[T.lllllIllI[136]] = T."Search";
        T.llllIllll[T.lllllIllI[137]] = T."Break";
        T.llllIllll[T.lllllIllI[140]] = T."Nav to wormbrain";
        T.llllIllll[T.lllllIllI[141]] = T."Can I journey on this ship?";
        T.llllIllll[T.lllllIllI[142]] = T."Search away, I have nothing to hide.";
        T.llllIllll[T.lllllIllI[143]] = T."Ok.";
        T.llllIllll[T.lllllIllI[144]] = T."Talking";
        T.llllIllll[T.lllllIllI[145]] = T."Wormbrain";
        T.llllIllll[T.lllllIllI[146]] = T."Beer glass";
        T.llllIllll[T.lllllIllI[147]] = T."Beer glass";
        T.llllIllll[T.lllllIllI[148]] = T."Drop";
        T.llllIllll[T.lllllIllI[155]] = T."Nav to maze";
        T.llllIllll[T.lllllIllI[156]] = T."Door";
        T.llllIllll[T.lllllIllI[157]] = T."Open";
        T.llllIllll[T.lllllIllI[165]] = T."Getting key";
        T.llllIllll[T.lllllIllI[167]] = T."Attack";
        T.llllIllll[T.lllllIllI[168]] = T."Take";
        T.llllIllll[T.lllllIllI[171]] = T."Nav to red door";
        T.llllIllll[T.lllllIllI[172]] = T."Red door";
        T.llllIllll[T.lllllIllI[173]] = T."Open";
        T.llllIllll[T.lllllIllI[174]] = T."Go up";
        T.llllIllll[T.lllllIllI[175]] = T."Climb-up";
        T.llllIllll[T.lllllIllI[179]] = T."Getting key";
        T.llllIllll[T.lllllIllI[181]] = T."Attack";
        T.llllIllll[T.lllllIllI[182]] = T."Take";
        T.llllIllll[T.lllllIllI[185]] = T."Nav to orange door";
        T.llllIllll[T.lllllIllI[186]] = T."Orange door";
        T.llllIllll[T.lllllIllI[187]] = T."Open";
        T.llllIllll[T.lllllIllI[188]] = T."Climb-up";
        T.llllIllll[T.lllllIllI[190]] = T."Getting key";
        T.llllIllll[T.lllllIllI[192]] = T."Attack";
        T.llllIllll[T.lllllIllI[193]] = T."Take";
        T.llllIllll[T.lllllIllI[195]] = T."Nav to yellow door";
        T.llllIllll[T.lllllIllI[196]] = T."Yellow door";
        T.llllIllll[T.lllllIllI[197]] = T."Open";
        T.llllIllll[T.lllllIllI[198]] = T."Climb-down";
        T.llllIllll[T.lllllIllI[201]] = T."Climb-down";
        T.llllIllll[T.lllllIllI[202]] = T."Climb-down";
        T.llllIllll[T.lllllIllI[208]] = T."Getting blue key";
        T.llllIllll[T.lllllIllI[210]] = T."Attack";
        T.llllIllll[T.lllllIllI[211]] = T."Take";
        T.llllIllll[T.lllllIllI[213]] = T."Nav to blue door";
        T.llllIllll[T.lllllIllI[214]] = T."Blue door";
        T.llllIllll[T.lllllIllI[215]] = T."Open";
        T.llllIllll[T.lllllIllI[217]] = T."Getting key";
        T.llllIllll[T.lllllIllI[219]] = T."Attack";
        T.llllIllll[T.lllllIllI[220]] = T."Take";
        T.llllIllll[T.lllllIllI[223]] = T."Nav to magneta door";
        T.llllIllll[T.lllllIllI[224]] = T."Magenta door";
        T.llllIllll[T.lllllIllI[225]] = T."Open";
        T.llllIllll[T.lllllIllI[226]] = T."Lesser demon";
        T.llllIllll[T.lllllIllI[228]] = T."Attack";
        T.llllIllll[T.lllllIllI[229]] = T."Take";
        T.llllIllll[T.lllllIllI[231]] = T."Nav to green door";
        T.llllIllll[T.lllllIllI[232]] = T."Green door";
        T.llllIllll[T.lllllIllI[233]] = T."Open";
        T.llllIllll[T.lllllIllI[234]] = T."Open";
        T.llllIllll[T.lllllIllI[235]] = T."Open";
        T.llllIllll[T.lllllIllI[236]] = T."Search";
        T.llllIllll[T.lllllIllI[237]] = T."Search";
        T.llllIllll[T.lllllIllI[238]] = T."Plank";
        T.llllIllll[T.lllllIllI[239]] = T."Plank";
        T.llllIllll[T.lllllIllI[240]] = T."Nav to boat";
        T.llllIllll[T.lllllIllI[241]] = T."Customs officer";
        T.llllIllll[T.lllllIllI[242]] = T."Can I journey on this ship?";
        T.llllIllll[T.lllllIllI[243]] = T."Search away, I have nothing to hide.";
        T.llllIllll[T.lllllIllI[244]] = T."Ok.";
        T.llllIllll[T.lllllIllI[245]] = T."Klarense";
        T.llllIllll[T.lllllIllI[246]] = T."Cabin boy Jenkins";
        T.llllIllll[T.lllllIllI[247]] = T."Boarding boat";
        T.llllIllll[T.lllllIllI[248]] = T."Gangplank";
        T.llllIllll[T.lllllIllI[249]] = T."Cross";
        T.llllIllll[T.lllllIllI[250]] = T."Reparing hole";
        T.llllIllll[T.lllllIllI[251]] = T."Hole";
        T.llllIllll[T.lllllIllI[252]] = T."Repair";
        T.llllIllll[T.lllllIllI[253]] = T."Ladder";
        T.llllIllll[T.lllllIllI[254]] = T."Climb-down";
        T.llllIllll[T.lllllIllI[255]] = T."Hiring ned";
        T.llllIllll[T.lllllIllI[256]] = T."Ned";
        T.llllIllll[T.lllllIllI[257]] = T."Draynor Village";
        T.llllIllll[T.lllllIllI[14]] = T."Ned";
        T.llllIllll[T.lllllIllI[72]] = T."Captain Ned";
        T.llllIllll[T.lllllIllI[260]] = T."Nav to boat";
        T.llllIllll[T.lllllIllI[261]] = T."Customs officer";
        T.llllIllll[T.lllllIllI[262]] = T."Can I journey on this ship?";
        T.llllIllll[T.lllllIllI[263]] = T."Search away, I have nothing to hide.";
        T.llllIllll[T.lllllIllI[264]] = T."Ok.";
        T.llllIllll[T.lllllIllI[265]] = T."Gangplank";
        T.llllIllll[T.lllllIllI[266]] = T."Cross";
        T.llllIllll[T.lllllIllI[267]] = T."Captain Ned";
        T.llllIllll[T.lllllIllI[268]] = T."Captain Ned";
        T.llllIllll[T.lllllIllI[272]] = T."Nav to entrance";
        T.llllIllll[T.lllllIllI[273]] = T."Hole";
        T.llllIllll[T.lllllIllI[274]] = T."Enter";
        T.llllIllll[T.lllllIllI[275]] = T."Elvarg";
        T.llllIllll[T.lllllIllI[277]] = T."Nav to fight";
        T.llllIllll[T.lllllIllI[278]] = T."Nav to fight";
        T.llllIllll[T.lllllIllI[279]] = T."Shark";
        T.llllIllll[T.lllllIllI[280]] = T."Shark";
        T.llllIllll[T.lllllIllI[281]] = T."Eat";
        T.llllIllll[T.lllllIllI[282]] = T."Wall";
        T.llllIllll[T.lllllIllI[283]] = T."Climb-over";
        T.llllIllll[T.lllllIllI[284]] = T."Elvarg boss fight";
        T.llllIllll[T.lllllIllI[285]] = T."Vial";
        T.llllIllll[T.lllllIllI[286]] = T."Vial";
        T.llllIllll[T.lllllIllI[287]] = T."Drop";
        T.llllIllll[T.lllllIllI[288]] = T."Shark";
        T.llllIllll[T.lllllIllI[289]] = T."Drop";
        T.llllIllll[T.lllllIllI[290]] = T."Drink";
        T.llllIllll[T.lllllIllI[292]] = T."Drink";
        T.llllIllll[T.lllllIllI[293]] = T."Attack";
        T.llllIllll[T.lllllIllI[295]] = T."Nav to oziach";
        T.llllIllll[T.lllllIllI[296]] = T."Oziach";
        T.llllIllll[T.lllllIllI[297]] = T."Wear";
        T.llllIllll[T.lllllIllI[298]] = T."Crandor map";
        T.llllIllll[T.lllllIllI[299]] = T."Oziach";
        T.llllIllll[T.lllllIllI[300]] = T."Break";
        T.llllIllll[T.lllllIllI[301]] = T."Nav to bank";
        T.llllIllll[T.lllllIllI[302]] = T."Handling banking";
        T.llllIllll[T.lllllIllI[303]] = T."Nav to bank";
        T.llllIllll[T.lllllIllI[304]] = T."Handling banking";
        T.llllIllll[T.lllllIllI[306]] = T."Nav to bank";
        T.llllIllll[T.lllllIllI[307]] = T."Handling banking";
        T.llllIllll[T.lllllIllI[308]] = T."Maze key";
        T.llllIllll[T.lllllIllI[315]] = T."Dragon slayer 1 quest";
        T.llllIllll[T.lllllIllI[316]] = T."ring of wealth (";
        T.llllIllll[T.lllllIllI[317]] = T."Antifire";
        T.llllIllll[T.lllllIllI[318]] = T."Antifire";
        T.llllIllll[T.lllllIllI[319]] = T."combat";
        T.llllIllll[T.lllllIllI[320]] = T."combat";
        T.llllIllll[T.lllllIllI[321]] = T."Antifire";
        T.llllIllll[T.lllllIllI[322]] = T."Antifire";
        T.llllIllll[T.lllllIllI[323]] = T."glory";
        T.llllIllll[T.lllllIllI[324]] = T."Chest";
        T.llllIllll[T.lllllIllI[325]] = T."Zombie";
        T.llllIllll[T.lllllIllI[326]] = T."Ladder";
        T.llllIllll[T.lllllIllI[327]] = T."Climb-down";
        T.llllIllll[T.lllllIllI[328]] = T."Ladder";
        T.llllIllll[T.lllllIllI[329]] = T."Climb-down";
        T.llllIllll[T.lllllIllI[330]] = T."Ladder";
        T.llllIllll[T.lllllIllI[331]] = T."Skeleton";
        T.llllIllll[T.lllllIllI[332]] = T."Ladder";
        T.llllIllll[T.lllllIllI[333]] = T."Ghost";
        T.llllIllll[T.lllllIllI[334]] = T."Ladder";
        T.llllIllll[T.lllllIllI[335]] = T."wealth";
        T.llllIllll[T.lllllIllI[336]] = T."wealth";
        T.llllIllll[T.lllllIllI[337]] = T."wealth";
        T.llllIllll[T.lllllIllI[338]] = T."glory";
        T.llllIllll[T.lllllIllI[339]] = T."glory";
        T.llllIllll[T.lllllIllI[340]] = T."glory";
        T.llllIllll[T.lllllIllI[349]] = T."Can I have a quest?";
        T.llllIllll[T.lllllIllI[350]] = T."Yes.";
        T.llllIllll[T.lllllIllI[351]] = T."Can you sell me a rune platebody?";
        T.llllIllll[T.lllllIllI[352]] = T."The Guildmaster of the Champions' Guild told me.";
        T.llllIllll[T.lllllIllI[353]] = T."I thought you were going to give me a quest.";
        T.llllIllll[T.lllllIllI[354]] = T."A dragon, that sounds like fun.";
        T.llllIllll[T.lllllIllI[355]] = T."I talked to Oziach...";
        T.llllIllll[T.lllllIllI[356]] = T."Where can I find the right ship?";
        T.llllIllll[T.lllllIllI[357]] = T."I seek a piece of the map to the island of Crandor.";
        T.llllIllll[T.lllllIllI[358]] = T."I believe you've got a piece of map that I need.";
        T.llllIllll[T.lllllIllI[359]] = T."I suppose I could pay you for the map piece...";
        T.llllIllll[T.lllllIllI[360]] = T."Alright then, 10,000 it is.";
        T.llllIllll[T.lllllIllI[361]] = T."I'd like to buy her.";
        T.llllIllll[T.lllllIllI[362]] = T."Yep, sounds good.";
        T.llllIllll[T.lllllIllI[363]] = T."You're a sailor? Could you take me to Crandor?";
        T.llllIllll[T.lllllIllI[364]] = T."Yes, let's go!";
    }

    private static boolean llIlIllIIIIl(int n2, int n3) {
        return n2 > n3;
    }

    @Override
    public boolean ae() {
        return lllllIllI[0];
    }

    private static boolean llIlIllIIlII(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean llIlIlIllIll(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean llIlIlIlllII(int n2) {
        return n2 == 0;
    }

    private static String llIlIIllIIII(String lIlIllIllIIlI, String lIlIllIllIIIl) {
        try {
            SecretKeySpec lIlIllIllIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIlIllIllIIIl.getBytes(StandardCharsets.UTF_8)), lllllIllI[16]), "DES");
            Cipher lIlIllIllIlII = Cipher.getInstance("DES");
            lIlIllIllIlII.init(lllllIllI[2], lIlIllIllIlIl);
            return new String(lIlIllIllIlII.doFinal(Base64.getDecoder().decode(lIlIllIllIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIlIllIllIIll) {
            lIlIllIllIIll.printStackTrace();
            return null;
        }
    }

    @Override
    public int af() {
        try {
            T.cW();
            0;
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (3 == (0x16 ^ 0x59 ^ (0x23 ^ 0x68))) {
            return (0x50 ^ 0x32 ^ (0x25 ^ 0x1D)) & (0x10 ^ 0x3F ^ (0x4E ^ 0x3B) ^ -1);
        }
        return lllllIllI[142];
    }

    @Override
    public String ag() {
        return llllIllll[lllllIllI[315]];
    }

    private static boolean llIlIllIIIll(int n2, int n3) {
        return n2 == n3;
    }
}

