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
package gg.squire.fdd2f9b9-6584-4a70-afa7-d1946c214094.tasks;

import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.G;
import gg.squire.fdd2f9b9-6584-4a70-afa7-d1946c214094.tasks.AHelper;
import gg.squire.fdd2f9b9-6584-4a70-afa7-d1946c214094.tasks.BHelper;
import gg.squire.fdd2f9b9-6584-4a70-afa7-d1946c214094.tasks.DHelper;
import gg.squire.fdd2f9b9-6584-4a70-afa7-d1946c214094.tasks.EHelper;
import gg.squire.fdd2f9b9-6584-4a70-afa7-d1946c214094.tasks.FHelper;
import gg.squire.fdd2f9b9-6584-4a70-afa7-d1946c214094.tasks.IHelper;
import gg.squire.account.AccBuilderRogues;
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

public class HHelper
implements G {
    static  WorldArea iA;
    
    static  WorldArea iB;
    public static  int iw;
    static  WorldArea iz;
    private static  WorldPoint iC;
    public static  int ix;
    
    public static  boolean bt;
    public static  List<d> bv;
    public static  int iy;

    @Override
    public boolean S() {
        return lIIlIIlIlI[0];
    }

    /*
     * WARNING - void declaration
     */
    private static void cs() {
        void lIIlIIIlI;
        void lIIlIlIlI;
        void lIIlIlIll;
        void lIIlIllII;
        void lIIlIllIl;
        WorldArea worldArea = new WorldArea(lIIlIIlIlI[125], lIIlIIlIlI[126], lIIlIIlIlI[112], lIIlIIlIlI[107], lIIlIIlIlI[0]);
        WorldArea worldArea2 = new WorldArea(lIIlIIlIlI[125], lIIlIIlIlI[126], lIIlIIlIlI[112], lIIlIIlIlI[107], lIIlIIlIlI[1]);
        WorldArea worldArea3 = new WorldArea(lIIlIIlIlI[125], lIIlIIlIlI[126], lIIlIIlIlI[112], lIIlIIlIlI[107], lIIlIIlIlI[3]);
        WorldArea worldArea4 = new WorldArea(lIIlIIlIlI[125], lIIlIIlIlI[126], lIIlIIlIlI[112], lIIlIIlIlI[107], lIIlIIlIlI[10]);
        WorldArea worldArea5 = new WorldArea(lIIlIIlIlI[127], lIIlIIlIlI[128], lIIlIIlIlI[49], lIIlIIlIlI[12], lIIlIIlIlI[3]);
        WorldArea worldArea6 = new WorldArea(lIIlIIlIlI[129], lIIlIIlIlI[127], lIIlIIlIlI[49], lIIlIIlIlI[25], lIIlIIlIlI[3]);
        WorldArea worldArea7 = new WorldArea(lIIlIIlIlI[130], lIIlIIlIlI[131], lIIlIIlIlI[63], lIIlIIlIlI[49], lIIlIIlIlI[3]);
        WorldArea worldArea8 = new WorldArea(lIIlIIlIlI[132], lIIlIIlIlI[133], lIIlIIlIlI[12], lIIlIIlIlI[64], lIIlIIlIlI[10]);
        WorldArea worldArea9 = new WorldArea(lIIlIIlIlI[134], lIIlIIlIlI[9], lIIlIIlIlI[49], lIIlIIlIlI[27], lIIlIIlIlI[3]);
        WorldArea worldArea10 = new WorldArea(lIIlIIlIlI[135], lIIlIIlIlI[136], lIIlIIlIlI[68], lIIlIIlIlI[53], lIIlIIlIlI[10]);
        WorldArea worldArea11 = new WorldArea(lIIlIIlIlI[137], lIIlIIlIlI[138], lIIlIIlIlI[63], lIIlIIlIlI[64], lIIlIIlIlI[3]);
        WorldPoint worldPoint = new WorldPoint(lIIlIIlIlI[137], lIIlIIlIlI[139], lIIlIIlIlI[0]);
        if (H.lllllIIIIlll(Dialog.isOpen() ? 1 : 0)) {
            Dialog.close();
        }
        if (H.lllllIIIlIIl(lIIlIllIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && H.lllllIIIlIIl(lIIlIllII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && H.lllllIIIlIIl(lIIlIlIll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && H.lllllIIIlIIl(lIIlIlIlI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderRogues.c = lIIlIIlIII[lIIlIIlIlI[140]];
            Movement.walkTo((WorldPoint)lIIlIIIlI);

            Time.sleepTicks((int)lIIlIIlIlI[1]);

        }
        if (H.lllllIIIIlll(lIIlIllIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (H.lllllIIIlIll(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lIIlIIIlI), lIIlIIlIlI[21])) {
                AccBuilderRogues.c = lIIlIIlIII[lIIlIIlIlI[6]];
                Movement.walkTo((WorldPoint)lIIlIIIlI);

                Time.sleepTicks((int)lIIlIIlIlI[1]);

            }
            if (H.lllllIIIllll(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lIIlIIIlI), lIIlIIlIlI[21])) {
                AccBuilderRogues.c = lIIlIIlIII[lIIlIIlIlI[141]];
                int lIIlIIIIl = Skills.getExperience((Skill)Skill.AGILITY);
                String[] stringArray = new String[lIIlIIlIlI[1]];
                stringArray[H.lIIlIIlIlI[0]] = lIIlIIlIII[lIIlIIlIlI[142]];
                TileObjects.getNearest((String[])stringArray).interact(lIIlIIlIII[lIIlIIlIlI[143]]);
                Time.sleepTicks((int)e.c(lIIlIIlIlI[1], lIIlIIlIlI[3]));

                Time.sleepUntil(() -> {
                    boolean bl;
                    if (H.lllllIIIlIll(Skills.getExperience((Skill)Skill.AGILITY), lIIlIIIIl)) {
                        bl = lIIlIIlIlI[1];

                        if (-(0x6A ^ 0x58 ^ (0x51 ^ 0x67)) >= 0) {
                            return (((0xA0 ^ 0xA6) & ~(0x95 ^ 0x93) ^ (0x8B ^ 0xB6)) & (0x5C ^ 0x34 ^ (0xF0 ^ 0xA5) ^ -1)) != 0;
                        }
                    } else {
                        bl = lIIlIIlIlI[0];
                    }
                    return bl;
                }, (int)lIIlIIlIlI[104]);

                Time.sleepTicks((int)lIIlIIlIlI[1]);

            }
        }
        String[] stringArray = new String[lIIlIIlIlI[1]];
        stringArray[H.lIIlIIlIlI[0]] = lIIlIIlIII[lIIlIIlIlI[144]];
        TileItem lIIlIIIIl = TileItems.getNearest((String[])stringArray);
        if (H.lllllIIIlIlI(lIIlIIIIl) && H.lllllIIIIlll(H.cu() ? 1 : 0)) {
            AccBuilderRogues.c = lIIlIIlIII[lIIlIIlIlI[145]];
            System.out.println(lIIlIIlIII[lIIlIIlIlI[146]]);
            lIIlIIIIl.interact(lIIlIIlIII[lIIlIIlIlI[147]]);
            Time.sleepTicks((int)lIIlIIlIlI[10]);

        }
        if (H.lllllIIIlIIl(H.cu() ? 1 : 0)) {
            void lIIlIIIll;
            void lIIlIIlII;
            void lIIlIIlIl;
            void lIIlIIllI;
            void lIIlIIlll;
            void lIIlIlIII;
            int lIIIlllll;
            TileObject lIIlIIIII;
            void lIIlIlIIl;
            if (H.lllllIIIIlll(lIIlIlIIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && H.lllllIIIlIlI(lIIlIIIII = TileObjects.getNearest(tileObject -> {
                int n2;
                if (H.lllllIIIIlll(tileObject.getName().contains(lIIlIIlIII[lIIlIIlIlI[233]]) ? 1 : 0) && H.lllllIIIllll(tileObject.getWorldLocation().distanceTo(new WorldPoint(lIIlIIlIlI[234], lIIlIIlIlI[131], lIIlIIlIlI[3])), lIIlIIlIlI[3])) {
                    n2 = lIIlIIlIlI[1];

                    }
                } else {
                    n2 = lIIlIIlIlI[0];
                }
                return n2 != 0;
            }))) {
                lIIIlllll = Skills.getExperience((Skill)Skill.AGILITY);
                AccBuilderRogues.c = lIIlIIlIII[lIIlIIlIlI[148]];
                lIIlIIIII.interact(lIIlIIlIII[lIIlIIlIlI[149]]);
                Time.sleepTicks((int)e.c(lIIlIIlIlI[1], lIIlIIlIlI[3]));

                Time.sleepUntil(() -> {
                    boolean bl;
                    if (H.lllllIIIlIll(Skills.getExperience((Skill)Skill.AGILITY), lIIIlllll)) {
                        bl = lIIlIIlIlI[1];

                        if ((0xB9 ^ 0xB5 ^ (0x5F ^ 0x57)) > (0x4D ^ 0x23 ^ (0xD1 ^ 0xBB))) {
                            return ((0xF1 ^ 0xC6 ^ (0x9F ^ 0xB5)) & (84 + 113 - 159 + 89 ^ (0x11 ^ 0x73) ^ -1)) != 0;
                        }
                    } else {
                        bl = lIIlIIlIlI[0];
                    }
                    return bl;
                }, (int)lIIlIIlIlI[104]);

                Time.sleepTicks((int)lIIlIIlIlI[1]);

            }
            if (H.lllllIIIIlll(H.cu() ? 1 : 0)) {
                return;
            }
            if (H.lllllIIIIlll(lIIlIlIII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && H.lllllIIIlIlI(lIIlIIIII = TileObjects.getNearest(tileObject -> {
                int n2;
                if (H.lllllIIIIlll(tileObject.getName().contains(lIIlIIlIII[lIIlIIlIlI[232]]) ? 1 : 0) && H.lllllIIIllll(tileObject.getWorldLocation().distanceTo(new WorldPoint(lIIlIIlIlI[131], lIIlIIlIlI[225], lIIlIIlIlI[3])), lIIlIIlIlI[3])) {
                    n2 = lIIlIIlIlI[1];

                    if (2 < 0) {
                        return (3 & ~3) != 0;
                    }
                } else {
                    n2 = lIIlIIlIlI[0];
                }
                return n2 != 0;
            }))) {
                AccBuilderRogues.c = lIIlIIlIII[lIIlIIlIlI[150]];
                lIIIlllll = Skills.getExperience((Skill)Skill.AGILITY);
                lIIlIIIII.interact(lIIlIIlIII[lIIlIIlIlI[151]]);
                Time.sleepTicks((int)e.c(lIIlIIlIlI[1], lIIlIIlIlI[3]));

                Time.sleepUntil(() -> {
                    boolean bl;
                    if (H.lllllIIIlIll(Skills.getExperience((Skill)Skill.AGILITY), lIIIlllll)) {
                        bl = lIIlIIlIlI[1];

                    } else {
                        bl = lIIlIIlIlI[0];
                    }
                    return bl;
                }, (int)lIIlIIlIlI[104]);

                Time.sleepTicks((int)lIIlIIlIlI[1]);

            }
            if (H.lllllIIIIlll(H.cu() ? 1 : 0)) {
                return;
            }
            if (H.lllllIIIIlll(lIIlIIlll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && H.lllllIIIlIlI(lIIlIIIII = TileObjects.getNearest(tileObject -> {
                int n2;
                if (H.lllllIIIIlll(tileObject.getName().contains(lIIlIIlIII[lIIlIIlIlI[230]]) ? 1 : 0) && H.lllllIIIllll(tileObject.getWorldLocation().distanceTo(new WorldPoint(lIIlIIlIlI[139], lIIlIIlIlI[231], lIIlIIlIlI[3])), lIIlIIlIlI[3])) {
                    n2 = lIIlIIlIlI[1];

                } else {
                    n2 = lIIlIIlIlI[0];
                }
                return n2 != 0;
            }))) {
                AccBuilderRogues.c = lIIlIIlIII[lIIlIIlIlI[152]];
                lIIIlllll = Skills.getExperience((Skill)Skill.AGILITY);
                lIIlIIIII.interact(lIIlIIlIII[lIIlIIlIlI[153]]);
                Time.sleepTicks((int)e.c(lIIlIIlIlI[1], lIIlIIlIlI[3]));

                Time.sleepUntil(() -> {
                    boolean bl;
                    if (H.lllllIIIlIll(Skills.getExperience((Skill)Skill.AGILITY), lIIIlllll)) {
                        bl = lIIlIIlIlI[1];

                    } else {
                        bl = lIIlIIlIlI[0];
                    }
                    return bl;
                }, (int)lIIlIIlIlI[104]);

                Time.sleepTicks((int)lIIlIIlIlI[1]);

            }
            if (H.lllllIIIIlll(H.cu() ? 1 : 0)) {
                return;
            }
            if (H.lllllIIIIlll(lIIlIIllI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && H.lllllIIIlIlI(lIIlIIIII = TileObjects.getNearest(tileObject -> {
                int n2;
                if (H.lllllIIIIlll(tileObject.getName().contains(lIIlIIlIII[lIIlIIlIlI[227]]) ? 1 : 0) && H.lllllIIIllll(tileObject.getWorldLocation().distanceTo(new WorldPoint(lIIlIIlIlI[228], lIIlIIlIlI[229], lIIlIIlIlI[10])), lIIlIIlIlI[3])) {
                    n2 = lIIlIIlIlI[1];

                } else {
                    n2 = lIIlIIlIlI[0];
                }
                return n2 != 0;
            }))) {
                AccBuilderRogues.c = lIIlIIlIII[lIIlIIlIlI[154]];
                lIIIlllll = Skills.getExperience((Skill)Skill.AGILITY);
                lIIlIIIII.interact(lIIlIIlIII[lIIlIIlIlI[155]]);
                Time.sleepTicks((int)e.c(lIIlIIlIlI[1], lIIlIIlIlI[3]));

                Time.sleepUntil(() -> {
                    boolean bl;
                    if (H.lllllIIIlIll(Skills.getExperience((Skill)Skill.AGILITY), lIIIlllll)) {
                        bl = lIIlIIlIlI[1];

                        if (2 != 2) {
                            return false;
                        }
                    } else {
                        bl = lIIlIIlIlI[0];
                    }
                    return bl;
                }, (int)lIIlIIlIlI[104]);

                Time.sleepTicks((int)lIIlIIlIlI[1]);

            }
            if (H.lllllIIIIlll(H.cu() ? 1 : 0)) {
                return;
            }
            if (H.lllllIIIIlll(lIIlIIlIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && H.lllllIIIlIlI(lIIlIIIII = TileObjects.getNearest(tileObject -> {
                int n2;
                if (H.lllllIIIIlll(tileObject.getName().contains(lIIlIIlIII[lIIlIIlIlI[226]]) ? 1 : 0) && H.lllllIIIllll(tileObject.getWorldLocation().distanceTo(new WorldPoint(lIIlIIlIlI[9], lIIlIIlIlI[130], lIIlIIlIlI[3])), lIIlIIlIlI[3])) {
                    n2 = lIIlIIlIlI[1];

                    if (1 != 1) {
                        return ((0x4C ^ 0x24 ^ (0 ^ 0x4B)) & (0xD5 ^ 0xA0 ^ (0x1E ^ 0x48) ^ -1)) != 0;
                    }
                } else {
                    n2 = lIIlIIlIlI[0];
                }
                return n2 != 0;
            }))) {
                AccBuilderRogues.c = lIIlIIlIII[lIIlIIlIlI[156]];
                lIIIlllll = Skills.getExperience((Skill)Skill.AGILITY);
                lIIlIIIII.interact(lIIlIIlIII[lIIlIIlIlI[157]]);
                Time.sleepTicks((int)e.c(lIIlIIlIlI[1], lIIlIIlIlI[3]));

                Time.sleepUntil(() -> {
                    boolean bl;
                    if (H.lllllIIIlIll(Skills.getExperience((Skill)Skill.AGILITY), lIIIlllll)) {
                        bl = lIIlIIlIlI[1];

                        if ((0x7F ^ 0x2F ^ (0xC2 ^ 0x96)) <= 2) {
                            return ((0x94 ^ 0x90 ^ (0x5A ^ 0x4A)) & (0xD2 ^ 0x8B ^ (0x36 ^ 0x7B) ^ -1)) != 0;
                        }
                    } else {
                        bl = lIIlIIlIlI[0];
                    }
                    return bl;
                }, (int)lIIlIIlIlI[104]);

                Time.sleepTicks((int)lIIlIIlIlI[1]);

            }
            if (H.lllllIIIIlll(H.cu() ? 1 : 0)) {
                return;
            }
            if (H.lllllIIIIlll(lIIlIIlII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && H.lllllIIIlIlI(lIIlIIIII = TileObjects.getNearest(tileObject -> {
                int n2;
                if (H.lllllIIIIlll(tileObject.getName().contains(lIIlIIlIII[lIIlIIlIlI[224]]) ? 1 : 0) && H.lllllIIIllll(tileObject.getWorldLocation().distanceTo(new WorldPoint(lIIlIIlIlI[225], lIIlIIlIlI[215], lIIlIIlIlI[10])), lIIlIIlIlI[3])) {
                    n2 = lIIlIIlIlI[1];

                    if (2 == -1) {
                        return ((1 ^ 0x1F ^ (0xCE ^ 0xC4)) & (113 + 49 - 32 + 31 ^ 32 + 151 - 63 + 61 ^ -1)) != 0;
                    }
                } else {
                    n2 = lIIlIIlIlI[0];
                }
                return n2 != 0;
            }))) {
                AccBuilderRogues.c = lIIlIIlIII[lIIlIIlIlI[158]];
                lIIIlllll = Skills.getExperience((Skill)Skill.AGILITY);
                lIIlIIIII.interact(lIIlIIlIII[lIIlIIlIlI[159]]);
                Time.sleepTicks((int)e.c(lIIlIIlIlI[1], lIIlIIlIlI[3]));

                Time.sleepUntil(() -> {
                    boolean bl;
                    if (H.lllllIIIlIll(Skills.getExperience((Skill)Skill.AGILITY), lIIIlllll)) {
                        bl = lIIlIIlIlI[1];

                        if (2 == 0) {
                            return false;
                        }
                    } else {
                        bl = lIIlIIlIlI[0];
                    }
                    return bl;
                }, (int)lIIlIIlIlI[104]);

                Time.sleepTicks((int)lIIlIIlIlI[1]);

            }
            if (H.lllllIIIIlll(H.cu() ? 1 : 0)) {
                return;
            }
            if (H.lllllIIIIlll(lIIlIIIll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && H.lllllIIIlIlI(lIIlIIIII = TileObjects.getNearest(tileObject -> {
                int n2;
                if (H.lllllIIIIlll(tileObject.getName().contains(lIIlIIlIII[lIIlIIlIlI[221]]) ? 1 : 0) && H.lllllIIIllll(tileObject.getWorldLocation().distanceTo(new WorldPoint(lIIlIIlIlI[222], lIIlIIlIlI[223], lIIlIIlIlI[3])), lIIlIIlIlI[3])) {
                    n2 = lIIlIIlIlI[1];

                    if (((93 + 120 - 126 + 67 ^ 93 + 107 - 125 + 108) & (0x53 ^ 2 ^ (0x6C ^ 0x10) ^ -1)) != 0) {
                        return ((0xDE ^ 0xC6 ^ (4 ^ 0x7C)) & (0x39 ^ 0x4A ^ (0x71 ^ 0x62) ^ -1)) != 0;
                    }
                } else {
                    n2 = lIIlIIlIlI[0];
                }
                return n2 != 0;
            }))) {
                AccBuilderRogues.c = lIIlIIlIII[lIIlIIlIlI[160]];
                lIIIlllll = Skills.getExperience((Skill)Skill.AGILITY);
                lIIlIIIII.interact(lIIlIIlIII[lIIlIIlIlI[161]]);
                Time.sleepTicks((int)e.c(lIIlIIlIlI[1], lIIlIIlIlI[3]));

                Time.sleepUntil(() -> {
                    boolean bl;
                    if (H.lllllIIIlIll(Skills.getExperience((Skill)Skill.AGILITY), lIIIlllll)) {
                        bl = lIIlIIlIlI[1];

                        if (2 < 1) {
                            return false;
                        }
                    } else {
                        bl = lIIlIIlIlI[0];
                    }
                    return bl;
                }, (int)lIIlIIlIlI[104]);

                Time.sleepTicks((int)lIIlIIlIlI[1]);

            }
        }
    }

    private static boolean lllllIIIlllI(int n2, int n3) {
        return n2 == n3;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean ab() {
        int n2;
        if (H.lllllIIIllIl(Skills.getBoostedLevel((Skill)Skill.AGILITY), lIIlIIlIlI[38])) {
            int n3;
            int[] nArray = new int[lIIlIIlIlI[1]];
            nArray[H.lIIlIIlIlI[0]] = lIIlIIlIlI[13];
            if (H.lllllIIIIlll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray2 = new int[lIIlIIlIlI[1]];
                nArray2[H.lIIlIIlIlI[0]] = lIIlIIlIlI[26];
                if (H.lllllIIIIlll(Inventory.contains((int[])nArray2) ? 1 : 0)) {
                    int[] nArray3 = new int[lIIlIIlIlI[1]];
                    nArray3[H.lIIlIIlIlI[0]] = lIIlIIlIlI[24];
                    if (!(!H.lllllIIIIlll(Inventory.contains((int[])nArray3) ? 1 : 0) || H.lllllIIIlIIl(Inventory.contains(item -> item.getName().contains(lIIlIIlIII[lIIlIIlIlI[207]])) ? 1 : 0) && !H.lllllIIIIlll(Equipment.contains(item -> item.getName().contains(lIIlIIlIII[lIIlIIlIlI[206]])) ? 1 : 0) || H.lllllIIIlIIl(Inventory.contains((int[])f.bf) ? 1 : 0) && !H.lllllIIIIlll(Equipment.contains((int[])f.bf) ? 1 : 0))) {
                        n3 = lIIlIIlIlI[1];

                        if (3 != 0) return n3 != 0;
                        return ((181 + 3 - 20 + 31 ^ 91 + 52 - 44 + 42) & (0x10 ^ 0x39 ^ (0xD9 ^ 0xBE) ^ -1)) != 0;
                    }
                }
            }
            n3 = lIIlIIlIlI[0];
            return n3 != 0;
        }
        int[] nArray = new int[lIIlIIlIlI[1]];
        nArray[H.lIIlIIlIlI[0]] = lIIlIIlIlI[13];
        if (H.lllllIIIIlll(Inventory.contains((int[])nArray) ? 1 : 0)) {
            int[] nArray4 = new int[lIIlIIlIlI[1]];
            nArray4[H.lIIlIIlIlI[0]] = lIIlIIlIlI[15];
            if (H.lllllIIIIlll(Inventory.contains((int[])nArray4) ? 1 : 0)) {
                int[] nArray5 = new int[lIIlIIlIlI[1]];
                nArray5[H.lIIlIIlIlI[0]] = lIIlIIlIlI[14];
                if (!(!H.lllllIIIIlll(Inventory.contains((int[])nArray5) ? 1 : 0) || H.lllllIIIlIIl(Inventory.contains(item -> item.getName().contains(lIIlIIlIII[lIIlIIlIlI[205]])) ? 1 : 0) && !H.lllllIIIIlll(Equipment.contains(item -> item.getName().contains(lIIlIIlIII[lIIlIIlIlI[204]])) ? 1 : 0) || H.lllllIIIlIIl(Inventory.contains((int[])f.bf) ? 1 : 0) && !H.lllllIIIIlll(Equipment.contains((int[])f.bf) ? 1 : 0))) {
                    n2 = lIIlIIlIlI[1];

                    if (-1 <= 0) return n2 != 0;
                    return false;
                }
            }
        }
        n2 = lIIlIIlIlI[0];
        return n2 != 0;
    }

    @Override
    public String U() {
        return lIIlIIlIII[lIIlIIlIlI[203]];
    }

    /*
     * WARNING - void declaration
     */
    private static void cr() {
        WorldArea worldArea = new WorldArea(lIIlIIlIlI[76], lIIlIIlIlI[77], lIIlIIlIlI[78], lIIlIIlIlI[79], lIIlIIlIlI[1]);
        WorldArea worldArea2 = new WorldArea(lIIlIIlIlI[76], lIIlIIlIlI[77], lIIlIIlIlI[78], lIIlIIlIlI[79], lIIlIIlIlI[3]);
        WorldArea worldArea3 = new WorldArea(lIIlIIlIlI[76], lIIlIIlIlI[77], lIIlIIlIlI[78], lIIlIIlIlI[79], lIIlIIlIlI[10]);
        WorldArea worldArea4 = new WorldArea(lIIlIIlIlI[80], lIIlIIlIlI[81], lIIlIIlIlI[69], lIIlIIlIlI[64], lIIlIIlIlI[0]);
        WorldArea worldArea5 = new WorldArea(lIIlIIlIlI[82], lIIlIIlIlI[81], lIIlIIlIlI[12], lIIlIIlIlI[64], lIIlIIlIlI[10]);
        WorldArea worldArea6 = new WorldArea(lIIlIIlIlI[83], lIIlIIlIlI[84], lIIlIIlIlI[63], lIIlIIlIlI[49], lIIlIIlIlI[10]);
        WorldArea worldArea7 = new WorldArea(lIIlIIlIlI[85], lIIlIIlIlI[86], lIIlIIlIlI[27], lIIlIIlIlI[23], lIIlIIlIlI[1]);
        WorldArea worldArea8 = new WorldArea(lIIlIIlIlI[85], lIIlIIlIlI[87], lIIlIIlIlI[12], lIIlIIlIlI[25], lIIlIIlIlI[10]);
        WorldArea worldArea9 = new WorldArea(lIIlIIlIlI[88], lIIlIIlIlI[89], lIIlIIlIlI[75], lIIlIIlIlI[41], lIIlIIlIlI[10]);
        WorldArea worldArea10 = new WorldArea(lIIlIIlIlI[90], lIIlIIlIlI[91], lIIlIIlIlI[66], lIIlIIlIlI[64], lIIlIIlIlI[10]);
        WorldArea worldArea11 = new WorldArea(lIIlIIlIlI[92], lIIlIIlIlI[93], lIIlIIlIlI[23], lIIlIIlIlI[27], lIIlIIlIlI[10]);
        WorldArea worldArea12 = new WorldArea(lIIlIIlIlI[92], lIIlIIlIlI[94], lIIlIIlIlI[12], lIIlIIlIlI[23], lIIlIIlIlI[10]);
        if (H.lllllIIIlIIl(worldArea4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && H.lllllIIIlIIl(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && H.lllllIIIlIIl(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && H.lllllIIIlIIl(worldArea3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderRogues.c = lIIlIIlIII[lIIlIIlIlI[95]];
            if (H.lllllIIIIlll(Bank.isOpen() ? 1 : 0)) {
                Bank.close();
            }
            if (H.lllllIIIIlll(Dialog.isOpen() ? 1 : 0)) {
                Dialog.close();
            }
            Movement.walkTo((WorldPoint)new WorldPoint(lIIlIIlIlI[96], lIIlIIlIlI[52], lIIlIIlIlI[0]));

            Time.sleepTicks((int)lIIlIIlIlI[1]);

        }
        if (H.lllllIIIlllI(Players.getLocal().getAnimation(), lIIlIIlIlI[62]) && H.lllllIIIlIIl(Players.getLocal().isMoving() ? 1 : 0)) {
            String[] stringArray = new String[lIIlIIlIlI[1]];
            stringArray[H.lIIlIIlIlI[0]] = lIIlIIlIII[lIIlIIlIlI[97]];
            TileItem lIIlllllI = TileItems.getNearest((String[])stringArray);
            if (H.lllllIIIlIlI(lIIlllllI) && H.lllllIIIIlll(H.cu() ? 1 : 0)) {
                AccBuilderRogues.c = lIIlIIlIII[lIIlIIlIlI[98]];
                System.out.println(lIIlIIlIII[lIIlIIlIlI[99]]);
                lIIlllllI.interact(lIIlIIlIII[lIIlIIlIlI[100]]);
                Time.sleepTicks((int)lIIlIIlIlI[10]);

            }
            if (H.lllllIIIlIIl(H.cu() ? 1 : 0)) {
                void lIIllllll;
                void lIlIIIIII;
                void lIlIIIIIl;
                void lIlIIIIlI;
                void lIlIIIIll;
                void lIlIIIlII;
                void lIlIIIlIl;
                void lIlIIIllI;
                int lIIllllIl;
                void lIlIIIlll;
                if (H.lllllIIIIlll(lIlIIIlll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && H.lllllIIIlIIl(H.cu() ? 1 : 0)) {
                    AccBuilderRogues.c = lIIlIIlIII[lIIlIIlIlI[101]];
                    lIIllllIl = Skills.getExperience((Skill)Skill.AGILITY);
                    String[] stringArray2 = new String[lIIlIIlIlI[1]];
                    stringArray2[H.lIIlIIlIlI[0]] = lIIlIIlIII[lIIlIIlIlI[102]];
                    TileObjects.getNearest((String[])stringArray2).interact(lIIlIIlIII[lIIlIIlIlI[103]]);
                    Time.sleepUntil(() -> {
                        boolean bl;
                        if (H.lllllIIIlIll(Skills.getExperience((Skill)Skill.AGILITY), lIIllllIl)) {
                            bl = lIIlIIlIlI[1];

                            if (1 == 3) {
                                return false;
                            }
                        } else {
                            bl = lIIlIIlIlI[0];
                        }
                        return bl;
                    }, (int)lIIlIIlIlI[104]);

                    Time.sleepTicks((int)lIIlIIlIlI[1]);

                }
                if (H.lllllIIIIlll(lIlIIIllI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && H.lllllIIIlIIl(H.cu() ? 1 : 0)) {
                    AccBuilderRogues.c = lIIlIIlIII[lIIlIIlIlI[38]];
                    lIIllllIl = Skills.getExperience((Skill)Skill.AGILITY);
                    String[] stringArray3 = new String[lIIlIIlIlI[1]];
                    stringArray3[H.lIIlIIlIlI[0]] = lIIlIIlIII[lIIlIIlIlI[105]];
                    TileObjects.getNearest((String[])stringArray3).interact(lIIlIIlIII[lIIlIIlIlI[106]]);
                    Time.sleepUntil(() -> {
                        boolean bl;
                        if (H.lllllIIIlIll(Skills.getExperience((Skill)Skill.AGILITY), lIIllllIl)) {
                            bl = lIIlIIlIlI[1];

                            if (((19 + 38 - 21 + 92 ^ 35 + 26 - -9 + 99) & (0xA5 ^ 0xB4 ^ (0xAA ^ 0x92) ^ -1)) != 0) {
                                return ((0x47 ^ 0x25 ^ (2 ^ 0x59)) & (151 + 3 - 69 + 81 ^ 15 + 150 - 121 + 115 ^ -1)) != 0;
                            }
                        } else {
                            bl = lIIlIIlIlI[0];
                        }
                        return bl;
                    }, (int)lIIlIIlIlI[104]);

                    Time.sleepTicks((int)lIIlIIlIlI[1]);

                }
                if (H.lllllIIIIlll(lIlIIIlIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && H.lllllIIIlIIl(H.cu() ? 1 : 0)) {
                    AccBuilderRogues.c = lIIlIIlIII[lIIlIIlIlI[107]];
                    lIIllllIl = Skills.getExperience((Skill)Skill.AGILITY);
                    String[] stringArray4 = new String[lIIlIIlIlI[1]];
                    stringArray4[H.lIIlIIlIlI[0]] = lIIlIIlIII[lIIlIIlIlI[108]];
                    TileObjects.getNearest((String[])stringArray4).interact(lIIlIIlIII[lIIlIIlIlI[109]]);
                    Time.sleepUntil(() -> {
                        boolean bl;
                        if (H.lllllIIIlIll(Skills.getExperience((Skill)Skill.AGILITY), lIIllllIl)) {
                            bl = lIIlIIlIlI[1];

                            if (3 <= -1) {
                                return false;
                            }
                        } else {
                            bl = lIIlIIlIlI[0];
                        }
                        return bl;
                    }, (int)lIIlIIlIlI[104]);

                    Time.sleepTicks((int)lIIlIIlIlI[1]);

                }
                if (H.lllllIIIIlll(lIlIIIlII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && H.lllllIIIlIIl(H.cu() ? 1 : 0)) {
                    AccBuilderRogues.c = lIIlIIlIII[lIIlIIlIlI[110]];
                    lIIllllIl = Skills.getExperience((Skill)Skill.AGILITY);
                    String[] stringArray5 = new String[lIIlIIlIlI[1]];
                    stringArray5[H.lIIlIIlIlI[0]] = lIIlIIlIII[lIIlIIlIlI[111]];
                    TileObjects.getNearest((String[])stringArray5).interact(lIIlIIlIII[lIIlIIlIlI[112]]);
                    Time.sleepUntil(() -> {
                        boolean bl;
                        if (H.lllllIIIlIll(Skills.getExperience((Skill)Skill.AGILITY), lIIllllIl)) {
                            bl = lIIlIIlIlI[1];

                            if ((0x1B ^ 0x1F) <= 1) {
                                return false;
                            }
                        } else {
                            bl = lIIlIIlIlI[0];
                        }
                        return bl;
                    }, (int)lIIlIIlIlI[104]);

                    Time.sleepTicks((int)lIIlIIlIlI[1]);

                }
                if (H.lllllIIIIlll(lIlIIIIll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && H.lllllIIIlIIl(H.cu() ? 1 : 0)) {
                    AccBuilderRogues.c = lIIlIIlIII[lIIlIIlIlI[113]];
                    lIIllllIl = Skills.getExperience((Skill)Skill.AGILITY);
                    String[] stringArray6 = new String[lIIlIIlIlI[1]];
                    stringArray6[H.lIIlIIlIlI[0]] = lIIlIIlIII[lIIlIIlIlI[40]];
                    TileObjects.getNearest((String[])stringArray6).interact(lIIlIIlIII[lIIlIIlIlI[7]]);
                    Time.sleepUntil(() -> {
                        boolean bl;
                        if (H.lllllIIIlIll(Skills.getExperience((Skill)Skill.AGILITY), lIIllllIl)) {
                            bl = lIIlIIlIlI[1];

                            if (-1 > 2) {
                                return false;
                            }
                        } else {
                            bl = lIIlIIlIlI[0];
                        }
                        return bl;
                    }, (int)lIIlIIlIlI[104]);

                    Time.sleepTicks((int)lIIlIIlIlI[1]);

                }
                if (H.lllllIIIIlll(lIlIIIIlI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && H.lllllIIIlIIl(H.cu() ? 1 : 0)) {
                    AccBuilderRogues.c = lIIlIIlIII[lIIlIIlIlI[114]];
                    lIIllllIl = Skills.getExperience((Skill)Skill.AGILITY);
                    int[] nArray = new int[lIIlIIlIlI[1]];
                    nArray[H.lIIlIIlIlI[0]] = lIIlIIlIlI[115];
                    TileObjects.getNearest((int[])nArray).interact(lIIlIIlIII[lIIlIIlIlI[116]]);
                    Time.sleepUntil(() -> {
                        boolean bl;
                        if (H.lllllIIIlIll(Skills.getExperience((Skill)Skill.AGILITY), lIIllllIl)) {
                            bl = lIIlIIlIlI[1];

                            if (1 == (0x40 ^ 0x44)) {
                                return false;
                            }
                        } else {
                            bl = lIIlIIlIlI[0];
                        }
                        return bl;
                    }, (int)lIIlIIlIlI[104]);

                    Time.sleepTicks((int)lIIlIIlIlI[1]);

                }
                if (H.lllllIIIIlll(lIlIIIIIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && H.lllllIIIlIIl(H.cu() ? 1 : 0)) {
                    AccBuilderRogues.c = lIIlIIlIII[lIIlIIlIlI[117]];
                    lIIllllIl = Skills.getExperience((Skill)Skill.AGILITY);
                    int[] nArray = new int[lIIlIIlIlI[1]];
                    nArray[H.lIIlIIlIlI[0]] = lIIlIIlIlI[118];
                    TileObjects.getNearest((int[])nArray).interact(lIIlIIlIII[lIIlIIlIlI[119]]);
                    Time.sleepUntil(() -> {
                        boolean bl;
                        if (H.lllllIIIlIll(Skills.getExperience((Skill)Skill.AGILITY), lIIllllIl)) {
                            bl = lIIlIIlIlI[1];

                        } else {
                            bl = lIIlIIlIlI[0];
                        }
                        return bl;
                    }, (int)lIIlIIlIlI[104]);

                    Time.sleepTicks((int)lIIlIIlIlI[1]);

                }
                if (H.lllllIIIIlll(lIlIIIIII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && H.lllllIIIlIIl(H.cu() ? 1 : 0)) {
                    AccBuilderRogues.c = lIIlIIlIII[lIIlIIlIlI[120]];
                    lIIllllIl = Skills.getExperience((Skill)Skill.AGILITY);
                    int[] nArray = new int[lIIlIIlIlI[1]];
                    nArray[H.lIIlIIlIlI[0]] = lIIlIIlIlI[121];
                    TileObjects.getNearest((int[])nArray).interact(lIIlIIlIII[lIIlIIlIlI[122]]);
                    Time.sleepUntil(() -> {
                        boolean bl;
                        if (H.lllllIIIlIll(Skills.getExperience((Skill)Skill.AGILITY), lIIllllIl)) {
                            bl = lIIlIIlIlI[1];

                            if (((0x27 ^ 7) & ~(0x3F ^ 0x1F)) >= (0xAC ^ 0xA8)) {
                                return false;
                            }
                        } else {
                            bl = lIIlIIlIlI[0];
                        }
                        return bl;
                    }, (int)lIIlIIlIlI[104]);

                    Time.sleepTicks((int)lIIlIIlIlI[1]);

                }
                if (H.lllllIIIIlll(lIIllllll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && H.lllllIIIlIIl(H.cu() ? 1 : 0)) {
                    AccBuilderRogues.c = lIIlIIlIII[lIIlIIlIlI[123]];
                    lIIllllIl = Skills.getExperience((Skill)Skill.AGILITY);
                    String[] stringArray7 = new String[lIIlIIlIlI[1]];
                    stringArray7[H.lIIlIIlIlI[0]] = lIIlIIlIII[lIIlIIlIlI[124]];
                    TileObjects.getNearest((String[])stringArray7).interact(lIIlIIlIII[lIIlIIlIlI[44]]);
                    Time.sleepUntil(() -> {
                        boolean bl;
                        if (H.lllllIIIlIll(Skills.getExperience((Skill)Skill.AGILITY), lIIllllIl)) {
                            bl = lIIlIIlIlI[1];

                            if (((0x11 ^ 0x70) & ~(0xEB ^ 0x8A)) >= 1) {
                                return false;
                            }
                        } else {
                            bl = lIIlIIlIlI[0];
                        }
                        return bl;
                    }, (int)lIIlIIlIlI[104]);

                    Time.sleepTicks((int)lIIlIIlIlI[1]);

                }
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    private static void cq() {
        WorldArea worldArea = new WorldArea(lIIlIIlIlI[46], lIIlIIlIlI[47], lIIlIIlIlI[12], lIIlIIlIlI[21], lIIlIIlIlI[0]);
        WorldArea worldArea2 = new WorldArea(lIIlIIlIlI[46], lIIlIIlIlI[48], lIIlIIlIlI[49], lIIlIIlIlI[25], lIIlIIlIlI[0]);
        WorldArea worldArea3 = new WorldArea(lIIlIIlIlI[46], lIIlIIlIlI[50], lIIlIIlIlI[49], lIIlIIlIlI[25], lIIlIIlIlI[1]);
        WorldArea worldArea4 = new WorldArea(lIIlIIlIlI[51], lIIlIIlIlI[52], lIIlIIlIlI[53], lIIlIIlIlI[54], lIIlIIlIlI[3]);
        WorldArea worldArea5 = new WorldArea(lIIlIIlIlI[55], lIIlIIlIlI[56], lIIlIIlIlI[25], lIIlIIlIlI[12], lIIlIIlIlI[3]);
        WorldArea worldArea6 = new WorldArea(lIIlIIlIlI[57], lIIlIIlIlI[58], lIIlIIlIlI[49], lIIlIIlIlI[12], lIIlIIlIlI[0]);
        WorldArea worldArea7 = new WorldArea(lIIlIIlIlI[59], lIIlIIlIlI[60], lIIlIIlIlI[12], lIIlIIlIlI[21], lIIlIIlIlI[0]);
        WorldArea worldArea8 = new WorldArea(lIIlIIlIlI[46], lIIlIIlIlI[47], lIIlIIlIlI[61], lIIlIIlIlI[21], lIIlIIlIlI[0]);
        if (H.lllllIIIlIIl(iz.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && H.lllllIIIlIIl(iA.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && H.lllllIIIlIIl(iB.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderRogues.c = lIIlIIlIII[lIIlIIlIlI[12]];
            e.b(iC);
            Time.sleepTicks((int)lIIlIIlIlI[1]);

        }
        if ((!H.lllllIIIlIIl(iz.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || !H.lllllIIIlIIl(iA.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || H.lllllIIIIlll(iB.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) && H.lllllIIIlllI(Players.getLocal().getAnimation(), lIIlIIlIlI[62]) && H.lllllIIIlIIl(Players.getLocal().isMoving() ? 1 : 0)) {
            void lIlIllIlI;
            void lIlIllIll;
            void lIlIlllII;
            void lIlIlllIl;
            void lIlIllllI;
            void lIlIlllll;
            void lIlIllIIl;
            if (H.lllllIIIIlll(lIlIllIIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderRogues.c = lIIlIIlIII[lIIlIIlIlI[49]];
                String[] stringArray = new String[lIIlIIlIlI[1]];
                stringArray[H.lIIlIIlIlI[0]] = lIIlIIlIII[lIIlIIlIlI[63]];
                TileObjects.getNearest((String[])stringArray).interact(lIIlIIlIII[lIIlIIlIlI[64]]);
                Time.sleepTicks((int)lIIlIIlIlI[3]);

            }
            if (H.lllllIIIIlll(lIlIlllll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderRogues.c = lIIlIIlIII[lIIlIIlIlI[53]];
                String[] stringArray = new String[lIIlIIlIlI[1]];
                stringArray[H.lIIlIIlIlI[0]] = lIIlIIlIII[lIIlIIlIlI[39]];
                TileObjects.getNearest((String[])stringArray).interact(lIIlIIlIII[lIIlIIlIlI[65]]);
                Time.sleepTicks((int)lIIlIIlIlI[3]);

            }
            if (H.lllllIIIIlll(lIlIllllI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderRogues.c = lIIlIIlIII[lIIlIIlIlI[66]];
                String[] stringArray = new String[lIIlIIlIlI[1]];
                stringArray[H.lIIlIIlIlI[0]] = lIIlIIlIII[lIIlIIlIlI[54]];
                TileObjects.getNearest((String[])stringArray).interact(lIIlIIlIII[lIIlIIlIlI[67]]);
                Time.sleepTicks((int)lIIlIIlIlI[3]);

            }
            if (H.lllllIIIIlll(lIlIlllIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderRogues.c = lIIlIIlIII[lIIlIIlIlI[41]];
                String[] stringArray = new String[lIIlIIlIlI[1]];
                stringArray[H.lIIlIIlIlI[0]] = lIIlIIlIII[lIIlIIlIlI[68]];
                TileObjects.getNearest((String[])stringArray).interact(lIIlIIlIII[lIIlIIlIlI[61]]);
                Time.sleepTicks((int)lIIlIIlIlI[19]);

            }
            if (H.lllllIIIIlll(lIlIlllII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderRogues.c = lIIlIIlIII[lIIlIIlIlI[69]];
                String[] stringArray = new String[lIIlIIlIlI[1]];
                stringArray[H.lIIlIIlIlI[0]] = lIIlIIlIII[lIIlIIlIlI[70]];
                TileObjects.getNearest((String[])stringArray).interact(lIIlIIlIII[lIIlIIlIlI[42]]);
                Time.sleepTicks((int)lIIlIIlIlI[17]);

            }
            if (H.lllllIIIIlll(lIlIllIll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderRogues.c = lIIlIIlIII[lIIlIIlIlI[71]];
                String[] stringArray = new String[lIIlIIlIlI[1]];
                stringArray[H.lIIlIIlIlI[0]] = lIIlIIlIII[lIIlIIlIlI[72]];
                TileObjects.getNearest((String[])stringArray).interact(lIIlIIlIII[lIIlIIlIlI[73]]);
                Time.sleepTicks((int)lIIlIIlIlI[10]);

            }
            if (H.lllllIIIIlll(lIlIllIlI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderRogues.c = lIIlIIlIII[lIIlIIlIlI[74]];
                String[] stringArray = new String[lIIlIIlIlI[1]];
                stringArray[H.lIIlIIlIlI[0]] = lIIlIIlIII[lIIlIIlIlI[2]];
                TileObjects.getNearest((String[])stringArray).interact(lIIlIIlIII[lIIlIIlIlI[75]]);
                Time.sleepTicks((int)lIIlIIlIlI[17]);

            }
        }
    }

    public static void af() {
        d llIlIlIl;
        block18: {
            block17: {
                block16: {
                    block15: {
                        int[] nArray = new int[lIIlIIlIlI[1]];
                        nArray[H.lIIlIIlIlI[0]] = lIIlIIlIlI[16];
                        if (H.lllllIIIlIIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                            d d2 = new DHelper(lIIlIIlIlI[16], lIIlIIlIlI[1], lIIlIIlIlI[195]);
                            bv.add(d2);

                        }
                        int[] nArray2 = new int[lIIlIIlIlI[1]];
                        nArray2[H.lIIlIIlIlI[0]] = lIIlIIlIlI[18];
                        if (H.lllllIIIlIIl(Bank.contains((int[])nArray2) ? 1 : 0)) {
                            llIlIlIl = new DHelper(lIIlIIlIlI[18], lIIlIIlIlI[3], lIIlIIlIlI[196]);
                            bv.add(llIlIlIl);

                        }
                        int[] nArray3 = new int[lIIlIIlIlI[1]];
                        nArray3[H.lIIlIIlIlI[0]] = lIIlIIlIlI[28];
                        if (H.lllllIIIlIIl(Bank.contains((int[])nArray3) ? 1 : 0)) {
                            llIlIlIl = new DHelper(lIIlIIlIlI[28], lIIlIIlIlI[3], lIIlIIlIlI[196]);
                            bv.add(llIlIlIl);

                        }
                        int[] nArray4 = new int[lIIlIIlIlI[1]];
                        nArray4[H.lIIlIIlIlI[0]] = lIIlIIlIlI[13];
                        if (H.lllllIIIlIIl(Bank.contains((int[])nArray4) ? 1 : 0)) {
                            llIlIlIl = new DHelper(lIIlIIlIlI[13], lIIlIIlIlI[12], lIIlIIlIlI[197]);
                            bv.add(llIlIlIl);

                        }
                        int[] nArray5 = new int[lIIlIIlIlI[1]];
                        nArray5[H.lIIlIIlIlI[0]] = lIIlIIlIlI[22];
                        if (H.lllllIIIlIIl(Bank.contains((int[])nArray5) ? 1 : 0)) {
                            llIlIlIl = new DHelper(lIIlIIlIlI[22], lIIlIIlIlI[12], lIIlIIlIlI[198]);
                            bv.add(llIlIlIl);

                        }
                        int[] nArray6 = new int[lIIlIIlIlI[1]];
                        nArray6[H.lIIlIIlIlI[0]] = lIIlIIlIlI[15];
                        if (H.lllllIIIlIIl(Bank.contains((int[])nArray6) ? 1 : 0)) {
                            llIlIlIl = new DHelper(lIIlIIlIlI[15], lIIlIIlIlI[12], lIIlIIlIlI[198]);
                            bv.add(llIlIlIl);

                        }
                        int[] nArray7 = new int[lIIlIIlIlI[1]];
                        nArray7[H.lIIlIIlIlI[0]] = lIIlIIlIlI[14];
                        if (H.lllllIIIlIIl(Bank.contains((int[])nArray7) ? 1 : 0)) {
                            llIlIlIl = new DHelper(lIIlIIlIlI[14], lIIlIIlIlI[12], lIIlIIlIlI[198]);
                            bv.add(llIlIlIl);

                        }
                        int[] nArray8 = new int[lIIlIIlIlI[1]];
                        nArray8[H.lIIlIIlIlI[0]] = lIIlIIlIlI[24];
                        if (!H.lllllIIIIlll(Bank.contains((int[])nArray8) ? 1 : 0)) break block15;
                        int[] nArray9 = new int[lIIlIIlIlI[1]];
                        nArray9[H.lIIlIIlIlI[0]] = lIIlIIlIlI[24];
                        if (!H.lllllIIIIlll(Bank.contains((int[])nArray9) ? 1 : 0)) break block16;
                        int[] nArray10 = new int[lIIlIIlIlI[1]];
                        nArray10[H.lIIlIIlIlI[0]] = lIIlIIlIlI[24];
                        if (!H.lllllIIIlIII(Bank.getFirst((int[])nArray10).getQuantity(), lIIlIIlIlI[12])) break block16;
                    }
                    llIlIlIl = new DHelper(ix, lIIlIIlIlI[44], lIIlIIlIlI[199]);
                    bv.add(llIlIlIl);

                }
                int[] nArray = new int[lIIlIIlIlI[1]];
                nArray[H.lIIlIIlIlI[0]] = lIIlIIlIlI[26];
                if (!H.lllllIIIIlll(Bank.contains((int[])nArray) ? 1 : 0)) break block17;
                int[] nArray11 = new int[lIIlIIlIlI[1]];
                nArray11[H.lIIlIIlIlI[0]] = lIIlIIlIlI[26];
                if (!H.lllllIIIIlll(Bank.contains((int[])nArray11) ? 1 : 0)) break block18;
                int[] nArray12 = new int[lIIlIIlIlI[1]];
                nArray12[H.lIIlIIlIlI[0]] = lIIlIIlIlI[26];
                if (!H.lllllIIIlIII(Bank.getFirst((int[])nArray12).getQuantity(), lIIlIIlIlI[12])) break block18;
            }
            llIlIlIl = new DHelper(lIIlIIlIlI[26], lIIlIIlIlI[12], lIIlIIlIlI[200]);
            bv.add(llIlIlIl);

        }
        int[] nArray = new int[lIIlIIlIlI[1]];
        nArray[H.lIIlIIlIlI[0]] = lIIlIIlIlI[201];
        if (H.lllllIIIlIIl(Bank.contains((int[])nArray) ? 1 : 0)) {
            llIlIlIl = new DHelper(lIIlIIlIlI[201], lIIlIIlIlI[1], lIIlIIlIlI[202]);
            bv.add(llIlIlIl);

        }
        int[] nArray13 = new int[lIIlIIlIlI[1]];
        nArray13[H.lIIlIIlIlI[0]] = lIIlIIlIlI[20];
        if (H.lllllIIIlIIl(Bank.contains((int[])nArray13) ? 1 : 0)) {
            llIlIlIl = new DHelper(lIIlIIlIlI[20], lIIlIIlIlI[41], i.bq);
            bv.add(llIlIlIl);

        }
    }

    private static boolean lllllIIIIlll(int n2) {
        return n2 != 0;
    }

    private static boolean lllllIIIlIII(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * WARNING - void declaration
     */
    private static void ct() {
        void lIIIIlIII;
        void lIIIIlllI;
        void lIIIIllll;
        void lIIIlIIII;
        void lIIIlIIIl;
        WorldArea worldArea = new WorldArea(lIIlIIlIlI[162], lIIlIIlIlI[163], lIIlIIlIlI[111], lIIlIIlIlI[111], lIIlIIlIlI[0]);
        WorldArea worldArea2 = new WorldArea(lIIlIIlIlI[162], lIIlIIlIlI[163], lIIlIIlIlI[111], lIIlIIlIlI[111], lIIlIIlIlI[1]);
        WorldArea worldArea3 = new WorldArea(lIIlIIlIlI[162], lIIlIIlIlI[163], lIIlIIlIlI[111], lIIlIIlIlI[111], lIIlIIlIlI[3]);
        WorldArea worldArea4 = new WorldArea(lIIlIIlIlI[162], lIIlIIlIlI[163], lIIlIIlIlI[111], lIIlIIlIlI[111], lIIlIIlIlI[10]);
        WorldArea worldArea5 = new WorldArea(lIIlIIlIlI[164], lIIlIIlIlI[133], lIIlIIlIlI[64], lIIlIIlIlI[12], lIIlIIlIlI[10]);
        WorldArea worldArea6 = new WorldArea(lIIlIIlIlI[165], lIIlIIlIlI[139], lIIlIIlIlI[39], lIIlIIlIlI[53], lIIlIIlIlI[3]);
        WorldArea worldArea7 = new WorldArea(lIIlIIlIlI[166], lIIlIIlIlI[134], lIIlIIlIlI[49], lIIlIIlIlI[27], lIIlIIlIlI[3]);
        WorldArea worldArea8 = new WorldArea(lIIlIIlIlI[167], lIIlIIlIlI[136], lIIlIIlIlI[70], lIIlIIlIlI[64], lIIlIIlIlI[10]);
        WorldArea worldArea9 = new WorldArea(lIIlIIlIlI[168], lIIlIIlIlI[169], lIIlIIlIlI[54], lIIlIIlIlI[63], lIIlIIlIlI[3]);
        WorldPoint worldPoint = new WorldPoint(lIIlIIlIlI[170], lIIlIIlIlI[171], lIIlIIlIlI[0]);
        if (H.lllllIIIIlll(Dialog.isOpen() ? 1 : 0)) {
            Dialog.close();
        }
        if (H.lllllIIIlIIl(lIIIlIIIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && H.lllllIIIlIIl(lIIIlIIII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && H.lllllIIIlIIl(lIIIIllll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && H.lllllIIIlIIl(lIIIIlllI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderRogues.c = lIIlIIlIII[lIIlIIlIlI[172]];
            Movement.walkTo((WorldPoint)lIIIIlIII);

            Time.sleepTicks((int)lIIlIIlIlI[1]);

        }
        if (H.lllllIIIIlll(lIIIlIIIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (H.lllllIIIlIll(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lIIIIlIII), lIIlIIlIlI[21])) {
                AccBuilderRogues.c = lIIlIIlIII[lIIlIIlIlI[173]];
                Movement.walkTo((WorldPoint)lIIIIlIII);

                Time.sleepTicks((int)lIIlIIlIlI[1]);

            }
            if (H.lllllIIIllll(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lIIIIlIII), lIIlIIlIlI[21])) {
                AccBuilderRogues.c = lIIlIIlIII[lIIlIIlIlI[174]];
                int lIIIIIlll = Skills.getExperience((Skill)Skill.AGILITY);
                String[] stringArray = new String[lIIlIIlIlI[1]];
                stringArray[H.lIIlIIlIlI[0]] = lIIlIIlIII[lIIlIIlIlI[175]];
                TileObjects.getNearest((String[])stringArray).interact(lIIlIIlIII[lIIlIIlIlI[36]]);
                Time.sleepTicks((int)e.c(lIIlIIlIlI[1], lIIlIIlIlI[3]));

                Time.sleepUntil(() -> {
                    boolean bl;
                    if (H.lllllIIIlIll(Skills.getExperience((Skill)Skill.AGILITY), lIIIIIlll)) {
                        bl = lIIlIIlIlI[1];

                        }
                    } else {
                        bl = lIIlIIlIlI[0];
                    }
                    return bl;
                }, (int)lIIlIIlIlI[104]);

                Time.sleepTicks((int)lIIlIIlIlI[1]);

            }
        }
        String[] stringArray = new String[lIIlIIlIlI[1]];
        stringArray[H.lIIlIIlIlI[0]] = lIIlIIlIII[lIIlIIlIlI[176]];
        TileItem lIIIIIlll = TileItems.getNearest((String[])stringArray);
        if (H.lllllIIIlIlI(lIIIIIlll) && H.lllllIIIIlll(H.cu() ? 1 : 0)) {
            AccBuilderRogues.c = lIIlIIlIII[lIIlIIlIlI[177]];
            System.out.println(lIIlIIlIII[lIIlIIlIlI[178]]);
            lIIIIIlll.interact(lIIlIIlIII[lIIlIIlIlI[179]]);
            Time.sleepTicks((int)lIIlIIlIlI[10]);

        }
        if (H.lllllIIIlIIl(H.cu() ? 1 : 0)) {
            void lIIIIlIIl;
            void lIIIIlIlI;
            void lIIIIlIll;
            void lIIIIllII;
            int lIIIIIlIl;
            TileObject lIIIIIllI;
            void lIIIIllIl;
            if (H.lllllIIIIlll(lIIIIllIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && H.lllllIIIlIlI(lIIIIIllI = TileObjects.getNearest(tileObject -> {
                int n2;
                if (H.lllllIIIIlll(tileObject.getName().contains(lIIlIIlIII[lIIlIIlIlI[218]]) ? 1 : 0) && H.lllllIIIllll(tileObject.getWorldLocation().distanceTo(new WorldPoint(lIIlIIlIlI[219], lIIlIIlIlI[220], lIIlIIlIlI[10])), lIIlIIlIlI[3])) {
                    n2 = lIIlIIlIlI[1];

                    if (1 == (0x65 ^ 0x1C ^ (0x13 ^ 0x6E))) {
                        return ((0xDA ^ 0xAA ^ (0xEA ^ 0xA9)) & (0x9B ^ 0xAA ^ 2 ^ -1)) != 0;
                    }
                } else {
                    n2 = lIIlIIlIlI[0];
                }
                return n2 != 0;
            }))) {
                lIIIIIlIl = Skills.getExperience((Skill)Skill.AGILITY);
                AccBuilderRogues.c = lIIlIIlIII[lIIlIIlIlI[180]];
                lIIIIIllI.interact(lIIlIIlIII[lIIlIIlIlI[79]]);
                Time.sleepTicks((int)e.c(lIIlIIlIlI[1], lIIlIIlIlI[3]));

                Time.sleepUntil(() -> {
                    boolean bl;
                    if (H.lllllIIIlIll(Skills.getExperience((Skill)Skill.AGILITY), lIIIIIlIl)) {
                        bl = lIIlIIlIlI[1];

                        if (((0xF0 ^ 0xAC) & ~(0x76 ^ 0x2A)) <= -1) {
                            return false;
                        }
                    } else {
                        bl = lIIlIIlIlI[0];
                    }
                    return bl;
                }, (int)lIIlIIlIlI[104]);

                Time.sleepTicks((int)lIIlIIlIlI[1]);

            }
            if (H.lllllIIIIlll(H.cu() ? 1 : 0)) {
                return;
            }
            if (H.lllllIIIIlll(lIIIIllII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && H.lllllIIIlIlI(lIIIIIllI = TileObjects.getNearest(tileObject -> {
                int n2;
                if (H.lllllIIIIlll(tileObject.getName().contains(lIIlIIlIII[lIIlIIlIlI[216]]) ? 1 : 0) && H.lllllIIIllll(tileObject.getWorldLocation().distanceTo(new WorldPoint(lIIlIIlIlI[217], lIIlIIlIlI[128], lIIlIIlIlI[3])), lIIlIIlIlI[3])) {
                    n2 = lIIlIIlIlI[1];

                    if (1 <= 0) {
                        return ((0xDC ^ 0x8B ^ (6 ^ 0x72)) & (0x6E ^ 0x3C ^ (0x5A ^ 0x2B) ^ -1)) != 0;
                    }
                } else {
                    n2 = lIIlIIlIlI[0];
                }
                return n2 != 0;
            }))) {
                AccBuilderRogues.c = lIIlIIlIII[lIIlIIlIlI[181]];
                lIIIIIlIl = Skills.getExperience((Skill)Skill.AGILITY);
                lIIIIIllI.interact(lIIlIIlIII[lIIlIIlIlI[182]]);
                Time.sleepTicks((int)e.c(lIIlIIlIlI[1], lIIlIIlIlI[3]));

                Time.sleepUntil(() -> {
                    boolean bl;
                    if (H.lllllIIIlIll(Skills.getExperience((Skill)Skill.AGILITY), lIIIIIlIl)) {
                        bl = lIIlIIlIlI[1];

                        if (2 == 0) {
                            return (3 & (3 ^ -1)) != 0;
                        }
                    } else {
                        bl = lIIlIIlIlI[0];
                    }
                    return bl;
                }, (int)lIIlIIlIlI[104]);

                Time.sleepTicks((int)lIIlIIlIlI[1]);

            }
            if (H.lllllIIIIlll(H.cu() ? 1 : 0)) {
                return;
            }
            if (H.lllllIIIIlll(lIIIIlIll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && H.lllllIIIlIlI(lIIIIIllI = TileObjects.getNearest(tileObject -> {
                int n2;
                if (H.lllllIIIIlll(tileObject.getName().contains(lIIlIIlIII[lIIlIIlIlI[213]]) ? 1 : 0) && H.lllllIIIllll(tileObject.getWorldLocation().distanceTo(new WorldPoint(lIIlIIlIlI[214], lIIlIIlIlI[215], lIIlIIlIlI[3])), lIIlIIlIlI[3])) {
                    n2 = lIIlIIlIlI[1];

                    }
                } else {
                    n2 = lIIlIIlIlI[0];
                }
                return n2 != 0;
            }))) {
                AccBuilderRogues.c = lIIlIIlIII[lIIlIIlIlI[183]];
                lIIIIIlIl = Skills.getExperience((Skill)Skill.AGILITY);
                lIIIIIllI.interact(lIIlIIlIII[lIIlIIlIlI[184]]);
                Time.sleepTicks((int)e.c(lIIlIIlIlI[1], lIIlIIlIlI[3]));

                Time.sleepUntil(() -> {
                    boolean bl;
                    if (H.lllllIIIlIll(Skills.getExperience((Skill)Skill.AGILITY), lIIIIIlIl)) {
                        bl = lIIlIIlIlI[1];

                        if (-1 >= 2) {
                            return false;
                        }
                    } else {
                        bl = lIIlIIlIlI[0];
                    }
                    return bl;
                }, (int)lIIlIIlIlI[104]);

                Time.sleepTicks((int)lIIlIIlIlI[1]);

            }
            if (H.lllllIIIIlll(H.cu() ? 1 : 0)) {
                return;
            }
            if (H.lllllIIIIlll(lIIIIlIlI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && H.lllllIIIlIlI(lIIIIIllI = TileObjects.getNearest(tileObject -> {
                int n2;
                if (H.lllllIIIIlll(tileObject.getName().contains(lIIlIIlIII[lIIlIIlIlI[211]]) ? 1 : 0) && H.lllllIIIllll(tileObject.getWorldLocation().distanceTo(new WorldPoint(lIIlIIlIlI[209], lIIlIIlIlI[212], lIIlIIlIlI[10])), lIIlIIlIlI[3])) {
                    n2 = lIIlIIlIlI[1];

                    if ((0xE ^ 0xA) != (0x8F ^ 0x8B)) {
                        return false;
                    }
                } else {
                    n2 = lIIlIIlIlI[0];
                }
                return n2 != 0;
            }))) {
                AccBuilderRogues.c = lIIlIIlIII[lIIlIIlIlI[185]];
                lIIIIIlIl = Skills.getExperience((Skill)Skill.AGILITY);
                lIIIIIllI.interact(lIIlIIlIII[lIIlIIlIlI[186]]);
                Time.sleepTicks((int)e.c(lIIlIIlIlI[1], lIIlIIlIlI[3]));

                Time.sleepUntil(() -> {
                    boolean bl;
                    if (H.lllllIIIlIll(Skills.getExperience((Skill)Skill.AGILITY), lIIIIIlIl)) {
                        bl = lIIlIIlIlI[1];

                        }
                    } else {
                        bl = lIIlIIlIlI[0];
                    }
                    return bl;
                }, (int)lIIlIIlIlI[104]);

                Time.sleepTicks((int)lIIlIIlIlI[1]);

            }
            if (H.lllllIIIIlll(H.cu() ? 1 : 0)) {
                return;
            }
            if (H.lllllIIIIlll(lIIIIlIIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && H.lllllIIIlIlI(lIIIIIllI = TileObjects.getNearest(tileObject -> {
                int n2;
                if (H.lllllIIIIlll(tileObject.getName().contains(lIIlIIlIII[lIIlIIlIlI[208]]) ? 1 : 0) && H.lllllIIIllll(tileObject.getWorldLocation().distanceTo(new WorldPoint(lIIlIIlIlI[209], lIIlIIlIlI[210], lIIlIIlIlI[3])), lIIlIIlIlI[3])) {
                    n2 = lIIlIIlIlI[1];

                    }
                } else {
                    n2 = lIIlIIlIlI[0];
                }
                return n2 != 0;
            }))) {
                AccBuilderRogues.c = lIIlIIlIII[lIIlIIlIlI[187]];
                lIIIIIlIl = Skills.getExperience((Skill)Skill.AGILITY);
                lIIIIIllI.interact(lIIlIIlIII[lIIlIIlIlI[188]]);
                Time.sleepTicks((int)e.c(lIIlIIlIlI[1], lIIlIIlIlI[3]));

                Time.sleepUntil(() -> {
                    boolean bl;
                    if (H.lllllIIIlIll(Skills.getExperience((Skill)Skill.AGILITY), lIIIIIlIl)) {
                        bl = lIIlIIlIlI[1];

                        if (-1 != -1) {
                            return false;
                        }
                    } else {
                        bl = lIIlIIlIlI[0];
                    }
                    return bl;
                }, (int)lIIlIIlIlI[104]);

                Time.sleepTicks((int)lIIlIIlIlI[1]);

            }
        }
    }

    private static boolean lllllIIIlIlI(Object object) {
        return object != null;
    }

    @Override
    public boolean V() {
        boolean bl;
        if (H.lllllIIIllIl(Skills.getLevel((Skill)Skill.AGILITY), lIIlIIlIlI[2])) {
            bl = lIIlIIlIlI[1];

            if (1 < 0) {
                return ((169 + 111 - 84 + 0 ^ 42 + 91 - 121 + 131) & (0xF ^ 0x60 ^ (0x2F ^ 0xB) ^ -1)) != 0;
            }
        } else {
            bl = lIIlIIlIlI[0];
        }
        return bl;
    }

    static {
        H.lllllIIIIllI();
        H.lllllIIIIlIl();
        bv = new ArrayList<d>();
        iw = lIIlIIlIlI[28];
        ix = lIIlIIlIlI[24];
        iz = new WorldArea(lIIlIIlIlI[235], lIIlIIlIlI[52], lIIlIIlIlI[69], lIIlIIlIlI[72], lIIlIIlIlI[0]);
        iA = new WorldArea(lIIlIIlIlI[235], lIIlIIlIlI[52], lIIlIIlIlI[69], lIIlIIlIlI[72], lIIlIIlIlI[1]);
        iB = new WorldArea(lIIlIIlIlI[235], lIIlIIlIlI[52], lIIlIIlIlI[69], lIIlIIlIlI[72], lIIlIIlIlI[3]);
        iC = new WorldPoint(lIIlIIlIlI[236], lIIlIIlIlI[237], lIIlIIlIlI[0]);
    }

    /*
     * WARNING - void declaration
     */
    private static boolean cu() {
        WorldArea worldArea = new WorldArea(lIIlIIlIlI[80], lIIlIIlIlI[81], lIIlIIlIlI[69], lIIlIIlIlI[64], lIIlIIlIlI[0]);
        WorldArea worldArea2 = new WorldArea(lIIlIIlIlI[82], lIIlIIlIlI[81], lIIlIIlIlI[12], lIIlIIlIlI[64], lIIlIIlIlI[10]);
        WorldArea worldArea3 = new WorldArea(lIIlIIlIlI[83], lIIlIIlIlI[84], lIIlIIlIlI[63], lIIlIIlIlI[49], lIIlIIlIlI[10]);
        WorldArea worldArea4 = new WorldArea(lIIlIIlIlI[189], lIIlIIlIlI[190], lIIlIIlIlI[25], lIIlIIlIlI[19], lIIlIIlIlI[1]);
        WorldArea worldArea5 = new WorldArea(lIIlIIlIlI[85], lIIlIIlIlI[87], lIIlIIlIlI[12], lIIlIIlIlI[25], lIIlIIlIlI[10]);
        WorldArea worldArea6 = new WorldArea(lIIlIIlIlI[191], lIIlIIlIlI[192], lIIlIIlIlI[73], lIIlIIlIlI[39], lIIlIIlIlI[10]);
        WorldArea worldArea7 = new WorldArea(lIIlIIlIlI[90], lIIlIIlIlI[91], lIIlIIlIlI[66], lIIlIIlIlI[64], lIIlIIlIlI[10]);
        WorldArea worldArea8 = new WorldArea(lIIlIIlIlI[92], lIIlIIlIlI[93], lIIlIIlIlI[23], lIIlIIlIlI[27], lIIlIIlIlI[10]);
        WorldArea worldArea9 = new WorldArea(lIIlIIlIlI[92], lIIlIIlIlI[94], lIIlIIlIlI[12], lIIlIIlIlI[23], lIIlIIlIlI[10]);
        WorldArea worldArea10 = new WorldArea(lIIlIIlIlI[127], lIIlIIlIlI[128], lIIlIIlIlI[49], lIIlIIlIlI[12], lIIlIIlIlI[3]);
        WorldArea worldArea11 = new WorldArea(lIIlIIlIlI[129], lIIlIIlIlI[127], lIIlIIlIlI[49], lIIlIIlIlI[25], lIIlIIlIlI[3]);
        WorldArea worldArea12 = new WorldArea(lIIlIIlIlI[130], lIIlIIlIlI[131], lIIlIIlIlI[63], lIIlIIlIlI[49], lIIlIIlIlI[3]);
        WorldArea worldArea13 = new WorldArea(lIIlIIlIlI[132], lIIlIIlIlI[133], lIIlIIlIlI[12], lIIlIIlIlI[64], lIIlIIlIlI[10]);
        WorldArea worldArea14 = new WorldArea(lIIlIIlIlI[134], lIIlIIlIlI[9], lIIlIIlIlI[49], lIIlIIlIlI[27], lIIlIIlIlI[3]);
        WorldArea worldArea15 = new WorldArea(lIIlIIlIlI[135], lIIlIIlIlI[136], lIIlIIlIlI[68], lIIlIIlIlI[53], lIIlIIlIlI[10]);
        WorldArea worldArea16 = new WorldArea(lIIlIIlIlI[137], lIIlIIlIlI[138], lIIlIIlIlI[63], lIIlIIlIlI[64], lIIlIIlIlI[3]);
        WorldArea worldArea17 = new WorldArea(lIIlIIlIlI[164], lIIlIIlIlI[133], lIIlIIlIlI[64], lIIlIIlIlI[12], lIIlIIlIlI[10]);
        WorldArea worldArea18 = new WorldArea(lIIlIIlIlI[165], lIIlIIlIlI[139], lIIlIIlIlI[39], lIIlIIlIlI[53], lIIlIIlIlI[3]);
        WorldArea worldArea19 = new WorldArea(lIIlIIlIlI[166], lIIlIIlIlI[134], lIIlIIlIlI[49], lIIlIIlIlI[27], lIIlIIlIlI[3]);
        WorldArea worldArea20 = new WorldArea(lIIlIIlIlI[167], lIIlIIlIlI[136], lIIlIIlIlI[70], lIIlIIlIlI[64], lIIlIIlIlI[10]);
        WorldArea worldArea21 = new WorldArea(lIIlIIlIlI[168], lIIlIIlIlI[169], lIIlIIlIlI[54], lIIlIIlIlI[63], lIIlIIlIlI[3]);
        WorldArea[] worldAreaArray = new WorldArea[lIIlIIlIlI[68]];
        worldAreaArray[H.lIIlIIlIlI[0]] = worldArea;
        worldAreaArray[H.lIIlIIlIlI[1]] = worldArea2;
        worldAreaArray[H.lIIlIIlIlI[3]] = worldArea3;
        worldAreaArray[H.lIIlIIlIlI[10]] = worldArea4;
        worldAreaArray[H.lIIlIIlIlI[17]] = worldArea5;
        worldAreaArray[H.lIIlIIlIlI[19]] = worldArea6;
        worldAreaArray[H.lIIlIIlIlI[21]] = worldArea7;
        worldAreaArray[H.lIIlIIlIlI[23]] = worldArea8;
        worldAreaArray[H.lIIlIIlIlI[25]] = worldArea9;
        worldAreaArray[H.lIIlIIlIlI[27]] = worldArea10;
        worldAreaArray[H.lIIlIIlIlI[12]] = worldArea11;
        worldAreaArray[H.lIIlIIlIlI[49]] = worldArea12;
        worldAreaArray[H.lIIlIIlIlI[63]] = worldArea13;
        worldAreaArray[H.lIIlIIlIlI[64]] = worldArea14;
        worldAreaArray[H.lIIlIIlIlI[53]] = worldArea15;
        worldAreaArray[H.lIIlIIlIlI[39]] = worldArea16;
        worldAreaArray[H.lIIlIIlIlI[65]] = worldArea17;
        worldAreaArray[H.lIIlIIlIlI[66]] = worldArea18;
        worldAreaArray[H.lIIlIIlIlI[54]] = worldArea19;
        worldAreaArray[H.lIIlIIlIlI[67]] = worldArea20;
        worldAreaArray[H.lIIlIIlIlI[41]] = worldArea21;
        WorldArea[] worldAreaArray2 = worldAreaArray;
        int[] nArray = new int[lIIlIIlIlI[1]];
        nArray[H.lIIlIIlIlI[0]] = lIIlIIlIlI[193];
        if (H.lllllIIIlIlI(TileItems.getNearest((int[])nArray))) {
            void llIllIII;
            System.out.println(lIIlIIlIII[lIIlIIlIlI[194]]);
            int llIlIlll = lIIlIIlIlI[0];
            while (H.lllllIIIlIII(llIlIlll, ((void)llIllIII).length)) {
                int[] nArray2 = new int[lIIlIIlIlI[1]];
                nArray2[H.lIIlIIlIlI[0]] = lIIlIIlIlI[193];
                if (H.lllllIIIIlll(llIllIII[llIlIlll].contains(TileItems.getNearest((int[])nArray2).getWorldLocation()) ? 1 : 0) && H.lllllIIIIlll(llIllIII[llIlIlll].contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    return lIIlIIlIlI[1];
                }
                ++llIlIlll;

                if (1 >= 0) continue;
                return false;
            }
        }
        return lIIlIIlIlI[0];
    }

    private static void lllllIIIIlIl() {
        lIIlIIlIII = new String[lIIlIIlIlI[238]];
        H.lIIlIIlIII[H.lIIlIIlIlI[0]] = "Buying items";
        H.lIIlIIlIII[H.lIIlIIlIlI[1]] = "Finished buying items, switching back to agility";
        H.lIIlIIlIII[H.lIIlIIlIlI[3]] = "Navigating to bank";
        H.lIIlIIlIII[H.lIIlIIlIlI[10]] = "Handling banking";
        H.lIIlIIlIII[H.lIIlIIlIlI[17]] = "We are missing quest supplies, switching to BUYING";
        H.lIIlIIlIII[H.lIIlIIlIlI[19]] = "Vial";
        H.lIIlIIlIII[H.lIIlIIlIlI[21]] = "Vial";
        H.lIIlIIlIII[H.lIIlIIlIlI[23]] = "Drop";
        H.lIIlIIlIII[H.lIIlIIlIlI[25]] = "Drink";
        H.lIIlIIlIII[H.lIIlIIlIlI[27]] = "Eat";
        H.lIIlIIlIII[H.lIIlIIlIlI[12]] = "Nav to gnome course";
        H.lIIlIIlIII[H.lIIlIIlIlI[49]] = "Crossing log";
        H.lIIlIIlIII[H.lIIlIIlIlI[63]] = "Log balance";
        H.lIIlIIlIII[H.lIIlIIlIlI[64]] = "Walk-across";
        H.lIIlIIlIII[H.lIIlIIlIlI[53]] = "Climbing net";
        H.lIIlIIlIII[H.lIIlIIlIlI[39]] = "Obstacle net";
        H.lIIlIIlIII[H.lIIlIIlIlI[65]] = "Climb-over";
        H.lIIlIIlIII[H.lIIlIIlIlI[66]] = "Climbing branch";
        H.lIIlIIlIII[H.lIIlIIlIlI[54]] = "Tree branch";
        H.lIIlIIlIII[H.lIIlIIlIlI[67]] = "Climb";
        H.lIIlIIlIII[H.lIIlIIlIlI[41]] = "Crossing rope";
        H.lIIlIIlIII[H.lIIlIIlIlI[68]] = "Balancing rope";
        H.lIIlIIlIII[H.lIIlIIlIlI[61]] = "Walk-on";
        H.lIIlIIlIII[H.lIIlIIlIlI[69]] = "Climbing down";
        H.lIIlIIlIII[H.lIIlIIlIlI[70]] = "Tree branch";
        H.lIIlIIlIII[H.lIIlIIlIlI[42]] = "Climb-down";
        H.lIIlIIlIII[H.lIIlIIlIlI[71]] = "Climbing net";
        H.lIIlIIlIII[H.lIIlIIlIlI[72]] = "Obstacle net";
        H.lIIlIIlIII[H.lIIlIIlIlI[73]] = "Climb-over";
        H.lIIlIIlIII[H.lIIlIIlIlI[74]] = "Crossing pipe";
        H.lIIlIIlIII[H.lIIlIIlIlI[2]] = "Obstacle pipe";
        H.lIIlIIlIII[H.lIIlIIlIlI[75]] = "Squeeze-through";
        H.lIIlIIlIII[H.lIIlIIlIlI[95]] = "Nav to start";
        H.lIIlIIlIII[H.lIIlIIlIlI[97]] = "Mark of grace";
        H.lIIlIIlIII[H.lIIlIIlIlI[98]] = "Taking mark";
        H.lIIlIIlIII[H.lIIlIIlIlI[99]] = "Found mark on ground";
        H.lIIlIIlIII[H.lIIlIIlIlI[100]] = "Take";
        H.lIIlIIlIII[H.lIIlIIlIlI[101]] = "Starting course";
        H.lIIlIIlIII[H.lIIlIIlIlI[102]] = "Rough wall";
        H.lIIlIIlIII[H.lIIlIIlIlI[103]] = "Climb";
        H.lIIlIIlIII[H.lIIlIIlIlI[38]] = "Crossing clothes line";
        H.lIIlIIlIII[H.lIIlIIlIlI[105]] = "Clothes line";
        H.lIIlIIlIII[H.lIIlIIlIlI[106]] = "Cross";
        H.lIIlIIlIII[H.lIIlIIlIlI[107]] = "Leaping";
        H.lIIlIIlIII[H.lIIlIIlIlI[108]] = "Gap";
        H.lIIlIIlIII[H.lIIlIIlIlI[109]] = "Leap";
        H.lIIlIIlIII[H.lIIlIIlIlI[110]] = "Balancing";
        H.lIIlIIlIII[H.lIIlIIlIlI[111]] = "Wall";
        H.lIIlIIlIII[H.lIIlIIlIlI[112]] = "Balance";
        H.lIIlIIlIII[H.lIIlIIlIlI[113]] = "Jumping gap";
        H.lIIlIIlIII[H.lIIlIIlIlI[40]] = "Gap";
        H.lIIlIIlIII[H.lIIlIIlIlI[7]] = "Leap";
        H.lIIlIIlIII[H.lIIlIIlIlI[114]] = "Jumping gap 2";
        H.lIIlIIlIII[H.lIIlIIlIlI[116]] = "Leap";
        H.lIIlIIlIII[H.lIIlIIlIlI[117]] = "Jumping gap 3";
        H.lIIlIIlIII[H.lIIlIIlIlI[119]] = "Leap";
        H.lIIlIIlIII[H.lIIlIIlIlI[120]] = "Hurdle roof";
        H.lIIlIIlIII[H.lIIlIIlIlI[122]] = "Hurdle";
        H.lIIlIIlIII[H.lIIlIIlIlI[123]] = "Finishing course";
        H.lIIlIIlIII[H.lIIlIIlIlI[124]] = "Edge";
        H.lIIlIIlIII[H.lIIlIIlIlI[44]] = "Jump-off";
        H.lIIlIIlIII[H.lIIlIIlIlI[140]] = "Nav to canafis course";
        H.lIIlIIlIII[H.lIIlIIlIlI[6]] = "Nav to start";
        H.lIIlIIlIII[H.lIIlIIlIlI[141]] = "Starting course";
        H.lIIlIIlIII[H.lIIlIIlIlI[142]] = "Tall tree";
        H.lIIlIIlIII[H.lIIlIIlIlI[143]] = "Climb";
        H.lIIlIIlIII[H.lIIlIIlIlI[144]] = "Mark of grace";
        H.lIIlIIlIII[H.lIIlIIlIlI[145]] = "Taking mark";
        H.lIIlIIlIII[H.lIIlIIlIlI[146]] = "Found mark on ground";
        H.lIIlIIlIII[H.lIIlIIlIlI[147]] = "Take";
        H.lIIlIIlIII[H.lIIlIIlIlI[148]] = "Jumping gap 1";
        H.lIIlIIlIII[H.lIIlIIlIlI[149]] = "Jump";
        H.lIIlIIlIII[H.lIIlIIlIlI[150]] = "Jumping gap 2";
        H.lIIlIIlIII[H.lIIlIIlIlI[151]] = "Jump";
        H.lIIlIIlIII[H.lIIlIIlIlI[152]] = "Jumping gap 3";
        H.lIIlIIlIII[H.lIIlIIlIlI[153]] = "Jump";
        H.lIIlIIlIII[H.lIIlIIlIlI[154]] = "Jumping gap 4";
        H.lIIlIIlIII[H.lIIlIIlIlI[155]] = "Jump";
        H.lIIlIIlIII[H.lIIlIIlIlI[156]] = "Vaulting";
        H.lIIlIIlIII[H.lIIlIIlIlI[157]] = "Vault";
        H.lIIlIIlIII[H.lIIlIIlIlI[158]] = "Jumping gap 5";
        H.lIIlIIlIII[H.lIIlIIlIlI[159]] = "Jump";
        H.lIIlIIlIII[H.lIIlIIlIlI[160]] = "Jumping gap 6";
        H.lIIlIIlIII[H.lIIlIIlIlI[161]] = "Jump";
        H.lIIlIIlIII[H.lIIlIIlIlI[172]] = "Nav to canafis course";
        H.lIIlIIlIII[H.lIIlIIlIlI[173]] = "Nav to start";
        H.lIIlIIlIII[H.lIIlIIlIlI[174]] = "Starting course";
        H.lIIlIIlIII[H.lIIlIIlIlI[175]] = "Wall";
        H.lIIlIIlIII[H.lIIlIIlIlI[36]] = "Climb-up";
        H.lIIlIIlIII[H.lIIlIIlIlI[176]] = "Mark of grace";
        H.lIIlIIlIII[H.lIIlIIlIlI[177]] = "Taking mark";
        H.lIIlIIlIII[H.lIIlIIlIlI[178]] = "Found mark on ground";
        H.lIIlIIlIII[H.lIIlIIlIlI[179]] = "Take";
        H.lIIlIIlIII[H.lIIlIIlIlI[180]] = "Jumping gap 1";
        H.lIIlIIlIII[H.lIIlIIlIlI[79]] = "Jump";
        H.lIIlIIlIII[H.lIIlIIlIlI[181]] = "cross rope";
        H.lIIlIIlIII[H.lIIlIIlIlI[182]] = "Cross";
        H.lIIlIIlIII[H.lIIlIIlIlI[183]] = "Jumping gap 3";
        H.lIIlIIlIII[H.lIIlIIlIlI[184]] = "Jump";
        H.lIIlIIlIII[H.lIIlIIlIlI[185]] = "Jumping gap 4";
        H.lIIlIIlIII[H.lIIlIIlIlI[186]] = "Jump";
        H.lIIlIIlIII[H.lIIlIIlIlI[187]] = "Jumping Edge";
        H.lIIlIIlIII[H.lIIlIIlIlI[188]] = "Jump";
        H.lIIlIIlIII[H.lIIlIIlIlI[194]] = "Found mark on ground";
        H.lIIlIIlIII[H.lIIlIIlIlI[203]] = "Agility";
        H.lIIlIIlIII[H.lIIlIIlIlI[204]] = "passage";
        H.lIIlIIlIII[H.lIIlIIlIlI[205]] = "passage";
        H.lIIlIIlIII[H.lIIlIIlIlI[206]] = "passage";
        H.lIIlIIlIII[H.lIIlIIlIlI[207]] = "passage";
        H.lIIlIIlIII[H.lIIlIIlIlI[208]] = "Edge";
        H.lIIlIIlIII[H.lIIlIIlIlI[211]] = "Gap";
        H.lIIlIIlIII[H.lIIlIIlIlI[213]] = "Gap";
        H.lIIlIIlIII[H.lIIlIIlIlI[216]] = "Tightrope";
        H.lIIlIIlIII[H.lIIlIIlIlI[218]] = "Gap";
        H.lIIlIIlIII[H.lIIlIIlIlI[221]] = "Gap";
        H.lIIlIIlIII[H.lIIlIIlIlI[224]] = "Gap";
        H.lIIlIIlIII[H.lIIlIIlIlI[226]] = "Pole-vault";
        H.lIIlIIlIII[H.lIIlIIlIlI[227]] = "Gap";
        H.lIIlIIlIII[H.lIIlIIlIlI[230]] = "Gap";
        H.lIIlIIlIII[H.lIIlIIlIlI[232]] = "Gap";
        H.lIIlIIlIII[H.lIIlIIlIlI[233]] = "Gap";
    }

    public static void cp() {
        if (H.lllllIIIIlll(bt ? 1 : 0)) {
            AccBuilderRogues.c = lIIlIIlIII[lIIlIIlIlI[0]];
            b.a(bv);
            if (H.lllllIIIlIII(bv.size(), lIIlIIlIlI[1])) {
                System.out.println(lIIlIIlIII[lIIlIIlIlI[1]]);
                bt = lIIlIIlIlI[0];
            }
        }
        if (H.lllllIIIlIIl(bt ? 1 : 0) && H.lllllIIIlIII(Skills.getLevel((Skill)Skill.AGILITY), lIIlIIlIlI[2])) {
            if (H.lllllIIIlIIl(H.ab() ? 1 : 0)) {
                BankLocation lIllIlIll = BankLocation.getNearest();
                if (H.lllllIIIlIlI(lIllIlIll) && H.lllllIIIlIIl(lIllIlIll.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderRogues.c = lIIlIIlIII[lIIlIIlIlI[3]];
                    WorldArea lIllIlIlI = new WorldArea(lIIlIIlIlI[4], lIIlIIlIlI[5], lIIlIIlIlI[6], lIIlIIlIlI[7], lIIlIIlIlI[0]);
                    if (H.lllllIIIIlll(lIllIlIlI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        WorldPoint lIllIlIIl = new WorldPoint(lIIlIIlIlI[8], lIIlIIlIlI[9], lIIlIIlIlI[0]);
                        if (H.lllllIIIlIll(Players.getLocal().getWorldLocation().distanceTo(lIllIlIIl), lIIlIIlIlI[10])) {
                            Movement.walkTo((WorldPoint)lIllIlIIl);

                            Time.sleepTicks((int)lIIlIIlIlI[1]);

                        }
                    }
                    a.a(lIllIlIll);
                }
                if (H.lllllIIIlIlI(lIllIlIll) && H.lllllIIIIlll(lIllIlIll.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderRogues.c = lIIlIIlIII[lIIlIIlIlI[10]];
                    if (H.lllllIIIlIIl(Bank.isOpen() ? 1 : 0)) {
                        a.a();
                        Time.sleepUntil(() -> Bank.isOpen(), (int)lIIlIIlIlI[11]);

                    }
                    if (H.lllllIIIIlll(Bank.isOpen() ? 1 : 0)) {
                        if (H.lllllIIIllII(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks((int)lIIlIIlIlI[1]);

                        }
                        if (H.lllllIIIllII(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks((int)lIIlIIlIlI[3]);

                        }
                    }
                    int[] nArray = new int[lIIlIIlIlI[12]];
                    nArray[H.lIIlIIlIlI[0]] = lIIlIIlIlI[13];
                    nArray[H.lIIlIIlIlI[1]] = lIIlIIlIlI[14];
                    nArray[H.lIIlIIlIlI[3]] = lIIlIIlIlI[15];
                    nArray[H.lIIlIIlIlI[10]] = lIIlIIlIlI[16];
                    nArray[H.lIIlIIlIlI[17]] = lIIlIIlIlI[18];
                    nArray[H.lIIlIIlIlI[19]] = lIIlIIlIlI[20];
                    nArray[H.lIIlIIlIlI[21]] = lIIlIIlIlI[22];
                    nArray[H.lIIlIIlIlI[23]] = lIIlIIlIlI[24];
                    nArray[H.lIIlIIlIlI[25]] = lIIlIIlIlI[26];
                    nArray[H.lIIlIIlIlI[27]] = lIIlIIlIlI[28];
                    if (H.lllllIIIlIIl(e.b(nArray) ? 1 : 0)) {
                        H.af();
                        System.out.println(lIIlIIlIII[lIIlIIlIlI[17]]);
                        bt = lIIlIIlIlI[1];
                        return;
                    }
                    int[] nArray2 = new int[lIIlIIlIlI[12]];
                    nArray2[H.lIIlIIlIlI[0]] = lIIlIIlIlI[13];
                    nArray2[H.lIIlIIlIlI[1]] = lIIlIIlIlI[14];
                    nArray2[H.lIIlIIlIlI[3]] = lIIlIIlIlI[15];
                    nArray2[H.lIIlIIlIlI[10]] = lIIlIIlIlI[16];
                    nArray2[H.lIIlIIlIlI[17]] = lIIlIIlIlI[18];
                    nArray2[H.lIIlIIlIlI[19]] = lIIlIIlIlI[20];
                    nArray2[H.lIIlIIlIlI[21]] = lIIlIIlIlI[22];
                    nArray2[H.lIIlIIlIlI[23]] = lIIlIIlIlI[24];
                    nArray2[H.lIIlIIlIlI[25]] = lIIlIIlIlI[26];
                    nArray2[H.lIIlIIlIlI[27]] = lIIlIIlIlI[28];
                    if (H.lllllIIIIlll(e.b(nArray2) ? 1 : 0)) {
                        a.a(lIIlIIlIlI[29], lIIlIIlIlI[1]);
                        a.a(lIIlIIlIlI[30], lIIlIIlIlI[1]);
                        a.a(lIIlIIlIlI[31], lIIlIIlIlI[1]);
                        a.a(lIIlIIlIlI[32], lIIlIIlIlI[1]);
                        a.a(lIIlIIlIlI[33], lIIlIIlIlI[1]);
                        a.a(lIIlIIlIlI[34], lIIlIIlIlI[1]);
                        a.a(lIIlIIlIlI[35], lIIlIIlIlI[1]);
                        int[] nArray3 = new int[lIIlIIlIlI[1]];
                        nArray3[H.lIIlIIlIlI[0]] = lIIlIIlIlI[29];
                        if (H.lllllIIIlIIl(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                            int[] nArray4 = new int[lIIlIIlIlI[1]];
                            nArray4[H.lIIlIIlIlI[0]] = lIIlIIlIlI[29];
                            if (H.lllllIIIlIIl(Equipment.contains((int[])nArray4) ? 1 : 0)) {
                                int[] nArray5 = new int[lIIlIIlIlI[1]];
                                nArray5[H.lIIlIIlIlI[0]] = lIIlIIlIlI[29];
                                if (H.lllllIIIlIIl(Bank.contains((int[])nArray5) ? 1 : 0)) {
                                    a.a(lIIlIIlIlI[36], lIIlIIlIlI[1]);
                                }
                            }
                        }
                        a.a(lIIlIIlIlI[18], lIIlIIlIlI[1]);
                        e.l(lIIlIIlIlI[29]);
                        e.l(lIIlIIlIlI[30]);
                        e.l(lIIlIIlIlI[31]);
                        e.l(lIIlIIlIlI[32]);
                        e.l(lIIlIIlIlI[33]);
                        Time.sleepTicks((int)lIIlIIlIlI[1]);

                        e.l(lIIlIIlIlI[35]);
                        e.l(lIIlIIlIlI[37]);
                        e.l(lIIlIIlIlI[34]);
                        e.l(lIIlIIlIlI[36]);
                        e.l(lIIlIIlIlI[18]);
                        Time.sleepTicks((int)lIIlIIlIlI[10]);

                        if (H.lllllIIIlIIl(Bank.isOpen() ? 1 : 0)) {
                            a.a();
                            Time.sleepTicks((int)lIIlIIlIlI[21]);

                        }
                        if (H.lllllIIIIlll(Bank.isOpen() ? 1 : 0)) {
                            if (H.lllllIIIlIII(Skills.getLevel((Skill)Skill.AGILITY), lIIlIIlIlI[38])) {
                                a.a(lIIlIIlIlI[13], lIIlIIlIlI[12]);
                                a.a(lIIlIIlIlI[14], lIIlIIlIlI[12]);
                                a.a(lIIlIIlIlI[22], lIIlIIlIlI[12]);
                                a.a(lIIlIIlIlI[15], lIIlIIlIlI[12]);
                                a.b(f.bf, lIIlIIlIlI[1]);
                                a.a(lIIlIIlIlI[28], lIIlIIlIlI[1]);
                                a.a(lIIlIIlIlI[20], lIIlIIlIlI[19]);
                                a.a(lIIlIIlIlI[24], lIIlIIlIlI[39]);
                            }
                            if (H.lllllIIIllIl(Skills.getLevel((Skill)Skill.AGILITY), lIIlIIlIlI[38])) {
                                a.a(lIIlIIlIlI[13], lIIlIIlIlI[12]);
                                a.a(lIIlIIlIlI[22], lIIlIIlIlI[12]);
                                a.a(lIIlIIlIlI[26], lIIlIIlIlI[12]);
                                a.b(f.bf, lIIlIIlIlI[1]);
                                a.a(lIIlIIlIlI[28], lIIlIIlIlI[1]);
                                a.a(lIIlIIlIlI[20], lIIlIIlIlI[25]);
                                a.a(lIIlIIlIlI[24], lIIlIIlIlI[12]);
                            }
                        }
                    }
                }
            }
            if (H.lllllIIIIlll(H.ab() ? 1 : 0)) {
                String[] stringArray = new String[lIIlIIlIlI[1]];
                stringArray[H.lIIlIIlIlI[0]] = lIIlIIlIII[lIIlIIlIlI[19]];
                if (H.lllllIIIIlll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    String[] stringArray2 = new String[lIIlIIlIlI[1]];
                    stringArray2[H.lIIlIIlIlI[0]] = lIIlIIlIII[lIIlIIlIlI[21]];
                    Inventory.getFirst((String[])stringArray2).interact(lIIlIIlIII[lIIlIIlIlI[23]]);
                }
                if (H.lllllIIIIlll(Inventory.contains((int[])f.aV) ? 1 : 0) && H.lllllIIIlIII(Movement.getRunEnergy(), lIIlIIlIlI[40])) {
                    Inventory.getFirst((int[])f.aV).interact(lIIlIIlIII[lIIlIIlIlI[25]]);
                    Time.sleepTicks((int)lIIlIIlIlI[1]);

                }
                if (H.lllllIIIlIll(Combat.getMissingHealth(), lIIlIIlIlI[41])) {
                    int[] nArray = new int[lIIlIIlIlI[1]];
                    nArray[H.lIIlIIlIlI[0]] = lIIlIIlIlI[24];
                    if (H.lllllIIIIlll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        int[] nArray6 = new int[lIIlIIlIlI[1]];
                        nArray6[H.lIIlIIlIlI[0]] = lIIlIIlIlI[24];
                        Inventory.getFirst((int[])nArray6).interact(lIIlIIlIII[lIIlIIlIlI[27]]);
                        Time.sleepTicks((int)lIIlIIlIlI[3]);

                    }
                }
                if (H.lllllIIIlIll(Movement.getRunEnergy(), lIIlIIlIlI[42]) && H.lllllIIIlIIl(Movement.isRunEnabled() ? 1 : 0)) {
                    Movement.toggleRun();
                }
                if (H.lllllIIIlIII(Skills.getLevel((Skill)Skill.AGILITY), lIIlIIlIlI[2])) {
                    H.cq();
                }
                if ((!H.lllllIIIllIl(e.j(lIIlIIlIlI[43]), lIIlIIlIlI[44]) || H.lllllIIIlIII(e.j(lIIlIIlIlI[45]), lIIlIIlIlI[19])) && H.lllllIIIllIl(Skills.getLevel((Skill)Skill.AGILITY), lIIlIIlIlI[2]) && H.lllllIIIlIII(Skills.getLevel((Skill)Skill.AGILITY), lIIlIIlIlI[44])) {
                    H.cr();
                }
                if (H.lllllIIIllIl(e.j(lIIlIIlIlI[43]), lIIlIIlIlI[44]) && H.lllllIIIllIl(e.j(lIIlIIlIlI[45]), lIIlIIlIlI[19])) {
                    if (H.lllllIIIllIl(Skills.getLevel((Skill)Skill.AGILITY), lIIlIIlIlI[2]) && H.lllllIIIlIII(Skills.getLevel((Skill)Skill.AGILITY), lIIlIIlIlI[38])) {
                        H.cr();
                    }
                    if (H.lllllIIIllIl(Skills.getLevel((Skill)Skill.AGILITY), lIIlIIlIlI[38]) && H.lllllIIIlIII(Skills.getLevel((Skill)Skill.AGILITY), lIIlIIlIlI[44])) {
                        H.cs();
                    }
                }
                if (H.lllllIIIllIl(Skills.getLevel((Skill)Skill.AGILITY), lIIlIIlIlI[44])) {
                    H.ct();
                }
            }
        }
    }

    @Override
    public int T() {
        try {
            H.cp();

        }
        catch (Exception exception) {
            // empty catch block
        }
        if (((0x5D ^ 0x73 ^ (0xA3 ^ 0xB6)) & (0x75 ^ 0x27 ^ (0x3E ^ 0x57) ^ -1)) > 0) {
            return (0x93 ^ 0xB5 ^ (0x90 ^ 0xA7)) & (82 + 19 - -53 + 34 ^ 4 + 139 - 88 + 118 ^ -1);
        }
        return lIIlIIlIlI[186];
    }

    private static boolean lllllIIIlIIl(int n2) {
        return n2 == 0;
    }

    private static boolean lllllIIIllIl(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lllllIIIllII(int n2) {
        return n2 > 0;
    }

        return String.valueOf(llIIllI);
    }

    private static boolean lllllIIIlIll(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lllllIIIllll(int n2, int n3) {
        return n2 <= n3;
    }
}

