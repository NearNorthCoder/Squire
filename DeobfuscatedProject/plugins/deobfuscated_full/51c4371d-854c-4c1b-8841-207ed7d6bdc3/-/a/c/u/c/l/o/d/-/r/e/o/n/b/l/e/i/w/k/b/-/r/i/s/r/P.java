/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Item
 *  net.runelite.api.Skill
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Bank$WithdrawMode
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 */
package -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r;

import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.F;
import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.a;
import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.b;
import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.d;
import gg.squire.account.AccBuilderBarrows;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.Skill;
import net.runelite.api.coords.WorldArea;
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

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class P
implements F {
    public static final /* synthetic */ WorldArea jn;
    public static final /* synthetic */ int jk;
    public static /* synthetic */ List<d> bB;
    public static /* synthetic */ int[] iZ;
    private static /* synthetic */ int[] lllIllIl;
    private static /* synthetic */ String[] lllIlIll;
    public static final /* synthetic */ int jm;
    public static final /* synthetic */ int ji;
    public static final /* synthetic */ WorldPoint jp;
    public static /* synthetic */ int[] jr;
    public static /* synthetic */ boolean bz;
    public static final /* synthetic */ int jl;
    public static final /* synthetic */ WorldArea jo;
    public static final /* synthetic */ int jj;
    public static /* synthetic */ int[] jq;

    private static boolean llIIIlIIIlI(int n2, int n3) {
        return n2 < n3;
    }

    @Override
    public boolean T() {
        return lllIllIl[0];
    }

    private static boolean llIIIlIIIll(int n2) {
        return n2 == 0;
    }

    static {
        P.llIIIlIIIII();
        P.llIIIIlllll();
        jj = lllIllIl[8];
        jl = lllIllIl[10];
        jk = lllIllIl[9];
        ji = lllIllIl[7];
        jm = lllIllIl[11];
        jn = new WorldArea(lllIllIl[37], lllIllIl[38], lllIllIl[34], lllIllIl[39], lllIllIl[0]);
        jo = new WorldArea(lllIllIl[40], lllIllIl[41], lllIllIl[22], lllIllIl[34], lllIllIl[0]);
        jp = new WorldPoint(lllIllIl[42], lllIllIl[43], lllIllIl[0]);
        int[] nArray = new int[lllIllIl[6]];
        nArray[P.lllIllIl[0]] = lllIllIl[44];
        nArray[P.lllIllIl[1]] = lllIllIl[45];
        nArray[P.lllIllIl[3]] = lllIllIl[46];
        nArray[P.lllIllIl[4]] = lllIllIl[47];
        jq = nArray;
        int[] nArray2 = new int[lllIllIl[1]];
        nArray2[P.lllIllIl[0]] = lllIllIl[48];
        jr = nArray2;
        int[] nArray3 = new int[lllIllIl[4]];
        nArray3[P.lllIllIl[0]] = lllIllIl[49];
        nArray3[P.lllIllIl[1]] = lllIllIl[50];
        nArray3[P.lllIllIl[3]] = lllIllIl[51];
        iZ = nArray3;
        bB = new ArrayList<d>();
    }

    private static boolean llIIIlIIlIl(Object object) {
        return object != null;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean ac() {
        int n2;
        if (P.llIIIlIIllI(Skills.getLevel((Skill)Skill.WOODCUTTING), lllIllIl[23])) {
            boolean bl;
            int[] nArray = new int[lllIllIl[1]];
            nArray[P.lllIllIl[0]] = lllIllIl[11];
            if (P.llIIIlIIlII(Inventory.getCount((int[])nArray))) {
                bl = lllIllIl[1];
                0;
                if (2 > -1) return bl;
                return ((53 + 40 - -35 + 79 ^ 75 + 107 - 101 + 52) & (0x69 ^ 0x35 ^ (0x92 ^ 0x84) ^ -1)) != 0;
            }
            bl = lllIllIl[0];
            return bl;
        }
        if (P.llIIIlIIllI(Skills.getLevel((Skill)Skill.WOODCUTTING), lllIllIl[24]) && P.llIIIlIIIlI(Skills.getLevel((Skill)Skill.WOODCUTTING), lllIllIl[23])) {
            int n3;
            int[] nArray = new int[lllIllIl[1]];
            nArray[P.lllIllIl[0]] = lllIllIl[11];
            if (P.llIIIlIIlII(Inventory.getCount((int[])nArray))) {
                int[] nArray2 = new int[lllIllIl[1]];
                nArray2[P.lllIllIl[0]] = lllIllIl[10];
                if (P.llIIIlIIlII(Inventory.getCount((int[])nArray2))) {
                    n3 = lllIllIl[1];
                    0;
                    if (-1 <= 0) return n3 != 0;
                    return ((0x5A ^ 0x76 ^ (0x83 ^ 0x9C)) & (88 + 111 - 127 + 64 ^ 117 + 40 - 3 + 33 ^ -1)) != 0;
                }
            }
            n3 = lllIllIl[0];
            return n3 != 0;
        }
        if (P.llIIIlIIllI(Skills.getLevel((Skill)Skill.WOODCUTTING), lllIllIl[25]) && P.llIIIlIIIlI(Skills.getLevel((Skill)Skill.WOODCUTTING), lllIllIl[24])) {
            int n4;
            int[] nArray = new int[lllIllIl[1]];
            nArray[P.lllIllIl[0]] = lllIllIl[11];
            if (P.llIIIlIIlII(Inventory.getCount((int[])nArray))) {
                int[] nArray3 = new int[lllIllIl[1]];
                nArray3[P.lllIllIl[0]] = lllIllIl[10];
                if (P.llIIIlIIlII(Inventory.getCount((int[])nArray3))) {
                    int[] nArray4 = new int[lllIllIl[1]];
                    nArray4[P.lllIllIl[0]] = lllIllIl[9];
                    if (P.llIIIlIIlII(Inventory.getCount((int[])nArray4))) {
                        n4 = lllIllIl[1];
                        0;
                        if (((0x49 ^ 0x72 ^ (0x8D ^ 0x8A)) & (0xDF ^ 0xC4 ^ (3 ^ 0x24) ^ -1)) < 1) return n4 != 0;
                        return false;
                    }
                }
            }
            n4 = lllIllIl[0];
            return n4 != 0;
        }
        if (P.llIIIlIIllI(Skills.getLevel((Skill)Skill.WOODCUTTING), lllIllIl[13]) && P.llIIIlIIIlI(Skills.getLevel((Skill)Skill.WOODCUTTING), lllIllIl[25])) {
            int n5;
            int[] nArray = new int[lllIllIl[1]];
            nArray[P.lllIllIl[0]] = lllIllIl[11];
            if (P.llIIIlIIlII(Inventory.getCount((int[])nArray))) {
                int[] nArray5 = new int[lllIllIl[1]];
                nArray5[P.lllIllIl[0]] = lllIllIl[10];
                if (P.llIIIlIIlII(Inventory.getCount((int[])nArray5))) {
                    int[] nArray6 = new int[lllIllIl[1]];
                    nArray6[P.lllIllIl[0]] = lllIllIl[9];
                    if (P.llIIIlIIlII(Inventory.getCount((int[])nArray6))) {
                        int[] nArray7 = new int[lllIllIl[1]];
                        nArray7[P.lllIllIl[0]] = lllIllIl[8];
                        if (P.llIIIlIIlII(Inventory.getCount((int[])nArray7))) {
                            n5 = lllIllIl[1];
                            0;
                            if (((62 + 218 - 214 + 187 ^ 20 + 119 - 137 + 165) & (0x79 ^ 0x25 ^ (0xD ^ 0xB) ^ -1)) == 0) return n5 != 0;
                            return ((0x4A ^ 0x1A ^ (0x6A ^ 6)) & (0x74 ^ 0x24 ^ (0x7F ^ 0x13) ^ -1)) != 0;
                        }
                    }
                }
            }
            n5 = lllIllIl[0];
            return n5 != 0;
        }
        int[] nArray = new int[lllIllIl[1]];
        nArray[P.lllIllIl[0]] = lllIllIl[11];
        if (P.llIIIlIIlII(Inventory.getCount((int[])nArray))) {
            int[] nArray8 = new int[lllIllIl[1]];
            nArray8[P.lllIllIl[0]] = lllIllIl[10];
            if (P.llIIIlIIlII(Inventory.getCount((int[])nArray8))) {
                int[] nArray9 = new int[lllIllIl[1]];
                nArray9[P.lllIllIl[0]] = lllIllIl[9];
                if (P.llIIIlIIlII(Inventory.getCount((int[])nArray9))) {
                    int[] nArray10 = new int[lllIllIl[1]];
                    nArray10[P.lllIllIl[0]] = lllIllIl[8];
                    if (P.llIIIlIIlII(Inventory.getCount((int[])nArray10))) {
                        int[] nArray11 = new int[lllIllIl[1]];
                        nArray11[P.lllIllIl[0]] = lllIllIl[7];
                        if (P.llIIIlIIlII(Inventory.getCount((int[])nArray11))) {
                            n2 = lllIllIl[1];
                            0;
                            if (((0x96 ^ 0xC5) & ~(0x25 ^ 0x76)) == ((0x50 ^ 0x6B) & ~(0x5D ^ 0x66))) return n2 != 0;
                            return false;
                        }
                    }
                }
            }
        }
        n2 = lllIllIl[0];
        return n2 != 0;
    }

    private static String llIIIIllIII(String lIIllllIlIIllII, String lIIllllIlIIlIll) {
        lIIllllIlIIllII = new String(Base64.getDecoder().decode(lIIllllIlIIllII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lIIllllIlIIllll = new StringBuilder();
        char[] lIIllllIlIIlllI = lIIllllIlIIlIll.toCharArray();
        int lIIllllIlIIllIl = lllIllIl[0];
        char[] lIIllllIlIIIlll = lIIllllIlIIllII.toCharArray();
        int lIIllllIlIIIllI = lIIllllIlIIIlll.length;
        int lIIllllIlIIIlIl = lllIllIl[0];
        while (P.llIIIlIIIlI(lIIllllIlIIIlIl, lIIllllIlIIIllI)) {
            char lIIllllIlIlIIlI = lIIllllIlIIIlll[lIIllllIlIIIlIl];
            lIIllllIlIIllll.append((char)(lIIllllIlIlIIlI ^ lIIllllIlIIlllI[lIIllllIlIIllIl % lIIllllIlIIlllI.length]));
            0;
            ++lIIllllIlIIllIl;
            ++lIIllllIlIIIlIl;
            0;
            if ((1 & (1 ^ -1)) <= 3) continue;
            return null;
        }
        return String.valueOf(lIIllllIlIIllll);
    }

    private static boolean llIIIlIIlII(int n2) {
        return n2 > 0;
    }

    @Override
    public String V() {
        return lllIlIll[lllIllIl[34]];
    }

    @Override
    public boolean W() {
        boolean bl;
        if (P.llIIIlIIllI(Skills.getLevel((Skill)Skill.WOODCUTTING), lllIllIl[35])) {
            bl = lllIllIl[1];
            0;
            if (((62 + 81 - 6 + 71 ^ 119 + 46 - 127 + 97) & (48 + 105 - 71 + 68 ^ 105 + 51 - 153 + 190 ^ -1)) != 0) {
                return ((0xF5 ^ 0xAC ^ (0x19 ^ 0x6E)) & (0x8D ^ 0xB2 ^ (0x35 ^ 0x24) ^ -1)) != 0;
            }
        } else {
            bl = lllIllIl[0];
        }
        return bl;
    }

    public static void ag() {
        d lIIllllIlllIllI;
        Object lIIllllIlllIlll;
        int[] nArray = new int[lllIllIl[1]];
        nArray[P.lllIllIl[0]] = lllIllIl[7];
        if (P.llIIIlIIIll(Bank.contains((int[])nArray) ? 1 : 0)) {
            d d2 = new d(lllIllIl[7], lllIllIl[1], lllIllIl[5]);
            bB.add(d2);
            0;
        }
        int[] nArray2 = new int[lllIllIl[1]];
        nArray2[P.lllIllIl[0]] = lllIllIl[8];
        if (P.llIIIlIIIll(Bank.contains((int[])nArray2) ? 1 : 0)) {
            lIIllllIlllIlll = new d(lllIllIl[8], lllIllIl[1], lllIllIl[5]);
            bB.add((d)lIIllllIlllIlll);
            0;
        }
        int[] nArray3 = new int[lllIllIl[1]];
        nArray3[P.lllIllIl[0]] = lllIllIl[9];
        if (P.llIIIlIIIll(Bank.contains((int[])nArray3) ? 1 : 0)) {
            lIIllllIlllIlll = new d(lllIllIl[9], lllIllIl[1], lllIllIl[26]);
            bB.add((d)lIIllllIlllIlll);
            0;
        }
        int[] nArray4 = new int[lllIllIl[1]];
        nArray4[P.lllIllIl[0]] = lllIllIl[10];
        if (P.llIIIlIIIll(Bank.contains((int[])nArray4) ? 1 : 0)) {
            lIIllllIlllIlll = new d(lllIllIl[10], lllIllIl[1], lllIllIl[27]);
            bB.add((d)lIIllllIlllIlll);
            0;
        }
        int[] nArray5 = new int[lllIllIl[1]];
        nArray5[P.lllIllIl[0]] = lllIllIl[11];
        if (P.llIIIlIIIll(Bank.contains((int[])nArray5) ? 1 : 0)) {
            lIIllllIlllIlll = new d(lllIllIl[11], lllIllIl[1], lllIllIl[28]);
            bB.add((d)lIIllllIlllIlll);
            0;
        }
        if (P.llIIIlIIIll(Bank.contains((Predicate)(lIIllllIlllIlll = item -> item.getName().toLowerCase().contains(lllIlIll[lllIllIl[36]]))) ? 1 : 0)) {
            lIIllllIlllIllI = new d(lllIllIl[29], lllIllIl[12], lllIllIl[28]);
            bB.add(lIIllllIlllIllI);
            0;
        }
        int[] nArray6 = new int[lllIllIl[1]];
        nArray6[P.lllIllIl[0]] = lllIllIl[30];
        if (P.llIIIlIIIll(Bank.contains((int[])nArray6) ? 1 : 0)) {
            lIIllllIlllIllI = new d(lllIllIl[30], lllIllIl[31], lllIllIl[32]);
            bB.add(lIIllllIlllIllI);
            0;
        }
    }

    private static void llIIIIlllll() {
        lllIlIll = new String[lllIllIl[52]];
        P.lllIlIll[P.lllIllIl[0]] = P."Buying items";
        P.lllIlIll[P.lllIllIl[1]] = P."Finished buying items, switching back to woodcutting";
        P.lllIlIll[P.lllIllIl[3]] = P."Navigating to bank";
        P.lllIlIll[P.lllIllIl[4]] = P."Opening bank";
        P.lllIlIll[P.lllIllIl[6]] = P."Handling banking";
        P.lllIlIll[P.lllIllIl[12]] = P."We are missing pickaxes, switching to BUYING";
        P.lllIlIll[P.lllIllIl[13]] = P."Dropping logs";
        P.lllIlIll[P.lllIllIl[14]] = P."Dropping logs";
        P.lllIlIll[P.lllIllIl[16]] = P."Walking to trees";
        P.lllIlIll[P.lllIllIl[17]] = P."Chopping";
        P.lllIlIll[P.lllIllIl[18]] = P."Chopping logs";
        P.lllIlIll[P.lllIllIl[19]] = P."Chop down";
        P.lllIlIll[P.lllIllIl[20]] = P."Walking to oak trees";
        P.lllIlIll[P.lllIllIl[21]] = P."Chopping oaks";
        P.lllIlIll[P.lllIllIl[22]] = P."Chopping oak logs";
        P.lllIlIll[P.lllIllIl[15]] = P."Chop down";
        P.lllIlIll[P.lllIllIl[34]] = P."Woodcutting";
        P.lllIlIll[P.lllIllIl[36]] = P."ring of wealth (";
    }

    @Override
    public int U() {
        P.dj();
        return lllIllIl[33];
    }

    private static boolean llIIIlIIIIl(int n2) {
        return n2 != 0;
    }

    private static String llIIIIllIlI(String lIIllllIllIlllI, String lIIllllIllIlIll) {
        try {
            SecretKeySpec lIIllllIlllIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIIllllIllIlIll.getBytes(StandardCharsets.UTF_8)), lllIllIl[16]), "DES");
            Cipher lIIllllIlllIIII = Cipher.getInstance("DES");
            lIIllllIlllIIII.init(lllIllIl[3], lIIllllIlllIIIl);
            return new String(lIIllllIlllIIII.doFinal(Base64.getDecoder().decode(lIIllllIllIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIIllllIllIllll) {
            lIIllllIllIllll.printStackTrace();
            return null;
        }
    }

    private static String llIIIIllIIl(String lIIllllIlIlllll, String lIIllllIlIllllI) {
        try {
            SecretKeySpec lIIllllIllIIlII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIIllllIlIllllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIIllllIllIIIll = Cipher.getInstance("Blowfish");
            lIIllllIllIIIll.init(lllIllIl[3], lIIllllIllIIlII);
            return new String(lIIllllIllIIIll.doFinal(Base64.getDecoder().decode(lIIllllIlIlllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIIllllIllIIIlI) {
            lIIllllIllIIIlI.printStackTrace();
            return null;
        }
    }

    private static boolean llIIIlIIllI(int n2, int n3) {
        return n2 >= n3;
    }

    public static void dj() {
        block25: {
            BankLocation lIIllllIllllIlI;
            block27: {
                block33: {
                    block29: {
                        block32: {
                            block31: {
                                block30: {
                                    block28: {
                                        block26: {
                                            if (P.llIIIlIIIIl(bz ? 1 : 0)) {
                                                AccBuilderBarrows.c = lllIlIll[lllIllIl[0]];
                                                b.a(bB);
                                                if (P.llIIIlIIIlI(bB.size(), lllIllIl[1])) {
                                                    System.out.println(lllIlIll[lllIllIl[1]]);
                                                    bz = lllIllIl[0];
                                                }
                                            }
                                            if (!P.llIIIlIIIll(bz ? 1 : 0)) break block25;
                                            if (!P.llIIIlIIIIl(P.ac() ? 1 : 0)) break block26;
                                            int[] nArray = new int[lllIllIl[1]];
                                            nArray[P.lllIllIl[0]] = lllIllIl[2];
                                            if (!P.llIIIlIIlII(Inventory.getCount((int[])nArray))) break block27;
                                        }
                                        if (P.llIIIlIIlIl(lIIllllIllllIlI = BankLocation.getNearest()) && P.llIIIlIIIll(lIIllllIllllIlI.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                            AccBuilderBarrows.c = lllIlIll[lllIllIl[3]];
                                            a.a(lIIllllIllllIlI);
                                        }
                                        if (!P.llIIIlIIlIl(lIIllllIllllIlI) || !P.llIIIlIIIIl(lIIllllIllllIlI.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block27;
                                        if (P.llIIIlIIIll(Bank.isOpen() ? 1 : 0)) {
                                            AccBuilderBarrows.c = lllIlIll[lllIllIl[4]];
                                            a.a();
                                            Time.sleepUntil(() -> Bank.isOpen(), (int)lllIllIl[5]);
                                            0;
                                        }
                                        if (!P.llIIIlIIIIl(Bank.isOpen() ? 1 : 0)) break block27;
                                        AccBuilderBarrows.c = lllIlIll[lllIllIl[6]];
                                        if (P.llIIIlIIlII(Inventory.getAll().size())) {
                                            Bank.depositInventory();
                                            Time.sleepTicks((int)lllIllIl[6]);
                                            0;
                                        }
                                        if (P.llIIIlIIlII(Equipment.getAll().size())) {
                                            Bank.depositEquipment();
                                            Time.sleepTicks((int)lllIllIl[3]);
                                            0;
                                        }
                                        int[] nArray = new int[lllIllIl[1]];
                                        nArray[P.lllIllIl[0]] = lllIllIl[7];
                                        if (!P.llIIIlIIIll(Bank.contains((int[])nArray) ? 1 : 0)) break block28;
                                        int[] nArray2 = new int[lllIllIl[1]];
                                        nArray2[P.lllIllIl[0]] = lllIllIl[7];
                                        if (!P.llIIIlIIllI(Inventory.getCount((int[])nArray2), lllIllIl[1])) break block29;
                                    }
                                    int[] nArray = new int[lllIllIl[1]];
                                    nArray[P.lllIllIl[0]] = lllIllIl[8];
                                    if (!P.llIIIlIIIll(Bank.contains((int[])nArray) ? 1 : 0)) break block30;
                                    int[] nArray3 = new int[lllIllIl[1]];
                                    nArray3[P.lllIllIl[0]] = lllIllIl[8];
                                    if (!P.llIIIlIIllI(Inventory.getCount((int[])nArray3), lllIllIl[1])) break block29;
                                }
                                int[] nArray = new int[lllIllIl[1]];
                                nArray[P.lllIllIl[0]] = lllIllIl[9];
                                if (!P.llIIIlIIIll(Bank.contains((int[])nArray) ? 1 : 0)) break block31;
                                int[] nArray4 = new int[lllIllIl[1]];
                                nArray4[P.lllIllIl[0]] = lllIllIl[9];
                                if (!P.llIIIlIIllI(Inventory.getCount((int[])nArray4), lllIllIl[1])) break block29;
                            }
                            int[] nArray = new int[lllIllIl[1]];
                            nArray[P.lllIllIl[0]] = lllIllIl[10];
                            if (!P.llIIIlIIIll(Bank.contains((int[])nArray) ? 1 : 0)) break block32;
                            int[] nArray5 = new int[lllIllIl[1]];
                            nArray5[P.lllIllIl[0]] = lllIllIl[10];
                            if (!P.llIIIlIIllI(Inventory.getCount((int[])nArray5), lllIllIl[1])) break block29;
                        }
                        int[] nArray = new int[lllIllIl[1]];
                        nArray[P.lllIllIl[0]] = lllIllIl[11];
                        if (!P.llIIIlIIIll(Bank.contains((int[])nArray) ? 1 : 0)) break block33;
                        int[] nArray6 = new int[lllIllIl[1]];
                        nArray6[P.lllIllIl[0]] = lllIllIl[11];
                        if (!P.llIIIlIIIlI(Inventory.getCount((int[])nArray6), lllIllIl[1])) break block33;
                    }
                    P.ag();
                    System.out.println(lllIlIll[lllIllIl[12]]);
                    bz = lllIllIl[1];
                    return;
                }
                int[] nArray = new int[lllIllIl[1]];
                nArray[P.lllIllIl[0]] = lllIllIl[7];
                if (P.llIIIlIIIIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                    Bank.withdraw((int)lllIllIl[7], (int)lllIllIl[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                    Time.sleepTicks((int)lllIllIl[3]);
                    0;
                    Time.sleepUntil(() -> {
                        boolean bl;
                        int[] nArray = new int[lllIllIl[1]];
                        nArray[P.lllIllIl[0]] = lllIllIl[7];
                        if (P.llIIIlIIlII(Inventory.getCount((int[])nArray))) {
                            bl = lllIllIl[1];
                            0;
                            if (-(0x96 ^ 0x9E ^ (0xB9 ^ 0xB5)) >= 0) {
                                return ((0x29 ^ 0xC ^ (0x8F ^ 0x95)) & (146 + 31 - 116 + 111 ^ 12 + 13 - -83 + 39 ^ -1)) != 0;
                            }
                        } else {
                            bl = lllIllIl[0];
                        }
                        return bl;
                    }, (int)lllIllIl[5]);
                    0;
                }
                int[] nArray7 = new int[lllIllIl[1]];
                nArray7[P.lllIllIl[0]] = lllIllIl[8];
                if (P.llIIIlIIIIl(Bank.contains((int[])nArray7) ? 1 : 0)) {
                    Bank.withdraw((int)lllIllIl[8], (int)lllIllIl[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                    Time.sleepTicks((int)lllIllIl[3]);
                    0;
                    Time.sleepUntil(() -> {
                        boolean bl;
                        int[] nArray = new int[lllIllIl[1]];
                        nArray[P.lllIllIl[0]] = lllIllIl[8];
                        if (P.llIIIlIIlII(Inventory.getCount((int[])nArray))) {
                            bl = lllIllIl[1];
                            0;
                            if (2 == 0) {
                                return ((12 + 128 - 66 + 57 ^ 1 + 63 - -51 + 34) & (0x40 ^ 7 ^ (0x3E ^ 0x6F) ^ -1)) != 0;
                            }
                        } else {
                            bl = lllIllIl[0];
                        }
                        return bl;
                    }, (int)lllIllIl[5]);
                    0;
                }
                int[] nArray8 = new int[lllIllIl[1]];
                nArray8[P.lllIllIl[0]] = lllIllIl[9];
                if (P.llIIIlIIIIl(Bank.contains((int[])nArray8) ? 1 : 0)) {
                    Bank.withdraw((int)lllIllIl[9], (int)lllIllIl[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                    Time.sleepTicks((int)lllIllIl[3]);
                    0;
                    Time.sleepUntil(() -> {
                        boolean bl;
                        int[] nArray = new int[lllIllIl[1]];
                        nArray[P.lllIllIl[0]] = lllIllIl[9];
                        if (P.llIIIlIIlII(Inventory.getCount((int[])nArray))) {
                            bl = lllIllIl[1];
                            0;
                            if (2 <= ((75 + 144 - 112 + 132 ^ 67 + 3 - -34 + 66) & (11 + 0 - -35 + 83 ^ 192 + 36 - 98 + 66 ^ -1))) {
                                return false;
                            }
                        } else {
                            bl = lllIllIl[0];
                        }
                        return bl;
                    }, (int)lllIllIl[5]);
                    0;
                }
                int[] nArray9 = new int[lllIllIl[1]];
                nArray9[P.lllIllIl[0]] = lllIllIl[10];
                if (P.llIIIlIIIIl(Bank.contains((int[])nArray9) ? 1 : 0)) {
                    Bank.withdraw((int)lllIllIl[10], (int)lllIllIl[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                    Time.sleepTicks((int)lllIllIl[3]);
                    0;
                    Time.sleepUntil(() -> {
                        boolean bl;
                        int[] nArray = new int[lllIllIl[1]];
                        nArray[P.lllIllIl[0]] = lllIllIl[10];
                        if (P.llIIIlIIlII(Inventory.getCount((int[])nArray))) {
                            bl = lllIllIl[1];
                            0;
                            if (((0x3A ^ 0x29 ^ (0xF6 ^ 0xA5)) & (83 + 17 - -17 + 18 ^ 65 + 169 - 221 + 186 ^ -1)) != 0) {
                                return ((7 ^ 0x30 ^ (0x77 ^ 0x4F)) & (49 + 28 - 20 + 76 ^ 56 + 86 - 109 + 105 ^ -1)) != 0;
                            }
                        } else {
                            bl = lllIllIl[0];
                        }
                        return bl;
                    }, (int)lllIllIl[5]);
                    0;
                }
                int[] nArray10 = new int[lllIllIl[1]];
                nArray10[P.lllIllIl[0]] = lllIllIl[11];
                if (P.llIIIlIIIIl(Bank.contains((int[])nArray10) ? 1 : 0)) {
                    Bank.withdraw((int)lllIllIl[11], (int)lllIllIl[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                    Time.sleepTicks((int)lllIllIl[3]);
                    0;
                    Time.sleepUntil(() -> {
                        boolean bl;
                        int[] nArray = new int[lllIllIl[1]];
                        nArray[P.lllIllIl[0]] = lllIllIl[11];
                        if (P.llIIIlIIlII(Inventory.getCount((int[])nArray))) {
                            bl = lllIllIl[1];
                            0;
                            
                            }
                        } else {
                            bl = lllIllIl[0];
                        }
                        return bl;
                    }, (int)lllIllIl[5]);
                    0;
                }
            }
            if (P.llIIIlIIIIl(P.ac() ? 1 : 0)) {
                if (P.llIIIlIIIIl(Inventory.isFull() ? 1 : 0)) {
                    AccBuilderBarrows.c = lllIlIll[lllIllIl[13]];
                    System.out.println(lllIlIll[lllIllIl[14]]);
                    Inventory.getAll((int[])iZ).stream().forEach(Item::drop);
                }
                if (P.llIIIlIIIll(Inventory.isFull() ? 1 : 0)) {
                    if (P.llIIIlIIIlI(Skills.getLevel((Skill)Skill.WOODCUTTING), lllIllIl[15])) {
                        if (P.llIIIlIIIll(jn.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderBarrows.c = lllIlIll[lllIllIl[16]];
                            Movement.walkTo((WorldPoint)jn.toWorldPoint());
                            0;
                            Time.sleepTicks((int)lllIllIl[6]);
                            0;
                        }
                        if (P.llIIIlIIIIl(jn.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderBarrows.c = lllIlIll[lllIllIl[17]];
                            lIIllllIllllIlI = TileObjects.getNearest((WorldPoint)Players.getLocal().getWorldLocation(), (int[])jq);
                            if (P.llIIIlIIIll(Players.getLocal().isAnimating() ? 1 : 0) && P.llIIIlIIIll(Players.getLocal().isMoving() ? 1 : 0) && P.llIIIlIIlIl(lIIllllIllllIlI)) {
                                System.out.println(lllIlIll[lllIllIl[18]]);
                                lIIllllIllllIlI.interact(lllIlIll[lllIllIl[19]]);
                                Time.sleepTicks((int)lllIllIl[4]);
                                0;
                            }
                        }
                    }
                    if (P.llIIIlIIllI(Skills.getLevel((Skill)Skill.WOODCUTTING), lllIllIl[15])) {
                        if (P.llIIIlIIIll(jo.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderBarrows.c = lllIlIll[lllIllIl[20]];
                            Movement.walkTo((WorldPoint)jp);
                            0;
                            Time.sleepTicks((int)lllIllIl[6]);
                            0;
                        }
                        if (P.llIIIlIIIIl(jo.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderBarrows.c = lllIlIll[lllIllIl[21]];
                            lIIllllIllllIlI = TileObjects.getNearest((WorldPoint)Players.getLocal().getWorldLocation(), (int[])jr);
                            if (P.llIIIlIIIll(Players.getLocal().isAnimating() ? 1 : 0) && P.llIIIlIIIll(Players.getLocal().isMoving() ? 1 : 0) && P.llIIIlIIlIl(lIIllllIllllIlI)) {
                                System.out.println(lllIlIll[lllIllIl[22]]);
                                lIIllllIllllIlI.interact(lllIlIll[lllIllIl[15]]);
                                Time.sleepTicks((int)lllIllIl[4]);
                                0;
                            }
                        }
                    }
                }
            }
        }
    }

    private static void llIIIlIIIII() {
        lllIllIl = new int[53];
        P.lllIllIl[0] = (0xA6 ^ 0xB0 ^ (0x7F ^ 0x65)) & (36 + 197 - 93 + 62 ^ 32 + 29 - 54 + 191 ^ -1);
        P.lllIllIl[1] = 1;
        P.lllIllIl[2] = 0xFFFFF3F3 & 0xFEF;
        P.lllIllIl[3] = 2;
        P.lllIllIl[4] = 3;
        P.lllIllIl[5] = 0xFFFF93A9 & 0x7FDE;
        P.lllIllIl[6] = 12 + 54 - -62 + 6 ^ 73 + 45 - 73 + 85;
        P.lllIllIl[7] = -(0xFFFFFFF3 & 0x4ABD) & (0xFFFFDFF7 & 0x6FFF);
        P.lllIllIl[8] = -(0xFFFFBFF3 & 0x623F) & (0xFFFFF77F & 0x2FFB);
        P.lllIllIl[9] = -(0xFFFFF3DD & 0x5EB7) & (0xFFFFDFFF & 0x77DF);
        P.lllIllIl[10] = -(0xFFFF9D9F & 0x7A73) & (0xFFFFFFFF & 0x1D5F);
        P.lllIllIl[11] = 0xFFFF975F & 0x6DEF;
        P.lllIllIl[12] = 0x99 ^ 0x9C;
        P.lllIllIl[13] = 152 + 50 - 59 + 53 ^ 103 + 113 - 52 + 30;
        P.lllIllIl[14] = 0x60 ^ 0x67;
        P.lllIllIl[15] = 0x72 ^ 9 ^ (8 ^ 0x7C);
        P.lllIllIl[16] = 0xBA ^ 0xB2;
        P.lllIllIl[17] = 0x53 ^ 0x5A;
        P.lllIllIl[18] = 0x5D ^ 0x57;
        P.lllIllIl[19] = 0x3F ^ 0x72 ^ (0x34 ^ 0x72);
        P.lllIllIl[20] = 0x93 ^ 0xB6 ^ (0x81 ^ 0xA8);
        P.lllIllIl[21] = (0xD6 ^ 0xB6) & ~(0x43 ^ 0x23) ^ (0x4F ^ 0x42);
        P.lllIllIl[22] = 0x2C ^ 0x51 ^ (0xED ^ 0x9E);
        P.lllIllIl[23] = 16 + 104 - -32 + 16 ^ 33 + 81 - 101 + 116;
        P.lllIllIl[24] = 0x39 ^ 0x26;
        P.lllIllIl[25] = 0xA1 ^ 0xB4;
        P.lllIllIl[26] = 0xFFFFB33A & 0x6FED;
        P.lllIllIl[27] = -(0xFFFFD5DE & 0x7A3B) & (0xFFFFFEFD & 0x7FFB);
        P.lllIllIl[28] = 0xFFFFF1BA & 0x6FED;
        P.lllIllIl[29] = -(0xFFFFFF2F & 0x51F3) & (0xFFFFFFEF & 0x7FFE);
        P.lllIllIl[30] = -(0xFFFFE2BB & 0x7D5D) & (0xFFFFFFDF & 0x7F7F);
        P.lllIllIl[31] = 43 + 167 - 183 + 143 ^ 48 + 100 - 70 + 52;
        P.lllIllIl[32] = -(0xFFFF87FD & 0x7C7B) & (0xFFFFCFFF & 0x37FC);
        P.lllIllIl[33] = 174 + 78 - 68 + 56 ^ 139 + 7 - 87 + 89;
        P.lllIllIl[34] = 0x42 ^ 0x52;
        P.lllIllIl[35] = 0xC4 ^ 0xAD ^ (0x7E ^ 0x74);
        P.lllIllIl[36] = 0xE ^ 0x1F;
        P.lllIllIl[37] = -(0xFFFFFFD3 & 0x11AD) & (0xFFFFDFDF & 0x3DF5);
        P.lllIllIl[38] = 0xFFFFAF6E & 0x5DBF;
        P.lllIllIl[39] = 108 + 93 - 149 + 139 ^ 4 + 58 - -36 + 48;
        P.lllIllIl[40] = -(0xFFFFB9CD & 0x76B3) & (0xFFFFFDFE & 0x3EFF);
        P.lllIllIl[41] = 0xFFFFFF6F & 0xDB1;
        P.lllIllIl[42] = -(0xFFFFEF6E & 0x31BD) & (0xFFFFAFEF & 0x7DBF);
        P.lllIllIl[43] = 0xFFFFEDA7 & 0x1F7D;
        P.lllIllIl[44] = 0xFFFFD4FC & 0x2FFF;
        P.lllIllIl[45] = 0xFFFF95FF & 0x6EFE;
        P.lllIllIl[46] = -(0xFFFFF4DF & 0x7BBA) & (0xFFFFFDFB & 0x779F);
        P.lllIllIl[47] = -(0xFFFFBFDA & 0x68FF) & (0xFFFFADDF & Short.MAX_VALUE);
        P.lllIllIl[48] = 0xFFFFAA67 & 0x7FDC;
        P.lllIllIl[49] = -(0xFFFFFDD9 & 0x7A2F) & (0xFFFFFDEF & Short.MAX_VALUE);
        P.lllIllIl[50] = 0xFFFFCDF5 & 0x37FB;
        P.lllIllIl[51] = -(0x6B ^ 0x7A) & (0xFFFFD7FF & 0x2DFF);
        P.lllIllIl[52] = 0xD6 ^ 0x95 ^ (0x3D ^ 0x6C);
    }
}

