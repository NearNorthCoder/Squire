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
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.a;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.ac;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.b;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.d;

public class au
implements ac {
    private static /* synthetic */ String[] llIlIlllII;
    public static final /* synthetic */ WorldArea ou;
    public static final /* synthetic */ int or;
    public static final /* synthetic */ WorldArea ot;
    public static final /* synthetic */ WorldPoint ov;
    public static final /* synthetic */ int oo;
    public static final /* synthetic */ int os;
    public static final /* synthetic */ int op;
    public static /* synthetic */ int[] ox;
    private static /* synthetic */ int[] llIlIlllIl;
    public static /* synthetic */ int[] ow;
    public static /* synthetic */ int[] oy;
    public static /* synthetic */ boolean bt;
    public static final /* synthetic */ int oq;
    public static /* synthetic */ List<d> bv;

    private static boolean lIllIlIlIIllI(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIllIlIlIIIlI(int n2, int n3) {
        return n2 < n3;
    }

    @Override
    public int af() {
        au.gs();
        return llIlIlllIl[34];
    }

    private static String lIllIlIIlllII(String llllllllllllllllllIIIllIIIIlllII, String llllllllllllllllllIIIllIIIIllIll) {
        try {
            SecretKeySpec llllllllllllllllllIIIllIIIlIIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllllIIIllIIIIllIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllllIIIllIIIlIIIII = Cipher.getInstance("Blowfish");
            llllllllllllllllllIIIllIIIlIIIII.init(llIlIlllIl[4], llllllllllllllllllIIIllIIIlIIIIl);
            return new String(llllllllllllllllllIIIllIIIlIIIII.doFinal(Base64.getDecoder().decode(llllllllllllllllllIIIllIIIIlllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllllIIIllIIIIlllll) {
            llllllllllllllllllIIIllIIIIlllll.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean ae() {
        return llIlIlllIl[0];
    }

    private static void lIllIlIIlllll() {
        llIlIlllII = new String[llIlIlllIl[52]];
        au.llIlIlllII[au.llIlIlllIl[0]] = au.lIllIlIIlllII("DcQiPWH0IE1ROZDdDQJXRQ==", "jjmZV");
        au.llIlIlllII[au.llIlIlllIl[1]] = au.lIllIlIIlllIl("xCCnRBnCkUMgXq5jTGy2Y9ZbXTCZRTJV+/Vtwv2rvzTWJSTQFp3jawVSM8PDs+TNLxFrN1JOkCM=", "tkMyz");
        au.llIlIlllII[au.llIlIlllIl[4]] = au.lIllIlIIllllI("AhggHgktDT8ZCWwNOVcMLRc9", "LyVwn");
        au.llIlIlllII[au.llIlIlllIl[5]] = au.lIllIlIIllllI("OBYNID0ZAUgsNRkN", "wfhNT");
        au.llIlIlllII[au.llIlIlllIl[7]] = au.lIllIlIIlllII("V4mK24vhNYbQzGNYVsNYvv0wrkykEJZu", "zOyfF");
        au.llIlIlllII[au.llIlIlllIl[13]] = au.lIllIlIIllllI("OxNSDwUJVh8HBB8fHAlXHB8RBRYUEwFCVx8BGxoUBB8cCVcYGVIsIjU/PCk=", "lvrnw");
        au.llIlIlllII[au.llIlIlllIl[14]] = au.lIllIlIIlllIl("Anj6upKYp+Dz41czEXNscA==", "HVCNT");
        au.llIlIlllII[au.llIlIlllIl[15]] = au.lIllIlIIlllII("q9m2FDc8/52kgm+q4NOOrA==", "yfFNf");
        au.llIlIlllII[au.llIlIlllIl[17]] = au.lIllIlIIlllIl("5O+0AbuwBWX0O1rKQdXD0l2aPd5Y+hLq", "RnchY");
        au.llIlIlllII[au.llIlIlllIl[18]] = au.lIllIlIIlllII("zIrODe8T2UG/R7NWSfkoSA==", "EhbNA");
        au.llIlIlllII[au.llIlIlllIl[19]] = au.lIllIlIIllllI("IR0YIz4LGxBzIg0SBA==", "buwSN");
        au.llIlIlllII[au.llIlIlllIl[20]] = au.lIllIlIIlllII("XV63vfqF8AF8Y29T6ZH7cg==", "tAwEG");
        au.llIlIlllII[au.llIlIlllIl[21]] = au.lIllIlIIlllIl("9VtfJNONRGQY8f/DllDExtVLWRamwR94", "ZaJWg");
        au.llIlIlllII[au.llIlIlllIl[22]] = au.lIllIlIIlllIl("pUuwi7FIvFPkTBigSAoA7Q==", "ayRIq");
        au.llIlIlllII[au.llIlIlllIl[23]] = au.lIllIlIIllllI("LD4iGgMGOCpKHA49bQYcCCU=", "oVMjs");
        au.llIlIlllII[au.llIlIlllIl[16]] = au.lIllIlIIlllII("yWlg/kc3I3WxaVVYiEAHYw==", "GPVTC");
        au.llIlIlllII[au.llIlIlllIl[35]] = au.lIllIlIIllllI("JTsqKREHIDEkHBU=", "rTEMr");
        au.llIlIlllII[au.llIlIlllIl[36]] = au.lIllIlIIlllII("ZD9p5d7ZDBRRbWsOfXiMDggDJzv/CHSc", "BeAsJ");
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean an() {
        int n2;
        if (au.lIllIlIlIIllI(Skills.getLevel((Skill)Skill.WOODCUTTING), llIlIlllIl[24])) {
            boolean bl;
            int[] nArray = new int[llIlIlllIl[1]];
            nArray[au.llIlIlllIl[0]] = llIlIlllIl[12];
            if (au.lIllIlIlIIlII(Inventory.getCount((int[])nArray))) {
                bl = llIlIlllIl[1];
                "".length();
                if (" ".length() != 0) return bl;
                return ((0xB0 ^ 0x83) & ~(0x66 ^ 0x55)) != 0;
            }
            bl = llIlIlllIl[0];
            return bl;
        }
        if (au.lIllIlIlIIllI(Skills.getLevel((Skill)Skill.WOODCUTTING), llIlIlllIl[25]) && au.lIllIlIlIIIlI(Skills.getLevel((Skill)Skill.WOODCUTTING), llIlIlllIl[24])) {
            int n3;
            int[] nArray = new int[llIlIlllIl[1]];
            nArray[au.llIlIlllIl[0]] = llIlIlllIl[12];
            if (au.lIllIlIlIIlII(Inventory.getCount((int[])nArray))) {
                int[] nArray2 = new int[llIlIlllIl[1]];
                nArray2[au.llIlIlllIl[0]] = llIlIlllIl[11];
                if (au.lIllIlIlIIlII(Inventory.getCount((int[])nArray2))) {
                    n3 = llIlIlllIl[1];
                    "".length();
                    if ("   ".length() != 0) return n3 != 0;
                    return ((0x17 ^ 0x2F) & ~(2 ^ 0x3A)) != 0;
                }
            }
            n3 = llIlIlllIl[0];
            return n3 != 0;
        }
        if (au.lIllIlIlIIllI(Skills.getLevel((Skill)Skill.WOODCUTTING), llIlIlllIl[26]) && au.lIllIlIlIIIlI(Skills.getLevel((Skill)Skill.WOODCUTTING), llIlIlllIl[25])) {
            int n4;
            int[] nArray = new int[llIlIlllIl[1]];
            nArray[au.llIlIlllIl[0]] = llIlIlllIl[12];
            if (au.lIllIlIlIIlII(Inventory.getCount((int[])nArray))) {
                int[] nArray3 = new int[llIlIlllIl[1]];
                nArray3[au.llIlIlllIl[0]] = llIlIlllIl[11];
                if (au.lIllIlIlIIlII(Inventory.getCount((int[])nArray3))) {
                    int[] nArray4 = new int[llIlIlllIl[1]];
                    nArray4[au.llIlIlllIl[0]] = llIlIlllIl[10];
                    if (au.lIllIlIlIIlII(Inventory.getCount((int[])nArray4))) {
                        n4 = llIlIlllIl[1];
                        "".length();
                        if ("   ".length() > ((0x4A ^ 6) & ~(0x1E ^ 0x52))) return n4 != 0;
                        return ("   ".length() & ~"   ".length()) != 0;
                    }
                }
            }
            n4 = llIlIlllIl[0];
            return n4 != 0;
        }
        if (au.lIllIlIlIIllI(Skills.getLevel((Skill)Skill.WOODCUTTING), llIlIlllIl[14]) && au.lIllIlIlIIIlI(Skills.getLevel((Skill)Skill.WOODCUTTING), llIlIlllIl[26])) {
            int n5;
            int[] nArray = new int[llIlIlllIl[1]];
            nArray[au.llIlIlllIl[0]] = llIlIlllIl[12];
            if (au.lIllIlIlIIlII(Inventory.getCount((int[])nArray))) {
                int[] nArray5 = new int[llIlIlllIl[1]];
                nArray5[au.llIlIlllIl[0]] = llIlIlllIl[11];
                if (au.lIllIlIlIIlII(Inventory.getCount((int[])nArray5))) {
                    int[] nArray6 = new int[llIlIlllIl[1]];
                    nArray6[au.llIlIlllIl[0]] = llIlIlllIl[10];
                    if (au.lIllIlIlIIlII(Inventory.getCount((int[])nArray6))) {
                        int[] nArray7 = new int[llIlIlllIl[1]];
                        nArray7[au.llIlIlllIl[0]] = llIlIlllIl[9];
                        if (au.lIllIlIlIIlII(Inventory.getCount((int[])nArray7))) {
                            n5 = llIlIlllIl[1];
                            "".length();
                            if (-"  ".length() < 0) return n5 != 0;
                            return ((0x4E ^ 0x56) & ~(0xDB ^ 0xC3)) != 0;
                        }
                    }
                }
            }
            n5 = llIlIlllIl[0];
            return n5 != 0;
        }
        int[] nArray = new int[llIlIlllIl[1]];
        nArray[au.llIlIlllIl[0]] = llIlIlllIl[12];
        if (au.lIllIlIlIIlII(Inventory.getCount((int[])nArray))) {
            int[] nArray8 = new int[llIlIlllIl[1]];
            nArray8[au.llIlIlllIl[0]] = llIlIlllIl[11];
            if (au.lIllIlIlIIlII(Inventory.getCount((int[])nArray8))) {
                int[] nArray9 = new int[llIlIlllIl[1]];
                nArray9[au.llIlIlllIl[0]] = llIlIlllIl[10];
                if (au.lIllIlIlIIlII(Inventory.getCount((int[])nArray9))) {
                    int[] nArray10 = new int[llIlIlllIl[1]];
                    nArray10[au.llIlIlllIl[0]] = llIlIlllIl[9];
                    if (au.lIllIlIlIIlII(Inventory.getCount((int[])nArray10))) {
                        int[] nArray11 = new int[llIlIlllIl[1]];
                        nArray11[au.llIlIlllIl[0]] = llIlIlllIl[8];
                        if (au.lIllIlIlIIlII(Inventory.getCount((int[])nArray11))) {
                            n2 = llIlIlllIl[1];
                            "".length();
                            if (-"   ".length() <= 0) return n2 != 0;
                            return ((0x78 ^ 0xE ^ (0x33 ^ 0)) & (0x51 ^ 0x55 ^ (0x87 ^ 0xC6) ^ -" ".length())) != 0;
                        }
                    }
                }
            }
        }
        n2 = llIlIlllIl[0];
        return n2 != 0;
    }

    private static String lIllIlIIllllI(String llllllllllllllllllIIIllIIIIIlllI, String llllllllllllllllllIIIllIIIIIlIII) {
        llllllllllllllllllIIIllIIIIIlllI = new String(Base64.getDecoder().decode(llllllllllllllllllIIIllIIIIIlllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllllIIIllIIIIIllII = new StringBuilder();
        char[] llllllllllllllllllIIIllIIIIIlIll = llllllllllllllllllIIIllIIIIIlIII.toCharArray();
        int llllllllllllllllllIIIllIIIIIlIlI = llIlIlllIl[0];
        char[] llllllllllllllllllIIIllIIIIIIlII = llllllllllllllllllIIIllIIIIIlllI.toCharArray();
        int llllllllllllllllllIIIllIIIIIIIll = llllllllllllllllllIIIllIIIIIIlII.length;
        int llllllllllllllllllIIIllIIIIIIIlI = llIlIlllIl[0];
        while (au.lIllIlIlIIIlI(llllllllllllllllllIIIllIIIIIIIlI, llllllllllllllllllIIIllIIIIIIIll)) {
            char llllllllllllllllllIIIllIIIIIllll = llllllllllllllllllIIIllIIIIIIlII[llllllllllllllllllIIIllIIIIIIIlI];
            llllllllllllllllllIIIllIIIIIllII.append((char)(llllllllllllllllllIIIllIIIIIllll ^ llllllllllllllllllIIIllIIIIIlIll[llllllllllllllllllIIIllIIIIIlIlI % llllllllllllllllllIIIllIIIIIlIll.length]));
            "".length();
            ++llllllllllllllllllIIIllIIIIIlIlI;
            ++llllllllllllllllllIIIllIIIIIIIlI;
            "".length();
            if ("   ".length() > ((0xB3 ^ 0x96 ^ (0x5D ^ 0x67)) & (0x22 ^ 0x75 ^ (0xED ^ 0xA5) ^ -" ".length()))) continue;
            return null;
        }
        return String.valueOf(llllllllllllllllllIIIllIIIIIllII);
    }

    public static void Q() {
        d llllllllllllllllllIIIllIIIlIIllI;
        Object llllllllllllllllllIIIllIIIlIIlll;
        int[] nArray = new int[llIlIlllIl[1]];
        nArray[au.llIlIlllIl[0]] = llIlIlllIl[8];
        if (au.lIllIlIlIIIll(Bank.contains((int[])nArray) ? 1 : 0)) {
            d d2 = new d(llIlIlllIl[8], llIlIlllIl[1], llIlIlllIl[6]);
            bv.add(d2);
            "".length();
        }
        int[] nArray2 = new int[llIlIlllIl[1]];
        nArray2[au.llIlIlllIl[0]] = llIlIlllIl[9];
        if (au.lIllIlIlIIIll(Bank.contains((int[])nArray2) ? 1 : 0)) {
            llllllllllllllllllIIIllIIIlIIlll = new d(llIlIlllIl[9], llIlIlllIl[1], llIlIlllIl[6]);
            bv.add((d)llllllllllllllllllIIIllIIIlIIlll);
            "".length();
        }
        int[] nArray3 = new int[llIlIlllIl[1]];
        nArray3[au.llIlIlllIl[0]] = llIlIlllIl[10];
        if (au.lIllIlIlIIIll(Bank.contains((int[])nArray3) ? 1 : 0)) {
            llllllllllllllllllIIIllIIIlIIlll = new d(llIlIlllIl[10], llIlIlllIl[1], llIlIlllIl[27]);
            bv.add((d)llllllllllllllllllIIIllIIIlIIlll);
            "".length();
        }
        int[] nArray4 = new int[llIlIlllIl[1]];
        nArray4[au.llIlIlllIl[0]] = llIlIlllIl[11];
        if (au.lIllIlIlIIIll(Bank.contains((int[])nArray4) ? 1 : 0)) {
            llllllllllllllllllIIIllIIIlIIlll = new d(llIlIlllIl[11], llIlIlllIl[1], llIlIlllIl[28]);
            bv.add((d)llllllllllllllllllIIIllIIIlIIlll);
            "".length();
        }
        int[] nArray5 = new int[llIlIlllIl[1]];
        nArray5[au.llIlIlllIl[0]] = llIlIlllIl[12];
        if (au.lIllIlIlIIIll(Bank.contains((int[])nArray5) ? 1 : 0)) {
            llllllllllllllllllIIIllIIIlIIlll = new d(llIlIlllIl[12], llIlIlllIl[1], llIlIlllIl[29]);
            bv.add((d)llllllllllllllllllIIIllIIIlIIlll);
            "".length();
        }
        if (au.lIllIlIlIIIll(Bank.contains((Predicate)(llllllllllllllllllIIIllIIIlIIlll = item -> item.getName().toLowerCase().contains(llIlIlllII[llIlIlllIl[36]]))) ? 1 : 0)) {
            llllllllllllllllllIIIllIIIlIIllI = new d(llIlIlllIl[30], llIlIlllIl[13], llIlIlllIl[29]);
            bv.add(llllllllllllllllllIIIllIIIlIIllI);
            "".length();
        }
        int[] nArray6 = new int[llIlIlllIl[1]];
        nArray6[au.llIlIlllIl[0]] = llIlIlllIl[31];
        if (au.lIllIlIlIIIll(Bank.contains((int[])nArray6) ? 1 : 0)) {
            llllllllllllllllllIIIllIIIlIIllI = new d(llIlIlllIl[31], llIlIlllIl[32], llIlIlllIl[33]);
            bv.add(llllllllllllllllllIIIllIIIlIIllI);
            "".length();
        }
    }

    public static void gs() {
        block25: {
            BankLocation llllllllllllllllllIIIllIIIlIlIlI;
            block27: {
                block33: {
                    block29: {
                        block32: {
                            block31: {
                                block30: {
                                    block28: {
                                        block26: {
                                            if (au.lIllIlIlIIIIl(bt ? 1 : 0)) {
                                                AccBuilderSotf.c = llIlIlllII[llIlIlllIl[0]];
                                                b.a(bv);
                                                if (au.lIllIlIlIIIlI(bv.size(), llIlIlllIl[1])) {
                                                    System.out.println(llIlIlllII[llIlIlllIl[1]]);
                                                    bt = llIlIlllIl[0];
                                                }
                                            }
                                            if (!au.lIllIlIlIIIll(bt ? 1 : 0) || !au.lIllIlIlIIIlI(Skills.getLevel((Skill)Skill.WOODCUTTING), llIlIlllIl[2])) break block25;
                                            if (!au.lIllIlIlIIIIl(au.an() ? 1 : 0)) break block26;
                                            int[] nArray = new int[llIlIlllIl[1]];
                                            nArray[au.llIlIlllIl[0]] = llIlIlllIl[3];
                                            if (!au.lIllIlIlIIlII(Inventory.getCount((int[])nArray))) break block27;
                                        }
                                        if (au.lIllIlIlIIlIl(llllllllllllllllllIIIllIIIlIlIlI = BankLocation.getNearest()) && au.lIllIlIlIIIll(llllllllllllllllllIIIllIIIlIlIlI.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                            AccBuilderSotf.c = llIlIlllII[llIlIlllIl[4]];
                                            a.a(llllllllllllllllllIIIllIIIlIlIlI);
                                        }
                                        if (!au.lIllIlIlIIlIl(llllllllllllllllllIIIllIIIlIlIlI) || !au.lIllIlIlIIIIl(llllllllllllllllllIIIllIIIlIlIlI.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block27;
                                        if (au.lIllIlIlIIIll(Bank.isOpen() ? 1 : 0)) {
                                            AccBuilderSotf.c = llIlIlllII[llIlIlllIl[5]];
                                            a.a();
                                            Time.sleepUntil(() -> Bank.isOpen(), (int)llIlIlllIl[6]);
                                            "".length();
                                        }
                                        if (!au.lIllIlIlIIIIl(Bank.isOpen() ? 1 : 0)) break block27;
                                        AccBuilderSotf.c = llIlIlllII[llIlIlllIl[7]];
                                        if (au.lIllIlIlIIlII(Inventory.getAll().size())) {
                                            Bank.depositInventory();
                                            Time.sleepTicks((int)llIlIlllIl[7]);
                                            "".length();
                                        }
                                        if (au.lIllIlIlIIlII(Equipment.getAll().size())) {
                                            Bank.depositEquipment();
                                            Time.sleepTicks((int)llIlIlllIl[4]);
                                            "".length();
                                        }
                                        int[] nArray = new int[llIlIlllIl[1]];
                                        nArray[au.llIlIlllIl[0]] = llIlIlllIl[8];
                                        if (!au.lIllIlIlIIIll(Bank.contains((int[])nArray) ? 1 : 0)) break block28;
                                        int[] nArray2 = new int[llIlIlllIl[1]];
                                        nArray2[au.llIlIlllIl[0]] = llIlIlllIl[8];
                                        if (!au.lIllIlIlIIllI(Inventory.getCount((int[])nArray2), llIlIlllIl[1])) break block29;
                                    }
                                    int[] nArray = new int[llIlIlllIl[1]];
                                    nArray[au.llIlIlllIl[0]] = llIlIlllIl[9];
                                    if (!au.lIllIlIlIIIll(Bank.contains((int[])nArray) ? 1 : 0)) break block30;
                                    int[] nArray3 = new int[llIlIlllIl[1]];
                                    nArray3[au.llIlIlllIl[0]] = llIlIlllIl[9];
                                    if (!au.lIllIlIlIIllI(Inventory.getCount((int[])nArray3), llIlIlllIl[1])) break block29;
                                }
                                int[] nArray = new int[llIlIlllIl[1]];
                                nArray[au.llIlIlllIl[0]] = llIlIlllIl[10];
                                if (!au.lIllIlIlIIIll(Bank.contains((int[])nArray) ? 1 : 0)) break block31;
                                int[] nArray4 = new int[llIlIlllIl[1]];
                                nArray4[au.llIlIlllIl[0]] = llIlIlllIl[10];
                                if (!au.lIllIlIlIIllI(Inventory.getCount((int[])nArray4), llIlIlllIl[1])) break block29;
                            }
                            int[] nArray = new int[llIlIlllIl[1]];
                            nArray[au.llIlIlllIl[0]] = llIlIlllIl[11];
                            if (!au.lIllIlIlIIIll(Bank.contains((int[])nArray) ? 1 : 0)) break block32;
                            int[] nArray5 = new int[llIlIlllIl[1]];
                            nArray5[au.llIlIlllIl[0]] = llIlIlllIl[11];
                            if (!au.lIllIlIlIIllI(Inventory.getCount((int[])nArray5), llIlIlllIl[1])) break block29;
                        }
                        int[] nArray = new int[llIlIlllIl[1]];
                        nArray[au.llIlIlllIl[0]] = llIlIlllIl[12];
                        if (!au.lIllIlIlIIIll(Bank.contains((int[])nArray) ? 1 : 0)) break block33;
                        int[] nArray6 = new int[llIlIlllIl[1]];
                        nArray6[au.llIlIlllIl[0]] = llIlIlllIl[12];
                        if (!au.lIllIlIlIIIlI(Inventory.getCount((int[])nArray6), llIlIlllIl[1])) break block33;
                    }
                    au.Q();
                    System.out.println(llIlIlllII[llIlIlllIl[13]]);
                    bt = llIlIlllIl[1];
                    return;
                }
                int[] nArray = new int[llIlIlllIl[1]];
                nArray[au.llIlIlllIl[0]] = llIlIlllIl[8];
                if (au.lIllIlIlIIIIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                    Bank.withdraw((int)llIlIlllIl[8], (int)llIlIlllIl[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                    Time.sleepTicks((int)llIlIlllIl[4]);
                    "".length();
                    Time.sleepUntil(() -> {
                        boolean bl;
                        int[] nArray = new int[llIlIlllIl[1]];
                        nArray[au.llIlIlllIl[0]] = llIlIlllIl[8];
                        if (au.lIllIlIlIIlII(Inventory.getCount((int[])nArray))) {
                            bl = llIlIlllIl[1];
                            "".length();
                            if ("  ".length() >= (5 ^ 1)) {
                                return ((0x1E ^ 0x2B) & ~(0x26 ^ 0x13)) != 0;
                            }
                        } else {
                            bl = llIlIlllIl[0];
                        }
                        return bl;
                    }, (int)llIlIlllIl[6]);
                    "".length();
                }
                int[] nArray7 = new int[llIlIlllIl[1]];
                nArray7[au.llIlIlllIl[0]] = llIlIlllIl[9];
                if (au.lIllIlIlIIIIl(Bank.contains((int[])nArray7) ? 1 : 0)) {
                    Bank.withdraw((int)llIlIlllIl[9], (int)llIlIlllIl[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                    Time.sleepTicks((int)llIlIlllIl[4]);
                    "".length();
                    Time.sleepUntil(() -> {
                        boolean bl;
                        int[] nArray = new int[llIlIlllIl[1]];
                        nArray[au.llIlIlllIl[0]] = llIlIlllIl[9];
                        if (au.lIllIlIlIIlII(Inventory.getCount((int[])nArray))) {
                            bl = llIlIlllIl[1];
                            "".length();
                            if ("  ".length() <= 0) {
                                return ((0x16 ^ 0xB) & ~(0x65 ^ 0x78)) != 0;
                            }
                        } else {
                            bl = llIlIlllIl[0];
                        }
                        return bl;
                    }, (int)llIlIlllIl[6]);
                    "".length();
                }
                int[] nArray8 = new int[llIlIlllIl[1]];
                nArray8[au.llIlIlllIl[0]] = llIlIlllIl[10];
                if (au.lIllIlIlIIIIl(Bank.contains((int[])nArray8) ? 1 : 0)) {
                    Bank.withdraw((int)llIlIlllIl[10], (int)llIlIlllIl[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                    Time.sleepTicks((int)llIlIlllIl[4]);
                    "".length();
                    Time.sleepUntil(() -> {
                        boolean bl;
                        int[] nArray = new int[llIlIlllIl[1]];
                        nArray[au.llIlIlllIl[0]] = llIlIlllIl[10];
                        if (au.lIllIlIlIIlII(Inventory.getCount((int[])nArray))) {
                            bl = llIlIlllIl[1];
                            "".length();
                            if (((0xE0 ^ 0x82 ^ (0x1A ^ 0x26)) & ((0xB4 ^ 0x9F) & ~(0x65 ^ 0x4E) ^ (8 ^ 0x56) ^ -" ".length())) != ((77 + 64 - 9 + 27 ^ 120 + 40 - 118 + 133) & (0xB2 ^ 0x89 ^ (0x61 ^ 0x6A) ^ -" ".length()))) {
                                return ((0x4C ^ 0x12 ^ (0x7D ^ 0x15)) & (0xF0 ^ 0xB0 ^ (0x30 ^ 0x46) ^ -" ".length())) != 0;
                            }
                        } else {
                            bl = llIlIlllIl[0];
                        }
                        return bl;
                    }, (int)llIlIlllIl[6]);
                    "".length();
                }
                int[] nArray9 = new int[llIlIlllIl[1]];
                nArray9[au.llIlIlllIl[0]] = llIlIlllIl[11];
                if (au.lIllIlIlIIIIl(Bank.contains((int[])nArray9) ? 1 : 0)) {
                    Bank.withdraw((int)llIlIlllIl[11], (int)llIlIlllIl[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                    Time.sleepTicks((int)llIlIlllIl[4]);
                    "".length();
                    Time.sleepUntil(() -> {
                        boolean bl;
                        int[] nArray = new int[llIlIlllIl[1]];
                        nArray[au.llIlIlllIl[0]] = llIlIlllIl[11];
                        if (au.lIllIlIlIIlII(Inventory.getCount((int[])nArray))) {
                            bl = llIlIlllIl[1];
                            "".length();
                            if ((0x43 ^ 0x46) <= 0) {
                                return ((0x13 ^ 0x1A) & ~(0x22 ^ 0x2B)) != 0;
                            }
                        } else {
                            bl = llIlIlllIl[0];
                        }
                        return bl;
                    }, (int)llIlIlllIl[6]);
                    "".length();
                }
                int[] nArray10 = new int[llIlIlllIl[1]];
                nArray10[au.llIlIlllIl[0]] = llIlIlllIl[12];
                if (au.lIllIlIlIIIIl(Bank.contains((int[])nArray10) ? 1 : 0)) {
                    Bank.withdraw((int)llIlIlllIl[12], (int)llIlIlllIl[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                    Time.sleepTicks((int)llIlIlllIl[4]);
                    "".length();
                    Time.sleepUntil(() -> {
                        boolean bl;
                        int[] nArray = new int[llIlIlllIl[1]];
                        nArray[au.llIlIlllIl[0]] = llIlIlllIl[12];
                        if (au.lIllIlIlIIlII(Inventory.getCount((int[])nArray))) {
                            bl = llIlIlllIl[1];
                            "".length();
                            if (((0xA1 ^ 0x9B) & ~(0x72 ^ 0x48)) != 0) {
                                return ((0xA4 ^ 0xA2) & ~(0xA4 ^ 0xA2)) != 0;
                            }
                        } else {
                            bl = llIlIlllIl[0];
                        }
                        return bl;
                    }, (int)llIlIlllIl[6]);
                    "".length();
                }
            }
            if (au.lIllIlIlIIIIl(au.an() ? 1 : 0)) {
                if (au.lIllIlIlIIIIl(Inventory.isFull() ? 1 : 0)) {
                    AccBuilderSotf.c = llIlIlllII[llIlIlllIl[14]];
                    System.out.println(llIlIlllII[llIlIlllIl[15]]);
                    Inventory.getAll((int[])oy).stream().forEach(Item::drop);
                }
                if (au.lIllIlIlIIIll(Inventory.isFull() ? 1 : 0)) {
                    if (au.lIllIlIlIIIlI(Skills.getLevel((Skill)Skill.WOODCUTTING), llIlIlllIl[16])) {
                        if (au.lIllIlIlIIIll(ot.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderSotf.c = llIlIlllII[llIlIlllIl[17]];
                            Movement.walkTo((WorldPoint)ot.toWorldPoint());
                            "".length();
                            Time.sleepTicks((int)llIlIlllIl[7]);
                            "".length();
                        }
                        if (au.lIllIlIlIIIIl(ot.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderSotf.c = llIlIlllII[llIlIlllIl[18]];
                            llllllllllllllllllIIIllIIIlIlIlI = TileObjects.getNearest((WorldPoint)Players.getLocal().getWorldLocation(), (int[])ow);
                            if (au.lIllIlIlIIIll(Players.getLocal().isAnimating() ? 1 : 0) && au.lIllIlIlIIIll(Players.getLocal().isMoving() ? 1 : 0) && au.lIllIlIlIIlIl(llllllllllllllllllIIIllIIIlIlIlI)) {
                                System.out.println(llIlIlllII[llIlIlllIl[19]]);
                                llllllllllllllllllIIIllIIIlIlIlI.interact(llIlIlllII[llIlIlllIl[20]]);
                                Time.sleepTicks((int)llIlIlllIl[5]);
                                "".length();
                            }
                        }
                    }
                    if (au.lIllIlIlIIllI(Skills.getLevel((Skill)Skill.WOODCUTTING), llIlIlllIl[16])) {
                        if (au.lIllIlIlIIIll(ou.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderSotf.c = llIlIlllII[llIlIlllIl[21]];
                            Movement.walkTo((WorldPoint)ov);
                            "".length();
                            Time.sleepTicks((int)llIlIlllIl[7]);
                            "".length();
                        }
                        if (au.lIllIlIlIIIIl(ou.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderSotf.c = llIlIlllII[llIlIlllIl[22]];
                            llllllllllllllllllIIIllIIIlIlIlI = TileObjects.getNearest((WorldPoint)Players.getLocal().getWorldLocation(), (int[])ox);
                            if (au.lIllIlIlIIIll(Players.getLocal().isAnimating() ? 1 : 0) && au.lIllIlIlIIIll(Players.getLocal().isMoving() ? 1 : 0) && au.lIllIlIlIIlIl(llllllllllllllllllIIIllIIIlIlIlI)) {
                                System.out.println(llIlIlllII[llIlIlllIl[23]]);
                                llllllllllllllllllIIIllIIIlIlIlI.interact(llIlIlllII[llIlIlllIl[16]]);
                                Time.sleepTicks((int)llIlIlllIl[5]);
                                "".length();
                            }
                        }
                    }
                }
            }
        }
    }

    private static boolean lIllIlIlIIIIl(int n2) {
        return n2 != 0;
    }

    private static boolean lIllIlIlIIlIl(Object object) {
        return object != null;
    }

    private static boolean lIllIlIlIIlII(int n2) {
        return n2 > 0;
    }

    private static boolean lIllIlIlIIIll(int n2) {
        return n2 == 0;
    }

    @Override
    public boolean ah() {
        boolean bl;
        if (au.lIllIlIlIIllI(Skills.getLevel((Skill)Skill.WOODCUTTING), llIlIlllIl[2])) {
            bl = llIlIlllIl[1];
            "".length();
            if (-(7 ^ 3) > 0) {
                return ((0x70 ^ 0x58) & ~(0xEA ^ 0xC2)) != 0;
            }
        } else {
            bl = llIlIlllIl[0];
        }
        return bl;
    }

    @Override
    public String ag() {
        return llIlIlllII[llIlIlllIl[35]];
    }

    private static String lIllIlIIlllIl(String llllllllllllllllllIIIlIlllllIlll, String llllllllllllllllllIIIlIlllllIllI) {
        try {
            SecretKeySpec llllllllllllllllllIIIlIlllllllII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllllIIIlIlllllIllI.getBytes(StandardCharsets.UTF_8)), llIlIlllIl[17]), "DES");
            Cipher llllllllllllllllllIIIlIllllllIll = Cipher.getInstance("DES");
            llllllllllllllllllIIIlIllllllIll.init(llIlIlllIl[4], llllllllllllllllllIIIlIlllllllII);
            return new String(llllllllllllllllllIIIlIllllllIll.doFinal(Base64.getDecoder().decode(llllllllllllllllllIIIlIlllllIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllllIIIlIllllllIlI) {
            llllllllllllllllllIIIlIllllllIlI.printStackTrace();
            return null;
        }
    }

    static {
        au.lIllIlIlIIIII();
        au.lIllIlIIlllll();
        or = llIlIlllIl[11];
        oo = llIlIlllIl[8];
        os = llIlIlllIl[12];
        op = llIlIlllIl[9];
        oq = llIlIlllIl[10];
        ot = new WorldArea(llIlIlllIl[37], llIlIlllIl[38], llIlIlllIl[35], llIlIlllIl[39], llIlIlllIl[0]);
        ou = new WorldArea(llIlIlllIl[40], llIlIlllIl[41], llIlIlllIl[23], llIlIlllIl[35], llIlIlllIl[0]);
        ov = new WorldPoint(llIlIlllIl[42], llIlIlllIl[43], llIlIlllIl[0]);
        int[] nArray = new int[llIlIlllIl[7]];
        nArray[au.llIlIlllIl[0]] = llIlIlllIl[44];
        nArray[au.llIlIlllIl[1]] = llIlIlllIl[45];
        nArray[au.llIlIlllIl[4]] = llIlIlllIl[46];
        nArray[au.llIlIlllIl[5]] = llIlIlllIl[47];
        ow = nArray;
        int[] nArray2 = new int[llIlIlllIl[1]];
        nArray2[au.llIlIlllIl[0]] = llIlIlllIl[48];
        ox = nArray2;
        int[] nArray3 = new int[llIlIlllIl[5]];
        nArray3[au.llIlIlllIl[0]] = llIlIlllIl[49];
        nArray3[au.llIlIlllIl[1]] = llIlIlllIl[50];
        nArray3[au.llIlIlllIl[4]] = llIlIlllIl[51];
        oy = nArray3;
        bv = new ArrayList<d>();
    }

    private static void lIllIlIlIIIII() {
        llIlIlllIl = new int[53];
        au.llIlIlllIl[0] = (0xA6 ^ 0xAA) & ~(0x4B ^ 0x47);
        au.llIlIlllIl[1] = " ".length();
        au.llIlIlllIl[2] = 0xD9 ^ 0xB4 ^ (0x4E ^ 0x1D);
        au.llIlIlllIl[3] = -(0xFFFFFD23 & 0x36DD) & (0xFFFFBFEF & 0x77F3);
        au.llIlIlllIl[4] = "  ".length();
        au.llIlIlllIl[5] = "   ".length();
        au.llIlIlllIl[6] = 0xFFFFBBAE & 0x57D9;
        au.llIlIlllIl[7] = 163 + 127 - 113 + 18 ^ 37 + 123 - -39 + 0;
        au.llIlIlllIl[8] = 0xFFFF857F & 0x7FC7;
        au.llIlIlllIl[9] = 0xFFFFEDED & 0x175B;
        au.llIlIlllIl[10] = 0xFFFF9FFB & 0x654F;
        au.llIlIlllIl[11] = 0xFFFFF5DF & 0xF6D;
        au.llIlIlllIl[12] = 0xFFFF8FDF & 0x756F;
        au.llIlIlllIl[13] = 0x4F ^ 0x49 ^ "   ".length();
        au.llIlIlllIl[14] = 0x91 ^ 0x97;
        au.llIlIlllIl[15] = 0xD ^ 0xA;
        au.llIlIlllIl[16] = 0x13 ^ 0x17 ^ (0xB4 ^ 0xBF);
        au.llIlIlllIl[17] = 9 + 99 - 82 + 156 ^ 176 + 32 - 112 + 94;
        au.llIlIlllIl[18] = 123 + 91 - 84 + 25 ^ 13 + 126 - 56 + 63;
        au.llIlIlllIl[19] = 0xB2 ^ 0xB8;
        au.llIlIlllIl[20] = 0x46 ^ 0x4D;
        au.llIlIlllIl[21] = 0x7C ^ 0x70;
        au.llIlIlllIl[22] = 100 + 146 - 134 + 54 ^ 164 + 23 - 94 + 78;
        au.llIlIlllIl[23] = 0x7C ^ 0x1E ^ (0x10 ^ 0x7C);
        au.llIlIlllIl[24] = 0x7D ^ 0x54;
        au.llIlIlllIl[25] = 0xC5 ^ 0xB2 ^ (0xC0 ^ 0xA8);
        au.llIlIlllIl[26] = 0xA2 ^ 0xB7;
        au.llIlIlllIl[27] = 0xFFFFE36E & 0x3FB9;
        au.llIlIlllIl[28] = -(0xA7 ^ 0xA3) & (0xFFFFAEFB & 0x7FE7);
        au.llIlIlllIl[29] = 0xFFFFE9F9 & 0x77AE;
        au.llIlIlllIl[30] = -(0xFFFFDD2D & 0x72D6) & (0xFFFFFFCF & 0x7EFF);
        au.llIlIlllIl[31] = 0xFFFFBFF7 & 0x5F4F;
        au.llIlIlllIl[32] = 0x5C ^ 0x74;
        au.llIlIlllIl[33] = 0xFFFFE3A6 & 0x1FDD;
        au.llIlIlllIl[34] = 0x56 ^ 0x32;
        au.llIlIlllIl[35] = 0x4B ^ 0x17 ^ (0xFA ^ 0xB6);
        au.llIlIlllIl[36] = 0x97 ^ 0x86;
        au.llIlIlllIl[37] = 0xFFFFBD7D & 0x4ED7;
        au.llIlIlllIl[38] = -(0xFFFFEBF1 & 0x765F) & (0xFFFFEFFE & 0x7F7F);
        au.llIlIlllIl[39] = 0x61 ^ 0x3A ^ (0x5D ^ 0x2B);
        au.llIlIlllIl[40] = 0xFFFFFFFF & 0xC7E;
        au.llIlIlllIl[41] = -(0xFFFFBFE7 & 0x52DB) & (0xFFFFFFEB & 0x1FF7);
        au.llIlIlllIl[42] = -(0xFFFFF37F & 0x5EEA) & (0xFFFFDFEF & 0x7EFD);
        au.llIlIlllIl[43] = -(0xFFFFEBC1 & 0x16BF) & (0xFFFFCFBD & 0x3FE7);
        au.llIlIlllIl[44] = -(0xFFFFBFEB & 0x7115) & (0xFFFFBFFD & 0x75FE);
        au.llIlIlllIl[45] = -(0xFFFFFFE9 & 0x7B17) & (0xFFFFFFFE & Short.MAX_VALUE);
        au.llIlIlllIl[46] = -(0xFFFFFFAB & 0x627E) & (0xFFFFEF6F & 0x77BB);
        au.llIlIlllIl[47] = -(0xFFFFFEB9 & 0x4B77) & (0xFFFFFF36 & 0x4FFF);
        au.llIlIlllIl[48] = 0xFFFFBB56 & 0x6EED;
        au.llIlIlllIl[49] = -(0xFFFFFDB3 & 0x1A4D) & (0xFFFFBDFF & 0x5FE7);
        au.llIlIlllIl[50] = -(0xFFFFBEB5 & 0x6B4F) & (0xFFFFAFF7 & 0x7FFD);
        au.llIlIlllIl[51] = -(0xFFFFFD75 & 0x5A9B) & (0xFFFFDFFF & 0x7DFF);
        au.llIlIlllIl[52] = 0x8C ^ 0x9E;
    }
}

