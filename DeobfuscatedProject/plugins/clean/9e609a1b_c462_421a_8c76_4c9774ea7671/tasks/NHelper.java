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
package gg.squire.9e609a1b-c462-421a-8c76-4c9774ea7671.tasks;

import gg.squire.account.AccBuilderRat;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.M;
import gg.squire.9e609a1b-c462-421a-8c76-4c9774ea7671.tasks.AHelper;
import gg.squire.9e609a1b-c462-421a-8c76-4c9774ea7671.tasks.BHelper;
import gg.squire.9e609a1b-c462-421a-8c76-4c9774ea7671.tasks.DHelper;
import gg.squire.9e609a1b-c462-421a-8c76-4c9774ea7671.tasks.EHelper;
import gg.squire.9e609a1b-c462-421a-8c76-4c9774ea7671.tasks.FHelper;
import gg.squire.9e609a1b-c462-421a-8c76-4c9774ea7671.tasks.HHelper;
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

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class NHelper
implements M {
    public static  int if;
    public static  int ie;
    public static  List<d> bA;
    public static  int ig;
    static  WorldArea ij;
    static  WorldArea ih;
    static  WorldArea ii;
    
    public static  boolean by;
    
    private static  WorldPoint ik;

    private static boolean lIlIIllIIlllIIl(int n2, int n3) {
        return n2 <= n3;
    }

    @Override
    public boolean aa() {
        boolean bl;
        if (N.lIlIIllIIllIlll(Skills.getLevel((Skill)Skill.AGILITY), lIIIlllllIllI[18])) {
            bl = lIIIlllllIllI[1];

            if (((0x52 ^ 0x2E ^ (0x19 ^ 0x4A)) & (109 + 109 - 48 + 69 ^ 76 + 21 - -75 + 20 ^ -1)) != 0) {
                return ((57 + 76 - 76 + 76 ^ 40 + 121 - 58 + 63) & (1 ^ 0x5E ^ (0xF9 ^ 0x85) ^ -1)) != 0;
            }
        } else {
            bl = lIIIlllllIllI[0];
        }
        return bl;
    }

    static {
        N.lIlIIllIIllIIII();
        N.lIlIIllIIlIlllI();
        bA = new ArrayList<d>();
        ie = lIIIlllllIllI[27];
        if = lIIIlllllIllI[23];
        ih = new WorldArea(lIIIlllllIllI[235], lIIIlllllIllI[52], lIIIlllllIllI[69], lIIIlllllIllI[72], lIIIlllllIllI[0]);
        ii = new WorldArea(lIIIlllllIllI[235], lIIIlllllIllI[52], lIIIlllllIllI[69], lIIIlllllIllI[72], lIIIlllllIllI[1]);
        ij = new WorldArea(lIIIlllllIllI[235], lIIIlllllIllI[52], lIIIlllllIllI[69], lIIIlllllIllI[72], lIIIlllllIllI[2]);
        ik = new WorldPoint(lIIIlllllIllI[236], lIIIlllllIllI[237], lIIIlllllIllI[0]);
    }

    private static boolean lIlIIllIIllIllI(int n2) {
        return n2 > 0;
    }

    /*
     * WARNING - void declaration
     */
    private static void cF() {
        WorldArea worldArea = new WorldArea(lIIIlllllIllI[46], lIIIlllllIllI[47], lIIIlllllIllI[11], lIIIlllllIllI[20], lIIIlllllIllI[0]);
        WorldArea worldArea2 = new WorldArea(lIIIlllllIllI[46], lIIIlllllIllI[48], lIIIlllllIllI[49], lIIIlllllIllI[24], lIIIlllllIllI[0]);
        WorldArea worldArea3 = new WorldArea(lIIIlllllIllI[46], lIIIlllllIllI[50], lIIIlllllIllI[49], lIIIlllllIllI[24], lIIIlllllIllI[1]);
        WorldArea worldArea4 = new WorldArea(lIIIlllllIllI[51], lIIIlllllIllI[52], lIIIlllllIllI[53], lIIIlllllIllI[54], lIIIlllllIllI[2]);
        WorldArea worldArea5 = new WorldArea(lIIIlllllIllI[55], lIIIlllllIllI[56], lIIIlllllIllI[24], lIIIlllllIllI[11], lIIIlllllIllI[2]);
        WorldArea worldArea6 = new WorldArea(lIIIlllllIllI[57], lIIIlllllIllI[58], lIIIlllllIllI[49], lIIIlllllIllI[11], lIIIlllllIllI[0]);
        WorldArea worldArea7 = new WorldArea(lIIIlllllIllI[59], lIIIlllllIllI[60], lIIIlllllIllI[11], lIIIlllllIllI[20], lIIIlllllIllI[0]);
        WorldArea worldArea8 = new WorldArea(lIIIlllllIllI[46], lIIIlllllIllI[47], lIIIlllllIllI[61], lIIIlllllIllI[20], lIIIlllllIllI[0]);
        if (N.lIlIIllIIllIIll(ih.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && N.lIlIIllIIllIIll(ii.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && N.lIlIIllIIllIIll(ij.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderRat.c = lIIIlllllIlIl[lIIIlllllIllI[11]];
            e.a(ik);
            Time.sleepTicks((int)lIIIlllllIllI[1]);

        }
        if ((!N.lIlIIllIIllIIll(ih.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || !N.lIlIIllIIllIIll(ii.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || N.lIlIIllIIllIIIl(ij.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) && N.lIlIIllIIlllIII(Players.getLocal().getAnimation(), lIIIlllllIllI[62]) && N.lIlIIllIIllIIll(Players.getLocal().isMoving() ? 1 : 0)) {
            void var1;
            void var2;
            void var3;
            void var4;
            void var5;
            void var6;
            void var7;
            if (N.lIlIIllIIllIIIl(var7.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderRat.c = lIIIlllllIlIl[lIIIlllllIllI[49]];
                String[] stringArray = new String[lIIIlllllIllI[1]];
                stringArray[N.lIIIlllllIllI[0]] = lIIIlllllIlIl[lIIIlllllIllI[63]];
                TileObjects.getNearest((String[])stringArray).interact(lIIIlllllIlIl[lIIIlllllIllI[64]]);
                Time.sleepTicks((int)lIIIlllllIllI[2]);

            }
            if (N.lIlIIllIIllIIIl(var6.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderRat.c = lIIIlllllIlIl[lIIIlllllIllI[53]];
                String[] stringArray = new String[lIIIlllllIllI[1]];
                stringArray[N.lIIIlllllIllI[0]] = lIIIlllllIlIl[lIIIlllllIllI[38]];
                TileObjects.getNearest((String[])stringArray).interact(lIIIlllllIlIl[lIIIlllllIllI[65]]);
                Time.sleepTicks((int)lIIIlllllIllI[2]);

            }
            if (N.lIlIIllIIllIIIl(var5.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderRat.c = lIIIlllllIlIl[lIIIlllllIllI[66]];
                String[] stringArray = new String[lIIIlllllIllI[1]];
                stringArray[N.lIIIlllllIllI[0]] = lIIIlllllIlIl[lIIIlllllIllI[54]];
                TileObjects.getNearest((String[])stringArray).interact(lIIIlllllIlIl[lIIIlllllIllI[67]]);
                Time.sleepTicks((int)lIIIlllllIllI[2]);

            }
            if (N.lIlIIllIIllIIIl(var4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderRat.c = lIIIlllllIlIl[lIIIlllllIllI[40]];
                String[] stringArray = new String[lIIIlllllIllI[1]];
                stringArray[N.lIIIlllllIllI[0]] = lIIIlllllIlIl[lIIIlllllIllI[68]];
                TileObjects.getNearest((String[])stringArray).interact(lIIIlllllIlIl[lIIIlllllIllI[61]]);
                Time.sleepTicks((int)lIIIlllllIllI[18]);

            }
            if (N.lIlIIllIIllIIIl(var3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderRat.c = lIIIlllllIlIl[lIIIlllllIllI[69]];
                String[] stringArray = new String[lIIIlllllIllI[1]];
                stringArray[N.lIIIlllllIllI[0]] = lIIIlllllIlIl[lIIIlllllIllI[70]];
                TileObjects.getNearest((String[])stringArray).interact(lIIIlllllIlIl[lIIIlllllIllI[41]]);
                Time.sleepTicks((int)lIIIlllllIllI[16]);

            }
            if (N.lIlIIllIIllIIIl(var2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderRat.c = lIIIlllllIlIl[lIIIlllllIllI[71]];
                String[] stringArray = new String[lIIIlllllIllI[1]];
                stringArray[N.lIIIlllllIllI[0]] = lIIIlllllIlIl[lIIIlllllIllI[72]];
                TileObjects.getNearest((String[])stringArray).interact(lIIIlllllIlIl[lIIIlllllIllI[73]]);
                Time.sleepTicks((int)lIIIlllllIllI[9]);

            }
            if (N.lIlIIllIIllIIIl(var1.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderRat.c = lIIIlllllIlIl[lIIIlllllIllI[74]];
                String[] stringArray = new String[lIIIlllllIllI[1]];
                stringArray[N.lIIIlllllIllI[0]] = lIIIlllllIlIl[lIIIlllllIllI[42]];
                TileObjects.getNearest((String[])stringArray).interact(lIIIlllllIlIl[lIIIlllllIllI[75]]);
                Time.sleepTicks((int)lIIIlllllIllI[16]);

            }
        }
    }

    private static void lIlIIllIIlIlllI() {
        lIIIlllllIlIl = new String[lIIIlllllIllI[238]];
        N.lIIIlllllIlIl[N.lIIIlllllIllI[0]] = "Buying items";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[1]] = "Finished buying items, switching back to agility";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[2]] = "Navigating to bank";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[9]] = "Handling banking";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[16]] = "We are missing quest supplies, switching to BUYING";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[18]] = "Vial";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[20]] = "Vial";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[22]] = "Drop";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[24]] = "Drink";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[26]] = "Eat";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[11]] = "Nav to gnome course";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[49]] = "Crossing log";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[63]] = "Log balance";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[64]] = "Walk-across";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[53]] = "Climbing net";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[38]] = "Obstacle net";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[65]] = "Climb-over";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[66]] = "Climbing branch";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[54]] = "Tree branch";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[67]] = "Climb";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[40]] = "Crossing rope";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[68]] = "Balancing rope";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[61]] = "Walk-on";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[69]] = "Climbing down";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[70]] = "Tree branch";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[41]] = "Climb-down";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[71]] = "Climbing net";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[72]] = "Obstacle net";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[73]] = "Climb-over";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[74]] = "Crossing pipe";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[42]] = "Obstacle pipe";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[75]] = "Squeeze-through";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[95]] = "Nav to start";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[97]] = "Mark of grace";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[98]] = "Taking mark";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[99]] = "Found mark on ground";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[100]] = "Take";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[101]] = "Starting course";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[102]] = "Rough wall";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[103]] = "Climb";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[37]] = "Crossing clothes line";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[105]] = "Clothes line";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[106]] = "Cross";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[107]] = "Leaping";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[108]] = "Gap";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[109]] = "Leap";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[110]] = "Balancing";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[111]] = "Wall";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[112]] = "Balance";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[113]] = "Jumping gap";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[39]] = "Gap";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[6]] = "Leap";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[114]] = "Jumping gap 2";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[116]] = "Leap";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[117]] = "Jumping gap 3";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[119]] = "Leap";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[120]] = "Hurdle roof";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[122]] = "Hurdle";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[123]] = "Finishing course";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[124]] = "Edge";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[44]] = "Jump-off";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[140]] = "Nav to canafis course";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[5]] = "Nav to start";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[141]] = "Starting course";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[142]] = "Tall tree";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[143]] = "Climb";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[144]] = "Mark of grace";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[145]] = "Taking mark";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[146]] = "Found mark on ground";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[147]] = "Take";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[148]] = "Jumping gap 1";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[149]] = "Jump";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[150]] = "Jumping gap 2";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[151]] = "Jump";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[152]] = "Jumping gap 3";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[153]] = "Jump";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[154]] = "Jumping gap 4";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[155]] = "Jump";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[156]] = "Vaulting";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[157]] = "Vault";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[158]] = "Jumping gap 5";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[159]] = "Jump";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[160]] = "Jumping gap 6";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[161]] = "Jump";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[172]] = "Nav to canafis course";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[173]] = "Nav to start";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[174]] = "Starting course";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[175]] = "Wall";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[35]] = "Climb-up";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[176]] = "Mark of grace";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[177]] = "Taking mark";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[178]] = "Found mark on ground";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[179]] = "Take";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[180]] = "Jumping gap 1";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[79]] = "Jump";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[181]] = "cross rope";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[182]] = "Cross";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[183]] = "Jumping gap 3";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[184]] = "Jump";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[185]] = "Jumping gap 4";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[186]] = "Jump";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[187]] = "Jumping Edge";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[188]] = "Jump";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[194]] = "Found mark on ground";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[203]] = "Agility";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[204]] = "passage";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[205]] = "passage";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[206]] = "passage";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[207]] = "passage";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[208]] = "Edge";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[211]] = "Gap";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[213]] = "Gap";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[216]] = "Tightrope";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[218]] = "Gap";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[221]] = "Gap";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[224]] = "Gap";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[226]] = "Pole-vault";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[227]] = "Gap";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[230]] = "Gap";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[232]] = "Gap";
        N.lIIIlllllIlIl[N.lIIIlllllIllI[233]] = "Gap";
    }

    @Override
    public boolean X() {
        return lIIIlllllIllI[0];
    }

    public static void W() {
        d var8;
        block18: {
            block17: {
                block16: {
                    block15: {
                        int[] nArray = new int[lIIIlllllIllI[1]];
                        nArray[N.lIIIlllllIllI[0]] = lIIIlllllIllI[15];
                        if (N.lIlIIllIIllIIll(Bank.contains((int[])nArray) ? 1 : 0)) {
                            d d2 = new DHelper(lIIIlllllIllI[15], lIIIlllllIllI[1], lIIIlllllIllI[195]);
                            bA.add(d2);

                        }
                        int[] nArray2 = new int[lIIIlllllIllI[1]];
                        nArray2[N.lIIIlllllIllI[0]] = lIIIlllllIllI[17];
                        if (N.lIlIIllIIllIIll(Bank.contains((int[])nArray2) ? 1 : 0)) {
                            var8 = new DHelper(lIIIlllllIllI[17], lIIIlllllIllI[2], lIIIlllllIllI[196]);
                            bA.add(var8);

                        }
                        int[] nArray3 = new int[lIIIlllllIllI[1]];
                        nArray3[N.lIIIlllllIllI[0]] = lIIIlllllIllI[27];
                        if (N.lIlIIllIIllIIll(Bank.contains((int[])nArray3) ? 1 : 0)) {
                            var8 = new DHelper(lIIIlllllIllI[27], lIIIlllllIllI[2], lIIIlllllIllI[196]);
                            bA.add(var8);

                        }
                        int[] nArray4 = new int[lIIIlllllIllI[1]];
                        nArray4[N.lIIIlllllIllI[0]] = lIIIlllllIllI[12];
                        if (N.lIlIIllIIllIIll(Bank.contains((int[])nArray4) ? 1 : 0)) {
                            var8 = new DHelper(lIIIlllllIllI[12], lIIIlllllIllI[11], lIIIlllllIllI[197]);
                            bA.add(var8);

                        }
                        int[] nArray5 = new int[lIIIlllllIllI[1]];
                        nArray5[N.lIIIlllllIllI[0]] = lIIIlllllIllI[21];
                        if (N.lIlIIllIIllIIll(Bank.contains((int[])nArray5) ? 1 : 0)) {
                            var8 = new DHelper(lIIIlllllIllI[21], lIIIlllllIllI[11], lIIIlllllIllI[198]);
                            bA.add(var8);

                        }
                        int[] nArray6 = new int[lIIIlllllIllI[1]];
                        nArray6[N.lIIIlllllIllI[0]] = lIIIlllllIllI[14];
                        if (N.lIlIIllIIllIIll(Bank.contains((int[])nArray6) ? 1 : 0)) {
                            var8 = new DHelper(lIIIlllllIllI[14], lIIIlllllIllI[11], lIIIlllllIllI[198]);
                            bA.add(var8);

                        }
                        int[] nArray7 = new int[lIIIlllllIllI[1]];
                        nArray7[N.lIIIlllllIllI[0]] = lIIIlllllIllI[13];
                        if (N.lIlIIllIIllIIll(Bank.contains((int[])nArray7) ? 1 : 0)) {
                            var8 = new DHelper(lIIIlllllIllI[13], lIIIlllllIllI[11], lIIIlllllIllI[198]);
                            bA.add(var8);

                        }
                        int[] nArray8 = new int[lIIIlllllIllI[1]];
                        nArray8[N.lIIIlllllIllI[0]] = lIIIlllllIllI[23];
                        if (!N.lIlIIllIIllIIIl(Bank.contains((int[])nArray8) ? 1 : 0)) break block15;
                        int[] nArray9 = new int[lIIIlllllIllI[1]];
                        nArray9[N.lIIIlllllIllI[0]] = lIIIlllllIllI[23];
                        if (!N.lIlIIllIIllIIIl(Bank.contains((int[])nArray9) ? 1 : 0)) break block16;
                        int[] nArray10 = new int[lIIIlllllIllI[1]];
                        nArray10[N.lIIIlllllIllI[0]] = lIIIlllllIllI[23];
                        if (!N.lIlIIllIIllIIlI(Bank.getFirst((int[])nArray10).getQuantity(), lIIIlllllIllI[11])) break block16;
                    }
                    var8 = new DHelper(if, lIIIlllllIllI[44], lIIIlllllIllI[199]);
                    bA.add(var8);

                }
                int[] nArray = new int[lIIIlllllIllI[1]];
                nArray[N.lIIIlllllIllI[0]] = lIIIlllllIllI[25];
                if (!N.lIlIIllIIllIIIl(Bank.contains((int[])nArray) ? 1 : 0)) break block17;
                int[] nArray11 = new int[lIIIlllllIllI[1]];
                nArray11[N.lIIIlllllIllI[0]] = lIIIlllllIllI[25];
                if (!N.lIlIIllIIllIIIl(Bank.contains((int[])nArray11) ? 1 : 0)) break block18;
                int[] nArray12 = new int[lIIIlllllIllI[1]];
                nArray12[N.lIIIlllllIllI[0]] = lIIIlllllIllI[25];
                if (!N.lIlIIllIIllIIlI(Bank.getFirst((int[])nArray12).getQuantity(), lIIIlllllIllI[11])) break block18;
            }
            var8 = new DHelper(lIIIlllllIllI[25], lIIIlllllIllI[11], lIIIlllllIllI[200]);
            bA.add(var8);

        }
        int[] nArray = new int[lIIIlllllIllI[1]];
        nArray[N.lIIIlllllIllI[0]] = lIIIlllllIllI[201];
        if (N.lIlIIllIIllIIll(Bank.contains((int[])nArray) ? 1 : 0)) {
            var8 = new DHelper(lIIIlllllIllI[201], lIIIlllllIllI[1], lIIIlllllIllI[202]);
            bA.add(var8);

        }
        int[] nArray13 = new int[lIIIlllllIllI[1]];
        nArray13[N.lIIIlllllIllI[0]] = lIIIlllllIllI[19];
        if (N.lIlIIllIIllIIll(Bank.contains((int[])nArray13) ? 1 : 0)) {
            var8 = new DHelper(lIIIlllllIllI[19], lIIIlllllIllI[40], h.bv);
            bA.add(var8);

        }
    }

    @Override
    public String Z() {
        return lIIIlllllIlIl[lIIIlllllIllI[203]];
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean S() {
        int n2;
        if (N.lIlIIllIIllIlll(Skills.getBoostedLevel((Skill)Skill.AGILITY), lIIIlllllIllI[37])) {
            int n3;
            int[] nArray = new int[lIIIlllllIllI[1]];
            nArray[N.lIIIlllllIllI[0]] = lIIIlllllIllI[12];
            if (N.lIlIIllIIllIIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray2 = new int[lIIIlllllIllI[1]];
                nArray2[N.lIIIlllllIllI[0]] = lIIIlllllIllI[25];
                if (N.lIlIIllIIllIIIl(Inventory.contains((int[])nArray2) ? 1 : 0)) {
                    int[] nArray3 = new int[lIIIlllllIllI[1]];
                    nArray3[N.lIIIlllllIllI[0]] = lIIIlllllIllI[23];
                    if (!(!N.lIlIIllIIllIIIl(Inventory.contains((int[])nArray3) ? 1 : 0) || N.lIlIIllIIllIIll(Inventory.contains(item -> item.getName().contains(lIIIlllllIlIl[lIIIlllllIllI[207]])) ? 1 : 0) && !N.lIlIIllIIllIIIl(Equipment.contains(item -> item.getName().contains(lIIIlllllIlIl[lIIIlllllIllI[206]])) ? 1 : 0) || N.lIlIIllIIllIIll(Inventory.contains((int[])f.bk) ? 1 : 0) && !N.lIlIIllIIllIIIl(Equipment.contains((int[])f.bk) ? 1 : 0))) {
                        n3 = lIIIlllllIllI[1];

                        if (2 < 3) return n3 != 0;
                        return ((16 + 3 - -33 + 81 ^ 52 + 50 - -56 + 11) & (0x4E ^ 0 ^ (0xCB ^ 0xA9) ^ -1)) != 0;
                    }
                }
            }
            n3 = lIIIlllllIllI[0];
            return n3 != 0;
        }
        int[] nArray = new int[lIIIlllllIllI[1]];
        nArray[N.lIIIlllllIllI[0]] = lIIIlllllIllI[12];
        if (N.lIlIIllIIllIIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
            int[] nArray4 = new int[lIIIlllllIllI[1]];
            nArray4[N.lIIIlllllIllI[0]] = lIIIlllllIllI[14];
            if (N.lIlIIllIIllIIIl(Inventory.contains((int[])nArray4) ? 1 : 0)) {
                int[] nArray5 = new int[lIIIlllllIllI[1]];
                nArray5[N.lIIIlllllIllI[0]] = lIIIlllllIllI[13];
                if (!(!N.lIlIIllIIllIIIl(Inventory.contains((int[])nArray5) ? 1 : 0) || N.lIlIIllIIllIIll(Inventory.contains(item -> item.getName().contains(lIIIlllllIlIl[lIIIlllllIllI[205]])) ? 1 : 0) && !N.lIlIIllIIllIIIl(Equipment.contains(item -> item.getName().contains(lIIIlllllIlIl[lIIIlllllIllI[204]])) ? 1 : 0) || N.lIlIIllIIllIIll(Inventory.contains((int[])f.bk) ? 1 : 0) && !N.lIlIIllIIllIIIl(Equipment.contains((int[])f.bk) ? 1 : 0))) {
                    n2 = lIIIlllllIllI[1];

                    if (2 == 2) return n2 != 0;
                    return ((0x4D ^ 0x37 ^ (9 ^ 0x29)) & (0x35 ^ 0x49 ^ (0x54 ^ 0x72) ^ -1)) != 0;
                }
            }
        }
        n2 = lIIIlllllIllI[0];
        return n2 != 0;
    }

    @Override
    public int Y() {
        try {
            N.cE();

        }
        catch (Exception exception) {
            // empty catch block
        }
        
        return lIIIlllllIllI[186];
    }

    /*
     * WARNING - void declaration
     */
    private static void cG() {
        WorldArea worldArea = new WorldArea(lIIIlllllIllI[76], lIIIlllllIllI[77], lIIIlllllIllI[78], lIIIlllllIllI[79], lIIIlllllIllI[1]);
        WorldArea worldArea2 = new WorldArea(lIIIlllllIllI[76], lIIIlllllIllI[77], lIIIlllllIllI[78], lIIIlllllIllI[79], lIIIlllllIllI[2]);
        WorldArea worldArea3 = new WorldArea(lIIIlllllIllI[76], lIIIlllllIllI[77], lIIIlllllIllI[78], lIIIlllllIllI[79], lIIIlllllIllI[9]);
        WorldArea worldArea4 = new WorldArea(lIIIlllllIllI[80], lIIIlllllIllI[81], lIIIlllllIllI[69], lIIIlllllIllI[64], lIIIlllllIllI[0]);
        WorldArea worldArea5 = new WorldArea(lIIIlllllIllI[82], lIIIlllllIllI[81], lIIIlllllIllI[11], lIIIlllllIllI[64], lIIIlllllIllI[9]);
        WorldArea worldArea6 = new WorldArea(lIIIlllllIllI[83], lIIIlllllIllI[84], lIIIlllllIllI[63], lIIIlllllIllI[49], lIIIlllllIllI[9]);
        WorldArea worldArea7 = new WorldArea(lIIIlllllIllI[85], lIIIlllllIllI[86], lIIIlllllIllI[26], lIIIlllllIllI[22], lIIIlllllIllI[1]);
        WorldArea worldArea8 = new WorldArea(lIIIlllllIllI[85], lIIIlllllIllI[87], lIIIlllllIllI[11], lIIIlllllIllI[24], lIIIlllllIllI[9]);
        WorldArea worldArea9 = new WorldArea(lIIIlllllIllI[88], lIIIlllllIllI[89], lIIIlllllIllI[75], lIIIlllllIllI[40], lIIIlllllIllI[9]);
        WorldArea worldArea10 = new WorldArea(lIIIlllllIllI[90], lIIIlllllIllI[91], lIIIlllllIllI[66], lIIIlllllIllI[64], lIIIlllllIllI[9]);
        WorldArea worldArea11 = new WorldArea(lIIIlllllIllI[92], lIIIlllllIllI[93], lIIIlllllIllI[22], lIIIlllllIllI[26], lIIIlllllIllI[9]);
        WorldArea worldArea12 = new WorldArea(lIIIlllllIllI[92], lIIIlllllIllI[94], lIIIlllllIllI[11], lIIIlllllIllI[22], lIIIlllllIllI[9]);
        if (N.lIlIIllIIllIIll(worldArea4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && N.lIlIIllIIllIIll(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && N.lIlIIllIIllIIll(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && N.lIlIIllIIllIIll(worldArea3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderRat.c = lIIIlllllIlIl[lIIIlllllIllI[95]];
            if (N.lIlIIllIIllIIIl(Bank.isOpen() ? 1 : 0)) {
                Bank.close();
            }
            if (N.lIlIIllIIllIIIl(Dialog.isOpen() ? 1 : 0)) {
                Dialog.close();
            }
            Movement.walkTo((WorldPoint)new WorldPoint(lIIIlllllIllI[96], lIIIlllllIllI[52], lIIIlllllIllI[0]));

            Time.sleepTicks((int)lIIIlllllIllI[1]);

        }
        if (N.lIlIIllIIlllIII(Players.getLocal().getAnimation(), lIIIlllllIllI[62]) && N.lIlIIllIIllIIll(Players.getLocal().isMoving() ? 1 : 0)) {
            String[] stringArray = new String[lIIIlllllIllI[1]];
            stringArray[N.lIIIlllllIllI[0]] = lIIIlllllIlIl[lIIIlllllIllI[97]];
            TileItem var9 = TileItems.getNearest((String[])stringArray);
            if (N.lIlIIllIIllIlII(var9) && N.lIlIIllIIllIIIl(N.cJ() ? 1 : 0)) {
                AccBuilderRat.c = lIIIlllllIlIl[lIIIlllllIllI[98]];
                System.out.println(lIIIlllllIlIl[lIIIlllllIllI[99]]);
                var9.interact(lIIIlllllIlIl[lIIIlllllIllI[100]]);
                Time.sleepTicks((int)lIIIlllllIllI[9]);

            }
            if (N.lIlIIllIIllIIll(N.cJ() ? 1 : 0)) {
                void var10;
                void var11;
                void var12;
                void var13;
                void var14;
                void var15;
                void var16;
                void var17;
                int var18;
                void var19;
                if (N.lIlIIllIIllIIIl(var19.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && N.lIlIIllIIllIIll(N.cJ() ? 1 : 0)) {
                    AccBuilderRat.c = lIIIlllllIlIl[lIIIlllllIllI[101]];
                    var18 = Skills.getExperience((Skill)Skill.AGILITY);
                    String[] stringArray2 = new String[lIIIlllllIllI[1]];
                    stringArray2[N.lIIIlllllIllI[0]] = lIIIlllllIlIl[lIIIlllllIllI[102]];
                    TileObjects.getNearest((String[])stringArray2).interact(lIIIlllllIlIl[lIIIlllllIllI[103]]);
                    Time.sleepUntil(() -> {
                        boolean bl;
                        if (N.lIlIIllIIllIlIl(Skills.getExperience((Skill)Skill.AGILITY), var18)) {
                            bl = lIIIlllllIllI[1];

                            if (((0xE ^ 0x3E ^ (0xF4 ^ 0x9F)) & (0x47 ^ 0x64 ^ (0xF2 ^ 0x8A) ^ -1)) >= (0x5E ^ 0x50 ^ (0x3F ^ 0x35))) {
                                return ((140 + 131 - 59 + 8 ^ 76 + 78 - 14 + 19) & (72 + 119 - 130 + 66 ^ (0x33 ^ 0xF) ^ -1)) != 0;
                            }
                        } else {
                            bl = lIIIlllllIllI[0];
                        }
                        return bl;
                    }, (int)lIIIlllllIllI[104]);

                    Time.sleepTicks((int)lIIIlllllIllI[1]);

                }
                if (N.lIlIIllIIllIIIl(var17.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && N.lIlIIllIIllIIll(N.cJ() ? 1 : 0)) {
                    AccBuilderRat.c = lIIIlllllIlIl[lIIIlllllIllI[37]];
                    var18 = Skills.getExperience((Skill)Skill.AGILITY);
                    String[] stringArray3 = new String[lIIIlllllIllI[1]];
                    stringArray3[N.lIIIlllllIllI[0]] = lIIIlllllIlIl[lIIIlllllIllI[105]];
                    TileObjects.getNearest((String[])stringArray3).interact(lIIIlllllIlIl[lIIIlllllIllI[106]]);
                    Time.sleepUntil(() -> {
                        boolean bl;
                        if (N.lIlIIllIIllIlIl(Skills.getExperience((Skill)Skill.AGILITY), var18)) {
                            bl = lIIIlllllIllI[1];

                            if (((0x61 ^ 0x75) & ~(0x3B ^ 0x2F)) != 0) {
                                return false;
                            }
                        } else {
                            bl = lIIIlllllIllI[0];
                        }
                        return bl;
                    }, (int)lIIIlllllIllI[104]);

                    Time.sleepTicks((int)lIIIlllllIllI[1]);

                }
                if (N.lIlIIllIIllIIIl(var16.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && N.lIlIIllIIllIIll(N.cJ() ? 1 : 0)) {
                    AccBuilderRat.c = lIIIlllllIlIl[lIIIlllllIllI[107]];
                    var18 = Skills.getExperience((Skill)Skill.AGILITY);
                    String[] stringArray4 = new String[lIIIlllllIllI[1]];
                    stringArray4[N.lIIIlllllIllI[0]] = lIIIlllllIlIl[lIIIlllllIllI[108]];
                    TileObjects.getNearest((String[])stringArray4).interact(lIIIlllllIlIl[lIIIlllllIllI[109]]);
                    Time.sleepUntil(() -> {
                        boolean bl;
                        if (N.lIlIIllIIllIlIl(Skills.getExperience((Skill)Skill.AGILITY), var18)) {
                            bl = lIIIlllllIllI[1];

                            if (-1 > 3) {
                                return ((93 + 35 - -19 + 12 ^ 97 + 13 - -27 + 48) & (0xE5 ^ 0x82 ^ (0xE9 ^ 0xA8) ^ -1)) != 0;
                            }
                        } else {
                            bl = lIIIlllllIllI[0];
                        }
                        return bl;
                    }, (int)lIIIlllllIllI[104]);

                    Time.sleepTicks((int)lIIIlllllIllI[1]);

                }
                if (N.lIlIIllIIllIIIl(var15.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && N.lIlIIllIIllIIll(N.cJ() ? 1 : 0)) {
                    AccBuilderRat.c = lIIIlllllIlIl[lIIIlllllIllI[110]];
                    var18 = Skills.getExperience((Skill)Skill.AGILITY);
                    String[] stringArray5 = new String[lIIIlllllIllI[1]];
                    stringArray5[N.lIIIlllllIllI[0]] = lIIIlllllIlIl[lIIIlllllIllI[111]];
                    TileObjects.getNearest((String[])stringArray5).interact(lIIIlllllIlIl[lIIIlllllIllI[112]]);
                    Time.sleepUntil(() -> {
                        boolean bl;
                        if (N.lIlIIllIIllIlIl(Skills.getExperience((Skill)Skill.AGILITY), var18)) {
                            bl = lIIIlllllIllI[1];

                        } else {
                            bl = lIIIlllllIllI[0];
                        }
                        return bl;
                    }, (int)lIIIlllllIllI[104]);

                    Time.sleepTicks((int)lIIIlllllIllI[1]);

                }
                if (N.lIlIIllIIllIIIl(var14.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && N.lIlIIllIIllIIll(N.cJ() ? 1 : 0)) {
                    AccBuilderRat.c = lIIIlllllIlIl[lIIIlllllIllI[113]];
                    var18 = Skills.getExperience((Skill)Skill.AGILITY);
                    String[] stringArray6 = new String[lIIIlllllIllI[1]];
                    stringArray6[N.lIIIlllllIllI[0]] = lIIIlllllIlIl[lIIIlllllIllI[39]];
                    TileObjects.getNearest((String[])stringArray6).interact(lIIIlllllIlIl[lIIIlllllIllI[6]]);
                    Time.sleepUntil(() -> {
                        boolean bl;
                        if (N.lIlIIllIIllIlIl(Skills.getExperience((Skill)Skill.AGILITY), var18)) {
                            bl = lIIIlllllIllI[1];

                            if ((0x24 ^ 0x21) <= 0) {
                                return false;
                            }
                        } else {
                            bl = lIIIlllllIllI[0];
                        }
                        return bl;
                    }, (int)lIIIlllllIllI[104]);

                    Time.sleepTicks((int)lIIIlllllIllI[1]);

                }
                if (N.lIlIIllIIllIIIl(var13.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && N.lIlIIllIIllIIll(N.cJ() ? 1 : 0)) {
                    AccBuilderRat.c = lIIIlllllIlIl[lIIIlllllIllI[114]];
                    var18 = Skills.getExperience((Skill)Skill.AGILITY);
                    int[] nArray = new int[lIIIlllllIllI[1]];
                    nArray[N.lIIIlllllIllI[0]] = lIIIlllllIllI[115];
                    TileObjects.getNearest((int[])nArray).interact(lIIIlllllIlIl[lIIIlllllIllI[116]]);
                    Time.sleepUntil(() -> {
                        boolean bl;
                        if (N.lIlIIllIIllIlIl(Skills.getExperience((Skill)Skill.AGILITY), var18)) {
                            bl = lIIIlllllIllI[1];

                            if (((0xDA ^ 0x98) & ~(0x11 ^ 0x53)) != 0) {
                                return false;
                            }
                        } else {
                            bl = lIIIlllllIllI[0];
                        }
                        return bl;
                    }, (int)lIIIlllllIllI[104]);

                    Time.sleepTicks((int)lIIIlllllIllI[1]);

                }
                if (N.lIlIIllIIllIIIl(var12.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && N.lIlIIllIIllIIll(N.cJ() ? 1 : 0)) {
                    AccBuilderRat.c = lIIIlllllIlIl[lIIIlllllIllI[117]];
                    var18 = Skills.getExperience((Skill)Skill.AGILITY);
                    int[] nArray = new int[lIIIlllllIllI[1]];
                    nArray[N.lIIIlllllIllI[0]] = lIIIlllllIllI[118];
                    TileObjects.getNearest((int[])nArray).interact(lIIIlllllIlIl[lIIIlllllIllI[119]]);
                    Time.sleepUntil(() -> {
                        boolean bl;
                        if (N.lIlIIllIIllIlIl(Skills.getExperience((Skill)Skill.AGILITY), var18)) {
                            bl = lIIIlllllIllI[1];

                            if (((0x99 ^ 0xC1) & ~(0x99 ^ 0xC1)) != 0) {
                                return false;
                            }
                        } else {
                            bl = lIIIlllllIllI[0];
                        }
                        return bl;
                    }, (int)lIIIlllllIllI[104]);

                    Time.sleepTicks((int)lIIIlllllIllI[1]);

                }
                if (N.lIlIIllIIllIIIl(var11.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && N.lIlIIllIIllIIll(N.cJ() ? 1 : 0)) {
                    AccBuilderRat.c = lIIIlllllIlIl[lIIIlllllIllI[120]];
                    var18 = Skills.getExperience((Skill)Skill.AGILITY);
                    int[] nArray = new int[lIIIlllllIllI[1]];
                    nArray[N.lIIIlllllIllI[0]] = lIIIlllllIllI[121];
                    TileObjects.getNearest((int[])nArray).interact(lIIIlllllIlIl[lIIIlllllIllI[122]]);
                    Time.sleepUntil(() -> {
                        boolean bl;
                        if (N.lIlIIllIIllIlIl(Skills.getExperience((Skill)Skill.AGILITY), var18)) {
                            bl = lIIIlllllIllI[1];

                            if (2 < 0) {
                                return false;
                            }
                        } else {
                            bl = lIIIlllllIllI[0];
                        }
                        return bl;
                    }, (int)lIIIlllllIllI[104]);

                    Time.sleepTicks((int)lIIIlllllIllI[1]);

                }
                if (N.lIlIIllIIllIIIl(var10.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && N.lIlIIllIIllIIll(N.cJ() ? 1 : 0)) {
                    AccBuilderRat.c = lIIIlllllIlIl[lIIIlllllIllI[123]];
                    var18 = Skills.getExperience((Skill)Skill.AGILITY);
                    String[] stringArray7 = new String[lIIIlllllIllI[1]];
                    stringArray7[N.lIIIlllllIllI[0]] = lIIIlllllIlIl[lIIIlllllIllI[124]];
                    TileObjects.getNearest((String[])stringArray7).interact(lIIIlllllIlIl[lIIIlllllIllI[44]]);
                    Time.sleepUntil(() -> {
                        boolean bl;
                        if (N.lIlIIllIIllIlIl(Skills.getExperience((Skill)Skill.AGILITY), var18)) {
                            bl = lIIIlllllIllI[1];

                            if (-1 > (157 + 186 - 266 + 110 ^ 190 + 86 - 272 + 187)) {
                                return ((0x37 ^ 0x6B ^ (0x18 ^ 0x27)) & (0xCD ^ 0x9F ^ (0x3E ^ 0xF) ^ -1)) != 0;
                            }
                        } else {
                            bl = lIIIlllllIllI[0];
                        }
                        return bl;
                    }, (int)lIIIlllllIllI[104]);

                    Time.sleepTicks((int)lIIIlllllIllI[1]);

                }
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    private static void cI() {
        void var20;
        void var21;
        void var22;
        void var23;
        void var24;
        WorldArea worldArea = new WorldArea(lIIIlllllIllI[162], lIIIlllllIllI[163], lIIIlllllIllI[111], lIIIlllllIllI[111], lIIIlllllIllI[0]);
        WorldArea worldArea2 = new WorldArea(lIIIlllllIllI[162], lIIIlllllIllI[163], lIIIlllllIllI[111], lIIIlllllIllI[111], lIIIlllllIllI[1]);
        WorldArea worldArea3 = new WorldArea(lIIIlllllIllI[162], lIIIlllllIllI[163], lIIIlllllIllI[111], lIIIlllllIllI[111], lIIIlllllIllI[2]);
        WorldArea worldArea4 = new WorldArea(lIIIlllllIllI[162], lIIIlllllIllI[163], lIIIlllllIllI[111], lIIIlllllIllI[111], lIIIlllllIllI[9]);
        WorldArea worldArea5 = new WorldArea(lIIIlllllIllI[164], lIIIlllllIllI[133], lIIIlllllIllI[64], lIIIlllllIllI[11], lIIIlllllIllI[9]);
        WorldArea worldArea6 = new WorldArea(lIIIlllllIllI[165], lIIIlllllIllI[139], lIIIlllllIllI[38], lIIIlllllIllI[53], lIIIlllllIllI[2]);
        WorldArea worldArea7 = new WorldArea(lIIIlllllIllI[166], lIIIlllllIllI[134], lIIIlllllIllI[49], lIIIlllllIllI[26], lIIIlllllIllI[2]);
        WorldArea worldArea8 = new WorldArea(lIIIlllllIllI[167], lIIIlllllIllI[136], lIIIlllllIllI[70], lIIIlllllIllI[64], lIIIlllllIllI[9]);
        WorldArea worldArea9 = new WorldArea(lIIIlllllIllI[168], lIIIlllllIllI[169], lIIIlllllIllI[54], lIIIlllllIllI[63], lIIIlllllIllI[2]);
        WorldPoint worldPoint = new WorldPoint(lIIIlllllIllI[170], lIIIlllllIllI[171], lIIIlllllIllI[0]);
        if (N.lIlIIllIIllIIIl(Dialog.isOpen() ? 1 : 0)) {
            Dialog.close();
        }
        if (N.lIlIIllIIllIIll(var24.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && N.lIlIIllIIllIIll(var23.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && N.lIlIIllIIllIIll(var22.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && N.lIlIIllIIllIIll(var21.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderRat.c = lIIIlllllIlIl[lIIIlllllIllI[172]];
            Movement.walkTo((WorldPoint)var20);

            Time.sleepTicks((int)lIIIlllllIllI[1]);

        }
        if (N.lIlIIllIIllIIIl(var24.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (N.lIlIIllIIllIlIl(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)var20), lIIIlllllIllI[20])) {
                AccBuilderRat.c = lIIIlllllIlIl[lIIIlllllIllI[173]];
                Movement.walkTo((WorldPoint)var20);

                Time.sleepTicks((int)lIIIlllllIllI[1]);

            }
            if (N.lIlIIllIIlllIIl(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)var20), lIIIlllllIllI[20])) {
                AccBuilderRat.c = lIIIlllllIlIl[lIIIlllllIllI[174]];
                int var25 = Skills.getExperience((Skill)Skill.AGILITY);
                String[] stringArray = new String[lIIIlllllIllI[1]];
                stringArray[N.lIIIlllllIllI[0]] = lIIIlllllIlIl[lIIIlllllIllI[175]];
                TileObjects.getNearest((String[])stringArray).interact(lIIIlllllIlIl[lIIIlllllIllI[35]]);
                Time.sleepTicks((int)e.c(lIIIlllllIllI[1], lIIIlllllIllI[2]));

                Time.sleepUntil(() -> {
                    boolean bl;
                    if (N.lIlIIllIIllIlIl(Skills.getExperience((Skill)Skill.AGILITY), var25)) {
                        bl = lIIIlllllIllI[1];

                        if (-1 < -1) {
                            return (2 & ~2) != 0;
                        }
                    } else {
                        bl = lIIIlllllIllI[0];
                    }
                    return bl;
                }, (int)lIIIlllllIllI[104]);

                Time.sleepTicks((int)lIIIlllllIllI[1]);

            }
        }
        String[] stringArray = new String[lIIIlllllIllI[1]];
        stringArray[N.lIIIlllllIllI[0]] = lIIIlllllIlIl[lIIIlllllIllI[176]];
        TileItem var25 = TileItems.getNearest((String[])stringArray);
        if (N.lIlIIllIIllIlII(var25) && N.lIlIIllIIllIIIl(N.cJ() ? 1 : 0)) {
            AccBuilderRat.c = lIIIlllllIlIl[lIIIlllllIllI[177]];
            System.out.println(lIIIlllllIlIl[lIIIlllllIllI[178]]);
            var25.interact(lIIIlllllIlIl[lIIIlllllIllI[179]]);
            Time.sleepTicks((int)lIIIlllllIllI[9]);

        }
        if (N.lIlIIllIIllIIll(N.cJ() ? 1 : 0)) {
            void var26;
            void var27;
            void var28;
            void var29;
            int var30;
            TileObject var31;
            void var32;
            if (N.lIlIIllIIllIIIl(var32.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && N.lIlIIllIIllIlII(var31 = TileObjects.getNearest(tileObject -> {
                int n2;
                if (N.lIlIIllIIllIIIl(tileObject.getName().contains(lIIIlllllIlIl[lIIIlllllIllI[218]]) ? 1 : 0) && N.lIlIIllIIlllIIl(tileObject.getWorldLocation().distanceTo(new WorldPoint(lIIIlllllIllI[219], lIIIlllllIllI[220], lIIIlllllIllI[9])), lIIIlllllIllI[2])) {
                    n2 = lIIIlllllIllI[1];

                    if (((0xB1 ^ 0xA8) & ~(0xB4 ^ 0xAD)) >= 3) {
                        return false;
                    }
                } else {
                    n2 = lIIIlllllIllI[0];
                }
                return n2 != 0;
            }))) {
                var30 = Skills.getExperience((Skill)Skill.AGILITY);
                AccBuilderRat.c = lIIIlllllIlIl[lIIIlllllIllI[180]];
                var31.interact(lIIIlllllIlIl[lIIIlllllIllI[79]]);
                Time.sleepTicks((int)e.c(lIIIlllllIllI[1], lIIIlllllIllI[2]));

                Time.sleepUntil(() -> {
                    boolean bl;
                    if (N.lIlIIllIIllIlIl(Skills.getExperience((Skill)Skill.AGILITY), var30)) {
                        bl = lIIIlllllIllI[1];

                        if (3 <= 0) {
                            return ((0x6E ^ 0xE ^ (0x60 ^ 0x2C)) & (43 + 104 - 5 + 40 ^ 10 + 124 - -6 + 14 ^ -1)) != 0;
                        }
                    } else {
                        bl = lIIIlllllIllI[0];
                    }
                    return bl;
                }, (int)lIIIlllllIllI[104]);

                Time.sleepTicks((int)lIIIlllllIllI[1]);

            }
            if (N.lIlIIllIIllIIIl(N.cJ() ? 1 : 0)) {
                return;
            }
            if (N.lIlIIllIIllIIIl(var29.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && N.lIlIIllIIllIlII(var31 = TileObjects.getNearest(tileObject -> {
                int n2;
                if (N.lIlIIllIIllIIIl(tileObject.getName().contains(lIIIlllllIlIl[lIIIlllllIllI[216]]) ? 1 : 0) && N.lIlIIllIIlllIIl(tileObject.getWorldLocation().distanceTo(new WorldPoint(lIIIlllllIllI[217], lIIIlllllIllI[128], lIIIlllllIllI[2])), lIIIlllllIllI[2])) {
                    n2 = lIIIlllllIllI[1];

                    if (2 >= 3) {
                        return false;
                    }
                } else {
                    n2 = lIIIlllllIllI[0];
                }
                return n2 != 0;
            }))) {
                AccBuilderRat.c = lIIIlllllIlIl[lIIIlllllIllI[181]];
                var30 = Skills.getExperience((Skill)Skill.AGILITY);
                var31.interact(lIIIlllllIlIl[lIIIlllllIllI[182]]);
                Time.sleepTicks((int)e.c(lIIIlllllIllI[1], lIIIlllllIllI[2]));

                Time.sleepUntil(() -> {
                    boolean bl;
                    if (N.lIlIIllIIllIlIl(Skills.getExperience((Skill)Skill.AGILITY), var30)) {
                        bl = lIIIlllllIllI[1];

                        if (-1 != -1) {
                            return false;
                        }
                    } else {
                        bl = lIIIlllllIllI[0];
                    }
                    return bl;
                }, (int)lIIIlllllIllI[104]);

                Time.sleepTicks((int)lIIIlllllIllI[1]);

            }
            if (N.lIlIIllIIllIIIl(N.cJ() ? 1 : 0)) {
                return;
            }
            if (N.lIlIIllIIllIIIl(var28.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && N.lIlIIllIIllIlII(var31 = TileObjects.getNearest(tileObject -> {
                int n2;
                if (N.lIlIIllIIllIIIl(tileObject.getName().contains(lIIIlllllIlIl[lIIIlllllIllI[213]]) ? 1 : 0) && N.lIlIIllIIlllIIl(tileObject.getWorldLocation().distanceTo(new WorldPoint(lIIIlllllIllI[214], lIIIlllllIllI[215], lIIIlllllIllI[2])), lIIIlllllIllI[2])) {
                    n2 = lIIIlllllIllI[1];

                } else {
                    n2 = lIIIlllllIllI[0];
                }
                return n2 != 0;
            }))) {
                AccBuilderRat.c = lIIIlllllIlIl[lIIIlllllIllI[183]];
                var30 = Skills.getExperience((Skill)Skill.AGILITY);
                var31.interact(lIIIlllllIlIl[lIIIlllllIllI[184]]);
                Time.sleepTicks((int)e.c(lIIIlllllIllI[1], lIIIlllllIllI[2]));

                Time.sleepUntil(() -> {
                    boolean bl;
                    if (N.lIlIIllIIllIlIl(Skills.getExperience((Skill)Skill.AGILITY), var30)) {
                        bl = lIIIlllllIllI[1];

                        if (1 < 0) {
                            return false;
                        }
                    } else {
                        bl = lIIIlllllIllI[0];
                    }
                    return bl;
                }, (int)lIIIlllllIllI[104]);

                Time.sleepTicks((int)lIIIlllllIllI[1]);

            }
            if (N.lIlIIllIIllIIIl(N.cJ() ? 1 : 0)) {
                return;
            }
            if (N.lIlIIllIIllIIIl(var27.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && N.lIlIIllIIllIlII(var31 = TileObjects.getNearest(tileObject -> {
                int n2;
                if (N.lIlIIllIIllIIIl(tileObject.getName().contains(lIIIlllllIlIl[lIIIlllllIllI[211]]) ? 1 : 0) && N.lIlIIllIIlllIIl(tileObject.getWorldLocation().distanceTo(new WorldPoint(lIIIlllllIllI[209], lIIIlllllIllI[212], lIIIlllllIllI[9])), lIIIlllllIllI[2])) {
                    n2 = lIIIlllllIllI[1];

                    if (2 < 1) {
                        return false;
                    }
                } else {
                    n2 = lIIIlllllIllI[0];
                }
                return n2 != 0;
            }))) {
                AccBuilderRat.c = lIIIlllllIlIl[lIIIlllllIllI[185]];
                var30 = Skills.getExperience((Skill)Skill.AGILITY);
                var31.interact(lIIIlllllIlIl[lIIIlllllIllI[186]]);
                Time.sleepTicks((int)e.c(lIIIlllllIllI[1], lIIIlllllIllI[2]));

                Time.sleepUntil(() -> {
                    boolean bl;
                    if (N.lIlIIllIIllIlIl(Skills.getExperience((Skill)Skill.AGILITY), var30)) {
                        bl = lIIIlllllIllI[1];

                        if (((0x14 ^ 0x28 ^ (0xA7 ^ 0x92)) & (0xCD ^ 0xB1 ^ (0xF9 ^ 0x8C) ^ -1)) != 0) {
                            return ((35 + 82 - 4 + 30 ^ 28 + 29 - 24 + 154) & (0x51 ^ 0x28 ^ (0xE4 ^ 0xA9) ^ -1)) != 0;
                        }
                    } else {
                        bl = lIIIlllllIllI[0];
                    }
                    return bl;
                }, (int)lIIIlllllIllI[104]);

                Time.sleepTicks((int)lIIIlllllIllI[1]);

            }
            if (N.lIlIIllIIllIIIl(N.cJ() ? 1 : 0)) {
                return;
            }
            if (N.lIlIIllIIllIIIl(var26.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && N.lIlIIllIIllIlII(var31 = TileObjects.getNearest(tileObject -> {
                int n2;
                if (N.lIlIIllIIllIIIl(tileObject.getName().contains(lIIIlllllIlIl[lIIIlllllIllI[208]]) ? 1 : 0) && N.lIlIIllIIlllIIl(tileObject.getWorldLocation().distanceTo(new WorldPoint(lIIIlllllIllI[209], lIIIlllllIllI[210], lIIIlllllIllI[2])), lIIIlllllIllI[2])) {
                    n2 = lIIIlllllIllI[1];

                    }
                } else {
                    n2 = lIIIlllllIllI[0];
                }
                return n2 != 0;
            }))) {
                AccBuilderRat.c = lIIIlllllIlIl[lIIIlllllIllI[187]];
                var30 = Skills.getExperience((Skill)Skill.AGILITY);
                var31.interact(lIIIlllllIlIl[lIIIlllllIllI[188]]);
                Time.sleepTicks((int)e.c(lIIIlllllIllI[1], lIIIlllllIllI[2]));

                Time.sleepUntil(() -> {
                    boolean bl;
                    if (N.lIlIIllIIllIlIl(Skills.getExperience((Skill)Skill.AGILITY), var30)) {
                        bl = lIIIlllllIllI[1];

                        if (3 < 3) {
                            return ((0x25 ^ 0x2E ^ (0x19 ^ 0x53)) & (0xE5 ^ 0xB4 ^ (0xB4 ^ 0xA4) ^ -1)) != 0;
                        }
                    } else {
                        bl = lIIIlllllIllI[0];
                    }
                    return bl;
                }, (int)lIIIlllllIllI[104]);

                Time.sleepTicks((int)lIIIlllllIllI[1]);

            }
        }
    }

    private static boolean lIlIIllIIlllIII(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIlIIllIIllIlIl(int n2, int n3) {
        return n2 > n3;
    }

        return String.valueOf(var33);
    }

    private static boolean lIlIIllIIllIIIl(int n2) {
        return n2 != 0;
    }

    private static boolean lIlIIllIIllIlll(int n2, int n3) {
        return n2 >= n3;
    }

    /*
     * WARNING - void declaration
     */
    private static void cH() {
        void var34;
        void var35;
        void var36;
        void var37;
        void var38;
        WorldArea worldArea = new WorldArea(lIIIlllllIllI[125], lIIIlllllIllI[126], lIIIlllllIllI[112], lIIIlllllIllI[107], lIIIlllllIllI[0]);
        WorldArea worldArea2 = new WorldArea(lIIIlllllIllI[125], lIIIlllllIllI[126], lIIIlllllIllI[112], lIIIlllllIllI[107], lIIIlllllIllI[1]);
        WorldArea worldArea3 = new WorldArea(lIIIlllllIllI[125], lIIIlllllIllI[126], lIIIlllllIllI[112], lIIIlllllIllI[107], lIIIlllllIllI[2]);
        WorldArea worldArea4 = new WorldArea(lIIIlllllIllI[125], lIIIlllllIllI[126], lIIIlllllIllI[112], lIIIlllllIllI[107], lIIIlllllIllI[9]);
        WorldArea worldArea5 = new WorldArea(lIIIlllllIllI[127], lIIIlllllIllI[128], lIIIlllllIllI[49], lIIIlllllIllI[11], lIIIlllllIllI[2]);
        WorldArea worldArea6 = new WorldArea(lIIIlllllIllI[129], lIIIlllllIllI[127], lIIIlllllIllI[49], lIIIlllllIllI[24], lIIIlllllIllI[2]);
        WorldArea worldArea7 = new WorldArea(lIIIlllllIllI[130], lIIIlllllIllI[131], lIIIlllllIllI[63], lIIIlllllIllI[49], lIIIlllllIllI[2]);
        WorldArea worldArea8 = new WorldArea(lIIIlllllIllI[132], lIIIlllllIllI[133], lIIIlllllIllI[11], lIIIlllllIllI[64], lIIIlllllIllI[9]);
        WorldArea worldArea9 = new WorldArea(lIIIlllllIllI[134], lIIIlllllIllI[8], lIIIlllllIllI[49], lIIIlllllIllI[26], lIIIlllllIllI[2]);
        WorldArea worldArea10 = new WorldArea(lIIIlllllIllI[135], lIIIlllllIllI[136], lIIIlllllIllI[68], lIIIlllllIllI[53], lIIIlllllIllI[9]);
        WorldArea worldArea11 = new WorldArea(lIIIlllllIllI[137], lIIIlllllIllI[138], lIIIlllllIllI[63], lIIIlllllIllI[64], lIIIlllllIllI[2]);
        WorldPoint worldPoint = new WorldPoint(lIIIlllllIllI[137], lIIIlllllIllI[139], lIIIlllllIllI[0]);
        if (N.lIlIIllIIllIIIl(Dialog.isOpen() ? 1 : 0)) {
            Dialog.close();
        }
        if (N.lIlIIllIIllIIll(var38.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && N.lIlIIllIIllIIll(var37.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && N.lIlIIllIIllIIll(var36.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && N.lIlIIllIIllIIll(var35.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderRat.c = lIIIlllllIlIl[lIIIlllllIllI[140]];
            Movement.walkTo((WorldPoint)var34);

            Time.sleepTicks((int)lIIIlllllIllI[1]);

        }
        if (N.lIlIIllIIllIIIl(var38.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (N.lIlIIllIIllIlIl(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)var34), lIIIlllllIllI[20])) {
                AccBuilderRat.c = lIIIlllllIlIl[lIIIlllllIllI[5]];
                Movement.walkTo((WorldPoint)var34);

                Time.sleepTicks((int)lIIIlllllIllI[1]);

            }
            if (N.lIlIIllIIlllIIl(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)var34), lIIIlllllIllI[20])) {
                AccBuilderRat.c = lIIIlllllIlIl[lIIIlllllIllI[141]];
                int var39 = Skills.getExperience((Skill)Skill.AGILITY);
                String[] stringArray = new String[lIIIlllllIllI[1]];
                stringArray[N.lIIIlllllIllI[0]] = lIIIlllllIlIl[lIIIlllllIllI[142]];
                TileObjects.getNearest((String[])stringArray).interact(lIIIlllllIlIl[lIIIlllllIllI[143]]);
                Time.sleepTicks((int)e.c(lIIIlllllIllI[1], lIIIlllllIllI[2]));

                Time.sleepUntil(() -> {
                    boolean bl;
                    if (N.lIlIIllIIllIlIl(Skills.getExperience((Skill)Skill.AGILITY), var39)) {
                        bl = lIIIlllllIllI[1];

                        if (3 <= 0) {
                            return false;
                        }
                    } else {
                        bl = lIIIlllllIllI[0];
                    }
                    return bl;
                }, (int)lIIIlllllIllI[104]);

                Time.sleepTicks((int)lIIIlllllIllI[1]);

            }
        }
        String[] stringArray = new String[lIIIlllllIllI[1]];
        stringArray[N.lIIIlllllIllI[0]] = lIIIlllllIlIl[lIIIlllllIllI[144]];
        TileItem var39 = TileItems.getNearest((String[])stringArray);
        if (N.lIlIIllIIllIlII(var39) && N.lIlIIllIIllIIIl(N.cJ() ? 1 : 0)) {
            AccBuilderRat.c = lIIIlllllIlIl[lIIIlllllIllI[145]];
            System.out.println(lIIIlllllIlIl[lIIIlllllIllI[146]]);
            var39.interact(lIIIlllllIlIl[lIIIlllllIllI[147]]);
            Time.sleepTicks((int)lIIIlllllIllI[9]);

        }
        if (N.lIlIIllIIllIIll(N.cJ() ? 1 : 0)) {
            void var40;
            void var41;
            void var42;
            void var43;
            void var44;
            void var45;
            int var46;
            TileObject var47;
            void var48;
            if (N.lIlIIllIIllIIIl(var48.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && N.lIlIIllIIllIlII(var47 = TileObjects.getNearest(tileObject -> {
                int n2;
                if (N.lIlIIllIIllIIIl(tileObject.getName().contains(lIIIlllllIlIl[lIIIlllllIllI[233]]) ? 1 : 0) && N.lIlIIllIIlllIIl(tileObject.getWorldLocation().distanceTo(new WorldPoint(lIIIlllllIllI[234], lIIIlllllIllI[131], lIIIlllllIllI[2])), lIIIlllllIllI[2])) {
                    n2 = lIIIlllllIllI[1];

                    if (3 <= 1) {
                        return ((0xCE ^ 0xB5 ^ (0xBF ^ 0x8A)) & (28 + 155 - 9 + 19 ^ 93 + 28 - 7 + 29 ^ -1)) != 0;
                    }
                } else {
                    n2 = lIIIlllllIllI[0];
                }
                return n2 != 0;
            }))) {
                var46 = Skills.getExperience((Skill)Skill.AGILITY);
                AccBuilderRat.c = lIIIlllllIlIl[lIIIlllllIllI[148]];
                var47.interact(lIIIlllllIlIl[lIIIlllllIllI[149]]);
                Time.sleepTicks((int)e.c(lIIIlllllIllI[1], lIIIlllllIllI[2]));

                Time.sleepUntil(() -> {
                    boolean bl;
                    if (N.lIlIIllIIllIlIl(Skills.getExperience((Skill)Skill.AGILITY), var46)) {
                        bl = lIIIlllllIllI[1];

                        if (((0x67 ^ 0x7A) & ~(0x31 ^ 0x2C)) < 0) {
                            return false;
                        }
                    } else {
                        bl = lIIIlllllIllI[0];
                    }
                    return bl;
                }, (int)lIIIlllllIllI[104]);

                Time.sleepTicks((int)lIIIlllllIllI[1]);

            }
            if (N.lIlIIllIIllIIIl(N.cJ() ? 1 : 0)) {
                return;
            }
            if (N.lIlIIllIIllIIIl(var45.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && N.lIlIIllIIllIlII(var47 = TileObjects.getNearest(tileObject -> {
                int n2;
                if (N.lIlIIllIIllIIIl(tileObject.getName().contains(lIIIlllllIlIl[lIIIlllllIllI[232]]) ? 1 : 0) && N.lIlIIllIIlllIIl(tileObject.getWorldLocation().distanceTo(new WorldPoint(lIIIlllllIllI[131], lIIIlllllIllI[225], lIIIlllllIllI[2])), lIIIlllllIllI[2])) {
                    n2 = lIIIlllllIllI[1];

                    }
                } else {
                    n2 = lIIIlllllIllI[0];
                }
                return n2 != 0;
            }))) {
                AccBuilderRat.c = lIIIlllllIlIl[lIIIlllllIllI[150]];
                var46 = Skills.getExperience((Skill)Skill.AGILITY);
                var47.interact(lIIIlllllIlIl[lIIIlllllIllI[151]]);
                Time.sleepTicks((int)e.c(lIIIlllllIllI[1], lIIIlllllIllI[2]));

                Time.sleepUntil(() -> {
                    boolean bl;
                    if (N.lIlIIllIIllIlIl(Skills.getExperience((Skill)Skill.AGILITY), var46)) {
                        bl = lIIIlllllIllI[1];

                        if (-1 >= 3) {
                            return ((0x83 ^ 0xC7 ^ (0x4F ^ 0x48)) & (120 + 2 - 41 + 133 ^ 133 + 2 - 64 + 78 ^ -1)) != 0;
                        }
                    } else {
                        bl = lIIIlllllIllI[0];
                    }
                    return bl;
                }, (int)lIIIlllllIllI[104]);

                Time.sleepTicks((int)lIIIlllllIllI[1]);

            }
            if (N.lIlIIllIIllIIIl(N.cJ() ? 1 : 0)) {
                return;
            }
            if (N.lIlIIllIIllIIIl(var44.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && N.lIlIIllIIllIlII(var47 = TileObjects.getNearest(tileObject -> {
                int n2;
                if (N.lIlIIllIIllIIIl(tileObject.getName().contains(lIIIlllllIlIl[lIIIlllllIllI[230]]) ? 1 : 0) && N.lIlIIllIIlllIIl(tileObject.getWorldLocation().distanceTo(new WorldPoint(lIIIlllllIllI[139], lIIIlllllIllI[231], lIIIlllllIllI[2])), lIIIlllllIllI[2])) {
                    n2 = lIIIlllllIllI[1];

                } else {
                    n2 = lIIIlllllIllI[0];
                }
                return n2 != 0;
            }))) {
                AccBuilderRat.c = lIIIlllllIlIl[lIIIlllllIllI[152]];
                var46 = Skills.getExperience((Skill)Skill.AGILITY);
                var47.interact(lIIIlllllIlIl[lIIIlllllIllI[153]]);
                Time.sleepTicks((int)e.c(lIIIlllllIllI[1], lIIIlllllIllI[2]));

                Time.sleepUntil(() -> {
                    boolean bl;
                    if (N.lIlIIllIIllIlIl(Skills.getExperience((Skill)Skill.AGILITY), var46)) {
                        bl = lIIIlllllIllI[1];

                        if ((0xA4 ^ 0xA0) <= (1 & ~1)) {
                            return false;
                        }
                    } else {
                        bl = lIIIlllllIllI[0];
                    }
                    return bl;
                }, (int)lIIIlllllIllI[104]);

                Time.sleepTicks((int)lIIIlllllIllI[1]);

            }
            if (N.lIlIIllIIllIIIl(N.cJ() ? 1 : 0)) {
                return;
            }
            if (N.lIlIIllIIllIIIl(var43.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && N.lIlIIllIIllIlII(var47 = TileObjects.getNearest(tileObject -> {
                int n2;
                if (N.lIlIIllIIllIIIl(tileObject.getName().contains(lIIIlllllIlIl[lIIIlllllIllI[227]]) ? 1 : 0) && N.lIlIIllIIlllIIl(tileObject.getWorldLocation().distanceTo(new WorldPoint(lIIIlllllIllI[228], lIIIlllllIllI[229], lIIIlllllIllI[9])), lIIIlllllIllI[2])) {
                    n2 = lIIIlllllIllI[1];

                    if (3 > 3) {
                        return false;
                    }
                } else {
                    n2 = lIIIlllllIllI[0];
                }
                return n2 != 0;
            }))) {
                AccBuilderRat.c = lIIIlllllIlIl[lIIIlllllIllI[154]];
                var46 = Skills.getExperience((Skill)Skill.AGILITY);
                var47.interact(lIIIlllllIlIl[lIIIlllllIllI[155]]);
                Time.sleepTicks((int)e.c(lIIIlllllIllI[1], lIIIlllllIllI[2]));

                Time.sleepUntil(() -> {
                    boolean bl;
                    if (N.lIlIIllIIllIlIl(Skills.getExperience((Skill)Skill.AGILITY), var46)) {
                        bl = lIIIlllllIllI[1];

                        if ((0x1B ^ 0x1F) < 2) {
                            return false;
                        }
                    } else {
                        bl = lIIIlllllIllI[0];
                    }
                    return bl;
                }, (int)lIIIlllllIllI[104]);

                Time.sleepTicks((int)lIIIlllllIllI[1]);

            }
            if (N.lIlIIllIIllIIIl(N.cJ() ? 1 : 0)) {
                return;
            }
            if (N.lIlIIllIIllIIIl(var42.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && N.lIlIIllIIllIlII(var47 = TileObjects.getNearest(tileObject -> {
                int n2;
                if (N.lIlIIllIIllIIIl(tileObject.getName().contains(lIIIlllllIlIl[lIIIlllllIllI[226]]) ? 1 : 0) && N.lIlIIllIIlllIIl(tileObject.getWorldLocation().distanceTo(new WorldPoint(lIIIlllllIllI[8], lIIIlllllIllI[130], lIIIlllllIllI[2])), lIIIlllllIllI[2])) {
                    n2 = lIIIlllllIllI[1];

                } else {
                    n2 = lIIIlllllIllI[0];
                }
                return n2 != 0;
            }))) {
                AccBuilderRat.c = lIIIlllllIlIl[lIIIlllllIllI[156]];
                var46 = Skills.getExperience((Skill)Skill.AGILITY);
                var47.interact(lIIIlllllIlIl[lIIIlllllIllI[157]]);
                Time.sleepTicks((int)e.c(lIIIlllllIllI[1], lIIIlllllIllI[2]));

                Time.sleepUntil(() -> {
                    boolean bl;
                    if (N.lIlIIllIIllIlIl(Skills.getExperience((Skill)Skill.AGILITY), var46)) {
                        bl = lIIIlllllIllI[1];

                        if ((0x51 ^ 0x55) < 2) {
                            return false;
                        }
                    } else {
                        bl = lIIIlllllIllI[0];
                    }
                    return bl;
                }, (int)lIIIlllllIllI[104]);

                Time.sleepTicks((int)lIIIlllllIllI[1]);

            }
            if (N.lIlIIllIIllIIIl(N.cJ() ? 1 : 0)) {
                return;
            }
            if (N.lIlIIllIIllIIIl(var41.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && N.lIlIIllIIllIlII(var47 = TileObjects.getNearest(tileObject -> {
                int n2;
                if (N.lIlIIllIIllIIIl(tileObject.getName().contains(lIIIlllllIlIl[lIIIlllllIllI[224]]) ? 1 : 0) && N.lIlIIllIIlllIIl(tileObject.getWorldLocation().distanceTo(new WorldPoint(lIIIlllllIllI[225], lIIIlllllIllI[215], lIIIlllllIllI[9])), lIIIlllllIllI[2])) {
                    n2 = lIIIlllllIllI[1];

                    if (2 > 2) {
                        return ((3 ^ 0xD ^ (0x72 ^ 0x5C)) & (0xD ^ 0x75 ^ (0xC7 ^ 0x9F) ^ -1)) != 0;
                    }
                } else {
                    n2 = lIIIlllllIllI[0];
                }
                return n2 != 0;
            }))) {
                AccBuilderRat.c = lIIIlllllIlIl[lIIIlllllIllI[158]];
                var46 = Skills.getExperience((Skill)Skill.AGILITY);
                var47.interact(lIIIlllllIlIl[lIIIlllllIllI[159]]);
                Time.sleepTicks((int)e.c(lIIIlllllIllI[1], lIIIlllllIllI[2]));

                Time.sleepUntil(() -> {
                    boolean bl;
                    if (N.lIlIIllIIllIlIl(Skills.getExperience((Skill)Skill.AGILITY), var46)) {
                        bl = lIIIlllllIllI[1];

                        if (((0x31 ^ 0x17 ^ (0xD2 ^ 0xA8)) & (0x36 ^ 0x56 ^ (0x9F ^ 0xA3) ^ -1)) > ((182 + 139 - 136 + 3 ^ 108 + 107 - 70 + 35) & (128 + 86 - 186 + 108 ^ 101 + 66 - 153 + 114 ^ -1))) {
                            return (((0x32 ^ 0x3F) & ~(0x37 ^ 0x3A) ^ (0xC3 ^ 0x8A)) & (0x54 ^ 0x3C ^ (0xE0 ^ 0xC1) ^ -1)) != 0;
                        }
                    } else {
                        bl = lIIIlllllIllI[0];
                    }
                    return bl;
                }, (int)lIIIlllllIllI[104]);

                Time.sleepTicks((int)lIIIlllllIllI[1]);

            }
            if (N.lIlIIllIIllIIIl(N.cJ() ? 1 : 0)) {
                return;
            }
            if (N.lIlIIllIIllIIIl(var40.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && N.lIlIIllIIllIlII(var47 = TileObjects.getNearest(tileObject -> {
                int n2;
                if (N.lIlIIllIIllIIIl(tileObject.getName().contains(lIIIlllllIlIl[lIIIlllllIllI[221]]) ? 1 : 0) && N.lIlIIllIIlllIIl(tileObject.getWorldLocation().distanceTo(new WorldPoint(lIIIlllllIllI[222], lIIIlllllIllI[223], lIIIlllllIllI[2])), lIIIlllllIllI[2])) {
                    n2 = lIIIlllllIllI[1];

                    }
                } else {
                    n2 = lIIIlllllIllI[0];
                }
                return n2 != 0;
            }))) {
                AccBuilderRat.c = lIIIlllllIlIl[lIIIlllllIllI[160]];
                var46 = Skills.getExperience((Skill)Skill.AGILITY);
                var47.interact(lIIIlllllIlIl[lIIIlllllIllI[161]]);
                Time.sleepTicks((int)e.c(lIIIlllllIllI[1], lIIIlllllIllI[2]));

                Time.sleepUntil(() -> {
                    boolean bl;
                    if (N.lIlIIllIIllIlIl(Skills.getExperience((Skill)Skill.AGILITY), var46)) {
                        bl = lIIIlllllIllI[1];

                        if (-(0x4E ^ 0x1A ^ (0x72 ^ 0x22)) > 0) {
                            return ((0x69 ^ 0x73 ^ (0x55 ^ 0x62)) & (0xFB ^ 0x90 ^ (0xF0 ^ 0xB6) ^ -1)) != 0;
                        }
                    } else {
                        bl = lIIIlllllIllI[0];
                    }
                    return bl;
                }, (int)lIIIlllllIllI[104]);

                Time.sleepTicks((int)lIIIlllllIllI[1]);

            }
        }
    }

    /*
     * WARNING - void declaration
     */
    private static boolean cJ() {
        WorldArea worldArea = new WorldArea(lIIIlllllIllI[80], lIIIlllllIllI[81], lIIIlllllIllI[69], lIIIlllllIllI[64], lIIIlllllIllI[0]);
        WorldArea worldArea2 = new WorldArea(lIIIlllllIllI[82], lIIIlllllIllI[81], lIIIlllllIllI[11], lIIIlllllIllI[64], lIIIlllllIllI[9]);
        WorldArea worldArea3 = new WorldArea(lIIIlllllIllI[83], lIIIlllllIllI[84], lIIIlllllIllI[63], lIIIlllllIllI[49], lIIIlllllIllI[9]);
        WorldArea worldArea4 = new WorldArea(lIIIlllllIllI[189], lIIIlllllIllI[190], lIIIlllllIllI[24], lIIIlllllIllI[18], lIIIlllllIllI[1]);
        WorldArea worldArea5 = new WorldArea(lIIIlllllIllI[85], lIIIlllllIllI[87], lIIIlllllIllI[11], lIIIlllllIllI[24], lIIIlllllIllI[9]);
        WorldArea worldArea6 = new WorldArea(lIIIlllllIllI[191], lIIIlllllIllI[192], lIIIlllllIllI[73], lIIIlllllIllI[38], lIIIlllllIllI[9]);
        WorldArea worldArea7 = new WorldArea(lIIIlllllIllI[90], lIIIlllllIllI[91], lIIIlllllIllI[66], lIIIlllllIllI[64], lIIIlllllIllI[9]);
        WorldArea worldArea8 = new WorldArea(lIIIlllllIllI[92], lIIIlllllIllI[93], lIIIlllllIllI[22], lIIIlllllIllI[26], lIIIlllllIllI[9]);
        WorldArea worldArea9 = new WorldArea(lIIIlllllIllI[92], lIIIlllllIllI[94], lIIIlllllIllI[11], lIIIlllllIllI[22], lIIIlllllIllI[9]);
        WorldArea worldArea10 = new WorldArea(lIIIlllllIllI[127], lIIIlllllIllI[128], lIIIlllllIllI[49], lIIIlllllIllI[11], lIIIlllllIllI[2]);
        WorldArea worldArea11 = new WorldArea(lIIIlllllIllI[129], lIIIlllllIllI[127], lIIIlllllIllI[49], lIIIlllllIllI[24], lIIIlllllIllI[2]);
        WorldArea worldArea12 = new WorldArea(lIIIlllllIllI[130], lIIIlllllIllI[131], lIIIlllllIllI[63], lIIIlllllIllI[49], lIIIlllllIllI[2]);
        WorldArea worldArea13 = new WorldArea(lIIIlllllIllI[132], lIIIlllllIllI[133], lIIIlllllIllI[11], lIIIlllllIllI[64], lIIIlllllIllI[9]);
        WorldArea worldArea14 = new WorldArea(lIIIlllllIllI[134], lIIIlllllIllI[8], lIIIlllllIllI[49], lIIIlllllIllI[26], lIIIlllllIllI[2]);
        WorldArea worldArea15 = new WorldArea(lIIIlllllIllI[135], lIIIlllllIllI[136], lIIIlllllIllI[68], lIIIlllllIllI[53], lIIIlllllIllI[9]);
        WorldArea worldArea16 = new WorldArea(lIIIlllllIllI[137], lIIIlllllIllI[138], lIIIlllllIllI[63], lIIIlllllIllI[64], lIIIlllllIllI[2]);
        WorldArea worldArea17 = new WorldArea(lIIIlllllIllI[164], lIIIlllllIllI[133], lIIIlllllIllI[64], lIIIlllllIllI[11], lIIIlllllIllI[9]);
        WorldArea worldArea18 = new WorldArea(lIIIlllllIllI[165], lIIIlllllIllI[139], lIIIlllllIllI[38], lIIIlllllIllI[53], lIIIlllllIllI[2]);
        WorldArea worldArea19 = new WorldArea(lIIIlllllIllI[166], lIIIlllllIllI[134], lIIIlllllIllI[49], lIIIlllllIllI[26], lIIIlllllIllI[2]);
        WorldArea worldArea20 = new WorldArea(lIIIlllllIllI[167], lIIIlllllIllI[136], lIIIlllllIllI[70], lIIIlllllIllI[64], lIIIlllllIllI[9]);
        WorldArea worldArea21 = new WorldArea(lIIIlllllIllI[168], lIIIlllllIllI[169], lIIIlllllIllI[54], lIIIlllllIllI[63], lIIIlllllIllI[2]);
        WorldArea[] worldAreaArray = new WorldArea[lIIIlllllIllI[68]];
        worldAreaArray[N.lIIIlllllIllI[0]] = worldArea;
        worldAreaArray[N.lIIIlllllIllI[1]] = worldArea2;
        worldAreaArray[N.lIIIlllllIllI[2]] = worldArea3;
        worldAreaArray[N.lIIIlllllIllI[9]] = worldArea4;
        worldAreaArray[N.lIIIlllllIllI[16]] = worldArea5;
        worldAreaArray[N.lIIIlllllIllI[18]] = worldArea6;
        worldAreaArray[N.lIIIlllllIllI[20]] = worldArea7;
        worldAreaArray[N.lIIIlllllIllI[22]] = worldArea8;
        worldAreaArray[N.lIIIlllllIllI[24]] = worldArea9;
        worldAreaArray[N.lIIIlllllIllI[26]] = worldArea10;
        worldAreaArray[N.lIIIlllllIllI[11]] = worldArea11;
        worldAreaArray[N.lIIIlllllIllI[49]] = worldArea12;
        worldAreaArray[N.lIIIlllllIllI[63]] = worldArea13;
        worldAreaArray[N.lIIIlllllIllI[64]] = worldArea14;
        worldAreaArray[N.lIIIlllllIllI[53]] = worldArea15;
        worldAreaArray[N.lIIIlllllIllI[38]] = worldArea16;
        worldAreaArray[N.lIIIlllllIllI[65]] = worldArea17;
        worldAreaArray[N.lIIIlllllIllI[66]] = worldArea18;
        worldAreaArray[N.lIIIlllllIllI[54]] = worldArea19;
        worldAreaArray[N.lIIIlllllIllI[67]] = worldArea20;
        worldAreaArray[N.lIIIlllllIllI[40]] = worldArea21;
        WorldArea[] worldAreaArray2 = worldAreaArray;
        int[] nArray = new int[lIIIlllllIllI[1]];
        nArray[N.lIIIlllllIllI[0]] = lIIIlllllIllI[193];
        if (N.lIlIIllIIllIlII(TileItems.getNearest((int[])nArray))) {
            void var49;
            System.out.println(lIIIlllllIlIl[lIIIlllllIllI[194]]);
            int var50 = lIIIlllllIllI[0];
            while (N.lIlIIllIIllIIlI(var50, ((void)var49).length)) {
                int[] nArray2 = new int[lIIIlllllIllI[1]];
                nArray2[N.lIIIlllllIllI[0]] = lIIIlllllIllI[193];
                if (N.lIlIIllIIllIIIl(var49[var50].contains(TileItems.getNearest((int[])nArray2).getWorldLocation()) ? 1 : 0) && N.lIlIIllIIllIIIl(var49[var50].contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    return lIIIlllllIllI[1];
                }
                ++var50;

                if (1 != (0x18 ^ 0x45 ^ (0x78 ^ 0x21))) continue;
                return ((0x80 ^ 0x9B ^ (0x80 ^ 0xB5)) & (0x2C ^ 0x7C ^ (0x52 ^ 0x2C) ^ -1)) != 0;
            }
        }
        return lIIIlllllIllI[0];
    }

    private static boolean lIlIIllIIllIIlI(int n2, int n3) {
        return n2 < n3;
    }

    public static void cE() {
        if (N.lIlIIllIIllIIIl(by ? 1 : 0)) {
            AccBuilderRat.c = lIIIlllllIlIl[lIIIlllllIllI[0]];
            b.a(bA);
            if (N.lIlIIllIIllIIlI(bA.size(), lIIIlllllIllI[1])) {
                System.out.println(lIIIlllllIlIl[lIIIlllllIllI[1]]);
                by = lIIIlllllIllI[0];
            }
        }
        if (N.lIlIIllIIllIIll(by ? 1 : 0)) {
            if (N.lIlIIllIIllIIll(N.S() ? 1 : 0)) {
                BankLocation var51 = BankLocation.getNearest();
                if (N.lIlIIllIIllIlII(var51) && N.lIlIIllIIllIIll(var51.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderRat.c = lIIIlllllIlIl[lIIIlllllIllI[2]];
                    WorldArea var52 = new WorldArea(lIIIlllllIllI[3], lIIIlllllIllI[4], lIIIlllllIllI[5], lIIIlllllIllI[6], lIIIlllllIllI[0]);
                    if (N.lIlIIllIIllIIIl(var52.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        WorldPoint var53 = new WorldPoint(lIIIlllllIllI[7], lIIIlllllIllI[8], lIIIlllllIllI[0]);
                        if (N.lIlIIllIIllIlIl(Players.getLocal().getWorldLocation().distanceTo(var53), lIIIlllllIllI[9])) {
                            Movement.walkTo((WorldPoint)var53);

                            Time.sleepTicks((int)lIIIlllllIllI[1]);

                        }
                    }
                    a.a(var51);
                }
                if (N.lIlIIllIIllIlII(var51) && N.lIlIIllIIllIIIl(var51.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderRat.c = lIIIlllllIlIl[lIIIlllllIllI[9]];
                    if (N.lIlIIllIIllIIll(Bank.isOpen() ? 1 : 0)) {
                        a.a();
                        Time.sleepUntil(() -> Bank.isOpen(), (int)lIIIlllllIllI[10]);

                    }
                    if (N.lIlIIllIIllIIIl(Bank.isOpen() ? 1 : 0)) {
                        if (N.lIlIIllIIllIllI(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks((int)lIIIlllllIllI[1]);

                        }
                        if (N.lIlIIllIIllIllI(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks((int)lIIIlllllIllI[2]);

                        }
                    }
                    int[] nArray = new int[lIIIlllllIllI[11]];
                    nArray[N.lIIIlllllIllI[0]] = lIIIlllllIllI[12];
                    nArray[N.lIIIlllllIllI[1]] = lIIIlllllIllI[13];
                    nArray[N.lIIIlllllIllI[2]] = lIIIlllllIllI[14];
                    nArray[N.lIIIlllllIllI[9]] = lIIIlllllIllI[15];
                    nArray[N.lIIIlllllIllI[16]] = lIIIlllllIllI[17];
                    nArray[N.lIIIlllllIllI[18]] = lIIIlllllIllI[19];
                    nArray[N.lIIIlllllIllI[20]] = lIIIlllllIllI[21];
                    nArray[N.lIIIlllllIllI[22]] = lIIIlllllIllI[23];
                    nArray[N.lIIIlllllIllI[24]] = lIIIlllllIllI[25];
                    nArray[N.lIIIlllllIllI[26]] = lIIIlllllIllI[27];
                    if (N.lIlIIllIIllIIll(e.b(nArray) ? 1 : 0)) {
                        N.W();
                        System.out.println(lIIIlllllIlIl[lIIIlllllIllI[16]]);
                        by = lIIIlllllIllI[1];
                        return;
                    }
                    int[] nArray2 = new int[lIIIlllllIllI[11]];
                    nArray2[N.lIIIlllllIllI[0]] = lIIIlllllIllI[12];
                    nArray2[N.lIIIlllllIllI[1]] = lIIIlllllIllI[13];
                    nArray2[N.lIIIlllllIllI[2]] = lIIIlllllIllI[14];
                    nArray2[N.lIIIlllllIllI[9]] = lIIIlllllIllI[15];
                    nArray2[N.lIIIlllllIllI[16]] = lIIIlllllIllI[17];
                    nArray2[N.lIIIlllllIllI[18]] = lIIIlllllIllI[19];
                    nArray2[N.lIIIlllllIllI[20]] = lIIIlllllIllI[21];
                    nArray2[N.lIIIlllllIllI[22]] = lIIIlllllIllI[23];
                    nArray2[N.lIIIlllllIllI[24]] = lIIIlllllIllI[25];
                    nArray2[N.lIIIlllllIllI[26]] = lIIIlllllIllI[27];
                    if (N.lIlIIllIIllIIIl(e.b(nArray2) ? 1 : 0)) {
                        a.a(lIIIlllllIllI[28], lIIIlllllIllI[1]);
                        a.a(lIIIlllllIllI[29], lIIIlllllIllI[1]);
                        a.a(lIIIlllllIllI[30], lIIIlllllIllI[1]);
                        a.a(lIIIlllllIllI[31], lIIIlllllIllI[1]);
                        a.a(lIIIlllllIllI[32], lIIIlllllIllI[1]);
                        a.a(lIIIlllllIllI[33], lIIIlllllIllI[1]);
                        a.a(lIIIlllllIllI[34], lIIIlllllIllI[1]);
                        int[] nArray3 = new int[lIIIlllllIllI[1]];
                        nArray3[N.lIIIlllllIllI[0]] = lIIIlllllIllI[28];
                        if (N.lIlIIllIIllIIll(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                            int[] nArray4 = new int[lIIIlllllIllI[1]];
                            nArray4[N.lIIIlllllIllI[0]] = lIIIlllllIllI[28];
                            if (N.lIlIIllIIllIIll(Equipment.contains((int[])nArray4) ? 1 : 0)) {
                                int[] nArray5 = new int[lIIIlllllIllI[1]];
                                nArray5[N.lIIIlllllIllI[0]] = lIIIlllllIllI[28];
                                if (N.lIlIIllIIllIIll(Bank.contains((int[])nArray5) ? 1 : 0)) {
                                    a.a(lIIIlllllIllI[35], lIIIlllllIllI[1]);
                                }
                            }
                        }
                        a.a(lIIIlllllIllI[17], lIIIlllllIllI[1]);
                        e.l(lIIIlllllIllI[28]);
                        e.l(lIIIlllllIllI[29]);
                        e.l(lIIIlllllIllI[30]);
                        e.l(lIIIlllllIllI[31]);
                        e.l(lIIIlllllIllI[32]);
                        Time.sleepTicks((int)lIIIlllllIllI[1]);

                        e.l(lIIIlllllIllI[34]);
                        e.l(lIIIlllllIllI[36]);
                        e.l(lIIIlllllIllI[33]);
                        e.l(lIIIlllllIllI[35]);
                        e.l(lIIIlllllIllI[17]);
                        Time.sleepTicks((int)lIIIlllllIllI[9]);

                        if (N.lIlIIllIIllIIll(Bank.isOpen() ? 1 : 0)) {
                            a.a();
                            Time.sleepTicks((int)lIIIlllllIllI[20]);

                        }
                        if (N.lIlIIllIIllIIIl(Bank.isOpen() ? 1 : 0)) {
                            if (N.lIlIIllIIllIIlI(Skills.getLevel((Skill)Skill.AGILITY), lIIIlllllIllI[37])) {
                                a.a(lIIIlllllIllI[12], lIIIlllllIllI[11]);
                                a.a(lIIIlllllIllI[13], lIIIlllllIllI[11]);
                                a.a(lIIIlllllIllI[21], lIIIlllllIllI[11]);
                                a.a(lIIIlllllIllI[14], lIIIlllllIllI[11]);
                                a.b(f.bk, lIIIlllllIllI[1]);
                                a.a(lIIIlllllIllI[27], lIIIlllllIllI[1]);
                                a.a(lIIIlllllIllI[19], lIIIlllllIllI[18]);
                                a.a(lIIIlllllIllI[23], lIIIlllllIllI[38]);
                            }
                            if (N.lIlIIllIIllIlll(Skills.getLevel((Skill)Skill.AGILITY), lIIIlllllIllI[37])) {
                                a.a(lIIIlllllIllI[12], lIIIlllllIllI[11]);
                                a.a(lIIIlllllIllI[21], lIIIlllllIllI[11]);
                                a.a(lIIIlllllIllI[25], lIIIlllllIllI[11]);
                                a.b(f.bk, lIIIlllllIllI[1]);
                                a.a(lIIIlllllIllI[27], lIIIlllllIllI[1]);
                                a.a(lIIIlllllIllI[19], lIIIlllllIllI[24]);
                                a.a(lIIIlllllIllI[23], lIIIlllllIllI[11]);
                            }
                        }
                    }
                }
            }
            if (N.lIlIIllIIllIIIl(N.S() ? 1 : 0)) {
                String[] stringArray = new String[lIIIlllllIllI[1]];
                stringArray[N.lIIIlllllIllI[0]] = lIIIlllllIlIl[lIIIlllllIllI[18]];
                if (N.lIlIIllIIllIIIl(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    String[] stringArray2 = new String[lIIIlllllIllI[1]];
                    stringArray2[N.lIIIlllllIllI[0]] = lIIIlllllIlIl[lIIIlllllIllI[20]];
                    Inventory.getFirst((String[])stringArray2).interact(lIIIlllllIlIl[lIIIlllllIllI[22]]);
                }
                if (N.lIlIIllIIllIIIl(Inventory.contains((int[])f.ba) ? 1 : 0) && N.lIlIIllIIllIIlI(Movement.getRunEnergy(), lIIIlllllIllI[39])) {
                    Inventory.getFirst((int[])f.ba).interact(lIIIlllllIlIl[lIIIlllllIllI[24]]);
                    Time.sleepTicks((int)lIIIlllllIllI[1]);

                }
                if (N.lIlIIllIIllIlIl(Combat.getMissingHealth(), lIIIlllllIllI[40])) {
                    int[] nArray = new int[lIIIlllllIllI[1]];
                    nArray[N.lIIIlllllIllI[0]] = lIIIlllllIllI[23];
                    if (N.lIlIIllIIllIIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        int[] nArray6 = new int[lIIIlllllIllI[1]];
                        nArray6[N.lIIIlllllIllI[0]] = lIIIlllllIllI[23];
                        Inventory.getFirst((int[])nArray6).interact(lIIIlllllIlIl[lIIIlllllIllI[26]]);
                        Time.sleepTicks((int)lIIIlllllIllI[2]);

                    }
                }
                if (N.lIlIIllIIllIlIl(Movement.getRunEnergy(), lIIIlllllIllI[41]) && N.lIlIIllIIllIIll(Movement.isRunEnabled() ? 1 : 0)) {
                    Movement.toggleRun();
                }
                if (N.lIlIIllIIllIIlI(Skills.getLevel((Skill)Skill.AGILITY), lIIIlllllIllI[42])) {
                    N.cF();
                }
                if ((!N.lIlIIllIIllIlll(e.j(lIIIlllllIllI[43]), lIIIlllllIllI[44]) || N.lIlIIllIIllIIlI(e.j(lIIIlllllIllI[45]), lIIIlllllIllI[18])) && N.lIlIIllIIllIlll(Skills.getLevel((Skill)Skill.AGILITY), lIIIlllllIllI[42]) && N.lIlIIllIIllIIlI(Skills.getLevel((Skill)Skill.AGILITY), lIIIlllllIllI[44])) {
                    N.cG();
                }
                if (N.lIlIIllIIllIlll(e.j(lIIIlllllIllI[43]), lIIIlllllIllI[44]) && N.lIlIIllIIllIlll(e.j(lIIIlllllIllI[45]), lIIIlllllIllI[18])) {
                    if (N.lIlIIllIIllIlll(Skills.getLevel((Skill)Skill.AGILITY), lIIIlllllIllI[42]) && N.lIlIIllIIllIIlI(Skills.getLevel((Skill)Skill.AGILITY), lIIIlllllIllI[37])) {
                        N.cG();
                    }
                    if (N.lIlIIllIIllIlll(Skills.getLevel((Skill)Skill.AGILITY), lIIIlllllIllI[37]) && N.lIlIIllIIllIIlI(Skills.getLevel((Skill)Skill.AGILITY), lIIIlllllIllI[44])) {
                        N.cH();
                    }
                }
                if (N.lIlIIllIIllIlll(Skills.getLevel((Skill)Skill.AGILITY), lIIIlllllIllI[44])) {
                    N.cI();
                }
            }
        }
    }

    private static boolean lIlIIllIIllIIll(int n2) {
        return n2 == 0;
    }

    private static boolean lIlIIllIIllIlII(Object object) {
        return object != null;
    }
}

