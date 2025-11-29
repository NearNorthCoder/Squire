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

public class ADHelper
implements ab {
    private static  WorldPoint me;
    public static  int lZ;
    
    static  WorldArea md;
    
    public static  List<d> bx;
    public static  int lY;
    static  WorldArea mb;
    public static  int ma;
    static  WorldArea mc;
    public static  boolean bv;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean an() {
        int n2;
        if (ad.llIllIIllIII(Skills.getBoostedLevel((Skill)Skill.AGILITY), lllllllIl[37])) {
            int n3;
            int[] nArray = new int[lllllllIl[1]];
            nArray[ad.lllllllIl[0]] = lllllllIl[13];
            if (ad.llIllIIlIIlI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray2 = new int[lllllllIl[1]];
                nArray2[ad.lllllllIl[0]] = lllllllIl[25];
                if (ad.llIllIIlIIlI(Inventory.contains((int[])nArray2) ? 1 : 0)) {
                    int[] nArray3 = new int[lllllllIl[1]];
                    nArray3[ad.lllllllIl[0]] = lllllllIl[23];
                    if (!(!ad.llIllIIlIIlI(Inventory.contains((int[])nArray3) ? 1 : 0) || ad.llIllIIlIlII(Inventory.contains(item -> item.getName().contains(lllllllII[lllllllIl[207]])) ? 1 : 0) && !ad.llIllIIlIIlI(Equipment.contains(item -> item.getName().contains(lllllllII[lllllllIl[206]])) ? 1 : 0) || ad.llIllIIlIlII(Inventory.contains((int[])f.bm) ? 1 : 0) && !ad.llIllIIlIIlI(Equipment.contains((int[])f.bm) ? 1 : 0))) {
                        n3 = lllllllIl[1];

                        if ((0x61 ^ 0x7F ^ (0x19 ^ 3)) > 0) return n3 != 0;
                        return ((0x4E ^ 0x72 ^ 75 + 118 - 151 + 85) & (0xEE ^ 0x88 ^ (0x21 ^ 4) ^ -1)) != 0;
                    }
                }
            }
            n3 = lllllllIl[0];
            return n3 != 0;
        }
        int[] nArray = new int[lllllllIl[1]];
        nArray[ad.lllllllIl[0]] = lllllllIl[13];
        if (ad.llIllIIlIIlI(Inventory.contains((int[])nArray) ? 1 : 0)) {
            int[] nArray4 = new int[lllllllIl[1]];
            nArray4[ad.lllllllIl[0]] = lllllllIl[15];
            if (ad.llIllIIlIIlI(Inventory.contains((int[])nArray4) ? 1 : 0)) {
                int[] nArray5 = new int[lllllllIl[1]];
                nArray5[ad.lllllllIl[0]] = lllllllIl[14];
                if (!(!ad.llIllIIlIIlI(Inventory.contains((int[])nArray5) ? 1 : 0) || ad.llIllIIlIlII(Inventory.contains(item -> item.getName().contains(lllllllII[lllllllIl[205]])) ? 1 : 0) && !ad.llIllIIlIIlI(Equipment.contains(item -> item.getName().contains(lllllllII[lllllllIl[204]])) ? 1 : 0) || ad.llIllIIlIlII(Inventory.contains((int[])f.bm) ? 1 : 0) && !ad.llIllIIlIIlI(Equipment.contains((int[])f.bm) ? 1 : 0))) {
                    n2 = lllllllIl[1];

                    if ((0xA3 ^ 0xA7) == (0xC0 ^ 0xC4)) return n2 != 0;
                    return false;
                }
            }
        }
        n2 = lllllllIl[0];
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    private static void dW() {
        void lIIlllllllIIl;
        void lIlIIIIIIIIIl;
        void lIlIIIIIIIIlI;
        void lIlIIIIIIIIll;
        void lIlIIIIIIIlII;
        WorldArea worldArea = new WorldArea(lllllllIl[125], lllllllIl[126], lllllllIl[112], lllllllIl[107], lllllllIl[0]);
        WorldArea worldArea2 = new WorldArea(lllllllIl[125], lllllllIl[126], lllllllIl[112], lllllllIl[107], lllllllIl[1]);
        WorldArea worldArea3 = new WorldArea(lllllllIl[125], lllllllIl[126], lllllllIl[112], lllllllIl[107], lllllllIl[3]);
        WorldArea worldArea4 = new WorldArea(lllllllIl[125], lllllllIl[126], lllllllIl[112], lllllllIl[107], lllllllIl[10]);
        WorldArea worldArea5 = new WorldArea(lllllllIl[127], lllllllIl[128], lllllllIl[49], lllllllIl[12], lllllllIl[3]);
        WorldArea worldArea6 = new WorldArea(lllllllIl[129], lllllllIl[127], lllllllIl[49], lllllllIl[24], lllllllIl[3]);
        WorldArea worldArea7 = new WorldArea(lllllllIl[130], lllllllIl[131], lllllllIl[63], lllllllIl[49], lllllllIl[3]);
        WorldArea worldArea8 = new WorldArea(lllllllIl[132], lllllllIl[133], lllllllIl[12], lllllllIl[64], lllllllIl[10]);
        WorldArea worldArea9 = new WorldArea(lllllllIl[134], lllllllIl[9], lllllllIl[49], lllllllIl[26], lllllllIl[3]);
        WorldArea worldArea10 = new WorldArea(lllllllIl[135], lllllllIl[136], lllllllIl[68], lllllllIl[53], lllllllIl[10]);
        WorldArea worldArea11 = new WorldArea(lllllllIl[137], lllllllIl[138], lllllllIl[63], lllllllIl[64], lllllllIl[3]);
        WorldPoint worldPoint = new WorldPoint(lllllllIl[137], lllllllIl[139], lllllllIl[0]);
        if (ad.llIllIIlIIlI(Dialog.isOpen() ? 1 : 0)) {
            Dialog.close();
        }
        if (ad.llIllIIlIlII(lIlIIIIIIIlII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && ad.llIllIIlIlII(lIlIIIIIIIIll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && ad.llIllIIlIlII(lIlIIIIIIIIlI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && ad.llIllIIlIlII(lIlIIIIIIIIIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderGWD.c = lllllllII[lllllllIl[140]];
            Movement.walkTo((WorldPoint)lIIlllllllIIl);

            Time.sleepTicks((int)lllllllIl[1]);

        }
        if (ad.llIllIIlIIlI(lIlIIIIIIIlII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (ad.llIllIIlIllI(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lIIlllllllIIl), lllllllIl[20])) {
                AccBuilderGWD.c = lllllllII[lllllllIl[6]];
                Movement.walkTo((WorldPoint)lIIlllllllIIl);

                Time.sleepTicks((int)lllllllIl[1]);

            }
            if (ad.llIllIIllIlI(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lIIlllllllIIl), lllllllIl[20])) {
                AccBuilderGWD.c = lllllllII[lllllllIl[141]];
                int lIIlllllllIII = Skills.getExperience((Skill)Skill.AGILITY);
                String[] stringArray = new String[lllllllIl[1]];
                stringArray[ad.lllllllIl[0]] = lllllllII[lllllllIl[142]];
                TileObjects.getNearest((String[])stringArray).interact(lllllllII[lllllllIl[143]]);
                Time.sleepTicks((int)e.c(lllllllIl[1], lllllllIl[3]));

                Time.sleepUntil(() -> {
                    boolean bl;
                    if (ad.llIllIIlIllI(Skills.getExperience((Skill)Skill.AGILITY), lIIlllllllIII)) {
                        bl = lllllllIl[1];

                        if (2 < -1) {
                            return false;
                        }
                    } else {
                        bl = lllllllIl[0];
                    }
                    return bl;
                }, (int)lllllllIl[104]);

                Time.sleepTicks((int)lllllllIl[1]);

            }
        }
        String[] stringArray = new String[lllllllIl[1]];
        stringArray[ad.lllllllIl[0]] = lllllllII[lllllllIl[144]];
        TileItem lIIlllllllIII = TileItems.getNearest((String[])stringArray);
        if (ad.llIllIIlIlIl(lIIlllllllIII) && ad.llIllIIlIIlI(ad.dY() ? 1 : 0)) {
            AccBuilderGWD.c = lllllllII[lllllllIl[145]];
            System.out.println(lllllllII[lllllllIl[146]]);
            lIIlllllllIII.interact(lllllllII[lllllllIl[147]]);
            Time.sleepTicks((int)lllllllIl[10]);

        }
        if (ad.llIllIIlIlII(ad.dY() ? 1 : 0)) {
            void lIIlllllllIlI;
            void lIIlllllllIll;
            void lIIllllllllII;
            void lIIllllllllIl;
            void lIIlllllllllI;
            void lIIllllllllll;
            int lIIllllllIllI;
            TileObject lIIllllllIlll;
            void lIlIIIIIIIIII;
            if (ad.llIllIIlIIlI(lIlIIIIIIIIII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && ad.llIllIIlIlIl(lIIllllllIlll = TileObjects.getNearest(tileObject -> {
                int n2;
                if (ad.llIllIIlIIlI(tileObject.getName().contains(lllllllII[lllllllIl[233]]) ? 1 : 0) && ad.llIllIIllIlI(tileObject.getWorldLocation().distanceTo(new WorldPoint(lllllllIl[234], lllllllIl[131], lllllllIl[3])), lllllllIl[3])) {
                    n2 = lllllllIl[1];

                    if (-(0x22 ^ 0x27) >= 0) {
                        return false;
                    }
                } else {
                    n2 = lllllllIl[0];
                }
                return n2 != 0;
            }))) {
                lIIllllllIllI = Skills.getExperience((Skill)Skill.AGILITY);
                AccBuilderGWD.c = lllllllII[lllllllIl[148]];
                lIIllllllIlll.interact(lllllllII[lllllllIl[149]]);
                Time.sleepTicks((int)e.c(lllllllIl[1], lllllllIl[3]));

                Time.sleepUntil(() -> {
                    boolean bl;
                    if (ad.llIllIIlIllI(Skills.getExperience((Skill)Skill.AGILITY), lIIllllllIllI)) {
                        bl = lllllllIl[1];

                        if (((0x63 ^ 0x37) & ~(0xCF ^ 0x9B)) == (0x25 ^ 0x21)) {
                            return false;
                        }
                    } else {
                        bl = lllllllIl[0];
                    }
                    return bl;
                }, (int)lllllllIl[104]);

                Time.sleepTicks((int)lllllllIl[1]);

            }
            if (ad.llIllIIlIIlI(ad.dY() ? 1 : 0)) {
                return;
            }
            if (ad.llIllIIlIIlI(lIIllllllllll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && ad.llIllIIlIlIl(lIIllllllIlll = TileObjects.getNearest(tileObject -> {
                int n2;
                if (ad.llIllIIlIIlI(tileObject.getName().contains(lllllllII[lllllllIl[232]]) ? 1 : 0) && ad.llIllIIllIlI(tileObject.getWorldLocation().distanceTo(new WorldPoint(lllllllIl[131], lllllllIl[225], lllllllIl[3])), lllllllIl[3])) {
                    n2 = lllllllIl[1];

                    }
                } else {
                    n2 = lllllllIl[0];
                }
                return n2 != 0;
            }))) {
                AccBuilderGWD.c = lllllllII[lllllllIl[150]];
                lIIllllllIllI = Skills.getExperience((Skill)Skill.AGILITY);
                lIIllllllIlll.interact(lllllllII[lllllllIl[151]]);
                Time.sleepTicks((int)e.c(lllllllIl[1], lllllllIl[3]));

                Time.sleepUntil(() -> {
                    boolean bl;
                    if (ad.llIllIIlIllI(Skills.getExperience((Skill)Skill.AGILITY), lIIllllllIllI)) {
                        bl = lllllllIl[1];

                        if ((0x41 ^ 0x75 ^ (0xBA ^ 0x8A)) <= ((0x7E ^ 0xB ^ (0x6D ^ 0x55)) & (0x52 ^ 0x16 ^ (0x12 ^ 0x1B) ^ -1))) {
                            return ((0xFE ^ 0xB2 ^ (0x3A ^ 0x22)) & (185 + 23 - 127 + 166 ^ 103 + 1 - 89 + 148 ^ -1)) != 0;
                        }
                    } else {
                        bl = lllllllIl[0];
                    }
                    return bl;
                }, (int)lllllllIl[104]);

                Time.sleepTicks((int)lllllllIl[1]);

            }
            if (ad.llIllIIlIIlI(ad.dY() ? 1 : 0)) {
                return;
            }
            if (ad.llIllIIlIIlI(lIIlllllllllI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && ad.llIllIIlIlIl(lIIllllllIlll = TileObjects.getNearest(tileObject -> {
                int n2;
                if (ad.llIllIIlIIlI(tileObject.getName().contains(lllllllII[lllllllIl[230]]) ? 1 : 0) && ad.llIllIIllIlI(tileObject.getWorldLocation().distanceTo(new WorldPoint(lllllllIl[139], lllllllIl[231], lllllllIl[3])), lllllllIl[3])) {
                    n2 = lllllllIl[1];

                    }
                } else {
                    n2 = lllllllIl[0];
                }
                return n2 != 0;
            }))) {
                AccBuilderGWD.c = lllllllII[lllllllIl[152]];
                lIIllllllIllI = Skills.getExperience((Skill)Skill.AGILITY);
                lIIllllllIlll.interact(lllllllII[lllllllIl[153]]);
                Time.sleepTicks((int)e.c(lllllllIl[1], lllllllIl[3]));

                Time.sleepUntil(() -> {
                    boolean bl;
                    if (ad.llIllIIlIllI(Skills.getExperience((Skill)Skill.AGILITY), lIIllllllIllI)) {
                        bl = lllllllIl[1];

                        if ((0x5C ^ 0x58) < 0) {
                            return false;
                        }
                    } else {
                        bl = lllllllIl[0];
                    }
                    return bl;
                }, (int)lllllllIl[104]);

                Time.sleepTicks((int)lllllllIl[1]);

            }
            if (ad.llIllIIlIIlI(ad.dY() ? 1 : 0)) {
                return;
            }
            if (ad.llIllIIlIIlI(lIIllllllllIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && ad.llIllIIlIlIl(lIIllllllIlll = TileObjects.getNearest(tileObject -> {
                int n2;
                if (ad.llIllIIlIIlI(tileObject.getName().contains(lllllllII[lllllllIl[227]]) ? 1 : 0) && ad.llIllIIllIlI(tileObject.getWorldLocation().distanceTo(new WorldPoint(lllllllIl[228], lllllllIl[229], lllllllIl[10])), lllllllIl[3])) {
                    n2 = lllllllIl[1];

                    }
                } else {
                    n2 = lllllllIl[0];
                }
                return n2 != 0;
            }))) {
                AccBuilderGWD.c = lllllllII[lllllllIl[154]];
                lIIllllllIllI = Skills.getExperience((Skill)Skill.AGILITY);
                lIIllllllIlll.interact(lllllllII[lllllllIl[155]]);
                Time.sleepTicks((int)e.c(lllllllIl[1], lllllllIl[3]));

                Time.sleepUntil(() -> {
                    boolean bl;
                    if (ad.llIllIIlIllI(Skills.getExperience((Skill)Skill.AGILITY), lIIllllllIllI)) {
                        bl = lllllllIl[1];

                        if ((0x6A ^ 0x11 ^ 79 + 116 - 117 + 49) == ((1 ^ (0x7D ^ 0x33)) & (16 + 167 - 46 + 112 ^ 32 + 42 - -60 + 48 ^ -1))) {
                            return ((138 + 72 - 71 + 8 ^ 106 + 130 - 170 + 122) & (0xB0 ^ 0xBE ^ (0x15 ^ 0x34) ^ -1)) != 0;
                        }
                    } else {
                        bl = lllllllIl[0];
                    }
                    return bl;
                }, (int)lllllllIl[104]);

                Time.sleepTicks((int)lllllllIl[1]);

            }
            if (ad.llIllIIlIIlI(ad.dY() ? 1 : 0)) {
                return;
            }
            if (ad.llIllIIlIIlI(lIIllllllllII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && ad.llIllIIlIlIl(lIIllllllIlll = TileObjects.getNearest(tileObject -> {
                int n2;
                if (ad.llIllIIlIIlI(tileObject.getName().contains(lllllllII[lllllllIl[226]]) ? 1 : 0) && ad.llIllIIllIlI(tileObject.getWorldLocation().distanceTo(new WorldPoint(lllllllIl[9], lllllllIl[130], lllllllIl[3])), lllllllIl[3])) {
                    n2 = lllllllIl[1];

                    if (3 <= 1) {
                        return false;
                    }
                } else {
                    n2 = lllllllIl[0];
                }
                return n2 != 0;
            }))) {
                AccBuilderGWD.c = lllllllII[lllllllIl[156]];
                lIIllllllIllI = Skills.getExperience((Skill)Skill.AGILITY);
                lIIllllllIlll.interact(lllllllII[lllllllIl[157]]);
                Time.sleepTicks((int)e.c(lllllllIl[1], lllllllIl[3]));

                Time.sleepUntil(() -> {
                    boolean bl;
                    if (ad.llIllIIlIllI(Skills.getExperience((Skill)Skill.AGILITY), lIIllllllIllI)) {
                        bl = lllllllIl[1];

                    } else {
                        bl = lllllllIl[0];
                    }
                    return bl;
                }, (int)lllllllIl[104]);

                Time.sleepTicks((int)lllllllIl[1]);

            }
            if (ad.llIllIIlIIlI(ad.dY() ? 1 : 0)) {
                return;
            }
            if (ad.llIllIIlIIlI(lIIlllllllIll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && ad.llIllIIlIlIl(lIIllllllIlll = TileObjects.getNearest(tileObject -> {
                int n2;
                if (ad.llIllIIlIIlI(tileObject.getName().contains(lllllllII[lllllllIl[224]]) ? 1 : 0) && ad.llIllIIllIlI(tileObject.getWorldLocation().distanceTo(new WorldPoint(lllllllIl[225], lllllllIl[215], lllllllIl[10])), lllllllIl[3])) {
                    n2 = lllllllIl[1];

                    if ((146 + 88 - 76 + 14 ^ 17 + 152 - 108 + 107) < ((0x8B ^ 0xAA ^ (0x56 ^ 0x37)) & (0x75 ^ 0x11 ^ (0x93 ^ 0xB7) ^ -1))) {
                        return ((152 + 124 - 185 + 63 ^ 47 + 75 - 36 + 93) & (0x19 ^ 0x29 ^ (0x92 ^ 0x8B) ^ -1)) != 0;
                    }
                } else {
                    n2 = lllllllIl[0];
                }
                return n2 != 0;
            }))) {
                AccBuilderGWD.c = lllllllII[lllllllIl[158]];
                lIIllllllIllI = Skills.getExperience((Skill)Skill.AGILITY);
                lIIllllllIlll.interact(lllllllII[lllllllIl[159]]);
                Time.sleepTicks((int)e.c(lllllllIl[1], lllllllIl[3]));

                Time.sleepUntil(() -> {
                    boolean bl;
                    if (ad.llIllIIlIllI(Skills.getExperience((Skill)Skill.AGILITY), lIIllllllIllI)) {
                        bl = lllllllIl[1];

                        if (-(0x90 ^ 0x94) > 0) {
                            return false;
                        }
                    } else {
                        bl = lllllllIl[0];
                    }
                    return bl;
                }, (int)lllllllIl[104]);

                Time.sleepTicks((int)lllllllIl[1]);

            }
            if (ad.llIllIIlIIlI(ad.dY() ? 1 : 0)) {
                return;
            }
            if (ad.llIllIIlIIlI(lIIlllllllIlI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && ad.llIllIIlIlIl(lIIllllllIlll = TileObjects.getNearest(tileObject -> {
                int n2;
                if (ad.llIllIIlIIlI(tileObject.getName().contains(lllllllII[lllllllIl[221]]) ? 1 : 0) && ad.llIllIIllIlI(tileObject.getWorldLocation().distanceTo(new WorldPoint(lllllllIl[222], lllllllIl[223], lllllllIl[3])), lllllllIl[3])) {
                    n2 = lllllllIl[1];

                    if (1 < 0) {
                        return ((0xC6 ^ 0x93 ^ (0x31 ^ 0x25)) & (0x6D ^ 0x2D ^ 1 ^ -1)) != 0;
                    }
                } else {
                    n2 = lllllllIl[0];
                }
                return n2 != 0;
            }))) {
                AccBuilderGWD.c = lllllllII[lllllllIl[160]];
                lIIllllllIllI = Skills.getExperience((Skill)Skill.AGILITY);
                lIIllllllIlll.interact(lllllllII[lllllllIl[161]]);
                Time.sleepTicks((int)e.c(lllllllIl[1], lllllllIl[3]));

                Time.sleepUntil(() -> {
                    boolean bl;
                    if (ad.llIllIIlIllI(Skills.getExperience((Skill)Skill.AGILITY), lIIllllllIllI)) {
                        bl = lllllllIl[1];

                        if (1 > 3) {
                            return false;
                        }
                    } else {
                        bl = lllllllIl[0];
                    }
                    return bl;
                }, (int)lllllllIl[104]);

                Time.sleepTicks((int)lllllllIl[1]);

            }
        }
    }

    /*
     * WARNING - void declaration
     */
    private static void dU() {
        WorldArea worldArea = new WorldArea(lllllllIl[46], lllllllIl[47], lllllllIl[12], lllllllIl[20], lllllllIl[0]);
        WorldArea worldArea2 = new WorldArea(lllllllIl[46], lllllllIl[48], lllllllIl[49], lllllllIl[24], lllllllIl[0]);
        WorldArea worldArea3 = new WorldArea(lllllllIl[46], lllllllIl[50], lllllllIl[49], lllllllIl[24], lllllllIl[1]);
        WorldArea worldArea4 = new WorldArea(lllllllIl[51], lllllllIl[52], lllllllIl[53], lllllllIl[54], lllllllIl[3]);
        WorldArea worldArea5 = new WorldArea(lllllllIl[55], lllllllIl[56], lllllllIl[24], lllllllIl[12], lllllllIl[3]);
        WorldArea worldArea6 = new WorldArea(lllllllIl[57], lllllllIl[58], lllllllIl[49], lllllllIl[12], lllllllIl[0]);
        WorldArea worldArea7 = new WorldArea(lllllllIl[59], lllllllIl[60], lllllllIl[12], lllllllIl[20], lllllllIl[0]);
        WorldArea worldArea8 = new WorldArea(lllllllIl[46], lllllllIl[47], lllllllIl[61], lllllllIl[20], lllllllIl[0]);
        if (ad.llIllIIlIlII(mb.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && ad.llIllIIlIlII(mc.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && ad.llIllIIlIlII(md.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderGWD.c = lllllllII[lllllllIl[12]];
            e.b(me);
            Time.sleepTicks((int)lllllllIl[1]);

        }
        if ((!ad.llIllIIlIlII(mb.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || !ad.llIllIIlIlII(mc.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || ad.llIllIIlIIlI(md.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) && ad.llIllIIllIIl(Players.getLocal().getAnimation(), lllllllIl[62]) && ad.llIllIIlIlII(Players.getLocal().isMoving() ? 1 : 0)) {
            void lIlIIIIllIIIl;
            void lIlIIIIllIIlI;
            void lIlIIIIllIIll;
            void lIlIIIIllIlII;
            void lIlIIIIllIlIl;
            void lIlIIIIllIllI;
            void lIlIIIIllIIII;
            if (ad.llIllIIlIIlI(lIlIIIIllIIII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderGWD.c = lllllllII[lllllllIl[49]];
                String[] stringArray = new String[lllllllIl[1]];
                stringArray[ad.lllllllIl[0]] = lllllllII[lllllllIl[63]];
                TileObjects.getNearest((String[])stringArray).interact(lllllllII[lllllllIl[64]]);
                Time.sleepTicks((int)lllllllIl[3]);

            }
            if (ad.llIllIIlIIlI(lIlIIIIllIllI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderGWD.c = lllllllII[lllllllIl[53]];
                String[] stringArray = new String[lllllllIl[1]];
                stringArray[ad.lllllllIl[0]] = lllllllII[lllllllIl[38]];
                TileObjects.getNearest((String[])stringArray).interact(lllllllII[lllllllIl[65]]);
                Time.sleepTicks((int)lllllllIl[3]);

            }
            if (ad.llIllIIlIIlI(lIlIIIIllIlIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderGWD.c = lllllllII[lllllllIl[66]];
                String[] stringArray = new String[lllllllIl[1]];
                stringArray[ad.lllllllIl[0]] = lllllllII[lllllllIl[54]];
                TileObjects.getNearest((String[])stringArray).interact(lllllllII[lllllllIl[67]]);
                Time.sleepTicks((int)lllllllIl[3]);

            }
            if (ad.llIllIIlIIlI(lIlIIIIllIlII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderGWD.c = lllllllII[lllllllIl[40]];
                String[] stringArray = new String[lllllllIl[1]];
                stringArray[ad.lllllllIl[0]] = lllllllII[lllllllIl[68]];
                TileObjects.getNearest((String[])stringArray).interact(lllllllII[lllllllIl[61]]);
                Time.sleepTicks((int)lllllllIl[2]);

            }
            if (ad.llIllIIlIIlI(lIlIIIIllIIll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderGWD.c = lllllllII[lllllllIl[69]];
                String[] stringArray = new String[lllllllIl[1]];
                stringArray[ad.lllllllIl[0]] = lllllllII[lllllllIl[70]];
                TileObjects.getNearest((String[])stringArray).interact(lllllllII[lllllllIl[41]]);
                Time.sleepTicks((int)lllllllIl[17]);

            }
            if (ad.llIllIIlIIlI(lIlIIIIllIIlI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderGWD.c = lllllllII[lllllllIl[71]];
                String[] stringArray = new String[lllllllIl[1]];
                stringArray[ad.lllllllIl[0]] = lllllllII[lllllllIl[72]];
                TileObjects.getNearest((String[])stringArray).interact(lllllllII[lllllllIl[73]]);
                Time.sleepTicks((int)lllllllIl[10]);

            }
            if (ad.llIllIIlIIlI(lIlIIIIllIIIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderGWD.c = lllllllII[lllllllIl[74]];
                String[] stringArray = new String[lllllllIl[1]];
                stringArray[ad.lllllllIl[0]] = lllllllII[lllllllIl[42]];
                TileObjects.getNearest((String[])stringArray).interact(lllllllII[lllllllIl[75]]);
                Time.sleepTicks((int)lllllllIl[17]);

            }
        }
    }

    private static void llIllIIIlIll() {
        lllllllII = new String[lllllllIl[238]];
        ad.lllllllII[ad.lllllllIl[0]] = "Buying items";
        ad.lllllllII[ad.lllllllIl[1]] = "Finished buying items, switching back to agility";
        ad.lllllllII[ad.lllllllIl[3]] = "Navigating to bank";
        ad.lllllllII[ad.lllllllIl[10]] = "Handling banking";
        ad.lllllllII[ad.lllllllIl[17]] = "We are missing quest supplies, switching to BUYING";
        ad.lllllllII[ad.lllllllIl[2]] = "Vial";
        ad.lllllllII[ad.lllllllIl[20]] = "Vial";
        ad.lllllllII[ad.lllllllIl[22]] = "Drop";
        ad.lllllllII[ad.lllllllIl[24]] = "Drink";
        ad.lllllllII[ad.lllllllIl[26]] = "Eat";
        ad.lllllllII[ad.lllllllIl[12]] = "Nav to gnome course";
        ad.lllllllII[ad.lllllllIl[49]] = "Crossing log";
        ad.lllllllII[ad.lllllllIl[63]] = "Log balance";
        ad.lllllllII[ad.lllllllIl[64]] = "Walk-across";
        ad.lllllllII[ad.lllllllIl[53]] = "Climbing net";
        ad.lllllllII[ad.lllllllIl[38]] = "Obstacle net";
        ad.lllllllII[ad.lllllllIl[65]] = "Climb-over";
        ad.lllllllII[ad.lllllllIl[66]] = "Climbing branch";
        ad.lllllllII[ad.lllllllIl[54]] = "Tree branch";
        ad.lllllllII[ad.lllllllIl[67]] = "Climb";
        ad.lllllllII[ad.lllllllIl[40]] = "Crossing rope";
        ad.lllllllII[ad.lllllllIl[68]] = "Balancing rope";
        ad.lllllllII[ad.lllllllIl[61]] = "Walk-on";
        ad.lllllllII[ad.lllllllIl[69]] = "Climbing down";
        ad.lllllllII[ad.lllllllIl[70]] = "Tree branch";
        ad.lllllllII[ad.lllllllIl[41]] = "Climb-down";
        ad.lllllllII[ad.lllllllIl[71]] = "Climbing net";
        ad.lllllllII[ad.lllllllIl[72]] = "Obstacle net";
        ad.lllllllII[ad.lllllllIl[73]] = "Climb-over";
        ad.lllllllII[ad.lllllllIl[74]] = "Crossing pipe";
        ad.lllllllII[ad.lllllllIl[42]] = "Obstacle pipe";
        ad.lllllllII[ad.lllllllIl[75]] = "Squeeze-through";
        ad.lllllllII[ad.lllllllIl[95]] = "Nav to start";
        ad.lllllllII[ad.lllllllIl[97]] = "Mark of grace";
        ad.lllllllII[ad.lllllllIl[98]] = "Taking mark";
        ad.lllllllII[ad.lllllllIl[99]] = "Found mark on ground";
        ad.lllllllII[ad.lllllllIl[100]] = "Take";
        ad.lllllllII[ad.lllllllIl[101]] = "Starting course";
        ad.lllllllII[ad.lllllllIl[102]] = "Rough wall";
        ad.lllllllII[ad.lllllllIl[103]] = "Climb";
        ad.lllllllII[ad.lllllllIl[37]] = "Crossing clothes line";
        ad.lllllllII[ad.lllllllIl[105]] = "Clothes line";
        ad.lllllllII[ad.lllllllIl[106]] = "Cross";
        ad.lllllllII[ad.lllllllIl[107]] = "Leaping";
        ad.lllllllII[ad.lllllllIl[108]] = "Gap";
        ad.lllllllII[ad.lllllllIl[109]] = "Leap";
        ad.lllllllII[ad.lllllllIl[110]] = "Balancing";
        ad.lllllllII[ad.lllllllIl[111]] = "Wall";
        ad.lllllllII[ad.lllllllIl[112]] = "Balance";
        ad.lllllllII[ad.lllllllIl[113]] = "Jumping gap";
        ad.lllllllII[ad.lllllllIl[39]] = "Gap";
        ad.lllllllII[ad.lllllllIl[7]] = "Leap";
        ad.lllllllII[ad.lllllllIl[114]] = "Jumping gap 2";
        ad.lllllllII[ad.lllllllIl[116]] = "Leap";
        ad.lllllllII[ad.lllllllIl[117]] = "Jumping gap 3";
        ad.lllllllII[ad.lllllllIl[119]] = "Leap";
        ad.lllllllII[ad.lllllllIl[120]] = "Hurdle roof";
        ad.lllllllII[ad.lllllllIl[122]] = "Hurdle";
        ad.lllllllII[ad.lllllllIl[123]] = "Finishing course";
        ad.lllllllII[ad.lllllllIl[124]] = "Edge";
        ad.lllllllII[ad.lllllllIl[44]] = "Jump-off";
        ad.lllllllII[ad.lllllllIl[140]] = "Nav to canafis course";
        ad.lllllllII[ad.lllllllIl[6]] = "Nav to start";
        ad.lllllllII[ad.lllllllIl[141]] = "Starting course";
        ad.lllllllII[ad.lllllllIl[142]] = "Tall tree";
        ad.lllllllII[ad.lllllllIl[143]] = "Climb";
        ad.lllllllII[ad.lllllllIl[144]] = "Mark of grace";
        ad.lllllllII[ad.lllllllIl[145]] = "Taking mark";
        ad.lllllllII[ad.lllllllIl[146]] = "Found mark on ground";
        ad.lllllllII[ad.lllllllIl[147]] = "Take";
        ad.lllllllII[ad.lllllllIl[148]] = "Jumping gap 1";
        ad.lllllllII[ad.lllllllIl[149]] = "Jump";
        ad.lllllllII[ad.lllllllIl[150]] = "Jumping gap 2";
        ad.lllllllII[ad.lllllllIl[151]] = "Jump";
        ad.lllllllII[ad.lllllllIl[152]] = "Jumping gap 3";
        ad.lllllllII[ad.lllllllIl[153]] = "Jump";
        ad.lllllllII[ad.lllllllIl[154]] = "Jumping gap 4";
        ad.lllllllII[ad.lllllllIl[155]] = "Jump";
        ad.lllllllII[ad.lllllllIl[156]] = "Vaulting";
        ad.lllllllII[ad.lllllllIl[157]] = "Vault";
        ad.lllllllII[ad.lllllllIl[158]] = "Jumping gap 5";
        ad.lllllllII[ad.lllllllIl[159]] = "Jump";
        ad.lllllllII[ad.lllllllIl[160]] = "Jumping gap 6";
        ad.lllllllII[ad.lllllllIl[161]] = "Jump";
        ad.lllllllII[ad.lllllllIl[172]] = "Nav to canafis course";
        ad.lllllllII[ad.lllllllIl[173]] = "Nav to start";
        ad.lllllllII[ad.lllllllIl[174]] = "Starting course";
        ad.lllllllII[ad.lllllllIl[175]] = "Wall";
        ad.lllllllII[ad.lllllllIl[35]] = "Climb-up";
        ad.lllllllII[ad.lllllllIl[176]] = "Mark of grace";
        ad.lllllllII[ad.lllllllIl[177]] = "Taking mark";
        ad.lllllllII[ad.lllllllIl[178]] = "Found mark on ground";
        ad.lllllllII[ad.lllllllIl[179]] = "Take";
        ad.lllllllII[ad.lllllllIl[180]] = "Jumping gap 1";
        ad.lllllllII[ad.lllllllIl[79]] = "Jump";
        ad.lllllllII[ad.lllllllIl[181]] = "cross rope";
        ad.lllllllII[ad.lllllllIl[182]] = "Cross";
        ad.lllllllII[ad.lllllllIl[183]] = "Jumping gap 3";
        ad.lllllllII[ad.lllllllIl[184]] = "Jump";
        ad.lllllllII[ad.lllllllIl[185]] = "Jumping gap 4";
        ad.lllllllII[ad.lllllllIl[186]] = "Jump";
        ad.lllllllII[ad.lllllllIl[187]] = "Jumping Edge";
        ad.lllllllII[ad.lllllllIl[188]] = "Jump";
        ad.lllllllII[ad.lllllllIl[194]] = "Found mark on ground";
        ad.lllllllII[ad.lllllllIl[203]] = "Agility";
        ad.lllllllII[ad.lllllllIl[204]] = "passage";
        ad.lllllllII[ad.lllllllIl[205]] = "passage";
        ad.lllllllII[ad.lllllllIl[206]] = "passage";
        ad.lllllllII[ad.lllllllIl[207]] = "passage";
        ad.lllllllII[ad.lllllllIl[208]] = "Edge";
        ad.lllllllII[ad.lllllllIl[211]] = "Gap";
        ad.lllllllII[ad.lllllllIl[213]] = "Gap";
        ad.lllllllII[ad.lllllllIl[216]] = "Tightrope";
        ad.lllllllII[ad.lllllllIl[218]] = "Gap";
        ad.lllllllII[ad.lllllllIl[221]] = "Gap";
        ad.lllllllII[ad.lllllllIl[224]] = "Gap";
        ad.lllllllII[ad.lllllllIl[226]] = "Pole-vault";
        ad.lllllllII[ad.lllllllIl[227]] = "Gap";
        ad.lllllllII[ad.lllllllIl[230]] = "Gap";
        ad.lllllllII[ad.lllllllIl[232]] = "Gap";
        ad.lllllllII[ad.lllllllIl[233]] = "Gap";
    }

    static {
        ad.llIllIIlIIIl();
        ad.llIllIIIlIll();
        bx = new ArrayList<d>();
        lY = lllllllIl[27];
        lZ = lllllllIl[23];
        mb = new WorldArea(lllllllIl[235], lllllllIl[52], lllllllIl[69], lllllllIl[72], lllllllIl[0]);
        mc = new WorldArea(lllllllIl[235], lllllllIl[52], lllllllIl[69], lllllllIl[72], lllllllIl[1]);
        md = new WorldArea(lllllllIl[235], lllllllIl[52], lllllllIl[69], lllllllIl[72], lllllllIl[3]);
        me = new WorldPoint(lllllllIl[236], lllllllIl[237], lllllllIl[0]);
    }

    private static boolean llIllIIlIllI(int n2, int n3) {
        return n2 > n3;
    }

    @Override
    public boolean ae() {
        return lllllllIl[0];
    }

    public static void dT() {
        if (ad.llIllIIlIIlI(bv ? 1 : 0)) {
            AccBuilderGWD.c = lllllllII[lllllllIl[0]];
            b.a(bx);
            if (ad.llIllIIlIIll(bx.size(), lllllllIl[1])) {
                System.out.println(lllllllII[lllllllIl[1]]);
                bv = lllllllIl[0];
            }
        }
        if (ad.llIllIIlIlII(bv ? 1 : 0) && ad.llIllIIlIIll(Skills.getLevel((Skill)Skill.AGILITY), lllllllIl[2])) {
            if (ad.llIllIIlIlII(ad.an() ? 1 : 0)) {
                BankLocation lIlIIIlIIIIlI = BankLocation.getNearest();
                if (ad.llIllIIlIlIl(lIlIIIlIIIIlI) && ad.llIllIIlIlII(lIlIIIlIIIIlI.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderGWD.c = lllllllII[lllllllIl[3]];
                    WorldArea lIlIIIlIIIIIl = new WorldArea(lllllllIl[4], lllllllIl[5], lllllllIl[6], lllllllIl[7], lllllllIl[0]);
                    if (ad.llIllIIlIIlI(lIlIIIlIIIIIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        WorldPoint lIlIIIlIIIIII = new WorldPoint(lllllllIl[8], lllllllIl[9], lllllllIl[0]);
                        if (ad.llIllIIlIllI(Players.getLocal().getWorldLocation().distanceTo(lIlIIIlIIIIII), lllllllIl[10])) {
                            Movement.walkTo((WorldPoint)lIlIIIlIIIIII);

                            Time.sleepTicks((int)lllllllIl[1]);

                        }
                    }
                    a.a(lIlIIIlIIIIlI);
                }
                if (ad.llIllIIlIlIl(lIlIIIlIIIIlI) && ad.llIllIIlIIlI(lIlIIIlIIIIlI.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderGWD.c = lllllllII[lllllllIl[10]];
                    if (ad.llIllIIlIlII(Bank.isOpen() ? 1 : 0)) {
                        a.a();
                        Time.sleepUntil(() -> Bank.isOpen(), (int)lllllllIl[11]);

                    }
                    if (ad.llIllIIlIIlI(Bank.isOpen() ? 1 : 0)) {
                        if (ad.llIllIIlIlll(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks((int)lllllllIl[1]);

                        }
                        if (ad.llIllIIlIlll(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks((int)lllllllIl[3]);

                        }
                    }
                    int[] nArray = new int[lllllllIl[12]];
                    nArray[ad.lllllllIl[0]] = lllllllIl[13];
                    nArray[ad.lllllllIl[1]] = lllllllIl[14];
                    nArray[ad.lllllllIl[3]] = lllllllIl[15];
                    nArray[ad.lllllllIl[10]] = lllllllIl[16];
                    nArray[ad.lllllllIl[17]] = lllllllIl[18];
                    nArray[ad.lllllllIl[2]] = lllllllIl[19];
                    nArray[ad.lllllllIl[20]] = lllllllIl[21];
                    nArray[ad.lllllllIl[22]] = lllllllIl[23];
                    nArray[ad.lllllllIl[24]] = lllllllIl[25];
                    nArray[ad.lllllllIl[26]] = lllllllIl[27];
                    if (ad.llIllIIlIlII(e.d(nArray) ? 1 : 0)) {
                        ad.Q();
                        System.out.println(lllllllII[lllllllIl[17]]);
                        bv = lllllllIl[1];
                        return;
                    }
                    int[] nArray2 = new int[lllllllIl[12]];
                    nArray2[ad.lllllllIl[0]] = lllllllIl[13];
                    nArray2[ad.lllllllIl[1]] = lllllllIl[14];
                    nArray2[ad.lllllllIl[3]] = lllllllIl[15];
                    nArray2[ad.lllllllIl[10]] = lllllllIl[16];
                    nArray2[ad.lllllllIl[17]] = lllllllIl[18];
                    nArray2[ad.lllllllIl[2]] = lllllllIl[19];
                    nArray2[ad.lllllllIl[20]] = lllllllIl[21];
                    nArray2[ad.lllllllIl[22]] = lllllllIl[23];
                    nArray2[ad.lllllllIl[24]] = lllllllIl[25];
                    nArray2[ad.lllllllIl[26]] = lllllllIl[27];
                    if (ad.llIllIIlIIlI(e.d(nArray2) ? 1 : 0)) {
                        a.a(lllllllIl[28], lllllllIl[1]);
                        a.a(lllllllIl[29], lllllllIl[1]);
                        a.a(lllllllIl[30], lllllllIl[1]);
                        a.a(lllllllIl[31], lllllllIl[1]);
                        a.a(lllllllIl[32], lllllllIl[1]);
                        a.a(lllllllIl[33], lllllllIl[1]);
                        a.a(lllllllIl[34], lllllllIl[1]);
                        int[] nArray3 = new int[lllllllIl[1]];
                        nArray3[ad.lllllllIl[0]] = lllllllIl[28];
                        if (ad.llIllIIlIlII(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                            int[] nArray4 = new int[lllllllIl[1]];
                            nArray4[ad.lllllllIl[0]] = lllllllIl[28];
                            if (ad.llIllIIlIlII(Equipment.contains((int[])nArray4) ? 1 : 0)) {
                                int[] nArray5 = new int[lllllllIl[1]];
                                nArray5[ad.lllllllIl[0]] = lllllllIl[28];
                                if (ad.llIllIIlIlII(Bank.contains((int[])nArray5) ? 1 : 0)) {
                                    a.a(lllllllIl[35], lllllllIl[1]);
                                }
                            }
                        }
                        a.a(lllllllIl[18], lllllllIl[1]);
                        e.l(lllllllIl[28]);
                        e.l(lllllllIl[29]);
                        e.l(lllllllIl[30]);
                        e.l(lllllllIl[31]);
                        e.l(lllllllIl[32]);
                        Time.sleepTicks((int)lllllllIl[1]);

                        e.l(lllllllIl[34]);
                        e.l(lllllllIl[36]);
                        e.l(lllllllIl[33]);
                        e.l(lllllllIl[35]);
                        e.l(lllllllIl[18]);
                        Time.sleepTicks((int)lllllllIl[10]);

                        if (ad.llIllIIlIlII(Bank.isOpen() ? 1 : 0)) {
                            a.a();
                            Time.sleepTicks((int)lllllllIl[20]);

                        }
                        if (ad.llIllIIlIIlI(Bank.isOpen() ? 1 : 0)) {
                            if (ad.llIllIIlIIll(Skills.getLevel((Skill)Skill.AGILITY), lllllllIl[37])) {
                                a.a(lllllllIl[13], lllllllIl[12]);
                                a.a(lllllllIl[14], lllllllIl[12]);
                                a.a(lllllllIl[21], lllllllIl[12]);
                                a.a(lllllllIl[15], lllllllIl[12]);
                                a.b(f.bm, lllllllIl[1]);
                                a.a(lllllllIl[27], lllllllIl[1]);
                                a.a(lllllllIl[19], lllllllIl[2]);
                                a.a(lllllllIl[23], lllllllIl[38]);
                            }
                            if (ad.llIllIIllIII(Skills.getLevel((Skill)Skill.AGILITY), lllllllIl[37])) {
                                a.a(lllllllIl[13], lllllllIl[12]);
                                a.a(lllllllIl[21], lllllllIl[12]);
                                a.a(lllllllIl[25], lllllllIl[12]);
                                a.b(f.bm, lllllllIl[1]);
                                a.a(lllllllIl[27], lllllllIl[1]);
                                a.a(lllllllIl[19], lllllllIl[24]);
                                a.a(lllllllIl[23], lllllllIl[12]);
                            }
                        }
                    }
                }
            }
            if (ad.llIllIIlIIlI(ad.an() ? 1 : 0)) {
                String[] stringArray = new String[lllllllIl[1]];
                stringArray[ad.lllllllIl[0]] = lllllllII[lllllllIl[2]];
                if (ad.llIllIIlIIlI(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    String[] stringArray2 = new String[lllllllIl[1]];
                    stringArray2[ad.lllllllIl[0]] = lllllllII[lllllllIl[20]];
                    Inventory.getFirst((String[])stringArray2).interact(lllllllII[lllllllIl[22]]);
                }
                if (ad.llIllIIlIIlI(Inventory.contains((int[])f.bc) ? 1 : 0) && ad.llIllIIlIIll(Movement.getRunEnergy(), lllllllIl[39])) {
                    Inventory.getFirst((int[])f.bc).interact(lllllllII[lllllllIl[24]]);
                    Time.sleepTicks((int)lllllllIl[1]);

                }
                if (ad.llIllIIlIllI(Combat.getMissingHealth(), lllllllIl[40])) {
                    int[] nArray = new int[lllllllIl[1]];
                    nArray[ad.lllllllIl[0]] = lllllllIl[23];
                    if (ad.llIllIIlIIlI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        int[] nArray6 = new int[lllllllIl[1]];
                        nArray6[ad.lllllllIl[0]] = lllllllIl[23];
                        Inventory.getFirst((int[])nArray6).interact(lllllllII[lllllllIl[26]]);
                        Time.sleepTicks((int)lllllllIl[3]);

                    }
                }
                if (ad.llIllIIlIllI(Movement.getRunEnergy(), lllllllIl[41]) && ad.llIllIIlIlII(Movement.isRunEnabled() ? 1 : 0)) {
                    Movement.toggleRun();
                }
                if (ad.llIllIIlIIll(Skills.getLevel((Skill)Skill.AGILITY), lllllllIl[42])) {
                    ad.dU();
                }
                if ((!ad.llIllIIllIII(e.j(lllllllIl[43]), lllllllIl[44]) || ad.llIllIIlIIll(e.j(lllllllIl[45]), lllllllIl[2])) && ad.llIllIIllIII(Skills.getLevel((Skill)Skill.AGILITY), lllllllIl[42]) && ad.llIllIIlIIll(Skills.getLevel((Skill)Skill.AGILITY), lllllllIl[44])) {
                    ad.dV();
                }
                if (ad.llIllIIllIII(e.j(lllllllIl[43]), lllllllIl[44]) && ad.llIllIIllIII(e.j(lllllllIl[45]), lllllllIl[2])) {
                    if (ad.llIllIIllIII(Skills.getLevel((Skill)Skill.AGILITY), lllllllIl[42]) && ad.llIllIIlIIll(Skills.getLevel((Skill)Skill.AGILITY), lllllllIl[37])) {
                        ad.dV();
                    }
                    if (ad.llIllIIllIII(Skills.getLevel((Skill)Skill.AGILITY), lllllllIl[37]) && ad.llIllIIlIIll(Skills.getLevel((Skill)Skill.AGILITY), lllllllIl[44])) {
                        ad.dW();
                    }
                }
                if (ad.llIllIIllIII(Skills.getLevel((Skill)Skill.AGILITY), lllllllIl[44])) {
                    ad.dX();
                }
            }
        }
    }

    private static boolean llIllIIlIIlI(int n2) {
        return n2 != 0;
    }

    @Override
    public int af() {
        try {
            ad.dT();

        }
        catch (Exception exception) {
            // empty catch block
        }
        if (((0x36 ^ 0x3A) & ~(0x20 ^ 0x2C)) >= 1) {
            return (0xE8 ^ 0xB3) & ~(0x1F ^ 0x44);
        }
        return lllllllIl[186];
    }

    private static boolean llIllIIlIlll(int n2) {
        return n2 > 0;
    }

    /*
     * WARNING - void declaration
     */
    private static boolean dY() {
        WorldArea worldArea = new WorldArea(lllllllIl[80], lllllllIl[81], lllllllIl[69], lllllllIl[64], lllllllIl[0]);
        WorldArea worldArea2 = new WorldArea(lllllllIl[82], lllllllIl[81], lllllllIl[12], lllllllIl[64], lllllllIl[10]);
        WorldArea worldArea3 = new WorldArea(lllllllIl[83], lllllllIl[84], lllllllIl[63], lllllllIl[49], lllllllIl[10]);
        WorldArea worldArea4 = new WorldArea(lllllllIl[189], lllllllIl[190], lllllllIl[24], lllllllIl[2], lllllllIl[1]);
        WorldArea worldArea5 = new WorldArea(lllllllIl[85], lllllllIl[87], lllllllIl[12], lllllllIl[24], lllllllIl[10]);
        WorldArea worldArea6 = new WorldArea(lllllllIl[191], lllllllIl[192], lllllllIl[73], lllllllIl[38], lllllllIl[10]);
        WorldArea worldArea7 = new WorldArea(lllllllIl[90], lllllllIl[91], lllllllIl[66], lllllllIl[64], lllllllIl[10]);
        WorldArea worldArea8 = new WorldArea(lllllllIl[92], lllllllIl[93], lllllllIl[22], lllllllIl[26], lllllllIl[10]);
        WorldArea worldArea9 = new WorldArea(lllllllIl[92], lllllllIl[94], lllllllIl[12], lllllllIl[22], lllllllIl[10]);
        WorldArea worldArea10 = new WorldArea(lllllllIl[127], lllllllIl[128], lllllllIl[49], lllllllIl[12], lllllllIl[3]);
        WorldArea worldArea11 = new WorldArea(lllllllIl[129], lllllllIl[127], lllllllIl[49], lllllllIl[24], lllllllIl[3]);
        WorldArea worldArea12 = new WorldArea(lllllllIl[130], lllllllIl[131], lllllllIl[63], lllllllIl[49], lllllllIl[3]);
        WorldArea worldArea13 = new WorldArea(lllllllIl[132], lllllllIl[133], lllllllIl[12], lllllllIl[64], lllllllIl[10]);
        WorldArea worldArea14 = new WorldArea(lllllllIl[134], lllllllIl[9], lllllllIl[49], lllllllIl[26], lllllllIl[3]);
        WorldArea worldArea15 = new WorldArea(lllllllIl[135], lllllllIl[136], lllllllIl[68], lllllllIl[53], lllllllIl[10]);
        WorldArea worldArea16 = new WorldArea(lllllllIl[137], lllllllIl[138], lllllllIl[63], lllllllIl[64], lllllllIl[3]);
        WorldArea worldArea17 = new WorldArea(lllllllIl[164], lllllllIl[133], lllllllIl[64], lllllllIl[12], lllllllIl[10]);
        WorldArea worldArea18 = new WorldArea(lllllllIl[165], lllllllIl[139], lllllllIl[38], lllllllIl[53], lllllllIl[3]);
        WorldArea worldArea19 = new WorldArea(lllllllIl[166], lllllllIl[134], lllllllIl[49], lllllllIl[26], lllllllIl[3]);
        WorldArea worldArea20 = new WorldArea(lllllllIl[167], lllllllIl[136], lllllllIl[70], lllllllIl[64], lllllllIl[10]);
        WorldArea worldArea21 = new WorldArea(lllllllIl[168], lllllllIl[169], lllllllIl[54], lllllllIl[63], lllllllIl[3]);
        WorldArea[] worldAreaArray = new WorldArea[lllllllIl[68]];
        worldAreaArray[ad.lllllllIl[0]] = worldArea;
        worldAreaArray[ad.lllllllIl[1]] = worldArea2;
        worldAreaArray[ad.lllllllIl[3]] = worldArea3;
        worldAreaArray[ad.lllllllIl[10]] = worldArea4;
        worldAreaArray[ad.lllllllIl[17]] = worldArea5;
        worldAreaArray[ad.lllllllIl[2]] = worldArea6;
        worldAreaArray[ad.lllllllIl[20]] = worldArea7;
        worldAreaArray[ad.lllllllIl[22]] = worldArea8;
        worldAreaArray[ad.lllllllIl[24]] = worldArea9;
        worldAreaArray[ad.lllllllIl[26]] = worldArea10;
        worldAreaArray[ad.lllllllIl[12]] = worldArea11;
        worldAreaArray[ad.lllllllIl[49]] = worldArea12;
        worldAreaArray[ad.lllllllIl[63]] = worldArea13;
        worldAreaArray[ad.lllllllIl[64]] = worldArea14;
        worldAreaArray[ad.lllllllIl[53]] = worldArea15;
        worldAreaArray[ad.lllllllIl[38]] = worldArea16;
        worldAreaArray[ad.lllllllIl[65]] = worldArea17;
        worldAreaArray[ad.lllllllIl[66]] = worldArea18;
        worldAreaArray[ad.lllllllIl[54]] = worldArea19;
        worldAreaArray[ad.lllllllIl[67]] = worldArea20;
        worldAreaArray[ad.lllllllIl[40]] = worldArea21;
        WorldArea[] worldAreaArray2 = worldAreaArray;
        int[] nArray = new int[lllllllIl[1]];
        nArray[ad.lllllllIl[0]] = lllllllIl[193];
        if (ad.llIllIIlIlIl(TileItems.getNearest((int[])nArray))) {
            void lIIlllIlIllll;
            System.out.println(lllllllII[lllllllIl[194]]);
            int lIIlllIlIlllI = lllllllIl[0];
            while (ad.llIllIIlIIll(lIIlllIlIlllI, ((void)lIIlllIlIllll).length)) {
                int[] nArray2 = new int[lllllllIl[1]];
                nArray2[ad.lllllllIl[0]] = lllllllIl[193];
                if (ad.llIllIIlIIlI(lIIlllIlIllll[lIIlllIlIlllI].contains(TileItems.getNearest((int[])nArray2).getWorldLocation()) ? 1 : 0) && ad.llIllIIlIIlI(lIIlllIlIllll[lIIlllIlIlllI].contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    return lllllllIl[1];
                }
                ++lIIlllIlIlllI;

                if (3 > 2) continue;
                return ((0x5B ^ 0x41 ^ (0x3F ^ 0x22)) & (14 + 14 - -70 + 63 ^ 162 + 82 - 82 + 4 ^ -1)) != 0;
            }
        }
        return lllllllIl[0];
    }

    @Override
    public boolean ah() {
        boolean bl;
        if (ad.llIllIIllIII(Skills.getLevel((Skill)Skill.AGILITY), lllllllIl[2])) {
            bl = lllllllIl[1];

            if (1 == 0) {
                return ((0x15 ^ 0x3A ^ (0x7A ^ 0x4A)) & (0x6F ^ 0xE ^ (0xC3 ^ 0xBD) ^ -1)) != 0;
            }
        } else {
            bl = lllllllIl[0];
        }
        return bl;
    }

    /*
     * WARNING - void declaration
     */
    private static void dX() {
        void lIIllllIlllll;
        void lIIlllllIIlIl;
        void lIIlllllIIllI;
        void lIIlllllIIlll;
        void lIIlllllIlIII;
        WorldArea worldArea = new WorldArea(lllllllIl[162], lllllllIl[163], lllllllIl[111], lllllllIl[111], lllllllIl[0]);
        WorldArea worldArea2 = new WorldArea(lllllllIl[162], lllllllIl[163], lllllllIl[111], lllllllIl[111], lllllllIl[1]);
        WorldArea worldArea3 = new WorldArea(lllllllIl[162], lllllllIl[163], lllllllIl[111], lllllllIl[111], lllllllIl[3]);
        WorldArea worldArea4 = new WorldArea(lllllllIl[162], lllllllIl[163], lllllllIl[111], lllllllIl[111], lllllllIl[10]);
        WorldArea worldArea5 = new WorldArea(lllllllIl[164], lllllllIl[133], lllllllIl[64], lllllllIl[12], lllllllIl[10]);
        WorldArea worldArea6 = new WorldArea(lllllllIl[165], lllllllIl[139], lllllllIl[38], lllllllIl[53], lllllllIl[3]);
        WorldArea worldArea7 = new WorldArea(lllllllIl[166], lllllllIl[134], lllllllIl[49], lllllllIl[26], lllllllIl[3]);
        WorldArea worldArea8 = new WorldArea(lllllllIl[167], lllllllIl[136], lllllllIl[70], lllllllIl[64], lllllllIl[10]);
        WorldArea worldArea9 = new WorldArea(lllllllIl[168], lllllllIl[169], lllllllIl[54], lllllllIl[63], lllllllIl[3]);
        WorldPoint worldPoint = new WorldPoint(lllllllIl[170], lllllllIl[171], lllllllIl[0]);
        if (ad.llIllIIlIIlI(Dialog.isOpen() ? 1 : 0)) {
            Dialog.close();
        }
        if (ad.llIllIIlIlII(lIIlllllIlIII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && ad.llIllIIlIlII(lIIlllllIIlll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && ad.llIllIIlIlII(lIIlllllIIllI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && ad.llIllIIlIlII(lIIlllllIIlIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderGWD.c = lllllllII[lllllllIl[172]];
            Movement.walkTo((WorldPoint)lIIllllIlllll);

            Time.sleepTicks((int)lllllllIl[1]);

        }
        if (ad.llIllIIlIIlI(lIIlllllIlIII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (ad.llIllIIlIllI(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lIIllllIlllll), lllllllIl[20])) {
                AccBuilderGWD.c = lllllllII[lllllllIl[173]];
                Movement.walkTo((WorldPoint)lIIllllIlllll);

                Time.sleepTicks((int)lllllllIl[1]);

            }
            if (ad.llIllIIllIlI(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lIIllllIlllll), lllllllIl[20])) {
                AccBuilderGWD.c = lllllllII[lllllllIl[174]];
                int lIIllllIllllI = Skills.getExperience((Skill)Skill.AGILITY);
                String[] stringArray = new String[lllllllIl[1]];
                stringArray[ad.lllllllIl[0]] = lllllllII[lllllllIl[175]];
                TileObjects.getNearest((String[])stringArray).interact(lllllllII[lllllllIl[35]]);
                Time.sleepTicks((int)e.c(lllllllIl[1], lllllllIl[3]));

                Time.sleepUntil(() -> {
                    boolean bl;
                    if (ad.llIllIIlIllI(Skills.getExperience((Skill)Skill.AGILITY), lIIllllIllllI)) {
                        bl = lllllllIl[1];

                        if (2 < 0) {
                            return false;
                        }
                    } else {
                        bl = lllllllIl[0];
                    }
                    return bl;
                }, (int)lllllllIl[104]);

                Time.sleepTicks((int)lllllllIl[1]);

            }
        }
        String[] stringArray = new String[lllllllIl[1]];
        stringArray[ad.lllllllIl[0]] = lllllllII[lllllllIl[176]];
        TileItem lIIllllIllllI = TileItems.getNearest((String[])stringArray);
        if (ad.llIllIIlIlIl(lIIllllIllllI) && ad.llIllIIlIIlI(ad.dY() ? 1 : 0)) {
            AccBuilderGWD.c = lllllllII[lllllllIl[177]];
            System.out.println(lllllllII[lllllllIl[178]]);
            lIIllllIllllI.interact(lllllllII[lllllllIl[179]]);
            Time.sleepTicks((int)lllllllIl[10]);

        }
        if (ad.llIllIIlIlII(ad.dY() ? 1 : 0)) {
            void lIIlllllIIIII;
            void lIIlllllIIIIl;
            void lIIlllllIIIlI;
            void lIIlllllIIIll;
            int lIIllllIlllII;
            TileObject lIIllllIlllIl;
            void lIIlllllIIlII;
            if (ad.llIllIIlIIlI(lIIlllllIIlII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && ad.llIllIIlIlIl(lIIllllIlllIl = TileObjects.getNearest(tileObject -> {
                int n2;
                if (ad.llIllIIlIIlI(tileObject.getName().contains(lllllllII[lllllllIl[218]]) ? 1 : 0) && ad.llIllIIllIlI(tileObject.getWorldLocation().distanceTo(new WorldPoint(lllllllIl[219], lllllllIl[220], lllllllIl[10])), lllllllIl[3])) {
                    n2 = lllllllIl[1];

                    if (-(0x4B ^ 0x4F) >= 0) {
                        return false;
                    }
                } else {
                    n2 = lllllllIl[0];
                }
                return n2 != 0;
            }))) {
                lIIllllIlllII = Skills.getExperience((Skill)Skill.AGILITY);
                AccBuilderGWD.c = lllllllII[lllllllIl[180]];
                lIIllllIlllIl.interact(lllllllII[lllllllIl[79]]);
                Time.sleepTicks((int)e.c(lllllllIl[1], lllllllIl[3]));

                Time.sleepUntil(() -> {
                    boolean bl;
                    if (ad.llIllIIlIllI(Skills.getExperience((Skill)Skill.AGILITY), lIIllllIlllII)) {
                        bl = lllllllIl[1];

                        }
                    } else {
                        bl = lllllllIl[0];
                    }
                    return bl;
                }, (int)lllllllIl[104]);

                Time.sleepTicks((int)lllllllIl[1]);

            }
            if (ad.llIllIIlIIlI(ad.dY() ? 1 : 0)) {
                return;
            }
            if (ad.llIllIIlIIlI(lIIlllllIIIll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && ad.llIllIIlIlIl(lIIllllIlllIl = TileObjects.getNearest(tileObject -> {
                int n2;
                if (ad.llIllIIlIIlI(tileObject.getName().contains(lllllllII[lllllllIl[216]]) ? 1 : 0) && ad.llIllIIllIlI(tileObject.getWorldLocation().distanceTo(new WorldPoint(lllllllIl[217], lllllllIl[128], lllllllIl[3])), lllllllIl[3])) {
                    n2 = lllllllIl[1];

                    if (2 <= ((8 + 198 - 187 + 190 ^ 82 + 95 - 89 + 91) & (94 + 58 - 114 + 191 ^ 40 + 64 - 31 + 62 ^ -1))) {
                        return false;
                    }
                } else {
                    n2 = lllllllIl[0];
                }
                return n2 != 0;
            }))) {
                AccBuilderGWD.c = lllllllII[lllllllIl[181]];
                lIIllllIlllII = Skills.getExperience((Skill)Skill.AGILITY);
                lIIllllIlllIl.interact(lllllllII[lllllllIl[182]]);
                Time.sleepTicks((int)e.c(lllllllIl[1], lllllllIl[3]));

                Time.sleepUntil(() -> {
                    boolean bl;
                    if (ad.llIllIIlIllI(Skills.getExperience((Skill)Skill.AGILITY), lIIllllIlllII)) {
                        bl = lllllllIl[1];

                    } else {
                        bl = lllllllIl[0];
                    }
                    return bl;
                }, (int)lllllllIl[104]);

                Time.sleepTicks((int)lllllllIl[1]);

            }
            if (ad.llIllIIlIIlI(ad.dY() ? 1 : 0)) {
                return;
            }
            if (ad.llIllIIlIIlI(lIIlllllIIIlI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && ad.llIllIIlIlIl(lIIllllIlllIl = TileObjects.getNearest(tileObject -> {
                int n2;
                if (ad.llIllIIlIIlI(tileObject.getName().contains(lllllllII[lllllllIl[213]]) ? 1 : 0) && ad.llIllIIllIlI(tileObject.getWorldLocation().distanceTo(new WorldPoint(lllllllIl[214], lllllllIl[215], lllllllIl[3])), lllllllIl[3])) {
                    n2 = lllllllIl[1];

                    if (1 > 2) {
                        return false;
                    }
                } else {
                    n2 = lllllllIl[0];
                }
                return n2 != 0;
            }))) {
                AccBuilderGWD.c = lllllllII[lllllllIl[183]];
                lIIllllIlllII = Skills.getExperience((Skill)Skill.AGILITY);
                lIIllllIlllIl.interact(lllllllII[lllllllIl[184]]);
                Time.sleepTicks((int)e.c(lllllllIl[1], lllllllIl[3]));

                Time.sleepUntil(() -> {
                    boolean bl;
                    if (ad.llIllIIlIllI(Skills.getExperience((Skill)Skill.AGILITY), lIIllllIlllII)) {
                        bl = lllllllIl[1];

                        }
                    } else {
                        bl = lllllllIl[0];
                    }
                    return bl;
                }, (int)lllllllIl[104]);

                Time.sleepTicks((int)lllllllIl[1]);

            }
            if (ad.llIllIIlIIlI(ad.dY() ? 1 : 0)) {
                return;
            }
            if (ad.llIllIIlIIlI(lIIlllllIIIIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && ad.llIllIIlIlIl(lIIllllIlllIl = TileObjects.getNearest(tileObject -> {
                int n2;
                if (ad.llIllIIlIIlI(tileObject.getName().contains(lllllllII[lllllllIl[211]]) ? 1 : 0) && ad.llIllIIllIlI(tileObject.getWorldLocation().distanceTo(new WorldPoint(lllllllIl[209], lllllllIl[212], lllllllIl[10])), lllllllIl[3])) {
                    n2 = lllllllIl[1];

                } else {
                    n2 = lllllllIl[0];
                }
                return n2 != 0;
            }))) {
                AccBuilderGWD.c = lllllllII[lllllllIl[185]];
                lIIllllIlllII = Skills.getExperience((Skill)Skill.AGILITY);
                lIIllllIlllIl.interact(lllllllII[lllllllIl[186]]);
                Time.sleepTicks((int)e.c(lllllllIl[1], lllllllIl[3]));

                Time.sleepUntil(() -> {
                    boolean bl;
                    if (ad.llIllIIlIllI(Skills.getExperience((Skill)Skill.AGILITY), lIIllllIlllII)) {
                        bl = lllllllIl[1];

                        if ((0x65 ^ 0x61 ^ (0x63 ^ 0x49) & ~(3 ^ 0x29)) < 0) {
                            return ((0xA4 ^ 0xC6 ^ (0x2A ^ 0x53)) & (71 + 51 - 38 + 55 ^ 19 + 73 - 7 + 59 ^ -1)) != 0;
                        }
                    } else {
                        bl = lllllllIl[0];
                    }
                    return bl;
                }, (int)lllllllIl[104]);

                Time.sleepTicks((int)lllllllIl[1]);

            }
            if (ad.llIllIIlIIlI(ad.dY() ? 1 : 0)) {
                return;
            }
            if (ad.llIllIIlIIlI(lIIlllllIIIII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && ad.llIllIIlIlIl(lIIllllIlllIl = TileObjects.getNearest(tileObject -> {
                int n2;
                if (ad.llIllIIlIIlI(tileObject.getName().contains(lllllllII[lllllllIl[208]]) ? 1 : 0) && ad.llIllIIllIlI(tileObject.getWorldLocation().distanceTo(new WorldPoint(lllllllIl[209], lllllllIl[210], lllllllIl[3])), lllllllIl[3])) {
                    n2 = lllllllIl[1];

                    }
                } else {
                    n2 = lllllllIl[0];
                }
                return n2 != 0;
            }))) {
                AccBuilderGWD.c = lllllllII[lllllllIl[187]];
                lIIllllIlllII = Skills.getExperience((Skill)Skill.AGILITY);
                lIIllllIlllIl.interact(lllllllII[lllllllIl[188]]);
                Time.sleepTicks((int)e.c(lllllllIl[1], lllllllIl[3]));

                Time.sleepUntil(() -> {
                    boolean bl;
                    if (ad.llIllIIlIllI(Skills.getExperience((Skill)Skill.AGILITY), lIIllllIlllII)) {
                        bl = lllllllIl[1];

                        }
                    } else {
                        bl = lllllllIl[0];
                    }
                    return bl;
                }, (int)lllllllIl[104]);

                Time.sleepTicks((int)lllllllIl[1]);

            }
        }
    }

    private static boolean llIllIIlIlII(int n2) {
        return n2 == 0;
    }

    private static boolean llIllIIlIlIl(Object object) {
        return object != null;
    }

    private static boolean llIllIIllIIl(int n2, int n3) {
        return n2 == n3;
    }

        return String.valueOf(lIIllIlIIlIlI);
    }

    @Override
    public String ag() {
        return lllllllII[lllllllIl[203]];
    }

    private static boolean llIllIIllIII(int n2, int n3) {
        return n2 >= n3;
    }

    public static void Q() {
        d lIIlllIlIllII;
        block18: {
            block17: {
                block16: {
                    block15: {
                        int[] nArray = new int[lllllllIl[1]];
                        nArray[ad.lllllllIl[0]] = lllllllIl[16];
                        if (ad.llIllIIlIlII(Bank.contains((int[])nArray) ? 1 : 0)) {
                            d d2 = new DHelper(lllllllIl[16], lllllllIl[1], lllllllIl[195]);
                            bx.add(d2);

                        }
                        int[] nArray2 = new int[lllllllIl[1]];
                        nArray2[ad.lllllllIl[0]] = lllllllIl[18];
                        if (ad.llIllIIlIlII(Bank.contains((int[])nArray2) ? 1 : 0)) {
                            lIIlllIlIllII = new DHelper(lllllllIl[18], lllllllIl[3], lllllllIl[196]);
                            bx.add(lIIlllIlIllII);

                        }
                        int[] nArray3 = new int[lllllllIl[1]];
                        nArray3[ad.lllllllIl[0]] = lllllllIl[27];
                        if (ad.llIllIIlIlII(Bank.contains((int[])nArray3) ? 1 : 0)) {
                            lIIlllIlIllII = new DHelper(lllllllIl[27], lllllllIl[3], lllllllIl[196]);
                            bx.add(lIIlllIlIllII);

                        }
                        int[] nArray4 = new int[lllllllIl[1]];
                        nArray4[ad.lllllllIl[0]] = lllllllIl[13];
                        if (ad.llIllIIlIlII(Bank.contains((int[])nArray4) ? 1 : 0)) {
                            lIIlllIlIllII = new DHelper(lllllllIl[13], lllllllIl[12], lllllllIl[197]);
                            bx.add(lIIlllIlIllII);

                        }
                        int[] nArray5 = new int[lllllllIl[1]];
                        nArray5[ad.lllllllIl[0]] = lllllllIl[21];
                        if (ad.llIllIIlIlII(Bank.contains((int[])nArray5) ? 1 : 0)) {
                            lIIlllIlIllII = new DHelper(lllllllIl[21], lllllllIl[12], lllllllIl[198]);
                            bx.add(lIIlllIlIllII);

                        }
                        int[] nArray6 = new int[lllllllIl[1]];
                        nArray6[ad.lllllllIl[0]] = lllllllIl[15];
                        if (ad.llIllIIlIlII(Bank.contains((int[])nArray6) ? 1 : 0)) {
                            lIIlllIlIllII = new DHelper(lllllllIl[15], lllllllIl[12], lllllllIl[198]);
                            bx.add(lIIlllIlIllII);

                        }
                        int[] nArray7 = new int[lllllllIl[1]];
                        nArray7[ad.lllllllIl[0]] = lllllllIl[14];
                        if (ad.llIllIIlIlII(Bank.contains((int[])nArray7) ? 1 : 0)) {
                            lIIlllIlIllII = new DHelper(lllllllIl[14], lllllllIl[12], lllllllIl[198]);
                            bx.add(lIIlllIlIllII);

                        }
                        int[] nArray8 = new int[lllllllIl[1]];
                        nArray8[ad.lllllllIl[0]] = lllllllIl[23];
                        if (!ad.llIllIIlIIlI(Bank.contains((int[])nArray8) ? 1 : 0)) break block15;
                        int[] nArray9 = new int[lllllllIl[1]];
                        nArray9[ad.lllllllIl[0]] = lllllllIl[23];
                        if (!ad.llIllIIlIIlI(Bank.contains((int[])nArray9) ? 1 : 0)) break block16;
                        int[] nArray10 = new int[lllllllIl[1]];
                        nArray10[ad.lllllllIl[0]] = lllllllIl[23];
                        if (!ad.llIllIIlIIll(Bank.getFirst((int[])nArray10).getQuantity(), lllllllIl[12])) break block16;
                    }
                    lIIlllIlIllII = new DHelper(lZ, lllllllIl[44], lllllllIl[199]);
                    bx.add(lIIlllIlIllII);

                }
                int[] nArray = new int[lllllllIl[1]];
                nArray[ad.lllllllIl[0]] = lllllllIl[25];
                if (!ad.llIllIIlIIlI(Bank.contains((int[])nArray) ? 1 : 0)) break block17;
                int[] nArray11 = new int[lllllllIl[1]];
                nArray11[ad.lllllllIl[0]] = lllllllIl[25];
                if (!ad.llIllIIlIIlI(Bank.contains((int[])nArray11) ? 1 : 0)) break block18;
                int[] nArray12 = new int[lllllllIl[1]];
                nArray12[ad.lllllllIl[0]] = lllllllIl[25];
                if (!ad.llIllIIlIIll(Bank.getFirst((int[])nArray12).getQuantity(), lllllllIl[12])) break block18;
            }
            lIIlllIlIllII = new DHelper(lllllllIl[25], lllllllIl[12], lllllllIl[200]);
            bx.add(lIIlllIlIllII);

        }
        int[] nArray = new int[lllllllIl[1]];
        nArray[ad.lllllllIl[0]] = lllllllIl[201];
        if (ad.llIllIIlIlII(Bank.contains((int[])nArray) ? 1 : 0)) {
            lIIlllIlIllII = new DHelper(lllllllIl[201], lllllllIl[1], lllllllIl[202]);
            bx.add(lIIlllIlIllII);

        }
        int[] nArray13 = new int[lllllllIl[1]];
        nArray13[ad.lllllllIl[0]] = lllllllIl[19];
        if (ad.llIllIIlIlII(Bank.contains((int[])nArray13) ? 1 : 0)) {
            lIIlllIlIllII = new DHelper(lllllllIl[19], lllllllIl[40], j.ch);
            bx.add(lIIlllIlIllII);

        }
    }

    private static boolean llIllIIlIIll(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * WARNING - void declaration
     */
    private static void dV() {
        WorldArea worldArea = new WorldArea(lllllllIl[76], lllllllIl[77], lllllllIl[78], lllllllIl[79], lllllllIl[1]);
        WorldArea worldArea2 = new WorldArea(lllllllIl[76], lllllllIl[77], lllllllIl[78], lllllllIl[79], lllllllIl[3]);
        WorldArea worldArea3 = new WorldArea(lllllllIl[76], lllllllIl[77], lllllllIl[78], lllllllIl[79], lllllllIl[10]);
        WorldArea worldArea4 = new WorldArea(lllllllIl[80], lllllllIl[81], lllllllIl[69], lllllllIl[64], lllllllIl[0]);
        WorldArea worldArea5 = new WorldArea(lllllllIl[82], lllllllIl[81], lllllllIl[12], lllllllIl[64], lllllllIl[10]);
        WorldArea worldArea6 = new WorldArea(lllllllIl[83], lllllllIl[84], lllllllIl[63], lllllllIl[49], lllllllIl[10]);
        WorldArea worldArea7 = new WorldArea(lllllllIl[85], lllllllIl[86], lllllllIl[26], lllllllIl[22], lllllllIl[1]);
        WorldArea worldArea8 = new WorldArea(lllllllIl[85], lllllllIl[87], lllllllIl[12], lllllllIl[24], lllllllIl[10]);
        WorldArea worldArea9 = new WorldArea(lllllllIl[88], lllllllIl[89], lllllllIl[75], lllllllIl[40], lllllllIl[10]);
        WorldArea worldArea10 = new WorldArea(lllllllIl[90], lllllllIl[91], lllllllIl[66], lllllllIl[64], lllllllIl[10]);
        WorldArea worldArea11 = new WorldArea(lllllllIl[92], lllllllIl[93], lllllllIl[22], lllllllIl[26], lllllllIl[10]);
        WorldArea worldArea12 = new WorldArea(lllllllIl[92], lllllllIl[94], lllllllIl[12], lllllllIl[22], lllllllIl[10]);
        if (ad.llIllIIlIlII(worldArea4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && ad.llIllIIlIlII(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && ad.llIllIIlIlII(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && ad.llIllIIlIlII(worldArea3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderGWD.c = lllllllII[lllllllIl[95]];
            if (ad.llIllIIlIIlI(Bank.isOpen() ? 1 : 0)) {
                Bank.close();
            }
            if (ad.llIllIIlIIlI(Dialog.isOpen() ? 1 : 0)) {
                Dialog.close();
            }
            Movement.walkTo((WorldPoint)new WorldPoint(lllllllIl[96], lllllllIl[52], lllllllIl[0]));

            Time.sleepTicks((int)lllllllIl[1]);

        }
        if (ad.llIllIIllIIl(Players.getLocal().getAnimation(), lllllllIl[62]) && ad.llIllIIlIlII(Players.getLocal().isMoving() ? 1 : 0)) {
            String[] stringArray = new String[lllllllIl[1]];
            stringArray[ad.lllllllIl[0]] = lllllllII[lllllllIl[97]];
            TileItem lIlIIIIIlIlIl = TileItems.getNearest((String[])stringArray);
            if (ad.llIllIIlIlIl(lIlIIIIIlIlIl) && ad.llIllIIlIIlI(ad.dY() ? 1 : 0)) {
                AccBuilderGWD.c = lllllllII[lllllllIl[98]];
                System.out.println(lllllllII[lllllllIl[99]]);
                lIlIIIIIlIlIl.interact(lllllllII[lllllllIl[100]]);
                Time.sleepTicks((int)lllllllIl[10]);

            }
            if (ad.llIllIIlIlII(ad.dY() ? 1 : 0)) {
                void lIlIIIIIlIllI;
                void lIlIIIIIlIlll;
                void lIlIIIIIllIII;
                void lIlIIIIIllIIl;
                void lIlIIIIIllIlI;
                void lIlIIIIIllIll;
                void lIlIIIIIlllII;
                void lIlIIIIIlllIl;
                int lIlIIIIIlIlII;
                void lIlIIIIIllllI;
                if (ad.llIllIIlIIlI(lIlIIIIIllllI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && ad.llIllIIlIlII(ad.dY() ? 1 : 0)) {
                    AccBuilderGWD.c = lllllllII[lllllllIl[101]];
                    lIlIIIIIlIlII = Skills.getExperience((Skill)Skill.AGILITY);
                    String[] stringArray2 = new String[lllllllIl[1]];
                    stringArray2[ad.lllllllIl[0]] = lllllllII[lllllllIl[102]];
                    TileObjects.getNearest((String[])stringArray2).interact(lllllllII[lllllllIl[103]]);
                    Time.sleepUntil(() -> {
                        boolean bl;
                        if (ad.llIllIIlIllI(Skills.getExperience((Skill)Skill.AGILITY), lIlIIIIIlIlII)) {
                            bl = lllllllIl[1];

                            if ((0x8E ^ 0x8B) == 0) {
                                return false;
                            }
                        } else {
                            bl = lllllllIl[0];
                        }
                        return bl;
                    }, (int)lllllllIl[104]);

                    Time.sleepTicks((int)lllllllIl[1]);

                }
                if (ad.llIllIIlIIlI(lIlIIIIIlllIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && ad.llIllIIlIlII(ad.dY() ? 1 : 0)) {
                    AccBuilderGWD.c = lllllllII[lllllllIl[37]];
                    lIlIIIIIlIlII = Skills.getExperience((Skill)Skill.AGILITY);
                    String[] stringArray3 = new String[lllllllIl[1]];
                    stringArray3[ad.lllllllIl[0]] = lllllllII[lllllllIl[105]];
                    TileObjects.getNearest((String[])stringArray3).interact(lllllllII[lllllllIl[106]]);
                    Time.sleepUntil(() -> {
                        boolean bl;
                        if (ad.llIllIIlIllI(Skills.getExperience((Skill)Skill.AGILITY), lIlIIIIIlIlII)) {
                            bl = lllllllIl[1];

                            }
                        } else {
                            bl = lllllllIl[0];
                        }
                        return bl;
                    }, (int)lllllllIl[104]);

                    Time.sleepTicks((int)lllllllIl[1]);

                }
                if (ad.llIllIIlIIlI(lIlIIIIIlllII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && ad.llIllIIlIlII(ad.dY() ? 1 : 0)) {
                    AccBuilderGWD.c = lllllllII[lllllllIl[107]];
                    lIlIIIIIlIlII = Skills.getExperience((Skill)Skill.AGILITY);
                    String[] stringArray4 = new String[lllllllIl[1]];
                    stringArray4[ad.lllllllIl[0]] = lllllllII[lllllllIl[108]];
                    TileObjects.getNearest((String[])stringArray4).interact(lllllllII[lllllllIl[109]]);
                    Time.sleepUntil(() -> {
                        boolean bl;
                        if (ad.llIllIIlIllI(Skills.getExperience((Skill)Skill.AGILITY), lIlIIIIIlIlII)) {
                            bl = lllllllIl[1];

                            if (((0xCB ^ 0x81) & ~(0xCC ^ 0x86)) != 0) {
                                return false;
                            }
                        } else {
                            bl = lllllllIl[0];
                        }
                        return bl;
                    }, (int)lllllllIl[104]);

                    Time.sleepTicks((int)lllllllIl[1]);

                }
                if (ad.llIllIIlIIlI(lIlIIIIIllIll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && ad.llIllIIlIlII(ad.dY() ? 1 : 0)) {
                    AccBuilderGWD.c = lllllllII[lllllllIl[110]];
                    lIlIIIIIlIlII = Skills.getExperience((Skill)Skill.AGILITY);
                    String[] stringArray5 = new String[lllllllIl[1]];
                    stringArray5[ad.lllllllIl[0]] = lllllllII[lllllllIl[111]];
                    TileObjects.getNearest((String[])stringArray5).interact(lllllllII[lllllllIl[112]]);
                    Time.sleepUntil(() -> {
                        boolean bl;
                        if (ad.llIllIIlIllI(Skills.getExperience((Skill)Skill.AGILITY), lIlIIIIIlIlII)) {
                            bl = lllllllIl[1];

                            if (3 == 0) {
                                return (2 & (2 ^ -1)) != 0;
                            }
                        } else {
                            bl = lllllllIl[0];
                        }
                        return bl;
                    }, (int)lllllllIl[104]);

                    Time.sleepTicks((int)lllllllIl[1]);

                }
                if (ad.llIllIIlIIlI(lIlIIIIIllIlI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && ad.llIllIIlIlII(ad.dY() ? 1 : 0)) {
                    AccBuilderGWD.c = lllllllII[lllllllIl[113]];
                    lIlIIIIIlIlII = Skills.getExperience((Skill)Skill.AGILITY);
                    String[] stringArray6 = new String[lllllllIl[1]];
                    stringArray6[ad.lllllllIl[0]] = lllllllII[lllllllIl[39]];
                    TileObjects.getNearest((String[])stringArray6).interact(lllllllII[lllllllIl[7]]);
                    Time.sleepUntil(() -> {
                        boolean bl;
                        if (ad.llIllIIlIllI(Skills.getExperience((Skill)Skill.AGILITY), lIlIIIIIlIlII)) {
                            bl = lllllllIl[1];

                            }
                        } else {
                            bl = lllllllIl[0];
                        }
                        return bl;
                    }, (int)lllllllIl[104]);

                    Time.sleepTicks((int)lllllllIl[1]);

                }
                if (ad.llIllIIlIIlI(lIlIIIIIllIIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && ad.llIllIIlIlII(ad.dY() ? 1 : 0)) {
                    AccBuilderGWD.c = lllllllII[lllllllIl[114]];
                    lIlIIIIIlIlII = Skills.getExperience((Skill)Skill.AGILITY);
                    int[] nArray = new int[lllllllIl[1]];
                    nArray[ad.lllllllIl[0]] = lllllllIl[115];
                    TileObjects.getNearest((int[])nArray).interact(lllllllII[lllllllIl[116]]);
                    Time.sleepUntil(() -> {
                        boolean bl;
                        if (ad.llIllIIlIllI(Skills.getExperience((Skill)Skill.AGILITY), lIlIIIIIlIlII)) {
                            bl = lllllllIl[1];

                            if (1 == 0) {
                                return false;
                            }
                        } else {
                            bl = lllllllIl[0];
                        }
                        return bl;
                    }, (int)lllllllIl[104]);

                    Time.sleepTicks((int)lllllllIl[1]);

                }
                if (ad.llIllIIlIIlI(lIlIIIIIllIII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && ad.llIllIIlIlII(ad.dY() ? 1 : 0)) {
                    AccBuilderGWD.c = lllllllII[lllllllIl[117]];
                    lIlIIIIIlIlII = Skills.getExperience((Skill)Skill.AGILITY);
                    int[] nArray = new int[lllllllIl[1]];
                    nArray[ad.lllllllIl[0]] = lllllllIl[118];
                    TileObjects.getNearest((int[])nArray).interact(lllllllII[lllllllIl[119]]);
                    Time.sleepUntil(() -> {
                        boolean bl;
                        if (ad.llIllIIlIllI(Skills.getExperience((Skill)Skill.AGILITY), lIlIIIIIlIlII)) {
                            bl = lllllllIl[1];

                            }
                        } else {
                            bl = lllllllIl[0];
                        }
                        return bl;
                    }, (int)lllllllIl[104]);

                    Time.sleepTicks((int)lllllllIl[1]);

                }
                if (ad.llIllIIlIIlI(lIlIIIIIlIlll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && ad.llIllIIlIlII(ad.dY() ? 1 : 0)) {
                    AccBuilderGWD.c = lllllllII[lllllllIl[120]];
                    lIlIIIIIlIlII = Skills.getExperience((Skill)Skill.AGILITY);
                    int[] nArray = new int[lllllllIl[1]];
                    nArray[ad.lllllllIl[0]] = lllllllIl[121];
                    TileObjects.getNearest((int[])nArray).interact(lllllllII[lllllllIl[122]]);
                    Time.sleepUntil(() -> {
                        boolean bl;
                        if (ad.llIllIIlIllI(Skills.getExperience((Skill)Skill.AGILITY), lIlIIIIIlIlII)) {
                            bl = lllllllIl[1];

                        } else {
                            bl = lllllllIl[0];
                        }
                        return bl;
                    }, (int)lllllllIl[104]);

                    Time.sleepTicks((int)lllllllIl[1]);

                }
                if (ad.llIllIIlIIlI(lIlIIIIIlIllI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && ad.llIllIIlIlII(ad.dY() ? 1 : 0)) {
                    AccBuilderGWD.c = lllllllII[lllllllIl[123]];
                    lIlIIIIIlIlII = Skills.getExperience((Skill)Skill.AGILITY);
                    String[] stringArray7 = new String[lllllllIl[1]];
                    stringArray7[ad.lllllllIl[0]] = lllllllII[lllllllIl[124]];
                    TileObjects.getNearest((String[])stringArray7).interact(lllllllII[lllllllIl[44]]);
                    Time.sleepUntil(() -> {
                        boolean bl;
                        if (ad.llIllIIlIllI(Skills.getExperience((Skill)Skill.AGILITY), lIlIIIIIlIlII)) {
                            bl = lllllllIl[1];

                            if (-1 >= (0xC3 ^ 0xC7)) {
                                return false;
                            }
                        } else {
                            bl = lllllllIl[0];
                        }
                        return bl;
                    }, (int)lllllllIl[104]);

                    Time.sleepTicks((int)lllllllIl[1]);

                }
            }
        }
    }

    private static boolean llIllIIllIlI(int n2, int n3) {
        return n2 <= n3;
    }
}

