/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Skill
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 *  net.unethicalite.api.widgets.Dialog
 *  net.unethicalite.client.Static
 */
package h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n;

import gg.squire.account.AccBuilderShamans;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.K;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.a;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.b;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.d;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.e;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.f;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.g;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.j;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.r;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Skill;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.client.Static;

public class O
implements K {
    static /* synthetic */ WorldPoint ki;
    static /* synthetic */ WorldPoint jZ;
    static /* synthetic */ WorldPoint kd;
    static /* synthetic */ WorldPoint jW;
    static /* synthetic */ WorldPoint ko;
    static /* synthetic */ WorldPoint kp;
    static /* synthetic */ WorldPoint jF;
    public static /* synthetic */ boolean bn;
    static /* synthetic */ String kr;
    static /* synthetic */ WorldPoint jG;
    static /* synthetic */ WorldPoint ke;
    public static /* synthetic */ int js;
    static /* synthetic */ WorldPoint jX;
    static /* synthetic */ WorldPoint jR;
    static /* synthetic */ WorldPoint jJ;
    static /* synthetic */ WorldPoint kl;
    static /* synthetic */ WorldPoint kc;
    static /* synthetic */ boolean jz;
    static /* synthetic */ String h;
    static /* synthetic */ WorldPoint kf;
    static /* synthetic */ WorldPoint kb;
    static /* synthetic */ WorldPoint jT;
    static /* synthetic */ WorldPoint km;
    static /* synthetic */ WorldPoint kq;
    static /* synthetic */ WorldPoint jM;
    static /* synthetic */ WorldPoint kk;
    public static /* synthetic */ List<d> bp;
    public static /* synthetic */ int jt;
    static /* synthetic */ WorldPoint kh;
    static /* synthetic */ WorldPoint jD;
    static /* synthetic */ WorldPoint jP;
    private static /* synthetic */ int[] lIllIIIIIl;
    static /* synthetic */ WorldPoint kg;
    static /* synthetic */ WorldPoint jY;
    static /* synthetic */ WorldPoint kj;
    static /* synthetic */ WorldPoint jV;
    static /* synthetic */ WorldPoint jE;
    public static /* synthetic */ int jy;
    static /* synthetic */ ArrayList<WorldPoint> jA;
    public static /* synthetic */ int jr;
    public static /* synthetic */ boolean cD;
    static /* synthetic */ WorldPoint jK;
    static /* synthetic */ WorldPoint jS;
    static /* synthetic */ WorldPoint jI;
    static /* synthetic */ WorldPoint jQ;
    static /* synthetic */ WorldPoint jN;
    static /* synthetic */ WorldPoint jL;
    static /* synthetic */ WorldPoint ka;
    static /* synthetic */ WorldPoint jH;
    static /* synthetic */ WorldPoint jO;
    static /* synthetic */ WorldPoint jU;
    static /* synthetic */ ArrayList<WorldPoint> jB;
    static /* synthetic */ WorldPoint kn;
    private static /* synthetic */ String[] lIlIllllII;
    static /* synthetic */ WorldPoint jC;

    private static boolean lIIlIllIIIllI(int n2, int n3) {
        return n2 > n3;
    }

    public static void cV() {
        if (O.lIIlIllIIIIII(bn ? 1 : 0)) {
            AccBuilderShamans.c = lIlIllllII[lIllIIIIIl[0]];
            b.a(bp);
            if (O.lIIlIllIIIIIl(bp.size(), lIllIIIIIl[1])) {
                System.out.println(lIlIllllII[lIllIIIIIl[1]]);
                bn = lIllIIIIIl[0];
            }
        }
        if (O.lIIlIllIIIIlI(bn ? 1 : 0) && O.lIIlIllIIIIIl(Skills.getLevel((Skill)Skill.FARMING), lIllIIIIIl[2])) {
            if (O.lIIlIllIIIIIl(Skills.getLevel((Skill)Skill.FARMING), lIllIIIIIl[3])) {
                kr = lIlIllllII[lIllIIIIIl[4]];
                r.aU();
            }
            if (O.lIIlIllIIIIlI(O.al() ? 1 : 0) && O.lIIlIllIIIIll(Skills.getLevel((Skill)Skill.FARMING), lIllIIIIIl[3])) {
                kr = lIlIllllII[lIllIIIIIl[5]];
                BankLocation lllllllllllllllllllIIlIllIIlIIll = BankLocation.getNearest();
                if (O.lIIlIllIIIlII(lllllllllllllllllllIIlIllIIlIIll) && O.lIIlIllIIIIlI(lllllllllllllllllllIIlIllIIlIIll.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderShamans.c = lIlIllllII[lIllIIIIIl[6]];
                    if (O.lIIlIllIIIIII(Static.getClient().isInInstancedRegion() ? 1 : 0)) {
                        Time.sleepTicks((int)lIllIIIIIl[6]);
                        0;
                        if (O.lIIlIllIIIIII(O.al() ? 1 : 0)) {
                            return;
                        }
                    }
                    a.a(lllllllllllllllllllIIlIllIIlIIll);
                }
                if (O.lIIlIllIIIlII(lllllllllllllllllllIIlIllIIlIIll) && O.lIIlIllIIIIII(lllllllllllllllllllIIlIllIIlIIll.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderShamans.c = lIlIllllII[lIllIIIIIl[7]];
                    if (O.lIIlIllIIIIlI(Bank.isOpen() ? 1 : 0)) {
                        a.a();
                        Time.sleepUntil(() -> Bank.isOpen(), (int)lIllIIIIIl[8]);
                        0;
                    }
                    if (O.lIIlIllIIIIII(Bank.isOpen() ? 1 : 0)) {
                        if (O.lIIlIllIIIlIl(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks((int)lIllIIIIIl[1]);
                            0;
                        }
                        if (O.lIIlIllIIIlIl(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks((int)lIllIIIIIl[4]);
                            0;
                        }
                    }
                    int[] nArray = new int[lIllIIIIIl[1]];
                    nArray[O.lIllIIIIIl[0]] = lIllIIIIIl[9];
                    if (O.lIIlIllIIIIII(Bank.contains((int[])nArray) ? 1 : 0)) {
                        int[] nArray2 = new int[lIllIIIIIl[1]];
                        nArray2[O.lIllIIIIIl[0]] = lIllIIIIIl[9];
                        if (O.lIIlIllIIIIIl(Bank.getFirst((int[])nArray2).getQuantity(), lIllIIIIIl[10])) {
                            O.O();
                            System.out.println(lIlIllllII[lIllIIIIIl[11]]);
                            bn = lIllIIIIIl[1];
                            return;
                        }
                    }
                    int[] nArray3 = new int[lIllIIIIIl[12]];
                    nArray3[O.lIllIIIIIl[0]] = lIllIIIIIl[13];
                    nArray3[O.lIllIIIIIl[1]] = lIllIIIIIl[14];
                    nArray3[O.lIllIIIIIl[4]] = lIllIIIIIl[15];
                    nArray3[O.lIllIIIIIl[5]] = lIllIIIIIl[16];
                    nArray3[O.lIllIIIIIl[6]] = lIllIIIIIl[17];
                    nArray3[O.lIllIIIIIl[7]] = lIllIIIIIl[18];
                    nArray3[O.lIllIIIIIl[11]] = lIllIIIIIl[19];
                    nArray3[O.lIllIIIIIl[20]] = lIllIIIIIl[21];
                    nArray3[O.lIllIIIIIl[22]] = lIllIIIIIl[9];
                    nArray3[O.lIllIIIIIl[23]] = lIllIIIIIl[24];
                    if (O.lIIlIllIIIIlI(e.b(nArray3) ? 1 : 0)) {
                        O.O();
                        System.out.println(lIlIllllII[lIllIIIIIl[20]]);
                        bn = lIllIIIIIl[1];
                        return;
                    }
                    int[] nArray4 = new int[lIllIIIIIl[12]];
                    nArray4[O.lIllIIIIIl[0]] = lIllIIIIIl[13];
                    nArray4[O.lIllIIIIIl[1]] = lIllIIIIIl[14];
                    nArray4[O.lIllIIIIIl[4]] = lIllIIIIIl[15];
                    nArray4[O.lIllIIIIIl[5]] = lIllIIIIIl[16];
                    nArray4[O.lIllIIIIIl[6]] = lIllIIIIIl[17];
                    nArray4[O.lIllIIIIIl[7]] = lIllIIIIIl[18];
                    nArray4[O.lIllIIIIIl[11]] = lIllIIIIIl[19];
                    nArray4[O.lIllIIIIIl[20]] = lIllIIIIIl[21];
                    nArray4[O.lIllIIIIIl[22]] = lIllIIIIIl[9];
                    nArray4[O.lIllIIIIIl[23]] = lIllIIIIIl[24];
                    if (O.lIIlIllIIIIII(e.b(nArray4) ? 1 : 0)) {
                        a.a(lIllIIIIIl[25], lIllIIIIIl[1]);
                        a.a(lIllIIIIIl[26], lIllIIIIIl[1]);
                        a.a(lIllIIIIIl[27], lIllIIIIIl[1]);
                        a.a(lIllIIIIIl[28], lIllIIIIIl[1]);
                        a.a(lIllIIIIIl[29], lIllIIIIIl[1]);
                        a.a(lIllIIIIIl[30], lIllIIIIIl[1]);
                        a.a(lIllIIIIIl[31], lIllIIIIIl[1]);
                        int[] nArray5 = new int[lIllIIIIIl[1]];
                        nArray5[O.lIllIIIIIl[0]] = lIllIIIIIl[25];
                        if (O.lIIlIllIIIIlI(Inventory.contains((int[])nArray5) ? 1 : 0)) {
                            int[] nArray6 = new int[lIllIIIIIl[1]];
                            nArray6[O.lIllIIIIIl[0]] = lIllIIIIIl[25];
                            if (O.lIIlIllIIIIlI(Equipment.contains((int[])nArray6) ? 1 : 0)) {
                                int[] nArray7 = new int[lIllIIIIIl[1]];
                                nArray7[O.lIllIIIIIl[0]] = lIllIIIIIl[25];
                                if (O.lIIlIllIIIIlI(Bank.contains((int[])nArray7) ? 1 : 0)) {
                                    a.a(lIllIIIIIl[32], lIllIIIIIl[1]);
                                }
                            }
                        }
                        a.a(lIllIIIIIl[17], lIllIIIIIl[1]);
                        e.l(lIllIIIIIl[25]);
                        e.l(lIllIIIIIl[26]);
                        e.l(lIllIIIIIl[27]);
                        e.l(lIllIIIIIl[28]);
                        e.l(lIllIIIIIl[29]);
                        Time.sleepTicks((int)lIllIIIIIl[1]);
                        0;
                        e.l(lIllIIIIIl[31]);
                        e.l(lIllIIIIIl[33]);
                        e.l(lIllIIIIIl[30]);
                        e.l(lIllIIIIIl[32]);
                        e.l(lIllIIIIIl[17]);
                        Time.sleepTicks((int)lIllIIIIIl[5]);
                        0;
                        if (O.lIIlIllIIIIlI(Bank.isOpen() ? 1 : 0)) {
                            a.a();
                            Time.sleepTicks((int)lIllIIIIIl[11]);
                            0;
                        }
                        if (O.lIIlIllIIIIII(Bank.isOpen() ? 1 : 0)) {
                            if (O.lIIlIllIIIIIl(Skills.getLevel((Skill)Skill.FARMING), lIllIIIIIl[3])) {
                                a.a(lIllIIIIIl[13], lIllIIIIIl[12]);
                                a.a(lIllIIIIIl[14], lIllIIIIIl[12]);
                                a.a(lIllIIIIIl[19], lIllIIIIIl[12]);
                                a.a(lIllIIIIIl[15], lIllIIIIIl[12]);
                                a.b(f.be, lIllIIIIIl[1]);
                                a.b(f.aN, lIllIIIIIl[1]);
                                a.a(lIllIIIIIl[18], lIllIIIIIl[7]);
                                a.a(lIllIIIIIl[21], lIllIIIIIl[34]);
                            }
                            if (O.lIIlIllIIIIll(Skills.getLevel((Skill)Skill.FARMING), lIllIIIIIl[3])) {
                                a.a(lIllIIIIIl[9], lIllIIIIIl[35]);
                                a.a(lIllIIIIIl[36], lIllIIIIIl[1]);
                                a.a(lIllIIIIIl[24], lIllIIIIIl[1]);
                            }
                        }
                    }
                }
            }
            if (O.lIIlIllIIIIII(O.al() ? 1 : 0)) {
                String[] stringArray = new String[lIllIIIIIl[1]];
                stringArray[O.lIllIIIIIl[0]] = lIlIllllII[lIllIIIIIl[22]];
                if (O.lIIlIllIIIIII(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    String[] stringArray2 = new String[lIllIIIIIl[1]];
                    stringArray2[O.lIllIIIIIl[0]] = lIlIllllII[lIllIIIIIl[23]];
                    Inventory.getFirst((String[])stringArray2).interact(lIlIllllII[lIllIIIIIl[12]]);
                }
                if (O.lIIlIllIIIIII(Inventory.contains((int[])f.aU) ? 1 : 0) && O.lIIlIllIIIIIl(Movement.getRunEnergy(), lIllIIIIIl[37])) {
                    Inventory.getFirst((int[])f.aU).interact(lIlIllllII[lIllIIIIIl[38]]);
                    Time.sleepTicks((int)lIllIIIIIl[1]);
                    0;
                }
                if (O.lIIlIllIIIllI(Movement.getRunEnergy(), lIllIIIIIl[39]) && O.lIIlIllIIIIlI(Movement.isRunEnabled() ? 1 : 0)) {
                    Movement.toggleRun();
                }
                if (O.lIIlIllIIIIll(Skills.getLevel((Skill)Skill.FARMING), lIllIIIIIl[3])) {
                    O.cW();
                }
            }
        }
    }

    private static boolean lIIlIllIIIIIl(int n2, int n3) {
        return n2 < n3;
    }

    public static void O() {
        d lllllllllllllllllllIIlIllIIIIlIl;
        block16: {
            block15: {
                int[] nArray = new int[lIllIIIIIl[1]];
                nArray[O.lIllIIIIIl[0]] = lIllIIIIIl[16];
                if (O.lIIlIllIIIIlI(Bank.contains((int[])nArray) ? 1 : 0)) {
                    d d2 = new d(lIllIIIIIl[16], lIllIIIIIl[1], lIllIIIIIl[134]);
                    bp.add(d2);
                    0;
                }
                int[] nArray2 = new int[lIllIIIIIl[1]];
                nArray2[O.lIllIIIIIl[0]] = lIllIIIIIl[17];
                if (O.lIIlIllIIIIlI(Bank.contains((int[])nArray2) ? 1 : 0)) {
                    lllllllllllllllllllIIlIllIIIIlIl = new d(lIllIIIIIl[17], lIllIIIIIl[4], lIllIIIIIl[135]);
                    bp.add(lllllllllllllllllllIIlIllIIIIlIl);
                    0;
                }
                int[] nArray3 = new int[lIllIIIIIl[1]];
                nArray3[O.lIllIIIIIl[0]] = lIllIIIIIl[31];
                if (O.lIIlIllIIIIlI(Bank.contains((int[])nArray3) ? 1 : 0)) {
                    lllllllllllllllllllIIlIllIIIIlIl = new d(lIllIIIIIl[31], lIllIIIIIl[1], lIllIIIIIl[135]);
                    bp.add(lllllllllllllllllllIIlIllIIIIlIl);
                    0;
                }
                int[] nArray4 = new int[lIllIIIIIl[1]];
                nArray4[O.lIllIIIIIl[0]] = lIllIIIIIl[36];
                if (O.lIIlIllIIIIlI(Bank.contains((int[])nArray4) ? 1 : 0)) {
                    lllllllllllllllllllIIlIllIIIIlIl = new d(lIllIIIIIl[36], lIllIIIIIl[1], lIllIIIIIl[135]);
                    bp.add(lllllllllllllllllllIIlIllIIIIlIl);
                    0;
                }
                int[] nArray5 = new int[lIllIIIIIl[1]];
                nArray5[O.lIllIIIIIl[0]] = lIllIIIIIl[24];
                if (O.lIIlIllIIIIlI(Bank.contains((int[])nArray5) ? 1 : 0)) {
                    lllllllllllllllllllIIlIllIIIIlIl = new d(lIllIIIIIl[24], lIllIIIIIl[1], lIllIIIIIl[135]);
                    bp.add(lllllllllllllllllllIIlIllIIIIlIl);
                    0;
                }
                int[] nArray6 = new int[lIllIIIIIl[1]];
                nArray6[O.lIllIIIIIl[0]] = lIllIIIIIl[9];
                if (!O.lIIlIllIIIIII(Bank.contains((int[])nArray6) ? 1 : 0)) break block15;
                int[] nArray7 = new int[lIllIIIIIl[1]];
                nArray7[O.lIllIIIIIl[0]] = lIllIIIIIl[9];
                if (!O.lIIlIllIIIIII(Bank.contains((int[])nArray7) ? 1 : 0)) break block16;
                int[] nArray8 = new int[lIllIIIIIl[1]];
                nArray8[O.lIllIIIIIl[0]] = lIllIIIIIl[9];
                if (!O.lIIlIllIIIIIl(Bank.getFirst((int[])nArray8).getQuantity(), lIllIIIIIl[10])) break block16;
            }
            lllllllllllllllllllIIlIllIIIIlIl = new d(lIllIIIIIl[9], lIllIIIIIl[10], lIllIIIIIl[136]);
            bp.add(lllllllllllllllllllIIlIllIIIIlIl);
            0;
        }
        int[] nArray = new int[lIllIIIIIl[1]];
        nArray[O.lIllIIIIIl[0]] = lIllIIIIIl[13];
        if (O.lIIlIllIIIIlI(Bank.contains((int[])nArray) ? 1 : 0)) {
            lllllllllllllllllllIIlIllIIIIlIl = new d(lIllIIIIIl[13], lIllIIIIIl[12], lIllIIIIIl[137]);
            bp.add(lllllllllllllllllllIIlIllIIIIlIl);
            0;
        }
        int[] nArray9 = new int[lIllIIIIIl[1]];
        nArray9[O.lIllIIIIIl[0]] = lIllIIIIIl[19];
        if (O.lIIlIllIIIIlI(Bank.contains((int[])nArray9) ? 1 : 0)) {
            lllllllllllllllllllIIlIllIIIIlIl = new d(lIllIIIIIl[19], lIllIIIIIl[12], lIllIIIIIl[138]);
            bp.add(lllllllllllllllllllIIlIllIIIIlIl);
            0;
        }
        int[] nArray10 = new int[lIllIIIIIl[1]];
        nArray10[O.lIllIIIIIl[0]] = lIllIIIIIl[15];
        if (O.lIIlIllIIIIlI(Bank.contains((int[])nArray10) ? 1 : 0)) {
            lllllllllllllllllllIIlIllIIIIlIl = new d(lIllIIIIIl[15], lIllIIIIIl[12], lIllIIIIIl[138]);
            bp.add(lllllllllllllllllllIIlIllIIIIlIl);
            0;
        }
        int[] nArray11 = new int[lIllIIIIIl[1]];
        nArray11[O.lIllIIIIIl[0]] = lIllIIIIIl[14];
        if (O.lIIlIllIIIIlI(Bank.contains((int[])nArray11) ? 1 : 0)) {
            lllllllllllllllllllIIlIllIIIIlIl = new d(lIllIIIIIl[14], lIllIIIIIl[12], lIllIIIIIl[138]);
            bp.add(lllllllllllllllllllIIlIllIIIIlIl);
            0;
        }
        int[] nArray12 = new int[lIllIIIIIl[1]];
        nArray12[O.lIllIIIIIl[0]] = lIllIIIIIl[21];
        if (O.lIIlIllIIIIlI(Bank.contains((int[])nArray12) ? 1 : 0)) {
            lllllllllllllllllllIIlIllIIIIlIl = new d(js, lIllIIIIIl[68], lIllIIIIIl[139]);
            bp.add(lllllllllllllllllllIIlIllIIIIlIl);
            0;
        }
        int[] nArray13 = new int[lIllIIIIIl[1]];
        nArray13[O.lIllIIIIIl[0]] = lIllIIIIIl[140];
        if (O.lIIlIllIIIIlI(Bank.contains((int[])nArray13) ? 1 : 0)) {
            lllllllllllllllllllIIlIllIIIIlIl = new d(lIllIIIIIl[140], lIllIIIIIl[1], lIllIIIIIl[141]);
            bp.add(lllllllllllllllllllIIlIllIIIIlIl);
            0;
        }
        int[] nArray14 = new int[lIllIIIIIl[1]];
        nArray14[O.lIllIIIIIl[0]] = lIllIIIIIl[18];
        if (O.lIIlIllIIIIlI(Bank.contains((int[])nArray14) ? 1 : 0)) {
            lllllllllllllllllllIIlIllIIIIlIl = new d(lIllIIIIIl[18], lIllIIIIIl[47], j.bZ);
            bp.add(lllllllllllllllllllIIlIllIIIIlIl);
            0;
        }
    }

    private static void lIIlIlIlIlIlI() {
        lIlIllllII = new String[lIllIIIIIl[250]];
        O.lIlIllllII[O.lIllIIIIIl[0]] = O."Buying items";
        O.lIlIllllII[O.lIllIIIIIl[1]] = O."Finished buying items, switching back to farming";
        O.lIlIllllII[O.lIllIIIIIl[4]] = O."- Sorc Garden";
        O.lIlIllllII[O.lIllIIIIIl[5]] = O."";
        O.lIlIllllII[O.lIllIIIIIl[6]] = O."Navigating to bank";
        O.lIlIllllII[O.lIllIIIIIl[7]] = O."Handling banking";
        O.lIlIllllII[O.lIllIIIIIl[11]] = O."We are missing quest supplies, switching to BUYING";
        O.lIlIllllII[O.lIllIIIIIl[20]] = O."We are missing quest supplies, switching to BUYING";
        O.lIlIllllII[O.lIllIIIIIl[22]] = O."Vial";
        O.lIlIllllII[O.lIllIIIIIl[23]] = O."Vial";
        O.lIlIllllII[O.lIllIIIIIl[12]] = O."Drop";
        O.lIlIllllII[O.lIllIIIIIl[38]] = O."Drink";
        O.lIlIllllII[O.lIllIIIIIl[35]] = O."Nav to seed table";
        O.lIlIllllII[O.lIllIIIIIl[42]] = O."Turning in fruit before exiting";
        O.lIlIllllII[O.lIllIIIIIl[43]] = O."Turning in fruits";
        O.lIlIllllII[O.lIllIIIIIl[34]] = O."Deposit";
        O.lIlIllllII[O.lIllIIIIIl[44]] = O."Exiting tithe";
        O.lIlIllllII[O.lIllIIIIIl[10]] = O."Farm door";
        O.lIlIllllII[O.lIllIIIIIl[45]] = O."Open";
        O.lIlIllllII[O.lIllIIIIIl[46]] = O."Grabbing seeds";
        O.lIlIllllII[O.lIllIIIIIl[47]] = O."Seed table";
        O.lIlIllllII[O.lIllIIIIIl[48]] = O."Search";
        O.lIlIllllII[O.lIllIIIIIl[50]] = O."Logavano seed (level 74)";
        O.lIlIllllII[O.lIllIIIIIl[52]] = O."Bologano seed (level 54)";
        O.lIlIllllII[O.lIllIIIIIl[53]] = O."Golovanova seed (level 34)";
        O.lIlIllllII[O.lIllIIIIIl[39]] = O."Entering tithe farm";
        O.lIlIllllII[O.lIllIIIIIl[55]] = O."Farm door";
        O.lIlIllllII[O.lIllIIIIIl[56]] = O."Open";
        O.lIlIllllII[O.lIllIIIIIl[57]] = O."I'm an expert - don't ask me this again.";
        O.lIlIllllII[O.lIllIIIIIl[58]] = O."Farm door";
        O.lIlIllllII[O.lIllIIIIIl[59]] = O."Farm door";
        O.lIlIllllII[O.lIllIIIIIl[60]] = O."Farm door";
        O.lIlIllllII[O.lIllIIIIIl[61]] = O."Too far from anchor, resetting instance";
        O.lIlIllllII[O.lIllIIIIIl[62]] = O."Turning in fruit before exiting";
        O.lIlIllllII[O.lIllIIIIIl[3]] = O."Turning in fruits";
        O.lIlIllllII[O.lIllIIIIIl[63]] = O."Deposit";
        O.lIlIllllII[O.lIllIIIIIl[64]] = O."Exiting tithe";
        O.lIlIllllII[O.lIllIIIIIl[65]] = O."Farm door";
        O.lIlIllllII[O.lIllIIIIIl[66]] = O."Open";
        O.lIlIllllII[O.lIllIIIIIl[67]] = O."Refilling water cans";
        O.lIlIllllII[O.lIllIIIIIl[68]] = O."Nav to farm spot 1";
        O.lIlIllllII[O.lIllIIIIIl[70]] = O."Waiting for run";
        O.lIlIllllII[O.lIllIIIIIl[71]] = O."Planting farm 1";
        O.lIlIllllII[O.lIllIIIIIl[72]] = O."Water";
        O.lIlIllllII[O.lIllIIIIIl[73]] = O."Watering 20";
        O.lIlIllllII[O.lIllIIIIIl[2]] = O."Watering";
        O.lIlIllllII[O.lIllIIIIIl[74]] = O."Harvest";
        O.lIlIllllII[O.lIllIIIIIl[75]] = O."Harvesting";
        O.lIlIllllII[O.lIllIIIIIl[76]] = O."Harvest";
        O.lIlIllllII[O.lIllIIIIIl[77]] = O."Farm door";
        O.lIlIllllII[O.lIllIIIIIl[37]] = O."Farm door";
        O.lIlIllllII[O.lIllIIIIIl[78]] = O."Water";
        O.lIlIllllII[O.lIllIIIIIl[79]] = O."Watering";
        O.lIlIllllII[O.lIllIIIIIl[80]] = O."Harvest";
        O.lIlIllllII[O.lIllIIIIIl[51]] = O."Harvesting";
        O.lIlIllllII[O.lIllIIIIIl[81]] = O."Harvest";
        O.lIlIllllII[O.lIllIIIIIl[82]] = O."Waiting after harvesting spot 20";
        O.lIlIllllII[O.lIllIIIIIl[83]] = O."Waiting at farm 19";
        O.lIlIllllII[O.lIllIIIIIl[85]] = O."Turning in fruits";
        O.lIlIllllII[O.lIllIIIIIl[86]] = O."Deposit";
        O.lIlIllllII[O.lIllIIIIIl[87]] = O."Refilling water cans";
        O.lIlIllllII[O.lIllIIIIIl[88]] = O."Walk to farm 1";
        O.lIlIllllII[O.lIllIIIIIl[89]] = O."Planting farm 1";
        O.lIlIllllII[O.lIllIIIIIl[90]] = O."Walk to farm 2";
        O.lIlIllllII[O.lIllIIIIIl[91]] = O."Planting farm 2";
        O.lIlIllllII[O.lIllIIIIIl[92]] = O."Walk to farm 3";
        O.lIlIllllII[O.lIllIIIIIl[93]] = O."Planting farm 3";
        O.lIlIllllII[O.lIllIIIIIl[94]] = O."Walk to farm 4";
        O.lIlIllllII[O.lIllIIIIIl[95]] = O."Planting farm 4";
        O.lIlIllllII[O.lIllIIIIIl[96]] = O."Walk to farm 5";
        O.lIlIllllII[O.lIllIIIIIl[97]] = O."Planting farm 5";
        O.lIlIllllII[O.lIllIIIIIl[98]] = O."Walk to farm 6";
        O.lIlIllllII[O.lIllIIIIIl[99]] = O."Planting farm 6";
        O.lIlIllllII[O.lIllIIIIIl[100]] = O."Walk to farm 7";
        O.lIlIllllII[O.lIllIIIIIl[49]] = O."Planting farm 7";
        O.lIlIllllII[O.lIllIIIIIl[101]] = O."Walk to farm 8";
        O.lIlIllllII[O.lIllIIIIIl[102]] = O."Planting farm 8";
        O.lIlIllllII[O.lIllIIIIIl[103]] = O."Walk to farm 9";
        O.lIlIllllII[O.lIllIIIIIl[104]] = O."Planting farm 9";
        O.lIlIllllII[O.lIllIIIIIl[105]] = O."Walk to farm 10";
        O.lIlIllllII[O.lIllIIIIIl[106]] = O."Planting farm 10";
        O.lIlIllllII[O.lIllIIIIIl[107]] = O."Walk to farm 11";
        O.lIlIllllII[O.lIllIIIIIl[108]] = O."Planting farm 11";
        O.lIlIllllII[O.lIllIIIIIl[109]] = O."Walk to farm 12";
        O.lIlIllllII[O.lIllIIIIIl[110]] = O."Planting farm 12";
        O.lIlIllllII[O.lIllIIIIIl[69]] = O."Walk to farm 13";
        O.lIlIllllII[O.lIllIIIIIl[111]] = O."Planting farm 13";
        O.lIlIllllII[O.lIllIIIIIl[112]] = O."Walk to farm 14";
        O.lIlIllllII[O.lIllIIIIIl[32]] = O."Planting farm 14";
        O.lIlIllllII[O.lIllIIIIIl[113]] = O."Walk to farm 15";
        O.lIlIllllII[O.lIllIIIIIl[114]] = O."Planting farm 15";
        O.lIlIllllII[O.lIllIIIIIl[115]] = O."Walk to farm 16";
        O.lIlIllllII[O.lIllIIIIIl[116]] = O."Planting farm 16";
        O.lIlIllllII[O.lIllIIIIIl[117]] = O."Walk to farm 17";
        O.lIlIllllII[O.lIllIIIIIl[118]] = O."Planting farm 17";
        O.lIlIllllII[O.lIllIIIIIl[119]] = O."Walk to farm 18";
        O.lIlIllllII[O.lIllIIIIIl[120]] = O."Planting farm 18";
        O.lIlIllllII[O.lIllIIIIIl[121]] = O."Walk to farm 19";
        O.lIlIllllII[O.lIllIIIIIl[122]] = O."Planting farm 19";
        O.lIlIllllII[O.lIllIIIIIl[123]] = O."Walk to farm 20";
        O.lIlIllllII[O.lIllIIIIIl[124]] = O."Planting farm 20";
        O.lIlIllllII[O.lIllIIIIIl[125]] = O."Tiles set";
        O.lIlIllllII[O.lIllIIIIIl[133]] = O."Spade";
        O.lIlIllllII[O.lIllIIIIIl[142]] = O."Watering can";
        O.lIlIllllII[O.lIllIIIIIl[143]] = O."door";
        O.lIlIllllII[O.lIllIIIIIl[144]] = O."Tithe patch";
        O.lIlIllllII[O.lIllIIIIIl[145]] = O."seed";
        O.lIlIllllII[O.lIllIIIIIl[146]] = O."seed";
        O.lIlIllllII[O.lIllIIIIIl[147]] = O."Tithe patch";
        O.lIlIllllII[O.lIllIIIIIl[148]] = O."seed";
        O.lIlIllllII[O.lIllIIIIIl[149]] = O."seed";
        O.lIlIllllII[O.lIllIIIIIl[150]] = O."Tithe patch";
        O.lIlIllllII[O.lIllIIIIIl[151]] = O."seed";
        O.lIlIllllII[O.lIllIIIIIl[152]] = O."seed";
        O.lIlIllllII[O.lIllIIIIIl[153]] = O."Tithe patch";
        O.lIlIllllII[O.lIllIIIIIl[154]] = O."seed";
        O.lIlIllllII[O.lIllIIIIIl[155]] = O."seed";
        O.lIlIllllII[O.lIllIIIIIl[156]] = O."Tithe patch";
        O.lIlIllllII[O.lIllIIIIIl[157]] = O."seed";
        O.lIlIllllII[O.lIllIIIIIl[158]] = O."seed";
        O.lIlIllllII[O.lIllIIIIIl[159]] = O."Tithe patch";
        O.lIlIllllII[O.lIllIIIIIl[160]] = O."seed";
        O.lIlIllllII[O.lIllIIIIIl[161]] = O."seed";
        O.lIlIllllII[O.lIllIIIIIl[162]] = O."Tithe patch";
        O.lIlIllllII[O.lIllIIIIIl[163]] = O."seed";
        O.lIlIllllII[O.lIllIIIIIl[164]] = O."seed";
        O.lIlIllllII[O.lIllIIIIIl[165]] = O."Tithe patch";
        O.lIlIllllII[O.lIllIIIIIl[166]] = O."seed";
        O.lIlIllllII[O.lIllIIIIIl[167]] = O."seed";
        O.lIlIllllII[O.lIllIIIIIl[168]] = O."Tithe patch";
        O.lIlIllllII[O.lIllIIIIIl[169]] = O."seed";
        O.lIlIllllII[O.lIllIIIIIl[170]] = O."seed";
        O.lIlIllllII[O.lIllIIIIIl[171]] = O."Tithe patch";
        O.lIlIllllII[O.lIllIIIIIl[172]] = O."seed";
        O.lIlIllllII[O.lIllIIIIIl[173]] = O."seed";
        O.lIlIllllII[O.lIllIIIIIl[174]] = O."Tithe patch";
        O.lIlIllllII[O.lIllIIIIIl[175]] = O."seed";
        O.lIlIllllII[O.lIllIIIIIl[176]] = O."seed";
        O.lIlIllllII[O.lIllIIIIIl[177]] = O."Tithe patch";
        O.lIlIllllII[O.lIllIIIIIl[178]] = O."seed";
        O.lIlIllllII[O.lIllIIIIIl[179]] = O."seed";
        O.lIlIllllII[O.lIllIIIIIl[180]] = O."Tithe patch";
        O.lIlIllllII[O.lIllIIIIIl[181]] = O."seed";
        O.lIlIllllII[O.lIllIIIIIl[182]] = O."seed";
        O.lIlIllllII[O.lIllIIIIIl[183]] = O."Tithe patch";
        O.lIlIllllII[O.lIllIIIIIl[184]] = O."seed";
        O.lIlIllllII[O.lIllIIIIIl[185]] = O."seed";
        O.lIlIllllII[O.lIllIIIIIl[186]] = O."Tithe patch";
        O.lIlIllllII[O.lIllIIIIIl[187]] = O."seed";
        O.lIlIllllII[O.lIllIIIIIl[188]] = O."seed";
        O.lIlIllllII[O.lIllIIIIIl[189]] = O."Tithe patch";
        O.lIlIllllII[O.lIllIIIIIl[190]] = O."seed";
        O.lIlIllllII[O.lIllIIIIIl[191]] = O."seed";
        O.lIlIllllII[O.lIllIIIIIl[192]] = O."Tithe patch";
        O.lIlIllllII[O.lIllIIIIIl[193]] = O."seed";
        O.lIlIllllII[O.lIllIIIIIl[194]] = O."seed";
        O.lIlIllllII[O.lIllIIIIIl[195]] = O."Tithe patch";
        O.lIlIllllII[O.lIllIIIIIl[196]] = O."seed";
        O.lIlIllllII[O.lIllIIIIIl[197]] = O."seed";
        O.lIlIllllII[O.lIllIIIIIl[198]] = O."Tithe patch";
        O.lIlIllllII[O.lIllIIIIIl[199]] = O."seed";
        O.lIlIllllII[O.lIllIIIIIl[200]] = O."seed";
        O.lIlIllllII[O.lIllIIIIIl[201]] = O."Tithe patch";
        O.lIlIllllII[O.lIllIIIIIl[202]] = O."seed";
        O.lIlIllllII[O.lIllIIIIIl[203]] = O."seed";
        O.lIlIllllII[O.lIllIIIIIl[204]] = O."Water";
        O.lIlIllllII[O.lIllIIIIIl[205]] = O."seedling";
        O.lIlIllllII[O.lIllIIIIIl[206]] = O."plant";
        O.lIlIllllII[O.lIllIIIIIl[207]] = O."Sack";
        O.lIlIllllII[O.lIllIIIIIl[208]] = O."seedling";
        O.lIlIllllII[O.lIllIIIIIl[209]] = O."plant";
        O.lIlIllllII[O.lIllIIIIIl[210]] = O."Water";
        O.lIlIllllII[O.lIllIIIIIl[211]] = O."Harvest";
        O.lIlIllllII[O.lIllIIIIIl[212]] = O."can(";
        O.lIlIllllII[O.lIllIIIIIl[213]] = O."can(";
        O.lIlIllllII[O.lIllIIIIIl[214]] = O."seedling";
        O.lIlIllllII[O.lIllIIIIIl[215]] = O."plant";
        O.lIlIllllII[O.lIllIIIIIl[216]] = O."Water";
        O.lIlIllllII[O.lIllIIIIIl[217]] = O."Harvest";
        O.lIlIllllII[O.lIllIIIIIl[218]] = O."seedling";
        O.lIlIllllII[O.lIllIIIIIl[219]] = O."plant";
        O.lIlIllllII[O.lIllIIIIIl[220]] = O."Water";
        O.lIlIllllII[O.lIllIIIIIl[221]] = O."can(";
        O.lIlIllllII[O.lIllIIIIIl[222]] = O."can(";
        O.lIlIllllII[O.lIllIIIIIl[223]] = O."seedling";
        O.lIlIllllII[O.lIllIIIIIl[224]] = O."plant";
        O.lIlIllllII[O.lIllIIIIIl[225]] = O."Water";
        O.lIlIllllII[O.lIllIIIIIl[226]] = O."can(";
        O.lIlIllllII[O.lIllIIIIIl[227]] = O."can(";
        O.lIlIllllII[O.lIllIIIIIl[228]] = O."seedling";
        O.lIlIllllII[O.lIllIIIIIl[229]] = O."plant";
        O.lIlIllllII[O.lIllIIIIIl[230]] = O."Water";
        O.lIlIllllII[O.lIllIIIIIl[231]] = O."Harvest";
        O.lIlIllllII[O.lIllIIIIIl[232]] = O."Tithe patch";
        O.lIlIllllII[O.lIllIIIIIl[233]] = O."seed";
        O.lIlIllllII[O.lIllIIIIIl[234]] = O."seed";
        O.lIlIllllII[O.lIllIIIIIl[235]] = O."plant";
        O.lIlIllllII[O.lIllIIIIIl[236]] = O."Water";
        O.lIlIllllII[O.lIllIIIIIl[237]] = O."plant";
        O.lIlIllllII[O.lIllIIIIIl[238]] = O."seedling";
        O.lIlIllllII[O.lIllIIIIIl[239]] = O."fruit";
        O.lIlIllllII[O.lIllIIIIIl[240]] = O."Sack";
        O.lIlIllllII[O.lIllIIIIIl[241]] = O."Deposit";
        O.lIlIllllII[O.lIllIIIIIl[242]] = O."fruit";
        O.lIlIllllII[O.lIllIIIIIl[243]] = O."fruit";
        O.lIlIllllII[O.lIllIIIIIl[244]] = O."Sack";
        O.lIlIllllII[O.lIllIIIIIl[245]] = O."Deposit";
        O.lIlIllllII[O.lIllIIIIIl[246]] = O."fruit";
        O.lIlIllllII[O.lIllIIIIIl[248]] = O."";
        O.lIlIllllII[O.lIllIIIIIl[249]] = O."Farming ";
    }

    @Override
    public String ae() {
        return h + kr;
    }

    private static void cW() {
        TileObject lllllllllllllllllllIIlIllIIIllIl2;
        TileObject lllllllllllllllllllIIlIllIIIlllI;
        block61: {
            block62: {
                if (!O.lIIlIllIIIIlI(O.db() ? 1 : 0)) break block61;
                WorldPoint worldPoint = new WorldPoint(lIllIIIIIl[40], lIllIIIIIl[41], lIllIIIIIl[0]);
                if (!O.lIIlIllIIIIlI(O.da() ? 1 : 0) || !O.lIIlIllIIIllI(Players.getLocal().getWorldLocation().distanceTo(worldPoint), lIllIIIIIl[7])) break block62;
                AccBuilderShamans.c = lIlIllllII[lIllIIIIIl[35]];
                if (O.lIIlIllIIIIII(Dialog.isOpen() ? 1 : 0)) {
                    Dialog.close();
                }
                try {
                    e.a((WorldPoint)lllllllllllllllllllIIlIllIIIlllI);
                    0;
                }
                catch (Exception lllllllllllllllllllIIlIllIIIllIl2) {
                    lllllllllllllllllllIIlIllIIIllIl2.printStackTrace();
                }
                if (null != null) {
                    return;
                }
                Time.sleepTicks((int)lIllIIIIIl[1]);
                0;
            }
            if (O.lIIlIllIIIIII(O.da() ? 1 : 0)) {
                if (O.lIIlIllIIIIII(Inventory.contains(item -> item.getName().contains(lIlIllllII[lIllIIIIIl[246]])) ? 1 : 0)) {
                    AccBuilderShamans.c = lIlIllllII[lIllIIIIIl[42]];
                    lllllllllllllllllllIIlIllIIIllIl2 = TileObjects.getNearest(tileObject -> {
                        int n2;
                        if (O.lIIlIllIIIIII(tileObject.getName().contains(lIlIllllII[lIllIIIIIl[244]]) ? 1 : 0)) {
                            String[] stringArray = new String[lIllIIIIIl[1]];
                            stringArray[O.lIllIIIIIl[0]] = lIlIllllII[lIllIIIIIl[245]];
                            if (O.lIIlIllIIIIII(tileObject.hasAction(stringArray) ? 1 : 0)) {
                                n2 = lIllIIIIIl[1];
                                0;
                                if (null == null) return n2 != 0;
                                return ((0x3A ^ 0x58 ^ (0x1E ^ 0x2D)) & (0xBF ^ 0xC5 ^ (0x87 ^ 0xAC) ^ -1)) != 0;
                            }
                        }
                        n2 = lIllIIIIIl[0];
                        return n2 != 0;
                    });
                    if (O.lIIlIllIIIlII(lllllllllllllllllllIIlIllIIIllIl2)) {
                        AccBuilderShamans.c = lIlIllllII[lIllIIIIIl[43]];
                        lllllllllllllllllllIIlIllIIIllIl2.interact(lIlIllllII[lIllIIIIIl[34]]);
                        Time.sleepTicks((int)lIllIIIIIl[5]);
                        0;
                    }
                }
                if (O.lIIlIllIIIIlI(Inventory.contains(item -> item.getName().contains(lIlIllllII[lIllIIIIIl[243]])) ? 1 : 0)) {
                    AccBuilderShamans.c = lIlIllllII[lIllIIIIIl[44]];
                    String[] stringArray = new String[lIllIIIIIl[1]];
                    stringArray[O.lIllIIIIIl[0]] = lIlIllllII[lIllIIIIIl[10]];
                    TileObjects.getNearest((String[])stringArray).interact(lIlIllllII[lIllIIIIIl[45]]);
                    Time.sleepTicks((int)lIllIIIIIl[4]);
                    0;
                }
            }
            if (O.lIIlIllIIIlll(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lllllllllllllllllllIIlIllIIIlllI), lIllIIIIIl[7])) {
                AccBuilderShamans.c = lIlIllllII[lIllIIIIIl[46]];
                if (O.lIIlIllIIIIlI(Dialog.isOpen() ? 1 : 0)) {
                    String[] stringArray = new String[lIllIIIIIl[1]];
                    stringArray[O.lIllIIIIIl[0]] = lIlIllllII[lIllIIIIIl[47]];
                    TileObjects.getNearest((String[])stringArray).interact(lIlIllllII[lIllIIIIIl[48]]);
                    Time.sleepTicks((int)lIllIIIIIl[4]);
                    0;
                }
                if (O.lIIlIllIIIIll(Skills.getLevel((Skill)Skill.FARMING), lIllIIIIIl[49])) {
                    String[] stringArray = new String[lIllIIIIIl[1]];
                    stringArray[O.lIllIIIIIl[0]] = lIlIllllII[lIllIIIIIl[50]];
                    g.a(stringArray);
                }
                if (O.lIIlIllIIIIll(Skills.getLevel((Skill)Skill.FARMING), lIllIIIIIl[51]) && O.lIIlIllIIIIIl(Skills.getLevel((Skill)Skill.FARMING), lIllIIIIIl[49])) {
                    String[] stringArray = new String[lIllIIIIIl[1]];
                    stringArray[O.lIllIIIIIl[0]] = lIlIllllII[lIllIIIIIl[52]];
                    g.a(stringArray);
                }
                if (O.lIIlIllIIIIIl(Skills.getLevel((Skill)Skill.FARMING), lIllIIIIIl[51])) {
                    String[] stringArray = new String[lIllIIIIIl[1]];
                    stringArray[O.lIllIIIIIl[0]] = lIlIllllII[lIllIIIIIl[53]];
                    g.a(stringArray);
                }
                if (O.lIIlIllIIIIII(Dialog.isEnterInputOpen() ? 1 : 0)) {
                    Dialog.enterAmount((int)lIllIIIIIl[54]);
                    Time.sleepTicks((int)lIllIIIIIl[6]);
                    0;
                }
            }
        }
        if (O.lIIlIllIIIIII(O.db() ? 1 : 0)) {
            if (O.lIIlIllIIIIlI(O.da() ? 1 : 0)) {
                jC = null;
                AccBuilderShamans.c = lIlIllllII[lIllIIIIIl[39]];
                if (O.lIIlIllIIIIlI(Dialog.isOpen() ? 1 : 0)) {
                    String[] stringArray = new String[lIllIIIIIl[1]];
                    stringArray[O.lIllIIIIIl[0]] = lIlIllllII[lIllIIIIIl[55]];
                    TileObjects.getNearest((String[])stringArray).interact(lIlIllllII[lIllIIIIIl[56]]);
                    Time.sleepTicks((int)lIllIIIIIl[4]);
                    0;
                }
                String[] stringArray = new String[lIllIIIIIl[1]];
                stringArray[O.lIllIIIIIl[0]] = lIlIllllII[lIllIIIIIl[57]];
                g.a(stringArray);
            }
            if (O.lIIlIllIIIIII(O.da() ? 1 : 0)) {
                String[] stringArray = new String[lIllIIIIIl[1]];
                stringArray[O.lIllIIIIIl[0]] = lIlIllllII[lIllIIIIIl[58]];
                if (O.lIIlIllIIIlII(TileObjects.getNearest((String[])stringArray))) {
                    String[] stringArray2 = new String[lIllIIIIIl[1]];
                    stringArray2[O.lIllIIIIIl[0]] = lIlIllllII[lIllIIIIIl[59]];
                    jC = TileObjects.getNearest((String[])stringArray2).getWorldLocation();
                    O.cZ();
                }
                if (O.lIIlIllIIIlII(jC)) {
                    String[] stringArray3 = new String[lIllIIIIIl[1]];
                    stringArray3[O.lIllIIIIIl[0]] = lIlIllllII[lIllIIIIIl[60]];
                    if (O.lIIlIllIIIIII(TileObjects.getNearest((String[])stringArray3).getWorldLocation().equals((Object)jC) ? 1 : 0)) {
                        if (O.lIIlIllIIIllI(Players.getLocal().getWorldLocation().distanceTo(jC), lIllIIIIIl[37])) {
                            AccBuilderShamans.c = lIlIllllII[lIllIIIIIl[61]];
                            if (O.lIIlIllIIIIII(Inventory.contains(item -> item.getName().contains(lIlIllllII[lIllIIIIIl[242]])) ? 1 : 0)) {
                                AccBuilderShamans.c = lIlIllllII[lIllIIIIIl[62]];
                                lllllllllllllllllllIIlIllIIIlllI = TileObjects.getNearest(tileObject -> {
                                    int n2;
                                    if (O.lIIlIllIIIIII(tileObject.getName().contains(lIlIllllII[lIllIIIIIl[240]]) ? 1 : 0)) {
                                        String[] stringArray = new String[lIllIIIIIl[1]];
                                        stringArray[O.lIllIIIIIl[0]] = lIlIllllII[lIllIIIIIl[241]];
                                        if (O.lIIlIllIIIIII(tileObject.hasAction(stringArray) ? 1 : 0)) {
                                            n2 = lIllIIIIIl[1];
                                            0;
                                            if (-1 < 3) return n2 != 0;
                                            return ((0x8E ^ 0xC1 ^ (0x72 ^ 0x1A)) & (0xC2 ^ 0x8A ^ (0x32 ^ 0x5D) ^ -1)) != 0;
                                        }
                                    }
                                    n2 = lIllIIIIIl[0];
                                    return n2 != 0;
                                });
                                if (O.lIIlIllIIIlII(lllllllllllllllllllIIlIllIIIlllI)) {
                                    AccBuilderShamans.c = lIlIllllII[lIllIIIIIl[3]];
                                    lllllllllllllllllllIIlIllIIIlllI.interact(lIlIllllII[lIllIIIIIl[63]]);
                                    Time.sleepTicks((int)lIllIIIIIl[5]);
                                    0;
                                }
                            }
                            if (O.lIIlIllIIIIlI(Inventory.contains(item -> item.getName().contains(lIlIllllII[lIllIIIIIl[239]])) ? 1 : 0)) {
                                AccBuilderShamans.c = lIlIllllII[lIllIIIIIl[64]];
                                String[] stringArray4 = new String[lIllIIIIIl[1]];
                                stringArray4[O.lIllIIIIIl[0]] = lIlIllllII[lIllIIIIIl[65]];
                                TileObjects.getNearest((String[])stringArray4).interact(lIlIllllII[lIllIIIIIl[66]]);
                                Time.sleepTicks((int)lIllIIIIIl[4]);
                                0;
                            }
                        }
                        if (O.lIIlIllIIIIlI(O.dc() ? 1 : 0) && O.lIIlIllIIIlll(Players.getLocal().getWorldLocation().distanceTo(jC), lIllIIIIIl[37])) {
                            TileObject lllllllllllllllllllIIlIllIIIllII;
                            lllllllllllllllllllIIlIllIIIlllI = TileObjects.getNearest(tileObject -> tileObject.getName().contains(lIlIllllII[lIllIIIIIl[238]]));
                            lllllllllllllllllllIIlIllIIIllIl2 = TileObjects.getNearest(tileObject -> tileObject.getName().contains(lIlIllllII[lIllIIIIIl[237]]));
                            if (O.lIIlIllIIlIII(lllllllllllllllllllIIlIllIIIlllI) && O.lIIlIllIIlIII(lllllllllllllllllllIIlIllIIIllIl2)) {
                                if (O.lIIlIllIIIIlI(Movement.isRunEnabled() ? 1 : 0) && O.lIIlIllIIIllI(Movement.getRunEnergy(), lIllIIIIIl[47])) {
                                    Movement.toggleRun();
                                    Time.sleepTicks((int)lIllIIIIIl[7]);
                                    0;
                                }
                                int[] nArray = new int[lIllIIIIIl[1]];
                                nArray[O.lIllIIIIIl[0]] = lIllIIIIIl[9];
                                if (O.lIIlIllIIIIII(Inventory.contains((int[])nArray) ? 1 : 0) && O.lIIlIllIIIlII(lllllllllllllllllllIIlIllIIIllII = TileObjects.getNearest(tileObject -> {
                                    int n2;
                                    if (O.lIIlIllIIIIII(tileObject.getName().contains(lIlIllllII[lIllIIIIIl[236]]) ? 1 : 0) && O.lIIlIllIIIlll(tileObject.getWorldLocation().distanceTo(jC), lIllIIIIIl[12])) {
                                        n2 = lIllIIIIIl[1];
                                        0;
                                        if (3 != 3) {
                                            return ((72 + 26 - -63 + 56 ^ 87 + 70 - 40 + 25) & (0x6E ^ 0x73 ^ (0xF8 ^ 0xB2) ^ -1)) != 0;
                                        }
                                    } else {
                                        n2 = lIllIIIIIl[0];
                                    }
                                    return n2 != 0;
                                }))) {
                                    AccBuilderShamans.c = lIlIllllII[lIllIIIIIl[67]];
                                    int[] nArray2 = new int[lIllIIIIIl[1]];
                                    nArray2[O.lIllIIIIIl[0]] = lIllIIIIIl[9];
                                    Inventory.getFirst((int[])nArray2).useOn(lllllllllllllllllllIIlIllIIIllII);
                                    Time.sleepTicks((int)lIllIIIIIl[6]);
                                    0;
                                }
                                int[] nArray3 = new int[lIllIIIIIl[1]];
                                nArray3[O.lIllIIIIIl[0]] = lIllIIIIIl[9];
                                if (O.lIIlIllIIIIlI(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                                    if (O.lIIlIllIIIIlI(Players.getLocal().getWorldLocation().equals((Object)jD) ? 1 : 0)) {
                                        int[] nArray4 = new int[lIllIIIIIl[1]];
                                        nArray4[O.lIllIIIIIl[0]] = lIllIIIIIl[9];
                                        if (O.lIIlIllIIIIlI(Inventory.contains((int[])nArray4) ? 1 : 0)) {
                                            AccBuilderShamans.c = lIlIllllII[lIllIIIIIl[68]];
                                            e.c(jD);
                                            Time.sleepTicks((int)lIllIIIIIl[1]);
                                            0;
                                        }
                                    }
                                    if (O.lIIlIllIIIIII(Players.getLocal().getWorldLocation().equals((Object)jD) ? 1 : 0) && O.lIIlIllIIlIII(TileObjects.getNearest(tileObject -> {
                                        int n2;
                                        if (O.lIIlIllIIIIII(tileObject.getName().contains(lIlIllllII[lIllIIIIIl[235]]) ? 1 : 0) && O.lIIlIllIIIlll(tileObject.getWorldLocation().distanceTo(Players.getLocal().getWorldLocation()), lIllIIIIIl[7])) {
                                            n2 = lIllIIIIIl[1];
                                            0;
                                            if (2 > 3) {
                                                return ((42 + 175 - 41 + 67 ^ 23 + 31 - 41 + 166) & (0xEC ^ 0x96 ^ (0x11 ^ 0x2B) ^ -1)) != 0;
                                            }
                                        } else {
                                            n2 = lIllIIIIIl[0];
                                        }
                                        return n2 != 0;
                                    }))) {
                                        int[] nArray5 = new int[lIllIIIIIl[1]];
                                        nArray5[O.lIllIIIIIl[0]] = lIllIIIIIl[9];
                                        if (O.lIIlIllIIIIlI(Inventory.contains((int[])nArray5) ? 1 : 0)) {
                                            if (O.lIIlIllIIIIIl(Movement.getRunEnergy(), lIllIIIIIl[69])) {
                                                AccBuilderShamans.c = lIlIllllII[lIllIIIIIl[70]];
                                                Time.sleepTicks((int)lIllIIIIIl[1]);
                                                0;
                                            }
                                            if (O.lIIlIllIIIIll(Movement.getRunEnergy(), lIllIIIIIl[69])) {
                                                AccBuilderShamans.c = lIlIllllII[lIllIIIIIl[71]];
                                                if (O.lIIlIllIIIIII(Inventory.contains(item -> item.getName().contains(lIlIllllII[lIllIIIIIl[234]])) ? 1 : 0)) {
                                                    Inventory.getFirst(item -> item.getName().contains(lIlIllllII[lIllIIIIIl[233]])).useOn(TileObjects.getNearest(tileObject -> {
                                                        int n2;
                                                        if (O.lIIlIllIIIIII(tileObject.getName().contains(lIlIllllII[lIllIIIIIl[232]]) ? 1 : 0) && O.lIIlIllIIIlll(tileObject.getWorldLocation().distanceTo(jX), lIllIIIIIl[4])) {
                                                            n2 = lIllIIIIIl[1];
                                                            0;
                                                            if ((18 + 124 - 95 + 117 ^ 157 + 35 - 49 + 17) < ((99 + 102 - 149 + 180 ^ 69 + 139 - 150 + 121) & (0x88 ^ 0xB4 ^ (0x41 ^ 0x26) ^ -1))) {
                                                                return ((7 + 16 - -35 + 124 ^ 77 + 41 - 68 + 80) & (0x5D ^ 5 ^ (0xF4 ^ 0x98) ^ -1)) != 0;
                                                            }
                                                        } else {
                                                            n2 = lIllIIIIIl[0];
                                                        }
                                                        return n2 != 0;
                                                    }));
                                                    Time.sleepTicks((int)lIllIIIIIl[1]);
                                                    0;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            if (!O.lIIlIllIIlIII(lllllllllllllllllllIIlIllIIIlllI) || O.lIIlIllIIIlII(lllllllllllllllllllIIlIllIIIllIl2)) {
                                lllllllllllllllllllIIlIllIIIllII = TileObjects.getNearest(tileObject -> {
                                    int n2;
                                    block4: {
                                        TileObject lllllllllllllllllllIIlIlIlIIlIIl;
                                        block5: {
                                            if (O.lIIlIllIIIIlI(tileObject.getName().contains(lIlIllllII[lIllIIIIIl[228]]) ? 1 : 0) && !O.lIIlIllIIIIII(tileObject.getName().contains(lIlIllllII[lIllIIIIIl[229]]) ? 1 : 0)) break block4;
                                            String[] stringArray = new String[lIllIIIIIl[1]];
                                            stringArray[O.lIllIIIIIl[0]] = lIlIllllII[lIllIIIIIl[230]];
                                            if (!O.lIIlIllIIIIlI(lllllllllllllllllllIIlIlIlIIlIIl.hasAction(stringArray) ? 1 : 0)) break block5;
                                            String[] stringArray2 = new String[lIllIIIIIl[1]];
                                            stringArray2[O.lIllIIIIIl[0]] = lIlIllllII[lIllIIIIIl[231]];
                                            if (!O.lIIlIllIIIIII(lllllllllllllllllllIIlIlIlIIlIIl.hasAction(stringArray2) ? 1 : 0)) break block4;
                                        }
                                        if (O.lIIlIllIIIlll(lllllllllllllllllllIIlIlIlIIlIIl.getWorldLocation().distanceTo(Players.getLocal().getWorldLocation()), lIllIIIIIl[6])) {
                                            n2 = lIllIIIIIl[1];
                                            0;
                                            if (((0x96 ^ 0x92) & ~(0xA0 ^ 0xA4)) == 0) return n2 != 0;
                                            return ((0xFA ^ 0xBD) & ~(0x79 ^ 0x3E) & ~((0xF ^ 0x1A) & ~(0x49 ^ 0x5C))) != 0;
                                        }
                                    }
                                    n2 = lIllIIIIIl[0];
                                    return n2 != 0;
                                });
                                if (O.lIIlIllIIIlII(lllllllllllllllllllIIlIllIIIllII) && O.lIIlIllIIIIlI(jz ? 1 : 0)) {
                                    String[] stringArray5 = new String[lIllIIIIIl[1]];
                                    stringArray5[O.lIllIIIIIl[0]] = lIlIllllII[lIllIIIIIl[72]];
                                    if (O.lIIlIllIIIIII(lllllllllllllllllllIIlIllIIIllII.hasAction(stringArray5) ? 1 : 0)) {
                                        if (O.lIIlIllIIIIIl(Players.getLocal().getWorldLocation().distanceTo(jW), lIllIIIIIl[5]) && O.lIIlIllIIIlII(O.f(jW))) {
                                            AccBuilderShamans.c = lIlIllllII[lIllIIIIIl[73]];
                                            if (O.lIIlIllIIIIII(Inventory.contains(item -> item.getName().contains(lIlIllllII[lIllIIIIIl[227]])) ? 1 : 0)) {
                                                Inventory.getFirst(item -> item.getName().contains(lIlIllllII[lIllIIIIIl[226]])).useOn(TileObjects.getNearest(tileObject -> {
                                                    int n2;
                                                    if (!O.lIIlIllIIIIlI(tileObject.getName().contains(lIlIllllII[lIllIIIIIl[223]]) ? 1 : 0) || O.lIIlIllIIIIII(tileObject.getName().contains(lIlIllllII[lIllIIIIIl[224]]) ? 1 : 0)) {
                                                        TileObject lllllllllllllllllllIIlIlIlIIlIll;
                                                        String[] stringArray = new String[lIllIIIIIl[1]];
                                                        stringArray[O.lIllIIIIIl[0]] = lIlIllllII[lIllIIIIIl[225]];
                                                        if (O.lIIlIllIIIIII(lllllllllllllllllllIIlIlIlIIlIll.hasAction(stringArray) ? 1 : 0) && O.lIIlIllIIIlll(lllllllllllllllllllIIlIlIlIIlIll.getWorldLocation().distanceTo(Players.getLocal().getWorldLocation()), lIllIIIIIl[7])) {
                                                            n2 = lIllIIIIIl[1];
                                                            0;
                                                            if (1 < (0x56 ^ 0x52)) return n2 != 0;
                                                            return ((0x98 ^ 0xBB) & ~(0x60 ^ 0x43)) != 0;
                                                        }
                                                    }
                                                    n2 = lIllIIIIIl[0];
                                                    return n2 != 0;
                                                }));
                                                Time.sleepTicks((int)lIllIIIIIl[1]);
                                                0;
                                                return;
                                            }
                                        }
                                        if (O.lIIlIllIIIIll(Players.getLocal().getWorldLocation().distanceTo(jW), lIllIIIIIl[5])) {
                                            AccBuilderShamans.c = lIlIllllII[lIllIIIIIl[2]];
                                            if (O.lIIlIllIIIIII(Inventory.contains(item -> item.getName().contains(lIlIllllII[lIllIIIIIl[222]])) ? 1 : 0)) {
                                                Inventory.getFirst(item -> item.getName().contains(lIlIllllII[lIllIIIIIl[221]])).useOn(TileObjects.getNearest(tileObject -> {
                                                    int n2;
                                                    if (!O.lIIlIllIIIIlI(tileObject.getName().contains(lIlIllllII[lIllIIIIIl[218]]) ? 1 : 0) || O.lIIlIllIIIIII(tileObject.getName().contains(lIlIllllII[lIllIIIIIl[219]]) ? 1 : 0)) {
                                                        TileObject lllllllllllllllllllIIlIlIlIIllIl;
                                                        String[] stringArray = new String[lIllIIIIIl[1]];
                                                        stringArray[O.lIllIIIIIl[0]] = lIlIllllII[lIllIIIIIl[220]];
                                                        if (O.lIIlIllIIIIII(lllllllllllllllllllIIlIlIlIIllIl.hasAction(stringArray) ? 1 : 0) && O.lIIlIllIIIlll(lllllllllllllllllllIIlIlIlIIllIl.getWorldLocation().distanceTo(Players.getLocal().getWorldLocation()), lIllIIIIIl[7])) {
                                                            n2 = lIllIIIIIl[1];
                                                            0;
                                                            if (-1 <= 0) return n2 != 0;
                                                            return ((0xDF ^ 0x8D) & ~(0xD ^ 0x5F)) != 0;
                                                        }
                                                    }
                                                    n2 = lIllIIIIIl[0];
                                                    return n2 != 0;
                                                }));
                                                Time.sleepTicks((int)lIllIIIIIl[1]);
                                                0;
                                                return;
                                            }
                                        }
                                    }
                                    String[] stringArray6 = new String[lIllIIIIIl[1]];
                                    stringArray6[O.lIllIIIIIl[0]] = lIlIllllII[lIllIIIIIl[74]];
                                    if (O.lIIlIllIIIIII(lllllllllllllllllllIIlIllIIIllII.hasAction(stringArray6) ? 1 : 0)) {
                                        AccBuilderShamans.c = lIlIllllII[lIllIIIIIl[75]];
                                        lllllllllllllllllllIIlIllIIIllII.interact(lIlIllllII[lIllIIIIIl[76]]);
                                        Time.sleepTicks((int)lIllIIIIIl[1]);
                                        0;
                                        return;
                                    }
                                }
                                if (O.lIIlIllIIlIII(lllllllllllllllllllIIlIllIIIllII) && O.lIIlIllIIIIlI(jz ? 1 : 0)) {
                                    O.cY();
                                    if (O.lIIlIllIIIlII(O.f(jW))) {
                                        jz = lIllIIIIIl[1];
                                    }
                                }
                                if (O.lIIlIllIIIIII(jz ? 1 : 0)) {
                                    if (O.lIIlIllIIIIII(jA.isEmpty() ? 1 : 0)) {
                                        O.cX();
                                    }
                                    while (O.lIIlIllIIIIlI(jA.isEmpty() ? 1 : 0) && O.lIIlIllIIIIlI(AccBuilderShamans.d ? 1 : 0) && O.lIIlIllIIIlll(Players.getLocal().getWorldLocation().distanceTo(jC), lIllIIIIIl[37])) {
                                        String[] stringArray7 = new String[lIllIIIIIl[1]];
                                        stringArray7[O.lIllIIIIIl[0]] = lIlIllllII[lIllIIIIIl[77]];
                                        if (O.lIIlIllIIIIlI(TileObjects.getNearest((String[])stringArray7).getWorldLocation().equals((Object)jC) ? 1 : 0)) {
                                            String[] stringArray8 = new String[lIllIIIIIl[1]];
                                            stringArray8[O.lIllIIIIIl[0]] = lIlIllllII[lIllIIIIIl[37]];
                                            jC = TileObjects.getNearest((String[])stringArray8).getWorldLocation();
                                            Time.sleepTicks((int)lIllIIIIIl[4]);
                                            0;
                                            O.cZ();
                                            0;
                                            if ((5 + 141 - 41 + 37 ^ 32 + 88 - 52 + 70) > -1) break;
                                            return;
                                        }
                                        if (O.lIIlIllIIIIlI(Players.getLocal().getWorldLocation().equals((Object)jA.get(lIllIIIIIl[0])) ? 1 : 0)) {
                                            AccBuilderShamans.c = "Nav to tile " + String.valueOf(jA.get(lIllIIIIIl[0]));
                                            e.c(jA.get(lIllIIIIIl[0]));
                                            Time.sleepTicks((int)lIllIIIIIl[1]);
                                            0;
                                        }
                                        if (!O.lIIlIllIIIIII(Players.getLocal().getWorldLocation().equals((Object)jA.get(lIllIIIIIl[0])) ? 1 : 0)) continue;
                                        TileObject lllllllllllllllllllIIlIllIIIlIll = TileObjects.getNearest(tileObject -> {
                                            int n2;
                                            block4: {
                                                TileObject lllllllllllllllllllIIlIlIlIIllll;
                                                block5: {
                                                    if (O.lIIlIllIIIIlI(tileObject.getName().contains(lIlIllllII[lIllIIIIIl[214]]) ? 1 : 0) && !O.lIIlIllIIIIII(tileObject.getName().contains(lIlIllllII[lIllIIIIIl[215]]) ? 1 : 0)) break block4;
                                                    String[] stringArray = new String[lIllIIIIIl[1]];
                                                    stringArray[O.lIllIIIIIl[0]] = lIlIllllII[lIllIIIIIl[216]];
                                                    if (!O.lIIlIllIIIIlI(lllllllllllllllllllIIlIlIlIIllll.hasAction(stringArray) ? 1 : 0)) break block5;
                                                    String[] stringArray2 = new String[lIllIIIIIl[1]];
                                                    stringArray2[O.lIllIIIIIl[0]] = lIlIllllII[lIllIIIIIl[217]];
                                                    if (!O.lIIlIllIIIIII(lllllllllllllllllllIIlIlIlIIllll.hasAction(stringArray2) ? 1 : 0)) break block4;
                                                }
                                                if (O.lIIlIllIIIlll(lllllllllllllllllllIIlIlIlIIllll.getWorldLocation().distanceTo(jB.get(lIllIIIIIl[0])), lIllIIIIIl[4])) {
                                                    n2 = lIllIIIIIl[1];
                                                    0;
                                                    if ((61 + 1 - 13 + 95 ^ 112 + 118 - 186 + 104) != 1) return n2 != 0;
                                                    return ((0x91 ^ 0x88 ^ (0x2D ^ 0x66)) & (0xC1 ^ 0x97 ^ (0x45 ^ 0x41) ^ -1)) != 0;
                                                }
                                            }
                                            n2 = lIllIIIIIl[0];
                                            return n2 != 0;
                                        });
                                        if (O.lIIlIllIIIlII(lllllllllllllllllllIIlIllIIIlIll)) {
                                            String[] stringArray9 = new String[lIllIIIIIl[1]];
                                            stringArray9[O.lIllIIIIIl[0]] = lIlIllllII[lIllIIIIIl[78]];
                                            if (O.lIIlIllIIIIII(lllllllllllllllllllIIlIllIIIlIll.hasAction(stringArray9) ? 1 : 0)) {
                                                AccBuilderShamans.c = lIlIllllII[lIllIIIIIl[79]];
                                                if (O.lIIlIllIIIIII(Inventory.contains(item -> item.getName().contains(lIlIllllII[lIllIIIIIl[213]])) ? 1 : 0)) {
                                                    Inventory.getFirst(item -> item.getName().contains(lIlIllllII[lIllIIIIIl[212]])).useOn(lllllllllllllllllllIIlIllIIIlIll);
                                                    Time.sleepTicks((int)lIllIIIIIl[1]);
                                                    0;
                                                }
                                            }
                                            String[] stringArray10 = new String[lIllIIIIIl[1]];
                                            stringArray10[O.lIllIIIIIl[0]] = lIlIllllII[lIllIIIIIl[80]];
                                            if (O.lIIlIllIIIIII(lllllllllllllllllllIIlIllIIIlIll.hasAction(stringArray10) ? 1 : 0)) {
                                                AccBuilderShamans.c = lIlIllllII[lIllIIIIIl[51]];
                                                lllllllllllllllllllIIlIllIIIlIll.interact(lIlIllllII[lIllIIIIIl[81]]);
                                                Time.sleepTicks((int)lIllIIIIIl[1]);
                                                0;
                                                if (O.lIIlIllIIIIII(jA.get(lIllIIIIIl[0]).equals((Object)jW) ? 1 : 0)) {
                                                    AccBuilderShamans.c = lIlIllllII[lIllIIIIIl[82]];
                                                    Time.sleepTicks((int)lIllIIIIIl[22]);
                                                    0;
                                                }
                                            }
                                        }
                                        if (O.lIIlIllIIIIII(jA.get(lIllIIIIIl[0]).equals((Object)jV) ? 1 : 0)) {
                                            AccBuilderShamans.c = lIlIllllII[lIllIIIIIl[83]];
                                            Time.sleepUntil(() -> {
                                                boolean bl;
                                                if (O.lIIlIllIIIlII(TileObjects.getNearest(tileObject -> {
                                                    int n2;
                                                    block4: {
                                                        TileObject lllllllllllllllllllIIlIlIlIlIIIl;
                                                        block5: {
                                                            if (O.lIIlIllIIIIlI(tileObject.getName().contains(lIlIllllII[lIllIIIIIl[208]]) ? 1 : 0) && !O.lIIlIllIIIIII(tileObject.getName().contains(lIlIllllII[lIllIIIIIl[209]]) ? 1 : 0)) break block4;
                                                            String[] stringArray = new String[lIllIIIIIl[1]];
                                                            stringArray[O.lIllIIIIIl[0]] = lIlIllllII[lIllIIIIIl[210]];
                                                            if (!O.lIIlIllIIIIlI(lllllllllllllllllllIIlIlIlIlIIIl.hasAction(stringArray) ? 1 : 0)) break block5;
                                                            String[] stringArray2 = new String[lIllIIIIIl[1]];
                                                            stringArray2[O.lIllIIIIIl[0]] = lIlIllllII[lIllIIIIIl[211]];
                                                            if (!O.lIIlIllIIIIII(lllllllllllllllllllIIlIlIlIlIIIl.hasAction(stringArray2) ? 1 : 0)) break block4;
                                                        }
                                                        if (O.lIIlIllIIIlll(lllllllllllllllllllIIlIlIlIlIIIl.getWorldLocation().distanceTo(kq), lIllIIIIIl[4])) {
                                                            n2 = lIllIIIIIl[1];
                                                            0;
                                                            if (2 != 0) return n2 != 0;
                                                            return ((0xCF ^ 0xA3 ^ (0x5F ^ 0x1F)) & (0x4B ^ 0x4F ^ (0x76 ^ 0x5E) ^ -1)) != 0;
                                                        }
                                                    }
                                                    n2 = lIllIIIIIl[0];
                                                    return n2 != 0;
                                                }))) {
                                                    bl = lIllIIIIIl[1];
                                                    0;
                                                    if (2 == 1) {
                                                        return ((0xB3 ^ 0x80) & ~(0xE ^ 0x3D)) != 0;
                                                    }
                                                } else {
                                                    bl = lIllIIIIIl[0];
                                                }
                                                return bl;
                                            }, (int)lIllIIIIIl[84]);
                                            0;
                                        }
                                        if (O.lIIlIllIIlIII(lllllllllllllllllllIIlIllIIIlIll)) {
                                            jA.remove(lIllIIIIIl[0]);
                                            0;
                                            jB.remove(lIllIIIIIl[0]);
                                            0;
                                        }
                                        0;
                                        if (((0xE3 ^ 0xAE) & ~(0x79 ^ 0x34)) >= 0) continue;
                                        return;
                                    }
                                    if (O.lIIlIllIIlIII(O.f(jW))) {
                                        jz = lIllIIIIIl[0];
                                    }
                                }
                            }
                        }
                        if (O.lIIlIllIIIIII(O.dc() ? 1 : 0) && O.lIIlIllIIIlII(lllllllllllllllllllIIlIllIIIlllI = TileObjects.getNearest(tileObject -> {
                            int n2;
                            if (O.lIIlIllIIIIII(tileObject.getName().contains(lIlIllllII[lIllIIIIIl[207]]) ? 1 : 0) && O.lIIlIllIIIlll(tileObject.getWorldLocation().distanceTo(jC), lIllIIIIIl[12])) {
                                n2 = lIllIIIIIl[1];
                                0;
                                if (null != null) {
                                    return ((0x49 ^ 0x29) & ~(0x27 ^ 0x47)) != 0;
                                }
                            } else {
                                n2 = lIllIIIIIl[0];
                            }
                            return n2 != 0;
                        }))) {
                            AccBuilderShamans.c = lIlIllllII[lIllIIIIIl[85]];
                            lllllllllllllllllllIIlIllIIIlllI.interact(lIlIllllII[lIllIIIIIl[86]]);
                            Time.sleepTicks((int)lIllIIIIIl[5]);
                            0;
                        }
                    }
                }
            }
        }
    }

    private static boolean lIIlIllIIIIlI(int n2) {
        return n2 == 0;
    }

    @Override
    public boolean af() {
        boolean bl;
        if (O.lIIlIllIIIIll(Skills.getLevel((Skill)Skill.FARMING), lIllIIIIIl[2])) {
            bl = lIllIIIIIl[1];
            0;
            if ((0x37 ^ 0x33) == 0) {
                return ((0xF5 ^ 0xB9) & ~(0x61 ^ 0x2D)) != 0;
            }
        } else {
            bl = lIllIIIIIl[0];
        }
        return bl;
    }

    private static boolean lIIlIllIIIIll(int n2, int n3) {
        return n2 >= n3;
    }

    @Override
    public boolean ac() {
        return lIllIIIIIl[0];
    }

    private static void cZ() {
        System.out.println(TileObjects.getNearest(tileObject -> tileObject.getName().contains(lIlIllllII[lIllIIIIIl[143]])).getWorldLocation());
        jD = new WorldPoint(jC.getX() + lIllIIIIIl[22], jC.getY() - lIllIIIIIl[42], jC.getPlane());
        jE = new WorldPoint(jC.getX() + lIllIIIIIl[23], jC.getY() - lIllIIIIIl[42], jC.getPlane());
        jF = new WorldPoint(jC.getX() + lIllIIIIIl[22], jC.getY() - lIllIIIIIl[23], jC.getPlane());
        jG = new WorldPoint(jC.getX() + lIllIIIIIl[23], jC.getY() - lIllIIIIIl[23], jC.getPlane());
        jH = new WorldPoint(jC.getX() + lIllIIIIIl[22], jC.getY() - lIllIIIIIl[11], jC.getPlane());
        jI = new WorldPoint(jC.getX() + lIllIIIIIl[23], jC.getY() - lIllIIIIIl[11], jC.getPlane());
        jJ = new WorldPoint(jC.getX() + lIllIIIIIl[22], jC.getY() - lIllIIIIIl[5], jC.getPlane());
        jK = new WorldPoint(jC.getX() + lIllIIIIIl[23], jC.getY() - lIllIIIIIl[5], jC.getPlane());
        jL = new WorldPoint(jC.getX() + lIllIIIIIl[22], jC.getY() + lIllIIIIIl[5], jC.getPlane());
        jM = new WorldPoint(jC.getX() + lIllIIIIIl[23], jC.getY() + lIllIIIIIl[5], jC.getPlane());
        jN = new WorldPoint(jC.getX() + lIllIIIIIl[22], jC.getY() + lIllIIIIIl[11], jC.getPlane());
        jO = new WorldPoint(jC.getX() + lIllIIIIIl[23], jC.getY() + lIllIIIIIl[11], jC.getPlane());
        jP = new WorldPoint(jC.getX() + lIllIIIIIl[22], jC.getY() + lIllIIIIIl[23], jC.getPlane());
        jQ = new WorldPoint(jC.getX() + lIllIIIIIl[23], jC.getY() + lIllIIIIIl[23], jC.getPlane());
        jR = new WorldPoint(jC.getX() + lIllIIIIIl[22], jC.getY() + lIllIIIIIl[35], jC.getPlane());
        jS = new WorldPoint(jC.getX() + lIllIIIIIl[23], jC.getY() + lIllIIIIIl[35], jC.getPlane());
        jT = new WorldPoint(jC.getX() + lIllIIIIIl[43], jC.getY() + lIllIIIIIl[42], jC.getPlane());
        jU = new WorldPoint(jC.getX() + lIllIIIIIl[43], jC.getY() + lIllIIIIIl[23], jC.getPlane());
        jV = new WorldPoint(jC.getX() + lIllIIIIIl[43], jC.getY() + lIllIIIIIl[11], jC.getPlane());
        jW = new WorldPoint(jC.getX() + lIllIIIIIl[43], jC.getY() + lIllIIIIIl[5], jC.getPlane());
        jX = new WorldPoint(jD.getX() - lIllIIIIIl[4], jD.getY(), jD.getPlane());
        jY = new WorldPoint(jE.getX() + lIllIIIIIl[4], jE.getY(), jE.getPlane());
        jZ = new WorldPoint(jF.getX() - lIllIIIIIl[4], jF.getY(), jF.getPlane());
        ka = new WorldPoint(jG.getX() + lIllIIIIIl[4], jG.getY(), jG.getPlane());
        kb = new WorldPoint(jH.getX() - lIllIIIIIl[4], jH.getY(), jH.getPlane());
        kc = new WorldPoint(jI.getX() + lIllIIIIIl[4], jI.getY(), jI.getPlane());
        kd = new WorldPoint(jJ.getX() - lIllIIIIIl[4], jJ.getY(), jJ.getPlane());
        ke = new WorldPoint(jK.getX() + lIllIIIIIl[4], jK.getY(), jK.getPlane());
        kf = new WorldPoint(jL.getX() - lIllIIIIIl[4], jL.getY(), jL.getPlane());
        kg = new WorldPoint(jM.getX() + lIllIIIIIl[4], jM.getY(), jM.getPlane());
        kh = new WorldPoint(jN.getX() - lIllIIIIIl[4], jN.getY(), jN.getPlane());
        ki = new WorldPoint(jO.getX() + lIllIIIIIl[4], jO.getY(), jO.getPlane());
        kj = new WorldPoint(jP.getX() - lIllIIIIIl[4], jP.getY(), jP.getPlane());
        kk = new WorldPoint(jQ.getX() + lIllIIIIIl[4], jQ.getY(), jQ.getPlane());
        kl = new WorldPoint(jR.getX() - lIllIIIIIl[4], jR.getY(), jR.getPlane());
        km = new WorldPoint(jS.getX() + lIllIIIIIl[4], jS.getY(), jS.getPlane());
        kn = new WorldPoint(jT.getX() + lIllIIIIIl[4], jT.getY(), jT.getPlane());
        ko = new WorldPoint(jU.getX() + lIllIIIIIl[4], jU.getY(), jU.getPlane());
        kp = new WorldPoint(jV.getX() + lIllIIIIIl[4], jV.getY(), jV.getPlane());
        kq = new WorldPoint(jW.getX() + lIllIIIIIl[4], jW.getY(), jW.getPlane());
        System.out.println(lIlIllllII[lIllIIIIIl[125]]);
    }

    private static boolean lIIlIllIIIlIl(int n2) {
        return n2 > 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean al() {
        int n2;
        if (O.lIIlIllIIIIll(Skills.getLevel((Skill)Skill.FARMING), lIllIIIIIl[3])) {
            int n3;
            if (O.lIIlIllIIIIII(Inventory.contains(item -> item.getName().contains(lIlIllllII[lIllIIIIIl[142]])) ? 1 : 0)) {
                String[] stringArray = new String[lIllIIIIIl[1]];
                stringArray[O.lIllIIIIIl[0]] = lIlIllllII[lIllIIIIIl[133]];
                if (O.lIIlIllIIIIII(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    int[] nArray = new int[lIllIIIIIl[1]];
                    nArray[O.lIllIIIIIl[0]] = lIllIIIIIl[24];
                    if (O.lIIlIllIIIIII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        n3 = lIllIIIIIl[1];
                        0;
                        if ((0xC2 ^ 0x88 ^ (0x47 ^ 9)) <= (78 + 78 - 5 + 46 ^ 99 + 104 - 15 + 5)) return n3 != 0;
                        return ((0x20 ^ 0x56 ^ (0x3C ^ 0x62)) & (0x40 ^ 0x53 ^ (0x48 ^ 0x73) ^ -1)) != 0;
                    }
                }
            }
            n3 = lIllIIIIIl[0];
            return n3 != 0;
        }
        int[] nArray = new int[lIllIIIIIl[1]];
        nArray[O.lIllIIIIIl[0]] = lIllIIIIIl[13];
        if (O.lIIlIllIIIIII(Inventory.contains((int[])nArray) ? 1 : 0)) {
            int[] nArray2 = new int[lIllIIIIIl[1]];
            nArray2[O.lIllIIIIIl[0]] = lIllIIIIIl[15];
            if (O.lIIlIllIIIIII(Inventory.contains((int[])nArray2) ? 1 : 0)) {
                int[] nArray3 = new int[lIllIIIIIl[1]];
                nArray3[O.lIllIIIIIl[0]] = lIllIIIIIl[14];
                if (!(!O.lIIlIllIIIIII(Inventory.contains((int[])nArray3) ? 1 : 0) || O.lIIlIllIIIIlI(Inventory.contains((int[])f.aN) ? 1 : 0) && !O.lIIlIllIIIIII(Equipment.contains((int[])f.aN) ? 1 : 0) || O.lIIlIllIIIIlI(Inventory.contains((int[])f.be) ? 1 : 0) && !O.lIIlIllIIIIII(Equipment.contains((int[])f.be) ? 1 : 0))) {
                    n2 = lIllIIIIIl[1];
                    0;
                    if (null == null) return n2 != 0;
                    return ((0x45 ^ 0x61 ^ (0x2B ^ 0x10)) & (0x4F ^ 7 ^ (0x61 ^ 0x36) ^ -1)) != 0;
                }
            }
        }
        n2 = lIllIIIIIl[0];
        return n2 != 0;
    }

    private static boolean lIIlIllIIIlll(int n2, int n3) {
        return n2 <= n3;
    }

    private static String lIIlIlIIlIIII(String lllllllllllllllllllIIlIlIIIlIIII, String lllllllllllllllllllIIlIlIIIIllll) {
        try {
            SecretKeySpec lllllllllllllllllllIIlIlIIIlIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllllllIIlIlIIIIllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllllllIIlIlIIIlIlII = Cipher.getInstance("Blowfish");
            lllllllllllllllllllIIlIlIIIlIlII.init(lIllIIIIIl[4], lllllllllllllllllllIIlIlIIIlIlIl);
            return new String(lllllllllllllllllllIIlIlIIIlIlII.doFinal(Base64.getDecoder().decode(lllllllllllllllllllIIlIlIIIlIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllllllIIlIlIIIlIIll) {
            lllllllllllllllllllIIlIlIIIlIIll.printStackTrace();
            return null;
        }
    }

    private static boolean db() {
        if (O.lIIlIllIIIIll(Skills.getLevel((Skill)Skill.FARMING), lIllIIIIIl[49])) {
            int[] nArray = new int[lIllIIIIIl[1]];
            nArray[O.lIllIIIIIl[0]] = lIllIIIIIl[126];
            return Inventory.contains((int[])nArray);
        }
        if (O.lIIlIllIIIIll(Skills.getLevel((Skill)Skill.FARMING), lIllIIIIIl[51]) && O.lIIlIllIIIIIl(Skills.getLevel((Skill)Skill.FARMING), lIllIIIIIl[49])) {
            int[] nArray = new int[lIllIIIIIl[1]];
            nArray[O.lIllIIIIIl[0]] = lIllIIIIIl[127];
            return Inventory.contains((int[])nArray);
        }
        int[] nArray = new int[lIllIIIIIl[1]];
        nArray[O.lIllIIIIIl[0]] = lIllIIIIIl[128];
        return Inventory.contains((int[])nArray);
    }

    private static boolean lIIlIllIIIlII(Object object) {
        return object != null;
    }

    private static void cY() {
        if (O.lIIlIllIIlIII(O.f(jX))) {
            TileObject tileObject2;
            int[] nArray = new int[lIllIIIIIl[1]];
            nArray[O.lIllIIIIIl[0]] = lIllIIIIIl[9];
            if (O.lIIlIllIIIIII(Inventory.contains((int[])nArray) ? 1 : 0) && O.lIIlIllIIIlII(tileObject2 = TileObjects.getNearest(tileObject -> {
                int n2;
                if (O.lIIlIllIIIIII(tileObject.getName().contains(lIlIllllII[lIllIIIIIl[204]]) ? 1 : 0) && O.lIIlIllIIIlll(tileObject.getWorldLocation().distanceTo(jC), lIllIIIIIl[12])) {
                    n2 = lIllIIIIIl[1];
                    0;
                    if (((0x78 ^ 0x42) & ~(0x78 ^ 0x42)) != ((0xA8 ^ 0x82) & ~(0x6D ^ 0x47))) {
                        return ((0x6E ^ 0x3D) & ~(0xC6 ^ 0x95)) != 0;
                    }
                } else {
                    n2 = lIllIIIIIl[0];
                }
                return n2 != 0;
            }))) {
                AccBuilderShamans.c = lIlIllllII[lIllIIIIIl[87]];
                int[] nArray2 = new int[lIllIIIIIl[1]];
                nArray2[O.lIllIIIIIl[0]] = lIllIIIIIl[9];
                Inventory.getFirst((int[])nArray2).useOn(tileObject2);
                Time.sleepTicks((int)lIllIIIIIl[6]);
                0;
            }
            int[] nArray3 = new int[lIllIIIIIl[1]];
            nArray3[O.lIllIIIIIl[0]] = lIllIIIIIl[9];
            if (O.lIIlIllIIIIlI(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                if (O.lIIlIllIIIllI(Players.getLocal().getWorldLocation().distanceTo(jD), lIllIIIIIl[7])) {
                    AccBuilderShamans.c = lIlIllllII[lIllIIIIIl[88]];
                    e.c(jD);
                    Time.sleepTicks((int)lIllIIIIIl[1]);
                    0;
                }
                if (O.lIIlIllIIIlll(Players.getLocal().getWorldLocation().distanceTo(jD), lIllIIIIIl[7])) {
                    AccBuilderShamans.c = lIlIllllII[lIllIIIIIl[89]];
                    if (O.lIIlIllIIIIll(Movement.getRunEnergy(), lIllIIIIIl[69]) && O.lIIlIllIIIIII(Inventory.contains(item -> item.getName().contains(lIlIllllII[lIllIIIIIl[203]])) ? 1 : 0)) {
                        Inventory.getFirst(item -> item.getName().contains(lIlIllllII[lIllIIIIIl[202]])).useOn(TileObjects.getNearest(tileObject -> {
                            int n2;
                            if (O.lIIlIllIIIIII(tileObject.getName().contains(lIlIllllII[lIllIIIIIl[201]]) ? 1 : 0) && O.lIIlIllIIIlll(tileObject.getWorldLocation().distanceTo(jX), lIllIIIIIl[4])) {
                                n2 = lIllIIIIIl[1];
                                0;
                                if (2 <= 0) {
                                    return ((0xFE ^ 0xB4 ^ (0xD9 ^ 0xC6)) & (183 + 84 - 222 + 209 ^ 2 + 79 - 74 + 164 ^ -1)) != 0;
                                }
                            } else {
                                n2 = lIllIIIIIl[0];
                            }
                            return n2 != 0;
                        }));
                        Time.sleepTicks((int)lIllIIIIIl[1]);
                        0;
                        return;
                    }
                }
            }
        }
        if (O.lIIlIllIIlIII(O.f(jE)) && O.lIIlIllIIIlII(O.f(jX))) {
            if (O.lIIlIllIIIllI(Players.getLocal().getWorldLocation().distanceTo(jE), lIllIIIIIl[7])) {
                AccBuilderShamans.c = lIlIllllII[lIllIIIIIl[90]];
                e.c(jE);
                Time.sleepTicks((int)lIllIIIIIl[1]);
                0;
            }
            if (O.lIIlIllIIIlll(Players.getLocal().getWorldLocation().distanceTo(jE), lIllIIIIIl[7])) {
                AccBuilderShamans.c = lIlIllllII[lIllIIIIIl[91]];
                if (O.lIIlIllIIIIII(Inventory.contains(item -> item.getName().contains(lIlIllllII[lIllIIIIIl[200]])) ? 1 : 0)) {
                    Inventory.getFirst(item -> item.getName().contains(lIlIllllII[lIllIIIIIl[199]])).useOn(TileObjects.getNearest(tileObject -> {
                        int n2;
                        if (O.lIIlIllIIIIII(tileObject.getName().contains(lIlIllllII[lIllIIIIIl[198]]) ? 1 : 0) && O.lIIlIllIIIlll(tileObject.getWorldLocation().distanceTo(jY), lIllIIIIIl[4])) {
                            n2 = lIllIIIIIl[1];
                            0;
                            if ((0x15 ^ 0x10) <= 0) {
                                return ((0xE8 ^ 0xA4) & ~(0xF3 ^ 0xBF)) != 0;
                            }
                        } else {
                            n2 = lIllIIIIIl[0];
                        }
                        return n2 != 0;
                    }));
                    Time.sleepTicks((int)lIllIIIIIl[1]);
                    0;
                    return;
                }
            }
        }
        if (O.lIIlIllIIlIII(O.f(jF)) && O.lIIlIllIIIlII(O.f(jE))) {
            if (O.lIIlIllIIIllI(Players.getLocal().getWorldLocation().distanceTo(jF), lIllIIIIIl[7])) {
                AccBuilderShamans.c = lIlIllllII[lIllIIIIIl[92]];
                e.c(jF);
                Time.sleepTicks((int)lIllIIIIIl[1]);
                0;
            }
            if (O.lIIlIllIIIlll(Players.getLocal().getWorldLocation().distanceTo(jF), lIllIIIIIl[7])) {
                AccBuilderShamans.c = lIlIllllII[lIllIIIIIl[93]];
                if (O.lIIlIllIIIIII(Inventory.contains(item -> item.getName().contains(lIlIllllII[lIllIIIIIl[197]])) ? 1 : 0)) {
                    Inventory.getFirst(item -> item.getName().contains(lIlIllllII[lIllIIIIIl[196]])).useOn(TileObjects.getNearest(tileObject -> {
                        int n2;
                        if (O.lIIlIllIIIIII(tileObject.getName().contains(lIlIllllII[lIllIIIIIl[195]]) ? 1 : 0) && O.lIIlIllIIIlll(tileObject.getWorldLocation().distanceTo(jZ), lIllIIIIIl[4])) {
                            n2 = lIllIIIIIl[1];
                            0;
                            if (3 <= 1) {
                                return ((0x17 ^ 0x41 ^ (0xB8 ^ 0xB7)) & (95 + 72 - 33 + 92 ^ 176 + 139 - 234 + 106 ^ -1)) != 0;
                            }
                        } else {
                            n2 = lIllIIIIIl[0];
                        }
                        return n2 != 0;
                    }));
                    Time.sleepTicks((int)lIllIIIIIl[1]);
                    0;
                    return;
                }
            }
        }
        if (O.lIIlIllIIlIII(O.f(jG)) && O.lIIlIllIIIlII(O.f(jF))) {
            if (O.lIIlIllIIIllI(Players.getLocal().getWorldLocation().distanceTo(jG), lIllIIIIIl[7])) {
                AccBuilderShamans.c = lIlIllllII[lIllIIIIIl[94]];
                e.c(jG);
                Time.sleepTicks((int)lIllIIIIIl[1]);
                0;
            }
            if (O.lIIlIllIIIlll(Players.getLocal().getWorldLocation().distanceTo(jG), lIllIIIIIl[7])) {
                AccBuilderShamans.c = lIlIllllII[lIllIIIIIl[95]];
                if (O.lIIlIllIIIIII(Inventory.contains(item -> item.getName().contains(lIlIllllII[lIllIIIIIl[194]])) ? 1 : 0)) {
                    Inventory.getFirst(item -> item.getName().contains(lIlIllllII[lIllIIIIIl[193]])).useOn(TileObjects.getNearest(tileObject -> {
                        int n2;
                        if (O.lIIlIllIIIIII(tileObject.getName().contains(lIlIllllII[lIllIIIIIl[192]]) ? 1 : 0) && O.lIIlIllIIIlll(tileObject.getWorldLocation().distanceTo(ka), lIllIIIIIl[4])) {
                            n2 = lIllIIIIIl[1];
                            0;
                            if (null != null) {
                                return ((144 + 14 - 129 + 209 ^ 146 + 125 - 248 + 158) & (0x3A ^ 0x66 ^ (0x5F ^ 0x58) ^ -1)) != 0;
                            }
                        } else {
                            n2 = lIllIIIIIl[0];
                        }
                        return n2 != 0;
                    }));
                    Time.sleepTicks((int)lIllIIIIIl[1]);
                    0;
                    return;
                }
            }
        }
        if (O.lIIlIllIIlIII(O.f(jH)) && O.lIIlIllIIIlII(O.f(jG))) {
            if (O.lIIlIllIIIllI(Players.getLocal().getWorldLocation().distanceTo(jH), lIllIIIIIl[7])) {
                AccBuilderShamans.c = lIlIllllII[lIllIIIIIl[96]];
                e.c(jH);
                Time.sleepTicks((int)lIllIIIIIl[1]);
                0;
            }
            if (O.lIIlIllIIIlll(Players.getLocal().getWorldLocation().distanceTo(jH), lIllIIIIIl[7])) {
                AccBuilderShamans.c = lIlIllllII[lIllIIIIIl[97]];
                if (O.lIIlIllIIIIII(Inventory.contains(item -> item.getName().contains(lIlIllllII[lIllIIIIIl[191]])) ? 1 : 0)) {
                    Inventory.getFirst(item -> item.getName().contains(lIlIllllII[lIllIIIIIl[190]])).useOn(TileObjects.getNearest(tileObject -> {
                        int n2;
                        if (O.lIIlIllIIIIII(tileObject.getName().contains(lIlIllllII[lIllIIIIIl[189]]) ? 1 : 0) && O.lIIlIllIIIlll(tileObject.getWorldLocation().distanceTo(kb), lIllIIIIIl[4])) {
                            n2 = lIllIIIIIl[1];
                            0;
                            if (-1 != -1) {
                                return ((4 ^ 0x38 ^ (0x4F ^ 0x7C)) & (0x9F ^ 0xAB ^ (0x6F ^ 0x54) ^ -1)) != 0;
                            }
                        } else {
                            n2 = lIllIIIIIl[0];
                        }
                        return n2 != 0;
                    }));
                    Time.sleepTicks((int)lIllIIIIIl[1]);
                    0;
                    return;
                }
            }
        }
        if (O.lIIlIllIIlIII(O.f(jI)) && O.lIIlIllIIIlII(O.f(jH))) {
            if (O.lIIlIllIIIllI(Players.getLocal().getWorldLocation().distanceTo(jI), lIllIIIIIl[7])) {
                AccBuilderShamans.c = lIlIllllII[lIllIIIIIl[98]];
                e.c(jI);
                Time.sleepTicks((int)lIllIIIIIl[1]);
                0;
            }
            if (O.lIIlIllIIIlll(Players.getLocal().getWorldLocation().distanceTo(jI), lIllIIIIIl[7])) {
                AccBuilderShamans.c = lIlIllllII[lIllIIIIIl[99]];
                if (O.lIIlIllIIIIII(Inventory.contains(item -> item.getName().contains(lIlIllllII[lIllIIIIIl[188]])) ? 1 : 0)) {
                    Inventory.getFirst(item -> item.getName().contains(lIlIllllII[lIllIIIIIl[187]])).useOn(TileObjects.getNearest(tileObject -> {
                        int n2;
                        if (O.lIIlIllIIIIII(tileObject.getName().contains(lIlIllllII[lIllIIIIIl[186]]) ? 1 : 0) && O.lIIlIllIIIlll(tileObject.getWorldLocation().distanceTo(kc), lIllIIIIIl[4])) {
                            n2 = lIllIIIIIl[1];
                            0;
                            if (1 == 0) {
                                return ((25 + 206 - 83 + 97 ^ 44 + 151 - 37 + 32) & (171 + 56 - 224 + 214 ^ 89 + 145 - 109 + 21 ^ -1)) != 0;
                            }
                        } else {
                            n2 = lIllIIIIIl[0];
                        }
                        return n2 != 0;
                    }));
                    Time.sleepTicks((int)lIllIIIIIl[1]);
                    0;
                    return;
                }
            }
        }
        if (O.lIIlIllIIlIII(O.f(jJ)) && O.lIIlIllIIIlII(O.f(jI))) {
            if (O.lIIlIllIIIllI(Players.getLocal().getWorldLocation().distanceTo(jJ), lIllIIIIIl[7])) {
                AccBuilderShamans.c = lIlIllllII[lIllIIIIIl[100]];
                e.c(jJ);
                Time.sleepTicks((int)lIllIIIIIl[1]);
                0;
            }
            if (O.lIIlIllIIIlll(Players.getLocal().getWorldLocation().distanceTo(jJ), lIllIIIIIl[7])) {
                AccBuilderShamans.c = lIlIllllII[lIllIIIIIl[49]];
                if (O.lIIlIllIIIIII(Inventory.contains(item -> item.getName().contains(lIlIllllII[lIllIIIIIl[185]])) ? 1 : 0)) {
                    Inventory.getFirst(item -> item.getName().contains(lIlIllllII[lIllIIIIIl[184]])).useOn(TileObjects.getNearest(tileObject -> {
                        int n2;
                        if (O.lIIlIllIIIIII(tileObject.getName().contains(lIlIllllII[lIllIIIIIl[183]]) ? 1 : 0) && O.lIIlIllIIIlll(tileObject.getWorldLocation().distanceTo(kd), lIllIIIIIl[4])) {
                            n2 = lIllIIIIIl[1];
                            0;
                            if (((0xC3 ^ 0x84 ^ (0x58 ^ 0x24)) & (0xFD ^ 0x92 ^ (0xDB ^ 0x8F) ^ -1)) >= 1) {
                                return ((96 + 182 - 123 + 34 ^ 62 + 30 - 15 + 63) & (0x65 ^ 0x71 ^ (0x3C ^ 0x19) ^ -1)) != 0;
                            }
                        } else {
                            n2 = lIllIIIIIl[0];
                        }
                        return n2 != 0;
                    }));
                    Time.sleepTicks((int)lIllIIIIIl[1]);
                    0;
                    return;
                }
            }
        }
        if (O.lIIlIllIIlIII(O.f(jK)) && O.lIIlIllIIIlII(O.f(jJ))) {
            if (O.lIIlIllIIIllI(Players.getLocal().getWorldLocation().distanceTo(jK), lIllIIIIIl[7])) {
                AccBuilderShamans.c = lIlIllllII[lIllIIIIIl[101]];
                e.c(jK);
                Time.sleepTicks((int)lIllIIIIIl[1]);
                0;
            }
            if (O.lIIlIllIIIlll(Players.getLocal().getWorldLocation().distanceTo(jK), lIllIIIIIl[7])) {
                AccBuilderShamans.c = lIlIllllII[lIllIIIIIl[102]];
                if (O.lIIlIllIIIIII(Inventory.contains(item -> item.getName().contains(lIlIllllII[lIllIIIIIl[182]])) ? 1 : 0)) {
                    Inventory.getFirst(item -> item.getName().contains(lIlIllllII[lIllIIIIIl[181]])).useOn(TileObjects.getNearest(tileObject -> {
                        int n2;
                        if (O.lIIlIllIIIIII(tileObject.getName().contains(lIlIllllII[lIllIIIIIl[180]]) ? 1 : 0) && O.lIIlIllIIIlll(tileObject.getWorldLocation().distanceTo(ke), lIllIIIIIl[4])) {
                            n2 = lIllIIIIIl[1];
                            0;
                            if (null != null) {
                                return ((0x2F ^ 0x25) & ~(0x35 ^ 0x3F)) != 0;
                            }
                        } else {
                            n2 = lIllIIIIIl[0];
                        }
                        return n2 != 0;
                    }));
                    Time.sleepTicks((int)lIllIIIIIl[1]);
                    0;
                    return;
                }
            }
        }
        if (O.lIIlIllIIlIII(O.f(jL)) && O.lIIlIllIIIlII(O.f(jK))) {
            if (O.lIIlIllIIIllI(Players.getLocal().getWorldLocation().distanceTo(jL), lIllIIIIIl[7])) {
                AccBuilderShamans.c = lIlIllllII[lIllIIIIIl[103]];
                e.c(jL);
                Time.sleepTicks((int)lIllIIIIIl[1]);
                0;
            }
            if (O.lIIlIllIIIlll(Players.getLocal().getWorldLocation().distanceTo(jL), lIllIIIIIl[7])) {
                AccBuilderShamans.c = lIlIllllII[lIllIIIIIl[104]];
                if (O.lIIlIllIIIIII(Inventory.contains(item -> item.getName().contains(lIlIllllII[lIllIIIIIl[179]])) ? 1 : 0)) {
                    Inventory.getFirst(item -> item.getName().contains(lIlIllllII[lIllIIIIIl[178]])).useOn(TileObjects.getNearest(tileObject -> {
                        int n2;
                        if (O.lIIlIllIIIIII(tileObject.getName().contains(lIlIllllII[lIllIIIIIl[177]]) ? 1 : 0) && O.lIIlIllIIIlll(tileObject.getWorldLocation().distanceTo(kf), lIllIIIIIl[4])) {
                            n2 = lIllIIIIIl[1];
                            0;
                            if (3 > (5 + 59 - -2 + 86 ^ 53 + 123 - 66 + 46)) {
                                return ((197 + 76 - 79 + 47 ^ 150 + 162 - 224 + 77) & (0x7B ^ 0x49 ^ (0x28 ^ 0x4E) ^ -1)) != 0;
                            }
                        } else {
                            n2 = lIllIIIIIl[0];
                        }
                        return n2 != 0;
                    }));
                    Time.sleepTicks((int)lIllIIIIIl[1]);
                    0;
                    return;
                }
            }
        }
        if (O.lIIlIllIIlIII(O.f(jM)) && O.lIIlIllIIIlII(O.f(jL))) {
            if (O.lIIlIllIIIllI(Players.getLocal().getWorldLocation().distanceTo(jM), lIllIIIIIl[7])) {
                AccBuilderShamans.c = lIlIllllII[lIllIIIIIl[105]];
                e.c(jM);
                Time.sleepTicks((int)lIllIIIIIl[1]);
                0;
            }
            if (O.lIIlIllIIIlll(Players.getLocal().getWorldLocation().distanceTo(jM), lIllIIIIIl[7])) {
                AccBuilderShamans.c = lIlIllllII[lIllIIIIIl[106]];
                if (O.lIIlIllIIIIII(Inventory.contains(item -> item.getName().contains(lIlIllllII[lIllIIIIIl[176]])) ? 1 : 0)) {
                    Inventory.getFirst(item -> item.getName().contains(lIlIllllII[lIllIIIIIl[175]])).useOn(TileObjects.getNearest(tileObject -> {
                        int n2;
                        if (O.lIIlIllIIIIII(tileObject.getName().contains(lIlIllllII[lIllIIIIIl[174]]) ? 1 : 0) && O.lIIlIllIIIlll(tileObject.getWorldLocation().distanceTo(kg), lIllIIIIIl[4])) {
                            n2 = lIllIIIIIl[1];
                            0;
                            if (null != null) {
                                return ((0xC9 ^ 0x81 ^ (0xB7 ^ 0xAC)) & (0xD ^ 0x39 ^ (0x5D ^ 0x3A) ^ -1)) != 0;
                            }
                        } else {
                            n2 = lIllIIIIIl[0];
                        }
                        return n2 != 0;
                    }));
                    Time.sleepTicks((int)lIllIIIIIl[1]);
                    0;
                    return;
                }
            }
        }
        if (O.lIIlIllIIlIII(O.f(jN)) && O.lIIlIllIIIlII(O.f(jM))) {
            if (O.lIIlIllIIIllI(Players.getLocal().getWorldLocation().distanceTo(jN), lIllIIIIIl[7])) {
                AccBuilderShamans.c = lIlIllllII[lIllIIIIIl[107]];
                e.c(jN);
                Time.sleepTicks((int)lIllIIIIIl[1]);
                0;
            }
            if (O.lIIlIllIIIlll(Players.getLocal().getWorldLocation().distanceTo(jN), lIllIIIIIl[7])) {
                AccBuilderShamans.c = lIlIllllII[lIllIIIIIl[108]];
                if (O.lIIlIllIIIIII(Inventory.contains(item -> item.getName().contains(lIlIllllII[lIllIIIIIl[173]])) ? 1 : 0)) {
                    Inventory.getFirst(item -> item.getName().contains(lIlIllllII[lIllIIIIIl[172]])).useOn(TileObjects.getNearest(tileObject -> {
                        int n2;
                        if (O.lIIlIllIIIIII(tileObject.getName().contains(lIlIllllII[lIllIIIIIl[171]]) ? 1 : 0) && O.lIIlIllIIIlll(tileObject.getWorldLocation().distanceTo(kh), lIllIIIIIl[4])) {
                            n2 = lIllIIIIIl[1];
                            0;
                            if (1 > 1) {
                                return ((0xC9 ^ 0xA2 ^ (0xFC ^ 0x80)) & (0xBC ^ 0x94 ^ (0x13 ^ 0x2C) ^ -1)) != 0;
                            }
                        } else {
                            n2 = lIllIIIIIl[0];
                        }
                        return n2 != 0;
                    }));
                    Time.sleepTicks((int)lIllIIIIIl[1]);
                    0;
                    return;
                }
            }
        }
        if (O.lIIlIllIIlIII(O.f(jO)) && O.lIIlIllIIIlII(O.f(jN))) {
            if (O.lIIlIllIIIllI(Players.getLocal().getWorldLocation().distanceTo(jO), lIllIIIIIl[7])) {
                AccBuilderShamans.c = lIlIllllII[lIllIIIIIl[109]];
                e.c(jO);
                Time.sleepTicks((int)lIllIIIIIl[1]);
                0;
            }
            if (O.lIIlIllIIIlll(Players.getLocal().getWorldLocation().distanceTo(jO), lIllIIIIIl[7])) {
                AccBuilderShamans.c = lIlIllllII[lIllIIIIIl[110]];
                if (O.lIIlIllIIIIII(Inventory.contains(item -> item.getName().contains(lIlIllllII[lIllIIIIIl[170]])) ? 1 : 0)) {
                    Inventory.getFirst(item -> item.getName().contains(lIlIllllII[lIllIIIIIl[169]])).useOn(TileObjects.getNearest(tileObject -> {
                        int n2;
                        if (O.lIIlIllIIIIII(tileObject.getName().contains(lIlIllllII[lIllIIIIIl[168]]) ? 1 : 0) && O.lIIlIllIIIlll(tileObject.getWorldLocation().distanceTo(ki), lIllIIIIIl[4])) {
                            n2 = lIllIIIIIl[1];
                            0;
                            if (((0x79 ^ 0x39 ^ (5 ^ 9)) & (61 + 139 - 5 + 43 ^ 15 + 28 - -81 + 38 ^ -1)) != 0) {
                                return ((0x54 ^ 0x5E ^ (0xB8 ^ 0xA9)) & (0x97 ^ 0x9C ^ (0x67 ^ 0x77) ^ -1)) != 0;
                            }
                        } else {
                            n2 = lIllIIIIIl[0];
                        }
                        return n2 != 0;
                    }));
                    Time.sleepTicks((int)lIllIIIIIl[1]);
                    0;
                    return;
                }
            }
        }
        if (O.lIIlIllIIlIII(O.f(jP)) && O.lIIlIllIIIlII(O.f(jO))) {
            if (O.lIIlIllIIIllI(Players.getLocal().getWorldLocation().distanceTo(jP), lIllIIIIIl[7])) {
                AccBuilderShamans.c = lIlIllllII[lIllIIIIIl[69]];
                e.c(jP);
                Time.sleepTicks((int)lIllIIIIIl[1]);
                0;
            }
            if (O.lIIlIllIIIlll(Players.getLocal().getWorldLocation().distanceTo(jP), lIllIIIIIl[7])) {
                AccBuilderShamans.c = lIlIllllII[lIllIIIIIl[111]];
                if (O.lIIlIllIIIIII(Inventory.contains(item -> item.getName().contains(lIlIllllII[lIllIIIIIl[167]])) ? 1 : 0)) {
                    Inventory.getFirst(item -> item.getName().contains(lIlIllllII[lIllIIIIIl[166]])).useOn(TileObjects.getNearest(tileObject -> {
                        int n2;
                        if (O.lIIlIllIIIIII(tileObject.getName().contains(lIlIllllII[lIllIIIIIl[165]]) ? 1 : 0) && O.lIIlIllIIIlll(tileObject.getWorldLocation().distanceTo(kj), lIllIIIIIl[4])) {
                            n2 = lIllIIIIIl[1];
                            0;
                            if (2 < 2) {
                                return ((0x50 ^ 2) & ~(0x46 ^ 0x14)) != 0;
                            }
                        } else {
                            n2 = lIllIIIIIl[0];
                        }
                        return n2 != 0;
                    }));
                    Time.sleepTicks((int)lIllIIIIIl[1]);
                    0;
                    return;
                }
            }
        }
        if (O.lIIlIllIIlIII(O.f(jQ)) && O.lIIlIllIIIlII(O.f(jP))) {
            if (O.lIIlIllIIIllI(Players.getLocal().getWorldLocation().distanceTo(jQ), lIllIIIIIl[7])) {
                AccBuilderShamans.c = lIlIllllII[lIllIIIIIl[112]];
                e.c(jQ);
                Time.sleepTicks((int)lIllIIIIIl[1]);
                0;
            }
            if (O.lIIlIllIIIlll(Players.getLocal().getWorldLocation().distanceTo(jQ), lIllIIIIIl[7])) {
                AccBuilderShamans.c = lIlIllllII[lIllIIIIIl[32]];
                if (O.lIIlIllIIIIII(Inventory.contains(item -> item.getName().contains(lIlIllllII[lIllIIIIIl[164]])) ? 1 : 0)) {
                    Inventory.getFirst(item -> item.getName().contains(lIlIllllII[lIllIIIIIl[163]])).useOn(TileObjects.getNearest(tileObject -> {
                        int n2;
                        if (O.lIIlIllIIIIII(tileObject.getName().contains(lIlIllllII[lIllIIIIIl[162]]) ? 1 : 0) && O.lIIlIllIIIlll(tileObject.getWorldLocation().distanceTo(kk), lIllIIIIIl[4])) {
                            n2 = lIllIIIIIl[1];
                            0;
                            if (((0x4F ^ 0x71) & ~(0x37 ^ 9)) != 0) {
                                return ((0x76 ^ 0x17) & ~(0x58 ^ 0x39)) != 0;
                            }
                        } else {
                            n2 = lIllIIIIIl[0];
                        }
                        return n2 != 0;
                    }));
                    Time.sleepTicks((int)lIllIIIIIl[1]);
                    0;
                    return;
                }
            }
        }
        if (O.lIIlIllIIlIII(O.f(jR)) && O.lIIlIllIIIlII(O.f(jQ))) {
            if (O.lIIlIllIIIllI(Players.getLocal().getWorldLocation().distanceTo(jR), lIllIIIIIl[7])) {
                AccBuilderShamans.c = lIlIllllII[lIllIIIIIl[113]];
                e.c(jR);
                Time.sleepTicks((int)lIllIIIIIl[1]);
                0;
            }
            if (O.lIIlIllIIIlll(Players.getLocal().getWorldLocation().distanceTo(jR), lIllIIIIIl[7])) {
                AccBuilderShamans.c = lIlIllllII[lIllIIIIIl[114]];
                if (O.lIIlIllIIIIII(Inventory.contains(item -> item.getName().contains(lIlIllllII[lIllIIIIIl[161]])) ? 1 : 0)) {
                    Inventory.getFirst(item -> item.getName().contains(lIlIllllII[lIllIIIIIl[160]])).useOn(TileObjects.getNearest(tileObject -> {
                        int n2;
                        if (O.lIIlIllIIIIII(tileObject.getName().contains(lIlIllllII[lIllIIIIIl[159]]) ? 1 : 0) && O.lIIlIllIIIlll(tileObject.getWorldLocation().distanceTo(kl), lIllIIIIIl[4])) {
                            n2 = lIllIIIIIl[1];
                            0;
                            if (-3 > 0) {
                                return ((0x89 ^ 0xC3 ^ (0x56 ^ 0x17)) & (1 ^ 0x5D ^ (6 ^ 0x51) ^ -1)) != 0;
                            }
                        } else {
                            n2 = lIllIIIIIl[0];
                        }
                        return n2 != 0;
                    }));
                    Time.sleepTicks((int)lIllIIIIIl[1]);
                    0;
                    return;
                }
            }
        }
        if (O.lIIlIllIIlIII(O.f(jS)) && O.lIIlIllIIIlII(O.f(jR))) {
            if (O.lIIlIllIIIllI(Players.getLocal().getWorldLocation().distanceTo(jS), lIllIIIIIl[7])) {
                AccBuilderShamans.c = lIlIllllII[lIllIIIIIl[115]];
                e.c(jS);
                Time.sleepTicks((int)lIllIIIIIl[1]);
                0;
            }
            if (O.lIIlIllIIIlll(Players.getLocal().getWorldLocation().distanceTo(jS), lIllIIIIIl[7])) {
                AccBuilderShamans.c = lIlIllllII[lIllIIIIIl[116]];
                if (O.lIIlIllIIIIII(Inventory.contains(item -> item.getName().contains(lIlIllllII[lIllIIIIIl[158]])) ? 1 : 0)) {
                    Inventory.getFirst(item -> item.getName().contains(lIlIllllII[lIllIIIIIl[157]])).useOn(TileObjects.getNearest(tileObject -> {
                        int n2;
                        if (O.lIIlIllIIIIII(tileObject.getName().contains(lIlIllllII[lIllIIIIIl[156]]) ? 1 : 0) && O.lIIlIllIIIlll(tileObject.getWorldLocation().distanceTo(km), lIllIIIIIl[4])) {
                            n2 = lIllIIIIIl[1];
                            0;
                            if (null != null) {
                                return ((0x96 ^ 0x93) & ~(0x69 ^ 0x6C)) != 0;
                            }
                        } else {
                            n2 = lIllIIIIIl[0];
                        }
                        return n2 != 0;
                    }));
                    Time.sleepTicks((int)lIllIIIIIl[1]);
                    0;
                    return;
                }
            }
        }
        if (O.lIIlIllIIlIII(O.f(jT)) && O.lIIlIllIIIlII(O.f(jS))) {
            if (O.lIIlIllIIIllI(Players.getLocal().getWorldLocation().distanceTo(jT), lIllIIIIIl[7])) {
                AccBuilderShamans.c = lIlIllllII[lIllIIIIIl[117]];
                e.c(jT);
                Time.sleepTicks((int)lIllIIIIIl[1]);
                0;
            }
            if (O.lIIlIllIIIlll(Players.getLocal().getWorldLocation().distanceTo(jT), lIllIIIIIl[7])) {
                AccBuilderShamans.c = lIlIllllII[lIllIIIIIl[118]];
                if (O.lIIlIllIIIIII(Inventory.contains(item -> item.getName().contains(lIlIllllII[lIllIIIIIl[155]])) ? 1 : 0)) {
                    Inventory.getFirst(item -> item.getName().contains(lIlIllllII[lIllIIIIIl[154]])).useOn(TileObjects.getNearest(tileObject -> {
                        int n2;
                        if (O.lIIlIllIIIIII(tileObject.getName().contains(lIlIllllII[lIllIIIIIl[153]]) ? 1 : 0) && O.lIIlIllIIIlll(tileObject.getWorldLocation().distanceTo(kn), lIllIIIIIl[4])) {
                            n2 = lIllIIIIIl[1];
                            0;
                            if ((0x9B ^ 0x9F) != (0xC5 ^ 0xC1)) {
                                return ((0x52 ^ 0x1A) & ~(0x13 ^ 0x5B)) != 0;
                            }
                        } else {
                            n2 = lIllIIIIIl[0];
                        }
                        return n2 != 0;
                    }));
                    Time.sleepTicks((int)lIllIIIIIl[1]);
                    0;
                    return;
                }
            }
        }
        if (O.lIIlIllIIlIII(O.f(jU)) && O.lIIlIllIIIlII(O.f(jT))) {
            if (O.lIIlIllIIIllI(Players.getLocal().getWorldLocation().distanceTo(jU), lIllIIIIIl[7])) {
                AccBuilderShamans.c = lIlIllllII[lIllIIIIIl[119]];
                e.c(jU);
                Time.sleepTicks((int)lIllIIIIIl[1]);
                0;
            }
            if (O.lIIlIllIIIlll(Players.getLocal().getWorldLocation().distanceTo(jU), lIllIIIIIl[7])) {
                AccBuilderShamans.c = lIlIllllII[lIllIIIIIl[120]];
                if (O.lIIlIllIIIIII(Inventory.contains(item -> item.getName().contains(lIlIllllII[lIllIIIIIl[152]])) ? 1 : 0)) {
                    Inventory.getFirst(item -> item.getName().contains(lIlIllllII[lIllIIIIIl[151]])).useOn(TileObjects.getNearest(tileObject -> {
                        int n2;
                        if (O.lIIlIllIIIIII(tileObject.getName().contains(lIlIllllII[lIllIIIIIl[150]]) ? 1 : 0) && O.lIIlIllIIIlll(tileObject.getWorldLocation().distanceTo(ko), lIllIIIIIl[4])) {
                            n2 = lIllIIIIIl[1];
                            0;
                            if (-1 > 0) {
                                return ((57 + 80 - 110 + 122 ^ 83 + 138 - 81 + 16) & (9 + 193 - 66 + 65 ^ 20 + 119 - -32 + 21 ^ -1)) != 0;
                            }
                        } else {
                            n2 = lIllIIIIIl[0];
                        }
                        return n2 != 0;
                    }));
                    Time.sleepTicks((int)lIllIIIIIl[1]);
                    0;
                    return;
                }
            }
        }
        if (O.lIIlIllIIlIII(O.f(jV)) && O.lIIlIllIIIlII(O.f(jU))) {
            if (O.lIIlIllIIIllI(Players.getLocal().getWorldLocation().distanceTo(jV), lIllIIIIIl[7])) {
                AccBuilderShamans.c = lIlIllllII[lIllIIIIIl[121]];
                e.c(jV);
                Time.sleepTicks((int)lIllIIIIIl[1]);
                0;
            }
            if (O.lIIlIllIIIlll(Players.getLocal().getWorldLocation().distanceTo(jV), lIllIIIIIl[7])) {
                AccBuilderShamans.c = lIlIllllII[lIllIIIIIl[122]];
                if (O.lIIlIllIIIIII(Inventory.contains(item -> item.getName().contains(lIlIllllII[lIllIIIIIl[149]])) ? 1 : 0)) {
                    Inventory.getFirst(item -> item.getName().contains(lIlIllllII[lIllIIIIIl[148]])).useOn(TileObjects.getNearest(tileObject -> {
                        int n2;
                        if (O.lIIlIllIIIIII(tileObject.getName().contains(lIlIllllII[lIllIIIIIl[147]]) ? 1 : 0) && O.lIIlIllIIIlll(tileObject.getWorldLocation().distanceTo(kp), lIllIIIIIl[4])) {
                            n2 = lIllIIIIIl[1];
                            0;
                            if (2 == 3) {
                                return ((109 + 31 - 21 + 99 ^ 154 + 49 - 138 + 94) & (0x2C ^ 0x6B ^ 2 ^ -1)) != 0;
                            }
                        } else {
                            n2 = lIllIIIIIl[0];
                        }
                        return n2 != 0;
                    }));
                    Time.sleepTicks((int)lIllIIIIIl[1]);
                    0;
                    return;
                }
            }
        }
        if (O.lIIlIllIIlIII(O.f(jW)) && O.lIIlIllIIIlII(O.f(jV))) {
            if (O.lIIlIllIIIllI(Players.getLocal().getWorldLocation().distanceTo(jW), lIllIIIIIl[7])) {
                AccBuilderShamans.c = lIlIllllII[lIllIIIIIl[123]];
                e.c(jW);
                Time.sleepTicks((int)lIllIIIIIl[1]);
                0;
            }
            if (O.lIIlIllIIIlll(Players.getLocal().getWorldLocation().distanceTo(jW), lIllIIIIIl[7])) {
                AccBuilderShamans.c = lIlIllllII[lIllIIIIIl[124]];
                if (O.lIIlIllIIIIII(Inventory.contains(item -> item.getName().contains(lIlIllllII[lIllIIIIIl[146]])) ? 1 : 0)) {
                    Inventory.getFirst(item -> item.getName().contains(lIlIllllII[lIllIIIIIl[145]])).useOn(TileObjects.getNearest(tileObject -> {
                        int n2;
                        if (O.lIIlIllIIIIII(tileObject.getName().contains(lIlIllllII[lIllIIIIIl[144]]) ? 1 : 0) && O.lIIlIllIIIlll(tileObject.getWorldLocation().distanceTo(kq), lIllIIIIIl[4])) {
                            n2 = lIllIIIIIl[1];
                            0;
                            if (1 < 0) {
                                return ((0x97 ^ 0x9E ^ (0xD5 ^ 0x97)) & (192 + 93 - 249 + 180 ^ 146 + 63 - 96 + 34 ^ -1)) != 0;
                            }
                        } else {
                            n2 = lIllIIIIIl[0];
                        }
                        return n2 != 0;
                    }));
                    Time.sleepTicks((int)lIllIIIIIl[12]);
                    0;
                    return;
                }
            }
        }
    }

    private static String lIIlIlIIlIIIl(String lllllllllllllllllllIIlIlIIIlllIl, String lllllllllllllllllllIIlIlIIIlllII) {
        try {
            SecretKeySpec lllllllllllllllllllIIlIlIIlIIIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllllllIIlIlIIIlllII.getBytes(StandardCharsets.UTF_8)), lIllIIIIIl[22]), "DES");
            Cipher lllllllllllllllllllIIlIlIIlIIIIl = Cipher.getInstance("DES");
            lllllllllllllllllllIIlIlIIlIIIIl.init(lIllIIIIIl[4], lllllllllllllllllllIIlIlIIlIIIlI);
            return new String(lllllllllllllllllllIIlIlIIlIIIIl.doFinal(Base64.getDecoder().decode(lllllllllllllllllllIIlIlIIIlllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllllllIIlIlIIlIIIII) {
            lllllllllllllllllllIIlIlIIlIIIII.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIllIIIIII(int n2) {
        return n2 != 0;
    }

    private static boolean dc() {
        boolean bl;
        int lllllllllllllllllllIIlIllIIIIlll;
        int n2 = lIllIIIIIl[0];
        int[] nArray = new int[lIllIIIIIl[1]];
        nArray[O.lIllIIIIIl[0]] = lIllIIIIIl[129];
        if (O.lIIlIllIIIIII(Inventory.contains((int[])nArray) ? 1 : 0)) {
            int[] nArray2 = new int[lIllIIIIIl[1]];
            nArray2[O.lIllIIIIIl[0]] = lIllIIIIIl[129];
            lllllllllllllllllllIIlIllIIIIlll = n2 + Inventory.getFirst((int[])nArray2).getQuantity();
        }
        int[] nArray3 = new int[lIllIIIIIl[1]];
        nArray3[O.lIllIIIIIl[0]] = lIllIIIIIl[130];
        if (O.lIIlIllIIIIII(Inventory.contains((int[])nArray3) ? 1 : 0)) {
            int[] nArray4 = new int[lIllIIIIIl[1]];
            nArray4[O.lIllIIIIIl[0]] = lIllIIIIIl[130];
            lllllllllllllllllllIIlIllIIIIlll += Inventory.getFirst((int[])nArray4).getQuantity();
        }
        int[] nArray5 = new int[lIllIIIIIl[1]];
        nArray5[O.lIllIIIIIl[0]] = lIllIIIIIl[131];
        if (O.lIIlIllIIIIII(Inventory.contains((int[])nArray5) ? 1 : 0)) {
            int[] nArray6 = new int[lIllIIIIIl[1]];
            nArray6[O.lIllIIIIIl[0]] = lIllIIIIIl[131];
            lllllllllllllllllllIIlIllIIIIlll += Inventory.getFirst((int[])nArray6).getQuantity();
        }
        if (O.lIIlIllIIIIll(lllllllllllllllllllIIlIllIIIIlll, lIllIIIIIl[124])) {
            bl = lIllIIIIIl[1];
            0;
            if ((2 & (2 ^ -1)) != 0) {
                return ((0x3B ^ 0x63 ^ (0x89 ^ 0x83)) & (0x19 ^ 0x21 ^ (0x3B ^ 0x51) ^ -1)) != 0;
            }
        } else {
            bl = lIllIIIIIl[0];
        }
        return bl;
    }

    private static String lIIlIlIIlIIlI(String lllllllllllllllllllIIlIlIIllIlII, String lllllllllllllllllllIIlIlIIllIIll) {
        lllllllllllllllllllIIlIlIIllIlII = new String(Base64.getDecoder().decode(lllllllllllllllllllIIlIlIIllIlII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllllllIIlIlIIllIIlI = new StringBuilder();
        char[] lllllllllllllllllllIIlIlIIllIIIl = lllllllllllllllllllIIlIlIIllIIll.toCharArray();
        int lllllllllllllllllllIIlIlIIllIIII = lIllIIIIIl[0];
        char[] lllllllllllllllllllIIlIlIIlIlIlI = lllllllllllllllllllIIlIlIIllIlII.toCharArray();
        int lllllllllllllllllllIIlIlIIlIlIIl = lllllllllllllllllllIIlIlIIlIlIlI.length;
        int lllllllllllllllllllIIlIlIIlIlIII = lIllIIIIIl[0];
        while (O.lIIlIllIIIIIl(lllllllllllllllllllIIlIlIIlIlIII, lllllllllllllllllllIIlIlIIlIlIIl)) {
            char lllllllllllllllllllIIlIlIIllIlIl = lllllllllllllllllllIIlIlIIlIlIlI[lllllllllllllllllllIIlIlIIlIlIII];
            lllllllllllllllllllIIlIlIIllIIlI.append((char)(lllllllllllllllllllIIlIlIIllIlIl ^ lllllllllllllllllllIIlIlIIllIIIl[lllllllllllllllllllIIlIlIIllIIII % lllllllllllllllllllIIlIlIIllIIIl.length]));
            0;
            ++lllllllllllllllllllIIlIlIIllIIII;
            ++lllllllllllllllllllIIlIlIIlIlIII;
            0;
            if (1 >= 0) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllllllIIlIlIIllIIlI);
    }

    private static void dd() {
        e.l(lIllIIIIIl[25]);
        e.l(lIllIIIIIl[26]);
        e.l(lIllIIIIIl[27]);
        e.l(lIllIIIIIl[28]);
        e.l(lIllIIIIIl[29]);
        e.l(lIllIIIIIl[30]);
        e.l(lIllIIIIIl[32]);
        e.l(lIllIIIIIl[132]);
    }

    private static boolean lIIlIllIIlIII(Object object) {
        return object == null;
    }

    private static void cX() {
        if (O.lIIlIllIIIIII(jA.isEmpty() ? 1 : 0)) {
            jA.add(jD);
            0;
            jA.add(jE);
            0;
            jA.add(jF);
            0;
            jA.add(jG);
            0;
            jA.add(jH);
            0;
            jA.add(jI);
            0;
            jA.add(jJ);
            0;
            jA.add(jK);
            0;
            jA.add(jL);
            0;
            jA.add(jM);
            0;
            jA.add(jN);
            0;
            jA.add(jO);
            0;
            jA.add(jP);
            0;
            jA.add(jQ);
            0;
            jA.add(jR);
            0;
            jA.add(jS);
            0;
            jA.add(jT);
            0;
            jA.add(jU);
            0;
            jA.add(jV);
            0;
            jA.add(jW);
            0;
        }
        if (O.lIIlIllIIIIII(jB.isEmpty() ? 1 : 0)) {
            jB.add(jX);
            0;
            jB.add(jY);
            0;
            jB.add(jZ);
            0;
            jB.add(ka);
            0;
            jB.add(kb);
            0;
            jB.add(kc);
            0;
            jB.add(kd);
            0;
            jB.add(ke);
            0;
            jB.add(kf);
            0;
            jB.add(kg);
            0;
            jB.add(kh);
            0;
            jB.add(ki);
            0;
            jB.add(kj);
            0;
            jB.add(kk);
            0;
            jB.add(kl);
            0;
            jB.add(km);
            0;
            jB.add(kn);
            0;
            jB.add(ko);
            0;
            jB.add(kp);
            0;
            jB.add(kq);
            0;
        }
    }

    private static boolean da() {
        return Static.getClient().isInInstancedRegion();
    }

    private static TileObject f(WorldPoint worldPoint) {
        return TileObjects.getNearest(tileObject -> {
            boolean bl;
            WorldPoint lllllllllllllllllllIIlIlIlIlIllI;
            void lllllllllllllllllllIIlIlIlIlIlIl;
            if ((!O.lIIlIllIIIIlI(tileObject.getName().contains(lIlIllllII[lIllIIIIIl[205]]) ? 1 : 0) || O.lIIlIllIIIIII(tileObject.getName().contains(lIlIllllII[lIllIIIIIl[206]]) ? 1 : 0)) && O.lIIlIllIIIlll(lllllllllllllllllllIIlIlIlIlIlIl.getWorldLocation().distanceTo(lllllllllllllllllllIIlIlIlIlIllI), lIllIIIIIl[4])) {
                bl = lIllIIIIIl[1];
                0;
                if (1 <= 0) {
                    return ((0x48 ^ 0x1A ^ (0xDE ^ 0xB6)) & (0x2F ^ 0x4B ^ (0xEE ^ 0xB0) ^ -1)) != 0;
                }
            } else {
                bl = lIllIIIIIl[0];
            }
            return bl;
        });
    }

    private static void lIIlIlIllllll() {
        lIllIIIIIl = new int[251];
        O.lIllIIIIIl[0] = (0x1E ^ 9) & ~(0x27 ^ 0x30);
        O.lIllIIIIIl[1] = 1;
        O.lIllIIIIIl[2] = 0x73 ^ 0x5E;
        O.lIllIIIIIl[3] = 0x78 ^ 0x1F ^ (0x1E ^ 0x5B);
        O.lIllIIIIIl[4] = 2;
        O.lIllIIIIIl[5] = 3;
        O.lIllIIIIIl[6] = 3 ^ 7;
        O.lIllIIIIIl[7] = 0x83 ^ 0x84 ^ 2;
        O.lIllIIIIIl[8] = 0xFFFF9BCD & 0x77BA;
        O.lIllIIIIIl[9] = 0xFFFFDDD7 & 0x36FB;
        O.lIllIIIIIl[10] = 0 ^ 0x11;
        O.lIllIIIIIl[11] = 0x3A ^ 3 ^ (0x58 ^ 0x67);
        O.lIllIIIIIl[12] = 0x69 ^ 0x5A ^ (0x9E ^ 0xA7);
        O.lIllIIIIIl[13] = -(0xFFFFF3FB & 0x6C8D) & (0xFFFFFFEF & 0x7FDF);
        O.lIllIIIIIl[14] = 0xFFFFFFEC & 0x1F5B;
        O.lIllIIIIIl[15] = -(0xFFFFC7B3 & 0x784F) & (0xFFFFDF4B & Short.MAX_VALUE);
        O.lIllIIIIIl[16] = 0xFFFF8F6F & 0x7F9D;
        O.lIllIIIIIl[17] = -(0xFFFF990B & 0x67F5) & (0xFFFFFFDC & 0x2FEF);
        O.lIllIIIIIl[18] = -(0xFFFFEDBF & 0x1ECD) & (0xFFFFFDDD & 0x3FFF);
        O.lIllIIIIIl[19] = -(0x85 ^ 0xB4) & (0xFFFFFF7A & 0x1FFF);
        O.lIllIIIIIl[20] = 0x5F ^ 0x58;
        O.lIllIIIIIl[21] = 0xFFFFD1FF & 0x2F81;
        O.lIllIIIIIl[22] = 0xEC ^ 0xC2 ^ (0xB ^ 0x2D);
        O.lIllIIIIIl[23] = 0x36 ^ 0x3F;
        O.lIllIIIIIl[24] = 0xFFFFB6DF & 0x5DFF;
        O.lIllIIIIIl[25] = -(0x86 ^ 0xAC) & (0xFFFFBF7F & 0x6EFD);
        O.lIllIIIIIl[26] = 0xFFFFAED6 & 0x7F79;
        O.lIllIIIIIl[27] = 0xFFFFFFEF & 0x2E5E;
        O.lIllIIIIIl[28] = 0xFFFFAFDC & 0x7E6F;
        O.lIllIIIIIl[29] = -(0xFFFFDD2D & 0x72F3) & (0xFFFFFF77 & 0x7EFA);
        O.lIllIIIIIl[30] = -(0xFFFFEF37 & 0x50ED) & (0xFFFFEFFE & 0x7E6F);
        O.lIllIIIIIl[31] = 0xFFFFBFD0 & 0x6EEF;
        O.lIllIIIIIl[32] = 0x1A ^ 0x7A ^ (0x74 ^ 0x4C);
        O.lIllIIIIIl[33] = 0xFFFFFF2B & 0x4FDF;
        O.lIllIIIIIl[34] = 0xAE ^ 0xA1;
        O.lIllIIIIIl[35] = 0x67 ^ 0x6B;
        O.lIllIIIIIl[36] = 0xFFFFFFB8 & 0x3FF;
        O.lIllIIIIIl[37] = 0xF2 ^ 0xC0;
        O.lIllIIIIIl[38] = 0x13 ^ 0x18;
        O.lIllIIIIIl[39] = 0xDF ^ 0xC6;
        O.lIllIIIIIl[40] = -(0xFFFFDFDF & 0x6873) & (0xFFFFEFDB & 0x5F7F);
        O.lIllIIIIIl[41] = -(0xFFFFE353 & 0x5EED) & (0xFFFFEFFF & 0x5FEF);
        O.lIllIIIIIl[42] = 0x46 ^ 0x4B;
        O.lIllIIIIIl[43] = 0x8E ^ 0x80;
        O.lIllIIIIIl[44] = 9 + 24 - 15 + 123 ^ 136 + 150 - 159 + 30;
        O.lIllIIIIIl[45] = 22 + 43 - 11 + 78 ^ 62 + 149 - 148 + 87;
        O.lIllIIIIIl[46] = 0x29 ^ 0x3A;
        O.lIllIIIIIl[47] = 0xAA ^ 0xBE;
        O.lIllIIIIIl[48] = 0xD5 ^ 0xC0;
        O.lIllIIIIIl[49] = 0x6B ^ 0x70 ^ (0x50 ^ 1);
        O.lIllIIIIIl[50] = 0x36 ^ 0x20;
        O.lIllIIIIIl[51] = 0x3E ^ 8;
        O.lIllIIIIIl[52] = 7 ^ 0x44 ^ (0x1E ^ 0x4A);
        O.lIllIIIIIl[53] = 0x98 ^ 0x80;
        O.lIllIIIIIl[54] = 0xFFFFBF97 & 0x6778;
        O.lIllIIIIIl[55] = 0x2C ^ 0x36;
        O.lIllIIIIIl[56] = 0xBA ^ 0xA1;
        O.lIllIIIIIl[57] = 78 + 43 - 92 + 136 ^ 9 + 17 - -36 + 123;
        O.lIllIIIIIl[58] = 0x20 ^ 0x3D;
        O.lIllIIIIIl[59] = 0x38 ^ 0x76 ^ (0x1B ^ 0x4B);
        O.lIllIIIIIl[60] = 0x1D ^ 2 ^ (0x3A ^ 0x25) & ~(0xAE ^ 0xB1);
        O.lIllIIIIIl[61] = 0x6E ^ 0x64 ^ (0x2A ^ 0);
        O.lIllIIIIIl[62] = 0xBB ^ 0x9A;
        O.lIllIIIIIl[63] = 0x2F ^ 0x59 ^ (0x13 ^ 0x46);
        O.lIllIIIIIl[64] = 0xA8 ^ 0x8A ^ (0x7D ^ 0x7B);
        O.lIllIIIIIl[65] = 30 + 30 - 13 + 86 ^ 72 + 108 - 77 + 57;
        O.lIllIIIIIl[66] = 0xCE ^ 0x8F ^ (0x4D ^ 0x2A);
        O.lIllIIIIIl[67] = 0x9B ^ 0xBC;
        O.lIllIIIIIl[68] = 0xF5 ^ 0x91 ^ (0xE7 ^ 0xAB);
        O.lIllIIIIIl[69] = 88 + 187 - 153 + 70 ^ 9 + 82 - -58 + 0;
        O.lIllIIIIIl[70] = 0x6A ^ 0x7F ^ (0x55 ^ 0x69);
        O.lIllIIIIIl[71] = 0x99 ^ 0xB3;
        O.lIllIIIIIl[72] = 0x10 ^ 0x3B;
        O.lIllIIIIIl[73] = 0x34 ^ 9 ^ (0x2B ^ 0x3A);
        O.lIllIIIIIl[74] = 0x2F ^ 0x1C ^ (0x34 ^ 0x29);
        O.lIllIIIIIl[75] = 0xEE ^ 0xC1;
        O.lIllIIIIIl[76] = 0x9F ^ 0xAF;
        O.lIllIIIIIl[77] = 0x31 ^ 0x5D ^ (0xC4 ^ 0x99);
        O.lIllIIIIIl[78] = 0x5B ^ 0x6A ^ 2;
        O.lIllIIIIIl[79] = 0x33 ^ 7;
        O.lIllIIIIIl[80] = 0x3E ^ 0xB;
        O.lIllIIIIIl[81] = 0x2C ^ 0x1B;
        O.lIllIIIIIl[82] = 145 + 94 - 208 + 115 ^ 64 + 86 - 92 + 112;
        O.lIllIIIIIl[83] = 0x7F ^ 0x46;
        O.lIllIIIIIl[84] = 0xFFFFBFF6 & 0x4AF9;
        O.lIllIIIIIl[85] = 3 + 169 - 36 + 44 ^ 130 + 128 - 149 + 33;
        O.lIllIIIIIl[86] = 0x71 ^ 0x6F ^ (0x1A ^ 0x3F);
        O.lIllIIIIIl[87] = 0x5C ^ 0x27 ^ (0xFC ^ 0xBB);
        O.lIllIIIIIl[88] = 26 + 107 - 47 + 76 ^ 2 + 100 - 65 + 122;
        O.lIllIIIIIl[89] = 0xBE ^ 0x80;
        O.lIllIIIIIl[90] = 94 + 44 - 70 + 101 ^ 126 + 71 - 185 + 138;
        O.lIllIIIIIl[91] = 0x1B ^ 0x38 ^ (0xA ^ 0x69);
        O.lIllIIIIIl[92] = 0x18 ^ 0x59;
        O.lIllIIIIIl[93] = 7 ^ 0x45;
        O.lIllIIIIIl[94] = 0x11 ^ 0x52;
        O.lIllIIIIIl[95] = 7 ^ 0x43;
        O.lIllIIIIIl[96] = 0xC5 ^ 0x93 ^ (0xA2 ^ 0xB1);
        O.lIllIIIIIl[97] = 0x15 ^ 0x53;
        O.lIllIIIIIl[98] = 82 + 36 - 5 + 18 ^ 64 + 178 - 112 + 66;
        O.lIllIIIIIl[99] = 196 + 174 - 189 + 70 ^ 92 + 139 - 216 + 164;
        O.lIllIIIIIl[100] = 127 + 9 - 0 + 96 ^ 91 + 56 - 23 + 37;
        O.lIllIIIIIl[101] = 0xBF ^ 0xB6 ^ (0x7E ^ 0x3C);
        O.lIllIIIIIl[102] = 123 + 39 - -24 + 6 ^ 19 + 106 - 34 + 49;
        O.lIllIIIIIl[103] = 0xDA ^ 0x97;
        O.lIllIIIIIl[104] = 204 + 75 - 79 + 49 ^ 126 + 169 - 268 + 156;
        O.lIllIIIIIl[105] = 0x6F ^ 0x20;
        O.lIllIIIIIl[106] = 81 + 201 - 112 + 74 ^ 8 + 79 - 64 + 141;
        O.lIllIIIIIl[107] = 1 ^ 0x50;
        O.lIllIIIIIl[108] = 1 ^ (6 ^ 0x55);
        O.lIllIIIIIl[109] = 0x27 ^ 0x3A ^ (0x1F ^ 0x51);
        O.lIllIIIIIl[110] = 77 + 73 - -26 + 29 ^ 82 + 45 - 120 + 146;
        O.lIllIIIIIl[111] = 0x90 ^ 0xC4 ^ 2;
        O.lIllIIIIIl[112] = 0x21 ^ 0x53 ^ (0x4B ^ 0x6E);
        O.lIllIIIIIl[113] = 0xCD ^ 0x94;
        O.lIllIIIIIl[114] = 0x3C ^ 0x66;
        O.lIllIIIIIl[115] = 134 + 136 - 128 + 67 ^ 9 + 19 - -102 + 8;
        O.lIllIIIIIl[116] = 0x61 ^ 0x4A ^ (0x66 ^ 0x11);
        O.lIllIIIIIl[117] = 68 + 88 - -21 + 20 ^ 103 + 118 - 87 + 18;
        O.lIllIIIIIl[118] = 0x2C ^ 0x72;
        O.lIllIIIIIl[119] = 0x46 ^ 0x6D ^ (0xF3 ^ 0x87);
        O.lIllIIIIIl[120] = 0x1B ^ 0x7B;
        O.lIllIIIIIl[121] = 167 + 11 - 23 + 52 ^ 118 + 168 - 112 + 0;
        O.lIllIIIIIl[122] = 0x5A ^ 0x38;
        O.lIllIIIIIl[123] = 0xC ^ 0x6F;
        O.lIllIIIIIl[124] = 0x4B ^ 0x2F;
        O.lIllIIIIIl[125] = 0xCB ^ 0xB6 ^ (0x17 ^ 0xF);
        O.lIllIIIIIl[126] = 0xFFFFFFF1 & 0x347F;
        O.lIllIIIIIl[127] = -(0xFFFFF3C9 & 0x4FBF) & (0xFFFFF7F9 & 0x7FFE);
        O.lIllIIIIIl[128] = -(0xFFFFE5DD & 0x1BA3) & (0xFFFFF7FF & 0x3DEF);
        O.lIllIIIIIl[129] = -(0xFFFFFF0E & 0x42FD) & (0xFFFFF7FF & 0x7E7F);
        O.lIllIIIIIl[130] = 0xFFFFBCF7 & 0x777B;
        O.lIllIIIIIl[131] = 0xFFFFBCF6 & 0x777B;
        O.lIllIIIIIl[132] = 0xFFFFFA7D & 0x5793;
        O.lIllIIIIIl[133] = 0x38 ^ 0x5E;
        O.lIllIIIIIl[134] = -(15 + 123 - 76 + 67) & (0xFFFFF5FC & 0x1FFF);
        O.lIllIIIIIl[135] = 0xFFFFF5EA & 0x6BBD;
        O.lIllIIIIIl[136] = 0xFFFFABED & 0x57FA;
        O.lIllIIIIIl[137] = 0xFFFFCFF7 & 0x338C;
        O.lIllIIIIIl[138] = -(0xFFFFB7BF & 0x5C41) & (0xFFFF9FB6 & 0x77FF);
        O.lIllIIIIIl[139] = 0xFFFFCFDF & 0x37BE;
        O.lIllIIIIIl[140] = 0xFFFFEECE & 0x3FFB;
        O.lIllIIIIIl[141] = -(9 ^ 0x2B) & (0xFFFFEDFF & 0x777F);
        O.lIllIIIIIl[142] = 0x3F ^ 0 ^ (0x65 ^ 0x3D);
        O.lIllIIIIIl[143] = 0x6A ^ 2;
        O.lIllIIIIIl[144] = 0x14 ^ 0x7D;
        O.lIllIIIIIl[145] = 0xE7 ^ 0x90 ^ (0x35 ^ 0x28);
        O.lIllIIIIIl[146] = 0xAD ^ 0xC6;
        O.lIllIIIIIl[147] = 0xC5 ^ 0x95 ^ (0xFC ^ 0xC0);
        O.lIllIIIIIl[148] = 0x53 ^ 0x3E;
        O.lIllIIIIIl[149] = 0x6B ^ 5;
        O.lIllIIIIIl[150] = 0xB8 ^ 0x83 ^ (0xCC ^ 0x98);
        O.lIllIIIIIl[151] = 0x66 ^ 0x16;
        O.lIllIIIIIl[152] = 0x6B ^ 0x1A;
        O.lIllIIIIIl[153] = 5 + 109 - -12 + 93 ^ 111 + 74 - 87 + 71;
        O.lIllIIIIIl[154] = 0x8D ^ 0x9D ^ (0xE2 ^ 0x81);
        O.lIllIIIIIl[155] = 0xD1 ^ 0xA5;
        O.lIllIIIIIl[156] = 0xE8 ^ 0x9D;
        O.lIllIIIIIl[157] = 0x5C ^ 0x2A;
        O.lIllIIIIIl[158] = 93 + 48 - -19 + 45 ^ 162 + 151 - 246 + 119;
        O.lIllIIIIIl[159] = 0xA ^ 0x72;
        O.lIllIIIIIl[160] = 0xE2 ^ 0x9B;
        O.lIllIIIIIl[161] = 0x1E ^ 0x36 ^ (0x56 ^ 4);
        O.lIllIIIIIl[162] = 12 + 207 - 136 + 143 ^ 59 + 93 - 140 + 141;
        O.lIllIIIIIl[163] = 0x76 ^ 0x4E ^ (0xCA ^ 0x8E);
        O.lIllIIIIIl[164] = 0x1B ^ 0x45 ^ (0x44 ^ 0x67);
        O.lIllIIIIIl[165] = 0x56 ^ 0x28;
        O.lIllIIIIIl[166] = 84 + 107 - 95 + 31;
        O.lIllIIIIIl[167] = (0xA0 ^ 0x89) + (0x4A ^ 0x2E) - (0x59 ^ 0x7A) + (0x4F ^ 0x59);
        O.lIllIIIIIl[168] = 96 + 123 - 211 + 121;
        O.lIllIIIIIl[169] = (0xA4 ^ 0x94) + (0xCF ^ 0xB3) - (39 + 35 - -81 + 10) + (0x6A ^ 0x11);
        O.lIllIIIIIl[170] = 27 + 65 - 24 + 63;
        O.lIllIIIIIl[171] = 30 + 97 - 80 + 85;
        O.lIllIIIIIl[172] = (0xA6 ^ 0xC6) + (0xC ^ 0xB) - (0x39 ^ 0x25) + (0xB7 ^ 0x8D);
        O.lIllIIIIIl[173] = (0x87 ^ 0xC5) + (0xE8 ^ 0xAA) - (0x86 ^ 0xAB) + (0x4D ^ 0x62);
        O.lIllIIIIIl[174] = 25 + 7 - 25 + 128;
        O.lIllIIIIIl[175] = (2 ^ 0x1A) + (53 + 77 - 6 + 4) - (0xBA ^ 0x8B) + (0xB9 ^ 0x98);
        O.lIllIIIIIl[176] = (0xE6 ^ 0xB9) + (0x75 ^ 0x53) - (0x64 ^ 0x6B) + (0 ^ 0x13);
        O.lIllIIIIIl[177] = 21 + 93 - 32 + 56;
        O.lIllIIIIIl[178] = 3 + (0x9D ^ 0xAF) - (0xA4 ^ 0xA0) + (0xE9 ^ 0xB3);
        O.lIllIIIIIl[179] = (0xAF ^ 0xB8) + (0x97 ^ 0xC2) - -2 + (0x8C ^ 0x92);
        O.lIllIIIIIl[180] = 101 + 37 - 22 + 25;
        O.lIllIIIIIl[181] = (0xF1 ^ 0x8D) + (0xAE ^ 0xBA) - (0x18 ^ 0x30) + (0x5C ^ 0x7A);
        O.lIllIIIIIl[182] = 96 + 109 - 188 + 126;
        O.lIllIIIIIl[183] = 4 + 100 - 17 + 57;
        O.lIllIIIIIl[184] = (0xF3 ^ 0x8F) + (92 + 19 - -7 + 10) - (127 + 82 - 165 + 85) + (0x56 ^ 0x40);
        O.lIllIIIIIl[185] = (0x27 ^ 0) + (121 + 38 - 28 + 6) - (0xE8 ^ 0xA7) + (0x61 ^ 0x50);
        O.lIllIIIIIl[186] = (0x55 ^ 2) + (0xC7 ^ 0xA4) - (0x4D ^ 0x14) + (0x63 ^ 0x51);
        O.lIllIIIIIl[187] = (0x33 ^ 0x2B) + (0xDD ^ 0x98) - -(0x6D ^ 0x48) + (0x64 ^ 0x76);
        O.lIllIIIIIl[188] = 61 + 58 - 89 + 119;
        O.lIllIIIIIl[189] = (0xFD ^ 0xA0) + (0x50 ^ 0x58) - (0x43 ^ 0x4F) + (0x3B ^ 6);
        O.lIllIIIIIl[190] = (0x13 ^ 0x15) + (101 + 80 - 55 + 1) - (0x76 ^ 1) + (74 + 63 - 15 + 15);
        O.lIllIIIIIl[191] = 37 + 48 - -31 + 36;
        O.lIllIIIIIl[192] = 67 + 37 - 41 + 90;
        O.lIllIIIIIl[193] = (0x92 ^ 0xA4) + (0x82 ^ 0x8B) - -(0x64 ^ 0x36) + (0xA ^ 3);
        O.lIllIIIIIl[194] = 0 + 73 - -22 + 56 + (0x71 ^ 0x69) - (0x13 ^ 0x43) + (0x80 ^ 0xBC);
        O.lIllIIIIIl[195] = (0x3D ^ 0x49) + (0x86 ^ 0xA1) - (14 + 118 - 118 + 135) + (19 + 112 - -18 + 1);
        O.lIllIIIIIl[196] = 3 + (0x2D ^ 0x50) - (0x60 ^ 0xD) + (45 + 67 - 72 + 98);
        O.lIllIIIIIl[197] = 68 + 57 - -33 + 0;
        O.lIllIIIIIl[198] = 110 + 25 - 106 + 130;
        O.lIllIIIIIl[199] = 27 + 54 - -32 + 47;
        O.lIllIIIIIl[200] = (0x5F ^ 0x14) + (0xED ^ 0xA6) - (0x49 ^ 0x50) + (0x7D ^ 0x59);
        O.lIllIIIIIl[201] = 161 + 139 - 197 + 59;
        O.lIllIIIIIl[202] = (0x80 ^ 0x87) + (0x54 ^ 0x6F) - -(8 ^ 4) + (0x95 ^ 0xC0);
        O.lIllIIIIIl[203] = (4 ^ 0x4E) + (40 + 15 - 22 + 108) - (15 + 34 - -72 + 32) + (0xCB ^ 0xAD);
        O.lIllIIIIIl[204] = 41 + 63 - -15 + 46;
        O.lIllIIIIIl[205] = 35 + 103 - 76 + 104;
        O.lIllIIIIIl[206] = 17 + 135 - -6 + 9;
        O.lIllIIIIIl[207] = 30 + 36 - 40 + 142;
        O.lIllIIIIIl[208] = 133 + 3 - -20 + 13;
        O.lIllIIIIIl[209] = (0x69 ^ 0x1B) + (44 + 128 - 171 + 156) - (92 + 115 - 36 + 19) + (0xE2 ^ 0xBB);
        O.lIllIIIIIl[210] = (0x55 ^ 0x3C) + (2 + 14 - -40 + 91) - (36 + 163 - 151 + 137) + (0xF5 ^ 0x9D);
        O.lIllIIIIIl[211] = 5 + 3 - -115 + 49;
        O.lIllIIIIIl[212] = 40 + 81 - 20 + 38 + (0x86 ^ 0x8E) - (0x91 ^ 0xC5) + (0x40 ^ 0x2E);
        O.lIllIIIIIl[213] = 76 + 91 - 65 + 72;
        O.lIllIIIIIl[214] = 86 + 94 - 45 + 40;
        O.lIllIIIIIl[215] = (0x19 ^ 0x2A) + (0x6B ^ 0x71) - (0x39 ^ 0x1A) + (118 + 22 - 82 + 76);
        O.lIllIIIIIl[216] = 33 + 52 - -48 + 3 + (0xA5 ^ 0xA2) - (0xFA ^ 0xA7) + (47 + 16 - 53 + 117);
        O.lIllIIIIIl[217] = 95 + 158 - 141 + 66;
        O.lIllIIIIIl[218] = 167 + 94 - 178 + 96;
        O.lIllIIIIIl[219] = 88 + 118 - 109 + 83;
        O.lIllIIIIIl[220] = (0x1D ^ 0x6B) + (0xF4 ^ 0xC4) - (0x92 ^ 0xC3) + (0x24 ^ 0x44);
        O.lIllIIIIIl[221] = 177 + 107 - 179 + 77;
        O.lIllIIIIIl[222] = 170 + 90 - 159 + 82;
        O.lIllIIIIIl[223] = (0x8D ^ 0x8B) + (123 + 121 - 108 + 12) - (0x67 ^ 0x58) + (0xE ^ 0x53);
        O.lIllIIIIIl[224] = 131 + 130 - 225 + 107 + (0x87 ^ 0xA3) - (0x3F ^ 0x49) + (0xBF ^ 0xC3);
        O.lIllIIIIIl[225] = (0x2C ^ 0x7C) + (117 + 120 - 98 + 5) - (46 + 117 - 75 + 41) + (0x1F ^ 0x44);
        O.lIllIIIIIl[226] = 151 + 150 - 283 + 169;
        O.lIllIIIIIl[227] = 74 + 14 - -31 + 58 + (0xDD ^ 0x9F) - (0x94 ^ 0xA8) + (0xBD ^ 0xB8);
        O.lIllIIIIIl[228] = 96 + 167 - 224 + 129 + (0x99 ^ 0xC0) - (55 + 22 - -43 + 11) + (5 ^ 0x3A);
        O.lIllIIIIIl[229] = 118 + 112 - 161 + 121;
        O.lIllIIIIIl[230] = (0x22 ^ 0x6D) + (71 + 49 - -8 + 2) - (0x92 ^ 0xC5) + (0xF4 ^ 0xB1);
        O.lIllIIIIIl[231] = 106 + 61 - 8 + 6 + (71 + 49 - 9 + 38) - (213 + 9 - 89 + 84) + (0x9E ^ 0xC1);
        O.lIllIIIIIl[232] = 144 + 134 - 166 + 81;
        O.lIllIIIIIl[233] = (0x4A ^ 0x7F) + (0x53 ^ 0x76) - -(0xD9 ^ 0xB8) + (8 ^ 0xF);
        O.lIllIIIIIl[234] = 185 + 164 - 220 + 66;
        O.lIllIIIIIl[235] = 145 + 175 - 256 + 132;
        O.lIllIIIIIl[236] = (0xDF ^ 0x9E) + (0xAA ^ 0xAE) - -(0x21 ^ 0x57) + (0x4A ^ 0x40);
        O.lIllIIIIIl[237] = 31 + 85 - 78 + 96 + (132 + 101 - 134 + 49) - (167 + 57 - 75 + 104) + (93 + 57 - 31 + 50);
        O.lIllIIIIIl[238] = 35 + 3 - -131 + 30;
        O.lIllIIIIIl[239] = 59 + 153 - 204 + 192;
        O.lIllIIIIIl[240] = 19 + 146 - 135 + 131 + (16 + 138 - 86 + 97) - (14 + 6 - 6 + 117) + (0x53 ^ 0x55);
        O.lIllIIIIIl[241] = 173 + 6 - 113 + 136;
        O.lIllIIIIIl[242] = 152 + 60 - 9 + 0;
        O.lIllIIIIIl[243] = (0xE5 ^ 0xBB) + (84 + 75 - 16 + 53) - (0x7D ^ 0x1A) + (0x15 ^ 4);
        O.lIllIIIIIl[244] = 61 + 18 - -66 + 60;
        O.lIllIIIIIl[245] = 1 + 107 - 34 + 78 + (181 + 25 - 97 + 83) - (114 + 26 - 136 + 155) + (0x2E ^ 0x3B);
        O.lIllIIIIIl[246] = 113 + 155 - 169 + 108;
        O.lIllIIIIIl[247] = 0xFFFFD2BF & 0x7FDA;
        O.lIllIIIIIl[248] = 71 + 17 - -15 + 29 + (0x7E ^ 0x5D) - (0xF0 ^ 0x8E) + (36 + 19 - -106 + 6);
        O.lIllIIIIIl[249] = 173 + 137 - 213 + 112;
        O.lIllIIIIIl[250] = 151 + 88 - 33 + 4;
    }

    @Override
    public int ad() {
        try {
            O.cV();
            0;
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (null != null) {
            return (0x22 ^ 0x32) & ~(0xD1 ^ 0xC1);
        }
        return lIllIIIIIl[124];
    }

    static {
        O.lIIlIlIllllll();
        O.lIIlIlIlIlIlI();
        bp = new ArrayList<d>();
        jr = lIllIIIIIl[247];
        js = lIllIIIIIl[21];
        jy = lIllIIIIIl[0];
        jA = new ArrayList();
        jB = new ArrayList();
        jC = null;
        jD = null;
        jE = null;
        jF = null;
        jG = null;
        jH = null;
        jI = null;
        jJ = null;
        jK = null;
        jL = null;
        jM = null;
        jN = null;
        jO = null;
        jP = null;
        jQ = null;
        jR = null;
        jS = null;
        jT = null;
        jU = null;
        jV = null;
        jW = null;
        kr = lIlIllllII[lIllIIIIIl[248]];
        h = lIlIllllII[lIllIIIIIl[249]];
    }
}

