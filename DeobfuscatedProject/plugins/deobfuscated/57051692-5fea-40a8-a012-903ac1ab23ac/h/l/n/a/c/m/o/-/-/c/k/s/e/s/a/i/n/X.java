/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Actor
 *  net.runelite.api.Item
 *  net.runelite.api.Skill
 *  net.runelite.api.TileItem
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.widgets.Widget
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Game
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.input.Mouse
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.Walker
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 *  net.unethicalite.api.widgets.Dialog
 */
package h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n;

import gg.squire.account.AccBuilderShamans;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.K;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.a;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.b;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.d;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.e;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.f;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.g;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.j;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashMap;
import java.util.List;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Actor;
import net.runelite.api.Item;
import net.runelite.api.Skill;
import net.runelite.api.TileItem;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Game;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.input.Mouse;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.Walker;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;

public class X
implements K {
    public static /* synthetic */ List<d> bp;
    static final /* synthetic */ WorldPoint kR;
    private static /* synthetic */ String[] lIlIIIlIII;
    public static final /* synthetic */ WorldPoint kO;
    static final /* synthetic */ WorldPoint kQ;
    private final /* synthetic */ int kS = 536;
    static final /* synthetic */ WorldPoint kP;
    public static final /* synthetic */ WorldPoint kN;
    public static final /* synthetic */ WorldPoint kM;
    public static final /* synthetic */ WorldPoint kL;
    public static /* synthetic */ boolean bn;
    private static /* synthetic */ int[] lIlIIIlIll;

    private static boolean lIIIlIlIIIllI(int n2, int n3) {
        return n2 >= n3;
    }

    private static void O() {
        d llllllllllllllllllllIlIIlIlIllll;
        Object llllllllllllllllllllIlIIlIllIIII;
        int[] nArray = new int[lIlIIIlIll[2]];
        nArray[X.lIlIIIlIll[1]] = lIlIIIlIll[8];
        if (X.lIIIlIlIIIIII(Bank.contains((int[])nArray) ? 1 : 0)) {
            d d2 = new d(lIlIIIlIll[8], lIlIIIlIll[13], j.bZ);
            bp.add(d2);
            0;
        }
        int[] nArray2 = new int[lIlIIIlIll[2]];
        nArray2[X.lIlIIIlIll[1]] = lIlIIIlIll[0];
        if (X.lIIIlIlIIIIII(Bank.contains((int[])nArray2) ? 1 : 0)) {
            llllllllllllllllllllIlIIlIllIIII = new d(lIlIIIlIll[0], X.dh(), lIlIIIlIll[63]);
            bp.add((d)llllllllllllllllllllIlIIlIllIIII);
            0;
        }
        int[] nArray3 = new int[lIlIIIlIll[2]];
        nArray3[X.lIlIIIlIll[1]] = lIlIIIlIll[7];
        if (X.lIIIlIlIIIIII(Bank.contains((int[])nArray3) ? 1 : 0)) {
            llllllllllllllllllllIlIIlIllIIII = new d(lIlIIIlIll[7], lIlIIIlIll[3], lIlIIIlIll[5]);
            bp.add((d)llllllllllllllllllllIlIIlIllIIII);
            0;
        }
        if (X.lIIIlIlIIIIII(Bank.contains((Predicate)(llllllllllllllllllllIlIIlIllIIII = item -> item.getName().toLowerCase().contains(lIlIIIlIII[lIlIIIlIll[77]]))) ? 1 : 0)) {
            llllllllllllllllllllIlIIlIlIllll = new d(lIlIIIlIll[64], lIlIIIlIll[13], lIlIIIlIll[65]);
            bp.add(llllllllllllllllllllIlIIlIlIllll);
            0;
        }
        int[] nArray4 = new int[lIlIIIlIll[2]];
        nArray4[X.lIlIIIlIll[1]] = lIlIIIlIll[66];
        if (X.lIIIlIlIIIIII(Bank.contains((int[])nArray4) ? 1 : 0)) {
            llllllllllllllllllllIlIIlIlIllll = new d(lIlIIIlIll[66], lIlIIIlIll[67], lIlIIIlIll[68]);
            bp.add(llllllllllllllllllllIlIIlIlIllll);
            0;
        }
    }

    public X() {
        this.kS = lIlIIIlIll[0];
    }

    private static boolean lIIIlIlIIIlIl(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean lIIIlIlIIIIlI(int n2) {
        return n2 > 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean al() {
        int n2;
        block2: {
            block3: {
                int[] nArray = new int[lIlIIIlIll[2]];
                nArray[X.lIlIIIlIll[1]] = lIlIIIlIll[9];
                if (!X.lIIIlIIlllllI(Inventory.contains((int[])nArray) ? 1 : 0)) break block2;
                int[] nArray2 = new int[lIlIIIlIll[2]];
                nArray2[X.lIlIIIlIll[1]] = lIlIIIlIll[9];
                if (!X.lIIIlIlIIIllI(Inventory.getFirst((int[])nArray2).getQuantity(), lIlIIIlIll[12])) break block2;
                if (!X.lIIIlIlIIIIII(Inventory.contains((int[])f.aZ) ? 1 : 0)) break block3;
                if (!X.lIIIlIIlllllI(Equipment.contains((int[])f.aZ) ? 1 : 0)) break block2;
                int[] nArray3 = new int[lIlIIIlIll[2]];
                nArray3[X.lIlIIIlIll[1]] = lIlIIIlIll[0];
                if (!X.lIIIlIlIIIIII(Inventory.contains((int[])nArray3) ? 1 : 0)) break block3;
                int[] nArray4 = new int[lIlIIIlIll[2]];
                nArray4[X.lIlIIIlIll[1]] = lIlIIIlIll[50];
                if (!X.lIIIlIIlllllI(Inventory.contains((int[])nArray4) ? 1 : 0)) break block2;
            }
            n2 = lIlIIIlIll[2];
            0;
            if (((0x9C ^ 0xA6 ^ (0x30 ^ 0x20)) & (68 + 40 - 3 + 45 ^ 73 + 168 - 214 + 161 ^ -1)) > -1) return n2 != 0;
            return ((0x51 ^ 0x5F ^ (0x51 ^ 0x17)) & (114 + 27 - 99 + 165 ^ 21 + 86 - 54 + 82 ^ -1)) != 0;
        }
        n2 = lIlIIIlIll[1];
        return n2 != 0;
    }

    @Override
    public boolean ac() {
        return lIlIIIlIll[1];
    }

    private static void lIIIlIIllIlII() {
        lIlIIIlIII = new String[lIlIIIlIll[87]];
        X.lIlIIIlIII[X.lIlIIIlIll[1]] = X."Buying items";
        X.lIlIIIlIII[X.lIlIIIlIll[2]] = X."Finished buying items, switching back to prayer";
        X.lIlIIIlIII[X.lIlIIIlIll[3]] = X."Navigating to bank";
        X.lIlIIIlIII[X.lIlIIIlIll[4]] = X."Handling banking";
        X.lIlIIIlIII[X.lIlIIIlIll[6]] = X."We are missing prayer supplies, switching to BUYING";
        X.lIlIIIlIII[X.lIlIIIlIll[13]] = X."Drink";
        X.lIlIIIlIII[X.lIlIIIlIll[15]] = X."Tele to wildy";
        X.lIlIIIlIII[X.lIlIIIlIll[17]] = X."Rub";
        X.lIlIIIlIII[X.lIlIIIlIll[18]] = X."Lava Maze";
        X.lIlIIIlIII[X.lIlIIIlIll[19]] = X."Okay, teleport to level 41 Wilderness.";
        X.lIlIIIlIII[X.lIlIIIlIll[21]] = X."Nav to altar";
        X.lIlIIIlIII[X.lIlIIIlIll[41]] = X."1 tick pray";
        X.lIlIIIlIII[X.lIlIIIlIll[44]] = X."Chaos altar";
        X.lIlIIIlIII[X.lIlIIIlIll[20]] = X."Large door";
        X.lIlIIIlIII[X.lIlIIIlIll[46]] = X."Open";
        X.lIlIIIlIII[X.lIlIIIlIll[47]] = X."Open";
        X.lIlIIIlIII[X.lIlIIIlIll[48]] = X."Open";
        X.lIlIIIlIII[X.lIlIIIlIll[49]] = X."Chaos altar";
        X.lIlIIIlIII[X.lIlIIIlIll[51]] = X."Nav to altar";
        X.lIlIIIlIII[X.lIlIIIlIll[52]] = X."Unnoting bones";
        X.lIlIIIlIII[X.lIlIIIlIll[14]] = X."Elder Chaos druid";
        X.lIlIIIlIII[X.lIlIIIlIll[53]] = X."Large door";
        X.lIlIIIlIII[X.lIlIIIlIll[54]] = X."Open";
        X.lIlIIIlIII[X.lIlIIIlIll[55]] = X."Open";
        X.lIlIIIlIII[X.lIlIIIlIll[56]] = X."Open";
        X.lIlIIIlIII[X.lIlIIIlIll[57]] = X."Exchange";
        X.lIlIIIlIII[X.lIlIIIlIll[58]] = X."Exchange 5";
        X.lIlIIIlIII[X.lIlIIIlIll[59]] = X."Exchange All";
        X.lIlIIIlIII[X.lIlIIIlIll[60]] = X."Suiciding";
        X.lIlIIIlIII[X.lIlIIIlIll[61]] = X."Wine of zamorak";
        X.lIlIIIlIII[X.lIlIIIlIll[62]] = X."Take";
        X.lIlIIIlIII[X.lIlIIIlIll[75]] = X."Prayer training";
        X.lIlIIIlIII[X.lIlIIIlIll[77]] = X."ring of wealth (";
    }

    static {
        X.lIIIlIIllllIl();
        X.lIIIlIIllIlII();
        kL = new WorldPoint(lIlIIIlIll[78], lIlIIIlIll[79], lIlIIIlIll[1]);
        kM = new WorldPoint(lIlIIIlIll[80], lIlIIIlIll[81], lIlIIIlIll[1]);
        kN = new WorldPoint(lIlIIIlIll[82], lIlIIIlIll[83], lIlIIIlIll[1]);
        kO = new WorldPoint(lIlIIIlIll[84], lIlIIIlIll[43], lIlIIIlIll[1]);
        kP = new WorldPoint(lIlIIIlIll[1], lIlIIIlIll[1], lIlIIIlIll[1]);
        kQ = new WorldPoint(lIlIIIlIll[1], lIlIIIlIll[1], lIlIIIlIll[1]);
        kR = new WorldPoint(lIlIIIlIll[85], lIlIIIlIll[86], lIlIIIlIll[1]);
        bp = new ArrayList<d>();
    }

    @Override
    public boolean af() {
        boolean bl;
        if (X.lIIIlIlIIIllI(Skills.getLevel((Skill)Skill.PRAYER), lIlIIIlIll[76])) {
            bl = lIlIIIlIll[2];
            0;
            if (3 >= (0x4B ^ 0x4F)) {
                return ((0xE1 ^ 0x82) & ~(0x35 ^ 0x56)) != 0;
            }
        } else {
            bl = lIlIIIlIll[1];
        }
        return bl;
    }

    private static int dh() {
        int n2 = lIlIIIlIll[69];
        if (X.lIIIlIIllllll(Skills.getLevel((Skill)Skill.PRAYER), lIlIIIlIll[70]) && X.lIIIlIlIIIllI(Skills.getLevel((Skill)Skill.PRAYER), lIlIIIlIll[71])) {
            return (n2 - Skills.getExperience((Skill)Skill.PRAYER)) / lIlIIIlIll[72] + lIlIIIlIll[21];
        }
        int n3 = lIlIIIlIll[73];
        return (n3 - Skills.getExperience((Skill)Skill.PRAYER)) / lIlIIIlIll[72] + lIlIIIlIll[62];
    }

    private static boolean lIIIlIlIIIIll(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIIIlIlIIIIII(int n2) {
        return n2 == 0;
    }

    private static void lIIIlIIllllIl() {
        lIlIIIlIll = new int[88];
        X.lIlIIIlIll[0] = -(0xFFFFDCEB & 0x27F7) & (0xFFFF9FFF & 0x66FA);
        X.lIlIIIlIll[1] = 1 & ~1;
        X.lIlIIIlIll[2] = 1;
        X.lIlIIIlIll[3] = 2;
        X.lIlIIIlIll[4] = 3;
        X.lIlIIIlIll[5] = 0xFFFF9FB9 & 0x73CE;
        X.lIlIIIlIll[6] = 0xB0 ^ 0xB4;
        X.lIlIIIlIll[7] = 0xFFFFDAFE & 0x77AF;
        X.lIlIIIlIll[8] = -(0xFFFFEAA5 & 0x1D7F) & (0xFFFFB9FD & 0x7F77);
        X.lIlIIIlIll[9] = -(0xFFFFFC5D & 0x77AF) & (0xFFFFFFEF & 0x77FF);
        X.lIlIIIlIll[10] = -(0xFFFFD8FB & 0x775E) & (0xFFFFF9FD & 0x7F5F);
        X.lIlIIIlIll[11] = (0xC9 ^ 0xBD) + (0x14 ^ 0x1F) - (7 ^ 0x41) + (17 + 93 - 84 + 117);
        X.lIlIIIlIll[12] = 0x9C ^ 0xAE;
        X.lIlIIIlIll[13] = 0x41 ^ 0x44;
        X.lIlIIIlIll[14] = 0xE6 ^ 0xC0 ^ (0x5B ^ 0x69);
        X.lIlIIIlIll[15] = 0x82 ^ 0x84;
        X.lIlIIIlIll[16] = -1;
        X.lIlIIIlIll[17] = 0x80 ^ 0x87;
        X.lIlIIIlIll[18] = 0xC ^ 0x38 ^ (0x8A ^ 0xB6);
        X.lIlIIIlIll[19] = 0xF3 ^ 0x81 ^ (0x7D ^ 6);
        X.lIlIIIlIll[20] = 0x69 ^ 0x3F ^ (0x2C ^ 0x77);
        X.lIlIIIlIll[21] = 0x22 ^ 0x68 ^ (0xE3 ^ 0xA3);
        X.lIlIIIlIll[22] = -(0xFFFFF2AC & 0x6D77) & (0xFFFFEFF7 & 0x7BFF);
        X.lIlIIIlIll[23] = 0xFFFF8F86 & 0x7F7B;
        X.lIlIIIlIll[24] = -(0xFFFFD467 & 0x3BB9) & (0xFFFFDFF3 & 0x3BFE);
        X.lIlIIIlIll[25] = 0xFFFFBEFB & 0x4FFF;
        X.lIlIIIlIll[26] = -(0xFFFFE759 & 0x58A7) & (0xFFFFEFCF & 0x5BFB);
        X.lIlIIIlIll[27] = 0xFFFFAFFF & 0x5EF8;
        X.lIlIIIlIll[28] = -(0xFFFFFBFD & 0x7433) & (0xFFFFFFFF & 0x7BF7);
        X.lIlIIIlIll[29] = -(0xFFFFF18B & 0x7F75) & (0xFFFFFFF5 & Short.MAX_VALUE);
        X.lIlIIIlIll[30] = 0xFFFFEBCF & 0x1FF2;
        X.lIlIIIlIll[31] = -(0xFFFFFDAF & 0x3359) & (0xFFFFFFFD & 0x3FFB);
        X.lIlIIIlIll[32] = 0xFFFFDBBF & 0x2FFD;
        X.lIlIIIlIll[33] = 0xFFFFAEFE & 0x5FEF;
        X.lIlIIIlIll[34] = -(0xFFFFC599 & 0x7A6F) & (0xFFFFDBBF & 0x6FFF);
        X.lIlIIIlIll[35] = -(0xFFFFF617 & 0x79FE) & (0xFFFFFFFF & 0x7EFF);
        X.lIlIIIlIll[36] = 0xFFFF9FAF & 0x6BFF;
        X.lIlIIIlIll[37] = -(0xFFFFE755 & 0x38AF) & (0xFFFFEEFF & 0x3FEF);
        X.lIlIIIlIll[38] = 0xFFFF9BFF & 0x6FA7;
        X.lIlIIIlIll[39] = -(0xFFFFFFCF & 0x747B) & (0xFFFFFFEE & 0x7FFB);
        X.lIlIIIlIll[40] = 0xFFFFEB9E & 0x1FFB;
        X.lIlIIIlIll[41] = 0x9C ^ 0xA6 ^ (0x3F ^ 0xE);
        X.lIlIIIlIll[42] = -(0xFFFFFD7B & 0x76AD) & (0xFFFFFFFF & 0x7FBB);
        X.lIlIIIlIll[43] = -(0xFFFFE1FF & 0x7F14) & (0xFFFFEFFF & Short.MAX_VALUE);
        X.lIlIIIlIll[44] = 0xBA ^ 0xB6;
        X.lIlIIIlIll[45] = 0xFFFFBFEF & 0x4B9F;
        X.lIlIIIlIll[46] = 0x99 ^ 0xC3 ^ (0x4D ^ 0x19);
        X.lIlIIIlIll[47] = 0xA9 ^ 0xA6;
        X.lIlIIIlIll[48] = 21 + 112 - 11 + 5 ^ (0xAA ^ 0xC5);
        X.lIlIIIlIll[49] = 141 + 34 - 84 + 68 ^ 43 + 135 - 78 + 42;
        X.lIlIIIlIll[50] = -(0xFFFFFD7F & 0x36E7) & (0xFFFFBFFF & 0x767F);
        X.lIlIIIlIll[51] = 0x78 ^ 0x6A;
        X.lIlIIIlIll[52] = 0x3F ^ 0x4E ^ (0xD ^ 0x6F);
        X.lIlIIIlIll[53] = 0xEE ^ 0xC1 ^ (0x91 ^ 0xAB);
        X.lIlIIIlIll[54] = 43 + 3 - -23 + 92 ^ 123 + 76 - 35 + 19;
        X.lIlIIIlIll[55] = 0x6B ^ 0x41 ^ (0x84 ^ 0xB9);
        X.lIlIIIlIll[56] = 51 + 178 - 183 + 177 ^ 128 + 49 - 131 + 153;
        X.lIlIIIlIll[57] = 0x95 ^ 0x8C;
        X.lIlIIIlIll[58] = 0xB5 ^ 0xC1 ^ (0x32 ^ 0x5C);
        X.lIlIIIlIll[59] = 0x7D ^ 0x66;
        X.lIlIIIlIll[60] = 0x3D ^ 0x21;
        X.lIlIIIlIll[61] = 1 ^ (0xA0 ^ 0xBC);
        X.lIlIIIlIll[62] = 0x3B ^ 0x25;
        X.lIlIIIlIll[63] = -(0xFFFFEBEF & 0x5511) & (0xFFFFEBF3 & 0x5FFC);
        X.lIlIIIlIll[64] = 0xFFFFFECF & 0x2FFC;
        X.lIlIIIlIll[65] = 0xFFFFE1B8 & 0x7FEF;
        X.lIlIIIlIll[66] = -(0xFFFFE86F & 0x77B1) & (0xFFFFFFE7 & 0x7F7F);
        X.lIlIIIlIll[67] = 7 ^ 0x2F;
        X.lIlIIIlIll[68] = 0xFFFF9FD7 & 0x63AC;
        X.lIlIIIlIll[69] = 0xFFFFFDFF & 0x42F4E;
        X.lIlIIIlIll[70] = 0x7D ^ 0x41;
        X.lIlIIIlIll[71] = 0x72 ^ 0x7D ^ (0xBB ^ 0x99);
        X.lIlIIIlIll[72] = -(0xFFFFFF52 & 0x5EBF) & (0xFFFFDFD3 & Short.MAX_VALUE);
        X.lIlIIIlIll[73] = -(0xFFFFFAFF & 0xFB7) & (0xFFFFFBFE & 0xFEFF);
        X.lIlIIIlIll[74] = 0xF ^ 0x6E ^ (0x7A ^ 0x7F);
        X.lIlIIIlIll[75] = 0x78 ^ 0x67;
        X.lIlIIIlIll[76] = 0xFE ^ 0xC5 ^ (0xC3 ^ 0x9B);
        X.lIlIIIlIll[77] = 0x62 ^ 0x6F ^ (0x62 ^ 0x4F);
        X.lIlIIIlIll[78] = -(0xFFFFB43B & 0x6FEF) & (0xFFFFBFFF & 0x6FFF);
        X.lIlIIIlIll[79] = 0xFFFFCFDE & 0x3F25;
        X.lIlIIIlIll[80] = -(0xFFFFD26A & 0x6DD7) & (0xFFFFCFFF & 0x7BF3);
        X.lIlIIIlIll[81] = -(0xFFFFDFF3 & 0x211F) & (0xFFFFFFFF & 0xFFB);
        X.lIlIIIlIll[82] = 0xFFFFFFA7 & 0xBDE;
        X.lIlIIIlIll[83] = -(0x42 ^ 0x51) & (0xFFFFBFFF & 0x4EFF);
        X.lIlIIIlIll[84] = -(0xFFFFF6FB & 0x6D3F) & (0xFFFFEFBE & Short.MAX_VALUE);
        X.lIlIIIlIll[85] = -(0xFFFFFBD7 & 0x256A) & (0xFFFFBFF7 & 0x6D5F);
        X.lIlIIIlIll[86] = 0xFFFFADF3 & 0x5FAF;
        X.lIlIIIlIll[87] = 123 + 105 - 199 + 139 ^ 86 + 51 - 122 + 122;
    }

    private static boolean lIIIlIlIIIlII(int n2, int n3) {
        return n2 == n3;
    }

    public static void dg() {
        block44: {
            TileItem llllllllllllllllllllIlIIlIllIllI;
            block45: {
                if (X.lIIIlIIlllllI(bn ? 1 : 0)) {
                    AccBuilderShamans.c = lIlIIIlIII[lIlIIIlIll[1]];
                    b.a(bp);
                    if (X.lIIIlIIllllll(bp.size(), lIlIIIlIll[2])) {
                        System.out.println(lIlIIIlIII[lIlIIIlIll[2]]);
                        bn = lIlIIIlIll[1];
                    }
                }
                if (!X.lIIIlIlIIIIII(bn ? 1 : 0)) break block44;
                if (X.lIIIlIlIIIIII(X.al() ? 1 : 0) && X.lIIIlIIllllll(Game.getWildyLevel(), lIlIIIlIll[2])) {
                    llllllllllllllllllllIlIIlIllIllI = BankLocation.getNearest();
                    if (X.lIIIlIlIIIIIl(llllllllllllllllllllIlIIlIllIllI) && X.lIIIlIlIIIIII(llllllllllllllllllllIlIIlIllIllI.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderShamans.c = lIlIIIlIII[lIlIIIlIll[3]];
                        a.a((BankLocation)llllllllllllllllllllIlIIlIllIllI);
                    }
                    if (X.lIIIlIlIIIIIl(llllllllllllllllllllIlIIlIllIllI) && X.lIIIlIIlllllI(llllllllllllllllllllIlIIlIllIllI.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderShamans.c = lIlIIIlIII[lIlIIIlIll[4]];
                        if (X.lIIIlIlIIIIII(Bank.isOpen() ? 1 : 0)) {
                            a.a();
                            Time.sleepUntil(() -> Bank.isOpen(), (int)lIlIIIlIll[5]);
                            0;
                        }
                        if (X.lIIIlIIlllllI(Bank.isOpen() ? 1 : 0)) {
                            if (X.lIIIlIlIIIIlI(Inventory.getAll().size())) {
                                Bank.depositInventory();
                                Time.sleepTicks((int)lIlIIIlIll[6]);
                                0;
                            }
                            if (X.lIIIlIlIIIIlI(Equipment.getAll().size())) {
                                Bank.depositEquipment();
                                Time.sleepTicks((int)lIlIIIlIll[3]);
                                0;
                            }
                            int[] nArray = new int[lIlIIIlIll[4]];
                            nArray[X.lIlIIIlIll[1]] = lIlIIIlIll[7];
                            nArray[X.lIlIIIlIll[2]] = lIlIIIlIll[0];
                            nArray[X.lIlIIIlIll[3]] = lIlIIIlIll[8];
                            if (X.lIIIlIlIIIIII(e.b(nArray) ? 1 : 0)) {
                                X.O();
                                System.out.println(lIlIIIlIII[lIlIIIlIll[6]]);
                                bn = lIlIIIlIll[2];
                                return;
                            }
                            int[] nArray2 = new int[lIlIIIlIll[4]];
                            nArray2[X.lIlIIIlIll[1]] = lIlIIIlIll[7];
                            nArray2[X.lIlIIIlIll[2]] = lIlIIIlIll[0];
                            nArray2[X.lIlIIIlIll[3]] = lIlIIIlIll[8];
                            if (X.lIIIlIIlllllI(e.b(nArray2) ? 1 : 0)) {
                                if (X.lIIIlIlIIIIII(Equipment.contains((int[])f.aZ) ? 1 : 0)) {
                                    a.b(f.aZ, lIlIIIlIll[2]);
                                }
                                a.b(f.aU, lIlIIIlIll[2]);
                                a.a(lIlIIIlIll[9], lIlIIIlIll[10]);
                                a.b(lIlIIIlIll[0], lIlIIIlIll[11]);
                            }
                        }
                    }
                }
                if (X.lIIIlIIlllllI(X.al() ? 1 : 0)) {
                    if (X.lIIIlIIlllllI(Inventory.contains((int[])f.aU) ? 1 : 0) && X.lIIIlIIllllll(Movement.getRunEnergy(), lIlIIIlIll[12])) {
                        Inventory.getFirst((int[])f.aU).interact(lIlIIIlIII[lIlIIIlIll[13]]);
                        Time.sleepTicks((int)lIlIIIlIll[2]);
                        0;
                    }
                    if (X.lIIIlIlIIIIII(Movement.isRunEnabled() ? 1 : 0) && X.lIIIlIlIIIIll(Movement.getRunEnergy(), lIlIIIlIll[14])) {
                        Movement.toggleRun();
                        Time.sleepTicks((int)lIlIIIlIll[13]);
                        0;
                    }
                    if (X.lIIIlIIllllll(Game.getWildyLevel(), lIlIIIlIll[2])) {
                        AccBuilderShamans.c = lIlIIIlIII[lIlIIIlIll[15]];
                        if (X.lIIIlIIlllllI(Dialog.isOpen() ? 1 : 0)) {
                            Dialog.close();
                        }
                        if (X.lIIIlIlIIIIII(Dialog.isOpen() ? 1 : 0) && X.lIIIlIIlllllI(Inventory.contains((int[])f.aZ) ? 1 : 0) && X.lIIIlIlIIIlII(Players.getLocal().getAnimation(), lIlIIIlIll[16])) {
                            Inventory.getFirst((int[])f.aZ).interact(lIlIIIlIII[lIlIIIlIll[17]]);
                            Time.sleepTicks((int)lIlIIIlIll[3]);
                            0;
                        }
                        String[] stringArray = new String[lIlIIIlIll[3]];
                        stringArray[X.lIlIIIlIll[1]] = lIlIIIlIII[lIlIIIlIll[18]];
                        stringArray[X.lIlIIIlIll[2]] = lIlIIIlIII[lIlIIIlIll[19]];
                        g.a(stringArray);
                    }
                    if (X.lIIIlIlIIIIlI(Game.getWildyLevel())) {
                        TileObject llllllllllllllllllllIlIIlIllIlIl;
                        int[] nArray = new int[lIlIIIlIll[2]];
                        nArray[X.lIlIIIlIll[1]] = lIlIIIlIll[0];
                        if (X.lIIIlIIlllllI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                            if (X.lIIIlIlIIIIll(Players.getLocal().getWorldLocation().distanceTo(kN), lIlIIIlIll[20])) {
                                AccBuilderShamans.c = lIlIIIlIII[lIlIIIlIll[21]];
                                TileItem tileItem = new WorldPoint[lIlIIIlIll[20]];
                                tileItem[X.lIlIIIlIll[1]] = new WorldPoint(lIlIIIlIll[22], lIlIIIlIll[23], lIlIIIlIll[1]);
                                tileItem[X.lIlIIIlIll[2]] = new WorldPoint(lIlIIIlIll[24], lIlIIIlIll[25], lIlIIIlIll[1]);
                                tileItem[X.lIlIIIlIll[3]] = new WorldPoint(lIlIIIlIll[26], lIlIIIlIll[27], lIlIIIlIll[1]);
                                tileItem[X.lIlIIIlIll[4]] = new WorldPoint(lIlIIIlIll[28], lIlIIIlIll[29], lIlIIIlIll[1]);
                                tileItem[X.lIlIIIlIll[6]] = new WorldPoint(lIlIIIlIll[30], lIlIIIlIll[31], lIlIIIlIll[1]);
                                tileItem[X.lIlIIIlIll[13]] = new WorldPoint(lIlIIIlIll[32], lIlIIIlIll[33], lIlIIIlIll[1]);
                                tileItem[X.lIlIIIlIll[15]] = new WorldPoint(lIlIIIlIll[34], lIlIIIlIll[35], lIlIIIlIll[1]);
                                tileItem[X.lIlIIIlIll[17]] = new WorldPoint(lIlIIIlIll[36], lIlIIIlIll[37], lIlIIIlIll[1]);
                                tileItem[X.lIlIIIlIll[18]] = new WorldPoint(lIlIIIlIll[38], lIlIIIlIll[37], lIlIIIlIll[1]);
                                tileItem[X.lIlIIIlIll[19]] = new WorldPoint(lIlIIIlIll[39], lIlIIIlIll[37], lIlIIIlIll[1]);
                                tileItem[X.lIlIIIlIll[21]] = new WorldPoint(lIlIIIlIll[40], lIlIIIlIll[37], lIlIIIlIll[1]);
                                tileItem[X.lIlIIIlIll[41]] = new WorldPoint(lIlIIIlIll[42], lIlIIIlIll[43], lIlIIIlIll[1]);
                                tileItem[X.lIlIIIlIll[44]] = new WorldPoint(lIlIIIlIll[45], lIlIIIlIll[43], lIlIIIlIll[1]);
                                llllllllllllllllllllIlIIlIllIllI = tileItem;
                                Walker.walkAlong(Arrays.asList(llllllllllllllllllllIlIIlIllIllI), new HashMap());
                                0;
                                Time.sleepTicks((int)lIlIIIlIll[2]);
                                0;
                            }
                            if (X.lIIIlIlIIIlIl(Players.getLocal().getWorldLocation().distanceTo(kN), lIlIIIlIll[20])) {
                                AccBuilderShamans.c = lIlIIIlIII[lIlIIIlIll[41]];
                                String[] stringArray = new String[lIlIIIlIll[2]];
                                stringArray[X.lIlIIIlIll[1]] = lIlIIIlIII[lIlIIIlIll[44]];
                                llllllllllllllllllllIlIIlIllIllI = TileObjects.getNearest((String[])stringArray);
                                String[] stringArray2 = new String[lIlIIIlIll[2]];
                                stringArray2[X.lIlIIIlIll[1]] = lIlIIIlIII[lIlIIIlIll[20]];
                                llllllllllllllllllllIlIIlIllIlIl = TileObjects.getNearest((String[])stringArray2);
                                String[] stringArray3 = new String[lIlIIIlIll[2]];
                                stringArray3[X.lIlIIIlIll[1]] = lIlIIIlIII[lIlIIIlIll[46]];
                                if (X.lIIIlIIlllllI(llllllllllllllllllllIlIIlIllIlIl.hasAction(stringArray3) ? 1 : 0)) {
                                    llllllllllllllllllllIlIIlIllIlIl.interact(lIlIIIlIII[lIlIIIlIll[47]]);
                                }
                                if (X.lIIIlIlIIIIIl(llllllllllllllllllllIlIIlIllIllI)) {
                                    String[] stringArray4 = new String[lIlIIIlIll[2]];
                                    stringArray4[X.lIlIIIlIll[1]] = lIlIIIlIII[lIlIIIlIll[48]];
                                    if (X.lIIIlIlIIIIII(llllllllllllllllllllIlIIlIllIlIl.hasAction(stringArray4) ? 1 : 0)) {
                                        int llllllllllllllllllllIlIIlIllIlII = Skills.getExperience((Skill)Skill.PRAYER);
                                        int[] nArray3 = new int[lIlIIIlIll[2]];
                                        nArray3[X.lIlIIIlIll[1]] = lIlIIIlIll[0];
                                        String[] stringArray5 = new String[lIlIIIlIll[2]];
                                        stringArray5[X.lIlIIIlIll[1]] = lIlIIIlIII[lIlIIIlIll[49]];
                                        Inventory.getFirst((int[])nArray3).useOn(TileObjects.getNearest((String[])stringArray5));
                                        Time.sleepTicks((int)lIlIIIlIll[2]);
                                        0;
                                    }
                                }
                            }
                        }
                        int[] nArray4 = new int[lIlIIIlIll[2]];
                        nArray4[X.lIlIIIlIll[1]] = lIlIIIlIll[0];
                        if (X.lIIIlIlIIIIII(Inventory.contains((int[])nArray4) ? 1 : 0)) {
                            int[] nArray5 = new int[lIlIIIlIll[2]];
                            nArray5[X.lIlIIIlIll[1]] = lIlIIIlIll[50];
                            if (X.lIIIlIIlllllI(Inventory.contains((int[])nArray5) ? 1 : 0)) {
                                if (X.lIIIlIlIIIIll(Players.getLocal().getWorldLocation().distanceTo(kN), lIlIIIlIll[20])) {
                                    AccBuilderShamans.c = lIlIIIlIII[lIlIIIlIll[51]];
                                    WorldPoint[] worldPointArray = new WorldPoint[lIlIIIlIll[20]];
                                    worldPointArray[X.lIlIIIlIll[1]] = new WorldPoint(lIlIIIlIll[22], lIlIIIlIll[23], lIlIIIlIll[1]);
                                    worldPointArray[X.lIlIIIlIll[2]] = new WorldPoint(lIlIIIlIll[24], lIlIIIlIll[25], lIlIIIlIll[1]);
                                    worldPointArray[X.lIlIIIlIll[3]] = new WorldPoint(lIlIIIlIll[26], lIlIIIlIll[27], lIlIIIlIll[1]);
                                    worldPointArray[X.lIlIIIlIll[4]] = new WorldPoint(lIlIIIlIll[28], lIlIIIlIll[29], lIlIIIlIll[1]);
                                    worldPointArray[X.lIlIIIlIll[6]] = new WorldPoint(lIlIIIlIll[30], lIlIIIlIll[31], lIlIIIlIll[1]);
                                    worldPointArray[X.lIlIIIlIll[13]] = new WorldPoint(lIlIIIlIll[32], lIlIIIlIll[33], lIlIIIlIll[1]);
                                    worldPointArray[X.lIlIIIlIll[15]] = new WorldPoint(lIlIIIlIll[34], lIlIIIlIll[35], lIlIIIlIll[1]);
                                    worldPointArray[X.lIlIIIlIll[17]] = new WorldPoint(lIlIIIlIll[36], lIlIIIlIll[37], lIlIIIlIll[1]);
                                    worldPointArray[X.lIlIIIlIll[18]] = new WorldPoint(lIlIIIlIll[38], lIlIIIlIll[37], lIlIIIlIll[1]);
                                    worldPointArray[X.lIlIIIlIll[19]] = new WorldPoint(lIlIIIlIll[39], lIlIIIlIll[37], lIlIIIlIll[1]);
                                    worldPointArray[X.lIlIIIlIll[21]] = new WorldPoint(lIlIIIlIll[40], lIlIIIlIll[37], lIlIIIlIll[1]);
                                    worldPointArray[X.lIlIIIlIll[41]] = new WorldPoint(lIlIIIlIll[42], lIlIIIlIll[43], lIlIIIlIll[1]);
                                    worldPointArray[X.lIlIIIlIll[44]] = new WorldPoint(lIlIIIlIll[45], lIlIIIlIll[43], lIlIIIlIll[1]);
                                    llllllllllllllllllllIlIIlIllIllI = worldPointArray;
                                    Walker.walkAlong(Arrays.asList(llllllllllllllllllllIlIIlIllIllI), new HashMap());
                                    0;
                                    Time.sleepTicks((int)lIlIIIlIll[2]);
                                    0;
                                }
                                if (X.lIIIlIlIIIlIl(Players.getLocal().getWorldLocation().distanceTo(kN), lIlIIIlIll[20])) {
                                    AccBuilderShamans.c = lIlIIIlIII[lIlIIIlIll[52]];
                                    if (!X.lIIIlIlIIIIII(Dialog.canLevelUpContinue() ? 1 : 0) || X.lIIIlIIlllllI(Dialog.isOpen() ? 1 : 0)) {
                                        Dialog.close();
                                    }
                                    String[] stringArray = new String[lIlIIIlIll[2]];
                                    stringArray[X.lIlIIIlIll[1]] = lIlIIIlIII[lIlIIIlIll[14]];
                                    llllllllllllllllllllIlIIlIllIllI = NPCs.getNearest((String[])stringArray);
                                    String[] stringArray6 = new String[lIlIIIlIll[2]];
                                    stringArray6[X.lIlIIIlIll[1]] = lIlIIIlIII[lIlIIIlIll[53]];
                                    llllllllllllllllllllIlIIlIllIlIl = TileObjects.getNearest((String[])stringArray6);
                                    String[] stringArray7 = new String[lIlIIIlIll[2]];
                                    stringArray7[X.lIlIIIlIll[1]] = lIlIIIlIII[lIlIIIlIll[54]];
                                    if (X.lIIIlIIlllllI(llllllllllllllllllllIlIIlIllIlIl.hasAction(stringArray7) ? 1 : 0)) {
                                        llllllllllllllllllllIlIIlIllIlIl.interact(lIlIIIlIII[lIlIIIlIll[55]]);
                                    }
                                    if (X.lIIIlIlIIIIIl(llllllllllllllllllllIlIIlIllIllI)) {
                                        String[] stringArray8 = new String[lIlIIIlIll[2]];
                                        stringArray8[X.lIlIIIlIll[1]] = lIlIIIlIII[lIlIIIlIll[56]];
                                        if (X.lIIIlIlIIIIII(llllllllllllllllllllIlIIlIllIlIl.hasAction(stringArray8) ? 1 : 0)) {
                                            List llllllllllllllllllllIlIIlIllIlII;
                                            if (X.lIIIlIlIIIIII(Dialog.isOpen() ? 1 : 0)) {
                                                int[] nArray6 = new int[lIlIIIlIll[2]];
                                                nArray6[X.lIlIIIlIll[1]] = lIlIIIlIll[50];
                                                Inventory.getFirst((int[])nArray6).useOn((Actor)llllllllllllllllllllIlIIlIllIllI);
                                                Time.sleepTicks((int)lIlIIIlIll[3]);
                                                0;
                                            }
                                            if (X.lIIIlIIlllllI(Dialog.isOpen() ? 1 : 0) && X.lIIIlIlIIIIII((llllllllllllllllllllIlIIlIllIlII = Dialog.getOptions()).isEmpty() ? 1 : 0)) {
                                                int llllllllllllllllllllIlIIlIllIIll = lIlIIIlIll[1];
                                                while (X.lIIIlIIllllll(llllllllllllllllllllIlIIlIllIIll, llllllllllllllllllllIlIIlIllIlII.size())) {
                                                    int[] nArray7 = new int[lIlIIIlIll[2]];
                                                    nArray7[X.lIlIIIlIll[1]] = lIlIIIlIll[50];
                                                    if (X.lIIIlIlIIIlII(((Item)Inventory.getAll((int[])nArray7).get(lIlIIIlIll[1])).getQuantity(), lIlIIIlIll[2]) && X.lIIIlIIlllllI(((Widget)llllllllllllllllllllIlIIlIllIlII.get(llllllllllllllllllllIlIIlIllIIll)).getText().contains(lIlIIIlIII[lIlIIIlIll[57]]) ? 1 : 0)) {
                                                        Mouse.click((int)((Widget)llllllllllllllllllllIlIIlIllIlII.get(llllllllllllllllllllIlIIlIllIIll)).getClickPoint().getX(), (int)((Widget)llllllllllllllllllllIlIIlIllIlII.get(llllllllllllllllllllIlIIlIllIIll)).getClickPoint().getY(), (boolean)lIlIIIlIll[2]);
                                                        Time.sleepTicks((int)lIlIIIlIll[3]);
                                                        0;
                                                    }
                                                    int[] nArray8 = new int[lIlIIIlIll[2]];
                                                    nArray8[X.lIlIIIlIll[1]] = lIlIIIlIll[50];
                                                    if (X.lIIIlIlIIIlII(((Item)Inventory.getAll((int[])nArray8).get(lIlIIIlIll[1])).getQuantity(), lIlIIIlIll[13]) && X.lIIIlIIlllllI(((Widget)llllllllllllllllllllIlIIlIllIlII.get(llllllllllllllllllllIlIIlIllIIll)).getText().contains(lIlIIIlIII[lIlIIIlIll[58]]) ? 1 : 0)) {
                                                        Mouse.click((int)((Widget)llllllllllllllllllllIlIIlIllIlII.get(llllllllllllllllllllIlIIlIllIIll)).getClickPoint().getX(), (int)((Widget)llllllllllllllllllllIlIIlIllIlII.get(llllllllllllllllllllIlIIlIllIIll)).getClickPoint().getY(), (boolean)lIlIIIlIll[2]);
                                                        Time.sleepTicks((int)lIlIIIlIll[3]);
                                                        0;
                                                    }
                                                    if (X.lIIIlIIlllllI(((Widget)llllllllllllllllllllIlIIlIllIlII.get(llllllllllllllllllllIlIIlIllIIll)).getText().contains(lIlIIIlIII[lIlIIIlIll[59]]) ? 1 : 0)) {
                                                        Mouse.click((int)((Widget)llllllllllllllllllllIlIIlIllIlII.get(llllllllllllllllllllIlIIlIllIIll)).getClickPoint().getX(), (int)((Widget)llllllllllllllllllllIlIIlIllIlII.get(llllllllllllllllllllIlIIlIllIIll)).getClickPoint().getY(), (boolean)lIlIIIlIll[2]);
                                                        Time.sleepTicks((int)lIlIIIlIll[3]);
                                                        0;
                                                    }
                                                    ++llllllllllllllllllllIlIIlIllIIll;
                                                    0;
                                                    if ((0xBF ^ 0xA7 ^ (0x20 ^ 0x3C)) > 2) continue;
                                                    return;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                int[] nArray = new int[lIlIIIlIll[2]];
                nArray[X.lIlIIIlIll[1]] = lIlIIIlIll[9];
                if (!X.lIIIlIIlllllI(Inventory.contains((int[])nArray) ? 1 : 0)) break block45;
                int[] nArray9 = new int[lIlIIIlIll[2]];
                nArray9[X.lIlIIIlIll[1]] = lIlIIIlIll[0];
                if (!X.lIIIlIlIIIIII(Inventory.contains((int[])nArray9) ? 1 : 0)) break block44;
                int[] nArray10 = new int[lIlIIIlIll[2]];
                nArray10[X.lIlIIIlIll[1]] = lIlIIIlIll[50];
                if (!X.lIIIlIlIIIIII(Inventory.contains((int[])nArray10) ? 1 : 0)) break block44;
            }
            if (X.lIIIlIlIIIlIl(Players.getLocal().getWorldLocation().distanceTo(kN), lIlIIIlIll[20])) {
                AccBuilderShamans.c = lIlIIIlIII[lIlIIIlIll[60]];
                String[] stringArray = new String[lIlIIIlIll[2]];
                stringArray[X.lIlIIIlIll[1]] = lIlIIIlIII[lIlIIIlIll[61]];
                llllllllllllllllllllIlIIlIllIllI = TileItems.getNearest((String[])stringArray);
                if (X.lIIIlIlIIIIIl(llllllllllllllllllllIlIIlIllIllI)) {
                    llllllllllllllllllllIlIIlIllIllI.interact(lIlIIIlIII[lIlIIIlIll[62]]);
                }
            }
        }
    }

    @Override
    public String ae() {
        return lIlIIIlIII[lIlIIIlIll[75]];
    }

    private static boolean lIIIlIIllllll(int n2, int n3) {
        return n2 < n3;
    }

    @Override
    public int ad() {
        try {
            X.dg();
            0;
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (3 <= 0) {
            return (0x77 ^ 0xF ^ (0xAA ^ 0x8D)) & (0xE0 ^ 0x8A ^ (0x39 ^ 0xC) ^ -1);
        }
        return lIlIIIlIll[74];
    }

    private static String lIIIlIIlIllll(String llllllllllllllllllllIlIIIlllllll, String llllllllllllllllllllIlIIlIIIIIll) {
        llllllllllllllllllllIlIIIlllllll = new String(Base64.getDecoder().decode(llllllllllllllllllllIlIIIlllllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllllllIlIIlIIIIIlI = new StringBuilder();
        char[] llllllllllllllllllllIlIIlIIIIIIl = llllllllllllllllllllIlIIlIIIIIll.toCharArray();
        int llllllllllllllllllllIlIIlIIIIIII = lIlIIIlIll[1];
        char[] llllllllllllllllllllIlIIIllllIlI = llllllllllllllllllllIlIIIlllllll.toCharArray();
        int llllllllllllllllllllIlIIIllllIIl = llllllllllllllllllllIlIIIllllIlI.length;
        int llllllllllllllllllllIlIIIllllIII = lIlIIIlIll[1];
        while (X.lIIIlIIllllll(llllllllllllllllllllIlIIIllllIII, llllllllllllllllllllIlIIIllllIIl)) {
            char llllllllllllllllllllIlIIlIIIIlIl = llllllllllllllllllllIlIIIllllIlI[llllllllllllllllllllIlIIIllllIII];
            llllllllllllllllllllIlIIlIIIIIlI.append((char)(llllllllllllllllllllIlIIlIIIIlIl ^ llllllllllllllllllllIlIIlIIIIIIl[llllllllllllllllllllIlIIlIIIIIII % llllllllllllllllllllIlIIlIIIIIIl.length]));
            0;
            ++llllllllllllllllllllIlIIlIIIIIII;
            ++llllllllllllllllllllIlIIIllllIII;
            0;
            if (((0xD4 ^ 0x9F ^ (0x4A ^ 0x4D)) & (0xA8 ^ 0xB6 ^ (0xE2 ^ 0xB0) ^ -1)) >= ((0xD8 ^ 0xA0 ^ (0x3A ^ 0x49)) & (0xEE ^ 0xC6 ^ (0x81 ^ 0xA2) ^ -1) & ((229 + 20 - 38 + 19 ^ 111 + 141 - 241 + 151) & (24 + 133 - 141 + 197 ^ 35 + 136 - 124 + 98 ^ -1) ^ -1))) continue;
            return null;
        }
        return String.valueOf(llllllllllllllllllllIlIIlIIIIIlI);
    }

    private static String lIIIlIIllIIII(String llllllllllllllllllllIlIIlIIlIlII, String llllllllllllllllllllIlIIlIIlIIll) {
        try {
            SecretKeySpec llllllllllllllllllllIlIIlIIlIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllllllIlIIlIIlIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllllllIlIIlIIlIllI = Cipher.getInstance("Blowfish");
            llllllllllllllllllllIlIIlIIlIllI.init(lIlIIIlIll[3], llllllllllllllllllllIlIIlIIlIlll);
            return new String(llllllllllllllllllllIlIIlIIlIllI.doFinal(Base64.getDecoder().decode(llllllllllllllllllllIlIIlIIlIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllllllIlIIlIIlIlIl) {
            llllllllllllllllllllIlIIlIIlIlIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIlIIlllllI(int n2) {
        return n2 != 0;
    }

    private static boolean lIIIlIlIIIIIl(Object object) {
        return object != null;
    }

    private static String lIIIlIIlIlllI(String llllllllllllllllllllIlIIlIIlllll, String llllllllllllllllllllIlIIlIlIIIII) {
        try {
            SecretKeySpec llllllllllllllllllllIlIIlIlIIlII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllllllIlIIlIlIIIII.getBytes(StandardCharsets.UTF_8)), lIlIIIlIll[18]), "DES");
            Cipher llllllllllllllllllllIlIIlIlIIIll = Cipher.getInstance("DES");
            llllllllllllllllllllIlIIlIlIIIll.init(lIlIIIlIll[3], llllllllllllllllllllIlIIlIlIIlII);
            return new String(llllllllllllllllllllIlIIlIlIIIll.doFinal(Base64.getDecoder().decode(llllllllllllllllllllIlIIlIIlllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllllllIlIIlIlIIIlI) {
            llllllllllllllllllllIlIIlIlIIIlI.printStackTrace();
            return null;
        }
    }
}

