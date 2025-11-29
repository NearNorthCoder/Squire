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
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.J;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.W;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.a;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.ag;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.an;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.b;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.d;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.e;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.f;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.g;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.i;
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

public class B
implements W {
    static /* synthetic */ boolean cm;
    public static final /* synthetic */ WorldPoint dG;
    private static /* synthetic */ String[] bR;
    public static final /* synthetic */ WorldPoint dF;
    public static /* synthetic */ List<d> bv;
    private static /* synthetic */ int[] lIIIlIlll;
    private static /* synthetic */ String[] lIIIlIlIl;
    public static /* synthetic */ boolean bt;
    static /* synthetic */ int cl;

    private static boolean lllIIllllll(Object object) {
        return object == null;
    }

    private static boolean lllIIllllII(int n2) {
        return n2 > 0;
    }

    private static boolean lllIIlllIll(Object object) {
        return object != null;
    }

    private static boolean lllIIllIlll(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lllIlIIIIII(Object object, Object object2) {
        return object == object2;
    }

    public static void bt() {
        String[] stringArray = new String[lIIIlIlll[3]];
        stringArray[B.lIIIlIlll[4]] = lIIIlIlIl[lIIIlIlll[46]];
        if (B.lllIIllllll(NPCs.getNearest((String[])stringArray))) {
            if (B.lllIIllllIl(Players.getLocal().getWorldLocation().distanceTo(dF), lIIIlIlll[12])) {
                if (B.lllIIlllIIl(Dialog.isOpen() ? 1 : 0)) {
                    Dialog.close();
                }
                Movement.walkTo((WorldPoint)dF);
                0;
                Time.sleepTicks((int)lIIIlIlll[3]);
                0;
            }
            if (B.lllIIlllllI(Players.getLocal().getWorldLocation().distanceTo(dF), lIIIlIlll[12])) {
                AccBuilderEasyClues.c = lIIIlIlIl[lIIIlIlll[47]];
                String[] stringArray2 = new String[lIIIlIlll[3]];
                stringArray2[B.lIIIlIlll[4]] = lIIIlIlIl[lIIIlIlll[48]];
                TileObjects.getNearest((String[])stringArray2).interact(lIIIlIlIl[lIIIlIlll[0]]);
                Time.sleepTicks((int)lIIIlIlll[1]);
                0;
            }
        }
    }

    private static boolean lllIIlllIII(int n2, int n3) {
        return n2 >= n3;
    }

    private static void lllIIllIlII() {
        lIIIlIlIl = new String[lIIIlIlll[21]];
        B.lIIIlIlIl[B.lIIIlIlll[4]] = B."Finished buying items, switching back to quest";
        B.lIIIlIlIl[B.lIIIlIlll[3]] = B."Nav to bank";
        B.lIIIlIlIl[B.lIIIlIlll[1]] = B."Handling banking";
        B.lIIIlIlIl[B.lIIIlIlll[12]] = B."We are missing quest supplies, switching to BUYING";
        B.lIIIlIlIl[B.lIIIlIlll[7]] = B."Drink";
        B.lIIIlIlIl[B.lIIIlIlll[15]] = B."Nav to start";
        B.lIIIlIlIl[B.lIIIlIlll[17]] = B."Handling dialog";
        B.lIIIlIlIl[B.lIIIlIlll[8]] = B."Cook";
        B.lIIIlIlIl[B.lIIIlIlll[23]] = B."Dirty blast";
        B.lIIIlIlIl[B.lIIIlIlll[24]] = B."Nav to rotten tomato";
        B.lIIIlIlIl[B.lIIIlIlll[2]] = B."Wear";
        B.lIIIlIlIl[B.lIIIlIlll[30]] = B."PvP Arena";
        B.lIIIlIlIl[B.lIIIlIlll[31]] = B."Getting tomato";
        B.lIIIlIlIl[B.lIIIlIlll[33]] = B."Fadli";
        B.lIIIlIlIl[B.lIIIlIlll[34]] = B."Buy";
        B.lIIIlIlIl[B.lIIIlIlll[36]] = B."Buy 1";
        B.lIIIlIlIl[B.lIIIlIlll[35]] = B."Close";
        B.lIIIlIlIl[B.lIIIlIlll[37]] = B."Dirty blast";
        B.lIIIlIlIl[B.lIIIlIlll[38]] = B."Close";
        B.lIIIlIlIl[B.lIIIlIlll[39]] = B."Fruit blast";
        B.lIIIlIlIl[B.lIIIlIlll[40]] = B."Dirty blast";
        B.lIIIlIlIl[B.lIIIlIlll[41]] = B."Wear";
        B.lIIIlIlIl[B.lIIIlIlll[42]] = B."Handling dialog";
        B.lIIIlIlIl[B.lIIIlIlll[43]] = B."Cook";
        B.lIIIlIlIl[B.lIIIlIlll[44]] = B."Door";
        B.lIIIlIlIl[B.lIIIlIlll[45]] = B."Open";
        B.lIIIlIlIl[B.lIIIlIlll[46]] = B."Aris";
        B.lIIIlIlIl[B.lIIIlIlll[47]] = B."Entering room";
        B.lIIIlIlIl[B.lIIIlIlll[48]] = B."Door";
        B.lIIIlIlIl[B.lIIIlIlll[0]] = B."Open";
        B.lIIIlIlIl[B.lIIIlIlll[49]] = B."Eye of newt";
        B.lIIIlIlIl[B.lIIIlIlll[50]] = B."Fruit blast";
        B.lIIIlIlIl[B.lIIIlIlll[58]] = B."RFD start quest";
        B.lIIIlIlIl[B.lIIIlIlll[59]] = B."ring of wealth (";
        B.lIIIlIlIl[B.lIIIlIlll[60]] = B."dueling";
        B.lIIIlIlIl[B.lIIIlIlll[61]] = B."dueling";
        B.lIIIlIlIl[B.lIIIlIlll[62]] = B."dueling";
        B.lIIIlIlIl[B.lIIIlIlll[63]] = B."dueling";
        B.lIIIlIlIl[B.lIIIlIlll[64]] = B."dueling";
        B.lIIIlIlIl[B.lIIIlIlll[65]] = B."dueling";
        B.lIIIlIlIl[B.lIIIlIlll[56]] = B."dueling";
        B.lIIIlIlIl[B.lIIIlIlll[66]] = B."dueling";
        B.lIIIlIlIl[B.lIIIlIlll[71]] = B."Can you make me a cake?";
        B.lIIIlIlIl[B.lIIIlIlll[72]] = B."I'm always happy to help a cook in distress.";
        B.lIIIlIlIl[B.lIIIlIlll[73]] = B."Actually, I know where to find this stuff.";
        B.lIIIlIlIl[B.lIIIlIlll[74]] = B."Yes.";
        B.lIIIlIlIl[B.lIIIlIlll[75]] = B."What's wrong?";
        B.lIIIlIlIl[B.lIIIlIlll[76]] = B."Do you have any other quests for me?";
        B.lIIIlIlIl[B.lIIIlIlll[77]] = B."Angry! It makes me angry!";
        B.lIIIlIlIl[B.lIIIlIlll[78]] = B."What seems to be the problem?";
    }

    private static String lllIIlIlllI(String lIIIlllIlIlIlll, String lIIIlllIlIlIllI) {
        try {
            SecretKeySpec lIIIlllIlIlllII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIIIlllIlIlIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIIIlllIlIllIll = Cipher.getInstance("Blowfish");
            lIIIlllIlIllIll.init(lIIIlIlll[1], lIIIlllIlIlllII);
            return new String(lIIIlllIlIllIll.doFinal(Base64.getDecoder().decode(lIIIlllIlIlIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIIIlllIlIllIlI) {
            lIIIlllIlIllIlI.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean V() {
        boolean bl;
        if (B.lllIlIIIIII(Quests.getState((Quest)Quest.RECIPE_FOR_DISASTER__ANOTHER_COOKS_QUEST), QuestState.FINISHED)) {
            bl = lIIIlIlll[3];
            0;
            if (3 == ((0x6E ^ 0x61) & ~(0xBB ^ 0xB4))) {
                return ((0xF2 ^ 0xB4) & ~(0x11 ^ 0x57)) != 0;
            }
        } else {
            bl = lIIIlIlll[4];
        }
        return bl;
    }

    private static String lllIIllIIII(String lIIIlllIlllllII, String lIIIlllIlllllIl) {
        try {
            SecretKeySpec lIIIllllIIIIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIIIlllIlllllIl.getBytes(StandardCharsets.UTF_8)), lIIIlIlll[23]), "DES");
            Cipher lIIIllllIIIIIII = Cipher.getInstance("DES");
            lIIIllllIIIIIII.init(lIIIlIlll[1], lIIIllllIIIIIIl);
            return new String(lIIIllllIIIIIII.doFinal(Base64.getDecoder().decode(lIIIlllIlllllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIIIlllIlllllll) {
            lIIIlllIlllllll.printStackTrace();
            return null;
        }
    }

    @Override
    public int T() {
        try {
            System.out.println("678: " + e.j(lIIIlIlll[5]));
            B.bs();
            0;
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (null != null) {
            return (0x48 ^ 0xD) & ~(0x4B ^ 0xE);
        }
        return lIIIlIlll[57];
    }

    private static boolean lllIIlllllI(int n2, int n3) {
        return n2 <= n3;
    }

    public static void bs() {
        if (B.lllIIllIllI(e.j(lIIIlIlll[0]), lIIIlIlll[1])) {
            J.cc();
        }
        if (B.lllIIllIllI(Skills.getLevel((Skill)Skill.COOKING), lIIIlIlll[2]) && B.lllIIllIlll(e.j(lIIIlIlll[0]), lIIIlIlll[1])) {
            ag.dG();
        }
        if (B.lllIIlllIII(Skills.getLevel((Skill)Skill.COOKING), lIIIlIlll[2]) && B.lllIIllIlll(e.j(lIIIlIlll[0]), lIIIlIlll[1])) {
            if (B.lllIIlllIIl(bt ? 1 : 0)) {
                b.a(bv);
                if (B.lllIIllIllI(bv.size(), lIIIlIlll[3])) {
                    System.out.println(lIIIlIlIl[lIIIlIlll[4]]);
                    bt = lIIIlIlll[4];
                }
            }
            if (B.lllIIlllIlI(bt ? 1 : 0)) {
                BankLocation lIIIllllIIIllII;
                if (B.lllIIlllIlI(B.ab() ? 1 : 0) && B.lllIIlllIlI(e.j(lIIIlIlll[5]))) {
                    lIIIllllIIIllII = BankLocation.getNearest();
                    if (B.lllIIlllIll(lIIIllllIIIllII) && B.lllIIlllIlI(lIIIllllIIIllII.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderEasyClues.c = lIIIlIlIl[lIIIlIlll[3]];
                        a.a(lIIIllllIIIllII);
                    }
                    if (B.lllIIlllIll(lIIIllllIIIllII) && B.lllIIlllIIl(lIIIllllIIIllII.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        if (B.lllIIlllIlI(Bank.isOpen() ? 1 : 0)) {
                            a.a();
                            Time.sleepUntil(() -> Bank.isOpen(), (int)lIIIlIlll[6]);
                            0;
                        }
                        if (B.lllIIlllIIl(Bank.isOpen() ? 1 : 0)) {
                            AccBuilderEasyClues.c = lIIIlIlIl[lIIIlIlll[1]];
                            if (B.lllIIllllII(Inventory.getAll().size())) {
                                Bank.depositInventory();
                                Time.sleepTicks((int)lIIIlIlll[7]);
                                0;
                            }
                            if (B.lllIIllllII(Equipment.getAll().size())) {
                                Bank.depositEquipment();
                                Time.sleepTicks((int)lIIIlIlll[1]);
                                0;
                            }
                            int[] nArray = new int[lIIIlIlll[8]];
                            nArray[B.lIIIlIlll[4]] = lIIIlIlll[9];
                            nArray[B.lIIIlIlll[3]] = lIIIlIlll[10];
                            nArray[B.lIIIlIlll[1]] = lIIIlIlll[11];
                            nArray[B.lIIIlIlll[12]] = lIIIlIlll[13];
                            nArray[B.lIIIlIlll[7]] = lIIIlIlll[14];
                            nArray[B.lIIIlIlll[15]] = lIIIlIlll[16];
                            nArray[B.lIIIlIlll[17]] = lIIIlIlll[18];
                            if (B.lllIIlllIlI(e.b(nArray) ? 1 : 0)) {
                                B.af();
                                System.out.println(lIIIlIlIl[lIIIlIlll[12]]);
                                bt = lIIIlIlll[3];
                                return;
                            }
                            int[] nArray2 = new int[lIIIlIlll[8]];
                            nArray2[B.lIIIlIlll[4]] = lIIIlIlll[9];
                            nArray2[B.lIIIlIlll[3]] = lIIIlIlll[10];
                            nArray2[B.lIIIlIlll[1]] = lIIIlIlll[11];
                            nArray2[B.lIIIlIlll[12]] = lIIIlIlll[13];
                            nArray2[B.lIIIlIlll[7]] = lIIIlIlll[14];
                            nArray2[B.lIIIlIlll[15]] = lIIIlIlll[16];
                            nArray2[B.lIIIlIlll[17]] = lIIIlIlll[18];
                            if (B.lllIIlllIIl(e.b(nArray2) ? 1 : 0)) {
                                a.a(lIIIlIlll[9], lIIIlIlll[2]);
                                a.a(lIIIlIlll[10], lIIIlIlll[2]);
                                a.a(lIIIlIlll[11], lIIIlIlll[3]);
                                a.a(lIIIlIlll[13], lIIIlIlll[3]);
                                a.a(lIIIlIlll[14], lIIIlIlll[3]);
                                a.a(lIIIlIlll[16], lIIIlIlll[3]);
                                a.a(lIIIlIlll[18], lIIIlIlll[3]);
                                a.a(lIIIlIlll[19], lIIIlIlll[1]);
                                a.a(lIIIlIlll[20], lIIIlIlll[6]);
                            }
                        }
                    }
                }
                if (B.lllIIlllIIl(Inventory.contains((int[])f.aV) ? 1 : 0) && B.lllIIllIllI(Movement.getRunEnergy(), lIIIlIlll[21])) {
                    Inventory.getFirst((int[])f.aV).interact(lIIIlIlIl[lIIIlIlll[7]]);
                    Time.sleepTicks((int)lIIIlIlll[3]);
                    0;
                }
                if (B.lllIIlllIlI(e.j(lIIIlIlll[5])) && B.lllIIlllIIl(B.ab() ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIIIlIlIl[lIIIlIlll[15]];
                    if (B.lllIIllllIl(Players.getLocal().getWorldLocation().distanceTo(dF), lIIIlIlll[12])) {
                        if (B.lllIIlllIIl(Dialog.isOpen() ? 1 : 0)) {
                            Dialog.close();
                        }
                        Movement.walkTo((WorldPoint)dF);
                        0;
                        Time.sleepTicks((int)lIIIlIlll[3]);
                        0;
                    }
                    if (B.lllIIlllllI(Players.getLocal().getWorldLocation().distanceTo(dF), lIIIlIlll[12])) {
                        AccBuilderEasyClues.c = lIIIlIlIl[lIIIlIlll[17]];
                        g.a(lIIIlIlIl[lIIIlIlll[8]], bR);
                    }
                }
                if (B.lllIIllIlll(e.j(lIIIlIlll[5]), lIIIlIlll[3])) {
                    int[] nArray = new int[lIIIlIlll[3]];
                    nArray[B.lIIIlIlll[4]] = lIIIlIlll[22];
                    if (B.lllIIlllIlI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        String[] stringArray = new String[lIIIlIlll[3]];
                        stringArray[B.lIIIlIlll[4]] = lIIIlIlIl[lIIIlIlll[23]];
                        if (B.lllIIlllIlI(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                            cl = lIIIlIlll[4];
                            if (B.lllIIllllIl(Players.getLocal().getWorldLocation().distanceTo(dG), lIIIlIlll[7])) {
                                AccBuilderEasyClues.c = lIIIlIlIl[lIIIlIlll[24]];
                                lIIIllllIIIllII = new WorldArea(lIIIlIlll[25], lIIIlIlll[26], lIIIlIlll[27], lIIIlIlll[28], lIIIlIlll[4]);
                                if (B.lllIIlllIlI(lIIIllllIIIllII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    if (B.lllIIlllIIl(Inventory.contains(item -> item.getName().contains(lIIIlIlIl[lIIIlIlll[66]])) ? 1 : 0) && B.lllIIlllIlI(Equipment.contains(item -> item.getName().contains(lIIIlIlIl[lIIIlIlll[56]])) ? 1 : 0)) {
                                        Inventory.getFirst(item -> item.getName().contains(lIIIlIlIl[lIIIlIlll[65]])).interact(lIIIlIlIl[lIIIlIlll[2]]);
                                    }
                                    if (B.lllIIlllIIl(Equipment.contains(item -> item.getName().contains(lIIIlIlIl[lIIIlIlll[64]])) ? 1 : 0) && B.lllIIllIlll(Players.getLocal().getAnimation(), lIIIlIlll[29])) {
                                        Equipment.getFirst(item -> item.getName().contains(lIIIlIlIl[lIIIlIlll[63]])).interact(lIIIlIlIl[lIIIlIlll[30]]);
                                        Time.sleepTicks((int)lIIIlIlll[7]);
                                        0;
                                    }
                                }
                                if (B.lllIIlllIIl(lIIIllllIIIllII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    Movement.walkTo((WorldPoint)dG);
                                    0;
                                    Time.sleepTicks((int)lIIIlIlll[3]);
                                    0;
                                }
                            }
                            if (B.lllIIlllllI(Players.getLocal().getWorldLocation().distanceTo(dG), lIIIlIlll[7])) {
                                AccBuilderEasyClues.c = lIIIlIlIl[lIIIlIlll[31]];
                                if (B.lllIIlllIIl(Widgets.get((int)lIIIlIlll[32]).isEmpty() ? 1 : 0)) {
                                    String[] stringArray2 = new String[lIIIlIlll[3]];
                                    stringArray2[B.lIIIlIlll[4]] = lIIIlIlIl[lIIIlIlll[33]];
                                    NPCs.getNearest((String[])stringArray2).interact(lIIIlIlIl[lIIIlIlll[34]]);
                                    Time.sleepTicks((int)lIIIlIlll[12]);
                                    0;
                                }
                                if (B.lllIIlllIlI(Widgets.get((int)lIIIlIlll[32]).isEmpty() ? 1 : 0)) {
                                    Widgets.get((int)lIIIlIlll[32], (int)lIIIlIlll[35], (int)lIIIlIlll[3]).interact(lIIIlIlIl[lIIIlIlll[36]]);
                                    Time.sleepTicks((int)lIIIlIlll[1]);
                                    0;
                                }
                                int[] nArray3 = new int[lIIIlIlll[3]];
                                nArray3[B.lIIIlIlll[4]] = lIIIlIlll[22];
                                if (B.lllIIlllIIl(Inventory.contains((int[])nArray3) ? 1 : 0) && B.lllIIlllIlI(Widgets.get((int)lIIIlIlll[32]).isEmpty() ? 1 : 0)) {
                                    Widgets.get((int)lIIIlIlll[32], (int)lIIIlIlll[3], (int)lIIIlIlll[30]).interact(lIIIlIlIl[lIIIlIlll[35]]);
                                    Time.sleepTicks((int)lIIIlIlll[3]);
                                    0;
                                }
                            }
                        }
                    }
                    int[] nArray4 = new int[lIIIlIlll[3]];
                    nArray4[B.lIIIlIlll[4]] = lIIIlIlll[22];
                    if (B.lllIIlllIIl(Inventory.contains((int[])nArray4) ? 1 : 0)) {
                        String[] stringArray = new String[lIIIlIlll[3]];
                        stringArray[B.lIIIlIlll[4]] = lIIIlIlIl[lIIIlIlll[37]];
                        if (B.lllIIlllIlI(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                            int[] nArray5 = new int[lIIIlIlll[3]];
                            nArray5[B.lIIIlIlll[4]] = lIIIlIlll[22];
                            if (B.lllIIlllIIl(Inventory.contains((int[])nArray5) ? 1 : 0) && B.lllIIlllIlI(Widgets.get((int)lIIIlIlll[32]).isEmpty() ? 1 : 0)) {
                                Widgets.get((int)lIIIlIlll[32], (int)lIIIlIlll[3], (int)lIIIlIlll[30]).interact(lIIIlIlIl[lIIIlIlll[38]]);
                                Time.sleepTicks((int)lIIIlIlll[3]);
                                0;
                            }
                            int[] nArray6 = new int[lIIIlIlll[3]];
                            nArray6[B.lIIIlIlll[4]] = lIIIlIlll[18];
                            String[] stringArray3 = new String[lIIIlIlll[3]];
                            stringArray3[B.lIIIlIlll[4]] = lIIIlIlIl[lIIIlIlll[39]];
                            Inventory.getFirst((int[])nArray6).useOn(Inventory.getFirst((String[])stringArray3));
                            Time.sleepTicks((int)lIIIlIlll[1]);
                            0;
                        }
                    }
                    String[] stringArray = new String[lIIIlIlll[3]];
                    stringArray[B.lIIIlIlll[4]] = lIIIlIlIl[lIIIlIlll[40]];
                    if (B.lllIIlllIIl(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                        if (B.lllIIllllIl(Players.getLocal().getWorldLocation().distanceTo(dF), lIIIlIlll[12])) {
                            if (B.lllIIlllIIl(Dialog.isOpen() ? 1 : 0)) {
                                Dialog.close();
                            }
                            if (B.lllIIlllIIl(Inventory.contains(item -> item.getName().contains(lIIIlIlIl[lIIIlIlll[62]])) ? 1 : 0) && B.lllIIlllIlI(Equipment.contains(item -> item.getName().contains(lIIIlIlIl[lIIIlIlll[61]])) ? 1 : 0)) {
                                Inventory.getFirst(item -> item.getName().contains(lIIIlIlIl[lIIIlIlll[60]])).interact(lIIIlIlIl[lIIIlIlll[41]]);
                                Time.sleepTicks((int)lIIIlIlll[1]);
                                0;
                            }
                            Movement.walkTo((WorldPoint)dF);
                            0;
                            Time.sleepTicks((int)lIIIlIlll[3]);
                            0;
                        }
                        if (B.lllIIlllllI(Players.getLocal().getWorldLocation().distanceTo(dF), lIIIlIlll[12])) {
                            AccBuilderEasyClues.c = lIIIlIlIl[lIIIlIlll[42]];
                            if (B.lllIIllIllI(cl, lIIIlIlll[3])) {
                                an.om += lIIIlIlll[3];
                                an.o(AccBuilderEasyClues.m);
                                cl += lIIIlIlll[3];
                                an.om = lIIIlIlll[4];
                                cm = lIIIlIlll[4];
                            }
                            g.a(lIIIlIlIl[lIIIlIlll[43]], bR);
                        }
                    }
                }
                if (B.lllIIllIlll(e.j(lIIIlIlll[5]), lIIIlIlll[1])) {
                    String[] stringArray = new String[lIIIlIlll[3]];
                    stringArray[B.lIIIlIlll[4]] = lIIIlIlIl[lIIIlIlll[44]];
                    TileObjects.getNearest((String[])stringArray).interact(lIIIlIlIl[lIIIlIlll[45]]);
                    Time.sleepTicks((int)lIIIlIlll[1]);
                    0;
                }
            }
        }
    }

    private static boolean lllIIllllIl(int n2, int n3) {
        return n2 > n3;
    }

    private static String lllIIlIllll(String lIIIlllIllIlIIl, String lIIIlllIllIlIII) {
        lIIIlllIllIlIIl = new String(Base64.getDecoder().decode(lIIIlllIllIlIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lIIIlllIllIllII = new StringBuilder();
        char[] lIIIlllIllIlIll = lIIIlllIllIlIII.toCharArray();
        int lIIIlllIllIlIlI = lIIIlIlll[4];
        char[] lIIIlllIllIIlII = lIIIlllIllIlIIl.toCharArray();
        int lIIIlllIllIIIll = lIIIlllIllIIlII.length;
        int lIIIlllIllIIIlI = lIIIlIlll[4];
        while (B.lllIIllIllI(lIIIlllIllIIIlI, lIIIlllIllIIIll)) {
            char lIIIlllIllIllll = lIIIlllIllIIlII[lIIIlllIllIIIlI];
            lIIIlllIllIllII.append((char)(lIIIlllIllIllll ^ lIIIlllIllIlIll[lIIIlllIllIlIlI % lIIIlllIllIlIll.length]));
            0;
            ++lIIIlllIllIlIlI;
            ++lIIIlllIllIIIlI;
            0;
            if (((0x63 ^ 0x5E ^ (0xDE ^ 0xBA)) & (0x7B ^ 0xF ^ (0x63 ^ 0x4E) ^ -1)) == 0) continue;
            return null;
        }
        return String.valueOf(lIIIlllIllIllII);
    }

    private static boolean lllIIllIllI(int n2, int n3) {
        return n2 < n3;
    }

    private static void af() {
        block16: {
            d lIIIllllIIIlIII;
            block15: {
                Object lIIIllllIIIlIIl;
                block14: {
                    block13: {
                        int[] nArray = new int[lIIIlIlll[3]];
                        nArray[B.lIIIlIlll[4]] = lIIIlIlll[19];
                        if (B.lllIIlllIlI(Bank.contains((int[])nArray) ? 1 : 0)) {
                            d d2 = new d(lIIIlIlll[19], lIIIlIlll[2], i.bq);
                            bv.add(d2);
                            0;
                        }
                        int[] nArray2 = new int[lIIIlIlll[3]];
                        nArray2[B.lIIIlIlll[4]] = lIIIlIlll[11];
                        if (B.lllIIlllIlI(Bank.contains((int[])nArray2) ? 1 : 0)) {
                            lIIIllllIIIlIIl = new d(lIIIlIlll[11], lIIIlIlll[3], lIIIlIlll[51]);
                            bv.add((d)lIIIllllIIIlIIl);
                            0;
                        }
                        int[] nArray3 = new int[lIIIlIlll[3]];
                        nArray3[B.lIIIlIlll[4]] = lIIIlIlll[14];
                        if (B.lllIIlllIlI(Bank.contains((int[])nArray3) ? 1 : 0)) {
                            lIIIllllIIIlIIl = new d(lIIIlIlll[14], lIIIlIlll[3], lIIIlIlll[51]);
                            bv.add((d)lIIIllllIIIlIIl);
                            0;
                        }
                        int[] nArray4 = new int[lIIIlIlll[3]];
                        nArray4[B.lIIIlIlll[4]] = lIIIlIlll[18];
                        if (B.lllIIlllIlI(Bank.contains((int[])nArray4) ? 1 : 0)) {
                            lIIIllllIIIlIIl = new d(lIIIlIlll[18], lIIIlIlll[3], lIIIlIlll[51]);
                            bv.add((d)lIIIllllIIIlIIl);
                            0;
                        }
                        int[] nArray5 = new int[lIIIlIlll[3]];
                        nArray5[B.lIIIlIlll[4]] = lIIIlIlll[16];
                        if (B.lllIIlllIlI(Bank.contains((int[])nArray5) ? 1 : 0)) {
                            lIIIllllIIIlIIl = new d(lIIIlIlll[16], lIIIlIlll[3], lIIIlIlll[51]);
                            bv.add((d)lIIIllllIIIlIIl);
                            0;
                        }
                        int[] nArray6 = new int[lIIIlIlll[3]];
                        nArray6[B.lIIIlIlll[4]] = lIIIlIlll[13];
                        if (B.lllIIlllIlI(Bank.contains((int[])nArray6) ? 1 : 0)) {
                            lIIIllllIIIlIIl = new d(lIIIlIlll[13], lIIIlIlll[3], lIIIlIlll[52]);
                            bv.add((d)lIIIllllIIIlIIl);
                            0;
                        }
                        int[] nArray7 = new int[lIIIlIlll[3]];
                        nArray7[B.lIIIlIlll[4]] = lIIIlIlll[10];
                        if (!B.lllIIlllIIl(Bank.contains((int[])nArray7) ? 1 : 0)) break block13;
                        int[] nArray8 = new int[lIIIlIlll[3]];
                        nArray8[B.lIIIlIlll[4]] = lIIIlIlll[10];
                        if (!B.lllIIlllIIl(Bank.contains((int[])nArray8) ? 1 : 0)) break block14;
                        int[] nArray9 = new int[lIIIlIlll[3]];
                        nArray9[B.lIIIlIlll[4]] = lIIIlIlll[10];
                        if (!B.lllIIllIllI(Bank.getFirst((int[])nArray9).getQuantity(), lIIIlIlll[2])) break block14;
                    }
                    lIIIllllIIIlIIl = new d(lIIIlIlll[10], lIIIlIlll[2], lIIIlIlll[53]);
                    bv.add((d)lIIIllllIIIlIIl);
                    0;
                }
                if (B.lllIIlllIlI(Bank.contains((Predicate)(lIIIllllIIIlIIl = item -> item.getName().toLowerCase().contains(lIIIlIlIl[lIIIlIlll[59]]))) ? 1 : 0)) {
                    lIIIllllIIIlIII = new d(lIIIlIlll[54], lIIIlIlll[15], lIIIlIlll[55]);
                    bv.add(lIIIllllIIIlIII);
                    0;
                }
                int[] nArray = new int[lIIIlIlll[3]];
                nArray[B.lIIIlIlll[4]] = lIIIlIlll[9];
                if (!B.lllIIlllIIl(Bank.contains((int[])nArray) ? 1 : 0)) break block15;
                int[] nArray10 = new int[lIIIlIlll[3]];
                nArray10[B.lIIIlIlll[4]] = lIIIlIlll[9];
                if (!B.lllIIlllIIl(Bank.contains((int[])nArray10) ? 1 : 0)) break block16;
                int[] nArray11 = new int[lIIIlIlll[3]];
                nArray11[B.lIIIlIlll[4]] = lIIIlIlll[9];
                if (!B.lllIIllIllI(Bank.getFirst((int[])nArray11).getQuantity(), lIIIlIlll[2])) break block16;
            }
            lIIIllllIIIlIII = new d(lIIIlIlll[9], lIIIlIlll[56], lIIIlIlll[52]);
            bv.add(lIIIllllIIIlIII);
            0;
        }
    }

    private static void lllIIllIlIl() {
        lIIIlIlll = new int[79];
        B.lIIIlIlll[0] = 0x1A ^ 7;
        B.lIIIlIlll[1] = 2;
        B.lIIIlIlll[2] = 0x3E ^ 0x3B ^ (0x2D ^ 0x22);
        B.lIIIlIlll[3] = 1;
        B.lIIIlIlll[4] = (0x8D ^ 0xAD) & ~(0x11 ^ 0x31);
        B.lIIIlIlll[5] = 0xFFFFE6B6 & 0x1BEF;
        B.lIIIlIlll[6] = 0xFFFFBFBE & 0x53C9;
        B.lIIIlIlll[7] = 26 + 98 - 107 + 113 ^ 74 + 36 - 49 + 73;
        B.lIIIlIlll[8] = 2 + 139 - 89 + 145 ^ 128 + 3 - 94 + 157;
        B.lIIIlIlll[9] = 0xFFFF9FEF & 0x7F57;
        B.lIIIlIlll[10] = -(60 + 110 - 40 + 3) & (0xFFFFBFED & 0x5FDE);
        B.lIIIlIlll[11] = -(0xFFFFFC9B & 0x4766) & (0xFFFFEFFB & 0x5DFD);
        B.lIIIlIlll[12] = 3;
        B.lIIIlIlll[13] = 39 + 80 - -38 + 64;
        B.lIIIlIlll[14] = -(0xFFFFE5BB & 0x7A45) & (0xFFFFF7F5 & 0x6F7F);
        B.lIIIlIlll[15] = 1 ^ (0xBC ^ 0xB8);
        B.lIIIlIlll[16] = 0xFFFFDA25 & 0x2DFE;
        B.lIIIlIlll[17] = 0x96 ^ 0x90;
        B.lIIIlIlll[18] = -(0xFFFFED6D & 0x72B7) & (0xFFFFF77F & 0x6AF4);
        B.lIIIlIlll[19] = 0xFFFFF5FF & 0x3B51;
        B.lIIIlIlll[20] = 0xFFFFCFE3 & 0x33FF;
        B.lIIIlIlll[21] = 0xF1 ^ 0xBA ^ (0x36 ^ 0x4F);
        B.lIIIlIlll[22] = -(0xFFFFE6BA & 0x1F47) & (0xFFFFCFD7 & 0x3FFF);
        B.lIIIlIlll[23] = 0xB2 ^ 0xBA;
        B.lIIIlIlll[24] = 0x5E ^ 0x28 ^ 47 + 21 - -54 + 5;
        B.lIIIlIlll[25] = -(0xFFFFA523 & 0x7BDF) & (0xFFFFADDF & Short.MAX_VALUE);
        B.lIIIlIlll[26] = -(0xFFFFAAAB & 0x57DE) & (0xFFFFFFFF & 0xEFF);
        B.lIIIlIlll[27] = 0x5C ^ 0x2A;
        B.lIIIlIlll[28] = 117 + 103 - 176 + 93;
        B.lIIIlIlll[29] = -1;
        B.lIIIlIlll[30] = 0x45 ^ 0x4E;
        B.lIIIlIlll[31] = 0xBE ^ 0xB2;
        B.lIIIlIlll[32] = 0xFFFFB57F & 0x4BAC;
        B.lIIIlIlll[33] = 0xD4 ^ 0xB5 ^ (0xE4 ^ 0x88);
        B.lIIIlIlll[34] = 0x76 ^ 0 ^ (6 ^ 0x7E);
        B.lIIIlIlll[35] = 176 + 157 - 237 + 92 ^ 160 + 56 - 180 + 136;
        B.lIIIlIlll[36] = 0x13 ^ 0x1C;
        B.lIIIlIlll[37] = 0x61 ^ 0x41 ^ (0x7F ^ 0x4E);
        B.lIIIlIlll[38] = 0x17 ^ 0x2D ^ (0x93 ^ 0xBB);
        B.lIIIlIlll[39] = 0xF4 ^ 0xC3 ^ (0x32 ^ 0x16);
        B.lIIIlIlll[40] = 0xB2 ^ 0xA6;
        B.lIIIlIlll[41] = 98 + 114 - 157 + 90 ^ 84 + 55 - 18 + 11;
        B.lIIIlIlll[42] = 0x55 ^ 0x43;
        B.lIIIlIlll[43] = 88 + 31 - 88 + 97 ^ 100 + 46 - 6 + 11;
        B.lIIIlIlll[44] = 93 + 74 - 130 + 146 ^ 118 + 25 - 37 + 69;
        B.lIIIlIlll[45] = 0x4A ^ 0x53;
        B.lIIIlIlll[46] = 126 + 53 - 27 + 17 ^ 109 + 66 - 158 + 162;
        B.lIIIlIlll[47] = 0x41 ^ 0x60 ^ (9 ^ 0x33);
        B.lIIIlIlll[48] = 4 ^ 0x18;
        B.lIIIlIlll[49] = 0x32 ^ 0x2C;
        B.lIIIlIlll[50] = 0x90 ^ 0x8F;
        B.lIIIlIlll[51] = 0xFFFFA3BA & 0x7F6D;
        B.lIIIlIlll[52] = 0xFFFF8BFD & 0x7786;
        B.lIIIlIlll[53] = 0xFFFFC7FE & 0x3F6D;
        B.lIIIlIlll[54] = -(0xFFFFD1BF & 0x7E64) & (0xFFFFFEFF & 0x7FEF);
        B.lIIIlIlll[55] = -(0xFFFF95F1 & 0x7A5F) & (0xFFFFFBFA & 0x75FD);
        B.lIIIlIlll[56] = 0x79 ^ 0x7C ^ (0xAA ^ 0x87);
        B.lIIIlIlll[57] = 63 + 148 - 185 + 137 ^ 198 + 127 - 130 + 4;
        B.lIIIlIlll[58] = 0x9F ^ 0x88 ^ (0x1E ^ 0x29);
        B.lIIIlIlll[59] = 0x54 ^ 0x75;
        B.lIIIlIlll[60] = 0x37 ^ 0x15;
        B.lIIIlIlll[61] = 0x90 ^ 0xB3;
        B.lIIIlIlll[62] = 75 + 51 - 1 + 18 ^ 12 + 142 - 72 + 89;
        B.lIIIlIlll[63] = 0x33 ^ 0x16;
        B.lIIIlIlll[64] = 0xB6 ^ 0x90;
        B.lIIIlIlll[65] = 0x1E ^ 0x39;
        B.lIIIlIlll[66] = 0x22 ^ 0xB;
        B.lIIIlIlll[67] = -(0xFFFFEB3B & 0x36ED) & (0xFFFFEFAF & 0x3EFF);
        B.lIIIlIlll[68] = -(0xFFFFF46F & 0x3BF1) & (0xFFFFFFEF & 0x3CFE);
        B.lIIIlIlll[69] = 0xFFFFCD3E & 0x3FF7;
        B.lIIIlIlll[70] = -(0xFFFFFF9F & 0x736D) & (0xFFFFFFCF & Short.MAX_VALUE);
        B.lIIIlIlll[71] = 0x47 ^ 0x72 ^ (0xBD ^ 0xA2);
        B.lIIIlIlll[72] = 0xA5 ^ 0x8E;
        B.lIIIlIlll[73] = 63 + 139 - 42 + 9 ^ 25 + 33 - -28 + 47;
        B.lIIIlIlll[74] = 0x74 ^ 0x59;
        B.lIIIlIlll[75] = 0x11 ^ 0x3F;
        B.lIIIlIlll[76] = 0x1F ^ 0x30;
        B.lIIIlIlll[77] = 0x1A ^ 0x2A;
        B.lIIIlIlll[78] = 63 + 12 - -80 + 33 ^ 62 + 115 - 172 + 136;
    }

    @Override
    public String U() {
        return lIIIlIlIl[lIIIlIlll[58]];
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean ab() {
        int n2;
        String[] stringArray = new String[lIIIlIlll[3]];
        stringArray[B.lIIIlIlll[4]] = lIIIlIlIl[lIIIlIlll[49]];
        if (B.lllIIllllII(Inventory.getCount((String[])stringArray))) {
            int[] nArray = new int[lIIIlIlll[3]];
            nArray[B.lIIIlIlll[4]] = lIIIlIlll[14];
            if (B.lllIIllllII(Inventory.getCount((int[])nArray))) {
                String[] stringArray2 = new String[lIIIlIlll[3]];
                stringArray2[B.lIIIlIlll[4]] = lIIIlIlIl[lIIIlIlll[50]];
                if (B.lllIIlllIIl(Inventory.contains((String[])stringArray2) ? 1 : 0)) {
                    int[] nArray2 = new int[lIIIlIlll[3]];
                    nArray2[B.lIIIlIlll[4]] = lIIIlIlll[18];
                    if (B.lllIIlllIIl(Inventory.contains((int[])nArray2) ? 1 : 0)) {
                        int[] nArray3 = new int[lIIIlIlll[3]];
                        nArray3[B.lIIIlIlll[4]] = lIIIlIlll[11];
                        if (B.lllIIlllIIl(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                            n2 = lIIIlIlll[3];
                            0;
                            if (1 >= 0) return n2 != 0;
                            return (1 & (1 ^ -1)) != 0;
                        }
                    }
                }
            }
        }
        n2 = lIIIlIlll[4];
        return n2 != 0;
    }

    @Override
    public boolean S() {
        return lIIIlIlll[4];
    }

    static {
        B.lllIIllIlIl();
        B.lllIIllIlII();
        dF = new WorldPoint(lIIIlIlll[67], lIIIlIlll[68], lIIIlIlll[4]);
        dG = new WorldPoint(lIIIlIlll[69], lIIIlIlll[70], lIIIlIlll[4]);
        bv = new ArrayList<d>();
        String[] stringArray = new String[lIIIlIlll[23]];
        stringArray[B.lIIIlIlll[4]] = lIIIlIlIl[lIIIlIlll[71]];
        stringArray[B.lIIIlIlll[3]] = lIIIlIlIl[lIIIlIlll[72]];
        stringArray[B.lIIIlIlll[1]] = lIIIlIlIl[lIIIlIlll[73]];
        stringArray[B.lIIIlIlll[12]] = lIIIlIlIl[lIIIlIlll[74]];
        stringArray[B.lIIIlIlll[7]] = lIIIlIlIl[lIIIlIlll[75]];
        stringArray[B.lIIIlIlll[15]] = lIIIlIlIl[lIIIlIlll[76]];
        stringArray[B.lIIIlIlll[17]] = lIIIlIlIl[lIIIlIlll[77]];
        stringArray[B.lIIIlIlll[8]] = lIIIlIlIl[lIIIlIlll[78]];
        bR = stringArray;
    }

    private static boolean lllIIlllIIl(int n2) {
        return n2 != 0;
    }

    private static boolean lllIIlllIlI(int n2) {
        return n2 == 0;
    }
}

