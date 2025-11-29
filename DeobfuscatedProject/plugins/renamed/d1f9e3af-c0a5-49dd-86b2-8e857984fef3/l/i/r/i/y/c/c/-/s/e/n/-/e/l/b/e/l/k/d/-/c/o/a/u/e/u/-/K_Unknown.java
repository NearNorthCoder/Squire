/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.widgets.Widget
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
 *  net.unethicalite.client.Static
 */
package l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-;

import gg.squire.account.AccBuilderEasyClues;
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
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.L_Unknown;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.W_Unknown;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.a_Unknown;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.an_Unknown;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.b_Unknown;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.d;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.e_Unknown;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.f_Unknown;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.g_Unknown;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.i;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.widgets.Widget;
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
import net.unethicalite.client.Static;

public class K_Unknown
implements W {
    static /* synthetic */ WorldPoint iY;
    static /* synthetic */ boolean cm;
    static /* synthetic */ WorldPoint iV;
    private final /* synthetic */ int ja = 0;
    static /* synthetic */ WorldPoint iX;
    static /* synthetic */ WorldPoint iT;
    static /* synthetic */ WorldPoint iW;
    public static /* synthetic */ boolean bt;
    private static /* synthetic */ String[] iZ;
    private static /* synthetic */ String[] lIlIIlIIl;
    static /* synthetic */ int cl;
    public static /* synthetic */ List<d> bv;
    private static /* synthetic */ int[] lIlIIlIlI;
    static /* synthetic */ WorldPoint iU;
    static /* synthetic */ String[] bR;
    static /* synthetic */ WorldPoint bX;
    public static /* synthetic */ boolean iS;
    private static final /* synthetic */ String iR;
    private static final /* synthetic */ HashMap<Integer, String> iQ;

    public static void ce() {
        block77: {
            block78: {
                Object lllIlllIlllIll;
                block80: {
                    block79: {
                        if (K.lIIIlIlIllII(bt ? 1 : 0)) {
                            b.a(bv);
                            if (K.lIIIlIlIllIl(bv.size(), lIlIIlIlI[1])) {
                                System.out.println(lIlIIlIIl[lIlIIlIlI[0]]);
                                bt = lIlIIlIlI[0];
                            }
                        }
                        if (!K.lIIIlIlIlllI(bt ? 1 : 0)) break block77;
                        if (K.lIIIlIlIlllI(K.ab() ? 1 : 0) && K.lIIIlIlIlllI(Vars.getBit((int)QuestVarbits.QUEST_DEMON_SLAYER.getId()))) {
                            lllIlllIlllIll = BankLocation.getNearest();
                            if (K.lIIIlIlIllll(lllIlllIlllIll) && K.lIIIlIlIlllI(lllIlllIlllIll.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                AccBuilderEasyClues.c = lIlIIlIIl[lIlIIlIlI[1]];
                                a.a((BankLocation)lllIlllIlllIll);
                            }
                            if (K.lIIIlIlIllll(lllIlllIlllIll) && K.lIIIlIlIllII(lllIlllIlllIll.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                if (K.lIIIlIlIlllI(Bank.isOpen() ? 1 : 0)) {
                                    a.a();
                                    Time.sleepUntil(() -> Bank.isOpen(), (int)lIlIIlIlI[2]);
                                    0;
                                }
                                if (K.lIIIlIlIllII(Bank.isOpen() ? 1 : 0)) {
                                    AccBuilderEasyClues.c = lIlIIlIIl[lIlIIlIlI[3]];
                                    if (K.lIIIlIllIIII(Inventory.getAll().size())) {
                                        Bank.depositInventory();
                                        Time.sleepTicks((int)lIlIIlIlI[4]);
                                        0;
                                    }
                                    if (K.lIIIlIllIIII(Equipment.getAll().size())) {
                                        Bank.depositEquipment();
                                        Time.sleepTicks((int)lIlIIlIlI[3]);
                                        0;
                                    }
                                    int[] nArray = new int[lIlIIlIlI[5]];
                                    nArray[K.lIlIIlIlI[0]] = lIlIIlIlI[6];
                                    nArray[K.lIlIIlIlI[1]] = lIlIIlIlI[7];
                                    nArray[K.lIlIIlIlI[3]] = lIlIIlIlI[8];
                                    if (K.lIIIlIlIlllI(e.b(nArray) ? 1 : 0)) {
                                        K.af();
                                        System.out.println(lIlIIlIIl[lIlIIlIlI[5]]);
                                        bt = lIlIIlIlI[1];
                                        return;
                                    }
                                    int[] nArray2 = new int[lIlIIlIlI[1]];
                                    nArray2[K.lIlIIlIlI[0]] = lIlIIlIlI[7];
                                    if (K.lIIIlIlIllII(Bank.contains((int[])nArray2) ? 1 : 0)) {
                                        int[] nArray3 = new int[lIlIIlIlI[1]];
                                        nArray3[K.lIlIIlIlI[0]] = lIlIIlIlI[7];
                                        if (K.lIIIlIlIllIl(Bank.getFirst((int[])nArray3).getQuantity(), lIlIIlIlI[9])) {
                                            K.af();
                                            System.out.println(lIlIIlIIl[lIlIIlIlI[4]]);
                                            bt = lIlIIlIlI[1];
                                            return;
                                        }
                                    }
                                    int[] nArray4 = new int[lIlIIlIlI[5]];
                                    nArray4[K.lIlIIlIlI[0]] = lIlIIlIlI[6];
                                    nArray4[K.lIlIIlIlI[1]] = lIlIIlIlI[7];
                                    nArray4[K.lIlIIlIlI[3]] = lIlIIlIlI[8];
                                    if (K.lIIIlIlIllII(e.b(nArray4) ? 1 : 0)) {
                                        if (K.lIIIlIlIlllI(Equipment.contains((int[])f.aR) ? 1 : 0) && K.lIIIlIlIlllI(Inventory.contains((int[])f.aR) ? 1 : 0)) {
                                            a.b(f.aR, lIlIIlIlI[1]);
                                        }
                                        if (K.lIIIlIlIllII(Inventory.contains((int[])f.aR) ? 1 : 0)) {
                                            Inventory.getFirst((int[])f.aR).interact(lIlIIlIIl[lIlIIlIlI[10]]);
                                            Time.sleepTicks((int)lIlIIlIlI[5]);
                                            0;
                                        }
                                        if (K.lIIIlIlIlllI(Bank.isOpen() ? 1 : 0)) {
                                            a.a();
                                            Time.sleepTicks((int)lIlIIlIlI[5]);
                                            0;
                                        }
                                        a.a(lIlIIlIlI[11], lIlIIlIlI[1]);
                                        a.a(lIlIIlIlI[8], lIlIIlIlI[1]);
                                        a.a(lIlIIlIlI[6], lIlIIlIlI[12]);
                                        a.a(lIlIIlIlI[13], lIlIIlIlI[14]);
                                    }
                                }
                            }
                        }
                        if (K.lIIIlIlIllII(Inventory.contains((int[])f.aV) ? 1 : 0) && K.lIIIlIlIllIl(Movement.getRunEnergy(), lIlIIlIlI[15])) {
                            Inventory.getFirst((int[])f.aV).interact(lIlIIlIIl[lIlIIlIlI[16]]);
                            Time.sleepTicks((int)lIlIIlIlI[1]);
                            0;
                        }
                        int[] nArray = new int[lIlIIlIlI[1]];
                        nArray[K.lIlIIlIlI[0]] = lIlIIlIlI[17];
                        if (K.lIIIlIlIllII(Inventory.contains((int[])nArray) ? 1 : 0) && K.lIIIlIllIIIl(K.lIIIlIlIlIll(e.u(), 55.0))) {
                            int[] nArray5 = new int[lIlIIlIlI[1]];
                            nArray5[K.lIlIIlIlI[0]] = lIlIIlIlI[17];
                            Inventory.getFirst((int[])nArray5).interact(lIlIIlIIl[lIlIIlIlI[18]]);
                        }
                        if (K.lIIIlIlIllII(K.ab() ? 1 : 0) && K.lIIIlIlIlllI(Vars.getBit((int)QuestVarbits.QUEST_DEMON_SLAYER.getId()))) {
                            if (K.lIIIlIllIIlI(Players.getLocal().getWorldLocation().distanceTo(bX), lIlIIlIlI[4]) && K.lIIIlIlIlllI(Static.getClient().isInInstancedRegion() ? 1 : 0)) {
                                AccBuilderEasyClues.c = lIlIIlIIl[lIlIIlIlI[19]];
                                Movement.walkTo((WorldPoint)bX);
                                0;
                                Time.sleepTicks((int)lIlIIlIlI[1]);
                                0;
                            }
                            if (K.lIIIlIllIIll(Players.getLocal().getWorldLocation().distanceTo(bX), lIlIIlIlI[4])) {
                                g.a(lIlIIlIIl[lIlIIlIlI[20]], bR);
                            }
                        }
                        if (K.lIIIlIllIlII(Vars.getBit((int)QuestVarbits.QUEST_DEMON_SLAYER.getId()), lIlIIlIlI[1])) {
                            lllIlllIlllIll = new WorldArea(lIlIIlIlI[21], lIlIIlIlI[22], lIlIIlIlI[19], lIlIIlIlI[18], lIlIIlIlI[0]);
                            if (K.lIIIlIlIlllI(lllIlllIlllIll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                AccBuilderEasyClues.c = lIlIIlIIl[lIlIIlIlI[12]];
                                Movement.walkTo((WorldPoint)iT);
                                0;
                                Time.sleepTicks((int)lIlIIlIlI[1]);
                                0;
                            }
                            if (K.lIIIlIlIllII(lllIlllIlllIll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                g.a(lIlIIlIIl[lIlIIlIlI[23]], bR);
                            }
                        }
                        if (!K.lIIIlIllIlII(Vars.getBit((int)QuestVarbits.QUEST_DEMON_SLAYER.getId()), lIlIIlIlI[3])) break block78;
                        cl = lIlIIlIlI[0];
                        int[] nArray6 = new int[lIlIIlIlI[1]];
                        nArray6[K.lIlIIlIlI[0]] = lIlIIlIlI[24];
                        if (K.lIIIlIlIlllI(Inventory.contains((int[])nArray6) ? 1 : 0)) {
                            String[] stringArray = new String[lIlIIlIlI[1]];
                            stringArray[K.lIlIIlIlI[0]] = lIlIIlIIl[lIlIIlIlI[25]];
                            if (K.lIIIlIlIlllI(Equipment.contains((String[])stringArray) ? 1 : 0) && K.lIIIlIlIlllI(iS ? 1 : 0)) {
                                if (!K.lIIIlIllIIll(Players.getLocal().getWorldLocation().distanceTo(iU), lIlIIlIlI[4]) || K.lIIIlIllIlIl(Players.getLocal().getWorldLocation().getPlane(), lIlIIlIlI[3])) {
                                    AccBuilderEasyClues.c = lIlIIlIIl[lIlIIlIlI[26]];
                                    Movement.walkTo((WorldPoint)iU);
                                    0;
                                    Time.sleepTicks((int)lIlIIlIlI[1]);
                                    0;
                                }
                                if (K.lIIIlIllIIll(Players.getLocal().getWorldLocation().distanceTo(iU), lIlIIlIlI[4])) {
                                    g.a(lIlIIlIIl[lIlIIlIlI[27]], bR);
                                }
                            }
                        }
                        int[] nArray7 = new int[lIlIIlIlI[1]];
                        nArray7[K.lIlIIlIlI[0]] = lIlIIlIlI[24];
                        if (K.lIIIlIlIllII(Inventory.contains((int[])nArray7) ? 1 : 0) && K.lIIIlIlIlllI(iS ? 1 : 0)) {
                            String[] stringArray = new String[lIlIIlIlI[1]];
                            stringArray[K.lIlIIlIlI[0]] = lIlIIlIIl[lIlIIlIlI[28]];
                            if (K.lIIIlIlIllII(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                                if (K.lIIIlIllIIlI(Players.getLocal().getWorldLocation().distanceTo(iV), lIlIIlIlI[4])) {
                                    AccBuilderEasyClues.c = lIlIIlIIl[lIlIIlIlI[29]];
                                    Movement.walkTo((WorldPoint)iV);
                                    0;
                                    Time.sleepTicks((int)lIlIIlIlI[1]);
                                    0;
                                }
                                if (K.lIIIlIllIIll(Players.getLocal().getWorldLocation().distanceTo(iV), lIlIIlIlI[4])) {
                                    String[] stringArray2 = new String[lIlIIlIlI[1]];
                                    stringArray2[K.lIlIIlIlI[0]] = lIlIIlIIl[lIlIIlIlI[30]];
                                    String[] stringArray3 = new String[lIlIIlIlI[1]];
                                    stringArray3[K.lIlIIlIlI[0]] = lIlIIlIIl[lIlIIlIlI[31]];
                                    Inventory.getFirst((String[])stringArray2).useOn(TileObjects.getNearest((String[])stringArray3));
                                    Time.sleepTicks((int)lIlIIlIlI[10]);
                                    0;
                                }
                            }
                            String[] stringArray4 = new String[lIlIIlIlI[1]];
                            stringArray4[K.lIlIIlIlI[0]] = lIlIIlIIl[lIlIIlIlI[32]];
                            if (K.lIIIlIlIlllI(Inventory.contains((String[])stringArray4) ? 1 : 0)) {
                                if (K.lIIIlIllIIlI(Players.getLocal().getWorldLocation().distanceTo(iW), lIlIIlIlI[4])) {
                                    AccBuilderEasyClues.c = lIlIIlIIl[lIlIIlIlI[33]];
                                    String[] stringArray5 = new String[lIlIIlIlI[1]];
                                    stringArray5[K.lIlIIlIlI[0]] = lIlIIlIIl[lIlIIlIlI[34]];
                                    if (K.lIIIlIlIllll(TileObjects.getNearest((String[])stringArray5))) {
                                        String[] stringArray6 = new String[lIlIIlIlI[1]];
                                        stringArray6[K.lIlIIlIlI[0]] = lIlIIlIIl[lIlIIlIlI[35]];
                                        String[] stringArray7 = new String[lIlIIlIlI[1]];
                                        stringArray7[K.lIlIIlIlI[0]] = lIlIIlIIl[lIlIIlIlI[36]];
                                        if (K.lIIIlIlIllII(TileObjects.getNearest((String[])stringArray6).hasAction(stringArray7) ? 1 : 0)) {
                                            String[] stringArray8 = new String[lIlIIlIlI[1]];
                                            stringArray8[K.lIlIIlIlI[0]] = lIlIIlIIl[lIlIIlIlI[37]];
                                            TileObjects.getNearest((String[])stringArray8).interact(lIlIIlIIl[lIlIIlIlI[9]]);
                                            Time.sleepTicks((int)lIlIIlIlI[3]);
                                            0;
                                        }
                                    }
                                    String[] stringArray9 = new String[lIlIIlIlI[1]];
                                    stringArray9[K.lIlIIlIlI[0]] = lIlIIlIIl[lIlIIlIlI[38]];
                                    if (K.lIIIlIlIllll(TileObjects.getNearest((String[])stringArray9))) {
                                        String[] stringArray10 = new String[lIlIIlIlI[1]];
                                        stringArray10[K.lIlIIlIlI[0]] = lIlIIlIIl[lIlIIlIlI[39]];
                                        String[] stringArray11 = new String[lIlIIlIlI[1]];
                                        stringArray11[K.lIlIIlIlI[0]] = lIlIIlIIl[lIlIIlIlI[40]];
                                        if (K.lIIIlIlIllII(TileObjects.getNearest((String[])stringArray10).hasAction(stringArray11) ? 1 : 0)) {
                                            String[] stringArray12 = new String[lIlIIlIlI[1]];
                                            stringArray12[K.lIlIIlIlI[0]] = lIlIIlIIl[lIlIIlIlI[41]];
                                            TileObjects.getNearest((String[])stringArray12).interact(lIlIIlIIl[lIlIIlIlI[42]]);
                                            Time.sleepTicks((int)lIlIIlIlI[3]);
                                            0;
                                        }
                                    }
                                    Movement.walkTo((WorldPoint)iW);
                                    0;
                                    Time.sleepTicks((int)lIlIIlIlI[1]);
                                    0;
                                }
                                if (K.lIIIlIllIIll(Players.getLocal().getWorldLocation().distanceTo(iW), lIlIIlIlI[4])) {
                                    String[] stringArray13 = new String[lIlIIlIlI[1]];
                                    stringArray13[K.lIlIIlIlI[0]] = lIlIIlIIl[lIlIIlIlI[43]];
                                    if (K.lIIIlIlIllll(TileObjects.getNearest((String[])stringArray13))) {
                                        String[] stringArray14 = new String[lIlIIlIlI[1]];
                                        stringArray14[K.lIlIIlIlI[0]] = lIlIIlIIl[lIlIIlIlI[44]];
                                        TileObjects.getNearest((String[])stringArray14).interact(lIlIIlIIl[lIlIIlIlI[45]]);
                                        Time.sleepTicks((int)lIlIIlIlI[4]);
                                        0;
                                    }
                                }
                            }
                        }
                        int[] nArray8 = new int[lIlIIlIlI[1]];
                        nArray8[K.lIlIIlIlI[0]] = lIlIIlIlI[24];
                        if (K.lIIIlIlIllII(Inventory.contains((int[])nArray8) ? 1 : 0)) {
                            int[] nArray9 = new int[lIlIIlIlI[1]];
                            nArray9[K.lIlIIlIlI[0]] = lIlIIlIlI[46];
                            if (K.lIIIlIlIllII(Inventory.contains((int[])nArray9) ? 1 : 0)) {
                                iS = lIlIIlIlI[1];
                            }
                        }
                        if (K.lIIIlIlIllII(iS ? 1 : 0)) {
                            String[] stringArray = new String[lIlIIlIlI[1]];
                            stringArray[K.lIlIIlIlI[0]] = lIlIIlIIl[lIlIIlIlI[47]];
                            if (K.lIIIlIlIlllI(Equipment.contains((String[])stringArray) ? 1 : 0)) {
                                int[] nArray10 = new int[lIlIIlIlI[1]];
                                nArray10[K.lIlIIlIlI[0]] = lIlIIlIlI[48];
                                if (K.lIIIlIlIlllI(Inventory.contains((int[])nArray10) ? 1 : 0)) {
                                    String[] stringArray15 = new String[lIlIIlIlI[1]];
                                    stringArray15[K.lIlIIlIlI[0]] = lIlIIlIIl[lIlIIlIlI[49]];
                                    if (K.lIIIlIlIlllI(Inventory.contains((String[])stringArray15) ? 1 : 0)) {
                                        K.cg();
                                    }
                                    String[] stringArray16 = new String[lIlIIlIlI[1]];
                                    stringArray16[K.lIlIIlIlI[0]] = lIlIIlIIl[lIlIIlIlI[50]];
                                    if (K.lIIIlIlIllII(Inventory.contains((String[])stringArray16) ? 1 : 0)) {
                                        if (K.lIIIlIllIIlI(Players.getLocal().getWorldLocation().distanceTo(iX), lIlIIlIlI[3])) {
                                            AccBuilderEasyClues.c = lIlIIlIIl[lIlIIlIlI[51]];
                                            Movement.walkTo((WorldPoint)iX);
                                            0;
                                            Time.sleepTicks((int)lIlIIlIlI[1]);
                                            0;
                                        }
                                        if (K.lIIIlIllIIll(Players.getLocal().getWorldLocation().distanceTo(iX), lIlIIlIlI[3])) {
                                            g.a(lIlIIlIIl[lIlIIlIlI[52]], bR);
                                        }
                                    }
                                }
                            }
                        }
                        if (K.lIIIlIlIllII(iS ? 1 : 0)) {
                            int[] nArray11 = new int[lIlIIlIlI[1]];
                            nArray11[K.lIlIIlIlI[0]] = lIlIIlIlI[48];
                            if (K.lIIIlIlIllII(Inventory.contains((int[])nArray11) ? 1 : 0)) {
                                String[] stringArray = new String[lIlIIlIlI[1]];
                                stringArray[K.lIlIIlIlI[0]] = lIlIIlIIl[lIlIIlIlI[53]];
                                if (K.lIIIlIlIlllI(Equipment.contains((String[])stringArray) ? 1 : 0)) {
                                    int[] nArray12 = new int[lIlIIlIlI[1]];
                                    nArray12[K.lIlIIlIlI[0]] = lIlIIlIlI[24];
                                    if (K.lIIIlIlIlllI(Inventory.contains((int[])nArray12) ? 1 : 0)) {
                                        K.cg();
                                    }
                                    int[] nArray13 = new int[lIlIIlIlI[1]];
                                    nArray13[K.lIlIIlIlI[0]] = lIlIIlIlI[24];
                                    if (K.lIIIlIlIllII(Inventory.contains((int[])nArray13) ? 1 : 0)) {
                                        lllIlllIlllIll = new WorldArea(lIlIIlIlI[21], lIlIIlIlI[22], lIlIIlIlI[19], lIlIIlIlI[18], lIlIIlIlI[0]);
                                        if (K.lIIIlIlIlllI(lllIlllIlllIll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                            AccBuilderEasyClues.c = lIlIIlIIl[lIlIIlIlI[54]];
                                            Movement.walkTo((WorldPoint)iT);
                                            0;
                                            Time.sleepTicks((int)lIlIIlIlI[1]);
                                            0;
                                        }
                                        if (K.lIIIlIlIllII(lllIlllIlllIll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                            g.a(lIlIIlIIl[lIlIIlIlI[55]], bR);
                                        }
                                    }
                                }
                            }
                        }
                        String[] stringArray = new String[lIlIIlIlI[1]];
                        stringArray[K.lIlIIlIlI[0]] = lIlIIlIIl[lIlIIlIlI[56]];
                        if (!K.lIIIlIlIllII(Equipment.contains((String[])stringArray) ? 1 : 0)) break block78;
                        String[] stringArray17 = new String[lIlIIlIlI[1]];
                        stringArray17[K.lIlIIlIlI[0]] = lIlIIlIIl[lIlIIlIlI[57]];
                        if (K.lIIIlIllIllI(NPCs.getNearest((String[])stringArray17))) {
                            String[] stringArray18 = new String[lIlIIlIlI[1]];
                            stringArray18[K.lIlIIlIlI[0]] = lIlIIlIIl[lIlIIlIlI[58]];
                            if (K.lIIIlIllIllI(NPCs.getNearest((String[])stringArray18))) {
                                AccBuilderEasyClues.c = lIlIIlIIl[lIlIIlIlI[59]];
                                Movement.walkTo((WorldPoint)iY);
                                0;
                                Time.sleepTicks((int)lIlIIlIlI[1]);
                                0;
                            }
                        }
                        String[] stringArray19 = new String[lIlIIlIlI[1]];
                        stringArray19[K.lIlIIlIlI[0]] = lIlIIlIIl[lIlIIlIlI[60]];
                        if (!K.lIIIlIllIllI(NPCs.getNearest((String[])stringArray19))) break block79;
                        String[] stringArray20 = new String[lIlIIlIlI[1]];
                        stringArray20[K.lIlIIlIlI[0]] = lIlIIlIIl[lIlIIlIlI[61]];
                        if (!K.lIIIlIlIllll(NPCs.getNearest((String[])stringArray20))) break block80;
                    }
                    if (K.lIIIlIllIllI(iZ)) {
                        K.cf();
                    }
                    if (K.lIIIlIlIllll(lllIlllIlllIll = NPCs.getNearest(nPC -> {
                        int n2;
                        if (K.lIIIlIlIllII(nPC.getName().contains(lIlIIlIIl[lIlIIlIlI[89]]) ? 1 : 0) && K.lIIIlIlllIII(nPC.getInteracting(), Players.getLocal())) {
                            n2 = lIlIIlIlI[1];
                            0;
                            if ((0xB0 ^ 0xB4) <= -1) {
                                return false;
                            }
                        } else {
                            n2 = lIlIIlIlI[0];
                        }
                        return n2 != 0;
                    })) && K.lIIIlIllIllI(Players.getLocal().getInteracting())) {
                        lllIlllIlllIll.interact(lIlIIlIIl[lIlIIlIlI[62]]);
                        Time.sleepTicks((int)lIlIIlIlI[3]);
                        0;
                    }
                    if (K.lIIIlIllIllI(lllIlllIlllIll) && K.lIIIlIllIllI(Players.getLocal().getInteracting())) {
                        String[] stringArray = new String[lIlIIlIlI[1]];
                        stringArray[K.lIlIIlIlI[0]] = lIlIIlIIl[lIlIIlIlI[63]];
                        if (K.lIIIlIlIllll(NPCs.getNearest((String[])stringArray))) {
                            String[] stringArray21 = new String[lIlIIlIlI[1]];
                            stringArray21[K.lIlIIlIlI[0]] = lIlIIlIIl[lIlIIlIlI[15]];
                            if (K.lIIIlIlIlllI(NPCs.getNearest((String[])stringArray21).isDead() ? 1 : 0) && K.lIIIlIlIlllI(Dialog.isOpen() ? 1 : 0)) {
                                String[] stringArray22 = new String[lIlIIlIlI[1]];
                                stringArray22[K.lIlIIlIlI[0]] = lIlIIlIIl[lIlIIlIlI[64]];
                                NPCs.getNearest((String[])stringArray22).interact(lIlIIlIIl[lIlIIlIlI[65]]);
                            }
                        }
                    }
                    if (K.lIIIlIlIllII(Dialog.isOpen() ? 1 : 0)) {
                        AccBuilderEasyClues.c = lIlIIlIIl[lIlIIlIlI[66]];
                        List lllIlllIlllIlI = Dialog.getOptions();
                        if (K.lIIIlIlIlllI(lllIlllIlllIlI.isEmpty() ? 1 : 0)) {
                            int lllIlllIlllIIl = lIlIIlIlI[0];
                            while (K.lIIIlIlIllIl(lllIlllIlllIIl, lllIlllIlllIlI.size())) {
                                if (K.lIIIlIlIllII(((Widget)lllIlllIlllIlI.get(lllIlllIlllIIl)).getText().contains(lIlIIlIIl[lIlIIlIlI[67]]) ? 1 : 0)) {
                                    String[] stringArray = new String[lIlIIlIlI[1]];
                                    stringArray[K.lIlIIlIlI[0]] = ((Widget)lllIlllIlllIlI.get(lllIlllIlllIIl)).getText();
                                    Dialog.chooseOption((String[])stringArray);
                                    0;
                                    Time.sleepTicks((int)lIlIIlIlI[3]);
                                    0;
                                    0;
                                    if (((0xF9 ^ 0xA3) & ~(0xEF ^ 0xB5)) >= 0) break;
                                    return;
                                }
                                ++lllIlllIlllIIl;
                                0;
                                if ((0x72 ^ 0x39 ^ (0xFB ^ 0xB4)) <= (0x9D ^ 0x92 ^ (0x21 ^ 0x2A))) continue;
                                return;
                            }
                        }
                    }
                }
                String[] stringArray = new String[lIlIIlIlI[1]];
                stringArray[K.lIlIIlIlI[0]] = lIlIIlIIl[lIlIIlIlI[68]];
                if (K.lIIIlIlIllll(NPCs.getNearest((String[])stringArray))) {
                    if (K.lIIIlIlIllIl(cl, lIlIIlIlI[1]) && K.lIIIlIlIlllI(cm ? 1 : 0)) {
                        an.pP += lIlIIlIlI[1];
                        an.o(AccBuilderEasyClues.m);
                        cl += lIlIIlIlI[1];
                        an.pP = lIlIIlIlI[0];
                        cm = lIlIIlIlI[1];
                    }
                    if (K.lIIIlIlIllII(Dialog.isOpen() ? 1 : 0)) {
                        AccBuilderEasyClues.c = lIlIIlIIl[lIlIIlIlI[69]];
                        lllIlllIlllIll = Dialog.getOptions();
                        if (K.lIIIlIlIlllI(lllIlllIlllIll.isEmpty() ? 1 : 0)) {
                            int lllIlllIlllIlI = lIlIIlIlI[0];
                            while (K.lIIIlIlIllIl(lllIlllIlllIlI, lllIlllIlllIll.size())) {
                                String lllIlllIlllIIl = iZ[lllIlllIlllIlI];
                                int lllIlllIlllIII = lIlIIlIlI[0];
                                while (K.lIIIlIlIllIl(lllIlllIlllIII, lllIlllIlllIll.size())) {
                                    if (K.lIIIlIlIllII(((Widget)lllIlllIlllIll.get(lllIlllIlllIII)).getText().contains(lllIlllIlllIIl) ? 1 : 0)) {
                                        System.out.println("Selecting: " + ((Widget)lllIlllIlllIll.get(lllIlllIlllIII)).getText());
                                        Time.sleepTicks((int)lIlIIlIlI[3]);
                                        0;
                                        String[] stringArray23 = new String[lIlIIlIlI[1]];
                                        stringArray23[K.lIlIIlIlI[0]] = ((Widget)lllIlllIlllIll.get(lllIlllIlllIII)).getText();
                                        Dialog.chooseOption((String[])stringArray23);
                                        0;
                                        Time.sleepTicks((int)lIlIIlIlI[12]);
                                        0;
                                        0;
                                        if (2 == 2) break;
                                        return;
                                    }
                                    ++lllIlllIlllIII;
                                    0;
                                    if (2 > 0) continue;
                                    return;
                                }
                                ++lllIlllIlllIlI;
                                0;
                                if (1 != 0) continue;
                                return;
                            }
                        }
                    }
                }
            }
            g.a(bR);
        }
    }

    private static void lIIIlIlIlIlI() {
        lIlIIlIlI = new int[122];
        K.lIlIIlIlI[0] = 2 & ~2;
        K.lIlIIlIlI[1] = 1;
        K.lIlIIlIlI[2] = 0xFFFFDBA8 & 0x37DF;
        K.lIlIIlIlI[3] = 2;
        K.lIlIIlIlI[4] = 117 + 124 - 159 + 63 ^ 77 + 138 - 97 + 31;
        K.lIlIIlIlI[5] = 3;
        K.lIlIIlIlI[6] = -(0xFFFFEEBF & 0x3171) & (0xFFFFFF7F & 0x3FF7);
        K.lIlIIlIlI[7] = -(0xFFFFB9E6 & 0x7EBB) & (0xFFFFFBBF & 0x3EEF);
        K.lIlIIlIlI[8] = 0xFFFFCFE9 & 0x379F;
        K.lIlIIlIlI[9] = 0x80 ^ 0xBD ^ (0x47 ^ 0x63);
        K.lIlIIlIlI[10] = 0x86 ^ 0x83;
        K.lIlIIlIlI[11] = 0xFFFFF975 & 0x37DB;
        K.lIlIIlIlI[12] = 0xA8 ^ 0x8B ^ (0x3B ^ 0x12);
        K.lIlIIlIlI[13] = -(0xFFFFED1D & 0x7EFF) & (0xFFFFFFFF & 0x6FFF);
        K.lIlIIlIlI[14] = 0xFFFFBFFD & 0x43EA;
        K.lIlIIlIlI[15] = 0xF ^ 0x1C ^ (0x60 ^ 0x41);
        K.lIlIIlIlI[16] = 0x17 ^ 0x11;
        K.lIlIIlIlI[17] = -(0xFFFFFD67 & 0x7E9D) & (0xFFFFFF7F & 0x7DFF);
        K.lIlIIlIlI[18] = 0x29 ^ 0x33 ^ (0x2E ^ 0x33);
        K.lIlIIlIlI[19] = 0x4F ^ 0x47;
        K.lIlIIlIlI[20] = 167 + 149 - 280 + 146 ^ 155 + 45 - 52 + 43;
        K.lIlIIlIlI[21] = -(0xFFFFE79B & 0x5BE5) & (0xFFFFDFFF & 0x6FFF);
        K.lIlIIlIlI[22] = -(0xFFFFD263 & 0x6FDD) & (0xFFFFEFDF & 0x5FED);
        K.lIlIIlIlI[23] = 0x77 ^ 0x4C ^ (0xF6 ^ 0xC6);
        K.lIlIIlIlI[24] = -(0xFFFFE7CF & 0x7E39) & (0xFFFFFFEC & 0x6F7B);
        K.lIlIIlIlI[25] = 0x30 ^ 0x3C;
        K.lIlIIlIlI[26] = 0x47 ^ 0x4A;
        K.lIlIIlIlI[27] = 0x85 ^ 0x8B;
        K.lIlIIlIlI[28] = 0x95 ^ 0xAF ^ (0x37 ^ 2);
        K.lIlIIlIlI[29] = 0x16 ^ 6;
        K.lIlIIlIlI[30] = 114 + 0 - 61 + 97 ^ 133 + 124 - 196 + 74;
        K.lIlIIlIlI[31] = 203 + 2 - 103 + 106 ^ 119 + 35 - -14 + 26;
        K.lIlIIlIlI[32] = 0x8F ^ 0x9C;
        K.lIlIIlIlI[33] = 0x40 ^ 0x54;
        K.lIlIIlIlI[34] = 0x85 ^ 0x90;
        K.lIlIIlIlI[35] = 0x80 ^ 0x96;
        K.lIlIIlIlI[36] = 90 + 23 - 107 + 137 ^ 40 + 83 - 12 + 41;
        K.lIlIIlIlI[37] = 0xC8 ^ 0x93 ^ (0x43 ^ 0);
        K.lIlIIlIlI[38] = 0xA ^ 0x33 ^ (0x35 ^ 0x16);
        K.lIlIIlIlI[39] = 0xB0 ^ 0xB7 ^ (0xB0 ^ 0xAC);
        K.lIlIIlIlI[40] = 0xB3 ^ 0x94 ^ (0x7E ^ 0x45);
        K.lIlIIlIlI[41] = 98 + 92 - 105 + 131 ^ 196 + 92 - 99 + 8;
        K.lIlIIlIlI[42] = 0x1D ^ 0x33 ^ (0x2A ^ 0x1A);
        K.lIlIIlIlI[43] = 0xBC ^ 0xA3;
        K.lIlIIlIlI[44] = 0x3F ^ 0x1F;
        K.lIlIIlIlI[45] = 11 + 143 - 79 + 72 ^ 171 + 174 - 338 + 171;
        K.lIlIIlIlI[46] = 0xFFFF8BFF & 0x7D61;
        K.lIlIIlIlI[47] = 0x59 ^ 0x7B;
        K.lIlIIlIlI[48] = -1 & (0xFFFFEBDF & 0x1D7F);
        K.lIlIIlIlI[49] = 0xE3 ^ 0xC0;
        K.lIlIIlIlI[50] = 0xA9 ^ 0x82 ^ (0x82 ^ 0x8D);
        K.lIlIIlIlI[51] = 0x68 ^ 0x79 ^ (0x47 ^ 0x73);
        K.lIlIIlIlI[52] = 0xD6 ^ 0x99 ^ (0xD4 ^ 0xBD);
        K.lIlIIlIlI[53] = 0xE0 ^ 0xC7;
        K.lIlIIlIlI[54] = 103 + 49 - 125 + 104 ^ 4 + 91 - -2 + 74;
        K.lIlIIlIlI[55] = 0x7D ^ 0x54;
        K.lIlIIlIlI[56] = 0xE ^ 0x1B ^ (0xB2 ^ 0x8D);
        K.lIlIIlIlI[57] = 0xC ^ 0x41 ^ (0x19 ^ 0x7F);
        K.lIlIIlIlI[58] = 0xA6 ^ 0x8A;
        K.lIlIIlIlI[59] = 0x28 ^ 5;
        K.lIlIIlIlI[60] = 50 + 119 - 143 + 109 ^ 84 + 160 - 232 + 157;
        K.lIlIIlIlI[61] = 1 ^ (0x59 ^ 0x77);
        K.lIlIIlIlI[62] = 0x14 ^ 0x3B ^ (0x5B ^ 0x44);
        K.lIlIIlIlI[63] = 0x57 ^ 0x66;
        K.lIlIIlIlI[64] = 0x19 ^ 9 ^ (0xAA ^ 0x89);
        K.lIlIIlIlI[65] = 78 + 16 - -31 + 47 ^ 50 + 64 - -3 + 35;
        K.lIlIIlIlI[66] = 20 + 24 - 23 + 120 ^ 158 + 114 - 137 + 49;
        K.lIlIIlIlI[67] = 0xB2 ^ 0x84;
        K.lIlIIlIlI[68] = 0x4A ^ 0x66 ^ (0xAB ^ 0xB0);
        K.lIlIIlIlI[69] = 0x26 ^ 0x1E;
        K.lIlIIlIlI[70] = 0xFFFFBFCE & 0x4A33;
        K.lIlIIlIlI[71] = 0xFFFFCF97 & 0x3A6B;
        K.lIlIIlIlI[72] = -(0xFFFFAFFF & 0x75A3) & (0xFFFFEFA7 & 0x3FFE);
        K.lIlIIlIlI[73] = -(0xFFFFF2D9 & 0x2DF7) & (0xFFFFEEF7 & 0x3BDD);
        K.lIlIIlIlI[74] = 0xFFFF8A1E & 0x7FE7;
        K.lIlIIlIlI[75] = 0x46 ^ 0x7F;
        K.lIlIIlIlI[76] = 0x52 ^ 0x68;
        K.lIlIIlIlI[77] = 0xD4 ^ 0xBA ^ (0x1B ^ 0x4E);
        K.lIlIIlIlI[78] = -(0xFFFF9FBF & 0x6EE9) & (0xFFFFBFFB & Short.MAX_VALUE);
        K.lIlIIlIlI[79] = 0x1C ^ 0x20;
        K.lIlIIlIlI[80] = -(0xFFFFE1EB & 0x7E55) & (0xFFFFE2F6 & 0x7FDD);
        K.lIlIIlIlI[81] = 0xFFFFF7F0 & 0xF8F;
        K.lIlIIlIlI[82] = 0xFFFFBEFD & 0x6FCE;
        K.lIlIIlIlI[83] = -(0xFFFFDFF7 & 0x361F) & (0xFFFFF7BE & Short.MAX_VALUE);
        K.lIlIIlIlI[84] = 0xFFFFC5FF & 0x3B2C;
        K.lIlIIlIlI[85] = -(0xFFFFE9CF & 0x7633) & (0xFFFFF7EF & 0x6F7E);
        K.lIlIIlIlI[86] = 0x44 ^ 0x20;
        K.lIlIIlIlI[87] = 0x73 ^ 0x4E;
        K.lIlIIlIlI[88] = 52 + 100 - 91 + 102 ^ 65 + 63 - 92 + 121;
        K.lIlIIlIlI[89] = 0x11 ^ 0x30 ^ (0x36 ^ 0x28);
        K.lIlIIlIlI[90] = 0x78 ^ 0x38;
        K.lIlIIlIlI[91] = -(0xFFFFFA75 & 0x77BF) & (0xFFFFFFFF & 0x7EB7);
        K.lIlIIlIlI[92] = 0xFFFFDD6F & 0x2FF0;
        K.lIlIIlIlI[93] = -(0xFFFFC74F & 0x79F4) & (0xFFFFCDD7 & 0x7FEF);
        K.lIlIIlIlI[94] = 0xFFFF9DFA & 0x6F95;
        K.lIlIIlIlI[95] = 0xFFFF8DAD & 0x7FFB;
        K.lIlIIlIlI[96] = -(0xFFFFFF2F & 0x72F6) & (0xFFFFFFBF & 0x7EFF);
        K.lIlIIlIlI[97] = 0xFFFFBFAA & 0x4DFD;
        K.lIlIIlIlI[98] = 0xFFFFA7AF & 0x7EF9;
        K.lIlIIlIlI[99] = -(0xFFFFF34F & 0x6EF1) & (0xFFFFFE79 & 0x6FEF);
        K.lIlIIlIlI[100] = 0xFFFFAFDA & 0x5C7F;
        K.lIlIIlIlI[101] = 0xFFFFEF9F & 0x1CFB;
        K.lIlIIlIlI[102] = 0xFFFF9D7B & 0x6FAF;
        K.lIlIIlIlI[103] = 0x38 ^ 0x77 ^ (0x4E ^ 0x40);
        K.lIlIIlIlI[104] = 0xCA ^ 0x88;
        K.lIlIIlIlI[105] = 0x76 ^ 0x35;
        K.lIlIIlIlI[106] = 0x12 ^ 0x56;
        K.lIlIIlIlI[107] = 0x63 ^ 0x26;
        K.lIlIIlIlI[108] = 0xFE ^ 0xBC ^ (0x93 ^ 0x97);
        K.lIlIIlIlI[109] = 0x4B ^ 0xC;
        K.lIlIIlIlI[110] = 0x60 ^ 0x28;
        K.lIlIIlIlI[111] = 0xA8 ^ 0x9F ^ (0xB8 ^ 0xC6);
        K.lIlIIlIlI[112] = 156 + 87 - 217 + 227 ^ 118 + 45 - 58 + 78;
        K.lIlIIlIlI[113] = 0x27 ^ 0x6C;
        K.lIlIIlIlI[114] = 0xF0 ^ 0xBC;
        K.lIlIIlIlI[115] = 0x48 ^ 5;
        K.lIlIIlIlI[116] = 0x5B ^ 0x15;
        K.lIlIIlIlI[117] = 0x7E ^ 0x31;
        K.lIlIIlIlI[118] = 0x7C ^ 0x2C;
        K.lIlIIlIlI[119] = 0x54 ^ 0x50 ^ (0x5B ^ 0xE);
        K.lIlIIlIlI[120] = 0x52 ^ 0x44 ^ (0xD8 ^ 0x9C);
        K.lIlIIlIlI[121] = 0x1B ^ 0x48;
    }

    private static boolean lIIIlIlIllIl(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIIIlIllIIlI(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIIIlIllIIII(int n2) {
        return n2 > 0;
    }

    @Override
    public boolean S() {
        return lIlIIlIlI[0];
    }

    private static String lIIIlIIlllII(String lllIlllIIIIllI, String lllIlllIIIIlIl) {
        try {
            SecretKeySpec lllIlllIIIlIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllIlllIIIIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllIlllIIIlIlI = Cipher.getInstance("Blowfish");
            lllIlllIIIlIlI.init(lIlIIlIlI[3], lllIlllIIIlIll);
            return new String(lllIlllIIIlIlI.doFinal(Base64.getDecoder().decode(lllIlllIIIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllIlllIIIlIIl) {
            lllIlllIIIlIIl.printStackTrace();
            return null;
        }
    }

    private static void af() {
        block17: {
            d lllIlllIlIllII;
            block16: {
                block15: {
                    block14: {
                        Object lllIlllIlIllIl;
                        block13: {
                            block12: {
                                int[] nArray = new int[lIlIIlIlI[1]];
                                nArray[K.lIlIIlIlI[0]] = lIlIIlIlI[7];
                                if (!K.lIIIlIlIllII(Bank.contains((int[])nArray) ? 1 : 0)) break block12;
                                int[] nArray2 = new int[lIlIIlIlI[1]];
                                nArray2[K.lIlIIlIlI[0]] = lIlIIlIlI[7];
                                if (!K.lIIIlIlIllII(Bank.contains((int[])nArray2) ? 1 : 0)) break block13;
                                int[] nArray3 = new int[lIlIIlIlI[1]];
                                nArray3[K.lIlIIlIlI[0]] = lIlIIlIlI[7];
                                if (!K.lIIIlIlIllIl(Bank.getFirst((int[])nArray3).getQuantity(), lIlIIlIlI[9])) break block13;
                            }
                            lllIlllIlIllIl = new d(lIlIIlIlI[7], lIlIIlIlI[9], lIlIIlIlI[80]);
                            bv.add((d)lllIlllIlIllIl);
                            0;
                        }
                        int[] nArray = new int[lIlIIlIlI[1]];
                        nArray[K.lIlIIlIlI[0]] = lIlIIlIlI[8];
                        if (K.lIIIlIlIlllI(Bank.contains((int[])nArray) ? 1 : 0)) {
                            lllIlllIlIllIl = new d(lIlIIlIlI[8], lIlIIlIlI[1], lIlIIlIlI[81]);
                            bv.add((d)lllIlllIlIllIl);
                            0;
                        }
                        if (K.lIIIlIlIlllI(Bank.contains((Predicate)(lllIlllIlIllIl = item -> item.getName().toLowerCase().contains(lIlIIlIIl[lIlIIlIlI[88]]))) ? 1 : 0)) {
                            lllIlllIlIllII = new d(lIlIIlIlI[82], lIlIIlIlI[10], lIlIIlIlI[83]);
                            bv.add(lllIlllIlIllII);
                            0;
                        }
                        int[] nArray4 = new int[lIlIIlIlI[1]];
                        nArray4[K.lIlIIlIlI[0]] = lIlIIlIlI[17];
                        if (!K.lIIIlIlIllII(Bank.contains((int[])nArray4) ? 1 : 0)) break block14;
                        int[] nArray5 = new int[lIlIIlIlI[1]];
                        nArray5[K.lIlIIlIlI[0]] = lIlIIlIlI[17];
                        if (!K.lIIIlIlIllII(Bank.contains((int[])nArray5) ? 1 : 0)) break block15;
                        int[] nArray6 = new int[lIlIIlIlI[1]];
                        nArray6[K.lIlIIlIlI[0]] = lIlIIlIlI[17];
                        if (!K.lIIIlIlIllIl(Bank.getFirst((int[])nArray6).getQuantity(), lIlIIlIlI[10])) break block15;
                    }
                    lllIlllIlIllII = new d(lIlIIlIlI[17], lIlIIlIlI[12], lIlIIlIlI[84]);
                    bv.add(lllIlllIlIllII);
                    0;
                }
                int[] nArray = new int[lIlIIlIlI[1]];
                nArray[K.lIlIIlIlI[0]] = lIlIIlIlI[11];
                if (K.lIIIlIlIlllI(Bank.contains((int[])nArray) ? 1 : 0)) {
                    lllIlllIlIllII = new d(lIlIIlIlI[11], lIlIIlIlI[4], i.bq);
                    bv.add(lllIlllIlIllII);
                    0;
                }
                int[] nArray7 = new int[lIlIIlIlI[1]];
                nArray7[K.lIlIIlIlI[0]] = lIlIIlIlI[6];
                if (!K.lIIIlIlIllII(Bank.contains((int[])nArray7) ? 1 : 0)) break block16;
                int[] nArray8 = new int[lIlIIlIlI[1]];
                nArray8[K.lIlIIlIlI[0]] = lIlIIlIlI[6];
                if (!K.lIIIlIlIllII(Bank.contains((int[])nArray8) ? 1 : 0)) break block17;
                int[] nArray9 = new int[lIlIIlIlI[1]];
                nArray9[K.lIlIIlIlI[0]] = lIlIIlIlI[6];
                if (!K.lIIIlIlIllIl(Bank.getFirst((int[])nArray9).getQuantity(), lIlIIlIlI[28])) break block17;
            }
            lllIlllIlIllII = new d(lIlIIlIlI[6], lIlIIlIlI[54], lIlIIlIlI[85]);
            bv.add(lllIlllIlIllII);
            0;
        }
    }

    private static boolean lIIIlIlIllll(Object object) {
        return object != null;
    }

    private static String lIIIlIIllllI(String lllIlllIIllIII, String lllIlllIIlIlll) {
        lllIlllIIllIII = new String(Base64.getDecoder().decode(lllIlllIIllIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllIlllIIllIll = new StringBuilder();
        char[] lllIlllIIllIlI = lllIlllIIlIlll.toCharArray();
        int lllIlllIIllIIl = lIlIIlIlI[0];
        char[] lllIlllIIlIIll = lllIlllIIllIII.toCharArray();
        int lllIlllIIlIIlI = lllIlllIIlIIll.length;
        int lllIlllIIlIIIl = lIlIIlIlI[0];
        while (K.lIIIlIlIllIl(lllIlllIIlIIIl, lllIlllIIlIIlI)) {
            char lllIlllIIllllI = lllIlllIIlIIll[lllIlllIIlIIIl];
            lllIlllIIllIll.append((char)(lllIlllIIllllI ^ lllIlllIIllIlI[lllIlllIIllIIl % lllIlllIIllIlI.length]));
            0;
            ++lllIlllIIllIIl;
            ++lllIlllIIlIIIl;
            0;
            if (((0xAD ^ 0x85 ^ (0x4B ^ 0x27)) & (0x94 ^ 0x92 ^ (0x67 ^ 0x25) ^ -1)) == 0) continue;
            return null;
        }
        return String.valueOf(lllIlllIIllIll);
    }

    @Override
    public String U() {
        return lIlIIlIIl[lIlIIlIlI[87]];
    }

    private static boolean lIIIlIllIllI(Object object) {
        return object == null;
    }

    /*
     * WARNING - void declaration
     */
    private static boolean ab() {
        void lllIlllIllIIIl;
        int[] nArray = new int[lIlIIlIlI[3]];
        nArray[K.lIlIIlIlI[0]] = lIlIIlIlI[6];
        nArray[K.lIlIIlIlI[1]] = lIlIIlIlI[8];
        int[] nArray2 = nArray;
        int lllIlllIllIIII = lIlIIlIlI[0];
        while (K.lIIIlIlIllIl(lllIlllIllIIII, ((void)lllIlllIllIIIl).length)) {
            int[] nArray3 = new int[lIlIIlIlI[1]];
            nArray3[K.lIlIIlIlI[0]] = lllIlllIllIIIl[lllIlllIllIIII];
            if (K.lIIIlIlIlllI(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                return lIlIIlIlI[0];
            }
            ++lllIlllIllIIII;
            0;
            if (1 >= 0) continue;
            return false;
        }
        return lIlIIlIlI[1];
    }

    private static boolean lIIIlIllIIIl(int n2) {
        return n2 < 0;
    }

    @Override
    public int T() {
        try {
            K.ce();
            0;
        }
        catch (Exception exception) {
            // empty catch block
        }
        
        }
        return lIlIIlIlI[86];
    }

    static {
        K.lIIIlIlIlIlI();
        K.lIIIlIlIlIIl();
        iR = lIlIIlIIl[lIlIIlIlI[90]];
        iQ = new L();
        bv = new ArrayList<d>();
        bX = new WorldPoint(lIlIIlIlI[91], lIlIIlIlI[92], lIlIIlIlI[0]);
        iT = new WorldPoint(lIlIIlIlI[93], lIlIIlIlI[94], lIlIIlIlI[0]);
        iU = new WorldPoint(lIlIIlIlI[93], lIlIIlIlI[95], lIlIIlIlI[3]);
        iV = new WorldPoint(lIlIIlIlI[96], lIlIIlIlI[97], lIlIIlIlI[0]);
        iW = new WorldPoint(lIlIIlIlI[96], lIlIIlIlI[98], lIlIIlIlI[0]);
        iX = new WorldPoint(lIlIIlIlI[99], lIlIIlIlI[100], lIlIIlIlI[1]);
        iY = new WorldPoint(lIlIIlIlI[101], lIlIIlIlI[102], lIlIIlIlI[0]);
        String[] stringArray = new String[lIlIIlIlI[31]];
        stringArray[K.lIlIIlIlI[0]] = lIlIIlIIl[lIlIIlIlI[103]];
        stringArray[K.lIlIIlIlI[1]] = lIlIIlIIl[lIlIIlIlI[104]];
        stringArray[K.lIlIIlIlI[3]] = lIlIIlIIl[lIlIIlIlI[105]];
        stringArray[K.lIlIIlIlI[5]] = lIlIIlIIl[lIlIIlIlI[106]];
        stringArray[K.lIlIIlIlI[4]] = lIlIIlIIl[lIlIIlIlI[107]];
        stringArray[K.lIlIIlIlI[10]] = lIlIIlIIl[lIlIIlIlI[108]];
        stringArray[K.lIlIIlIlI[16]] = lIlIIlIIl[lIlIIlIlI[109]];
        stringArray[K.lIlIIlIlI[18]] = lIlIIlIIl[lIlIIlIlI[110]];
        stringArray[K.lIlIIlIlI[19]] = lIlIIlIIl[lIlIIlIlI[111]];
        stringArray[K.lIlIIlIlI[20]] = lIlIIlIIl[lIlIIlIlI[112]];
        stringArray[K.lIlIIlIlI[12]] = lIlIIlIIl[lIlIIlIlI[113]];
        stringArray[K.lIlIIlIlI[23]] = lIlIIlIIl[lIlIIlIlI[114]];
        stringArray[K.lIlIIlIlI[25]] = lIlIIlIIl[lIlIIlIlI[115]];
        stringArray[K.lIlIIlIlI[26]] = lIlIIlIIl[lIlIIlIlI[116]];
        stringArray[K.lIlIIlIlI[27]] = lIlIIlIIl[lIlIIlIlI[117]];
        stringArray[K.lIlIIlIlI[28]] = lIlIIlIIl[lIlIIlIlI[118]];
        stringArray[K.lIlIIlIlI[29]] = lIlIIlIIl[lIlIIlIlI[119]];
        stringArray[K.lIlIIlIlI[30]] = lIlIIlIIl[lIlIIlIlI[120]];
        bR = stringArray;
    }

    private static String lIIIlIIlllIl(String lllIllIllllIIl, String lllIllIllllIII) {
        try {
            SecretKeySpec lllIllIllllllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllIllIllllIII.getBytes(StandardCharsets.UTF_8)), lIlIIlIlI[19]), "DES");
            Cipher lllIllIlllllIl = Cipher.getInstance("DES");
            lllIllIlllllIl.init(lIlIIlIlI[3], lllIllIllllllI);
            return new String(lllIllIlllllIl.doFinal(Base64.getDecoder().decode(lllIllIllllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllIllIlllllII) {
            lllIllIlllllII.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean V() {
        boolean bl;
        if (K.lIIIlIllIlll(Vars.getBit((int)QuestVarbits.QUEST_DEMON_SLAYER.getId()), lIlIIlIlI[5])) {
            bl = lIlIIlIlI[1];
            0;
            if (1 < 1) {
                return ((0x4B ^ 4 ^ (0xC0 ^ 0x81)) & (0x22 ^ 0x3D ^ (0xD6 ^ 0xC7) ^ -1)) != 0;
            }
        } else {
            bl = lIlIIlIlI[0];
        }
        return bl;
    }

    private static boolean lIIIlIllIIll(int n2, int n3) {
        return n2 <= n3;
    }

    private static int lIIIlIlIlIll(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    private static boolean lIIIlIllIlIl(int n2, int n3) {
        return n2 != n3;
    }

    public K() {
        this.ja = lIlIIlIlI[0];
    }

    /*
     * WARNING - void declaration
     */
    private static void cg() {
        void lllIlllIllIlII;
        BankLocation bankLocation = BankLocation.getNearest();
        if (K.lIIIlIlIllll(bankLocation) && K.lIIIlIlIlllI(bankLocation.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderEasyClues.c = lIlIIlIIl[lIlIIlIlI[76]];
            a.a(bankLocation);
        }
        if (K.lIIIlIlIllll(lllIlllIllIlII) && K.lIIIlIlIllII(lllIlllIllIlII.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (K.lIIIlIlIlllI(Bank.isOpen() ? 1 : 0)) {
                a.a();
                Time.sleepUntil(() -> Bank.isOpen(), (int)lIlIIlIlI[2]);
                0;
                Time.sleepTicks((int)lIlIIlIlI[5]);
                0;
            }
            if (K.lIIIlIlIllII(Bank.isOpen() ? 1 : 0)) {
                AccBuilderEasyClues.c = lIlIIlIIl[lIlIIlIlI[77]];
                if (K.lIIIlIlIllII(iS ? 1 : 0)) {
                    int[] nArray = new int[lIlIIlIlI[1]];
                    nArray[K.lIlIIlIlI[0]] = lIlIIlIlI[48];
                    if (K.lIIIlIlIlllI(Inventory.contains((int[])nArray) ? 1 : 0) && K.lIIIlIllIIII(Inventory.getAll().size())) {
                        Bank.depositInventory();
                        Time.sleepTicks((int)lIlIIlIlI[4]);
                        0;
                    }
                }
                if (K.lIIIlIllIIII(Equipment.getAll().size())) {
                    Bank.depositEquipment();
                    Time.sleepTicks((int)lIlIIlIlI[3]);
                    0;
                }
                if (K.lIIIlIlIllII(iS ? 1 : 0)) {
                    int[] nArray = new int[lIlIIlIlI[1]];
                    nArray[K.lIlIIlIlI[0]] = lIlIIlIlI[48];
                    if (K.lIIIlIlIllII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        a.a(lIlIIlIlI[11], lIlIIlIlI[1]);
                        a.a(lIlIIlIlI[6], lIlIIlIlI[12]);
                        a.a(lIlIIlIlI[48], lIlIIlIlI[1]);
                        a.a(lIlIIlIlI[24], lIlIIlIlI[1]);
                        a.a(lIlIIlIlI[46], lIlIIlIlI[1]);
                        Time.sleepTicks((int)lIlIIlIlI[1]);
                        0;
                        int[] nArray2 = new int[lIlIIlIlI[1]];
                        nArray2[K.lIlIIlIlI[0]] = lIlIIlIlI[11];
                        if (K.lIIIlIlIlllI(Inventory.contains((int[])nArray2) ? 1 : 0)) {
                            a.a(lIlIIlIlI[78], lIlIIlIlI[1]);
                        }
                        a.a(lIlIIlIlI[17], Inventory.getFreeSlots() - lIlIIlIlI[1]);
                    }
                }
                if (K.lIIIlIlIllII(iS ? 1 : 0)) {
                    int[] nArray = new int[lIlIIlIlI[1]];
                    nArray[K.lIlIIlIlI[0]] = lIlIIlIlI[48];
                    if (K.lIIIlIlIlllI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        if (K.lIIIlIlIlllI(Equipment.contains((int[])f.aR) ? 1 : 0) && K.lIIIlIlIlllI(Inventory.contains((int[])f.aR) ? 1 : 0)) {
                            a.b(f.aR, lIlIIlIlI[1]);
                        }
                        if (K.lIIIlIlIllII(Inventory.contains((int[])f.aR) ? 1 : 0)) {
                            Inventory.getFirst((int[])f.aR).interact(lIlIIlIIl[lIlIIlIlI[79]]);
                            Time.sleepTicks((int)lIlIIlIlI[5]);
                            0;
                        }
                        if (K.lIIIlIlIlllI(Bank.isOpen() ? 1 : 0)) {
                            a.a();
                            Time.sleepTicks((int)lIlIIlIlI[10]);
                            0;
                        }
                        if (K.lIIIlIlIllII(Bank.isOpen() ? 1 : 0)) {
                            a.a(lIlIIlIlI[11], lIlIIlIlI[1]);
                            a.a(lIlIIlIlI[6], lIlIIlIlI[12]);
                            a.a(lIlIIlIlI[7], lIlIIlIlI[9]);
                        }
                    }
                }
            }
        }
    }

    private static void lIIIlIlIlIIl() {
        lIlIIlIIl = new String[lIlIIlIlI[121]];
        K.lIlIIlIIl[K.lIlIIlIlI[0]] = K."Finished buying items, switching back to quest";
        K.lIlIIlIIl[K.lIlIIlIlI[1]] = K."Nav to bank";
        K.lIlIIlIIl[K.lIlIIlIlI[3]] = K."Handling banking";
        K.lIlIIlIIl[K.lIlIIlIlI[5]] = K."We are missing quest supplies, switching to BUYING";
        K.lIlIIlIIl[K.lIlIIlIlI[4]] = K."We are missing quest supplies, switching to BUYING";
        K.lIlIIlIIl[K.lIlIIlIlI[10]] = K."Wear";
        K.lIlIIlIIl[K.lIlIIlIlI[16]] = K."Drink";
        K.lIlIIlIIl[K.lIlIIlIlI[18]] = K."Eat";
        K.lIlIIlIIl[K.lIlIIlIlI[19]] = K."Nav to start";
        K.lIlIIlIIl[K.lIlIIlIlI[20]] = K."Aris";
        K.lIlIIlIIl[K.lIlIIlIlI[12]] = K."Nav to sir pyrsin";
        K.lIlIIlIIl[K.lIlIIlIlI[23]] = K."Sir Prysin";
        K.lIlIIlIIl[K.lIlIIlIlI[25]] = K."Silverlight";
        K.lIlIIlIIl[K.lIlIIlIlI[26]] = K."Nav to captain";
        K.lIlIIlIIl[K.lIlIIlIlI[27]] = K."Captain Rovin";
        K.lIlIIlIIl[K.lIlIIlIlI[28]] = K."Bucket of water";
        K.lIlIIlIIl[K.lIlIIlIlI[29]] = K."Nav to drain";
        K.lIlIIlIIl[K.lIlIIlIlI[30]] = K."Bucket of water";
        K.lIlIIlIIl[K.lIlIIlIlI[31]] = K."Drain";
        K.lIlIIlIIl[K.lIlIIlIlI[32]] = K."Bucket of water";
        K.lIlIIlIIl[K.lIlIIlIlI[33]] = K."Nav to sewer key";
        K.lIlIIlIIl[K.lIlIIlIlI[34]] = K."Manhole";
        K.lIlIIlIIl[K.lIlIIlIlI[35]] = K."Manhole";
        K.lIlIIlIIl[K.lIlIIlIlI[36]] = K."Open";
        K.lIlIIlIIl[K.lIlIIlIlI[37]] = K."Manhole";
        K.lIlIIlIIl[K.lIlIIlIlI[9]] = K."Open";
        K.lIlIIlIIl[K.lIlIIlIlI[38]] = K."Manhole";
        K.lIlIIlIIl[K.lIlIIlIlI[39]] = K."Manhole";
        K.lIlIIlIIl[K.lIlIIlIlI[40]] = K."Climb-down";
        K.lIlIIlIIl[K.lIlIIlIlI[41]] = K."Manhole";
        K.lIlIIlIIl[K.lIlIIlIlI[42]] = K."Climb-down";
        K.lIlIIlIIl[K.lIlIIlIlI[43]] = K."Rusty key";
        K.lIlIIlIIl[K.lIlIIlIlI[44]] = K."Rusty key";
        K.lIlIIlIIl[K.lIlIIlIlI[45]] = K."Take";
        K.lIlIIlIIl[K.lIlIIlIlI[47]] = K."Silverlight";
        K.lIlIIlIIl[K.lIlIIlIlI[49]] = K."Bones";
        K.lIlIIlIIl[K.lIlIIlIlI[50]] = K."Bones";
        K.lIlIIlIIl[K.lIlIIlIlI[51]] = K."Nav to wizard";
        K.lIlIIlIIl[K.lIlIIlIlI[52]] = K."Wizard Traiborn";
        K.lIlIIlIIl[K.lIlIIlIlI[53]] = K."Silverlight";
        K.lIlIIlIIl[K.lIlIIlIlI[54]] = K."Nav to sir pyrsin";
        K.lIlIIlIIl[K.lIlIIlIlI[55]] = K."Sir Prysin";
        K.lIlIIlIIl[K.lIlIIlIlI[56]] = K."Silverlight";
        K.lIlIIlIIl[K.lIlIIlIlI[57]] = K."Delrith";
        K.lIlIIlIIl[K.lIlIIlIlI[58]] = K."Weakened Delrith";
        K.lIlIIlIIl[K.lIlIIlIlI[59]] = K."Nav to demon";
        K.lIlIIlIIl[K.lIlIIlIlI[60]] = K."Delrith";
        K.lIlIIlIIl[K.lIlIIlIlI[61]] = K."Weakened Delrith";
        K.lIlIIlIIl[K.lIlIIlIlI[62]] = K."Attack";
        K.lIlIIlIIl[K.lIlIIlIlI[63]] = K."Delrith";
        K.lIlIIlIIl[K.lIlIIlIlI[15]] = K."Delrith";
        K.lIlIIlIIl[K.lIlIIlIlI[64]] = K."Delrith";
        K.lIlIIlIIl[K.lIlIIlIlI[65]] = K."Attack";
        K.lIlIIlIIl[K.lIlIIlIlI[66]] = K."Banishing";
        K.lIlIIlIIl[K.lIlIIlIlI[67]] = K."[";
        K.lIlIIlIIl[K.lIlIIlIlI[68]] = K."Weakened Delrith";
        K.lIlIIlIIl[K.lIlIIlIlI[69]] = K."Banishing";
        K.lIlIIlIIl[K.lIlIIlIlI[75]] = K.", ";
        K.lIlIIlIIl[K.lIlIIlIlI[76]] = K."Nav to bank";
        K.lIlIIlIIl[K.lIlIIlIlI[77]] = K."Handling banking";
        K.lIlIIlIIl[K.lIlIIlIlI[79]] = K."Wear";
        K.lIlIIlIIl[K.lIlIIlIlI[87]] = K."Demon Slayer";
        K.lIlIIlIIl[K.lIlIIlIlI[88]] = K."ring of wealth (";
        K.lIlIIlIIl[K.lIlIIlIlI[89]] = K."wizard";
        K.lIlIIlIIl[K.lIlIIlIlI[90]] = K."Now what was that incantation again?";
        K.lIlIIlIIl[K.lIlIIlIlI[103]] = K."Yes.";
        K.lIlIIlIIl[K.lIlIIlIlI[104]] = K."The Demon Slayer Quest";
        K.lIlIIlIIl[K.lIlIIlIlI[105]] = K."Okay, where is he? I'll kill him for you!";
        K.lIlIIlIIl[K.lIlIIlIlI[106]] = K."So how did Wally kill Delrith?";
        K.lIlIIlIIl[K.lIlIIlIlI[107]] = K."What is the magical incantation?";
        K.lIlIIlIIl[K.lIlIIlIlI[108]] = K."Aris said I should come and talk to you.";
        K.lIlIIlIIl[K.lIlIIlIlI[109]] = K."I need to find Silverlight.";
        K.lIlIIlIIl[K.lIlIIlIlI[110]] = K."He's back and unfortunately I've got to deal with him.";
        K.lIlIIlIIl[K.lIlIIlIlI[111]] = K."So give me the keys!";
        K.lIlIIlIIl[K.lIlIIlIlI[112]] = K."Yes I know, but this is important.";
        K.lIlIIlIIl[K.lIlIIlIlI[113]] = K."There's a demon who wants to invade this city.";
        K.lIlIIlIIl[K.lIlIIlIlI[114]] = K."Yes, very.";
        K.lIlIIlIIl[K.lIlIIlIlI[115]] = K."It's not them who are going to fight the demon, it's me.";
        K.lIlIIlIIl[K.lIlIIlIlI[116]] = K."Sir Prysin said you would give me the key.";
        K.lIlIIlIIl[K.lIlIIlIlI[117]] = K."Why did he give you one of the keys then?";
        K.lIlIIlIIl[K.lIlIIlIlI[118]] = K."Talk about Demon Slayer.";
        K.lIlIIlIIl[K.lIlIIlIlI[119]] = K."Well, have you got any keys knocking around?";
        K.lIlIIlIIl[K.lIlIIlIlI[120]] = K."I'll get the bones for you.";
    }

    private static void cf() {
        if (!K.lIIIlIllIllI(iZ) || K.lIIIlIlIlllI(Vars.getBit((int)lIlIIlIlI[70])) && K.lIIIlIlIlllI(Vars.getBit((int)lIlIIlIlI[71]))) {
            return;
        }
        String[] stringArray = new String[lIlIIlIlI[10]];
        stringArray[K.lIlIIlIlI[0]] = iQ.get(Vars.getBit((int)lIlIIlIlI[70]));
        stringArray[K.lIlIIlIlI[1]] = iQ.get(Vars.getBit((int)lIlIIlIlI[71]));
        stringArray[K.lIlIIlIlI[3]] = iQ.get(Vars.getBit((int)lIlIIlIlI[72]));
        stringArray[K.lIlIIlIlI[5]] = iQ.get(Vars.getBit((int)lIlIIlIlI[73]));
        stringArray[K.lIlIIlIlI[4]] = iQ.get(Vars.getBit((int)lIlIIlIlI[74]));
        iZ = stringArray;
        String string = "Say the following in order: " + String.join((CharSequence)lIlIIlIIl[lIlIIlIlI[75]], iZ);
        System.out.println(string);
    }

    private static boolean lIIIlIlIllII(int n2) {
        return n2 != 0;
    }

    private static boolean lIIIlIlIlllI(int n2) {
        return n2 == 0;
    }

    private static boolean lIIIlIllIlll(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIIIlIllIlII(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIIIlIlllIII(Object object, Object object2) {
        return object == object2;
    }
}

