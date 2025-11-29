/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Skill
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 *  net.unethicalite.api.widgets.Dialog
 */
package e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u;

import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.S_Unknown;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.a_Unknown;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.b_Unknown;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.d;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.e_Unknown;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.i;
import gg.squire.account.AccBuilderTempleTrek;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Skill;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;

public class ab_Unknown
implements S {
    public static final /* synthetic */ WorldPoint jI;
    public static /* synthetic */ WorldPoint jC;
    private static /* synthetic */ int[] lllllIIlll;
    static /* synthetic */ int dg;
    public static final /* synthetic */ WorldPoint jL;
    public static final /* synthetic */ WorldPoint jM;
    public static /* synthetic */ long jD;
    public static final /* synthetic */ WorldPoint jN;
    private static /* synthetic */ String[] lllllIIllI;
    public static final /* synthetic */ WorldPoint jK;
    public static final /* synthetic */ WorldPoint jQ;
    static /* synthetic */ int bS;
    public static /* synthetic */ List<d> bu;
    static /* synthetic */ int bU;
    static /* synthetic */ WorldArea jH;
    public static /* synthetic */ WorldPoint jA;
    public static /* synthetic */ WorldPoint jB;
    public static final /* synthetic */ WorldPoint jJ;
    public static /* synthetic */ boolean bs;
    public static final /* synthetic */ WorldPoint jP;
    static /* synthetic */ int jG;
    static /* synthetic */ int jF;
    public static /* synthetic */ String[] jE;
    public static final /* synthetic */ WorldPoint jO;

    public static void eE() {
        if (ab.llIlIIllIllIl(Inventory.isFull() ? 1 : 0)) {
            Inventory.getAll((String[])jE).forEach(item -> item.interact(lllllIIllI[lllllIIlll[56]]));
        }
        if (ab.llIlIIllIllll(Inventory.isFull() ? 1 : 0)) {
            int[] nArray = new int[lllllIIlll[1]];
            nArray[ab.lllllIIlll[0]] = lllllIIlll[7];
            if (ab.llIlIIllIllIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray2 = new int[lllllIIlll[1]];
                nArray2[ab.lllllIIlll[0]] = lllllIIlll[6];
                if (ab.llIlIIllIllll(Equipment.contains((int[])nArray2) ? 1 : 0)) {
                    int[] nArray3 = new int[lllllIIlll[1]];
                    nArray3[ab.lllllIIlll[0]] = lllllIIlll[6];
                    if (ab.llIlIIllIllIl(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                        int[] nArray4 = new int[lllllIIlll[1]];
                        nArray4[ab.lllllIIlll[0]] = lllllIIlll[6];
                        Inventory.getFirst((int[])nArray4).interact(lllllIIllI[lllllIIlll[17]]);
                        Time.sleepTicks((int)lllllIIlll[1]);
                        0;
                    }
                }
            }
        }
        if (ab.llIlIIlllIIll(Players.getLocal().getWorldLocation().distanceTo(jO), lllllIIlll[16])) {
            AccBuilderTempleTrek.c = lllllIIllI[lllllIIlll[18]];
            Movement.walkTo((WorldPoint)jO);
            0;
            Time.sleepTicks((int)lllllIIlll[1]);
            0;
        }
        if (ab.llIlIIlllIlIl(Players.getLocal().getWorldLocation().distanceTo(jO), lllllIIlll[16])) {
            if (ab.llIlIIllIllll(jH.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                Movement.walkTo((WorldPoint)jO);
                0;
                Time.sleepTicks((int)lllllIIlll[1]);
                0;
            }
            if (ab.llIlIIllIllIl(Dialog.canLevelUpContinue() ? 1 : 0)) {
                Dialog.close();
            }
            if (ab.llIlIIlllIllI(Players.getLocal().getGraphic(), lllllIIlll[19])) {
                AccBuilderTempleTrek.c = lllllIIllI[lllllIIlll[20]];
                String[] stringArray = new String[lllllIIlll[1]];
                stringArray[ab.lllllIIlll[0]] = lllllIIllI[lllllIIlll[21]];
                if (ab.llIlIIlllIIII(NPCs.getNearest((String[])stringArray)) && ab.llIlIIlllIlll(Players.getLocal().getInteracting())) {
                    String[] stringArray2 = new String[lllllIIlll[1]];
                    stringArray2[ab.lllllIIlll[0]] = lllllIIllI[lllllIIlll[13]];
                    NPCs.getNearest((String[])stringArray2).interact(lllllIIllI[lllllIIlll[22]]);
                    Time.sleepTicks((int)lllllIIlll[1]);
                    0;
                }
            }
            if (ab.llIlIIllllIII(Players.getLocal().getGraphic(), lllllIIlll[19])) {
                AccBuilderTempleTrek.c = lllllIIllI[lllllIIlll[23]];
                if (!ab.llIlIIllllIIl(ab.llIlIIlllIlII(e.u(), 70.0)) || ab.llIlIIlllIlIl(Skills.getBoostedLevel((Skill)Skill.HITPOINTS), lllllIIlll[8])) {
                    int[] nArray = new int[lllllIIlll[1]];
                    nArray[ab.lllllIIlll[0]] = lllllIIlll[7];
                    if (ab.llIlIIllIllIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        int[] nArray5 = new int[lllllIIlll[1]];
                        nArray5[ab.lllllIIlll[0]] = lllllIIlll[7];
                        Inventory.getFirst((int[])nArray5).interact(lllllIIllI[lllllIIlll[24]]);
                        Time.sleepTicks((int)lllllIIlll[1]);
                        0;
                    }
                }
                String[] stringArray = new String[lllllIIlll[1]];
                stringArray[ab.lllllIIlll[0]] = lllllIIllI[lllllIIlll[25]];
                if (ab.llIlIIllIllIl(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    String[] stringArray3 = new String[lllllIIlll[1]];
                    stringArray3[ab.lllllIIlll[0]] = lllllIIllI[lllllIIlll[16]];
                    Inventory.getAll((String[])stringArray3).stream().forEach(item -> item.interact(lllllIIllI[lllllIIlll[55]]));
                }
                Inventory.getAll((String[])jE).forEach(item -> item.interact(lllllIIllI[lllllIIlll[54]]));
            }
        }
    }

    public static void eD() {
        block20: {
            block21: {
                block22: {
                    block26: {
                        block25: {
                            block23: {
                                block24: {
                                    if (ab.llIlIIllIllIl(bs ? 1 : 0)) {
                                        AccBuilderTempleTrek.c = lllllIIllI[lllllIIlll[0]];
                                        b.a(bu);
                                        if (ab.llIlIIllIlllI(bu.size(), lllllIIlll[1])) {
                                            System.out.println(lllllIIllI[lllllIIlll[1]]);
                                            bs = lllllIIlll[0];
                                        }
                                    }
                                    if (!ab.llIlIIllIllll(bs ? 1 : 0)) break block20;
                                    if (!ab.llIlIIllIllll(ab.aa() ? 1 : 0)) break block21;
                                    BankLocation var12 = BankLocation.getNearest();
                                    if (ab.llIlIIlllIIII(var12) && ab.llIlIIllIllll(var12.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                        AccBuilderTempleTrek.c = lllllIIllI[lllllIIlll[2]];
                                        a.a(var12);
                                    }
                                    if (!ab.llIlIIlllIIII(var12) || !ab.llIlIIllIllIl(var12.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block22;
                                    AccBuilderTempleTrek.c = lllllIIllI[lllllIIlll[3]];
                                    if (ab.llIlIIllIllll(Bank.isOpen() ? 1 : 0)) {
                                        a.a();
                                        Time.sleepUntil(() -> Bank.isOpen(), (int)lllllIIlll[4]);
                                        0;
                                    }
                                    if (!ab.llIlIIllIllIl(Bank.isOpen() ? 1 : 0)) break block22;
                                    if (ab.llIlIIlllIIIl(Inventory.getAll().size())) {
                                        Bank.depositInventory();
                                        Time.sleepTicks((int)lllllIIlll[3]);
                                        0;
                                    }
                                    if (!ab.llIlIIlllIIlI(Skills.getLevel((Skill)Skill.THIEVING), lllllIIlll[5])) break block23;
                                    int[] nArray = new int[lllllIIlll[1]];
                                    nArray[ab.lllllIIlll[0]] = lllllIIlll[6];
                                    if (!ab.llIlIIllIllIl(Bank.contains((int[])nArray) ? 1 : 0)) break block24;
                                    int[] nArray2 = new int[lllllIIlll[1]];
                                    nArray2[ab.lllllIIlll[0]] = lllllIIlll[7];
                                    if (!ab.llIlIIllIllll(Bank.contains((int[])nArray2) ? 1 : 0)) break block23;
                                }
                                ab.ae();
                                System.out.println(lllllIIllI[lllllIIlll[8]]);
                                bs = lllllIIlll[1];
                                return;
                            }
                            int[] nArray = new int[lllllIIlll[1]];
                            nArray[ab.lllllIIlll[0]] = lllllIIlll[9];
                            if (!ab.llIlIIllIllIl(Bank.contains((int[])nArray) ? 1 : 0)) break block25;
                            int[] nArray3 = new int[lllllIIlll[1]];
                            nArray3[ab.lllllIIlll[0]] = lllllIIlll[10];
                            if (!ab.llIlIIllIllIl(Bank.contains((int[])nArray3) ? 1 : 0)) break block25;
                            int[] nArray4 = new int[lllllIIlll[1]];
                            nArray4[ab.lllllIIlll[0]] = lllllIIlll[11];
                            if (!ab.llIlIIllIllll(Bank.contains((int[])nArray4) ? 1 : 0)) break block26;
                        }
                        ab.ae();
                        System.out.println(lllllIIllI[lllllIIlll[12]]);
                        bs = lllllIIlll[1];
                        return;
                    }
                    if (ab.llIlIIllIlllI(Skills.getLevel((Skill)Skill.THIEVING), lllllIIlll[12])) {
                        a.a(lllllIIlll[10], lllllIIlll[12]);
                        a.a(lllllIIlll[9], lllllIIlll[12]);
                        a.a(lllllIIlll[11], lllllIIlll[13]);
                    }
                    if (ab.llIlIIlllIIlI(Skills.getLevel((Skill)Skill.THIEVING), lllllIIlll[12]) && ab.llIlIIllIlllI(Skills.getLevel((Skill)Skill.THIEVING), lllllIIlll[5])) {
                        a.a(lllllIIlll[9], lllllIIlll[12]);
                    }
                    if (ab.llIlIIlllIIlI(Skills.getLevel((Skill)Skill.THIEVING), lllllIIlll[5])) {
                        a.a(lllllIIlll[6], lllllIIlll[12]);
                        a.a(lllllIIlll[7], lllllIIlll[14]);
                        a.a(lllllIIlll[15], lllllIIlll[14]);
                    }
                    bS += lllllIIlll[1];
                }
                if (ab.llIlIIlllIIll(Inventory.getFreeSlots(), lllllIIlll[16])) {
                    bS += lllllIIlll[1];
                }
            }
            if (ab.llIlIIllIllIl(ab.aa() ? 1 : 0) && ab.llIlIIlllIIIl(bS)) {
                if (ab.llIlIIllIllIl(Dialog.isOpen() ? 1 : 0)) {
                    Dialog.close();
                }
                if (ab.llIlIIllIlllI(Skills.getLevel((Skill)Skill.THIEVING), lllllIIlll[12])) {
                    ab.eF();
                }
                if (ab.llIlIIlllIIlI(Skills.getLevel((Skill)Skill.THIEVING), lllllIIlll[12]) && ab.llIlIIllIlllI(Skills.getLevel((Skill)Skill.THIEVING), lllllIIlll[5])) {
                    ab.eG();
                }
                if (ab.llIlIIlllIIlI(Skills.getLevel((Skill)Skill.THIEVING), lllllIIlll[5])) {
                    ab.eE();
                }
            }
        }
    }

    private static boolean llIlIIllllIIl(int n2) {
        return n2 >= 0;
    }

    private static boolean llIlIIllIlllI(int n2, int n3) {
        return n2 < n3;
    }

    private static int llIlIIllllIlI(long l2, long l3) {
        return l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
    }

    private static void llIlIIllIllII() {
        lllllIIlll = new int[113];
        ab.lllllIIlll[0] = (0x1A ^ 0x5D) & ~(0xCB ^ 0x8C);
        ab.lllllIIlll[1] = 1;
        ab.lllllIIlll[2] = 2;
        ab.lllllIIlll[3] = 3;
        ab.lllllIIlll[4] = -(0xFFFFDF77 & 0x64CB) & (0xFFFFDFDE & 0x77EB);
        ab.lllllIIlll[5] = 9 ^ 0x2F;
        ab.lllllIIlll[6] = -(0xFFFFF9D9 & 0x2E27) & (0xFFFFFBFF & 0x7E97);
        ab.lllllIIlll[7] = -(0xFFFFFF6F & 0x78B5) & (0xFFFFFFFD & 0x7FEF);
        ab.lllllIIlll[8] = 0x91 ^ 0x95;
        ab.lllllIIlll[9] = -(0xFFFFFF93 & 0x60ED) & (0xFFFFFFE7 & 0x7FDF);
        ab.lllllIIlll[10] = -(0xFFFFA675 & 0x79BB) & (0xFFFFBF7F & 0x7FF8);
        ab.lllllIIlll[11] = 0xFFFFC7FB & 0x397F;
        ab.lllllIIlll[12] = 13 + 122 - -36 + 26 ^ 130 + 97 - 185 + 150;
        ab.lllllIIlll[13] = 0xB6 ^ 0xBC;
        ab.lllllIIlll[14] = 0x27 ^ 0x33;
        ab.lllllIIlll[15] = -(0xFFFFF4F5 & 0x3B9F) & (0xFFFFF7FF & 0x3FF7);
        ab.lllllIIlll[16] = 14 + 156 - 123 + 112 ^ 137 + 26 - 66 + 47;
        ab.lllllIIlll[17] = 0x4C ^ 0 ^ (0x29 ^ 0x63);
        ab.lllllIIlll[18] = 0xAE ^ 0xA9;
        ab.lllllIIlll[19] = 218 + 220 - 390 + 197;
        ab.lllllIIlll[20] = 0xB0 ^ 0x90 ^ (0xB6 ^ 0x9E);
        ab.lllllIIlll[21] = 0x39 ^ 0x30;
        ab.lllllIIlll[22] = 0x3D ^ 0x36;
        ab.lllllIIlll[23] = 0x55 ^ 0x59;
        ab.lllllIIlll[24] = 6 ^ 0x68 ^ (0xE1 ^ 0x82);
        ab.lllllIIlll[25] = 0xCB ^ 0xC5;
        ab.lllllIIlll[26] = 0x55 ^ 0x45;
        ab.lllllIIlll[27] = 17 + 57 - -45 + 29 ^ 44 + 72 - 24 + 41;
        ab.lllllIIlll[28] = 0xF9 ^ 0xA3 ^ (0xED ^ 0xAE);
        ab.lllllIIlll[29] = 0x3B ^ 0x7A ^ (0xFA ^ 0xA9);
        ab.lllllIIlll[30] = 40 + 98 - -75 + 2 ^ 131 + 58 - 47 + 54;
        ab.lllllIIlll[31] = 0x47 ^ 9 ^ (0x4C ^ 0x17);
        ab.lllllIIlll[32] = 0xD8 ^ 0xB1 ^ 94 + 68 - 46 + 11;
        ab.lllllIIlll[33] = 4 ^ 0x1B ^ (0x65 ^ 0x6D);
        ab.lllllIIlll[34] = 0xB6 ^ 0xAE;
        ab.lllllIIlll[35] = 23 + 0 - -14 + 91 ^ 20 + 131 - 70 + 73;
        ab.lllllIIlll[36] = 0x93 ^ 0x88;
        ab.lllllIIlll[37] = 0x4C ^ 0x55 ^ (0x9A ^ 0x9F);
        ab.lllllIIlll[38] = (0x1F ^ 0x3B) & ~(0x44 ^ 0x60) ^ (0x46 ^ 0x5B);
        ab.lllllIIlll[39] = -(0x4D ^ 6) & (0xFFFF9FFF & 0x6FEA);
        ab.lllllIIlll[40] = 0x3D ^ 0x44 ^ (0x7A ^ 0x1D);
        ab.lllllIIlll[41] = 0xFFFFAFBE & 0x57FB;
        ab.lllllIIlll[42] = -(0xFFFFFBCF & 0x4E73) & (0xFFFFFBFA & 0x4FFF);
        ab.lllllIIlll[43] = -(0xFFFFFCBE & 0x737B) & (0xFFFFF3FD & 0x7FBF);
        ab.lllllIIlll[44] = -(0xFFFFEFFB & 0x1A96) & (0xFFFFAFFD & 0x5BBF);
        ab.lllllIIlll[45] = -(0xFFFFF96F & 0x4EBD) & (0xFFFFFB7D & 0x7DFF);
        ab.lllllIIlll[46] = 0xFFFFFBF9 & 0x3E9E;
        ab.lllllIIlll[47] = 0xFFFF87FE & 0x7F9F;
        ab.lllllIIlll[48] = 0x16 ^ 0x73 ^ 1;
        ab.lllllIIlll[49] = 0x1F ^ 0x4A ^ (0xD6 ^ 0x9C);
        ab.lllllIIlll[50] = 0x6A ^ 9;
        ab.lllllIIlll[51] = 0x6C ^ 0x4C;
        ab.lllllIIlll[52] = 0x32 ^ 0x13;
        ab.lllllIIlll[53] = 0x13 ^ 0x31;
        ab.lllllIIlll[54] = 7 ^ 0x74 ^ (0x44 ^ 0x14);
        ab.lllllIIlll[55] = 0xA0 ^ 0x84;
        ab.lllllIIlll[56] = 0x7F ^ 0x5A;
        ab.lllllIIlll[57] = -(0xFFFFF30B & 0x7EFF) & (0xFFFFFEDF & 0x7FBE);
        ab.lllllIIlll[58] = -(0xFFFFD377 & 0x6DED) & (0xFFFFFDF7 & 0x4FFF);
        ab.lllllIIlll[59] = -(0xFFFFE6F3 & 0x7B2F) & (0xFFFFEEEE & 0x7FF7);
        ab.lllllIIlll[60] = -(0xFFFFDB77 & 0x368E) & (0xFFFFDFF7 & 0x3F5F);
        ab.lllllIIlll[61] = 0xF ^ 0x28;
        ab.lllllIIlll[62] = 77 + 1 - 42 + 111 ^ 131 + 49 - 160 + 167;
        ab.lllllIIlll[63] = 0xA2 ^ 0xBA ^ (0xF4 ^ 0xC5);
        ab.lllllIIlll[64] = 0x1D ^ 0x37;
        ab.lllllIIlll[65] = 23 + 153 - 127 + 122 ^ 85 + 56 - 54 + 41;
        ab.lllllIIlll[66] = 0xC ^ 0x20;
        ab.lllllIIlll[67] = 0x18 ^ 0x34 ^ 1;
        ab.lllllIIlll[68] = 0x61 ^ 0x4F;
        ab.lllllIIlll[69] = 0x21 ^ 0xE;
        ab.lllllIIlll[70] = 0x1E ^ 0x2E;
        ab.lllllIIlll[71] = 0x2F ^ 0x1E;
        ab.lllllIIlll[72] = 0x41 ^ 0x55 ^ (0xA9 ^ 0x8F);
        ab.lllllIIlll[73] = 9 ^ 0x2F ^ (0x76 ^ 0x63);
        ab.lllllIIlll[74] = 97 + 52 - -24 + 7 ^ 74 + 116 - 136 + 74;
        ab.lllllIIlll[75] = 0x75 ^ 0x40;
        ab.lllllIIlll[76] = 0xB9 ^ 0xAA ^ (0 ^ 0x25);
        ab.lllllIIlll[77] = 0x79 ^ 0x33 ^ (0x69 ^ 0x14);
        ab.lllllIIlll[78] = 72 + 25 - 40 + 121 ^ 57 + 89 - 97 + 89;
        ab.lllllIIlll[79] = 0x67 ^ 0x5E;
        ab.lllllIIlll[80] = 0x32 ^ 8;
        ab.lllllIIlll[81] = 37 + 140 - 32 + 36 ^ 141 + 64 - 177 + 114;
        ab.lllllIIlll[82] = 0x18 ^ 0x5B ^ 64 + 49 - 63 + 77;
        ab.lllllIIlll[83] = 0x22 ^ 0x1F;
        ab.lllllIIlll[84] = 4 ^ 0x3A;
        ab.lllllIIlll[85] = 0x9E ^ 0xA1;
        ab.lllllIIlll[86] = 0x46 ^ 0x27 ^ (0x8D ^ 0xAC);
        ab.lllllIIlll[87] = 64 + 40 - 8 + 108 ^ 139 + 11 - 22 + 13;
        ab.lllllIIlll[88] = 0x85 ^ 0xB0 ^ (0xB5 ^ 0xC2);
        ab.lllllIIlll[89] = 155 + 132 - 102 + 14 ^ 117 + 83 - 195 + 127;
        ab.lllllIIlll[90] = 0x31 ^ 0x5D ^ (0x37 ^ 0x1F);
        ab.lllllIIlll[91] = 0xE5 ^ 0xA0;
        ab.lllllIIlll[92] = 0x1F ^ 0x59;
        ab.lllllIIlll[93] = 0x60 ^ 0xD ^ (0x4E ^ 0x64);
        ab.lllllIIlll[94] = 0xD8 ^ 0x90;
        ab.lllllIIlll[95] = 0xF7 ^ 0x9E ^ (0x79 ^ 0x59);
        ab.lllllIIlll[96] = 0xE0 ^ 0xAA;
        ab.lllllIIlll[97] = 0xFFFFF7FB & 0x5FFD;
        ab.lllllIIlll[98] = 0xFFFF8BFE & 0x7FFD;
        ab.lllllIIlll[99] = 0xFFFFBEBF & 0x4DE7;
        ab.lllllIIlll[100] = 0xFFFFCC79 & 0x3F8F;
        ab.lllllIIlll[101] = -(0xFFFFA3BD & 0x7F4F) & (0xFFFFAFFF & 0x7FBF);
        ab.lllllIIlll[102] = 0xFFFFEDBD & 0x1E56;
        ab.lllllIIlll[103] = 0xFFFFEDEF & 0x1EBB;
        ab.lllllIIlll[104] = -(0xFFFFD1ED & 0x2FF7) & (0xFFFF8DFF & Short.MAX_VALUE);
        ab.lllllIIlll[105] = -(0xFFFFFDDF & 0x6322) & (0xFFFFFFBB & 0x6DF7);
        ab.lllllIIlll[106] = -(0xFFFFFD7D & 0x729B) & (0xFFFFFEFC & 0x77FB);
        ab.lllllIIlll[107] = 0xFFFF9E7F & 0x6FAD;
        ab.lllllIIlll[108] = 0xFFFF96FD & 0x6FD7;
        ab.lllllIIlll[109] = 0xFFFFFF6F & 0xE9F;
        ab.lllllIIlll[110] = 0xFFFFE6DB & 0x1FEF;
        ab.lllllIIlll[111] = -(0xFFFFB3CE & 0x6DF3) & (0xFFFFAFFF & 0x7FF3);
        ab.lllllIIlll[112] = 0xF9 ^ 0x90 ^ (0x6D ^ 0x4F);
    }

    public static void ae() {
        d var10;
        int[] nArray = new int[lllllIIlll[1]];
        nArray[ab.lllllIIlll[0]] = lllllIIlll[9];
        if (ab.llIlIIllIllll(Bank.contains((int[])nArray) ? 1 : 0)) {
            d d2 = new d(lllllIIlll[9], lllllIIlll[13], lllllIIlll[43]);
            bu.add(d2);
            0;
        }
        int[] nArray2 = new int[lllllIIlll[1]];
        nArray2[ab.lllllIIlll[0]] = lllllIIlll[10];
        if (ab.llIlIIllIllll(Bank.contains((int[])nArray2) ? 1 : 0)) {
            var10 = new d(lllllIIlll[10], lllllIIlll[13], lllllIIlll[43]);
            bu.add(var10);
            0;
        }
        int[] nArray3 = new int[lllllIIlll[1]];
        nArray3[ab.lllllIIlll[0]] = lllllIIlll[11];
        if (ab.llIlIIllIllll(Bank.contains((int[])nArray3) ? 1 : 0)) {
            var10 = new d(lllllIIlll[11], lllllIIlll[40], lllllIIlll[44]);
            bu.add(var10);
            0;
        }
        int[] nArray4 = new int[lllllIIlll[1]];
        nArray4[ab.lllllIIlll[0]] = lllllIIlll[45];
        if (ab.llIlIIllIllll(Bank.contains((int[])nArray4) ? 1 : 0)) {
            var10 = new d(lllllIIlll[45], lllllIIlll[12], i.bp);
            bu.add(var10);
            0;
        }
        if (ab.llIlIIlllIIlI(Skills.getLevel((Skill)Skill.THIEVING), lllllIIlll[5])) {
            int[] nArray5 = new int[lllllIIlll[1]];
            nArray5[ab.lllllIIlll[0]] = lllllIIlll[7];
            if (ab.llIlIIllIllll(Bank.contains((int[])nArray5) ? 1 : 0)) {
                var10 = new d(lllllIIlll[7], lllllIIlll[46], lllllIIlll[20]);
                bu.add(var10);
                0;
            }
            int[] nArray6 = new int[lllllIIlll[1]];
            nArray6[ab.lllllIIlll[0]] = lllllIIlll[6];
            if (ab.llIlIIllIllll(Bank.contains((int[])nArray6) ? 1 : 0)) {
                var10 = new d(lllllIIlll[6], lllllIIlll[44], lllllIIlll[47]);
                bu.add(var10);
                0;
            }
        }
    }

    @Override
    public String U() {
        return lllllIIllI[lllllIIlll[49]];
    }

    private static void eG() {
        if (ab.llIlIIllIllll(Players.getLocal().getWorldLocation().equals((Object)jB) ? 1 : 0)) {
            AccBuilderTempleTrek.c = lllllIIllI[lllllIIlll[34]];
            if (ab.llIlIIllIllIl(Dialog.isOpen() ? 1 : 0)) {
                Dialog.close();
            }
            Movement.walkTo((WorldPoint)jB);
            0;
            Time.sleepTicks((int)lllllIIlll[1]);
            0;
        }
        if (ab.llIlIIllIllIl(Players.getLocal().getWorldLocation().equals((Object)jB) ? 1 : 0)) {
            int[] nArray = new int[lllllIIlll[1]];
            nArray[ab.lllllIIlll[0]] = jF;
            if (ab.llIlIIllIllIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray2 = new int[lllllIIlll[1]];
                nArray2[ab.lllllIIlll[0]] = jF;
                Inventory.getFirst((int[])nArray2).interact(lllllIIllI[lllllIIlll[28]]);
                Time.sleepTicks((int)lllllIIlll[1]);
                0;
            }
            if (ab.llIlIIllIllll(Inventory.isFull() ? 1 : 0)) {
                AccBuilderTempleTrek.c = lllllIIllI[lllllIIlll[35]];
                String[] stringArray = new String[lllllIIlll[1]];
                stringArray[ab.lllllIIlll[0]] = lllllIIllI[lllllIIlll[36]];
                if (ab.llIlIIlllIIII(TileObjects.getNearest((String[])stringArray))) {
                    String[] stringArray2 = new String[lllllIIlll[1]];
                    stringArray2[ab.lllllIIlll[0]] = lllllIIllI[lllllIIlll[37]];
                    TileObjects.getNearest((String[])stringArray2).interact(lllllIIllI[lllllIIlll[38]]);
                    Time.sleepUntil(() -> {
                        boolean bl;
                        String[] stringArray = new String[lllllIIlll[1]];
                        stringArray[ab.lllllIIlll[0]] = lllllIIllI[lllllIIlll[53]];
                        if (ab.llIlIIlllIlll(TileObjects.getNearest((String[])stringArray))) {
                            bl = lllllIIlll[1];
                            0;
                            
                            }
                        } else {
                            bl = lllllIIlll[0];
                        }
                        return bl;
                    }, (int)lllllIIlll[39]);
                    0;
                }
            }
            if (ab.llIlIIllIllIl(Inventory.isFull() ? 1 : 0)) {
                AccBuilderTempleTrek.c = lllllIIllI[lllllIIlll[40]];
                int[] nArray3 = new int[lllllIIlll[2]];
                nArray3[ab.lllllIIlll[0]] = lllllIIlll[41];
                nArray3[ab.lllllIIlll[1]] = lllllIIlll[42];
                Inventory.getAll((int[])nArray3).forEach(item -> item.interact(lllllIIllI[lllllIIlll[52]]));
                int[] nArray4 = new int[lllllIIlll[1]];
                nArray4[ab.lllllIIlll[0]] = lllllIIlll[11];
                if (ab.llIlIIllIllIl(Inventory.contains((int[])nArray4) ? 1 : 0)) {
                    int[] nArray5 = new int[lllllIIlll[1]];
                    nArray5[ab.lllllIIlll[0]] = lllllIIlll[11];
                    Inventory.getAll((int[])nArray5).forEach(item -> item.interact(lllllIIllI[lllllIIlll[51]]));
                }
            }
        }
    }

    @Override
    public boolean V() {
        boolean bl;
        if (ab.llIlIIlllIIlI(Skills.getLevel((Skill)Skill.THIEVING), lllllIIlll[50])) {
            bl = lllllIIlll[1];
            0;
            if ((0x7C ^ 0x78) <= ((0x65 ^ 0x32) & ~(0xF1 ^ 0xA6))) {
                return false;
            }
        } else {
            bl = lllllIIlll[0];
        }
        return bl;
    }

    private static boolean llIlIIlllIlll(Object object) {
        return object == null;
    }

    static {
        ab.llIlIIllIllII();
        ab.llIlIIllIlIll();
        bu = new ArrayList<d>();
        jA = new WorldPoint(lllllIIlll[57], lllllIIlll[58], lllllIIlll[0]);
        jB = new WorldPoint(lllllIIlll[59], lllllIIlll[60], lllllIIlll[0]);
        jC = new WorldPoint(lllllIIlll[0], lllllIIlll[0], lllllIIlll[0]);
        jD = System.currentTimeMillis();
        String[] stringArray = new String[lllllIIlll[56]];
        stringArray[ab.lllllIIlll[0]] = lllllIIllI[lllllIIlll[5]];
        stringArray[ab.lllllIIlll[1]] = lllllIIllI[lllllIIlll[61]];
        stringArray[ab.lllllIIlll[2]] = lllllIIllI[lllllIIlll[62]];
        stringArray[ab.lllllIIlll[3]] = lllllIIllI[lllllIIlll[63]];
        stringArray[ab.lllllIIlll[8]] = lllllIIllI[lllllIIlll[64]];
        stringArray[ab.lllllIIlll[12]] = lllllIIllI[lllllIIlll[65]];
        stringArray[ab.lllllIIlll[17]] = lllllIIllI[lllllIIlll[66]];
        stringArray[ab.lllllIIlll[18]] = lllllIIllI[lllllIIlll[67]];
        stringArray[ab.lllllIIlll[20]] = lllllIIllI[lllllIIlll[68]];
        stringArray[ab.lllllIIlll[21]] = lllllIIllI[lllllIIlll[69]];
        stringArray[ab.lllllIIlll[13]] = lllllIIllI[lllllIIlll[70]];
        stringArray[ab.lllllIIlll[22]] = lllllIIllI[lllllIIlll[71]];
        stringArray[ab.lllllIIlll[23]] = lllllIIllI[lllllIIlll[72]];
        stringArray[ab.lllllIIlll[24]] = lllllIIllI[lllllIIlll[73]];
        stringArray[ab.lllllIIlll[25]] = lllllIIllI[lllllIIlll[74]];
        stringArray[ab.lllllIIlll[16]] = lllllIIllI[lllllIIlll[75]];
        stringArray[ab.lllllIIlll[26]] = lllllIIllI[lllllIIlll[76]];
        stringArray[ab.lllllIIlll[27]] = lllllIIllI[lllllIIlll[77]];
        stringArray[ab.lllllIIlll[29]] = lllllIIllI[lllllIIlll[78]];
        stringArray[ab.lllllIIlll[30]] = lllllIIllI[lllllIIlll[79]];
        stringArray[ab.lllllIIlll[14]] = lllllIIllI[lllllIIlll[80]];
        stringArray[ab.lllllIIlll[31]] = lllllIIllI[lllllIIlll[81]];
        stringArray[ab.lllllIIlll[32]] = lllllIIllI[lllllIIlll[82]];
        stringArray[ab.lllllIIlll[33]] = lllllIIllI[lllllIIlll[83]];
        stringArray[ab.lllllIIlll[34]] = lllllIIllI[lllllIIlll[84]];
        stringArray[ab.lllllIIlll[28]] = lllllIIllI[lllllIIlll[85]];
        stringArray[ab.lllllIIlll[35]] = lllllIIllI[lllllIIlll[86]];
        stringArray[ab.lllllIIlll[36]] = lllllIIllI[lllllIIlll[87]];
        stringArray[ab.lllllIIlll[37]] = lllllIIllI[lllllIIlll[88]];
        stringArray[ab.lllllIIlll[38]] = lllllIIllI[lllllIIlll[89]];
        stringArray[ab.lllllIIlll[40]] = lllllIIllI[lllllIIlll[90]];
        stringArray[ab.lllllIIlll[49]] = lllllIIllI[lllllIIlll[91]];
        stringArray[ab.lllllIIlll[51]] = lllllIIllI[lllllIIlll[92]];
        stringArray[ab.lllllIIlll[52]] = lllllIIllI[lllllIIlll[93]];
        stringArray[ab.lllllIIlll[53]] = lllllIIllI[lllllIIlll[94]];
        stringArray[ab.lllllIIlll[54]] = lllllIIllI[lllllIIlll[95]];
        stringArray[ab.lllllIIlll[55]] = lllllIIllI[lllllIIlll[96]];
        jE = stringArray;
        jF = lllllIIlll[97];
        dg = lllllIIlll[0];
        bU = e.c(lllllIIlll[20], lllllIIlll[32]);
        jG = e.c(lllllIIlll[5], lllllIIlll[76]);
        bS = lllllIIlll[1];
        jH = new WorldArea(lllllIIlll[98], lllllIIlll[99], lllllIIlll[32], lllllIIlll[28], lllllIIlll[0]);
        jI = new WorldPoint(lllllIIlll[100], lllllIIlll[101], lllllIIlll[0]);
        jJ = new WorldPoint(lllllIIlll[102], lllllIIlll[103], lllllIIlll[0]);
        jK = new WorldPoint(lllllIIlll[104], lllllIIlll[105], lllllIIlll[0]);
        jL = new WorldPoint(lllllIIlll[106], lllllIIlll[107], lllllIIlll[0]);
        jM = new WorldPoint(lllllIIlll[108], lllllIIlll[109], lllllIIlll[0]);
        jN = new WorldPoint(lllllIIlll[110], lllllIIlll[111], lllllIIlll[0]);
        jO = jI;
        jQ = jP = jJ;
    }

    private static int llIlIIlllIlII(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    private static boolean llIlIIlllIIIl(int n2) {
        return n2 > 0;
    }

    private static String llIlIIllIlIII(String var21, String var4) {
        var21 = new String(Base64.getDecoder().decode(var21.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var15 = new StringBuilder();
        char[] var7 = var4.toCharArray();
        int var16 = lllllIIlll[0];
        char[] var8 = var21.toCharArray();
        int var3 = var8.length;
        int var2 = lllllIIlll[0];
        while (ab.llIlIIllIlllI(var2, var3)) {
            char var11 = var8[var2];
            var15.append((char)(var11 ^ var7[var16 % var7.length]));
            0;
            ++var16;
            ++var2;
            0;
            if (-(149 + 148 - 195 + 51 ^ 76 + 63 - 11 + 28) < 0) continue;
            return null;
        }
        return String.valueOf(var15);
    }

    @Override
    public int T() {
        ab.eD();
        return lllllIIlll[48];
    }

    private static int llIlIIllllIll(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    private static String llIlIIllIlIlI(String var5, String var14) {
        try {
            SecretKeySpec var17 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var14.getBytes(StandardCharsets.UTF_8)), lllllIIlll[20]), "DES");
            Cipher var20 = Cipher.getInstance("DES");
            var20.init(lllllIIlll[2], var17);
            return new String(var20.doFinal(Base64.getDecoder().decode(var5.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var18) {
            var18.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean S() {
        return lllllIIlll[0];
    }

    private static boolean llIlIIlllllII(int n2) {
        return n2 <= 0;
    }

    private static boolean llIlIIlllIllI(int n2, int n3) {
        return n2 != n3;
    }

    private static void llIlIIllIlIll() {
        lllllIIllI = new String[lllllIIlll[112]];
        ab.lllllIIllI[ab.lllllIIlll[0]] = ab."Buying items";
        ab.lllllIIllI[ab.lllllIIlll[1]] = ab."Finished buying items, switching back to mining";
        ab.lllllIIllI[ab.lllllIIlll[2]] = ab."Navigating to bank";
        ab.lllllIIllI[ab.lllllIIlll[3]] = ab."Handling banking";
        ab.lllllIIllI[ab.lllllIIlll[8]] = ab."We are missing supplies, switching to BUYING";
        ab.lllllIIllI[ab.lllllIIlll[12]] = ab."We are missing supplies, switching to BUYING";
        ab.lllllIIllI[ab.lllllIIlll[17]] = ab."Wear";
        ab.lllllIIllI[ab.lllllIIlll[18]] = ab."Nav to farmer";
        ab.lllllIIllI[ab.lllllIIlll[20]] = ab."Pickpocketing";
        ab.lllllIIllI[ab.lllllIIlll[21]] = ab."Master Farmer";
        ab.lllllIIllI[ab.lllllIIlll[13]] = ab."Master Farmer";
        ab.lllllIIllI[ab.lllllIIlll[22]] = ab."Pickpocket";
        ab.lllllIIllI[ab.lllllIIlll[23]] = ab."Stunned";
        ab.lllllIIllI[ab.lllllIIlll[24]] = ab."Drink";
        ab.lllllIIllI[ab.lllllIIlll[25]] = ab."Jug";
        ab.lllllIIllI[ab.lllllIIlll[16]] = ab."Jug";
        ab.lllllIIllI[ab.lllllIIlll[26]] = ab."Nav to men";
        ab.lllllIIllI[ab.lllllIIlll[27]] = ab."Pickpocketing";
        ab.lllllIIllI[ab.lllllIIlll[29]] = ab."Open-all";
        ab.lllllIIllI[ab.lllllIIlll[30]] = ab."Man";
        ab.lllllIIllI[ab.lllllIIlll[14]] = ab."Man";
        ab.lllllIIllI[ab.lllllIIlll[31]] = ab."Pickpocket";
        ab.lllllIIllI[ab.lllllIIlll[32]] = ab."Stunned";
        ab.lllllIIllI[ab.lllllIIlll[33]] = ab."Eat";
        ab.lllllIIllI[ab.lllllIIlll[34]] = ab."Nav to tea tile";
        ab.lllllIIllI[ab.lllllIIlll[28]] = ab."Open-all";
        ab.lllllIIllI[ab.lllllIIlll[35]] = ab."Stealing";
        ab.lllllIIllI[ab.lllllIIlll[36]] = ab."Tea stall";
        ab.lllllIIllI[ab.lllllIIlll[37]] = ab."Tea stall";
        ab.lllllIIllI[ab.lllllIIlll[38]] = ab."Steal-from";
        ab.lllllIIllI[ab.lllllIIlll[40]] = ab."Dropping";
        ab.lllllIIllI[ab.lllllIIlll[49]] = ab."Thieving";
        ab.lllllIIllI[ab.lllllIIlll[51]] = ab."Drop";
        ab.lllllIIllI[ab.lllllIIlll[52]] = ab."Drop";
        ab.lllllIIllI[ab.lllllIIlll[53]] = ab."Tea stall";
        ab.lllllIIllI[ab.lllllIIlll[54]] = ab."Drop";
        ab.lllllIIllI[ab.lllllIIlll[55]] = ab."Drop";
        ab.lllllIIllI[ab.lllllIIlll[56]] = ab."Drop";
        ab.lllllIIllI[ab.lllllIIlll[5]] = ab."Onion seed";
        ab.lllllIIllI[ab.lllllIIlll[61]] = ab."Marigold seed";
        ab.lllllIIllI[ab.lllllIIlll[62]] = ab."Cabbage seed";
        ab.lllllIIllI[ab.lllllIIlll[63]] = ab."Jute seed";
        ab.lllllIIllI[ab.lllllIIlll[64]] = ab."Potato seed";
        ab.lllllIIllI[ab.lllllIIlll[65]] = ab."Tomato seed";
        ab.lllllIIllI[ab.lllllIIlll[66]] = ab."Nasturtium seed";
        ab.lllllIIllI[ab.lllllIIlll[67]] = ab."Holy handegg";
        ab.lllllIIllI[ab.lllllIIlll[68]] = ab."Peaceful handegg";
        ab.lllllIIllI[ab.lllllIIlll[69]] = ab."Chaotic handegg";
        ab.lllllIIllI[ab.lllllIIlll[70]] = ab."Sweetcorn seed";
        ab.lllllIIllI[ab.lllllIIlll[71]] = ab."Woad seed";
        ab.lllllIIllI[ab.lllllIIlll[72]] = ab."Redberry seed";
        ab.lllllIIllI[ab.lllllIIlll[73]] = ab."Jangerberry seed";
        ab.lllllIIllI[ab.lllllIIlll[74]] = ab."Tarromin seed";
        ab.lllllIIllI[ab.lllllIIlll[75]] = ab."Rosemary seed";
        ab.lllllIIllI[ab.lllllIIlll[76]] = ab."Strawberry seed";
        ab.lllllIIllI[ab.lllllIIlll[77]] = ab."Hammerstone seed";
        ab.lllllIIllI[ab.lllllIIlll[78]] = ab."Asgarnian seed";
        ab.lllllIIllI[ab.lllllIIlll[79]] = ab."Yanillian seed";
        ab.lllllIIllI[ab.lllllIIlll[80]] = ab."Krandorian seed";
        ab.lllllIIllI[ab.lllllIIlll[81]] = ab."Wildblood seed";
        ab.lllllIIllI[ab.lllllIIlll[82]] = ab."Marigold seed";
        ab.lllllIIllI[ab.lllllIIlll[83]] = ab."Rosemary seed";
        ab.lllllIIllI[ab.lllllIIlll[84]] = ab."Cadavaberry seed";
        ab.lllllIIllI[ab.lllllIIlll[85]] = ab."Dwellberry seed";
        ab.lllllIIllI[ab.lllllIIlll[86]] = ab."Jangerberry seed";
        ab.lllllIIllI[ab.lllllIIlll[87]] = ab."Poison ivy seed";
        ab.lllllIIllI[ab.lllllIIlll[88]] = ab."Guam seed";
        ab.lllllIIllI[ab.lllllIIlll[89]] = ab."Marrentill seed";
        ab.lllllIIllI[ab.lllllIIlll[90]] = ab."Tarromin seed";
        ab.lllllIIllI[ab.lllllIIlll[91]] = ab."Harralander seed";
        ab.lllllIIllI[ab.lllllIIlll[92]] = ab."Mushroom spore";
        ab.lllllIIllI[ab.lllllIIlll[93]] = ab."Belladonna seed";
        ab.lllllIIllI[ab.lllllIIlll[94]] = ab."Cactus seed";
        ab.lllllIIllI[ab.lllllIIlll[95]] = ab."Potato cactus seed";
        ab.lllllIIllI[ab.lllllIIlll[96]] = ab."Jug";
    }

    private static String llIlIIllIlIIl(String var9, String var6) {
        try {
            SecretKeySpec var19 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var6.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var13 = Cipher.getInstance("Blowfish");
            var13.init(lllllIIlll[2], var19);
            return new String(var13.doFinal(Base64.getDecoder().decode(var9.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var1) {
            var1.printStackTrace();
            return null;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean aa() {
        int n2;
        block7: {
            block8: {
                if (ab.llIlIIllIlllI(Skills.getLevel((Skill)Skill.THIEVING), lllllIIlll[12])) {
                    int n3;
                    int[] nArray = new int[lllllIIlll[1]];
                    nArray[ab.lllllIIlll[0]] = lllllIIlll[11];
                    if (ab.llIlIIllIllIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        int[] nArray2 = new int[lllllIIlll[1]];
                        nArray2[ab.lllllIIlll[0]] = lllllIIlll[10];
                        int[] nArray3 = new int[lllllIIlll[1]];
                        nArray3[ab.lllllIIlll[0]] = lllllIIlll[9];
                        if (ab.llIlIIllIllIl(Inventory.contains((int[])nArray2) & Inventory.contains((int[])nArray3)) && ab.llIlIIlllIIIl(bS)) {
                            n3 = lllllIIlll[1];
                            0;
                            if (2 > 0) return n3 != 0;
                            return false;
                        }
                    }
                    n3 = lllllIIlll[0];
                    return n3 != 0;
                }
                if (ab.llIlIIlllIIlI(Skills.getLevel((Skill)Skill.THIEVING), lllllIIlll[12]) && ab.llIlIIllIlllI(Skills.getLevel((Skill)Skill.THIEVING), lllllIIlll[5])) {
                    return lllllIIlll[1];
                }
                if (!ab.llIlIIlllIIlI(Skills.getLevel((Skill)Skill.THIEVING), lllllIIlll[5])) return lllllIIlll[0];
                int[] nArray = new int[lllllIIlll[1]];
                nArray[ab.lllllIIlll[0]] = lllllIIlll[7];
                if (!ab.llIlIIllIllIl(Inventory.contains((int[])nArray) ? 1 : 0)) break block7;
                int[] nArray4 = new int[lllllIIlll[1]];
                nArray4[ab.lllllIIlll[0]] = lllllIIlll[6];
                if (!ab.llIlIIllIllll(Inventory.contains((int[])nArray4) ? 1 : 0)) break block8;
                int[] nArray5 = new int[lllllIIlll[1]];
                nArray5[ab.lllllIIlll[0]] = lllllIIlll[6];
                if (!ab.llIlIIllIllIl(Equipment.contains((int[])nArray5) ? 1 : 0)) break block7;
            }
            n2 = lllllIIlll[1];
            0;
            if (3 > 0) return n2 != 0;
            return false;
        }
        n2 = lllllIIlll[0];
        return n2 != 0;
    }

    private static boolean eH() {
        return lllllIIlll[0];
    }

    private static boolean llIlIIlllIIll(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean llIlIIlllIIlI(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean llIlIIllIllll(int n2) {
        return n2 == 0;
    }

    private static void eF() {
        if (ab.llIlIIlllIIll(Players.getLocal().getWorldLocation().distanceTo(jA), lllllIIlll[16])) {
            AccBuilderTempleTrek.c = lllllIIllI[lllllIIlll[26]];
            Movement.walkTo((WorldPoint)jA);
            0;
            Time.sleepTicks((int)lllllIIlll[1]);
            0;
        }
        if (ab.llIlIIlllIlIl(Players.getLocal().getWorldLocation().distanceTo(jA), lllllIIlll[16])) {
            if (ab.llIlIIllIllIl(Dialog.canLevelUpContinue() ? 1 : 0)) {
                Dialog.close();
            }
            if (ab.llIlIIllllIIl(ab.llIlIIllllIlI(System.currentTimeMillis(), jD))) {
                AccBuilderTempleTrek.c = lllllIIllI[lllllIIlll[27]];
                int[] nArray = new int[lllllIIlll[1]];
                nArray[ab.lllllIIlll[0]] = jF;
                if (ab.llIlIIllIllIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    int[] nArray2 = new int[lllllIIlll[1]];
                    nArray2[ab.lllllIIlll[0]] = jF;
                    if (ab.llIlIIlllIIlI(Inventory.getFirst((int[])nArray2).getQuantity(), lllllIIlll[28])) {
                        int[] nArray3 = new int[lllllIIlll[1]];
                        nArray3[ab.lllllIIlll[0]] = jF;
                        Inventory.getFirst((int[])nArray3).interact(lllllIIllI[lllllIIlll[29]]);
                        Time.sleepTicks((int)lllllIIlll[1]);
                        0;
                    }
                }
                String[] stringArray = new String[lllllIIlll[1]];
                stringArray[ab.lllllIIlll[0]] = lllllIIllI[lllllIIlll[30]];
                if (ab.llIlIIlllIIII(NPCs.getNearest((String[])stringArray)) && ab.llIlIIlllIlll(Players.getLocal().getInteracting()) && ab.llIlIIllIllll(Players.getLocal().isMoving() ? 1 : 0)) {
                    String[] stringArray2 = new String[lllllIIlll[1]];
                    stringArray2[ab.lllllIIlll[0]] = lllllIIllI[lllllIIlll[14]];
                    NPCs.getNearest((String[])stringArray2).interact(lllllIIllI[lllllIIlll[31]]);
                    Time.sleepTicks((int)lllllIIlll[1]);
                    0;
                }
            }
            if (ab.llIlIIlllllII(ab.llIlIIllllIlI(System.currentTimeMillis(), jD))) {
                AccBuilderTempleTrek.c = lllllIIllI[lllllIIlll[32]];
                if (!ab.llIlIIllllIIl(ab.llIlIIllllIll(e.u(), 30.0)) || ab.llIlIIlllIlIl(Skills.getBoostedLevel((Skill)Skill.HITPOINTS), lllllIIlll[8])) {
                    int[] nArray = new int[lllllIIlll[1]];
                    nArray[ab.lllllIIlll[0]] = lllllIIlll[11];
                    if (ab.llIlIIllIllIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        int[] nArray4 = new int[lllllIIlll[1]];
                        nArray4[ab.lllllIIlll[0]] = lllllIIlll[11];
                        Inventory.getFirst((int[])nArray4).interact(lllllIIllI[lllllIIlll[33]]);
                        Time.sleepTicks((int)lllllIIlll[1]);
                        0;
                    }
                }
            }
        }
    }

    private static boolean llIlIIlllIlIl(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean llIlIIllllIII(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean llIlIIllIllIl(int n2) {
        return n2 != 0;
    }

    private static boolean llIlIIlllIIII(Object object) {
        return object != null;
    }
}

