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
package -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r;

import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.F;
import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.a;
import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.b;
import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.d;
import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.e;
import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.f;
import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.i;
import gg.squire.account.AccBuilderBarrows;
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

public class G
implements F {
    private static /* synthetic */ WorldPoint iA;
    public static /* synthetic */ boolean bz;
    private static /* synthetic */ int[] lIlllIII;
    static /* synthetic */ WorldArea iy;
    static /* synthetic */ WorldArea iz;
    public static /* synthetic */ int iw;
    public static /* synthetic */ int iu;
    public static /* synthetic */ List<d> bB;
    public static /* synthetic */ int iv;
    private static /* synthetic */ String[] lIllIlIl;
    static /* synthetic */ WorldArea ix;

    private static boolean lIIllIlIIIl(Object object) {
        return object != null;
    }

    /*
     * WARNING - void declaration
     */
    private static void co() {
        WorldArea worldArea = new WorldArea(lIlllIII[46], lIlllIII[47], lIlllIII[12], lIlllIII[20], lIlllIII[0]);
        WorldArea worldArea2 = new WorldArea(lIlllIII[46], lIlllIII[48], lIlllIII[49], lIlllIII[24], lIlllIII[0]);
        WorldArea worldArea3 = new WorldArea(lIlllIII[46], lIlllIII[50], lIlllIII[49], lIlllIII[24], lIlllIII[1]);
        WorldArea worldArea4 = new WorldArea(lIlllIII[51], lIlllIII[52], lIlllIII[53], lIlllIII[54], lIlllIII[3]);
        WorldArea worldArea5 = new WorldArea(lIlllIII[55], lIlllIII[56], lIlllIII[24], lIlllIII[12], lIlllIII[3]);
        WorldArea worldArea6 = new WorldArea(lIlllIII[57], lIlllIII[58], lIlllIII[49], lIlllIII[12], lIlllIII[0]);
        WorldArea worldArea7 = new WorldArea(lIlllIII[59], lIlllIII[60], lIlllIII[12], lIlllIII[20], lIlllIII[0]);
        WorldArea worldArea8 = new WorldArea(lIlllIII[46], lIlllIII[47], lIlllIII[61], lIlllIII[20], lIlllIII[0]);
        if (G.lIIllIlIIII(ix.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && G.lIIllIlIIII(iy.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && G.lIIllIlIIII(iz.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderBarrows.c = lIllIlIl[lIlllIII[12]];
            e.b(iA);
            Time.sleepTicks((int)lIlllIII[1]);
            "".length();
        }
        if ((!G.lIIllIlIIII(ix.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || !G.lIIllIlIIII(iy.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || G.lIIllIIlllI(iz.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) && G.lIIllIlIlIl(Players.getLocal().getAnimation(), lIlllIII[62]) && G.lIIllIlIIII(Players.getLocal().isMoving() ? 1 : 0)) {
            void lIllIIIlllllllI;
            void lIllIIIllllllll;
            void lIllIIlIIIIIIII;
            void lIllIIlIIIIIIIl;
            void lIllIIlIIIIIIlI;
            void lIllIIlIIIIIIll;
            void lIllIIIllllllIl;
            if (G.lIIllIIlllI(lIllIIIllllllIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderBarrows.c = lIllIlIl[lIlllIII[49]];
                String[] stringArray = new String[lIlllIII[1]];
                stringArray[G.lIlllIII[0]] = lIllIlIl[lIlllIII[63]];
                TileObjects.getNearest((String[])stringArray).interact(lIllIlIl[lIlllIII[64]]);
                Time.sleepTicks((int)lIlllIII[3]);
                "".length();
            }
            if (G.lIIllIIlllI(lIllIIlIIIIIIll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderBarrows.c = lIllIlIl[lIlllIII[53]];
                String[] stringArray = new String[lIlllIII[1]];
                stringArray[G.lIlllIII[0]] = lIllIlIl[lIlllIII[38]];
                TileObjects.getNearest((String[])stringArray).interact(lIllIlIl[lIlllIII[65]]);
                Time.sleepTicks((int)lIlllIII[3]);
                "".length();
            }
            if (G.lIIllIIlllI(lIllIIlIIIIIIlI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderBarrows.c = lIllIlIl[lIlllIII[66]];
                String[] stringArray = new String[lIlllIII[1]];
                stringArray[G.lIlllIII[0]] = lIllIlIl[lIlllIII[54]];
                TileObjects.getNearest((String[])stringArray).interact(lIllIlIl[lIlllIII[67]]);
                Time.sleepTicks((int)lIlllIII[3]);
                "".length();
            }
            if (G.lIIllIIlllI(lIllIIlIIIIIIIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderBarrows.c = lIllIlIl[lIlllIII[40]];
                String[] stringArray = new String[lIlllIII[1]];
                stringArray[G.lIlllIII[0]] = lIllIlIl[lIlllIII[68]];
                TileObjects.getNearest((String[])stringArray).interact(lIllIlIl[lIlllIII[61]]);
                Time.sleepTicks((int)lIlllIII[2]);
                "".length();
            }
            if (G.lIIllIIlllI(lIllIIlIIIIIIII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderBarrows.c = lIllIlIl[lIlllIII[69]];
                String[] stringArray = new String[lIlllIII[1]];
                stringArray[G.lIlllIII[0]] = lIllIlIl[lIlllIII[70]];
                TileObjects.getNearest((String[])stringArray).interact(lIllIlIl[lIlllIII[41]]);
                Time.sleepTicks((int)lIlllIII[17]);
                "".length();
            }
            if (G.lIIllIIlllI(lIllIIIllllllll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderBarrows.c = lIllIlIl[lIlllIII[71]];
                String[] stringArray = new String[lIlllIII[1]];
                stringArray[G.lIlllIII[0]] = lIllIlIl[lIlllIII[72]];
                TileObjects.getNearest((String[])stringArray).interact(lIllIlIl[lIlllIII[73]]);
                Time.sleepTicks((int)lIlllIII[10]);
                "".length();
            }
            if (G.lIIllIIlllI(lIllIIIlllllllI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderBarrows.c = lIllIlIl[lIlllIII[74]];
                String[] stringArray = new String[lIlllIII[1]];
                stringArray[G.lIlllIII[0]] = lIllIlIl[lIlllIII[42]];
                TileObjects.getNearest((String[])stringArray).interact(lIllIlIl[lIlllIII[75]]);
                Time.sleepTicks((int)lIlllIII[17]);
                "".length();
            }
        }
    }

    private static boolean lIIllIlIIII(int n2) {
        return n2 == 0;
    }

    private static boolean lIIllIlIllI(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean lIIllIIlllI(int n2) {
        return n2 != 0;
    }

    private static boolean lIIllIlIIlI(int n2, int n3) {
        return n2 > n3;
    }

    @Override
    public boolean T() {
        return lIlllIII[0];
    }

    private static boolean lIIllIlIlII(int n2, int n3) {
        return n2 >= n3;
    }

    private static String lIIlIllllIl(String lIllIIIIIIIIIlI, String lIllIIIIIIIIIll) {
        try {
            SecretKeySpec lIllIIIIIIIIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIllIIIIIIIIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIllIIIIIIIIllI = Cipher.getInstance("Blowfish");
            lIllIIIIIIIIllI.init(lIlllIII[3], lIllIIIIIIIIlll);
            return new String(lIllIIIIIIIIllI.doFinal(Base64.getDecoder().decode(lIllIIIIIIIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIllIIIIIIIIlIl) {
            lIllIIIIIIIIlIl.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean W() {
        boolean bl;
        if (G.lIIllIlIlII(Skills.getLevel((Skill)Skill.AGILITY), lIlllIII[2])) {
            bl = lIlllIII[1];
            "".length();
            if (null != null) {
                return ((0x84 ^ 0xAA) & ~(0x64 ^ 0x4A)) != 0;
            }
        } else {
            bl = lIlllIII[0];
        }
        return bl;
    }

    static {
        G.lIIllIIllIl();
        G.lIIllIIlIIl();
        bB = new ArrayList<d>();
        iu = lIlllIII[27];
        iv = lIlllIII[23];
        ix = new WorldArea(lIlllIII[235], lIlllIII[52], lIlllIII[69], lIlllIII[72], lIlllIII[0]);
        iy = new WorldArea(lIlllIII[235], lIlllIII[52], lIlllIII[69], lIlllIII[72], lIlllIII[1]);
        iz = new WorldArea(lIlllIII[235], lIlllIII[52], lIlllIII[69], lIlllIII[72], lIlllIII[3]);
        iA = new WorldPoint(lIlllIII[236], lIlllIII[237], lIlllIII[0]);
    }

    private static boolean lIIllIIllll(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * WARNING - void declaration
     */
    private static void cr() {
        void lIllIIIlIlIllII;
        void lIllIIIlIllIIlI;
        void lIllIIIlIllIIll;
        void lIllIIIlIllIlII;
        void lIllIIIlIllIlIl;
        WorldArea worldArea = new WorldArea(lIlllIII[162], lIlllIII[163], lIlllIII[111], lIlllIII[111], lIlllIII[0]);
        WorldArea worldArea2 = new WorldArea(lIlllIII[162], lIlllIII[163], lIlllIII[111], lIlllIII[111], lIlllIII[1]);
        WorldArea worldArea3 = new WorldArea(lIlllIII[162], lIlllIII[163], lIlllIII[111], lIlllIII[111], lIlllIII[3]);
        WorldArea worldArea4 = new WorldArea(lIlllIII[162], lIlllIII[163], lIlllIII[111], lIlllIII[111], lIlllIII[10]);
        WorldArea worldArea5 = new WorldArea(lIlllIII[164], lIlllIII[133], lIlllIII[64], lIlllIII[12], lIlllIII[10]);
        WorldArea worldArea6 = new WorldArea(lIlllIII[165], lIlllIII[139], lIlllIII[38], lIlllIII[53], lIlllIII[3]);
        WorldArea worldArea7 = new WorldArea(lIlllIII[166], lIlllIII[134], lIlllIII[49], lIlllIII[26], lIlllIII[3]);
        WorldArea worldArea8 = new WorldArea(lIlllIII[167], lIlllIII[136], lIlllIII[70], lIlllIII[64], lIlllIII[10]);
        WorldArea worldArea9 = new WorldArea(lIlllIII[168], lIlllIII[169], lIlllIII[54], lIlllIII[63], lIlllIII[3]);
        WorldPoint worldPoint = new WorldPoint(lIlllIII[170], lIlllIII[171], lIlllIII[0]);
        if (G.lIIllIIlllI(Dialog.isOpen() ? 1 : 0)) {
            Dialog.close();
        }
        if (G.lIIllIlIIII(lIllIIIlIllIlIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && G.lIIllIlIIII(lIllIIIlIllIlII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && G.lIIllIlIIII(lIllIIIlIllIIll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && G.lIIllIlIIII(lIllIIIlIllIIlI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderBarrows.c = lIllIlIl[lIlllIII[172]];
            Movement.walkTo((WorldPoint)lIllIIIlIlIllII);
            "".length();
            Time.sleepTicks((int)lIlllIII[1]);
            "".length();
        }
        if (G.lIIllIIlllI(lIllIIIlIllIlIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (G.lIIllIlIIlI(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lIllIIIlIlIllII), lIlllIII[20])) {
                AccBuilderBarrows.c = lIllIlIl[lIlllIII[173]];
                Movement.walkTo((WorldPoint)lIllIIIlIlIllII);
                "".length();
                Time.sleepTicks((int)lIlllIII[1]);
                "".length();
            }
            if (G.lIIllIlIllI(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lIllIIIlIlIllII), lIlllIII[20])) {
                AccBuilderBarrows.c = lIllIlIl[lIlllIII[174]];
                int lIllIIIlIlIlIll = Skills.getExperience((Skill)Skill.AGILITY);
                String[] stringArray = new String[lIlllIII[1]];
                stringArray[G.lIlllIII[0]] = lIllIlIl[lIlllIII[175]];
                TileObjects.getNearest((String[])stringArray).interact(lIllIlIl[lIlllIII[35]]);
                Time.sleepTicks((int)e.c(lIlllIII[1], lIlllIII[3]));
                "".length();
                Time.sleepUntil(() -> {
                    boolean bl;
                    if (G.lIIllIlIIlI(Skills.getExperience((Skill)Skill.AGILITY), lIllIIIlIlIlIll)) {
                        bl = lIlllIII[1];
                        "".length();
                        if ("  ".length() != "  ".length()) {
                            return ((3 ^ 0x2D) & ~(0xB ^ 0x25)) != 0;
                        }
                    } else {
                        bl = lIlllIII[0];
                    }
                    return bl;
                }, (int)lIlllIII[104]);
                "".length();
                Time.sleepTicks((int)lIlllIII[1]);
                "".length();
            }
        }
        String[] stringArray = new String[lIlllIII[1]];
        stringArray[G.lIlllIII[0]] = lIllIlIl[lIlllIII[176]];
        TileItem lIllIIIlIlIlIll = TileItems.getNearest((String[])stringArray);
        if (G.lIIllIlIIIl(lIllIIIlIlIlIll) && G.lIIllIIlllI(G.cs() ? 1 : 0)) {
            AccBuilderBarrows.c = lIllIlIl[lIlllIII[177]];
            System.out.println(lIllIlIl[lIlllIII[178]]);
            lIllIIIlIlIlIll.interact(lIllIlIl[lIlllIII[179]]);
            Time.sleepTicks((int)lIlllIII[10]);
            "".length();
        }
        if (G.lIIllIlIIII(G.cs() ? 1 : 0)) {
            void lIllIIIlIlIllIl;
            void lIllIIIlIlIlllI;
            void lIllIIIlIlIllll;
            void lIllIIIlIllIIII;
            int lIllIIIlIlIlIIl;
            TileObject lIllIIIlIlIlIlI;
            void lIllIIIlIllIIIl;
            if (G.lIIllIIlllI(lIllIIIlIllIIIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && G.lIIllIlIIIl(lIllIIIlIlIlIlI = TileObjects.getNearest(tileObject -> {
                int n2;
                if (G.lIIllIIlllI(tileObject.getName().contains(lIllIlIl[lIlllIII[218]]) ? 1 : 0) && G.lIIllIlIllI(tileObject.getWorldLocation().distanceTo(new WorldPoint(lIlllIII[219], lIlllIII[220], lIlllIII[10])), lIlllIII[3])) {
                    n2 = lIlllIII[1];
                    "".length();
                    if ("  ".length() < "  ".length()) {
                        return ((0xB0 ^ 0xAD) & ~(0x49 ^ 0x54)) != 0;
                    }
                } else {
                    n2 = lIlllIII[0];
                }
                return n2 != 0;
            }))) {
                lIllIIIlIlIlIIl = Skills.getExperience((Skill)Skill.AGILITY);
                AccBuilderBarrows.c = lIllIlIl[lIlllIII[180]];
                lIllIIIlIlIlIlI.interact(lIllIlIl[lIlllIII[79]]);
                Time.sleepTicks((int)e.c(lIlllIII[1], lIlllIII[3]));
                "".length();
                Time.sleepUntil(() -> {
                    boolean bl;
                    if (G.lIIllIlIIlI(Skills.getExperience((Skill)Skill.AGILITY), lIllIIIlIlIlIIl)) {
                        bl = lIlllIII[1];
                        "".length();
                        if ((0x3C ^ 0x38) != (0x8C ^ 0x88)) {
                            return ((0xC4 ^ 0x81) & ~(0x6F ^ 0x2A)) != 0;
                        }
                    } else {
                        bl = lIlllIII[0];
                    }
                    return bl;
                }, (int)lIlllIII[104]);
                "".length();
                Time.sleepTicks((int)lIlllIII[1]);
                "".length();
            }
            if (G.lIIllIIlllI(G.cs() ? 1 : 0)) {
                return;
            }
            if (G.lIIllIIlllI(lIllIIIlIllIIII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && G.lIIllIlIIIl(lIllIIIlIlIlIlI = TileObjects.getNearest(tileObject -> {
                int n2;
                if (G.lIIllIIlllI(tileObject.getName().contains(lIllIlIl[lIlllIII[216]]) ? 1 : 0) && G.lIIllIlIllI(tileObject.getWorldLocation().distanceTo(new WorldPoint(lIlllIII[217], lIlllIII[128], lIlllIII[3])), lIlllIII[3])) {
                    n2 = lIlllIII[1];
                    "".length();
                    if (null != null) {
                        return ((0xE0 ^ 0xBE ^ (0x38 ^ 0x50)) & (0xA5 ^ 0xA0 ^ (0x8B ^ 0xB8) ^ -" ".length())) != 0;
                    }
                } else {
                    n2 = lIlllIII[0];
                }
                return n2 != 0;
            }))) {
                AccBuilderBarrows.c = lIllIlIl[lIlllIII[181]];
                lIllIIIlIlIlIIl = Skills.getExperience((Skill)Skill.AGILITY);
                lIllIIIlIlIlIlI.interact(lIllIlIl[lIlllIII[182]]);
                Time.sleepTicks((int)e.c(lIlllIII[1], lIlllIII[3]));
                "".length();
                Time.sleepUntil(() -> {
                    boolean bl;
                    if (G.lIIllIlIIlI(Skills.getExperience((Skill)Skill.AGILITY), lIllIIIlIlIlIIl)) {
                        bl = lIlllIII[1];
                        "".length();
                        if ((0xA3 ^ 0x82 ^ (0x61 ^ 0x44)) < " ".length()) {
                            return ((61 + 98 - 95 + 103 ^ 64 + 19 - 28 + 113) & (0x87 ^ 0x8A ^ "  ".length() ^ -" ".length())) != 0;
                        }
                    } else {
                        bl = lIlllIII[0];
                    }
                    return bl;
                }, (int)lIlllIII[104]);
                "".length();
                Time.sleepTicks((int)lIlllIII[1]);
                "".length();
            }
            if (G.lIIllIIlllI(G.cs() ? 1 : 0)) {
                return;
            }
            if (G.lIIllIIlllI(lIllIIIlIlIllll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && G.lIIllIlIIIl(lIllIIIlIlIlIlI = TileObjects.getNearest(tileObject -> {
                int n2;
                if (G.lIIllIIlllI(tileObject.getName().contains(lIllIlIl[lIlllIII[213]]) ? 1 : 0) && G.lIIllIlIllI(tileObject.getWorldLocation().distanceTo(new WorldPoint(lIlllIII[214], lIlllIII[215], lIlllIII[3])), lIlllIII[3])) {
                    n2 = lIlllIII[1];
                    "".length();
                    if (((0x13 ^ 0x3F) & ~(0x1D ^ 0x31)) >= "  ".length()) {
                        return ((0x23 ^ 0x62) & ~(2 ^ 0x43)) != 0;
                    }
                } else {
                    n2 = lIlllIII[0];
                }
                return n2 != 0;
            }))) {
                AccBuilderBarrows.c = lIllIlIl[lIlllIII[183]];
                lIllIIIlIlIlIIl = Skills.getExperience((Skill)Skill.AGILITY);
                lIllIIIlIlIlIlI.interact(lIllIlIl[lIlllIII[184]]);
                Time.sleepTicks((int)e.c(lIlllIII[1], lIlllIII[3]));
                "".length();
                Time.sleepUntil(() -> {
                    boolean bl;
                    if (G.lIIllIlIIlI(Skills.getExperience((Skill)Skill.AGILITY), lIllIIIlIlIlIIl)) {
                        bl = lIlllIII[1];
                        "".length();
                        if ("  ".length() < "  ".length()) {
                            return ((0xAE ^ 0x9D) & ~(0x23 ^ 0x10)) != 0;
                        }
                    } else {
                        bl = lIlllIII[0];
                    }
                    return bl;
                }, (int)lIlllIII[104]);
                "".length();
                Time.sleepTicks((int)lIlllIII[1]);
                "".length();
            }
            if (G.lIIllIIlllI(G.cs() ? 1 : 0)) {
                return;
            }
            if (G.lIIllIIlllI(lIllIIIlIlIlllI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && G.lIIllIlIIIl(lIllIIIlIlIlIlI = TileObjects.getNearest(tileObject -> {
                int n2;
                if (G.lIIllIIlllI(tileObject.getName().contains(lIllIlIl[lIlllIII[211]]) ? 1 : 0) && G.lIIllIlIllI(tileObject.getWorldLocation().distanceTo(new WorldPoint(lIlllIII[209], lIlllIII[212], lIlllIII[10])), lIlllIII[3])) {
                    n2 = lIlllIII[1];
                    "".length();
                    if (-" ".length() > -" ".length()) {
                        return ((0x98 ^ 0x8C) & ~(0x30 ^ 0x24)) != 0;
                    }
                } else {
                    n2 = lIlllIII[0];
                }
                return n2 != 0;
            }))) {
                AccBuilderBarrows.c = lIllIlIl[lIlllIII[185]];
                lIllIIIlIlIlIIl = Skills.getExperience((Skill)Skill.AGILITY);
                lIllIIIlIlIlIlI.interact(lIllIlIl[lIlllIII[186]]);
                Time.sleepTicks((int)e.c(lIlllIII[1], lIlllIII[3]));
                "".length();
                Time.sleepUntil(() -> {
                    boolean bl;
                    if (G.lIIllIlIIlI(Skills.getExperience((Skill)Skill.AGILITY), lIllIIIlIlIlIIl)) {
                        bl = lIlllIII[1];
                        "".length();
                        if (((0x36 ^ 0x2D) & ~(0x65 ^ 0x7E)) != 0) {
                            return ((0xD8 ^ 0x99) & ~(0x61 ^ 0x20)) != 0;
                        }
                    } else {
                        bl = lIlllIII[0];
                    }
                    return bl;
                }, (int)lIlllIII[104]);
                "".length();
                Time.sleepTicks((int)lIlllIII[1]);
                "".length();
            }
            if (G.lIIllIIlllI(G.cs() ? 1 : 0)) {
                return;
            }
            if (G.lIIllIIlllI(lIllIIIlIlIllIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && G.lIIllIlIIIl(lIllIIIlIlIlIlI = TileObjects.getNearest(tileObject -> {
                int n2;
                if (G.lIIllIIlllI(tileObject.getName().contains(lIllIlIl[lIlllIII[208]]) ? 1 : 0) && G.lIIllIlIllI(tileObject.getWorldLocation().distanceTo(new WorldPoint(lIlllIII[209], lIlllIII[210], lIlllIII[3])), lIlllIII[3])) {
                    n2 = lIlllIII[1];
                    "".length();
                    if (null != null) {
                        return ((0xC2 ^ 0xA0) & ~(0x72 ^ 0x10)) != 0;
                    }
                } else {
                    n2 = lIlllIII[0];
                }
                return n2 != 0;
            }))) {
                AccBuilderBarrows.c = lIllIlIl[lIlllIII[187]];
                lIllIIIlIlIlIIl = Skills.getExperience((Skill)Skill.AGILITY);
                lIllIIIlIlIlIlI.interact(lIllIlIl[lIlllIII[188]]);
                Time.sleepTicks((int)e.c(lIlllIII[1], lIlllIII[3]));
                "".length();
                Time.sleepUntil(() -> {
                    boolean bl;
                    if (G.lIIllIlIIlI(Skills.getExperience((Skill)Skill.AGILITY), lIllIIIlIlIlIIl)) {
                        bl = lIlllIII[1];
                        "".length();
                        if ((0x8F ^ 0x8A) == 0) {
                            return ((0x29 ^ 0x11) & ~(0x49 ^ 0x71)) != 0;
                        }
                    } else {
                        bl = lIlllIII[0];
                    }
                    return bl;
                }, (int)lIlllIII[104]);
                "".length();
                Time.sleepTicks((int)lIlllIII[1]);
                "".length();
            }
        }
    }

    private static boolean lIIllIlIIll(int n2) {
        return n2 > 0;
    }

    private static String lIIlIlllIll(String lIllIIIIIIlIIIl, String lIllIIIIIIlIIII) {
        try {
            SecretKeySpec lIllIIIIIIlIlII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIllIIIIIIlIIII.getBytes(StandardCharsets.UTF_8)), lIlllIII[24]), "DES");
            Cipher lIllIIIIIIlIIll = Cipher.getInstance("DES");
            lIllIIIIIIlIIll.init(lIlllIII[3], lIllIIIIIIlIlII);
            return new String(lIllIIIIIIlIIll.doFinal(Base64.getDecoder().decode(lIllIIIIIIlIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIllIIIIIIlIIlI) {
            lIllIIIIIIlIIlI.printStackTrace();
            return null;
        }
    }

    @Override
    public int U() {
        try {
            G.cn();
            "".length();
        }
        catch (Exception exception) {
            // empty catch block
        }
        if ("  ".length() < 0) {
            return (0x9C ^ 0xA9) & ~(0x1E ^ 0x2B);
        }
        return lIlllIII[186];
    }

    public static void cn() {
        if (G.lIIllIIlllI(bz ? 1 : 0)) {
            AccBuilderBarrows.c = lIllIlIl[lIlllIII[0]];
            b.a(bB);
            if (G.lIIllIIllll(bB.size(), lIlllIII[1])) {
                System.out.println(lIllIlIl[lIlllIII[1]]);
                bz = lIlllIII[0];
            }
        }
        if (G.lIIllIlIIII(bz ? 1 : 0) && G.lIIllIIllll(Skills.getLevel((Skill)Skill.AGILITY), lIlllIII[2])) {
            if (G.lIIllIlIIII(G.ac() ? 1 : 0)) {
                BankLocation lIllIIlIIIIllll = BankLocation.getNearest();
                if (G.lIIllIlIIIl(lIllIIlIIIIllll) && G.lIIllIlIIII(lIllIIlIIIIllll.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderBarrows.c = lIllIlIl[lIlllIII[3]];
                    WorldArea lIllIIlIIIIlllI = new WorldArea(lIlllIII[4], lIlllIII[5], lIlllIII[6], lIlllIII[7], lIlllIII[0]);
                    if (G.lIIllIIlllI(lIllIIlIIIIlllI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        WorldPoint lIllIIlIIIIllIl = new WorldPoint(lIlllIII[8], lIlllIII[9], lIlllIII[0]);
                        if (G.lIIllIlIIlI(Players.getLocal().getWorldLocation().distanceTo(lIllIIlIIIIllIl), lIlllIII[10])) {
                            Movement.walkTo((WorldPoint)lIllIIlIIIIllIl);
                            "".length();
                            Time.sleepTicks((int)lIlllIII[1]);
                            "".length();
                        }
                    }
                    a.a(lIllIIlIIIIllll);
                }
                if (G.lIIllIlIIIl(lIllIIlIIIIllll) && G.lIIllIIlllI(lIllIIlIIIIllll.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderBarrows.c = lIllIlIl[lIlllIII[10]];
                    if (G.lIIllIlIIII(Bank.isOpen() ? 1 : 0)) {
                        a.a();
                        Time.sleepUntil(() -> Bank.isOpen(), (int)lIlllIII[11]);
                        "".length();
                    }
                    if (G.lIIllIIlllI(Bank.isOpen() ? 1 : 0)) {
                        if (G.lIIllIlIIll(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks((int)lIlllIII[1]);
                            "".length();
                        }
                        if (G.lIIllIlIIll(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks((int)lIlllIII[3]);
                            "".length();
                        }
                    }
                    int[] nArray = new int[lIlllIII[12]];
                    nArray[G.lIlllIII[0]] = lIlllIII[13];
                    nArray[G.lIlllIII[1]] = lIlllIII[14];
                    nArray[G.lIlllIII[3]] = lIlllIII[15];
                    nArray[G.lIlllIII[10]] = lIlllIII[16];
                    nArray[G.lIlllIII[17]] = lIlllIII[18];
                    nArray[G.lIlllIII[2]] = lIlllIII[19];
                    nArray[G.lIlllIII[20]] = lIlllIII[21];
                    nArray[G.lIlllIII[22]] = lIlllIII[23];
                    nArray[G.lIlllIII[24]] = lIlllIII[25];
                    nArray[G.lIlllIII[26]] = lIlllIII[27];
                    if (G.lIIllIlIIII(e.b(nArray) ? 1 : 0)) {
                        G.ag();
                        System.out.println(lIllIlIl[lIlllIII[17]]);
                        bz = lIlllIII[1];
                        return;
                    }
                    int[] nArray2 = new int[lIlllIII[12]];
                    nArray2[G.lIlllIII[0]] = lIlllIII[13];
                    nArray2[G.lIlllIII[1]] = lIlllIII[14];
                    nArray2[G.lIlllIII[3]] = lIlllIII[15];
                    nArray2[G.lIlllIII[10]] = lIlllIII[16];
                    nArray2[G.lIlllIII[17]] = lIlllIII[18];
                    nArray2[G.lIlllIII[2]] = lIlllIII[19];
                    nArray2[G.lIlllIII[20]] = lIlllIII[21];
                    nArray2[G.lIlllIII[22]] = lIlllIII[23];
                    nArray2[G.lIlllIII[24]] = lIlllIII[25];
                    nArray2[G.lIlllIII[26]] = lIlllIII[27];
                    if (G.lIIllIIlllI(e.b(nArray2) ? 1 : 0)) {
                        a.a(lIlllIII[28], lIlllIII[1]);
                        a.a(lIlllIII[29], lIlllIII[1]);
                        a.a(lIlllIII[30], lIlllIII[1]);
                        a.a(lIlllIII[31], lIlllIII[1]);
                        a.a(lIlllIII[32], lIlllIII[1]);
                        a.a(lIlllIII[33], lIlllIII[1]);
                        a.a(lIlllIII[34], lIlllIII[1]);
                        int[] nArray3 = new int[lIlllIII[1]];
                        nArray3[G.lIlllIII[0]] = lIlllIII[28];
                        if (G.lIIllIlIIII(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                            int[] nArray4 = new int[lIlllIII[1]];
                            nArray4[G.lIlllIII[0]] = lIlllIII[28];
                            if (G.lIIllIlIIII(Equipment.contains((int[])nArray4) ? 1 : 0)) {
                                int[] nArray5 = new int[lIlllIII[1]];
                                nArray5[G.lIlllIII[0]] = lIlllIII[28];
                                if (G.lIIllIlIIII(Bank.contains((int[])nArray5) ? 1 : 0)) {
                                    a.a(lIlllIII[35], lIlllIII[1]);
                                }
                            }
                        }
                        a.a(lIlllIII[18], lIlllIII[1]);
                        e.l(lIlllIII[28]);
                        e.l(lIlllIII[29]);
                        e.l(lIlllIII[30]);
                        e.l(lIlllIII[31]);
                        e.l(lIlllIII[32]);
                        Time.sleepTicks((int)lIlllIII[1]);
                        "".length();
                        e.l(lIlllIII[34]);
                        e.l(lIlllIII[36]);
                        e.l(lIlllIII[33]);
                        e.l(lIlllIII[35]);
                        e.l(lIlllIII[18]);
                        Time.sleepTicks((int)lIlllIII[10]);
                        "".length();
                        if (G.lIIllIlIIII(Bank.isOpen() ? 1 : 0)) {
                            a.a();
                            Time.sleepTicks((int)lIlllIII[20]);
                            "".length();
                        }
                        if (G.lIIllIIlllI(Bank.isOpen() ? 1 : 0)) {
                            if (G.lIIllIIllll(Skills.getLevel((Skill)Skill.AGILITY), lIlllIII[37])) {
                                a.a(lIlllIII[13], lIlllIII[12]);
                                a.a(lIlllIII[14], lIlllIII[12]);
                                a.a(lIlllIII[21], lIlllIII[12]);
                                a.a(lIlllIII[15], lIlllIII[12]);
                                a.b(f.bl, lIlllIII[1]);
                                a.a(lIlllIII[27], lIlllIII[1]);
                                a.a(lIlllIII[19], lIlllIII[2]);
                                a.a(lIlllIII[23], lIlllIII[38]);
                            }
                            if (G.lIIllIlIlII(Skills.getLevel((Skill)Skill.AGILITY), lIlllIII[37])) {
                                a.a(lIlllIII[13], lIlllIII[12]);
                                a.a(lIlllIII[21], lIlllIII[12]);
                                a.a(lIlllIII[25], lIlllIII[12]);
                                a.b(f.bl, lIlllIII[1]);
                                a.a(lIlllIII[27], lIlllIII[1]);
                                a.a(lIlllIII[19], lIlllIII[24]);
                                a.a(lIlllIII[23], lIlllIII[12]);
                            }
                        }
                    }
                }
            }
            if (G.lIIllIIlllI(G.ac() ? 1 : 0)) {
                String[] stringArray = new String[lIlllIII[1]];
                stringArray[G.lIlllIII[0]] = lIllIlIl[lIlllIII[2]];
                if (G.lIIllIIlllI(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    String[] stringArray2 = new String[lIlllIII[1]];
                    stringArray2[G.lIlllIII[0]] = lIllIlIl[lIlllIII[20]];
                    Inventory.getFirst((String[])stringArray2).interact(lIllIlIl[lIlllIII[22]]);
                }
                if (G.lIIllIIlllI(Inventory.contains((int[])f.bb) ? 1 : 0) && G.lIIllIIllll(Movement.getRunEnergy(), lIlllIII[39])) {
                    Inventory.getFirst((int[])f.bb).interact(lIllIlIl[lIlllIII[24]]);
                    Time.sleepTicks((int)lIlllIII[1]);
                    "".length();
                }
                if (G.lIIllIlIIlI(Combat.getMissingHealth(), lIlllIII[40])) {
                    int[] nArray = new int[lIlllIII[1]];
                    nArray[G.lIlllIII[0]] = lIlllIII[23];
                    if (G.lIIllIIlllI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        int[] nArray6 = new int[lIlllIII[1]];
                        nArray6[G.lIlllIII[0]] = lIlllIII[23];
                        Inventory.getFirst((int[])nArray6).interact(lIllIlIl[lIlllIII[26]]);
                        Time.sleepTicks((int)lIlllIII[3]);
                        "".length();
                    }
                }
                if (G.lIIllIlIIlI(Movement.getRunEnergy(), lIlllIII[41]) && G.lIIllIlIIII(Movement.isRunEnabled() ? 1 : 0)) {
                    Movement.toggleRun();
                }
                if (G.lIIllIIllll(Skills.getLevel((Skill)Skill.AGILITY), lIlllIII[42])) {
                    G.co();
                }
                if ((!G.lIIllIlIlII(e.j(lIlllIII[43]), lIlllIII[44]) || G.lIIllIIllll(e.j(lIlllIII[45]), lIlllIII[2])) && G.lIIllIlIlII(Skills.getLevel((Skill)Skill.AGILITY), lIlllIII[42]) && G.lIIllIIllll(Skills.getLevel((Skill)Skill.AGILITY), lIlllIII[44])) {
                    G.cp();
                }
                if (G.lIIllIlIlII(e.j(lIlllIII[43]), lIlllIII[44]) && G.lIIllIlIlII(e.j(lIlllIII[45]), lIlllIII[2])) {
                    if (G.lIIllIlIlII(Skills.getLevel((Skill)Skill.AGILITY), lIlllIII[42]) && G.lIIllIIllll(Skills.getLevel((Skill)Skill.AGILITY), lIlllIII[37])) {
                        G.cp();
                    }
                    if (G.lIIllIlIlII(Skills.getLevel((Skill)Skill.AGILITY), lIlllIII[37]) && G.lIIllIIllll(Skills.getLevel((Skill)Skill.AGILITY), lIlllIII[44])) {
                        G.cq();
                    }
                }
                if (G.lIIllIlIlII(Skills.getLevel((Skill)Skill.AGILITY), lIlllIII[44])) {
                    G.cr();
                }
            }
        }
    }

    private static void lIIllIIlIIl() {
        lIllIlIl = new String[lIlllIII[238]];
        G.lIllIlIl[G.lIlllIII[0]] = G.lIIlIlllIll("qwpNqffto+pyY50FzwoPDw==", "AUXdi");
        G.lIllIlIl[G.lIlllIII[1]] = G.lIIlIllllII("PxogLDcRFiplJgwKJysjWRo6ICkKX242MxAHLS0tFxRuJyUaGG4xK1kSKSwoEAc3", "ysNED");
        G.lIllIlIl[G.lIlllIII[3]] = G.lIIlIllllIl("gl68Szb5dVHKeCgT5pr8Uypp6+TlvURz", "smlIE");
        G.lIllIlIl[G.lIlllIII[10]] = G.lIIlIllllII("KyABLzkKLwhrNwIvBCI7BA==", "cAoKU");
        G.lIllIlIl[G.lIlllIII[17]] = G.lIIlIllllII("JSRqMTMXYSc5MgEoJDdhAzQvIzVSMj8gMR4oLyNtUjI9OTURKSM+JlI1JXADJxgDHgY=", "rAJPA");
        G.lIllIlIl[G.lIlllIII[2]] = G.lIIlIlllIll("6383vEVI91Q=", "BHUjr");
        G.lIllIlIl[G.lIlllIII[20]] = G.lIIlIllllII("OBwnPQ==", "nuFQW");
        G.lIllIlIl[G.lIlllIII[22]] = G.lIIlIllllIl("u4aMwdNk/uM=", "giLRq");
        G.lIllIlIl[G.lIlllIII[24]] = G.lIIlIlllIll("eb8ZWvHqZuk=", "mRNpa");
        G.lIllIlIl[G.lIlllIII[26]] = G.lIIlIlllIll("YmzXHiXIGIk=", "cnGbf");
        G.lIllIlIl[G.lIlllIII[12]] = G.lIIlIlllIll("C/SveY3rvQ0Kv2q5fJx1N2WeChEJRX5X", "MBgQs");
        G.lIllIlIl[G.lIlllIII[49]] = G.lIIlIllllIl("TwfP2nMlzfNruiu4RA5gBQ==", "RRXMI");
        G.lIllIlIl[G.lIlllIII[63]] = G.lIIlIllllIl("jhKd5asvHGMGJtMEd4DsYw==", "UIaMP");
        G.lIllIlIl[G.lIlllIII[64]] = G.lIIlIllllIl("Pmmsb9m1UQTddB0JNVTQaA==", "awEsU");
        G.lIllIlIl[G.lIlllIII[53]] = G.lIIlIlllIll("YGWTRiKmgknAE39IPz3gSA==", "gOhJC");
        G.lIllIlIl[G.lIlllIII[38]] = G.lIIlIllllIl("g6vdbxhwQZehe3OdZ4imkg==", "LZkWS");
        G.lIllIlIl[G.lIlllIII[65]] = G.lIIlIllllII("AT4+FRVvPSEdBQ==", "BRWxw");
        G.lIllIlIl[G.lIlllIII[66]] = G.lIIlIlllIll("BkWNqf7/TQ3b1ZdsMfqAaA==", "aEZca");
        G.lIllIlIl[G.lIlllIII[54]] = G.lIIlIllllIl("qcDihG9/N0BACHiL4M4FYg==", "Jgqop");
        G.lIllIlIl[G.lIlllIII[67]] = G.lIIlIllllIl("3NVwGhlg6mM=", "CtZvl");
        G.lIllIlIl[G.lIlllIII[40]] = G.lIIlIllllIl("jEsp1U7aN9jSc3GnsDN3hQ==", "IJCPe");
        G.lIllIlIl[G.lIlllIII[68]] = G.lIIlIlllIll("qUMYwZvc2NMgMDh6DZ9qBg==", "YCDqM");
        G.lIllIlIl[G.lIlllIII[61]] = G.lIIlIllllIl("E6gQVQta3E0=", "gvNKE");
        G.lIllIlIl[G.lIlllIII[69]] = G.lIIlIllllII("Ah4cATooHBJMPC4FGw==", "ArulX");
        G.lIllIlIl[G.lIlllIII[70]] = G.lIIlIllllIl("6zEAWoYeoCIv9EhBq1zCkQ==", "kJYlz");
        G.lIllIlIl[G.lIlllIII[41]] = G.lIIlIlllIll("9T02Vqk8EmsP99ZWqO5a+Q==", "TXrgN");
        G.lIllIlIl[G.lIlllIII[71]] = G.lIIlIlllIll("mllGoXYpOFXQcHRBQfAYng==", "BYABS");
        G.lIllIlIl[G.lIlllIII[72]] = G.lIIlIllllII("CzAAAC8nPhZUICEm", "DRstN");
        G.lIllIlIl[G.lIlllIII[73]] = G.lIIlIlllIll("LiLVj3FeisJ4kg/qmAAexA==", "aSeQM");
        G.lIllIlIl[G.lIlllIII[74]] = G.lIIlIllllIl("MA92f3GOempIPwlOvcW5/Q==", "qGQmg");
        G.lIllIlIl[G.lIlllIII[42]] = G.lIIlIllllII("ACorAygsJD1XOSY4PQ==", "OHXwI");
        G.lIllIlIl[G.lIlllIII[75]] = G.lIIlIllllIl("/yH8Q9wwAZIF/ZHBZw+O3g==", "qOIeS");
        G.lIllIlIl[G.lIlllIII[95]] = G.lIIlIllllIl("Z1eyc6eXdo/OPq5kVW/0bw==", "MuNNy");
        G.lIllIlIl[G.lIlllIII[97]] = G.lIIlIlllIll("3SLZiZkhw1ufVU2dyyDL+Q==", "JlUGf");
        G.lIllIlIl[G.lIlllIII[98]] = G.lIIlIllllII("AwQzPBgwRTU0BDw=", "WeXUv");
        G.lIllIlIl[G.lIlllIII[99]] = G.lIIlIllllII("NCw7HitSLi8CJFIsIFAoACw7His=", "rCNpO");
        G.lIllIlIl[G.lIlllIII[100]] = G.lIIlIlllIll("59JSDD7FyyU=", "Ijohe");
        G.lIllIlIl[G.lIlllIII[101]] = G.lIIlIllllIl("D4kI5VZGOYElhDJfnnOuyA==", "nxDkM");
        G.lIllIlIl[G.lIlllIII[102]] = G.lIIlIllllII("HQcRDAFvHwUHBQ==", "Ohdki");
        G.lIllIlIl[G.lIlllIII[103]] = G.lIIlIllllII("LhgRCwE=", "mtxfc");
        G.lIllIlIl[G.lIlllIII[37]] = G.lIIlIllllII("NxQ3GxkdCD9ICRgJLAAPB0Y0AQQR", "tfXhj");
        G.lIllIlIl[G.lIlllIII[105]] = G.lIIlIlllIll("LhL+owqm07OzGTWX5xQJFw==", "KYiOD");
        G.lIllIlIl[G.lIlllIII[106]] = G.lIIlIllllIl("bCF5KKXvlZg=", "DslUu");
        G.lIllIlIl[G.lIlllIII[107]] = G.lIIlIllllII("GS8yBic7LQ==", "UJSvN");
        G.lIllIlIl[G.lIlllIII[108]] = G.lIIlIllllIl("89muotG4K2E=", "DeUam");
        G.lIllIlIl[G.lIlllIII[109]] = G.lIIlIllllIl("zIy3Meje17g=", "kCBxs");
        G.lIllIlIl[G.lIlllIII[110]] = G.lIIlIlllIll("hnGol5kyJqUqWBYRpyFrhA==", "zcBKr");
        G.lIllIlIl[G.lIlllIII[111]] = G.lIIlIlllIll("lEDrH1+Gjsw=", "juiou");
        G.lIllIlIl[G.lIlllIII[112]] = G.lIIlIllllIl("p/eX+A1rW3I=", "Kxppe");
        G.lIllIlIl[G.lIlllIII[113]] = G.lIIlIllllIl("9CBlEqKvfCP23nLblpmabw==", "vleUC");
        G.lIllIlIl[G.lIlllIII[39]] = G.lIIlIllllIl("szftA7QEBkg=", "tLevI");
        G.lIllIlIl[G.lIlllIII[7]] = G.lIIlIllllII("Cy87Bw==", "GJZwO");
        G.lIllIlIl[G.lIlllIII[114]] = G.lIIlIllllIl("AxTEYot9iJTFneK03XFO/g==", "vLVkT");
        G.lIllIlIl[G.lIlllIII[116]] = G.lIIlIlllIll("1MNhF6XrAbw=", "riHyu");
        G.lIllIlIl[G.lIlllIII[117]] = G.lIIlIlllIll("N4bAh1VxYK+2o4OOM7rDeQ==", "okEuj");
        G.lIllIlIl[G.lIlllIII[119]] = G.lIIlIllllII("KRw5IQ==", "eyXQh");
        G.lIllIlIl[G.lIlllIII[120]] = G.lIIlIlllIll("x4FIXgLlIR6V1XMkZVyI+g==", "jdlWd");
        G.lIllIlIl[G.lIlllIII[122]] = G.lIIlIllllII("EAEGDxU9", "Xttky");
        G.lIllIlIl[G.lIlllIII[123]] = G.lIIlIlllIll("jfb4gUrQ5IaoLj5v10kLgMA2TDT3NBCc", "ckSGC");
        G.lIllIlIl[G.lIlllIII[124]] = G.lIIlIlllIll("LodsSHuI0IQ=", "gDyQJ");
        G.lIllIlIl[G.lIlllIII[44]] = G.lIIlIllllIl("TEvfjSY8gqwxv6HbXqXN9w==", "VuzaZ");
        G.lIllIlIl[G.lIlllIII[140]] = G.lIIlIllllII("OjIPei4bcxo7NBU1ECl6FzwMKCkR", "tSyZZ");
        G.lIllIlIl[G.lIlllIII[6]] = G.lIIlIllllII("LSkwVD8MaDUAKhE8", "cHFtK");
        G.lIllIlIl[G.lIlllIII[141]] = G.lIIlIllllIl("CfrYFsAip8U0p/MzGMeoyg==", "JkRcz");
        G.lIllIlIl[G.lIlllIII[142]] = G.lIIlIllllIl("HMytvXv9SeT6sq+NsHEzIQ==", "IdWzu");
        G.lIllIlIl[G.lIlllIII[143]] = G.lIIlIllllIl("/jp+oxEXM+k=", "IWEZI");
        G.lIllIlIl[G.lIlllIII[144]] = G.lIIlIllllIl("GmaoCxyezFhyKdugzhcScQ==", "hiyDG");
        G.lIllIlIl[G.lIlllIII[145]] = G.lIIlIlllIll("aV28nNRTIRmESz4pW12Cmg==", "NdgoF");
        G.lIllIlIl[G.lIlllIII[146]] = G.lIIlIllllII("DhcNLR5oFRkxEWgXFmMdOhcNLR4=", "HxxCz");
        G.lIllIlIl[G.lIlllIII[147]] = G.lIIlIllllIl("jYc4pvhMO9c=", "ZcxUb");
        G.lIllIlIl[G.lIlllIII[148]] = G.lIIlIllllII("JR4GIgUBDEs1DR9LWg==", "okkRl");
        G.lIllIlIl[G.lIlllIII[149]] = G.lIIlIllllIl("CUxXr1S3HpU=", "IACAo");
        G.lIllIlIl[G.lIlllIII[150]] = G.lIIlIllllII("LR8ZJiIJDVQxKhdKRg==", "gjtVK");
        G.lIllIlIl[G.lIlllIII[151]] = G.lIIlIlllIll("TcktfcupCIE=", "hppnD");
        G.lIllIlIl[G.lIlllIII[152]] = G.lIIlIlllIll("OinQ8xiU6OZm9/PaP7O5hQ==", "SAVOh");
        G.lIllIlIl[G.lIlllIII[153]] = G.lIIlIlllIll("sf0+CeBJCCY=", "kpVrB");
        G.lIllIlIl[G.lIlllIII[154]] = G.lIIlIllllIl("Qge+dNjQPfvtKC0vfIPD0g==", "EqdUe");
        G.lIllIlIl[G.lIlllIII[155]] = G.lIIlIlllIll("Upv+vwVDv00=", "HHufL");
        G.lIllIlIl[G.lIlllIII[156]] = G.lIIlIlllIll("BAxvH+WGq0ELU6II6GoMhA==", "tgVFM");
        G.lIllIlIl[G.lIlllIII[157]] = G.lIIlIllllIl("EQR6BUsZaVM=", "uwEfd");
        G.lIllIlIl[G.lIlllIII[158]] = G.lIIlIlllIll("9r2p9b1tPRM4v5iQIe6M8w==", "sUZra");
        G.lIllIlIl[G.lIlllIII[159]] = G.lIIlIllllII("BB8fFQ==", "Njreh");
        G.lIllIlIl[G.lIlllIII[160]] = G.lIIlIlllIll("EVuR1a7U67IL5+G7OZe0Xg==", "vRtxF");
        G.lIllIlIl[G.lIlllIII[161]] = G.lIIlIlllIll("xib+FswDp7k=", "Pohjl");
        G.lIllIlIl[G.lIlllIII[172]] = G.lIIlIllllIl("jmOcVJIHJiYCvbkBScbRIOvYDAKAaOUW", "fVUbs");
        G.lIllIlIl[G.lIlllIII[173]] = G.lIIlIlllIll("+rXtImd7b+pzQKIZOAbOdA==", "VqywP");
        G.lIllIlIl[G.lIlllIII[174]] = G.lIIlIllllIl("3PKUuGUAVS7zQJIjylJfeg==", "QrJoL");
        G.lIllIlIl[G.lIlllIII[175]] = G.lIIlIllllIl("1d8manz4Zkg=", "wCFJg");
        G.lIllIlIl[G.lIlllIII[35]] = G.lIIlIllllIl("aGExk9sf0qB98PVGaYPmkQ==", "gWUqt");
        G.lIllIlIl[G.lIlllIII[176]] = G.lIIlIlllIll("LA0TU6Mb7gwPp77clKeM8g==", "eBofp");
        G.lIllIlIl[G.lIlllIII[177]] = G.lIIlIllllIl("jnLWbsY3BEXB6e1GOhapLg==", "tWgaa");
        G.lIllIlIl[G.lIlllIII[178]] = G.lIIlIlllIll("bhWtjz7PmuXSf/+eUS+n0SOawSAthP8P", "jtbnV");
        G.lIllIlIl[G.lIlllIII[179]] = G.lIIlIllllII("GwMxBA==", "ObZaT");
        G.lIllIlIl[G.lIlllIII[180]] = G.lIIlIllllIl("SLaXlKlZUGFHCnwwSgOZOw==", "Mimtk");
        G.lIllIlIl[G.lIlllIII[79]] = G.lIIlIllllII("MDkBCQ==", "zLlyb");
        G.lIllIlIl[G.lIlllIII[181]] = G.lIIlIllllII("CQsKIiFKCwohNw==", "jyeQR");
        G.lIllIlIl[G.lIlllIII[182]] = G.lIIlIllllIl("MAm6Jj9bw/g=", "DtFFb");
        G.lIllIlIl[G.lIlllIII[183]] = G.lIIlIllllIl("qW9WGfLIqho+PTbJ1aN0Rg==", "eqSYf");
        G.lIllIlIl[G.lIlllIII[184]] = G.lIIlIllllIl("ybx5J2bX+IY=", "faikq");
        G.lIllIlIl[G.lIlllIII[185]] = G.lIIlIllllIl("18Njp6CFskHR6CmkcH0y8Q==", "hdzEm");
        G.lIllIlIl[G.lIlllIII[186]] = G.lIIlIlllIll("XoW6a3GfHSA=", "gbaMK");
        G.lIllIlIl[G.lIlllIII[187]] = G.lIIlIlllIll("lD/X6K3Pj6AWAjPmtizcyg==", "nGMrQ");
        G.lIllIlIl[G.lIlllIII[188]] = G.lIIlIlllIll("G56fN/u95QQ=", "flrvD");
        G.lIllIlIl[G.lIlllIII[194]] = G.lIIlIlllIll("IxFA4s4ing39WTn/yZWTL0rok84JwRzn", "oSWBV");
        G.lIllIlIl[G.lIlllIII[203]] = G.lIIlIllllII("CC0iPic9Mw==", "IJKRN");
        G.lIllIlIl[G.lIlllIII[204]] = G.lIIlIllllII("MhQwCw0lEA==", "BuCxl");
        G.lIllIlIl[G.lIlllIII[205]] = G.lIIlIllllIl("kiHfgOazDOc=", "fqKlq");
        G.lIllIlIl[G.lIlllIII[206]] = G.lIIlIlllIll("a2heAu9OopM=", "mzkeS");
        G.lIllIlIl[G.lIlllIII[207]] = G.lIIlIlllIll("YZSr4N991II=", "thNfU");
        G.lIllIlIl[G.lIlllIII[208]] = G.lIIlIllllIl("L9DCwcEbq00=", "yfKUe");
        G.lIllIlIl[G.lIlllIII[211]] = G.lIIlIllllIl("ViaZAWceyYs=", "eZOiN");
        G.lIllIlIl[G.lIlllIII[213]] = G.lIIlIllllII("LSI4", "jCHJH");
        G.lIllIlIl[G.lIlllIII[216]] = G.lIIlIlllIll("FMCa+ykWdsHHtHySzLzDbA==", "VGtxP");
        G.lIllIlIl[G.lIlllIII[218]] = G.lIIlIllllIl("wus7yLCXyIM=", "QirPh");
        G.lIllIlIl[G.lIlllIII[221]] = G.lIIlIllllII("MTAe", "vQnFI");
        G.lIllIlIl[G.lIlllIII[224]] = G.lIIlIllllIl("S241PpYwjpE=", "cDOBU");
        G.lIllIlIl[G.lIlllIII[226]] = G.lIIlIlllIll("PvNuexSITg1ThRIOC+MBdg==", "CyaES");
        G.lIllIlIl[G.lIlllIII[227]] = G.lIIlIllllIl("XC3zQW9gLDM=", "wuHSp");
        G.lIllIlIl[G.lIlllIII[230]] = G.lIIlIllllII("JDc8", "cVLyU");
        G.lIllIlIl[G.lIlllIII[232]] = G.lIIlIllllIl("N3vWrKqRrdI=", "IoJPC");
        G.lIllIlIl[G.lIlllIII[233]] = G.lIIlIllllIl("EstXcgT7vXA=", "vaZjB");
    }

    public static void ag() {
        d lIllIIIIllllIIl;
        block18: {
            block17: {
                block16: {
                    block15: {
                        int[] nArray = new int[lIlllIII[1]];
                        nArray[G.lIlllIII[0]] = lIlllIII[16];
                        if (G.lIIllIlIIII(Bank.contains((int[])nArray) ? 1 : 0)) {
                            d d2 = new d(lIlllIII[16], lIlllIII[1], lIlllIII[195]);
                            bB.add(d2);
                            "".length();
                        }
                        int[] nArray2 = new int[lIlllIII[1]];
                        nArray2[G.lIlllIII[0]] = lIlllIII[18];
                        if (G.lIIllIlIIII(Bank.contains((int[])nArray2) ? 1 : 0)) {
                            lIllIIIIllllIIl = new d(lIlllIII[18], lIlllIII[3], lIlllIII[196]);
                            bB.add(lIllIIIIllllIIl);
                            "".length();
                        }
                        int[] nArray3 = new int[lIlllIII[1]];
                        nArray3[G.lIlllIII[0]] = lIlllIII[27];
                        if (G.lIIllIlIIII(Bank.contains((int[])nArray3) ? 1 : 0)) {
                            lIllIIIIllllIIl = new d(lIlllIII[27], lIlllIII[3], lIlllIII[196]);
                            bB.add(lIllIIIIllllIIl);
                            "".length();
                        }
                        int[] nArray4 = new int[lIlllIII[1]];
                        nArray4[G.lIlllIII[0]] = lIlllIII[13];
                        if (G.lIIllIlIIII(Bank.contains((int[])nArray4) ? 1 : 0)) {
                            lIllIIIIllllIIl = new d(lIlllIII[13], lIlllIII[12], lIlllIII[197]);
                            bB.add(lIllIIIIllllIIl);
                            "".length();
                        }
                        int[] nArray5 = new int[lIlllIII[1]];
                        nArray5[G.lIlllIII[0]] = lIlllIII[21];
                        if (G.lIIllIlIIII(Bank.contains((int[])nArray5) ? 1 : 0)) {
                            lIllIIIIllllIIl = new d(lIlllIII[21], lIlllIII[12], lIlllIII[198]);
                            bB.add(lIllIIIIllllIIl);
                            "".length();
                        }
                        int[] nArray6 = new int[lIlllIII[1]];
                        nArray6[G.lIlllIII[0]] = lIlllIII[15];
                        if (G.lIIllIlIIII(Bank.contains((int[])nArray6) ? 1 : 0)) {
                            lIllIIIIllllIIl = new d(lIlllIII[15], lIlllIII[12], lIlllIII[198]);
                            bB.add(lIllIIIIllllIIl);
                            "".length();
                        }
                        int[] nArray7 = new int[lIlllIII[1]];
                        nArray7[G.lIlllIII[0]] = lIlllIII[14];
                        if (G.lIIllIlIIII(Bank.contains((int[])nArray7) ? 1 : 0)) {
                            lIllIIIIllllIIl = new d(lIlllIII[14], lIlllIII[12], lIlllIII[198]);
                            bB.add(lIllIIIIllllIIl);
                            "".length();
                        }
                        int[] nArray8 = new int[lIlllIII[1]];
                        nArray8[G.lIlllIII[0]] = lIlllIII[23];
                        if (!G.lIIllIIlllI(Bank.contains((int[])nArray8) ? 1 : 0)) break block15;
                        int[] nArray9 = new int[lIlllIII[1]];
                        nArray9[G.lIlllIII[0]] = lIlllIII[23];
                        if (!G.lIIllIIlllI(Bank.contains((int[])nArray9) ? 1 : 0)) break block16;
                        int[] nArray10 = new int[lIlllIII[1]];
                        nArray10[G.lIlllIII[0]] = lIlllIII[23];
                        if (!G.lIIllIIllll(Bank.getFirst((int[])nArray10).getQuantity(), lIlllIII[12])) break block16;
                    }
                    lIllIIIIllllIIl = new d(iv, lIlllIII[44], lIlllIII[199]);
                    bB.add(lIllIIIIllllIIl);
                    "".length();
                }
                int[] nArray = new int[lIlllIII[1]];
                nArray[G.lIlllIII[0]] = lIlllIII[25];
                if (!G.lIIllIIlllI(Bank.contains((int[])nArray) ? 1 : 0)) break block17;
                int[] nArray11 = new int[lIlllIII[1]];
                nArray11[G.lIlllIII[0]] = lIlllIII[25];
                if (!G.lIIllIIlllI(Bank.contains((int[])nArray11) ? 1 : 0)) break block18;
                int[] nArray12 = new int[lIlllIII[1]];
                nArray12[G.lIlllIII[0]] = lIlllIII[25];
                if (!G.lIIllIIllll(Bank.getFirst((int[])nArray12).getQuantity(), lIlllIII[12])) break block18;
            }
            lIllIIIIllllIIl = new d(lIlllIII[25], lIlllIII[12], lIlllIII[200]);
            bB.add(lIllIIIIllllIIl);
            "".length();
        }
        int[] nArray = new int[lIlllIII[1]];
        nArray[G.lIlllIII[0]] = lIlllIII[201];
        if (G.lIIllIlIIII(Bank.contains((int[])nArray) ? 1 : 0)) {
            lIllIIIIllllIIl = new d(lIlllIII[201], lIlllIII[1], lIlllIII[202]);
            bB.add(lIllIIIIllllIIl);
            "".length();
        }
        int[] nArray13 = new int[lIlllIII[1]];
        nArray13[G.lIlllIII[0]] = lIlllIII[19];
        if (G.lIIllIlIIII(Bank.contains((int[])nArray13) ? 1 : 0)) {
            lIllIIIIllllIIl = new d(lIlllIII[19], lIlllIII[40], i.bw);
            bB.add(lIllIIIIllllIIl);
            "".length();
        }
    }

    private static String lIIlIllllII(String lIllIIIIIlIIllI, String lIllIIIIIlIIlIl) {
        lIllIIIIIlIIllI = new String(Base64.getDecoder().decode(lIllIIIIIlIIllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lIllIIIIIlIIlII = new StringBuilder();
        char[] lIllIIIIIlIIIll = lIllIIIIIlIIlIl.toCharArray();
        int lIllIIIIIlIIIlI = lIlllIII[0];
        char[] lIllIIIIIIlllII = lIllIIIIIlIIllI.toCharArray();
        int lIllIIIIIIllIll = lIllIIIIIIlllII.length;
        int lIllIIIIIIllIlI = lIlllIII[0];
        while (G.lIIllIIllll(lIllIIIIIIllIlI, lIllIIIIIIllIll)) {
            char lIllIIIIIlIIlll = lIllIIIIIIlllII[lIllIIIIIIllIlI];
            lIllIIIIIlIIlII.append((char)(lIllIIIIIlIIlll ^ lIllIIIIIlIIIll[lIllIIIIIlIIIlI % lIllIIIIIlIIIll.length]));
            "".length();
            ++lIllIIIIIlIIIlI;
            ++lIllIIIIIIllIlI;
            "".length();
            if ("   ".length() < (0xAE ^ 0xC5 ^ (0x72 ^ 0x1D))) continue;
            return null;
        }
        return String.valueOf(lIllIIIIIlIIlII);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean ac() {
        int n2;
        if (G.lIIllIlIlII(Skills.getBoostedLevel((Skill)Skill.AGILITY), lIlllIII[37])) {
            int n3;
            int[] nArray = new int[lIlllIII[1]];
            nArray[G.lIlllIII[0]] = lIlllIII[13];
            if (G.lIIllIIlllI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray2 = new int[lIlllIII[1]];
                nArray2[G.lIlllIII[0]] = lIlllIII[25];
                if (G.lIIllIIlllI(Inventory.contains((int[])nArray2) ? 1 : 0)) {
                    int[] nArray3 = new int[lIlllIII[1]];
                    nArray3[G.lIlllIII[0]] = lIlllIII[23];
                    if (!(!G.lIIllIIlllI(Inventory.contains((int[])nArray3) ? 1 : 0) || G.lIIllIlIIII(Inventory.contains(item -> item.getName().contains(lIllIlIl[lIlllIII[207]])) ? 1 : 0) && !G.lIIllIIlllI(Equipment.contains(item -> item.getName().contains(lIllIlIl[lIlllIII[206]])) ? 1 : 0) || G.lIIllIlIIII(Inventory.contains((int[])f.bl) ? 1 : 0) && !G.lIIllIIlllI(Equipment.contains((int[])f.bl) ? 1 : 0))) {
                        n3 = lIlllIII[1];
                        "".length();
                        if (-"  ".length() <= 0) return n3 != 0;
                        return ((152 + 28 - 101 + 76 ^ 158 + 158 - 304 + 181) & (0x9D ^ 0xC4 ^ "   ".length() ^ -" ".length())) != 0;
                    }
                }
            }
            n3 = lIlllIII[0];
            return n3 != 0;
        }
        int[] nArray = new int[lIlllIII[1]];
        nArray[G.lIlllIII[0]] = lIlllIII[13];
        if (G.lIIllIIlllI(Inventory.contains((int[])nArray) ? 1 : 0)) {
            int[] nArray4 = new int[lIlllIII[1]];
            nArray4[G.lIlllIII[0]] = lIlllIII[15];
            if (G.lIIllIIlllI(Inventory.contains((int[])nArray4) ? 1 : 0)) {
                int[] nArray5 = new int[lIlllIII[1]];
                nArray5[G.lIlllIII[0]] = lIlllIII[14];
                if (!(!G.lIIllIIlllI(Inventory.contains((int[])nArray5) ? 1 : 0) || G.lIIllIlIIII(Inventory.contains(item -> item.getName().contains(lIllIlIl[lIlllIII[205]])) ? 1 : 0) && !G.lIIllIIlllI(Equipment.contains(item -> item.getName().contains(lIllIlIl[lIlllIII[204]])) ? 1 : 0) || G.lIIllIlIIII(Inventory.contains((int[])f.bl) ? 1 : 0) && !G.lIIllIIlllI(Equipment.contains((int[])f.bl) ? 1 : 0))) {
                    n2 = lIlllIII[1];
                    "".length();
                    if (((0x73 ^ 0x3B ^ (0x7D ^ 0x3A)) & (26 + 138 - 110 + 109 ^ 52 + 73 - -19 + 28 ^ -" ".length())) != " ".length()) return n2 != 0;
                    return ((0xA1 ^ 0xB9 ^ (0xD5 ^ 0x9F)) & (0x57 ^ 0x6F ^ (0x2E ^ 0x44) ^ -" ".length())) != 0;
                }
            }
        }
        n2 = lIlllIII[0];
        return n2 != 0;
    }

    private static void lIIllIIllIl() {
        lIlllIII = new int[239];
        G.lIlllIII[0] = (0x25 ^ 0x66 ^ (0x64 ^ 0x35)) & (100 + 102 - 44 + 32 ^ 86 + 131 - 103 + 58 ^ -" ".length());
        G.lIlllIII[1] = " ".length();
        G.lIlllIII[2] = 0xBA ^ 0x83 ^ (0x8E ^ 0xB2);
        G.lIlllIII[3] = "  ".length();
        G.lIlllIII[4] = -(0xFFFFBE6B & 0x71D5) & (0xFFFFFDEF & 0x3FD7);
        G.lIlllIII[5] = 0xFFFF8FE5 & 0x7D9F;
        G.lIlllIII[6] = 0x2B ^ 0x15;
        G.lIlllIII[7] = 0x52 ^ 0x7E ^ (0x5A ^ 0x45);
        G.lIlllIII[8] = -(0xFFFFFF59 & 0x70E7) & (0xFFFFFDFE & 0x7FF9);
        G.lIlllIII[9] = -(0xFFFFD3F7 & 0x6E6B) & (0xFFFFCFFF & 0x7FFA);
        G.lIlllIII[10] = "   ".length();
        G.lIlllIII[11] = 0xFFFFFBBF & 0x17C8;
        G.lIlllIII[12] = 0x62 ^ 0x68;
        G.lIlllIII[13] = -(0xFFFFAEF7 & 0x71A9) & (0xFFFFBFFF & 0x7FE7);
        G.lIlllIII[14] = -(0x68 ^ 0x5A) & (0xFFFFDFFB & 0x3F7D);
        G.lIlllIII[15] = 0xFFFFDF4B & 0x3FFD;
        G.lIlllIII[16] = 0xFFFFFFAD & 0xF5F;
        G.lIlllIII[17] = 139 + 5 - 18 + 41 ^ 114 + 143 - 116 + 22;
        G.lIlllIII[18] = 0xFFFFAFDD & 0x7EEE;
        G.lIlllIII[19] = 0xFFFFFF71 & 0x31DF;
        G.lIlllIII[20] = 0x99 ^ 0x9F;
        G.lIlllIII[21] = 0xFFFFDF5E & 0x3FEB;
        G.lIlllIII[22] = 0x20 ^ 0x79 ^ (4 ^ 0x5A);
        G.lIlllIII[23] = 0xFFFFA9D7 & 0x57A9;
        G.lIlllIII[24] = 0x7F ^ 0x51 ^ (0x86 ^ 0xA0);
        G.lIlllIII[25] = -(0xFFFFE7D5 & 0x397F) & (0xFFFFFFFF & 0x6DF7);
        G.lIlllIII[26] = 0x3B ^ 0x54 ^ (0xE2 ^ 0x84);
        G.lIlllIII[27] = 0xFFFFFAFF & 0x579A;
        G.lIlllIII[28] = 0xFFFFFF5E & 0x2EF5;
        G.lIlllIII[29] = -(0xFFFFD3FF & 0x6D23) & (0xFFFFEFF6 & 0x7F7B);
        G.lIlllIII[30] = 0xFFFFFE6F & 0x2FDE;
        G.lIlllIII[31] = 0xFFFFEE7F & 0x3FCC;
        G.lIlllIII[32] = 0xFFFFAE7F & 0x7FD2;
        G.lIlllIII[33] = -(0xFFFFFD37 & 0x42EA) & (0xFFFFEE6F & 0x7FFB);
        G.lIlllIII[34] = 0xFFFFEFFE & 0x3EC1;
        G.lIlllIII[35] = 0x15 ^ 1 ^ (0xF9 ^ 0xB5);
        G.lIlllIII[36] = 0xFFFFEF6F & 0x5F9B;
        G.lIlllIII[37] = 33 + 131 - 43 + 13 ^ 22 + 89 - 0 + 63;
        G.lIlllIII[38] = 0x3A ^ 0x35;
        G.lIlllIII[39] = 0xB2 ^ 0x80;
        G.lIlllIII[40] = 0x29 ^ 0x3D;
        G.lIlllIII[41] = 132 + 61 - 98 + 62 ^ 12 + 12 - -60 + 48;
        G.lIlllIII[42] = 0x91 ^ 0x8F;
        G.lIlllIII[43] = 0xFFFFDBFF & 0x252E;
        G.lIlllIII[44] = 0xA4 ^ 0xAB ^ (0x11 ^ 0x22);
        G.lIlllIII[45] = 0xFFFF81F7 & 0x7F3B;
        G.lIlllIII[46] = -(0xFFFFAF9F & 0x7279) & (0xFFFFABFD & 0x7FBF);
        G.lIlllIII[47] = 0xFFFFDFFF & 0x2D6B;
        G.lIlllIII[48] = 0xFFFFFDE8 & 0xF77;
        G.lIlllIII[49] = 0x77 ^ 0x7C;
        G.lIlllIII[50] = 0xFFFFCFDF & 0x3D7D;
        G.lIlllIII[51] = -(0xFFFFFE1F & 0x77FF) & (0xFFFFFFBF & Short.MAX_VALUE);
        G.lIlllIII[52] = -(0xFFFFA33B & 0x7EE5) & (0xFFFFAFFF & 0x7F77);
        G.lIlllIII[53] = 0x7C ^ 0x72;
        G.lIlllIII[54] = 0x58 ^ 0x72 ^ (0x95 ^ 0xAD);
        G.lIlllIII[55] = -(0xFFFFA4D1 & 0x7F6F) & (0xFFFFEDFF & 0x3FF3);
        G.lIlllIII[56] = -(0xFFFFCFD7 & 0x70A9) & (0xFFFFCFFE & 0x7DD9);
        G.lIlllIII[57] = 0xFFFFDBF2 & 0x2DBF;
        G.lIlllIII[58] = 0xFFFFCFD9 & 0x3D7F;
        G.lIlllIII[59] = -(0xFFFF9DFF & 0x7641) & (0xFFFF9FFD & 0x7DF3);
        G.lIlllIII[60] = 0xFFFFBF77 & 0x4DEB;
        G.lIlllIII[61] = 0x25 ^ 0x31 ^ "  ".length();
        G.lIlllIII[62] = -" ".length();
        G.lIlllIII[63] = 0x4B ^ 0x52 ^ (0x1F ^ 0xA);
        G.lIlllIII[64] = 0x26 ^ 0x2B;
        G.lIlllIII[65] = 134 + 12 - 134 + 128 ^ 136 + 143 - 192 + 69;
        G.lIlllIII[66] = 0x5C ^ 0x4D;
        G.lIlllIII[67] = 8 + 164 - 61 + 65 ^ 91 + 20 - -49 + 3;
        G.lIlllIII[68] = 0x62 ^ 0x77;
        G.lIlllIII[69] = 0xD1 ^ 0xC6;
        G.lIlllIII[70] = 0x8C ^ 0xA4 ^ (0xBD ^ 0x8D);
        G.lIlllIII[71] = 0x5D ^ 0x74 ^ (0x14 ^ 0x27);
        G.lIlllIII[72] = 0x7A ^ 0x61;
        G.lIlllIII[73] = 74 + 89 - 72 + 64 ^ 121 + 38 - 62 + 38;
        G.lIlllIII[74] = 0x70 ^ 0x6D;
        G.lIlllIII[75] = 62 + 44 - -7 + 27 ^ 92 + 3 - 6 + 58;
        G.lIlllIII[76] = -(0xFFFFF3A9 & 0xDD7) & (0xFFFF8FDF & 0x7DFF);
        G.lIlllIII[77] = 0xFFFFAF17 & 0x5DFE;
        G.lIlllIII[78] = (0x6B ^ 0x60) + (0x4F ^ 0x27) - (0xB6 ^ 0xAA) + (0xF0 ^ 0xC2);
        G.lIlllIII[79] = 0xC4 ^ 0x9E ^ (0xF ^ 0xB);
        G.lIlllIII[80] = -(0xFFFFFCE9 & 0x5357) & (0xFFFFFCF7 & 0x5FDB);
        G.lIlllIII[81] = 0xFFFFAD77 & 0x5FD9;
        G.lIlllIII[82] = 0xFFFFDCFC & 0x2F8F;
        G.lIlllIII[83] = -(0xFFFFBAFB & 0x7786) & (0xFFFFBEFF & Short.MAX_VALUE);
        G.lIlllIII[84] = 0xFFFFBD5E & 0x4FF5;
        G.lIlllIII[85] = 0xFFFFFF77 & 0xCFE;
        G.lIlllIII[86] = 0xFFFF8F7F & 0x7DD5;
        G.lIlllIII[87] = -(0xFFFFF8F7 & 0x278B) & (0xFFFFBFDB & 0x6DEF);
        G.lIlllIII[88] = -(0xFFFFFCFD & 0x7317) & (0xFFFFFE7F & 0x7DFF);
        G.lIlllIII[89] = 0xFFFFCDBE & 0x3F77;
        G.lIlllIII[90] = -(0xFFFFB17F & 0x6FAF) & (0xFFFFEFFF & 0x3DBF);
        G.lIlllIII[91] = 0xFFFFEF78 & 0x1DC7;
        G.lIlllIII[92] = 0xFFFFACFE & 0x5FA3;
        G.lIlllIII[93] = -(0xFFFFF5FF & 0x5AA5) & (0xFFFFFFFE & 0x5DEF);
        G.lIlllIII[94] = -(0xFFFFD20F & 0x3FFE) & (0xFFFF9F5F & Short.MAX_VALUE);
        G.lIlllIII[95] = 142 + 145 - 198 + 79 ^ 114 + 94 - 82 + 10;
        G.lIlllIII[96] = -(0xFFFFCFFF & 0x7367) & (0xFFFFDFFF & 0x6FFE);
        G.lIlllIII[97] = 0xE5 ^ 0xC4;
        G.lIlllIII[98] = 0x4D ^ 0x5D ^ (0x57 ^ 0x65);
        G.lIlllIII[99] = 0x39 ^ 0x1A;
        G.lIlllIII[100] = 89 + 34 - 23 + 40 ^ 23 + 5 - 9 + 149;
        G.lIlllIII[101] = 64 + 77 - 127 + 167 ^ 138 + 112 - 223 + 117;
        G.lIlllIII[102] = 0x30 ^ 0x16;
        G.lIlllIII[103] = 160 + 104 - 193 + 92 ^ 10 + 116 - 90 + 96;
        G.lIlllIII[104] = -(0xFFFF9F4F & 0x66F1) & (0xFFFFE77C & 0x3FF7);
        G.lIlllIII[105] = 0x7F ^ 0xE ^ (0x1E ^ 0x46);
        G.lIlllIII[106] = 3 ^ 0x3C ^ (0x41 ^ 0x54);
        G.lIlllIII[107] = 0x18 ^ 0x33;
        G.lIlllIII[108] = 11 + 171 - 107 + 161 ^ 37 + 39 - -25 + 91;
        G.lIlllIII[109] = 0x3F ^ 0x12;
        G.lIlllIII[110] = 0xCA ^ 0xA1 ^ (0xB ^ 0x4E);
        G.lIlllIII[111] = 106 + 105 - 111 + 60 ^ 82 + 130 - 166 + 97;
        G.lIlllIII[112] = 0x53 ^ 0x63;
        G.lIlllIII[113] = 0x85 ^ 0xB4;
        G.lIlllIII[114] = 0x97 ^ 0xA3;
        G.lIlllIII[115] = 0xFFFFF9FA & 0x3FF7;
        G.lIlllIII[116] = 0x49 ^ 0x7C;
        G.lIlllIII[117] = 0x9B ^ 0xAD;
        G.lIlllIII[118] = 0xFFFFBDF7 & 0x7BFB;
        G.lIlllIII[119] = 0xAA ^ 0x9D;
        G.lIlllIII[120] = 122 + 100 - 107 + 12 ^ (0xE1 ^ 0xA6);
        G.lIlllIII[121] = -(0xFFFF9A45 & 0x67BE) & (0xFFFFFFFF & 0x3BF7);
        G.lIlllIII[122] = 0x74 ^ 0x7C ^ (0x22 ^ 0x13);
        G.lIlllIII[123] = 0xBF ^ 0x85;
        G.lIlllIII[124] = 55 + 239 - 279 + 237 ^ 47 + 46 - 61 + 167;
        G.lIlllIII[125] = -(0xFFFFBA37 & 0x55D9) & (0xFFFFDDDF & 0x3FBF);
        G.lIlllIII[126] = 0xFFFFBD9F & 0x4FEA;
        G.lIlllIII[127] = 0xFFFFDDBE & 0x2FEF;
        G.lIlllIII[128] = 0xFFFFBFFE & 0x4DA3;
        G.lIlllIII[129] = -(0xFFFFD09F & 0x6F79) & (0xFFFFCDFF & 0x7FBF);
        G.lIlllIII[130] = 0xFFFF8DFB & 0x7F9F;
        G.lIlllIII[131] = 0xFFFFFDB9 & 0xFEF;
        G.lIlllIII[132] = 0xFFFFBFDA & 0x4DB5;
        G.lIlllIII[133] = 0xFFFF9DFB & 0x6FA5;
        G.lIlllIII[134] = 0xFFFFEDF7 & 0x1F9B;
        G.lIlllIII[135] = -(0xFFFFD763 & 0x6AFD) & (0xFFFFDFFF & 0x6FFD);
        G.lIlllIII[136] = 0xFFFFCFEB & 0x3D9F;
        G.lIlllIII[137] = 0xFFFFADFB & 0x5FB6;
        G.lIlllIII[138] = 0xFFFFCDBD & 0x3FD3;
        G.lIlllIII[139] = -(0xFFFFDCDB & 0x3325) & (0xFFFFBFFF & 0x5D9E);
        G.lIlllIII[140] = 27 + 134 - 44 + 40 ^ 45 + 105 - 26 + 36;
        G.lIlllIII[141] = 0x16 ^ 0x29;
        G.lIlllIII[142] = 0xF ^ 0x5C ^ (0x82 ^ 0x91);
        G.lIlllIII[143] = 0x21 ^ 0x5C ^ (0x7E ^ 0x42);
        G.lIlllIII[144] = 0x7A ^ 0x38;
        G.lIlllIII[145] = 174 + 190 - 280 + 138 ^ 80 + 67 - 140 + 150;
        G.lIlllIII[146] = 0xDE ^ 0xA8 ^ (0x82 ^ 0xB0);
        G.lIlllIII[147] = 0xE0 ^ 0xA5;
        G.lIlllIII[148] = 0x6B ^ 0x2D;
        G.lIlllIII[149] = 0 ^ 0x3B ^ (0x5C ^ 0x20);
        G.lIlllIII[150] = 0x8D ^ 0xC5;
        G.lIlllIII[151] = 0x26 ^ 0x6F;
        G.lIlllIII[152] = 180 + 8 - -3 + 4 ^ 81 + 60 - 18 + 14;
        G.lIlllIII[153] = 0xC7 ^ 0x8B ^ (0xBC ^ 0xBB);
        G.lIlllIII[154] = 0x1C ^ 0x6C ^ (0x41 ^ 0x7D);
        G.lIlllIII[155] = 0xF2 ^ 0xBF;
        G.lIlllIII[156] = 0xF9 ^ 0xB7;
        G.lIlllIII[157] = 0xED ^ 0xB4 ^ (0xB ^ 0x1D);
        G.lIlllIII[158] = 137 + 178 - 158 + 41 ^ 130 + 14 - 100 + 106;
        G.lIlllIII[159] = 154 + 94 - 28 + 13 ^ 41 + 30 - -14 + 99;
        G.lIlllIII[160] = 91 + 148 - 63 + 47 ^ 1 + 28 - -45 + 67;
        G.lIlllIII[161] = 0x64 ^ 0x37;
        G.lIlllIII[162] = 0xFFFF9F7F & 0x6AFF;
        G.lIlllIII[163] = -(0xFFFFF637 & 0x69C9) & (0xFFFFFDFF & 0x6F7E);
        G.lIlllIII[164] = -(0xFFFFE463 & 0x5FBD) & (0xFFFFEEBF & 0x5FFF);
        G.lIlllIII[165] = 0xFFFFFBEF & 0xE9D;
        G.lIlllIII[166] = 0xFFFF8ABF & 0x7FD3;
        G.lIlllIII[167] = 0xFFFF8F89 & 0x7AFF;
        G.lIlllIII[168] = 0xFFFFFBF8 & 0xE87;
        G.lIlllIII[169] = -(0xFFFFDF3F & 0x60FD) & (0xFFFFFDBF & 0x4FFD);
        G.lIlllIII[170] = 0xFFFFAEAD & 0x5BFB;
        G.lIlllIII[171] = -(0xFFFFE7DB & 0x783F) & (0xFFFFFFBA & 0x6DFF);
        G.lIlllIII[172] = 0x13 ^ 0x40 ^ (0x3B ^ 0x3C);
        G.lIlllIII[173] = 0xFF ^ 0xC2 ^ (0x45 ^ 0x2D);
        G.lIlllIII[174] = 0xD9 ^ 0x8F;
        G.lIlllIII[175] = 0x58 ^ 0x34 ^ (0xA6 ^ 0x9D);
        G.lIlllIII[176] = 0x24 ^ 0x7D ^ (0x2A ^ 5) & ~(0xF ^ 0x20);
        G.lIlllIII[177] = 0x18 ^ 0x42;
        G.lIlllIII[178] = 0x81 ^ 0x88 ^ (0xE3 ^ 0xB1);
        G.lIlllIII[179] = 0xF6 ^ 0xAA;
        G.lIlllIII[180] = 231 + 128 - 330 + 222 ^ 9 + 69 - -75 + 13;
        G.lIlllIII[181] = 0xB ^ 0x54;
        G.lIlllIII[182] = 0x23 ^ 0x43;
        G.lIlllIII[183] = 0xC2 ^ 0xA3;
        G.lIlllIII[184] = 142 + 11 - 83 + 169 ^ 22 + 99 - 31 + 51;
        G.lIlllIII[185] = 0xE4 ^ 0x87;
        G.lIlllIII[186] = 0x58 ^ 0x3C;
        G.lIlllIII[187] = 0xF1 ^ 0x94;
        G.lIlllIII[188] = 0x44 ^ 0x22;
        G.lIlllIII[189] = -(0xFFFFDFE7 & 0x7119) & (0xFFFFDF7F & 0x7DF7);
        G.lIlllIII[190] = -(0xFFFFF253 & 0x7FAD) & (0xFFFFFF56 & Short.MAX_VALUE);
        G.lIlllIII[191] = -(0xFFFFFE87 & 0x73F9) & (0xFFFFFFFE & 0x7EEF);
        G.lIlllIII[192] = -(0xFFFFBFFF & 0x72C5) & (0xFFFFBFFF & Short.MAX_VALUE);
        G.lIlllIII[193] = 0xFFFFEEFB & 0x3F4D;
        G.lIlllIII[194] = 0x1E ^ 0x79;
        G.lIlllIII[195] = -(0xFFFFD7DE & 0x6AA3) & (0xFFFFDFFF & 0x77FD);
        G.lIlllIII[196] = -(0xFFFFD6F7 & 0x3B5D) & (0xFFFFF7FC & 0x7BFF);
        G.lIlllIII[197] = -(0xFFFFD45F & 0x6FFC) & (0xFFFFF7DF & 0x4FFF);
        G.lIlllIII[198] = -(0xFFFFAAEB & 0x7D5D) & (0xFFFFEFFF & 0x3BFE);
        G.lIlllIII[199] = -(0xFFFFE6EB & 0x7916) & (0xFFFFE79F & Short.MAX_VALUE);
        G.lIlllIII[200] = 0xFFFFFBFF & 0x26F6;
        G.lIlllIII[201] = 0xFFFFEEEA & 0x3FDF;
        G.lIlllIII[202] = 0xFFFFF75E & 0x6DFF;
        G.lIlllIII[203] = 1 ^ 0x69;
        G.lIlllIII[204] = 0xE2 ^ 0x9C ^ (0x96 ^ 0x81);
        G.lIlllIII[205] = 155 + 158 - 148 + 50 ^ 130 + 12 - -36 + 11;
        G.lIlllIII[206] = 0x54 ^ 0x3F;
        G.lIlllIII[207] = 0x3C ^ 0x50;
        G.lIlllIII[208] = 0xA8 ^ 0xC5;
        G.lIlllIII[209] = 0xFFFFEFDF & 0x1AAF;
        G.lIlllIII[210] = -(0x55 ^ 0x62) & (0xFFFF8FBF & 0x7DFF);
        G.lIlllIII[211] = 0x25 ^ 0x4B;
        G.lIlllIII[212] = 0xFFFFFD9F & 0xFED;
        G.lIlllIII[213] = 0x77 ^ 0x18;
        G.lIlllIII[214] = -(0xFFFFFD7F & 0x3689) & (0xFFFFFE9F & 0x3FFF);
        G.lIlllIII[215] = 0xFFFFFDB6 & 0xFDD;
        G.lIlllIII[216] = 0x39 ^ 0x3F ^ (0x20 ^ 0x56);
        G.lIlllIII[217] = -(0xFFFFF662 & 0x7D9F) & (0xFFFFFEDF & 0x7FB7);
        G.lIlllIII[218] = 0xB1 ^ 0xC0;
        G.lIlllIII[219] = 0xFFFFAFB3 & 0x5AED;
        G.lIlllIII[220] = -(0x59 ^ 0x18) & (0xFFFFEDF7 & 0x1FED);
        G.lIlllIII[221] = 3 ^ 0x71;
        G.lIlllIII[222] = -(0xFFFFBA59 & 0x67EF) & (0xFFFFEFFF & 0x3FFE);
        G.lIlllIII[223] = 0xFFFF8FDE & 0x7DBD;
        G.lIlllIII[224] = 118 + 39 - 122 + 216 ^ 13 + 26 - 38 + 135;
        G.lIlllIII[225] = 0xFFFF8FBF & 0x7DEF;
        G.lIlllIII[226] = 0x22 ^ 0x56;
        G.lIlllIII[227] = 0x31 ^ 0x44;
        G.lIlllIII[228] = 0xFFFFBDB7 & 0x4FDE;
        G.lIlllIII[229] = -(0xFFFFD9A3 & 0x665D) & (0xFFFFCDAF & 0x7FF4);
        G.lIlllIII[230] = " ".length() ^ (0x45 ^ 0x32);
        G.lIlllIII[231] = -(0xFFFF9B29 & 0x76D7) & (0xFFFFFFAB & 0x1FFF);
        G.lIlllIII[232] = 0x98 ^ 0xC6 ^ (0xA3 ^ 0x8A);
        G.lIlllIII[233] = 68 + 67 - 30 + 149 ^ 72 + 114 - 77 + 25;
        G.lIlllIII[234] = 0xFFFFDDBB & 0x2FF5;
        G.lIlllIII[235] = -(0xFFFFE732 & 0x5CCF) & (0xFFFFCDB5 & 0x7FEF);
        G.lIlllIII[236] = 0xFFFFCBAB & 0x3DFE;
        G.lIlllIII[237] = 0xFFFFBDEF & 0x4F7D;
        G.lIlllIII[238] = 0x49 ^ 0x14 ^ (0x58 ^ 0x7C);
    }

    private static boolean lIIllIlIlIl(int n2, int n3) {
        return n2 == n3;
    }

    /*
     * WARNING - void declaration
     */
    private static boolean cs() {
        WorldArea worldArea = new WorldArea(lIlllIII[80], lIlllIII[81], lIlllIII[69], lIlllIII[64], lIlllIII[0]);
        WorldArea worldArea2 = new WorldArea(lIlllIII[82], lIlllIII[81], lIlllIII[12], lIlllIII[64], lIlllIII[10]);
        WorldArea worldArea3 = new WorldArea(lIlllIII[83], lIlllIII[84], lIlllIII[63], lIlllIII[49], lIlllIII[10]);
        WorldArea worldArea4 = new WorldArea(lIlllIII[189], lIlllIII[190], lIlllIII[24], lIlllIII[2], lIlllIII[1]);
        WorldArea worldArea5 = new WorldArea(lIlllIII[85], lIlllIII[87], lIlllIII[12], lIlllIII[24], lIlllIII[10]);
        WorldArea worldArea6 = new WorldArea(lIlllIII[191], lIlllIII[192], lIlllIII[73], lIlllIII[38], lIlllIII[10]);
        WorldArea worldArea7 = new WorldArea(lIlllIII[90], lIlllIII[91], lIlllIII[66], lIlllIII[64], lIlllIII[10]);
        WorldArea worldArea8 = new WorldArea(lIlllIII[92], lIlllIII[93], lIlllIII[22], lIlllIII[26], lIlllIII[10]);
        WorldArea worldArea9 = new WorldArea(lIlllIII[92], lIlllIII[94], lIlllIII[12], lIlllIII[22], lIlllIII[10]);
        WorldArea worldArea10 = new WorldArea(lIlllIII[127], lIlllIII[128], lIlllIII[49], lIlllIII[12], lIlllIII[3]);
        WorldArea worldArea11 = new WorldArea(lIlllIII[129], lIlllIII[127], lIlllIII[49], lIlllIII[24], lIlllIII[3]);
        WorldArea worldArea12 = new WorldArea(lIlllIII[130], lIlllIII[131], lIlllIII[63], lIlllIII[49], lIlllIII[3]);
        WorldArea worldArea13 = new WorldArea(lIlllIII[132], lIlllIII[133], lIlllIII[12], lIlllIII[64], lIlllIII[10]);
        WorldArea worldArea14 = new WorldArea(lIlllIII[134], lIlllIII[9], lIlllIII[49], lIlllIII[26], lIlllIII[3]);
        WorldArea worldArea15 = new WorldArea(lIlllIII[135], lIlllIII[136], lIlllIII[68], lIlllIII[53], lIlllIII[10]);
        WorldArea worldArea16 = new WorldArea(lIlllIII[137], lIlllIII[138], lIlllIII[63], lIlllIII[64], lIlllIII[3]);
        WorldArea worldArea17 = new WorldArea(lIlllIII[164], lIlllIII[133], lIlllIII[64], lIlllIII[12], lIlllIII[10]);
        WorldArea worldArea18 = new WorldArea(lIlllIII[165], lIlllIII[139], lIlllIII[38], lIlllIII[53], lIlllIII[3]);
        WorldArea worldArea19 = new WorldArea(lIlllIII[166], lIlllIII[134], lIlllIII[49], lIlllIII[26], lIlllIII[3]);
        WorldArea worldArea20 = new WorldArea(lIlllIII[167], lIlllIII[136], lIlllIII[70], lIlllIII[64], lIlllIII[10]);
        WorldArea worldArea21 = new WorldArea(lIlllIII[168], lIlllIII[169], lIlllIII[54], lIlllIII[63], lIlllIII[3]);
        WorldArea[] worldAreaArray = new WorldArea[lIlllIII[68]];
        worldAreaArray[G.lIlllIII[0]] = worldArea;
        worldAreaArray[G.lIlllIII[1]] = worldArea2;
        worldAreaArray[G.lIlllIII[3]] = worldArea3;
        worldAreaArray[G.lIlllIII[10]] = worldArea4;
        worldAreaArray[G.lIlllIII[17]] = worldArea5;
        worldAreaArray[G.lIlllIII[2]] = worldArea6;
        worldAreaArray[G.lIlllIII[20]] = worldArea7;
        worldAreaArray[G.lIlllIII[22]] = worldArea8;
        worldAreaArray[G.lIlllIII[24]] = worldArea9;
        worldAreaArray[G.lIlllIII[26]] = worldArea10;
        worldAreaArray[G.lIlllIII[12]] = worldArea11;
        worldAreaArray[G.lIlllIII[49]] = worldArea12;
        worldAreaArray[G.lIlllIII[63]] = worldArea13;
        worldAreaArray[G.lIlllIII[64]] = worldArea14;
        worldAreaArray[G.lIlllIII[53]] = worldArea15;
        worldAreaArray[G.lIlllIII[38]] = worldArea16;
        worldAreaArray[G.lIlllIII[65]] = worldArea17;
        worldAreaArray[G.lIlllIII[66]] = worldArea18;
        worldAreaArray[G.lIlllIII[54]] = worldArea19;
        worldAreaArray[G.lIlllIII[67]] = worldArea20;
        worldAreaArray[G.lIlllIII[40]] = worldArea21;
        WorldArea[] worldAreaArray2 = worldAreaArray;
        int[] nArray = new int[lIlllIII[1]];
        nArray[G.lIlllIII[0]] = lIlllIII[193];
        if (G.lIIllIlIIIl(TileItems.getNearest((int[])nArray))) {
            void lIllIIIIlllllII;
            System.out.println(lIllIlIl[lIlllIII[194]]);
            int lIllIIIIllllIll = lIlllIII[0];
            while (G.lIIllIIllll(lIllIIIIllllIll, ((void)lIllIIIIlllllII).length)) {
                int[] nArray2 = new int[lIlllIII[1]];
                nArray2[G.lIlllIII[0]] = lIlllIII[193];
                if (G.lIIllIIlllI(lIllIIIIlllllII[lIllIIIIllllIll].contains(TileItems.getNearest((int[])nArray2).getWorldLocation()) ? 1 : 0) && G.lIIllIIlllI(lIllIIIIlllllII[lIllIIIIllllIll].contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    return lIlllIII[1];
                }
                ++lIllIIIIllllIll;
                "".length();
                if (" ".length() > 0) continue;
                return ((0x8E ^ 0xA1 ^ (0x15 ^ 0x1F)) & (27 + 68 - 60 + 121 ^ 13 + 110 - 93 + 155 ^ -" ".length())) != 0;
            }
        }
        return lIlllIII[0];
    }

    /*
     * WARNING - void declaration
     */
    private static void cp() {
        WorldArea worldArea = new WorldArea(lIlllIII[76], lIlllIII[77], lIlllIII[78], lIlllIII[79], lIlllIII[1]);
        WorldArea worldArea2 = new WorldArea(lIlllIII[76], lIlllIII[77], lIlllIII[78], lIlllIII[79], lIlllIII[3]);
        WorldArea worldArea3 = new WorldArea(lIlllIII[76], lIlllIII[77], lIlllIII[78], lIlllIII[79], lIlllIII[10]);
        WorldArea worldArea4 = new WorldArea(lIlllIII[80], lIlllIII[81], lIlllIII[69], lIlllIII[64], lIlllIII[0]);
        WorldArea worldArea5 = new WorldArea(lIlllIII[82], lIlllIII[81], lIlllIII[12], lIlllIII[64], lIlllIII[10]);
        WorldArea worldArea6 = new WorldArea(lIlllIII[83], lIlllIII[84], lIlllIII[63], lIlllIII[49], lIlllIII[10]);
        WorldArea worldArea7 = new WorldArea(lIlllIII[85], lIlllIII[86], lIlllIII[26], lIlllIII[22], lIlllIII[1]);
        WorldArea worldArea8 = new WorldArea(lIlllIII[85], lIlllIII[87], lIlllIII[12], lIlllIII[24], lIlllIII[10]);
        WorldArea worldArea9 = new WorldArea(lIlllIII[88], lIlllIII[89], lIlllIII[75], lIlllIII[40], lIlllIII[10]);
        WorldArea worldArea10 = new WorldArea(lIlllIII[90], lIlllIII[91], lIlllIII[66], lIlllIII[64], lIlllIII[10]);
        WorldArea worldArea11 = new WorldArea(lIlllIII[92], lIlllIII[93], lIlllIII[22], lIlllIII[26], lIlllIII[10]);
        WorldArea worldArea12 = new WorldArea(lIlllIII[92], lIlllIII[94], lIlllIII[12], lIlllIII[22], lIlllIII[10]);
        if (G.lIIllIlIIII(worldArea4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && G.lIIllIlIIII(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && G.lIIllIlIIII(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && G.lIIllIlIIII(worldArea3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderBarrows.c = lIllIlIl[lIlllIII[95]];
            if (G.lIIllIIlllI(Bank.isOpen() ? 1 : 0)) {
                Bank.close();
            }
            if (G.lIIllIIlllI(Dialog.isOpen() ? 1 : 0)) {
                Dialog.close();
            }
            Movement.walkTo((WorldPoint)new WorldPoint(lIlllIII[96], lIlllIII[52], lIlllIII[0]));
            "".length();
            Time.sleepTicks((int)lIlllIII[1]);
            "".length();
        }
        if (G.lIIllIlIlIl(Players.getLocal().getAnimation(), lIlllIII[62]) && G.lIIllIlIIII(Players.getLocal().isMoving() ? 1 : 0)) {
            String[] stringArray = new String[lIlllIII[1]];
            stringArray[G.lIlllIII[0]] = lIllIlIl[lIlllIII[97]];
            TileItem lIllIIIlllIIIlI = TileItems.getNearest((String[])stringArray);
            if (G.lIIllIlIIIl(lIllIIIlllIIIlI) && G.lIIllIIlllI(G.cs() ? 1 : 0)) {
                AccBuilderBarrows.c = lIllIlIl[lIlllIII[98]];
                System.out.println(lIllIlIl[lIlllIII[99]]);
                lIllIIIlllIIIlI.interact(lIllIlIl[lIlllIII[100]]);
                Time.sleepTicks((int)lIlllIII[10]);
                "".length();
            }
            if (G.lIIllIlIIII(G.cs() ? 1 : 0)) {
                void lIllIIIlllIIIll;
                void lIllIIIlllIIlII;
                void lIllIIIlllIIlIl;
                void lIllIIIlllIIllI;
                void lIllIIIlllIIlll;
                void lIllIIIlllIlIII;
                void lIllIIIlllIlIIl;
                void lIllIIIlllIlIlI;
                int lIllIIIlllIIIIl;
                void lIllIIIlllIlIll;
                if (G.lIIllIIlllI(lIllIIIlllIlIll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && G.lIIllIlIIII(G.cs() ? 1 : 0)) {
                    AccBuilderBarrows.c = lIllIlIl[lIlllIII[101]];
                    lIllIIIlllIIIIl = Skills.getExperience((Skill)Skill.AGILITY);
                    String[] stringArray2 = new String[lIlllIII[1]];
                    stringArray2[G.lIlllIII[0]] = lIllIlIl[lIlllIII[102]];
                    TileObjects.getNearest((String[])stringArray2).interact(lIllIlIl[lIlllIII[103]]);
                    Time.sleepUntil(() -> {
                        boolean bl;
                        if (G.lIIllIlIIlI(Skills.getExperience((Skill)Skill.AGILITY), lIllIIIlllIIIIl)) {
                            bl = lIlllIII[1];
                            "".length();
                            if (-"  ".length() > 0) {
                                return ((10 + 100 - -2 + 66 ^ 118 + 70 - 136 + 98) & (0x94 ^ 0xBD ^ (0x7C ^ 0x71) ^ -" ".length())) != 0;
                            }
                        } else {
                            bl = lIlllIII[0];
                        }
                        return bl;
                    }, (int)lIlllIII[104]);
                    "".length();
                    Time.sleepTicks((int)lIlllIII[1]);
                    "".length();
                }
                if (G.lIIllIIlllI(lIllIIIlllIlIlI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && G.lIIllIlIIII(G.cs() ? 1 : 0)) {
                    AccBuilderBarrows.c = lIllIlIl[lIlllIII[37]];
                    lIllIIIlllIIIIl = Skills.getExperience((Skill)Skill.AGILITY);
                    String[] stringArray3 = new String[lIlllIII[1]];
                    stringArray3[G.lIlllIII[0]] = lIllIlIl[lIlllIII[105]];
                    TileObjects.getNearest((String[])stringArray3).interact(lIllIlIl[lIlllIII[106]]);
                    Time.sleepUntil(() -> {
                        boolean bl;
                        if (G.lIIllIlIIlI(Skills.getExperience((Skill)Skill.AGILITY), lIllIIIlllIIIIl)) {
                            bl = lIlllIII[1];
                            "".length();
                            if (((0x99 ^ 0x8B) & ~(0x8F ^ 0x9D)) != 0) {
                                return ((0xEE ^ 0xA3) & ~(0xF8 ^ 0xB5)) != 0;
                            }
                        } else {
                            bl = lIlllIII[0];
                        }
                        return bl;
                    }, (int)lIlllIII[104]);
                    "".length();
                    Time.sleepTicks((int)lIlllIII[1]);
                    "".length();
                }
                if (G.lIIllIIlllI(lIllIIIlllIlIIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && G.lIIllIlIIII(G.cs() ? 1 : 0)) {
                    AccBuilderBarrows.c = lIllIlIl[lIlllIII[107]];
                    lIllIIIlllIIIIl = Skills.getExperience((Skill)Skill.AGILITY);
                    String[] stringArray4 = new String[lIlllIII[1]];
                    stringArray4[G.lIlllIII[0]] = lIllIlIl[lIlllIII[108]];
                    TileObjects.getNearest((String[])stringArray4).interact(lIllIlIl[lIlllIII[109]]);
                    Time.sleepUntil(() -> {
                        boolean bl;
                        if (G.lIIllIlIIlI(Skills.getExperience((Skill)Skill.AGILITY), lIllIIIlllIIIIl)) {
                            bl = lIlllIII[1];
                            "".length();
                            if (" ".length() == (0x91 ^ 0x95)) {
                                return ((0x10 ^ 0x3A) & ~(0x54 ^ 0x7E)) != 0;
                            }
                        } else {
                            bl = lIlllIII[0];
                        }
                        return bl;
                    }, (int)lIlllIII[104]);
                    "".length();
                    Time.sleepTicks((int)lIlllIII[1]);
                    "".length();
                }
                if (G.lIIllIIlllI(lIllIIIlllIlIII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && G.lIIllIlIIII(G.cs() ? 1 : 0)) {
                    AccBuilderBarrows.c = lIllIlIl[lIlllIII[110]];
                    lIllIIIlllIIIIl = Skills.getExperience((Skill)Skill.AGILITY);
                    String[] stringArray5 = new String[lIlllIII[1]];
                    stringArray5[G.lIlllIII[0]] = lIllIlIl[lIlllIII[111]];
                    TileObjects.getNearest((String[])stringArray5).interact(lIllIlIl[lIlllIII[112]]);
                    Time.sleepUntil(() -> {
                        boolean bl;
                        if (G.lIIllIlIIlI(Skills.getExperience((Skill)Skill.AGILITY), lIllIIIlllIIIIl)) {
                            bl = lIlllIII[1];
                            "".length();
                            if ((0x33 ^ 0x37) <= 0) {
                                return ((0xB4 ^ 0x8E) & ~(0x68 ^ 0x52)) != 0;
                            }
                        } else {
                            bl = lIlllIII[0];
                        }
                        return bl;
                    }, (int)lIlllIII[104]);
                    "".length();
                    Time.sleepTicks((int)lIlllIII[1]);
                    "".length();
                }
                if (G.lIIllIIlllI(lIllIIIlllIIlll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && G.lIIllIlIIII(G.cs() ? 1 : 0)) {
                    AccBuilderBarrows.c = lIllIlIl[lIlllIII[113]];
                    lIllIIIlllIIIIl = Skills.getExperience((Skill)Skill.AGILITY);
                    String[] stringArray6 = new String[lIlllIII[1]];
                    stringArray6[G.lIlllIII[0]] = lIllIlIl[lIlllIII[39]];
                    TileObjects.getNearest((String[])stringArray6).interact(lIllIlIl[lIlllIII[7]]);
                    Time.sleepUntil(() -> {
                        boolean bl;
                        if (G.lIIllIlIIlI(Skills.getExperience((Skill)Skill.AGILITY), lIllIIIlllIIIIl)) {
                            bl = lIlllIII[1];
                            "".length();
                            if (-(0x56 ^ 0xC ^ (0xC6 ^ 0x99)) >= 0) {
                                return ((199 + 205 - 238 + 70 ^ 85 + 57 - 27 + 52) & (174 + 68 - 52 + 60 ^ 143 + 10 - 131 + 155 ^ -" ".length())) != 0;
                            }
                        } else {
                            bl = lIlllIII[0];
                        }
                        return bl;
                    }, (int)lIlllIII[104]);
                    "".length();
                    Time.sleepTicks((int)lIlllIII[1]);
                    "".length();
                }
                if (G.lIIllIIlllI(lIllIIIlllIIllI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && G.lIIllIlIIII(G.cs() ? 1 : 0)) {
                    AccBuilderBarrows.c = lIllIlIl[lIlllIII[114]];
                    lIllIIIlllIIIIl = Skills.getExperience((Skill)Skill.AGILITY);
                    int[] nArray = new int[lIlllIII[1]];
                    nArray[G.lIlllIII[0]] = lIlllIII[115];
                    TileObjects.getNearest((int[])nArray).interact(lIllIlIl[lIlllIII[116]]);
                    Time.sleepUntil(() -> {
                        boolean bl;
                        if (G.lIIllIlIIlI(Skills.getExperience((Skill)Skill.AGILITY), lIllIIIlllIIIIl)) {
                            bl = lIlllIII[1];
                            "".length();
                            if (null != null) {
                                return ((0x5D ^ 0x59 ^ (0xF0 ^ 0xC4)) & (8 + 125 - -27 + 8 ^ 11 + 83 - -45 + 13 ^ -" ".length())) != 0;
                            }
                        } else {
                            bl = lIlllIII[0];
                        }
                        return bl;
                    }, (int)lIlllIII[104]);
                    "".length();
                    Time.sleepTicks((int)lIlllIII[1]);
                    "".length();
                }
                if (G.lIIllIIlllI(lIllIIIlllIIlIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && G.lIIllIlIIII(G.cs() ? 1 : 0)) {
                    AccBuilderBarrows.c = lIllIlIl[lIlllIII[117]];
                    lIllIIIlllIIIIl = Skills.getExperience((Skill)Skill.AGILITY);
                    int[] nArray = new int[lIlllIII[1]];
                    nArray[G.lIlllIII[0]] = lIlllIII[118];
                    TileObjects.getNearest((int[])nArray).interact(lIllIlIl[lIlllIII[119]]);
                    Time.sleepUntil(() -> {
                        boolean bl;
                        if (G.lIIllIlIIlI(Skills.getExperience((Skill)Skill.AGILITY), lIllIIIlllIIIIl)) {
                            bl = lIlllIII[1];
                            "".length();
                            if (" ".length() <= -" ".length()) {
                                return ((0x53 ^ 0x77) & ~(0x4C ^ 0x68)) != 0;
                            }
                        } else {
                            bl = lIlllIII[0];
                        }
                        return bl;
                    }, (int)lIlllIII[104]);
                    "".length();
                    Time.sleepTicks((int)lIlllIII[1]);
                    "".length();
                }
                if (G.lIIllIIlllI(lIllIIIlllIIlII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && G.lIIllIlIIII(G.cs() ? 1 : 0)) {
                    AccBuilderBarrows.c = lIllIlIl[lIlllIII[120]];
                    lIllIIIlllIIIIl = Skills.getExperience((Skill)Skill.AGILITY);
                    int[] nArray = new int[lIlllIII[1]];
                    nArray[G.lIlllIII[0]] = lIlllIII[121];
                    TileObjects.getNearest((int[])nArray).interact(lIllIlIl[lIlllIII[122]]);
                    Time.sleepUntil(() -> {
                        boolean bl;
                        if (G.lIIllIlIIlI(Skills.getExperience((Skill)Skill.AGILITY), lIllIIIlllIIIIl)) {
                            bl = lIlllIII[1];
                            "".length();
                            if (((171 + 124 - 154 + 34 ^ 115 + 116 - 219 + 121) & (0x9D ^ 0x8E ^ (0x69 ^ 0x50) ^ -" ".length())) != 0) {
                                return ((6 ^ 0x2C ^ (0xD4 ^ 0xB8)) & (8 ^ 0x4B ^ (0xA8 ^ 0xAD) ^ -" ".length())) != 0;
                            }
                        } else {
                            bl = lIlllIII[0];
                        }
                        return bl;
                    }, (int)lIlllIII[104]);
                    "".length();
                    Time.sleepTicks((int)lIlllIII[1]);
                    "".length();
                }
                if (G.lIIllIIlllI(lIllIIIlllIIIll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && G.lIIllIlIIII(G.cs() ? 1 : 0)) {
                    AccBuilderBarrows.c = lIllIlIl[lIlllIII[123]];
                    lIllIIIlllIIIIl = Skills.getExperience((Skill)Skill.AGILITY);
                    String[] stringArray7 = new String[lIlllIII[1]];
                    stringArray7[G.lIlllIII[0]] = lIllIlIl[lIlllIII[124]];
                    TileObjects.getNearest((String[])stringArray7).interact(lIllIlIl[lIlllIII[44]]);
                    Time.sleepUntil(() -> {
                        boolean bl;
                        if (G.lIIllIlIIlI(Skills.getExperience((Skill)Skill.AGILITY), lIllIIIlllIIIIl)) {
                            bl = lIlllIII[1];
                            "".length();
                            if (" ".length() == 0) {
                                return ((0x53 ^ 0x16) & ~(0x5E ^ 0x1B)) != 0;
                            }
                        } else {
                            bl = lIlllIII[0];
                        }
                        return bl;
                    }, (int)lIlllIII[104]);
                    "".length();
                    Time.sleepTicks((int)lIlllIII[1]);
                    "".length();
                }
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    private static void cq() {
        void lIllIIIllIIIllI;
        void lIllIIIllIIlllI;
        void lIllIIIllIIllll;
        void lIllIIIllIlIIII;
        void lIllIIIllIlIIIl;
        WorldArea worldArea = new WorldArea(lIlllIII[125], lIlllIII[126], lIlllIII[112], lIlllIII[107], lIlllIII[0]);
        WorldArea worldArea2 = new WorldArea(lIlllIII[125], lIlllIII[126], lIlllIII[112], lIlllIII[107], lIlllIII[1]);
        WorldArea worldArea3 = new WorldArea(lIlllIII[125], lIlllIII[126], lIlllIII[112], lIlllIII[107], lIlllIII[3]);
        WorldArea worldArea4 = new WorldArea(lIlllIII[125], lIlllIII[126], lIlllIII[112], lIlllIII[107], lIlllIII[10]);
        WorldArea worldArea5 = new WorldArea(lIlllIII[127], lIlllIII[128], lIlllIII[49], lIlllIII[12], lIlllIII[3]);
        WorldArea worldArea6 = new WorldArea(lIlllIII[129], lIlllIII[127], lIlllIII[49], lIlllIII[24], lIlllIII[3]);
        WorldArea worldArea7 = new WorldArea(lIlllIII[130], lIlllIII[131], lIlllIII[63], lIlllIII[49], lIlllIII[3]);
        WorldArea worldArea8 = new WorldArea(lIlllIII[132], lIlllIII[133], lIlllIII[12], lIlllIII[64], lIlllIII[10]);
        WorldArea worldArea9 = new WorldArea(lIlllIII[134], lIlllIII[9], lIlllIII[49], lIlllIII[26], lIlllIII[3]);
        WorldArea worldArea10 = new WorldArea(lIlllIII[135], lIlllIII[136], lIlllIII[68], lIlllIII[53], lIlllIII[10]);
        WorldArea worldArea11 = new WorldArea(lIlllIII[137], lIlllIII[138], lIlllIII[63], lIlllIII[64], lIlllIII[3]);
        WorldPoint worldPoint = new WorldPoint(lIlllIII[137], lIlllIII[139], lIlllIII[0]);
        if (G.lIIllIIlllI(Dialog.isOpen() ? 1 : 0)) {
            Dialog.close();
        }
        if (G.lIIllIlIIII(lIllIIIllIlIIIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && G.lIIllIlIIII(lIllIIIllIlIIII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && G.lIIllIlIIII(lIllIIIllIIllll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && G.lIIllIlIIII(lIllIIIllIIlllI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderBarrows.c = lIllIlIl[lIlllIII[140]];
            Movement.walkTo((WorldPoint)lIllIIIllIIIllI);
            "".length();
            Time.sleepTicks((int)lIlllIII[1]);
            "".length();
        }
        if (G.lIIllIIlllI(lIllIIIllIlIIIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (G.lIIllIlIIlI(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lIllIIIllIIIllI), lIlllIII[20])) {
                AccBuilderBarrows.c = lIllIlIl[lIlllIII[6]];
                Movement.walkTo((WorldPoint)lIllIIIllIIIllI);
                "".length();
                Time.sleepTicks((int)lIlllIII[1]);
                "".length();
            }
            if (G.lIIllIlIllI(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lIllIIIllIIIllI), lIlllIII[20])) {
                AccBuilderBarrows.c = lIllIlIl[lIlllIII[141]];
                int lIllIIIllIIIlIl = Skills.getExperience((Skill)Skill.AGILITY);
                String[] stringArray = new String[lIlllIII[1]];
                stringArray[G.lIlllIII[0]] = lIllIlIl[lIlllIII[142]];
                TileObjects.getNearest((String[])stringArray).interact(lIllIlIl[lIlllIII[143]]);
                Time.sleepTicks((int)e.c(lIlllIII[1], lIlllIII[3]));
                "".length();
                Time.sleepUntil(() -> {
                    boolean bl;
                    if (G.lIIllIlIIlI(Skills.getExperience((Skill)Skill.AGILITY), lIllIIIllIIIlIl)) {
                        bl = lIlllIII[1];
                        "".length();
                        if (((0x63 ^ 0x50) & ~(0x87 ^ 0xB4)) >= " ".length()) {
                            return ((2 ^ 0x30) & ~(0xAF ^ 0x9D)) != 0;
                        }
                    } else {
                        bl = lIlllIII[0];
                    }
                    return bl;
                }, (int)lIlllIII[104]);
                "".length();
                Time.sleepTicks((int)lIlllIII[1]);
                "".length();
            }
        }
        String[] stringArray = new String[lIlllIII[1]];
        stringArray[G.lIlllIII[0]] = lIllIlIl[lIlllIII[144]];
        TileItem lIllIIIllIIIlIl = TileItems.getNearest((String[])stringArray);
        if (G.lIIllIlIIIl(lIllIIIllIIIlIl) && G.lIIllIIlllI(G.cs() ? 1 : 0)) {
            AccBuilderBarrows.c = lIllIlIl[lIlllIII[145]];
            System.out.println(lIllIlIl[lIlllIII[146]]);
            lIllIIIllIIIlIl.interact(lIllIlIl[lIlllIII[147]]);
            Time.sleepTicks((int)lIlllIII[10]);
            "".length();
        }
        if (G.lIIllIlIIII(G.cs() ? 1 : 0)) {
            void lIllIIIllIIIlll;
            void lIllIIIllIIlIII;
            void lIllIIIllIIlIIl;
            void lIllIIIllIIlIlI;
            void lIllIIIllIIlIll;
            void lIllIIIllIIllII;
            int lIllIIIllIIIIll;
            TileObject lIllIIIllIIIlII;
            void lIllIIIllIIllIl;
            if (G.lIIllIIlllI(lIllIIIllIIllIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && G.lIIllIlIIIl(lIllIIIllIIIlII = TileObjects.getNearest(tileObject -> {
                int n2;
                if (G.lIIllIIlllI(tileObject.getName().contains(lIllIlIl[lIlllIII[233]]) ? 1 : 0) && G.lIIllIlIllI(tileObject.getWorldLocation().distanceTo(new WorldPoint(lIlllIII[234], lIlllIII[131], lIlllIII[3])), lIlllIII[3])) {
                    n2 = lIlllIII[1];
                    "".length();
                    if (null != null) {
                        return ((0xA4 ^ 0x98) & ~(0x14 ^ 0x28)) != 0;
                    }
                } else {
                    n2 = lIlllIII[0];
                }
                return n2 != 0;
            }))) {
                lIllIIIllIIIIll = Skills.getExperience((Skill)Skill.AGILITY);
                AccBuilderBarrows.c = lIllIlIl[lIlllIII[148]];
                lIllIIIllIIIlII.interact(lIllIlIl[lIlllIII[149]]);
                Time.sleepTicks((int)e.c(lIlllIII[1], lIlllIII[3]));
                "".length();
                Time.sleepUntil(() -> {
                    boolean bl;
                    if (G.lIIllIlIIlI(Skills.getExperience((Skill)Skill.AGILITY), lIllIIIllIIIIll)) {
                        bl = lIlllIII[1];
                        "".length();
                        if (null != null) {
                            return ((0xB2 ^ 0xB8) & ~(0x86 ^ 0x8C)) != 0;
                        }
                    } else {
                        bl = lIlllIII[0];
                    }
                    return bl;
                }, (int)lIlllIII[104]);
                "".length();
                Time.sleepTicks((int)lIlllIII[1]);
                "".length();
            }
            if (G.lIIllIIlllI(G.cs() ? 1 : 0)) {
                return;
            }
            if (G.lIIllIIlllI(lIllIIIllIIllII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && G.lIIllIlIIIl(lIllIIIllIIIlII = TileObjects.getNearest(tileObject -> {
                int n2;
                if (G.lIIllIIlllI(tileObject.getName().contains(lIllIlIl[lIlllIII[232]]) ? 1 : 0) && G.lIIllIlIllI(tileObject.getWorldLocation().distanceTo(new WorldPoint(lIlllIII[131], lIlllIII[225], lIlllIII[3])), lIlllIII[3])) {
                    n2 = lIlllIII[1];
                    "".length();
                    if (((0xF1 ^ 0xB5) & ~(0xE1 ^ 0xA5)) < -" ".length()) {
                        return ((0xC5 ^ 0x8C) & ~(0x33 ^ 0x7A)) != 0;
                    }
                } else {
                    n2 = lIlllIII[0];
                }
                return n2 != 0;
            }))) {
                AccBuilderBarrows.c = lIllIlIl[lIlllIII[150]];
                lIllIIIllIIIIll = Skills.getExperience((Skill)Skill.AGILITY);
                lIllIIIllIIIlII.interact(lIllIlIl[lIlllIII[151]]);
                Time.sleepTicks((int)e.c(lIlllIII[1], lIlllIII[3]));
                "".length();
                Time.sleepUntil(() -> {
                    boolean bl;
                    if (G.lIIllIlIIlI(Skills.getExperience((Skill)Skill.AGILITY), lIllIIIllIIIIll)) {
                        bl = lIlllIII[1];
                        "".length();
                        if (-"   ".length() > 0) {
                            return ((0xD1 ^ 0x8C) & ~(0x79 ^ 0x24)) != 0;
                        }
                    } else {
                        bl = lIlllIII[0];
                    }
                    return bl;
                }, (int)lIlllIII[104]);
                "".length();
                Time.sleepTicks((int)lIlllIII[1]);
                "".length();
            }
            if (G.lIIllIIlllI(G.cs() ? 1 : 0)) {
                return;
            }
            if (G.lIIllIIlllI(lIllIIIllIIlIll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && G.lIIllIlIIIl(lIllIIIllIIIlII = TileObjects.getNearest(tileObject -> {
                int n2;
                if (G.lIIllIIlllI(tileObject.getName().contains(lIllIlIl[lIlllIII[230]]) ? 1 : 0) && G.lIIllIlIllI(tileObject.getWorldLocation().distanceTo(new WorldPoint(lIlllIII[139], lIlllIII[231], lIlllIII[3])), lIlllIII[3])) {
                    n2 = lIlllIII[1];
                    "".length();
                    if ((0x70 ^ 0x6F ^ (0x90 ^ 0x8B)) < 0) {
                        return ((0x2B ^ 0x36 ^ (0x41 ^ 0x69)) & (89 + 131 - 123 + 39 ^ 154 + 127 - 231 + 139 ^ -" ".length())) != 0;
                    }
                } else {
                    n2 = lIlllIII[0];
                }
                return n2 != 0;
            }))) {
                AccBuilderBarrows.c = lIllIlIl[lIlllIII[152]];
                lIllIIIllIIIIll = Skills.getExperience((Skill)Skill.AGILITY);
                lIllIIIllIIIlII.interact(lIllIlIl[lIlllIII[153]]);
                Time.sleepTicks((int)e.c(lIlllIII[1], lIlllIII[3]));
                "".length();
                Time.sleepUntil(() -> {
                    boolean bl;
                    if (G.lIIllIlIIlI(Skills.getExperience((Skill)Skill.AGILITY), lIllIIIllIIIIll)) {
                        bl = lIlllIII[1];
                        "".length();
                        if (((22 + 3 - -7 + 136 ^ 58 + 116 - 162 + 117) & (0x36 ^ 0x5E ^ (0x7C ^ 0x3D) ^ -" ".length())) == -" ".length()) {
                            return ((0x69 ^ 0x3A ^ (0x84 ^ 0x8E)) & (25 + 111 - 106 + 206 ^ 97 + 72 - 66 + 78 ^ -" ".length())) != 0;
                        }
                    } else {
                        bl = lIlllIII[0];
                    }
                    return bl;
                }, (int)lIlllIII[104]);
                "".length();
                Time.sleepTicks((int)lIlllIII[1]);
                "".length();
            }
            if (G.lIIllIIlllI(G.cs() ? 1 : 0)) {
                return;
            }
            if (G.lIIllIIlllI(lIllIIIllIIlIlI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && G.lIIllIlIIIl(lIllIIIllIIIlII = TileObjects.getNearest(tileObject -> {
                int n2;
                if (G.lIIllIIlllI(tileObject.getName().contains(lIllIlIl[lIlllIII[227]]) ? 1 : 0) && G.lIIllIlIllI(tileObject.getWorldLocation().distanceTo(new WorldPoint(lIlllIII[228], lIlllIII[229], lIlllIII[10])), lIlllIII[3])) {
                    n2 = lIlllIII[1];
                    "".length();
                    if (-(0x6F ^ 0x6B) >= 0) {
                        return ((0x57 ^ 1) & ~(0xF3 ^ 0xA5)) != 0;
                    }
                } else {
                    n2 = lIlllIII[0];
                }
                return n2 != 0;
            }))) {
                AccBuilderBarrows.c = lIllIlIl[lIlllIII[154]];
                lIllIIIllIIIIll = Skills.getExperience((Skill)Skill.AGILITY);
                lIllIIIllIIIlII.interact(lIllIlIl[lIlllIII[155]]);
                Time.sleepTicks((int)e.c(lIlllIII[1], lIlllIII[3]));
                "".length();
                Time.sleepUntil(() -> {
                    boolean bl;
                    if (G.lIIllIlIIlI(Skills.getExperience((Skill)Skill.AGILITY), lIllIIIllIIIIll)) {
                        bl = lIlllIII[1];
                        "".length();
                        if (null != null) {
                            return ((45 + 119 - 79 + 49 ^ 111 + 16 - 36 + 54) & (0x44 ^ 0x63 ^ (0x5A ^ 0x6A) ^ -" ".length())) != 0;
                        }
                    } else {
                        bl = lIlllIII[0];
                    }
                    return bl;
                }, (int)lIlllIII[104]);
                "".length();
                Time.sleepTicks((int)lIlllIII[1]);
                "".length();
            }
            if (G.lIIllIIlllI(G.cs() ? 1 : 0)) {
                return;
            }
            if (G.lIIllIIlllI(lIllIIIllIIlIIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && G.lIIllIlIIIl(lIllIIIllIIIlII = TileObjects.getNearest(tileObject -> {
                int n2;
                if (G.lIIllIIlllI(tileObject.getName().contains(lIllIlIl[lIlllIII[226]]) ? 1 : 0) && G.lIIllIlIllI(tileObject.getWorldLocation().distanceTo(new WorldPoint(lIlllIII[9], lIlllIII[130], lIlllIII[3])), lIlllIII[3])) {
                    n2 = lIlllIII[1];
                    "".length();
                    if (-" ".length() > 0) {
                        return ((77 + 80 - 143 + 137 ^ 29 + 98 - -45 + 25) & (0x60 ^ 0x11 ^ (0x64 ^ 0x47) ^ -" ".length())) != 0;
                    }
                } else {
                    n2 = lIlllIII[0];
                }
                return n2 != 0;
            }))) {
                AccBuilderBarrows.c = lIllIlIl[lIlllIII[156]];
                lIllIIIllIIIIll = Skills.getExperience((Skill)Skill.AGILITY);
                lIllIIIllIIIlII.interact(lIllIlIl[lIlllIII[157]]);
                Time.sleepTicks((int)e.c(lIlllIII[1], lIlllIII[3]));
                "".length();
                Time.sleepUntil(() -> {
                    boolean bl;
                    if (G.lIIllIlIIlI(Skills.getExperience((Skill)Skill.AGILITY), lIllIIIllIIIIll)) {
                        bl = lIlllIII[1];
                        "".length();
                        if (-" ".length() == ((0x41 ^ 0x1D ^ (0xF ^ 0x7A)) & (0x97 ^ 0xC0 ^ (0xC7 ^ 0xB9) ^ -" ".length()))) {
                            return ((0x45 ^ 0x76 ^ (0x1D ^ 0x67)) & (63 + 18 - 65 + 123 ^ 134 + 168 - 280 + 172 ^ -" ".length())) != 0;
                        }
                    } else {
                        bl = lIlllIII[0];
                    }
                    return bl;
                }, (int)lIlllIII[104]);
                "".length();
                Time.sleepTicks((int)lIlllIII[1]);
                "".length();
            }
            if (G.lIIllIIlllI(G.cs() ? 1 : 0)) {
                return;
            }
            if (G.lIIllIIlllI(lIllIIIllIIlIII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && G.lIIllIlIIIl(lIllIIIllIIIlII = TileObjects.getNearest(tileObject -> {
                int n2;
                if (G.lIIllIIlllI(tileObject.getName().contains(lIllIlIl[lIlllIII[224]]) ? 1 : 0) && G.lIIllIlIllI(tileObject.getWorldLocation().distanceTo(new WorldPoint(lIlllIII[225], lIlllIII[215], lIlllIII[10])), lIlllIII[3])) {
                    n2 = lIlllIII[1];
                    "".length();
                    if (-" ".length() >= ((0xC0 ^ 0x98) & ~(0x16 ^ 0x4E))) {
                        return ((0xC3 ^ 0xC6) & ~(0x4E ^ 0x4B)) != 0;
                    }
                } else {
                    n2 = lIlllIII[0];
                }
                return n2 != 0;
            }))) {
                AccBuilderBarrows.c = lIllIlIl[lIlllIII[158]];
                lIllIIIllIIIIll = Skills.getExperience((Skill)Skill.AGILITY);
                lIllIIIllIIIlII.interact(lIllIlIl[lIlllIII[159]]);
                Time.sleepTicks((int)e.c(lIlllIII[1], lIlllIII[3]));
                "".length();
                Time.sleepUntil(() -> {
                    boolean bl;
                    if (G.lIIllIlIIlI(Skills.getExperience((Skill)Skill.AGILITY), lIllIIIllIIIIll)) {
                        bl = lIlllIII[1];
                        "".length();
                        if ("   ".length() < "  ".length()) {
                            return ((8 ^ 0x54) & ~(0xC0 ^ 0x9C)) != 0;
                        }
                    } else {
                        bl = lIlllIII[0];
                    }
                    return bl;
                }, (int)lIlllIII[104]);
                "".length();
                Time.sleepTicks((int)lIlllIII[1]);
                "".length();
            }
            if (G.lIIllIIlllI(G.cs() ? 1 : 0)) {
                return;
            }
            if (G.lIIllIIlllI(lIllIIIllIIIlll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && G.lIIllIlIIIl(lIllIIIllIIIlII = TileObjects.getNearest(tileObject -> {
                int n2;
                if (G.lIIllIIlllI(tileObject.getName().contains(lIllIlIl[lIlllIII[221]]) ? 1 : 0) && G.lIIllIlIllI(tileObject.getWorldLocation().distanceTo(new WorldPoint(lIlllIII[222], lIlllIII[223], lIlllIII[3])), lIlllIII[3])) {
                    n2 = lIlllIII[1];
                    "".length();
                    if ((0x10 ^ 0x14) > (0x98 ^ 0x9C)) {
                        return ((0x40 ^ 0x5B) & ~(0x4A ^ 0x51)) != 0;
                    }
                } else {
                    n2 = lIlllIII[0];
                }
                return n2 != 0;
            }))) {
                AccBuilderBarrows.c = lIllIlIl[lIlllIII[160]];
                lIllIIIllIIIIll = Skills.getExperience((Skill)Skill.AGILITY);
                lIllIIIllIIIlII.interact(lIllIlIl[lIlllIII[161]]);
                Time.sleepTicks((int)e.c(lIlllIII[1], lIlllIII[3]));
                "".length();
                Time.sleepUntil(() -> {
                    boolean bl;
                    if (G.lIIllIlIIlI(Skills.getExperience((Skill)Skill.AGILITY), lIllIIIllIIIIll)) {
                        bl = lIlllIII[1];
                        "".length();
                        if (-"  ".length() >= 0) {
                            return ((0xC9 ^ 0x87) & ~(0x2A ^ 0x64)) != 0;
                        }
                    } else {
                        bl = lIlllIII[0];
                    }
                    return bl;
                }, (int)lIlllIII[104]);
                "".length();
                Time.sleepTicks((int)lIlllIII[1]);
                "".length();
            }
        }
    }

    @Override
    public String V() {
        return lIllIlIl[lIlllIII[203]];
    }
}

