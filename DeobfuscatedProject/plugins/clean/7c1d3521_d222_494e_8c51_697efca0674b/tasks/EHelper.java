/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.NPC
 *  net.runelite.api.Prayer
 *  net.runelite.api.Skill
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.widgets.Widget
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.input.Mouse
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Bank$WithdrawMode
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 *  net.unethicalite.api.widgets.Dialog
 *  net.unethicalite.api.widgets.Prayers
 *  net.unethicalite.api.widgets.Widgets
 *  net.unethicalite.client.Static
 */
package gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks;

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
import net.runelite.api.NPC;
import net.runelite.api.Prayer;
import net.runelite.api.Skill;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.input.Mouse;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Prayers;
import net.unethicalite.api.widgets.Widgets;
import net.unethicalite.client.Static;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.GHelper;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.AHelper;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.ADHelper;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.ANHelper;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.ac;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.AVHelper;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.BHelper;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.DHelper;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.EHelper;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.FHelper;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.GHelper;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.JHelper;

public class EHelper
implements ac {
    static  WorldPoint fp;
    static final  int fn;
    static  WorldArea fu;
    static  WorldArea ff;
    public static  String da;
    public static  boolean bt;
    public static  String h;
    static  WorldPoint fo;
    static  WorldPoint fs;
    static  WorldArea ft;
    
    static  boolean dj;
    public static  List<d> bv;
    static  WorldPoint fq;
    static  int di;
    static  String[] cE;
    static  WorldPoint fr;
    static  WorldPoint ed;

    private static boolean lIllIllIIlllI(Object object) {
        return object != null;
    }

    @Override
    public boolean ae() {
        return llIllIIlIl[1];
    }

    private static boolean lIllIllIlIIll(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIllIllIIllll(int n2) {
        return n2 > 0;
    }

        return String.valueOf(var1);
    }

    @Override
    public boolean ah() {
        int n2;
        if (E.lIllIllIIllIl(e.j(llIllIIlIl[9]), llIllIIlIl[6]) && E.lIllIllIlIIIl(Players.getLocal().getWorldLocation().distanceTo(ed), llIllIIlIl[8])) {
            n2 = llIllIIlIl[0];

            }
        } else {
            n2 = llIllIIlIl[1];
        }
        return n2 != 0;
    }

    private static boolean lIllIllIIlIll(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIllIllIlIIII(int n2) {
        return n2 < 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean an() {
        int n2;
        int[] nArray = new int[llIllIIlIl[0]];
        nArray[E.llIllIIlIl[1]] = llIllIIlIl[15];
        if (E.lIllIllIIlIlI(Inventory.contains((int[])nArray) ? 1 : 0)) {
            int[] nArray2 = new int[llIllIIlIl[0]];
            nArray2[E.llIllIIlIl[1]] = llIllIIlIl[16];
            if (E.lIllIllIIlIlI(Inventory.contains((int[])nArray2) ? 1 : 0)) {
                int[] nArray3 = new int[llIllIIlIl[0]];
                nArray3[E.llIllIIlIl[1]] = llIllIIlIl[17];
                if (E.lIllIllIIlIlI(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                    int[] nArray4 = new int[llIllIIlIl[0]];
                    nArray4[E.llIllIIlIl[1]] = llIllIIlIl[18];
                    if (E.lIllIllIIlIlI(Inventory.contains((int[])nArray4) ? 1 : 0)) {
                        int[] nArray5 = new int[llIllIIlIl[0]];
                        nArray5[E.llIllIIlIl[1]] = llIllIIlIl[19];
                        if (E.lIllIllIIlIlI(Inventory.contains((int[])nArray5) ? 1 : 0)) {
                            int[] nArray6 = new int[llIllIIlIl[0]];
                            nArray6[E.llIllIIlIl[1]] = llIllIIlIl[20];
                            if (E.lIllIllIIlIlI(Inventory.contains((int[])nArray6) ? 1 : 0)) {
                                int[] nArray7 = new int[llIllIIlIl[0]];
                                nArray7[E.llIllIIlIl[1]] = llIllIIlIl[22];
                                if (E.lIllIllIIlIlI(Inventory.contains((int[])nArray7) ? 1 : 0)) {
                                    int[] nArray8 = new int[llIllIIlIl[0]];
                                    nArray8[E.llIllIIlIl[1]] = llIllIIlIl[24];
                                    if (E.lIllIllIIlIlI(Inventory.contains((int[])nArray8) ? 1 : 0)) {
                                        int[] nArray9 = new int[llIllIIlIl[0]];
                                        nArray9[E.llIllIIlIl[1]] = llIllIIlIl[40];
                                        if (E.lIllIllIIlIlI(Inventory.contains((int[])nArray9) ? 1 : 0)) {
                                            String[] stringArray = new String[llIllIIlIl[0]];
                                            stringArray[E.llIllIIlIl[1]] = llIllIIIlI[llIllIIlIl[139]];
                                            if (E.lIllIllIIlIlI(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                                                int[] nArray10 = new int[llIllIIlIl[0]];
                                                nArray10[E.llIllIIlIl[1]] = llIllIIlIl[26];
                                                if (E.lIllIllIIlIlI(Inventory.contains((int[])nArray10) ? 1 : 0)) {
                                                    int[] nArray11 = new int[llIllIIlIl[0]];
                                                    nArray11[E.llIllIIlIl[1]] = llIllIIlIl[36];
                                                    if (E.lIllIllIIlIlI(Inventory.contains((int[])nArray11) ? 1 : 0)) {
                                                        int[] nArray12 = new int[llIllIIlIl[0]];
                                                        nArray12[E.llIllIIlIl[1]] = llIllIIlIl[34];
                                                        if (E.lIllIllIIlIlI(Inventory.contains((int[])nArray12) ? 1 : 0)) {
                                                            int[] nArray13 = new int[llIllIIlIl[0]];
                                                            nArray13[E.llIllIIlIl[1]] = llIllIIlIl[28];
                                                            if (E.lIllIllIIlIlI(Inventory.contains((int[])nArray13) ? 1 : 0)) {
                                                                n2 = llIllIIlIl[0];

                                                                if (((0xAD ^ 0xBB) & ~(0x1D ^ 0xB)) >= 0) return n2 != 0;
                                                                return false;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        n2 = llIllIIlIl[1];
        return n2 != 0;
    }

    private static boolean lIllIllIIlIlI(int n2) {
        return n2 != 0;
    }

    static {
        E.lIllIllIIlIII();
        E.lIllIllIIIlll();
        fn = llIllIIlIl[9];
        bv = new ArrayList<d>();
        ed = new WorldPoint(llIllIIlIl[154], llIllIIlIl[155], llIllIIlIl[1]);
        fo = new WorldPoint(llIllIIlIl[156], llIllIIlIl[157], llIllIIlIl[1]);
        fp = new WorldPoint(llIllIIlIl[158], llIllIIlIl[159], llIllIIlIl[1]);
        fq = new WorldPoint(llIllIIlIl[60], llIllIIlIl[160], llIllIIlIl[1]);
        fr = new WorldPoint(llIllIIlIl[161], llIllIIlIl[162], llIllIIlIl[1]);
        fs = new WorldPoint(llIllIIlIl[163], llIllIIlIl[164], llIllIIlIl[1]);
        ft = new WorldArea(llIllIIlIl[165], llIllIIlIl[64], llIllIIlIl[48], llIllIIlIl[2], llIllIIlIl[1]);
        fu = new WorldArea(llIllIIlIl[166], llIllIIlIl[167], llIllIIlIl[94], llIllIIlIl[129], llIllIIlIl[1]);
        ff = new WorldArea(llIllIIlIl[168], llIllIIlIl[169], llIllIIlIl[48], llIllIIlIl[49], llIllIIlIl[1]);
        String[] stringArray = new String[llIllIIlIl[54]];
        stringArray[E.llIllIIlIl[1]] = llIllIIIlI[llIllIIlIl[170]];
        stringArray[E.llIllIIlIl[0]] = llIllIIIlI[llIllIIlIl[171]];
        stringArray[E.llIllIIlIl[4]] = llIllIIIlI[llIllIIlIl[6]];
        stringArray[E.llIllIIlIl[7]] = llIllIIIlI[llIllIIlIl[172]];
        stringArray[E.llIllIIlIl[8]] = llIllIIIlI[llIllIIlIl[173]];
        stringArray[E.llIllIIlIl[10]] = llIllIIIlI[llIllIIlIl[174]];
        stringArray[E.llIllIIlIl[12]] = llIllIIIlI[llIllIIlIl[175]];
        stringArray[E.llIllIIlIl[21]] = llIllIIIlI[llIllIIlIl[176]];
        stringArray[E.llIllIIlIl[23]] = llIllIIIlI[llIllIIlIl[177]];
        stringArray[E.llIllIIlIl[25]] = llIllIIIlI[llIllIIlIl[178]];
        stringArray[E.llIllIIlIl[27]] = llIllIIIlI[llIllIIlIl[179]];
        stringArray[E.llIllIIlIl[29]] = llIllIIIlI[llIllIIlIl[180]];
        stringArray[E.llIllIIlIl[31]] = llIllIIIlI[llIllIIlIl[181]];
        stringArray[E.llIllIIlIl[33]] = llIllIIIlI[llIllIIlIl[182]];
        stringArray[E.llIllIIlIl[35]] = llIllIIIlI[llIllIIlIl[183]];
        stringArray[E.llIllIIlIl[37]] = llIllIIIlI[llIllIIlIl[184]];
        stringArray[E.llIllIIlIl[13]] = llIllIIIlI[llIllIIlIl[185]];
        stringArray[E.llIllIIlIl[45]] = llIllIIIlI[llIllIIlIl[186]];
        stringArray[E.llIllIIlIl[46]] = llIllIIIlI[llIllIIlIl[187]];
        stringArray[E.llIllIIlIl[47]] = llIllIIIlI[llIllIIlIl[188]];
        stringArray[E.llIllIIlIl[43]] = llIllIIIlI[llIllIIlIl[189]];
        stringArray[E.llIllIIlIl[48]] = llIllIIIlI[llIllIIlIl[190]];
        stringArray[E.llIllIIlIl[49]] = llIllIIIlI[llIllIIlIl[191]];
        stringArray[E.llIllIIlIl[50]] = llIllIIIlI[llIllIIlIl[192]];
        stringArray[E.llIllIIlIl[51]] = llIllIIIlI[llIllIIlIl[193]];
        cE = stringArray;
        da = llIllIIIlI[llIllIIlIl[194]];
        h = "In search of Myreque " + da;
    }

    private static boolean lIllIllIIllII(int n2) {
        return n2 == 0;
    }

    public static void bV() {
        if (E.lIllIllIIlIlI(bt ? 1 : 0)) {
            b.a(bv);
            if (E.lIllIllIIlIll(bv.size(), llIllIIlIl[0])) {
                System.out.println(llIllIIIlI[llIllIIlIl[1]]);
                bt = llIllIIlIl[1];
            }
        }
        if (E.lIllIllIIllII(bt ? 1 : 0)) {
            NPC llllllllllllllllllIIIlIIlllIlIll2;
            Object var2;
            if (E.lIllIllIIlIll(Skills.getLevel((Skill)Skill.AGILITY), llIllIIlIl[2])) {
                da = llIllIIIlI[llIllIIlIl[0]];
                av.eA();
            }
            if (E.lIllIllIIllIl(Skills.getLevel((Skill)Skill.AGILITY), llIllIIlIl[2]) && E.lIllIllIIlIll(Skills.getLevel((Skill)Skill.PRAYER), llIllIIlIl[3])) {
                da = llIllIIIlI[llIllIIlIl[4]];
                aD.fY();
            }
            if (E.lIllIllIIlIll(e.j(llIllIIlIl[5]), llIllIIlIl[6]) && E.lIllIllIIllIl(Skills.getLevel((Skill)Skill.AGILITY), llIllIIlIl[2]) && E.lIllIllIIllIl(Skills.getLevel((Skill)Skill.PRAYER), llIllIIlIl[3])) {
                if (E.lIllIllIIlIlI(Inventory.contains((int[])f.bf) ? 1 : 0)) {
                    Inventory.getFirst((int[])f.bf).interact(llIllIIIlI[llIllIIlIl[7]]);
                }
                da = llIllIIIlI[llIllIIlIl[8]];
                G.cb();
            }
            if (E.lIllIllIIllII(E.an() ? 1 : 0) && E.lIllIllIIllIl(Skills.getLevel((Skill)Skill.AGILITY), llIllIIlIl[2]) && E.lIllIllIIllIl(Skills.getLevel((Skill)Skill.PRAYER), llIllIIlIl[3]) && E.lIllIllIIlIll(e.j(llIllIIlIl[9]), llIllIIlIl[0]) && E.lIllIllIIllIl(e.j(llIllIIlIl[5]), llIllIIlIl[6])) {
                var2 = BankLocation.getNearest();
                if (E.lIllIllIIlllI(var2) && E.lIllIllIIllII(var2.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderSotf.c = llIllIIIlI[llIllIIlIl[10]];
                    a.a((BankLocation)var2);
                }
                if (E.lIllIllIIlllI(var2) && E.lIllIllIIlIlI(var2.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (E.lIllIllIIllII(Bank.isOpen() ? 1 : 0)) {
                        a.a();
                        Time.sleepUntil(() -> Bank.isOpen(), (int)llIllIIlIl[11]);

                    }
                    if (E.lIllIllIIlIlI(Bank.isOpen() ? 1 : 0)) {
                        AccBuilderSotf.c = llIllIIIlI[llIllIIlIl[12]];
                        if (E.lIllIllIIllll(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks((int)llIllIIlIl[8]);

                        }
                        if (E.lIllIllIIllll(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks((int)llIllIIlIl[4]);

                        }
                        int[] nArray = new int[llIllIIlIl[13]];
                        nArray[E.llIllIIlIl[1]] = llIllIIlIl[14];
                        nArray[E.llIllIIlIl[0]] = llIllIIlIl[15];
                        nArray[E.llIllIIlIl[4]] = llIllIIlIl[16];
                        nArray[E.llIllIIlIl[7]] = llIllIIlIl[17];
                        nArray[E.llIllIIlIl[8]] = llIllIIlIl[18];
                        nArray[E.llIllIIlIl[10]] = llIllIIlIl[19];
                        nArray[E.llIllIIlIl[12]] = llIllIIlIl[20];
                        nArray[E.llIllIIlIl[21]] = llIllIIlIl[22];
                        nArray[E.llIllIIlIl[23]] = llIllIIlIl[24];
                        nArray[E.llIllIIlIl[25]] = llIllIIlIl[26];
                        nArray[E.llIllIIlIl[27]] = llIllIIlIl[28];
                        nArray[E.llIllIIlIl[29]] = llIllIIlIl[30];
                        nArray[E.llIllIIlIl[31]] = llIllIIlIl[32];
                        nArray[E.llIllIIlIl[33]] = llIllIIlIl[34];
                        nArray[E.llIllIIlIl[35]] = llIllIIlIl[36];
                        nArray[E.llIllIIlIl[37]] = llIllIIlIl[38];
                        if (E.lIllIllIIllII(e.c(nArray) ? 1 : 0)) {
                            E.Q();
                            System.out.println(llIllIIIlI[llIllIIlIl[21]]);
                            bt = llIllIIlIl[0];
                            return;
                        }
                        int[] nArray2 = new int[llIllIIlIl[13]];
                        nArray2[E.llIllIIlIl[1]] = llIllIIlIl[14];
                        nArray2[E.llIllIIlIl[0]] = llIllIIlIl[15];
                        nArray2[E.llIllIIlIl[4]] = llIllIIlIl[16];
                        nArray2[E.llIllIIlIl[7]] = llIllIIlIl[17];
                        nArray2[E.llIllIIlIl[8]] = llIllIIlIl[18];
                        nArray2[E.llIllIIlIl[10]] = llIllIIlIl[19];
                        nArray2[E.llIllIIlIl[12]] = llIllIIlIl[20];
                        nArray2[E.llIllIIlIl[21]] = llIllIIlIl[22];
                        nArray2[E.llIllIIlIl[23]] = llIllIIlIl[24];
                        nArray2[E.llIllIIlIl[25]] = llIllIIlIl[26];
                        nArray2[E.llIllIIlIl[27]] = llIllIIlIl[28];
                        nArray2[E.llIllIIlIl[29]] = llIllIIlIl[30];
                        nArray2[E.llIllIIlIl[31]] = llIllIIlIl[32];
                        nArray2[E.llIllIIlIl[33]] = llIllIIlIl[34];
                        nArray2[E.llIllIIlIl[35]] = llIllIIlIl[36];
                        nArray2[E.llIllIIlIl[37]] = llIllIIlIl[38];
                        if (E.lIllIllIIlIlI(e.c(nArray2) ? 1 : 0)) {
                            int[] nArray3 = new int[llIllIIlIl[0]];
                            nArray3[E.llIllIIlIl[1]] = llIllIIlIl[38];
                            if (E.lIllIllIIllII(Equipment.contains((int[])nArray3) ? 1 : 0)) {
                                a.a(llIllIIlIl[38], llIllIIlIl[0]);
                                int[] nArray4 = new int[llIllIIlIl[0]];
                                nArray4[E.llIllIIlIl[1]] = llIllIIlIl[38];
                                if (E.lIllIllIIlIlI(Inventory.contains((int[])nArray4) ? 1 : 0)) {
                                    int[] nArray5 = new int[llIllIIlIl[0]];
                                    nArray5[E.llIllIIlIl[1]] = llIllIIlIl[38];
                                    Inventory.getFirst((int[])nArray5).interact(llIllIIIlI[llIllIIlIl[23]]);
                                    Time.sleepTicks((int)llIllIIlIl[0]);

                                }
                            }
                            if (E.lIllIllIIllII(Bank.isOpen() ? 1 : 0)) {
                                a.a();
                                Time.sleepTicks((int)llIllIIlIl[8]);

                            }
                            if (E.lIllIllIIlIlI(Bank.isOpen() ? 1 : 0)) {
                                a.a(llIllIIlIl[15], llIllIIlIl[0]);
                                a.a(llIllIIlIl[16], llIllIIlIl[0]);
                                a.a(llIllIIlIl[17], llIllIIlIl[0]);
                                a.a(llIllIIlIl[18], llIllIIlIl[0]);
                                a.a(llIllIIlIl[19], llIllIIlIl[4]);
                                a.a(llIllIIlIl[20], llIllIIlIl[39]);
                                a.a(llIllIIlIl[22], llIllIIlIl[0]);
                                a.a(llIllIIlIl[24], llIllIIlIl[12]);
                                a.a(llIllIIlIl[40], llIllIIlIl[41]);
                                Bank.withdraw((String)llIllIIIlI[llIllIIlIl[25]], (int)llIllIIlIl[0], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                                a.a(llIllIIlIl[28], llIllIIlIl[0]);
                                a.a(llIllIIlIl[30], llIllIIlIl[0]);
                                a.a(llIllIIlIl[26], llIllIIlIl[12]);
                                a.a(llIllIIlIl[36], llIllIIlIl[27]);
                                a.a(llIllIIlIl[14], llIllIIlIl[27]);
                                a.a(llIllIIlIl[34], llIllIIlIl[0]);
                                a.a(llIllIIlIl[32], llIllIIlIl[0]);
                            }
                        }
                    }
                }
            }
            if (E.lIllIllIIlIlI(Inventory.contains((int[])f.ba) ? 1 : 0) && E.lIllIllIIlIll(Movement.getRunEnergy(), llIllIIlIl[42])) {
                Inventory.getFirst((int[])f.ba).interact(llIllIIIlI[llIllIIlIl[27]]);
                Time.sleepTicks((int)llIllIIlIl[0]);

            }
            if (E.lIllIllIlIIII(E.lIllIllIIlIIl(e.w(), 50.0))) {
                int[] nArray = new int[llIllIIlIl[0]];
                nArray[E.llIllIIlIl[1]] = llIllIIlIl[32];
                if (E.lIllIllIIlIlI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    int[] nArray6 = new int[llIllIIlIl[0]];
                    nArray6[E.llIllIIlIl[1]] = llIllIIlIl[32];
                    Inventory.getFirst((int[])nArray6).interact(llIllIIIlI[llIllIIlIl[29]]);
                    Time.sleepTicks((int)llIllIIlIl[4]);

                }
            }
            if (E.lIllIllIIlIlI(E.an() ? 1 : 0) && E.lIllIllIIllII(e.j(llIllIIlIl[9]))) {
                da = llIllIIIlI[llIllIIlIl[31]];
                if (E.lIllIllIlIIIl(Players.getLocal().getWorldLocation().distanceTo(ed), llIllIIlIl[8])) {
                    AccBuilderSotf.c = llIllIIIlI[llIllIIlIl[33]];
                    if (E.lIllIllIlIIlI(Players.getLocal().getWorldLocation().distanceTo(b.I), llIllIIlIl[43])) {
                        int[] nArray = new int[llIllIIlIl[0]];
                        nArray[E.llIllIIlIl[1]] = llIllIIlIl[38];
                        if (E.lIllIllIIlIlI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                            int[] nArray7 = new int[llIllIIlIl[0]];
                            nArray7[E.llIllIIlIl[1]] = llIllIIlIl[38];
                            if (E.lIllIllIIllII(Equipment.contains((int[])nArray7) ? 1 : 0)) {
                                int[] nArray8 = new int[llIllIIlIl[0]];
                                nArray8[E.llIllIIlIl[1]] = llIllIIlIl[38];
                                Inventory.getFirst((int[])nArray8).interact(llIllIIIlI[llIllIIlIl[35]]);
                            }
                        }
                        int[] nArray9 = new int[llIllIIlIl[0]];
                        nArray9[E.llIllIIlIl[1]] = llIllIIlIl[36];
                        if (E.lIllIllIIlIlI(Inventory.contains((int[])nArray9) ? 1 : 0) && E.lIllIllIlIIll(Players.getLocal().getAnimation(), llIllIIlIl[44])) {
                            int[] nArray10 = new int[llIllIIlIl[0]];
                            nArray10[E.llIllIIlIl[1]] = llIllIIlIl[36];
                            Inventory.getFirst((int[])nArray10).interact(llIllIIIlI[llIllIIlIl[37]]);
                            Time.sleepTicks((int)llIllIIlIl[4]);

                        }
                    }
                    if (E.lIllIllIlIIIl(Players.getLocal().getWorldLocation().distanceTo(b.I), llIllIIlIl[43])) {
                        if (E.lIllIllIIlIlI(Dialog.isOpen() ? 1 : 0)) {
                            Dialog.close();
                        }
                        Movement.walkTo((WorldPoint)ed);

                        Time.sleepTicks((int)llIllIIlIl[0]);

                    }
                }
                if (E.lIllIllIlIIlI(Players.getLocal().getWorldLocation().distanceTo(ed), llIllIIlIl[8])) {
                    AccBuilderSotf.c = llIllIIIlI[llIllIIlIl[13]];
                    g.a(llIllIIIlI[llIllIIlIl[45]], cE);
                }
            }
            if (!E.lIllIllIlIlII(e.j(llIllIIlIl[9]), llIllIIlIl[10]) || !E.lIllIllIlIlII(e.j(llIllIIlIl[9]), llIllIIlIl[27]) || E.lIllIllIlIIll(e.j(llIllIIlIl[9]), llIllIIlIl[37])) {
                int[] nArray = new int[llIllIIlIl[0]];
                nArray[E.llIllIIlIl[1]] = llIllIIlIl[26];
                if (E.lIllIllIIlIlI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    AccBuilderSotf.c = llIllIIIlI[llIllIIlIl[46]];
                    String[] stringArray = new String[llIllIIlIl[0]];
                    stringArray[E.llIllIIlIl[1]] = llIllIIIlI[llIllIIlIl[47]];
                    Inventory.getFirst((String[])stringArray).interact(llIllIIIlI[llIllIIlIl[43]]);
                    Time.sleepTicks((int)llIllIIlIl[4]);

                }
                int[] nArray11 = new int[llIllIIlIl[0]];
                nArray11[E.llIllIIlIl[1]] = llIllIIlIl[26];
                if (E.lIllIllIIllII(Inventory.contains((int[])nArray11) ? 1 : 0) && E.lIllIllIlIIlI(Players.getLocal().getWorldLocation().distanceTo(ed), llIllIIlIl[27])) {
                    AccBuilderSotf.c = llIllIIIlI[llIllIIlIl[48]];
                    int[] nArray12 = new int[llIllIIlIl[0]];
                    nArray12[E.llIllIIlIl[1]] = llIllIIlIl[34];
                    if (E.lIllIllIIlIlI(Inventory.contains((int[])nArray12) ? 1 : 0) && E.lIllIllIlIIll(Players.getLocal().getAnimation(), llIllIIlIl[44])) {
                        int[] nArray13 = new int[llIllIIlIl[0]];
                        nArray13[E.llIllIIlIl[1]] = llIllIIlIl[34];
                        Inventory.getFirst((int[])nArray13).interact(llIllIIIlI[llIllIIlIl[49]]);
                        Time.sleepTicks((int)llIllIIlIl[4]);

                    }
                }
                if (E.lIllIllIlIIIl(Players.getLocal().getWorldLocation().distanceTo(ed), llIllIIlIl[27]) && E.lIllIllIlIIIl(Players.getLocal().getWorldLocation().distanceTo(fo), llIllIIlIl[27])) {
                    AccBuilderSotf.c = llIllIIIlI[llIllIIlIl[50]];
                    Movement.walkTo((WorldPoint)fo);

                    Time.sleepTicks((int)llIllIIlIl[0]);

                }
                if (E.lIllIllIlIIlI(Players.getLocal().getWorldLocation().distanceTo(fo), llIllIIlIl[27])) {
                    AccBuilderSotf.c = llIllIIIlI[llIllIIlIl[51]];
                    var2 = NPCs.getAll(nPC -> {
                        boolean bl;
                        if (!E.lIllIllIIllII(nPC.getName().contains(llIllIIIlI[llIllIIlIl[152]]) ? 1 : 0) || E.lIllIllIIlIlI(nPC.getName().contains(llIllIIIlI[llIllIIlIl[153]]) ? 1 : 0)) {
                            bl = llIllIIlIl[0];

                            if ((0x26 ^ 0x22) == 1) {
                                return false;
                            }
                        } else {
                            bl = llIllIIlIl[1];
                        }
                        return bl;
                    });
                    if (E.lIllIllIIllII(var2.isEmpty() ? 1 : 0) && E.lIllIllIIlllI(llllllllllllllllllIIIlIIlllIlIll2 = (NPC)var2.stream().filter(nPC -> {
                        boolean bl;
                        if (E.lIllIllIlIIlI(nPC.getWorldLocation().distanceTo(fo), llIllIIlIl[4])) {
                            bl = llIllIIlIl[0];

                            if (((0xB3 ^ 0xAC ^ (0x5F ^ 0x15)) & (0x22 ^ 0x13 ^ (0x20 ^ 0x44) ^ -1)) == (0x79 ^ 0x28 ^ (0x60 ^ 0x35))) {
                                return false;
                            }
                        } else {
                            bl = llIllIIlIl[1];
                        }
                        return bl;
                    }).findAny().orElse(null))) {
                        int var3 = llIllIIlIl[0];
                        int var4 = Static.getClient().getWorld();
                        while (E.lIllIllIIlIlI(var3)) {
                            if (E.lIllIllIlIIIl(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llIllIIlIl[52], llIllIIlIl[53], llIllIIlIl[1])), llIllIIlIl[4])) {
                                AccBuilderSotf.c = llIllIIIlI[llIllIIlIl[54]];
                                Movement.walkTo((WorldPoint)new WorldPoint(llIllIIlIl[52], llIllIIlIl[53], llIllIIlIl[1]));

                                Time.sleepTicks((int)llIllIIlIl[0]);

                            }
                            if (E.lIllIllIlIIlI(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llIllIIlIl[52], llIllIIlIl[53], llIllIIlIl[1])), llIllIIlIl[4])) {
                                e.k(e.v());
                            }
                            if (!E.lIllIllIlIlII(Static.getClient().getWorld(), var4)) continue;
                            var3 = llIllIIlIl[1];

                            if (2 != 0) break;
                            return;
                        }
                    }
                    g.a(llIllIIIlI[llIllIIlIl[2]], cE);
                }
            }
            if (E.lIllIllIlIIll(e.j(llIllIIlIl[9]), llIllIIlIl[43])) {
                if (E.lIllIllIlIIlI(Players.getLocal().getWorldLocation().distanceTo(fo), llIllIIlIl[27])) {
                    if (E.lIllIllIIllII(Dialog.isOpen() ? 1 : 0)) {
                        String[] stringArray = new String[llIllIIlIl[0]];
                        stringArray[E.llIllIIlIl[1]] = llIllIIIlI[llIllIIlIl[55]];
                        TileObjects.getNearest((String[])stringArray).interact(llIllIIIlI[llIllIIlIl[56]]);
                        Time.sleepTicks((int)llIllIIlIl[4]);

                    }
                    g.a(cE);
                }
                if (E.lIllIllIlIIlI(Players.getLocal().getWorldLocation().distanceTo(fp), llIllIIlIl[42])) {
                    if (E.lIllIllIlIIIl(Players.getLocal().getWorldLocation().distanceTo(fq), llIllIIlIl[10])) {
                        AccBuilderSotf.c = llIllIIIlI[llIllIIlIl[57]];
                        Movement.walkTo((WorldPoint)fq);

                        Time.sleepTicks((int)llIllIIlIl[0]);

                    }
                    if (E.lIllIllIlIIlI(Players.getLocal().getWorldLocation().distanceTo(fq), llIllIIlIl[10])) {
                        String[] stringArray = new String[llIllIIlIl[0]];
                        stringArray[E.llIllIIlIl[1]] = llIllIIIlI[llIllIIlIl[58]];
                        TileObjects.getNearest((String[])stringArray).interact(llIllIIIlI[llIllIIlIl[59]]);
                        Time.sleepTicks((int)llIllIIlIl[4]);

                    }
                }
            }
            if (E.lIllIllIlIIll(e.j(llIllIIlIl[9]), llIllIIlIl[54]) && E.lIllIllIIlIlI(fu.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                di = llIllIIlIl[1];
                var2 = new WorldPoint(llIllIIlIl[60], llIllIIlIl[61], llIllIIlIl[1]);
                llllllllllllllllllIIIlIIlllIlIll2 = new WorldPoint(llIllIIlIl[60], llIllIIlIl[62], llIllIIlIl[1]);
                WorldPoint var3 = new WorldPoint(llIllIIlIl[60], llIllIIlIl[63], llIllIIlIl[1]);
                WorldPoint var4 = new WorldPoint(llIllIIlIl[60], llIllIIlIl[64], llIllIIlIl[1]);
                if (E.lIllIllIlIIIl(Players.getLocal().getWorldLocation().distanceTo(fq), llIllIIlIl[10]) && E.lIllIllIIllII(Players.getLocal().getWorldLocation().equals(var2) ? 1 : 0) && E.lIllIllIIllII(Players.getLocal().getWorldLocation().equals((Object)llllllllllllllllllIIIlIIlllIlIll2) ? 1 : 0) && E.lIllIllIIllII(Players.getLocal().getWorldLocation().equals((Object)var4) ? 1 : 0) && E.lIllIllIIllII(Players.getLocal().getWorldLocation().equals((Object)var3) ? 1 : 0) && E.lIllIllIIllII(ft.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderSotf.c = llIllIIIlI[llIllIIlIl[65]];
                    Movement.walkTo((WorldPoint)fq);

                    Time.sleepTicks((int)llIllIIlIl[0]);

                }
                if (E.lIllIllIlIIlI(Players.getLocal().getWorldLocation().distanceTo(fq), llIllIIlIl[10]) && E.lIllIllIIllII(Players.getLocal().getWorldLocation().equals(var2) ? 1 : 0) && E.lIllIllIIllII(Players.getLocal().getWorldLocation().equals((Object)llllllllllllllllllIIIlIIlllIlIll2) ? 1 : 0) && E.lIllIllIIllII(Players.getLocal().getWorldLocation().equals((Object)var4) ? 1 : 0) && E.lIllIllIIllII(Players.getLocal().getWorldLocation().equals((Object)var3) ? 1 : 0)) {
                    String[] stringArray = new String[llIllIIlIl[0]];
                    stringArray[E.llIllIIlIl[1]] = llIllIIIlI[llIllIIlIl[66]];
                    TileObjects.getNearest((String[])stringArray).interact(llIllIIIlI[llIllIIlIl[67]]);
                    Time.sleepTicks((int)llIllIIlIl[4]);

                }
                if (!E.lIllIllIIllII(Players.getLocal().getWorldLocation().equals(var2) ? 1 : 0) || !E.lIllIllIIllII(Players.getLocal().getWorldLocation().equals((Object)llllllllllllllllllIIIlIIlllIlIll2) ? 1 : 0) || !E.lIllIllIIllII(Players.getLocal().getWorldLocation().equals((Object)var4) ? 1 : 0) || E.lIllIllIIlIlI(Players.getLocal().getWorldLocation().equals((Object)var3) ? 1 : 0)) {
                    String[] stringArray = new String[llIllIIlIl[0]];
                    stringArray[E.llIllIIlIl[1]] = llIllIIIlI[llIllIIlIl[68]];
                    TileObject var5 = TileObjects.getNearest((String[])stringArray);
                    if (E.lIllIllIIlllI(var5)) {
                        String[] stringArray2 = new String[llIllIIlIl[0]];
                        stringArray2[E.llIllIIlIl[1]] = llIllIIIlI[llIllIIlIl[69]];
                        if (E.lIllIllIIlIlI(var5.hasAction(stringArray2) ? 1 : 0)) {
                            AccBuilderSotf.c = llIllIIIlI[llIllIIlIl[70]];
                            var5.interact(llIllIIIlI[llIllIIlIl[71]]);
                            Time.sleepTicks((int)llIllIIlIl[4]);

                        }
                    }
                }
                if (E.lIllIllIIlIlI(Players.getLocal().getWorldLocation().equals((Object)var4) ? 1 : 0)) {
                    String[] stringArray = new String[llIllIIlIl[0]];
                    stringArray[E.llIllIIlIl[1]] = llIllIIIlI[llIllIIlIl[72]];
                    TileObjects.getNearest((String[])stringArray).interact(llIllIIIlI[llIllIIlIl[73]]);
                    Time.sleepTicks((int)llIllIIlIl[4]);

                }
                if (E.lIllIllIIlIlI(ft.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && E.lIllIllIIllII(Players.getLocal().getWorldLocation().equals(var2) ? 1 : 0) && E.lIllIllIIllII(Players.getLocal().getWorldLocation().equals((Object)llllllllllllllllllIIIlIIlllIlIll2) ? 1 : 0) && E.lIllIllIIllII(Players.getLocal().getWorldLocation().equals((Object)var4) ? 1 : 0) && E.lIllIllIIllII(Players.getLocal().getWorldLocation().equals((Object)var3) ? 1 : 0)) {
                    if (E.lIllIllIlIIIl(Players.getLocal().getWorldLocation().distanceTo(fr), llIllIIlIl[10])) {
                        AccBuilderSotf.c = llIllIIIlI[llIllIIlIl[74]];
                        Movement.walkTo((WorldPoint)fr);

                        Time.sleepTicks((int)llIllIIlIl[0]);

                    }
                    if (E.lIllIllIlIIlI(Players.getLocal().getWorldLocation().distanceTo(fr), llIllIIlIl[10])) {
                        AccBuilderSotf.c = llIllIIIlI[llIllIIlIl[75]];
                        g.a(llIllIIIlI[llIllIIlIl[76]], cE);
                    }
                }
            }
            if (E.lIllIllIlIIll(e.j(llIllIIlIl[9]), llIllIIlIl[77])) {
                if (E.lIllIllIIllII(Dialog.isOpen() ? 1 : 0)) {
                    String[] stringArray = new String[llIllIIlIl[0]];
                    stringArray[E.llIllIIlIl[1]] = llIllIIIlI[llIllIIlIl[78]];
                    var2 = NPCs.getAll((String[])stringArray);
                    if (E.lIllIllIIllll(var2.size())) {
                        ((NPC)var2.get(llIllIIlIl[1])).interact(llIllIIIlI[llIllIIlIl[3]]);
                        Time.sleepUntil(() -> Dialog.isOpen(), (int)llIllIIlIl[79]);

                    }
                }
                if (E.lIllIllIIlIlI(Dialog.isOpen() ? 1 : 0)) {
                    if (!E.lIllIllIIllII(Dialog.canContinueNPC() ? 1 : 0) || E.lIllIllIIlIlI(Dialog.canContinue() ? 1 : 0)) {
                        Dialog.continueSpace();
                    }
                    if (E.lIllIllIIllII((var2 = Widgets.getChildren((int)llIllIIlIl[80], (int)llIllIIlIl[0], widget -> widget.isVisible())).isEmpty() ? 1 : 0)) {
                        int llllllllllllllllllIIIlIIlllIlIll2 = llIllIIlIl[1];
                        while (E.lIllIllIIlIll(llllllllllllllllllIIIlIIlllIlIll2, var2.size())) {
                            if ((!E.lIllIllIIllII(((Widget)var2.get(llIllIIlIl[1])).getText().contains(llIllIIIlI[llIllIIlIl[81]]) ? 1 : 0) || E.lIllIllIIlIlI(((Widget)var2.get(llIllIIlIl[1])).getText().contains(llIllIIIlI[llIllIIlIl[82]]) ? 1 : 0)) && E.lIllIllIIlIlI(((Widget)var2.get(llllllllllllllllllIIIlIIlllIlIll2)).getText().contains(llIllIIIlI[llIllIIlIl[83]]) ? 1 : 0)) {
                                Mouse.click((int)((Widget)var2.get(llllllllllllllllllIIIlIIlllIlIll2)).getClickPoint().getX(), (int)((Widget)var2.get(llllllllllllllllllIIIlIIlllIlIll2)).getClickPoint().getY(), (boolean)llIllIIlIl[0]);
                                Time.sleepTicks((int)llIllIIlIl[4]);

                            }
                            if (E.lIllIllIIlIlI(((Widget)var2.get(llIllIIlIl[1])).getText().contains(llIllIIIlI[llIllIIlIl[84]]) ? 1 : 0) && E.lIllIllIIlIlI(((Widget)var2.get(llllllllllllllllllIIIlIIlllIlIll2)).getText().contains(llIllIIIlI[llIllIIlIl[42]]) ? 1 : 0)) {
                                Mouse.click((int)((Widget)var2.get(llllllllllllllllllIIIlIIlllIlIll2)).getClickPoint().getX(), (int)((Widget)var2.get(llllllllllllllllllIIIlIIlllIlIll2)).getClickPoint().getY(), (boolean)llIllIIlIl[0]);
                                Time.sleepTicks((int)llIllIIlIl[4]);

                            }
                            if ((!E.lIllIllIIllII(((Widget)var2.get(llIllIIlIl[1])).getText().contains(llIllIIIlI[llIllIIlIl[85]]) ? 1 : 0) || E.lIllIllIIlIlI(((Widget)var2.get(llIllIIlIl[1])).getText().contains(llIllIIIlI[llIllIIlIl[77]]) ? 1 : 0)) && E.lIllIllIIlIlI(((Widget)var2.get(llllllllllllllllllIIIlIIlllIlIll2)).getText().contains(llIllIIIlI[llIllIIlIl[86]]) ? 1 : 0)) {
                                Mouse.click((int)((Widget)var2.get(llllllllllllllllllIIIlIIlllIlIll2)).getClickPoint().getX(), (int)((Widget)var2.get(llllllllllllllllllIIIlIIlllIlIll2)).getClickPoint().getY(), (boolean)llIllIIlIl[0]);
                                Time.sleepTicks((int)llIllIIlIl[4]);

                            }
                            if (E.lIllIllIIlIlI(((Widget)var2.get(llIllIIlIl[1])).getText().contains(llIllIIIlI[llIllIIlIl[87]]) ? 1 : 0) && E.lIllIllIIlIlI(((Widget)var2.get(llllllllllllllllllIIIlIIlllIlIll2)).getText().contains(llIllIIIlI[llIllIIlIl[88]]) ? 1 : 0)) {
                                Mouse.click((int)((Widget)var2.get(llllllllllllllllllIIIlIIlllIlIll2)).getClickPoint().getX(), (int)((Widget)var2.get(llllllllllllllllllIIIlIIlllIlIll2)).getClickPoint().getY(), (boolean)llIllIIlIl[0]);
                                Time.sleepTicks((int)llIllIIlIl[4]);

                            }
                            if (E.lIllIllIIlIlI(((Widget)var2.get(llIllIIlIl[1])).getText().contains(llIllIIIlI[llIllIIlIl[89]]) ? 1 : 0) && E.lIllIllIIlIlI(((Widget)var2.get(llllllllllllllllllIIIlIIlllIlIll2)).getText().contains(llIllIIIlI[llIllIIlIl[90]]) ? 1 : 0)) {
                                Mouse.click((int)((Widget)var2.get(llllllllllllllllllIIIlIIlllIlIll2)).getClickPoint().getX(), (int)((Widget)var2.get(llllllllllllllllllIIIlIIlllIlIll2)).getClickPoint().getY(), (boolean)llIllIIlIl[0]);
                                Time.sleepTicks((int)llIllIIlIl[4]);

                            }
                            if (E.lIllIllIIlIlI(((Widget)var2.get(llIllIIlIl[1])).getText().contains(llIllIIIlI[llIllIIlIl[91]]) ? 1 : 0) && E.lIllIllIIlIlI(((Widget)var2.get(llllllllllllllllllIIIlIIlllIlIll2)).getText().contains(llIllIIIlI[llIllIIlIl[92]]) ? 1 : 0)) {
                                Mouse.click((int)((Widget)var2.get(llllllllllllllllllIIIlIIlllIlIll2)).getClickPoint().getX(), (int)((Widget)var2.get(llllllllllllllllllIIIlIIlllIlIll2)).getClickPoint().getY(), (boolean)llIllIIlIl[0]);
                                Time.sleepTicks((int)llIllIIlIl[4]);

                            }
                            if (E.lIllIllIIlIlI(((Widget)var2.get(llIllIIlIl[1])).getText().contains(llIllIIIlI[llIllIIlIl[93]]) ? 1 : 0) && E.lIllIllIIlIlI(((Widget)var2.get(llllllllllllllllllIIIlIIlllIlIll2)).getText().contains(llIllIIIlI[llIllIIlIl[94]]) ? 1 : 0)) {
                                Mouse.click((int)((Widget)var2.get(llllllllllllllllllIIIlIIlllIlIll2)).getClickPoint().getX(), (int)((Widget)var2.get(llllllllllllllllllIIIlIIlllIlIll2)).getClickPoint().getY(), (boolean)llIllIIlIl[0]);
                                Time.sleepTicks((int)llIllIIlIl[4]);

                            }
                            ++llllllllllllllllllIIIlIIlllIlIll2;

                            if (3 > -1) continue;
                            return;
                        }
                    }
                }
            }
            if (E.lIllIllIlIIll(e.j(llIllIIlIl[9]), llIllIIlIl[88])) {
                AccBuilderSotf.c = llIllIIIlI[llIllIIlIl[95]];
                String[] stringArray = new String[llIllIIlIl[0]];
                stringArray[E.llIllIIlIl[1]] = llIllIIIlI[llIllIIlIl[96]];
                TileObjects.getNearest((String[])stringArray).interact(llIllIIIlI[llIllIIlIl[97]]);
                Time.sleepTicks((int)llIllIIlIl[8]);

                g.a(cE);
            }
            if (E.lIllIllIlIIll(e.j(llIllIIlIl[9]), llIllIIlIl[93])) {
                if (E.lIllIllIIllII(ff.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (E.lIllIllIlIIIl(Players.getLocal().getWorldLocation().distanceTo(fs), llIllIIlIl[10])) {
                        AccBuilderSotf.c = llIllIIIlI[llIllIIlIl[98]];
                        Movement.walkTo((WorldPoint)fs);

                        Time.sleepTicks((int)llIllIIlIl[0]);

                    }
                    if (E.lIllIllIlIIlI(Players.getLocal().getWorldLocation().distanceTo(fs), llIllIIlIl[10])) {
                        AccBuilderSotf.c = llIllIIIlI[llIllIIlIl[99]];
                        String[] stringArray = new String[llIllIIlIl[0]];
                        stringArray[E.llIllIIlIl[1]] = llIllIIIlI[llIllIIlIl[100]];
                        TileObjects.getNearest((String[])stringArray).interact(llIllIIIlI[llIllIIlIl[101]]);
                        Time.sleepTicks((int)llIllIIlIl[8]);

                        g.a(cE);
                    }
                }
                if (E.lIllIllIIlIlI(ff.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderSotf.c = llIllIIIlI[llIllIIlIl[102]];
                    g.a(llIllIIIlI[llIllIIlIl[103]], cE);
                }
            }
            if (E.lIllIllIlIIll(e.j(llIllIIlIl[9]), llIllIIlIl[98])) {
                AccBuilderSotf.c = llIllIIIlI[llIllIIlIl[104]];
                if (E.lIllIllIIllII(Vars.getBit((int)llIllIIlIl[105]))) {
                    if (E.lIllIllIIllII(Dialog.canContinue() ? 1 : 0)) {
                        g.a(llIllIIIlI[llIllIIlIl[106]], cE);
                    }
                    g.a(cE);
                }
                if (E.lIllIllIlIIll(Vars.getBit((int)llIllIIlIl[105]), llIllIIlIl[4])) {
                    if (E.lIllIllIIllII(Dialog.canContinue() ? 1 : 0)) {
                        String[] stringArray = new String[llIllIIlIl[0]];
                        stringArray[E.llIllIIlIl[1]] = llIllIIIlI[llIllIIlIl[107]];
                        NPCs.getNearest((String[])stringArray).interact(llIllIIIlI[llIllIIlIl[108]]);
                    }
                    g.a(llIllIIIlI[llIllIIlIl[109]], cE);
                }
                if (E.lIllIllIlIIll(Vars.getBit((int)llIllIIlIl[105]), llIllIIlIl[12])) {
                    if (E.lIllIllIIllII(Dialog.canContinue() ? 1 : 0)) {
                        String[] stringArray = new String[llIllIIlIl[0]];
                        stringArray[E.llIllIIlIl[1]] = llIllIIIlI[llIllIIlIl[110]];
                        NPCs.getNearest((String[])stringArray).interact(llIllIIIlI[llIllIIlIl[111]]);
                    }
                    g.a(llIllIIIlI[llIllIIlIl[112]], cE);
                }
                if (E.lIllIllIlIIll(Vars.getBit((int)llIllIIlIl[105]), llIllIIlIl[21])) {
                    if (E.lIllIllIIllII(Dialog.canContinue() ? 1 : 0)) {
                        String[] stringArray = new String[llIllIIlIl[0]];
                        stringArray[E.llIllIIlIl[1]] = llIllIIIlI[llIllIIlIl[113]];
                        NPCs.getNearest((String[])stringArray).interact(llIllIIIlI[llIllIIlIl[114]]);
                    }
                    g.a(llIllIIIlI[llIllIIlIl[115]], cE);
                }
                if (E.lIllIllIlIIll(Vars.getBit((int)llIllIIlIl[105]), llIllIIlIl[37])) {
                    if (E.lIllIllIIllII(Dialog.canContinue() ? 1 : 0)) {
                        String[] stringArray = new String[llIllIIlIl[0]];
                        stringArray[E.llIllIIlIl[1]] = llIllIIIlI[llIllIIlIl[116]];
                        NPCs.getNearest((String[])stringArray).interact(llIllIIIlI[llIllIIlIl[117]]);
                    }
                    g.a(llIllIIIlI[llIllIIlIl[118]], cE);
                }
                if (E.lIllIllIlIIll(Vars.getBit((int)llIllIIlIl[105]), llIllIIlIl[59])) {
                    String[] stringArray = new String[llIllIIlIl[4]];
                    stringArray[E.llIllIIlIl[1]] = llIllIIIlI[llIllIIlIl[120]];
                    stringArray[E.llIllIIlIl[0]] = llIllIIIlI[llIllIIlIl[121]];
                    g.a(llIllIIIlI[llIllIIlIl[119]], stringArray);
                }
            }
            if (E.lIllIllIlIIll(e.j(llIllIIlIl[9]), llIllIIlIl[100])) {
                AccBuilderSotf.c = llIllIIIlI[llIllIIlIl[122]];
                g.a(llIllIIIlI[llIllIIlIl[123]], cE);
            }
            if (E.lIllIllIlIIll(e.j(llIllIIlIl[9]), llIllIIlIl[103])) {
                AccBuilderSotf.c = llIllIIIlI[llIllIIlIl[124]];
                g.a(cE);
            }
            if (E.lIllIllIlIIll(e.j(llIllIIlIl[9]), llIllIIlIl[114])) {
                AccBuilderSotf.c = llIllIIIlI[llIllIIlIl[125]];
                if (E.lIllIllIIlIll(Prayers.getPoints(), llIllIIlIl[43]) && E.lIllIllIIlIlI(Inventory.contains((int[])f.aX) ? 1 : 0)) {
                    Inventory.getFirst((int[])f.aX).interact(llIllIIIlI[llIllIIlIl[126]]);
                    Time.sleepTicks((int)llIllIIlIl[0]);

                }
                if (E.lIllIllIIllII(Prayers.isEnabled((Prayer)Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                    Prayers.toggle((Prayer)Prayer.PROTECT_FROM_MELEE);
                }
                int[] nArray = new int[llIllIIlIl[0]];
                nArray[E.llIllIIlIl[1]] = llIllIIlIl[38];
                if (E.lIllIllIIlIlI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    int[] nArray14 = new int[llIllIIlIl[0]];
                    nArray14[E.llIllIIlIl[1]] = llIllIIlIl[38];
                    if (E.lIllIllIIllII(Equipment.contains((int[])nArray14) ? 1 : 0)) {
                        int[] nArray15 = new int[llIllIIlIl[0]];
                        nArray15[E.llIllIIlIl[1]] = llIllIIlIl[38];
                        Inventory.getFirst((int[])nArray15).interact(llIllIIIlI[llIllIIlIl[127]]);
                    }
                }
                if (E.lIllIllIlIlIl(Players.getLocal().getInteracting())) {
                    int[] nArray16 = new int[llIllIIlIl[0]];
                    nArray16[E.llIllIIlIl[1]] = llIllIIlIl[128];
                    if (E.lIllIllIIlllI(NPCs.getNearest((int[])nArray16))) {
                        int[] nArray17 = new int[llIllIIlIl[0]];
                        nArray17[E.llIllIIlIl[1]] = llIllIIlIl[128];
                        NPCs.getNearest((int[])nArray17).interact(llIllIIIlI[llIllIIlIl[129]]);
                        Time.sleepTicks((int)llIllIIlIl[4]);

                    }
                }
            }
            if (E.lIllIllIlIIll(e.j(llIllIIlIl[9]), llIllIIlIl[119])) {
                AccBuilderSotf.c = llIllIIIlI[llIllIIlIl[130]];
                if (E.lIllIllIIlIlI(Prayers.isEnabled((Prayer)Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                    Prayers.toggle((Prayer)Prayer.PROTECT_FROM_MELEE);
                }
                g.a(llIllIIIlI[llIllIIlIl[131]], cE);
            }
            if (!E.lIllIllIlIlII(e.j(llIllIIlIl[9]), llIllIIlIl[124]) || !E.lIllIllIlIlII(e.j(llIllIIlIl[9]), llIllIIlIl[130]) || !E.lIllIllIlIlII(e.j(llIllIIlIl[9]), llIllIIlIl[132]) || E.lIllIllIlIIll(e.j(llIllIIlIl[9]), llIllIIlIl[133])) {
                if (E.lIllIllIIlIlI(ff.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderSotf.c = llIllIIIlI[llIllIIlIl[132]];
                    String[] stringArray = new String[llIllIIlIl[0]];
                    stringArray[E.llIllIIlIl[1]] = llIllIIIlI[llIllIIlIl[134]];
                    TileObjects.getNearest((String[])stringArray).interact(llIllIIIlI[llIllIIlIl[135]]);
                    Time.sleepTicks((int)llIllIIlIl[8]);

                    g.a(cE);
                }
                if (E.lIllIllIIllII(ff.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (E.lIllIllIlIIIl(Players.getLocal().getWorldLocation().distanceTo(ed), llIllIIlIl[8])) {
                        AccBuilderSotf.c = llIllIIIlI[llIllIIlIl[133]];
                        if (E.lIllIllIlIIIl(Players.getLocal().getWorldLocation().distanceTo(b.I), llIllIIlIl[43])) {
                            if (E.lIllIllIIlIlI(Dialog.isOpen() ? 1 : 0)) {
                                Dialog.close();
                            }
                            Movement.walkTo((WorldPoint)ed);

                            Time.sleepTicks((int)llIllIIlIl[0]);

                        }
                    }
                    if (E.lIllIllIlIIlI(Players.getLocal().getWorldLocation().distanceTo(ed), llIllIIlIl[8])) {
                        AccBuilderSotf.c = llIllIIIlI[llIllIIlIl[136]];
                        if (E.lIllIllIIlIll(di, llIllIIlIl[0])) {
                            aN.qU += llIllIIlIl[0];
                            aN.u(AccBuilderSotf.m);
                            di += llIllIIlIl[0];
                            aN.qU = llIllIIlIl[1];
                            dj = llIllIIlIl[1];
                        }
                        g.a(llIllIIIlI[llIllIIlIl[137]], cE);
                    }
                }
            }
            if (E.lIllIllIlIIll(e.j(llIllIIlIl[9]), llIllIIlIl[6])) {
                int[] nArray = new int[llIllIIlIl[0]];
                nArray[E.llIllIIlIl[1]] = llIllIIlIl[36];
                if (E.lIllIllIIlIlI(Inventory.contains((int[])nArray) ? 1 : 0) && E.lIllIllIlIIll(Players.getLocal().getAnimation(), llIllIIlIl[44])) {
                    int[] nArray18 = new int[llIllIIlIl[0]];
                    nArray18[E.llIllIIlIl[1]] = llIllIIlIl[36];
                    Inventory.getFirst((int[])nArray18).interact(llIllIIIlI[llIllIIlIl[138]]);
                    Time.sleepTicks((int)llIllIIlIl[4]);

                }
            }
        }
    }

    private static boolean lIllIllIlIIIl(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIllIllIlIlII(int n2, int n3) {
        return n2 != n3;
    }

    private static void Q() {
        d var6;
        Object var7;
        block52: {
            block51: {
                block50: {
                    block49: {
                        block48: {
                            block47: {
                                block46: {
                                    block45: {
                                        block44: {
                                            block43: {
                                                block42: {
                                                    block41: {
                                                        block40: {
                                                            block39: {
                                                                block38: {
                                                                    block37: {
                                                                        block36: {
                                                                            block35: {
                                                                                int[] nArray = new int[llIllIIlIl[0]];
                                                                                nArray[E.llIllIIlIl[1]] = llIllIIlIl[38];
                                                                                if (E.lIllIllIIllII(Bank.contains((int[])nArray) ? 1 : 0)) {
                                                                                    d d2 = new DHelper(llIllIIlIl[38], llIllIIlIl[0], llIllIIlIl[140]);
                                                                                    bv.add(d2);

                                                                                }
                                                                                int[] nArray2 = new int[llIllIIlIl[0]];
                                                                                nArray2[E.llIllIIlIl[1]] = llIllIIlIl[16];
                                                                                if (E.lIllIllIIllII(Bank.contains((int[])nArray2) ? 1 : 0)) {
                                                                                    var7 = new DHelper(llIllIIlIl[16], llIllIIlIl[0], llIllIIlIl[141]);
                                                                                    bv.add((DHelper) ar7);

                                                                                }
                                                                                int[] nArray3 = new int[llIllIIlIl[0]];
                                                                                nArray3[E.llIllIIlIl[1]] = llIllIIlIl[17];
                                                                                if (E.lIllIllIIllII(Bank.contains((int[])nArray3) ? 1 : 0)) {
                                                                                    var7 = new DHelper(llIllIIlIl[17], llIllIIlIl[0], llIllIIlIl[141]);
                                                                                    bv.add((DHelper) ar7);

                                                                                }
                                                                                int[] nArray4 = new int[llIllIIlIl[0]];
                                                                                nArray4[E.llIllIIlIl[1]] = llIllIIlIl[18];
                                                                                if (E.lIllIllIIllII(Bank.contains((int[])nArray4) ? 1 : 0)) {
                                                                                    var7 = new DHelper(llIllIIlIl[18], llIllIIlIl[0], llIllIIlIl[141]);
                                                                                    bv.add((DHelper) ar7);

                                                                                }
                                                                                int[] nArray5 = new int[llIllIIlIl[0]];
                                                                                nArray5[E.llIllIIlIl[1]] = llIllIIlIl[22];
                                                                                if (E.lIllIllIIllII(Bank.contains((int[])nArray5) ? 1 : 0)) {
                                                                                    var7 = new DHelper(llIllIIlIl[22], llIllIIlIl[0], llIllIIlIl[141]);
                                                                                    bv.add((DHelper) ar7);

                                                                                }
                                                                                int[] nArray6 = new int[llIllIIlIl[0]];
                                                                                nArray6[E.llIllIIlIl[1]] = llIllIIlIl[19];
                                                                                if (!E.lIllIllIIlIlI(Bank.contains((int[])nArray6) ? 1 : 0)) break block35;
                                                                                int[] nArray7 = new int[llIllIIlIl[0]];
                                                                                nArray7[E.llIllIIlIl[1]] = llIllIIlIl[19];
                                                                                if (!E.lIllIllIIlIlI(Bank.contains((int[])nArray7) ? 1 : 0)) break block36;
                                                                                int[] nArray8 = new int[llIllIIlIl[0]];
                                                                                nArray8[E.llIllIIlIl[1]] = llIllIIlIl[19];
                                                                                if (!E.lIllIllIIlIll(Bank.getFirst((int[])nArray8).getQuantity(), llIllIIlIl[4])) break block36;
                                                                            }
                                                                            var7 = new DHelper(llIllIIlIl[19], llIllIIlIl[4], llIllIIlIl[141]);
                                                                            bv.add((DHelper) ar7);

                                                                        }
                                                                        int[] nArray = new int[llIllIIlIl[0]];
                                                                        nArray[E.llIllIIlIl[1]] = llIllIIlIl[32];
                                                                        if (!E.lIllIllIIlIlI(Bank.contains((int[])nArray) ? 1 : 0)) break block37;
                                                                        int[] nArray9 = new int[llIllIIlIl[0]];
                                                                        nArray9[E.llIllIIlIl[1]] = llIllIIlIl[32];
                                                                        if (!E.lIllIllIIlIlI(Bank.contains((int[])nArray9) ? 1 : 0)) break block38;
                                                                        int[] nArray10 = new int[llIllIIlIl[0]];
                                                                        nArray10[E.llIllIIlIl[1]] = llIllIIlIl[32];
                                                                        if (!E.lIllIllIIlIll(Bank.getFirst((int[])nArray10).getQuantity(), llIllIIlIl[43])) break block38;
                                                                    }
                                                                    var7 = new DHelper(llIllIIlIl[32], llIllIIlIl[43], llIllIIlIl[142]);
                                                                    bv.add((DHelper) ar7);

                                                                }
                                                                int[] nArray = new int[llIllIIlIl[0]];
                                                                nArray[E.llIllIIlIl[1]] = llIllIIlIl[20];
                                                                if (!E.lIllIllIIlIlI(Bank.contains((int[])nArray) ? 1 : 0)) break block39;
                                                                int[] nArray11 = new int[llIllIIlIl[0]];
                                                                nArray11[E.llIllIIlIl[1]] = llIllIIlIl[20];
                                                                if (!E.lIllIllIIlIlI(Bank.contains((int[])nArray11) ? 1 : 0)) break block40;
                                                                int[] nArray12 = new int[llIllIIlIl[0]];
                                                                nArray12[E.llIllIIlIl[1]] = llIllIIlIl[20];
                                                                if (!E.lIllIllIIlIll(Bank.getFirst((int[])nArray12).getQuantity(), llIllIIlIl[39])) break block40;
                                                            }
                                                            var7 = new DHelper(llIllIIlIl[20], llIllIIlIl[39], llIllIIlIl[114]);
                                                            bv.add((DHelper) ar7);

                                                        }
                                                        int[] nArray = new int[llIllIIlIl[0]];
                                                        nArray[E.llIllIIlIl[1]] = llIllIIlIl[24];
                                                        if (!E.lIllIllIIlIlI(Bank.contains((int[])nArray) ? 1 : 0)) break block41;
                                                        int[] nArray13 = new int[llIllIIlIl[0]];
                                                        nArray13[E.llIllIIlIl[1]] = llIllIIlIl[24];
                                                        if (!E.lIllIllIIlIlI(Bank.contains((int[])nArray13) ? 1 : 0)) break block42;
                                                        int[] nArray14 = new int[llIllIIlIl[0]];
                                                        nArray14[E.llIllIIlIl[1]] = llIllIIlIl[24];
                                                        if (!E.lIllIllIIlIll(Bank.getFirst((int[])nArray14).getQuantity(), llIllIIlIl[12])) break block42;
                                                    }
                                                    var7 = new DHelper(llIllIIlIl[24], llIllIIlIl[12], llIllIIlIl[41]);
                                                    bv.add((DHelper) ar7);

                                                }
                                                int[] nArray = new int[llIllIIlIl[0]];
                                                nArray[E.llIllIIlIl[1]] = llIllIIlIl[26];
                                                if (!E.lIllIllIIlIlI(Bank.contains((int[])nArray) ? 1 : 0)) break block43;
                                                int[] nArray15 = new int[llIllIIlIl[0]];
                                                nArray15[E.llIllIIlIl[1]] = llIllIIlIl[26];
                                                if (!E.lIllIllIIlIlI(Bank.contains((int[])nArray15) ? 1 : 0)) break block44;
                                                int[] nArray16 = new int[llIllIIlIl[0]];
                                                nArray16[E.llIllIIlIl[1]] = llIllIIlIl[26];
                                                if (!E.lIllIllIIlIll(Bank.getFirst((int[])nArray16).getQuantity(), llIllIIlIl[12])) break block44;
                                            }
                                            var7 = new DHelper(llIllIIlIl[26], llIllIIlIl[25], llIllIIlIl[41]);
                                            bv.add((DHelper) ar7);

                                        }
                                        int[] nArray = new int[llIllIIlIl[0]];
                                        nArray[E.llIllIIlIl[1]] = llIllIIlIl[28];
                                        if (!E.lIllIllIIlIlI(Bank.contains((int[])nArray) ? 1 : 0)) break block45;
                                        int[] nArray17 = new int[llIllIIlIl[0]];
                                        nArray17[E.llIllIIlIl[1]] = llIllIIlIl[28];
                                        if (!E.lIllIllIIlIlI(Bank.contains((int[])nArray17) ? 1 : 0)) break block46;
                                        int[] nArray18 = new int[llIllIIlIl[0]];
                                        nArray18[E.llIllIIlIl[1]] = llIllIIlIl[28];
                                        if (!E.lIllIllIIlIll(Bank.getFirst((int[])nArray18).getQuantity(), llIllIIlIl[7])) break block46;
                                    }
                                    var7 = new DHelper(llIllIIlIl[28], llIllIIlIl[8], llIllIIlIl[143]);
                                    bv.add((DHelper) ar7);

                                }
                                int[] nArray = new int[llIllIIlIl[0]];
                                nArray[E.llIllIIlIl[1]] = llIllIIlIl[30];
                                if (!E.lIllIllIIlIlI(Bank.contains((int[])nArray) ? 1 : 0)) break block47;
                                int[] nArray19 = new int[llIllIIlIl[0]];
                                nArray19[E.llIllIIlIl[1]] = llIllIIlIl[30];
                                if (!E.lIllIllIIlIlI(Bank.contains((int[])nArray19) ? 1 : 0)) break block48;
                                int[] nArray20 = new int[llIllIIlIl[0]];
                                nArray20[E.llIllIIlIl[1]] = llIllIIlIl[30];
                                if (!E.lIllIllIIlIll(Bank.getFirst((int[])nArray20).getQuantity(), llIllIIlIl[21])) break block48;
                            }
                            var7 = new DHelper(llIllIIlIl[30], llIllIIlIl[21], j.cf);
                            bv.add((DHelper) ar7);

                        }
                        int[] nArray = new int[llIllIIlIl[0]];
                        nArray[E.llIllIIlIl[1]] = llIllIIlIl[36];
                        if (!E.lIllIllIIlIlI(Bank.contains((int[])nArray) ? 1 : 0)) break block49;
                        int[] nArray21 = new int[llIllIIlIl[0]];
                        nArray21[E.llIllIIlIl[1]] = llIllIIlIl[36];
                        if (!E.lIllIllIIlIlI(Bank.contains((int[])nArray21) ? 1 : 0)) break block50;
                        int[] nArray22 = new int[llIllIIlIl[0]];
                        nArray22[E.llIllIIlIl[1]] = llIllIIlIl[36];
                        if (!E.lIllIllIIlIll(Bank.getFirst((int[])nArray22).getQuantity(), llIllIIlIl[27])) break block50;
                    }
                    var7 = new DHelper(llIllIIlIl[36], llIllIIlIl[27], e.c(llIllIIlIl[144], llIllIIlIl[145]));
                    bv.add((DHelper) ar7);

                }
                int[] nArray = new int[llIllIIlIl[0]];
                nArray[E.llIllIIlIl[1]] = llIllIIlIl[34];
                if (!E.lIllIllIIlIlI(Bank.contains((int[])nArray) ? 1 : 0)) break block51;
                int[] nArray23 = new int[llIllIIlIl[0]];
                nArray23[E.llIllIIlIl[1]] = llIllIIlIl[34];
                if (!E.lIllIllIIlIlI(Bank.contains((int[])nArray23) ? 1 : 0)) break block52;
                int[] nArray24 = new int[llIllIIlIl[0]];
                nArray24[E.llIllIIlIl[1]] = llIllIIlIl[34];
                if (!E.lIllIllIIlIll(Bank.getFirst((int[])nArray24).getQuantity(), llIllIIlIl[10])) break block52;
            }
            var7 = new DHelper(llIllIIlIl[34], llIllIIlIl[10], e.c(llIllIIlIl[146], llIllIIlIl[147]));
            bv.add((DHelper) ar7);

        }
        int[] nArray = new int[llIllIIlIl[0]];
        nArray[E.llIllIIlIl[1]] = llIllIIlIl[15];
        if (E.lIllIllIIllII(Bank.contains((int[])nArray) ? 1 : 0)) {
            var7 = new DHelper(llIllIIlIl[15], llIllIIlIl[0], llIllIIlIl[141]);
            bv.add((DHelper) ar7);

        }
        if (E.lIllIllIIllII(Bank.contains((Predicate)(var7 = item -> item.getName().toLowerCase().contains(llIllIIIlI[llIllIIlIl[151]]))) ? 1 : 0)) {
            var6 = new DHelper(llIllIIlIl[148], llIllIIlIl[10], llIllIIlIl[149]);
            bv.add(var6);

        }
        int[] nArray25 = new int[llIllIIlIl[0]];
        nArray25[E.llIllIIlIl[1]] = llIllIIlIl[14];
        if (E.lIllIllIIllII(Bank.contains((int[])nArray25) ? 1 : 0)) {
            var6 = new DHelper(llIllIIlIl[14], llIllIIlIl[73], llIllIIlIl[150]);
            bv.add(var6);

        }
    }

    @Override
    public String ag() {
        return h;
    }

    private static boolean lIllIllIIllIl(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIllIllIlIIlI(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean lIllIllIlIlIl(Object object) {
        return object == null;
    }

    @Override
    public int af() {
        try {
            E.bV();

        }
        catch (Exception exception) {
            // empty catch block
        }
        if ((0x16 ^ 0x68 ^ (0xD6 ^ 0xAD)) == 0) {
            return (0x6A ^ 0x40 ^ (0x70 ^ 0x44)) & (39 + 0 - -19 + 86 ^ 7 + 57 - 55 + 133 ^ -1);
        }
        return llIllIIlIl[133];
    }

    private static int lIllIllIIlIIl(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    private static void lIllIllIIIlll() {
        llIllIIIlI = new String[llIllIIlIl[195]];
        E.llIllIIIlI[E.llIllIIlIl[1]] = "Finished buying items, switching back to quest";
        E.llIllIIIlI[E.llIllIIlIl[0]] = "- Agility";
        E.llIllIIIlI[E.llIllIIlIl[4]] = "- Prayer";
        E.llIllIIIlI[E.llIllIIlIl[7]] = "Drop";
        E.llIllIIIlI[E.llIllIIlIl[8]] = "- Nature Spirit";
        E.llIllIIIlI[E.llIllIIlIl[10]] = "Nav to bank";
        E.llIllIIIlI[E.llIllIIlIl[12]] = "Handling banking";
        E.llIllIIIlI[E.llIllIIlIl[21]] = "We are missing quest supplies, switching to BUYING";
        E.llIllIIIlI[E.llIllIIlIl[23]] = "Wield";
        E.llIllIIIlI[E.llIllIIlIl[25]] = "Druid pouch";
        E.llIllIIIlI[E.llIllIIlIl[27]] = "Drink";
        E.llIllIIIlI[E.llIllIIlIl[29]] = "Eat";
        E.llIllIIIlI[E.llIllIIlIl[31]] = E.lIllIlIllIlII("msbW3oucq9Y=", "WDTEa");
        E.llIllIIIlI[E.llIllIIlIl[33]] = "Nav to start";
        E.llIllIIIlI[E.llIllIIlIl[35]] = "Wield";
        E.llIllIIIlI[E.llIllIIlIl[37]] = "Break";
        E.llIllIIIlI[E.llIllIIlIl[13]] = "Starting quest";
        E.llIllIIIlI[E.llIllIIlIl[45]] = "Vanstrom Klause";
        E.llIllIIIlI[E.llIllIIlIl[46]] = "Filling pouch";
        E.llIllIIIlI[E.llIllIIlIl[47]] = "Druid pouch";
        E.llIllIIIlI[E.llIllIIlIl[43]] = "Fill";
        E.llIllIIIlI[E.llIllIIlIl[48]] = "Breaking tab";
        E.llIllIIIlI[E.llIllIIlIl[49]] = "Break";
        E.llIllIIIlI[E.llIllIIlIl[50]] = "Nav to boat";
        E.llIllIIIlI[E.llIllIIlIl[51]] = "Handle boat chat";
        E.llIllIIIlI[E.llIllIIlIl[54]] = "Nav to hop spot";
        E.llIllIIIlI[E.llIllIIlIl[2]] = "Cyreg Paddlehorn";
        E.llIllIIIlI[E.llIllIIlIl[55]] = "Swamp Boaty";
        E.llIllIIIlI[E.llIllIIlIl[56]] = "Board";
        E.llIllIIIlI[E.llIllIIlIl[57]] = "Nav to bridge";
        E.llIllIIIlI[E.llIllIIlIl[58]] = "Tree";
        E.llIllIIIlI[E.llIllIIlIl[59]] = "Climb";
        E.llIllIIIlI[E.llIllIIlIl[65]] = "Nav to bridge";
        E.llIllIIIlI[E.llIllIIlIl[66]] = "Tree";
        E.llIllIIIlI[E.llIllIIlIl[67]] = "Climb";
        E.llIllIIIlI[E.llIllIIlIl[68]] = "Broken rope bridge";
        E.llIllIIIlI[E.llIllIIlIl[69]] = "Repair";
        E.llIllIIIlI[E.llIllIIlIl[70]] = "Repairing bridge";
        E.llIllIIIlI[E.llIllIIlIl[71]] = "Repair";
        E.llIllIIIlI[E.llIllIIlIl[72]] = "Tree";
        E.llIllIIIlI[E.llIllIIlIl[73]] = "Climb";
        E.llIllIIIlI[E.llIllIIlIl[74]] = "Nav to door";
        E.llIllIIIlI[E.llIllIIlIl[75]] = "Handling chat";
        E.llIllIIIlI[E.llIllIIlIl[76]] = "Curpile Fyod";
        E.llIllIIIlI[E.llIllIIlIl[78]] = "Curpile Fyod";
        E.llIllIIIlI[E.llIllIIlIl[3]] = "Talk-to";
        E.llIllIIIlI[E.llIllIIlIl[81]] = "Who is the only female in the Myreque?";
        E.llIllIIIlI[E.llIllIIlIl[82]] = "female";
        E.llIllIIIlI[E.llIllIIlIl[83]] = "Sani Piliu";
        E.llIllIIIlI[E.llIllIIlIl[84]] = "leader";
        E.llIllIIIlI[E.llIllIIlIl[42]] = "Veliaf Hurtz";
        E.llIllIIIlI[E.llIllIIlIl[85]] = "boatman's";
        E.llIllIIIlI[E.llIllIIlIl[77]] = "boatman";
        E.llIllIIIlI[E.llIllIIlIl[86]] = "Cyreg Paddlehorn";
        E.llIllIIIlI[E.llIllIIlIl[87]] = "scholar?";
        E.llIllIIIlI[E.llIllIIlIl[88]] = "Polmafi Ferdygris";
        E.llIllIIIlI[E.llIllIIlIl[89]] = "vampyre family";
        E.llIllIIIlI[E.llIllIIlIl[90]] = "Drakan";
        E.llIllIIIlI[E.llIllIIlIl[91]] = "youngest";
        E.llIllIIIlI[E.llIllIIlIl[92]] = "Ivan Strom";
        E.llIllIIIlI[E.llIllIIlIl[93]] = "Myreque mean?";
        E.llIllIIIlI[E.llIllIIlIl[94]] = "Hidden in Myre";
        E.llIllIIIlI[E.llIllIIlIl[95]] = "Entering doors";
        E.llIllIIIlI[E.llIllIIlIl[96]] = "Wooden doors";
        E.llIllIIIlI[E.llIllIIlIl[97]] = "Open";
        E.llIllIIIlI[E.llIllIIlIl[98]] = "Nav to cave";
        E.llIllIIIlI[E.llIllIIlIl[99]] = "Entering cave";
        E.llIllIIIlI[E.llIllIIlIl[100]] = "Cave entrance";
        E.llIllIIIlI[E.llIllIIlIl[101]] = "Enter";
        E.llIllIIIlI[E.llIllIIlIl[102]] = "Talking";
        E.llIllIIIlI[E.llIllIIlIl[103]] = "Veliaf Hurtz";
        E.llIllIIIlI[E.llIllIIlIl[104]] = "Talking";
        E.llIllIIIlI[E.llIllIIlIl[106]] = "Harold Evans";
        E.llIllIIIlI[E.llIllIIlIl[107]] = "Radigad Ponfit";
        E.llIllIIIlI[E.llIllIIlIl[108]] = "Talk-to";
        E.llIllIIIlI[E.llIllIIlIl[109]] = "Radigad Ponfit";
        E.llIllIIIlI[E.llIllIIlIl[110]] = "Sani Piliu";
        E.llIllIIIlI[E.llIllIIlIl[111]] = "Talk-to";
        E.llIllIIIlI[E.llIllIIlIl[112]] = "Sani Piliu";
        E.llIllIIIlI[E.llIllIIlIl[113]] = "Polmafi Ferdygris";
        E.llIllIIIlI[E.llIllIIlIl[114]] = "Talk-to";
        E.llIllIIIlI[E.llIllIIlIl[115]] = "Polmafi Ferdygris";
        E.llIllIIIlI[E.llIllIIlIl[116]] = "Ivan Strom";
        E.llIllIIIlI[E.llIllIIlIl[117]] = "Talk-to";
        E.llIllIIIlI[E.llIllIIlIl[118]] = "Ivan Strom";
        E.llIllIIIlI[E.llIllIIlIl[119]] = "Veliaf Hurtz";
        E.llIllIIIlI[E.llIllIIlIl[120]] = "Let's talk about the weapons.";
        E.llIllIIIlI[E.llIllIIlIl[121]] = "I'll be back later.";
        E.llIllIIIlI[E.llIllIIlIl[122]] = "Talking";
        E.llIllIIIlI[E.llIllIIlIl[123]] = "Veliaf Hurtz";
        E.llIllIIIlI[E.llIllIIlIl[124]] = "Handling chat";
        E.llIllIIIlI[E.llIllIIlIl[125]] = "BOSS FIGHT";
        E.llIllIIIlI[E.llIllIIlIl[126]] = "Drink";
        E.llIllIIIlI[E.llIllIIlIl[127]] = "Wield";
        E.llIllIIIlI[E.llIllIIlIl[129]] = "Attack";
        E.llIllIIIlI[E.llIllIIlIl[130]] = "Talking";
        E.llIllIIIlI[E.llIllIIlIl[131]] = "Veliaf Hurtz";
        E.llIllIIIlI[E.llIllIIlIl[132]] = "Exiting cave";
        E.llIllIIIlI[E.llIllIIlIl[134]] = "Cave entrance";
        E.llIllIIIlI[E.llIllIIlIl[135]] = "Enter";
        E.llIllIIIlI[E.llIllIIlIl[133]] = "Nav to start";
        E.llIllIIIlI[E.llIllIIlIl[136]] = "Finishing quest";
        E.llIllIIIlI[E.llIllIIlIl[137]] = "Stranger";
        E.llIllIIIlI[E.llIllIIlIl[138]] = "Break";
        E.llIllIIIlI[E.llIllIIlIl[139]] = "Druid pouch";
        E.llIllIIIlI[E.llIllIIlIl[151]] = "ring of wealth (";
        E.llIllIIIlI[E.llIllIIlIl[152]] = "Loar Shadow";
        E.llIllIIIlI[E.llIllIIlIl[153]] = "Afflicted";
        E.llIllIIIlI[E.llIllIIlIl[170]] = "Why do they need help? Are they in trouble?";
        E.llIllIIIlI[E.llIllIIlIl[171]] = "Perhaps I could help you out here.";
        E.llIllIIIlI[E.llIllIIlIl[6]] = "Yes, I'll do it!";
        E.llIllIIIlI[E.llIllIIlIl[172]] = "Yes.";
        E.llIllIIIlI[E.llIllIIlIl[173]] = "Well, I guess they'll just die without weapons.";
        E.llIllIIIlI[E.llIllIIlIl[174]] = "Resourceful enough to get their own steel weapons?";
        E.llIllIIIlI[E.llIllIIlIl[175]] = "If you don't tell me, their deaths are on your head!";
        E.llIllIIIlI[E.llIllIIlIl[176]] = "Why do you say that this place is 'forsaken'?";
        E.llIllIIIlI[E.llIllIIlIl[177]] = "Give wooden planks to Cyreg";
        E.llIllIIIlI[E.llIllIIlIl[178]] = "Yes, I'll pay the ten gold.";
        E.llIllIIIlI[E.llIllIIlIl[179]] = "Yes, I'll pay ten gold.";
        E.llIllIIIlI[E.llIllIIlIl[180]] = "Yes. I'll pay the ten gold.";
        E.llIllIIIlI[E.llIllIIlIl[181]] = "I've come to help the Myreque. I've brought weapons.";
        E.llIllIIIlI[E.llIllIIlIl[182]] = "Sani Piliu";
        E.llIllIIIlI[E.llIllIIlIl[183]] = "Veliaf Hurtz";
        E.llIllIIIlI[E.llIllIIlIl[184]] = "Cyreg Paddlehorn";
        E.llIllIIIlI[E.llIllIIlIl[185]] = "Drakan";
        E.llIllIIIlI[E.llIllIIlIl[186]] = "Ivan Strom";
        E.llIllIIIlI[E.llIllIIlIl[187]] = "Hidden in Myre";
        E.llIllIIIlI[E.llIllIIlIl[188]] = "Polmafi Ferdygris";
        E.llIllIIIlI[E.llIllIIlIl[189]] = "How do I get out of here?";
        E.llIllIIIlI[E.llIllIIlIl[190]] = "Ok, thanks.";
        E.llIllIIIlI[E.llIllIIlIl[191]] = "What kind of a man are you to say that you don't care?";
        E.llIllIIIlI[E.llIllIIlIl[192]] = "Here are some planks for you.";
        E.llIllIIIlI[E.llIllIIlIl[193]] = "Let's talk about the weapons.";
        E.llIllIIIlI[E.llIllIIlIl[194]] = E.lIllIlIllIIll("", "Yejgo");
    }
}

