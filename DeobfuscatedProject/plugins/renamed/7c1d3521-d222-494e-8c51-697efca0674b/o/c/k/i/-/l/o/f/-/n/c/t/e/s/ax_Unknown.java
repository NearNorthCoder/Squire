/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Skill
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
 *  net.unethicalite.api.widgets.Dialog
 *  net.unethicalite.api.widgets.Production
 */
package o.c.k.i.-.l.o.f.-.n.c.t.e.s;

import gg.squire.account.AccBuilderSotf;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Skill;
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
import net.unethicalite.api.widgets.Production;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.a_Unknown;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.ac_Unknown;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.b_Unknown;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.d;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.f_Unknown;

public class ax_Unknown
implements ac {
    private static /* synthetic */ int[] llIllllIII;
    public static final /* synthetic */ int oC;
    public static final /* synthetic */ int oB;
    public static final /* synthetic */ WorldPoint oF;
    public static /* synthetic */ List<d> bv;
    private static /* synthetic */ String[] llIlllIlll;
    public static /* synthetic */ boolean bt;
    public static final /* synthetic */ int oD;
    public static final /* synthetic */ WorldPoint oE;

    private static void lIlllIlIIlllI() {
        llIllllIII = new int[42];
        ax.llIllllIII[0] = (0xBF ^ 0x86) & ~(0xAA ^ 0x93);
        ax.llIllllIII[1] = 1;
        ax.llIllllIII[2] = 2;
        ax.llIllllIII[3] = 3;
        ax.llIllllIII[4] = -(0xFFFFECED & 0x3B76) & (0xFFFFBFEB & 0x7BFF);
        ax.llIllllIII[5] = 0x99 ^ 0x96;
        ax.llIllllIII[6] = 0xFFFFC73D & 0x39FF;
        ax.llIllllIII[7] = 0x17 ^ 0x13;
        ax.llIllllIII[8] = 0x1E ^ 0;
        ax.llIllllIII[9] = 0xFFFFD5EF & 0x2B5F;
        ax.llIllllIII[10] = 0x53 ^ 0x47 ^ (0xA9 ^ 0xB8);
        ax.llIllllIII[11] = 0xFFFFA9E7 & 0x577F;
        ax.llIllllIII[12] = 1 ^ 0x63 ^ (0x35 ^ 0x51);
        ax.llIllllIII[13] = -(0xFFFFD5B4 & 0x7A4F) & (0xFFFFDBFF & 0x7DFB);
        ax.llIllllIII[14] = 54 + 89 - 107 + 99 ^ 84 + 59 - -15 + 0;
        ax.llIllllIII[15] = 0x57 ^ 0x2C ^ (0x38 ^ 0x44);
        ax.llIllllIII[16] = 0xAA ^ 0x84 ^ (0xAE ^ 0x88);
        ax.llIllllIII[17] = 0x43 ^ 0x4A;
        ax.llIllllIII[18] = 0x42 ^ 0x68 ^ (0xBD ^ 0x9D);
        ax.llIllllIII[19] = 0xB4 ^ 0xC1 ^ (0x66 ^ 0x18);
        ax.llIllllIII[20] = 0xF9 ^ 0xA3 ^ (0xD9 ^ 0x8F);
        ax.llIllllIII[21] = 0xFFFFFDF9 & 0xFFEE;
        ax.llIllllIII[22] = 128 + 138 - 129 + 51 + (0x65 ^ 0x41) - (0x6A ^ 0x74) + (0xB1 ^ 0x89);
        ax.llIllllIII[23] = 0xFFFFF3BC & 0xD6F;
        ax.llIllllIII[24] = 0xFFFFEBFF & 0x15F4;
        ax.llIllllIII[25] = 116 + 4 - -14 + 4 + (14 + 46 - -57 + 24) - (0xD9 ^ 0xB2) + (0x7F ^ 0x63);
        ax.llIllllIII[26] = 0xB1 ^ 0xA5;
        ax.llIllllIII[27] = 0xFFFFBFD4 & 0x47FB;
        ax.llIllllIII[28] = -(0xFFFF9157 & 0x6FB9) & (0xFFFFAFFE & 0x7FDD);
        ax.llIllllIII[29] = 0xFFFFF3FE & 0x6DA9;
        ax.llIllllIII[30] = -(0xFFFFBBFF & 0x64B9) & (0xFFFFFFFF & 0x3FFF);
        ax.llIllllIII[31] = 0 ^ 0x28;
        ax.llIllllIII[32] = 0xFFFF97B6 & 0x6BCD;
        ax.llIllllIII[33] = 0x1D ^ 0x26 ^ (0xEB ^ 0xB4);
        ax.llIllllIII[34] = 0x78 ^ 0x75;
        ax.llIllllIII[35] = 0x19 ^ 0x10 ^ (0xC5 ^ 0xAF);
        ax.llIllllIII[36] = 39 + 51 - -15 + 55 ^ 34 + 42 - -46 + 52;
        ax.llIllllIII[37] = 0xFFFFCDC7 & 0x3EFD;
        ax.llIllllIII[38] = 0xFFFFFE62 & 0xDFD;
        ax.llIllllIII[39] = -(0xFFFFBE33 & 0x73FD) & (0xFFFFBEFC & 0x7FFB);
        ax.llIllllIII[40] = -(0xFFFFBED7 & 0x633B) & (0xFFFFFE7E & 0x2FFF);
        ax.llIllllIII[41] = 67 + 37 - -4 + 49 ^ 54 + 3 - 26 + 110;
    }

    private static boolean an() {
        boolean bl;
        if (ax.lIlllIlIlIlII(Skills.getLevel((Skill)Skill.COOKING), llIllllIII[8])) {
            boolean bl2;
            int[] nArray = new int[llIllllIII[1]];
            nArray[ax.llIllllIII[0]] = llIllllIII[11];
            if (ax.lIlllIlIlIIll(Inventory.getCount((int[])nArray))) {
                bl2 = llIllllIII[1];
                0;
                if (3 <= 0) {
                    return ((136 + 14 - 47 + 150 ^ 70 + 17 - -80 + 22) & (0x5A ^ 0x1D ^ (0xA1 ^ 0xA6) ^ -1)) != 0;
                }
            } else {
                bl2 = llIllllIII[0];
            }
            return bl2;
        }
        if (ax.lIlllIlIlIlII(Skills.getLevel((Skill)Skill.COOKING), llIllllIII[5]) && ax.lIlllIlIlIIII(Skills.getLevel((Skill)Skill.COOKING), llIllllIII[8])) {
            boolean bl3;
            int[] nArray = new int[llIllllIII[1]];
            nArray[ax.llIllllIII[0]] = llIllllIII[9];
            if (ax.lIlllIlIlIIll(Inventory.getCount((int[])nArray))) {
                bl3 = llIllllIII[1];
                0;
                if (-2 > 0) {
                    return false;
                }
            } else {
                bl3 = llIllllIII[0];
            }
            return bl3;
        }
        int[] nArray = new int[llIllllIII[1]];
        nArray[ax.llIllllIII[0]] = llIllllIII[6];
        if (ax.lIlllIlIlIIll(Inventory.getCount((int[])nArray))) {
            bl = llIllllIII[1];
            0;
            if (((0x3F ^ 0x23) & ~(0x59 ^ 0x45) & ~((0x6C ^ 0x2D) & ~(0xC0 ^ 0x81))) >= 1) {
                return false;
            }
        } else {
            bl = llIllllIII[0];
        }
        return bl;
    }

    private static boolean lIlllIlIlIIII(int n2, int n3) {
        return n2 < n3;
    }

    @Override
    public boolean ae() {
        return llIllllIII[0];
    }

    private static void lIlllIlIIllIl() {
        llIlllIlll = new String[llIllllIII[41]];
        ax.llIlllIlll[ax.llIllllIII[0]] = ax."Buying items";
        ax.llIlllIlll[ax.llIllllIII[1]] = ax."Finished buying items, switching back to cooking";
        ax.llIlllIlll[ax.llIllllIII[2]] = ax."Navigating to bank";
        ax.llIlllIlll[ax.llIllllIII[3]] = ax."Handling banking";
        ax.llIlllIlll[ax.llIllllIII[7]] = ax."We are missing supplies, switching to BUYING";
        ax.llIlllIlll[ax.llIllllIII[10]] = ax."We are missing supplies, switching to BUYING";
        ax.llIlllIlll[ax.llIllllIII[12]] = ax."We are missing supplies, switching to BUYING";
        ax.llIlllIlll[ax.llIllllIII[15]] = ax."Equiping duel";
        ax.llIlllIlll[ax.llIllllIII[16]] = ax."Wear";
        ax.llIlllIlll[ax.llIllllIII[17]] = ax."Navigate to range";
        ax.llIlllIlll[ax.llIllllIII[18]] = ax."Cooking";
        ax.llIlllIlll[ax.llIllllIII[19]] = ax."Range";
        ax.llIlllIlll[ax.llIllllIII[20]] = ax."Cook";
        ax.llIlllIlll[ax.llIllllIII[34]] = ax."Cooking";
        ax.llIlllIlll[ax.llIllllIII[36]] = ax."ring of wealth (";
        ax.llIlllIlll[ax.llIllllIII[5]] = ax."ring of dueling(";
    }

    private static void Q() {
        d var1;
        Object var14;
        Object var10;
        if (ax.lIlllIlIlIIII(Skills.getLevel((Skill)Skill.COOKING), llIllllIII[5])) {
            d d2 = new d(llIllllIII[6], llIllllIII[22], llIllllIII[23]);
            bv.add(d2);
            0;
        }
        if (ax.lIlllIlIlIlII(Skills.getLevel((Skill)Skill.COOKING), llIllllIII[5]) && ax.lIlllIlIlIIII(Skills.getLevel((Skill)Skill.COOKING), llIllllIII[8])) {
            var10 = new d(llIllllIII[9], llIllllIII[24], llIllllIII[25]);
            bv.add((d)var10);
            0;
        }
        if (ax.lIlllIlIlIlII(Skills.getLevel((Skill)Skill.COOKING), llIllllIII[8])) {
            var10 = new d(llIllllIII[11], llIllllIII[24], llIllllIII[25]);
            bv.add((d)var10);
            0;
        }
        if (ax.lIlllIlIlIIIl(Bank.contains(var10 = item -> item.getName().toLowerCase().contains(llIlllIlll[llIllllIII[5]])) ? 1 : 0)) {
            var14 = new d(llIllllIII[13], llIllllIII[26], llIllllIII[27]);
            bv.add((d)var14);
            0;
        }
        if (ax.lIlllIlIlIIIl(Bank.contains(var14 = item -> item.getName().toLowerCase().contains(llIlllIlll[llIllllIII[36]])) ? 1 : 0)) {
            var1 = new d(llIllllIII[28], llIllllIII[10], llIllllIII[29]);
            bv.add(var1);
            0;
        }
        int[] nArray = new int[llIllllIII[1]];
        nArray[ax.llIllllIII[0]] = llIllllIII[30];
        if (ax.lIlllIlIlIIIl(Bank.contains((int[])nArray) ? 1 : 0)) {
            var1 = new d(llIllllIII[30], llIllllIII[31], llIllllIII[32]);
            bv.add(var1);
            0;
        }
    }

    private static boolean lIlllIlIlIIIl(int n2) {
        return n2 == 0;
    }

    private static String lIlllIlIIlIll(String var9, String var20) {
        var9 = new String(Base64.getDecoder().decode(var9.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var7 = new StringBuilder();
        char[] var11 = var20.toCharArray();
        int var17 = llIllllIII[0];
        char[] var15 = var9.toCharArray();
        int var12 = var15.length;
        int var4 = llIllllIII[0];
        while (ax.lIlllIlIlIIII(var4, var12)) {
            char var8 = var15[var4];
            var7.append((char)(var8 ^ var11[var17 % var11.length]));
            0;
            ++var17;
            ++var4;
            0;
            if (((0x78 ^ 0x3E) & ~(0xDE ^ 0x98)) == 0) continue;
            return null;
        }
        return String.valueOf(var7);
    }

    static {
        ax.lIlllIlIIlllI();
        ax.lIlllIlIIllIl();
        oD = llIllllIII[11];
        oC = llIllllIII[9];
        oB = llIllllIII[6];
        oE = new WorldPoint(llIllllIII[37], llIllllIII[38], llIllllIII[0]);
        oF = new WorldPoint(llIllllIII[39], llIllllIII[40], llIllllIII[0]);
        bv = new ArrayList<d>();
    }

    @Override
    public int af() {
        ax.gz();
        return llIllllIII[33];
    }

    private static boolean lIlllIlIIllll(int n2) {
        return n2 != 0;
    }

    @Override
    public boolean ah() {
        boolean bl;
        if (ax.lIlllIlIlIlII(Skills.getLevel((Skill)Skill.COOKING), llIllllIII[35])) {
            bl = llIllllIII[1];
            0;
            
            }
        } else {
            bl = llIllllIII[0];
        }
        return bl;
    }

    private static boolean lIlllIlIlIIlI(Object object) {
        return object != null;
    }

    private static String lIlllIlIIllII(String var22, String var19) {
        try {
            SecretKeySpec var18 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var19.getBytes(StandardCharsets.UTF_8)), llIllllIII[16]), "DES");
            Cipher var6 = Cipher.getInstance("DES");
            var6.init(llIllllIII[2], var18);
            return new String(var6.doFinal(Base64.getDecoder().decode(var22.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var23) {
            var23.printStackTrace();
            return null;
        }
    }

    private static boolean lIlllIlIlIIll(int n2) {
        return n2 > 0;
    }

    private static boolean lIlllIlIlIlIl(int n2, int n3) {
        return n2 > n3;
    }

    @Override
    public String ag() {
        return llIlllIlll[llIllllIII[34]];
    }

    private static boolean lIlllIlIlIllI(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean lIlllIlIlIlII(int n2, int n3) {
        return n2 >= n3;
    }

    private static String lIlllIlIIlIlI(String var16, String var21) {
        try {
            SecretKeySpec var2 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var21.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var3 = Cipher.getInstance("Blowfish");
            var3.init(llIllllIII[2], var2);
            return new String(var3.doFinal(Base64.getDecoder().decode(var16.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var5) {
            var5.printStackTrace();
            return null;
        }
    }

    public static void gz() {
        if (ax.lIlllIlIIllll(bt ? 1 : 0)) {
            AccBuilderSotf.c = llIlllIlll[llIllllIII[0]];
            b.a(bv);
            if (ax.lIlllIlIlIIII(bv.size(), llIllllIII[1])) {
                System.out.println(llIlllIlll[llIllllIII[1]]);
                bt = llIllllIII[0];
            }
        }
        if (ax.lIlllIlIlIIIl(bt ? 1 : 0)) {
            BankLocation var13;
            if (ax.lIlllIlIlIIIl(ax.an() ? 1 : 0)) {
                var13 = BankLocation.getNearest();
                if (ax.lIlllIlIlIIlI(var13) && ax.lIlllIlIlIIIl(var13.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderSotf.c = llIlllIlll[llIllllIII[2]];
                    a.a(var13);
                }
                if (ax.lIlllIlIlIIlI(var13) && ax.lIlllIlIIllll(var13.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderSotf.c = llIlllIlll[llIllllIII[3]];
                    if (ax.lIlllIlIlIIIl(Bank.isOpen() ? 1 : 0)) {
                        a.a();
                        Time.sleepUntil(() -> Bank.isOpen(), (int)llIllllIII[4]);
                        0;
                    }
                    if (ax.lIlllIlIIllll(Bank.isOpen() ? 1 : 0)) {
                        if (ax.lIlllIlIlIIll(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks((int)llIllllIII[1]);
                            0;
                        }
                        if (ax.lIlllIlIlIIll(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks((int)llIllllIII[2]);
                            0;
                        }
                    }
                    if (ax.lIlllIlIlIIII(Skills.getLevel((Skill)Skill.COOKING), llIllllIII[5])) {
                        int[] nArray = new int[llIllllIII[1]];
                        nArray[ax.llIllllIII[0]] = llIllllIII[6];
                        if (ax.lIlllIlIlIIIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                            ax.Q();
                            System.out.println(llIlllIlll[llIllllIII[7]]);
                            bt = llIllllIII[1];
                            return;
                        }
                    }
                    if (ax.lIlllIlIlIlII(Skills.getLevel((Skill)Skill.COOKING), llIllllIII[5]) && ax.lIlllIlIlIIII(Skills.getLevel((Skill)Skill.COOKING), llIllllIII[8])) {
                        int[] nArray = new int[llIllllIII[1]];
                        nArray[ax.llIllllIII[0]] = llIllllIII[9];
                        if (ax.lIlllIlIlIIIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                            ax.Q();
                            System.out.println(llIlllIlll[llIllllIII[10]]);
                            bt = llIllllIII[1];
                            return;
                        }
                    }
                    if (ax.lIlllIlIlIlII(Skills.getLevel((Skill)Skill.COOKING), llIllllIII[8])) {
                        int[] nArray = new int[llIllllIII[1]];
                        nArray[ax.llIllllIII[0]] = llIllllIII[11];
                        if (ax.lIlllIlIlIIIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                            ax.Q();
                            System.out.println(llIlllIlll[llIllllIII[12]]);
                            bt = llIllllIII[1];
                            return;
                        }
                    }
                    int[] nArray = new int[llIllllIII[1]];
                    nArray[ax.llIllllIII[0]] = llIllllIII[13];
                    if (ax.lIlllIlIlIIIl(Equipment.contains((int[])nArray) ? 1 : 0) && ax.lIlllIlIlIlIl(Players.getLocal().getWorldLocation().distanceTo(oF), llIllllIII[14])) {
                        a.b(f.aS, llIllllIII[1]);
                        Time.sleepTicks((int)llIllllIII[1]);
                        0;
                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[llIllllIII[1]];
                            nArray[ax.llIllllIII[0]] = llIllllIII[13];
                            if (ax.lIlllIlIlIIll(Inventory.getCount((int[])nArray))) {
                                bl = llIllllIII[1];
                                0;
                                if (((0xD2 ^ 0x80) & ~(0xF8 ^ 0xAA)) != ((0xFA ^ 0xB5) & ~(0xF2 ^ 0xBD))) {
                                    return false;
                                }
                            } else {
                                bl = llIllllIII[0];
                            }
                            return bl;
                        }, (int)llIllllIII[4]);
                        0;
                    }
                    if (ax.lIlllIlIlIIII(Skills.getLevel((Skill)Skill.COOKING), llIllllIII[5])) {
                        Bank.withdrawAll((int)llIllllIII[6], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)llIllllIII[1]);
                        0;
                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[llIllllIII[1]];
                            nArray[ax.llIllllIII[0]] = llIllllIII[6];
                            if (ax.lIlllIlIlIIll(Inventory.getCount((int[])nArray))) {
                                bl = llIllllIII[1];
                                0;
                                if (3 < 2) {
                                    return false;
                                }
                            } else {
                                bl = llIllllIII[0];
                            }
                            return bl;
                        }, (int)llIllllIII[4]);
                        0;
                    }
                    if (ax.lIlllIlIlIlII(Skills.getLevel((Skill)Skill.COOKING), llIllllIII[5]) && ax.lIlllIlIlIIII(Skills.getLevel((Skill)Skill.COOKING), llIllllIII[8])) {
                        Bank.withdrawAll((int)llIllllIII[9], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)llIllllIII[1]);
                        0;
                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[llIllllIII[1]];
                            nArray[ax.llIllllIII[0]] = llIllllIII[9];
                            if (ax.lIlllIlIlIIll(Inventory.getCount((int[])nArray))) {
                                bl = llIllllIII[1];
                                0;
                                if (-1 >= 2) {
                                    return false;
                                }
                            } else {
                                bl = llIllllIII[0];
                            }
                            return bl;
                        }, (int)llIllllIII[4]);
                        0;
                    }
                    if (ax.lIlllIlIlIlII(Skills.getLevel((Skill)Skill.COOKING), llIllllIII[8])) {
                        Bank.withdrawAll((int)llIllllIII[11], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)llIllllIII[1]);
                        0;
                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[llIllllIII[1]];
                            nArray[ax.llIllllIII[0]] = llIllllIII[11];
                            if (ax.lIlllIlIlIIll(Inventory.getCount((int[])nArray))) {
                                bl = llIllllIII[1];
                                0;
                                if (2 <= 0) {
                                    return ((0xAC ^ 0x8A ^ (0x22 ^ 0x1A)) & (0xB7 ^ 0x85 ^ (0x9B ^ 0xB7) ^ -1)) != 0;
                                }
                            } else {
                                bl = llIllllIII[0];
                            }
                            return bl;
                        }, (int)llIllllIII[4]);
                        0;
                    }
                }
            }
            if (ax.lIlllIlIIllll(ax.an() ? 1 : 0)) {
                int[] nArray = new int[llIllllIII[1]];
                nArray[ax.llIllllIII[0]] = llIllllIII[13];
                if (ax.lIlllIlIIllll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    int[] nArray2 = new int[llIllllIII[1]];
                    nArray2[ax.llIllllIII[0]] = llIllllIII[13];
                    if (ax.lIlllIlIlIIIl(Equipment.contains((int[])nArray2) ? 1 : 0)) {
                        AccBuilderSotf.c = llIlllIlll[llIllllIII[15]];
                        int[] nArray3 = new int[llIllllIII[1]];
                        nArray3[ax.llIllllIII[0]] = llIllllIII[13];
                        var13 = Inventory.getFirst((int[])nArray3);
                        if (ax.lIlllIlIlIIlI(var13)) {
                            var13.interact(llIlllIlll[llIllllIII[16]]);
                            Time.sleepTicks((int)llIllllIII[3]);
                            0;
                        }
                    }
                }
                if (ax.lIlllIlIlIlIl(Players.getLocal().getWorldLocation().distanceTo(oF), llIllllIII[10])) {
                    AccBuilderSotf.c = llIlllIlll[llIllllIII[17]];
                    Movement.walkTo((WorldPoint)oF);
                    0;
                    Time.sleepTicks((int)llIllllIII[7]);
                    0;
                }
                if (ax.lIlllIlIlIllI(Players.getLocal().getWorldLocation().distanceTo(oF), llIllllIII[10])) {
                    AccBuilderSotf.c = llIlllIlll[llIllllIII[18]];
                    String[] stringArray = new String[llIllllIII[1]];
                    stringArray[ax.llIllllIII[0]] = llIlllIlll[llIllllIII[19]];
                    var13 = TileObjects.getNearest((WorldPoint)Players.getLocal().getWorldLocation(), (String[])stringArray);
                    if (ax.lIlllIlIlIIlI(var13)) {
                        if (ax.lIlllIlIlIIIl(Production.isOpen() ? 1 : 0)) {
                            var13.interact(llIlllIlll[llIllllIII[20]]);
                            Time.sleepTicks((int)llIllllIII[2]);
                            0;
                            Time.sleepUntil(() -> Production.isOpen(), (int)llIllllIII[4]);
                            0;
                        }
                        if (ax.lIlllIlIIllll(Production.isOpen() ? 1 : 0)) {
                            Production.chooseOption((int)llIllllIII[1]);
                            Time.sleepTicks((int)llIllllIII[7]);
                            0;
                            Time.sleepUntil(() -> {
                                boolean bl;
                                if (!ax.lIlllIlIIllll(ax.an() ? 1 : 0) || ax.lIlllIlIIllll(Dialog.isOpen() ? 1 : 0)) {
                                    bl = llIllllIII[1];
                                    0;
                                    if ((0x2D ^ 0x59 ^ (0xE ^ 0x7E)) <= 0) {
                                        return ((0xD ^ 0x50 ^ (0x3A ^ 0x5E)) & (128 + 85 - 204 + 162 ^ 45 + 97 - 2 + 6 ^ -1)) != 0;
                                    }
                                } else {
                                    bl = llIllllIII[0];
                                }
                                return bl;
                            }, (int)llIllllIII[21]);
                            0;
                        }
                    }
                }
            }
        }
    }
}

