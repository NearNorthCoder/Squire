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
package gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks;

import gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks.HHelper;
import gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks.AHelper;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.ab;
import gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks.AQHelper;
import gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks.ASHelper;
import gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks.BHelper;
import gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks.DHelper;
import gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks.EHelper;
import gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks.FHelper;
import gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks.GHelper;
import gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks.JHelper;
import gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks.MHelper;
import gg.squire.account.AccBuilderGWD;
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

public class AHelper
implements ab {
    public static final  WorldPoint ea;
    public static final  WorldPoint dV;
    public static final  WorldPoint dZ;
    public static final  WorldPoint dW;
    public static final  WorldPoint dT;
    public static  List<d> bx;
    public static final  WorldPoint eb;
    static  int dk;
    public static final  WorldPoint dY;

    public static  boolean bv;
    static  boolean dl;
    public static final  WorldPoint dX;
    
    static  int ec;
    public static final  WorldPoint dU;
    static  WorldArea ed;

        return String.valueOf(llIllIlIlllIl);
    }

    /*
     * WARNING - void declaration
     */
    private static boolean an() {
        void llIllIlllIIll;
        int[] nArray = new int[lllIllIII[12]];
        nArray[A.lllIllIII[1]] = lllIllIII[13];
        nArray[A.lllIllIII[0]] = lllIllIII[7];
        nArray[A.lllIllIII[5]] = lllIllIII[10];
        nArray[A.lllIllIII[11]] = lllIllIII[14];
        nArray[A.lllIllIII[6]] = lllIllIII[15];
        nArray[A.lllIllIII[16]] = lllIllIII[17];
        int[] nArray2 = nArray;
        int llIllIlllIIlI = lllIllIII[1];
        while (A.llIIIlllllll(llIllIlllIIlI, ((void)llIllIlllIIll).length)) {
            int[] nArray3 = new int[lllIllIII[0]];
            nArray3[A.lllIllIII[1]] = llIllIlllIIll[llIllIlllIIlI];
            if (A.llIIlIIIIIII(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                return lllIllIII[1];
            }
            ++llIllIlllIIlI;

            if (((0x11 ^ 0x77 ^ (0x79 ^ 3)) & (0xEB ^ 0x80 ^ (0x59 ^ 0x2E) ^ -1)) > -1) continue;
            return ((0x54 ^ 0x5D ^ (0xB8 ^ 0x9F)) & (119 + 61 - 104 + 74 ^ 122 + 177 - 132 + 17 ^ -1)) != 0;
        }
        return lllIllIII[0];
    }

    private static boolean llIIlIIIlIII(int n2, int n3) {
        return n2 != n3;
    }

    private static void llIIIlllllII() {
        lllIlIlll = new String[lllIllIII[112]];
        A.lllIlIlll[A.lllIllIII[1]] = "Finished buying items, switching back to quest";
        A.lllIlIlll[A.lllIllIII[0]] = "Nav to bank";
        A.lllIlIlll[A.lllIllIII[5]] = "Handling banking";
        A.lllIlIlll[A.lllIllIII[11]] = "We are missing runes, switching to BUYING";
        A.lllIlIlll[A.lllIllIII[6]] = "We are missing quest supplies, switching to BUYING";
        A.lllIlIlll[A.lllIllIII[16]] = "Drink";
        A.lllIlIlll[A.lllIllIII[12]] = "Drink";
        A.lllIlIlll[A.lllIllIII[22]] = "Nav to start";
        A.lllIlIlll[A.lllIllIII[23]] = "Lady Servil";
        A.lllIlIlll[A.lllIllIII[24]] = "Nav to armour";
        A.lllIlIlll[A.lllIllIII[18]] = "Getting armour";
        A.lllIlIlll[A.lllIllIII[25]] = "Door";
        A.lllIlIlll[A.lllIllIII[26]] = "Open";
        A.lllIlIlll[A.lllIllIII[3]] = "Chest";
        A.lllIlIlll[A.lllIllIII[27]] = "Door";
        A.lllIlIlll[A.lllIllIII[28]] = "Open";
        A.lllIlIlll[A.lllIllIII[29]] = "Chest";
        A.lllIlIlll[A.lllIllIII[30]] = "Chest";
        A.lllIlIlll[A.lllIllIII[31]] = "Open";
        A.lllIlIlll[A.lllIllIII[32]] = "Chest";
        A.lllIlIlll[A.lllIllIII[33]] = "Open";
        A.lllIlIlll[A.lllIllIII[34]] = "Chest";
        A.lllIlIlll[A.lllIllIII[35]] = "Search";
        A.lllIlIlll[A.lllIllIII[36]] = "Chest";
        A.lllIlIlll[A.lllIllIII[37]] = "Search";
        A.lllIlIlll[A.lllIllIII[21]] = "Wear";
        A.lllIlIlll[A.lllIllIII[40]] = "Wear";
        A.lllIlIlll[A.lllIllIII[41]] = "Nav to jail";
        A.lllIlIlll[A.lllIllIII[42]] = "Door";
        A.lllIlIlll[A.lllIllIII[43]] = "Open";
        A.lllIlIlll[A.lllIllIII[44]] = "Nav to guard";
        A.lllIlIlll[A.lllIllIII[45]] = "Head Guard";
        A.lllIlIlll[A.lllIllIII[46]] = "Khali brew";
        A.lllIlIlll[A.lllIllIII[47]] = "Nav to brew";
        A.lllIlIlll[A.lllIllIII[48]] = "Khazard Barman";
        A.lllIlIlll[A.lllIllIII[49]] = "Khali brew";
        A.lllIlIlll[A.lllIllIII[50]] = "Nav to guard";
        A.lllIlIlll[A.lllIllIII[51]] = "Nav to guard";
        A.lllIlIlll[A.lllIllIII[52]] = "Head Guard";
        A.lllIlIlll[A.lllIllIII[53]] = "Nav to  sammy";
        A.lllIlIlll[A.lllIllIII[54]] = "Khazard cell keys";
        A.lllIlIlll[A.lllIllIII[55]] = "Khazard Ogre";
        A.lllIlIlll[A.lllIllIII[56]] = "Khazard Ogre";
        A.lllIlIlll[A.lllIllIII[57]] = "Attack";
        A.lllIlIlll[A.lllIllIII[58]] = "Sammy Servil";
        A.lllIlIlll[A.lllIllIII[2]] = "Hengrad";
        A.lllIlIlll[A.lllIllIII[59]] = "Hengrad";
        A.lllIlIlll[A.lllIllIII[60]] = "Hengrad";
        A.lllIlIlll[A.lllIllIII[61]] = "Khazard Scorpion";
        A.lllIlIlll[A.lllIllIII[62]] = "Khazard Scorpion";
        A.lllIlIlll[A.lllIllIII[20]] = "Attack";
        A.lllIlIlll[A.lllIllIII[63]] = "Bouncer";
        A.lllIlIlll[A.lllIllIII[64]] = "Bouncer";
        A.lllIlIlll[A.lllIllIII[65]] = "Attack";
        A.lllIlIlll[A.lllIllIII[66]] = "General Khazard";
        A.lllIlIlll[A.lllIllIII[67]] = "Break";
        A.lllIlIlll[A.lllIllIII[71]] = "Nav to start";
        A.lllIlIlll[A.lllIllIII[72]] = "General Khazard";
        A.lllIlIlll[A.lllIllIII[76]] = "Castle Wars";
        A.lllIlIlll[A.lllIllIII[79]] = "Lady Servil";
        A.lllIlIlll[A.lllIllIII[86]] = "Fight Arena";
        A.lllIlIlll[A.lllIllIII[87]] = "ring of wealth (";
        A.lllIlIlll[A.lllIllIII[88]] = "dueling";
        A.lllIlIlll[A.lllIllIII[89]] = "dueling";
        A.lllIlIlll[A.lllIllIII[90]] = "Prison Gate";
        A.lllIlIlll[A.lllIllIII[109]] = "Can I help you?";
        A.lllIlIlll[A.lllIllIII[110]] = "I'd like a Khali Brew please.";
        A.lllIlIlll[A.lllIllIII[111]] = "Yes.";
    }

    private static boolean llIIIllllllI(int n2) {
        return n2 != 0;
    }

    static {
        A.llIIIlllllIl();
        A.llIIIlllllII();
        dT = new WorldPoint(lllIllIII[91], lllIllIII[92], lllIllIII[1]);
        dU = new WorldPoint(lllIllIII[93], lllIllIII[94], lllIllIII[1]);
        dV = new WorldPoint(lllIllIII[95], lllIllIII[96], lllIllIII[1]);
        dW = new WorldPoint(lllIllIII[97], lllIllIII[98], lllIllIII[1]);
        dX = new WorldPoint(lllIllIII[99], lllIllIII[100], lllIllIII[1]);
        dY = new WorldPoint(lllIllIII[101], lllIllIII[102], lllIllIII[1]);
        dZ = new WorldPoint(lllIllIII[103], lllIllIII[104], lllIllIII[1]);
        ea = new WorldPoint(lllIllIII[91], lllIllIII[105], lllIllIII[1]);
        eb = new WorldPoint(lllIllIII[106], lllIllIII[107], lllIllIII[1]);
        bx = new ArrayList<d>();
        ec = lllIllIII[30];
        ed = new WorldArea(lllIllIII[93], lllIllIII[108], lllIllIII[26], lllIllIII[47], lllIllIII[1]);
        String[] stringArray = new String[lllIllIII[11]];
        stringArray[A.lllIllIII[1]] = lllIlIlll[lllIllIII[109]];
        stringArray[A.lllIllIII[0]] = lllIlIlll[lllIllIII[110]];
        stringArray[A.lllIllIII[5]] = lllIlIlll[lllIllIII[111]];
        cG = stringArray;
    }

    private static boolean llIIIlllllll(int n2, int n3) {
        return n2 < n3;
    }

    @Override
    public boolean ah() {
        boolean bl;
        if (!A.llIIlIIIlIIl(Quests.getState((Quest)Quest.FIGHT_ARENA), QuestState.FINISHED) || A.llIIlIIIIIIl(e.j(ec), lllIllIII[27])) {
            bl = lllIllIII[0];

            if (((0x7D ^ 0x4E) & ~(0x6D ^ 0x5E) & ~((0x86 ^ 0x8B) & ~(0x6C ^ 0x61))) >= 1) {
                return false;
            }
        } else {
            bl = lllIllIII[1];
        }
        return bl;
    }

    private static boolean llIIlIIIIlII(int n2, int n3) {
        return n2 > n3;
    }

    public static void bq() {
        block76: {
            block82: {
                block84: {
                    block83: {
                        BankLocation llIllIllllIII;
                        block77: {
                            block81: {
                                block79: {
                                    block80: {
                                        block78: {
                                            if (A.llIIIllllllI(bv ? 1 : 0)) {
                                                b.a(bx);
                                                if (A.llIIIlllllll(bx.size(), lllIllIII[0])) {
                                                    System.out.println(lllIlIlll[lllIllIII[1]]);
                                                    bv = lllIllIII[1];
                                                }
                                            }
                                            if (!A.llIIlIIIIIII(bv ? 1 : 0)) break block76;
                                            if (A.llIIIlllllll(Skills.getLevel((Skill)Skill.PRAYER), lllIllIII[2])) {
                                                aq.ea();
                                            }
                                            if (A.llIIlIIIIIIl(Skills.getLevel((Skill)Skill.PRAYER), lllIllIII[2]) && A.llIIIlllllll(Skills.getLevel((Skill)Skill.MAGIC), lllIllIII[3])) {
                                                m.ak();
                                            }
                                            if (!A.llIIlIIIIIII(A.an() ? 1 : 0) || !A.llIIIlllllll(e.j(ec), lllIllIII[0]) || !A.llIIlIIIIIIl(Skills.getLevel((Skill)Skill.PRAYER), lllIllIII[2]) || !A.llIIlIIIIIIl(Skills.getLevel((Skill)Skill.MAGIC), lllIllIII[3])) break block77;
                                            llIllIllllIII = BankLocation.getNearest();
                                            if (A.llIIlIIIIIlI(llIllIllllIII) && A.llIIlIIIIIII(llIllIllllIII.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                                AccBuilderGWD.c = lllIlIlll[lllIllIII[0]];
                                                a.a(llIllIllllIII);
                                            }
                                            if (!A.llIIlIIIIIlI(llIllIllllIII) || !A.llIIIllllllI(llIllIllllIII.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block77;
                                            if (A.llIIlIIIIIII(Bank.isOpen() ? 1 : 0)) {
                                                a.a();
                                                Time.sleepUntil(() -> Bank.isOpen(), (int)lllIllIII[4]);

                                            }
                                            if (!A.llIIIllllllI(Bank.isOpen() ? 1 : 0)) break block77;
                                            AccBuilderGWD.c = lllIlIlll[lllIllIII[5]];
                                            if (A.llIIlIIIIIll(Inventory.getAll().size())) {
                                                Bank.depositInventory();
                                                Time.sleepTicks((int)lllIllIII[6]);

                                            }
                                            if (A.llIIlIIIIIll(Equipment.getAll().size())) {
                                                Bank.depositEquipment();
                                                Time.sleepTicks((int)lllIllIII[5]);

                                            }
                                            int[] nArray = new int[lllIllIII[0]];
                                            nArray[A.lllIllIII[1]] = lllIllIII[7];
                                            if (!A.llIIIllllllI(Bank.contains((int[])nArray) ? 1 : 0)) break block78;
                                            int[] nArray2 = new int[lllIllIII[0]];
                                            nArray2[A.lllIllIII[1]] = lllIllIII[7];
                                            if (!A.llIIlIIIIIIl(Bank.getFirst((int[])nArray2).getQuantity(), lllIllIII[8])) break block79;
                                        }
                                        int[] nArray = new int[lllIllIII[0]];
                                        nArray[A.lllIllIII[1]] = lllIllIII[9];
                                        if (!A.llIIIllllllI(Bank.contains((int[])nArray) ? 1 : 0)) break block80;
                                        int[] nArray3 = new int[lllIllIII[0]];
                                        nArray3[A.lllIllIII[1]] = lllIllIII[9];
                                        if (!A.llIIlIIIIIIl(Bank.getFirst((int[])nArray3).getQuantity(), lllIllIII[8])) break block79;
                                    }
                                    int[] nArray = new int[lllIllIII[0]];
                                    nArray[A.lllIllIII[1]] = lllIllIII[10];
                                    if (!A.llIIIllllllI(Bank.contains((int[])nArray) ? 1 : 0)) break block81;
                                    int[] nArray4 = new int[lllIllIII[0]];
                                    nArray4[A.lllIllIII[1]] = lllIllIII[10];
                                    if (!A.llIIIlllllll(Bank.getFirst((int[])nArray4).getQuantity(), lllIllIII[8])) break block81;
                                }
                                A.Q();
                                System.out.println(lllIlIlll[lllIllIII[11]]);
                                bv = lllIllIII[0];
                                return;
                            }
                            int[] nArray = new int[lllIllIII[12]];
                            nArray[A.lllIllIII[1]] = lllIllIII[13];
                            nArray[A.lllIllIII[0]] = lllIllIII[7];
                            nArray[A.lllIllIII[5]] = lllIllIII[10];
                            nArray[A.lllIllIII[11]] = lllIllIII[14];
                            nArray[A.lllIllIII[6]] = lllIllIII[15];
                            nArray[A.lllIllIII[16]] = lllIllIII[17];
                            if (A.llIIlIIIIIII(e.d(nArray) ? 1 : 0)) {
                                A.Q();
                                System.out.println(lllIlIlll[lllIllIII[6]]);
                                bv = lllIllIII[0];
                                return;
                            }
                            int[] nArray5 = new int[lllIllIII[12]];
                            nArray5[A.lllIllIII[1]] = lllIllIII[13];
                            nArray5[A.lllIllIII[0]] = lllIllIII[7];
                            nArray5[A.lllIllIII[5]] = lllIllIII[10];
                            nArray5[A.lllIllIII[11]] = lllIllIII[14];
                            nArray5[A.lllIllIII[6]] = lllIllIII[15];
                            nArray5[A.lllIllIII[16]] = lllIllIII[17];
                            if (A.llIIIllllllI(e.d(nArray5) ? 1 : 0)) {
                                while (A.llIIlIIIIIII(H.bT() ? 1 : 0)) {
                                    H.bR();
                                    Time.sleepTicks((int)lllIllIII[0]);

                                    if (-(130 + 155 - 260 + 171 ^ 192 + 115 - 190 + 76) < 0) continue;
                                    return;
                                }
                                if (A.llIIlIIIIIII(Bank.isOpen() ? 1 : 0)) {
                                    a.a();
                                    Time.sleepTicks((int)lllIllIII[12]);

                                }
                                a.a(lllIllIII[13], lllIllIII[18]);
                                a.a(lllIllIII[14], lllIllIII[11]);
                                a.a(lllIllIII[7], lllIllIII[8]);
                                a.a(lllIllIII[10], lllIllIII[8]);
                                a.a(lllIllIII[17], lllIllIII[11]);
                                a.a(lllIllIII[15], lllIllIII[18]);
                                a.a(lllIllIII[19], lllIllIII[4]);
                            }
                        }
                        if (A.llIIIllllllI(Inventory.contains((int[])f.bc) ? 1 : 0) && A.llIIIlllllll(Movement.getRunEnergy(), lllIllIII[20])) {
                            Inventory.getFirst((int[])f.bc).interact(lllIlIlll[lllIllIII[16]]);
                            Time.sleepTicks((int)lllIllIII[0]);

                        }
                        if (A.llIIIlllllll(Prayers.getPoints(), lllIllIII[21]) && A.llIIIllllllI(Inventory.contains((int[])f.aZ) ? 1 : 0)) {
                            Inventory.getFirst((int[])f.aZ).interact(lllIlIlll[lllIllIII[12]]);
                        }
                        if (A.llIIIllllllI(A.an() ? 1 : 0) && A.llIIlIIIIIII(e.j(ec))) {
                            if (A.llIIlIIIIlII(Players.getLocal().getWorldLocation().distanceTo(dT), lllIllIII[16])) {
                                AccBuilderGWD.c = lllIlIlll[lllIllIII[22]];
                                if (A.llIIIllllllI(Dialog.isOpen() ? 1 : 0)) {
                                    Dialog.close();
                                }
                                Movement.walkTo((WorldPoint)dT);

                                Time.sleepTicks((int)lllIllIII[0]);

                            }
                            if (A.llIIlIIIIlIl(Players.getLocal().getWorldLocation().distanceTo(dT), lllIllIII[16])) {
                                g.a(lllIlIlll[lllIllIII[23]], cG);
                            }
                        }
                        if (A.llIIlIIIIllI(e.j(ec), lllIllIII[0])) {
                            if (A.llIIlIIIIlII(Players.getLocal().getWorldLocation().distanceTo(dU), lllIllIII[6]) && A.llIIlIIIIlII(Players.getLocal().getWorldLocation().distanceTo(dV), lllIllIII[6])) {
                                AccBuilderGWD.c = lllIlIlll[lllIllIII[24]];
                                Movement.walkTo((WorldPoint)dU);

                                Time.sleepTicks((int)lllIllIII[0]);

                            }
                            if (A.llIIlIIIIlIl(Players.getLocal().getWorldLocation().distanceTo(dU), lllIllIII[12])) {
                                AccBuilderGWD.c = lllIlIlll[lllIllIII[18]];
                                String[] stringArray = new String[lllIllIII[0]];
                                stringArray[A.lllIllIII[1]] = lllIlIlll[lllIllIII[25]];
                                String[] stringArray2 = new String[lllIllIII[0]];
                                stringArray2[A.lllIllIII[1]] = lllIlIlll[lllIllIII[26]];
                                if (A.llIIIllllllI(TileObjects.getNearest((String[])stringArray).hasAction(stringArray2) ? 1 : 0)) {
                                    String[] stringArray3 = new String[lllIllIII[0]];
                                    stringArray3[A.lllIllIII[1]] = lllIlIlll[lllIllIII[3]];
                                    if (A.llIIlIIIIIII(Reachable.isInteractable((Locatable)TileObjects.getNearest((String[])stringArray3)) ? 1 : 0)) {
                                        String[] stringArray4 = new String[lllIllIII[0]];
                                        stringArray4[A.lllIllIII[1]] = lllIlIlll[lllIllIII[27]];
                                        TileObjects.getNearest((String[])stringArray4).interact(lllIlIlll[lllIllIII[28]]);
                                        Time.sleepTicks((int)lllIllIII[6]);

                                    }
                                }
                                String[] stringArray5 = new String[lllIllIII[0]];
                                stringArray5[A.lllIllIII[1]] = lllIlIlll[lllIllIII[29]];
                                if (A.llIIIllllllI(Reachable.isInteractable((Locatable)TileObjects.getNearest((String[])stringArray5)) ? 1 : 0)) {
                                    String[] stringArray6 = new String[lllIllIII[0]];
                                    stringArray6[A.lllIllIII[1]] = lllIlIlll[lllIllIII[30]];
                                    String[] stringArray7 = new String[lllIllIII[0]];
                                    stringArray7[A.lllIllIII[1]] = lllIlIlll[lllIllIII[31]];
                                    if (A.llIIIllllllI(TileObjects.getNearest((String[])stringArray6).hasAction(stringArray7) ? 1 : 0)) {
                                        String[] stringArray8 = new String[lllIllIII[0]];
                                        stringArray8[A.lllIllIII[1]] = lllIlIlll[lllIllIII[32]];
                                        TileObjects.getNearest((String[])stringArray8).interact(lllIlIlll[lllIllIII[33]]);
                                        Time.sleepTicks((int)lllIllIII[5]);

                                    }
                                    String[] stringArray9 = new String[lllIllIII[0]];
                                    stringArray9[A.lllIllIII[1]] = lllIlIlll[lllIllIII[34]];
                                    String[] stringArray10 = new String[lllIllIII[0]];
                                    stringArray10[A.lllIllIII[1]] = lllIlIlll[lllIllIII[35]];
                                    if (A.llIIIllllllI(TileObjects.getNearest((String[])stringArray9).hasAction(stringArray10) ? 1 : 0)) {
                                        String[] stringArray11 = new String[lllIllIII[0]];
                                        stringArray11[A.lllIllIII[1]] = lllIlIlll[lllIllIII[36]];
                                        TileObjects.getNearest((String[])stringArray11).interact(lllIlIlll[lllIllIII[37]]);
                                        Time.sleepTicks((int)lllIllIII[5]);

                                    }
                                }
                            }
                        }
                        if (A.llIIlIIIIllI(e.j(ec), lllIllIII[5])) {
                            int[] nArray = new int[lllIllIII[0]];
                            nArray[A.lllIllIII[1]] = lllIllIII[38];
                            if (A.llIIIllllllI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                                int[] nArray6 = new int[lllIllIII[0]];
                                nArray6[A.lllIllIII[1]] = lllIllIII[38];
                                Inventory.getFirst((int[])nArray6).interact(lllIlIlll[lllIllIII[21]]);
                            }
                            int[] nArray7 = new int[lllIllIII[0]];
                            nArray7[A.lllIllIII[1]] = lllIllIII[39];
                            if (A.llIIIllllllI(Inventory.contains((int[])nArray7) ? 1 : 0)) {
                                int[] nArray8 = new int[lllIllIII[0]];
                                nArray8[A.lllIllIII[1]] = lllIllIII[39];
                                Inventory.getFirst((int[])nArray8).interact(lllIlIlll[lllIllIII[40]]);
                            }
                            if (A.llIIlIIIIIII(ed.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                if (A.llIIlIIIIlII(Players.getLocal().getWorldLocation().distanceTo(dW), lllIllIII[6])) {
                                    AccBuilderGWD.c = lllIlIlll[lllIllIII[41]];
                                    Movement.walkTo((WorldPoint)dW);

                                    Time.sleepTicks((int)lllIllIII[0]);

                                }
                                if (A.llIIlIIIIlIl(Players.getLocal().getWorldLocation().distanceTo(dW), lllIllIII[6]) && A.llIIlIIIIIII(Players.getLocal().isMoving() ? 1 : 0) && A.llIIlIIIIIII(Dialog.isOpen() ? 1 : 0)) {
                                    String[] stringArray = new String[lllIllIII[0]];
                                    stringArray[A.lllIllIII[1]] = lllIlIlll[lllIllIII[42]];
                                    TileObjects.getNearest((String[])stringArray).interact(lllIlIlll[lllIllIII[43]]);
                                    Time.sleepTicks((int)lllIllIII[5]);

                                }
                            }
                            if (A.llIIIllllllI(ed.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                if (A.llIIlIIIIlII(Players.getLocal().getWorldLocation().distanceTo(dX), lllIllIII[6])) {
                                    AccBuilderGWD.c = lllIlIlll[lllIllIII[44]];
                                    Movement.walkTo((WorldPoint)dX);

                                    Time.sleepTicks((int)lllIllIII[0]);

                                }
                                if (A.llIIlIIIIlIl(Players.getLocal().getWorldLocation().distanceTo(dX), lllIllIII[6]) && A.llIIlIIIIIII(Players.getLocal().isMoving() ? 1 : 0)) {
                                    g.a(lllIlIlll[lllIllIII[45]], cG);
                                }
                            }
                        }
                        if (A.llIIlIIIIllI(e.j(ec), lllIllIII[11])) {
                            String[] stringArray = new String[lllIllIII[0]];
                            stringArray[A.lllIllIII[1]] = lllIlIlll[lllIllIII[46]];
                            if (A.llIIlIIIIIII(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                                if (A.llIIlIIIIlII(Players.getLocal().getWorldLocation().distanceTo(ea), lllIllIII[16])) {
                                    AccBuilderGWD.c = lllIlIlll[lllIllIII[47]];
                                    Movement.walkTo((WorldPoint)ea);

                                    Time.sleepTicks((int)lllIllIII[0]);

                                }
                                if (A.llIIlIIIIlIl(Players.getLocal().getWorldLocation().distanceTo(ea), lllIllIII[16])) {
                                    g.a(lllIlIlll[lllIllIII[48]], cG);
                                }
                            }
                            String[] stringArray12 = new String[lllIllIII[0]];
                            stringArray12[A.lllIllIII[1]] = lllIlIlll[lllIllIII[49]];
                            if (A.llIIIllllllI(Inventory.contains((String[])stringArray12) ? 1 : 0)) {
                                AccBuilderGWD.c = lllIlIlll[lllIllIII[50]];
                                if (A.llIIlIIIIlII(Players.getLocal().getWorldLocation().distanceTo(dX), lllIllIII[16])) {
                                    AccBuilderGWD.c = lllIlIlll[lllIllIII[51]];
                                    Movement.walkTo((WorldPoint)dX);

                                    Time.sleepTicks((int)lllIllIII[0]);

                                }
                                if (A.llIIlIIIIlIl(Players.getLocal().getWorldLocation().distanceTo(dX), lllIllIII[16])) {
                                    g.a(lllIlIlll[lllIllIII[52]], cG);
                                }
                            }
                        }
                        if (A.llIIlIIIIllI(e.j(ec), lllIllIII[16])) {
                            if (A.llIIlIIIIlII(Players.getLocal().getWorldLocation().distanceTo(eb), lllIllIII[11])) {
                                AccBuilderGWD.c = lllIlIlll[lllIllIII[53]];
                                Movement.walkTo((WorldPoint)eb);

                                Time.sleepTicks((int)lllIllIII[0]);

                            }
                            if (A.llIIlIIIIlIl(Players.getLocal().getWorldLocation().distanceTo(eb), lllIllIII[11]) && A.llIIlIIIIIII(Players.getLocal().isMoving() ? 1 : 0) && A.llIIlIIIIIII(Dialog.isOpen() ? 1 : 0)) {
                                String[] stringArray = new String[lllIllIII[0]];
                                stringArray[A.lllIllIII[1]] = lllIlIlll[lllIllIII[54]];
                                Inventory.getFirst((String[])stringArray).useOn(TileObjects.getNearest(tileObject -> {
                                    int n2;
                                    if (A.llIIIllllllI(tileObject.getName().contains(lllIlIlll[lllIllIII[90]]) ? 1 : 0) && A.llIIlIIIIlIl(tileObject.getWorldLocation().distanceTo(eb), lllIllIII[11])) {
                                        n2 = lllIllIII[0];

                                        if (1 <= 0) {
                                            return (2 & ~2) != 0;
                                        }
                                    } else {
                                        n2 = lllIllIII[1];
                                    }
                                    return n2 != 0;
                                }));
                                Time.sleepTicks((int)lllIllIII[5]);

                            }
                        }
                        if (A.llIIlIIIIllI(e.j(ec), lllIllIII[12])) {
                            if (A.llIIlIIIIIII(Prayers.isEnabled((Prayer)Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                                Prayers.toggle((Prayer)Prayer.PROTECT_FROM_MELEE);
                            }
                            if (A.llIIlIIIIIII(m.ap() ? 1 : 0)) {
                                m.aq();
                            }
                            if (A.llIIlIIIIlll(Players.getLocal().getInteracting())) {
                                String[] stringArray = new String[lllIllIII[0]];
                                stringArray[A.lllIllIII[1]] = lllIlIlll[lllIllIII[55]];
                                if (A.llIIlIIIIIlI(NPCs.getNearest((String[])stringArray))) {
                                    String[] stringArray13 = new String[lllIllIII[0]];
                                    stringArray13[A.lllIllIII[1]] = lllIlIlll[lllIllIII[56]];
                                    NPCs.getNearest((String[])stringArray13).interact(lllIlIlll[lllIllIII[57]]);
                                    Time.sleepTicks((int)lllIllIII[5]);

                                }
                            }
                        }
                        if (A.llIIlIIIIllI(e.j(ec), lllIllIII[23]) && A.llIIlIIIIlll(Players.getLocal().getInteracting())) {
                            g.a(lllIlIlll[lllIllIII[58]], cG);
                        }
                        if (A.llIIlIIIIllI(e.j(ec), lllIllIII[24])) {
                            if (A.llIIlIIIIIII(Prayers.isEnabled((Prayer)Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                                Prayers.toggle((Prayer)Prayer.PROTECT_FROM_MELEE);
                            }
                            if (A.llIIlIIIIIII(m.ap() ? 1 : 0)) {
                                m.aq();
                            }
                            String[] stringArray = new String[lllIllIII[0]];
                            stringArray[A.lllIllIII[1]] = lllIlIlll[lllIllIII[2]];
                            if (A.llIIlIIIIIlI(NPCs.getNearest((String[])stringArray))) {
                                String[] stringArray14 = new String[lllIllIII[0]];
                                stringArray14[A.lllIllIII[1]] = lllIlIlll[lllIllIII[59]];
                                if (A.llIIlIIIIlIl(NPCs.getNearest((String[])stringArray14).getWorldLocation().distanceTo(Players.getLocal().getWorldLocation()), lllIllIII[16])) {
                                    g.a(lllIlIlll[lllIllIII[60]], cG);
                                }
                            }
                            if (A.llIIlIIIIlll(Players.getLocal().getInteracting())) {
                                String[] stringArray15 = new String[lllIllIII[0]];
                                stringArray15[A.lllIllIII[1]] = lllIlIlll[lllIllIII[61]];
                                if (A.llIIlIIIIIlI(NPCs.getNearest((String[])stringArray15))) {
                                    String[] stringArray16 = new String[lllIllIII[0]];
                                    stringArray16[A.lllIllIII[1]] = lllIlIlll[lllIllIII[62]];
                                    NPCs.getNearest((String[])stringArray16).interact(lllIlIlll[lllIllIII[20]]);
                                    Time.sleepTicks((int)lllIllIII[5]);

                                }
                            }
                        }
                        if (A.llIIlIIIIllI(e.j(ec), lllIllIII[18])) {
                            if (A.llIIlIIIIIII(Prayers.isEnabled((Prayer)Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                                Prayers.toggle((Prayer)Prayer.PROTECT_FROM_MELEE);
                            }
                            if (A.llIIlIIIIIII(m.ap() ? 1 : 0)) {
                                m.aq();
                            }
                            if (A.llIIlIIIIlll(Players.getLocal().getInteracting())) {
                                String[] stringArray = new String[lllIllIII[0]];
                                stringArray[A.lllIllIII[1]] = lllIlIlll[lllIllIII[63]];
                                if (A.llIIlIIIIIlI(NPCs.getNearest((String[])stringArray))) {
                                    String[] stringArray17 = new String[lllIllIII[0]];
                                    stringArray17[A.lllIllIII[1]] = lllIlIlll[lllIllIII[64]];
                                    NPCs.getNearest((String[])stringArray17).interact(lllIlIlll[lllIllIII[65]]);
                                    Time.sleepTicks((int)lllIllIII[5]);

                                }
                            }
                        }
                        if (A.llIIlIIIlIII(e.j(ec), lllIllIII[25]) && !A.llIIlIIIIllI(e.j(ec), lllIllIII[26])) break block82;
                        String[] stringArray = new String[lllIllIII[0]];
                        stringArray[A.lllIllIII[1]] = lllIlIlll[lllIllIII[66]];
                        if (A.llIIlIIIIIlI(NPCs.getNearest((String[])stringArray))) {
                            int[] nArray = new int[lllIllIII[0]];
                            nArray[A.lllIllIII[1]] = lllIllIII[13];
                            Inventory.getFirst((int[])nArray).interact(lllIlIlll[lllIllIII[67]]);
                            Time.sleepTicks((int)lllIllIII[16]);

                        }
                        llIllIllllIII = new WorldPoint(lllIllIII[68], lllIllIII[69], lllIllIII[1]);
                        if (A.llIIlIIIIlIl(Players.getLocal().getWorldLocation().distanceTo(b.K), lllIllIII[70]) && A.llIIlIIIIlII(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llIllIllllIII), lllIllIII[6])) {
                            AccBuilderGWD.c = lllIlIlll[lllIllIII[71]];
                            Movement.walkTo((WorldPoint)llIllIllllIII);

                            Time.sleepTicks((int)lllIllIII[0]);

                        }
                        if (A.llIIlIIIIlIl(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llIllIllllIII), lllIllIII[6]) && !A.llIIlIIIIlIl(Players.getLocal().getWorldLocation().distanceTo(dX), lllIllIII[54])) break block83;
                        if (!A.llIIlIIIIlII(Players.getLocal().getWorldLocation().distanceTo(dT), lllIllIII[16])) break block84;
                        String[] stringArray18 = new String[lllIllIII[0]];
                        stringArray18[A.lllIllIII[1]] = lllIlIlll[lllIllIII[72]];
                        if (!A.llIIlIIIIlll(NPCs.getNearest((String[])stringArray18)) || !A.llIIlIIIIlII(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llIllIllllIII), lllIllIII[70])) break block84;
                    }
                    WorldArea llIllIlllIlll = new WorldArea(lllIllIII[73], lllIllIII[74], lllIllIII[43], lllIllIII[37], lllIllIII[1]);
                    if (A.llIIIlllllll(e.j(lllIllIII[75]), lllIllIII[24]) && A.llIIIllllllI(Equipment.contains(item -> item.getName().contains(lllIlIlll[lllIllIII[89]])) ? 1 : 0)) {
                        Equipment.getFirst(item -> item.getName().contains(lllIlIlll[lllIllIII[88]])).interact(lllIlIlll[lllIllIII[76]]);
                        Time.sleepTicks((int)lllIllIII[12]);

                    }
                    if (A.llIIIllllllI(llIllIlllIlll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        WorldPoint llIllIlllIllI = new WorldPoint(lllIllIII[77], lllIllIII[78], lllIllIII[1]);
                        Movement.walkTo((WorldPoint)llIllIlllIllI);

                        Time.sleepTicks((int)lllIllIII[0]);

                    }
                    if (A.llIIlIIIIIII(llIllIlllIlll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        Movement.walkTo((WorldPoint)dT);

                        Time.sleepTicks((int)lllIllIII[0]);

                    }
                }
                if (A.llIIlIIIIlIl(Players.getLocal().getWorldLocation().distanceTo(dT), lllIllIII[16])) {
                    if (A.llIIIlllllll(dk, lllIllIII[0])) {
                        as.ng += lllIllIII[0];
                        as.u(AccBuilderGWD.m);
                        dk += lllIllIII[0];
                        as.ng = lllIllIII[1];
                        dl = lllIllIII[1];
                    }
                    g.a(lllIlIlll[lllIllIII[79]], cG);
                }
            }
            g.a(cG);
        }
    }

    @Override
    public int af() {
        try {
            A.bq();

        }
        catch (Exception exception) {
            // empty catch block
        }
        if (1 >= 3) {
            return (0x7A ^ 0x4A) & ~(0x15 ^ 0x25);
        }
        return lllIllIII[85];
    }

    private static boolean llIIlIIIIIll(int n2) {
        return n2 > 0;
    }

    private static boolean llIIlIIIIllI(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean llIIlIIIIlll(Object object) {
        return object == null;
    }

    private static boolean llIIlIIIlIIl(Object object, Object object2) {
        return object != object2;
    }

    @Override
    public boolean ae() {
        return lllIllIII[1];
    }

    private static boolean llIIlIIIIIIl(int n2, int n3) {
        return n2 >= n3;
    }

    @Override
    public String ag() {
        return lllIlIlll[lllIllIII[86]];
    }

    private static void Q() {
        block35: {
            d llIllIllIlllI;
            block34: {
                block33: {
                    block32: {
                        block31: {
                            block30: {
                                Object llIllIllIllll;
                                block29: {
                                    block28: {
                                        block27: {
                                            block26: {
                                                block25: {
                                                    block24: {
                                                        block23: {
                                                            block22: {
                                                                int[] nArray = new int[lllIllIII[0]];
                                                                nArray[A.lllIllIII[1]] = lllIllIII[9];
                                                                if (!A.llIIIllllllI(Bank.contains((int[])nArray) ? 1 : 0)) break block22;
                                                                int[] nArray2 = new int[lllIllIII[0]];
                                                                nArray2[A.lllIllIII[1]] = lllIllIII[9];
                                                                if (!A.llIIIllllllI(Bank.contains((int[])nArray2) ? 1 : 0)) break block23;
                                                                int[] nArray3 = new int[lllIllIII[0]];
                                                                nArray3[A.lllIllIII[1]] = lllIllIII[9];
                                                                if (!A.llIIIlllllll(Bank.getFirst((int[])nArray3).getQuantity(), lllIllIII[8])) break block23;
                                                            }
                                                            llIllIllIllll = new DHelper(lllIllIII[9], lllIllIII[8], lllIllIII[18]);
                                                            bx.add((DHelper) lIllIllIllll);

                                                        }
                                                        int[] nArray = new int[lllIllIII[0]];
                                                        nArray[A.lllIllIII[1]] = lllIllIII[7];
                                                        if (!A.llIIIllllllI(Bank.contains((int[])nArray) ? 1 : 0)) break block24;
                                                        int[] nArray4 = new int[lllIllIII[0]];
                                                        nArray4[A.lllIllIII[1]] = lllIllIII[7];
                                                        if (!A.llIIIllllllI(Bank.contains((int[])nArray4) ? 1 : 0)) break block25;
                                                        int[] nArray5 = new int[lllIllIII[0]];
                                                        nArray5[A.lllIllIII[1]] = lllIllIII[7];
                                                        if (!A.llIIIlllllll(Bank.getFirst((int[])nArray5).getQuantity(), lllIllIII[8])) break block25;
                                                    }
                                                    llIllIllIllll = new DHelper(lllIllIII[7], lllIllIII[8], lllIllIII[18]);
                                                    bx.add((DHelper) lIllIllIllll);

                                                }
                                                int[] nArray = new int[lllIllIII[0]];
                                                nArray[A.lllIllIII[1]] = lllIllIII[10];
                                                if (!A.llIIIllllllI(Bank.contains((int[])nArray) ? 1 : 0)) break block26;
                                                int[] nArray6 = new int[lllIllIII[0]];
                                                nArray6[A.lllIllIII[1]] = lllIllIII[10];
                                                if (!A.llIIIllllllI(Bank.contains((int[])nArray6) ? 1 : 0)) break block27;
                                                int[] nArray7 = new int[lllIllIII[0]];
                                                nArray7[A.lllIllIII[1]] = lllIllIII[10];
                                                if (!A.llIIIlllllll(Bank.getFirst((int[])nArray7).getQuantity(), lllIllIII[8])) break block27;
                                            }
                                            llIllIllIllll = new DHelper(lllIllIII[10], lllIllIII[8], lllIllIII[18]);
                                            bx.add((DHelper) lIllIllIllll);

                                        }
                                        int[] nArray = new int[lllIllIII[0]];
                                        nArray[A.lllIllIII[1]] = lllIllIII[15];
                                        if (!A.llIIIllllllI(Bank.contains((int[])nArray) ? 1 : 0)) break block28;
                                        int[] nArray8 = new int[lllIllIII[0]];
                                        nArray8[A.lllIllIII[1]] = lllIllIII[15];
                                        if (!A.llIIIllllllI(Bank.contains((int[])nArray8) ? 1 : 0)) break block29;
                                        int[] nArray9 = new int[lllIllIII[0]];
                                        nArray9[A.lllIllIII[1]] = lllIllIII[15];
                                        if (!A.llIIIlllllll(Bank.getFirst((int[])nArray9).getQuantity(), lllIllIII[28])) break block29;
                                    }
                                    llIllIllIllll = new DHelper(lllIllIII[15], lllIllIII[33], lllIllIII[80]);
                                    bx.add((DHelper) lIllIllIllll);

                                }
                                if (A.llIIlIIIIIII(Bank.contains((Predicate)(llIllIllIllll = item -> item.getName().toLowerCase().contains(lllIlIlll[lllIllIII[87]]))) ? 1 : 0)) {
                                    llIllIllIlllI = new DHelper(lllIllIII[81], lllIllIII[16], lllIllIII[82]);
                                    bx.add(llIllIllIlllI);

                                }
                                int[] nArray = new int[lllIllIII[0]];
                                nArray[A.lllIllIII[1]] = lllIllIII[14];
                                if (!A.llIIIllllllI(Bank.contains((int[])nArray) ? 1 : 0)) break block30;
                                int[] nArray10 = new int[lllIllIII[0]];
                                nArray10[A.lllIllIII[1]] = lllIllIII[14];
                                if (!A.llIIIllllllI(Bank.contains((int[])nArray10) ? 1 : 0)) break block31;
                                int[] nArray11 = new int[lllIllIII[0]];
                                nArray11[A.lllIllIII[1]] = lllIllIII[14];
                                if (!A.llIIIlllllll(Bank.getFirst((int[])nArray11).getQuantity(), lllIllIII[6])) break block31;
                            }
                            llIllIllIlllI = new DHelper(lllIllIII[14], lllIllIII[6], j.ch);
                            bx.add(llIllIllIlllI);

                        }
                        int[] nArray = new int[lllIllIII[0]];
                        nArray[A.lllIllIII[1]] = lllIllIII[17];
                        if (!A.llIIIllllllI(Bank.contains((int[])nArray) ? 1 : 0)) break block32;
                        int[] nArray12 = new int[lllIllIII[0]];
                        nArray12[A.lllIllIII[1]] = lllIllIII[17];
                        if (!A.llIIIllllllI(Bank.contains((int[])nArray12) ? 1 : 0)) break block33;
                        int[] nArray13 = new int[lllIllIII[0]];
                        nArray13[A.lllIllIII[1]] = lllIllIII[17];
                        if (!A.llIIIlllllll(Bank.getFirst((int[])nArray13).getQuantity(), lllIllIII[5])) break block33;
                    }
                    llIllIllIlllI = new DHelper(lllIllIII[17], lllIllIII[11], lllIllIII[83]);
                    bx.add(llIllIllIlllI);

                }
                int[] nArray = new int[lllIllIII[0]];
                nArray[A.lllIllIII[1]] = lllIllIII[13];
                if (!A.llIIIllllllI(Bank.contains((int[])nArray) ? 1 : 0)) break block34;
                int[] nArray14 = new int[lllIllIII[0]];
                nArray14[A.lllIllIII[1]] = lllIllIII[13];
                if (!A.llIIIllllllI(Bank.contains((int[])nArray14) ? 1 : 0)) break block35;
                int[] nArray15 = new int[lllIllIII[0]];
                nArray15[A.lllIllIII[1]] = lllIllIII[13];
                if (!A.llIIIlllllll(Bank.getFirst((int[])nArray15).getQuantity(), lllIllIII[28])) break block35;
            }
            llIllIllIlllI = new DHelper(lllIllIII[13], lllIllIII[54], lllIllIII[84]);
            bx.add(llIllIllIlllI);

        }
    }

    private static boolean llIIlIIIIIlI(Object object) {
        return object != null;
    }

    private static boolean llIIlIIIIlIl(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean llIIlIIIIIII(int n2) {
        return n2 == 0;
    }

}

