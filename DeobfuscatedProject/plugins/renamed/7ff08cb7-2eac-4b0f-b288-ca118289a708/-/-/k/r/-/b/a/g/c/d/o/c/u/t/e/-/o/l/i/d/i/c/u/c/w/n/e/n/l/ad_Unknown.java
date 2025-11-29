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
package -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l;

import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.a_Unknown;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.ab_Unknown;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.b_Unknown;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.d;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.e_Unknown;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.f_Unknown;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.j;
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

public class ad_Unknown
implements ab {
    private static /* synthetic */ WorldPoint me;
    public static /* synthetic */ int lZ;
    private static /* synthetic */ String[] lllllllII;
    static /* synthetic */ WorldArea md;
    private static /* synthetic */ int[] lllllllIl;
    public static /* synthetic */ List<d> bx;
    public static /* synthetic */ int lY;
    static /* synthetic */ WorldArea mb;
    public static /* synthetic */ int ma;
    static /* synthetic */ WorldArea mc;
    public static /* synthetic */ boolean bv;

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
                        0;
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
                    0;
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
            0;
            Time.sleepTicks((int)lllllllIl[1]);
            0;
        }
        if (ad.llIllIIlIIlI(lIlIIIIIIIlII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (ad.llIllIIlIllI(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lIIlllllllIIl), lllllllIl[20])) {
                AccBuilderGWD.c = lllllllII[lllllllIl[6]];
                Movement.walkTo((WorldPoint)lIIlllllllIIl);
                0;
                Time.sleepTicks((int)lllllllIl[1]);
                0;
            }
            if (ad.llIllIIllIlI(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lIIlllllllIIl), lllllllIl[20])) {
                AccBuilderGWD.c = lllllllII[lllllllIl[141]];
                int lIIlllllllIII = Skills.getExperience((Skill)Skill.AGILITY);
                String[] stringArray = new String[lllllllIl[1]];
                stringArray[ad.lllllllIl[0]] = lllllllII[lllllllIl[142]];
                TileObjects.getNearest((String[])stringArray).interact(lllllllII[lllllllIl[143]]);
                Time.sleepTicks((int)e.c(lllllllIl[1], lllllllIl[3]));
                0;
                Time.sleepUntil(() -> {
                    boolean bl;
                    if (ad.llIllIIlIllI(Skills.getExperience((Skill)Skill.AGILITY), lIIlllllllIII)) {
                        bl = lllllllIl[1];
                        0;
                        if (2 < -1) {
                            return false;
                        }
                    } else {
                        bl = lllllllIl[0];
                    }
                    return bl;
                }, (int)lllllllIl[104]);
                0;
                Time.sleepTicks((int)lllllllIl[1]);
                0;
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
            0;
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
                    0;
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
                0;
                Time.sleepUntil(() -> {
                    boolean bl;
                    if (ad.llIllIIlIllI(Skills.getExperience((Skill)Skill.AGILITY), lIIllllllIllI)) {
                        bl = lllllllIl[1];
                        0;
                        if (((0x63 ^ 0x37) & ~(0xCF ^ 0x9B)) == (0x25 ^ 0x21)) {
                            return false;
                        }
                    } else {
                        bl = lllllllIl[0];
                    }
                    return bl;
                }, (int)lllllllIl[104]);
                0;
                Time.sleepTicks((int)lllllllIl[1]);
                0;
            }
            if (ad.llIllIIlIIlI(ad.dY() ? 1 : 0)) {
                return;
            }
            if (ad.llIllIIlIIlI(lIIllllllllll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && ad.llIllIIlIlIl(lIIllllllIlll = TileObjects.getNearest(tileObject -> {
                int n2;
                if (ad.llIllIIlIIlI(tileObject.getName().contains(lllllllII[lllllllIl[232]]) ? 1 : 0) && ad.llIllIIllIlI(tileObject.getWorldLocation().distanceTo(new WorldPoint(lllllllIl[131], lllllllIl[225], lllllllIl[3])), lllllllIl[3])) {
                    n2 = lllllllIl[1];
                    0;
                    
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
                0;
                Time.sleepUntil(() -> {
                    boolean bl;
                    if (ad.llIllIIlIllI(Skills.getExperience((Skill)Skill.AGILITY), lIIllllllIllI)) {
                        bl = lllllllIl[1];
                        0;
                        if ((0x41 ^ 0x75 ^ (0xBA ^ 0x8A)) <= ((0x7E ^ 0xB ^ (0x6D ^ 0x55)) & (0x52 ^ 0x16 ^ (0x12 ^ 0x1B) ^ -1))) {
                            return ((0xFE ^ 0xB2 ^ (0x3A ^ 0x22)) & (185 + 23 - 127 + 166 ^ 103 + 1 - 89 + 148 ^ -1)) != 0;
                        }
                    } else {
                        bl = lllllllIl[0];
                    }
                    return bl;
                }, (int)lllllllIl[104]);
                0;
                Time.sleepTicks((int)lllllllIl[1]);
                0;
            }
            if (ad.llIllIIlIIlI(ad.dY() ? 1 : 0)) {
                return;
            }
            if (ad.llIllIIlIIlI(lIIlllllllllI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && ad.llIllIIlIlIl(lIIllllllIlll = TileObjects.getNearest(tileObject -> {
                int n2;
                if (ad.llIllIIlIIlI(tileObject.getName().contains(lllllllII[lllllllIl[230]]) ? 1 : 0) && ad.llIllIIllIlI(tileObject.getWorldLocation().distanceTo(new WorldPoint(lllllllIl[139], lllllllIl[231], lllllllIl[3])), lllllllIl[3])) {
                    n2 = lllllllIl[1];
                    0;
                    
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
                0;
                Time.sleepUntil(() -> {
                    boolean bl;
                    if (ad.llIllIIlIllI(Skills.getExperience((Skill)Skill.AGILITY), lIIllllllIllI)) {
                        bl = lllllllIl[1];
                        0;
                        if ((0x5C ^ 0x58) < 0) {
                            return false;
                        }
                    } else {
                        bl = lllllllIl[0];
                    }
                    return bl;
                }, (int)lllllllIl[104]);
                0;
                Time.sleepTicks((int)lllllllIl[1]);
                0;
            }
            if (ad.llIllIIlIIlI(ad.dY() ? 1 : 0)) {
                return;
            }
            if (ad.llIllIIlIIlI(lIIllllllllIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && ad.llIllIIlIlIl(lIIllllllIlll = TileObjects.getNearest(tileObject -> {
                int n2;
                if (ad.llIllIIlIIlI(tileObject.getName().contains(lllllllII[lllllllIl[227]]) ? 1 : 0) && ad.llIllIIllIlI(tileObject.getWorldLocation().distanceTo(new WorldPoint(lllllllIl[228], lllllllIl[229], lllllllIl[10])), lllllllIl[3])) {
                    n2 = lllllllIl[1];
                    0;
                    
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
                0;
                Time.sleepUntil(() -> {
                    boolean bl;
                    if (ad.llIllIIlIllI(Skills.getExperience((Skill)Skill.AGILITY), lIIllllllIllI)) {
                        bl = lllllllIl[1];
                        0;
                        if ((0x6A ^ 0x11 ^ 79 + 116 - 117 + 49) == ((1 ^ (0x7D ^ 0x33)) & (16 + 167 - 46 + 112 ^ 32 + 42 - -60 + 48 ^ -1))) {
                            return ((138 + 72 - 71 + 8 ^ 106 + 130 - 170 + 122) & (0xB0 ^ 0xBE ^ (0x15 ^ 0x34) ^ -1)) != 0;
                        }
                    } else {
                        bl = lllllllIl[0];
                    }
                    return bl;
                }, (int)lllllllIl[104]);
                0;
                Time.sleepTicks((int)lllllllIl[1]);
                0;
            }
            if (ad.llIllIIlIIlI(ad.dY() ? 1 : 0)) {
                return;
            }
            if (ad.llIllIIlIIlI(lIIllllllllII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && ad.llIllIIlIlIl(lIIllllllIlll = TileObjects.getNearest(tileObject -> {
                int n2;
                if (ad.llIllIIlIIlI(tileObject.getName().contains(lllllllII[lllllllIl[226]]) ? 1 : 0) && ad.llIllIIllIlI(tileObject.getWorldLocation().distanceTo(new WorldPoint(lllllllIl[9], lllllllIl[130], lllllllIl[3])), lllllllIl[3])) {
                    n2 = lllllllIl[1];
                    0;
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
                0;
                Time.sleepUntil(() -> {
                    boolean bl;
                    if (ad.llIllIIlIllI(Skills.getExperience((Skill)Skill.AGILITY), lIIllllllIllI)) {
                        bl = lllllllIl[1];
                        0;
                        if (-3 >= 0) {
                            return ((0x15 ^ 0x61 ^ (0xD5 ^ 0xC2)) & (0x19 ^ 0x37 ^ (0x7B ^ 0x36) ^ -1)) != 0;
                        }
                    } else {
                        bl = lllllllIl[0];
                    }
                    return bl;
                }, (int)lllllllIl[104]);
                0;
                Time.sleepTicks((int)lllllllIl[1]);
                0;
            }
            if (ad.llIllIIlIIlI(ad.dY() ? 1 : 0)) {
                return;
            }
            if (ad.llIllIIlIIlI(lIIlllllllIll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && ad.llIllIIlIlIl(lIIllllllIlll = TileObjects.getNearest(tileObject -> {
                int n2;
                if (ad.llIllIIlIIlI(tileObject.getName().contains(lllllllII[lllllllIl[224]]) ? 1 : 0) && ad.llIllIIllIlI(tileObject.getWorldLocation().distanceTo(new WorldPoint(lllllllIl[225], lllllllIl[215], lllllllIl[10])), lllllllIl[3])) {
                    n2 = lllllllIl[1];
                    0;
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
                0;
                Time.sleepUntil(() -> {
                    boolean bl;
                    if (ad.llIllIIlIllI(Skills.getExperience((Skill)Skill.AGILITY), lIIllllllIllI)) {
                        bl = lllllllIl[1];
                        0;
                        if (-(0x90 ^ 0x94) > 0) {
                            return false;
                        }
                    } else {
                        bl = lllllllIl[0];
                    }
                    return bl;
                }, (int)lllllllIl[104]);
                0;
                Time.sleepTicks((int)lllllllIl[1]);
                0;
            }
            if (ad.llIllIIlIIlI(ad.dY() ? 1 : 0)) {
                return;
            }
            if (ad.llIllIIlIIlI(lIIlllllllIlI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && ad.llIllIIlIlIl(lIIllllllIlll = TileObjects.getNearest(tileObject -> {
                int n2;
                if (ad.llIllIIlIIlI(tileObject.getName().contains(lllllllII[lllllllIl[221]]) ? 1 : 0) && ad.llIllIIllIlI(tileObject.getWorldLocation().distanceTo(new WorldPoint(lllllllIl[222], lllllllIl[223], lllllllIl[3])), lllllllIl[3])) {
                    n2 = lllllllIl[1];
                    0;
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
                0;
                Time.sleepUntil(() -> {
                    boolean bl;
                    if (ad.llIllIIlIllI(Skills.getExperience((Skill)Skill.AGILITY), lIIllllllIllI)) {
                        bl = lllllllIl[1];
                        0;
                        if (1 > 3) {
                            return false;
                        }
                    } else {
                        bl = lllllllIl[0];
                    }
                    return bl;
                }, (int)lllllllIl[104]);
                0;
                Time.sleepTicks((int)lllllllIl[1]);
                0;
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
            0;
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
                0;
            }
            if (ad.llIllIIlIIlI(lIlIIIIllIllI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderGWD.c = lllllllII[lllllllIl[53]];
                String[] stringArray = new String[lllllllIl[1]];
                stringArray[ad.lllllllIl[0]] = lllllllII[lllllllIl[38]];
                TileObjects.getNearest((String[])stringArray).interact(lllllllII[lllllllIl[65]]);
                Time.sleepTicks((int)lllllllIl[3]);
                0;
            }
            if (ad.llIllIIlIIlI(lIlIIIIllIlIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderGWD.c = lllllllII[lllllllIl[66]];
                String[] stringArray = new String[lllllllIl[1]];
                stringArray[ad.lllllllIl[0]] = lllllllII[lllllllIl[54]];
                TileObjects.getNearest((String[])stringArray).interact(lllllllII[lllllllIl[67]]);
                Time.sleepTicks((int)lllllllIl[3]);
                0;
            }
            if (ad.llIllIIlIIlI(lIlIIIIllIlII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderGWD.c = lllllllII[lllllllIl[40]];
                String[] stringArray = new String[lllllllIl[1]];
                stringArray[ad.lllllllIl[0]] = lllllllII[lllllllIl[68]];
                TileObjects.getNearest((String[])stringArray).interact(lllllllII[lllllllIl[61]]);
                Time.sleepTicks((int)lllllllIl[2]);
                0;
            }
            if (ad.llIllIIlIIlI(lIlIIIIllIIll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderGWD.c = lllllllII[lllllllIl[69]];
                String[] stringArray = new String[lllllllIl[1]];
                stringArray[ad.lllllllIl[0]] = lllllllII[lllllllIl[70]];
                TileObjects.getNearest((String[])stringArray).interact(lllllllII[lllllllIl[41]]);
                Time.sleepTicks((int)lllllllIl[17]);
                0;
            }
            if (ad.llIllIIlIIlI(lIlIIIIllIIlI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderGWD.c = lllllllII[lllllllIl[71]];
                String[] stringArray = new String[lllllllIl[1]];
                stringArray[ad.lllllllIl[0]] = lllllllII[lllllllIl[72]];
                TileObjects.getNearest((String[])stringArray).interact(lllllllII[lllllllIl[73]]);
                Time.sleepTicks((int)lllllllIl[10]);
                0;
            }
            if (ad.llIllIIlIIlI(lIlIIIIllIIIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderGWD.c = lllllllII[lllllllIl[74]];
                String[] stringArray = new String[lllllllIl[1]];
                stringArray[ad.lllllllIl[0]] = lllllllII[lllllllIl[42]];
                TileObjects.getNearest((String[])stringArray).interact(lllllllII[lllllllIl[75]]);
                Time.sleepTicks((int)lllllllIl[17]);
                0;
            }
        }
    }

    private static void llIllIIIlIll() {
        lllllllII = new String[lllllllIl[238]];
        ad.lllllllII[ad.lllllllIl[0]] = ad."Buying items";
        ad.lllllllII[ad.lllllllIl[1]] = ad."Finished buying items, switching back to agility";
        ad.lllllllII[ad.lllllllIl[3]] = ad."Navigating to bank";
        ad.lllllllII[ad.lllllllIl[10]] = ad."Handling banking";
        ad.lllllllII[ad.lllllllIl[17]] = ad."We are missing quest supplies, switching to BUYING";
        ad.lllllllII[ad.lllllllIl[2]] = ad."Vial";
        ad.lllllllII[ad.lllllllIl[20]] = ad."Vial";
        ad.lllllllII[ad.lllllllIl[22]] = ad."Drop";
        ad.lllllllII[ad.lllllllIl[24]] = ad."Drink";
        ad.lllllllII[ad.lllllllIl[26]] = ad."Eat";
        ad.lllllllII[ad.lllllllIl[12]] = ad."Nav to gnome course";
        ad.lllllllII[ad.lllllllIl[49]] = ad."Crossing log";
        ad.lllllllII[ad.lllllllIl[63]] = ad."Log balance";
        ad.lllllllII[ad.lllllllIl[64]] = ad."Walk-across";
        ad.lllllllII[ad.lllllllIl[53]] = ad."Climbing net";
        ad.lllllllII[ad.lllllllIl[38]] = ad."Obstacle net";
        ad.lllllllII[ad.lllllllIl[65]] = ad."Climb-over";
        ad.lllllllII[ad.lllllllIl[66]] = ad."Climbing branch";
        ad.lllllllII[ad.lllllllIl[54]] = ad."Tree branch";
        ad.lllllllII[ad.lllllllIl[67]] = ad."Climb";
        ad.lllllllII[ad.lllllllIl[40]] = ad."Crossing rope";
        ad.lllllllII[ad.lllllllIl[68]] = ad."Balancing rope";
        ad.lllllllII[ad.lllllllIl[61]] = ad."Walk-on";
        ad.lllllllII[ad.lllllllIl[69]] = ad."Climbing down";
        ad.lllllllII[ad.lllllllIl[70]] = ad."Tree branch";
        ad.lllllllII[ad.lllllllIl[41]] = ad."Climb-down";
        ad.lllllllII[ad.lllllllIl[71]] = ad."Climbing net";
        ad.lllllllII[ad.lllllllIl[72]] = ad."Obstacle net";
        ad.lllllllII[ad.lllllllIl[73]] = ad."Climb-over";
        ad.lllllllII[ad.lllllllIl[74]] = ad."Crossing pipe";
        ad.lllllllII[ad.lllllllIl[42]] = ad."Obstacle pipe";
        ad.lllllllII[ad.lllllllIl[75]] = ad."Squeeze-through";
        ad.lllllllII[ad.lllllllIl[95]] = ad."Nav to start";
        ad.lllllllII[ad.lllllllIl[97]] = ad."Mark of grace";
        ad.lllllllII[ad.lllllllIl[98]] = ad."Taking mark";
        ad.lllllllII[ad.lllllllIl[99]] = ad."Found mark on ground";
        ad.lllllllII[ad.lllllllIl[100]] = ad."Take";
        ad.lllllllII[ad.lllllllIl[101]] = ad."Starting course";
        ad.lllllllII[ad.lllllllIl[102]] = ad."Rough wall";
        ad.lllllllII[ad.lllllllIl[103]] = ad."Climb";
        ad.lllllllII[ad.lllllllIl[37]] = ad."Crossing clothes line";
        ad.lllllllII[ad.lllllllIl[105]] = ad."Clothes line";
        ad.lllllllII[ad.lllllllIl[106]] = ad."Cross";
        ad.lllllllII[ad.lllllllIl[107]] = ad."Leaping";
        ad.lllllllII[ad.lllllllIl[108]] = ad."Gap";
        ad.lllllllII[ad.lllllllIl[109]] = ad."Leap";
        ad.lllllllII[ad.lllllllIl[110]] = ad."Balancing";
        ad.lllllllII[ad.lllllllIl[111]] = ad."Wall";
        ad.lllllllII[ad.lllllllIl[112]] = ad."Balance";
        ad.lllllllII[ad.lllllllIl[113]] = ad."Jumping gap";
        ad.lllllllII[ad.lllllllIl[39]] = ad."Gap";
        ad.lllllllII[ad.lllllllIl[7]] = ad."Leap";
        ad.lllllllII[ad.lllllllIl[114]] = ad."Jumping gap 2";
        ad.lllllllII[ad.lllllllIl[116]] = ad."Leap";
        ad.lllllllII[ad.lllllllIl[117]] = ad."Jumping gap 3";
        ad.lllllllII[ad.lllllllIl[119]] = ad."Leap";
        ad.lllllllII[ad.lllllllIl[120]] = ad."Hurdle roof";
        ad.lllllllII[ad.lllllllIl[122]] = ad."Hurdle";
        ad.lllllllII[ad.lllllllIl[123]] = ad."Finishing course";
        ad.lllllllII[ad.lllllllIl[124]] = ad."Edge";
        ad.lllllllII[ad.lllllllIl[44]] = ad."Jump-off";
        ad.lllllllII[ad.lllllllIl[140]] = ad."Nav to canafis course";
        ad.lllllllII[ad.lllllllIl[6]] = ad."Nav to start";
        ad.lllllllII[ad.lllllllIl[141]] = ad."Starting course";
        ad.lllllllII[ad.lllllllIl[142]] = ad."Tall tree";
        ad.lllllllII[ad.lllllllIl[143]] = ad."Climb";
        ad.lllllllII[ad.lllllllIl[144]] = ad."Mark of grace";
        ad.lllllllII[ad.lllllllIl[145]] = ad."Taking mark";
        ad.lllllllII[ad.lllllllIl[146]] = ad."Found mark on ground";
        ad.lllllllII[ad.lllllllIl[147]] = ad."Take";
        ad.lllllllII[ad.lllllllIl[148]] = ad."Jumping gap 1";
        ad.lllllllII[ad.lllllllIl[149]] = ad."Jump";
        ad.lllllllII[ad.lllllllIl[150]] = ad."Jumping gap 2";
        ad.lllllllII[ad.lllllllIl[151]] = ad."Jump";
        ad.lllllllII[ad.lllllllIl[152]] = ad."Jumping gap 3";
        ad.lllllllII[ad.lllllllIl[153]] = ad."Jump";
        ad.lllllllII[ad.lllllllIl[154]] = ad."Jumping gap 4";
        ad.lllllllII[ad.lllllllIl[155]] = ad."Jump";
        ad.lllllllII[ad.lllllllIl[156]] = ad."Vaulting";
        ad.lllllllII[ad.lllllllIl[157]] = ad."Vault";
        ad.lllllllII[ad.lllllllIl[158]] = ad."Jumping gap 5";
        ad.lllllllII[ad.lllllllIl[159]] = ad."Jump";
        ad.lllllllII[ad.lllllllIl[160]] = ad."Jumping gap 6";
        ad.lllllllII[ad.lllllllIl[161]] = ad."Jump";
        ad.lllllllII[ad.lllllllIl[172]] = ad."Nav to canafis course";
        ad.lllllllII[ad.lllllllIl[173]] = ad."Nav to start";
        ad.lllllllII[ad.lllllllIl[174]] = ad."Starting course";
        ad.lllllllII[ad.lllllllIl[175]] = ad."Wall";
        ad.lllllllII[ad.lllllllIl[35]] = ad."Climb-up";
        ad.lllllllII[ad.lllllllIl[176]] = ad."Mark of grace";
        ad.lllllllII[ad.lllllllIl[177]] = ad."Taking mark";
        ad.lllllllII[ad.lllllllIl[178]] = ad."Found mark on ground";
        ad.lllllllII[ad.lllllllIl[179]] = ad."Take";
        ad.lllllllII[ad.lllllllIl[180]] = ad."Jumping gap 1";
        ad.lllllllII[ad.lllllllIl[79]] = ad."Jump";
        ad.lllllllII[ad.lllllllIl[181]] = ad."cross rope";
        ad.lllllllII[ad.lllllllIl[182]] = ad."Cross";
        ad.lllllllII[ad.lllllllIl[183]] = ad."Jumping gap 3";
        ad.lllllllII[ad.lllllllIl[184]] = ad."Jump";
        ad.lllllllII[ad.lllllllIl[185]] = ad."Jumping gap 4";
        ad.lllllllII[ad.lllllllIl[186]] = ad."Jump";
        ad.lllllllII[ad.lllllllIl[187]] = ad."Jumping Edge";
        ad.lllllllII[ad.lllllllIl[188]] = ad."Jump";
        ad.lllllllII[ad.lllllllIl[194]] = ad."Found mark on ground";
        ad.lllllllII[ad.lllllllIl[203]] = ad."Agility";
        ad.lllllllII[ad.lllllllIl[204]] = ad."passage";
        ad.lllllllII[ad.lllllllIl[205]] = ad."passage";
        ad.lllllllII[ad.lllllllIl[206]] = ad."passage";
        ad.lllllllII[ad.lllllllIl[207]] = ad."passage";
        ad.lllllllII[ad.lllllllIl[208]] = ad."Edge";
        ad.lllllllII[ad.lllllllIl[211]] = ad."Gap";
        ad.lllllllII[ad.lllllllIl[213]] = ad."Gap";
        ad.lllllllII[ad.lllllllIl[216]] = ad."Tightrope";
        ad.lllllllII[ad.lllllllIl[218]] = ad."Gap";
        ad.lllllllII[ad.lllllllIl[221]] = ad."Gap";
        ad.lllllllII[ad.lllllllIl[224]] = ad."Gap";
        ad.lllllllII[ad.lllllllIl[226]] = ad."Pole-vault";
        ad.lllllllII[ad.lllllllIl[227]] = ad."Gap";
        ad.lllllllII[ad.lllllllIl[230]] = ad."Gap";
        ad.lllllllII[ad.lllllllIl[232]] = ad."Gap";
        ad.lllllllII[ad.lllllllIl[233]] = ad."Gap";
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

    private static String llIllIIIlIII(String lIIllIIllIlll, String lIIllIIllIlII) {
        try {
            SecretKeySpec lIIllIIlllIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIIllIIllIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIIllIIlllIIl = Cipher.getInstance("Blowfish");
            lIIllIIlllIIl.init(lllllllIl[3], lIIllIIlllIlI);
            return new String(lIIllIIlllIIl.doFinal(Base64.getDecoder().decode(lIIllIIllIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIIllIIlllIII) {
            lIIllIIlllIII.printStackTrace();
            return null;
        }
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
                            0;
                            Time.sleepTicks((int)lllllllIl[1]);
                            0;
                        }
                    }
                    a.a(lIlIIIlIIIIlI);
                }
                if (ad.llIllIIlIlIl(lIlIIIlIIIIlI) && ad.llIllIIlIIlI(lIlIIIlIIIIlI.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderGWD.c = lllllllII[lllllllIl[10]];
                    if (ad.llIllIIlIlII(Bank.isOpen() ? 1 : 0)) {
                        a.a();
                        Time.sleepUntil(() -> Bank.isOpen(), (int)lllllllIl[11]);
                        0;
                    }
                    if (ad.llIllIIlIIlI(Bank.isOpen() ? 1 : 0)) {
                        if (ad.llIllIIlIlll(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks((int)lllllllIl[1]);
                            0;
                        }
                        if (ad.llIllIIlIlll(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks((int)lllllllIl[3]);
                            0;
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
                        0;
                        e.l(lllllllIl[34]);
                        e.l(lllllllIl[36]);
                        e.l(lllllllIl[33]);
                        e.l(lllllllIl[35]);
                        e.l(lllllllIl[18]);
                        Time.sleepTicks((int)lllllllIl[10]);
                        0;
                        if (ad.llIllIIlIlII(Bank.isOpen() ? 1 : 0)) {
                            a.a();
                            Time.sleepTicks((int)lllllllIl[20]);
                            0;
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
                    0;
                }
                if (ad.llIllIIlIllI(Combat.getMissingHealth(), lllllllIl[40])) {
                    int[] nArray = new int[lllllllIl[1]];
                    nArray[ad.lllllllIl[0]] = lllllllIl[23];
                    if (ad.llIllIIlIIlI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        int[] nArray6 = new int[lllllllIl[1]];
                        nArray6[ad.lllllllIl[0]] = lllllllIl[23];
                        Inventory.getFirst((int[])nArray6).interact(lllllllII[lllllllIl[26]]);
                        Time.sleepTicks((int)lllllllIl[3]);
                        0;
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
            0;
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

    private static void llIllIIlIIIl() {
        lllllllIl = new int[239];
        ad.lllllllIl[0] = (6 ^ 0x4E ^ (0x29 ^ 0x4E)) & (0x39 ^ 0x23 ^ (0x61 ^ 0x54) ^ -1);
        ad.lllllllIl[1] = 1;
        ad.lllllllIl[2] = 0xC5 ^ 0xC0;
        ad.lllllllIl[3] = 2;
        ad.lllllllIl[4] = -(0xFFFFF2F9 & 0x7D4F) & (0xFFFFFFCF & 0x7DFF);
        ad.lllllllIl[5] = -(0xFFFFFA7F & 0x77FB) & (0xFFFFFFFF & Short.MAX_VALUE);
        ad.lllllllIl[6] = 0x91 ^ 0xAF;
        ad.lllllllIl[7] = 105 + 110 - 63 + 9 ^ 33 + 97 - 57 + 73;
        ad.lllllllIl[8] = -(0xFFFFF87F & 0x3787) & (0xFFFFBDFE & 0x7FBF);
        ad.lllllllIl[9] = -(0xFFFFFD75 & 0x22AB) & (0xFFFFBFFB & 0x6DBC);
        ad.lllllllIl[10] = 3;
        ad.lllllllIl[11] = -(0xFFFFAAF5 & 0x7D6F) & (0xFFFFBFED & 0x7BFE);
        ad.lllllllIl[12] = 83 + 152 - 99 + 23 ^ 62 + 21 - 43 + 109;
        ad.lllllllIl[13] = -(0xFFFFE8B9 & 0x375F) & (0xFFFFBF7F & 0x7FDF);
        ad.lllllllIl[14] = -(0xFFFFE29F & 0x3D73) & (0xFFFFFFFE & 0x3F5B);
        ad.lllllllIl[15] = 0xFFFFBF7B & 0x5FCD;
        ad.lllllllIl[16] = 0xFFFFFFCD & 0xF3F;
        ad.lllllllIl[17] = 0xAC ^ 0xA8;
        ad.lllllllIl[18] = -(0xFFFFE1A7 & 0x5F7C) & (0xFFFFFFFF & 0x6FEF);
        ad.lllllllIl[19] = -(0xFFFFE699 & 0x5DEF) & (0xFFFFF7D9 & 0x7DFF);
        ad.lllllllIl[20] = 0xC1 ^ 0xC7;
        ad.lllllllIl[21] = 0xFFFFFF4B & 0x1FFE;
        ad.lllllllIl[22] = 0xB ^ 0xC;
        ad.lllllllIl[23] = -(0xFFFFD5BB & 0x3E77) & (0xFFFFFFBF & 0x15F3);
        ad.lllllllIl[24] = 0xB8 ^ 0xAF ^ (0x42 ^ 0x5D);
        ad.lllllllIl[25] = 0xFFFFDFF7 & 0x6CAB;
        ad.lllllllIl[26] = 0x10 ^ 0x19;
        ad.lllllllIl[27] = 0xFFFFF79B & 0x5AFE;
        ad.lllllllIl[28] = -(0xFFFF9BA7 & 0x757C) & (0xFFFFBFFF & 0x7F77);
        ad.lllllllIl[29] = 0xFFFFBFD0 & 0x6E7F;
        ad.lllllllIl[30] = 0xFFFFFE4E & 0x2FFF;
        ad.lllllllIl[31] = 0xFFFFFF4D & 0x2EFE;
        ad.lllllllIl[32] = -(0xFFFFADFA & 0x532F) & (0xFFFFEF7B & 0x3FFF);
        ad.lllllllIl[33] = 0xFFFFAEDE & 0x7F6B;
        ad.lllllllIl[34] = 0xFFFFFEDD & 0x2FE2;
        ad.lllllllIl[35] = 178 + 125 - 230 + 130 ^ 53 + 32 - -58 + 4;
        ad.lllllllIl[36] = -(0xFFFFF07F & 0x1FA1) & (0xFFFFFF3B & 0x5FEF);
        ad.lllllllIl[37] = 0x56 ^ 0x7E;
        ad.lllllllIl[38] = 0x70 ^ 0x7F;
        ad.lllllllIl[39] = 0x9A ^ 0xA8;
        ad.lllllllIl[40] = 0xA4 ^ 0xB0;
        ad.lllllllIl[41] = 0x67 ^ 0x7E;
        ad.lllllllIl[42] = 0x39 ^ 0x27;
        ad.lllllllIl[43] = -(0xFFFFDF4B & 0x78F6) & (0xFFFFD9EF & 0x7F7F);
        ad.lllllllIl[44] = 0xFE ^ 0xC2;
        ad.lllllllIl[45] = 0xFFFFCF3B & 0x31F7;
        ad.lllllllIl[46] = -(0xFFFFE4A7 & 0x7F5B) & (0xFFFFEDAF & 0x7FF7);
        ad.lllllllIl[47] = -(0xFFFFC7FD & 0x7817) & (0xFFFFEF7F & 0x5DFF);
        ad.lllllllIl[48] = -(0xFFFFEB8D & 0x36F6) & (0xFFFFEFFF & 0x3FE3);
        ad.lllllllIl[49] = 0xCD ^ 0xC6;
        ad.lllllllIl[50] = 0xFFFFBFDD & 0x4D7F;
        ad.lllllllIl[51] = -(0xFFFFDFA7 & 0x665F) & (0xFFFFEFAF & 0x5FF7);
        ad.lllllllIl[52] = -(0xFFFFEFB9 & 0x70EF) & (0xFFFFEFFF & 0x7DFF);
        ad.lllllllIl[53] = 3 ^ (0xA5 ^ 0xA8);
        ad.lllllllIl[54] = 0x2A ^ 0x38;
        ad.lllllllIl[55] = -(0xFFFFD781 & 0x6E7F) & (0xFFFFDFF3 & 0x6FBF);
        ad.lllllllIl[56] = 0xFFFFEDFC & 0x1F5B;
        ad.lllllllIl[57] = -(0xFFFFFC7F & 0x77CA) & (0xFFFFFFFF & 0x7DFB);
        ad.lllllllIl[58] = -(0xFFFFBEDF & 0x63A5) & (0xFFFFFFFD & 0x2FDF);
        ad.lllllllIl[59] = -(0xFFFFBF5B & 0x52ED) & (0xFFFFDFFB & 0x3BFD);
        ad.lllllllIl[60] = -(0xFFFFFB7D & 0x348F) & (0xFFFFFF7F & 0x3DEF);
        ad.lllllllIl[61] = 0x61 ^ 0x77;
        ad.lllllllIl[62] = -1;
        ad.lllllllIl[63] = 77 + 102 - 88 + 41 ^ 133 + 47 - 56 + 12;
        ad.lllllllIl[64] = 0x92 ^ 0x9F;
        ad.lllllllIl[65] = 7 + 94 - 34 + 68 ^ 59 + 125 - 170 + 137;
        ad.lllllllIl[66] = 179 + 73 - 182 + 140 ^ 142 + 177 - 163 + 39;
        ad.lllllllIl[67] = 13 + 136 - 66 + 62 ^ 86 + 127 - 108 + 25;
        ad.lllllllIl[68] = 0x28 ^ 0x3D;
        ad.lllllllIl[69] = 0x52 ^ 0x45;
        ad.lllllllIl[70] = 0x72 ^ 0x6A;
        ad.lllllllIl[71] = 0x11 ^ 0xB;
        ad.lllllllIl[72] = 0x6B ^ 0x48 ^ (0x83 ^ 0xBB);
        ad.lllllllIl[73] = 0x72 ^ 0x6E ^ (0x7B ^ 0x7C) & ~(0x5F ^ 0x58);
        ad.lllllllIl[74] = 0x3A ^ 0x27;
        ad.lllllllIl[75] = 0xB3 ^ 0xAC;
        ad.lllllllIl[76] = 0xFFFF8E5F & 0x7DFF;
        ad.lllllllIl[77] = -(0xFFFFABEA & 0x761F) & (0xFFFFBF9F & 0x6F7F);
        ad.lllllllIl[78] = (0x27 ^ 0x60) + (0xA6 ^ 0xAE) - -(0xBE ^ 0xB2) + (0x23 ^ 0xD);
        ad.lllllllIl[79] = 0x38 ^ 6 ^ (0xF1 ^ 0x91);
        ad.lllllllIl[80] = -(0xFFFFF727 & 0x7BFD) & (0xFFFFFFF7 & 0x7FBF);
        ad.lllllllIl[81] = -(0xFFFFE9EF & 0x76BF) & (0xFFFFEDFF & Short.MAX_VALUE);
        ad.lllllllIl[82] = 0xFFFF9EEC & 0x6D9F;
        ad.lllllllIl[83] = 0xFFFFCE7F & 0x3DFE;
        ad.lllllllIl[84] = -(35 + 63 - -2 + 30) & (0xFFFFFDFF & 0xFD5);
        ad.lllllllIl[85] = 0xFFFFCF76 & 0x3CFF;
        ad.lllllllIl[86] = -(0xFFFFCE79 & 0x33A7) & (0xFFFFEFFF & 0x1F75);
        ad.lllllllIl[87] = 0xFFFFBF5B & 0x4DED;
        ad.lllllllIl[88] = 0xFFFF9E6F & 0x6DFB;
        ad.lllllllIl[89] = 0xFFFF9FF6 & 0x6D3F;
        ad.lllllllIl[90] = 0xFFFFDD9B & 0x2EF5;
        ad.lllllllIl[91] = 0xFFFFEFF4 & 0x1D4B;
        ad.lllllllIl[92] = -(0xFFFFFF5D & 0x73A3) & (0xFFFFFFAB & 0x7FF6);
        ad.lllllllIl[93] = -(0xFFFFE7B7 & 0x1A4E) & (0xFFFFDF6F & 0x2FDF);
        ad.lllllllIl[94] = -(0xFFFFE29F & 0x5FE9) & (0xFFFFFFFA & 0x4FDF);
        ad.lllllllIl[95] = 0x13 ^ 0x33;
        ad.lllllllIl[96] = -(0xFFFFFBF7 & 0x356A) & (0xFFFFBFFD & 0x7DFB);
        ad.lllllllIl[97] = 0xAE ^ 0xB2 ^ (0x43 ^ 0x7E);
        ad.lllllllIl[98] = 6 ^ 0x72 ^ (0xD8 ^ 0x8E);
        ad.lllllllIl[99] = 41 + 115 - 53 + 39 ^ 46 + 64 - 90 + 153;
        ad.lllllllIl[100] = 45 + 95 - 85 + 110 ^ 49 + 66 - 6 + 20;
        ad.lllllllIl[101] = 0x14 ^ 0x31;
        ad.lllllllIl[102] = 11 + 177 - 171 + 212 ^ 163 + 119 - 256 + 169;
        ad.lllllllIl[103] = 0x25 ^ 2;
        ad.lllllllIl[104] = 0xFFFFB5BE & 0x6B75;
        ad.lllllllIl[105] = 0xF3 ^ 0xBC ^ (0x52 ^ 0x34);
        ad.lllllllIl[106] = 166 + 37 - 46 + 12 ^ 73 + 105 - 148 + 101;
        ad.lllllllIl[107] = 0x4B ^ 0x60;
        ad.lllllllIl[108] = 0x51 ^ 0x7D;
        ad.lllllllIl[109] = 0xC6 ^ 0x91 ^ (0x10 ^ 0x6A);
        ad.lllllllIl[110] = 0xA ^ 0x24;
        ad.lllllllIl[111] = 0x8F ^ 0xA0;
        ad.lllllllIl[112] = 0x66 ^ 0x56;
        ad.lllllllIl[113] = 4 ^ 0x35;
        ad.lllllllIl[114] = 0xBF ^ 0x8B;
        ad.lllllllIl[115] = 0xFFFFFBFA & 0x3DF7;
        ad.lllllllIl[116] = 0x42 ^ 0x77;
        ad.lllllllIl[117] = 0x82 ^ 0xB4;
        ad.lllllllIl[118] = 0xFFFFF9F7 & 0x3FFB;
        ad.lllllllIl[119] = 0x57 ^ 0x60;
        ad.lllllllIl[120] = 0x29 ^ 0x11;
        ad.lllllllIl[121] = -(0xFFFFD553 & 0x6AAE) & (0xFFFFFDFF & 0x7BF5);
        ad.lllllllIl[122] = 0x97 ^ 0xAE;
        ad.lllllllIl[123] = 0x20 ^ 0x1A;
        ad.lllllllIl[124] = 0x10 ^ 0x1E ^ (0x87 ^ 0xB2);
        ad.lllllllIl[125] = -(0xFFFFB261 & 0x5FFF) & (0xFFFFFFEF & 0x1FFF);
        ad.lllllllIl[126] = 0xFFFFFF9B & 0xDEE;
        ad.lllllllIl[127] = 0xFFFF9DEF & 0x6FBE;
        ad.lllllllIl[128] = -(0xFFFFF45E & 0x7BEF) & (0xFFFFFDEF & Short.MAX_VALUE);
        ad.lllllllIl[129] = 0xFFFF9DE7 & 0x6FBF;
        ad.lllllllIl[130] = -(0xFFFFF36B & 0x7CF5) & (0xFFFFFFFF & 0x7DFB);
        ad.lllllllIl[131] = -(0xFFFFFFC7 & 0x323D) & (0xFFFFBFBF & 0x7FED);
        ad.lllllllIl[132] = -(0xFFFFEBA7 & 0x567E) & (0xFFFFCFB7 & 0x7FFD);
        ad.lllllllIl[133] = -(0xFFFFB69D & 0x7B6F) & (0xFFFFFFED & 0x3FBF);
        ad.lllllllIl[134] = -(0xFFFFE6EF & 0x7B19) & (0xFFFFEFDF & 0x7FBB);
        ad.lllllllIl[135] = -(0xFFFFFFF7 & 0x526B) & (0xFFFFDFFF & Short.MAX_VALUE);
        ad.lllllllIl[136] = 0xFFFF9FFF & 0x6D8B;
        ad.lllllllIl[137] = -(0xFFFFFB17 & 0x16E9) & (0xFFFFFFFA & 0x1FB7);
        ad.lllllllIl[138] = -(0xFFFFEBCF & 0x567F) & (0xFFFFDFDF & 0x6FFF);
        ad.lllllllIl[139] = -(0xFFFFE2F1 & 0x3F4F) & (0xFFFFBFDE & 0x6FFF);
        ad.lllllllIl[140] = 0x23 ^ 0x49 ^ (0x59 ^ 0xE);
        ad.lllllllIl[141] = 0x4B ^ 0x74;
        ad.lllllllIl[142] = 0x11 ^ 0x51;
        ad.lllllllIl[143] = 0xE2 ^ 0xA3;
        ad.lllllllIl[144] = 155 + 137 - 134 + 51 ^ 90 + 109 - 130 + 78;
        ad.lllllllIl[145] = 59 + 100 - 39 + 82 ^ 49 + 0 - 7 + 95;
        ad.lllllllIl[146] = 0x52 ^ 0x16;
        ad.lllllllIl[147] = 9 + 23 - -107 + 80 ^ 70 + 66 - 129 + 151;
        ad.lllllllIl[148] = 0x86 ^ 0xC0;
        ad.lllllllIl[149] = 0x4F ^ 8;
        ad.lllllllIl[150] = 0x3A ^ 0x5C ^ (0x30 ^ 0x1E);
        ad.lllllllIl[151] = 0x38 ^ 0x71;
        ad.lllllllIl[152] = 0x56 ^ 0x1C;
        ad.lllllllIl[153] = 0x5E ^ 0x15;
        ad.lllllllIl[154] = 0xE5 ^ 0xA9;
        ad.lllllllIl[155] = 0xC7 ^ 0x8A;
        ad.lllllllIl[156] = 72 + 191 - 78 + 60 ^ 57 + 156 - 85 + 59;
        ad.lllllllIl[157] = 0x48 ^ 0x7F ^ (0xEB ^ 0x93);
        ad.lllllllIl[158] = 0xF3 ^ 0xA3;
        ad.lllllllIl[159] = 0x78 ^ 0x29;
        ad.lllllllIl[160] = 0x43 ^ 0x11;
        ad.lllllllIl[161] = 0x1D ^ 5 ^ (0xE4 ^ 0xAF);
        ad.lllllllIl[162] = 0xFFFFEBFF & 0x1E7F;
        ad.lllllllIl[163] = 0xFFFFDD7E & 0x2FFF;
        ad.lllllllIl[164] = -(0xFFFFBE6B & 0x55F5) & (0xFFFF9EFF & Short.MAX_VALUE);
        ad.lllllllIl[165] = 0xFFFFAFED & 0x5A9F;
        ad.lllllllIl[166] = -(0xFFFFC59D & 0x7F6B) & (0xFFFFFFDF & 0x4FBB);
        ad.lllllllIl[167] = 0xFFFFFBEB & 0xE9D;
        ad.lllllllIl[168] = 0xFFFFAFD0 & 0x5AAF;
        ad.lllllllIl[169] = -(0xFFFFBB67 & 0x74BF) & (0xFFFFBFF7 & 0x7DAF);
        ad.lllllllIl[170] = -(0xFFFFFF2F & 0x55D1) & (0xFFFFDFED & 0x7FBB);
        ad.lllllllIl[171] = 0xFFFFDFFA & 0x2DA5;
        ad.lllllllIl[172] = 2 ^ 0x56;
        ad.lllllllIl[173] = 0x70 ^ 0x35 ^ (0x4C ^ 0x5C);
        ad.lllllllIl[174] = 0x6B ^ 0x2F ^ (0x4C ^ 0x5E);
        ad.lllllllIl[175] = 0x1E ^ 0x49;
        ad.lllllllIl[176] = 0xF1 ^ 0xA8;
        ad.lllllllIl[177] = 0xCC ^ 0x96;
        ad.lllllllIl[178] = 1 + 41 - -90 + 60 ^ 107 + 2 - 56 + 102;
        ad.lllllllIl[179] = 0x68 ^ 0x34;
        ad.lllllllIl[180] = 210 + 188 - 351 + 180 ^ 7 + 27 - -92 + 64;
        ad.lllllllIl[181] = 0xD4 ^ 0xC6 ^ (0x89 ^ 0xC4);
        ad.lllllllIl[182] = 0x16 ^ 0x76;
        ad.lllllllIl[183] = 0xC ^ 0x3D ^ (0xEA ^ 0xBA);
        ad.lllllllIl[184] = 0xDF ^ 0xAB ^ (0xA9 ^ 0xBF);
        ad.lllllllIl[185] = 0xDD ^ 0xA3 ^ (0xA9 ^ 0xB4);
        ad.lllllllIl[186] = 85 + 93 - 48 + 88 ^ 133 + 34 - 122 + 145;
        ad.lllllllIl[187] = 131 + 29 - 156 + 211 ^ 8 + 109 - 54 + 115;
        ad.lllllllIl[188] = 0x34 ^ 0x52;
        ad.lllllllIl[189] = 0xFFFFCEFF & 0x3D77;
        ad.lllllllIl[190] = 0xFFFFAF76 & 0x5DDF;
        ad.lllllllIl[191] = 0xFFFFBC7E & 0x4FEF;
        ad.lllllllIl[192] = 0xFFFFDDBF & 0x2F7B;
        ad.lllllllIl[193] = 0xFFFFAE49 & Short.MAX_VALUE;
        ad.lllllllIl[194] = 0xDF ^ 0xB8;
        ad.lllllllIl[195] = 0xFFFFDFFF & 0x357C;
        ad.lllllllIl[196] = -(0xFFFFDDD5 & 0x3E3F) & (0xFFFFFFFC & 0x7DBF);
        ad.lllllllIl[197] = -(0xFFFFFE52 & 0x2DFF) & (0xFFFFFFD7 & 0x2FFD);
        ad.lllllllIl[198] = 0xFFFFBBBE & 0x47F7;
        ad.lllllllIl[199] = -(0xFFFFB851 & 0x5FAF) & (0xFFFFFFFF & 0x1F9E);
        ad.lllllllIl[200] = -(0xFFFFBEFA & 0x550F) & (0xFFFFBFFF & 0x76FF);
        ad.lllllllIl[201] = -(0xFFFFF5B9 & 0x4A77) & (0xFFFFFEFF & 0x6FFA);
        ad.lllllllIl[202] = -(0xFFFFA6DA & 0x5BA7) & (0xFFFFFFFF & 0x67DF);
        ad.lllllllIl[203] = 0x4F ^ 0x27;
        ad.lllllllIl[204] = 0xFE ^ 0x97;
        ad.lllllllIl[205] = 0xE6 ^ 0xBB ^ (0x17 ^ 0x20);
        ad.lllllllIl[206] = 0xDB ^ 0x92 ^ (0x30 ^ 0x12);
        ad.lllllllIl[207] = 0xF5 ^ 0x99;
        ad.lllllllIl[208] = 0x46 ^ 0x2B;
        ad.lllllllIl[209] = -(0xFFFFA7D7 & 0x7D79) & (0xFFFFAFDF & Short.MAX_VALUE);
        ad.lllllllIl[210] = -(0xFFFFF73F & 0x7AF3) & (0xFFFFFFBF & 0x7FFB);
        ad.lllllllIl[211] = 0xC7 ^ 0xBD ^ (0x5D ^ 0x49);
        ad.lllllllIl[212] = 0xFFFFAF8F & 0x5DFD;
        ad.lllllllIl[213] = 0x14 ^ 0x7B;
        ad.lllllllIl[214] = 0xFFFFEBF7 & 0x1E9F;
        ad.lllllllIl[215] = -(0xFFFFB67A & 0x7BAF) & (0xFFFFFFBF & 0x3FFD);
        ad.lllllllIl[216] = 142 + 174 - 172 + 37 ^ 157 + 133 - 249 + 156;
        ad.lllllllIl[217] = 0xFFFFAFD6 & 0x5ABF;
        ad.lllllllIl[218] = 0x8A ^ 0xA8 ^ (0x70 ^ 0x23);
        ad.lllllllIl[219] = -(0xFFFFBF7F & 0x44DB) & (0xFFFF8EFB & Short.MAX_VALUE);
        ad.lllllllIl[220] = -(0xFFFFDC7B & 0x73D5) & (0xFFFFDFF7 & 0x7DFD);
        ad.lllllllIl[221] = 0x31 ^ 0x45 ^ (0x86 ^ 0x80);
        ad.lllllllIl[222] = 0xFFFFADF7 & 0x5FBE;
        ad.lllllllIl[223] = -(0xFFFFD32B & 0x3EF7) & (0xFFFFFFBF & 0x1FFE);
        ad.lllllllIl[224] = 0x4E ^ 0x3D;
        ad.lllllllIl[225] = -(0xFFFFF541 & 0x6AFF) & (0xFFFFEDEF & Short.MAX_VALUE);
        ad.lllllllIl[226] = 45 + 129 - -54 + 13 ^ 56 + 117 - 143 + 103;
        ad.lllllllIl[227] = 111 + 42 - 134 + 187 ^ 124 + 12 - 113 + 164;
        ad.lllllllIl[228] = 0xFFFFEDD6 & 0x1FBF;
        ad.lllllllIl[229] = -(0xFFFFCD5B & 0x72E7) & (0xFFFFEFE7 & 0x5DFE);
        ad.lllllllIl[230] = 0xA0 ^ 0xA6 ^ (0xCD ^ 0xBD);
        ad.lllllllIl[231] = -(0xFFFFBEF5 & 0x635F) & (0xFFFFAFFF & Short.MAX_VALUE);
        ad.lllllllIl[232] = 0x92 ^ 0x84 ^ (0x11 ^ 0x70);
        ad.lllllllIl[233] = 0x42 ^ 0x3A;
        ad.lllllllIl[234] = 0xFFFFEFF1 & 0x1DBF;
        ad.lllllllIl[235] = -(0xFFFFB557 & 0x7EAC) & (0xFFFFFFE7 & 0x3DBF);
        ad.lllllllIl[236] = 0xFFFFCDAB & 0x3BFE;
        ad.lllllllIl[237] = 0xFFFFBF6F & 0x4DFD;
        ad.lllllllIl[238] = 0x11 ^ 0x1D ^ (0x67 ^ 0x12);
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
                0;
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
            0;
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
            0;
            Time.sleepTicks((int)lllllllIl[1]);
            0;
        }
        if (ad.llIllIIlIIlI(lIIlllllIlIII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (ad.llIllIIlIllI(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lIIllllIlllll), lllllllIl[20])) {
                AccBuilderGWD.c = lllllllII[lllllllIl[173]];
                Movement.walkTo((WorldPoint)lIIllllIlllll);
                0;
                Time.sleepTicks((int)lllllllIl[1]);
                0;
            }
            if (ad.llIllIIllIlI(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lIIllllIlllll), lllllllIl[20])) {
                AccBuilderGWD.c = lllllllII[lllllllIl[174]];
                int lIIllllIllllI = Skills.getExperience((Skill)Skill.AGILITY);
                String[] stringArray = new String[lllllllIl[1]];
                stringArray[ad.lllllllIl[0]] = lllllllII[lllllllIl[175]];
                TileObjects.getNearest((String[])stringArray).interact(lllllllII[lllllllIl[35]]);
                Time.sleepTicks((int)e.c(lllllllIl[1], lllllllIl[3]));
                0;
                Time.sleepUntil(() -> {
                    boolean bl;
                    if (ad.llIllIIlIllI(Skills.getExperience((Skill)Skill.AGILITY), lIIllllIllllI)) {
                        bl = lllllllIl[1];
                        0;
                        if (2 < 0) {
                            return false;
                        }
                    } else {
                        bl = lllllllIl[0];
                    }
                    return bl;
                }, (int)lllllllIl[104]);
                0;
                Time.sleepTicks((int)lllllllIl[1]);
                0;
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
            0;
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
                    0;
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
                0;
                Time.sleepUntil(() -> {
                    boolean bl;
                    if (ad.llIllIIlIllI(Skills.getExperience((Skill)Skill.AGILITY), lIIllllIlllII)) {
                        bl = lllllllIl[1];
                        0;
                        
                        }
                    } else {
                        bl = lllllllIl[0];
                    }
                    return bl;
                }, (int)lllllllIl[104]);
                0;
                Time.sleepTicks((int)lllllllIl[1]);
                0;
            }
            if (ad.llIllIIlIIlI(ad.dY() ? 1 : 0)) {
                return;
            }
            if (ad.llIllIIlIIlI(lIIlllllIIIll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && ad.llIllIIlIlIl(lIIllllIlllIl = TileObjects.getNearest(tileObject -> {
                int n2;
                if (ad.llIllIIlIIlI(tileObject.getName().contains(lllllllII[lllllllIl[216]]) ? 1 : 0) && ad.llIllIIllIlI(tileObject.getWorldLocation().distanceTo(new WorldPoint(lllllllIl[217], lllllllIl[128], lllllllIl[3])), lllllllIl[3])) {
                    n2 = lllllllIl[1];
                    0;
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
                0;
                Time.sleepUntil(() -> {
                    boolean bl;
                    if (ad.llIllIIlIllI(Skills.getExperience((Skill)Skill.AGILITY), lIIllllIlllII)) {
                        bl = lllllllIl[1];
                        0;
                        if (-3 >= 0) {
                            return ((0x51 ^ 0x20 ^ (0xD5 ^ 0xBC)) & (126 + 142 - 251 + 152 ^ 86 + 136 - 213 + 168 ^ -1)) != 0;
                        }
                    } else {
                        bl = lllllllIl[0];
                    }
                    return bl;
                }, (int)lllllllIl[104]);
                0;
                Time.sleepTicks((int)lllllllIl[1]);
                0;
            }
            if (ad.llIllIIlIIlI(ad.dY() ? 1 : 0)) {
                return;
            }
            if (ad.llIllIIlIIlI(lIIlllllIIIlI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && ad.llIllIIlIlIl(lIIllllIlllIl = TileObjects.getNearest(tileObject -> {
                int n2;
                if (ad.llIllIIlIIlI(tileObject.getName().contains(lllllllII[lllllllIl[213]]) ? 1 : 0) && ad.llIllIIllIlI(tileObject.getWorldLocation().distanceTo(new WorldPoint(lllllllIl[214], lllllllIl[215], lllllllIl[3])), lllllllIl[3])) {
                    n2 = lllllllIl[1];
                    0;
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
                0;
                Time.sleepUntil(() -> {
                    boolean bl;
                    if (ad.llIllIIlIllI(Skills.getExperience((Skill)Skill.AGILITY), lIIllllIlllII)) {
                        bl = lllllllIl[1];
                        0;
                        
                        }
                    } else {
                        bl = lllllllIl[0];
                    }
                    return bl;
                }, (int)lllllllIl[104]);
                0;
                Time.sleepTicks((int)lllllllIl[1]);
                0;
            }
            if (ad.llIllIIlIIlI(ad.dY() ? 1 : 0)) {
                return;
            }
            if (ad.llIllIIlIIlI(lIIlllllIIIIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && ad.llIllIIlIlIl(lIIllllIlllIl = TileObjects.getNearest(tileObject -> {
                int n2;
                if (ad.llIllIIlIIlI(tileObject.getName().contains(lllllllII[lllllllIl[211]]) ? 1 : 0) && ad.llIllIIllIlI(tileObject.getWorldLocation().distanceTo(new WorldPoint(lllllllIl[209], lllllllIl[212], lllllllIl[10])), lllllllIl[3])) {
                    n2 = lllllllIl[1];
                    0;
                    if (-3 >= 0) {
                        return ((0x4E ^ 0x37 ^ (1 ^ 0x27)) & (0xA9 ^ 0xAE ^ (0x42 ^ 0x1A) ^ -1)) != 0;
                    }
                } else {
                    n2 = lllllllIl[0];
                }
                return n2 != 0;
            }))) {
                AccBuilderGWD.c = lllllllII[lllllllIl[185]];
                lIIllllIlllII = Skills.getExperience((Skill)Skill.AGILITY);
                lIIllllIlllIl.interact(lllllllII[lllllllIl[186]]);
                Time.sleepTicks((int)e.c(lllllllIl[1], lllllllIl[3]));
                0;
                Time.sleepUntil(() -> {
                    boolean bl;
                    if (ad.llIllIIlIllI(Skills.getExperience((Skill)Skill.AGILITY), lIIllllIlllII)) {
                        bl = lllllllIl[1];
                        0;
                        if ((0x65 ^ 0x61 ^ (0x63 ^ 0x49) & ~(3 ^ 0x29)) < 0) {
                            return ((0xA4 ^ 0xC6 ^ (0x2A ^ 0x53)) & (71 + 51 - 38 + 55 ^ 19 + 73 - 7 + 59 ^ -1)) != 0;
                        }
                    } else {
                        bl = lllllllIl[0];
                    }
                    return bl;
                }, (int)lllllllIl[104]);
                0;
                Time.sleepTicks((int)lllllllIl[1]);
                0;
            }
            if (ad.llIllIIlIIlI(ad.dY() ? 1 : 0)) {
                return;
            }
            if (ad.llIllIIlIIlI(lIIlllllIIIII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && ad.llIllIIlIlIl(lIIllllIlllIl = TileObjects.getNearest(tileObject -> {
                int n2;
                if (ad.llIllIIlIIlI(tileObject.getName().contains(lllllllII[lllllllIl[208]]) ? 1 : 0) && ad.llIllIIllIlI(tileObject.getWorldLocation().distanceTo(new WorldPoint(lllllllIl[209], lllllllIl[210], lllllllIl[3])), lllllllIl[3])) {
                    n2 = lllllllIl[1];
                    0;
                    
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
                0;
                Time.sleepUntil(() -> {
                    boolean bl;
                    if (ad.llIllIIlIllI(Skills.getExperience((Skill)Skill.AGILITY), lIIllllIlllII)) {
                        bl = lllllllIl[1];
                        0;
                        
                        }
                    } else {
                        bl = lllllllIl[0];
                    }
                    return bl;
                }, (int)lllllllIl[104]);
                0;
                Time.sleepTicks((int)lllllllIl[1]);
                0;
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

    private static String llIllIIIlIIl(String lIIllIlIIllII, String lIIllIlIIlIll) {
        lIIllIlIIllII = new String(Base64.getDecoder().decode(lIIllIlIIllII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lIIllIlIIlIlI = new StringBuilder();
        char[] lIIllIlIIlIIl = lIIllIlIIlIll.toCharArray();
        int lIIllIlIIlIII = lllllllIl[0];
        char[] lIIllIlIIIIlI = lIIllIlIIllII.toCharArray();
        int lIIllIlIIIIIl = lIIllIlIIIIlI.length;
        int lIIllIlIIIIII = lllllllIl[0];
        while (ad.llIllIIlIIll(lIIllIlIIIIII, lIIllIlIIIIIl)) {
            char lIIllIlIIllIl = lIIllIlIIIIlI[lIIllIlIIIIII];
            lIIllIlIIlIlI.append((char)(lIIllIlIIllIl ^ lIIllIlIIlIIl[lIIllIlIIlIII % lIIllIlIIlIIl.length]));
            0;
            ++lIIllIlIIlIII;
            ++lIIllIlIIIIII;
            0;
            if (-1 < 2) continue;
            return null;
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
                            d d2 = new d(lllllllIl[16], lllllllIl[1], lllllllIl[195]);
                            bx.add(d2);
                            0;
                        }
                        int[] nArray2 = new int[lllllllIl[1]];
                        nArray2[ad.lllllllIl[0]] = lllllllIl[18];
                        if (ad.llIllIIlIlII(Bank.contains((int[])nArray2) ? 1 : 0)) {
                            lIIlllIlIllII = new d(lllllllIl[18], lllllllIl[3], lllllllIl[196]);
                            bx.add(lIIlllIlIllII);
                            0;
                        }
                        int[] nArray3 = new int[lllllllIl[1]];
                        nArray3[ad.lllllllIl[0]] = lllllllIl[27];
                        if (ad.llIllIIlIlII(Bank.contains((int[])nArray3) ? 1 : 0)) {
                            lIIlllIlIllII = new d(lllllllIl[27], lllllllIl[3], lllllllIl[196]);
                            bx.add(lIIlllIlIllII);
                            0;
                        }
                        int[] nArray4 = new int[lllllllIl[1]];
                        nArray4[ad.lllllllIl[0]] = lllllllIl[13];
                        if (ad.llIllIIlIlII(Bank.contains((int[])nArray4) ? 1 : 0)) {
                            lIIlllIlIllII = new d(lllllllIl[13], lllllllIl[12], lllllllIl[197]);
                            bx.add(lIIlllIlIllII);
                            0;
                        }
                        int[] nArray5 = new int[lllllllIl[1]];
                        nArray5[ad.lllllllIl[0]] = lllllllIl[21];
                        if (ad.llIllIIlIlII(Bank.contains((int[])nArray5) ? 1 : 0)) {
                            lIIlllIlIllII = new d(lllllllIl[21], lllllllIl[12], lllllllIl[198]);
                            bx.add(lIIlllIlIllII);
                            0;
                        }
                        int[] nArray6 = new int[lllllllIl[1]];
                        nArray6[ad.lllllllIl[0]] = lllllllIl[15];
                        if (ad.llIllIIlIlII(Bank.contains((int[])nArray6) ? 1 : 0)) {
                            lIIlllIlIllII = new d(lllllllIl[15], lllllllIl[12], lllllllIl[198]);
                            bx.add(lIIlllIlIllII);
                            0;
                        }
                        int[] nArray7 = new int[lllllllIl[1]];
                        nArray7[ad.lllllllIl[0]] = lllllllIl[14];
                        if (ad.llIllIIlIlII(Bank.contains((int[])nArray7) ? 1 : 0)) {
                            lIIlllIlIllII = new d(lllllllIl[14], lllllllIl[12], lllllllIl[198]);
                            bx.add(lIIlllIlIllII);
                            0;
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
                    lIIlllIlIllII = new d(lZ, lllllllIl[44], lllllllIl[199]);
                    bx.add(lIIlllIlIllII);
                    0;
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
            lIIlllIlIllII = new d(lllllllIl[25], lllllllIl[12], lllllllIl[200]);
            bx.add(lIIlllIlIllII);
            0;
        }
        int[] nArray = new int[lllllllIl[1]];
        nArray[ad.lllllllIl[0]] = lllllllIl[201];
        if (ad.llIllIIlIlII(Bank.contains((int[])nArray) ? 1 : 0)) {
            lIIlllIlIllII = new d(lllllllIl[201], lllllllIl[1], lllllllIl[202]);
            bx.add(lIIlllIlIllII);
            0;
        }
        int[] nArray13 = new int[lllllllIl[1]];
        nArray13[ad.lllllllIl[0]] = lllllllIl[19];
        if (ad.llIllIIlIlII(Bank.contains((int[])nArray13) ? 1 : 0)) {
            lIIlllIlIllII = new d(lllllllIl[19], lllllllIl[40], j.ch);
            bx.add(lIIlllIlIllII);
            0;
        }
    }

    private static boolean llIllIIlIIll(int n2, int n3) {
        return n2 < n3;
    }

    private static String llIllIIIlIlI(String lIIllIlIllIlI, String lIIllIlIllIll) {
        try {
            SecretKeySpec lIIllIlIlllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIIllIlIllIll.getBytes(StandardCharsets.UTF_8)), lllllllIl[24]), "DES");
            Cipher lIIllIlIllllI = Cipher.getInstance("DES");
            lIIllIlIllllI.init(lllllllIl[3], lIIllIlIlllll);
            return new String(lIIllIlIllllI.doFinal(Base64.getDecoder().decode(lIIllIlIllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIIllIlIlllIl) {
            lIIllIlIlllIl.printStackTrace();
            return null;
        }
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
            0;
            Time.sleepTicks((int)lllllllIl[1]);
            0;
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
                0;
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
                            0;
                            if ((0x8E ^ 0x8B) == 0) {
                                return false;
                            }
                        } else {
                            bl = lllllllIl[0];
                        }
                        return bl;
                    }, (int)lllllllIl[104]);
                    0;
                    Time.sleepTicks((int)lllllllIl[1]);
                    0;
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
                            0;
                            
                            }
                        } else {
                            bl = lllllllIl[0];
                        }
                        return bl;
                    }, (int)lllllllIl[104]);
                    0;
                    Time.sleepTicks((int)lllllllIl[1]);
                    0;
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
                            0;
                            if (((0xCB ^ 0x81) & ~(0xCC ^ 0x86)) != 0) {
                                return false;
                            }
                        } else {
                            bl = lllllllIl[0];
                        }
                        return bl;
                    }, (int)lllllllIl[104]);
                    0;
                    Time.sleepTicks((int)lllllllIl[1]);
                    0;
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
                            0;
                            if (3 == 0) {
                                return (2 & (2 ^ -1)) != 0;
                            }
                        } else {
                            bl = lllllllIl[0];
                        }
                        return bl;
                    }, (int)lllllllIl[104]);
                    0;
                    Time.sleepTicks((int)lllllllIl[1]);
                    0;
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
                            0;
                            
                            }
                        } else {
                            bl = lllllllIl[0];
                        }
                        return bl;
                    }, (int)lllllllIl[104]);
                    0;
                    Time.sleepTicks((int)lllllllIl[1]);
                    0;
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
                            0;
                            if (1 == 0) {
                                return false;
                            }
                        } else {
                            bl = lllllllIl[0];
                        }
                        return bl;
                    }, (int)lllllllIl[104]);
                    0;
                    Time.sleepTicks((int)lllllllIl[1]);
                    0;
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
                            0;
                            
                            }
                        } else {
                            bl = lllllllIl[0];
                        }
                        return bl;
                    }, (int)lllllllIl[104]);
                    0;
                    Time.sleepTicks((int)lllllllIl[1]);
                    0;
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
                            0;
                            if (-1 >= 0) {
                                return ((0x6D ^ 0x5D ^ (0x39 ^ 0x33)) & (0x21 ^ 0x30 ^ (0xEF ^ 0xC4) ^ -1)) != 0;
                            }
                        } else {
                            bl = lllllllIl[0];
                        }
                        return bl;
                    }, (int)lllllllIl[104]);
                    0;
                    Time.sleepTicks((int)lllllllIl[1]);
                    0;
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
                            0;
                            if (-1 >= (0xC3 ^ 0xC7)) {
                                return false;
                            }
                        } else {
                            bl = lllllllIl[0];
                        }
                        return bl;
                    }, (int)lllllllIl[104]);
                    0;
                    Time.sleepTicks((int)lllllllIl[1]);
                    0;
                }
            }
        }
    }

    private static boolean llIllIIllIlI(int n2, int n3) {
        return n2 <= n3;
    }
}

