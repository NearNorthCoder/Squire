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

import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.G;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.a;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.b;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.d;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.e;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.f;
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

public class J
implements G {
    static /* synthetic */ WorldArea iz;
    public static /* synthetic */ int iy;
    public static /* synthetic */ int iw;
    private static /* synthetic */ String[] lIIllIllII;
    private static /* synthetic */ WorldPoint iC;
    public static /* synthetic */ boolean bt;
    static /* synthetic */ WorldArea iA;
    private static /* synthetic */ int[] lIIllIllll;
    static /* synthetic */ WorldArea iB;
    public static /* synthetic */ List<d> bv;
    public static /* synthetic */ int ix;

    private static void lIIIIIlIllllI() {
        lIIllIllII = new String[lIIllIllll[238]];
        J.lIIllIllII[J.lIIllIllll[0]] = J."Buying items";
        J.lIIllIllII[J.lIIllIllll[1]] = J."Finished buying items, switching back to agility";
        J.lIIllIllII[J.lIIllIllll[3]] = J."Navigating to bank";
        J.lIIllIllII[J.lIIllIllll[10]] = J."Handling banking";
        J.lIIllIllII[J.lIIllIllll[17]] = J."We are missing quest supplies, switching to BUYING";
        J.lIIllIllII[J.lIIllIllll[19]] = J."Vial";
        J.lIIllIllII[J.lIIllIllll[21]] = J."Vial";
        J.lIIllIllII[J.lIIllIllll[23]] = J."Drop";
        J.lIIllIllII[J.lIIllIllll[25]] = J."Drink";
        J.lIIllIllII[J.lIIllIllll[27]] = J."Eat";
        J.lIIllIllII[J.lIIllIllll[12]] = J."Nav to gnome course";
        J.lIIllIllII[J.lIIllIllll[49]] = J."Crossing log";
        J.lIIllIllII[J.lIIllIllll[63]] = J."Log balance";
        J.lIIllIllII[J.lIIllIllll[64]] = J."Walk-across";
        J.lIIllIllII[J.lIIllIllll[53]] = J."Climbing net";
        J.lIIllIllII[J.lIIllIllll[39]] = J."Obstacle net";
        J.lIIllIllII[J.lIIllIllll[65]] = J."Climb-over";
        J.lIIllIllII[J.lIIllIllll[66]] = J."Climbing branch";
        J.lIIllIllII[J.lIIllIllll[54]] = J."Tree branch";
        J.lIIllIllII[J.lIIllIllll[67]] = J."Climb";
        J.lIIllIllII[J.lIIllIllll[40]] = J."Crossing rope";
        J.lIIllIllII[J.lIIllIllll[68]] = J."Balancing rope";
        J.lIIllIllII[J.lIIllIllll[61]] = J."Walk-on";
        J.lIIllIllII[J.lIIllIllll[69]] = J."Climbing down";
        J.lIIllIllII[J.lIIllIllll[70]] = J."Tree branch";
        J.lIIllIllII[J.lIIllIllll[41]] = J."Climb-down";
        J.lIIllIllII[J.lIIllIllll[71]] = J."Climbing net";
        J.lIIllIllII[J.lIIllIllll[72]] = J."Obstacle net";
        J.lIIllIllII[J.lIIllIllll[73]] = J."Climb-over";
        J.lIIllIllII[J.lIIllIllll[74]] = J."Crossing pipe";
        J.lIIllIllII[J.lIIllIllll[42]] = J."Obstacle pipe";
        J.lIIllIllII[J.lIIllIllll[75]] = J."Squeeze-through";
        J.lIIllIllII[J.lIIllIllll[95]] = J."Nav to start";
        J.lIIllIllII[J.lIIllIllll[97]] = J."Mark of grace";
        J.lIIllIllII[J.lIIllIllll[98]] = J."Taking mark";
        J.lIIllIllII[J.lIIllIllll[99]] = J."Found mark on ground";
        J.lIIllIllII[J.lIIllIllll[100]] = J."Take";
        J.lIIllIllII[J.lIIllIllll[101]] = J."Starting course";
        J.lIIllIllII[J.lIIllIllll[102]] = J."Rough wall";
        J.lIIllIllII[J.lIIllIllll[103]] = J."Climb";
        J.lIIllIllII[J.lIIllIllll[38]] = J."Crossing clothes line";
        J.lIIllIllII[J.lIIllIllll[105]] = J."Clothes line";
        J.lIIllIllII[J.lIIllIllll[106]] = J."Cross";
        J.lIIllIllII[J.lIIllIllll[107]] = J."Leaping";
        J.lIIllIllII[J.lIIllIllll[108]] = J."Gap";
        J.lIIllIllII[J.lIIllIllll[109]] = J."Leap";
        J.lIIllIllII[J.lIIllIllll[110]] = J."Balancing";
        J.lIIllIllII[J.lIIllIllll[111]] = J."Wall";
        J.lIIllIllII[J.lIIllIllll[112]] = J."Balance";
        J.lIIllIllII[J.lIIllIllll[113]] = J."Jumping gap";
        J.lIIllIllII[J.lIIllIllll[2]] = J."Gap";
        J.lIIllIllII[J.lIIllIllll[7]] = J."Leap";
        J.lIIllIllII[J.lIIllIllll[114]] = J."Jumping gap 2";
        J.lIIllIllII[J.lIIllIllll[116]] = J."Leap";
        J.lIIllIllII[J.lIIllIllll[117]] = J."Jumping gap 3";
        J.lIIllIllII[J.lIIllIllll[119]] = J."Leap";
        J.lIIllIllII[J.lIIllIllll[120]] = J."Hurdle roof";
        J.lIIllIllII[J.lIIllIllll[122]] = J."Hurdle";
        J.lIIllIllII[J.lIIllIllll[123]] = J."Finishing course";
        J.lIIllIllII[J.lIIllIllll[124]] = J."Edge";
        J.lIIllIllII[J.lIIllIllll[44]] = J."Jump-off";
        J.lIIllIllII[J.lIIllIllll[140]] = J."Nav to canafis course";
        J.lIIllIllII[J.lIIllIllll[6]] = J."Nav to start";
        J.lIIllIllII[J.lIIllIllll[141]] = J."Starting course";
        J.lIIllIllII[J.lIIllIllll[142]] = J."Tall tree";
        J.lIIllIllII[J.lIIllIllll[143]] = J."Climb";
        J.lIIllIllII[J.lIIllIllll[144]] = J."Mark of grace";
        J.lIIllIllII[J.lIIllIllll[145]] = J."Taking mark";
        J.lIIllIllII[J.lIIllIllll[146]] = J."Found mark on ground";
        J.lIIllIllII[J.lIIllIllll[147]] = J."Take";
        J.lIIllIllII[J.lIIllIllll[148]] = J."Jumping gap 1";
        J.lIIllIllII[J.lIIllIllll[149]] = J."Jump";
        J.lIIllIllII[J.lIIllIllll[150]] = J."Jumping gap 2";
        J.lIIllIllII[J.lIIllIllll[151]] = J."Jump";
        J.lIIllIllII[J.lIIllIllll[152]] = J."Jumping gap 3";
        J.lIIllIllII[J.lIIllIllll[153]] = J."Jump";
        J.lIIllIllII[J.lIIllIllll[154]] = J."Jumping gap 4";
        J.lIIllIllII[J.lIIllIllll[155]] = J."Jump";
        J.lIIllIllII[J.lIIllIllll[156]] = J."Vaulting";
        J.lIIllIllII[J.lIIllIllll[157]] = J."Vault";
        J.lIIllIllII[J.lIIllIllll[158]] = J."Jumping gap 5";
        J.lIIllIllII[J.lIIllIllll[159]] = J."Jump";
        J.lIIllIllII[J.lIIllIllll[160]] = J."Jumping gap 6";
        J.lIIllIllII[J.lIIllIllll[161]] = J."Jump";
        J.lIIllIllII[J.lIIllIllll[172]] = J."Nav to canafis course";
        J.lIIllIllII[J.lIIllIllll[173]] = J."Nav to start";
        J.lIIllIllII[J.lIIllIllll[174]] = J."Starting course";
        J.lIIllIllII[J.lIIllIllll[175]] = J."Wall";
        J.lIIllIllII[J.lIIllIllll[36]] = J."Climb-up";
        J.lIIllIllII[J.lIIllIllll[176]] = J."Mark of grace";
        J.lIIllIllII[J.lIIllIllll[177]] = J."Taking mark";
        J.lIIllIllII[J.lIIllIllll[178]] = J."Found mark on ground";
        J.lIIllIllII[J.lIIllIllll[179]] = J."Take";
        J.lIIllIllII[J.lIIllIllll[180]] = J."Jumping gap 1";
        J.lIIllIllII[J.lIIllIllll[79]] = J."Jump";
        J.lIIllIllII[J.lIIllIllll[181]] = J."cross rope";
        J.lIIllIllII[J.lIIllIllll[182]] = J."Cross";
        J.lIIllIllII[J.lIIllIllll[183]] = J."Jumping gap 3";
        J.lIIllIllII[J.lIIllIllll[184]] = J."Jump";
        J.lIIllIllII[J.lIIllIllll[185]] = J."Jumping gap 4";
        J.lIIllIllII[J.lIIllIllll[186]] = J."Jump";
        J.lIIllIllII[J.lIIllIllll[187]] = J."Jumping Edge";
        J.lIIllIllII[J.lIIllIllll[188]] = J."Jump";
        J.lIIllIllII[J.lIIllIllll[194]] = J."Found mark on ground";
        J.lIIllIllII[J.lIIllIllll[203]] = J."Agility";
        J.lIIllIllII[J.lIIllIllll[204]] = J."passage";
        J.lIIllIllII[J.lIIllIllll[205]] = J."passage";
        J.lIIllIllII[J.lIIllIllll[206]] = J."passage";
        J.lIIllIllII[J.lIIllIllll[207]] = J."passage";
        J.lIIllIllII[J.lIIllIllll[208]] = J."Edge";
        J.lIIllIllII[J.lIIllIllll[211]] = J."Gap";
        J.lIIllIllII[J.lIIllIllll[213]] = J."Gap";
        J.lIIllIllII[J.lIIllIllll[216]] = J."Tightrope";
        J.lIIllIllII[J.lIIllIllll[218]] = J."Gap";
        J.lIIllIllII[J.lIIllIllll[221]] = J."Gap";
        J.lIIllIllII[J.lIIllIllll[224]] = J."Gap";
        J.lIIllIllII[J.lIIllIllll[226]] = J."Pole-vault";
        J.lIIllIllII[J.lIIllIllll[227]] = J."Gap";
        J.lIIllIllII[J.lIIllIllll[230]] = J."Gap";
        J.lIIllIllII[J.lIIllIllll[232]] = J."Gap";
        J.lIIllIllII[J.lIIllIllll[233]] = J."Gap";
    }

    private static String lIIIIIlIlIlll(String lllllllllllllllllllllIIlIIlllllI, String lllllllllllllllllllllIIlIIllllIl) {
        try {
            SecretKeySpec lllllllllllllllllllllIIlIlIIIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllllllllIIlIIllllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllllllllIIlIlIIIIlI = Cipher.getInstance("Blowfish");
            lllllllllllllllllllllIIlIlIIIIlI.init(lIIllIllll[3], lllllllllllllllllllllIIlIlIIIIll);
            return new String(lllllllllllllllllllllIIlIlIIIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllllllllIIlIIlllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllllllllIIlIlIIIIIl) {
            lllllllllllllllllllllIIlIlIIIIIl.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    private static void ct() {
        void lllllllllllllllllllllIIllllIlIII;
        void lllllllllllllllllllllIIllllIlllI;
        void lllllllllllllllllllllIIllllIllll;
        void lllllllllllllllllllllIIlllllIIII;
        void lllllllllllllllllllllIIlllllIIIl;
        WorldArea worldArea = new WorldArea(lIIllIllll[162], lIIllIllll[163], lIIllIllll[111], lIIllIllll[111], lIIllIllll[0]);
        WorldArea worldArea2 = new WorldArea(lIIllIllll[162], lIIllIllll[163], lIIllIllll[111], lIIllIllll[111], lIIllIllll[1]);
        WorldArea worldArea3 = new WorldArea(lIIllIllll[162], lIIllIllll[163], lIIllIllll[111], lIIllIllll[111], lIIllIllll[3]);
        WorldArea worldArea4 = new WorldArea(lIIllIllll[162], lIIllIllll[163], lIIllIllll[111], lIIllIllll[111], lIIllIllll[10]);
        WorldArea worldArea5 = new WorldArea(lIIllIllll[164], lIIllIllll[133], lIIllIllll[64], lIIllIllll[12], lIIllIllll[10]);
        WorldArea worldArea6 = new WorldArea(lIIllIllll[165], lIIllIllll[139], lIIllIllll[39], lIIllIllll[53], lIIllIllll[3]);
        WorldArea worldArea7 = new WorldArea(lIIllIllll[166], lIIllIllll[134], lIIllIllll[49], lIIllIllll[27], lIIllIllll[3]);
        WorldArea worldArea8 = new WorldArea(lIIllIllll[167], lIIllIllll[136], lIIllIllll[70], lIIllIllll[64], lIIllIllll[10]);
        WorldArea worldArea9 = new WorldArea(lIIllIllll[168], lIIllIllll[169], lIIllIllll[54], lIIllIllll[63], lIIllIllll[3]);
        WorldPoint worldPoint = new WorldPoint(lIIllIllll[170], lIIllIllll[171], lIIllIllll[0]);
        if (J.lIIIIIlllllIl(Dialog.isOpen() ? 1 : 0)) {
            Dialog.close();
        }
        if (J.lIIIIIlllllll(lllllllllllllllllllllIIlllllIIIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && J.lIIIIIlllllll(lllllllllllllllllllllIIlllllIIII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && J.lIIIIIlllllll(lllllllllllllllllllllIIllllIllll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && J.lIIIIIlllllll(lllllllllllllllllllllIIllllIlllI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderRogues.c = lIIllIllII[lIIllIllll[172]];
            Movement.walkTo((WorldPoint)lllllllllllllllllllllIIllllIlIII);
            0;
            Time.sleepTicks((int)lIIllIllll[1]);
            0;
        }
        if (J.lIIIIIlllllIl(lllllllllllllllllllllIIlllllIIIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (J.lIIIIlIIIIIIl(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lllllllllllllllllllllIIllllIlIII), lIIllIllll[21])) {
                AccBuilderRogues.c = lIIllIllII[lIIllIllll[173]];
                Movement.walkTo((WorldPoint)lllllllllllllllllllllIIllllIlIII);
                0;
                Time.sleepTicks((int)lIIllIllll[1]);
                0;
            }
            if (J.lIIIIlIIIIlIl(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lllllllllllllllllllllIIllllIlIII), lIIllIllll[21])) {
                AccBuilderRogues.c = lIIllIllII[lIIllIllll[174]];
                int lllllllllllllllllllllIIllllIIlll = Skills.getExperience((Skill)Skill.AGILITY);
                String[] stringArray = new String[lIIllIllll[1]];
                stringArray[J.lIIllIllll[0]] = lIIllIllII[lIIllIllll[175]];
                TileObjects.getNearest((String[])stringArray).interact(lIIllIllII[lIIllIllll[36]]);
                Time.sleepTicks((int)e.c(lIIllIllll[1], lIIllIllll[3]));
                0;
                Time.sleepUntil(() -> {
                    boolean bl;
                    if (J.lIIIIlIIIIIIl(Skills.getExperience((Skill)Skill.AGILITY), lllllllllllllllllllllIIllllIIlll)) {
                        bl = lIIllIllll[1];
                        0;
                        if (1 == 2) {
                            return ((0x3D ^ 0x6C) & ~(0x95 ^ 0xC4)) != 0;
                        }
                    } else {
                        bl = lIIllIllll[0];
                    }
                    return bl;
                }, (int)lIIllIllll[104]);
                0;
                Time.sleepTicks((int)lIIllIllll[1]);
                0;
            }
        }
        String[] stringArray = new String[lIIllIllll[1]];
        stringArray[J.lIIllIllll[0]] = lIIllIllII[lIIllIllll[176]];
        TileItem lllllllllllllllllllllIIllllIIlll = TileItems.getNearest((String[])stringArray);
        if (J.lIIIIlIIIIIII(lllllllllllllllllllllIIllllIIlll) && J.lIIIIIlllllIl(J.cu() ? 1 : 0)) {
            AccBuilderRogues.c = lIIllIllII[lIIllIllll[177]];
            System.out.println(lIIllIllII[lIIllIllll[178]]);
            lllllllllllllllllllllIIllllIIlll.interact(lIIllIllII[lIIllIllll[179]]);
            Time.sleepTicks((int)lIIllIllll[10]);
            0;
        }
        if (J.lIIIIIlllllll(J.cu() ? 1 : 0)) {
            void lllllllllllllllllllllIIllllIlIIl;
            void lllllllllllllllllllllIIllllIlIlI;
            void lllllllllllllllllllllIIllllIlIll;
            void lllllllllllllllllllllIIllllIllII;
            int lllllllllllllllllllllIIllllIIlIl;
            TileObject lllllllllllllllllllllIIllllIIllI;
            void lllllllllllllllllllllIIllllIllIl;
            if (J.lIIIIIlllllIl(lllllllllllllllllllllIIllllIllIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && J.lIIIIlIIIIIII(lllllllllllllllllllllIIllllIIllI = TileObjects.getNearest(tileObject -> {
                int n2;
                if (J.lIIIIIlllllIl(tileObject.getName().contains(lIIllIllII[lIIllIllll[218]]) ? 1 : 0) && J.lIIIIlIIIIlIl(tileObject.getWorldLocation().distanceTo(new WorldPoint(lIIllIllll[219], lIIllIllll[220], lIIllIllll[10])), lIIllIllll[3])) {
                    n2 = lIIllIllll[1];
                    0;
                    if (null != null) {
                        return ((56 + 157 - 127 + 97 ^ 91 + 164 - 185 + 109) & (46 + 147 - 187 + 143 ^ 39 + 125 - 70 + 51 ^ -1)) != 0;
                    }
                } else {
                    n2 = lIIllIllll[0];
                }
                return n2 != 0;
            }))) {
                lllllllllllllllllllllIIllllIIlIl = Skills.getExperience((Skill)Skill.AGILITY);
                AccBuilderRogues.c = lIIllIllII[lIIllIllll[180]];
                lllllllllllllllllllllIIllllIIllI.interact(lIIllIllII[lIIllIllll[79]]);
                Time.sleepTicks((int)e.c(lIIllIllll[1], lIIllIllll[3]));
                0;
                Time.sleepUntil(() -> {
                    boolean bl;
                    if (J.lIIIIlIIIIIIl(Skills.getExperience((Skill)Skill.AGILITY), lllllllllllllllllllllIIllllIIlIl)) {
                        bl = lIIllIllll[1];
                        0;
                        if (3 == 0) {
                            return ((0xDD ^ 0x87 ^ (0xDD ^ 0xBE)) & (0xCD ^ 0xBB ^ (0x7A ^ 0x35) ^ -1)) != 0;
                        }
                    } else {
                        bl = lIIllIllll[0];
                    }
                    return bl;
                }, (int)lIIllIllll[104]);
                0;
                Time.sleepTicks((int)lIIllIllll[1]);
                0;
            }
            if (J.lIIIIIlllllIl(J.cu() ? 1 : 0)) {
                return;
            }
            if (J.lIIIIIlllllIl(lllllllllllllllllllllIIllllIllII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && J.lIIIIlIIIIIII(lllllllllllllllllllllIIllllIIllI = TileObjects.getNearest(tileObject -> {
                int n2;
                if (J.lIIIIIlllllIl(tileObject.getName().contains(lIIllIllII[lIIllIllll[216]]) ? 1 : 0) && J.lIIIIlIIIIlIl(tileObject.getWorldLocation().distanceTo(new WorldPoint(lIIllIllll[217], lIIllIllll[128], lIIllIllll[3])), lIIllIllll[3])) {
                    n2 = lIIllIllll[1];
                    0;
                    if (3 < 2) {
                        return ((0xA5 ^ 0xBD) & ~(0x3B ^ 0x23)) != 0;
                    }
                } else {
                    n2 = lIIllIllll[0];
                }
                return n2 != 0;
            }))) {
                AccBuilderRogues.c = lIIllIllII[lIIllIllll[181]];
                lllllllllllllllllllllIIllllIIlIl = Skills.getExperience((Skill)Skill.AGILITY);
                lllllllllllllllllllllIIllllIIllI.interact(lIIllIllII[lIIllIllll[182]]);
                Time.sleepTicks((int)e.c(lIIllIllll[1], lIIllIllll[3]));
                0;
                Time.sleepUntil(() -> {
                    boolean bl;
                    if (J.lIIIIlIIIIIIl(Skills.getExperience((Skill)Skill.AGILITY), lllllllllllllllllllllIIllllIIlIl)) {
                        bl = lIIllIllll[1];
                        0;
                        if (-1 > -1) {
                            return ((0xA7 ^ 0x81 ^ (0xF1 ^ 0xB6)) & (59 + 131 - 164 + 134 ^ 41 + 124 - -14 + 14 ^ -1)) != 0;
                        }
                    } else {
                        bl = lIIllIllll[0];
                    }
                    return bl;
                }, (int)lIIllIllll[104]);
                0;
                Time.sleepTicks((int)lIIllIllll[1]);
                0;
            }
            if (J.lIIIIIlllllIl(J.cu() ? 1 : 0)) {
                return;
            }
            if (J.lIIIIIlllllIl(lllllllllllllllllllllIIllllIlIll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && J.lIIIIlIIIIIII(lllllllllllllllllllllIIllllIIllI = TileObjects.getNearest(tileObject -> {
                int n2;
                if (J.lIIIIIlllllIl(tileObject.getName().contains(lIIllIllII[lIIllIllll[213]]) ? 1 : 0) && J.lIIIIlIIIIlIl(tileObject.getWorldLocation().distanceTo(new WorldPoint(lIIllIllll[214], lIIllIllll[215], lIIllIllll[3])), lIIllIllll[3])) {
                    n2 = lIIllIllll[1];
                    0;
                    if (null != null) {
                        return (1 & ~1 & ~((0x61 ^ 0x36) & ~(0xC ^ 0x5B))) != 0;
                    }
                } else {
                    n2 = lIIllIllll[0];
                }
                return n2 != 0;
            }))) {
                AccBuilderRogues.c = lIIllIllII[lIIllIllll[183]];
                lllllllllllllllllllllIIllllIIlIl = Skills.getExperience((Skill)Skill.AGILITY);
                lllllllllllllllllllllIIllllIIllI.interact(lIIllIllII[lIIllIllll[184]]);
                Time.sleepTicks((int)e.c(lIIllIllll[1], lIIllIllll[3]));
                0;
                Time.sleepUntil(() -> {
                    boolean bl;
                    if (J.lIIIIlIIIIIIl(Skills.getExperience((Skill)Skill.AGILITY), lllllllllllllllllllllIIllllIIlIl)) {
                        bl = lIIllIllll[1];
                        0;
                        if (2 <= -1) {
                            return ((0x37 ^ 0x18) & ~(0x68 ^ 0x47)) != 0;
                        }
                    } else {
                        bl = lIIllIllll[0];
                    }
                    return bl;
                }, (int)lIIllIllll[104]);
                0;
                Time.sleepTicks((int)lIIllIllll[1]);
                0;
            }
            if (J.lIIIIIlllllIl(J.cu() ? 1 : 0)) {
                return;
            }
            if (J.lIIIIIlllllIl(lllllllllllllllllllllIIllllIlIlI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && J.lIIIIlIIIIIII(lllllllllllllllllllllIIllllIIllI = TileObjects.getNearest(tileObject -> {
                int n2;
                if (J.lIIIIIlllllIl(tileObject.getName().contains(lIIllIllII[lIIllIllll[211]]) ? 1 : 0) && J.lIIIIlIIIIlIl(tileObject.getWorldLocation().distanceTo(new WorldPoint(lIIllIllll[209], lIIllIllll[212], lIIllIllll[10])), lIIllIllll[3])) {
                    n2 = lIIllIllll[1];
                    0;
                    if (((0x14 ^ 0x5E) & ~(0x32 ^ 0x78)) != 0) {
                        return ((0x6E ^ 0x44) & ~(0x9A ^ 0xB0)) != 0;
                    }
                } else {
                    n2 = lIIllIllll[0];
                }
                return n2 != 0;
            }))) {
                AccBuilderRogues.c = lIIllIllII[lIIllIllll[185]];
                lllllllllllllllllllllIIllllIIlIl = Skills.getExperience((Skill)Skill.AGILITY);
                lllllllllllllllllllllIIllllIIllI.interact(lIIllIllII[lIIllIllll[186]]);
                Time.sleepTicks((int)e.c(lIIllIllll[1], lIIllIllll[3]));
                0;
                Time.sleepUntil(() -> {
                    boolean bl;
                    if (J.lIIIIlIIIIIIl(Skills.getExperience((Skill)Skill.AGILITY), lllllllllllllllllllllIIllllIIlIl)) {
                        bl = lIIllIllll[1];
                        0;
                        if (-(11 + 37 - 34 + 153 ^ 153 + 110 - 212 + 112) > 0) {
                            return ((64 + 64 - 118 + 158 ^ 121 + 118 - 137 + 63) & (0xDC ^ 0xB4 ^ (0x28 ^ 0x4D) ^ -1)) != 0;
                        }
                    } else {
                        bl = lIIllIllll[0];
                    }
                    return bl;
                }, (int)lIIllIllll[104]);
                0;
                Time.sleepTicks((int)lIIllIllll[1]);
                0;
            }
            if (J.lIIIIIlllllIl(J.cu() ? 1 : 0)) {
                return;
            }
            if (J.lIIIIIlllllIl(lllllllllllllllllllllIIllllIlIIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && J.lIIIIlIIIIIII(lllllllllllllllllllllIIllllIIllI = TileObjects.getNearest(tileObject -> {
                int n2;
                if (J.lIIIIIlllllIl(tileObject.getName().contains(lIIllIllII[lIIllIllll[208]]) ? 1 : 0) && J.lIIIIlIIIIlIl(tileObject.getWorldLocation().distanceTo(new WorldPoint(lIIllIllll[209], lIIllIllll[210], lIIllIllll[3])), lIIllIllll[3])) {
                    n2 = lIIllIllll[1];
                    0;
                    if (-(174 + 104 - 205 + 108 ^ 12 + 166 - 52 + 51) > 0) {
                        return ((0x2C ^ 0x3C ^ (0x69 ^ 0x6C)) & (0x8A ^ 0xBC ^ (0xA8 ^ 0x8B) ^ -1)) != 0;
                    }
                } else {
                    n2 = lIIllIllll[0];
                }
                return n2 != 0;
            }))) {
                AccBuilderRogues.c = lIIllIllII[lIIllIllll[187]];
                lllllllllllllllllllllIIllllIIlIl = Skills.getExperience((Skill)Skill.AGILITY);
                lllllllllllllllllllllIIllllIIllI.interact(lIIllIllII[lIIllIllll[188]]);
                Time.sleepTicks((int)e.c(lIIllIllll[1], lIIllIllll[3]));
                0;
                Time.sleepUntil(() -> {
                    boolean bl;
                    if (J.lIIIIlIIIIIIl(Skills.getExperience((Skill)Skill.AGILITY), lllllllllllllllllllllIIllllIIlIl)) {
                        bl = lIIllIllll[1];
                        0;
                        if (-2 > 0) {
                            return ((221 + 12 - 144 + 145 ^ 128 + 137 - 193 + 90) & (0x12 ^ 0x66 ^ (0x67 ^ 0x5B) ^ -1)) != 0;
                        }
                    } else {
                        bl = lIIllIllll[0];
                    }
                    return bl;
                }, (int)lIIllIllll[104]);
                0;
                Time.sleepTicks((int)lIIllIllll[1]);
                0;
            }
        }
    }

    private static boolean lIIIIIlllllll(int n2) {
        return n2 == 0;
    }

    private static boolean lIIIIIllllllI(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIIIIlIIIIlIl(int n2, int n3) {
        return n2 <= n3;
    }

    private static String lIIIIIlIllIIl(String lllllllllllllllllllllIIlIlIlIlIl, String lllllllllllllllllllllIIlIlIIllll) {
        lllllllllllllllllllllIIlIlIlIlIl = new String(Base64.getDecoder().decode(lllllllllllllllllllllIIlIlIlIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllllllllIIlIlIlIIll = new StringBuilder();
        char[] lllllllllllllllllllllIIlIlIlIIlI = lllllllllllllllllllllIIlIlIIllll.toCharArray();
        int lllllllllllllllllllllIIlIlIlIIIl = lIIllIllll[0];
        char[] lllllllllllllllllllllIIlIlIIlIll = lllllllllllllllllllllIIlIlIlIlIl.toCharArray();
        int lllllllllllllllllllllIIlIlIIlIlI = lllllllllllllllllllllIIlIlIIlIll.length;
        int lllllllllllllllllllllIIlIlIIlIIl = lIIllIllll[0];
        while (J.lIIIIIllllllI(lllllllllllllllllllllIIlIlIIlIIl, lllllllllllllllllllllIIlIlIIlIlI)) {
            char lllllllllllllllllllllIIlIlIlIllI = lllllllllllllllllllllIIlIlIIlIll[lllllllllllllllllllllIIlIlIIlIIl];
            lllllllllllllllllllllIIlIlIlIIll.append((char)(lllllllllllllllllllllIIlIlIlIllI ^ lllllllllllllllllllllIIlIlIlIIlI[lllllllllllllllllllllIIlIlIlIIIl % lllllllllllllllllllllIIlIlIlIIlI.length]));
            0;
            ++lllllllllllllllllllllIIlIlIlIIIl;
            ++lllllllllllllllllllllIIlIlIIlIIl;
            0;
            if (1 < 2) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllllllllIIlIlIlIIll);
    }

    private static boolean lIIIIlIIIIIll(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIIIIlIIIIlII(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIIIIIlllllIl(int n2) {
        return n2 != 0;
    }

    private static boolean lIIIIlIIIIIlI(int n2) {
        return n2 > 0;
    }

    public static void cp() {
        if (J.lIIIIIlllllIl(bt ? 1 : 0)) {
            AccBuilderRogues.c = lIIllIllII[lIIllIllll[0]];
            b.a(bv);
            if (J.lIIIIIllllllI(bv.size(), lIIllIllll[1])) {
                System.out.println(lIIllIllII[lIIllIllll[1]]);
                bt = lIIllIllll[0];
            }
        }
        if (J.lIIIIIlllllll(bt ? 1 : 0) && J.lIIIIIllllllI(Skills.getLevel((Skill)Skill.AGILITY), lIIllIllll[2])) {
            if (J.lIIIIIlllllll(J.ab() ? 1 : 0)) {
                BankLocation lllllllllllllllllllllIlIIlIIlIll = BankLocation.getNearest();
                if (J.lIIIIlIIIIIII(lllllllllllllllllllllIlIIlIIlIll) && J.lIIIIIlllllll(lllllllllllllllllllllIlIIlIIlIll.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderRogues.c = lIIllIllII[lIIllIllll[3]];
                    WorldArea lllllllllllllllllllllIlIIlIIlIlI = new WorldArea(lIIllIllll[4], lIIllIllll[5], lIIllIllll[6], lIIllIllll[7], lIIllIllll[0]);
                    if (J.lIIIIIlllllIl(lllllllllllllllllllllIlIIlIIlIlI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        WorldPoint lllllllllllllllllllllIlIIlIIlIIl = new WorldPoint(lIIllIllll[8], lIIllIllll[9], lIIllIllll[0]);
                        if (J.lIIIIlIIIIIIl(Players.getLocal().getWorldLocation().distanceTo(lllllllllllllllllllllIlIIlIIlIIl), lIIllIllll[10])) {
                            Movement.walkTo((WorldPoint)lllllllllllllllllllllIlIIlIIlIIl);
                            0;
                            Time.sleepTicks((int)lIIllIllll[1]);
                            0;
                        }
                    }
                    a.a(lllllllllllllllllllllIlIIlIIlIll);
                }
                if (J.lIIIIlIIIIIII(lllllllllllllllllllllIlIIlIIlIll) && J.lIIIIIlllllIl(lllllllllllllllllllllIlIIlIIlIll.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderRogues.c = lIIllIllII[lIIllIllll[10]];
                    if (J.lIIIIIlllllll(Bank.isOpen() ? 1 : 0)) {
                        a.a();
                        Time.sleepUntil(() -> Bank.isOpen(), (int)lIIllIllll[11]);
                        0;
                    }
                    if (J.lIIIIIlllllIl(Bank.isOpen() ? 1 : 0)) {
                        if (J.lIIIIlIIIIIlI(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks((int)lIIllIllll[1]);
                            0;
                        }
                        if (J.lIIIIlIIIIIlI(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks((int)lIIllIllll[3]);
                            0;
                        }
                    }
                    int[] nArray = new int[lIIllIllll[12]];
                    nArray[J.lIIllIllll[0]] = lIIllIllll[13];
                    nArray[J.lIIllIllll[1]] = lIIllIllll[14];
                    nArray[J.lIIllIllll[3]] = lIIllIllll[15];
                    nArray[J.lIIllIllll[10]] = lIIllIllll[16];
                    nArray[J.lIIllIllll[17]] = lIIllIllll[18];
                    nArray[J.lIIllIllll[19]] = lIIllIllll[20];
                    nArray[J.lIIllIllll[21]] = lIIllIllll[22];
                    nArray[J.lIIllIllll[23]] = lIIllIllll[24];
                    nArray[J.lIIllIllll[25]] = lIIllIllll[26];
                    nArray[J.lIIllIllll[27]] = lIIllIllll[28];
                    if (J.lIIIIIlllllll(e.b(nArray) ? 1 : 0)) {
                        J.af();
                        System.out.println(lIIllIllII[lIIllIllll[17]]);
                        bt = lIIllIllll[1];
                        return;
                    }
                    int[] nArray2 = new int[lIIllIllll[12]];
                    nArray2[J.lIIllIllll[0]] = lIIllIllll[13];
                    nArray2[J.lIIllIllll[1]] = lIIllIllll[14];
                    nArray2[J.lIIllIllll[3]] = lIIllIllll[15];
                    nArray2[J.lIIllIllll[10]] = lIIllIllll[16];
                    nArray2[J.lIIllIllll[17]] = lIIllIllll[18];
                    nArray2[J.lIIllIllll[19]] = lIIllIllll[20];
                    nArray2[J.lIIllIllll[21]] = lIIllIllll[22];
                    nArray2[J.lIIllIllll[23]] = lIIllIllll[24];
                    nArray2[J.lIIllIllll[25]] = lIIllIllll[26];
                    nArray2[J.lIIllIllll[27]] = lIIllIllll[28];
                    if (J.lIIIIIlllllIl(e.b(nArray2) ? 1 : 0)) {
                        a.a(lIIllIllll[29], lIIllIllll[1]);
                        a.a(lIIllIllll[30], lIIllIllll[1]);
                        a.a(lIIllIllll[31], lIIllIllll[1]);
                        a.a(lIIllIllll[32], lIIllIllll[1]);
                        a.a(lIIllIllll[33], lIIllIllll[1]);
                        a.a(lIIllIllll[34], lIIllIllll[1]);
                        a.a(lIIllIllll[35], lIIllIllll[1]);
                        int[] nArray3 = new int[lIIllIllll[1]];
                        nArray3[J.lIIllIllll[0]] = lIIllIllll[29];
                        if (J.lIIIIIlllllll(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                            int[] nArray4 = new int[lIIllIllll[1]];
                            nArray4[J.lIIllIllll[0]] = lIIllIllll[29];
                            if (J.lIIIIIlllllll(Equipment.contains((int[])nArray4) ? 1 : 0)) {
                                int[] nArray5 = new int[lIIllIllll[1]];
                                nArray5[J.lIIllIllll[0]] = lIIllIllll[29];
                                if (J.lIIIIIlllllll(Bank.contains((int[])nArray5) ? 1 : 0)) {
                                    a.a(lIIllIllll[36], lIIllIllll[1]);
                                }
                            }
                        }
                        a.a(lIIllIllll[18], lIIllIllll[1]);
                        e.l(lIIllIllll[29]);
                        e.l(lIIllIllll[30]);
                        e.l(lIIllIllll[31]);
                        e.l(lIIllIllll[32]);
                        e.l(lIIllIllll[33]);
                        Time.sleepTicks((int)lIIllIllll[1]);
                        0;
                        e.l(lIIllIllll[35]);
                        e.l(lIIllIllll[37]);
                        e.l(lIIllIllll[34]);
                        e.l(lIIllIllll[36]);
                        e.l(lIIllIllll[18]);
                        Time.sleepTicks((int)lIIllIllll[10]);
                        0;
                        if (J.lIIIIIlllllll(Bank.isOpen() ? 1 : 0)) {
                            a.a();
                            Time.sleepTicks((int)lIIllIllll[21]);
                            0;
                        }
                        if (J.lIIIIIlllllIl(Bank.isOpen() ? 1 : 0)) {
                            if (J.lIIIIIllllllI(Skills.getLevel((Skill)Skill.AGILITY), lIIllIllll[38])) {
                                a.a(lIIllIllll[13], lIIllIllll[12]);
                                a.a(lIIllIllll[14], lIIllIllll[12]);
                                a.a(lIIllIllll[22], lIIllIllll[12]);
                                a.a(lIIllIllll[15], lIIllIllll[12]);
                                a.b(f.bf, lIIllIllll[1]);
                                a.a(lIIllIllll[28], lIIllIllll[1]);
                                a.a(lIIllIllll[20], lIIllIllll[19]);
                                a.a(lIIllIllll[24], lIIllIllll[39]);
                            }
                            if (J.lIIIIlIIIIIll(Skills.getLevel((Skill)Skill.AGILITY), lIIllIllll[38])) {
                                a.a(lIIllIllll[13], lIIllIllll[12]);
                                a.a(lIIllIllll[22], lIIllIllll[12]);
                                a.a(lIIllIllll[26], lIIllIllll[12]);
                                a.b(f.bf, lIIllIllll[1]);
                                a.a(lIIllIllll[28], lIIllIllll[1]);
                                a.a(lIIllIllll[20], lIIllIllll[25]);
                                a.a(lIIllIllll[24], lIIllIllll[12]);
                            }
                        }
                    }
                }
            }
            if (J.lIIIIIlllllIl(J.ab() ? 1 : 0)) {
                String[] stringArray = new String[lIIllIllll[1]];
                stringArray[J.lIIllIllll[0]] = lIIllIllII[lIIllIllll[19]];
                if (J.lIIIIIlllllIl(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    String[] stringArray2 = new String[lIIllIllll[1]];
                    stringArray2[J.lIIllIllll[0]] = lIIllIllII[lIIllIllll[21]];
                    Inventory.getFirst((String[])stringArray2).interact(lIIllIllII[lIIllIllll[23]]);
                }
                if (J.lIIIIIlllllIl(Inventory.contains((int[])f.aV) ? 1 : 0) && J.lIIIIIllllllI(Movement.getRunEnergy(), lIIllIllll[2])) {
                    Inventory.getFirst((int[])f.aV).interact(lIIllIllII[lIIllIllll[25]]);
                    Time.sleepTicks((int)lIIllIllll[1]);
                    0;
                }
                if (J.lIIIIlIIIIIIl(Combat.getMissingHealth(), lIIllIllll[40])) {
                    int[] nArray = new int[lIIllIllll[1]];
                    nArray[J.lIIllIllll[0]] = lIIllIllll[24];
                    if (J.lIIIIIlllllIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        int[] nArray6 = new int[lIIllIllll[1]];
                        nArray6[J.lIIllIllll[0]] = lIIllIllll[24];
                        Inventory.getFirst((int[])nArray6).interact(lIIllIllII[lIIllIllll[27]]);
                        Time.sleepTicks((int)lIIllIllll[3]);
                        0;
                    }
                }
                if (J.lIIIIlIIIIIIl(Movement.getRunEnergy(), lIIllIllll[41]) && J.lIIIIIlllllll(Movement.isRunEnabled() ? 1 : 0)) {
                    Movement.toggleRun();
                }
                if (J.lIIIIIllllllI(Skills.getLevel((Skill)Skill.AGILITY), lIIllIllll[42])) {
                    J.cq();
                }
                if ((!J.lIIIIlIIIIIll(e.j(lIIllIllll[43]), lIIllIllll[44]) || J.lIIIIIllllllI(e.j(lIIllIllll[45]), lIIllIllll[19])) && J.lIIIIlIIIIIll(Skills.getLevel((Skill)Skill.AGILITY), lIIllIllll[42]) && J.lIIIIIllllllI(Skills.getLevel((Skill)Skill.AGILITY), lIIllIllll[44])) {
                    J.cr();
                }
                if (J.lIIIIlIIIIIll(e.j(lIIllIllll[43]), lIIllIllll[44]) && J.lIIIIlIIIIIll(e.j(lIIllIllll[45]), lIIllIllll[19])) {
                    if (J.lIIIIlIIIIIll(Skills.getLevel((Skill)Skill.AGILITY), lIIllIllll[42]) && J.lIIIIIllllllI(Skills.getLevel((Skill)Skill.AGILITY), lIIllIllll[38])) {
                        J.cr();
                    }
                    if (J.lIIIIlIIIIIll(Skills.getLevel((Skill)Skill.AGILITY), lIIllIllll[38]) && J.lIIIIIllllllI(Skills.getLevel((Skill)Skill.AGILITY), lIIllIllll[44])) {
                        J.cs();
                    }
                }
                if (J.lIIIIlIIIIIll(Skills.getLevel((Skill)Skill.AGILITY), lIIllIllll[44])) {
                    J.ct();
                }
            }
        }
    }

    @Override
    public boolean S() {
        return lIIllIllll[0];
    }

    /*
     * WARNING - void declaration
     */
    private static boolean cu() {
        WorldArea worldArea = new WorldArea(lIIllIllll[80], lIIllIllll[81], lIIllIllll[69], lIIllIllll[64], lIIllIllll[0]);
        WorldArea worldArea2 = new WorldArea(lIIllIllll[82], lIIllIllll[81], lIIllIllll[12], lIIllIllll[64], lIIllIllll[10]);
        WorldArea worldArea3 = new WorldArea(lIIllIllll[83], lIIllIllll[84], lIIllIllll[63], lIIllIllll[49], lIIllIllll[10]);
        WorldArea worldArea4 = new WorldArea(lIIllIllll[189], lIIllIllll[190], lIIllIllll[25], lIIllIllll[19], lIIllIllll[1]);
        WorldArea worldArea5 = new WorldArea(lIIllIllll[85], lIIllIllll[87], lIIllIllll[12], lIIllIllll[25], lIIllIllll[10]);
        WorldArea worldArea6 = new WorldArea(lIIllIllll[191], lIIllIllll[192], lIIllIllll[73], lIIllIllll[39], lIIllIllll[10]);
        WorldArea worldArea7 = new WorldArea(lIIllIllll[90], lIIllIllll[91], lIIllIllll[66], lIIllIllll[64], lIIllIllll[10]);
        WorldArea worldArea8 = new WorldArea(lIIllIllll[92], lIIllIllll[93], lIIllIllll[23], lIIllIllll[27], lIIllIllll[10]);
        WorldArea worldArea9 = new WorldArea(lIIllIllll[92], lIIllIllll[94], lIIllIllll[12], lIIllIllll[23], lIIllIllll[10]);
        WorldArea worldArea10 = new WorldArea(lIIllIllll[127], lIIllIllll[128], lIIllIllll[49], lIIllIllll[12], lIIllIllll[3]);
        WorldArea worldArea11 = new WorldArea(lIIllIllll[129], lIIllIllll[127], lIIllIllll[49], lIIllIllll[25], lIIllIllll[3]);
        WorldArea worldArea12 = new WorldArea(lIIllIllll[130], lIIllIllll[131], lIIllIllll[63], lIIllIllll[49], lIIllIllll[3]);
        WorldArea worldArea13 = new WorldArea(lIIllIllll[132], lIIllIllll[133], lIIllIllll[12], lIIllIllll[64], lIIllIllll[10]);
        WorldArea worldArea14 = new WorldArea(lIIllIllll[134], lIIllIllll[9], lIIllIllll[49], lIIllIllll[27], lIIllIllll[3]);
        WorldArea worldArea15 = new WorldArea(lIIllIllll[135], lIIllIllll[136], lIIllIllll[68], lIIllIllll[53], lIIllIllll[10]);
        WorldArea worldArea16 = new WorldArea(lIIllIllll[137], lIIllIllll[138], lIIllIllll[63], lIIllIllll[64], lIIllIllll[3]);
        WorldArea worldArea17 = new WorldArea(lIIllIllll[164], lIIllIllll[133], lIIllIllll[64], lIIllIllll[12], lIIllIllll[10]);
        WorldArea worldArea18 = new WorldArea(lIIllIllll[165], lIIllIllll[139], lIIllIllll[39], lIIllIllll[53], lIIllIllll[3]);
        WorldArea worldArea19 = new WorldArea(lIIllIllll[166], lIIllIllll[134], lIIllIllll[49], lIIllIllll[27], lIIllIllll[3]);
        WorldArea worldArea20 = new WorldArea(lIIllIllll[167], lIIllIllll[136], lIIllIllll[70], lIIllIllll[64], lIIllIllll[10]);
        WorldArea worldArea21 = new WorldArea(lIIllIllll[168], lIIllIllll[169], lIIllIllll[54], lIIllIllll[63], lIIllIllll[3]);
        WorldArea[] worldAreaArray = new WorldArea[lIIllIllll[68]];
        worldAreaArray[J.lIIllIllll[0]] = worldArea;
        worldAreaArray[J.lIIllIllll[1]] = worldArea2;
        worldAreaArray[J.lIIllIllll[3]] = worldArea3;
        worldAreaArray[J.lIIllIllll[10]] = worldArea4;
        worldAreaArray[J.lIIllIllll[17]] = worldArea5;
        worldAreaArray[J.lIIllIllll[19]] = worldArea6;
        worldAreaArray[J.lIIllIllll[21]] = worldArea7;
        worldAreaArray[J.lIIllIllll[23]] = worldArea8;
        worldAreaArray[J.lIIllIllll[25]] = worldArea9;
        worldAreaArray[J.lIIllIllll[27]] = worldArea10;
        worldAreaArray[J.lIIllIllll[12]] = worldArea11;
        worldAreaArray[J.lIIllIllll[49]] = worldArea12;
        worldAreaArray[J.lIIllIllll[63]] = worldArea13;
        worldAreaArray[J.lIIllIllll[64]] = worldArea14;
        worldAreaArray[J.lIIllIllll[53]] = worldArea15;
        worldAreaArray[J.lIIllIllll[39]] = worldArea16;
        worldAreaArray[J.lIIllIllll[65]] = worldArea17;
        worldAreaArray[J.lIIllIllll[66]] = worldArea18;
        worldAreaArray[J.lIIllIllll[54]] = worldArea19;
        worldAreaArray[J.lIIllIllll[67]] = worldArea20;
        worldAreaArray[J.lIIllIllll[40]] = worldArea21;
        WorldArea[] worldAreaArray2 = worldAreaArray;
        int[] nArray = new int[lIIllIllll[1]];
        nArray[J.lIIllIllll[0]] = lIIllIllll[193];
        if (J.lIIIIlIIIIIII(TileItems.getNearest((int[])nArray))) {
            void lllllllllllllllllllllIIllIlllIII;
            System.out.println(lIIllIllII[lIIllIllll[194]]);
            int lllllllllllllllllllllIIllIllIlll = lIIllIllll[0];
            while (J.lIIIIIllllllI(lllllllllllllllllllllIIllIllIlll, ((void)lllllllllllllllllllllIIllIlllIII).length)) {
                int[] nArray2 = new int[lIIllIllll[1]];
                nArray2[J.lIIllIllll[0]] = lIIllIllll[193];
                if (J.lIIIIIlllllIl(lllllllllllllllllllllIIllIlllIII[lllllllllllllllllllllIIllIllIlll].contains(TileItems.getNearest((int[])nArray2).getWorldLocation()) ? 1 : 0) && J.lIIIIIlllllIl(lllllllllllllllllllllIIllIlllIII[lllllllllllllllllllllIIllIllIlll].contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    return lIIllIllll[1];
                }
                ++lllllllllllllllllllllIIllIllIlll;
                0;
                if (3 != ((0xA3 ^ 0xC2) & ~(0x2E ^ 0x4F))) continue;
                return ((0x4D ^ 0x6A) & ~(0x1F ^ 0x38)) != 0;
            }
        }
        return lIIllIllll[0];
    }

    @Override
    public boolean V() {
        boolean bl;
        if (J.lIIIIlIIIIIll(Skills.getLevel((Skill)Skill.AGILITY), lIIllIllll[2])) {
            bl = lIIllIllll[1];
            0;
            if (2 < -1) {
                return ((0xBC ^ 0xC2 ^ (0x69 ^ 0x18)) & (29 + 20 - 13 + 106 ^ 66 + 113 - 51 + 1 ^ -1)) != 0;
            }
        } else {
            bl = lIIllIllll[0];
        }
        return bl;
    }

    /*
     * WARNING - void declaration
     */
    private static void cr() {
        WorldArea worldArea = new WorldArea(lIIllIllll[76], lIIllIllll[77], lIIllIllll[78], lIIllIllll[79], lIIllIllll[1]);
        WorldArea worldArea2 = new WorldArea(lIIllIllll[76], lIIllIllll[77], lIIllIllll[78], lIIllIllll[79], lIIllIllll[3]);
        WorldArea worldArea3 = new WorldArea(lIIllIllll[76], lIIllIllll[77], lIIllIllll[78], lIIllIllll[79], lIIllIllll[10]);
        WorldArea worldArea4 = new WorldArea(lIIllIllll[80], lIIllIllll[81], lIIllIllll[69], lIIllIllll[64], lIIllIllll[0]);
        WorldArea worldArea5 = new WorldArea(lIIllIllll[82], lIIllIllll[81], lIIllIllll[12], lIIllIllll[64], lIIllIllll[10]);
        WorldArea worldArea6 = new WorldArea(lIIllIllll[83], lIIllIllll[84], lIIllIllll[63], lIIllIllll[49], lIIllIllll[10]);
        WorldArea worldArea7 = new WorldArea(lIIllIllll[85], lIIllIllll[86], lIIllIllll[27], lIIllIllll[23], lIIllIllll[1]);
        WorldArea worldArea8 = new WorldArea(lIIllIllll[85], lIIllIllll[87], lIIllIllll[12], lIIllIllll[25], lIIllIllll[10]);
        WorldArea worldArea9 = new WorldArea(lIIllIllll[88], lIIllIllll[89], lIIllIllll[75], lIIllIllll[40], lIIllIllll[10]);
        WorldArea worldArea10 = new WorldArea(lIIllIllll[90], lIIllIllll[91], lIIllIllll[66], lIIllIllll[64], lIIllIllll[10]);
        WorldArea worldArea11 = new WorldArea(lIIllIllll[92], lIIllIllll[93], lIIllIllll[23], lIIllIllll[27], lIIllIllll[10]);
        WorldArea worldArea12 = new WorldArea(lIIllIllll[92], lIIllIllll[94], lIIllIllll[12], lIIllIllll[23], lIIllIllll[10]);
        if (J.lIIIIIlllllll(worldArea4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && J.lIIIIIlllllll(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && J.lIIIIIlllllll(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && J.lIIIIIlllllll(worldArea3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderRogues.c = lIIllIllII[lIIllIllll[95]];
            if (J.lIIIIIlllllIl(Bank.isOpen() ? 1 : 0)) {
                Bank.close();
            }
            if (J.lIIIIIlllllIl(Dialog.isOpen() ? 1 : 0)) {
                Dialog.close();
            }
            Movement.walkTo((WorldPoint)new WorldPoint(lIIllIllll[96], lIIllIllll[52], lIIllIllll[0]));
            0;
            Time.sleepTicks((int)lIIllIllll[1]);
            0;
        }
        if (J.lIIIIlIIIIlII(Players.getLocal().getAnimation(), lIIllIllll[62]) && J.lIIIIIlllllll(Players.getLocal().isMoving() ? 1 : 0)) {
            String[] stringArray = new String[lIIllIllll[1]];
            stringArray[J.lIIllIllll[0]] = lIIllIllII[lIIllIllll[97]];
            TileItem lllllllllllllllllllllIlIIIIllllI = TileItems.getNearest((String[])stringArray);
            if (J.lIIIIlIIIIIII(lllllllllllllllllllllIlIIIIllllI) && J.lIIIIIlllllIl(J.cu() ? 1 : 0)) {
                AccBuilderRogues.c = lIIllIllII[lIIllIllll[98]];
                System.out.println(lIIllIllII[lIIllIllll[99]]);
                lllllllllllllllllllllIlIIIIllllI.interact(lIIllIllII[lIIllIllll[100]]);
                Time.sleepTicks((int)lIIllIllll[10]);
                0;
            }
            if (J.lIIIIIlllllll(J.cu() ? 1 : 0)) {
                void lllllllllllllllllllllIlIIIIlllll;
                void lllllllllllllllllllllIlIIIlIIIII;
                void lllllllllllllllllllllIlIIIlIIIIl;
                void lllllllllllllllllllllIlIIIlIIIlI;
                void lllllllllllllllllllllIlIIIlIIIll;
                void lllllllllllllllllllllIlIIIlIIlII;
                void lllllllllllllllllllllIlIIIlIIlIl;
                void lllllllllllllllllllllIlIIIlIIllI;
                int lllllllllllllllllllllIlIIIIlllIl;
                void lllllllllllllllllllllIlIIIlIIlll;
                if (J.lIIIIIlllllIl(lllllllllllllllllllllIlIIIlIIlll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && J.lIIIIIlllllll(J.cu() ? 1 : 0)) {
                    AccBuilderRogues.c = lIIllIllII[lIIllIllll[101]];
                    lllllllllllllllllllllIlIIIIlllIl = Skills.getExperience((Skill)Skill.AGILITY);
                    String[] stringArray2 = new String[lIIllIllll[1]];
                    stringArray2[J.lIIllIllll[0]] = lIIllIllII[lIIllIllll[102]];
                    TileObjects.getNearest((String[])stringArray2).interact(lIIllIllII[lIIllIllll[103]]);
                    Time.sleepUntil(() -> {
                        boolean bl;
                        if (J.lIIIIlIIIIIIl(Skills.getExperience((Skill)Skill.AGILITY), lllllllllllllllllllllIlIIIIlllIl)) {
                            bl = lIIllIllll[1];
                            0;
                            if (null != null) {
                                return ((173 + 1 - 13 + 91 ^ 187 + 1 - 58 + 60) & (0 ^ 0x54 ^ (0x8E ^ 0x98) ^ -1)) != 0;
                            }
                        } else {
                            bl = lIIllIllll[0];
                        }
                        return bl;
                    }, (int)lIIllIllll[104]);
                    0;
                    Time.sleepTicks((int)lIIllIllll[1]);
                    0;
                }
                if (J.lIIIIIlllllIl(lllllllllllllllllllllIlIIIlIIllI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && J.lIIIIIlllllll(J.cu() ? 1 : 0)) {
                    AccBuilderRogues.c = lIIllIllII[lIIllIllll[38]];
                    lllllllllllllllllllllIlIIIIlllIl = Skills.getExperience((Skill)Skill.AGILITY);
                    String[] stringArray3 = new String[lIIllIllll[1]];
                    stringArray3[J.lIIllIllll[0]] = lIIllIllII[lIIllIllll[105]];
                    TileObjects.getNearest((String[])stringArray3).interact(lIIllIllII[lIIllIllll[106]]);
                    Time.sleepUntil(() -> {
                        boolean bl;
                        if (J.lIIIIlIIIIIIl(Skills.getExperience((Skill)Skill.AGILITY), lllllllllllllllllllllIlIIIIlllIl)) {
                            bl = lIIllIllll[1];
                            0;
                            if ((0xF1 ^ 0xBC ^ (0xD ^ 0x44)) <= -1) {
                                return ((0x25 ^ 0x79 ^ (2 ^ 0x70)) & (95 + 129 - 177 + 117 ^ 84 + 107 - 169 + 116 ^ -1)) != 0;
                            }
                        } else {
                            bl = lIIllIllll[0];
                        }
                        return bl;
                    }, (int)lIIllIllll[104]);
                    0;
                    Time.sleepTicks((int)lIIllIllll[1]);
                    0;
                }
                if (J.lIIIIIlllllIl(lllllllllllllllllllllIlIIIlIIlIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && J.lIIIIIlllllll(J.cu() ? 1 : 0)) {
                    AccBuilderRogues.c = lIIllIllII[lIIllIllll[107]];
                    lllllllllllllllllllllIlIIIIlllIl = Skills.getExperience((Skill)Skill.AGILITY);
                    String[] stringArray4 = new String[lIIllIllll[1]];
                    stringArray4[J.lIIllIllll[0]] = lIIllIllII[lIIllIllll[108]];
                    TileObjects.getNearest((String[])stringArray4).interact(lIIllIllII[lIIllIllll[109]]);
                    Time.sleepUntil(() -> {
                        boolean bl;
                        if (J.lIIIIlIIIIIIl(Skills.getExperience((Skill)Skill.AGILITY), lllllllllllllllllllllIlIIIIlllIl)) {
                            bl = lIIllIllll[1];
                            0;
                            if (1 < 0) {
                                return ((0x58 ^ 0x64) & ~(0x8E ^ 0xB2)) != 0;
                            }
                        } else {
                            bl = lIIllIllll[0];
                        }
                        return bl;
                    }, (int)lIIllIllll[104]);
                    0;
                    Time.sleepTicks((int)lIIllIllll[1]);
                    0;
                }
                if (J.lIIIIIlllllIl(lllllllllllllllllllllIlIIIlIIlII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && J.lIIIIIlllllll(J.cu() ? 1 : 0)) {
                    AccBuilderRogues.c = lIIllIllII[lIIllIllll[110]];
                    lllllllllllllllllllllIlIIIIlllIl = Skills.getExperience((Skill)Skill.AGILITY);
                    String[] stringArray5 = new String[lIIllIllll[1]];
                    stringArray5[J.lIIllIllll[0]] = lIIllIllII[lIIllIllll[111]];
                    TileObjects.getNearest((String[])stringArray5).interact(lIIllIllII[lIIllIllll[112]]);
                    Time.sleepUntil(() -> {
                        boolean bl;
                        if (J.lIIIIlIIIIIIl(Skills.getExperience((Skill)Skill.AGILITY), lllllllllllllllllllllIlIIIIlllIl)) {
                            bl = lIIllIllll[1];
                            0;
                            if (3 <= 0) {
                                return ((0xD5 ^ 0x81 ^ (0xFC ^ 0xBB)) & (143 + 111 - 102 + 16 ^ 7 + 90 - -74 + 16 ^ -1) & ((0x82 ^ 0x88 ^ (0xBB ^ 0xBF)) & (30 + 66 - -21 + 49 ^ 108 + 37 - 67 + 90 ^ -1) ^ -1)) != 0;
                            }
                        } else {
                            bl = lIIllIllll[0];
                        }
                        return bl;
                    }, (int)lIIllIllll[104]);
                    0;
                    Time.sleepTicks((int)lIIllIllll[1]);
                    0;
                }
                if (J.lIIIIIlllllIl(lllllllllllllllllllllIlIIIlIIIll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && J.lIIIIIlllllll(J.cu() ? 1 : 0)) {
                    AccBuilderRogues.c = lIIllIllII[lIIllIllll[113]];
                    lllllllllllllllllllllIlIIIIlllIl = Skills.getExperience((Skill)Skill.AGILITY);
                    String[] stringArray6 = new String[lIIllIllll[1]];
                    stringArray6[J.lIIllIllll[0]] = lIIllIllII[lIIllIllll[2]];
                    TileObjects.getNearest((String[])stringArray6).interact(lIIllIllII[lIIllIllll[7]]);
                    Time.sleepUntil(() -> {
                        boolean bl;
                        if (J.lIIIIlIIIIIIl(Skills.getExperience((Skill)Skill.AGILITY), lllllllllllllllllllllIlIIIIlllIl)) {
                            bl = lIIllIllll[1];
                            0;
                            if (((170 + 75 - 79 + 6 ^ 16 + 28 - 37 + 134) & (0x10 ^ 2 ^ (0xB3 ^ 0x80) ^ -1)) != ((196 + 29 - 222 + 231 ^ 162 + 20 - 68 + 60) & (0x58 ^ 0x6F ^ (0x6F ^ 0x1C) ^ -1))) {
                                return ((104 + 86 - 180 + 117 ^ (0xF9 ^ 0xB0)) & (154 + 100 - 97 + 24 ^ 123 + 95 - 137 + 50 ^ -1)) != 0;
                            }
                        } else {
                            bl = lIIllIllll[0];
                        }
                        return bl;
                    }, (int)lIIllIllll[104]);
                    0;
                    Time.sleepTicks((int)lIIllIllll[1]);
                    0;
                }
                if (J.lIIIIIlllllIl(lllllllllllllllllllllIlIIIlIIIlI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && J.lIIIIIlllllll(J.cu() ? 1 : 0)) {
                    AccBuilderRogues.c = lIIllIllII[lIIllIllll[114]];
                    lllllllllllllllllllllIlIIIIlllIl = Skills.getExperience((Skill)Skill.AGILITY);
                    int[] nArray = new int[lIIllIllll[1]];
                    nArray[J.lIIllIllll[0]] = lIIllIllll[115];
                    TileObjects.getNearest((int[])nArray).interact(lIIllIllII[lIIllIllll[116]]);
                    Time.sleepUntil(() -> {
                        boolean bl;
                        if (J.lIIIIlIIIIIIl(Skills.getExperience((Skill)Skill.AGILITY), lllllllllllllllllllllIlIIIIlllIl)) {
                            bl = lIIllIllll[1];
                            0;
                            if (2 < 2) {
                                return ((77 + 89 - 95 + 88 ^ 124 + 137 - 144 + 53) & (0xD1 ^ 0x95 ^ (0x3B ^ 0x4A) ^ -1)) != 0;
                            }
                        } else {
                            bl = lIIllIllll[0];
                        }
                        return bl;
                    }, (int)lIIllIllll[104]);
                    0;
                    Time.sleepTicks((int)lIIllIllll[1]);
                    0;
                }
                if (J.lIIIIIlllllIl(lllllllllllllllllllllIlIIIlIIIIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && J.lIIIIIlllllll(J.cu() ? 1 : 0)) {
                    AccBuilderRogues.c = lIIllIllII[lIIllIllll[117]];
                    lllllllllllllllllllllIlIIIIlllIl = Skills.getExperience((Skill)Skill.AGILITY);
                    int[] nArray = new int[lIIllIllll[1]];
                    nArray[J.lIIllIllll[0]] = lIIllIllll[118];
                    TileObjects.getNearest((int[])nArray).interact(lIIllIllII[lIIllIllll[119]]);
                    Time.sleepUntil(() -> {
                        boolean bl;
                        if (J.lIIIIlIIIIIIl(Skills.getExperience((Skill)Skill.AGILITY), lllllllllllllllllllllIlIIIIlllIl)) {
                            bl = lIIllIllll[1];
                            0;
                            if (((3 ^ (0x6C ^ 0x58)) & (0xE6 ^ 0xA0 ^ (0xC1 ^ 0xB0) ^ -1)) >= 1) {
                                return ((134 + 118 - 150 + 53 ^ 65 + 72 - 31 + 26) & (0x85 ^ 0x8F ^ (0x24 ^ 0x31) ^ -1)) != 0;
                            }
                        } else {
                            bl = lIIllIllll[0];
                        }
                        return bl;
                    }, (int)lIIllIllll[104]);
                    0;
                    Time.sleepTicks((int)lIIllIllll[1]);
                    0;
                }
                if (J.lIIIIIlllllIl(lllllllllllllllllllllIlIIIlIIIII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && J.lIIIIIlllllll(J.cu() ? 1 : 0)) {
                    AccBuilderRogues.c = lIIllIllII[lIIllIllll[120]];
                    lllllllllllllllllllllIlIIIIlllIl = Skills.getExperience((Skill)Skill.AGILITY);
                    int[] nArray = new int[lIIllIllll[1]];
                    nArray[J.lIIllIllll[0]] = lIIllIllll[121];
                    TileObjects.getNearest((int[])nArray).interact(lIIllIllII[lIIllIllll[122]]);
                    Time.sleepUntil(() -> {
                        boolean bl;
                        if (J.lIIIIlIIIIIIl(Skills.getExperience((Skill)Skill.AGILITY), lllllllllllllllllllllIlIIIIlllIl)) {
                            bl = lIIllIllll[1];
                            0;
                            if (-1 > ((79 + 87 - 134 + 192 ^ 167 + 106 - 166 + 64) & (220 + 44 - 105 + 87 ^ 146 + 100 - 186 + 129 ^ -1))) {
                                return ((3 ^ (0xFE ^ 0xA8)) & (0x7A ^ 0x2B ^ (0xA6 ^ 0xA2) ^ -1)) != 0;
                            }
                        } else {
                            bl = lIIllIllll[0];
                        }
                        return bl;
                    }, (int)lIIllIllll[104]);
                    0;
                    Time.sleepTicks((int)lIIllIllll[1]);
                    0;
                }
                if (J.lIIIIIlllllIl(lllllllllllllllllllllIlIIIIlllll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && J.lIIIIIlllllll(J.cu() ? 1 : 0)) {
                    AccBuilderRogues.c = lIIllIllII[lIIllIllll[123]];
                    lllllllllllllllllllllIlIIIIlllIl = Skills.getExperience((Skill)Skill.AGILITY);
                    String[] stringArray7 = new String[lIIllIllll[1]];
                    stringArray7[J.lIIllIllll[0]] = lIIllIllII[lIIllIllll[124]];
                    TileObjects.getNearest((String[])stringArray7).interact(lIIllIllII[lIIllIllll[44]]);
                    Time.sleepUntil(() -> {
                        boolean bl;
                        if (J.lIIIIlIIIIIIl(Skills.getExperience((Skill)Skill.AGILITY), lllllllllllllllllllllIlIIIIlllIl)) {
                            bl = lIIllIllll[1];
                            0;
                            if (((0x25 ^ 0x17 ^ (0xA0 ^ 0xB6)) & (5 ^ 0x3D ^ (0x8A ^ 0x96) ^ -1)) == 1) {
                                return ((175 + 99 - 196 + 101 ^ 50 + 137 - 46 + 33) & (103 + 158 - 115 + 14 ^ 34 + 15 - -15 + 125 ^ -1) & ((110 + 146 - 110 + 50 ^ 60 + 118 - 155 + 105) & (0x27 ^ 0x14 ^ (0xE0 ^ 0x97) ^ -1) ^ -1)) != 0;
                            }
                        } else {
                            bl = lIIllIllll[0];
                        }
                        return bl;
                    }, (int)lIIllIllll[104]);
                    0;
                    Time.sleepTicks((int)lIIllIllll[1]);
                    0;
                }
            }
        }
    }

    private static void lIIIIIlllllII() {
        lIIllIllll = new int[239];
        J.lIIllIllll[0] = (1 ^ 0x30 ^ (0x53 ^ 0x29)) & (0x1C ^ 0x7A ^ (0xA3 ^ 0x8E) ^ -1);
        J.lIIllIllll[1] = 1;
        J.lIIllIllll[2] = 0x5B ^ 0x73 ^ (0xBE ^ 0xA4);
        J.lIIllIllll[3] = 2;
        J.lIIllIllll[4] = -(0xFFFFD6F9 & 0x396F) & (0xFFFFFFFF & 0x1DEF);
        J.lIIllIllll[5] = 0xFFFFAFD7 & 0x5DAD;
        J.lIIllIllll[6] = 0x67 ^ 0x5B ^ 2;
        J.lIIllIllll[7] = 0x94 ^ 0x92 ^ (0x85 ^ 0xB0);
        J.lIIllIllll[8] = -(0xFFFFE03D & 0x3FC3) & (0xFFFFAFBB & 0x7DFC);
        J.lIIllIllll[9] = 0xFFFF8FFB & 0x7D9C;
        J.lIIllIllll[10] = 3;
        J.lIIllIllll[11] = 0xFFFF9399 & 0x7FEE;
        J.lIIllIllll[12] = 0x82 ^ 0x88;
        J.lIIllIllll[13] = 0xFFFFDF4F & 0x3FF7;
        J.lIIllIllll[14] = 0xFFFFDFDC & 0x3F6B;
        J.lIIllIllll[15] = -(0xFFFFD2BD & 0x6DF3) & (0xFFFFDFFF & 0x7FF9);
        J.lIIllIllll[16] = 0xFFFFEFED & 0x1F1F;
        J.lIIllIllll[17] = 113 + 98 - 38 + 8 ^ 6 + 136 - 42 + 77;
        J.lIIllIllll[18] = 0xFFFFBEFD & 0x6FCE;
        J.lIIllIllll[19] = 0xDF ^ 0xC3 ^ (0xA8 ^ 0xB1);
        J.lIIllIllll[20] = 0xFFFFBB75 & 0x75DB;
        J.lIIllIllll[21] = 4 + 124 - 75 + 119 ^ 141 + 91 - 64 + 2;
        J.lIIllIllll[22] = 0xFFFF9F4E & 0x7FFB;
        J.lIIllIllll[23] = 0x4B ^ 0x4C;
        J.lIIllIllll[24] = -(0xFFFFF6FF & 0x3D7F) & (0xFFFFB7FF & 0x7DFF);
        J.lIIllIllll[25] = 0xF9 ^ 0x81 ^ (0xD ^ 0x7D);
        J.lIIllIllll[26] = -(0xFFFFB73D & 0x7BCF) & (0xFFFFFFBF & 0x7FEF);
        J.lIIllIllll[27] = 0x91 ^ 0x98;
        J.lIIllIllll[28] = 0xFFFFFBDF & 0x56BA;
        J.lIIllIllll[29] = 0xFFFFBFF4 & 0x6E5F;
        J.lIIllIllll[30] = 0xFFFFEE58 & 0x3FF7;
        J.lIIllIllll[31] = -(0xFFFFF53F & 0x5BF1) & (0xFFFFFFFF & 0x7F7E);
        J.lIIllIllll[32] = -(0xFFFFFEBB & 0x5157) & (0xFFFFFE5F & 0x7FFE);
        J.lIIllIllll[33] = -(7 ^ 0x26) & (0xFFFFFE76 & 0x2FFB);
        J.lIIllIllll[34] = 0xFFFFEF5E & 0x3EEB;
        J.lIIllIllll[35] = 0xFFFFEED5 & 0x3FEA;
        J.lIIllIllll[36] = 0xD0 ^ 0x88;
        J.lIIllIllll[37] = -(0xFFFFAEB7 & 0x71ED) & (0xFFFFEFAF & Short.MAX_VALUE);
        J.lIIllIllll[38] = 49 + 13 - 25 + 111 ^ 80 + 20 - 6 + 94;
        J.lIIllIllll[39] = 0x55 ^ 0x5A;
        J.lIIllIllll[40] = 0xC ^ 0x26 ^ (0x70 ^ 0x4E);
        J.lIIllIllll[41] = 0x9B ^ 0xBF ^ (0x57 ^ 0x6A);
        J.lIIllIllll[42] = 0xA0 ^ 0xBE;
        J.lIIllIllll[43] = -(0xFFFFFC7A & 0x5FD7) & (0xFFFFFD7F & 0x5FFF);
        J.lIIllIllll[44] = 0xB8 ^ 0xB7 ^ (0x8F ^ 0xBC);
        J.lIIllIllll[45] = -(0xFFFFF6BD & 0x5BC7) & (0xFFFFFBF7 & 0x57BF);
        J.lIIllIllll[46] = -(0xFFFFFE63 & 0x379D) & (0xFFFFBFE7 & 0x7FBD);
        J.lIIllIllll[47] = 0xFFFF9F6F & 0x6DFB;
        J.lIIllIllll[48] = -(0xFFFFE79F & 0x3A78) & (0xFFFFAF77 & Short.MAX_VALUE);
        J.lIIllIllll[49] = 0x47 ^ 0x4C;
        J.lIIllIllll[50] = 0xFFFF8F5F & 0x7DFD;
        J.lIIllIllll[51] = 0xFFFF9DAD & 0x6BF3;
        J.lIIllIllll[52] = -(0xFFFFE2BD & 0x5FE3) & (0xFFFFEFFF & 0x5FF7);
        J.lIIllIllll[53] = 0x4C ^ 0x42;
        J.lIIllIllll[54] = 0x4C ^ 0 ^ (0xD7 ^ 0x89);
        J.lIIllIllll[55] = -(0xFFFFFFC5 & 0x767B) & (0xFFFFFFF3 & Short.MAX_VALUE);
        J.lIIllIllll[56] = -(0xFFFFF8AE & 0x7773) & (0xFFFFFD7D & 0x7FFB);
        J.lIIllIllll[57] = -(0xFFFFB18D & 0x6E7F) & (0xFFFFFDBF & 0x2BFE);
        J.lIIllIllll[58] = -(0xFFFFDEE7 & 0x6339) & (0xFFFFEF7B & 0x5FFD);
        J.lIIllIllll[59] = -(0xF0 ^ 0xB1) & (0xFFFF8DFD & 0x7BF3);
        J.lIIllIllll[60] = 0xFFFFFFF3 & 0xD6F;
        J.lIIllIllll[61] = 0x10 ^ 6;
        J.lIIllIllll[62] = -1;
        J.lIIllIllll[63] = 0x8D ^ 0x92 ^ (0x40 ^ 0x53);
        J.lIIllIllll[64] = 0xB4 ^ 0xB9;
        J.lIIllIllll[65] = 0x60 ^ 0x70;
        J.lIIllIllll[66] = 0x9C ^ 0x8D;
        J.lIIllIllll[67] = 0xB6 ^ 0xA5;
        J.lIIllIllll[68] = 0x6B ^ 0x7E;
        J.lIIllIllll[69] = 12 + 78 - 48 + 99 ^ 54 + 40 - -43 + 17;
        J.lIIllIllll[70] = 0x48 ^ 0x50;
        J.lIIllIllll[71] = 0xED ^ 0xBA ^ (0xF9 ^ 0xB4);
        J.lIIllIllll[72] = 0x7C ^ 0x23 ^ (0xC1 ^ 0x85);
        J.lIIllIllll[73] = 0x78 ^ 0x64;
        J.lIIllIllll[74] = 0x2B ^ 0x1F ^ (0x90 ^ 0xB9);
        J.lIIllIllll[75] = 0x3F ^ 0x20;
        J.lIIllIllll[76] = 0xFFFFBDDF & 0x4E7F;
        J.lIIllIllll[77] = -(0xFFFF93FD & 0x7EE3) & (0xFFFF9FFF & 0x7FF6);
        J.lIIllIllll[78] = 5 + 35 - -24 + 73;
        J.lIIllIllll[79] = 0 ^ 0x5E;
        J.lIIllIllll[80] = 0xFFFFBCBB & 0x4FD7;
        J.lIIllIllll[81] = 0xFFFFDD73 & 0x2FDD;
        J.lIIllIllll[82] = -(0xFFFFAAD3 & 0x577F) & (0xFFFF9FFF & 0x6EDE);
        J.lIIllIllll[83] = 0xFFFF8E7E & 0x7DFF;
        J.lIIllIllll[84] = -(0xFFFFF3EF & 0x7E32) & (0xFFFFFF7D & 0x7FF7);
        J.lIIllIllll[85] = 0xFFFFCCF7 & 0x3F7E;
        J.lIIllIllll[86] = 0xFFFFEFD7 & 0x1D7D;
        J.lIIllIllll[87] = 0xFFFFDF5D & 0x2DEB;
        J.lIIllIllll[88] = 0xFFFFEEFF & 0x1D6B;
        J.lIIllIllll[89] = -(0xFFFFFC7B & 0x33CE) & (0xFFFFBD7F & Short.MAX_VALUE);
        J.lIIllIllll[90] = 0xFFFF9CB3 & 0x6FDD;
        J.lIIllIllll[91] = -(0xFFFFFEF3 & 0x53BE) & (0xFFFFFFFD & 0x5FF3);
        J.lIIllIllll[92] = -(0xFFFFBBCB & 0x757D) & (0xFFFFBFEA & 0x7DFF);
        J.lIIllIllll[93] = 0xFFFFCD6A & 0x3FDF;
        J.lIIllIllll[94] = -(51 + 46 - 48 + 117) & (0xFFFFAFFF & 0x5DF7);
        J.lIIllIllll[95] = 44 + 16 - -31 + 67 ^ 110 + 173 - 182 + 89;
        J.lIIllIllll[96] = -(0xFFFFCF57 & 0x73ED) & (0xFFFFDFFF & 0x6FDC);
        J.lIIllIllll[97] = 14 + 96 - -25 + 22 ^ 32 + 1 - -1 + 154;
        J.lIIllIllll[98] = 203 + 210 - 244 + 56 ^ 190 + 88 - 104 + 21;
        J.lIIllIllll[99] = 215 + 26 - 20 + 4 ^ 88 + 100 - 176 + 182;
        J.lIIllIllll[100] = 19 + 110 - 72 + 123 ^ 46 + 67 - 48 + 79;
        J.lIIllIllll[101] = 0x20 ^ 5;
        J.lIIllIllll[102] = 0x90 ^ 0xB6;
        J.lIIllIllll[103] = 0xA0 ^ 0x87;
        J.lIIllIllll[104] = -(0xFFFFEBFC & 0x56CF) & (0xFFFFFBFF & 0x67FF);
        J.lIIllIllll[105] = 0x33 ^ 0x1A;
        J.lIIllIllll[106] = 0x44 ^ 0x26 ^ (0x53 ^ 0x1B);
        J.lIIllIllll[107] = 0xA4 ^ 0x8F;
        J.lIIllIllll[108] = 0xBB ^ 0x97;
        J.lIIllIllll[109] = 0x2B ^ 6;
        J.lIIllIllll[110] = 0xEE ^ 0xC0;
        J.lIIllIllll[111] = 0xBE ^ 0xA6 ^ (0x3D ^ 0xA);
        J.lIIllIllll[112] = 8 + 59 - 62 + 140 ^ 64 + 12 - 73 + 158;
        J.lIIllIllll[113] = 0x1F ^ 0x22 ^ (0x2C ^ 0x20);
        J.lIIllIllll[114] = 0xC9 ^ 0xC7 ^ (6 ^ 0x3C);
        J.lIIllIllll[115] = 0xFFFFB9F7 & 0x7FFA;
        J.lIIllIllll[116] = 0x4B ^ 0x7E;
        J.lIIllIllll[117] = 64 + 16 - 35 + 91 ^ 83 + 82 - 66 + 91;
        J.lIIllIllll[118] = 0xFFFFFBF7 & 0x3DFB;
        J.lIIllIllll[119] = 0x1B ^ 0x2C;
        J.lIIllIllll[120] = 0x44 ^ 0x7C;
        J.lIIllIllll[121] = -(0xFFFFFA2A & 0x45D7) & (0xFFFFFDF7 & 0x7BFD);
        J.lIIllIllll[122] = 0x81 ^ 0xB8;
        J.lIIllIllll[123] = 0x64 ^ 0x24 ^ (0x27 ^ 0x5D);
        J.lIIllIllll[124] = 0xBE ^ 0x85;
        J.lIIllIllll[125] = 0xFFFFDFDF & 0x2DAF;
        J.lIIllIllll[126] = -(0xFFFFF27D & 0x5FD7) & (0xFFFFFFDF & 0x5FFE);
        J.lIIllIllll[127] = -(0xFFFFF3D7 & 0x7E7A) & (0xFFFFFFFF & Short.MAX_VALUE);
        J.lIIllIllll[128] = 0xFFFF9DAB & 0x6FF6;
        J.lIIllIllll[129] = -(0xC6 ^ 0x8F) & (0xFFFF8DEF & Short.MAX_VALUE);
        J.lIIllIllll[130] = -(0xFFFFB6E5 & 0x7B5F) & (0xFFFFBFDF & Short.MAX_VALUE);
        J.lIIllIllll[131] = -(0xFFFFE33F & 0x7CD5) & (0xFFFFFFFF & 0x6DBD);
        J.lIIllIllll[132] = 0xFFFFAD9C & 0x5FF3;
        J.lIIllIllll[133] = 0xFFFFADA9 & 0x5FF7;
        J.lIIllIllll[134] = -(0xFFFFF0EF & 0x1F59) & (0xFFFFFFDF & 0x1DFB);
        J.lIIllIllll[135] = 0xFFFF9DDD & 0x6FBF;
        J.lIIllIllll[136] = -(0xFFFFC773 & 0x7AAD) & (0xFFFFFFFF & 0x4FAB);
        J.lIIllIllll[137] = -(0xFFFFF37B & 0x6ECD) & (0xFFFFFFFE & 0x6FFB);
        J.lIIllIllll[138] = 0xFFFFADFB & 0x5F95;
        J.lIIllIllll[139] = -(0xFFFFF3DF & 0x1E61) & (0xFFFFFFFF & 0x1FDE);
        J.lIIllIllll[140] = 0x21 ^ 0x39 ^ (0x51 ^ 0x74);
        J.lIIllIllll[141] = 0xD1 ^ 0xB7 ^ (0x38 ^ 0x61);
        J.lIIllIllll[142] = 0xC2 ^ 0x82;
        J.lIIllIllll[143] = 0xAF ^ 0x84 ^ (0xC0 ^ 0xAA);
        J.lIIllIllll[144] = 127 + 110 - 211 + 175 ^ 89 + 34 - 71 + 87;
        J.lIIllIllll[145] = 0xD ^ 0x4E;
        J.lIIllIllll[146] = 0x4E ^ 0x73 ^ (0x6C ^ 0x15);
        J.lIIllIllll[147] = 0x42 ^ 7;
        J.lIIllIllll[148] = 0x4F ^ 9;
        J.lIIllIllll[149] = 0x32 ^ 0x75;
        J.lIIllIllll[150] = 0xF0 ^ 0xB8;
        J.lIIllIllll[151] = 0xF6 ^ 0xBF;
        J.lIIllIllll[152] = 0x24 ^ 0x6E;
        J.lIIllIllll[153] = 0x53 ^ 0x18;
        J.lIIllIllll[154] = 0xDF ^ 0x93;
        J.lIIllIllll[155] = 0x22 ^ 0xD ^ (0x45 ^ 0x27);
        J.lIIllIllll[156] = 0x55 ^ 0x1B;
        J.lIIllIllll[157] = 0x6A ^ 0x41 ^ (0xF7 ^ 0x93);
        J.lIIllIllll[158] = 0xD1 ^ 0x81;
        J.lIIllIllll[159] = 0x2B ^ 0x7A;
        J.lIIllIllll[160] = 0x59 ^ 0x14 ^ (0xB0 ^ 0xAF);
        J.lIIllIllll[161] = 0xE8 ^ 0xBB;
        J.lIIllIllll[162] = -(0xFFFFF715 & 0x79EB) & (0xFFFFFBFF & 0x7F7F);
        J.lIIllIllll[163] = 0xFFFFAF7F & 0x5DFE;
        J.lIIllIllll[164] = 0xFFFFEFBF & 0x1ADF;
        J.lIIllIllll[165] = -(0xFFFFDEAB & 0x6555) & (0xFFFFCF8F & 0x7EFD);
        J.lIIllIllll[166] = 0xFFFFBFFF & 0x4A93;
        J.lIIllIllll[167] = -(0xFFFFFE77 & 0x51FB) & (0xFFFFDAFF & 0x7FFB);
        J.lIIllIllll[168] = 0xFFFFEFB0 & 0x1ACF;
        J.lIIllIllll[169] = 0xFFFFEF8B & 0x1DF5;
        J.lIIllIllll[170] = -(0xFFFFF0BF & 0x5F57) & (0xFFFFFAFF & 0x5FBF);
        J.lIIllIllll[171] = -(0xD ^ 0x5F) & (0xFFFFEDF1 & 0x1FFF);
        J.lIIllIllll[172] = 0x41 ^ 0x15;
        J.lIIllIllll[173] = 0x3C ^ 0x69;
        J.lIIllIllll[174] = 4 ^ 0x77 ^ (0x5C ^ 0x79);
        J.lIIllIllll[175] = 0x3D ^ 0x6A;
        J.lIIllIllll[176] = 0xCB ^ 0x92;
        J.lIIllIllll[177] = 0xDF ^ 0x92 ^ (0x84 ^ 0x93);
        J.lIIllIllll[178] = 0xE9 ^ 0x89 ^ (0xBA ^ 0x81);
        J.lIIllIllll[179] = 0xA ^ 0x56;
        J.lIIllIllll[180] = 0xFA ^ 0xA7;
        J.lIIllIllll[181] = 0x48 ^ 0x17;
        J.lIIllIllll[182] = 0x67 ^ 7;
        J.lIIllIllll[183] = 0x59 ^ 0x38;
        J.lIIllIllll[184] = 184 + 169 - 240 + 104 ^ 152 + 53 - 82 + 64;
        J.lIIllIllll[185] = 0xF ^ 0x6C;
        J.lIIllIllll[186] = 0x6D ^ 9;
        J.lIIllIllll[187] = 109 + 155 - 189 + 176 ^ 29 + 151 - 86 + 64;
        J.lIIllIllll[188] = 0xE6 ^ 0x80;
        J.lIIllIllll[189] = 0xFFFFFDFF & 0xE77;
        J.lIIllIllll[190] = 0xFFFFCFDF & 0x3D76;
        J.lIIllIllll[191] = -(0xFFFFF5D2 & 0x1BBF) & (0xFFFFBDFF & 0x5FFF);
        J.lIIllIllll[192] = -(0xFFFFEBEF & 0x76D5) & (0xFFFFFFFF & 0x6FFF);
        J.lIIllIllll[193] = -(0xFFFFF2DD & 0x1D37) & (0xFFFFFE7F & 0x3FDD);
        J.lIIllIllll[194] = 0x1C ^ 0x7B;
        J.lIIllIllll[195] = -(0xFFFFEE93 & 0x3BEF) & (0xFFFFFFFE & 0x3FFF);
        J.lIIllIllll[196] = 0xFFFFF9FE & 0x67A9;
        J.lIIllIllll[197] = 0xFFFFE394 & 0x1FEF;
        J.lIIllIllll[198] = -(0xFFFFEC79 & 0x778F) & (0xFFFFFFFE & 0x67BF);
        J.lIIllIllll[199] = -(0xFFFFEB6A & 0x7CB7) & (0xFFFFFFFF & 0x6FBF);
        J.lIIllIllll[200] = -(0xFFFFFB95 & 0x56B) & (0xFFFFAFFF & 0x73F6);
        J.lIIllIllll[201] = -(0xFFFFFBF6 & 0x542F) & (0xFFFFFEEF & Short.MAX_VALUE);
        J.lIIllIllll[202] = 0xFFFFEDFF & 0x775E;
        J.lIIllIllll[203] = 0x59 ^ 0x40 ^ (0x7B ^ 0xA);
        J.lIIllIllll[204] = 0x69 ^ 0;
        J.lIIllIllll[205] = 0xD0 ^ 0xBA;
        J.lIIllIllll[206] = 0x3F ^ 0x2A ^ (0x7F ^ 1);
        J.lIIllIllll[207] = 2 ^ 0x31 ^ (0x69 ^ 0x36);
        J.lIIllIllll[208] = 0x55 ^ 0x38;
        J.lIIllIllll[209] = 0xFFFF9B8F & 0x6EFF;
        J.lIIllIllll[210] = -(0xFFFFB817 & 0x57ED) & (0xFFFF9DBF & 0x7FCD);
        J.lIIllIllll[211] = 0x67 ^ 5 ^ (0x8A ^ 0x86);
        J.lIIllIllll[212] = -(0xFFFFAF73 & 0x70BF) & (0xFFFFBDFF & 0x6FBF);
        J.lIIllIllll[213] = 5 ^ 0x6A;
        J.lIIllIllll[214] = 0xFFFFCFBF & 0x3AD7;
        J.lIIllIllll[215] = 0xFFFFDFF6 & 0x2D9D;
        J.lIIllIllll[216] = 0xB6 ^ 0xC6;
        J.lIIllIllll[217] = -(0xFFFFFD9F & 0x376A) & (0xFFFFBFFF & 0x7F9F);
        J.lIIllIllll[218] = 0x3C ^ 0x4D;
        J.lIIllIllll[219] = -(0xFFFFF15B & 0x6FFF) & (0xFFFFEFFB & 0x7BFF);
        J.lIIllIllll[220] = 0xFFFFCFE7 & 0x3DBD;
        J.lIIllIllll[221] = 0xCC ^ 0xBE;
        J.lIIllIllll[222] = -(0xFFFFC3EF & 0x7C51) & (0xFFFFDDFE & 0x6FF7);
        J.lIIllIllll[223] = -(0xFFFFD4F7 & 0x7B0A) & (0xFFFFFF9F & 0x5DFD);
        J.lIIllIllll[224] = 32 + 67 - -141 + 2 ^ 70 + 57 - 112 + 114;
        J.lIIllIllll[225] = -(0xFFFFEABF & 0x7541) & (0xFFFFFDBF & 0x6FEF);
        J.lIIllIllll[226] = 0xB0 ^ 0xC4;
        J.lIIllIllll[227] = 0x59 ^ 0x2C;
        J.lIIllIllll[228] = 0xFFFFEF97 & 0x1DFE;
        J.lIIllIllll[229] = -(0xFFFFBADD & 0x577E) & (0xFFFF9FFF & Short.MAX_VALUE);
        J.lIIllIllll[230] = 96 + 31 - -87 + 29 ^ 131 + 57 - 170 + 115;
        J.lIIllIllll[231] = 0xFFFFCFEB & 0x3DBF;
        J.lIIllIllll[232] = 0x4F ^ 0x38;
        J.lIIllIllll[233] = 0x64 ^ 0x1C;
        J.lIIllIllll[234] = 0xFFFFCFB1 & 0x3DFF;
        J.lIIllIllll[235] = -(0xFFFFF7FF & 0x5E09) & (0xFFFFDFEC & 0x7FBF);
        J.lIIllIllll[236] = -(0xFFFFF7E7 & 0x7E1A) & (0xFFFFFFBF & 0x7FEB);
        J.lIIllIllll[237] = -(0xFFFFBFFB & 0x7297) & (0xFFFFFFFF & 0x3FFF);
        J.lIIllIllll[238] = 0x35 ^ 0x4C;
    }

    /*
     * WARNING - void declaration
     */
    private static void cs() {
        void lllllllllllllllllllllIlIIIIIIIlI;
        void lllllllllllllllllllllIlIIIIIlIlI;
        void lllllllllllllllllllllIlIIIIIlIll;
        void lllllllllllllllllllllIlIIIIIllII;
        void lllllllllllllllllllllIlIIIIIllIl;
        WorldArea worldArea = new WorldArea(lIIllIllll[125], lIIllIllll[126], lIIllIllll[112], lIIllIllll[107], lIIllIllll[0]);
        WorldArea worldArea2 = new WorldArea(lIIllIllll[125], lIIllIllll[126], lIIllIllll[112], lIIllIllll[107], lIIllIllll[1]);
        WorldArea worldArea3 = new WorldArea(lIIllIllll[125], lIIllIllll[126], lIIllIllll[112], lIIllIllll[107], lIIllIllll[3]);
        WorldArea worldArea4 = new WorldArea(lIIllIllll[125], lIIllIllll[126], lIIllIllll[112], lIIllIllll[107], lIIllIllll[10]);
        WorldArea worldArea5 = new WorldArea(lIIllIllll[127], lIIllIllll[128], lIIllIllll[49], lIIllIllll[12], lIIllIllll[3]);
        WorldArea worldArea6 = new WorldArea(lIIllIllll[129], lIIllIllll[127], lIIllIllll[49], lIIllIllll[25], lIIllIllll[3]);
        WorldArea worldArea7 = new WorldArea(lIIllIllll[130], lIIllIllll[131], lIIllIllll[63], lIIllIllll[49], lIIllIllll[3]);
        WorldArea worldArea8 = new WorldArea(lIIllIllll[132], lIIllIllll[133], lIIllIllll[12], lIIllIllll[64], lIIllIllll[10]);
        WorldArea worldArea9 = new WorldArea(lIIllIllll[134], lIIllIllll[9], lIIllIllll[49], lIIllIllll[27], lIIllIllll[3]);
        WorldArea worldArea10 = new WorldArea(lIIllIllll[135], lIIllIllll[136], lIIllIllll[68], lIIllIllll[53], lIIllIllll[10]);
        WorldArea worldArea11 = new WorldArea(lIIllIllll[137], lIIllIllll[138], lIIllIllll[63], lIIllIllll[64], lIIllIllll[3]);
        WorldPoint worldPoint = new WorldPoint(lIIllIllll[137], lIIllIllll[139], lIIllIllll[0]);
        if (J.lIIIIIlllllIl(Dialog.isOpen() ? 1 : 0)) {
            Dialog.close();
        }
        if (J.lIIIIIlllllll(lllllllllllllllllllllIlIIIIIllIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && J.lIIIIIlllllll(lllllllllllllllllllllIlIIIIIllII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && J.lIIIIIlllllll(lllllllllllllllllllllIlIIIIIlIll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && J.lIIIIIlllllll(lllllllllllllllllllllIlIIIIIlIlI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderRogues.c = lIIllIllII[lIIllIllll[140]];
            Movement.walkTo((WorldPoint)lllllllllllllllllllllIlIIIIIIIlI);
            0;
            Time.sleepTicks((int)lIIllIllll[1]);
            0;
        }
        if (J.lIIIIIlllllIl(lllllllllllllllllllllIlIIIIIllIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (J.lIIIIlIIIIIIl(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lllllllllllllllllllllIlIIIIIIIlI), lIIllIllll[21])) {
                AccBuilderRogues.c = lIIllIllII[lIIllIllll[6]];
                Movement.walkTo((WorldPoint)lllllllllllllllllllllIlIIIIIIIlI);
                0;
                Time.sleepTicks((int)lIIllIllll[1]);
                0;
            }
            if (J.lIIIIlIIIIlIl(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lllllllllllllllllllllIlIIIIIIIlI), lIIllIllll[21])) {
                AccBuilderRogues.c = lIIllIllII[lIIllIllll[141]];
                int lllllllllllllllllllllIlIIIIIIIIl = Skills.getExperience((Skill)Skill.AGILITY);
                String[] stringArray = new String[lIIllIllll[1]];
                stringArray[J.lIIllIllll[0]] = lIIllIllII[lIIllIllll[142]];
                TileObjects.getNearest((String[])stringArray).interact(lIIllIllII[lIIllIllll[143]]);
                Time.sleepTicks((int)e.c(lIIllIllll[1], lIIllIllll[3]));
                0;
                Time.sleepUntil(() -> {
                    boolean bl;
                    if (J.lIIIIlIIIIIIl(Skills.getExperience((Skill)Skill.AGILITY), lllllllllllllllllllllIlIIIIIIIIl)) {
                        bl = lIIllIllll[1];
                        0;
                        if (((0x3E ^ 7 ^ (0x11 ^ 0x6D)) & (1 ^ (9 ^ 0x4D) ^ -1)) > (0xED ^ 0xAF ^ (0x3C ^ 0x7A))) {
                            return ((0x52 ^ 0x5F ^ (2 ^ 0x55)) & (0x5D ^ 0x58 ^ (0x7E ^ 0x21) ^ -1)) != 0;
                        }
                    } else {
                        bl = lIIllIllll[0];
                    }
                    return bl;
                }, (int)lIIllIllll[104]);
                0;
                Time.sleepTicks((int)lIIllIllll[1]);
                0;
            }
        }
        String[] stringArray = new String[lIIllIllll[1]];
        stringArray[J.lIIllIllll[0]] = lIIllIllII[lIIllIllll[144]];
        TileItem lllllllllllllllllllllIlIIIIIIIIl = TileItems.getNearest((String[])stringArray);
        if (J.lIIIIlIIIIIII(lllllllllllllllllllllIlIIIIIIIIl) && J.lIIIIIlllllIl(J.cu() ? 1 : 0)) {
            AccBuilderRogues.c = lIIllIllII[lIIllIllll[145]];
            System.out.println(lIIllIllII[lIIllIllll[146]]);
            lllllllllllllllllllllIlIIIIIIIIl.interact(lIIllIllII[lIIllIllll[147]]);
            Time.sleepTicks((int)lIIllIllll[10]);
            0;
        }
        if (J.lIIIIIlllllll(J.cu() ? 1 : 0)) {
            void lllllllllllllllllllllIlIIIIIIIll;
            void lllllllllllllllllllllIlIIIIIIlII;
            void lllllllllllllllllllllIlIIIIIIlIl;
            void lllllllllllllllllllllIlIIIIIIllI;
            void lllllllllllllllllllllIlIIIIIIlll;
            void lllllllllllllllllllllIlIIIIIlIII;
            int lllllllllllllllllllllIIlllllllll;
            TileObject lllllllllllllllllllllIlIIIIIIIII;
            void lllllllllllllllllllllIlIIIIIlIIl;
            if (J.lIIIIIlllllIl(lllllllllllllllllllllIlIIIIIlIIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && J.lIIIIlIIIIIII(lllllllllllllllllllllIlIIIIIIIII = TileObjects.getNearest(tileObject -> {
                int n2;
                if (J.lIIIIIlllllIl(tileObject.getName().contains(lIIllIllII[lIIllIllll[233]]) ? 1 : 0) && J.lIIIIlIIIIlIl(tileObject.getWorldLocation().distanceTo(new WorldPoint(lIIllIllll[234], lIIllIllll[131], lIIllIllll[3])), lIIllIllll[3])) {
                    n2 = lIIllIllll[1];
                    0;
                    if (null != null) {
                        return ((0xAB ^ 0x9B ^ (0x71 ^ 0x4E)) & (108 + 5 - 10 + 58 ^ 131 + 139 - 190 + 94 ^ -1)) != 0;
                    }
                } else {
                    n2 = lIIllIllll[0];
                }
                return n2 != 0;
            }))) {
                lllllllllllllllllllllIIlllllllll = Skills.getExperience((Skill)Skill.AGILITY);
                AccBuilderRogues.c = lIIllIllII[lIIllIllll[148]];
                lllllllllllllllllllllIlIIIIIIIII.interact(lIIllIllII[lIIllIllll[149]]);
                Time.sleepTicks((int)e.c(lIIllIllll[1], lIIllIllll[3]));
                0;
                Time.sleepUntil(() -> {
                    boolean bl;
                    if (J.lIIIIlIIIIIIl(Skills.getExperience((Skill)Skill.AGILITY), lllllllllllllllllllllIIlllllllll)) {
                        bl = lIIllIllll[1];
                        0;
                        if (null != null) {
                            return ((1 ^ 0x20) & ~(0xAA ^ 0x8B)) != 0;
                        }
                    } else {
                        bl = lIIllIllll[0];
                    }
                    return bl;
                }, (int)lIIllIllll[104]);
                0;
                Time.sleepTicks((int)lIIllIllll[1]);
                0;
            }
            if (J.lIIIIIlllllIl(J.cu() ? 1 : 0)) {
                return;
            }
            if (J.lIIIIIlllllIl(lllllllllllllllllllllIlIIIIIlIII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && J.lIIIIlIIIIIII(lllllllllllllllllllllIlIIIIIIIII = TileObjects.getNearest(tileObject -> {
                int n2;
                if (J.lIIIIIlllllIl(tileObject.getName().contains(lIIllIllII[lIIllIllll[232]]) ? 1 : 0) && J.lIIIIlIIIIlIl(tileObject.getWorldLocation().distanceTo(new WorldPoint(lIIllIllll[131], lIIllIllll[225], lIIllIllll[3])), lIIllIllll[3])) {
                    n2 = lIIllIllll[1];
                    0;
                    if (1 != 1) {
                        return ((0x5E ^ 0x3B ^ (0x73 ^ 0x57)) & (64 + 159 - 137 + 159 ^ 149 + 13 - 140 + 158 ^ -1)) != 0;
                    }
                } else {
                    n2 = lIIllIllll[0];
                }
                return n2 != 0;
            }))) {
                AccBuilderRogues.c = lIIllIllII[lIIllIllll[150]];
                lllllllllllllllllllllIIlllllllll = Skills.getExperience((Skill)Skill.AGILITY);
                lllllllllllllllllllllIlIIIIIIIII.interact(lIIllIllII[lIIllIllll[151]]);
                Time.sleepTicks((int)e.c(lIIllIllll[1], lIIllIllll[3]));
                0;
                Time.sleepUntil(() -> {
                    boolean bl;
                    if (J.lIIIIlIIIIIIl(Skills.getExperience((Skill)Skill.AGILITY), lllllllllllllllllllllIIlllllllll)) {
                        bl = lIIllIllll[1];
                        0;
                        if ((68 + 72 - 73 + 60 ^ (0x71 ^ 0xA)) != (0x3D ^ 0x71 ^ (0xD4 ^ 0x9C))) {
                            return ((155 + 22 - 42 + 22 ^ 57 + 51 - -50 + 30) & (0x74 ^ 0x5B ^ (0xAF ^ 0xA1) ^ -1)) != 0;
                        }
                    } else {
                        bl = lIIllIllll[0];
                    }
                    return bl;
                }, (int)lIIllIllll[104]);
                0;
                Time.sleepTicks((int)lIIllIllll[1]);
                0;
            }
            if (J.lIIIIIlllllIl(J.cu() ? 1 : 0)) {
                return;
            }
            if (J.lIIIIIlllllIl(lllllllllllllllllllllIlIIIIIIlll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && J.lIIIIlIIIIIII(lllllllllllllllllllllIlIIIIIIIII = TileObjects.getNearest(tileObject -> {
                int n2;
                if (J.lIIIIIlllllIl(tileObject.getName().contains(lIIllIllII[lIIllIllll[230]]) ? 1 : 0) && J.lIIIIlIIIIlIl(tileObject.getWorldLocation().distanceTo(new WorldPoint(lIIllIllll[139], lIIllIllll[231], lIIllIllll[3])), lIIllIllll[3])) {
                    n2 = lIIllIllll[1];
                    0;
                    if (null != null) {
                        return ((0x3F ^ 0xD ^ (0x17 ^ 5)) & (0xF6 ^ 0xC4 ^ (0x94 ^ 0x86) ^ -1)) != 0;
                    }
                } else {
                    n2 = lIIllIllll[0];
                }
                return n2 != 0;
            }))) {
                AccBuilderRogues.c = lIIllIllII[lIIllIllll[152]];
                lllllllllllllllllllllIIlllllllll = Skills.getExperience((Skill)Skill.AGILITY);
                lllllllllllllllllllllIlIIIIIIIII.interact(lIIllIllII[lIIllIllll[153]]);
                Time.sleepTicks((int)e.c(lIIllIllll[1], lIIllIllll[3]));
                0;
                Time.sleepUntil(() -> {
                    boolean bl;
                    if (J.lIIIIlIIIIIIl(Skills.getExperience((Skill)Skill.AGILITY), lllllllllllllllllllllIIlllllllll)) {
                        bl = lIIllIllll[1];
                        0;
                        if (3 <= 0) {
                            return (3 & ~3) != 0;
                        }
                    } else {
                        bl = lIIllIllll[0];
                    }
                    return bl;
                }, (int)lIIllIllll[104]);
                0;
                Time.sleepTicks((int)lIIllIllll[1]);
                0;
            }
            if (J.lIIIIIlllllIl(J.cu() ? 1 : 0)) {
                return;
            }
            if (J.lIIIIIlllllIl(lllllllllllllllllllllIlIIIIIIllI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && J.lIIIIlIIIIIII(lllllllllllllllllllllIlIIIIIIIII = TileObjects.getNearest(tileObject -> {
                int n2;
                if (J.lIIIIIlllllIl(tileObject.getName().contains(lIIllIllII[lIIllIllll[227]]) ? 1 : 0) && J.lIIIIlIIIIlIl(tileObject.getWorldLocation().distanceTo(new WorldPoint(lIIllIllll[228], lIIllIllll[229], lIIllIllll[10])), lIIllIllll[3])) {
                    n2 = lIIllIllll[1];
                    0;
                    if ((0x5C ^ 0x58) == 0) {
                        return ((0x60 ^ 0x64) & ~(0x71 ^ 0x75)) != 0;
                    }
                } else {
                    n2 = lIIllIllll[0];
                }
                return n2 != 0;
            }))) {
                AccBuilderRogues.c = lIIllIllII[lIIllIllll[154]];
                lllllllllllllllllllllIIlllllllll = Skills.getExperience((Skill)Skill.AGILITY);
                lllllllllllllllllllllIlIIIIIIIII.interact(lIIllIllII[lIIllIllll[155]]);
                Time.sleepTicks((int)e.c(lIIllIllll[1], lIIllIllll[3]));
                0;
                Time.sleepUntil(() -> {
                    boolean bl;
                    if (J.lIIIIlIIIIIIl(Skills.getExperience((Skill)Skill.AGILITY), lllllllllllllllllllllIIlllllllll)) {
                        bl = lIIllIllll[1];
                        0;
                        if (2 < 0) {
                            return ((0xEB ^ 0xBA) & ~(0x96 ^ 0xC7)) != 0;
                        }
                    } else {
                        bl = lIIllIllll[0];
                    }
                    return bl;
                }, (int)lIIllIllll[104]);
                0;
                Time.sleepTicks((int)lIIllIllll[1]);
                0;
            }
            if (J.lIIIIIlllllIl(J.cu() ? 1 : 0)) {
                return;
            }
            if (J.lIIIIIlllllIl(lllllllllllllllllllllIlIIIIIIlIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && J.lIIIIlIIIIIII(lllllllllllllllllllllIlIIIIIIIII = TileObjects.getNearest(tileObject -> {
                int n2;
                if (J.lIIIIIlllllIl(tileObject.getName().contains(lIIllIllII[lIIllIllll[226]]) ? 1 : 0) && J.lIIIIlIIIIlIl(tileObject.getWorldLocation().distanceTo(new WorldPoint(lIIllIllll[9], lIIllIllll[130], lIIllIllll[3])), lIIllIllll[3])) {
                    n2 = lIIllIllll[1];
                    0;
                    if (2 <= 1) {
                        return ((0x13 ^ 0x15) & ~(0x40 ^ 0x46)) != 0;
                    }
                } else {
                    n2 = lIIllIllll[0];
                }
                return n2 != 0;
            }))) {
                AccBuilderRogues.c = lIIllIllII[lIIllIllll[156]];
                lllllllllllllllllllllIIlllllllll = Skills.getExperience((Skill)Skill.AGILITY);
                lllllllllllllllllllllIlIIIIIIIII.interact(lIIllIllII[lIIllIllll[157]]);
                Time.sleepTicks((int)e.c(lIIllIllll[1], lIIllIllll[3]));
                0;
                Time.sleepUntil(() -> {
                    boolean bl;
                    if (J.lIIIIlIIIIIIl(Skills.getExperience((Skill)Skill.AGILITY), lllllllllllllllllllllIIlllllllll)) {
                        bl = lIIllIllll[1];
                        0;
                        if (3 <= -1) {
                            return ((0x4C ^ 0x5B) & ~(0x8A ^ 0x9D)) != 0;
                        }
                    } else {
                        bl = lIIllIllll[0];
                    }
                    return bl;
                }, (int)lIIllIllll[104]);
                0;
                Time.sleepTicks((int)lIIllIllll[1]);
                0;
            }
            if (J.lIIIIIlllllIl(J.cu() ? 1 : 0)) {
                return;
            }
            if (J.lIIIIIlllllIl(lllllllllllllllllllllIlIIIIIIlII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && J.lIIIIlIIIIIII(lllllllllllllllllllllIlIIIIIIIII = TileObjects.getNearest(tileObject -> {
                int n2;
                if (J.lIIIIIlllllIl(tileObject.getName().contains(lIIllIllII[lIIllIllll[224]]) ? 1 : 0) && J.lIIIIlIIIIlIl(tileObject.getWorldLocation().distanceTo(new WorldPoint(lIIllIllll[225], lIIllIllll[215], lIIllIllll[10])), lIIllIllll[3])) {
                    n2 = lIIllIllll[1];
                    0;
                    if ((0x96 ^ 0x92) <= 2) {
                        return ((0x66 ^ 0x43) & ~(0x43 ^ 0x66)) != 0;
                    }
                } else {
                    n2 = lIIllIllll[0];
                }
                return n2 != 0;
            }))) {
                AccBuilderRogues.c = lIIllIllII[lIIllIllll[158]];
                lllllllllllllllllllllIIlllllllll = Skills.getExperience((Skill)Skill.AGILITY);
                lllllllllllllllllllllIlIIIIIIIII.interact(lIIllIllII[lIIllIllll[159]]);
                Time.sleepTicks((int)e.c(lIIllIllll[1], lIIllIllll[3]));
                0;
                Time.sleepUntil(() -> {
                    boolean bl;
                    if (J.lIIIIlIIIIIIl(Skills.getExperience((Skill)Skill.AGILITY), lllllllllllllllllllllIIlllllllll)) {
                        bl = lIIllIllll[1];
                        0;
                        if (null != null) {
                            return ((0x69 ^ 0x42) & ~(0x6F ^ 0x44)) != 0;
                        }
                    } else {
                        bl = lIIllIllll[0];
                    }
                    return bl;
                }, (int)lIIllIllll[104]);
                0;
                Time.sleepTicks((int)lIIllIllll[1]);
                0;
            }
            if (J.lIIIIIlllllIl(J.cu() ? 1 : 0)) {
                return;
            }
            if (J.lIIIIIlllllIl(lllllllllllllllllllllIlIIIIIIIll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && J.lIIIIlIIIIIII(lllllllllllllllllllllIlIIIIIIIII = TileObjects.getNearest(tileObject -> {
                int n2;
                if (J.lIIIIIlllllIl(tileObject.getName().contains(lIIllIllII[lIIllIllll[221]]) ? 1 : 0) && J.lIIIIlIIIIlIl(tileObject.getWorldLocation().distanceTo(new WorldPoint(lIIllIllll[222], lIIllIllll[223], lIIllIllll[3])), lIIllIllll[3])) {
                    n2 = lIIllIllll[1];
                    0;
                    if (null != null) {
                        return ((0x67 ^ 0x7A ^ (0x39 ^ 0x13)) & (0xE6 ^ 0xAF ^ (0xCD ^ 0xB3) ^ -1)) != 0;
                    }
                } else {
                    n2 = lIIllIllll[0];
                }
                return n2 != 0;
            }))) {
                AccBuilderRogues.c = lIIllIllII[lIIllIllll[160]];
                lllllllllllllllllllllIIlllllllll = Skills.getExperience((Skill)Skill.AGILITY);
                lllllllllllllllllllllIlIIIIIIIII.interact(lIIllIllII[lIIllIllll[161]]);
                Time.sleepTicks((int)e.c(lIIllIllll[1], lIIllIllll[3]));
                0;
                Time.sleepUntil(() -> {
                    boolean bl;
                    if (J.lIIIIlIIIIIIl(Skills.getExperience((Skill)Skill.AGILITY), lllllllllllllllllllllIIlllllllll)) {
                        bl = lIIllIllll[1];
                        0;
                        if (null != null) {
                            return ((0x8E ^ 0x92) & ~(0xA2 ^ 0xBE)) != 0;
                        }
                    } else {
                        bl = lIIllIllll[0];
                    }
                    return bl;
                }, (int)lIIllIllll[104]);
                0;
                Time.sleepTicks((int)lIIllIllll[1]);
                0;
            }
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean ab() {
        int n2;
        if (J.lIIIIlIIIIIll(Skills.getBoostedLevel((Skill)Skill.AGILITY), lIIllIllll[38])) {
            int n3;
            int[] nArray = new int[lIIllIllll[1]];
            nArray[J.lIIllIllll[0]] = lIIllIllll[13];
            if (J.lIIIIIlllllIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray2 = new int[lIIllIllll[1]];
                nArray2[J.lIIllIllll[0]] = lIIllIllll[26];
                if (J.lIIIIIlllllIl(Inventory.contains((int[])nArray2) ? 1 : 0)) {
                    int[] nArray3 = new int[lIIllIllll[1]];
                    nArray3[J.lIIllIllll[0]] = lIIllIllll[24];
                    if (!(!J.lIIIIIlllllIl(Inventory.contains((int[])nArray3) ? 1 : 0) || J.lIIIIIlllllll(Inventory.contains(item -> item.getName().contains(lIIllIllII[lIIllIllll[207]])) ? 1 : 0) && !J.lIIIIIlllllIl(Equipment.contains(item -> item.getName().contains(lIIllIllII[lIIllIllll[206]])) ? 1 : 0) || J.lIIIIIlllllll(Inventory.contains((int[])f.bf) ? 1 : 0) && !J.lIIIIIlllllIl(Equipment.contains((int[])f.bf) ? 1 : 0))) {
                        n3 = lIIllIllll[1];
                        0;
                        if (((0x13 ^ 0x1B) & ~(0xCF ^ 0xC7)) == 0) return n3 != 0;
                        return ((0x7B ^ 0x2B) & ~(0x34 ^ 0x64)) != 0;
                    }
                }
            }
            n3 = lIIllIllll[0];
            return n3 != 0;
        }
        int[] nArray = new int[lIIllIllll[1]];
        nArray[J.lIIllIllll[0]] = lIIllIllll[13];
        if (J.lIIIIIlllllIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
            int[] nArray4 = new int[lIIllIllll[1]];
            nArray4[J.lIIllIllll[0]] = lIIllIllll[15];
            if (J.lIIIIIlllllIl(Inventory.contains((int[])nArray4) ? 1 : 0)) {
                int[] nArray5 = new int[lIIllIllll[1]];
                nArray5[J.lIIllIllll[0]] = lIIllIllll[14];
                if (!(!J.lIIIIIlllllIl(Inventory.contains((int[])nArray5) ? 1 : 0) || J.lIIIIIlllllll(Inventory.contains(item -> item.getName().contains(lIIllIllII[lIIllIllll[205]])) ? 1 : 0) && !J.lIIIIIlllllIl(Equipment.contains(item -> item.getName().contains(lIIllIllII[lIIllIllll[204]])) ? 1 : 0) || J.lIIIIIlllllll(Inventory.contains((int[])f.bf) ? 1 : 0) && !J.lIIIIIlllllIl(Equipment.contains((int[])f.bf) ? 1 : 0))) {
                    n2 = lIIllIllll[1];
                    0;
                    if (-3 < 0) return n2 != 0;
                    return ((0x67 ^ 0x7B) & ~(0xB5 ^ 0xA9)) != 0;
                }
            }
        }
        n2 = lIIllIllll[0];
        return n2 != 0;
    }

    private static String lIIIIIlIllIII(String lllllllllllllllllllllIIlIllIIlIl, String lllllllllllllllllllllIIlIllIIlII) {
        try {
            SecretKeySpec lllllllllllllllllllllIIlIllIlIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllllllllIIlIllIIlII.getBytes(StandardCharsets.UTF_8)), lIIllIllll[25]), "DES");
            Cipher lllllllllllllllllllllIIlIllIIlll = Cipher.getInstance("DES");
            lllllllllllllllllllllIIlIllIIlll.init(lIIllIllll[3], lllllllllllllllllllllIIlIllIlIII);
            return new String(lllllllllllllllllllllIIlIllIIlll.doFinal(Base64.getDecoder().decode(lllllllllllllllllllllIIlIllIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllllllllIIlIllIIllI) {
            lllllllllllllllllllllIIlIllIIllI.printStackTrace();
            return null;
        }
    }

    public static void af() {
        d lllllllllllllllllllllIIllIllIlIl;
        block18: {
            block17: {
                block16: {
                    block15: {
                        int[] nArray = new int[lIIllIllll[1]];
                        nArray[J.lIIllIllll[0]] = lIIllIllll[16];
                        if (J.lIIIIIlllllll(Bank.contains((int[])nArray) ? 1 : 0)) {
                            d d2 = new d(lIIllIllll[16], lIIllIllll[1], lIIllIllll[195]);
                            bv.add(d2);
                            0;
                        }
                        int[] nArray2 = new int[lIIllIllll[1]];
                        nArray2[J.lIIllIllll[0]] = lIIllIllll[18];
                        if (J.lIIIIIlllllll(Bank.contains((int[])nArray2) ? 1 : 0)) {
                            lllllllllllllllllllllIIllIllIlIl = new d(lIIllIllll[18], lIIllIllll[3], lIIllIllll[196]);
                            bv.add(lllllllllllllllllllllIIllIllIlIl);
                            0;
                        }
                        int[] nArray3 = new int[lIIllIllll[1]];
                        nArray3[J.lIIllIllll[0]] = lIIllIllll[28];
                        if (J.lIIIIIlllllll(Bank.contains((int[])nArray3) ? 1 : 0)) {
                            lllllllllllllllllllllIIllIllIlIl = new d(lIIllIllll[28], lIIllIllll[3], lIIllIllll[196]);
                            bv.add(lllllllllllllllllllllIIllIllIlIl);
                            0;
                        }
                        int[] nArray4 = new int[lIIllIllll[1]];
                        nArray4[J.lIIllIllll[0]] = lIIllIllll[13];
                        if (J.lIIIIIlllllll(Bank.contains((int[])nArray4) ? 1 : 0)) {
                            lllllllllllllllllllllIIllIllIlIl = new d(lIIllIllll[13], lIIllIllll[12], lIIllIllll[197]);
                            bv.add(lllllllllllllllllllllIIllIllIlIl);
                            0;
                        }
                        int[] nArray5 = new int[lIIllIllll[1]];
                        nArray5[J.lIIllIllll[0]] = lIIllIllll[22];
                        if (J.lIIIIIlllllll(Bank.contains((int[])nArray5) ? 1 : 0)) {
                            lllllllllllllllllllllIIllIllIlIl = new d(lIIllIllll[22], lIIllIllll[12], lIIllIllll[198]);
                            bv.add(lllllllllllllllllllllIIllIllIlIl);
                            0;
                        }
                        int[] nArray6 = new int[lIIllIllll[1]];
                        nArray6[J.lIIllIllll[0]] = lIIllIllll[15];
                        if (J.lIIIIIlllllll(Bank.contains((int[])nArray6) ? 1 : 0)) {
                            lllllllllllllllllllllIIllIllIlIl = new d(lIIllIllll[15], lIIllIllll[12], lIIllIllll[198]);
                            bv.add(lllllllllllllllllllllIIllIllIlIl);
                            0;
                        }
                        int[] nArray7 = new int[lIIllIllll[1]];
                        nArray7[J.lIIllIllll[0]] = lIIllIllll[14];
                        if (J.lIIIIIlllllll(Bank.contains((int[])nArray7) ? 1 : 0)) {
                            lllllllllllllllllllllIIllIllIlIl = new d(lIIllIllll[14], lIIllIllll[12], lIIllIllll[198]);
                            bv.add(lllllllllllllllllllllIIllIllIlIl);
                            0;
                        }
                        int[] nArray8 = new int[lIIllIllll[1]];
                        nArray8[J.lIIllIllll[0]] = lIIllIllll[24];
                        if (!J.lIIIIIlllllIl(Bank.contains((int[])nArray8) ? 1 : 0)) break block15;
                        int[] nArray9 = new int[lIIllIllll[1]];
                        nArray9[J.lIIllIllll[0]] = lIIllIllll[24];
                        if (!J.lIIIIIlllllIl(Bank.contains((int[])nArray9) ? 1 : 0)) break block16;
                        int[] nArray10 = new int[lIIllIllll[1]];
                        nArray10[J.lIIllIllll[0]] = lIIllIllll[24];
                        if (!J.lIIIIIllllllI(Bank.getFirst((int[])nArray10).getQuantity(), lIIllIllll[12])) break block16;
                    }
                    lllllllllllllllllllllIIllIllIlIl = new d(ix, lIIllIllll[44], lIIllIllll[199]);
                    bv.add(lllllllllllllllllllllIIllIllIlIl);
                    0;
                }
                int[] nArray = new int[lIIllIllll[1]];
                nArray[J.lIIllIllll[0]] = lIIllIllll[26];
                if (!J.lIIIIIlllllIl(Bank.contains((int[])nArray) ? 1 : 0)) break block17;
                int[] nArray11 = new int[lIIllIllll[1]];
                nArray11[J.lIIllIllll[0]] = lIIllIllll[26];
                if (!J.lIIIIIlllllIl(Bank.contains((int[])nArray11) ? 1 : 0)) break block18;
                int[] nArray12 = new int[lIIllIllll[1]];
                nArray12[J.lIIllIllll[0]] = lIIllIllll[26];
                if (!J.lIIIIIllllllI(Bank.getFirst((int[])nArray12).getQuantity(), lIIllIllll[12])) break block18;
            }
            lllllllllllllllllllllIIllIllIlIl = new d(lIIllIllll[26], lIIllIllll[12], lIIllIllll[200]);
            bv.add(lllllllllllllllllllllIIllIllIlIl);
            0;
        }
        int[] nArray = new int[lIIllIllll[1]];
        nArray[J.lIIllIllll[0]] = lIIllIllll[201];
        if (J.lIIIIIlllllll(Bank.contains((int[])nArray) ? 1 : 0)) {
            lllllllllllllllllllllIIllIllIlIl = new d(lIIllIllll[201], lIIllIllll[1], lIIllIllll[202]);
            bv.add(lllllllllllllllllllllIIllIllIlIl);
            0;
        }
        int[] nArray13 = new int[lIIllIllll[1]];
        nArray13[J.lIIllIllll[0]] = lIIllIllll[20];
        if (J.lIIIIIlllllll(Bank.contains((int[])nArray13) ? 1 : 0)) {
            lllllllllllllllllllllIIllIllIlIl = new d(lIIllIllll[20], lIIllIllll[40], i.bq);
            bv.add(lllllllllllllllllllllIIllIllIlIl);
            0;
        }
    }

    private static boolean lIIIIlIIIIIIl(int n2, int n3) {
        return n2 > n3;
    }

    @Override
    public String U() {
        return lIIllIllII[lIIllIllll[203]];
    }

    @Override
    public int T() {
        try {
            J.cp();
            0;
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (3 <= 1) {
            return (0x41 ^ 1) & ~(0xE2 ^ 0xA2);
        }
        return lIIllIllll[186];
    }

    /*
     * WARNING - void declaration
     */
    private static void cq() {
        WorldArea worldArea = new WorldArea(lIIllIllll[46], lIIllIllll[47], lIIllIllll[12], lIIllIllll[21], lIIllIllll[0]);
        WorldArea worldArea2 = new WorldArea(lIIllIllll[46], lIIllIllll[48], lIIllIllll[49], lIIllIllll[25], lIIllIllll[0]);
        WorldArea worldArea3 = new WorldArea(lIIllIllll[46], lIIllIllll[50], lIIllIllll[49], lIIllIllll[25], lIIllIllll[1]);
        WorldArea worldArea4 = new WorldArea(lIIllIllll[51], lIIllIllll[52], lIIllIllll[53], lIIllIllll[54], lIIllIllll[3]);
        WorldArea worldArea5 = new WorldArea(lIIllIllll[55], lIIllIllll[56], lIIllIllll[25], lIIllIllll[12], lIIllIllll[3]);
        WorldArea worldArea6 = new WorldArea(lIIllIllll[57], lIIllIllll[58], lIIllIllll[49], lIIllIllll[12], lIIllIllll[0]);
        WorldArea worldArea7 = new WorldArea(lIIllIllll[59], lIIllIllll[60], lIIllIllll[12], lIIllIllll[21], lIIllIllll[0]);
        WorldArea worldArea8 = new WorldArea(lIIllIllll[46], lIIllIllll[47], lIIllIllll[61], lIIllIllll[21], lIIllIllll[0]);
        if (J.lIIIIIlllllll(iz.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && J.lIIIIIlllllll(iA.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && J.lIIIIIlllllll(iB.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderRogues.c = lIIllIllII[lIIllIllll[12]];
            e.b(iC);
            Time.sleepTicks((int)lIIllIllll[1]);
            0;
        }
        if ((!J.lIIIIIlllllll(iz.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || !J.lIIIIIlllllll(iA.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || J.lIIIIIlllllIl(iB.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) && J.lIIIIlIIIIlII(Players.getLocal().getAnimation(), lIIllIllll[62]) && J.lIIIIIlllllll(Players.getLocal().isMoving() ? 1 : 0)) {
            void lllllllllllllllllllllIlIIIlllIlI;
            void lllllllllllllllllllllIlIIIlllIll;
            void lllllllllllllllllllllIlIIIllllII;
            void lllllllllllllllllllllIlIIIllllIl;
            void lllllllllllllllllllllIlIIIlllllI;
            void lllllllllllllllllllllIlIIIllllll;
            void lllllllllllllllllllllIlIIIlllIIl;
            if (J.lIIIIIlllllIl(lllllllllllllllllllllIlIIIlllIIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderRogues.c = lIIllIllII[lIIllIllll[49]];
                String[] stringArray = new String[lIIllIllll[1]];
                stringArray[J.lIIllIllll[0]] = lIIllIllII[lIIllIllll[63]];
                TileObjects.getNearest((String[])stringArray).interact(lIIllIllII[lIIllIllll[64]]);
                Time.sleepTicks((int)lIIllIllll[3]);
                0;
            }
            if (J.lIIIIIlllllIl(lllllllllllllllllllllIlIIIllllll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderRogues.c = lIIllIllII[lIIllIllll[53]];
                String[] stringArray = new String[lIIllIllll[1]];
                stringArray[J.lIIllIllll[0]] = lIIllIllII[lIIllIllll[39]];
                TileObjects.getNearest((String[])stringArray).interact(lIIllIllII[lIIllIllll[65]]);
                Time.sleepTicks((int)lIIllIllll[3]);
                0;
            }
            if (J.lIIIIIlllllIl(lllllllllllllllllllllIlIIIlllllI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderRogues.c = lIIllIllII[lIIllIllll[66]];
                String[] stringArray = new String[lIIllIllll[1]];
                stringArray[J.lIIllIllll[0]] = lIIllIllII[lIIllIllll[54]];
                TileObjects.getNearest((String[])stringArray).interact(lIIllIllII[lIIllIllll[67]]);
                Time.sleepTicks((int)lIIllIllll[3]);
                0;
            }
            if (J.lIIIIIlllllIl(lllllllllllllllllllllIlIIIllllIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderRogues.c = lIIllIllII[lIIllIllll[40]];
                String[] stringArray = new String[lIIllIllll[1]];
                stringArray[J.lIIllIllll[0]] = lIIllIllII[lIIllIllll[68]];
                TileObjects.getNearest((String[])stringArray).interact(lIIllIllII[lIIllIllll[61]]);
                Time.sleepTicks((int)lIIllIllll[19]);
                0;
            }
            if (J.lIIIIIlllllIl(lllllllllllllllllllllIlIIIllllII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderRogues.c = lIIllIllII[lIIllIllll[69]];
                String[] stringArray = new String[lIIllIllll[1]];
                stringArray[J.lIIllIllll[0]] = lIIllIllII[lIIllIllll[70]];
                TileObjects.getNearest((String[])stringArray).interact(lIIllIllII[lIIllIllll[41]]);
                Time.sleepTicks((int)lIIllIllll[17]);
                0;
            }
            if (J.lIIIIIlllllIl(lllllllllllllllllllllIlIIIlllIll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderRogues.c = lIIllIllII[lIIllIllll[71]];
                String[] stringArray = new String[lIIllIllll[1]];
                stringArray[J.lIIllIllll[0]] = lIIllIllII[lIIllIllll[72]];
                TileObjects.getNearest((String[])stringArray).interact(lIIllIllII[lIIllIllll[73]]);
                Time.sleepTicks((int)lIIllIllll[10]);
                0;
            }
            if (J.lIIIIIlllllIl(lllllllllllllllllllllIlIIIlllIlI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderRogues.c = lIIllIllII[lIIllIllll[74]];
                String[] stringArray = new String[lIIllIllll[1]];
                stringArray[J.lIIllIllll[0]] = lIIllIllII[lIIllIllll[42]];
                TileObjects.getNearest((String[])stringArray).interact(lIIllIllII[lIIllIllll[75]]);
                Time.sleepTicks((int)lIIllIllll[17]);
                0;
            }
        }
    }

    private static boolean lIIIIlIIIIIII(Object object) {
        return object != null;
    }

    static {
        J.lIIIIIlllllII();
        J.lIIIIIlIllllI();
        bv = new ArrayList<d>();
        iw = lIIllIllll[28];
        ix = lIIllIllll[24];
        iz = new WorldArea(lIIllIllll[235], lIIllIllll[52], lIIllIllll[69], lIIllIllll[72], lIIllIllll[0]);
        iA = new WorldArea(lIIllIllll[235], lIIllIllll[52], lIIllIllll[69], lIIllIllll[72], lIIllIllll[1]);
        iB = new WorldArea(lIIllIllll[235], lIIllIllll[52], lIIllIllll[69], lIIllIllll[72], lIIllIllll[3]);
        iC = new WorldPoint(lIIllIllll[236], lIIllIllll[237], lIIllIllll[0]);
    }
}

