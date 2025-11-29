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
package gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks;

import gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks.AHelper;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.ab;
import gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks.BHelper;
import gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks.DHelper;
import gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks.EHelper;
import gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks.FHelper;
import gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks.JHelper;
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

public class ALHelper
implements ab {
    public static  boolean bv;
    
    public static  List<d> bx;
    public static  int lZ;
    static  WorldArea mb;
    static  WorldArea md;
    private static  WorldPoint me;
    public static  int ma;
    static  WorldArea mc;
    
    public static  int lY;

    private static boolean lIllIlIIlIlI(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIllIlIIIllI(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    private static void dW() {
        void lIIlIIlIIllIIl;
        void lIIlIIlIlIIIIl;
        void lIIlIIlIlIIIlI;
        void lIIlIIlIlIIIll;
        void lIIlIIlIlIIlII;
        WorldArea worldArea = new WorldArea(llIlIlIlI[125], llIlIlIlI[126], llIlIlIlI[112], llIlIlIlI[107], llIlIlIlI[0]);
        WorldArea worldArea2 = new WorldArea(llIlIlIlI[125], llIlIlIlI[126], llIlIlIlI[112], llIlIlIlI[107], llIlIlIlI[1]);
        WorldArea worldArea3 = new WorldArea(llIlIlIlI[125], llIlIlIlI[126], llIlIlIlI[112], llIlIlIlI[107], llIlIlIlI[2]);
        WorldArea worldArea4 = new WorldArea(llIlIlIlI[125], llIlIlIlI[126], llIlIlIlI[112], llIlIlIlI[107], llIlIlIlI[9]);
        WorldArea worldArea5 = new WorldArea(llIlIlIlI[127], llIlIlIlI[128], llIlIlIlI[49], llIlIlIlI[11], llIlIlIlI[2]);
        WorldArea worldArea6 = new WorldArea(llIlIlIlI[129], llIlIlIlI[127], llIlIlIlI[49], llIlIlIlI[24], llIlIlIlI[2]);
        WorldArea worldArea7 = new WorldArea(llIlIlIlI[130], llIlIlIlI[131], llIlIlIlI[63], llIlIlIlI[49], llIlIlIlI[2]);
        WorldArea worldArea8 = new WorldArea(llIlIlIlI[132], llIlIlIlI[133], llIlIlIlI[11], llIlIlIlI[64], llIlIlIlI[9]);
        WorldArea worldArea9 = new WorldArea(llIlIlIlI[134], llIlIlIlI[8], llIlIlIlI[49], llIlIlIlI[26], llIlIlIlI[2]);
        WorldArea worldArea10 = new WorldArea(llIlIlIlI[135], llIlIlIlI[136], llIlIlIlI[68], llIlIlIlI[53], llIlIlIlI[9]);
        WorldArea worldArea11 = new WorldArea(llIlIlIlI[137], llIlIlIlI[138], llIlIlIlI[63], llIlIlIlI[64], llIlIlIlI[2]);
        WorldPoint worldPoint = new WorldPoint(llIlIlIlI[137], llIlIlIlI[139], llIlIlIlI[0]);
        if (al.lIllIlIIIllI(Dialog.isOpen() ? 1 : 0)) {
            Dialog.close();
        }
        if (al.lIllIlIIlIII(lIIlIIlIlIIlII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && al.lIllIlIIlIII(lIIlIIlIlIIIll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && al.lIllIlIIlIII(lIIlIIlIlIIIlI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && al.lIllIlIIlIII(lIIlIIlIlIIIIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderGWD.c = llIlIlIIl[llIlIlIlI[44]];
            Movement.walkTo((WorldPoint)lIIlIIlIIllIIl);

            Time.sleepTicks((int)llIlIlIlI[1]);

        }
        if (al.lIllIlIIIllI(lIIlIIlIlIIlII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (al.lIllIlIIlIlI(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lIIlIIlIIllIIl), llIlIlIlI[20])) {
                AccBuilderGWD.c = llIlIlIIl[llIlIlIlI[140]];
                Movement.walkTo((WorldPoint)lIIlIIlIIllIIl);

                Time.sleepTicks((int)llIlIlIlI[1]);

            }
            if (al.lIllIlIIllll(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lIIlIIlIIllIIl), llIlIlIlI[20])) {
                AccBuilderGWD.c = llIlIlIIl[llIlIlIlI[5]];
                int lIIlIIlIIllIII = Skills.getExperience((Skill)Skill.AGILITY);
                String[] stringArray = new String[llIlIlIlI[1]];
                stringArray[al.llIlIlIlI[0]] = llIlIlIIl[llIlIlIlI[141]];
                TileObjects.getNearest((String[])stringArray).interact(llIlIlIIl[llIlIlIlI[142]]);
                Time.sleepTicks((int)e.c(llIlIlIlI[1], llIlIlIlI[2]));

                Time.sleepUntil(() -> {
                    boolean bl;
                    if (al.lIllIlIIlIlI(Skills.getExperience((Skill)Skill.AGILITY), lIIlIIlIIllIII)) {
                        bl = llIlIlIlI[1];

                        if (((0x24 ^ 0x3C) & ~(0x17 ^ 0xF)) >= 2) {
                            return false;
                        }
                    } else {
                        bl = llIlIlIlI[0];
                    }
                    return bl;
                }, (int)llIlIlIlI[103]);

                Time.sleepTicks((int)llIlIlIlI[1]);

            }
        }
        String[] stringArray = new String[llIlIlIlI[1]];
        stringArray[al.llIlIlIlI[0]] = llIlIlIIl[llIlIlIlI[143]];
        TileItem lIIlIIlIIllIII = TileItems.getNearest((String[])stringArray);
        if (al.lIllIlIIlIIl(lIIlIIlIIllIII) && al.lIllIlIIIllI(al.dY() ? 1 : 0)) {
            AccBuilderGWD.c = llIlIlIIl[llIlIlIlI[144]];
            System.out.println(llIlIlIIl[llIlIlIlI[145]]);
            lIIlIIlIIllIII.interact(llIlIlIIl[llIlIlIlI[146]]);
            Time.sleepTicks((int)llIlIlIlI[9]);

        }
        if (al.lIllIlIIlIII(al.dY() ? 1 : 0)) {
            void lIIlIIlIIllIlI;
            void lIIlIIlIIllIll;
            void lIIlIIlIIlllII;
            void lIIlIIlIIlllIl;
            void lIIlIIlIIllllI;
            void lIIlIIlIIlllll;
            int lIIlIIlIIlIllI;
            TileObject lIIlIIlIIlIlll;
            void lIIlIIlIlIIIII;
            if (al.lIllIlIIIllI(lIIlIIlIlIIIII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && al.lIllIlIIlIIl(lIIlIIlIIlIlll = TileObjects.getNearest(tileObject -> {
                int n2;
                if (al.lIllIlIIIllI(tileObject.getName().contains(llIlIlIIl[llIlIlIlI[232]]) ? 1 : 0) && al.lIllIlIIllll(tileObject.getWorldLocation().distanceTo(new WorldPoint(llIlIlIlI[233], llIlIlIlI[131], llIlIlIlI[2])), llIlIlIlI[2])) {
                    n2 = llIlIlIlI[1];

                    if (((0x1F ^ 0x32) & ~(0x4B ^ 0x66)) >= 2) {
                        return false;
                    }
                } else {
                    n2 = llIlIlIlI[0];
                }
                return n2 != 0;
            }))) {
                lIIlIIlIIlIllI = Skills.getExperience((Skill)Skill.AGILITY);
                AccBuilderGWD.c = llIlIlIIl[llIlIlIlI[147]];
                lIIlIIlIIlIlll.interact(llIlIlIIl[llIlIlIlI[148]]);
                Time.sleepTicks((int)e.c(llIlIlIlI[1], llIlIlIlI[2]));

                Time.sleepUntil(() -> {
                    boolean bl;
                    if (al.lIllIlIIlIlI(Skills.getExperience((Skill)Skill.AGILITY), lIIlIIlIIlIllI)) {
                        bl = llIlIlIlI[1];

                        if (3 <= 0) {
                            return false;
                        }
                    } else {
                        bl = llIlIlIlI[0];
                    }
                    return bl;
                }, (int)llIlIlIlI[103]);

                Time.sleepTicks((int)llIlIlIlI[1]);

            }
            if (al.lIllIlIIIllI(al.dY() ? 1 : 0)) {
                return;
            }
            if (al.lIllIlIIIllI(lIIlIIlIIlllll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && al.lIllIlIIlIIl(lIIlIIlIIlIlll = TileObjects.getNearest(tileObject -> {
                int n2;
                if (al.lIllIlIIIllI(tileObject.getName().contains(llIlIlIIl[llIlIlIlI[231]]) ? 1 : 0) && al.lIllIlIIllll(tileObject.getWorldLocation().distanceTo(new WorldPoint(llIlIlIlI[131], llIlIlIlI[224], llIlIlIlI[2])), llIlIlIlI[2])) {
                    n2 = llIlIlIlI[1];

                    if ((0x9D ^ 0xA5 ^ (0xAF ^ 0x93)) < 0) {
                        return ((31 + 53 - 32 + 97 ^ 63 + 7 - 37 + 166) & (0xBF ^ 0xAB ^ (0x3C ^ 0x7A) ^ -1)) != 0;
                    }
                } else {
                    n2 = llIlIlIlI[0];
                }
                return n2 != 0;
            }))) {
                AccBuilderGWD.c = llIlIlIIl[llIlIlIlI[149]];
                lIIlIIlIIlIllI = Skills.getExperience((Skill)Skill.AGILITY);
                lIIlIIlIIlIlll.interact(llIlIlIIl[llIlIlIlI[150]]);
                Time.sleepTicks((int)e.c(llIlIlIlI[1], llIlIlIlI[2]));

                Time.sleepUntil(() -> {
                    boolean bl;
                    if (al.lIllIlIIlIlI(Skills.getExperience((Skill)Skill.AGILITY), lIIlIIlIIlIllI)) {
                        bl = llIlIlIlI[1];

                        if (((15 + 81 - -33 + 99 ^ 56 + 44 - 46 + 112) & (0x66 ^ 0x61 ^ (0x3A ^ 0x7F) ^ -1)) != 0) {
                            return ((0x4B ^ 0x4F ^ (0x29 ^ 0x1D)) & (143 + 30 - 141 + 124 ^ 33 + 85 - 67 + 121 ^ -1)) != 0;
                        }
                    } else {
                        bl = llIlIlIlI[0];
                    }
                    return bl;
                }, (int)llIlIlIlI[103]);

                Time.sleepTicks((int)llIlIlIlI[1]);

            }
            if (al.lIllIlIIIllI(al.dY() ? 1 : 0)) {
                return;
            }
            if (al.lIllIlIIIllI(lIIlIIlIIllllI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && al.lIllIlIIlIIl(lIIlIIlIIlIlll = TileObjects.getNearest(tileObject -> {
                int n2;
                if (al.lIllIlIIIllI(tileObject.getName().contains(llIlIlIIl[llIlIlIlI[229]]) ? 1 : 0) && al.lIllIlIIllll(tileObject.getWorldLocation().distanceTo(new WorldPoint(llIlIlIlI[139], llIlIlIlI[230], llIlIlIlI[2])), llIlIlIlI[2])) {
                    n2 = llIlIlIlI[1];

                    if (3 <= 0) {
                        return ((126 + 65 - 86 + 22 ^ (0x50 ^ 0x1C)) & (0xBF ^ 0xB5 ^ (0x17 ^ 0x2E) ^ -1)) != 0;
                    }
                } else {
                    n2 = llIlIlIlI[0];
                }
                return n2 != 0;
            }))) {
                AccBuilderGWD.c = llIlIlIIl[llIlIlIlI[151]];
                lIIlIIlIIlIllI = Skills.getExperience((Skill)Skill.AGILITY);
                lIIlIIlIIlIlll.interact(llIlIlIIl[llIlIlIlI[152]]);
                Time.sleepTicks((int)e.c(llIlIlIlI[1], llIlIlIlI[2]));

                Time.sleepUntil(() -> {
                    boolean bl;
                    if (al.lIllIlIIlIlI(Skills.getExperience((Skill)Skill.AGILITY), lIIlIIlIIlIllI)) {
                        bl = llIlIlIlI[1];

                        }
                    } else {
                        bl = llIlIlIlI[0];
                    }
                    return bl;
                }, (int)llIlIlIlI[103]);

                Time.sleepTicks((int)llIlIlIlI[1]);

            }
            if (al.lIllIlIIIllI(al.dY() ? 1 : 0)) {
                return;
            }
            if (al.lIllIlIIIllI(lIIlIIlIIlllIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && al.lIllIlIIlIIl(lIIlIIlIIlIlll = TileObjects.getNearest(tileObject -> {
                int n2;
                if (al.lIllIlIIIllI(tileObject.getName().contains(llIlIlIIl[llIlIlIlI[226]]) ? 1 : 0) && al.lIllIlIIllll(tileObject.getWorldLocation().distanceTo(new WorldPoint(llIlIlIlI[227], llIlIlIlI[228], llIlIlIlI[9])), llIlIlIlI[2])) {
                    n2 = llIlIlIlI[1];

                    if ((0x86 ^ 0x82) != (0x4A ^ 0x4E)) {
                        return false;
                    }
                } else {
                    n2 = llIlIlIlI[0];
                }
                return n2 != 0;
            }))) {
                AccBuilderGWD.c = llIlIlIIl[llIlIlIlI[153]];
                lIIlIIlIIlIllI = Skills.getExperience((Skill)Skill.AGILITY);
                lIIlIIlIIlIlll.interact(llIlIlIIl[llIlIlIlI[154]]);
                Time.sleepTicks((int)e.c(llIlIlIlI[1], llIlIlIlI[2]));

                Time.sleepUntil(() -> {
                    boolean bl;
                    if (al.lIllIlIIlIlI(Skills.getExperience((Skill)Skill.AGILITY), lIIlIIlIIlIllI)) {
                        bl = llIlIlIlI[1];

                        if (((109 + 204 - 211 + 133 ^ 51 + 79 - 26 + 81) & (103 + 13 - 72 + 197 ^ 131 + 6 - 122 + 148 ^ -1)) > 2) {
                            return ((0xB1 ^ 0x9D ^ (0x72 ^ 0x7C)) & (0x63 ^ 0x2E ^ (0xC8 ^ 0xA7) ^ -1)) != 0;
                        }
                    } else {
                        bl = llIlIlIlI[0];
                    }
                    return bl;
                }, (int)llIlIlIlI[103]);

                Time.sleepTicks((int)llIlIlIlI[1]);

            }
            if (al.lIllIlIIIllI(al.dY() ? 1 : 0)) {
                return;
            }
            if (al.lIllIlIIIllI(lIIlIIlIIlllII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && al.lIllIlIIlIIl(lIIlIIlIIlIlll = TileObjects.getNearest(tileObject -> {
                int n2;
                if (al.lIllIlIIIllI(tileObject.getName().contains(llIlIlIIl[llIlIlIlI[225]]) ? 1 : 0) && al.lIllIlIIllll(tileObject.getWorldLocation().distanceTo(new WorldPoint(llIlIlIlI[8], llIlIlIlI[130], llIlIlIlI[2])), llIlIlIlI[2])) {
                    n2 = llIlIlIlI[1];

                    if (((0x85 ^ 0xB1) & ~(0xBF ^ 0x8B)) != 0) {
                        return (3 & ~3) != 0;
                    }
                } else {
                    n2 = llIlIlIlI[0];
                }
                return n2 != 0;
            }))) {
                AccBuilderGWD.c = llIlIlIIl[llIlIlIlI[155]];
                lIIlIIlIIlIllI = Skills.getExperience((Skill)Skill.AGILITY);
                lIIlIIlIIlIlll.interact(llIlIlIIl[llIlIlIlI[156]]);
                Time.sleepTicks((int)e.c(llIlIlIlI[1], llIlIlIlI[2]));

                Time.sleepUntil(() -> {
                    boolean bl;
                    if (al.lIllIlIIlIlI(Skills.getExperience((Skill)Skill.AGILITY), lIIlIIlIIlIllI)) {
                        bl = llIlIlIlI[1];

                        if (2 == 0) {
                            return ((110 + 129 - 207 + 148 ^ 140 + 130 - 250 + 131) & (0x17 ^ 0x1F ^ (0x68 ^ 0x43) ^ -1)) != 0;
                        }
                    } else {
                        bl = llIlIlIlI[0];
                    }
                    return bl;
                }, (int)llIlIlIlI[103]);

                Time.sleepTicks((int)llIlIlIlI[1]);

            }
            if (al.lIllIlIIIllI(al.dY() ? 1 : 0)) {
                return;
            }
            if (al.lIllIlIIIllI(lIIlIIlIIllIll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && al.lIllIlIIlIIl(lIIlIIlIIlIlll = TileObjects.getNearest(tileObject -> {
                int n2;
                if (al.lIllIlIIIllI(tileObject.getName().contains(llIlIlIIl[llIlIlIlI[223]]) ? 1 : 0) && al.lIllIlIIllll(tileObject.getWorldLocation().distanceTo(new WorldPoint(llIlIlIlI[224], llIlIlIlI[214], llIlIlIlI[9])), llIlIlIlI[2])) {
                    n2 = llIlIlIlI[1];

                    if (((0xFC ^ 0xB8) & ~(0x5C ^ 0x18)) > 0) {
                        return (1 & ~1) != 0;
                    }
                } else {
                    n2 = llIlIlIlI[0];
                }
                return n2 != 0;
            }))) {
                AccBuilderGWD.c = llIlIlIIl[llIlIlIlI[157]];
                lIIlIIlIIlIllI = Skills.getExperience((Skill)Skill.AGILITY);
                lIIlIIlIIlIlll.interact(llIlIlIIl[llIlIlIlI[158]]);
                Time.sleepTicks((int)e.c(llIlIlIlI[1], llIlIlIlI[2]));

                Time.sleepUntil(() -> {
                    boolean bl;
                    if (al.lIllIlIIlIlI(Skills.getExperience((Skill)Skill.AGILITY), lIIlIIlIIlIllI)) {
                        bl = llIlIlIlI[1];

                        if (-(31 + 145 - 167 + 161 ^ 19 + 31 - -75 + 49) >= 0) {
                            return ((70 + 101 - 88 + 105 ^ 38 + 72 - 40 + 66) & (0x95 ^ 0x82 ^ (0x7A ^ 0x59) ^ -1)) != 0;
                        }
                    } else {
                        bl = llIlIlIlI[0];
                    }
                    return bl;
                }, (int)llIlIlIlI[103]);

                Time.sleepTicks((int)llIlIlIlI[1]);

            }
            if (al.lIllIlIIIllI(al.dY() ? 1 : 0)) {
                return;
            }
            if (al.lIllIlIIIllI(lIIlIIlIIllIlI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && al.lIllIlIIlIIl(lIIlIIlIIlIlll = TileObjects.getNearest(tileObject -> {
                int n2;
                if (al.lIllIlIIIllI(tileObject.getName().contains(llIlIlIIl[llIlIlIlI[220]]) ? 1 : 0) && al.lIllIlIIllll(tileObject.getWorldLocation().distanceTo(new WorldPoint(llIlIlIlI[221], llIlIlIlI[222], llIlIlIlI[2])), llIlIlIlI[2])) {
                    n2 = llIlIlIlI[1];

                    if (1 < 0) {
                        return false;
                    }
                } else {
                    n2 = llIlIlIlI[0];
                }
                return n2 != 0;
            }))) {
                AccBuilderGWD.c = llIlIlIIl[llIlIlIlI[159]];
                lIIlIIlIIlIllI = Skills.getExperience((Skill)Skill.AGILITY);
                lIIlIIlIIlIlll.interact(llIlIlIIl[llIlIlIlI[160]]);
                Time.sleepTicks((int)e.c(llIlIlIlI[1], llIlIlIlI[2]));

                Time.sleepUntil(() -> {
                    boolean bl;
                    if (al.lIllIlIIlIlI(Skills.getExperience((Skill)Skill.AGILITY), lIIlIIlIIlIllI)) {
                        bl = llIlIlIlI[1];

                    } else {
                        bl = llIlIlIlI[0];
                    }
                    return bl;
                }, (int)llIlIlIlI[103]);

                Time.sleepTicks((int)llIlIlIlI[1]);

            }
        }
    }

    /*
     * WARNING - void declaration
     */
    private static void dX() {
        void lIIlIIIlllllll;
        void lIIlIIlIIIIlIl;
        void lIIlIIlIIIIllI;
        void lIIlIIlIIIIlll;
        void lIIlIIlIIIlIII;
        WorldArea worldArea = new WorldArea(llIlIlIlI[161], llIlIlIlI[162], llIlIlIlI[111], llIlIlIlI[111], llIlIlIlI[0]);
        WorldArea worldArea2 = new WorldArea(llIlIlIlI[161], llIlIlIlI[162], llIlIlIlI[111], llIlIlIlI[111], llIlIlIlI[1]);
        WorldArea worldArea3 = new WorldArea(llIlIlIlI[161], llIlIlIlI[162], llIlIlIlI[111], llIlIlIlI[111], llIlIlIlI[2]);
        WorldArea worldArea4 = new WorldArea(llIlIlIlI[161], llIlIlIlI[162], llIlIlIlI[111], llIlIlIlI[111], llIlIlIlI[9]);
        WorldArea worldArea5 = new WorldArea(llIlIlIlI[163], llIlIlIlI[133], llIlIlIlI[64], llIlIlIlI[11], llIlIlIlI[9]);
        WorldArea worldArea6 = new WorldArea(llIlIlIlI[164], llIlIlIlI[139], llIlIlIlI[38], llIlIlIlI[53], llIlIlIlI[2]);
        WorldArea worldArea7 = new WorldArea(llIlIlIlI[165], llIlIlIlI[134], llIlIlIlI[49], llIlIlIlI[26], llIlIlIlI[2]);
        WorldArea worldArea8 = new WorldArea(llIlIlIlI[166], llIlIlIlI[136], llIlIlIlI[70], llIlIlIlI[64], llIlIlIlI[9]);
        WorldArea worldArea9 = new WorldArea(llIlIlIlI[167], llIlIlIlI[168], llIlIlIlI[54], llIlIlIlI[63], llIlIlIlI[2]);
        WorldPoint worldPoint = new WorldPoint(llIlIlIlI[169], llIlIlIlI[170], llIlIlIlI[0]);
        if (al.lIllIlIIIllI(Dialog.isOpen() ? 1 : 0)) {
            Dialog.close();
        }
        if (al.lIllIlIIlIII(lIIlIIlIIIlIII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && al.lIllIlIIlIII(lIIlIIlIIIIlll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && al.lIllIlIIlIII(lIIlIIlIIIIllI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && al.lIllIlIIlIII(lIIlIIlIIIIlIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderGWD.c = llIlIlIIl[llIlIlIlI[171]];
            Movement.walkTo((WorldPoint)lIIlIIIlllllll);

            Time.sleepTicks((int)llIlIlIlI[1]);

        }
        if (al.lIllIlIIIllI(lIIlIIlIIIlIII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (al.lIllIlIIlIlI(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lIIlIIIlllllll), llIlIlIlI[20])) {
                AccBuilderGWD.c = llIlIlIIl[llIlIlIlI[172]];
                Movement.walkTo((WorldPoint)lIIlIIIlllllll);

                Time.sleepTicks((int)llIlIlIlI[1]);

            }
            if (al.lIllIlIIllll(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lIIlIIIlllllll), llIlIlIlI[20])) {
                AccBuilderGWD.c = llIlIlIIl[llIlIlIlI[173]];
                int lIIlIIIllllllI = Skills.getExperience((Skill)Skill.AGILITY);
                String[] stringArray = new String[llIlIlIlI[1]];
                stringArray[al.llIlIlIlI[0]] = llIlIlIIl[llIlIlIlI[174]];
                TileObjects.getNearest((String[])stringArray).interact(llIlIlIIl[llIlIlIlI[175]]);
                Time.sleepTicks((int)e.c(llIlIlIlI[1], llIlIlIlI[2]));

                Time.sleepUntil(() -> {
                    boolean bl;
                    if (al.lIllIlIIlIlI(Skills.getExperience((Skill)Skill.AGILITY), lIIlIIIllllllI)) {
                        bl = llIlIlIlI[1];

                        if (-1 > 3) {
                            return false;
                        }
                    } else {
                        bl = llIlIlIlI[0];
                    }
                    return bl;
                }, (int)llIlIlIlI[103]);

                Time.sleepTicks((int)llIlIlIlI[1]);

            }
        }
        String[] stringArray = new String[llIlIlIlI[1]];
        stringArray[al.llIlIlIlI[0]] = llIlIlIIl[llIlIlIlI[35]];
        TileItem lIIlIIIllllllI = TileItems.getNearest((String[])stringArray);
        if (al.lIllIlIIlIIl(lIIlIIIllllllI) && al.lIllIlIIIllI(al.dY() ? 1 : 0)) {
            AccBuilderGWD.c = llIlIlIIl[llIlIlIlI[176]];
            System.out.println(llIlIlIIl[llIlIlIlI[177]]);
            lIIlIIIllllllI.interact(llIlIlIIl[llIlIlIlI[178]]);
            Time.sleepTicks((int)llIlIlIlI[9]);

        }
        if (al.lIllIlIIlIII(al.dY() ? 1 : 0)) {
            void lIIlIIlIIIIIII;
            void lIIlIIlIIIIIIl;
            void lIIlIIlIIIIIlI;
            void lIIlIIlIIIIIll;
            int lIIlIIIlllllII;
            TileObject lIIlIIIlllllIl;
            void lIIlIIlIIIIlII;
            if (al.lIllIlIIIllI(lIIlIIlIIIIlII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && al.lIllIlIIlIIl(lIIlIIIlllllIl = TileObjects.getNearest(tileObject -> {
                int n2;
                if (al.lIllIlIIIllI(tileObject.getName().contains(llIlIlIIl[llIlIlIlI[217]]) ? 1 : 0) && al.lIllIlIIllll(tileObject.getWorldLocation().distanceTo(new WorldPoint(llIlIlIlI[218], llIlIlIlI[219], llIlIlIlI[9])), llIlIlIlI[2])) {
                    n2 = llIlIlIlI[1];

                    if (((0x6F ^ 0x3A) & ~(0x70 ^ 0x25)) != 0) {
                        return false;
                    }
                } else {
                    n2 = llIlIlIlI[0];
                }
                return n2 != 0;
            }))) {
                lIIlIIIlllllII = Skills.getExperience((Skill)Skill.AGILITY);
                AccBuilderGWD.c = llIlIlIIl[llIlIlIlI[179]];
                lIIlIIIlllllIl.interact(llIlIlIIl[llIlIlIlI[180]]);
                Time.sleepTicks((int)e.c(llIlIlIlI[1], llIlIlIlI[2]));

                Time.sleepUntil(() -> {
                    boolean bl;
                    if (al.lIllIlIIlIlI(Skills.getExperience((Skill)Skill.AGILITY), lIIlIIIlllllII)) {
                        bl = llIlIlIlI[1];

                        if (2 == ((0x51 ^ 0x40 ^ (0x26 ^ 0x1B)) & (0x4E ^ 0x44 ^ (0x68 ^ 0x4E) ^ -1))) {
                            return ((0x69 ^ 0x42 ^ (3 ^ 6)) & (91 + 41 - 55 + 63 ^ 143 + 18 - 36 + 37 ^ -1)) != 0;
                        }
                    } else {
                        bl = llIlIlIlI[0];
                    }
                    return bl;
                }, (int)llIlIlIlI[103]);

                Time.sleepTicks((int)llIlIlIlI[1]);

            }
            if (al.lIllIlIIIllI(al.dY() ? 1 : 0)) {
                return;
            }
            if (al.lIllIlIIIllI(lIIlIIlIIIIIll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && al.lIllIlIIlIIl(lIIlIIIlllllIl = TileObjects.getNearest(tileObject -> {
                int n2;
                if (al.lIllIlIIIllI(tileObject.getName().contains(llIlIlIIl[llIlIlIlI[215]]) ? 1 : 0) && al.lIllIlIIllll(tileObject.getWorldLocation().distanceTo(new WorldPoint(llIlIlIlI[216], llIlIlIlI[128], llIlIlIlI[2])), llIlIlIlI[2])) {
                    n2 = llIlIlIlI[1];

                    if (-1 > 1) {
                        return false;
                    }
                } else {
                    n2 = llIlIlIlI[0];
                }
                return n2 != 0;
            }))) {
                AccBuilderGWD.c = llIlIlIIl[llIlIlIlI[78]];
                lIIlIIIlllllII = Skills.getExperience((Skill)Skill.AGILITY);
                lIIlIIIlllllIl.interact(llIlIlIIl[llIlIlIlI[181]]);
                Time.sleepTicks((int)e.c(llIlIlIlI[1], llIlIlIlI[2]));

                Time.sleepUntil(() -> {
                    boolean bl;
                    if (al.lIllIlIIlIlI(Skills.getExperience((Skill)Skill.AGILITY), lIIlIIIlllllII)) {
                        bl = llIlIlIlI[1];

                        if (((0xCF ^ 0xA5 ^ (0x47 ^ 0x16)) & (0x34 ^ 0x43 ^ (0xD7 ^ 0x9B) ^ -1)) != ((0x17 ^ 0x5E ^ (0x50 ^ 0x47)) & (0x78 ^ 0 ^ (0x24 ^ 2) ^ -1))) {
                            return ((0x11 ^ 0x2C ^ (0xF ^ 0x69)) & (181 + 102 - 98 + 59 ^ 135 + 96 - 131 + 75 ^ -1)) != 0;
                        }
                    } else {
                        bl = llIlIlIlI[0];
                    }
                    return bl;
                }, (int)llIlIlIlI[103]);

                Time.sleepTicks((int)llIlIlIlI[1]);

            }
            if (al.lIllIlIIIllI(al.dY() ? 1 : 0)) {
                return;
            }
            if (al.lIllIlIIIllI(lIIlIIlIIIIIlI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && al.lIllIlIIlIIl(lIIlIIIlllllIl = TileObjects.getNearest(tileObject -> {
                int n2;
                if (al.lIllIlIIIllI(tileObject.getName().contains(llIlIlIIl[llIlIlIlI[212]]) ? 1 : 0) && al.lIllIlIIllll(tileObject.getWorldLocation().distanceTo(new WorldPoint(llIlIlIlI[213], llIlIlIlI[214], llIlIlIlI[2])), llIlIlIlI[2])) {
                    n2 = llIlIlIlI[1];

                    if (1 <= ((46 + 123 - 106 + 77 ^ 10 + 75 - -4 + 46) & (0xE9 ^ 0xBA ^ (0x19 ^ 0x41) ^ -1))) {
                        return ((0xA4 ^ 0x89 ^ (0xAC ^ 0x9F)) & (0x67 ^ 0x4B ^ (0x36 ^ 4) ^ -1)) != 0;
                    }
                } else {
                    n2 = llIlIlIlI[0];
                }
                return n2 != 0;
            }))) {
                AccBuilderGWD.c = llIlIlIIl[llIlIlIlI[182]];
                lIIlIIIlllllII = Skills.getExperience((Skill)Skill.AGILITY);
                lIIlIIIlllllIl.interact(llIlIlIIl[llIlIlIlI[183]]);
                Time.sleepTicks((int)e.c(llIlIlIlI[1], llIlIlIlI[2]));

                Time.sleepUntil(() -> {
                    boolean bl;
                    if (al.lIllIlIIlIlI(Skills.getExperience((Skill)Skill.AGILITY), lIIlIIIlllllII)) {
                        bl = llIlIlIlI[1];

                    } else {
                        bl = llIlIlIlI[0];
                    }
                    return bl;
                }, (int)llIlIlIlI[103]);

                Time.sleepTicks((int)llIlIlIlI[1]);

            }
            if (al.lIllIlIIIllI(al.dY() ? 1 : 0)) {
                return;
            }
            if (al.lIllIlIIIllI(lIIlIIlIIIIIIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && al.lIllIlIIlIIl(lIIlIIIlllllIl = TileObjects.getNearest(tileObject -> {
                int n2;
                if (al.lIllIlIIIllI(tileObject.getName().contains(llIlIlIIl[llIlIlIlI[210]]) ? 1 : 0) && al.lIllIlIIllll(tileObject.getWorldLocation().distanceTo(new WorldPoint(llIlIlIlI[208], llIlIlIlI[211], llIlIlIlI[9])), llIlIlIlI[2])) {
                    n2 = llIlIlIlI[1];

                    }
                } else {
                    n2 = llIlIlIlI[0];
                }
                return n2 != 0;
            }))) {
                AccBuilderGWD.c = llIlIlIIl[llIlIlIlI[184]];
                lIIlIIIlllllII = Skills.getExperience((Skill)Skill.AGILITY);
                lIIlIIIlllllIl.interact(llIlIlIIl[llIlIlIlI[185]]);
                Time.sleepTicks((int)e.c(llIlIlIlI[1], llIlIlIlI[2]));

                Time.sleepUntil(() -> {
                    boolean bl;
                    if (al.lIllIlIIlIlI(Skills.getExperience((Skill)Skill.AGILITY), lIIlIIIlllllII)) {
                        bl = llIlIlIlI[1];

                        if (-1 >= 2) {
                            return false;
                        }
                    } else {
                        bl = llIlIlIlI[0];
                    }
                    return bl;
                }, (int)llIlIlIlI[103]);

                Time.sleepTicks((int)llIlIlIlI[1]);

            }
            if (al.lIllIlIIIllI(al.dY() ? 1 : 0)) {
                return;
            }
            if (al.lIllIlIIIllI(lIIlIIlIIIIIII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && al.lIllIlIIlIIl(lIIlIIIlllllIl = TileObjects.getNearest(tileObject -> {
                int n2;
                if (al.lIllIlIIIllI(tileObject.getName().contains(llIlIlIIl[llIlIlIlI[207]]) ? 1 : 0) && al.lIllIlIIllll(tileObject.getWorldLocation().distanceTo(new WorldPoint(llIlIlIlI[208], llIlIlIlI[209], llIlIlIlI[2])), llIlIlIlI[2])) {
                    n2 = llIlIlIlI[1];

                } else {
                    n2 = llIlIlIlI[0];
                }
                return n2 != 0;
            }))) {
                AccBuilderGWD.c = llIlIlIIl[llIlIlIlI[186]];
                lIIlIIIlllllII = Skills.getExperience((Skill)Skill.AGILITY);
                lIIlIIIlllllIl.interact(llIlIlIIl[llIlIlIlI[187]]);
                Time.sleepTicks((int)e.c(llIlIlIlI[1], llIlIlIlI[2]));

                Time.sleepUntil(() -> {
                    boolean bl;
                    if (al.lIllIlIIlIlI(Skills.getExperience((Skill)Skill.AGILITY), lIIlIIIlllllII)) {
                        bl = llIlIlIlI[1];

                        }
                    } else {
                        bl = llIlIlIlI[0];
                    }
                    return bl;
                }, (int)llIlIlIlI[103]);

                Time.sleepTicks((int)llIlIlIlI[1]);

            }
        }
    }

    public static void dT() {
        if (al.lIllIlIIIllI(bv ? 1 : 0)) {
            AccBuilderGWD.c = llIlIlIIl[llIlIlIlI[0]];
            b.a(bx);
            if (al.lIllIlIIIlll(bx.size(), llIlIlIlI[1])) {
                System.out.println(llIlIlIIl[llIlIlIlI[1]]);
                bv = llIlIlIlI[0];
            }
        }
        if (al.lIllIlIIlIII(bv ? 1 : 0)) {
            if (al.lIllIlIIlIII(al.an() ? 1 : 0)) {
                BankLocation lIIlIIlllIIlII = BankLocation.getNearest();
                if (al.lIllIlIIlIIl(lIIlIIlllIIlII) && al.lIllIlIIlIII(lIIlIIlllIIlII.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderGWD.c = llIlIlIIl[llIlIlIlI[2]];
                    WorldArea lIIlIIlllIIIll = new WorldArea(llIlIlIlI[3], llIlIlIlI[4], llIlIlIlI[5], llIlIlIlI[6], llIlIlIlI[0]);
                    if (al.lIllIlIIIllI(lIIlIIlllIIIll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        WorldPoint lIIlIIlllIIIlI = new WorldPoint(llIlIlIlI[7], llIlIlIlI[8], llIlIlIlI[0]);
                        if (al.lIllIlIIlIlI(Players.getLocal().getWorldLocation().distanceTo(lIIlIIlllIIIlI), llIlIlIlI[9])) {
                            Movement.walkTo((WorldPoint)lIIlIIlllIIIlI);

                            Time.sleepTicks((int)llIlIlIlI[1]);

                        }
                    }
                    a.a(lIIlIIlllIIlII);
                }
                if (al.lIllIlIIlIIl(lIIlIIlllIIlII) && al.lIllIlIIIllI(lIIlIIlllIIlII.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderGWD.c = llIlIlIIl[llIlIlIlI[9]];
                    if (al.lIllIlIIlIII(Bank.isOpen() ? 1 : 0)) {
                        a.a();
                        Time.sleepUntil(() -> Bank.isOpen(), (int)llIlIlIlI[10]);

                    }
                    if (al.lIllIlIIIllI(Bank.isOpen() ? 1 : 0)) {
                        if (al.lIllIlIIlIll(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks((int)llIlIlIlI[1]);

                        }
                        if (al.lIllIlIIlIll(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks((int)llIlIlIlI[2]);

                        }
                    }
                    int[] nArray = new int[llIlIlIlI[11]];
                    nArray[al.llIlIlIlI[0]] = llIlIlIlI[12];
                    nArray[al.llIlIlIlI[1]] = llIlIlIlI[13];
                    nArray[al.llIlIlIlI[2]] = llIlIlIlI[14];
                    nArray[al.llIlIlIlI[9]] = llIlIlIlI[15];
                    nArray[al.llIlIlIlI[16]] = llIlIlIlI[17];
                    nArray[al.llIlIlIlI[18]] = llIlIlIlI[19];
                    nArray[al.llIlIlIlI[20]] = llIlIlIlI[21];
                    nArray[al.llIlIlIlI[22]] = llIlIlIlI[23];
                    nArray[al.llIlIlIlI[24]] = llIlIlIlI[25];
                    nArray[al.llIlIlIlI[26]] = llIlIlIlI[27];
                    if (al.lIllIlIIlIII(e.d(nArray) ? 1 : 0)) {
                        al.Q();
                        System.out.println(llIlIlIIl[llIlIlIlI[16]]);
                        bv = llIlIlIlI[1];
                        return;
                    }
                    int[] nArray2 = new int[llIlIlIlI[11]];
                    nArray2[al.llIlIlIlI[0]] = llIlIlIlI[12];
                    nArray2[al.llIlIlIlI[1]] = llIlIlIlI[13];
                    nArray2[al.llIlIlIlI[2]] = llIlIlIlI[14];
                    nArray2[al.llIlIlIlI[9]] = llIlIlIlI[15];
                    nArray2[al.llIlIlIlI[16]] = llIlIlIlI[17];
                    nArray2[al.llIlIlIlI[18]] = llIlIlIlI[19];
                    nArray2[al.llIlIlIlI[20]] = llIlIlIlI[21];
                    nArray2[al.llIlIlIlI[22]] = llIlIlIlI[23];
                    nArray2[al.llIlIlIlI[24]] = llIlIlIlI[25];
                    nArray2[al.llIlIlIlI[26]] = llIlIlIlI[27];
                    if (al.lIllIlIIIllI(e.d(nArray2) ? 1 : 0)) {
                        a.a(llIlIlIlI[28], llIlIlIlI[1]);
                        a.a(llIlIlIlI[29], llIlIlIlI[1]);
                        a.a(llIlIlIlI[30], llIlIlIlI[1]);
                        a.a(llIlIlIlI[31], llIlIlIlI[1]);
                        a.a(llIlIlIlI[32], llIlIlIlI[1]);
                        a.a(llIlIlIlI[33], llIlIlIlI[1]);
                        a.a(llIlIlIlI[34], llIlIlIlI[1]);
                        int[] nArray3 = new int[llIlIlIlI[1]];
                        nArray3[al.llIlIlIlI[0]] = llIlIlIlI[28];
                        if (al.lIllIlIIlIII(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                            int[] nArray4 = new int[llIlIlIlI[1]];
                            nArray4[al.llIlIlIlI[0]] = llIlIlIlI[28];
                            if (al.lIllIlIIlIII(Equipment.contains((int[])nArray4) ? 1 : 0)) {
                                int[] nArray5 = new int[llIlIlIlI[1]];
                                nArray5[al.llIlIlIlI[0]] = llIlIlIlI[28];
                                if (al.lIllIlIIlIII(Bank.contains((int[])nArray5) ? 1 : 0)) {
                                    a.a(llIlIlIlI[35], llIlIlIlI[1]);
                                }
                            }
                        }
                        a.a(llIlIlIlI[17], llIlIlIlI[1]);
                        e.l(llIlIlIlI[28]);
                        e.l(llIlIlIlI[29]);
                        e.l(llIlIlIlI[30]);
                        e.l(llIlIlIlI[31]);
                        e.l(llIlIlIlI[32]);
                        Time.sleepTicks((int)llIlIlIlI[1]);

                        e.l(llIlIlIlI[34]);
                        e.l(llIlIlIlI[36]);
                        e.l(llIlIlIlI[33]);
                        e.l(llIlIlIlI[35]);
                        e.l(llIlIlIlI[17]);
                        Time.sleepTicks((int)llIlIlIlI[9]);

                        if (al.lIllIlIIlIII(Bank.isOpen() ? 1 : 0)) {
                            a.a();
                            Time.sleepTicks((int)llIlIlIlI[20]);

                        }
                        if (al.lIllIlIIIllI(Bank.isOpen() ? 1 : 0)) {
                            if (al.lIllIlIIIlll(Skills.getLevel((Skill)Skill.AGILITY), llIlIlIlI[37])) {
                                a.a(llIlIlIlI[12], llIlIlIlI[11]);
                                a.a(llIlIlIlI[13], llIlIlIlI[11]);
                                a.a(llIlIlIlI[21], llIlIlIlI[11]);
                                a.a(llIlIlIlI[14], llIlIlIlI[11]);
                                a.b(f.bm, llIlIlIlI[1]);
                                a.a(llIlIlIlI[27], llIlIlIlI[1]);
                                a.a(llIlIlIlI[19], llIlIlIlI[18]);
                                a.a(llIlIlIlI[23], llIlIlIlI[38]);
                            }
                            if (al.lIllIlIIllII(Skills.getLevel((Skill)Skill.AGILITY), llIlIlIlI[37])) {
                                a.a(llIlIlIlI[12], llIlIlIlI[11]);
                                a.a(llIlIlIlI[21], llIlIlIlI[11]);
                                a.a(llIlIlIlI[25], llIlIlIlI[11]);
                                a.b(f.bm, llIlIlIlI[1]);
                                a.a(llIlIlIlI[27], llIlIlIlI[1]);
                                a.a(llIlIlIlI[19], llIlIlIlI[24]);
                                a.a(llIlIlIlI[23], llIlIlIlI[11]);
                            }
                        }
                    }
                }
            }
            if (al.lIllIlIIIllI(al.an() ? 1 : 0)) {
                String[] stringArray = new String[llIlIlIlI[1]];
                stringArray[al.llIlIlIlI[0]] = llIlIlIIl[llIlIlIlI[18]];
                if (al.lIllIlIIIllI(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    String[] stringArray2 = new String[llIlIlIlI[1]];
                    stringArray2[al.llIlIlIlI[0]] = llIlIlIIl[llIlIlIlI[20]];
                    Inventory.getFirst((String[])stringArray2).interact(llIlIlIIl[llIlIlIlI[22]]);
                }
                if (al.lIllIlIIIllI(Inventory.contains((int[])f.bc) ? 1 : 0) && al.lIllIlIIIlll(Movement.getRunEnergy(), llIlIlIlI[39])) {
                    Inventory.getFirst((int[])f.bc).interact(llIlIlIIl[llIlIlIlI[24]]);
                    Time.sleepTicks((int)llIlIlIlI[1]);

                }
                if (al.lIllIlIIlIlI(Combat.getMissingHealth(), llIlIlIlI[40])) {
                    int[] nArray = new int[llIlIlIlI[1]];
                    nArray[al.llIlIlIlI[0]] = llIlIlIlI[23];
                    if (al.lIllIlIIIllI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        int[] nArray6 = new int[llIlIlIlI[1]];
                        nArray6[al.llIlIlIlI[0]] = llIlIlIlI[23];
                        Inventory.getFirst((int[])nArray6).interact(llIlIlIIl[llIlIlIlI[26]]);
                        Time.sleepTicks((int)llIlIlIlI[2]);

                    }
                }
                if (al.lIllIlIIlIlI(Movement.getRunEnergy(), llIlIlIlI[41]) && al.lIllIlIIlIII(Movement.isRunEnabled() ? 1 : 0)) {
                    Movement.toggleRun();
                }
                if (al.lIllIlIIIlll(Skills.getLevel((Skill)Skill.AGILITY), llIlIlIlI[42])) {
                    al.dU();
                }
                if ((!al.lIllIlIIllII(e.j(llIlIlIlI[43]), llIlIlIlI[44]) || al.lIllIlIIIlll(e.j(llIlIlIlI[45]), llIlIlIlI[18])) && al.lIllIlIIllII(Skills.getLevel((Skill)Skill.AGILITY), llIlIlIlI[42]) && al.lIllIlIIIlll(Skills.getLevel((Skill)Skill.AGILITY), llIlIlIlI[44])) {
                    al.dV();
                }
                if (al.lIllIlIIllII(e.j(llIlIlIlI[43]), llIlIlIlI[44]) && al.lIllIlIIllII(e.j(llIlIlIlI[45]), llIlIlIlI[18])) {
                    if (al.lIllIlIIllII(Skills.getLevel((Skill)Skill.AGILITY), llIlIlIlI[42]) && al.lIllIlIIIlll(Skills.getLevel((Skill)Skill.AGILITY), llIlIlIlI[37])) {
                        al.dV();
                    }
                    if (al.lIllIlIIllII(Skills.getLevel((Skill)Skill.AGILITY), llIlIlIlI[37]) && al.lIllIlIIIlll(Skills.getLevel((Skill)Skill.AGILITY), llIlIlIlI[44])) {
                        al.dW();
                    }
                }
                if (al.lIllIlIIllII(Skills.getLevel((Skill)Skill.AGILITY), llIlIlIlI[44])) {
                    al.dX();
                }
            }
        }
    }

    @Override
    public boolean ae() {
        return llIlIlIlI[0];
    }

    @Override
    public int af() {
        try {
            al.dT();

        }
        catch (Exception exception) {
            // empty catch block
        }
        if (((0x6B ^ 0x62) & ~(0x8E ^ 0x87)) != ((0xFB ^ 0xB7) & ~(0x88 ^ 0xC4))) {
            return (0xDD ^ 0x87) & ~(0x72 ^ 0x28);
        }
        return llIlIlIlI[186];
    }

    private static boolean lIllIlIIllll(int n2, int n3) {
        return n2 <= n3;
    }

    /*
     * WARNING - void declaration
     */
    private static void dU() {
        WorldArea worldArea = new WorldArea(llIlIlIlI[46], llIlIlIlI[47], llIlIlIlI[11], llIlIlIlI[20], llIlIlIlI[0]);
        WorldArea worldArea2 = new WorldArea(llIlIlIlI[46], llIlIlIlI[48], llIlIlIlI[49], llIlIlIlI[24], llIlIlIlI[0]);
        WorldArea worldArea3 = new WorldArea(llIlIlIlI[46], llIlIlIlI[50], llIlIlIlI[49], llIlIlIlI[24], llIlIlIlI[1]);
        WorldArea worldArea4 = new WorldArea(llIlIlIlI[51], llIlIlIlI[52], llIlIlIlI[53], llIlIlIlI[54], llIlIlIlI[2]);
        WorldArea worldArea5 = new WorldArea(llIlIlIlI[55], llIlIlIlI[56], llIlIlIlI[24], llIlIlIlI[11], llIlIlIlI[2]);
        WorldArea worldArea6 = new WorldArea(llIlIlIlI[57], llIlIlIlI[58], llIlIlIlI[49], llIlIlIlI[11], llIlIlIlI[0]);
        WorldArea worldArea7 = new WorldArea(llIlIlIlI[59], llIlIlIlI[60], llIlIlIlI[11], llIlIlIlI[20], llIlIlIlI[0]);
        WorldArea worldArea8 = new WorldArea(llIlIlIlI[46], llIlIlIlI[47], llIlIlIlI[61], llIlIlIlI[20], llIlIlIlI[0]);
        if (al.lIllIlIIlIII(mb.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && al.lIllIlIIlIII(mc.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && al.lIllIlIIlIII(md.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderGWD.c = llIlIlIIl[llIlIlIlI[11]];
            e.b(me);
            Time.sleepTicks((int)llIlIlIlI[1]);

        }
        if ((!al.lIllIlIIlIII(mb.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || !al.lIllIlIIlIII(mc.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || al.lIllIlIIIllI(md.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) && al.lIllIlIIllIl(Players.getLocal().getAnimation(), llIlIlIlI[62]) && al.lIllIlIIlIII(Players.getLocal().isMoving() ? 1 : 0)) {
            void lIIlIIllIlIIlI;
            void lIIlIIllIlIIll;
            void lIIlIIllIlIlII;
            void lIIlIIllIlIlIl;
            void lIIlIIllIlIllI;
            void lIIlIIllIlIlll;
            void lIIlIIllIlIIIl;
            if (al.lIllIlIIIllI(lIIlIIllIlIIIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderGWD.c = llIlIlIIl[llIlIlIlI[49]];
                String[] stringArray = new String[llIlIlIlI[1]];
                stringArray[al.llIlIlIlI[0]] = llIlIlIIl[llIlIlIlI[63]];
                TileObjects.getNearest((String[])stringArray).interact(llIlIlIIl[llIlIlIlI[64]]);
                Time.sleepTicks((int)llIlIlIlI[2]);

            }
            if (al.lIllIlIIIllI(lIIlIIllIlIlll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderGWD.c = llIlIlIIl[llIlIlIlI[53]];
                String[] stringArray = new String[llIlIlIlI[1]];
                stringArray[al.llIlIlIlI[0]] = llIlIlIIl[llIlIlIlI[38]];
                TileObjects.getNearest((String[])stringArray).interact(llIlIlIIl[llIlIlIlI[65]]);
                Time.sleepTicks((int)llIlIlIlI[2]);

            }
            if (al.lIllIlIIIllI(lIIlIIllIlIllI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderGWD.c = llIlIlIIl[llIlIlIlI[66]];
                String[] stringArray = new String[llIlIlIlI[1]];
                stringArray[al.llIlIlIlI[0]] = llIlIlIIl[llIlIlIlI[54]];
                TileObjects.getNearest((String[])stringArray).interact(llIlIlIIl[llIlIlIlI[67]]);
                Time.sleepTicks((int)llIlIlIlI[2]);

            }
            if (al.lIllIlIIIllI(lIIlIIllIlIlIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderGWD.c = llIlIlIIl[llIlIlIlI[40]];
                String[] stringArray = new String[llIlIlIlI[1]];
                stringArray[al.llIlIlIlI[0]] = llIlIlIIl[llIlIlIlI[68]];
                TileObjects.getNearest((String[])stringArray).interact(llIlIlIIl[llIlIlIlI[61]]);
                Time.sleepTicks((int)llIlIlIlI[18]);

            }
            if (al.lIllIlIIIllI(lIIlIIllIlIlII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderGWD.c = llIlIlIIl[llIlIlIlI[69]];
                String[] stringArray = new String[llIlIlIlI[1]];
                stringArray[al.llIlIlIlI[0]] = llIlIlIIl[llIlIlIlI[70]];
                TileObjects.getNearest((String[])stringArray).interact(llIlIlIIl[llIlIlIlI[41]]);
                Time.sleepTicks((int)llIlIlIlI[16]);

            }
            if (al.lIllIlIIIllI(lIIlIIllIlIIll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderGWD.c = llIlIlIIl[llIlIlIlI[71]];
                String[] stringArray = new String[llIlIlIlI[1]];
                stringArray[al.llIlIlIlI[0]] = llIlIlIIl[llIlIlIlI[72]];
                TileObjects.getNearest((String[])stringArray).interact(llIlIlIIl[llIlIlIlI[73]]);
                Time.sleepTicks((int)llIlIlIlI[9]);

            }
            if (al.lIllIlIIIllI(lIIlIIllIlIIlI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderGWD.c = llIlIlIIl[llIlIlIlI[74]];
                TileObject lIIlIIllIlIIII = TileObjects.getNearest(tileObject -> {
                    int n2;
                    if (al.lIllIlIIIllI(tileObject.getName().contains(llIlIlIIl[llIlIlIlI[234]]) ? 1 : 0) && al.lIllIlIIllll(tileObject.getWorldLocation().distanceTo(new WorldPoint(llIlIlIlI[235], llIlIlIlI[236], llIlIlIlI[0])), llIlIlIlI[2])) {
                        String[] stringArray = new String[llIlIlIlI[1]];
                        stringArray[al.llIlIlIlI[0]] = llIlIlIIl[llIlIlIlI[237]];
                        if (al.lIllIlIIIllI(tileObject.hasAction(stringArray) ? 1 : 0)) {
                            n2 = llIlIlIlI[1];

                            if (null == null) return n2 != 0;
                            return false;
                        }
                    }
                    n2 = llIlIlIlI[0];
                    return n2 != 0;
                });
                if (al.lIllIlIIlIIl(lIIlIIllIlIIII)) {
                    lIIlIIllIlIIII.interact(llIlIlIIl[llIlIlIlI[42]]);
                    Time.sleepTicks((int)e.c(llIlIlIlI[9], llIlIlIlI[16]));

                }
                if (al.lIllIlIIlllI(lIIlIIllIlIIII)) {
                    e.D();
                }
            }
        }
    }

    @Override
    public boolean ah() {
        boolean bl;
        if (al.lIllIlIIllII(Skills.getLevel((Skill)Skill.AGILITY), llIlIlIlI[185])) {
            bl = llIlIlIlI[1];

            if (2 < 0) {
                return ((0x1C ^ 0x74 ^ (0x87 ^ 0xBC)) & (0xBA ^ 0xC0 ^ (6 ^ 0x2F) ^ -1)) != 0;
            }
        } else {
            bl = llIlIlIlI[0];
        }
        return bl;
    }

    private static boolean lIllIlIIlIII(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    private static void dV() {
        WorldArea worldArea = new WorldArea(llIlIlIlI[75], llIlIlIlI[76], llIlIlIlI[77], llIlIlIlI[78], llIlIlIlI[1]);
        WorldArea worldArea2 = new WorldArea(llIlIlIlI[75], llIlIlIlI[76], llIlIlIlI[77], llIlIlIlI[78], llIlIlIlI[2]);
        WorldArea worldArea3 = new WorldArea(llIlIlIlI[75], llIlIlIlI[76], llIlIlIlI[77], llIlIlIlI[78], llIlIlIlI[9]);
        WorldArea worldArea4 = new WorldArea(llIlIlIlI[79], llIlIlIlI[80], llIlIlIlI[69], llIlIlIlI[64], llIlIlIlI[0]);
        WorldArea worldArea5 = new WorldArea(llIlIlIlI[81], llIlIlIlI[80], llIlIlIlI[11], llIlIlIlI[64], llIlIlIlI[9]);
        WorldArea worldArea6 = new WorldArea(llIlIlIlI[82], llIlIlIlI[83], llIlIlIlI[63], llIlIlIlI[49], llIlIlIlI[9]);
        WorldArea worldArea7 = new WorldArea(llIlIlIlI[84], llIlIlIlI[85], llIlIlIlI[26], llIlIlIlI[22], llIlIlIlI[1]);
        WorldArea worldArea8 = new WorldArea(llIlIlIlI[84], llIlIlIlI[86], llIlIlIlI[11], llIlIlIlI[24], llIlIlIlI[9]);
        WorldArea worldArea9 = new WorldArea(llIlIlIlI[87], llIlIlIlI[88], llIlIlIlI[89], llIlIlIlI[40], llIlIlIlI[9]);
        WorldArea worldArea10 = new WorldArea(llIlIlIlI[90], llIlIlIlI[91], llIlIlIlI[66], llIlIlIlI[64], llIlIlIlI[9]);
        WorldArea worldArea11 = new WorldArea(llIlIlIlI[92], llIlIlIlI[93], llIlIlIlI[22], llIlIlIlI[26], llIlIlIlI[9]);
        WorldArea worldArea12 = new WorldArea(llIlIlIlI[92], llIlIlIlI[94], llIlIlIlI[11], llIlIlIlI[22], llIlIlIlI[9]);
        if (al.lIllIlIIlIII(worldArea4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && al.lIllIlIIlIII(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && al.lIllIlIIlIII(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && al.lIllIlIIlIII(worldArea3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderGWD.c = llIlIlIIl[llIlIlIlI[89]];
            if (al.lIllIlIIIllI(Bank.isOpen() ? 1 : 0)) {
                Bank.close();
            }
            if (al.lIllIlIIIllI(Dialog.isOpen() ? 1 : 0)) {
                Dialog.close();
            }
            Movement.walkTo((WorldPoint)new WorldPoint(llIlIlIlI[95], llIlIlIlI[52], llIlIlIlI[0]));

            Time.sleepTicks((int)llIlIlIlI[1]);

        }
        if (al.lIllIlIIllIl(Players.getLocal().getAnimation(), llIlIlIlI[62]) && al.lIllIlIIlIII(Players.getLocal().isMoving() ? 1 : 0)) {
            String[] stringArray = new String[llIlIlIlI[1]];
            stringArray[al.llIlIlIlI[0]] = llIlIlIIl[llIlIlIlI[96]];
            TileItem lIIlIIlIllIlIl = TileItems.getNearest((String[])stringArray);
            if (al.lIllIlIIlIIl(lIIlIIlIllIlIl) && al.lIllIlIIIllI(al.dY() ? 1 : 0)) {
                AccBuilderGWD.c = llIlIlIIl[llIlIlIlI[97]];
                System.out.println(llIlIlIIl[llIlIlIlI[98]]);
                lIIlIIlIllIlIl.interact(llIlIlIIl[llIlIlIlI[99]]);
                Time.sleepTicks((int)llIlIlIlI[9]);

            }
            if (al.lIllIlIIlIII(al.dY() ? 1 : 0)) {
                void lIIlIIlIllIllI;
                void lIIlIIlIllIlll;
                void lIIlIIlIlllIII;
                void lIIlIIlIlllIIl;
                void lIIlIIlIlllIlI;
                void lIIlIIlIlllIll;
                void lIIlIIlIllllII;
                void lIIlIIlIllllIl;
                int lIIlIIlIllIlII;
                void lIIlIIlIlllllI;
                if (al.lIllIlIIIllI(lIIlIIlIlllllI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && al.lIllIlIIlIII(al.dY() ? 1 : 0)) {
                    AccBuilderGWD.c = llIlIlIIl[llIlIlIlI[100]];
                    lIIlIIlIllIlII = Skills.getExperience((Skill)Skill.AGILITY);
                    String[] stringArray2 = new String[llIlIlIlI[1]];
                    stringArray2[al.llIlIlIlI[0]] = llIlIlIIl[llIlIlIlI[101]];
                    TileObjects.getNearest((String[])stringArray2).interact(llIlIlIIl[llIlIlIlI[102]]);
                    Time.sleepUntil(() -> {
                        boolean bl;
                        if (al.lIllIlIIlIlI(Skills.getExperience((Skill)Skill.AGILITY), lIIlIIlIllIlII)) {
                            bl = llIlIlIlI[1];

                            if (3 >= (0xA2 ^ 0xA6)) {
                                return false;
                            }
                        } else {
                            bl = llIlIlIlI[0];
                        }
                        return bl;
                    }, (int)llIlIlIlI[103]);

                    Time.sleepTicks((int)llIlIlIlI[1]);

                }
                if (al.lIllIlIIIllI(lIIlIIlIllllIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && al.lIllIlIIlIII(al.dY() ? 1 : 0)) {
                    AccBuilderGWD.c = llIlIlIIl[llIlIlIlI[104]];
                    lIIlIIlIllIlII = Skills.getExperience((Skill)Skill.AGILITY);
                    String[] stringArray3 = new String[llIlIlIlI[1]];
                    stringArray3[al.llIlIlIlI[0]] = llIlIlIIl[llIlIlIlI[37]];
                    TileObjects.getNearest((String[])stringArray3).interact(llIlIlIIl[llIlIlIlI[105]]);
                    Time.sleepUntil(() -> {
                        boolean bl;
                        if (al.lIllIlIIlIlI(Skills.getExperience((Skill)Skill.AGILITY), lIIlIIlIllIlII)) {
                            bl = llIlIlIlI[1];

                            if (3 == 0) {
                                return ((0x1D ^ 7 ^ (0xC9 ^ 0x84)) & (116 + 31 - -30 + 59 ^ 90 + 17 - -42 + 38 ^ -1)) != 0;
                            }
                        } else {
                            bl = llIlIlIlI[0];
                        }
                        return bl;
                    }, (int)llIlIlIlI[103]);

                    Time.sleepTicks((int)llIlIlIlI[1]);

                }
                if (al.lIllIlIIIllI(lIIlIIlIllllII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && al.lIllIlIIlIII(al.dY() ? 1 : 0)) {
                    AccBuilderGWD.c = llIlIlIIl[llIlIlIlI[106]];
                    lIIlIIlIllIlII = Skills.getExperience((Skill)Skill.AGILITY);
                    String[] stringArray4 = new String[llIlIlIlI[1]];
                    stringArray4[al.llIlIlIlI[0]] = llIlIlIIl[llIlIlIlI[107]];
                    TileObjects.getNearest((String[])stringArray4).interact(llIlIlIIl[llIlIlIlI[108]]);
                    Time.sleepUntil(() -> {
                        boolean bl;
                        if (al.lIllIlIIlIlI(Skills.getExperience((Skill)Skill.AGILITY), lIIlIIlIllIlII)) {
                            bl = llIlIlIlI[1];

                            }
                        } else {
                            bl = llIlIlIlI[0];
                        }
                        return bl;
                    }, (int)llIlIlIlI[103]);

                    Time.sleepTicks((int)llIlIlIlI[1]);

                }
                if (al.lIllIlIIIllI(lIIlIIlIlllIll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && al.lIllIlIIlIII(al.dY() ? 1 : 0)) {
                    AccBuilderGWD.c = llIlIlIIl[llIlIlIlI[109]];
                    lIIlIIlIllIlII = Skills.getExperience((Skill)Skill.AGILITY);
                    String[] stringArray5 = new String[llIlIlIlI[1]];
                    stringArray5[al.llIlIlIlI[0]] = llIlIlIIl[llIlIlIlI[110]];
                    TileObjects.getNearest((String[])stringArray5).interact(llIlIlIIl[llIlIlIlI[111]]);
                    Time.sleepUntil(() -> {
                        boolean bl;
                        if (al.lIllIlIIlIlI(Skills.getExperience((Skill)Skill.AGILITY), lIIlIIlIllIlII)) {
                            bl = llIlIlIlI[1];

                            if (1 < 1) {
                                return false;
                            }
                        } else {
                            bl = llIlIlIlI[0];
                        }
                        return bl;
                    }, (int)llIlIlIlI[103]);

                    Time.sleepTicks((int)llIlIlIlI[1]);

                }
                if (al.lIllIlIIIllI(lIIlIIlIlllIlI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && al.lIllIlIIlIII(al.dY() ? 1 : 0)) {
                    AccBuilderGWD.c = llIlIlIIl[llIlIlIlI[112]];
                    lIIlIIlIllIlII = Skills.getExperience((Skill)Skill.AGILITY);
                    String[] stringArray6 = new String[llIlIlIlI[1]];
                    stringArray6[al.llIlIlIlI[0]] = llIlIlIIl[llIlIlIlI[113]];
                    TileObjects.getNearest((String[])stringArray6).interact(llIlIlIIl[llIlIlIlI[39]]);
                    Time.sleepUntil(() -> {
                        boolean bl;
                        if (al.lIllIlIIlIlI(Skills.getExperience((Skill)Skill.AGILITY), lIIlIIlIllIlII)) {
                            bl = llIlIlIlI[1];

                            }
                        } else {
                            bl = llIlIlIlI[0];
                        }
                        return bl;
                    }, (int)llIlIlIlI[103]);

                    Time.sleepTicks((int)llIlIlIlI[1]);

                }
                if (al.lIllIlIIIllI(lIIlIIlIlllIIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && al.lIllIlIIlIII(al.dY() ? 1 : 0)) {
                    AccBuilderGWD.c = llIlIlIIl[llIlIlIlI[6]];
                    lIIlIIlIllIlII = Skills.getExperience((Skill)Skill.AGILITY);
                    int[] nArray = new int[llIlIlIlI[1]];
                    nArray[al.llIlIlIlI[0]] = llIlIlIlI[114];
                    TileObjects.getNearest((int[])nArray).interact(llIlIlIIl[llIlIlIlI[115]]);
                    Time.sleepUntil(() -> {
                        boolean bl;
                        if (al.lIllIlIIlIlI(Skills.getExperience((Skill)Skill.AGILITY), lIIlIIlIllIlII)) {
                            bl = llIlIlIlI[1];

                            if (2 > (0x7D ^ 0x79)) {
                                return false;
                            }
                        } else {
                            bl = llIlIlIlI[0];
                        }
                        return bl;
                    }, (int)llIlIlIlI[103]);

                    Time.sleepTicks((int)llIlIlIlI[1]);

                }
                if (al.lIllIlIIIllI(lIIlIIlIlllIII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && al.lIllIlIIlIII(al.dY() ? 1 : 0)) {
                    AccBuilderGWD.c = llIlIlIIl[llIlIlIlI[116]];
                    lIIlIIlIllIlII = Skills.getExperience((Skill)Skill.AGILITY);
                    int[] nArray = new int[llIlIlIlI[1]];
                    nArray[al.llIlIlIlI[0]] = llIlIlIlI[117];
                    TileObjects.getNearest((int[])nArray).interact(llIlIlIIl[llIlIlIlI[118]]);
                    Time.sleepUntil(() -> {
                        boolean bl;
                        if (al.lIllIlIIlIlI(Skills.getExperience((Skill)Skill.AGILITY), lIIlIIlIllIlII)) {
                            bl = llIlIlIlI[1];

                            if (-(0xA8 ^ 0xAC) >= 0) {
                                return (1 & ~1) != 0;
                            }
                        } else {
                            bl = llIlIlIlI[0];
                        }
                        return bl;
                    }, (int)llIlIlIlI[103]);

                    Time.sleepTicks((int)llIlIlIlI[1]);

                }
                if (al.lIllIlIIIllI(lIIlIIlIllIlll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && al.lIllIlIIlIII(al.dY() ? 1 : 0)) {
                    AccBuilderGWD.c = llIlIlIIl[llIlIlIlI[119]];
                    lIIlIIlIllIlII = Skills.getExperience((Skill)Skill.AGILITY);
                    int[] nArray = new int[llIlIlIlI[1]];
                    nArray[al.llIlIlIlI[0]] = llIlIlIlI[120];
                    TileObjects.getNearest((int[])nArray).interact(llIlIlIIl[llIlIlIlI[121]]);
                    Time.sleepUntil(() -> {
                        boolean bl;
                        if (al.lIllIlIIlIlI(Skills.getExperience((Skill)Skill.AGILITY), lIIlIIlIllIlII)) {
                            bl = llIlIlIlI[1];

                            if (1 != 1) {
                                return false;
                            }
                        } else {
                            bl = llIlIlIlI[0];
                        }
                        return bl;
                    }, (int)llIlIlIlI[103]);

                    Time.sleepTicks((int)llIlIlIlI[1]);

                }
                if (al.lIllIlIIIllI(lIIlIIlIllIllI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && al.lIllIlIIlIII(al.dY() ? 1 : 0)) {
                    AccBuilderGWD.c = llIlIlIIl[llIlIlIlI[122]];
                    lIIlIIlIllIlII = Skills.getExperience((Skill)Skill.AGILITY);
                    String[] stringArray7 = new String[llIlIlIlI[1]];
                    stringArray7[al.llIlIlIlI[0]] = llIlIlIIl[llIlIlIlI[123]];
                    TileObjects.getNearest((String[])stringArray7).interact(llIlIlIIl[llIlIlIlI[124]]);
                    Time.sleepUntil(() -> {
                        boolean bl;
                        if (al.lIllIlIIlIlI(Skills.getExperience((Skill)Skill.AGILITY), lIIlIIlIllIlII)) {
                            bl = llIlIlIlI[1];

                            if (2 < 1) {
                                return false;
                            }
                        } else {
                            bl = llIlIlIlI[0];
                        }
                        return bl;
                    }, (int)llIlIlIlI[103]);

                    Time.sleepTicks((int)llIlIlIlI[1]);

                }
            }
        }
    }

    private static void lIllIlIIIlII() {
        llIlIlIIl = new String[llIlIlIlI[241]];
        al.llIlIlIIl[al.llIlIlIlI[0]] = "Buying items";
        al.llIlIlIIl[al.llIlIlIlI[1]] = "Finished buying items, switching back to agility";
        al.llIlIlIIl[al.llIlIlIlI[2]] = "Navigating to bank";
        al.llIlIlIIl[al.llIlIlIlI[9]] = "Handling banking";
        al.llIlIlIIl[al.llIlIlIlI[16]] = "We are missing quest supplies, switching to BUYING";
        al.llIlIlIIl[al.llIlIlIlI[18]] = "Vial";
        al.llIlIlIIl[al.llIlIlIlI[20]] = "Vial";
        al.llIlIlIIl[al.llIlIlIlI[22]] = "Drop";
        al.llIlIlIIl[al.llIlIlIlI[24]] = "Drink";
        al.llIlIlIIl[al.llIlIlIlI[26]] = "Eat";
        al.llIlIlIIl[al.llIlIlIlI[11]] = "Nav to gnome course";
        al.llIlIlIIl[al.llIlIlIlI[49]] = "Crossing log";
        al.llIlIlIIl[al.llIlIlIlI[63]] = "Log balance";
        al.llIlIlIIl[al.llIlIlIlI[64]] = "Walk-across";
        al.llIlIlIIl[al.llIlIlIlI[53]] = "Climbing net";
        al.llIlIlIIl[al.llIlIlIlI[38]] = "Obstacle net";
        al.llIlIlIIl[al.llIlIlIlI[65]] = "Climb-over";
        al.llIlIlIIl[al.llIlIlIlI[66]] = "Climbing branch";
        al.llIlIlIIl[al.llIlIlIlI[54]] = "Tree branch";
        al.llIlIlIIl[al.llIlIlIlI[67]] = "Climb";
        al.llIlIlIIl[al.llIlIlIlI[40]] = "Crossing rope";
        al.llIlIlIIl[al.llIlIlIlI[68]] = "Balancing rope";
        al.llIlIlIIl[al.llIlIlIlI[61]] = "Walk-on";
        al.llIlIlIIl[al.llIlIlIlI[69]] = "Climbing down";
        al.llIlIlIIl[al.llIlIlIlI[70]] = "Tree branch";
        al.llIlIlIIl[al.llIlIlIlI[41]] = "Climb-down";
        al.llIlIlIIl[al.llIlIlIlI[71]] = "Climbing net";
        al.llIlIlIIl[al.llIlIlIlI[72]] = "Obstacle net";
        al.llIlIlIIl[al.llIlIlIlI[73]] = "Climb-over";
        al.llIlIlIIl[al.llIlIlIlI[74]] = "Crossing pipe";
        al.llIlIlIIl[al.llIlIlIlI[42]] = "Squeeze-through";
        al.llIlIlIIl[al.llIlIlIlI[89]] = "Nav to start";
        al.llIlIlIIl[al.llIlIlIlI[96]] = "Mark of grace";
        al.llIlIlIIl[al.llIlIlIlI[97]] = "Taking mark";
        al.llIlIlIIl[al.llIlIlIlI[98]] = "Found mark on ground";
        al.llIlIlIIl[al.llIlIlIlI[99]] = "Take";
        al.llIlIlIIl[al.llIlIlIlI[100]] = "Starting course";
        al.llIlIlIIl[al.llIlIlIlI[101]] = "Rough wall";
        al.llIlIlIIl[al.llIlIlIlI[102]] = "Climb";
        al.llIlIlIIl[al.llIlIlIlI[104]] = "Crossing clothes line";
        al.llIlIlIIl[al.llIlIlIlI[37]] = "Clothes line";
        al.llIlIlIIl[al.llIlIlIlI[105]] = "Cross";
        al.llIlIlIIl[al.llIlIlIlI[106]] = "Leaping";
        al.llIlIlIIl[al.llIlIlIlI[107]] = "Gap";
        al.llIlIlIIl[al.llIlIlIlI[108]] = "Leap";
        al.llIlIlIIl[al.llIlIlIlI[109]] = "Balancing";
        al.llIlIlIIl[al.llIlIlIlI[110]] = "Wall";
        al.llIlIlIIl[al.llIlIlIlI[111]] = "Balance";
        al.llIlIlIIl[al.llIlIlIlI[112]] = "Jumping gap";
        al.llIlIlIIl[al.llIlIlIlI[113]] = "Gap";
        al.llIlIlIIl[al.llIlIlIlI[39]] = "Leap";
        al.llIlIlIIl[al.llIlIlIlI[6]] = "Jumping gap 2";
        al.llIlIlIIl[al.llIlIlIlI[115]] = "Leap";
        al.llIlIlIIl[al.llIlIlIlI[116]] = "Jumping gap 3";
        al.llIlIlIIl[al.llIlIlIlI[118]] = "Leap";
        al.llIlIlIIl[al.llIlIlIlI[119]] = "Hurdle roof";
        al.llIlIlIIl[al.llIlIlIlI[121]] = "Hurdle";
        al.llIlIlIIl[al.llIlIlIlI[122]] = "Finishing course";
        al.llIlIlIIl[al.llIlIlIlI[123]] = "Edge";
        al.llIlIlIIl[al.llIlIlIlI[124]] = "Jump-off";
        al.llIlIlIIl[al.llIlIlIlI[44]] = "Nav to canafis course";
        al.llIlIlIIl[al.llIlIlIlI[140]] = "Nav to start";
        al.llIlIlIIl[al.llIlIlIlI[5]] = "Starting course";
        al.llIlIlIIl[al.llIlIlIlI[141]] = "Tall tree";
        al.llIlIlIIl[al.llIlIlIlI[142]] = "Climb";
        al.llIlIlIIl[al.llIlIlIlI[143]] = "Mark of grace";
        al.llIlIlIIl[al.llIlIlIlI[144]] = "Taking mark";
        al.llIlIlIIl[al.llIlIlIlI[145]] = "Found mark on ground";
        al.llIlIlIIl[al.llIlIlIlI[146]] = "Take";
        al.llIlIlIIl[al.llIlIlIlI[147]] = "Jumping gap 1";
        al.llIlIlIIl[al.llIlIlIlI[148]] = "Jump";
        al.llIlIlIIl[al.llIlIlIlI[149]] = "Jumping gap 2";
        al.llIlIlIIl[al.llIlIlIlI[150]] = "Jump";
        al.llIlIlIIl[al.llIlIlIlI[151]] = "Jumping gap 3";
        al.llIlIlIIl[al.llIlIlIlI[152]] = "Jump";
        al.llIlIlIIl[al.llIlIlIlI[153]] = "Jumping gap 4";
        al.llIlIlIIl[al.llIlIlIlI[154]] = "Jump";
        al.llIlIlIIl[al.llIlIlIlI[155]] = "Vaulting";
        al.llIlIlIIl[al.llIlIlIlI[156]] = "Vault";
        al.llIlIlIIl[al.llIlIlIlI[157]] = "Jumping gap 5";
        al.llIlIlIIl[al.llIlIlIlI[158]] = "Jump";
        al.llIlIlIIl[al.llIlIlIlI[159]] = "Jumping gap 6";
        al.llIlIlIIl[al.llIlIlIlI[160]] = "Jump";
        al.llIlIlIIl[al.llIlIlIlI[171]] = "Nav to canafis course";
        al.llIlIlIIl[al.llIlIlIlI[172]] = "Nav to start";
        al.llIlIlIIl[al.llIlIlIlI[173]] = "Starting course";
        al.llIlIlIIl[al.llIlIlIlI[174]] = "Wall";
        al.llIlIlIIl[al.llIlIlIlI[175]] = "Climb-up";
        al.llIlIlIIl[al.llIlIlIlI[35]] = "Mark of grace";
        al.llIlIlIIl[al.llIlIlIlI[176]] = "Taking mark";
        al.llIlIlIIl[al.llIlIlIlI[177]] = "Found mark on ground";
        al.llIlIlIIl[al.llIlIlIlI[178]] = "Take";
        al.llIlIlIIl[al.llIlIlIlI[179]] = "Jumping gap 1";
        al.llIlIlIIl[al.llIlIlIlI[180]] = "Jump";
        al.llIlIlIIl[al.llIlIlIlI[78]] = "cross rope";
        al.llIlIlIIl[al.llIlIlIlI[181]] = "Cross";
        al.llIlIlIIl[al.llIlIlIlI[182]] = "Jumping gap 3";
        al.llIlIlIIl[al.llIlIlIlI[183]] = "Jump";
        al.llIlIlIIl[al.llIlIlIlI[184]] = "Jumping gap 4";
        al.llIlIlIIl[al.llIlIlIlI[185]] = "Jump";
        al.llIlIlIIl[al.llIlIlIlI[186]] = "Jumping Edge";
        al.llIlIlIIl[al.llIlIlIlI[187]] = "Jump";
        al.llIlIlIIl[al.llIlIlIlI[193]] = "Found mark on ground";
        al.llIlIlIIl[al.llIlIlIlI[202]] = "Agility";
        al.llIlIlIIl[al.llIlIlIlI[203]] = "passage";
        al.llIlIlIIl[al.llIlIlIlI[204]] = "passage";
        al.llIlIlIIl[al.llIlIlIlI[205]] = "passage";
        al.llIlIlIIl[al.llIlIlIlI[206]] = "passage";
        al.llIlIlIIl[al.llIlIlIlI[207]] = "Edge";
        al.llIlIlIIl[al.llIlIlIlI[210]] = "Gap";
        al.llIlIlIIl[al.llIlIlIlI[212]] = "Gap";
        al.llIlIlIIl[al.llIlIlIlI[215]] = "Tightrope";
        al.llIlIlIIl[al.llIlIlIlI[217]] = "Gap";
        al.llIlIlIIl[al.llIlIlIlI[220]] = "Gap";
        al.llIlIlIIl[al.llIlIlIlI[223]] = "Gap";
        al.llIlIlIIl[al.llIlIlIlI[225]] = "Pole-vault";
        al.llIlIlIIl[al.llIlIlIlI[226]] = "Gap";
        al.llIlIlIIl[al.llIlIlIlI[229]] = "Gap";
        al.llIlIlIIl[al.llIlIlIlI[231]] = "Gap";
        al.llIlIlIIl[al.llIlIlIlI[232]] = "Gap";
        al.llIlIlIIl[al.llIlIlIlI[234]] = "pipe";
        al.llIlIlIIl[al.llIlIlIlI[237]] = "Squeeze-through";
    }

    static {
        al.lIllIlIIIlIl();
        al.lIllIlIIIlII();
        bx = new ArrayList<d>();
        lY = llIlIlIlI[27];
        lZ = llIlIlIlI[23];
        mb = new WorldArea(llIlIlIlI[238], llIlIlIlI[52], llIlIlIlI[69], llIlIlIlI[72], llIlIlIlI[0]);
        mc = new WorldArea(llIlIlIlI[238], llIlIlIlI[52], llIlIlIlI[69], llIlIlIlI[72], llIlIlIlI[1]);
        md = new WorldArea(llIlIlIlI[238], llIlIlIlI[52], llIlIlIlI[69], llIlIlIlI[72], llIlIlIlI[2]);
        me = new WorldPoint(llIlIlIlI[239], llIlIlIlI[240], llIlIlIlI[0]);
    }

    private static boolean lIllIlIIllIl(int n2, int n3) {
        return n2 == n3;
    }

    public static void Q() {
        d lIIlIIIlIIllII;
        block18: {
            block17: {
                block16: {
                    block15: {
                        int[] nArray = new int[llIlIlIlI[1]];
                        nArray[al.llIlIlIlI[0]] = llIlIlIlI[15];
                        if (al.lIllIlIIlIII(Bank.contains((int[])nArray) ? 1 : 0)) {
                            d d2 = new DHelper(llIlIlIlI[15], llIlIlIlI[1], llIlIlIlI[194]);
                            bx.add(d2);

                        }
                        int[] nArray2 = new int[llIlIlIlI[1]];
                        nArray2[al.llIlIlIlI[0]] = llIlIlIlI[17];
                        if (al.lIllIlIIlIII(Bank.contains((int[])nArray2) ? 1 : 0)) {
                            lIIlIIIlIIllII = new DHelper(llIlIlIlI[17], llIlIlIlI[2], llIlIlIlI[195]);
                            bx.add(lIIlIIIlIIllII);

                        }
                        int[] nArray3 = new int[llIlIlIlI[1]];
                        nArray3[al.llIlIlIlI[0]] = llIlIlIlI[27];
                        if (al.lIllIlIIlIII(Bank.contains((int[])nArray3) ? 1 : 0)) {
                            lIIlIIIlIIllII = new DHelper(llIlIlIlI[27], llIlIlIlI[2], llIlIlIlI[195]);
                            bx.add(lIIlIIIlIIllII);

                        }
                        int[] nArray4 = new int[llIlIlIlI[1]];
                        nArray4[al.llIlIlIlI[0]] = llIlIlIlI[12];
                        if (al.lIllIlIIlIII(Bank.contains((int[])nArray4) ? 1 : 0)) {
                            lIIlIIIlIIllII = new DHelper(llIlIlIlI[12], llIlIlIlI[11], llIlIlIlI[196]);
                            bx.add(lIIlIIIlIIllII);

                        }
                        int[] nArray5 = new int[llIlIlIlI[1]];
                        nArray5[al.llIlIlIlI[0]] = llIlIlIlI[21];
                        if (al.lIllIlIIlIII(Bank.contains((int[])nArray5) ? 1 : 0)) {
                            lIIlIIIlIIllII = new DHelper(llIlIlIlI[21], llIlIlIlI[11], llIlIlIlI[197]);
                            bx.add(lIIlIIIlIIllII);

                        }
                        int[] nArray6 = new int[llIlIlIlI[1]];
                        nArray6[al.llIlIlIlI[0]] = llIlIlIlI[14];
                        if (al.lIllIlIIlIII(Bank.contains((int[])nArray6) ? 1 : 0)) {
                            lIIlIIIlIIllII = new DHelper(llIlIlIlI[14], llIlIlIlI[11], llIlIlIlI[197]);
                            bx.add(lIIlIIIlIIllII);

                        }
                        int[] nArray7 = new int[llIlIlIlI[1]];
                        nArray7[al.llIlIlIlI[0]] = llIlIlIlI[13];
                        if (al.lIllIlIIlIII(Bank.contains((int[])nArray7) ? 1 : 0)) {
                            lIIlIIIlIIllII = new DHelper(llIlIlIlI[13], llIlIlIlI[11], llIlIlIlI[197]);
                            bx.add(lIIlIIIlIIllII);

                        }
                        int[] nArray8 = new int[llIlIlIlI[1]];
                        nArray8[al.llIlIlIlI[0]] = llIlIlIlI[23];
                        if (!al.lIllIlIIIllI(Bank.contains((int[])nArray8) ? 1 : 0)) break block15;
                        int[] nArray9 = new int[llIlIlIlI[1]];
                        nArray9[al.llIlIlIlI[0]] = llIlIlIlI[23];
                        if (!al.lIllIlIIIllI(Bank.contains((int[])nArray9) ? 1 : 0)) break block16;
                        int[] nArray10 = new int[llIlIlIlI[1]];
                        nArray10[al.llIlIlIlI[0]] = llIlIlIlI[23];
                        if (!al.lIllIlIIIlll(Bank.getFirst((int[])nArray10).getQuantity(), llIlIlIlI[11])) break block16;
                    }
                    lIIlIIIlIIllII = new DHelper(lZ, llIlIlIlI[44], llIlIlIlI[198]);
                    bx.add(lIIlIIIlIIllII);

                }
                int[] nArray = new int[llIlIlIlI[1]];
                nArray[al.llIlIlIlI[0]] = llIlIlIlI[25];
                if (!al.lIllIlIIIllI(Bank.contains((int[])nArray) ? 1 : 0)) break block17;
                int[] nArray11 = new int[llIlIlIlI[1]];
                nArray11[al.llIlIlIlI[0]] = llIlIlIlI[25];
                if (!al.lIllIlIIIllI(Bank.contains((int[])nArray11) ? 1 : 0)) break block18;
                int[] nArray12 = new int[llIlIlIlI[1]];
                nArray12[al.llIlIlIlI[0]] = llIlIlIlI[25];
                if (!al.lIllIlIIIlll(Bank.getFirst((int[])nArray12).getQuantity(), llIlIlIlI[11])) break block18;
            }
            lIIlIIIlIIllII = new DHelper(llIlIlIlI[25], llIlIlIlI[11], llIlIlIlI[199]);
            bx.add(lIIlIIIlIIllII);

        }
        int[] nArray = new int[llIlIlIlI[1]];
        nArray[al.llIlIlIlI[0]] = llIlIlIlI[200];
        if (al.lIllIlIIlIII(Bank.contains((int[])nArray) ? 1 : 0)) {
            lIIlIIIlIIllII = new DHelper(llIlIlIlI[200], llIlIlIlI[1], llIlIlIlI[201]);
            bx.add(lIIlIIIlIIllII);

        }
        int[] nArray13 = new int[llIlIlIlI[1]];
        nArray13[al.llIlIlIlI[0]] = llIlIlIlI[19];
        if (al.lIllIlIIlIII(Bank.contains((int[])nArray13) ? 1 : 0)) {
            lIIlIIIlIIllII = new DHelper(llIlIlIlI[19], llIlIlIlI[40], j.ch);
            bx.add(lIIlIIIlIIllII);

        }
    }

    @Override
    public String ag() {
        return llIlIlIIl[llIlIlIlI[202]];
    }

    private static boolean lIllIlIIlIIl(Object object) {
        return object != null;
    }

    /*
     * WARNING - void declaration
     */
    private static boolean dY() {
        WorldArea worldArea = new WorldArea(llIlIlIlI[79], llIlIlIlI[80], llIlIlIlI[69], llIlIlIlI[64], llIlIlIlI[0]);
        WorldArea worldArea2 = new WorldArea(llIlIlIlI[81], llIlIlIlI[80], llIlIlIlI[11], llIlIlIlI[64], llIlIlIlI[9]);
        WorldArea worldArea3 = new WorldArea(llIlIlIlI[82], llIlIlIlI[83], llIlIlIlI[63], llIlIlIlI[49], llIlIlIlI[9]);
        WorldArea worldArea4 = new WorldArea(llIlIlIlI[188], llIlIlIlI[189], llIlIlIlI[24], llIlIlIlI[18], llIlIlIlI[1]);
        WorldArea worldArea5 = new WorldArea(llIlIlIlI[84], llIlIlIlI[86], llIlIlIlI[11], llIlIlIlI[24], llIlIlIlI[9]);
        WorldArea worldArea6 = new WorldArea(llIlIlIlI[190], llIlIlIlI[191], llIlIlIlI[73], llIlIlIlI[38], llIlIlIlI[9]);
        WorldArea worldArea7 = new WorldArea(llIlIlIlI[90], llIlIlIlI[91], llIlIlIlI[66], llIlIlIlI[64], llIlIlIlI[9]);
        WorldArea worldArea8 = new WorldArea(llIlIlIlI[92], llIlIlIlI[93], llIlIlIlI[22], llIlIlIlI[26], llIlIlIlI[9]);
        WorldArea worldArea9 = new WorldArea(llIlIlIlI[92], llIlIlIlI[94], llIlIlIlI[11], llIlIlIlI[22], llIlIlIlI[9]);
        WorldArea worldArea10 = new WorldArea(llIlIlIlI[127], llIlIlIlI[128], llIlIlIlI[49], llIlIlIlI[11], llIlIlIlI[2]);
        WorldArea worldArea11 = new WorldArea(llIlIlIlI[129], llIlIlIlI[127], llIlIlIlI[49], llIlIlIlI[24], llIlIlIlI[2]);
        WorldArea worldArea12 = new WorldArea(llIlIlIlI[130], llIlIlIlI[131], llIlIlIlI[63], llIlIlIlI[49], llIlIlIlI[2]);
        WorldArea worldArea13 = new WorldArea(llIlIlIlI[132], llIlIlIlI[133], llIlIlIlI[11], llIlIlIlI[64], llIlIlIlI[9]);
        WorldArea worldArea14 = new WorldArea(llIlIlIlI[134], llIlIlIlI[8], llIlIlIlI[49], llIlIlIlI[26], llIlIlIlI[2]);
        WorldArea worldArea15 = new WorldArea(llIlIlIlI[135], llIlIlIlI[136], llIlIlIlI[68], llIlIlIlI[53], llIlIlIlI[9]);
        WorldArea worldArea16 = new WorldArea(llIlIlIlI[137], llIlIlIlI[138], llIlIlIlI[63], llIlIlIlI[64], llIlIlIlI[2]);
        WorldArea worldArea17 = new WorldArea(llIlIlIlI[163], llIlIlIlI[133], llIlIlIlI[64], llIlIlIlI[11], llIlIlIlI[9]);
        WorldArea worldArea18 = new WorldArea(llIlIlIlI[164], llIlIlIlI[139], llIlIlIlI[38], llIlIlIlI[53], llIlIlIlI[2]);
        WorldArea worldArea19 = new WorldArea(llIlIlIlI[165], llIlIlIlI[134], llIlIlIlI[49], llIlIlIlI[26], llIlIlIlI[2]);
        WorldArea worldArea20 = new WorldArea(llIlIlIlI[166], llIlIlIlI[136], llIlIlIlI[70], llIlIlIlI[64], llIlIlIlI[9]);
        WorldArea worldArea21 = new WorldArea(llIlIlIlI[167], llIlIlIlI[168], llIlIlIlI[54], llIlIlIlI[63], llIlIlIlI[2]);
        WorldArea[] worldAreaArray = new WorldArea[llIlIlIlI[68]];
        worldAreaArray[al.llIlIlIlI[0]] = worldArea;
        worldAreaArray[al.llIlIlIlI[1]] = worldArea2;
        worldAreaArray[al.llIlIlIlI[2]] = worldArea3;
        worldAreaArray[al.llIlIlIlI[9]] = worldArea4;
        worldAreaArray[al.llIlIlIlI[16]] = worldArea5;
        worldAreaArray[al.llIlIlIlI[18]] = worldArea6;
        worldAreaArray[al.llIlIlIlI[20]] = worldArea7;
        worldAreaArray[al.llIlIlIlI[22]] = worldArea8;
        worldAreaArray[al.llIlIlIlI[24]] = worldArea9;
        worldAreaArray[al.llIlIlIlI[26]] = worldArea10;
        worldAreaArray[al.llIlIlIlI[11]] = worldArea11;
        worldAreaArray[al.llIlIlIlI[49]] = worldArea12;
        worldAreaArray[al.llIlIlIlI[63]] = worldArea13;
        worldAreaArray[al.llIlIlIlI[64]] = worldArea14;
        worldAreaArray[al.llIlIlIlI[53]] = worldArea15;
        worldAreaArray[al.llIlIlIlI[38]] = worldArea16;
        worldAreaArray[al.llIlIlIlI[65]] = worldArea17;
        worldAreaArray[al.llIlIlIlI[66]] = worldArea18;
        worldAreaArray[al.llIlIlIlI[54]] = worldArea19;
        worldAreaArray[al.llIlIlIlI[67]] = worldArea20;
        worldAreaArray[al.llIlIlIlI[40]] = worldArea21;
        WorldArea[] worldAreaArray2 = worldAreaArray;
        int[] nArray = new int[llIlIlIlI[1]];
        nArray[al.llIlIlIlI[0]] = llIlIlIlI[192];
        if (al.lIllIlIIlIIl(TileItems.getNearest((int[])nArray))) {
            void lIIlIIIlIIllll;
            System.out.println(llIlIlIIl[llIlIlIlI[193]]);
            int lIIlIIIlIIlllI = llIlIlIlI[0];
            while (al.lIllIlIIIlll(lIIlIIIlIIlllI, ((void)lIIlIIIlIIllll).length)) {
                int[] nArray2 = new int[llIlIlIlI[1]];
                nArray2[al.llIlIlIlI[0]] = llIlIlIlI[192];
                if (al.lIllIlIIIllI(lIIlIIIlIIllll[lIIlIIIlIIlllI].contains(TileItems.getNearest((int[])nArray2).getWorldLocation()) ? 1 : 0) && al.lIllIlIIIllI(lIIlIIIlIIllll[lIIlIIIlIIlllI].contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    return llIlIlIlI[1];
                }
                ++lIIlIIIlIIlllI;

                if (((0xDF ^ 0x9A) & ~(0x7C ^ 0x39)) == 0) continue;
                return false;
            }
        }
        return llIlIlIlI[0];
    }

    private static boolean lIllIlIIllII(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIllIlIIlIll(int n2) {
        return n2 > 0;
    }

    private static boolean lIllIlIIlllI(Object object) {
        return object == null;
    }

        return String.valueOf(lIIIllllllIlIl);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean an() {
        int n2;
        if (al.lIllIlIIllII(Skills.getBoostedLevel((Skill)Skill.AGILITY), llIlIlIlI[37])) {
            int n3;
            int[] nArray = new int[llIlIlIlI[1]];
            nArray[al.llIlIlIlI[0]] = llIlIlIlI[12];
            if (al.lIllIlIIIllI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray2 = new int[llIlIlIlI[1]];
                nArray2[al.llIlIlIlI[0]] = llIlIlIlI[25];
                if (al.lIllIlIIIllI(Inventory.contains((int[])nArray2) ? 1 : 0)) {
                    int[] nArray3 = new int[llIlIlIlI[1]];
                    nArray3[al.llIlIlIlI[0]] = llIlIlIlI[23];
                    if (!(!al.lIllIlIIIllI(Inventory.contains((int[])nArray3) ? 1 : 0) || al.lIllIlIIlIII(Inventory.contains(item -> item.getName().contains(llIlIlIIl[llIlIlIlI[206]])) ? 1 : 0) && !al.lIllIlIIIllI(Equipment.contains(item -> item.getName().contains(llIlIlIIl[llIlIlIlI[205]])) ? 1 : 0) || al.lIllIlIIlIII(Inventory.contains((int[])f.bm) ? 1 : 0) && !al.lIllIlIIIllI(Equipment.contains((int[])f.bm) ? 1 : 0))) {
                        n3 = llIlIlIlI[1];

                        if ((0x89 ^ 0x8D) > -1) return n3 != 0;
                        return false;
                    }
                }
            }
            n3 = llIlIlIlI[0];
            return n3 != 0;
        }
        int[] nArray = new int[llIlIlIlI[1]];
        nArray[al.llIlIlIlI[0]] = llIlIlIlI[12];
        if (al.lIllIlIIIllI(Inventory.contains((int[])nArray) ? 1 : 0)) {
            int[] nArray4 = new int[llIlIlIlI[1]];
            nArray4[al.llIlIlIlI[0]] = llIlIlIlI[14];
            if (al.lIllIlIIIllI(Inventory.contains((int[])nArray4) ? 1 : 0)) {
                int[] nArray5 = new int[llIlIlIlI[1]];
                nArray5[al.llIlIlIlI[0]] = llIlIlIlI[13];
                if (!(!al.lIllIlIIIllI(Inventory.contains((int[])nArray5) ? 1 : 0) || al.lIllIlIIlIII(Inventory.contains(item -> item.getName().contains(llIlIlIIl[llIlIlIlI[204]])) ? 1 : 0) && !al.lIllIlIIIllI(Equipment.contains(item -> item.getName().contains(llIlIlIIl[llIlIlIlI[203]])) ? 1 : 0) || al.lIllIlIIlIII(Inventory.contains((int[])f.bm) ? 1 : 0) && !al.lIllIlIIIllI(Equipment.contains((int[])f.bm) ? 1 : 0))) {
                    n2 = llIlIlIlI[1];

                    if (3 > 0) return n2 != 0;
                    return ((0x2E ^ 0x58 ^ (0x33 ^ 0x79)) & (116 + 15 - 19 + 24 ^ 178 + 15 - 92 + 79 ^ -1)) != 0;
                }
            }
        }
        n2 = llIlIlIlI[0];
        return n2 != 0;
    }

    private static boolean lIllIlIIIlll(int n2, int n3) {
        return n2 < n3;
    }

}

