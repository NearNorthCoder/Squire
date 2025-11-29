/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Actor
 *  net.runelite.api.NPC
 *  net.runelite.api.Skill
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.widgets.Widget
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.input.Keyboard
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Bank$WithdrawMode
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.magic.Magic
 *  net.unethicalite.api.magic.Spell
 *  net.unethicalite.api.magic.SpellBook$Standard
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 *  net.unethicalite.api.widgets.Dialog
 *  net.unethicalite.api.widgets.Widgets
 */
package h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n;

import gg.squire.account.AccBuilderShamans;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.G;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.K;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.Z;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.a;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.b;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.d;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.e;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.f;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.g;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.j;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.y;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Actor;
import net.runelite.api.NPC;
import net.runelite.api.Skill;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.input.Keyboard;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.magic.Spell;
import net.unethicalite.api.magic.SpellBook;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Widgets;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class D
implements K {
    private static final /* synthetic */ int ip;
    private static final /* synthetic */ WorldPoint id;
    static /* synthetic */ String[] hn;
    private static final /* synthetic */ int hI;
    public static final /* synthetic */ WorldArea hD;
    private static final /* synthetic */ WorldPoint ic;
    private static final /* synthetic */ int iq;
    private static final /* synthetic */ WorldPoint hY;
    private static final /* synthetic */ WorldPoint ih;
    public static final /* synthetic */ WorldArea hz;
    private static final /* synthetic */ WorldPoint ib;
    private static final /* synthetic */ int hK;
    private static final /* synthetic */ WorldPoint ii;
    private static final /* synthetic */ int hH;
    private static final /* synthetic */ int im;
    public static /* synthetic */ int iw;
    private static final /* synthetic */ WorldArea ij;
    private static final /* synthetic */ WorldArea il;
    public static final /* synthetic */ WorldArea hB;
    static /* synthetic */ String iy;
    private static final /* synthetic */ WorldPoint ia;
    private static final /* synthetic */ WorldPoint hT;
    private static /* synthetic */ int[] iz;
    private static final /* synthetic */ WorldArea ik;
    private static final /* synthetic */ WorldPoint hU;
    static /* synthetic */ int dc;
    private static /* synthetic */ int[] lIlIlIIIIl;
    private static /* synthetic */ String[] lIlIIlllIl;
    public static final /* synthetic */ WorldArea hF;
    private static final /* synthetic */ int hP;
    private static final /* synthetic */ int hM;
    private static final /* synthetic */ int hQ;
    private static final /* synthetic */ int hR;
    private static final /* synthetic */ WorldPoint hX;
    private static final /* synthetic */ int it;
    private static final /* synthetic */ int iv;
    public static final /* synthetic */ WorldArea hA;
    private static final /* synthetic */ WorldPoint hZ;
    private static final /* synthetic */ int ir;
    public static /* synthetic */ List<d> bp;
    private static final /* synthetic */ int hS;
    private static final /* synthetic */ int iu;
    private static final /* synthetic */ WorldPoint ig;
    public static final /* synthetic */ WorldPoint hx;
    private static final /* synthetic */ WorldPoint hV;
    public static final /* synthetic */ WorldPoint hv;
    public static /* synthetic */ int ix;
    private static final /* synthetic */ WorldPoint hW;
    private static final /* synthetic */ int hO;
    public static /* synthetic */ boolean bn;
    public static final /* synthetic */ WorldArea hy;
    private static final /* synthetic */ int hJ;
    private static final /* synthetic */ int in;
    public static final /* synthetic */ WorldPoint hw;
    private static final /* synthetic */ int io;
    private static final /* synthetic */ WorldPoint if;
    private static final /* synthetic */ int is;
    public static final /* synthetic */ WorldArea hE;
    private static final /* synthetic */ int hN;
    private static final /* synthetic */ int hL;
    public static final /* synthetic */ WorldArea hC;
    private static final /* synthetic */ WorldPoint ie;
    private static final /* synthetic */ int hG;
    static /* synthetic */ boolean dd;

    public static void bS() {
        if (D.lIIIllllIlIIl(Inventory.contains((int[])f.aU) ? 1 : 0) && D.lIIIllllIIlll(Movement.getRunEnergy(), lIlIlIIIIl[68])) {
            Inventory.getFirst((int[])f.aU).interact(lIlIIlllIl[lIlIlIIIIl[80]]);
            Time.sleepTicks((int)lIlIlIIIIl[3]);
            0;
        }
        if (D.lIIIllllIlIlI(Movement.isRunEnabled() ? 1 : 0)) {
            Movement.toggleRun();
        }
        if (!D.lIIIllllIlIlI(ij.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || D.lIIIllllIllII(Players.getLocal().getWorldLocation().distanceTo(hY), lIlIlIIIIl[1])) {
            AccBuilderShamans.c = lIlIIlllIl[lIlIlIIIIl[81]];
            Movement.walkTo((WorldPoint)new WorldPoint(lIlIlIIIIl[58], lIlIlIIIIl[59], lIlIlIIIIl[4]));
            0;
            Time.sleepTicks((int)lIlIlIIIIl[3]);
            0;
        }
        int[] nArray = new int[lIlIlIIIIl[3]];
        nArray[D.lIlIlIIIIl[4]] = lIlIlIIIIl[82];
        NPC var8 = NPCs.getNearest((int[])nArray);
        int[] nArray2 = new int[lIlIlIIIIl[3]];
        nArray2[D.lIlIlIIIIl[4]] = lIlIlIIIIl[60];
        if (D.lIIIllllIlIlI(Inventory.contains((int[])nArray2) ? 1 : 0)) {
            if (D.lIIIllllIlIIl(hy.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && D.lIIIllllIllIl(var8) && D.lIIIllllIlIIl(hE.contains(var8.getWorldLocation()) ? 1 : 0)) {
                Time.sleepTicks((int)lIlIlIIIIl[24]);
                0;
                while (D.lIIIllllIlIll(Players.getLocal().getWorldLocation().distanceTo(hv), lIlIlIIIIl[3]) && D.lIIIllllIlIlI(AccBuilderShamans.d ? 1 : 0)) {
                    AccBuilderShamans.c = lIlIIlllIl[lIlIlIIIIl[83]];
                    Movement.walkTo((WorldPoint)hv);
                    0;
                    Time.sleepTicks((int)lIlIlIIIIl[3]);
                    0;
                    0;
                    
                    return;
                }
            }
            if (D.lIIIllllIlIIl(hz.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && D.lIIIllllIllIl(var8) && D.lIIIllllIlIIl(hB.contains(var8.getWorldLocation()) ? 1 : 0)) {
                while (D.lIIIllllIlIll(Players.getLocal().getWorldLocation().distanceTo(hw), lIlIlIIIIl[3]) && D.lIIIllllIlIlI(AccBuilderShamans.d ? 1 : 0)) {
                    AccBuilderShamans.c = lIlIIlllIl[lIlIlIIIIl[84]];
                    Movement.walkTo((WorldPoint)hw);
                    0;
                    Time.sleepTicks((int)lIlIlIIIIl[3]);
                    0;
                    0;
                    if (((0xB7 ^ 0xA0) & ~(0x60 ^ 0x77)) < 3) continue;
                    return;
                }
            }
            if (D.lIIIllllIlIIl(hA.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && D.lIIIllllIllIl(var8) && D.lIIIllllIlIIl(hF.contains(var8.getWorldLocation()) ? 1 : 0)) {
                Time.sleepTicks((int)lIlIlIIIIl[18]);
                0;
                while (D.lIIIllllIlIll(Players.getLocal().getWorldLocation().distanceTo(hx), lIlIlIIIIl[3]) && D.lIIIllllIlIlI(AccBuilderShamans.d ? 1 : 0)) {
                    AccBuilderShamans.c = lIlIIlllIl[lIlIlIIIIl[85]];
                    Movement.walkTo((WorldPoint)hx);
                    0;
                    Time.sleepTicks((int)lIlIlIIIIl[3]);
                    0;
                    0;
                    if (((0xA4 ^ 0x95) & ~(0x37 ^ 6)) != (0x83 ^ 0x87)) continue;
                    return;
                }
            }
            if (D.lIIIllllIlIIl(hD.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && D.lIIIllllIllIl(var8) && D.lIIIllllIlIIl(hF.contains(var8.getWorldLocation()) ? 1 : 0)) {
                while (D.lIIIllllIlIll(Players.getLocal().getWorldLocation().distanceTo(ii), lIlIlIIIIl[1]) && D.lIIIllllIlIlI(AccBuilderShamans.d ? 1 : 0)) {
                    AccBuilderShamans.c = lIlIIlllIl[lIlIlIIIIl[86]];
                    Movement.walkTo((WorldPoint)ii);
                    0;
                    Time.sleepTicks((int)lIlIlIIIIl[3]);
                    0;
                    0;
                    if (1 != 0) continue;
                    return;
                }
            }
            if (D.lIIIllllIllII(Players.getLocal().getWorldLocation().distanceTo(ii), lIlIlIIIIl[12])) {
                AccBuilderShamans.c = lIlIIlllIl[lIlIlIIIIl[87]];
                String[] stringArray = new String[lIlIlIIIIl[3]];
                stringArray[D.lIlIlIIIIl[4]] = lIlIIlllIl[lIlIlIIIIl[88]];
                TileObject var22 = TileObjects.getNearest((String[])stringArray);
                if (D.lIIIllllIllIl(var22)) {
                    var22.interact(lIlIIlllIl[lIlIlIIIIl[89]]);
                    Time.sleepTicks((int)lIlIlIIIIl[1]);
                    0;
                    Widget var9 = Widgets.get((int)lIlIlIIIIl[23], (int)lIlIlIIIIl[3]);
                    if (D.lIIIllllIllIl(var9)) {
                        var9.interact(lIlIIlllIl[lIlIlIIIIl[90]]);
                        var9.interact(lIlIlIIIIl[4]);
                        var9.interact(lIlIIlllIl[lIlIlIIIIl[91]]);
                        Keyboard.type((String)lIlIIlllIl[lIlIlIIIIl[92]]);
                    }
                }
            }
        }
        int[] nArray3 = new int[lIlIlIIIIl[3]];
        nArray3[D.lIlIlIIIIl[4]] = lIlIlIIIIl[60];
        if (D.lIIIllllIlIIl(Inventory.contains((int[])nArray3) ? 1 : 0)) {
            if (D.lIIIllllIllII(Players.getLocal().getWorldLocation().distanceTo(ii), lIlIlIIIIl[12])) {
                while (D.lIIIllllIlIll(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lIlIlIIIIl[93], lIlIlIIIIl[94], lIlIlIIIIl[4])), lIlIlIIIIl[3]) && D.lIIIllllIlIlI(AccBuilderShamans.d ? 1 : 0)) {
                    AccBuilderShamans.c = lIlIIlllIl[lIlIlIIIIl[95]];
                    Movement.walkTo((WorldPoint)new WorldPoint(lIlIlIIIIl[93], lIlIlIIIIl[94], lIlIlIIIIl[4]));
                    0;
                    Time.sleepTicks((int)lIlIlIIIIl[3]);
                    0;
                    0;
                    if (-2 < 0) continue;
                    return;
                }
            }
            if (D.lIIIllllIllII(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lIlIlIIIIl[93], lIlIlIIIIl[94], lIlIlIIIIl[4])), lIlIlIIIIl[1]) && D.lIIIllllIllIl(var8) && D.lIIIllllIlIIl(hE.contains(var8.getWorldLocation()) ? 1 : 0)) {
                while (D.lIIIllllIlIll(Players.getLocal().getWorldLocation().distanceTo(hw), lIlIlIIIIl[3]) && D.lIIIllllIlIlI(AccBuilderShamans.d ? 1 : 0)) {
                    AccBuilderShamans.c = lIlIIlllIl[lIlIlIIIIl[96]];
                    Movement.walkTo((WorldPoint)hw);
                    0;
                    Time.sleepTicks((int)lIlIlIIIIl[3]);
                    0;
                    0;
                    if ((0xB9 ^ 0x83 ^ (0x5A ^ 0x65)) > 0) continue;
                    return;
                }
            }
        }
    }

    private static void O() {
        d var1;
        block21: {
            block20: {
                Object var13;
                block19: {
                    block18: {
                        int[] nArray = new int[lIlIlIIIIl[3]];
                        nArray[D.lIlIlIIIIl[4]] = lIlIlIIIIl[8];
                        if (D.lIIIllllIlIlI(Bank.contains((int[])nArray) ? 1 : 0)) {
                            d d2 = new d(lIlIlIIIIl[8], lIlIlIIIIl[109], lIlIlIIIIl[110]);
                            bp.add(d2);
                            0;
                        }
                        int[] nArray2 = new int[lIlIlIIIIl[3]];
                        nArray2[D.lIlIlIIIIl[4]] = lIlIlIIIIl[8];
                        if (D.lIIIllllIlIIl(Bank.contains((int[])nArray2) ? 1 : 0)) {
                            int[] nArray3 = new int[lIlIlIIIIl[3]];
                            nArray3[D.lIlIlIIIIl[4]] = lIlIlIIIIl[8];
                            if (D.lIIIllllIIlll(Bank.getFirst((int[])nArray3).getQuantity(), lIlIlIIIIl[33])) {
                                var13 = new d(lIlIlIIIIl[8], lIlIlIIIIl[54], lIlIlIIIIl[110]);
                                bp.add((d)var13);
                                0;
                            }
                        }
                        int[] nArray4 = new int[lIlIlIIIIl[3]];
                        nArray4[D.lIlIlIIIIl[4]] = lIlIlIIIIl[9];
                        if (!D.lIIIllllIlIIl(Bank.contains((int[])nArray4) ? 1 : 0)) break block18;
                        int[] nArray5 = new int[lIlIlIIIIl[3]];
                        nArray5[D.lIlIlIIIIl[4]] = lIlIlIIIIl[9];
                        if (!D.lIIIllllIlIIl(Bank.contains((int[])nArray5) ? 1 : 0)) break block19;
                        int[] nArray6 = new int[lIlIlIIIIl[3]];
                        nArray6[D.lIlIlIIIIl[4]] = lIlIlIIIIl[9];
                        if (!D.lIIIllllIIlll(Bank.getFirst((int[])nArray6).getQuantity(), lIlIlIIIIl[13])) break block19;
                    }
                    var13 = new d(lIlIlIIIIl[9], lIlIlIIIIl[13], lIlIlIIIIl[111]);
                    bp.add((d)var13);
                    0;
                }
                if (D.lIIIllllIlIlI(Bank.contains((Predicate)(var13 = item -> item.getName().toLowerCase().contains(lIlIIlllIl[lIlIlIIIIl[117]]))) ? 1 : 0)) {
                    var1 = new d(lIlIlIIIIl[112], lIlIlIIIIl[31], lIlIlIIIIl[113]);
                    bp.add(var1);
                    0;
                }
                int[] nArray = new int[lIlIlIIIIl[3]];
                nArray[D.lIlIlIIIIl[4]] = lIlIlIIIIl[105];
                if (D.lIIIllllIlIlI(Bank.contains((int[])nArray) ? 1 : 0)) {
                    var1 = new d(lIlIlIIIIl[105], lIlIlIIIIl[54], lIlIlIIIIl[114]);
                    bp.add(var1);
                    0;
                }
                int[] nArray7 = new int[lIlIlIIIIl[3]];
                nArray7[D.lIlIlIIIIl[4]] = lIlIlIIIIl[10];
                if (!D.lIIIllllIlIIl(Bank.contains((int[])nArray7) ? 1 : 0)) break block20;
                int[] nArray8 = new int[lIlIlIIIIl[3]];
                nArray8[D.lIlIlIIIIl[4]] = lIlIlIIIIl[10];
                if (!D.lIIIllllIlIIl(Bank.contains((int[])nArray8) ? 1 : 0)) break block21;
                int[] nArray9 = new int[lIlIlIIIIl[3]];
                nArray9[D.lIlIlIIIIl[4]] = lIlIlIIIIl[10];
                if (!D.lIIIllllIIlll(Bank.getFirst((int[])nArray9).getQuantity(), lIlIlIIIIl[22])) break block21;
            }
            var1 = new d(lIlIlIIIIl[10], lIlIlIIIIl[33], lIlIlIIIIl[114]);
            bp.add(var1);
            0;
        }
        int[] nArray = new int[lIlIlIIIIl[3]];
        nArray[D.lIlIlIIIIl[4]] = lIlIlIIIIl[108];
        if (D.lIIIllllIlIlI(Bank.contains((int[])nArray) ? 1 : 0)) {
            var1 = new d(lIlIlIIIIl[108], lIlIlIIIIl[13], j.bZ);
            bp.add(var1);
            0;
        }
        int[] nArray10 = new int[lIlIlIIIIl[3]];
        nArray10[D.lIlIlIIIIl[4]] = lIlIlIIIIl[7];
        if (D.lIIIllllIlIIl(Bank.contains((int[])nArray10) ? 1 : 0)) {
            int[] nArray11 = new int[lIlIlIIIIl[3]];
            nArray11[D.lIlIlIIIIl[4]] = lIlIlIIIIl[7];
            if (D.lIIIllllIIlll(Bank.getFirst((int[])nArray11).getQuantity(), lIlIlIIIIl[101])) {
                var1 = new d(lIlIlIIIIl[7], lIlIlIIIIl[115], lIlIlIIIIl[18]);
                bp.add(var1);
                0;
            }
        }
        int[] nArray12 = new int[lIlIlIIIIl[3]];
        nArray12[D.lIlIlIIIIl[4]] = lIlIlIIIIl[5];
        if (D.lIIIllllIlIIl(Bank.contains((int[])nArray12) ? 1 : 0)) {
            int[] nArray13 = new int[lIlIlIIIIl[3]];
            nArray13[D.lIlIlIIIIl[4]] = lIlIlIIIIl[5];
            if (D.lIIIllllIIlll(Bank.getFirst((int[])nArray13).getQuantity(), lIlIlIIIIl[101])) {
                var1 = new d(lIlIlIIIIl[5], lIlIlIIIIl[115], lIlIlIIIIl[18]);
                bp.add(var1);
                0;
            }
        }
        int[] nArray14 = new int[lIlIlIIIIl[3]];
        nArray14[D.lIlIlIIIIl[4]] = lIlIlIIIIl[6];
        if (D.lIIIllllIlIIl(Bank.contains((int[])nArray14) ? 1 : 0)) {
            int[] nArray15 = new int[lIlIlIIIIl[3]];
            nArray15[D.lIlIlIIIIl[4]] = lIlIlIIIIl[6];
            if (D.lIIIllllIIlll(Bank.getFirst((int[])nArray15).getQuantity(), lIlIlIIIIl[101])) {
                var1 = new d(lIlIlIIIIl[6], lIlIlIIIIl[115], lIlIlIIIIl[18]);
                bp.add(var1);
                0;
            }
        }
    }

    private static boolean lIIIllllIIlll(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIIIllllIlllI(Object object) {
        return object == null;
    }

    static {
        D.lIIIllllIIllI();
        D.lIIIllllIIlIl();
        ip = lIlIlIIIIl[118];
        it = lIlIlIIIIl[119];
        ir = lIlIlIIIIl[5];
        hK = lIlIlIIIIl[1];
        hJ = lIlIlIIIIl[3];
        hL = lIlIlIIIIl[12];
        hQ = lIlIlIIIIl[60];
        hP = lIlIlIIIIl[17];
        iv = lIlIlIIIIl[9];
        hO = lIlIlIIIIl[82];
        is = lIlIlIIIIl[6];
        hH = lIlIlIIIIl[1];
        hI = lIlIlIIIIl[2];
        io = lIlIlIIIIl[120];
        hM = lIlIlIIIIl[14];
        hS = lIlIlIIIIl[19];
        im = lIlIlIIIIl[121];
        iq = lIlIlIIIIl[7];
        iu = lIlIlIIIIl[8];
        hR = lIlIlIIIIl[39];
        in = lIlIlIIIIl[122];
        hG = lIlIlIIIIl[0];
        hN = lIlIlIIIIl[18];
        hv = new WorldPoint(lIlIlIIIIl[123], lIlIlIIIIl[59], lIlIlIIIIl[4]);
        hw = new WorldPoint(lIlIlIIIIl[62], lIlIlIIIIl[124], lIlIlIIIIl[4]);
        hx = new WorldPoint(lIlIlIIIIl[125], lIlIlIIIIl[94], lIlIlIIIIl[4]);
        hy = new WorldArea(lIlIlIIIIl[126], lIlIlIIIIl[127], lIlIlIIIIl[31], lIlIlIIIIl[14], lIlIlIIIIl[4]);
        hz = new WorldArea(lIlIlIIIIl[128], lIlIlIIIIl[127], lIlIlIIIIl[30], lIlIlIIIIl[14], lIlIlIIIIl[4]);
        hA = new WorldArea(lIlIlIIIIl[129], lIlIlIIIIl[130], lIlIlIIIIl[15], lIlIlIIIIl[22], lIlIlIIIIl[4]);
        hB = new WorldArea(lIlIlIIIIl[131], lIlIlIIIIl[132], lIlIlIIIIl[24], lIlIlIIIIl[15], lIlIlIIIIl[4]);
        hC = new WorldArea(lIlIlIIIIl[133], lIlIlIIIIl[132], lIlIlIIIIl[18], lIlIlIIIIl[13], lIlIlIIIIl[4]);
        hD = new WorldArea(lIlIlIIIIl[134], lIlIlIIIIl[135], lIlIlIIIIl[21], lIlIlIIIIl[18], lIlIlIIIIl[4]);
        hE = new WorldArea(lIlIlIIIIl[136], lIlIlIIIIl[132], lIlIlIIIIl[15], lIlIlIIIIl[15], lIlIlIIIIl[4]);
        hF = new WorldArea(lIlIlIIIIl[137], lIlIlIIIIl[132], lIlIlIIIIl[15], lIlIlIIIIl[13], lIlIlIIIIl[4]);
        hT = new WorldPoint(lIlIlIIIIl[138], lIlIlIIIIl[139], lIlIlIIIIl[1]);
        hU = new WorldPoint(lIlIlIIIIl[140], lIlIlIIIIl[141], lIlIlIIIIl[4]);
        hV = new WorldPoint(lIlIlIIIIl[142], lIlIlIIIIl[127], lIlIlIIIIl[4]);
        hW = new WorldPoint(lIlIlIIIIl[143], lIlIlIIIIl[144], lIlIlIIIIl[4]);
        hX = new WorldPoint(lIlIlIIIIl[145], lIlIlIIIIl[146], lIlIlIIIIl[4]);
        hY = new WorldPoint(lIlIlIIIIl[131], lIlIlIIIIl[94], lIlIlIIIIl[4]);
        hZ = new WorldPoint(lIlIlIIIIl[147], lIlIlIIIIl[148], lIlIlIIIIl[4]);
        ia = new WorldPoint(lIlIlIIIIl[149], lIlIlIIIIl[150], lIlIlIIIIl[4]);
        ib = new WorldPoint(lIlIlIIIIl[145], lIlIlIIIIl[151], lIlIlIIIIl[4]);
        ic = new WorldPoint(lIlIlIIIIl[131], lIlIlIIIIl[151], lIlIlIIIIl[4]);
        id = new WorldPoint(lIlIlIIIIl[131], lIlIlIIIIl[152], lIlIlIIIIl[4]);
        ie = new WorldPoint(lIlIlIIIIl[136], lIlIlIIIIl[151], lIlIlIIIIl[4]);
        if = new WorldPoint(lIlIlIIIIl[136], lIlIlIIIIl[152], lIlIlIIIIl[4]);
        ig = new WorldPoint(lIlIlIIIIl[58], lIlIlIIIIl[153], lIlIlIIIIl[4]);
        ih = new WorldPoint(lIlIlIIIIl[62], lIlIlIIIIl[135], lIlIlIIIIl[4]);
        ii = new WorldPoint(lIlIlIIIIl[154], lIlIlIIIIl[155], lIlIlIIIIl[4]);
        ij = new WorldArea(new WorldPoint(lIlIlIIIIl[156], lIlIlIIIIl[157], lIlIlIIIIl[4]), new WorldPoint(lIlIlIIIIl[58], lIlIlIIIIl[94], lIlIlIIIIl[4]));
        ik = new WorldArea(new WorldPoint(lIlIlIIIIl[145], lIlIlIIIIl[158], lIlIlIIIIl[4]), new WorldPoint(lIlIlIIIIl[159], lIlIlIIIIl[160], lIlIlIIIIl[4]));
        il = new WorldArea(lIlIlIIIIl[62], lIlIlIIIIl[130], lIlIlIIIIl[14], lIlIlIIIIl[22], lIlIlIIIIl[4]);
        bp = new ArrayList<d>();
        iw = lIlIlIIIIl[161];
        ix = lIlIlIIIIl[162];
        iy = lIlIIlllIl[lIlIlIIIIl[163]];
        String[] stringArray = new String[lIlIlIIIIl[14]];
        stringArray[D.lIlIlIIIIl[4]] = lIlIIlllIl[lIlIlIIIIl[164]];
        stringArray[D.lIlIlIIIIl[3]] = lIlIIlllIl[lIlIlIIIIl[165]];
        stringArray[D.lIlIlIIIIl[1]] = lIlIIlllIl[lIlIlIIIIl[166]];
        stringArray[D.lIlIlIIIIl[12]] = lIlIIlllIl[lIlIlIIIIl[167]];
        stringArray[D.lIlIlIIIIl[15]] = lIlIIlllIl[lIlIlIIIIl[168]];
        stringArray[D.lIlIlIIIIl[13]] = lIlIIlllIl[lIlIlIIIIl[169]];
        hn = stringArray;
        int[] nArray = new int[lIlIlIIIIl[15]];
        nArray[D.lIlIlIIIIl[4]] = lIlIlIIIIl[170];
        nArray[D.lIlIlIIIIl[3]] = lIlIlIIIIl[171];
        nArray[D.lIlIlIIIIl[1]] = lIlIlIIIIl[172];
        nArray[D.lIlIlIIIIl[12]] = lIlIlIIIIl[173];
        iz = nArray;
    }

    private static boolean lIIIllllIlIll(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIIIllllIlIII(int n2, int n3) {
        return n2 == n3;
    }

    private static void lIIIllllIIllI() {
        lIlIlIIIIl = new int[175];
        D.lIlIlIIIIl[0] = 126 + 21 - 121 + 134;
        D.lIlIlIIIIl[1] = 2;
        D.lIlIlIIIIl[2] = 194 + 97 - 152 + 87;
        D.lIlIlIIIIl[3] = 1;
        D.lIlIlIIIIl[4] = (0x34 ^ 0x33) & ~(0x37 ^ 0x30);
        D.lIlIlIIIIl[5] = -(0xFFFFBBFF & 0x7C91) & (0xFFFFBFBB & 0x7AFF);
        D.lIlIlIIIIl[6] = 0xFFFFDE6F & 0x23BD;
        D.lIlIlIIIIl[7] = 0xFFFFE6AE & 0x1B7F;
        D.lIlIlIIIIl[8] = 0xFFFFCBFF & 0x357B;
        D.lIlIlIIIIl[9] = -(0xFFFFBF9F & 0x586F) & (0xFFFFBFDF & 0x5FEF);
        D.lIlIlIIIIl[10] = -(0xFFFFE6BB & 0x79D7) & (0xFFFFFFDF & 0x7FFB);
        D.lIlIlIIIIl[11] = (0x35 ^ 0x19) + (0x15 ^ 0x2D) - (0x4B ^ 0x7B) + (0xFB ^ 0x99);
        D.lIlIlIIIIl[12] = 3;
        D.lIlIlIIIIl[13] = 19 + 16 - 20 + 136 ^ 77 + 103 - 99 + 65;
        D.lIlIlIIIIl[14] = 43 + 30 - -26 + 36 ^ 93 + 14 - 63 + 85;
        D.lIlIlIIIIl[15] = 0x95 ^ 0x91;
        D.lIlIlIIIIl[16] = 0x35 ^ 0x1B ^ (0xF7 ^ 0x89);
        D.lIlIlIIIIl[17] = -(0xFFFFB797 & 0x6EE9) & (0xFFFFEFEB & 0x3FFD);
        D.lIlIlIIIIl[18] = 0xB ^ 0x56 ^ (0x9B ^ 0xC1);
        D.lIlIlIIIIl[19] = 0xFFFFABB7 & 0x5F7B;
        D.lIlIlIIIIl[20] = 0x5B ^ 0x52 ^ 1;
        D.lIlIlIIIIl[21] = 0xBB ^ 0x89 ^ (0x40 ^ 0x7B);
        D.lIlIlIIIIl[22] = 0x34 ^ 0x58 ^ (0x7F ^ 0x19);
        D.lIlIlIIIIl[23] = 99 + 1 - -34 + 95;
        D.lIlIlIIIIl[24] = 0x95 ^ 0x9E;
        D.lIlIlIIIIl[25] = 137 + 83 - 121 + 43 ^ 102 + 43 - 67 + 52;
        D.lIlIlIIIIl[26] = 90 + 92 - 16 + 20 ^ 71 + 56 - 58 + 114;
        D.lIlIlIIIIl[27] = 0x84 ^ 0x8A;
        D.lIlIlIIIIl[28] = 0x8B ^ 0x84;
        D.lIlIlIIIIl[29] = 0xA0 ^ 0xB0;
        D.lIlIlIIIIl[30] = 0x9B ^ 0x8A;
        D.lIlIlIIIIl[31] = 0 ^ 0x11 ^ 3;
        D.lIlIlIIIIl[32] = 0x7A ^ 0x69;
        D.lIlIlIIIIl[33] = 71 + 47 - 69 + 85 ^ 107 + 96 - 183 + 126;
        D.lIlIlIIIIl[34] = 0xDB ^ 0x9A ^ (0x1F ^ 0x4B);
        D.lIlIlIIIIl[35] = 0x96 ^ 0xBA ^ (0x7A ^ 0x40);
        D.lIlIlIIIIl[36] = 0xB5 ^ 0xA2;
        D.lIlIlIIIIl[37] = 0x2C ^ 0x34;
        D.lIlIlIIIIl[38] = 0x3A ^ 0x72 ^ (0xCB ^ 0x9A);
        D.lIlIlIIIIl[39] = 0xFFFFAF7A & 0x59EF;
        D.lIlIlIIIIl[40] = 40 + 94 - 13 + 59 ^ 69 + 95 - 127 + 137;
        D.lIlIlIIIIl[41] = 0x92 ^ 0xAD ^ (0x1F ^ 0x3B);
        D.lIlIlIIIIl[42] = 0x7A ^ 0x66;
        D.lIlIlIIIIl[43] = 0xE7 ^ 0x9D ^ (0xED ^ 0x8A);
        D.lIlIlIIIIl[44] = 0x84 ^ 0x9A;
        D.lIlIlIIIIl[45] = 0x96 ^ 0x89;
        D.lIlIlIIIIl[46] = 0x30 ^ 0x10;
        D.lIlIlIIIIl[47] = 0x56 ^ 0x77;
        D.lIlIlIIIIl[48] = 0x5B ^ 0x79;
        D.lIlIlIIIIl[49] = 0x39 ^ 0x1A;
        D.lIlIlIIIIl[50] = 0x48 ^ 0x6C;
        D.lIlIlIIIIl[51] = 0x17 ^ 0x36 ^ (0x86 ^ 0x82);
        D.lIlIlIIIIl[52] = 0x1D ^ 0x17 ^ (0x8B ^ 0xA7);
        D.lIlIlIIIIl[53] = 0x13 ^ 0x34;
        D.lIlIlIIIIl[54] = 0x8A ^ 0xA2;
        D.lIlIlIIIIl[55] = 27 + 94 - 103 + 144 ^ 64 + 22 - -41 + 12;
        D.lIlIlIIIIl[56] = 0x91 ^ 0xBB;
        D.lIlIlIIIIl[57] = 0xA8 ^ 0x83;
        D.lIlIlIIIIl[58] = -(0xFFFFF5BB & 0x1ECD) & (0xFFFFDFFF & 0x3FDD);
        D.lIlIlIIIIl[59] = 0xFFFFDD8D & 0x2FF6;
        D.lIlIlIIIIl[60] = 0xFFFFCDEB & 0x3B7F;
        D.lIlIlIIIIl[61] = 18 + 131 - 56 + 69 ^ 98 + 95 - 82 + 31;
        D.lIlIlIIIIl[62] = 0xFFFF9BFD & 0x6F77;
        D.lIlIlIIIIl[63] = 0x81 ^ 0xAC;
        D.lIlIlIIIIl[64] = 0x77 ^ 0x62 ^ (0x6E ^ 0x55);
        D.lIlIlIIIIl[65] = 0x2A ^ 5;
        D.lIlIlIIIIl[66] = 6 + 65 - -55 + 63 ^ 125 + 124 - 162 + 54;
        D.lIlIlIIIIl[67] = 150 + 171 - 302 + 164 ^ 50 + 0 - -13 + 71;
        D.lIlIlIIIIl[68] = 0x23 ^ 0x11;
        D.lIlIlIIIIl[69] = 0x39 ^ 1 ^ (0x9E ^ 0x95);
        D.lIlIlIIIIl[70] = 132 + 141 - 177 + 46 ^ 179 + 85 - 92 + 14;
        D.lIlIlIIIIl[71] = 0x5F ^ 0x48 ^ (0x9A ^ 0xB8);
        D.lIlIlIIIIl[72] = 0xF4 ^ 0xC2;
        D.lIlIlIIIIl[73] = 0x65 ^ 0x3E ^ (0xD8 ^ 0xB4);
        D.lIlIlIIIIl[74] = 0xA4 ^ 0x9C;
        D.lIlIlIIIIl[75] = 0x5B ^ 0x3C ^ (0xE4 ^ 0xBA);
        D.lIlIlIIIIl[76] = 0x95 ^ 0x9F ^ (0x5A ^ 0x6A);
        D.lIlIlIIIIl[77] = 0x99 ^ 0xA2;
        D.lIlIlIIIIl[78] = 0x87 ^ 0xA7 ^ (0x75 ^ 0x69);
        D.lIlIlIIIIl[79] = 0x4C ^ 0x71;
        D.lIlIlIIIIl[80] = 0x7E ^ 0x70 ^ (0x9F ^ 0xAF);
        D.lIlIlIIIIl[81] = 0x9B ^ 0xC7 ^ (0xE4 ^ 0x87);
        D.lIlIlIIIIl[82] = 0xFFFF9F9B & 0x6FFF;
        D.lIlIlIIIIl[83] = 0x17 ^ 0x63 ^ (9 ^ 0x3D);
        D.lIlIlIIIIl[84] = 0xF ^ 0x4E;
        D.lIlIlIIIIl[85] = 0x99 ^ 0x9D ^ (0x62 ^ 0x24);
        D.lIlIlIIIIl[86] = 0xCB ^ 0x88;
        D.lIlIlIIIIl[87] = 0xE4 ^ 0xA0;
        D.lIlIlIIIIl[88] = 0xD7 ^ 0x9D ^ (0x32 ^ 0x3D);
        D.lIlIlIIIIl[89] = 0x61 ^ 0x27;
        D.lIlIlIIIIl[90] = 0xCC ^ 0x8B;
        D.lIlIlIIIIl[91] = 67 + 180 - 96 + 46 ^ 0 + 55 - 28 + 114;
        D.lIlIlIIIIl[92] = 0x32 ^ 0x16 ^ (0x52 ^ 0x3F);
        D.lIlIlIIIIl[93] = -(0xFFFFA687 & 0x7DFF) & (0xFFFFFFFF & 0x2FE7);
        D.lIlIlIIIIl[94] = 0xFFFFADFB & 0x5F8E;
        D.lIlIlIIIIl[95] = 0x1F ^ 0x36 ^ (0x6F ^ 0xC);
        D.lIlIlIIIIl[96] = 0x6C ^ 0x26 ^ 1;
        D.lIlIlIIIIl[97] = 0x29 ^ 0x65;
        D.lIlIlIIIIl[98] = 0x5E ^ 0x13;
        D.lIlIlIIIIl[99] = 0xFFFFDFDE & 0x33A9;
        D.lIlIlIIIIl[100] = 0xAA ^ 0xB5 ^ (0xDA ^ 0x8B);
        D.lIlIlIIIIl[101] = 0xFFFFD3E8 & 0x2FFF;
        D.lIlIlIIIIl[102] = 0x18 ^ 0x57;
        D.lIlIlIIIIl[103] = 0x31 ^ 0x10 ^ (0xDE ^ 0xAE);
        D.lIlIlIIIIl[104] = 147 + 71 - 36 + 15 ^ 97 + 51 - 130 + 133;
        D.lIlIlIIIIl[105] = -(0xFFFFE4BB & 0x3BED) & (0xFFFFFFEF & 0x3FFF);
        D.lIlIlIIIIl[106] = 0x6D ^ 0x3E;
        D.lIlIlIIIIl[107] = 0xFFFFE9F4 & 0x17FF;
        D.lIlIlIIIIl[108] = 0xFFFFBDDB & 0x7375;
        D.lIlIlIIIIl[109] = 0xC3 ^ 0xA7;
        D.lIlIlIIIIl[110] = 0xFFFFD7BA & 0x29D5;
        D.lIlIlIIIIl[111] = 0xFFFF93FE & 0x7FF7;
        D.lIlIlIIIIl[112] = 0xFFFFAFFC & 0x7ECF;
        D.lIlIlIIIIl[113] = 0xFFFFE379 & 0x5EEE;
        D.lIlIlIIIIl[114] = 0xFFFFDF6C & 0x27FF;
        D.lIlIlIIIIl[115] = -(0xFFFFF7A9 & 0x685E) & (0xFFFFFFDF & 0x67F7);
        D.lIlIlIIIIl[116] = 0xC4 ^ 0xB2 ^ (0x2E ^ 0xC);
        D.lIlIlIIIIl[117] = 0x46 ^ 0x13;
        D.lIlIlIIIIl[118] = -(0xFFFFFEF7 & 0x793B) & (0xFFFFFDFE & 0x7FF7);
        D.lIlIlIIIIl[119] = -(0xFFFFF537 & 0x6FCD) & (0xFFFFF7BE & 0x6F6F);
        D.lIlIlIIIIl[120] = -(0xFFFFF17F & 0x3E9D) & (0xFFFFF5FF & 0x3FDE);
        D.lIlIlIIIIl[121] = -(0xFFFF9BCB & 0x6676) & (0xFFFFF7FF & 0xFFF);
        D.lIlIlIIIIl[122] = 0xFFFFA7E7 & 0x5DD8;
        D.lIlIlIIIIl[123] = -(0xFFFF94B9 & 0x7F5F) & (0xFFFFBF7C & 0x5FFF);
        D.lIlIlIIIIl[124] = -(0xFFFFF2FF & 0x7D72) & (0xFFFFFDFB & 0x7FFD);
        D.lIlIlIIIIl[125] = -(0xFFFFFEBB & 0x61DD) & (0xFFFFEBFF & Short.MAX_VALUE);
        D.lIlIlIIIIl[126] = -(0xFFFFD78B & 0x6C7E) & (0xFFFFEFFF & 0x5F5D);
        D.lIlIlIIIIl[127] = -(0xFFFFFA5B & 0x57ED) & (0xFFFFFFEF & 0x5FDB);
        D.lIlIlIIIIl[128] = -(0xFFFFB59B & 0x4EED) & (0xFFFFFFFF & 0xFEB);
        D.lIlIlIIIIl[129] = -(0xFFFFBC7F & 0x5786) & (0xFFFFDFF7 & 0x3F7F);
        D.lIlIlIIIIl[130] = 0xFFFF9DC3 & 0x6FBE;
        D.lIlIlIIIIl[131] = -(0xFFFFFCAF & 0x5771) & (0xFFFFDF76 & Short.MAX_VALUE);
        D.lIlIlIIIIl[132] = -(0xFFFFFADF & 0x4579) & (0xFFFFEFDD & 0x5DFF);
        D.lIlIlIIIIl[133] = 0xFFFFDBF5 & 0x2F6F;
        D.lIlIlIIIIl[134] = 0xFFFF9B76 & 0x6FE9;
        D.lIlIlIIIIl[135] = 0xFFFFBDC7 & 0x4FBF;
        D.lIlIlIIIIl[136] = -(0xFFFF9FAD & 0x745B) & (0xFFFF9FDF & 0x7F7F);
        D.lIlIlIIIIl[137] = -(0xFFFFE79F & 0x3CE7) & (0xFFFFEFF7 & 0x3FFF);
        D.lIlIlIIIIl[138] = -(0xFFFFD3F5 & 0x7FCF) & (0xFFFFFFFD & 0x5FE6);
        D.lIlIlIIIIl[139] = -(0xFFFFC317 & 0x7FED) & (0xFFFFFFDF & 0x4F7F);
        D.lIlIlIIIIl[140] = -(0xFFFFF3F7 & 0x6C19) & (0xFFFFEFFF & 0x7B7F);
        D.lIlIlIIIIl[141] = -(0xFFFFD7F3 & 0x7A8D) & (0xFFFFDFFF & Short.MAX_VALUE);
        D.lIlIlIIIIl[142] = -(0xFFFFF3A7 & 0x5CD9) & (0xFFFFFFF9 & 0x5BFE);
        D.lIlIlIIIIl[143] = -(0xFFFFED79 & 0x36CF) & (0xFFFFFFFE & 0x2FDF);
        D.lIlIlIIIIl[144] = 0xFFFFCF3F & 0x3DF5;
        D.lIlIlIIIIl[145] = -(0xFFFFF5CD & 0x1ABF) & (0xFFFFBBDF & 0x5FFF);
        D.lIlIlIIIIl[146] = 0xFFFF8D9D & 0x7FF3;
        D.lIlIlIIIIl[147] = -(0xFFFFF40F & 0x6BF3) & (0xFFFFFB7B & 0x6FDF);
        D.lIlIlIIIIl[148] = -(0xFFFFFA3F & 0x35E5) & (0xFFFFFDF7 & 0x3FBF);
        D.lIlIlIIIIl[149] = 0xFFFF9BDF & 0x6F7A;
        D.lIlIlIIIIl[150] = 0xFFFFFEFF & 0x2794;
        D.lIlIlIIIIl[151] = 0xFFFFE7FF & 0x3E92;
        D.lIlIlIIIIl[152] = 0xFFFFAE9B & 0x77F5;
        D.lIlIlIIIIl[153] = -(0xFFFFDBE5 & 0x665F) & (0xFFFFEFDD & 0x5FEF);
        D.lIlIlIIIIl[154] = -(0xFFFFAD83 & 0x76FD) & (0xFFFFBFDF & 0x6FFF);
        D.lIlIlIIIIl[155] = -(0xFFFF9AF3 & 0x772F) & (0xFFFFBFFF & 0x5FAF);
        D.lIlIlIIIIl[156] = -(0xFFFFFD7D & 0x7683) & (0xFFFFFFFB & 0x7F5F);
        D.lIlIlIIIIl[157] = 0xFFFFBDFF & 0x4F94;
        D.lIlIlIIIIl[158] = 0xFFFFE7AE & 0x3EDF;
        D.lIlIlIIIIl[159] = 0xFFFFEB5F & 0x1FFD;
        D.lIlIlIIIIl[160] = -(0xFFFFDFEF & 0x3153) & (0xFFFFF7FF & 0x3FD7);
        D.lIlIlIIIIl[161] = -(0xFFFFE7FF & 0x5961) & (0xFFFFFD77 & 0x7FEB);
        D.lIlIlIIIIl[162] = -(0xFFFFEAF1 & 0x75FF) & (0xFFFFF6FB & 0x7DF7);
        D.lIlIlIIIIl[163] = 0x1B ^ 0x4D;
        D.lIlIlIIIIl[164] = 0x75 ^ 0x16 ^ (0x66 ^ 0x52);
        D.lIlIlIIIIl[165] = 0x27 ^ 0x41 ^ (0x20 ^ 0x1E);
        D.lIlIlIIIIl[166] = 2 ^ 0x5B;
        D.lIlIlIIIIl[167] = 139 + 70 - 129 + 137 ^ 115 + 92 - 191 + 115;
        D.lIlIlIIIIl[168] = 0x3D ^ 0x72 ^ (0x1C ^ 8);
        D.lIlIlIIIIl[169] = 0x36 ^ 0x6A;
        D.lIlIlIIIIl[170] = -(0xFFFFFBAB & 0x4476) & (0xFFFFEFBF & 0x5FFD);
        D.lIlIlIIIIl[171] = -(0xFFFFF5DB & 0x6A67) & (0xFFFFEFFF & 0x7FDF);
        D.lIlIlIIIIl[172] = 0xFFFFEFFF & 0x1F9E;
        D.lIlIlIIIIl[173] = 0xFFFFCFBF & 0x3FDF;
        D.lIlIlIIIIl[174] = 6 ^ 0x6B ^ (0xF1 ^ 0xC1);
    }

    private static boolean lIIIllllIllII(int n2, int n3) {
        return n2 <= n3;
    }

    public static void bR() {
        TileObject lllllllllllllllllllIlllllIllIIlI2;
        block91: {
            block93: {
                block92: {
                    block89: {
                        block90: {
                            Widget var24;
                            if (D.lIIIllllIIlll(e.j(lIlIlIIIIl[0]), lIlIlIIIIl[1])) {
                                try {
                                    G.ch();
                                    0;
                                }
                                catch (Exception lllllllllllllllllllIlllllIllIIlI2) {
                                    lllllllllllllllllllIlllllIllIIlI2.printStackTrace();
                                }
                                if (-1 > 3) {
                                    return;
                                }
                            }
                            if (D.lIIIllllIlIII(e.j(lIlIlIIIIl[0]), lIlIlIIIIl[1]) && D.lIIIllllIIlll(e.j(lIlIlIIIIl[2]), lIlIlIIIIl[3])) {
                                block88: {
                                    if (D.lIIIllllIlIIl(bn ? 1 : 0)) {
                                        AccBuilderShamans.c = lIlIIlllIl[lIlIlIIIIl[4]];
                                        b.a(bp);
                                        if (D.lIIIllllIIlll(bp.size(), lIlIlIIIIl[3])) {
                                            System.out.println(lIlIIlllIl[lIlIlIIIIl[3]]);
                                            bn = lIlIlIIIIl[4];
                                        }
                                    }
                                    do {
                                        if (D.lIIIllllIlIIl(y.bv() ? 1 : 0)) {
                                            int[] nArray = new int[lIlIlIIIIl[3]];
                                            nArray[D.lIlIlIIIIl[4]] = lIlIlIIIIl[5];
                                            if (D.lIIIllllIlIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                                                int[] nArray2 = new int[lIlIlIIIIl[3]];
                                                nArray2[D.lIlIlIIIIl[4]] = lIlIlIIIIl[6];
                                                if (D.lIIIllllIlIIl(Inventory.contains((int[])nArray2) ? 1 : 0)) {
                                                    int[] nArray3 = new int[lIlIlIIIIl[3]];
                                                    nArray3[D.lIlIlIIIIl[4]] = lIlIlIIIIl[7];
                                                    if (D.lIIIllllIlIIl(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                                                        int[] nArray4 = new int[lIlIlIIIIl[3]];
                                                        nArray4[D.lIlIlIIIIl[4]] = lIlIlIIIIl[8];
                                                        if (D.lIIIllllIlIIl(Inventory.contains((int[])nArray4) ? 1 : 0)) {
                                                            int[] nArray5 = new int[lIlIlIIIIl[3]];
                                                            nArray5[D.lIlIlIIIIl[4]] = lIlIlIIIIl[9];
                                                            if (D.lIIIllllIlIIl(Inventory.contains((int[])nArray5) ? 1 : 0)) {
                                                                int[] nArray6 = new int[lIlIlIIIIl[3]];
                                                                nArray6[D.lIlIlIIIIl[4]] = lIlIlIIIIl[10];
                                                                if (!D.lIIIllllIlIlI(Inventory.contains((int[])nArray6) ? 1 : 0)) break block88;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        if (!D.lIIIllllIlIlI(AccBuilderShamans.d ? 1 : 0)) break block88;
                                        D.bT();
                                        Time.sleepTicks((int)lIlIlIIIIl[3]);
                                        0;
                                        0;
                                    } while ((0 + 20 - -101 + 45 ^ 161 + 25 - 121 + 97) >= 3);
                                    return;
                                }
                                if (D.lIIIllllIlIlI(bn ? 1 : 0)) {
                                    if (D.lIIIllllIlIll(Players.getLocal().getWorldLocation().distanceTo(hU), lIlIlIIIIl[11])) {
                                        int[] nArray = new int[lIlIlIIIIl[3]];
                                        nArray[D.lIlIlIIIIl[4]] = lIlIlIIIIl[10];
                                        if (D.lIIIllllIlIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                                            AccBuilderShamans.c = lIlIIlllIl[lIlIlIIIIl[1]];
                                            int[] nArray7 = new int[lIlIlIIIIl[3]];
                                            nArray7[D.lIlIlIIIIl[4]] = lIlIlIIIIl[10];
                                            Inventory.getFirst((int[])nArray7).interact(lIlIIlllIl[lIlIlIIIIl[12]]);
                                            Time.sleepTicks((int)lIlIlIIIIl[13]);
                                            0;
                                        }
                                    }
                                    if (D.lIIIllllIIlll(Players.getLocal().getWorldLocation().distanceTo(hU), lIlIlIIIIl[11]) && D.lIIIllllIlIll(Players.getLocal().getWorldLocation().distanceTo(hU), lIlIlIIIIl[14])) {
                                        AccBuilderShamans.c = lIlIIlllIl[lIlIlIIIIl[15]];
                                        if (D.lIIIllllIlIIl(Inventory.contains((int[])f.aU) ? 1 : 0) && D.lIIIllllIIlll(Movement.getRunEnergy(), lIlIlIIIIl[16])) {
                                            Inventory.getFirst((int[])f.aU).interact(lIlIIlllIl[lIlIlIIIIl[13]]);
                                            Time.sleepTicks((int)lIlIlIIIIl[3]);
                                            0;
                                        }
                                        Movement.walkTo((WorldPoint)hU);
                                        0;
                                        Time.sleepTicks((int)lIlIlIIIIl[3]);
                                        0;
                                    }
                                    if (D.lIIIllllIllII(Players.getLocal().getWorldLocation().distanceTo(hU), lIlIlIIIIl[14])) {
                                        g.a(lIlIIlllIl[lIlIlIIIIl[14]], hn);
                                    }
                                }
                            }
                            if (D.lIIIllllIlIII(e.j(lIlIlIIIIl[0]), lIlIlIIIIl[1]) && D.lIIIllllIlIII(e.j(lIlIlIIIIl[2]), lIlIlIIIIl[3])) {
                                if (D.lIIIllllIlIll(Players.getLocal().getWorldLocation().distanceTo(hX), lIlIlIIIIl[15]) && D.lIIIllllIlIlI(ik.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    int[] nArray = new int[lIlIlIIIIl[3]];
                                    nArray[D.lIlIlIIIIl[4]] = lIlIlIIIIl[17];
                                    if (D.lIIIllllIlIlI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                                        AccBuilderShamans.c = lIlIIlllIl[lIlIlIIIIl[18]];
                                        Movement.walkTo((WorldPoint)hX);
                                        0;
                                        Time.sleepTicks((int)lIlIlIIIIl[3]);
                                        0;
                                    }
                                }
                                if (D.lIIIllllIllII(Players.getLocal().getWorldLocation().distanceTo(hX), lIlIlIIIIl[15]) && D.lIIIllllIlIlI(Players.getLocal().isMoving() ? 1 : 0)) {
                                    int[] nArray = new int[lIlIlIIIIl[3]];
                                    nArray[D.lIlIlIIIIl[4]] = lIlIlIIIIl[17];
                                    if (D.lIIIllllIlIlI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                                        int[] nArray8 = new int[lIlIlIIIIl[3]];
                                        nArray8[D.lIlIlIIIIl[4]] = lIlIlIIIIl[19];
                                        lllllllllllllllllllIlllllIllIIlI2 = TileObjects.getNearest((int[])nArray8);
                                        if (D.lIIIllllIlIIl(Inventory.isFull() ? 1 : 0)) {
                                            int[] nArray9 = new int[lIlIlIIIIl[3]];
                                            nArray9[D.lIlIlIIIIl[4]] = lIlIlIIIIl[8];
                                            Inventory.getFirst((int[])nArray9).interact(lIlIIlllIl[lIlIlIIIIl[20]]);
                                            Time.sleepTicks((int)lIlIlIIIIl[3]);
                                            0;
                                        }
                                        if (D.lIIIllllIlIlI(Inventory.isFull() ? 1 : 0)) {
                                            if (D.lIIIllllIllIl(lllllllllllllllllllIlllllIllIIlI2) && D.lIIIllllIlIlI(Dialog.isOpen() ? 1 : 0)) {
                                                AccBuilderShamans.c = lIlIIlllIl[lIlIlIIIIl[21]];
                                                lllllllllllllllllllIlllllIllIIlI2.interact(lIlIIlllIl[lIlIlIIIIl[22]]);
                                                Dialog.continueSpace();
                                            }
                                            if (D.lIIIllllIllIl(var24 = Widgets.get((int)lIlIlIIIIl[23], (int)lIlIlIIIIl[3]))) {
                                                var24.interact(lIlIIlllIl[lIlIlIIIIl[24]]);
                                                var24.interact(lIlIlIIIIl[4]);
                                                var24.interact(lIlIIlllIl[lIlIlIIIIl[25]]);
                                                Keyboard.type((String)lIlIIlllIl[lIlIlIIIIl[26]]);
                                            }
                                        }
                                    }
                                }
                                if (D.lIIIllllIllII(Players.getLocal().getWorldLocation().distanceTo(hX), lIlIlIIIIl[15])) {
                                    int[] nArray = new int[lIlIlIIIIl[3]];
                                    nArray[D.lIlIlIIIIl[4]] = lIlIlIIIIl[17];
                                    if (D.lIIIllllIlIIl(Inventory.contains((int[])nArray) ? 1 : 0) && D.lIIIllllIlIlI(ij.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                        AccBuilderShamans.c = lIlIIlllIl[lIlIlIIIIl[27]];
                                        Movement.walkTo((WorldPoint)ib);
                                        0;
                                        Time.sleepTicks((int)lIlIlIIIIl[3]);
                                        0;
                                    }
                                }
                                if (D.lIIIllllIlIIl(ik.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    AccBuilderShamans.c = lIlIIlllIl[lIlIlIIIIl[28]];
                                    if (D.lIIIllllIlIll(Players.getLocal().getWorldLocation().distanceTo(ib), lIlIlIIIIl[3])) {
                                        Movement.walkTo((WorldPoint)ib);
                                        0;
                                        Time.sleepTicks((int)lIlIlIIIIl[3]);
                                        0;
                                    }
                                    if (D.lIIIllllIllII(Players.getLocal().getWorldLocation().distanceTo(ib), lIlIlIIIIl[3])) {
                                        String[] stringArray = new String[lIlIlIIIIl[3]];
                                        stringArray[D.lIlIlIIIIl[4]] = lIlIIlllIl[lIlIlIIIIl[29]];
                                        lllllllllllllllllllIlllllIllIIlI2 = TileObjects.getNearest((String[])stringArray);
                                        AccBuilderShamans.c = lIlIIlllIl[lIlIlIIIIl[30]];
                                        if (D.lIIIllllIlIIl(Inventory.isFull() ? 1 : 0)) {
                                            int[] nArray = new int[lIlIlIIIIl[3]];
                                            nArray[D.lIlIlIIIIl[4]] = lIlIlIIIIl[8];
                                            Inventory.getFirst((int[])nArray).interact(lIlIIlllIl[lIlIlIIIIl[31]]);
                                            Time.sleepTicks((int)lIlIlIIIIl[3]);
                                            0;
                                        }
                                        if (D.lIIIllllIllIl(lllllllllllllllllllIlllllIllIIlI2)) {
                                            String[] stringArray2 = new String[lIlIlIIIIl[3]];
                                            stringArray2[D.lIlIlIIIIl[4]] = lIlIIlllIl[lIlIlIIIIl[32]];
                                            if (D.lIIIllllIlIIl(lllllllllllllllllllIlllllIllIIlI2.hasAction(stringArray2) ? 1 : 0)) {
                                                lllllllllllllllllllIlllllIllIIlI2.interact(lIlIIlllIl[lIlIlIIIIl[33]]);
                                                Time.sleepTicks((int)lIlIlIIIIl[1]);
                                                0;
                                            }
                                            String[] stringArray3 = new String[lIlIlIIIIl[3]];
                                            stringArray3[D.lIlIlIIIIl[4]] = lIlIIlllIl[lIlIlIIIIl[34]];
                                            if (D.lIIIllllIlIIl(lllllllllllllllllllIlllllIllIIlI2.hasAction(stringArray3) ? 1 : 0)) {
                                                lllllllllllllllllllIlllllIllIIlI2.interact(lIlIIlllIl[lIlIlIIIIl[35]]);
                                                Time.sleepTicks((int)lIlIlIIIIl[1]);
                                                0;
                                                var24 = Widgets.get((int)lIlIlIIIIl[23], (int)lIlIlIIIIl[3]);
                                                if (D.lIIIllllIllIl(var24)) {
                                                    var24.interact(lIlIIlllIl[lIlIlIIIIl[36]]);
                                                    var24.interact(lIlIlIIIIl[4]);
                                                    var24.interact(lIlIIlllIl[lIlIlIIIIl[37]]);
                                                    Keyboard.type((String)lIlIIlllIl[lIlIlIIIIl[38]]);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            if (D.lIIIllllIlIII(e.j(lIlIlIIIIl[0]), lIlIlIIIIl[1]) && D.lIIIllllIlIII(e.j(lIlIlIIIIl[2]), lIlIlIIIIl[1])) {
                                dc = lIlIlIIIIl[4];
                                if (D.lIIIllllIllII(Players.getLocal().getWorldLocation().distanceTo(hU), lIlIlIIIIl[22])) {
                                    while (D.lIIIllllIlIll(Players.getLocal().getWorldLocation().distanceTo(hX), lIlIlIIIIl[1]) && D.lIIIllllIlIlI(AccBuilderShamans.d ? 1 : 0)) {
                                        Movement.walkTo((WorldPoint)hX);
                                        0;
                                        Time.sleepTicks((int)lIlIlIIIIl[3]);
                                        0;
                                        0;
                                        if (((0xCF ^ 0x86 ^ (0x60 ^ 0x1C)) & (8 ^ 0x23 ^ (0x1F ^ 1) ^ -1)) == 0) continue;
                                        return;
                                    }
                                }
                                int[] nArray = new int[lIlIlIIIIl[3]];
                                nArray[D.lIlIlIIIIl[4]] = lIlIlIIIIl[39];
                                if (D.lIIIllllIlIlI(Inventory.contains((int[])nArray) ? 1 : 0) && D.lIIIllllIlIIl(ik.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    AccBuilderShamans.c = lIlIIlllIl[lIlIlIIIIl[40]];
                                    if (D.lIIIllllIlIll(Players.getLocal().getWorldLocation().distanceTo(ib), lIlIlIIIIl[3])) {
                                        Movement.walkTo((WorldPoint)ib);
                                        0;
                                        Time.sleepTicks((int)lIlIlIIIIl[3]);
                                        0;
                                    }
                                    if (D.lIIIllllIllII(Players.getLocal().getWorldLocation().distanceTo(ib), lIlIlIIIIl[3])) {
                                        String[] stringArray = new String[lIlIlIIIIl[3]];
                                        stringArray[D.lIlIlIIIIl[4]] = lIlIIlllIl[lIlIlIIIIl[41]];
                                        lllllllllllllllllllIlllllIllIIlI2 = TileObjects.getNearest((String[])stringArray);
                                        AccBuilderShamans.c = lIlIIlllIl[lIlIlIIIIl[42]];
                                        if (D.lIIIllllIllIl(lllllllllllllllllllIlllllIllIIlI2)) {
                                            String[] stringArray4 = new String[lIlIlIIIIl[3]];
                                            stringArray4[D.lIlIlIIIIl[4]] = lIlIIlllIl[lIlIlIIIIl[43]];
                                            if (D.lIIIllllIlIIl(lllllllllllllllllllIlllllIllIIlI2.hasAction(stringArray4) ? 1 : 0)) {
                                                lllllllllllllllllllIlllllIllIIlI2.interact(lIlIIlllIl[lIlIlIIIIl[44]]);
                                                Time.sleepTicks((int)lIlIlIIIIl[1]);
                                                0;
                                            }
                                            String[] stringArray5 = new String[lIlIlIIIIl[3]];
                                            stringArray5[D.lIlIlIIIIl[4]] = lIlIIlllIl[lIlIlIIIIl[45]];
                                            if (D.lIIIllllIlIIl(lllllllllllllllllllIlllllIllIIlI2.hasAction(stringArray5) ? 1 : 0)) {
                                                lllllllllllllllllllIlllllIllIIlI2.interact(lIlIIlllIl[lIlIlIIIIl[46]]);
                                                Time.sleepTicks((int)lIlIlIIIIl[1]);
                                                0;
                                                var24 = Widgets.get((int)lIlIlIIIIl[23], (int)lIlIlIIIIl[3]);
                                                if (D.lIIIllllIllIl(var24)) {
                                                    var24.interact(lIlIIlllIl[lIlIlIIIIl[47]]);
                                                    var24.interact(lIlIlIIIIl[4]);
                                                    var24.interact(lIlIIlllIl[lIlIlIIIIl[48]]);
                                                    Keyboard.type((String)lIlIIlllIl[lIlIlIIIIl[49]]);
                                                }
                                            }
                                        }
                                    }
                                }
                                int[] nArray10 = new int[lIlIlIIIIl[3]];
                                nArray10[D.lIlIlIIIIl[4]] = lIlIlIIIIl[39];
                                if (D.lIIIllllIlIIl(Inventory.contains((int[])nArray10) ? 1 : 0) && D.lIIIllllIlIll(Players.getLocal().getWorldLocation().distanceTo(hY), lIlIlIIIIl[3])) {
                                    AccBuilderShamans.c = lIlIIlllIl[lIlIlIIIIl[50]];
                                    Movement.walkTo((WorldPoint)hY);
                                    0;
                                    Time.sleepTicks((int)lIlIlIIIIl[3]);
                                    0;
                                }
                                if (D.lIIIllllIllII(Players.getLocal().getWorldLocation().distanceTo(hY), lIlIlIIIIl[1])) {
                                    String[] stringArray = new String[lIlIlIIIIl[3]];
                                    stringArray[D.lIlIlIIIIl[4]] = lIlIIlllIl[lIlIlIIIIl[51]];
                                    lllllllllllllllllllIlllllIllIIlI2 = TileObjects.getNearest((String[])stringArray);
                                    String[] stringArray6 = new String[lIlIlIIIIl[3]];
                                    stringArray6[D.lIlIlIIIIl[4]] = lIlIIlllIl[lIlIlIIIIl[52]];
                                    var24 = NPCs.getNearest((String[])stringArray6);
                                    if (D.lIIIllllIllIl(lllllllllllllllllllIlllllIllIIlI2) && D.lIIIllllIlllI(var24)) {
                                        AccBuilderShamans.c = lIlIIlllIl[lIlIlIIIIl[53]];
                                        String[] stringArray7 = new String[lIlIlIIIIl[3]];
                                        stringArray7[D.lIlIlIIIIl[4]] = lIlIIlllIl[lIlIlIIIIl[54]];
                                        if (D.lIIIllllIlIIl(Inventory.contains((String[])stringArray7) ? 1 : 0)) {
                                            String[] stringArray8 = new String[lIlIlIIIIl[3]];
                                            stringArray8[D.lIlIlIIIIl[4]] = lIlIIlllIl[lIlIlIIIIl[55]];
                                            Inventory.getFirst((String[])stringArray8).useOn(lllllllllllllllllllIlllllIllIIlI2);
                                        }
                                        Time.sleepTicks((int)lIlIlIIIIl[3]);
                                        0;
                                    }
                                    if (D.lIIIllllIllIl(var24)) {
                                        AccBuilderShamans.c = lIlIIlllIl[lIlIlIIIIl[56]];
                                        int[] nArray11 = new int[lIlIlIIIIl[3]];
                                        nArray11[D.lIlIlIIIIl[4]] = lIlIlIIIIl[39];
                                        if (D.lIIIllllIlIIl(Inventory.contains((int[])nArray11) ? 1 : 0)) {
                                            int[] nArray12 = new int[lIlIlIIIIl[3]];
                                            nArray12[D.lIlIlIIIIl[4]] = lIlIlIIIIl[39];
                                            Inventory.getFirst((int[])nArray12).useOn((Actor)var24);
                                        }
                                        Time.sleepTicks((int)lIlIlIIIIl[3]);
                                        0;
                                    }
                                }
                            }
                            if (D.lIIIllllIlIIl(ij.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && D.lIIIllllIlIII(e.j(lIlIlIIIIl[2]), lIlIlIIIIl[12])) {
                                AccBuilderShamans.c = lIlIIlllIl[lIlIlIIIIl[57]];
                                Movement.walkTo((WorldPoint)new WorldPoint(lIlIlIIIIl[58], lIlIlIIIIl[59], lIlIlIIIIl[4]));
                                0;
                                Time.sleepTicks((int)lIlIlIIIIl[3]);
                                0;
                            }
                            if (!D.lIIIllllIlIlI(ij.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || !D.lIIIllllIlIII(e.j(lIlIlIIIIl[2]), lIlIlIIIIl[12])) break block89;
                            int[] nArray = new int[lIlIlIIIIl[3]];
                            nArray[D.lIlIlIIIIl[4]] = lIlIlIIIIl[60];
                            if (!D.lIIIllllIlIIl(Inventory.contains((int[])nArray) ? 1 : 0)) break block90;
                            int[] nArray13 = new int[lIlIlIIIIl[3]];
                            nArray13[D.lIlIlIIIIl[4]] = lIlIlIIIIl[60];
                            if (!D.lIIIllllIlIIl(Inventory.contains((int[])nArray13) ? 1 : 0) || !D.lIIIllllIlIll(Players.getLocal().getWorldLocation().distanceTo(ih), lIlIlIIIIl[12])) break block89;
                        }
                        AccBuilderShamans.c = lIlIIlllIl[lIlIlIIIIl[61]];
                        if (D.lIIIllllIllll(Movement.getRunEnergy(), lIlIlIIIIl[33])) {
                            D.bS();
                        }
                    }
                    if (D.lIIIllllIllII(Players.getLocal().getWorldLocation().distanceTo(ih), lIlIlIIIIl[12])) {
                        int[] nArray = new int[lIlIlIIIIl[3]];
                        nArray[D.lIlIlIIIIl[4]] = lIlIlIIIIl[60];
                        if (D.lIIIllllIlIIl(Inventory.contains((int[])nArray) ? 1 : 0) && D.lIIIllllIlIII(Players.getLocal().getWorldLocation().getX(), lIlIlIIIIl[62])) {
                            String[] stringArray = new String[lIlIlIIIIl[3]];
                            stringArray[D.lIlIlIIIIl[4]] = lIlIIlllIl[lIlIlIIIIl[63]];
                            lllllllllllllllllllIlllllIllIIlI2 = TileObjects.getNearest((String[])stringArray);
                            if (D.lIIIllllIllIl(lllllllllllllllllllIlllllIllIIlI2)) {
                                AccBuilderShamans.c = lIlIIlllIl[lIlIlIIIIl[64]];
                                int[] nArray14 = new int[lIlIlIIIIl[3]];
                                nArray14[D.lIlIlIIIIl[4]] = lIlIlIIIIl[60];
                                if (D.lIIIllllIlIIl(Inventory.contains((int[])nArray14) ? 1 : 0)) {
                                    int[] nArray15 = new int[lIlIlIIIIl[3]];
                                    nArray15[D.lIlIlIIIIl[4]] = lIlIlIIIIl[60];
                                    Inventory.getFirst((int[])nArray15).useOn(lllllllllllllllllllIlllllIllIIlI2);
                                    Time.sleepTicks((int)lIlIlIIIIl[1]);
                                    0;
                                }
                            }
                        }
                    }
                    if (!D.lIIIllllIlIIl(il.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block91;
                    int[] nArray = new int[lIlIlIIIIl[3]];
                    nArray[D.lIlIlIIIIl[4]] = lIlIlIIIIl[60];
                    if (!D.lIIIllllIlIIl(Inventory.contains((int[])nArray) ? 1 : 0)) break block91;
                    if (D.lIIIllllIlIlI(Players.getLocal().getWorldLocation().equals((Object)hV) ? 1 : 0)) {
                        AccBuilderShamans.c = lIlIIlllIl[lIlIlIIIIl[65]];
                        Movement.walkTo((WorldPoint)hV);
                        0;
                    }
                    if (D.lIIIllllIllII(Skills.getBoostedLevel((Skill)Skill.HITPOINTS), lIlIlIIIIl[13])) {
                        int[] nArray16 = new int[lIlIlIIIIl[3]];
                        nArray16[D.lIlIlIIIIl[4]] = lIlIlIIIIl[8];
                        if (D.lIIIllllIlIIl(Inventory.contains((int[])nArray16) ? 1 : 0)) {
                            int[] nArray17 = new int[lIlIlIIIIl[3]];
                            nArray17[D.lIlIlIIIIl[4]] = lIlIlIIIIl[8];
                            Inventory.getFirst((int[])nArray17).interact(lIlIIlllIl[lIlIlIIIIl[66]]);
                        }
                    }
                    if (!D.lIIIllllIlIIl(Players.getLocal().getWorldLocation().equals((Object)hV) ? 1 : 0) || !D.lIIIllllIllIl(lllllllllllllllllllIlllllIllIIlI2 = NPCs.getNearest((int[])iz)) || !D.lIIIllllIlIlI(lllllllllllllllllllIlllllIllIIlI2.isDead() ? 1 : 0)) break block91;
                    AccBuilderShamans.c = lIlIIlllIl[lIlIlIIIIl[67]];
                    if (D.lIIIllllIIlll(Skills.getLevel((Skill)Skill.MAGIC), lIlIlIIIIl[21])) {
                        Magic.cast((Spell)SpellBook.Standard.WATER_STRIKE, (NPC)lllllllllllllllllllIlllllIllIIlI2);
                        Time.sleepTicks((int)lIlIlIIIIl[3]);
                        0;
                    }
                    if (D.lIIIllllIIlll(Skills.getLevel((Skill)Skill.MAGIC), lIlIlIIIIl[26]) && !D.lIIIllllIIlll(Skills.getLevel((Skill)Skill.MAGIC), lIlIlIIIIl[21])) break block92;
                    if (!D.lIIIllllIllll(Skills.getLevel((Skill)Skill.MAGIC), lIlIlIIIIl[21])) break block93;
                    int[] nArray18 = new int[lIlIlIIIIl[3]];
                    nArray18[D.lIlIlIIIIl[4]] = lIlIlIIIIl[6];
                    if (!D.lIIIllllIlIIl(Inventory.contains((int[])nArray18) ? 1 : 0)) break block93;
                    String[] stringArray = new String[lIlIlIIIIl[3]];
                    stringArray[D.lIlIlIIIIl[4]] = lIlIIlllIl[lIlIlIIIIl[68]];
                    if (!D.lIIIllllIlIlI(Inventory.contains((String[])stringArray) ? 1 : 0)) break block93;
                }
                Magic.cast((Spell)SpellBook.Standard.EARTH_STRIKE, (NPC)lllllllllllllllllllIlllllIllIIlI2);
                Time.sleepTicks((int)lIlIlIIIIl[3]);
                0;
            }
            if (D.lIIIllllIllll(Skills.getLevel((Skill)Skill.MAGIC), lIlIlIIIIl[26])) {
                String[] stringArray = new String[lIlIlIIIIl[3]];
                stringArray[D.lIlIlIIIIl[4]] = lIlIIlllIl[lIlIlIIIIl[69]];
                if (D.lIIIllllIlIIl(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    Magic.cast((Spell)SpellBook.Standard.FIRE_STRIKE, (NPC)lllllllllllllllllllIlllllIllIIlI2);
                    Time.sleepTicks((int)lIlIlIIIIl[3]);
                    0;
                }
            }
        }
        if (D.lIIIllllIlIII(e.j(lIlIlIIIIl[2]), lIlIlIIIIl[14])) {
            String[] stringArray = new String[lIlIlIIIIl[3]];
            stringArray[D.lIlIlIIIIl[4]] = lIlIIlllIl[lIlIlIIIIl[70]];
            if (D.lIIIllllIlIlI(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                String[] stringArray9 = new String[lIlIlIIIIl[3]];
                stringArray9[D.lIlIlIIIIl[4]] = lIlIIlllIl[lIlIlIIIIl[71]];
                lllllllllllllllllllIlllllIllIIlI2 = TileItems.getNearest((String[])stringArray9);
                if (D.lIIIllllIllIl(lllllllllllllllllllIlllllIllIIlI2)) {
                    AccBuilderShamans.c = lIlIIlllIl[lIlIlIIIIl[72]];
                    lllllllllllllllllllIlllllIllIIlI2.interact(lIlIIlllIl[lIlIlIIIIl[73]]);
                    Time.sleepTicks((int)lIlIlIIIIl[1]);
                    0;
                }
            }
        }
        if (D.lIIIllllIlIII(e.j(lIlIlIIIIl[2]), lIlIlIIIIl[14])) {
            String[] stringArray = new String[lIlIlIIIIl[3]];
            stringArray[D.lIlIlIIIIl[4]] = lIlIIlllIl[lIlIlIIIIl[74]];
            if (D.lIIIllllIlIIl(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                if (D.lIIIllllIlIIl(il.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    int[] nArray = new int[lIlIlIIIIl[3]];
                    nArray[D.lIlIlIIIIl[4]] = lIlIlIIIIl[10];
                    if (D.lIIIllllIlIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        AccBuilderShamans.c = lIlIIlllIl[lIlIlIIIIl[75]];
                        int[] nArray19 = new int[lIlIlIIIIl[3]];
                        nArray19[D.lIlIlIIIIl[4]] = lIlIlIIIIl[10];
                        Inventory.getFirst((int[])nArray19).interact(lIlIIlllIl[lIlIlIIIIl[76]]);
                        Time.sleepTicks((int)lIlIlIIIIl[13]);
                        0;
                    }
                }
                if (D.lIIIllllIlIlI(il.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && D.lIIIllllIlIll(Players.getLocal().getWorldLocation().distanceTo(hU), lIlIlIIIIl[15])) {
                    AccBuilderShamans.c = lIlIIlllIl[lIlIlIIIIl[77]];
                    Movement.walkTo((WorldPoint)hU);
                    0;
                    Time.sleepTicks((int)lIlIlIIIIl[3]);
                    0;
                }
                if (D.lIIIllllIllII(Players.getLocal().getWorldLocation().distanceTo(hU), lIlIlIIIIl[13])) {
                    AccBuilderShamans.c = lIlIIlllIl[lIlIlIIIIl[78]];
                    if (D.lIIIllllIIlll(dc, lIlIlIIIIl[3])) {
                        Z.lg += lIlIlIIIIl[3];
                        Z.p(AccBuilderShamans.m);
                        dc += lIlIlIIIIl[3];
                        Z.lg = lIlIlIIIIl[4];
                        dd = lIlIlIIIIl[4];
                    }
                    g.a(lIlIIlllIl[lIlIlIIIIl[79]], hn);
                }
            }
        }
    }

    private static boolean lIIIllllIllll(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIIIllllIlIIl(int n2) {
        return n2 != 0;
    }

    private static boolean lIIIlllllIIII(int n2) {
        return n2 > 0;
    }

    private static String lIIIlllIIlIlI(String var11, String var7) {
        try {
            SecretKeySpec var6 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var7.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var5 = Cipher.getInstance("Blowfish");
            var5.init(lIlIlIIIIl[1], var6);
            return new String(var5.doFinal(Base64.getDecoder().decode(var11.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var20) {
            var20.printStackTrace();
            return null;
        }
    }

    private static String lIIIlllIIlIIl(String var4, String var19) {
        var4 = new String(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var14 = new StringBuilder();
        char[] var15 = var19.toCharArray();
        int var12 = lIlIlIIIIl[4];
        char[] var3 = var4.toCharArray();
        int var23 = var3.length;
        int var16 = lIlIlIIIIl[4];
        while (D.lIIIllllIIlll(var16, var23)) {
            char var26 = var3[var16];
            var14.append((char)(var26 ^ var15[var12 % var15.length]));
            0;
            ++var12;
            ++var16;
            0;
            if (-1 != (0xA5 ^ 0xB8 ^ (0xD9 ^ 0xC0))) continue;
            return null;
        }
        return String.valueOf(var14);
    }

    private static boolean lIIIllllIllIl(Object object) {
        return object != null;
    }

    @Override
    public boolean ac() {
        return lIlIlIIIIl[4];
    }

    private static void lIIIllllIIlIl() {
        lIlIIlllIl = new String[lIlIlIIIIl[174]];
        D.lIlIIlllIl[D.lIlIlIIIIl[4]] = D."Buying items";
        D.lIlIIlllIl[D.lIlIlIIIIl[3]] = D."Finished buying items, switching back to questing";
        D.lIlIIlllIl[D.lIlIlIIIIl[1]] = D."Breaking tab";
        D.lIlIIlllIl[D.lIlIlIIIIl[12]] = D."Break";
        D.lIlIIlllIl[D.lIlIlIIIIl[15]] = D."Nav to start";
        D.lIlIIlllIl[D.lIlIlIIIIl[13]] = D."Drink";
        D.lIlIIlllIl[D.lIlIlIIIIl[14]] = D."Boy";
        D.lIlIIlllIl[D.lIlIlIIIIl[18]] = D."Navigating to outside door";
        D.lIlIIlllIl[D.lIlIlIIIIl[20]] = D."Drop";
        D.lIlIIlllIl[D.lIlIlIIIIl[21]] = D."Stealing key";
        D.lIlIIlllIl[D.lIlIlIIIIl[22]] = D."Look-under";
        D.lIlIIlllIl[D.lIlIlIIIIl[24]] = D."Continue";
        D.lIlIIlllIl[D.lIlIlIIIIl[25]] = D."null";
        D.lIlIIlllIl[D.lIlIlIIIIl[26]] = D." ";
        D.lIlIIlllIl[D.lIlIlIIIIl[27]] = D."Nav to magnet box";
        D.lIlIIlllIl[D.lIlIlIIIIl[28]] = D."Nav to magnet box";
        D.lIlIIlllIl[D.lIlIlIIIIl[29]] = D."Cupboard";
        D.lIlIIlllIl[D.lIlIlIIIIl[30]] = D."Taking magnet";
        D.lIlIIlllIl[D.lIlIlIIIIl[31]] = D."Drop";
        D.lIlIIlllIl[D.lIlIlIIIIl[32]] = D."Open";
        D.lIlIIlllIl[D.lIlIlIIIIl[33]] = D."Open";
        D.lIlIIlllIl[D.lIlIlIIIIl[34]] = D."Search";
        D.lIlIIlllIl[D.lIlIlIIIIl[35]] = D."Search";
        D.lIlIIlllIl[D.lIlIlIIIIl[36]] = D."Continue";
        D.lIlIIlllIl[D.lIlIlIIIIl[37]] = D."null";
        D.lIlIIlllIl[D.lIlIlIIIIl[38]] = D." ";
        D.lIlIIlllIl[D.lIlIlIIIIl[40]] = D."Nav to magnet box";
        D.lIlIIlllIl[D.lIlIlIIIIl[41]] = D."Cupboard";
        D.lIlIIlllIl[D.lIlIlIIIIl[42]] = D."Taking magnet";
        D.lIlIIlllIl[D.lIlIlIIIIl[43]] = D."Open";
        D.lIlIIlllIl[D.lIlIlIIIIl[44]] = D."Open";
        D.lIlIIlllIl[D.lIlIlIIIIl[45]] = D."Search";
        D.lIlIIlllIl[D.lIlIlIIIIl[46]] = D."Search";
        D.lIlIIlllIl[D.lIlIlIIIIl[47]] = D."Continue";
        D.lIlIIlllIl[D.lIlIlIIIIl[48]] = D."null";
        D.lIlIIlllIl[D.lIlIlIIIIl[49]] = D." ";
        D.lIlIIlllIl[D.lIlIlIIIIl[50]] = D."Nav to cheese spot";
        D.lIlIIlllIl[D.lIlIlIIIIl[51]] = D."Mouse hole";
        D.lIlIIlllIl[D.lIlIlIIIIl[52]] = D."Mouse";
        D.lIlIIlllIl[D.lIlIlIIIIl[53]] = D."Using cheese";
        D.lIlIIlllIl[D.lIlIlIIIIl[54]] = D."Cheese";
        D.lIlIIlllIl[D.lIlIlIIIIl[55]] = D."Cheese";
        D.lIlIIlllIl[D.lIlIlIIIIl[56]] = D."Handle mouse";
        D.lIlIIlllIl[D.lIlIlIIIIl[57]] = D."Entering maze";
        D.lIlIIlllIl[D.lIlIlIIIIl[61]] = D."Handling walking";
        D.lIlIIlllIl[D.lIlIlIIIIl[63]] = D."Door";
        D.lIlIIlllIl[D.lIlIlIIIIl[64]] = D."Entering shed";
        D.lIlIIlllIl[D.lIlIlIIIIl[65]] = D."Nav to safe spot";
        D.lIlIIlllIl[D.lIlIlIIIIl[66]] = D."Eat";
        D.lIlIIlllIl[D.lIlIlIIIIl[67]] = D."Casting spell";
        D.lIlIIlllIl[D.lIlIlIIIIl[68]] = D."Fire rune";
        D.lIlIIlllIl[D.lIlIlIIIIl[69]] = D."Fire rune";
        D.lIlIIlllIl[D.lIlIlIIIIl[70]] = D."Ball";
        D.lIlIIlllIl[D.lIlIlIIIIl[71]] = D."Ball";
        D.lIlIIlllIl[D.lIlIlIIIIl[72]] = D."Taking ball";
        D.lIlIIlllIl[D.lIlIlIIIIl[73]] = D."Take";
        D.lIlIIlllIl[D.lIlIlIIIIl[74]] = D."Ball";
        D.lIlIIlllIl[D.lIlIlIIIIl[75]] = D."Breaking tab";
        D.lIlIIlllIl[D.lIlIlIIIIl[76]] = D."Break";
        D.lIlIIlllIl[D.lIlIlIIIIl[77]] = D."Nav to witches start";
        D.lIlIIlllIl[D.lIlIlIIIIl[78]] = D."Turning in quest";
        D.lIlIIlllIl[D.lIlIlIIIIl[79]] = D."Boy";
        D.lIlIIlllIl[D.lIlIlIIIIl[80]] = D."Drink";
        D.lIlIIlllIl[D.lIlIlIIIIl[81]] = D."Entering maze";
        D.lIlIIlllIl[D.lIlIlIIIIl[83]] = D."Nav to first spot";
        D.lIlIIlllIl[D.lIlIlIIIIl[84]] = D."Nav to second spot";
        D.lIlIIlllIl[D.lIlIlIIIIl[85]] = D."Nav to third spot";
        D.lIlIIlllIl[D.lIlIlIIIIl[86]] = D."Nav to fountain";
        D.lIlIIlllIl[D.lIlIlIIIIl[87]] = D."Getting key";
        D.lIlIIlllIl[D.lIlIlIIIIl[88]] = D."Fountain";
        D.lIlIIlllIl[D.lIlIlIIIIl[89]] = D."Check";
        D.lIlIIlllIl[D.lIlIlIIIIl[90]] = D."Continue";
        D.lIlIIlllIl[D.lIlIlIIIIl[91]] = D."null";
        D.lIlIIlllIl[D.lIlIlIIIIl[92]] = D." ";
        D.lIlIIlllIl[D.lIlIlIIIIl[95]] = D."Nav back toward maze";
        D.lIlIIlllIl[D.lIlIlIIIIl[96]] = D."Nav to shed spot";
        D.lIlIIlllIl[D.lIlIlIIIIl[97]] = D."Navigating to bank";
        D.lIlIIlllIl[D.lIlIlIIIIl[98]] = D."Opening bank";
        D.lIlIIlllIl[D.lIlIlIIIIl[100]] = D."Handling banking";
        D.lIlIIlllIl[D.lIlIlIIIIl[102]] = D."We are missing supplies, switching to BUYING";
        D.lIlIIlllIl[D.lIlIlIIIIl[16]] = D."We are missing supplies, switching to BUYING";
        D.lIlIIlllIl[D.lIlIlIIIIl[103]] = D."We are missing supplies, switching to BUYING";
        D.lIlIIlllIl[D.lIlIlIIIIl[104]] = D."We are missing supplies, switching to BUYING";
        D.lIlIIlllIl[D.lIlIlIIIIl[106]] = D."We are missing supplies, switching to BUYING";
        D.lIlIIlllIl[D.lIlIlIIIIl[116]] = D."Witches House quest";
        D.lIlIIlllIl[D.lIlIlIIIIl[117]] = D."ring of wealth (";
        D.lIlIIlllIl[D.lIlIlIIIIl[163]] = D."Wizard Mizgog";
        D.lIlIIlllIl[D.lIlIlIIIIl[164]] = D."Give me a quest please.";
        D.lIlIIlllIl[D.lIlIlIIIIl[165]] = D."I'll try.";
        D.lIlIIlllIl[D.lIlIlIIIIl[166]] = D."Actually, I know where to find this stuff.";
        D.lIlIIlllIl[D.lIlIlIIIIl[167]] = D."Yes.";
        D.lIlIIlllIl[D.lIlIlIIIIl[168]] = D."What's the matter?";
        D.lIlIIlllIl[D.lIlIlIIIIl[169]] = D."Ok, I'll see what I can do.";
    }

    @Override
    public int ad() {
        D.bR();
        return lIlIlIIIIl[109];
    }

    private static String lIIIlllIIlIII(String var10, String var25) {
        try {
            SecretKeySpec var2 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var25.getBytes(StandardCharsets.UTF_8)), lIlIlIIIIl[20]), "DES");
            Cipher var17 = Cipher.getInstance("DES");
            var17.init(lIlIlIIIIl[1], var2);
            return new String(var17.doFinal(Base64.getDecoder().decode(var10.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var21) {
            var21.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIllllIlIlI(int n2) {
        return n2 == 0;
    }

    @Override
    public String ae() {
        return lIlIIlllIl[lIlIlIIIIl[116]];
    }

    @Override
    public boolean af() {
        boolean bl;
        if (D.lIIIllllIllll(e.j(lIlIlIIIIl[2]), lIlIlIIIIl[18])) {
            bl = lIlIlIIIIl[3];
            0;
            if ((0x2E ^ 0x22 ^ (0x5C ^ 0x54)) <= 1) {
                return ((0x76 ^ 0x16 ^ (0xD9 ^ 0x97)) & (28 + 128 - 62 + 40 ^ 113 + 149 - 216 + 122 ^ -1)) != 0;
            }
        } else {
            bl = lIlIlIIIIl[4];
        }
        return bl;
    }

    /*
     * WARNING - void declaration
     */
    private static void bT() {
        block30: {
            block34: {
                block32: {
                    block33: {
                        block31: {
                            void var18;
                            BankLocation bankLocation = BankLocation.getNearest();
                            if (D.lIIIllllIllIl(bankLocation) && D.lIIIllllIlIlI(bankLocation.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                AccBuilderShamans.c = lIlIIlllIl[lIlIlIIIIl[97]];
                                a.a(bankLocation);
                            }
                            if (!D.lIIIllllIllIl(var18) || !D.lIIIllllIlIIl(var18.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block30;
                            if (D.lIIIllllIlIlI(Bank.isOpen() ? 1 : 0)) {
                                AccBuilderShamans.c = lIlIIlllIl[lIlIlIIIIl[98]];
                                a.a();
                                Time.sleepUntil(() -> Bank.isOpen(), (int)lIlIlIIIIl[99]);
                                0;
                            }
                            if (!D.lIIIllllIlIIl(Bank.isOpen() ? 1 : 0)) break block30;
                            AccBuilderShamans.c = lIlIIlllIl[lIlIlIIIIl[100]];
                            if (D.lIIIlllllIIII(Inventory.getAll().size())) {
                                Bank.depositInventory();
                                Time.sleepTicks((int)lIlIlIIIIl[12]);
                                0;
                            }
                            if (D.lIIIlllllIIII(Equipment.getAll().size())) {
                                Bank.depositEquipment();
                                Time.sleepTicks((int)lIlIlIIIIl[1]);
                                0;
                            }
                            while (D.lIIIllllIlIlI(y.bv() ? 1 : 0) && D.lIIIllllIlIlI(AccBuilderShamans.d ? 1 : 0)) {
                                y.bt();
                                Time.sleepTicks((int)lIlIlIIIIl[3]);
                                0;
                                0;
                                if (2 >= -1) continue;
                                return;
                            }
                            int[] nArray = new int[lIlIlIIIIl[3]];
                            nArray[D.lIlIlIIIIl[4]] = lIlIlIIIIl[7];
                            if (D.lIIIllllIlIIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                                int[] nArray2 = new int[lIlIlIIIIl[3]];
                                nArray2[D.lIlIlIIIIl[4]] = lIlIlIIIIl[7];
                                if (D.lIIIllllIIlll(Bank.getFirst((int[])nArray2).getQuantity(), lIlIlIIIIl[101])) {
                                    D.O();
                                    System.out.println(lIlIIlllIl[lIlIlIIIIl[102]]);
                                    bn = lIlIlIIIIl[3];
                                    return;
                                }
                            }
                            int[] nArray3 = new int[lIlIlIIIIl[3]];
                            nArray3[D.lIlIlIIIIl[4]] = lIlIlIIIIl[6];
                            if (D.lIIIllllIlIIl(Bank.contains((int[])nArray3) ? 1 : 0)) {
                                int[] nArray4 = new int[lIlIlIIIIl[3]];
                                nArray4[D.lIlIlIIIIl[4]] = lIlIlIIIIl[6];
                                if (D.lIIIllllIIlll(Bank.getFirst((int[])nArray4).getQuantity(), lIlIlIIIIl[101])) {
                                    D.O();
                                    System.out.println(lIlIIlllIl[lIlIlIIIIl[16]]);
                                    bn = lIlIlIIIIl[3];
                                    return;
                                }
                            }
                            int[] nArray5 = new int[lIlIlIIIIl[3]];
                            nArray5[D.lIlIlIIIIl[4]] = lIlIlIIIIl[5];
                            if (D.lIIIllllIlIIl(Bank.contains((int[])nArray5) ? 1 : 0)) {
                                int[] nArray6 = new int[lIlIlIIIIl[3]];
                                nArray6[D.lIlIlIIIIl[4]] = lIlIlIIIIl[5];
                                if (D.lIIIllllIIlll(Bank.getFirst((int[])nArray6).getQuantity(), lIlIlIIIIl[101])) {
                                    D.O();
                                    System.out.println(lIlIIlllIl[lIlIlIIIIl[103]]);
                                    bn = lIlIlIIIIl[3];
                                    return;
                                }
                            }
                            int[] nArray7 = new int[lIlIlIIIIl[3]];
                            nArray7[D.lIlIlIIIIl[4]] = lIlIlIIIIl[10];
                            if (!D.lIIIllllIlIIl(Bank.contains((int[])nArray7) ? 1 : 0)) break block31;
                            int[] nArray8 = new int[lIlIlIIIIl[3]];
                            nArray8[D.lIlIlIIIIl[4]] = lIlIlIIIIl[10];
                            if (!D.lIIIllllIllll(Bank.getFirst((int[])nArray8).getQuantity(), lIlIlIIIIl[22])) break block32;
                        }
                        int[] nArray = new int[lIlIlIIIIl[3]];
                        nArray[D.lIlIlIIIIl[4]] = lIlIlIIIIl[9];
                        if (!D.lIIIllllIlIIl(Bank.contains((int[])nArray) ? 1 : 0)) break block33;
                        int[] nArray9 = new int[lIlIlIIIIl[3]];
                        nArray9[D.lIlIlIIIIl[4]] = lIlIlIIIIl[9];
                        if (!D.lIIIllllIllll(Bank.getFirst((int[])nArray9).getQuantity(), lIlIlIIIIl[13])) break block32;
                    }
                    int[] nArray = new int[lIlIlIIIIl[3]];
                    nArray[D.lIlIlIIIIl[4]] = lIlIlIIIIl[8];
                    if (!D.lIIIllllIlIIl(Bank.contains((int[])nArray) ? 1 : 0)) break block34;
                    int[] nArray10 = new int[lIlIlIIIIl[3]];
                    nArray10[D.lIlIlIIIIl[4]] = lIlIlIIIIl[8];
                    if (!D.lIIIllllIIlll(Bank.getFirst((int[])nArray10).getQuantity(), lIlIlIIIIl[33])) break block34;
                }
                D.O();
                System.out.println(lIlIIlllIl[lIlIlIIIIl[104]]);
                bn = lIlIlIIIIl[3];
                return;
            }
            int[] nArray = new int[lIlIlIIIIl[18]];
            nArray[D.lIlIlIIIIl[4]] = lIlIlIIIIl[105];
            nArray[D.lIlIlIIIIl[3]] = lIlIlIIIIl[10];
            nArray[D.lIlIlIIIIl[1]] = lIlIlIIIIl[9];
            nArray[D.lIlIlIIIIl[12]] = lIlIlIIIIl[8];
            nArray[D.lIlIlIIIIl[15]] = lIlIlIIIIl[7];
            nArray[D.lIlIlIIIIl[13]] = lIlIlIIIIl[5];
            nArray[D.lIlIlIIIIl[14]] = lIlIlIIIIl[6];
            if (D.lIIIllllIlIlI(e.b(nArray) ? 1 : 0)) {
                D.O();
                System.out.println(lIlIIlllIl[lIlIlIIIIl[106]]);
                bn = lIlIlIIIIl[3];
                return;
            }
            if (D.lIIIllllIlIlI(Bank.isOpen() ? 1 : 0)) {
                a.a();
                Time.sleepTicks((int)lIlIlIIIIl[15]);
                0;
            }
            int[] nArray11 = new int[lIlIlIIIIl[3]];
            nArray11[D.lIlIlIIIIl[4]] = lIlIlIIIIl[10];
            if (D.lIIIllllIlIIl(Bank.contains((int[])nArray11) ? 1 : 0)) {
                int[] nArray12 = new int[lIlIlIIIIl[3]];
                nArray12[D.lIlIlIIIIl[4]] = lIlIlIIIIl[10];
                if (D.lIIIllllIIlll(Inventory.getCount((int[])nArray12), lIlIlIIIIl[3])) {
                    Bank.withdraw((int)lIlIlIIIIl[10], (int)lIlIlIIIIl[13], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                    Time.sleepTicks((int)lIlIlIIIIl[3]);
                    0;
                    Time.sleepUntil(() -> {
                        boolean bl;
                        int[] nArray = new int[lIlIlIIIIl[3]];
                        nArray[D.lIlIlIIIIl[4]] = lIlIlIIIIl[10];
                        if (D.lIIIlllllIIII(Inventory.getCount((int[])nArray))) {
                            bl = lIlIlIIIIl[3];
                            0;
                            
                            }
                        } else {
                            bl = lIlIlIIIIl[4];
                        }
                        return bl;
                    }, (int)lIlIlIIIIl[99]);
                    0;
                }
            }
            int[] nArray13 = new int[lIlIlIIIIl[3]];
            nArray13[D.lIlIlIIIIl[4]] = lIlIlIIIIl[9];
            if (D.lIIIllllIlIIl(Bank.contains((int[])nArray13) ? 1 : 0)) {
                int[] nArray14 = new int[lIlIlIIIIl[3]];
                nArray14[D.lIlIlIIIIl[4]] = lIlIlIIIIl[9];
                if (D.lIIIllllIIlll(Inventory.getCount((int[])nArray14), lIlIlIIIIl[3])) {
                    Bank.withdraw((int)lIlIlIIIIl[9], (int)lIlIlIIIIl[15], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                    Time.sleepTicks((int)lIlIlIIIIl[3]);
                    0;
                    Time.sleepUntil(() -> {
                        boolean bl;
                        int[] nArray = new int[lIlIlIIIIl[3]];
                        nArray[D.lIlIlIIIIl[4]] = lIlIlIIIIl[9];
                        if (D.lIIIlllllIIII(Inventory.getCount((int[])nArray))) {
                            bl = lIlIlIIIIl[3];
                            0;
                            if (-1 != -1) {
                                return false;
                            }
                        } else {
                            bl = lIlIlIIIIl[4];
                        }
                        return bl;
                    }, (int)lIlIlIIIIl[99]);
                    0;
                }
            }
            int[] nArray15 = new int[lIlIlIIIIl[3]];
            nArray15[D.lIlIlIIIIl[4]] = lIlIlIIIIl[7];
            if (D.lIIIllllIlIIl(Bank.contains((int[])nArray15) ? 1 : 0)) {
                int[] nArray16 = new int[lIlIlIIIIl[3]];
                nArray16[D.lIlIlIIIIl[4]] = lIlIlIIIIl[7];
                if (D.lIIIllllIIlll(Inventory.getCount((int[])nArray16), lIlIlIIIIl[3])) {
                    Bank.withdraw((int)lIlIlIIIIl[7], (int)lIlIlIIIIl[107], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                    Time.sleepTicks((int)lIlIlIIIIl[3]);
                    0;
                    Time.sleepUntil(() -> {
                        boolean bl;
                        int[] nArray = new int[lIlIlIIIIl[3]];
                        nArray[D.lIlIlIIIIl[4]] = lIlIlIIIIl[7];
                        if (D.lIIIlllllIIII(Inventory.getCount((int[])nArray))) {
                            bl = lIlIlIIIIl[3];
                            0;
                            
                            }
                        } else {
                            bl = lIlIlIIIIl[4];
                        }
                        return bl;
                    }, (int)lIlIlIIIIl[99]);
                    0;
                }
            }
            int[] nArray17 = new int[lIlIlIIIIl[3]];
            nArray17[D.lIlIlIIIIl[4]] = lIlIlIIIIl[5];
            if (D.lIIIllllIlIIl(Bank.contains((int[])nArray17) ? 1 : 0)) {
                int[] nArray18 = new int[lIlIlIIIIl[3]];
                nArray18[D.lIlIlIIIIl[4]] = lIlIlIIIIl[5];
                if (D.lIIIllllIIlll(Inventory.getCount((int[])nArray18), lIlIlIIIIl[3])) {
                    Bank.withdraw((int)lIlIlIIIIl[5], (int)lIlIlIIIIl[107], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                    Time.sleepTicks((int)lIlIlIIIIl[3]);
                    0;
                    Time.sleepUntil(() -> {
                        boolean bl;
                        int[] nArray = new int[lIlIlIIIIl[3]];
                        nArray[D.lIlIlIIIIl[4]] = lIlIlIIIIl[5];
                        if (D.lIIIlllllIIII(Inventory.getCount((int[])nArray))) {
                            bl = lIlIlIIIIl[3];
                            0;
                            if (1 != 1) {
                                return ((49 + 157 - 201 + 244 ^ 79 + 24 - 2 + 96) & (0x7F ^ 0x73 ^ (0x35 ^ 5) ^ -1)) != 0;
                            }
                        } else {
                            bl = lIlIlIIIIl[4];
                        }
                        return bl;
                    }, (int)lIlIlIIIIl[99]);
                    0;
                }
            }
            int[] nArray19 = new int[lIlIlIIIIl[3]];
            nArray19[D.lIlIlIIIIl[4]] = lIlIlIIIIl[6];
            if (D.lIIIllllIlIIl(Bank.contains((int[])nArray19) ? 1 : 0)) {
                int[] nArray20 = new int[lIlIlIIIIl[3]];
                nArray20[D.lIlIlIIIIl[4]] = lIlIlIIIIl[6];
                if (D.lIIIllllIIlll(Inventory.getCount((int[])nArray20), lIlIlIIIIl[3])) {
                    Bank.withdraw((int)lIlIlIIIIl[6], (int)lIlIlIIIIl[107], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                    Time.sleepTicks((int)lIlIlIIIIl[3]);
                    0;
                    Time.sleepUntil(() -> {
                        boolean bl;
                        int[] nArray = new int[lIlIlIIIIl[3]];
                        nArray[D.lIlIlIIIIl[4]] = lIlIlIIIIl[6];
                        if (D.lIIIlllllIIII(Inventory.getCount((int[])nArray))) {
                            bl = lIlIlIIIIl[3];
                            0;
                            if (1 != 1) {
                                return false;
                            }
                        } else {
                            bl = lIlIlIIIIl[4];
                        }
                        return bl;
                    }, (int)lIlIlIIIIl[99]);
                    0;
                }
            }
            int[] nArray21 = new int[lIlIlIIIIl[3]];
            nArray21[D.lIlIlIIIIl[4]] = lIlIlIIIIl[108];
            if (D.lIIIllllIlIIl(Bank.contains((int[])nArray21) ? 1 : 0)) {
                int[] nArray22 = new int[lIlIlIIIIl[3]];
                nArray22[D.lIlIlIIIIl[4]] = lIlIlIIIIl[108];
                if (D.lIIIllllIlIlI(Inventory.contains((int[])nArray22) ? 1 : 0)) {
                    Bank.withdraw((int)lIlIlIIIIl[108], (int)lIlIlIIIIl[3], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                    Time.sleepTicks((int)lIlIlIIIIl[3]);
                    0;
                    Time.sleepUntil(() -> {
                        int[] nArray = new int[lIlIlIIIIl[3]];
                        nArray[D.lIlIlIIIIl[4]] = lIlIlIIIIl[108];
                        return Inventory.contains((int[])nArray);
                    }, (int)lIlIlIIIIl[99]);
                    0;
                }
            }
            int[] nArray23 = new int[lIlIlIIIIl[3]];
            nArray23[D.lIlIlIIIIl[4]] = lIlIlIIIIl[8];
            if (D.lIIIllllIlIIl(Bank.contains((int[])nArray23) ? 1 : 0)) {
                int[] nArray24 = new int[lIlIlIIIIl[3]];
                nArray24[D.lIlIlIIIIl[4]] = lIlIlIIIIl[8];
                if (D.lIIIllllIIlll(Inventory.getCount((int[])nArray24), lIlIlIIIIl[3])) {
                    Bank.withdrawAll((int)lIlIlIIIIl[8], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                    Time.sleepTicks((int)lIlIlIIIIl[3]);
                    0;
                    Time.sleepUntil(() -> {
                        boolean bl;
                        int[] nArray = new int[lIlIlIIIIl[3]];
                        nArray[D.lIlIlIIIIl[4]] = lIlIlIIIIl[8];
                        if (D.lIIIlllllIIII(Inventory.getCount((int[])nArray))) {
                            bl = lIlIlIIIIl[3];
                            0;
                            
                            }
                        } else {
                            bl = lIlIlIIIIl[4];
                        }
                        return bl;
                    }, (int)lIlIlIIIIl[99]);
                    0;
                }
            }
        }
    }
}

