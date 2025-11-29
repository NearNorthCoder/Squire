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

public class ACHelper
implements ab {
    public static  boolean bv;
    private static  WorldPoint me;
    static  WorldArea mb;
    
    static  WorldArea md;
    public static  int lZ;
    static  WorldArea mc;
    public static  int ma;
    
    public static  int lY;
    public static  List<d> bx;

    @Override
    public int af() {
        try {
            ac.dT();

        }
        catch (Exception exception) {
            // empty catch block
        }
        
        }
        return lIIIIIIlII[186];
    }

    /*
     * WARNING - void declaration
     */
    private static void dV() {
        WorldArea worldArea = new WorldArea(lIIIIIIlII[76], lIIIIIIlII[77], lIIIIIIlII[78], lIIIIIIlII[79], lIIIIIIlII[1]);
        WorldArea worldArea2 = new WorldArea(lIIIIIIlII[76], lIIIIIIlII[77], lIIIIIIlII[78], lIIIIIIlII[79], lIIIIIIlII[3]);
        WorldArea worldArea3 = new WorldArea(lIIIIIIlII[76], lIIIIIIlII[77], lIIIIIIlII[78], lIIIIIIlII[79], lIIIIIIlII[10]);
        WorldArea worldArea4 = new WorldArea(lIIIIIIlII[80], lIIIIIIlII[81], lIIIIIIlII[69], lIIIIIIlII[64], lIIIIIIlII[0]);
        WorldArea worldArea5 = new WorldArea(lIIIIIIlII[82], lIIIIIIlII[81], lIIIIIIlII[12], lIIIIIIlII[64], lIIIIIIlII[10]);
        WorldArea worldArea6 = new WorldArea(lIIIIIIlII[83], lIIIIIIlII[84], lIIIIIIlII[63], lIIIIIIlII[49], lIIIIIIlII[10]);
        WorldArea worldArea7 = new WorldArea(lIIIIIIlII[85], lIIIIIIlII[86], lIIIIIIlII[27], lIIIIIIlII[23], lIIIIIIlII[1]);
        WorldArea worldArea8 = new WorldArea(lIIIIIIlII[85], lIIIIIIlII[87], lIIIIIIlII[12], lIIIIIIlII[25], lIIIIIIlII[10]);
        WorldArea worldArea9 = new WorldArea(lIIIIIIlII[88], lIIIIIIlII[89], lIIIIIIlII[75], lIIIIIIlII[41], lIIIIIIlII[10]);
        WorldArea worldArea10 = new WorldArea(lIIIIIIlII[90], lIIIIIIlII[91], lIIIIIIlII[66], lIIIIIIlII[64], lIIIIIIlII[10]);
        WorldArea worldArea11 = new WorldArea(lIIIIIIlII[92], lIIIIIIlII[93], lIIIIIIlII[23], lIIIIIIlII[27], lIIIIIIlII[10]);
        WorldArea worldArea12 = new WorldArea(lIIIIIIlII[92], lIIIIIIlII[94], lIIIIIIlII[12], lIIIIIIlII[23], lIIIIIIlII[10]);
        if (ac.llIlllIIllIl(worldArea4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && ac.llIlllIIllIl(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && ac.llIlllIIllIl(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && ac.llIlllIIllIl(worldArea3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderGWD.c = lIIIIIIIll[lIIIIIIlII[95]];
            if (ac.llIlllIIlIll(Bank.isOpen() ? 1 : 0)) {
                Bank.close();
            }
            if (ac.llIlllIIlIll(Dialog.isOpen() ? 1 : 0)) {
                Dialog.close();
            }
            Movement.walkTo((WorldPoint)new WorldPoint(lIIIIIIlII[96], lIIIIIIlII[52], lIIIIIIlII[0]));

            Time.sleepTicks((int)lIIIIIIlII[1]);

        }
        if (ac.llIlllIlIIlI(Players.getLocal().getAnimation(), lIIIIIIlII[62]) && ac.llIlllIIllIl(Players.getLocal().isMoving() ? 1 : 0)) {
            String[] stringArray = new String[lIIIIIIlII[1]];
            stringArray[ac.lIIIIIIlII[0]] = lIIIIIIIll[lIIIIIIlII[97]];
            TileItem lIIIllIllllll = TileItems.getNearest((String[])stringArray);
            if (ac.llIlllIIlllI(lIIIllIllllll) && ac.llIlllIIlIll(ac.dY() ? 1 : 0)) {
                AccBuilderGWD.c = lIIIIIIIll[lIIIIIIlII[98]];
                System.out.println(lIIIIIIIll[lIIIIIIlII[99]]);
                lIIIllIllllll.interact(lIIIIIIIll[lIIIIIIlII[100]]);
                Time.sleepTicks((int)lIIIIIIlII[10]);

            }
            if (ac.llIlllIIllIl(ac.dY() ? 1 : 0)) {
                void lIIIlllIIIIII;
                void lIIIlllIIIIIl;
                void lIIIlllIIIIlI;
                void lIIIlllIIIIll;
                void lIIIlllIIIlII;
                void lIIIlllIIIlIl;
                void lIIIlllIIIllI;
                void lIIIlllIIIlll;
                int lIIIllIlllllI;
                void lIIIlllIIlIII;
                if (ac.llIlllIIlIll(lIIIlllIIlIII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && ac.llIlllIIllIl(ac.dY() ? 1 : 0)) {
                    AccBuilderGWD.c = lIIIIIIIll[lIIIIIIlII[101]];
                    lIIIllIlllllI = Skills.getExperience((Skill)Skill.AGILITY);
                    String[] stringArray2 = new String[lIIIIIIlII[1]];
                    stringArray2[ac.lIIIIIIlII[0]] = lIIIIIIIll[lIIIIIIlII[102]];
                    TileObjects.getNearest((String[])stringArray2).interact(lIIIIIIIll[lIIIIIIlII[103]]);
                    Time.sleepUntil(() -> {
                        boolean bl;
                        if (ac.llIlllIIllll(Skills.getExperience((Skill)Skill.AGILITY), lIIIllIlllllI)) {
                            bl = lIIIIIIlII[1];

                            if (((0xFE ^ 0xA8) & ~(0x37 ^ 0x61)) >= 2) {
                                return false;
                            }
                        } else {
                            bl = lIIIIIIlII[0];
                        }
                        return bl;
                    }, (int)lIIIIIIlII[104]);

                    Time.sleepTicks((int)lIIIIIIlII[1]);

                }
                if (ac.llIlllIIlIll(lIIIlllIIIlll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && ac.llIlllIIllIl(ac.dY() ? 1 : 0)) {
                    AccBuilderGWD.c = lIIIIIIIll[lIIIIIIlII[38]];
                    lIIIllIlllllI = Skills.getExperience((Skill)Skill.AGILITY);
                    String[] stringArray3 = new String[lIIIIIIlII[1]];
                    stringArray3[ac.lIIIIIIlII[0]] = lIIIIIIIll[lIIIIIIlII[105]];
                    TileObjects.getNearest((String[])stringArray3).interact(lIIIIIIIll[lIIIIIIlII[106]]);
                    Time.sleepUntil(() -> {
                        boolean bl;
                        if (ac.llIlllIIllll(Skills.getExperience((Skill)Skill.AGILITY), lIIIllIlllllI)) {
                            bl = lIIIIIIlII[1];

                            if (((0x9D ^ 0xC6 ^ (0x53 ^ 0x41)) & (145 + 217 - 263 + 126 ^ 97 + 143 - 75 + 3 ^ -1)) > ((24 + 52 - 11 + 157 ^ 129 + 75 - 138 + 76) & (0x1E ^ 0x6F ^ (0x21 ^ 0) ^ -1))) {
                                return (3 & (3 ^ -1)) != 0;
                            }
                        } else {
                            bl = lIIIIIIlII[0];
                        }
                        return bl;
                    }, (int)lIIIIIIlII[104]);

                    Time.sleepTicks((int)lIIIIIIlII[1]);

                }
                if (ac.llIlllIIlIll(lIIIlllIIIllI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && ac.llIlllIIllIl(ac.dY() ? 1 : 0)) {
                    AccBuilderGWD.c = lIIIIIIIll[lIIIIIIlII[107]];
                    lIIIllIlllllI = Skills.getExperience((Skill)Skill.AGILITY);
                    String[] stringArray4 = new String[lIIIIIIlII[1]];
                    stringArray4[ac.lIIIIIIlII[0]] = lIIIIIIIll[lIIIIIIlII[108]];
                    TileObjects.getNearest((String[])stringArray4).interact(lIIIIIIIll[lIIIIIIlII[109]]);
                    Time.sleepUntil(() -> {
                        boolean bl;
                        if (ac.llIlllIIllll(Skills.getExperience((Skill)Skill.AGILITY), lIIIllIlllllI)) {
                            bl = lIIIIIIlII[1];

                            if (1 < 0) {
                                return ((0xF ^ 0x76 ^ (0x7B ^ 0xE)) & (0x24 ^ 0x49 ^ (0x54 ^ 0x35) ^ -1)) != 0;
                            }
                        } else {
                            bl = lIIIIIIlII[0];
                        }
                        return bl;
                    }, (int)lIIIIIIlII[104]);

                    Time.sleepTicks((int)lIIIIIIlII[1]);

                }
                if (ac.llIlllIIlIll(lIIIlllIIIlIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && ac.llIlllIIllIl(ac.dY() ? 1 : 0)) {
                    AccBuilderGWD.c = lIIIIIIIll[lIIIIIIlII[110]];
                    lIIIllIlllllI = Skills.getExperience((Skill)Skill.AGILITY);
                    String[] stringArray5 = new String[lIIIIIIlII[1]];
                    stringArray5[ac.lIIIIIIlII[0]] = lIIIIIIIll[lIIIIIIlII[111]];
                    TileObjects.getNearest((String[])stringArray5).interact(lIIIIIIIll[lIIIIIIlII[112]]);
                    Time.sleepUntil(() -> {
                        boolean bl;
                        if (ac.llIlllIIllll(Skills.getExperience((Skill)Skill.AGILITY), lIIIllIlllllI)) {
                            bl = lIIIIIIlII[1];

                            if (((0x75 ^ 0x42) & ~(0x34 ^ 3)) != 0) {
                                return false;
                            }
                        } else {
                            bl = lIIIIIIlII[0];
                        }
                        return bl;
                    }, (int)lIIIIIIlII[104]);

                    Time.sleepTicks((int)lIIIIIIlII[1]);

                }
                if (ac.llIlllIIlIll(lIIIlllIIIlII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && ac.llIlllIIllIl(ac.dY() ? 1 : 0)) {
                    AccBuilderGWD.c = lIIIIIIIll[lIIIIIIlII[113]];
                    lIIIllIlllllI = Skills.getExperience((Skill)Skill.AGILITY);
                    String[] stringArray6 = new String[lIIIIIIlII[1]];
                    stringArray6[ac.lIIIIIIlII[0]] = lIIIIIIIll[lIIIIIIlII[40]];
                    TileObjects.getNearest((String[])stringArray6).interact(lIIIIIIIll[lIIIIIIlII[7]]);
                    Time.sleepUntil(() -> {
                        boolean bl;
                        if (ac.llIlllIIllll(Skills.getExperience((Skill)Skill.AGILITY), lIIIllIlllllI)) {
                            bl = lIIIIIIlII[1];

                            if (((0x9F ^ 0x92) & ~(0x37 ^ 0x3A)) <= -1) {
                                return false;
                            }
                        } else {
                            bl = lIIIIIIlII[0];
                        }
                        return bl;
                    }, (int)lIIIIIIlII[104]);

                    Time.sleepTicks((int)lIIIIIIlII[1]);

                }
                if (ac.llIlllIIlIll(lIIIlllIIIIll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && ac.llIlllIIllIl(ac.dY() ? 1 : 0)) {
                    AccBuilderGWD.c = lIIIIIIIll[lIIIIIIlII[114]];
                    lIIIllIlllllI = Skills.getExperience((Skill)Skill.AGILITY);
                    int[] nArray = new int[lIIIIIIlII[1]];
                    nArray[ac.lIIIIIIlII[0]] = lIIIIIIlII[115];
                    TileObjects.getNearest((int[])nArray).interact(lIIIIIIIll[lIIIIIIlII[116]]);
                    Time.sleepUntil(() -> {
                        boolean bl;
                        if (ac.llIlllIIllll(Skills.getExperience((Skill)Skill.AGILITY), lIIIllIlllllI)) {
                            bl = lIIIIIIlII[1];

                            if (-1 > -1) {
                                return ((0x3F ^ 0x6F ^ (0x45 ^ 4)) & (3 ^ (0x8F ^ 0x9D) ^ -1)) != 0;
                            }
                        } else {
                            bl = lIIIIIIlII[0];
                        }
                        return bl;
                    }, (int)lIIIIIIlII[104]);

                    Time.sleepTicks((int)lIIIIIIlII[1]);

                }
                if (ac.llIlllIIlIll(lIIIlllIIIIlI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && ac.llIlllIIllIl(ac.dY() ? 1 : 0)) {
                    AccBuilderGWD.c = lIIIIIIIll[lIIIIIIlII[117]];
                    lIIIllIlllllI = Skills.getExperience((Skill)Skill.AGILITY);
                    int[] nArray = new int[lIIIIIIlII[1]];
                    nArray[ac.lIIIIIIlII[0]] = lIIIIIIlII[118];
                    TileObjects.getNearest((int[])nArray).interact(lIIIIIIIll[lIIIIIIlII[119]]);
                    Time.sleepUntil(() -> {
                        boolean bl;
                        if (ac.llIlllIIllll(Skills.getExperience((Skill)Skill.AGILITY), lIIIllIlllllI)) {
                            bl = lIIIIIIlII[1];

                            if (((0xF ^ 0x4C) & ~(0x4D ^ 0xE)) != 0) {
                                return false;
                            }
                        } else {
                            bl = lIIIIIIlII[0];
                        }
                        return bl;
                    }, (int)lIIIIIIlII[104]);

                    Time.sleepTicks((int)lIIIIIIlII[1]);

                }
                if (ac.llIlllIIlIll(lIIIlllIIIIIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && ac.llIlllIIllIl(ac.dY() ? 1 : 0)) {
                    AccBuilderGWD.c = lIIIIIIIll[lIIIIIIlII[120]];
                    lIIIllIlllllI = Skills.getExperience((Skill)Skill.AGILITY);
                    int[] nArray = new int[lIIIIIIlII[1]];
                    nArray[ac.lIIIIIIlII[0]] = lIIIIIIlII[121];
                    TileObjects.getNearest((int[])nArray).interact(lIIIIIIIll[lIIIIIIlII[122]]);
                    Time.sleepUntil(() -> {
                        boolean bl;
                        if (ac.llIlllIIllll(Skills.getExperience((Skill)Skill.AGILITY), lIIIllIlllllI)) {
                            bl = lIIIIIIlII[1];

                            if (2 < 2) {
                                return false;
                            }
                        } else {
                            bl = lIIIIIIlII[0];
                        }
                        return bl;
                    }, (int)lIIIIIIlII[104]);

                    Time.sleepTicks((int)lIIIIIIlII[1]);

                }
                if (ac.llIlllIIlIll(lIIIlllIIIIII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && ac.llIlllIIllIl(ac.dY() ? 1 : 0)) {
                    AccBuilderGWD.c = lIIIIIIIll[lIIIIIIlII[123]];
                    lIIIllIlllllI = Skills.getExperience((Skill)Skill.AGILITY);
                    String[] stringArray7 = new String[lIIIIIIlII[1]];
                    stringArray7[ac.lIIIIIIlII[0]] = lIIIIIIIll[lIIIIIIlII[124]];
                    TileObjects.getNearest((String[])stringArray7).interact(lIIIIIIIll[lIIIIIIlII[44]]);
                    Time.sleepUntil(() -> {
                        boolean bl;
                        if (ac.llIlllIIllll(Skills.getExperience((Skill)Skill.AGILITY), lIIIllIlllllI)) {
                            bl = lIIIIIIlII[1];

                            if (((0x4F ^ 0x4B) & ~(0x5C ^ 0x58)) != ((0x73 ^ 0x78) & ~(0x13 ^ 0x18))) {
                                return false;
                            }
                        } else {
                            bl = lIIIIIIlII[0];
                        }
                        return bl;
                    }, (int)lIIIIIIlII[104]);

                    Time.sleepTicks((int)lIIIIIIlII[1]);

                }
            }
        }
    }

    private static boolean llIlllIIlIll(int n2) {
        return n2 != 0;
    }

    private static boolean llIlllIlIIIl(int n2, int n3) {
        return n2 >= n3;
    }

    /*
     * WARNING - void declaration
     */
    private static void dU() {
        WorldArea worldArea = new WorldArea(lIIIIIIlII[46], lIIIIIIlII[47], lIIIIIIlII[12], lIIIIIIlII[21], lIIIIIIlII[0]);
        WorldArea worldArea2 = new WorldArea(lIIIIIIlII[46], lIIIIIIlII[48], lIIIIIIlII[49], lIIIIIIlII[25], lIIIIIIlII[0]);
        WorldArea worldArea3 = new WorldArea(lIIIIIIlII[46], lIIIIIIlII[50], lIIIIIIlII[49], lIIIIIIlII[25], lIIIIIIlII[1]);
        WorldArea worldArea4 = new WorldArea(lIIIIIIlII[51], lIIIIIIlII[52], lIIIIIIlII[53], lIIIIIIlII[54], lIIIIIIlII[3]);
        WorldArea worldArea5 = new WorldArea(lIIIIIIlII[55], lIIIIIIlII[56], lIIIIIIlII[25], lIIIIIIlII[12], lIIIIIIlII[3]);
        WorldArea worldArea6 = new WorldArea(lIIIIIIlII[57], lIIIIIIlII[58], lIIIIIIlII[49], lIIIIIIlII[12], lIIIIIIlII[0]);
        WorldArea worldArea7 = new WorldArea(lIIIIIIlII[59], lIIIIIIlII[60], lIIIIIIlII[12], lIIIIIIlII[21], lIIIIIIlII[0]);
        WorldArea worldArea8 = new WorldArea(lIIIIIIlII[46], lIIIIIIlII[47], lIIIIIIlII[61], lIIIIIIlII[21], lIIIIIIlII[0]);
        if (ac.llIlllIIllIl(mb.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && ac.llIlllIIllIl(mc.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && ac.llIlllIIllIl(md.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderGWD.c = lIIIIIIIll[lIIIIIIlII[12]];
            e.b(me);
            Time.sleepTicks((int)lIIIIIIlII[1]);

        }
        if ((!ac.llIlllIIllIl(mb.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || !ac.llIlllIIllIl(mc.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || ac.llIlllIIlIll(md.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) && ac.llIlllIlIIlI(Players.getLocal().getAnimation(), lIIIIIIlII[62]) && ac.llIlllIIllIl(Players.getLocal().isMoving() ? 1 : 0)) {
            void lIIIlllIllIll;
            void lIIIlllIlllII;
            void lIIIlllIlllIl;
            void lIIIlllIllllI;
            void lIIIlllIlllll;
            void lIIIllllIIIII;
            void lIIIlllIllIlI;
            if (ac.llIlllIIlIll(lIIIlllIllIlI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderGWD.c = lIIIIIIIll[lIIIIIIlII[49]];
                String[] stringArray = new String[lIIIIIIlII[1]];
                stringArray[ac.lIIIIIIlII[0]] = lIIIIIIIll[lIIIIIIlII[63]];
                TileObjects.getNearest((String[])stringArray).interact(lIIIIIIIll[lIIIIIIlII[64]]);
                Time.sleepTicks((int)lIIIIIIlII[3]);

            }
            if (ac.llIlllIIlIll(lIIIllllIIIII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderGWD.c = lIIIIIIIll[lIIIIIIlII[53]];
                String[] stringArray = new String[lIIIIIIlII[1]];
                stringArray[ac.lIIIIIIlII[0]] = lIIIIIIIll[lIIIIIIlII[39]];
                TileObjects.getNearest((String[])stringArray).interact(lIIIIIIIll[lIIIIIIlII[65]]);
                Time.sleepTicks((int)lIIIIIIlII[3]);

            }
            if (ac.llIlllIIlIll(lIIIlllIlllll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderGWD.c = lIIIIIIIll[lIIIIIIlII[66]];
                String[] stringArray = new String[lIIIIIIlII[1]];
                stringArray[ac.lIIIIIIlII[0]] = lIIIIIIIll[lIIIIIIlII[54]];
                TileObjects.getNearest((String[])stringArray).interact(lIIIIIIIll[lIIIIIIlII[67]]);
                Time.sleepTicks((int)lIIIIIIlII[3]);

            }
            if (ac.llIlllIIlIll(lIIIlllIllllI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderGWD.c = lIIIIIIIll[lIIIIIIlII[41]];
                String[] stringArray = new String[lIIIIIIlII[1]];
                stringArray[ac.lIIIIIIlII[0]] = lIIIIIIIll[lIIIIIIlII[68]];
                TileObjects.getNearest((String[])stringArray).interact(lIIIIIIIll[lIIIIIIlII[61]]);
                Time.sleepTicks((int)lIIIIIIlII[19]);

            }
            if (ac.llIlllIIlIll(lIIIlllIlllIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderGWD.c = lIIIIIIIll[lIIIIIIlII[69]];
                String[] stringArray = new String[lIIIIIIlII[1]];
                stringArray[ac.lIIIIIIlII[0]] = lIIIIIIIll[lIIIIIIlII[70]];
                TileObjects.getNearest((String[])stringArray).interact(lIIIIIIIll[lIIIIIIlII[42]]);
                Time.sleepTicks((int)lIIIIIIlII[17]);

            }
            if (ac.llIlllIIlIll(lIIIlllIlllII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderGWD.c = lIIIIIIIll[lIIIIIIlII[71]];
                String[] stringArray = new String[lIIIIIIlII[1]];
                stringArray[ac.lIIIIIIlII[0]] = lIIIIIIIll[lIIIIIIlII[72]];
                TileObjects.getNearest((String[])stringArray).interact(lIIIIIIIll[lIIIIIIlII[73]]);
                Time.sleepTicks((int)lIIIIIIlII[10]);

            }
            if (ac.llIlllIIlIll(lIIIlllIllIll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderGWD.c = lIIIIIIIll[lIIIIIIlII[74]];
                String[] stringArray = new String[lIIIIIIlII[1]];
                stringArray[ac.lIIIIIIlII[0]] = lIIIIIIIll[lIIIIIIlII[2]];
                TileObjects.getNearest((String[])stringArray).interact(lIIIIIIIll[lIIIIIIlII[75]]);
                Time.sleepTicks((int)lIIIIIIlII[17]);

            }
        }
    }

    @Override
    public String ag() {
        return lIIIIIIIll[lIIIIIIlII[203]];
    }

    private static boolean llIlllIIllIl(int n2) {
        return n2 == 0;
    }

    public static void Q() {
        d lIIIlIlIlIllI;
        block18: {
            block17: {
                block16: {
                    block15: {
                        int[] nArray = new int[lIIIIIIlII[1]];
                        nArray[ac.lIIIIIIlII[0]] = lIIIIIIlII[16];
                        if (ac.llIlllIIllIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                            d d2 = new DHelper(lIIIIIIlII[16], lIIIIIIlII[1], lIIIIIIlII[195]);
                            bx.add(d2);

                        }
                        int[] nArray2 = new int[lIIIIIIlII[1]];
                        nArray2[ac.lIIIIIIlII[0]] = lIIIIIIlII[18];
                        if (ac.llIlllIIllIl(Bank.contains((int[])nArray2) ? 1 : 0)) {
                            lIIIlIlIlIllI = new DHelper(lIIIIIIlII[18], lIIIIIIlII[3], lIIIIIIlII[196]);
                            bx.add(lIIIlIlIlIllI);

                        }
                        int[] nArray3 = new int[lIIIIIIlII[1]];
                        nArray3[ac.lIIIIIIlII[0]] = lIIIIIIlII[28];
                        if (ac.llIlllIIllIl(Bank.contains((int[])nArray3) ? 1 : 0)) {
                            lIIIlIlIlIllI = new DHelper(lIIIIIIlII[28], lIIIIIIlII[3], lIIIIIIlII[196]);
                            bx.add(lIIIlIlIlIllI);

                        }
                        int[] nArray4 = new int[lIIIIIIlII[1]];
                        nArray4[ac.lIIIIIIlII[0]] = lIIIIIIlII[13];
                        if (ac.llIlllIIllIl(Bank.contains((int[])nArray4) ? 1 : 0)) {
                            lIIIlIlIlIllI = new DHelper(lIIIIIIlII[13], lIIIIIIlII[12], lIIIIIIlII[197]);
                            bx.add(lIIIlIlIlIllI);

                        }
                        int[] nArray5 = new int[lIIIIIIlII[1]];
                        nArray5[ac.lIIIIIIlII[0]] = lIIIIIIlII[22];
                        if (ac.llIlllIIllIl(Bank.contains((int[])nArray5) ? 1 : 0)) {
                            lIIIlIlIlIllI = new DHelper(lIIIIIIlII[22], lIIIIIIlII[12], lIIIIIIlII[198]);
                            bx.add(lIIIlIlIlIllI);

                        }
                        int[] nArray6 = new int[lIIIIIIlII[1]];
                        nArray6[ac.lIIIIIIlII[0]] = lIIIIIIlII[15];
                        if (ac.llIlllIIllIl(Bank.contains((int[])nArray6) ? 1 : 0)) {
                            lIIIlIlIlIllI = new DHelper(lIIIIIIlII[15], lIIIIIIlII[12], lIIIIIIlII[198]);
                            bx.add(lIIIlIlIlIllI);

                        }
                        int[] nArray7 = new int[lIIIIIIlII[1]];
                        nArray7[ac.lIIIIIIlII[0]] = lIIIIIIlII[14];
                        if (ac.llIlllIIllIl(Bank.contains((int[])nArray7) ? 1 : 0)) {
                            lIIIlIlIlIllI = new DHelper(lIIIIIIlII[14], lIIIIIIlII[12], lIIIIIIlII[198]);
                            bx.add(lIIIlIlIlIllI);

                        }
                        int[] nArray8 = new int[lIIIIIIlII[1]];
                        nArray8[ac.lIIIIIIlII[0]] = lIIIIIIlII[24];
                        if (!ac.llIlllIIlIll(Bank.contains((int[])nArray8) ? 1 : 0)) break block15;
                        int[] nArray9 = new int[lIIIIIIlII[1]];
                        nArray9[ac.lIIIIIIlII[0]] = lIIIIIIlII[24];
                        if (!ac.llIlllIIlIll(Bank.contains((int[])nArray9) ? 1 : 0)) break block16;
                        int[] nArray10 = new int[lIIIIIIlII[1]];
                        nArray10[ac.lIIIIIIlII[0]] = lIIIIIIlII[24];
                        if (!ac.llIlllIIllII(Bank.getFirst((int[])nArray10).getQuantity(), lIIIIIIlII[12])) break block16;
                    }
                    lIIIlIlIlIllI = new DHelper(lZ, lIIIIIIlII[44], lIIIIIIlII[199]);
                    bx.add(lIIIlIlIlIllI);

                }
                int[] nArray = new int[lIIIIIIlII[1]];
                nArray[ac.lIIIIIIlII[0]] = lIIIIIIlII[26];
                if (!ac.llIlllIIlIll(Bank.contains((int[])nArray) ? 1 : 0)) break block17;
                int[] nArray11 = new int[lIIIIIIlII[1]];
                nArray11[ac.lIIIIIIlII[0]] = lIIIIIIlII[26];
                if (!ac.llIlllIIlIll(Bank.contains((int[])nArray11) ? 1 : 0)) break block18;
                int[] nArray12 = new int[lIIIIIIlII[1]];
                nArray12[ac.lIIIIIIlII[0]] = lIIIIIIlII[26];
                if (!ac.llIlllIIllII(Bank.getFirst((int[])nArray12).getQuantity(), lIIIIIIlII[12])) break block18;
            }
            lIIIlIlIlIllI = new DHelper(lIIIIIIlII[26], lIIIIIIlII[12], lIIIIIIlII[200]);
            bx.add(lIIIlIlIlIllI);

        }
        int[] nArray = new int[lIIIIIIlII[1]];
        nArray[ac.lIIIIIIlII[0]] = lIIIIIIlII[201];
        if (ac.llIlllIIllIl(Bank.contains((int[])nArray) ? 1 : 0)) {
            lIIIlIlIlIllI = new DHelper(lIIIIIIlII[201], lIIIIIIlII[1], lIIIIIIlII[202]);
            bx.add(lIIIlIlIlIllI);

        }
        int[] nArray13 = new int[lIIIIIIlII[1]];
        nArray13[ac.lIIIIIIlII[0]] = lIIIIIIlII[20];
        if (ac.llIlllIIllIl(Bank.contains((int[])nArray13) ? 1 : 0)) {
            lIIIlIlIlIllI = new DHelper(lIIIIIIlII[20], lIIIIIIlII[41], j.ch);
            bx.add(lIIIlIlIlIllI);

        }
    }

    /*
     * WARNING - void declaration
     */
    private static void dW() {
        void lIIIllIlIIIll;
        void lIIIllIlIlIll;
        void lIIIllIlIllII;
        void lIIIllIlIllIl;
        void lIIIllIlIlllI;
        WorldArea worldArea = new WorldArea(lIIIIIIlII[125], lIIIIIIlII[126], lIIIIIIlII[112], lIIIIIIlII[107], lIIIIIIlII[0]);
        WorldArea worldArea2 = new WorldArea(lIIIIIIlII[125], lIIIIIIlII[126], lIIIIIIlII[112], lIIIIIIlII[107], lIIIIIIlII[1]);
        WorldArea worldArea3 = new WorldArea(lIIIIIIlII[125], lIIIIIIlII[126], lIIIIIIlII[112], lIIIIIIlII[107], lIIIIIIlII[3]);
        WorldArea worldArea4 = new WorldArea(lIIIIIIlII[125], lIIIIIIlII[126], lIIIIIIlII[112], lIIIIIIlII[107], lIIIIIIlII[10]);
        WorldArea worldArea5 = new WorldArea(lIIIIIIlII[127], lIIIIIIlII[128], lIIIIIIlII[49], lIIIIIIlII[12], lIIIIIIlII[3]);
        WorldArea worldArea6 = new WorldArea(lIIIIIIlII[129], lIIIIIIlII[127], lIIIIIIlII[49], lIIIIIIlII[25], lIIIIIIlII[3]);
        WorldArea worldArea7 = new WorldArea(lIIIIIIlII[130], lIIIIIIlII[131], lIIIIIIlII[63], lIIIIIIlII[49], lIIIIIIlII[3]);
        WorldArea worldArea8 = new WorldArea(lIIIIIIlII[132], lIIIIIIlII[133], lIIIIIIlII[12], lIIIIIIlII[64], lIIIIIIlII[10]);
        WorldArea worldArea9 = new WorldArea(lIIIIIIlII[134], lIIIIIIlII[9], lIIIIIIlII[49], lIIIIIIlII[27], lIIIIIIlII[3]);
        WorldArea worldArea10 = new WorldArea(lIIIIIIlII[135], lIIIIIIlII[136], lIIIIIIlII[68], lIIIIIIlII[53], lIIIIIIlII[10]);
        WorldArea worldArea11 = new WorldArea(lIIIIIIlII[137], lIIIIIIlII[138], lIIIIIIlII[63], lIIIIIIlII[64], lIIIIIIlII[3]);
        WorldPoint worldPoint = new WorldPoint(lIIIIIIlII[137], lIIIIIIlII[139], lIIIIIIlII[0]);
        if (ac.llIlllIIlIll(Dialog.isOpen() ? 1 : 0)) {
            Dialog.close();
        }
        if (ac.llIlllIIllIl(lIIIllIlIlllI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && ac.llIlllIIllIl(lIIIllIlIllIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && ac.llIlllIIllIl(lIIIllIlIllII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && ac.llIlllIIllIl(lIIIllIlIlIll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderGWD.c = lIIIIIIIll[lIIIIIIlII[140]];
            Movement.walkTo((WorldPoint)lIIIllIlIIIll);

            Time.sleepTicks((int)lIIIIIIlII[1]);

        }
        if (ac.llIlllIIlIll(lIIIllIlIlllI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (ac.llIlllIIllll(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lIIIllIlIIIll), lIIIIIIlII[21])) {
                AccBuilderGWD.c = lIIIIIIIll[lIIIIIIlII[6]];
                Movement.walkTo((WorldPoint)lIIIllIlIIIll);

                Time.sleepTicks((int)lIIIIIIlII[1]);

            }
            if (ac.llIlllIlIIll(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lIIIllIlIIIll), lIIIIIIlII[21])) {
                AccBuilderGWD.c = lIIIIIIIll[lIIIIIIlII[141]];
                int lIIIllIlIIIlI = Skills.getExperience((Skill)Skill.AGILITY);
                String[] stringArray = new String[lIIIIIIlII[1]];
                stringArray[ac.lIIIIIIlII[0]] = lIIIIIIIll[lIIIIIIlII[142]];
                TileObjects.getNearest((String[])stringArray).interact(lIIIIIIIll[lIIIIIIlII[143]]);
                Time.sleepTicks((int)e.c(lIIIIIIlII[1], lIIIIIIlII[3]));

                Time.sleepUntil(() -> {
                    boolean bl;
                    if (ac.llIlllIIllll(Skills.getExperience((Skill)Skill.AGILITY), lIIIllIlIIIlI)) {
                        bl = lIIIIIIlII[1];

                        if (2 == 0) {
                            return ((0x5A ^ 0x39 ^ (0xC8 ^ 0x8E)) & (0x3C ^ 8 ^ (0x52 ^ 0x43) ^ -1)) != 0;
                        }
                    } else {
                        bl = lIIIIIIlII[0];
                    }
                    return bl;
                }, (int)lIIIIIIlII[104]);

                Time.sleepTicks((int)lIIIIIIlII[1]);

            }
        }
        String[] stringArray = new String[lIIIIIIlII[1]];
        stringArray[ac.lIIIIIIlII[0]] = lIIIIIIIll[lIIIIIIlII[144]];
        TileItem lIIIllIlIIIlI = TileItems.getNearest((String[])stringArray);
        if (ac.llIlllIIlllI(lIIIllIlIIIlI) && ac.llIlllIIlIll(ac.dY() ? 1 : 0)) {
            AccBuilderGWD.c = lIIIIIIIll[lIIIIIIlII[145]];
            System.out.println(lIIIIIIIll[lIIIIIIlII[146]]);
            lIIIllIlIIIlI.interact(lIIIIIIIll[lIIIIIIlII[147]]);
            Time.sleepTicks((int)lIIIIIIlII[10]);

        }
        if (ac.llIlllIIllIl(ac.dY() ? 1 : 0)) {
            void lIIIllIlIIlII;
            void lIIIllIlIIlIl;
            void lIIIllIlIIllI;
            void lIIIllIlIIlll;
            void lIIIllIlIlIII;
            void lIIIllIlIlIIl;
            int lIIIllIlIIIII;
            TileObject lIIIllIlIIIIl;
            void lIIIllIlIlIlI;
            if (ac.llIlllIIlIll(lIIIllIlIlIlI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && ac.llIlllIIlllI(lIIIllIlIIIIl = TileObjects.getNearest(tileObject -> {
                int n2;
                if (ac.llIlllIIlIll(tileObject.getName().contains(lIIIIIIIll[lIIIIIIlII[233]]) ? 1 : 0) && ac.llIlllIlIIll(tileObject.getWorldLocation().distanceTo(new WorldPoint(lIIIIIIlII[234], lIIIIIIlII[131], lIIIIIIlII[3])), lIIIIIIlII[3])) {
                    n2 = lIIIIIIlII[1];

                    if ((13 + 107 - 108 + 150 ^ 96 + 122 - 130 + 78) <= 2) {
                        return ((0x49 ^ 0x79 ^ (0x5E ^ 0x27)) & (38 + 8 - -63 + 29 ^ 57 + 15 - 21 + 144 ^ -1)) != 0;
                    }
                } else {
                    n2 = lIIIIIIlII[0];
                }
                return n2 != 0;
            }))) {
                lIIIllIlIIIII = Skills.getExperience((Skill)Skill.AGILITY);
                AccBuilderGWD.c = lIIIIIIIll[lIIIIIIlII[148]];
                lIIIllIlIIIIl.interact(lIIIIIIIll[lIIIIIIlII[149]]);
                Time.sleepTicks((int)e.c(lIIIIIIlII[1], lIIIIIIlII[3]));

                Time.sleepUntil(() -> {
                    boolean bl;
                    if (ac.llIlllIIllll(Skills.getExperience((Skill)Skill.AGILITY), lIIIllIlIIIII)) {
                        bl = lIIIIIIlII[1];

                        if (1 <= 0) {
                            return false;
                        }
                    } else {
                        bl = lIIIIIIlII[0];
                    }
                    return bl;
                }, (int)lIIIIIIlII[104]);

                Time.sleepTicks((int)lIIIIIIlII[1]);

            }
            if (ac.llIlllIIlIll(ac.dY() ? 1 : 0)) {
                return;
            }
            if (ac.llIlllIIlIll(lIIIllIlIlIIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && ac.llIlllIIlllI(lIIIllIlIIIIl = TileObjects.getNearest(tileObject -> {
                int n2;
                if (ac.llIlllIIlIll(tileObject.getName().contains(lIIIIIIIll[lIIIIIIlII[232]]) ? 1 : 0) && ac.llIlllIlIIll(tileObject.getWorldLocation().distanceTo(new WorldPoint(lIIIIIIlII[131], lIIIIIIlII[225], lIIIIIIlII[3])), lIIIIIIlII[3])) {
                    n2 = lIIIIIIlII[1];

                    if (((0x81 ^ 0xA5 ^ (0x28 ^ 0x4F)) & (112 + 30 - -69 + 11 ^ 137 + 65 - 111 + 66 ^ -1)) != 0) {
                        return ((0x95 ^ 0xA2 ^ (0x19 ^ 0x29)) & (0xB ^ 0x35 ^ (0x6C ^ 0x55) ^ -1)) != 0;
                    }
                } else {
                    n2 = lIIIIIIlII[0];
                }
                return n2 != 0;
            }))) {
                AccBuilderGWD.c = lIIIIIIIll[lIIIIIIlII[150]];
                lIIIllIlIIIII = Skills.getExperience((Skill)Skill.AGILITY);
                lIIIllIlIIIIl.interact(lIIIIIIIll[lIIIIIIlII[151]]);
                Time.sleepTicks((int)e.c(lIIIIIIlII[1], lIIIIIIlII[3]));

                Time.sleepUntil(() -> {
                    boolean bl;
                    if (ac.llIlllIIllll(Skills.getExperience((Skill)Skill.AGILITY), lIIIllIlIIIII)) {
                        bl = lIIIIIIlII[1];

                        if (3 != 3) {
                            return ((0x4F ^ 0x24 ^ (0xB7 ^ 0x8C)) & (18 + 99 - 32 + 111 ^ 141 + 34 - 149 + 122 ^ -1)) != 0;
                        }
                    } else {
                        bl = lIIIIIIlII[0];
                    }
                    return bl;
                }, (int)lIIIIIIlII[104]);

                Time.sleepTicks((int)lIIIIIIlII[1]);

            }
            if (ac.llIlllIIlIll(ac.dY() ? 1 : 0)) {
                return;
            }
            if (ac.llIlllIIlIll(lIIIllIlIlIII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && ac.llIlllIIlllI(lIIIllIlIIIIl = TileObjects.getNearest(tileObject -> {
                int n2;
                if (ac.llIlllIIlIll(tileObject.getName().contains(lIIIIIIIll[lIIIIIIlII[230]]) ? 1 : 0) && ac.llIlllIlIIll(tileObject.getWorldLocation().distanceTo(new WorldPoint(lIIIIIIlII[139], lIIIIIIlII[231], lIIIIIIlII[3])), lIIIIIIlII[3])) {
                    n2 = lIIIIIIlII[1];

                    if (-1 >= 3) {
                        return ((0x10 ^ 0x71 ^ (0x2D ^ 0x55)) & (0x73 ^ 5 ^ (0x7B ^ 0x14) ^ -1)) != 0;
                    }
                } else {
                    n2 = lIIIIIIlII[0];
                }
                return n2 != 0;
            }))) {
                AccBuilderGWD.c = lIIIIIIIll[lIIIIIIlII[152]];
                lIIIllIlIIIII = Skills.getExperience((Skill)Skill.AGILITY);
                lIIIllIlIIIIl.interact(lIIIIIIIll[lIIIIIIlII[153]]);
                Time.sleepTicks((int)e.c(lIIIIIIlII[1], lIIIIIIlII[3]));

                Time.sleepUntil(() -> {
                    boolean bl;
                    if (ac.llIlllIIllll(Skills.getExperience((Skill)Skill.AGILITY), lIIIllIlIIIII)) {
                        bl = lIIIIIIlII[1];

                        }
                    } else {
                        bl = lIIIIIIlII[0];
                    }
                    return bl;
                }, (int)lIIIIIIlII[104]);

                Time.sleepTicks((int)lIIIIIIlII[1]);

            }
            if (ac.llIlllIIlIll(ac.dY() ? 1 : 0)) {
                return;
            }
            if (ac.llIlllIIlIll(lIIIllIlIIlll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && ac.llIlllIIlllI(lIIIllIlIIIIl = TileObjects.getNearest(tileObject -> {
                int n2;
                if (ac.llIlllIIlIll(tileObject.getName().contains(lIIIIIIIll[lIIIIIIlII[227]]) ? 1 : 0) && ac.llIlllIlIIll(tileObject.getWorldLocation().distanceTo(new WorldPoint(lIIIIIIlII[228], lIIIIIIlII[229], lIIIIIIlII[10])), lIIIIIIlII[3])) {
                    n2 = lIIIIIIlII[1];

                    if (2 <= 0) {
                        return ((0xD ^ 0x45 ^ (0xEB ^ 0xB6)) & (39 + 16 - 21 + 123 ^ 103 + 100 - 168 + 101 ^ -1)) != 0;
                    }
                } else {
                    n2 = lIIIIIIlII[0];
                }
                return n2 != 0;
            }))) {
                AccBuilderGWD.c = lIIIIIIIll[lIIIIIIlII[154]];
                lIIIllIlIIIII = Skills.getExperience((Skill)Skill.AGILITY);
                lIIIllIlIIIIl.interact(lIIIIIIIll[lIIIIIIlII[155]]);
                Time.sleepTicks((int)e.c(lIIIIIIlII[1], lIIIIIIlII[3]));

                Time.sleepUntil(() -> {
                    boolean bl;
                    if (ac.llIlllIIllll(Skills.getExperience((Skill)Skill.AGILITY), lIIIllIlIIIII)) {
                        bl = lIIIIIIlII[1];

                        if (3 == 2) {
                            return ((0x9D ^ 0x86 ^ (0x48 ^ 0x6F)) & (0x9B ^ 0x88 ^ (0x26 ^ 9) ^ -1)) != 0;
                        }
                    } else {
                        bl = lIIIIIIlII[0];
                    }
                    return bl;
                }, (int)lIIIIIIlII[104]);

                Time.sleepTicks((int)lIIIIIIlII[1]);

            }
            if (ac.llIlllIIlIll(ac.dY() ? 1 : 0)) {
                return;
            }
            if (ac.llIlllIIlIll(lIIIllIlIIllI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && ac.llIlllIIlllI(lIIIllIlIIIIl = TileObjects.getNearest(tileObject -> {
                int n2;
                if (ac.llIlllIIlIll(tileObject.getName().contains(lIIIIIIIll[lIIIIIIlII[226]]) ? 1 : 0) && ac.llIlllIlIIll(tileObject.getWorldLocation().distanceTo(new WorldPoint(lIIIIIIlII[9], lIIIIIIlII[130], lIIIIIIlII[3])), lIIIIIIlII[3])) {
                    n2 = lIIIIIIlII[1];

                    if (2 >= (0x97 ^ 0xC3 ^ (0xF9 ^ 0xA9))) {
                        return ((0x99 ^ 0xB4 ^ (0x11 ^ 0x1F)) & (93 + 118 - 184 + 131 ^ 2 + 29 - -106 + 52 ^ -1)) != 0;
                    }
                } else {
                    n2 = lIIIIIIlII[0];
                }
                return n2 != 0;
            }))) {
                AccBuilderGWD.c = lIIIIIIIll[lIIIIIIlII[156]];
                lIIIllIlIIIII = Skills.getExperience((Skill)Skill.AGILITY);
                lIIIllIlIIIIl.interact(lIIIIIIIll[lIIIIIIlII[157]]);
                Time.sleepTicks((int)e.c(lIIIIIIlII[1], lIIIIIIlII[3]));

                Time.sleepUntil(() -> {
                    boolean bl;
                    if (ac.llIlllIIllll(Skills.getExperience((Skill)Skill.AGILITY), lIIIllIlIIIII)) {
                        bl = lIIIIIIlII[1];

                        if (3 <= 2) {
                            return ((0x85 ^ 0x9C ^ (0xFF ^ 0xC3)) & (0x90 ^ 0xB4 ^ 1 ^ -1)) != 0;
                        }
                    } else {
                        bl = lIIIIIIlII[0];
                    }
                    return bl;
                }, (int)lIIIIIIlII[104]);

                Time.sleepTicks((int)lIIIIIIlII[1]);

            }
            if (ac.llIlllIIlIll(ac.dY() ? 1 : 0)) {
                return;
            }
            if (ac.llIlllIIlIll(lIIIllIlIIlIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && ac.llIlllIIlllI(lIIIllIlIIIIl = TileObjects.getNearest(tileObject -> {
                int n2;
                if (ac.llIlllIIlIll(tileObject.getName().contains(lIIIIIIIll[lIIIIIIlII[224]]) ? 1 : 0) && ac.llIlllIlIIll(tileObject.getWorldLocation().distanceTo(new WorldPoint(lIIIIIIlII[225], lIIIIIIlII[215], lIIIIIIlII[10])), lIIIIIIlII[3])) {
                    n2 = lIIIIIIlII[1];

                    if (-(92 + 155 - 111 + 41 ^ 157 + 125 - 181 + 80) > 0) {
                        return ((0x58 ^ 0x12 ^ (0x16 ^ 0x19)) & (24 + 118 - 51 + 128 ^ 0 + 45 - -38 + 75 ^ -1)) != 0;
                    }
                } else {
                    n2 = lIIIIIIlII[0];
                }
                return n2 != 0;
            }))) {
                AccBuilderGWD.c = lIIIIIIIll[lIIIIIIlII[158]];
                lIIIllIlIIIII = Skills.getExperience((Skill)Skill.AGILITY);
                lIIIllIlIIIIl.interact(lIIIIIIIll[lIIIIIIlII[159]]);
                Time.sleepTicks((int)e.c(lIIIIIIlII[1], lIIIIIIlII[3]));

                Time.sleepUntil(() -> {
                    boolean bl;
                    if (ac.llIlllIIllll(Skills.getExperience((Skill)Skill.AGILITY), lIIIllIlIIIII)) {
                        bl = lIIIIIIlII[1];

                        if (((0x70 ^ 0x42 ^ (0x29 ^ 0x3B)) & (0x6D ^ 0x7F ^ (0xB4 ^ 0x86) ^ -1)) != 0) {
                            return ((0x55 ^ 0x46 ^ (0xE0 ^ 0xC7)) & (0x7E ^ 0x79 ^ (0x8A ^ 0xB9) ^ -1)) != 0;
                        }
                    } else {
                        bl = lIIIIIIlII[0];
                    }
                    return bl;
                }, (int)lIIIIIIlII[104]);

                Time.sleepTicks((int)lIIIIIIlII[1]);

            }
            if (ac.llIlllIIlIll(ac.dY() ? 1 : 0)) {
                return;
            }
            if (ac.llIlllIIlIll(lIIIllIlIIlII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && ac.llIlllIIlllI(lIIIllIlIIIIl = TileObjects.getNearest(tileObject -> {
                int n2;
                if (ac.llIlllIIlIll(tileObject.getName().contains(lIIIIIIIll[lIIIIIIlII[221]]) ? 1 : 0) && ac.llIlllIlIIll(tileObject.getWorldLocation().distanceTo(new WorldPoint(lIIIIIIlII[222], lIIIIIIlII[223], lIIIIIIlII[3])), lIIIIIIlII[3])) {
                    n2 = lIIIIIIlII[1];

                    if (3 == 0) {
                        return false;
                    }
                } else {
                    n2 = lIIIIIIlII[0];
                }
                return n2 != 0;
            }))) {
                AccBuilderGWD.c = lIIIIIIIll[lIIIIIIlII[160]];
                lIIIllIlIIIII = Skills.getExperience((Skill)Skill.AGILITY);
                lIIIllIlIIIIl.interact(lIIIIIIIll[lIIIIIIlII[161]]);
                Time.sleepTicks((int)e.c(lIIIIIIlII[1], lIIIIIIlII[3]));

                Time.sleepUntil(() -> {
                    boolean bl;
                    if (ac.llIlllIIllll(Skills.getExperience((Skill)Skill.AGILITY), lIIIllIlIIIII)) {
                        bl = lIIIIIIlII[1];

                        if ((0x6C ^ 0x69) == 0) {
                            return false;
                        }
                    } else {
                        bl = lIIIIIIlII[0];
                    }
                    return bl;
                }, (int)lIIIIIIlII[104]);

                Time.sleepTicks((int)lIIIIIIlII[1]);

            }
        }
    }

    static {
        ac.llIlllIIlIlI();
        ac.llIllIlllllI();
        bx = new ArrayList<d>();
        lY = lIIIIIIlII[28];
        lZ = lIIIIIIlII[24];
        mb = new WorldArea(lIIIIIIlII[235], lIIIIIIlII[52], lIIIIIIlII[69], lIIIIIIlII[72], lIIIIIIlII[0]);
        mc = new WorldArea(lIIIIIIlII[235], lIIIIIIlII[52], lIIIIIIlII[69], lIIIIIIlII[72], lIIIIIIlII[1]);
        md = new WorldArea(lIIIIIIlII[235], lIIIIIIlII[52], lIIIIIIlII[69], lIIIIIIlII[72], lIIIIIIlII[3]);
        me = new WorldPoint(lIIIIIIlII[236], lIIIIIIlII[237], lIIIIIIlII[0]);
    }

    public static void dT() {
        if (ac.llIlllIIlIll(bv ? 1 : 0)) {
            AccBuilderGWD.c = lIIIIIIIll[lIIIIIIlII[0]];
            b.a(bx);
            if (ac.llIlllIIllII(bx.size(), lIIIIIIlII[1])) {
                System.out.println(lIIIIIIIll[lIIIIIIlII[1]]);
                bv = lIIIIIIlII[0];
            }
        }
        if (ac.llIlllIIllIl(bv ? 1 : 0) && ac.llIlllIIllII(Skills.getLevel((Skill)Skill.AGILITY), lIIIIIIlII[2])) {
            if (ac.llIlllIIllIl(ac.an() ? 1 : 0)) {
                BankLocation lIIIllllIllII = BankLocation.getNearest();
                if (ac.llIlllIIlllI(lIIIllllIllII) && ac.llIlllIIllIl(lIIIllllIllII.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderGWD.c = lIIIIIIIll[lIIIIIIlII[3]];
                    WorldArea lIIIllllIlIll = new WorldArea(lIIIIIIlII[4], lIIIIIIlII[5], lIIIIIIlII[6], lIIIIIIlII[7], lIIIIIIlII[0]);
                    if (ac.llIlllIIlIll(lIIIllllIlIll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        WorldPoint lIIIllllIlIlI = new WorldPoint(lIIIIIIlII[8], lIIIIIIlII[9], lIIIIIIlII[0]);
                        if (ac.llIlllIIllll(Players.getLocal().getWorldLocation().distanceTo(lIIIllllIlIlI), lIIIIIIlII[10])) {
                            Movement.walkTo((WorldPoint)lIIIllllIlIlI);

                            Time.sleepTicks((int)lIIIIIIlII[1]);

                        }
                    }
                    a.a(lIIIllllIllII);
                }
                if (ac.llIlllIIlllI(lIIIllllIllII) && ac.llIlllIIlIll(lIIIllllIllII.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderGWD.c = lIIIIIIIll[lIIIIIIlII[10]];
                    if (ac.llIlllIIllIl(Bank.isOpen() ? 1 : 0)) {
                        a.a();
                        Time.sleepUntil(() -> Bank.isOpen(), (int)lIIIIIIlII[11]);

                    }
                    if (ac.llIlllIIlIll(Bank.isOpen() ? 1 : 0)) {
                        if (ac.llIlllIlIIII(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks((int)lIIIIIIlII[1]);

                        }
                        if (ac.llIlllIlIIII(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks((int)lIIIIIIlII[3]);

                        }
                    }
                    int[] nArray = new int[lIIIIIIlII[12]];
                    nArray[ac.lIIIIIIlII[0]] = lIIIIIIlII[13];
                    nArray[ac.lIIIIIIlII[1]] = lIIIIIIlII[14];
                    nArray[ac.lIIIIIIlII[3]] = lIIIIIIlII[15];
                    nArray[ac.lIIIIIIlII[10]] = lIIIIIIlII[16];
                    nArray[ac.lIIIIIIlII[17]] = lIIIIIIlII[18];
                    nArray[ac.lIIIIIIlII[19]] = lIIIIIIlII[20];
                    nArray[ac.lIIIIIIlII[21]] = lIIIIIIlII[22];
                    nArray[ac.lIIIIIIlII[23]] = lIIIIIIlII[24];
                    nArray[ac.lIIIIIIlII[25]] = lIIIIIIlII[26];
                    nArray[ac.lIIIIIIlII[27]] = lIIIIIIlII[28];
                    if (ac.llIlllIIllIl(e.d(nArray) ? 1 : 0)) {
                        ac.Q();
                        System.out.println(lIIIIIIIll[lIIIIIIlII[17]]);
                        bv = lIIIIIIlII[1];
                        return;
                    }
                    int[] nArray2 = new int[lIIIIIIlII[12]];
                    nArray2[ac.lIIIIIIlII[0]] = lIIIIIIlII[13];
                    nArray2[ac.lIIIIIIlII[1]] = lIIIIIIlII[14];
                    nArray2[ac.lIIIIIIlII[3]] = lIIIIIIlII[15];
                    nArray2[ac.lIIIIIIlII[10]] = lIIIIIIlII[16];
                    nArray2[ac.lIIIIIIlII[17]] = lIIIIIIlII[18];
                    nArray2[ac.lIIIIIIlII[19]] = lIIIIIIlII[20];
                    nArray2[ac.lIIIIIIlII[21]] = lIIIIIIlII[22];
                    nArray2[ac.lIIIIIIlII[23]] = lIIIIIIlII[24];
                    nArray2[ac.lIIIIIIlII[25]] = lIIIIIIlII[26];
                    nArray2[ac.lIIIIIIlII[27]] = lIIIIIIlII[28];
                    if (ac.llIlllIIlIll(e.d(nArray2) ? 1 : 0)) {
                        a.a(lIIIIIIlII[29], lIIIIIIlII[1]);
                        a.a(lIIIIIIlII[30], lIIIIIIlII[1]);
                        a.a(lIIIIIIlII[31], lIIIIIIlII[1]);
                        a.a(lIIIIIIlII[32], lIIIIIIlII[1]);
                        a.a(lIIIIIIlII[33], lIIIIIIlII[1]);
                        a.a(lIIIIIIlII[34], lIIIIIIlII[1]);
                        a.a(lIIIIIIlII[35], lIIIIIIlII[1]);
                        int[] nArray3 = new int[lIIIIIIlII[1]];
                        nArray3[ac.lIIIIIIlII[0]] = lIIIIIIlII[29];
                        if (ac.llIlllIIllIl(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                            int[] nArray4 = new int[lIIIIIIlII[1]];
                            nArray4[ac.lIIIIIIlII[0]] = lIIIIIIlII[29];
                            if (ac.llIlllIIllIl(Equipment.contains((int[])nArray4) ? 1 : 0)) {
                                int[] nArray5 = new int[lIIIIIIlII[1]];
                                nArray5[ac.lIIIIIIlII[0]] = lIIIIIIlII[29];
                                if (ac.llIlllIIllIl(Bank.contains((int[])nArray5) ? 1 : 0)) {
                                    a.a(lIIIIIIlII[36], lIIIIIIlII[1]);
                                }
                            }
                        }
                        a.a(lIIIIIIlII[18], lIIIIIIlII[1]);
                        e.l(lIIIIIIlII[29]);
                        e.l(lIIIIIIlII[30]);
                        e.l(lIIIIIIlII[31]);
                        e.l(lIIIIIIlII[32]);
                        e.l(lIIIIIIlII[33]);
                        Time.sleepTicks((int)lIIIIIIlII[1]);

                        e.l(lIIIIIIlII[35]);
                        e.l(lIIIIIIlII[37]);
                        e.l(lIIIIIIlII[34]);
                        e.l(lIIIIIIlII[36]);
                        e.l(lIIIIIIlII[18]);
                        Time.sleepTicks((int)lIIIIIIlII[10]);

                        if (ac.llIlllIIllIl(Bank.isOpen() ? 1 : 0)) {
                            a.a();
                            Time.sleepTicks((int)lIIIIIIlII[21]);

                        }
                        if (ac.llIlllIIlIll(Bank.isOpen() ? 1 : 0)) {
                            if (ac.llIlllIIllII(Skills.getLevel((Skill)Skill.AGILITY), lIIIIIIlII[38])) {
                                a.a(lIIIIIIlII[13], lIIIIIIlII[12]);
                                a.a(lIIIIIIlII[14], lIIIIIIlII[12]);
                                a.a(lIIIIIIlII[22], lIIIIIIlII[12]);
                                a.a(lIIIIIIlII[15], lIIIIIIlII[12]);
                                a.b(f.bm, lIIIIIIlII[1]);
                                a.a(lIIIIIIlII[28], lIIIIIIlII[1]);
                                a.a(lIIIIIIlII[20], lIIIIIIlII[19]);
                                a.a(lIIIIIIlII[24], lIIIIIIlII[39]);
                            }
                            if (ac.llIlllIlIIIl(Skills.getLevel((Skill)Skill.AGILITY), lIIIIIIlII[38])) {
                                a.a(lIIIIIIlII[13], lIIIIIIlII[12]);
                                a.a(lIIIIIIlII[22], lIIIIIIlII[12]);
                                a.a(lIIIIIIlII[26], lIIIIIIlII[12]);
                                a.b(f.bm, lIIIIIIlII[1]);
                                a.a(lIIIIIIlII[28], lIIIIIIlII[1]);
                                a.a(lIIIIIIlII[20], lIIIIIIlII[25]);
                                a.a(lIIIIIIlII[24], lIIIIIIlII[12]);
                            }
                        }
                    }
                }
            }
            if (ac.llIlllIIlIll(ac.an() ? 1 : 0)) {
                String[] stringArray = new String[lIIIIIIlII[1]];
                stringArray[ac.lIIIIIIlII[0]] = lIIIIIIIll[lIIIIIIlII[19]];
                if (ac.llIlllIIlIll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    String[] stringArray2 = new String[lIIIIIIlII[1]];
                    stringArray2[ac.lIIIIIIlII[0]] = lIIIIIIIll[lIIIIIIlII[21]];
                    Inventory.getFirst((String[])stringArray2).interact(lIIIIIIIll[lIIIIIIlII[23]]);
                }
                if (ac.llIlllIIlIll(Inventory.contains((int[])f.bc) ? 1 : 0) && ac.llIlllIIllII(Movement.getRunEnergy(), lIIIIIIlII[40])) {
                    Inventory.getFirst((int[])f.bc).interact(lIIIIIIIll[lIIIIIIlII[25]]);
                    Time.sleepTicks((int)lIIIIIIlII[1]);

                }
                if (ac.llIlllIIllll(Combat.getMissingHealth(), lIIIIIIlII[41])) {
                    int[] nArray = new int[lIIIIIIlII[1]];
                    nArray[ac.lIIIIIIlII[0]] = lIIIIIIlII[24];
                    if (ac.llIlllIIlIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        int[] nArray6 = new int[lIIIIIIlII[1]];
                        nArray6[ac.lIIIIIIlII[0]] = lIIIIIIlII[24];
                        Inventory.getFirst((int[])nArray6).interact(lIIIIIIIll[lIIIIIIlII[27]]);
                        Time.sleepTicks((int)lIIIIIIlII[3]);

                    }
                }
                if (ac.llIlllIIllll(Movement.getRunEnergy(), lIIIIIIlII[42]) && ac.llIlllIIllIl(Movement.isRunEnabled() ? 1 : 0)) {
                    Movement.toggleRun();
                }
                if (ac.llIlllIIllII(Skills.getLevel((Skill)Skill.AGILITY), lIIIIIIlII[2])) {
                    ac.dU();
                }
                if ((!ac.llIlllIlIIIl(e.j(lIIIIIIlII[43]), lIIIIIIlII[44]) || ac.llIlllIIllII(e.j(lIIIIIIlII[45]), lIIIIIIlII[19])) && ac.llIlllIlIIIl(Skills.getLevel((Skill)Skill.AGILITY), lIIIIIIlII[2]) && ac.llIlllIIllII(Skills.getLevel((Skill)Skill.AGILITY), lIIIIIIlII[44])) {
                    ac.dV();
                }
                if (ac.llIlllIlIIIl(e.j(lIIIIIIlII[43]), lIIIIIIlII[44]) && ac.llIlllIlIIIl(e.j(lIIIIIIlII[45]), lIIIIIIlII[19])) {
                    if (ac.llIlllIlIIIl(Skills.getLevel((Skill)Skill.AGILITY), lIIIIIIlII[2]) && ac.llIlllIIllII(Skills.getLevel((Skill)Skill.AGILITY), lIIIIIIlII[38])) {
                        ac.dV();
                    }
                    if (ac.llIlllIlIIIl(Skills.getLevel((Skill)Skill.AGILITY), lIIIIIIlII[38]) && ac.llIlllIIllII(Skills.getLevel((Skill)Skill.AGILITY), lIIIIIIlII[44])) {
                        ac.dW();
                    }
                }
                if (ac.llIlllIlIIIl(Skills.getLevel((Skill)Skill.AGILITY), lIIIIIIlII[44])) {
                    ac.dX();
                }
            }
        }
    }

    @Override
    public boolean ae() {
        return lIIIIIIlII[0];
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean an() {
        int n2;
        if (ac.llIlllIlIIIl(Skills.getBoostedLevel((Skill)Skill.AGILITY), lIIIIIIlII[38])) {
            int n3;
            int[] nArray = new int[lIIIIIIlII[1]];
            nArray[ac.lIIIIIIlII[0]] = lIIIIIIlII[13];
            if (ac.llIlllIIlIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray2 = new int[lIIIIIIlII[1]];
                nArray2[ac.lIIIIIIlII[0]] = lIIIIIIlII[26];
                if (ac.llIlllIIlIll(Inventory.contains((int[])nArray2) ? 1 : 0)) {
                    int[] nArray3 = new int[lIIIIIIlII[1]];
                    nArray3[ac.lIIIIIIlII[0]] = lIIIIIIlII[24];
                    if (!(!ac.llIlllIIlIll(Inventory.contains((int[])nArray3) ? 1 : 0) || ac.llIlllIIllIl(Inventory.contains(item -> item.getName().contains(lIIIIIIIll[lIIIIIIlII[207]])) ? 1 : 0) && !ac.llIlllIIlIll(Equipment.contains(item -> item.getName().contains(lIIIIIIIll[lIIIIIIlII[206]])) ? 1 : 0) || ac.llIlllIIllIl(Inventory.contains((int[])f.bm) ? 1 : 0) && !ac.llIlllIIlIll(Equipment.contains((int[])f.bm) ? 1 : 0))) {
                        n3 = lIIIIIIlII[1];

                        if ((151 + 128 - 273 + 157 ^ 109 + 144 - 155 + 68) > 0) return n3 != 0;
                        return ((0x5B ^ 0x2E ^ (0x84 ^ 0xC1)) & (0x1A ^ 0x5C ^ (0x41 ^ 0x37) ^ -1)) != 0;
                    }
                }
            }
            n3 = lIIIIIIlII[0];
            return n3 != 0;
        }
        int[] nArray = new int[lIIIIIIlII[1]];
        nArray[ac.lIIIIIIlII[0]] = lIIIIIIlII[13];
        if (ac.llIlllIIlIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
            int[] nArray4 = new int[lIIIIIIlII[1]];
            nArray4[ac.lIIIIIIlII[0]] = lIIIIIIlII[15];
            if (ac.llIlllIIlIll(Inventory.contains((int[])nArray4) ? 1 : 0)) {
                int[] nArray5 = new int[lIIIIIIlII[1]];
                nArray5[ac.lIIIIIIlII[0]] = lIIIIIIlII[14];
                if (!(!ac.llIlllIIlIll(Inventory.contains((int[])nArray5) ? 1 : 0) || ac.llIlllIIllIl(Inventory.contains(item -> item.getName().contains(lIIIIIIIll[lIIIIIIlII[205]])) ? 1 : 0) && !ac.llIlllIIlIll(Equipment.contains(item -> item.getName().contains(lIIIIIIIll[lIIIIIIlII[204]])) ? 1 : 0) || ac.llIlllIIllIl(Inventory.contains((int[])f.bm) ? 1 : 0) && !ac.llIlllIIlIll(Equipment.contains((int[])f.bm) ? 1 : 0))) {
                    n2 = lIIIIIIlII[1];

                    if (-1 < 0) return n2 != 0;
                    return false;
                }
            }
        }
        n2 = lIIIIIIlII[0];
        return n2 != 0;
    }

    private static boolean llIlllIlIIll(int n2, int n3) {
        return n2 <= n3;
    }

    /*
     * WARNING - void declaration
     */
    private static boolean dY() {
        WorldArea worldArea = new WorldArea(lIIIIIIlII[80], lIIIIIIlII[81], lIIIIIIlII[69], lIIIIIIlII[64], lIIIIIIlII[0]);
        WorldArea worldArea2 = new WorldArea(lIIIIIIlII[82], lIIIIIIlII[81], lIIIIIIlII[12], lIIIIIIlII[64], lIIIIIIlII[10]);
        WorldArea worldArea3 = new WorldArea(lIIIIIIlII[83], lIIIIIIlII[84], lIIIIIIlII[63], lIIIIIIlII[49], lIIIIIIlII[10]);
        WorldArea worldArea4 = new WorldArea(lIIIIIIlII[189], lIIIIIIlII[190], lIIIIIIlII[25], lIIIIIIlII[19], lIIIIIIlII[1]);
        WorldArea worldArea5 = new WorldArea(lIIIIIIlII[85], lIIIIIIlII[87], lIIIIIIlII[12], lIIIIIIlII[25], lIIIIIIlII[10]);
        WorldArea worldArea6 = new WorldArea(lIIIIIIlII[191], lIIIIIIlII[192], lIIIIIIlII[73], lIIIIIIlII[39], lIIIIIIlII[10]);
        WorldArea worldArea7 = new WorldArea(lIIIIIIlII[90], lIIIIIIlII[91], lIIIIIIlII[66], lIIIIIIlII[64], lIIIIIIlII[10]);
        WorldArea worldArea8 = new WorldArea(lIIIIIIlII[92], lIIIIIIlII[93], lIIIIIIlII[23], lIIIIIIlII[27], lIIIIIIlII[10]);
        WorldArea worldArea9 = new WorldArea(lIIIIIIlII[92], lIIIIIIlII[94], lIIIIIIlII[12], lIIIIIIlII[23], lIIIIIIlII[10]);
        WorldArea worldArea10 = new WorldArea(lIIIIIIlII[127], lIIIIIIlII[128], lIIIIIIlII[49], lIIIIIIlII[12], lIIIIIIlII[3]);
        WorldArea worldArea11 = new WorldArea(lIIIIIIlII[129], lIIIIIIlII[127], lIIIIIIlII[49], lIIIIIIlII[25], lIIIIIIlII[3]);
        WorldArea worldArea12 = new WorldArea(lIIIIIIlII[130], lIIIIIIlII[131], lIIIIIIlII[63], lIIIIIIlII[49], lIIIIIIlII[3]);
        WorldArea worldArea13 = new WorldArea(lIIIIIIlII[132], lIIIIIIlII[133], lIIIIIIlII[12], lIIIIIIlII[64], lIIIIIIlII[10]);
        WorldArea worldArea14 = new WorldArea(lIIIIIIlII[134], lIIIIIIlII[9], lIIIIIIlII[49], lIIIIIIlII[27], lIIIIIIlII[3]);
        WorldArea worldArea15 = new WorldArea(lIIIIIIlII[135], lIIIIIIlII[136], lIIIIIIlII[68], lIIIIIIlII[53], lIIIIIIlII[10]);
        WorldArea worldArea16 = new WorldArea(lIIIIIIlII[137], lIIIIIIlII[138], lIIIIIIlII[63], lIIIIIIlII[64], lIIIIIIlII[3]);
        WorldArea worldArea17 = new WorldArea(lIIIIIIlII[164], lIIIIIIlII[133], lIIIIIIlII[64], lIIIIIIlII[12], lIIIIIIlII[10]);
        WorldArea worldArea18 = new WorldArea(lIIIIIIlII[165], lIIIIIIlII[139], lIIIIIIlII[39], lIIIIIIlII[53], lIIIIIIlII[3]);
        WorldArea worldArea19 = new WorldArea(lIIIIIIlII[166], lIIIIIIlII[134], lIIIIIIlII[49], lIIIIIIlII[27], lIIIIIIlII[3]);
        WorldArea worldArea20 = new WorldArea(lIIIIIIlII[167], lIIIIIIlII[136], lIIIIIIlII[70], lIIIIIIlII[64], lIIIIIIlII[10]);
        WorldArea worldArea21 = new WorldArea(lIIIIIIlII[168], lIIIIIIlII[169], lIIIIIIlII[54], lIIIIIIlII[63], lIIIIIIlII[3]);
        WorldArea[] worldAreaArray = new WorldArea[lIIIIIIlII[68]];
        worldAreaArray[ac.lIIIIIIlII[0]] = worldArea;
        worldAreaArray[ac.lIIIIIIlII[1]] = worldArea2;
        worldAreaArray[ac.lIIIIIIlII[3]] = worldArea3;
        worldAreaArray[ac.lIIIIIIlII[10]] = worldArea4;
        worldAreaArray[ac.lIIIIIIlII[17]] = worldArea5;
        worldAreaArray[ac.lIIIIIIlII[19]] = worldArea6;
        worldAreaArray[ac.lIIIIIIlII[21]] = worldArea7;
        worldAreaArray[ac.lIIIIIIlII[23]] = worldArea8;
        worldAreaArray[ac.lIIIIIIlII[25]] = worldArea9;
        worldAreaArray[ac.lIIIIIIlII[27]] = worldArea10;
        worldAreaArray[ac.lIIIIIIlII[12]] = worldArea11;
        worldAreaArray[ac.lIIIIIIlII[49]] = worldArea12;
        worldAreaArray[ac.lIIIIIIlII[63]] = worldArea13;
        worldAreaArray[ac.lIIIIIIlII[64]] = worldArea14;
        worldAreaArray[ac.lIIIIIIlII[53]] = worldArea15;
        worldAreaArray[ac.lIIIIIIlII[39]] = worldArea16;
        worldAreaArray[ac.lIIIIIIlII[65]] = worldArea17;
        worldAreaArray[ac.lIIIIIIlII[66]] = worldArea18;
        worldAreaArray[ac.lIIIIIIlII[54]] = worldArea19;
        worldAreaArray[ac.lIIIIIIlII[67]] = worldArea20;
        worldAreaArray[ac.lIIIIIIlII[41]] = worldArea21;
        WorldArea[] worldAreaArray2 = worldAreaArray;
        int[] nArray = new int[lIIIIIIlII[1]];
        nArray[ac.lIIIIIIlII[0]] = lIIIIIIlII[193];
        if (ac.llIlllIIlllI(TileItems.getNearest((int[])nArray))) {
            void lIIIlIlIllIIl;
            System.out.println(lIIIIIIIll[lIIIIIIlII[194]]);
            int lIIIlIlIllIII = lIIIIIIlII[0];
            while (ac.llIlllIIllII(lIIIlIlIllIII, ((void)lIIIlIlIllIIl).length)) {
                int[] nArray2 = new int[lIIIIIIlII[1]];
                nArray2[ac.lIIIIIIlII[0]] = lIIIIIIlII[193];
                if (ac.llIlllIIlIll(lIIIlIlIllIIl[lIIIlIlIllIII].contains(TileItems.getNearest((int[])nArray2).getWorldLocation()) ? 1 : 0) && ac.llIlllIIlIll(lIIIlIlIllIIl[lIIIlIlIllIII].contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    return lIIIIIIlII[1];
                }
                ++lIIIlIlIllIII;

                return ((0x4C ^ 0x53 ^ (0xA3 ^ 0x83)) & (0x5C ^ 0x29 ^ (0x2D ^ 0x67) ^ -1)) != 0;
            }
        }
        return lIIIIIIlII[0];
    }

    private static boolean llIlllIlIIII(int n2) {
        return n2 > 0;
    }

    private static void llIllIlllllI() {
        lIIIIIIIll = new String[lIIIIIIlII[238]];
        ac.lIIIIIIIll[ac.lIIIIIIlII[0]] = "Buying items";
        ac.lIIIIIIIll[ac.lIIIIIIlII[1]] = "Finished buying items, switching back to agility";
        ac.lIIIIIIIll[ac.lIIIIIIlII[3]] = "Navigating to bank";
        ac.lIIIIIIIll[ac.lIIIIIIlII[10]] = "Handling banking";
        ac.lIIIIIIIll[ac.lIIIIIIlII[17]] = "We are missing quest supplies, switching to BUYING";
        ac.lIIIIIIIll[ac.lIIIIIIlII[19]] = "Vial";
        ac.lIIIIIIIll[ac.lIIIIIIlII[21]] = "Vial";
        ac.lIIIIIIIll[ac.lIIIIIIlII[23]] = "Drop";
        ac.lIIIIIIIll[ac.lIIIIIIlII[25]] = "Drink";
        ac.lIIIIIIIll[ac.lIIIIIIlII[27]] = "Eat";
        ac.lIIIIIIIll[ac.lIIIIIIlII[12]] = "Nav to gnome course";
        ac.lIIIIIIIll[ac.lIIIIIIlII[49]] = "Crossing log";
        ac.lIIIIIIIll[ac.lIIIIIIlII[63]] = "Log balance";
        ac.lIIIIIIIll[ac.lIIIIIIlII[64]] = "Walk-across";
        ac.lIIIIIIIll[ac.lIIIIIIlII[53]] = "Climbing net";
        ac.lIIIIIIIll[ac.lIIIIIIlII[39]] = "Obstacle net";
        ac.lIIIIIIIll[ac.lIIIIIIlII[65]] = "Climb-over";
        ac.lIIIIIIIll[ac.lIIIIIIlII[66]] = "Climbing branch";
        ac.lIIIIIIIll[ac.lIIIIIIlII[54]] = "Tree branch";
        ac.lIIIIIIIll[ac.lIIIIIIlII[67]] = "Climb";
        ac.lIIIIIIIll[ac.lIIIIIIlII[41]] = "Crossing rope";
        ac.lIIIIIIIll[ac.lIIIIIIlII[68]] = "Balancing rope";
        ac.lIIIIIIIll[ac.lIIIIIIlII[61]] = "Walk-on";
        ac.lIIIIIIIll[ac.lIIIIIIlII[69]] = "Climbing down";
        ac.lIIIIIIIll[ac.lIIIIIIlII[70]] = "Tree branch";
        ac.lIIIIIIIll[ac.lIIIIIIlII[42]] = "Climb-down";
        ac.lIIIIIIIll[ac.lIIIIIIlII[71]] = "Climbing net";
        ac.lIIIIIIIll[ac.lIIIIIIlII[72]] = "Obstacle net";
        ac.lIIIIIIIll[ac.lIIIIIIlII[73]] = "Climb-over";
        ac.lIIIIIIIll[ac.lIIIIIIlII[74]] = "Crossing pipe";
        ac.lIIIIIIIll[ac.lIIIIIIlII[2]] = "Obstacle pipe";
        ac.lIIIIIIIll[ac.lIIIIIIlII[75]] = "Squeeze-through";
        ac.lIIIIIIIll[ac.lIIIIIIlII[95]] = "Nav to start";
        ac.lIIIIIIIll[ac.lIIIIIIlII[97]] = "Mark of grace";
        ac.lIIIIIIIll[ac.lIIIIIIlII[98]] = "Taking mark";
        ac.lIIIIIIIll[ac.lIIIIIIlII[99]] = "Found mark on ground";
        ac.lIIIIIIIll[ac.lIIIIIIlII[100]] = "Take";
        ac.lIIIIIIIll[ac.lIIIIIIlII[101]] = "Starting course";
        ac.lIIIIIIIll[ac.lIIIIIIlII[102]] = "Rough wall";
        ac.lIIIIIIIll[ac.lIIIIIIlII[103]] = "Climb";
        ac.lIIIIIIIll[ac.lIIIIIIlII[38]] = "Crossing clothes line";
        ac.lIIIIIIIll[ac.lIIIIIIlII[105]] = "Clothes line";
        ac.lIIIIIIIll[ac.lIIIIIIlII[106]] = "Cross";
        ac.lIIIIIIIll[ac.lIIIIIIlII[107]] = "Leaping";
        ac.lIIIIIIIll[ac.lIIIIIIlII[108]] = "Gap";
        ac.lIIIIIIIll[ac.lIIIIIIlII[109]] = "Leap";
        ac.lIIIIIIIll[ac.lIIIIIIlII[110]] = "Balancing";
        ac.lIIIIIIIll[ac.lIIIIIIlII[111]] = "Wall";
        ac.lIIIIIIIll[ac.lIIIIIIlII[112]] = "Balance";
        ac.lIIIIIIIll[ac.lIIIIIIlII[113]] = "Jumping gap";
        ac.lIIIIIIIll[ac.lIIIIIIlII[40]] = "Gap";
        ac.lIIIIIIIll[ac.lIIIIIIlII[7]] = "Leap";
        ac.lIIIIIIIll[ac.lIIIIIIlII[114]] = "Jumping gap 2";
        ac.lIIIIIIIll[ac.lIIIIIIlII[116]] = "Leap";
        ac.lIIIIIIIll[ac.lIIIIIIlII[117]] = "Jumping gap 3";
        ac.lIIIIIIIll[ac.lIIIIIIlII[119]] = "Leap";
        ac.lIIIIIIIll[ac.lIIIIIIlII[120]] = "Hurdle roof";
        ac.lIIIIIIIll[ac.lIIIIIIlII[122]] = "Hurdle";
        ac.lIIIIIIIll[ac.lIIIIIIlII[123]] = "Finishing course";
        ac.lIIIIIIIll[ac.lIIIIIIlII[124]] = "Edge";
        ac.lIIIIIIIll[ac.lIIIIIIlII[44]] = "Jump-off";
        ac.lIIIIIIIll[ac.lIIIIIIlII[140]] = "Nav to canafis course";
        ac.lIIIIIIIll[ac.lIIIIIIlII[6]] = "Nav to start";
        ac.lIIIIIIIll[ac.lIIIIIIlII[141]] = "Starting course";
        ac.lIIIIIIIll[ac.lIIIIIIlII[142]] = "Tall tree";
        ac.lIIIIIIIll[ac.lIIIIIIlII[143]] = "Climb";
        ac.lIIIIIIIll[ac.lIIIIIIlII[144]] = "Mark of grace";
        ac.lIIIIIIIll[ac.lIIIIIIlII[145]] = "Taking mark";
        ac.lIIIIIIIll[ac.lIIIIIIlII[146]] = "Found mark on ground";
        ac.lIIIIIIIll[ac.lIIIIIIlII[147]] = "Take";
        ac.lIIIIIIIll[ac.lIIIIIIlII[148]] = "Jumping gap 1";
        ac.lIIIIIIIll[ac.lIIIIIIlII[149]] = "Jump";
        ac.lIIIIIIIll[ac.lIIIIIIlII[150]] = "Jumping gap 2";
        ac.lIIIIIIIll[ac.lIIIIIIlII[151]] = "Jump";
        ac.lIIIIIIIll[ac.lIIIIIIlII[152]] = "Jumping gap 3";
        ac.lIIIIIIIll[ac.lIIIIIIlII[153]] = "Jump";
        ac.lIIIIIIIll[ac.lIIIIIIlII[154]] = "Jumping gap 4";
        ac.lIIIIIIIll[ac.lIIIIIIlII[155]] = "Jump";
        ac.lIIIIIIIll[ac.lIIIIIIlII[156]] = "Vaulting";
        ac.lIIIIIIIll[ac.lIIIIIIlII[157]] = "Vault";
        ac.lIIIIIIIll[ac.lIIIIIIlII[158]] = "Jumping gap 5";
        ac.lIIIIIIIll[ac.lIIIIIIlII[159]] = "Jump";
        ac.lIIIIIIIll[ac.lIIIIIIlII[160]] = "Jumping gap 6";
        ac.lIIIIIIIll[ac.lIIIIIIlII[161]] = "Jump";
        ac.lIIIIIIIll[ac.lIIIIIIlII[172]] = "Nav to canafis course";
        ac.lIIIIIIIll[ac.lIIIIIIlII[173]] = "Nav to start";
        ac.lIIIIIIIll[ac.lIIIIIIlII[174]] = "Starting course";
        ac.lIIIIIIIll[ac.lIIIIIIlII[175]] = "Wall";
        ac.lIIIIIIIll[ac.lIIIIIIlII[36]] = "Climb-up";
        ac.lIIIIIIIll[ac.lIIIIIIlII[176]] = "Mark of grace";
        ac.lIIIIIIIll[ac.lIIIIIIlII[177]] = "Taking mark";
        ac.lIIIIIIIll[ac.lIIIIIIlII[178]] = "Found mark on ground";
        ac.lIIIIIIIll[ac.lIIIIIIlII[179]] = "Take";
        ac.lIIIIIIIll[ac.lIIIIIIlII[180]] = "Jumping gap 1";
        ac.lIIIIIIIll[ac.lIIIIIIlII[79]] = "Jump";
        ac.lIIIIIIIll[ac.lIIIIIIlII[181]] = "cross rope";
        ac.lIIIIIIIll[ac.lIIIIIIlII[182]] = "Cross";
        ac.lIIIIIIIll[ac.lIIIIIIlII[183]] = "Jumping gap 3";
        ac.lIIIIIIIll[ac.lIIIIIIlII[184]] = "Jump";
        ac.lIIIIIIIll[ac.lIIIIIIlII[185]] = "Jumping gap 4";
        ac.lIIIIIIIll[ac.lIIIIIIlII[186]] = "Jump";
        ac.lIIIIIIIll[ac.lIIIIIIlII[187]] = "Jumping Edge";
        ac.lIIIIIIIll[ac.lIIIIIIlII[188]] = "Jump";
        ac.lIIIIIIIll[ac.lIIIIIIlII[194]] = "Found mark on ground";
        ac.lIIIIIIIll[ac.lIIIIIIlII[203]] = "Agility";
        ac.lIIIIIIIll[ac.lIIIIIIlII[204]] = "passage";
        ac.lIIIIIIIll[ac.lIIIIIIlII[205]] = "passage";
        ac.lIIIIIIIll[ac.lIIIIIIlII[206]] = "passage";
        ac.lIIIIIIIll[ac.lIIIIIIlII[207]] = "passage";
        ac.lIIIIIIIll[ac.lIIIIIIlII[208]] = "Edge";
        ac.lIIIIIIIll[ac.lIIIIIIlII[211]] = "Gap";
        ac.lIIIIIIIll[ac.lIIIIIIlII[213]] = "Gap";
        ac.lIIIIIIIll[ac.lIIIIIIlII[216]] = "Tightrope";
        ac.lIIIIIIIll[ac.lIIIIIIlII[218]] = "Gap";
        ac.lIIIIIIIll[ac.lIIIIIIlII[221]] = "Gap";
        ac.lIIIIIIIll[ac.lIIIIIIlII[224]] = "Gap";
        ac.lIIIIIIIll[ac.lIIIIIIlII[226]] = "Pole-vault";
        ac.lIIIIIIIll[ac.lIIIIIIlII[227]] = "Gap";
        ac.lIIIIIIIll[ac.lIIIIIIlII[230]] = "Gap";
        ac.lIIIIIIIll[ac.lIIIIIIlII[232]] = "Gap";
        ac.lIIIIIIIll[ac.lIIIIIIlII[233]] = "Gap";
    }

        return String.valueOf(lIIIIlllIIlll);
    }

    private static boolean llIlllIIlllI(Object object) {
        return object != null;
    }

    @Override
    public boolean ah() {
        boolean bl;
        if (ac.llIlllIlIIIl(Skills.getLevel((Skill)Skill.AGILITY), lIIIIIIlII[2])) {
            bl = lIIIIIIlII[1];

            }
        } else {
            bl = lIIIIIIlII[0];
        }
        return bl;
    }

    private static boolean llIlllIIllll(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean llIlllIlIIlI(int n2, int n3) {
        return n2 == n3;
    }

    /*
     * WARNING - void declaration
     */
    private static void dX() {
        void lIIIllIIIlIIl;
        void lIIIllIIIllll;
        void lIIIllIIlIIII;
        void lIIIllIIlIIIl;
        void lIIIllIIlIIlI;
        WorldArea worldArea = new WorldArea(lIIIIIIlII[162], lIIIIIIlII[163], lIIIIIIlII[111], lIIIIIIlII[111], lIIIIIIlII[0]);
        WorldArea worldArea2 = new WorldArea(lIIIIIIlII[162], lIIIIIIlII[163], lIIIIIIlII[111], lIIIIIIlII[111], lIIIIIIlII[1]);
        WorldArea worldArea3 = new WorldArea(lIIIIIIlII[162], lIIIIIIlII[163], lIIIIIIlII[111], lIIIIIIlII[111], lIIIIIIlII[3]);
        WorldArea worldArea4 = new WorldArea(lIIIIIIlII[162], lIIIIIIlII[163], lIIIIIIlII[111], lIIIIIIlII[111], lIIIIIIlII[10]);
        WorldArea worldArea5 = new WorldArea(lIIIIIIlII[164], lIIIIIIlII[133], lIIIIIIlII[64], lIIIIIIlII[12], lIIIIIIlII[10]);
        WorldArea worldArea6 = new WorldArea(lIIIIIIlII[165], lIIIIIIlII[139], lIIIIIIlII[39], lIIIIIIlII[53], lIIIIIIlII[3]);
        WorldArea worldArea7 = new WorldArea(lIIIIIIlII[166], lIIIIIIlII[134], lIIIIIIlII[49], lIIIIIIlII[27], lIIIIIIlII[3]);
        WorldArea worldArea8 = new WorldArea(lIIIIIIlII[167], lIIIIIIlII[136], lIIIIIIlII[70], lIIIIIIlII[64], lIIIIIIlII[10]);
        WorldArea worldArea9 = new WorldArea(lIIIIIIlII[168], lIIIIIIlII[169], lIIIIIIlII[54], lIIIIIIlII[63], lIIIIIIlII[3]);
        WorldPoint worldPoint = new WorldPoint(lIIIIIIlII[170], lIIIIIIlII[171], lIIIIIIlII[0]);
        if (ac.llIlllIIlIll(Dialog.isOpen() ? 1 : 0)) {
            Dialog.close();
        }
        if (ac.llIlllIIllIl(lIIIllIIlIIlI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && ac.llIlllIIllIl(lIIIllIIlIIIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && ac.llIlllIIllIl(lIIIllIIlIIII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && ac.llIlllIIllIl(lIIIllIIIllll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderGWD.c = lIIIIIIIll[lIIIIIIlII[172]];
            Movement.walkTo((WorldPoint)lIIIllIIIlIIl);

            Time.sleepTicks((int)lIIIIIIlII[1]);

        }
        if (ac.llIlllIIlIll(lIIIllIIlIIlI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (ac.llIlllIIllll(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lIIIllIIIlIIl), lIIIIIIlII[21])) {
                AccBuilderGWD.c = lIIIIIIIll[lIIIIIIlII[173]];
                Movement.walkTo((WorldPoint)lIIIllIIIlIIl);

                Time.sleepTicks((int)lIIIIIIlII[1]);

            }
            if (ac.llIlllIlIIll(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lIIIllIIIlIIl), lIIIIIIlII[21])) {
                AccBuilderGWD.c = lIIIIIIIll[lIIIIIIlII[174]];
                int lIIIllIIIlIII = Skills.getExperience((Skill)Skill.AGILITY);
                String[] stringArray = new String[lIIIIIIlII[1]];
                stringArray[ac.lIIIIIIlII[0]] = lIIIIIIIll[lIIIIIIlII[175]];
                TileObjects.getNearest((String[])stringArray).interact(lIIIIIIIll[lIIIIIIlII[36]]);
                Time.sleepTicks((int)e.c(lIIIIIIlII[1], lIIIIIIlII[3]));

                Time.sleepUntil(() -> {
                    boolean bl;
                    if (ac.llIlllIIllll(Skills.getExperience((Skill)Skill.AGILITY), lIIIllIIIlIII)) {
                        bl = lIIIIIIlII[1];

                        if (2 < 0) {
                            return false;
                        }
                    } else {
                        bl = lIIIIIIlII[0];
                    }
                    return bl;
                }, (int)lIIIIIIlII[104]);

                Time.sleepTicks((int)lIIIIIIlII[1]);

            }
        }
        String[] stringArray = new String[lIIIIIIlII[1]];
        stringArray[ac.lIIIIIIlII[0]] = lIIIIIIIll[lIIIIIIlII[176]];
        TileItem lIIIllIIIlIII = TileItems.getNearest((String[])stringArray);
        if (ac.llIlllIIlllI(lIIIllIIIlIII) && ac.llIlllIIlIll(ac.dY() ? 1 : 0)) {
            AccBuilderGWD.c = lIIIIIIIll[lIIIIIIlII[177]];
            System.out.println(lIIIIIIIll[lIIIIIIlII[178]]);
            lIIIllIIIlIII.interact(lIIIIIIIll[lIIIIIIlII[179]]);
            Time.sleepTicks((int)lIIIIIIlII[10]);

        }
        if (ac.llIlllIIllIl(ac.dY() ? 1 : 0)) {
            void lIIIllIIIlIlI;
            void lIIIllIIIlIll;
            void lIIIllIIIllII;
            void lIIIllIIIllIl;
            int lIIIllIIIIllI;
            TileObject lIIIllIIIIlll;
            void lIIIllIIIlllI;
            if (ac.llIlllIIlIll(lIIIllIIIlllI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && ac.llIlllIIlllI(lIIIllIIIIlll = TileObjects.getNearest(tileObject -> {
                int n2;
                if (ac.llIlllIIlIll(tileObject.getName().contains(lIIIIIIIll[lIIIIIIlII[218]]) ? 1 : 0) && ac.llIlllIlIIll(tileObject.getWorldLocation().distanceTo(new WorldPoint(lIIIIIIlII[219], lIIIIIIlII[220], lIIIIIIlII[10])), lIIIIIIlII[3])) {
                    n2 = lIIIIIIlII[1];

                    if (-1 == 1) {
                        return ((0xBC ^ 0x93 ^ (0xD3 ^ 0xAF)) & (0xF2 ^ 0x8F ^ (0x9B ^ 0xB5) ^ -1)) != 0;
                    }
                } else {
                    n2 = lIIIIIIlII[0];
                }
                return n2 != 0;
            }))) {
                lIIIllIIIIllI = Skills.getExperience((Skill)Skill.AGILITY);
                AccBuilderGWD.c = lIIIIIIIll[lIIIIIIlII[180]];
                lIIIllIIIIlll.interact(lIIIIIIIll[lIIIIIIlII[79]]);
                Time.sleepTicks((int)e.c(lIIIIIIlII[1], lIIIIIIlII[3]));

                Time.sleepUntil(() -> {
                    boolean bl;
                    if (ac.llIlllIIllll(Skills.getExperience((Skill)Skill.AGILITY), lIIIllIIIIllI)) {
                        bl = lIIIIIIlII[1];

                        if (-1 > 2) {
                            return false;
                        }
                    } else {
                        bl = lIIIIIIlII[0];
                    }
                    return bl;
                }, (int)lIIIIIIlII[104]);

                Time.sleepTicks((int)lIIIIIIlII[1]);

            }
            if (ac.llIlllIIlIll(ac.dY() ? 1 : 0)) {
                return;
            }
            if (ac.llIlllIIlIll(lIIIllIIIllIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && ac.llIlllIIlllI(lIIIllIIIIlll = TileObjects.getNearest(tileObject -> {
                int n2;
                if (ac.llIlllIIlIll(tileObject.getName().contains(lIIIIIIIll[lIIIIIIlII[216]]) ? 1 : 0) && ac.llIlllIlIIll(tileObject.getWorldLocation().distanceTo(new WorldPoint(lIIIIIIlII[217], lIIIIIIlII[128], lIIIIIIlII[3])), lIIIIIIlII[3])) {
                    n2 = lIIIIIIlII[1];

                    if (((0xAF ^ 0xBF) & ~(0x2A ^ 0x3A) & ~((0x37 ^ 0xC) & ~(0xBE ^ 0x85))) > (0x1A ^ 0x1E)) {
                        return (1 & ~1) != 0;
                    }
                } else {
                    n2 = lIIIIIIlII[0];
                }
                return n2 != 0;
            }))) {
                AccBuilderGWD.c = lIIIIIIIll[lIIIIIIlII[181]];
                lIIIllIIIIllI = Skills.getExperience((Skill)Skill.AGILITY);
                lIIIllIIIIlll.interact(lIIIIIIIll[lIIIIIIlII[182]]);
                Time.sleepTicks((int)e.c(lIIIIIIlII[1], lIIIIIIlII[3]));

                Time.sleepUntil(() -> {
                    boolean bl;
                    if (ac.llIlllIIllll(Skills.getExperience((Skill)Skill.AGILITY), lIIIllIIIIllI)) {
                        bl = lIIIIIIlII[1];

                        if (((0x46 ^ 0x4B) & ~(0x6C ^ 0x61)) != 0) {
                            return false;
                        }
                    } else {
                        bl = lIIIIIIlII[0];
                    }
                    return bl;
                }, (int)lIIIIIIlII[104]);

                Time.sleepTicks((int)lIIIIIIlII[1]);

            }
            if (ac.llIlllIIlIll(ac.dY() ? 1 : 0)) {
                return;
            }
            if (ac.llIlllIIlIll(lIIIllIIIllII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && ac.llIlllIIlllI(lIIIllIIIIlll = TileObjects.getNearest(tileObject -> {
                int n2;
                if (ac.llIlllIIlIll(tileObject.getName().contains(lIIIIIIIll[lIIIIIIlII[213]]) ? 1 : 0) && ac.llIlllIlIIll(tileObject.getWorldLocation().distanceTo(new WorldPoint(lIIIIIIlII[214], lIIIIIIlII[215], lIIIIIIlII[3])), lIIIIIIlII[3])) {
                    n2 = lIIIIIIlII[1];

                    if ((0xC1 ^ 0xC5) < ((0x73 ^ 0x48) & ~(0x57 ^ 0x6C))) {
                        return false;
                    }
                } else {
                    n2 = lIIIIIIlII[0];
                }
                return n2 != 0;
            }))) {
                AccBuilderGWD.c = lIIIIIIIll[lIIIIIIlII[183]];
                lIIIllIIIIllI = Skills.getExperience((Skill)Skill.AGILITY);
                lIIIllIIIIlll.interact(lIIIIIIIll[lIIIIIIlII[184]]);
                Time.sleepTicks((int)e.c(lIIIIIIlII[1], lIIIIIIlII[3]));

                Time.sleepUntil(() -> {
                    boolean bl;
                    if (ac.llIlllIIllll(Skills.getExperience((Skill)Skill.AGILITY), lIIIllIIIIllI)) {
                        bl = lIIIIIIlII[1];

                        if ((0x6F ^ 0x6B) == 0) {
                            return false;
                        }
                    } else {
                        bl = lIIIIIIlII[0];
                    }
                    return bl;
                }, (int)lIIIIIIlII[104]);

                Time.sleepTicks((int)lIIIIIIlII[1]);

            }
            if (ac.llIlllIIlIll(ac.dY() ? 1 : 0)) {
                return;
            }
            if (ac.llIlllIIlIll(lIIIllIIIlIll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && ac.llIlllIIlllI(lIIIllIIIIlll = TileObjects.getNearest(tileObject -> {
                int n2;
                if (ac.llIlllIIlIll(tileObject.getName().contains(lIIIIIIIll[lIIIIIIlII[211]]) ? 1 : 0) && ac.llIlllIlIIll(tileObject.getWorldLocation().distanceTo(new WorldPoint(lIIIIIIlII[209], lIIIIIIlII[212], lIIIIIIlII[10])), lIIIIIIlII[3])) {
                    n2 = lIIIIIIlII[1];

                } else {
                    n2 = lIIIIIIlII[0];
                }
                return n2 != 0;
            }))) {
                AccBuilderGWD.c = lIIIIIIIll[lIIIIIIlII[185]];
                lIIIllIIIIllI = Skills.getExperience((Skill)Skill.AGILITY);
                lIIIllIIIIlll.interact(lIIIIIIIll[lIIIIIIlII[186]]);
                Time.sleepTicks((int)e.c(lIIIIIIlII[1], lIIIIIIlII[3]));

                Time.sleepUntil(() -> {
                    boolean bl;
                    if (ac.llIlllIIllll(Skills.getExperience((Skill)Skill.AGILITY), lIIIllIIIIllI)) {
                        bl = lIIIIIIlII[1];

                        if ((2 ^ (0x4A ^ 0x4C)) == 0) {
                            return false;
                        }
                    } else {
                        bl = lIIIIIIlII[0];
                    }
                    return bl;
                }, (int)lIIIIIIlII[104]);

                Time.sleepTicks((int)lIIIIIIlII[1]);

            }
            if (ac.llIlllIIlIll(ac.dY() ? 1 : 0)) {
                return;
            }
            if (ac.llIlllIIlIll(lIIIllIIIlIlI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && ac.llIlllIIlllI(lIIIllIIIIlll = TileObjects.getNearest(tileObject -> {
                int n2;
                if (ac.llIlllIIlIll(tileObject.getName().contains(lIIIIIIIll[lIIIIIIlII[208]]) ? 1 : 0) && ac.llIlllIlIIll(tileObject.getWorldLocation().distanceTo(new WorldPoint(lIIIIIIlII[209], lIIIIIIlII[210], lIIIIIIlII[3])), lIIIIIIlII[3])) {
                    n2 = lIIIIIIlII[1];

                    }
                } else {
                    n2 = lIIIIIIlII[0];
                }
                return n2 != 0;
            }))) {
                AccBuilderGWD.c = lIIIIIIIll[lIIIIIIlII[187]];
                lIIIllIIIIllI = Skills.getExperience((Skill)Skill.AGILITY);
                lIIIllIIIIlll.interact(lIIIIIIIll[lIIIIIIlII[188]]);
                Time.sleepTicks((int)e.c(lIIIIIIlII[1], lIIIIIIlII[3]));

                Time.sleepUntil(() -> {
                    boolean bl;
                    if (ac.llIlllIIllll(Skills.getExperience((Skill)Skill.AGILITY), lIIIllIIIIllI)) {
                        bl = lIIIIIIlII[1];

                        if (3 <= 1) {
                            return false;
                        }
                    } else {
                        bl = lIIIIIIlII[0];
                    }
                    return bl;
                }, (int)lIIIIIIlII[104]);

                Time.sleepTicks((int)lIIIIIIlII[1]);

            }
        }
    }

    private static boolean llIlllIIllII(int n2, int n3) {
        return n2 < n3;
    }
}

