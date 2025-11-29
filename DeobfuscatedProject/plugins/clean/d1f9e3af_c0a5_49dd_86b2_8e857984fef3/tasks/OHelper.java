/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Item
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.Skill
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 */
package gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks;

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
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.QHelper;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.W;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.AHelper;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.BHelper;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.DHelper;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.EHelper;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.FHelper;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.GHelper;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.IHelper;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Skill;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;

public class OHelper
implements W {
    static  WorldPoint bX;
    static  int bY;
    
    public static  boolean bW;
    public static  boolean bt;

    public static  List<d> bv;

    @Override
    public boolean V() {
        boolean bl;
        if (o.lIIIIIllIIll(Skills.getLevel((Skill)Skill.FARMING), lIIlllIlI[91])) {
            bl = lIIlllIlI[0];

            if ((120 + 112 - 63 + 10 ^ 70 + 108 - 170 + 175) <= 3) {
                return ((0x56 ^ 0x38 ^ (0x75 ^ 0x27)) & (29 + 157 - 151 + 124 ^ 17 + 31 - -77 + 38 ^ -1)) != 0;
            }
        } else {
            bl = lIIlllIlI[1];
        }
        return bl;
    }

        return String.valueOf(llllllIlIllIIl);
    }

    private static boolean lIIIIIllIIll(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIIIIIlllIIl(Object object) {
        return object == null;
    }

    @Override
    public boolean S() {
        return lIIlllIlI[1];
    }

    private static  boolean b(WorldPoint worldPoint, TileObject tileObject) {
        int n2;
        if (o.lIIIIIllIIII(tileObject.getName().contains(lIIlllIII[lIIlllIlI[96]]) ? 1 : 0) && o.lIIIIIllIlll(tileObject.getWorldLocation().distanceTo(worldPoint), lIIlllIlI[18])) {
            n2 = lIIlllIlI[0];

            if (3 < 0) {
                return false;
            }
        } else {
            n2 = lIIlllIlI[1];
        }
        return n2 != 0;
    }

    private static boolean lIIIIIllIllI(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean ab() {
        int n2;
        int[] nArray = new int[lIIlllIlI[0]];
        nArray[o.lIIlllIlI[1]] = lIIlllIlI[10];
        if (o.lIIIIIllIIII(Inventory.contains((int[])nArray) ? 1 : 0) && o.lIIIIIllIIII(Inventory.contains(item -> item.getName().contains(lIIlllIII[lIIlllIlI[94]])) ? 1 : 0) && (!o.lIIIIIllIIlI(Equipment.contains(item -> item.getName().contains(lIIlllIII[lIIlllIlI[93]])) ? 1 : 0) || o.lIIIIIllIIII(Inventory.contains(item -> item.getName().contains(lIIlllIII[lIIlllIlI[92]])) ? 1 : 0))) {
            n2 = lIIlllIlI[0];

            if (((0x7E ^ 0x73) & ~(0x45 ^ 0x48)) != ((0xBA ^ 0x9F) & ~(0xE6 ^ 0xC3))) {
                return false;
            }
        } else {
            n2 = lIIlllIlI[1];
        }
        return n2 != 0;
    }

    private static boolean az() {
        int n2;
        WorldArea worldArea = new WorldArea(lIIlllIlI[40], lIIlllIlI[41], lIIlllIlI[36], lIIlllIlI[42], lIIlllIlI[1]);
        if (o.lIIIIIllIIII(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && o.lIIIIIllIlll(Players.getLocal().getWorldLocation().getX(), lIIlllIlI[43])) {
            n2 = lIIlllIlI[0];

            if (1 < 0) {
                return ((0x18 ^ 0x69 ^ (0x18 ^ 0x27)) & (0x3A ^ 0x2C ^ (1 ^ 0x59) ^ -1)) != 0;
            }
        } else {
            n2 = lIIlllIlI[1];
        }
        return n2 != 0;
    }

    private static boolean lIIIIIllIIIl(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIIIIIllIIII(int n2) {
        return n2 != 0;
    }

    @Override
    public String U() {
        return lIIlllIII[lIIlllIlI[90]];
    }

    static {
        o.lIIIIIlIllll();
        o.lIIIIIlIlllI();
        bv = new ArrayList<d>();
        bX = new WorldPoint(lIIlllIlI[1], lIIlllIlI[1], lIIlllIlI[1]);
        bY = lIIlllIlI[1];
        String[] stringArray = new String[lIIlllIlI[0]];
        stringArray[o.lIIlllIlI[1]] = lIIlllIII[lIIlllIlI[102]];
        bR = stringArray;
    }

    private static boolean lIIIIIllIlll(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean lIIIIIllIlIl(int n2) {
        return n2 > 0;
    }

    private static boolean lIIIIIllIIlI(int n2) {
        return n2 == 0;
    }

    private static boolean lIIIIIllIlII(Object object) {
        return object != null;
    }

    private static void aA() {
        if (o.lIIIIIllIIlI(o.az() ? 1 : 0)) {
            AccBuilderEasyClues.c = lIIlllIII[lIIlllIlI[44]];
            int[] nArray = new int[lIIlllIlI[6]];
            nArray[o.lIIlllIlI[1]] = lIIlllIlI[45];
            nArray[o.lIIlllIlI[0]] = lIIlllIlI[46];
            nArray[o.lIIlllIlI[5]] = lIIlllIlI[47];
            nArray[o.lIIlllIlI[9]] = lIIlllIlI[48];
            int[] nArray2 = nArray;
            if (o.lIIIIIllIIII(Inventory.contains((int[])nArray2) ? 1 : 0)) {
                Inventory.getAll((int[])nArray2).stream().forEach(Item::drop);
                Time.sleepTicks((int)lIIlllIlI[0]);

            }
            TileObjects.getNearest(tileObject -> {
                int n2;
                if (o.lIIIIIllIIII(tileObject.getName().contains(lIIlllIII[lIIlllIlI[87]]) ? 1 : 0) && o.lIIIIIllIlll(tileObject.getWorldLocation().distanceTo(new WorldPoint(lIIlllIlI[97], lIIlllIlI[60], lIIlllIlI[1])), lIIlllIlI[5])) {
                    n2 = lIIlllIlI[0];

                    }
                } else {
                    n2 = lIIlllIlI[1];
                }
                return n2 != 0;
            }).interact(lIIlllIII[lIIlllIlI[12]]);
            Time.sleepUntil(() -> o.az(), (int)e.c(lIIlllIlI[49], lIIlllIlI[50]));

        }
        if (o.lIIIIIllIIII(o.az() ? 1 : 0)) {
            WorldPoint lllllllIIlIlIl;
            TileObject lllllllIIlIlII;
            WorldArea lllllllIIlIlll;
            WorldArea lllllllIIllIII;
            WorldArea lllllllIIllIll;
            WorldArea lllllllIIlllII;
            int[] nArray = new int[lIIlllIlI[0]];
            nArray[o.lIIlllIlI[1]] = lIIlllIlI[51];
            NPC lllllllIlIIIIl = NPCs.getNearest((int[])nArray);
            int[] nArray3 = new int[lIIlllIlI[0]];
            nArray3[o.lIIlllIlI[1]] = lIIlllIlI[52];
            NPC lllllllIlIIIII = NPCs.getNearest((int[])nArray3);
            int[] nArray4 = new int[lIIlllIlI[0]];
            nArray4[o.lIIlllIlI[1]] = lIIlllIlI[53];
            NPC lllllllIIlllll = NPCs.getNearest((int[])nArray4);
            int[] nArray5 = new int[lIIlllIlI[0]];
            nArray5[o.lIIlllIlI[1]] = lIIlllIlI[54];
            NPC lllllllIIllllI = NPCs.getNearest((int[])nArray5);
            WorldArea lllllllIIlllIl = new WorldArea(lIIlllIlI[55], lIIlllIlI[56], lIIlllIlI[14], lIIlllIlI[14], lIIlllIlI[1]);
            if (o.lIIIIIllIIII(lllllllIIlllIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && o.lIIIIIllIlII(lllllllIlIIIIl)) {
                lllllllIIlllII = new WorldArea(lIIlllIlI[57], lIIlllIlI[58], lIIlllIlI[14], lIIlllIlI[6], lIIlllIlI[1]);
                if (o.lIIIIIllIIlI(lllllllIIlllII.contains((Locatable)lllllllIlIIIIl) ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIIlllIII[lIIlllIlI[42]];
                    lllllllIIllIll = new WorldPoint(lIIlllIlI[59], lIIlllIlI[60], lIIlllIlI[1]);
                    if (o.lIIIIIllIIlI(Players.getLocal().getWorldLocation().equals((Object)lllllllIIllIll) ? 1 : 0)) {
                        e.c((WorldPoint)lllllllIIllIll);
                        Time.sleepTicks((int)lIIlllIlI[0]);

                    }
                }
                if (o.lIIIIIllIIII(lllllllIIlllII.contains((Locatable)lllllllIlIIIIl) ? 1 : 0)) {
                    lllllllIIllIll = new WorldPoint(lIIlllIlI[59], lIIlllIlI[61], lIIlllIlI[1]);
                    if (o.lIIIIIllIIlI(Players.getLocal().getWorldLocation().equals((Object)lllllllIIllIll) ? 1 : 0)) {
                        AccBuilderEasyClues.c = lIIlllIII[lIIlllIlI[62]];
                        e.c((WorldPoint)lllllllIIllIll);
                        Time.sleepTicks((int)lIIlllIlI[0]);

                    }
                }
            }
            lllllllIIlllII = new WorldArea(lIIlllIlI[63], lIIlllIlI[64], lIIlllIlI[25], lIIlllIlI[6], lIIlllIlI[1]);
            lllllllIIllIll = new WorldArea(lIIlllIlI[65], lIIlllIlI[58], lIIlllIlI[18], lIIlllIlI[19], lIIlllIlI[1]);
            WorldArea lllllllIIllIlI = new WorldArea(lIIlllIlI[57], lIIlllIlI[66], lIIlllIlI[9], lIIlllIlI[20], lIIlllIlI[1]);
            WorldArea lllllllIIllIIl = new WorldArea(lIIlllIlI[65], lIIlllIlI[60], lIIlllIlI[6], lIIlllIlI[6], lIIlllIlI[1]);
            if (!o.lIIIIIllIIlI(lllllllIIlllII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || o.lIIIIIllIIII(lllllllIIllIll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                lllllllIIllIII = new WorldArea(lIIlllIlI[63], lIIlllIlI[64], lIIlllIlI[24], lIIlllIlI[9], lIIlllIlI[1]);
                if (o.lIIIIIllIlII(lllllllIlIIIII) && o.lIIIIIllIlII(lllllllIIlllll) && o.lIIIIIllIlII(lllllllIlIIIIl)) {
                    if (!o.lIIIIIllIIII(lllllllIIllIII.contains((Locatable)lllllllIlIIIII) ? 1 : 0) || o.lIIIIIllIIlI(lllllllIIllIII.contains((Locatable)lllllllIIlllll) ? 1 : 0)) {
                        AccBuilderEasyClues.c = lIIlllIII[lIIlllIlI[67]];
                    }
                    if (o.lIIIIIllIIII(lllllllIIllIII.contains((Locatable)lllllllIlIIIII) ? 1 : 0) && o.lIIIIIllIIII(lllllllIIllIII.contains((Locatable)lllllllIIlllll) ? 1 : 0) && (!o.lIIIIIllIIlI(lllllllIIllIlI.contains((Locatable)lllllllIlIIIIl) ? 1 : 0) || o.lIIIIIllIIII(lllllllIIllIIl.contains((Locatable)lllllllIlIIIIl) ? 1 : 0))) {
                        lllllllIIlIlll = new WorldPoint(lIIlllIlI[63], lIIlllIlI[68], lIIlllIlI[1]);
                        if (o.lIIIIIllIIII(lllllllIIllIll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && o.lIIIIIllIIlI(Players.getLocal().getWorldLocation().equals((Object)lllllllIIlIlll) ? 1 : 0)) {
                            AccBuilderEasyClues.c = lIIlllIII[lIIlllIlI[69]];
                            e.c((WorldPoint)lllllllIIlIlll);
                            Time.sleepTicks((int)lIIlllIlI[0]);

                        }
                    }
                }
                if (o.lIIIIIllIIII(lllllllIIlllII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && o.lIIIIIllIIII(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(lIIlllIlI[63], lIIlllIlI[68], lIIlllIlI[1])) ? 1 : 0)) {
                    lllllllIIlIlll = new WorldPoint(lIIlllIlI[70], lIIlllIlI[71], lIIlllIlI[1]);
                    if (o.lIIIIIllIIlI(Players.getLocal().getWorldLocation().equals((Object)lllllllIIlIlll) ? 1 : 0)) {
                        AccBuilderEasyClues.c = lIIlllIII[lIIlllIlI[72]];
                        e.c((WorldPoint)lllllllIIlIlll);
                        Time.sleepTicks((int)lIIlllIlI[0]);

                    }
                }
            }
            lllllllIIllIII = new WorldArea(lIIlllIlI[73], lIIlllIlI[74], lIIlllIlI[8], lIIlllIlI[29], lIIlllIlI[1]);
            lllllllIIlIlll = new WorldArea(lIIlllIlI[73], lIIlllIlI[75], lIIlllIlI[6], lIIlllIlI[19], lIIlllIlI[1]);
            WorldPoint lllllllIIlIllI = new WorldPoint(lIIlllIlI[70], lIIlllIlI[71], lIIlllIlI[1]);
            if (o.lIIIIIllIIII(Players.getLocal().getWorldLocation().equals((Object)lllllllIIlIllI) ? 1 : 0) && o.lIIIIIllIlII(lllllllIIllllI) && (o.lIIIIIlllIII(lllllllIIllllI.getOrientation(), lIIlllIlI[76]) && !o.lIIIIIllIIIl(lllllllIIllllI.getWorldLocation().getX(), lIIlllIlI[77]) || o.lIIIIIlllIII(lllllllIIllllI.getOrientation(), lIIlllIlI[78]) && o.lIIIIIllIIll(lllllllIIllllI.getWorldLocation().getX(), lIIlllIlI[57])) && o.lIIIIIllIlII(lllllllIIlIlII = TileObjects.getNearest(arg_0 -> o.b(lllllllIIlIlIl = new WorldPoint(lIIlllIlI[63], lIIlllIlI[56], lIIlllIlI[1]), arg_0)))) {
                AccBuilderEasyClues.c = lIIlllIII[lIIlllIlI[79]];
                lllllllIIlIlII.interact(lIIlllIII[lIIlllIlI[80]]);
                Time.sleepTicks((int)lIIlllIlI[5]);

            }
            if ((!o.lIIIIIllIIlI(lllllllIIllIII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || o.lIIIIIllIIII(lllllllIIlIlll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) && o.lIIIIIllIlII(lllllllIIlIlII = TileObjects.getNearest(arg_0 -> o.a(lllllllIIlIlIl = new WorldPoint(lIIlllIlI[63], lIIlllIlI[56], lIIlllIlI[1]), arg_0)))) {
                AccBuilderEasyClues.c = lIIlllIII[lIIlllIlI[81]];
                lllllllIIlIlII.interact(lIIlllIII[lIIlllIlI[82]]);
                Time.sleepTicks((int)lIIlllIlI[5]);

            }
        }
    }

    @Override
    public int T() {
        try {
            o.ay();

        }
        catch (Exception exception) {
            // empty catch block
        }
        
        }
        return lIIlllIlI[89];
    }

    private static  boolean a(WorldPoint worldPoint, TileObject tileObject) {
        int n2;
        if (o.lIIIIIllIIII(tileObject.getName().contains(lIIlllIII[lIIlllIlI[95]]) ? 1 : 0) && o.lIIIIIllIlll(tileObject.getWorldLocation().distanceTo(worldPoint), lIIlllIlI[18])) {
            n2 = lIIlllIlI[0];

            if (2 != 2) {
                return false;
            }
        } else {
            n2 = lIIlllIlI[1];
        }
        return n2 != 0;
    }

    public static void ay() {
        if (o.lIIIIIllIIII(bt ? 1 : 0)) {
            b.a(bv);
            if (o.lIIIIIllIIIl(bv.size(), lIIlllIlI[0])) {
                System.out.println(lIIlllIII[lIIlllIlI[1]]);
                bt = lIIlllIlI[1];
            }
        }
        if (o.lIIIIIllIIlI(bt ? 1 : 0)) {
            if (o.lIIIIIllIIIl(e.j(lIIlllIlI[2]), lIIlllIlI[3])) {
                Q.cS();
            }
            if (o.lIIIIIllIIll(e.j(lIIlllIlI[2]), lIIlllIlI[3])) {
                BankLocation lllllllIllIlII;
                if (o.lIIIIIllIIlI(o.ab() ? 1 : 0)) {
                    lllllllIllIlII = BankLocation.getNearest();
                    if (o.lIIIIIllIlII(lllllllIllIlII) && o.lIIIIIllIIlI(lllllllIllIlII.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderEasyClues.c = lIIlllIII[lIIlllIlI[0]];
                        a.a(lllllllIllIlII);
                    }
                    if (o.lIIIIIllIlII(lllllllIllIlII) && o.lIIIIIllIIII(lllllllIllIlII.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        if (o.lIIIIIllIIlI(Bank.isOpen() ? 1 : 0)) {
                            a.a();
                            Time.sleepUntil(() -> Bank.isOpen(), (int)lIIlllIlI[4]);

                        }
                        if (o.lIIIIIllIIII(Bank.isOpen() ? 1 : 0)) {
                            AccBuilderEasyClues.c = lIIlllIII[lIIlllIlI[5]];
                            if (o.lIIIIIllIlIl(Inventory.getAll().size())) {
                                Bank.depositInventory();
                                Time.sleepTicks((int)lIIlllIlI[6]);

                            }
                            if (o.lIIIIIllIlIl(Equipment.getAll().size())) {
                                Bank.depositEquipment();
                                Time.sleepTicks((int)lIIlllIlI[5]);

                            }
                            int[] nArray = new int[lIIlllIlI[0]];
                            nArray[o.lIIlllIlI[1]] = lIIlllIlI[7];
                            if (o.lIIIIIllIIII(Bank.contains((int[])nArray) ? 1 : 0)) {
                                int[] nArray2 = new int[lIIlllIlI[0]];
                                nArray2[o.lIIlllIlI[1]] = lIIlllIlI[7];
                                if (o.lIIIIIllIIIl(Bank.getFirst((int[])nArray2).getQuantity(), lIIlllIlI[8])) {
                                    o.af();
                                    System.out.println(lIIlllIII[lIIlllIlI[9]]);
                                    bt = lIIlllIlI[0];
                                    return;
                                }
                            }
                            int[] nArray3 = new int[lIIlllIlI[9]];
                            nArray3[o.lIIlllIlI[1]] = lIIlllIlI[10];
                            nArray3[o.lIIlllIlI[0]] = lIIlllIlI[7];
                            nArray3[o.lIIlllIlI[5]] = lIIlllIlI[11];
                            if (o.lIIIIIllIIlI(e.b(nArray3) ? 1 : 0)) {
                                o.af();
                                System.out.println(lIIlllIII[lIIlllIlI[6]]);
                                bt = lIIlllIlI[0];
                                return;
                            }
                            int[] nArray4 = new int[lIIlllIlI[9]];
                            nArray4[o.lIIlllIlI[1]] = lIIlllIlI[10];
                            nArray4[o.lIIlllIlI[0]] = lIIlllIlI[7];
                            nArray4[o.lIIlllIlI[5]] = lIIlllIlI[11];
                            if (o.lIIIIIllIIII(e.b(nArray4) ? 1 : 0)) {
                                a.a(lIIlllIlI[10], lIIlllIlI[8]);
                                a.a(lIIlllIlI[7], lIIlllIlI[12]);
                                a.a(lIIlllIlI[11], lIIlllIlI[0]);
                            }
                        }
                    }
                }
                if (o.lIIIIIllIIII(Inventory.contains((int[])f.aV) ? 1 : 0) && o.lIIIIIllIIIl(Movement.getRunEnergy(), lIIlllIlI[13])) {
                    Inventory.getFirst((int[])f.aV).interact(lIIlllIII[lIIlllIlI[14]]);
                    Time.sleepTicks((int)lIIlllIlI[0]);

                }
                if (o.lIIIIIllIIII(o.ab() ? 1 : 0)) {
                    TileObject lllllllIllIIll;
                    e.l(lIIlllIlI[11]);
                    if (o.lIIIIIllIIIl(Vars.getBit((int)lIIlllIlI[15]), lIIlllIlI[0])) {
                        lllllllIllIlII = new WorldPoint(lIIlllIlI[16], lIIlllIlI[17], lIIlllIlI[1]);
                        if (o.lIIIIIllIllI(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lllllllIllIlII), lIIlllIlI[8])) {
                            AccBuilderEasyClues.c = lIIlllIII[lIIlllIlI[18]];
                            Movement.walkTo((WorldPoint)lllllllIllIlII);

                            Time.sleepTicks((int)lIIlllIlI[0]);

                        }
                        if (o.lIIIIIllIlll(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lllllllIllIlII), lIIlllIlI[8])) {
                            String[] stringArray = new String[lIIlllIlI[0]];
                            stringArray[o.lIIlllIlI[1]] = lIIlllIII[lIIlllIlI[20]];
                            g.a(lIIlllIII[lIIlllIlI[19]], stringArray);
                        }
                    }
                    if (o.lIIIIIlllIII(Vars.getBit((int)lIIlllIlI[15]), lIIlllIlI[0]) && o.lIIIIIllIIlI(Vars.getBit((int)lIIlllIlI[21]))) {
                        lllllllIllIlII = new WorldPoint(lIIlllIlI[22], lIIlllIlI[23], lIIlllIlI[1]);
                        if (o.lIIIIIllIllI(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lllllllIllIlII), lIIlllIlI[19])) {
                            AccBuilderEasyClues.c = lIIlllIII[lIIlllIlI[24]];
                            Movement.walkTo((WorldPoint)lllllllIllIlII);

                            Time.sleepTicks((int)lIIlllIlI[0]);

                        }
                        if (o.lIIIIIllIlll(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lllllllIllIlII), lIIlllIlI[19])) {
                            lllllllIllIIll = TileObjects.getNearest(tileObject -> {
                                int n2;
                                if (o.lIIIIIllIIII(tileObject.getName().contains(lIIlllIII[lIIlllIlI[100]]) ? 1 : 0)) {
                                    String[] stringArray = new String[lIIlllIlI[0]];
                                    stringArray[o.lIIlllIlI[1]] = lIIlllIII[lIIlllIlI[101]];
                                    if (o.lIIIIIllIIII(tileObject.hasAction(stringArray) ? 1 : 0)) {
                                        n2 = lIIlllIlI[0];

                                        if (null == null) return n2 != 0;
                                        return ((0x35 ^ 0x44 ^ (0x96 ^ 0xB7)) & (0x47 ^ 0x7A ^ (0x63 ^ 0xE) ^ -1)) != 0;
                                    }
                                }
                                n2 = lIIlllIlI[1];
                                return n2 != 0;
                            });
                            if (o.lIIIIIllIlII(lllllllIllIIll)) {
                                lllllllIllIIll.interact(lIIlllIII[lIIlllIlI[8]]);
                                Time.sleepTicks((int)lIIlllIlI[6]);

                            }
                            if (o.lIIIIIlllIIl(lllllllIllIIll)) {
                                String[] stringArray = new String[lIIlllIlI[14]];
                                stringArray[o.lIIlllIlI[1]] = lIIlllIII[lIIlllIlI[26]];
                                stringArray[o.lIIlllIlI[0]] = lIIlllIII[lIIlllIlI[27]];
                                stringArray[o.lIIlllIlI[5]] = lIIlllIII[lIIlllIlI[28]];
                                stringArray[o.lIIlllIlI[9]] = lIIlllIII[lIIlllIlI[29]];
                                stringArray[o.lIIlllIlI[6]] = lIIlllIII[lIIlllIlI[30]];
                                g.a(lIIlllIII[lIIlllIlI[25]], stringArray);
                            }
                        }
                    }
                    if (o.lIIIIIlllIII(Vars.getBit((int)lIIlllIlI[15]), lIIlllIlI[0]) && o.lIIIIIlllIII(Vars.getBit((int)lIIlllIlI[21]), lIIlllIlI[0])) {
                        lllllllIllIlII = new WorldArea(lIIlllIlI[31], lIIlllIlI[32], lIIlllIlI[33], lIIlllIlI[34], lIIlllIlI[1]);
                        if (o.lIIIIIllIIlI(lllllllIllIlII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            lllllllIllIIll = new WorldPoint(lIIlllIlI[22], lIIlllIlI[23], lIIlllIlI[1]);
                            if (o.lIIIIIllIllI(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lllllllIllIIll), lIIlllIlI[19])) {
                                AccBuilderEasyClues.c = lIIlllIII[lIIlllIlI[35]];
                                Movement.walkTo((WorldPoint)lllllllIllIIll);

                                Time.sleepTicks((int)lIIlllIlI[0]);

                            }
                            if (o.lIIIIIllIlll(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lllllllIllIIll), lIIlllIlI[19])) {
                                TileObject lllllllIllIIlI = TileObjects.getNearest(tileObject -> {
                                    int n2;
                                    if (o.lIIIIIllIIII(tileObject.getName().contains(lIIlllIII[lIIlllIlI[98]]) ? 1 : 0)) {
                                        String[] stringArray = new String[lIIlllIlI[0]];
                                        stringArray[o.lIIlllIlI[1]] = lIIlllIII[lIIlllIlI[99]];
                                        if (o.lIIIIIllIIII(tileObject.hasAction(stringArray) ? 1 : 0)) {
                                            n2 = lIIlllIlI[0];

                                            if (2 == 2) return n2 != 0;
                                            return false;
                                        }
                                    }
                                    n2 = lIIlllIlI[1];
                                    return n2 != 0;
                                });
                                if (o.lIIIIIllIlII(lllllllIllIIlI)) {
                                    lllllllIllIIlI.interact(lIIlllIII[lIIlllIlI[36]]);
                                    Time.sleepTicks((int)lIIlllIlI[6]);

                                }
                                if (o.lIIIIIlllIIl(lllllllIllIIlI)) {
                                    AccBuilderEasyClues.c = lIIlllIII[lIIlllIlI[37]];
                                    String[] stringArray = new String[lIIlllIlI[0]];
                                    stringArray[o.lIIlllIlI[1]] = lIIlllIII[lIIlllIlI[38]];
                                    NPCs.getNearest((String[])stringArray).interact(lIIlllIII[lIIlllIlI[39]]);
                                    Time.sleepTicks((int)lIIlllIlI[6]);

                                }
                            }
                        }
                        if (o.lIIIIIllIIII(lllllllIllIlII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            o.aA();
                        }
                    }
                }
            }
        }
    }

    private static boolean lIIIIIlllIII(int n2, int n3) {
        return n2 == n3;
    }

    private static void lIIIIIlIlllI() {
        lIIlllIII = new String[lIIlllIlI[103]];
        o.lIIlllIII[o.lIIlllIlI[1]] = "Finished buying items, switching back to quest";
        o.lIIlllIII[o.lIIlllIlI[0]] = "Nav to bank";
        o.lIIlllIII[o.lIIlllIlI[5]] = "Handling banking";
        o.lIIlllIII[o.lIIlllIlI[9]] = "We are missing quest supplies, switching to BUYING";
        o.lIIlllIII[o.lIIlllIlI[6]] = "We are missing quest supplies, switching to BUYING";
        o.lIIlllIII[o.lIIlllIlI[14]] = "Drink";
        o.lIIlllIII[o.lIIlllIlI[18]] = "Nav to osman";
        o.lIIlllIII[o.lIIlllIlI[19]] = "Osman";
        o.lIIlllIII[o.lIIlllIlI[20]] = "Is there anything I can help you with?";
        o.lIIlllIII[o.lIIlllIlI[24]] = "Nav to apprentice";
        o.lIIlllIII[o.lIIlllIlI[8]] = "Open";
        o.lIIlllIII[o.lIIlllIlI[25]] = "Apprentice";
        o.lIIlllIII[o.lIIlllIlI[26]] = "Surely there must be upsides to the task?";
        o.lIIlllIII[o.lIIlllIlI[27]] = "Oh, you can talk to me. I can see you're having a bad day.";
        o.lIIlllIII[o.lIIlllIlI[28]] = "A sympathetic ear can do wonders.";
        o.lIIlllIII[o.lIIlllIlI[29]] = "You mentioned something about the garden.";
        o.lIIlllIII[o.lIIlllIlI[30]] = "Wow, cast the spell on me. It will be good Magic training for you.";
        o.lIIlllIII[o.lIIlllIlI[35]] = "Nav to apprentice";
        o.lIIlllIII[o.lIIlllIlI[36]] = "Open";
        o.lIIlllIII[o.lIIlllIlI[37]] = "Clicking teleport";
        o.lIIlllIII[o.lIIlllIlI[38]] = "Apprentice";
        o.lIIlllIII[o.lIIlllIlI[39]] = "Teleport";
        o.lIIlllIII[o.lIIlllIlI[44]] = "Entering garden";
        o.lIIlllIII[o.lIIlllIlI[12]] = "Open";
        o.lIIlllIII[o.lIIlllIlI[42]] = "Waiting for npc to turn its back";
        o.lIIlllIII[o.lIIlllIlI[62]] = "Run to first tile";
        o.lIIlllIII[o.lIIlllIlI[67]] = "Waiting for npcs to be positioned";
        o.lIIlllIII[o.lIIlllIlI[69]] = "Run to 2nd tile";
        o.lIIlllIII[o.lIIlllIlI[72]] = "Run to third tile";
        o.lIIlllIII[o.lIIlllIlI[79]] = "Picking herbs";
        o.lIIlllIII[o.lIIlllIlI[80]] = "Pick";
        o.lIIlllIII[o.lIIlllIlI[81]] = "Picking herbs";
        o.lIIlllIII[o.lIIlllIlI[82]] = "Pick";
        o.lIIlllIII[o.lIIlllIlI[90]] = "Sorceress's Garden";
        o.lIIlllIII[o.lIIlllIlI[91]] = "ring of wealth (";
        o.lIIlllIII[o.lIIlllIlI[92]] = "dueling";
        o.lIIlllIII[o.lIIlllIlI[93]] = "dueling";
        o.lIIlllIII[o.lIIlllIlI[94]] = "Stamina";
        o.lIIlllIII[o.lIIlllIlI[95]] = "Herbs";
        o.lIIlllIII[o.lIIlllIlI[96]] = "Herbs";
        o.lIIlllIII[o.lIIlllIlI[87]] = "Gate";
        o.lIIlllIII[o.lIIlllIlI[98]] = "Door";
        o.lIIlllIII[o.lIIlllIlI[99]] = "Open";
        o.lIIlllIII[o.lIIlllIlI[100]] = "Door";
        o.lIIlllIII[o.lIIlllIlI[101]] = "Open";
        o.lIIlllIII[o.lIIlllIlI[102]] = "Yes.";
    }

    private static void af() {
        block11: {
            d lllllllIIlIIII;
            block10: {
                block9: {
                    block8: {
                        Predicate<Item> lllllllIIlIIIl;
                        int[] nArray = new int[lIIlllIlI[0]];
                        nArray[o.lIIlllIlI[1]] = lIIlllIlI[11];
                        if (o.lIIIIIllIIlI(Bank.contains((int[])nArray) ? 1 : 0)) {
                            d d2 = new DHelper(lIIlllIlI[11], lIIlllIlI[0], e.c(lIIlllIlI[83], lIIlllIlI[50]));
                            bv.add(d2);

                        }
                        if (o.lIIIIIllIIlI(Bank.contains(lllllllIIlIIIl = item -> item.getName().toLowerCase().contains(lIIlllIII[lIIlllIlI[91]])) ? 1 : 0)) {
                            lllllllIIlIIII = new DHelper(lIIlllIlI[84], lIIlllIlI[14], lIIlllIlI[85]);
                            bv.add(lllllllIIlIIII);

                        }
                        int[] nArray2 = new int[lIIlllIlI[0]];
                        nArray2[o.lIIlllIlI[1]] = lIIlllIlI[7];
                        if (!o.lIIIIIllIIII(Bank.contains((int[])nArray2) ? 1 : 0)) break block8;
                        int[] nArray3 = new int[lIIlllIlI[0]];
                        nArray3[o.lIIlllIlI[1]] = lIIlllIlI[7];
                        if (!o.lIIIIIllIIII(Bank.contains((int[])nArray3) ? 1 : 0)) break block9;
                        int[] nArray4 = new int[lIIlllIlI[0]];
                        nArray4[o.lIIlllIlI[1]] = lIIlllIlI[7];
                        if (!o.lIIIIIllIIIl(Bank.getFirst((int[])nArray4).getQuantity(), lIIlllIlI[86])) break block9;
                    }
                    lllllllIIlIIII = new DHelper(lIIlllIlI[7], lIIlllIlI[86], i.bq);
                    bv.add(lllllllIIlIIII);

                }
                int[] nArray = new int[lIIlllIlI[0]];
                nArray[o.lIIlllIlI[1]] = lIIlllIlI[10];
                if (!o.lIIIIIllIIII(Bank.contains((int[])nArray) ? 1 : 0)) break block10;
                int[] nArray5 = new int[lIIlllIlI[0]];
                nArray5[o.lIIlllIlI[1]] = lIIlllIlI[10];
                if (!o.lIIIIIllIIII(Bank.contains((int[])nArray5) ? 1 : 0)) break block11;
                int[] nArray6 = new int[lIIlllIlI[0]];
                nArray6[o.lIIlllIlI[1]] = lIIlllIlI[10];
                if (!o.lIIIIIllIIIl(Bank.getFirst((int[])nArray6).getQuantity(), lIIlllIlI[29])) break block11;
            }
            lllllllIIlIIII = new DHelper(lIIlllIlI[10], lIIlllIlI[87], lIIlllIlI[88]);
            bv.add(lllllllIIlIIII);

        }
    }
}

