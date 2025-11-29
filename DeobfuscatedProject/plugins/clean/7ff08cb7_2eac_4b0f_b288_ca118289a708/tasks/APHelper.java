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
package gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks;

import gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks.AHelper;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.ab;
import gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks.BHelper;
import gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks.DHelper;
import gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks.EHelper;
import gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks.YHelper;
import gg.squire.account.AccBuilderGWD;
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

public class APHelper
implements ab {
    
    public static  boolean bv;
    
    public static  List<d> bx;

    private static boolean lIlIlIIIIlIl(int n2) {
        return n2 != 0;
    }

    static {
        ap.lIlIlIIIIlII();
        ap.lIlIlIIIIIll();
        bx = new ArrayList<d>();
    }

    @Override
    public String ag() {
        return llIIIlllI[llIIlIIII[30]];
    }

    @Override
    public boolean ae() {
        return llIIlIIII[0];
    }

    private static boolean lIlIlIIIlIIl(Object object) {
        return object != null;
    }

    public static void Q() {
        d lIllIlIIIllIlI;
        if (ap.lIlIlIIIIllI(Skills.getLevel((Skill)Skill.HERBLORE), llIIlIIII[7])) {
            int[] nArray = new int[llIIlIIII[1]];
            nArray[ap.llIIlIIII[0]] = llIIlIIII[8];
            if (ap.lIlIlIIIIlll(Bank.contains((int[])nArray) ? 1 : 0)) {
                d d2 = new DHelper(llIIlIIII[8], llIIlIIII[19], llIIlIIII[20]);
                bx.add(d2);

            }
            int[] nArray2 = new int[llIIlIIII[1]];
            nArray2[ap.llIIlIIII[0]] = llIIlIIII[10];
            if (ap.lIlIlIIIIlll(Bank.contains((int[])nArray2) ? 1 : 0)) {
                lIllIlIIIllIlI = new DHelper(llIIlIIII[10], ap.eL(), llIIlIIII[21]);
                bx.add(lIllIlIIIllIlI);

            }
        }
        if (ap.lIlIlIIIlIll(Skills.getLevel((Skill)Skill.HERBLORE), llIIlIIII[7]) && ap.lIlIlIIIIllI(Skills.getLevel((Skill)Skill.HERBLORE), llIIlIIII[11])) {
            int[] nArray = new int[llIIlIIII[1]];
            nArray[ap.llIIlIIII[0]] = llIIlIIII[12];
            if (ap.lIlIlIIIIlll(Bank.contains((int[])nArray) ? 1 : 0)) {
                lIllIlIIIllIlI = new DHelper(llIIlIIII[12], ap.eL(), llIIlIIII[22]);
                bx.add(lIllIlIIIllIlI);

            }
            int[] nArray3 = new int[llIIlIIII[1]];
            nArray3[ap.llIIlIIII[0]] = llIIlIIII[13];
            if (ap.lIlIlIIIIlll(Bank.contains((int[])nArray3) ? 1 : 0)) {
                lIllIlIIIllIlI = new DHelper(llIIlIIII[13], ap.eL(), llIIlIIII[23]);
                bx.add(lIllIlIIIllIlI);

            }
        }
        if (ap.lIlIlIIIlIll(Skills.getLevel((Skill)Skill.HERBLORE), llIIlIIII[11])) {
            int[] nArray = new int[llIIlIIII[1]];
            nArray[ap.llIIlIIII[0]] = llIIlIIII[8];
            if (ap.lIlIlIIIIlll(Bank.contains((int[])nArray) ? 1 : 0)) {
                lIllIlIIIllIlI = new DHelper(llIIlIIII[8], llIIlIIII[19], llIIlIIII[20]);
                bx.add(lIllIlIIIllIlI);

            }
            int[] nArray4 = new int[llIIlIIII[1]];
            nArray4[ap.llIIlIIII[0]] = llIIlIIII[14];
            if (ap.lIlIlIIIIlll(Bank.contains((int[])nArray4) ? 1 : 0)) {
                lIllIlIIIllIlI = new DHelper(llIIlIIII[14], llIIlIIII[19], llIIlIIII[24]);
                bx.add(lIllIlIIIllIlI);

            }
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean an() {
        int n2;
        if (ap.lIlIlIIIIllI(Skills.getLevel((Skill)Skill.HERBLORE), llIIlIIII[7])) {
            int n3;
            int[] nArray = new int[llIIlIIII[1]];
            nArray[ap.llIIlIIII[0]] = llIIlIIII[8];
            if (ap.lIlIlIIIIlIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray2 = new int[llIIlIIII[1]];
                nArray2[ap.llIIlIIII[0]] = llIIlIIII[10];
                if (ap.lIlIlIIIIlIl(Inventory.contains((int[])nArray2) ? 1 : 0)) {
                    n3 = llIIlIIII[1];

                    if (-(8 ^ 0xD) < 0) return n3 != 0;
                    return false;
                }
            }
            n3 = llIIlIIII[0];
            return n3 != 0;
        }
        if (ap.lIlIlIIIlIll(Skills.getLevel((Skill)Skill.HERBLORE), llIIlIIII[7]) && ap.lIlIlIIIIllI(Skills.getLevel((Skill)Skill.HERBLORE), llIIlIIII[11])) {
            int n4;
            int[] nArray = new int[llIIlIIII[1]];
            nArray[ap.llIIlIIII[0]] = llIIlIIII[12];
            if (ap.lIlIlIIIIlIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray3 = new int[llIIlIIII[1]];
                nArray3[ap.llIIlIIII[0]] = llIIlIIII[13];
                if (ap.lIlIlIIIIlIl(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                    n4 = llIIlIIII[1];

                    if (null == null) return n4 != 0;
                    return false;
                }
            }
            n4 = llIIlIIII[0];
            return n4 != 0;
        }
        if (!ap.lIlIlIIIlIll(Skills.getLevel((Skill)Skill.HERBLORE), llIIlIIII[11])) return llIIlIIII[0];
        int[] nArray = new int[llIIlIIII[1]];
        nArray[ap.llIIlIIII[0]] = llIIlIIII[8];
        if (ap.lIlIlIIIIlIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
            int[] nArray4 = new int[llIIlIIII[1]];
            nArray4[ap.llIIlIIII[0]] = llIIlIIII[14];
            if (ap.lIlIlIIIIlIl(Inventory.contains((int[])nArray4) ? 1 : 0)) {
                n2 = llIIlIIII[1];

                if (2 == 2) return n2 != 0;
                return false;
            }
        }
        n2 = llIIlIIII[0];
        return n2 != 0;
    }

    private static boolean lIlIlIIIlIII(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIlIlIIIllII(int n2, int n3) {
        return n2 != n3;
    }

    @Override
    public int af() {
        ap.eK();
        return llIIlIIII[22];
    }

    private static boolean lIlIlIIIlIll(int n2, int n3) {
        return n2 >= n3;
    }

    /*
     * WARNING - void declaration
     */
    private static int eL() {
        int n2 = llIIlIIII[25];
        int n3 = llIIlIIII[26];
        if (ap.lIlIlIIIIllI(Skills.getLevel((Skill)Skill.HERBLORE), llIIlIIII[7])) {
            return (n2 - Skills.getExperience((Skill)Skill.HERBLORE)) / llIIlIIII[27] + llIIlIIII[15];
        }
        if (ap.lIlIlIIIlIll(Skills.getLevel((Skill)Skill.HERBLORE), llIIlIIII[7]) && ap.lIlIlIIIIllI(Skills.getLevel((Skill)Skill.HERBLORE), llIIlIIII[11])) {
            void lIllIlIIIlIllI;
            return (int)((lIllIlIIIlIllI - Skills.getExperience((Skill)Skill.HERBLORE)) / llIIlIIII[28] + llIIlIIII[29]);
        }
        return llIIlIIII[1];
    }

        return String.valueOf(lIllIIllllllII);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean eM() {
        int n2;
        if (ap.lIlIlIIIIllI(Skills.getLevel((Skill)Skill.HERBLORE), llIIlIIII[7])) {
            int n3;
            int[] nArray = new int[llIIlIIII[1]];
            nArray[ap.llIIlIIII[0]] = llIIlIIII[8];
            if (ap.lIlIlIIIIlIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray2 = new int[llIIlIIII[1]];
                nArray2[ap.llIIlIIII[0]] = llIIlIIII[10];
                if (ap.lIlIlIIIIlIl(Bank.contains((int[])nArray2) ? 1 : 0)) {
                    n3 = llIIlIIII[1];

                    if (((6 ^ 0x26) & ~(0x9F ^ 0xBF)) == 0) return n3 != 0;
                    return ((0x40 ^ 0x5C) & ~(0xAD ^ 0xB1) & ~((0xA1 ^ 0xC1) & ~(0xC1 ^ 0xA1))) != 0;
                }
            }
            n3 = llIIlIIII[0];
            return n3 != 0;
        }
        if (ap.lIlIlIIIlIll(Skills.getLevel((Skill)Skill.HERBLORE), llIIlIIII[7]) && ap.lIlIlIIIIllI(Skills.getLevel((Skill)Skill.HERBLORE), llIIlIIII[11])) {
            int n4;
            int[] nArray = new int[llIIlIIII[1]];
            nArray[ap.llIIlIIII[0]] = llIIlIIII[12];
            if (ap.lIlIlIIIIlIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray3 = new int[llIIlIIII[1]];
                nArray3[ap.llIIlIIII[0]] = llIIlIIII[13];
                if (ap.lIlIlIIIIlIl(Bank.contains((int[])nArray3) ? 1 : 0)) {
                    n4 = llIIlIIII[1];

                    if (((8 + 117 - 11 + 30 ^ 33 + 51 - -34 + 42) & (0x91 ^ 0xAF ^ (0x16 ^ 0x18) ^ -1)) == 0) return n4 != 0;
                    return ((36 + 4 - -84 + 3 ^ (0xCB ^ 0xAA)) & (20 + 139 - 4 + 23 ^ 82 + 21 - 95 + 164 ^ -1)) != 0;
                }
            }
            n4 = llIIlIIII[0];
            return n4 != 0;
        }
        if (!ap.lIlIlIIIlIll(Skills.getLevel((Skill)Skill.HERBLORE), llIIlIIII[11])) return llIIlIIII[0];
        int[] nArray = new int[llIIlIIII[1]];
        nArray[ap.llIIlIIII[0]] = llIIlIIII[8];
        if (ap.lIlIlIIIIlIl(Bank.contains((int[])nArray) ? 1 : 0)) {
            int[] nArray4 = new int[llIIlIIII[1]];
            nArray4[ap.llIIlIIII[0]] = llIIlIIII[14];
            if (ap.lIlIlIIIIlIl(Bank.contains((int[])nArray4) ? 1 : 0)) {
                n2 = llIIlIIII[1];

                if (((0x3B ^ 0x53 ^ (0x25 ^ 0x4A)) & (109 + 0 - 79 + 109 ^ 25 + 125 - 33 + 23 ^ -1)) <= 2) return n2 != 0;
                return ((0x15 ^ 0x23 ^ (0xB8 ^ 0xA5)) & (0xDF ^ 0xA5 ^ (0xA ^ 0x5B) ^ -1)) != 0;
            }
        }
        n2 = llIIlIIII[0];
        return n2 != 0;
    }

    public static void eK() {
        block26: {
            BankLocation lIllIlIIIlllII;
            block28: {
                block27: {
                    if (ap.lIlIlIIIIlIl(bv ? 1 : 0)) {
                        AccBuilderGWD.c = llIIIlllI[llIIlIIII[0]];
                        b.a(bx);
                        if (ap.lIlIlIIIIllI(bx.size(), llIIlIIII[1])) {
                            System.out.println(llIIIlllI[llIIlIIII[1]]);
                            bv = llIIlIIII[0];
                        }
                    }
                    if (!ap.lIlIlIIIIlll(bv ? 1 : 0)) break block26;
                    if (ap.lIlIlIIIIllI(e.j(llIIlIIII[2]), llIIlIIII[3])) {
                        y.bh();
                    }
                    if (ap.lIlIlIIIIlll(ap.an() ? 1 : 0) && ap.lIlIlIIIlIII(e.j(llIIlIIII[2]), llIIlIIII[3])) {
                        lIllIlIIIlllII = BankLocation.getNearest();
                        if (ap.lIlIlIIIlIIl(lIllIlIIIlllII) && ap.lIlIlIIIIlll(lIllIlIIIlllII.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderGWD.c = llIIIlllI[llIIlIIII[4]];
                            a.a(lIllIlIIIlllII);
                        }
                        if (ap.lIlIlIIIlIIl(lIllIlIIIlllII) && ap.lIlIlIIIIlIl(lIllIlIIIlllII.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderGWD.c = llIIIlllI[llIIlIIII[5]];
                            if (ap.lIlIlIIIIlll(Bank.isOpen() ? 1 : 0)) {
                                a.a();
                                Time.sleepUntil(() -> Bank.isOpen(), (int)llIIlIIII[6]);

                            }
                            if (ap.lIlIlIIIIlIl(Bank.isOpen() ? 1 : 0)) {
                                if (ap.lIlIlIIIlIlI(Inventory.getAll().size())) {
                                    Bank.depositInventory();
                                    Time.sleepTicks((int)llIIlIIII[5]);

                                }
                                if (ap.lIlIlIIIIlll(ap.eM() ? 1 : 0)) {
                                    ap.Q();
                                    System.out.println(llIIIlllI[llIIlIIII[3]]);
                                    bv = llIIlIIII[1];
                                    return;
                                }
                                if (ap.lIlIlIIIIllI(Skills.getLevel((Skill)Skill.HERBLORE), llIIlIIII[7])) {
                                    a.a(llIIlIIII[8], llIIlIIII[9]);
                                    a.a(llIIlIIII[10], llIIlIIII[9]);
                                }
                                if (ap.lIlIlIIIlIll(Skills.getLevel((Skill)Skill.HERBLORE), llIIlIIII[7]) && ap.lIlIlIIIIllI(Skills.getLevel((Skill)Skill.HERBLORE), llIIlIIII[11])) {
                                    a.a(llIIlIIII[12], llIIlIIII[9]);
                                    a.a(llIIlIIII[13], llIIlIIII[9]);
                                }
                                if (ap.lIlIlIIIlIll(Skills.getLevel((Skill)Skill.HERBLORE), llIIlIIII[11])) {
                                    a.a(llIIlIIII[8], llIIlIIII[9]);
                                    a.a(llIIlIIII[14], llIIlIIII[9]);
                                }
                            }
                        }
                    }
                    if (!ap.lIlIlIIIIlIl(ap.an() ? 1 : 0)) break block26;
                    if (ap.lIlIlIIIIlIl(Bank.isOpen() ? 1 : 0)) {
                        Bank.close();
                    }
                    if (ap.lIlIlIIIIlIl(Dialog.isOpen() ? 1 : 0)) {
                        Dialog.close();
                    }
                    AccBuilderGWD.c = llIIIlllI[llIIlIIII[15]];
                    int[] nArray = new int[llIIlIIII[1]];
                    nArray[ap.llIIlIIII[0]] = llIIlIIII[8];
                    if (ap.lIlIlIIIIlIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        int[] nArray2 = new int[llIIlIIII[1]];
                        nArray2[ap.llIIlIIII[0]] = llIIlIIII[10];
                        if (ap.lIlIlIIIIlIl(Inventory.contains((int[])nArray2) ? 1 : 0)) {
                            int[] nArray3 = new int[llIIlIIII[1]];
                            nArray3[ap.llIIlIIII[0]] = llIIlIIII[8];
                            int[] nArray4 = new int[llIIlIIII[1]];
                            nArray4[ap.llIIlIIII[0]] = llIIlIIII[10];
                            Inventory.getFirst((int[])nArray3).useOn(Inventory.getFirst((int[])nArray4));
                            Time.sleepTicks((int)llIIlIIII[1]);

                        }
                    }
                    int[] nArray5 = new int[llIIlIIII[1]];
                    nArray5[ap.llIIlIIII[0]] = llIIlIIII[12];
                    if (ap.lIlIlIIIIlIl(Inventory.contains((int[])nArray5) ? 1 : 0)) {
                        int[] nArray6 = new int[llIIlIIII[1]];
                        nArray6[ap.llIIlIIII[0]] = llIIlIIII[13];
                        if (ap.lIlIlIIIIlIl(Inventory.contains((int[])nArray6) ? 1 : 0)) {
                            int[] nArray7 = new int[llIIlIIII[1]];
                            nArray7[ap.llIIlIIII[0]] = llIIlIIII[12];
                            int[] nArray8 = new int[llIIlIIII[1]];
                            nArray8[ap.llIIlIIII[0]] = llIIlIIII[13];
                            Inventory.getFirst((int[])nArray7).useOn(Inventory.getFirst((int[])nArray8));
                            Time.sleepTicks((int)llIIlIIII[1]);

                        }
                    }
                    int[] nArray9 = new int[llIIlIIII[1]];
                    nArray9[ap.llIIlIIII[0]] = llIIlIIII[8];
                    if (ap.lIlIlIIIIlIl(Inventory.contains((int[])nArray9) ? 1 : 0)) {
                        int[] nArray10 = new int[llIIlIIII[1]];
                        nArray10[ap.llIIlIIII[0]] = llIIlIIII[14];
                        if (ap.lIlIlIIIIlIl(Inventory.contains((int[])nArray10) ? 1 : 0)) {
                            int[] nArray11 = new int[llIIlIIII[1]];
                            nArray11[ap.llIIlIIII[0]] = llIIlIIII[8];
                            int[] nArray12 = new int[llIIlIIII[1]];
                            nArray12[ap.llIIlIIII[0]] = llIIlIIII[14];
                            Inventory.getFirst((int[])nArray11).useOn(Inventory.getFirst((int[])nArray12));
                            Time.sleepTicks((int)llIIlIIII[1]);

                        }
                    }
                    int[] nArray13 = new int[llIIlIIII[1]];
                    nArray13[ap.llIIlIIII[0]] = llIIlIIII[8];
                    if (!ap.lIlIlIIIllII(Inventory.getAll((int[])nArray13).size(), llIIlIIII[1])) break block27;
                    int[] nArray14 = new int[llIIlIIII[1]];
                    nArray14[ap.llIIlIIII[0]] = llIIlIIII[14];
                    if (!ap.lIlIlIIIllII(Inventory.getAll((int[])nArray14).size(), llIIlIIII[1])) break block27;
                    int[] nArray15 = new int[llIIlIIII[1]];
                    nArray15[ap.llIIlIIII[0]] = llIIlIIII[13];
                    if (!ap.lIlIlIIIllII(Inventory.getAll((int[])nArray15).size(), llIIlIIII[1])) break block27;
                    int[] nArray16 = new int[llIIlIIII[1]];
                    nArray16[ap.llIIlIIII[0]] = llIIlIIII[10];
                    if (!ap.lIlIlIIIllII(Inventory.getAll((int[])nArray16).size(), llIIlIIII[1])) break block27;
                    int[] nArray17 = new int[llIIlIIII[1]];
                    nArray17[ap.llIIlIIII[0]] = llIIlIIII[12];
                    if (!ap.lIlIlIIIlIII(Inventory.getAll((int[])nArray17).size(), llIIlIIII[1])) break block28;
                }
                Time.sleepTicks((int)llIIlIIII[15]);

            }
            if (ap.lIlIlIIIIlIl(Inventory.contains(item -> item.getName().contains(llIIIlllI[llIIlIIII[34]])) ? 1 : 0)) {
                Inventory.getFirst(item -> item.getName().contains(llIIIlllI[llIIlIIII[33]])).useOn(Inventory.getFirst(item -> item.getName().contains(llIIIlllI[llIIlIIII[32]])));
            }
            if (ap.lIlIlIIIlIIl(lIllIlIIIlllII = Widgets.get((int)llIIlIIII[16], (int)llIIlIIII[17]))) {
                Dialog.continueSpace();
                Time.sleepTicks((int)llIIlIIII[4]);

                Time.sleepUntil(() -> {
                    boolean bl;
                    block4: {
                        block3: {
                            block2: {
                                int[] nArray = new int[llIIlIIII[1]];
                                nArray[ap.llIIlIIII[0]] = llIIlIIII[8];
                                if (!ap.lIlIlIIIIlll(Inventory.contains((int[])nArray) ? 1 : 0)) break block2;
                                int[] nArray2 = new int[llIIlIIII[1]];
                                nArray2[ap.llIIlIIII[0]] = llIIlIIII[12];
                                if (!ap.lIlIlIIIIlIl(Inventory.contains((int[])nArray2) ? 1 : 0)) break block3;
                            }
                            if (!ap.lIlIlIIIIlIl(Dialog.canLevelUpContinue() ? 1 : 0)) break block4;
                        }
                        bl = llIIlIIII[1];

                        if (((0x9C ^ 0xAB) & ~(0xB8 ^ 0x8F)) >= 0) return bl;
                        return false;
                    }
                    bl = llIIlIIII[0];
                    return bl;
                }, (int)llIIlIIII[18]);

            }
        }
    }

    @Override
    public boolean ah() {
        boolean bl;
        if (ap.lIlIlIIIlIll(Skills.getLevel((Skill)Skill.HERBLORE), llIIlIIII[31])) {
            bl = llIIlIIII[1];

        } else {
            bl = llIIlIIII[0];
        }
        return bl;
    }

    private static boolean lIlIlIIIlIlI(int n2) {
        return n2 > 0;
    }

    private static boolean lIlIlIIIIlll(int n2) {
        return n2 == 0;
    }

    private static void lIlIlIIIIIll() {
        llIIIlllI = new String[llIIlIIII[35]];
        ap.llIIIlllI[ap.llIIlIIII[0]] = "Buying items";
        ap.llIIIlllI[ap.llIIlIIII[1]] = "Finished buying items, switching back to herblore";
        ap.llIIIlllI[ap.llIIlIIII[4]] = "Navigating to bank";
        ap.llIIIlllI[ap.llIIlIIII[5]] = "Handling banking";
        ap.llIIIlllI[ap.llIIlIIII[3]] = "We are missing supplies, switching to BUYING";
        ap.llIIIlllI[ap.llIIlIIII[15]] = "Mixing potions";
        ap.llIIIlllI[ap.llIIlIIII[30]] = "Herblore";
        ap.llIIIlllI[ap.llIIlIIII[32]] = "Uncut";
        ap.llIIIlllI[ap.llIIlIIII[33]] = "Chisel";
        ap.llIIIlllI[ap.llIIlIIII[34]] = "Chisel";
    }

    private static boolean lIlIlIIIIllI(int n2, int n3) {
        return n2 < n3;
    }
}

