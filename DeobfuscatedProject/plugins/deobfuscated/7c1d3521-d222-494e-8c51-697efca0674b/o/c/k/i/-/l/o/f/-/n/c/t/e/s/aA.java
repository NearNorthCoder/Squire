/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Item
 *  net.runelite.api.Skill
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Bank$WithdrawMode
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.GrandExchange
 *  net.unethicalite.api.items.Inventory
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
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.Skill;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.GrandExchange;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Production;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.a;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.ac;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.b;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.d;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.e;

public class aA
implements ac {
    private static final /* synthetic */ int oT;
    private static final /* synthetic */ int oL;
    private static final /* synthetic */ int oP;
    private static final /* synthetic */ int oN;
    private static final /* synthetic */ int oR;
    private static final /* synthetic */ int oU;
    public static /* synthetic */ List<d> bv;
    public static /* synthetic */ boolean bt;
    private static final /* synthetic */ int oO;
    private static /* synthetic */ int[] llIlIlllll;
    private static final /* synthetic */ int oV;
    private static final /* synthetic */ int oM;
    private static final /* synthetic */ int oQ;
    private static final /* synthetic */ int oS;
    private static /* synthetic */ String[] llIlIllllI;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean an() {
        int n2;
        if (aA.lIllIlIllIIIl(Skills.getLevel((Skill)Skill.FLETCHING), llIlIlllll[6]) && aA.lIllIlIlIllIl(Skills.getLevel((Skill)Skill.FLETCHING), llIlIlllll[10])) {
            int n3;
            int[] nArray = new int[llIlIlllll[1]];
            nArray[aA.llIlIlllll[0]] = llIlIlllll[7];
            if (aA.lIllIlIllIIII(Inventory.getCount((int[])nArray))) {
                int[] nArray2 = new int[llIlIlllll[1]];
                nArray2[aA.llIlIlllll[0]] = llIlIlllll[11];
                if (aA.lIllIlIllIIII(Inventory.getCount((int[])nArray2))) {
                    n3 = llIlIlllll[1];
                    0;
                    if (((0x10 ^ 0x28 ^ (0x3F ^ 0x32)) & (0x73 ^ 0x2D ^ (0x2C ^ 0x47) ^ -1)) != 1) return n3 != 0;
                    return ((0x63 ^ 0x2B ^ (0xD4 ^ 0xA6)) & (13 + 105 - -31 + 32 ^ 87 + 42 - 105 + 119 ^ -1)) != 0;
                }
            }
            n3 = llIlIlllll[0];
            return n3 != 0;
        }
        if (aA.lIllIlIllIIIl(Skills.getLevel((Skill)Skill.FLETCHING), llIlIlllll[10])) {
            int n4;
            int[] nArray = new int[llIlIlllll[1]];
            nArray[aA.llIlIlllll[0]] = llIlIlllll[13];
            if (aA.lIllIlIllIIII(Inventory.getCount((int[])nArray))) {
                int[] nArray3 = new int[llIlIlllll[1]];
                nArray3[aA.llIlIlllll[0]] = aA.fx();
                if (aA.lIllIlIllIIII(Inventory.getCount((int[])nArray3))) {
                    n4 = llIlIlllll[1];
                    0;
                    if (3 > 2) return n4 != 0;
                    return ((0x79 ^ 0x32 ^ (0xDC ^ 0xA9)) & (88 + 171 - 208 + 122 ^ 58 + 117 - 148 + 120 ^ -1)) != 0;
                }
            }
            n4 = llIlIlllll[0];
            return n4 != 0;
        }
        int[] nArray = new int[llIlIlllll[1]];
        nArray[aA.llIlIlllll[0]] = llIlIlllll[7];
        if (aA.lIllIlIllIIII(Inventory.getCount((int[])nArray))) {
            int[] nArray4 = new int[llIlIlllll[1]];
            nArray4[aA.llIlIlllll[0]] = llIlIlllll[8];
            if (aA.lIllIlIllIIII(Inventory.getCount((int[])nArray4))) {
                n2 = llIlIlllll[1];
                0;
                if (3 != -1) return n2 != 0;
                return ((0xDA ^ 0x92) & ~(0x35 ^ 0x7D)) != 0;
            }
        }
        n2 = llIlIlllll[0];
        return n2 != 0;
    }

    @Override
    public int af() {
        aA.fv();
        return llIlIlllll[43];
    }

    private static boolean lIllIlIlIlllI(int n2) {
        return n2 == 0;
    }

    private static boolean lIllIlIllIIIl(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIllIlIlIllll(Object object) {
        return object != null;
    }

    private static String lIllIlIlIlIIl(String llllllllllllllllllIIIlIllIlIllll, String llllllllllllllllllIIIlIllIlIlllI) {
        try {
            SecretKeySpec llllllllllllllllllIIIlIllIllIIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllllIIIlIllIlIlllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllllIIIlIllIllIIIl = Cipher.getInstance("Blowfish");
            llllllllllllllllllIIIlIllIllIIIl.init(llIlIlllll[2], llllllllllllllllllIIIlIllIllIIlI);
            return new String(llllllllllllllllllIIIlIllIllIIIl.doFinal(Base64.getDecoder().decode(llllllllllllllllllIIIlIllIlIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllllIIIlIllIllIIII) {
            llllllllllllllllllIIIlIllIllIIII.printStackTrace();
            return null;
        }
    }

    private static void lIllIlIlIlIlI() {
        llIlIllllI = new String[llIlIlllll[50]];
        aA.llIlIllllI[aA.llIlIlllll[0]] = aA."Buying items";
        aA.llIlIllllI[aA.llIlIlllll[1]] = aA."Finished buying items, switching back to fletching";
        aA.llIlIllllI[aA.llIlIlllll[2]] = aA."Navigating to bank";
        aA.llIlIllllI[aA.llIlIlllll[3]] = aA."Opening bank";
        aA.llIlIllllI[aA.llIlIlllll[5]] = aA."Handling banking";
        aA.llIlIllllI[aA.llIlIlllll[9]] = aA."We are missing supplies, switching to BUYING";
        aA.llIlIllllI[aA.llIlIlllll[12]] = aA."We are missing supplies, switching to BUYING";
        aA.llIlIllllI[aA.llIlIlllll[14]] = aA."We are missing supplies, switching to BUYING";
        aA.llIlIllllI[aA.llIlIlllll[15]] = aA."Using items";
        aA.llIlIllllI[aA.llIlIlllll[16]] = aA."Making arrows";
        aA.llIlIllllI[aA.llIlIlllll[20]] = aA."Fletching oak longs";
        aA.llIlIllllI[aA.llIlIlllll[21]] = aA."Oak longbow";
        aA.llIlIllllI[aA.llIlIlllll[24]] = aA."Fletching willow shorts";
        aA.llIlIllllI[aA.llIlIlllll[25]] = aA."Willow shortbow";
        aA.llIlIllllI[aA.llIlIlllll[27]] = aA."Fletching willow longbows";
        aA.llIlIllllI[aA.llIlIlllll[6]] = aA."Willow longbow";
        aA.llIlIllllI[aA.llIlIlllll[28]] = aA."Fletching maple longs";
        aA.llIlIllllI[aA.llIlIlllll[29]] = aA."Maple longbow";
        aA.llIlIllllI[aA.llIlIlllll[35]] = aA."Fletching";
        aA.llIlIllllI[aA.llIlIlllll[45]] = aA."ring of wealth (";
    }

    private static boolean lIllIlIlIllII(int n2) {
        return n2 != 0;
    }

    private static boolean lIllIlIlIllIl(int n2, int n3) {
        return n2 < n3;
    }

    private static int fx() {
        if (aA.lIllIlIllIIIl(Skills.getLevel((Skill)Skill.FLETCHING), llIlIlllll[26])) {
            return llIlIlllll[30];
        }
        if (aA.lIllIlIllIIIl(Skills.getLevel((Skill)Skill.FLETCHING), llIlIlllll[19]) && aA.lIllIlIlIllIl(Skills.getLevel((Skill)Skill.FLETCHING), llIlIlllll[26])) {
            return llIlIlllll[31];
        }
        if (aA.lIllIlIllIIIl(Skills.getLevel((Skill)Skill.FLETCHING), llIlIlllll[10]) && aA.lIllIlIlIllIl(Skills.getLevel((Skill)Skill.FLETCHING), llIlIlllll[19])) {
            return llIlIlllll[32];
        }
        if (aA.lIllIlIlIllIl(Skills.getLevel((Skill)Skill.FLETCHING), llIlIlllll[11])) {
            return llIlIlllll[7];
        }
        return llIlIlllll[0];
    }

    private static boolean lIllIlIllIIII(int n2) {
        return n2 > 0;
    }

    private static String lIllIlIlIIlll(String llllllllllllllllllIIIlIllIllllII, String llllllllllllllllllIIIlIllIlllIIl) {
        try {
            SecretKeySpec llllllllllllllllllIIIlIllIllllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllllIIIlIllIlllIIl.getBytes(StandardCharsets.UTF_8)), llIlIlllll[15]), "DES");
            Cipher llllllllllllllllllIIIlIllIlllllI = Cipher.getInstance("DES");
            llllllllllllllllllIIIlIllIlllllI.init(llIlIlllll[2], llllllllllllllllllIIIlIllIllllll);
            return new String(llllllllllllllllllIIIlIllIlllllI.doFinal(Base64.getDecoder().decode(llllllllllllllllllIIIlIllIllllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllllIIIlIllIllllIl) {
            llllllllllllllllllIIIlIllIllllIl.printStackTrace();
            return null;
        }
    }

    private static String lIllIlIlIlIII(String llllllllllllllllllIIIlIlllIlIIIl, String llllllllllllllllllIIIlIlllIIlIll) {
        llllllllllllllllllIIIlIlllIlIIIl = new String(Base64.getDecoder().decode(llllllllllllllllllIIIlIlllIlIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllllIIIlIlllIIllll = new StringBuilder();
        char[] llllllllllllllllllIIIlIlllIIlllI = llllllllllllllllllIIIlIlllIIlIll.toCharArray();
        int llllllllllllllllllIIIlIlllIIllIl = llIlIlllll[0];
        char[] llllllllllllllllllIIIlIlllIIIlll = llllllllllllllllllIIIlIlllIlIIIl.toCharArray();
        int llllllllllllllllllIIIlIlllIIIllI = llllllllllllllllllIIIlIlllIIIlll.length;
        int llllllllllllllllllIIIlIlllIIIlIl = llIlIlllll[0];
        while (aA.lIllIlIlIllIl(llllllllllllllllllIIIlIlllIIIlIl, llllllllllllllllllIIIlIlllIIIllI)) {
            char llllllllllllllllllIIIlIlllIlIIlI = llllllllllllllllllIIIlIlllIIIlll[llllllllllllllllllIIIlIlllIIIlIl];
            llllllllllllllllllIIIlIlllIIllll.append((char)(llllllllllllllllllIIIlIlllIlIIlI ^ llllllllllllllllllIIIlIlllIIlllI[llllllllllllllllllIIIlIlllIIllIl % llllllllllllllllllIIIlIlllIIlllI.length]));
            0;
            ++llllllllllllllllllIIIlIlllIIllIl;
            ++llllllllllllllllllIIIlIlllIIIlIl;
            0;
            if (-(8 ^ 0x30 ^ (0x7F ^ 0x43)) <= 0) continue;
            return null;
        }
        return String.valueOf(llllllllllllllllllIIIlIlllIIllll);
    }

    @Override
    public boolean ah() {
        boolean bl;
        if (aA.lIllIlIllIIIl(Skills.getLevel((Skill)Skill.FLETCHING), llIlIlllll[44])) {
            bl = llIlIlllll[1];
            0;
            if (-(0x3E ^ 0x3A) > 0) {
                return ((0x63 ^ 0x5C) & ~(0x18 ^ 0x27)) != 0;
            }
        } else {
            bl = llIlIlllll[0];
        }
        return bl;
    }

    private static void Q() {
        d llllllllllllllllllIIIlIlllIlllII;
        Object llllllllllllllllllIIIlIlllIlllIl;
        if (aA.lIllIlIlIllIl(Skills.getLevel((Skill)Skill.FLETCHING), llIlIlllll[6])) {
            d d2 = new d(llIlIlllll[7], llIlIlllll[33], llIlIlllll[11]);
            d d3 = new d(llIlIlllll[8], llIlIlllll[34], llIlIlllll[35]);
            bv.add(d2);
            0;
            bv.add(d3);
            0;
        }
        if (aA.lIllIlIllIIIl(Skills.getLevel((Skill)Skill.FLETCHING), llIlIlllll[6]) && aA.lIllIlIlIllIl(Skills.getLevel((Skill)Skill.FLETCHING), llIlIlllll[10])) {
            llllllllllllllllllIIIlIlllIlllIl = new d(llIlIlllll[7], llIlIlllll[33], llIlIlllll[11]);
            llllllllllllllllllIIIlIlllIlllII = new d(llIlIlllll[11], llIlIlllll[34], llIlIlllll[36]);
            bv.add((d)llllllllllllllllllIIIlIlllIlllIl);
            0;
            bv.add(llllllllllllllllllIIIlIlllIlllII);
            0;
        }
        if (aA.lIllIlIllIIIl(Skills.getLevel((Skill)Skill.FLETCHING), llIlIlllll[10]) && aA.lIllIlIlIllIl(Skills.getLevel((Skill)Skill.FLETCHING), llIlIlllll[19])) {
            llllllllllllllllllIIIlIlllIlllIl = new d(llIlIlllll[32], llIlIlllll[37], llIlIlllll[38]);
            llllllllllllllllllIIIlIlllIlllII = new d(llIlIlllll[13], llIlIlllll[1], llIlIlllll[4]);
            bv.add((d)llllllllllllllllllIIIlIlllIlllIl);
            0;
            bv.add(llllllllllllllllllIIIlIlllIlllII);
            0;
        }
        if (aA.lIllIlIllIIIl(Skills.getLevel((Skill)Skill.FLETCHING), llIlIlllll[19]) && aA.lIllIlIlIllIl(Skills.getLevel((Skill)Skill.FLETCHING), llIlIlllll[26])) {
            llllllllllllllllllIIIlIlllIlllIl = new d(llIlIlllll[31], llIlIlllll[33], llIlIlllll[38]);
            llllllllllllllllllIIIlIlllIlllII = new d(llIlIlllll[13], llIlIlllll[1], llIlIlllll[4]);
            bv.add((d)llllllllllllllllllIIIlIlllIlllIl);
            0;
            bv.add(llllllllllllllllllIIIlIlllIlllII);
            0;
        }
        if (aA.lIllIlIllIIIl(Skills.getLevel((Skill)Skill.FLETCHING), llIlIlllll[26])) {
            llllllllllllllllllIIIlIlllIlllIl = new d(llIlIlllll[30], llIlIlllll[33], llIlIlllll[38]);
            llllllllllllllllllIIIlIlllIlllII = new d(llIlIlllll[13], llIlIlllll[1], llIlIlllll[4]);
            bv.add((d)llllllllllllllllllIIIlIlllIlllIl);
            0;
            bv.add(llllllllllllllllllIIIlIlllIlllII);
            0;
        }
        if (aA.lIllIlIlIlllI(Bank.contains((Predicate)(llllllllllllllllllIIIlIlllIlllIl = item -> item.getName().toLowerCase().contains(llIlIllllI[llIlIlllll[45]]))) ? 1 : 0)) {
            llllllllllllllllllIIIlIlllIlllII = new d(llIlIlllll[39], llIlIlllll[9], llIlIlllll[40]);
            bv.add(llllllllllllllllllIIIlIlllIlllII);
            0;
        }
        int[] nArray = new int[llIlIlllll[1]];
        nArray[aA.llIlIlllll[0]] = llIlIlllll[41];
        if (aA.lIllIlIlIlllI(Bank.contains((int[])nArray) ? 1 : 0)) {
            llllllllllllllllllIIIlIlllIlllII = new d(llIlIlllll[41], llIlIlllll[11], llIlIlllll[42]);
            bv.add(llllllllllllllllllIIIlIlllIlllII);
            0;
        }
    }

    public static void fv() {
        block29: {
            BankLocation llllllllllllllllllIIIlIllllIIIIl;
            block30: {
                block41: {
                    block40: {
                        block39: {
                            block35: {
                                block38: {
                                    block37: {
                                        block36: {
                                            block31: {
                                                block34: {
                                                    block33: {
                                                        block32: {
                                                            if (aA.lIllIlIlIllII(bt ? 1 : 0)) {
                                                                AccBuilderSotf.c = llIlIllllI[llIlIlllll[0]];
                                                                b.a(bv);
                                                                if (aA.lIllIlIlIllIl(bv.size(), llIlIlllll[1])) {
                                                                    System.out.println(llIlIllllI[llIlIlllll[1]]);
                                                                    bt = llIlIlllll[0];
                                                                }
                                                            }
                                                            if (!aA.lIllIlIlIlllI(bt ? 1 : 0)) break block29;
                                                            if (!aA.lIllIlIlIlllI(aA.an() ? 1 : 0)) break block30;
                                                            llllllllllllllllllIIIlIllllIIIIl = BankLocation.getNearest();
                                                            if (aA.lIllIlIlIllll(llllllllllllllllllIIIlIllllIIIIl) && aA.lIllIlIlIlllI(llllllllllllllllllIIIlIllllIIIIl.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                                                AccBuilderSotf.c = llIlIllllI[llIlIlllll[2]];
                                                                a.a(llllllllllllllllllIIIlIllllIIIIl);
                                                            }
                                                            if (!aA.lIllIlIlIllll(llllllllllllllllllIIIlIllllIIIIl) || !aA.lIllIlIlIllII(llllllllllllllllllIIIlIllllIIIIl.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block30;
                                                            if (aA.lIllIlIlIlllI(Bank.isOpen() ? 1 : 0)) {
                                                                AccBuilderSotf.c = llIlIllllI[llIlIlllll[3]];
                                                                a.a();
                                                                Time.sleepUntil(() -> Bank.isOpen(), (int)llIlIlllll[4]);
                                                                0;
                                                            }
                                                            if (!aA.lIllIlIlIllII(Bank.isOpen() ? 1 : 0)) break block30;
                                                            AccBuilderSotf.c = llIlIllllI[llIlIlllll[5]];
                                                            if (aA.lIllIlIllIIII(Inventory.getAll().size())) {
                                                                Bank.depositInventory();
                                                                Time.sleepTicks((int)llIlIlllll[5]);
                                                                0;
                                                            }
                                                            if (aA.lIllIlIllIIII(Equipment.getAll().size())) {
                                                                Bank.depositEquipment();
                                                                Time.sleepTicks((int)llIlIlllll[2]);
                                                                0;
                                                            }
                                                            if (!aA.lIllIlIlIllIl(Skills.getLevel((Skill)Skill.FLETCHING), llIlIlllll[6])) break block31;
                                                            int[] nArray = new int[llIlIlllll[1]];
                                                            nArray[aA.llIlIlllll[0]] = llIlIlllll[7];
                                                            if (!aA.lIllIlIlIlllI(Bank.contains((int[])nArray) ? 1 : 0)) break block32;
                                                            int[] nArray2 = new int[llIlIlllll[1]];
                                                            nArray2[aA.llIlIlllll[0]] = llIlIlllll[7];
                                                            if (!aA.lIllIlIlIllII(Inventory.contains((int[])nArray2) ? 1 : 0)) break block33;
                                                        }
                                                        int[] nArray = new int[llIlIlllll[1]];
                                                        nArray[aA.llIlIlllll[0]] = llIlIlllll[8];
                                                        if (!aA.lIllIlIlIlllI(Bank.contains((int[])nArray) ? 1 : 0)) break block34;
                                                        int[] nArray3 = new int[llIlIlllll[1]];
                                                        nArray3[aA.llIlIlllll[0]] = llIlIlllll[8];
                                                        if (!aA.lIllIlIlIlllI(Inventory.contains((int[])nArray3) ? 1 : 0)) break block34;
                                                    }
                                                    aA.Q();
                                                    System.out.println(llIlIllllI[llIlIlllll[9]]);
                                                    bt = llIlIlllll[1];
                                                    return;
                                                }
                                                Bank.withdrawAll((int)llIlIlllll[7], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                                Time.sleepTicks((int)llIlIlllll[1]);
                                                0;
                                                Time.sleepUntil(() -> {
                                                    boolean bl;
                                                    int[] nArray = new int[llIlIlllll[1]];
                                                    nArray[aA.llIlIlllll[0]] = llIlIlllll[7];
                                                    if (aA.lIllIlIllIIII(Inventory.getCount((int[])nArray))) {
                                                        bl = llIlIlllll[1];
                                                        0;
                                                        if (null != null) {
                                                            return ((0x1F ^ 4) & ~(0x26 ^ 0x3D)) != 0;
                                                        }
                                                    } else {
                                                        bl = llIlIlllll[0];
                                                    }
                                                    return bl;
                                                }, (int)llIlIlllll[4]);
                                                0;
                                                Bank.withdrawAll((int)llIlIlllll[8], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                                Time.sleepTicks((int)llIlIlllll[1]);
                                                0;
                                                Time.sleepUntil(() -> {
                                                    boolean bl;
                                                    int[] nArray = new int[llIlIlllll[1]];
                                                    nArray[aA.llIlIlllll[0]] = llIlIlllll[8];
                                                    if (aA.lIllIlIllIIII(Inventory.getCount((int[])nArray))) {
                                                        bl = llIlIlllll[1];
                                                        0;
                                                        if (null != null) {
                                                            return ((0xEF ^ 0xA0) & ~(0x4C ^ 3)) != 0;
                                                        }
                                                    } else {
                                                        bl = llIlIlllll[0];
                                                    }
                                                    return bl;
                                                }, (int)llIlIlllll[4]);
                                                0;
                                            }
                                            if (!aA.lIllIlIllIIIl(Skills.getLevel((Skill)Skill.FLETCHING), llIlIlllll[6]) || !aA.lIllIlIlIllIl(Skills.getLevel((Skill)Skill.FLETCHING), llIlIlllll[10])) break block35;
                                            int[] nArray = new int[llIlIlllll[1]];
                                            nArray[aA.llIlIlllll[0]] = llIlIlllll[7];
                                            if (!aA.lIllIlIlIlllI(Bank.contains((int[])nArray) ? 1 : 0)) break block36;
                                            int[] nArray4 = new int[llIlIlllll[1]];
                                            nArray4[aA.llIlIlllll[0]] = llIlIlllll[7];
                                            if (!aA.lIllIlIlIllII(Inventory.contains((int[])nArray4) ? 1 : 0)) break block37;
                                        }
                                        int[] nArray = new int[llIlIlllll[1]];
                                        nArray[aA.llIlIlllll[0]] = llIlIlllll[11];
                                        if (!aA.lIllIlIlIlllI(Bank.contains((int[])nArray) ? 1 : 0)) break block38;
                                        int[] nArray5 = new int[llIlIlllll[1]];
                                        nArray5[aA.llIlIlllll[0]] = llIlIlllll[11];
                                        if (!aA.lIllIlIlIlllI(Inventory.contains((int[])nArray5) ? 1 : 0)) break block38;
                                    }
                                    aA.Q();
                                    System.out.println(llIlIllllI[llIlIlllll[12]]);
                                    bt = llIlIlllll[1];
                                    return;
                                }
                                Bank.withdrawAll((int)llIlIlllll[7], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                Time.sleepTicks((int)llIlIlllll[1]);
                                0;
                                Time.sleepUntil(() -> {
                                    boolean bl;
                                    int[] nArray = new int[llIlIlllll[1]];
                                    nArray[aA.llIlIlllll[0]] = llIlIlllll[7];
                                    if (aA.lIllIlIllIIII(Inventory.getCount((int[])nArray))) {
                                        bl = llIlIlllll[1];
                                        0;
                                        if (3 > 3) {
                                            return ((0x1C ^ 0x56) & ~(0xFB ^ 0xB1)) != 0;
                                        }
                                    } else {
                                        bl = llIlIlllll[0];
                                    }
                                    return bl;
                                }, (int)llIlIlllll[4]);
                                0;
                                Bank.withdrawAll((int)llIlIlllll[11], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                Time.sleepTicks((int)llIlIlllll[1]);
                                0;
                                Time.sleepUntil(() -> {
                                    boolean bl;
                                    int[] nArray = new int[llIlIlllll[1]];
                                    nArray[aA.llIlIlllll[0]] = llIlIlllll[11];
                                    if (aA.lIllIlIllIIII(Inventory.getCount((int[])nArray))) {
                                        bl = llIlIlllll[1];
                                        0;
                                        if (3 > 3) {
                                            return ((0x2C ^ 0x36) & ~(0x89 ^ 0x93)) != 0;
                                        }
                                    } else {
                                        bl = llIlIlllll[0];
                                    }
                                    return bl;
                                }, (int)llIlIlllll[4]);
                                0;
                            }
                            if (!aA.lIllIlIllIIIl(Skills.getLevel((Skill)Skill.FLETCHING), llIlIlllll[10])) break block30;
                            int[] nArray = new int[llIlIlllll[1]];
                            nArray[aA.llIlIlllll[0]] = llIlIlllll[13];
                            if (!aA.lIllIlIlIlllI(Bank.contains((int[])nArray) ? 1 : 0)) break block39;
                            int[] nArray6 = new int[llIlIlllll[1]];
                            nArray6[aA.llIlIlllll[0]] = llIlIlllll[13];
                            if (!aA.lIllIlIllIIIl(Inventory.getCount((int[])nArray6), llIlIlllll[1])) break block40;
                        }
                        int[] nArray = new int[llIlIlllll[1]];
                        nArray[aA.llIlIlllll[0]] = aA.fx();
                        if (!aA.lIllIlIlIlllI(Bank.contains((int[])nArray) ? 1 : 0)) break block41;
                        int[] nArray7 = new int[llIlIlllll[1]];
                        nArray7[aA.llIlIlllll[0]] = aA.fx();
                        if (!aA.lIllIlIlIllIl(Inventory.getCount((int[])nArray7), llIlIlllll[1])) break block41;
                    }
                    aA.Q();
                    System.out.println(llIlIllllI[llIlIlllll[14]]);
                    bt = llIlIlllll[1];
                    return;
                }
                int[] nArray = new int[llIlIlllll[1]];
                nArray[aA.llIlIlllll[0]] = llIlIlllll[13];
                if (aA.lIllIlIlIllIl(Inventory.getCount((int[])nArray), llIlIlllll[1])) {
                    Bank.withdraw((int)llIlIlllll[13], (int)llIlIlllll[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                    Time.sleepTicks((int)llIlIlllll[1]);
                    0;
                    Time.sleepUntil(() -> {
                        boolean bl;
                        int[] nArray = new int[llIlIlllll[1]];
                        nArray[aA.llIlIlllll[0]] = llIlIlllll[13];
                        if (aA.lIllIlIllIIII(Inventory.getCount((int[])nArray))) {
                            bl = llIlIlllll[1];
                            0;
                            if ((0x5F ^ 0x2C ^ (0xDE ^ 0xA9)) < -1) {
                                return ((0x9F ^ 0x81 ^ (0x18 ^ 0x3B)) & (73 + 40 - 50 + 66 ^ 39 + 105 - 95 + 139 ^ -1)) != 0;
                            }
                        } else {
                            bl = llIlIlllll[0];
                        }
                        return bl;
                    }, (int)llIlIlllll[4]);
                    0;
                }
                int[] nArray8 = new int[llIlIlllll[1]];
                nArray8[aA.llIlIlllll[0]] = llIlIlllll[13];
                if (aA.lIllIlIllIIII(Inventory.getCount((int[])nArray8))) {
                    Bank.withdrawAll((int)aA.fx(), (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                    Time.sleepTicks((int)llIlIlllll[1]);
                    0;
                    Time.sleepUntil(() -> {
                        boolean bl;
                        int[] nArray = new int[llIlIlllll[1]];
                        nArray[aA.llIlIlllll[0]] = aA.fx();
                        if (aA.lIllIlIllIIII(Inventory.getCount((int[])nArray))) {
                            bl = llIlIlllll[1];
                            0;
                            if (3 <= 1) {
                                return ((0x9C ^ 0xAF) & ~(0x5A ^ 0x69)) != 0;
                            }
                        } else {
                            bl = llIlIlllll[0];
                        }
                        return bl;
                    }, (int)llIlIlllll[4]);
                    0;
                }
            }
            if (aA.lIllIlIlIllII(aA.an() ? 1 : 0)) {
                if (aA.lIllIlIlIllII(Bank.isOpen() ? 1 : 0)) {
                    Bank.close();
                }
                if (aA.lIllIlIlIlllI(Bank.isOpen() ? 1 : 0) && aA.lIllIlIlIlllI(Players.getLocal().isAnimating() ? 1 : 0)) {
                    if (aA.lIllIlIlIllII(GrandExchange.isOpen() ? 1 : 0)) {
                        GrandExchange.openBank();
                    }
                    if (aA.lIllIlIlIlllI(Production.isOpen() ? 1 : 0)) {
                        AccBuilderSotf.c = llIlIllllI[llIlIlllll[15]];
                        int[] nArray = new int[llIlIlllll[1]];
                        nArray[aA.llIlIlllll[0]] = aA.fw();
                        llllllllllllllllllIIIlIllllIIIIl = Inventory.getFirst((int[])nArray);
                        int[] nArray9 = new int[llIlIlllll[1]];
                        nArray9[aA.llIlIlllll[0]] = aA.fx();
                        Item llllllllllllllllllIIIlIllllIIIII = Inventory.getFirst((int[])nArray9);
                        if (aA.lIllIlIlIllll(llllllllllllllllllIIIlIllllIIIIl) && aA.lIllIlIlIllll(llllllllllllllllllIIIlIllllIIIII)) {
                            Time.sleepTicks((int)llIlIlllll[3]);
                            0;
                            llllllllllllllllllIIIlIllllIIIIl.useOn(llllllllllllllllllIIIlIllllIIIII);
                            Time.sleepUntil(() -> Production.isOpen(), (int)llIlIlllll[4]);
                            0;
                        }
                    }
                    if (aA.lIllIlIlIllII(Production.isOpen() ? 1 : 0)) {
                        if (aA.lIllIlIlIllIl(Skills.getLevel((Skill)Skill.FLETCHING), llIlIlllll[10])) {
                            AccBuilderSotf.c = llIlIllllI[llIlIlllll[16]];
                            Production.chooseOption((int)llIlIlllll[1]);
                            Time.sleepTicks((int)llIlIlllll[12]);
                            0;
                            Time.sleepUntil(() -> {
                                boolean bl;
                                if (!aA.lIllIlIlIlllI(Dialog.isOpen() ? 1 : 0) || aA.lIllIlIlIllII(Dialog.canLevelUpContinue() ? 1 : 0)) {
                                    bl = llIlIlllll[1];
                                    0;
                                    if (2 < 0) {
                                        return ((0x32 ^ 0x19) & ~(0x86 ^ 0xAD)) != 0;
                                    }
                                } else {
                                    bl = llIlIlllll[0];
                                }
                                return bl;
                            }, (int)e.c(llIlIlllll[17], llIlIlllll[18]));
                            0;
                        }
                        if (aA.lIllIlIllIIIl(Skills.getLevel((Skill)Skill.FLETCHING), llIlIlllll[10]) && aA.lIllIlIlIllIl(Skills.getLevel((Skill)Skill.FLETCHING), llIlIlllll[19])) {
                            AccBuilderSotf.c = llIlIllllI[llIlIlllll[20]];
                            Production.chooseOption((String)llIlIllllI[llIlIlllll[21]]);
                            Time.sleepTicks((int)llIlIlllll[12]);
                            0;
                            Time.sleepUntil(() -> {
                                int n2;
                                block3: {
                                    block2: {
                                        if (!aA.lIllIlIlIlllI(Dialog.isOpen() ? 1 : 0)) break block2;
                                        int[] nArray = new int[llIlIlllll[1]];
                                        nArray[aA.llIlIlllll[0]] = llIlIlllll[32];
                                        if (!aA.lIllIlIlIllIl(Inventory.getCount((int[])nArray), llIlIlllll[1])) break block3;
                                    }
                                    n2 = llIlIlllll[1];
                                    0;
                                    if (-1 <= 0) return n2 != 0;
                                    return ((0xA0 ^ 0x86 ^ (0x5C ^ 0x7E)) & (0x7E ^ 0x6F ^ (0xD2 ^ 0xC7) ^ -1)) != 0;
                                }
                                n2 = llIlIlllll[0];
                                return n2 != 0;
                            }, (int)e.c(llIlIlllll[22], llIlIlllll[23]));
                            0;
                        }
                        if (aA.lIllIlIllIIIl(Skills.getLevel((Skill)Skill.FLETCHING), llIlIlllll[19]) && aA.lIllIlIlIllIl(Skills.getLevel((Skill)Skill.FLETCHING), llIlIlllll[11])) {
                            AccBuilderSotf.c = llIlIllllI[llIlIlllll[24]];
                            Production.chooseOption((String)llIlIllllI[llIlIlllll[25]]);
                            Time.sleepTicks((int)llIlIlllll[12]);
                            0;
                            Time.sleepUntil(() -> {
                                int n2;
                                block3: {
                                    block2: {
                                        if (!aA.lIllIlIlIlllI(Dialog.isOpen() ? 1 : 0)) break block2;
                                        int[] nArray = new int[llIlIlllll[1]];
                                        nArray[aA.llIlIlllll[0]] = llIlIlllll[31];
                                        if (!aA.lIllIlIlIllIl(Inventory.getCount((int[])nArray), llIlIlllll[1])) break block3;
                                    }
                                    n2 = llIlIlllll[1];
                                    0;
                                    if (1 == 1) return n2 != 0;
                                    return ((0x78 ^ 0x24 ^ (0xBD ^ 0xB5)) & (26 + 214 - 181 + 157 ^ 37 + 42 - 6 + 67 ^ -1)) != 0;
                                }
                                n2 = llIlIlllll[0];
                                return n2 != 0;
                            }, (int)e.c(llIlIlllll[22], llIlIlllll[23]));
                            0;
                        }
                        if (aA.lIllIlIllIIIl(Skills.getLevel((Skill)Skill.FLETCHING), llIlIlllll[11]) && aA.lIllIlIlIllIl(Skills.getLevel((Skill)Skill.FLETCHING), llIlIlllll[26])) {
                            AccBuilderSotf.c = llIlIllllI[llIlIlllll[27]];
                            Production.chooseOption((String)llIlIllllI[llIlIlllll[6]]);
                            Time.sleepTicks((int)llIlIlllll[12]);
                            0;
                            Time.sleepUntil(() -> {
                                int n2;
                                block3: {
                                    block2: {
                                        if (!aA.lIllIlIlIlllI(Dialog.isOpen() ? 1 : 0)) break block2;
                                        int[] nArray = new int[llIlIlllll[1]];
                                        nArray[aA.llIlIlllll[0]] = llIlIlllll[31];
                                        if (!aA.lIllIlIlIllIl(Inventory.getCount((int[])nArray), llIlIlllll[1])) break block3;
                                    }
                                    n2 = llIlIlllll[1];
                                    0;
                                    if (-3 <= 0) return n2 != 0;
                                    return ((0xB0 ^ 0x89 ^ (0x88 ^ 0xA6)) & (0xBA ^ 0x95 ^ (0x6A ^ 0x52) ^ -1)) != 0;
                                }
                                n2 = llIlIlllll[0];
                                return n2 != 0;
                            }, (int)e.c(llIlIlllll[22], llIlIlllll[23]));
                            0;
                        }
                        if (aA.lIllIlIllIIIl(Skills.getLevel((Skill)Skill.FLETCHING), llIlIlllll[26])) {
                            AccBuilderSotf.c = llIlIllllI[llIlIlllll[28]];
                            Production.chooseOption((String)llIlIllllI[llIlIlllll[29]]);
                            Time.sleepTicks((int)llIlIlllll[12]);
                            0;
                            Time.sleepUntil(() -> {
                                int n2;
                                block3: {
                                    block2: {
                                        if (!aA.lIllIlIlIlllI(Dialog.isOpen() ? 1 : 0)) break block2;
                                        int[] nArray = new int[llIlIlllll[1]];
                                        nArray[aA.llIlIlllll[0]] = llIlIlllll[30];
                                        if (!aA.lIllIlIlIllIl(Inventory.getCount((int[])nArray), llIlIlllll[1])) break block3;
                                    }
                                    n2 = llIlIlllll[1];
                                    0;
                                    if ((1 & (1 ^ -1)) == 0) return n2 != 0;
                                    return ((0x12 ^ 5 ^ (0xF9 ^ 0xAD)) & (184 + 162 - 197 + 47 ^ 105 + 95 - 136 + 71 ^ -1)) != 0;
                                }
                                n2 = llIlIlllll[0];
                                return n2 != 0;
                            }, (int)e.c(llIlIlllll[22], llIlIlllll[23]));
                            0;
                        }
                    }
                }
            }
        }
    }

    private static int fw() {
        if (aA.lIllIlIllIIIl(Skills.getLevel((Skill)Skill.FLETCHING), llIlIlllll[10])) {
            return llIlIlllll[13];
        }
        if (aA.lIllIlIllIIIl(Skills.getLevel((Skill)Skill.FLETCHING), llIlIlllll[6]) && aA.lIllIlIlIllIl(Skills.getLevel((Skill)Skill.FLETCHING), llIlIlllll[10])) {
            return llIlIlllll[11];
        }
        if (aA.lIllIlIlIllIl(Skills.getLevel((Skill)Skill.FLETCHING), llIlIlllll[6])) {
            return llIlIlllll[8];
        }
        return llIlIlllll[0];
    }

    @Override
    public String ag() {
        return llIlIllllI[llIlIlllll[35]];
    }

    @Override
    public boolean ae() {
        return llIlIlllll[0];
    }

    private static void lIllIlIlIlIll() {
        llIlIlllll = new int[51];
        aA.llIlIlllll[0] = (122 + 132 - 224 + 111 ^ 63 + 109 - 102 + 91) & (0x27 ^ 0x60 ^ (0x13 ^ 0x78) ^ -1);
        aA.llIlIlllll[1] = 1;
        aA.llIlIlllll[2] = 2;
        aA.llIlIlllll[3] = 3;
        aA.llIlIlllll[4] = 0xFFFFBBD9 & 0x57AE;
        aA.llIlIlllll[5] = 0xA ^ 0x11 ^ (0x4E ^ 0x51);
        aA.llIlIlllll[6] = 0xD0 ^ 0xA0 ^ 73 + 71 - 53 + 36;
        aA.llIlIlllll[7] = 0xF1 ^ 0xC4;
        aA.llIlIlllll[8] = 0xB5 ^ 0x92;
        aA.llIlIlllll[9] = 0xB5 ^ 0xB0;
        aA.llIlIlllll[10] = 0x85 ^ 0x9B;
        aA.llIlIlllll[11] = 0x28 ^ 0;
        aA.llIlIlllll[12] = 0xAA ^ 0xAC;
        aA.llIlIlllll[13] = -(0xFFFFAF57 & 0x74AA) & (0xFFFFA7F3 & 0x7FBF);
        aA.llIlIlllll[14] = 1 ^ 6;
        aA.llIlIlllll[15] = 0x9C ^ 0x94;
        aA.llIlIlllll[16] = 0xB1 ^ 0xA5 ^ (0x87 ^ 0x9A);
        aA.llIlIlllll[17] = -(0xFFFFD77B & 0x6BF7) & (0xFFFFFFFE & Short.MAX_VALUE);
        aA.llIlIlllll[18] = -(0xFFFF99BA & 0x7FC7) & (0xFFFFFBFB & 0x5FED);
        aA.llIlIlllll[19] = 0x13 ^ 0x30;
        aA.llIlIlllll[20] = 0xBF ^ 0x97 ^ (0xB8 ^ 0x9A);
        aA.llIlIlllll[21] = 0xD ^ 0x47 ^ (0x76 ^ 0x37);
        aA.llIlIlllll[22] = -(0xFFFFD5F7 & 0x7B1B) & (0xFFFFFDFB & 0x17FDE);
        aA.llIlIlllll[23] = -(0xFFFFA23B & 0x7DFE) & (0xFFFFF7FF & 0x17FF9);
        aA.llIlIlllll[24] = 0x53 ^ 0x5F;
        aA.llIlIlllll[25] = 0x68 ^ 0x65;
        aA.llIlIlllll[26] = 0x39 ^ 0x4A ^ (0xFB ^ 0xBF);
        aA.llIlIlllll[27] = 0xB1 ^ 0x8A ^ (0x2C ^ 0x19);
        aA.llIlIlllll[28] = 0xAD ^ 0xBD;
        aA.llIlIlllll[29] = 0x4F ^ 0x5E;
        aA.llIlIlllll[30] = 0xFFFF8FFD & 0x75EF;
        aA.llIlIlllll[31] = -(0xFFFFE165 & 0x3E9B) & (0xFFFFB5EF & 0x6FFF);
        aA.llIlIlllll[32] = 0xFFFFFFF9 & 0x5F7;
        aA.llIlIlllll[33] = -(0xFFFFFA6A & 0x65DD) & (0xFFFFFFFF & 0x6BFF);
        aA.llIlIlllll[34] = 0xFFFFB7F2 & 0x4FDD;
        aA.llIlIlllll[35] = 0x1E ^ 0xC;
        aA.llIlIlllll[36] = 0x21 ^ 0xC;
        aA.llIlIlllll[37] = 0xFFFFDFFD & 0x23EA;
        aA.llIlIlllll[38] = 0x2B ^ 0x17;
        aA.llIlIlllll[39] = 0xFFFFEFFE & 0x3ECD;
        aA.llIlIlllll[40] = 0xFFFFE3EA & 0x7DBD;
        aA.llIlIlllll[41] = -(0xFFFFF4F7 & 0x2BA9) & (0xFFFFBFFF & 0x7FE7);
        aA.llIlIlllll[42] = -(0xFFFFDD55 & 0x3EEB) & (0xFFFFFFE7 & 0x1FDC);
        aA.llIlIlllll[43] = 0x20 ^ 0x44;
        aA.llIlIlllll[44] = 0x30 ^ 0x2A ^ (0x20 ^ 0x59);
        aA.llIlIlllll[45] = 0x2A ^ 0x39;
        aA.llIlIlllll[46] = 0x80 ^ 0xBE;
        aA.llIlIlllll[47] = 0x31 ^ 0x35 ^ (8 ^ 0x25);
        aA.llIlIlllll[48] = 0xFFFFFBD3 & 0x77F;
        aA.llIlIlllll[49] = 0xFFFFEFF3 & 0x16FD;
        aA.llIlIlllll[50] = 0xC ^ 1 ^ (0xD8 ^ 0xC1);
    }

    static {
        aA.lIllIlIlIlIll();
        aA.lIllIlIlIlIlI();
        oM = llIlIlllll[8];
        oU = llIlIlllll[46];
        oL = llIlIlllll[7];
        oO = llIlIlllll[47];
        oR = llIlIlllll[13];
        oN = llIlIlllll[11];
        oV = llIlIlllll[48];
        oT = llIlIlllll[49];
        oP = llIlIlllll[31];
        oQ = llIlIlllll[32];
        oS = llIlIlllll[30];
        bv = new ArrayList<d>();
    }
}

