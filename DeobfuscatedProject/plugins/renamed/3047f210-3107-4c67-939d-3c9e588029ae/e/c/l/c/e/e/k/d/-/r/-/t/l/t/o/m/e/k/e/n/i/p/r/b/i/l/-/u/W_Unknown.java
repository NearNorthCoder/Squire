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
package e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u;

import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.S_Unknown;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.a_Unknown;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.b_Unknown;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.d;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.e_Unknown;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.f_Unknown;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.i;
import gg.squire.account.AccBuilderTempleTrek;
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

public class W_Unknown
implements S {
    private static /* synthetic */ String[] llllIlIlll;
    static /* synthetic */ WorldArea iW;
    public static /* synthetic */ int iU;
    public static /* synthetic */ int iT;
    static /* synthetic */ WorldArea iX;
    public static /* synthetic */ boolean bs;
    private static /* synthetic */ WorldPoint iY;
    private static /* synthetic */ int[] llllIllIIl;
    public static /* synthetic */ List<d> bu;
    public static /* synthetic */ int iS;
    static /* synthetic */ WorldArea iV;

    private static boolean llIlIIIIlllIl(int n2) {
        return n2 == 0;
    }

    private static String llIlIIIIIIllI(String var18, String var15) {
        try {
            SecretKeySpec var22 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var15.getBytes(StandardCharsets.UTF_8)), llllIllIIl[24]), "DES");
            Cipher var19 = Cipher.getInstance("DES");
            var19.init(llllIllIIl[2], var22);
            return new String(var19.doFinal(Base64.getDecoder().decode(var18.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var50) {
            var50.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean S() {
        return llllIllIIl[0];
    }

    public static void ae() {
        d var32;
        block18: {
            block17: {
                block16: {
                    block15: {
                        int[] nArray = new int[llllIllIIl[1]];
                        nArray[W.llllIllIIl[0]] = llllIllIIl[15];
                        if (W.llIlIIIIlllIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                            d d2 = new d(llllIllIIl[15], llllIllIIl[1], llllIllIIl[195]);
                            bu.add(d2);
                            0;
                        }
                        int[] nArray2 = new int[llllIllIIl[1]];
                        nArray2[W.llllIllIIl[0]] = llllIllIIl[17];
                        if (W.llIlIIIIlllIl(Bank.contains((int[])nArray2) ? 1 : 0)) {
                            var32 = new d(llllIllIIl[17], llllIllIIl[2], llllIllIIl[196]);
                            bu.add(var32);
                            0;
                        }
                        int[] nArray3 = new int[llllIllIIl[1]];
                        nArray3[W.llllIllIIl[0]] = llllIllIIl[27];
                        if (W.llIlIIIIlllIl(Bank.contains((int[])nArray3) ? 1 : 0)) {
                            var32 = new d(llllIllIIl[27], llllIllIIl[2], llllIllIIl[196]);
                            bu.add(var32);
                            0;
                        }
                        int[] nArray4 = new int[llllIllIIl[1]];
                        nArray4[W.llllIllIIl[0]] = llllIllIIl[12];
                        if (W.llIlIIIIlllIl(Bank.contains((int[])nArray4) ? 1 : 0)) {
                            var32 = new d(llllIllIIl[12], llllIllIIl[11], llllIllIIl[197]);
                            bu.add(var32);
                            0;
                        }
                        int[] nArray5 = new int[llllIllIIl[1]];
                        nArray5[W.llllIllIIl[0]] = llllIllIIl[21];
                        if (W.llIlIIIIlllIl(Bank.contains((int[])nArray5) ? 1 : 0)) {
                            var32 = new d(llllIllIIl[21], llllIllIIl[11], llllIllIIl[198]);
                            bu.add(var32);
                            0;
                        }
                        int[] nArray6 = new int[llllIllIIl[1]];
                        nArray6[W.llllIllIIl[0]] = llllIllIIl[14];
                        if (W.llIlIIIIlllIl(Bank.contains((int[])nArray6) ? 1 : 0)) {
                            var32 = new d(llllIllIIl[14], llllIllIIl[11], llllIllIIl[198]);
                            bu.add(var32);
                            0;
                        }
                        int[] nArray7 = new int[llllIllIIl[1]];
                        nArray7[W.llllIllIIl[0]] = llllIllIIl[13];
                        if (W.llIlIIIIlllIl(Bank.contains((int[])nArray7) ? 1 : 0)) {
                            var32 = new d(llllIllIIl[13], llllIllIIl[11], llllIllIIl[198]);
                            bu.add(var32);
                            0;
                        }
                        int[] nArray8 = new int[llllIllIIl[1]];
                        nArray8[W.llllIllIIl[0]] = llllIllIIl[23];
                        if (!W.llIlIIIIllIll(Bank.contains((int[])nArray8) ? 1 : 0)) break block15;
                        int[] nArray9 = new int[llllIllIIl[1]];
                        nArray9[W.llllIllIIl[0]] = llllIllIIl[23];
                        if (!W.llIlIIIIllIll(Bank.contains((int[])nArray9) ? 1 : 0)) break block16;
                        int[] nArray10 = new int[llllIllIIl[1]];
                        nArray10[W.llllIllIIl[0]] = llllIllIIl[23];
                        if (!W.llIlIIIIlllII(Bank.getFirst((int[])nArray10).getQuantity(), llllIllIIl[11])) break block16;
                    }
                    var32 = new d(iT, llllIllIIl[44], llllIllIIl[199]);
                    bu.add(var32);
                    0;
                }
                int[] nArray = new int[llllIllIIl[1]];
                nArray[W.llllIllIIl[0]] = llllIllIIl[25];
                if (!W.llIlIIIIllIll(Bank.contains((int[])nArray) ? 1 : 0)) break block17;
                int[] nArray11 = new int[llllIllIIl[1]];
                nArray11[W.llllIllIIl[0]] = llllIllIIl[25];
                if (!W.llIlIIIIllIll(Bank.contains((int[])nArray11) ? 1 : 0)) break block18;
                int[] nArray12 = new int[llllIllIIl[1]];
                nArray12[W.llllIllIIl[0]] = llllIllIIl[25];
                if (!W.llIlIIIIlllII(Bank.getFirst((int[])nArray12).getQuantity(), llllIllIIl[11])) break block18;
            }
            var32 = new d(llllIllIIl[25], llllIllIIl[11], llllIllIIl[200]);
            bu.add(var32);
            0;
        }
        int[] nArray = new int[llllIllIIl[1]];
        nArray[W.llllIllIIl[0]] = llllIllIIl[201];
        if (W.llIlIIIIlllIl(Bank.contains((int[])nArray) ? 1 : 0)) {
            var32 = new d(llllIllIIl[201], llllIllIIl[1], llllIllIIl[202]);
            bu.add(var32);
            0;
        }
        int[] nArray13 = new int[llllIllIIl[1]];
        nArray13[W.llllIllIIl[0]] = llllIllIIl[19];
        if (W.llIlIIIIlllIl(Bank.contains((int[])nArray13) ? 1 : 0)) {
            var32 = new d(llllIllIIl[19], llllIllIIl[40], i.bp);
            bu.add(var32);
            0;
        }
    }

    @Override
    public int T() {
        try {
            W.ds();
            0;
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (3 <= ((0x30 ^ 0x11 ^ (0x94 ^ 0x9A)) & (5 ^ 0x34 ^ (0x34 ^ 0x2A) ^ -1))) {
            return (1 ^ (0xBA ^ 0x8D)) & (4 + 30 - -122 + 13 ^ 130 + 60 - 168 + 137 ^ -1);
        }
        return llllIllIIl[186];
    }

    @Override
    public boolean V() {
        boolean bl;
        if (W.llIlIIIlIIIIl(Skills.getLevel((Skill)Skill.AGILITY), llllIllIIl[185])) {
            bl = llllIllIIl[1];
            0;
            if (-1 >= ((103 + 88 - 124 + 100 ^ 11 + 99 - -12 + 8) & (0x6D ^ 9 ^ (2 ^ 0x43) ^ -1))) {
                return ((0x3B ^ 0x55 ^ (0xC8 ^ 0xA9)) & (123 + 74 - 77 + 23 ^ 55 + 43 - -22 + 8 ^ -1)) != 0;
            }
        } else {
            bl = llllIllIIl[0];
        }
        return bl;
    }

    private static boolean llIlIIIIlllII(int n2, int n3) {
        return n2 < n3;
    }

    private static void llIlIIIIlIllI() {
        llllIlIlll = new String[llllIllIIl[238]];
        W.llllIlIlll[W.llllIllIIl[0]] = W."Buying items";
        W.llllIlIlll[W.llllIllIIl[1]] = W."Finished buying items, switching back to agility";
        W.llllIlIlll[W.llllIllIIl[2]] = W."Navigating to bank";
        W.llllIlIlll[W.llllIllIIl[9]] = W."Handling banking";
        W.llllIlIlll[W.llllIllIIl[16]] = W."We are missing quest supplies, switching to BUYING";
        W.llllIlIlll[W.llllIllIIl[18]] = W."Vial";
        W.llllIlIlll[W.llllIllIIl[20]] = W."Vial";
        W.llllIlIlll[W.llllIllIIl[22]] = W."Drop";
        W.llllIlIlll[W.llllIllIIl[24]] = W."Drink";
        W.llllIlIlll[W.llllIllIIl[26]] = W."Eat";
        W.llllIlIlll[W.llllIllIIl[11]] = W."Nav to gnome course";
        W.llllIlIlll[W.llllIllIIl[49]] = W."Crossing log";
        W.llllIlIlll[W.llllIllIIl[63]] = W."Log balance";
        W.llllIlIlll[W.llllIllIIl[64]] = W."Walk-across";
        W.llllIlIlll[W.llllIllIIl[53]] = W."Climbing net";
        W.llllIlIlll[W.llllIllIIl[38]] = W."Obstacle net";
        W.llllIlIlll[W.llllIllIIl[65]] = W."Climb-over";
        W.llllIlIlll[W.llllIllIIl[66]] = W."Climbing branch";
        W.llllIlIlll[W.llllIllIIl[54]] = W."Tree branch";
        W.llllIlIlll[W.llllIllIIl[67]] = W."Climb";
        W.llllIlIlll[W.llllIllIIl[40]] = W."Crossing rope";
        W.llllIlIlll[W.llllIllIIl[68]] = W."Balancing rope";
        W.llllIlIlll[W.llllIllIIl[61]] = W."Walk-on";
        W.llllIlIlll[W.llllIllIIl[69]] = W."Climbing down";
        W.llllIlIlll[W.llllIllIIl[70]] = W."Tree branch";
        W.llllIlIlll[W.llllIllIIl[41]] = W."Climb-down";
        W.llllIlIlll[W.llllIllIIl[71]] = W."Climbing net";
        W.llllIlIlll[W.llllIllIIl[72]] = W."Obstacle net";
        W.llllIlIlll[W.llllIllIIl[73]] = W."Climb-over";
        W.llllIlIlll[W.llllIllIIl[74]] = W."Crossing pipe";
        W.llllIlIlll[W.llllIllIIl[42]] = W."Obstacle pipe";
        W.llllIlIlll[W.llllIllIIl[75]] = W."Squeeze-through";
        W.llllIlIlll[W.llllIllIIl[95]] = W."Nav to start";
        W.llllIlIlll[W.llllIllIIl[97]] = W."Mark of grace";
        W.llllIlIlll[W.llllIllIIl[98]] = W."Taking mark";
        W.llllIlIlll[W.llllIllIIl[99]] = W."Found mark on ground";
        W.llllIlIlll[W.llllIllIIl[100]] = W."Take";
        W.llllIlIlll[W.llllIllIIl[101]] = W."Starting course";
        W.llllIlIlll[W.llllIllIIl[102]] = W."Rough wall";
        W.llllIlIlll[W.llllIllIIl[103]] = W."Climb";
        W.llllIlIlll[W.llllIllIIl[37]] = W."Crossing clothes line";
        W.llllIlIlll[W.llllIllIIl[105]] = W."Clothes line";
        W.llllIlIlll[W.llllIllIIl[106]] = W."Cross";
        W.llllIlIlll[W.llllIllIIl[107]] = W."Leaping";
        W.llllIlIlll[W.llllIllIIl[108]] = W."Gap";
        W.llllIlIlll[W.llllIllIIl[109]] = W."Leap";
        W.llllIlIlll[W.llllIllIIl[110]] = W."Balancing";
        W.llllIlIlll[W.llllIllIIl[111]] = W."Wall";
        W.llllIlIlll[W.llllIllIIl[112]] = W."Balance";
        W.llllIlIlll[W.llllIllIIl[113]] = W."Jumping gap";
        W.llllIlIlll[W.llllIllIIl[39]] = W."Gap";
        W.llllIlIlll[W.llllIllIIl[6]] = W."Leap";
        W.llllIlIlll[W.llllIllIIl[114]] = W."Jumping gap 2";
        W.llllIlIlll[W.llllIllIIl[116]] = W."Leap";
        W.llllIlIlll[W.llllIllIIl[117]] = W."Jumping gap 3";
        W.llllIlIlll[W.llllIllIIl[119]] = W."Leap";
        W.llllIlIlll[W.llllIllIIl[120]] = W."Hurdle roof";
        W.llllIlIlll[W.llllIllIIl[122]] = W."Hurdle";
        W.llllIlIlll[W.llllIllIIl[123]] = W."Finishing course";
        W.llllIlIlll[W.llllIllIIl[124]] = W."Edge";
        W.llllIlIlll[W.llllIllIIl[44]] = W."Jump-off";
        W.llllIlIlll[W.llllIllIIl[140]] = W."Nav to canafis course";
        W.llllIlIlll[W.llllIllIIl[5]] = W."Nav to start";
        W.llllIlIlll[W.llllIllIIl[141]] = W."Starting course";
        W.llllIlIlll[W.llllIllIIl[142]] = W."Tall tree";
        W.llllIlIlll[W.llllIllIIl[143]] = W."Climb";
        W.llllIlIlll[W.llllIllIIl[144]] = W."Mark of grace";
        W.llllIlIlll[W.llllIllIIl[145]] = W."Taking mark";
        W.llllIlIlll[W.llllIllIIl[146]] = W."Found mark on ground";
        W.llllIlIlll[W.llllIllIIl[147]] = W."Take";
        W.llllIlIlll[W.llllIllIIl[148]] = W."Jumping gap 1";
        W.llllIlIlll[W.llllIllIIl[149]] = W."Jump";
        W.llllIlIlll[W.llllIllIIl[150]] = W."Jumping gap 2";
        W.llllIlIlll[W.llllIllIIl[151]] = W."Jump";
        W.llllIlIlll[W.llllIllIIl[152]] = W."Jumping gap 3";
        W.llllIlIlll[W.llllIllIIl[153]] = W."Jump";
        W.llllIlIlll[W.llllIllIIl[154]] = W."Jumping gap 4";
        W.llllIlIlll[W.llllIllIIl[155]] = W."Jump";
        W.llllIlIlll[W.llllIllIIl[156]] = W."Vaulting";
        W.llllIlIlll[W.llllIllIIl[157]] = W."Vault";
        W.llllIlIlll[W.llllIllIIl[158]] = W."Jumping gap 5";
        W.llllIlIlll[W.llllIllIIl[159]] = W."Jump";
        W.llllIlIlll[W.llllIllIIl[160]] = W."Jumping gap 6";
        W.llllIlIlll[W.llllIllIIl[161]] = W."Jump";
        W.llllIlIlll[W.llllIllIIl[172]] = W."Nav to canafis course";
        W.llllIlIlll[W.llllIllIIl[173]] = W."Nav to start";
        W.llllIlIlll[W.llllIllIIl[174]] = W."Starting course";
        W.llllIlIlll[W.llllIllIIl[175]] = W."Wall";
        W.llllIlIlll[W.llllIllIIl[35]] = W."Climb-up";
        W.llllIlIlll[W.llllIllIIl[176]] = W."Mark of grace";
        W.llllIlIlll[W.llllIllIIl[177]] = W."Taking mark";
        W.llllIlIlll[W.llllIllIIl[178]] = W."Found mark on ground";
        W.llllIlIlll[W.llllIllIIl[179]] = W."Take";
        W.llllIlIlll[W.llllIllIIl[180]] = W."Jumping gap 1";
        W.llllIlIlll[W.llllIllIIl[79]] = W."Jump";
        W.llllIlIlll[W.llllIllIIl[181]] = W."cross rope";
        W.llllIlIlll[W.llllIllIIl[182]] = W."Cross";
        W.llllIlIlll[W.llllIllIIl[183]] = W."Jumping gap 3";
        W.llllIlIlll[W.llllIllIIl[184]] = W."Jump";
        W.llllIlIlll[W.llllIllIIl[185]] = W."Jumping gap 4";
        W.llllIlIlll[W.llllIllIIl[186]] = W."Jump";
        W.llllIlIlll[W.llllIllIIl[187]] = W."Jumping Edge";
        W.llllIlIlll[W.llllIllIIl[188]] = W."Jump";
        W.llllIlIlll[W.llllIllIIl[194]] = W."Found mark on ground";
        W.llllIlIlll[W.llllIllIIl[203]] = W."Agility";
        W.llllIlIlll[W.llllIllIIl[204]] = W."passage";
        W.llllIlIlll[W.llllIllIIl[205]] = W."passage";
        W.llllIlIlll[W.llllIllIIl[206]] = W."passage";
        W.llllIlIlll[W.llllIllIIl[207]] = W."passage";
        W.llllIlIlll[W.llllIllIIl[208]] = W."Edge";
        W.llllIlIlll[W.llllIllIIl[211]] = W."Gap";
        W.llllIlIlll[W.llllIllIIl[213]] = W."Gap";
        W.llllIlIlll[W.llllIllIIl[216]] = W."Tightrope";
        W.llllIlIlll[W.llllIllIIl[218]] = W."Gap";
        W.llllIlIlll[W.llllIllIIl[221]] = W."Gap";
        W.llllIlIlll[W.llllIllIIl[224]] = W."Gap";
        W.llllIlIlll[W.llllIllIIl[226]] = W."Pole-vault";
        W.llllIlIlll[W.llllIllIIl[227]] = W."Gap";
        W.llllIlIlll[W.llllIllIIl[230]] = W."Gap";
        W.llllIlIlll[W.llllIllIIl[232]] = W."Gap";
        W.llllIlIlll[W.llllIllIIl[233]] = W."Gap";
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean aa() {
        int n2;
        if (W.llIlIIIlIIIIl(Skills.getBoostedLevel((Skill)Skill.AGILITY), llllIllIIl[37])) {
            int n3;
            int[] nArray = new int[llllIllIIl[1]];
            nArray[W.llllIllIIl[0]] = llllIllIIl[12];
            if (W.llIlIIIIllIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray2 = new int[llllIllIIl[1]];
                nArray2[W.llllIllIIl[0]] = llllIllIIl[25];
                if (W.llIlIIIIllIll(Inventory.contains((int[])nArray2) ? 1 : 0)) {
                    int[] nArray3 = new int[llllIllIIl[1]];
                    nArray3[W.llllIllIIl[0]] = llllIllIIl[23];
                    if (!(!W.llIlIIIIllIll(Inventory.contains((int[])nArray3) ? 1 : 0) || W.llIlIIIIlllIl(Inventory.contains(item -> item.getName().contains(llllIlIlll[llllIllIIl[207]])) ? 1 : 0) && !W.llIlIIIIllIll(Equipment.contains(item -> item.getName().contains(llllIlIlll[llllIllIIl[206]])) ? 1 : 0) || W.llIlIIIIlllIl(Inventory.contains((int[])f.be) ? 1 : 0) && !W.llIlIIIIllIll(Equipment.contains((int[])f.be) ? 1 : 0))) {
                        n3 = llllIllIIl[1];
                        0;
                        if (null == null) return n3 != 0;
                        return false;
                    }
                }
            }
            n3 = llllIllIIl[0];
            return n3 != 0;
        }
        int[] nArray = new int[llllIllIIl[1]];
        nArray[W.llllIllIIl[0]] = llllIllIIl[12];
        if (W.llIlIIIIllIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
            int[] nArray4 = new int[llllIllIIl[1]];
            nArray4[W.llllIllIIl[0]] = llllIllIIl[14];
            if (W.llIlIIIIllIll(Inventory.contains((int[])nArray4) ? 1 : 0)) {
                int[] nArray5 = new int[llllIllIIl[1]];
                nArray5[W.llllIllIIl[0]] = llllIllIIl[13];
                if (!(!W.llIlIIIIllIll(Inventory.contains((int[])nArray5) ? 1 : 0) || W.llIlIIIIlllIl(Inventory.contains(item -> item.getName().contains(llllIlIlll[llllIllIIl[205]])) ? 1 : 0) && !W.llIlIIIIllIll(Equipment.contains(item -> item.getName().contains(llllIlIlll[llllIllIIl[204]])) ? 1 : 0) || W.llIlIIIIlllIl(Inventory.contains((int[])f.be) ? 1 : 0) && !W.llIlIIIIllIll(Equipment.contains((int[])f.be) ? 1 : 0))) {
                    n2 = llllIllIIl[1];
                    0;
                    if (3 > 1) return n2 != 0;
                    return false;
                }
            }
        }
        n2 = llllIllIIl[0];
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    private static void dw() {
        void var36;
        void var59;
        void var16;
        void var63;
        void var57;
        WorldArea worldArea = new WorldArea(llllIllIIl[162], llllIllIIl[163], llllIllIIl[111], llllIllIIl[111], llllIllIIl[0]);
        WorldArea worldArea2 = new WorldArea(llllIllIIl[162], llllIllIIl[163], llllIllIIl[111], llllIllIIl[111], llllIllIIl[1]);
        WorldArea worldArea3 = new WorldArea(llllIllIIl[162], llllIllIIl[163], llllIllIIl[111], llllIllIIl[111], llllIllIIl[2]);
        WorldArea worldArea4 = new WorldArea(llllIllIIl[162], llllIllIIl[163], llllIllIIl[111], llllIllIIl[111], llllIllIIl[9]);
        WorldArea worldArea5 = new WorldArea(llllIllIIl[164], llllIllIIl[133], llllIllIIl[64], llllIllIIl[11], llllIllIIl[9]);
        WorldArea worldArea6 = new WorldArea(llllIllIIl[165], llllIllIIl[139], llllIllIIl[38], llllIllIIl[53], llllIllIIl[2]);
        WorldArea worldArea7 = new WorldArea(llllIllIIl[166], llllIllIIl[134], llllIllIIl[49], llllIllIIl[26], llllIllIIl[2]);
        WorldArea worldArea8 = new WorldArea(llllIllIIl[167], llllIllIIl[136], llllIllIIl[70], llllIllIIl[64], llllIllIIl[9]);
        WorldArea worldArea9 = new WorldArea(llllIllIIl[168], llllIllIIl[169], llllIllIIl[54], llllIllIIl[63], llllIllIIl[2]);
        WorldPoint worldPoint = new WorldPoint(llllIllIIl[170], llllIllIIl[171], llllIllIIl[0]);
        if (W.llIlIIIIllIll(Dialog.isOpen() ? 1 : 0)) {
            Dialog.close();
        }
        if (W.llIlIIIIlllIl(var57.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && W.llIlIIIIlllIl(var63.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && W.llIlIIIIlllIl(var16.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && W.llIlIIIIlllIl(var59.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderTempleTrek.c = llllIlIlll[llllIllIIl[172]];
            Movement.walkTo((WorldPoint)var36);
            0;
            Time.sleepTicks((int)llllIllIIl[1]);
            0;
        }
        if (W.llIlIIIIllIll(var57.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (W.llIlIIIIlllll(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)var36), llllIllIIl[20])) {
                AccBuilderTempleTrek.c = llllIlIlll[llllIllIIl[173]];
                Movement.walkTo((WorldPoint)var36);
                0;
                Time.sleepTicks((int)llllIllIIl[1]);
                0;
            }
            if (W.llIlIIIlIIIll(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)var36), llllIllIIl[20])) {
                AccBuilderTempleTrek.c = llllIlIlll[llllIllIIl[174]];
                int var61 = Skills.getExperience((Skill)Skill.AGILITY);
                String[] stringArray = new String[llllIllIIl[1]];
                stringArray[W.llllIllIIl[0]] = llllIlIlll[llllIllIIl[175]];
                TileObjects.getNearest((String[])stringArray).interact(llllIlIlll[llllIllIIl[35]]);
                Time.sleepTicks((int)e.c(llllIllIIl[1], llllIllIIl[2]));
                0;
                Time.sleepUntil(() -> {
                    boolean bl;
                    if (W.llIlIIIIlllll(Skills.getExperience((Skill)Skill.AGILITY), var61)) {
                        bl = llllIllIIl[1];
                        0;
                        
                        }
                    } else {
                        bl = llllIllIIl[0];
                    }
                    return bl;
                }, (int)llllIllIIl[104]);
                0;
                Time.sleepTicks((int)llllIllIIl[1]);
                0;
            }
        }
        String[] stringArray = new String[llllIllIIl[1]];
        stringArray[W.llllIllIIl[0]] = llllIlIlll[llllIllIIl[176]];
        TileItem var61 = TileItems.getNearest((String[])stringArray);
        if (W.llIlIIIIllllI(var61) && W.llIlIIIIllIll(W.dx() ? 1 : 0)) {
            AccBuilderTempleTrek.c = llllIlIlll[llllIllIIl[177]];
            System.out.println(llllIlIlll[llllIllIIl[178]]);
            var61.interact(llllIlIlll[llllIllIIl[179]]);
            Time.sleepTicks((int)llllIllIIl[9]);
            0;
        }
        if (W.llIlIIIIlllIl(W.dx() ? 1 : 0)) {
            void var48;
            void var54;
            void var7;
            void var24;
            int var47;
            TileObject var55;
            void var40;
            if (W.llIlIIIIllIll(var40.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && W.llIlIIIIllllI(var55 = TileObjects.getNearest(tileObject -> {
                int n2;
                if (W.llIlIIIIllIll(tileObject.getName().contains(llllIlIlll[llllIllIIl[218]]) ? 1 : 0) && W.llIlIIIlIIIll(tileObject.getWorldLocation().distanceTo(new WorldPoint(llllIllIIl[219], llllIllIIl[220], llllIllIIl[9])), llllIllIIl[2])) {
                    n2 = llllIllIIl[1];
                    0;
                    
                    }
                } else {
                    n2 = llllIllIIl[0];
                }
                return n2 != 0;
            }))) {
                var47 = Skills.getExperience((Skill)Skill.AGILITY);
                AccBuilderTempleTrek.c = llllIlIlll[llllIllIIl[180]];
                var55.interact(llllIlIlll[llllIllIIl[79]]);
                Time.sleepTicks((int)e.c(llllIllIIl[1], llllIllIIl[2]));
                0;
                Time.sleepUntil(() -> {
                    boolean bl;
                    if (W.llIlIIIIlllll(Skills.getExperience((Skill)Skill.AGILITY), var47)) {
                        bl = llllIllIIl[1];
                        0;
                        if (2 <= 0) {
                            return false;
                        }
                    } else {
                        bl = llllIllIIl[0];
                    }
                    return bl;
                }, (int)llllIllIIl[104]);
                0;
                Time.sleepTicks((int)llllIllIIl[1]);
                0;
            }
            if (W.llIlIIIIllIll(W.dx() ? 1 : 0)) {
                return;
            }
            if (W.llIlIIIIllIll(var24.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && W.llIlIIIIllllI(var55 = TileObjects.getNearest(tileObject -> {
                int n2;
                if (W.llIlIIIIllIll(tileObject.getName().contains(llllIlIlll[llllIllIIl[216]]) ? 1 : 0) && W.llIlIIIlIIIll(tileObject.getWorldLocation().distanceTo(new WorldPoint(llllIllIIl[217], llllIllIIl[128], llllIllIIl[2])), llllIllIIl[2])) {
                    n2 = llllIllIIl[1];
                    0;
                    if (1 == 0) {
                        return ((0x5B ^ 0x13 ^ (0x22 ^ 0x36)) & (0x3B ^ 0x68 ^ (0x74 ^ 0x7B) ^ -1)) != 0;
                    }
                } else {
                    n2 = llllIllIIl[0];
                }
                return n2 != 0;
            }))) {
                AccBuilderTempleTrek.c = llllIlIlll[llllIllIIl[181]];
                var47 = Skills.getExperience((Skill)Skill.AGILITY);
                var55.interact(llllIlIlll[llllIllIIl[182]]);
                Time.sleepTicks((int)e.c(llllIllIIl[1], llllIllIIl[2]));
                0;
                Time.sleepUntil(() -> {
                    boolean bl;
                    if (W.llIlIIIIlllll(Skills.getExperience((Skill)Skill.AGILITY), var47)) {
                        bl = llllIllIIl[1];
                        0;
                        if (1 < 0) {
                            return false;
                        }
                    } else {
                        bl = llllIllIIl[0];
                    }
                    return bl;
                }, (int)llllIllIIl[104]);
                0;
                Time.sleepTicks((int)llllIllIIl[1]);
                0;
            }
            if (W.llIlIIIIllIll(W.dx() ? 1 : 0)) {
                return;
            }
            if (W.llIlIIIIllIll(var7.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && W.llIlIIIIllllI(var55 = TileObjects.getNearest(tileObject -> {
                int n2;
                if (W.llIlIIIIllIll(tileObject.getName().contains(llllIlIlll[llllIllIIl[213]]) ? 1 : 0) && W.llIlIIIlIIIll(tileObject.getWorldLocation().distanceTo(new WorldPoint(llllIllIIl[214], llllIllIIl[215], llllIllIIl[2])), llllIllIIl[2])) {
                    n2 = llllIllIIl[1];
                    0;
                    if (1 < -1) {
                        return ((3 ^ (0x51 ^ 0x17)) & (0x21 ^ 0x4A ^ (0x41 ^ 0x6F) ^ -1)) != 0;
                    }
                } else {
                    n2 = llllIllIIl[0];
                }
                return n2 != 0;
            }))) {
                AccBuilderTempleTrek.c = llllIlIlll[llllIllIIl[183]];
                var47 = Skills.getExperience((Skill)Skill.AGILITY);
                var55.interact(llllIlIlll[llllIllIIl[184]]);
                Time.sleepTicks((int)e.c(llllIllIIl[1], llllIllIIl[2]));
                0;
                Time.sleepUntil(() -> {
                    boolean bl;
                    if (W.llIlIIIIlllll(Skills.getExperience((Skill)Skill.AGILITY), var47)) {
                        bl = llllIllIIl[1];
                        0;
                        if ((0x11 ^ 0x14) == 0) {
                            return (3 & ~3) != 0;
                        }
                    } else {
                        bl = llllIllIIl[0];
                    }
                    return bl;
                }, (int)llllIllIIl[104]);
                0;
                Time.sleepTicks((int)llllIllIIl[1]);
                0;
            }
            if (W.llIlIIIIllIll(W.dx() ? 1 : 0)) {
                return;
            }
            if (W.llIlIIIIllIll(var54.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && W.llIlIIIIllllI(var55 = TileObjects.getNearest(tileObject -> {
                int n2;
                if (W.llIlIIIIllIll(tileObject.getName().contains(llllIlIlll[llllIllIIl[211]]) ? 1 : 0) && W.llIlIIIlIIIll(tileObject.getWorldLocation().distanceTo(new WorldPoint(llllIllIIl[209], llllIllIIl[212], llllIllIIl[9])), llllIllIIl[2])) {
                    n2 = llllIllIIl[1];
                    0;
                    if (1 < 0) {
                        return ((0xD7 ^ 0xAC ^ (0x7F ^ 0x4C)) & (0x2A ^ 0x45 ^ (0x85 ^ 0xA2) ^ -1)) != 0;
                    }
                } else {
                    n2 = llllIllIIl[0];
                }
                return n2 != 0;
            }))) {
                AccBuilderTempleTrek.c = llllIlIlll[llllIllIIl[185]];
                var47 = Skills.getExperience((Skill)Skill.AGILITY);
                var55.interact(llllIlIlll[llllIllIIl[186]]);
                Time.sleepTicks((int)e.c(llllIllIIl[1], llllIllIIl[2]));
                0;
                Time.sleepUntil(() -> {
                    boolean bl;
                    if (W.llIlIIIIlllll(Skills.getExperience((Skill)Skill.AGILITY), var47)) {
                        bl = llllIllIIl[1];
                        0;
                        if (1 <= -1) {
                            return ((0x47 ^ 0x42 ^ (0x7E ^ 0x60)) & (0xAC ^ 0x9E ^ (0xB3 ^ 0x9A) ^ -1)) != 0;
                        }
                    } else {
                        bl = llllIllIIl[0];
                    }
                    return bl;
                }, (int)llllIllIIl[104]);
                0;
                Time.sleepTicks((int)llllIllIIl[1]);
                0;
            }
            if (W.llIlIIIIllIll(W.dx() ? 1 : 0)) {
                return;
            }
            if (W.llIlIIIIllIll(var48.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && W.llIlIIIIllllI(var55 = TileObjects.getNearest(tileObject -> {
                int n2;
                if (W.llIlIIIIllIll(tileObject.getName().contains(llllIlIlll[llllIllIIl[208]]) ? 1 : 0) && W.llIlIIIlIIIll(tileObject.getWorldLocation().distanceTo(new WorldPoint(llllIllIIl[209], llllIllIIl[210], llllIllIIl[2])), llllIllIIl[2])) {
                    n2 = llllIllIIl[1];
                    0;
                    
                    }
                } else {
                    n2 = llllIllIIl[0];
                }
                return n2 != 0;
            }))) {
                AccBuilderTempleTrek.c = llllIlIlll[llllIllIIl[187]];
                var47 = Skills.getExperience((Skill)Skill.AGILITY);
                var55.interact(llllIlIlll[llllIllIIl[188]]);
                Time.sleepTicks((int)e.c(llllIllIIl[1], llllIllIIl[2]));
                0;
                Time.sleepUntil(() -> {
                    boolean bl;
                    if (W.llIlIIIIlllll(Skills.getExperience((Skill)Skill.AGILITY), var47)) {
                        bl = llllIllIIl[1];
                        0;
                        if (((0x97 ^ 0xBA ^ (0x4D ^ 0x38)) & (0xD7 ^ 0x82 ^ (0xBD ^ 0xB0) ^ -1)) != 0) {
                            return ((170 + 178 - 243 + 79 ^ 37 + 64 - 95 + 129) & (0x67 ^ 0x55 ^ (0x78 ^ 0x75) ^ -1)) != 0;
                        }
                    } else {
                        bl = llllIllIIl[0];
                    }
                    return bl;
                }, (int)llllIllIIl[104]);
                0;
                Time.sleepTicks((int)llllIllIIl[1]);
                0;
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    private static void dt() {
        WorldArea worldArea = new WorldArea(llllIllIIl[46], llllIllIIl[47], llllIllIIl[11], llllIllIIl[20], llllIllIIl[0]);
        WorldArea worldArea2 = new WorldArea(llllIllIIl[46], llllIllIIl[48], llllIllIIl[49], llllIllIIl[24], llllIllIIl[0]);
        WorldArea worldArea3 = new WorldArea(llllIllIIl[46], llllIllIIl[50], llllIllIIl[49], llllIllIIl[24], llllIllIIl[1]);
        WorldArea worldArea4 = new WorldArea(llllIllIIl[51], llllIllIIl[52], llllIllIIl[53], llllIllIIl[54], llllIllIIl[2]);
        WorldArea worldArea5 = new WorldArea(llllIllIIl[55], llllIllIIl[56], llllIllIIl[24], llllIllIIl[11], llllIllIIl[2]);
        WorldArea worldArea6 = new WorldArea(llllIllIIl[57], llllIllIIl[58], llllIllIIl[49], llllIllIIl[11], llllIllIIl[0]);
        WorldArea worldArea7 = new WorldArea(llllIllIIl[59], llllIllIIl[60], llllIllIIl[11], llllIllIIl[20], llllIllIIl[0]);
        WorldArea worldArea8 = new WorldArea(llllIllIIl[46], llllIllIIl[47], llllIllIIl[61], llllIllIIl[20], llllIllIIl[0]);
        if (W.llIlIIIIlllIl(iV.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && W.llIlIIIIlllIl(iW.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && W.llIlIIIIlllIl(iX.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderTempleTrek.c = llllIlIlll[llllIllIIl[11]];
            e.a(iY);
            Time.sleepTicks((int)llllIllIIl[1]);
            0;
        }
        if ((!W.llIlIIIIlllIl(iV.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || !W.llIlIIIIlllIl(iW.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || W.llIlIIIIllIll(iX.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) && W.llIlIIIlIIIlI(Players.getLocal().getAnimation(), llllIllIIl[62]) && W.llIlIIIIlllIl(Players.getLocal().isMoving() ? 1 : 0)) {
            void var27;
            void var11;
            void var65;
            void var45;
            void var56;
            void var46;
            void var58;
            if (W.llIlIIIIllIll(var58.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderTempleTrek.c = llllIlIlll[llllIllIIl[49]];
                String[] stringArray = new String[llllIllIIl[1]];
                stringArray[W.llllIllIIl[0]] = llllIlIlll[llllIllIIl[63]];
                TileObjects.getNearest((String[])stringArray).interact(llllIlIlll[llllIllIIl[64]]);
                Time.sleepTicks((int)llllIllIIl[2]);
                0;
            }
            if (W.llIlIIIIllIll(var46.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderTempleTrek.c = llllIlIlll[llllIllIIl[53]];
                String[] stringArray = new String[llllIllIIl[1]];
                stringArray[W.llllIllIIl[0]] = llllIlIlll[llllIllIIl[38]];
                TileObjects.getNearest((String[])stringArray).interact(llllIlIlll[llllIllIIl[65]]);
                Time.sleepTicks((int)llllIllIIl[2]);
                0;
            }
            if (W.llIlIIIIllIll(var56.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderTempleTrek.c = llllIlIlll[llllIllIIl[66]];
                String[] stringArray = new String[llllIllIIl[1]];
                stringArray[W.llllIllIIl[0]] = llllIlIlll[llllIllIIl[54]];
                TileObjects.getNearest((String[])stringArray).interact(llllIlIlll[llllIllIIl[67]]);
                Time.sleepTicks((int)llllIllIIl[2]);
                0;
            }
            if (W.llIlIIIIllIll(var45.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderTempleTrek.c = llllIlIlll[llllIllIIl[40]];
                String[] stringArray = new String[llllIllIIl[1]];
                stringArray[W.llllIllIIl[0]] = llllIlIlll[llllIllIIl[68]];
                TileObjects.getNearest((String[])stringArray).interact(llllIlIlll[llllIllIIl[61]]);
                Time.sleepTicks((int)llllIllIIl[18]);
                0;
            }
            if (W.llIlIIIIllIll(var65.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderTempleTrek.c = llllIlIlll[llllIllIIl[69]];
                String[] stringArray = new String[llllIllIIl[1]];
                stringArray[W.llllIllIIl[0]] = llllIlIlll[llllIllIIl[70]];
                TileObjects.getNearest((String[])stringArray).interact(llllIlIlll[llllIllIIl[41]]);
                Time.sleepTicks((int)llllIllIIl[16]);
                0;
            }
            if (W.llIlIIIIllIll(var11.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderTempleTrek.c = llllIlIlll[llllIllIIl[71]];
                String[] stringArray = new String[llllIllIIl[1]];
                stringArray[W.llllIllIIl[0]] = llllIlIlll[llllIllIIl[72]];
                TileObjects.getNearest((String[])stringArray).interact(llllIlIlll[llllIllIIl[73]]);
                Time.sleepTicks((int)llllIllIIl[9]);
                0;
            }
            if (W.llIlIIIIllIll(var27.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderTempleTrek.c = llllIlIlll[llllIllIIl[74]];
                String[] stringArray = new String[llllIllIIl[1]];
                stringArray[W.llllIllIIl[0]] = llllIlIlll[llllIllIIl[42]];
                TileObjects.getNearest((String[])stringArray).interact(llllIlIlll[llllIllIIl[75]]);
                Time.sleepTicks((int)llllIllIIl[16]);
                0;
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    private static void dv() {
        void var2;
        void var10;
        void var53;
        void var38;
        void var26;
        WorldArea worldArea = new WorldArea(llllIllIIl[125], llllIllIIl[126], llllIllIIl[112], llllIllIIl[107], llllIllIIl[0]);
        WorldArea worldArea2 = new WorldArea(llllIllIIl[125], llllIllIIl[126], llllIllIIl[112], llllIllIIl[107], llllIllIIl[1]);
        WorldArea worldArea3 = new WorldArea(llllIllIIl[125], llllIllIIl[126], llllIllIIl[112], llllIllIIl[107], llllIllIIl[2]);
        WorldArea worldArea4 = new WorldArea(llllIllIIl[125], llllIllIIl[126], llllIllIIl[112], llllIllIIl[107], llllIllIIl[9]);
        WorldArea worldArea5 = new WorldArea(llllIllIIl[127], llllIllIIl[128], llllIllIIl[49], llllIllIIl[11], llllIllIIl[2]);
        WorldArea worldArea6 = new WorldArea(llllIllIIl[129], llllIllIIl[127], llllIllIIl[49], llllIllIIl[24], llllIllIIl[2]);
        WorldArea worldArea7 = new WorldArea(llllIllIIl[130], llllIllIIl[131], llllIllIIl[63], llllIllIIl[49], llllIllIIl[2]);
        WorldArea worldArea8 = new WorldArea(llllIllIIl[132], llllIllIIl[133], llllIllIIl[11], llllIllIIl[64], llllIllIIl[9]);
        WorldArea worldArea9 = new WorldArea(llllIllIIl[134], llllIllIIl[8], llllIllIIl[49], llllIllIIl[26], llllIllIIl[2]);
        WorldArea worldArea10 = new WorldArea(llllIllIIl[135], llllIllIIl[136], llllIllIIl[68], llllIllIIl[53], llllIllIIl[9]);
        WorldArea worldArea11 = new WorldArea(llllIllIIl[137], llllIllIIl[138], llllIllIIl[63], llllIllIIl[64], llllIllIIl[2]);
        WorldPoint worldPoint = new WorldPoint(llllIllIIl[137], llllIllIIl[139], llllIllIIl[0]);
        if (W.llIlIIIIllIll(Dialog.isOpen() ? 1 : 0)) {
            Dialog.close();
        }
        if (W.llIlIIIIlllIl(var26.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && W.llIlIIIIlllIl(var38.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && W.llIlIIIIlllIl(var53.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && W.llIlIIIIlllIl(var10.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderTempleTrek.c = llllIlIlll[llllIllIIl[140]];
            Movement.walkTo((WorldPoint)var2);
            0;
            Time.sleepTicks((int)llllIllIIl[1]);
            0;
        }
        if (W.llIlIIIIllIll(var26.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (W.llIlIIIIlllll(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)var2), llllIllIIl[20])) {
                AccBuilderTempleTrek.c = llllIlIlll[llllIllIIl[5]];
                Movement.walkTo((WorldPoint)var2);
                0;
                Time.sleepTicks((int)llllIllIIl[1]);
                0;
            }
            if (W.llIlIIIlIIIll(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)var2), llllIllIIl[20])) {
                AccBuilderTempleTrek.c = llllIlIlll[llllIllIIl[141]];
                int var25 = Skills.getExperience((Skill)Skill.AGILITY);
                String[] stringArray = new String[llllIllIIl[1]];
                stringArray[W.llllIllIIl[0]] = llllIlIlll[llllIllIIl[142]];
                TileObjects.getNearest((String[])stringArray).interact(llllIlIlll[llllIllIIl[143]]);
                Time.sleepTicks((int)e.c(llllIllIIl[1], llllIllIIl[2]));
                0;
                Time.sleepUntil(() -> {
                    boolean bl;
                    if (W.llIlIIIIlllll(Skills.getExperience((Skill)Skill.AGILITY), var25)) {
                        bl = llllIllIIl[1];
                        0;
                        if (3 != 3) {
                            return false;
                        }
                    } else {
                        bl = llllIllIIl[0];
                    }
                    return bl;
                }, (int)llllIllIIl[104]);
                0;
                Time.sleepTicks((int)llllIllIIl[1]);
                0;
            }
        }
        String[] stringArray = new String[llllIllIIl[1]];
        stringArray[W.llllIllIIl[0]] = llllIlIlll[llllIllIIl[144]];
        TileItem var25 = TileItems.getNearest((String[])stringArray);
        if (W.llIlIIIIllllI(var25) && W.llIlIIIIllIll(W.dx() ? 1 : 0)) {
            AccBuilderTempleTrek.c = llllIlIlll[llllIllIIl[145]];
            System.out.println(llllIlIlll[llllIllIIl[146]]);
            var25.interact(llllIlIlll[llllIllIIl[147]]);
            Time.sleepTicks((int)llllIllIIl[9]);
            0;
        }
        if (W.llIlIIIIlllIl(W.dx() ? 1 : 0)) {
            void var68;
            void var66;
            void var29;
            void var64;
            void var41;
            void var1;
            int var43;
            TileObject var5;
            void var62;
            if (W.llIlIIIIllIll(var62.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && W.llIlIIIIllllI(var5 = TileObjects.getNearest(tileObject -> {
                int n2;
                if (W.llIlIIIIllIll(tileObject.getName().contains(llllIlIlll[llllIllIIl[233]]) ? 1 : 0) && W.llIlIIIlIIIll(tileObject.getWorldLocation().distanceTo(new WorldPoint(llllIllIIl[234], llllIllIIl[131], llllIllIIl[2])), llllIllIIl[2])) {
                    n2 = llllIllIIl[1];
                    0;
                    
                    }
                } else {
                    n2 = llllIllIIl[0];
                }
                return n2 != 0;
            }))) {
                var43 = Skills.getExperience((Skill)Skill.AGILITY);
                AccBuilderTempleTrek.c = llllIlIlll[llllIllIIl[148]];
                var5.interact(llllIlIlll[llllIllIIl[149]]);
                Time.sleepTicks((int)e.c(llllIllIIl[1], llllIllIIl[2]));
                0;
                Time.sleepUntil(() -> {
                    boolean bl;
                    if (W.llIlIIIIlllll(Skills.getExperience((Skill)Skill.AGILITY), var43)) {
                        bl = llllIllIIl[1];
                        0;
                        if (1 >= 3) {
                            return ((113 + 17 - 111 + 176 ^ 95 + 81 - 99 + 61) & (0x65 ^ 1 ^ (0x25 ^ 8) ^ -1)) != 0;
                        }
                    } else {
                        bl = llllIllIIl[0];
                    }
                    return bl;
                }, (int)llllIllIIl[104]);
                0;
                Time.sleepTicks((int)llllIllIIl[1]);
                0;
            }
            if (W.llIlIIIIllIll(W.dx() ? 1 : 0)) {
                return;
            }
            if (W.llIlIIIIllIll(var1.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && W.llIlIIIIllllI(var5 = TileObjects.getNearest(tileObject -> {
                int n2;
                if (W.llIlIIIIllIll(tileObject.getName().contains(llllIlIlll[llllIllIIl[232]]) ? 1 : 0) && W.llIlIIIlIIIll(tileObject.getWorldLocation().distanceTo(new WorldPoint(llllIllIIl[131], llllIllIIl[225], llllIllIIl[2])), llllIllIIl[2])) {
                    n2 = llllIllIIl[1];
                    0;
                    if ((0x16 ^ 0x12) != (0x75 ^ 0x71)) {
                        return false;
                    }
                } else {
                    n2 = llllIllIIl[0];
                }
                return n2 != 0;
            }))) {
                AccBuilderTempleTrek.c = llllIlIlll[llllIllIIl[150]];
                var43 = Skills.getExperience((Skill)Skill.AGILITY);
                var5.interact(llllIlIlll[llllIllIIl[151]]);
                Time.sleepTicks((int)e.c(llllIllIIl[1], llllIllIIl[2]));
                0;
                Time.sleepUntil(() -> {
                    boolean bl;
                    if (W.llIlIIIIlllll(Skills.getExperience((Skill)Skill.AGILITY), var43)) {
                        bl = llllIllIIl[1];
                        0;
                        if ((0xC7 ^ 0xC3) < 3) {
                            return false;
                        }
                    } else {
                        bl = llllIllIIl[0];
                    }
                    return bl;
                }, (int)llllIllIIl[104]);
                0;
                Time.sleepTicks((int)llllIllIIl[1]);
                0;
            }
            if (W.llIlIIIIllIll(W.dx() ? 1 : 0)) {
                return;
            }
            if (W.llIlIIIIllIll(var41.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && W.llIlIIIIllllI(var5 = TileObjects.getNearest(tileObject -> {
                int n2;
                if (W.llIlIIIIllIll(tileObject.getName().contains(llllIlIlll[llllIllIIl[230]]) ? 1 : 0) && W.llIlIIIlIIIll(tileObject.getWorldLocation().distanceTo(new WorldPoint(llllIllIIl[139], llllIllIIl[231], llllIllIIl[2])), llllIllIIl[2])) {
                    n2 = llllIllIIl[1];
                    0;
                    if (-1 > 0) {
                        return (1 & ~1) != 0;
                    }
                } else {
                    n2 = llllIllIIl[0];
                }
                return n2 != 0;
            }))) {
                AccBuilderTempleTrek.c = llllIlIlll[llllIllIIl[152]];
                var43 = Skills.getExperience((Skill)Skill.AGILITY);
                var5.interact(llllIlIlll[llllIllIIl[153]]);
                Time.sleepTicks((int)e.c(llllIllIIl[1], llllIllIIl[2]));
                0;
                Time.sleepUntil(() -> {
                    boolean bl;
                    if (W.llIlIIIIlllll(Skills.getExperience((Skill)Skill.AGILITY), var43)) {
                        bl = llllIllIIl[1];
                        0;
                        if (-1 > 1) {
                            return ((101 + 170 - 146 + 77 ^ 102 + 103 - 179 + 142) & (5 ^ 0x54 ^ (0x69 ^ 0x5A) ^ -1)) != 0;
                        }
                    } else {
                        bl = llllIllIIl[0];
                    }
                    return bl;
                }, (int)llllIllIIl[104]);
                0;
                Time.sleepTicks((int)llllIllIIl[1]);
                0;
            }
            if (W.llIlIIIIllIll(W.dx() ? 1 : 0)) {
                return;
            }
            if (W.llIlIIIIllIll(var64.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && W.llIlIIIIllllI(var5 = TileObjects.getNearest(tileObject -> {
                int n2;
                if (W.llIlIIIIllIll(tileObject.getName().contains(llllIlIlll[llllIllIIl[227]]) ? 1 : 0) && W.llIlIIIlIIIll(tileObject.getWorldLocation().distanceTo(new WorldPoint(llllIllIIl[228], llllIllIIl[229], llllIllIIl[9])), llllIllIIl[2])) {
                    n2 = llllIllIIl[1];
                    0;
                    
                    }
                } else {
                    n2 = llllIllIIl[0];
                }
                return n2 != 0;
            }))) {
                AccBuilderTempleTrek.c = llllIlIlll[llllIllIIl[154]];
                var43 = Skills.getExperience((Skill)Skill.AGILITY);
                var5.interact(llllIlIlll[llllIllIIl[155]]);
                Time.sleepTicks((int)e.c(llllIllIIl[1], llllIllIIl[2]));
                0;
                Time.sleepUntil(() -> {
                    boolean bl;
                    if (W.llIlIIIIlllll(Skills.getExperience((Skill)Skill.AGILITY), var43)) {
                        bl = llllIllIIl[1];
                        0;
                        if ((125 + 53 - 133 + 106 ^ 26 + 146 - 38 + 13) <= 0) {
                            return false;
                        }
                    } else {
                        bl = llllIllIIl[0];
                    }
                    return bl;
                }, (int)llllIllIIl[104]);
                0;
                Time.sleepTicks((int)llllIllIIl[1]);
                0;
            }
            if (W.llIlIIIIllIll(W.dx() ? 1 : 0)) {
                return;
            }
            if (W.llIlIIIIllIll(var29.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && W.llIlIIIIllllI(var5 = TileObjects.getNearest(tileObject -> {
                int n2;
                if (W.llIlIIIIllIll(tileObject.getName().contains(llllIlIlll[llllIllIIl[226]]) ? 1 : 0) && W.llIlIIIlIIIll(tileObject.getWorldLocation().distanceTo(new WorldPoint(llllIllIIl[8], llllIllIIl[130], llllIllIIl[2])), llllIllIIl[2])) {
                    n2 = llllIllIIl[1];
                    0;
                    
                    }
                } else {
                    n2 = llllIllIIl[0];
                }
                return n2 != 0;
            }))) {
                AccBuilderTempleTrek.c = llllIlIlll[llllIllIIl[156]];
                var43 = Skills.getExperience((Skill)Skill.AGILITY);
                var5.interact(llllIlIlll[llllIllIIl[157]]);
                Time.sleepTicks((int)e.c(llllIllIIl[1], llllIllIIl[2]));
                0;
                Time.sleepUntil(() -> {
                    boolean bl;
                    if (W.llIlIIIIlllll(Skills.getExperience((Skill)Skill.AGILITY), var43)) {
                        bl = llllIllIIl[1];
                        0;
                        if (2 < ((0x72 ^ 0x24) & ~(0x3E ^ 0x68))) {
                            return false;
                        }
                    } else {
                        bl = llllIllIIl[0];
                    }
                    return bl;
                }, (int)llllIllIIl[104]);
                0;
                Time.sleepTicks((int)llllIllIIl[1]);
                0;
            }
            if (W.llIlIIIIllIll(W.dx() ? 1 : 0)) {
                return;
            }
            if (W.llIlIIIIllIll(var66.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && W.llIlIIIIllllI(var5 = TileObjects.getNearest(tileObject -> {
                int n2;
                if (W.llIlIIIIllIll(tileObject.getName().contains(llllIlIlll[llllIllIIl[224]]) ? 1 : 0) && W.llIlIIIlIIIll(tileObject.getWorldLocation().distanceTo(new WorldPoint(llllIllIIl[225], llllIllIIl[215], llllIllIIl[9])), llllIllIIl[2])) {
                    n2 = llllIllIIl[1];
                    0;
                    if (3 < 2) {
                        return false;
                    }
                } else {
                    n2 = llllIllIIl[0];
                }
                return n2 != 0;
            }))) {
                AccBuilderTempleTrek.c = llllIlIlll[llllIllIIl[158]];
                var43 = Skills.getExperience((Skill)Skill.AGILITY);
                var5.interact(llllIlIlll[llllIllIIl[159]]);
                Time.sleepTicks((int)e.c(llllIllIIl[1], llllIllIIl[2]));
                0;
                Time.sleepUntil(() -> {
                    boolean bl;
                    if (W.llIlIIIIlllll(Skills.getExperience((Skill)Skill.AGILITY), var43)) {
                        bl = llllIllIIl[1];
                        0;
                        
                        }
                    } else {
                        bl = llllIllIIl[0];
                    }
                    return bl;
                }, (int)llllIllIIl[104]);
                0;
                Time.sleepTicks((int)llllIllIIl[1]);
                0;
            }
            if (W.llIlIIIIllIll(W.dx() ? 1 : 0)) {
                return;
            }
            if (W.llIlIIIIllIll(var68.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && W.llIlIIIIllllI(var5 = TileObjects.getNearest(tileObject -> {
                int n2;
                if (W.llIlIIIIllIll(tileObject.getName().contains(llllIlIlll[llllIllIIl[221]]) ? 1 : 0) && W.llIlIIIlIIIll(tileObject.getWorldLocation().distanceTo(new WorldPoint(llllIllIIl[222], llllIllIIl[223], llllIllIIl[2])), llllIllIIl[2])) {
                    n2 = llllIllIIl[1];
                    0;
                    if (2 < 0) {
                        return false;
                    }
                } else {
                    n2 = llllIllIIl[0];
                }
                return n2 != 0;
            }))) {
                AccBuilderTempleTrek.c = llllIlIlll[llllIllIIl[160]];
                var43 = Skills.getExperience((Skill)Skill.AGILITY);
                var5.interact(llllIlIlll[llllIllIIl[161]]);
                Time.sleepTicks((int)e.c(llllIllIIl[1], llllIllIIl[2]));
                0;
                Time.sleepUntil(() -> {
                    boolean bl;
                    if (W.llIlIIIIlllll(Skills.getExperience((Skill)Skill.AGILITY), var43)) {
                        bl = llllIllIIl[1];
                        0;
                        
                        }
                    } else {
                        bl = llllIllIIl[0];
                    }
                    return bl;
                }, (int)llllIllIIl[104]);
                0;
                Time.sleepTicks((int)llllIllIIl[1]);
                0;
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    private static void du() {
        WorldArea worldArea = new WorldArea(llllIllIIl[76], llllIllIIl[77], llllIllIIl[78], llllIllIIl[79], llllIllIIl[1]);
        WorldArea worldArea2 = new WorldArea(llllIllIIl[76], llllIllIIl[77], llllIllIIl[78], llllIllIIl[79], llllIllIIl[2]);
        WorldArea worldArea3 = new WorldArea(llllIllIIl[76], llllIllIIl[77], llllIllIIl[78], llllIllIIl[79], llllIllIIl[9]);
        WorldArea worldArea4 = new WorldArea(llllIllIIl[80], llllIllIIl[81], llllIllIIl[69], llllIllIIl[64], llllIllIIl[0]);
        WorldArea worldArea5 = new WorldArea(llllIllIIl[82], llllIllIIl[81], llllIllIIl[11], llllIllIIl[64], llllIllIIl[9]);
        WorldArea worldArea6 = new WorldArea(llllIllIIl[83], llllIllIIl[84], llllIllIIl[63], llllIllIIl[49], llllIllIIl[9]);
        WorldArea worldArea7 = new WorldArea(llllIllIIl[85], llllIllIIl[86], llllIllIIl[26], llllIllIIl[22], llllIllIIl[1]);
        WorldArea worldArea8 = new WorldArea(llllIllIIl[85], llllIllIIl[87], llllIllIIl[11], llllIllIIl[24], llllIllIIl[9]);
        WorldArea worldArea9 = new WorldArea(llllIllIIl[88], llllIllIIl[89], llllIllIIl[75], llllIllIIl[40], llllIllIIl[9]);
        WorldArea worldArea10 = new WorldArea(llllIllIIl[90], llllIllIIl[91], llllIllIIl[66], llllIllIIl[64], llllIllIIl[9]);
        WorldArea worldArea11 = new WorldArea(llllIllIIl[92], llllIllIIl[93], llllIllIIl[22], llllIllIIl[26], llllIllIIl[9]);
        WorldArea worldArea12 = new WorldArea(llllIllIIl[92], llllIllIIl[94], llllIllIIl[11], llllIllIIl[22], llllIllIIl[9]);
        if (W.llIlIIIIlllIl(worldArea4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && W.llIlIIIIlllIl(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && W.llIlIIIIlllIl(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && W.llIlIIIIlllIl(worldArea3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderTempleTrek.c = llllIlIlll[llllIllIIl[95]];
            if (W.llIlIIIIllIll(Bank.isOpen() ? 1 : 0)) {
                Bank.close();
            }
            if (W.llIlIIIIllIll(Dialog.isOpen() ? 1 : 0)) {
                Dialog.close();
            }
            Movement.walkTo((WorldPoint)new WorldPoint(llllIllIIl[96], llllIllIIl[52], llllIllIIl[0]));
            0;
            Time.sleepTicks((int)llllIllIIl[1]);
            0;
        }
        if (W.llIlIIIlIIIlI(Players.getLocal().getAnimation(), llllIllIIl[62]) && W.llIlIIIIlllIl(Players.getLocal().isMoving() ? 1 : 0)) {
            String[] stringArray = new String[llllIllIIl[1]];
            stringArray[W.llllIllIIl[0]] = llllIlIlll[llllIllIIl[97]];
            TileItem var6 = TileItems.getNearest((String[])stringArray);
            if (W.llIlIIIIllllI(var6) && W.llIlIIIIllIll(W.dx() ? 1 : 0)) {
                AccBuilderTempleTrek.c = llllIlIlll[llllIllIIl[98]];
                System.out.println(llllIlIlll[llllIllIIl[99]]);
                var6.interact(llllIlIlll[llllIllIIl[100]]);
                Time.sleepTicks((int)llllIllIIl[9]);
                0;
            }
            if (W.llIlIIIIlllIl(W.dx() ? 1 : 0)) {
                void var51;
                void var30;
                void var14;
                void var28;
                void var17;
                void var20;
                void var70;
                void var8;
                int var67;
                void var35;
                if (W.llIlIIIIllIll(var35.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && W.llIlIIIIlllIl(W.dx() ? 1 : 0)) {
                    AccBuilderTempleTrek.c = llllIlIlll[llllIllIIl[101]];
                    var67 = Skills.getExperience((Skill)Skill.AGILITY);
                    String[] stringArray2 = new String[llllIllIIl[1]];
                    stringArray2[W.llllIllIIl[0]] = llllIlIlll[llllIllIIl[102]];
                    TileObjects.getNearest((String[])stringArray2).interact(llllIlIlll[llllIllIIl[103]]);
                    Time.sleepUntil(() -> {
                        boolean bl;
                        if (W.llIlIIIIlllll(Skills.getExperience((Skill)Skill.AGILITY), var67)) {
                            bl = llllIllIIl[1];
                            0;
                            if (1 <= 0) {
                                return ((110 + 16 - 30 + 76 ^ 40 + 27 - 31 + 132) & (0x4A ^ 0x26 ^ (0xC6 ^ 0xAE) ^ -1)) != 0;
                            }
                        } else {
                            bl = llllIllIIl[0];
                        }
                        return bl;
                    }, (int)llllIllIIl[104]);
                    0;
                    Time.sleepTicks((int)llllIllIIl[1]);
                    0;
                }
                if (W.llIlIIIIllIll(var8.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && W.llIlIIIIlllIl(W.dx() ? 1 : 0)) {
                    AccBuilderTempleTrek.c = llllIlIlll[llllIllIIl[37]];
                    var67 = Skills.getExperience((Skill)Skill.AGILITY);
                    String[] stringArray3 = new String[llllIllIIl[1]];
                    stringArray3[W.llllIllIIl[0]] = llllIlIlll[llllIllIIl[105]];
                    TileObjects.getNearest((String[])stringArray3).interact(llllIlIlll[llllIllIIl[106]]);
                    Time.sleepUntil(() -> {
                        boolean bl;
                        if (W.llIlIIIIlllll(Skills.getExperience((Skill)Skill.AGILITY), var67)) {
                            bl = llllIllIIl[1];
                            0;
                            if (1 == 2) {
                                return ((0 + 96 - -27 + 111 ^ 46 + 152 - 166 + 128) & (0x1F ^ 0x27 ^ (0xCB ^ 0xB9) ^ -1)) != 0;
                            }
                        } else {
                            bl = llllIllIIl[0];
                        }
                        return bl;
                    }, (int)llllIllIIl[104]);
                    0;
                    Time.sleepTicks((int)llllIllIIl[1]);
                    0;
                }
                if (W.llIlIIIIllIll(var70.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && W.llIlIIIIlllIl(W.dx() ? 1 : 0)) {
                    AccBuilderTempleTrek.c = llllIlIlll[llllIllIIl[107]];
                    var67 = Skills.getExperience((Skill)Skill.AGILITY);
                    String[] stringArray4 = new String[llllIllIIl[1]];
                    stringArray4[W.llllIllIIl[0]] = llllIlIlll[llllIllIIl[108]];
                    TileObjects.getNearest((String[])stringArray4).interact(llllIlIlll[llllIllIIl[109]]);
                    Time.sleepUntil(() -> {
                        boolean bl;
                        if (W.llIlIIIIlllll(Skills.getExperience((Skill)Skill.AGILITY), var67)) {
                            bl = llllIllIIl[1];
                            0;
                            if (2 == 0) {
                                return false;
                            }
                        } else {
                            bl = llllIllIIl[0];
                        }
                        return bl;
                    }, (int)llllIllIIl[104]);
                    0;
                    Time.sleepTicks((int)llllIllIIl[1]);
                    0;
                }
                if (W.llIlIIIIllIll(var20.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && W.llIlIIIIlllIl(W.dx() ? 1 : 0)) {
                    AccBuilderTempleTrek.c = llllIlIlll[llllIllIIl[110]];
                    var67 = Skills.getExperience((Skill)Skill.AGILITY);
                    String[] stringArray5 = new String[llllIllIIl[1]];
                    stringArray5[W.llllIllIIl[0]] = llllIlIlll[llllIllIIl[111]];
                    TileObjects.getNearest((String[])stringArray5).interact(llllIlIlll[llllIllIIl[112]]);
                    Time.sleepUntil(() -> {
                        boolean bl;
                        if (W.llIlIIIIlllll(Skills.getExperience((Skill)Skill.AGILITY), var67)) {
                            bl = llllIllIIl[1];
                            0;
                            if (((0x77 ^ 0x53) & ~(0x9F ^ 0xBB)) == (0xC1 ^ 0xC5)) {
                                return false;
                            }
                        } else {
                            bl = llllIllIIl[0];
                        }
                        return bl;
                    }, (int)llllIllIIl[104]);
                    0;
                    Time.sleepTicks((int)llllIllIIl[1]);
                    0;
                }
                if (W.llIlIIIIllIll(var17.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && W.llIlIIIIlllIl(W.dx() ? 1 : 0)) {
                    AccBuilderTempleTrek.c = llllIlIlll[llllIllIIl[113]];
                    var67 = Skills.getExperience((Skill)Skill.AGILITY);
                    String[] stringArray6 = new String[llllIllIIl[1]];
                    stringArray6[W.llllIllIIl[0]] = llllIlIlll[llllIllIIl[39]];
                    TileObjects.getNearest((String[])stringArray6).interact(llllIlIlll[llllIllIIl[6]]);
                    Time.sleepUntil(() -> {
                        boolean bl;
                        if (W.llIlIIIIlllll(Skills.getExperience((Skill)Skill.AGILITY), var67)) {
                            bl = llllIllIIl[1];
                            0;
                            if (-1 >= 0) {
                                return (2 & (2 ^ -1)) != 0;
                            }
                        } else {
                            bl = llllIllIIl[0];
                        }
                        return bl;
                    }, (int)llllIllIIl[104]);
                    0;
                    Time.sleepTicks((int)llllIllIIl[1]);
                    0;
                }
                if (W.llIlIIIIllIll(var28.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && W.llIlIIIIlllIl(W.dx() ? 1 : 0)) {
                    AccBuilderTempleTrek.c = llllIlIlll[llllIllIIl[114]];
                    var67 = Skills.getExperience((Skill)Skill.AGILITY);
                    int[] nArray = new int[llllIllIIl[1]];
                    nArray[W.llllIllIIl[0]] = llllIllIIl[115];
                    TileObjects.getNearest((int[])nArray).interact(llllIlIlll[llllIllIIl[116]]);
                    Time.sleepUntil(() -> {
                        boolean bl;
                        if (W.llIlIIIIlllll(Skills.getExperience((Skill)Skill.AGILITY), var67)) {
                            bl = llllIllIIl[1];
                            0;
                            
                            }
                        } else {
                            bl = llllIllIIl[0];
                        }
                        return bl;
                    }, (int)llllIllIIl[104]);
                    0;
                    Time.sleepTicks((int)llllIllIIl[1]);
                    0;
                }
                if (W.llIlIIIIllIll(var14.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && W.llIlIIIIlllIl(W.dx() ? 1 : 0)) {
                    AccBuilderTempleTrek.c = llllIlIlll[llllIllIIl[117]];
                    var67 = Skills.getExperience((Skill)Skill.AGILITY);
                    int[] nArray = new int[llllIllIIl[1]];
                    nArray[W.llllIllIIl[0]] = llllIllIIl[118];
                    TileObjects.getNearest((int[])nArray).interact(llllIlIlll[llllIllIIl[119]]);
                    Time.sleepUntil(() -> {
                        boolean bl;
                        if (W.llIlIIIIlllll(Skills.getExperience((Skill)Skill.AGILITY), var67)) {
                            bl = llllIllIIl[1];
                            0;
                            if (-1 != -1) {
                                return (2 & (2 ^ -1)) != 0;
                            }
                        } else {
                            bl = llllIllIIl[0];
                        }
                        return bl;
                    }, (int)llllIllIIl[104]);
                    0;
                    Time.sleepTicks((int)llllIllIIl[1]);
                    0;
                }
                if (W.llIlIIIIllIll(var30.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && W.llIlIIIIlllIl(W.dx() ? 1 : 0)) {
                    AccBuilderTempleTrek.c = llllIlIlll[llllIllIIl[120]];
                    var67 = Skills.getExperience((Skill)Skill.AGILITY);
                    int[] nArray = new int[llllIllIIl[1]];
                    nArray[W.llllIllIIl[0]] = llllIllIIl[121];
                    TileObjects.getNearest((int[])nArray).interact(llllIlIlll[llllIllIIl[122]]);
                    Time.sleepUntil(() -> {
                        boolean bl;
                        if (W.llIlIIIIlllll(Skills.getExperience((Skill)Skill.AGILITY), var67)) {
                            bl = llllIllIIl[1];
                            0;
                            if (1 == 0) {
                                return ((0x6F ^ 0x26 ^ (0x4D ^ 0x59) & ~(0x66 ^ 0x72)) & (8 ^ 0x5C ^ (0x38 ^ 0x25) ^ -1)) != 0;
                            }
                        } else {
                            bl = llllIllIIl[0];
                        }
                        return bl;
                    }, (int)llllIllIIl[104]);
                    0;
                    Time.sleepTicks((int)llllIllIIl[1]);
                    0;
                }
                if (W.llIlIIIIllIll(var51.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && W.llIlIIIIlllIl(W.dx() ? 1 : 0)) {
                    AccBuilderTempleTrek.c = llllIlIlll[llllIllIIl[123]];
                    var67 = Skills.getExperience((Skill)Skill.AGILITY);
                    String[] stringArray7 = new String[llllIllIIl[1]];
                    stringArray7[W.llllIllIIl[0]] = llllIlIlll[llllIllIIl[124]];
                    TileObjects.getNearest((String[])stringArray7).interact(llllIlIlll[llllIllIIl[44]]);
                    Time.sleepUntil(() -> {
                        boolean bl;
                        if (W.llIlIIIIlllll(Skills.getExperience((Skill)Skill.AGILITY), var67)) {
                            bl = llllIllIIl[1];
                            0;
                            
                            }
                        } else {
                            bl = llllIllIIl[0];
                        }
                        return bl;
                    }, (int)llllIllIIl[104]);
                    0;
                    Time.sleepTicks((int)llllIllIIl[1]);
                    0;
                }
            }
        }
    }

    private static boolean llIlIIIlIIIll(int n2, int n3) {
        return n2 <= n3;
    }

    public static void ds() {
        if (W.llIlIIIIllIll(bs ? 1 : 0)) {
            AccBuilderTempleTrek.c = llllIlIlll[llllIllIIl[0]];
            b.a(bu);
            if (W.llIlIIIIlllII(bu.size(), llllIllIIl[1])) {
                System.out.println(llllIlIlll[llllIllIIl[1]]);
                bs = llllIllIIl[0];
            }
        }
        if (W.llIlIIIIlllIl(bs ? 1 : 0)) {
            if (W.llIlIIIIlllIl(W.aa() ? 1 : 0)) {
                BankLocation var12 = BankLocation.getNearest();
                if (W.llIlIIIIllllI(var12) && W.llIlIIIIlllIl(var12.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderTempleTrek.c = llllIlIlll[llllIllIIl[2]];
                    WorldArea var34 = new WorldArea(llllIllIIl[3], llllIllIIl[4], llllIllIIl[5], llllIllIIl[6], llllIllIIl[0]);
                    if (W.llIlIIIIllIll(var34.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        WorldPoint var21 = new WorldPoint(llllIllIIl[7], llllIllIIl[8], llllIllIIl[0]);
                        if (W.llIlIIIIlllll(Players.getLocal().getWorldLocation().distanceTo(var21), llllIllIIl[9])) {
                            Movement.walkTo((WorldPoint)var21);
                            0;
                            Time.sleepTicks((int)llllIllIIl[1]);
                            0;
                        }
                    }
                    a.a(var12);
                }
                if (W.llIlIIIIllllI(var12) && W.llIlIIIIllIll(var12.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderTempleTrek.c = llllIlIlll[llllIllIIl[9]];
                    if (W.llIlIIIIlllIl(Bank.isOpen() ? 1 : 0)) {
                        a.a();
                        Time.sleepUntil(() -> Bank.isOpen(), (int)llllIllIIl[10]);
                        0;
                    }
                    if (W.llIlIIIIllIll(Bank.isOpen() ? 1 : 0)) {
                        if (W.llIlIIIlIIIII(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks((int)llllIllIIl[1]);
                            0;
                        }
                        if (W.llIlIIIlIIIII(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks((int)llllIllIIl[2]);
                            0;
                        }
                    }
                    int[] nArray = new int[llllIllIIl[11]];
                    nArray[W.llllIllIIl[0]] = llllIllIIl[12];
                    nArray[W.llllIllIIl[1]] = llllIllIIl[13];
                    nArray[W.llllIllIIl[2]] = llllIllIIl[14];
                    nArray[W.llllIllIIl[9]] = llllIllIIl[15];
                    nArray[W.llllIllIIl[16]] = llllIllIIl[17];
                    nArray[W.llllIllIIl[18]] = llllIllIIl[19];
                    nArray[W.llllIllIIl[20]] = llllIllIIl[21];
                    nArray[W.llllIllIIl[22]] = llllIllIIl[23];
                    nArray[W.llllIllIIl[24]] = llllIllIIl[25];
                    nArray[W.llllIllIIl[26]] = llllIllIIl[27];
                    if (W.llIlIIIIlllIl(e.b(nArray) ? 1 : 0)) {
                        W.ae();
                        System.out.println(llllIlIlll[llllIllIIl[16]]);
                        bs = llllIllIIl[1];
                        return;
                    }
                    int[] nArray2 = new int[llllIllIIl[11]];
                    nArray2[W.llllIllIIl[0]] = llllIllIIl[12];
                    nArray2[W.llllIllIIl[1]] = llllIllIIl[13];
                    nArray2[W.llllIllIIl[2]] = llllIllIIl[14];
                    nArray2[W.llllIllIIl[9]] = llllIllIIl[15];
                    nArray2[W.llllIllIIl[16]] = llllIllIIl[17];
                    nArray2[W.llllIllIIl[18]] = llllIllIIl[19];
                    nArray2[W.llllIllIIl[20]] = llllIllIIl[21];
                    nArray2[W.llllIllIIl[22]] = llllIllIIl[23];
                    nArray2[W.llllIllIIl[24]] = llllIllIIl[25];
                    nArray2[W.llllIllIIl[26]] = llllIllIIl[27];
                    if (W.llIlIIIIllIll(e.b(nArray2) ? 1 : 0)) {
                        a.a(llllIllIIl[28], llllIllIIl[1]);
                        a.a(llllIllIIl[29], llllIllIIl[1]);
                        a.a(llllIllIIl[30], llllIllIIl[1]);
                        a.a(llllIllIIl[31], llllIllIIl[1]);
                        a.a(llllIllIIl[32], llllIllIIl[1]);
                        a.a(llllIllIIl[33], llllIllIIl[1]);
                        a.a(llllIllIIl[34], llllIllIIl[1]);
                        int[] nArray3 = new int[llllIllIIl[1]];
                        nArray3[W.llllIllIIl[0]] = llllIllIIl[28];
                        if (W.llIlIIIIlllIl(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                            int[] nArray4 = new int[llllIllIIl[1]];
                            nArray4[W.llllIllIIl[0]] = llllIllIIl[28];
                            if (W.llIlIIIIlllIl(Equipment.contains((int[])nArray4) ? 1 : 0)) {
                                int[] nArray5 = new int[llllIllIIl[1]];
                                nArray5[W.llllIllIIl[0]] = llllIllIIl[28];
                                if (W.llIlIIIIlllIl(Bank.contains((int[])nArray5) ? 1 : 0)) {
                                    a.a(llllIllIIl[35], llllIllIIl[1]);
                                }
                            }
                        }
                        a.a(llllIllIIl[17], llllIllIIl[1]);
                        e.l(llllIllIIl[28]);
                        e.l(llllIllIIl[29]);
                        e.l(llllIllIIl[30]);
                        e.l(llllIllIIl[31]);
                        e.l(llllIllIIl[32]);
                        Time.sleepTicks((int)llllIllIIl[1]);
                        0;
                        e.l(llllIllIIl[34]);
                        e.l(llllIllIIl[36]);
                        e.l(llllIllIIl[33]);
                        e.l(llllIllIIl[35]);
                        e.l(llllIllIIl[17]);
                        Time.sleepTicks((int)llllIllIIl[9]);
                        0;
                        if (W.llIlIIIIlllIl(Bank.isOpen() ? 1 : 0)) {
                            a.a();
                            Time.sleepTicks((int)llllIllIIl[20]);
                            0;
                        }
                        if (W.llIlIIIIllIll(Bank.isOpen() ? 1 : 0)) {
                            if (W.llIlIIIIlllII(Skills.getLevel((Skill)Skill.AGILITY), llllIllIIl[37])) {
                                a.a(llllIllIIl[12], llllIllIIl[11]);
                                a.a(llllIllIIl[13], llllIllIIl[11]);
                                a.a(llllIllIIl[21], llllIllIIl[11]);
                                a.a(llllIllIIl[14], llllIllIIl[11]);
                                a.b(f.be, llllIllIIl[1]);
                                a.a(llllIllIIl[27], llllIllIIl[1]);
                                a.a(llllIllIIl[19], llllIllIIl[18]);
                                a.a(llllIllIIl[23], llllIllIIl[38]);
                            }
                            if (W.llIlIIIlIIIIl(Skills.getLevel((Skill)Skill.AGILITY), llllIllIIl[37])) {
                                a.a(llllIllIIl[12], llllIllIIl[11]);
                                a.a(llllIllIIl[21], llllIllIIl[11]);
                                a.a(llllIllIIl[25], llllIllIIl[11]);
                                a.b(f.be, llllIllIIl[1]);
                                a.a(llllIllIIl[27], llllIllIIl[1]);
                                a.a(llllIllIIl[19], llllIllIIl[24]);
                                a.a(llllIllIIl[23], llllIllIIl[11]);
                            }
                        }
                    }
                }
            }
            if (W.llIlIIIIllIll(W.aa() ? 1 : 0)) {
                String[] stringArray = new String[llllIllIIl[1]];
                stringArray[W.llllIllIIl[0]] = llllIlIlll[llllIllIIl[18]];
                if (W.llIlIIIIllIll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    String[] stringArray2 = new String[llllIllIIl[1]];
                    stringArray2[W.llllIllIIl[0]] = llllIlIlll[llllIllIIl[20]];
                    Inventory.getFirst((String[])stringArray2).interact(llllIlIlll[llllIllIIl[22]]);
                }
                if (W.llIlIIIIllIll(Inventory.contains((int[])f.aU) ? 1 : 0) && W.llIlIIIIlllII(Movement.getRunEnergy(), llllIllIIl[39])) {
                    Inventory.getFirst((int[])f.aU).interact(llllIlIlll[llllIllIIl[24]]);
                    Time.sleepTicks((int)llllIllIIl[1]);
                    0;
                }
                if (W.llIlIIIIlllll(Combat.getMissingHealth(), llllIllIIl[40])) {
                    int[] nArray = new int[llllIllIIl[1]];
                    nArray[W.llllIllIIl[0]] = llllIllIIl[23];
                    if (W.llIlIIIIllIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        int[] nArray6 = new int[llllIllIIl[1]];
                        nArray6[W.llllIllIIl[0]] = llllIllIIl[23];
                        Inventory.getFirst((int[])nArray6).interact(llllIlIlll[llllIllIIl[26]]);
                        Time.sleepTicks((int)llllIllIIl[2]);
                        0;
                    }
                }
                if (W.llIlIIIIlllll(Movement.getRunEnergy(), llllIllIIl[41]) && W.llIlIIIIlllIl(Movement.isRunEnabled() ? 1 : 0)) {
                    Movement.toggleRun();
                }
                if (W.llIlIIIIlllII(Skills.getLevel((Skill)Skill.AGILITY), llllIllIIl[42])) {
                    W.dt();
                }
                if ((!W.llIlIIIlIIIIl(e.j(llllIllIIl[43]), llllIllIIl[44]) || W.llIlIIIIlllII(e.j(llllIllIIl[45]), llllIllIIl[18])) && W.llIlIIIlIIIIl(Skills.getLevel((Skill)Skill.AGILITY), llllIllIIl[42]) && W.llIlIIIIlllII(Skills.getLevel((Skill)Skill.AGILITY), llllIllIIl[44])) {
                    W.du();
                }
                if (W.llIlIIIlIIIIl(e.j(llllIllIIl[43]), llllIllIIl[44]) && W.llIlIIIlIIIIl(e.j(llllIllIIl[45]), llllIllIIl[18])) {
                    if (W.llIlIIIlIIIIl(Skills.getLevel((Skill)Skill.AGILITY), llllIllIIl[42]) && W.llIlIIIIlllII(Skills.getLevel((Skill)Skill.AGILITY), llllIllIIl[37])) {
                        W.du();
                    }
                    if (W.llIlIIIlIIIIl(Skills.getLevel((Skill)Skill.AGILITY), llllIllIIl[37]) && W.llIlIIIIlllII(Skills.getLevel((Skill)Skill.AGILITY), llllIllIIl[44])) {
                        W.dv();
                    }
                }
                if (W.llIlIIIlIIIIl(Skills.getLevel((Skill)Skill.AGILITY), llllIllIIl[44])) {
                    W.dw();
                }
            }
        }
    }

    private static void llIlIIIIllIlI() {
        llllIllIIl = new int[239];
        W.llllIllIIl[0] = (0x73 ^ 0x2D) & ~(0x63 ^ 0x3D);
        W.llllIllIIl[1] = 1;
        W.llllIllIIl[2] = 2;
        W.llllIllIIl[3] = -(0xFFFF9775 & 0x7ABB) & (0xFFFFBFBF & 0x5FF7);
        W.llllIllIIl[4] = -(0xFFFFD2DD & 0x6D33) & (0xFFFFDFBF & 0x6DD5);
        W.llllIllIIl[5] = 0x4B ^ 0x75;
        W.llllIllIIl[6] = 0x5E ^ 0 ^ (0x54 ^ 0x39);
        W.llllIllIIl[7] = -(0xFFFFF4DF & 0x2B61) & (0xFFFFADFC & 0x7FFB);
        W.llllIllIIl[8] = -(0xFFFFC7FF & 0x3A67) & (0xFFFF9FFF & 0x6FFE);
        W.llllIllIIl[9] = 3;
        W.llllIllIIl[10] = -(0xFFFFE477 & 0x7FCF) & (0xFFFFF7DE & 0x7FEF);
        W.llllIllIIl[11] = 0x93 ^ 0xA7 ^ (0x68 ^ 0x56);
        W.llllIllIIl[12] = 0xFFFFFFF7 & 0x1F4F;
        W.llllIllIIl[13] = 0xFFFFDF78 & 0x3FCF;
        W.llllIllIIl[14] = -(0x5C ^ 0x7B) & (0xFFFFBFEF & 0x5F7F);
        W.llllIllIIl[15] = -(0xFFFFFA7F & 0x45F1) & (0xFFFFCF7F & 0x7FFD);
        W.llllIllIIl[16] = 0xA6 ^ 0xA2;
        W.llllIllIIl[17] = -(0xFFFF9DB7 & 0x7369) & (0xFFFFFFEF & 0x3FFC);
        W.llllIllIIl[18] = 0x8A ^ 0x8F;
        W.llllIllIIl[19] = -(0xFFFFEF9B & 0x586F) & (0xFFFFFDFB & 0x7B5F);
        W.llllIllIIl[20] = 0x3C ^ 0x18 ^ (0x26 ^ 4);
        W.llllIllIIl[21] = -(0xFFFFE897 & 0x377D) & (0xFFFFBF5E & Short.MAX_VALUE);
        W.llllIllIIl[22] = 0xDA ^ 0x9B ^ (0xD8 ^ 0x9E);
        W.llllIllIIl[23] = 0xFFFF93AB & 0x6DD5;
        W.llllIllIIl[24] = 0xAB ^ 0x94 ^ (0x1C ^ 0x2B);
        W.llllIllIIl[25] = -(0xFFFFB27D & 0x7D9F) & (0xFFFFFCFF & 0x7FBF);
        W.llllIllIIl[26] = 0xA9 ^ 0xA0;
        W.llllIllIIl[27] = -(0xFFFFAC7B & 0x7386) & (0xFFFFFAFB & 0x779F);
        W.llllIllIIl[28] = -(0xFFFF999F & 0x77E3) & (0xFFFFFFDE & 0x3FF7);
        W.llllIllIIl[29] = -(0xFFFFD5E5 & 0x7B9B) & (0xFFFFFFFF & 0x7FD0);
        W.llllIllIIl[30] = -(0xFFFFDFBA & 0x31F7) & (0xFFFFFFFF & 0x3FFF);
        W.llllIllIIl[31] = 0xFFFFEF5E & 0x3EED;
        W.llllIllIIl[32] = 0xFFFFEED7 & 0x3F7A;
        W.llllIllIIl[33] = -(0xFFFFFD9B & 0x5376) & (0xFFFFFF5F & 0x7FFB);
        W.llllIllIIl[34] = 0xFFFFBFFA & 0x6EC5;
        W.llllIllIIl[35] = 0x36 ^ 0x6E;
        W.llllIllIIl[36] = -(0xFFFFB7FF & 0x68D1) & (0xFFFFEFDB & Short.MAX_VALUE);
        W.llllIllIIl[37] = 0x3F ^ 0x17;
        W.llllIllIIl[38] = 0x60 ^ 0x6F;
        W.llllIllIIl[39] = 0xB1 ^ 0x83;
        W.llllIllIIl[40] = 0x82 ^ 0x96;
        W.llllIllIIl[41] = 0xB8 ^ 0x81 ^ (1 ^ 0x21);
        W.llllIllIIl[42] = 0xAA ^ 0xC6 ^ (0xDF ^ 0xAD);
        W.llllIllIIl[43] = -(0xFFFFFCFF & 0x1FD1) & (0xFFFFBDFF & 0x5FFE);
        W.llllIllIIl[44] = 0x9F ^ 0x92 ^ (0x2A ^ 0x1B);
        W.llllIllIIl[45] = 0xFFFFC5F3 & 0x3B3F;
        W.llllIllIIl[46] = -(0xFFFFF6AB & 0xD5F) & (0xFFFFCDBF & 0x3FEF);
        W.llllIllIIl[47] = 0xFFFF8F6B & 0x7DFF;
        W.llllIllIIl[48] = -(0xFFFFF69F & 0x3B6B) & (0xFFFFFFEE & 0x3F7B);
        W.llllIllIIl[49] = 0x6F ^ 0x73 ^ (0xAB ^ 0xBC);
        W.llllIllIIl[50] = 0xFFFFCFDF & 0x3D7D;
        W.llllIllIIl[51] = -(0xFFFFDE6F & 0x739B) & (0xFFFFFBEB & 0x5FBF);
        W.llllIllIIl[52] = 0xFFFFDDD7 & 0x2F7F;
        W.llllIllIIl[53] = 0x23 ^ 0x3F ^ (0xA7 ^ 0xB5);
        W.llllIllIIl[54] = 0xB ^ 0x19;
        W.llllIllIIl[55] = 0xFFFF8BF3 & 0x7DBF;
        W.llllIllIIl[56] = -(0xFFFFD706 & 0x7AFF) & (0xFFFFFFFD & 0x5F5F);
        W.llllIllIIl[57] = -(0xFFFFBCF5 & 0x574F) & (0xFFFFFFF6 & 0x1DFF);
        W.llllIllIIl[58] = 0xFFFFDDFD & 0x2F5B;
        W.llllIllIIl[59] = -(0xFFFFEE5D & 0x35E3) & (0xFFFFAFF9 & 0x7DF7);
        W.llllIllIIl[60] = -(0xFFFFF4FF & 0x7B0D) & (0xFFFFFF6F & 0x7DFF);
        W.llllIllIIl[61] = 0xAB ^ 0xBD;
        W.llllIllIIl[62] = -1;
        W.llllIllIIl[63] = 96 + 53 - 53 + 53 ^ 10 + 146 - 86 + 83;
        W.llllIllIIl[64] = 0x42 ^ 0x23 ^ (0xAB ^ 0xC7);
        W.llllIllIIl[65] = 0x36 ^ 0x42 ^ (0x4A ^ 0x2E);
        W.llllIllIIl[66] = 0xD5 ^ 0xC4;
        W.llllIllIIl[67] = 0x37 ^ 0x52 ^ (0xC4 ^ 0xB2);
        W.llllIllIIl[68] = 0xA3 ^ 0x88 ^ (0x17 ^ 0x29);
        W.llllIllIIl[69] = 0x22 ^ 0x4F ^ (0x1A ^ 0x60);
        W.llllIllIIl[70] = 0x1E ^ 0xD ^ (0x25 ^ 0x2E);
        W.llllIllIIl[71] = 0x94 ^ 0xB0 ^ (0x63 ^ 0x5D);
        W.llllIllIIl[72] = 110 + 106 - 64 + 21 ^ 10 + 85 - 88 + 175;
        W.llllIllIIl[73] = 0x19 ^ 0x6A ^ (0x63 ^ 0xC);
        W.llllIllIIl[74] = 8 ^ 0x76 ^ (2 ^ 0x61);
        W.llllIllIIl[75] = 0x13 ^ 0xC;
        W.llllIllIIl[76] = -(0xFFFFE3D1 & 0x7EAF) & (0xFFFFEFFF & 0x7EDF);
        W.llllIllIIl[77] = -(0xFFFFFBE9 & 0x645F) & (0xFFFFFF7F & 0x6DDE);
        W.llllIllIIl[78] = (0x63 ^ 0x77) + (0xEC ^ 0x83) - (0x40 ^ 0x35) + (0x35 ^ 0x4E);
        W.llllIllIIl[79] = 67 + 149 - 130 + 119 ^ 5 + 65 - 50 + 127;
        W.llllIllIIl[80] = -(0xFFFFFDD3 & 0x122D) & (0xFFFFFCB7 & 0x1FDB);
        W.llllIllIIl[81] = 0xFFFFCF5B & 0x3DF5;
        W.llllIllIIl[82] = 0xFFFFFE9D & 0xDEE;
        W.llllIllIIl[83] = 0xFFFF9CFE & 0x6F7F;
        W.llllIllIIl[84] = -(0xFFFFF74C & 0x7ABF) & (0xFFFFFFFF & 0x7F5F);
        W.llllIllIIl[85] = -(0xFFFFF9DE & 0x37A3) & (0xFFFFFDF7 & 0x3FFF);
        W.llllIllIIl[86] = 0xFFFFAF55 & 0x5DFF;
        W.llllIllIIl[87] = 0xFFFFDFDB & 0x2D6D;
        W.llllIllIIl[88] = -(0xFFFFD597 & 0x6B6D) & (0xFFFFEFFF & 0x5D6F);
        W.llllIllIIl[89] = -(0xFFFFFFCF & 0x60F9) & (0xFFFFEFFF & 0x7DFE);
        W.llllIllIIl[90] = -(0xFFFFDFFD & 0x610F) & (0xFFFFDD9D & 0x6FFF);
        W.llllIllIIl[91] = 0xFFFFEDCF & 0x1F70;
        W.llllIllIIl[92] = 0xFFFFCFB7 & 0x3CEA;
        W.llllIllIIl[93] = -(0xFFFFD713 & 0x2AFD) & (0xFFFFDF5E & 0x2FFB);
        W.llllIllIIl[94] = -(0xFFFFF7A7 & 0x7AFE) & (0xFFFFFFFF & 0x7FF7);
        W.llllIllIIl[95] = 0xCD ^ 0xC4 ^ (0x75 ^ 0x5C);
        W.llllIllIIl[96] = 0xFFFFEFBA & 0x1CDD;
        W.llllIllIIl[97] = 0x5B ^ 0x7A;
        W.llllIllIIl[98] = 70 + 120 - 146 + 116 ^ 11 + 19 - -42 + 58;
        W.llllIllIIl[99] = 0x2F ^ 0xC;
        W.llllIllIIl[100] = 0x2E ^ 0x34 ^ (0xE ^ 0x30);
        W.llllIllIIl[101] = 0xC4 ^ 0xC0 ^ (0x2A ^ 0xB);
        W.llllIllIIl[102] = 0x68 ^ 0x4E;
        W.llllIllIIl[103] = 0x14 ^ 6 ^ (0xAD ^ 0x98);
        W.llllIllIIl[104] = -(0xFFFFFBE7 & 0x5CDB) & (0xFFFFFBFE & 0x7DF7);
        W.llllIllIIl[105] = 0x69 ^ 0x2F ^ (0x34 ^ 0x5B);
        W.llllIllIIl[106] = 0x4D ^ 0x67;
        W.llllIllIIl[107] = 0x36 ^ 0x6C ^ (0x2A ^ 0x5B);
        W.llllIllIIl[108] = 9 + 3 - -175 + 4 ^ 60 + 61 - 70 + 96;
        W.llllIllIIl[109] = 75 + 156 - 179 + 117 ^ 77 + 2 - -28 + 25;
        W.llllIllIIl[110] = 0xAC ^ 0x82;
        W.llllIllIIl[111] = 0x8E ^ 0xA1;
        W.llllIllIIl[112] = 0x2C ^ 0x1C;
        W.llllIllIIl[113] = 0x5E ^ 0x6F;
        W.llllIllIIl[114] = 47 + 143 - 133 + 104 ^ 134 + 116 - 171 + 70;
        W.llllIllIIl[115] = 0xFFFFF9FF & 0x3FF2;
        W.llllIllIIl[116] = 11 + 102 - 109 + 125 ^ 17 + 21 - 0 + 142;
        W.llllIllIIl[117] = 0x96 ^ 0xA0;
        W.llllIllIIl[118] = 0xFFFFF9F3 & 0x3FFF;
        W.llllIllIIl[119] = 0x7F ^ 0x48;
        W.llllIllIIl[120] = 0x42 ^ 0x5E ^ (0xE1 ^ 0xC5);
        W.llllIllIIl[121] = -(0xFFFFCDB7 & 0x364B) & (0xFFFFBFF6 & 0x7DFF);
        W.llllIllIIl[122] = 0x1C ^ 1 ^ (0x27 ^ 3);
        W.llllIllIIl[123] = 156 + 127 - 249 + 123 ^ 86 + 24 - -30 + 27;
        W.llllIllIIl[124] = 0xA0 ^ 0x9B;
        W.llllIllIIl[125] = 0xFFFF9FBF & 0x6DCF;
        W.llllIllIIl[126] = -(0xFFFFABF7 & 0x767D) & (0xFFFFEFFE & 0x3FFF);
        W.llllIllIIl[127] = 0xFFFFDFBE & 0x2DEF;
        W.llllIllIIl[128] = 0xFFFFDFBF & 0x2DE2;
        W.llllIllIIl[129] = 0xFFFFEDFF & 0x1FA7;
        W.llllIllIIl[130] = -(0xFFFFAAAF & 0x5775) & (0xFFFFBFFF & 0x4FBF);
        W.llllIllIIl[131] = 0xFFFFDDFB & 0x2FAD;
        W.llllIllIIl[132] = -(0xFFFFD46E & 0x7BB3) & (0xFFFFDFFB & 0x7DB5);
        W.llllIllIIl[133] = -(0xFFFFB7CF & 0x6A3F) & (0xFFFFFFAF & 0x2FFF);
        W.llllIllIIl[134] = 0xFFFFDDF7 & 0x2F9B;
        W.llllIllIIl[135] = 0xFFFFFFFF & 0xD9D;
        W.llllIllIIl[136] = 0xFFFF8DAF & 0x7FDB;
        W.llllIllIIl[137] = 0xFFFF8DBB & 0x7FF6;
        W.llllIllIIl[138] = -(0xFFFFDE7D & 0x23EB) & (0xFFFFEFFF & 0x1FF9);
        W.llllIllIIl[139] = -(0xFFFFF72D & 0x1AD3) & (0xFFFFDF9F & 0x3FFE);
        W.llllIllIIl[140] = 0x54 ^ 0x16 ^ 74 + 73 - 119 + 99;
        W.llllIllIIl[141] = 0x94 ^ 0xAB;
        W.llllIllIIl[142] = 180 + 43 - 147 + 164 ^ 73 + 135 - 34 + 2;
        W.llllIllIIl[143] = 0xC5 ^ 0x84;
        W.llllIllIIl[144] = 0x32 ^ 0x70;
        W.llllIllIIl[145] = 0x3A ^ 0x50 ^ (0x9F ^ 0xB6);
        W.llllIllIIl[146] = 0x48 ^ 0x51 ^ (0xD4 ^ 0x89);
        W.llllIllIIl[147] = 0xD8 ^ 0x9D;
        W.llllIllIIl[148] = 0xAB ^ 0xAC ^ (0xF9 ^ 0xB8);
        W.llllIllIIl[149] = 0x1A ^ 0x5D;
        W.llllIllIIl[150] = 0x34 ^ 5 ^ (0x14 ^ 0x6D);
        W.llllIllIIl[151] = 0x33 ^ 0x74 ^ (0xBA ^ 0xB4);
        W.llllIllIIl[152] = 0x8A ^ 0xC0;
        W.llllIllIIl[153] = 0x79 ^ 5 ^ (0x98 ^ 0xAF);
        W.llllIllIIl[154] = 0x1D ^ 0x5F ^ (0xAF ^ 0xA1);
        W.llllIllIIl[155] = 0x43 ^ 0xE;
        W.llllIllIIl[156] = 119 + 89 - 193 + 121 ^ 57 + 109 - -25 + 7;
        W.llllIllIIl[157] = 0x75 ^ 0x3A;
        W.llllIllIIl[158] = 0xCC ^ 0x8D ^ (0x3B ^ 0x2A);
        W.llllIllIIl[159] = 0x51 ^ 0;
        W.llllIllIIl[160] = 0x32 ^ 0x60;
        W.llllIllIIl[161] = 0x76 ^ 0x35 ^ (0x22 ^ 0x32);
        W.llllIllIIl[162] = -(0xFFFFFDE1 & 0x439F) & (0xFFFFDFFF & 0x6BFF);
        W.llllIllIIl[163] = -(0xFFFFA365 & 0x7E9B) & (0xFFFFEFFE & 0x3F7F);
        W.llllIllIIl[164] = 0xFFFF9BDF & 0x6EBF;
        W.llllIllIIl[165] = 0xFFFFBABD & 0x4FCF;
        W.llllIllIIl[166] = -(0xFFFFE5FB & 0x3F65) & (0xFFFFAFF3 & Short.MAX_VALUE);
        W.llllIllIIl[167] = -(0xFFFFFFFF & 0x5075) & (0xFFFFDAFF & 0x7FFD);
        W.llllIllIIl[168] = -(0xFFFFD1FF & 0x7F73) & (0xFFFFDBFE & 0x7FF3);
        W.llllIllIIl[169] = -(0xFFFFF27F & 0x4DFD) & (0xFFFFCFFF & 0x7DFD);
        W.llllIllIIl[170] = -(0xFFFFE737 & 0x79CF) & (0xFFFFFFFF & 0x6BAF);
        W.llllIllIIl[171] = 0xFFFFEFF7 & 0x1DA8;
        W.llllIllIIl[172] = 0x4A ^ 0x1E;
        W.llllIllIIl[173] = 0xF5 ^ 0x90 ^ (0x6D ^ 0x5D);
        W.llllIllIIl[174] = 0x7A ^ 0x37 ^ (0x61 ^ 0x7A);
        W.llllIllIIl[175] = 0xC3 ^ 0x94;
        W.llllIllIIl[176] = 0x6C ^ 0x56 ^ (0 ^ 0x63);
        W.llllIllIIl[177] = 0x6D ^ 0x33 ^ (8 ^ 0xC);
        W.llllIllIIl[178] = 0xF3 ^ 0xA8;
        W.llllIllIIl[179] = 0xD ^ 0x51;
        W.llllIllIIl[180] = 47 + 43 - -156 + 3 ^ 148 + 105 - 184 + 95;
        W.llllIllIIl[181] = 0x34 ^ 0x6B;
        W.llllIllIIl[182] = 0x1B ^ 0x7B;
        W.llllIllIIl[183] = 3 ^ (0x24 ^ 0x46);
        W.llllIllIIl[184] = 0x83 ^ 0x9C ^ (2 ^ 0x7F);
        W.llllIllIIl[185] = 0x67 ^ 0x1D ^ (0xB1 ^ 0xA8);
        W.llllIllIIl[186] = 0x32 ^ 0x56;
        W.llllIllIIl[187] = 5 + 202 - 64 + 108 ^ 136 + 90 - 127 + 59;
        W.llllIllIIl[188] = 0xF0 ^ 0x96;
        W.llllIllIIl[189] = -(0xFFFF99B1 & 0x774F) & (0xFFFF9F77 & 0x7DFF);
        W.llllIllIIl[190] = -(0xFFFFF27B & 0x7DA6) & (0xFFFFFD77 & Short.MAX_VALUE);
        W.llllIllIIl[191] = -(0xFFFFEB82 & 0x54FF) & (0xFFFFFCFF & 0x4FEF);
        W.llllIllIIl[192] = 0xFFFFEDBB & 0x1F7F;
        W.llllIllIIl[193] = 0xFFFFAE4F & 0x7FF9;
        W.llllIllIIl[194] = 0x5A ^ 0 ^ (0xFE ^ 0xC3);
        W.llllIllIIl[195] = 0xFFFFD5FD & 0x3F7E;
        W.llllIllIIl[196] = 0xFFFFE7AE & 0x79F9;
        W.llllIllIIl[197] = -(0xFFFFECDB & 0x776F) & (0xFFFFF7FF & 0x6FCE);
        W.llllIllIIl[198] = 0xFFFF93BE & 0x6FF7;
        W.llllIllIIl[199] = 0xFFFFEFFF & 0x179E;
        W.llllIllIIl[200] = 0xFFFFAAFF & 0x77F6;
        W.llllIllIIl[201] = -(0xFFFFAB77 & 0x558E) & (0xFFFFBFCF & 0x6FFF);
        W.llllIllIIl[202] = -(0xFFFFFB02 & 0xCFF) & (0xFFFFEFDF & 0x7D7F);
        W.llllIllIIl[203] = 0xAB ^ 0xC3;
        W.llllIllIIl[204] = 0x2E ^ 0x47;
        W.llllIllIIl[205] = 0x31 ^ 0x5B;
        W.llllIllIIl[206] = 0xE0 ^ 0x8B;
        W.llllIllIIl[207] = 20 + 0 - -203 + 8 ^ 106 + 71 - 140 + 102;
        W.llllIllIIl[208] = 0x54 ^ 0x39;
        W.llllIllIIl[209] = 0xFFFFDEFF & 0x2B8F;
        W.llllIllIIl[210] = -(0xFFFFD5F3 & 0x7A5F) & (0xFFFFFDDF & 0x5FFB);
        W.llllIllIIl[211] = 0x5F ^ 0x31;
        W.llllIllIIl[212] = 0xFFFF9DDD & 0x6FAF;
        W.llllIllIIl[213] = 7 ^ 0x16 ^ (0xE1 ^ 0x9F);
        W.llllIllIIl[214] = 0xFFFFDEF7 & 0x2B9F;
        W.llllIllIIl[215] = 0xFFFFCDFF & 0x3F94;
        W.llllIllIIl[216] = 0x7B ^ 0x60 ^ (0x3B ^ 0x50);
        W.llllIllIIl[217] = -(0xFFFFF5AF & 0x6E79) & (0xFFFFFEBE & 0x6FFF);
        W.llllIllIIl[218] = 172 + 89 - 242 + 178 ^ 83 + 157 - 89 + 29;
        W.llllIllIIl[219] = -(0xFFFFE5FB & 0x3E1F) & (0xFFFFEFBB & 0x3EFF);
        W.llllIllIIl[220] = 0xFFFFADED & 0x5FB7;
        W.llllIllIIl[221] = 0x42 ^ 0x28 ^ (0x4C ^ 0x54);
        W.llllIllIIl[222] = 0xFFFFFDFE & 0xFB7;
        W.llllIllIIl[223] = -(0xFFFFBA63 & 0x67BE) & (0xFFFFEFFD & 0x3FBF);
        W.llllIllIIl[224] = 0x68 ^ 0x18 ^ 3;
        W.llllIllIIl[225] = -(0xFFFFF15D & 0x5EB3) & (0xFFFFFFFF & 0x5DBF);
        W.llllIllIIl[226] = 0xFC ^ 0x88;
        W.llllIllIIl[227] = 0xD9 ^ 0xAC;
        W.llllIllIIl[228] = -(0xFFFFE5FF & 0x7A69) & (0xFFFFFFFF & 0x6DFE);
        W.llllIllIIl[229] = 0xFFFFFFB6 & 0xDED;
        W.llllIllIIl[230] = 0x42 ^ 0x34;
        W.llllIllIIl[231] = 0xFFFF8FFB & 0x7DAF;
        W.llllIllIIl[232] = 0x2C ^ 0x61 ^ (0xF8 ^ 0xC2);
        W.llllIllIIl[233] = 0xB7 ^ 0x85 ^ (0x39 ^ 0x73);
        W.llllIllIIl[234] = -(0xFFFFB61D & 0x79EF) & (0xFFFFFFBF & 0x3DFD);
        W.llllIllIIl[235] = 0xFFFF9FEF & 0x69B4;
        W.llllIllIIl[236] = -(0xFFFF9467 & 0x6FDE) & (0xFFFFCFFF & 0x3DEF);
        W.llllIllIIl[237] = -(0xFFFFF6EF & 0x5B93) & (0xFFFFFFEF & 0x5FFF);
        W.llllIllIIl[238] = 0x5A ^ 0x23;
    }

    @Override
    public String U() {
        return llllIlIlll[llllIllIIl[203]];
    }

    private static boolean llIlIIIlIIIlI(int n2, int n3) {
        return n2 == n3;
    }

    static {
        W.llIlIIIIllIlI();
        W.llIlIIIIlIllI();
        bu = new ArrayList<d>();
        iS = llllIllIIl[27];
        iT = llllIllIIl[23];
        iV = new WorldArea(llllIllIIl[235], llllIllIIl[52], llllIllIIl[69], llllIllIIl[72], llllIllIIl[0]);
        iW = new WorldArea(llllIllIIl[235], llllIllIIl[52], llllIllIIl[69], llllIllIIl[72], llllIllIIl[1]);
        iX = new WorldArea(llllIllIIl[235], llllIllIIl[52], llllIllIIl[69], llllIllIIl[72], llllIllIIl[2]);
        iY = new WorldPoint(llllIllIIl[236], llllIllIIl[237], llllIllIIl[0]);
    }

    private static boolean llIlIIIIllllI(Object object) {
        return object != null;
    }

    private static boolean llIlIIIIllIll(int n2) {
        return n2 != 0;
    }

    private static boolean llIlIIIlIIIIl(int n2, int n3) {
        return n2 >= n3;
    }

    /*
     * WARNING - void declaration
     */
    private static boolean dx() {
        WorldArea worldArea = new WorldArea(llllIllIIl[80], llllIllIIl[81], llllIllIIl[69], llllIllIIl[64], llllIllIIl[0]);
        WorldArea worldArea2 = new WorldArea(llllIllIIl[82], llllIllIIl[81], llllIllIIl[11], llllIllIIl[64], llllIllIIl[9]);
        WorldArea worldArea3 = new WorldArea(llllIllIIl[83], llllIllIIl[84], llllIllIIl[63], llllIllIIl[49], llllIllIIl[9]);
        WorldArea worldArea4 = new WorldArea(llllIllIIl[189], llllIllIIl[190], llllIllIIl[24], llllIllIIl[18], llllIllIIl[1]);
        WorldArea worldArea5 = new WorldArea(llllIllIIl[85], llllIllIIl[87], llllIllIIl[11], llllIllIIl[24], llllIllIIl[9]);
        WorldArea worldArea6 = new WorldArea(llllIllIIl[191], llllIllIIl[192], llllIllIIl[73], llllIllIIl[38], llllIllIIl[9]);
        WorldArea worldArea7 = new WorldArea(llllIllIIl[90], llllIllIIl[91], llllIllIIl[66], llllIllIIl[64], llllIllIIl[9]);
        WorldArea worldArea8 = new WorldArea(llllIllIIl[92], llllIllIIl[93], llllIllIIl[22], llllIllIIl[26], llllIllIIl[9]);
        WorldArea worldArea9 = new WorldArea(llllIllIIl[92], llllIllIIl[94], llllIllIIl[11], llllIllIIl[22], llllIllIIl[9]);
        WorldArea worldArea10 = new WorldArea(llllIllIIl[127], llllIllIIl[128], llllIllIIl[49], llllIllIIl[11], llllIllIIl[2]);
        WorldArea worldArea11 = new WorldArea(llllIllIIl[129], llllIllIIl[127], llllIllIIl[49], llllIllIIl[24], llllIllIIl[2]);
        WorldArea worldArea12 = new WorldArea(llllIllIIl[130], llllIllIIl[131], llllIllIIl[63], llllIllIIl[49], llllIllIIl[2]);
        WorldArea worldArea13 = new WorldArea(llllIllIIl[132], llllIllIIl[133], llllIllIIl[11], llllIllIIl[64], llllIllIIl[9]);
        WorldArea worldArea14 = new WorldArea(llllIllIIl[134], llllIllIIl[8], llllIllIIl[49], llllIllIIl[26], llllIllIIl[2]);
        WorldArea worldArea15 = new WorldArea(llllIllIIl[135], llllIllIIl[136], llllIllIIl[68], llllIllIIl[53], llllIllIIl[9]);
        WorldArea worldArea16 = new WorldArea(llllIllIIl[137], llllIllIIl[138], llllIllIIl[63], llllIllIIl[64], llllIllIIl[2]);
        WorldArea worldArea17 = new WorldArea(llllIllIIl[164], llllIllIIl[133], llllIllIIl[64], llllIllIIl[11], llllIllIIl[9]);
        WorldArea worldArea18 = new WorldArea(llllIllIIl[165], llllIllIIl[139], llllIllIIl[38], llllIllIIl[53], llllIllIIl[2]);
        WorldArea worldArea19 = new WorldArea(llllIllIIl[166], llllIllIIl[134], llllIllIIl[49], llllIllIIl[26], llllIllIIl[2]);
        WorldArea worldArea20 = new WorldArea(llllIllIIl[167], llllIllIIl[136], llllIllIIl[70], llllIllIIl[64], llllIllIIl[9]);
        WorldArea worldArea21 = new WorldArea(llllIllIIl[168], llllIllIIl[169], llllIllIIl[54], llllIllIIl[63], llllIllIIl[2]);
        WorldArea[] worldAreaArray = new WorldArea[llllIllIIl[68]];
        worldAreaArray[W.llllIllIIl[0]] = worldArea;
        worldAreaArray[W.llllIllIIl[1]] = worldArea2;
        worldAreaArray[W.llllIllIIl[2]] = worldArea3;
        worldAreaArray[W.llllIllIIl[9]] = worldArea4;
        worldAreaArray[W.llllIllIIl[16]] = worldArea5;
        worldAreaArray[W.llllIllIIl[18]] = worldArea6;
        worldAreaArray[W.llllIllIIl[20]] = worldArea7;
        worldAreaArray[W.llllIllIIl[22]] = worldArea8;
        worldAreaArray[W.llllIllIIl[24]] = worldArea9;
        worldAreaArray[W.llllIllIIl[26]] = worldArea10;
        worldAreaArray[W.llllIllIIl[11]] = worldArea11;
        worldAreaArray[W.llllIllIIl[49]] = worldArea12;
        worldAreaArray[W.llllIllIIl[63]] = worldArea13;
        worldAreaArray[W.llllIllIIl[64]] = worldArea14;
        worldAreaArray[W.llllIllIIl[53]] = worldArea15;
        worldAreaArray[W.llllIllIIl[38]] = worldArea16;
        worldAreaArray[W.llllIllIIl[65]] = worldArea17;
        worldAreaArray[W.llllIllIIl[66]] = worldArea18;
        worldAreaArray[W.llllIllIIl[54]] = worldArea19;
        worldAreaArray[W.llllIllIIl[67]] = worldArea20;
        worldAreaArray[W.llllIllIIl[40]] = worldArea21;
        WorldArea[] worldAreaArray2 = worldAreaArray;
        int[] nArray = new int[llllIllIIl[1]];
        nArray[W.llllIllIIl[0]] = llllIllIIl[193];
        if (W.llIlIIIIllllI(TileItems.getNearest((int[])nArray))) {
            void var9;
            System.out.println(llllIlIlll[llllIllIIl[194]]);
            int var42 = llllIllIIl[0];
            while (W.llIlIIIIlllII(var42, ((void)var9).length)) {
                int[] nArray2 = new int[llllIllIIl[1]];
                nArray2[W.llllIllIIl[0]] = llllIllIIl[193];
                if (W.llIlIIIIllIll(var9[var42].contains(TileItems.getNearest((int[])nArray2).getWorldLocation()) ? 1 : 0) && W.llIlIIIIllIll(var9[var42].contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    return llllIllIIl[1];
                }
                ++var42;
                0;
                if ((0xBF ^ 0xBB) >= 1) continue;
                return false;
            }
        }
        return llllIllIIl[0];
    }

    private static String llIlIIIIIlIII(String var49, String var39) {
        var49 = new String(Base64.getDecoder().decode(var49.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var71 = new StringBuilder();
        char[] var60 = var39.toCharArray();
        int var4 = llllIllIIl[0];
        char[] var33 = var49.toCharArray();
        int var3 = var33.length;
        int var13 = llllIllIIl[0];
        while (W.llIlIIIIlllII(var13, var3)) {
            char var52 = var33[var13];
            var71.append((char)(var52 ^ var60[var4 % var60.length]));
            0;
            ++var4;
            ++var13;
            0;
            if (-1 != 2) continue;
            return null;
        }
        return String.valueOf(var71);
    }

    private static boolean llIlIIIlIIIII(int n2) {
        return n2 > 0;
    }

    private static boolean llIlIIIIlllll(int n2, int n3) {
        return n2 > n3;
    }

    private static String llIlIIIIIIlll(String var31, String var37) {
        try {
            SecretKeySpec var23 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var37.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var69 = Cipher.getInstance("Blowfish");
            var69.init(llllIllIIl[2], var23);
            return new String(var69.doFinal(Base64.getDecoder().decode(var31.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var44) {
            var44.printStackTrace();
            return null;
        }
    }
}

