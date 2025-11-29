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
package gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks;

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
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.AHelper;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.ac;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.BHelper;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.DHelper;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.EHelper;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.ZHelper;

public class ABHelper
implements ac {
    public static  boolean bt;
    
    public static  List<d> bv;

    public static void Q() {
        d var1;
        if (aB.lIlIlIlIIllII(Skills.getLevel((Skill)Skill.HERBLORE), llIIlIIlIl[7])) {
            int[] nArray = new int[llIIlIIlIl[1]];
            nArray[aB.llIIlIIlIl[0]] = llIIlIIlIl[8];
            if (aB.lIlIlIlIIllIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                d d2 = new DHelper(llIIlIIlIl[8], llIIlIIlIl[19], llIIlIIlIl[20]);
                bv.add(d2);

            }
            int[] nArray2 = new int[llIIlIIlIl[1]];
            nArray2[aB.llIIlIIlIl[0]] = llIIlIIlIl[10];
            if (aB.lIlIlIlIIllIl(Bank.contains((int[])nArray2) ? 1 : 0)) {
                var1 = new DHelper(llIIlIIlIl[10], aB.fM(), llIIlIIlIl[21]);
                bv.add(var1);

            }
        }
        if (aB.lIlIlIlIlIIIl(Skills.getLevel((Skill)Skill.HERBLORE), llIIlIIlIl[7]) && aB.lIlIlIlIIllII(Skills.getLevel((Skill)Skill.HERBLORE), llIIlIIlIl[11])) {
            int[] nArray = new int[llIIlIIlIl[1]];
            nArray[aB.llIIlIIlIl[0]] = llIIlIIlIl[12];
            if (aB.lIlIlIlIIllIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                var1 = new DHelper(llIIlIIlIl[12], aB.fM(), llIIlIIlIl[22]);
                bv.add(var1);

            }
            int[] nArray3 = new int[llIIlIIlIl[1]];
            nArray3[aB.llIIlIIlIl[0]] = llIIlIIlIl[13];
            if (aB.lIlIlIlIIllIl(Bank.contains((int[])nArray3) ? 1 : 0)) {
                var1 = new DHelper(llIIlIIlIl[13], aB.fM(), llIIlIIlIl[23]);
                bv.add(var1);

            }
        }
        if (aB.lIlIlIlIlIIIl(Skills.getLevel((Skill)Skill.HERBLORE), llIIlIIlIl[11])) {
            int[] nArray = new int[llIIlIIlIl[1]];
            nArray[aB.llIIlIIlIl[0]] = llIIlIIlIl[8];
            if (aB.lIlIlIlIIllIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                var1 = new DHelper(llIIlIIlIl[8], llIIlIIlIl[19], llIIlIIlIl[20]);
                bv.add(var1);

            }
            int[] nArray4 = new int[llIIlIIlIl[1]];
            nArray4[aB.llIIlIIlIl[0]] = llIIlIIlIl[14];
            if (aB.lIlIlIlIIllIl(Bank.contains((int[])nArray4) ? 1 : 0)) {
                var1 = new DHelper(llIIlIIlIl[14], llIIlIIlIl[19], llIIlIIlIl[24]);
                bv.add(var1);

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
            void var2;
            return (int)((var2 - Skills.getExperience((Skill)Skill.HERBLORE)) / llIIlIIlIl[28] + llIIlIIlIl[29]);
        }
        return llIIlIIlIl[1];
    }

    private static boolean lIlIlIlIIllII(int n2, int n3) {
        return n2 < n3;
    }

        return String.valueOf(var3);
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

                    if ((0x31 ^ 0x7D ^ (0x31 ^ 0x78)) != 0) return n3 != 0;
                    return ((0x4C ^ 3 ^ (0 ^ 7)) & (0x10 ^ 7 ^ (0x59 ^ 6) ^ -1)) != 0;
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

                    if (null == null) return n4 != 0;
                    return false;
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

                if (-(0x88 ^ 0x8D) < 0) return n2 != 0;
                return false;
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
            BankLocation var4;
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
                        var4 = BankLocation.getNearest();
                        if (aB.lIlIlIlIIllll(var4) && aB.lIlIlIlIIllIl(var4.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderSotf.c = llIIlIIlII[llIIlIIlIl[4]];
                            a.a(var4);
                        }
                        if (aB.lIlIlIlIIllll(var4) && aB.lIlIlIlIIlIll(var4.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderSotf.c = llIIlIIlII[llIIlIIlIl[5]];
                            if (aB.lIlIlIlIIllIl(Bank.isOpen() ? 1 : 0)) {
                                a.a();
                                Time.sleepUntil(() -> Bank.isOpen(), (int)llIIlIIlIl[6]);

                            }
                            if (aB.lIlIlIlIIlIll(Bank.isOpen() ? 1 : 0)) {
                                if (aB.lIlIlIlIlIIII(Inventory.getAll().size())) {
                                    Bank.depositInventory();
                                    Time.sleepTicks((int)llIIlIIlIl[5]);

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

            }
            if (aB.lIlIlIlIIlIll(Inventory.contains(item -> item.getName().contains(llIIlIIlII[llIIlIIlIl[34]])) ? 1 : 0)) {
                Inventory.getFirst(item -> item.getName().contains(llIIlIIlII[llIIlIIlIl[33]])).useOn(Inventory.getFirst(item -> item.getName().contains(llIIlIIlII[llIIlIIlIl[32]])));
            }
            if (aB.lIlIlIlIIllll(var4 = Widgets.get((int)llIIlIIlIl[16], (int)llIIlIIlIl[17]))) {
                Dialog.continueSpace();
                Time.sleepTicks((int)llIIlIIlIl[4]);

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

                        if (3 != 1) return bl;
                        return ((230 + 16 - 207 + 198 ^ 4 + 98 - 75 + 142) & (0x99 ^ 0xC1 ^ (0x4E ^ 0x52) ^ -1)) != 0;
                    }
                    bl = llIIlIIlIl[0];
                    return bl;
                }, (int)llIIlIIlIl[18]);

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

                    if (3 >= 3) return n3 != 0;
                    return ((0x1D ^ 0x19 ^ (0xC2 ^ 0x89)) & (0x32 ^ 0x43 ^ (0x7E ^ 0x40) ^ -1)) != 0;
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

                    if (((30 + 30 - -62 + 9 ^ 159 + 117 - 235 + 149) & (0xB4 ^ 0xC3 ^ (0x12 ^ 0x58) ^ -1)) == 0) return n4 != 0;
                    return ((0x71 ^ 0x2D ^ (0xFE ^ 0xAB)) & (0 + 17 - -78 + 56 ^ 139 + 38 - 50 + 31 ^ -1)) != 0;
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

                if (2 < (0x3E ^ 0x32 ^ (2 ^ 0xA))) return n2 != 0;
                return false;
            }
        }
        n2 = llIIlIIlIl[0];
        return n2 != 0;
    }

    private static boolean lIlIlIlIlIIlI(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean lIlIlIlIIlIll(int n2) {
        return n2 != 0;
    }

    @Override
    public boolean ah() {
        boolean bl;
        if (aB.lIlIlIlIlIIIl(Skills.getLevel((Skill)Skill.HERBLORE), llIIlIIlIl[31])) {
            bl = llIIlIIlIl[1];

            if ((0x72 ^ 0x76) == 0) {
                return false;
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
        aB.llIIlIIlII[aB.llIIlIIlIl[0]] = "Buying items";
        aB.llIIlIIlII[aB.llIIlIIlIl[1]] = "Finished buying items, switching back to herblore";
        aB.llIIlIIlII[aB.llIIlIIlIl[4]] = "Navigating to bank";
        aB.llIIlIIlII[aB.llIIlIIlIl[5]] = "Handling banking";
        aB.llIIlIIlII[aB.llIIlIIlIl[3]] = "We are missing supplies, switching to BUYING";
        aB.llIIlIIlII[aB.llIIlIIlIl[15]] = "Mixing potions";
        aB.llIIlIIlII[aB.llIIlIIlIl[30]] = "Herblore";
        aB.llIIlIIlII[aB.llIIlIIlIl[32]] = "Uncut";
        aB.llIIlIIlII[aB.llIIlIIlIl[33]] = "Chisel";
        aB.llIIlIIlII[aB.llIIlIIlIl[34]] = "Chisel";
    }
}

