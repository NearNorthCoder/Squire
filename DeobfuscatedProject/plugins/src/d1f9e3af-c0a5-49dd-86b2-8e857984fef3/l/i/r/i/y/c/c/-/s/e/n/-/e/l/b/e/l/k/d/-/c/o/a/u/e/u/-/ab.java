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
package l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-;

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
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.a;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.b;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.d;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.e;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.f;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.g;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.i;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.o;
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

public class ab
implements W {
    static /* synthetic */ WorldPoint lw;
    private static /* synthetic */ String[] lIIlIlIII;
    static /* synthetic */ WorldPoint kR;
    static /* synthetic */ WorldPoint ls;
    static /* synthetic */ WorldPoint lk;
    public static /* synthetic */ int kx;
    static /* synthetic */ WorldPoint lo;
    static /* synthetic */ WorldPoint kW;
    public static /* synthetic */ int bZ;
    static /* synthetic */ String cc;
    static /* synthetic */ WorldPoint lf;
    static /* synthetic */ WorldPoint lA;
    public static /* synthetic */ int ky;
    static /* synthetic */ WorldPoint lu;
    static /* synthetic */ WorldPoint kV;
    static /* synthetic */ String h;
    public static /* synthetic */ boolean bt;
    static /* synthetic */ WorldPoint lb;
    static /* synthetic */ ArrayList<WorldPoint> kL;
    static /* synthetic */ WorldPoint lv;
    static /* synthetic */ WorldPoint lr;
    static /* synthetic */ WorldPoint lq;
    static /* synthetic */ WorldPoint kQ;
    static /* synthetic */ WorldPoint lz;
    static /* synthetic */ WorldPoint ly;
    static /* synthetic */ WorldPoint lp;
    static /* synthetic */ boolean kK;
    private static /* synthetic */ int[] lIIlIlIll;
    static /* synthetic */ WorldPoint kO;
    static /* synthetic */ ArrayList<WorldPoint> kM;
    static /* synthetic */ WorldPoint lx;
    public static /* synthetic */ List<d> bv;
    public static /* synthetic */ boolean bW;
    static /* synthetic */ WorldPoint le;
    static /* synthetic */ WorldPoint li;
    static /* synthetic */ WorldPoint ll;
    static /* synthetic */ WorldPoint lB;
    static /* synthetic */ WorldPoint lt;
    static /* synthetic */ WorldPoint kX;
    static /* synthetic */ WorldPoint kP;
    static /* synthetic */ WorldPoint la;
    static /* synthetic */ WorldPoint lm;
    static /* synthetic */ WorldPoint kT;
    static /* synthetic */ WorldPoint kU;
    static /* synthetic */ WorldPoint lh;
    static /* synthetic */ WorldPoint lj;
    static /* synthetic */ WorldPoint kY;
    static /* synthetic */ WorldPoint kN;
    public static /* synthetic */ int kz;
    static /* synthetic */ WorldPoint ln;
    static /* synthetic */ WorldPoint lc;
    static /* synthetic */ WorldPoint kS;
    static /* synthetic */ WorldPoint lg;
    static /* synthetic */ WorldPoint ld;
    static /* synthetic */ WorldPoint kZ;

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
            "".length();
            if (" ".length() != " ".length()) {
                return ((0x4F ^ 0x16) & ~(0x2F ^ 0x76)) != 0;
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
            if (ab.lllllIlIIll(ab.ab() ? 1 : 0) && ab.lllllIlIlII(Skills.getLevel((Skill)Skill.FARMING), lIIlIlIll[3])) {
                cc = lIIlIlIII[lIIlIlIll[5]];
                BankLocation lIIIIlIlIIIlIlI = BankLocation.getNearest();
                if (ab.lllllIlIlIl(lIIIIlIlIIIlIlI) && ab.lllllIlIIll(lIIIIlIlIIIlIlI.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIIlIlIII[lIIlIlIll[6]];
                    if (ab.lllllIlIIIl(Static.getClient().isInInstancedRegion() ? 1 : 0)) {
                        Time.sleepTicks((int)lIIlIlIll[6]);
                        "".length();
                        if (ab.lllllIlIIIl(ab.ab() ? 1 : 0)) {
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
                        "".length();
                    }
                    if (ab.lllllIlIIIl(Bank.isOpen() ? 1 : 0)) {
                        if (ab.lllllIlIllI(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks((int)lIIlIlIll[1]);
                            "".length();
                        }
                        if (ab.lllllIlIllI(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks((int)lIIlIlIll[4]);
                            "".length();
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
                        "".length();
                        e.l(lIIlIlIll[31]);
                        e.l(lIIlIlIll[33]);
                        e.l(lIIlIlIll[30]);
                        e.l(lIIlIlIll[32]);
                        e.l(lIIlIlIll[17]);
                        Time.sleepTicks((int)lIIlIlIll[5]);
                        "".length();
                        if (ab.lllllIlIIll(Bank.isOpen() ? 1 : 0)) {
                            a.a();
                            Time.sleepTicks((int)lIIlIlIll[11]);
                            "".length();
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
            if (ab.lllllIlIIIl(ab.ab() ? 1 : 0)) {
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
                    "".length();
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
                    "".length();
                    if (((0x11 ^ 0x19) & ~(0x35 ^ 0x3D)) != 0) {
                        return ((0x47 ^ 0x7F) & ~(0xF9 ^ 0xC1)) != 0;
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
                "".length();
            }
            int[] nArray3 = new int[lIIlIlIll[1]];
            nArray3[ab.lIIlIlIll[0]] = lIIlIlIll[9];
            if (ab.lllllIlIIll(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                if (ab.lllllIlIlll(Players.getLocal().getWorldLocation().distanceTo(kO), lIIlIlIll[7])) {
                    AccBuilderEasyClues.c = lIIlIlIII[lIIlIlIll[88]];
                    e.c(kO);
                    Time.sleepTicks((int)lIIlIlIll[1]);
                    "".length();
                }
                if (ab.lllllIllIII(Players.getLocal().getWorldLocation().distanceTo(kO), lIIlIlIll[7])) {
                    AccBuilderEasyClues.c = lIIlIlIII[lIIlIlIll[89]];
                    if (ab.lllllIlIlII(Movement.getRunEnergy(), lIIlIlIll[69]) && ab.lllllIlIIIl(Inventory.contains(item -> item.getName().contains(lIIlIlIII[lIIlIlIll[203]])) ? 1 : 0)) {
                        Inventory.getFirst(item -> item.getName().contains(lIIlIlIII[lIIlIlIll[202]])).useOn(TileObjects.getNearest(tileObject -> {
                            int n2;
                            if (ab.lllllIlIIIl(tileObject.getName().contains(lIIlIlIII[lIIlIlIll[201]]) ? 1 : 0) && ab.lllllIllIII(tileObject.getWorldLocation().distanceTo(li), lIIlIlIll[4])) {
                                n2 = lIIlIlIll[1];
                                "".length();
                                if ((0xB8 ^ 0xBD) == 0) {
                                    return ((0x36 ^ 0x1F) & ~(0xAB ^ 0x82)) != 0;
                                }
                            } else {
                                n2 = lIIlIlIll[0];
                            }
                            return n2 != 0;
                        }));
                        Time.sleepTicks((int)lIIlIlIll[1]);
                        "".length();
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
                "".length();
            }
            if (ab.lllllIllIII(Players.getLocal().getWorldLocation().distanceTo(kP), lIIlIlIll[7])) {
                AccBuilderEasyClues.c = lIIlIlIII[lIIlIlIll[91]];
                if (ab.lllllIlIIIl(Inventory.contains(item -> item.getName().contains(lIIlIlIII[lIIlIlIll[200]])) ? 1 : 0)) {
                    Inventory.getFirst(item -> item.getName().contains(lIIlIlIII[lIIlIlIll[199]])).useOn(TileObjects.getNearest(tileObject -> {
                        int n2;
                        if (ab.lllllIlIIIl(tileObject.getName().contains(lIIlIlIII[lIIlIlIll[198]]) ? 1 : 0) && ab.lllllIllIII(tileObject.getWorldLocation().distanceTo(lj), lIIlIlIll[4])) {
                            n2 = lIIlIlIll[1];
                            "".length();
                            if (-" ".length() >= "   ".length()) {
                                return ((0xDD ^ 0x98 ^ "   ".length()) & (170 + 149 - 221 + 128 ^ 50 + 40 - 83 + 157 ^ -" ".length())) != 0;
                            }
                        } else {
                            n2 = lIIlIlIll[0];
                        }
                        return n2 != 0;
                    }));
                    Time.sleepTicks((int)lIIlIlIll[1]);
                    "".length();
                    return;
                }
            }
        }
        if (ab.lllllIllIIl(ab.e(kQ)) && ab.lllllIlIlIl(ab.e(kP))) {
            if (ab.lllllIlIlll(Players.getLocal().getWorldLocation().distanceTo(kQ), lIIlIlIll[7])) {
                AccBuilderEasyClues.c = lIIlIlIII[lIIlIlIll[92]];
                e.c(kQ);
                Time.sleepTicks((int)lIIlIlIll[1]);
                "".length();
            }
            if (ab.lllllIllIII(Players.getLocal().getWorldLocation().distanceTo(kQ), lIIlIlIll[7])) {
                AccBuilderEasyClues.c = lIIlIlIII[lIIlIlIll[93]];
                if (ab.lllllIlIIIl(Inventory.contains(item -> item.getName().contains(lIIlIlIII[lIIlIlIll[197]])) ? 1 : 0)) {
                    Inventory.getFirst(item -> item.getName().contains(lIIlIlIII[lIIlIlIll[196]])).useOn(TileObjects.getNearest(tileObject -> {
                        int n2;
                        if (ab.lllllIlIIIl(tileObject.getName().contains(lIIlIlIII[lIIlIlIll[195]]) ? 1 : 0) && ab.lllllIllIII(tileObject.getWorldLocation().distanceTo(lk), lIIlIlIll[4])) {
                            n2 = lIIlIlIll[1];
                            "".length();
                            if ((33 + 46 - -90 + 18 ^ 59 + 93 - -29 + 10) < ((6 ^ 0x3A ^ (0xF1 ^ 0xAC)) & (127 + 197 - 213 + 125 ^ 22 + 57 - 73 + 135 ^ -" ".length()))) {
                                return ((60 + 8 - -21 + 69 ^ 11 + 77 - -32 + 30) & (0x62 ^ 0x43 ^ (0x65 ^ 0x4C) ^ -" ".length())) != 0;
                            }
                        } else {
                            n2 = lIIlIlIll[0];
                        }
                        return n2 != 0;
                    }));
                    Time.sleepTicks((int)lIIlIlIll[1]);
                    "".length();
                    return;
                }
            }
        }
        if (ab.lllllIllIIl(ab.e(kR)) && ab.lllllIlIlIl(ab.e(kQ))) {
            if (ab.lllllIlIlll(Players.getLocal().getWorldLocation().distanceTo(kR), lIIlIlIll[7])) {
                AccBuilderEasyClues.c = lIIlIlIII[lIIlIlIll[94]];
                e.c(kR);
                Time.sleepTicks((int)lIIlIlIll[1]);
                "".length();
            }
            if (ab.lllllIllIII(Players.getLocal().getWorldLocation().distanceTo(kR), lIIlIlIll[7])) {
                AccBuilderEasyClues.c = lIIlIlIII[lIIlIlIll[95]];
                if (ab.lllllIlIIIl(Inventory.contains(item -> item.getName().contains(lIIlIlIII[lIIlIlIll[194]])) ? 1 : 0)) {
                    Inventory.getFirst(item -> item.getName().contains(lIIlIlIII[lIIlIlIll[193]])).useOn(TileObjects.getNearest(tileObject -> {
                        int n2;
                        if (ab.lllllIlIIIl(tileObject.getName().contains(lIIlIlIII[lIIlIlIll[192]]) ? 1 : 0) && ab.lllllIllIII(tileObject.getWorldLocation().distanceTo(ll), lIIlIlIll[4])) {
                            n2 = lIIlIlIll[1];
                            "".length();
                            if (((0x39 ^ 0x2A) & ~(0x81 ^ 0x92)) < 0) {
                                return ((0x24 ^ 0x1B) & ~(0x32 ^ 0xD)) != 0;
                            }
                        } else {
                            n2 = lIIlIlIll[0];
                        }
                        return n2 != 0;
                    }));
                    Time.sleepTicks((int)lIIlIlIll[1]);
                    "".length();
                    return;
                }
            }
        }
        if (ab.lllllIllIIl(ab.e(kS)) && ab.lllllIlIlIl(ab.e(kR))) {
            if (ab.lllllIlIlll(Players.getLocal().getWorldLocation().distanceTo(kS), lIIlIlIll[7])) {
                AccBuilderEasyClues.c = lIIlIlIII[lIIlIlIll[96]];
                e.c(kS);
                Time.sleepTicks((int)lIIlIlIll[1]);
                "".length();
            }
            if (ab.lllllIllIII(Players.getLocal().getWorldLocation().distanceTo(kS), lIIlIlIll[7])) {
                AccBuilderEasyClues.c = lIIlIlIII[lIIlIlIll[97]];
                if (ab.lllllIlIIIl(Inventory.contains(item -> item.getName().contains(lIIlIlIII[lIIlIlIll[191]])) ? 1 : 0)) {
                    Inventory.getFirst(item -> item.getName().contains(lIIlIlIII[lIIlIlIll[190]])).useOn(TileObjects.getNearest(tileObject -> {
                        int n2;
                        if (ab.lllllIlIIIl(tileObject.getName().contains(lIIlIlIII[lIIlIlIll[189]]) ? 1 : 0) && ab.lllllIllIII(tileObject.getWorldLocation().distanceTo(lm), lIIlIlIll[4])) {
                            n2 = lIIlIlIll[1];
                            "".length();
                            if (-" ".length() > -" ".length()) {
                                return ((0xBE ^ 0x88) & ~(0x6F ^ 0x59)) != 0;
                            }
                        } else {
                            n2 = lIIlIlIll[0];
                        }
                        return n2 != 0;
                    }));
                    Time.sleepTicks((int)lIIlIlIll[1]);
                    "".length();
                    return;
                }
            }
        }
        if (ab.lllllIllIIl(ab.e(kT)) && ab.lllllIlIlIl(ab.e(kS))) {
            if (ab.lllllIlIlll(Players.getLocal().getWorldLocation().distanceTo(kT), lIIlIlIll[7])) {
                AccBuilderEasyClues.c = lIIlIlIII[lIIlIlIll[98]];
                e.c(kT);
                Time.sleepTicks((int)lIIlIlIll[1]);
                "".length();
            }
            if (ab.lllllIllIII(Players.getLocal().getWorldLocation().distanceTo(kT), lIIlIlIll[7])) {
                AccBuilderEasyClues.c = lIIlIlIII[lIIlIlIll[99]];
                if (ab.lllllIlIIIl(Inventory.contains(item -> item.getName().contains(lIIlIlIII[lIIlIlIll[188]])) ? 1 : 0)) {
                    Inventory.getFirst(item -> item.getName().contains(lIIlIlIII[lIIlIlIll[187]])).useOn(TileObjects.getNearest(tileObject -> {
                        int n2;
                        if (ab.lllllIlIIIl(tileObject.getName().contains(lIIlIlIII[lIIlIlIll[186]]) ? 1 : 0) && ab.lllllIllIII(tileObject.getWorldLocation().distanceTo(ln), lIIlIlIll[4])) {
                            n2 = lIIlIlIll[1];
                            "".length();
                            if (null != null) {
                                return ((0x63 ^ 0x23) & ~(0xD ^ 0x4D)) != 0;
                            }
                        } else {
                            n2 = lIIlIlIll[0];
                        }
                        return n2 != 0;
                    }));
                    Time.sleepTicks((int)lIIlIlIll[1]);
                    "".length();
                    return;
                }
            }
        }
        if (ab.lllllIllIIl(ab.e(kU)) && ab.lllllIlIlIl(ab.e(kT))) {
            if (ab.lllllIlIlll(Players.getLocal().getWorldLocation().distanceTo(kU), lIIlIlIll[7])) {
                AccBuilderEasyClues.c = lIIlIlIII[lIIlIlIll[100]];
                e.c(kU);
                Time.sleepTicks((int)lIIlIlIll[1]);
                "".length();
            }
            if (ab.lllllIllIII(Players.getLocal().getWorldLocation().distanceTo(kU), lIIlIlIll[7])) {
                AccBuilderEasyClues.c = lIIlIlIII[lIIlIlIll[49]];
                if (ab.lllllIlIIIl(Inventory.contains(item -> item.getName().contains(lIIlIlIII[lIIlIlIll[185]])) ? 1 : 0)) {
                    Inventory.getFirst(item -> item.getName().contains(lIIlIlIII[lIIlIlIll[184]])).useOn(TileObjects.getNearest(tileObject -> {
                        int n2;
                        if (ab.lllllIlIIIl(tileObject.getName().contains(lIIlIlIII[lIIlIlIll[183]]) ? 1 : 0) && ab.lllllIllIII(tileObject.getWorldLocation().distanceTo(lo), lIIlIlIll[4])) {
                            n2 = lIIlIlIll[1];
                            "".length();
                            if ("   ".length() < ((0x93 ^ 0xC4) & ~(0xF9 ^ 0xAE))) {
                                return ((0x78 ^ 0x6E) & ~(0xB1 ^ 0xA7)) != 0;
                            }
                        } else {
                            n2 = lIIlIlIll[0];
                        }
                        return n2 != 0;
                    }));
                    Time.sleepTicks((int)lIIlIlIll[1]);
                    "".length();
                    return;
                }
            }
        }
        if (ab.lllllIllIIl(ab.e(kV)) && ab.lllllIlIlIl(ab.e(kU))) {
            if (ab.lllllIlIlll(Players.getLocal().getWorldLocation().distanceTo(kV), lIIlIlIll[7])) {
                AccBuilderEasyClues.c = lIIlIlIII[lIIlIlIll[101]];
                e.c(kV);
                Time.sleepTicks((int)lIIlIlIll[1]);
                "".length();
            }
            if (ab.lllllIllIII(Players.getLocal().getWorldLocation().distanceTo(kV), lIIlIlIll[7])) {
                AccBuilderEasyClues.c = lIIlIlIII[lIIlIlIll[102]];
                if (ab.lllllIlIIIl(Inventory.contains(item -> item.getName().contains(lIIlIlIII[lIIlIlIll[182]])) ? 1 : 0)) {
                    Inventory.getFirst(item -> item.getName().contains(lIIlIlIII[lIIlIlIll[181]])).useOn(TileObjects.getNearest(tileObject -> {
                        int n2;
                        if (ab.lllllIlIIIl(tileObject.getName().contains(lIIlIlIII[lIIlIlIll[180]]) ? 1 : 0) && ab.lllllIllIII(tileObject.getWorldLocation().distanceTo(lp), lIIlIlIll[4])) {
                            n2 = lIIlIlIll[1];
                            "".length();
                            if (null != null) {
                                return ((192 + 105 - 97 + 41 ^ 6 + 103 - 100 + 186) & (0x2B ^ 0x66 ^ 120 + 11 - 96 + 92 ^ -" ".length())) != 0;
                            }
                        } else {
                            n2 = lIIlIlIll[0];
                        }
                        return n2 != 0;
                    }));
                    Time.sleepTicks((int)lIIlIlIll[1]);
                    "".length();
                    return;
                }
            }
        }
        if (ab.lllllIllIIl(ab.e(kW)) && ab.lllllIlIlIl(ab.e(kV))) {
            if (ab.lllllIlIlll(Players.getLocal().getWorldLocation().distanceTo(kW), lIIlIlIll[7])) {
                AccBuilderEasyClues.c = lIIlIlIII[lIIlIlIll[103]];
                e.c(kW);
                Time.sleepTicks((int)lIIlIlIll[1]);
                "".length();
            }
            if (ab.lllllIllIII(Players.getLocal().getWorldLocation().distanceTo(kW), lIIlIlIll[7])) {
                AccBuilderEasyClues.c = lIIlIlIII[lIIlIlIll[104]];
                if (ab.lllllIlIIIl(Inventory.contains(item -> item.getName().contains(lIIlIlIII[lIIlIlIll[179]])) ? 1 : 0)) {
                    Inventory.getFirst(item -> item.getName().contains(lIIlIlIII[lIIlIlIll[178]])).useOn(TileObjects.getNearest(tileObject -> {
                        int n2;
                        if (ab.lllllIlIIIl(tileObject.getName().contains(lIIlIlIII[lIIlIlIll[177]]) ? 1 : 0) && ab.lllllIllIII(tileObject.getWorldLocation().distanceTo(lq), lIIlIlIll[4])) {
                            n2 = lIIlIlIll[1];
                            "".length();
                            if ((0x7C ^ 0x78) <= "  ".length()) {
                                return ((0x5E ^ 0x19) & ~(0xEF ^ 0xA8)) != 0;
                            }
                        } else {
                            n2 = lIIlIlIll[0];
                        }
                        return n2 != 0;
                    }));
                    Time.sleepTicks((int)lIIlIlIll[1]);
                    "".length();
                    return;
                }
            }
        }
        if (ab.lllllIllIIl(ab.e(kX)) && ab.lllllIlIlIl(ab.e(kW))) {
            if (ab.lllllIlIlll(Players.getLocal().getWorldLocation().distanceTo(kX), lIIlIlIll[7])) {
                AccBuilderEasyClues.c = lIIlIlIII[lIIlIlIll[105]];
                e.c(kX);
                Time.sleepTicks((int)lIIlIlIll[1]);
                "".length();
            }
            if (ab.lllllIllIII(Players.getLocal().getWorldLocation().distanceTo(kX), lIIlIlIll[7])) {
                AccBuilderEasyClues.c = lIIlIlIII[lIIlIlIll[106]];
                if (ab.lllllIlIIIl(Inventory.contains(item -> item.getName().contains(lIIlIlIII[lIIlIlIll[176]])) ? 1 : 0)) {
                    Inventory.getFirst(item -> item.getName().contains(lIIlIlIII[lIIlIlIll[175]])).useOn(TileObjects.getNearest(tileObject -> {
                        int n2;
                        if (ab.lllllIlIIIl(tileObject.getName().contains(lIIlIlIII[lIIlIlIll[174]]) ? 1 : 0) && ab.lllllIllIII(tileObject.getWorldLocation().distanceTo(lr), lIIlIlIll[4])) {
                            n2 = lIIlIlIll[1];
                            "".length();
                            if (" ".length() <= 0) {
                                return ((0x8C ^ 0xB1) & ~(0x74 ^ 0x49)) != 0;
                            }
                        } else {
                            n2 = lIIlIlIll[0];
                        }
                        return n2 != 0;
                    }));
                    Time.sleepTicks((int)lIIlIlIll[1]);
                    "".length();
                    return;
                }
            }
        }
        if (ab.lllllIllIIl(ab.e(kY)) && ab.lllllIlIlIl(ab.e(kX))) {
            if (ab.lllllIlIlll(Players.getLocal().getWorldLocation().distanceTo(kY), lIIlIlIll[7])) {
                AccBuilderEasyClues.c = lIIlIlIII[lIIlIlIll[107]];
                e.c(kY);
                Time.sleepTicks((int)lIIlIlIll[1]);
                "".length();
            }
            if (ab.lllllIllIII(Players.getLocal().getWorldLocation().distanceTo(kY), lIIlIlIll[7])) {
                AccBuilderEasyClues.c = lIIlIlIII[lIIlIlIll[108]];
                if (ab.lllllIlIIIl(Inventory.contains(item -> item.getName().contains(lIIlIlIII[lIIlIlIll[173]])) ? 1 : 0)) {
                    Inventory.getFirst(item -> item.getName().contains(lIIlIlIII[lIIlIlIll[172]])).useOn(TileObjects.getNearest(tileObject -> {
                        int n2;
                        if (ab.lllllIlIIIl(tileObject.getName().contains(lIIlIlIII[lIIlIlIll[171]]) ? 1 : 0) && ab.lllllIllIII(tileObject.getWorldLocation().distanceTo(ls), lIIlIlIll[4])) {
                            n2 = lIIlIlIll[1];
                            "".length();
                            if (-(16 + 39 - -88 + 56 ^ 44 + 90 - 113 + 174) > 0) {
                                return ((0x78 ^ 0x34 ^ (0x2C ^ 0x40)) & (0xD0 ^ 0xC5 ^ (0x24 ^ 0x11) ^ -" ".length())) != 0;
                            }
                        } else {
                            n2 = lIIlIlIll[0];
                        }
                        return n2 != 0;
                    }));
                    Time.sleepTicks((int)lIIlIlIll[1]);
                    "".length();
                    return;
                }
            }
        }
        if (ab.lllllIllIIl(ab.e(kZ)) && ab.lllllIlIlIl(ab.e(kY))) {
            if (ab.lllllIlIlll(Players.getLocal().getWorldLocation().distanceTo(kZ), lIIlIlIll[7])) {
                AccBuilderEasyClues.c = lIIlIlIII[lIIlIlIll[109]];
                e.c(kZ);
                Time.sleepTicks((int)lIIlIlIll[1]);
                "".length();
            }
            if (ab.lllllIllIII(Players.getLocal().getWorldLocation().distanceTo(kZ), lIIlIlIll[7])) {
                AccBuilderEasyClues.c = lIIlIlIII[lIIlIlIll[110]];
                if (ab.lllllIlIIIl(Inventory.contains(item -> item.getName().contains(lIIlIlIII[lIIlIlIll[170]])) ? 1 : 0)) {
                    Inventory.getFirst(item -> item.getName().contains(lIIlIlIII[lIIlIlIll[169]])).useOn(TileObjects.getNearest(tileObject -> {
                        int n2;
                        if (ab.lllllIlIIIl(tileObject.getName().contains(lIIlIlIII[lIIlIlIll[168]]) ? 1 : 0) && ab.lllllIllIII(tileObject.getWorldLocation().distanceTo(lt), lIIlIlIll[4])) {
                            n2 = lIIlIlIll[1];
                            "".length();
                            if (null != null) {
                                return ((0x3F ^ 0x1B) & ~(0x5D ^ 0x79)) != 0;
                            }
                        } else {
                            n2 = lIIlIlIll[0];
                        }
                        return n2 != 0;
                    }));
                    Time.sleepTicks((int)lIIlIlIll[1]);
                    "".length();
                    return;
                }
            }
        }
        if (ab.lllllIllIIl(ab.e(la)) && ab.lllllIlIlIl(ab.e(kZ))) {
            if (ab.lllllIlIlll(Players.getLocal().getWorldLocation().distanceTo(la), lIIlIlIll[7])) {
                AccBuilderEasyClues.c = lIIlIlIII[lIIlIlIll[69]];
                e.c(la);
                Time.sleepTicks((int)lIIlIlIll[1]);
                "".length();
            }
            if (ab.lllllIllIII(Players.getLocal().getWorldLocation().distanceTo(la), lIIlIlIll[7])) {
                AccBuilderEasyClues.c = lIIlIlIII[lIIlIlIll[111]];
                if (ab.lllllIlIIIl(Inventory.contains(item -> item.getName().contains(lIIlIlIII[lIIlIlIll[167]])) ? 1 : 0)) {
                    Inventory.getFirst(item -> item.getName().contains(lIIlIlIII[lIIlIlIll[166]])).useOn(TileObjects.getNearest(tileObject -> {
                        int n2;
                        if (ab.lllllIlIIIl(tileObject.getName().contains(lIIlIlIII[lIIlIlIll[165]]) ? 1 : 0) && ab.lllllIllIII(tileObject.getWorldLocation().distanceTo(lu), lIIlIlIll[4])) {
                            n2 = lIIlIlIll[1];
                            "".length();
                            if ((0x42 ^ 0x46) <= "   ".length()) {
                                return ((0x8B ^ 0xBA) & ~(0x1F ^ 0x2E)) != 0;
                            }
                        } else {
                            n2 = lIIlIlIll[0];
                        }
                        return n2 != 0;
                    }));
                    Time.sleepTicks((int)lIIlIlIll[1]);
                    "".length();
                    return;
                }
            }
        }
        if (ab.lllllIllIIl(ab.e(lb)) && ab.lllllIlIlIl(ab.e(la))) {
            if (ab.lllllIlIlll(Players.getLocal().getWorldLocation().distanceTo(lb), lIIlIlIll[7])) {
                AccBuilderEasyClues.c = lIIlIlIII[lIIlIlIll[112]];
                e.c(lb);
                Time.sleepTicks((int)lIIlIlIll[1]);
                "".length();
            }
            if (ab.lllllIllIII(Players.getLocal().getWorldLocation().distanceTo(lb), lIIlIlIll[7])) {
                AccBuilderEasyClues.c = lIIlIlIII[lIIlIlIll[32]];
                if (ab.lllllIlIIIl(Inventory.contains(item -> item.getName().contains(lIIlIlIII[lIIlIlIll[164]])) ? 1 : 0)) {
                    Inventory.getFirst(item -> item.getName().contains(lIIlIlIII[lIIlIlIll[163]])).useOn(TileObjects.getNearest(tileObject -> {
                        int n2;
                        if (ab.lllllIlIIIl(tileObject.getName().contains(lIIlIlIII[lIIlIlIll[162]]) ? 1 : 0) && ab.lllllIllIII(tileObject.getWorldLocation().distanceTo(lv), lIIlIlIll[4])) {
                            n2 = lIIlIlIll[1];
                            "".length();
                            if ("   ".length() == " ".length()) {
                                return ((0x21 ^ 0x1A) & ~(0xB8 ^ 0x83)) != 0;
                            }
                        } else {
                            n2 = lIIlIlIll[0];
                        }
                        return n2 != 0;
                    }));
                    Time.sleepTicks((int)lIIlIlIll[1]);
                    "".length();
                    return;
                }
            }
        }
        if (ab.lllllIllIIl(ab.e(lc)) && ab.lllllIlIlIl(ab.e(lb))) {
            if (ab.lllllIlIlll(Players.getLocal().getWorldLocation().distanceTo(lc), lIIlIlIll[7])) {
                AccBuilderEasyClues.c = lIIlIlIII[lIIlIlIll[113]];
                e.c(lc);
                Time.sleepTicks((int)lIIlIlIll[1]);
                "".length();
            }
            if (ab.lllllIllIII(Players.getLocal().getWorldLocation().distanceTo(lc), lIIlIlIll[7])) {
                AccBuilderEasyClues.c = lIIlIlIII[lIIlIlIll[114]];
                if (ab.lllllIlIIIl(Inventory.contains(item -> item.getName().contains(lIIlIlIII[lIIlIlIll[161]])) ? 1 : 0)) {
                    Inventory.getFirst(item -> item.getName().contains(lIIlIlIII[lIIlIlIll[160]])).useOn(TileObjects.getNearest(tileObject -> {
                        int n2;
                        if (ab.lllllIlIIIl(tileObject.getName().contains(lIIlIlIII[lIIlIlIll[159]]) ? 1 : 0) && ab.lllllIllIII(tileObject.getWorldLocation().distanceTo(lw), lIIlIlIll[4])) {
                            n2 = lIIlIlIll[1];
                            "".length();
                            if (((0x47 ^ 0x26) & ~(0x35 ^ 0x54)) > "   ".length()) {
                                return ((0x61 ^ 0x3E) & ~(0xF9 ^ 0xA6)) != 0;
                            }
                        } else {
                            n2 = lIIlIlIll[0];
                        }
                        return n2 != 0;
                    }));
                    Time.sleepTicks((int)lIIlIlIll[1]);
                    "".length();
                    return;
                }
            }
        }
        if (ab.lllllIllIIl(ab.e(ld)) && ab.lllllIlIlIl(ab.e(lc))) {
            if (ab.lllllIlIlll(Players.getLocal().getWorldLocation().distanceTo(ld), lIIlIlIll[7])) {
                AccBuilderEasyClues.c = lIIlIlIII[lIIlIlIll[115]];
                e.c(ld);
                Time.sleepTicks((int)lIIlIlIll[1]);
                "".length();
            }
            if (ab.lllllIllIII(Players.getLocal().getWorldLocation().distanceTo(ld), lIIlIlIll[7])) {
                AccBuilderEasyClues.c = lIIlIlIII[lIIlIlIll[116]];
                if (ab.lllllIlIIIl(Inventory.contains(item -> item.getName().contains(lIIlIlIII[lIIlIlIll[158]])) ? 1 : 0)) {
                    Inventory.getFirst(item -> item.getName().contains(lIIlIlIII[lIIlIlIll[157]])).useOn(TileObjects.getNearest(tileObject -> {
                        int n2;
                        if (ab.lllllIlIIIl(tileObject.getName().contains(lIIlIlIII[lIIlIlIll[156]]) ? 1 : 0) && ab.lllllIllIII(tileObject.getWorldLocation().distanceTo(lx), lIIlIlIll[4])) {
                            n2 = lIIlIlIll[1];
                            "".length();
                            if (((0x5C ^ 0x78 ^ (0x14 ^ 0x7F)) & (0x94 ^ 0xC2 ^ (0xA2 ^ 0xBB) ^ -" ".length())) != 0) {
                                return ((2 ^ 0x37 ^ (0x13 ^ 0x47)) & (0xCA ^ 0x9B ^ (0x5C ^ 0x6C) ^ -" ".length())) != 0;
                            }
                        } else {
                            n2 = lIIlIlIll[0];
                        }
                        return n2 != 0;
                    }));
                    Time.sleepTicks((int)lIIlIlIll[1]);
                    "".length();
                    return;
                }
            }
        }
        if (ab.lllllIllIIl(ab.e(le)) && ab.lllllIlIlIl(ab.e(ld))) {
            if (ab.lllllIlIlll(Players.getLocal().getWorldLocation().distanceTo(le), lIIlIlIll[7])) {
                AccBuilderEasyClues.c = lIIlIlIII[lIIlIlIll[117]];
                e.c(le);
                Time.sleepTicks((int)lIIlIlIll[1]);
                "".length();
            }
            if (ab.lllllIllIII(Players.getLocal().getWorldLocation().distanceTo(le), lIIlIlIll[7])) {
                AccBuilderEasyClues.c = lIIlIlIII[lIIlIlIll[118]];
                if (ab.lllllIlIIIl(Inventory.contains(item -> item.getName().contains(lIIlIlIII[lIIlIlIll[155]])) ? 1 : 0)) {
                    Inventory.getFirst(item -> item.getName().contains(lIIlIlIII[lIIlIlIll[154]])).useOn(TileObjects.getNearest(tileObject -> {
                        int n2;
                        if (ab.lllllIlIIIl(tileObject.getName().contains(lIIlIlIII[lIIlIlIll[153]]) ? 1 : 0) && ab.lllllIllIII(tileObject.getWorldLocation().distanceTo(ly), lIIlIlIll[4])) {
                            n2 = lIIlIlIll[1];
                            "".length();
                            if (-"   ".length() > 0) {
                                return ((0x33 ^ 0x1C) & ~(0x2F ^ 0)) != 0;
                            }
                        } else {
                            n2 = lIIlIlIll[0];
                        }
                        return n2 != 0;
                    }));
                    Time.sleepTicks((int)lIIlIlIll[1]);
                    "".length();
                    return;
                }
            }
        }
        if (ab.lllllIllIIl(ab.e(lf)) && ab.lllllIlIlIl(ab.e(le))) {
            if (ab.lllllIlIlll(Players.getLocal().getWorldLocation().distanceTo(lf), lIIlIlIll[7])) {
                AccBuilderEasyClues.c = lIIlIlIII[lIIlIlIll[119]];
                e.c(lf);
                Time.sleepTicks((int)lIIlIlIll[1]);
                "".length();
            }
            if (ab.lllllIllIII(Players.getLocal().getWorldLocation().distanceTo(lf), lIIlIlIll[7])) {
                AccBuilderEasyClues.c = lIIlIlIII[lIIlIlIll[120]];
                if (ab.lllllIlIIIl(Inventory.contains(item -> item.getName().contains(lIIlIlIII[lIIlIlIll[152]])) ? 1 : 0)) {
                    Inventory.getFirst(item -> item.getName().contains(lIIlIlIII[lIIlIlIll[151]])).useOn(TileObjects.getNearest(tileObject -> {
                        int n2;
                        if (ab.lllllIlIIIl(tileObject.getName().contains(lIIlIlIII[lIIlIlIll[150]]) ? 1 : 0) && ab.lllllIllIII(tileObject.getWorldLocation().distanceTo(lz), lIIlIlIll[4])) {
                            n2 = lIIlIlIll[1];
                            "".length();
                            if (((0x55 ^ 0x26 ^ (0xF0 ^ 0x84)) & (46 + 93 - 49 + 81 ^ 165 + 155 - 273 + 125 ^ -" ".length())) > (0x59 ^ 0x55 ^ (0xA ^ 2))) {
                                return ("  ".length() & ("  ".length() ^ -" ".length())) != 0;
                            }
                        } else {
                            n2 = lIIlIlIll[0];
                        }
                        return n2 != 0;
                    }));
                    Time.sleepTicks((int)lIIlIlIll[1]);
                    "".length();
                    return;
                }
            }
        }
        if (ab.lllllIllIIl(ab.e(lg)) && ab.lllllIlIlIl(ab.e(lf))) {
            if (ab.lllllIlIlll(Players.getLocal().getWorldLocation().distanceTo(lg), lIIlIlIll[7])) {
                AccBuilderEasyClues.c = lIIlIlIII[lIIlIlIll[121]];
                e.c(lg);
                Time.sleepTicks((int)lIIlIlIll[1]);
                "".length();
            }
            if (ab.lllllIllIII(Players.getLocal().getWorldLocation().distanceTo(lg), lIIlIlIll[7])) {
                AccBuilderEasyClues.c = lIIlIlIII[lIIlIlIll[122]];
                if (ab.lllllIlIIIl(Inventory.contains(item -> item.getName().contains(lIIlIlIII[lIIlIlIll[149]])) ? 1 : 0)) {
                    Inventory.getFirst(item -> item.getName().contains(lIIlIlIII[lIIlIlIll[148]])).useOn(TileObjects.getNearest(tileObject -> {
                        int n2;
                        if (ab.lllllIlIIIl(tileObject.getName().contains(lIIlIlIII[lIIlIlIll[147]]) ? 1 : 0) && ab.lllllIllIII(tileObject.getWorldLocation().distanceTo(lA), lIIlIlIll[4])) {
                            n2 = lIIlIlIll[1];
                            "".length();
                            if (((0x26 ^ 0x7D) & ~(0x51 ^ 0xA)) != 0) {
                                return ((0x4A ^ 0x5D) & ~(0x77 ^ 0x60)) != 0;
                            }
                        } else {
                            n2 = lIIlIlIll[0];
                        }
                        return n2 != 0;
                    }));
                    Time.sleepTicks((int)lIIlIlIll[1]);
                    "".length();
                    return;
                }
            }
        }
        if (ab.lllllIllIIl(ab.e(lh)) && ab.lllllIlIlIl(ab.e(lg))) {
            if (ab.lllllIlIlll(Players.getLocal().getWorldLocation().distanceTo(lh), lIIlIlIll[7])) {
                AccBuilderEasyClues.c = lIIlIlIII[lIIlIlIll[123]];
                e.c(lh);
                Time.sleepTicks((int)lIIlIlIll[1]);
                "".length();
            }
            if (ab.lllllIllIII(Players.getLocal().getWorldLocation().distanceTo(lh), lIIlIlIll[7])) {
                AccBuilderEasyClues.c = lIIlIlIII[lIIlIlIll[124]];
                if (ab.lllllIlIIIl(Inventory.contains(item -> item.getName().contains(lIIlIlIII[lIIlIlIll[146]])) ? 1 : 0)) {
                    Inventory.getFirst(item -> item.getName().contains(lIIlIlIII[lIIlIlIll[145]])).useOn(TileObjects.getNearest(tileObject -> {
                        int n2;
                        if (ab.lllllIlIIIl(tileObject.getName().contains(lIIlIlIII[lIIlIlIll[144]]) ? 1 : 0) && ab.lllllIllIII(tileObject.getWorldLocation().distanceTo(lB), lIIlIlIll[4])) {
                            n2 = lIIlIlIll[1];
                            "".length();
                            if (((0x55 ^ 0x1D) & ~(0x2C ^ 0x64)) != 0) {
                                return ((0x50 ^ 0x18) & ~(0x58 ^ 0x10)) != 0;
                            }
                        } else {
                            n2 = lIIlIlIll[0];
                        }
                        return n2 != 0;
                    }));
                    Time.sleepTicks((int)lIIlIlIll[12]);
                    "".length();
                    return;
                }
            }
        }
    }

    @Override
    public boolean S() {
        return lIIlIlIll[0];
    }

    private static String llllIllIlIl(String lIIIIlIIIIIIlll, String lIIIIlIIIIIIllI) {
        try {
            SecretKeySpec lIIIIlIIIIIllII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIIIIlIIIIIIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIIIIlIIIIIlIll = Cipher.getInstance("Blowfish");
            lIIIIlIIIIIlIll.init(lIIlIlIll[4], lIIIIlIIIIIllII);
            return new String(lIIIIlIIIIIlIll.doFinal(Base64.getDecoder().decode(lIIIIlIIIIIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIIIIlIIIIIlIlI) {
            lIIIIlIIIIIlIlI.printStackTrace();
            return null;
        }
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
            "".length();
            kL.add(kP);
            "".length();
            kL.add(kQ);
            "".length();
            kL.add(kR);
            "".length();
            kL.add(kS);
            "".length();
            kL.add(kT);
            "".length();
            kL.add(kU);
            "".length();
            kL.add(kV);
            "".length();
            kL.add(kW);
            "".length();
            kL.add(kX);
            "".length();
            kL.add(kY);
            "".length();
            kL.add(kZ);
            "".length();
            kL.add(la);
            "".length();
            kL.add(lb);
            "".length();
            kL.add(lc);
            "".length();
            kL.add(ld);
            "".length();
            kL.add(le);
            "".length();
            kL.add(lf);
            "".length();
            kL.add(lg);
            "".length();
            kL.add(lh);
            "".length();
        }
        if (ab.lllllIlIIIl(kM.isEmpty() ? 1 : 0)) {
            kM.add(li);
            "".length();
            kM.add(lj);
            "".length();
            kM.add(lk);
            "".length();
            kM.add(ll);
            "".length();
            kM.add(lm);
            "".length();
            kM.add(ln);
            "".length();
            kM.add(lo);
            "".length();
            kM.add(lp);
            "".length();
            kM.add(lq);
            "".length();
            kM.add(lr);
            "".length();
            kM.add(ls);
            "".length();
            kM.add(lt);
            "".length();
            kM.add(lu);
            "".length();
            kM.add(lv);
            "".length();
            kM.add(lw);
            "".length();
            kM.add(lx);
            "".length();
            kM.add(ly);
            "".length();
            kM.add(lz);
            "".length();
            kM.add(lA);
            "".length();
            kM.add(lB);
            "".length();
        }
    }

    @Override
    public int T() {
        try {
            ab.ds();
            "".length();
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (-" ".length() == " ".length()) {
            return (15 + 68 - 12 + 134 ^ 22 + 34 - 42 + 134) & (0x90 ^ 0xA3 ^ (0x66 ^ 0xC) ^ -" ".length());
        }
        return lIIlIlIll[124];
    }

    private static void lllllIIIlIl() {
        lIIlIlIII = new String[lIIlIlIll[250]];
        ab.lIIlIlIII[ab.lIIlIlIll[0]] = ab.llllIllIIll("ZR9DOM6KUlJyUu260YrH4A==", "puNfg");
        ab.lIIlIlIII[ab.lIIlIlIll[1]] = ab.llllIllIlII("IAQdODEOCBdxIBMUGj8lRgQHNC8VQVMiNQ8ZEDkrCApTMyMFBlMlLUYLEiMvDwMU", "fmsQB");
        ab.lIIlIlIII[ab.lIIlIlIll[4]] = ab.llllIllIIll("/Sv0PtiH/Ir2GMj679/3Jg==", "MQABh");
        ab.lIIlIlIII[ab.lIIlIlIll[5]] = ab.llllIllIIll("rfU1nMezQYg=", "gxRbl");
        ab.lIIlIlIII[ab.lIIlIlIll[6]] = ab.llllIllIlII("KSceCy4GMgEMLkcyB0IrBigD", "gFhbI");
        ab.lIIlIlIII[ab.lIIlIlIll[7]] = ab.llllIllIlIl("s4Sz9ueNABljS5j1I3a2O70GhrGU6AVz", "SyZGT");
        ab.lIIlIlIII[ab.lIIlIlIll[11]] = ab.llllIllIlIl("KVUz1UNho85loCMoY70tfvv+iDqZVN2rnwHcGlN25z4DPwejbBiTf/rhXXX8ljM0uLoqLVQ6z0I=", "TJgqz");
        ab.lIIlIlIII[ab.lIIlIlIll[20]] = ab.llllIllIIll("sZHqs3SBKrmKs7wLifmUqxMrKdxqnd7jU+RfCdbMtd7vrT0MY+xibMP+QF7ITVCMqi3LYBhvImo=", "jPFOj");
        ab.lIIlIlIII[ab.lIIlIlIll[22]] = ab.llllIllIlII("EiMHNg==", "DJfZX");
        ab.lIIlIlIII[ab.lIIlIlIll[23]] = ab.llllIllIlII("Hw43PA==", "IgVPr");
        ab.lIIlIlIII[ab.lIIlIlIll[12]] = ab.llllIllIlIl("tRKhgmjIZp4=", "nEXgd");
        ab.lIIlIlIII[ab.lIIlIlIll[38]] = ab.llllIllIlIl("8d2cIoh/8/o=", "PEWbq");
        ab.lIIlIlIII[ab.lIIlIlIll[35]] = ab.llllIllIIll("43livD2WugzALHcpa0Xng0taZFk4Ti4g", "iNKtg");
        ab.lIIlIlIII[ab.lIIlIlIll[42]] = ab.llllIllIlIl("sw6Z9kY8StxQ4CROqgVezCO0ErEZp47ZZkPV4Y8t/sk=", "muWWt");
        ab.lIIlIlIII[ab.lIIlIlIll[43]] = ab.llllIllIlII("HDQGKhsmJlQtHGgnBjEbPDI=", "HAtDr");
        ab.lIIlIlIII[ab.lIIlIlIll[34]] = ab.llllIllIIll("4VjSfTrOAV0=", "xZLwp");
        ab.lIIlIlIII[ab.lIIlIlIll[44]] = ab.llllIllIlII("Ezw/Az84I3YDPyIsMw==", "VDVwV");
        ab.lIIlIlIII[ab.lIIlIlIll[10]] = ab.llllIllIlII("PBYkKE0eGDk3", "zwVEm");
        ab.lIIlIlIII[ab.lIIlIlIll[45]] = ab.llllIllIlIl("oXXDfREfvpg=", "sWeqN");
        ab.lIIlIlIII[ab.lIIlIlIll[46]] = ab.llllIllIlIl("pJ6d/hSQbj1D8LFEC1Y0Vg==", "pQfck");
        ab.lIIlIlIII[ab.lIIlIlIll[47]] = ab.llllIllIlIl("De5SMmIc9ozuUvsYk8xqrA==", "YYVFY");
        ab.lIIlIlIII[ab.lIIlIlIll[48]] = ab.llllIllIlII("KiMkPRMR", "yFEOp");
        ab.lIIlIlIII[ab.lIIlIlIll[50]] = ab.llllIllIlII("NScgIg4YJihjCxwtI2NQFS0xJhRZf3Nq", "yHGCx");
        ab.lIIlIlIII[ab.lIIlIlIll[52]] = ab.llllIllIlII("DAkrJDAvCChrJCsDI2t/IgMxLjtuU3Ni", "NfGKW");
        ab.lIIlIlIII[ab.lIIlIlIll[53]] = ab.llllIllIlIl("HrF89P0huzPlDMmUEzWeCet/MQZFiar6/FYtR3uu2Ew=", "oSzPz");
        ab.lIIlIlIII[ab.lIIlIlIll[39]] = ab.llllIllIlIl("18RI4AX9R/n39T11+3pJ1m/bgzJc7Ggc", "QrJOl");
        ab.lIIlIlIII[ab.lIIlIlIll[55]] = ab.llllIllIlII("Hi8DJnU8IR45", "XNqKU");
        ab.lIIlIlIII[ab.lIIlIlIll[56]] = ab.llllIllIlII("Gwk1AQ==", "TyPoU");
        ab.lIIlIlIII[ab.lIIlIlIll[57]] = ab.llllIllIIll("j0NOrjkDPpYrlwmHEM0z6r1E4Z0zIm8AtUP++MXUIYoaNbk2ao7Z83HCqvCrWcrr", "YsdLV");
        ab.lIIlIlIII[ab.lIIlIlIll[58]] = ab.llllIllIIll("e3sC7qXQ++evHfetC0IRKQ==", "qvEaV");
        ab.lIIlIlIII[ab.lIIlIlIll[59]] = ab.llllIllIIll("OQ4OeUesFu3JHjFfFqe6DA==", "hGKJp");
        ab.lIIlIlIII[ab.lIIlIlIll[60]] = ab.llllIllIlIl("jC0kI7/WWfzNQN8Z10492Q==", "YrheK");
        ab.lIIlIlIII[ab.lIIlIlIll[61]] = ab.llllIllIlII("HBU+Si0pCHEMOScXcQslKxI+GGdoCDQZLjwOOAQsaBM/GT8pFDIP", "HzQjK");
        ab.lIIlIlIII[ab.lIIlIlIll[62]] = ab.llllIllIlIl("EwpxMBnS6DPuVAZ9SAzPDi7KWy/z3i76bqxkYI8cG5c=", "VYrkb");
        ab.lIIlIlIII[ab.lIIlIlIll[3]] = ab.llllIllIlIl("G1MEYYUHpe7GaGyM1zbuJ+oEikH65Mtj", "pEmDd");
        ab.lIIlIlIII[ab.lIIlIlIll[63]] = ab.llllIllIlII("KD0SFgcFLA==", "lXbyt");
        ab.lIIlIlIII[ab.lIIlIlIll[64]] = ab.llllIllIlII("LgwnHTsFE24dOx8cKw==", "ktNiR");
        ab.lIIlIlIII[ab.lIIlIlIll[65]] = ab.llllIllIlIl("3fzt6qvbJ/gbnqEkJa1zUQ==", "oRmUD");
        ab.lIIlIlIII[ab.lIIlIlIll[66]] = ab.llllIllIlII("ACMtLw==", "OSHAI");
        ab.lIIlIlIII[ab.lIIlIlIll[67]] = ab.llllIllIlIl("oQ9czLHtqBxtYSmzH9R+/5NJkI8Loyp+", "idDad");
        ab.lIIlIlIII[ab.lIIlIlIll[68]] = ab.llllIllIIll("sHSLXSXkGoDZsgsK18qLecQFsRWJesrX", "rxjzk");
        ab.lIIlIlIII[ab.lIIlIlIll[70]] = ab.llllIllIlIl("docuINIypoYwEw/uXzzcJg==", "AHIvw");
        ab.lIIlIlIII[ab.lIIlIlIll[71]] = ab.llllIllIlII("IyAiAgEaIiRMExI+LkxE", "sLClu");
        ab.lIIlIlIII[ab.lIIlIlIll[72]] = ab.llllIllIlII("DQITHCQ=", "ZcgyV");
        ab.lIIlIlIII[ab.lIIlIlIll[73]] = ab.llllIllIlIl("oQNc1/Wdcg3p1Ha9D2aknw==", "QgGuY");
        ab.lIIlIlIII[ab.lIIlIlIll[2]] = ab.llllIllIlIl("abR2lEG8MiHOrSQUv3PJsg==", "HBwCG");
        ab.lIIlIlIII[ab.lIIlIlIll[74]] = ab.llllIllIIll("U/nIWg868go=", "VLSxL");
        ab.lIIlIlIII[ab.lIIlIlIll[75]] = ab.llllIllIIll("2roJzbl1s6QU02qqKwuoLQ==", "RInQO");
        ab.lIIlIlIII[ab.lIIlIlIll[76]] = ab.llllIllIlII("OQALLiICFQ==", "qayXG");
        ab.lIIlIlIII[ab.lIIlIlIll[77]] = ab.llllIllIlII("FyIzBHQ1LC4b", "QCAiT");
        ab.lIIlIlIII[ab.lIIlIlIll[37]] = ab.llllIllIlIl("x0IsuXD2vjRtmdjhnka1xw==", "nXRSM");
        ab.lIIlIlIII[ab.lIIlIlIll[78]] = ab.llllIllIlIl("xZDT0+bS+KU=", "nFFYN");
        ab.lIIlIlIII[ab.lIIlIlIll[79]] = ab.llllIllIlII("Azs8IT49NC8=", "TZHDL");
        ab.lIIlIlIII[ab.lIIlIlIll[80]] = ab.llllIllIlII("GyYEIRIgMw==", "SGvWw");
        ab.lIIlIlIII[ab.lIIlIlIll[51]] = ab.llllIllIIll("6b15yCxDDyx5KrLELCShLA==", "QTXBo");
        ab.lIIlIlIII[ab.lIIlIlIll[81]] = ab.llllIllIIll("cMYmvoKUJGs=", "PdNeW");
        ab.lIIlIlIII[ab.lIIlIlIll[82]] = ab.llllIllIIll("CDPMJLbdI/sJ8EyE3Y7PuH3QoRRDR6anysGEH8fI9ilyldHH+z28/w==", "DStGJ");
        ab.lIIlIlIII[ab.lIIlIlIll[83]] = ab.llllIllIlIl("3X18jTFiaLZ3xZcBm1giNJfTU4veTirN", "AXATB");
        ab.lIIlIlIII[ab.lIIlIlIll[85]] = ab.llllIllIlII("DhkkHws0C3YYDHoKJAQLLh8=", "ZlVqb");
        ab.lIIlIlIII[ab.lIIlIlIll[86]] = ab.llllIllIlII("HSsBNhcwOg==", "YNqYd");
        ab.lIIlIlIII[ab.lIIlIlIll[87]] = ab.llllIllIlIl("NDAecXEnIaq9yJsEIB4UhGwQ6Ut+Ydh+", "OTrVO");
        ab.lIIlIlIII[ab.lIIlIlIll[88]] = ab.llllIllIlIl("OmHUekxSbKoJ5cr/bL0KAw==", "YccHq");
        ab.lIIlIlIII[ab.lIIlIlIll[89]] = ab.llllIllIlII("JQslOxocCSN1CBQVKXVf", "ugDUn");
        ab.lIIlIlIII[ab.lIIlIlIll[90]] = ab.llllIllIIll("Rz1r3NjNT5POeeP5x0h+uQ==", "AZaLR");
        ab.lIIlIlIII[ab.lIIlIlIll[91]] = ab.llllIllIIll("2INsYoCM1zLeE6JrEP+FmQ==", "pMfMD");
        ab.lIIlIlIII[ab.lIIlIlIll[92]] = ab.llllIllIIll("JIQDQLyP0yyC5VmpnGX20A==", "YZLhm");
        ab.lIIlIlIII[ab.lIIlIlIll[93]] = ab.llllIllIIll("nT2p+TIMNxPo3xaeMJd/gA==", "Mubpd");
        ab.lIIlIlIII[ab.lIIlIlIll[94]] = ab.llllIllIlII("AxYfE0ggGFMeCSYaU0w=", "Twsxh");
        ab.lIIlIlIII[ab.lIIlIlIll[95]] = ab.llllIllIlIl("guehF2/NopnckHYUZNWNQw==", "zPbVT");
        ab.lIIlIlIII[ab.lIIlIlIll[96]] = ab.llllIllIlII("DxQkIU8sGmgsDioYaH8=", "XuHJo");
        ab.lIIlIlIII[ab.lIIlIlIll[97]] = ab.llllIllIlII("BR4PAx48HAlNDDQAA01f", "Urnmj");
        ab.lIIlIlIII[ab.lIIlIlIll[98]] = ab.llllIllIlIl("I4E9wLDW4iwqhGbUuWVETg==", "CPAJX");
        ab.lIIlIlIII[ab.lIIlIlIll[99]] = ab.llllIllIlIl("1sOPU3jPlZR2Cjc7YSPIJg==", "WWjEv");
        ab.lIIlIlIII[ab.lIIlIlIll[100]] = ab.llllIllIIll("4ZviLb2Nkedf97t58BlZZQ==", "FquPJ");
        ab.lIIlIlIII[ab.lIIlIlIll[49]] = ab.llllIllIIll("1W6/Yd7NyznQFomeEJrFmA==", "dEiGT");
        ab.lIIlIlIII[ab.lIIlIlIll[101]] = ab.llllIllIIll("1dL93pvrBGkosOUK6xFbSw==", "leAWI");
        ab.lIIlIlIII[ab.lIIlIlIll[102]] = ab.llllIllIIll("9CiFSJtygkHZutqchHADLA==", "NqaSt");
        ab.lIIlIlIII[ab.lIIlIlIll[103]] = ab.llllIllIlIl("U0uStX94TihhbBwxjZcrYA==", "HMPjg");
        ab.lIIlIlIII[ab.lIIlIlIll[104]] = ab.llllIllIlII("GAgCHhchCgRQBSkWDlBa", "Hdcpc");
        ab.lIIlIlIII[ab.lIIlIlIll[105]] = ab.llllIllIIll("CCShwLYYDOxoPSDoVfdCjQ==", "WACms");
        ab.lIIlIlIII[ab.lIIlIlIll[106]] = ab.llllIllIlIl("zvDvYDGEMZSa/M0o4yC0R/WLUZCiYGxc", "liIIE");
        ab.lIIlIlIII[ab.lIIlIlIll[107]] = ab.llllIllIlIl("ajaveTsI+TGq9IDTUqHClw==", "McVQf");
        ab.lIIlIlIII[ab.lIIlIlIll[108]] = ab.llllIllIlIl("8YjRJjYE4G6Mck4hqJ4ij7T24NW51L7f", "yTIIJ");
        ab.lIIlIlIII[ab.lIIlIlIll[109]] = ab.llllIllIIll("PW3IgFlcB9v1SSOiglLuSA==", "IUWru");
        ab.lIIlIlIII[ab.lIIlIlIll[110]] = ab.llllIllIlIl("dkdwSX7KkDDEm/Z+hjn6tZmtNmXvmov2", "UaPYP");
        ab.lIIlIlIII[ab.lIIlIlIll[69]] = ab.llllIllIIll("6VNDoIwvYGWbtet4iUwEzA==", "sMLWy");
        ab.lIIlIlIII[ab.lIIlIlIll[111]] = ab.llllIllIlIl("t8CyYPvNbCQbVCdqfgu+i2LUJmvamu4K", "VROYH");
        ab.lIIlIlIII[ab.lIIlIlIll[112]] = ab.llllIllIlII("FQkdJm02B1ErLDAFUXx5", "BhqMM");
        ab.lIIlIlIII[ab.lIIlIlIll[32]] = ab.llllIllIlIl("gekiXcNEitousMwvI+XxMn2Qf4M3FMJq", "hbKAL");
        ab.lIIlIlIII[ab.lIIlIlIll[113]] = ab.llllIllIIll("ncakl+V1xcfZI5DnidcBDg==", "nmfPP");
        ab.lIIlIlIII[ab.lIIlIlIll[114]] = ab.llllIllIIll("mfStys3u9v8vMIWJVai/sZaj4QsT1rxr", "TxtcR");
        ab.lIIlIlIII[ab.lIIlIlIll[115]] = ab.llllIllIIll("quaxxreu6ZDaTsPKi7fFkg==", "sQyid");
        ab.lIIlIlIII[ab.lIIlIlIll[116]] = ab.llllIllIlII("CC0DKjkxLwVkKzkzD2R8bg==", "XAbDM");
        ab.lIIlIlIII[ab.lIIlIlIll[117]] = ab.llllIllIlII("AzIrPXggPGcwOSY+Z2dv", "TSGVX");
        ab.lIIlIlIII[ab.lIIlIlIll[118]] = ab.llllIllIlIl("oJGPbUIZWtReE1bztgP6BvlOytFz1X0P", "NeGNb");
        ab.lIIlIlIII[ab.lIIlIlIll[119]] = ab.llllIllIlIl("Ae22hJwKe6JzEzwuf4iygA==", "rqOnr");
        ab.lIIlIlIII[ab.lIIlIlIll[120]] = ab.llllIllIlII("MSEnBzkIIyFJKwA/K0l8WQ==", "aMFiM");
        ab.lIIlIlIII[ab.lIIlIlIll[121]] = ab.llllIllIIll("axK0P3a6PGdCAr88PnjBSw==", "IxaSl");
        ab.lIIlIlIII[ab.lIIlIlIll[122]] = ab.llllIllIlII("MgkNJDELCwtqIwMXAWp0Ww==", "belJE");
        ab.lIIlIlIII[ab.lIIlIlIll[123]] = ab.llllIllIlII("FScjBGY2KW8JJzArb112", "BFOoF");
        ab.lIIlIlIII[ab.lIIlIlIll[124]] = ab.llllIllIlII("KhY3NyMTFDF5MRsIO3llSg==", "zzVYW");
        ab.lIIlIlIII[ab.lIIlIlIll[125]] = ab.llllIllIlIl("3E0D4XVUCfQi+wgLAtv2rA==", "sNkRY");
        ab.lIIlIlIII[ab.lIIlIlIll[133]] = ab.llllIllIlII("Nxo2MAI=", "djWTg");
        ab.lIIlIlIII[ab.lIIlIlIll[142]] = ab.llllIllIIll("DGPrU4bLMQZjUccWZ6cauw==", "rTNXh");
        ab.lIIlIlIII[ab.lIIlIlIll[143]] = ab.llllIllIlIl("i1KhgKjajEs=", "NyCzB");
        ab.lIIlIlIII[ab.lIIlIlIll[144]] = ab.llllIllIIll("vQcjYIwD261b7Q5qoEUA8Q==", "Hdocq");
        ab.lIIlIlIII[ab.lIIlIlIll[145]] = ab.llllIllIlII("Ayg3Kw==", "pMROm");
        ab.lIIlIlIII[ab.lIIlIlIll[146]] = ab.llllIllIIll("L39F9cL8e8Q=", "ieVfO");
        ab.lIIlIlIII[ab.lIIlIlIll[147]] = ab.llllIllIIll("tULnMDIrThVM3pMnPGg5Dg==", "vwMjR");
        ab.lIIlIlIII[ab.lIIlIlIll[148]] = ab.llllIllIlIl("VSyMY6Pzaws=", "BlWbQ");
        ab.lIIlIlIII[ab.lIIlIlIll[149]] = ab.llllIllIIll("jO0dZ9KiOA0=", "HZJoY");
        ab.lIIlIlIII[ab.lIIlIlIll[150]] = ab.llllIllIIll("gGSLeZKhWS/2rjY9G95C3Q==", "MXwga");
        ab.lIIlIlIII[ab.lIIlIlIll[151]] = ab.llllIllIlII("FiotAw==", "eOHgQ");
        ab.lIIlIlIII[ab.lIIlIlIll[152]] = ab.llllIllIlII("KiYcNQ==", "YCyQg");
        ab.lIIlIlIII[ab.lIIlIlIll[153]] = ab.llllIllIIll("WHZx645YRKP9bv1gNNuDDQ==", "SLWbY");
        ab.lIIlIlIII[ab.lIIlIlIll[154]] = ab.llllIllIlII("Og0dLA==", "IhxHE");
        ab.lIIlIlIII[ab.lIIlIlIll[155]] = ab.llllIllIlIl("bbrDXyS9nZA=", "QTlrv");
        ab.lIIlIlIII[ab.lIIlIlIll[156]] = ab.llllIllIlII("GgIYBgtuGw0aDSY=", "Nklnn");
        ab.lIIlIlIII[ab.lIIlIlIll[157]] = ab.llllIllIIll("G/UVc1mTziY=", "mXtbv");
        ab.lIIlIlIII[ab.lIIlIlIll[158]] = ab.llllIllIIll("1EBWTx+g0fM=", "RXKPT");
        ab.lIIlIlIII[ab.lIIlIlIll[159]] = ab.llllIllIIll("q/Z6bEzPCYZMNJp95tqhmQ==", "GVtWY");
        ab.lIIlIlIII[ab.lIIlIlIll[160]] = ab.llllIllIIll("ueFuYTw8Dug=", "ueNSc");
        ab.lIIlIlIII[ab.lIIlIlIll[161]] = ab.llllIllIIll("JTp8t6PZ/Dc=", "btavZ");
        ab.lIIlIlIII[ab.lIIlIlIll[162]] = ab.llllIllIlII("Pgw3HhBKFSICFgI=", "jeCvu");
        ab.lIIlIlIII[ab.lIIlIlIll[163]] = ab.llllIllIIll("CogvsRZ59zc=", "xEDif");
        ab.lIIlIlIII[ab.lIIlIlIll[164]] = ab.llllIllIlIl("RdASmJww4WE=", "lbHNm");
        ab.lIIlIlIII[ab.lIIlIlIll[165]] = ab.llllIllIlIl("SsXjJzuaHPy0Omcn7Zb+cg==", "USzrM");
        ab.lIIlIlIII[ab.lIIlIlIll[166]] = ab.llllIllIlIl("sNcQh/7YhTQ=", "eCKMf");
        ab.lIIlIlIII[ab.lIIlIlIll[167]] = ab.llllIllIlIl("A/LaCdUIVeY=", "SSlto");
        ab.lIIlIlIII[ab.lIIlIlIll[168]] = ab.llllIllIIll("hdW3MWX5HyD8qF2cORiC6g==", "JTzyu");
        ab.lIIlIlIII[ab.lIIlIlIll[169]] = ab.llllIllIIll("IG4SXW9N6ZY=", "hLErc");
        ab.lIIlIlIII[ab.lIIlIlIll[170]] = ab.llllIllIlII("KxcCEg==", "Xrgve");
        ab.lIIlIlIII[ab.lIIlIlIll[171]] = ab.llllIllIlII("AioDHA52MxYACD4=", "VCwtk");
        ab.lIIlIlIII[ab.lIIlIlIll[172]] = ab.llllIllIlII("EQ08Bg==", "bhYbN");
        ab.lIIlIlIII[ab.lIIlIlIll[173]] = ab.llllIllIIll("r+XDCbLH0kY=", "DpPag");
        ab.lIIlIlIII[ab.lIIlIlIll[174]] = ab.llllIllIlIl("/cYJkrlFJlyWHtvP5C+chQ==", "kwoke");
        ab.lIIlIlIII[ab.lIIlIlIll[175]] = ab.llllIllIlIl("ar+/d/rvpws=", "AGhoN");
        ab.lIIlIlIII[ab.lIIlIlIll[176]] = ab.llllIllIlIl("C3l4qCOrpT4=", "ofWWT");
        ab.lIIlIlIII[ab.lIIlIlIll[177]] = ab.llllIllIIll("nCICF0rf+lJVm6ya/Qk1Mw==", "SmAJV");
        ab.lIIlIlIII[ab.lIIlIlIll[178]] = ab.llllIllIlIl("QwK7JXYElfk=", "vrAVI");
        ab.lIIlIlIII[ab.lIIlIlIll[179]] = ab.llllIllIIll("XLTBmnKRLr8=", "RZEjI");
        ab.lIIlIlIII[ab.lIIlIlIll[180]] = ab.llllIllIIll("z7cPkN0RT0ju+Ssjw9NtyQ==", "lsukE");
        ab.lIIlIlIII[ab.lIIlIlIll[181]] = ab.llllIllIIll("w9CzWlwFRBk=", "qRDmn");
        ab.lIIlIlIII[ab.lIIlIlIll[182]] = ab.llllIllIlII("MQoTJg==", "BovBJ");
        ab.lIIlIlIII[ab.lIIlIlIll[183]] = ab.llllIllIlIl("Wds7epu4jdBRCA9ehskdbw==", "rzFby");
        ab.lIIlIlIII[ab.lIIlIlIll[184]] = ab.llllIllIlII("JyYjKw==", "TCFOv");
        ab.lIIlIlIII[ab.lIIlIlIll[185]] = ab.llllIllIlIl("fIq+bxx8JU0=", "fbmVR");
        ab.lIIlIlIII[ab.lIIlIlIll[186]] = ab.llllIllIlII("LQggLw9ZETUzCRE=", "yaTGj");
        ab.lIIlIlIII[ab.lIIlIlIll[187]] = ab.llllIllIlII("KgEULw==", "YdqKX");
        ab.lIIlIlIII[ab.lIIlIlIll[188]] = ab.llllIllIlIl("+3sRMhL2lI8=", "eUVIJ");
        ab.lIIlIlIII[ab.lIIlIlIll[189]] = ab.llllIllIlIl("igG9d0e9eyB+SGQimkMG0A==", "HxiXU");
        ab.lIIlIlIII[ab.lIIlIlIll[190]] = ab.llllIllIlII("Gws8Hg==", "hnYzO");
        ab.lIIlIlIII[ab.lIIlIlIll[191]] = ab.llllIllIlIl("ONSXDFDTOms=", "tEoPf");
        ab.lIIlIlIII[ab.lIIlIlIll[192]] = ab.llllIllIlII("PD06JQtIJC85DQA=", "hTNMn");
        ab.lIIlIlIII[ab.lIIlIlIll[193]] = ab.llllIllIlIl("K9aEhpRJMwo=", "qnqXU");
        ab.lIIlIlIII[ab.lIIlIlIll[194]] = ab.llllIllIlIl("NLpc0y2jvVQ=", "hwBMa");
        ab.lIIlIlIII[ab.lIIlIlIll[195]] = ab.llllIllIlII("Ph4OPSFKBxshJwI=", "jwzUD");
        ab.lIIlIlIII[ab.lIIlIlIll[196]] = ab.llllIllIlII("IjMfJw==", "QVzCR");
        ab.lIIlIlIII[ab.lIIlIlIll[197]] = ab.llllIllIIll("ZHUrEgqoNO8=", "Tjyib");
        ab.lIIlIlIII[ab.lIIlIlIll[198]] = ab.llllIllIlII("PBoYOAZIAw0kAAA=", "hslPc");
        ab.lIIlIlIII[ab.lIIlIlIll[199]] = ab.llllIllIlIl("BI1ZF07mNGE=", "GebFk");
        ab.lIIlIlIII[ab.lIIlIlIll[200]] = ab.llllIllIlIl("HDR0c8oYPGE=", "HBMzX");
        ab.lIIlIlIII[ab.lIIlIlIll[201]] = ab.llllIllIIll("Zy05rpLolYPxpHpPSIKzcw==", "iaDar");
        ab.lIIlIlIII[ab.lIIlIlIll[202]] = ab.llllIllIlIl("UqAkcVkKI+U=", "tnyTb");
        ab.lIIlIlIII[ab.lIIlIlIll[203]] = ab.llllIllIIll("e6ZErm6LAXc=", "YkUjv");
        ab.lIIlIlIII[ab.lIIlIlIll[204]] = ab.llllIllIlIl("KchMH3GcuAs=", "uWMwq");
        ab.lIIlIlIII[ab.lIIlIlIll[205]] = ab.llllIllIlIl("K7Br8IIE5iVVnRW/94I06w==", "vMETq");
        ab.lIIlIlIII[ab.lIIlIlIll[206]] = ab.llllIllIIll("YwLjaEQcrQU=", "rPXPW");
        ab.lIIlIlIII[ab.lIIlIlIll[207]] = ab.llllIllIlIl("RJQR7TkjTCs=", "XuXih");
        ab.lIIlIlIII[ab.lIIlIlIll[208]] = ab.llllIllIlIl("sSAKKjRQ6fqrgI/DZL45wQ==", "KhBxd");
        ab.lIIlIlIII[ab.lIIlIlIll[209]] = ab.llllIllIlIl("EkhoeF03yj0=", "zgGnw");
        ab.lIIlIlIII[ab.lIIlIlIll[210]] = ab.llllIllIlIl("koDxE+ieTKE=", "ppaHR");
        ab.lIIlIlIII[ab.lIIlIlIll[211]] = ab.llllIllIlII("Lwc2GiwUEg==", "gfDlI");
        ab.lIIlIlIII[ab.lIIlIlIll[212]] = ab.llllIllIIll("RH64TvvhPFg=", "PsNoy");
        ab.lIIlIlIII[ab.lIIlIlIll[213]] = ab.llllIllIIll("gr8Qr2KHnVU=", "ijHwD");
        ab.lIIlIlIII[ab.lIIlIlIll[214]] = ab.llllIllIlII("MSkxCQcrIjM=", "BLTmk");
        ab.lIIlIlIII[ab.lIIlIlIll[215]] = ab.llllIllIlIl("NR1ytUnTkVM=", "gIuti");
        ab.lIIlIlIII[ab.lIIlIlIll[216]] = ab.llllIllIlIl("bozbt1Ut8tc=", "klDrP");
        ab.lIIlIlIII[ab.lIIlIlIll[217]] = ab.llllIllIIll("Wmq7A4ZJXKA=", "LQhMw");
        ab.lIIlIlIII[ab.lIIlIlIll[218]] = ab.llllIllIlIl("hh6yyMRzKI8ZFR5AiQSNVw==", "YAzZU");
        ab.lIIlIlIII[ab.lIIlIlIll[219]] = ab.llllIllIIll("/9LeoK8tUws=", "xNxwg");
        ab.lIIlIlIII[ab.lIIlIlIll[220]] = ab.llllIllIlIl("Ak+2ufeHPwg=", "rjSEt");
        ab.lIIlIlIII[ab.lIIlIlIll[221]] = ab.llllIllIlII("AAoofA==", "ckFTW");
        ab.lIIlIlIII[ab.lIIlIlIll[222]] = ab.llllIllIlII("NScWew==", "VFxSl");
        ab.lIIlIlIII[ab.lIIlIlIll[223]] = ab.llllIllIlII("KhY8EwUwHT4=", "YsYwi");
        ab.lIIlIlIII[ab.lIIlIlIll[224]] = ab.llllIllIIll("MSSVZzh2wFA=", "dCszS");
        ab.lIIlIlIII[ab.lIIlIlIll[225]] = ab.llllIllIIll("eBtNH+WwG8g=", "pDoJl");
        ab.lIIlIlIII[ab.lIIlIlIll[226]] = ab.llllIllIIll("VjzXvAODeOo=", "KdUSx");
        ab.lIIlIlIII[ab.lIIlIlIll[227]] = ab.llllIllIlIl("k4VWYSbICT0=", "TDTFz");
        ab.lIIlIlIII[ab.lIIlIlIll[228]] = ab.llllIllIlII("IRc0Axk7HDY=", "RrQgu");
        ab.lIIlIlIII[ab.lIIlIlIll[229]] = ab.llllIllIlII("AgQmAxY=", "rhGmb");
        ab.lIIlIlIII[ab.lIIlIlIll[230]] = ab.llllIllIlIl("uc37YlICKcA=", "DUQJk");
        ab.lIIlIlIII[ab.lIIlIlIll[231]] = ab.llllIllIIll("VNvH7hIDJVM=", "JOoKj");
        ab.lIIlIlIII[ab.lIIlIlIll[232]] = ab.llllIllIlIl("Y2ElzM3QvndQxH4hKNYXBA==", "EmCFM");
        ab.lIIlIlIII[ab.lIIlIlIll[233]] = ab.llllIllIlII("FgACDw==", "eegkm");
        ab.lIIlIlIII[ab.lIIlIlIll[234]] = ab.llllIllIlIl("+ewGDTJP57Y=", "oVjge");
        ab.lIIlIlIII[ab.lIIlIlIll[235]] = ab.llllIllIIll("bcfF+zgUngI=", "xbfdV");
        ab.lIIlIlIII[ab.lIIlIlIll[236]] = ab.llllIllIlIl("/Sed8vF1Cyg=", "NBStE");
        ab.lIIlIlIII[ab.lIIlIlIll[237]] = ab.llllIllIIll("RH2c+mqCUcY=", "EoNPa");
        ab.lIIlIlIII[ab.lIIlIlIll[238]] = ab.llllIllIIll("pxqmY9NUvc+auV8UuXc7Ew==", "PUEtr");
        ab.lIIlIlIII[ab.lIIlIlIll[239]] = ab.llllIllIlIl("wy3NV9ERCTg=", "FeWoz");
        ab.lIIlIlIII[ab.lIIlIlIll[240]] = ab.llllIllIlIl("u/XKnFHK79I=", "AiqEN");
        ab.lIIlIlIII[ab.lIIlIlIll[241]] = ab.llllIllIIll("6qud+rceZIQ=", "nyyUO");
        ab.lIIlIlIII[ab.lIIlIlIll[242]] = ab.llllIllIlIl("KQaAROJXyd0=", "YrEwV");
        ab.lIIlIlIII[ab.lIIlIlIll[243]] = ab.llllIllIlIl("S4N4kawf+SE=", "DoTYY");
        ab.lIIlIlIII[ab.lIIlIlIll[244]] = ab.llllIllIIll("2MmWACWAi9c=", "KLYiD");
        ab.lIIlIlIII[ab.lIIlIlIll[245]] = ab.llllIllIlII("LSMIIzkAMg==", "iFxLJ");
        ab.lIIlIlIII[ab.lIIlIlIll[246]] = ab.llllIllIIll("gAWhWZUi5kg=", "scORz");
        ab.lIIlIlIII[ab.lIIlIlIll[248]] = ab.llllIllIIll("A1zqnVx+3H4=", "sWXum");
        ab.lIIlIlIII[ab.lIIlIlIll[249]] = ab.llllIllIlIl("Hv8q/MrlL8D0wv1YUx+Tbw==", "NonGI");
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
                    "".length();
                }
                catch (Exception lIIIIlIlIIIIlII2) {
                    lIIIIlIlIIIIlII2.printStackTrace();
                }
                if (" ".length() >= "  ".length()) {
                    return;
                }
                Time.sleepTicks((int)lIIlIlIll[1]);
                "".length();
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
                                "".length();
                                if (-" ".length() < 0) return n2 != 0;
                                return ((0x63 ^ 0x73) & ~(0x60 ^ 0x70)) != 0;
                            }
                        }
                        n2 = lIIlIlIll[0];
                        return n2 != 0;
                    });
                    if (ab.lllllIlIlIl(lIIIIlIlIIIIlII2)) {
                        AccBuilderEasyClues.c = lIIlIlIII[lIIlIlIll[43]];
                        lIIIIlIlIIIIlII2.interact(lIIlIlIII[lIIlIlIll[34]]);
                        Time.sleepTicks((int)lIIlIlIll[5]);
                        "".length();
                    }
                }
                if (ab.lllllIlIIll(Inventory.contains(item -> item.getName().contains(lIIlIlIII[lIIlIlIll[243]])) ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIIlIlIII[lIIlIlIll[44]];
                    String[] stringArray = new String[lIIlIlIll[1]];
                    stringArray[ab.lIIlIlIll[0]] = lIIlIlIII[lIIlIlIll[10]];
                    TileObjects.getNearest((String[])stringArray).interact(lIIlIlIII[lIIlIlIll[45]]);
                    Time.sleepTicks((int)lIIlIlIll[4]);
                    "".length();
                }
            }
            if (ab.lllllIllIII(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lIIIIlIlIIIIlIl), lIIlIlIll[7])) {
                AccBuilderEasyClues.c = lIIlIlIII[lIIlIlIll[46]];
                if (ab.lllllIlIIll(Dialog.isOpen() ? 1 : 0)) {
                    String[] stringArray = new String[lIIlIlIll[1]];
                    stringArray[ab.lIIlIlIll[0]] = lIIlIlIII[lIIlIlIll[47]];
                    TileObjects.getNearest((String[])stringArray).interact(lIIlIlIII[lIIlIlIll[48]]);
                    Time.sleepTicks((int)lIIlIlIll[4]);
                    "".length();
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
                    "".length();
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
                    "".length();
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
                                            "".length();
                                            if (" ".length() != (0xC3 ^ 0xC7)) return n2 != 0;
                                            return ((0x75 ^ 0x64) & ~(0xAF ^ 0xBE)) != 0;
                                        }
                                    }
                                    n2 = lIIlIlIll[0];
                                    return n2 != 0;
                                });
                                if (ab.lllllIlIlIl(lIIIIlIlIIIIlIl)) {
                                    AccBuilderEasyClues.c = lIIlIlIII[lIIlIlIll[3]];
                                    lIIIIlIlIIIIlIl.interact(lIIlIlIII[lIIlIlIll[63]]);
                                    Time.sleepTicks((int)lIIlIlIll[5]);
                                    "".length();
                                }
                            }
                            if (ab.lllllIlIIll(Inventory.contains(item -> item.getName().contains(lIIlIlIII[lIIlIlIll[239]])) ? 1 : 0)) {
                                AccBuilderEasyClues.c = lIIlIlIII[lIIlIlIll[64]];
                                String[] stringArray4 = new String[lIIlIlIll[1]];
                                stringArray4[ab.lIIlIlIll[0]] = lIIlIlIII[lIIlIlIll[65]];
                                TileObjects.getNearest((String[])stringArray4).interact(lIIlIlIII[lIIlIlIll[66]]);
                                Time.sleepTicks((int)lIIlIlIll[4]);
                                "".length();
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
                                    "".length();
                                }
                                int[] nArray = new int[lIIlIlIll[1]];
                                nArray[ab.lIIlIlIll[0]] = lIIlIlIll[9];
                                if (ab.lllllIlIIIl(Inventory.contains((int[])nArray) ? 1 : 0) && ab.lllllIlIlIl(lIIIIlIlIIIIIll = TileObjects.getNearest(tileObject -> {
                                    int n2;
                                    if (ab.lllllIlIIIl(tileObject.getName().contains(lIIlIlIII[lIIlIlIll[236]]) ? 1 : 0) && ab.lllllIllIII(tileObject.getWorldLocation().distanceTo(kN), lIIlIlIll[12])) {
                                        n2 = lIIlIlIll[1];
                                        "".length();
                                        if (" ".length() > (0x2E ^ 0x2A)) {
                                            return ((0xEE ^ 0x8F) & ~(0x4D ^ 0x2C)) != 0;
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
                                    "".length();
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
                                            "".length();
                                        }
                                    }
                                    if (ab.lllllIlIIIl(Players.getLocal().getWorldLocation().equals((Object)kO) ? 1 : 0) && ab.lllllIllIIl(TileObjects.getNearest(tileObject -> {
                                        int n2;
                                        if (ab.lllllIlIIIl(tileObject.getName().contains(lIIlIlIII[lIIlIlIll[235]]) ? 1 : 0) && ab.lllllIllIII(tileObject.getWorldLocation().distanceTo(Players.getLocal().getWorldLocation()), lIIlIlIll[7])) {
                                            n2 = lIIlIlIll[1];
                                            "".length();
                                            if (" ".length() < -" ".length()) {
                                                return ((114 + 46 - 157 + 131 ^ 119 + 0 - -7 + 23) & (86 + 16 - 82 + 133 ^ 101 + 118 - 146 + 65 ^ -" ".length())) != 0;
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
                                                "".length();
                                            }
                                            if (ab.lllllIlIlII(Movement.getRunEnergy(), lIIlIlIll[69])) {
                                                AccBuilderEasyClues.c = lIIlIlIII[lIIlIlIll[71]];
                                                if (ab.lllllIlIIIl(Inventory.contains(item -> item.getName().contains(lIIlIlIII[lIIlIlIll[234]])) ? 1 : 0)) {
                                                    Inventory.getFirst(item -> item.getName().contains(lIIlIlIII[lIIlIlIll[233]])).useOn(TileObjects.getNearest(tileObject -> {
                                                        int n2;
                                                        if (ab.lllllIlIIIl(tileObject.getName().contains(lIIlIlIII[lIIlIlIll[232]]) ? 1 : 0) && ab.lllllIllIII(tileObject.getWorldLocation().distanceTo(li), lIIlIlIll[4])) {
                                                            n2 = lIIlIlIll[1];
                                                            "".length();
                                                            if (((0x5B ^ 0x1B) & ~(0x1D ^ 0x5D)) != 0) {
                                                                return ((0x87 ^ 0xB1) & ~(0x3F ^ 9)) != 0;
                                                            }
                                                        } else {
                                                            n2 = lIIlIlIll[0];
                                                        }
                                                        return n2 != 0;
                                                    }));
                                                    Time.sleepTicks((int)lIIlIlIll[1]);
                                                    "".length();
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
                                            "".length();
                                            if ((107 + 81 - 77 + 17 ^ 85 + 107 - 174 + 114) > "  ".length()) return n2 != 0;
                                            return ((72 + 177 - 37 + 22 ^ 134 + 44 - 32 + 45) & (0x38 ^ 0x46 ^ (0x25 ^ 0xE) ^ -" ".length())) != 0;
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
                                                            "".length();
                                                            if (-(82 + 166 - 200 + 135 ^ 46 + 13 - 44 + 163) < 0) return n2 != 0;
                                                            return ((0x8E ^ 0xBE ^ (0x7D ^ 0x5D)) & (0xF6 ^ 0xAF ^ (0x7E ^ 0x37) ^ -" ".length())) != 0;
                                                        }
                                                    }
                                                    n2 = lIIlIlIll[0];
                                                    return n2 != 0;
                                                }));
                                                Time.sleepTicks((int)lIIlIlIll[1]);
                                                "".length();
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
                                                            "".length();
                                                            if ((0x7D ^ 0x6C ^ (0x11 ^ 4)) != 0) return n2 != 0;
                                                            return ((0x5F ^ 0x56 ^ (0xF2 ^ 0xA0)) & (90 + 85 - 104 + 159 ^ 141 + 98 - 131 + 81 ^ -" ".length())) != 0;
                                                        }
                                                    }
                                                    n2 = lIIlIlIll[0];
                                                    return n2 != 0;
                                                }));
                                                Time.sleepTicks((int)lIIlIlIll[1]);
                                                "".length();
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
                                        "".length();
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
                                            "".length();
                                            ab.dw();
                                            "".length();
                                            if (" ".length() >= -" ".length()) break;
                                            return;
                                        }
                                        if (ab.lllllIlIIll(Players.getLocal().getWorldLocation().equals((Object)kL.get(lIIlIlIll[0])) ? 1 : 0)) {
                                            AccBuilderEasyClues.c = "Nav to tile " + String.valueOf(kL.get(lIIlIlIll[0]));
                                            e.c(kL.get(lIIlIlIll[0]));
                                            Time.sleepTicks((int)lIIlIlIll[1]);
                                            "".length();
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
                                                    "".length();
                                                    if (((0x22 ^ 0x3A) & ~(0x8A ^ 0x92)) == 0) return n2 != 0;
                                                    return ((0x67 ^ 0x5D) & ~(0x28 ^ 0x12)) != 0;
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
                                                    "".length();
                                                }
                                            }
                                            String[] stringArray10 = new String[lIIlIlIll[1]];
                                            stringArray10[ab.lIIlIlIll[0]] = lIIlIlIII[lIIlIlIll[80]];
                                            if (ab.lllllIlIIIl(lIIIIlIlIIIIIlI.hasAction(stringArray10) ? 1 : 0)) {
                                                AccBuilderEasyClues.c = lIIlIlIII[lIIlIlIll[51]];
                                                lIIIIlIlIIIIIlI.interact(lIIlIlIII[lIIlIlIll[81]]);
                                                Time.sleepTicks((int)lIIlIlIll[1]);
                                                "".length();
                                                if (ab.lllllIlIIIl(kL.get(lIIlIlIll[0]).equals((Object)lh) ? 1 : 0)) {
                                                    AccBuilderEasyClues.c = lIIlIlIII[lIIlIlIll[82]];
                                                    Time.sleepTicks((int)lIIlIlIll[22]);
                                                    "".length();
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
                                                            "".length();
                                                            if ((0xA3 ^ 0xA7) > ((0x61 ^ 0x70) & ~(0x51 ^ 0x40))) return n2 != 0;
                                                            return ((0x7F ^ 0x58) & ~(0xA ^ 0x2D)) != 0;
                                                        }
                                                    }
                                                    n2 = lIIlIlIll[0];
                                                    return n2 != 0;
                                                }))) {
                                                    bl = lIIlIlIll[1];
                                                    "".length();
                                                    if (-" ".length() > (0x7F ^ 0x3E ^ (0xC0 ^ 0x85))) {
                                                        return ((0x54 ^ 0x12 ^ (0x16 ^ 0x5D)) & (72 + 35 - 82 + 127 ^ 106 + 67 - 83 + 59 ^ -" ".length())) != 0;
                                                    }
                                                } else {
                                                    bl = lIIlIlIll[0];
                                                }
                                                return bl;
                                            }, (int)lIIlIlIll[84]);
                                            "".length();
                                        }
                                        if (ab.lllllIllIIl(lIIIIlIlIIIIIlI)) {
                                            kL.remove(lIIlIlIll[0]);
                                            "".length();
                                            kM.remove(lIIlIlIll[0]);
                                            "".length();
                                        }
                                        "".length();
                                        if (" ".length() <= (0x3E ^ 0x3A)) continue;
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
                                "".length();
                                if ("   ".length() < " ".length()) {
                                    return ((212 + 149 - 249 + 134 ^ 94 + 39 - 110 + 150) & (39 + 25 - -94 + 84 ^ 109 + 28 - 48 + 80 ^ -" ".length())) != 0;
                                }
                            } else {
                                n2 = lIIlIlIll[0];
                            }
                            return n2 != 0;
                        }))) {
                            AccBuilderEasyClues.c = lIIlIlIII[lIIlIlIll[85]];
                            lIIIIlIlIIIIlIl.interact(lIIlIlIII[lIIlIlIll[86]]);
                            Time.sleepTicks((int)lIIlIlIll[5]);
                            "".length();
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
    private static boolean ab() {
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
                        "".length();
                        if (null == null) return n3 != 0;
                        return ((0x1D ^ 0x11) & ~(0xC8 ^ 0xC4)) != 0;
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
                    "".length();
                    if (-" ".length() <= 0) return n2 != 0;
                    return ((59 + 47 - 23 + 53 ^ 15 + 133 - 47 + 43) & (0x76 ^ 0x6B ^ (0x8D ^ 0x88) ^ -" ".length())) != 0;
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

    private static String llllIllIIll(String lIIIIlIIIIlIlII, String lIIIIlIIIIlIIll) {
        try {
            SecretKeySpec lIIIIlIIIIllIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIIIIlIIIIlIIll.getBytes(StandardCharsets.UTF_8)), lIIlIlIll[22]), "DES");
            Cipher lIIIIlIIIIllIII = Cipher.getInstance("DES");
            lIIIIlIIIIllIII.init(lIIlIlIll[4], lIIIIlIIIIllIIl);
            return new String(lIIIIlIIIIllIII.doFinal(Base64.getDecoder().decode(lIIIIlIIIIlIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIIIIlIIIIlIlll) {
            lIIIIlIIIIlIlll.printStackTrace();
            return null;
        }
    }

    public static void af() {
        d lIIIIlIIlllllII;
        block16: {
            block15: {
                int[] nArray = new int[lIIlIlIll[1]];
                nArray[ab.lIIlIlIll[0]] = lIIlIlIll[16];
                if (ab.lllllIlIIll(Bank.contains((int[])nArray) ? 1 : 0)) {
                    d d2 = new d(lIIlIlIll[16], lIIlIlIll[1], lIIlIlIll[134]);
                    bv.add(d2);
                    "".length();
                }
                int[] nArray2 = new int[lIIlIlIll[1]];
                nArray2[ab.lIIlIlIll[0]] = lIIlIlIll[17];
                if (ab.lllllIlIIll(Bank.contains((int[])nArray2) ? 1 : 0)) {
                    lIIIIlIIlllllII = new d(lIIlIlIll[17], lIIlIlIll[4], lIIlIlIll[135]);
                    bv.add(lIIIIlIIlllllII);
                    "".length();
                }
                int[] nArray3 = new int[lIIlIlIll[1]];
                nArray3[ab.lIIlIlIll[0]] = lIIlIlIll[31];
                if (ab.lllllIlIIll(Bank.contains((int[])nArray3) ? 1 : 0)) {
                    lIIIIlIIlllllII = new d(lIIlIlIll[31], lIIlIlIll[1], lIIlIlIll[135]);
                    bv.add(lIIIIlIIlllllII);
                    "".length();
                }
                int[] nArray4 = new int[lIIlIlIll[1]];
                nArray4[ab.lIIlIlIll[0]] = lIIlIlIll[36];
                if (ab.lllllIlIIll(Bank.contains((int[])nArray4) ? 1 : 0)) {
                    lIIIIlIIlllllII = new d(lIIlIlIll[36], lIIlIlIll[1], lIIlIlIll[135]);
                    bv.add(lIIIIlIIlllllII);
                    "".length();
                }
                int[] nArray5 = new int[lIIlIlIll[1]];
                nArray5[ab.lIIlIlIll[0]] = lIIlIlIll[24];
                if (ab.lllllIlIIll(Bank.contains((int[])nArray5) ? 1 : 0)) {
                    lIIIIlIIlllllII = new d(lIIlIlIll[24], lIIlIlIll[1], lIIlIlIll[135]);
                    bv.add(lIIIIlIIlllllII);
                    "".length();
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
            lIIIIlIIlllllII = new d(lIIlIlIll[9], lIIlIlIll[10], lIIlIlIll[136]);
            bv.add(lIIIIlIIlllllII);
            "".length();
        }
        int[] nArray = new int[lIIlIlIll[1]];
        nArray[ab.lIIlIlIll[0]] = lIIlIlIll[13];
        if (ab.lllllIlIIll(Bank.contains((int[])nArray) ? 1 : 0)) {
            lIIIIlIIlllllII = new d(lIIlIlIll[13], lIIlIlIll[12], lIIlIlIll[137]);
            bv.add(lIIIIlIIlllllII);
            "".length();
        }
        int[] nArray9 = new int[lIIlIlIll[1]];
        nArray9[ab.lIIlIlIll[0]] = lIIlIlIll[19];
        if (ab.lllllIlIIll(Bank.contains((int[])nArray9) ? 1 : 0)) {
            lIIIIlIIlllllII = new d(lIIlIlIll[19], lIIlIlIll[12], lIIlIlIll[138]);
            bv.add(lIIIIlIIlllllII);
            "".length();
        }
        int[] nArray10 = new int[lIIlIlIll[1]];
        nArray10[ab.lIIlIlIll[0]] = lIIlIlIll[15];
        if (ab.lllllIlIIll(Bank.contains((int[])nArray10) ? 1 : 0)) {
            lIIIIlIIlllllII = new d(lIIlIlIll[15], lIIlIlIll[12], lIIlIlIll[138]);
            bv.add(lIIIIlIIlllllII);
            "".length();
        }
        int[] nArray11 = new int[lIIlIlIll[1]];
        nArray11[ab.lIIlIlIll[0]] = lIIlIlIll[14];
        if (ab.lllllIlIIll(Bank.contains((int[])nArray11) ? 1 : 0)) {
            lIIIIlIIlllllII = new d(lIIlIlIll[14], lIIlIlIll[12], lIIlIlIll[138]);
            bv.add(lIIIIlIIlllllII);
            "".length();
        }
        int[] nArray12 = new int[lIIlIlIll[1]];
        nArray12[ab.lIIlIlIll[0]] = lIIlIlIll[21];
        if (ab.lllllIlIIll(Bank.contains((int[])nArray12) ? 1 : 0)) {
            lIIIIlIIlllllII = new d(ky, lIIlIlIll[68], lIIlIlIll[139]);
            bv.add(lIIIIlIIlllllII);
            "".length();
        }
        int[] nArray13 = new int[lIIlIlIll[1]];
        nArray13[ab.lIIlIlIll[0]] = lIIlIlIll[140];
        if (ab.lllllIlIIll(Bank.contains((int[])nArray13) ? 1 : 0)) {
            lIIIIlIIlllllII = new d(lIIlIlIll[140], lIIlIlIll[1], lIIlIlIll[141]);
            bv.add(lIIIIlIIlllllII);
            "".length();
        }
        int[] nArray14 = new int[lIIlIlIll[1]];
        nArray14[ab.lIIlIlIll[0]] = lIIlIlIll[18];
        if (ab.lllllIlIIll(Bank.contains((int[])nArray14) ? 1 : 0)) {
            lIIIIlIIlllllII = new d(lIIlIlIll[18], lIIlIlIll[47], i.bq);
            bv.add(lIIIIlIIlllllII);
            "".length();
        }
    }

    @Override
    public boolean V() {
        boolean bl;
        if (ab.lllllIlIlII(Skills.getLevel((Skill)Skill.FARMING), lIIlIlIll[2])) {
            bl = lIIlIlIll[1];
            "".length();
            if (null != null) {
                return ((0x2F ^ 0x1C) & ~(0x89 ^ 0xBA)) != 0;
            }
        } else {
            bl = lIIlIlIll[0];
        }
        return bl;
    }

    private static void lllllIlIIII() {
        lIIlIlIll = new int[251];
        ab.lIIlIlIll[0] = (0x7E ^ 0x38 ^ (1 ^ 6)) & (175 + 139 - 142 + 54 ^ 162 + 129 - 184 + 56 ^ -" ".length());
        ab.lIIlIlIll[1] = " ".length();
        ab.lIIlIlIll[2] = 31 + 85 - 12 + 42 ^ 155 + 156 - 169 + 49;
        ab.lIIlIlIll[3] = 0xA8 ^ 0x8A;
        ab.lIIlIlIll[4] = "  ".length();
        ab.lIIlIlIll[5] = "   ".length();
        ab.lIIlIlIll[6] = 0x1F ^ 0x67 ^ (0xE5 ^ 0x99);
        ab.lIIlIlIll[7] = 0x3C ^ 6 ^ (0x5D ^ 0x62);
        ab.lIIlIlIll[8] = 0xFFFFFF8F & 0x13F8;
        ab.lIIlIlIll[9] = -(0xFFFFFA6F & 0xF9D) & (0xFFFFBEDF & 0x5FFF);
        ab.lIIlIlIll[10] = 69 + 72 - 115 + 108 ^ 44 + 5 - 24 + 126;
        ab.lIIlIlIll[11] = 0xB0 ^ 0xB6;
        ab.lIIlIlIll[12] = 0xC6 ^ 0xC0 ^ (0x1C ^ 0x10);
        ab.lIIlIlIll[13] = -(0xFFFFE65F & 0x59B9) & (0xFFFFFF7F & 0x5FDF);
        ab.lIIlIlIll[14] = 0xFFFFDF7D & 0x3FCA;
        ab.lIIlIlIll[15] = -(0xFFFFB773 & 0x68BF) & (0xFFFFFFFF & 0x3F7B);
        ab.lIIlIlIll[16] = -(81 + 194 - 244 + 164) & (0xFFFF8FEF & 0x7FDF);
        ab.lIIlIlIll[17] = 0xFFFFAEFD & 0x7FCE;
        ab.lIIlIlIll[18] = -(0xFFFFFEBD & 0x47CF) & (0xFFFFFFDD & 0x77FF);
        ab.lIIlIlIll[19] = -(0xFFFFE587 & 0x7AFE) & (0xFFFFFFCF & Short.MAX_VALUE);
        ab.lIIlIlIll[20] = 0x97 ^ 0x90;
        ab.lIIlIlIll[21] = 0xFFFFD79F & 0x29E1;
        ab.lIIlIlIll[22] = "  ".length() ^ (0x2E ^ 0x24);
        ab.lIIlIlIll[23] = 0x14 ^ 7 ^ (0x97 ^ 0x8D);
        ab.lIIlIlIll[24] = -(0xFFFFF7F5 & 0x6A2B) & (0xFFFFF7FF & 0x7EFF);
        ab.lIIlIlIll[25] = 0xFFFFFFF4 & 0x2E5F;
        ab.lIIlIlIll[26] = -(0x31 ^ 0x37) & (0xFFFFBEDF & 0x6F75);
        ab.lIIlIlIll[27] = -(0xFFFFFBB9 & 0x5567) & (0xFFFFFF6E & Short.MAX_VALUE);
        ab.lIIlIlIll[28] = -(0xFFFFEBBF & 0x55C3) & (0xFFFFFFFE & 0x6FCF);
        ab.lIIlIlIll[29] = 0xFFFFAF7F & 0x7ED2;
        ab.lIIlIlIll[30] = -(0xFFFFF53F & 0x5AD1) & (0xFFFFFFFB & 0x7E5E);
        ab.lIIlIlIll[31] = 0xFFFFEFDE & 0x3EE1;
        ab.lIIlIlIll[32] = 8 ^ 0x3B ^ (0x68 ^ 3);
        ab.lIIlIlIll[33] = -(0xFFFFFDE7 & 0x32DD) & (0xFFFFFFCF & Short.MAX_VALUE);
        ab.lIIlIlIll[34] = 135 + 32 - -12 + 6 ^ 116 + 120 - 206 + 152;
        ab.lIIlIlIll[35] = 0x11 ^ 0x1D;
        ab.lIIlIlIll[36] = 0xFFFF9FFD & 0x63BA;
        ab.lIIlIlIll[37] = 0x80 ^ 0xB2;
        ab.lIIlIlIll[38] = 0xD ^ 0x33 ^ (0x46 ^ 0x73);
        ab.lIIlIlIll[39] = 60 + 103 - 33 + 32 ^ 174 + 79 - 197 + 131;
        ab.lIIlIlIll[40] = 0xFFFFCFBD & 0x374B;
        ab.lIIlIlIll[41] = 0xFFFFAFBF & 0x5DEF;
        ab.lIIlIlIll[42] = 90 + 0 - -20 + 58 ^ 74 + 53 - 45 + 83;
        ab.lIIlIlIll[43] = 0x8E ^ 0x80;
        ab.lIIlIlIll[44] = 0x27 ^ 0x35 ^ "  ".length();
        ab.lIIlIlIll[45] = 0x87 ^ 0xAD ^ (0x2D ^ 0x15);
        ab.lIIlIlIll[46] = 0xEC ^ 0x9B ^ (0xCC ^ 0xA8);
        ab.lIIlIlIll[47] = 0x87 ^ 0x93;
        ab.lIIlIlIll[48] = 0x2C ^ 0x39;
        ab.lIIlIlIll[49] = 0x40 ^ 0x3B ^ (0x3A ^ 0xB);
        ab.lIIlIlIll[50] = 0x85 ^ 0x93;
        ab.lIIlIlIll[51] = 0x9E ^ 0xA8;
        ab.lIIlIlIll[52] = 0x55 ^ 0x42;
        ab.lIIlIlIll[53] = 0x62 ^ 0x76 ^ (0x40 ^ 0x4C);
        ab.lIIlIlIll[54] = 0xFFFFA7FB & 0x7F14;
        ab.lIIlIlIll[55] = 175 + 148 - 240 + 99 ^ 57 + 99 - 12 + 28;
        ab.lIIlIlIll[56] = 0x7F ^ 0x64;
        ab.lIIlIlIll[57] = 0x86 ^ 0x9A;
        ab.lIIlIlIll[58] = 5 + 95 - 66 + 143 ^ 112 + 134 - 203 + 129;
        ab.lIIlIlIll[59] = 0x75 ^ 0x6B;
        ab.lIIlIlIll[60] = 0x48 ^ 0x57;
        ab.lIIlIlIll[61] = 4 ^ 0x24;
        ab.lIIlIlIll[62] = 0x87 ^ 0xA6;
        ab.lIIlIlIll[63] = 0xA7 ^ 0x84;
        ab.lIIlIlIll[64] = 0x89 ^ 0xC1 ^ (0xAC ^ 0xC0);
        ab.lIIlIlIll[65] = 0x66 ^ 0x43;
        ab.lIIlIlIll[66] = 35 + 126 - 127 + 157 ^ 31 + 106 - 82 + 98;
        ab.lIIlIlIll[67] = 0xD3 ^ 0x80 ^ (0xDE ^ 0xAA);
        ab.lIIlIlIll[68] = 0x6B ^ 0x43;
        ab.lIIlIlIll[69] = 0xE4 ^ 0xB1;
        ab.lIIlIlIll[70] = 0xC4 ^ 0xB9 ^ (0x94 ^ 0xC0);
        ab.lIIlIlIll[71] = 0x74 ^ 0x2C ^ (0x58 ^ 0x2A);
        ab.lIIlIlIll[72] = 0xF5 ^ 0xC3 ^ (0x8A ^ 0x97);
        ab.lIIlIlIll[73] = 0xF ^ 0x23;
        ab.lIIlIlIll[74] = 0x8A ^ 0xA5 ^ " ".length();
        ab.lIIlIlIll[75] = 0x77 ^ 0x58;
        ab.lIIlIlIll[76] = 0x24 ^ 0x2B ^ (0xB4 ^ 0x8B);
        ab.lIIlIlIll[77] = 0xFA ^ 0x80 ^ (0x1B ^ 0x50);
        ab.lIIlIlIll[78] = 0xE ^ 0x3D;
        ab.lIIlIlIll[79] = 0xA6 ^ 0xAF ^ (0x1E ^ 0x23);
        ab.lIIlIlIll[80] = 0x93 ^ 0xC6 ^ (0x20 ^ 0x40);
        ab.lIIlIlIll[81] = 0x32 ^ 5;
        ab.lIIlIlIll[82] = 0x8E ^ 0xA5 ^ (0xB6 ^ 0xA5);
        ab.lIIlIlIll[83] = 0x5A ^ 0x63;
        ab.lIIlIlIll[84] = 0xFFFFFFF9 & 0xAF6;
        ab.lIIlIlIll[85] = 0xED ^ 0x9E ^ (0xDE ^ 0x97);
        ab.lIIlIlIll[86] = 0x40 ^ 0x71 ^ (0x6B ^ 0x61);
        ab.lIIlIlIll[87] = 0x2F ^ 0xC ^ (0x66 ^ 0x79);
        ab.lIIlIlIll[88] = 0x78 ^ 6 ^ (0xC2 ^ 0x81);
        ab.lIIlIlIll[89] = 0x77 ^ 0x49;
        ab.lIIlIlIll[90] = 0x7D ^ 0x67 ^ (0xAD ^ 0x88);
        ab.lIIlIlIll[91] = 0x94 ^ 0x81 ^ (0x59 ^ 0xC);
        ab.lIIlIlIll[92] = 0x10 ^ 0x51;
        ab.lIIlIlIll[93] = 23 + 53 - -33 + 86 ^ 44 + 120 - 69 + 34;
        ab.lIIlIlIll[94] = 7 ^ 0x44;
        ab.lIIlIlIll[95] = 0xE2 ^ 0xAE ^ (0x62 ^ 0x6A);
        ab.lIIlIlIll[96] = 0x78 ^ 0x3D;
        ab.lIIlIlIll[97] = 0xD1 ^ 0x97;
        ab.lIIlIlIll[98] = 0x44 ^ 3;
        ab.lIIlIlIll[99] = 0xA ^ 0x42;
        ab.lIIlIlIll[100] = 23 + 194 - 32 + 26 ^ 77 + 135 - 191 + 133;
        ab.lIIlIlIll[101] = 0x51 ^ 0x69 ^ (0xC5 ^ 0xB6);
        ab.lIIlIlIll[102] = 155 + 86 - 200 + 185 ^ 54 + 48 - -60 + 12;
        ab.lIIlIlIll[103] = 8 ^ 0x45;
        ab.lIIlIlIll[104] = 72 + 136 - 121 + 50 ^ 135 + 156 - 184 + 92;
        ab.lIIlIlIll[105] = 0x34 ^ 0x68 ^ (0x9E ^ 0x8D);
        ab.lIIlIlIll[106] = 0x38 ^ 0x68;
        ab.lIIlIlIll[107] = 0x65 ^ 0x34;
        ab.lIIlIlIll[108] = 0x68 ^ 0x3A;
        ab.lIIlIlIll[109] = 0xD4 ^ 0x87;
        ab.lIIlIlIll[110] = 0x12 ^ 0x46;
        ab.lIIlIlIll[111] = " ".length() ^ (0xEA ^ 0xBD);
        ab.lIIlIlIll[112] = 0x3D ^ 0x71 ^ (4 ^ 0x1F);
        ab.lIIlIlIll[113] = 72 + 50 - -6 + 65 ^ 150 + 122 - 249 + 129;
        ab.lIIlIlIll[114] = 0x39 ^ 0x63;
        ab.lIIlIlIll[115] = 0x71 ^ 0x7E ^ (0x4D ^ 0x19);
        ab.lIIlIlIll[116] = 0x7A ^ 0x38 ^ (0x96 ^ 0x88);
        ab.lIIlIlIll[117] = 0x45 ^ 0x18;
        ab.lIIlIlIll[118] = 0x71 ^ 0x52 ^ (3 ^ 0x7E);
        ab.lIIlIlIll[119] = 0x45 ^ 0x29 ^ (0x4A ^ 0x79);
        ab.lIIlIlIll[120] = 0xD8 ^ 0xB8;
        ab.lIIlIlIll[121] = 0x50 ^ 0xF ^ (0x45 ^ 0x7B);
        ab.lIIlIlIll[122] = 0x17 ^ 0x75;
        ab.lIIlIlIll[123] = 0x7A ^ 0x19;
        ab.lIIlIlIll[124] = 0x60 ^ 4;
        ab.lIIlIlIll[125] = 5 + 31 - -80 + 78 ^ 15 + 149 - 47 + 50;
        ab.lIIlIlIll[126] = -(0xFFFFAAD1 & 0x5FAF) & (0xFFFFFFFB & 0x3EF5);
        ab.lIIlIlIll[127] = -(0xFFFF9E2F & 0x6BDA) & (0xFFFFBE7D & 0x7FFB);
        ab.lIIlIlIll[128] = 0xFFFFF5EF & 0x3E7F;
        ab.lIIlIlIll[129] = -(0xFFFFFBBE & 0x4DCD) & (0xFFFFFDFF & Short.MAX_VALUE);
        ab.lIIlIlIll[130] = 0xFFFFB6F7 & 0x7D7B;
        ab.lIIlIlIll[131] = -(0xFFFFDBAF & 0x675D) & (0xFFFFF7FE & 0x7F7F);
        ab.lIIlIlIll[132] = 0xFFFFFB31 & 0x56DF;
        ab.lIIlIlIll[133] = 0xEA ^ 0x8C;
        ab.lIIlIlIll[134] = -(0xFFFFA6A7 & 0x7BDC) & (0xFFFFFFFF & 0x37FF);
        ab.lIIlIlIll[135] = 0xFFFFFDBB & 0x63EC;
        ab.lIIlIlIll[136] = -(0xFFFFED0C & 0x76F7) & (0xFFFFEFEB & 0x77FF);
        ab.lIIlIlIll[137] = 0xFFFF93F4 & 0x6F8F;
        ab.lIIlIlIll[138] = -(0xFFFFE98A & 0x1E7F) & (0xFFFF8BBF & Short.MAX_VALUE);
        ab.lIIlIlIll[139] = -(0xFFFFD8C7 & 0x7779) & (0xFFFFDFFF & 0x77DE);
        ab.lIIlIlIll[140] = -(0xFFFFC9B7 & 0x775D) & (0xFFFFFFFE & 0x6FDF);
        ab.lIIlIlIll[141] = -(0xFFFF896F & 0x7EB2) & (0xFFFFFFFF & 0x6D7F);
        ab.lIIlIlIll[142] = 0x60 ^ 7;
        ab.lIIlIlIll[143] = 0x6D ^ 5;
        ab.lIIlIlIll[144] = 0x2A ^ 0x5D ^ (0x1E ^ 0);
        ab.lIIlIlIll[145] = 0x6A ^ 0;
        ab.lIIlIlIll[146] = 0x25 ^ 0x4E;
        ab.lIIlIlIll[147] = 0x4C ^ 0xF ^ (0xAA ^ 0x85);
        ab.lIIlIlIll[148] = 0x46 ^ 0x2B;
        ab.lIIlIlIll[149] = 0x5C ^ 0x32;
        ab.lIIlIlIll[150] = 0xF4 ^ 0x9B;
        ab.lIIlIlIll[151] = 2 ^ 0x72;
        ab.lIIlIlIll[152] = 0x6E ^ 0x1F;
        ab.lIIlIlIll[153] = 0xCA ^ 0xC5 ^ (0x64 ^ 0x19);
        ab.lIIlIlIll[154] = 0x4F ^ 0x3C;
        ab.lIIlIlIll[155] = 0x75 ^ 1;
        ab.lIIlIlIll[156] = 185 + 70 - 62 + 45 ^ 142 + 151 - 258 + 120;
        ab.lIIlIlIll[157] = 0xE3 ^ 0x95;
        ab.lIIlIlIll[158] = 3 + 57 - 7 + 153 ^ 176 + 48 - 201 + 162;
        ab.lIIlIlIll[159] = 0xE3 ^ 0x9B;
        ab.lIIlIlIll[160] = 0xDD ^ 0xA4;
        ab.lIIlIlIll[161] = 0xF1 ^ 0xA4 ^ (0x23 ^ 0xC);
        ab.lIIlIlIll[162] = 0x5E ^ 0x54 ^ (0xF9 ^ 0x88);
        ab.lIIlIlIll[163] = 0x38 ^ 0x44;
        ab.lIIlIlIll[164] = 0xCE ^ 0x89 ^ (0x27 ^ 0x1D);
        ab.lIIlIlIll[165] = 0xF7 ^ 0xBC ^ (0x85 ^ 0xB0);
        ab.lIIlIlIll[166] = (0x29 ^ 0x73) + (0xF1 ^ 0x95) - (0x5D ^ 0x62) + ((0x83 ^ 0x86) & ~(0x84 ^ 0x81));
        ab.lIIlIlIll[167] = (0x1D ^ 9) + (0x64 ^ 0x59) - " ".length() + (0xAC ^ 0x9C);
        ab.lIIlIlIll[168] = (0xAB ^ 0x90) + (0x15 ^ 0x34) - (0x5C ^ 0x71) + (0x14 ^ 0x46);
        ab.lIIlIlIll[169] = 61 + 32 - 42 + 79;
        ab.lIIlIlIll[170] = 72 + 78 - 99 + 80;
        ab.lIIlIlIll[171] = (0x25 ^ 0x75) + (4 ^ 0x42) - (0x34 ^ 0x5E) + (0x29 ^ 0x71);
        ab.lIIlIlIll[172] = 14 + 21 - -80 + 18;
        ab.lIIlIlIll[173] = (0x81 ^ 0x93) + (0x5F ^ 0x3A) - (0xB4 ^ 0xAC) + (0x9C ^ 0xBB);
        ab.lIIlIlIll[174] = 48 + 10 - -52 + 20 + (0x5F ^ 0x26) - (29 + 104 - 81 + 87) + (0x72 ^ 0x65);
        ab.lIIlIlIll[175] = 10 + 128 - 23 + 21;
        ab.lIIlIlIll[176] = 112 + 34 - 30 + 21;
        ab.lIIlIlIll[177] = (0x52 ^ 0x4F) + (0x29 ^ 0x35) - -(0x3E ^ 0x6F) + ((0x4A ^ 0x1B) & ~(0xD3 ^ 0x82));
        ab.lIIlIlIll[178] = (0x55 ^ 0x11) + (65 + 50 - -2 + 12) - (0x69 ^ 0x39) + (0x98 ^ 0x8E);
        ab.lIIlIlIll[179] = (0xCA ^ 0x85) + (118 + 29 - 128 + 116) - (0x54 ^ 0) + (0xC8 ^ 0xC2);
        ab.lIIlIlIll[180] = 87 + 118 - 87 + 23;
        ab.lIIlIlIll[181] = 123 + 87 - 184 + 116;
        ab.lIIlIlIll[182] = (0x3E ^ 0x44) + (0x4C ^ 0x21) - (40 + 16 - -18 + 141) + (88 + 125 - 206 + 120);
        ab.lIIlIlIll[183] = (0x49 ^ 0x13) + (61 + 1 - -15 + 60) - (23 + 137 - 43 + 86) + (0xA ^ 0x72);
        ab.lIIlIlIll[184] = 107 + 85 - 140 + 93;
        ab.lIIlIlIll[185] = 110 + 17 - -9 + 10;
        ab.lIIlIlIll[186] = 56 + 27 - 78 + 142;
        ab.lIIlIlIll[187] = 69 + 69 - -4 + 6;
        ab.lIIlIlIll[188] = 95 + 130 - 161 + 85;
        ab.lIIlIlIll[189] = 54 + 40 - 66 + 122;
        ab.lIIlIlIll[190] = 56 + 38 - 59 + 116;
        ab.lIIlIlIll[191] = 61 + 61 - 12 + 42;
        ab.lIIlIlIll[192] = (0x50 ^ 0x16) + (0x10 ^ 0x44) - (0x82 ^ 0xB6) + (0xA2 ^ 0x91);
        ab.lIIlIlIll[193] = 48 + 14 - 58 + 150;
        ab.lIIlIlIll[194] = 81 + 25 - 21 + 70;
        ab.lIIlIlIll[195] = 129 + 143 - 166 + 50;
        ab.lIIlIlIll[196] = (0xAE ^ 0xB5) + (0xC6 ^ 0xA9) - (0xC7 ^ 0xA7) + (0x2A ^ 0x59);
        ab.lIIlIlIll[197] = 55 + 120 - 74 + 48 + (106 + 16 - 52 + 68) - (7 + 118 - 20 + 90) + (0x3B ^ 0x79);
        ab.lIIlIlIll[198] = 28 + 31 - 33 + 133;
        ab.lIIlIlIll[199] = 100 + 6 - 4 + 37 + (9 ^ 0x5C) - (0x2F ^ 0x77) + (0x45 ^ 0x5D);
        ab.lIIlIlIll[200] = 155 + 84 - 115 + 37;
        ab.lIIlIlIll[201] = 138 + 57 - 133 + 100;
        ab.lIIlIlIll[202] = (0xAD ^ 0xBF) + (0x4C ^ 0) - (0x41 ^ 0x13) + (71 + 105 - 78 + 53);
        ab.lIIlIlIll[203] = (0x78 ^ 0x37) + "   ".length() - "   ".length() + (0x33 ^ 0x66);
        ab.lIIlIlIll[204] = (0x1C ^ 0x27) + (0x75 ^ 0x7A) - (0 ^ 0x26) + (45 + 81 - 18 + 21);
        ab.lIIlIlIll[205] = 16 + 50 - -35 + 65;
        ab.lIIlIlIll[206] = 60 + 11 - 30 + 126;
        ab.lIIlIlIll[207] = 106 + 127 - 80 + 15;
        ab.lIIlIlIll[208] = 51 + 23 - -87 + 8;
        ab.lIIlIlIll[209] = 14 + 65 - -68 + 23;
        ab.lIIlIlIll[210] = 94 + 153 - 192 + 116;
        ab.lIIlIlIll[211] = (0x45 ^ 0x6B) + (0x86 ^ 0xA1) - -(0xAF ^ 0x8A) + (0x10 ^ 0x22);
        ab.lIIlIlIll[212] = 92 + 20 - -48 + 13;
        ab.lIIlIlIll[213] = 143 + 73 - 209 + 167;
        ab.lIIlIlIll[214] = (0x72 ^ 0x1E) + (0x98 ^ 0xA6) - (12 + 118 - 51 + 59) + (122 + 26 - 75 + 70);
        ab.lIIlIlIll[215] = 66 + 45 - -8 + 57;
        ab.lIIlIlIll[216] = 92 + 151 - 87 + 21;
        ab.lIIlIlIll[217] = 124 + 85 - 86 + 55;
        ab.lIIlIlIll[218] = 94 + 75 - 69 + 79;
        ab.lIIlIlIll[219] = 37 + 18 - 35 + 160;
        ab.lIIlIlIll[220] = 99 + 174 - 212 + 120;
        ab.lIIlIlIll[221] = 76 + 47 - -3 + 56;
        ab.lIIlIlIll[222] = 32 + 177 - 145 + 119;
        ab.lIIlIlIll[223] = 67 + 85 - 20 + 52;
        ab.lIIlIlIll[224] = (0x4D ^ 0x1E) + (6 ^ 0x51) - (0x5C ^ 0x38) + (0xDE ^ 0xAD);
        ab.lIIlIlIll[225] = (0x3D ^ 0x4A) + (0x4C ^ 0x50) - (0xBE ^ 0xBA) + (0x16 ^ 0x3D);
        ab.lIIlIlIll[226] = 119 + 98 - 175 + 145;
        ab.lIIlIlIll[227] = (0xC3 ^ 0x90) + "  ".length() - (0x44 ^ 0x6F) + (49 + 55 - -23 + 19);
        ab.lIIlIlIll[228] = 106 + 74 - 138 + 147;
        ab.lIIlIlIll[229] = 133 + 96 - 109 + 70;
        ab.lIIlIlIll[230] = (0x87 ^ 0xA9) + (60 + 74 - -1 + 0) - -(0x4F ^ 0x47) + "  ".length();
        ab.lIIlIlIll[231] = 180 + 27 - 69 + 54;
        ab.lIIlIlIll[232] = (0x46 ^ 0x22) + (0x64 ^ 0x48) - (0xF8 ^ 0xC4) + (0xC8 ^ 0xA5);
        ab.lIIlIlIll[233] = 130 + 97 - 138 + 105;
        ab.lIIlIlIll[234] = 139 + 118 - 124 + 18 + (0x54 ^ 0x7D) - (101 + 114 - 167 + 100) + (47 + 108 - 4 + 0);
        ab.lIIlIlIll[235] = (0x5F ^ 0x6C) + (92 + 123 - 147 + 113) - (0xC2 ^ 0x87) + (0x93 ^ 0xB2);
        ab.lIIlIlIll[236] = 42 + 36 - -2 + 117;
        ab.lIIlIlIll[237] = (0x58 ^ 0x7B) + (1 + 124 - 96 + 101) - (0x68 ^ 0x2A) + (0xA6 ^ 0xC5);
        ab.lIIlIlIll[238] = 92 + 26 - 99 + 180;
        ab.lIIlIlIll[239] = 24 + 16 - -71 + 18 + (0xCE ^ 0xB0) - (0xE4 ^ 0x97) + (0xE ^ 0x32);
        ab.lIIlIlIll[240] = 5 + 110 - -85 + 1;
        ab.lIIlIlIll[241] = 13 + 82 - 1 + 108;
        ab.lIIlIlIll[242] = (0x3B ^ 0x42) + (72 + 53 - -16 + 38) - (0xFFFF83A5 & 0x7D7B) + (70 + 182 - 81 + 21);
        ab.lIIlIlIll[243] = 135 + 157 - 238 + 150;
        ab.lIIlIlIll[244] = 130 + 70 - 92 + 58 + (0x8F ^ 0x98) - (48 + 125 - 141 + 122) + (162 + 111 - 125 + 22);
        ab.lIIlIlIll[245] = 7 + 75 - 56 + 180;
        ab.lIIlIlIll[246] = 70 + 46 - 31 + 122;
        ab.lIIlIlIll[247] = 0xFFFFDF9B & 0x72FE;
        ab.lIIlIlIll[248] = 145 + 145 - 83 + 1;
        ab.lIIlIlIll[249] = 76 + 50 - 70 + 153;
        ab.lIIlIlIll[250] = (0x50 ^ 0x7C) + (0x7A ^ 0x2D) - (0xD1 ^ 0x98) + (1 + 144 - 142 + 149);
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
                "".length();
                if (-(103 + 2 - 24 + 85 ^ 123 + 33 - 153 + 159) > 0) {
                    return ((95 + 49 - 142 + 223 ^ 7 + 128 - 20 + 15) & (155 + 165 - 129 + 27 ^ 104 + 96 - 54 + 39 ^ -" ".length())) != 0;
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

    private static String llllIllIlII(String lIIIIlIIIlIIllI, String lIIIIlIIIlIIlIl) {
        lIIIIlIIIlIIllI = new String(Base64.getDecoder().decode(lIIIIlIIIlIIllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lIIIIlIIIlIlIIl = new StringBuilder();
        char[] lIIIIlIIIlIlIII = lIIIIlIIIlIIlIl.toCharArray();
        int lIIIIlIIIlIIlll = lIIlIlIll[0];
        char[] lIIIIlIIIlIIIIl = lIIIIlIIIlIIllI.toCharArray();
        int lIIIIlIIIlIIIII = lIIIIlIIIlIIIIl.length;
        int lIIIIlIIIIlllll = lIIlIlIll[0];
        while (ab.lllllIlIIlI(lIIIIlIIIIlllll, lIIIIlIIIlIIIII)) {
            char lIIIIlIIIlIllII = lIIIIlIIIlIIIIl[lIIIIlIIIIlllll];
            lIIIIlIIIlIlIIl.append((char)(lIIIIlIIIlIllII ^ lIIIIlIIIlIlIII[lIIIIlIIIlIIlll % lIIIIlIIIlIlIII.length]));
            "".length();
            ++lIIIIlIIIlIIlll;
            ++lIIIIlIIIIlllll;
            "".length();
            if (-" ".length() <= ((0x34 ^ 0x28) & ~(0x11 ^ 0xD))) continue;
            return null;
        }
        return String.valueOf(lIIIIlIIIlIlIIl);
    }
}

