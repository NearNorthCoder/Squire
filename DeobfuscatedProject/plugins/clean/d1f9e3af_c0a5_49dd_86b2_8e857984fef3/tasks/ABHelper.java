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
package gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks;

import gg.squire.account.AccBuilderEasyClues;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.W;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.AHelper;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.BHelper;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.DHelper;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.EHelper;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.FHelper;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.GHelper;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.IHelper;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.OHelper;
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

public class ABHelper
implements W {
    static  WorldPoint lw;
    
    static  WorldPoint kR;
    static  WorldPoint ls;
    static  WorldPoint lk;
    public static  int kx;
    static  WorldPoint lo;
    static  WorldPoint kW;
    public static  int bZ;
    static  String cc;
    static  WorldPoint lf;
    static  WorldPoint lA;
    public static  int ky;
    static  WorldPoint lu;
    static  WorldPoint kV;
    static  String h;
    public static  boolean bt;
    static  WorldPoint lb;
    static  ArrayList<WorldPoint> kL;
    static  WorldPoint lv;
    static  WorldPoint lr;
    static  WorldPoint lq;
    static  WorldPoint kQ;
    static  WorldPoint lz;
    static  WorldPoint ly;
    static  WorldPoint lp;
    static  boolean kK;
    
    static  WorldPoint kO;
    static  ArrayList<WorldPoint> kM;
    static  WorldPoint lx;
    public static  List<d> bv;
    public static  boolean bW;
    static  WorldPoint le;
    static  WorldPoint li;
    static  WorldPoint ll;
    static  WorldPoint lB;
    static  WorldPoint lt;
    static  WorldPoint kX;
    static  WorldPoint kP;
    static  WorldPoint la;
    static  WorldPoint lm;
    static  WorldPoint kT;
    static  WorldPoint kU;
    static  WorldPoint lh;
    static  WorldPoint lj;
    static  WorldPoint kY;
    static  WorldPoint kN;
    public static  int kz;
    static  WorldPoint ln;
    static  WorldPoint lc;
    static  WorldPoint kS;
    static  WorldPoint lg;
    static  WorldPoint ld;
    static  WorldPoint kZ;

    private static boolean dx() {
        return Static.getClient().isInInstancedRegion();
    }

    @Override
    public String U() {
        return h + cc;
    }

    private static boolean lllllIlIlII(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean dz() {
        boolean bl;
        int lIIIIlIIllllllI;
        int n2 = lIIlIlIll[0];
        int[] nArray = new int[lIIlIlIll[1]];
        nArray[ab.lIIlIlIll[0]] = lIIlIlIll[129];
        if (ab.lllllIlIIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
            int[] nArray2 = new int[lIIlIlIll[1]];
            nArray2[ab.lIIlIlIll[0]] = lIIlIlIll[129];
            lIIIIlIIllllllI = n2 + Inventory.getFirst((int[])nArray2).getQuantity();
        }
        int[] nArray3 = new int[lIIlIlIll[1]];
        nArray3[ab.lIIlIlIll[0]] = lIIlIlIll[130];
        if (ab.lllllIlIIIl(Inventory.contains((int[])nArray3) ? 1 : 0)) {
            int[] nArray4 = new int[lIIlIlIll[1]];
            nArray4[ab.lIIlIlIll[0]] = lIIlIlIll[130];
            lIIIIlIIllllllI += Inventory.getFirst((int[])nArray4).getQuantity();
        }
        int[] nArray5 = new int[lIIlIlIll[1]];
        nArray5[ab.lIIlIlIll[0]] = lIIlIlIll[131];
        if (ab.lllllIlIIIl(Inventory.contains((int[])nArray5) ? 1 : 0)) {
            int[] nArray6 = new int[lIIlIlIll[1]];
            nArray6[ab.lIIlIlIll[0]] = lIIlIlIll[131];
            lIIIIlIIllllllI += Inventory.getFirst((int[])nArray6).getQuantity();
        }
        if (ab.lllllIlIlII(lIIIIlIIllllllI, lIIlIlIll[124])) {
            bl = lIIlIlIll[1];

            if (1 != 1) {
                return false;
            }
        } else {
            bl = lIIlIlIll[0];
        }
        return bl;
    }

    public static void ds() {
        if (ab.lllllIlIIIl(bt ? 1 : 0)) {
            AccBuilderEasyClues.c = lIIlIlIII[lIIlIlIll[0]];
            b.a(bv);
            if (ab.lllllIlIIlI(bv.size(), lIIlIlIll[1])) {
                System.out.println(lIIlIlIII[lIIlIlIll[1]]);
                bt = lIIlIlIll[0];
            }
        }
        if (ab.lllllIlIIll(bt ? 1 : 0) && ab.lllllIlIIlI(Skills.getLevel((Skill)Skill.FARMING), lIIlIlIll[2])) {
            if (ab.lllllIlIIlI(Skills.getLevel((Skill)Skill.FARMING), lIIlIlIll[3])) {
                cc = lIIlIlIII[lIIlIlIll[4]];
                o.ay();
            }
            if (ab.lllllIlIIll(ab.ABHelper() ? 1 : 0) && ab.lllllIlIlII(Skills.getLevel((Skill)Skill.FARMING), lIIlIlIll[3])) {
                cc = lIIlIlIII[lIIlIlIll[5]];
                BankLocation lIIIIlIlIIIlIlI = BankLocation.getNearest();
                if (ab.lllllIlIlIl(lIIIIlIlIIIlIlI) && ab.lllllIlIIll(lIIIIlIlIIIlIlI.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIIlIlIII[lIIlIlIll[6]];
                    if (ab.lllllIlIIIl(Static.getClient().isInInstancedRegion() ? 1 : 0)) {
                        Time.sleepTicks((int)lIIlIlIll[6]);

                        if (ab.lllllIlIIIl(ab.ABHelper() ? 1 : 0)) {
                            return;
                        }
                    }
                    a.a(lIIIIlIlIIIlIlI);
                }
                if (ab.lllllIlIlIl(lIIIIlIlIIIlIlI) && ab.lllllIlIIIl(lIIIIlIlIIIlIlI.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIIlIlIII[lIIlIlIll[7]];
                    if (ab.lllllIlIIll(Bank.isOpen() ? 1 : 0)) {
                        a.a();
                        Time.sleepUntil(() -> Bank.isOpen(), (int)lIIlIlIll[8]);

                    }
                    if (ab.lllllIlIIIl(Bank.isOpen() ? 1 : 0)) {
                        if (ab.lllllIlIllI(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks((int)lIIlIlIll[1]);

                        }
                        if (ab.lllllIlIllI(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks((int)lIIlIlIll[4]);

                        }
                    }
                    int[] nArray = new int[lIIlIlIll[1]];
                    nArray[ab.lIIlIlIll[0]] = lIIlIlIll[9];
                    if (ab.lllllIlIIIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                        int[] nArray2 = new int[lIIlIlIll[1]];
                        nArray2[ab.lIIlIlIll[0]] = lIIlIlIll[9];
                        if (ab.lllllIlIIlI(Bank.getFirst((int[])nArray2).getQuantity(), lIIlIlIll[10])) {
                            ab.af();
                            System.out.println(lIIlIlIII[lIIlIlIll[11]]);
                            bt = lIIlIlIll[1];
                            return;
                        }
                    }
                    int[] nArray3 = new int[lIIlIlIll[12]];
                    nArray3[ab.lIIlIlIll[0]] = lIIlIlIll[13];
                    nArray3[ab.lIIlIlIll[1]] = lIIlIlIll[14];
                    nArray3[ab.lIIlIlIll[4]] = lIIlIlIll[15];
                    nArray3[ab.lIIlIlIll[5]] = lIIlIlIll[16];
                    nArray3[ab.lIIlIlIll[6]] = lIIlIlIll[17];
                    nArray3[ab.lIIlIlIll[7]] = lIIlIlIll[18];
                    nArray3[ab.lIIlIlIll[11]] = lIIlIlIll[19];
                    nArray3[ab.lIIlIlIll[20]] = lIIlIlIll[21];
                    nArray3[ab.lIIlIlIll[22]] = lIIlIlIll[9];
                    nArray3[ab.lIIlIlIll[23]] = lIIlIlIll[24];
                    if (ab.lllllIlIIll(e.b(nArray3) ? 1 : 0)) {
                        ab.af();
                        System.out.println(lIIlIlIII[lIIlIlIll[20]]);
                        bt = lIIlIlIll[1];
                        return;
                    }
                    int[] nArray4 = new int[lIIlIlIll[12]];
                    nArray4[ab.lIIlIlIll[0]] = lIIlIlIll[13];
                    nArray4[ab.lIIlIlIll[1]] = lIIlIlIll[14];
                    nArray4[ab.lIIlIlIll[4]] = lIIlIlIll[15];
                    nArray4[ab.lIIlIlIll[5]] = lIIlIlIll[16];
                    nArray4[ab.lIIlIlIll[6]] = lIIlIlIll[17];
                    nArray4[ab.lIIlIlIll[7]] = lIIlIlIll[18];
                    nArray4[ab.lIIlIlIll[11]] = lIIlIlIll[19];
                    nArray4[ab.lIIlIlIll[20]] = lIIlIlIll[21];
                    nArray4[ab.lIIlIlIll[22]] = lIIlIlIll[9];
                    nArray4[ab.lIIlIlIll[23]] = lIIlIlIll[24];
                    if (ab.lllllIlIIIl(e.b(nArray4) ? 1 : 0)) {
                        a.a(lIIlIlIll[25], lIIlIlIll[1]);
                        a.a(lIIlIlIll[26], lIIlIlIll[1]);
                        a.a(lIIlIlIll[27], lIIlIlIll[1]);
                        a.a(lIIlIlIll[28], lIIlIlIll[1]);
                        a.a(lIIlIlIll[29], lIIlIlIll[1]);
                        a.a(lIIlIlIll[30], lIIlIlIll[1]);
                        a.a(lIIlIlIll[31], lIIlIlIll[1]);
                        int[] nArray5 = new int[lIIlIlIll[1]];
                        nArray5[ab.lIIlIlIll[0]] = lIIlIlIll[25];
                        if (ab.lllllIlIIll(Inventory.contains((int[])nArray5) ? 1 : 0)) {
                            int[] nArray6 = new int[lIIlIlIll[1]];
                            nArray6[ab.lIIlIlIll[0]] = lIIlIlIll[25];
                            if (ab.lllllIlIIll(Equipment.contains((int[])nArray6) ? 1 : 0)) {
                                int[] nArray7 = new int[lIIlIlIll[1]];
                                nArray7[ab.lIIlIlIll[0]] = lIIlIlIll[25];
                                if (ab.lllllIlIIll(Bank.contains((int[])nArray7) ? 1 : 0)) {
                                    a.a(lIIlIlIll[32], lIIlIlIll[1]);
                                }
                            }
                        }
                        a.a(lIIlIlIll[17], lIIlIlIll[1]);
                        e.l(lIIlIlIll[25]);
                        e.l(lIIlIlIll[26]);
                        e.l(lIIlIlIll[27]);
                        e.l(lIIlIlIll[28]);
                        e.l(lIIlIlIll[29]);
                        Time.sleepTicks((int)lIIlIlIll[1]);

                        e.l(lIIlIlIll[31]);
                        e.l(lIIlIlIll[33]);
                        e.l(lIIlIlIll[30]);
                        e.l(lIIlIlIll[32]);
                        e.l(lIIlIlIll[17]);
                        Time.sleepTicks((int)lIIlIlIll[5]);

                        if (ab.lllllIlIIll(Bank.isOpen() ? 1 : 0)) {
                            a.a();
                            Time.sleepTicks((int)lIIlIlIll[11]);

                        }
                        if (ab.lllllIlIIIl(Bank.isOpen() ? 1 : 0)) {
                            if (ab.lllllIlIIlI(Skills.getLevel((Skill)Skill.FARMING), lIIlIlIll[3])) {
                                a.a(lIIlIlIll[13], lIIlIlIll[12]);
                                a.a(lIIlIlIll[14], lIIlIlIll[12]);
                                a.a(lIIlIlIll[19], lIIlIlIll[12]);
                                a.a(lIIlIlIll[15], lIIlIlIll[12]);
                                a.b(f.bf, lIIlIlIll[1]);
                                a.b(f.aO, lIIlIlIll[1]);
                                a.a(lIIlIlIll[18], lIIlIlIll[7]);
                                a.a(lIIlIlIll[21], lIIlIlIll[34]);
                            }
                            if (ab.lllllIlIlII(Skills.getLevel((Skill)Skill.FARMING), lIIlIlIll[3])) {
                                a.a(lIIlIlIll[9], lIIlIlIll[35]);
                                a.a(lIIlIlIll[36], lIIlIlIll[1]);
                                a.a(lIIlIlIll[24], lIIlIlIll[1]);
                            }
                        }
                    }
                }
            }
            if (ab.lllllIlIIIl(ab.ABHelper() ? 1 : 0)) {
                String[] stringArray = new String[lIIlIlIll[1]];
                stringArray[ab.lIIlIlIll[0]] = lIIlIlIII[lIIlIlIll[22]];
                if (ab.lllllIlIIIl(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    String[] stringArray2 = new String[lIIlIlIll[1]];
                    stringArray2[ab.lIIlIlIll[0]] = lIIlIlIII[lIIlIlIll[23]];
                    Inventory.getFirst((String[])stringArray2).interact(lIIlIlIII[lIIlIlIll[12]]);
                }
                if (ab.lllllIlIIIl(Inventory.contains((int[])f.aV) ? 1 : 0) && ab.lllllIlIIlI(Movement.getRunEnergy(), lIIlIlIll[37])) {
                    Inventory.getFirst((int[])f.aV).interact(lIIlIlIII[lIIlIlIll[38]]);
                    Time.sleepTicks((int)lIIlIlIll[1]);

                }
                if (ab.lllllIlIlll(Movement.getRunEnergy(), lIIlIlIll[39]) && ab.lllllIlIIll(Movement.isRunEnabled() ? 1 : 0)) {
                    Movement.toggleRun();
                }
                if (ab.lllllIlIlII(Skills.getLevel((Skill)Skill.FARMING), lIIlIlIll[3])) {
                    ab.dt();
                }
            }
        }
    }

    private static boolean lllllIlIIlI(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean dy() {
        if (ab.lllllIlIlII(Skills.getLevel((Skill)Skill.FARMING), lIIlIlIll[49])) {
            int[] nArray = new int[lIIlIlIll[1]];
            nArray[ab.lIIlIlIll[0]] = lIIlIlIll[126];
            return Inventory.contains((int[])nArray);
        }
        if (ab.lllllIlIlII(Skills.getLevel((Skill)Skill.FARMING), lIIlIlIll[51]) && ab.lllllIlIIlI(Skills.getLevel((Skill)Skill.FARMING), lIIlIlIll[49])) {
            int[] nArray = new int[lIIlIlIll[1]];
            nArray[ab.lIIlIlIll[0]] = lIIlIlIll[127];
            return Inventory.contains((int[])nArray);
        }
        int[] nArray = new int[lIIlIlIll[1]];
        nArray[ab.lIIlIlIll[0]] = lIIlIlIll[128];
        return Inventory.contains((int[])nArray);
    }

    private static boolean lllllIlIIIl(int n2) {
        return n2 != 0;
    }

    private static boolean lllllIllIIl(Object object) {
        return object == null;
    }

    private static boolean lllllIlIllI(int n2) {
        return n2 > 0;
    }

    private static void dv() {
        if (ab.lllllIllIIl(ab.e(li))) {
            TileObject tileObject2;
            int[] nArray = new int[lIIlIlIll[1]];
            nArray[ab.lIIlIlIll[0]] = lIIlIlIll[9];
            if (ab.lllllIlIIIl(Inventory.contains((int[])nArray) ? 1 : 0) && ab.lllllIlIlIl(tileObject2 = TileObjects.getNearest(tileObject -> {
                int n2;
                if (ab.lllllIlIIIl(tileObject.getName().contains(lIIlIlIII[lIIlIlIll[204]]) ? 1 : 0) && ab.lllllIllIII(tileObject.getWorldLocation().distanceTo(kN), lIIlIlIll[12])) {
                    n2 = lIIlIlIll[1];

                    if (((0x11 ^ 0x19) & ~(0x35 ^ 0x3D)) != 0) {
                        return false;
                    }
                } else {
                    n2 = lIIlIlIll[0];
                }
                return n2 != 0;
            }))) {
                AccBuilderEasyClues.c = lIIlIlIII[lIIlIlIll[87]];
                int[] nArray2 = new int[lIIlIlIll[1]];
                nArray2[ab.lIIlIlIll[0]] = lIIlIlIll[9];
                Inventory.getFirst((int[])nArray2).useOn(tileObject2);
                Time.sleepTicks((int)lIIlIlIll[6]);

            }
            int[] nArray3 = new int[lIIlIlIll[1]];
            nArray3[ab.lIIlIlIll[0]] = lIIlIlIll[9];
            if (ab.lllllIlIIll(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                if (ab.lllllIlIlll(Players.getLocal().getWorldLocation().distanceTo(kO), lIIlIlIll[7])) {
                    AccBuilderEasyClues.c = lIIlIlIII[lIIlIlIll[88]];
                    e.c(kO);
                    Time.sleepTicks((int)lIIlIlIll[1]);

                }
                if (ab.lllllIllIII(Players.getLocal().getWorldLocation().distanceTo(kO), lIIlIlIll[7])) {
                    AccBuilderEasyClues.c = lIIlIlIII[lIIlIlIll[89]];
                    if (ab.lllllIlIlII(Movement.getRunEnergy(), lIIlIlIll[69]) && ab.lllllIlIIIl(Inventory.contains(item -> item.getName().contains(lIIlIlIII[lIIlIlIll[203]])) ? 1 : 0)) {
                        Inventory.getFirst(item -> item.getName().contains(lIIlIlIII[lIIlIlIll[202]])).useOn(TileObjects.getNearest(tileObject -> {
                            int n2;
                            if (ab.lllllIlIIIl(tileObject.getName().contains(lIIlIlIII[lIIlIlIll[201]]) ? 1 : 0) && ab.lllllIllIII(tileObject.getWorldLocation().distanceTo(li), lIIlIlIll[4])) {
                                n2 = lIIlIlIll[1];

                                if ((0xB8 ^ 0xBD) == 0) {
                                    return false;
                                }
                            } else {
                                n2 = lIIlIlIll[0];
                            }
                            return n2 != 0;
                        }));
                        Time.sleepTicks((int)lIIlIlIll[1]);

                        return;
                    }
                }
            }
        }
        if (ab.lllllIllIIl(ab.e(kP)) && ab.lllllIlIlIl(ab.e(li))) {
            if (ab.lllllIlIlll(Players.getLocal().getWorldLocation().distanceTo(kP), lIIlIlIll[7])) {
                AccBuilderEasyClues.c = lIIlIlIII[lIIlIlIll[90]];
                e.c(kP);
                Time.sleepTicks((int)lIIlIlIll[1]);

            }
            if (ab.lllllIllIII(Players.getLocal().getWorldLocation().distanceTo(kP), lIIlIlIll[7])) {
                AccBuilderEasyClues.c = lIIlIlIII[lIIlIlIll[91]];
                if (ab.lllllIlIIIl(Inventory.contains(item -> item.getName().contains(lIIlIlIII[lIIlIlIll[200]])) ? 1 : 0)) {
                    Inventory.getFirst(item -> item.getName().contains(lIIlIlIII[lIIlIlIll[199]])).useOn(TileObjects.getNearest(tileObject -> {
                        int n2;
                        if (ab.lllllIlIIIl(tileObject.getName().contains(lIIlIlIII[lIIlIlIll[198]]) ? 1 : 0) && ab.lllllIllIII(tileObject.getWorldLocation().distanceTo(lj), lIIlIlIll[4])) {
                            n2 = lIIlIlIll[1];

                            if (-1 >= 3) {
                                return false;
                            }
                        } else {
                            n2 = lIIlIlIll[0];
                        }
                        return n2 != 0;
                    }));
                    Time.sleepTicks((int)lIIlIlIll[1]);

                    return;
                }
            }
        }
        if (ab.lllllIllIIl(ab.e(kQ)) && ab.lllllIlIlIl(ab.e(kP))) {
            if (ab.lllllIlIlll(Players.getLocal().getWorldLocation().distanceTo(kQ), lIIlIlIll[7])) {
                AccBuilderEasyClues.c = lIIlIlIII[lIIlIlIll[92]];
                e.c(kQ);
                Time.sleepTicks((int)lIIlIlIll[1]);

            }
            if (ab.lllllIllIII(Players.getLocal().getWorldLocation().distanceTo(kQ), lIIlIlIll[7])) {
                AccBuilderEasyClues.c = lIIlIlIII[lIIlIlIll[93]];
                if (ab.lllllIlIIIl(Inventory.contains(item -> item.getName().contains(lIIlIlIII[lIIlIlIll[197]])) ? 1 : 0)) {
                    Inventory.getFirst(item -> item.getName().contains(lIIlIlIII[lIIlIlIll[196]])).useOn(TileObjects.getNearest(tileObject -> {
                        int n2;
                        if (ab.lllllIlIIIl(tileObject.getName().contains(lIIlIlIII[lIIlIlIll[195]]) ? 1 : 0) && ab.lllllIllIII(tileObject.getWorldLocation().distanceTo(lk), lIIlIlIll[4])) {
                            n2 = lIIlIlIll[1];

                            if ((33 + 46 - -90 + 18 ^ 59 + 93 - -29 + 10) < ((6 ^ 0x3A ^ (0xF1 ^ 0xAC)) & (127 + 197 - 213 + 125 ^ 22 + 57 - 73 + 135 ^ -1))) {
                                return ((60 + 8 - -21 + 69 ^ 11 + 77 - -32 + 30) & (0x62 ^ 0x43 ^ (0x65 ^ 0x4C) ^ -1)) != 0;
                            }
                        } else {
                            n2 = lIIlIlIll[0];
                        }
                        return n2 != 0;
                    }));
                    Time.sleepTicks((int)lIIlIlIll[1]);

                    return;
                }
            }
        }
        if (ab.lllllIllIIl(ab.e(kR)) && ab.lllllIlIlIl(ab.e(kQ))) {
            if (ab.lllllIlIlll(Players.getLocal().getWorldLocation().distanceTo(kR), lIIlIlIll[7])) {
                AccBuilderEasyClues.c = lIIlIlIII[lIIlIlIll[94]];
                e.c(kR);
                Time.sleepTicks((int)lIIlIlIll[1]);

            }
            if (ab.lllllIllIII(Players.getLocal().getWorldLocation().distanceTo(kR), lIIlIlIll[7])) {
                AccBuilderEasyClues.c = lIIlIlIII[lIIlIlIll[95]];
                if (ab.lllllIlIIIl(Inventory.contains(item -> item.getName().contains(lIIlIlIII[lIIlIlIll[194]])) ? 1 : 0)) {
                    Inventory.getFirst(item -> item.getName().contains(lIIlIlIII[lIIlIlIll[193]])).useOn(TileObjects.getNearest(tileObject -> {
                        int n2;
                        if (ab.lllllIlIIIl(tileObject.getName().contains(lIIlIlIII[lIIlIlIll[192]]) ? 1 : 0) && ab.lllllIllIII(tileObject.getWorldLocation().distanceTo(ll), lIIlIlIll[4])) {
                            n2 = lIIlIlIll[1];

                            if (((0x39 ^ 0x2A) & ~(0x81 ^ 0x92)) < 0) {
                                return false;
                            }
                        } else {
                            n2 = lIIlIlIll[0];
                        }
                        return n2 != 0;
                    }));
                    Time.sleepTicks((int)lIIlIlIll[1]);

                    return;
                }
            }
        }
        if (ab.lllllIllIIl(ab.e(kS)) && ab.lllllIlIlIl(ab.e(kR))) {
            if (ab.lllllIlIlll(Players.getLocal().getWorldLocation().distanceTo(kS), lIIlIlIll[7])) {
                AccBuilderEasyClues.c = lIIlIlIII[lIIlIlIll[96]];
                e.c(kS);
                Time.sleepTicks((int)lIIlIlIll[1]);

            }
            if (ab.lllllIllIII(Players.getLocal().getWorldLocation().distanceTo(kS), lIIlIlIll[7])) {
                AccBuilderEasyClues.c = lIIlIlIII[lIIlIlIll[97]];
                if (ab.lllllIlIIIl(Inventory.contains(item -> item.getName().contains(lIIlIlIII[lIIlIlIll[191]])) ? 1 : 0)) {
                    Inventory.getFirst(item -> item.getName().contains(lIIlIlIII[lIIlIlIll[190]])).useOn(TileObjects.getNearest(tileObject -> {
                        int n2;
                        if (ab.lllllIlIIIl(tileObject.getName().contains(lIIlIlIII[lIIlIlIll[189]]) ? 1 : 0) && ab.lllllIllIII(tileObject.getWorldLocation().distanceTo(lm), lIIlIlIll[4])) {
                            n2 = lIIlIlIll[1];

                            if (-1 > -1) {
                                return false;
                            }
                        } else {
                            n2 = lIIlIlIll[0];
                        }
                        return n2 != 0;
                    }));
                    Time.sleepTicks((int)lIIlIlIll[1]);

                    return;
                }
            }
        }
        if (ab.lllllIllIIl(ab.e(kT)) && ab.lllllIlIlIl(ab.e(kS))) {
            if (ab.lllllIlIlll(Players.getLocal().getWorldLocation().distanceTo(kT), lIIlIlIll[7])) {
                AccBuilderEasyClues.c = lIIlIlIII[lIIlIlIll[98]];
                e.c(kT);
                Time.sleepTicks((int)lIIlIlIll[1]);

            }
            if (ab.lllllIllIII(Players.getLocal().getWorldLocation().distanceTo(kT), lIIlIlIll[7])) {
                AccBuilderEasyClues.c = lIIlIlIII[lIIlIlIll[99]];
                if (ab.lllllIlIIIl(Inventory.contains(item -> item.getName().contains(lIIlIlIII[lIIlIlIll[188]])) ? 1 : 0)) {
                    Inventory.getFirst(item -> item.getName().contains(lIIlIlIII[lIIlIlIll[187]])).useOn(TileObjects.getNearest(tileObject -> {
                        int n2;
                        if (ab.lllllIlIIIl(tileObject.getName().contains(lIIlIlIII[lIIlIlIll[186]]) ? 1 : 0) && ab.lllllIllIII(tileObject.getWorldLocation().distanceTo(ln), lIIlIlIll[4])) {
                            n2 = lIIlIlIll[1];

                            }
                        } else {
                            n2 = lIIlIlIll[0];
                        }
                        return n2 != 0;
                    }));
                    Time.sleepTicks((int)lIIlIlIll[1]);

                    return;
                }
            }
        }
        if (ab.lllllIllIIl(ab.e(kU)) && ab.lllllIlIlIl(ab.e(kT))) {
            if (ab.lllllIlIlll(Players.getLocal().getWorldLocation().distanceTo(kU), lIIlIlIll[7])) {
                AccBuilderEasyClues.c = lIIlIlIII[lIIlIlIll[100]];
                e.c(kU);
                Time.sleepTicks((int)lIIlIlIll[1]);

            }
            if (ab.lllllIllIII(Players.getLocal().getWorldLocation().distanceTo(kU), lIIlIlIll[7])) {
                AccBuilderEasyClues.c = lIIlIlIII[lIIlIlIll[49]];
                if (ab.lllllIlIIIl(Inventory.contains(item -> item.getName().contains(lIIlIlIII[lIIlIlIll[185]])) ? 1 : 0)) {
                    Inventory.getFirst(item -> item.getName().contains(lIIlIlIII[lIIlIlIll[184]])).useOn(TileObjects.getNearest(tileObject -> {
                        int n2;
                        if (ab.lllllIlIIIl(tileObject.getName().contains(lIIlIlIII[lIIlIlIll[183]]) ? 1 : 0) && ab.lllllIllIII(tileObject.getWorldLocation().distanceTo(lo), lIIlIlIll[4])) {
                            n2 = lIIlIlIll[1];

                            if (3 < ((0x93 ^ 0xC4) & ~(0xF9 ^ 0xAE))) {
                                return false;
                            }
                        } else {
                            n2 = lIIlIlIll[0];
                        }
                        return n2 != 0;
                    }));
                    Time.sleepTicks((int)lIIlIlIll[1]);

                    return;
                }
            }
        }
        if (ab.lllllIllIIl(ab.e(kV)) && ab.lllllIlIlIl(ab.e(kU))) {
            if (ab.lllllIlIlll(Players.getLocal().getWorldLocation().distanceTo(kV), lIIlIlIll[7])) {
                AccBuilderEasyClues.c = lIIlIlIII[lIIlIlIll[101]];
                e.c(kV);
                Time.sleepTicks((int)lIIlIlIll[1]);

            }
            if (ab.lllllIllIII(Players.getLocal().getWorldLocation().distanceTo(kV), lIIlIlIll[7])) {
                AccBuilderEasyClues.c = lIIlIlIII[lIIlIlIll[102]];
                if (ab.lllllIlIIIl(Inventory.contains(item -> item.getName().contains(lIIlIlIII[lIIlIlIll[182]])) ? 1 : 0)) {
                    Inventory.getFirst(item -> item.getName().contains(lIIlIlIII[lIIlIlIll[181]])).useOn(TileObjects.getNearest(tileObject -> {
                        int n2;
                        if (ab.lllllIlIIIl(tileObject.getName().contains(lIIlIlIII[lIIlIlIll[180]]) ? 1 : 0) && ab.lllllIllIII(tileObject.getWorldLocation().distanceTo(lp), lIIlIlIll[4])) {
                            n2 = lIIlIlIll[1];

                            }
                        } else {
                            n2 = lIIlIlIll[0];
                        }
                        return n2 != 0;
                    }));
                    Time.sleepTicks((int)lIIlIlIll[1]);

                    return;
                }
            }
        }
        if (ab.lllllIllIIl(ab.e(kW)) && ab.lllllIlIlIl(ab.e(kV))) {
            if (ab.lllllIlIlll(Players.getLocal().getWorldLocation().distanceTo(kW), lIIlIlIll[7])) {
                AccBuilderEasyClues.c = lIIlIlIII[lIIlIlIll[103]];
                e.c(kW);
                Time.sleepTicks((int)lIIlIlIll[1]);

            }
            if (ab.lllllIllIII(Players.getLocal().getWorldLocation().distanceTo(kW), lIIlIlIll[7])) {
                AccBuilderEasyClues.c = lIIlIlIII[lIIlIlIll[104]];
                if (ab.lllllIlIIIl(Inventory.contains(item -> item.getName().contains(lIIlIlIII[lIIlIlIll[179]])) ? 1 : 0)) {
                    Inventory.getFirst(item -> item.getName().contains(lIIlIlIII[lIIlIlIll[178]])).useOn(TileObjects.getNearest(tileObject -> {
                        int n2;
                        if (ab.lllllIlIIIl(tileObject.getName().contains(lIIlIlIII[lIIlIlIll[177]]) ? 1 : 0) && ab.lllllIllIII(tileObject.getWorldLocation().distanceTo(lq), lIIlIlIll[4])) {
                            n2 = lIIlIlIll[1];

                            if ((0x7C ^ 0x78) <= 2) {
                                return false;
                            }
                        } else {
                            n2 = lIIlIlIll[0];
                        }
                        return n2 != 0;
                    }));
                    Time.sleepTicks((int)lIIlIlIll[1]);

                    return;
                }
            }
        }
        if (ab.lllllIllIIl(ab.e(kX)) && ab.lllllIlIlIl(ab.e(kW))) {
            if (ab.lllllIlIlll(Players.getLocal().getWorldLocation().distanceTo(kX), lIIlIlIll[7])) {
                AccBuilderEasyClues.c = lIIlIlIII[lIIlIlIll[105]];
                e.c(kX);
                Time.sleepTicks((int)lIIlIlIll[1]);

            }
            if (ab.lllllIllIII(Players.getLocal().getWorldLocation().distanceTo(kX), lIIlIlIll[7])) {
                AccBuilderEasyClues.c = lIIlIlIII[lIIlIlIll[106]];
                if (ab.lllllIlIIIl(Inventory.contains(item -> item.getName().contains(lIIlIlIII[lIIlIlIll[176]])) ? 1 : 0)) {
                    Inventory.getFirst(item -> item.getName().contains(lIIlIlIII[lIIlIlIll[175]])).useOn(TileObjects.getNearest(tileObject -> {
                        int n2;
                        if (ab.lllllIlIIIl(tileObject.getName().contains(lIIlIlIII[lIIlIlIll[174]]) ? 1 : 0) && ab.lllllIllIII(tileObject.getWorldLocation().distanceTo(lr), lIIlIlIll[4])) {
                            n2 = lIIlIlIll[1];

                            if (1 <= 0) {
                                return false;
                            }
                        } else {
                            n2 = lIIlIlIll[0];
                        }
                        return n2 != 0;
                    }));
                    Time.sleepTicks((int)lIIlIlIll[1]);

                    return;
                }
            }
        }
        if (ab.lllllIllIIl(ab.e(kY)) && ab.lllllIlIlIl(ab.e(kX))) {
            if (ab.lllllIlIlll(Players.getLocal().getWorldLocation().distanceTo(kY), lIIlIlIll[7])) {
                AccBuilderEasyClues.c = lIIlIlIII[lIIlIlIll[107]];
                e.c(kY);
                Time.sleepTicks((int)lIIlIlIll[1]);

            }
            if (ab.lllllIllIII(Players.getLocal().getWorldLocation().distanceTo(kY), lIIlIlIll[7])) {
                AccBuilderEasyClues.c = lIIlIlIII[lIIlIlIll[108]];
                if (ab.lllllIlIIIl(Inventory.contains(item -> item.getName().contains(lIIlIlIII[lIIlIlIll[173]])) ? 1 : 0)) {
                    Inventory.getFirst(item -> item.getName().contains(lIIlIlIII[lIIlIlIll[172]])).useOn(TileObjects.getNearest(tileObject -> {
                        int n2;
                        if (ab.lllllIlIIIl(tileObject.getName().contains(lIIlIlIII[lIIlIlIll[171]]) ? 1 : 0) && ab.lllllIllIII(tileObject.getWorldLocation().distanceTo(ls), lIIlIlIll[4])) {
                            n2 = lIIlIlIll[1];

                            if (-(16 + 39 - -88 + 56 ^ 44 + 90 - 113 + 174) > 0) {
                                return ((0x78 ^ 0x34 ^ (0x2C ^ 0x40)) & (0xD0 ^ 0xC5 ^ (0x24 ^ 0x11) ^ -1)) != 0;
                            }
                        } else {
                            n2 = lIIlIlIll[0];
                        }
                        return n2 != 0;
                    }));
                    Time.sleepTicks((int)lIIlIlIll[1]);

                    return;
                }
            }
        }
        if (ab.lllllIllIIl(ab.e(kZ)) && ab.lllllIlIlIl(ab.e(kY))) {
            if (ab.lllllIlIlll(Players.getLocal().getWorldLocation().distanceTo(kZ), lIIlIlIll[7])) {
                AccBuilderEasyClues.c = lIIlIlIII[lIIlIlIll[109]];
                e.c(kZ);
                Time.sleepTicks((int)lIIlIlIll[1]);

            }
            if (ab.lllllIllIII(Players.getLocal().getWorldLocation().distanceTo(kZ), lIIlIlIll[7])) {
                AccBuilderEasyClues.c = lIIlIlIII[lIIlIlIll[110]];
                if (ab.lllllIlIIIl(Inventory.contains(item -> item.getName().contains(lIIlIlIII[lIIlIlIll[170]])) ? 1 : 0)) {
                    Inventory.getFirst(item -> item.getName().contains(lIIlIlIII[lIIlIlIll[169]])).useOn(TileObjects.getNearest(tileObject -> {
                        int n2;
                        if (ab.lllllIlIIIl(tileObject.getName().contains(lIIlIlIII[lIIlIlIll[168]]) ? 1 : 0) && ab.lllllIllIII(tileObject.getWorldLocation().distanceTo(lt), lIIlIlIll[4])) {
                            n2 = lIIlIlIll[1];

                            }
                        } else {
                            n2 = lIIlIlIll[0];
                        }
                        return n2 != 0;
                    }));
                    Time.sleepTicks((int)lIIlIlIll[1]);

                    return;
                }
            }
        }
        if (ab.lllllIllIIl(ab.e(la)) && ab.lllllIlIlIl(ab.e(kZ))) {
            if (ab.lllllIlIlll(Players.getLocal().getWorldLocation().distanceTo(la), lIIlIlIll[7])) {
                AccBuilderEasyClues.c = lIIlIlIII[lIIlIlIll[69]];
                e.c(la);
                Time.sleepTicks((int)lIIlIlIll[1]);

            }
            if (ab.lllllIllIII(Players.getLocal().getWorldLocation().distanceTo(la), lIIlIlIll[7])) {
                AccBuilderEasyClues.c = lIIlIlIII[lIIlIlIll[111]];
                if (ab.lllllIlIIIl(Inventory.contains(item -> item.getName().contains(lIIlIlIII[lIIlIlIll[167]])) ? 1 : 0)) {
                    Inventory.getFirst(item -> item.getName().contains(lIIlIlIII[lIIlIlIll[166]])).useOn(TileObjects.getNearest(tileObject -> {
                        int n2;
                        if (ab.lllllIlIIIl(tileObject.getName().contains(lIIlIlIII[lIIlIlIll[165]]) ? 1 : 0) && ab.lllllIllIII(tileObject.getWorldLocation().distanceTo(lu), lIIlIlIll[4])) {
                            n2 = lIIlIlIll[1];

                            if ((0x42 ^ 0x46) <= 3) {
                                return false;
                            }
                        } else {
                            n2 = lIIlIlIll[0];
                        }
                        return n2 != 0;
                    }));
                    Time.sleepTicks((int)lIIlIlIll[1]);

                    return;
                }
            }
        }
        if (ab.lllllIllIIl(ab.e(lb)) && ab.lllllIlIlIl(ab.e(la))) {
            if (ab.lllllIlIlll(Players.getLocal().getWorldLocation().distanceTo(lb), lIIlIlIll[7])) {
                AccBuilderEasyClues.c = lIIlIlIII[lIIlIlIll[112]];
                e.c(lb);
                Time.sleepTicks((int)lIIlIlIll[1]);

            }
            if (ab.lllllIllIII(Players.getLocal().getWorldLocation().distanceTo(lb), lIIlIlIll[7])) {
                AccBuilderEasyClues.c = lIIlIlIII[lIIlIlIll[32]];
                if (ab.lllllIlIIIl(Inventory.contains(item -> item.getName().contains(lIIlIlIII[lIIlIlIll[164]])) ? 1 : 0)) {
                    Inventory.getFirst(item -> item.getName().contains(lIIlIlIII[lIIlIlIll[163]])).useOn(TileObjects.getNearest(tileObject -> {
                        int n2;
                        if (ab.lllllIlIIIl(tileObject.getName().contains(lIIlIlIII[lIIlIlIll[162]]) ? 1 : 0) && ab.lllllIllIII(tileObject.getWorldLocation().distanceTo(lv), lIIlIlIll[4])) {
                            n2 = lIIlIlIll[1];

                            if (3 == 1) {
                                return false;
                            }
                        } else {
                            n2 = lIIlIlIll[0];
                        }
                        return n2 != 0;
                    }));
                    Time.sleepTicks((int)lIIlIlIll[1]);

                    return;
                }
            }
        }
        if (ab.lllllIllIIl(ab.e(lc)) && ab.lllllIlIlIl(ab.e(lb))) {
            if (ab.lllllIlIlll(Players.getLocal().getWorldLocation().distanceTo(lc), lIIlIlIll[7])) {
                AccBuilderEasyClues.c = lIIlIlIII[lIIlIlIll[113]];
                e.c(lc);
                Time.sleepTicks((int)lIIlIlIll[1]);

            }
            if (ab.lllllIllIII(Players.getLocal().getWorldLocation().distanceTo(lc), lIIlIlIll[7])) {
                AccBuilderEasyClues.c = lIIlIlIII[lIIlIlIll[114]];
                if (ab.lllllIlIIIl(Inventory.contains(item -> item.getName().contains(lIIlIlIII[lIIlIlIll[161]])) ? 1 : 0)) {
                    Inventory.getFirst(item -> item.getName().contains(lIIlIlIII[lIIlIlIll[160]])).useOn(TileObjects.getNearest(tileObject -> {
                        int n2;
                        if (ab.lllllIlIIIl(tileObject.getName().contains(lIIlIlIII[lIIlIlIll[159]]) ? 1 : 0) && ab.lllllIllIII(tileObject.getWorldLocation().distanceTo(lw), lIIlIlIll[4])) {
                            n2 = lIIlIlIll[1];

                            if (((0x47 ^ 0x26) & ~(0x35 ^ 0x54)) > 3) {
                                return false;
                            }
                        } else {
                            n2 = lIIlIlIll[0];
                        }
                        return n2 != 0;
                    }));
                    Time.sleepTicks((int)lIIlIlIll[1]);

                    return;
                }
            }
        }
        if (ab.lllllIllIIl(ab.e(ld)) && ab.lllllIlIlIl(ab.e(lc))) {
            if (ab.lllllIlIlll(Players.getLocal().getWorldLocation().distanceTo(ld), lIIlIlIll[7])) {
                AccBuilderEasyClues.c = lIIlIlIII[lIIlIlIll[115]];
                e.c(ld);
                Time.sleepTicks((int)lIIlIlIll[1]);

            }
            if (ab.lllllIllIII(Players.getLocal().getWorldLocation().distanceTo(ld), lIIlIlIll[7])) {
                AccBuilderEasyClues.c = lIIlIlIII[lIIlIlIll[116]];
                if (ab.lllllIlIIIl(Inventory.contains(item -> item.getName().contains(lIIlIlIII[lIIlIlIll[158]])) ? 1 : 0)) {
                    Inventory.getFirst(item -> item.getName().contains(lIIlIlIII[lIIlIlIll[157]])).useOn(TileObjects.getNearest(tileObject -> {
                        int n2;
                        if (ab.lllllIlIIIl(tileObject.getName().contains(lIIlIlIII[lIIlIlIll[156]]) ? 1 : 0) && ab.lllllIllIII(tileObject.getWorldLocation().distanceTo(lx), lIIlIlIll[4])) {
                            n2 = lIIlIlIll[1];

                            if (((0x5C ^ 0x78 ^ (0x14 ^ 0x7F)) & (0x94 ^ 0xC2 ^ (0xA2 ^ 0xBB) ^ -1)) != 0) {
                                return ((2 ^ 0x37 ^ (0x13 ^ 0x47)) & (0xCA ^ 0x9B ^ (0x5C ^ 0x6C) ^ -1)) != 0;
                            }
                        } else {
                            n2 = lIIlIlIll[0];
                        }
                        return n2 != 0;
                    }));
                    Time.sleepTicks((int)lIIlIlIll[1]);

                    return;
                }
            }
        }
        if (ab.lllllIllIIl(ab.e(le)) && ab.lllllIlIlIl(ab.e(ld))) {
            if (ab.lllllIlIlll(Players.getLocal().getWorldLocation().distanceTo(le), lIIlIlIll[7])) {
                AccBuilderEasyClues.c = lIIlIlIII[lIIlIlIll[117]];
                e.c(le);
                Time.sleepTicks((int)lIIlIlIll[1]);

            }
            if (ab.lllllIllIII(Players.getLocal().getWorldLocation().distanceTo(le), lIIlIlIll[7])) {
                AccBuilderEasyClues.c = lIIlIlIII[lIIlIlIll[118]];
                if (ab.lllllIlIIIl(Inventory.contains(item -> item.getName().contains(lIIlIlIII[lIIlIlIll[155]])) ? 1 : 0)) {
                    Inventory.getFirst(item -> item.getName().contains(lIIlIlIII[lIIlIlIll[154]])).useOn(TileObjects.getNearest(tileObject -> {
                        int n2;
                        if (ab.lllllIlIIIl(tileObject.getName().contains(lIIlIlIII[lIIlIlIll[153]]) ? 1 : 0) && ab.lllllIllIII(tileObject.getWorldLocation().distanceTo(ly), lIIlIlIll[4])) {
                            n2 = lIIlIlIll[1];

                        } else {
                            n2 = lIIlIlIll[0];
                        }
                        return n2 != 0;
                    }));
                    Time.sleepTicks((int)lIIlIlIll[1]);

                    return;
                }
            }
        }
        if (ab.lllllIllIIl(ab.e(lf)) && ab.lllllIlIlIl(ab.e(le))) {
            if (ab.lllllIlIlll(Players.getLocal().getWorldLocation().distanceTo(lf), lIIlIlIll[7])) {
                AccBuilderEasyClues.c = lIIlIlIII[lIIlIlIll[119]];
                e.c(lf);
                Time.sleepTicks((int)lIIlIlIll[1]);

            }
            if (ab.lllllIllIII(Players.getLocal().getWorldLocation().distanceTo(lf), lIIlIlIll[7])) {
                AccBuilderEasyClues.c = lIIlIlIII[lIIlIlIll[120]];
                if (ab.lllllIlIIIl(Inventory.contains(item -> item.getName().contains(lIIlIlIII[lIIlIlIll[152]])) ? 1 : 0)) {
                    Inventory.getFirst(item -> item.getName().contains(lIIlIlIII[lIIlIlIll[151]])).useOn(TileObjects.getNearest(tileObject -> {
                        int n2;
                        if (ab.lllllIlIIIl(tileObject.getName().contains(lIIlIlIII[lIIlIlIll[150]]) ? 1 : 0) && ab.lllllIllIII(tileObject.getWorldLocation().distanceTo(lz), lIIlIlIll[4])) {
                            n2 = lIIlIlIll[1];

                            if (((0x55 ^ 0x26 ^ (0xF0 ^ 0x84)) & (46 + 93 - 49 + 81 ^ 165 + 155 - 273 + 125 ^ -1)) > (0x59 ^ 0x55 ^ (0xA ^ 2))) {
                                return (2 & (2 ^ -1)) != 0;
                            }
                        } else {
                            n2 = lIIlIlIll[0];
                        }
                        return n2 != 0;
                    }));
                    Time.sleepTicks((int)lIIlIlIll[1]);

                    return;
                }
            }
        }
        if (ab.lllllIllIIl(ab.e(lg)) && ab.lllllIlIlIl(ab.e(lf))) {
            if (ab.lllllIlIlll(Players.getLocal().getWorldLocation().distanceTo(lg), lIIlIlIll[7])) {
                AccBuilderEasyClues.c = lIIlIlIII[lIIlIlIll[121]];
                e.c(lg);
                Time.sleepTicks((int)lIIlIlIll[1]);

            }
            if (ab.lllllIllIII(Players.getLocal().getWorldLocation().distanceTo(lg), lIIlIlIll[7])) {
                AccBuilderEasyClues.c = lIIlIlIII[lIIlIlIll[122]];
                if (ab.lllllIlIIIl(Inventory.contains(item -> item.getName().contains(lIIlIlIII[lIIlIlIll[149]])) ? 1 : 0)) {
                    Inventory.getFirst(item -> item.getName().contains(lIIlIlIII[lIIlIlIll[148]])).useOn(TileObjects.getNearest(tileObject -> {
                        int n2;
                        if (ab.lllllIlIIIl(tileObject.getName().contains(lIIlIlIII[lIIlIlIll[147]]) ? 1 : 0) && ab.lllllIllIII(tileObject.getWorldLocation().distanceTo(lA), lIIlIlIll[4])) {
                            n2 = lIIlIlIll[1];

                            if (((0x26 ^ 0x7D) & ~(0x51 ^ 0xA)) != 0) {
                                return false;
                            }
                        } else {
                            n2 = lIIlIlIll[0];
                        }
                        return n2 != 0;
                    }));
                    Time.sleepTicks((int)lIIlIlIll[1]);

                    return;
                }
            }
        }
        if (ab.lllllIllIIl(ab.e(lh)) && ab.lllllIlIlIl(ab.e(lg))) {
            if (ab.lllllIlIlll(Players.getLocal().getWorldLocation().distanceTo(lh), lIIlIlIll[7])) {
                AccBuilderEasyClues.c = lIIlIlIII[lIIlIlIll[123]];
                e.c(lh);
                Time.sleepTicks((int)lIIlIlIll[1]);

            }
            if (ab.lllllIllIII(Players.getLocal().getWorldLocation().distanceTo(lh), lIIlIlIll[7])) {
                AccBuilderEasyClues.c = lIIlIlIII[lIIlIlIll[124]];
                if (ab.lllllIlIIIl(Inventory.contains(item -> item.getName().contains(lIIlIlIII[lIIlIlIll[146]])) ? 1 : 0)) {
                    Inventory.getFirst(item -> item.getName().contains(lIIlIlIII[lIIlIlIll[145]])).useOn(TileObjects.getNearest(tileObject -> {
                        int n2;
                        if (ab.lllllIlIIIl(tileObject.getName().contains(lIIlIlIII[lIIlIlIll[144]]) ? 1 : 0) && ab.lllllIllIII(tileObject.getWorldLocation().distanceTo(lB), lIIlIlIll[4])) {
                            n2 = lIIlIlIll[1];

                            if (((0x55 ^ 0x1D) & ~(0x2C ^ 0x64)) != 0) {
                                return false;
                            }
                        } else {
                            n2 = lIIlIlIll[0];
                        }
                        return n2 != 0;
                    }));
                    Time.sleepTicks((int)lIIlIlIll[12]);

                    return;
                }
            }
        }
    }

    @Override
    public boolean S() {
        return lIIlIlIll[0];
    }

    private static void dA() {
        e.l(lIIlIlIll[25]);
        e.l(lIIlIlIll[26]);
        e.l(lIIlIlIll[27]);
        e.l(lIIlIlIll[28]);
        e.l(lIIlIlIll[29]);
        e.l(lIIlIlIll[30]);
        e.l(lIIlIlIll[32]);
        e.l(lIIlIlIll[132]);
    }

    private static void du() {
        if (ab.lllllIlIIIl(kL.isEmpty() ? 1 : 0)) {
            kL.add(kO);

            kL.add(kP);

            kL.add(kQ);

            kL.add(kR);

            kL.add(kS);

            kL.add(kT);

            kL.add(kU);

            kL.add(kV);

            kL.add(kW);

            kL.add(kX);

            kL.add(kY);

            kL.add(kZ);

            kL.add(la);

            kL.add(lb);

            kL.add(lc);

            kL.add(ld);

            kL.add(le);

            kL.add(lf);

            kL.add(lg);

            kL.add(lh);

        }
        if (ab.lllllIlIIIl(kM.isEmpty() ? 1 : 0)) {
            kM.add(li);

            kM.add(lj);

            kM.add(lk);

            kM.add(ll);

            kM.add(lm);

            kM.add(ln);

            kM.add(lo);

            kM.add(lp);

            kM.add(lq);

            kM.add(lr);

            kM.add(ls);

            kM.add(lt);

            kM.add(lu);

            kM.add(lv);

            kM.add(lw);

            kM.add(lx);

            kM.add(ly);

            kM.add(lz);

            kM.add(lA);

            kM.add(lB);

        }
    }

    @Override
    public int T() {
        try {
            ab.ds();

        }
        catch (Exception exception) {
            // empty catch block
        }
        if (-1 == 1) {
            return (15 + 68 - 12 + 134 ^ 22 + 34 - 42 + 134) & (0x90 ^ 0xA3 ^ (0x66 ^ 0xC) ^ -1);
        }
        return lIIlIlIll[124];
    }

    private static void lllllIIIlIl() {
        lIIlIlIII = new String[lIIlIlIll[250]];
        ab.lIIlIlIII[ab.lIIlIlIll[0]] = "Buying items";
        ab.lIIlIlIII[ab.lIIlIlIll[1]] = "Finished buying items, switching back to farming";
        ab.lIIlIlIII[ab.lIIlIlIll[4]] = "- Sorc Garden";
        ab.lIIlIlIII[ab.lIIlIlIll[5]] = ab.llllIllIIll("rfU1nMezQYg=", "gxRbl");
        ab.lIIlIlIII[ab.lIIlIlIll[6]] = "Navigating to bank";
        ab.lIIlIlIII[ab.lIIlIlIll[7]] = "Handling banking";
        ab.lIIlIlIII[ab.lIIlIlIll[11]] = "We are missing quest supplies, switching to BUYING";
        ab.lIIlIlIII[ab.lIIlIlIll[20]] = "We are missing quest supplies, switching to BUYING";
        ab.lIIlIlIII[ab.lIIlIlIll[22]] = "Vial";
        ab.lIIlIlIII[ab.lIIlIlIll[23]] = "Vial";
        ab.lIIlIlIII[ab.lIIlIlIll[12]] = "Drop";
        ab.lIIlIlIII[ab.lIIlIlIll[38]] = "Drink";
        ab.lIIlIlIII[ab.lIIlIlIll[35]] = "Nav to seed table";
        ab.lIIlIlIII[ab.lIIlIlIll[42]] = "Turning in fruit before exiting";
        ab.lIIlIlIII[ab.lIIlIlIll[43]] = "Turning in fruits";
        ab.lIIlIlIII[ab.lIIlIlIll[34]] = "Deposit";
        ab.lIIlIlIII[ab.lIIlIlIll[44]] = "Exiting tithe";
        ab.lIIlIlIII[ab.lIIlIlIll[10]] = "Farm door";
        ab.lIIlIlIII[ab.lIIlIlIll[45]] = "Open";
        ab.lIIlIlIII[ab.lIIlIlIll[46]] = "Grabbing seeds";
        ab.lIIlIlIII[ab.lIIlIlIll[47]] = "Seed table";
        ab.lIIlIlIII[ab.lIIlIlIll[48]] = "Search";
        ab.lIIlIlIII[ab.lIIlIlIll[50]] = "Logavano seed (level 74)";
        ab.lIIlIlIII[ab.lIIlIlIll[52]] = "Bologano seed (level 54)";
        ab.lIIlIlIII[ab.lIIlIlIll[53]] = "Golovanova seed (level 34)";
        ab.lIIlIlIII[ab.lIIlIlIll[39]] = "Entering tithe farm";
        ab.lIIlIlIII[ab.lIIlIlIll[55]] = "Farm door";
        ab.lIIlIlIII[ab.lIIlIlIll[56]] = "Open";
        ab.lIIlIlIII[ab.lIIlIlIll[57]] = "I'm an expert - don't ask me this again.";
        ab.lIIlIlIII[ab.lIIlIlIll[58]] = "Farm door";
        ab.lIIlIlIII[ab.lIIlIlIll[59]] = "Farm door";
        ab.lIIlIlIII[ab.lIIlIlIll[60]] = "Farm door";
        ab.lIIlIlIII[ab.lIIlIlIll[61]] = "Too far from anchor, resetting instance";
        ab.lIIlIlIII[ab.lIIlIlIll[62]] = "Turning in fruit before exiting";
        ab.lIIlIlIII[ab.lIIlIlIll[3]] = "Turning in fruits";
        ab.lIIlIlIII[ab.lIIlIlIll[63]] = "Deposit";
        ab.lIIlIlIII[ab.lIIlIlIll[64]] = "Exiting tithe";
        ab.lIIlIlIII[ab.lIIlIlIll[65]] = "Farm door";
        ab.lIIlIlIII[ab.lIIlIlIll[66]] = "Open";
        ab.lIIlIlIII[ab.lIIlIlIll[67]] = "Refilling water cans";
        ab.lIIlIlIII[ab.lIIlIlIll[68]] = "Nav to farm spot 1";
        ab.lIIlIlIII[ab.lIIlIlIll[70]] = "Waiting for run";
        ab.lIIlIlIII[ab.lIIlIlIll[71]] = "Planting farm 1";
        ab.lIIlIlIII[ab.lIIlIlIll[72]] = "Water";
        ab.lIIlIlIII[ab.lIIlIlIll[73]] = "Watering 20";
        ab.lIIlIlIII[ab.lIIlIlIll[2]] = "Watering";
        ab.lIIlIlIII[ab.lIIlIlIll[74]] = "Harvest";
        ab.lIIlIlIII[ab.lIIlIlIll[75]] = "Harvesting";
        ab.lIIlIlIII[ab.lIIlIlIll[76]] = "Harvest";
        ab.lIIlIlIII[ab.lIIlIlIll[77]] = "Farm door";
        ab.lIIlIlIII[ab.lIIlIlIll[37]] = "Farm door";
        ab.lIIlIlIII[ab.lIIlIlIll[78]] = "Water";
        ab.lIIlIlIII[ab.lIIlIlIll[79]] = "Watering";
        ab.lIIlIlIII[ab.lIIlIlIll[80]] = "Harvest";
        ab.lIIlIlIII[ab.lIIlIlIll[51]] = "Harvesting";
        ab.lIIlIlIII[ab.lIIlIlIll[81]] = "Harvest";
        ab.lIIlIlIII[ab.lIIlIlIll[82]] = "Waiting after harvesting spot 20";
        ab.lIIlIlIII[ab.lIIlIlIll[83]] = "Waiting at farm 19";
        ab.lIIlIlIII[ab.lIIlIlIll[85]] = "Turning in fruits";
        ab.lIIlIlIII[ab.lIIlIlIll[86]] = "Deposit";
        ab.lIIlIlIII[ab.lIIlIlIll[87]] = "Refilling water cans";
        ab.lIIlIlIII[ab.lIIlIlIll[88]] = "Walk to farm 1";
        ab.lIIlIlIII[ab.lIIlIlIll[89]] = "Planting farm 1";
        ab.lIIlIlIII[ab.lIIlIlIll[90]] = "Walk to farm 2";
        ab.lIIlIlIII[ab.lIIlIlIll[91]] = "Planting farm 2";
        ab.lIIlIlIII[ab.lIIlIlIll[92]] = "Walk to farm 3";
        ab.lIIlIlIII[ab.lIIlIlIll[93]] = "Planting farm 3";
        ab.lIIlIlIII[ab.lIIlIlIll[94]] = "Walk to farm 4";
        ab.lIIlIlIII[ab.lIIlIlIll[95]] = "Planting farm 4";
        ab.lIIlIlIII[ab.lIIlIlIll[96]] = "Walk to farm 5";
        ab.lIIlIlIII[ab.lIIlIlIll[97]] = "Planting farm 5";
        ab.lIIlIlIII[ab.lIIlIlIll[98]] = "Walk to farm 6";
        ab.lIIlIlIII[ab.lIIlIlIll[99]] = "Planting farm 6";
        ab.lIIlIlIII[ab.lIIlIlIll[100]] = "Walk to farm 7";
        ab.lIIlIlIII[ab.lIIlIlIll[49]] = "Planting farm 7";
        ab.lIIlIlIII[ab.lIIlIlIll[101]] = "Walk to farm 8";
        ab.lIIlIlIII[ab.lIIlIlIll[102]] = "Planting farm 8";
        ab.lIIlIlIII[ab.lIIlIlIll[103]] = "Walk to farm 9";
        ab.lIIlIlIII[ab.lIIlIlIll[104]] = "Planting farm 9";
        ab.lIIlIlIII[ab.lIIlIlIll[105]] = "Walk to farm 10";
        ab.lIIlIlIII[ab.lIIlIlIll[106]] = "Planting farm 10";
        ab.lIIlIlIII[ab.lIIlIlIll[107]] = "Walk to farm 11";
        ab.lIIlIlIII[ab.lIIlIlIll[108]] = "Planting farm 11";
        ab.lIIlIlIII[ab.lIIlIlIll[109]] = "Walk to farm 12";
        ab.lIIlIlIII[ab.lIIlIlIll[110]] = "Planting farm 12";
        ab.lIIlIlIII[ab.lIIlIlIll[69]] = "Walk to farm 13";
        ab.lIIlIlIII[ab.lIIlIlIll[111]] = "Planting farm 13";
        ab.lIIlIlIII[ab.lIIlIlIll[112]] = "Walk to farm 14";
        ab.lIIlIlIII[ab.lIIlIlIll[32]] = "Planting farm 14";
        ab.lIIlIlIII[ab.lIIlIlIll[113]] = "Walk to farm 15";
        ab.lIIlIlIII[ab.lIIlIlIll[114]] = "Planting farm 15";
        ab.lIIlIlIII[ab.lIIlIlIll[115]] = "Walk to farm 16";
        ab.lIIlIlIII[ab.lIIlIlIll[116]] = "Planting farm 16";
        ab.lIIlIlIII[ab.lIIlIlIll[117]] = "Walk to farm 17";
        ab.lIIlIlIII[ab.lIIlIlIll[118]] = "Planting farm 17";
        ab.lIIlIlIII[ab.lIIlIlIll[119]] = "Walk to farm 18";
        ab.lIIlIlIII[ab.lIIlIlIll[120]] = "Planting farm 18";
        ab.lIIlIlIII[ab.lIIlIlIll[121]] = "Walk to farm 19";
        ab.lIIlIlIII[ab.lIIlIlIll[122]] = "Planting farm 19";
        ab.lIIlIlIII[ab.lIIlIlIll[123]] = "Walk to farm 20";
        ab.lIIlIlIII[ab.lIIlIlIll[124]] = "Planting farm 20";
        ab.lIIlIlIII[ab.lIIlIlIll[125]] = "Tiles set";
        ab.lIIlIlIII[ab.lIIlIlIll[133]] = "Spade";
        ab.lIIlIlIII[ab.lIIlIlIll[142]] = "Watering can";
        ab.lIIlIlIII[ab.lIIlIlIll[143]] = "door";
        ab.lIIlIlIII[ab.lIIlIlIll[144]] = "Tithe patch";
        ab.lIIlIlIII[ab.lIIlIlIll[145]] = "seed";
        ab.lIIlIlIII[ab.lIIlIlIll[146]] = "seed";
        ab.lIIlIlIII[ab.lIIlIlIll[147]] = "Tithe patch";
        ab.lIIlIlIII[ab.lIIlIlIll[148]] = "seed";
        ab.lIIlIlIII[ab.lIIlIlIll[149]] = "seed";
        ab.lIIlIlIII[ab.lIIlIlIll[150]] = "Tithe patch";
        ab.lIIlIlIII[ab.lIIlIlIll[151]] = "seed";
        ab.lIIlIlIII[ab.lIIlIlIll[152]] = "seed";
        ab.lIIlIlIII[ab.lIIlIlIll[153]] = "Tithe patch";
        ab.lIIlIlIII[ab.lIIlIlIll[154]] = "seed";
        ab.lIIlIlIII[ab.lIIlIlIll[155]] = "seed";
        ab.lIIlIlIII[ab.lIIlIlIll[156]] = "Tithe patch";
        ab.lIIlIlIII[ab.lIIlIlIll[157]] = "seed";
        ab.lIIlIlIII[ab.lIIlIlIll[158]] = "seed";
        ab.lIIlIlIII[ab.lIIlIlIll[159]] = "Tithe patch";
        ab.lIIlIlIII[ab.lIIlIlIll[160]] = "seed";
        ab.lIIlIlIII[ab.lIIlIlIll[161]] = "seed";
        ab.lIIlIlIII[ab.lIIlIlIll[162]] = "Tithe patch";
        ab.lIIlIlIII[ab.lIIlIlIll[163]] = "seed";
        ab.lIIlIlIII[ab.lIIlIlIll[164]] = "seed";
        ab.lIIlIlIII[ab.lIIlIlIll[165]] = "Tithe patch";
        ab.lIIlIlIII[ab.lIIlIlIll[166]] = "seed";
        ab.lIIlIlIII[ab.lIIlIlIll[167]] = "seed";
        ab.lIIlIlIII[ab.lIIlIlIll[168]] = "Tithe patch";
        ab.lIIlIlIII[ab.lIIlIlIll[169]] = "seed";
        ab.lIIlIlIII[ab.lIIlIlIll[170]] = "seed";
        ab.lIIlIlIII[ab.lIIlIlIll[171]] = "Tithe patch";
        ab.lIIlIlIII[ab.lIIlIlIll[172]] = "seed";
        ab.lIIlIlIII[ab.lIIlIlIll[173]] = "seed";
        ab.lIIlIlIII[ab.lIIlIlIll[174]] = "Tithe patch";
        ab.lIIlIlIII[ab.lIIlIlIll[175]] = "seed";
        ab.lIIlIlIII[ab.lIIlIlIll[176]] = "seed";
        ab.lIIlIlIII[ab.lIIlIlIll[177]] = "Tithe patch";
        ab.lIIlIlIII[ab.lIIlIlIll[178]] = "seed";
        ab.lIIlIlIII[ab.lIIlIlIll[179]] = "seed";
        ab.lIIlIlIII[ab.lIIlIlIll[180]] = "Tithe patch";
        ab.lIIlIlIII[ab.lIIlIlIll[181]] = "seed";
        ab.lIIlIlIII[ab.lIIlIlIll[182]] = "seed";
        ab.lIIlIlIII[ab.lIIlIlIll[183]] = "Tithe patch";
        ab.lIIlIlIII[ab.lIIlIlIll[184]] = "seed";
        ab.lIIlIlIII[ab.lIIlIlIll[185]] = "seed";
        ab.lIIlIlIII[ab.lIIlIlIll[186]] = "Tithe patch";
        ab.lIIlIlIII[ab.lIIlIlIll[187]] = "seed";
        ab.lIIlIlIII[ab.lIIlIlIll[188]] = "seed";
        ab.lIIlIlIII[ab.lIIlIlIll[189]] = "Tithe patch";
        ab.lIIlIlIII[ab.lIIlIlIll[190]] = "seed";
        ab.lIIlIlIII[ab.lIIlIlIll[191]] = "seed";
        ab.lIIlIlIII[ab.lIIlIlIll[192]] = "Tithe patch";
        ab.lIIlIlIII[ab.lIIlIlIll[193]] = "seed";
        ab.lIIlIlIII[ab.lIIlIlIll[194]] = "seed";
        ab.lIIlIlIII[ab.lIIlIlIll[195]] = "Tithe patch";
        ab.lIIlIlIII[ab.lIIlIlIll[196]] = "seed";
        ab.lIIlIlIII[ab.lIIlIlIll[197]] = "seed";
        ab.lIIlIlIII[ab.lIIlIlIll[198]] = "Tithe patch";
        ab.lIIlIlIII[ab.lIIlIlIll[199]] = "seed";
        ab.lIIlIlIII[ab.lIIlIlIll[200]] = "seed";
        ab.lIIlIlIII[ab.lIIlIlIll[201]] = "Tithe patch";
        ab.lIIlIlIII[ab.lIIlIlIll[202]] = "seed";
        ab.lIIlIlIII[ab.lIIlIlIll[203]] = "seed";
        ab.lIIlIlIII[ab.lIIlIlIll[204]] = "Water";
        ab.lIIlIlIII[ab.lIIlIlIll[205]] = "seedling";
        ab.lIIlIlIII[ab.lIIlIlIll[206]] = "plant";
        ab.lIIlIlIII[ab.lIIlIlIll[207]] = "Sack";
        ab.lIIlIlIII[ab.lIIlIlIll[208]] = "seedling";
        ab.lIIlIlIII[ab.lIIlIlIll[209]] = "plant";
        ab.lIIlIlIII[ab.lIIlIlIll[210]] = "Water";
        ab.lIIlIlIII[ab.lIIlIlIll[211]] = "Harvest";
        ab.lIIlIlIII[ab.lIIlIlIll[212]] = "can(";
        ab.lIIlIlIII[ab.lIIlIlIll[213]] = "can(";
        ab.lIIlIlIII[ab.lIIlIlIll[214]] = "seedling";
        ab.lIIlIlIII[ab.lIIlIlIll[215]] = "plant";
        ab.lIIlIlIII[ab.lIIlIlIll[216]] = "Water";
        ab.lIIlIlIII[ab.lIIlIlIll[217]] = "Harvest";
        ab.lIIlIlIII[ab.lIIlIlIll[218]] = "seedling";
        ab.lIIlIlIII[ab.lIIlIlIll[219]] = "plant";
        ab.lIIlIlIII[ab.lIIlIlIll[220]] = "Water";
        ab.lIIlIlIII[ab.lIIlIlIll[221]] = "can(";
        ab.lIIlIlIII[ab.lIIlIlIll[222]] = "can(";
        ab.lIIlIlIII[ab.lIIlIlIll[223]] = "seedling";
        ab.lIIlIlIII[ab.lIIlIlIll[224]] = "plant";
        ab.lIIlIlIII[ab.lIIlIlIll[225]] = "Water";
        ab.lIIlIlIII[ab.lIIlIlIll[226]] = "can(";
        ab.lIIlIlIII[ab.lIIlIlIll[227]] = "can(";
        ab.lIIlIlIII[ab.lIIlIlIll[228]] = "seedling";
        ab.lIIlIlIII[ab.lIIlIlIll[229]] = "plant";
        ab.lIIlIlIII[ab.lIIlIlIll[230]] = "Water";
        ab.lIIlIlIII[ab.lIIlIlIll[231]] = "Harvest";
        ab.lIIlIlIII[ab.lIIlIlIll[232]] = "Tithe patch";
        ab.lIIlIlIII[ab.lIIlIlIll[233]] = "seed";
        ab.lIIlIlIII[ab.lIIlIlIll[234]] = "seed";
        ab.lIIlIlIII[ab.lIIlIlIll[235]] = "plant";
        ab.lIIlIlIII[ab.lIIlIlIll[236]] = "Water";
        ab.lIIlIlIII[ab.lIIlIlIll[237]] = "plant";
        ab.lIIlIlIII[ab.lIIlIlIll[238]] = "seedling";
        ab.lIIlIlIII[ab.lIIlIlIll[239]] = "fruit";
        ab.lIIlIlIII[ab.lIIlIlIll[240]] = "Sack";
        ab.lIIlIlIII[ab.lIIlIlIll[241]] = "Deposit";
        ab.lIIlIlIII[ab.lIIlIlIll[242]] = "fruit";
        ab.lIIlIlIII[ab.lIIlIlIll[243]] = "fruit";
        ab.lIIlIlIII[ab.lIIlIlIll[244]] = "Sack";
        ab.lIIlIlIII[ab.lIIlIlIll[245]] = "Deposit";
        ab.lIIlIlIII[ab.lIIlIlIll[246]] = "fruit";
        ab.lIIlIlIII[ab.lIIlIlIll[248]] = ab.llllIllIIll("A1zqnVx+3H4=", "sWXum");
        ab.lIIlIlIII[ab.lIIlIlIll[249]] = "Farming ";
    }

    private static void dt() {
        TileObject lIIIIlIlIIIIlII2;
        TileObject lIIIIlIlIIIIlIl;
        block61: {
            block62: {
                if (!ab.lllllIlIIll(ab.dy() ? 1 : 0)) break block61;
                WorldPoint worldPoint = new WorldPoint(lIIlIlIll[40], lIIlIlIll[41], lIIlIlIll[0]);
                if (!ab.lllllIlIIll(ab.dx() ? 1 : 0) || !ab.lllllIlIlll(Players.getLocal().getWorldLocation().distanceTo(worldPoint), lIIlIlIll[7])) break block62;
                AccBuilderEasyClues.c = lIIlIlIII[lIIlIlIll[35]];
                if (ab.lllllIlIIIl(Dialog.isOpen() ? 1 : 0)) {
                    Dialog.close();
                }
                try {
                    e.a((WorldPoint)lIIIIlIlIIIIlIl);

                }
                catch (Exception lIIIIlIlIIIIlII2) {
                    lIIIIlIlIIIIlII2.printStackTrace();
                }
                if (1 >= 2) {
                    return;
                }
                Time.sleepTicks((int)lIIlIlIll[1]);

            }
            if (ab.lllllIlIIIl(ab.dx() ? 1 : 0)) {
                if (ab.lllllIlIIIl(Inventory.contains(item -> item.getName().contains(lIIlIlIII[lIIlIlIll[246]])) ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIIlIlIII[lIIlIlIll[42]];
                    lIIIIlIlIIIIlII2 = TileObjects.getNearest(tileObject -> {
                        int n2;
                        if (ab.lllllIlIIIl(tileObject.getName().contains(lIIlIlIII[lIIlIlIll[244]]) ? 1 : 0)) {
                            String[] stringArray = new String[lIIlIlIll[1]];
                            stringArray[ab.lIIlIlIll[0]] = lIIlIlIII[lIIlIlIll[245]];
                            if (ab.lllllIlIIIl(tileObject.hasAction(stringArray) ? 1 : 0)) {
                                n2 = lIIlIlIll[1];

                                if (-1 < 0) return n2 != 0;
                                return false;
                            }
                        }
                        n2 = lIIlIlIll[0];
                        return n2 != 0;
                    });
                    if (ab.lllllIlIlIl(lIIIIlIlIIIIlII2)) {
                        AccBuilderEasyClues.c = lIIlIlIII[lIIlIlIll[43]];
                        lIIIIlIlIIIIlII2.interact(lIIlIlIII[lIIlIlIll[34]]);
                        Time.sleepTicks((int)lIIlIlIll[5]);

                    }
                }
                if (ab.lllllIlIIll(Inventory.contains(item -> item.getName().contains(lIIlIlIII[lIIlIlIll[243]])) ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIIlIlIII[lIIlIlIll[44]];
                    String[] stringArray = new String[lIIlIlIll[1]];
                    stringArray[ab.lIIlIlIll[0]] = lIIlIlIII[lIIlIlIll[10]];
                    TileObjects.getNearest((String[])stringArray).interact(lIIlIlIII[lIIlIlIll[45]]);
                    Time.sleepTicks((int)lIIlIlIll[4]);

                }
            }
            if (ab.lllllIllIII(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lIIIIlIlIIIIlIl), lIIlIlIll[7])) {
                AccBuilderEasyClues.c = lIIlIlIII[lIIlIlIll[46]];
                if (ab.lllllIlIIll(Dialog.isOpen() ? 1 : 0)) {
                    String[] stringArray = new String[lIIlIlIll[1]];
                    stringArray[ab.lIIlIlIll[0]] = lIIlIlIII[lIIlIlIll[47]];
                    TileObjects.getNearest((String[])stringArray).interact(lIIlIlIII[lIIlIlIll[48]]);
                    Time.sleepTicks((int)lIIlIlIll[4]);

                }
                if (ab.lllllIlIlII(Skills.getLevel((Skill)Skill.FARMING), lIIlIlIll[49])) {
                    String[] stringArray = new String[lIIlIlIll[1]];
                    stringArray[ab.lIIlIlIll[0]] = lIIlIlIII[lIIlIlIll[50]];
                    g.a(stringArray);
                }
                if (ab.lllllIlIlII(Skills.getLevel((Skill)Skill.FARMING), lIIlIlIll[51]) && ab.lllllIlIIlI(Skills.getLevel((Skill)Skill.FARMING), lIIlIlIll[49])) {
                    String[] stringArray = new String[lIIlIlIll[1]];
                    stringArray[ab.lIIlIlIll[0]] = lIIlIlIII[lIIlIlIll[52]];
                    g.a(stringArray);
                }
                if (ab.lllllIlIIlI(Skills.getLevel((Skill)Skill.FARMING), lIIlIlIll[51])) {
                    String[] stringArray = new String[lIIlIlIll[1]];
                    stringArray[ab.lIIlIlIll[0]] = lIIlIlIII[lIIlIlIll[53]];
                    g.a(stringArray);
                }
                if (ab.lllllIlIIIl(Dialog.isEnterInputOpen() ? 1 : 0)) {
                    Dialog.enterAmount((int)lIIlIlIll[54]);
                    Time.sleepTicks((int)lIIlIlIll[6]);

                }
            }
        }
        if (ab.lllllIlIIIl(ab.dy() ? 1 : 0)) {
            if (ab.lllllIlIIll(ab.dx() ? 1 : 0)) {
                kN = null;
                AccBuilderEasyClues.c = lIIlIlIII[lIIlIlIll[39]];
                if (ab.lllllIlIIll(Dialog.isOpen() ? 1 : 0)) {
                    String[] stringArray = new String[lIIlIlIll[1]];
                    stringArray[ab.lIIlIlIll[0]] = lIIlIlIII[lIIlIlIll[55]];
                    TileObjects.getNearest((String[])stringArray).interact(lIIlIlIII[lIIlIlIll[56]]);
                    Time.sleepTicks((int)lIIlIlIll[4]);

                }
                String[] stringArray = new String[lIIlIlIll[1]];
                stringArray[ab.lIIlIlIll[0]] = lIIlIlIII[lIIlIlIll[57]];
                g.a(stringArray);
            }
            if (ab.lllllIlIIIl(ab.dx() ? 1 : 0)) {
                String[] stringArray = new String[lIIlIlIll[1]];
                stringArray[ab.lIIlIlIll[0]] = lIIlIlIII[lIIlIlIll[58]];
                if (ab.lllllIlIlIl(TileObjects.getNearest((String[])stringArray))) {
                    String[] stringArray2 = new String[lIIlIlIll[1]];
                    stringArray2[ab.lIIlIlIll[0]] = lIIlIlIII[lIIlIlIll[59]];
                    kN = TileObjects.getNearest((String[])stringArray2).getWorldLocation();
                    ab.dw();
                }
                if (ab.lllllIlIlIl(kN)) {
                    String[] stringArray3 = new String[lIIlIlIll[1]];
                    stringArray3[ab.lIIlIlIll[0]] = lIIlIlIII[lIIlIlIll[60]];
                    if (ab.lllllIlIIIl(TileObjects.getNearest((String[])stringArray3).getWorldLocation().equals((Object)kN) ? 1 : 0)) {
                        if (ab.lllllIlIlll(Players.getLocal().getWorldLocation().distanceTo(kN), lIIlIlIll[37])) {
                            AccBuilderEasyClues.c = lIIlIlIII[lIIlIlIll[61]];
                            if (ab.lllllIlIIIl(Inventory.contains(item -> item.getName().contains(lIIlIlIII[lIIlIlIll[242]])) ? 1 : 0)) {
                                AccBuilderEasyClues.c = lIIlIlIII[lIIlIlIll[62]];
                                lIIIIlIlIIIIlIl = TileObjects.getNearest(tileObject -> {
                                    int n2;
                                    if (ab.lllllIlIIIl(tileObject.getName().contains(lIIlIlIII[lIIlIlIll[240]]) ? 1 : 0)) {
                                        String[] stringArray = new String[lIIlIlIll[1]];
                                        stringArray[ab.lIIlIlIll[0]] = lIIlIlIII[lIIlIlIll[241]];
                                        if (ab.lllllIlIIIl(tileObject.hasAction(stringArray) ? 1 : 0)) {
                                            n2 = lIIlIlIll[1];

                                            if (1 != (0xC3 ^ 0xC7)) return n2 != 0;
                                            return false;
                                        }
                                    }
                                    n2 = lIIlIlIll[0];
                                    return n2 != 0;
                                });
                                if (ab.lllllIlIlIl(lIIIIlIlIIIIlIl)) {
                                    AccBuilderEasyClues.c = lIIlIlIII[lIIlIlIll[3]];
                                    lIIIIlIlIIIIlIl.interact(lIIlIlIII[lIIlIlIll[63]]);
                                    Time.sleepTicks((int)lIIlIlIll[5]);

                                }
                            }
                            if (ab.lllllIlIIll(Inventory.contains(item -> item.getName().contains(lIIlIlIII[lIIlIlIll[239]])) ? 1 : 0)) {
                                AccBuilderEasyClues.c = lIIlIlIII[lIIlIlIll[64]];
                                String[] stringArray4 = new String[lIIlIlIll[1]];
                                stringArray4[ab.lIIlIlIll[0]] = lIIlIlIII[lIIlIlIll[65]];
                                TileObjects.getNearest((String[])stringArray4).interact(lIIlIlIII[lIIlIlIll[66]]);
                                Time.sleepTicks((int)lIIlIlIll[4]);

                            }
                        }
                        if (ab.lllllIlIIll(ab.dz() ? 1 : 0) && ab.lllllIllIII(Players.getLocal().getWorldLocation().distanceTo(kN), lIIlIlIll[37])) {
                            TileObject lIIIIlIlIIIIIll;
                            lIIIIlIlIIIIlIl = TileObjects.getNearest(tileObject -> tileObject.getName().contains(lIIlIlIII[lIIlIlIll[238]]));
                            lIIIIlIlIIIIlII2 = TileObjects.getNearest(tileObject -> tileObject.getName().contains(lIIlIlIII[lIIlIlIll[237]]));
                            if (ab.lllllIllIIl(lIIIIlIlIIIIlIl) && ab.lllllIllIIl(lIIIIlIlIIIIlII2)) {
                                if (ab.lllllIlIIll(Movement.isRunEnabled() ? 1 : 0) && ab.lllllIlIlll(Movement.getRunEnergy(), lIIlIlIll[47])) {
                                    Movement.toggleRun();
                                    Time.sleepTicks((int)lIIlIlIll[7]);

                                }
                                int[] nArray = new int[lIIlIlIll[1]];
                                nArray[ab.lIIlIlIll[0]] = lIIlIlIll[9];
                                if (ab.lllllIlIIIl(Inventory.contains((int[])nArray) ? 1 : 0) && ab.lllllIlIlIl(lIIIIlIlIIIIIll = TileObjects.getNearest(tileObject -> {
                                    int n2;
                                    if (ab.lllllIlIIIl(tileObject.getName().contains(lIIlIlIII[lIIlIlIll[236]]) ? 1 : 0) && ab.lllllIllIII(tileObject.getWorldLocation().distanceTo(kN), lIIlIlIll[12])) {
                                        n2 = lIIlIlIll[1];

                                        if (1 > (0x2E ^ 0x2A)) {
                                            return false;
                                        }
                                    } else {
                                        n2 = lIIlIlIll[0];
                                    }
                                    return n2 != 0;
                                }))) {
                                    AccBuilderEasyClues.c = lIIlIlIII[lIIlIlIll[67]];
                                    int[] nArray2 = new int[lIIlIlIll[1]];
                                    nArray2[ab.lIIlIlIll[0]] = lIIlIlIll[9];
                                    Inventory.getFirst((int[])nArray2).useOn(lIIIIlIlIIIIIll);
                                    Time.sleepTicks((int)lIIlIlIll[6]);

                                }
                                int[] nArray3 = new int[lIIlIlIll[1]];
                                nArray3[ab.lIIlIlIll[0]] = lIIlIlIll[9];
                                if (ab.lllllIlIIll(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                                    if (ab.lllllIlIIll(Players.getLocal().getWorldLocation().equals((Object)kO) ? 1 : 0)) {
                                        int[] nArray4 = new int[lIIlIlIll[1]];
                                        nArray4[ab.lIIlIlIll[0]] = lIIlIlIll[9];
                                        if (ab.lllllIlIIll(Inventory.contains((int[])nArray4) ? 1 : 0)) {
                                            AccBuilderEasyClues.c = lIIlIlIII[lIIlIlIll[68]];
                                            e.c(kO);
                                            Time.sleepTicks((int)lIIlIlIll[1]);

                                        }
                                    }
                                    if (ab.lllllIlIIIl(Players.getLocal().getWorldLocation().equals((Object)kO) ? 1 : 0) && ab.lllllIllIIl(TileObjects.getNearest(tileObject -> {
                                        int n2;
                                        if (ab.lllllIlIIIl(tileObject.getName().contains(lIIlIlIII[lIIlIlIll[235]]) ? 1 : 0) && ab.lllllIllIII(tileObject.getWorldLocation().distanceTo(Players.getLocal().getWorldLocation()), lIIlIlIll[7])) {
                                            n2 = lIIlIlIll[1];

                                            if (1 < -1) {
                                                return false;
                                            }
                                        } else {
                                            n2 = lIIlIlIll[0];
                                        }
                                        return n2 != 0;
                                    }))) {
                                        int[] nArray5 = new int[lIIlIlIll[1]];
                                        nArray5[ab.lIIlIlIll[0]] = lIIlIlIll[9];
                                        if (ab.lllllIlIIll(Inventory.contains((int[])nArray5) ? 1 : 0)) {
                                            if (ab.lllllIlIIlI(Movement.getRunEnergy(), lIIlIlIll[69])) {
                                                AccBuilderEasyClues.c = lIIlIlIII[lIIlIlIll[70]];
                                                Time.sleepTicks((int)lIIlIlIll[1]);

                                            }
                                            if (ab.lllllIlIlII(Movement.getRunEnergy(), lIIlIlIll[69])) {
                                                AccBuilderEasyClues.c = lIIlIlIII[lIIlIlIll[71]];
                                                if (ab.lllllIlIIIl(Inventory.contains(item -> item.getName().contains(lIIlIlIII[lIIlIlIll[234]])) ? 1 : 0)) {
                                                    Inventory.getFirst(item -> item.getName().contains(lIIlIlIII[lIIlIlIll[233]])).useOn(TileObjects.getNearest(tileObject -> {
                                                        int n2;
                                                        if (ab.lllllIlIIIl(tileObject.getName().contains(lIIlIlIII[lIIlIlIll[232]]) ? 1 : 0) && ab.lllllIllIII(tileObject.getWorldLocation().distanceTo(li), lIIlIlIll[4])) {
                                                            n2 = lIIlIlIll[1];

                                                            if (((0x5B ^ 0x1B) & ~(0x1D ^ 0x5D)) != 0) {
                                                                return false;
                                                            }
                                                        } else {
                                                            n2 = lIIlIlIll[0];
                                                        }
                                                        return n2 != 0;
                                                    }));
                                                    Time.sleepTicks((int)lIIlIlIll[1]);

                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            if (!ab.lllllIllIIl(lIIIIlIlIIIIlIl) || ab.lllllIlIlIl(lIIIIlIlIIIIlII2)) {
                                lIIIIlIlIIIIIll = TileObjects.getNearest(tileObject -> {
                                    int n2;
                                    block4: {
                                        TileObject lIIIIlIIlIIIIII;
                                        block5: {
                                            if (ab.lllllIlIIll(tileObject.getName().contains(lIIlIlIII[lIIlIlIll[228]]) ? 1 : 0) && !ab.lllllIlIIIl(tileObject.getName().contains(lIIlIlIII[lIIlIlIll[229]]) ? 1 : 0)) break block4;
                                            String[] stringArray = new String[lIIlIlIll[1]];
                                            stringArray[ab.lIIlIlIll[0]] = lIIlIlIII[lIIlIlIll[230]];
                                            if (!ab.lllllIlIIll(lIIIIlIIlIIIIII.hasAction(stringArray) ? 1 : 0)) break block5;
                                            String[] stringArray2 = new String[lIIlIlIll[1]];
                                            stringArray2[ab.lIIlIlIll[0]] = lIIlIlIII[lIIlIlIll[231]];
                                            if (!ab.lllllIlIIIl(lIIIIlIIlIIIIII.hasAction(stringArray2) ? 1 : 0)) break block4;
                                        }
                                        if (ab.lllllIllIII(lIIIIlIIlIIIIII.getWorldLocation().distanceTo(Players.getLocal().getWorldLocation()), lIIlIlIll[6])) {
                                            n2 = lIIlIlIll[1];

                                            if ((107 + 81 - 77 + 17 ^ 85 + 107 - 174 + 114) > 2) return n2 != 0;
                                            return ((72 + 177 - 37 + 22 ^ 134 + 44 - 32 + 45) & (0x38 ^ 0x46 ^ (0x25 ^ 0xE) ^ -1)) != 0;
                                        }
                                    }
                                    n2 = lIIlIlIll[0];
                                    return n2 != 0;
                                });
                                if (ab.lllllIlIlIl(lIIIIlIlIIIIIll) && ab.lllllIlIIll(kK ? 1 : 0)) {
                                    String[] stringArray5 = new String[lIIlIlIll[1]];
                                    stringArray5[ab.lIIlIlIll[0]] = lIIlIlIII[lIIlIlIll[72]];
                                    if (ab.lllllIlIIIl(lIIIIlIlIIIIIll.hasAction(stringArray5) ? 1 : 0)) {
                                        if (ab.lllllIlIIlI(Players.getLocal().getWorldLocation().distanceTo(lh), lIIlIlIll[5]) && ab.lllllIlIlIl(ab.e(lh))) {
                                            AccBuilderEasyClues.c = lIIlIlIII[lIIlIlIll[73]];
                                            if (ab.lllllIlIIIl(Inventory.contains(item -> item.getName().contains(lIIlIlIII[lIIlIlIll[227]])) ? 1 : 0)) {
                                                Inventory.getFirst(item -> item.getName().contains(lIIlIlIII[lIIlIlIll[226]])).useOn(TileObjects.getNearest(tileObject -> {
                                                    int n2;
                                                    if (!ab.lllllIlIIll(tileObject.getName().contains(lIIlIlIII[lIIlIlIll[223]]) ? 1 : 0) || ab.lllllIlIIIl(tileObject.getName().contains(lIIlIlIII[lIIlIlIll[224]]) ? 1 : 0)) {
                                                        TileObject lIIIIlIIlIIIIlI;
                                                        String[] stringArray = new String[lIIlIlIll[1]];
                                                        stringArray[ab.lIIlIlIll[0]] = lIIlIlIII[lIIlIlIll[225]];
                                                        if (ab.lllllIlIIIl(lIIIIlIIlIIIIlI.hasAction(stringArray) ? 1 : 0) && ab.lllllIllIII(lIIIIlIIlIIIIlI.getWorldLocation().distanceTo(Players.getLocal().getWorldLocation()), lIIlIlIll[7])) {
                                                            n2 = lIIlIlIll[1];

                                                            if (-(82 + 166 - 200 + 135 ^ 46 + 13 - 44 + 163) < 0) return n2 != 0;
                                                            return ((0x8E ^ 0xBE ^ (0x7D ^ 0x5D)) & (0xF6 ^ 0xAF ^ (0x7E ^ 0x37) ^ -1)) != 0;
                                                        }
                                                    }
                                                    n2 = lIIlIlIll[0];
                                                    return n2 != 0;
                                                }));
                                                Time.sleepTicks((int)lIIlIlIll[1]);

                                                return;
                                            }
                                        }
                                        if (ab.lllllIlIlII(Players.getLocal().getWorldLocation().distanceTo(lh), lIIlIlIll[5])) {
                                            AccBuilderEasyClues.c = lIIlIlIII[lIIlIlIll[2]];
                                            if (ab.lllllIlIIIl(Inventory.contains(item -> item.getName().contains(lIIlIlIII[lIIlIlIll[222]])) ? 1 : 0)) {
                                                Inventory.getFirst(item -> item.getName().contains(lIIlIlIII[lIIlIlIll[221]])).useOn(TileObjects.getNearest(tileObject -> {
                                                    int n2;
                                                    if (!ab.lllllIlIIll(tileObject.getName().contains(lIIlIlIII[lIIlIlIll[218]]) ? 1 : 0) || ab.lllllIlIIIl(tileObject.getName().contains(lIIlIlIII[lIIlIlIll[219]]) ? 1 : 0)) {
                                                        TileObject lIIIIlIIlIIIlII;
                                                        String[] stringArray = new String[lIIlIlIll[1]];
                                                        stringArray[ab.lIIlIlIll[0]] = lIIlIlIII[lIIlIlIll[220]];
                                                        if (ab.lllllIlIIIl(lIIIIlIIlIIIlII.hasAction(stringArray) ? 1 : 0) && ab.lllllIllIII(lIIIIlIIlIIIlII.getWorldLocation().distanceTo(Players.getLocal().getWorldLocation()), lIIlIlIll[7])) {
                                                            n2 = lIIlIlIll[1];

                                                            if ((0x7D ^ 0x6C ^ (0x11 ^ 4)) != 0) return n2 != 0;
                                                            return ((0x5F ^ 0x56 ^ (0xF2 ^ 0xA0)) & (90 + 85 - 104 + 159 ^ 141 + 98 - 131 + 81 ^ -1)) != 0;
                                                        }
                                                    }
                                                    n2 = lIIlIlIll[0];
                                                    return n2 != 0;
                                                }));
                                                Time.sleepTicks((int)lIIlIlIll[1]);

                                                return;
                                            }
                                        }
                                    }
                                    String[] stringArray6 = new String[lIIlIlIll[1]];
                                    stringArray6[ab.lIIlIlIll[0]] = lIIlIlIII[lIIlIlIll[74]];
                                    if (ab.lllllIlIIIl(lIIIIlIlIIIIIll.hasAction(stringArray6) ? 1 : 0)) {
                                        AccBuilderEasyClues.c = lIIlIlIII[lIIlIlIll[75]];
                                        lIIIIlIlIIIIIll.interact(lIIlIlIII[lIIlIlIll[76]]);
                                        Time.sleepTicks((int)lIIlIlIll[1]);

                                        return;
                                    }
                                }
                                if (ab.lllllIllIIl(lIIIIlIlIIIIIll) && ab.lllllIlIIll(kK ? 1 : 0)) {
                                    ab.dv();
                                    if (ab.lllllIlIlIl(ab.e(lh))) {
                                        kK = lIIlIlIll[1];
                                    }
                                }
                                if (ab.lllllIlIIIl(kK ? 1 : 0)) {
                                    if (ab.lllllIlIIIl(kL.isEmpty() ? 1 : 0)) {
                                        ab.du();
                                    }
                                    while (ab.lllllIlIIll(kL.isEmpty() ? 1 : 0) && ab.lllllIlIIll(AccBuilderEasyClues.d ? 1 : 0) && ab.lllllIllIII(Players.getLocal().getWorldLocation().distanceTo(kN), lIIlIlIll[37])) {
                                        String[] stringArray7 = new String[lIIlIlIll[1]];
                                        stringArray7[ab.lIIlIlIll[0]] = lIIlIlIII[lIIlIlIll[77]];
                                        if (ab.lllllIlIIll(TileObjects.getNearest((String[])stringArray7).getWorldLocation().equals((Object)kN) ? 1 : 0)) {
                                            String[] stringArray8 = new String[lIIlIlIll[1]];
                                            stringArray8[ab.lIIlIlIll[0]] = lIIlIlIII[lIIlIlIll[37]];
                                            kN = TileObjects.getNearest((String[])stringArray8).getWorldLocation();
                                            Time.sleepTicks((int)lIIlIlIll[4]);

                                            ab.dw();

                                            if (1 >= -1) break;
                                            return;
                                        }
                                        if (ab.lllllIlIIll(Players.getLocal().getWorldLocation().equals((Object)kL.get(lIIlIlIll[0])) ? 1 : 0)) {
                                            AccBuilderEasyClues.c = "Nav to tile " + String.valueOf(kL.get(lIIlIlIll[0]));
                                            e.c(kL.get(lIIlIlIll[0]));
                                            Time.sleepTicks((int)lIIlIlIll[1]);

                                        }
                                        if (!ab.lllllIlIIIl(Players.getLocal().getWorldLocation().equals((Object)kL.get(lIIlIlIll[0])) ? 1 : 0)) continue;
                                        TileObject lIIIIlIlIIIIIlI = TileObjects.getNearest(tileObject -> {
                                            int n2;
                                            block4: {
                                                TileObject lIIIIlIIlIIIllI;
                                                block5: {
                                                    if (ab.lllllIlIIll(tileObject.getName().contains(lIIlIlIII[lIIlIlIll[214]]) ? 1 : 0) && !ab.lllllIlIIIl(tileObject.getName().contains(lIIlIlIII[lIIlIlIll[215]]) ? 1 : 0)) break block4;
                                                    String[] stringArray = new String[lIIlIlIll[1]];
                                                    stringArray[ab.lIIlIlIll[0]] = lIIlIlIII[lIIlIlIll[216]];
                                                    if (!ab.lllllIlIIll(lIIIIlIIlIIIllI.hasAction(stringArray) ? 1 : 0)) break block5;
                                                    String[] stringArray2 = new String[lIIlIlIll[1]];
                                                    stringArray2[ab.lIIlIlIll[0]] = lIIlIlIII[lIIlIlIll[217]];
                                                    if (!ab.lllllIlIIIl(lIIIIlIIlIIIllI.hasAction(stringArray2) ? 1 : 0)) break block4;
                                                }
                                                if (ab.lllllIllIII(lIIIIlIIlIIIllI.getWorldLocation().distanceTo(kM.get(lIIlIlIll[0])), lIIlIlIll[4])) {
                                                    n2 = lIIlIlIll[1];

                                                    if (((0x22 ^ 0x3A) & ~(0x8A ^ 0x92)) == 0) return n2 != 0;
                                                    return false;
                                                }
                                            }
                                            n2 = lIIlIlIll[0];
                                            return n2 != 0;
                                        });
                                        if (ab.lllllIlIlIl(lIIIIlIlIIIIIlI)) {
                                            String[] stringArray9 = new String[lIIlIlIll[1]];
                                            stringArray9[ab.lIIlIlIll[0]] = lIIlIlIII[lIIlIlIll[78]];
                                            if (ab.lllllIlIIIl(lIIIIlIlIIIIIlI.hasAction(stringArray9) ? 1 : 0)) {
                                                AccBuilderEasyClues.c = lIIlIlIII[lIIlIlIll[79]];
                                                if (ab.lllllIlIIIl(Inventory.contains(item -> item.getName().contains(lIIlIlIII[lIIlIlIll[213]])) ? 1 : 0)) {
                                                    Inventory.getFirst(item -> item.getName().contains(lIIlIlIII[lIIlIlIll[212]])).useOn(lIIIIlIlIIIIIlI);
                                                    Time.sleepTicks((int)lIIlIlIll[1]);

                                                }
                                            }
                                            String[] stringArray10 = new String[lIIlIlIll[1]];
                                            stringArray10[ab.lIIlIlIll[0]] = lIIlIlIII[lIIlIlIll[80]];
                                            if (ab.lllllIlIIIl(lIIIIlIlIIIIIlI.hasAction(stringArray10) ? 1 : 0)) {
                                                AccBuilderEasyClues.c = lIIlIlIII[lIIlIlIll[51]];
                                                lIIIIlIlIIIIIlI.interact(lIIlIlIII[lIIlIlIll[81]]);
                                                Time.sleepTicks((int)lIIlIlIll[1]);

                                                if (ab.lllllIlIIIl(kL.get(lIIlIlIll[0]).equals((Object)lh) ? 1 : 0)) {
                                                    AccBuilderEasyClues.c = lIIlIlIII[lIIlIlIll[82]];
                                                    Time.sleepTicks((int)lIIlIlIll[22]);

                                                }
                                            }
                                        }
                                        if (ab.lllllIlIIIl(kL.get(lIIlIlIll[0]).equals((Object)lg) ? 1 : 0)) {
                                            AccBuilderEasyClues.c = lIIlIlIII[lIIlIlIll[83]];
                                            Time.sleepUntil(() -> {
                                                boolean bl;
                                                if (ab.lllllIlIlIl(TileObjects.getNearest(tileObject -> {
                                                    int n2;
                                                    block4: {
                                                        TileObject lIIIIlIIlIIlIII;
                                                        block5: {
                                                            if (ab.lllllIlIIll(tileObject.getName().contains(lIIlIlIII[lIIlIlIll[208]]) ? 1 : 0) && !ab.lllllIlIIIl(tileObject.getName().contains(lIIlIlIII[lIIlIlIll[209]]) ? 1 : 0)) break block4;
                                                            String[] stringArray = new String[lIIlIlIll[1]];
                                                            stringArray[ab.lIIlIlIll[0]] = lIIlIlIII[lIIlIlIll[210]];
                                                            if (!ab.lllllIlIIll(lIIIIlIIlIIlIII.hasAction(stringArray) ? 1 : 0)) break block5;
                                                            String[] stringArray2 = new String[lIIlIlIll[1]];
                                                            stringArray2[ab.lIIlIlIll[0]] = lIIlIlIII[lIIlIlIll[211]];
                                                            if (!ab.lllllIlIIIl(lIIIIlIIlIIlIII.hasAction(stringArray2) ? 1 : 0)) break block4;
                                                        }
                                                        if (ab.lllllIllIII(lIIIIlIIlIIlIII.getWorldLocation().distanceTo(lB), lIIlIlIll[4])) {
                                                            n2 = lIIlIlIll[1];

                                                            if ((0xA3 ^ 0xA7) > ((0x61 ^ 0x70) & ~(0x51 ^ 0x40))) return n2 != 0;
                                                            return false;
                                                        }
                                                    }
                                                    n2 = lIIlIlIll[0];
                                                    return n2 != 0;
                                                }))) {
                                                    bl = lIIlIlIll[1];

                                                    if (-1 > (0x7F ^ 0x3E ^ (0xC0 ^ 0x85))) {
                                                        return ((0x54 ^ 0x12 ^ (0x16 ^ 0x5D)) & (72 + 35 - 82 + 127 ^ 106 + 67 - 83 + 59 ^ -1)) != 0;
                                                    }
                                                } else {
                                                    bl = lIIlIlIll[0];
                                                }
                                                return bl;
                                            }, (int)lIIlIlIll[84]);

                                        }
                                        if (ab.lllllIllIIl(lIIIIlIlIIIIIlI)) {
                                            kL.remove(lIIlIlIll[0]);

                                            kM.remove(lIIlIlIll[0]);

                                        }

                                        if (1 <= (0x3E ^ 0x3A)) continue;
                                        return;
                                    }
                                    if (ab.lllllIllIIl(ab.e(lh))) {
                                        kK = lIIlIlIll[0];
                                    }
                                }
                            }
                        }
                        if (ab.lllllIlIIIl(ab.dz() ? 1 : 0) && ab.lllllIlIlIl(lIIIIlIlIIIIlIl = TileObjects.getNearest(tileObject -> {
                            int n2;
                            if (ab.lllllIlIIIl(tileObject.getName().contains(lIIlIlIII[lIIlIlIll[207]]) ? 1 : 0) && ab.lllllIllIII(tileObject.getWorldLocation().distanceTo(kN), lIIlIlIll[12])) {
                                n2 = lIIlIlIll[1];

                                if (3 < 1) {
                                    return false;
                                }
                            } else {
                                n2 = lIIlIlIll[0];
                            }
                            return n2 != 0;
                        }))) {
                            AccBuilderEasyClues.c = lIIlIlIII[lIIlIlIll[85]];
                            lIIIIlIlIIIIlIl.interact(lIIlIlIII[lIIlIlIll[86]]);
                            Time.sleepTicks((int)lIIlIlIll[5]);

                        }
                    }
                }
            }
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean ABHelper() {
        int n2;
        if (ab.lllllIlIlII(Skills.getLevel((Skill)Skill.FARMING), lIIlIlIll[3])) {
            int n3;
            if (ab.lllllIlIIIl(Inventory.contains(item -> item.getName().contains(lIIlIlIII[lIIlIlIll[142]])) ? 1 : 0)) {
                String[] stringArray = new String[lIIlIlIll[1]];
                stringArray[ab.lIIlIlIll[0]] = lIIlIlIII[lIIlIlIll[133]];
                if (ab.lllllIlIIIl(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    int[] nArray = new int[lIIlIlIll[1]];
                    nArray[ab.lIIlIlIll[0]] = lIIlIlIll[24];
                    if (ab.lllllIlIIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        n3 = lIIlIlIll[1];

                        if (null == null) return n3 != 0;
                        return false;
                    }
                }
            }
            n3 = lIIlIlIll[0];
            return n3 != 0;
        }
        int[] nArray = new int[lIIlIlIll[1]];
        nArray[ab.lIIlIlIll[0]] = lIIlIlIll[13];
        if (ab.lllllIlIIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
            int[] nArray2 = new int[lIIlIlIll[1]];
            nArray2[ab.lIIlIlIll[0]] = lIIlIlIll[15];
            if (ab.lllllIlIIIl(Inventory.contains((int[])nArray2) ? 1 : 0)) {
                int[] nArray3 = new int[lIIlIlIll[1]];
                nArray3[ab.lIIlIlIll[0]] = lIIlIlIll[14];
                if (!(!ab.lllllIlIIIl(Inventory.contains((int[])nArray3) ? 1 : 0) || ab.lllllIlIIll(Inventory.contains((int[])f.aO) ? 1 : 0) && !ab.lllllIlIIIl(Equipment.contains((int[])f.aO) ? 1 : 0) || ab.lllllIlIIll(Inventory.contains((int[])f.bf) ? 1 : 0) && !ab.lllllIlIIIl(Equipment.contains((int[])f.bf) ? 1 : 0))) {
                    n2 = lIIlIlIll[1];

                    if (-1 <= 0) return n2 != 0;
                    return ((59 + 47 - 23 + 53 ^ 15 + 133 - 47 + 43) & (0x76 ^ 0x6B ^ (0x8D ^ 0x88) ^ -1)) != 0;
                }
            }
        }
        n2 = lIIlIlIll[0];
        return n2 != 0;
    }

    static {
        ab.lllllIlIIII();
        ab.lllllIIIlIl();
        bv = new ArrayList<d>();
        kx = lIIlIlIll[247];
        ky = lIIlIlIll[21];
        bZ = lIIlIlIll[0];
        kL = new ArrayList();
        kM = new ArrayList();
        kN = null;
        kO = null;
        kP = null;
        kQ = null;
        kR = null;
        kS = null;
        kT = null;
        kU = null;
        kV = null;
        kW = null;
        kX = null;
        kY = null;
        kZ = null;
        la = null;
        lb = null;
        lc = null;
        ld = null;
        le = null;
        lf = null;
        lg = null;
        lh = null;
        cc = lIIlIlIII[lIIlIlIll[248]];
        h = lIIlIlIII[lIIlIlIll[249]];
    }

    public static void af() {
        d lIIIIlIIlllllII;
        block16: {
            block15: {
                int[] nArray = new int[lIIlIlIll[1]];
                nArray[ab.lIIlIlIll[0]] = lIIlIlIll[16];
                if (ab.lllllIlIIll(Bank.contains((int[])nArray) ? 1 : 0)) {
                    d d2 = new DHelper(lIIlIlIll[16], lIIlIlIll[1], lIIlIlIll[134]);
                    bv.add(d2);

                }
                int[] nArray2 = new int[lIIlIlIll[1]];
                nArray2[ab.lIIlIlIll[0]] = lIIlIlIll[17];
                if (ab.lllllIlIIll(Bank.contains((int[])nArray2) ? 1 : 0)) {
                    lIIIIlIIlllllII = new DHelper(lIIlIlIll[17], lIIlIlIll[4], lIIlIlIll[135]);
                    bv.add(lIIIIlIIlllllII);

                }
                int[] nArray3 = new int[lIIlIlIll[1]];
                nArray3[ab.lIIlIlIll[0]] = lIIlIlIll[31];
                if (ab.lllllIlIIll(Bank.contains((int[])nArray3) ? 1 : 0)) {
                    lIIIIlIIlllllII = new DHelper(lIIlIlIll[31], lIIlIlIll[1], lIIlIlIll[135]);
                    bv.add(lIIIIlIIlllllII);

                }
                int[] nArray4 = new int[lIIlIlIll[1]];
                nArray4[ab.lIIlIlIll[0]] = lIIlIlIll[36];
                if (ab.lllllIlIIll(Bank.contains((int[])nArray4) ? 1 : 0)) {
                    lIIIIlIIlllllII = new DHelper(lIIlIlIll[36], lIIlIlIll[1], lIIlIlIll[135]);
                    bv.add(lIIIIlIIlllllII);

                }
                int[] nArray5 = new int[lIIlIlIll[1]];
                nArray5[ab.lIIlIlIll[0]] = lIIlIlIll[24];
                if (ab.lllllIlIIll(Bank.contains((int[])nArray5) ? 1 : 0)) {
                    lIIIIlIIlllllII = new DHelper(lIIlIlIll[24], lIIlIlIll[1], lIIlIlIll[135]);
                    bv.add(lIIIIlIIlllllII);

                }
                int[] nArray6 = new int[lIIlIlIll[1]];
                nArray6[ab.lIIlIlIll[0]] = lIIlIlIll[9];
                if (!ab.lllllIlIIIl(Bank.contains((int[])nArray6) ? 1 : 0)) break block15;
                int[] nArray7 = new int[lIIlIlIll[1]];
                nArray7[ab.lIIlIlIll[0]] = lIIlIlIll[9];
                if (!ab.lllllIlIIIl(Bank.contains((int[])nArray7) ? 1 : 0)) break block16;
                int[] nArray8 = new int[lIIlIlIll[1]];
                nArray8[ab.lIIlIlIll[0]] = lIIlIlIll[9];
                if (!ab.lllllIlIIlI(Bank.getFirst((int[])nArray8).getQuantity(), lIIlIlIll[10])) break block16;
            }
            lIIIIlIIlllllII = new DHelper(lIIlIlIll[9], lIIlIlIll[10], lIIlIlIll[136]);
            bv.add(lIIIIlIIlllllII);

        }
        int[] nArray = new int[lIIlIlIll[1]];
        nArray[ab.lIIlIlIll[0]] = lIIlIlIll[13];
        if (ab.lllllIlIIll(Bank.contains((int[])nArray) ? 1 : 0)) {
            lIIIIlIIlllllII = new DHelper(lIIlIlIll[13], lIIlIlIll[12], lIIlIlIll[137]);
            bv.add(lIIIIlIIlllllII);

        }
        int[] nArray9 = new int[lIIlIlIll[1]];
        nArray9[ab.lIIlIlIll[0]] = lIIlIlIll[19];
        if (ab.lllllIlIIll(Bank.contains((int[])nArray9) ? 1 : 0)) {
            lIIIIlIIlllllII = new DHelper(lIIlIlIll[19], lIIlIlIll[12], lIIlIlIll[138]);
            bv.add(lIIIIlIIlllllII);

        }
        int[] nArray10 = new int[lIIlIlIll[1]];
        nArray10[ab.lIIlIlIll[0]] = lIIlIlIll[15];
        if (ab.lllllIlIIll(Bank.contains((int[])nArray10) ? 1 : 0)) {
            lIIIIlIIlllllII = new DHelper(lIIlIlIll[15], lIIlIlIll[12], lIIlIlIll[138]);
            bv.add(lIIIIlIIlllllII);

        }
        int[] nArray11 = new int[lIIlIlIll[1]];
        nArray11[ab.lIIlIlIll[0]] = lIIlIlIll[14];
        if (ab.lllllIlIIll(Bank.contains((int[])nArray11) ? 1 : 0)) {
            lIIIIlIIlllllII = new DHelper(lIIlIlIll[14], lIIlIlIll[12], lIIlIlIll[138]);
            bv.add(lIIIIlIIlllllII);

        }
        int[] nArray12 = new int[lIIlIlIll[1]];
        nArray12[ab.lIIlIlIll[0]] = lIIlIlIll[21];
        if (ab.lllllIlIIll(Bank.contains((int[])nArray12) ? 1 : 0)) {
            lIIIIlIIlllllII = new DHelper(ky, lIIlIlIll[68], lIIlIlIll[139]);
            bv.add(lIIIIlIIlllllII);

        }
        int[] nArray13 = new int[lIIlIlIll[1]];
        nArray13[ab.lIIlIlIll[0]] = lIIlIlIll[140];
        if (ab.lllllIlIIll(Bank.contains((int[])nArray13) ? 1 : 0)) {
            lIIIIlIIlllllII = new DHelper(lIIlIlIll[140], lIIlIlIll[1], lIIlIlIll[141]);
            bv.add(lIIIIlIIlllllII);

        }
        int[] nArray14 = new int[lIIlIlIll[1]];
        nArray14[ab.lIIlIlIll[0]] = lIIlIlIll[18];
        if (ab.lllllIlIIll(Bank.contains((int[])nArray14) ? 1 : 0)) {
            lIIIIlIIlllllII = new DHelper(lIIlIlIll[18], lIIlIlIll[47], i.bq);
            bv.add(lIIIIlIIlllllII);

        }
    }

    @Override
    public boolean V() {
        boolean bl;
        if (ab.lllllIlIlII(Skills.getLevel((Skill)Skill.FARMING), lIIlIlIll[2])) {
            bl = lIIlIlIll[1];

            }
        } else {
            bl = lIIlIlIll[0];
        }
        return bl;
    }

    private static boolean lllllIlIlll(int n2, int n3) {
        return n2 > n3;
    }

    private static TileObject e(WorldPoint worldPoint) {
        return TileObjects.getNearest(tileObject -> {
            boolean bl;
            WorldPoint lIIIIlIIlIIllIl;
            void lIIIIlIIlIIllII;
            if ((!ab.lllllIlIIll(tileObject.getName().contains(lIIlIlIII[lIIlIlIll[205]]) ? 1 : 0) || ab.lllllIlIIIl(tileObject.getName().contains(lIIlIlIII[lIIlIlIll[206]]) ? 1 : 0)) && ab.lllllIllIII(lIIIIlIIlIIllII.getWorldLocation().distanceTo(lIIIIlIIlIIllIl), lIIlIlIll[4])) {
                bl = lIIlIlIll[1];

                if (-(103 + 2 - 24 + 85 ^ 123 + 33 - 153 + 159) > 0) {
                    return false;
                }
            } else {
                bl = lIIlIlIll[0];
            }
            return bl;
        });
    }

    private static boolean lllllIlIlIl(Object object) {
        return object != null;
    }

    private static void dw() {
        System.out.println(TileObjects.getNearest(tileObject -> tileObject.getName().contains(lIIlIlIII[lIIlIlIll[143]])).getWorldLocation());
        kO = new WorldPoint(kN.getX() + lIIlIlIll[22], kN.getY() - lIIlIlIll[42], kN.getPlane());
        kP = new WorldPoint(kN.getX() + lIIlIlIll[23], kN.getY() - lIIlIlIll[42], kN.getPlane());
        kQ = new WorldPoint(kN.getX() + lIIlIlIll[22], kN.getY() - lIIlIlIll[23], kN.getPlane());
        kR = new WorldPoint(kN.getX() + lIIlIlIll[23], kN.getY() - lIIlIlIll[23], kN.getPlane());
        kS = new WorldPoint(kN.getX() + lIIlIlIll[22], kN.getY() - lIIlIlIll[11], kN.getPlane());
        kT = new WorldPoint(kN.getX() + lIIlIlIll[23], kN.getY() - lIIlIlIll[11], kN.getPlane());
        kU = new WorldPoint(kN.getX() + lIIlIlIll[22], kN.getY() - lIIlIlIll[5], kN.getPlane());
        kV = new WorldPoint(kN.getX() + lIIlIlIll[23], kN.getY() - lIIlIlIll[5], kN.getPlane());
        kW = new WorldPoint(kN.getX() + lIIlIlIll[22], kN.getY() + lIIlIlIll[5], kN.getPlane());
        kX = new WorldPoint(kN.getX() + lIIlIlIll[23], kN.getY() + lIIlIlIll[5], kN.getPlane());
        kY = new WorldPoint(kN.getX() + lIIlIlIll[22], kN.getY() + lIIlIlIll[11], kN.getPlane());
        kZ = new WorldPoint(kN.getX() + lIIlIlIll[23], kN.getY() + lIIlIlIll[11], kN.getPlane());
        la = new WorldPoint(kN.getX() + lIIlIlIll[22], kN.getY() + lIIlIlIll[23], kN.getPlane());
        lb = new WorldPoint(kN.getX() + lIIlIlIll[23], kN.getY() + lIIlIlIll[23], kN.getPlane());
        lc = new WorldPoint(kN.getX() + lIIlIlIll[22], kN.getY() + lIIlIlIll[35], kN.getPlane());
        ld = new WorldPoint(kN.getX() + lIIlIlIll[23], kN.getY() + lIIlIlIll[35], kN.getPlane());
        le = new WorldPoint(kN.getX() + lIIlIlIll[43], kN.getY() + lIIlIlIll[42], kN.getPlane());
        lf = new WorldPoint(kN.getX() + lIIlIlIll[43], kN.getY() + lIIlIlIll[23], kN.getPlane());
        lg = new WorldPoint(kN.getX() + lIIlIlIll[43], kN.getY() + lIIlIlIll[11], kN.getPlane());
        lh = new WorldPoint(kN.getX() + lIIlIlIll[43], kN.getY() + lIIlIlIll[5], kN.getPlane());
        li = new WorldPoint(kO.getX() - lIIlIlIll[4], kO.getY(), kO.getPlane());
        lj = new WorldPoint(kP.getX() + lIIlIlIll[4], kP.getY(), kP.getPlane());
        lk = new WorldPoint(kQ.getX() - lIIlIlIll[4], kQ.getY(), kQ.getPlane());
        ll = new WorldPoint(kR.getX() + lIIlIlIll[4], kR.getY(), kR.getPlane());
        lm = new WorldPoint(kS.getX() - lIIlIlIll[4], kS.getY(), kS.getPlane());
        ln = new WorldPoint(kT.getX() + lIIlIlIll[4], kT.getY(), kT.getPlane());
        lo = new WorldPoint(kU.getX() - lIIlIlIll[4], kU.getY(), kU.getPlane());
        lp = new WorldPoint(kV.getX() + lIIlIlIll[4], kV.getY(), kV.getPlane());
        lq = new WorldPoint(kW.getX() - lIIlIlIll[4], kW.getY(), kW.getPlane());
        lr = new WorldPoint(kX.getX() + lIIlIlIll[4], kX.getY(), kX.getPlane());
        ls = new WorldPoint(kY.getX() - lIIlIlIll[4], kY.getY(), kY.getPlane());
        lt = new WorldPoint(kZ.getX() + lIIlIlIll[4], kZ.getY(), kZ.getPlane());
        lu = new WorldPoint(la.getX() - lIIlIlIll[4], la.getY(), la.getPlane());
        lv = new WorldPoint(lb.getX() + lIIlIlIll[4], lb.getY(), lb.getPlane());
        lw = new WorldPoint(lc.getX() - lIIlIlIll[4], lc.getY(), lc.getPlane());
        lx = new WorldPoint(ld.getX() + lIIlIlIll[4], ld.getY(), ld.getPlane());
        ly = new WorldPoint(le.getX() + lIIlIlIll[4], le.getY(), le.getPlane());
        lz = new WorldPoint(lf.getX() + lIIlIlIll[4], lf.getY(), lf.getPlane());
        lA = new WorldPoint(lg.getX() + lIIlIlIll[4], lg.getY(), lg.getPlane());
        lB = new WorldPoint(lh.getX() + lIIlIlIll[4], lh.getY(), lh.getPlane());
        System.out.println(lIIlIlIII[lIIlIlIll[125]]);
    }

    private static boolean lllllIlIIll(int n2) {
        return n2 == 0;
    }

    private static boolean lllllIllIII(int n2, int n3) {
        return n2 <= n3;
    }

        return String.valueOf(lIIIIlIIIlIlIIl);
    }
}

