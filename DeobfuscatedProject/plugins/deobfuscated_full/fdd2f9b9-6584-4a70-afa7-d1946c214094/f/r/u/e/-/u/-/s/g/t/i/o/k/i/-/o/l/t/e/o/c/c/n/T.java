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
package f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n;

import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.G;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.a;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.b;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.d;
import gg.squire.account.AccBuilderRogues;
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

public class T
implements G {
    public static final /* synthetic */ int jF;
    public static final /* synthetic */ int jB;
    public static final /* synthetic */ WorldArea jG;
    public static /* synthetic */ int[] js;
    private static /* synthetic */ String[] lIIIlIllIl;
    public static final /* synthetic */ int jE;
    public static /* synthetic */ boolean bt;
    public static final /* synthetic */ WorldArea jH;
    public static /* synthetic */ int[] jK;
    public static final /* synthetic */ int jC;
    public static /* synthetic */ List<d> bv;
    public static final /* synthetic */ int jD;
    public static /* synthetic */ int[] jJ;
    public static final /* synthetic */ WorldPoint jI;
    private static /* synthetic */ int[] lIIIlIlllI;

    private static boolean lllIllIlIIlI(int n2) {
        return n2 == 0;
    }

    @Override
    public String U() {
        return lIIIlIllIl[lIIIlIlllI[34]];
    }

    private static boolean lllIllIlIIII(int n2) {
        return n2 != 0;
    }

    public static void af() {
        d lIIllIIIllII;
        Object lIIllIIIllIl;
        int[] nArray = new int[lIIIlIlllI[1]];
        nArray[T.lIIIlIlllI[0]] = lIIIlIlllI[7];
        if (T.lllIllIlIIlI(Bank.contains((int[])nArray) ? 1 : 0)) {
            d d2 = new d(lIIIlIlllI[7], lIIIlIlllI[1], lIIIlIlllI[5]);
            bv.add(d2);
            0;
        }
        int[] nArray2 = new int[lIIIlIlllI[1]];
        nArray2[T.lIIIlIlllI[0]] = lIIIlIlllI[8];
        if (T.lllIllIlIIlI(Bank.contains((int[])nArray2) ? 1 : 0)) {
            lIIllIIIllIl = new d(lIIIlIlllI[8], lIIIlIlllI[1], lIIIlIlllI[5]);
            bv.add((d)lIIllIIIllIl);
            0;
        }
        int[] nArray3 = new int[lIIIlIlllI[1]];
        nArray3[T.lIIIlIlllI[0]] = lIIIlIlllI[9];
        if (T.lllIllIlIIlI(Bank.contains((int[])nArray3) ? 1 : 0)) {
            lIIllIIIllIl = new d(lIIIlIlllI[9], lIIIlIlllI[1], lIIIlIlllI[26]);
            bv.add((d)lIIllIIIllIl);
            0;
        }
        int[] nArray4 = new int[lIIIlIlllI[1]];
        nArray4[T.lIIIlIlllI[0]] = lIIIlIlllI[10];
        if (T.lllIllIlIIlI(Bank.contains((int[])nArray4) ? 1 : 0)) {
            lIIllIIIllIl = new d(lIIIlIlllI[10], lIIIlIlllI[1], lIIIlIlllI[27]);
            bv.add((d)lIIllIIIllIl);
            0;
        }
        int[] nArray5 = new int[lIIIlIlllI[1]];
        nArray5[T.lIIIlIlllI[0]] = lIIIlIlllI[11];
        if (T.lllIllIlIIlI(Bank.contains((int[])nArray5) ? 1 : 0)) {
            lIIllIIIllIl = new d(lIIIlIlllI[11], lIIIlIlllI[1], lIIIlIlllI[28]);
            bv.add((d)lIIllIIIllIl);
            0;
        }
        if (T.lllIllIlIIlI(Bank.contains((Predicate)(lIIllIIIllIl = item -> item.getName().toLowerCase().contains(lIIIlIllIl[lIIIlIlllI[36]]))) ? 1 : 0)) {
            lIIllIIIllII = new d(lIIIlIlllI[29], lIIIlIlllI[12], lIIIlIlllI[28]);
            bv.add(lIIllIIIllII);
            0;
        }
        int[] nArray6 = new int[lIIIlIlllI[1]];
        nArray6[T.lIIIlIlllI[0]] = lIIIlIlllI[30];
        if (T.lllIllIlIIlI(Bank.contains((int[])nArray6) ? 1 : 0)) {
            lIIllIIIllII = new d(lIIIlIlllI[30], lIIIlIlllI[31], lIIIlIlllI[32]);
            bv.add(lIIllIIIllII);
            0;
        }
    }

    @Override
    public boolean S() {
        return lIIIlIlllI[0];
    }

    private static void lllIllIIllIl() {
        lIIIlIllIl = new String[lIIIlIlllI[52]];
        T.lIIIlIllIl[T.lIIIlIlllI[0]] = T."Buying items";
        T.lIIIlIllIl[T.lIIIlIlllI[1]] = T."Finished buying items, switching back to woodcutting";
        T.lIIIlIllIl[T.lIIIlIlllI[3]] = T."Navigating to bank";
        T.lIIIlIllIl[T.lIIIlIlllI[4]] = T."Opening bank";
        T.lIIIlIllIl[T.lIIIlIlllI[6]] = T."Handling banking";
        T.lIIIlIllIl[T.lIIIlIlllI[12]] = T."We are missing pickaxes, switching to BUYING";
        T.lIIIlIllIl[T.lIIIlIlllI[13]] = T."Dropping logs";
        T.lIIIlIllIl[T.lIIIlIlllI[14]] = T."Dropping logs";
        T.lIIIlIllIl[T.lIIIlIlllI[16]] = T."Walking to trees";
        T.lIIIlIllIl[T.lIIIlIlllI[17]] = T."Chopping";
        T.lIIIlIllIl[T.lIIIlIlllI[18]] = T."Chopping logs";
        T.lIIIlIllIl[T.lIIIlIlllI[19]] = T."Chop down";
        T.lIIIlIllIl[T.lIIIlIlllI[20]] = T."Walking to oak trees";
        T.lIIIlIllIl[T.lIIIlIlllI[21]] = T."Chopping oaks";
        T.lIIIlIllIl[T.lIIIlIlllI[22]] = T."Chopping oak logs";
        T.lIIIlIllIl[T.lIIIlIlllI[15]] = T."Chop down";
        T.lIIIlIllIl[T.lIIIlIlllI[34]] = T."Woodcutting";
        T.lIIIlIllIl[T.lIIIlIlllI[36]] = T."ring of wealth (";
    }

    private static boolean lllIllIlIlII(Object object) {
        return object != null;
    }

    private static String lllIllIIllII(String lIIlIllIIIlI, String lIIlIllIIllI) {
        lIIlIllIIIlI = new String(Base64.getDecoder().decode(lIIlIllIIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lIIlIllIIlIl = new StringBuilder();
        char[] lIIlIllIIlII = lIIlIllIIllI.toCharArray();
        int lIIlIllIIIll = lIIIlIlllI[0];
        char[] lIIlIlIlllIl = lIIlIllIIIlI.toCharArray();
        int lIIlIlIlllII = lIIlIlIlllIl.length;
        int lIIlIlIllIll = lIIIlIlllI[0];
        while (T.lllIllIlIIIl(lIIlIlIllIll, lIIlIlIlllII)) {
            char lIIlIllIlIII = lIIlIlIlllIl[lIIlIlIllIll];
            lIIlIllIIlIl.append((char)(lIIlIllIlIII ^ lIIlIllIIlII[lIIlIllIIIll % lIIlIllIIlII.length]));
            0;
            ++lIIlIllIIIll;
            ++lIIlIlIllIll;
            0;
            if (2 != 0) continue;
            return null;
        }
        return String.valueOf(lIIlIllIIlIl);
    }

    @Override
    public boolean V() {
        boolean bl;
        if (T.lllIllIlIlIl(Skills.getLevel((Skill)Skill.WOODCUTTING), lIIIlIlllI[35])) {
            bl = lIIIlIlllI[1];
            0;
            if ((0x15 ^ 0xF ^ (0x41 ^ 0x5F)) <= 2) {
                return ((0xE7 ^ 0xAE ^ (5 ^ 0x77)) & (0xD4 ^ 0x98 ^ (0xD2 ^ 0xA5) ^ -1)) != 0;
            }
        } else {
            bl = lIIIlIlllI[0];
        }
        return bl;
    }

    private static String lllIllIIlIlI(String lIIlIlllIlIl, String lIIlIlllIlII) {
        try {
            SecretKeySpec lIIlIllllIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIIlIlllIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIIlIllllIIl = Cipher.getInstance("Blowfish");
            lIIlIllllIIl.init(lIIIlIlllI[3], lIIlIllllIlI);
            return new String(lIIlIllllIIl.doFinal(Base64.getDecoder().decode(lIIlIlllIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIIlIllllIII) {
            lIIlIllllIII.printStackTrace();
            return null;
        }
    }

    private static boolean lllIllIlIIll(int n2) {
        return n2 > 0;
    }

    private static boolean lllIllIlIIIl(int n2, int n3) {
        return n2 < n3;
    }

    @Override
    public int T() {
        T.ds();
        return lIIIlIlllI[33];
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean ab() {
        int n2;
        if (T.lllIllIlIlIl(Skills.getLevel((Skill)Skill.WOODCUTTING), lIIIlIlllI[23])) {
            boolean bl;
            int[] nArray = new int[lIIIlIlllI[1]];
            nArray[T.lIIIlIlllI[0]] = lIIIlIlllI[11];
            if (T.lllIllIlIIll(Inventory.getCount((int[])nArray))) {
                bl = lIIIlIlllI[1];
                0;
                if (((0x1E ^ 0x53) & ~(0x42 ^ 0xF)) == ((0x6C ^ 0x38) & ~(0x58 ^ 0xC))) return bl;
                return false;
            }
            bl = lIIIlIlllI[0];
            return bl;
        }
        if (T.lllIllIlIlIl(Skills.getLevel((Skill)Skill.WOODCUTTING), lIIIlIlllI[24]) && T.lllIllIlIIIl(Skills.getLevel((Skill)Skill.WOODCUTTING), lIIIlIlllI[23])) {
            int n3;
            int[] nArray = new int[lIIIlIlllI[1]];
            nArray[T.lIIIlIlllI[0]] = lIIIlIlllI[11];
            if (T.lllIllIlIIll(Inventory.getCount((int[])nArray))) {
                int[] nArray2 = new int[lIIIlIlllI[1]];
                nArray2[T.lIIIlIlllI[0]] = lIIIlIlllI[10];
                if (T.lllIllIlIIll(Inventory.getCount((int[])nArray2))) {
                    n3 = lIIIlIlllI[1];
                    0;
                    if (3 >= -1) return n3 != 0;
                    return false;
                }
            }
            n3 = lIIIlIlllI[0];
            return n3 != 0;
        }
        if (T.lllIllIlIlIl(Skills.getLevel((Skill)Skill.WOODCUTTING), lIIIlIlllI[25]) && T.lllIllIlIIIl(Skills.getLevel((Skill)Skill.WOODCUTTING), lIIIlIlllI[24])) {
            int n4;
            int[] nArray = new int[lIIIlIlllI[1]];
            nArray[T.lIIIlIlllI[0]] = lIIIlIlllI[11];
            if (T.lllIllIlIIll(Inventory.getCount((int[])nArray))) {
                int[] nArray3 = new int[lIIIlIlllI[1]];
                nArray3[T.lIIIlIlllI[0]] = lIIIlIlllI[10];
                if (T.lllIllIlIIll(Inventory.getCount((int[])nArray3))) {
                    int[] nArray4 = new int[lIIIlIlllI[1]];
                    nArray4[T.lIIIlIlllI[0]] = lIIIlIlllI[9];
                    if (T.lllIllIlIIll(Inventory.getCount((int[])nArray4))) {
                        n4 = lIIIlIlllI[1];
                        0;
                        if (((0x5B ^ 0) & ~(0x30 ^ 0x6B)) == 0) return n4 != 0;
                        return false;
                    }
                }
            }
            n4 = lIIIlIlllI[0];
            return n4 != 0;
        }
        if (T.lllIllIlIlIl(Skills.getLevel((Skill)Skill.WOODCUTTING), lIIIlIlllI[13]) && T.lllIllIlIIIl(Skills.getLevel((Skill)Skill.WOODCUTTING), lIIIlIlllI[25])) {
            int n5;
            int[] nArray = new int[lIIIlIlllI[1]];
            nArray[T.lIIIlIlllI[0]] = lIIIlIlllI[11];
            if (T.lllIllIlIIll(Inventory.getCount((int[])nArray))) {
                int[] nArray5 = new int[lIIIlIlllI[1]];
                nArray5[T.lIIIlIlllI[0]] = lIIIlIlllI[10];
                if (T.lllIllIlIIll(Inventory.getCount((int[])nArray5))) {
                    int[] nArray6 = new int[lIIIlIlllI[1]];
                    nArray6[T.lIIIlIlllI[0]] = lIIIlIlllI[9];
                    if (T.lllIllIlIIll(Inventory.getCount((int[])nArray6))) {
                        int[] nArray7 = new int[lIIIlIlllI[1]];
                        nArray7[T.lIIIlIlllI[0]] = lIIIlIlllI[8];
                        if (T.lllIllIlIIll(Inventory.getCount((int[])nArray7))) {
                            n5 = lIIIlIlllI[1];
                            0;
                            if (((0xC9 ^ 0xC7 ^ (0x14 ^ 0x45)) & (8 ^ 0x55 ^ 2 ^ -1)) == ((5 ^ 0x62 ^ (0x64 ^ 0x63)) & (0x59 ^ 0x4A ^ (0x34 ^ 0x47) ^ -1))) return n5 != 0;
                            return ((0xE6 ^ 0x97 ^ (0x33 ^ 0x1C)) & (0xA8 ^ 0xC5 ^ (0x54 ^ 0x67) ^ -1)) != 0;
                        }
                    }
                }
            }
            n5 = lIIIlIlllI[0];
            return n5 != 0;
        }
        int[] nArray = new int[lIIIlIlllI[1]];
        nArray[T.lIIIlIlllI[0]] = lIIIlIlllI[11];
        if (T.lllIllIlIIll(Inventory.getCount((int[])nArray))) {
            int[] nArray8 = new int[lIIIlIlllI[1]];
            nArray8[T.lIIIlIlllI[0]] = lIIIlIlllI[10];
            if (T.lllIllIlIIll(Inventory.getCount((int[])nArray8))) {
                int[] nArray9 = new int[lIIIlIlllI[1]];
                nArray9[T.lIIIlIlllI[0]] = lIIIlIlllI[9];
                if (T.lllIllIlIIll(Inventory.getCount((int[])nArray9))) {
                    int[] nArray10 = new int[lIIIlIlllI[1]];
                    nArray10[T.lIIIlIlllI[0]] = lIIIlIlllI[8];
                    if (T.lllIllIlIIll(Inventory.getCount((int[])nArray10))) {
                        int[] nArray11 = new int[lIIIlIlllI[1]];
                        nArray11[T.lIIIlIlllI[0]] = lIIIlIlllI[7];
                        if (T.lllIllIlIIll(Inventory.getCount((int[])nArray11))) {
                            n2 = lIIIlIlllI[1];
                            0;
                            if (null == null) return n2 != 0;
                            return false;
                        }
                    }
                }
            }
        }
        n2 = lIIIlIlllI[0];
        return n2 != 0;
    }

    private static String lllIllIIlIll(String lIIllIIIIIlI, String lIIllIIIIIll) {
        try {
            SecretKeySpec lIIllIIIIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIIllIIIIIll.getBytes(StandardCharsets.UTF_8)), lIIIlIlllI[16]), "DES");
            Cipher lIIllIIIIllI = Cipher.getInstance("DES");
            lIIllIIIIllI.init(lIIIlIlllI[3], lIIllIIIIlll);
            return new String(lIIllIIIIllI.doFinal(Base64.getDecoder().decode(lIIllIIIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIIllIIIIlIl) {
            lIIllIIIIlIl.printStackTrace();
            return null;
        }
    }

    static {
        T.lllIllIIllll();
        T.lllIllIIllIl();
        jE = lIIIlIlllI[10];
        jB = lIIIlIlllI[7];
        jD = lIIIlIlllI[9];
        jF = lIIIlIlllI[11];
        jC = lIIIlIlllI[8];
        jG = new WorldArea(lIIIlIlllI[37], lIIIlIlllI[38], lIIIlIlllI[34], lIIIlIlllI[39], lIIIlIlllI[0]);
        jH = new WorldArea(lIIIlIlllI[40], lIIIlIlllI[41], lIIIlIlllI[22], lIIIlIlllI[34], lIIIlIlllI[0]);
        jI = new WorldPoint(lIIIlIlllI[42], lIIIlIlllI[43], lIIIlIlllI[0]);
        int[] nArray = new int[lIIIlIlllI[6]];
        nArray[T.lIIIlIlllI[0]] = lIIIlIlllI[44];
        nArray[T.lIIIlIlllI[1]] = lIIIlIlllI[45];
        nArray[T.lIIIlIlllI[3]] = lIIIlIlllI[46];
        nArray[T.lIIIlIlllI[4]] = lIIIlIlllI[47];
        jJ = nArray;
        int[] nArray2 = new int[lIIIlIlllI[1]];
        nArray2[T.lIIIlIlllI[0]] = lIIIlIlllI[48];
        jK = nArray2;
        int[] nArray3 = new int[lIIIlIlllI[4]];
        nArray3[T.lIIIlIlllI[0]] = lIIIlIlllI[49];
        nArray3[T.lIIIlIlllI[1]] = lIIIlIlllI[50];
        nArray3[T.lIIIlIlllI[3]] = lIIIlIlllI[51];
        js = nArray3;
        bv = new ArrayList<d>();
    }

    public static void ds() {
        block25: {
            BankLocation lIIllIIlIIII;
            block27: {
                block33: {
                    block29: {
                        block32: {
                            block31: {
                                block30: {
                                    block28: {
                                        block26: {
                                            if (T.lllIllIlIIII(bt ? 1 : 0)) {
                                                AccBuilderRogues.c = lIIIlIllIl[lIIIlIlllI[0]];
                                                b.a(bv);
                                                if (T.lllIllIlIIIl(bv.size(), lIIIlIlllI[1])) {
                                                    System.out.println(lIIIlIllIl[lIIIlIlllI[1]]);
                                                    bt = lIIIlIlllI[0];
                                                }
                                            }
                                            if (!T.lllIllIlIIlI(bt ? 1 : 0)) break block25;
                                            if (!T.lllIllIlIIII(T.ab() ? 1 : 0)) break block26;
                                            int[] nArray = new int[lIIIlIlllI[1]];
                                            nArray[T.lIIIlIlllI[0]] = lIIIlIlllI[2];
                                            if (!T.lllIllIlIIll(Inventory.getCount((int[])nArray))) break block27;
                                        }
                                        if (T.lllIllIlIlII(lIIllIIlIIII = BankLocation.getNearest()) && T.lllIllIlIIlI(lIIllIIlIIII.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                            AccBuilderRogues.c = lIIIlIllIl[lIIIlIlllI[3]];
                                            a.a(lIIllIIlIIII);
                                        }
                                        if (!T.lllIllIlIlII(lIIllIIlIIII) || !T.lllIllIlIIII(lIIllIIlIIII.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block27;
                                        if (T.lllIllIlIIlI(Bank.isOpen() ? 1 : 0)) {
                                            AccBuilderRogues.c = lIIIlIllIl[lIIIlIlllI[4]];
                                            a.a();
                                            Time.sleepUntil(() -> Bank.isOpen(), (int)lIIIlIlllI[5]);
                                            0;
                                        }
                                        if (!T.lllIllIlIIII(Bank.isOpen() ? 1 : 0)) break block27;
                                        AccBuilderRogues.c = lIIIlIllIl[lIIIlIlllI[6]];
                                        if (T.lllIllIlIIll(Inventory.getAll().size())) {
                                            Bank.depositInventory();
                                            Time.sleepTicks((int)lIIIlIlllI[6]);
                                            0;
                                        }
                                        if (T.lllIllIlIIll(Equipment.getAll().size())) {
                                            Bank.depositEquipment();
                                            Time.sleepTicks((int)lIIIlIlllI[3]);
                                            0;
                                        }
                                        int[] nArray = new int[lIIIlIlllI[1]];
                                        nArray[T.lIIIlIlllI[0]] = lIIIlIlllI[7];
                                        if (!T.lllIllIlIIlI(Bank.contains((int[])nArray) ? 1 : 0)) break block28;
                                        int[] nArray2 = new int[lIIIlIlllI[1]];
                                        nArray2[T.lIIIlIlllI[0]] = lIIIlIlllI[7];
                                        if (!T.lllIllIlIlIl(Inventory.getCount((int[])nArray2), lIIIlIlllI[1])) break block29;
                                    }
                                    int[] nArray = new int[lIIIlIlllI[1]];
                                    nArray[T.lIIIlIlllI[0]] = lIIIlIlllI[8];
                                    if (!T.lllIllIlIIlI(Bank.contains((int[])nArray) ? 1 : 0)) break block30;
                                    int[] nArray3 = new int[lIIIlIlllI[1]];
                                    nArray3[T.lIIIlIlllI[0]] = lIIIlIlllI[8];
                                    if (!T.lllIllIlIlIl(Inventory.getCount((int[])nArray3), lIIIlIlllI[1])) break block29;
                                }
                                int[] nArray = new int[lIIIlIlllI[1]];
                                nArray[T.lIIIlIlllI[0]] = lIIIlIlllI[9];
                                if (!T.lllIllIlIIlI(Bank.contains((int[])nArray) ? 1 : 0)) break block31;
                                int[] nArray4 = new int[lIIIlIlllI[1]];
                                nArray4[T.lIIIlIlllI[0]] = lIIIlIlllI[9];
                                if (!T.lllIllIlIlIl(Inventory.getCount((int[])nArray4), lIIIlIlllI[1])) break block29;
                            }
                            int[] nArray = new int[lIIIlIlllI[1]];
                            nArray[T.lIIIlIlllI[0]] = lIIIlIlllI[10];
                            if (!T.lllIllIlIIlI(Bank.contains((int[])nArray) ? 1 : 0)) break block32;
                            int[] nArray5 = new int[lIIIlIlllI[1]];
                            nArray5[T.lIIIlIlllI[0]] = lIIIlIlllI[10];
                            if (!T.lllIllIlIlIl(Inventory.getCount((int[])nArray5), lIIIlIlllI[1])) break block29;
                        }
                        int[] nArray = new int[lIIIlIlllI[1]];
                        nArray[T.lIIIlIlllI[0]] = lIIIlIlllI[11];
                        if (!T.lllIllIlIIlI(Bank.contains((int[])nArray) ? 1 : 0)) break block33;
                        int[] nArray6 = new int[lIIIlIlllI[1]];
                        nArray6[T.lIIIlIlllI[0]] = lIIIlIlllI[11];
                        if (!T.lllIllIlIIIl(Inventory.getCount((int[])nArray6), lIIIlIlllI[1])) break block33;
                    }
                    T.af();
                    System.out.println(lIIIlIllIl[lIIIlIlllI[12]]);
                    bt = lIIIlIlllI[1];
                    return;
                }
                int[] nArray = new int[lIIIlIlllI[1]];
                nArray[T.lIIIlIlllI[0]] = lIIIlIlllI[7];
                if (T.lllIllIlIIII(Bank.contains((int[])nArray) ? 1 : 0)) {
                    Bank.withdraw((int)lIIIlIlllI[7], (int)lIIIlIlllI[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                    Time.sleepTicks((int)lIIIlIlllI[3]);
                    0;
                    Time.sleepUntil(() -> {
                        boolean bl;
                        int[] nArray = new int[lIIIlIlllI[1]];
                        nArray[T.lIIIlIlllI[0]] = lIIIlIlllI[7];
                        if (T.lllIllIlIIll(Inventory.getCount((int[])nArray))) {
                            bl = lIIIlIlllI[1];
                            0;
                            if (-2 >= 0) {
                                return false;
                            }
                        } else {
                            bl = lIIIlIlllI[0];
                        }
                        return bl;
                    }, (int)lIIIlIlllI[5]);
                    0;
                }
                int[] nArray7 = new int[lIIIlIlllI[1]];
                nArray7[T.lIIIlIlllI[0]] = lIIIlIlllI[8];
                if (T.lllIllIlIIII(Bank.contains((int[])nArray7) ? 1 : 0)) {
                    Bank.withdraw((int)lIIIlIlllI[8], (int)lIIIlIlllI[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                    Time.sleepTicks((int)lIIIlIlllI[3]);
                    0;
                    Time.sleepUntil(() -> {
                        boolean bl;
                        int[] nArray = new int[lIIIlIlllI[1]];
                        nArray[T.lIIIlIlllI[0]] = lIIIlIlllI[8];
                        if (T.lllIllIlIIll(Inventory.getCount((int[])nArray))) {
                            bl = lIIIlIlllI[1];
                            0;
                            if ((0x6C ^ 0x46 ^ (0x69 ^ 0x47)) > (0xD8 ^ 0xAD ^ (0x35 ^ 0x44))) {
                                return ((0x3A ^ 0x16 ^ (0xC7 ^ 0xB3)) & (0xB8 ^ 0x8B ^ (0xC4 ^ 0xAF) ^ -1)) != 0;
                            }
                        } else {
                            bl = lIIIlIlllI[0];
                        }
                        return bl;
                    }, (int)lIIIlIlllI[5]);
                    0;
                }
                int[] nArray8 = new int[lIIIlIlllI[1]];
                nArray8[T.lIIIlIlllI[0]] = lIIIlIlllI[9];
                if (T.lllIllIlIIII(Bank.contains((int[])nArray8) ? 1 : 0)) {
                    Bank.withdraw((int)lIIIlIlllI[9], (int)lIIIlIlllI[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                    Time.sleepTicks((int)lIIIlIlllI[3]);
                    0;
                    Time.sleepUntil(() -> {
                        boolean bl;
                        int[] nArray = new int[lIIIlIlllI[1]];
                        nArray[T.lIIIlIlllI[0]] = lIIIlIlllI[9];
                        if (T.lllIllIlIIll(Inventory.getCount((int[])nArray))) {
                            bl = lIIIlIlllI[1];
                            0;
                            if (2 <= ((0x86 ^ 0x90) & ~(0xB ^ 0x1D))) {
                                return false;
                            }
                        } else {
                            bl = lIIIlIlllI[0];
                        }
                        return bl;
                    }, (int)lIIIlIlllI[5]);
                    0;
                }
                int[] nArray9 = new int[lIIIlIlllI[1]];
                nArray9[T.lIIIlIlllI[0]] = lIIIlIlllI[10];
                if (T.lllIllIlIIII(Bank.contains((int[])nArray9) ? 1 : 0)) {
                    Bank.withdraw((int)lIIIlIlllI[10], (int)lIIIlIlllI[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                    Time.sleepTicks((int)lIIIlIlllI[3]);
                    0;
                    Time.sleepUntil(() -> {
                        boolean bl;
                        int[] nArray = new int[lIIIlIlllI[1]];
                        nArray[T.lIIIlIlllI[0]] = lIIIlIlllI[10];
                        if (T.lllIllIlIIll(Inventory.getCount((int[])nArray))) {
                            bl = lIIIlIlllI[1];
                            0;
                            if (1 <= 0) {
                                return ((0xA ^ 0x54 ^ (0xEA ^ 0x91)) & (0xB3 ^ 0xA8 ^ (0xFB ^ 0xC5) ^ -1)) != 0;
                            }
                        } else {
                            bl = lIIIlIlllI[0];
                        }
                        return bl;
                    }, (int)lIIIlIlllI[5]);
                    0;
                }
                int[] nArray10 = new int[lIIIlIlllI[1]];
                nArray10[T.lIIIlIlllI[0]] = lIIIlIlllI[11];
                if (T.lllIllIlIIII(Bank.contains((int[])nArray10) ? 1 : 0)) {
                    Bank.withdraw((int)lIIIlIlllI[11], (int)lIIIlIlllI[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                    Time.sleepTicks((int)lIIIlIlllI[3]);
                    0;
                    Time.sleepUntil(() -> {
                        boolean bl;
                        int[] nArray = new int[lIIIlIlllI[1]];
                        nArray[T.lIIIlIlllI[0]] = lIIIlIlllI[11];
                        if (T.lllIllIlIIll(Inventory.getCount((int[])nArray))) {
                            bl = lIIIlIlllI[1];
                            0;
                            if (-1 != -1) {
                                return ((158 + 86 - 224 + 214 ^ 91 + 115 - 129 + 84) & (0xDB ^ 0xB1 ^ (8 ^ 0x29) ^ -1)) != 0;
                            }
                        } else {
                            bl = lIIIlIlllI[0];
                        }
                        return bl;
                    }, (int)lIIIlIlllI[5]);
                    0;
                }
            }
            if (T.lllIllIlIIII(T.ab() ? 1 : 0)) {
                if (T.lllIllIlIIII(Inventory.isFull() ? 1 : 0)) {
                    AccBuilderRogues.c = lIIIlIllIl[lIIIlIlllI[13]];
                    System.out.println(lIIIlIllIl[lIIIlIlllI[14]]);
                    Inventory.getAll((int[])js).stream().forEach(Item::drop);
                }
                if (T.lllIllIlIIlI(Inventory.isFull() ? 1 : 0)) {
                    if (T.lllIllIlIIIl(Skills.getLevel((Skill)Skill.WOODCUTTING), lIIIlIlllI[15])) {
                        if (T.lllIllIlIIlI(jG.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderRogues.c = lIIIlIllIl[lIIIlIlllI[16]];
                            Movement.walkTo((WorldPoint)jG.toWorldPoint());
                            0;
                            Time.sleepTicks((int)lIIIlIlllI[6]);
                            0;
                        }
                        if (T.lllIllIlIIII(jG.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderRogues.c = lIIIlIllIl[lIIIlIlllI[17]];
                            lIIllIIlIIII = TileObjects.getNearest((WorldPoint)Players.getLocal().getWorldLocation(), (int[])jJ);
                            if (T.lllIllIlIIlI(Players.getLocal().isAnimating() ? 1 : 0) && T.lllIllIlIIlI(Players.getLocal().isMoving() ? 1 : 0) && T.lllIllIlIlII(lIIllIIlIIII)) {
                                System.out.println(lIIIlIllIl[lIIIlIlllI[18]]);
                                lIIllIIlIIII.interact(lIIIlIllIl[lIIIlIlllI[19]]);
                                Time.sleepTicks((int)lIIIlIlllI[4]);
                                0;
                            }
                        }
                    }
                    if (T.lllIllIlIlIl(Skills.getLevel((Skill)Skill.WOODCUTTING), lIIIlIlllI[15])) {
                        if (T.lllIllIlIIlI(jH.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderRogues.c = lIIIlIllIl[lIIIlIlllI[20]];
                            Movement.walkTo((WorldPoint)jI);
                            0;
                            Time.sleepTicks((int)lIIIlIlllI[6]);
                            0;
                        }
                        if (T.lllIllIlIIII(jH.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderRogues.c = lIIIlIllIl[lIIIlIlllI[21]];
                            lIIllIIlIIII = TileObjects.getNearest((WorldPoint)Players.getLocal().getWorldLocation(), (int[])jK);
                            if (T.lllIllIlIIlI(Players.getLocal().isAnimating() ? 1 : 0) && T.lllIllIlIIlI(Players.getLocal().isMoving() ? 1 : 0) && T.lllIllIlIlII(lIIllIIlIIII)) {
                                System.out.println(lIIIlIllIl[lIIIlIlllI[22]]);
                                lIIllIIlIIII.interact(lIIIlIllIl[lIIIlIlllI[15]]);
                                Time.sleepTicks((int)lIIIlIlllI[4]);
                                0;
                            }
                        }
                    }
                }
            }
        }
    }

    private static void lllIllIIllll() {
        lIIIlIlllI = new int[53];
        T.lIIIlIlllI[0] = (0x56 ^ 0x66 ^ (0x37 ^ 0x3D)) & (38 + 123 - 121 + 110 ^ 132 + 62 - 128 + 106 ^ -1);
        T.lIIIlIlllI[1] = 1;
        T.lIIIlIlllI[2] = -(0xFFFFEBD9 & 0x5C2F) & (0xFFFFDFFB & 0x6BEF);
        T.lIIIlIlllI[3] = 2;
        T.lIIIlIlllI[4] = 3;
        T.lIIIlIlllI[5] = -(0xFFFFE95C & 0x36E7) & (0xFFFFB7EF & 0x7BDB);
        T.lIIIlIlllI[6] = 0x18 ^ 0x1C;
        T.lIIIlIlllI[7] = -(0xFFFFFE69 & 0x3BBF) & (0xFFFFBFFF & 0x7F6F);
        T.lIIIlIlllI[8] = 0xFFFFF57F & 0xFC9;
        T.lIIIlIlllI[9] = -(0xFFFFFBB5 & 0x4C6F) & (0xFFFFEDEF & 0x5F7F);
        T.lIIIlIlllI[10] = 0xFFFFEFEF & 0x155D;
        T.lIIIlIlllI[11] = -(0xFFFFFFDF & 0x52A1) & (0xFFFFD7DF & 0x7FEF);
        T.lIIIlIlllI[12] = 0x83 ^ 0x86;
        T.lIIIlIlllI[13] = 0x5E ^ 0x58;
        T.lIIIlIlllI[14] = 0x43 ^ 0x44;
        T.lIIIlIlllI[15] = 1 ^ 0xE;
        T.lIIIlIlllI[16] = 0x44 ^ 0x62 ^ (0x31 ^ 0x1F);
        T.lIIIlIlllI[17] = 0x98 ^ 0x91;
        T.lIIIlIlllI[18] = 0x94 ^ 0x9C ^ 2;
        T.lIIIlIlllI[19] = 0x34 ^ 0x3F;
        T.lIIIlIlllI[20] = 0x1A ^ 0x28 ^ (0xFD ^ 0xC3);
        T.lIIIlIlllI[21] = 30 + 69 - 81 + 145 ^ 30 + 150 - 34 + 28;
        T.lIIIlIlllI[22] = 0x8C ^ 0xA9 ^ (0x5F ^ 0x74);
        T.lIIIlIlllI[23] = 0x1D ^ 0x40 ^ (0xDE ^ 0xAA);
        T.lIIIlIlllI[24] = 72 + 112 - 41 + 12 ^ 115 + 34 - 35 + 18;
        T.lIIIlIlllI[25] = 0x1A ^ 0xF;
        T.lIIIlIlllI[26] = 0xFFFFE33B & 0x3FEC;
        T.lIIIlIlllI[27] = 0xFFFFAFFE & 0x7EE1;
        T.lIIIlIlllI[28] = -(0xFFFFF75F & 0x1AE7) & (0xFFFFF3FE & 0x7FEF);
        T.lIIIlIlllI[29] = 0xFFFFEEED & 0x3FDE;
        T.lIIIlIlllI[30] = -(0xFFFFDC39 & 0x63FF) & (0xFFFFFFFF & 0x5F7F);
        T.lIIIlIlllI[31] = 0xA0 ^ 0x88;
        T.lIIIlIlllI[32] = -(0xFFFFBDDF & 0x7A33) & (0xFFFFBFB7 & 0x7BDE);
        T.lIIIlIlllI[33] = 181 + 15 - 151 + 176 ^ 116 + 67 - 24 + 26;
        T.lIIIlIlllI[34] = 0xBC ^ 0xAC;
        T.lIIIlIlllI[35] = 0x18 ^ 0x7B;
        T.lIIIlIlllI[36] = 0x39 ^ 2 ^ (0x22 ^ 8);
        T.lIIIlIlllI[37] = 0xFFFFEC5F & 0x1FF5;
        T.lIIIlIlllI[38] = -(0xFFFFFA9F & 0x7561) & (0xFFFFFF3E & 0x7DEF);
        T.lIIIlIlllI[39] = 0x84 ^ 0x8E ^ (0x1E ^ 0x39);
        T.lIIIlIlllI[40] = 0xFFFF8DFE & 0x7E7F;
        T.lIIIlIlllI[41] = 0xFFFF9FB5 & 0x6D6B;
        T.lIIIlIlllI[42] = 0xFFFFBF87 & 0x4CFC;
        T.lIIIlIlllI[43] = 0xFFFF9DB5 & 0x6F6F;
        T.lIIIlIlllI[44] = 0xFFFFF6FC & 0xDFF;
        T.lIIIlIlllI[45] = 0xFFFFDCFF & 0x27FE;
        T.lIIIlIlllI[46] = 0xFFFF8DBE & 0x7743;
        T.lIIIlIlllI[47] = -(0xFFFFB3FF & 0x7EBA) & (0xFFFFBFFF & 0x77BF);
        T.lIIIlIlllI[48] = 0xFFFFEA5D & 0x3FE6;
        T.lIIIlIlllI[49] = 0xFFFF95F7 & 0x6FEF;
        T.lIIIlIlllI[50] = -(0xFFFFFF5F & 0x5AAF) & (0xFFFFDFFF & Short.MAX_VALUE);
        T.lIIIlIlllI[51] = 0xFFFFAFFF & 0x55EF;
        T.lIIIlIlllI[52] = 0xD7 ^ 0xC5;
    }

    private static boolean lllIllIlIlIl(int n2, int n3) {
        return n2 >= n3;
    }
}

