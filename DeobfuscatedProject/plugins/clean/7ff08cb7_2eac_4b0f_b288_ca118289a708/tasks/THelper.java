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
package gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks;

import gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks.AHelper;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.ab;
import gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks.ASHelper;
import gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks.BHelper;
import gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks.DHelper;
import gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks.EHelper;
import gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks.FHelper;
import gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks.GHelper;
import gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks.JHelper;
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

public class THelper
implements ab {
    public static final  WorldPoint lb;
    public static final  WorldPoint lc;
    public static  String[] cG;
    static  boolean lh;
    
    static  boolean dl;
    static  boolean lg;
    public static final  WorldPoint ld;
    public static final  WorldPoint le;
    public static  boolean bv;
    
    public static  List<d> bx;
    static  boolean lf;
    static  boolean li;
    static  int dk;

    @Override
    public boolean ah() {
        int n2;
        if (T.llIlIlIlllll(e.j(lllllIllI[14]), lllllIllI[23]) && T.llIlIlIlllII(Dialog.isOpen() ? 1 : 0)) {
            n2 = lllllIllI[1];

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

            if (3 > -1) continue;
            return false;
        }
        return lllllIllI[1];
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

                                                        Time.sleepTicks((int)lllllIllI[2]);

                                                    }
                                                    if (!T.llIlIllIIIII(lIlIllllIIlll) || !T.llIlIlIllIlI(lIlIllllIIlll.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block212;
                                                    AccBuilderGWD.c = llllIllll[lllllIllI[17]];
                                                    if (T.llIlIlIlllII(Bank.isOpen() ? 1 : 0)) {
                                                        a.a();
                                                        Time.sleepUntil(() -> Bank.isOpen(), (int)lllllIllI[18]);

                                                    }
                                                    if (!T.llIlIlIllIlI(Bank.isOpen() ? 1 : 0)) break block212;
                                                    if (T.llIlIlIllllI(Inventory.getAll().size())) {
                                                        Bank.depositInventory();
                                                        Time.sleepTicks((int)lllllIllI[9]);

                                                    }
                                                    if (T.llIlIlIllllI(Equipment.getAll().size())) {
                                                        Bank.depositEquipment();
                                                        Time.sleepTicks((int)lllllIllI[2]);

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

                                        Time.sleepTicks((int)lllllIllI[1]);

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

                                        Time.sleepTicks((int)lllllIllI[1]);

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

                                    }
                                }
                                Movement.walkTo((WorldPoint)lb);

                                Time.sleepTicks((int)lllllIllI[1]);

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

                            Time.sleepTicks((int)lllllIllI[1]);

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

                            Time.sleepTicks((int)lllllIllI[1]);

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

                                    }
                                    if (T.llIlIlIllIlI(Reachable.isInteractable((Locatable)lIlIllllIIllI) ? 1 : 0) && T.llIlIlIlllII(Dialog.isOpen() ? 1 : 0)) {
                                        String[] stringArray33 = new String[lllllIllI[1]];
                                        stringArray33[T.lllllIllI[0]] = llllIllll[lllllIllI[115]];
                                        if (T.llIlIlIllIlI(lIlIllllIIllI.hasAction(stringArray33) ? 1 : 0)) {
                                            lIlIllllIIllI.interact(llllIllll[lllllIllI[116]]);
                                            Time.sleepTicks((int)lllllIllI[9]);

                                        }
                                        String[] stringArray34 = new String[lllllIllI[1]];
                                        stringArray34[T.lllllIllI[0]] = llllIllll[lllllIllI[117]];
                                        if (T.llIlIlIllIlI(lIlIllllIIllI.hasAction(stringArray34) ? 1 : 0)) {
                                            lIlIllllIIllI.interact(llllIllll[lllllIllI[118]]);
                                            Time.sleepTicks((int)lllllIllI[9]);

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

                        }
                        if (T.llIlIlIllIlI(Reachable.isInteractable((Locatable)lIlIllllIIlll) ? 1 : 0) && T.llIlIlIlllII(Dialog.isOpen() ? 1 : 0)) {
                            String[] stringArray48 = new String[lllllIllI[1]];
                            stringArray48[T.lllllIllI[0]] = llllIllll[lllllIllI[133]];
                            if (T.llIlIlIllIlI(lIlIllllIIlll.hasAction(stringArray48) ? 1 : 0)) {
                                lIlIllllIIlll.interact(llllIllll[lllllIllI[134]]);
                                Time.sleepTicks((int)lllllIllI[9]);

                            }
                            String[] stringArray49 = new String[lllllIllI[1]];
                            stringArray49[T.lllllIllI[0]] = llllIllll[lllllIllI[135]];
                            if (T.llIlIlIllIlI(lIlIllllIIlll.hasAction(stringArray49) ? 1 : 0)) {
                                lIlIllllIIlll.interact(llllIllll[lllllIllI[136]]);
                                Time.sleepTicks((int)lllllIllI[9]);

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

                    }
                    lIlIllllIIllI = new WorldPoint(lllllIllI[138], lllllIllI[139], lllllIllI[0]);
                    if (T.llIlIlIlllII(Players.getLocal().getWorldLocation().equals((Object)lIlIllllIIllI) ? 1 : 0)) {
                        AccBuilderGWD.c = llllIllll[lllllIllI[140]];
                        if (T.llIlIlIlllII(Dialog.isOpen() ? 1 : 0)) {
                            Movement.walkTo((WorldPoint)lIlIllllIIllI);

                            Time.sleepTicks((int)lllllIllI[1]);

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

                            Time.sleepTicks((int)lllllIllI[1]);

                        }
                        if (T.llIlIllIIIlI(Players.getLocal().getWorldLocation().distanceTo(lIlIllllIIlIl), lllllIllI[2])) {
                            String[] stringArray51 = new String[lllllIllI[1]];
                            stringArray51[T.lllllIllI[0]] = llllIllll[lllllIllI[156]];
                            TileObjects.getNearest((String[])stringArray51).interact(llllIllll[lllllIllI[157]]);
                            Time.sleepTicks((int)lllllIllI[11]);

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

                        }
                        int[] nArray19 = new int[lllllIllI[1]];
                        nArray19[T.lllllIllI[0]] = lllllIllI[162];
                        if (T.llIlIlIllIlI(Inventory.contains((int[])nArray19) ? 1 : 0) && T.llIlIlIlllII(lIlIllllIIlIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && T.llIlIlIlllII(lIlIllllIIlII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            lIlIllllIIIll = new WorldPoint(lllllIllI[169], lllllIllI[170], lllllIllI[0]);
                            if (T.llIlIlIlllII(Players.getLocal().getWorldLocation().equals((Object)lIlIllllIIIll) ? 1 : 0)) {
                                AccBuilderGWD.c = llllIllll[lllllIllI[171]];
                                e.c((WorldPoint)lIlIllllIIIll);
                                Time.sleepTicks((int)lllllIllI[2]);

                            }
                            if (T.llIlIlIllIlI(Players.getLocal().getWorldLocation().equals((Object)lIlIllllIIIll) ? 1 : 0)) {
                                String[] stringArray52 = new String[lllllIllI[1]];
                                stringArray52[T.lllllIllI[0]] = llllIllll[lllllIllI[172]];
                                TileObjects.getNearest((String[])stringArray52).interact(llllIllll[lllllIllI[173]]);
                                Time.sleepTicks((int)lllllIllI[12]);

                            }
                        }
                        if (!T.llIlIlIlllII(lIlIllllIIlIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || T.llIlIlIllIlI(lIlIllllIIlII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            lIlIllllIIIll = TileObjects.getNearest(tileObject -> {
                                int n2;
                                if (T.llIlIlIllIlI(tileObject.getName().contains(llllIllll[lllllIllI[334]]) ? 1 : 0) && T.llIlIlIllIlI(Reachable.isInteractable((Locatable)tileObject) ? 1 : 0)) {
                                    n2 = lllllIllI[1];

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

                            }
                            if (T.llIlIlIllIlI(Players.getLocal().getWorldLocation().equals((Object)lIlIllllIIIlI) ? 1 : 0)) {
                                String[] stringArray53 = new String[lllllIllI[1]];
                                stringArray53[T.lllllIllI[0]] = llllIllll[lllllIllI[186]];
                                TileObjects.getNearest((String[])stringArray53).interact(llllIllll[lllllIllI[187]]);
                                Time.sleepTicks((int)lllllIllI[12]);

                            }
                        }
                        if (T.llIlIlIllIlI(lIlIllllIIIll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && T.llIlIllIIIII(lIlIllllIIIlI = TileObjects.getNearest(tileObject -> {
                            int n2;
                            if (T.llIlIlIllIlI(tileObject.getName().contains(llllIllll[lllllIllI[332]]) ? 1 : 0) && T.llIlIlIllIlI(Reachable.isInteractable((Locatable)tileObject) ? 1 : 0)) {
                                n2 = lllllIllI[1];

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

                            }
                            if (T.llIlIlIllIlI(Players.getLocal().getWorldLocation().equals((Object)lIlIllllIIIlI) ? 1 : 0)) {
                                String[] stringArray54 = new String[lllllIllI[1]];
                                stringArray54[T.lllllIllI[0]] = llllIllll[lllllIllI[196]];
                                TileObjects.getNearest((String[])stringArray54).interact(llllIllll[lllllIllI[197]]);
                                Time.sleepTicks((int)lllllIllI[12]);

                            }
                        }
                        if (T.llIlIlIllIlI(lIlIllllIIIll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && T.llIlIllIIIII(lIlIllllIIIlI = TileObjects.getNearest(tileObject -> {
                            int n2;
                            if (T.llIlIlIllIlI(tileObject.getName().contains(llllIllll[lllllIllI[330]]) ? 1 : 0) && T.llIlIlIllIlI(Reachable.isInteractable((Locatable)tileObject) ? 1 : 0)) {
                                n2 = lllllIllI[1];

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

                        }
                    }
                    if ((!T.llIlIlIlllII((lIlIllllIIIll = new WorldArea(lllllIllI[176], lllllIllI[177], lllllIllI[11], lllllIllI[13], lllllIllI[1])).contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || T.llIlIlIllIlI(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(lllllIllI[199], lllllIllI[200], lllllIllI[1])) ? 1 : 0)) && T.llIlIllIIIII(lIlIllllIIIlI = TileObjects.getNearest(tileObject -> {
                        int n2;
                        if (T.llIlIlIllIlI(tileObject.getName().contains(llllIllll[lllllIllI[328]]) ? 1 : 0) && T.llIlIlIllIlI(Reachable.isInteractable((Locatable)tileObject) ? 1 : 0)) {
                            String[] stringArray = new String[lllllIllI[1]];
                            stringArray[T.lllllIllI[0]] = llllIllll[lllllIllI[329]];
                            if (T.llIlIlIllIlI(tileObject.hasAction(stringArray) ? 1 : 0)) {
                                n2 = lllllIllI[1];

                                if (-1 < 0) return n2 != 0;
                                return ((0x93 ^ 0xB8 ^ (0xA ^ 0x6B)) & (0x9C ^ 0x8E ^ (0x52 ^ 0xA) ^ -1)) != 0;
                            }
                        }
                        n2 = lllllIllI[0];
                        return n2 != 0;
                    }))) {
                        lIlIllllIIIlI.interact(llllIllll[lllllIllI[201]]);
                        Time.sleepTicks((int)lllllIllI[7]);

                    }
                    if (T.llIlIlIllIlI((lIlIllllIIIlI = new WorldArea(lllllIllI[163], lllllIllI[164], lllllIllI[26], lllllIllI[12], lllllIllI[0])).contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && T.llIlIllIIIII(lIlIllllIIIIl = TileObjects.getNearest(tileObject -> {
                        int n2;
                        if (T.llIlIlIllIlI(tileObject.getName().contains(llllIllll[lllllIllI[326]]) ? 1 : 0) && T.llIlIlIllIlI(Reachable.isInteractable((Locatable)tileObject) ? 1 : 0)) {
                            String[] stringArray = new String[lllllIllI[1]];
                            stringArray[T.lllllIllI[0]] = llllIllll[lllllIllI[327]];
                            if (T.llIlIlIllIlI(tileObject.hasAction(stringArray) ? 1 : 0)) {
                                n2 = lllllIllI[1];

                                if (((0x3F ^ 0x72 ^ (0x12 ^ 0x53)) & (0xF9 ^ 0xC4 ^ (0xA5 ^ 0x94) ^ -1)) == 0) return n2 != 0;
                                return ((82 + 28 - -61 + 0 ^ 77 + 126 - 195 + 176) & (0x4B ^ 0x2D ^ (0xFA ^ 0x8F) ^ -1)) != 0;
                            }
                        }
                        n2 = lllllIllI[0];
                        return n2 != 0;
                    }))) {
                        lIlIllllIIIIl.interact(llllIllll[lllllIllI[202]]);
                        Time.sleepTicks((int)lllllIllI[7]);

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

                            }
                            if (T.llIlIlIllIlI(Players.getLocal().getWorldLocation().equals((Object)lIlIlllIlllIl) ? 1 : 0)) {
                                String[] stringArray55 = new String[lllllIllI[1]];
                                stringArray55[T.lllllIllI[0]] = llllIllll[lllllIllI[214]];
                                TileObjects.getNearest((String[])stringArray55).interact(llllIllll[lllllIllI[215]]);
                                Time.sleepTicks((int)lllllIllI[12]);

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

                                }
                                if (T.llIlIlIllIlI(Players.getLocal().getWorldLocation().equals((Object)lIlIlllIlllII) ? 1 : 0)) {
                                    String[] stringArray56 = new String[lllllIllI[1]];
                                    stringArray56[T.lllllIllI[0]] = llllIllll[lllllIllI[224]];
                                    TileObjects.getNearest((String[])stringArray56).interact(llllIllll[lllllIllI[225]]);
                                    Time.sleepTicks((int)lllllIllI[12]);

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

                                }
                            }
                            int[] nArray42 = new int[lllllIllI[1]];
                            nArray42[T.lllllIllI[0]] = lllllIllI[227];
                            if (T.llIlIllIIIII(TileItems.getNearest((int[])nArray42))) {
                                int[] nArray43 = new int[lllllIllI[1]];
                                nArray43[T.lllllIllI[0]] = lllllIllI[227];
                                TileItems.getNearest((int[])nArray43).interact(llllIllll[lllllIllI[229]]);
                                Time.sleepTicks((int)lllllIllI[2]);

                            }
                            int[] nArray44 = new int[lllllIllI[1]];
                            nArray44[T.lllllIllI[0]] = lllllIllI[227];
                            if (T.llIlIlIllIlI(Inventory.contains((int[])nArray44) ? 1 : 0)) {
                                lIlIlllIlllII = new WorldPoint(lllllIllI[176], lllllIllI[230], lllllIllI[0]);
                                if (T.llIlIlIlllII(Players.getLocal().getWorldLocation().equals((Object)lIlIlllIlllII) ? 1 : 0)) {
                                    AccBuilderGWD.c = llllIllll[lllllIllI[231]];
                                    e.c(lIlIlllIlllII);
                                    Time.sleepTicks((int)lllllIllI[2]);

                                }
                                if (T.llIlIlIllIlI(Players.getLocal().getWorldLocation().equals((Object)lIlIlllIlllII) ? 1 : 0)) {
                                    String[] stringArray58 = new String[lllllIllI[1]];
                                    stringArray58[T.lllllIllI[0]] = llllIllll[lllllIllI[232]];
                                    TileObjects.getNearest((String[])stringArray58).interact(llllIllll[lllllIllI[233]]);
                                    Time.sleepTicks((int)lllllIllI[12]);

                                }
                            }
                        }
                        if (T.llIlIllIIIII(lIlIlllIlllIl = TileObjects.getNearest(tileObject -> {
                            int n2;
                            if (T.llIlIlIllIlI(tileObject.getName().contains(llllIllll[lllllIllI[324]]) ? 1 : 0) && T.llIlIlIllIlI(Reachable.isInteractable((Locatable)tileObject) ? 1 : 0)) {
                                n2 = lllllIllI[1];

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

                                }
                                String[] stringArray60 = new String[lllllIllI[1]];
                                stringArray60[T.lllllIllI[0]] = llllIllll[lllllIllI[236]];
                                if (T.llIlIlIllIlI(lIlIlllIlllIl.hasAction(stringArray60) ? 1 : 0)) {
                                    lIlIlllIlllIl.interact(llllIllll[lllllIllI[237]]);
                                    Time.sleepTicks((int)lllllIllI[9]);

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

                                Time.sleepTicks((int)lllllIllI[1]);

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

                }
                if (T.llIlIllIIlIl(lIlIllllIIlll) && T.llIlIllIIIll(Players.getLocal().getWorldLocation().getPlane(), lllllIllI[1])) {
                    AccBuilderGWD.c = llllIllll[lllllIllI[250]];
                    String[] stringArray65 = new String[lllllIllI[1]];
                    stringArray65[T.lllllIllI[0]] = llllIllll[lllllIllI[251]];
                    TileObjects.getNearest((String[])stringArray65).interact(llllIllll[lllllIllI[252]]);
                    Time.sleepTicks((int)lllllIllI[7]);

                }
                if (T.llIlIllIIIII(lIlIllllIIlll) && T.llIlIllIIIll(Players.getLocal().getWorldLocation().getPlane(), lllllIllI[1])) {
                    String[] stringArray66 = new String[lllllIllI[1]];
                    stringArray66[T.lllllIllI[0]] = llllIllll[lllllIllI[253]];
                    TileObjects.getNearest((String[])stringArray66).interact(llllIllll[lllllIllI[254]]);
                    Time.sleepTicks((int)lllllIllI[11]);

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

                    Movement.walkTo((WorldPoint)new WorldPoint(lllllIllI[258], lllllIllI[259], lllllIllI[0]));

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

                                Time.sleepTicks((int)lllllIllI[1]);

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

                        Time.sleepTicks((int)lllllIllI[1]);

                    }
                    if (T.llIlIllIIIlI(Players.getLocal().getWorldLocation().distanceTo(lIlIllllIIllI), lllllIllI[7])) {
                        String[] stringArray = new String[lllllIllI[1]];
                        stringArray[T.lllllIllI[0]] = llllIllll[lllllIllI[273]];
                        TileObjects.getNearest((String[])stringArray).interact(llllIllll[lllllIllI[274]]);
                        Time.sleepTicks((int)lllllIllI[9]);

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

                        Time.sleepTicks((int)lllllIllI[1]);

                    }
                    if (T.llIlIllIIIIl(Players.getLocal().getWorldLocation().distanceTo(lIlIllllIIlIl), lllllIllI[7]) && T.llIlIllIIIII(lIlIllllIIllI) && T.llIlIlIlllII(Reachable.isInteractable((Locatable)lIlIllllIIllI) ? 1 : 0)) {
                        AccBuilderGWD.c = llllIllll[lllllIllI[278]];
                        Movement.walkTo((WorldPoint)lIlIllllIIlIl);

                        Time.sleepTicks((int)lllllIllI[1]);

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

                    Time.sleepTicks((int)lllllIllI[1]);

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

            Time.sleepTicks((int)lllllIllI[2]);

        }
        if (T.llIlIllIIIII(lIlIlllIllIlI) && T.llIlIlIllIlI(lIlIlllIllIlI.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderGWD.c = llllIllll[lllllIllI[302]];
            if (T.llIlIlIlllII(Bank.isOpen() ? 1 : 0)) {
                a.a();
                Time.sleepUntil(() -> Bank.isOpen(), (int)lllllIllI[18]);

            }
            if (T.llIlIlIllIlI(Bank.isOpen() ? 1 : 0)) {
                if (T.llIlIlIllllI(Inventory.getAll().size())) {
                    Bank.depositInventory();
                    Time.sleepTicks((int)lllllIllI[9]);

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

    /*
     * WARNING - void declaration
     */
    private static void cZ() {
        void lIlIlllIlIllI;
        BankLocation bankLocation = BankLocation.getNearest();
        if (T.llIlIllIIIII(bankLocation) && T.llIlIlIlllII(bankLocation.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderGWD.c = llllIllll[lllllIllI[306]];
            Movement.walkTo((BankLocation)bankLocation);

            Time.sleepTicks((int)lllllIllI[2]);

        }
        if (T.llIlIllIIIII(lIlIlllIlIllI) && T.llIlIlIllIlI(lIlIlllIlIllI.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderGWD.c = llllIllll[lllllIllI[307]];
            if (T.llIlIlIlllII(Bank.isOpen() ? 1 : 0)) {
                a.a();
                Time.sleepUntil(() -> Bank.isOpen(), (int)lllllIllI[18]);

            }
            if (T.llIlIlIllIlI(Bank.isOpen() ? 1 : 0)) {
                if (T.llIlIlIllllI(Inventory.getAll().size())) {
                    Bank.depositInventory();
                    Time.sleepTicks((int)lllllIllI[9]);

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

            Time.sleepTicks((int)lllllIllI[2]);

        }
        if (T.llIlIllIIIII(lIlIlllIllIII) && T.llIlIlIllIlI(lIlIlllIllIII.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderGWD.c = llllIllll[lllllIllI[304]];
            if (T.llIlIlIlllII(Bank.isOpen() ? 1 : 0)) {
                a.a();
                Time.sleepUntil(() -> Bank.isOpen(), (int)lllllIllI[18]);

            }
            if (T.llIlIlIllIlI(Bank.isOpen() ? 1 : 0)) {
                if (T.llIlIlIllllI(Inventory.getAll().size())) {
                    Bank.depositInventory();
                    Time.sleepTicks((int)lllllIllI[9]);

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
                                                                    lIlIlllIIllll = new DHelper(lllllIllI[27], lllllIllI[7], lllllIllI[309]);
                                                                    bx.add((DHelper) IlIlllIIllll);

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
                                                            lIlIlllIIllll = new DHelper(lllllIllI[35], lllllIllI[63], lllllIllI[309]);
                                                            bx.add((DHelper) IlIlllIIllll);

                                                        }
                                                        int[] nArray = new int[lllllIllI[1]];
                                                        nArray[T.lllllIllI[0]] = lllllIllI[39];
                                                        if (T.llIlIlIlllII(Bank.contains((int[])nArray) ? 1 : 0)) {
                                                            lIlIlllIIllll = new DHelper(lllllIllI[39], lllllIllI[1], lllllIllI[310]);
                                                            bx.add((DHelper) IlIlllIIllll);

                                                        }
                                                        int[] nArray6 = new int[lllllIllI[1]];
                                                        nArray6[T.lllllIllI[0]] = lllllIllI[41];
                                                        if (T.llIlIlIlllII(Bank.contains((int[])nArray6) ? 1 : 0)) {
                                                            lIlIlllIIllll = new DHelper(lllllIllI[41], lllllIllI[1], lllllIllI[311]);
                                                            bx.add((DHelper) IlIlllIIllll);

                                                        }
                                                        int[] nArray7 = new int[lllllIllI[1]];
                                                        nArray7[T.lllllIllI[0]] = lllllIllI[44];
                                                        if (T.llIlIlIlllII(Bank.contains((int[])nArray7) ? 1 : 0)) {
                                                            lIlIlllIIllll = new DHelper(lllllIllI[44], lllllIllI[1], lllllIllI[312]);
                                                            bx.add((DHelper) IlIlllIIllll);

                                                        }
                                                        int[] nArray8 = new int[lllllIllI[1]];
                                                        nArray8[T.lllllIllI[0]] = lllllIllI[42];
                                                        if (T.llIlIlIlllII(Bank.contains((int[])nArray8) ? 1 : 0)) {
                                                            lIlIlllIIllll = new DHelper(lllllIllI[42], lllllIllI[7], lllllIllI[310]);
                                                            bx.add((DHelper) IlIlllIIllll);

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
                                                    lIlIlllIIllll = new DHelper(lllllIllI[24], lllllIllI[25], lllllIllI[309]);
                                                    bx.add((DHelper) IlIlllIIllll);

                                                }
                                                int[] nArray = new int[lllllIllI[1]];
                                                nArray[T.lllllIllI[0]] = lllllIllI[36];
                                                if (T.llIlIlIlllII(Bank.contains((int[])nArray) ? 1 : 0)) {
                                                    lIlIlllIIllll = new DHelper(lllllIllI[36], lllllIllI[1], j.ch);
                                                    bx.add((DHelper) IlIlllIIllll);

                                                }
                                                int[] nArray12 = new int[lllllIllI[1]];
                                                nArray12[T.lllllIllI[0]] = lllllIllI[34];
                                                if (T.llIlIlIlllII(Bank.contains((int[])nArray12) ? 1 : 0)) {
                                                    lIlIlllIIllll = new DHelper(lllllIllI[34], lllllIllI[1], j.ch);
                                                    bx.add((DHelper) IlIlllIIllll);

                                                }
                                                int[] nArray13 = new int[lllllIllI[1]];
                                                nArray13[T.lllllIllI[0]] = lllllIllI[33];
                                                if (T.llIlIlIlllII(Bank.contains((int[])nArray13) ? 1 : 0)) {
                                                    lIlIlllIIllll = new DHelper(lllllIllI[33], lllllIllI[1], j.ch);
                                                    bx.add((DHelper) IlIlllIIllll);

                                                }
                                                int[] nArray14 = new int[lllllIllI[1]];
                                                nArray14[T.lllllIllI[0]] = lllllIllI[32];
                                                if (T.llIlIlIlllII(Bank.contains((int[])nArray14) ? 1 : 0)) {
                                                    lIlIlllIIllll = new DHelper(lllllIllI[32], lllllIllI[1], j.ch);
                                                    bx.add((DHelper) IlIlllIIllll);

                                                }
                                                int[] nArray15 = new int[lllllIllI[1]];
                                                nArray15[T.lllllIllI[0]] = lllllIllI[30];
                                                if (T.llIlIlIlllII(Bank.contains((int[])nArray15) ? 1 : 0)) {
                                                    lIlIlllIIllll = new DHelper(lllllIllI[30], lllllIllI[1], j.ch);
                                                    bx.add((DHelper) IlIlllIIllll);

                                                }
                                                int[] nArray16 = new int[lllllIllI[1]];
                                                nArray16[T.lllllIllI[0]] = lllllIllI[31];
                                                if (T.llIlIlIlllII(Bank.contains((int[])nArray16) ? 1 : 0)) {
                                                    lIlIlllIIllll = new DHelper(lllllIllI[31], lllllIllI[1], j.ch);
                                                    bx.add((DHelper) IlIlllIIllll);

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
                                            lIlIlllIIllll = new DHelper(lllllIllI[37], lllllIllI[23], j.ch);
                                            bx.add((DHelper) IlIlllIIllll);

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
                                    lIlIlllIIllll = new DHelper(lllllIllI[45], lllllIllI[23], lllllIllI[47]);
                                    bx.add((DHelper) IlIlllIIllll);

                                }
                                if (T.llIlIlIlllII(Bank.contains((Predicate)(lIlIlllIIllll = item -> item.getName().toLowerCase().contains(llllIllll[lllllIllI[316]]))) ? 1 : 0)) {
                                    lIlIlllIIlllI = new DHelper(lllllIllI[313], lllllIllI[11], lllllIllI[311]);
                                    bx.add(lIlIlllIIlllI);

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
                            lIlIlllIIlllI = new DHelper(lllllIllI[19], lllllIllI[10], lllllIllI[314]);
                            bx.add(lIlIlllIIlllI);

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
                    lIlIlllIIlllI = new DHelper(lllllIllI[22], lllllIllI[10], lllllIllI[314]);
                    bx.add(lIlIlllIIlllI);

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
            lIlIlllIIlllI = new DHelper(lllllIllI[21], lllllIllI[10], lllllIllI[314]);
            bx.add(lIlIlllIIlllI);

        }
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
        T.llllIllll[T.lllllIllI[0]] = "Buying items";
        T.llllIllll[T.lllllIllI[1]] = "Finished buying items, switching back to quest";
        T.llllIllll[T.lllllIllI[2]] = "Crandor map";
        T.llllIllll[T.lllllIllI[7]] = "Drink";
        T.llllIllll[T.lllllIllI[9]] = "Drink";
        T.llllIllll[T.lllllIllI[11]] = "Shark";
        T.llllIllll[T.lllllIllI[12]] = "Shark";
        T.llllIllll[T.lllllIllI[13]] = "Eat";
        T.llllIllll[T.lllllIllI[16]] = "Nav to bank";
        T.llllIllll[T.lllllIllI[17]] = "Handling banking";
        T.llllIllll[T.lllllIllI[23]] = "We are missing teleports, switching to BUYING";
        T.llllIllll[T.lllllIllI[26]] = "We are missing steel nails, switching to BUYING";
        T.llllIllll[T.lllllIllI[28]] = "We are missing planks, switching to BUYING";
        T.llllIllll[T.lllllIllI[38]] = "We are missing quest supplies, switching to BUYING";
        T.llllIllll[T.lllllIllI[40]] = "Nav to champ guild";
        T.llllIllll[T.lllllIllI[20]] = "Talking";
        T.llllIllll[T.lllllIllI[43]] = "Guildmaster";
        T.llllIllll[T.lllllIllI[29]] = "Nav to oziach";
        T.llllIllll[T.lllllIllI[50]] = "Oziach";
        T.llllIllll[T.lllllIllI[51]] = "Rune scimitar";
        T.llllIllll[T.lllllIllI[10]] = "Wield";
        T.llllIllll[T.lllllIllI[52]] = "Wear";
        T.llllIllll[T.lllllIllI[53]] = "Wear";
        T.llllIllll[T.lllllIllI[55]] = "Maze key";
        T.llllIllll[T.lllllIllI[8]] = "Nav to champ guild";
        T.llllIllll[T.lllllIllI[56]] = "Eat";
        T.llllIllll[T.lllllIllI[57]] = "Talking";
        T.llllIllll[T.lllllIllI[58]] = "Guildmaster";
        T.llllIllll[T.lllllIllI[60]] = "Where can I find the right ship?";
        T.llllIllll[T.lllllIllI[61]] = "I talked to Oziach...";
        T.llllIllll[T.lllllIllI[63]] = "How can I protect myself from the dragon's breath?";
        T.llllIllll[T.lllllIllI[65]] = "Maze key";
        T.llllIllll[T.lllllIllI[15]] = "How can I find the route to Crandor?";
        T.llllIllll[T.lllllIllI[66]] = "Where is Melzar's map piece?";
        T.llllIllll[T.lllllIllI[68]] = "How can I find the route to Crandor?";
        T.llllIllll[T.lllllIllI[69]] = "Where is Thalzar's map piece?";
        T.llllIllll[T.lllllIllI[70]] = "How can I find the route to Crandor?";
        T.llllIllll[T.lllllIllI[71]] = "Where is Lozar's map piece?";
        T.llllIllll[T.lllllIllI[74]] = "Maze key";
        T.llllIllll[T.lllllIllI[77]] = "Oracle";
        T.llllIllll[T.lllllIllI[78]] = "Nav to oracle";
        T.llllIllll[T.lllllIllI[79]] = "Oracle";
        T.llllIllll[T.lllllIllI[80]] = "Oracle";
        T.llllIllll[T.lllllIllI[82]] = "Lobster pot";
        T.llllIllll[T.lllllIllI[84]] = "Lobster pot";
        T.llllIllll[T.lllllIllI[87]] = "Nav to magic door";
        T.llllIllll[T.lllllIllI[88]] = "Handling magic door";
        T.llllIllll[T.lllllIllI[89]] = "Silk";
        T.llllIllll[T.lllllIllI[90]] = "Silk";
        T.llllIllll[T.lllllIllI[91]] = "Magic door";
        T.llllIllll[T.lllllIllI[6]] = "Lobster pot";
        T.llllIllll[T.lllllIllI[92]] = "Lobster pot";
        T.llllIllll[T.lllllIllI[93]] = "Magic door";
        T.llllIllll[T.lllllIllI[94]] = "Unfired bowl";
        T.llllIllll[T.lllllIllI[95]] = "Unfired bowl";
        T.llllIllll[T.lllllIllI[96]] = "Magic door";
        T.llllIllll[T.lllllIllI[97]] = "Wizard's mind bomb";
        T.llllIllll[T.lllllIllI[98]] = "Wizard's mind bomb";
        T.llllIllll[T.lllllIllI[99]] = "Magic door";
        T.llllIllll[T.lllllIllI[100]] = "Silk";
        T.llllIllll[T.lllllIllI[101]] = "Silk";
        T.llllIllll[T.lllllIllI[102]] = "Magic door";
        T.llllIllll[T.lllllIllI[103]] = "Lobster pot";
        T.llllIllll[T.lllllIllI[104]] = "Lobster pot";
        T.llllIllll[T.lllllIllI[105]] = "Magic door";
        T.llllIllll[T.lllllIllI[106]] = "Unfired bowl";
        T.llllIllll[T.lllllIllI[107]] = "Unfired bowl";
        T.llllIllll[T.lllllIllI[108]] = "Magic door";
        T.llllIllll[T.lllllIllI[109]] = "Wizard's mind bomb";
        T.llllIllll[T.lllllIllI[110]] = "Wizard's mind bomb";
        T.llllIllll[T.lllllIllI[111]] = "Magic door";
        T.llllIllll[T.lllllIllI[112]] = "Chest";
        T.llllIllll[T.lllllIllI[113]] = "Magic door";
        T.llllIllll[T.lllllIllI[114]] = "Open";
        T.llllIllll[T.lllllIllI[115]] = "Open";
        T.llllIllll[T.lllllIllI[116]] = "Open";
        T.llllIllll[T.lllllIllI[117]] = "Search";
        T.llllIllll[T.lllllIllI[118]] = "Search";
        T.llllIllll[T.lllllIllI[119]] = "Silk";
        T.llllIllll[T.lllllIllI[120]] = "Silk";
        T.llllIllll[T.lllllIllI[121]] = "Magic door";
        T.llllIllll[T.lllllIllI[122]] = "Lobster pot";
        T.llllIllll[T.lllllIllI[123]] = "Lobster pot";
        T.llllIllll[T.lllllIllI[124]] = "Magic door";
        T.llllIllll[T.lllllIllI[125]] = "Unfired bowl";
        T.llllIllll[T.lllllIllI[126]] = "Unfired bowl";
        T.llllIllll[T.lllllIllI[127]] = "Magic door";
        T.llllIllll[T.lllllIllI[128]] = "Wizard's mind bomb";
        T.llllIllll[T.lllllIllI[129]] = "Wizard's mind bomb";
        T.llllIllll[T.lllllIllI[130]] = "Magic door";
        T.llllIllll[T.lllllIllI[25]] = "Chest";
        T.llllIllll[T.lllllIllI[131]] = "Magic door";
        T.llllIllll[T.lllllIllI[132]] = "Open";
        T.llllIllll[T.lllllIllI[133]] = "Open";
        T.llllIllll[T.lllllIllI[134]] = "Open";
        T.llllIllll[T.lllllIllI[135]] = "Search";
        T.llllIllll[T.lllllIllI[136]] = "Search";
        T.llllIllll[T.lllllIllI[137]] = "Break";
        T.llllIllll[T.lllllIllI[140]] = "Nav to wormbrain";
        T.llllIllll[T.lllllIllI[141]] = "Can I journey on this ship?";
        T.llllIllll[T.lllllIllI[142]] = "Search away, I have nothing to hide.";
        T.llllIllll[T.lllllIllI[143]] = "Ok.";
        T.llllIllll[T.lllllIllI[144]] = "Talking";
        T.llllIllll[T.lllllIllI[145]] = "Wormbrain";
        T.llllIllll[T.lllllIllI[146]] = "Beer glass";
        T.llllIllll[T.lllllIllI[147]] = "Beer glass";
        T.llllIllll[T.lllllIllI[148]] = "Drop";
        T.llllIllll[T.lllllIllI[155]] = "Nav to maze";
        T.llllIllll[T.lllllIllI[156]] = "Door";
        T.llllIllll[T.lllllIllI[157]] = "Open";
        T.llllIllll[T.lllllIllI[165]] = "Getting key";
        T.llllIllll[T.lllllIllI[167]] = "Attack";
        T.llllIllll[T.lllllIllI[168]] = "Take";
        T.llllIllll[T.lllllIllI[171]] = "Nav to red door";
        T.llllIllll[T.lllllIllI[172]] = "Red door";
        T.llllIllll[T.lllllIllI[173]] = "Open";
        T.llllIllll[T.lllllIllI[174]] = "Go up";
        T.llllIllll[T.lllllIllI[175]] = "Climb-up";
        T.llllIllll[T.lllllIllI[179]] = "Getting key";
        T.llllIllll[T.lllllIllI[181]] = "Attack";
        T.llllIllll[T.lllllIllI[182]] = "Take";
        T.llllIllll[T.lllllIllI[185]] = "Nav to orange door";
        T.llllIllll[T.lllllIllI[186]] = "Orange door";
        T.llllIllll[T.lllllIllI[187]] = "Open";
        T.llllIllll[T.lllllIllI[188]] = "Climb-up";
        T.llllIllll[T.lllllIllI[190]] = "Getting key";
        T.llllIllll[T.lllllIllI[192]] = "Attack";
        T.llllIllll[T.lllllIllI[193]] = "Take";
        T.llllIllll[T.lllllIllI[195]] = "Nav to yellow door";
        T.llllIllll[T.lllllIllI[196]] = "Yellow door";
        T.llllIllll[T.lllllIllI[197]] = "Open";
        T.llllIllll[T.lllllIllI[198]] = "Climb-down";
        T.llllIllll[T.lllllIllI[201]] = "Climb-down";
        T.llllIllll[T.lllllIllI[202]] = "Climb-down";
        T.llllIllll[T.lllllIllI[208]] = "Getting blue key";
        T.llllIllll[T.lllllIllI[210]] = "Attack";
        T.llllIllll[T.lllllIllI[211]] = "Take";
        T.llllIllll[T.lllllIllI[213]] = "Nav to blue door";
        T.llllIllll[T.lllllIllI[214]] = "Blue door";
        T.llllIllll[T.lllllIllI[215]] = "Open";
        T.llllIllll[T.lllllIllI[217]] = "Getting key";
        T.llllIllll[T.lllllIllI[219]] = "Attack";
        T.llllIllll[T.lllllIllI[220]] = "Take";
        T.llllIllll[T.lllllIllI[223]] = "Nav to magneta door";
        T.llllIllll[T.lllllIllI[224]] = "Magenta door";
        T.llllIllll[T.lllllIllI[225]] = "Open";
        T.llllIllll[T.lllllIllI[226]] = "Lesser demon";
        T.llllIllll[T.lllllIllI[228]] = "Attack";
        T.llllIllll[T.lllllIllI[229]] = "Take";
        T.llllIllll[T.lllllIllI[231]] = "Nav to green door";
        T.llllIllll[T.lllllIllI[232]] = "Green door";
        T.llllIllll[T.lllllIllI[233]] = "Open";
        T.llllIllll[T.lllllIllI[234]] = "Open";
        T.llllIllll[T.lllllIllI[235]] = "Open";
        T.llllIllll[T.lllllIllI[236]] = "Search";
        T.llllIllll[T.lllllIllI[237]] = "Search";
        T.llllIllll[T.lllllIllI[238]] = "Plank";
        T.llllIllll[T.lllllIllI[239]] = "Plank";
        T.llllIllll[T.lllllIllI[240]] = "Nav to boat";
        T.llllIllll[T.lllllIllI[241]] = "Customs officer";
        T.llllIllll[T.lllllIllI[242]] = "Can I journey on this ship?";
        T.llllIllll[T.lllllIllI[243]] = "Search away, I have nothing to hide.";
        T.llllIllll[T.lllllIllI[244]] = "Ok.";
        T.llllIllll[T.lllllIllI[245]] = "Klarense";
        T.llllIllll[T.lllllIllI[246]] = "Cabin boy Jenkins";
        T.llllIllll[T.lllllIllI[247]] = "Boarding boat";
        T.llllIllll[T.lllllIllI[248]] = "Gangplank";
        T.llllIllll[T.lllllIllI[249]] = "Cross";
        T.llllIllll[T.lllllIllI[250]] = "Reparing hole";
        T.llllIllll[T.lllllIllI[251]] = "Hole";
        T.llllIllll[T.lllllIllI[252]] = "Repair";
        T.llllIllll[T.lllllIllI[253]] = "Ladder";
        T.llllIllll[T.lllllIllI[254]] = "Climb-down";
        T.llllIllll[T.lllllIllI[255]] = "Hiring ned";
        T.llllIllll[T.lllllIllI[256]] = "Ned";
        T.llllIllll[T.lllllIllI[257]] = "Draynor Village";
        T.llllIllll[T.lllllIllI[14]] = "Ned";
        T.llllIllll[T.lllllIllI[72]] = "Captain Ned";
        T.llllIllll[T.lllllIllI[260]] = "Nav to boat";
        T.llllIllll[T.lllllIllI[261]] = "Customs officer";
        T.llllIllll[T.lllllIllI[262]] = "Can I journey on this ship?";
        T.llllIllll[T.lllllIllI[263]] = "Search away, I have nothing to hide.";
        T.llllIllll[T.lllllIllI[264]] = "Ok.";
        T.llllIllll[T.lllllIllI[265]] = "Gangplank";
        T.llllIllll[T.lllllIllI[266]] = "Cross";
        T.llllIllll[T.lllllIllI[267]] = "Captain Ned";
        T.llllIllll[T.lllllIllI[268]] = "Captain Ned";
        T.llllIllll[T.lllllIllI[272]] = "Nav to entrance";
        T.llllIllll[T.lllllIllI[273]] = "Hole";
        T.llllIllll[T.lllllIllI[274]] = "Enter";
        T.llllIllll[T.lllllIllI[275]] = "Elvarg";
        T.llllIllll[T.lllllIllI[277]] = "Nav to fight";
        T.llllIllll[T.lllllIllI[278]] = "Nav to fight";
        T.llllIllll[T.lllllIllI[279]] = "Shark";
        T.llllIllll[T.lllllIllI[280]] = "Shark";
        T.llllIllll[T.lllllIllI[281]] = "Eat";
        T.llllIllll[T.lllllIllI[282]] = "Wall";
        T.llllIllll[T.lllllIllI[283]] = "Climb-over";
        T.llllIllll[T.lllllIllI[284]] = "Elvarg boss fight";
        T.llllIllll[T.lllllIllI[285]] = "Vial";
        T.llllIllll[T.lllllIllI[286]] = "Vial";
        T.llllIllll[T.lllllIllI[287]] = "Drop";
        T.llllIllll[T.lllllIllI[288]] = "Shark";
        T.llllIllll[T.lllllIllI[289]] = "Drop";
        T.llllIllll[T.lllllIllI[290]] = "Drink";
        T.llllIllll[T.lllllIllI[292]] = "Drink";
        T.llllIllll[T.lllllIllI[293]] = "Attack";
        T.llllIllll[T.lllllIllI[295]] = "Nav to oziach";
        T.llllIllll[T.lllllIllI[296]] = "Oziach";
        T.llllIllll[T.lllllIllI[297]] = "Wear";
        T.llllIllll[T.lllllIllI[298]] = "Crandor map";
        T.llllIllll[T.lllllIllI[299]] = "Oziach";
        T.llllIllll[T.lllllIllI[300]] = "Break";
        T.llllIllll[T.lllllIllI[301]] = "Nav to bank";
        T.llllIllll[T.lllllIllI[302]] = "Handling banking";
        T.llllIllll[T.lllllIllI[303]] = "Nav to bank";
        T.llllIllll[T.lllllIllI[304]] = "Handling banking";
        T.llllIllll[T.lllllIllI[306]] = "Nav to bank";
        T.llllIllll[T.lllllIllI[307]] = "Handling banking";
        T.llllIllll[T.lllllIllI[308]] = "Maze key";
        T.llllIllll[T.lllllIllI[315]] = "Dragon slayer 1 quest";
        T.llllIllll[T.lllllIllI[316]] = "ring of wealth (";
        T.llllIllll[T.lllllIllI[317]] = "Antifire";
        T.llllIllll[T.lllllIllI[318]] = "Antifire";
        T.llllIllll[T.lllllIllI[319]] = "combat";
        T.llllIllll[T.lllllIllI[320]] = "combat";
        T.llllIllll[T.lllllIllI[321]] = "Antifire";
        T.llllIllll[T.lllllIllI[322]] = "Antifire";
        T.llllIllll[T.lllllIllI[323]] = "glory";
        T.llllIllll[T.lllllIllI[324]] = "Chest";
        T.llllIllll[T.lllllIllI[325]] = "Zombie";
        T.llllIllll[T.lllllIllI[326]] = "Ladder";
        T.llllIllll[T.lllllIllI[327]] = "Climb-down";
        T.llllIllll[T.lllllIllI[328]] = "Ladder";
        T.llllIllll[T.lllllIllI[329]] = "Climb-down";
        T.llllIllll[T.lllllIllI[330]] = "Ladder";
        T.llllIllll[T.lllllIllI[331]] = "hFz<}/xF";
        T.llllIllll[T.lllllIllI[332]] = "Ladder";
        T.llllIllll[T.lllllIllI[333]] = "Ghost";
        T.llllIllll[T.lllllIllI[334]] = "Ladder";
        T.llllIllll[T.lllllIllI[335]] = "wealth";
        T.llllIllll[T.lllllIllI[336]] = "wealth";
        T.llllIllll[T.lllllIllI[337]] = "wealth";
        T.llllIllll[T.lllllIllI[338]] = "glory";
        T.llllIllll[T.lllllIllI[339]] = "glory";
        T.llllIllll[T.lllllIllI[340]] = "glory";
        T.llllIllll[T.lllllIllI[349]] = "Can I have a quest?";
        T.llllIllll[T.lllllIllI[350]] = "Yes.";
        T.llllIllll[T.lllllIllI[351]] = "Can you sell me a rune platebody?";
        T.llllIllll[T.lllllIllI[352]] = "The Guildmaster of the Champions' Guild told me.";
        T.llllIllll[T.lllllIllI[353]] = "I thought you were going to give me a quest.";
        T.llllIllll[T.lllllIllI[354]] = "A dragon, that sounds like fun.";
        T.llllIllll[T.lllllIllI[355]] = "I talked to Oziach...";
        T.llllIllll[T.lllllIllI[356]] = "Where can I find the right ship?";
        T.llllIllll[T.lllllIllI[357]] = "I seek a piece of the map to the island of Crandor.";
        T.llllIllll[T.lllllIllI[358]] = "I believe you've got a piece of map that I need.";
        T.llllIllll[T.lllllIllI[359]] = "I suppose I could pay you for the map piece...";
        T.llllIllll[T.lllllIllI[360]] = "Alright then, 10,000 it is.";
        T.llllIllll[T.lllllIllI[361]] = "I'd like to buy her.";
        T.llllIllll[T.lllllIllI[362]] = "Yep, sounds good.";
        T.llllIllll[T.lllllIllI[363]] = "You're a sailor? Could you take me to Crandor?";
        T.llllIllll[T.lllllIllI[364]] = "Yes, let's go!";
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

    @Override
    public int af() {
        try {
            T.cW();

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

