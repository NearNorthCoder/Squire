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
package f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n;

import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.G_Unknown;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.a_Unknown;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.b_Unknown;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.d;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.e_Unknown;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.f_Unknown;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.i;
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

public class H_Unknown
implements G {
    static /* synthetic */ WorldArea iA;
    private static /* synthetic */ int[] lIIlIIlIlI;
    static /* synthetic */ WorldArea iB;
    public static /* synthetic */ int iw;
    static /* synthetic */ WorldArea iz;
    private static /* synthetic */ WorldPoint iC;
    public static /* synthetic */ int ix;
    private static /* synthetic */ String[] lIIlIIlIII;
    public static /* synthetic */ boolean bt;
    public static /* synthetic */ List<d> bv;
    public static /* synthetic */ int iy;

    private static String lllllIIIIIII(String llllIII, String lllIlll) {
        try {
            SecretKeySpec llllIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllIlll.getBytes(StandardCharsets.UTF_8)), lIIlIIlIlI[25]), "DES");
            Cipher llllIlI = Cipher.getInstance("DES");
            llllIlI.init(lIIlIIlIlI[3], llllIll);
            return new String(llllIlI.doFinal(Base64.getDecoder().decode(llllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllIIl) {
            llllIIl.printStackTrace();
            return null;
        }
    }

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
            0;
            Time.sleepTicks((int)lIIlIIlIlI[1]);
            0;
        }
        if (H.lllllIIIIlll(lIIlIllIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (H.lllllIIIlIll(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lIIlIIIlI), lIIlIIlIlI[21])) {
                AccBuilderRogues.c = lIIlIIlIII[lIIlIIlIlI[6]];
                Movement.walkTo((WorldPoint)lIIlIIIlI);
                0;
                Time.sleepTicks((int)lIIlIIlIlI[1]);
                0;
            }
            if (H.lllllIIIllll(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lIIlIIIlI), lIIlIIlIlI[21])) {
                AccBuilderRogues.c = lIIlIIlIII[lIIlIIlIlI[141]];
                int lIIlIIIIl = Skills.getExperience((Skill)Skill.AGILITY);
                String[] stringArray = new String[lIIlIIlIlI[1]];
                stringArray[H.lIIlIIlIlI[0]] = lIIlIIlIII[lIIlIIlIlI[142]];
                TileObjects.getNearest((String[])stringArray).interact(lIIlIIlIII[lIIlIIlIlI[143]]);
                Time.sleepTicks((int)e.c(lIIlIIlIlI[1], lIIlIIlIlI[3]));
                0;
                Time.sleepUntil(() -> {
                    boolean bl;
                    if (H.lllllIIIlIll(Skills.getExperience((Skill)Skill.AGILITY), lIIlIIIIl)) {
                        bl = lIIlIIlIlI[1];
                        0;
                        if (-(0x6A ^ 0x58 ^ (0x51 ^ 0x67)) >= 0) {
                            return (((0xA0 ^ 0xA6) & ~(0x95 ^ 0x93) ^ (0x8B ^ 0xB6)) & (0x5C ^ 0x34 ^ (0xF0 ^ 0xA5) ^ -1)) != 0;
                        }
                    } else {
                        bl = lIIlIIlIlI[0];
                    }
                    return bl;
                }, (int)lIIlIIlIlI[104]);
                0;
                Time.sleepTicks((int)lIIlIIlIlI[1]);
                0;
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
            0;
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
                    0;
                    
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
                0;
                Time.sleepUntil(() -> {
                    boolean bl;
                    if (H.lllllIIIlIll(Skills.getExperience((Skill)Skill.AGILITY), lIIIlllll)) {
                        bl = lIIlIIlIlI[1];
                        0;
                        if ((0xB9 ^ 0xB5 ^ (0x5F ^ 0x57)) > (0x4D ^ 0x23 ^ (0xD1 ^ 0xBB))) {
                            return ((0xF1 ^ 0xC6 ^ (0x9F ^ 0xB5)) & (84 + 113 - 159 + 89 ^ (0x11 ^ 0x73) ^ -1)) != 0;
                        }
                    } else {
                        bl = lIIlIIlIlI[0];
                    }
                    return bl;
                }, (int)lIIlIIlIlI[104]);
                0;
                Time.sleepTicks((int)lIIlIIlIlI[1]);
                0;
            }
            if (H.lllllIIIIlll(H.cu() ? 1 : 0)) {
                return;
            }
            if (H.lllllIIIIlll(lIIlIlIII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && H.lllllIIIlIlI(lIIlIIIII = TileObjects.getNearest(tileObject -> {
                int n2;
                if (H.lllllIIIIlll(tileObject.getName().contains(lIIlIIlIII[lIIlIIlIlI[232]]) ? 1 : 0) && H.lllllIIIllll(tileObject.getWorldLocation().distanceTo(new WorldPoint(lIIlIIlIlI[131], lIIlIIlIlI[225], lIIlIIlIlI[3])), lIIlIIlIlI[3])) {
                    n2 = lIIlIIlIlI[1];
                    0;
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
                0;
                Time.sleepUntil(() -> {
                    boolean bl;
                    if (H.lllllIIIlIll(Skills.getExperience((Skill)Skill.AGILITY), lIIIlllll)) {
                        bl = lIIlIIlIlI[1];
                        0;
                        if (-1 > 0) {
                            return false;
                        }
                    } else {
                        bl = lIIlIIlIlI[0];
                    }
                    return bl;
                }, (int)lIIlIIlIlI[104]);
                0;
                Time.sleepTicks((int)lIIlIIlIlI[1]);
                0;
            }
            if (H.lllllIIIIlll(H.cu() ? 1 : 0)) {
                return;
            }
            if (H.lllllIIIIlll(lIIlIIlll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && H.lllllIIIlIlI(lIIlIIIII = TileObjects.getNearest(tileObject -> {
                int n2;
                if (H.lllllIIIIlll(tileObject.getName().contains(lIIlIIlIII[lIIlIIlIlI[230]]) ? 1 : 0) && H.lllllIIIllll(tileObject.getWorldLocation().distanceTo(new WorldPoint(lIIlIIlIlI[139], lIIlIIlIlI[231], lIIlIIlIlI[3])), lIIlIIlIlI[3])) {
                    n2 = lIIlIIlIlI[1];
                    0;
                    if (-2 > 0) {
                        return false;
                    }
                } else {
                    n2 = lIIlIIlIlI[0];
                }
                return n2 != 0;
            }))) {
                AccBuilderRogues.c = lIIlIIlIII[lIIlIIlIlI[152]];
                lIIIlllll = Skills.getExperience((Skill)Skill.AGILITY);
                lIIlIIIII.interact(lIIlIIlIII[lIIlIIlIlI[153]]);
                Time.sleepTicks((int)e.c(lIIlIIlIlI[1], lIIlIIlIlI[3]));
                0;
                Time.sleepUntil(() -> {
                    boolean bl;
                    if (H.lllllIIIlIll(Skills.getExperience((Skill)Skill.AGILITY), lIIIlllll)) {
                        bl = lIIlIIlIlI[1];
                        0;
                        if (-2 > 0) {
                            return false;
                        }
                    } else {
                        bl = lIIlIIlIlI[0];
                    }
                    return bl;
                }, (int)lIIlIIlIlI[104]);
                0;
                Time.sleepTicks((int)lIIlIIlIlI[1]);
                0;
            }
            if (H.lllllIIIIlll(H.cu() ? 1 : 0)) {
                return;
            }
            if (H.lllllIIIIlll(lIIlIIllI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && H.lllllIIIlIlI(lIIlIIIII = TileObjects.getNearest(tileObject -> {
                int n2;
                if (H.lllllIIIIlll(tileObject.getName().contains(lIIlIIlIII[lIIlIIlIlI[227]]) ? 1 : 0) && H.lllllIIIllll(tileObject.getWorldLocation().distanceTo(new WorldPoint(lIIlIIlIlI[228], lIIlIIlIlI[229], lIIlIIlIlI[10])), lIIlIIlIlI[3])) {
                    n2 = lIIlIIlIlI[1];
                    0;
                    if (-1 >= 0) {
                        return false;
                    }
                } else {
                    n2 = lIIlIIlIlI[0];
                }
                return n2 != 0;
            }))) {
                AccBuilderRogues.c = lIIlIIlIII[lIIlIIlIlI[154]];
                lIIIlllll = Skills.getExperience((Skill)Skill.AGILITY);
                lIIlIIIII.interact(lIIlIIlIII[lIIlIIlIlI[155]]);
                Time.sleepTicks((int)e.c(lIIlIIlIlI[1], lIIlIIlIlI[3]));
                0;
                Time.sleepUntil(() -> {
                    boolean bl;
                    if (H.lllllIIIlIll(Skills.getExperience((Skill)Skill.AGILITY), lIIIlllll)) {
                        bl = lIIlIIlIlI[1];
                        0;
                        if (2 != 2) {
                            return false;
                        }
                    } else {
                        bl = lIIlIIlIlI[0];
                    }
                    return bl;
                }, (int)lIIlIIlIlI[104]);
                0;
                Time.sleepTicks((int)lIIlIIlIlI[1]);
                0;
            }
            if (H.lllllIIIIlll(H.cu() ? 1 : 0)) {
                return;
            }
            if (H.lllllIIIIlll(lIIlIIlIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && H.lllllIIIlIlI(lIIlIIIII = TileObjects.getNearest(tileObject -> {
                int n2;
                if (H.lllllIIIIlll(tileObject.getName().contains(lIIlIIlIII[lIIlIIlIlI[226]]) ? 1 : 0) && H.lllllIIIllll(tileObject.getWorldLocation().distanceTo(new WorldPoint(lIIlIIlIlI[9], lIIlIIlIlI[130], lIIlIIlIlI[3])), lIIlIIlIlI[3])) {
                    n2 = lIIlIIlIlI[1];
                    0;
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
                0;
                Time.sleepUntil(() -> {
                    boolean bl;
                    if (H.lllllIIIlIll(Skills.getExperience((Skill)Skill.AGILITY), lIIIlllll)) {
                        bl = lIIlIIlIlI[1];
                        0;
                        if ((0x7F ^ 0x2F ^ (0xC2 ^ 0x96)) <= 2) {
                            return ((0x94 ^ 0x90 ^ (0x5A ^ 0x4A)) & (0xD2 ^ 0x8B ^ (0x36 ^ 0x7B) ^ -1)) != 0;
                        }
                    } else {
                        bl = lIIlIIlIlI[0];
                    }
                    return bl;
                }, (int)lIIlIIlIlI[104]);
                0;
                Time.sleepTicks((int)lIIlIIlIlI[1]);
                0;
            }
            if (H.lllllIIIIlll(H.cu() ? 1 : 0)) {
                return;
            }
            if (H.lllllIIIIlll(lIIlIIlII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && H.lllllIIIlIlI(lIIlIIIII = TileObjects.getNearest(tileObject -> {
                int n2;
                if (H.lllllIIIIlll(tileObject.getName().contains(lIIlIIlIII[lIIlIIlIlI[224]]) ? 1 : 0) && H.lllllIIIllll(tileObject.getWorldLocation().distanceTo(new WorldPoint(lIIlIIlIlI[225], lIIlIIlIlI[215], lIIlIIlIlI[10])), lIIlIIlIlI[3])) {
                    n2 = lIIlIIlIlI[1];
                    0;
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
                0;
                Time.sleepUntil(() -> {
                    boolean bl;
                    if (H.lllllIIIlIll(Skills.getExperience((Skill)Skill.AGILITY), lIIIlllll)) {
                        bl = lIIlIIlIlI[1];
                        0;
                        if (2 == 0) {
                            return false;
                        }
                    } else {
                        bl = lIIlIIlIlI[0];
                    }
                    return bl;
                }, (int)lIIlIIlIlI[104]);
                0;
                Time.sleepTicks((int)lIIlIIlIlI[1]);
                0;
            }
            if (H.lllllIIIIlll(H.cu() ? 1 : 0)) {
                return;
            }
            if (H.lllllIIIIlll(lIIlIIIll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && H.lllllIIIlIlI(lIIlIIIII = TileObjects.getNearest(tileObject -> {
                int n2;
                if (H.lllllIIIIlll(tileObject.getName().contains(lIIlIIlIII[lIIlIIlIlI[221]]) ? 1 : 0) && H.lllllIIIllll(tileObject.getWorldLocation().distanceTo(new WorldPoint(lIIlIIlIlI[222], lIIlIIlIlI[223], lIIlIIlIlI[3])), lIIlIIlIlI[3])) {
                    n2 = lIIlIIlIlI[1];
                    0;
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
                0;
                Time.sleepUntil(() -> {
                    boolean bl;
                    if (H.lllllIIIlIll(Skills.getExperience((Skill)Skill.AGILITY), lIIIlllll)) {
                        bl = lIIlIIlIlI[1];
                        0;
                        if (2 < 1) {
                            return false;
                        }
                    } else {
                        bl = lIIlIIlIlI[0];
                    }
                    return bl;
                }, (int)lIIlIIlIlI[104]);
                0;
                Time.sleepTicks((int)lIIlIIlIlI[1]);
                0;
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
                        0;
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
                    0;
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
            0;
            Time.sleepTicks((int)lIIlIIlIlI[1]);
            0;
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
                0;
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
                            0;
                            if (1 == 3) {
                                return false;
                            }
                        } else {
                            bl = lIIlIIlIlI[0];
                        }
                        return bl;
                    }, (int)lIIlIIlIlI[104]);
                    0;
                    Time.sleepTicks((int)lIIlIIlIlI[1]);
                    0;
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
                            0;
                            if (((19 + 38 - 21 + 92 ^ 35 + 26 - -9 + 99) & (0xA5 ^ 0xB4 ^ (0xAA ^ 0x92) ^ -1)) != 0) {
                                return ((0x47 ^ 0x25 ^ (2 ^ 0x59)) & (151 + 3 - 69 + 81 ^ 15 + 150 - 121 + 115 ^ -1)) != 0;
                            }
                        } else {
                            bl = lIIlIIlIlI[0];
                        }
                        return bl;
                    }, (int)lIIlIIlIlI[104]);
                    0;
                    Time.sleepTicks((int)lIIlIIlIlI[1]);
                    0;
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
                            0;
                            if (3 <= -1) {
                                return false;
                            }
                        } else {
                            bl = lIIlIIlIlI[0];
                        }
                        return bl;
                    }, (int)lIIlIIlIlI[104]);
                    0;
                    Time.sleepTicks((int)lIIlIIlIlI[1]);
                    0;
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
                            0;
                            if ((0x1B ^ 0x1F) <= 1) {
                                return false;
                            }
                        } else {
                            bl = lIIlIIlIlI[0];
                        }
                        return bl;
                    }, (int)lIIlIIlIlI[104]);
                    0;
                    Time.sleepTicks((int)lIIlIIlIlI[1]);
                    0;
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
                            0;
                            if (-1 > 2) {
                                return false;
                            }
                        } else {
                            bl = lIIlIIlIlI[0];
                        }
                        return bl;
                    }, (int)lIIlIIlIlI[104]);
                    0;
                    Time.sleepTicks((int)lIIlIIlIlI[1]);
                    0;
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
                            0;
                            if (1 == (0x40 ^ 0x44)) {
                                return false;
                            }
                        } else {
                            bl = lIIlIIlIlI[0];
                        }
                        return bl;
                    }, (int)lIIlIIlIlI[104]);
                    0;
                    Time.sleepTicks((int)lIIlIIlIlI[1]);
                    0;
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
                            0;
                            if (-1 > 0) {
                                return ((0x87 ^ 0x80 ^ (0x9B ^ 0x85)) & (0x11 ^ 0x17 ^ (0x9D ^ 0x82) ^ -1)) != 0;
                            }
                        } else {
                            bl = lIIlIIlIlI[0];
                        }
                        return bl;
                    }, (int)lIIlIIlIlI[104]);
                    0;
                    Time.sleepTicks((int)lIIlIIlIlI[1]);
                    0;
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
                            0;
                            if (((0x27 ^ 7) & ~(0x3F ^ 0x1F)) >= (0xAC ^ 0xA8)) {
                                return false;
                            }
                        } else {
                            bl = lIIlIIlIlI[0];
                        }
                        return bl;
                    }, (int)lIIlIIlIlI[104]);
                    0;
                    Time.sleepTicks((int)lIIlIIlIlI[1]);
                    0;
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
                            0;
                            if (((0x11 ^ 0x70) & ~(0xEB ^ 0x8A)) >= 1) {
                                return false;
                            }
                        } else {
                            bl = lIIlIIlIlI[0];
                        }
                        return bl;
                    }, (int)lIIlIIlIlI[104]);
                    0;
                    Time.sleepTicks((int)lIIlIIlIlI[1]);
                    0;
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
            0;
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
                0;
            }
            if (H.lllllIIIIlll(lIlIlllll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderRogues.c = lIIlIIlIII[lIIlIIlIlI[53]];
                String[] stringArray = new String[lIIlIIlIlI[1]];
                stringArray[H.lIIlIIlIlI[0]] = lIIlIIlIII[lIIlIIlIlI[39]];
                TileObjects.getNearest((String[])stringArray).interact(lIIlIIlIII[lIIlIIlIlI[65]]);
                Time.sleepTicks((int)lIIlIIlIlI[3]);
                0;
            }
            if (H.lllllIIIIlll(lIlIllllI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderRogues.c = lIIlIIlIII[lIIlIIlIlI[66]];
                String[] stringArray = new String[lIIlIIlIlI[1]];
                stringArray[H.lIIlIIlIlI[0]] = lIIlIIlIII[lIIlIIlIlI[54]];
                TileObjects.getNearest((String[])stringArray).interact(lIIlIIlIII[lIIlIIlIlI[67]]);
                Time.sleepTicks((int)lIIlIIlIlI[3]);
                0;
            }
            if (H.lllllIIIIlll(lIlIlllIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderRogues.c = lIIlIIlIII[lIIlIIlIlI[41]];
                String[] stringArray = new String[lIIlIIlIlI[1]];
                stringArray[H.lIIlIIlIlI[0]] = lIIlIIlIII[lIIlIIlIlI[68]];
                TileObjects.getNearest((String[])stringArray).interact(lIIlIIlIII[lIIlIIlIlI[61]]);
                Time.sleepTicks((int)lIIlIIlIlI[19]);
                0;
            }
            if (H.lllllIIIIlll(lIlIlllII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderRogues.c = lIIlIIlIII[lIIlIIlIlI[69]];
                String[] stringArray = new String[lIIlIIlIlI[1]];
                stringArray[H.lIIlIIlIlI[0]] = lIIlIIlIII[lIIlIIlIlI[70]];
                TileObjects.getNearest((String[])stringArray).interact(lIIlIIlIII[lIIlIIlIlI[42]]);
                Time.sleepTicks((int)lIIlIIlIlI[17]);
                0;
            }
            if (H.lllllIIIIlll(lIlIllIll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderRogues.c = lIIlIIlIII[lIIlIIlIlI[71]];
                String[] stringArray = new String[lIIlIIlIlI[1]];
                stringArray[H.lIIlIIlIlI[0]] = lIIlIIlIII[lIIlIIlIlI[72]];
                TileObjects.getNearest((String[])stringArray).interact(lIIlIIlIII[lIIlIIlIlI[73]]);
                Time.sleepTicks((int)lIIlIIlIlI[10]);
                0;
            }
            if (H.lllllIIIIlll(lIlIllIlI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderRogues.c = lIIlIIlIII[lIIlIIlIlI[74]];
                String[] stringArray = new String[lIIlIIlIlI[1]];
                stringArray[H.lIIlIIlIlI[0]] = lIIlIIlIII[lIIlIIlIlI[2]];
                TileObjects.getNearest((String[])stringArray).interact(lIIlIIlIII[lIIlIIlIlI[75]]);
                Time.sleepTicks((int)lIIlIIlIlI[17]);
                0;
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
                            d d2 = new d(lIIlIIlIlI[16], lIIlIIlIlI[1], lIIlIIlIlI[195]);
                            bv.add(d2);
                            0;
                        }
                        int[] nArray2 = new int[lIIlIIlIlI[1]];
                        nArray2[H.lIIlIIlIlI[0]] = lIIlIIlIlI[18];
                        if (H.lllllIIIlIIl(Bank.contains((int[])nArray2) ? 1 : 0)) {
                            llIlIlIl = new d(lIIlIIlIlI[18], lIIlIIlIlI[3], lIIlIIlIlI[196]);
                            bv.add(llIlIlIl);
                            0;
                        }
                        int[] nArray3 = new int[lIIlIIlIlI[1]];
                        nArray3[H.lIIlIIlIlI[0]] = lIIlIIlIlI[28];
                        if (H.lllllIIIlIIl(Bank.contains((int[])nArray3) ? 1 : 0)) {
                            llIlIlIl = new d(lIIlIIlIlI[28], lIIlIIlIlI[3], lIIlIIlIlI[196]);
                            bv.add(llIlIlIl);
                            0;
                        }
                        int[] nArray4 = new int[lIIlIIlIlI[1]];
                        nArray4[H.lIIlIIlIlI[0]] = lIIlIIlIlI[13];
                        if (H.lllllIIIlIIl(Bank.contains((int[])nArray4) ? 1 : 0)) {
                            llIlIlIl = new d(lIIlIIlIlI[13], lIIlIIlIlI[12], lIIlIIlIlI[197]);
                            bv.add(llIlIlIl);
                            0;
                        }
                        int[] nArray5 = new int[lIIlIIlIlI[1]];
                        nArray5[H.lIIlIIlIlI[0]] = lIIlIIlIlI[22];
                        if (H.lllllIIIlIIl(Bank.contains((int[])nArray5) ? 1 : 0)) {
                            llIlIlIl = new d(lIIlIIlIlI[22], lIIlIIlIlI[12], lIIlIIlIlI[198]);
                            bv.add(llIlIlIl);
                            0;
                        }
                        int[] nArray6 = new int[lIIlIIlIlI[1]];
                        nArray6[H.lIIlIIlIlI[0]] = lIIlIIlIlI[15];
                        if (H.lllllIIIlIIl(Bank.contains((int[])nArray6) ? 1 : 0)) {
                            llIlIlIl = new d(lIIlIIlIlI[15], lIIlIIlIlI[12], lIIlIIlIlI[198]);
                            bv.add(llIlIlIl);
                            0;
                        }
                        int[] nArray7 = new int[lIIlIIlIlI[1]];
                        nArray7[H.lIIlIIlIlI[0]] = lIIlIIlIlI[14];
                        if (H.lllllIIIlIIl(Bank.contains((int[])nArray7) ? 1 : 0)) {
                            llIlIlIl = new d(lIIlIIlIlI[14], lIIlIIlIlI[12], lIIlIIlIlI[198]);
                            bv.add(llIlIlIl);
                            0;
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
                    llIlIlIl = new d(ix, lIIlIIlIlI[44], lIIlIIlIlI[199]);
                    bv.add(llIlIlIl);
                    0;
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
            llIlIlIl = new d(lIIlIIlIlI[26], lIIlIIlIlI[12], lIIlIIlIlI[200]);
            bv.add(llIlIlIl);
            0;
        }
        int[] nArray = new int[lIIlIIlIlI[1]];
        nArray[H.lIIlIIlIlI[0]] = lIIlIIlIlI[201];
        if (H.lllllIIIlIIl(Bank.contains((int[])nArray) ? 1 : 0)) {
            llIlIlIl = new d(lIIlIIlIlI[201], lIIlIIlIlI[1], lIIlIIlIlI[202]);
            bv.add(llIlIlIl);
            0;
        }
        int[] nArray13 = new int[lIIlIIlIlI[1]];
        nArray13[H.lIIlIIlIlI[0]] = lIIlIIlIlI[20];
        if (H.lllllIIIlIIl(Bank.contains((int[])nArray13) ? 1 : 0)) {
            llIlIlIl = new d(lIIlIIlIlI[20], lIIlIIlIlI[41], i.bq);
            bv.add(llIlIlIl);
            0;
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
            0;
            Time.sleepTicks((int)lIIlIIlIlI[1]);
            0;
        }
        if (H.lllllIIIIlll(lIIIlIIIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (H.lllllIIIlIll(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lIIIIlIII), lIIlIIlIlI[21])) {
                AccBuilderRogues.c = lIIlIIlIII[lIIlIIlIlI[173]];
                Movement.walkTo((WorldPoint)lIIIIlIII);
                0;
                Time.sleepTicks((int)lIIlIIlIlI[1]);
                0;
            }
            if (H.lllllIIIllll(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lIIIIlIII), lIIlIIlIlI[21])) {
                AccBuilderRogues.c = lIIlIIlIII[lIIlIIlIlI[174]];
                int lIIIIIlll = Skills.getExperience((Skill)Skill.AGILITY);
                String[] stringArray = new String[lIIlIIlIlI[1]];
                stringArray[H.lIIlIIlIlI[0]] = lIIlIIlIII[lIIlIIlIlI[175]];
                TileObjects.getNearest((String[])stringArray).interact(lIIlIIlIII[lIIlIIlIlI[36]]);
                Time.sleepTicks((int)e.c(lIIlIIlIlI[1], lIIlIIlIlI[3]));
                0;
                Time.sleepUntil(() -> {
                    boolean bl;
                    if (H.lllllIIIlIll(Skills.getExperience((Skill)Skill.AGILITY), lIIIIIlll)) {
                        bl = lIIlIIlIlI[1];
                        0;
                        
                        }
                    } else {
                        bl = lIIlIIlIlI[0];
                    }
                    return bl;
                }, (int)lIIlIIlIlI[104]);
                0;
                Time.sleepTicks((int)lIIlIIlIlI[1]);
                0;
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
            0;
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
                    0;
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
                0;
                Time.sleepUntil(() -> {
                    boolean bl;
                    if (H.lllllIIIlIll(Skills.getExperience((Skill)Skill.AGILITY), lIIIIIlIl)) {
                        bl = lIIlIIlIlI[1];
                        0;
                        if (((0xF0 ^ 0xAC) & ~(0x76 ^ 0x2A)) <= -1) {
                            return false;
                        }
                    } else {
                        bl = lIIlIIlIlI[0];
                    }
                    return bl;
                }, (int)lIIlIIlIlI[104]);
                0;
                Time.sleepTicks((int)lIIlIIlIlI[1]);
                0;
            }
            if (H.lllllIIIIlll(H.cu() ? 1 : 0)) {
                return;
            }
            if (H.lllllIIIIlll(lIIIIllII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && H.lllllIIIlIlI(lIIIIIllI = TileObjects.getNearest(tileObject -> {
                int n2;
                if (H.lllllIIIIlll(tileObject.getName().contains(lIIlIIlIII[lIIlIIlIlI[216]]) ? 1 : 0) && H.lllllIIIllll(tileObject.getWorldLocation().distanceTo(new WorldPoint(lIIlIIlIlI[217], lIIlIIlIlI[128], lIIlIIlIlI[3])), lIIlIIlIlI[3])) {
                    n2 = lIIlIIlIlI[1];
                    0;
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
                0;
                Time.sleepUntil(() -> {
                    boolean bl;
                    if (H.lllllIIIlIll(Skills.getExperience((Skill)Skill.AGILITY), lIIIIIlIl)) {
                        bl = lIIlIIlIlI[1];
                        0;
                        if (2 == 0) {
                            return (3 & (3 ^ -1)) != 0;
                        }
                    } else {
                        bl = lIIlIIlIlI[0];
                    }
                    return bl;
                }, (int)lIIlIIlIlI[104]);
                0;
                Time.sleepTicks((int)lIIlIIlIlI[1]);
                0;
            }
            if (H.lllllIIIIlll(H.cu() ? 1 : 0)) {
                return;
            }
            if (H.lllllIIIIlll(lIIIIlIll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && H.lllllIIIlIlI(lIIIIIllI = TileObjects.getNearest(tileObject -> {
                int n2;
                if (H.lllllIIIIlll(tileObject.getName().contains(lIIlIIlIII[lIIlIIlIlI[213]]) ? 1 : 0) && H.lllllIIIllll(tileObject.getWorldLocation().distanceTo(new WorldPoint(lIIlIIlIlI[214], lIIlIIlIlI[215], lIIlIIlIlI[3])), lIIlIIlIlI[3])) {
                    n2 = lIIlIIlIlI[1];
                    0;
                    
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
                0;
                Time.sleepUntil(() -> {
                    boolean bl;
                    if (H.lllllIIIlIll(Skills.getExperience((Skill)Skill.AGILITY), lIIIIIlIl)) {
                        bl = lIIlIIlIlI[1];
                        0;
                        if (-1 >= 2) {
                            return false;
                        }
                    } else {
                        bl = lIIlIIlIlI[0];
                    }
                    return bl;
                }, (int)lIIlIIlIlI[104]);
                0;
                Time.sleepTicks((int)lIIlIIlIlI[1]);
                0;
            }
            if (H.lllllIIIIlll(H.cu() ? 1 : 0)) {
                return;
            }
            if (H.lllllIIIIlll(lIIIIlIlI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && H.lllllIIIlIlI(lIIIIIllI = TileObjects.getNearest(tileObject -> {
                int n2;
                if (H.lllllIIIIlll(tileObject.getName().contains(lIIlIIlIII[lIIlIIlIlI[211]]) ? 1 : 0) && H.lllllIIIllll(tileObject.getWorldLocation().distanceTo(new WorldPoint(lIIlIIlIlI[209], lIIlIIlIlI[212], lIIlIIlIlI[10])), lIIlIIlIlI[3])) {
                    n2 = lIIlIIlIlI[1];
                    0;
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
                0;
                Time.sleepUntil(() -> {
                    boolean bl;
                    if (H.lllllIIIlIll(Skills.getExperience((Skill)Skill.AGILITY), lIIIIIlIl)) {
                        bl = lIIlIIlIlI[1];
                        0;
                        
                        }
                    } else {
                        bl = lIIlIIlIlI[0];
                    }
                    return bl;
                }, (int)lIIlIIlIlI[104]);
                0;
                Time.sleepTicks((int)lIIlIIlIlI[1]);
                0;
            }
            if (H.lllllIIIIlll(H.cu() ? 1 : 0)) {
                return;
            }
            if (H.lllllIIIIlll(lIIIIlIIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && H.lllllIIIlIlI(lIIIIIllI = TileObjects.getNearest(tileObject -> {
                int n2;
                if (H.lllllIIIIlll(tileObject.getName().contains(lIIlIIlIII[lIIlIIlIlI[208]]) ? 1 : 0) && H.lllllIIIllll(tileObject.getWorldLocation().distanceTo(new WorldPoint(lIIlIIlIlI[209], lIIlIIlIlI[210], lIIlIIlIlI[3])), lIIlIIlIlI[3])) {
                    n2 = lIIlIIlIlI[1];
                    0;
                    
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
                0;
                Time.sleepUntil(() -> {
                    boolean bl;
                    if (H.lllllIIIlIll(Skills.getExperience((Skill)Skill.AGILITY), lIIIIIlIl)) {
                        bl = lIIlIIlIlI[1];
                        0;
                        if (-1 != -1) {
                            return false;
                        }
                    } else {
                        bl = lIIlIIlIlI[0];
                    }
                    return bl;
                }, (int)lIIlIIlIlI[104]);
                0;
                Time.sleepTicks((int)lIIlIIlIlI[1]);
                0;
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
            0;
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
                0;
                if (1 >= 0) continue;
                return false;
            }
        }
        return lIIlIIlIlI[0];
    }

    private static void lllllIIIIlIl() {
        lIIlIIlIII = new String[lIIlIIlIlI[238]];
        H.lIIlIIlIII[H.lIIlIIlIlI[0]] = H."Buying items";
        H.lIIlIIlIII[H.lIIlIIlIlI[1]] = H."Finished buying items, switching back to agility";
        H.lIIlIIlIII[H.lIIlIIlIlI[3]] = H."Navigating to bank";
        H.lIIlIIlIII[H.lIIlIIlIlI[10]] = H."Handling banking";
        H.lIIlIIlIII[H.lIIlIIlIlI[17]] = H."We are missing quest supplies, switching to BUYING";
        H.lIIlIIlIII[H.lIIlIIlIlI[19]] = H."Vial";
        H.lIIlIIlIII[H.lIIlIIlIlI[21]] = H."Vial";
        H.lIIlIIlIII[H.lIIlIIlIlI[23]] = H."Drop";
        H.lIIlIIlIII[H.lIIlIIlIlI[25]] = H."Drink";
        H.lIIlIIlIII[H.lIIlIIlIlI[27]] = H."Eat";
        H.lIIlIIlIII[H.lIIlIIlIlI[12]] = H."Nav to gnome course";
        H.lIIlIIlIII[H.lIIlIIlIlI[49]] = H."Crossing log";
        H.lIIlIIlIII[H.lIIlIIlIlI[63]] = H."Log balance";
        H.lIIlIIlIII[H.lIIlIIlIlI[64]] = H."Walk-across";
        H.lIIlIIlIII[H.lIIlIIlIlI[53]] = H."Climbing net";
        H.lIIlIIlIII[H.lIIlIIlIlI[39]] = H."Obstacle net";
        H.lIIlIIlIII[H.lIIlIIlIlI[65]] = H."Climb-over";
        H.lIIlIIlIII[H.lIIlIIlIlI[66]] = H."Climbing branch";
        H.lIIlIIlIII[H.lIIlIIlIlI[54]] = H."Tree branch";
        H.lIIlIIlIII[H.lIIlIIlIlI[67]] = H."Climb";
        H.lIIlIIlIII[H.lIIlIIlIlI[41]] = H."Crossing rope";
        H.lIIlIIlIII[H.lIIlIIlIlI[68]] = H."Balancing rope";
        H.lIIlIIlIII[H.lIIlIIlIlI[61]] = H."Walk-on";
        H.lIIlIIlIII[H.lIIlIIlIlI[69]] = H."Climbing down";
        H.lIIlIIlIII[H.lIIlIIlIlI[70]] = H."Tree branch";
        H.lIIlIIlIII[H.lIIlIIlIlI[42]] = H."Climb-down";
        H.lIIlIIlIII[H.lIIlIIlIlI[71]] = H."Climbing net";
        H.lIIlIIlIII[H.lIIlIIlIlI[72]] = H."Obstacle net";
        H.lIIlIIlIII[H.lIIlIIlIlI[73]] = H."Climb-over";
        H.lIIlIIlIII[H.lIIlIIlIlI[74]] = H."Crossing pipe";
        H.lIIlIIlIII[H.lIIlIIlIlI[2]] = H."Obstacle pipe";
        H.lIIlIIlIII[H.lIIlIIlIlI[75]] = H."Squeeze-through";
        H.lIIlIIlIII[H.lIIlIIlIlI[95]] = H."Nav to start";
        H.lIIlIIlIII[H.lIIlIIlIlI[97]] = H."Mark of grace";
        H.lIIlIIlIII[H.lIIlIIlIlI[98]] = H."Taking mark";
        H.lIIlIIlIII[H.lIIlIIlIlI[99]] = H."Found mark on ground";
        H.lIIlIIlIII[H.lIIlIIlIlI[100]] = H."Take";
        H.lIIlIIlIII[H.lIIlIIlIlI[101]] = H."Starting course";
        H.lIIlIIlIII[H.lIIlIIlIlI[102]] = H."Rough wall";
        H.lIIlIIlIII[H.lIIlIIlIlI[103]] = H."Climb";
        H.lIIlIIlIII[H.lIIlIIlIlI[38]] = H."Crossing clothes line";
        H.lIIlIIlIII[H.lIIlIIlIlI[105]] = H."Clothes line";
        H.lIIlIIlIII[H.lIIlIIlIlI[106]] = H."Cross";
        H.lIIlIIlIII[H.lIIlIIlIlI[107]] = H."Leaping";
        H.lIIlIIlIII[H.lIIlIIlIlI[108]] = H."Gap";
        H.lIIlIIlIII[H.lIIlIIlIlI[109]] = H."Leap";
        H.lIIlIIlIII[H.lIIlIIlIlI[110]] = H."Balancing";
        H.lIIlIIlIII[H.lIIlIIlIlI[111]] = H."Wall";
        H.lIIlIIlIII[H.lIIlIIlIlI[112]] = H."Balance";
        H.lIIlIIlIII[H.lIIlIIlIlI[113]] = H."Jumping gap";
        H.lIIlIIlIII[H.lIIlIIlIlI[40]] = H."Gap";
        H.lIIlIIlIII[H.lIIlIIlIlI[7]] = H."Leap";
        H.lIIlIIlIII[H.lIIlIIlIlI[114]] = H."Jumping gap 2";
        H.lIIlIIlIII[H.lIIlIIlIlI[116]] = H."Leap";
        H.lIIlIIlIII[H.lIIlIIlIlI[117]] = H."Jumping gap 3";
        H.lIIlIIlIII[H.lIIlIIlIlI[119]] = H."Leap";
        H.lIIlIIlIII[H.lIIlIIlIlI[120]] = H."Hurdle roof";
        H.lIIlIIlIII[H.lIIlIIlIlI[122]] = H."Hurdle";
        H.lIIlIIlIII[H.lIIlIIlIlI[123]] = H."Finishing course";
        H.lIIlIIlIII[H.lIIlIIlIlI[124]] = H."Edge";
        H.lIIlIIlIII[H.lIIlIIlIlI[44]] = H."Jump-off";
        H.lIIlIIlIII[H.lIIlIIlIlI[140]] = H."Nav to canafis course";
        H.lIIlIIlIII[H.lIIlIIlIlI[6]] = H."Nav to start";
        H.lIIlIIlIII[H.lIIlIIlIlI[141]] = H."Starting course";
        H.lIIlIIlIII[H.lIIlIIlIlI[142]] = H."Tall tree";
        H.lIIlIIlIII[H.lIIlIIlIlI[143]] = H."Climb";
        H.lIIlIIlIII[H.lIIlIIlIlI[144]] = H."Mark of grace";
        H.lIIlIIlIII[H.lIIlIIlIlI[145]] = H."Taking mark";
        H.lIIlIIlIII[H.lIIlIIlIlI[146]] = H."Found mark on ground";
        H.lIIlIIlIII[H.lIIlIIlIlI[147]] = H."Take";
        H.lIIlIIlIII[H.lIIlIIlIlI[148]] = H."Jumping gap 1";
        H.lIIlIIlIII[H.lIIlIIlIlI[149]] = H."Jump";
        H.lIIlIIlIII[H.lIIlIIlIlI[150]] = H."Jumping gap 2";
        H.lIIlIIlIII[H.lIIlIIlIlI[151]] = H."Jump";
        H.lIIlIIlIII[H.lIIlIIlIlI[152]] = H."Jumping gap 3";
        H.lIIlIIlIII[H.lIIlIIlIlI[153]] = H."Jump";
        H.lIIlIIlIII[H.lIIlIIlIlI[154]] = H."Jumping gap 4";
        H.lIIlIIlIII[H.lIIlIIlIlI[155]] = H."Jump";
        H.lIIlIIlIII[H.lIIlIIlIlI[156]] = H."Vaulting";
        H.lIIlIIlIII[H.lIIlIIlIlI[157]] = H."Vault";
        H.lIIlIIlIII[H.lIIlIIlIlI[158]] = H."Jumping gap 5";
        H.lIIlIIlIII[H.lIIlIIlIlI[159]] = H."Jump";
        H.lIIlIIlIII[H.lIIlIIlIlI[160]] = H."Jumping gap 6";
        H.lIIlIIlIII[H.lIIlIIlIlI[161]] = H."Jump";
        H.lIIlIIlIII[H.lIIlIIlIlI[172]] = H."Nav to canafis course";
        H.lIIlIIlIII[H.lIIlIIlIlI[173]] = H."Nav to start";
        H.lIIlIIlIII[H.lIIlIIlIlI[174]] = H."Starting course";
        H.lIIlIIlIII[H.lIIlIIlIlI[175]] = H."Wall";
        H.lIIlIIlIII[H.lIIlIIlIlI[36]] = H."Climb-up";
        H.lIIlIIlIII[H.lIIlIIlIlI[176]] = H."Mark of grace";
        H.lIIlIIlIII[H.lIIlIIlIlI[177]] = H."Taking mark";
        H.lIIlIIlIII[H.lIIlIIlIlI[178]] = H."Found mark on ground";
        H.lIIlIIlIII[H.lIIlIIlIlI[179]] = H."Take";
        H.lIIlIIlIII[H.lIIlIIlIlI[180]] = H."Jumping gap 1";
        H.lIIlIIlIII[H.lIIlIIlIlI[79]] = H."Jump";
        H.lIIlIIlIII[H.lIIlIIlIlI[181]] = H."cross rope";
        H.lIIlIIlIII[H.lIIlIIlIlI[182]] = H."Cross";
        H.lIIlIIlIII[H.lIIlIIlIlI[183]] = H."Jumping gap 3";
        H.lIIlIIlIII[H.lIIlIIlIlI[184]] = H."Jump";
        H.lIIlIIlIII[H.lIIlIIlIlI[185]] = H."Jumping gap 4";
        H.lIIlIIlIII[H.lIIlIIlIlI[186]] = H."Jump";
        H.lIIlIIlIII[H.lIIlIIlIlI[187]] = H."Jumping Edge";
        H.lIIlIIlIII[H.lIIlIIlIlI[188]] = H."Jump";
        H.lIIlIIlIII[H.lIIlIIlIlI[194]] = H."Found mark on ground";
        H.lIIlIIlIII[H.lIIlIIlIlI[203]] = H."Agility";
        H.lIIlIIlIII[H.lIIlIIlIlI[204]] = H."passage";
        H.lIIlIIlIII[H.lIIlIIlIlI[205]] = H."passage";
        H.lIIlIIlIII[H.lIIlIIlIlI[206]] = H."passage";
        H.lIIlIIlIII[H.lIIlIIlIlI[207]] = H."passage";
        H.lIIlIIlIII[H.lIIlIIlIlI[208]] = H."Edge";
        H.lIIlIIlIII[H.lIIlIIlIlI[211]] = H."Gap";
        H.lIIlIIlIII[H.lIIlIIlIlI[213]] = H."Gap";
        H.lIIlIIlIII[H.lIIlIIlIlI[216]] = H."Tightrope";
        H.lIIlIIlIII[H.lIIlIIlIlI[218]] = H."Gap";
        H.lIIlIIlIII[H.lIIlIIlIlI[221]] = H."Gap";
        H.lIIlIIlIII[H.lIIlIIlIlI[224]] = H."Gap";
        H.lIIlIIlIII[H.lIIlIIlIlI[226]] = H."Pole-vault";
        H.lIIlIIlIII[H.lIIlIIlIlI[227]] = H."Gap";
        H.lIIlIIlIII[H.lIIlIIlIlI[230]] = H."Gap";
        H.lIIlIIlIII[H.lIIlIIlIlI[232]] = H."Gap";
        H.lIIlIIlIII[H.lIIlIIlIlI[233]] = H."Gap";
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
                            0;
                            Time.sleepTicks((int)lIIlIIlIlI[1]);
                            0;
                        }
                    }
                    a.a(lIllIlIll);
                }
                if (H.lllllIIIlIlI(lIllIlIll) && H.lllllIIIIlll(lIllIlIll.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderRogues.c = lIIlIIlIII[lIIlIIlIlI[10]];
                    if (H.lllllIIIlIIl(Bank.isOpen() ? 1 : 0)) {
                        a.a();
                        Time.sleepUntil(() -> Bank.isOpen(), (int)lIIlIIlIlI[11]);
                        0;
                    }
                    if (H.lllllIIIIlll(Bank.isOpen() ? 1 : 0)) {
                        if (H.lllllIIIllII(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks((int)lIIlIIlIlI[1]);
                            0;
                        }
                        if (H.lllllIIIllII(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks((int)lIIlIIlIlI[3]);
                            0;
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
                        0;
                        e.l(lIIlIIlIlI[35]);
                        e.l(lIIlIIlIlI[37]);
                        e.l(lIIlIIlIlI[34]);
                        e.l(lIIlIIlIlI[36]);
                        e.l(lIIlIIlIlI[18]);
                        Time.sleepTicks((int)lIIlIIlIlI[10]);
                        0;
                        if (H.lllllIIIlIIl(Bank.isOpen() ? 1 : 0)) {
                            a.a();
                            Time.sleepTicks((int)lIIlIIlIlI[21]);
                            0;
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
                    0;
                }
                if (H.lllllIIIlIll(Combat.getMissingHealth(), lIIlIIlIlI[41])) {
                    int[] nArray = new int[lIIlIIlIlI[1]];
                    nArray[H.lIIlIIlIlI[0]] = lIIlIIlIlI[24];
                    if (H.lllllIIIIlll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        int[] nArray6 = new int[lIIlIIlIlI[1]];
                        nArray6[H.lIIlIIlIlI[0]] = lIIlIIlIlI[24];
                        Inventory.getFirst((int[])nArray6).interact(lIIlIIlIII[lIIlIIlIlI[27]]);
                        Time.sleepTicks((int)lIIlIIlIlI[3]);
                        0;
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
            0;
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

    private static String lllllIIIIIIl(String llIIIll, String llIIIlI) {
        llIIIll = new String(Base64.getDecoder().decode(llIIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llIIllI = new StringBuilder();
        char[] llIIlIl = llIIIlI.toCharArray();
        int llIIlII = lIIlIIlIlI[0];
        char[] lIllllI = llIIIll.toCharArray();
        int lIlllIl = lIllllI.length;
        int lIlllII = lIIlIIlIlI[0];
        while (H.lllllIIIlIII(lIlllII, lIlllIl)) {
            char llIlIIl = lIllllI[lIlllII];
            llIIllI.append((char)(llIlIIl ^ llIIlIl[llIIlII % llIIlIl.length]));
            0;
            ++llIIlII;
            ++lIlllII;
            0;
            if ((0x7B ^ 0x7F) >= ((0xB9 ^ 0xA9) & ~(0xB3 ^ 0xA3))) continue;
            return null;
        }
        return String.valueOf(llIIllI);
    }

    private static boolean lllllIIIlIll(int n2, int n3) {
        return n2 > n3;
    }

    private static String llllIlllllll(String lIIIIlIl, String lIIIIlII) {
        try {
            SecretKeySpec lIIIlIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIIIIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIIIIlll = Cipher.getInstance("Blowfish");
            lIIIIlll.init(lIIlIIlIlI[3], lIIIlIII);
            return new String(lIIIIlll.doFinal(Base64.getDecoder().decode(lIIIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIIIIllI) {
            lIIIIllI.printStackTrace();
            return null;
        }
    }

    private static void lllllIIIIllI() {
        lIIlIIlIlI = new int[239];
        H.lIIlIIlIlI[0] = (226 + 144 - 279 + 143 ^ 51 + 129 - 24 + 15) & (0xE3 ^ 0xA5 ^ (0x69 ^ 0x6E) ^ -1);
        H.lIIlIIlIlI[1] = 1;
        H.lIIlIIlIlI[2] = 0xDC ^ 0xC2;
        H.lIIlIIlIlI[3] = 2;
        H.lIIlIIlIlI[4] = -(0xFFFFEB35 & 0x34DB) & (0xFFFFFF9F & 0x2DF7);
        H.lIIlIIlIlI[5] = 0xFFFF9F85 & 0x6DFF;
        H.lIIlIIlIlI[6] = 0xDD ^ 0x99 ^ (0xDB ^ 0xA1);
        H.lIIlIIlIlI[7] = 0x29 ^ 0x1A;
        H.lIIlIIlIlI[8] = 0xFFFFDFFC & 0x2DBB;
        H.lIIlIIlIlI[9] = -(0x61 ^ 6) & (0xFFFFFFFF & 0xDFE);
        H.lIIlIIlIlI[10] = 3;
        H.lIIlIIlIlI[11] = -(0x1B ^ 0x7F) & (0xFFFFD3EF & 0x3FFB);
        H.lIIlIIlIlI[12] = 0x59 ^ 0x53;
        H.lIIlIIlIlI[13] = -(0xFFFFE5EB & 0x7A35) & (0xFFFFFFFF & 0x7F67);
        H.lIIlIIlIlI[14] = -(0xFFFFA2EF & 0x7DB3) & (0xFFFFBFFE & 0x7FEB);
        H.lIIlIIlIlI[15] = -(0xB ^ 0x3E) & (0xFFFF9F7F & 0x7FFD);
        H.lIIlIIlIlI[16] = 0xFFFFEF5F & 0x1FAD;
        H.lIIlIIlIlI[17] = 0xA7 ^ 0xA3;
        H.lIIlIIlIlI[18] = -(0xFFFFF53F & 0x5BE4) & (0xFFFFFFFF & 0x7FEF);
        H.lIIlIIlIlI[19] = 0x68 ^ 0x6D;
        H.lIIlIIlIlI[20] = -(0xFFFFDEBF & 0x2FEF) & (0xFFFFBFFF & Short.MAX_VALUE);
        H.lIIlIIlIlI[21] = 0x70 ^ 0x76;
        H.lIIlIIlIlI[22] = -(0xFFFFF4D7 & 0x2BAA) & (0xFFFFBFFF & 0x7FCB);
        H.lIIlIIlIlI[23] = 0x4E ^ 0x49;
        H.lIIlIIlIlI[24] = -(0xFFFFED5B & 0x32E7) & (0xFFFFF1C3 & 0x2FFF);
        H.lIIlIIlIlI[25] = 0x78 ^ 0x45 ^ (0x3F ^ 0xA);
        H.lIIlIIlIlI[26] = -(0xFFFFDE73 & 0x339D) & (0xFFFFFFF7 & 0x5EBB);
        H.lIIlIIlIlI[27] = 32 + 143 - 31 + 14 ^ 105 + 49 - 135 + 132;
        H.lIIlIIlIlI[28] = 0xFFFFF7DF & 0x5ABA;
        H.lIIlIIlIlI[29] = 0xFFFFBED7 & 0x6F7C;
        H.lIIlIIlIlI[30] = -(0xFFFFBEAF & 0x51FF) & (0xFFFFBEFE & Short.MAX_VALUE);
        H.lIIlIIlIlI[31] = -(0xFFFFF2F6 & 0x5D9B) & (0xFFFFFFDF & 0x7EFF);
        H.lIIlIIlIlI[32] = 0xFFFFAF6C & 0x7EDF;
        H.lIIlIIlIlI[33] = -2 & (0xFFFFFE73 & 0x2FDF);
        H.lIIlIIlIlI[34] = -(0xFFFFEFF6 & 0x503F) & (0xFFFFEF7F & 0x7EFF);
        H.lIIlIIlIlI[35] = -(0x10 ^ 0x2E) & (0xFFFFFFFF & 0x2EFD);
        H.lIIlIIlIlI[36] = 0xF9 ^ 0xA1;
        H.lIIlIIlIlI[37] = -(0xFFFFFCFD & 0x13D7) & (0xFFFFDFDF & Short.MAX_VALUE);
        H.lIIlIIlIlI[38] = 2 ^ 0x2A;
        H.lIIlIIlIlI[39] = 0x99 ^ 0x96;
        H.lIIlIIlIlI[40] = 0x24 ^ 4 ^ (0xD2 ^ 0xC0);
        H.lIIlIIlIlI[41] = 0x55 ^ 0x25 ^ (0x11 ^ 0x75);
        H.lIIlIIlIlI[42] = 0x6B ^ 0x1A ^ (0x79 ^ 0x11);
        H.lIIlIIlIlI[43] = 0xFFFFB3EF & 0x4D3E;
        H.lIIlIIlIlI[44] = 89 + 41 - 47 + 165 ^ 191 + 43 - 193 + 155;
        H.lIIlIIlIlI[45] = 0xFFFFBDFB & 0x4337;
        H.lIIlIIlIlI[46] = -(0xFFFFEEDF & 0x377B) & (0xFFFFBFFF & 0x6FFF);
        H.lIIlIIlIlI[47] = 0xFFFFFFFB & 0xD6F;
        H.lIIlIIlIlI[48] = -(0xFFFFD4D3 & 0x7B3D) & (0xFFFFDDF6 & 0x7F79);
        H.lIIlIIlIlI[49] = 0xB5 ^ 0xBE;
        H.lIIlIIlIlI[50] = -(0xFFFFF6F3 & 0x79AF) & (0xFFFFFFFF & 0x7DFF);
        H.lIIlIIlIlI[51] = 0xFFFF8DFD & 0x7BA3;
        H.lIIlIIlIlI[52] = -(0xFFFFE329 & 0x1ED7) & (0xFFFFDFF7 & 0x2F5F);
        H.lIIlIIlIlI[53] = 0x14 ^ 0x1A;
        H.lIIlIIlIlI[54] = 0x5A ^ 0x48;
        H.lIIlIIlIlI[55] = -(0xFFFFE4FF & 0x3F01) & (0xFFFFADF3 & 0x7FBF);
        H.lIIlIIlIlI[56] = 0xFFFFCFDE & 0x3D79;
        H.lIIlIIlIlI[57] = -(0xFFFFBFEF & 0x6656) & (0xFFFFEFFF & 0x3FF7);
        H.lIIlIIlIlI[58] = 0xFFFFBDFF & 0x4F59;
        H.lIIlIIlIlI[59] = 0xFFFF89B5 & 0x7FFB;
        H.lIIlIIlIlI[60] = -(26 + 20 - -57 + 54) & (0xFFFFADFF & 0x5FFF);
        H.lIIlIIlIlI[61] = 0x14 ^ 2;
        H.lIIlIIlIlI[62] = -1;
        H.lIIlIIlIlI[63] = 0x20 ^ 0x2C;
        H.lIIlIIlIlI[64] = 0x66 ^ 0x7E ^ (0x59 ^ 0x4C);
        H.lIIlIIlIlI[65] = 0x7C ^ 0x2A ^ (0x3F ^ 0x79);
        H.lIIlIIlIlI[66] = 0x97 ^ 0x86;
        H.lIIlIIlIlI[67] = 0x88 ^ 0x9B;
        H.lIIlIIlIlI[68] = 0xB8 ^ 0xAD;
        H.lIIlIIlIlI[69] = 14 + 89 - -21 + 44 ^ 174 + 123 - 248 + 142;
        H.lIIlIIlIlI[70] = 0xB1 ^ 0xA9;
        H.lIIlIIlIlI[71] = 0x38 ^ 0x10 ^ (0xF7 ^ 0xC5);
        H.lIIlIIlIlI[72] = 0x88 ^ 0x93;
        H.lIIlIIlIlI[73] = 98 + 98 - 91 + 34 ^ 102 + 9 - 17 + 57;
        H.lIIlIIlIlI[74] = 0x36 ^ 0x2B;
        H.lIIlIIlIlI[75] = 0x13 ^ 0xC;
        H.lIIlIIlIlI[76] = 0xFFFFCC7F & 0x3FDF;
        H.lIIlIIlIlI[77] = -(0xFFFFD7BA & 0x3AE7) & (0xFFFFFFB7 & 0x1FFF);
        H.lIIlIIlIlI[78] = 57 + 104 - 126 + 102;
        H.lIIlIIlIlI[79] = 0x77 ^ 0x29;
        H.lIIlIIlIlI[80] = 0xFFFFFEFF & 0xD93;
        H.lIIlIIlIlI[81] = 0xFFFFBFF9 & 0x4D57;
        H.lIIlIIlIlI[82] = 0xFFFF9CEF & 0x6F9C;
        H.lIIlIIlIlI[83] = -(0xFFFF9FBB & 0x7345) & (0xFFFFBFFF & 0x5F7E);
        H.lIIlIIlIlI[84] = -(0xFFFFD37E & 0x6CAB) & (0xFFFFFFFD & 0x4D7F);
        H.lIIlIIlIlI[85] = 0xFFFFFDFF & 0xE76;
        H.lIIlIIlIlI[86] = 0xFFFF8DDD & 0x7F77;
        H.lIIlIIlIlI[87] = 0xFFFFBD5B & 0x4FED;
        H.lIIlIIlIlI[88] = -(0xFFFFDBB7 & 0x774D) & (0xFFFFFFFF & 0x5F6F);
        H.lIIlIIlIlI[89] = -(0xFFFFA38A & 0x7EFF) & (0xFFFFAFFF & 0x7FBF);
        H.lIIlIIlIlI[90] = 0xFFFFBCF3 & 0x4F9D;
        H.lIIlIIlIlI[91] = 0xFFFF8F43 & 0x7DFC;
        H.lIIlIIlIlI[92] = 0xFFFF9CAB & 0x6FF6;
        H.lIIlIIlIlI[93] = 0xFFFFBF6B & 0x4DDE;
        H.lIIlIIlIlI[94] = -(0xFFFFFEA5 & 0x11DF) & (0xFFFFFDF7 & 0x1FDE);
        H.lIIlIIlIlI[95] = 26 + 86 - -11 + 57 ^ 95 + 107 - 86 + 32;
        H.lIIlIIlIlI[96] = 0xFFFFCE9C & 0x3DFB;
        H.lIIlIIlIlI[97] = 0x41 ^ 0x60;
        H.lIIlIIlIlI[98] = 0x24 ^ 0x50 ^ (0xD6 ^ 0x80);
        H.lIIlIIlIlI[99] = 0x4F ^ 0x6C;
        H.lIIlIIlIlI[100] = 104 + 24 - 8 + 18 ^ 40 + 3 - -2 + 129;
        H.lIIlIIlIlI[101] = 0x94 ^ 0xB1;
        H.lIIlIIlIlI[102] = 113 + 32 - 69 + 100 ^ 100 + 10 - -8 + 32;
        H.lIIlIIlIlI[103] = 0x87 ^ 0xA0;
        H.lIIlIIlIlI[104] = 0xFFFFB3FE & 0x6D35;
        H.lIIlIIlIlI[105] = 98 + 48 - -17 + 74 ^ 0 + 154 - 14 + 56;
        H.lIIlIIlIlI[106] = 0x10 ^ 0x3A;
        H.lIIlIIlIlI[107] = 3 ^ 0x26 ^ (0x13 ^ 0x1D);
        H.lIIlIIlIlI[108] = 0x16 ^ 0x3A;
        H.lIIlIIlIlI[109] = 159 + 178 - 234 + 83 ^ 123 + 103 - 98 + 23;
        H.lIIlIIlIlI[110] = 0x6E ^ 0x40;
        H.lIIlIIlIlI[111] = 0x26 ^ 0x22 ^ (0x61 ^ 0x4A);
        H.lIIlIIlIlI[112] = 0xB8 ^ 0x88;
        H.lIIlIIlIlI[113] = 149 + 27 - 71 + 56 ^ 87 + 133 - 167 + 91;
        H.lIIlIIlIlI[114] = 0x25 ^ 0x11;
        H.lIIlIIlIlI[115] = -(0xFFFFF5BD & 0x4E4F) & (0xFFFFFFFE & 0x7DFF);
        H.lIIlIIlIlI[116] = 0x8C ^ 0xB9;
        H.lIIlIIlIlI[117] = 0x1F ^ 0x29;
        H.lIIlIIlIlI[118] = 0xFFFFBDFB & 0x7BF7;
        H.lIIlIIlIlI[119] = 0x42 ^ 0x75;
        H.lIIlIIlIlI[120] = 0x47 ^ 0x40 ^ (0xB1 ^ 0x8E);
        H.lIIlIIlIlI[121] = -(0xFFFFC967 & 0x769B) & (0xFFFFFDF7 & 0x7BFE);
        H.lIIlIIlIlI[122] = 0xBA ^ 0x83;
        H.lIIlIIlIlI[123] = 3 ^ 0x39;
        H.lIIlIIlIlI[124] = 0x73 ^ 0x48;
        H.lIIlIIlIlI[125] = 0xFFFFBD8F & 0x4FFF;
        H.lIIlIIlIlI[126] = -(0xFFFFE2E5 & 0x7F1B) & (0xFFFFFFEB & 0x6F9E);
        H.lIIlIIlIlI[127] = -(0x17 ^ 0x46) & (0xFFFF9DFE & 0x6FFF);
        H.lIIlIIlIlI[128] = -(0xFFFFDBD5 & 0x647F) & (0xFFFFDDFF & 0x6FF6);
        H.lIIlIIlIlI[129] = 0xFFFFBFEF & 0x4DB7;
        H.lIIlIIlIlI[130] = -(0xFFFFDA7D & 0x7587) & (0xFFFFDDFF & 0x7F9F);
        H.lIIlIIlIlI[131] = -(0xFFFFF07F & 0x3FD5) & (0xFFFFBFFF & 0x7DFD);
        H.lIIlIIlIlI[132] = -(0xFFFFDFF6 & 0x626B) & (0xFFFFEFF1 & 0x5FFF);
        H.lIIlIIlIlI[133] = -(0xFFFFBF37 & 0x72DF) & (0xFFFFFFFF & 0x3FB7);
        H.lIIlIIlIlI[134] = 0xFFFFBFDF & 0x4DB3;
        H.lIIlIIlIlI[135] = -(0xFFFFC29F & 0x3F61) & (0xFFFF9FFD & 0x6F9F);
        H.lIIlIIlIlI[136] = 0xFFFFADEF & 0x5F9B;
        H.lIIlIIlIlI[137] = -(0xFFFFE347 & 0x7EF9) & (0xFFFFEFF7 & 0x7FFA);
        H.lIIlIIlIlI[138] = 0xFFFF8FB7 & 0x7DD9;
        H.lIIlIIlIlI[139] = -(0xFFFFDBF7 & 0x6669) & (0xFFFFFFFF & 0x4FFE);
        H.lIIlIIlIlI[140] = 0x35 ^ 8;
        H.lIIlIIlIlI[141] = 0x92 ^ 0xAD;
        H.lIIlIIlIlI[142] = 8 ^ 0x48;
        H.lIIlIIlIlI[143] = 55 + 120 - 104 + 129 ^ 44 + 122 - 66 + 37;
        H.lIIlIIlIlI[144] = 0x33 ^ 0x71;
        H.lIIlIIlIlI[145] = 0xF ^ 0x4C;
        H.lIIlIIlIlI[146] = 108 + 64 - 43 + 5 ^ 158 + 109 - 145 + 72;
        H.lIIlIIlIlI[147] = 0xA9 ^ 0xC5 ^ (0x2D ^ 4);
        H.lIIlIIlIlI[148] = 0xF2 ^ 0xB4;
        H.lIIlIIlIlI[149] = 0x3A ^ 0x7D ^ (0xD7 ^ 0x81) & ~(7 ^ 0x51);
        H.lIIlIIlIlI[150] = 7 + 47 - -12 + 73 ^ 93 + 188 - 173 + 87;
        H.lIIlIIlIlI[151] = 75 + 135 - 91 + 76 ^ 2 + 49 - 16 + 103;
        H.lIIlIIlIlI[152] = 0x19 ^ 0x53;
        H.lIIlIIlIlI[153] = 0x71 ^ 0x3A;
        H.lIIlIIlIlI[154] = 0x42 ^ 0xE;
        H.lIIlIIlIlI[155] = 0x12 ^ 0x22 ^ (0xB9 ^ 0xC4);
        H.lIIlIIlIlI[156] = 0x35 ^ 0x7B;
        H.lIIlIIlIlI[157] = 0x34 ^ 0x7B;
        H.lIIlIIlIlI[158] = 0xC7 ^ 0x97;
        H.lIIlIIlIlI[159] = 0xE1 ^ 0xA6 ^ (0x12 ^ 4);
        H.lIIlIIlIlI[160] = 0x29 ^ 0x65 ^ (0x39 ^ 0x27);
        H.lIIlIIlIlI[161] = 0x77 ^ 0x24;
        H.lIIlIIlIlI[162] = 0xFFFFEE7F & 0x1BFF;
        H.lIIlIIlIlI[163] = 0xFFFF8F7E & 0x7DFF;
        H.lIIlIIlIlI[164] = 0xFFFFCEFF & 0x3B9F;
        H.lIIlIIlIlI[165] = 0xFFFFEEEF & 0x1B9D;
        H.lIIlIIlIlI[166] = -(0xFFFFBF2B & 0x75FD) & (0xFFFFFFFB & 0x3FBF);
        H.lIIlIIlIlI[167] = -(0xFFFFB1DF & 0x7F25) & (0xFFFFBFDF & 0x7BAD);
        H.lIIlIIlIlI[168] = -(0xFFFFF7BE & 0x7C71) & (0xFFFFFEFF & 0x7FAF);
        H.lIIlIIlIlI[169] = -(0xFFFFBE79 & 0x71BF) & (0xFFFFBDBF & 0x7FF9);
        H.lIIlIIlIlI[170] = 0xFFFF9BBB & 0x6EED;
        H.lIIlIIlIlI[171] = 0xFFFFEFAB & 0x1DF4;
        H.lIIlIIlIlI[172] = 0x92 ^ 0xC6;
        H.lIIlIIlIlI[173] = 0x16 ^ 0x43;
        H.lIIlIIlIlI[174] = 0x25 ^ 0x73;
        H.lIIlIIlIlI[175] = 2 + 130 - 41 + 161 ^ 78 + 35 - 64 + 122;
        H.lIIlIIlIlI[176] = 0x53 ^ 0xA;
        H.lIIlIIlIlI[177] = 0xE6 ^ 0xBC;
        H.lIIlIIlIlI[178] = 0x98 ^ 0xC3;
        H.lIIlIIlIlI[179] = 0x6D ^ 0x31;
        H.lIIlIIlIlI[180] = 0xD5 ^ 0x88;
        H.lIIlIIlIlI[181] = 0x1D ^ 0x42;
        H.lIIlIIlIlI[182] = 158 + 178 - 262 + 124 ^ 85 + 97 - 45 + 29;
        H.lIIlIIlIlI[183] = 0x2D ^ 0x27 ^ (0x14 ^ 0x7F);
        H.lIIlIIlIlI[184] = 0x67 ^ 0xB ^ (0x8C ^ 0x82);
        H.lIIlIIlIlI[185] = 0x4B ^ 0x28;
        H.lIIlIIlIlI[186] = 0xA3 ^ 0xC7;
        H.lIIlIIlIlI[187] = 0x31 ^ 4 ^ (0x11 ^ 0x41);
        H.lIIlIIlIlI[188] = 0xF4 ^ 0x92;
        H.lIIlIIlIlI[189] = -(0xFFFFF7DF & 0x4BA9) & (0xFFFFEFFF & 0x5FFF);
        H.lIIlIIlIlI[190] = 0xFFFFDDFE & 0x2F57;
        H.lIIlIIlIlI[191] = 0xFFFFBCFF & 0x4F6E;
        H.lIIlIIlIlI[192] = -(0xFFFFF635 & 0x1BCF) & (0xFFFFBF3F & 0x5FFF);
        H.lIIlIIlIlI[193] = -(0xFFFFD5EF & 0x7B91) & (0xFFFFFFE9 & 0x7FDF);
        H.lIIlIIlIlI[194] = 0xA0 ^ 0xC7;
        H.lIIlIIlIlI[195] = 0xFFFFFDFC & 0x177F;
        H.lIIlIIlIlI[196] = -(0xFFFFB3C7 & 0x5E79) & (0xFFFFFBFC & 0x77EB);
        H.lIIlIIlIlI[197] = -(0xFFFFFDAE & 0x4E7B) & (0xFFFFFFAF & 0x4FFD);
        H.lIIlIIlIlI[198] = 0xFFFF9FB7 & 0x63FE;
        H.lIIlIIlIlI[199] = 0xFFFFD79E & 0x2FFF;
        H.lIIlIIlIlI[200] = 0xFFFFE2F6 & 0x3FFF;
        H.lIIlIIlIlI[201] = -(0xAB ^ 0xBA) & (0xFFFFEFDA & 0x3EFF);
        H.lIIlIIlIlI[202] = 0xFFFFEFDF & 0x757E;
        H.lIIlIIlIlI[203] = 0xCE ^ 0xA6;
        H.lIIlIIlIlI[204] = 0x51 ^ 0x38;
        H.lIIlIIlIlI[205] = 0x5D ^ 0x37;
        H.lIIlIIlIlI[206] = 0xAE ^ 0xC2 ^ (0x7B ^ 0x7C);
        H.lIIlIIlIlI[207] = 0x5B ^ 0x37;
        H.lIIlIIlIlI[208] = 0x7A ^ 0x17;
        H.lIIlIIlIlI[209] = -(0xFFFFF5F1 & 0x2F3F) & (0xFFFFEFBF & 0x3FFF);
        H.lIIlIIlIlI[210] = -(0xFFFFD967 & 0x76BD) & (0xFFFFDFFD & 0x7DAF);
        H.lIIlIIlIlI[211] = 148 + 43 - 160 + 200 ^ 105 + 17 - 38 + 53;
        H.lIIlIIlIlI[212] = 0xFFFFBFEF & 0x4D9D;
        H.lIIlIIlIlI[213] = 0xE8 ^ 0xA9 ^ (0x9E ^ 0xB0);
        H.lIIlIIlIlI[214] = -(0xFFFFE5ED & 0x7B7B) & (0xFFFFFBFF & 0x6FFF);
        H.lIIlIIlIlI[215] = -(0xFFFFF0EB & 0x2F77) & (0xFFFFBDFE & 0x6FF7);
        H.lIIlIIlIlI[216] = 181 + 89 - 135 + 69 ^ 92 + 57 - 107 + 146;
        H.lIIlIIlIlI[217] = -(0xFFFFB66E & 0x7DFB) & (0xFFFFFFFF & 0x3EFF);
        H.lIIlIIlIlI[218] = 0x73 ^ 2;
        H.lIIlIIlIlI[219] = -(0xFFFFE32F & 0x3CD9) & (0xFFFFAAE9 & 0x7FBF);
        H.lIIlIIlIlI[220] = 0xFFFFCDFF & 0x3FA5;
        H.lIIlIIlIlI[221] = 0x5C ^ 0x52 ^ (0x41 ^ 0x3D);
        H.lIIlIIlIlI[222] = -(0xFFFFFB5B & 0x56EE) & (0xFFFFFFFF & 0x5FFF);
        H.lIIlIIlIlI[223] = -(0x93 ^ 0x97) & (0xFFFF8F9F & 0x7DFF);
        H.lIIlIIlIlI[224] = 48 + 214 - 89 + 45 ^ 122 + 156 - 189 + 80;
        H.lIIlIIlIlI[225] = -(0xFFFFE7F9 & 0x7A17) & (0xFFFFFFBF & 0x6FFF);
        H.lIIlIIlIlI[226] = 0xFE ^ 0x9C ^ (0x10 ^ 6);
        H.lIIlIIlIlI[227] = 14 + 115 - 79 + 161 ^ 90 + 13 - -38 + 25;
        H.lIIlIIlIlI[228] = 0xFFFFEDB6 & 0x1FDF;
        H.lIIlIIlIlI[229] = -(0xFFFF96EF & 0x7B19) & (0xFFFFFFAC & 0x1FFF);
        H.lIIlIIlIlI[230] = 0xE2 ^ 0x94;
        H.lIIlIIlIlI[231] = -(0xFFFFF6FB & 0x1B45) & (0xFFFFFFEB & 0x1FFF);
        H.lIIlIIlIlI[232] = 188 + 153 - 319 + 197 ^ 93 + 64 - 8 + 23;
        H.lIIlIIlIlI[233] = 0xDE ^ 0xA6;
        H.lIIlIIlIlI[234] = 0xFFFF9FF3 & 0x6DBD;
        H.lIIlIIlIlI[235] = -(0xFFFFB533 & 0x7ECF) & (0xFFFFBFF7 & 0x7DAE);
        H.lIIlIIlIlI[236] = -(0xFFFFD7D7 & 0x3E6D) & (0xFFFFBFFE & 0x5FEF);
        H.lIIlIIlIlI[237] = -(0xFFFFDE13 & 0x63FD) & (0xFFFFCFFF & 0x7F7D);
        H.lIIlIIlIlI[238] = 0x4C ^ 0x35;
    }

    private static boolean lllllIIIllll(int n2, int n3) {
        return n2 <= n3;
    }
}

