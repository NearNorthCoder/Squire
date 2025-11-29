/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Skill
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 *  net.unethicalite.api.widgets.Dialog
 *  net.unethicalite.api.widgets.Widgets
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
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Widgets;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.a;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.ac;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.b;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.d;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.e;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.z;

public class aB
implements ac {
    public static /* synthetic */ boolean bt;
    private static /* synthetic */ String[] llIIlIIlII;
    public static /* synthetic */ List<d> bv;
    private static /* synthetic */ int[] llIIlIIlIl;

    public static void Q() {
        d llllllllllllllllllIlIIlIlIlIllIl;
        if (aB.lIlIlIlIIllII(Skills.getLevel((Skill)Skill.HERBLORE), llIIlIIlIl[7])) {
            int[] nArray = new int[llIIlIIlIl[1]];
            nArray[aB.llIIlIIlIl[0]] = llIIlIIlIl[8];
            if (aB.lIlIlIlIIllIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                d d2 = new d(llIIlIIlIl[8], llIIlIIlIl[19], llIIlIIlIl[20]);
                bv.add(d2);
                "".length();
            }
            int[] nArray2 = new int[llIIlIIlIl[1]];
            nArray2[aB.llIIlIIlIl[0]] = llIIlIIlIl[10];
            if (aB.lIlIlIlIIllIl(Bank.contains((int[])nArray2) ? 1 : 0)) {
                llllllllllllllllllIlIIlIlIlIllIl = new d(llIIlIIlIl[10], aB.fM(), llIIlIIlIl[21]);
                bv.add(llllllllllllllllllIlIIlIlIlIllIl);
                "".length();
            }
        }
        if (aB.lIlIlIlIlIIIl(Skills.getLevel((Skill)Skill.HERBLORE), llIIlIIlIl[7]) && aB.lIlIlIlIIllII(Skills.getLevel((Skill)Skill.HERBLORE), llIIlIIlIl[11])) {
            int[] nArray = new int[llIIlIIlIl[1]];
            nArray[aB.llIIlIIlIl[0]] = llIIlIIlIl[12];
            if (aB.lIlIlIlIIllIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                llllllllllllllllllIlIIlIlIlIllIl = new d(llIIlIIlIl[12], aB.fM(), llIIlIIlIl[22]);
                bv.add(llllllllllllllllllIlIIlIlIlIllIl);
                "".length();
            }
            int[] nArray3 = new int[llIIlIIlIl[1]];
            nArray3[aB.llIIlIIlIl[0]] = llIIlIIlIl[13];
            if (aB.lIlIlIlIIllIl(Bank.contains((int[])nArray3) ? 1 : 0)) {
                llllllllllllllllllIlIIlIlIlIllIl = new d(llIIlIIlIl[13], aB.fM(), llIIlIIlIl[23]);
                bv.add(llllllllllllllllllIlIIlIlIlIllIl);
                "".length();
            }
        }
        if (aB.lIlIlIlIlIIIl(Skills.getLevel((Skill)Skill.HERBLORE), llIIlIIlIl[11])) {
            int[] nArray = new int[llIIlIIlIl[1]];
            nArray[aB.llIIlIIlIl[0]] = llIIlIIlIl[8];
            if (aB.lIlIlIlIIllIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                llllllllllllllllllIlIIlIlIlIllIl = new d(llIIlIIlIl[8], llIIlIIlIl[19], llIIlIIlIl[20]);
                bv.add(llllllllllllllllllIlIIlIlIlIllIl);
                "".length();
            }
            int[] nArray4 = new int[llIIlIIlIl[1]];
            nArray4[aB.llIIlIIlIl[0]] = llIIlIIlIl[14];
            if (aB.lIlIlIlIIllIl(Bank.contains((int[])nArray4) ? 1 : 0)) {
                llllllllllllllllllIlIIlIlIlIllIl = new d(llIIlIIlIl[14], llIIlIIlIl[19], llIIlIIlIl[24]);
                bv.add(llllllllllllllllllIlIIlIlIlIllIl);
                "".length();
            }
        }
    }

    @Override
    public int af() {
        aB.fL();
        return llIIlIIlIl[22];
    }

    /*
     * WARNING - void declaration
     */
    private static int fM() {
        int n2 = llIIlIIlIl[25];
        int n3 = llIIlIIlIl[26];
        if (aB.lIlIlIlIIllII(Skills.getLevel((Skill)Skill.HERBLORE), llIIlIIlIl[7])) {
            return (n2 - Skills.getExperience((Skill)Skill.HERBLORE)) / llIIlIIlIl[27] + llIIlIIlIl[15];
        }
        if (aB.lIlIlIlIlIIIl(Skills.getLevel((Skill)Skill.HERBLORE), llIIlIIlIl[7]) && aB.lIlIlIlIIllII(Skills.getLevel((Skill)Skill.HERBLORE), llIIlIIlIl[11])) {
            void llllllllllllllllllIlIIlIlIlIlIIl;
            return (int)((llllllllllllllllllIlIIlIlIlIlIIl - Skills.getExperience((Skill)Skill.HERBLORE)) / llIIlIIlIl[28] + llIIlIIlIl[29]);
        }
        return llIIlIIlIl[1];
    }

    private static boolean lIlIlIlIIllII(int n2, int n3) {
        return n2 < n3;
    }

    private static String lIlIlIIllIIII(String llllllllllllllllllIlIIlIlIIlIIIl, String llllllllllllllllllIlIIlIlIIlIIII) {
        llllllllllllllllllIlIIlIlIIlIIIl = new String(Base64.getDecoder().decode(llllllllllllllllllIlIIlIlIIlIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllllIlIIlIlIIIllll = new StringBuilder();
        char[] llllllllllllllllllIlIIlIlIIIlllI = llllllllllllllllllIlIIlIlIIlIIII.toCharArray();
        int llllllllllllllllllIlIIlIlIIIllIl = llIIlIIlIl[0];
        char[] llllllllllllllllllIlIIlIlIIIIlll = llllllllllllllllllIlIIlIlIIlIIIl.toCharArray();
        int llllllllllllllllllIlIIlIlIIIIllI = llllllllllllllllllIlIIlIlIIIIlll.length;
        int llllllllllllllllllIlIIlIlIIIIlIl = llIIlIIlIl[0];
        while (aB.lIlIlIlIIllII(llllllllllllllllllIlIIlIlIIIIlIl, llllllllllllllllllIlIIlIlIIIIllI)) {
            char llllllllllllllllllIlIIlIlIIlIIlI = llllllllllllllllllIlIIlIlIIIIlll[llllllllllllllllllIlIIlIlIIIIlIl];
            llllllllllllllllllIlIIlIlIIIllll.append((char)(llllllllllllllllllIlIIlIlIIlIIlI ^ llllllllllllllllllIlIIlIlIIIlllI[llllllllllllllllllIlIIlIlIIIllIl % llllllllllllllllllIlIIlIlIIIlllI.length]));
            "".length();
            ++llllllllllllllllllIlIIlIlIIIllIl;
            ++llllllllllllllllllIlIIlIlIIIIlIl;
            "".length();
            if ((0x70 ^ 0x75) != 0) continue;
            return null;
        }
        return String.valueOf(llllllllllllllllllIlIIlIlIIIllll);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean an() {
        int n2;
        if (aB.lIlIlIlIIllII(Skills.getLevel((Skill)Skill.HERBLORE), llIIlIIlIl[7])) {
            int n3;
            int[] nArray = new int[llIIlIIlIl[1]];
            nArray[aB.llIIlIIlIl[0]] = llIIlIIlIl[8];
            if (aB.lIlIlIlIIlIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray2 = new int[llIIlIIlIl[1]];
                nArray2[aB.llIIlIIlIl[0]] = llIIlIIlIl[10];
                if (aB.lIlIlIlIIlIll(Inventory.contains((int[])nArray2) ? 1 : 0)) {
                    n3 = llIIlIIlIl[1];
                    "".length();
                    if ((0x31 ^ 0x7D ^ (0x31 ^ 0x78)) != 0) return n3 != 0;
                    return ((0x4C ^ 3 ^ (0 ^ 7)) & (0x10 ^ 7 ^ (0x59 ^ 6) ^ -" ".length())) != 0;
                }
            }
            n3 = llIIlIIlIl[0];
            return n3 != 0;
        }
        if (aB.lIlIlIlIlIIIl(Skills.getLevel((Skill)Skill.HERBLORE), llIIlIIlIl[7]) && aB.lIlIlIlIIllII(Skills.getLevel((Skill)Skill.HERBLORE), llIIlIIlIl[11])) {
            int n4;
            int[] nArray = new int[llIIlIIlIl[1]];
            nArray[aB.llIIlIIlIl[0]] = llIIlIIlIl[12];
            if (aB.lIlIlIlIIlIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray3 = new int[llIIlIIlIl[1]];
                nArray3[aB.llIIlIIlIl[0]] = llIIlIIlIl[13];
                if (aB.lIlIlIlIIlIll(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                    n4 = llIIlIIlIl[1];
                    "".length();
                    if (null == null) return n4 != 0;
                    return ((110 + 139 - 142 + 33 ^ 115 + 73 - 90 + 30) & (3 + 52 - -21 + 107 ^ 27 + 88 - -19 + 53 ^ -" ".length())) != 0;
                }
            }
            n4 = llIIlIIlIl[0];
            return n4 != 0;
        }
        if (!aB.lIlIlIlIlIIIl(Skills.getLevel((Skill)Skill.HERBLORE), llIIlIIlIl[11])) return llIIlIIlIl[0];
        int[] nArray = new int[llIIlIIlIl[1]];
        nArray[aB.llIIlIIlIl[0]] = llIIlIIlIl[8];
        if (aB.lIlIlIlIIlIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
            int[] nArray4 = new int[llIIlIIlIl[1]];
            nArray4[aB.llIIlIIlIl[0]] = llIIlIIlIl[14];
            if (aB.lIlIlIlIIlIll(Inventory.contains((int[])nArray4) ? 1 : 0)) {
                n2 = llIIlIIlIl[1];
                "".length();
                if (-(0x88 ^ 0x8D) < 0) return n2 != 0;
                return ((0x6B ^ 0x5E) & ~(0x7E ^ 0x4B)) != 0;
            }
        }
        n2 = llIIlIIlIl[0];
        return n2 != 0;
    }

    static {
        aB.lIlIlIIllIIlI();
        aB.lIlIlIIllIIIl();
        bv = new ArrayList<d>();
    }

    private static boolean lIlIlIlIIlllI(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIlIlIlIIllll(Object object) {
        return object != null;
    }

    private static String lIlIlIIlIllll(String llllllllllllllllllIlIIlIlIlIIIIl, String llllllllllllllllllIlIIlIlIIllllI) {
        try {
            SecretKeySpec llllllllllllllllllIlIIlIlIlIIlII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllllIlIIlIlIIllllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllllIlIIlIlIlIIIll = Cipher.getInstance("Blowfish");
            llllllllllllllllllIlIIlIlIlIIIll.init(llIIlIIlIl[4], llllllllllllllllllIlIIlIlIlIIlII);
            return new String(llllllllllllllllllIlIIlIlIlIIIll.doFinal(Base64.getDecoder().decode(llllllllllllllllllIlIIlIlIlIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllllIlIIlIlIlIIIlI) {
            llllllllllllllllllIlIIlIlIlIIIlI.printStackTrace();
            return null;
        }
    }

    @Override
    public String ag() {
        return llIIlIIlII[llIIlIIlIl[30]];
    }

    private static boolean lIlIlIlIIllIl(int n2) {
        return n2 == 0;
    }

    private static boolean lIlIlIlIlIIII(int n2) {
        return n2 > 0;
    }

    public static void fL() {
        block26: {
            BankLocation llllllllllllllllllIlIIlIlIlIllll;
            block28: {
                block27: {
                    if (aB.lIlIlIlIIlIll(bt ? 1 : 0)) {
                        AccBuilderSotf.c = llIIlIIlII[llIIlIIlIl[0]];
                        b.a(bv);
                        if (aB.lIlIlIlIIllII(bv.size(), llIIlIIlIl[1])) {
                            System.out.println(llIIlIIlII[llIIlIIlIl[1]]);
                            bt = llIIlIIlIl[0];
                        }
                    }
                    if (!aB.lIlIlIlIIllIl(bt ? 1 : 0)) break block26;
                    if (aB.lIlIlIlIIllII(e.j(llIIlIIlIl[2]), llIIlIIlIl[3])) {
                        z.bt();
                    }
                    if (aB.lIlIlIlIIllIl(aB.an() ? 1 : 0) && aB.lIlIlIlIIlllI(e.j(llIIlIIlIl[2]), llIIlIIlIl[3])) {
                        llllllllllllllllllIlIIlIlIlIllll = BankLocation.getNearest();
                        if (aB.lIlIlIlIIllll(llllllllllllllllllIlIIlIlIlIllll) && aB.lIlIlIlIIllIl(llllllllllllllllllIlIIlIlIlIllll.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderSotf.c = llIIlIIlII[llIIlIIlIl[4]];
                            a.a(llllllllllllllllllIlIIlIlIlIllll);
                        }
                        if (aB.lIlIlIlIIllll(llllllllllllllllllIlIIlIlIlIllll) && aB.lIlIlIlIIlIll(llllllllllllllllllIlIIlIlIlIllll.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderSotf.c = llIIlIIlII[llIIlIIlIl[5]];
                            if (aB.lIlIlIlIIllIl(Bank.isOpen() ? 1 : 0)) {
                                a.a();
                                Time.sleepUntil(() -> Bank.isOpen(), (int)llIIlIIlIl[6]);
                                "".length();
                            }
                            if (aB.lIlIlIlIIlIll(Bank.isOpen() ? 1 : 0)) {
                                if (aB.lIlIlIlIlIIII(Inventory.getAll().size())) {
                                    Bank.depositInventory();
                                    Time.sleepTicks((int)llIIlIIlIl[5]);
                                    "".length();
                                }
                                if (aB.lIlIlIlIIllIl(aB.fN() ? 1 : 0)) {
                                    aB.Q();
                                    System.out.println(llIIlIIlII[llIIlIIlIl[3]]);
                                    bt = llIIlIIlIl[1];
                                    return;
                                }
                                if (aB.lIlIlIlIIllII(Skills.getLevel((Skill)Skill.HERBLORE), llIIlIIlIl[7])) {
                                    a.a(llIIlIIlIl[8], llIIlIIlIl[9]);
                                    a.a(llIIlIIlIl[10], llIIlIIlIl[9]);
                                }
                                if (aB.lIlIlIlIlIIIl(Skills.getLevel((Skill)Skill.HERBLORE), llIIlIIlIl[7]) && aB.lIlIlIlIIllII(Skills.getLevel((Skill)Skill.HERBLORE), llIIlIIlIl[11])) {
                                    a.a(llIIlIIlIl[12], llIIlIIlIl[9]);
                                    a.a(llIIlIIlIl[13], llIIlIIlIl[9]);
                                }
                                if (aB.lIlIlIlIlIIIl(Skills.getLevel((Skill)Skill.HERBLORE), llIIlIIlIl[11])) {
                                    a.a(llIIlIIlIl[8], llIIlIIlIl[9]);
                                    a.a(llIIlIIlIl[14], llIIlIIlIl[9]);
                                }
                            }
                        }
                    }
                    if (!aB.lIlIlIlIIlIll(aB.an() ? 1 : 0)) break block26;
                    if (aB.lIlIlIlIIlIll(Bank.isOpen() ? 1 : 0)) {
                        Bank.close();
                    }
                    if (aB.lIlIlIlIIlIll(Dialog.isOpen() ? 1 : 0)) {
                        Dialog.close();
                    }
                    AccBuilderSotf.c = llIIlIIlII[llIIlIIlIl[15]];
                    int[] nArray = new int[llIIlIIlIl[1]];
                    nArray[aB.llIIlIIlIl[0]] = llIIlIIlIl[8];
                    if (aB.lIlIlIlIIlIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        int[] nArray2 = new int[llIIlIIlIl[1]];
                        nArray2[aB.llIIlIIlIl[0]] = llIIlIIlIl[10];
                        if (aB.lIlIlIlIIlIll(Inventory.contains((int[])nArray2) ? 1 : 0)) {
                            int[] nArray3 = new int[llIIlIIlIl[1]];
                            nArray3[aB.llIIlIIlIl[0]] = llIIlIIlIl[8];
                            int[] nArray4 = new int[llIIlIIlIl[1]];
                            nArray4[aB.llIIlIIlIl[0]] = llIIlIIlIl[10];
                            Inventory.getFirst((int[])nArray3).useOn(Inventory.getFirst((int[])nArray4));
                            Time.sleepTicks((int)llIIlIIlIl[1]);
                            "".length();
                        }
                    }
                    int[] nArray5 = new int[llIIlIIlIl[1]];
                    nArray5[aB.llIIlIIlIl[0]] = llIIlIIlIl[12];
                    if (aB.lIlIlIlIIlIll(Inventory.contains((int[])nArray5) ? 1 : 0)) {
                        int[] nArray6 = new int[llIIlIIlIl[1]];
                        nArray6[aB.llIIlIIlIl[0]] = llIIlIIlIl[13];
                        if (aB.lIlIlIlIIlIll(Inventory.contains((int[])nArray6) ? 1 : 0)) {
                            int[] nArray7 = new int[llIIlIIlIl[1]];
                            nArray7[aB.llIIlIIlIl[0]] = llIIlIIlIl[12];
                            int[] nArray8 = new int[llIIlIIlIl[1]];
                            nArray8[aB.llIIlIIlIl[0]] = llIIlIIlIl[13];
                            Inventory.getFirst((int[])nArray7).useOn(Inventory.getFirst((int[])nArray8));
                            Time.sleepTicks((int)llIIlIIlIl[1]);
                            "".length();
                        }
                    }
                    int[] nArray9 = new int[llIIlIIlIl[1]];
                    nArray9[aB.llIIlIIlIl[0]] = llIIlIIlIl[8];
                    if (aB.lIlIlIlIIlIll(Inventory.contains((int[])nArray9) ? 1 : 0)) {
                        int[] nArray10 = new int[llIIlIIlIl[1]];
                        nArray10[aB.llIIlIIlIl[0]] = llIIlIIlIl[14];
                        if (aB.lIlIlIlIIlIll(Inventory.contains((int[])nArray10) ? 1 : 0)) {
                            int[] nArray11 = new int[llIIlIIlIl[1]];
                            nArray11[aB.llIIlIIlIl[0]] = llIIlIIlIl[8];
                            int[] nArray12 = new int[llIIlIIlIl[1]];
                            nArray12[aB.llIIlIIlIl[0]] = llIIlIIlIl[14];
                            Inventory.getFirst((int[])nArray11).useOn(Inventory.getFirst((int[])nArray12));
                            Time.sleepTicks((int)llIIlIIlIl[1]);
                            "".length();
                        }
                    }
                    int[] nArray13 = new int[llIIlIIlIl[1]];
                    nArray13[aB.llIIlIIlIl[0]] = llIIlIIlIl[8];
                    if (!aB.lIlIlIlIlIIlI(Inventory.getAll((int[])nArray13).size(), llIIlIIlIl[1])) break block27;
                    int[] nArray14 = new int[llIIlIIlIl[1]];
                    nArray14[aB.llIIlIIlIl[0]] = llIIlIIlIl[14];
                    if (!aB.lIlIlIlIlIIlI(Inventory.getAll((int[])nArray14).size(), llIIlIIlIl[1])) break block27;
                    int[] nArray15 = new int[llIIlIIlIl[1]];
                    nArray15[aB.llIIlIIlIl[0]] = llIIlIIlIl[13];
                    if (!aB.lIlIlIlIlIIlI(Inventory.getAll((int[])nArray15).size(), llIIlIIlIl[1])) break block27;
                    int[] nArray16 = new int[llIIlIIlIl[1]];
                    nArray16[aB.llIIlIIlIl[0]] = llIIlIIlIl[10];
                    if (!aB.lIlIlIlIlIIlI(Inventory.getAll((int[])nArray16).size(), llIIlIIlIl[1])) break block27;
                    int[] nArray17 = new int[llIIlIIlIl[1]];
                    nArray17[aB.llIIlIIlIl[0]] = llIIlIIlIl[12];
                    if (!aB.lIlIlIlIIlllI(Inventory.getAll((int[])nArray17).size(), llIIlIIlIl[1])) break block28;
                }
                Time.sleepTicks((int)llIIlIIlIl[15]);
                "".length();
            }
            if (aB.lIlIlIlIIlIll(Inventory.contains(item -> item.getName().contains(llIIlIIlII[llIIlIIlIl[34]])) ? 1 : 0)) {
                Inventory.getFirst(item -> item.getName().contains(llIIlIIlII[llIIlIIlIl[33]])).useOn(Inventory.getFirst(item -> item.getName().contains(llIIlIIlII[llIIlIIlIl[32]])));
            }
            if (aB.lIlIlIlIIllll(llllllllllllllllllIlIIlIlIlIllll = Widgets.get((int)llIIlIIlIl[16], (int)llIIlIIlIl[17]))) {
                Dialog.continueSpace();
                Time.sleepTicks((int)llIIlIIlIl[4]);
                "".length();
                Time.sleepUntil(() -> {
                    boolean bl;
                    block4: {
                        block3: {
                            block2: {
                                int[] nArray = new int[llIIlIIlIl[1]];
                                nArray[aB.llIIlIIlIl[0]] = llIIlIIlIl[8];
                                if (!aB.lIlIlIlIIllIl(Inventory.contains((int[])nArray) ? 1 : 0)) break block2;
                                int[] nArray2 = new int[llIIlIIlIl[1]];
                                nArray2[aB.llIIlIIlIl[0]] = llIIlIIlIl[12];
                                if (!aB.lIlIlIlIIlIll(Inventory.contains((int[])nArray2) ? 1 : 0)) break block3;
                            }
                            if (!aB.lIlIlIlIIlIll(Dialog.canLevelUpContinue() ? 1 : 0)) break block4;
                        }
                        bl = llIIlIIlIl[1];
                        "".length();
                        if ("   ".length() != " ".length()) return bl;
                        return ((230 + 16 - 207 + 198 ^ 4 + 98 - 75 + 142) & (0x99 ^ 0xC1 ^ (0x4E ^ 0x52) ^ -" ".length())) != 0;
                    }
                    bl = llIIlIIlIl[0];
                    return bl;
                }, (int)llIIlIIlIl[18]);
                "".length();
            }
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean fN() {
        int n2;
        if (aB.lIlIlIlIIllII(Skills.getLevel((Skill)Skill.HERBLORE), llIIlIIlIl[7])) {
            int n3;
            int[] nArray = new int[llIIlIIlIl[1]];
            nArray[aB.llIIlIIlIl[0]] = llIIlIIlIl[8];
            if (aB.lIlIlIlIIlIll(Bank.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray2 = new int[llIIlIIlIl[1]];
                nArray2[aB.llIIlIIlIl[0]] = llIIlIIlIl[10];
                if (aB.lIlIlIlIIlIll(Bank.contains((int[])nArray2) ? 1 : 0)) {
                    n3 = llIIlIIlIl[1];
                    "".length();
                    if ("   ".length() >= "   ".length()) return n3 != 0;
                    return ((0x1D ^ 0x19 ^ (0xC2 ^ 0x89)) & (0x32 ^ 0x43 ^ (0x7E ^ 0x40) ^ -" ".length())) != 0;
                }
            }
            n3 = llIIlIIlIl[0];
            return n3 != 0;
        }
        if (aB.lIlIlIlIlIIIl(Skills.getLevel((Skill)Skill.HERBLORE), llIIlIIlIl[7]) && aB.lIlIlIlIIllII(Skills.getLevel((Skill)Skill.HERBLORE), llIIlIIlIl[11])) {
            int n4;
            int[] nArray = new int[llIIlIIlIl[1]];
            nArray[aB.llIIlIIlIl[0]] = llIIlIIlIl[12];
            if (aB.lIlIlIlIIlIll(Bank.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray3 = new int[llIIlIIlIl[1]];
                nArray3[aB.llIIlIIlIl[0]] = llIIlIIlIl[13];
                if (aB.lIlIlIlIIlIll(Bank.contains((int[])nArray3) ? 1 : 0)) {
                    n4 = llIIlIIlIl[1];
                    "".length();
                    if (((30 + 30 - -62 + 9 ^ 159 + 117 - 235 + 149) & (0xB4 ^ 0xC3 ^ (0x12 ^ 0x58) ^ -" ".length())) == 0) return n4 != 0;
                    return ((0x71 ^ 0x2D ^ (0xFE ^ 0xAB)) & (0 + 17 - -78 + 56 ^ 139 + 38 - 50 + 31 ^ -" ".length())) != 0;
                }
            }
            n4 = llIIlIIlIl[0];
            return n4 != 0;
        }
        if (!aB.lIlIlIlIlIIIl(Skills.getLevel((Skill)Skill.HERBLORE), llIIlIIlIl[11])) return llIIlIIlIl[0];
        int[] nArray = new int[llIIlIIlIl[1]];
        nArray[aB.llIIlIIlIl[0]] = llIIlIIlIl[8];
        if (aB.lIlIlIlIIlIll(Bank.contains((int[])nArray) ? 1 : 0)) {
            int[] nArray4 = new int[llIIlIIlIl[1]];
            nArray4[aB.llIIlIIlIl[0]] = llIIlIIlIl[14];
            if (aB.lIlIlIlIIlIll(Bank.contains((int[])nArray4) ? 1 : 0)) {
                n2 = llIIlIIlIl[1];
                "".length();
                if ("  ".length() < (0x3E ^ 0x32 ^ (2 ^ 0xA))) return n2 != 0;
                return ((131 + 93 - 206 + 134 ^ 14 + 75 - 59 + 159) & (0xA8 ^ 0x8F ^ "  ".length() ^ -" ".length())) != 0;
            }
        }
        n2 = llIIlIIlIl[0];
        return n2 != 0;
    }

    private static String lIlIlIIlIlllI(String llllllllllllllllllIlIIlIIllllIlI, String llllllllllllllllllIlIIlIIllllIIl) {
        try {
            SecretKeySpec llllllllllllllllllIlIIlIIlllllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllllIlIIlIIllllIIl.getBytes(StandardCharsets.UTF_8)), llIIlIIlIl[33]), "DES");
            Cipher llllllllllllllllllIlIIlIIllllllI = Cipher.getInstance("DES");
            llllllllllllllllllIlIIlIIllllllI.init(llIIlIIlIl[4], llllllllllllllllllIlIIlIIlllllll);
            return new String(llllllllllllllllllIlIIlIIllllllI.doFinal(Base64.getDecoder().decode(llllllllllllllllllIlIIlIIllllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllllIlIIlIIlllllIl) {
            llllllllllllllllllIlIIlIIlllllIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIlIlIlIIlI(int n2, int n3) {
        return n2 != n3;
    }

    private static void lIlIlIIllIIlI() {
        llIIlIIlIl = new int[36];
        aB.llIIlIIlIl[0] = (46 + 147 - 119 + 81 ^ 162 + 165 - 261 + 103) & (0x6B ^ 0 ^ (0x30 ^ 0x69) ^ -" ".length());
        aB.llIIlIIlIl[1] = " ".length();
        aB.llIIlIIlIl[2] = 0x6E ^ 0x3E;
        aB.llIIlIIlIl[3] = 0x80 ^ 0x84;
        aB.llIIlIIlIl[4] = "  ".length();
        aB.llIIlIIlIl[5] = "   ".length();
        aB.llIIlIIlIl[6] = 0xFFFFF79B & 0x1BEC;
        aB.llIIlIIlIl[7] = 0x8D ^ 0x97;
        aB.llIIlIIlIl[8] = 148 + 159 - 88 + 2;
        aB.llIIlIIlIl[9] = 99 + 143 - 197 + 105 ^ 56 + 93 - 5 + 8;
        aB.llIIlIIlIl[10] = 0xC4 ^ 0x9F;
        aB.llIIlIIlIl[11] = 0xC ^ 0x21;
        aB.llIIlIIlIl[12] = -(0xFFFFE9D7 & 0x5669) & (0xFFFFFFF7 & 0x47FF);
        aB.llIIlIIlIl[13] = 0xA4 ^ 0xC5;
        aB.llIIlIIlIl[14] = 0xA ^ 0x47 ^ (0xAC ^ 0x84);
        aB.llIIlIIlIl[15] = 0x36 ^ 0x33;
        aB.llIIlIIlIl[16] = -(0xFFFFA79F & 0x7EF2) & (0xFFFFA7BF & 0x7FDF);
        aB.llIIlIIlIl[17] = 0xFE ^ 0xBF ^ (0x21 ^ 0x6D);
        aB.llIIlIIlIl[18] = 0xFFFFFBBB & 0x65EC;
        aB.llIIlIIlIl[19] = -(0xFFFFCC7F & 0x7B97) & (0xFFFFFFFF & 0x4BFE);
        aB.llIIlIIlIl[20] = 0x92 ^ 0x86;
        aB.llIIlIIlIl[21] = 0xFFFFD19A & 0x2FF5;
        aB.llIIlIIlIl[22] = 74 + 64 - -33 + 78 ^ 57 + 114 - 53 + 39;
        aB.llIIlIIlIl[23] = 0xFFFF8372 & 0x7FDF;
        aB.llIIlIIlIl[24] = -(0xFFFFFDF4 & 0x4ABF) & (0xFFFFDFFB & 0x6FBF);
        aB.llIIlIIlIl[25] = -(0xFFFFF9DE & 0x5FEB) & (0xFFFFFBFD & 0x7FEF);
        aB.llIIlIIlIl[26] = -(0xFFFFDE64 & 0x27BF) & (0xFFFFFE6B & 0xF7FF);
        aB.llIIlIIlIl[27] = 0x56 ^ 0x4F;
        aB.llIIlIIlIl[28] = 0x48 ^ 0xB;
        aB.llIIlIIlIl[29] = 0x67 ^ 0x68;
        aB.llIIlIIlIl[30] = 0x8E ^ 0x88;
        aB.llIIlIIlIl[31] = 0xE7 ^ 0xC2 ^ (0xD ^ 0x4B);
        aB.llIIlIIlIl[32] = 0x9A ^ 0x9D;
        aB.llIIlIIlIl[33] = 0xC8 ^ 0xC0;
        aB.llIIlIIlIl[34] = 0x5E ^ 0x3E ^ (0x71 ^ 0x18);
        aB.llIIlIIlIl[35] = 7 ^ 0xD;
    }

    private static boolean lIlIlIlIIlIll(int n2) {
        return n2 != 0;
    }

    @Override
    public boolean ah() {
        boolean bl;
        if (aB.lIlIlIlIlIIIl(Skills.getLevel((Skill)Skill.HERBLORE), llIIlIIlIl[31])) {
            bl = llIIlIIlIl[1];
            "".length();
            if ((0x72 ^ 0x76) == 0) {
                return ((0xEC ^ 0xA8) & ~(0x70 ^ 0x34)) != 0;
            }
        } else {
            bl = llIIlIIlIl[0];
        }
        return bl;
    }

    private static boolean lIlIlIlIlIIIl(int n2, int n3) {
        return n2 >= n3;
    }

    @Override
    public boolean ae() {
        return llIIlIIlIl[0];
    }

    private static void lIlIlIIllIIIl() {
        llIIlIIlII = new String[llIIlIIlIl[35]];
        aB.llIIlIIlII[aB.llIIlIIlIl[0]] = aB.lIlIlIIlIlllI("DzVyJWhEr3HGcY7xtnKJ9g==", "ObLol");
        aB.llIIlIIlII[aB.llIIlIIlIl[1]] = aB.lIlIlIIlIlllI("Oi8yMHU7NNjPS4e2bGkUVL0I/j4IsJ52ZY4Hc7xKKsLDQL8os3iY4nb7p5gP/ow06z0Oxu09mZw=", "bKYoF");
        aB.llIIlIIlII[aB.llIIlIIlIl[4]] = aB.lIlIlIIlIllll("id4MBr7joi2foMRMVZYYgRS2iHSaoHhg", "MAJNO");
        aB.llIIlIIlII[aB.llIIlIIlIl[5]] = aB.lIlIlIIlIllll("QZFER/7vnMaEEpRvyprczOniGC4Z7+Eh", "SMAJR");
        aB.llIIlIIlII[aB.llIIlIIlIl[3]] = aB.lIlIlIIllIIII("LzFEDzoddAkHOws9CgloCyEUHiQRMRdCaAsjDRorED0KCWgMO0QsHSEdKik=", "xTdnH");
        aB.llIIlIIlII[aB.llIIlIIlIl[15]] = aB.lIlIlIIllIIII("AT4sGAcrdyQeHSU4OgI=", "LWTqi");
        aB.llIIlIIlII[aB.llIIlIIlIl[30]] = aB.lIlIlIIllIIII("Bwo7GzggHSw=", "OoIyT");
        aB.llIIlIIlII[aB.llIIlIIlIl[32]] = aB.lIlIlIIllIIII("Dy0PBSE=", "ZClpU");
        aB.llIIlIIlII[aB.llIIlIIlIl[33]] = aB.lIlIlIIlIlllI("KWGiDJROfHs=", "eytiZ");
        aB.llIIlIIlII[aB.llIIlIIlIl[34]] = aB.lIlIlIIllIIII("ED4sGxw/", "SVEhy");
    }
}

