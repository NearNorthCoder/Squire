/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
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
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.W;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.a;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.an;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.b;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.d;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.e;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.f;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.g;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.i;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;

public class I
implements W {
    static /* synthetic */ boolean cm;
    private static /* synthetic */ String[] lIIIllIll;
    static /* synthetic */ int cl;
    private static /* synthetic */ int[] lIIIlllIl;
    public static /* synthetic */ boolean bt;
    public static /* synthetic */ List<d> bv;
    static /* synthetic */ String[] bR;
    static /* synthetic */ WorldPoint iJ;
    static /* synthetic */ int iI;
    static /* synthetic */ WorldPoint bX;

    private static void lllIlIllllI() {
        lIIIllIll = new String[lIIIlllIl[162]];
        I.lIIIllIll[I.lIIIlllIl[1]] = I."Finished buying items, switching back to quest";
        I.lIIIllIll[I.lIIIlllIl[0]] = I."Need 12 QP";
        I.lIIIllIll[I.lIIIlllIl[3]] = I."Nav to bank";
        I.lIIIllIll[I.lIIIlllIl[5]] = I."Handling banking";
        I.lIIIllIll[I.lIIIlllIl[6]] = I."We are missing quest supplies, switching to BUYING";
        I.lIIIllIll[I.lIIIlllIl[7]] = I."Drink";
        I.lIIIllIll[I.lIIIlllIl[18]] = I."Eat";
        I.lIIIllIll[I.lIIIlllIl[19]] = I."Nav to start";
        I.lIIIllIll[I.lIIIlllIl[20]] = I."Sir Amik Varze";
        I.lIIIllIll[I.lIIIlllIl[34]] = I."Nav to fortress";
        I.lIIIllIll[I.lIIIlllIl[13]] = I."Bronze med helm";
        I.lIIIllIll[I.lIIIlllIl[38]] = I."Iron chainbody";
        I.lIIIllIll[I.lIIIlllIl[2]] = I."Bronze med helm";
        I.lIIIllIll[I.lIIIlllIl[35]] = I."Bronze med helm";
        I.lIIIllIll[I.lIIIlllIl[39]] = I."Wear";
        I.lIIIllIll[I.lIIIlllIl[16]] = I."Iron chainbody";
        I.lIIIllIll[I.lIIIlllIl[40]] = I."Iron chainbody";
        I.lIIIllIll[I.lIIIlllIl[41]] = I."Wear";
        I.lIIIllIll[I.lIIIlllIl[42]] = I."Drink";
        I.lIIIllIll[I.lIIIlllIl[29]] = I."Bronze med helm";
        I.lIIIllIll[I.lIIIlllIl[26]] = I."Iron chainbody";
        I.lIIIllIll[I.lIIIlllIl[43]] = I."Sturdy door";
        I.lIIIllIll[I.lIIIlllIl[44]] = I."Open";
        I.lIIIllIll[I.lIIIlllIl[45]] = I."Push wall";
        I.lIIIllIll[I.lIIIlllIl[31]] = I."Wall";
        I.lIIIllIll[I.lIIIlllIl[46]] = I."Push";
        I.lIIIllIll[I.lIIIlllIl[49]] = I."Climb up first ladder";
        I.lIIIllIll[I.lIIIlllIl[50]] = I."Climb-up";
        I.lIIIllIll[I.lIIIlllIl[51]] = I."Climb up 2nd ladder";
        I.lIIIllIll[I.lIIIlllIl[28]] = I."Climb-up";
        I.lIIIllIll[I.lIIIlllIl[25]] = I."Climb down 1st ladder";
        I.lIIIllIll[I.lIIIlllIl[54]] = I."Climb-down";
        I.lIIIllIll[I.lIIIlllIl[57]] = I."Handle door and ladder up";
        I.lIIIllIll[I.lIIIlllIl[58]] = I."Door";
        I.lIIIllIll[I.lIIIlllIl[59]] = I."Open";
        I.lIIIllIll[I.lIIIlllIl[60]] = I."Door";
        I.lIIIllIll[I.lIIIlllIl[61]] = I."Open";
        I.lIIIllIll[I.lIIIlllIl[62]] = I."Door";
        I.lIIIllIll[I.lIIIlllIl[63]] = I."Open";
        I.lIIIllIll[I.lIIIlllIl[65]] = I."Ladder";
        I.lIIIllIll[I.lIIIlllIl[66]] = I."Climb-up";
        I.lIIIllIll[I.lIIIlllIl[68]] = I."Climb down second ladder";
        I.lIIIllIll[I.lIIIlllIl[69]] = I."Ladder";
        I.lIIIllIll[I.lIIIlllIl[70]] = I."Climb-down";
        I.lIIIllIll[I.lIIIlllIl[73]] = I."Sturdy door";
        I.lIIIllIll[I.lIIIlllIl[74]] = I."Open";
        I.lIIIllIll[I.lIIIlllIl[75]] = I."Sturdy door";
        I.lIIIllIll[I.lIIIlllIl[76]] = I."Open";
        I.lIIIllIll[I.lIIIlllIl[77]] = I."Sturdy door";
        I.lIIIllIll[I.lIIIlllIl[78]] = I."Open";
        I.lIIIllIll[I.lIIIlllIl[17]] = I."Sturdy door";
        I.lIIIllIll[I.lIIIlllIl[79]] = I."Open";
        I.lIIIllIll[I.lIIIlllIl[80]] = I."Climb-down";
        I.lIIIllIll[I.lIIIlllIl[81]] = I."Grill";
        I.lIIIllIll[I.lIIIlllIl[82]] = I."Listen-at";
        I.lIIIllIll[I.lIIIlllIl[85]] = I."Ladder up 1";
        I.lIIIllIll[I.lIIIlllIl[86]] = I."Ladder";
        I.lIIIllIll[I.lIIIlllIl[87]] = I."Climb-up";
        I.lIIIllIll[I.lIIIlllIl[90]] = I."Door 1";
        I.lIIIllIll[I.lIIIlllIl[91]] = I."Sturdy door";
        I.lIIIllIll[I.lIIIlllIl[92]] = I."Open";
        I.lIIIllIll[I.lIIIlllIl[93]] = I."ladder up 2";
        I.lIIIllIll[I.lIIIlllIl[94]] = I."Ladder";
        I.lIIIllIll[I.lIIIlllIl[95]] = I."Climb-up";
        I.lIIIllIll[I.lIIIlllIl[96]] = I."Walk to ladder down 1 tile";
        I.lIIIllIll[I.lIIIlllIl[97]] = I."Climb down 1";
        I.lIIIllIll[I.lIIIlllIl[98]] = I."Ladder";
        I.lIIIllIll[I.lIIIlllIl[99]] = I."Climb-down";
        I.lIIIllIll[I.lIIIlllIl[100]] = I."Door";
        I.lIIIllIll[I.lIIIlllIl[101]] = I."Open";
        I.lIIIllIll[I.lIIIlllIl[102]] = I."Door";
        I.lIIIllIll[I.lIIIlllIl[103]] = I."Open";
        I.lIIIllIll[I.lIIIlllIl[104]] = I."Ladder";
        I.lIIIllIll[I.lIIIlllIl[105]] = I."Open";
        I.lIIIllIll[I.lIIIlllIl[106]] = I."Ladder";
        I.lIIIllIll[I.lIIIlllIl[107]] = I."Climb-up";
        I.lIIIllIll[I.lIIIlllIl[110]] = I."Ladder";
        I.lIIIllIll[I.lIIIlllIl[111]] = I."Climb-down";
        I.lIIIllIll[I.lIIIlllIl[112]] = I."Climb-down";
        I.lIIIllIll[I.lIIIlllIl[113]] = I."Wall";
        I.lIIIllIll[I.lIIIlllIl[114]] = I."Push";
        I.lIIIllIll[I.lIIIlllIl[116]] = I."Door";
        I.lIIIllIll[I.lIIIlllIl[117]] = I."Open";
        I.lIIIllIll[I.lIIIlllIl[118]] = I."Luring knight";
        I.lIIIllIll[I.lIIIlllIl[120]] = I."Door";
        I.lIIIllIll[I.lIIIlllIl[121]] = I."Open";
        I.lIIIllIll[I.lIIIlllIl[122]] = I."Ladder";
        I.lIIIllIll[I.lIIIlllIl[123]] = I."Climb-up";
        I.lIIIllIll[I.lIIIlllIl[125]] = I."Drink";
        I.lIIIllIll[I.lIIIlllIl[126]] = I."Wall";
        I.lIIIllIll[I.lIIIlllIl[127]] = I."Push";
        I.lIIIllIll[I.lIIIlllIl[128]] = I."Cabbage";
        I.lIIIllIll[I.lIIIlllIl[129]] = I."Cabbage";
        I.lIIIllIll[I.lIIIlllIl[130]] = I."Hole";
        I.lIIIllIll[I.lIIIlllIl[131]] = I."Break";
        I.lIIIllIll[I.lIIIlllIl[132]] = I."Nav to start";
        I.lIIIllIll[I.lIIIlllIl[133]] = I."Sir Amik Varze";
        I.lIIIllIll[I.lIIIlllIl[141]] = I."Black Knights Fortress";
        I.lIIIllIll[I.lIIIlllIl[142]] = I."ring of wealth (";
        I.lIIIllIll[I.lIIIlllIl[143]] = I."Knight";
        I.lIIIllIll[I.lIIIlllIl[140]] = I."Knight";
        I.lIIIllIll[I.lIIIlllIl[144]] = I."ladder";
        I.lIIIllIll[I.lIIIlllIl[145]] = I."Climb-down";
        I.lIIIllIll[I.lIIIlllIl[146]] = I."Ladder";
        I.lIIIllIll[I.lIIIlllIl[147]] = I."Climb-down";
        I.lIIIllIll[I.lIIIlllIl[148]] = I."ladder";
        I.lIIIllIll[I.lIIIlllIl[149]] = I."Climb-down";
        I.lIIIllIll[I.lIIIlllIl[150]] = I."ladder";
        I.lIIIllIll[I.lIIIlllIl[151]] = I."Climb-up";
        I.lIIIllIll[I.lIIIlllIl[152]] = I."ladder";
        I.lIIIllIll[I.lIIIlllIl[153]] = I."Climb-up";
        I.lIIIllIll[I.lIIIlllIl[158]] = I."Yes.";
        I.lIIIllIll[I.lIIIlllIl[159]] = I."I seek a quest!";
        I.lIIIllIll[I.lIIIlllIl[160]] = I."I laugh in the face of danger!";
        I.lIIIllIll[I.lIIIlllIl[161]] = I."I don't care. I'm going in anyway.";
    }

    private static boolean lllIllIIlIl(Object object) {
        return object != null;
    }

    @Override
    public boolean S() {
        return lIIIlllIl[1];
    }

    private static void af() {
        block19: {
            d lIIIllIIlIIllII;
            block18: {
                Object lIIIllIIlIIllIl;
                block17: {
                    block16: {
                        block15: {
                            block14: {
                                int[] nArray = new int[lIIIlllIl[0]];
                                nArray[I.lIIIlllIl[1]] = lIIIlllIl[11];
                                if (I.lllIllIIIll(Bank.contains((int[])nArray) ? 1 : 0)) {
                                    d d2 = new d(lIIIlllIl[11], lIIIlllIl[0], lIIIlllIl[134]);
                                    bv.add(d2);
                                    0;
                                }
                                int[] nArray2 = new int[lIIIlllIl[0]];
                                nArray2[I.lIIIlllIl[1]] = lIIIlllIl[10];
                                if (I.lllIllIIIll(Bank.contains((int[])nArray2) ? 1 : 0)) {
                                    lIIIllIIlIIllIl = new d(lIIIlllIl[10], lIIIlllIl[0], lIIIlllIl[134]);
                                    bv.add((d)lIIIllIIlIIllIl);
                                    0;
                                }
                                int[] nArray3 = new int[lIIIlllIl[0]];
                                nArray3[I.lIIIlllIl[1]] = lIIIlllIl[12];
                                if (I.lllIllIIIll(Bank.contains((int[])nArray3) ? 1 : 0)) {
                                    lIIIllIIlIIllIl = new d(lIIIlllIl[12], lIIIlllIl[0], lIIIlllIl[134]);
                                    bv.add((d)lIIIllIIlIIllIl);
                                    0;
                                }
                                int[] nArray4 = new int[lIIIlllIl[0]];
                                nArray4[I.lIIIlllIl[1]] = lIIIlllIl[9];
                                if (!I.lllIllIIIIl(Bank.contains((int[])nArray4) ? 1 : 0)) break block14;
                                int[] nArray5 = new int[lIIIlllIl[0]];
                                nArray5[I.lIIIlllIl[1]] = lIIIlllIl[9];
                                if (!I.lllIllIIIIl(Bank.contains((int[])nArray5) ? 1 : 0)) break block15;
                                int[] nArray6 = new int[lIIIlllIl[0]];
                                nArray6[I.lIIIlllIl[1]] = lIIIlllIl[9];
                                if (!I.lllIllIIIlI(Bank.getFirst((int[])nArray6).getQuantity(), lIIIlllIl[7])) break block15;
                            }
                            lIIIllIIlIIllIl = new d(lIIIlllIl[9], lIIIlllIl[13], lIIIlllIl[135]);
                            bv.add((d)lIIIllIIlIIllIl);
                            0;
                        }
                        int[] nArray = new int[lIIIlllIl[0]];
                        nArray[I.lIIIlllIl[1]] = lIIIlllIl[15];
                        if (!I.lllIllIIIIl(Bank.contains((int[])nArray) ? 1 : 0)) break block16;
                        int[] nArray7 = new int[lIIIlllIl[0]];
                        nArray7[I.lIIIlllIl[1]] = lIIIlllIl[15];
                        if (!I.lllIllIIIIl(Bank.contains((int[])nArray7) ? 1 : 0)) break block17;
                        int[] nArray8 = new int[lIIIlllIl[0]];
                        nArray8[I.lIIIlllIl[1]] = lIIIlllIl[15];
                        if (!I.lllIllIIIlI(Bank.getFirst((int[])nArray8).getQuantity(), lIIIlllIl[7])) break block17;
                    }
                    lIIIllIIlIIllIl = new d(lIIIlllIl[15], lIIIlllIl[13], lIIIlllIl[136]);
                    bv.add((d)lIIIllIIlIIllIl);
                    0;
                }
                if (I.lllIllIIIll(Bank.contains((Predicate)(lIIIllIIlIIllIl = item -> item.getName().toLowerCase().contains(lIIIllIll[lIIIlllIl[142]]))) ? 1 : 0)) {
                    lIIIllIIlIIllII = new d(lIIIlllIl[137], lIIIlllIl[7], lIIIlllIl[138]);
                    bv.add(lIIIllIIlIIllII);
                    0;
                }
                int[] nArray = new int[lIIIlllIl[0]];
                nArray[I.lIIIlllIl[1]] = lIIIlllIl[14];
                if (I.lllIllIIIll(Bank.contains((int[])nArray) ? 1 : 0)) {
                    lIIIllIIlIIllII = new d(lIIIlllIl[14], lIIIlllIl[6], i.bq);
                    bv.add(lIIIllIIlIIllII);
                    0;
                }
                int[] nArray9 = new int[lIIIlllIl[0]];
                nArray9[I.lIIIlllIl[1]] = lIIIlllIl[8];
                if (!I.lllIllIIIIl(Bank.contains((int[])nArray9) ? 1 : 0)) break block18;
                int[] nArray10 = new int[lIIIlllIl[0]];
                nArray10[I.lIIIlllIl[1]] = lIIIlllIl[8];
                if (!I.lllIllIIIIl(Bank.contains((int[])nArray10) ? 1 : 0)) break block19;
                int[] nArray11 = new int[lIIIlllIl[0]];
                nArray11[I.lIIIlllIl[1]] = lIIIlllIl[8];
                if (!I.lllIllIIIlI(Bank.getFirst((int[])nArray11).getQuantity(), lIIIlllIl[16])) break block19;
            }
            lIIIllIIlIIllII = new d(lIIIlllIl[8], lIIIlllIl[66], lIIIlllIl[139]);
            bv.add(lIIIllIIlIIllII);
            0;
        }
    }

    private static boolean lllIllIIIll(int n2) {
        return n2 == 0;
    }

    private static boolean lllIllIlIII(int n2, int n3) {
        return n2 <= n3;
    }

    @Override
    public boolean V() {
        boolean bl;
        if (I.lllIllIIlII(e.j(iI), lIIIlllIl[6])) {
            bl = lIIIlllIl[0];
            0;
            if ((0x67 ^ 0 ^ (0x1B ^ 0x78)) <= 0) {
                return ((0x5F ^ 0x4D ^ (0x6C ^ 0x5E)) & (0xB6 ^ 0xA3 ^ (0x1F ^ 0x2A) ^ -1)) != 0;
            }
        } else {
            bl = lIIIlllIl[1];
        }
        return bl;
    }

    @Override
    public String U() {
        return lIIIllIll[lIIIlllIl[141]];
    }

    private static boolean lllIllIIlll(int n2) {
        return n2 < 0;
    }

    private static boolean lllIllIlIll(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lllIllIlIIl(int n2, int n3) {
        return n2 != n3;
    }

    private static String lllIlIllIII(String lIIIllIIIllIIIl, String lIIIllIIIlIlIll) {
        lIIIllIIIllIIIl = new String(Base64.getDecoder().decode(lIIIllIIIllIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lIIIllIIIlIllll = new StringBuilder();
        char[] lIIIllIIIlIlllI = lIIIllIIIlIlIll.toCharArray();
        int lIIIllIIIlIllIl = lIIIlllIl[1];
        char[] lIIIllIIIlIIlll = lIIIllIIIllIIIl.toCharArray();
        int lIIIllIIIlIIllI = lIIIllIIIlIIlll.length;
        int lIIIllIIIlIIlIl = lIIIlllIl[1];
        while (I.lllIllIIIlI(lIIIllIIIlIIlIl, lIIIllIIIlIIllI)) {
            char lIIIllIIIllIIlI = lIIIllIIIlIIlll[lIIIllIIIlIIlIl];
            lIIIllIIIlIllll.append((char)(lIIIllIIIllIIlI ^ lIIIllIIIlIlllI[lIIIllIIIlIllIl % lIIIllIIIlIlllI.length]));
            0;
            ++lIIIllIIIlIllIl;
            ++lIIIllIIIlIIlIl;
            0;
            if ((4 + 87 - -61 + 16 ^ 145 + 23 - 7 + 11) > 2) continue;
            return null;
        }
        return String.valueOf(lIIIllIIIlIllll);
    }

    private static boolean lllIllIllII(Object object) {
        return object == null;
    }

    @Override
    public int T() {
        try {
            I.ca();
            0;
        }
        catch (Exception exception) {
            // empty catch block
        }
        if ((1 & ~1) >= 3) {
            return (0xC1 ^ 0x95) & ~(0x56 ^ 2);
        }
        return lIIIlllIl[140];
    }

    private static boolean lllIllIllIl(Object object, Object object2) {
        return object == object2;
    }

    private static boolean lllIllIIlII(int n2, int n3) {
        return n2 >= n3;
    }

    /*
     * WARNING - void declaration
     */
    private static boolean ab() {
        void lIIIllIIlIlIIIl;
        int[] nArray = new int[lIIIlllIl[7]];
        nArray[I.lIIIlllIl[1]] = lIIIlllIl[8];
        nArray[I.lIIIlllIl[0]] = lIIIlllIl[9];
        nArray[I.lIIIlllIl[3]] = lIIIlllIl[10];
        nArray[I.lIIIlllIl[5]] = lIIIlllIl[11];
        nArray[I.lIIIlllIl[6]] = lIIIlllIl[12];
        int[] nArray2 = nArray;
        int lIIIllIIlIlIIII = lIIIlllIl[1];
        while (I.lllIllIIIlI(lIIIllIIlIlIIII, ((void)lIIIllIIlIlIIIl).length)) {
            int[] nArray3 = new int[lIIIlllIl[0]];
            nArray3[I.lIIIlllIl[1]] = lIIIllIIlIlIIIl[lIIIllIIlIlIIII];
            if (I.lllIllIIIll(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                return lIIIlllIl[1];
            }
            ++lIIIllIIlIlIIII;
            0;
            if (null == null) continue;
            return ((0x5E ^ 0x48) & ~(1 ^ 0x17)) != 0;
        }
        return lIIIlllIl[0];
    }

    private static boolean lllIllIIllI(int n2) {
        return n2 > 0;
    }

    private static boolean lllIllIIIlI(int n2, int n3) {
        return n2 < n3;
    }

    static {
        I.lllIlIlllll();
        I.lllIlIllllI();
        bv = new ArrayList<d>();
        iI = lIIIlllIl[154];
        bX = new WorldPoint(lIIIlllIl[155], lIIIlllIl[156], lIIIlllIl[3]);
        iJ = new WorldPoint(lIIIlllIl[108], lIIIlllIl[157], lIIIlllIl[1]);
        String[] stringArray = new String[lIIIlllIl[6]];
        stringArray[I.lIIIlllIl[1]] = lIIIllIll[lIIIlllIl[158]];
        stringArray[I.lIIIlllIl[0]] = lIIIllIll[lIIIlllIl[159]];
        stringArray[I.lIIIlllIl[3]] = lIIIllIll[lIIIlllIl[160]];
        stringArray[I.lIIIlllIl[5]] = lIIIllIll[lIIIlllIl[161]];
        bR = stringArray;
    }

    private static boolean lllIllIlIlI(int n2, int n3) {
        return n2 == n3;
    }

    private static int lllIllIIIII(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    private static String lllIlIllIlI(String lIIIllIIIIlllII, String lIIIllIIIIllIIl) {
        try {
            SecretKeySpec lIIIllIIIIlllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIIIllIIIIllIIl.getBytes(StandardCharsets.UTF_8)), lIIIlllIl[20]), "DES");
            Cipher lIIIllIIIIllllI = Cipher.getInstance("DES");
            lIIIllIIIIllllI.init(lIIIlllIl[3], lIIIllIIIIlllll);
            return new String(lIIIllIIIIllllI.doFinal(Base64.getDecoder().decode(lIIIllIIIIlllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIIIllIIIIlllIl) {
            lIIIllIIIIlllIl.printStackTrace();
            return null;
        }
    }

    private static String lllIlIllIIl(String lIIIllIIIIIllIl, String lIIIllIIIIIlllI) {
        try {
            SecretKeySpec lIIIllIIIIlIIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIIIllIIIIIlllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIIIllIIIIlIIIl = Cipher.getInstance("Blowfish");
            lIIIllIIIIlIIIl.init(lIIIlllIl[3], lIIIllIIIIlIIlI);
            return new String(lIIIllIIIIlIIIl.doFinal(Base64.getDecoder().decode(lIIIllIIIIIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIIIllIIIIlIIII) {
            lIIIllIIIIlIIII.printStackTrace();
            return null;
        }
    }

    private static void lllIlIlllll() {
        lIIIlllIl = new int[163];
        I.lIIIlllIl[0] = 1;
        I.lIIIlllIl[1] = (0xE8 ^ 0x8A) & ~(0xA5 ^ 0xC7);
        I.lIIIlllIl[2] = 3 ^ (0x84 ^ 0x8B);
        I.lIIIlllIl[3] = 2;
        I.lIIIlllIl[4] = -(0xFFFFEF77 & 0x70FF) & (0xFFFFF7FE & 0x7BFF);
        I.lIIIlllIl[5] = 3;
        I.lIIIlllIl[6] = 0xC ^ 0x26 ^ (0x2B ^ 5);
        I.lIIIlllIl[7] = 0x69 ^ 0x1F ^ (0x6A ^ 0x19);
        I.lIIIlllIl[8] = 0xFFFFFFDF & 0x1F67;
        I.lIIIlllIl[9] = -(0xFFFFBC6F & 0x63B7) & (0xFFFFBF7F & 0x7FEF);
        I.lIIIlllIl[10] = 0xFFFFE7BF & 0x1FED;
        I.lIIIlllIl[11] = -(0xFFFFE381 & 0x3D7F) & (0xFFFFFFDD & 0x256F);
        I.lIIIlllIl[12] = -(0xFFFFEB35 & 0x3DCB) & (0xFFFFBDF3 & 0x6F7F);
        I.lIIIlllIl[13] = 2 + 68 - -73 + 34 ^ 28 + 145 - 14 + 28;
        I.lIIIlllIl[14] = -(0xFFFFDE93 & 0x2B6F) & (0xFFFFBBDF & 0x7F73);
        I.lIIIlllIl[15] = -(0xFFFFFE1D & 0x77E7) & (0xFFFFFFFF & 0x777F);
        I.lIIIlllIl[16] = 1 ^ (0x22 ^ 0x2C);
        I.lIIIlllIl[17] = 141 + 29 - 113 + 185 ^ 31 + 183 - 46 + 24;
        I.lIIIlllIl[18] = 0x3C ^ 0x3A;
        I.lIIIlllIl[19] = 0x42 ^ 0x45;
        I.lIIIlllIl[20] = 113 + 49 - 16 + 11 ^ 25 + 64 - 19 + 79;
        I.lIIIlllIl[21] = 0xFFFFEFCD & 0x1BF7;
        I.lIIIlllIl[22] = 0xFFFFFFFB & 0xDBF;
        I.lIIIlllIl[23] = 0xFFFFAFBF & 0x5BFE;
        I.lIIIlllIl[24] = -(0xFFFFB7D9 & 0x7A37) & (0xFFFFBFFE & 0x7FBF);
        I.lIIIlllIl[25] = 0x2D ^ 0x39 ^ (0x63 ^ 0x69);
        I.lIIIlllIl[26] = 83 + 156 - 70 + 18 ^ 59 + 174 - 228 + 170;
        I.lIIIlllIl[27] = -(0xFFFFFF73 & 0x70CD) & (0xFFFFFFEF & 0x7DFF);
        I.lIIIlllIl[28] = 0xAE ^ 0xB3;
        I.lIIIlllIl[29] = 11 + 95 - 9 + 31 ^ 143 + 130 - 252 + 126;
        I.lIIIlllIl[30] = -(0xFFFFD755 & 0x3CEB) & (0xFFFF9FFF & Short.MAX_VALUE);
        I.lIIIlllIl[31] = 0x3D ^ 0x25;
        I.lIIIlllIl[32] = 0xFFFFDBD1 & 0x2FFF;
        I.lIIIlllIl[33] = -(0xFFFFFFC5 & 0x407F) & (0xFFFFFFFE & 0x4DF7);
        I.lIIIlllIl[34] = 0x42 ^ 0x25 ^ (0x42 ^ 0x2C);
        I.lIIIlllIl[35] = 18 + 17 - -14 + 82 ^ 96 + 44 - 91 + 93;
        I.lIIIlllIl[36] = 0xFFFFDFDD & 0x2BEF;
        I.lIIIlllIl[37] = -(0xFFFFF0D1 & 0x7F6F) & (0xFFFFFDFF & 0x7FF6);
        I.lIIIlllIl[38] = 0x27 ^ 0x2C;
        I.lIIIlllIl[39] = 0xB7 ^ 0xB9;
        I.lIIIlllIl[40] = 0x55 ^ 0xB ^ (8 ^ 0x46);
        I.lIIIlllIl[41] = 0x7E ^ 0x6F;
        I.lIIIlllIl[42] = 1 ^ (0x33 ^ 0x20);
        I.lIIIlllIl[43] = 0xBC ^ 0xA9;
        I.lIIIlllIl[44] = 0x2F ^ 0x39;
        I.lIIIlllIl[45] = 0x59 ^ 0x4E;
        I.lIIIlllIl[46] = 8 ^ 0x11;
        I.lIIIlllIl[47] = -(0xFFFFE0BB & 0x7F7E) & (0xFFFFFBFF & 0x6FFF);
        I.lIIIlllIl[48] = 0xFFFF8DFD & 0x7FBF;
        I.lIIIlllIl[49] = 37 + 146 - 110 + 92 ^ 32 + 146 - 9 + 22;
        I.lIIIlllIl[50] = 0x3B ^ 0x20;
        I.lIIIlllIl[51] = 12 + 29 - -2 + 124 ^ 135 + 5 - 53 + 100;
        I.lIIIlllIl[52] = -(0xFFFFF067 & 0x3FDD) & (0xFFFFBDFE & Short.MAX_VALUE);
        I.lIIIlllIl[53] = -(0xFFFFB9EB & 0x7637) & (0xFFFFBBFB & 0x7FEF);
        I.lIIIlllIl[54] = 0x84 ^ 0x9B;
        I.lIIIlllIl[55] = -(0xFFFFFF33 & 0x70FD) & (0xFFFFFBF7 & Short.MAX_VALUE);
        I.lIIIlllIl[56] = -(0xFFFFF2F7 & 0x5D4F) & (0xFFFFFFFF & 0x5DFE);
        I.lIIIlllIl[57] = 0x4D ^ 0x6D;
        I.lIIIlllIl[58] = 132 + 128 - 245 + 143 ^ 73 + 142 - 69 + 45;
        I.lIIIlllIl[59] = 0xF0 ^ 0x80 ^ (0x57 ^ 5);
        I.lIIIlllIl[60] = 0x98 ^ 0xA2 ^ (9 ^ 0x10);
        I.lIIIlllIl[61] = 0xA9 ^ 0x8D;
        I.lIIIlllIl[62] = 0x58 ^ 0x7D;
        I.lIIIlllIl[63] = 0x73 ^ 0x41 ^ (0x50 ^ 0x44);
        I.lIIIlllIl[64] = 0xFFFFDFEF & 0x2BDF;
        I.lIIIlllIl[65] = 0x30 ^ 0x17;
        I.lIIIlllIl[66] = 0x49 ^ 0x61;
        I.lIIIlllIl[67] = -(0xFFFFEF3D & 0x12CB) & (0xFFFFEFFF & 0x1FBF);
        I.lIIIlllIl[68] = 0x41 ^ 0x68;
        I.lIIIlllIl[69] = 0x9D ^ 0xB7;
        I.lIIIlllIl[70] = 0x59 ^ 0x72;
        I.lIIIlllIl[71] = 0xFFFFEBCE & 0x1FFD;
        I.lIIIlllIl[72] = 0xFFFFEDFF & 0x1FB5;
        I.lIIIlllIl[73] = 0xB8 ^ 0x9B ^ (0x3D ^ 0x32);
        I.lIIIlllIl[74] = 0xA8 ^ 0xB0 ^ (0x56 ^ 0x63);
        I.lIIIlllIl[75] = 0x75 ^ 0x5B;
        I.lIIIlllIl[76] = 0x8D ^ 0xBB ^ (0xBB ^ 0xA2);
        I.lIIIlllIl[77] = 0x68 ^ 0x58;
        I.lIIIlllIl[78] = 0x9B ^ 0xAA;
        I.lIIIlllIl[79] = 0x20 ^ 0x13;
        I.lIIIlllIl[80] = 6 ^ 0x65 ^ (0xDC ^ 0x8B);
        I.lIIIlllIl[81] = 0x93 ^ 0x8C ^ (0xBF ^ 0x95);
        I.lIIIlllIl[82] = 73 + 133 - 172 + 120 ^ 149 + 89 - 160 + 94;
        I.lIIIlllIl[83] = 0xFFFF8FF6 & 0x7BDB;
        I.lIIIlllIl[84] = -(0xFFFFF269 & 0x5DDF) & (0xFFFFDDFB & Short.MAX_VALUE);
        I.lIIIlllIl[85] = 0x66 ^ 0x51;
        I.lIIIlllIl[86] = 0x75 ^ 0x4D;
        I.lIIIlllIl[87] = 0x8C ^ 0xB5;
        I.lIIIlllIl[88] = -(0xFFFFFD97 & 0x467D) & (0xFFFFFFDF & 0x4FFF);
        I.lIIIlllIl[89] = -(0xFFFFFF3B & 0x74F6) & (0xFFFFFFFF & Short.MAX_VALUE);
        I.lIIIlllIl[90] = 0x22 ^ 0xA ^ (0x76 ^ 0x64);
        I.lIIIlllIl[91] = 4 ^ 0x3F;
        I.lIIIlllIl[92] = 44 + 166 - 168 + 147 ^ 48 + 6 - 34 + 109;
        I.lIIIlllIl[93] = 117 + 4 - 6 + 44 ^ 49 + 105 - 66 + 74;
        I.lIIIlllIl[94] = 140 + 10 - 20 + 61 ^ 111 + 69 - 51 + 0;
        I.lIIIlllIl[95] = 0x2D ^ 0x12;
        I.lIIIlllIl[96] = 0x21 ^ 0x61;
        I.lIIIlllIl[97] = 0x85 ^ 0xC4;
        I.lIIIlllIl[98] = 0x25 ^ 0x67;
        I.lIIIlllIl[99] = 0x41 ^ 2;
        I.lIIIlllIl[100] = 0x6F ^ 0x2B;
        I.lIIIlllIl[101] = 0xD0 ^ 0x95;
        I.lIIIlllIl[102] = 0xE9 ^ 0x8C ^ (0x8F ^ 0xAC);
        I.lIIIlllIl[103] = 0x9F ^ 0xBB ^ (0x50 ^ 0x33);
        I.lIIIlllIl[104] = 0x7E ^ 0x36;
        I.lIIIlllIl[105] = 0x20 ^ 0x69;
        I.lIIIlllIl[106] = 0x51 ^ 0x2D ^ (0x55 ^ 0x63);
        I.lIIIlllIl[107] = 0xF2 ^ 0xBD ^ (0xC2 ^ 0xC6);
        I.lIIIlllIl[108] = -(0xFFFFB6E8 & 0x7D3F) & (0xFFFFFFFF & 0x3FEF);
        I.lIIIlllIl[109] = -(0xFFFFDFD9 & 0x3067) & (0xFFFF9FFF & 0x7DFE);
        I.lIIIlllIl[110] = 123 + 141 - 190 + 69 ^ 146 + 64 - 84 + 69;
        I.lIIIlllIl[111] = 0x3C ^ 0x71;
        I.lIIIlllIl[112] = 0x52 ^ 0x19 ^ (0x1E ^ 0x1B);
        I.lIIIlllIl[113] = 0x77 ^ 0x40 ^ (0xB ^ 0x73);
        I.lIIIlllIl[114] = 0x6E ^ 0x3E;
        I.lIIIlllIl[115] = -(0xFFFF966F & 0x6BD1) & (0xFFFF9FFD & 0x6FFE);
        I.lIIIlllIl[116] = 0x92 ^ 0xC5 ^ (0x4E ^ 0x48);
        I.lIIIlllIl[117] = 0x69 ^ 0x3B;
        I.lIIIlllIl[118] = 0x92 ^ 0xC3 ^ 2;
        I.lIIIlllIl[119] = -(0xFFFFFD9E & 0x567D) & (0xFFFFDFFF & 0x7FDF);
        I.lIIIlllIl[120] = 21 + 180 - 82 + 123 ^ 93 + 15 - 31 + 89;
        I.lIIIlllIl[121] = 0x80 ^ 0x8B ^ (0xD8 ^ 0x86);
        I.lIIIlllIl[122] = 0x94 ^ 0xA5 ^ (0x75 ^ 0x12);
        I.lIIIlllIl[123] = 0x64 ^ 0x33;
        I.lIIIlllIl[124] = -(0xFFFFF577 & 0x1E89) & (0xFFFFFFDD & 0x1FF7);
        I.lIIIlllIl[125] = 0x56 ^ 0xE;
        I.lIIIlllIl[126] = 0x65 ^ 0x20 ^ (0x19 ^ 5);
        I.lIIIlllIl[127] = 0xF2 ^ 0xA8;
        I.lIIIlllIl[128] = 0 ^ 0x5B;
        I.lIIIlllIl[129] = 0xC6 ^ 0xA0 ^ (0x3C ^ 6);
        I.lIIIlllIl[130] = 0xC1 ^ 0xC5 ^ (0x72 ^ 0x2B);
        I.lIIIlllIl[131] = 0xFF ^ 0xB6 ^ (0x96 ^ 0x81);
        I.lIIIlllIl[132] = 0xD8 ^ 0x87;
        I.lIIIlllIl[133] = 0x5C ^ 0x27 ^ (0x6B ^ 0x70);
        I.lIIIlllIl[134] = -(0xFFFFBFFF & 0x591B) & (0xFFFFBFFE & 0x7FDB);
        I.lIIIlllIl[135] = 0xFFFFB798 & 0x4FE7;
        I.lIIIlllIl[136] = -(0xFFFFFEDF & 0x7F72) & (0xFFFFFF7D & Short.MAX_VALUE);
        I.lIIIlllIl[137] = -(0xFFFFF723 & 0x59FD) & (0xFFFFFFEF & 0x7FFC);
        I.lIIIlllIl[138] = -(0xFFFF9EFF & 0x7D53) & (0xFFFFFFFE & 0x7DFB);
        I.lIIIlllIl[139] = 0xFFFFF77E & 0xFED;
        I.lIIIlllIl[140] = 0x3E ^ 0x5A;
        I.lIIIlllIl[141] = 0xC ^ 0x6D;
        I.lIIIlllIl[142] = 0xEC ^ 0x88 ^ (0x28 ^ 0x2E);
        I.lIIIlllIl[143] = 0xE8 ^ 0x8B;
        I.lIIIlllIl[144] = 0x47 ^ 0x35 ^ (7 ^ 0x10);
        I.lIIIlllIl[145] = 0xD3 ^ 0xB5;
        I.lIIIlllIl[146] = 0x37 ^ 0x50;
        I.lIIIlllIl[147] = 0xE1 ^ 0xB5 ^ (0x36 ^ 0xA);
        I.lIIIlllIl[148] = 0x77 ^ 0x4D ^ (0xD3 ^ 0x80);
        I.lIIIlllIl[149] = 211 + 13 - 31 + 30 ^ 138 + 84 - 121 + 80;
        I.lIIIlllIl[150] = 0xE9 ^ 0xA9 ^ (0xAC ^ 0x87);
        I.lIIIlllIl[151] = 0x7C ^ 0x10;
        I.lIIIlllIl[152] = 167 + 14 - 123 + 144 ^ 71 + 133 - 176 + 139;
        I.lIIIlllIl[153] = 0xEE ^ 0x80;
        I.lIIIlllIl[154] = (0xF4 ^ 0xB9) + (0x76 ^ 0x3A) - (137 + 5 - 85 + 83) + (0x41 ^ 0x34);
        I.lIIIlllIl[155] = -(0xFFFFBC75 & 0x63FB) & (0xFFFFABFE & Short.MAX_VALUE);
        I.lIIIlllIl[156] = -(0xFFFFF2F7 & 0x3DBB) & (0xFFFFFDFF & 0x3FBE);
        I.lIIIlllIl[157] = 0xFFFFCDFD & 0x3FBB;
        I.lIIIlllIl[158] = 119 + 142 - 144 + 57 ^ 93 + 158 - 245 + 187;
        I.lIIIlllIl[159] = 4 ^ 0xC ^ (0xC ^ 0x74);
        I.lIIIlllIl[160] = 0x11 ^ 0x38 ^ (0xB ^ 0x53);
        I.lIIIlllIl[161] = 0x11 ^ 0x63;
        I.lIIIlllIl[162] = 0x67 ^ 0x14;
    }

    public static void ca() {
        block81: {
            WorldPoint lIIIllIIlIllIll;
            TileObject lIIIllIIlIlllII;
            WorldArea lIIIllIIlIlllIl;
            WorldArea lIIIllIIlIllllI;
            WorldArea lIIIllIIlIlllll;
            WorldArea lIIIllIIllIIIII;
            WorldArea lIIIllIIllIIIIl;
            WorldArea lIIIllIIllIIIlI;
            WorldArea lIIIllIIllIIIll;
            BankLocation lIIIllIIllIIlII;
            block82: {
                WorldArea lIIIllIIlIllIIl;
                WorldArea lIIIllIIlIllIlI;
                block83: {
                    block85: {
                        block84: {
                            if (I.lllIllIIIIl(bt ? 1 : 0)) {
                                b.a(bv);
                                if (I.lllIllIIIlI(bv.size(), lIIIlllIl[0])) {
                                    System.out.println(lIIIllIll[lIIIlllIl[1]]);
                                    bt = lIIIlllIl[1];
                                }
                            }
                            if (!I.lllIllIIIll(bt ? 1 : 0)) break block81;
                            if (I.lllIllIIIlI(e.H(), lIIIlllIl[2])) {
                                System.out.println(lIIIllIll[lIIIlllIl[0]]);
                                AccBuilderEasyClues.d = lIIIlllIl[0];
                                return;
                            }
                            if (I.lllIllIIIll(I.ab() ? 1 : 0) && I.lllIllIIIlI(e.j(iI), lIIIlllIl[0]) && I.lllIllIIlII(e.H(), lIIIlllIl[2])) {
                                lIIIllIIllIIlII = BankLocation.getNearest();
                                if (I.lllIllIIlIl(lIIIllIIllIIlII) && I.lllIllIIIll(lIIIllIIllIIlII.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    AccBuilderEasyClues.c = lIIIllIll[lIIIlllIl[3]];
                                    a.a(lIIIllIIllIIlII);
                                }
                                if (I.lllIllIIlIl(lIIIllIIllIIlII) && I.lllIllIIIIl(lIIIllIIllIIlII.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    if (I.lllIllIIIll(Bank.isOpen() ? 1 : 0)) {
                                        a.a();
                                        Time.sleepUntil(() -> Bank.isOpen(), (int)lIIIlllIl[4]);
                                        0;
                                    }
                                    if (I.lllIllIIIIl(Bank.isOpen() ? 1 : 0)) {
                                        AccBuilderEasyClues.c = lIIIllIll[lIIIlllIl[5]];
                                        if (I.lllIllIIllI(Inventory.getAll().size())) {
                                            Bank.depositInventory();
                                            Time.sleepTicks((int)lIIIlllIl[6]);
                                            0;
                                        }
                                        if (I.lllIllIIllI(Equipment.getAll().size())) {
                                            Bank.depositEquipment();
                                            Time.sleepTicks((int)lIIIlllIl[3]);
                                            0;
                                        }
                                        int[] nArray = new int[lIIIlllIl[7]];
                                        nArray[I.lIIIlllIl[1]] = lIIIlllIl[8];
                                        nArray[I.lIIIlllIl[0]] = lIIIlllIl[9];
                                        nArray[I.lIIIlllIl[3]] = lIIIlllIl[10];
                                        nArray[I.lIIIlllIl[5]] = lIIIlllIl[11];
                                        nArray[I.lIIIlllIl[6]] = lIIIlllIl[12];
                                        if (I.lllIllIIIll(e.b(nArray) ? 1 : 0)) {
                                            I.af();
                                            System.out.println(lIIIllIll[lIIIlllIl[6]]);
                                            bt = lIIIlllIl[0];
                                            return;
                                        }
                                        int[] nArray2 = new int[lIIIlllIl[7]];
                                        nArray2[I.lIIIlllIl[1]] = lIIIlllIl[8];
                                        nArray2[I.lIIIlllIl[0]] = lIIIlllIl[9];
                                        nArray2[I.lIIIlllIl[3]] = lIIIlllIl[10];
                                        nArray2[I.lIIIlllIl[5]] = lIIIlllIl[11];
                                        nArray2[I.lIIIlllIl[6]] = lIIIlllIl[12];
                                        if (I.lllIllIIIIl(e.b(nArray2) ? 1 : 0)) {
                                            a.a(lIIIlllIl[8], lIIIlllIl[13]);
                                            a.a(lIIIlllIl[9], lIIIlllIl[13]);
                                            a.a(lIIIlllIl[10], lIIIlllIl[0]);
                                            a.a(lIIIlllIl[11], lIIIlllIl[0]);
                                            a.a(lIIIlllIl[12], lIIIlllIl[0]);
                                            a.a(lIIIlllIl[14], lIIIlllIl[0]);
                                            a.a(lIIIlllIl[15], lIIIlllIl[16]);
                                        }
                                    }
                                }
                            }
                            if (I.lllIllIIIIl(Inventory.contains((int[])f.aV) ? 1 : 0) && I.lllIllIIIlI(Movement.getRunEnergy(), lIIIlllIl[17])) {
                                Inventory.getFirst((int[])f.aV).interact(lIIIllIll[lIIIlllIl[7]]);
                                Time.sleepTicks((int)lIIIlllIl[0]);
                                0;
                            }
                            int[] nArray = new int[lIIIlllIl[0]];
                            nArray[I.lIIIlllIl[1]] = lIIIlllIl[15];
                            if (I.lllIllIIIIl(Inventory.contains((int[])nArray) ? 1 : 0) && I.lllIllIIlll(I.lllIllIIIII(e.u(), 50.0))) {
                                int[] nArray3 = new int[lIIIlllIl[0]];
                                nArray3[I.lIIIlllIl[1]] = lIIIlllIl[15];
                                Inventory.getFirst((int[])nArray3).interact(lIIIllIll[lIIIlllIl[18]]);
                                Time.sleepTicks((int)lIIIlllIl[3]);
                                0;
                            }
                            if (I.lllIllIIIIl(I.ab() ? 1 : 0) && I.lllIllIIIll(e.j(iI))) {
                                if (!I.lllIllIlIII(Players.getLocal().getWorldLocation().distanceTo(bX), lIIIlllIl[7]) || I.lllIllIlIIl(Players.getLocal().getWorldLocation().getPlane(), lIIIlllIl[3])) {
                                    AccBuilderEasyClues.c = lIIIllIll[lIIIlllIl[19]];
                                    if (I.lllIllIIIIl(Dialog.isOpen() ? 1 : 0)) {
                                        Dialog.close();
                                    }
                                    Movement.walkTo((WorldPoint)bX);
                                    0;
                                    Time.sleepTicks((int)lIIIlllIl[0]);
                                    0;
                                }
                                if (I.lllIllIlIII(Players.getLocal().getWorldLocation().distanceTo(bX), lIIIlllIl[7])) {
                                    g.a(lIIIllIll[lIIIlllIl[20]], bR);
                                }
                            }
                            if (!I.lllIllIlIlI(e.j(iI), lIIIlllIl[0])) break block82;
                            cl = lIIIlllIl[1];
                            lIIIllIIllIIlII = new WorldArea(lIIIlllIl[21], lIIIlllIl[22], lIIIlllIl[18], lIIIlllIl[3], lIIIlllIl[1]);
                            lIIIllIIllIIIll = new WorldArea(lIIIlllIl[23], lIIIlllIl[24], lIIIlllIl[25], lIIIlllIl[26], lIIIlllIl[0]);
                            lIIIllIIllIIIlI = new WorldArea(lIIIlllIl[23], lIIIlllIl[27], lIIIlllIl[28], lIIIlllIl[29], lIIIlllIl[3]);
                            lIIIllIIllIIIIl = new WorldArea(lIIIlllIl[30], lIIIlllIl[22], lIIIlllIl[31], lIIIlllIl[18], lIIIlllIl[1]);
                            lIIIllIIllIIIII = new WorldArea(lIIIlllIl[32], lIIIlllIl[33], lIIIlllIl[34], lIIIlllIl[35], lIIIlllIl[1]);
                            lIIIllIIlIlllll = new WorldArea(lIIIlllIl[36], lIIIlllIl[37], lIIIlllIl[38], lIIIlllIl[34], lIIIlllIl[1]);
                            if (!I.lllIllIIIll(lIIIllIIllIIlII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || !I.lllIllIIIll(lIIIllIIllIIIll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || !I.lllIllIIIll(lIIIllIIllIIIlI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || !I.lllIllIIIll(lIIIllIIllIIIIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || !I.lllIllIIIll(lIIIllIIllIIIII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || !I.lllIllIIIll(lIIIllIIlIlllll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block83;
                            if (I.lllIllIlIll(Players.getLocal().getWorldLocation().distanceTo(iJ), lIIIlllIl[3])) {
                                AccBuilderEasyClues.c = lIIIllIll[lIIIlllIl[34]];
                                e.C();
                                Movement.walkTo((WorldPoint)iJ);
                                0;
                                Time.sleepTicks((int)lIIIlllIl[0]);
                                0;
                            }
                            if (!I.lllIllIlIII(Players.getLocal().getWorldLocation().distanceTo(iJ), lIIIlllIl[3])) break block83;
                            String[] stringArray = new String[lIIIlllIl[0]];
                            stringArray[I.lIIIlllIl[1]] = lIIIllIll[lIIIlllIl[13]];
                            if (!I.lllIllIIIIl(Equipment.contains((String[])stringArray) ? 1 : 0)) break block84;
                            String[] stringArray2 = new String[lIIIlllIl[0]];
                            stringArray2[I.lIIIlllIl[1]] = lIIIllIll[lIIIlllIl[38]];
                            if (!I.lllIllIIIll(Equipment.contains((String[])stringArray2) ? 1 : 0)) break block85;
                        }
                        String[] stringArray = new String[lIIIlllIl[0]];
                        stringArray[I.lIIIlllIl[1]] = lIIIllIll[lIIIlllIl[2]];
                        if (I.lllIllIIIIl(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                            String[] stringArray3 = new String[lIIIlllIl[0]];
                            stringArray3[I.lIIIlllIl[1]] = lIIIllIll[lIIIlllIl[35]];
                            Inventory.getFirst((String[])stringArray3).interact(lIIIllIll[lIIIlllIl[39]]);
                        }
                        String[] stringArray4 = new String[lIIIlllIl[0]];
                        stringArray4[I.lIIIlllIl[1]] = lIIIllIll[lIIIlllIl[16]];
                        if (I.lllIllIIIIl(Inventory.contains((String[])stringArray4) ? 1 : 0)) {
                            String[] stringArray5 = new String[lIIIlllIl[0]];
                            stringArray5[I.lIIIlllIl[1]] = lIIIllIll[lIIIlllIl[40]];
                            Inventory.getFirst((String[])stringArray5).interact(lIIIllIll[lIIIlllIl[41]]);
                        }
                    }
                    if (I.lllIllIIIIl(Inventory.contains((int[])f.aV) ? 1 : 0)) {
                        Inventory.getFirst((int[])f.aV).interact(lIIIllIll[lIIIlllIl[42]]);
                    }
                    String[] stringArray = new String[lIIIlllIl[0]];
                    stringArray[I.lIIIlllIl[1]] = lIIIllIll[lIIIlllIl[29]];
                    if (I.lllIllIIIIl(Equipment.contains((String[])stringArray) ? 1 : 0)) {
                        String[] stringArray6 = new String[lIIIlllIl[0]];
                        stringArray6[I.lIIIlllIl[1]] = lIIIllIll[lIIIlllIl[26]];
                        if (I.lllIllIIIIl(Equipment.contains((String[])stringArray6) ? 1 : 0)) {
                            String[] stringArray7 = new String[lIIIlllIl[0]];
                            stringArray7[I.lIIIlllIl[1]] = lIIIllIll[lIIIlllIl[43]];
                            TileObjects.getNearest((String[])stringArray7).interact(lIIIllIll[lIIIlllIl[44]]);
                            Time.sleepTicks((int)lIIIlllIl[6]);
                            0;
                        }
                    }
                }
                if (I.lllIllIIIIl(lIIIllIIllIIlII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIIIllIll[lIIIlllIl[45]];
                    String[] stringArray = new String[lIIIlllIl[0]];
                    stringArray[I.lIIIlllIl[1]] = lIIIllIll[lIIIlllIl[31]];
                    TileObjects.getNearest((String[])stringArray).interact(lIIIllIll[lIIIlllIl[46]]);
                    Time.sleepTicks((int)lIIIlllIl[3]);
                    0;
                }
                lIIIllIIlIllllI = new WorldArea(lIIIlllIl[47], lIIIlllIl[48], lIIIlllIl[6], lIIIlllIl[5], lIIIlllIl[1]);
                lIIIllIIlIlllIl = new WorldArea(lIIIlllIl[47], lIIIlllIl[48], lIIIlllIl[6], lIIIlllIl[5], lIIIlllIl[0]);
                if (I.lllIllIIIIl(lIIIllIIlIllllI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIIIllIll[lIIIlllIl[49]];
                    lIIIllIIlIlllII = TileObjects.getNearest(tileObject -> {
                        int n2;
                        if (I.lllIllIIIIl(tileObject.getName().equalsIgnoreCase(lIIIllIll[lIIIlllIl[152]]) ? 1 : 0)) {
                            String[] stringArray = new String[lIIIlllIl[0]];
                            stringArray[I.lIIIlllIl[1]] = lIIIllIll[lIIIlllIl[153]];
                            if (I.lllIllIIIIl(tileObject.hasAction(stringArray) ? 1 : 0)) {
                                n2 = lIIIlllIl[0];
                                0;
                                if (1 != 2) return n2 != 0;
                                return ((0x60 ^ 0x10 ^ (0xEF ^ 0x8A)) & (0xA0 ^ 0xC7 ^ (0xD9 ^ 0xAB) ^ -1)) != 0;
                            }
                        }
                        n2 = lIIIlllIl[1];
                        return n2 != 0;
                    });
                    lIIIllIIlIlllII.interact(lIIIllIll[lIIIlllIl[50]]);
                    Time.sleepTicks((int)lIIIlllIl[3]);
                    0;
                }
                if (I.lllIllIIIIl(lIIIllIIlIlllIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIIIllIll[lIIIlllIl[51]];
                    lIIIllIIlIlllII = TileObjects.getNearest(tileObject -> {
                        int n2;
                        if (I.lllIllIIIIl(tileObject.getName().equalsIgnoreCase(lIIIllIll[lIIIlllIl[150]]) ? 1 : 0)) {
                            String[] stringArray = new String[lIIIlllIl[0]];
                            stringArray[I.lIIIlllIl[1]] = lIIIllIll[lIIIlllIl[151]];
                            if (I.lllIllIIIIl(tileObject.hasAction(stringArray) ? 1 : 0)) {
                                n2 = lIIIlllIl[0];
                                0;
                                if (-2 <= 0) return n2 != 0;
                                return ((0xBC ^ 0x8B) & ~(6 ^ 0x31)) != 0;
                            }
                        }
                        n2 = lIIIlllIl[1];
                        return n2 != 0;
                    });
                    lIIIllIIlIlllII.interact(lIIIllIll[lIIIlllIl[28]]);
                    Time.sleepTicks((int)lIIIlllIl[3]);
                    0;
                }
                lIIIllIIlIlllII = new WorldArea(lIIIlllIl[21], lIIIlllIl[52], lIIIlllIl[18], lIIIlllIl[18], lIIIlllIl[3]);
                lIIIllIIlIllIll = new WorldPoint(lIIIlllIl[53], lIIIlllIl[22], lIIIlllIl[3]);
                if (I.lllIllIIIIl(lIIIllIIlIlllII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIIIllIll[lIIIlllIl[25]];
                    if (I.lllIllIlIll(Players.getLocal().getWorldLocation().distanceTo(lIIIllIIlIllIll), lIIIlllIl[0])) {
                        Movement.walkTo((WorldPoint)lIIIllIIlIllIll);
                        0;
                        Time.sleepTicks((int)lIIIlllIl[0]);
                        0;
                    }
                    if (I.lllIllIlIII(Players.getLocal().getWorldLocation().distanceTo(lIIIllIIlIllIll), lIIIlllIl[0])) {
                        lIIIllIIlIllIlI = TileObjects.getNearest(tileObject -> {
                            int n2;
                            if (I.lllIllIIIIl(tileObject.getName().equalsIgnoreCase(lIIIllIll[lIIIlllIl[148]]) ? 1 : 0)) {
                                String[] stringArray = new String[lIIIlllIl[0]];
                                stringArray[I.lIIIlllIl[1]] = lIIIllIll[lIIIlllIl[149]];
                                if (I.lllIllIIIIl(tileObject.hasAction(stringArray) ? 1 : 0)) {
                                    n2 = lIIIlllIl[0];
                                    0;
                                    if (2 != 0) return n2 != 0;
                                    return ((0xD ^ 0x4C ^ (0x32 ^ 0x24)) & (0x51 ^ 0x59 ^ (0xD5 ^ 0x8A) ^ -1)) != 0;
                                }
                            }
                            n2 = lIIIlllIl[1];
                            return n2 != 0;
                        });
                        lIIIllIIlIllIlI.interact(lIIIllIll[lIIIlllIl[54]]);
                        Time.sleepTicks((int)lIIIlllIl[3]);
                        0;
                    }
                }
                if (I.lllIllIIIIl((lIIIllIIlIllIlI = new WorldArea(lIIIlllIl[55], lIIIlllIl[56], lIIIlllIl[13], lIIIlllIl[7], lIIIlllIl[0])).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIIIllIll[lIIIlllIl[57]];
                    String[] stringArray = new String[lIIIlllIl[0]];
                    stringArray[I.lIIIlllIl[1]] = lIIIllIll[lIIIlllIl[58]];
                    String[] stringArray8 = new String[lIIIlllIl[0]];
                    stringArray8[I.lIIIlllIl[1]] = lIIIllIll[lIIIlllIl[59]];
                    if (I.lllIllIIIIl(TileObjects.getNearest((String[])stringArray).hasAction(stringArray8) ? 1 : 0)) {
                        String[] stringArray9 = new String[lIIIlllIl[0]];
                        stringArray9[I.lIIIlllIl[1]] = lIIIllIll[lIIIlllIl[60]];
                        TileObjects.getNearest((String[])stringArray9).interact(lIIIllIll[lIIIlllIl[61]]);
                        Time.sleepTicks((int)lIIIlllIl[5]);
                        0;
                    }
                    String[] stringArray10 = new String[lIIIlllIl[0]];
                    stringArray10[I.lIIIlllIl[1]] = lIIIllIll[lIIIlllIl[62]];
                    String[] stringArray11 = new String[lIIIlllIl[0]];
                    stringArray11[I.lIIIlllIl[1]] = lIIIllIll[lIIIlllIl[63]];
                    if (I.lllIllIIIll(TileObjects.getNearest((String[])stringArray10).hasAction(stringArray11) ? 1 : 0)) {
                        if (I.lllIllIlIll(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lIIIlllIl[64], lIIIlllIl[52], lIIIlllIl[0])), lIIIlllIl[3])) {
                            Movement.walkTo((WorldPoint)new WorldPoint(lIIIlllIl[64], lIIIlllIl[52], lIIIlllIl[0]));
                            0;
                            Time.sleepTicks((int)lIIIlllIl[0]);
                            0;
                        }
                        if (I.lllIllIlIII(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lIIIlllIl[64], lIIIlllIl[52], lIIIlllIl[0])), lIIIlllIl[3])) {
                            String[] stringArray12 = new String[lIIIlllIl[0]];
                            stringArray12[I.lIIIlllIl[1]] = lIIIllIll[lIIIlllIl[65]];
                            TileObjects.getNearest((String[])stringArray12).interact(lIIIllIll[lIIIlllIl[66]]);
                            Time.sleepTicks((int)lIIIlllIl[3]);
                            0;
                        }
                    }
                }
                if (I.lllIllIIIIl((lIIIllIIlIllIIl = new WorldArea(lIIIlllIl[36], lIIIlllIl[67], lIIIlllIl[19], lIIIlllIl[18], lIIIlllIl[3])).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIIIllIll[lIIIlllIl[68]];
                    if (I.lllIllIlIll(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lIIIlllIl[32], lIIIlllIl[52], lIIIlllIl[3])), lIIIlllIl[0])) {
                        Movement.walkTo((WorldPoint)new WorldPoint(lIIIlllIl[32], lIIIlllIl[52], lIIIlllIl[3]));
                        0;
                        Time.sleepTicks((int)lIIIlllIl[0]);
                        0;
                    }
                    if (I.lllIllIlIII(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lIIIlllIl[32], lIIIlllIl[52], lIIIlllIl[3])), lIIIlllIl[0])) {
                        String[] stringArray = new String[lIIIlllIl[0]];
                        stringArray[I.lIIIlllIl[1]] = lIIIllIll[lIIIlllIl[69]];
                        TileObjects.getNearest((String[])stringArray).interact(lIIIllIll[lIIIlllIl[70]]);
                        Time.sleepTicks((int)lIIIlllIl[5]);
                        0;
                    }
                }
                WorldArea lIIIllIIlIllIII = new WorldArea(lIIIlllIl[32], lIIIlllIl[37], lIIIlllIl[7], lIIIlllIl[19], lIIIlllIl[0]);
                WorldArea lIIIllIIlIlIlll = new WorldArea(lIIIlllIl[71], lIIIlllIl[72], lIIIlllIl[19], lIIIlllIl[6], lIIIlllIl[0]);
                WorldArea lIIIllIIlIlIllI = new WorldArea(lIIIlllIl[71], lIIIlllIl[33], lIIIlllIl[18], lIIIlllIl[19], lIIIlllIl[0]);
                if (I.lllIllIIIIl(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(lIIIlllIl[32], lIIIlllIl[52], lIIIlllIl[0])) ? 1 : 0)) {
                    String[] stringArray = new String[lIIIlllIl[0]];
                    stringArray[I.lIIIlllIl[1]] = lIIIllIll[lIIIlllIl[73]];
                    String[] stringArray13 = new String[lIIIlllIl[0]];
                    stringArray13[I.lIIIlllIl[1]] = lIIIllIll[lIIIlllIl[74]];
                    if (I.lllIllIIIIl(TileObjects.getNearest((String[])stringArray).hasAction(stringArray13) ? 1 : 0)) {
                        String[] stringArray14 = new String[lIIIlllIl[0]];
                        stringArray14[I.lIIIlllIl[1]] = lIIIllIll[lIIIlllIl[75]];
                        TileObjects.getNearest((String[])stringArray14).interact(lIIIllIll[lIIIlllIl[76]]);
                        Time.sleepTicks((int)lIIIlllIl[5]);
                        0;
                    }
                }
                if (!I.lllIllIIIll(lIIIllIIlIlIlll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || I.lllIllIIIIl(lIIIllIIlIllIII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (I.lllIllIIIIl(lIIIllIIlIlIlll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        String[] stringArray = new String[lIIIlllIl[0]];
                        stringArray[I.lIIIlllIl[1]] = lIIIllIll[lIIIlllIl[77]];
                        String[] stringArray15 = new String[lIIIlllIl[0]];
                        stringArray15[I.lIIIlllIl[1]] = lIIIllIll[lIIIlllIl[78]];
                        if (I.lllIllIIIIl(TileObjects.getNearest((String[])stringArray).hasAction(stringArray15) ? 1 : 0)) {
                            String[] stringArray16 = new String[lIIIlllIl[0]];
                            stringArray16[I.lIIIlllIl[1]] = lIIIllIll[lIIIlllIl[17]];
                            TileObjects.getNearest((String[])stringArray16).interact(lIIIllIll[lIIIlllIl[79]]);
                            Time.sleepTicks((int)lIIIlllIl[5]);
                            0;
                        }
                    }
                    if (I.lllIllIIIIl(lIIIllIIlIlIllI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        TileObjects.getNearest(tileObject -> {
                            int n2;
                            if (I.lllIllIIIIl(tileObject.getName().equalsIgnoreCase(lIIIllIll[lIIIlllIl[146]]) ? 1 : 0)) {
                                String[] stringArray = new String[lIIIlllIl[0]];
                                stringArray[I.lIIIlllIl[1]] = lIIIllIll[lIIIlllIl[147]];
                                if (I.lllIllIIIIl(tileObject.hasAction(stringArray) ? 1 : 0)) {
                                    n2 = lIIIlllIl[0];
                                    0;
                                    if (null == null) return n2 != 0;
                                    return ((0x84 ^ 0xC7 ^ (0xD3 ^ 0xB0)) & (0x44 ^ 0xE ^ (0xEB ^ 0x81) ^ -1)) != 0;
                                }
                            }
                            n2 = lIIIlllIl[1];
                            return n2 != 0;
                        }).interact(lIIIllIll[lIIIlllIl[80]]);
                        Time.sleepTicks((int)lIIIlllIl[5]);
                        0;
                    }
                }
                WorldArea lIIIllIIlIlIlIl = new WorldArea(lIIIlllIl[71], lIIIlllIl[37], lIIIlllIl[19], lIIIlllIl[0], lIIIlllIl[1]);
                WorldArea lIIIllIIlIlIlII = new WorldArea(lIIIlllIl[32], lIIIlllIl[33], lIIIlllIl[3], lIIIlllIl[7], lIIIlllIl[1]);
                if (!I.lllIllIIIll(lIIIllIIlIlIlIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || I.lllIllIIIIl(lIIIllIIlIlIlII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (I.lllIllIIIll(Dialog.isOpen() ? 1 : 0)) {
                        String[] stringArray = new String[lIIIlllIl[0]];
                        stringArray[I.lIIIlllIl[1]] = lIIIllIll[lIIIlllIl[81]];
                        TileObjects.getNearest((String[])stringArray).interact(lIIIllIll[lIIIlllIl[82]]);
                        Time.sleepTicks((int)lIIIlllIl[5]);
                        0;
                    }
                    g.a(bR);
                }
            }
            if (I.lllIllIlIlI(e.j(iI), lIIIlllIl[3])) {
                if (I.lllIllIIIIl(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(lIIIlllIl[83], lIIIlllIl[84], lIIIlllIl[1])) ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIIIllIll[lIIIlllIl[85]];
                    String[] stringArray = new String[lIIIlllIl[0]];
                    stringArray[I.lIIIlllIl[1]] = lIIIllIll[lIIIlllIl[86]];
                    TileObjects.getNearest((String[])stringArray).interact(lIIIllIll[lIIIlllIl[87]]);
                    Time.sleepTicks((int)lIIIlllIl[3]);
                    0;
                }
                lIIIllIIllIIlII = new WorldArea(lIIIlllIl[88], lIIIlllIl[72], lIIIlllIl[18], lIIIlllIl[6], lIIIlllIl[0]);
                lIIIllIIllIIIll = new WorldPoint(lIIIlllIl[32], lIIIlllIl[67], lIIIlllIl[0]);
                lIIIllIIllIIIlI = new WorldPoint(lIIIlllIl[32], lIIIlllIl[37], lIIIlllIl[0]);
                lIIIllIIllIIIIl = new WorldPoint(lIIIlllIl[32], lIIIlllIl[56], lIIIlllIl[0]);
                if (!(I.lllIllIIIll(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(lIIIlllIl[89], lIIIlllIl[37], lIIIlllIl[0])) ? 1 : 0) && I.lllIllIIIll(lIIIllIIllIIlII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && I.lllIllIIIll(Players.getLocal().getWorldLocation().equals((Object)lIIIllIIllIIIll) ? 1 : 0) && I.lllIllIIIll(Players.getLocal().getWorldLocation().equals((Object)lIIIllIIllIIIlI) ? 1 : 0) && !I.lllIllIIIIl(Players.getLocal().getWorldLocation().equals((Object)lIIIllIIllIIIIl) ? 1 : 0))) {
                    AccBuilderEasyClues.c = lIIIllIll[lIIIlllIl[90]];
                    String[] stringArray = new String[lIIIlllIl[0]];
                    stringArray[I.lIIIlllIl[1]] = lIIIllIll[lIIIlllIl[91]];
                    TileObjects.getNearest((String[])stringArray).interact(lIIIllIll[lIIIlllIl[92]]);
                    Time.sleepTicks((int)lIIIlllIl[3]);
                    0;
                }
                if (I.lllIllIIIIl(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(lIIIlllIl[83], lIIIlllIl[67], lIIIlllIl[0])) ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIIIllIll[lIIIlllIl[93]];
                    Time.sleepTicks((int)lIIIlllIl[5]);
                    0;
                    String[] stringArray = new String[lIIIlllIl[0]];
                    stringArray[I.lIIIlllIl[1]] = lIIIllIll[lIIIlllIl[94]];
                    TileObjects.getNearest((String[])stringArray).interact(lIIIllIll[lIIIlllIl[95]]);
                    Time.sleepTicks((int)lIIIlllIl[3]);
                    0;
                }
                if (I.lllIllIIIIl(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(lIIIlllIl[32], lIIIlllIl[52], lIIIlllIl[3])) ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIIIllIll[lIIIlllIl[96]];
                    Movement.walkTo((WorldPoint)new WorldPoint(lIIIlllIl[64], lIIIlllIl[52], lIIIlllIl[3]));
                    0;
                    Time.sleepTicks((int)lIIIlllIl[3]);
                    0;
                }
                if (I.lllIllIIIIl(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(lIIIlllIl[64], lIIIlllIl[52], lIIIlllIl[3])) ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIIIllIll[lIIIlllIl[97]];
                    String[] stringArray = new String[lIIIlllIl[0]];
                    stringArray[I.lIIIlllIl[1]] = lIIIllIll[lIIIlllIl[98]];
                    TileObjects.getNearest((String[])stringArray).interact(lIIIllIll[lIIIlllIl[99]]);
                    Time.sleepTicks((int)lIIIlllIl[3]);
                    0;
                }
                if (I.lllIllIIIIl((lIIIllIIllIIIII = new WorldArea(lIIIlllIl[55], lIIIlllIl[56], lIIIlllIl[13], lIIIlllIl[7], lIIIlllIl[0])).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    String[] stringArray = new String[lIIIlllIl[0]];
                    stringArray[I.lIIIlllIl[1]] = lIIIllIll[lIIIlllIl[100]];
                    String[] stringArray17 = new String[lIIIlllIl[0]];
                    stringArray17[I.lIIIlllIl[1]] = lIIIllIll[lIIIlllIl[101]];
                    if (I.lllIllIIIIl(TileObjects.getNearest((String[])stringArray).hasAction(stringArray17) ? 1 : 0)) {
                        String[] stringArray18 = new String[lIIIlllIl[0]];
                        stringArray18[I.lIIIlllIl[1]] = lIIIllIll[lIIIlllIl[102]];
                        TileObjects.getNearest((String[])stringArray18).interact(lIIIllIll[lIIIlllIl[103]]);
                        Time.sleepTicks((int)lIIIlllIl[3]);
                        0;
                    }
                    String[] stringArray19 = new String[lIIIlllIl[0]];
                    stringArray19[I.lIIIlllIl[1]] = lIIIllIll[lIIIlllIl[104]];
                    String[] stringArray20 = new String[lIIIlllIl[0]];
                    stringArray20[I.lIIIlllIl[1]] = lIIIllIll[lIIIlllIl[105]];
                    if (I.lllIllIIIll(TileObjects.getNearest((String[])stringArray19).hasAction(stringArray20) ? 1 : 0)) {
                        if (I.lllIllIIIll(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(lIIIlllIl[53], lIIIlllIl[22], lIIIlllIl[0])) ? 1 : 0)) {
                            Movement.walkTo((WorldPoint)new WorldPoint(lIIIlllIl[53], lIIIlllIl[22], lIIIlllIl[0]));
                            0;
                            Time.sleepTicks((int)lIIIlllIl[0]);
                            0;
                        }
                        if (I.lllIllIIIIl(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(lIIIlllIl[53], lIIIlllIl[22], lIIIlllIl[0])) ? 1 : 0)) {
                            String[] stringArray21 = new String[lIIIlllIl[0]];
                            stringArray21[I.lIIIlllIl[1]] = lIIIllIll[lIIIlllIl[106]];
                            TileObjects.getNearest((String[])stringArray21).interact(lIIIllIll[lIIIlllIl[107]]);
                            Time.sleepTicks((int)lIIIlllIl[3]);
                            0;
                        }
                    }
                }
                if (I.lllIllIIIIl(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(lIIIlllIl[53], lIIIlllIl[22], lIIIlllIl[3])) ? 1 : 0)) {
                    Movement.walkTo((int)lIIIlllIl[108], (int)lIIIlllIl[109], (int)lIIIlllIl[3]);
                    0;
                    Time.sleepTicks((int)lIIIlllIl[3]);
                    0;
                }
                if (I.lllIllIIIIl(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(lIIIlllIl[108], lIIIlllIl[109], lIIIlllIl[3])) ? 1 : 0)) {
                    String[] stringArray = new String[lIIIlllIl[0]];
                    stringArray[I.lIIIlllIl[1]] = lIIIllIll[lIIIlllIl[110]];
                    TileObjects.getNearest((String[])stringArray).interact(lIIIllIll[lIIIlllIl[111]]);
                    Time.sleepTicks((int)lIIIlllIl[3]);
                    0;
                }
                if (I.lllIllIIIIl(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(lIIIlllIl[108], lIIIlllIl[109], lIIIlllIl[0])) ? 1 : 0)) {
                    Time.sleepTicks((int)lIIIlllIl[3]);
                    0;
                    TileObjects.getNearest(tileObject -> {
                        int n2;
                        if (I.lllIllIIIIl(tileObject.getName().equalsIgnoreCase(lIIIllIll[lIIIlllIl[144]]) ? 1 : 0)) {
                            String[] stringArray = new String[lIIIlllIl[0]];
                            stringArray[I.lIIIlllIl[1]] = lIIIllIll[lIIIlllIl[145]];
                            if (I.lllIllIIIIl(tileObject.hasAction(stringArray) ? 1 : 0)) {
                                n2 = lIIIlllIl[0];
                                0;
                                if (-(0x6D ^ 0x68) < 0) return n2 != 0;
                                return ((0x18 ^ 6) & ~(0x6A ^ 0x74)) != 0;
                            }
                        }
                        n2 = lIIIlllIl[1];
                        return n2 != 0;
                    }).interact(lIIIllIll[lIIIlllIl[112]]);
                    Time.sleepTicks((int)lIIIlllIl[3]);
                    0;
                }
                if (I.lllIllIIIIl(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(lIIIlllIl[55], lIIIlllIl[109], lIIIlllIl[1])) ? 1 : 0)) {
                    Time.sleepTicks((int)lIIIlllIl[3]);
                    0;
                    String[] stringArray = new String[lIIIlllIl[0]];
                    stringArray[I.lIIIlllIl[1]] = lIIIllIll[lIIIlllIl[113]];
                    TileObjects.getNearest((String[])stringArray).interact(lIIIllIll[lIIIlllIl[114]]);
                    Time.sleepTicks((int)lIIIlllIl[3]);
                    0;
                }
                if (I.lllIllIIIIl(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(lIIIlllIl[108], lIIIlllIl[115], lIIIlllIl[1])) ? 1 : 0)) {
                    Time.sleepTicks((int)lIIIlllIl[3]);
                    0;
                    String[] stringArray = new String[lIIIlllIl[0]];
                    stringArray[I.lIIIlllIl[1]] = lIIIllIll[lIIIlllIl[116]];
                    TileObjects.getNearest((String[])stringArray).interact(lIIIllIll[lIIIlllIl[117]]);
                    Time.sleepTicks((int)lIIIlllIl[3]);
                    0;
                }
                lIIIllIIlIlllll = new WorldArea(lIIIlllIl[30], lIIIlllIl[22], lIIIlllIl[35], lIIIlllIl[3], lIIIlllIl[1]);
                lIIIllIIlIllllI = NPCs.getNearest(nPC -> {
                    int n2;
                    if (I.lllIllIIIIl(nPC.getName().contains(lIIIllIll[lIIIlllIl[140]]) ? 1 : 0) && I.lllIllIlIII(nPC.getWorldLocation().distanceTo(new WorldPoint(lIIIlllIl[88], lIIIlllIl[22], lIIIlllIl[1])), lIIIlllIl[0]) && I.lllIllIllIl(nPC.getInteracting(), Players.getLocal())) {
                        n2 = lIIIlllIl[0];
                        0;
                        if (((0x84 ^ 0xB0) & ~(0x9F ^ 0xAB)) < 0) {
                            return ((0xF4 ^ 0xB1) & ~(0x39 ^ 0x7C)) != 0;
                        }
                    } else {
                        n2 = lIIIlllIl[1];
                    }
                    return n2 != 0;
                });
                if (I.lllIllIIIIl(lIIIllIIlIlllll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && I.lllIllIIlIl(lIIIllIIlIllllI)) {
                    AccBuilderEasyClues.c = lIIIllIll[lIIIlllIl[118]];
                    e.c(new WorldPoint(lIIIlllIl[119], lIIIlllIl[22], lIIIlllIl[1]));
                    Time.sleepTicks((int)lIIIlllIl[34]);
                    0;
                }
                if (!I.lllIllIIIll(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(lIIIlllIl[88], lIIIlllIl[22], lIIIlllIl[1])) ? 1 : 0) || I.lllIllIIIIl(lIIIllIIlIlllll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    lIIIllIIlIllllI = NPCs.getNearest(nPC -> {
                        int n2;
                        if (I.lllIllIIIIl(nPC.getName().contains(lIIIllIll[lIIIlllIl[143]]) ? 1 : 0) && I.lllIllIlIII(nPC.getWorldLocation().distanceTo(new WorldPoint(lIIIlllIl[88], lIIIlllIl[22], lIIIlllIl[1])), lIIIlllIl[3]) && I.lllIllIllIl(nPC.getInteracting(), Players.getLocal())) {
                            n2 = lIIIlllIl[0];
                            0;
                            if (-(0x73 ^ 0xF ^ (0x2A ^ 0x53)) >= 0) {
                                return ((0xD0 ^ 0xA6 ^ (0x65 ^ 8)) & (3 ^ (0x54 ^ 0x4C) ^ -1)) != 0;
                            }
                        } else {
                            n2 = lIIIlllIl[1];
                        }
                        return n2 != 0;
                    });
                    if (I.lllIllIIIll(Dialog.isOpen() ? 1 : 0) && I.lllIllIllII(lIIIllIIlIllllI)) {
                        String[] stringArray = new String[lIIIlllIl[0]];
                        stringArray[I.lIIIlllIl[1]] = lIIIllIll[lIIIlllIl[120]];
                        TileObjects.getNearest((String[])stringArray).interact(lIIIllIll[lIIIlllIl[121]]);
                        Time.sleepTicks((int)lIIIlllIl[0]);
                        0;
                    }
                    while (I.lllIllIIIIl(Dialog.isOpen() ? 1 : 0)) {
                        g.a(bR);
                        Time.sleep((long)50L);
                        0;
                        0;
                        if (((0x41 ^ 6) & ~(0xE1 ^ 0xA6)) == 0) continue;
                        return;
                    }
                }
                if (I.lllIllIIIIl(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(lIIIlllIl[71], lIIIlllIl[22], lIIIlllIl[1])) ? 1 : 0)) {
                    Time.sleepTicks((int)lIIIlllIl[3]);
                    0;
                    String[] stringArray = new String[lIIIlllIl[0]];
                    stringArray[I.lIIIlllIl[1]] = lIIIllIll[lIIIlllIl[122]];
                    TileObjects.getNearest((String[])stringArray).interact(lIIIllIll[lIIIlllIl[123]]);
                    Time.sleepTicks((int)lIIIlllIl[3]);
                    0;
                }
                lIIIllIIlIlllIl = new WorldArea(lIIIlllIl[89], lIIIlllIl[48], lIIIlllIl[38], lIIIlllIl[5], lIIIlllIl[0]);
                lIIIllIIlIlllII = new WorldArea(lIIIlllIl[124], lIIIlllIl[67], lIIIlllIl[6], lIIIlllIl[34], lIIIlllIl[0]);
                if (!I.lllIllIIIll(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(lIIIlllIl[89], lIIIlllIl[48], lIIIlllIl[0])) ? 1 : 0) || !I.lllIllIIIll(lIIIllIIlIlllIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || I.lllIllIIIIl(lIIIllIIlIlllII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (I.lllIllIIIIl(Inventory.contains((int[])f.aV) ? 1 : 0) && I.lllIllIIIlI(Movement.getRunEnergy(), lIIIlllIl[97])) {
                        Inventory.getFirst((int[])f.aV).interact(lIIIllIll[lIIIlllIl[125]]);
                        Time.sleepTicks((int)lIIIlllIl[3]);
                        0;
                    }
                    Time.sleepTicks((int)lIIIlllIl[3]);
                    0;
                    String[] stringArray = new String[lIIIlllIl[0]];
                    stringArray[I.lIIIlllIl[1]] = lIIIllIll[lIIIlllIl[126]];
                    TileObjects.getNearest((String[])stringArray).interact(lIIIllIll[lIIIlllIl[127]]);
                    Time.sleepTicks((int)lIIIlllIl[3]);
                    0;
                }
                if (I.lllIllIIIIl((lIIIllIIlIllIll = new WorldArea(lIIIlllIl[32], lIIIlllIl[27], lIIIlllIl[34], lIIIlllIl[19], lIIIlllIl[0])).contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && I.lllIllIIIll(Dialog.isOpen() ? 1 : 0)) {
                    String[] stringArray = new String[lIIIlllIl[0]];
                    stringArray[I.lIIIlllIl[1]] = lIIIllIll[lIIIlllIl[128]];
                    if (I.lllIllIIIIl(Inventory.contains((String[])stringArray) ? 1 : 0) && I.lllIllIIIll(Players.getLocal().isMoving() ? 1 : 0)) {
                        String[] stringArray22 = new String[lIIIlllIl[0]];
                        stringArray22[I.lIIIlllIl[1]] = lIIIllIll[lIIIlllIl[129]];
                        String[] stringArray23 = new String[lIIIlllIl[0]];
                        stringArray23[I.lIIIlllIl[1]] = lIIIllIll[lIIIlllIl[130]];
                        Inventory.getFirst((String[])stringArray22).useOn(TileObjects.getNearest((String[])stringArray23));
                        Time.sleepTicks((int)lIIIlllIl[3]);
                        0;
                    }
                }
                g.a(bR);
            }
            if (I.lllIllIlIlI(e.j(iI), lIIIlllIl[5])) {
                lIIIllIIllIIlII = new WorldArea(lIIIlllIl[32], lIIIlllIl[27], lIIIlllIl[34], lIIIlllIl[19], lIIIlllIl[0]);
                if (I.lllIllIIIIl(lIIIllIIllIIlII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    int[] nArray = new int[lIIIlllIl[0]];
                    nArray[I.lIIIlllIl[1]] = lIIIlllIl[9];
                    Inventory.getFirst((int[])nArray).interact(lIIIllIll[lIIIlllIl[131]]);
                    Time.sleepTicks((int)lIIIlllIl[7]);
                    0;
                }
                if (I.lllIllIIIll(lIIIllIIllIIlII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (!I.lllIllIlIII(Players.getLocal().getWorldLocation().distanceTo(bX), lIIIlllIl[7]) || I.lllIllIlIIl(Players.getLocal().getWorldLocation().getPlane(), lIIIlllIl[3])) {
                        AccBuilderEasyClues.c = lIIIllIll[lIIIlllIl[132]];
                        if (I.lllIllIIIIl(Dialog.isOpen() ? 1 : 0)) {
                            Dialog.close();
                        }
                        e.D();
                        Movement.walkTo((WorldPoint)bX);
                        0;
                        Time.sleepTicks((int)lIIIlllIl[0]);
                        0;
                    }
                    if (I.lllIllIlIII(Players.getLocal().getWorldLocation().distanceTo(bX), lIIIlllIl[7])) {
                        if (I.lllIllIIIlI(cl, lIIIlllIl[0])) {
                            an.pS += lIIIlllIl[0];
                            an.o(AccBuilderEasyClues.m);
                            cl += lIIIlllIl[0];
                            an.pS = lIIIlllIl[1];
                            cm = lIIIlllIl[1];
                        }
                        g.a(lIIIllIll[lIIIlllIl[133]], bR);
                    }
                }
            }
            g.a(new String[lIIIlllIl[1]]);
        }
    }

    private static boolean lllIllIIIIl(int n2) {
        return n2 != 0;
    }
}

