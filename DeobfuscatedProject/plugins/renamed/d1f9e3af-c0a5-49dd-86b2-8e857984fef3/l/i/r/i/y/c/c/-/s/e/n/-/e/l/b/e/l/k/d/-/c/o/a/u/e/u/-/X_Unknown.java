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
package l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-;

import gg.squire.account.AccBuilderEasyClues;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.W_Unknown;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.a_Unknown;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.b_Unknown;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.d;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.e_Unknown;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.f_Unknown;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.i;
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

public class X_Unknown
implements W {
    static /* synthetic */ WorldArea kA;
    private static /* synthetic */ int[] lIIlIlIIl;
    public static /* synthetic */ int ky;
    public static /* synthetic */ List<d> bv;
    public static /* synthetic */ boolean bt;
    static /* synthetic */ WorldArea kB;
    static /* synthetic */ WorldArea kC;
    public static /* synthetic */ int kz;
    public static /* synthetic */ int kx;
    private static /* synthetic */ String[] lIIlIIllI;
    private static /* synthetic */ WorldPoint kD;

    private static void llllIllIllI() {
        lIIlIIllI = new String[lIIlIlIIl[238]];
        X.lIIlIIllI[X.lIIlIlIIl[0]] = X."Buying items";
        X.lIIlIIllI[X.lIIlIlIIl[1]] = X."Finished buying items, switching back to agility";
        X.lIIlIIllI[X.lIIlIlIIl[3]] = X."Navigating to bank";
        X.lIIlIIllI[X.lIIlIlIIl[10]] = X."Handling banking";
        X.lIIlIIllI[X.lIIlIlIIl[17]] = X."We are missing quest supplies, switching to BUYING";
        X.lIIlIIllI[X.lIIlIlIIl[19]] = X."Vial";
        X.lIIlIIllI[X.lIIlIlIIl[21]] = X."Vial";
        X.lIIlIIllI[X.lIIlIlIIl[23]] = X."Drop";
        X.lIIlIIllI[X.lIIlIlIIl[25]] = X."Drink";
        X.lIIlIIllI[X.lIIlIlIIl[27]] = X."Eat";
        X.lIIlIIllI[X.lIIlIlIIl[12]] = X."Nav to gnome course";
        X.lIIlIIllI[X.lIIlIlIIl[50]] = X."Crossing log";
        X.lIIlIIllI[X.lIIlIlIIl[64]] = X."Log balance";
        X.lIIlIIllI[X.lIIlIlIIl[65]] = X."Walk-across";
        X.lIIlIIllI[X.lIIlIlIIl[54]] = X."Climbing net";
        X.lIIlIIllI[X.lIIlIlIIl[39]] = X."Obstacle net";
        X.lIIlIIllI[X.lIIlIlIIl[66]] = X."Climb-over";
        X.lIIlIIllI[X.lIIlIlIIl[67]] = X."Climbing branch";
        X.lIIlIIllI[X.lIIlIlIIl[55]] = X."Tree branch";
        X.lIIlIIllI[X.lIIlIlIIl[68]] = X."Climb";
        X.lIIlIIllI[X.lIIlIlIIl[41]] = X."Crossing rope";
        X.lIIlIIllI[X.lIIlIlIIl[69]] = X."Balancing rope";
        X.lIIlIIllI[X.lIIlIlIIl[62]] = X."Walk-on";
        X.lIIlIIllI[X.lIIlIlIIl[70]] = X."Climbing down";
        X.lIIlIIllI[X.lIIlIlIIl[71]] = X."Tree branch";
        X.lIIlIIllI[X.lIIlIlIIl[42]] = X."Climb-down";
        X.lIIlIIllI[X.lIIlIlIIl[72]] = X."Climbing net";
        X.lIIlIIllI[X.lIIlIlIIl[73]] = X."Obstacle net";
        X.lIIlIIllI[X.lIIlIlIIl[74]] = X."Climb-over";
        X.lIIlIIllI[X.lIIlIlIIl[75]] = X."Crossing pipe";
        X.lIIlIIllI[X.lIIlIlIIl[43]] = X."Obstacle pipe";
        X.lIIlIIllI[X.lIIlIlIIl[76]] = X."Squeeze-through";
        X.lIIlIIllI[X.lIIlIlIIl[96]] = X."Nav to start";
        X.lIIlIIllI[X.lIIlIlIIl[98]] = X."Mark of grace";
        X.lIIlIIllI[X.lIIlIlIIl[99]] = X."Taking mark";
        X.lIIlIIllI[X.lIIlIlIIl[100]] = X."Found mark on ground";
        X.lIIlIIllI[X.lIIlIlIIl[101]] = X."Take";
        X.lIIlIIllI[X.lIIlIlIIl[102]] = X."Starting course";
        X.lIIlIIllI[X.lIIlIlIIl[103]] = X."Rough wall";
        X.lIIlIIllI[X.lIIlIlIIl[104]] = X."Climb";
        X.lIIlIIllI[X.lIIlIlIIl[38]] = X."Crossing clothes line";
        X.lIIlIIllI[X.lIIlIlIIl[106]] = X."Clothes line";
        X.lIIlIIllI[X.lIIlIlIIl[107]] = X."Cross";
        X.lIIlIIllI[X.lIIlIlIIl[108]] = X."Leaping";
        X.lIIlIIllI[X.lIIlIlIIl[109]] = X."Gap";
        X.lIIlIIllI[X.lIIlIlIIl[2]] = X."Leap";
        X.lIIlIIllI[X.lIIlIlIIl[110]] = X."Balancing";
        X.lIIlIIllI[X.lIIlIlIIl[111]] = X."Wall";
        X.lIIlIIllI[X.lIIlIlIIl[112]] = X."Balance";
        X.lIIlIIllI[X.lIIlIlIIl[113]] = X."Jumping gap";
        X.lIIlIIllI[X.lIIlIlIIl[40]] = X."Gap";
        X.lIIlIIllI[X.lIIlIlIIl[7]] = X."Leap";
        X.lIIlIIllI[X.lIIlIlIIl[114]] = X."Jumping gap 2";
        X.lIIlIIllI[X.lIIlIlIIl[116]] = X."Leap";
        X.lIIlIIllI[X.lIIlIlIIl[117]] = X."Jumping gap 3";
        X.lIIlIIllI[X.lIIlIlIIl[119]] = X."Leap";
        X.lIIlIIllI[X.lIIlIlIIl[120]] = X."Hurdle roof";
        X.lIIlIIllI[X.lIIlIlIIl[122]] = X."Hurdle";
        X.lIIlIIllI[X.lIIlIlIIl[123]] = X."Finishing course";
        X.lIIlIIllI[X.lIIlIlIIl[124]] = X."Edge";
        X.lIIlIIllI[X.lIIlIlIIl[45]] = X."Jump-off";
        X.lIIlIIllI[X.lIIlIlIIl[140]] = X."Nav to canafis course";
        X.lIIlIIllI[X.lIIlIlIIl[6]] = X."Nav to start";
        X.lIIlIIllI[X.lIIlIlIIl[141]] = X."Starting course";
        X.lIIlIIllI[X.lIIlIlIIl[142]] = X."Tall tree";
        X.lIIlIIllI[X.lIIlIlIIl[143]] = X."Climb";
        X.lIIlIIllI[X.lIIlIlIIl[144]] = X."Mark of grace";
        X.lIIlIIllI[X.lIIlIlIIl[145]] = X."Taking mark";
        X.lIIlIIllI[X.lIIlIlIIl[146]] = X."Found mark on ground";
        X.lIIlIIllI[X.lIIlIlIIl[147]] = X."Take";
        X.lIIlIIllI[X.lIIlIlIIl[148]] = X."Jumping gap 1";
        X.lIIlIIllI[X.lIIlIlIIl[149]] = X."Jump";
        X.lIIlIIllI[X.lIIlIlIIl[150]] = X."Jumping gap 2";
        X.lIIlIIllI[X.lIIlIlIIl[151]] = X."Jump";
        X.lIIlIIllI[X.lIIlIlIIl[152]] = X."Jumping gap 3";
        X.lIIlIIllI[X.lIIlIlIIl[153]] = X."Jump";
        X.lIIlIIllI[X.lIIlIlIIl[154]] = X."Jumping gap 4";
        X.lIIlIIllI[X.lIIlIlIIl[155]] = X."Jump";
        X.lIIlIIllI[X.lIIlIlIIl[156]] = X."Vaulting";
        X.lIIlIIllI[X.lIIlIlIIl[157]] = X."Vault";
        X.lIIlIIllI[X.lIIlIlIIl[158]] = X."Jumping gap 5";
        X.lIIlIIllI[X.lIIlIlIIl[159]] = X."Jump";
        X.lIIlIIllI[X.lIIlIlIIl[160]] = X."Jumping gap 6";
        X.lIIlIIllI[X.lIIlIlIIl[161]] = X."Jump";
        X.lIIlIIllI[X.lIIlIlIIl[172]] = X."Nav to canafis course";
        X.lIIlIIllI[X.lIIlIlIIl[173]] = X."Nav to start";
        X.lIIlIIllI[X.lIIlIlIIl[174]] = X."Starting course";
        X.lIIlIIllI[X.lIIlIlIIl[175]] = X."Wall";
        X.lIIlIIllI[X.lIIlIlIIl[36]] = X."Climb-up";
        X.lIIlIIllI[X.lIIlIlIIl[176]] = X."Mark of grace";
        X.lIIlIIllI[X.lIIlIlIIl[177]] = X."Taking mark";
        X.lIIlIIllI[X.lIIlIlIIl[178]] = X."Found mark on ground";
        X.lIIlIIllI[X.lIIlIlIIl[179]] = X."Take";
        X.lIIlIIllI[X.lIIlIlIIl[180]] = X."Jumping gap 1";
        X.lIIlIIllI[X.lIIlIlIIl[80]] = X."Jump";
        X.lIIlIIllI[X.lIIlIlIIl[181]] = X."cross rope";
        X.lIIlIIllI[X.lIIlIlIIl[182]] = X."Cross";
        X.lIIlIIllI[X.lIIlIlIIl[183]] = X."Jumping gap 3";
        X.lIIlIIllI[X.lIIlIlIIl[184]] = X."Jump";
        X.lIIlIIllI[X.lIIlIlIIl[185]] = X."Jumping gap 4";
        X.lIIlIIllI[X.lIIlIlIIl[186]] = X."Jump";
        X.lIIlIIllI[X.lIIlIlIIl[187]] = X."Jumping Edge";
        X.lIIlIIllI[X.lIIlIlIIl[188]] = X."Jump";
        X.lIIlIIllI[X.lIIlIlIIl[194]] = X."Found mark on ground";
        X.lIIlIIllI[X.lIIlIlIIl[203]] = X."Agility";
        X.lIIlIIllI[X.lIIlIlIIl[204]] = X."passage";
        X.lIIlIIllI[X.lIIlIlIIl[205]] = X."passage";
        X.lIIlIIllI[X.lIIlIlIIl[206]] = X."passage";
        X.lIIlIIllI[X.lIIlIlIIl[207]] = X."passage";
        X.lIIlIIllI[X.lIIlIlIIl[208]] = X."Edge";
        X.lIIlIIllI[X.lIIlIlIIl[211]] = X."Gap";
        X.lIIlIIllI[X.lIIlIlIIl[213]] = X."Gap";
        X.lIIlIIllI[X.lIIlIlIIl[216]] = X."Tightrope";
        X.lIIlIIllI[X.lIIlIlIIl[218]] = X."Gap";
        X.lIIlIIllI[X.lIIlIlIIl[221]] = X."Gap";
        X.lIIlIIllI[X.lIIlIlIIl[224]] = X."Gap";
        X.lIIlIIllI[X.lIIlIlIIl[226]] = X."Pole-vault";
        X.lIIlIIllI[X.lIIlIlIIl[227]] = X."Gap";
        X.lIIlIIllI[X.lIIlIlIIl[230]] = X."Gap";
        X.lIIlIIllI[X.lIIlIlIIl[232]] = X."Gap";
        X.lIIlIIllI[X.lIIlIlIIl[233]] = X."Gap";
    }

    private static boolean lllllIIIIII(int n2, int n3) {
        return n2 <= n3;
    }

    /*
     * WARNING - void declaration
     */
    private static void dh() {
        WorldArea worldArea = new WorldArea(lIIlIlIIl[47], lIIlIlIIl[48], lIIlIlIIl[12], lIIlIlIIl[21], lIIlIlIIl[0]);
        WorldArea worldArea2 = new WorldArea(lIIlIlIIl[47], lIIlIlIIl[49], lIIlIlIIl[50], lIIlIlIIl[25], lIIlIlIIl[0]);
        WorldArea worldArea3 = new WorldArea(lIIlIlIIl[47], lIIlIlIIl[51], lIIlIlIIl[50], lIIlIlIIl[25], lIIlIlIIl[1]);
        WorldArea worldArea4 = new WorldArea(lIIlIlIIl[52], lIIlIlIIl[53], lIIlIlIIl[54], lIIlIlIIl[55], lIIlIlIIl[3]);
        WorldArea worldArea5 = new WorldArea(lIIlIlIIl[56], lIIlIlIIl[57], lIIlIlIIl[25], lIIlIlIIl[12], lIIlIlIIl[3]);
        WorldArea worldArea6 = new WorldArea(lIIlIlIIl[58], lIIlIlIIl[59], lIIlIlIIl[50], lIIlIlIIl[12], lIIlIlIIl[0]);
        WorldArea worldArea7 = new WorldArea(lIIlIlIIl[60], lIIlIlIIl[61], lIIlIlIIl[12], lIIlIlIIl[21], lIIlIlIIl[0]);
        WorldArea worldArea8 = new WorldArea(lIIlIlIIl[47], lIIlIlIIl[48], lIIlIlIIl[62], lIIlIlIIl[21], lIIlIlIIl[0]);
        if (X.llllIlllIlI(kA.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && X.llllIlllIlI(kB.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && X.llllIlllIlI(kC.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderEasyClues.c = lIIlIIllI[lIIlIlIIl[12]];
            e.b(kD);
            Time.sleepTicks((int)lIIlIlIIl[1]);
            0;
        }
        if ((!X.llllIlllIlI(kA.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || !X.llllIlllIlI(kB.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || X.llllIlllIII(kC.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) && X.llllIllllll(Players.getLocal().getAnimation(), lIIlIlIIl[63]) && X.llllIlllIlI(Players.getLocal().isMoving() ? 1 : 0)) {
            void lIIIIlllllllIIl;
            void lIIIIlllllllIlI;
            void lIIIIlllllllIll;
            void lIIIIllllllllII;
            void lIIIIllllllllIl;
            void lIIIIlllllllllI;
            void lIIIIlllllllIII;
            if (X.llllIlllIII(lIIIIlllllllIII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderEasyClues.c = lIIlIIllI[lIIlIlIIl[50]];
                String[] stringArray = new String[lIIlIlIIl[1]];
                stringArray[X.lIIlIlIIl[0]] = lIIlIIllI[lIIlIlIIl[64]];
                TileObjects.getNearest((String[])stringArray).interact(lIIlIIllI[lIIlIlIIl[65]]);
                Time.sleepTicks((int)lIIlIlIIl[3]);
                0;
            }
            if (X.llllIlllIII(lIIIIlllllllllI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderEasyClues.c = lIIlIIllI[lIIlIlIIl[54]];
                String[] stringArray = new String[lIIlIlIIl[1]];
                stringArray[X.lIIlIlIIl[0]] = lIIlIIllI[lIIlIlIIl[39]];
                TileObjects.getNearest((String[])stringArray).interact(lIIlIIllI[lIIlIlIIl[66]]);
                Time.sleepTicks((int)lIIlIlIIl[3]);
                0;
            }
            if (X.llllIlllIII(lIIIIllllllllIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderEasyClues.c = lIIlIIllI[lIIlIlIIl[67]];
                String[] stringArray = new String[lIIlIlIIl[1]];
                stringArray[X.lIIlIlIIl[0]] = lIIlIIllI[lIIlIlIIl[55]];
                TileObjects.getNearest((String[])stringArray).interact(lIIlIIllI[lIIlIlIIl[68]]);
                Time.sleepTicks((int)lIIlIlIIl[3]);
                0;
            }
            if (X.llllIlllIII(lIIIIllllllllII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderEasyClues.c = lIIlIIllI[lIIlIlIIl[41]];
                String[] stringArray = new String[lIIlIlIIl[1]];
                stringArray[X.lIIlIlIIl[0]] = lIIlIIllI[lIIlIlIIl[69]];
                TileObjects.getNearest((String[])stringArray).interact(lIIlIIllI[lIIlIlIIl[62]]);
                Time.sleepTicks((int)lIIlIlIIl[19]);
                0;
            }
            if (X.llllIlllIII(lIIIIlllllllIll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderEasyClues.c = lIIlIIllI[lIIlIlIIl[70]];
                String[] stringArray = new String[lIIlIlIIl[1]];
                stringArray[X.lIIlIlIIl[0]] = lIIlIIllI[lIIlIlIIl[71]];
                TileObjects.getNearest((String[])stringArray).interact(lIIlIIllI[lIIlIlIIl[42]]);
                Time.sleepTicks((int)lIIlIlIIl[17]);
                0;
            }
            if (X.llllIlllIII(lIIIIlllllllIlI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderEasyClues.c = lIIlIIllI[lIIlIlIIl[72]];
                String[] stringArray = new String[lIIlIlIIl[1]];
                stringArray[X.lIIlIlIIl[0]] = lIIlIIllI[lIIlIlIIl[73]];
                TileObjects.getNearest((String[])stringArray).interact(lIIlIIllI[lIIlIlIIl[74]]);
                Time.sleepTicks((int)lIIlIlIIl[10]);
                0;
            }
            if (X.llllIlllIII(lIIIIlllllllIIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderEasyClues.c = lIIlIIllI[lIIlIlIIl[75]];
                String[] stringArray = new String[lIIlIlIIl[1]];
                stringArray[X.lIIlIlIIl[0]] = lIIlIIllI[lIIlIlIIl[43]];
                TileObjects.getNearest((String[])stringArray).interact(lIIlIIllI[lIIlIlIIl[76]]);
                Time.sleepTicks((int)lIIlIlIIl[17]);
                0;
            }
        }
    }

    @Override
    public boolean V() {
        boolean bl;
        if (X.llllIlllllI(Skills.getLevel((Skill)Skill.AGILITY), lIIlIlIIl[2])) {
            bl = lIIlIlIIl[1];
            0;
            if (((156 + 36 - 9 + 64 ^ 109 + 158 - 101 + 33) & (0x7F ^ 0x44 ^ (0x63 ^ 0x68) ^ -1)) != 0) {
                return (3 & (3 ^ -1)) != 0;
            }
        } else {
            bl = lIIlIlIIl[0];
        }
        return bl;
    }

    /*
     * WARNING - void declaration
     */
    private static void di() {
        WorldArea worldArea = new WorldArea(lIIlIlIIl[77], lIIlIlIIl[78], lIIlIlIIl[79], lIIlIlIIl[80], lIIlIlIIl[1]);
        WorldArea worldArea2 = new WorldArea(lIIlIlIIl[77], lIIlIlIIl[78], lIIlIlIIl[79], lIIlIlIIl[80], lIIlIlIIl[3]);
        WorldArea worldArea3 = new WorldArea(lIIlIlIIl[77], lIIlIlIIl[78], lIIlIlIIl[79], lIIlIlIIl[80], lIIlIlIIl[10]);
        WorldArea worldArea4 = new WorldArea(lIIlIlIIl[81], lIIlIlIIl[82], lIIlIlIIl[70], lIIlIlIIl[65], lIIlIlIIl[0]);
        WorldArea worldArea5 = new WorldArea(lIIlIlIIl[83], lIIlIlIIl[82], lIIlIlIIl[12], lIIlIlIIl[65], lIIlIlIIl[10]);
        WorldArea worldArea6 = new WorldArea(lIIlIlIIl[84], lIIlIlIIl[85], lIIlIlIIl[64], lIIlIlIIl[50], lIIlIlIIl[10]);
        WorldArea worldArea7 = new WorldArea(lIIlIlIIl[86], lIIlIlIIl[87], lIIlIlIIl[27], lIIlIlIIl[23], lIIlIlIIl[1]);
        WorldArea worldArea8 = new WorldArea(lIIlIlIIl[86], lIIlIlIIl[88], lIIlIlIIl[12], lIIlIlIIl[25], lIIlIlIIl[10]);
        WorldArea worldArea9 = new WorldArea(lIIlIlIIl[89], lIIlIlIIl[90], lIIlIlIIl[76], lIIlIlIIl[41], lIIlIlIIl[10]);
        WorldArea worldArea10 = new WorldArea(lIIlIlIIl[91], lIIlIlIIl[92], lIIlIlIIl[67], lIIlIlIIl[65], lIIlIlIIl[10]);
        WorldArea worldArea11 = new WorldArea(lIIlIlIIl[93], lIIlIlIIl[94], lIIlIlIIl[23], lIIlIlIIl[27], lIIlIlIIl[10]);
        WorldArea worldArea12 = new WorldArea(lIIlIlIIl[93], lIIlIlIIl[95], lIIlIlIIl[12], lIIlIlIIl[23], lIIlIlIIl[10]);
        if (X.llllIlllIlI(worldArea4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && X.llllIlllIlI(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && X.llllIlllIlI(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && X.llllIlllIlI(worldArea3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderEasyClues.c = lIIlIIllI[lIIlIlIIl[96]];
            if (X.llllIlllIII(Bank.isOpen() ? 1 : 0)) {
                Bank.close();
            }
            if (X.llllIlllIII(Dialog.isOpen() ? 1 : 0)) {
                Dialog.close();
            }
            Movement.walkTo((WorldPoint)new WorldPoint(lIIlIlIIl[97], lIIlIlIIl[53], lIIlIlIIl[0]));
            0;
            Time.sleepTicks((int)lIIlIlIIl[1]);
            0;
        }
        if (X.llllIllllll(Players.getLocal().getAnimation(), lIIlIlIIl[63]) && X.llllIlllIlI(Players.getLocal().isMoving() ? 1 : 0)) {
            String[] stringArray = new String[lIIlIlIIl[1]];
            stringArray[X.lIIlIlIIl[0]] = lIIlIIllI[lIIlIlIIl[98]];
            TileItem lIIIIllllIlllIl = TileItems.getNearest((String[])stringArray);
            if (X.llllIlllIll(lIIIIllllIlllIl) && X.llllIlllIII(X.dl() ? 1 : 0)) {
                AccBuilderEasyClues.c = lIIlIIllI[lIIlIlIIl[99]];
                System.out.println(lIIlIIllI[lIIlIlIIl[100]]);
                lIIIIllllIlllIl.interact(lIIlIIllI[lIIlIlIIl[101]]);
                Time.sleepTicks((int)lIIlIlIIl[10]);
                0;
            }
            if (X.llllIlllIlI(X.dl() ? 1 : 0)) {
                void lIIIIllllIllllI;
                void lIIIIllllIlllll;
                void lIIIIlllllIIIII;
                void lIIIIlllllIIIIl;
                void lIIIIlllllIIIlI;
                void lIIIIlllllIIIll;
                void lIIIIlllllIIlII;
                void lIIIIlllllIIlIl;
                int lIIIIllllIlllII;
                void lIIIIlllllIIllI;
                if (X.llllIlllIII(lIIIIlllllIIllI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && X.llllIlllIlI(X.dl() ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIIlIIllI[lIIlIlIIl[102]];
                    lIIIIllllIlllII = Skills.getExperience((Skill)Skill.AGILITY);
                    String[] stringArray2 = new String[lIIlIlIIl[1]];
                    stringArray2[X.lIIlIlIIl[0]] = lIIlIIllI[lIIlIlIIl[103]];
                    TileObjects.getNearest((String[])stringArray2).interact(lIIlIIllI[lIIlIlIIl[104]]);
                    Time.sleepUntil(() -> {
                        boolean bl;
                        if (X.llllIllllII(Skills.getExperience((Skill)Skill.AGILITY), lIIIIllllIlllII)) {
                            bl = lIIlIlIIl[1];
                            0;
                            if (-1 >= ((0xDF ^ 0xC1 ^ (0xFD ^ 0xC7)) & (0x7F ^ 0x43 ^ (0x5A ^ 0x42) ^ -1))) {
                                return ((120 + 23 - 70 + 117 ^ 70 + 103 - 115 + 111) & (0x4D ^ 0xB ^ (0xC4 ^ 0x95) ^ -1)) != 0;
                            }
                        } else {
                            bl = lIIlIlIIl[0];
                        }
                        return bl;
                    }, (int)lIIlIlIIl[105]);
                    0;
                    Time.sleepTicks((int)lIIlIlIIl[1]);
                    0;
                }
                if (X.llllIlllIII(lIIIIlllllIIlIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && X.llllIlllIlI(X.dl() ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIIlIIllI[lIIlIlIIl[38]];
                    lIIIIllllIlllII = Skills.getExperience((Skill)Skill.AGILITY);
                    String[] stringArray3 = new String[lIIlIlIIl[1]];
                    stringArray3[X.lIIlIlIIl[0]] = lIIlIIllI[lIIlIlIIl[106]];
                    TileObjects.getNearest((String[])stringArray3).interact(lIIlIIllI[lIIlIlIIl[107]]);
                    Time.sleepUntil(() -> {
                        boolean bl;
                        if (X.llllIllllII(Skills.getExperience((Skill)Skill.AGILITY), lIIIIllllIlllII)) {
                            bl = lIIlIlIIl[1];
                            0;
                            if (2 < 2) {
                                return ((0x4C ^ 0x23 ^ (0x47 ^ 9)) & (0x73 ^ 0x36 ^ (0xEF ^ 0x8B) ^ -1)) != 0;
                            }
                        } else {
                            bl = lIIlIlIIl[0];
                        }
                        return bl;
                    }, (int)lIIlIlIIl[105]);
                    0;
                    Time.sleepTicks((int)lIIlIlIIl[1]);
                    0;
                }
                if (X.llllIlllIII(lIIIIlllllIIlII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && X.llllIlllIlI(X.dl() ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIIlIIllI[lIIlIlIIl[108]];
                    lIIIIllllIlllII = Skills.getExperience((Skill)Skill.AGILITY);
                    String[] stringArray4 = new String[lIIlIlIIl[1]];
                    stringArray4[X.lIIlIlIIl[0]] = lIIlIIllI[lIIlIlIIl[109]];
                    TileObjects.getNearest((String[])stringArray4).interact(lIIlIIllI[lIIlIlIIl[2]]);
                    Time.sleepUntil(() -> {
                        boolean bl;
                        if (X.llllIllllII(Skills.getExperience((Skill)Skill.AGILITY), lIIIIllllIlllII)) {
                            bl = lIIlIlIIl[1];
                            0;
                            if (2 <= 0) {
                                return false;
                            }
                        } else {
                            bl = lIIlIlIIl[0];
                        }
                        return bl;
                    }, (int)lIIlIlIIl[105]);
                    0;
                    Time.sleepTicks((int)lIIlIlIIl[1]);
                    0;
                }
                if (X.llllIlllIII(lIIIIlllllIIIll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && X.llllIlllIlI(X.dl() ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIIlIIllI[lIIlIlIIl[110]];
                    lIIIIllllIlllII = Skills.getExperience((Skill)Skill.AGILITY);
                    String[] stringArray5 = new String[lIIlIlIIl[1]];
                    stringArray5[X.lIIlIlIIl[0]] = lIIlIIllI[lIIlIlIIl[111]];
                    TileObjects.getNearest((String[])stringArray5).interact(lIIlIIllI[lIIlIlIIl[112]]);
                    Time.sleepUntil(() -> {
                        boolean bl;
                        if (X.llllIllllII(Skills.getExperience((Skill)Skill.AGILITY), lIIIIllllIlllII)) {
                            bl = lIIlIlIIl[1];
                            0;
                            if ((0x40 ^ 0x39 ^ (0x1A ^ 0x67)) <= -1) {
                                return false;
                            }
                        } else {
                            bl = lIIlIlIIl[0];
                        }
                        return bl;
                    }, (int)lIIlIlIIl[105]);
                    0;
                    Time.sleepTicks((int)lIIlIlIIl[1]);
                    0;
                }
                if (X.llllIlllIII(lIIIIlllllIIIlI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && X.llllIlllIlI(X.dl() ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIIlIIllI[lIIlIlIIl[113]];
                    lIIIIllllIlllII = Skills.getExperience((Skill)Skill.AGILITY);
                    String[] stringArray6 = new String[lIIlIlIIl[1]];
                    stringArray6[X.lIIlIlIIl[0]] = lIIlIIllI[lIIlIlIIl[40]];
                    TileObjects.getNearest((String[])stringArray6).interact(lIIlIIllI[lIIlIlIIl[7]]);
                    Time.sleepUntil(() -> {
                        boolean bl;
                        if (X.llllIllllII(Skills.getExperience((Skill)Skill.AGILITY), lIIIIllllIlllII)) {
                            bl = lIIlIlIIl[1];
                            0;
                            if (2 != 2) {
                                return ((0xB6 ^ 0xA1 ^ (0x79 ^ 0x5A)) & (0x2E ^ 0x52 ^ (0x57 ^ 0x1F) ^ -1)) != 0;
                            }
                        } else {
                            bl = lIIlIlIIl[0];
                        }
                        return bl;
                    }, (int)lIIlIlIIl[105]);
                    0;
                    Time.sleepTicks((int)lIIlIlIIl[1]);
                    0;
                }
                if (X.llllIlllIII(lIIIIlllllIIIIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && X.llllIlllIlI(X.dl() ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIIlIIllI[lIIlIlIIl[114]];
                    lIIIIllllIlllII = Skills.getExperience((Skill)Skill.AGILITY);
                    int[] nArray = new int[lIIlIlIIl[1]];
                    nArray[X.lIIlIlIIl[0]] = lIIlIlIIl[115];
                    TileObjects.getNearest((int[])nArray).interact(lIIlIIllI[lIIlIlIIl[116]]);
                    Time.sleepUntil(() -> {
                        boolean bl;
                        if (X.llllIllllII(Skills.getExperience((Skill)Skill.AGILITY), lIIIIllllIlllII)) {
                            bl = lIIlIlIIl[1];
                            0;
                            if ((83 + 59 - 13 + 53 ^ 94 + 114 - 178 + 149) == 0) {
                                return ((0xD5 ^ 0x97 ^ (0x3D ^ 0x70)) & (0x7E ^ 0x50 ^ (0x60 ^ 0x41) ^ -1)) != 0;
                            }
                        } else {
                            bl = lIIlIlIIl[0];
                        }
                        return bl;
                    }, (int)lIIlIlIIl[105]);
                    0;
                    Time.sleepTicks((int)lIIlIlIIl[1]);
                    0;
                }
                if (X.llllIlllIII(lIIIIlllllIIIII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && X.llllIlllIlI(X.dl() ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIIlIIllI[lIIlIlIIl[117]];
                    lIIIIllllIlllII = Skills.getExperience((Skill)Skill.AGILITY);
                    int[] nArray = new int[lIIlIlIIl[1]];
                    nArray[X.lIIlIlIIl[0]] = lIIlIlIIl[118];
                    TileObjects.getNearest((int[])nArray).interact(lIIlIIllI[lIIlIlIIl[119]]);
                    Time.sleepUntil(() -> {
                        boolean bl;
                        if (X.llllIllllII(Skills.getExperience((Skill)Skill.AGILITY), lIIIIllllIlllII)) {
                            bl = lIIlIlIIl[1];
                            0;
                            if ((8 ^ 0xC) <= 0) {
                                return (3 & ~3) != 0;
                            }
                        } else {
                            bl = lIIlIlIIl[0];
                        }
                        return bl;
                    }, (int)lIIlIlIIl[105]);
                    0;
                    Time.sleepTicks((int)lIIlIlIIl[1]);
                    0;
                }
                if (X.llllIlllIII(lIIIIllllIlllll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && X.llllIlllIlI(X.dl() ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIIlIIllI[lIIlIlIIl[120]];
                    lIIIIllllIlllII = Skills.getExperience((Skill)Skill.AGILITY);
                    int[] nArray = new int[lIIlIlIIl[1]];
                    nArray[X.lIIlIlIIl[0]] = lIIlIlIIl[121];
                    TileObjects.getNearest((int[])nArray).interact(lIIlIIllI[lIIlIlIIl[122]]);
                    Time.sleepUntil(() -> {
                        boolean bl;
                        if (X.llllIllllII(Skills.getExperience((Skill)Skill.AGILITY), lIIIIllllIlllII)) {
                            bl = lIIlIlIIl[1];
                            0;
                            if (3 <= 1) {
                                return false;
                            }
                        } else {
                            bl = lIIlIlIIl[0];
                        }
                        return bl;
                    }, (int)lIIlIlIIl[105]);
                    0;
                    Time.sleepTicks((int)lIIlIlIIl[1]);
                    0;
                }
                if (X.llllIlllIII(lIIIIllllIllllI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && X.llllIlllIlI(X.dl() ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIIlIIllI[lIIlIlIIl[123]];
                    lIIIIllllIlllII = Skills.getExperience((Skill)Skill.AGILITY);
                    String[] stringArray7 = new String[lIIlIlIIl[1]];
                    stringArray7[X.lIIlIlIIl[0]] = lIIlIIllI[lIIlIlIIl[124]];
                    TileObjects.getNearest((String[])stringArray7).interact(lIIlIIllI[lIIlIlIIl[45]]);
                    Time.sleepUntil(() -> {
                        boolean bl;
                        if (X.llllIllllII(Skills.getExperience((Skill)Skill.AGILITY), lIIIIllllIlllII)) {
                            bl = lIIlIlIIl[1];
                            0;
                            if ((0x35 ^ 0x31) < 1) {
                                return false;
                            }
                        } else {
                            bl = lIIlIlIIl[0];
                        }
                        return bl;
                    }, (int)lIIlIlIIl[105]);
                    0;
                    Time.sleepTicks((int)lIIlIlIIl[1]);
                    0;
                }
            }
        }
    }

    private static String llllIlIIIll(String lIIIIllIIlIIIlI, String lIIIIllIIlIIIIl) {
        try {
            SecretKeySpec lIIIIllIIlIIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIIIIllIIlIIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIIIIllIIlIIllI = Cipher.getInstance("Blowfish");
            lIIIIllIIlIIllI.init(lIIlIlIIl[3], lIIIIllIIlIIlll);
            return new String(lIIIIllIIlIIllI.doFinal(Base64.getDecoder().decode(lIIIIllIIlIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIIIIllIIlIIlIl) {
            lIIIIllIIlIIlIl.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean S() {
        return lIIlIlIIl[0];
    }

    private static boolean llllIllllll(int n2, int n3) {
        return n2 == n3;
    }

    static {
        X.llllIllIlll();
        X.llllIllIllI();
        bv = new ArrayList<d>();
        kx = lIIlIlIIl[28];
        ky = lIIlIlIIl[24];
        kA = new WorldArea(lIIlIlIIl[235], lIIlIlIIl[53], lIIlIlIIl[70], lIIlIlIIl[73], lIIlIlIIl[0]);
        kB = new WorldArea(lIIlIlIIl[235], lIIlIlIIl[53], lIIlIlIIl[70], lIIlIlIIl[73], lIIlIlIIl[1]);
        kC = new WorldArea(lIIlIlIIl[235], lIIlIlIIl[53], lIIlIlIIl[70], lIIlIlIIl[73], lIIlIlIIl[3]);
        kD = new WorldPoint(lIIlIlIIl[236], lIIlIlIIl[237], lIIlIlIIl[0]);
    }

    /*
     * WARNING - void declaration
     */
    private static void dk() {
        void lIIIIlllIlIIlll;
        void lIIIIlllIlIllIl;
        void lIIIIlllIlIlllI;
        void lIIIIlllIlIllll;
        void lIIIIlllIllIIII;
        WorldArea worldArea = new WorldArea(lIIlIlIIl[162], lIIlIlIIl[163], lIIlIlIIl[111], lIIlIlIIl[111], lIIlIlIIl[0]);
        WorldArea worldArea2 = new WorldArea(lIIlIlIIl[162], lIIlIlIIl[163], lIIlIlIIl[111], lIIlIlIIl[111], lIIlIlIIl[1]);
        WorldArea worldArea3 = new WorldArea(lIIlIlIIl[162], lIIlIlIIl[163], lIIlIlIIl[111], lIIlIlIIl[111], lIIlIlIIl[3]);
        WorldArea worldArea4 = new WorldArea(lIIlIlIIl[162], lIIlIlIIl[163], lIIlIlIIl[111], lIIlIlIIl[111], lIIlIlIIl[10]);
        WorldArea worldArea5 = new WorldArea(lIIlIlIIl[164], lIIlIlIIl[133], lIIlIlIIl[65], lIIlIlIIl[12], lIIlIlIIl[10]);
        WorldArea worldArea6 = new WorldArea(lIIlIlIIl[165], lIIlIlIIl[139], lIIlIlIIl[39], lIIlIlIIl[54], lIIlIlIIl[3]);
        WorldArea worldArea7 = new WorldArea(lIIlIlIIl[166], lIIlIlIIl[134], lIIlIlIIl[50], lIIlIlIIl[27], lIIlIlIIl[3]);
        WorldArea worldArea8 = new WorldArea(lIIlIlIIl[167], lIIlIlIIl[136], lIIlIlIIl[71], lIIlIlIIl[65], lIIlIlIIl[10]);
        WorldArea worldArea9 = new WorldArea(lIIlIlIIl[168], lIIlIlIIl[169], lIIlIlIIl[55], lIIlIlIIl[64], lIIlIlIIl[3]);
        WorldPoint worldPoint = new WorldPoint(lIIlIlIIl[170], lIIlIlIIl[171], lIIlIlIIl[0]);
        if (X.llllIlllIII(Dialog.isOpen() ? 1 : 0)) {
            Dialog.close();
        }
        if (X.llllIlllIlI(lIIIIlllIllIIII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && X.llllIlllIlI(lIIIIlllIlIllll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && X.llllIlllIlI(lIIIIlllIlIlllI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && X.llllIlllIlI(lIIIIlllIlIllIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderEasyClues.c = lIIlIIllI[lIIlIlIIl[172]];
            Movement.walkTo((WorldPoint)lIIIIlllIlIIlll);
            0;
            Time.sleepTicks((int)lIIlIlIIl[1]);
            0;
        }
        if (X.llllIlllIII(lIIIIlllIllIIII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (X.llllIllllII(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lIIIIlllIlIIlll), lIIlIlIIl[21])) {
                AccBuilderEasyClues.c = lIIlIIllI[lIIlIlIIl[173]];
                Movement.walkTo((WorldPoint)lIIIIlllIlIIlll);
                0;
                Time.sleepTicks((int)lIIlIlIIl[1]);
                0;
            }
            if (X.lllllIIIIII(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lIIIIlllIlIIlll), lIIlIlIIl[21])) {
                AccBuilderEasyClues.c = lIIlIIllI[lIIlIlIIl[174]];
                int lIIIIlllIlIIllI = Skills.getExperience((Skill)Skill.AGILITY);
                String[] stringArray = new String[lIIlIlIIl[1]];
                stringArray[X.lIIlIlIIl[0]] = lIIlIIllI[lIIlIlIIl[175]];
                TileObjects.getNearest((String[])stringArray).interact(lIIlIIllI[lIIlIlIIl[36]]);
                Time.sleepTicks((int)e.c(lIIlIlIIl[1], lIIlIlIIl[3]));
                0;
                Time.sleepUntil(() -> {
                    boolean bl;
                    if (X.llllIllllII(Skills.getExperience((Skill)Skill.AGILITY), lIIIIlllIlIIllI)) {
                        bl = lIIlIlIIl[1];
                        0;
                        if ((0xA ^ 0xE) <= 3) {
                            return false;
                        }
                    } else {
                        bl = lIIlIlIIl[0];
                    }
                    return bl;
                }, (int)lIIlIlIIl[105]);
                0;
                Time.sleepTicks((int)lIIlIlIIl[1]);
                0;
            }
        }
        String[] stringArray = new String[lIIlIlIIl[1]];
        stringArray[X.lIIlIlIIl[0]] = lIIlIIllI[lIIlIlIIl[176]];
        TileItem lIIIIlllIlIIllI = TileItems.getNearest((String[])stringArray);
        if (X.llllIlllIll(lIIIIlllIlIIllI) && X.llllIlllIII(X.dl() ? 1 : 0)) {
            AccBuilderEasyClues.c = lIIlIIllI[lIIlIlIIl[177]];
            System.out.println(lIIlIIllI[lIIlIlIIl[178]]);
            lIIIIlllIlIIllI.interact(lIIlIIllI[lIIlIlIIl[179]]);
            Time.sleepTicks((int)lIIlIlIIl[10]);
            0;
        }
        if (X.llllIlllIlI(X.dl() ? 1 : 0)) {
            void lIIIIlllIlIlIII;
            void lIIIIlllIlIlIIl;
            void lIIIIlllIlIlIlI;
            void lIIIIlllIlIlIll;
            int lIIIIlllIlIIlII;
            TileObject lIIIIlllIlIIlIl;
            void lIIIIlllIlIllII;
            if (X.llllIlllIII(lIIIIlllIlIllII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && X.llllIlllIll(lIIIIlllIlIIlIl = TileObjects.getNearest(tileObject -> {
                int n2;
                if (X.llllIlllIII(tileObject.getName().contains(lIIlIIllI[lIIlIlIIl[218]]) ? 1 : 0) && X.lllllIIIIII(tileObject.getWorldLocation().distanceTo(new WorldPoint(lIIlIlIIl[219], lIIlIlIIl[220], lIIlIlIIl[10])), lIIlIlIIl[3])) {
                    n2 = lIIlIlIIl[1];
                    0;
                    if (-2 >= 0) {
                        return ((35 + 24 - -117 + 41 ^ 75 + 58 - 32 + 44) & (0x30 ^ 4 ^ (0x64 ^ 0x18) ^ -1)) != 0;
                    }
                } else {
                    n2 = lIIlIlIIl[0];
                }
                return n2 != 0;
            }))) {
                lIIIIlllIlIIlII = Skills.getExperience((Skill)Skill.AGILITY);
                AccBuilderEasyClues.c = lIIlIIllI[lIIlIlIIl[180]];
                lIIIIlllIlIIlIl.interact(lIIlIIllI[lIIlIlIIl[80]]);
                Time.sleepTicks((int)e.c(lIIlIlIIl[1], lIIlIlIIl[3]));
                0;
                Time.sleepUntil(() -> {
                    boolean bl;
                    if (X.llllIllllII(Skills.getExperience((Skill)Skill.AGILITY), lIIIIlllIlIIlII)) {
                        bl = lIIlIlIIl[1];
                        0;
                        if (1 < -1) {
                            return false;
                        }
                    } else {
                        bl = lIIlIlIIl[0];
                    }
                    return bl;
                }, (int)lIIlIlIIl[105]);
                0;
                Time.sleepTicks((int)lIIlIlIIl[1]);
                0;
            }
            if (X.llllIlllIII(X.dl() ? 1 : 0)) {
                return;
            }
            if (X.llllIlllIII(lIIIIlllIlIlIll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && X.llllIlllIll(lIIIIlllIlIIlIl = TileObjects.getNearest(tileObject -> {
                int n2;
                if (X.llllIlllIII(tileObject.getName().contains(lIIlIIllI[lIIlIlIIl[216]]) ? 1 : 0) && X.lllllIIIIII(tileObject.getWorldLocation().distanceTo(new WorldPoint(lIIlIlIIl[217], lIIlIlIIl[128], lIIlIlIIl[3])), lIIlIlIIl[3])) {
                    n2 = lIIlIlIIl[1];
                    0;
                    if (2 != 2) {
                        return (1 & ~1) != 0;
                    }
                } else {
                    n2 = lIIlIlIIl[0];
                }
                return n2 != 0;
            }))) {
                AccBuilderEasyClues.c = lIIlIIllI[lIIlIlIIl[181]];
                lIIIIlllIlIIlII = Skills.getExperience((Skill)Skill.AGILITY);
                lIIIIlllIlIIlIl.interact(lIIlIIllI[lIIlIlIIl[182]]);
                Time.sleepTicks((int)e.c(lIIlIlIIl[1], lIIlIlIIl[3]));
                0;
                Time.sleepUntil(() -> {
                    boolean bl;
                    if (X.llllIllllII(Skills.getExperience((Skill)Skill.AGILITY), lIIIIlllIlIIlII)) {
                        bl = lIIlIlIIl[1];
                        0;
                        if (((0x81 ^ 0xC3) & ~(0x80 ^ 0xC2)) != 0) {
                            return false;
                        }
                    } else {
                        bl = lIIlIlIIl[0];
                    }
                    return bl;
                }, (int)lIIlIlIIl[105]);
                0;
                Time.sleepTicks((int)lIIlIlIIl[1]);
                0;
            }
            if (X.llllIlllIII(X.dl() ? 1 : 0)) {
                return;
            }
            if (X.llllIlllIII(lIIIIlllIlIlIlI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && X.llllIlllIll(lIIIIlllIlIIlIl = TileObjects.getNearest(tileObject -> {
                int n2;
                if (X.llllIlllIII(tileObject.getName().contains(lIIlIIllI[lIIlIlIIl[213]]) ? 1 : 0) && X.lllllIIIIII(tileObject.getWorldLocation().distanceTo(new WorldPoint(lIIlIlIIl[214], lIIlIlIIl[215], lIIlIlIIl[3])), lIIlIlIIl[3])) {
                    n2 = lIIlIlIIl[1];
                    0;
                    if (-1 == 1) {
                        return ((0x96 ^ 0x9F ^ (0x6B ^ 0x39)) & (0x58 ^ 0x3F ^ (0x69 ^ 0x55) ^ -1)) != 0;
                    }
                } else {
                    n2 = lIIlIlIIl[0];
                }
                return n2 != 0;
            }))) {
                AccBuilderEasyClues.c = lIIlIIllI[lIIlIlIIl[183]];
                lIIIIlllIlIIlII = Skills.getExperience((Skill)Skill.AGILITY);
                lIIIIlllIlIIlIl.interact(lIIlIIllI[lIIlIlIIl[184]]);
                Time.sleepTicks((int)e.c(lIIlIlIIl[1], lIIlIlIIl[3]));
                0;
                Time.sleepUntil(() -> {
                    boolean bl;
                    if (X.llllIllllII(Skills.getExperience((Skill)Skill.AGILITY), lIIIIlllIlIIlII)) {
                        bl = lIIlIlIIl[1];
                        0;
                        if (3 <= 2) {
                            return false;
                        }
                    } else {
                        bl = lIIlIlIIl[0];
                    }
                    return bl;
                }, (int)lIIlIlIIl[105]);
                0;
                Time.sleepTicks((int)lIIlIlIIl[1]);
                0;
            }
            if (X.llllIlllIII(X.dl() ? 1 : 0)) {
                return;
            }
            if (X.llllIlllIII(lIIIIlllIlIlIIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && X.llllIlllIll(lIIIIlllIlIIlIl = TileObjects.getNearest(tileObject -> {
                int n2;
                if (X.llllIlllIII(tileObject.getName().contains(lIIlIIllI[lIIlIlIIl[211]]) ? 1 : 0) && X.lllllIIIIII(tileObject.getWorldLocation().distanceTo(new WorldPoint(lIIlIlIIl[209], lIIlIlIIl[212], lIIlIlIIl[10])), lIIlIlIIl[3])) {
                    n2 = lIIlIlIIl[1];
                    0;
                    if (2 == 0) {
                        return false;
                    }
                } else {
                    n2 = lIIlIlIIl[0];
                }
                return n2 != 0;
            }))) {
                AccBuilderEasyClues.c = lIIlIIllI[lIIlIlIIl[185]];
                lIIIIlllIlIIlII = Skills.getExperience((Skill)Skill.AGILITY);
                lIIIIlllIlIIlIl.interact(lIIlIIllI[lIIlIlIIl[186]]);
                Time.sleepTicks((int)e.c(lIIlIlIIl[1], lIIlIlIIl[3]));
                0;
                Time.sleepUntil(() -> {
                    boolean bl;
                    if (X.llllIllllII(Skills.getExperience((Skill)Skill.AGILITY), lIIIIlllIlIIlII)) {
                        bl = lIIlIlIIl[1];
                        0;
                        if (1 == 2) {
                            return false;
                        }
                    } else {
                        bl = lIIlIlIIl[0];
                    }
                    return bl;
                }, (int)lIIlIlIIl[105]);
                0;
                Time.sleepTicks((int)lIIlIlIIl[1]);
                0;
            }
            if (X.llllIlllIII(X.dl() ? 1 : 0)) {
                return;
            }
            if (X.llllIlllIII(lIIIIlllIlIlIII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && X.llllIlllIll(lIIIIlllIlIIlIl = TileObjects.getNearest(tileObject -> {
                int n2;
                if (X.llllIlllIII(tileObject.getName().contains(lIIlIIllI[lIIlIlIIl[208]]) ? 1 : 0) && X.lllllIIIIII(tileObject.getWorldLocation().distanceTo(new WorldPoint(lIIlIlIIl[209], lIIlIlIIl[210], lIIlIlIIl[3])), lIIlIlIIl[3])) {
                    n2 = lIIlIlIIl[1];
                    0;
                    
                    }
                } else {
                    n2 = lIIlIlIIl[0];
                }
                return n2 != 0;
            }))) {
                AccBuilderEasyClues.c = lIIlIIllI[lIIlIlIIl[187]];
                lIIIIlllIlIIlII = Skills.getExperience((Skill)Skill.AGILITY);
                lIIIIlllIlIIlIl.interact(lIIlIIllI[lIIlIlIIl[188]]);
                Time.sleepTicks((int)e.c(lIIlIlIIl[1], lIIlIlIIl[3]));
                0;
                Time.sleepUntil(() -> {
                    boolean bl;
                    if (X.llllIllllII(Skills.getExperience((Skill)Skill.AGILITY), lIIIIlllIlIIlII)) {
                        bl = lIIlIlIIl[1];
                        0;
                        if ((0x50 ^ 0x6F ^ (0x4A ^ 0x71)) == ((0x73 ^ 8 ^ (0x2B ^ 0x75)) & (7 + 42 - -21 + 74 ^ 5 + 1 - -158 + 17 ^ -1))) {
                            return (3 & (3 ^ -1)) != 0;
                        }
                    } else {
                        bl = lIIlIlIIl[0];
                    }
                    return bl;
                }, (int)lIIlIlIIl[105]);
                0;
                Time.sleepTicks((int)lIIlIlIIl[1]);
                0;
            }
        }
    }

    private static boolean llllIlllllI(int n2, int n3) {
        return n2 >= n3;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean ab() {
        int n2;
        if (X.llllIlllllI(Skills.getBoostedLevel((Skill)Skill.AGILITY), lIIlIlIIl[38])) {
            int n3;
            int[] nArray = new int[lIIlIlIIl[1]];
            nArray[X.lIIlIlIIl[0]] = lIIlIlIIl[13];
            if (X.llllIlllIII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray2 = new int[lIIlIlIIl[1]];
                nArray2[X.lIIlIlIIl[0]] = lIIlIlIIl[26];
                if (X.llllIlllIII(Inventory.contains((int[])nArray2) ? 1 : 0)) {
                    int[] nArray3 = new int[lIIlIlIIl[1]];
                    nArray3[X.lIIlIlIIl[0]] = lIIlIlIIl[24];
                    if (!(!X.llllIlllIII(Inventory.contains((int[])nArray3) ? 1 : 0) || X.llllIlllIlI(Inventory.contains(item -> item.getName().contains(lIIlIIllI[lIIlIlIIl[207]])) ? 1 : 0) && !X.llllIlllIII(Equipment.contains(item -> item.getName().contains(lIIlIIllI[lIIlIlIIl[206]])) ? 1 : 0) || X.llllIlllIlI(Inventory.contains((int[])f.bf) ? 1 : 0) && !X.llllIlllIII(Equipment.contains((int[])f.bf) ? 1 : 0))) {
                        n3 = lIIlIlIIl[1];
                        0;
                        if (2 != 0) return n3 != 0;
                        return (3 & ~3) != 0;
                    }
                }
            }
            n3 = lIIlIlIIl[0];
            return n3 != 0;
        }
        int[] nArray = new int[lIIlIlIIl[1]];
        nArray[X.lIIlIlIIl[0]] = lIIlIlIIl[13];
        if (X.llllIlllIII(Inventory.contains((int[])nArray) ? 1 : 0)) {
            int[] nArray4 = new int[lIIlIlIIl[1]];
            nArray4[X.lIIlIlIIl[0]] = lIIlIlIIl[15];
            if (X.llllIlllIII(Inventory.contains((int[])nArray4) ? 1 : 0)) {
                int[] nArray5 = new int[lIIlIlIIl[1]];
                nArray5[X.lIIlIlIIl[0]] = lIIlIlIIl[14];
                if (!(!X.llllIlllIII(Inventory.contains((int[])nArray5) ? 1 : 0) || X.llllIlllIlI(Inventory.contains(item -> item.getName().contains(lIIlIIllI[lIIlIlIIl[205]])) ? 1 : 0) && !X.llllIlllIII(Equipment.contains(item -> item.getName().contains(lIIlIIllI[lIIlIlIIl[204]])) ? 1 : 0) || X.llllIlllIlI(Inventory.contains((int[])f.bf) ? 1 : 0) && !X.llllIlllIII(Equipment.contains((int[])f.bf) ? 1 : 0))) {
                    n2 = lIIlIlIIl[1];
                    0;
                    if (2 == 2) return n2 != 0;
                    return false;
                }
            }
        }
        n2 = lIIlIlIIl[0];
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    private static boolean dl() {
        WorldArea worldArea = new WorldArea(lIIlIlIIl[81], lIIlIlIIl[82], lIIlIlIIl[70], lIIlIlIIl[65], lIIlIlIIl[0]);
        WorldArea worldArea2 = new WorldArea(lIIlIlIIl[83], lIIlIlIIl[82], lIIlIlIIl[12], lIIlIlIIl[65], lIIlIlIIl[10]);
        WorldArea worldArea3 = new WorldArea(lIIlIlIIl[84], lIIlIlIIl[85], lIIlIlIIl[64], lIIlIlIIl[50], lIIlIlIIl[10]);
        WorldArea worldArea4 = new WorldArea(lIIlIlIIl[189], lIIlIlIIl[190], lIIlIlIIl[25], lIIlIlIIl[19], lIIlIlIIl[1]);
        WorldArea worldArea5 = new WorldArea(lIIlIlIIl[86], lIIlIlIIl[88], lIIlIlIIl[12], lIIlIlIIl[25], lIIlIlIIl[10]);
        WorldArea worldArea6 = new WorldArea(lIIlIlIIl[191], lIIlIlIIl[192], lIIlIlIIl[74], lIIlIlIIl[39], lIIlIlIIl[10]);
        WorldArea worldArea7 = new WorldArea(lIIlIlIIl[91], lIIlIlIIl[92], lIIlIlIIl[67], lIIlIlIIl[65], lIIlIlIIl[10]);
        WorldArea worldArea8 = new WorldArea(lIIlIlIIl[93], lIIlIlIIl[94], lIIlIlIIl[23], lIIlIlIIl[27], lIIlIlIIl[10]);
        WorldArea worldArea9 = new WorldArea(lIIlIlIIl[93], lIIlIlIIl[95], lIIlIlIIl[12], lIIlIlIIl[23], lIIlIlIIl[10]);
        WorldArea worldArea10 = new WorldArea(lIIlIlIIl[127], lIIlIlIIl[128], lIIlIlIIl[50], lIIlIlIIl[12], lIIlIlIIl[3]);
        WorldArea worldArea11 = new WorldArea(lIIlIlIIl[129], lIIlIlIIl[127], lIIlIlIIl[50], lIIlIlIIl[25], lIIlIlIIl[3]);
        WorldArea worldArea12 = new WorldArea(lIIlIlIIl[130], lIIlIlIIl[131], lIIlIlIIl[64], lIIlIlIIl[50], lIIlIlIIl[3]);
        WorldArea worldArea13 = new WorldArea(lIIlIlIIl[132], lIIlIlIIl[133], lIIlIlIIl[12], lIIlIlIIl[65], lIIlIlIIl[10]);
        WorldArea worldArea14 = new WorldArea(lIIlIlIIl[134], lIIlIlIIl[9], lIIlIlIIl[50], lIIlIlIIl[27], lIIlIlIIl[3]);
        WorldArea worldArea15 = new WorldArea(lIIlIlIIl[135], lIIlIlIIl[136], lIIlIlIIl[69], lIIlIlIIl[54], lIIlIlIIl[10]);
        WorldArea worldArea16 = new WorldArea(lIIlIlIIl[137], lIIlIlIIl[138], lIIlIlIIl[64], lIIlIlIIl[65], lIIlIlIIl[3]);
        WorldArea worldArea17 = new WorldArea(lIIlIlIIl[164], lIIlIlIIl[133], lIIlIlIIl[65], lIIlIlIIl[12], lIIlIlIIl[10]);
        WorldArea worldArea18 = new WorldArea(lIIlIlIIl[165], lIIlIlIIl[139], lIIlIlIIl[39], lIIlIlIIl[54], lIIlIlIIl[3]);
        WorldArea worldArea19 = new WorldArea(lIIlIlIIl[166], lIIlIlIIl[134], lIIlIlIIl[50], lIIlIlIIl[27], lIIlIlIIl[3]);
        WorldArea worldArea20 = new WorldArea(lIIlIlIIl[167], lIIlIlIIl[136], lIIlIlIIl[71], lIIlIlIIl[65], lIIlIlIIl[10]);
        WorldArea worldArea21 = new WorldArea(lIIlIlIIl[168], lIIlIlIIl[169], lIIlIlIIl[55], lIIlIlIIl[64], lIIlIlIIl[3]);
        WorldArea[] worldAreaArray = new WorldArea[lIIlIlIIl[69]];
        worldAreaArray[X.lIIlIlIIl[0]] = worldArea;
        worldAreaArray[X.lIIlIlIIl[1]] = worldArea2;
        worldAreaArray[X.lIIlIlIIl[3]] = worldArea3;
        worldAreaArray[X.lIIlIlIIl[10]] = worldArea4;
        worldAreaArray[X.lIIlIlIIl[17]] = worldArea5;
        worldAreaArray[X.lIIlIlIIl[19]] = worldArea6;
        worldAreaArray[X.lIIlIlIIl[21]] = worldArea7;
        worldAreaArray[X.lIIlIlIIl[23]] = worldArea8;
        worldAreaArray[X.lIIlIlIIl[25]] = worldArea9;
        worldAreaArray[X.lIIlIlIIl[27]] = worldArea10;
        worldAreaArray[X.lIIlIlIIl[12]] = worldArea11;
        worldAreaArray[X.lIIlIlIIl[50]] = worldArea12;
        worldAreaArray[X.lIIlIlIIl[64]] = worldArea13;
        worldAreaArray[X.lIIlIlIIl[65]] = worldArea14;
        worldAreaArray[X.lIIlIlIIl[54]] = worldArea15;
        worldAreaArray[X.lIIlIlIIl[39]] = worldArea16;
        worldAreaArray[X.lIIlIlIIl[66]] = worldArea17;
        worldAreaArray[X.lIIlIlIIl[67]] = worldArea18;
        worldAreaArray[X.lIIlIlIIl[55]] = worldArea19;
        worldAreaArray[X.lIIlIlIIl[68]] = worldArea20;
        worldAreaArray[X.lIIlIlIIl[41]] = worldArea21;
        WorldArea[] worldAreaArray2 = worldAreaArray;
        int[] nArray = new int[lIIlIlIIl[1]];
        nArray[X.lIIlIlIIl[0]] = lIIlIlIIl[193];
        if (X.llllIlllIll(TileItems.getNearest((int[])nArray))) {
            void lIIIIllIlllIlll;
            System.out.println(lIIlIIllI[lIIlIlIIl[194]]);
            int lIIIIllIlllIllI = lIIlIlIIl[0];
            while (X.llllIlllIIl(lIIIIllIlllIllI, ((void)lIIIIllIlllIlll).length)) {
                int[] nArray2 = new int[lIIlIlIIl[1]];
                nArray2[X.lIIlIlIIl[0]] = lIIlIlIIl[193];
                if (X.llllIlllIII(lIIIIllIlllIlll[lIIIIllIlllIllI].contains(TileItems.getNearest((int[])nArray2).getWorldLocation()) ? 1 : 0) && X.llllIlllIII(lIIIIllIlllIlll[lIIIIllIlllIllI].contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    return lIIlIlIIl[1];
                }
                ++lIIIIllIlllIllI;
                0;
                if (1 <= 3) continue;
                return false;
            }
        }
        return lIIlIlIIl[0];
    }

    private static String llllIlIIlII(String lIIIIllIIIlIlll, String lIIIIllIIIlIllI) {
        try {
            SecretKeySpec lIIIIllIIIllIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIIIIllIIIlIllI.getBytes(StandardCharsets.UTF_8)), lIIlIlIIl[25]), "DES");
            Cipher lIIIIllIIIllIIl = Cipher.getInstance("DES");
            lIIIIllIIIllIIl.init(lIIlIlIIl[3], lIIIIllIIIllIlI);
            return new String(lIIIIllIIIllIIl.doFinal(Base64.getDecoder().decode(lIIIIllIIIlIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIIIIllIIIllIII) {
            lIIIIllIIIllIII.printStackTrace();
            return null;
        }
    }

    private static boolean llllIlllIll(Object object) {
        return object != null;
    }

    private static void llllIllIlll() {
        lIIlIlIIl = new int[239];
        X.lIIlIlIIl[0] = (0x38 ^ 6 ^ (0x98 ^ 0xB6)) & (122 + 109 - 81 + 18 ^ 79 + 89 - 41 + 57 ^ -1);
        X.lIIlIlIIl[1] = 1;
        X.lIIlIlIIl[2] = 0xDE ^ 0x97 ^ (0x7B ^ 0x1F);
        X.lIIlIlIIl[3] = 2;
        X.lIIlIlIIl[4] = 0xFFFFCDEF & 0x3F97;
        X.lIIlIlIIl[5] = 0xFFFFDFFF & 0x2D85;
        X.lIIlIlIIl[6] = 0xBD ^ 0x83;
        X.lIIlIlIIl[7] = 0x19 ^ 0x15 ^ (0x37 ^ 8);
        X.lIIlIlIIl[8] = -(0xFFFFFAEE & 0x7559) & (0xFFFFFFFF & 0x7DFF);
        X.lIIlIlIIl[9] = 0xFFFFBF9A & 0x4DFD;
        X.lIIlIlIIl[10] = 3;
        X.lIIlIlIIl[11] = -(0xFFFFE40D & 0x7FF6) & (0xFFFFF79F & 0x7FEB);
        X.lIIlIlIIl[12] = 33 + 88 - 27 + 62 ^ 143 + 18 - 69 + 58;
        X.lIIlIlIIl[13] = 0xFFFF9F4F & 0x7FF7;
        X.lIIlIlIIl[14] = 0xFFFFFF68 & 0x1FDF;
        X.lIIlIlIIl[15] = -(0xFFFFF1FF & 0x6E97) & (0xFFFFFFDF & Short.MAX_VALUE);
        X.lIIlIlIIl[16] = -(0xFFFFDE93 & 0x71ED) & (0xFFFFFFCD & 0x5FBF);
        X.lIIlIlIIl[17] = 34 + 110 - 73 + 71 ^ 37 + 52 - -12 + 37;
        X.lIIlIlIIl[18] = -(0xFFFF832B & 0x7DF7) & (0xFFFFBFFE & 0x6FEF);
        X.lIIlIlIIl[19] = 0x8F ^ 0x8A;
        X.lIIlIlIIl[20] = 0xFFFFF77B & 0x39D5;
        X.lIIlIlIIl[21] = 0x8C ^ 0x8A;
        X.lIIlIlIIl[22] = 0xFFFFFF4E & 0x1FFB;
        X.lIIlIlIIl[23] = 6 ^ 1;
        X.lIIlIlIIl[24] = 0xFFFF99EF & 0x6791;
        X.lIIlIlIIl[25] = 80 + 52 - -42 + 7 ^ 152 + 177 - 283 + 143;
        X.lIIlIlIIl[26] = -1 & (0xFFFFDEE7 & 0x6DBB);
        X.lIIlIlIIl[27] = 0x62 ^ 0x6B;
        X.lIIlIlIIl[28] = 0xFFFFF6FA & 0x5B9F;
        X.lIIlIlIIl[29] = 0xFFFFEEF6 & 0x3F5D;
        X.lIIlIlIIl[30] = -(0xFFFFD7D4 & 0x693B) & (0xFFFFEF7F & 0x7FDF);
        X.lIIlIlIIl[31] = -(0xFFFFC7F3 & 0x79AE) & (0xFFFFFFEF & 0x6FFF);
        X.lIIlIlIIl[32] = -(0xFFFFE437 & 0x5BEA) & (0xFFFFEF6F & 0x7EFD);
        X.lIIlIlIIl[33] = 0xFFFFBF7B & 0x6ED6;
        X.lIIlIlIIl[34] = 0xFFFFEE6A & 0x3FDF;
        X.lIIlIlIIl[35] = -3 & (0xFFFFAFEA & 0x7ED7);
        X.lIIlIlIIl[36] = 0xCE ^ 0x96;
        X.lIIlIlIIl[37] = -(0xFFFFE2B5 & 0x3DDB) & (0xFFFFEFFB & 0x7F9F);
        X.lIIlIlIIl[38] = 0xD0 ^ 0xA7 ^ (0xFF ^ 0xA0);
        X.lIIlIlIIl[39] = 0x2B ^ 0x1A ^ (0x79 ^ 0x47);
        X.lIIlIlIIl[40] = 0x56 ^ 0x64;
        X.lIIlIlIIl[41] = 0x34 ^ 0x20;
        X.lIIlIlIIl[42] = 0x71 ^ 7 ^ (0x5D ^ 0x32);
        X.lIIlIlIIl[43] = 0x41 ^ 0x5F;
        X.lIIlIlIIl[44] = 0xFFFFBDEE & 0x433F;
        X.lIIlIlIIl[45] = 47 + 110 - 125 + 100 ^ 4 + 28 - -100 + 52;
        X.lIIlIlIIl[46] = 0xFFFFA937 & 0x57FB;
        X.lIIlIlIIl[47] = 0xFFFF89F5 & 0x7FAF;
        X.lIIlIlIIl[48] = -(0xFFFFFCCD & 0x6337) & (0xFFFFFD7F & 0x6FEF);
        X.lIIlIlIIl[49] = -(0xFFFFB771 & 0x7A8F) & (0xFFFFFFE4 & 0x3F7B);
        X.lIIlIlIIl[50] = 32 + 128 - 43 + 16 ^ 21 + 2 - -40 + 79;
        X.lIIlIlIIl[51] = -(0xFFFFFE65 & 0x33BB) & (0xFFFFFFFD & 0x3F7F);
        X.lIIlIlIIl[52] = 0xFFFFFFE9 & 0x9B7;
        X.lIIlIlIIl[53] = -(0xFFFFBDA9 & 0x52FF) & (0xFFFFDFFF & 0x3DFF);
        X.lIIlIlIIl[54] = 0x12 ^ 0x6B ^ (0xE3 ^ 0x94);
        X.lIIlIlIIl[55] = 0xB ^ 0x19;
        X.lIIlIlIIl[56] = -(0xA ^ 0x4F) & (0xFFFF8FF7 & 0x79FF);
        X.lIIlIlIIl[57] = -(0xFFFFBEBF & 0x43E4) & (0xFFFFBFFF & 0x4FFB);
        X.lIIlIlIIl[58] = 0xFFFFCFB7 & 0x39FA;
        X.lIIlIlIIl[59] = 0xFFFF9F79 & 0x6DDF;
        X.lIIlIlIIl[60] = 0xFFFFFBF5 & 0xDBB;
        X.lIIlIlIIl[61] = -(0xFFFFB38D & 0x7EFF) & (0xFFFFFFFF & 0x3FEF);
        X.lIIlIlIIl[62] = 0x67 ^ 0x71;
        X.lIIlIlIIl[63] = -1;
        X.lIIlIlIIl[64] = 0x10 ^ 0x1A ^ (0x3C ^ 0x3A);
        X.lIIlIlIIl[65] = 0x3C ^ 0x31;
        X.lIIlIlIIl[66] = 0x7A ^ 0x6A;
        X.lIIlIlIIl[67] = 0xD0 ^ 0xC1;
        X.lIIlIlIIl[68] = 0x8C ^ 0x89 ^ (0x5D ^ 0x4B);
        X.lIIlIlIIl[69] = 0x5C ^ 0x60 ^ (0x57 ^ 0x7E);
        X.lIIlIlIIl[70] = 0x69 ^ 0x7E;
        X.lIIlIlIIl[71] = 0x31 ^ 0x29;
        X.lIIlIlIIl[72] = 0x4F ^ 0xA ^ (0xE ^ 0x51);
        X.lIIlIlIIl[73] = 0x93 ^ 0x88;
        X.lIIlIlIIl[74] = 126 + 102 - 192 + 128 ^ 145 + 89 - 160 + 110;
        X.lIIlIlIIl[75] = 109 + 159 - 171 + 124 ^ 7 + 152 - 96 + 129;
        X.lIIlIlIIl[76] = 0x4D ^ 0x52;
        X.lIIlIlIIl[77] = 0xFFFF9C7F & 0x6FDF;
        X.lIIlIlIIl[78] = 0xFFFFBF7E & 0x4D97;
        X.lIIlIlIIl[79] = (0xD0 ^ 0xA6) + (0x5A ^ 0x64) - (76 + 28 - 86 + 129) + (0x42 ^ 0x2A);
        X.lIIlIlIIl[80] = 0x29 ^ 0x77;
        X.lIIlIlIIl[81] = 0xFFFF9DBF & 0x6ED3;
        X.lIIlIlIIl[82] = 0xFFFF8F5B & 0x7DF5;
        X.lIIlIlIIl[83] = -(0xFFFFFFEB & 0x7156) & (0xFFFFFFCD & 0x7DFF);
        X.lIIlIlIIl[84] = -(0xFFFFEE4A & 0x33B7) & (0xFFFFFF7F & 0x2EFF);
        X.lIIlIlIIl[85] = 0xFFFFEF57 & 0x1DFC;
        X.lIIlIlIIl[86] = -(0xFFFFF1CB & 0x3FBE) & (0xFFFFFFFF & 0x3DFF);
        X.lIIlIlIIl[87] = -(0xFFFFF87B & 0x27A7) & (0xFFFFFFF7 & 0x2D7F);
        X.lIIlIlIIl[88] = 0xFFFF8F4B & 0x7DFD;
        X.lIIlIlIIl[89] = -(0xFFFFC783 & 0x7A7D) & (0xFFFFCF6F & 0x7EFB);
        X.lIIlIlIIl[90] = 0xFFFFBFFE & 0x4D37;
        X.lIIlIlIIl[91] = -(0xFFFFDBDD & 0x772F) & (0xFFFFFFFD & 0x5F9F);
        X.lIIlIlIIl[92] = -(0xFFFFFDFB & 0x529F) & (0xFFFFFFDF & 0x5DFA);
        X.lIIlIlIIl[93] = -(0xFFFFF9F5 & 0x765F) & (0xFFFFFDF7 & 0x7EFE);
        X.lIIlIlIIl[94] = 0xFFFFEDCA & 0x1F7F;
        X.lIIlIlIIl[95] = 0xFFFFCFF7 & 0x3D5A;
        X.lIIlIlIIl[96] = 0x43 ^ 0x63;
        X.lIIlIlIIl[97] = -(0xFFFFFBFE & 0x7625) & (0xFFFFFFBF & 0x7EFB);
        X.lIIlIlIIl[98] = 0x90 ^ 0x9C ^ (0xEE ^ 0xC3);
        X.lIIlIlIIl[99] = 0x8E ^ 0xAC;
        X.lIIlIlIIl[100] = 0x16 ^ 0x41 ^ (0x6C ^ 0x18);
        X.lIIlIlIIl[101] = 0x40 ^ 0x2F ^ (0xFD ^ 0xB6);
        X.lIIlIlIIl[102] = 0x93 ^ 0xB6;
        X.lIIlIlIIl[103] = 0xA9 ^ 0x8F;
        X.lIIlIlIIl[104] = 0x75 ^ 0x52;
        X.lIIlIlIIl[105] = -(0xFFFFFEB7 & 0x1FCA) & (0xFFFFBFFD & 0x7FB7);
        X.lIIlIlIIl[106] = 0xBE ^ 0xBA ^ (0x46 ^ 0x6B);
        X.lIIlIlIIl[107] = 106 + 115 - 186 + 109 ^ 1 + 91 - 57 + 151;
        X.lIIlIlIIl[108] = 0x23 ^ 0x77 ^ 87 + 98 - 114 + 56;
        X.lIIlIlIIl[109] = 0xBC ^ 0x90;
        X.lIIlIlIIl[110] = 0x7D ^ 0x1D ^ (0x49 ^ 7);
        X.lIIlIlIIl[111] = 0x49 ^ 0x66;
        X.lIIlIlIIl[112] = 0x62 ^ 0x52;
        X.lIIlIlIIl[113] = 0xEF ^ 0xC6 ^ (0xA7 ^ 0xBF);
        X.lIIlIlIIl[114] = 48 + 113 - 135 + 121 ^ 132 + 92 - 223 + 166;
        X.lIIlIlIIl[115] = -(0xFFFFB68F & 0x4B7E) & (0xFFFFFBFF & 0x3FFF);
        X.lIIlIlIIl[116] = 0x4F ^ 0x7A;
        X.lIIlIlIIl[117] = 3 ^ 8 ^ (0xA8 ^ 0x95);
        X.lIIlIlIIl[118] = -(0xFFFFA2CD & 0x5F3F) & (0xFFFFBBFF & Short.MAX_VALUE);
        X.lIIlIlIIl[119] = 0xB0 ^ 0x87;
        X.lIIlIlIIl[120] = 0xFA ^ 0xC2;
        X.lIIlIlIIl[121] = -(0xFFFFCB2B & 0x76DE) & (0xFFFFFFFF & 0x7BFD);
        X.lIIlIlIIl[122] = 0x8D ^ 0xA9 ^ (0x5A ^ 0x47);
        X.lIIlIlIIl[123] = 0xCF ^ 0x9C ^ (0xAD ^ 0xC4);
        X.lIIlIlIIl[124] = 0 ^ 0x3B;
        X.lIIlIlIIl[125] = -(0xFFFFF0F7 & 0x7F29) & (0xFFFFFFBF & 0x7DEF);
        X.lIIlIlIIl[126] = 0xFFFF8DFE & 0x7F8B;
        X.lIIlIlIIl[127] = -(0xFFFFF53D & 0x3AD3) & (0xFFFFFDBE & 0x3FFF);
        X.lIIlIlIIl[128] = 0xFFFF8DF2 & 0x7FAF;
        X.lIIlIlIIl[129] = 0xFFFFEFA7 & 0x1DFF;
        X.lIIlIlIIl[130] = -(0xFFFFFD65 & 0x32FF) & (0xFFFFFDFF & 0x3FFF);
        X.lIIlIlIIl[131] = -(0xFFFFEA73 & 0x77CF) & (0xFFFFFFFF & 0x6FEB);
        X.lIIlIlIIl[132] = -(0xFFFFFEFB & 0x236C) & (0xFFFFFFFF & 0x2FF7);
        X.lIIlIlIIl[133] = -(0xFFFFF779 & 0x3A9F) & (0xFFFFFFBF & 0x3FF9);
        X.lIIlIlIIl[134] = 0xFFFFCDBB & 0x3FD7;
        X.lIIlIlIIl[135] = -(0xFFFFFF1D & 0x62E3) & (0xFFFFEFBF & 0x7FDD);
        X.lIIlIlIIl[136] = 0xFFFF8DDB & 0x7FAF;
        X.lIIlIlIIl[137] = -(0xFFFFD752 & 0x6AEF) & (0xFFFFFFFF & 0x4FF3);
        X.lIIlIlIIl[138] = -(0xFFFFFBDD & 0x346B) & (0xFFFFFFFD & 0x3DDB);
        X.lIIlIlIIl[139] = 0xFFFF9F9E & 0x6DFF;
        X.lIIlIlIIl[140] = 0x3D ^ 0;
        X.lIIlIlIIl[141] = 0x4F ^ 0x35 ^ (0x63 ^ 0x26);
        X.lIIlIlIIl[142] = 0xED ^ 0xAD;
        X.lIIlIlIIl[143] = 18 + 73 - 12 + 130 ^ 128 + 54 - 102 + 64;
        X.lIIlIlIIl[144] = 0xD6 ^ 0x94;
        X.lIIlIlIIl[145] = 0x12 ^ 0x51;
        X.lIIlIlIIl[146] = 0x18 ^ 0x5C;
        X.lIIlIlIIl[147] = 0x81 ^ 0xC4;
        X.lIIlIlIIl[148] = 170 + 171 - 280 + 134 ^ 103 + 90 - 138 + 78;
        X.lIIlIlIIl[149] = 0x2C ^ 0x6B;
        X.lIIlIlIIl[150] = 0x77 ^ 0x3B ^ (0x1A ^ 0x1E);
        X.lIIlIlIIl[151] = 0x3E ^ 0x77;
        X.lIIlIlIIl[152] = 0x23 ^ 0x69;
        X.lIIlIlIIl[153] = 0x6F ^ 0x24;
        X.lIIlIlIIl[154] = 0x35 ^ 0x79;
        X.lIIlIlIIl[155] = 0x8C ^ 0xA3 ^ (0xE ^ 0x6C);
        X.lIIlIlIIl[156] = 0xD5 ^ 0x9B;
        X.lIIlIlIIl[157] = 0x16 ^ 2 ^ (0x4F ^ 0x14);
        X.lIIlIlIIl[158] = 0x6C ^ 0x3C;
        X.lIIlIlIIl[159] = 16 + 228 - 59 + 64 ^ 67 + 21 - -38 + 42;
        X.lIIlIlIIl[160] = 0x31 ^ 0x41 ^ (0x94 ^ 0xB6);
        X.lIIlIlIIl[161] = 0x2B ^ 0x78;
        X.lIIlIlIIl[162] = -(0xFFFFF981 & 0x677F) & (0xFFFFFFFF & 0x6B7F);
        X.lIIlIlIIl[163] = 0xFFFFEFFE & 0x1D7F;
        X.lIIlIlIIl[164] = 0xFFFFFBDF & 0xEBF;
        X.lIIlIlIIl[165] = -(0xFFFFAFFB & 0x5467) & (0xFFFFCFFF & 0x3EEF);
        X.lIIlIlIIl[166] = -(0xFFFFF59D & 0x2F6F) & (0xFFFFBFDF & 0x6FBF);
        X.lIIlIlIIl[167] = 0xFFFF8F8D & 0x7AFB;
        X.lIIlIlIIl[168] = 0xFFFFFECB & 0xBB4;
        X.lIIlIlIIl[169] = 0xFFFFBDA1 & 0x4FDF;
        X.lIIlIlIIl[170] = 0xFFFFFBE9 & 0xEBF;
        X.lIIlIlIIl[171] = -(0xFFFFFE7F & 0x73C3) & (0xFFFFFFEE & 0x7FF3);
        X.lIIlIlIIl[172] = 0x18 ^ 0x4C;
        X.lIIlIlIIl[173] = 33 + 87 - -32 + 62 ^ 115 + 119 - 104 + 1;
        X.lIIlIlIIl[174] = 0x40 ^ 0x27 ^ (0x1C ^ 0x2D);
        X.lIIlIlIIl[175] = 0x74 ^ 0x23;
        X.lIIlIlIIl[176] = 0x1E ^ 0x4F ^ (3 ^ 0xB);
        X.lIIlIlIIl[177] = 0x1C ^ 0x39 ^ 18 + 105 - 115 + 119;
        X.lIIlIlIIl[178] = 0x34 ^ 0x6F;
        X.lIIlIlIIl[179] = 177 + 196 - 357 + 211 ^ 76 + 174 - 154 + 95;
        X.lIIlIlIIl[180] = 9 ^ 0x73 ^ (0xAA ^ 0x8D);
        X.lIIlIlIIl[181] = 0xE4 ^ 0xBB;
        X.lIIlIlIIl[182] = 0x21 ^ 0x47 ^ (0x68 ^ 0x6E);
        X.lIIlIlIIl[183] = 0x3B ^ 0x5A;
        X.lIIlIlIIl[184] = 211 + 148 - 170 + 26 ^ 87 + 93 - 83 + 84;
        X.lIIlIlIIl[185] = 53 + 130 - 23 + 63 ^ 8 + 79 - 10 + 111;
        X.lIIlIlIIl[186] = 0x53 ^ 0x37;
        X.lIIlIlIIl[187] = 0x5D ^ 0x38;
        X.lIIlIlIIl[188] = 0x31 ^ 0x57;
        X.lIIlIlIIl[189] = -(0xFFFFFFCB & 0x53B5) & (0xFFFFDFF7 & Short.MAX_VALUE);
        X.lIIlIlIIl[190] = 0xFFFFCFD7 & 0x3D7E;
        X.lIIlIlIIl[191] = -(0xFFFFDBF9 & 0x7797) & (0xFFFFFFFE & 0x5FFF);
        X.lIIlIlIIl[192] = 0xFFFF8FFB & 0x7D3F;
        X.lIIlIlIIl[193] = -(0x67 ^ 0x60) & (0xFFFFEE7F & 0x3FCF);
        X.lIIlIlIIl[194] = 0x2A ^ 0x18 ^ (0xA ^ 0x5F);
        X.lIIlIlIIl[195] = 0xFFFF977C & 0x7DFF;
        X.lIIlIlIIl[196] = 0xFFFFFBBB & 0x65EC;
        X.lIIlIlIIl[197] = 0xFFFFB3DF & 0x4FA4;
        X.lIIlIlIIl[198] = -(0xFFFFFBDB & 0x2C6E) & (0xFFFFBFFF & 0x6BFF);
        X.lIIlIlIIl[199] = -(0xFFFFDBFD & 0x7C63) & (0xFFFFDFFF & 0x7FFE);
        X.lIIlIlIIl[200] = -(0xFFFFF19D & 0x1E6B) & (0xFFFFF7FF & 0x3AFE);
        X.lIIlIlIIl[201] = -(0xFFFFE056 & 0x5FBF) & (0xFFFFEFFF & 0x7EDF);
        X.lIIlIlIIl[202] = -(0xFFFFE285 & 0x1FFB) & (0xFFFFEFFF & 0x77DE);
        X.lIIlIlIIl[203] = 0x37 ^ 0x5F;
        X.lIIlIlIIl[204] = 0x68 ^ 1;
        X.lIIlIlIIl[205] = 0xCF ^ 0xBB ^ (0x33 ^ 0x2D);
        X.lIIlIlIIl[206] = 0x2A ^ 0x41;
        X.lIIlIlIIl[207] = 61 + 152 - 116 + 143 ^ 128 + 40 - 29 + 17;
        X.lIIlIlIIl[208] = 0x44 ^ 0xB ^ (0x26 ^ 4);
        X.lIIlIlIIl[209] = -(0xFFFFF731 & 0x69FF) & (0xFFFFFBFF & 0x6FBF);
        X.lIIlIlIIl[210] = -(0xFFFFCF2F & 0x32F5) & (0xFFFFCFAF & 0x3FFD);
        X.lIIlIlIIl[211] = 0x69 ^ 7;
        X.lIIlIlIIl[212] = 0xFFFFFD9F & 0xFED;
        X.lIIlIlIIl[213] = 0xC5 ^ 0xAA;
        X.lIIlIlIIl[214] = 0xFFFF9FB7 & 0x6ADF;
        X.lIIlIlIIl[215] = 0xFFFFDFBE & 0x2DD5;
        X.lIIlIlIIl[216] = 0x69 ^ 0x19;
        X.lIIlIlIIl[217] = -(0xFFFFFFEA & 0x7537) & (0xFFFFFFF7 & 0x7FBF);
        X.lIIlIlIIl[218] = 0x2A ^ 0x5B;
        X.lIIlIlIIl[219] = -(0xFFFFF7FF & 0xC5F) & (0xFFFFDEFF & 0x2FFF);
        X.lIIlIlIIl[220] = -(0x45 ^ 0x5E) & (0xFFFFEFBF & 0x1DFF);
        X.lIIlIlIIl[221] = 0xC6 ^ 0xB4;
        X.lIIlIlIIl[222] = -(0xFFFFFC6F & 0x73D9) & (0xFFFFFDFE & Short.MAX_VALUE);
        X.lIIlIlIIl[223] = -(0xFFFFF2AF & 0x7D53) & (0xFFFFFDFF & 0x7F9E);
        X.lIIlIlIIl[224] = 0x92 ^ 0xB5 ^ (0x3D ^ 0x69);
        X.lIIlIlIIl[225] = 0xFFFFADAF & 0x5FFF;
        X.lIIlIlIIl[226] = 24 + 172 - 99 + 141 ^ 100 + 33 - -18 + 3;
        X.lIIlIlIIl[227] = 0x26 ^ 0x53;
        X.lIIlIlIIl[228] = 0xFFFFFDD7 & 0xFBE;
        X.lIIlIlIIl[229] = -(0xFFFFE899 & 0x7777) & (0xFFFFEFB7 & 0x7DFC);
        X.lIIlIlIIl[230] = 0x72 ^ 0xF ^ (0x66 ^ 0x6D);
        X.lIIlIlIIl[231] = 0xFFFFDFBB & 0x2DEF;
        X.lIIlIlIIl[232] = 0x72 ^ 5;
        X.lIIlIlIIl[233] = 0x42 ^ 0x23 ^ (0x62 ^ 0x7B);
        X.lIIlIlIIl[234] = 0xFFFFCFBD & 0x3DF3;
        X.lIIlIlIIl[235] = -(0xC8 ^ 0x8B) & (0xFFFFCDF6 & 0x3BEF);
        X.lIIlIlIIl[236] = -(0xFFFFBDFF & 0x6645) & (0xFFFFBFFF & 0x6DEE);
        X.lIIlIlIIl[237] = 0xFFFFADED & 0x5F7F;
        X.lIIlIlIIl[238] = 0xF9 ^ 0x80;
    }

    private static boolean llllIlllIII(int n2) {
        return n2 != 0;
    }

    private static boolean llllIlllIIl(int n2, int n3) {
        return n2 < n3;
    }

    public static void af() {
        d lIIIIllIlllIlII;
        block18: {
            block17: {
                block16: {
                    block15: {
                        int[] nArray = new int[lIIlIlIIl[1]];
                        nArray[X.lIIlIlIIl[0]] = lIIlIlIIl[16];
                        if (X.llllIlllIlI(Bank.contains((int[])nArray) ? 1 : 0)) {
                            d d2 = new d(lIIlIlIIl[16], lIIlIlIIl[1], lIIlIlIIl[195]);
                            bv.add(d2);
                            0;
                        }
                        int[] nArray2 = new int[lIIlIlIIl[1]];
                        nArray2[X.lIIlIlIIl[0]] = lIIlIlIIl[18];
                        if (X.llllIlllIlI(Bank.contains((int[])nArray2) ? 1 : 0)) {
                            lIIIIllIlllIlII = new d(lIIlIlIIl[18], lIIlIlIIl[3], lIIlIlIIl[196]);
                            bv.add(lIIIIllIlllIlII);
                            0;
                        }
                        int[] nArray3 = new int[lIIlIlIIl[1]];
                        nArray3[X.lIIlIlIIl[0]] = lIIlIlIIl[28];
                        if (X.llllIlllIlI(Bank.contains((int[])nArray3) ? 1 : 0)) {
                            lIIIIllIlllIlII = new d(lIIlIlIIl[28], lIIlIlIIl[3], lIIlIlIIl[196]);
                            bv.add(lIIIIllIlllIlII);
                            0;
                        }
                        int[] nArray4 = new int[lIIlIlIIl[1]];
                        nArray4[X.lIIlIlIIl[0]] = lIIlIlIIl[13];
                        if (X.llllIlllIlI(Bank.contains((int[])nArray4) ? 1 : 0)) {
                            lIIIIllIlllIlII = new d(lIIlIlIIl[13], lIIlIlIIl[12], lIIlIlIIl[197]);
                            bv.add(lIIIIllIlllIlII);
                            0;
                        }
                        int[] nArray5 = new int[lIIlIlIIl[1]];
                        nArray5[X.lIIlIlIIl[0]] = lIIlIlIIl[22];
                        if (X.llllIlllIlI(Bank.contains((int[])nArray5) ? 1 : 0)) {
                            lIIIIllIlllIlII = new d(lIIlIlIIl[22], lIIlIlIIl[12], lIIlIlIIl[198]);
                            bv.add(lIIIIllIlllIlII);
                            0;
                        }
                        int[] nArray6 = new int[lIIlIlIIl[1]];
                        nArray6[X.lIIlIlIIl[0]] = lIIlIlIIl[15];
                        if (X.llllIlllIlI(Bank.contains((int[])nArray6) ? 1 : 0)) {
                            lIIIIllIlllIlII = new d(lIIlIlIIl[15], lIIlIlIIl[12], lIIlIlIIl[198]);
                            bv.add(lIIIIllIlllIlII);
                            0;
                        }
                        int[] nArray7 = new int[lIIlIlIIl[1]];
                        nArray7[X.lIIlIlIIl[0]] = lIIlIlIIl[14];
                        if (X.llllIlllIlI(Bank.contains((int[])nArray7) ? 1 : 0)) {
                            lIIIIllIlllIlII = new d(lIIlIlIIl[14], lIIlIlIIl[12], lIIlIlIIl[198]);
                            bv.add(lIIIIllIlllIlII);
                            0;
                        }
                        int[] nArray8 = new int[lIIlIlIIl[1]];
                        nArray8[X.lIIlIlIIl[0]] = lIIlIlIIl[24];
                        if (!X.llllIlllIII(Bank.contains((int[])nArray8) ? 1 : 0)) break block15;
                        int[] nArray9 = new int[lIIlIlIIl[1]];
                        nArray9[X.lIIlIlIIl[0]] = lIIlIlIIl[24];
                        if (!X.llllIlllIII(Bank.contains((int[])nArray9) ? 1 : 0)) break block16;
                        int[] nArray10 = new int[lIIlIlIIl[1]];
                        nArray10[X.lIIlIlIIl[0]] = lIIlIlIIl[24];
                        if (!X.llllIlllIIl(Bank.getFirst((int[])nArray10).getQuantity(), lIIlIlIIl[12])) break block16;
                    }
                    lIIIIllIlllIlII = new d(ky, lIIlIlIIl[45], lIIlIlIIl[199]);
                    bv.add(lIIIIllIlllIlII);
                    0;
                }
                int[] nArray = new int[lIIlIlIIl[1]];
                nArray[X.lIIlIlIIl[0]] = lIIlIlIIl[26];
                if (!X.llllIlllIII(Bank.contains((int[])nArray) ? 1 : 0)) break block17;
                int[] nArray11 = new int[lIIlIlIIl[1]];
                nArray11[X.lIIlIlIIl[0]] = lIIlIlIIl[26];
                if (!X.llllIlllIII(Bank.contains((int[])nArray11) ? 1 : 0)) break block18;
                int[] nArray12 = new int[lIIlIlIIl[1]];
                nArray12[X.lIIlIlIIl[0]] = lIIlIlIIl[26];
                if (!X.llllIlllIIl(Bank.getFirst((int[])nArray12).getQuantity(), lIIlIlIIl[12])) break block18;
            }
            lIIIIllIlllIlII = new d(lIIlIlIIl[26], lIIlIlIIl[12], lIIlIlIIl[200]);
            bv.add(lIIIIllIlllIlII);
            0;
        }
        int[] nArray = new int[lIIlIlIIl[1]];
        nArray[X.lIIlIlIIl[0]] = lIIlIlIIl[201];
        if (X.llllIlllIlI(Bank.contains((int[])nArray) ? 1 : 0)) {
            lIIIIllIlllIlII = new d(lIIlIlIIl[201], lIIlIlIIl[1], lIIlIlIIl[202]);
            bv.add(lIIIIllIlllIlII);
            0;
        }
        int[] nArray13 = new int[lIIlIlIIl[1]];
        nArray13[X.lIIlIlIIl[0]] = lIIlIlIIl[20];
        if (X.llllIlllIlI(Bank.contains((int[])nArray13) ? 1 : 0)) {
            lIIIIllIlllIlII = new d(lIIlIlIIl[20], lIIlIlIIl[41], i.bq);
            bv.add(lIIIIllIlllIlII);
            0;
        }
    }

    @Override
    public int T() {
        try {
            X.dg();
            0;
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (-1 >= 1) {
            return (0x63 ^ 0xA ^ (0x73 ^ 0x3A)) & (0x9C ^ 0xAC ^ (0x8A ^ 0x9A) ^ -1);
        }
        return lIIlIlIIl[186];
    }

    private static boolean llllIlllIlI(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    private static void dj() {
        void lIIIIllllIIIIIl;
        void lIIIIllllIIlIIl;
        void lIIIIllllIIlIlI;
        void lIIIIllllIIlIll;
        void lIIIIllllIIllII;
        WorldArea worldArea = new WorldArea(lIIlIlIIl[125], lIIlIlIIl[126], lIIlIlIIl[112], lIIlIlIIl[108], lIIlIlIIl[0]);
        WorldArea worldArea2 = new WorldArea(lIIlIlIIl[125], lIIlIlIIl[126], lIIlIlIIl[112], lIIlIlIIl[108], lIIlIlIIl[1]);
        WorldArea worldArea3 = new WorldArea(lIIlIlIIl[125], lIIlIlIIl[126], lIIlIlIIl[112], lIIlIlIIl[108], lIIlIlIIl[3]);
        WorldArea worldArea4 = new WorldArea(lIIlIlIIl[125], lIIlIlIIl[126], lIIlIlIIl[112], lIIlIlIIl[108], lIIlIlIIl[10]);
        WorldArea worldArea5 = new WorldArea(lIIlIlIIl[127], lIIlIlIIl[128], lIIlIlIIl[50], lIIlIlIIl[12], lIIlIlIIl[3]);
        WorldArea worldArea6 = new WorldArea(lIIlIlIIl[129], lIIlIlIIl[127], lIIlIlIIl[50], lIIlIlIIl[25], lIIlIlIIl[3]);
        WorldArea worldArea7 = new WorldArea(lIIlIlIIl[130], lIIlIlIIl[131], lIIlIlIIl[64], lIIlIlIIl[50], lIIlIlIIl[3]);
        WorldArea worldArea8 = new WorldArea(lIIlIlIIl[132], lIIlIlIIl[133], lIIlIlIIl[12], lIIlIlIIl[65], lIIlIlIIl[10]);
        WorldArea worldArea9 = new WorldArea(lIIlIlIIl[134], lIIlIlIIl[9], lIIlIlIIl[50], lIIlIlIIl[27], lIIlIlIIl[3]);
        WorldArea worldArea10 = new WorldArea(lIIlIlIIl[135], lIIlIlIIl[136], lIIlIlIIl[69], lIIlIlIIl[54], lIIlIlIIl[10]);
        WorldArea worldArea11 = new WorldArea(lIIlIlIIl[137], lIIlIlIIl[138], lIIlIlIIl[64], lIIlIlIIl[65], lIIlIlIIl[3]);
        WorldPoint worldPoint = new WorldPoint(lIIlIlIIl[137], lIIlIlIIl[139], lIIlIlIIl[0]);
        if (X.llllIlllIII(Dialog.isOpen() ? 1 : 0)) {
            Dialog.close();
        }
        if (X.llllIlllIlI(lIIIIllllIIllII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && X.llllIlllIlI(lIIIIllllIIlIll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && X.llllIlllIlI(lIIIIllllIIlIlI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && X.llllIlllIlI(lIIIIllllIIlIIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderEasyClues.c = lIIlIIllI[lIIlIlIIl[140]];
            Movement.walkTo((WorldPoint)lIIIIllllIIIIIl);
            0;
            Time.sleepTicks((int)lIIlIlIIl[1]);
            0;
        }
        if (X.llllIlllIII(lIIIIllllIIllII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (X.llllIllllII(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lIIIIllllIIIIIl), lIIlIlIIl[21])) {
                AccBuilderEasyClues.c = lIIlIIllI[lIIlIlIIl[6]];
                Movement.walkTo((WorldPoint)lIIIIllllIIIIIl);
                0;
                Time.sleepTicks((int)lIIlIlIIl[1]);
                0;
            }
            if (X.lllllIIIIII(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lIIIIllllIIIIIl), lIIlIlIIl[21])) {
                AccBuilderEasyClues.c = lIIlIIllI[lIIlIlIIl[141]];
                int lIIIIllllIIIIII = Skills.getExperience((Skill)Skill.AGILITY);
                String[] stringArray = new String[lIIlIlIIl[1]];
                stringArray[X.lIIlIlIIl[0]] = lIIlIIllI[lIIlIlIIl[142]];
                TileObjects.getNearest((String[])stringArray).interact(lIIlIIllI[lIIlIlIIl[143]]);
                Time.sleepTicks((int)e.c(lIIlIlIIl[1], lIIlIlIIl[3]));
                0;
                Time.sleepUntil(() -> {
                    boolean bl;
                    if (X.llllIllllII(Skills.getExperience((Skill)Skill.AGILITY), lIIIIllllIIIIII)) {
                        bl = lIIlIlIIl[1];
                        0;
                        if (1 != 1) {
                            return false;
                        }
                    } else {
                        bl = lIIlIlIIl[0];
                    }
                    return bl;
                }, (int)lIIlIlIIl[105]);
                0;
                Time.sleepTicks((int)lIIlIlIIl[1]);
                0;
            }
        }
        String[] stringArray = new String[lIIlIlIIl[1]];
        stringArray[X.lIIlIlIIl[0]] = lIIlIIllI[lIIlIlIIl[144]];
        TileItem lIIIIllllIIIIII = TileItems.getNearest((String[])stringArray);
        if (X.llllIlllIll(lIIIIllllIIIIII) && X.llllIlllIII(X.dl() ? 1 : 0)) {
            AccBuilderEasyClues.c = lIIlIIllI[lIIlIlIIl[145]];
            System.out.println(lIIlIIllI[lIIlIlIIl[146]]);
            lIIIIllllIIIIII.interact(lIIlIIllI[lIIlIlIIl[147]]);
            Time.sleepTicks((int)lIIlIlIIl[10]);
            0;
        }
        if (X.llllIlllIlI(X.dl() ? 1 : 0)) {
            void lIIIIllllIIIIlI;
            void lIIIIllllIIIIll;
            void lIIIIllllIIIlII;
            void lIIIIllllIIIlIl;
            void lIIIIllllIIIllI;
            void lIIIIllllIIIlll;
            int lIIIIlllIlllllI;
            TileObject lIIIIlllIllllll;
            void lIIIIllllIIlIII;
            if (X.llllIlllIII(lIIIIllllIIlIII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && X.llllIlllIll(lIIIIlllIllllll = TileObjects.getNearest(tileObject -> {
                int n2;
                if (X.llllIlllIII(tileObject.getName().contains(lIIlIIllI[lIIlIlIIl[233]]) ? 1 : 0) && X.lllllIIIIII(tileObject.getWorldLocation().distanceTo(new WorldPoint(lIIlIlIIl[234], lIIlIlIIl[131], lIIlIlIIl[3])), lIIlIlIIl[3])) {
                    n2 = lIIlIlIIl[1];
                    0;
                    if (2 != 2) {
                        return false;
                    }
                } else {
                    n2 = lIIlIlIIl[0];
                }
                return n2 != 0;
            }))) {
                lIIIIlllIlllllI = Skills.getExperience((Skill)Skill.AGILITY);
                AccBuilderEasyClues.c = lIIlIIllI[lIIlIlIIl[148]];
                lIIIIlllIllllll.interact(lIIlIIllI[lIIlIlIIl[149]]);
                Time.sleepTicks((int)e.c(lIIlIlIIl[1], lIIlIlIIl[3]));
                0;
                Time.sleepUntil(() -> {
                    boolean bl;
                    if (X.llllIllllII(Skills.getExperience((Skill)Skill.AGILITY), lIIIIlllIlllllI)) {
                        bl = lIIlIlIIl[1];
                        0;
                        
                        }
                    } else {
                        bl = lIIlIlIIl[0];
                    }
                    return bl;
                }, (int)lIIlIlIIl[105]);
                0;
                Time.sleepTicks((int)lIIlIlIIl[1]);
                0;
            }
            if (X.llllIlllIII(X.dl() ? 1 : 0)) {
                return;
            }
            if (X.llllIlllIII(lIIIIllllIIIlll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && X.llllIlllIll(lIIIIlllIllllll = TileObjects.getNearest(tileObject -> {
                int n2;
                if (X.llllIlllIII(tileObject.getName().contains(lIIlIIllI[lIIlIlIIl[232]]) ? 1 : 0) && X.lllllIIIIII(tileObject.getWorldLocation().distanceTo(new WorldPoint(lIIlIlIIl[131], lIIlIlIIl[225], lIIlIlIIl[3])), lIIlIlIIl[3])) {
                    n2 = lIIlIlIIl[1];
                    0;
                    if ((0x94 ^ 0x90) != (0x5F ^ 0x5B)) {
                        return false;
                    }
                } else {
                    n2 = lIIlIlIIl[0];
                }
                return n2 != 0;
            }))) {
                AccBuilderEasyClues.c = lIIlIIllI[lIIlIlIIl[150]];
                lIIIIlllIlllllI = Skills.getExperience((Skill)Skill.AGILITY);
                lIIIIlllIllllll.interact(lIIlIIllI[lIIlIlIIl[151]]);
                Time.sleepTicks((int)e.c(lIIlIlIIl[1], lIIlIlIIl[3]));
                0;
                Time.sleepUntil(() -> {
                    boolean bl;
                    if (X.llllIllllII(Skills.getExperience((Skill)Skill.AGILITY), lIIIIlllIlllllI)) {
                        bl = lIIlIlIIl[1];
                        0;
                        if (3 <= 0) {
                            return ((143 + 101 - 238 + 169 ^ 102 + 1 - 5 + 59) & (0x67 ^ 0x69 ^ (0x41 ^ 0x7D) ^ -1)) != 0;
                        }
                    } else {
                        bl = lIIlIlIIl[0];
                    }
                    return bl;
                }, (int)lIIlIlIIl[105]);
                0;
                Time.sleepTicks((int)lIIlIlIIl[1]);
                0;
            }
            if (X.llllIlllIII(X.dl() ? 1 : 0)) {
                return;
            }
            if (X.llllIlllIII(lIIIIllllIIIllI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && X.llllIlllIll(lIIIIlllIllllll = TileObjects.getNearest(tileObject -> {
                int n2;
                if (X.llllIlllIII(tileObject.getName().contains(lIIlIIllI[lIIlIlIIl[230]]) ? 1 : 0) && X.lllllIIIIII(tileObject.getWorldLocation().distanceTo(new WorldPoint(lIIlIlIIl[139], lIIlIlIIl[231], lIIlIlIIl[3])), lIIlIlIIl[3])) {
                    n2 = lIIlIlIIl[1];
                    0;
                    if (((0x30 ^ 0x5C ^ (0x55 ^ 0x73)) & (194 + 165 - 168 + 56 ^ 141 + 73 - 151 + 126 ^ -1)) == (0xFE ^ 0xA4 ^ (0xC5 ^ 0x9B))) {
                        return ((0x89 ^ 0xA7 ^ (0x62 ^ 0x59)) & (15 + 62 - -86 + 46 ^ 167 + 116 - 92 + 5 ^ -1)) != 0;
                    }
                } else {
                    n2 = lIIlIlIIl[0];
                }
                return n2 != 0;
            }))) {
                AccBuilderEasyClues.c = lIIlIIllI[lIIlIlIIl[152]];
                lIIIIlllIlllllI = Skills.getExperience((Skill)Skill.AGILITY);
                lIIIIlllIllllll.interact(lIIlIIllI[lIIlIlIIl[153]]);
                Time.sleepTicks((int)e.c(lIIlIlIIl[1], lIIlIlIIl[3]));
                0;
                Time.sleepUntil(() -> {
                    boolean bl;
                    if (X.llllIllllII(Skills.getExperience((Skill)Skill.AGILITY), lIIIIlllIlllllI)) {
                        bl = lIIlIlIIl[1];
                        0;
                        if (3 <= 1) {
                            return false;
                        }
                    } else {
                        bl = lIIlIlIIl[0];
                    }
                    return bl;
                }, (int)lIIlIlIIl[105]);
                0;
                Time.sleepTicks((int)lIIlIlIIl[1]);
                0;
            }
            if (X.llllIlllIII(X.dl() ? 1 : 0)) {
                return;
            }
            if (X.llllIlllIII(lIIIIllllIIIlIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && X.llllIlllIll(lIIIIlllIllllll = TileObjects.getNearest(tileObject -> {
                int n2;
                if (X.llllIlllIII(tileObject.getName().contains(lIIlIIllI[lIIlIlIIl[227]]) ? 1 : 0) && X.lllllIIIIII(tileObject.getWorldLocation().distanceTo(new WorldPoint(lIIlIlIIl[228], lIIlIlIIl[229], lIIlIlIIl[10])), lIIlIlIIl[3])) {
                    n2 = lIIlIlIIl[1];
                    0;
                    if (2 == 0) {
                        return false;
                    }
                } else {
                    n2 = lIIlIlIIl[0];
                }
                return n2 != 0;
            }))) {
                AccBuilderEasyClues.c = lIIlIIllI[lIIlIlIIl[154]];
                lIIIIlllIlllllI = Skills.getExperience((Skill)Skill.AGILITY);
                lIIIIlllIllllll.interact(lIIlIIllI[lIIlIlIIl[155]]);
                Time.sleepTicks((int)e.c(lIIlIlIIl[1], lIIlIlIIl[3]));
                0;
                Time.sleepUntil(() -> {
                    boolean bl;
                    if (X.llllIllllII(Skills.getExperience((Skill)Skill.AGILITY), lIIIIlllIlllllI)) {
                        bl = lIIlIlIIl[1];
                        0;
                        if (-3 > 0) {
                            return ((0x4F ^ 0x6A ^ (0x74 ^ 0xA)) & (77 + 165 - 234 + 189 ^ 22 + 107 - 119 + 148 ^ -1)) != 0;
                        }
                    } else {
                        bl = lIIlIlIIl[0];
                    }
                    return bl;
                }, (int)lIIlIlIIl[105]);
                0;
                Time.sleepTicks((int)lIIlIlIIl[1]);
                0;
            }
            if (X.llllIlllIII(X.dl() ? 1 : 0)) {
                return;
            }
            if (X.llllIlllIII(lIIIIllllIIIlII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && X.llllIlllIll(lIIIIlllIllllll = TileObjects.getNearest(tileObject -> {
                int n2;
                if (X.llllIlllIII(tileObject.getName().contains(lIIlIIllI[lIIlIlIIl[226]]) ? 1 : 0) && X.lllllIIIIII(tileObject.getWorldLocation().distanceTo(new WorldPoint(lIIlIlIIl[9], lIIlIlIIl[130], lIIlIlIIl[3])), lIIlIlIIl[3])) {
                    n2 = lIIlIlIIl[1];
                    0;
                    if (2 <= ((0x63 ^ 0x75) & ~(0 ^ 0x16))) {
                        return false;
                    }
                } else {
                    n2 = lIIlIlIIl[0];
                }
                return n2 != 0;
            }))) {
                AccBuilderEasyClues.c = lIIlIIllI[lIIlIlIIl[156]];
                lIIIIlllIlllllI = Skills.getExperience((Skill)Skill.AGILITY);
                lIIIIlllIllllll.interact(lIIlIIllI[lIIlIlIIl[157]]);
                Time.sleepTicks((int)e.c(lIIlIlIIl[1], lIIlIlIIl[3]));
                0;
                Time.sleepUntil(() -> {
                    boolean bl;
                    if (X.llllIllllII(Skills.getExperience((Skill)Skill.AGILITY), lIIIIlllIlllllI)) {
                        bl = lIIlIlIIl[1];
                        0;
                        if (-3 >= 0) {
                            return false;
                        }
                    } else {
                        bl = lIIlIlIIl[0];
                    }
                    return bl;
                }, (int)lIIlIlIIl[105]);
                0;
                Time.sleepTicks((int)lIIlIlIIl[1]);
                0;
            }
            if (X.llllIlllIII(X.dl() ? 1 : 0)) {
                return;
            }
            if (X.llllIlllIII(lIIIIllllIIIIll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && X.llllIlllIll(lIIIIlllIllllll = TileObjects.getNearest(tileObject -> {
                int n2;
                if (X.llllIlllIII(tileObject.getName().contains(lIIlIIllI[lIIlIlIIl[224]]) ? 1 : 0) && X.lllllIIIIII(tileObject.getWorldLocation().distanceTo(new WorldPoint(lIIlIlIIl[225], lIIlIlIIl[215], lIIlIlIIl[10])), lIIlIlIIl[3])) {
                    n2 = lIIlIlIIl[1];
                    0;
                    if ((48 + 106 - 23 + 35 ^ 70 + 141 - 117 + 68) < 0) {
                        return ((0xA5 ^ 0xB7 ^ (0x4A ^ 0x40)) & (0xB ^ 0x33 ^ (0x14 ^ 0x34) ^ -1)) != 0;
                    }
                } else {
                    n2 = lIIlIlIIl[0];
                }
                return n2 != 0;
            }))) {
                AccBuilderEasyClues.c = lIIlIIllI[lIIlIlIIl[158]];
                lIIIIlllIlllllI = Skills.getExperience((Skill)Skill.AGILITY);
                lIIIIlllIllllll.interact(lIIlIIllI[lIIlIlIIl[159]]);
                Time.sleepTicks((int)e.c(lIIlIlIIl[1], lIIlIlIIl[3]));
                0;
                Time.sleepUntil(() -> {
                    boolean bl;
                    if (X.llllIllllII(Skills.getExperience((Skill)Skill.AGILITY), lIIIIlllIlllllI)) {
                        bl = lIIlIlIIl[1];
                        0;
                        if (((0xA4 ^ 0x80) & ~(0x48 ^ 0x6C)) <= -1) {
                            return false;
                        }
                    } else {
                        bl = lIIlIlIIl[0];
                    }
                    return bl;
                }, (int)lIIlIlIIl[105]);
                0;
                Time.sleepTicks((int)lIIlIlIIl[1]);
                0;
            }
            if (X.llllIlllIII(X.dl() ? 1 : 0)) {
                return;
            }
            if (X.llllIlllIII(lIIIIllllIIIIlI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && X.llllIlllIll(lIIIIlllIllllll = TileObjects.getNearest(tileObject -> {
                int n2;
                if (X.llllIlllIII(tileObject.getName().contains(lIIlIIllI[lIIlIlIIl[221]]) ? 1 : 0) && X.lllllIIIIII(tileObject.getWorldLocation().distanceTo(new WorldPoint(lIIlIlIIl[222], lIIlIlIIl[223], lIIlIlIIl[3])), lIIlIlIIl[3])) {
                    n2 = lIIlIlIIl[1];
                    0;
                    if (-2 > 0) {
                        return false;
                    }
                } else {
                    n2 = lIIlIlIIl[0];
                }
                return n2 != 0;
            }))) {
                AccBuilderEasyClues.c = lIIlIIllI[lIIlIlIIl[160]];
                lIIIIlllIlllllI = Skills.getExperience((Skill)Skill.AGILITY);
                lIIIIlllIllllll.interact(lIIlIIllI[lIIlIlIIl[161]]);
                Time.sleepTicks((int)e.c(lIIlIlIIl[1], lIIlIlIIl[3]));
                0;
                Time.sleepUntil(() -> {
                    boolean bl;
                    if (X.llllIllllII(Skills.getExperience((Skill)Skill.AGILITY), lIIIIlllIlllllI)) {
                        bl = lIIlIlIIl[1];
                        0;
                        if (((0xB ^ 0x52 ^ (0x58 ^ 0x5E)) & (148 + 124 - 270 + 235 ^ 108 + 43 - 88 + 115 ^ -1)) > 3) {
                            return ((0xFA ^ 0xB4 ^ (0x1E ^ 0x33)) & (0x49 ^ 0x5E ^ (0x2D ^ 0x59) ^ -1)) != 0;
                        }
                    } else {
                        bl = lIIlIlIIl[0];
                    }
                    return bl;
                }, (int)lIIlIlIIl[105]);
                0;
                Time.sleepTicks((int)lIIlIlIIl[1]);
                0;
            }
        }
    }

    public static void dg() {
        if (X.llllIlllIII(bt ? 1 : 0)) {
            AccBuilderEasyClues.c = lIIlIIllI[lIIlIlIIl[0]];
            b.a(bv);
            if (X.llllIlllIIl(bv.size(), lIIlIlIIl[1])) {
                System.out.println(lIIlIIllI[lIIlIlIIl[1]]);
                bt = lIIlIlIIl[0];
            }
        }
        if (X.llllIlllIlI(bt ? 1 : 0) && X.llllIlllIIl(Skills.getLevel((Skill)Skill.AGILITY), lIIlIlIIl[2])) {
            if (X.llllIlllIlI(X.ab() ? 1 : 0)) {
                BankLocation lIIIlIIIIIIlIlI = BankLocation.getNearest();
                if (X.llllIlllIll(lIIIlIIIIIIlIlI) && X.llllIlllIlI(lIIIlIIIIIIlIlI.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIIlIIllI[lIIlIlIIl[3]];
                    WorldArea lIIIlIIIIIIlIIl = new WorldArea(lIIlIlIIl[4], lIIlIlIIl[5], lIIlIlIIl[6], lIIlIlIIl[7], lIIlIlIIl[0]);
                    if (X.llllIlllIII(lIIIlIIIIIIlIIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        WorldPoint lIIIlIIIIIIlIII = new WorldPoint(lIIlIlIIl[8], lIIlIlIIl[9], lIIlIlIIl[0]);
                        if (X.llllIllllII(Players.getLocal().getWorldLocation().distanceTo(lIIIlIIIIIIlIII), lIIlIlIIl[10])) {
                            Movement.walkTo((WorldPoint)lIIIlIIIIIIlIII);
                            0;
                            Time.sleepTicks((int)lIIlIlIIl[1]);
                            0;
                        }
                    }
                    a.a(lIIIlIIIIIIlIlI);
                }
                if (X.llllIlllIll(lIIIlIIIIIIlIlI) && X.llllIlllIII(lIIIlIIIIIIlIlI.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIIlIIllI[lIIlIlIIl[10]];
                    if (X.llllIlllIlI(Bank.isOpen() ? 1 : 0)) {
                        a.a();
                        Time.sleepUntil(() -> Bank.isOpen(), (int)lIIlIlIIl[11]);
                        0;
                    }
                    if (X.llllIlllIII(Bank.isOpen() ? 1 : 0)) {
                        if (X.llllIllllIl(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks((int)lIIlIlIIl[1]);
                            0;
                        }
                        if (X.llllIllllIl(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks((int)lIIlIlIIl[3]);
                            0;
                        }
                    }
                    int[] nArray = new int[lIIlIlIIl[12]];
                    nArray[X.lIIlIlIIl[0]] = lIIlIlIIl[13];
                    nArray[X.lIIlIlIIl[1]] = lIIlIlIIl[14];
                    nArray[X.lIIlIlIIl[3]] = lIIlIlIIl[15];
                    nArray[X.lIIlIlIIl[10]] = lIIlIlIIl[16];
                    nArray[X.lIIlIlIIl[17]] = lIIlIlIIl[18];
                    nArray[X.lIIlIlIIl[19]] = lIIlIlIIl[20];
                    nArray[X.lIIlIlIIl[21]] = lIIlIlIIl[22];
                    nArray[X.lIIlIlIIl[23]] = lIIlIlIIl[24];
                    nArray[X.lIIlIlIIl[25]] = lIIlIlIIl[26];
                    nArray[X.lIIlIlIIl[27]] = lIIlIlIIl[28];
                    if (X.llllIlllIlI(e.b(nArray) ? 1 : 0)) {
                        X.af();
                        System.out.println(lIIlIIllI[lIIlIlIIl[17]]);
                        bt = lIIlIlIIl[1];
                        return;
                    }
                    int[] nArray2 = new int[lIIlIlIIl[12]];
                    nArray2[X.lIIlIlIIl[0]] = lIIlIlIIl[13];
                    nArray2[X.lIIlIlIIl[1]] = lIIlIlIIl[14];
                    nArray2[X.lIIlIlIIl[3]] = lIIlIlIIl[15];
                    nArray2[X.lIIlIlIIl[10]] = lIIlIlIIl[16];
                    nArray2[X.lIIlIlIIl[17]] = lIIlIlIIl[18];
                    nArray2[X.lIIlIlIIl[19]] = lIIlIlIIl[20];
                    nArray2[X.lIIlIlIIl[21]] = lIIlIlIIl[22];
                    nArray2[X.lIIlIlIIl[23]] = lIIlIlIIl[24];
                    nArray2[X.lIIlIlIIl[25]] = lIIlIlIIl[26];
                    nArray2[X.lIIlIlIIl[27]] = lIIlIlIIl[28];
                    if (X.llllIlllIII(e.b(nArray2) ? 1 : 0)) {
                        a.a(lIIlIlIIl[29], lIIlIlIIl[1]);
                        a.a(lIIlIlIIl[30], lIIlIlIIl[1]);
                        a.a(lIIlIlIIl[31], lIIlIlIIl[1]);
                        a.a(lIIlIlIIl[32], lIIlIlIIl[1]);
                        a.a(lIIlIlIIl[33], lIIlIlIIl[1]);
                        a.a(lIIlIlIIl[34], lIIlIlIIl[1]);
                        a.a(lIIlIlIIl[35], lIIlIlIIl[1]);
                        int[] nArray3 = new int[lIIlIlIIl[1]];
                        nArray3[X.lIIlIlIIl[0]] = lIIlIlIIl[29];
                        if (X.llllIlllIlI(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                            int[] nArray4 = new int[lIIlIlIIl[1]];
                            nArray4[X.lIIlIlIIl[0]] = lIIlIlIIl[29];
                            if (X.llllIlllIlI(Equipment.contains((int[])nArray4) ? 1 : 0)) {
                                int[] nArray5 = new int[lIIlIlIIl[1]];
                                nArray5[X.lIIlIlIIl[0]] = lIIlIlIIl[29];
                                if (X.llllIlllIlI(Bank.contains((int[])nArray5) ? 1 : 0)) {
                                    a.a(lIIlIlIIl[36], lIIlIlIIl[1]);
                                }
                            }
                        }
                        a.a(lIIlIlIIl[18], lIIlIlIIl[1]);
                        e.l(lIIlIlIIl[29]);
                        e.l(lIIlIlIIl[30]);
                        e.l(lIIlIlIIl[31]);
                        e.l(lIIlIlIIl[32]);
                        e.l(lIIlIlIIl[33]);
                        Time.sleepTicks((int)lIIlIlIIl[1]);
                        0;
                        e.l(lIIlIlIIl[35]);
                        e.l(lIIlIlIIl[37]);
                        e.l(lIIlIlIIl[34]);
                        e.l(lIIlIlIIl[36]);
                        e.l(lIIlIlIIl[18]);
                        Time.sleepTicks((int)lIIlIlIIl[10]);
                        0;
                        if (X.llllIlllIlI(Bank.isOpen() ? 1 : 0)) {
                            a.a();
                            Time.sleepTicks((int)lIIlIlIIl[21]);
                            0;
                        }
                        if (X.llllIlllIII(Bank.isOpen() ? 1 : 0)) {
                            if (X.llllIlllIIl(Skills.getLevel((Skill)Skill.AGILITY), lIIlIlIIl[38])) {
                                a.a(lIIlIlIIl[13], lIIlIlIIl[12]);
                                a.a(lIIlIlIIl[14], lIIlIlIIl[12]);
                                a.a(lIIlIlIIl[22], lIIlIlIIl[12]);
                                a.a(lIIlIlIIl[15], lIIlIlIIl[12]);
                                a.b(f.bf, lIIlIlIIl[1]);
                                a.a(lIIlIlIIl[28], lIIlIlIIl[1]);
                                a.a(lIIlIlIIl[20], lIIlIlIIl[19]);
                                a.a(lIIlIlIIl[24], lIIlIlIIl[39]);
                            }
                            if (X.llllIlllllI(Skills.getLevel((Skill)Skill.AGILITY), lIIlIlIIl[38])) {
                                a.a(lIIlIlIIl[13], lIIlIlIIl[12]);
                                a.a(lIIlIlIIl[22], lIIlIlIIl[12]);
                                a.a(lIIlIlIIl[26], lIIlIlIIl[12]);
                                a.b(f.bf, lIIlIlIIl[1]);
                                a.a(lIIlIlIIl[28], lIIlIlIIl[1]);
                                a.a(lIIlIlIIl[20], lIIlIlIIl[25]);
                                a.a(lIIlIlIIl[24], lIIlIlIIl[12]);
                            }
                        }
                    }
                }
            }
            if (X.llllIlllIII(X.ab() ? 1 : 0)) {
                String[] stringArray = new String[lIIlIlIIl[1]];
                stringArray[X.lIIlIlIIl[0]] = lIIlIIllI[lIIlIlIIl[19]];
                if (X.llllIlllIII(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    String[] stringArray2 = new String[lIIlIlIIl[1]];
                    stringArray2[X.lIIlIlIIl[0]] = lIIlIIllI[lIIlIlIIl[21]];
                    Inventory.getFirst((String[])stringArray2).interact(lIIlIIllI[lIIlIlIIl[23]]);
                }
                if (X.llllIlllIII(Inventory.contains((int[])f.aV) ? 1 : 0) && X.llllIlllIIl(Movement.getRunEnergy(), lIIlIlIIl[40])) {
                    Inventory.getFirst((int[])f.aV).interact(lIIlIIllI[lIIlIlIIl[25]]);
                    Time.sleepTicks((int)lIIlIlIIl[1]);
                    0;
                }
                if (X.llllIllllII(Combat.getMissingHealth(), lIIlIlIIl[41])) {
                    int[] nArray = new int[lIIlIlIIl[1]];
                    nArray[X.lIIlIlIIl[0]] = lIIlIlIIl[24];
                    if (X.llllIlllIII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        int[] nArray6 = new int[lIIlIlIIl[1]];
                        nArray6[X.lIIlIlIIl[0]] = lIIlIlIIl[24];
                        Inventory.getFirst((int[])nArray6).interact(lIIlIIllI[lIIlIlIIl[27]]);
                        Time.sleepTicks((int)lIIlIlIIl[3]);
                        0;
                    }
                }
                if (X.llllIllllII(Movement.getRunEnergy(), lIIlIlIIl[42]) && X.llllIlllIlI(Movement.isRunEnabled() ? 1 : 0)) {
                    Movement.toggleRun();
                }
                if (X.llllIlllIIl(Skills.getLevel((Skill)Skill.AGILITY), lIIlIlIIl[43])) {
                    X.dh();
                }
                if ((!X.llllIlllllI(e.j(lIIlIlIIl[44]), lIIlIlIIl[45]) || X.llllIlllIIl(e.j(lIIlIlIIl[46]), lIIlIlIIl[19])) && X.llllIlllllI(Skills.getLevel((Skill)Skill.AGILITY), lIIlIlIIl[43]) && X.llllIlllIIl(Skills.getLevel((Skill)Skill.AGILITY), lIIlIlIIl[45])) {
                    X.di();
                }
                if (X.llllIlllllI(e.j(lIIlIlIIl[44]), lIIlIlIIl[45]) && X.llllIlllllI(e.j(lIIlIlIIl[46]), lIIlIlIIl[19])) {
                    if (X.llllIlllllI(Skills.getLevel((Skill)Skill.AGILITY), lIIlIlIIl[43]) && X.llllIlllIIl(Skills.getLevel((Skill)Skill.AGILITY), lIIlIlIIl[38])) {
                        X.di();
                    }
                    if (X.llllIlllllI(Skills.getLevel((Skill)Skill.AGILITY), lIIlIlIIl[38]) && X.llllIlllIIl(Skills.getLevel((Skill)Skill.AGILITY), lIIlIlIIl[45])) {
                        X.dj();
                    }
                }
                if (X.llllIlllllI(Skills.getLevel((Skill)Skill.AGILITY), lIIlIlIIl[45])) {
                    X.dk();
                }
            }
        }
    }

    private static boolean llllIllllII(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean llllIllllIl(int n2) {
        return n2 > 0;
    }

    private static String llllIlIIIlI(String lIIIIllIIIIIlll, String lIIIIllIIIIIllI) {
        lIIIIllIIIIIlll = new String(Base64.getDecoder().decode(lIIIIllIIIIIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lIIIIllIIIIIlIl = new StringBuilder();
        char[] lIIIIllIIIIIlII = lIIIIllIIIIIllI.toCharArray();
        int lIIIIllIIIIIIll = lIIlIlIIl[0];
        char[] lIIIIlIllllllIl = lIIIIllIIIIIlll.toCharArray();
        int lIIIIlIllllllII = lIIIIlIllllllIl.length;
        int lIIIIlIlllllIll = lIIlIlIIl[0];
        while (X.llllIlllIIl(lIIIIlIlllllIll, lIIIIlIllllllII)) {
            char lIIIIllIIIIlIII = lIIIIlIllllllIl[lIIIIlIlllllIll];
            lIIIIllIIIIIlIl.append((char)(lIIIIllIIIIlIII ^ lIIIIllIIIIIlII[lIIIIllIIIIIIll % lIIIIllIIIIIlII.length]));
            0;
            ++lIIIIllIIIIIIll;
            ++lIIIIlIlllllIll;
            0;
            if (2 != 1) continue;
            return null;
        }
        return String.valueOf(lIIIIllIIIIIlIl);
    }

    @Override
    public String U() {
        return lIIlIIllI[lIIlIlIIl[203]];
    }
}

