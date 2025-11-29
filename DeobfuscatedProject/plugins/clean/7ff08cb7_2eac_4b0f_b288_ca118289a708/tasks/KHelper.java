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
package gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks;

import gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks.HHelper;
import gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks.NHelper;
import gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks.AHelper;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.ab;
import gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks.AQHelper;
import gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks.ASHelper;
import gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks.BHelper;
import gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks.DHelper;
import gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks.EHelper;
import gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks.FHelper;
import gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks.GHelper;
import gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks.JHelper;
import gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks.MHelper;
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

public class KHelper
implements ab {
    public static final  WorldPoint fP;
    public static final  WorldPoint fR;
    public static final  WorldPoint fN;
    static  int fX;
    public static final  WorldPoint fU;
    public static final  WorldPoint fT;
    public static final  WorldPoint fW;
    public static final  WorldPoint fV;

    static  int dk;
    public static  List<d> bx;
    public static  String[] cG;
    public static  boolean bv;
    public static final  WorldPoint fQ;
    static  boolean dl;
    static  WorldArea fY;
    public static final  WorldPoint fO;
    static  WorldArea fZ;
    public static final  WorldPoint fS;

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

                                    }
                                    if (!K.lIlllIlIlIll(Bank.isOpen() ? 1 : 0)) break block84;
                                    AccBuilderGWD.c = llIlllIII[llIlllIlI[6]];
                                    if (K.lIlllIllIIII(Inventory.getAll().size())) {
                                        Bank.depositInventory();
                                        Time.sleepTicks((int)llIlllIlI[7]);

                                    }
                                    if (K.lIlllIllIIII(Equipment.getAll().size())) {
                                        Bank.depositEquipment();
                                        Time.sleepTicks((int)llIlllIlI[4]);

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

                    if (3 >= 3) continue;
                    return;
                }
                if (K.lIlllIlIllIl(Bank.isOpen() ? 1 : 0)) {
                    a.a();
                    Time.sleepTicks((int)llIlllIlI[13]);

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

                            Time.sleepUntil(() -> {
                                boolean bl;
                                int[] nArray = new int[llIlllIlI[0]];
                                nArray[K.llIlllIlI[1]] = llIlllIlI[8];
                                if (K.lIlllIllIIII(Inventory.getCount((int[])nArray))) {
                                    bl = llIlllIlI[0];

                                    if (2 < ((0x52 ^ 0x2F ^ (0xA5 ^ 0x85)) & (0xC ^ 4 ^ (0x1F ^ 0x4A) ^ -1))) {
                                        return ((0xBE ^ 0x87 ^ (0xE3 ^ 0x84)) & (10 + 56 - -86 + 42 ^ 87 + 35 - 46 + 80 ^ -1)) != 0;
                                    }
                                } else {
                                    bl = llIlllIlI[1];
                                }
                                return bl;
                            }, (int)llIlllIlI[5]);

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

                            Time.sleepUntil(() -> {
                                boolean bl;
                                int[] nArray = new int[llIlllIlI[0]];
                                nArray[K.llIlllIlI[1]] = llIlllIlI[11];
                                if (K.lIlllIllIIII(Inventory.getCount((int[])nArray))) {
                                    bl = llIlllIlI[0];

                                    if (1 <= 0) {
                                        return ((0x54 ^ 0x16 ^ (0xE1 ^ 0x83)) & (0xEA ^ 0x9E ^ (0x6D ^ 0x39) ^ -1)) != 0;
                                    }
                                } else {
                                    bl = llIlllIlI[1];
                                }
                                return bl;
                            }, (int)llIlllIlI[5]);

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

            }
            if (K.lIlllIllIIIl(K.lIlllIlIlIlI(e.w(), 50.0))) {
                int[] nArray = new int[llIlllIlI[0]];
                nArray[K.llIlllIlI[1]] = llIlllIlI[19];
                if (K.lIlllIlIlIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    int[] nArray11 = new int[llIlllIlI[0]];
                    nArray11[K.llIlllIlI[1]] = llIlllIlI[19];
                    Inventory.getFirst((int[])nArray11).interact(llIlllIII[llIlllIlI[17]]);
                    Time.sleepTicks((int)llIlllIlI[0]);

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

                    Time.sleepTicks((int)llIlllIlI[0]);

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

                        Time.sleepTicks((int)llIlllIlI[0]);

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

                        Time.sleepTicks((int)llIlllIlI[0]);

                    }
                    if (K.lIlllIllIlIl(Players.getLocal().getWorldLocation().distanceTo(fR), llIlllIlI[13])) {
                        g.a(llIlllIII[llIlllIlI[36]], cG);
                    }
                }
                if (K.lIlllIllIIll(Vars.getBit((int)llIlllIlI[26]), llIlllIlI[0]) && K.lIlllIllIIll(Vars.getBit((int)llIlllIlI[34]), llIlllIlI[0]) && K.lIlllIlIllIl(Vars.getBit((int)llIlllIlI[37]))) {
                    if (K.lIlllIllIlII(Players.getLocal().getWorldLocation().distanceTo(fS), llIlllIlI[13])) {
                        AccBuilderGWD.c = llIlllIII[llIlllIlI[38]];
                        Movement.walkTo((WorldPoint)fS);

                        Time.sleepTicks((int)llIlllIlI[0]);

                    }
                    if (K.lIlllIllIlIl(Players.getLocal().getWorldLocation().distanceTo(fS), llIlllIlI[13])) {
                        g.a(llIlllIII[llIlllIlI[39]], cG);
                    }
                }
                if (K.lIlllIllIIll(Vars.getBit((int)llIlllIlI[26]), llIlllIlI[0]) && K.lIlllIllIIll(Vars.getBit((int)llIlllIlI[34]), llIlllIlI[0]) && K.lIlllIllIIll(Vars.getBit((int)llIlllIlI[37]), llIlllIlI[0])) {
                    if (K.lIlllIllIlII(Players.getLocal().getWorldLocation().distanceTo(fT), llIlllIlI[4])) {
                        AccBuilderGWD.c = llIlllIII[llIlllIlI[40]];
                        Movement.walkTo((WorldPoint)fT);

                        Time.sleepTicks((int)llIlllIlI[0]);

                    }
                    if (K.lIlllIllIlIl(Players.getLocal().getWorldLocation().distanceTo(fT), llIlllIlI[4])) {
                        AccBuilderGWD.c = llIlllIII[llIlllIlI[41]];
                        if (K.lIlllIlIllIl(Dialog.isOpen() ? 1 : 0)) {
                            String[] stringArray = new String[llIlllIlI[0]];
                            stringArray[K.llIlllIlI[1]] = llIlllIII[llIlllIlI[42]];
                            TileObjects.getNearest((String[])stringArray).interact(llIlllIII[llIlllIlI[43]]);
                            Time.sleepTicks((int)llIlllIlI[6]);

                        }
                        int lIIIIlIlIlIlII2 = Vars.getBit((int)llIlllIlI[44]);
                        lIIIIlIlIlIIll = Dialog.getOptions();
                        if (K.lIlllIlIllIl(lIIIIlIlIlIIll.isEmpty() ? 1 : 0)) {
                            System.out.println("Selecting " + lIIIIlIlIlIlII2);
                            if (K.lIlllIlIllIl(lIIIIlIlIlIlII2)) {
                                String[] stringArray = new String[llIlllIlI[0]];
                                stringArray[K.llIlllIlI[1]] = llIlllIII[llIlllIlI[45]];
                                Dialog.chooseOption((String[])stringArray);

                            }
                            if (K.lIlllIllIIll(lIIIIlIlIlIlII2, llIlllIlI[0])) {
                                String[] stringArray = new String[llIlllIlI[0]];
                                stringArray[K.llIlllIlI[1]] = llIlllIII[llIlllIlI[46]];
                                Dialog.chooseOption((String[])stringArray);

                            }
                            if (K.lIlllIllIIll(lIIIIlIlIlIlII2, llIlllIlI[4])) {
                                String[] stringArray = new String[llIlllIlI[0]];
                                stringArray[K.llIlllIlI[1]] = llIlllIII[llIlllIlI[47]];
                                Dialog.chooseOption((String[])stringArray);

                            }
                            if (K.lIlllIllIIll(lIIIIlIlIlIlII2, llIlllIlI[6])) {
                                String[] stringArray = new String[llIlllIlI[0]];
                                stringArray[K.llIlllIlI[1]] = llIlllIII[llIlllIlI[48]];
                                Dialog.chooseOption((String[])stringArray);

                            }
                            Time.sleepTicks((int)llIlllIlI[4]);

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

                        Time.sleepTicks((int)llIlllIlI[0]);

                    }
                    if (K.lIlllIllIlIl(Players.getLocal().getWorldLocation().distanceTo(fU), llIlllIlI[4]) && K.lIlllIlIllIl(lIIIIlIlIlIlII2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        String[] stringArray = new String[llIlllIlI[0]];
                        stringArray[K.llIlllIlI[1]] = llIlllIII[llIlllIlI[56]];
                        TileObjects.getNearest((String[])stringArray).interact(llIlllIII[llIlllIlI[57]]);
                        Time.sleepTicks((int)llIlllIlI[4]);

                    }
                    if (K.lIlllIlIlIll(lIIIIlIlIlIlII2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        if (K.lIlllIllIlII(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llIlllIlI[58], llIlllIlI[59], llIlllIlI[1])), llIlllIlI[4])) {
                            Movement.walkTo((WorldPoint)new WorldPoint(llIlllIlI[58], llIlllIlI[59], llIlllIlI[1]));

                            Time.sleepTicks((int)llIlllIlI[0]);

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

                            }
                        }
                        if (!K.lIlllIlIllIl(lIIIIlIlIlIIll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || !K.lIlllIlIllIl(lIIIIlIlIlIIlI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || !K.lIlllIlIllIl(lIIIIlIlIlIIIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || K.lIlllIlIlIll(lIIIIlIlIlIIII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            String[] stringArray = new String[llIlllIlI[0]];
                            stringArray[K.llIlllIlI[1]] = llIlllIII[llIlllIlI[68]];
                            TileObjects.getNearest((String[])stringArray).interact(llIlllIII[llIlllIlI[69]]);
                            Time.sleepTicks((int)llIlllIlI[16]);

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

                    }
                    String[] stringArray12 = new String[llIlllIlI[0]];
                    stringArray12[K.llIlllIlI[1]] = llIlllIII[llIlllIlI[73]];
                    if (K.lIlllIlIllll(TileObjects.getNearest((String[])stringArray12))) {
                        String[] stringArray13 = new String[llIlllIlI[0]];
                        stringArray13[K.llIlllIlI[1]] = llIlllIII[llIlllIlI[74]];
                        TileObjects.getNearest((String[])stringArray13).interact(llIlllIII[llIlllIlI[24]]);
                        Time.sleepTicks((int)llIlllIlI[4]);

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

                    Time.sleepTicks((int)llIlllIlI[4]);

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

            }
            if (K.lIlllIlIllIl(N.jx.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                Movement.walkTo((WorldPoint)N.jy);

            }
            if (K.lIlllIlIlIll(N.jx.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && K.lIlllIlIllIl(lIIIIlIlIIlIIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && K.lIlllIlIllIl(lIIIIlIlIIlIII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && K.lIlllIlIllIl(fY.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && K.lIlllIlIllIl(fZ.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                Walker.stepAlong(List.of(N.iD));

                Time.sleepTicks((int)llIlllIlI[0]);

            }
            if (!K.lIlllIlIllIl(lIIIIlIlIIlIIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || K.lIlllIlIlIll(lIIIIlIlIIlIII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                String[] stringArray = new String[llIlllIlI[0]];
                stringArray[K.llIlllIlI[1]] = llIlllIII[llIlllIlI[101]];
                TileObjects.getNearest((String[])stringArray).interact(llIlllIII[llIlllIlI[102]]);
                Time.sleepTicks((int)llIlllIlI[7]);

            }
            if ((!K.lIlllIlIllIl(fY.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || K.lIlllIlIlIll(fZ.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) && K.lIlllIllIlII(Players.getLocal().getWorldLocation().distanceTo(fN), llIlllIlI[4])) {
                Movement.walkTo((WorldPoint)fN);

                Time.sleepTicks((int)llIlllIlI[0]);

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

            if ((0x48 ^ 0x45 ^ (0x24 ^ 0x2D)) < 0) {
                return ((0x1E ^ 4 ^ (0x42 ^ 0x44)) & (0x79 ^ 0x19 ^ (7 ^ 0x7B) ^ -1)) != 0;
            }
        } else {
            bl = llIlllIlI[1];
        }
        return bl;
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
        K.llIlllIII[K.llIlllIlI[1]] = "Finished buying items, switching back to quest";
        K.llIlllIII[K.llIlllIlI[0]] = "Drop";
        K.llIlllIII[K.llIlllIlI[4]] = "Nav to bank";
        K.llIlllIII[K.llIlllIlI[6]] = "Handling banking";
        K.llIlllIII[K.llIlllIlI[7]] = "We are missing runes, switching to BUYING";
        K.llIlllIII[K.llIlllIlI[16]] = "We are missing quest supplies, switching to BUYING";
        K.llIlllIII[K.llIlllIlI[13]] = "Drink";
        K.llIlllIII[K.llIlllIlI[17]] = "Eat";
        K.llIlllIII[K.llIlllIlI[20]] = "King Bolren";
        K.llIlllIII[K.llIlllIlI[25]] = "Nav to commander";
        K.llIlllIII[K.llIlllIlI[21]] = "Commander Montai";
        K.llIlllIII[K.llIlllIlI[27]] = "Nav to tracker";
        K.llIlllIII[K.llIlllIlI[28]] = "Door";
        K.llIlllIII[K.llIlllIlI[2]] = "Open";
        K.llIlllIII[K.llIlllIlI[29]] = "Door";
        K.llIlllIII[K.llIlllIlI[30]] = "Open";
        K.llIlllIII[K.llIlllIlI[31]] = "Door";
        K.llIlllIII[K.llIlllIlI[32]] = "Open";
        K.llIlllIII[K.llIlllIlI[33]] = "Tracker gnome 2";
        K.llIlllIII[K.llIlllIlI[35]] = "Nav to tracker";
        K.llIlllIII[K.llIlllIlI[36]] = "Tracker gnome 1";
        K.llIlllIII[K.llIlllIlI[38]] = "Nav to tracker";
        K.llIlllIII[K.llIlllIlI[39]] = "Tracker gnome 3";
        K.llIlllIII[K.llIlllIlI[40]] = "Nav to ballista";
        K.llIlllIII[K.llIlllIlI[41]] = "Firing";
        K.llIlllIII[K.llIlllIlI[42]] = "Ballista";
        K.llIlllIII[K.llIlllIlI[43]] = "Fire";
        K.llIlllIII[K.llIlllIlI[45]] = "0001";
        K.llIlllIII[K.llIlllIlI[46]] = "0002";
        K.llIlllIII[K.llIlllIlI[47]] = "0003";
        K.llIlllIII[K.llIlllIlI[48]] = "0004";
        K.llIlllIII[K.llIlllIlI[55]] = "Nav to crumble";
        K.llIlllIII[K.llIlllIlI[56]] = "Crumbled wall";
        K.llIlllIII[K.llIlllIlI[57]] = "Climb-over";
        K.llIlllIII[K.llIlllIlI[60]] = "Door";
        K.llIlllIII[K.llIlllIlI[61]] = "Open";
        K.llIlllIII[K.llIlllIlI[62]] = "Door";
        K.llIlllIII[K.llIlllIlI[63]] = "Open";
        K.llIlllIII[K.llIlllIlI[64]] = "Door";
        K.llIlllIII[K.llIlllIlI[65]] = "Open";
        K.llIlllIII[K.llIlllIlI[66]] = "Ladder";
        K.llIlllIII[K.llIlllIlI[67]] = "Climb-up";
        K.llIlllIII[K.llIlllIlI[68]] = "Ladder";
        K.llIlllIII[K.llIlllIlI[69]] = "Climb-up";
        K.llIlllIII[K.llIlllIlI[70]] = "Grab orb";
        K.llIlllIII[K.llIlllIlI[3]] = "Closed chest";
        K.llIlllIII[K.llIlllIlI[71]] = "Closed chest";
        K.llIlllIII[K.llIlllIlI[72]] = "Open";
        K.llIlllIII[K.llIlllIlI[73]] = "Open chest";
        K.llIlllIII[K.llIlllIlI[74]] = "Open chest";
        K.llIlllIII[K.llIlllIlI[24]] = "Search";
        K.llIlllIII[K.llIlllIlI[75]] = "King Bolren";
        K.llIlllIII[K.llIlllIlI[76]] = "Travel to final fight";
        K.llIlllIII[K.llIlllIlI[77]] = "Khazard warlord";
        K.llIlllIII[K.llIlllIlI[78]] = "Attack";
        K.llIlllIII[K.llIlllIlI[79]] = "Khazard warlord";
        K.llIlllIII[K.llIlllIlI[80]] = "Attack";
        K.llIlllIII[K.llIlllIlI[81]] = "Handle fight";
        K.llIlllIII[K.llIlllIlI[82]] = "Drink";
        K.llIlllIII[K.llIlllIlI[83]] = "Orbs of protection";
        K.llIlllIII[K.llIlllIlI[84]] = "Taking orbs";
        K.llIlllIII[K.llIlllIlI[85]] = "Orbs of protection";
        K.llIlllIII[K.llIlllIlI[86]] = "Take";
        K.llIlllIII[K.llIlllIlI[87]] = "Orbs of protection";
        K.llIlllIII[K.llIlllIlI[88]] = "King Bolren";
        K.llIlllIII[K.llIlllIlI[89]] = "Nav to start";
        K.llIlllIII[K.llIlllIlI[100]] = "Castle Wars";
        K.llIlllIII[K.llIlllIlI[101]] = "Loose Railing";
        K.llIlllIII[K.llIlllIlI[102]] = "Squeeze-through";
        K.llIlllIII[K.llIlllIlI[109]] = "Tree Gnome Village";
        K.llIlllIII[K.llIlllIlI[110]] = "ring of wealth (";
        K.llIlllIII[K.llIlllIlI[111]] = "trooper";
        K.llIlllIII[K.llIlllIlI[130]] = "Can I help at all?";
        K.llIlllIII[K.llIlllIlI[131]] = "I would be glad to help.";
        K.llIlllIII[K.llIlllIlI[132]] = "Ok, I'll gather some wood.";
        K.llIlllIII[K.llIlllIlI[133]] = "I'll try my best.";
        K.llIlllIII[K.llIlllIlI[134]] = "I will find the warlord and bring back the orbs.";
        K.llIlllIII[K.llIlllIlI[135]] = "Yes.";
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
                                                    lIIIIlIlIIIIIl = new DHelper(llIlllIlI[12], llIlllIlI[13], llIlllIlI[103]);
                                                    bx.add((DHelper) IIIIlIlIIIIIl);

                                                }
                                                if (K.lIlllIlIllIl(Bank.contains((Predicate)(lIIIIlIlIIIIIl = item -> item.getName().toLowerCase().contains(llIlllIII[llIlllIlI[110]]))) ? 1 : 0)) {
                                                    lIIIIlIlIIIIII = new DHelper(llIlllIlI[104], llIlllIlI[16], llIlllIlI[105]);
                                                    bx.add(lIIIIlIlIIIIII);

                                                }
                                                int[] nArray = new int[llIlllIlI[0]];
                                                nArray[K.llIlllIlI[1]] = llIlllIlI[15];
                                                if (K.lIlllIlIlIll(Bank.contains((int[])nArray) ? 1 : 0)) {
                                                    int[] nArray4 = new int[llIlllIlI[0]];
                                                    nArray4[K.llIlllIlI[1]] = llIlllIlI[15];
                                                    if (K.lIlllIlIllII(Bank.getFirst((int[])nArray4).getQuantity(), llIlllIlI[7])) {
                                                        int[] nArray5 = new int[llIlllIlI[0]];
                                                        nArray5[K.llIlllIlI[1]] = llIlllIlI[15];
                                                        lIIIIlIlIIIIII = new DHelper(llIlllIlI[15], llIlllIlI[7] - Bank.getFirst((int[])nArray5).getQuantity(), llIlllIlI[106]);
                                                        bx.add(lIIIIlIlIIIIII);

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
                                            lIIIIlIlIIIIII = new DHelper(llIlllIlI[10], llIlllIlI[9], llIlllIlI[21]);
                                            bx.add(lIIIIlIlIIIIII);

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
                                    lIIIIlIlIIIIII = new DHelper(llIlllIlI[8], llIlllIlI[9], llIlllIlI[21]);
                                    bx.add(lIIIIlIlIIIIII);

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
                            lIIIIlIlIIIIII = new DHelper(llIlllIlI[11], llIlllIlI[9], llIlllIlI[21]);
                            bx.add(lIIIIlIlIIIIII);

                        }
                        int[] nArray = new int[llIlllIlI[0]];
                        nArray[K.llIlllIlI[1]] = llIlllIlI[15];
                        if (K.lIlllIlIllIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                            lIIIIlIlIIIIII = new DHelper(llIlllIlI[15], llIlllIlI[7], llIlllIlI[106]);
                            bx.add(lIIIIlIlIIIIII);

                        }
                        int[] nArray13 = new int[llIlllIlI[0]];
                        nArray13[K.llIlllIlI[1]] = llIlllIlI[18];
                        if (!K.lIlllIlIlIll(Bank.contains((int[])nArray13) ? 1 : 0)) break block30;
                        int[] nArray14 = new int[llIlllIlI[0]];
                        nArray14[K.llIlllIlI[1]] = llIlllIlI[18];
                        if (!K.lIlllIlIllII(Bank.getFirst((int[])nArray14).getQuantity(), llIlllIlI[7])) break block31;
                    }
                    lIIIIlIlIIIIII = new DHelper(llIlllIlI[18], llIlllIlI[7], j.ch);
                    bx.add(lIIIIlIlIIIIII);

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
            lIIIIlIlIIIIII = new DHelper(llIlllIlI[14], llIlllIlI[66], llIlllIlI[107]);
            bx.add(lIIIIlIlIIIIII);

        }
    }
}

