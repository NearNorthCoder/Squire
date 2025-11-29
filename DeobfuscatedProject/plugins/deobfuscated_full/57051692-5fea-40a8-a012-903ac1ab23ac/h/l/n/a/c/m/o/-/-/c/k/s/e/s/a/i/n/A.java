/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Quest
 *  net.runelite.api.QuestState
 *  net.runelite.api.Skill
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 *  net.unethicalite.api.quests.Quests
 *  net.unethicalite.api.widgets.Dialog
 *  net.unethicalite.api.widgets.Widgets
 */
package h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n;

import gg.squire.account.AccBuilderShamans;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.E;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.K;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.U;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.Z;
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
import java.util.List;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Quest;
import net.runelite.api.QuestState;
import net.runelite.api.Skill;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.quests.Quests;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Widgets;

public class A
implements K {
    private static /* synthetic */ String[] cy;
    private static /* synthetic */ int[] lIllIIIlll;
    static /* synthetic */ int dc;
    public static final /* synthetic */ WorldPoint dY;
    public static /* synthetic */ boolean bn;
    private static /* synthetic */ String[] lIllIIIlIl;
    public static /* synthetic */ List<d> bp;
    public static final /* synthetic */ WorldPoint dX;
    static /* synthetic */ boolean dd;

    private static boolean lIIlIllIlllII(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIIlIlllIIlII(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean lIIlIlllIIIIl(Object object) {
        return object != null;
    }

    private static boolean lIIlIllIlllIl(int n2, int n3) {
        return n2 == n3;
    }

    public static void bG() {
        String[] stringArray = new String[lIllIIIlll[3]];
        stringArray[A.lIllIIIlll[4]] = lIllIIIlIl[lIllIIIlll[46]];
        if (A.lIIlIlllIIlIl(NPCs.getNearest((String[])stringArray))) {
            if (A.lIIlIlllIIIll(Players.getLocal().getWorldLocation().distanceTo(dX), lIllIIIlll[12])) {
                if (A.lIIlIllIlllll(Dialog.isOpen() ? 1 : 0)) {
                    Dialog.close();
                }
                Movement.walkTo((WorldPoint)dX);
                0;
                Time.sleepTicks((int)lIllIIIlll[3]);
                0;
            }
            if (A.lIIlIlllIIlII(Players.getLocal().getWorldLocation().distanceTo(dX), lIllIIIlll[12])) {
                AccBuilderShamans.c = lIllIIIlIl[lIllIIIlll[47]];
                String[] stringArray2 = new String[lIllIIIlll[3]];
                stringArray2[A.lIllIIIlll[4]] = lIllIIIlIl[lIllIIIlll[48]];
                TileObjects.getNearest((String[])stringArray2).interact(lIllIIIlIl[lIllIIIlll[0]]);
                Time.sleepTicks((int)lIllIIIlll[1]);
                0;
            }
        }
    }

    @Override
    public boolean af() {
        boolean bl;
        if (A.lIIlIlllIIllI(Quests.getState((Quest)Quest.RECIPE_FOR_DISASTER__ANOTHER_COOKS_QUEST), QuestState.FINISHED)) {
            bl = lIllIIIlll[3];
            0;
            if (-2 >= 0) {
                return false;
            }
        } else {
            bl = lIllIIIlll[4];
        }
        return bl;
    }

    private static boolean lIIlIlllIIIlI(int n2) {
        return n2 > 0;
    }

    private static String lIIlIllIIlIll(String var10, String var21) {
        try {
            SecretKeySpec var12 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var21.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var3 = Cipher.getInstance("Blowfish");
            var3.init(lIllIIIlll[1], var12);
            return new String(var3.doFinal(Base64.getDecoder().decode(var10.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    @Override
    public int ad() {
        try {
            System.out.println("678: " + e.j(lIllIIIlll[5]));
            A.bF();
            0;
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (((0x34 ^ 0x1F) & ~(0xEF ^ 0xC4)) < 0) {
            return (0x70 ^ 0x53) & ~(3 ^ 0x20);
        }
        return lIllIIIlll[57];
    }

    @Override
    public boolean ac() {
        return lIllIIIlll[4];
    }

    private static String lIIlIllIIlIlI(String var6, String var5) {
        var6 = new String(Base64.getDecoder().decode(var6.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var4 = new StringBuilder();
        char[] var9 = var5.toCharArray();
        int var14 = lIllIIIlll[4];
        char[] var1 = var6.toCharArray();
        int var19 = var1.length;
        int var7 = lIllIIIlll[4];
        while (A.lIIlIllIlllII(var7, var19)) {
            char var16 = var1[var7];
            var4.append((char)(var16 ^ var9[var14 % var9.length]));
            0;
            ++var14;
            ++var7;
            0;
            if (-(0x24 ^ 0x21) < 0) continue;
            return null;
        }
        return String.valueOf(var4);
    }

    private static boolean lIIlIlllIIllI(Object object, Object object2) {
        return object == object2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean al() {
        int n2;
        String[] stringArray = new String[lIllIIIlll[3]];
        stringArray[A.lIllIIIlll[4]] = lIllIIIlIl[lIllIIIlll[49]];
        if (A.lIIlIlllIIIlI(Inventory.getCount((String[])stringArray))) {
            int[] nArray = new int[lIllIIIlll[3]];
            nArray[A.lIllIIIlll[4]] = lIllIIIlll[14];
            if (A.lIIlIlllIIIlI(Inventory.getCount((int[])nArray))) {
                String[] stringArray2 = new String[lIllIIIlll[3]];
                stringArray2[A.lIllIIIlll[4]] = lIllIIIlIl[lIllIIIlll[50]];
                if (A.lIIlIllIlllll(Inventory.contains((String[])stringArray2) ? 1 : 0)) {
                    int[] nArray2 = new int[lIllIIIlll[3]];
                    nArray2[A.lIllIIIlll[4]] = lIllIIIlll[18];
                    if (A.lIIlIllIlllll(Inventory.contains((int[])nArray2) ? 1 : 0)) {
                        int[] nArray3 = new int[lIllIIIlll[3]];
                        nArray3[A.lIllIIIlll[4]] = lIllIIIlll[11];
                        if (A.lIIlIllIlllll(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                            n2 = lIllIIIlll[3];
                            0;
                            if (null == null) return n2 != 0;
                            return ((0xF ^ 0x58 ^ 2) & (0xFB ^ 0x8B ^ (0x99 ^ 0xBC) ^ -1)) != 0;
                        }
                    }
                }
            }
        }
        n2 = lIllIIIlll[4];
        return n2 != 0;
    }

    private static boolean lIIlIllIllllI(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIIlIlllIIIII(int n2) {
        return n2 == 0;
    }

    @Override
    public String ae() {
        return lIllIIIlIl[lIllIIIlll[58]];
    }

    private static String lIIlIllIIlIIl(String var17, String var15) {
        try {
            SecretKeySpec var13 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var15.getBytes(StandardCharsets.UTF_8)), lIllIIIlll[23]), "DES");
            Cipher var2 = Cipher.getInstance("DES");
            var2.init(lIllIIIlll[1], var13);
            return new String(var2.doFinal(Base64.getDecoder().decode(var17.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var22) {
            var22.printStackTrace();
            return null;
        }
    }

    static {
        A.lIIlIllIllIll();
        A.lIIlIllIllIlI();
        dX = new WorldPoint(lIllIIIlll[67], lIllIIIlll[68], lIllIIIlll[4]);
        dY = new WorldPoint(lIllIIIlll[69], lIllIIIlll[70], lIllIIIlll[4]);
        bp = new ArrayList<d>();
        String[] stringArray = new String[lIllIIIlll[23]];
        stringArray[A.lIllIIIlll[4]] = lIllIIIlIl[lIllIIIlll[71]];
        stringArray[A.lIllIIIlll[3]] = lIllIIIlIl[lIllIIIlll[72]];
        stringArray[A.lIllIIIlll[1]] = lIllIIIlIl[lIllIIIlll[73]];
        stringArray[A.lIllIIIlll[12]] = lIllIIIlIl[lIllIIIlll[74]];
        stringArray[A.lIllIIIlll[7]] = lIllIIIlIl[lIllIIIlll[75]];
        stringArray[A.lIllIIIlll[15]] = lIllIIIlIl[lIllIIIlll[76]];
        stringArray[A.lIllIIIlll[17]] = lIllIIIlIl[lIllIIIlll[77]];
        stringArray[A.lIllIIIlll[8]] = lIllIIIlIl[lIllIIIlll[78]];
        cy = stringArray;
    }

    private static boolean lIIlIlllIIlIl(Object object) {
        return object == null;
    }

    private static void O() {
        block16: {
            d var18;
            block15: {
                Object var11;
                block14: {
                    block13: {
                        int[] nArray = new int[lIllIIIlll[3]];
                        nArray[A.lIllIIIlll[4]] = lIllIIIlll[19];
                        if (A.lIIlIlllIIIII(Bank.contains((int[])nArray) ? 1 : 0)) {
                            d d2 = new d(lIllIIIlll[19], lIllIIIlll[2], j.bZ);
                            bp.add(d2);
                            0;
                        }
                        int[] nArray2 = new int[lIllIIIlll[3]];
                        nArray2[A.lIllIIIlll[4]] = lIllIIIlll[11];
                        if (A.lIIlIlllIIIII(Bank.contains((int[])nArray2) ? 1 : 0)) {
                            var11 = new d(lIllIIIlll[11], lIllIIIlll[3], lIllIIIlll[51]);
                            bp.add((d)var11);
                            0;
                        }
                        int[] nArray3 = new int[lIllIIIlll[3]];
                        nArray3[A.lIllIIIlll[4]] = lIllIIIlll[14];
                        if (A.lIIlIlllIIIII(Bank.contains((int[])nArray3) ? 1 : 0)) {
                            var11 = new d(lIllIIIlll[14], lIllIIIlll[3], lIllIIIlll[51]);
                            bp.add((d)var11);
                            0;
                        }
                        int[] nArray4 = new int[lIllIIIlll[3]];
                        nArray4[A.lIllIIIlll[4]] = lIllIIIlll[18];
                        if (A.lIIlIlllIIIII(Bank.contains((int[])nArray4) ? 1 : 0)) {
                            var11 = new d(lIllIIIlll[18], lIllIIIlll[3], lIllIIIlll[51]);
                            bp.add((d)var11);
                            0;
                        }
                        int[] nArray5 = new int[lIllIIIlll[3]];
                        nArray5[A.lIllIIIlll[4]] = lIllIIIlll[16];
                        if (A.lIIlIlllIIIII(Bank.contains((int[])nArray5) ? 1 : 0)) {
                            var11 = new d(lIllIIIlll[16], lIllIIIlll[3], lIllIIIlll[51]);
                            bp.add((d)var11);
                            0;
                        }
                        int[] nArray6 = new int[lIllIIIlll[3]];
                        nArray6[A.lIllIIIlll[4]] = lIllIIIlll[13];
                        if (A.lIIlIlllIIIII(Bank.contains((int[])nArray6) ? 1 : 0)) {
                            var11 = new d(lIllIIIlll[13], lIllIIIlll[3], lIllIIIlll[52]);
                            bp.add((d)var11);
                            0;
                        }
                        int[] nArray7 = new int[lIllIIIlll[3]];
                        nArray7[A.lIllIIIlll[4]] = lIllIIIlll[10];
                        if (!A.lIIlIllIlllll(Bank.contains((int[])nArray7) ? 1 : 0)) break block13;
                        int[] nArray8 = new int[lIllIIIlll[3]];
                        nArray8[A.lIllIIIlll[4]] = lIllIIIlll[10];
                        if (!A.lIIlIllIlllll(Bank.contains((int[])nArray8) ? 1 : 0)) break block14;
                        int[] nArray9 = new int[lIllIIIlll[3]];
                        nArray9[A.lIllIIIlll[4]] = lIllIIIlll[10];
                        if (!A.lIIlIllIlllII(Bank.getFirst((int[])nArray9).getQuantity(), lIllIIIlll[2])) break block14;
                    }
                    var11 = new d(lIllIIIlll[10], lIllIIIlll[2], lIllIIIlll[53]);
                    bp.add((d)var11);
                    0;
                }
                if (A.lIIlIlllIIIII(Bank.contains((Predicate)(var11 = item -> item.getName().toLowerCase().contains(lIllIIIlIl[lIllIIIlll[59]]))) ? 1 : 0)) {
                    var18 = new d(lIllIIIlll[54], lIllIIIlll[15], lIllIIIlll[55]);
                    bp.add(var18);
                    0;
                }
                int[] nArray = new int[lIllIIIlll[3]];
                nArray[A.lIllIIIlll[4]] = lIllIIIlll[9];
                if (!A.lIIlIllIlllll(Bank.contains((int[])nArray) ? 1 : 0)) break block15;
                int[] nArray10 = new int[lIllIIIlll[3]];
                nArray10[A.lIllIIIlll[4]] = lIllIIIlll[9];
                if (!A.lIIlIllIlllll(Bank.contains((int[])nArray10) ? 1 : 0)) break block16;
                int[] nArray11 = new int[lIllIIIlll[3]];
                nArray11[A.lIllIIIlll[4]] = lIllIIIlll[9];
                if (!A.lIIlIllIlllII(Bank.getFirst((int[])nArray11).getQuantity(), lIllIIIlll[2])) break block16;
            }
            var18 = new d(lIllIIIlll[9], lIllIIIlll[56], lIllIIIlll[52]);
            bp.add(var18);
            0;
        }
    }

    private static boolean lIIlIlllIIIll(int n2, int n3) {
        return n2 > n3;
    }

    private static void lIIlIllIllIlI() {
        lIllIIIlIl = new String[lIllIIIlll[21]];
        A.lIllIIIlIl[A.lIllIIIlll[4]] = A."Finished buying items, switching back to quest";
        A.lIllIIIlIl[A.lIllIIIlll[3]] = A."Nav to bank";
        A.lIllIIIlIl[A.lIllIIIlll[1]] = A."Handling banking";
        A.lIllIIIlIl[A.lIllIIIlll[12]] = A."We are missing quest supplies, switching to BUYING";
        A.lIllIIIlIl[A.lIllIIIlll[7]] = A."Drink";
        A.lIllIIIlIl[A.lIllIIIlll[15]] = A."Nav to start";
        A.lIllIIIlIl[A.lIllIIIlll[17]] = A."Handling dialog";
        A.lIllIIIlIl[A.lIllIIIlll[8]] = A."Cook";
        A.lIllIIIlIl[A.lIllIIIlll[23]] = A."Dirty blast";
        A.lIllIIIlIl[A.lIllIIIlll[24]] = A."Nav to rotten tomato";
        A.lIllIIIlIl[A.lIllIIIlll[2]] = A."Wear";
        A.lIllIIIlIl[A.lIllIIIlll[30]] = A."PvP Arena";
        A.lIllIIIlIl[A.lIllIIIlll[31]] = A."Getting tomato";
        A.lIllIIIlIl[A.lIllIIIlll[33]] = A."Fadli";
        A.lIllIIIlIl[A.lIllIIIlll[34]] = A."Buy";
        A.lIllIIIlIl[A.lIllIIIlll[36]] = A."Buy 1";
        A.lIllIIIlIl[A.lIllIIIlll[35]] = A."Close";
        A.lIllIIIlIl[A.lIllIIIlll[37]] = A."Dirty blast";
        A.lIllIIIlIl[A.lIllIIIlll[38]] = A."Close";
        A.lIllIIIlIl[A.lIllIIIlll[39]] = A."Fruit blast";
        A.lIllIIIlIl[A.lIllIIIlll[40]] = A."Dirty blast";
        A.lIllIIIlIl[A.lIllIIIlll[41]] = A."Wear";
        A.lIllIIIlIl[A.lIllIIIlll[42]] = A."Handling dialog";
        A.lIllIIIlIl[A.lIllIIIlll[43]] = A."Cook";
        A.lIllIIIlIl[A.lIllIIIlll[44]] = A."Door";
        A.lIllIIIlIl[A.lIllIIIlll[45]] = A."Open";
        A.lIllIIIlIl[A.lIllIIIlll[46]] = A."Aris";
        A.lIllIIIlIl[A.lIllIIIlll[47]] = A."Entering room";
        A.lIllIIIlIl[A.lIllIIIlll[48]] = A."Door";
        A.lIllIIIlIl[A.lIllIIIlll[0]] = A."Open";
        A.lIllIIIlIl[A.lIllIIIlll[49]] = A."Eye of newt";
        A.lIllIIIlIl[A.lIllIIIlll[50]] = A."Fruit blast";
        A.lIllIIIlIl[A.lIllIIIlll[58]] = A."RFD start quest";
        A.lIllIIIlIl[A.lIllIIIlll[59]] = A."ring of wealth (";
        A.lIllIIIlIl[A.lIllIIIlll[60]] = A."dueling";
        A.lIllIIIlIl[A.lIllIIIlll[61]] = A."dueling";
        A.lIllIIIlIl[A.lIllIIIlll[62]] = A."dueling";
        A.lIllIIIlIl[A.lIllIIIlll[63]] = A."dueling";
        A.lIllIIIlIl[A.lIllIIIlll[64]] = A."dueling";
        A.lIllIIIlIl[A.lIllIIIlll[65]] = A."dueling";
        A.lIllIIIlIl[A.lIllIIIlll[56]] = A."dueling";
        A.lIllIIIlIl[A.lIllIIIlll[66]] = A."dueling";
        A.lIllIIIlIl[A.lIllIIIlll[71]] = A."Can you make me a cake?";
        A.lIllIIIlIl[A.lIllIIIlll[72]] = A."I'm always happy to help a cook in distress.";
        A.lIllIIIlIl[A.lIllIIIlll[73]] = A."Actually, I know where to find this stuff.";
        A.lIllIIIlIl[A.lIllIIIlll[74]] = A."Yes.";
        A.lIllIIIlIl[A.lIllIIIlll[75]] = A."What's wrong?";
        A.lIllIIIlIl[A.lIllIIIlll[76]] = A."Do you have any other quests for me?";
        A.lIllIIIlIl[A.lIllIIIlll[77]] = A."Angry! It makes me angry!";
        A.lIllIIIlIl[A.lIllIIIlll[78]] = A."What seems to be the problem?";
    }

    public static void bF() {
        if (A.lIIlIllIlllII(e.j(lIllIIIlll[0]), lIllIIIlll[1])) {
            E.cc();
        }
        if (A.lIIlIllIlllII(Skills.getLevel((Skill)Skill.COOKING), lIllIIIlll[2]) && A.lIIlIllIlllIl(e.j(lIllIIIlll[0]), lIllIIIlll[1])) {
            U.dj();
        }
        if (A.lIIlIllIllllI(Skills.getLevel((Skill)Skill.COOKING), lIllIIIlll[2]) && A.lIIlIllIlllIl(e.j(lIllIIIlll[0]), lIllIIIlll[1])) {
            if (A.lIIlIllIlllll(bn ? 1 : 0)) {
                b.a(bp);
                if (A.lIIlIllIlllII(bp.size(), lIllIIIlll[3])) {
                    System.out.println(lIllIIIlIl[lIllIIIlll[4]]);
                    bn = lIllIIIlll[4];
                }
            }
            if (A.lIIlIlllIIIII(bn ? 1 : 0)) {
                BankLocation var20;
                if (A.lIIlIlllIIIII(A.al() ? 1 : 0) && A.lIIlIlllIIIII(e.j(lIllIIIlll[5]))) {
                    var20 = BankLocation.getNearest();
                    if (A.lIIlIlllIIIIl(var20) && A.lIIlIlllIIIII(var20.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderShamans.c = lIllIIIlIl[lIllIIIlll[3]];
                        a.a(var20);
                    }
                    if (A.lIIlIlllIIIIl(var20) && A.lIIlIllIlllll(var20.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        if (A.lIIlIlllIIIII(Bank.isOpen() ? 1 : 0)) {
                            a.a();
                            Time.sleepUntil(() -> Bank.isOpen(), (int)lIllIIIlll[6]);
                            0;
                        }
                        if (A.lIIlIllIlllll(Bank.isOpen() ? 1 : 0)) {
                            AccBuilderShamans.c = lIllIIIlIl[lIllIIIlll[1]];
                            if (A.lIIlIlllIIIlI(Inventory.getAll().size())) {
                                Bank.depositInventory();
                                Time.sleepTicks((int)lIllIIIlll[7]);
                                0;
                            }
                            if (A.lIIlIlllIIIlI(Equipment.getAll().size())) {
                                Bank.depositEquipment();
                                Time.sleepTicks((int)lIllIIIlll[1]);
                                0;
                            }
                            int[] nArray = new int[lIllIIIlll[8]];
                            nArray[A.lIllIIIlll[4]] = lIllIIIlll[9];
                            nArray[A.lIllIIIlll[3]] = lIllIIIlll[10];
                            nArray[A.lIllIIIlll[1]] = lIllIIIlll[11];
                            nArray[A.lIllIIIlll[12]] = lIllIIIlll[13];
                            nArray[A.lIllIIIlll[7]] = lIllIIIlll[14];
                            nArray[A.lIllIIIlll[15]] = lIllIIIlll[16];
                            nArray[A.lIllIIIlll[17]] = lIllIIIlll[18];
                            if (A.lIIlIlllIIIII(e.b(nArray) ? 1 : 0)) {
                                A.O();
                                System.out.println(lIllIIIlIl[lIllIIIlll[12]]);
                                bn = lIllIIIlll[3];
                                return;
                            }
                            int[] nArray2 = new int[lIllIIIlll[8]];
                            nArray2[A.lIllIIIlll[4]] = lIllIIIlll[9];
                            nArray2[A.lIllIIIlll[3]] = lIllIIIlll[10];
                            nArray2[A.lIllIIIlll[1]] = lIllIIIlll[11];
                            nArray2[A.lIllIIIlll[12]] = lIllIIIlll[13];
                            nArray2[A.lIllIIIlll[7]] = lIllIIIlll[14];
                            nArray2[A.lIllIIIlll[15]] = lIllIIIlll[16];
                            nArray2[A.lIllIIIlll[17]] = lIllIIIlll[18];
                            if (A.lIIlIllIlllll(e.b(nArray2) ? 1 : 0)) {
                                a.a(lIllIIIlll[9], lIllIIIlll[2]);
                                a.a(lIllIIIlll[10], lIllIIIlll[2]);
                                a.a(lIllIIIlll[11], lIllIIIlll[3]);
                                a.a(lIllIIIlll[13], lIllIIIlll[3]);
                                a.a(lIllIIIlll[14], lIllIIIlll[3]);
                                a.a(lIllIIIlll[16], lIllIIIlll[3]);
                                a.a(lIllIIIlll[18], lIllIIIlll[3]);
                                a.a(lIllIIIlll[19], lIllIIIlll[1]);
                                a.a(lIllIIIlll[20], lIllIIIlll[6]);
                            }
                        }
                    }
                }
                if (A.lIIlIllIlllll(Inventory.contains((int[])f.aU) ? 1 : 0) && A.lIIlIllIlllII(Movement.getRunEnergy(), lIllIIIlll[21])) {
                    Inventory.getFirst((int[])f.aU).interact(lIllIIIlIl[lIllIIIlll[7]]);
                    Time.sleepTicks((int)lIllIIIlll[3]);
                    0;
                }
                if (A.lIIlIlllIIIII(e.j(lIllIIIlll[5])) && A.lIIlIllIlllll(A.al() ? 1 : 0)) {
                    AccBuilderShamans.c = lIllIIIlIl[lIllIIIlll[15]];
                    if (A.lIIlIlllIIIll(Players.getLocal().getWorldLocation().distanceTo(dX), lIllIIIlll[12])) {
                        if (A.lIIlIllIlllll(Dialog.isOpen() ? 1 : 0)) {
                            Dialog.close();
                        }
                        Movement.walkTo((WorldPoint)dX);
                        0;
                        Time.sleepTicks((int)lIllIIIlll[3]);
                        0;
                    }
                    if (A.lIIlIlllIIlII(Players.getLocal().getWorldLocation().distanceTo(dX), lIllIIIlll[12])) {
                        AccBuilderShamans.c = lIllIIIlIl[lIllIIIlll[17]];
                        g.a(lIllIIIlIl[lIllIIIlll[8]], cy);
                    }
                }
                if (A.lIIlIllIlllIl(e.j(lIllIIIlll[5]), lIllIIIlll[3])) {
                    int[] nArray = new int[lIllIIIlll[3]];
                    nArray[A.lIllIIIlll[4]] = lIllIIIlll[22];
                    if (A.lIIlIlllIIIII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        String[] stringArray = new String[lIllIIIlll[3]];
                        stringArray[A.lIllIIIlll[4]] = lIllIIIlIl[lIllIIIlll[23]];
                        if (A.lIIlIlllIIIII(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                            dc = lIllIIIlll[4];
                            if (A.lIIlIlllIIIll(Players.getLocal().getWorldLocation().distanceTo(dY), lIllIIIlll[7])) {
                                AccBuilderShamans.c = lIllIIIlIl[lIllIIIlll[24]];
                                var20 = new WorldArea(lIllIIIlll[25], lIllIIIlll[26], lIllIIIlll[27], lIllIIIlll[28], lIllIIIlll[4]);
                                if (A.lIIlIlllIIIII(var20.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    if (A.lIIlIllIlllll(Inventory.contains(item -> item.getName().contains(lIllIIIlIl[lIllIIIlll[66]])) ? 1 : 0) && A.lIIlIlllIIIII(Equipment.contains(item -> item.getName().contains(lIllIIIlIl[lIllIIIlll[56]])) ? 1 : 0)) {
                                        Inventory.getFirst(item -> item.getName().contains(lIllIIIlIl[lIllIIIlll[65]])).interact(lIllIIIlIl[lIllIIIlll[2]]);
                                    }
                                    if (A.lIIlIllIlllll(Equipment.contains(item -> item.getName().contains(lIllIIIlIl[lIllIIIlll[64]])) ? 1 : 0) && A.lIIlIllIlllIl(Players.getLocal().getAnimation(), lIllIIIlll[29])) {
                                        Equipment.getFirst(item -> item.getName().contains(lIllIIIlIl[lIllIIIlll[63]])).interact(lIllIIIlIl[lIllIIIlll[30]]);
                                        Time.sleepTicks((int)lIllIIIlll[7]);
                                        0;
                                    }
                                }
                                if (A.lIIlIllIlllll(var20.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    Movement.walkTo((WorldPoint)dY);
                                    0;
                                    Time.sleepTicks((int)lIllIIIlll[3]);
                                    0;
                                }
                            }
                            if (A.lIIlIlllIIlII(Players.getLocal().getWorldLocation().distanceTo(dY), lIllIIIlll[7])) {
                                AccBuilderShamans.c = lIllIIIlIl[lIllIIIlll[31]];
                                if (A.lIIlIllIlllll(Widgets.get((int)lIllIIIlll[32]).isEmpty() ? 1 : 0)) {
                                    String[] stringArray2 = new String[lIllIIIlll[3]];
                                    stringArray2[A.lIllIIIlll[4]] = lIllIIIlIl[lIllIIIlll[33]];
                                    NPCs.getNearest((String[])stringArray2).interact(lIllIIIlIl[lIllIIIlll[34]]);
                                    Time.sleepTicks((int)lIllIIIlll[12]);
                                    0;
                                }
                                if (A.lIIlIlllIIIII(Widgets.get((int)lIllIIIlll[32]).isEmpty() ? 1 : 0)) {
                                    Widgets.get((int)lIllIIIlll[32], (int)lIllIIIlll[35], (int)lIllIIIlll[3]).interact(lIllIIIlIl[lIllIIIlll[36]]);
                                    Time.sleepTicks((int)lIllIIIlll[1]);
                                    0;
                                }
                                int[] nArray3 = new int[lIllIIIlll[3]];
                                nArray3[A.lIllIIIlll[4]] = lIllIIIlll[22];
                                if (A.lIIlIllIlllll(Inventory.contains((int[])nArray3) ? 1 : 0) && A.lIIlIlllIIIII(Widgets.get((int)lIllIIIlll[32]).isEmpty() ? 1 : 0)) {
                                    Widgets.get((int)lIllIIIlll[32], (int)lIllIIIlll[3], (int)lIllIIIlll[30]).interact(lIllIIIlIl[lIllIIIlll[35]]);
                                    Time.sleepTicks((int)lIllIIIlll[3]);
                                    0;
                                }
                            }
                        }
                    }
                    int[] nArray4 = new int[lIllIIIlll[3]];
                    nArray4[A.lIllIIIlll[4]] = lIllIIIlll[22];
                    if (A.lIIlIllIlllll(Inventory.contains((int[])nArray4) ? 1 : 0)) {
                        String[] stringArray = new String[lIllIIIlll[3]];
                        stringArray[A.lIllIIIlll[4]] = lIllIIIlIl[lIllIIIlll[37]];
                        if (A.lIIlIlllIIIII(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                            int[] nArray5 = new int[lIllIIIlll[3]];
                            nArray5[A.lIllIIIlll[4]] = lIllIIIlll[22];
                            if (A.lIIlIllIlllll(Inventory.contains((int[])nArray5) ? 1 : 0) && A.lIIlIlllIIIII(Widgets.get((int)lIllIIIlll[32]).isEmpty() ? 1 : 0)) {
                                Widgets.get((int)lIllIIIlll[32], (int)lIllIIIlll[3], (int)lIllIIIlll[30]).interact(lIllIIIlIl[lIllIIIlll[38]]);
                                Time.sleepTicks((int)lIllIIIlll[3]);
                                0;
                            }
                            int[] nArray6 = new int[lIllIIIlll[3]];
                            nArray6[A.lIllIIIlll[4]] = lIllIIIlll[18];
                            String[] stringArray3 = new String[lIllIIIlll[3]];
                            stringArray3[A.lIllIIIlll[4]] = lIllIIIlIl[lIllIIIlll[39]];
                            Inventory.getFirst((int[])nArray6).useOn(Inventory.getFirst((String[])stringArray3));
                            Time.sleepTicks((int)lIllIIIlll[1]);
                            0;
                        }
                    }
                    String[] stringArray = new String[lIllIIIlll[3]];
                    stringArray[A.lIllIIIlll[4]] = lIllIIIlIl[lIllIIIlll[40]];
                    if (A.lIIlIllIlllll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                        if (A.lIIlIlllIIIll(Players.getLocal().getWorldLocation().distanceTo(dX), lIllIIIlll[12])) {
                            if (A.lIIlIllIlllll(Dialog.isOpen() ? 1 : 0)) {
                                Dialog.close();
                            }
                            if (A.lIIlIllIlllll(Inventory.contains(item -> item.getName().contains(lIllIIIlIl[lIllIIIlll[62]])) ? 1 : 0) && A.lIIlIlllIIIII(Equipment.contains(item -> item.getName().contains(lIllIIIlIl[lIllIIIlll[61]])) ? 1 : 0)) {
                                Inventory.getFirst(item -> item.getName().contains(lIllIIIlIl[lIllIIIlll[60]])).interact(lIllIIIlIl[lIllIIIlll[41]]);
                                Time.sleepTicks((int)lIllIIIlll[1]);
                                0;
                            }
                            Movement.walkTo((WorldPoint)dX);
                            0;
                            Time.sleepTicks((int)lIllIIIlll[3]);
                            0;
                        }
                        if (A.lIIlIlllIIlII(Players.getLocal().getWorldLocation().distanceTo(dX), lIllIIIlll[12])) {
                            AccBuilderShamans.c = lIllIIIlIl[lIllIIIlll[42]];
                            if (A.lIIlIllIlllII(dc, lIllIIIlll[3])) {
                                Z.mI += lIllIIIlll[3];
                                Z.p(AccBuilderShamans.m);
                                dc += lIllIIIlll[3];
                                Z.mI = lIllIIIlll[4];
                                dd = lIllIIIlll[4];
                            }
                            g.a(lIllIIIlIl[lIllIIIlll[43]], cy);
                        }
                    }
                }
                if (A.lIIlIllIlllIl(e.j(lIllIIIlll[5]), lIllIIIlll[1])) {
                    String[] stringArray = new String[lIllIIIlll[3]];
                    stringArray[A.lIllIIIlll[4]] = lIllIIIlIl[lIllIIIlll[44]];
                    TileObjects.getNearest((String[])stringArray).interact(lIllIIIlIl[lIllIIIlll[45]]);
                    Time.sleepTicks((int)lIllIIIlll[1]);
                    0;
                }
            }
        }
    }

    private static void lIIlIllIllIll() {
        lIllIIIlll = new int[79];
        A.lIllIIIlll[0] = 0xEF ^ 0x8D ^ 37 + 54 - -20 + 16;
        A.lIllIIIlll[1] = 2;
        A.lIllIIIlll[2] = 0x58 ^ 0xB ^ (0xC ^ 0x55);
        A.lIllIIIlll[3] = 1;
        A.lIllIIIlll[4] = (65 + 191 - 171 + 133 ^ 47 + 124 - 24 + 11) & (26 + 224 - 175 + 152 ^ 77 + 123 - 149 + 116 ^ -1);
        A.lIllIIIlll[5] = -(0xFFFFFCC7 & 0x7F79) & (0xFFFFFEF7 & 0x7FEE);
        A.lIllIIIlll[6] = -(0x53 ^ 0x16) & (0xFFFFDBDD & 0x37EE);
        A.lIllIIIlll[7] = 0x1A ^ 0x71 ^ (0xE9 ^ 0x86);
        A.lIllIIIlll[8] = 0xA ^ 0x36 ^ (0x66 ^ 0x5D);
        A.lIllIIIlll[9] = 0xFFFF9FCF & 0x7F77;
        A.lIllIIIlll[10] = -(161 + 150 - 287 + 144) & (0xFFFFFFEF & 0x1FFF);
        A.lIllIIIlll[11] = -(0xFFFFF7B7 & 0x2A4F) & (0xFFFFEBFE & 0x3FFF);
        A.lIllIIIlll[12] = 3;
        A.lIllIIIlll[13] = 32 + 68 - 17 + 95 + (0xBF ^ 0x86) - (192 + 165 - 353 + 194) + (6 + 169 - 10 + 19);
        A.lIllIIIlll[14] = 0xFFFFA7F7 & 0x5F7D;
        A.lIllIIIlll[15] = 0xB9 ^ 0xBC;
        A.lIllIIIlll[16] = 0xFFFFEE75 & 0x19AE;
        A.lIllIIIlll[17] = 0x8C ^ 0x8A;
        A.lIllIIIlll[18] = -(0xFFFFFBFA & 0x15AD) & (0xFFFFDFF7 & 0x33FF);
        A.lIllIIIlll[19] = 0xFFFFFFD9 & 0x3177;
        A.lIllIIIlll[20] = 0xFFFF87EF & 0x7BF3;
        A.lIllIIIlll[21] = 0x93 ^ 0xA1;
        A.lIllIIIlll[22] = 0xFFFFFBF7 & 0xDDE;
        A.lIllIIIlll[23] = 0x13 ^ 0x1B;
        A.lIllIIIlll[24] = 0x69 ^ 0x60;
        A.lIllIIIlll[25] = 0xFFFF9CFF & 0x6FDD;
        A.lIllIIIlll[26] = 0xFFFFFFFE & 0xC77;
        A.lIllIIIlll[27] = 0xD2 ^ 0xA4;
        A.lIllIIIlll[28] = 130 + 27 - 61 + 41;
        A.lIllIIIlll[29] = -1;
        A.lIllIIIlll[30] = 0x4E ^ 0x29 ^ (6 ^ 0x6A);
        A.lIllIIIlll[31] = 115 + 57 - -29 + 4 ^ 180 + 33 - 122 + 102;
        A.lIllIIIlll[32] = 0xFFFFD12F & 0x2FFC;
        A.lIllIIIlll[33] = 57 + 62 - 67 + 99 ^ 53 + 16 - 2 + 87;
        A.lIllIIIlll[34] = 0x95 ^ 0x98 ^ 3;
        A.lIllIIIlll[35] = 0x46 ^ 0x7B ^ (0x1E ^ 0x33);
        A.lIllIIIlll[36] = 79 + 95 - 81 + 60 ^ 7 + 142 - 3 + 4;
        A.lIllIIIlll[37] = 0x3B ^ 0x2A;
        A.lIllIIIlll[38] = 0x22 ^ 0x55 ^ (0xA4 ^ 0xC1);
        A.lIllIIIlll[39] = 7 ^ 0x51 ^ (0xC3 ^ 0x86);
        A.lIllIIIlll[40] = 0x9A ^ 0x8D ^ 3;
        A.lIllIIIlll[41] = 0x22 ^ 0x2E ^ (0x23 ^ 0x3A);
        A.lIllIIIlll[42] = 0x3C ^ 0x2A;
        A.lIllIIIlll[43] = 85 + 130 - 124 + 49 ^ 17 + 57 - -32 + 49;
        A.lIllIIIlll[44] = 7 + 0 - -51 + 80 ^ 2 + 75 - -68 + 1;
        A.lIllIIIlll[45] = 0x14 ^ 0xD;
        A.lIllIIIlll[46] = 0x98 ^ 0x82;
        A.lIllIIIlll[47] = 0x44 ^ 0x4B ^ (0x61 ^ 0x75);
        A.lIllIIIlll[48] = 0x75 ^ 0x69;
        A.lIllIIIlll[49] = 0xDD ^ 0xC3;
        A.lIllIIIlll[50] = 93 + 209 - 110 + 26 ^ 172 + 108 - 227 + 144;
        A.lIllIIIlll[51] = -(0xFFFFD4DB & 0x3BFC) & (0xFFFFF7FF & 0x3BFF);
        A.lIllIIIlll[52] = -(0xFFFFBFF3 & 0x7C7E) & (0xFFFFFFF5 & 0x3FFF);
        A.lIllIIIlll[53] = 0xFFFFA77F & 0x5FEC;
        A.lIllIIIlll[54] = 0xFFFFEFCD & 0x3EFE;
        A.lIllIIIlll[55] = -(0xFFFFFE7D & 0xDD3) & (0xFFFFEDFA & 0x7FFD);
        A.lIllIIIlll[56] = 0xB9 ^ 0xA1 ^ (0x76 ^ 0x46);
        A.lIllIIIlll[57] = 0x3C ^ 0xE ^ (0xC5 ^ 0x93);
        A.lIllIIIlll[58] = 31 + 18 - -27 + 59 ^ 74 + 148 - 173 + 118;
        A.lIllIIIlll[59] = 1 ^ 0x65 ^ (0x49 ^ 0xC);
        A.lIllIIIlll[60] = 0x13 ^ 0x31;
        A.lIllIIIlll[61] = 26 + 69 - 62 + 150 ^ 90 + 0 - -4 + 54;
        A.lIllIIIlll[62] = 0x29 ^ 0x46 ^ (0x5A ^ 0x11);
        A.lIllIIIlll[63] = 0x4A ^ 0x6F;
        A.lIllIIIlll[64] = 0xAA ^ 0x8B ^ (0xA ^ 0xD);
        A.lIllIIIlll[65] = 0xD2 ^ 0x9F ^ (0xF0 ^ 0x9A);
        A.lIllIIIlll[66] = 0x1E ^ 0x37;
        A.lIllIIIlll[67] = 0xFFFFBF8F & 0x4CF7;
        A.lIllIIIlll[68] = 0xFFFFFEAF & 0xDDE;
        A.lIllIIIlll[69] = 0xFFFF9F77 & 0x6DBE;
        A.lIllIIIlll[70] = -(0xFFFFD77F & 0x399D) & (0xFFFFFFDF & 0x1DFF);
        A.lIllIIIlll[71] = 0x23 ^ 0x30 ^ (0x65 ^ 0x5C);
        A.lIllIIIlll[72] = 0x44 ^ 0x79 ^ (5 ^ 0x13);
        A.lIllIIIlll[73] = 0x28 ^ 4;
        A.lIllIIIlll[74] = 95 + 131 - 86 + 34 ^ 88 + 60 - 35 + 18;
        A.lIllIIIlll[75] = 78 + 128 - 121 + 56 ^ 23 + 123 - 77 + 94;
        A.lIllIIIlll[76] = 0x3D ^ 0x12;
        A.lIllIIIlll[77] = 0xA7 ^ 0xA8 ^ (0x26 ^ 0x19);
        A.lIllIIIlll[78] = 0x19 ^ 0x72 ^ (0xCC ^ 0x96);
    }

    private static boolean lIIlIllIlllll(int n2) {
        return n2 != 0;
    }
}

