/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Skill
 *  net.runelite.api.TileItem
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 *  net.unethicalite.api.widgets.Dialog
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
import net.runelite.api.TileItem;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.AHelper;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.ac;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.BHelper;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.DHelper;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.EHelper;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.FHelper;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.JHelper;

public class AVHelper
implements ac {
    public static  int mV;
    public static  int mT;
    static  WorldArea mW;
    
    public static  int mU;
    
    public static  boolean bt;
    static  WorldArea mY;
    static  WorldArea mX;
    private static  WorldPoint mZ;
    public static  List<d> bv;

    private static boolean lIlIIlIIlllIl(int n2) {
        return n2 == 0;
    }

    @Override
    public boolean ae() {
        return llIIIIlllI[0];
    }

    /*
     * WARNING - void declaration
     */
    private static void eC() {
        WorldArea worldArea = new WorldArea(llIIIIlllI[75], llIIIIlllI[76], llIIIIlllI[77], llIIIIlllI[78], llIIIIlllI[1]);
        WorldArea worldArea2 = new WorldArea(llIIIIlllI[75], llIIIIlllI[76], llIIIIlllI[77], llIIIIlllI[78], llIIIIlllI[2]);
        WorldArea worldArea3 = new WorldArea(llIIIIlllI[75], llIIIIlllI[76], llIIIIlllI[77], llIIIIlllI[78], llIIIIlllI[9]);
        WorldArea worldArea4 = new WorldArea(llIIIIlllI[79], llIIIIlllI[80], llIIIIlllI[69], llIIIIlllI[64], llIIIIlllI[0]);
        WorldArea worldArea5 = new WorldArea(llIIIIlllI[81], llIIIIlllI[80], llIIIIlllI[11], llIIIIlllI[64], llIIIIlllI[9]);
        WorldArea worldArea6 = new WorldArea(llIIIIlllI[82], llIIIIlllI[83], llIIIIlllI[63], llIIIIlllI[49], llIIIIlllI[9]);
        WorldArea worldArea7 = new WorldArea(llIIIIlllI[84], llIIIIlllI[85], llIIIIlllI[26], llIIIIlllI[22], llIIIIlllI[1]);
        WorldArea worldArea8 = new WorldArea(llIIIIlllI[84], llIIIIlllI[86], llIIIIlllI[11], llIIIIlllI[24], llIIIIlllI[9]);
        WorldArea worldArea9 = new WorldArea(llIIIIlllI[87], llIIIIlllI[88], llIIIIlllI[89], llIIIIlllI[40], llIIIIlllI[9]);
        WorldArea worldArea10 = new WorldArea(llIIIIlllI[90], llIIIIlllI[91], llIIIIlllI[66], llIIIIlllI[64], llIIIIlllI[9]);
        WorldArea worldArea11 = new WorldArea(llIIIIlllI[92], llIIIIlllI[93], llIIIIlllI[22], llIIIIlllI[26], llIIIIlllI[9]);
        WorldArea worldArea12 = new WorldArea(llIIIIlllI[92], llIIIIlllI[94], llIIIIlllI[11], llIIIIlllI[22], llIIIIlllI[9]);
        if (av.lIlIIlIIlllIl(worldArea4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && av.lIlIIlIIlllIl(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && av.lIlIIlIIlllIl(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && av.lIlIIlIIlllIl(worldArea3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderSotf.c = llIIIIIllI[llIIIIlllI[89]];
            if (av.lIlIIlIIllIll(Bank.isOpen() ? 1 : 0)) {
                Bank.close();
            }
            if (av.lIlIIlIIllIll(Dialog.isOpen() ? 1 : 0)) {
                Dialog.close();
            }
            Movement.walkTo((WorldPoint)new WorldPoint(llIIIIlllI[95], llIIIIlllI[52], llIIIIlllI[0]));

            Time.sleepTicks((int)llIIIIlllI[1]);

        }
        if (av.lIlIIlIlIIIlI(Players.getLocal().getAnimation(), llIIIIlllI[62]) && av.lIlIIlIIlllIl(Players.getLocal().isMoving() ? 1 : 0)) {
            String[] stringArray = new String[llIIIIlllI[1]];
            stringArray[av.llIIIIlllI[0]] = llIIIIIllI[llIIIIlllI[96]];
            TileItem var1 = TileItems.getNearest((String[])stringArray);
            if (av.lIlIIlIIllllI(var1) && av.lIlIIlIIllIll(av.eF() ? 1 : 0)) {
                AccBuilderSotf.c = llIIIIIllI[llIIIIlllI[97]];
                System.out.println(llIIIIIllI[llIIIIlllI[98]]);
                var1.interact(llIIIIIllI[llIIIIlllI[99]]);
                Time.sleepTicks((int)llIIIIlllI[9]);

            }
            if (av.lIlIIlIIlllIl(av.eF() ? 1 : 0)) {
                void var2;
                void var3;
                void var4;
                void var5;
                void var6;
                void var7;
                void var8;
                void var9;
                int var10;
                void var11;
                if (av.lIlIIlIIllIll(var11.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && av.lIlIIlIIlllIl(av.eF() ? 1 : 0)) {
                    AccBuilderSotf.c = llIIIIIllI[llIIIIlllI[100]];
                    var10 = Skills.getExperience((Skill)Skill.AGILITY);
                    String[] stringArray2 = new String[llIIIIlllI[1]];
                    stringArray2[av.llIIIIlllI[0]] = llIIIIIllI[llIIIIlllI[101]];
                    TileObjects.getNearest((String[])stringArray2).interact(llIIIIIllI[llIIIIlllI[102]]);
                    Time.sleepUntil(() -> {
                        boolean bl;
                        if (av.lIlIIlIIlllll(Skills.getExperience((Skill)Skill.AGILITY), var10)) {
                            bl = llIIIIlllI[1];

                            if (-1 != -1) {
                                return ((0xE5 ^ 0x86 ^ (0x1A ^ 0x40)) & (80 + 43 - 12 + 76 ^ 33 + 32 - -42 + 23 ^ -1)) != 0;
                            }
                        } else {
                            bl = llIIIIlllI[0];
                        }
                        return bl;
                    }, (int)llIIIIlllI[103]);

                    Time.sleepTicks((int)llIIIIlllI[1]);

                }
                if (av.lIlIIlIIllIll(var9.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && av.lIlIIlIIlllIl(av.eF() ? 1 : 0)) {
                    AccBuilderSotf.c = llIIIIIllI[llIIIIlllI[104]];
                    var10 = Skills.getExperience((Skill)Skill.AGILITY);
                    String[] stringArray3 = new String[llIIIIlllI[1]];
                    stringArray3[av.llIIIIlllI[0]] = llIIIIIllI[llIIIIlllI[37]];
                    TileObjects.getNearest((String[])stringArray3).interact(llIIIIIllI[llIIIIlllI[105]]);
                    Time.sleepUntil(() -> {
                        boolean bl;
                        if (av.lIlIIlIIlllll(Skills.getExperience((Skill)Skill.AGILITY), var10)) {
                            bl = llIIIIlllI[1];

                            if (-(0xBF ^ 0xBB) > 0) {
                                return false;
                            }
                        } else {
                            bl = llIIIIlllI[0];
                        }
                        return bl;
                    }, (int)llIIIIlllI[103]);

                    Time.sleepTicks((int)llIIIIlllI[1]);

                }
                if (av.lIlIIlIIllIll(var8.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && av.lIlIIlIIlllIl(av.eF() ? 1 : 0)) {
                    AccBuilderSotf.c = llIIIIIllI[llIIIIlllI[106]];
                    var10 = Skills.getExperience((Skill)Skill.AGILITY);
                    String[] stringArray4 = new String[llIIIIlllI[1]];
                    stringArray4[av.llIIIIlllI[0]] = llIIIIIllI[llIIIIlllI[107]];
                    TileObjects.getNearest((String[])stringArray4).interact(llIIIIIllI[llIIIIlllI[108]]);
                    Time.sleepUntil(() -> {
                        boolean bl;
                        if (av.lIlIIlIIlllll(Skills.getExperience((Skill)Skill.AGILITY), var10)) {
                            bl = llIIIIlllI[1];

                            }
                        } else {
                            bl = llIIIIlllI[0];
                        }
                        return bl;
                    }, (int)llIIIIlllI[103]);

                    Time.sleepTicks((int)llIIIIlllI[1]);

                }
                if (av.lIlIIlIIllIll(var7.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && av.lIlIIlIIlllIl(av.eF() ? 1 : 0)) {
                    AccBuilderSotf.c = llIIIIIllI[llIIIIlllI[109]];
                    var10 = Skills.getExperience((Skill)Skill.AGILITY);
                    String[] stringArray5 = new String[llIIIIlllI[1]];
                    stringArray5[av.llIIIIlllI[0]] = llIIIIIllI[llIIIIlllI[110]];
                    TileObjects.getNearest((String[])stringArray5).interact(llIIIIIllI[llIIIIlllI[111]]);
                    Time.sleepUntil(() -> {
                        boolean bl;
                        if (av.lIlIIlIIlllll(Skills.getExperience((Skill)Skill.AGILITY), var10)) {
                            bl = llIIIIlllI[1];

                            if (((0x3A ^ 0x2B) & ~(0xB8 ^ 0xA9)) != 0) {
                                return false;
                            }
                        } else {
                            bl = llIIIIlllI[0];
                        }
                        return bl;
                    }, (int)llIIIIlllI[103]);

                    Time.sleepTicks((int)llIIIIlllI[1]);

                }
                if (av.lIlIIlIIllIll(var6.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && av.lIlIIlIIlllIl(av.eF() ? 1 : 0)) {
                    AccBuilderSotf.c = llIIIIIllI[llIIIIlllI[112]];
                    var10 = Skills.getExperience((Skill)Skill.AGILITY);
                    String[] stringArray6 = new String[llIIIIlllI[1]];
                    stringArray6[av.llIIIIlllI[0]] = llIIIIIllI[llIIIIlllI[113]];
                    TileObjects.getNearest((String[])stringArray6).interact(llIIIIIllI[llIIIIlllI[39]]);
                    Time.sleepUntil(() -> {
                        boolean bl;
                        if (av.lIlIIlIIlllll(Skills.getExperience((Skill)Skill.AGILITY), var10)) {
                            bl = llIIIIlllI[1];

                            }
                        } else {
                            bl = llIIIIlllI[0];
                        }
                        return bl;
                    }, (int)llIIIIlllI[103]);

                    Time.sleepTicks((int)llIIIIlllI[1]);

                }
                if (av.lIlIIlIIllIll(var5.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && av.lIlIIlIIlllIl(av.eF() ? 1 : 0)) {
                    AccBuilderSotf.c = llIIIIIllI[llIIIIlllI[6]];
                    var10 = Skills.getExperience((Skill)Skill.AGILITY);
                    int[] nArray = new int[llIIIIlllI[1]];
                    nArray[av.llIIIIlllI[0]] = llIIIIlllI[114];
                    TileObjects.getNearest((int[])nArray).interact(llIIIIIllI[llIIIIlllI[115]]);
                    Time.sleepUntil(() -> {
                        boolean bl;
                        if (av.lIlIIlIIlllll(Skills.getExperience((Skill)Skill.AGILITY), var10)) {
                            bl = llIIIIlllI[1];

                            }
                        } else {
                            bl = llIIIIlllI[0];
                        }
                        return bl;
                    }, (int)llIIIIlllI[103]);

                    Time.sleepTicks((int)llIIIIlllI[1]);

                }
                if (av.lIlIIlIIllIll(var4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && av.lIlIIlIIlllIl(av.eF() ? 1 : 0)) {
                    AccBuilderSotf.c = llIIIIIllI[llIIIIlllI[116]];
                    var10 = Skills.getExperience((Skill)Skill.AGILITY);
                    int[] nArray = new int[llIIIIlllI[1]];
                    nArray[av.llIIIIlllI[0]] = llIIIIlllI[117];
                    TileObjects.getNearest((int[])nArray).interact(llIIIIIllI[llIIIIlllI[118]]);
                    Time.sleepUntil(() -> {
                        boolean bl;
                        if (av.lIlIIlIIlllll(Skills.getExperience((Skill)Skill.AGILITY), var10)) {
                            bl = llIIIIlllI[1];

                            if (1 != 1) {
                                return false;
                            }
                        } else {
                            bl = llIIIIlllI[0];
                        }
                        return bl;
                    }, (int)llIIIIlllI[103]);

                    Time.sleepTicks((int)llIIIIlllI[1]);

                }
                if (av.lIlIIlIIllIll(var3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && av.lIlIIlIIlllIl(av.eF() ? 1 : 0)) {
                    AccBuilderSotf.c = llIIIIIllI[llIIIIlllI[119]];
                    var10 = Skills.getExperience((Skill)Skill.AGILITY);
                    int[] nArray = new int[llIIIIlllI[1]];
                    nArray[av.llIIIIlllI[0]] = llIIIIlllI[120];
                    TileObjects.getNearest((int[])nArray).interact(llIIIIIllI[llIIIIlllI[121]]);
                    Time.sleepUntil(() -> {
                        boolean bl;
                        if (av.lIlIIlIIlllll(Skills.getExperience((Skill)Skill.AGILITY), var10)) {
                            bl = llIIIIlllI[1];

                            if ((0x49 ^ 0x4D) != (0x7B ^ 0x7F)) {
                                return false;
                            }
                        } else {
                            bl = llIIIIlllI[0];
                        }
                        return bl;
                    }, (int)llIIIIlllI[103]);

                    Time.sleepTicks((int)llIIIIlllI[1]);

                }
                if (av.lIlIIlIIllIll(var2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && av.lIlIIlIIlllIl(av.eF() ? 1 : 0)) {
                    AccBuilderSotf.c = llIIIIIllI[llIIIIlllI[122]];
                    var10 = Skills.getExperience((Skill)Skill.AGILITY);
                    String[] stringArray7 = new String[llIIIIlllI[1]];
                    stringArray7[av.llIIIIlllI[0]] = llIIIIIllI[llIIIIlllI[123]];
                    TileObjects.getNearest((String[])stringArray7).interact(llIIIIIllI[llIIIIlllI[124]]);
                    Time.sleepUntil(() -> {
                        boolean bl;
                        if (av.lIlIIlIIlllll(Skills.getExperience((Skill)Skill.AGILITY), var10)) {
                            bl = llIIIIlllI[1];

                            if (3 != 3) {
                                return false;
                            }
                        } else {
                            bl = llIIIIlllI[0];
                        }
                        return bl;
                    }, (int)llIIIIlllI[103]);

                    Time.sleepTicks((int)llIIIIlllI[1]);

                }
            }
        }
    }

    @Override
    public int af() {
        try {
            av.eA();

        }
        catch (Exception exception) {
            // empty catch block
        }
        if (-1 > ((0x6B ^ 0x5F) & ~(0xE ^ 0x3A))) {
            return (0xAE ^ 0x93) & ~(0x26 ^ 0x1B);
        }
        return llIIIIlllI[186];
    }

    private static boolean lIlIIlIlIIlII(int n2, int n3) {
        return n2 <= n3;
    }

    static {
        av.lIlIIlIIllIlI();
        av.lIlIIlIIIllIl();
        bv = new ArrayList<d>();
        mT = llIIIIlllI[27];
        mU = llIIIIlllI[23];
        mW = new WorldArea(llIIIIlllI[238], llIIIIlllI[52], llIIIIlllI[69], llIIIIlllI[72], llIIIIlllI[0]);
        mX = new WorldArea(llIIIIlllI[238], llIIIIlllI[52], llIIIIlllI[69], llIIIIlllI[72], llIIIIlllI[1]);
        mY = new WorldArea(llIIIIlllI[238], llIIIIlllI[52], llIIIIlllI[69], llIIIIlllI[72], llIIIIlllI[2]);
        mZ = new WorldPoint(llIIIIlllI[239], llIIIIlllI[240], llIIIIlllI[0]);
    }

    /*
     * WARNING - void declaration
     */
    private static void eD() {
        void var12;
        void var13;
        void var14;
        void var15;
        void var16;
        WorldArea worldArea = new WorldArea(llIIIIlllI[125], llIIIIlllI[126], llIIIIlllI[112], llIIIIlllI[107], llIIIIlllI[0]);
        WorldArea worldArea2 = new WorldArea(llIIIIlllI[125], llIIIIlllI[126], llIIIIlllI[112], llIIIIlllI[107], llIIIIlllI[1]);
        WorldArea worldArea3 = new WorldArea(llIIIIlllI[125], llIIIIlllI[126], llIIIIlllI[112], llIIIIlllI[107], llIIIIlllI[2]);
        WorldArea worldArea4 = new WorldArea(llIIIIlllI[125], llIIIIlllI[126], llIIIIlllI[112], llIIIIlllI[107], llIIIIlllI[9]);
        WorldArea worldArea5 = new WorldArea(llIIIIlllI[127], llIIIIlllI[128], llIIIIlllI[49], llIIIIlllI[11], llIIIIlllI[2]);
        WorldArea worldArea6 = new WorldArea(llIIIIlllI[129], llIIIIlllI[127], llIIIIlllI[49], llIIIIlllI[24], llIIIIlllI[2]);
        WorldArea worldArea7 = new WorldArea(llIIIIlllI[130], llIIIIlllI[131], llIIIIlllI[63], llIIIIlllI[49], llIIIIlllI[2]);
        WorldArea worldArea8 = new WorldArea(llIIIIlllI[132], llIIIIlllI[133], llIIIIlllI[11], llIIIIlllI[64], llIIIIlllI[9]);
        WorldArea worldArea9 = new WorldArea(llIIIIlllI[134], llIIIIlllI[8], llIIIIlllI[49], llIIIIlllI[26], llIIIIlllI[2]);
        WorldArea worldArea10 = new WorldArea(llIIIIlllI[135], llIIIIlllI[136], llIIIIlllI[68], llIIIIlllI[53], llIIIIlllI[9]);
        WorldArea worldArea11 = new WorldArea(llIIIIlllI[137], llIIIIlllI[138], llIIIIlllI[63], llIIIIlllI[64], llIIIIlllI[2]);
        WorldPoint worldPoint = new WorldPoint(llIIIIlllI[137], llIIIIlllI[139], llIIIIlllI[0]);
        if (av.lIlIIlIIllIll(Dialog.isOpen() ? 1 : 0)) {
            Dialog.close();
        }
        if (av.lIlIIlIIlllIl(var16.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && av.lIlIIlIIlllIl(var15.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && av.lIlIIlIIlllIl(var14.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && av.lIlIIlIIlllIl(var13.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderSotf.c = llIIIIIllI[llIIIIlllI[44]];
            Movement.walkTo((WorldPoint)var12);

            Time.sleepTicks((int)llIIIIlllI[1]);

        }
        if (av.lIlIIlIIllIll(var16.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (av.lIlIIlIIlllll(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)var12), llIIIIlllI[20])) {
                AccBuilderSotf.c = llIIIIIllI[llIIIIlllI[140]];
                Movement.walkTo((WorldPoint)var12);

                Time.sleepTicks((int)llIIIIlllI[1]);

            }
            if (av.lIlIIlIlIIlII(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)var12), llIIIIlllI[20])) {
                AccBuilderSotf.c = llIIIIIllI[llIIIIlllI[5]];
                int var17 = Skills.getExperience((Skill)Skill.AGILITY);
                String[] stringArray = new String[llIIIIlllI[1]];
                stringArray[av.llIIIIlllI[0]] = llIIIIIllI[llIIIIlllI[141]];
                TileObjects.getNearest((String[])stringArray).interact(llIIIIIllI[llIIIIlllI[142]]);
                Time.sleepTicks((int)e.c(llIIIIlllI[1], llIIIIlllI[2]));

                Time.sleepUntil(() -> {
                    boolean bl;
                    if (av.lIlIIlIIlllll(Skills.getExperience((Skill)Skill.AGILITY), var17)) {
                        bl = llIIIIlllI[1];

                        if ((9 ^ 0x5C ^ (0x3C ^ 0x6D)) == 3) {
                            return ((0x4B ^ 0x29 ^ (0xF4 ^ 0x9C)) & (0x45 ^ 0x43 ^ (0x32 ^ 0x3E) ^ -1)) != 0;
                        }
                    } else {
                        bl = llIIIIlllI[0];
                    }
                    return bl;
                }, (int)llIIIIlllI[103]);

                Time.sleepTicks((int)llIIIIlllI[1]);

            }
        }
        String[] stringArray = new String[llIIIIlllI[1]];
        stringArray[av.llIIIIlllI[0]] = llIIIIIllI[llIIIIlllI[143]];
        TileItem var17 = TileItems.getNearest((String[])stringArray);
        if (av.lIlIIlIIllllI(var17) && av.lIlIIlIIllIll(av.eF() ? 1 : 0)) {
            AccBuilderSotf.c = llIIIIIllI[llIIIIlllI[144]];
            System.out.println(llIIIIIllI[llIIIIlllI[145]]);
            var17.interact(llIIIIIllI[llIIIIlllI[146]]);
            Time.sleepTicks((int)llIIIIlllI[9]);

        }
        if (av.lIlIIlIIlllIl(av.eF() ? 1 : 0)) {
            void var18;
            void var19;
            void var20;
            void var21;
            void var22;
            void var23;
            int var24;
            TileObject var25;
            void var26;
            if (av.lIlIIlIIllIll(var26.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && av.lIlIIlIIllllI(var25 = TileObjects.getNearest(tileObject -> {
                int n2;
                if (av.lIlIIlIIllIll(tileObject.getName().contains(llIIIIIllI[llIIIIlllI[232]]) ? 1 : 0) && av.lIlIIlIlIIlII(tileObject.getWorldLocation().distanceTo(new WorldPoint(llIIIIlllI[233], llIIIIlllI[131], llIIIIlllI[2])), llIIIIlllI[2])) {
                    n2 = llIIIIlllI[1];

                    if (((0x46 ^ 0x4F) & ~(0x14 ^ 0x1D)) != 0) {
                        return false;
                    }
                } else {
                    n2 = llIIIIlllI[0];
                }
                return n2 != 0;
            }))) {
                var24 = Skills.getExperience((Skill)Skill.AGILITY);
                AccBuilderSotf.c = llIIIIIllI[llIIIIlllI[147]];
                var25.interact(llIIIIIllI[llIIIIlllI[148]]);
                Time.sleepTicks((int)e.c(llIIIIlllI[1], llIIIIlllI[2]));

                Time.sleepUntil(() -> {
                    boolean bl;
                    if (av.lIlIIlIIlllll(Skills.getExperience((Skill)Skill.AGILITY), var24)) {
                        bl = llIIIIlllI[1];

                        if (-1 >= 1) {
                            return ((0x91 ^ 0x82 ^ (0x78 ^ 0x66)) & (2 ^ (0x61 ^ 0x6E) ^ -1)) != 0;
                        }
                    } else {
                        bl = llIIIIlllI[0];
                    }
                    return bl;
                }, (int)llIIIIlllI[103]);

                Time.sleepTicks((int)llIIIIlllI[1]);

            }
            if (av.lIlIIlIIllIll(av.eF() ? 1 : 0)) {
                return;
            }
            if (av.lIlIIlIIllIll(var23.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && av.lIlIIlIIllllI(var25 = TileObjects.getNearest(tileObject -> {
                int n2;
                if (av.lIlIIlIIllIll(tileObject.getName().contains(llIIIIIllI[llIIIIlllI[231]]) ? 1 : 0) && av.lIlIIlIlIIlII(tileObject.getWorldLocation().distanceTo(new WorldPoint(llIIIIlllI[131], llIIIIlllI[224], llIIIIlllI[2])), llIIIIlllI[2])) {
                    n2 = llIIIIlllI[1];

                    if ((0x76 ^ 0x2F ^ (0x73 ^ 0x2E)) == 0) {
                        return ((0xE5 ^ 0x88 ^ (0x66 ^ 0x42)) & (0xDF ^ 0x91 ^ (0x8B ^ 0x8C) ^ -1)) != 0;
                    }
                } else {
                    n2 = llIIIIlllI[0];
                }
                return n2 != 0;
            }))) {
                AccBuilderSotf.c = llIIIIIllI[llIIIIlllI[149]];
                var24 = Skills.getExperience((Skill)Skill.AGILITY);
                var25.interact(llIIIIIllI[llIIIIlllI[150]]);
                Time.sleepTicks((int)e.c(llIIIIlllI[1], llIIIIlllI[2]));

                Time.sleepUntil(() -> {
                    boolean bl;
                    if (av.lIlIIlIIlllll(Skills.getExperience((Skill)Skill.AGILITY), var24)) {
                        bl = llIIIIlllI[1];

                        if (1 == 0) {
                            return ((139 + 135 - 218 + 166 ^ 64 + 53 - 48 + 64) & (0x8D ^ 0xB4 ^ (0x4D ^ 0x2F) ^ -1)) != 0;
                        }
                    } else {
                        bl = llIIIIlllI[0];
                    }
                    return bl;
                }, (int)llIIIIlllI[103]);

                Time.sleepTicks((int)llIIIIlllI[1]);

            }
            if (av.lIlIIlIIllIll(av.eF() ? 1 : 0)) {
                return;
            }
            if (av.lIlIIlIIllIll(var22.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && av.lIlIIlIIllllI(var25 = TileObjects.getNearest(tileObject -> {
                int n2;
                if (av.lIlIIlIIllIll(tileObject.getName().contains(llIIIIIllI[llIIIIlllI[229]]) ? 1 : 0) && av.lIlIIlIlIIlII(tileObject.getWorldLocation().distanceTo(new WorldPoint(llIIIIlllI[139], llIIIIlllI[230], llIIIIlllI[2])), llIIIIlllI[2])) {
                    n2 = llIIIIlllI[1];

                    if (2 == 1) {
                        return false;
                    }
                } else {
                    n2 = llIIIIlllI[0];
                }
                return n2 != 0;
            }))) {
                AccBuilderSotf.c = llIIIIIllI[llIIIIlllI[151]];
                var24 = Skills.getExperience((Skill)Skill.AGILITY);
                var25.interact(llIIIIIllI[llIIIIlllI[152]]);
                Time.sleepTicks((int)e.c(llIIIIlllI[1], llIIIIlllI[2]));

                Time.sleepUntil(() -> {
                    boolean bl;
                    if (av.lIlIIlIIlllll(Skills.getExperience((Skill)Skill.AGILITY), var24)) {
                        bl = llIIIIlllI[1];

                    } else {
                        bl = llIIIIlllI[0];
                    }
                    return bl;
                }, (int)llIIIIlllI[103]);

                Time.sleepTicks((int)llIIIIlllI[1]);

            }
            if (av.lIlIIlIIllIll(av.eF() ? 1 : 0)) {
                return;
            }
            if (av.lIlIIlIIllIll(var21.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && av.lIlIIlIIllllI(var25 = TileObjects.getNearest(tileObject -> {
                int n2;
                if (av.lIlIIlIIllIll(tileObject.getName().contains(llIIIIIllI[llIIIIlllI[226]]) ? 1 : 0) && av.lIlIIlIlIIlII(tileObject.getWorldLocation().distanceTo(new WorldPoint(llIIIIlllI[227], llIIIIlllI[228], llIIIIlllI[9])), llIIIIlllI[2])) {
                    n2 = llIIIIlllI[1];

                    if ((72 + 82 - 148 + 162 ^ 31 + 78 - 71 + 135) <= 0) {
                        return ((0x73 ^ 0x21 ^ (0x18 ^ 0x44)) & (63 + 72 - 58 + 62 ^ 19 + 7 - 4 + 111 ^ -1)) != 0;
                    }
                } else {
                    n2 = llIIIIlllI[0];
                }
                return n2 != 0;
            }))) {
                AccBuilderSotf.c = llIIIIIllI[llIIIIlllI[153]];
                var24 = Skills.getExperience((Skill)Skill.AGILITY);
                var25.interact(llIIIIIllI[llIIIIlllI[154]]);
                Time.sleepTicks((int)e.c(llIIIIlllI[1], llIIIIlllI[2]));

                Time.sleepUntil(() -> {
                    boolean bl;
                    if (av.lIlIIlIIlllll(Skills.getExperience((Skill)Skill.AGILITY), var24)) {
                        bl = llIIIIlllI[1];

                        if (2 == 0) {
                            return false;
                        }
                    } else {
                        bl = llIIIIlllI[0];
                    }
                    return bl;
                }, (int)llIIIIlllI[103]);

                Time.sleepTicks((int)llIIIIlllI[1]);

            }
            if (av.lIlIIlIIllIll(av.eF() ? 1 : 0)) {
                return;
            }
            if (av.lIlIIlIIllIll(var20.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && av.lIlIIlIIllllI(var25 = TileObjects.getNearest(tileObject -> {
                int n2;
                if (av.lIlIIlIIllIll(tileObject.getName().contains(llIIIIIllI[llIIIIlllI[225]]) ? 1 : 0) && av.lIlIIlIlIIlII(tileObject.getWorldLocation().distanceTo(new WorldPoint(llIIIIlllI[8], llIIIIlllI[130], llIIIIlllI[2])), llIIIIlllI[2])) {
                    n2 = llIIIIlllI[1];

                    if (2 <= 1) {
                        return ((0x5D ^ 0x61 ^ (0xE8 ^ 0xB7)) & (82 + 206 - 273 + 210 ^ 6 + 29 - 22 + 117 ^ -1)) != 0;
                    }
                } else {
                    n2 = llIIIIlllI[0];
                }
                return n2 != 0;
            }))) {
                AccBuilderSotf.c = llIIIIIllI[llIIIIlllI[155]];
                var24 = Skills.getExperience((Skill)Skill.AGILITY);
                var25.interact(llIIIIIllI[llIIIIlllI[156]]);
                Time.sleepTicks((int)e.c(llIIIIlllI[1], llIIIIlllI[2]));

                Time.sleepUntil(() -> {
                    boolean bl;
                    if (av.lIlIIlIIlllll(Skills.getExperience((Skill)Skill.AGILITY), var24)) {
                        bl = llIIIIlllI[1];

                        if (1 <= ((0x79 ^ 0x27) & ~(0x23 ^ 0x7D))) {
                            return false;
                        }
                    } else {
                        bl = llIIIIlllI[0];
                    }
                    return bl;
                }, (int)llIIIIlllI[103]);

                Time.sleepTicks((int)llIIIIlllI[1]);

            }
            if (av.lIlIIlIIllIll(av.eF() ? 1 : 0)) {
                return;
            }
            if (av.lIlIIlIIllIll(var19.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && av.lIlIIlIIllllI(var25 = TileObjects.getNearest(tileObject -> {
                int n2;
                if (av.lIlIIlIIllIll(tileObject.getName().contains(llIIIIIllI[llIIIIlllI[223]]) ? 1 : 0) && av.lIlIIlIlIIlII(tileObject.getWorldLocation().distanceTo(new WorldPoint(llIIIIlllI[224], llIIIIlllI[214], llIIIIlllI[9])), llIIIIlllI[2])) {
                    n2 = llIIIIlllI[1];

                    if (-1 >= 3) {
                        return ((127 + 174 - 222 + 144 ^ 28 + 55 - 51 + 103) & (0x78 ^ 0x5E ^ (0x72 ^ 0xC) ^ -1)) != 0;
                    }
                } else {
                    n2 = llIIIIlllI[0];
                }
                return n2 != 0;
            }))) {
                AccBuilderSotf.c = llIIIIIllI[llIIIIlllI[157]];
                var24 = Skills.getExperience((Skill)Skill.AGILITY);
                var25.interact(llIIIIIllI[llIIIIlllI[158]]);
                Time.sleepTicks((int)e.c(llIIIIlllI[1], llIIIIlllI[2]));

                Time.sleepUntil(() -> {
                    boolean bl;
                    if (av.lIlIIlIIlllll(Skills.getExperience((Skill)Skill.AGILITY), var24)) {
                        bl = llIIIIlllI[1];

                        if ((0xB2 ^ 0xB6) == 3) {
                            return false;
                        }
                    } else {
                        bl = llIIIIlllI[0];
                    }
                    return bl;
                }, (int)llIIIIlllI[103]);

                Time.sleepTicks((int)llIIIIlllI[1]);

            }
            if (av.lIlIIlIIllIll(av.eF() ? 1 : 0)) {
                return;
            }
            if (av.lIlIIlIIllIll(var18.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && av.lIlIIlIIllllI(var25 = TileObjects.getNearest(tileObject -> {
                int n2;
                if (av.lIlIIlIIllIll(tileObject.getName().contains(llIIIIIllI[llIIIIlllI[220]]) ? 1 : 0) && av.lIlIIlIlIIlII(tileObject.getWorldLocation().distanceTo(new WorldPoint(llIIIIlllI[221], llIIIIlllI[222], llIIIIlllI[2])), llIIIIlllI[2])) {
                    n2 = llIIIIlllI[1];

                    if (-(0xEC ^ 0x9B ^ (0x1A ^ 0x69)) > 0) {
                        return ((32 + 136 - 120 + 99 ^ 105 + 132 - 232 + 160) & (0x52 ^ 0xA ^ (0xA ^ 0x64) ^ -1)) != 0;
                    }
                } else {
                    n2 = llIIIIlllI[0];
                }
                return n2 != 0;
            }))) {
                AccBuilderSotf.c = llIIIIIllI[llIIIIlllI[159]];
                var24 = Skills.getExperience((Skill)Skill.AGILITY);
                var25.interact(llIIIIIllI[llIIIIlllI[160]]);
                Time.sleepTicks((int)e.c(llIIIIlllI[1], llIIIIlllI[2]));

                Time.sleepUntil(() -> {
                    boolean bl;
                    if (av.lIlIIlIIlllll(Skills.getExperience((Skill)Skill.AGILITY), var24)) {
                        bl = llIIIIlllI[1];

                        if (-1 > 1) {
                            return ((0xB3 ^ 0xAE ^ (0x28 ^ 0x20)) & (22 + 12 - -73 + 46 ^ 69 + 92 - 79 + 58 ^ -1)) != 0;
                        }
                    } else {
                        bl = llIIIIlllI[0];
                    }
                    return bl;
                }, (int)llIIIIlllI[103]);

                Time.sleepTicks((int)llIIIIlllI[1]);

            }
        }
    }

    private static boolean lIlIIlIlIIIlI(int n2, int n3) {
        return n2 == n3;
    }

    @Override
    public String ag() {
        return llIIIIIllI[llIIIIlllI[202]];
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean an() {
        int n2;
        if (av.lIlIIlIlIIIIl(Skills.getBoostedLevel((Skill)Skill.AGILITY), llIIIIlllI[37])) {
            int n3;
            int[] nArray = new int[llIIIIlllI[1]];
            nArray[av.llIIIIlllI[0]] = llIIIIlllI[12];
            if (av.lIlIIlIIllIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray2 = new int[llIIIIlllI[1]];
                nArray2[av.llIIIIlllI[0]] = llIIIIlllI[25];
                if (av.lIlIIlIIllIll(Inventory.contains((int[])nArray2) ? 1 : 0)) {
                    int[] nArray3 = new int[llIIIIlllI[1]];
                    nArray3[av.llIIIIlllI[0]] = llIIIIlllI[23];
                    if (!(!av.lIlIIlIIllIll(Inventory.contains((int[])nArray3) ? 1 : 0) || av.lIlIIlIIlllIl(Inventory.contains(item -> item.getName().contains(llIIIIIllI[llIIIIlllI[206]])) ? 1 : 0) && !av.lIlIIlIIllIll(Equipment.contains(item -> item.getName().contains(llIIIIIllI[llIIIIlllI[205]])) ? 1 : 0) || av.lIlIIlIIlllIl(Inventory.contains((int[])f.bk) ? 1 : 0) && !av.lIlIIlIIllIll(Equipment.contains((int[])f.bk) ? 1 : 0))) {
                        n3 = llIIIIlllI[1];

                        if (1 > 0) return n3 != 0;
                        return false;
                    }
                }
            }
            n3 = llIIIIlllI[0];
            return n3 != 0;
        }
        int[] nArray = new int[llIIIIlllI[1]];
        nArray[av.llIIIIlllI[0]] = llIIIIlllI[12];
        if (av.lIlIIlIIllIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
            int[] nArray4 = new int[llIIIIlllI[1]];
            nArray4[av.llIIIIlllI[0]] = llIIIIlllI[14];
            if (av.lIlIIlIIllIll(Inventory.contains((int[])nArray4) ? 1 : 0)) {
                int[] nArray5 = new int[llIIIIlllI[1]];
                nArray5[av.llIIIIlllI[0]] = llIIIIlllI[13];
                if (!(!av.lIlIIlIIllIll(Inventory.contains((int[])nArray5) ? 1 : 0) || av.lIlIIlIIlllIl(Inventory.contains(item -> item.getName().contains(llIIIIIllI[llIIIIlllI[204]])) ? 1 : 0) && !av.lIlIIlIIllIll(Equipment.contains(item -> item.getName().contains(llIIIIIllI[llIIIIlllI[203]])) ? 1 : 0) || av.lIlIIlIIlllIl(Inventory.contains((int[])f.bk) ? 1 : 0) && !av.lIlIIlIIllIll(Equipment.contains((int[])f.bk) ? 1 : 0))) {
                    n2 = llIIIIlllI[1];

                    if ((129 + 33 - 92 + 113 ^ 94 + 81 - 144 + 148) == (0x5E ^ 0x55 ^ (0x20 ^ 0x2F))) return n2 != 0;
                    return ((0x75 ^ 0x3A ^ (0xDB ^ 0xAB)) & (0xF5 ^ 0xB9 ^ (0xC6 ^ 0xB5) ^ -1)) != 0;
                }
            }
        }
        n2 = llIIIIlllI[0];
        return n2 != 0;
    }

        return String.valueOf(var27);
    }

    @Override
    public boolean ah() {
        boolean bl;
        if (av.lIlIIlIlIIIIl(Skills.getLevel((Skill)Skill.AGILITY), llIIIIlllI[185])) {
            bl = llIIIIlllI[1];

            }
        } else {
            bl = llIIIIlllI[0];
        }
        return bl;
    }

    private static boolean lIlIIlIlIIIII(int n2) {
        return n2 > 0;
    }

    /*
     * WARNING - void declaration
     */
    private static void eE() {
        void var28;
        void var29;
        void var30;
        void var31;
        void var32;
        WorldArea worldArea = new WorldArea(llIIIIlllI[161], llIIIIlllI[162], llIIIIlllI[111], llIIIIlllI[111], llIIIIlllI[0]);
        WorldArea worldArea2 = new WorldArea(llIIIIlllI[161], llIIIIlllI[162], llIIIIlllI[111], llIIIIlllI[111], llIIIIlllI[1]);
        WorldArea worldArea3 = new WorldArea(llIIIIlllI[161], llIIIIlllI[162], llIIIIlllI[111], llIIIIlllI[111], llIIIIlllI[2]);
        WorldArea worldArea4 = new WorldArea(llIIIIlllI[161], llIIIIlllI[162], llIIIIlllI[111], llIIIIlllI[111], llIIIIlllI[9]);
        WorldArea worldArea5 = new WorldArea(llIIIIlllI[163], llIIIIlllI[133], llIIIIlllI[64], llIIIIlllI[11], llIIIIlllI[9]);
        WorldArea worldArea6 = new WorldArea(llIIIIlllI[164], llIIIIlllI[139], llIIIIlllI[38], llIIIIlllI[53], llIIIIlllI[2]);
        WorldArea worldArea7 = new WorldArea(llIIIIlllI[165], llIIIIlllI[134], llIIIIlllI[49], llIIIIlllI[26], llIIIIlllI[2]);
        WorldArea worldArea8 = new WorldArea(llIIIIlllI[166], llIIIIlllI[136], llIIIIlllI[70], llIIIIlllI[64], llIIIIlllI[9]);
        WorldArea worldArea9 = new WorldArea(llIIIIlllI[167], llIIIIlllI[168], llIIIIlllI[54], llIIIIlllI[63], llIIIIlllI[2]);
        WorldPoint worldPoint = new WorldPoint(llIIIIlllI[169], llIIIIlllI[170], llIIIIlllI[0]);
        if (av.lIlIIlIIllIll(Dialog.isOpen() ? 1 : 0)) {
            Dialog.close();
        }
        if (av.lIlIIlIIlllIl(var32.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && av.lIlIIlIIlllIl(var31.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && av.lIlIIlIIlllIl(var30.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && av.lIlIIlIIlllIl(var29.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderSotf.c = llIIIIIllI[llIIIIlllI[171]];
            Movement.walkTo((WorldPoint)var28);

            Time.sleepTicks((int)llIIIIlllI[1]);

        }
        if (av.lIlIIlIIllIll(var32.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (av.lIlIIlIIlllll(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)var28), llIIIIlllI[20])) {
                AccBuilderSotf.c = llIIIIIllI[llIIIIlllI[172]];
                Movement.walkTo((WorldPoint)var28);

                Time.sleepTicks((int)llIIIIlllI[1]);

            }
            if (av.lIlIIlIlIIlII(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)var28), llIIIIlllI[20])) {
                AccBuilderSotf.c = llIIIIIllI[llIIIIlllI[173]];
                int var33 = Skills.getExperience((Skill)Skill.AGILITY);
                String[] stringArray = new String[llIIIIlllI[1]];
                stringArray[av.llIIIIlllI[0]] = llIIIIIllI[llIIIIlllI[174]];
                TileObjects.getNearest((String[])stringArray).interact(llIIIIIllI[llIIIIlllI[175]]);
                Time.sleepTicks((int)e.c(llIIIIlllI[1], llIIIIlllI[2]));

                Time.sleepUntil(() -> {
                    boolean bl;
                    if (av.lIlIIlIIlllll(Skills.getExperience((Skill)Skill.AGILITY), var33)) {
                        bl = llIIIIlllI[1];

                        if (2 <= -1) {
                            return false;
                        }
                    } else {
                        bl = llIIIIlllI[0];
                    }
                    return bl;
                }, (int)llIIIIlllI[103]);

                Time.sleepTicks((int)llIIIIlllI[1]);

            }
        }
        String[] stringArray = new String[llIIIIlllI[1]];
        stringArray[av.llIIIIlllI[0]] = llIIIIIllI[llIIIIlllI[35]];
        TileItem var33 = TileItems.getNearest((String[])stringArray);
        if (av.lIlIIlIIllllI(var33) && av.lIlIIlIIllIll(av.eF() ? 1 : 0)) {
            AccBuilderSotf.c = llIIIIIllI[llIIIIlllI[176]];
            System.out.println(llIIIIIllI[llIIIIlllI[177]]);
            var33.interact(llIIIIIllI[llIIIIlllI[178]]);
            Time.sleepTicks((int)llIIIIlllI[9]);

        }
        if (av.lIlIIlIIlllIl(av.eF() ? 1 : 0)) {
            void var34;
            void var35;
            void var36;
            void var37;
            int var38;
            TileObject var39;
            void var40;
            if (av.lIlIIlIIllIll(var40.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && av.lIlIIlIIllllI(var39 = TileObjects.getNearest(tileObject -> {
                int n2;
                if (av.lIlIIlIIllIll(tileObject.getName().contains(llIIIIIllI[llIIIIlllI[217]]) ? 1 : 0) && av.lIlIIlIlIIlII(tileObject.getWorldLocation().distanceTo(new WorldPoint(llIIIIlllI[218], llIIIIlllI[219], llIIIIlllI[9])), llIIIIlllI[2])) {
                    n2 = llIIIIlllI[1];

                    if (((0x47 ^ 0x1B) & ~(0xE0 ^ 0xBC)) != 0) {
                        return false;
                    }
                } else {
                    n2 = llIIIIlllI[0];
                }
                return n2 != 0;
            }))) {
                var38 = Skills.getExperience((Skill)Skill.AGILITY);
                AccBuilderSotf.c = llIIIIIllI[llIIIIlllI[179]];
                var39.interact(llIIIIIllI[llIIIIlllI[180]]);
                Time.sleepTicks((int)e.c(llIIIIlllI[1], llIIIIlllI[2]));

                Time.sleepUntil(() -> {
                    boolean bl;
                    if (av.lIlIIlIIlllll(Skills.getExperience((Skill)Skill.AGILITY), var38)) {
                        bl = llIIIIlllI[1];

                    } else {
                        bl = llIIIIlllI[0];
                    }
                    return bl;
                }, (int)llIIIIlllI[103]);

                Time.sleepTicks((int)llIIIIlllI[1]);

            }
            if (av.lIlIIlIIllIll(av.eF() ? 1 : 0)) {
                return;
            }
            if (av.lIlIIlIIllIll(var37.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && av.lIlIIlIIllllI(var39 = TileObjects.getNearest(tileObject -> {
                int n2;
                if (av.lIlIIlIIllIll(tileObject.getName().contains(llIIIIIllI[llIIIIlllI[215]]) ? 1 : 0) && av.lIlIIlIlIIlII(tileObject.getWorldLocation().distanceTo(new WorldPoint(llIIIIlllI[216], llIIIIlllI[128], llIIIIlllI[2])), llIIIIlllI[2])) {
                    n2 = llIIIIlllI[1];

                    if (((0xC1 ^ 0x98) & ~(0xCE ^ 0x97)) != 0) {
                        return false;
                    }
                } else {
                    n2 = llIIIIlllI[0];
                }
                return n2 != 0;
            }))) {
                AccBuilderSotf.c = llIIIIIllI[llIIIIlllI[78]];
                var38 = Skills.getExperience((Skill)Skill.AGILITY);
                var39.interact(llIIIIIllI[llIIIIlllI[181]]);
                Time.sleepTicks((int)e.c(llIIIIlllI[1], llIIIIlllI[2]));

                Time.sleepUntil(() -> {
                    boolean bl;
                    if (av.lIlIIlIIlllll(Skills.getExperience((Skill)Skill.AGILITY), var38)) {
                        bl = llIIIIlllI[1];

                    } else {
                        bl = llIIIIlllI[0];
                    }
                    return bl;
                }, (int)llIIIIlllI[103]);

                Time.sleepTicks((int)llIIIIlllI[1]);

            }
            if (av.lIlIIlIIllIll(av.eF() ? 1 : 0)) {
                return;
            }
            if (av.lIlIIlIIllIll(var36.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && av.lIlIIlIIllllI(var39 = TileObjects.getNearest(tileObject -> {
                int n2;
                if (av.lIlIIlIIllIll(tileObject.getName().contains(llIIIIIllI[llIIIIlllI[212]]) ? 1 : 0) && av.lIlIIlIlIIlII(tileObject.getWorldLocation().distanceTo(new WorldPoint(llIIIIlllI[213], llIIIIlllI[214], llIIIIlllI[2])), llIIIIlllI[2])) {
                    n2 = llIIIIlllI[1];

                    if (2 != 2) {
                        return false;
                    }
                } else {
                    n2 = llIIIIlllI[0];
                }
                return n2 != 0;
            }))) {
                AccBuilderSotf.c = llIIIIIllI[llIIIIlllI[182]];
                var38 = Skills.getExperience((Skill)Skill.AGILITY);
                var39.interact(llIIIIIllI[llIIIIlllI[183]]);
                Time.sleepTicks((int)e.c(llIIIIlllI[1], llIIIIlllI[2]));

                Time.sleepUntil(() -> {
                    boolean bl;
                    if (av.lIlIIlIIlllll(Skills.getExperience((Skill)Skill.AGILITY), var38)) {
                        bl = llIIIIlllI[1];

                        if (3 <= -1) {
                            return false;
                        }
                    } else {
                        bl = llIIIIlllI[0];
                    }
                    return bl;
                }, (int)llIIIIlllI[103]);

                Time.sleepTicks((int)llIIIIlllI[1]);

            }
            if (av.lIlIIlIIllIll(av.eF() ? 1 : 0)) {
                return;
            }
            if (av.lIlIIlIIllIll(var35.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && av.lIlIIlIIllllI(var39 = TileObjects.getNearest(tileObject -> {
                int n2;
                if (av.lIlIIlIIllIll(tileObject.getName().contains(llIIIIIllI[llIIIIlllI[210]]) ? 1 : 0) && av.lIlIIlIlIIlII(tileObject.getWorldLocation().distanceTo(new WorldPoint(llIIIIlllI[208], llIIIIlllI[211], llIIIIlllI[9])), llIIIIlllI[2])) {
                    n2 = llIIIIlllI[1];

                    if (-(0x7E ^ 0x68 ^ (0xA ^ 0x18)) >= 0) {
                        return ((55 + 90 - 107 + 119 ^ 60 + 30 - -22 + 29) & (0xBB ^ 0xAF ^ (0x4E ^ 0x4A) ^ -1)) != 0;
                    }
                } else {
                    n2 = llIIIIlllI[0];
                }
                return n2 != 0;
            }))) {
                AccBuilderSotf.c = llIIIIIllI[llIIIIlllI[184]];
                var38 = Skills.getExperience((Skill)Skill.AGILITY);
                var39.interact(llIIIIIllI[llIIIIlllI[185]]);
                Time.sleepTicks((int)e.c(llIIIIlllI[1], llIIIIlllI[2]));

                Time.sleepUntil(() -> {
                    boolean bl;
                    if (av.lIlIIlIIlllll(Skills.getExperience((Skill)Skill.AGILITY), var38)) {
                        bl = llIIIIlllI[1];

                        }
                    } else {
                        bl = llIIIIlllI[0];
                    }
                    return bl;
                }, (int)llIIIIlllI[103]);

                Time.sleepTicks((int)llIIIIlllI[1]);

            }
            if (av.lIlIIlIIllIll(av.eF() ? 1 : 0)) {
                return;
            }
            if (av.lIlIIlIIllIll(var34.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && av.lIlIIlIIllllI(var39 = TileObjects.getNearest(tileObject -> {
                int n2;
                if (av.lIlIIlIIllIll(tileObject.getName().contains(llIIIIIllI[llIIIIlllI[207]]) ? 1 : 0) && av.lIlIIlIlIIlII(tileObject.getWorldLocation().distanceTo(new WorldPoint(llIIIIlllI[208], llIIIIlllI[209], llIIIIlllI[2])), llIIIIlllI[2])) {
                    n2 = llIIIIlllI[1];

                    if (2 <= 0) {
                        return false;
                    }
                } else {
                    n2 = llIIIIlllI[0];
                }
                return n2 != 0;
            }))) {
                AccBuilderSotf.c = llIIIIIllI[llIIIIlllI[186]];
                var38 = Skills.getExperience((Skill)Skill.AGILITY);
                var39.interact(llIIIIIllI[llIIIIlllI[187]]);
                Time.sleepTicks((int)e.c(llIIIIlllI[1], llIIIIlllI[2]));

                Time.sleepUntil(() -> {
                    boolean bl;
                    if (av.lIlIIlIIlllll(Skills.getExperience((Skill)Skill.AGILITY), var38)) {
                        bl = llIIIIlllI[1];

                        if (((0x5B ^ 0x30 ^ (0x83 ^ 0xA1)) & (118 + 152 - 207 + 134 ^ 38 + 57 - 93 + 138 ^ -1)) != 0) {
                            return ((0x92 ^ 0xC0 ^ (0x42 ^ 2)) & (52 + 47 - 22 + 53 ^ 51 + 95 - 88 + 86 ^ -1)) != 0;
                        }
                    } else {
                        bl = llIIIIlllI[0];
                    }
                    return bl;
                }, (int)llIIIIlllI[103]);

                Time.sleepTicks((int)llIIIIlllI[1]);

            }
        }
    }

    private static boolean lIlIIlIIlllII(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * WARNING - void declaration
     */
    private static void eB() {
        WorldArea worldArea = new WorldArea(llIIIIlllI[46], llIIIIlllI[47], llIIIIlllI[11], llIIIIlllI[20], llIIIIlllI[0]);
        WorldArea worldArea2 = new WorldArea(llIIIIlllI[46], llIIIIlllI[48], llIIIIlllI[49], llIIIIlllI[24], llIIIIlllI[0]);
        WorldArea worldArea3 = new WorldArea(llIIIIlllI[46], llIIIIlllI[50], llIIIIlllI[49], llIIIIlllI[24], llIIIIlllI[1]);
        WorldArea worldArea4 = new WorldArea(llIIIIlllI[51], llIIIIlllI[52], llIIIIlllI[53], llIIIIlllI[54], llIIIIlllI[2]);
        WorldArea worldArea5 = new WorldArea(llIIIIlllI[55], llIIIIlllI[56], llIIIIlllI[24], llIIIIlllI[11], llIIIIlllI[2]);
        WorldArea worldArea6 = new WorldArea(llIIIIlllI[57], llIIIIlllI[58], llIIIIlllI[49], llIIIIlllI[11], llIIIIlllI[0]);
        WorldArea worldArea7 = new WorldArea(llIIIIlllI[59], llIIIIlllI[60], llIIIIlllI[11], llIIIIlllI[20], llIIIIlllI[0]);
        WorldArea worldArea8 = new WorldArea(llIIIIlllI[46], llIIIIlllI[47], llIIIIlllI[61], llIIIIlllI[20], llIIIIlllI[0]);
        if (av.lIlIIlIIlllIl(mW.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && av.lIlIIlIIlllIl(mX.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && av.lIlIIlIIlllIl(mY.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderSotf.c = llIIIIIllI[llIIIIlllI[11]];
            e.b(mZ);
            Time.sleepTicks((int)llIIIIlllI[1]);

        }
        if ((!av.lIlIIlIIlllIl(mW.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || !av.lIlIIlIIlllIl(mX.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || av.lIlIIlIIllIll(mY.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) && av.lIlIIlIlIIIlI(Players.getLocal().getAnimation(), llIIIIlllI[62]) && av.lIlIIlIIlllIl(Players.getLocal().isMoving() ? 1 : 0)) {
            void var41;
            void var42;
            void var43;
            void var44;
            void var45;
            void var46;
            void var47;
            if (av.lIlIIlIIllIll(var47.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderSotf.c = llIIIIIllI[llIIIIlllI[49]];
                String[] stringArray = new String[llIIIIlllI[1]];
                stringArray[av.llIIIIlllI[0]] = llIIIIIllI[llIIIIlllI[63]];
                TileObjects.getNearest((String[])stringArray).interact(llIIIIIllI[llIIIIlllI[64]]);
                Time.sleepTicks((int)llIIIIlllI[2]);

            }
            if (av.lIlIIlIIllIll(var46.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderSotf.c = llIIIIIllI[llIIIIlllI[53]];
                String[] stringArray = new String[llIIIIlllI[1]];
                stringArray[av.llIIIIlllI[0]] = llIIIIIllI[llIIIIlllI[38]];
                TileObjects.getNearest((String[])stringArray).interact(llIIIIIllI[llIIIIlllI[65]]);
                Time.sleepTicks((int)llIIIIlllI[2]);

            }
            if (av.lIlIIlIIllIll(var45.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderSotf.c = llIIIIIllI[llIIIIlllI[66]];
                String[] stringArray = new String[llIIIIlllI[1]];
                stringArray[av.llIIIIlllI[0]] = llIIIIIllI[llIIIIlllI[54]];
                TileObjects.getNearest((String[])stringArray).interact(llIIIIIllI[llIIIIlllI[67]]);
                Time.sleepTicks((int)llIIIIlllI[2]);

            }
            if (av.lIlIIlIIllIll(var44.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderSotf.c = llIIIIIllI[llIIIIlllI[40]];
                String[] stringArray = new String[llIIIIlllI[1]];
                stringArray[av.llIIIIlllI[0]] = llIIIIIllI[llIIIIlllI[68]];
                TileObjects.getNearest((String[])stringArray).interact(llIIIIIllI[llIIIIlllI[61]]);
                Time.sleepTicks((int)llIIIIlllI[18]);

            }
            if (av.lIlIIlIIllIll(var43.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderSotf.c = llIIIIIllI[llIIIIlllI[69]];
                String[] stringArray = new String[llIIIIlllI[1]];
                stringArray[av.llIIIIlllI[0]] = llIIIIIllI[llIIIIlllI[70]];
                TileObjects.getNearest((String[])stringArray).interact(llIIIIIllI[llIIIIlllI[41]]);
                Time.sleepTicks((int)llIIIIlllI[16]);

            }
            if (av.lIlIIlIIllIll(var42.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderSotf.c = llIIIIIllI[llIIIIlllI[71]];
                String[] stringArray = new String[llIIIIlllI[1]];
                stringArray[av.llIIIIlllI[0]] = llIIIIIllI[llIIIIlllI[72]];
                TileObjects.getNearest((String[])stringArray).interact(llIIIIIllI[llIIIIlllI[73]]);
                Time.sleepTicks((int)llIIIIlllI[9]);

            }
            if (av.lIlIIlIIllIll(var41.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderSotf.c = llIIIIIllI[llIIIIlllI[74]];
                TileObject var48 = TileObjects.getNearest(tileObject -> {
                    int n2;
                    if (av.lIlIIlIIllIll(tileObject.getName().contains(llIIIIIllI[llIIIIlllI[234]]) ? 1 : 0) && av.lIlIIlIlIIlII(tileObject.getWorldLocation().distanceTo(new WorldPoint(llIIIIlllI[235], llIIIIlllI[236], llIIIIlllI[0])), llIIIIlllI[2])) {
                        String[] stringArray = new String[llIIIIlllI[1]];
                        stringArray[av.llIIIIlllI[0]] = llIIIIIllI[llIIIIlllI[237]];
                        if (av.lIlIIlIIllIll(tileObject.hasAction(stringArray) ? 1 : 0)) {
                            n2 = llIIIIlllI[1];

                            if (1 < 3) return n2 != 0;
                            return false;
                        }
                    }
                    n2 = llIIIIlllI[0];
                    return n2 != 0;
                });
                if (av.lIlIIlIIllllI(var48)) {
                    var48.interact(llIIIIIllI[llIIIIlllI[42]]);
                    Time.sleepTicks((int)e.c(llIIIIlllI[9], llIIIIlllI[16]));

                }
                if (av.lIlIIlIlIIIll(var48)) {
                    e.D();
                }
            }
        }
    }

    private static boolean lIlIIlIIllllI(Object object) {
        return object != null;
    }

    private static boolean lIlIIlIlIIIIl(int n2, int n3) {
        return n2 >= n3;
    }

    /*
     * WARNING - void declaration
     */
    private static boolean eF() {
        WorldArea worldArea = new WorldArea(llIIIIlllI[79], llIIIIlllI[80], llIIIIlllI[69], llIIIIlllI[64], llIIIIlllI[0]);
        WorldArea worldArea2 = new WorldArea(llIIIIlllI[81], llIIIIlllI[80], llIIIIlllI[11], llIIIIlllI[64], llIIIIlllI[9]);
        WorldArea worldArea3 = new WorldArea(llIIIIlllI[82], llIIIIlllI[83], llIIIIlllI[63], llIIIIlllI[49], llIIIIlllI[9]);
        WorldArea worldArea4 = new WorldArea(llIIIIlllI[188], llIIIIlllI[189], llIIIIlllI[24], llIIIIlllI[18], llIIIIlllI[1]);
        WorldArea worldArea5 = new WorldArea(llIIIIlllI[84], llIIIIlllI[86], llIIIIlllI[11], llIIIIlllI[24], llIIIIlllI[9]);
        WorldArea worldArea6 = new WorldArea(llIIIIlllI[190], llIIIIlllI[191], llIIIIlllI[73], llIIIIlllI[38], llIIIIlllI[9]);
        WorldArea worldArea7 = new WorldArea(llIIIIlllI[90], llIIIIlllI[91], llIIIIlllI[66], llIIIIlllI[64], llIIIIlllI[9]);
        WorldArea worldArea8 = new WorldArea(llIIIIlllI[92], llIIIIlllI[93], llIIIIlllI[22], llIIIIlllI[26], llIIIIlllI[9]);
        WorldArea worldArea9 = new WorldArea(llIIIIlllI[92], llIIIIlllI[94], llIIIIlllI[11], llIIIIlllI[22], llIIIIlllI[9]);
        WorldArea worldArea10 = new WorldArea(llIIIIlllI[127], llIIIIlllI[128], llIIIIlllI[49], llIIIIlllI[11], llIIIIlllI[2]);
        WorldArea worldArea11 = new WorldArea(llIIIIlllI[129], llIIIIlllI[127], llIIIIlllI[49], llIIIIlllI[24], llIIIIlllI[2]);
        WorldArea worldArea12 = new WorldArea(llIIIIlllI[130], llIIIIlllI[131], llIIIIlllI[63], llIIIIlllI[49], llIIIIlllI[2]);
        WorldArea worldArea13 = new WorldArea(llIIIIlllI[132], llIIIIlllI[133], llIIIIlllI[11], llIIIIlllI[64], llIIIIlllI[9]);
        WorldArea worldArea14 = new WorldArea(llIIIIlllI[134], llIIIIlllI[8], llIIIIlllI[49], llIIIIlllI[26], llIIIIlllI[2]);
        WorldArea worldArea15 = new WorldArea(llIIIIlllI[135], llIIIIlllI[136], llIIIIlllI[68], llIIIIlllI[53], llIIIIlllI[9]);
        WorldArea worldArea16 = new WorldArea(llIIIIlllI[137], llIIIIlllI[138], llIIIIlllI[63], llIIIIlllI[64], llIIIIlllI[2]);
        WorldArea worldArea17 = new WorldArea(llIIIIlllI[163], llIIIIlllI[133], llIIIIlllI[64], llIIIIlllI[11], llIIIIlllI[9]);
        WorldArea worldArea18 = new WorldArea(llIIIIlllI[164], llIIIIlllI[139], llIIIIlllI[38], llIIIIlllI[53], llIIIIlllI[2]);
        WorldArea worldArea19 = new WorldArea(llIIIIlllI[165], llIIIIlllI[134], llIIIIlllI[49], llIIIIlllI[26], llIIIIlllI[2]);
        WorldArea worldArea20 = new WorldArea(llIIIIlllI[166], llIIIIlllI[136], llIIIIlllI[70], llIIIIlllI[64], llIIIIlllI[9]);
        WorldArea worldArea21 = new WorldArea(llIIIIlllI[167], llIIIIlllI[168], llIIIIlllI[54], llIIIIlllI[63], llIIIIlllI[2]);
        WorldArea[] worldAreaArray = new WorldArea[llIIIIlllI[68]];
        worldAreaArray[av.llIIIIlllI[0]] = worldArea;
        worldAreaArray[av.llIIIIlllI[1]] = worldArea2;
        worldAreaArray[av.llIIIIlllI[2]] = worldArea3;
        worldAreaArray[av.llIIIIlllI[9]] = worldArea4;
        worldAreaArray[av.llIIIIlllI[16]] = worldArea5;
        worldAreaArray[av.llIIIIlllI[18]] = worldArea6;
        worldAreaArray[av.llIIIIlllI[20]] = worldArea7;
        worldAreaArray[av.llIIIIlllI[22]] = worldArea8;
        worldAreaArray[av.llIIIIlllI[24]] = worldArea9;
        worldAreaArray[av.llIIIIlllI[26]] = worldArea10;
        worldAreaArray[av.llIIIIlllI[11]] = worldArea11;
        worldAreaArray[av.llIIIIlllI[49]] = worldArea12;
        worldAreaArray[av.llIIIIlllI[63]] = worldArea13;
        worldAreaArray[av.llIIIIlllI[64]] = worldArea14;
        worldAreaArray[av.llIIIIlllI[53]] = worldArea15;
        worldAreaArray[av.llIIIIlllI[38]] = worldArea16;
        worldAreaArray[av.llIIIIlllI[65]] = worldArea17;
        worldAreaArray[av.llIIIIlllI[66]] = worldArea18;
        worldAreaArray[av.llIIIIlllI[54]] = worldArea19;
        worldAreaArray[av.llIIIIlllI[67]] = worldArea20;
        worldAreaArray[av.llIIIIlllI[40]] = worldArea21;
        WorldArea[] worldAreaArray2 = worldAreaArray;
        int[] nArray = new int[llIIIIlllI[1]];
        nArray[av.llIIIIlllI[0]] = llIIIIlllI[192];
        if (av.lIlIIlIIllllI(TileItems.getNearest((int[])nArray))) {
            void var49;
            System.out.println(llIIIIIllI[llIIIIlllI[193]]);
            int var50 = llIIIIlllI[0];
            while (av.lIlIIlIIlllII(var50, ((void)var49).length)) {
                int[] nArray2 = new int[llIIIIlllI[1]];
                nArray2[av.llIIIIlllI[0]] = llIIIIlllI[192];
                if (av.lIlIIlIIllIll(var49[var50].contains(TileItems.getNearest((int[])nArray2).getWorldLocation()) ? 1 : 0) && av.lIlIIlIIllIll(var49[var50].contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    return llIIIIlllI[1];
                }
                ++var50;

                if (3 > 0) continue;
                return false;
            }
        }
        return llIIIIlllI[0];
    }

    private static boolean lIlIIlIIlllll(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIlIIlIIllIll(int n2) {
        return n2 != 0;
    }

    private static boolean lIlIIlIlIIIll(Object object) {
        return object == null;
    }

    public static void eA() {
        if (av.lIlIIlIIllIll(bt ? 1 : 0)) {
            AccBuilderSotf.c = llIIIIIllI[llIIIIlllI[0]];
            b.a(bv);
            if (av.lIlIIlIIlllII(bv.size(), llIIIIlllI[1])) {
                System.out.println(llIIIIIllI[llIIIIlllI[1]]);
                bt = llIIIIlllI[0];
            }
        }
        if (av.lIlIIlIIlllIl(bt ? 1 : 0)) {
            if (av.lIlIIlIIlllIl(av.an() ? 1 : 0)) {
                BankLocation var51 = BankLocation.getNearest();
                if (av.lIlIIlIIllllI(var51) && av.lIlIIlIIlllIl(var51.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderSotf.c = llIIIIIllI[llIIIIlllI[2]];
                    WorldArea var52 = new WorldArea(llIIIIlllI[3], llIIIIlllI[4], llIIIIlllI[5], llIIIIlllI[6], llIIIIlllI[0]);
                    if (av.lIlIIlIIllIll(var52.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        WorldPoint var53 = new WorldPoint(llIIIIlllI[7], llIIIIlllI[8], llIIIIlllI[0]);
                        if (av.lIlIIlIIlllll(Players.getLocal().getWorldLocation().distanceTo(var53), llIIIIlllI[9])) {
                            Movement.walkTo((WorldPoint)var53);

                            Time.sleepTicks((int)llIIIIlllI[1]);

                        }
                    }
                    a.a(var51);
                }
                if (av.lIlIIlIIllllI(var51) && av.lIlIIlIIllIll(var51.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderSotf.c = llIIIIIllI[llIIIIlllI[9]];
                    if (av.lIlIIlIIlllIl(Bank.isOpen() ? 1 : 0)) {
                        a.a();
                        Time.sleepUntil(() -> Bank.isOpen(), (int)llIIIIlllI[10]);

                    }
                    if (av.lIlIIlIIllIll(Bank.isOpen() ? 1 : 0)) {
                        if (av.lIlIIlIlIIIII(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks((int)llIIIIlllI[1]);

                        }
                        if (av.lIlIIlIlIIIII(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks((int)llIIIIlllI[2]);

                        }
                    }
                    int[] nArray = new int[llIIIIlllI[11]];
                    nArray[av.llIIIIlllI[0]] = llIIIIlllI[12];
                    nArray[av.llIIIIlllI[1]] = llIIIIlllI[13];
                    nArray[av.llIIIIlllI[2]] = llIIIIlllI[14];
                    nArray[av.llIIIIlllI[9]] = llIIIIlllI[15];
                    nArray[av.llIIIIlllI[16]] = llIIIIlllI[17];
                    nArray[av.llIIIIlllI[18]] = llIIIIlllI[19];
                    nArray[av.llIIIIlllI[20]] = llIIIIlllI[21];
                    nArray[av.llIIIIlllI[22]] = llIIIIlllI[23];
                    nArray[av.llIIIIlllI[24]] = llIIIIlllI[25];
                    nArray[av.llIIIIlllI[26]] = llIIIIlllI[27];
                    if (av.lIlIIlIIlllIl(e.c(nArray) ? 1 : 0)) {
                        av.Q();
                        System.out.println(llIIIIIllI[llIIIIlllI[16]]);
                        bt = llIIIIlllI[1];
                        return;
                    }
                    int[] nArray2 = new int[llIIIIlllI[11]];
                    nArray2[av.llIIIIlllI[0]] = llIIIIlllI[12];
                    nArray2[av.llIIIIlllI[1]] = llIIIIlllI[13];
                    nArray2[av.llIIIIlllI[2]] = llIIIIlllI[14];
                    nArray2[av.llIIIIlllI[9]] = llIIIIlllI[15];
                    nArray2[av.llIIIIlllI[16]] = llIIIIlllI[17];
                    nArray2[av.llIIIIlllI[18]] = llIIIIlllI[19];
                    nArray2[av.llIIIIlllI[20]] = llIIIIlllI[21];
                    nArray2[av.llIIIIlllI[22]] = llIIIIlllI[23];
                    nArray2[av.llIIIIlllI[24]] = llIIIIlllI[25];
                    nArray2[av.llIIIIlllI[26]] = llIIIIlllI[27];
                    if (av.lIlIIlIIllIll(e.c(nArray2) ? 1 : 0)) {
                        a.a(llIIIIlllI[28], llIIIIlllI[1]);
                        a.a(llIIIIlllI[29], llIIIIlllI[1]);
                        a.a(llIIIIlllI[30], llIIIIlllI[1]);
                        a.a(llIIIIlllI[31], llIIIIlllI[1]);
                        a.a(llIIIIlllI[32], llIIIIlllI[1]);
                        a.a(llIIIIlllI[33], llIIIIlllI[1]);
                        a.a(llIIIIlllI[34], llIIIIlllI[1]);
                        int[] nArray3 = new int[llIIIIlllI[1]];
                        nArray3[av.llIIIIlllI[0]] = llIIIIlllI[28];
                        if (av.lIlIIlIIlllIl(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                            int[] nArray4 = new int[llIIIIlllI[1]];
                            nArray4[av.llIIIIlllI[0]] = llIIIIlllI[28];
                            if (av.lIlIIlIIlllIl(Equipment.contains((int[])nArray4) ? 1 : 0)) {
                                int[] nArray5 = new int[llIIIIlllI[1]];
                                nArray5[av.llIIIIlllI[0]] = llIIIIlllI[28];
                                if (av.lIlIIlIIlllIl(Bank.contains((int[])nArray5) ? 1 : 0)) {
                                    a.a(llIIIIlllI[35], llIIIIlllI[1]);
                                }
                            }
                        }
                        a.a(llIIIIlllI[17], llIIIIlllI[1]);
                        e.l(llIIIIlllI[28]);
                        e.l(llIIIIlllI[29]);
                        e.l(llIIIIlllI[30]);
                        e.l(llIIIIlllI[31]);
                        e.l(llIIIIlllI[32]);
                        Time.sleepTicks((int)llIIIIlllI[1]);

                        e.l(llIIIIlllI[34]);
                        e.l(llIIIIlllI[36]);
                        e.l(llIIIIlllI[33]);
                        e.l(llIIIIlllI[35]);
                        e.l(llIIIIlllI[17]);
                        Time.sleepTicks((int)llIIIIlllI[9]);

                        if (av.lIlIIlIIlllIl(Bank.isOpen() ? 1 : 0)) {
                            a.a();
                            Time.sleepTicks((int)llIIIIlllI[20]);

                        }
                        if (av.lIlIIlIIllIll(Bank.isOpen() ? 1 : 0)) {
                            if (av.lIlIIlIIlllII(Skills.getLevel((Skill)Skill.AGILITY), llIIIIlllI[37])) {
                                a.a(llIIIIlllI[12], llIIIIlllI[11]);
                                a.a(llIIIIlllI[13], llIIIIlllI[11]);
                                a.a(llIIIIlllI[21], llIIIIlllI[11]);
                                a.a(llIIIIlllI[14], llIIIIlllI[11]);
                                a.b(f.bk, llIIIIlllI[1]);
                                a.a(llIIIIlllI[27], llIIIIlllI[1]);
                                a.a(llIIIIlllI[19], llIIIIlllI[18]);
                                a.a(llIIIIlllI[23], llIIIIlllI[38]);
                            }
                            if (av.lIlIIlIlIIIIl(Skills.getLevel((Skill)Skill.AGILITY), llIIIIlllI[37])) {
                                a.a(llIIIIlllI[12], llIIIIlllI[11]);
                                a.a(llIIIIlllI[21], llIIIIlllI[11]);
                                a.a(llIIIIlllI[25], llIIIIlllI[11]);
                                a.b(f.bk, llIIIIlllI[1]);
                                a.a(llIIIIlllI[27], llIIIIlllI[1]);
                                a.a(llIIIIlllI[19], llIIIIlllI[24]);
                                a.a(llIIIIlllI[23], llIIIIlllI[11]);
                            }
                        }
                    }
                }
            }
            if (av.lIlIIlIIllIll(av.an() ? 1 : 0)) {
                String[] stringArray = new String[llIIIIlllI[1]];
                stringArray[av.llIIIIlllI[0]] = llIIIIIllI[llIIIIlllI[18]];
                if (av.lIlIIlIIllIll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    String[] stringArray2 = new String[llIIIIlllI[1]];
                    stringArray2[av.llIIIIlllI[0]] = llIIIIIllI[llIIIIlllI[20]];
                    Inventory.getFirst((String[])stringArray2).interact(llIIIIIllI[llIIIIlllI[22]]);
                }
                if (av.lIlIIlIIllIll(Inventory.contains((int[])f.ba) ? 1 : 0) && av.lIlIIlIIlllII(Movement.getRunEnergy(), llIIIIlllI[39])) {
                    Inventory.getFirst((int[])f.ba).interact(llIIIIIllI[llIIIIlllI[24]]);
                    Time.sleepTicks((int)llIIIIlllI[1]);

                }
                if (av.lIlIIlIIlllll(Combat.getMissingHealth(), llIIIIlllI[40])) {
                    int[] nArray = new int[llIIIIlllI[1]];
                    nArray[av.llIIIIlllI[0]] = llIIIIlllI[23];
                    if (av.lIlIIlIIllIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        int[] nArray6 = new int[llIIIIlllI[1]];
                        nArray6[av.llIIIIlllI[0]] = llIIIIlllI[23];
                        Inventory.getFirst((int[])nArray6).interact(llIIIIIllI[llIIIIlllI[26]]);
                        Time.sleepTicks((int)llIIIIlllI[2]);

                    }
                }
                if (av.lIlIIlIIlllll(Movement.getRunEnergy(), llIIIIlllI[41]) && av.lIlIIlIIlllIl(Movement.isRunEnabled() ? 1 : 0)) {
                    Movement.toggleRun();
                }
                if (av.lIlIIlIIlllII(Skills.getLevel((Skill)Skill.AGILITY), llIIIIlllI[42])) {
                    av.eB();
                }
                if ((!av.lIlIIlIlIIIIl(e.j(llIIIIlllI[43]), llIIIIlllI[44]) || av.lIlIIlIIlllII(e.j(llIIIIlllI[45]), llIIIIlllI[18])) && av.lIlIIlIlIIIIl(Skills.getLevel((Skill)Skill.AGILITY), llIIIIlllI[42]) && av.lIlIIlIIlllII(Skills.getLevel((Skill)Skill.AGILITY), llIIIIlllI[44])) {
                    av.eC();
                }
                if (av.lIlIIlIlIIIIl(e.j(llIIIIlllI[43]), llIIIIlllI[44]) && av.lIlIIlIlIIIIl(e.j(llIIIIlllI[45]), llIIIIlllI[18])) {
                    if (av.lIlIIlIlIIIIl(Skills.getLevel((Skill)Skill.AGILITY), llIIIIlllI[42]) && av.lIlIIlIIlllII(Skills.getLevel((Skill)Skill.AGILITY), llIIIIlllI[37])) {
                        av.eC();
                    }
                    if (av.lIlIIlIlIIIIl(Skills.getLevel((Skill)Skill.AGILITY), llIIIIlllI[37]) && av.lIlIIlIIlllII(Skills.getLevel((Skill)Skill.AGILITY), llIIIIlllI[44])) {
                        av.eD();
                    }
                }
                if (av.lIlIIlIlIIIIl(Skills.getLevel((Skill)Skill.AGILITY), llIIIIlllI[44])) {
                    av.eE();
                }
            }
        }
    }

    private static void lIlIIlIIIllIl() {
        llIIIIIllI = new String[llIIIIlllI[241]];
        av.llIIIIIllI[av.llIIIIlllI[0]] = "Buying items";
        av.llIIIIIllI[av.llIIIIlllI[1]] = "Finished buying items, switching back to agility";
        av.llIIIIIllI[av.llIIIIlllI[2]] = "Navigating to bank";
        av.llIIIIIllI[av.llIIIIlllI[9]] = "Handling banking";
        av.llIIIIIllI[av.llIIIIlllI[16]] = "We are missing quest supplies, switching to BUYING";
        av.llIIIIIllI[av.llIIIIlllI[18]] = "Vial";
        av.llIIIIIllI[av.llIIIIlllI[20]] = "Vial";
        av.llIIIIIllI[av.llIIIIlllI[22]] = "Drop";
        av.llIIIIIllI[av.llIIIIlllI[24]] = "Drink";
        av.llIIIIIllI[av.llIIIIlllI[26]] = "Eat";
        av.llIIIIIllI[av.llIIIIlllI[11]] = "Nav to gnome course";
        av.llIIIIIllI[av.llIIIIlllI[49]] = "Crossing log";
        av.llIIIIIllI[av.llIIIIlllI[63]] = "Log balance";
        av.llIIIIIllI[av.llIIIIlllI[64]] = "Walk-across";
        av.llIIIIIllI[av.llIIIIlllI[53]] = "Climbing net";
        av.llIIIIIllI[av.llIIIIlllI[38]] = "Obstacle net";
        av.llIIIIIllI[av.llIIIIlllI[65]] = "Climb-over";
        av.llIIIIIllI[av.llIIIIlllI[66]] = "Climbing branch";
        av.llIIIIIllI[av.llIIIIlllI[54]] = "Tree branch";
        av.llIIIIIllI[av.llIIIIlllI[67]] = "Climb";
        av.llIIIIIllI[av.llIIIIlllI[40]] = "Crossing rope";
        av.llIIIIIllI[av.llIIIIlllI[68]] = "Balancing rope";
        av.llIIIIIllI[av.llIIIIlllI[61]] = "Walk-on";
        av.llIIIIIllI[av.llIIIIlllI[69]] = "Climbing down";
        av.llIIIIIllI[av.llIIIIlllI[70]] = "Tree branch";
        av.llIIIIIllI[av.llIIIIlllI[41]] = "Climb-down";
        av.llIIIIIllI[av.llIIIIlllI[71]] = "Climbing net";
        av.llIIIIIllI[av.llIIIIlllI[72]] = "Obstacle net";
        av.llIIIIIllI[av.llIIIIlllI[73]] = "Climb-over";
        av.llIIIIIllI[av.llIIIIlllI[74]] = "Crossing pipe";
        av.llIIIIIllI[av.llIIIIlllI[42]] = "Squeeze-through";
        av.llIIIIIllI[av.llIIIIlllI[89]] = "Nav to start";
        av.llIIIIIllI[av.llIIIIlllI[96]] = "Mark of grace";
        av.llIIIIIllI[av.llIIIIlllI[97]] = "Taking mark";
        av.llIIIIIllI[av.llIIIIlllI[98]] = "Found mark on ground";
        av.llIIIIIllI[av.llIIIIlllI[99]] = "Take";
        av.llIIIIIllI[av.llIIIIlllI[100]] = "Starting course";
        av.llIIIIIllI[av.llIIIIlllI[101]] = "Rough wall";
        av.llIIIIIllI[av.llIIIIlllI[102]] = "Climb";
        av.llIIIIIllI[av.llIIIIlllI[104]] = "Crossing clothes line";
        av.llIIIIIllI[av.llIIIIlllI[37]] = "Clothes line";
        av.llIIIIIllI[av.llIIIIlllI[105]] = "Cross";
        av.llIIIIIllI[av.llIIIIlllI[106]] = "Leaping";
        av.llIIIIIllI[av.llIIIIlllI[107]] = "Gap";
        av.llIIIIIllI[av.llIIIIlllI[108]] = "Leap";
        av.llIIIIIllI[av.llIIIIlllI[109]] = "Balancing";
        av.llIIIIIllI[av.llIIIIlllI[110]] = "Wall";
        av.llIIIIIllI[av.llIIIIlllI[111]] = "Balance";
        av.llIIIIIllI[av.llIIIIlllI[112]] = "Jumping gap";
        av.llIIIIIllI[av.llIIIIlllI[113]] = "Gap";
        av.llIIIIIllI[av.llIIIIlllI[39]] = "Leap";
        av.llIIIIIllI[av.llIIIIlllI[6]] = "Jumping gap 2";
        av.llIIIIIllI[av.llIIIIlllI[115]] = "Leap";
        av.llIIIIIllI[av.llIIIIlllI[116]] = "Jumping gap 3";
        av.llIIIIIllI[av.llIIIIlllI[118]] = "Leap";
        av.llIIIIIllI[av.llIIIIlllI[119]] = "Hurdle roof";
        av.llIIIIIllI[av.llIIIIlllI[121]] = "Hurdle";
        av.llIIIIIllI[av.llIIIIlllI[122]] = "Finishing course";
        av.llIIIIIllI[av.llIIIIlllI[123]] = "Edge";
        av.llIIIIIllI[av.llIIIIlllI[124]] = "Jump-off";
        av.llIIIIIllI[av.llIIIIlllI[44]] = "Nav to canafis course";
        av.llIIIIIllI[av.llIIIIlllI[140]] = "Nav to start";
        av.llIIIIIllI[av.llIIIIlllI[5]] = "Starting course";
        av.llIIIIIllI[av.llIIIIlllI[141]] = "Tall tree";
        av.llIIIIIllI[av.llIIIIlllI[142]] = "Climb";
        av.llIIIIIllI[av.llIIIIlllI[143]] = "Mark of grace";
        av.llIIIIIllI[av.llIIIIlllI[144]] = "Taking mark";
        av.llIIIIIllI[av.llIIIIlllI[145]] = "Found mark on ground";
        av.llIIIIIllI[av.llIIIIlllI[146]] = "Take";
        av.llIIIIIllI[av.llIIIIlllI[147]] = "Jumping gap 1";
        av.llIIIIIllI[av.llIIIIlllI[148]] = "Jump";
        av.llIIIIIllI[av.llIIIIlllI[149]] = "Jumping gap 2";
        av.llIIIIIllI[av.llIIIIlllI[150]] = "Jump";
        av.llIIIIIllI[av.llIIIIlllI[151]] = "Jumping gap 3";
        av.llIIIIIllI[av.llIIIIlllI[152]] = "Jump";
        av.llIIIIIllI[av.llIIIIlllI[153]] = "Jumping gap 4";
        av.llIIIIIllI[av.llIIIIlllI[154]] = "Jump";
        av.llIIIIIllI[av.llIIIIlllI[155]] = "Vaulting";
        av.llIIIIIllI[av.llIIIIlllI[156]] = "Vault";
        av.llIIIIIllI[av.llIIIIlllI[157]] = "Jumping gap 5";
        av.llIIIIIllI[av.llIIIIlllI[158]] = "Jump";
        av.llIIIIIllI[av.llIIIIlllI[159]] = "Jumping gap 6";
        av.llIIIIIllI[av.llIIIIlllI[160]] = "Jump";
        av.llIIIIIllI[av.llIIIIlllI[171]] = "Nav to canafis course";
        av.llIIIIIllI[av.llIIIIlllI[172]] = "Nav to start";
        av.llIIIIIllI[av.llIIIIlllI[173]] = "Starting course";
        av.llIIIIIllI[av.llIIIIlllI[174]] = "Wall";
        av.llIIIIIllI[av.llIIIIlllI[175]] = "Climb-up";
        av.llIIIIIllI[av.llIIIIlllI[35]] = "Mark of grace";
        av.llIIIIIllI[av.llIIIIlllI[176]] = "Taking mark";
        av.llIIIIIllI[av.llIIIIlllI[177]] = "Found mark on ground";
        av.llIIIIIllI[av.llIIIIlllI[178]] = "Take";
        av.llIIIIIllI[av.llIIIIlllI[179]] = "Jumping gap 1";
        av.llIIIIIllI[av.llIIIIlllI[180]] = "Jump";
        av.llIIIIIllI[av.llIIIIlllI[78]] = "cross rope";
        av.llIIIIIllI[av.llIIIIlllI[181]] = "Cross";
        av.llIIIIIllI[av.llIIIIlllI[182]] = "Jumping gap 3";
        av.llIIIIIllI[av.llIIIIlllI[183]] = "Jump";
        av.llIIIIIllI[av.llIIIIlllI[184]] = "Jumping gap 4";
        av.llIIIIIllI[av.llIIIIlllI[185]] = "Jump";
        av.llIIIIIllI[av.llIIIIlllI[186]] = "Jumping Edge";
        av.llIIIIIllI[av.llIIIIlllI[187]] = "Jump";
        av.llIIIIIllI[av.llIIIIlllI[193]] = "Found mark on ground";
        av.llIIIIIllI[av.llIIIIlllI[202]] = "Agility";
        av.llIIIIIllI[av.llIIIIlllI[203]] = "passage";
        av.llIIIIIllI[av.llIIIIlllI[204]] = "passage";
        av.llIIIIIllI[av.llIIIIlllI[205]] = "passage";
        av.llIIIIIllI[av.llIIIIlllI[206]] = "passage";
        av.llIIIIIllI[av.llIIIIlllI[207]] = "Edge";
        av.llIIIIIllI[av.llIIIIlllI[210]] = "Gap";
        av.llIIIIIllI[av.llIIIIlllI[212]] = "Gap";
        av.llIIIIIllI[av.llIIIIlllI[215]] = "Tightrope";
        av.llIIIIIllI[av.llIIIIlllI[217]] = "Gap";
        av.llIIIIIllI[av.llIIIIlllI[220]] = "Gap";
        av.llIIIIIllI[av.llIIIIlllI[223]] = "Gap";
        av.llIIIIIllI[av.llIIIIlllI[225]] = "Pole-vault";
        av.llIIIIIllI[av.llIIIIlllI[226]] = "Gap";
        av.llIIIIIllI[av.llIIIIlllI[229]] = "Gap";
        av.llIIIIIllI[av.llIIIIlllI[231]] = "Gap";
        av.llIIIIIllI[av.llIIIIlllI[232]] = "Gap";
        av.llIIIIIllI[av.llIIIIlllI[234]] = "pipe";
        av.llIIIIIllI[av.llIIIIlllI[237]] = "Squeeze-through";
    }

    public static void Q() {
        d var54;
        block18: {
            block17: {
                block16: {
                    block15: {
                        int[] nArray = new int[llIIIIlllI[1]];
                        nArray[av.llIIIIlllI[0]] = llIIIIlllI[15];
                        if (av.lIlIIlIIlllIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                            d d2 = new DHelper(llIIIIlllI[15], llIIIIlllI[1], llIIIIlllI[194]);
                            bv.add(d2);

                        }
                        int[] nArray2 = new int[llIIIIlllI[1]];
                        nArray2[av.llIIIIlllI[0]] = llIIIIlllI[17];
                        if (av.lIlIIlIIlllIl(Bank.contains((int[])nArray2) ? 1 : 0)) {
                            var54 = new DHelper(llIIIIlllI[17], llIIIIlllI[2], llIIIIlllI[195]);
                            bv.add(var54);

                        }
                        int[] nArray3 = new int[llIIIIlllI[1]];
                        nArray3[av.llIIIIlllI[0]] = llIIIIlllI[27];
                        if (av.lIlIIlIIlllIl(Bank.contains((int[])nArray3) ? 1 : 0)) {
                            var54 = new DHelper(llIIIIlllI[27], llIIIIlllI[2], llIIIIlllI[195]);
                            bv.add(var54);

                        }
                        int[] nArray4 = new int[llIIIIlllI[1]];
                        nArray4[av.llIIIIlllI[0]] = llIIIIlllI[12];
                        if (av.lIlIIlIIlllIl(Bank.contains((int[])nArray4) ? 1 : 0)) {
                            var54 = new DHelper(llIIIIlllI[12], llIIIIlllI[11], llIIIIlllI[196]);
                            bv.add(var54);

                        }
                        int[] nArray5 = new int[llIIIIlllI[1]];
                        nArray5[av.llIIIIlllI[0]] = llIIIIlllI[21];
                        if (av.lIlIIlIIlllIl(Bank.contains((int[])nArray5) ? 1 : 0)) {
                            var54 = new DHelper(llIIIIlllI[21], llIIIIlllI[11], llIIIIlllI[197]);
                            bv.add(var54);

                        }
                        int[] nArray6 = new int[llIIIIlllI[1]];
                        nArray6[av.llIIIIlllI[0]] = llIIIIlllI[14];
                        if (av.lIlIIlIIlllIl(Bank.contains((int[])nArray6) ? 1 : 0)) {
                            var54 = new DHelper(llIIIIlllI[14], llIIIIlllI[11], llIIIIlllI[197]);
                            bv.add(var54);

                        }
                        int[] nArray7 = new int[llIIIIlllI[1]];
                        nArray7[av.llIIIIlllI[0]] = llIIIIlllI[13];
                        if (av.lIlIIlIIlllIl(Bank.contains((int[])nArray7) ? 1 : 0)) {
                            var54 = new DHelper(llIIIIlllI[13], llIIIIlllI[11], llIIIIlllI[197]);
                            bv.add(var54);

                        }
                        int[] nArray8 = new int[llIIIIlllI[1]];
                        nArray8[av.llIIIIlllI[0]] = llIIIIlllI[23];
                        if (!av.lIlIIlIIllIll(Bank.contains((int[])nArray8) ? 1 : 0)) break block15;
                        int[] nArray9 = new int[llIIIIlllI[1]];
                        nArray9[av.llIIIIlllI[0]] = llIIIIlllI[23];
                        if (!av.lIlIIlIIllIll(Bank.contains((int[])nArray9) ? 1 : 0)) break block16;
                        int[] nArray10 = new int[llIIIIlllI[1]];
                        nArray10[av.llIIIIlllI[0]] = llIIIIlllI[23];
                        if (!av.lIlIIlIIlllII(Bank.getFirst((int[])nArray10).getQuantity(), llIIIIlllI[11])) break block16;
                    }
                    var54 = new DHelper(mU, llIIIIlllI[44], llIIIIlllI[198]);
                    bv.add(var54);

                }
                int[] nArray = new int[llIIIIlllI[1]];
                nArray[av.llIIIIlllI[0]] = llIIIIlllI[25];
                if (!av.lIlIIlIIllIll(Bank.contains((int[])nArray) ? 1 : 0)) break block17;
                int[] nArray11 = new int[llIIIIlllI[1]];
                nArray11[av.llIIIIlllI[0]] = llIIIIlllI[25];
                if (!av.lIlIIlIIllIll(Bank.contains((int[])nArray11) ? 1 : 0)) break block18;
                int[] nArray12 = new int[llIIIIlllI[1]];
                nArray12[av.llIIIIlllI[0]] = llIIIIlllI[25];
                if (!av.lIlIIlIIlllII(Bank.getFirst((int[])nArray12).getQuantity(), llIIIIlllI[11])) break block18;
            }
            var54 = new DHelper(llIIIIlllI[25], llIIIIlllI[11], llIIIIlllI[199]);
            bv.add(var54);

        }
        int[] nArray = new int[llIIIIlllI[1]];
        nArray[av.llIIIIlllI[0]] = llIIIIlllI[200];
        if (av.lIlIIlIIlllIl(Bank.contains((int[])nArray) ? 1 : 0)) {
            var54 = new DHelper(llIIIIlllI[200], llIIIIlllI[1], llIIIIlllI[201]);
            bv.add(var54);

        }
        int[] nArray13 = new int[llIIIIlllI[1]];
        nArray13[av.llIIIIlllI[0]] = llIIIIlllI[19];
        if (av.lIlIIlIIlllIl(Bank.contains((int[])nArray13) ? 1 : 0)) {
            var54 = new DHelper(llIIIIlllI[19], llIIIIlllI[40], j.cf);
            bv.add(var54);

        }
    }
}

