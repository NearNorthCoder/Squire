/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Locatable
 *  net.runelite.api.Prayer
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
 *  net.unethicalite.api.movement.Reachable
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 *  net.unethicalite.api.quests.Quests
 *  net.unethicalite.api.widgets.Dialog
 *  net.unethicalite.api.widgets.Prayers
 */
package i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i;

import gg.squire.account.AccBuilderRat;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.M;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.O;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.P;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.a;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.b;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.d;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.e;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.f;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.g;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.h;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.i;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.m;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Locatable;
import net.runelite.api.Prayer;
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
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.quests.Quests;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Prayers;

public class l
implements M {
    private static /* synthetic */ String[] bW;
    public static final /* synthetic */ WorldPoint cf;
    public static final /* synthetic */ WorldPoint ce;
    public static final /* synthetic */ WorldPoint cd;
    public static final /* synthetic */ WorldPoint ch;
    public static final /* synthetic */ WorldPoint cl;
    static /* synthetic */ boolean cp;
    public static final /* synthetic */ WorldPoint cg;
    public static final /* synthetic */ WorldPoint ci;
    public static final /* synthetic */ WorldPoint ck;
    static /* synthetic */ int cm;
    public static /* synthetic */ boolean by;
    static /* synthetic */ WorldArea cn;
    public static /* synthetic */ List<d> bA;
    public static final /* synthetic */ WorldPoint cj;
    private static /* synthetic */ int[] lIIIlllIIlIlI;
    static /* synthetic */ int co;
    private static /* synthetic */ String[] lIIIlllIIlIIl;

    static {
        l.lIlIIIllllIlIII();
        l.lIlIIIllllIIlll();
        cd = new WorldPoint(lIIIlllIIlIlI[91], lIIIlllIIlIlI[92], lIIIlllIIlIlI[1]);
        ce = new WorldPoint(lIIIlllIIlIlI[93], lIIIlllIIlIlI[94], lIIIlllIIlIlI[1]);
        cf = new WorldPoint(lIIIlllIIlIlI[95], lIIIlllIIlIlI[96], lIIIlllIIlIlI[1]);
        cg = new WorldPoint(lIIIlllIIlIlI[97], lIIIlllIIlIlI[98], lIIIlllIIlIlI[1]);
        ch = new WorldPoint(lIIIlllIIlIlI[99], lIIIlllIIlIlI[100], lIIIlllIIlIlI[1]);
        ci = new WorldPoint(lIIIlllIIlIlI[101], lIIIlllIIlIlI[102], lIIIlllIIlIlI[1]);
        cj = new WorldPoint(lIIIlllIIlIlI[103], lIIIlllIIlIlI[104], lIIIlllIIlIlI[1]);
        ck = new WorldPoint(lIIIlllIIlIlI[91], lIIIlllIIlIlI[105], lIIIlllIIlIlI[1]);
        cl = new WorldPoint(lIIIlllIIlIlI[106], lIIIlllIIlIlI[107], lIIIlllIIlIlI[1]);
        bA = new ArrayList<d>();
        cm = lIIIlllIIlIlI[30];
        cn = new WorldArea(lIIIlllIIlIlI[93], lIIIlllIIlIlI[108], lIIIlllIIlIlI[26], lIIIlllIIlIlI[47], lIIIlllIIlIlI[1]);
        String[] stringArray = new String[lIIIlllIIlIlI[11]];
        stringArray[l.lIIIlllIIlIlI[1]] = lIIIlllIIlIIl[lIIIlllIIlIlI[109]];
        stringArray[l.lIIIlllIIlIlI[0]] = lIIIlllIIlIIl[lIIIlllIIlIlI[110]];
        stringArray[l.lIIIlllIIlIlI[5]] = lIIIlllIIlIIl[lIIIlllIIlIlI[111]];
        bW = stringArray;
    }

    private static boolean lIlIIIlllllIlII(Object object, Object object2) {
        return object != object2;
    }

    private static boolean lIlIIIllllIllIl(Object object) {
        return object != null;
    }

    private static boolean lIlIIIllllIlllI(int n2) {
        return n2 > 0;
    }

    private static String lIlIIIllllIIlIl(String var9, String var15) {
        try {
            SecretKeySpec var12 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var15.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var24 = Cipher.getInstance("Blowfish");
            var24.init(lIIIlllIIlIlI[5], var12);
            return new String(var24.doFinal(Base64.getDecoder().decode(var9.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var20) {
            var20.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIIIlllllIIII(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean lIlIIIllllIlIll(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    private static boolean S() {
        void var18;
        int[] nArray = new int[lIIIlllIIlIlI[12]];
        nArray[l.lIIIlllIIlIlI[1]] = lIIIlllIIlIlI[13];
        nArray[l.lIIIlllIIlIlI[0]] = lIIIlllIIlIlI[7];
        nArray[l.lIIIlllIIlIlI[5]] = lIIIlllIIlIlI[10];
        nArray[l.lIIIlllIIlIlI[11]] = lIIIlllIIlIlI[14];
        nArray[l.lIIIlllIIlIlI[6]] = lIIIlllIIlIlI[15];
        nArray[l.lIIIlllIIlIlI[16]] = lIIIlllIIlIlI[17];
        int[] nArray2 = nArray;
        int var10 = lIIIlllIIlIlI[1];
        while (l.lIlIIIllllIlIlI(var10, ((void)var18).length)) {
            int[] nArray3 = new int[lIIIlllIIlIlI[0]];
            nArray3[l.lIIIlllIIlIlI[1]] = var18[var10];
            if (l.lIlIIIllllIlIll(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                return lIIIlllIIlIlI[1];
            }
            ++var10;
            0;
            if (1 >= 1) continue;
            return ((0x51 ^ 0x7F ^ (0x2C ^ 0xF)) & (12 + 48 - 10 + 104 ^ 28 + 8 - -15 + 100 ^ -1)) != 0;
        }
        return lIIIlllIIlIlI[0];
    }

    private static boolean lIlIIIllllIllII(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIlIIIlllllIIll(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean lIlIIIllllIlIIl(int n2) {
        return n2 != 0;
    }

    private static void lIlIIIllllIIlll() {
        lIIIlllIIlIIl = new String[lIIIlllIIlIlI[112]];
        l.lIIIlllIIlIIl[l.lIIIlllIIlIlI[1]] = l."Finished buying items, switching back to quest";
        l.lIIIlllIIlIIl[l.lIIIlllIIlIlI[0]] = l."Nav to bank";
        l.lIIIlllIIlIIl[l.lIIIlllIIlIlI[5]] = l."Handling banking";
        l.lIIIlllIIlIIl[l.lIIIlllIIlIlI[11]] = l."We are missing runes, switching to BUYING";
        l.lIIIlllIIlIIl[l.lIIIlllIIlIlI[6]] = l."We are missing quest supplies, switching to BUYING";
        l.lIIIlllIIlIIl[l.lIIIlllIIlIlI[16]] = l."Drink";
        l.lIIIlllIIlIIl[l.lIIIlllIIlIlI[12]] = l."Drink";
        l.lIIIlllIIlIIl[l.lIIIlllIIlIlI[22]] = l."Nav to start";
        l.lIIIlllIIlIIl[l.lIIIlllIIlIlI[23]] = l."Lady Servil";
        l.lIIIlllIIlIIl[l.lIIIlllIIlIlI[24]] = l."Nav to armour";
        l.lIIIlllIIlIIl[l.lIIIlllIIlIlI[18]] = l."Getting armour";
        l.lIIIlllIIlIIl[l.lIIIlllIIlIlI[25]] = l."Door";
        l.lIIIlllIIlIIl[l.lIIIlllIIlIlI[26]] = l."Open";
        l.lIIIlllIIlIIl[l.lIIIlllIIlIlI[3]] = l."Chest";
        l.lIIIlllIIlIIl[l.lIIIlllIIlIlI[27]] = l."Door";
        l.lIIIlllIIlIIl[l.lIIIlllIIlIlI[28]] = l."Open";
        l.lIIIlllIIlIIl[l.lIIIlllIIlIlI[29]] = l."Chest";
        l.lIIIlllIIlIIl[l.lIIIlllIIlIlI[30]] = l."Chest";
        l.lIIIlllIIlIIl[l.lIIIlllIIlIlI[31]] = l."Open";
        l.lIIIlllIIlIIl[l.lIIIlllIIlIlI[32]] = l."Chest";
        l.lIIIlllIIlIIl[l.lIIIlllIIlIlI[33]] = l."Open";
        l.lIIIlllIIlIIl[l.lIIIlllIIlIlI[34]] = l."Chest";
        l.lIIIlllIIlIIl[l.lIIIlllIIlIlI[35]] = l."Search";
        l.lIIIlllIIlIIl[l.lIIIlllIIlIlI[36]] = l."Chest";
        l.lIIIlllIIlIIl[l.lIIIlllIIlIlI[37]] = l."Search";
        l.lIIIlllIIlIIl[l.lIIIlllIIlIlI[21]] = l."Wear";
        l.lIIIlllIIlIIl[l.lIIIlllIIlIlI[40]] = l."Wear";
        l.lIIIlllIIlIIl[l.lIIIlllIIlIlI[41]] = l."Nav to jail";
        l.lIIIlllIIlIIl[l.lIIIlllIIlIlI[42]] = l."Door";
        l.lIIIlllIIlIIl[l.lIIIlllIIlIlI[43]] = l."Open";
        l.lIIIlllIIlIIl[l.lIIIlllIIlIlI[44]] = l."Nav to guard";
        l.lIIIlllIIlIIl[l.lIIIlllIIlIlI[45]] = l."Head Guard";
        l.lIIIlllIIlIIl[l.lIIIlllIIlIlI[46]] = l."Khali brew";
        l.lIIIlllIIlIIl[l.lIIIlllIIlIlI[47]] = l."Nav to brew";
        l.lIIIlllIIlIIl[l.lIIIlllIIlIlI[48]] = l."Khazard Barman";
        l.lIIIlllIIlIIl[l.lIIIlllIIlIlI[49]] = l."Khali brew";
        l.lIIIlllIIlIIl[l.lIIIlllIIlIlI[50]] = l."Nav to guard";
        l.lIIIlllIIlIIl[l.lIIIlllIIlIlI[51]] = l."Nav to guard";
        l.lIIIlllIIlIIl[l.lIIIlllIIlIlI[52]] = l."Head Guard";
        l.lIIIlllIIlIIl[l.lIIIlllIIlIlI[53]] = l."Nav to  sammy";
        l.lIIIlllIIlIIl[l.lIIIlllIIlIlI[54]] = l."Khazard cell keys";
        l.lIIIlllIIlIIl[l.lIIIlllIIlIlI[55]] = l."Khazard Ogre";
        l.lIIIlllIIlIIl[l.lIIIlllIIlIlI[56]] = l."Khazard Ogre";
        l.lIIIlllIIlIIl[l.lIIIlllIIlIlI[57]] = l."Attack";
        l.lIIIlllIIlIIl[l.lIIIlllIIlIlI[58]] = l."Sammy Servil";
        l.lIIIlllIIlIIl[l.lIIIlllIIlIlI[2]] = l."Hengrad";
        l.lIIIlllIIlIIl[l.lIIIlllIIlIlI[59]] = l."Hengrad";
        l.lIIIlllIIlIIl[l.lIIIlllIIlIlI[60]] = l."Hengrad";
        l.lIIIlllIIlIIl[l.lIIIlllIIlIlI[61]] = l."Khazard Scorpion";
        l.lIIIlllIIlIIl[l.lIIIlllIIlIlI[62]] = l."Khazard Scorpion";
        l.lIIIlllIIlIIl[l.lIIIlllIIlIlI[20]] = l."Attack";
        l.lIIIlllIIlIIl[l.lIIIlllIIlIlI[63]] = l."Bouncer";
        l.lIIIlllIIlIIl[l.lIIIlllIIlIlI[64]] = l."Bouncer";
        l.lIIIlllIIlIIl[l.lIIIlllIIlIlI[65]] = l."Attack";
        l.lIIIlllIIlIIl[l.lIIIlllIIlIlI[66]] = l."General Khazard";
        l.lIIIlllIIlIIl[l.lIIIlllIIlIlI[67]] = l."Break";
        l.lIIIlllIIlIIl[l.lIIIlllIIlIlI[71]] = l."Nav to start";
        l.lIIIlllIIlIIl[l.lIIIlllIIlIlI[72]] = l."General Khazard";
        l.lIIIlllIIlIIl[l.lIIIlllIIlIlI[76]] = l."Castle Wars";
        l.lIIIlllIIlIIl[l.lIIIlllIIlIlI[79]] = l."Lady Servil";
        l.lIIIlllIIlIIl[l.lIIIlllIIlIlI[86]] = l."Fight Arena";
        l.lIIIlllIIlIIl[l.lIIIlllIIlIlI[87]] = l."ring of wealth (";
        l.lIIIlllIIlIIl[l.lIIIlllIIlIlI[88]] = l."dueling";
        l.lIIIlllIIlIIl[l.lIIIlllIIlIlI[89]] = l."dueling";
        l.lIIIlllIIlIIl[l.lIIIlllIIlIlI[90]] = l."Prison Gate";
        l.lIIIlllIIlIIl[l.lIIIlllIIlIlI[109]] = l."Can I help you?";
        l.lIIIlllIIlIIl[l.lIIIlllIIlIlI[110]] = l."I'd like a Khali Brew please.";
        l.lIIIlllIIlIIl[l.lIIIlllIIlIlI[111]] = l."Yes.";
    }

    public static void ar() {
        block77: {
            block83: {
                block85: {
                    block84: {
                        BankLocation var11;
                        block78: {
                            block82: {
                                block80: {
                                    block81: {
                                        block79: {
                                            if (l.lIlIIIllllIlIIl(by ? 1 : 0)) {
                                                b.a(bA);
                                                if (l.lIlIIIllllIlIlI(bA.size(), lIIIlllIIlIlI[0])) {
                                                    System.out.println(lIIIlllIIlIIl[lIIIlllIIlIlI[1]]);
                                                    by = lIIIlllIIlIlI[1];
                                                }
                                            }
                                            if (!l.lIlIIIllllIlIll(by ? 1 : 0)) break block77;
                                            if (l.lIlIIIllllIlIlI(Skills.getLevel((Skill)Skill.PRAYER), lIIIlllIIlIlI[2])) {
                                                O.cL();
                                            }
                                            if (l.lIlIIIllllIllII(Skills.getLevel((Skill)Skill.PRAYER), lIIIlllIIlIlI[2]) && l.lIlIIIllllIlIlI(Skills.getLevel((Skill)Skill.MAGIC), lIIIlllIIlIlI[3])) {
                                                i.P();
                                            }
                                            if (!l.lIlIIIllllIlIll(l.S() ? 1 : 0) || !l.lIlIIIllllIlIlI(e.j(cm), lIIIlllIIlIlI[0]) || !l.lIlIIIllllIllII(Skills.getLevel((Skill)Skill.PRAYER), lIIIlllIIlIlI[2]) || !l.lIlIIIllllIllII(Skills.getLevel((Skill)Skill.MAGIC), lIIIlllIIlIlI[3])) break block78;
                                            var11 = BankLocation.getNearest();
                                            if (l.lIlIIIllllIllIl(var11) && l.lIlIIIllllIlIll(var11.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                                AccBuilderRat.c = lIIIlllIIlIIl[lIIIlllIIlIlI[0]];
                                                a.a(var11);
                                            }
                                            if (!l.lIlIIIllllIllIl(var11) || !l.lIlIIIllllIlIIl(var11.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block78;
                                            if (l.lIlIIIllllIlIll(Bank.isOpen() ? 1 : 0)) {
                                                a.a();
                                                Time.sleepUntil(() -> Bank.isOpen(), (int)lIIIlllIIlIlI[4]);
                                                0;
                                            }
                                            if (!l.lIlIIIllllIlIIl(Bank.isOpen() ? 1 : 0)) break block78;
                                            AccBuilderRat.c = lIIIlllIIlIIl[lIIIlllIIlIlI[5]];
                                            if (l.lIlIIIllllIlllI(Inventory.getAll().size())) {
                                                Bank.depositInventory();
                                                Time.sleepTicks((int)lIIIlllIIlIlI[6]);
                                                0;
                                            }
                                            if (l.lIlIIIllllIlllI(Equipment.getAll().size())) {
                                                Bank.depositEquipment();
                                                Time.sleepTicks((int)lIIIlllIIlIlI[5]);
                                                0;
                                            }
                                            int[] nArray = new int[lIIIlllIIlIlI[0]];
                                            nArray[l.lIIIlllIIlIlI[1]] = lIIIlllIIlIlI[7];
                                            if (!l.lIlIIIllllIlIIl(Bank.contains((int[])nArray) ? 1 : 0)) break block79;
                                            int[] nArray2 = new int[lIIIlllIIlIlI[0]];
                                            nArray2[l.lIIIlllIIlIlI[1]] = lIIIlllIIlIlI[7];
                                            if (!l.lIlIIIllllIllII(Bank.getFirst((int[])nArray2).getQuantity(), lIIIlllIIlIlI[8])) break block80;
                                        }
                                        int[] nArray = new int[lIIIlllIIlIlI[0]];
                                        nArray[l.lIIIlllIIlIlI[1]] = lIIIlllIIlIlI[9];
                                        if (!l.lIlIIIllllIlIIl(Bank.contains((int[])nArray) ? 1 : 0)) break block81;
                                        int[] nArray3 = new int[lIIIlllIIlIlI[0]];
                                        nArray3[l.lIIIlllIIlIlI[1]] = lIIIlllIIlIlI[9];
                                        if (!l.lIlIIIllllIllII(Bank.getFirst((int[])nArray3).getQuantity(), lIIIlllIIlIlI[8])) break block80;
                                    }
                                    int[] nArray = new int[lIIIlllIIlIlI[0]];
                                    nArray[l.lIIIlllIIlIlI[1]] = lIIIlllIIlIlI[10];
                                    if (!l.lIlIIIllllIlIIl(Bank.contains((int[])nArray) ? 1 : 0)) break block82;
                                    int[] nArray4 = new int[lIIIlllIIlIlI[0]];
                                    nArray4[l.lIIIlllIIlIlI[1]] = lIIIlllIIlIlI[10];
                                    if (!l.lIlIIIllllIlIlI(Bank.getFirst((int[])nArray4).getQuantity(), lIIIlllIIlIlI[8])) break block82;
                                }
                                l.W();
                                System.out.println(lIIIlllIIlIIl[lIIIlllIIlIlI[11]]);
                                by = lIIIlllIIlIlI[0];
                                return;
                            }
                            int[] nArray = new int[lIIIlllIIlIlI[12]];
                            nArray[l.lIIIlllIIlIlI[1]] = lIIIlllIIlIlI[13];
                            nArray[l.lIIIlllIIlIlI[0]] = lIIIlllIIlIlI[7];
                            nArray[l.lIIIlllIIlIlI[5]] = lIIIlllIIlIlI[10];
                            nArray[l.lIIIlllIIlIlI[11]] = lIIIlllIIlIlI[14];
                            nArray[l.lIIIlllIIlIlI[6]] = lIIIlllIIlIlI[15];
                            nArray[l.lIIIlllIIlIlI[16]] = lIIIlllIIlIlI[17];
                            if (l.lIlIIIllllIlIll(e.b(nArray) ? 1 : 0)) {
                                l.W();
                                System.out.println(lIIIlllIIlIIl[lIIIlllIIlIlI[6]]);
                                by = lIIIlllIIlIlI[0];
                                return;
                            }
                            int[] nArray5 = new int[lIIIlllIIlIlI[12]];
                            nArray5[l.lIIIlllIIlIlI[1]] = lIIIlllIIlIlI[13];
                            nArray5[l.lIIIlllIIlIlI[0]] = lIIIlllIIlIlI[7];
                            nArray5[l.lIIIlllIIlIlI[5]] = lIIIlllIIlIlI[10];
                            nArray5[l.lIIIlllIIlIlI[11]] = lIIIlllIIlIlI[14];
                            nArray5[l.lIIIlllIIlIlI[6]] = lIIIlllIIlIlI[15];
                            nArray5[l.lIIIlllIIlIlI[16]] = lIIIlllIIlIlI[17];
                            if (l.lIlIIIllllIlIIl(e.b(nArray5) ? 1 : 0)) {
                                while (l.lIlIIIllllIlIll(m.av() ? 1 : 0)) {
                                    m.at();
                                    Time.sleepTicks((int)lIIIlllIIlIlI[0]);
                                    0;
                                    0;
                                    if (1 > ((0x67 ^ 0x6A) & ~(0x46 ^ 0x4B))) continue;
                                    return;
                                }
                                if (l.lIlIIIllllIlIll(Bank.isOpen() ? 1 : 0)) {
                                    a.a();
                                    Time.sleepTicks((int)lIIIlllIIlIlI[12]);
                                    0;
                                }
                                a.a(lIIIlllIIlIlI[13], lIIIlllIIlIlI[18]);
                                a.a(lIIIlllIIlIlI[14], lIIIlllIIlIlI[11]);
                                a.a(lIIIlllIIlIlI[7], lIIIlllIIlIlI[8]);
                                a.a(lIIIlllIIlIlI[10], lIIIlllIIlIlI[8]);
                                a.a(lIIIlllIIlIlI[17], lIIIlllIIlIlI[11]);
                                a.a(lIIIlllIIlIlI[15], lIIIlllIIlIlI[18]);
                                a.a(lIIIlllIIlIlI[19], lIIIlllIIlIlI[4]);
                            }
                        }
                        if (l.lIlIIIllllIlIIl(Inventory.contains((int[])f.ba) ? 1 : 0) && l.lIlIIIllllIlIlI(Movement.getRunEnergy(), lIIIlllIIlIlI[20])) {
                            Inventory.getFirst((int[])f.ba).interact(lIIIlllIIlIIl[lIIIlllIIlIlI[16]]);
                            Time.sleepTicks((int)lIIIlllIIlIlI[0]);
                            0;
                        }
                        if (l.lIlIIIllllIlIlI(Prayers.getPoints(), lIIIlllIIlIlI[21]) && l.lIlIIIllllIlIIl(Inventory.contains((int[])f.aX) ? 1 : 0)) {
                            Inventory.getFirst((int[])f.aX).interact(lIIIlllIIlIIl[lIIIlllIIlIlI[12]]);
                        }
                        if (l.lIlIIIllllIlIIl(l.S() ? 1 : 0) && l.lIlIIIllllIlIll(e.j(cm))) {
                            if (l.lIlIIIllllIllll(Players.getLocal().getWorldLocation().distanceTo(cd), lIIIlllIIlIlI[16])) {
                                AccBuilderRat.c = lIIIlllIIlIIl[lIIIlllIIlIlI[22]];
                                if (l.lIlIIIllllIlIIl(Dialog.isOpen() ? 1 : 0)) {
                                    Dialog.close();
                                }
                                Movement.walkTo((WorldPoint)cd);
                                0;
                                Time.sleepTicks((int)lIIIlllIIlIlI[0]);
                                0;
                            }
                            if (l.lIlIIIlllllIIII(Players.getLocal().getWorldLocation().distanceTo(cd), lIIIlllIIlIlI[16])) {
                                g.a(lIIIlllIIlIIl[lIIIlllIIlIlI[23]], bW);
                            }
                        }
                        if (l.lIlIIIlllllIIIl(e.j(cm), lIIIlllIIlIlI[0])) {
                            if (l.lIlIIIllllIllll(Players.getLocal().getWorldLocation().distanceTo(ce), lIIIlllIIlIlI[6]) && l.lIlIIIllllIllll(Players.getLocal().getWorldLocation().distanceTo(cf), lIIIlllIIlIlI[6])) {
                                AccBuilderRat.c = lIIIlllIIlIIl[lIIIlllIIlIlI[24]];
                                Movement.walkTo((WorldPoint)ce);
                                0;
                                Time.sleepTicks((int)lIIIlllIIlIlI[0]);
                                0;
                            }
                            if (l.lIlIIIlllllIIII(Players.getLocal().getWorldLocation().distanceTo(ce), lIIIlllIIlIlI[12])) {
                                AccBuilderRat.c = lIIIlllIIlIIl[lIIIlllIIlIlI[18]];
                                String[] stringArray = new String[lIIIlllIIlIlI[0]];
                                stringArray[l.lIIIlllIIlIlI[1]] = lIIIlllIIlIIl[lIIIlllIIlIlI[25]];
                                String[] stringArray2 = new String[lIIIlllIIlIlI[0]];
                                stringArray2[l.lIIIlllIIlIlI[1]] = lIIIlllIIlIIl[lIIIlllIIlIlI[26]];
                                if (l.lIlIIIllllIlIIl(TileObjects.getNearest((String[])stringArray).hasAction(stringArray2) ? 1 : 0)) {
                                    String[] stringArray3 = new String[lIIIlllIIlIlI[0]];
                                    stringArray3[l.lIIIlllIIlIlI[1]] = lIIIlllIIlIIl[lIIIlllIIlIlI[3]];
                                    if (l.lIlIIIllllIlIll(Reachable.isInteractable((Locatable)TileObjects.getNearest((String[])stringArray3)) ? 1 : 0)) {
                                        String[] stringArray4 = new String[lIIIlllIIlIlI[0]];
                                        stringArray4[l.lIIIlllIIlIlI[1]] = lIIIlllIIlIIl[lIIIlllIIlIlI[27]];
                                        TileObjects.getNearest((String[])stringArray4).interact(lIIIlllIIlIIl[lIIIlllIIlIlI[28]]);
                                        Time.sleepTicks((int)lIIIlllIIlIlI[6]);
                                        0;
                                    }
                                }
                                String[] stringArray5 = new String[lIIIlllIIlIlI[0]];
                                stringArray5[l.lIIIlllIIlIlI[1]] = lIIIlllIIlIIl[lIIIlllIIlIlI[29]];
                                if (l.lIlIIIllllIlIIl(Reachable.isInteractable((Locatable)TileObjects.getNearest((String[])stringArray5)) ? 1 : 0)) {
                                    String[] stringArray6 = new String[lIIIlllIIlIlI[0]];
                                    stringArray6[l.lIIIlllIIlIlI[1]] = lIIIlllIIlIIl[lIIIlllIIlIlI[30]];
                                    String[] stringArray7 = new String[lIIIlllIIlIlI[0]];
                                    stringArray7[l.lIIIlllIIlIlI[1]] = lIIIlllIIlIIl[lIIIlllIIlIlI[31]];
                                    if (l.lIlIIIllllIlIIl(TileObjects.getNearest((String[])stringArray6).hasAction(stringArray7) ? 1 : 0)) {
                                        String[] stringArray8 = new String[lIIIlllIIlIlI[0]];
                                        stringArray8[l.lIIIlllIIlIlI[1]] = lIIIlllIIlIIl[lIIIlllIIlIlI[32]];
                                        TileObjects.getNearest((String[])stringArray8).interact(lIIIlllIIlIIl[lIIIlllIIlIlI[33]]);
                                        Time.sleepTicks((int)lIIIlllIIlIlI[5]);
                                        0;
                                    }
                                    String[] stringArray9 = new String[lIIIlllIIlIlI[0]];
                                    stringArray9[l.lIIIlllIIlIlI[1]] = lIIIlllIIlIIl[lIIIlllIIlIlI[34]];
                                    String[] stringArray10 = new String[lIIIlllIIlIlI[0]];
                                    stringArray10[l.lIIIlllIIlIlI[1]] = lIIIlllIIlIIl[lIIIlllIIlIlI[35]];
                                    if (l.lIlIIIllllIlIIl(TileObjects.getNearest((String[])stringArray9).hasAction(stringArray10) ? 1 : 0)) {
                                        String[] stringArray11 = new String[lIIIlllIIlIlI[0]];
                                        stringArray11[l.lIIIlllIIlIlI[1]] = lIIIlllIIlIIl[lIIIlllIIlIlI[36]];
                                        TileObjects.getNearest((String[])stringArray11).interact(lIIIlllIIlIIl[lIIIlllIIlIlI[37]]);
                                        Time.sleepTicks((int)lIIIlllIIlIlI[5]);
                                        0;
                                    }
                                }
                            }
                        }
                        if (l.lIlIIIlllllIIIl(e.j(cm), lIIIlllIIlIlI[5])) {
                            int[] nArray = new int[lIIIlllIIlIlI[0]];
                            nArray[l.lIIIlllIIlIlI[1]] = lIIIlllIIlIlI[38];
                            if (l.lIlIIIllllIlIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                                int[] nArray6 = new int[lIIIlllIIlIlI[0]];
                                nArray6[l.lIIIlllIIlIlI[1]] = lIIIlllIIlIlI[38];
                                Inventory.getFirst((int[])nArray6).interact(lIIIlllIIlIIl[lIIIlllIIlIlI[21]]);
                            }
                            int[] nArray7 = new int[lIIIlllIIlIlI[0]];
                            nArray7[l.lIIIlllIIlIlI[1]] = lIIIlllIIlIlI[39];
                            if (l.lIlIIIllllIlIIl(Inventory.contains((int[])nArray7) ? 1 : 0)) {
                                int[] nArray8 = new int[lIIIlllIIlIlI[0]];
                                nArray8[l.lIIIlllIIlIlI[1]] = lIIIlllIIlIlI[39];
                                Inventory.getFirst((int[])nArray8).interact(lIIIlllIIlIIl[lIIIlllIIlIlI[40]]);
                            }
                            if (l.lIlIIIllllIlIll(cn.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                if (l.lIlIIIllllIllll(Players.getLocal().getWorldLocation().distanceTo(cg), lIIIlllIIlIlI[6])) {
                                    AccBuilderRat.c = lIIIlllIIlIIl[lIIIlllIIlIlI[41]];
                                    Movement.walkTo((WorldPoint)cg);
                                    0;
                                    Time.sleepTicks((int)lIIIlllIIlIlI[0]);
                                    0;
                                }
                                if (l.lIlIIIlllllIIII(Players.getLocal().getWorldLocation().distanceTo(cg), lIIIlllIIlIlI[6]) && l.lIlIIIllllIlIll(Players.getLocal().isMoving() ? 1 : 0) && l.lIlIIIllllIlIll(Dialog.isOpen() ? 1 : 0)) {
                                    String[] stringArray = new String[lIIIlllIIlIlI[0]];
                                    stringArray[l.lIIIlllIIlIlI[1]] = lIIIlllIIlIIl[lIIIlllIIlIlI[42]];
                                    TileObjects.getNearest((String[])stringArray).interact(lIIIlllIIlIIl[lIIIlllIIlIlI[43]]);
                                    Time.sleepTicks((int)lIIIlllIIlIlI[5]);
                                    0;
                                }
                            }
                            if (l.lIlIIIllllIlIIl(cn.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                if (l.lIlIIIllllIllll(Players.getLocal().getWorldLocation().distanceTo(ch), lIIIlllIIlIlI[6])) {
                                    AccBuilderRat.c = lIIIlllIIlIIl[lIIIlllIIlIlI[44]];
                                    Movement.walkTo((WorldPoint)ch);
                                    0;
                                    Time.sleepTicks((int)lIIIlllIIlIlI[0]);
                                    0;
                                }
                                if (l.lIlIIIlllllIIII(Players.getLocal().getWorldLocation().distanceTo(ch), lIIIlllIIlIlI[6]) && l.lIlIIIllllIlIll(Players.getLocal().isMoving() ? 1 : 0)) {
                                    g.a(lIIIlllIIlIIl[lIIIlllIIlIlI[45]], bW);
                                }
                            }
                        }
                        if (l.lIlIIIlllllIIIl(e.j(cm), lIIIlllIIlIlI[11])) {
                            String[] stringArray = new String[lIIIlllIIlIlI[0]];
                            stringArray[l.lIIIlllIIlIlI[1]] = lIIIlllIIlIIl[lIIIlllIIlIlI[46]];
                            if (l.lIlIIIllllIlIll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                                if (l.lIlIIIllllIllll(Players.getLocal().getWorldLocation().distanceTo(ck), lIIIlllIIlIlI[16])) {
                                    AccBuilderRat.c = lIIIlllIIlIIl[lIIIlllIIlIlI[47]];
                                    Movement.walkTo((WorldPoint)ck);
                                    0;
                                    Time.sleepTicks((int)lIIIlllIIlIlI[0]);
                                    0;
                                }
                                if (l.lIlIIIlllllIIII(Players.getLocal().getWorldLocation().distanceTo(ck), lIIIlllIIlIlI[16])) {
                                    g.a(lIIIlllIIlIIl[lIIIlllIIlIlI[48]], bW);
                                }
                            }
                            String[] stringArray12 = new String[lIIIlllIIlIlI[0]];
                            stringArray12[l.lIIIlllIIlIlI[1]] = lIIIlllIIlIIl[lIIIlllIIlIlI[49]];
                            if (l.lIlIIIllllIlIIl(Inventory.contains((String[])stringArray12) ? 1 : 0)) {
                                AccBuilderRat.c = lIIIlllIIlIIl[lIIIlllIIlIlI[50]];
                                if (l.lIlIIIllllIllll(Players.getLocal().getWorldLocation().distanceTo(ch), lIIIlllIIlIlI[16])) {
                                    AccBuilderRat.c = lIIIlllIIlIIl[lIIIlllIIlIlI[51]];
                                    Movement.walkTo((WorldPoint)ch);
                                    0;
                                    Time.sleepTicks((int)lIIIlllIIlIlI[0]);
                                    0;
                                }
                                if (l.lIlIIIlllllIIII(Players.getLocal().getWorldLocation().distanceTo(ch), lIIIlllIIlIlI[16])) {
                                    g.a(lIIIlllIIlIIl[lIIIlllIIlIlI[52]], bW);
                                }
                            }
                        }
                        if (l.lIlIIIlllllIIIl(e.j(cm), lIIIlllIIlIlI[16])) {
                            if (l.lIlIIIllllIllll(Players.getLocal().getWorldLocation().distanceTo(cl), lIIIlllIIlIlI[11])) {
                                AccBuilderRat.c = lIIIlllIIlIIl[lIIIlllIIlIlI[53]];
                                Movement.walkTo((WorldPoint)cl);
                                0;
                                Time.sleepTicks((int)lIIIlllIIlIlI[0]);
                                0;
                            }
                            if (l.lIlIIIlllllIIII(Players.getLocal().getWorldLocation().distanceTo(cl), lIIIlllIIlIlI[11]) && l.lIlIIIllllIlIll(Players.getLocal().isMoving() ? 1 : 0) && l.lIlIIIllllIlIll(Dialog.isOpen() ? 1 : 0)) {
                                String[] stringArray = new String[lIIIlllIIlIlI[0]];
                                stringArray[l.lIIIlllIIlIlI[1]] = lIIIlllIIlIIl[lIIIlllIIlIlI[54]];
                                Inventory.getFirst((String[])stringArray).useOn(TileObjects.getNearest(tileObject -> {
                                    int n2;
                                    if (l.lIlIIIllllIlIIl(tileObject.getName().contains(lIIIlllIIlIIl[lIIIlllIIlIlI[90]]) ? 1 : 0) && l.lIlIIIlllllIIII(tileObject.getWorldLocation().distanceTo(cl), lIIIlllIIlIlI[11])) {
                                        n2 = lIIIlllIIlIlI[0];
                                        0;
                                        if (((0xED ^ 0xB6 ^ (0x60 ^ 0xC)) & (103 + 5 - 27 + 67 ^ 91 + 150 - 201 + 123 ^ -1)) < -1) {
                                            return ((0xCC ^ 0xAF ^ (0x63 ^ 0x2F)) & (0x42 ^ 0x16 ^ (0x66 ^ 0x1D) ^ -1)) != 0;
                                        }
                                    } else {
                                        n2 = lIIIlllIIlIlI[1];
                                    }
                                    return n2 != 0;
                                }));
                                Time.sleepTicks((int)lIIIlllIIlIlI[5]);
                                0;
                            }
                        }
                        if (l.lIlIIIlllllIIIl(e.j(cm), lIIIlllIIlIlI[12])) {
                            if (l.lIlIIIllllIlIll(Prayers.isEnabled((Prayer)Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                                Prayers.toggle((Prayer)Prayer.PROTECT_FROM_MELEE);
                            }
                            if (l.lIlIIIllllIlIll(i.U() ? 1 : 0)) {
                                i.V();
                            }
                            if (l.lIlIIIlllllIIlI(Players.getLocal().getInteracting())) {
                                String[] stringArray = new String[lIIIlllIIlIlI[0]];
                                stringArray[l.lIIIlllIIlIlI[1]] = lIIIlllIIlIIl[lIIIlllIIlIlI[55]];
                                if (l.lIlIIIllllIllIl(NPCs.getNearest((String[])stringArray))) {
                                    String[] stringArray13 = new String[lIIIlllIIlIlI[0]];
                                    stringArray13[l.lIIIlllIIlIlI[1]] = lIIIlllIIlIIl[lIIIlllIIlIlI[56]];
                                    NPCs.getNearest((String[])stringArray13).interact(lIIIlllIIlIIl[lIIIlllIIlIlI[57]]);
                                    Time.sleepTicks((int)lIIIlllIIlIlI[5]);
                                    0;
                                }
                            }
                        }
                        if (l.lIlIIIlllllIIIl(e.j(cm), lIIIlllIIlIlI[23]) && l.lIlIIIlllllIIlI(Players.getLocal().getInteracting())) {
                            g.a(lIIIlllIIlIIl[lIIIlllIIlIlI[58]], bW);
                        }
                        if (l.lIlIIIlllllIIIl(e.j(cm), lIIIlllIIlIlI[24])) {
                            if (l.lIlIIIllllIlIll(Prayers.isEnabled((Prayer)Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                                Prayers.toggle((Prayer)Prayer.PROTECT_FROM_MELEE);
                            }
                            if (l.lIlIIIllllIlIll(i.U() ? 1 : 0)) {
                                i.V();
                            }
                            String[] stringArray = new String[lIIIlllIIlIlI[0]];
                            stringArray[l.lIIIlllIIlIlI[1]] = lIIIlllIIlIIl[lIIIlllIIlIlI[2]];
                            if (l.lIlIIIllllIllIl(NPCs.getNearest((String[])stringArray))) {
                                String[] stringArray14 = new String[lIIIlllIIlIlI[0]];
                                stringArray14[l.lIIIlllIIlIlI[1]] = lIIIlllIIlIIl[lIIIlllIIlIlI[59]];
                                if (l.lIlIIIlllllIIII(NPCs.getNearest((String[])stringArray14).getWorldLocation().distanceTo(Players.getLocal().getWorldLocation()), lIIIlllIIlIlI[16])) {
                                    g.a(lIIIlllIIlIIl[lIIIlllIIlIlI[60]], bW);
                                }
                            }
                            if (l.lIlIIIlllllIIlI(Players.getLocal().getInteracting())) {
                                String[] stringArray15 = new String[lIIIlllIIlIlI[0]];
                                stringArray15[l.lIIIlllIIlIlI[1]] = lIIIlllIIlIIl[lIIIlllIIlIlI[61]];
                                if (l.lIlIIIllllIllIl(NPCs.getNearest((String[])stringArray15))) {
                                    String[] stringArray16 = new String[lIIIlllIIlIlI[0]];
                                    stringArray16[l.lIIIlllIIlIlI[1]] = lIIIlllIIlIIl[lIIIlllIIlIlI[62]];
                                    NPCs.getNearest((String[])stringArray16).interact(lIIIlllIIlIIl[lIIIlllIIlIlI[20]]);
                                    Time.sleepTicks((int)lIIIlllIIlIlI[5]);
                                    0;
                                }
                            }
                        }
                        if (l.lIlIIIlllllIIIl(e.j(cm), lIIIlllIIlIlI[18])) {
                            if (l.lIlIIIllllIlIll(Prayers.isEnabled((Prayer)Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                                Prayers.toggle((Prayer)Prayer.PROTECT_FROM_MELEE);
                            }
                            if (l.lIlIIIllllIlIll(i.U() ? 1 : 0)) {
                                i.V();
                            }
                            if (l.lIlIIIlllllIIlI(Players.getLocal().getInteracting())) {
                                String[] stringArray = new String[lIIIlllIIlIlI[0]];
                                stringArray[l.lIIIlllIIlIlI[1]] = lIIIlllIIlIIl[lIIIlllIIlIlI[63]];
                                if (l.lIlIIIllllIllIl(NPCs.getNearest((String[])stringArray))) {
                                    String[] stringArray17 = new String[lIIIlllIIlIlI[0]];
                                    stringArray17[l.lIIIlllIIlIlI[1]] = lIIIlllIIlIIl[lIIIlllIIlIlI[64]];
                                    NPCs.getNearest((String[])stringArray17).interact(lIIIlllIIlIIl[lIIIlllIIlIlI[65]]);
                                    Time.sleepTicks((int)lIIIlllIIlIlI[5]);
                                    0;
                                }
                            }
                        }
                        if (l.lIlIIIlllllIIll(e.j(cm), lIIIlllIIlIlI[25]) && !l.lIlIIIlllllIIIl(e.j(cm), lIIIlllIIlIlI[26])) break block83;
                        String[] stringArray = new String[lIIIlllIIlIlI[0]];
                        stringArray[l.lIIIlllIIlIlI[1]] = lIIIlllIIlIIl[lIIIlllIIlIlI[66]];
                        if (l.lIlIIIllllIllIl(NPCs.getNearest((String[])stringArray))) {
                            int[] nArray = new int[lIIIlllIIlIlI[0]];
                            nArray[l.lIIIlllIIlIlI[1]] = lIIIlllIIlIlI[13];
                            Inventory.getFirst((int[])nArray).interact(lIIIlllIIlIIl[lIIIlllIIlIlI[67]]);
                            Time.sleepTicks((int)lIIIlllIIlIlI[16]);
                            0;
                        }
                        var11 = new WorldPoint(lIIIlllIIlIlI[68], lIIIlllIIlIlI[69], lIIIlllIIlIlI[1]);
                        if (l.lIlIIIlllllIIII(Players.getLocal().getWorldLocation().distanceTo(b.I), lIIIlllIIlIlI[70]) && l.lIlIIIllllIllll(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)var11), lIIIlllIIlIlI[6])) {
                            AccBuilderRat.c = lIIIlllIIlIIl[lIIIlllIIlIlI[71]];
                            Movement.walkTo((WorldPoint)var11);
                            0;
                            Time.sleepTicks((int)lIIIlllIIlIlI[0]);
                            0;
                        }
                        if (l.lIlIIIlllllIIII(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)var11), lIIIlllIIlIlI[6]) && !l.lIlIIIlllllIIII(Players.getLocal().getWorldLocation().distanceTo(ch), lIIIlllIIlIlI[54])) break block84;
                        if (!l.lIlIIIllllIllll(Players.getLocal().getWorldLocation().distanceTo(cd), lIIIlllIIlIlI[16])) break block85;
                        String[] stringArray18 = new String[lIIIlllIIlIlI[0]];
                        stringArray18[l.lIIIlllIIlIlI[1]] = lIIIlllIIlIIl[lIIIlllIIlIlI[72]];
                        if (!l.lIlIIIlllllIIlI(NPCs.getNearest((String[])stringArray18)) || !l.lIlIIIllllIllll(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)var11), lIIIlllIIlIlI[70])) break block85;
                    }
                    WorldArea var22 = new WorldArea(lIIIlllIIlIlI[73], lIIIlllIIlIlI[74], lIIIlllIIlIlI[43], lIIIlllIIlIlI[37], lIIIlllIIlIlI[1]);
                    if (l.lIlIIIllllIlIlI(e.j(lIIIlllIIlIlI[75]), lIIIlllIIlIlI[24]) && l.lIlIIIllllIlIIl(Equipment.contains(item -> item.getName().contains(lIIIlllIIlIIl[lIIIlllIIlIlI[89]])) ? 1 : 0)) {
                        Equipment.getFirst(item -> item.getName().contains(lIIIlllIIlIIl[lIIIlllIIlIlI[88]])).interact(lIIIlllIIlIIl[lIIIlllIIlIlI[76]]);
                        Time.sleepTicks((int)lIIIlllIIlIlI[12]);
                        0;
                    }
                    if (l.lIlIIIllllIlIIl(var22.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        WorldPoint var14 = new WorldPoint(lIIIlllIIlIlI[77], lIIIlllIIlIlI[78], lIIIlllIIlIlI[1]);
                        Movement.walkTo((WorldPoint)var14);
                        0;
                        Time.sleepTicks((int)lIIIlllIIlIlI[0]);
                        0;
                    }
                    if (l.lIlIIIllllIlIll(var22.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        Movement.walkTo((WorldPoint)cd);
                        0;
                        Time.sleepTicks((int)lIIIlllIIlIlI[0]);
                        0;
                    }
                }
                if (l.lIlIIIlllllIIII(Players.getLocal().getWorldLocation().distanceTo(cd), lIIIlllIIlIlI[16])) {
                    g.a(lIIIlllIIlIIl[lIIIlllIIlIlI[79]], bW);
                }
            }
            if (l.lIlIIIllllIlllI(e.j(cm)) && l.lIlIIIllllIlIlI(e.j(cm), lIIIlllIIlIlI[27])) {
                cp = lIIIlllIIlIlI[0];
                co = lIIIlllIIlIlI[1];
            }
            if (l.lIlIIIlllllIIIl(e.j(cm), lIIIlllIIlIlI[27]) && l.lIlIIIllllIlIlI(co, lIIIlllIIlIlI[0]) && l.lIlIIIllllIlIIl(cp ? 1 : 0)) {
                P.iI += lIIIlllIIlIlI[0];
                P.d(AccBuilderRat.m);
                co += lIIIlllIIlIlI[0];
                P.iI = lIIIlllIIlIlI[1];
                cp = lIIIlllIIlIlI[1];
            }
            g.a(bW);
        }
    }

    private static void lIlIIIllllIlIII() {
        lIIIlllIIlIlI = new int[113];
        l.lIIIlllIIlIlI[0] = 1;
        l.lIIIlllIIlIlI[1] = (0x4E ^ 0x29 ^ (0x48 ^ 0x18)) & (89 + 74 - 139 + 112 ^ 97 + 82 - 56 + 68 ^ -1);
        l.lIIIlllIIlIlI[2] = 0xB5 ^ 0x98;
        l.lIIIlllIIlIlI[3] = 0x3C ^ 0x31;
        l.lIIIlllIIlIlI[4] = 0xFFFFB3FB & 0x5F8C;
        l.lIIIlllIIlIlI[5] = 2;
        l.lIIIlllIIlIlI[6] = 0x35 ^ 0x31;
        l.lIIIlllIIlIlI[7] = 0xFFFFAE2F & 0x53FE;
        l.lIIIlllIIlIlI[8] = -(0xFFFFEA6F & 0x7D97) & (0xFFFFEFFF & 0x7BEE);
        l.lIIIlllIIlIlI[9] = 0xFFFFDEBF & 0x236D;
        l.lIIIlllIIlIlI[10] = 0xFFFFE26B & 0x1FBE;
        l.lIIIlllIIlIlI[11] = 3;
        l.lIIIlllIIlIlI[12] = 0x73 ^ 0x75;
        l.lIIIlllIIlIlI[13] = -(0xFFFFBBD9 & 0x64A7) & (0xFFFFBFDF & 0x7FE7);
        l.lIIIlllIIlIlI[14] = 0xFFFFF7D5 & 0x397B;
        l.lIIIlllIIlIlI[15] = 0xFFFFA1B7 & 0x5FC9;
        l.lIIIlllIIlIlI[16] = 0x13 ^ 0x3A ^ (0xAC ^ 0x80);
        l.lIIIlllIIlIlI[17] = 0xFFFFBFAA & 0x49D7;
        l.lIIIlllIIlIlI[18] = 0xA4 ^ 0xAE;
        l.lIIIlllIIlIlI[19] = -(0xFFFFDFFF & 0x281D) & (0xFFFF8BFF & Short.MAX_VALUE);
        l.lIIIlllIIlIlI[20] = 0xC ^ 0x3E;
        l.lIIIlllIIlIlI[21] = 0x4D ^ 0x54;
        l.lIIIlllIIlIlI[22] = 0x35 ^ 0x3B ^ (0x8E ^ 0x87);
        l.lIIIlllIIlIlI[23] = 0xA5 ^ 0xAD;
        l.lIIIlllIIlIlI[24] = 115 + 201 - 221 + 108 ^ 170 + 63 - 86 + 47;
        l.lIIIlllIIlIlI[25] = 0x33 ^ 0x38;
        l.lIIIlllIIlIlI[26] = 0x22 ^ 0x7B ^ (0xED ^ 0xB8);
        l.lIIIlllIIlIlI[27] = 0x2B ^ 0x68 ^ (6 ^ 0x4B);
        l.lIIIlllIIlIlI[28] = 0x69 ^ 0x66;
        l.lIIIlllIIlIlI[29] = 0x9D ^ 0x8D;
        l.lIIIlllIIlIlI[30] = 0xA3 ^ 0xB2;
        l.lIIIlllIIlIlI[31] = 157 + 94 - 188 + 100 ^ 83 + 116 - 48 + 26;
        l.lIIIlllIIlIlI[32] = 92 + 127 - 119 + 31 ^ 97 + 89 - 78 + 36;
        l.lIIIlllIIlIlI[33] = 0x8F ^ 0x9B;
        l.lIIIlllIIlIlI[34] = 131 + 145 - 230 + 131 ^ 145 + 31 - 112 + 100;
        l.lIIIlllIIlIlI[35] = 122 + 170 - 183 + 100 ^ 138 + 1 - 33 + 93;
        l.lIIIlllIIlIlI[36] = 7 ^ 0x10;
        l.lIIIlllIIlIlI[37] = 0x7E ^ 0x66;
        l.lIIIlllIIlIlI[38] = 5 ^ 0x4E;
        l.lIIIlllIIlIlI[39] = 122 + 191 - 234 + 120 ^ 26 + 92 - -6 + 17;
        l.lIIIlllIIlIlI[40] = 0xFF ^ 0xA9 ^ (0xFA ^ 0xB6);
        l.lIIIlllIIlIlI[41] = 0x1D ^ 0x73 ^ (0x61 ^ 0x14);
        l.lIIIlllIIlIlI[42] = 0x81 ^ 0x9D;
        l.lIIIlllIIlIlI[43] = 0x39 ^ 0x24;
        l.lIIIlllIIlIlI[44] = 136 + 83 - 111 + 34 ^ 69 + 14 - 47 + 108;
        l.lIIIlllIIlIlI[45] = 0x79 ^ 0x66;
        l.lIIIlllIIlIlI[46] = 0x42 ^ 0x62;
        l.lIIIlllIIlIlI[47] = 0 ^ 0x52 ^ (0x7A ^ 9);
        l.lIIIlllIIlIlI[48] = 0x61 ^ 0x75 ^ (0x25 ^ 0x13);
        l.lIIIlllIIlIlI[49] = 0x31 ^ 0x4B ^ (0x2C ^ 0x75);
        l.lIIIlllIIlIlI[50] = 42 + 24 - -15 + 102 ^ 85 + 23 - -10 + 29;
        l.lIIIlllIIlIlI[51] = 0x71 ^ 0x47 ^ (0x9F ^ 0x8C);
        l.lIIIlllIIlIlI[52] = 0x5B ^ 0x7D;
        l.lIIIlllIIlIlI[53] = 42 + 137 - 39 + 50 ^ 133 + 6 - 75 + 89;
        l.lIIIlllIIlIlI[54] = 90 + 26 - -6 + 8 ^ 106 + 81 - 76 + 59;
        l.lIIIlllIIlIlI[55] = 0xA6 ^ 0x8F;
        l.lIIIlllIIlIlI[56] = 139 + 124 - 222 + 130 ^ 65 + 4 - -43 + 17;
        l.lIIIlllIIlIlI[57] = 0x45 ^ 0x6E;
        l.lIIIlllIIlIlI[58] = 0x93 ^ 0xBF;
        l.lIIIlllIIlIlI[59] = 0x5B ^ 0x75;
        l.lIIIlllIIlIlI[60] = 0x9D ^ 0x9B ^ (0x5B ^ 0x72);
        l.lIIIlllIIlIlI[61] = 0xA0 ^ 0xB4 ^ (0x1A ^ 0x3E);
        l.lIIIlllIIlIlI[62] = 0xE3 ^ 0xA2 ^ (0x3D ^ 0x4D);
        l.lIIIlllIIlIlI[63] = 0x59 ^ 0x38 ^ (0xD1 ^ 0x83);
        l.lIIIlllIIlIlI[64] = 27 + 5 - 15 + 122 ^ 117 + 7 - 117 + 184;
        l.lIIIlllIIlIlI[65] = 0x40 ^ 0x75;
        l.lIIIlllIIlIlI[66] = 0x8B ^ 0xA3 ^ (0x53 ^ 0x4D);
        l.lIIIlllIIlIlI[67] = 0x70 ^ 0x2C ^ (0xC1 ^ 0xAA);
        l.lIIIlllIIlIlI[68] = 0xFFFFEEF3 & 0x1D7C;
        l.lIIIlllIIlIlI[69] = 0xFFFFDDF3 & 0x2FBF;
        l.lIIIlllIIlIlI[70] = (0xBA ^ 0xA5) + (0xF6 ^ 0x9D) - (0x1C ^ 7) + (0x57 ^ 0x70);
        l.lIIIlllIIlIlI[71] = 0x91 ^ 0xA9;
        l.lIIIlllIIlIlI[72] = 0x68 ^ 0x4B ^ (0xA1 ^ 0xBB);
        l.lIIIlllIIlIlI[73] = 0xFFFFEDFF & 0x1B80;
        l.lIIIlllIIlIlI[74] = 0xFFFFCEFF & 0x3D07;
        l.lIIIlllIIlIlI[75] = 159 + 134 - 291 + 166 ^ 134 + 151 - 122 + 36;
        l.lIIIlllIIlIlI[76] = 0x54 ^ 0x19 ^ (0xFB ^ 0x8C);
        l.lIIIlllIIlIlI[77] = 0xFFFF99BB & 0x6FE5;
        l.lIIIlllIIlIlI[78] = 0xFFFFBDD1 & 0x4E2F;
        l.lIIIlllIIlIlI[79] = 0xA7 ^ 0x98 ^ (0x4B ^ 0x4F);
        l.lIIIlllIIlIlI[80] = 0xFFFFD578 & 0x2FFF;
        l.lIIIlllIIlIlI[81] = 0xFFFFAFFC & 0x7ECF;
        l.lIIIlllIIlIlI[82] = -(0xFFFFB79F & 0x4E77) & (0xFFFFE7BE & Short.MAX_VALUE);
        l.lIIIlllIIlIlI[83] = -(0xFFFFDB77 & 0x2CAF) & (0xFFFFFAFE & 0x3FEF);
        l.lIIIlllIIlIlI[84] = 0xFFFFEFB6 & 0x13CD;
        l.lIIIlllIIlIlI[85] = 0x38 ^ 0x4F ^ (0x25 ^ 0x36);
        l.lIIIlllIIlIlI[86] = 0x73 ^ 9 ^ (0x4B ^ 0xD);
        l.lIIIlllIIlIlI[87] = 1 + 82 - -4 + 94 ^ 54 + 79 - 103 + 106;
        l.lIIIlllIIlIlI[88] = 0x51 ^ 0x6F;
        l.lIIIlllIIlIlI[89] = 0x8A ^ 0xB5;
        l.lIIIlllIIlIlI[90] = 0x32 ^ 0x72;
        l.lIIIlllIIlIlI[91] = -(0xFFFFB579 & 0x5EF7) & (0xFFFF9FF7 & 0x7E7F);
        l.lIIIlllIIlIlI[92] = 0xFFFFFF7F & 0xCFE;
        l.lIIIlllIIlIlI[93] = 0xFFFFCAFA & 0x3F35;
        l.lIIIlllIIlIlI[94] = 0xFFFFBEFF & 0x4D75;
        l.lIIIlllIIlIlI[95] = 0xFFFFFEFD & 0xB37;
        l.lIIIlllIIlIlI[96] = 0xFFFFEC7F & 0x1FF6;
        l.lIIIlllIIlIlI[97] = -(0xFFFFF78B & 0x7D77) & (0xFFFFFFBA & 0x7F7F);
        l.lIIIlllIIlIlI[98] = 0xFFFFCDE7 & 0x3E7D;
        l.lIIIlllIIlIlI[99] = -(0xFFFFD5EF & 0x6A59) & (0xFFFFCE7F & 0x7BFF);
        l.lIIIlllIIlIlI[100] = -(0xFFFFFB9B & 0x657E) & (0xFFFFFFFF & 0x6D5F);
        l.lIIIlllIIlIlI[101] = -(0xFFFFFC7D & 0x73E7) & (0xFFFFFEFE & 0x7B7F);
        l.lIIIlllIIlIlI[102] = -(0xFFFFDF9B & 0x336F) & (0xFFFF9FCE & 0x7F7F);
        l.lIIIlllIIlIlI[103] = -(0xFFFFD4FE & 0x7FA3) & (0xFFFFDFB7 & 0x7EFB);
        l.lIIIlllIIlIlI[104] = 0xFFFFDFD8 & 0x2C6F;
        l.lIIIlllIIlIlI[105] = -(0xFFFFAAF7 & 0x7539) & (0xFFFFECFF & 0x3F77);
        l.lIIIlllIIlIlI[106] = 0xFFFFBE3F & 0x4BFA;
        l.lIIIlllIIlIlI[107] = 0xFFFF9FFF & 0x6C5F;
        l.lIIIlllIIlIlI[108] = 0xFFFF8ED3 & 0x7D6F;
        l.lIIIlllIIlIlI[109] = 0x78 ^ 0x72 ^ (0x11 ^ 0x5A);
        l.lIIIlllIIlIlI[110] = 0x48 ^ 0xA;
        l.lIIIlllIIlIlI[111] = 7 ^ 0x44;
        l.lIIIlllIIlIlI[112] = 0x75 ^ 0x1B ^ (0x65 ^ 0x4F);
    }

    @Override
    public boolean aa() {
        boolean bl;
        if (!l.lIlIIIlllllIlII(Quests.getState((Quest)Quest.FIGHT_ARENA), QuestState.FINISHED) || l.lIlIIIllllIllII(e.j(cm), lIIIlllIIlIlI[27])) {
            bl = lIIIlllIIlIlI[0];
            0;
            if (-2 >= 0) {
                return ((102 + 160 - 142 + 66 ^ 2 + 54 - 22 + 113) & (0x35 ^ 0x5D ^ (0x85 ^ 0xC4) ^ -1)) != 0;
            }
        } else {
            bl = lIIIlllIIlIlI[1];
        }
        return bl;
    }

    @Override
    public boolean X() {
        return lIIIlllIIlIlI[1];
    }

    private static boolean lIlIIIllllIllll(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIlIIIlllllIIIl(int n2, int n3) {
        return n2 == n3;
    }

    private static void W() {
        block35: {
            d var8;
            block34: {
                block33: {
                    block32: {
                        block31: {
                            block30: {
                                Object var23;
                                block29: {
                                    block28: {
                                        block27: {
                                            block26: {
                                                block25: {
                                                    block24: {
                                                        block23: {
                                                            block22: {
                                                                int[] nArray = new int[lIIIlllIIlIlI[0]];
                                                                nArray[l.lIIIlllIIlIlI[1]] = lIIIlllIIlIlI[9];
                                                                if (!l.lIlIIIllllIlIIl(Bank.contains((int[])nArray) ? 1 : 0)) break block22;
                                                                int[] nArray2 = new int[lIIIlllIIlIlI[0]];
                                                                nArray2[l.lIIIlllIIlIlI[1]] = lIIIlllIIlIlI[9];
                                                                if (!l.lIlIIIllllIlIIl(Bank.contains((int[])nArray2) ? 1 : 0)) break block23;
                                                                int[] nArray3 = new int[lIIIlllIIlIlI[0]];
                                                                nArray3[l.lIIIlllIIlIlI[1]] = lIIIlllIIlIlI[9];
                                                                if (!l.lIlIIIllllIlIlI(Bank.getFirst((int[])nArray3).getQuantity(), lIIIlllIIlIlI[8])) break block23;
                                                            }
                                                            var23 = new d(lIIIlllIIlIlI[9], lIIIlllIIlIlI[8], lIIIlllIIlIlI[18]);
                                                            bA.add((d)var23);
                                                            0;
                                                        }
                                                        int[] nArray = new int[lIIIlllIIlIlI[0]];
                                                        nArray[l.lIIIlllIIlIlI[1]] = lIIIlllIIlIlI[7];
                                                        if (!l.lIlIIIllllIlIIl(Bank.contains((int[])nArray) ? 1 : 0)) break block24;
                                                        int[] nArray4 = new int[lIIIlllIIlIlI[0]];
                                                        nArray4[l.lIIIlllIIlIlI[1]] = lIIIlllIIlIlI[7];
                                                        if (!l.lIlIIIllllIlIIl(Bank.contains((int[])nArray4) ? 1 : 0)) break block25;
                                                        int[] nArray5 = new int[lIIIlllIIlIlI[0]];
                                                        nArray5[l.lIIIlllIIlIlI[1]] = lIIIlllIIlIlI[7];
                                                        if (!l.lIlIIIllllIlIlI(Bank.getFirst((int[])nArray5).getQuantity(), lIIIlllIIlIlI[8])) break block25;
                                                    }
                                                    var23 = new d(lIIIlllIIlIlI[7], lIIIlllIIlIlI[8], lIIIlllIIlIlI[18]);
                                                    bA.add((d)var23);
                                                    0;
                                                }
                                                int[] nArray = new int[lIIIlllIIlIlI[0]];
                                                nArray[l.lIIIlllIIlIlI[1]] = lIIIlllIIlIlI[10];
                                                if (!l.lIlIIIllllIlIIl(Bank.contains((int[])nArray) ? 1 : 0)) break block26;
                                                int[] nArray6 = new int[lIIIlllIIlIlI[0]];
                                                nArray6[l.lIIIlllIIlIlI[1]] = lIIIlllIIlIlI[10];
                                                if (!l.lIlIIIllllIlIIl(Bank.contains((int[])nArray6) ? 1 : 0)) break block27;
                                                int[] nArray7 = new int[lIIIlllIIlIlI[0]];
                                                nArray7[l.lIIIlllIIlIlI[1]] = lIIIlllIIlIlI[10];
                                                if (!l.lIlIIIllllIlIlI(Bank.getFirst((int[])nArray7).getQuantity(), lIIIlllIIlIlI[8])) break block27;
                                            }
                                            var23 = new d(lIIIlllIIlIlI[10], lIIIlllIIlIlI[8], lIIIlllIIlIlI[18]);
                                            bA.add((d)var23);
                                            0;
                                        }
                                        int[] nArray = new int[lIIIlllIIlIlI[0]];
                                        nArray[l.lIIIlllIIlIlI[1]] = lIIIlllIIlIlI[15];
                                        if (!l.lIlIIIllllIlIIl(Bank.contains((int[])nArray) ? 1 : 0)) break block28;
                                        int[] nArray8 = new int[lIIIlllIIlIlI[0]];
                                        nArray8[l.lIIIlllIIlIlI[1]] = lIIIlllIIlIlI[15];
                                        if (!l.lIlIIIllllIlIIl(Bank.contains((int[])nArray8) ? 1 : 0)) break block29;
                                        int[] nArray9 = new int[lIIIlllIIlIlI[0]];
                                        nArray9[l.lIIIlllIIlIlI[1]] = lIIIlllIIlIlI[15];
                                        if (!l.lIlIIIllllIlIlI(Bank.getFirst((int[])nArray9).getQuantity(), lIIIlllIIlIlI[28])) break block29;
                                    }
                                    var23 = new d(lIIIlllIIlIlI[15], lIIIlllIIlIlI[33], lIIIlllIIlIlI[80]);
                                    bA.add((d)var23);
                                    0;
                                }
                                if (l.lIlIIIllllIlIll(Bank.contains((Predicate)(var23 = item -> item.getName().toLowerCase().contains(lIIIlllIIlIIl[lIIIlllIIlIlI[87]]))) ? 1 : 0)) {
                                    var8 = new d(lIIIlllIIlIlI[81], lIIIlllIIlIlI[16], lIIIlllIIlIlI[82]);
                                    bA.add(var8);
                                    0;
                                }
                                int[] nArray = new int[lIIIlllIIlIlI[0]];
                                nArray[l.lIIIlllIIlIlI[1]] = lIIIlllIIlIlI[14];
                                if (!l.lIlIIIllllIlIIl(Bank.contains((int[])nArray) ? 1 : 0)) break block30;
                                int[] nArray10 = new int[lIIIlllIIlIlI[0]];
                                nArray10[l.lIIIlllIIlIlI[1]] = lIIIlllIIlIlI[14];
                                if (!l.lIlIIIllllIlIIl(Bank.contains((int[])nArray10) ? 1 : 0)) break block31;
                                int[] nArray11 = new int[lIIIlllIIlIlI[0]];
                                nArray11[l.lIIIlllIIlIlI[1]] = lIIIlllIIlIlI[14];
                                if (!l.lIlIIIllllIlIlI(Bank.getFirst((int[])nArray11).getQuantity(), lIIIlllIIlIlI[6])) break block31;
                            }
                            var8 = new d(lIIIlllIIlIlI[14], lIIIlllIIlIlI[6], h.bv);
                            bA.add(var8);
                            0;
                        }
                        int[] nArray = new int[lIIIlllIIlIlI[0]];
                        nArray[l.lIIIlllIIlIlI[1]] = lIIIlllIIlIlI[17];
                        if (!l.lIlIIIllllIlIIl(Bank.contains((int[])nArray) ? 1 : 0)) break block32;
                        int[] nArray12 = new int[lIIIlllIIlIlI[0]];
                        nArray12[l.lIIIlllIIlIlI[1]] = lIIIlllIIlIlI[17];
                        if (!l.lIlIIIllllIlIIl(Bank.contains((int[])nArray12) ? 1 : 0)) break block33;
                        int[] nArray13 = new int[lIIIlllIIlIlI[0]];
                        nArray13[l.lIIIlllIIlIlI[1]] = lIIIlllIIlIlI[17];
                        if (!l.lIlIIIllllIlIlI(Bank.getFirst((int[])nArray13).getQuantity(), lIIIlllIIlIlI[5])) break block33;
                    }
                    var8 = new d(lIIIlllIIlIlI[17], lIIIlllIIlIlI[11], lIIIlllIIlIlI[83]);
                    bA.add(var8);
                    0;
                }
                int[] nArray = new int[lIIIlllIIlIlI[0]];
                nArray[l.lIIIlllIIlIlI[1]] = lIIIlllIIlIlI[13];
                if (!l.lIlIIIllllIlIIl(Bank.contains((int[])nArray) ? 1 : 0)) break block34;
                int[] nArray14 = new int[lIIIlllIIlIlI[0]];
                nArray14[l.lIIIlllIIlIlI[1]] = lIIIlllIIlIlI[13];
                if (!l.lIlIIIllllIlIIl(Bank.contains((int[])nArray14) ? 1 : 0)) break block35;
                int[] nArray15 = new int[lIIIlllIIlIlI[0]];
                nArray15[l.lIIIlllIIlIlI[1]] = lIIIlllIIlIlI[13];
                if (!l.lIlIIIllllIlIlI(Bank.getFirst((int[])nArray15).getQuantity(), lIIIlllIIlIlI[28])) break block35;
            }
            var8 = new d(lIIIlllIIlIlI[13], lIIIlllIIlIlI[54], lIIIlllIIlIlI[84]);
            bA.add(var8);
            0;
        }
    }

    @Override
    public int Y() {
        try {
            l.ar();
            0;
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (((0x34 ^ 0x78) & ~(0x74 ^ 0x38)) == (0x42 ^ 0x46)) {
            return (0xEF ^ 0xBB) & ~(0x38 ^ 0x6C);
        }
        return lIIIlllIIlIlI[85];
    }

    @Override
    public String Z() {
        return lIIIlllIIlIIl[lIIIlllIIlIlI[86]];
    }

    private static boolean lIlIIIllllIlIlI(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIlIIIlllllIIlI(Object object) {
        return object == null;
    }

    private static String lIlIIIllllIIlII(String var26, String var19) {
        var26 = new String(Base64.getDecoder().decode(var26.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var25 = new StringBuilder();
        char[] var6 = var19.toCharArray();
        int var7 = lIIIlllIIlIlI[1];
        char[] var3 = var26.toCharArray();
        int var2 = var3.length;
        int var21 = lIIIlllIIlIlI[1];
        while (l.lIlIIIllllIlIlI(var21, var2)) {
            char var13 = var3[var21];
            var25.append((char)(var13 ^ var6[var7 % var6.length]));
            0;
            ++var7;
            ++var21;
            0;
            if ((1 & ~1) == ((0x7C ^ 0x6D) & ~(5 ^ 0x14))) continue;
            return null;
        }
        return String.valueOf(var25);
    }

    private static String lIlIIIllllIIllI(String var5, String var16) {
        try {
            SecretKeySpec var4 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var16.getBytes(StandardCharsets.UTF_8)), lIIIlllIIlIlI[23]), "DES");
            Cipher var1 = Cipher.getInstance("DES");
            var1.init(lIIIlllIIlIlI[5], var4);
            return new String(var1.doFinal(Base64.getDecoder().decode(var5.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var17) {
            var17.printStackTrace();
            return null;
        }
    }
}

