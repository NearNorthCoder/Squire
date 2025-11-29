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
package i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i;

import gg.squire.account.AccBuilderRat;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.M;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.a;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.b;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.d;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.e;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.f;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.g;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.h;
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

public class O
implements M {
    public static final /* synthetic */ WorldPoint in;
    public static final /* synthetic */ WorldPoint im;
    static final /* synthetic */ WorldPoint ir;
    public static /* synthetic */ List<d> bA;
    private final /* synthetic */ int is = 536;
    static final /* synthetic */ WorldPoint iq;
    private static /* synthetic */ int[] lIIIlllIllIII;
    public static final /* synthetic */ WorldPoint io;
    public static final /* synthetic */ WorldPoint il;
    public static /* synthetic */ boolean by;
    static final /* synthetic */ WorldPoint ip;
    private static /* synthetic */ String[] lIIIlllIlIlll;

    private static void lIlIIlIIlIlIlll() {
        lIIIlllIlIlll = new String[lIIIlllIllIII[87]];
        O.lIIIlllIlIlll[O.lIIIlllIllIII[1]] = O."Buying items";
        O.lIIIlllIlIlll[O.lIIIlllIllIII[2]] = O."Finished buying items, switching back to prayer";
        O.lIIIlllIlIlll[O.lIIIlllIllIII[3]] = O."Navigating to bank";
        O.lIIIlllIlIlll[O.lIIIlllIllIII[4]] = O."Handling banking";
        O.lIIIlllIlIlll[O.lIIIlllIllIII[6]] = O."We are missing prayer supplies, switching to BUYING";
        O.lIIIlllIlIlll[O.lIIIlllIllIII[13]] = O."Drink";
        O.lIIIlllIlIlll[O.lIIIlllIllIII[15]] = O."Tele to wildy";
        O.lIIIlllIlIlll[O.lIIIlllIllIII[17]] = O."Rub";
        O.lIIIlllIlIlll[O.lIIIlllIllIII[18]] = O."Lava Maze";
        O.lIIIlllIlIlll[O.lIIIlllIllIII[19]] = O."Okay, teleport to level 41 Wilderness.";
        O.lIIIlllIlIlll[O.lIIIlllIllIII[21]] = O."Nav to altar";
        O.lIIIlllIlIlll[O.lIIIlllIllIII[41]] = O."1 tick pray";
        O.lIIIlllIlIlll[O.lIIIlllIllIII[44]] = O."Chaos altar";
        O.lIIIlllIlIlll[O.lIIIlllIllIII[20]] = O."Large door";
        O.lIIIlllIlIlll[O.lIIIlllIllIII[46]] = O."Open";
        O.lIIIlllIlIlll[O.lIIIlllIllIII[47]] = O."Open";
        O.lIIIlllIlIlll[O.lIIIlllIllIII[48]] = O."Open";
        O.lIIIlllIlIlll[O.lIIIlllIllIII[49]] = O."Chaos altar";
        O.lIIIlllIlIlll[O.lIIIlllIllIII[51]] = O."Nav to altar";
        O.lIIIlllIlIlll[O.lIIIlllIllIII[52]] = O."Unnoting bones";
        O.lIIIlllIlIlll[O.lIIIlllIllIII[14]] = O."Elder Chaos druid";
        O.lIIIlllIlIlll[O.lIIIlllIllIII[53]] = O."Large door";
        O.lIIIlllIlIlll[O.lIIIlllIllIII[54]] = O."Open";
        O.lIIIlllIlIlll[O.lIIIlllIllIII[55]] = O."Open";
        O.lIIIlllIlIlll[O.lIIIlllIllIII[56]] = O."Open";
        O.lIIIlllIlIlll[O.lIIIlllIllIII[57]] = O."Exchange";
        O.lIIIlllIlIlll[O.lIIIlllIllIII[58]] = O."Exchange 5";
        O.lIIIlllIlIlll[O.lIIIlllIllIII[59]] = O."Exchange All";
        O.lIIIlllIlIlll[O.lIIIlllIllIII[60]] = O."Suiciding";
        O.lIIIlllIlIlll[O.lIIIlllIllIII[61]] = O."Wine of zamorak";
        O.lIIIlllIlIlll[O.lIIIlllIllIII[62]] = O."Take";
        O.lIIIlllIlIlll[O.lIIIlllIllIII[75]] = O."Prayer training";
        O.lIIIlllIlIlll[O.lIIIlllIllIII[77]] = O."ring of wealth (";
    }

    private static boolean lIlIIlIIlIllIIl(int n2) {
        return n2 != 0;
    }

    private static boolean lIlIIlIIllIIIII(int n2, int n3) {
        return n2 <= n3;
    }

    @Override
    public String Z() {
        return lIIIlllIlIlll[lIIIlllIllIII[75]];
    }

    static {
        O.lIlIIlIIlIllIII();
        O.lIlIIlIIlIlIlll();
        il = new WorldPoint(lIIIlllIllIII[78], lIIIlllIllIII[79], lIIIlllIllIII[1]);
        im = new WorldPoint(lIIIlllIllIII[80], lIIIlllIllIII[81], lIIIlllIllIII[1]);
        in = new WorldPoint(lIIIlllIllIII[82], lIIIlllIllIII[83], lIIIlllIllIII[1]);
        io = new WorldPoint(lIIIlllIllIII[84], lIIIlllIllIII[43], lIIIlllIllIII[1]);
        ip = new WorldPoint(lIIIlllIllIII[1], lIIIlllIllIII[1], lIIIlllIllIII[1]);
        iq = new WorldPoint(lIIIlllIllIII[1], lIIIlllIllIII[1], lIIIlllIllIII[1]);
        ir = new WorldPoint(lIIIlllIllIII[85], lIIIlllIllIII[86], lIIIlllIllIII[1]);
        bA = new ArrayList<d>();
    }

    @Override
    public boolean aa() {
        boolean bl;
        if (O.lIlIIlIIllIIIIl(Skills.getLevel((Skill)Skill.PRAYER), lIIIlllIllIII[76])) {
            bl = lIIIlllIllIII[2];
            0;
            if (2 != 2) {
                return false;
            }
        } else {
            bl = lIIIlllIllIII[1];
        }
        return bl;
    }

    private static int cM() {
        int n2 = lIIIlllIllIII[69];
        if (O.lIlIIlIIlIllIlI(Skills.getLevel((Skill)Skill.PRAYER), lIIIlllIllIII[70]) && O.lIlIIlIIllIIIIl(Skills.getLevel((Skill)Skill.PRAYER), lIIIlllIllIII[71])) {
            return (n2 - Skills.getExperience((Skill)Skill.PRAYER)) / lIIIlllIllIII[72] + lIIIlllIllIII[21];
        }
        int n3 = lIIIlllIllIII[73];
        return (n3 - Skills.getExperience((Skill)Skill.PRAYER)) / lIIIlllIllIII[72] + lIIIlllIllIII[62];
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean S() {
        int n2;
        block2: {
            block3: {
                int[] nArray = new int[lIIIlllIllIII[2]];
                nArray[O.lIIIlllIllIII[1]] = lIIIlllIllIII[9];
                if (!O.lIlIIlIIlIllIIl(Inventory.contains((int[])nArray) ? 1 : 0)) break block2;
                int[] nArray2 = new int[lIIIlllIllIII[2]];
                nArray2[O.lIIIlllIllIII[1]] = lIIIlllIllIII[9];
                if (!O.lIlIIlIIllIIIIl(Inventory.getFirst((int[])nArray2).getQuantity(), lIIIlllIllIII[12])) break block2;
                if (!O.lIlIIlIIlIllIll(Inventory.contains((int[])f.bf) ? 1 : 0)) break block3;
                if (!O.lIlIIlIIlIllIIl(Equipment.contains((int[])f.bf) ? 1 : 0)) break block2;
                int[] nArray3 = new int[lIIIlllIllIII[2]];
                nArray3[O.lIIIlllIllIII[1]] = lIIIlllIllIII[0];
                if (!O.lIlIIlIIlIllIll(Inventory.contains((int[])nArray3) ? 1 : 0)) break block3;
                int[] nArray4 = new int[lIIIlllIllIII[2]];
                nArray4[O.lIIIlllIllIII[1]] = lIIIlllIllIII[50];
                if (!O.lIlIIlIIlIllIIl(Inventory.contains((int[])nArray4) ? 1 : 0)) break block2;
            }
            n2 = lIIIlllIllIII[2];
            0;
            if ((0x96 ^ 0x92) > 2) return n2 != 0;
            return false;
        }
        n2 = lIIIlllIllIII[1];
        return n2 != 0;
    }

    private static boolean lIlIIlIIlIlllII(Object object) {
        return object != null;
    }

    private static String lIlIIlIIlIlIlIl(String var11, String var12) {
        try {
            SecretKeySpec var19 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var12.getBytes(StandardCharsets.UTF_8)), lIIIlllIllIII[18]), "DES");
            Cipher var24 = Cipher.getInstance("DES");
            var24.init(lIIIlllIllIII[3], var19);
            return new String(var24.doFinal(Base64.getDecoder().decode(var11.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var16) {
            var16.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIIlIIlIllIll(int n2) {
        return n2 == 0;
    }

    private static boolean lIlIIlIIlIlllll(int n2, int n3) {
        return n2 == n3;
    }

    private static String lIlIIlIIlIlIllI(String var14, String var9) {
        var14 = new String(Base64.getDecoder().decode(var14.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var15 = new StringBuilder();
        char[] var7 = var9.toCharArray();
        int var13 = lIIIlllIllIII[1];
        char[] var4 = var14.toCharArray();
        int var25 = var4.length;
        int var18 = lIIIlllIllIII[1];
        while (O.lIlIIlIIlIllIlI(var18, var25)) {
            char var5 = var4[var18];
            var15.append((char)(var5 ^ var7[var13 % var7.length]));
            0;
            ++var13;
            ++var18;
            0;
            if (-1 >= -1) continue;
            return null;
        }
        return String.valueOf(var15);
    }

    private static boolean lIlIIlIIlIlllIl(int n2) {
        return n2 > 0;
    }

    private static void W() {
        d var2;
        Object var22;
        int[] nArray = new int[lIIIlllIllIII[2]];
        nArray[O.lIIIlllIllIII[1]] = lIIIlllIllIII[8];
        if (O.lIlIIlIIlIllIll(Bank.contains((int[])nArray) ? 1 : 0)) {
            d d2 = new d(lIIIlllIllIII[8], lIIIlllIllIII[13], h.bv);
            bA.add(d2);
            0;
        }
        int[] nArray2 = new int[lIIIlllIllIII[2]];
        nArray2[O.lIIIlllIllIII[1]] = lIIIlllIllIII[0];
        if (O.lIlIIlIIlIllIll(Bank.contains((int[])nArray2) ? 1 : 0)) {
            var22 = new d(lIIIlllIllIII[0], O.cM(), lIIIlllIllIII[63]);
            bA.add((d)var22);
            0;
        }
        int[] nArray3 = new int[lIIIlllIllIII[2]];
        nArray3[O.lIIIlllIllIII[1]] = lIIIlllIllIII[7];
        if (O.lIlIIlIIlIllIll(Bank.contains((int[])nArray3) ? 1 : 0)) {
            var22 = new d(lIIIlllIllIII[7], lIIIlllIllIII[3], lIIIlllIllIII[5]);
            bA.add((d)var22);
            0;
        }
        if (O.lIlIIlIIlIllIll(Bank.contains((Predicate)(var22 = item -> item.getName().toLowerCase().contains(lIIIlllIlIlll[lIIIlllIllIII[77]]))) ? 1 : 0)) {
            var2 = new d(lIIIlllIllIII[64], lIIIlllIllIII[13], lIIIlllIllIII[65]);
            bA.add(var2);
            0;
        }
        int[] nArray4 = new int[lIIIlllIllIII[2]];
        nArray4[O.lIIIlllIllIII[1]] = lIIIlllIllIII[66];
        if (O.lIlIIlIIlIllIll(Bank.contains((int[])nArray4) ? 1 : 0)) {
            var2 = new d(lIIIlllIllIII[66], lIIIlllIllIII[67], lIIIlllIllIII[68]);
            bA.add(var2);
            0;
        }
    }

    @Override
    public boolean X() {
        return lIIIlllIllIII[1];
    }

    public static void cL() {
        block44: {
            TileItem var8;
            block45: {
                if (O.lIlIIlIIlIllIIl(by ? 1 : 0)) {
                    AccBuilderRat.c = lIIIlllIlIlll[lIIIlllIllIII[1]];
                    b.a(bA);
                    if (O.lIlIIlIIlIllIlI(bA.size(), lIIIlllIllIII[2])) {
                        System.out.println(lIIIlllIlIlll[lIIIlllIllIII[2]]);
                        by = lIIIlllIllIII[1];
                    }
                }
                if (!O.lIlIIlIIlIllIll(by ? 1 : 0)) break block44;
                if (O.lIlIIlIIlIllIll(O.S() ? 1 : 0) && O.lIlIIlIIlIllIlI(Game.getWildyLevel(), lIIIlllIllIII[2])) {
                    var8 = BankLocation.getNearest();
                    if (O.lIlIIlIIlIlllII(var8) && O.lIlIIlIIlIllIll(var8.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderRat.c = lIIIlllIlIlll[lIIIlllIllIII[3]];
                        a.a((BankLocation)var8);
                    }
                    if (O.lIlIIlIIlIlllII(var8) && O.lIlIIlIIlIllIIl(var8.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderRat.c = lIIIlllIlIlll[lIIIlllIllIII[4]];
                        if (O.lIlIIlIIlIllIll(Bank.isOpen() ? 1 : 0)) {
                            a.a();
                            Time.sleepUntil(() -> Bank.isOpen(), (int)lIIIlllIllIII[5]);
                            0;
                        }
                        if (O.lIlIIlIIlIllIIl(Bank.isOpen() ? 1 : 0)) {
                            if (O.lIlIIlIIlIlllIl(Inventory.getAll().size())) {
                                Bank.depositInventory();
                                Time.sleepTicks((int)lIIIlllIllIII[6]);
                                0;
                            }
                            if (O.lIlIIlIIlIlllIl(Equipment.getAll().size())) {
                                Bank.depositEquipment();
                                Time.sleepTicks((int)lIIIlllIllIII[3]);
                                0;
                            }
                            int[] nArray = new int[lIIIlllIllIII[4]];
                            nArray[O.lIIIlllIllIII[1]] = lIIIlllIllIII[7];
                            nArray[O.lIIIlllIllIII[2]] = lIIIlllIllIII[0];
                            nArray[O.lIIIlllIllIII[3]] = lIIIlllIllIII[8];
                            if (O.lIlIIlIIlIllIll(e.b(nArray) ? 1 : 0)) {
                                O.W();
                                System.out.println(lIIIlllIlIlll[lIIIlllIllIII[6]]);
                                by = lIIIlllIllIII[2];
                                return;
                            }
                            int[] nArray2 = new int[lIIIlllIllIII[4]];
                            nArray2[O.lIIIlllIllIII[1]] = lIIIlllIllIII[7];
                            nArray2[O.lIIIlllIllIII[2]] = lIIIlllIllIII[0];
                            nArray2[O.lIIIlllIllIII[3]] = lIIIlllIllIII[8];
                            if (O.lIlIIlIIlIllIIl(e.b(nArray2) ? 1 : 0)) {
                                if (O.lIlIIlIIlIllIll(Equipment.contains((int[])f.bf) ? 1 : 0)) {
                                    a.b(f.bf, lIIIlllIllIII[2]);
                                }
                                a.b(f.ba, lIIIlllIllIII[2]);
                                a.a(lIIIlllIllIII[9], lIIIlllIllIII[10]);
                                a.b(lIIIlllIllIII[0], lIIIlllIllIII[11]);
                            }
                        }
                    }
                }
                if (O.lIlIIlIIlIllIIl(O.S() ? 1 : 0)) {
                    if (O.lIlIIlIIlIllIIl(Inventory.contains((int[])f.ba) ? 1 : 0) && O.lIlIIlIIlIllIlI(Movement.getRunEnergy(), lIIIlllIllIII[12])) {
                        Inventory.getFirst((int[])f.ba).interact(lIIIlllIlIlll[lIIIlllIllIII[13]]);
                        Time.sleepTicks((int)lIIIlllIllIII[2]);
                        0;
                    }
                    if (O.lIlIIlIIlIllIll(Movement.isRunEnabled() ? 1 : 0) && O.lIlIIlIIlIllllI(Movement.getRunEnergy(), lIIIlllIllIII[14])) {
                        Movement.toggleRun();
                        Time.sleepTicks((int)lIIIlllIllIII[13]);
                        0;
                    }
                    if (O.lIlIIlIIlIllIlI(Game.getWildyLevel(), lIIIlllIllIII[2])) {
                        AccBuilderRat.c = lIIIlllIlIlll[lIIIlllIllIII[15]];
                        if (O.lIlIIlIIlIllIIl(Dialog.isOpen() ? 1 : 0)) {
                            Dialog.close();
                        }
                        if (O.lIlIIlIIlIllIll(Dialog.isOpen() ? 1 : 0) && O.lIlIIlIIlIllIIl(Inventory.contains((int[])f.bf) ? 1 : 0) && O.lIlIIlIIlIlllll(Players.getLocal().getAnimation(), lIIIlllIllIII[16])) {
                            Inventory.getFirst((int[])f.bf).interact(lIIIlllIlIlll[lIIIlllIllIII[17]]);
                            Time.sleepTicks((int)lIIIlllIllIII[3]);
                            0;
                        }
                        String[] stringArray = new String[lIIIlllIllIII[3]];
                        stringArray[O.lIIIlllIllIII[1]] = lIIIlllIlIlll[lIIIlllIllIII[18]];
                        stringArray[O.lIIIlllIllIII[2]] = lIIIlllIlIlll[lIIIlllIllIII[19]];
                        g.a(stringArray);
                    }
                    if (O.lIlIIlIIlIlllIl(Game.getWildyLevel())) {
                        TileObject var1;
                        int[] nArray = new int[lIIIlllIllIII[2]];
                        nArray[O.lIIIlllIllIII[1]] = lIIIlllIllIII[0];
                        if (O.lIlIIlIIlIllIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                            if (O.lIlIIlIIlIllllI(Players.getLocal().getWorldLocation().distanceTo(in), lIIIlllIllIII[20])) {
                                AccBuilderRat.c = lIIIlllIlIlll[lIIIlllIllIII[21]];
                                TileItem tileItem = new WorldPoint[lIIIlllIllIII[20]];
                                tileItem[O.lIIIlllIllIII[1]] = new WorldPoint(lIIIlllIllIII[22], lIIIlllIllIII[23], lIIIlllIllIII[1]);
                                tileItem[O.lIIIlllIllIII[2]] = new WorldPoint(lIIIlllIllIII[24], lIIIlllIllIII[25], lIIIlllIllIII[1]);
                                tileItem[O.lIIIlllIllIII[3]] = new WorldPoint(lIIIlllIllIII[26], lIIIlllIllIII[27], lIIIlllIllIII[1]);
                                tileItem[O.lIIIlllIllIII[4]] = new WorldPoint(lIIIlllIllIII[28], lIIIlllIllIII[29], lIIIlllIllIII[1]);
                                tileItem[O.lIIIlllIllIII[6]] = new WorldPoint(lIIIlllIllIII[30], lIIIlllIllIII[31], lIIIlllIllIII[1]);
                                tileItem[O.lIIIlllIllIII[13]] = new WorldPoint(lIIIlllIllIII[32], lIIIlllIllIII[33], lIIIlllIllIII[1]);
                                tileItem[O.lIIIlllIllIII[15]] = new WorldPoint(lIIIlllIllIII[34], lIIIlllIllIII[35], lIIIlllIllIII[1]);
                                tileItem[O.lIIIlllIllIII[17]] = new WorldPoint(lIIIlllIllIII[36], lIIIlllIllIII[37], lIIIlllIllIII[1]);
                                tileItem[O.lIIIlllIllIII[18]] = new WorldPoint(lIIIlllIllIII[38], lIIIlllIllIII[37], lIIIlllIllIII[1]);
                                tileItem[O.lIIIlllIllIII[19]] = new WorldPoint(lIIIlllIllIII[39], lIIIlllIllIII[37], lIIIlllIllIII[1]);
                                tileItem[O.lIIIlllIllIII[21]] = new WorldPoint(lIIIlllIllIII[40], lIIIlllIllIII[37], lIIIlllIllIII[1]);
                                tileItem[O.lIIIlllIllIII[41]] = new WorldPoint(lIIIlllIllIII[42], lIIIlllIllIII[43], lIIIlllIllIII[1]);
                                tileItem[O.lIIIlllIllIII[44]] = new WorldPoint(lIIIlllIllIII[45], lIIIlllIllIII[43], lIIIlllIllIII[1]);
                                var8 = tileItem;
                                Walker.walkAlong(Arrays.asList(var8), new HashMap());
                                0;
                                Time.sleepTicks((int)lIIIlllIllIII[2]);
                                0;
                            }
                            if (O.lIlIIlIIllIIIII(Players.getLocal().getWorldLocation().distanceTo(in), lIIIlllIllIII[20])) {
                                AccBuilderRat.c = lIIIlllIlIlll[lIIIlllIllIII[41]];
                                String[] stringArray = new String[lIIIlllIllIII[2]];
                                stringArray[O.lIIIlllIllIII[1]] = lIIIlllIlIlll[lIIIlllIllIII[44]];
                                var8 = TileObjects.getNearest((String[])stringArray);
                                String[] stringArray2 = new String[lIIIlllIllIII[2]];
                                stringArray2[O.lIIIlllIllIII[1]] = lIIIlllIlIlll[lIIIlllIllIII[20]];
                                var1 = TileObjects.getNearest((String[])stringArray2);
                                String[] stringArray3 = new String[lIIIlllIllIII[2]];
                                stringArray3[O.lIIIlllIllIII[1]] = lIIIlllIlIlll[lIIIlllIllIII[46]];
                                if (O.lIlIIlIIlIllIIl(var1.hasAction(stringArray3) ? 1 : 0)) {
                                    var1.interact(lIIIlllIlIlll[lIIIlllIllIII[47]]);
                                }
                                if (O.lIlIIlIIlIlllII(var8)) {
                                    String[] stringArray4 = new String[lIIIlllIllIII[2]];
                                    stringArray4[O.lIIIlllIllIII[1]] = lIIIlllIlIlll[lIIIlllIllIII[48]];
                                    if (O.lIlIIlIIlIllIll(var1.hasAction(stringArray4) ? 1 : 0)) {
                                        int var17 = Skills.getExperience((Skill)Skill.PRAYER);
                                        int[] nArray3 = new int[lIIIlllIllIII[2]];
                                        nArray3[O.lIIIlllIllIII[1]] = lIIIlllIllIII[0];
                                        String[] stringArray5 = new String[lIIIlllIllIII[2]];
                                        stringArray5[O.lIIIlllIllIII[1]] = lIIIlllIlIlll[lIIIlllIllIII[49]];
                                        Inventory.getFirst((int[])nArray3).useOn(TileObjects.getNearest((String[])stringArray5));
                                        Time.sleepTicks((int)lIIIlllIllIII[2]);
                                        0;
                                    }
                                }
                            }
                        }
                        int[] nArray4 = new int[lIIIlllIllIII[2]];
                        nArray4[O.lIIIlllIllIII[1]] = lIIIlllIllIII[0];
                        if (O.lIlIIlIIlIllIll(Inventory.contains((int[])nArray4) ? 1 : 0)) {
                            int[] nArray5 = new int[lIIIlllIllIII[2]];
                            nArray5[O.lIIIlllIllIII[1]] = lIIIlllIllIII[50];
                            if (O.lIlIIlIIlIllIIl(Inventory.contains((int[])nArray5) ? 1 : 0)) {
                                if (O.lIlIIlIIlIllllI(Players.getLocal().getWorldLocation().distanceTo(in), lIIIlllIllIII[20])) {
                                    AccBuilderRat.c = lIIIlllIlIlll[lIIIlllIllIII[51]];
                                    WorldPoint[] worldPointArray = new WorldPoint[lIIIlllIllIII[20]];
                                    worldPointArray[O.lIIIlllIllIII[1]] = new WorldPoint(lIIIlllIllIII[22], lIIIlllIllIII[23], lIIIlllIllIII[1]);
                                    worldPointArray[O.lIIIlllIllIII[2]] = new WorldPoint(lIIIlllIllIII[24], lIIIlllIllIII[25], lIIIlllIllIII[1]);
                                    worldPointArray[O.lIIIlllIllIII[3]] = new WorldPoint(lIIIlllIllIII[26], lIIIlllIllIII[27], lIIIlllIllIII[1]);
                                    worldPointArray[O.lIIIlllIllIII[4]] = new WorldPoint(lIIIlllIllIII[28], lIIIlllIllIII[29], lIIIlllIllIII[1]);
                                    worldPointArray[O.lIIIlllIllIII[6]] = new WorldPoint(lIIIlllIllIII[30], lIIIlllIllIII[31], lIIIlllIllIII[1]);
                                    worldPointArray[O.lIIIlllIllIII[13]] = new WorldPoint(lIIIlllIllIII[32], lIIIlllIllIII[33], lIIIlllIllIII[1]);
                                    worldPointArray[O.lIIIlllIllIII[15]] = new WorldPoint(lIIIlllIllIII[34], lIIIlllIllIII[35], lIIIlllIllIII[1]);
                                    worldPointArray[O.lIIIlllIllIII[17]] = new WorldPoint(lIIIlllIllIII[36], lIIIlllIllIII[37], lIIIlllIllIII[1]);
                                    worldPointArray[O.lIIIlllIllIII[18]] = new WorldPoint(lIIIlllIllIII[38], lIIIlllIllIII[37], lIIIlllIllIII[1]);
                                    worldPointArray[O.lIIIlllIllIII[19]] = new WorldPoint(lIIIlllIllIII[39], lIIIlllIllIII[37], lIIIlllIllIII[1]);
                                    worldPointArray[O.lIIIlllIllIII[21]] = new WorldPoint(lIIIlllIllIII[40], lIIIlllIllIII[37], lIIIlllIllIII[1]);
                                    worldPointArray[O.lIIIlllIllIII[41]] = new WorldPoint(lIIIlllIllIII[42], lIIIlllIllIII[43], lIIIlllIllIII[1]);
                                    worldPointArray[O.lIIIlllIllIII[44]] = new WorldPoint(lIIIlllIllIII[45], lIIIlllIllIII[43], lIIIlllIllIII[1]);
                                    var8 = worldPointArray;
                                    Walker.walkAlong(Arrays.asList(var8), new HashMap());
                                    0;
                                    Time.sleepTicks((int)lIIIlllIllIII[2]);
                                    0;
                                }
                                if (O.lIlIIlIIllIIIII(Players.getLocal().getWorldLocation().distanceTo(in), lIIIlllIllIII[20])) {
                                    AccBuilderRat.c = lIIIlllIlIlll[lIIIlllIllIII[52]];
                                    if (!O.lIlIIlIIlIllIll(Dialog.canLevelUpContinue() ? 1 : 0) || O.lIlIIlIIlIllIIl(Dialog.isOpen() ? 1 : 0)) {
                                        Dialog.close();
                                    }
                                    String[] stringArray = new String[lIIIlllIllIII[2]];
                                    stringArray[O.lIIIlllIllIII[1]] = lIIIlllIlIlll[lIIIlllIllIII[14]];
                                    var8 = NPCs.getNearest((String[])stringArray);
                                    String[] stringArray6 = new String[lIIIlllIllIII[2]];
                                    stringArray6[O.lIIIlllIllIII[1]] = lIIIlllIlIlll[lIIIlllIllIII[53]];
                                    var1 = TileObjects.getNearest((String[])stringArray6);
                                    String[] stringArray7 = new String[lIIIlllIllIII[2]];
                                    stringArray7[O.lIIIlllIllIII[1]] = lIIIlllIlIlll[lIIIlllIllIII[54]];
                                    if (O.lIlIIlIIlIllIIl(var1.hasAction(stringArray7) ? 1 : 0)) {
                                        var1.interact(lIIIlllIlIlll[lIIIlllIllIII[55]]);
                                    }
                                    if (O.lIlIIlIIlIlllII(var8)) {
                                        String[] stringArray8 = new String[lIIIlllIllIII[2]];
                                        stringArray8[O.lIIIlllIllIII[1]] = lIIIlllIlIlll[lIIIlllIllIII[56]];
                                        if (O.lIlIIlIIlIllIll(var1.hasAction(stringArray8) ? 1 : 0)) {
                                            List var17;
                                            if (O.lIlIIlIIlIllIll(Dialog.isOpen() ? 1 : 0)) {
                                                int[] nArray6 = new int[lIIIlllIllIII[2]];
                                                nArray6[O.lIIIlllIllIII[1]] = lIIIlllIllIII[50];
                                                Inventory.getFirst((int[])nArray6).useOn((Actor)var8);
                                                Time.sleepTicks((int)lIIIlllIllIII[3]);
                                                0;
                                            }
                                            if (O.lIlIIlIIlIllIIl(Dialog.isOpen() ? 1 : 0) && O.lIlIIlIIlIllIll((var17 = Dialog.getOptions()).isEmpty() ? 1 : 0)) {
                                                int var6 = lIIIlllIllIII[1];
                                                while (O.lIlIIlIIlIllIlI(var6, var17.size())) {
                                                    int[] nArray7 = new int[lIIIlllIllIII[2]];
                                                    nArray7[O.lIIIlllIllIII[1]] = lIIIlllIllIII[50];
                                                    if (O.lIlIIlIIlIlllll(((Item)Inventory.getAll((int[])nArray7).get(lIIIlllIllIII[1])).getQuantity(), lIIIlllIllIII[2]) && O.lIlIIlIIlIllIIl(((Widget)var17.get(var6)).getText().contains(lIIIlllIlIlll[lIIIlllIllIII[57]]) ? 1 : 0)) {
                                                        Mouse.click((int)((Widget)var17.get(var6)).getClickPoint().getX(), (int)((Widget)var17.get(var6)).getClickPoint().getY(), (boolean)lIIIlllIllIII[2]);
                                                        Time.sleepTicks((int)lIIIlllIllIII[3]);
                                                        0;
                                                    }
                                                    int[] nArray8 = new int[lIIIlllIllIII[2]];
                                                    nArray8[O.lIIIlllIllIII[1]] = lIIIlllIllIII[50];
                                                    if (O.lIlIIlIIlIlllll(((Item)Inventory.getAll((int[])nArray8).get(lIIIlllIllIII[1])).getQuantity(), lIIIlllIllIII[13]) && O.lIlIIlIIlIllIIl(((Widget)var17.get(var6)).getText().contains(lIIIlllIlIlll[lIIIlllIllIII[58]]) ? 1 : 0)) {
                                                        Mouse.click((int)((Widget)var17.get(var6)).getClickPoint().getX(), (int)((Widget)var17.get(var6)).getClickPoint().getY(), (boolean)lIIIlllIllIII[2]);
                                                        Time.sleepTicks((int)lIIIlllIllIII[3]);
                                                        0;
                                                    }
                                                    if (O.lIlIIlIIlIllIIl(((Widget)var17.get(var6)).getText().contains(lIIIlllIlIlll[lIIIlllIllIII[59]]) ? 1 : 0)) {
                                                        Mouse.click((int)((Widget)var17.get(var6)).getClickPoint().getX(), (int)((Widget)var17.get(var6)).getClickPoint().getY(), (boolean)lIIIlllIllIII[2]);
                                                        Time.sleepTicks((int)lIIIlllIllIII[3]);
                                                        0;
                                                    }
                                                    ++var6;
                                                    0;
                                                    if (1 >= -1) continue;
                                                    return;
                                                }
                                            }
                                        }
                                    }
                                    e.s();
                                }
                            }
                        }
                    }
                }
                int[] nArray = new int[lIIIlllIllIII[2]];
                nArray[O.lIIIlllIllIII[1]] = lIIIlllIllIII[9];
                if (!O.lIlIIlIIlIllIIl(Inventory.contains((int[])nArray) ? 1 : 0)) break block45;
                int[] nArray9 = new int[lIIIlllIllIII[2]];
                nArray9[O.lIIIlllIllIII[1]] = lIIIlllIllIII[0];
                if (!O.lIlIIlIIlIllIll(Inventory.contains((int[])nArray9) ? 1 : 0)) break block44;
                int[] nArray10 = new int[lIIIlllIllIII[2]];
                nArray10[O.lIIIlllIllIII[1]] = lIIIlllIllIII[50];
                if (!O.lIlIIlIIlIllIll(Inventory.contains((int[])nArray10) ? 1 : 0)) break block44;
            }
            if (O.lIlIIlIIllIIIII(Players.getLocal().getWorldLocation().distanceTo(in), lIIIlllIllIII[20])) {
                AccBuilderRat.c = lIIIlllIlIlll[lIIIlllIllIII[60]];
                String[] stringArray = new String[lIIIlllIllIII[2]];
                stringArray[O.lIIIlllIllIII[1]] = lIIIlllIlIlll[lIIIlllIllIII[61]];
                var8 = TileItems.getNearest((String[])stringArray);
                if (O.lIlIIlIIlIlllII(var8)) {
                    var8.interact(lIIIlllIlIlll[lIIIlllIllIII[62]]);
                }
            }
        }
    }

    private static void lIlIIlIIlIllIII() {
        lIIIlllIllIII = new int[88];
        O.lIIIlllIllIII[0] = -(112 + 107 - 90 + 69) & (0xFFFF97DD & 0x6AFF);
        O.lIIIlllIllIII[1] = (0xAE ^ 0x8F) & ~(0xA1 ^ 0x80);
        O.lIIIlllIllIII[2] = 1;
        O.lIIIlllIllIII[3] = 2;
        O.lIIIlllIllIII[4] = 3;
        O.lIIIlllIllIII[5] = 0xFFFF97DF & 0x7BA8;
        O.lIIIlllIllIII[6] = 0x40 ^ 0x44;
        O.lIIIlllIllIII[7] = 0xFFFFD7AF & 0x7AFE;
        O.lIIIlllIllIII[8] = -(0xFFFFDEFF & 0x678F) & (0xFFFFFFDF & 0x77FF);
        O.lIIIlllIllIII[9] = -(0xFFFFDA9B & 0x7575) & (0xFFFFD3F7 & 0x7FFB);
        O.lIIIlllIllIII[10] = 0xFFFFBD36 & 0x6BCD;
        O.lIIIlllIllIII[11] = 97 + 84 - 124 + 88 + (143 + 94 - 135 + 73) - (0xFFFFF79F & 0x972) + (17 + 47 - 5 + 95);
        O.lIIIlllIllIII[12] = 0xCB ^ 0x85 ^ (0x13 ^ 0x6F);
        O.lIIIlllIllIII[13] = 0x55 ^ 0x75 ^ (0xAA ^ 0x8F);
        O.lIIIlllIllIII[14] = 0x20 ^ 0x34;
        O.lIIIlllIllIII[15] = 0x65 ^ 0x63;
        O.lIIIlllIllIII[16] = -1;
        O.lIIIlllIllIII[17] = 0x74 ^ 0x73;
        O.lIIIlllIllIII[18] = 0x29 ^ 0x54 ^ (0x6D ^ 0x18);
        O.lIIIlllIllIII[19] = 0x29 ^ 0x5E ^ (0x34 ^ 0x4A);
        O.lIIIlllIllIII[20] = 135 + 155 - 183 + 58 ^ 146 + 37 - 15 + 0;
        O.lIIIlllIllIII[21] = 135 + 16 - 21 + 21 ^ 86 + 94 - 177 + 154;
        O.lIIIlllIllIII[22] = 0xFFFFFFDC & 0xBF7;
        O.lIIIlllIllIII[23] = 0xFFFFBF66 & 0x4F9B;
        O.lIIIlllIllIII[24] = -(0xFFFFB72E & 0x4CF3) & (0xFFFFEFF3 & 0x1FFF);
        O.lIIIlllIllIII[25] = -(0xFFFFCE33 & 0x71CD) & (0xFFFFEFFB & 0x5EFF);
        O.lIIIlllIllIII[26] = -(0xFFFFFC99 & 0x4377) & (0xFFFFFBFF & 0x4FDB);
        O.lIIIlllIllIII[27] = 0xFFFFAFFD & 0x5EFA;
        O.lIIIlllIllIII[28] = 0xFFFFDFDF & 0x2BE7;
        O.lIIIlllIllIII[29] = -(0xFFFFB7CD & 0x583B) & (0xFFFFFEFD & 0x1FFF);
        O.lIIIlllIllIII[30] = 0xFFFFDFE7 & 0x2BDA;
        O.lIIIlllIllIII[31] = -(0xFFFFF5AB & 0x4A5F) & (0xFFFFFFFB & 0x4EFF);
        O.lIIIlllIllIII[32] = -(0xFFFFF60B & 0x6DF7) & (0xFFFFEFBF & Short.MAX_VALUE);
        O.lIIIlllIllIII[33] = 0xFFFFCFEE & 0x3EFF;
        O.lIIIlllIllIII[34] = -(0xFFFFA493 & 0x7F6D) & (0xFFFFEFF7 & 0x3FBF);
        O.lIIIlllIllIII[35] = 0xFFFFBEFF & 0x4FEA;
        O.lIIIlllIllIII[36] = 0xFFFFCBBF & 0x3FEF;
        O.lIIIlllIllIII[37] = 0xFFFFDFFB & 0x2EEF;
        O.lIIIlllIllIII[38] = -(0xFFFFAEDD & 0x757B) & (0xFFFFBFFF & 0x6FFF);
        O.lIIIlllIllIII[39] = 0xFFFF8BB1 & 0x7FEE;
        O.lIIIlllIllIII[40] = -(0x27 ^ 2) & (0xFFFFBBBF & 0x4FFE);
        O.lIIIlllIllIII[41] = 0x1D ^ 1 ^ (0x79 ^ 0x6E);
        O.lIIIlllIllIII[42] = 0xFFFF8B9F & 0x7FF3;
        O.lIIIlllIllIII[43] = 0xFFFFBEFD & 0x4FEE;
        O.lIIIlllIllIII[44] = 0xBA ^ 0xB6;
        O.lIIIlllIllIII[45] = -(0xFFFFE5E1 & 0x1E7F) & (0xFFFFAFFF & 0x5FEF);
        O.lIIIlllIllIII[46] = 0x36 ^ 0x40 ^ (0xEC ^ 0x94);
        O.lIIIlllIllIII[47] = 0x25 ^ 0x2A;
        O.lIIIlllIllIII[48] = 0xB ^ 0x1B;
        O.lIIIlllIllIII[49] = 0x8E ^ 0xBD ^ (0x28 ^ 0xA);
        O.lIIIlllIllIII[50] = -(0xFFFFEDE1 & 0x37FF) & (0xFFFFBFF9 & 0x67FF);
        O.lIIIlllIllIII[51] = 0xB1 ^ 0x9D ^ (0x27 ^ 0x19);
        O.lIIIlllIllIII[52] = 0x63 ^ 0x14 ^ (0x74 ^ 0x10);
        O.lIIIlllIllIII[53] = 0x6B ^ 0x3D ^ (0xC5 ^ 0x86);
        O.lIIIlllIllIII[54] = 0x94 ^ 0x82;
        O.lIIIlllIllIII[55] = 0x28 ^ 0x11 ^ (0xB4 ^ 0x9A);
        O.lIIIlllIllIII[56] = 0x18 ^ 0;
        O.lIIIlllIllIII[57] = 0x63 ^ 0x21 ^ (0xF5 ^ 0xAE);
        O.lIIIlllIllIII[58] = 0xAA ^ 0xB0;
        O.lIIIlllIllIII[59] = 1 + 95 - -23 + 22 ^ 139 + 78 - 81 + 14;
        O.lIIIlllIllIII[60] = 0xAE ^ 0xB2;
        O.lIIIlllIllIII[61] = 0xB1 ^ 0xAC;
        O.lIIIlllIllIII[62] = 0x39 ^ 0x27;
        O.lIIIlllIllIII[63] = -(0xFFFFE5BF & 0x5B44) & (0xFFFFFBFB & 0x4FF7);
        O.lIIIlllIllIII[64] = 0xFFFFAFED & 0x7EDE;
        O.lIIIlllIllIII[65] = 0xFFFFF3BB & 0x6DEC;
        O.lIIIlllIllIII[66] = -(0xFFFFECFD & 0x53BB) & (0xFFFFFFFF & 0x5FFF);
        O.lIIIlllIllIII[67] = 0x15 ^ 0x2B ^ (9 ^ 0x1F);
        O.lIIIlllIllIII[68] = 0xFFFFBB87 & 0x47FC;
        O.lIIIlllIllIII[69] = -(0xFFFFE4B1 & 0x5BEF) & (0xFFFFEDFE & 0x47FEF);
        O.lIIIlllIllIII[70] = 0xD5 ^ 0x85 ^ (0x5B ^ 0x37);
        O.lIIIlllIllIII[71] = 0x55 ^ 0x16 ^ (0xCE ^ 0xA0);
        O.lIIIlllIllIII[72] = -(0xFFFFBEFF & 0x572D) & (0xFFFF9FFE & 0x77EF);
        O.lIIIlllIllIII[73] = 0xFFFFF7E9 & 0xF85E;
        O.lIIIlllIllIII[74] = 0x73 ^ 0x17;
        O.lIIIlllIllIII[75] = 0x4C ^ 0x53;
        O.lIIIlllIllIII[76] = 0x77 ^ 0x66 ^ (0xB6 ^ 0xC4);
        O.lIIIlllIllIII[77] = 0x98 ^ 0xB8;
        O.lIIIlllIllIII[78] = -(0xFFFFE95B & 0x76AF) & (0xFFFFEFFF & 0x7BDF);
        O.lIIIlllIllIII[79] = -(84 + 99 - 86 + 104) & (0xFFFFFFED & 0xFDE);
        O.lIIIlllIllIII[80] = 0xFFFFFBF3 & 0xFBE;
        O.lIIIlllIllIII[81] = -(0xFFFFD7B1 & 0x794F) & (0xFFFFDFFD & 0x7FEB);
        O.lIIIlllIllIII[82] = 0xFFFFEFCE & 0x1BB7;
        O.lIIIlllIllIII[83] = -(0xFFFFFF1B & 0x71F7) & (0xFFFFFFFF & Short.MAX_VALUE);
        O.lIIIlllIllIII[84] = -(0xFFFFFC6F & 0x73FB) & (0xFFFFFFEF & 0x7BFE);
        O.lIIIlllIllIII[85] = 0xFFFFEE56 & 0x1DBF;
        O.lIIIlllIllIII[86] = 0xFFFFADAF & 0x5FF3;
        O.lIIIlllIllIII[87] = 0xAC ^ 0x8D;
    }

    private static boolean lIlIIlIIlIllllI(int n2, int n3) {
        return n2 > n3;
    }

    private static String lIlIIlIIlIlIlII(String var10, String var23) {
        try {
            SecretKeySpec var20 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var23.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var21 = Cipher.getInstance("Blowfish");
            var21.init(lIIIlllIllIII[3], var20);
            return new String(var21.doFinal(Base64.getDecoder().decode(var10.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var3) {
            var3.printStackTrace();
            return null;
        }
    }

    public O() {
        this.is = lIIIlllIllIII[0];
    }

    @Override
    public int Y() {
        try {
            O.cL();
            0;
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (((0xA4 ^ 0xA9) & ~(0 ^ 0xD)) < ((0x8E ^ 0x9D) & ~(0x44 ^ 0x57))) {
            return (0x5A ^ 0x49) & ~(0x3B ^ 0x28);
        }
        return lIIIlllIllIII[74];
    }

    private static boolean lIlIIlIIlIllIlI(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIlIIlIIllIIIIl(int n2, int n3) {
        return n2 >= n3;
    }
}

