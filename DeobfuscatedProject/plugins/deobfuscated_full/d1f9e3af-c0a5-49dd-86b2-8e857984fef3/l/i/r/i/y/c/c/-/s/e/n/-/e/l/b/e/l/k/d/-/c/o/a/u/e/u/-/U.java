/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Bank$WithdrawMode
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 */
package l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-;

import gg.squire.account.AccBuilderEasyClues;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.F;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.W;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.a;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.an;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.b;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.d;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.e;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.f;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.g;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.i;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;

public class U
implements W {
    static /* synthetic */ int cl;
    public static final /* synthetic */ WorldPoint kn;
    public static final /* synthetic */ String[] kp;
    static /* synthetic */ boolean cm;
    private static /* synthetic */ int[] lIlIIIIlI;
    public static final /* synthetic */ WorldPoint kl;
    public static final /* synthetic */ WorldPoint ko;
    static /* synthetic */ int bT;
    private static /* synthetic */ String[] lIlIIIIIl;
    public static /* synthetic */ boolean bt;
    public static /* synthetic */ List<d> bv;
    public static final /* synthetic */ WorldPoint km;

    @Override
    public boolean V() {
        int n2;
        if (U.lIIIIllllIlI(e.j(lIlIIIIlI[9]), lIlIIIIlI[7]) && U.lIIIIlllIllI(Players.getLocal().getWorldLocation().distanceTo(ko), lIlIIIIlI[43])) {
            n2 = lIlIIIIlI[1];
            0;
            if (-1 >= 0) {
                return ((0x9A ^ 0xA3 ^ (0xCB ^ 0xA3)) & (16 + 126 - 32 + 17 ^ (0x5A ^ 0x74) ^ -1)) != 0;
            }
        } else {
            n2 = lIlIIIIlI[0];
        }
        return n2 != 0;
    }

    private static void lIIIIllIllIl() {
        lIlIIIIlI = new int[74];
        U.lIlIIIIlI[0] = (0xB0 ^ 0xA5) & ~(0x2F ^ 0x3A);
        U.lIlIIIIlI[1] = 1;
        U.lIlIIIIlI[2] = 0x43 ^ 2;
        U.lIlIIIIlI[3] = 0x42 ^ 0x48;
        U.lIlIIIIlI[4] = 0xD7 ^ 0x8D ^ (0x55 ^ 0x49);
        U.lIlIIIIlI[5] = 2;
        U.lIlIIIIlI[6] = -(0xFFFFDD55 & 0x2EAF) & (0xFFFFCD7F & 0x3FFF);
        U.lIlIIIIlI[7] = 3;
        U.lIlIIIIlI[8] = -(0xFFFFBE7D & 0x798F) & (0xFFFFBFEF & 0x7BFF);
        U.lIlIIIIlI[9] = 34 + 150 - 120 + 114;
        U.lIlIIIIlI[10] = 0xE ^ 0x6B ^ (0x42 ^ 0x23);
        U.lIlIIIIlI[11] = 0x9A ^ 0x9F;
        U.lIlIIIIlI[12] = -(0xFFFFEB77 & 0x74DE) & (0xFFFFFFFD & 0x73DF);
        U.lIlIIIIlI[13] = -(0xFFFFFBE7 & 0x549B) & (0xFFFFFFFF & 0x57FF);
        U.lIlIIIIlI[14] = 0xFFFF8E5E & 0x77AF;
        U.lIlIIIIlI[15] = -(0xFFFFF25D & 0x3FB7) & (0xFFFFFFBF & 0x3B7F);
        U.lIlIIIIlI[16] = -(0xFFFFFA6F & 0x25B1) & (0xFFFFFFFF & 0x3F67);
        U.lIlIIIIlI[17] = 0xFFFF85FD & 0x7F37;
        U.lIlIIIIlI[18] = 0x2B ^ 0x17 ^ (0x52 ^ 0x68);
        U.lIlIIIIlI[19] = -(0xFFFFF9FF & 0x5735) & (0xFFFFFFFF & 0x7FFE);
        U.lIlIIIIlI[20] = 0x2C ^ 0x2B;
        U.lIlIIIIlI[21] = 0x14 ^ 0x1C;
        U.lIlIIIIlI[22] = 0x99 ^ 0x90;
        U.lIlIIIIlI[23] = 147 + 7 - 99 + 103 ^ 92 + 134 - 150 + 73;
        U.lIlIIIIlI[24] = 0x52 ^ 0x1E ^ (0xDF ^ 0x9F);
        U.lIlIIIIlI[25] = 3 ^ 0xE;
        U.lIlIIIIlI[26] = 0xAB ^ 0xA5;
        U.lIlIIIIlI[27] = 0x1A ^ 0x15;
        U.lIlIIIIlI[28] = 0xBC ^ 0xAC;
        U.lIlIIIIlI[29] = 0 + 21 - -110 + 39 ^ 43 + 151 - 105 + 98;
        U.lIlIIIIlI[30] = 8 + 39 - 38 + 200 ^ 47 + 160 - 31 + 19;
        U.lIlIIIIlI[31] = 0x25 ^ 0x36;
        U.lIlIIIIlI[32] = 0xBA ^ 0xAE;
        U.lIlIIIIlI[33] = -(0xFFFFBEB5 & 0x6D5F) & (0xFFFFAFFF & 0x7EDE);
        U.lIlIIIIlI[34] = 20 + 42 - -66 + 18 ^ 122 + 57 - 60 + 16;
        U.lIlIIIIlI[35] = 0x8C ^ 0x9A;
        U.lIlIIIIlI[36] = 0x36 ^ 0x3A ^ (0xAD ^ 0xB6);
        U.lIlIIIIlI[37] = 7 ^ 0x23 ^ (0x3B ^ 7);
        U.lIlIIIIlI[38] = 0x88 ^ 0x96 ^ (0x97 ^ 0x90);
        U.lIlIIIIlI[39] = 0x1F ^ 0x6B ^ (0x63 ^ 0xD);
        U.lIlIIIIlI[40] = 0x74 ^ 0x6F;
        U.lIlIIIIlI[41] = 157 + 161 - 198 + 48 ^ 51 + 58 - -13 + 58;
        U.lIlIIIIlI[42] = 34 + 5 - -62 + 54 ^ 82 + 65 - 116 + 103;
        U.lIlIIIIlI[43] = 0x82 ^ 0x9C;
        U.lIlIIIIlI[44] = 0xFA ^ 0xA9 ^ (0x30 ^ 0x7C);
        U.lIlIIIIlI[45] = 0xA1 ^ 0x81;
        U.lIlIIIIlI[46] = 0xA ^ 0x1D ^ (0x90 ^ 0xA6);
        U.lIlIIIIlI[47] = 124 + 27 - 62 + 59 ^ 174 + 56 - 127 + 79;
        U.lIlIIIIlI[48] = 0x28 ^ 0xB;
        U.lIlIIIIlI[49] = 0xA2 ^ 0x86;
        U.lIlIIIIlI[50] = 0xFFFFB71E & 0x5FED;
        U.lIlIIIIlI[51] = -(0xFFFFD3F3 & 0x3E9D) & (0xFFFFFFBC & 0x77FF);
        U.lIlIIIIlI[52] = -(131 + 18 - 63 + 76) & (0xFFFFFFBD & 0x3EFF);
        U.lIlIIIIlI[53] = 0x1F ^ 0x37;
        U.lIlIIIIlI[54] = 0xFFFF9DB0 & 0x63DF;
        U.lIlIIIIlI[55] = -(0xFFFFCE9B & 0x7165) & (0xFFFFFEEF & 0x6FDC);
        U.lIlIIIIlI[56] = 0xFFFFFBAB & 0x65FC;
        U.lIlIIIIlI[57] = -(0xFFFFFABF & 0x7DC2) & (0xFFFFFFEF & 0x7FFD);
        U.lIlIIIIlI[58] = 0xFFFFFBD9 & 0x3577;
        U.lIlIIIIlI[59] = 0x4F ^ 0x1D ^ (0x47 ^ 0x71);
        U.lIlIIIIlI[60] = 0x9D ^ 0xB8;
        U.lIlIIIIlI[61] = 0x14 ^ 0x3D ^ (0x7C ^ 0x73);
        U.lIlIIIIlI[62] = -(0xFFFFF4CE & 0x5B73) & (0xFFFFDE5F & 0x7DFB);
        U.lIlIIIIlI[63] = 0xFFFF8EFC & 0x7DC7;
        U.lIlIIIIlI[64] = -(0xFFFFF3C9 & 0x1D77) & (0xFFFFFDD7 & 0x1FFF);
        U.lIlIIIIlI[65] = 0xFFFFBDEF & 0x4F53;
        U.lIlIIIIlI[66] = 0xFFFFCE3D & 0x3DEE;
        U.lIlIIIIlI[67] = -(0xFFFFD3AF & 0x6C73) & (0xFFFFED7F & 0x5FBE);
        U.lIlIIIIlI[68] = -(0xFFFFE1FD & 0x7F73) & (0xFFFFFFF7 & 0x6D7D);
        U.lIlIIIIlI[69] = 0xFFFFF7AB & 0x2E7F;
        U.lIlIIIIlI[70] = 0x40 ^ 0x67;
        U.lIlIIIIlI[71] = 0x69 ^ 0x40;
        U.lIlIIIIlI[72] = 0x2C ^ 0 ^ (0x8A ^ 0x8C);
        U.lIlIIIIlI[73] = 0x4A ^ 0x61;
    }

    static {
        U.lIIIIllIllIl();
        U.lIIIIllIllII();
        kl = new WorldPoint(lIlIIIIlI[62], lIlIIIIlI[63], lIlIIIIlI[0]);
        km = new WorldPoint(lIlIIIIlI[64], lIlIIIIlI[65], lIlIIIIlI[0]);
        kn = new WorldPoint(lIlIIIIlI[66], lIlIIIIlI[67], lIlIIIIlI[0]);
        ko = new WorldPoint(lIlIIIIlI[68], lIlIIIIlI[69], lIlIIIIlI[0]);
        String[] stringArray = new String[lIlIIIIlI[10]];
        stringArray[U.lIlIIIIlI[0]] = lIlIIIIIl[lIlIIIIlI[70]];
        stringArray[U.lIlIIIIlI[1]] = lIlIIIIIl[lIlIIIIlI[53]];
        stringArray[U.lIlIIIIlI[5]] = lIlIIIIIl[lIlIIIIlI[71]];
        stringArray[U.lIlIIIIlI[7]] = lIlIIIIIl[lIlIIIIlI[72]];
        kp = stringArray;
        bv = new ArrayList<d>();
        bT = lIlIIIIlI[0];
    }

    public static void db() {
        block44: {
            BankLocation llllIllIlllllI;
            block47: {
                block48: {
                    block46: {
                        block45: {
                            if (U.lIIIIllIllll(bt ? 1 : 0)) {
                                AccBuilderEasyClues.c = lIlIIIIIl[lIlIIIIlI[0]];
                                b.a(bv);
                                if (U.lIIIIlllIIII(bv.size(), lIlIIIIlI[1])) {
                                    System.out.println(lIlIIIIIl[lIlIIIIlI[1]]);
                                    bt = lIlIIIIlI[0];
                                }
                            }
                            if (U.lIIIIlllIIIl(bt ? 1 : 0) && U.lIIIIlllIIII(e.j(lIlIIIIlI[2]), lIlIIIIlI[3])) {
                                F.bG();
                            }
                            if (!U.lIIIIlllIIIl(bt ? 1 : 0) || !U.lIIIIlllIIlI(e.j(lIlIIIIlI[2]), lIlIIIIlI[3])) break block44;
                            if (U.lIIIIllIllll(Inventory.contains((int[])f.aV) ? 1 : 0) && U.lIIIIlllIIII(Movement.getRunEnergy(), lIlIIIIlI[4])) {
                                Inventory.getFirst((int[])f.aV).interact(lIlIIIIIl[lIlIIIIlI[5]]);
                                Time.sleepTicks((int)lIlIIIIlI[1]);
                                0;
                            }
                            if (U.lIIIIlllIIll(U.lIIIIllIlllI(e.u(), 70.0))) {
                                int[] nArray = new int[lIlIIIIlI[1]];
                                nArray[U.lIlIIIIlI[0]] = lIlIIIIlI[6];
                                if (U.lIIIIllIllll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                                    int[] nArray2 = new int[lIlIIIIlI[1]];
                                    nArray2[U.lIlIIIIlI[0]] = lIlIIIIlI[6];
                                    Inventory.getFirst((int[])nArray2).interact(lIlIIIIIl[lIlIIIIlI[7]]);
                                }
                            }
                            if (U.lIIIIlllIIIl(Movement.isRunEnabled() ? 1 : 0) && U.lIIIIlllIlII(Movement.getRunEnergy())) {
                                Movement.toggleRun();
                            }
                            if (!U.lIIIIllIllll(U.ab() ? 1 : 0)) break block45;
                            int[] nArray = new int[lIlIIIIlI[1]];
                            nArray[U.lIlIIIIlI[0]] = lIlIIIIlI[8];
                            if (!U.lIIIIlllIlII(Inventory.getCount((int[])nArray))) break block46;
                        }
                        if (U.lIIIIlllIIII(e.j(lIlIIIIlI[9]), lIlIIIIlI[1])) {
                            llllIllIlllllI = BankLocation.getNearest();
                            if (U.lIIIIlllIlIl(llllIllIlllllI) && U.lIIIIlllIIIl(llllIllIlllllI.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                AccBuilderEasyClues.c = lIlIIIIIl[lIlIIIIlI[10]];
                                a.a(llllIllIlllllI);
                                Time.sleepTicks((int)lIlIIIIlI[5]);
                                0;
                            }
                            if (U.lIIIIlllIlIl(llllIllIlllllI) && U.lIIIIllIllll(llllIllIlllllI.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                AccBuilderEasyClues.c = lIlIIIIIl[lIlIIIIlI[11]];
                                if (U.lIIIIlllIIIl(Bank.isOpen() ? 1 : 0)) {
                                    a.a();
                                    Time.sleepUntil(() -> Bank.isOpen(), (int)lIlIIIIlI[12]);
                                    0;
                                }
                                if (U.lIIIIllIllll(Bank.isOpen() ? 1 : 0)) {
                                    if (U.lIIIIlllIlII(Inventory.getAll().size())) {
                                        Bank.depositInventory();
                                        Time.sleepTicks((int)lIlIIIIlI[10]);
                                        0;
                                    }
                                    if (U.lIIIIlllIlII(Equipment.getAll().size())) {
                                        Bank.depositEquipment();
                                        Time.sleepTicks((int)lIlIIIIlI[5]);
                                        0;
                                    }
                                    int[] nArray = new int[lIlIIIIlI[11]];
                                    nArray[U.lIlIIIIlI[0]] = lIlIIIIlI[13];
                                    nArray[U.lIlIIIIlI[1]] = lIlIIIIlI[14];
                                    nArray[U.lIlIIIIlI[5]] = lIlIIIIlI[15];
                                    nArray[U.lIlIIIIlI[7]] = lIlIIIIlI[16];
                                    nArray[U.lIlIIIIlI[10]] = lIlIIIIlI[17];
                                    if (U.lIIIIlllIIIl(e.b(nArray) ? 1 : 0)) {
                                        U.af();
                                        System.out.println(lIlIIIIIl[lIlIIIIlI[18]]);
                                        bt = lIlIIIIlI[1];
                                        return;
                                    }
                                    Bank.withdraw((int)lIlIIIIlI[13], (int)lIlIIIIlI[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lIlIIIIlI[1]);
                                    0;
                                    Bank.withdraw((int)lIlIIIIlI[14], (int)lIlIIIIlI[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lIlIIIIlI[1]);
                                    0;
                                    Bank.withdraw((int)lIlIIIIlI[15], (int)lIlIIIIlI[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lIlIIIIlI[1]);
                                    0;
                                    Bank.withdraw((int)lIlIIIIlI[16], (int)lIlIIIIlI[11], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lIlIIIIlI[1]);
                                    0;
                                    Bank.withdraw((int)lIlIIIIlI[19], (int)lIlIIIIlI[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lIlIIIIlI[1]);
                                    0;
                                    Bank.withdraw((int)lIlIIIIlI[17], (int)lIlIIIIlI[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lIlIIIIlI[1]);
                                    0;
                                    a.b(f.aV, lIlIIIIlI[1]);
                                    a.a(lIlIIIIlI[6], lIlIIIIlI[3]);
                                    a.b(f.bf, lIlIIIIlI[1]);
                                }
                            }
                        }
                    }
                    if (U.lIIIIllIllll(U.ab() ? 1 : 0) && U.lIIIIlllIIII(e.j(lIlIIIIlI[9]), lIlIIIIlI[1])) {
                        if (U.lIIIIlllIllI(Players.getLocal().getWorldLocation().distanceTo(kl), lIlIIIIlI[5])) {
                            AccBuilderEasyClues.c = lIlIIIIIl[lIlIIIIlI[20]];
                            if (U.lIIIIlllIIIl(Equipment.contains((int[])f.aR) ? 1 : 0) && U.lIIIIllIllll(Inventory.contains((int[])f.aR) ? 1 : 0)) {
                                Inventory.getFirst((int[])f.aR).interact(lIlIIIIIl[lIlIIIIlI[21]]);
                                Time.sleepTicks((int)lIlIIIIlI[1]);
                                0;
                            }
                            if (U.lIIIIlllIIII(bT, lIlIIIIlI[1])) {
                                e.v();
                                bT += lIlIIIIlI[1];
                            }
                            Movement.walkTo((WorldPoint)kl);
                            0;
                            Time.sleepTicks((int)lIlIIIIlI[1]);
                            0;
                        }
                        if (U.lIIIIlllIlll(Players.getLocal().getWorldLocation().distanceTo(kl), lIlIIIIlI[7])) {
                            AccBuilderEasyClues.c = lIlIIIIIl[lIlIIIIlI[22]];
                            g.a(lIlIIIIIl[lIlIIIIlI[3]], kp);
                        }
                    }
                    if (U.lIIIIlllIIlI(e.j(lIlIIIIlI[9]), lIlIIIIlI[1])) {
                        cl = lIlIIIIlI[0];
                        if (U.lIIIIlllIllI(Players.getLocal().getWorldLocation().distanceTo(km), lIlIIIIlI[21])) {
                            AccBuilderEasyClues.c = lIlIIIIIl[lIlIIIIlI[23]];
                            Movement.walkTo((WorldPoint)km);
                            0;
                            Time.sleepTicks((int)lIlIIIIlI[1]);
                            0;
                        }
                        if (U.lIIIIlllIlll(Players.getLocal().getWorldLocation().distanceTo(km), lIlIIIIlI[21])) {
                            AccBuilderEasyClues.c = lIlIIIIIl[lIlIIIIlI[24]];
                            g.a(lIlIIIIIl[lIlIIIIlI[25]], kp);
                        }
                    }
                    if (!U.lIIIIlllIIlI(e.j(lIlIIIIlI[9]), lIlIIIIlI[5])) break block47;
                    String[] stringArray = new String[lIlIIIIlI[1]];
                    stringArray[U.lIlIIIIlI[0]] = lIlIIIIIl[lIlIIIIlI[26]];
                    if (!U.lIIIIlllIIIl(Inventory.contains((String[])stringArray) ? 1 : 0)) break block48;
                    String[] stringArray2 = new String[lIlIIIIlI[1]];
                    stringArray2[U.lIlIIIIlI[0]] = lIlIIIIIl[lIlIIIIlI[27]];
                    if (!U.lIIIIlllIIIl(Inventory.contains((String[])stringArray2) ? 1 : 0)) break block47;
                }
                AccBuilderEasyClues.c = lIlIIIIIl[lIlIIIIlI[28]];
                g.a(lIlIIIIIl[lIlIIIIlI[29]], kp);
                g.a(kp);
            }
            if (U.lIIIIlllIIlI(e.j(lIlIIIIlI[9]), lIlIIIIlI[5])) {
                String[] stringArray = new String[lIlIIIIlI[1]];
                stringArray[U.lIlIIIIlI[0]] = lIlIIIIIl[lIlIIIIlI[30]];
                if (U.lIIIIlllIIIl(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    String[] stringArray3 = new String[lIlIIIIlI[1]];
                    stringArray3[U.lIlIIIIlI[0]] = lIlIIIIIl[lIlIIIIlI[31]];
                    if (U.lIIIIllIllll(Inventory.contains((String[])stringArray3) ? 1 : 0)) {
                        if (U.lIIIIlllIllI(Players.getLocal().getWorldLocation().distanceTo(kn), lIlIIIIlI[5]) && U.lIIIIlllIllI(Players.getLocal().getWorldLocation().distanceTo(ko), lIlIIIIlI[3])) {
                            AccBuilderEasyClues.c = lIlIIIIIl[lIlIIIIlI[32]];
                            if (U.lIIIIlllIlll(Players.getLocal().getWorldLocation().distanceTo(km), lIlIIIIlI[3]) && U.lIIIIllIllll(Equipment.contains((int[])f.aR) ? 1 : 0) && U.lIIIIllllIII(Players.getLocal().getAnimation(), lIlIIIIlI[33])) {
                                Equipment.getFirst((int[])f.aR).interact(lIlIIIIIl[lIlIIIIlI[34]]);
                                Time.sleepTicks((int)lIlIIIIlI[7]);
                                0;
                            }
                            Movement.walkTo((WorldPoint)kn);
                            0;
                            Time.sleepTicks((int)lIlIIIIlI[1]);
                            0;
                        }
                        if (U.lIIIIlllIlll(Players.getLocal().getWorldLocation().distanceTo(kn), lIlIIIIlI[10])) {
                            AccBuilderEasyClues.c = lIlIIIIIl[lIlIIIIlI[35]];
                            String[] stringArray4 = new String[lIlIIIIlI[1]];
                            stringArray4[U.lIlIIIIlI[0]] = lIlIIIIIl[lIlIIIIlI[36]];
                            llllIllIlllllI = TileObjects.getNearest((String[])stringArray4);
                            llllIllIlllllI.interact(lIlIIIIIl[lIlIIIIlI[37]]);
                            Time.sleepTicks((int)lIlIIIIlI[7]);
                            0;
                        }
                        if (U.lIIIIlllIlll(Players.getLocal().getWorldLocation().distanceTo(ko), lIlIIIIlI[3])) {
                            String[] stringArray5 = new String[lIlIIIIlI[1]];
                            stringArray5[U.lIlIIIIlI[0]] = lIlIIIIIl[lIlIIIIlI[38]];
                            if (U.lIIIIllllIIl(NPCs.getNearest((String[])stringArray5))) {
                                AccBuilderEasyClues.c = lIlIIIIIl[lIlIIIIlI[39]];
                                if (U.lIIIIlllIIII(cl, lIlIIIIlI[1])) {
                                    an.pA += lIlIIIIlI[1];
                                    an.o(AccBuilderEasyClues.m);
                                    cl += lIlIIIIlI[1];
                                    an.pA = lIlIIIIlI[0];
                                    cm = lIlIIIIlI[0];
                                }
                                String[] stringArray6 = new String[lIlIIIIlI[1]];
                                stringArray6[U.lIlIIIIlI[0]] = lIlIIIIIl[lIlIIIIlI[40]];
                                TileObjects.getNearest((String[])stringArray6).interact(lIlIIIIIl[lIlIIIIlI[41]]);
                                Time.sleepTicks((int)lIlIIIIlI[10]);
                                0;
                            }
                            String[] stringArray7 = new String[lIlIIIIlI[1]];
                            stringArray7[U.lIlIIIIlI[0]] = lIlIIIIIl[lIlIIIIlI[42]];
                            llllIllIlllllI = NPCs.getNearest((String[])stringArray7);
                            if (U.lIIIIlllIlIl(llllIllIlllllI)) {
                                AccBuilderEasyClues.c = lIlIIIIIl[lIlIIIIlI[43]];
                                int[] nArray = new int[lIlIIIIlI[1]];
                                nArray[U.lIlIIIIlI[0]] = lIlIIIIlI[17];
                                if (U.lIIIIlllIIIl(Equipment.contains((int[])nArray) ? 1 : 0)) {
                                    int[] nArray3 = new int[lIlIIIIlI[1]];
                                    nArray3[U.lIlIIIIlI[0]] = lIlIIIIlI[17];
                                    if (U.lIIIIllIllll(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                                        int[] nArray4 = new int[lIlIIIIlI[1]];
                                        nArray4[U.lIlIIIIlI[0]] = lIlIIIIlI[17];
                                        Inventory.getFirst((int[])nArray4).interact(lIlIIIIIl[lIlIIIIlI[44]]);
                                        Time.sleepTicks((int)lIlIIIIlI[1]);
                                        0;
                                    }
                                }
                                if (U.lIIIIllllIIl(Players.getLocal().getInteracting()) && U.lIIIIlllIIIl(llllIllIlllllI.isDead() ? 1 : 0)) {
                                    llllIllIlllllI.interact(lIlIIIIIl[lIlIIIIlI[45]]);
                                    Time.sleepTicks((int)lIlIIIIlI[5]);
                                    0;
                                }
                            }
                        }
                    }
                }
            }
            if (U.lIIIIlllIIlI(e.j(lIlIIIIlI[9]), lIlIIIIlI[7]) && U.lIIIIlllIlll(Players.getLocal().getWorldLocation().distanceTo(ko), lIlIIIIlI[3])) {
                int[] nArray = new int[lIlIIIIlI[1]];
                nArray[U.lIlIIIIlI[0]] = lIlIIIIlI[16];
                if (U.lIIIIllIllll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    int[] nArray5 = new int[lIlIIIIlI[1]];
                    nArray5[U.lIlIIIIlI[0]] = lIlIIIIlI[16];
                    Inventory.getFirst((int[])nArray5).interact(lIlIIIIIl[lIlIIIIlI[46]]);
                    Time.sleepTicks((int)lIlIIIIlI[5]);
                    0;
                }
            }
            g.a(new String[lIlIIIIlI[0]]);
        }
    }

    private static String lIIIIllIlIlI(String llllIllIlIIIIl, String llllIllIlIIIlI) {
        try {
            SecretKeySpec llllIllIlIIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllIllIlIIIlI.getBytes(StandardCharsets.UTF_8)), lIlIIIIlI[21]), "DES");
            Cipher llllIllIlIIlIl = Cipher.getInstance("DES");
            llllIllIlIIlIl.init(lIlIIIIlI[5], llllIllIlIIllI);
            return new String(llllIllIlIIlIl.doFinal(Base64.getDecoder().decode(llllIllIlIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllIllIlIIlII) {
            llllIllIlIIlII.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIIlllIIll(int n2) {
        return n2 < 0;
    }

    private static boolean lIIIIllllIIl(Object object) {
        return object == null;
    }

    private static boolean lIIIIllllIlI(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIIIIlllIlll(int n2, int n3) {
        return n2 <= n3;
    }

    private static String lIIIIllIlIIl(String llllIllIllIIII, String llllIllIlIllIl) {
        try {
            SecretKeySpec llllIllIllIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllIllIlIllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllIllIllIIlI = Cipher.getInstance("Blowfish");
            llllIllIllIIlI.init(lIlIIIIlI[5], llllIllIllIIll);
            return new String(llllIllIllIIlI.doFinal(Base64.getDecoder().decode(llllIllIllIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllIllIllIIIl) {
            llllIllIllIIIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIIlllIIlI(int n2, int n3) {
        return n2 == n3;
    }

    private static void lIIIIllIllII() {
        lIlIIIIIl = new String[lIlIIIIlI[73]];
        U.lIlIIIIIl[U.lIlIIIIlI[0]] = U."Buying items";
        U.lIlIIIIIl[U.lIlIIIIlI[1]] = U."Finished buying items, switching back to quest";
        U.lIlIIIIIl[U.lIlIIIIlI[5]] = U."Drink";
        U.lIlIIIIIl[U.lIlIIIIlI[7]] = U."Eat";
        U.lIlIIIIIl[U.lIlIIIIlI[10]] = U."Nav to bank";
        U.lIlIIIIIl[U.lIlIIIIlI[11]] = U."Handling banking";
        U.lIlIIIIIl[U.lIlIIIIlI[18]] = U."We are missing quest supplies, switching to BUYING";
        U.lIlIIIIIl[U.lIlIIIIlI[20]] = U."Nav to start";
        U.lIlIIIIIl[U.lIlIIIIlI[21]] = U."Wear";
        U.lIlIIIIIl[U.lIlIIIIlI[22]] = U."Talking npc";
        U.lIlIIIIIl[U.lIlIIIIlI[3]] = U."Morgan";
        U.lIlIIIIIl[U.lIlIIIIlI[23]] = U."Nav to pub";
        U.lIlIIIIIl[U.lIlIIIIlI[24]] = U."Talk to drunk";
        U.lIlIIIIIl[U.lIlIIIIlI[25]] = U."Dr Harlow";
        U.lIlIIIIIl[U.lIlIIIIlI[26]] = U."Beer";
        U.lIlIIIIIl[U.lIlIIIIlI[27]] = U."Stake";
        U.lIlIIIIIl[U.lIlIIIIlI[28]] = U."Talk to drunk";
        U.lIlIIIIIl[U.lIlIIIIlI[29]] = U."Dr Harlow";
        U.lIlIIIIIl[U.lIlIIIIlI[30]] = U."Beer";
        U.lIlIIIIIl[U.lIlIIIIlI[31]] = U."Stake";
        U.lIlIIIIIl[U.lIlIIIIlI[32]] = U."Nav to stairs";
        U.lIlIIIIIl[U.lIlIIIIlI[34]] = U."Draynor Village";
        U.lIlIIIIIl[U.lIlIIIIlI[35]] = U."Walking down stairs";
        U.lIlIIIIIl[U.lIlIIIIlI[36]] = U."Stairs";
        U.lIlIIIIIl[U.lIlIIIIlI[37]] = U."Walk-Down";
        U.lIlIIIIIl[U.lIlIIIIlI[38]] = U."Count Draynor";
        U.lIlIIIIIl[U.lIlIIIIlI[39]] = U."Starting fight";
        U.lIlIIIIIl[U.lIlIIIIlI[40]] = U."Coffin";
        U.lIlIIIIIl[U.lIlIIIIlI[41]] = U."Open";
        U.lIlIIIIIl[U.lIlIIIIlI[42]] = U."Count Draynor";
        U.lIlIIIIIl[U.lIlIIIIlI[43]] = U."Fighting";
        U.lIlIIIIIl[U.lIlIIIIlI[44]] = U."Wield";
        U.lIlIIIIIl[U.lIlIIIIlI[45]] = U."Attack";
        U.lIlIIIIIl[U.lIlIIIIlI[46]] = U."Break";
        U.lIlIIIIIl[U.lIlIIIIlI[47]] = U."Beer";
        U.lIlIIIIIl[U.lIlIIIIlI[48]] = U."Garlic";
        U.lIlIIIIIl[U.lIlIIIIlI[49]] = U."Hammer";
        U.lIlIIIIIl[U.lIlIIIIlI[60]] = U."Vampire slayer quest";
        U.lIlIIIIIl[U.lIlIIIIlI[61]] = U."ring of wealth (";
        U.lIlIIIIIl[U.lIlIIIIlI[70]] = U."Ok, I'm up for an adventure.";
        U.lIlIIIIIl[U.lIlIIIIlI[53]] = U."A glass of your finest ale please.";
        U.lIlIIIIIl[U.lIlIIIIlI[71]] = U."Morgan needs your help!";
        U.lIlIIIIIl[U.lIlIIIIlI[72]] = U."Yes.";
    }

    private static boolean lIIIIlllIlII(int n2) {
        return n2 > 0;
    }

    private static boolean lIIIIlllIIII(int n2, int n3) {
        return n2 < n3;
    }

    @Override
    public int T() {
        try {
            U.db();
            0;
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (-1 < -1) {
            return (82 + 119 - 158 + 119 ^ 2 + 50 - 44 + 179) & (0x78 ^ 0x25 ^ (0xF3 ^ 0xB7) ^ -1);
        }
        return lIlIIIIlI[59];
    }

    private static boolean lIIIIlllIIIl(int n2) {
        return n2 == 0;
    }

    @Override
    public boolean S() {
        return lIlIIIIlI[0];
    }

    private static boolean lIIIIlllIllI(int n2, int n3) {
        return n2 > n3;
    }

    private static int lIIIIllIlllI(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean ab() {
        int n2;
        String[] stringArray = new String[lIlIIIIlI[1]];
        stringArray[U.lIlIIIIlI[0]] = lIlIIIIIl[lIlIIIIlI[47]];
        if (U.lIIIIllIllll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
            String[] stringArray2 = new String[lIlIIIIlI[1]];
            stringArray2[U.lIlIIIIlI[0]] = lIlIIIIIl[lIlIIIIlI[48]];
            if (U.lIIIIllIllll(Inventory.contains((String[])stringArray2) ? 1 : 0)) {
                String[] stringArray3 = new String[lIlIIIIlI[1]];
                stringArray3[U.lIlIIIIlI[0]] = lIlIIIIIl[lIlIIIIlI[49]];
                if (U.lIIIIllIllll(Inventory.contains((String[])stringArray3) ? 1 : 0)) {
                    n2 = lIlIIIIlI[1];
                    0;
                    if (1 == 1) return n2 != 0;
                    return ((0x58 ^ 0x40 ^ (0xF ^ 0xA)) & (0xCE ^ 0xAE ^ (3 ^ 0x7E) ^ -1)) != 0;
                }
            }
        }
        n2 = lIlIIIIlI[0];
        return n2 != 0;
    }

    private static boolean lIIIIllIllll(int n2) {
        return n2 != 0;
    }

    private static boolean lIIIIlllIlIl(Object object) {
        return object != null;
    }

    @Override
    public String U() {
        return lIlIIIIIl[lIlIIIIlI[60]];
    }

    private static void af() {
        d llllIllIlllIlI;
        Object llllIllIlllIll;
        int[] nArray = new int[lIlIIIIlI[1]];
        nArray[U.lIlIIIIlI[0]] = lIlIIIIlI[13];
        if (U.lIIIIlllIIIl(Bank.contains((int[])nArray) ? 1 : 0)) {
            d d2 = new d(lIlIIIIlI[13], lIlIIIIlI[1], lIlIIIIlI[50]);
            bv.add(d2);
            0;
        }
        int[] nArray2 = new int[lIlIIIIlI[1]];
        nArray2[U.lIlIIIIlI[0]] = lIlIIIIlI[15];
        if (U.lIIIIlllIIIl(Bank.contains((int[])nArray2) ? 1 : 0)) {
            llllIllIlllIll = new d(lIlIIIIlI[15], lIlIIIIlI[1], lIlIIIIlI[50]);
            bv.add((d)llllIllIlllIll);
            0;
        }
        int[] nArray3 = new int[lIlIIIIlI[1]];
        nArray3[U.lIlIIIIlI[0]] = lIlIIIIlI[17];
        if (U.lIIIIlllIIIl(Bank.contains((int[])nArray3) ? 1 : 0)) {
            llllIllIlllIll = new d(lIlIIIIlI[17], lIlIIIIlI[1], lIlIIIIlI[51]);
            bv.add((d)llllIllIlllIll);
            0;
        }
        int[] nArray4 = new int[lIlIIIIlI[1]];
        nArray4[U.lIlIIIIlI[0]] = lIlIIIIlI[14];
        if (U.lIIIIlllIIIl(Bank.contains((int[])nArray4) ? 1 : 0)) {
            llllIllIlllIll = new d(lIlIIIIlI[14], lIlIIIIlI[1], lIlIIIIlI[50]);
            bv.add((d)llllIllIlllIll);
            0;
        }
        int[] nArray5 = new int[lIlIIIIlI[1]];
        nArray5[U.lIlIIIIlI[0]] = lIlIIIIlI[19];
        if (U.lIIIIlllIIIl(Bank.contains((int[])nArray5) ? 1 : 0)) {
            llllIllIlllIll = new d(lIlIIIIlI[19], lIlIIIIlI[1], lIlIIIIlI[52]);
            bv.add((d)llllIllIlllIll);
            0;
        }
        int[] nArray6 = new int[lIlIIIIlI[1]];
        nArray6[U.lIlIIIIlI[0]] = lIlIIIIlI[6];
        if (U.lIIIIlllIIIl(Bank.contains((int[])nArray6) ? 1 : 0)) {
            llllIllIlllIll = new d(lIlIIIIlI[6], lIlIIIIlI[3], lIlIIIIlI[50]);
            bv.add((d)llllIllIlllIll);
            0;
        }
        int[] nArray7 = new int[lIlIIIIlI[1]];
        nArray7[U.lIlIIIIlI[0]] = lIlIIIIlI[6];
        if (U.lIIIIllIllll(Bank.contains((int[])nArray7) ? 1 : 0)) {
            int[] nArray8 = new int[lIlIIIIlI[1]];
            nArray8[U.lIlIIIIlI[0]] = lIlIIIIlI[6];
            if (U.lIIIIlllIIII(Bank.getFirst((int[])nArray8).getQuantity(), lIlIIIIlI[32])) {
                llllIllIlllIll = new d(lIlIIIIlI[6], lIlIIIIlI[53], lIlIIIIlI[54]);
                bv.add((d)llllIllIlllIll);
                0;
            }
        }
        if (U.lIIIIlllIIIl(Bank.contains((Predicate)(llllIllIlllIll = item -> item.getName().toLowerCase().contains(lIlIIIIIl[lIlIIIIlI[61]]))) ? 1 : 0)) {
            llllIllIlllIlI = new d(lIlIIIIlI[55], lIlIIIIlI[11], lIlIIIIlI[56]);
            bv.add(llllIllIlllIlI);
            0;
        }
        int[] nArray9 = new int[lIlIIIIlI[1]];
        nArray9[U.lIlIIIIlI[0]] = lIlIIIIlI[16];
        if (U.lIIIIlllIIIl(Bank.contains((int[])nArray9) ? 1 : 0)) {
            llllIllIlllIlI = new d(lIlIIIIlI[16], lIlIIIIlI[53], lIlIIIIlI[57]);
            bv.add(llllIllIlllIlI);
            0;
        }
        int[] nArray10 = new int[lIlIIIIlI[1]];
        nArray10[U.lIlIIIIlI[0]] = lIlIIIIlI[58];
        if (U.lIIIIlllIIIl(Bank.contains((int[])nArray10) ? 1 : 0)) {
            llllIllIlllIlI = new d(lIlIIIIlI[58], lIlIIIIlI[11], i.bq);
            bv.add(llllIllIlllIlI);
            0;
        }
    }

    private static boolean lIIIIllllIII(int n2, int n3) {
        return n2 != n3;
    }

    private static String lIIIIllIlIll(String llllIllIIIlllI, String llllIllIIlIIlI) {
        llllIllIIIlllI = new String(Base64.getDecoder().decode(llllIllIIIlllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllIllIIlIIIl = new StringBuilder();
        char[] llllIllIIlIIII = llllIllIIlIIlI.toCharArray();
        int llllIllIIIllll = lIlIIIIlI[0];
        char[] llllIllIIIlIIl = llllIllIIIlllI.toCharArray();
        int llllIllIIIlIII = llllIllIIIlIIl.length;
        int llllIllIIIIlll = lIlIIIIlI[0];
        while (U.lIIIIlllIIII(llllIllIIIIlll, llllIllIIIlIII)) {
            char llllIllIIlIlII = llllIllIIIlIIl[llllIllIIIIlll];
            llllIllIIlIIIl.append((char)(llllIllIIlIlII ^ llllIllIIlIIII[llllIllIIIllll % llllIllIIlIIII.length]));
            0;
            ++llllIllIIIllll;
            ++llllIllIIIIlll;
            0;
            if ((0x9D ^ 0x99) >= ((3 ^ 0x1E) & ~(0x42 ^ 0x5F))) continue;
            return null;
        }
        return String.valueOf(llllIllIIlIIIl);
    }
}

