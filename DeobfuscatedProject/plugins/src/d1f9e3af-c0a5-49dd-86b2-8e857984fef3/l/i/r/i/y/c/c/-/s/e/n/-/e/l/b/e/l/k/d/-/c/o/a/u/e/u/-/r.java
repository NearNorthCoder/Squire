/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.coords.LocalPoint
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 *  net.unethicalite.api.quests.QuestVarbits
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
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.quests.QuestVarbits;
import net.unethicalite.api.widgets.Dialog;

public class r
implements W {
    private static /* synthetic */ String[] bR;
    public static /* synthetic */ WorldPoint ci;
    private static /* synthetic */ WorldPoint cn;
    static /* synthetic */ boolean cm;
    private static /* synthetic */ int[] lIIllIIIl;
    public static /* synthetic */ WorldPoint bX;
    public static /* synthetic */ WorldPoint ck;
    public static /* synthetic */ WorldPoint cj;
    static /* synthetic */ int cl;
    public static /* synthetic */ boolean bt;
    public static /* synthetic */ List<d> bv;
    private static /* synthetic */ String[] lIIllIIII;

    private static boolean llllllllIlI(int n2) {
        return n2 <= 0;
    }

    private static boolean lllllllIIIl(int n2, int n3) {
        return n2 < n3;
    }

    private static String llllllIlIIl(String lIIIIIlIllllIII, String lIIIIIlIlllIlll) {
        try {
            SecretKeySpec lIIIIIlIllllIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIIIIIlIlllIlll.getBytes(StandardCharsets.UTF_8)), lIIllIIIl[16]), "DES");
            Cipher lIIIIIlIllllIlI = Cipher.getInstance("DES");
            lIIIIIlIllllIlI.init(lIIllIIIl[3], lIIIIIlIllllIll);
            return new String(lIIIIIlIllllIlI.doFinal(Base64.getDecoder().decode(lIIIIIlIllllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIIIIIlIllllIIl) {
            lIIIIIlIllllIIl.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean V() {
        boolean bl;
        if (r.llllllllIll(Vars.getBit((int)QuestVarbits.QUEST_A_PORCINE_OF_INTEREST.getId()), lIIllIIIl[57])) {
            bl = lIIllIIIl[0];
            "".length();
            if ((0x5E ^ 0x5A) < "  ".length()) {
                return ((2 ^ 0x1C) & ~(0x45 ^ 0x5B)) != 0;
            }
        } else {
            bl = lIIllIIIl[1];
        }
        return bl;
    }

    public static void aG() {
        block63: {
            block64: {
                block65: {
                    if (r.lllllllIIII(bt ? 1 : 0)) {
                        b.a(bv);
                        if (r.lllllllIIIl(bv.size(), lIIllIIIl[0])) {
                            System.out.println(lIIllIIII[lIIllIIIl[1]]);
                            bt = lIIllIIIl[1];
                        }
                    }
                    if (!r.lllllllIIlI(bt ? 1 : 0)) break block63;
                    if (r.lllllllIIlI(r.ab() ? 1 : 0) && r.lllllllIIlI(Vars.getBit((int)QuestVarbits.QUEST_A_PORCINE_OF_INTEREST.getId()))) {
                        BankLocation lIIIIIllIIIIllI = BankLocation.getNearest();
                        if (r.lllllllIIll(lIIIIIllIIIIllI) && r.lllllllIIlI(lIIIIIllIIIIllI.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderEasyClues.c = lIIllIIII[lIIllIIIl[0]];
                            a.a(lIIIIIllIIIIllI);
                        }
                        if (r.lllllllIIll(lIIIIIllIIIIllI) && r.lllllllIIII(lIIIIIllIIIIllI.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            if (r.lllllllIIlI(Bank.isOpen() ? 1 : 0)) {
                                a.a();
                                Time.sleepUntil(() -> Bank.isOpen(), (int)lIIllIIIl[2]);
                                "".length();
                            }
                            if (r.lllllllIIII(Bank.isOpen() ? 1 : 0)) {
                                AccBuilderEasyClues.c = lIIllIIII[lIIllIIIl[3]];
                                if (r.lllllllIlII(Inventory.getAll().size())) {
                                    Bank.depositInventory();
                                    Time.sleepTicks((int)lIIllIIIl[4]);
                                    "".length();
                                }
                                if (r.lllllllIlII(Equipment.getAll().size())) {
                                    Bank.depositEquipment();
                                    Time.sleepTicks((int)lIIllIIIl[3]);
                                    "".length();
                                }
                                int[] nArray = new int[lIIllIIIl[5]];
                                nArray[r.lIIllIIIl[1]] = lIIllIIIl[6];
                                nArray[r.lIIllIIIl[0]] = lIIllIIIl[7];
                                nArray[r.lIIllIIIl[3]] = lIIllIIIl[8];
                                nArray[r.lIIllIIIl[9]] = lIIllIIIl[10];
                                nArray[r.lIIllIIIl[4]] = lIIllIIIl[11];
                                nArray[r.lIIllIIIl[12]] = lIIllIIIl[13];
                                if (r.lllllllIIlI(e.b(nArray) ? 1 : 0)) {
                                    r.af();
                                    System.out.println(lIIllIIII[lIIllIIIl[9]]);
                                    bt = lIIllIIIl[0];
                                    return;
                                }
                                int[] nArray2 = new int[lIIllIIIl[5]];
                                nArray2[r.lIIllIIIl[1]] = lIIllIIIl[6];
                                nArray2[r.lIIllIIIl[0]] = lIIllIIIl[7];
                                nArray2[r.lIIllIIIl[3]] = lIIllIIIl[8];
                                nArray2[r.lIIllIIIl[9]] = lIIllIIIl[10];
                                nArray2[r.lIIllIIIl[4]] = lIIllIIIl[11];
                                nArray2[r.lIIllIIIl[12]] = lIIllIIIl[13];
                                if (r.lllllllIIII(e.b(nArray2) ? 1 : 0)) {
                                    int[] nArray3 = new int[lIIllIIIl[3]];
                                    nArray3[r.lIIllIIIl[1]] = lIIllIIIl[8];
                                    nArray3[r.lIIllIIIl[0]] = lIIllIIIl[10];
                                    a.a(nArray3);
                                    a.a(lIIllIIIl[6], lIIllIIIl[14]);
                                    a.a(lIIllIIIl[7], lIIllIIIl[14]);
                                    a.a(lIIllIIIl[15], lIIllIIIl[14]);
                                    a.b(f.aR, lIIllIIIl[0]);
                                    a.a(lIIllIIIl[11], lIIllIIIl[4]);
                                    a.a(lIIllIIIl[13], lIIllIIIl[16]);
                                }
                            }
                        }
                    }
                    if (r.lllllllIIII(Inventory.contains((int[])f.aV) ? 1 : 0) && r.lllllllIIIl(Movement.getRunEnergy(), lIIllIIIl[17])) {
                        Inventory.getFirst((int[])f.aV).interact(lIIllIIII[lIIllIIIl[4]]);
                        Time.sleepTicks((int)lIIllIIIl[0]);
                        "".length();
                    }
                    if (r.lllllllIIII(r.ab() ? 1 : 0) && r.lllllllIIlI(Vars.getBit((int)QuestVarbits.QUEST_A_PORCINE_OF_INTEREST.getId()))) {
                        if (r.lllllllIlIl(Players.getLocal().getWorldLocation().distanceTo(bX), lIIllIIIl[4])) {
                            if (r.lllllllIIII(Inventory.contains((int[])f.aR) ? 1 : 0) && r.lllllllIIlI(Equipment.contains((int[])f.aR) ? 1 : 0)) {
                                Inventory.getFirst((int[])f.aR).interact(lIIllIIII[lIIllIIIl[12]]);
                            }
                            if (r.lllllllIIII(Dialog.isOpen() ? 1 : 0)) {
                                Dialog.close();
                            }
                            AccBuilderEasyClues.c = lIIllIIII[lIIllIIIl[5]];
                            Movement.walkTo((WorldPoint)bX);
                            "".length();
                            Time.sleepTicks((int)lIIllIIIl[0]);
                            "".length();
                        }
                        if (r.lllllllIllI(Players.getLocal().getWorldLocation().distanceTo(bX), lIIllIIIl[4])) {
                            AccBuilderEasyClues.c = lIIllIIII[lIIllIIIl[18]];
                            cl = lIIllIIIl[1];
                            if (r.lllllllIIlI(Dialog.isOpen() ? 1 : 0)) {
                                String[] stringArray = new String[lIIllIIIl[0]];
                                stringArray[r.lIIllIIIl[1]] = lIIllIIII[lIIllIIIl[16]];
                                TileObjects.getNearest((String[])stringArray).interact(lIIllIIII[lIIllIIIl[19]]);
                                Time.sleepTicks((int)lIIllIIIl[3]);
                                "".length();
                            }
                            g.a(bR);
                        }
                    }
                    if (r.lllllllIlll(Vars.getBit((int)QuestVarbits.QUEST_A_PORCINE_OF_INTEREST.getId()), lIIllIIIl[12])) {
                        if (r.lllllllIlIl(Players.getLocal().getWorldLocation().distanceTo(ci), lIIllIIIl[4])) {
                            AccBuilderEasyClues.c = lIIllIIII[lIIllIIIl[14]];
                            Movement.walkTo((WorldPoint)ci);
                            "".length();
                            Time.sleepTicks((int)lIIllIIIl[0]);
                            "".length();
                            if (r.lllllllIIII(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(lIIllIIIl[20], lIIllIIIl[21], lIIllIIIl[1])) ? 1 : 0)) {
                                AccBuilderEasyClues.c = lIIllIIII[lIIllIIIl[22]];
                                e.c(new WorldPoint(lIIllIIIl[23], lIIllIIIl[24], lIIllIIIl[1]));
                                Time.sleepTicks((int)lIIllIIIl[5]);
                                "".length();
                            }
                        }
                        if (r.lllllllIllI(Players.getLocal().getWorldLocation().distanceTo(ci), lIIllIIIl[4])) {
                            AccBuilderEasyClues.c = lIIllIIII[lIIllIIIl[25]];
                            g.a(lIIllIIII[lIIllIIIl[26]], bR, lIIllIIIl[0]);
                        }
                    }
                    if (r.lllllllIlll(Vars.getBit((int)QuestVarbits.QUEST_A_PORCINE_OF_INTEREST.getId()), lIIllIIIl[14])) {
                        if (r.lllllllIlIl(Players.getLocal().getWorldLocation().distanceTo(cj), lIIllIIIl[4])) {
                            AccBuilderEasyClues.c = lIIllIIII[lIIllIIIl[27]];
                            Movement.walkTo((WorldPoint)cj);
                            "".length();
                            Time.sleepTicks((int)lIIllIIIl[0]);
                            "".length();
                        }
                        if (r.lllllllIllI(Players.getLocal().getWorldLocation().distanceTo(cj), lIIllIIIl[4])) {
                            int[] nArray = new int[lIIllIIIl[0]];
                            nArray[r.lIIllIIIl[1]] = lIIllIIIl[8];
                            if (r.lllllllIIII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                                int[] nArray4 = new int[lIIllIIIl[0]];
                                nArray4[r.lIIllIIIl[1]] = lIIllIIIl[8];
                                String[] stringArray = new String[lIIllIIIl[0]];
                                stringArray[r.lIIllIIIl[1]] = lIIllIIII[lIIllIIIl[28]];
                                Inventory.getFirst((int[])nArray4).useOn(TileObjects.getNearest((String[])stringArray));
                                Time.sleepTicks((int)lIIllIIIl[3]);
                                "".length();
                            }
                        }
                    }
                    if (!r.lllllllIlll(Vars.getBit((int)QuestVarbits.QUEST_A_PORCINE_OF_INTEREST.getId()), lIIllIIIl[28])) break block64;
                    int[] nArray = new int[lIIllIIIl[0]];
                    nArray[r.lIIllIIIl[1]] = lIIllIIIl[10];
                    if (r.lllllllIIII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        int[] nArray5 = new int[lIIllIIIl[0]];
                        nArray5[r.lIIllIIIl[1]] = lIIllIIIl[10];
                        Inventory.getFirst((int[])nArray5).interact(lIIllIIII[lIIllIIIl[29]]);
                    }
                    if (r.lllllllIllI(Players.getLocal().getWorldLocation().distanceTo(cj), lIIllIIIl[4])) {
                        String[] stringArray = new String[lIIllIIIl[0]];
                        stringArray[r.lIIllIIIl[1]] = lIIllIIII[lIIllIIIl[30]];
                        TileObjects.getNearest((String[])stringArray).interact(lIIllIIII[lIIllIIIl[31]]);
                        Time.sleepTicks((int)lIIllIIIl[9]);
                        "".length();
                    }
                    if (!r.lllllllIlIl(Players.getLocal().getLocalLocation().distanceTo(new LocalPoint(lIIllIIIl[32], lIIllIIIl[33])), lIIllIIIl[34])) break block65;
                    String[] stringArray = new String[lIIllIIIl[0]];
                    stringArray[r.lIIllIIIl[1]] = lIIllIIII[lIIllIIIl[35]];
                    if (!r.lllllllIIll(TileObjects.getNearest((String[])stringArray))) break block64;
                }
                String[] stringArray = new String[lIIllIIIl[0]];
                stringArray[r.lIIllIIIl[1]] = lIIllIIII[lIIllIIIl[36]];
                if (r.lllllllIIll(TileObjects.getNearest((String[])stringArray))) {
                    if (r.lllllllIlIl(Players.getLocal().getLocalLocation().getY(), lIIllIIIl[37])) {
                        String[] stringArray2 = new String[lIIllIIIl[0]];
                        stringArray2[r.lIIllIIIl[1]] = lIIllIIII[lIIllIIIl[38]];
                        if (r.lllllllIllI(Players.getLocal().getWorldLocation().distanceTo(TileObjects.getNearest((String[])stringArray2).getWorldLocation()), lIIllIIIl[14])) {
                            String[] stringArray3 = new String[lIIllIIIl[0]];
                            stringArray3[r.lIIllIIIl[1]] = lIIllIIII[lIIllIIIl[39]];
                            if (r.llllllllIII(NPCs.getNearest((String[])stringArray3))) {
                                AccBuilderEasyClues.c = lIIllIIII[lIIllIIIl[40]];
                                String[] stringArray4 = new String[lIIllIIIl[0]];
                                stringArray4[r.lIIllIIIl[1]] = lIIllIIII[lIIllIIIl[41]];
                                TileObjects.getNearest((String[])stringArray4).interact(lIIllIIII[lIIllIIIl[42]]);
                                Time.sleepTicks((int)lIIllIIIl[14]);
                                "".length();
                            }
                        }
                    }
                    String[] stringArray5 = new String[lIIllIIIl[0]];
                    stringArray5[r.lIIllIIIl[1]] = lIIllIIII[lIIllIIIl[43]];
                    if (r.llllllllIII(NPCs.getNearest((String[])stringArray5)) && r.lllllllIIlI(Dialog.isOpen() ? 1 : 0)) {
                        AccBuilderEasyClues.c = lIIllIIII[lIIllIIIl[44]];
                        String[] stringArray6 = new String[lIIllIIIl[0]];
                        stringArray6[r.lIIllIIIl[1]] = lIIllIIII[lIIllIIIl[45]];
                        TileObjects.getNearest((String[])stringArray6).interact(lIIllIIII[lIIllIIIl[46]]);
                        Time.sleepTicks((int)lIIllIIIl[12]);
                        "".length();
                        g.a(bR);
                    }
                    g.a(bR);
                }
            }
            if (r.lllllllIlll(Vars.getBit((int)QuestVarbits.QUEST_A_PORCINE_OF_INTEREST.getId()), lIIllIIIl[36])) {
                AccBuilderEasyClues.c = lIIllIIII[lIIllIIIl[47]];
                g.a(lIIllIIII[lIIllIIIl[48]], bR);
            }
            if (r.lllllllIlll(Vars.getBit((int)QuestVarbits.QUEST_A_PORCINE_OF_INTEREST.getId()), lIIllIIIl[42])) {
                if (r.lllllllIlIl(Players.getLocal().getWorldLocation().distanceTo(cj), lIIllIIIl[4])) {
                    String[] stringArray = new String[lIIllIIIl[0]];
                    stringArray[r.lIIllIIIl[1]] = lIIllIIII[lIIllIIIl[49]];
                    if (r.llllllllIII(NPCs.getNearest((String[])stringArray))) {
                        String[] stringArray7 = new String[lIIllIIIl[0]];
                        stringArray7[r.lIIllIIIl[1]] = lIIllIIII[lIIllIIIl[50]];
                        if (r.lllllllIIlI(Equipment.contains((String[])stringArray7) ? 1 : 0)) {
                            String[] stringArray8 = new String[lIIllIIIl[0]];
                            stringArray8[r.lIIllIIIl[1]] = lIIllIIII[lIIllIIIl[51]];
                            if (r.lllllllIIII(Inventory.contains((String[])stringArray8) ? 1 : 0)) {
                                String[] stringArray9 = new String[lIIllIIIl[0]];
                                stringArray9[r.lIIllIIIl[1]] = lIIllIIII[lIIllIIIl[52]];
                                Inventory.getFirst((String[])stringArray9).interact(lIIllIIII[lIIllIIIl[53]]);
                            }
                        }
                        AccBuilderEasyClues.c = lIIllIIII[lIIllIIIl[54]];
                        Movement.walkTo((WorldPoint)cj);
                        "".length();
                        Time.sleepTicks((int)lIIllIIIl[0]);
                        "".length();
                    }
                }
                if (r.lllllllIllI(Players.getLocal().getWorldLocation().distanceTo(cj), lIIllIIIl[4])) {
                    AccBuilderEasyClues.c = lIIllIIII[lIIllIIIl[55]];
                    String[] stringArray = new String[lIIllIIIl[0]];
                    stringArray[r.lIIllIIIl[1]] = lIIllIIII[lIIllIIIl[56]];
                    if (r.lllllllIIll(TileObjects.getNearest((String[])stringArray))) {
                        String[] stringArray10 = new String[lIIllIIIl[0]];
                        stringArray10[r.lIIllIIIl[1]] = lIIllIIII[lIIllIIIl[57]];
                        TileObjects.getNearest((String[])stringArray10).interact(lIIllIIII[lIIllIIIl[58]]);
                        Time.sleepTicks((int)lIIllIIIl[9]);
                        "".length();
                    }
                }
                if (r.lllllllIlIl(Players.getLocal().getLocalLocation().getY(), lIIllIIIl[37])) {
                    String[] stringArray = new String[lIIllIIIl[0]];
                    stringArray[r.lIIllIIIl[1]] = lIIllIIII[lIIllIIIl[59]];
                    if (r.lllllllIlIl(Players.getLocal().getWorldLocation().distanceTo(TileObjects.getNearest((String[])stringArray).getWorldLocation()), lIIllIIIl[18])) {
                        AccBuilderEasyClues.c = lIIllIIII[lIIllIIIl[60]];
                        String[] stringArray11 = new String[lIIllIIIl[0]];
                        stringArray11[r.lIIllIIIl[1]] = lIIllIIII[lIIllIIIl[61]];
                        TileObjects.getNearest((String[])stringArray11).interact(lIIllIIII[lIIllIIIl[62]]);
                        Time.sleepTicks((int)lIIllIIIl[14]);
                        "".length();
                    }
                }
                if (r.llllllllIII(Players.getLocal().getInteracting()) && r.lllllllIIlI(Dialog.isOpen() ? 1 : 0)) {
                    String[] stringArray = new String[lIIllIIIl[0]];
                    stringArray[r.lIIllIIIl[1]] = lIIllIIII[lIIllIIIl[63]];
                    if (r.lllllllIIlI(Equipment.contains((String[])stringArray) ? 1 : 0)) {
                        String[] stringArray12 = new String[lIIllIIIl[0]];
                        stringArray12[r.lIIllIIIl[1]] = lIIllIIII[lIIllIIIl[64]];
                        if (r.lllllllIIII(Inventory.contains((String[])stringArray12) ? 1 : 0)) {
                            String[] stringArray13 = new String[lIIllIIIl[0]];
                            stringArray13[r.lIIllIIIl[1]] = lIIllIIII[lIIllIIIl[65]];
                            Inventory.getFirst((String[])stringArray13).interact(lIIllIIII[lIIllIIIl[66]]);
                        }
                    }
                    int[] nArray = new int[lIIllIIIl[0]];
                    nArray[r.lIIllIIIl[1]] = lIIllIIIl[10];
                    if (r.lllllllIIII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        int[] nArray6 = new int[lIIllIIIl[0]];
                        nArray6[r.lIIllIIIl[1]] = lIIllIIIl[10];
                        if (r.lllllllIIlI(Equipment.contains((int[])nArray6) ? 1 : 0)) {
                            int[] nArray7 = new int[lIIllIIIl[0]];
                            nArray7[r.lIIllIIIl[1]] = lIIllIIIl[10];
                            Inventory.getFirst((int[])nArray7).interact(lIIllIIII[lIIllIIIl[34]]);
                        }
                    }
                    String[] stringArray14 = new String[lIIllIIIl[0]];
                    stringArray14[r.lIIllIIIl[1]] = lIIllIIII[lIIllIIIl[67]];
                    NPCs.getNearest((String[])stringArray14).interact(lIIllIIII[lIIllIIIl[68]]);
                    Time.sleepTicks((int)lIIllIIIl[0]);
                    "".length();
                }
                if (r.llllllllIIl(r.llllllIllll(e.u(), 60.0))) {
                    int[] nArray = new int[lIIllIIIl[0]];
                    nArray[r.lIIllIIIl[1]] = lIIllIIIl[13];
                    if (r.lllllllIIII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        int[] nArray8 = new int[lIIllIIIl[0]];
                        nArray8[r.lIIllIIIl[1]] = lIIllIIIl[13];
                        Inventory.getFirst((int[])nArray8).interact(lIIllIIII[lIIllIIIl[69]]);
                        Time.sleepTicks((int)lIIllIIIl[0]);
                        "".length();
                    }
                }
                g.a(bR);
            }
            if (r.lllllllIlll(Vars.getBit((int)QuestVarbits.QUEST_A_PORCINE_OF_INTEREST.getId()), lIIllIIIl[47])) {
                String[] stringArray = new String[lIIllIIIl[0]];
                stringArray[r.lIIllIIIl[1]] = lIIllIIII[lIIllIIIl[70]];
                if (r.lllllllIIlI(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIIllIIII[lIIllIIIl[71]];
                    String[] stringArray15 = new String[lIIllIIIl[0]];
                    stringArray15[r.lIIllIIIl[1]] = lIIllIIII[lIIllIIIl[72]];
                    TileObjects.getNearest((String[])stringArray15).interact(lIIllIIII[lIIllIIIl[73]]);
                    Time.sleepTicks((int)lIIllIIIl[4]);
                    "".length();
                }
                String[] stringArray16 = new String[lIIllIIIl[0]];
                stringArray16[r.lIIllIIIl[1]] = lIIllIIII[lIIllIIIl[74]];
                if (r.lllllllIIII(Inventory.contains((String[])stringArray16) ? 1 : 0)) {
                    if (r.lllllllIlIl(Players.getLocal().getWorldLocation().distanceTo(ci), lIIllIIIl[4])) {
                        AccBuilderEasyClues.c = lIIllIIII[lIIllIIIl[75]];
                        Movement.walkTo((WorldPoint)ci);
                        "".length();
                        Time.sleepTicks((int)lIIllIIIl[0]);
                        "".length();
                        if (r.lllllllIIII(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(lIIllIIIl[20], lIIllIIIl[21], lIIllIIIl[1])) ? 1 : 0)) {
                            AccBuilderEasyClues.c = lIIllIIII[lIIllIIIl[76]];
                            e.c(new WorldPoint(lIIllIIIl[23], lIIllIIIl[24], lIIllIIIl[1]));
                            Time.sleepTicks((int)lIIllIIIl[5]);
                            "".length();
                        }
                    }
                    if (r.lllllllIllI(Players.getLocal().getWorldLocation().distanceTo(ci), lIIllIIIl[4])) {
                        AccBuilderEasyClues.c = lIIllIIII[lIIllIIIl[77]];
                        g.a(lIIllIIII[lIIllIIIl[78]], bR, lIIllIIIl[0]);
                    }
                }
            }
            if (r.lllllllIlll(Vars.getBit((int)QuestVarbits.QUEST_A_PORCINE_OF_INTEREST.getId()), lIIllIIIl[52])) {
                if (r.lllllllIlIl(Players.getLocal().getWorldLocation().distanceTo(ck), lIIllIIIl[9])) {
                    AccBuilderEasyClues.c = lIIllIIII[lIIllIIIl[79]];
                    Movement.walkTo((WorldPoint)ck);
                    "".length();
                    Time.sleepTicks((int)lIIllIIIl[0]);
                    "".length();
                }
                if (r.lllllllIllI(Players.getLocal().getWorldLocation().distanceTo(ck), lIIllIIIl[9])) {
                    AccBuilderEasyClues.c = lIIllIIII[lIIllIIIl[80]];
                    if (r.lllllllIIIl(cl, lIIllIIIl[0])) {
                        an.pm += lIIllIIIl[0];
                        an.o(AccBuilderEasyClues.m);
                        cl += lIIllIIIl[0];
                        an.pm = lIIllIIIl[1];
                        cm = lIIllIIIl[1];
                    }
                    g.a(lIIllIIII[lIIllIIIl[17]], bR);
                }
            }
        }
    }

    private static void llllllIllIl() {
        lIIllIIII = new String[lIIllIIIl[100]];
        r.lIIllIIII[r.lIIllIIIl[1]] = r.llllllIlIIl("tRYjBS9s/B9LqRqRREQDeGt1aXXAsSPYetHOCNJkgUk7O5FnS1c0iUBSeXaVdQet", "OLeRS");
        r.lIIllIIII[r.lIIllIIIl[0]] = r.llllllIlIlI("CwYnWBoqRzMZAC4=", "EgQxn");
        r.lIIllIIII[r.lIIllIIIl[3]] = r.llllllIlIll("jX9LG88i+Ivl1s0FfzsRRQ5N7TYhdBMN", "rVTCe");
        r.lIIllIIII[r.lIIllIIIl[9]] = r.llllllIlIll("iSBdhwlEm2IJCAPBgXGov9jMMRvhYyLebrm/aG1I2T/AWtFWDsjAhTQTrgeqqIbhqmZv6CRgMAk=", "Wgacw");
        r.lIIllIIII[r.lIIllIIIl[4]] = r.llllllIlIlI("CCMuJCI=", "LQGJI");
        r.lIIllIIII[r.lIIllIIIl[12]] = r.llllllIlIlI("AicwOQ==", "UBQKY");
        r.lIIllIIII[r.lIIllIIIl[5]] = r.llllllIlIll("vFClwaJFI5q1xgbfEvrdLw==", "eIKpL");
        r.lIIllIIII[r.lIIllIIIl[18]] = r.llllllIlIIl("opkNDFGSgX+CpnVdb0f3Qw==", "ItVWq");
        r.lIIllIIII[r.lIIllIIIl[16]] = r.llllllIlIll("zBatLenL9HCxLZazyjTFYA==", "CVUiP");
        r.lIIllIIII[r.lIIllIIIl[19]] = r.llllllIlIlI("Ox0uNBE=", "xuKWz");
        r.lIIllIIII[r.lIIllIIIl[14]] = r.llllllIlIlI("Cwo4ZhcqSz0nESQD", "EkNFc");
        r.lIIllIIII[r.lIIllIIIl[22]] = r.llllllIlIlI("HjwgFQxhaDYaDi4jPBgAbScgAg==", "MHUvg");
        r.lIIllIIII[r.lIIllIIIl[25]] = r.llllllIlIlI("IQgoDi4bDmQWJgcILA==", "uiDeG");
        r.lIIllIIII[r.lIIllIIIl[26]] = r.llllllIlIll("84CzhUoxN2Q=", "fIesL");
        r.lIIllIIII[r.lIIllIIIl[27]] = r.llllllIlIll("w8ffIWvfc2E3HH0ciF0rzA==", "ViYLo");
        r.lIIllIIII[r.lIIllIIIl[28]] = r.llllllIlIIl("7UP3GEtfYwan1C0BlaEpDQ==", "WBfyM");
        r.lIIllIIII[r.lIIllIIIl[29]] = r.llllllIlIlI("FBkCFBE=", "Cpgxu");
        r.lIIllIIII[r.lIIllIIIl[30]] = r.llllllIlIIl("l8pLSLObwZe5xBl9wwxQaA==", "xmyOS");
        r.lIIllIIII[r.lIIllIIIl[31]] = r.llllllIlIll("5QIwaJVXi4sdXF69OKJz4Q==", "SfzIa");
        r.lIIllIIII[r.lIIllIIIl[35]] = r.llllllIlIIl("KFZrora9RMQP07wZRgfXdQ==", "mbuMP");
        r.lIIllIIII[r.lIIllIIIl[36]] = r.llllllIlIll("w65ySFSGMvrfwsZxKBt3Zw==", "wmjDk");
        r.lIIllIIII[r.lIIllIIIl[38]] = r.llllllIlIIl("OZNIh0b1ooUTn5KXzemTNQ==", "hiPJb");
        r.lIIllIIII[r.lIIllIIIl[39]] = r.llllllIlIll("off2R57vyueIhVJwK+xy3g==", "RtREQ");
        r.lIIllIIII[r.lIIllIIIl[40]] = r.llllllIlIlI("CysdPDpoKAI0KmglGD47IyYTNA==", "HGtQX");
        r.lIIllIIII[r.lIIllIIIl[41]] = r.llllllIlIll("kdYQhQGXXd9u4udgp8Ey1w==", "bpBPr");
        r.lIIllIIII[r.lIIllIIIl[42]] = r.llllllIlIlI("EC8rKDh+LDQgKA==", "SCBEZ");
        r.lIIllIIII[r.lIIllIIIl[43]] = r.llllllIlIll("vJDjThguR+xj8pHwDBuGhA==", "ZHZni");
        r.lIIllIIII[r.lIIllIIIl[44]] = r.llllllIlIlI("IDg3MSMINTd0IgIzLzE=", "iVCTQ");
        r.lIIllIIII[r.lIIllIIIl[45]] = r.llllllIlIIl("mVMp415We8nFSDhWIrFlTQ==", "GZmUZ");
        r.lIIllIIII[r.lIIllIIIl[46]] = r.llllllIlIll("J2jBv5Svh14x5tRSUK3ESQ==", "krCxj");
        r.lIIllIIII[r.lIIllIIIl[47]] = r.llllllIlIlI("MCMTHQYYLhMRGh5tNAgdCyw=", "yMgxt");
        r.lIIllIIII[r.lIIllIIIl[48]] = r.llllllIlIIl("Fs4wzRpAd9w=", "VTVKh");
        r.lIIllIIII[r.lIIllIIIl[49]] = r.llllllIlIIl("+6kbSrOsxLM=", "hmDSC");
        r.lIIllIIII[r.lIIllIIIl[50]] = r.llllllIlIlI("OigAHAgHPwoXCkgqBhUJBCga", "hMirn");
        r.lIIllIIII[r.lIIllIIIl[51]] = r.llllllIlIlI("Nz8mPAQKKCw3BkU9IDUFCT88", "eZORb");
        r.lIIllIIII[r.lIIllIIIl[52]] = r.llllllIlIlI("FSQeJDAoMxQvMmcmGC0xKyQE", "GAwJV");
        r.lIIllIIII[r.lIIllIIIl[53]] = r.llllllIlIll("3TwWCWzErKY=", "KFYVk");
        r.lIIllIIII[r.lIIllIIIl[54]] = r.llllllIlIIl("UratkYAWkJ79cLBmF49B5w==", "kZFzj");
        r.lIIllIIII[r.lIIllIIIl[55]] = r.llllllIlIIl("ZyvE35vsLCgQwox5EjqWbQ==", "gtXqv");
        r.lIIllIIII[r.lIIllIIIl[56]] = r.llllllIlIIl("iqU/9tE97/NwphQSXR54pg==", "bBznX");
        r.lIIllIIII[r.lIIllIIIl[57]] = r.llllllIlIlI("BAMjIz4wEnEqPzsS", "WwQBP");
        r.lIIllIIII[r.lIIllIIIl[58]] = r.llllllIlIlI("DyQIAQVhLA4bCQ==", "LHalg");
        r.lIIllIIII[r.lIIllIIIl[59]] = r.llllllIlIIl("Nqs7div1HbXh88gUiQU9fQ==", "EKPqC");
        r.lIIllIIII[r.lIIllIIIl[60]] = r.llllllIlIlI("MD0ePzJTPgE3IlMzGz0zGDAQNw==", "sQwRP");
        r.lIIllIIII[r.lIIllIIIl[61]] = r.llllllIlIIl("il9lm/jxOKBvjlHT3SfxlA==", "fSjCl");
        r.lIIllIIII[r.lIIllIIIl[62]] = r.llllllIlIll("3wJ2JPcfLMAP/UuyEZaF3g==", "JgYQj");
        r.lIIllIIII[r.lIIllIIIl[63]] = r.llllllIlIIl("G5aEN7HM7SnSeZXSdm1QhXjRkRqhlzCD", "pueAx");
        r.lIIllIIII[r.lIIllIIIl[64]] = r.llllllIlIll("xUYTuiDKJqqon6kbrUzLJdAVeMbWBZXX", "iCLRU");
        r.lIIllIIII[r.lIIllIIIl[65]] = r.llllllIlIll("/EcCD0h1TLsv0epHmc1ZCin0ww2ziPgQ", "tulAW");
        r.lIIllIIII[r.lIIllIIIl[66]] = r.llllllIlIIl("VxHFu8q2osg=", "qYXmp");
        r.lIIllIIII[r.lIIllIIIl[34]] = r.llllllIlIIl("B86vKYHRVGo=", "HviNz");
        r.lIIllIIII[r.lIIllIIIl[67]] = r.llllllIlIll("HAvHtwlSMso=", "DDWjb");
        r.lIIllIIII[r.lIIllIIIl[68]] = r.llllllIlIlI("BC4YCDYu", "EZliU");
        r.lIIllIIII[r.lIIllIIIl[69]] = r.llllllIlIIl("BX0NH/PotMU=", "MsqjK");
        r.lIIllIIII[r.lIIllIIIl[70]] = r.llllllIlIlI("CwM5BQ43C2wRCTcY", "XlLwf");
        r.lIIllIIII[r.lIIllIIIl[71]] = r.llllllIlIIl("EO2Z42aPZoHJNQ1KvbsZvg==", "CXJiK");
        r.lIIllIIII[r.lIIllIIIl[72]] = r.llllllIlIll("dZlKq2yF/RCplEFJmavtYg==", "oosFl");
        r.lIIllIIII[r.lIIllIIIl[73]] = r.llllllIlIll("couibGOtGIeIcf5efopt0g==", "gcIBK");
        r.lIIllIIII[r.lIIllIIIl[74]] = r.llllllIlIIl("mCjDaeJpm+BAKh705sB9HQ==", "AWlLe");
        r.lIIllIIII[r.lIIllIIIl[75]] = r.llllllIlIll("uA1Rg1LEu+kfBpVZq75dbQ==", "kfsNK");
        r.lIIllIIII[r.lIIllIIIl[76]] = r.llllllIlIIl("LHRWKZIvvzV88aTLkwih0KGZlFL/dXRd", "tPAAf");
        r.lIIllIIII[r.lIIllIIIl[77]] = r.llllllIlIlI("MTUAPjgLM0wmMBc1BA==", "eTlUQ");
        r.lIIllIIII[r.lIIllIIIl[78]] = r.llllllIlIll("eyD6JFUwjuw=", "RIJxn");
        r.lIIllIIII[r.lIIllIIIl[79]] = r.llllllIlIIl("ek1aGeWGbY3wHgpis0Amgw==", "sFxLI");
        r.lIIllIIII[r.lIIllIIIl[80]] = r.llllllIlIlI("LhUVHz4UE1kHJwgdGA==", "ztytW");
        r.lIIllIIII[r.lIIllIIIl[17]] = r.llllllIlIlI("GBMQPSI=", "KcbTC");
        r.lIIllIIII[r.lIIllIIIl[86]] = r.llllllIlIll("LnDrRoh0J9KLjeZezOzeD4DH0JvJH5tE", "vXpUs");
        r.lIIllIIII[r.lIIllIIIl[87]] = r.llllllIlIll("q4LQjk27I3Q64mrD04Vod9EnP9baR1JU", "KPZPX");
        r.lIIllIIII[r.lIIllIIIl[96]] = r.llllllIlIll("8MMq/8ntSqQ=", "dddgJ");
        r.lIIllIIII[r.lIIllIIIl[97]] = r.llllllIlIIl("Plqf9EvhWGN/1TXueS++JBrGU/5IY3rP", "ZeFnr");
        r.lIIllIIII[r.lIIllIIIl[98]] = r.llllllIlIlI("BlgzKzwhE2c3PS4MYC85bxoiYzQjFGclOj1YKSwiYQ==", "OxGCU");
        r.lIIllIIII[r.lIIllIIIl[99]] = r.llllllIlIIl("pt2JLJg3joc=", "hWglP");
    }

    private static boolean lllllllIllI(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean llllllllIIl(int n2) {
        return n2 < 0;
    }

    private static void llllllIlllI() {
        lIIllIIIl = new int[101];
        r.lIIllIIIl[0] = " ".length();
        r.lIIllIIIl[1] = (0x1B ^ 3 ^ (2 ^ 0x5B)) & (0x17 ^ 0x44 ^ (0xA6 ^ 0xB4) ^ -" ".length());
        r.lIIllIIIl[2] = -(0xFFFFDCFF & 0x2B57) & (0xFFFFFBDF & 0x1FFE);
        r.lIIllIIIl[3] = "  ".length();
        r.lIIllIIIl[4] = 79 + 84 - 61 + 32 ^ 129 + 116 - 218 + 103;
        r.lIIllIIIl[5] = "  ".length() ^ (0xBD ^ 0xB9);
        r.lIIllIIIl[6] = 0xFFFFBF47 & 0x5FFF;
        r.lIIllIIIl[7] = -(125 + 124 - 70 + 3) & (0xFFFFFFFF & 0x1FFD);
        r.lIIllIIIl[8] = -(0xFFFFFCE5 & 0xF5F) & (0xFFFFBFFE & 0x4FFF);
        r.lIIllIIIl[9] = "   ".length();
        r.lIIllIIIl[10] = -(0xFFFFE69D & 0x1BEF) & (0xFFFF9FBF & 0x67FF);
        r.lIIllIIIl[11] = 0xFFFFF1DD & 0x3F73;
        r.lIIllIIIl[12] = 0x7F ^ 0x7A;
        r.lIIllIIIl[13] = 0xFFFF87FF & 0x797B;
        r.lIIllIIIl[14] = 3 ^ 0x79 ^ (0xEC ^ 0x9C);
        r.lIIllIIIl[15] = 0xFFFFDFE9 & 0x3F5F;
        r.lIIllIIIl[16] = 0xAA ^ 0xA2;
        r.lIIllIIIl[17] = 6 ^ 0x2B ^ (0x1E ^ 0x72);
        r.lIIllIIIl[18] = 0x41 ^ 0x46;
        r.lIIllIIIl[19] = 0x6B ^ 0x62;
        r.lIIllIIIl[20] = 0xFFFF8BF2 & 0x7FEF;
        r.lIIllIIIl[21] = 0xFFFFDEFB & 0x2DED;
        r.lIIllIIIl[22] = "  ".length() ^ (0xF ^ 6);
        r.lIIllIIIl[23] = -(0xFFFFEC61 & 0x77BF) & (0xFFFFFFFF & 0x6FFF);
        r.lIIllIIIl[24] = 0xFFFF8EFD & 0x7DE3;
        r.lIIllIIIl[25] = 0x3C ^ 0x4E ^ (0x69 ^ 0x17);
        r.lIIllIIIl[26] = 0x84 ^ 0x89;
        r.lIIllIIIl[27] = 0x85 ^ 0x8B;
        r.lIIllIIIl[28] = 0x13 ^ 0x1C;
        r.lIIllIIIl[29] = 0x44 ^ 0xF ^ (0x61 ^ 0x3A);
        r.lIIllIIIl[30] = 0x4E ^ 0x5F;
        r.lIIllIIIl[31] = 4 ^ 0x16;
        r.lIIllIIIl[32] = 0xFFFFFBF0 & 0x1F4F;
        r.lIIllIIIl[33] = -(0xFFFFC89D & 0x7773) & (0xFFFFD9D2 & 0x7EFD);
        r.lIIllIIIl[34] = 4 + 27 - -48 + 91 ^ 44 + 50 - 4 + 62;
        r.lIIllIIIl[35] = 70 + 6 - 29 + 89 ^ 115 + 32 - 25 + 33;
        r.lIIllIIIl[36] = "   ".length() ^ (0x8D ^ 0x9A);
        r.lIIllIIIl[37] = -(0xFFFFFDE9 & 0x2A37) & (0xFFFFBBEC & 0x7FF3);
        r.lIIllIIIl[38] = 0x95 ^ 0x80;
        r.lIIllIIIl[39] = 0x5A ^ 0x4C;
        r.lIIllIIIl[40] = 0x33 ^ 0x24;
        r.lIIllIIIl[41] = 0xAA ^ 0xB2;
        r.lIIllIIIl[42] = 0x7E ^ 0x67;
        r.lIIllIIIl[43] = 61 + 58 - 82 + 126 ^ 33 + 75 - -70 + 7;
        r.lIIllIIIl[44] = 0xAA ^ 0xB1;
        r.lIIllIIIl[45] = 7 ^ 0x1B;
        r.lIIllIIIl[46] = 0x1A ^ 7;
        r.lIIllIIIl[47] = 166 + 78 - 51 + 30 ^ 119 + 23 - 34 + 85;
        r.lIIllIIIl[48] = 99 + 33 - 131 + 147 ^ 68 + 132 - 199 + 138;
        r.lIIllIIIl[49] = 0x55 ^ 0x47 ^ (9 ^ 0x3B);
        r.lIIllIIIl[50] = 0xAB ^ 0x8A;
        r.lIIllIIIl[51] = 0xB7 ^ 0x95;
        r.lIIllIIIl[52] = 93 + 111 - 184 + 121 ^ 91 + 128 - 204 + 159;
        r.lIIllIIIl[53] = 32 + 46 - -60 + 13 ^ 56 + 27 - -75 + 21;
        r.lIIllIIIl[54] = 0xB0 ^ 0x95;
        r.lIIllIIIl[55] = 0x90 ^ 0xB6;
        r.lIIllIIIl[56] = 0x53 ^ 0x10 ^ (0xE6 ^ 0x82);
        r.lIIllIIIl[57] = 0x7C ^ 0x54;
        r.lIIllIIIl[58] = 0x5C ^ 0x75;
        r.lIIllIIIl[59] = 9 ^ 0x23;
        r.lIIllIIIl[60] = 0x5C ^ 0x77;
        r.lIIllIIIl[61] = 155 + 151 - 292 + 151 ^ 38 + 77 - 78 + 100;
        r.lIIllIIIl[62] = 0xE7 ^ 0xA5 ^ (0x4B ^ 0x24);
        r.lIIllIIIl[63] = 0x61 ^ 0x2A ^ (5 ^ 0x60);
        r.lIIllIIIl[64] = 0x21 ^ 0x4C ^ (0xD5 ^ 0x97);
        r.lIIllIIIl[65] = 0x49 ^ 0x79;
        r.lIIllIIIl[66] = 0x1A ^ 0x2B;
        r.lIIllIIIl[67] = 87 + 13 - 47 + 188 ^ 15 + 15 - -133 + 31;
        r.lIIllIIIl[68] = 0x95 ^ 0xA1;
        r.lIIllIIIl[69] = 0x68 ^ 0x5D;
        r.lIIllIIIl[70] = 0xBC ^ 0x8A;
        r.lIIllIIIl[71] = 2 ^ 0x35;
        r.lIIllIIIl[72] = 0xA1 ^ 0x89 ^ (0x6F ^ 0x7F);
        r.lIIllIIIl[73] = 0x1D ^ 0x24;
        r.lIIllIIIl[74] = 0xA7 ^ 0x9D ^ (0x24 ^ 0x66) & ~(0xDB ^ 0x99);
        r.lIIllIIIl[75] = 0x12 ^ 0x29;
        r.lIIllIIIl[76] = 0xB0 ^ 0x8C;
        r.lIIllIIIl[77] = 0xBF ^ 0xBA ^ (0x9E ^ 0xA6);
        r.lIIllIIIl[78] = 0x19 ^ 0x65 ^ (0x72 ^ 0x30);
        r.lIIllIIIl[79] = 0x46 ^ 0x79;
        r.lIIllIIIl[80] = 0xBA ^ 0x82 ^ (0xD9 ^ 0xA1);
        r.lIIllIIIl[81] = -(0xFFFFB5F7 & 0x5E5D) & (0xFFFFF7FF & 0x3F7C);
        r.lIIllIIIl[82] = 0xFFFFBBEC & 0x4797;
        r.lIIllIIIl[83] = -(0xFFFF8FA3 & 0x717F) & (0xFFFFAFFF & 0x7FEE);
        r.lIIllIIIl[84] = 0xFFFFE3AB & 0x7DFC;
        r.lIIllIIIl[85] = 0x2E ^ 0x7C ^ (0x7F ^ 0x49);
        r.lIIllIIIl[86] = 7 + 26 - -71 + 128 ^ 140 + 103 - 113 + 40;
        r.lIIllIIIl[87] = 0x6B ^ 0x56 ^ (0xD8 ^ 0xA6);
        r.lIIllIIIl[88] = -(0xFFFFF37F & 0x3FF3) & (0xFFFFBFFF & 0x7F7F);
        r.lIIllIIIl[89] = 0xFFFFCFBF & 0x3CF3;
        r.lIIllIIIl[90] = -(0xFFFFC277 & 0x7DAB) & (0xFFFFCBFE & Short.MAX_VALUE);
        r.lIIllIIIl[91] = -(0xFFFFDE62 & 0x739F) & (0xFFFFDFDF & 0x7EFF);
        r.lIIllIIIl[92] = -(0xFFFFEBF3 & 0x37AF) & (0xFFFFFFFE & 0x2FEF);
        r.lIIllIIIl[93] = -(0xFFFFE4FB & 0x5BC5) & (0xFFFFFDDF & 0x4FF3);
        r.lIIllIIIl[94] = 0xFFFFBC73 & 0x4F9F;
        r.lIIllIIIl[95] = -(0xFFFFE31F & 0x7DF3) & (0xFFFFFFD3 & 0x6DFF);
        r.lIIllIIIl[96] = 0x22 ^ 0x66;
        r.lIIllIIIl[97] = 0xD5 ^ 0xC4 ^ (0x7F ^ 0x2B);
        r.lIIllIIIl[98] = 0x36 ^ 0x70;
        r.lIIllIIIl[99] = 0xFB ^ 0xBE ^ "  ".length();
        r.lIIllIIIl[100] = 0x89 ^ 0xC1;
    }

    private static int llllllIllll(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    private static boolean lllllllIlll(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lllllllIlIl(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lllllllIlII(int n2) {
        return n2 > 0;
    }

    private static boolean lllllllIIlI(int n2) {
        return n2 == 0;
    }

    static {
        r.llllllIlllI();
        r.llllllIllIl();
        bv = new ArrayList<d>();
        bX = new WorldPoint(lIIllIIIl[88], lIIllIIIl[89], lIIllIIIl[1]);
        ci = new WorldPoint(lIIllIIIl[90], lIIllIIIl[91], lIIllIIIl[1]);
        cj = new WorldPoint(lIIllIIIl[92], lIIllIIIl[93], lIIllIIIl[1]);
        ck = new WorldPoint(lIIllIIIl[94], lIIllIIIl[95], lIIllIIIl[1]);
        cn = null;
        String[] stringArray = new String[lIIllIIIl[4]];
        stringArray[r.lIIllIIIl[1]] = lIIllIIII[lIIllIIIl[96]];
        stringArray[r.lIIllIIIl[0]] = lIIllIIII[lIIllIIIl[97]];
        stringArray[r.lIIllIIIl[3]] = lIIllIIII[lIIllIIIl[98]];
        stringArray[r.lIIllIIIl[9]] = lIIllIIII[lIIllIIIl[99]];
        bR = stringArray;
    }

    private static boolean lllllllIIll(Object object) {
        return object != null;
    }

    private static String llllllIlIlI(String lIIIIIlIllIlIII, String lIIIIIlIllIIIlI) {
        lIIIIIlIllIlIII = new String(Base64.getDecoder().decode(lIIIIIlIllIlIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lIIIIIlIllIIllI = new StringBuilder();
        char[] lIIIIIlIllIIlIl = lIIIIIlIllIIIlI.toCharArray();
        int lIIIIIlIllIIlII = lIIllIIIl[1];
        char[] lIIIIIlIlIllllI = lIIIIIlIllIlIII.toCharArray();
        int lIIIIIlIlIlllIl = lIIIIIlIlIllllI.length;
        int lIIIIIlIlIlllII = lIIllIIIl[1];
        while (r.lllllllIIIl(lIIIIIlIlIlllII, lIIIIIlIlIlllIl)) {
            char lIIIIIlIllIlIIl = lIIIIIlIlIllllI[lIIIIIlIlIlllII];
            lIIIIIlIllIIllI.append((char)(lIIIIIlIllIlIIl ^ lIIIIIlIllIIlIl[lIIIIIlIllIIlII % lIIIIIlIllIIlIl.length]));
            "".length();
            ++lIIIIIlIllIIlII;
            ++lIIIIIlIlIlllII;
            "".length();
            if ("   ".length() < (0x86 ^ 0x82)) continue;
            return null;
        }
        return String.valueOf(lIIIIIlIllIIllI);
    }

    @Override
    public int T() {
        try {
            r.aG();
            "".length();
        }
        catch (Exception exception) {
            // empty catch block
        }
        if ("   ".length() <= "  ".length()) {
            return (0x4C ^ 0x2D) & ~(0xD ^ 0x6C);
        }
        return lIIllIIIl[85];
    }

    private static String llllllIlIll(String lIIIIIlIlIlIIIl, String lIIIIIlIlIlIIlI) {
        try {
            SecretKeySpec lIIIIIlIlIlIllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIIIIIlIlIlIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIIIIIlIlIlIlIl = Cipher.getInstance("Blowfish");
            lIIIIIlIlIlIlIl.init(lIIllIIIl[3], lIIIIIlIlIlIllI);
            return new String(lIIIIIlIlIlIlIl.doFinal(Base64.getDecoder().decode(lIIIIIlIlIlIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIIIIIlIlIlIlII) {
            lIIIIIlIlIlIlII.printStackTrace();
            return null;
        }
    }

    private static boolean llllllllIII(Object object) {
        return object == null;
    }

    private static void af() {
        d lIIIIIllIIIIIlI;
        block10: {
            block9: {
                Object lIIIIIllIIIIIll;
                int[] nArray = new int[lIIllIIIl[0]];
                nArray[r.lIIllIIIl[1]] = lIIllIIIl[8];
                if (r.lllllllIIlI(Bank.contains((int[])nArray) ? 1 : 0)) {
                    d d2 = new d(lIIllIIIl[8], lIIllIIIl[0], lIIllIIIl[81]);
                    bv.add(d2);
                    "".length();
                }
                int[] nArray2 = new int[lIIllIIIl[0]];
                nArray2[r.lIIllIIIl[1]] = lIIllIIIl[10];
                if (r.lllllllIIlI(Bank.contains((int[])nArray2) ? 1 : 0)) {
                    lIIIIIllIIIIIll = new d(lIIllIIIl[10], lIIllIIIl[0], lIIllIIIl[81]);
                    bv.add((d)lIIIIIllIIIIIll);
                    "".length();
                }
                int[] nArray3 = new int[lIIllIIIl[0]];
                nArray3[r.lIIllIIIl[1]] = lIIllIIIl[13];
                if (r.lllllllIIlI(Bank.contains((int[])nArray3) ? 1 : 0)) {
                    lIIIIIllIIIIIll = new d(lIIllIIIl[13], lIIllIIIl[50], lIIllIIIl[82]);
                    bv.add((d)lIIIIIllIIIIIll);
                    "".length();
                }
                int[] nArray4 = new int[lIIllIIIl[0]];
                nArray4[r.lIIllIIIl[1]] = lIIllIIIl[11];
                if (r.lllllllIIlI(Bank.contains((int[])nArray4) ? 1 : 0)) {
                    lIIIIIllIIIIIll = new d(lIIllIIIl[11], lIIllIIIl[12], i.bq);
                    bv.add((d)lIIIIIllIIIIIll);
                    "".length();
                }
                if (r.lllllllIIlI(Bank.contains((Predicate)(lIIIIIllIIIIIll = item -> item.getName().toLowerCase().contains(lIIllIIII[lIIllIIIl[87]]))) ? 1 : 0)) {
                    lIIIIIllIIIIIlI = new d(lIIllIIIl[83], lIIllIIIl[12], lIIllIIIl[84]);
                    bv.add(lIIIIIllIIIIIlI);
                    "".length();
                }
                int[] nArray5 = new int[lIIllIIIl[0]];
                nArray5[r.lIIllIIIl[1]] = lIIllIIIl[7];
                if (!r.lllllllIIII(Bank.contains((int[])nArray5) ? 1 : 0)) break block9;
                int[] nArray6 = new int[lIIllIIIl[0]];
                nArray6[r.lIIllIIIl[1]] = lIIllIIIl[7];
                if (!r.lllllllIIII(Bank.contains((int[])nArray6) ? 1 : 0)) break block10;
                int[] nArray7 = new int[lIIllIIIl[0]];
                nArray7[r.lIIllIIIl[1]] = lIIllIIIl[7];
                if (!r.lllllllIIIl(Bank.getFirst((int[])nArray7).getQuantity(), lIIllIIIl[12])) break block10;
            }
            lIIIIIllIIIIIlI = new d(lIIllIIIl[7], lIIllIIIl[28], lIIllIIIl[82]);
            bv.add(lIIIIIllIIIIIlI);
            "".length();
        }
        int[] nArray = new int[lIIllIIIl[0]];
        nArray[r.lIIllIIIl[1]] = lIIllIIIl[6];
        if (r.lllllllIIlI(Bank.contains((int[])nArray) ? 1 : 0)) {
            lIIIIIllIIIIIlI = new d(lIIllIIIl[6], lIIllIIIl[57], lIIllIIIl[82]);
            bv.add(lIIIIIllIIIIIlI);
            "".length();
        }
    }

    private static boolean lllllllIIII(int n2) {
        return n2 != 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean ab() {
        int n2;
        block4: {
            block5: {
                int[] nArray = new int[lIIllIIIl[0]];
                nArray[r.lIIllIIIl[1]] = lIIllIIIl[6];
                if (!r.lllllllIlII(Inventory.getCount((int[])nArray))) break block4;
                int[] nArray2 = new int[lIIllIIIl[0]];
                nArray2[r.lIIllIIIl[1]] = lIIllIIIl[8];
                if (!r.lllllllIlII(Inventory.getCount((int[])nArray2))) break block4;
                int[] nArray3 = new int[lIIllIIIl[0]];
                nArray3[r.lIIllIIIl[1]] = lIIllIIIl[10];
                if (!r.llllllllIlI(Inventory.getCount((int[])nArray3))) break block5;
                int[] nArray4 = new int[lIIllIIIl[0]];
                nArray4[r.lIIllIIIl[1]] = lIIllIIIl[10];
                if (!r.lllllllIIII(Equipment.contains((int[])nArray4) ? 1 : 0)) break block4;
            }
            int[] nArray = new int[lIIllIIIl[0]];
            nArray[r.lIIllIIIl[1]] = lIIllIIIl[13];
            if (r.lllllllIlII(Inventory.getCount((int[])nArray))) {
                n2 = lIIllIIIl[0];
                "".length();
                if (((0x52 ^ 0x13) & ~(0xEE ^ 0xAF)) < "   ".length()) return n2 != 0;
                return ((0xB0 ^ 0xA4) & ~(0x2A ^ 0x3E)) != 0;
            }
        }
        n2 = lIIllIIIl[1];
        return n2 != 0;
    }

    @Override
    public String U() {
        return lIIllIIII[lIIllIIIl[86]];
    }

    private static boolean llllllllIll(int n2, int n3) {
        return n2 >= n3;
    }

    @Override
    public boolean S() {
        return lIIllIIIl[1];
    }
}

