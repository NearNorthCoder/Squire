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

public class ai
implements ac {
    public static /* synthetic */ boolean bt;
    private static final /* synthetic */ int nh;
    private static final /* synthetic */ int nf;
    private static final /* synthetic */ int ne;
    private static final /* synthetic */ int nk;
    private static final /* synthetic */ int ni;
    private static final /* synthetic */ int nj;
    private static /* synthetic */ String[] lIlllllIII;
    private static final /* synthetic */ int nl;
    private static final /* synthetic */ int nm;
    private static final /* synthetic */ int no;
    private static final /* synthetic */ int nn;
    public static /* synthetic */ List<d> bv;
    private static final /* synthetic */ int ng;
    private static /* synthetic */ int[] lIlllllIlI;

    private static boolean lIlIIIIlIIIII(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIlIIIIlIIIlI(Object object) {
        return object != null;
    }

    private static void lIlIIIIIllIll() {
        lIlllllIII = new String[lIlllllIlI[49]];
        ai.lIlllllIII[ai.lIlllllIlI[0]] = ai.lIlIIIIIllIII("LsGUPrSdP14cSuCflVESTw==", "IrUMJ");
        ai.lIlllllIII[ai.lIlllllIlI[1]] = ai.lIlIIIIIllIIl("mvAZKuR717g4jJ3VB6J1wOkEbdK8RiyQTlTTbHDOFqqU79TjrmG9bYxmIZjj+HD2ZKPK2MzyXOg=", "Ylvdz");
        ai.lIlllllIII[ai.lIlllllIlI[3]] = ai.lIlIIIIIllIIl("m7ik9+PwdySV92tGRml9XWx3ji8YrmCH", "OgVnz");
        ai.lIlllllIII[ai.lIlllllIlI[4]] = ai.lIlIIIIIllIlI("Fj4jNy03KWY7JTcl", "YNFYD");
        ai.lIlllllIII[ai.lIlllllIlI[6]] = ai.lIlIIIIIllIIl("tVIFOpDp3Yrb7R+5JA7w9HbJb2M3HMBV", "VjpBZ");
        ai.lIlllllIII[ai.lIlllllIlI[10]] = ai.lIlIIIIIllIII("zYE6I14vTPQ98TlFFpFfD/AIBc3iFWxXvtdPjLRZVMTncfAi3EaWl/CKXdYbF3Xx", "CCQuf");
        ai.lIlllllIII[ai.lIlllllIlI[13]] = ai.lIlIIIIIllIIl("oxhMD6M6aLXnkBrWzafYDqPRhIOTBFLfUPmaiaM4GqN22GMCNS/oQYqb3hE/vS+3", "MRMFR");
        ai.lIlllllIII[ai.lIlllllIlI[15]] = ai.lIlIIIIIllIlI("PBNZJysOVhQvKhgfFyF5GAMJNjUCEwpqeRgBEDI6Ax8XIXkfGVkEDDI/NwE=", "kvyFY");
        ai.lIlllllIII[ai.lIlllllIlI[16]] = ai.lIlIIIIIllIII("7iiOrBHpBNJq4+RjF2SVxw==", "bWizM");
        ai.lIlllllIII[ai.lIlllllIlI[17]] = ai.lIlIIIIIllIII("I+emYkMKyn799qio18bOsA==", "HLNij");
        ai.lIlllllIII[ai.lIlllllIlI[21]] = ai.lIlIIIIIllIIl("TzU3zW44c3INum5txD8aLZyhS4lGFiWl", "xrSIn");
        ai.lIlllllIII[ai.lIlllllIlI[22]] = ai.lIlIIIIIllIlI("KAQkSy0ICygJLhA=", "geOkA");
        ai.lIlllllIII[ai.lIlllllIlI[25]] = ai.lIlIIIIIllIII("Hw03c7ajMY6/ru/teNxEtsaa1xy3fgGd", "wJXHj");
        ai.lIlllllIII[ai.lIlllllIlI[26]] = ai.lIlIIIIIllIIl("mBLYc0/CAm+HA8CkMmncoA==", "gvFhh");
        ai.lIlllllIII[ai.lIlllllIlI[28]] = ai.lIlIIIIIllIlI("FCk3Gwk6LDwISiUsPgMFJWU+AAQ1Jz0YGQ==", "RERoj");
        ai.lIlllllIII[ai.lIlllllIlI[7]] = ai.lIlIIIIIllIIl("UdNF9nFk0vdMaYHZhVrVRw==", "ptwTx");
        ai.lIlllllIII[ai.lIlllllIlI[29]] = ai.lIlIIIIIllIIl("DPnictMDGrfzW33bsQBbuV5uKTDvInRJ", "UkNbT");
        ai.lIlllllIII[ai.lIlllllIlI[30]] = ai.lIlIIIIIllIII("iSPsgdlyD1xFVbb+YeVKSg==", "nmPxK");
        ai.lIlllllIII[ai.lIlllllIlI[36]] = ai.lIlIIIIIllIII("bR709YsJrcW1n0KKekLmSw==", "KZGfZ");
        ai.lIlllllIII[ai.lIlllllIlI[44]] = ai.lIlIIIIIllIII("qrTLVRI9RCIZU2EFAFGpohROBSEm1sb/", "Xhbix");
    }

    private static String lIlIIIIIllIIl(String llllllllllllllllllIlllIIIIlIlIlI, String llllllllllllllllllIlllIIIIlIIlll) {
        try {
            SecretKeySpec llllllllllllllllllIlllIIIIlIllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllllIlllIIIIlIIlll.getBytes(StandardCharsets.UTF_8)), lIlllllIlI[16]), "DES");
            Cipher llllllllllllllllllIlllIIIIlIllII = Cipher.getInstance("DES");
            llllllllllllllllllIlllIIIIlIllII.init(lIlllllIlI[3], llllllllllllllllllIlllIIIIlIllIl);
            return new String(llllllllllllllllllIlllIIIIlIllII.doFinal(Base64.getDecoder().decode(llllllllllllllllllIlllIIIIlIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllllIlllIIIIlIlIll) {
            llllllllllllllllllIlllIIIIlIlIll.printStackTrace();
            return null;
        }
    }

    static {
        ai.lIlIIIIIllllI();
        ai.lIlIIIIIllIll();
        ni = lIlllllIlI[32];
        nk = lIlllllIlI[14];
        ng = lIlllllIlI[12];
        nl = lIlllllIlI[31];
        nn = lIlllllIlI[45];
        no = lIlllllIlI[46];
        nh = lIlllllIlI[47];
        nf = lIlllllIlI[9];
        ne = lIlllllIlI[8];
        nj = lIlllllIlI[33];
        nm = lIlllllIlI[48];
        bv = new ArrayList<d>();
    }

    @Override
    public boolean ah() {
        boolean bl;
        if (ai.lIlIIIIlIIlII(Skills.getLevel((Skill)Skill.FLETCHING), lIlllllIlI[2])) {
            bl = lIlllllIlI[1];
            "".length();
            if (null != null) {
                return ((0x97 ^ 0x8C ^ (0x83 ^ 0x89)) & (0xEA ^ 0xC4 ^ (0x54 ^ 0x6B) ^ -" ".length())) != 0;
            }
        } else {
            bl = lIlllllIlI[0];
        }
        return bl;
    }

    private static String lIlIIIIIllIlI(String llllllllllllllllllIlllIIIlIIIlll, String llllllllllllllllllIlllIIIlIIlIll) {
        llllllllllllllllllIlllIIIlIIIlll = new String(Base64.getDecoder().decode(llllllllllllllllllIlllIIIlIIIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllllIlllIIIlIIlIlI = new StringBuilder();
        char[] llllllllllllllllllIlllIIIlIIlIIl = llllllllllllllllllIlllIIIlIIlIll.toCharArray();
        int llllllllllllllllllIlllIIIlIIlIII = lIlllllIlI[0];
        char[] llllllllllllllllllIlllIIIlIIIIlI = llllllllllllllllllIlllIIIlIIIlll.toCharArray();
        int llllllllllllllllllIlllIIIlIIIIIl = llllllllllllllllllIlllIIIlIIIIlI.length;
        int llllllllllllllllllIlllIIIlIIIIII = lIlllllIlI[0];
        while (ai.lIlIIIIlIIIII(llllllllllllllllllIlllIIIlIIIIII, llllllllllllllllllIlllIIIlIIIIIl)) {
            char llllllllllllllllllIlllIIIlIIllIl = llllllllllllllllllIlllIIIlIIIIlI[llllllllllllllllllIlllIIIlIIIIII];
            llllllllllllllllllIlllIIIlIIlIlI.append((char)(llllllllllllllllllIlllIIIlIIllIl ^ llllllllllllllllllIlllIIIlIIlIIl[llllllllllllllllllIlllIIIlIIlIII % llllllllllllllllllIlllIIIlIIlIIl.length]));
            "".length();
            ++llllllllllllllllllIlllIIIlIIlIII;
            ++llllllllllllllllllIlllIIIlIIIIII;
            "".length();
            if (((0x74 ^ 0x72) & ~(0x7A ^ 0x7C)) <= " ".length()) continue;
            return null;
        }
        return String.valueOf(llllllllllllllllllIlllIIIlIIlIlI);
    }

    private static boolean lIlIIIIIlllll(int n2) {
        return n2 != 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean an() {
        int n2;
        if (ai.lIlIIIIlIIlII(Skills.getLevel((Skill)Skill.FLETCHING), lIlllllIlI[7]) && ai.lIlIIIIlIIIII(Skills.getLevel((Skill)Skill.FLETCHING), lIlllllIlI[11])) {
            int n3;
            int[] nArray = new int[lIlllllIlI[1]];
            nArray[ai.lIlllllIlI[0]] = lIlllllIlI[8];
            if (ai.lIlIIIIlIIIll(Inventory.getCount((int[])nArray))) {
                int[] nArray2 = new int[lIlllllIlI[1]];
                nArray2[ai.lIlllllIlI[0]] = lIlllllIlI[12];
                if (ai.lIlIIIIlIIIll(Inventory.getCount((int[])nArray2))) {
                    n3 = lIlllllIlI[1];
                    "".length();
                    if (-" ".length() != "   ".length()) return n3 != 0;
                    return ((0x3A ^ 0x5B) & ~(0xEB ^ 0x8A)) != 0;
                }
            }
            n3 = lIlllllIlI[0];
            return n3 != 0;
        }
        if (ai.lIlIIIIlIIlII(Skills.getLevel((Skill)Skill.FLETCHING), lIlllllIlI[11])) {
            int n4;
            int[] nArray = new int[lIlllllIlI[1]];
            nArray[ai.lIlllllIlI[0]] = lIlllllIlI[14];
            if (ai.lIlIIIIlIIIll(Inventory.getCount((int[])nArray))) {
                int[] nArray3 = new int[lIlllllIlI[1]];
                nArray3[ai.lIlllllIlI[0]] = ai.fx();
                if (ai.lIlIIIIlIIIll(Inventory.getCount((int[])nArray3))) {
                    n4 = lIlllllIlI[1];
                    "".length();
                    if (null == null) return n4 != 0;
                    return ((0x84 ^ 0x9F) & ~(0x16 ^ 0xD)) != 0;
                }
            }
            n4 = lIlllllIlI[0];
            return n4 != 0;
        }
        int[] nArray = new int[lIlllllIlI[1]];
        nArray[ai.lIlllllIlI[0]] = lIlllllIlI[8];
        if (ai.lIlIIIIlIIIll(Inventory.getCount((int[])nArray))) {
            int[] nArray4 = new int[lIlllllIlI[1]];
            nArray4[ai.lIlllllIlI[0]] = lIlllllIlI[9];
            if (ai.lIlIIIIlIIIll(Inventory.getCount((int[])nArray4))) {
                n2 = lIlllllIlI[1];
                "".length();
                if ("  ".length() > 0) return n2 != 0;
                return ((0x92 ^ 0xB3) & ~(0x93 ^ 0xB2)) != 0;
            }
        }
        n2 = lIlllllIlI[0];
        return n2 != 0;
    }

    private static int fx() {
        if (ai.lIlIIIIlIIlII(Skills.getLevel((Skill)Skill.FLETCHING), lIlllllIlI[27])) {
            return lIlllllIlI[31];
        }
        if (ai.lIlIIIIlIIlII(Skills.getLevel((Skill)Skill.FLETCHING), lIlllllIlI[20]) && ai.lIlIIIIlIIIII(Skills.getLevel((Skill)Skill.FLETCHING), lIlllllIlI[27])) {
            return lIlllllIlI[32];
        }
        if (ai.lIlIIIIlIIlII(Skills.getLevel((Skill)Skill.FLETCHING), lIlllllIlI[11]) && ai.lIlIIIIlIIIII(Skills.getLevel((Skill)Skill.FLETCHING), lIlllllIlI[20])) {
            return lIlllllIlI[33];
        }
        if (ai.lIlIIIIlIIIII(Skills.getLevel((Skill)Skill.FLETCHING), lIlllllIlI[12])) {
            return lIlllllIlI[8];
        }
        return lIlllllIlI[0];
    }

    private static int fw() {
        if (ai.lIlIIIIlIIlII(Skills.getLevel((Skill)Skill.FLETCHING), lIlllllIlI[11])) {
            return lIlllllIlI[14];
        }
        if (ai.lIlIIIIlIIlII(Skills.getLevel((Skill)Skill.FLETCHING), lIlllllIlI[7]) && ai.lIlIIIIlIIIII(Skills.getLevel((Skill)Skill.FLETCHING), lIlllllIlI[11])) {
            return lIlllllIlI[12];
        }
        if (ai.lIlIIIIlIIIII(Skills.getLevel((Skill)Skill.FLETCHING), lIlllllIlI[7])) {
            return lIlllllIlI[9];
        }
        return lIlllllIlI[0];
    }

    private static String lIlIIIIIllIII(String llllllllllllllllllIlllIIIIllIlIl, String llllllllllllllllllIlllIIIIllIlII) {
        try {
            SecretKeySpec llllllllllllllllllIlllIIIIlllIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllllIlllIIIIllIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllllIlllIIIIlllIIl = Cipher.getInstance("Blowfish");
            llllllllllllllllllIlllIIIIlllIIl.init(lIlllllIlI[3], llllllllllllllllllIlllIIIIlllIlI);
            return new String(llllllllllllllllllIlllIIIIlllIIl.doFinal(Base64.getDecoder().decode(llllllllllllllllllIlllIIIIllIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllllIlllIIIIlllIII) {
            llllllllllllllllllIlllIIIIlllIII.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean ae() {
        return lIlllllIlI[0];
    }

    @Override
    public int af() {
        ai.fv();
        return lIlllllIlI[43];
    }

    private static boolean lIlIIIIlIIlII(int n2, int n3) {
        return n2 >= n3;
    }

    public static void fv() {
        block29: {
            BankLocation llllllllllllllllllIlllIIIlIlllII;
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
                                                            if (ai.lIlIIIIIlllll(bt ? 1 : 0)) {
                                                                AccBuilderSotf.c = lIlllllIII[lIlllllIlI[0]];
                                                                b.a(bv);
                                                                if (ai.lIlIIIIlIIIII(bv.size(), lIlllllIlI[1])) {
                                                                    System.out.println(lIlllllIII[lIlllllIlI[1]]);
                                                                    bt = lIlllllIlI[0];
                                                                }
                                                            }
                                                            if (!ai.lIlIIIIlIIIIl(bt ? 1 : 0) || !ai.lIlIIIIlIIIII(Skills.getLevel((Skill)Skill.FLETCHING), lIlllllIlI[2])) break block29;
                                                            if (!ai.lIlIIIIlIIIIl(ai.an() ? 1 : 0)) break block30;
                                                            llllllllllllllllllIlllIIIlIlllII = BankLocation.getNearest();
                                                            if (ai.lIlIIIIlIIIlI(llllllllllllllllllIlllIIIlIlllII) && ai.lIlIIIIlIIIIl(llllllllllllllllllIlllIIIlIlllII.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                                                AccBuilderSotf.c = lIlllllIII[lIlllllIlI[3]];
                                                                a.a(llllllllllllllllllIlllIIIlIlllII);
                                                            }
                                                            if (!ai.lIlIIIIlIIIlI(llllllllllllllllllIlllIIIlIlllII) || !ai.lIlIIIIIlllll(llllllllllllllllllIlllIIIlIlllII.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block30;
                                                            if (ai.lIlIIIIlIIIIl(Bank.isOpen() ? 1 : 0)) {
                                                                AccBuilderSotf.c = lIlllllIII[lIlllllIlI[4]];
                                                                a.a();
                                                                Time.sleepUntil(() -> Bank.isOpen(), (int)lIlllllIlI[5]);
                                                                "".length();
                                                            }
                                                            if (!ai.lIlIIIIIlllll(Bank.isOpen() ? 1 : 0)) break block30;
                                                            AccBuilderSotf.c = lIlllllIII[lIlllllIlI[6]];
                                                            if (ai.lIlIIIIlIIIll(Inventory.getAll().size())) {
                                                                Bank.depositInventory();
                                                                Time.sleepTicks((int)lIlllllIlI[6]);
                                                                "".length();
                                                            }
                                                            if (ai.lIlIIIIlIIIll(Equipment.getAll().size())) {
                                                                Bank.depositEquipment();
                                                                Time.sleepTicks((int)lIlllllIlI[3]);
                                                                "".length();
                                                            }
                                                            if (!ai.lIlIIIIlIIIII(Skills.getLevel((Skill)Skill.FLETCHING), lIlllllIlI[7])) break block31;
                                                            int[] nArray = new int[lIlllllIlI[1]];
                                                            nArray[ai.lIlllllIlI[0]] = lIlllllIlI[8];
                                                            if (!ai.lIlIIIIlIIIIl(Bank.contains((int[])nArray) ? 1 : 0)) break block32;
                                                            int[] nArray2 = new int[lIlllllIlI[1]];
                                                            nArray2[ai.lIlllllIlI[0]] = lIlllllIlI[8];
                                                            if (!ai.lIlIIIIIlllll(Inventory.contains((int[])nArray2) ? 1 : 0)) break block33;
                                                        }
                                                        int[] nArray = new int[lIlllllIlI[1]];
                                                        nArray[ai.lIlllllIlI[0]] = lIlllllIlI[9];
                                                        if (!ai.lIlIIIIlIIIIl(Bank.contains((int[])nArray) ? 1 : 0)) break block34;
                                                        int[] nArray3 = new int[lIlllllIlI[1]];
                                                        nArray3[ai.lIlllllIlI[0]] = lIlllllIlI[9];
                                                        if (!ai.lIlIIIIlIIIIl(Inventory.contains((int[])nArray3) ? 1 : 0)) break block34;
                                                    }
                                                    ai.Q();
                                                    System.out.println(lIlllllIII[lIlllllIlI[10]]);
                                                    bt = lIlllllIlI[1];
                                                    return;
                                                }
                                                Bank.withdrawAll((int)lIlllllIlI[8], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                                Time.sleepTicks((int)lIlllllIlI[1]);
                                                "".length();
                                                Time.sleepUntil(() -> {
                                                    boolean bl;
                                                    int[] nArray = new int[lIlllllIlI[1]];
                                                    nArray[ai.lIlllllIlI[0]] = lIlllllIlI[8];
                                                    if (ai.lIlIIIIlIIIll(Inventory.getCount((int[])nArray))) {
                                                        bl = lIlllllIlI[1];
                                                        "".length();
                                                        if (" ".length() == 0) {
                                                            return ((119 + 136 - 97 + 50 ^ 89 + 156 - 241 + 193) & (0x87 ^ 0xC5 ^ (0x6C ^ 0x3B) ^ -" ".length())) != 0;
                                                        }
                                                    } else {
                                                        bl = lIlllllIlI[0];
                                                    }
                                                    return bl;
                                                }, (int)lIlllllIlI[5]);
                                                "".length();
                                                Bank.withdrawAll((int)lIlllllIlI[9], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                                Time.sleepTicks((int)lIlllllIlI[1]);
                                                "".length();
                                                Time.sleepUntil(() -> {
                                                    boolean bl;
                                                    int[] nArray = new int[lIlllllIlI[1]];
                                                    nArray[ai.lIlllllIlI[0]] = lIlllllIlI[9];
                                                    if (ai.lIlIIIIlIIIll(Inventory.getCount((int[])nArray))) {
                                                        bl = lIlllllIlI[1];
                                                        "".length();
                                                        if (" ".length() > "  ".length()) {
                                                            return ((0xA ^ 0x38 ^ (0x79 ^ 0x59)) & ((0x43 ^ 0x5C) & ~(0xBC ^ 0xA3) ^ (0x48 ^ 0x5A) ^ -" ".length())) != 0;
                                                        }
                                                    } else {
                                                        bl = lIlllllIlI[0];
                                                    }
                                                    return bl;
                                                }, (int)lIlllllIlI[5]);
                                                "".length();
                                            }
                                            if (!ai.lIlIIIIlIIlII(Skills.getLevel((Skill)Skill.FLETCHING), lIlllllIlI[7]) || !ai.lIlIIIIlIIIII(Skills.getLevel((Skill)Skill.FLETCHING), lIlllllIlI[11])) break block35;
                                            int[] nArray = new int[lIlllllIlI[1]];
                                            nArray[ai.lIlllllIlI[0]] = lIlllllIlI[8];
                                            if (!ai.lIlIIIIlIIIIl(Bank.contains((int[])nArray) ? 1 : 0)) break block36;
                                            int[] nArray4 = new int[lIlllllIlI[1]];
                                            nArray4[ai.lIlllllIlI[0]] = lIlllllIlI[8];
                                            if (!ai.lIlIIIIIlllll(Inventory.contains((int[])nArray4) ? 1 : 0)) break block37;
                                        }
                                        int[] nArray = new int[lIlllllIlI[1]];
                                        nArray[ai.lIlllllIlI[0]] = lIlllllIlI[12];
                                        if (!ai.lIlIIIIlIIIIl(Bank.contains((int[])nArray) ? 1 : 0)) break block38;
                                        int[] nArray5 = new int[lIlllllIlI[1]];
                                        nArray5[ai.lIlllllIlI[0]] = lIlllllIlI[12];
                                        if (!ai.lIlIIIIlIIIIl(Inventory.contains((int[])nArray5) ? 1 : 0)) break block38;
                                    }
                                    ai.Q();
                                    System.out.println(lIlllllIII[lIlllllIlI[13]]);
                                    bt = lIlllllIlI[1];
                                    return;
                                }
                                Bank.withdrawAll((int)lIlllllIlI[8], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                Time.sleepTicks((int)lIlllllIlI[1]);
                                "".length();
                                Time.sleepUntil(() -> {
                                    boolean bl;
                                    int[] nArray = new int[lIlllllIlI[1]];
                                    nArray[ai.lIlllllIlI[0]] = lIlllllIlI[8];
                                    if (ai.lIlIIIIlIIIll(Inventory.getCount((int[])nArray))) {
                                        bl = lIlllllIlI[1];
                                        "".length();
                                        if ("   ".length() > "   ".length()) {
                                            return ((156 + 115 - 256 + 170 ^ 88 + 107 - 92 + 37) & (66 + 173 - 117 + 122 ^ 166 + 115 - 233 + 145 ^ -" ".length())) != 0;
                                        }
                                    } else {
                                        bl = lIlllllIlI[0];
                                    }
                                    return bl;
                                }, (int)lIlllllIlI[5]);
                                "".length();
                                Bank.withdrawAll((int)lIlllllIlI[12], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                Time.sleepTicks((int)lIlllllIlI[1]);
                                "".length();
                                Time.sleepUntil(() -> {
                                    boolean bl;
                                    int[] nArray = new int[lIlllllIlI[1]];
                                    nArray[ai.lIlllllIlI[0]] = lIlllllIlI[12];
                                    if (ai.lIlIIIIlIIIll(Inventory.getCount((int[])nArray))) {
                                        bl = lIlllllIlI[1];
                                        "".length();
                                        if ((0x7B ^ 0x7F) <= "   ".length()) {
                                            return ((0x9C ^ 0x8D) & ~(0x98 ^ 0x89)) != 0;
                                        }
                                    } else {
                                        bl = lIlllllIlI[0];
                                    }
                                    return bl;
                                }, (int)lIlllllIlI[5]);
                                "".length();
                            }
                            if (!ai.lIlIIIIlIIlII(Skills.getLevel((Skill)Skill.FLETCHING), lIlllllIlI[11])) break block30;
                            int[] nArray = new int[lIlllllIlI[1]];
                            nArray[ai.lIlllllIlI[0]] = lIlllllIlI[14];
                            if (!ai.lIlIIIIlIIIIl(Bank.contains((int[])nArray) ? 1 : 0)) break block39;
                            int[] nArray6 = new int[lIlllllIlI[1]];
                            nArray6[ai.lIlllllIlI[0]] = lIlllllIlI[14];
                            if (!ai.lIlIIIIlIIlII(Inventory.getCount((int[])nArray6), lIlllllIlI[1])) break block40;
                        }
                        int[] nArray = new int[lIlllllIlI[1]];
                        nArray[ai.lIlllllIlI[0]] = ai.fx();
                        if (!ai.lIlIIIIlIIIIl(Bank.contains((int[])nArray) ? 1 : 0)) break block41;
                        int[] nArray7 = new int[lIlllllIlI[1]];
                        nArray7[ai.lIlllllIlI[0]] = ai.fx();
                        if (!ai.lIlIIIIlIIIII(Inventory.getCount((int[])nArray7), lIlllllIlI[1])) break block41;
                    }
                    ai.Q();
                    System.out.println(lIlllllIII[lIlllllIlI[15]]);
                    bt = lIlllllIlI[1];
                    return;
                }
                int[] nArray = new int[lIlllllIlI[1]];
                nArray[ai.lIlllllIlI[0]] = lIlllllIlI[14];
                if (ai.lIlIIIIlIIIII(Inventory.getCount((int[])nArray), lIlllllIlI[1])) {
                    Bank.withdraw((int)lIlllllIlI[14], (int)lIlllllIlI[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                    Time.sleepTicks((int)lIlllllIlI[1]);
                    "".length();
                    Time.sleepUntil(() -> {
                        boolean bl;
                        int[] nArray = new int[lIlllllIlI[1]];
                        nArray[ai.lIlllllIlI[0]] = lIlllllIlI[14];
                        if (ai.lIlIIIIlIIIll(Inventory.getCount((int[])nArray))) {
                            bl = lIlllllIlI[1];
                            "".length();
                            if ((0x36 ^ 0x32) != (0x5E ^ 0x5A)) {
                                return ((0xCC ^ 0x95) & ~(0x55 ^ 0xC)) != 0;
                            }
                        } else {
                            bl = lIlllllIlI[0];
                        }
                        return bl;
                    }, (int)lIlllllIlI[5]);
                    "".length();
                }
                int[] nArray8 = new int[lIlllllIlI[1]];
                nArray8[ai.lIlllllIlI[0]] = lIlllllIlI[14];
                if (ai.lIlIIIIlIIIll(Inventory.getCount((int[])nArray8))) {
                    Bank.withdrawAll((int)ai.fx(), (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                    Time.sleepTicks((int)lIlllllIlI[1]);
                    "".length();
                    Time.sleepUntil(() -> {
                        boolean bl;
                        int[] nArray = new int[lIlllllIlI[1]];
                        nArray[ai.lIlllllIlI[0]] = ai.fx();
                        if (ai.lIlIIIIlIIIll(Inventory.getCount((int[])nArray))) {
                            bl = lIlllllIlI[1];
                            "".length();
                            if (-" ".length() > 0) {
                                return ((49 + 42 - 33 + 90 ^ 12 + 106 - -43 + 19) & (0xDD ^ 0x9D ^ (0xEE ^ 0x8E) ^ -" ".length())) != 0;
                            }
                        } else {
                            bl = lIlllllIlI[0];
                        }
                        return bl;
                    }, (int)lIlllllIlI[5]);
                    "".length();
                }
            }
            if (ai.lIlIIIIIlllll(ai.an() ? 1 : 0)) {
                if (ai.lIlIIIIIlllll(Bank.isOpen() ? 1 : 0)) {
                    Bank.close();
                }
                if (ai.lIlIIIIlIIIIl(Bank.isOpen() ? 1 : 0) && ai.lIlIIIIlIIIIl(Players.getLocal().isAnimating() ? 1 : 0)) {
                    if (ai.lIlIIIIIlllll(GrandExchange.isOpen() ? 1 : 0)) {
                        GrandExchange.openBank();
                    }
                    if (ai.lIlIIIIlIIIIl(Production.isOpen() ? 1 : 0)) {
                        AccBuilderSotf.c = lIlllllIII[lIlllllIlI[16]];
                        int[] nArray = new int[lIlllllIlI[1]];
                        nArray[ai.lIlllllIlI[0]] = ai.fw();
                        llllllllllllllllllIlllIIIlIlllII = Inventory.getFirst((int[])nArray);
                        int[] nArray9 = new int[lIlllllIlI[1]];
                        nArray9[ai.lIlllllIlI[0]] = ai.fx();
                        Item llllllllllllllllllIlllIIIlIllIll = Inventory.getFirst((int[])nArray9);
                        if (ai.lIlIIIIlIIIlI(llllllllllllllllllIlllIIIlIlllII) && ai.lIlIIIIlIIIlI(llllllllllllllllllIlllIIIlIllIll)) {
                            Time.sleepTicks((int)lIlllllIlI[4]);
                            "".length();
                            llllllllllllllllllIlllIIIlIlllII.useOn(llllllllllllllllllIlllIIIlIllIll);
                            Time.sleepUntil(() -> Production.isOpen(), (int)lIlllllIlI[5]);
                            "".length();
                        }
                    }
                    if (ai.lIlIIIIIlllll(Production.isOpen() ? 1 : 0)) {
                        if (ai.lIlIIIIlIIIII(Skills.getLevel((Skill)Skill.FLETCHING), lIlllllIlI[11])) {
                            AccBuilderSotf.c = lIlllllIII[lIlllllIlI[17]];
                            Production.chooseOption((int)lIlllllIlI[1]);
                            Time.sleepTicks((int)lIlllllIlI[13]);
                            "".length();
                            Time.sleepUntil(() -> {
                                boolean bl;
                                if (!ai.lIlIIIIlIIIIl(Dialog.isOpen() ? 1 : 0) || ai.lIlIIIIIlllll(Dialog.canLevelUpContinue() ? 1 : 0)) {
                                    bl = lIlllllIlI[1];
                                    "".length();
                                    if (" ".length() == 0) {
                                        return ((0x65 ^ 0x30) & ~(0x6E ^ 0x3B)) != 0;
                                    }
                                } else {
                                    bl = lIlllllIlI[0];
                                }
                                return bl;
                            }, (int)e.c(lIlllllIlI[18], lIlllllIlI[19]));
                            "".length();
                        }
                        if (ai.lIlIIIIlIIlII(Skills.getLevel((Skill)Skill.FLETCHING), lIlllllIlI[11]) && ai.lIlIIIIlIIIII(Skills.getLevel((Skill)Skill.FLETCHING), lIlllllIlI[20])) {
                            AccBuilderSotf.c = lIlllllIII[lIlllllIlI[21]];
                            Production.chooseOption((String)lIlllllIII[lIlllllIlI[22]]);
                            Time.sleepTicks((int)lIlllllIlI[13]);
                            "".length();
                            Time.sleepUntil(() -> {
                                int n2;
                                block3: {
                                    block2: {
                                        if (!ai.lIlIIIIlIIIIl(Dialog.isOpen() ? 1 : 0)) break block2;
                                        int[] nArray = new int[lIlllllIlI[1]];
                                        nArray[ai.lIlllllIlI[0]] = lIlllllIlI[33];
                                        if (!ai.lIlIIIIlIIIII(Inventory.getCount((int[])nArray), lIlllllIlI[1])) break block3;
                                    }
                                    n2 = lIlllllIlI[1];
                                    "".length();
                                    if ("  ".length() > -" ".length()) return n2 != 0;
                                    return ((0x40 ^ 0x22) & ~(0xC3 ^ 0xA1)) != 0;
                                }
                                n2 = lIlllllIlI[0];
                                return n2 != 0;
                            }, (int)e.c(lIlllllIlI[23], lIlllllIlI[24]));
                            "".length();
                        }
                        if (ai.lIlIIIIlIIlII(Skills.getLevel((Skill)Skill.FLETCHING), lIlllllIlI[20]) && ai.lIlIIIIlIIIII(Skills.getLevel((Skill)Skill.FLETCHING), lIlllllIlI[12])) {
                            AccBuilderSotf.c = lIlllllIII[lIlllllIlI[25]];
                            Production.chooseOption((String)lIlllllIII[lIlllllIlI[26]]);
                            Time.sleepTicks((int)lIlllllIlI[13]);
                            "".length();
                            Time.sleepUntil(() -> {
                                boolean bl;
                                block3: {
                                    block2: {
                                        if (!ai.lIlIIIIlIIIIl(Dialog.isOpen() ? 1 : 0)) break block2;
                                        int[] nArray = new int[lIlllllIlI[1]];
                                        nArray[ai.lIlllllIlI[0]] = lIlllllIlI[32];
                                        if (!ai.lIlIIIIlIIIII(Inventory.getCount((int[])nArray), lIlllllIlI[1])) break block3;
                                    }
                                    bl = lIlllllIlI[1];
                                    "".length();
                                    if (((0x47 ^ 0x40 ^ (0xF ^ 0x29)) & (6 ^ 0x3A ^ (0x85 ^ 0x98) ^ -" ".length())) != "   ".length()) return bl;
                                    return ((0xE0 ^ 0x91 ^ (3 ^ 0x3E)) & (0xA6 ^ 0xB2 ^ (0x29 ^ 0x71) ^ -" ".length())) != 0;
                                }
                                bl = lIlllllIlI[0];
                                return bl;
                            }, (int)e.c(lIlllllIlI[23], lIlllllIlI[24]));
                            "".length();
                        }
                        if (ai.lIlIIIIlIIlII(Skills.getLevel((Skill)Skill.FLETCHING), lIlllllIlI[12]) && ai.lIlIIIIlIIIII(Skills.getLevel((Skill)Skill.FLETCHING), lIlllllIlI[27])) {
                            AccBuilderSotf.c = lIlllllIII[lIlllllIlI[28]];
                            Production.chooseOption((String)lIlllllIII[lIlllllIlI[7]]);
                            Time.sleepTicks((int)lIlllllIlI[13]);
                            "".length();
                            Time.sleepUntil(() -> {
                                int n2;
                                block3: {
                                    block2: {
                                        if (!ai.lIlIIIIlIIIIl(Dialog.isOpen() ? 1 : 0)) break block2;
                                        int[] nArray = new int[lIlllllIlI[1]];
                                        nArray[ai.lIlllllIlI[0]] = lIlllllIlI[32];
                                        if (!ai.lIlIIIIlIIIII(Inventory.getCount((int[])nArray), lIlllllIlI[1])) break block3;
                                    }
                                    n2 = lIlllllIlI[1];
                                    "".length();
                                    if ("   ".length() != 0) return n2 != 0;
                                    return ((0x32 ^ 0x19 ^ (0x51 ^ 0x69)) & (0x34 ^ 0x3E ^ (0x7A ^ 0x63) ^ -" ".length())) != 0;
                                }
                                n2 = lIlllllIlI[0];
                                return n2 != 0;
                            }, (int)e.c(lIlllllIlI[23], lIlllllIlI[24]));
                            "".length();
                        }
                        if (ai.lIlIIIIlIIlII(Skills.getLevel((Skill)Skill.FLETCHING), lIlllllIlI[27])) {
                            AccBuilderSotf.c = lIlllllIII[lIlllllIlI[29]];
                            Production.chooseOption((String)lIlllllIII[lIlllllIlI[30]]);
                            Time.sleepTicks((int)lIlllllIlI[13]);
                            "".length();
                            Time.sleepUntil(() -> {
                                int n2;
                                block3: {
                                    block2: {
                                        if (!ai.lIlIIIIlIIIIl(Dialog.isOpen() ? 1 : 0)) break block2;
                                        int[] nArray = new int[lIlllllIlI[1]];
                                        nArray[ai.lIlllllIlI[0]] = lIlllllIlI[31];
                                        if (!ai.lIlIIIIlIIIII(Inventory.getCount((int[])nArray), lIlllllIlI[1])) break block3;
                                    }
                                    n2 = lIlllllIlI[1];
                                    "".length();
                                    if ("   ".length() == "   ".length()) return n2 != 0;
                                    return ((0x24 ^ 0x21) & ~(0xBC ^ 0xB9)) != 0;
                                }
                                n2 = lIlllllIlI[0];
                                return n2 != 0;
                            }, (int)e.c(lIlllllIlI[23], lIlllllIlI[24]));
                            "".length();
                        }
                    }
                }
            }
        }
    }

    private static void Q() {
        d llllllllllllllllllIlllIIIlIlIlll;
        Object llllllllllllllllllIlllIIIlIllIII;
        if (ai.lIlIIIIlIIIII(Skills.getLevel((Skill)Skill.FLETCHING), lIlllllIlI[7])) {
            d d2 = new d(lIlllllIlI[8], lIlllllIlI[34], lIlllllIlI[12]);
            d d3 = new d(lIlllllIlI[9], lIlllllIlI[35], lIlllllIlI[36]);
            bv.add(d2);
            "".length();
            bv.add(d3);
            "".length();
        }
        if (ai.lIlIIIIlIIlII(Skills.getLevel((Skill)Skill.FLETCHING), lIlllllIlI[7]) && ai.lIlIIIIlIIIII(Skills.getLevel((Skill)Skill.FLETCHING), lIlllllIlI[11])) {
            llllllllllllllllllIlllIIIlIllIII = new d(lIlllllIlI[8], lIlllllIlI[34], lIlllllIlI[12]);
            llllllllllllllllllIlllIIIlIlIlll = new d(lIlllllIlI[12], lIlllllIlI[35], lIlllllIlI[37]);
            bv.add((d)llllllllllllllllllIlllIIIlIllIII);
            "".length();
            bv.add(llllllllllllllllllIlllIIIlIlIlll);
            "".length();
        }
        if (ai.lIlIIIIlIIlII(Skills.getLevel((Skill)Skill.FLETCHING), lIlllllIlI[11]) && ai.lIlIIIIlIIIII(Skills.getLevel((Skill)Skill.FLETCHING), lIlllllIlI[20])) {
            llllllllllllllllllIlllIIIlIllIII = new d(lIlllllIlI[33], lIlllllIlI[38], lIlllllIlI[2]);
            llllllllllllllllllIlllIIIlIlIlll = new d(lIlllllIlI[14], lIlllllIlI[1], lIlllllIlI[5]);
            bv.add((d)llllllllllllllllllIlllIIIlIllIII);
            "".length();
            bv.add(llllllllllllllllllIlllIIIlIlIlll);
            "".length();
        }
        if (ai.lIlIIIIlIIlII(Skills.getLevel((Skill)Skill.FLETCHING), lIlllllIlI[20]) && ai.lIlIIIIlIIIII(Skills.getLevel((Skill)Skill.FLETCHING), lIlllllIlI[27])) {
            llllllllllllllllllIlllIIIlIllIII = new d(lIlllllIlI[32], lIlllllIlI[34], lIlllllIlI[2]);
            llllllllllllllllllIlllIIIlIlIlll = new d(lIlllllIlI[14], lIlllllIlI[1], lIlllllIlI[5]);
            bv.add((d)llllllllllllllllllIlllIIIlIllIII);
            "".length();
            bv.add(llllllllllllllllllIlllIIIlIlIlll);
            "".length();
        }
        if (ai.lIlIIIIlIIlII(Skills.getLevel((Skill)Skill.FLETCHING), lIlllllIlI[27])) {
            llllllllllllllllllIlllIIIlIllIII = new d(lIlllllIlI[31], lIlllllIlI[34], lIlllllIlI[2]);
            llllllllllllllllllIlllIIIlIlIlll = new d(lIlllllIlI[14], lIlllllIlI[1], lIlllllIlI[5]);
            bv.add((d)llllllllllllllllllIlllIIIlIllIII);
            "".length();
            bv.add(llllllllllllllllllIlllIIIlIlIlll);
            "".length();
        }
        if (ai.lIlIIIIlIIIIl(Bank.contains((Predicate)(llllllllllllllllllIlllIIIlIllIII = item -> item.getName().toLowerCase().contains(lIlllllIII[lIlllllIlI[44]]))) ? 1 : 0)) {
            llllllllllllllllllIlllIIIlIlIlll = new d(lIlllllIlI[39], lIlllllIlI[10], lIlllllIlI[40]);
            bv.add(llllllllllllllllllIlllIIIlIlIlll);
            "".length();
        }
        int[] nArray = new int[lIlllllIlI[1]];
        nArray[ai.lIlllllIlI[0]] = lIlllllIlI[41];
        if (ai.lIlIIIIlIIIIl(Bank.contains((int[])nArray) ? 1 : 0)) {
            llllllllllllllllllIlllIIIlIlIlll = new d(lIlllllIlI[41], lIlllllIlI[12], lIlllllIlI[42]);
            bv.add(llllllllllllllllllIlllIIIlIlIlll);
            "".length();
        }
    }

    private static boolean lIlIIIIlIIIIl(int n2) {
        return n2 == 0;
    }

    private static boolean lIlIIIIlIIIll(int n2) {
        return n2 > 0;
    }

    private static void lIlIIIIIllllI() {
        lIlllllIlI = new int[50];
        ai.lIlllllIlI[0] = (0x61 ^ 0x6A ^ (0x92 ^ 0x95)) & (128 + 34 - 63 + 63 ^ 34 + 46 - -12 + 82 ^ -" ".length());
        ai.lIlllllIlI[1] = " ".length();
        ai.lIlllllIlI[2] = 0x41 ^ 0x7D;
        ai.lIlllllIlI[3] = "  ".length();
        ai.lIlllllIlI[4] = "   ".length();
        ai.lIlllllIlI[5] = 0xFFFFDFBC & 0x33CB;
        ai.lIlllllIlI[6] = 8 ^ 0x25 ^ (0xB8 ^ 0x91);
        ai.lIlllllIlI[7] = 0x99 ^ 0x96;
        ai.lIlllllIlI[8] = 0x35 ^ 0;
        ai.lIlllllIlI[9] = 0x34 ^ 0x18 ^ (0x64 ^ 0x6F);
        ai.lIlllllIlI[10] = 0xD4 ^ 0xBA ^ (0x7E ^ 0x15);
        ai.lIlllllIlI[11] = 0x84 ^ 0x9A;
        ai.lIlllllIlI[12] = 0xED ^ 0xC5;
        ai.lIlllllIlI[13] = 0x6A ^ 0x6C;
        ai.lIlllllIlI[14] = 0xFFFFBFFB & 0x43B6;
        ai.lIlllllIlI[15] = 0x4A ^ 9 ^ (0x34 ^ 0x70);
        ai.lIlllllIlI[16] = 0x25 ^ 0x2D;
        ai.lIlllllIlI[17] = 0xD ^ 0x2F ^ (0xAA ^ 0x81);
        ai.lIlllllIlI[18] = -(0xFFFFE067 & 0x5FBB) & (0xFFFFFFFE & 0x7CAF);
        ai.lIlllllIlI[19] = 0xFFFFCBFF & 0x7668;
        ai.lIlllllIlI[20] = 0x50 ^ 0x73;
        ai.lIlllllIlI[21] = 0x40 ^ 0x34 ^ (0xF0 ^ 0x8E);
        ai.lIlllllIlI[22] = 0x55 ^ 0x5E;
        ai.lIlllllIlI[23] = 0xFFFFADDD & 0x17EEA;
        ai.lIlllllIlI[24] = -(0xFFFFFA2F & 0x25FE) & (0xFFFFFFFF & 0x177ED);
        ai.lIlllllIlI[25] = 0x14 ^ 0x18;
        ai.lIlllllIlI[26] = 100 + 106 - 163 + 108 ^ 148 + 10 - 37 + 33;
        ai.lIlllllIlI[27] = 0x51 ^ 0x66;
        ai.lIlllllIlI[28] = 0x65 ^ 0x6B;
        ai.lIlllllIlI[29] = 8 ^ 0x65 ^ (0xC0 ^ 0xBD);
        ai.lIlllllIlI[30] = 0x35 ^ 0x24;
        ai.lIlllllIlI[31] = 0xFFFFD5EF & 0x2FFD;
        ai.lIlllllIlI[32] = 0xFFFF9FEF & 0x65FF;
        ai.lIlllllIlI[33] = 0xFFFFC5F1 & 0x3FFF;
        ai.lIlllllIlI[34] = 0xFFFF9FFA & 0x6BBD;
        ai.lIlllllIlI[35] = 0xFFFF9FD1 & 0x67FE;
        ai.lIlllllIlI[36] = 0x86 ^ 0x94;
        ai.lIlllllIlI[37] = 230 + 64 - 166 + 105 ^ 147 + 86 - 106 + 69;
        ai.lIlllllIlI[38] = -(0xFFFFBC13 & 0x77ED) & (0xFFFFB7E8 & Short.MAX_VALUE);
        ai.lIlllllIlI[39] = -(0xFFFFD7FF & 0x7923) & (0xFFFFFFFE & 0x7FEF);
        ai.lIlllllIlI[40] = 0xFFFFFFBD & 0x61EA;
        ai.lIlllllIlI[41] = -(0xFFFFFC97 & 0x23F9) & (0xFFFFBFF7 & 0x7FDF);
        ai.lIlllllIlI[42] = -(0xFFFFEDDE & 0x7E73) & (0xFFFFFFDD & 0x6FF7);
        ai.lIlllllIlI[43] = 0xDF ^ 0xA2 ^ (0x47 ^ 0x5E);
        ai.lIlllllIlI[44] = 0x4E ^ 0x5D;
        ai.lIlllllIlI[45] = 0xAE ^ 0x90;
        ai.lIlllllIlI[46] = 0xFFFFAB7F & 0x57D3;
        ai.lIlllllIlI[47] = 61 + 100 - 16 + 9 ^ 125 + 19 - -12 + 23;
        ai.lIlllllIlI[48] = 0xFFFFA6F9 & 0x5FF7;
        ai.lIlllllIlI[49] = 0x8F ^ 0x9B;
    }

    @Override
    public String ag() {
        return lIlllllIII[lIlllllIlI[36]];
    }
}

