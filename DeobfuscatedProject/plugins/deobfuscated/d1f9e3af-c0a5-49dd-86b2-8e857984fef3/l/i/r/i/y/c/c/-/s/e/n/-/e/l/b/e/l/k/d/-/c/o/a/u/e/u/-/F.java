/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Item
 *  net.runelite.api.Skill
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Bank$WithdrawMode
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.Walker
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
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.G;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.W;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.a;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.an;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.b;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.d;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.e;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.f;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.g;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.i;
import net.runelite.api.Item;
import net.runelite.api.Skill;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.Walker;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;

public class F
implements W {
    public static /* synthetic */ int he;
    private static final /* synthetic */ WorldPoint gV;
    public static final /* synthetic */ WorldPoint gl;
    public static /* synthetic */ WorldArea hc;
    private static final /* synthetic */ int gZ;
    private static final /* synthetic */ WorldPoint gB;
    static /* synthetic */ String hn;
    static final /* synthetic */ int gn;
    private static final /* synthetic */ int gX;
    private static final /* synthetic */ WorldPoint gF;
    private static final /* synthetic */ WorldPoint gO;
    static /* synthetic */ int hf;
    static /* synthetic */ int hh;
    private static final /* synthetic */ WorldPoint gQ;
    private static final /* synthetic */ WorldPoint gN;
    static /* synthetic */ WorldPoint hp;
    private static /* synthetic */ int[] lIIIIlIIl;
    public static final /* synthetic */ int[] ge;
    static /* synthetic */ int hg;
    private static final /* synthetic */ WorldPoint gU;
    static final /* synthetic */ int gu;
    static final /* synthetic */ int gp;
    private static final /* synthetic */ int gY;
    public static /* synthetic */ List<d> bv;
    public static /* synthetic */ boolean bt;
    private static final /* synthetic */ WorldPoint gW;
    public static /* synthetic */ int hd;
    public static final /* synthetic */ WorldPoint gj;
    private static final /* synthetic */ WorldPoint gG;
    static /* synthetic */ int hk;
    static /* synthetic */ int cl;
    private static final /* synthetic */ int hb;
    static final /* synthetic */ int gr;
    static final /* synthetic */ int gq;
    private static final /* synthetic */ WorldPoint gT;
    static /* synthetic */ String ho;
    private static final /* synthetic */ WorldPoint gE;
    static /* synthetic */ int hi;
    public static final /* synthetic */ WorldPoint gg;
    public static final /* synthetic */ WorldPoint gh;
    private static final /* synthetic */ WorldPoint gA;
    private static final /* synthetic */ WorldPoint gR;
    private static final /* synthetic */ WorldPoint gC;
    private static final /* synthetic */ WorldPoint gK;
    private static final /* synthetic */ WorldPoint gD;
    public static final /* synthetic */ WorldPoint gi;
    static final /* synthetic */ int gs;
    static /* synthetic */ WorldArea hq;
    private static final /* synthetic */ WorldPoint gS;
    static /* synthetic */ String[] hl;
    private static final /* synthetic */ WorldPoint gI;
    private static final /* synthetic */ int ha;
    static final /* synthetic */ int go;
    static final /* synthetic */ int gm;
    private static final /* synthetic */ WorldPoint gz;
    static /* synthetic */ int hj;
    private static final /* synthetic */ WorldPoint gx;
    static /* synthetic */ boolean cm;
    static final /* synthetic */ WorldPoint[] gv;
    static /* synthetic */ WorldArea hs;
    static /* synthetic */ int bT;
    static /* synthetic */ String hm;
    private static final /* synthetic */ WorldPoint gH;
    public static final /* synthetic */ WorldArea gf;
    public static final /* synthetic */ int[] gc;
    private static final /* synthetic */ WorldPoint gy;
    static final /* synthetic */ int gt;
    public static final /* synthetic */ WorldPoint gk;
    private static final /* synthetic */ WorldPoint gw;
    private static /* synthetic */ String[] lIIIIIlIl;
    public static final /* synthetic */ int[] gd;
    static /* synthetic */ WorldPoint hr;
    private static final /* synthetic */ WorldPoint gL;
    private static final /* synthetic */ WorldPoint gM;
    private static final /* synthetic */ WorldPoint gP;
    private static final /* synthetic */ WorldPoint gJ;

    private static boolean llIlllIIllI(int n2, int n3) {
        return n2 <= n3;
    }

    public static void bG() {
        block254: {
            block289: {
                Item lIIlIIlIlIlIIlI;
                BankLocation lIIlIIlIlIlIIll;
                block270: {
                    block253: {
                        block252: {
                            block251: {
                                block250: {
                                    block249: {
                                        block248: {
                                            block265: {
                                                block268: {
                                                    block269: {
                                                        block266: {
                                                            block267: {
                                                                block255: {
                                                                    block256: {
                                                                        block264: {
                                                                            block262: {
                                                                                block263: {
                                                                                    block261: {
                                                                                        block260: {
                                                                                            block258: {
                                                                                                block259: {
                                                                                                    block257: {
                                                                                                        if (F.llIllIlllll(bt ? 1 : 0)) {
                                                                                                            AccBuilderEasyClues.c = lIIIIIlIl[lIIIIlIIl[0]];
                                                                                                            b.a(bv);
                                                                                                            if (F.llIlllIIIII(bv.size(), lIIIIlIIl[1])) {
                                                                                                                System.out.println(lIIIIIlIl[lIIIIlIIl[1]]);
                                                                                                                bt = lIIIIlIIl[0];
                                                                                                            }
                                                                                                        }
                                                                                                        if (!F.llIlllIIIIl(bt ? 1 : 0)) break block254;
                                                                                                        if (F.llIllIlllll(Inventory.contains((int[])f.aV) ? 1 : 0) && F.llIlllIIIII(Movement.getRunEnergy(), lIIIIlIIl[2]) && F.llIlllIIIIl(Dialog.isOpen() ? 1 : 0)) {
                                                                                                            Inventory.getFirst((int[])f.aV).interact(lIIIIIlIl[lIIIIlIIl[3]]);
                                                                                                            Time.sleepTicks((int)lIIIIlIIl[1]);
                                                                                                            0;
                                                                                                        }
                                                                                                        if (!F.llIlllIIIlI(Skills.getBoostedLevel((Skill)Skill.HITPOINTS), lIIIIlIIl[4]) || F.llIllIlllll(Inventory.isFull() ? 1 : 0)) {
                                                                                                            String[] stringArray = new String[lIIIIlIIl[1]];
                                                                                                            stringArray[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[5]];
                                                                                                            if (F.llIllIlllll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                                                                                                                String[] stringArray2 = new String[lIIIIlIIl[1]];
                                                                                                                stringArray2[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[6]];
                                                                                                                Inventory.getFirst((String[])stringArray2).interact(lIIIIIlIl[lIIIIlIIl[7]]);
                                                                                                                Time.sleepTicks((int)lIIIIlIIl[1]);
                                                                                                                0;
                                                                                                            }
                                                                                                        }
                                                                                                        if (F.llIlllIIIII(e.j(lIIIIlIIl[8]), lIIIIlIIl[9])) {
                                                                                                            G.bN();
                                                                                                        }
                                                                                                        if (!F.llIlllIIIIl(e.j(lIIIIlIIl[10])) || !F.llIlllIIIll(e.j(lIIIIlIIl[8]), lIIIIlIIl[9])) break block255;
                                                                                                        if (!F.llIlllIIIIl(F.bH() ? 1 : 0)) break block256;
                                                                                                        lIIlIIlIlIlIIll = BankLocation.getNearest();
                                                                                                        if (F.llIlllIIlII(lIIlIIlIlIlIIll) && F.llIlllIIIIl(lIIlIIlIlIlIIll.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                                                                                            AccBuilderEasyClues.c = lIIIIIlIl[lIIIIlIIl[11]];
                                                                                                            a.a(lIIlIIlIlIlIIll);
                                                                                                        }
                                                                                                        if (!F.llIlllIIlII(lIIlIIlIlIlIIll) || !F.llIllIlllll(lIIlIIlIlIlIIll.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block256;
                                                                                                        if (F.llIlllIIIIl(Bank.isOpen() ? 1 : 0)) {
                                                                                                            AccBuilderEasyClues.c = lIIIIIlIl[lIIIIlIIl[9]];
                                                                                                            a.a();
                                                                                                            Time.sleepUntil(() -> Bank.isOpen(), (int)lIIIIlIIl[12]);
                                                                                                            0;
                                                                                                        }
                                                                                                        if (!F.llIllIlllll(Bank.isOpen() ? 1 : 0)) break block256;
                                                                                                        AccBuilderEasyClues.c = lIIIIIlIl[lIIIIlIIl[13]];
                                                                                                        if (F.llIlllIIlIl(Inventory.getAll().size())) {
                                                                                                            Bank.depositInventory();
                                                                                                            Time.sleepTicks((int)lIIIIlIIl[5]);
                                                                                                            0;
                                                                                                        }
                                                                                                        if (F.llIlllIIlIl(Equipment.getAll().size())) {
                                                                                                            Bank.depositEquipment();
                                                                                                            Time.sleepTicks((int)lIIIIlIIl[3]);
                                                                                                            0;
                                                                                                        }
                                                                                                        int[] nArray = new int[lIIIIlIIl[1]];
                                                                                                        nArray[F.lIIIIlIIl[0]] = lIIIIlIIl[14];
                                                                                                        if (!F.llIllIlllll(Bank.contains((int[])nArray) ? 1 : 0)) break block257;
                                                                                                        int[] nArray2 = new int[lIIIIlIIl[1]];
                                                                                                        nArray2[F.lIIIIlIIl[0]] = lIIIIlIIl[14];
                                                                                                        if (!F.llIlllIIIll(Bank.getFirst((int[])nArray2).getQuantity(), lIIIIlIIl[11])) break block258;
                                                                                                    }
                                                                                                    int[] nArray = new int[lIIIIlIIl[1]];
                                                                                                    nArray[F.lIIIIlIIl[0]] = lIIIIlIIl[15];
                                                                                                    if (!F.llIllIlllll(Bank.contains((int[])nArray) ? 1 : 0)) break block259;
                                                                                                    int[] nArray3 = new int[lIIIIlIIl[1]];
                                                                                                    nArray3[F.lIIIIlIIl[0]] = lIIIIlIIl[15];
                                                                                                    if (!F.llIlllIIIll(Bank.getFirst((int[])nArray3).getQuantity(), lIIIIlIIl[11])) break block258;
                                                                                                }
                                                                                                int[] nArray = new int[lIIIIlIIl[1]];
                                                                                                nArray[F.lIIIIlIIl[0]] = lIIIIlIIl[16];
                                                                                                if (!F.llIllIlllll(Bank.contains((int[])nArray) ? 1 : 0)) break block260;
                                                                                                int[] nArray4 = new int[lIIIIlIIl[1]];
                                                                                                nArray4[F.lIIIIlIIl[0]] = lIIIIlIIl[16];
                                                                                                if (!F.llIlllIIIII(Bank.getFirst((int[])nArray4).getQuantity(), lIIIIlIIl[11])) break block260;
                                                                                            }
                                                                                            F.af();
                                                                                            System.out.println(lIIIIIlIl[lIIIIlIIl[17]]);
                                                                                            bt = lIIIIlIIl[1];
                                                                                            return;
                                                                                        }
                                                                                        int[] nArray = new int[lIIIIlIIl[1]];
                                                                                        nArray[F.lIIIIlIIl[0]] = lIIIIlIIl[18];
                                                                                        if (!F.llIlllIIIIl(Bank.contains((int[])nArray) ? 1 : 0)) break block261;
                                                                                        String[] stringArray = new String[lIIIIlIIl[1]];
                                                                                        stringArray[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[19]];
                                                                                        if (!F.llIlllIIIll(Inventory.getCount((String[])stringArray), lIIIIlIIl[1])) break block262;
                                                                                    }
                                                                                    int[] nArray = new int[lIIIIlIIl[1]];
                                                                                    nArray[F.lIIIIlIIl[0]] = lIIIIlIIl[20];
                                                                                    if (!F.llIlllIIIIl(Bank.contains((int[])nArray) ? 1 : 0)) break block263;
                                                                                    String[] stringArray = new String[lIIIIlIIl[1]];
                                                                                    stringArray[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[21]];
                                                                                    if (!F.llIlllIIIll(Inventory.getCount((String[])stringArray), lIIIIlIIl[1])) break block262;
                                                                                }
                                                                                if (!(F.llIlllIIIIl(Bank.contains((int[])f.aO) ? 1 : 0) && !F.llIlllIIIll(Inventory.getCount((int[])f.aO), lIIIIlIIl[1]) || F.llIlllIIIIl(Bank.contains((int[])f.aN) ? 1 : 0) && !F.llIlllIIIll(Inventory.getCount((int[])f.aN), lIIIIlIIl[1])) && (!F.llIlllIIIIl(Bank.contains((int[])f.aV) ? 1 : 0) || !F.llIlllIIIII(Inventory.getCount((int[])f.aV), lIIIIlIIl[1]))) break block264;
                                                                            }
                                                                            F.af();
                                                                            System.out.println(lIIIIIlIl[lIIIIlIIl[22]]);
                                                                            bt = lIIIIlIIl[1];
                                                                            return;
                                                                        }
                                                                        String[] stringArray = new String[lIIIIlIIl[1]];
                                                                        stringArray[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[23]];
                                                                        if (F.llIlllIIIIl(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                                                                            a.a(lIIIIlIIl[18], lIIIIlIIl[1]);
                                                                        }
                                                                        if (F.llIlllIIIIl(Inventory.contains((int[])f.aO) ? 1 : 0)) {
                                                                            a.a(f.aO, lIIIIlIIl[1]);
                                                                        }
                                                                        if (F.llIlllIIIIl(Inventory.contains((int[])f.aN) ? 1 : 0)) {
                                                                            a.a(lIIIIlIIl[24], lIIIIlIIl[1]);
                                                                        }
                                                                        if (F.llIlllIIIIl(Inventory.contains((int[])f.aV) ? 1 : 0)) {
                                                                            a.a(f.aV, lIIIIlIIl[6]);
                                                                        }
                                                                        String[] stringArray3 = new String[lIIIIlIIl[1]];
                                                                        stringArray3[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[4]];
                                                                        if (F.llIlllIIIIl(Inventory.contains((String[])stringArray3) ? 1 : 0)) {
                                                                            a.a(lIIIIlIIl[20], lIIIIlIIl[25]);
                                                                        }
                                                                    }
                                                                    if (F.llIllIlllll(F.bH() ? 1 : 0)) {
                                                                        if (F.llIlllIIIlI(Players.getLocal().getWorldLocation().distanceTo(gA), lIIIIlIIl[7])) {
                                                                            if (F.llIllIlllll(Bank.isOpen() ? 1 : 0)) {
                                                                                Bank.close();
                                                                                Time.sleepTicks((int)lIIIIlIIl[5]);
                                                                                0;
                                                                            }
                                                                            if (F.llIlllIIIIl(Bank.isOpen() ? 1 : 0)) {
                                                                                if (F.llIlllIIIII(bT, lIIIIlIIl[1])) {
                                                                                    if (F.llIllIlllll(Inventory.contains((int[])f.aV) ? 1 : 0) && F.llIlllIIIII(Movement.getRunEnergy(), lIIIIlIIl[2])) {
                                                                                        Inventory.getFirst((int[])f.aV).interact(lIIIIIlIl[lIIIIlIIl[26]]);
                                                                                        Time.sleepTicks((int)lIIIIlIIl[1]);
                                                                                        0;
                                                                                    }
                                                                                    e.v();
                                                                                    bT += lIIIIlIIl[1];
                                                                                }
                                                                                AccBuilderEasyClues.c = lIIIIIlIl[lIIIIlIIl[27]];
                                                                                Movement.walkTo((WorldPoint)gA);
                                                                                0;
                                                                                Time.sleepTicks((int)lIIIIlIIl[1]);
                                                                                0;
                                                                            }
                                                                        }
                                                                        if (F.llIlllIIllI(Players.getLocal().getWorldLocation().distanceTo(gA), lIIIIlIIl[7])) {
                                                                            AccBuilderEasyClues.c = lIIIIIlIl[lIIIIlIIl[28]];
                                                                            g.a(ho, hl);
                                                                        }
                                                                    }
                                                                }
                                                                if (F.llIlllIIlll(e.j(lIIIIlIIl[10]), lIIIIlIIl[1])) {
                                                                    if (F.llIlllIIIlI(Players.getLocal().getWorldLocation().distanceTo(gD), lIIIIlIIl[5])) {
                                                                        AccBuilderEasyClues.c = lIIIIIlIl[lIIIIlIIl[25]];
                                                                        Movement.walkTo((WorldPoint)gD);
                                                                        0;
                                                                    }
                                                                    if (F.llIlllIIllI(Players.getLocal().getWorldLocation().distanceTo(gD), lIIIIlIIl[5])) {
                                                                        AccBuilderEasyClues.c = lIIIIIlIl[lIIIIlIIl[29]];
                                                                        g.a(hn, hl);
                                                                    }
                                                                }
                                                                if (F.llIlllIIlll(e.j(lIIIIlIIl[10]), lIIIIlIIl[3])) {
                                                                    if (F.llIlllIIIlI(Players.getLocal().getWorldLocation().distanceTo(gF), lIIIIlIIl[6])) {
                                                                        AccBuilderEasyClues.c = lIIIIIlIl[lIIIIlIIl[30]];
                                                                        Movement.walkTo((WorldPoint)gF);
                                                                        0;
                                                                        Time.sleepTicks((int)lIIIIlIIl[1]);
                                                                        0;
                                                                    }
                                                                    if (F.llIlllIIllI(Players.getLocal().getWorldLocation().distanceTo(gF), lIIIIlIIl[6])) {
                                                                        int[] nArray = new int[lIIIIlIIl[1]];
                                                                        nArray[F.lIIIIlIIl[0]] = lIIIIlIIl[31];
                                                                        lIIlIIlIlIlIIll = TileObjects.getNearest((int[])nArray);
                                                                        String[] stringArray = new String[lIIIIlIIl[1]];
                                                                        stringArray[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[32]];
                                                                        if (F.llIlllIIIIl(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                                                                            AccBuilderEasyClues.c = lIIIIIlIl[lIIIIlIIl[33]];
                                                                            if (F.llIlllIIlII(lIIlIIlIlIlIIll)) {
                                                                                lIIlIIlIlIlIIll.interact(lIIIIIlIl[lIIIIlIIl[34]]);
                                                                                Time.sleepTicks((int)lIIIIlIIl[3]);
                                                                                0;
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                if (F.llIlllIIllI(Players.getLocal().getWorldLocation().distanceTo(gF), lIIIIlIIl[19])) {
                                                                    String[] stringArray = new String[lIIIIlIIl[1]];
                                                                    stringArray[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[35]];
                                                                    if (F.llIllIlllll(Inventory.contains((String[])stringArray) ? 1 : 0) && F.llIlllIIlll(Players.getLocal().getAnimation(), lIIIIlIIl[36]) && F.llIlllIlIII(e.j(lIIIIlIIl[10]), lIIIIlIIl[5])) {
                                                                        String[] stringArray4 = new String[lIIIIlIIl[1]];
                                                                        stringArray4[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[37]];
                                                                        lIIlIIlIlIlIIll = Inventory.getFirst((String[])stringArray4);
                                                                        if (F.llIlllIIlII(lIIlIIlIlIlIIll)) {
                                                                            AccBuilderEasyClues.c = lIIIIIlIl[lIIIIlIIl[38]];
                                                                            lIIlIIlIlIlIIll.interact(lIIIIIlIl[lIIIIlIIl[39]]);
                                                                            Time.sleepTicks((int)lIIIIlIIl[3]);
                                                                            0;
                                                                        }
                                                                    }
                                                                }
                                                                if (F.llIlllIIlll(e.j(lIIIIlIIl[10]), lIIIIlIIl[5])) {
                                                                    if (F.llIlllIIllI(Players.getLocal().getWorldLocation().distanceTo(gF), lIIIIlIIl[19])) {
                                                                        int[] nArray = new int[lIIIIlIIl[1]];
                                                                        nArray[F.lIIIIlIIl[0]] = lIIIIlIIl[40];
                                                                        if (F.llIlllIIIII(Inventory.getCount((int[])nArray), lIIIIlIIl[1])) {
                                                                            int[] nArray5 = new int[lIIIIlIIl[1]];
                                                                            nArray5[F.lIIIIlIIl[0]] = lIIIIlIIl[41];
                                                                            if (F.llIlllIIIII(Inventory.getCount((int[])nArray5), lIIIIlIIl[1])) {
                                                                                AccBuilderEasyClues.c = lIIIIIlIl[lIIIIlIIl[42]];
                                                                                if (F.llIllIlllll(Inventory.contains(item -> item.getName().contains(lIIIIIlIl[lIIIIlIIl[304]])) ? 1 : 0) && F.llIlllIIIIl(Equipment.contains(item -> item.getName().contains(lIIIIIlIl[lIIIIlIIl[41]])) ? 1 : 0)) {
                                                                                    Inventory.getFirst(item -> item.getName().contains(lIIIIIlIl[lIIIIlIIl[40]])).interact(lIIIIIlIl[lIIIIlIIl[43]]);
                                                                                }
                                                                                if (F.llIllIlllll(Equipment.contains(item -> item.getName().contains(lIIIIIlIl[lIIIIlIIl[332]])) ? 1 : 0) && F.llIlllIIIIl(Players.getLocal().isAnimating() ? 1 : 0)) {
                                                                                    Equipment.getFirst(item -> item.getName().contains(lIIIIIlIl[lIIIIlIIl[331]])).interact(lIIIIIlIl[lIIIIlIIl[44]]);
                                                                                    Time.sleepTicks((int)lIIIIlIIl[6]);
                                                                                    0;
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    if (F.llIlllIIIlI(Players.getLocal().getWorldLocation().distanceTo(gG), lIIIIlIIl[5])) {
                                                                        int[] nArray = new int[lIIIIlIIl[1]];
                                                                        nArray[F.lIIIIlIIl[0]] = lIIIIlIIl[40];
                                                                        if (F.llIlllIIIII(Inventory.getCount((int[])nArray), lIIIIlIIl[1])) {
                                                                            int[] nArray6 = new int[lIIIIlIIl[1]];
                                                                            nArray6[F.lIIIIlIIl[0]] = lIIIIlIIl[41];
                                                                            if (F.llIlllIIIII(Inventory.getCount((int[])nArray6), lIIIIlIIl[1]) && F.llIlllIIIlI(Players.getLocal().getWorldLocation().distanceTo(gH), lIIIIlIIl[44]) && F.llIlllIIIlI(Players.getLocal().getWorldLocation().distanceTo(gF), lIIIIlIIl[19])) {
                                                                                AccBuilderEasyClues.c = lIIIIIlIl[lIIIIlIIl[45]];
                                                                                if (F.llIlllIIIIl(hq.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                                                                    Movement.walkTo((WorldPoint)hr);
                                                                                    0;
                                                                                }
                                                                                if (F.llIllIlllll(hq.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                                                                    Walker.stepAlong(List.of(gv));
                                                                                    0;
                                                                                    Time.sleepTicks((int)lIIIIlIIl[1]);
                                                                                    0;
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    if (F.llIlllIIllI(Players.getLocal().getWorldLocation().distanceTo(gG), lIIIIlIIl[5])) {
                                                                        String[] stringArray = new String[lIIIIlIIl[1]];
                                                                        stringArray[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[46]];
                                                                        if (F.llIlllIIlII(TileObjects.getNearest((String[])stringArray))) {
                                                                            int[] nArray = new int[lIIIIlIIl[1]];
                                                                            nArray[F.lIIIIlIIl[0]] = lIIIIlIIl[40];
                                                                            if (F.llIlllIIIII(Inventory.getCount((int[])nArray), lIIIIlIIl[1])) {
                                                                                int[] nArray7 = new int[lIIIIlIIl[1]];
                                                                                nArray7[F.lIIIIlIIl[0]] = lIIIIlIIl[41];
                                                                                if (F.llIlllIIIII(Inventory.getCount((int[])nArray7), lIIIIlIIl[1])) {
                                                                                    int[] nArray8 = new int[lIIIIlIIl[1]];
                                                                                    nArray8[F.lIIIIlIIl[0]] = lIIIIlIIl[47];
                                                                                    lIIlIIlIlIlIIll = TileObjects.getNearest((int[])nArray8);
                                                                                    if (F.llIlllIIlII(lIIlIIlIlIlIIll)) {
                                                                                        lIIlIIlIlIlIIll.interact(lIIIIIlIl[lIIIIlIIl[48]]);
                                                                                        Time.sleepTicks((int)lIIIIlIIl[5]);
                                                                                        0;
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    if (F.llIlllIIIlI(Players.getLocal().getWorldLocation().distanceTo(gH), lIIIIlIIl[3])) {
                                                                        int[] nArray = new int[lIIIIlIIl[1]];
                                                                        nArray[F.lIIIIlIIl[0]] = lIIIIlIIl[49];
                                                                        if (F.llIlllIIlII(TileObjects.getNearest((int[])nArray))) {
                                                                            int[] nArray9 = new int[lIIIIlIIl[1]];
                                                                            nArray9[F.lIIIIlIIl[0]] = lIIIIlIIl[40];
                                                                            if (F.llIlllIIIII(Inventory.getCount((int[])nArray9), lIIIIlIIl[1])) {
                                                                                int[] nArray10 = new int[lIIIIlIIl[1]];
                                                                                nArray10[F.lIIIIlIIl[0]] = lIIIIlIIl[41];
                                                                                if (F.llIlllIIIII(Inventory.getCount((int[])nArray10), lIIIIlIIl[1])) {
                                                                                    AccBuilderEasyClues.c = lIIIIIlIl[lIIIIlIIl[50]];
                                                                                    Movement.walkTo((WorldPoint)gH);
                                                                                    0;
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    if (F.llIlllIIllI(Players.getLocal().getWorldLocation().distanceTo(gH), lIIIIlIIl[5])) {
                                                                        int[] nArray = new int[lIIIIlIIl[1]];
                                                                        nArray[F.lIIIIlIIl[0]] = lIIIIlIIl[49];
                                                                        if (F.llIlllIIlII(TileObjects.getNearest((int[])nArray))) {
                                                                            int[] nArray11 = new int[lIIIIlIIl[1]];
                                                                            nArray11[F.lIIIIlIIl[0]] = lIIIIlIIl[40];
                                                                            if (F.llIlllIIIII(Inventory.getCount((int[])nArray11), lIIIIlIIl[1])) {
                                                                                int[] nArray12 = new int[lIIIIlIIl[1]];
                                                                                nArray12[F.lIIIIlIIl[0]] = lIIIIlIIl[41];
                                                                                if (F.llIlllIIIII(Inventory.getCount((int[])nArray12), lIIIIlIIl[1])) {
                                                                                    AccBuilderEasyClues.c = lIIIIIlIl[lIIIIlIIl[51]];
                                                                                    int[] nArray13 = new int[lIIIIlIIl[1]];
                                                                                    nArray13[F.lIIIIlIIl[0]] = lIIIIlIIl[49];
                                                                                    lIIlIIlIlIlIIll = TileObjects.getNearest((int[])nArray13);
                                                                                    if (F.llIlllIIlII(lIIlIIlIlIlIIll)) {
                                                                                        lIIlIIlIlIlIIll.interact(lIIIIIlIl[lIIIIlIIl[52]]);
                                                                                        Time.sleepTicks((int)lIIIIlIIl[3]);
                                                                                        0;
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    if (F.llIlllIIIlI(Players.getLocal().getWorldLocation().distanceTo(gI), lIIIIlIIl[3])) {
                                                                        int[] nArray = new int[lIIIIlIIl[1]];
                                                                        nArray[F.lIIIIlIIl[0]] = lIIIIlIIl[40];
                                                                        if (F.llIlllIIlIl(Inventory.getCount((int[])nArray)) && F.llIlllIIIII(Players.getLocal().getWorldLocation().getY(), lIIIIlIIl[53])) {
                                                                            int[] nArray14 = new int[lIIIIlIIl[1]];
                                                                            nArray14[F.lIIIIlIIl[0]] = lIIIIlIIl[40];
                                                                            if (F.llIlllIIlIl(Inventory.getCount((int[])nArray14))) {
                                                                                int[] nArray15 = new int[lIIIIlIIl[1]];
                                                                                nArray15[F.lIIIIlIIl[0]] = lIIIIlIIl[41];
                                                                                if (F.llIlllIIIII(Inventory.getCount((int[])nArray15), lIIIIlIIl[1])) {
                                                                                    AccBuilderEasyClues.c = lIIIIIlIl[lIIIIlIIl[54]];
                                                                                    Movement.walkTo((WorldPoint)gI);
                                                                                    0;
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    if (F.llIlllIIllI(Players.getLocal().getWorldLocation().distanceTo(gI), lIIIIlIIl[3])) {
                                                                        int[] nArray = new int[lIIIIlIIl[1]];
                                                                        nArray[F.lIIIIlIIl[0]] = lIIIIlIIl[40];
                                                                        if (F.llIlllIIlIl(Inventory.getCount((int[])nArray)) && F.llIlllIIIII(Players.getLocal().getWorldLocation().getY(), lIIIIlIIl[53])) {
                                                                            int[] nArray16 = new int[lIIIIlIIl[1]];
                                                                            nArray16[F.lIIIIlIIl[0]] = lIIIIlIIl[40];
                                                                            if (F.llIlllIIlIl(Inventory.getCount((int[])nArray16))) {
                                                                                int[] nArray17 = new int[lIIIIlIIl[1]];
                                                                                nArray17[F.lIIIIlIIl[0]] = lIIIIlIIl[41];
                                                                                if (F.llIlllIIIII(Inventory.getCount((int[])nArray17), lIIIIlIIl[1])) {
                                                                                    int[] nArray18 = new int[lIIIIlIIl[1]];
                                                                                    nArray18[F.lIIIIlIIl[0]] = lIIIIlIIl[55];
                                                                                    lIIlIIlIlIlIIll = TileObjects.getNearest((int[])nArray18);
                                                                                    if (F.llIlllIIlII(lIIlIIlIlIlIIll)) {
                                                                                        AccBuilderEasyClues.c = lIIIIIlIl[lIIIIlIIl[56]];
                                                                                        int[] nArray19 = new int[lIIIIlIIl[1]];
                                                                                        nArray19[F.lIIIIlIIl[0]] = lIIIIlIIl[40];
                                                                                        lIIlIIlIlIlIIlI = Inventory.getFirst((int[])nArray19);
                                                                                        if (F.llIlllIIlII(lIIlIIlIlIlIIlI)) {
                                                                                            lIIlIIlIlIlIIlI.useOn((TileObject)lIIlIIlIlIlIIll);
                                                                                            Time.sleep((long)1L);
                                                                                            0;
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    if (F.llIlllIIIll(Players.getLocal().getWorldLocation().getY(), lIIIIlIIl[53])) {
                                                                        int[] nArray = new int[lIIIIlIIl[1]];
                                                                        nArray[F.lIIIIlIIl[0]] = lIIIIlIIl[41];
                                                                        if (F.llIlllIIIII(Inventory.getCount((int[])nArray), lIIIIlIIl[1])) {
                                                                            AccBuilderEasyClues.c = lIIIIIlIl[lIIIIlIIl[57]];
                                                                            g.a(hm, hl);
                                                                        }
                                                                    }
                                                                    int[] nArray = new int[lIIIIlIIl[1]];
                                                                    nArray[F.lIIIIlIIl[0]] = lIIIIlIIl[41];
                                                                    if (F.llIlllIIlIl(Inventory.getCount((int[])nArray)) && F.llIlllIIIlI(Players.getLocal().getWorldLocation().distanceTo(gK), lIIIIlIIl[6])) {
                                                                        String[] stringArray = new String[lIIIIlIIl[1]];
                                                                        stringArray[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[58]];
                                                                        if (F.llIlllIIIII(Inventory.getCount((String[])stringArray), lIIIIlIIl[1])) {
                                                                            String[] stringArray5 = new String[lIIIIlIIl[1]];
                                                                            stringArray5[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[59]];
                                                                            if (F.llIlllIIIII(Inventory.getCount((String[])stringArray5), lIIIIlIIl[1])) {
                                                                                AccBuilderEasyClues.c = lIIIIIlIl[lIIIIlIIl[60]];
                                                                                if (F.llIlllIIIIl(hs.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                                                                    if (F.llIllIlllll(Inventory.contains(item -> item.getName().contains(lIIIIIlIl[lIIIIlIIl[330]])) ? 1 : 0) && F.llIlllIIIIl(Equipment.contains(item -> item.getName().contains(lIIIIIlIl[lIIIIlIIl[329]])) ? 1 : 0)) {
                                                                                        Inventory.getFirst(item -> item.getName().contains(lIIIIIlIl[lIIIIlIIl[328]])).interact(lIIIIIlIl[lIIIIlIIl[61]]);
                                                                                        Time.sleepTicks((int)lIIIIlIIl[1]);
                                                                                        0;
                                                                                    }
                                                                                    Movement.walkTo((WorldPoint)gA);
                                                                                    0;
                                                                                    Time.sleepTicks((int)lIIIIlIIl[1]);
                                                                                    0;
                                                                                }
                                                                                if (F.llIllIlllll(hs.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                                                                    Movement.walkTo((WorldPoint)gK);
                                                                                    0;
                                                                                    Time.sleepTicks((int)lIIIIlIIl[1]);
                                                                                    0;
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    int[] nArray20 = new int[lIIIIlIIl[1]];
                                                                    nArray20[F.lIIIIlIIl[0]] = lIIIIlIIl[41];
                                                                    if (F.llIlllIIlIl(Inventory.getCount((int[])nArray20)) && F.llIlllIIllI(Players.getLocal().getWorldLocation().distanceTo(gK), lIIIIlIIl[6])) {
                                                                        String[] stringArray = new String[lIIIIlIIl[1]];
                                                                        stringArray[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[62]];
                                                                        if (F.llIlllIIIII(Inventory.getCount((String[])stringArray), lIIIIlIIl[1])) {
                                                                            String[] stringArray6 = new String[lIIIIlIIl[1]];
                                                                            stringArray6[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[63]];
                                                                            if (F.llIlllIIIII(Inventory.getCount((String[])stringArray6), lIIIIlIIl[1])) {
                                                                                AccBuilderEasyClues.c = lIIIIIlIl[lIIIIlIIl[64]];
                                                                                int[] nArray21 = new int[lIIIIlIIl[1]];
                                                                                nArray21[F.lIIIIlIIl[0]] = lIIIIlIIl[41];
                                                                                lIIlIIlIlIlIIll = Inventory.getFirst((int[])nArray21);
                                                                                if (F.llIlllIIlII(lIIlIIlIlIlIIll)) {
                                                                                    int[] nArray22 = new int[lIIIIlIIl[1]];
                                                                                    nArray22[F.lIIIIlIIl[0]] = lIIIIlIIl[65];
                                                                                    lIIlIIlIlIlIIlI = TileObjects.getNearest((int[])nArray22);
                                                                                    if (F.llIlllIIlII(lIIlIIlIlIlIIlI)) {
                                                                                        lIIlIIlIlIlIIll.useOn((TileObject)lIIlIIlIlIlIIlI);
                                                                                        Time.sleepUntil(() -> {
                                                                                            boolean bl;
                                                                                            String[] stringArray = new String[lIIIIlIIl[1]];
                                                                                            stringArray[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[327]];
                                                                                            if (F.llIlllIIlII(TileObjects.getNearest((String[])stringArray))) {
                                                                                                bl = lIIIIlIIl[1];
                                                                                                0;
                                                                                                if (1 <= -1) {
                                                                                                    return ((0x4A ^ 0x41) & ~(0x78 ^ 0x73)) != 0;
                                                                                                }
                                                                                            } else {
                                                                                                bl = lIIIIlIIl[0];
                                                                                            }
                                                                                            return bl;
                                                                                        }, (int)lIIIIlIIl[66]);
                                                                                        0;
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    int[] nArray23 = new int[lIIIIlIIl[1]];
                                                                    nArray23[F.lIIIIlIIl[0]] = lIIIIlIIl[41];
                                                                    if (F.llIlllIIlIl(Inventory.getCount((int[])nArray23))) {
                                                                        String[] stringArray = new String[lIIIIlIIl[1]];
                                                                        stringArray[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[67]];
                                                                        if (F.llIlllIIlII(TileObjects.getNearest((String[])stringArray))) {
                                                                            String[] stringArray7 = new String[lIIIIlIIl[1]];
                                                                            stringArray7[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[68]];
                                                                            if (F.llIlllIIIII(Inventory.getCount((String[])stringArray7), lIIIIlIIl[1])) {
                                                                                String[] stringArray8 = new String[lIIIIlIIl[1]];
                                                                                stringArray8[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[69]];
                                                                                if (F.llIlllIIIII(Inventory.getCount((String[])stringArray8), lIIIIlIIl[1])) {
                                                                                    AccBuilderEasyClues.c = lIIIIIlIl[lIIIIlIIl[2]];
                                                                                    if (F.llIlllIIIlI(Players.getLocal().getWorldLocation().distanceTo(gL), lIIIIlIIl[6])) {
                                                                                        Movement.walkTo((WorldPoint)gL);
                                                                                        0;
                                                                                    }
                                                                                    if (F.llIlllIIllI(Players.getLocal().getWorldLocation().distanceTo(gL), lIIIIlIIl[6])) {
                                                                                        int[] nArray24 = new int[lIIIIlIIl[1]];
                                                                                        nArray24[F.lIIIIlIIl[0]] = lIIIIlIIl[70];
                                                                                        lIIlIIlIlIlIIll = TileObjects.getNearest((int[])nArray24);
                                                                                        if (F.llIlllIIlII(lIIlIIlIlIlIIll)) {
                                                                                            lIIlIIlIlIlIIll.interact(lIIIIIlIl[lIIIIlIIl[71]]);
                                                                                            Time.sleepTicks((int)lIIIIlIIl[1]);
                                                                                            0;
                                                                                        }
                                                                                        int[] nArray25 = new int[lIIIIlIIl[1]];
                                                                                        nArray25[F.lIIIIlIIl[0]] = lIIIIlIIl[72];
                                                                                        lIIlIIlIlIlIIlI = TileObjects.getNearest((int[])nArray25);
                                                                                        if (F.llIlllIIlII(lIIlIIlIlIlIIlI)) {
                                                                                            lIIlIIlIlIlIIlI.interact(lIIIIIlIl[lIIIIlIIl[73]]);
                                                                                            Time.sleepTicks((int)lIIIIlIIl[1]);
                                                                                            0;
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                if (!F.llIlllIIlll(e.j(lIIIIlIIl[10]), lIIIIlIIl[6])) break block265;
                                                                cl = lIIIIlIIl[0];
                                                                int[] nArray = new int[lIIIIlIIl[1]];
                                                                nArray[F.lIIIIlIIl[0]] = lIIIIlIIl[41];
                                                                if (F.llIlllIIlIl(Inventory.getCount((int[])nArray))) {
                                                                    String[] stringArray = new String[lIIIIlIIl[1]];
                                                                    stringArray[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[74]];
                                                                    if (F.llIlllIIlII(TileObjects.getNearest((String[])stringArray))) {
                                                                        String[] stringArray9 = new String[lIIIIlIIl[1]];
                                                                        stringArray9[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[75]];
                                                                        if (F.llIlllIIIII(Inventory.getCount((String[])stringArray9), lIIIIlIIl[1])) {
                                                                            String[] stringArray10 = new String[lIIIIlIIl[1]];
                                                                            stringArray10[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[76]];
                                                                            if (F.llIlllIIIII(Inventory.getCount((String[])stringArray10), lIIIIlIIl[1])) {
                                                                                AccBuilderEasyClues.c = lIIIIIlIl[lIIIIlIIl[77]];
                                                                                if (F.llIlllIIIlI(Players.getLocal().getWorldLocation().distanceTo(gL), lIIIIlIIl[6])) {
                                                                                    Movement.walkTo((WorldPoint)gL);
                                                                                    0;
                                                                                }
                                                                                if (F.llIlllIIllI(Players.getLocal().getWorldLocation().distanceTo(gL), lIIIIlIIl[6])) {
                                                                                    int[] nArray26 = new int[lIIIIlIIl[1]];
                                                                                    nArray26[F.lIIIIlIIl[0]] = lIIIIlIIl[70];
                                                                                    lIIlIIlIlIlIIll = TileObjects.getNearest((int[])nArray26);
                                                                                    if (F.llIlllIIlII(lIIlIIlIlIlIIll)) {
                                                                                        lIIlIIlIlIlIIll.interact(lIIIIIlIl[lIIIIlIIl[78]]);
                                                                                        Time.sleepTicks((int)lIIIIlIIl[1]);
                                                                                        0;
                                                                                    }
                                                                                    int[] nArray27 = new int[lIIIIlIIl[1]];
                                                                                    nArray27[F.lIIIIlIIl[0]] = lIIIIlIIl[72];
                                                                                    lIIlIIlIlIlIIlI = TileObjects.getNearest((int[])nArray27);
                                                                                    if (F.llIlllIIlII(lIIlIIlIlIlIIlI)) {
                                                                                        lIIlIIlIlIlIIlI.interact(lIIIIIlIl[lIIIIlIIl[79]]);
                                                                                        Time.sleepTicks((int)lIIIIlIIl[1]);
                                                                                        0;
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                int[] nArray28 = new int[lIIIIlIIl[1]];
                                                                nArray28[F.lIIIIlIIl[0]] = lIIIIlIIl[41];
                                                                if (!F.llIlllIIlIl(Inventory.getCount((int[])nArray28))) break block266;
                                                                String[] stringArray = new String[lIIIIlIIl[1]];
                                                                stringArray[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[80]];
                                                                if (!F.llIlllIlIIl(TileObjects.getNearest((String[])stringArray))) break block267;
                                                                int[] nArray29 = new int[lIIIIlIIl[1]];
                                                                nArray29[F.lIIIIlIIl[0]] = lIIIIlIIl[81];
                                                                if (!F.llIlllIIlII(TileObjects.getNearest((int[])nArray29))) break block266;
                                                            }
                                                            String[] stringArray = new String[lIIIIlIIl[1]];
                                                            stringArray[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[82]];
                                                            if (F.llIlllIIlIl(Inventory.getCount((String[])stringArray))) {
                                                                String[] stringArray11 = new String[lIIIIlIIl[1]];
                                                                stringArray11[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[83]];
                                                                if (F.llIlllIIIII(Inventory.getCount((String[])stringArray11), lIIIIlIIl[1])) {
                                                                    if (F.llIlllIIIlI(Players.getLocal().getWorldLocation().distanceTo(gM), lIIIIlIIl[5])) {
                                                                        AccBuilderEasyClues.c = lIIIIIlIl[lIIIIlIIl[84]];
                                                                        Movement.walkTo((WorldPoint)gM);
                                                                        0;
                                                                        Time.sleepTicks((int)lIIIIlIIl[1]);
                                                                        0;
                                                                    }
                                                                    if (F.llIlllIIllI(Players.getLocal().getWorldLocation().distanceTo(gM), lIIIIlIIl[5])) {
                                                                        int[] nArray = new int[lIIIIlIIl[1]];
                                                                        nArray[F.lIIIIlIIl[0]] = lIIIIlIIl[81];
                                                                        lIIlIIlIlIlIIll = TileObjects.getNearest((int[])nArray);
                                                                        if (F.llIlllIIlII(lIIlIIlIlIlIIll)) {
                                                                            lIIlIIlIlIlIIll.interact(lIIIIIlIl[lIIIIlIIl[85]]);
                                                                            Time.sleepTicks((int)lIIIIlIIl[1]);
                                                                            0;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        int[] nArray = new int[lIIIIlIIl[1]];
                                                        nArray[F.lIIIIlIIl[0]] = lIIIIlIIl[41];
                                                        if (F.llIlllIIlIl(Inventory.getCount((int[])nArray))) {
                                                            String[] stringArray = new String[lIIIIlIIl[1]];
                                                            stringArray[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[86]];
                                                            if (F.llIlllIIIII(Inventory.getCount((String[])stringArray), lIIIIlIIl[1])) {
                                                                String[] stringArray12 = new String[lIIIIlIIl[1]];
                                                                stringArray12[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[10]];
                                                                if (F.llIlllIIIII(Inventory.getCount((String[])stringArray12), lIIIIlIIl[1])) {
                                                                    String[] stringArray13 = new String[lIIIIlIIl[1]];
                                                                    stringArray13[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[87]];
                                                                    if (F.llIlllIIIII(Inventory.getCount((String[])stringArray13), lIIIIlIIl[1]) && F.llIlllIIllI(Players.getLocal().getWorldLocation().distanceTo(gM), lIIIIlIIl[6])) {
                                                                        String[] stringArray14 = new String[lIIIIlIIl[1]];
                                                                        stringArray14[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[88]];
                                                                        if (F.llIlllIIlIl(Inventory.getCount((String[])stringArray14))) {
                                                                            String[] stringArray15 = new String[lIIIIlIIl[1]];
                                                                            stringArray15[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[89]];
                                                                            if (F.llIlllIIlIl(Inventory.getCount((String[])stringArray15))) {
                                                                                AccBuilderEasyClues.c = lIIIIIlIl[lIIIIlIIl[90]];
                                                                                if (F.llIlllIIIIl(Equipment.contains((int[])f.aO) ? 1 : 0) && F.llIllIlllll(Inventory.contains((int[])f.aO) ? 1 : 0)) {
                                                                                    Inventory.getFirst((int[])f.aO).interact(lIIIIIlIl[lIIIIlIIl[91]]);
                                                                                    Time.sleepTicks((int)lIIIIlIIl[1]);
                                                                                    0;
                                                                                }
                                                                                if (F.llIllIlllll(Equipment.contains((int[])f.aO) ? 1 : 0)) {
                                                                                    Movement.walkTo((WorldPoint)gJ);
                                                                                    0;
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        if (!F.llIlllIIllI(Players.getLocal().getWorldLocation().distanceTo(gJ), lIIIIlIIl[30])) break block268;
                                                        int[] nArray30 = new int[lIIIIlIIl[1]];
                                                        nArray30[F.lIIIIlIIl[0]] = lIIIIlIIl[41];
                                                        if (!F.llIlllIIlIl(Inventory.getCount((int[])nArray30))) break block268;
                                                        String[] stringArray = new String[lIIIIlIIl[1]];
                                                        stringArray[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[92]];
                                                        if (!F.llIlllIIIll(Inventory.getCount((String[])stringArray), lIIIIlIIl[1])) break block269;
                                                        String[] stringArray16 = new String[lIIIIlIIl[1]];
                                                        stringArray16[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[93]];
                                                        if (!F.llIlllIIIll(Inventory.getCount((String[])stringArray16), lIIIIlIIl[1])) break block269;
                                                        String[] stringArray17 = new String[lIIIIlIIl[1]];
                                                        stringArray17[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[94]];
                                                        if (!F.llIlllIIIII(Inventory.getCount((String[])stringArray17), lIIIIlIIl[1])) break block268;
                                                    }
                                                    String[] stringArray = new String[lIIIIlIIl[1]];
                                                    stringArray[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[95]];
                                                    if (F.llIlllIIlIl(Inventory.getCount((String[])stringArray))) {
                                                        String[] stringArray18 = new String[lIIIIlIIl[1]];
                                                        stringArray18[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[96]];
                                                        if (F.llIlllIIlIl(Inventory.getCount((String[])stringArray18))) {
                                                            if (F.llIlllIIIlI(Players.getLocal().getWorldLocation().distanceTo(gJ), lIIIIlIIl[6])) {
                                                                Movement.walkTo((WorldPoint)gJ);
                                                                0;
                                                            }
                                                            if (F.llIlllIIllI(Players.getLocal().getWorldLocation().distanceTo(gJ), lIIIIlIIl[6])) {
                                                                if (F.llIlllIIIIl(Bank.isOpen() ? 1 : 0)) {
                                                                    AccBuilderEasyClues.c = lIIIIIlIl[lIIIIlIIl[97]];
                                                                    a.a();
                                                                }
                                                                if (F.llIllIlllll(Bank.isOpen() ? 1 : 0)) {
                                                                    AccBuilderEasyClues.c = lIIIIIlIl[lIIIIlIIl[98]];
                                                                    String[] stringArray19 = new String[lIIIIlIIl[1]];
                                                                    stringArray19[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[99]];
                                                                    Bank.depositAll((String[])stringArray19);
                                                                    if (F.llIlllIIIlI(Inventory.getAll().size(), lIIIIlIIl[34])) {
                                                                        Bank.deposit((String)lIIIIIlIl[lIIIIlIIl[100]], (int)lIIIIlIIl[7]);
                                                                    }
                                                                    String[] stringArray20 = new String[lIIIIlIIl[1]];
                                                                    stringArray20[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[101]];
                                                                    if (F.llIlllIIIIl(Inventory.contains((String[])stringArray20) ? 1 : 0)) {
                                                                        a.a(lIIIIlIIl[15], lIIIIlIIl[11]);
                                                                    }
                                                                    String[] stringArray21 = new String[lIIIIlIIl[1]];
                                                                    stringArray21[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[102]];
                                                                    if (F.llIllIlllll(Inventory.contains((String[])stringArray21) ? 1 : 0)) {
                                                                        String[] stringArray22 = new String[lIIIIlIIl[1]];
                                                                        stringArray22[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[103]];
                                                                        if (F.llIlllIIIII(Inventory.getFirst((String[])stringArray22).getQuantity(), lIIIIlIIl[11])) {
                                                                            String[] stringArray23 = new String[lIIIIlIIl[1]];
                                                                            stringArray23[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[105]];
                                                                            Bank.withdraw((String)lIIIIIlIl[lIIIIlIIl[104]], (int)(lIIIIlIIl[11] - Inventory.getFirst((String[])stringArray23).getQuantity()), (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                                                                            Time.sleepTicks((int)lIIIIlIIl[9]);
                                                                            0;
                                                                        }
                                                                    }
                                                                    String[] stringArray24 = new String[lIIIIlIIl[1]];
                                                                    stringArray24[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[106]];
                                                                    if (F.llIlllIIIIl(Inventory.contains((String[])stringArray24) ? 1 : 0)) {
                                                                        a.a(lIIIIlIIl[16], lIIIIlIIl[11]);
                                                                    }
                                                                    String[] stringArray25 = new String[lIIIIlIIl[1]];
                                                                    stringArray25[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[107]];
                                                                    if (F.llIllIlllll(Inventory.contains((String[])stringArray25) ? 1 : 0)) {
                                                                        String[] stringArray26 = new String[lIIIIlIIl[1]];
                                                                        stringArray26[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[108]];
                                                                        if (F.llIlllIIIII(Inventory.getFirst((String[])stringArray26).getQuantity(), lIIIIlIIl[11])) {
                                                                            String[] stringArray27 = new String[lIIIIlIIl[1]];
                                                                            stringArray27[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[110]];
                                                                            Bank.withdraw((String)lIIIIIlIl[lIIIIlIIl[109]], (int)(lIIIIlIIl[11] - Inventory.getFirst((String[])stringArray27).getQuantity()), (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                                                                            Time.sleepTicks((int)lIIIIlIIl[9]);
                                                                            0;
                                                                        }
                                                                    }
                                                                    String[] stringArray28 = new String[lIIIIlIIl[1]];
                                                                    stringArray28[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[111]];
                                                                    if (F.llIlllIIIIl(Inventory.contains((String[])stringArray28) ? 1 : 0)) {
                                                                        a.a(lIIIIlIIl[14], lIIIIlIIl[11]);
                                                                    }
                                                                    String[] stringArray29 = new String[lIIIIlIIl[1]];
                                                                    stringArray29[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[112]];
                                                                    if (F.llIllIlllll(Inventory.contains((String[])stringArray29) ? 1 : 0)) {
                                                                        String[] stringArray30 = new String[lIIIIlIIl[1]];
                                                                        stringArray30[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[113]];
                                                                        if (F.llIlllIIIII(Inventory.getFirst((String[])stringArray30).getQuantity(), lIIIIlIIl[11])) {
                                                                            String[] stringArray31 = new String[lIIIIlIIl[1]];
                                                                            stringArray31[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[115]];
                                                                            Bank.withdraw((String)lIIIIIlIl[lIIIIlIIl[114]], (int)(lIIIIlIIl[11] - Inventory.getFirst((String[])stringArray31).getQuantity()), (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                                                                            Time.sleepTicks((int)lIIIIlIIl[9]);
                                                                            0;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                int[] nArray = new int[lIIIIlIIl[1]];
                                                nArray[F.lIIIIlIIl[0]] = lIIIIlIIl[41];
                                                if (F.llIllIlllll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                                                    String[] stringArray = new String[lIIIIlIIl[1]];
                                                    stringArray[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[116]];
                                                    if (F.llIllIlllll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                                                        String[] stringArray32 = new String[lIIIIlIIl[1]];
                                                        stringArray32[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[117]];
                                                        if (F.llIlllIIIll(Inventory.getFirst((String[])stringArray32).getQuantity(), lIIIIlIIl[11])) {
                                                            String[] stringArray33 = new String[lIIIIlIIl[1]];
                                                            stringArray33[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[118]];
                                                            if (F.llIllIlllll(Inventory.contains((String[])stringArray33) ? 1 : 0)) {
                                                                String[] stringArray34 = new String[lIIIIlIIl[1]];
                                                                stringArray34[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[119]];
                                                                if (F.llIlllIIIll(Inventory.getFirst((String[])stringArray34).getQuantity(), lIIIIlIIl[11])) {
                                                                    String[] stringArray35 = new String[lIIIIlIIl[1]];
                                                                    stringArray35[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[120]];
                                                                    if (F.llIllIlllll(Inventory.contains((String[])stringArray35) ? 1 : 0)) {
                                                                        String[] stringArray36 = new String[lIIIIlIIl[1]];
                                                                        stringArray36[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[121]];
                                                                        if (F.llIlllIIIll(Inventory.getFirst((String[])stringArray36).getQuantity(), lIIIIlIIl[11])) {
                                                                            String[] stringArray37 = new String[lIIIIlIIl[1]];
                                                                            stringArray37[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[122]];
                                                                            if (F.llIllIlllll(Inventory.contains((String[])stringArray37) ? 1 : 0)) {
                                                                                String[] stringArray38 = new String[lIIIIlIIl[1]];
                                                                                stringArray38[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[123]];
                                                                                if (F.llIllIlllll(Inventory.contains((String[])stringArray38) ? 1 : 0) && F.llIlllIIIlI(Players.getLocal().getWorldLocation().distanceTo(gO), lIIIIlIIl[1])) {
                                                                                    if (F.llIlllIIIlI(Players.getLocal().getWorldLocation().distanceTo(gD), lIIIIlIIl[6]) && F.llIlllIIIlI(Players.getLocal().getWorldLocation().distanceTo(gC), lIIIIlIIl[6])) {
                                                                                        AccBuilderEasyClues.c = lIIIIIlIl[lIIIIlIIl[124]];
                                                                                        if (F.llIllIlllll(Dialog.isOpen() ? 1 : 0)) {
                                                                                            Dialog.close();
                                                                                        }
                                                                                        Movement.walkTo((WorldPoint)gO);
                                                                                        0;
                                                                                    }
                                                                                    if (F.llIlllIIllI(Players.getLocal().getWorldLocation().distanceTo(gD), lIIIIlIIl[7]) && F.llIlllIIIlI(Players.getLocal().getWorldLocation().distanceTo(gC), lIIIIlIIl[6])) {
                                                                                        String[] stringArray39 = new String[lIIIIlIIl[1]];
                                                                                        stringArray39[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[125]];
                                                                                        lIIlIIlIlIlIIll = Inventory.getFirst((String[])stringArray39);
                                                                                        String[] stringArray40 = new String[lIIIIlIIl[1]];
                                                                                        stringArray40[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[126]];
                                                                                        lIIlIIlIlIlIIlI = TileObjects.getNearest((String[])stringArray40);
                                                                                        AccBuilderEasyClues.c = lIIIIIlIl[lIIIIlIIl[127]];
                                                                                        if (F.llIlllIIlII(lIIlIIlIlIlIIll) && F.llIlllIIlII(lIIlIIlIlIlIIlI)) {
                                                                                            lIIlIIlIlIlIIll.useOn((TileObject)lIIlIIlIlIlIIlI);
                                                                                            Time.sleepUntil(() -> {
                                                                                                boolean bl;
                                                                                                if (F.llIlllIIllI(Players.getLocal().getWorldLocation().distanceTo(gC), lIIIIlIIl[6])) {
                                                                                                    bl = lIIIIlIIl[1];
                                                                                                    0;
                                                                                                    if ((0xBA ^ 0x84 ^ (0x63 ^ 0x58)) == 0) {
                                                                                                        return ((24 + 171 - 165 + 153 ^ 96 + 32 - 70 + 95) & (0xED ^ 0x81 ^ (0xC2 ^ 0x80) ^ -1)) != 0;
                                                                                                    }
                                                                                                } else {
                                                                                                    bl = lIIIIlIIl[0];
                                                                                                }
                                                                                                return bl;
                                                                                            }, (int)lIIIIlIIl[128]);
                                                                                            0;
                                                                                        }
                                                                                    }
                                                                                    if (F.llIlllIIllI(Players.getLocal().getWorldLocation().distanceTo(gC), lIIIIlIIl[6])) {
                                                                                        String[] stringArray41 = new String[lIIIIlIIl[1]];
                                                                                        stringArray41[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[129]];
                                                                                        lIIlIIlIlIlIIll = Inventory.getFirst((String[])stringArray41);
                                                                                        int[] nArray31 = new int[lIIIIlIIl[1]];
                                                                                        nArray31[F.lIIIIlIIl[0]] = lIIIIlIIl[130];
                                                                                        lIIlIIlIlIlIIlI = TileObjects.getNearest((int[])nArray31);
                                                                                        AccBuilderEasyClues.c = lIIIIIlIl[lIIIIlIIl[131]];
                                                                                        if (F.llIlllIIlII(lIIlIIlIlIlIIll) && F.llIlllIIlII(lIIlIIlIlIlIIlI)) {
                                                                                            lIIlIIlIlIlIIll.useOn((TileObject)lIIlIIlIlIlIIlI);
                                                                                            Time.sleepTicks((int)lIIIIlIIl[7]);
                                                                                            0;
                                                                                        }
                                                                                    }
                                                                                    if (F.llIllIlllll(Players.getLocal().getWorldLocation().equals((Object)gN) ? 1 : 0)) {
                                                                                        String[] stringArray42 = new String[lIIIIlIIl[1]];
                                                                                        stringArray42[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[132]];
                                                                                        lIIlIIlIlIlIIll = TileObjects.getNearest((String[])stringArray42);
                                                                                        AccBuilderEasyClues.c = lIIIIIlIl[lIIIIlIIl[133]];
                                                                                        if (F.llIlllIIlII(lIIlIIlIlIlIIll)) {
                                                                                            lIIlIIlIlIlIIll.interact(lIIIIIlIl[lIIIIlIIl[134]]);
                                                                                            Time.sleepTicks((int)lIIIIlIIl[3]);
                                                                                            0;
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            if (F.llIlllIIlll(e.j(lIIIIlIIl[10]), lIIIIlIIl[7])) {
                                                int[] nArray = new int[lIIIIlIIl[1]];
                                                nArray[F.lIIIIlIIl[0]] = lIIIIlIIl[41];
                                                if (F.llIllIlllll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                                                    String[] stringArray = new String[lIIIIlIIl[1]];
                                                    stringArray[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[135]];
                                                    if (F.llIllIlllll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                                                        String[] stringArray43 = new String[lIIIIlIIl[1]];
                                                        stringArray43[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[136]];
                                                        if (F.llIlllIIIll(Inventory.getFirst((String[])stringArray43).getQuantity(), lIIIIlIIl[11])) {
                                                            String[] stringArray44 = new String[lIIIIlIIl[1]];
                                                            stringArray44[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[137]];
                                                            if (F.llIllIlllll(Inventory.contains((String[])stringArray44) ? 1 : 0)) {
                                                                String[] stringArray45 = new String[lIIIIlIIl[1]];
                                                                stringArray45[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[138]];
                                                                if (F.llIlllIIIll(Inventory.getFirst((String[])stringArray45).getQuantity(), lIIIIlIIl[11])) {
                                                                    String[] stringArray46 = new String[lIIIIlIIl[1]];
                                                                    stringArray46[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[139]];
                                                                    if (F.llIllIlllll(Inventory.contains((String[])stringArray46) ? 1 : 0)) {
                                                                        String[] stringArray47 = new String[lIIIIlIIl[1]];
                                                                        stringArray47[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[140]];
                                                                        if (F.llIlllIIIll(Inventory.getFirst((String[])stringArray47).getQuantity(), lIIIIlIIl[11])) {
                                                                            String[] stringArray48 = new String[lIIIIlIIl[1]];
                                                                            stringArray48[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[141]];
                                                                            if (F.llIllIlllll(Inventory.contains((String[])stringArray48) ? 1 : 0)) {
                                                                                String[] stringArray49 = new String[lIIIIlIIl[1]];
                                                                                stringArray49[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[142]];
                                                                                if (F.llIllIlllll(Inventory.contains((String[])stringArray49) ? 1 : 0)) {
                                                                                    int[] nArray32 = new int[lIIIIlIIl[1]];
                                                                                    nArray32[F.lIIIIlIIl[0]] = lIIIIlIIl[143];
                                                                                    if (F.llIlllIIIII(Inventory.getCount((int[])nArray32), lIIIIlIIl[1]) && F.llIlllIIIIl(Players.getLocal().getWorldLocation().equals((Object)gN) ? 1 : 0)) {
                                                                                        AccBuilderEasyClues.c = lIIIIIlIl[lIIIIlIIl[144]];
                                                                                        if (F.llIlllIIIlI(Players.getLocal().getWorldLocation().distanceTo(gO), lIIIIlIIl[3])) {
                                                                                            Movement.walkTo((WorldPoint)gO);
                                                                                            0;
                                                                                        }
                                                                                        if (F.llIlllIIllI(Players.getLocal().getWorldLocation().distanceTo(gO), lIIIIlIIl[3])) {
                                                                                            int[] nArray33 = new int[lIIIIlIIl[1]];
                                                                                            nArray33[F.lIIIIlIIl[0]] = lIIIIlIIl[145];
                                                                                            lIIlIIlIlIlIIll = TileObjects.getNearest((int[])nArray33);
                                                                                            if (F.llIlllIIlII(lIIlIIlIlIlIIll)) {
                                                                                                lIIlIIlIlIlIIll.interact(lIIIIIlIl[lIIIIlIIl[146]]);
                                                                                                Time.sleepTicks((int)lIIIIlIIl[3]);
                                                                                                0;
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                int[] nArray34 = new int[lIIIIlIIl[1]];
                                                nArray34[F.lIIIIlIIl[0]] = lIIIIlIIl[41];
                                                if (F.llIllIlllll(Inventory.contains((int[])nArray34) ? 1 : 0)) {
                                                    String[] stringArray = new String[lIIIIlIIl[1]];
                                                    stringArray[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[147]];
                                                    if (F.llIllIlllll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                                                        String[] stringArray50 = new String[lIIIIlIIl[1]];
                                                        stringArray50[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[148]];
                                                        if (F.llIlllIIIll(Inventory.getFirst((String[])stringArray50).getQuantity(), lIIIIlIIl[11])) {
                                                            String[] stringArray51 = new String[lIIIIlIIl[1]];
                                                            stringArray51[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[149]];
                                                            if (F.llIllIlllll(Inventory.contains((String[])stringArray51) ? 1 : 0)) {
                                                                String[] stringArray52 = new String[lIIIIlIIl[1]];
                                                                stringArray52[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[150]];
                                                                if (F.llIlllIIIll(Inventory.getFirst((String[])stringArray52).getQuantity(), lIIIIlIIl[11])) {
                                                                    String[] stringArray53 = new String[lIIIIlIIl[1]];
                                                                    stringArray53[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[151]];
                                                                    if (F.llIllIlllll(Inventory.contains((String[])stringArray53) ? 1 : 0)) {
                                                                        String[] stringArray54 = new String[lIIIIlIIl[1]];
                                                                        stringArray54[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[152]];
                                                                        if (F.llIlllIIIll(Inventory.getFirst((String[])stringArray54).getQuantity(), lIIIIlIIl[11])) {
                                                                            String[] stringArray55 = new String[lIIIIlIIl[1]];
                                                                            stringArray55[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[153]];
                                                                            if (F.llIllIlllll(Inventory.contains((String[])stringArray55) ? 1 : 0)) {
                                                                                String[] stringArray56 = new String[lIIIIlIIl[1]];
                                                                                stringArray56[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[154]];
                                                                                if (F.llIllIlllll(Inventory.contains((String[])stringArray56) ? 1 : 0)) {
                                                                                    int[] nArray35 = new int[lIIIIlIIl[1]];
                                                                                    nArray35[F.lIIIIlIIl[0]] = lIIIIlIIl[143];
                                                                                    if (F.llIlllIIlIl(Inventory.getCount((int[])nArray35)) && F.llIlllIIIlI(Players.getLocal().getWorldLocation().distanceTo(gP), lIIIIlIIl[3]) && F.llIlllIIIlI(Players.getLocal().getWorldLocation().distanceTo(gQ), lIIIIlIIl[5])) {
                                                                                        AccBuilderEasyClues.c = lIIIIIlIl[lIIIIlIIl[155]];
                                                                                        Movement.walkTo((WorldPoint)gP);
                                                                                        0;
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                int[] nArray36 = new int[lIIIIlIIl[1]];
                                                nArray36[F.lIIIIlIIl[0]] = lIIIIlIIl[41];
                                                if (F.llIllIlllll(Inventory.contains((int[])nArray36) ? 1 : 0)) {
                                                    String[] stringArray = new String[lIIIIlIIl[1]];
                                                    stringArray[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[156]];
                                                    if (F.llIllIlllll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                                                        String[] stringArray57 = new String[lIIIIlIIl[1]];
                                                        stringArray57[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[157]];
                                                        if (F.llIlllIIIll(Inventory.getFirst((String[])stringArray57).getQuantity(), lIIIIlIIl[11])) {
                                                            String[] stringArray58 = new String[lIIIIlIIl[1]];
                                                            stringArray58[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[158]];
                                                            if (F.llIllIlllll(Inventory.contains((String[])stringArray58) ? 1 : 0)) {
                                                                String[] stringArray59 = new String[lIIIIlIIl[1]];
                                                                stringArray59[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[159]];
                                                                if (F.llIlllIIIll(Inventory.getFirst((String[])stringArray59).getQuantity(), lIIIIlIIl[11])) {
                                                                    String[] stringArray60 = new String[lIIIIlIIl[1]];
                                                                    stringArray60[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[160]];
                                                                    if (F.llIllIlllll(Inventory.contains((String[])stringArray60) ? 1 : 0)) {
                                                                        String[] stringArray61 = new String[lIIIIlIIl[1]];
                                                                        stringArray61[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[161]];
                                                                        if (F.llIlllIIIll(Inventory.getFirst((String[])stringArray61).getQuantity(), lIIIIlIIl[11])) {
                                                                            String[] stringArray62 = new String[lIIIIlIIl[1]];
                                                                            stringArray62[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[162]];
                                                                            if (F.llIllIlllll(Inventory.contains((String[])stringArray62) ? 1 : 0)) {
                                                                                String[] stringArray63 = new String[lIIIIlIIl[1]];
                                                                                stringArray63[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[163]];
                                                                                if (F.llIllIlllll(Inventory.contains((String[])stringArray63) ? 1 : 0)) {
                                                                                    int[] nArray37 = new int[lIIIIlIIl[1]];
                                                                                    nArray37[F.lIIIIlIIl[0]] = lIIIIlIIl[143];
                                                                                    if (F.llIlllIIlIl(Inventory.getCount((int[])nArray37)) && F.llIlllIIllI(Players.getLocal().getWorldLocation().distanceTo(gP), lIIIIlIIl[5])) {
                                                                                        int[] nArray38 = new int[lIIIIlIIl[1]];
                                                                                        nArray38[F.lIIIIlIIl[0]] = lIIIIlIIl[143];
                                                                                        lIIlIIlIlIlIIll = Inventory.getFirst((int[])nArray38);
                                                                                        String[] stringArray64 = new String[lIIIIlIIl[1]];
                                                                                        stringArray64[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[164]];
                                                                                        lIIlIIlIlIlIIlI = TileObjects.getNearest((String[])stringArray64);
                                                                                        if (F.llIlllIIlII(lIIlIIlIlIlIIll) && F.llIlllIIlII(lIIlIIlIlIlIIlI)) {
                                                                                            lIIlIIlIlIlIIll.useOn((TileObject)lIIlIIlIlIlIIlI);
                                                                                            Time.sleepUntil(() -> Players.getLocal().getWorldLocation().equals((Object)gN), (int)lIIIIlIIl[165]);
                                                                                            0;
                                                                                        }
                                                                                        while (F.llIlllIIIlI(Players.getLocal().getWorldLocation().distanceTo(gQ), lIIIIlIIl[3])) {
                                                                                            Movement.walkTo((WorldPoint)gQ);
                                                                                            0;
                                                                                            Time.sleepTicks((int)lIIIIlIIl[1]);
                                                                                            0;
                                                                                            0;
                                                                                            if (((1 ^ (0x95 ^ 0x99)) & (110 + 93 - 61 + 18 ^ 26 + 65 - 58 + 140 ^ -1)) == 0) continue;
                                                                                            return;
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                int[] nArray39 = new int[lIIIIlIIl[1]];
                                                nArray39[F.lIIIIlIIl[0]] = lIIIIlIIl[41];
                                                if (F.llIllIlllll(Inventory.contains((int[])nArray39) ? 1 : 0)) {
                                                    String[] stringArray = new String[lIIIIlIIl[1]];
                                                    stringArray[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[166]];
                                                    if (F.llIllIlllll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                                                        String[] stringArray65 = new String[lIIIIlIIl[1]];
                                                        stringArray65[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[167]];
                                                        if (F.llIlllIIIll(Inventory.getFirst((String[])stringArray65).getQuantity(), lIIIIlIIl[11])) {
                                                            String[] stringArray66 = new String[lIIIIlIIl[1]];
                                                            stringArray66[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[168]];
                                                            if (F.llIllIlllll(Inventory.contains((String[])stringArray66) ? 1 : 0)) {
                                                                String[] stringArray67 = new String[lIIIIlIIl[1]];
                                                                stringArray67[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[169]];
                                                                if (F.llIlllIIIll(Inventory.getFirst((String[])stringArray67).getQuantity(), lIIIIlIIl[11])) {
                                                                    String[] stringArray68 = new String[lIIIIlIIl[1]];
                                                                    stringArray68[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[170]];
                                                                    if (F.llIllIlllll(Inventory.contains((String[])stringArray68) ? 1 : 0)) {
                                                                        String[] stringArray69 = new String[lIIIIlIIl[1]];
                                                                        stringArray69[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[171]];
                                                                        if (F.llIlllIIIll(Inventory.getFirst((String[])stringArray69).getQuantity(), lIIIIlIIl[11])) {
                                                                            String[] stringArray70 = new String[lIIIIlIIl[1]];
                                                                            stringArray70[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[172]];
                                                                            if (F.llIllIlllll(Inventory.contains((String[])stringArray70) ? 1 : 0)) {
                                                                                String[] stringArray71 = new String[lIIIIlIIl[1]];
                                                                                stringArray71[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[173]];
                                                                                if (F.llIllIlllll(Inventory.contains((String[])stringArray71) ? 1 : 0)) {
                                                                                    int[] nArray40 = new int[lIIIIlIIl[1]];
                                                                                    nArray40[F.lIIIIlIIl[0]] = lIIIIlIIl[143];
                                                                                    if (F.llIlllIIlIl(Inventory.getCount((int[])nArray40)) && F.llIlllIIllI(Players.getLocal().getWorldLocation().distanceTo(gQ), lIIIIlIIl[5])) {
                                                                                        int[] nArray41 = new int[lIIIIlIIl[1]];
                                                                                        nArray41[F.lIIIIlIIl[0]] = lIIIIlIIl[143];
                                                                                        lIIlIIlIlIlIIll = Inventory.getFirst((int[])nArray41);
                                                                                        String[] stringArray72 = new String[lIIIIlIIl[1]];
                                                                                        stringArray72[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[174]];
                                                                                        lIIlIIlIlIlIIlI = TileObjects.getNearest((String[])stringArray72);
                                                                                        if (F.llIlllIIlII(lIIlIIlIlIlIIll) && F.llIlllIIlII(lIIlIIlIlIlIIlI)) {
                                                                                            lIIlIIlIlIlIIlI.interact(lIIIIIlIl[lIIIIlIIl[175]]);
                                                                                            Time.sleepUntil(() -> Players.getLocal().getWorldLocation().equals((Object)gN), (int)lIIIIlIIl[165]);
                                                                                            0;
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            if (!F.llIlllIIlll(e.j(lIIIIlIIl[10]), lIIIIlIIl[11])) break block270;
                                            int[] nArray = new int[lIIIIlIIl[1]];
                                            nArray[F.lIIIIlIIl[0]] = lIIIIlIIl[41];
                                            if (F.llIllIlllll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                                                String[] stringArray = new String[lIIIIlIIl[1]];
                                                stringArray[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[176]];
                                                if (F.llIllIlllll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                                                    String[] stringArray73 = new String[lIIIIlIIl[1]];
                                                    stringArray73[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[177]];
                                                    if (F.llIlllIIIll(Inventory.getFirst((String[])stringArray73).getQuantity(), lIIIIlIIl[11])) {
                                                        String[] stringArray74 = new String[lIIIIlIIl[1]];
                                                        stringArray74[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[178]];
                                                        if (F.llIllIlllll(Inventory.contains((String[])stringArray74) ? 1 : 0)) {
                                                            String[] stringArray75 = new String[lIIIIlIIl[1]];
                                                            stringArray75[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[179]];
                                                            if (F.llIlllIIIll(Inventory.getFirst((String[])stringArray75).getQuantity(), lIIIIlIIl[11])) {
                                                                String[] stringArray76 = new String[lIIIIlIIl[1]];
                                                                stringArray76[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[180]];
                                                                if (F.llIllIlllll(Inventory.contains((String[])stringArray76) ? 1 : 0)) {
                                                                    String[] stringArray77 = new String[lIIIIlIIl[1]];
                                                                    stringArray77[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[181]];
                                                                    if (F.llIlllIIIll(Inventory.getFirst((String[])stringArray77).getQuantity(), lIIIIlIIl[11])) {
                                                                        String[] stringArray78 = new String[lIIIIlIIl[1]];
                                                                        stringArray78[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[182]];
                                                                        if (F.llIllIlllll(Inventory.contains((String[])stringArray78) ? 1 : 0)) {
                                                                            String[] stringArray79 = new String[lIIIIlIIl[1]];
                                                                            stringArray79[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[183]];
                                                                            if (F.llIllIlllll(Inventory.contains((String[])stringArray79) ? 1 : 0)) {
                                                                                int[] nArray42 = new int[lIIIIlIIl[1]];
                                                                                nArray42[F.lIIIIlIIl[0]] = lIIIIlIIl[143];
                                                                                if (F.llIlllIIlIl(Inventory.getCount((int[])nArray42)) && F.llIllIlllll(gf.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && F.llIlllIIIlI(Players.getLocal().getWorldLocation().distanceTo(gW), lIIIIlIIl[1])) {
                                                                                    AccBuilderEasyClues.c = lIIIIIlIl[lIIIIlIIl[184]];
                                                                                    Movement.walkTo((WorldPoint)gW);
                                                                                    0;
                                                                                    Time.sleepTicks((int)lIIIIlIIl[6]);
                                                                                    0;
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            int[] nArray43 = new int[lIIIIlIIl[1]];
                                            nArray43[F.lIIIIlIIl[0]] = lIIIIlIIl[41];
                                            if (!F.llIllIlllll(Inventory.contains((int[])nArray43) ? 1 : 0)) break block248;
                                            String[] stringArray = new String[lIIIIlIIl[1]];
                                            stringArray[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[185]];
                                            if (!F.llIllIlllll(Inventory.contains((String[])stringArray) ? 1 : 0)) break block248;
                                            String[] stringArray80 = new String[lIIIIlIIl[1]];
                                            stringArray80[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[186]];
                                            if (!F.llIlllIIIll(Inventory.getFirst((String[])stringArray80).getQuantity(), lIIIIlIIl[11])) break block248;
                                            String[] stringArray81 = new String[lIIIIlIIl[1]];
                                            stringArray81[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[187]];
                                            if (!F.llIllIlllll(Inventory.contains((String[])stringArray81) ? 1 : 0)) break block248;
                                            String[] stringArray82 = new String[lIIIIlIIl[1]];
                                            stringArray82[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[188]];
                                            if (!F.llIlllIIIll(Inventory.getFirst((String[])stringArray82).getQuantity(), lIIIIlIIl[11])) break block248;
                                            String[] stringArray83 = new String[lIIIIlIIl[1]];
                                            stringArray83[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[189]];
                                            if (!F.llIllIlllll(Inventory.contains((String[])stringArray83) ? 1 : 0)) break block248;
                                            String[] stringArray84 = new String[lIIIIlIIl[1]];
                                            stringArray84[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[190]];
                                            if (!F.llIlllIIIll(Inventory.getFirst((String[])stringArray84).getQuantity(), lIIIIlIIl[11])) break block248;
                                            String[] stringArray85 = new String[lIIIIlIIl[1]];
                                            stringArray85[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[191]];
                                            if (!F.llIllIlllll(Inventory.contains((String[])stringArray85) ? 1 : 0)) break block248;
                                            String[] stringArray86 = new String[lIIIIlIIl[1]];
                                            stringArray86[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[192]];
                                            if (!F.llIllIlllll(Inventory.contains((String[])stringArray86) ? 1 : 0)) break block248;
                                            int[] nArray44 = new int[lIIIIlIIl[1]];
                                            nArray44[F.lIIIIlIIl[0]] = lIIIIlIIl[143];
                                            if (!F.llIlllIIlIl(Inventory.getCount((int[])nArray44)) || !F.llIllIlllll(gf.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || !F.llIlllIIllI(Players.getLocal().getWorldLocation().distanceTo(gW), lIIIIlIIl[3])) break block248;
                                            AccBuilderEasyClues.c = lIIIIIlIl[lIIIIlIIl[193]];
                                            do {
                                                block272: {
                                                    block273: {
                                                        block271: {
                                                            String[] stringArray87 = new String[lIIIIlIIl[1]];
                                                            stringArray87[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[194]];
                                                            if (!F.llIllIlllll(Inventory.contains((String[])stringArray87) ? 1 : 0)) break block271;
                                                            String[] stringArray88 = new String[lIIIIlIIl[1]];
                                                            stringArray88[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[195]];
                                                            if (!F.llIlllIIIII(Inventory.getFirst((String[])stringArray88).getQuantity(), lIIIIlIIl[11])) break block272;
                                                        }
                                                        String[] stringArray89 = new String[lIIIIlIIl[1]];
                                                        stringArray89[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[196]];
                                                        if (!F.llIllIlllll(Inventory.contains((String[])stringArray89) ? 1 : 0)) break block273;
                                                        String[] stringArray90 = new String[lIIIIlIIl[1]];
                                                        stringArray90[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[197]];
                                                        if (!F.llIlllIIIII(Inventory.getFirst((String[])stringArray90).getQuantity(), lIIIIlIIl[11])) break block272;
                                                    }
                                                    String[] stringArray91 = new String[lIIIIlIIl[1]];
                                                    stringArray91[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[198]];
                                                    if (!F.llIllIlllll(Inventory.contains((String[])stringArray91) ? 1 : 0)) break block248;
                                                    String[] stringArray92 = new String[lIIIIlIIl[1]];
                                                    stringArray92[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[199]];
                                                    if (!F.llIlllIIIll(Inventory.getFirst((String[])stringArray92).getQuantity(), lIIIIlIIl[11])) break block248;
                                                }
                                                if (!F.llIlllIIIIl(AccBuilderEasyClues.d ? 1 : 0)) break block248;
                                                int[] nArray45 = new int[lIIIIlIIl[1]];
                                                nArray45[F.lIIIIlIIl[0]] = lIIIIlIIl[200];
                                                lIIlIIlIlIlIIll = TileObjects.getFirstAt((WorldPoint)gg, (int[])nArray45);
                                                String[] stringArray93 = new String[lIIIIlIIl[1]];
                                                stringArray93[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[201]];
                                                Inventory.getFirst((String[])stringArray93).useOn((TileObject)lIIlIIlIlIlIIll);
                                                Time.sleepTicks((int)lIIIIlIIl[1]);
                                                0;
                                                String[] stringArray94 = new String[lIIIIlIIl[1]];
                                                stringArray94[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[202]];
                                                Inventory.getFirst((String[])stringArray94).useOn((TileObject)lIIlIIlIlIlIIll);
                                                Time.sleepTicks((int)lIIIIlIIl[1]);
                                                0;
                                                String[] stringArray95 = new String[lIIIIlIIl[1]];
                                                stringArray95[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[203]];
                                                Inventory.getFirst((String[])stringArray95).useOn((TileObject)lIIlIIlIlIlIIll);
                                                Time.sleepTicks((int)lIIIIlIIl[1]);
                                                0;
                                                0;
                                            } while ((0 ^ 4) != -1);
                                            return;
                                        }
                                        int[] nArray = new int[lIIIIlIIl[1]];
                                        nArray[F.lIIIIlIIl[0]] = lIIIIlIIl[41];
                                        if (!F.llIllIlllll(Inventory.contains((int[])nArray) ? 1 : 0)) break block249;
                                        String[] stringArray = new String[lIIIIlIIl[1]];
                                        stringArray[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[204]];
                                        if (!F.llIllIlllll(Inventory.contains((String[])stringArray) ? 1 : 0)) break block249;
                                        String[] stringArray96 = new String[lIIIIlIIl[1]];
                                        stringArray96[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[205]];
                                        if (!F.llIlllIIlll(Inventory.getFirst((String[])stringArray96).getQuantity(), lIIIIlIIl[7])) break block249;
                                        String[] stringArray97 = new String[lIIIIlIIl[1]];
                                        stringArray97[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[206]];
                                        if (!F.llIllIlllll(Inventory.contains((String[])stringArray97) ? 1 : 0)) break block249;
                                        String[] stringArray98 = new String[lIIIIlIIl[1]];
                                        stringArray98[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[207]];
                                        if (!F.llIlllIIlll(Inventory.getFirst((String[])stringArray98).getQuantity(), lIIIIlIIl[7])) break block249;
                                        String[] stringArray99 = new String[lIIIIlIIl[1]];
                                        stringArray99[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[208]];
                                        if (!F.llIllIlllll(Inventory.contains((String[])stringArray99) ? 1 : 0)) break block249;
                                        String[] stringArray100 = new String[lIIIIlIIl[1]];
                                        stringArray100[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[209]];
                                        if (!F.llIlllIIlll(Inventory.getFirst((String[])stringArray100).getQuantity(), lIIIIlIIl[7])) break block249;
                                        String[] stringArray101 = new String[lIIIIlIIl[1]];
                                        stringArray101[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[210]];
                                        if (!F.llIllIlllll(Inventory.contains((String[])stringArray101) ? 1 : 0)) break block249;
                                        String[] stringArray102 = new String[lIIIIlIIl[1]];
                                        stringArray102[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[211]];
                                        if (!F.llIllIlllll(Inventory.contains((String[])stringArray102) ? 1 : 0)) break block249;
                                        int[] nArray46 = new int[lIIIIlIIl[1]];
                                        nArray46[F.lIIIIlIIl[0]] = lIIIIlIIl[143];
                                        if (!F.llIlllIIlIl(Inventory.getCount((int[])nArray46)) || !F.llIllIlllll(gf.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || !F.llIlllIIIlI(Players.getLocal().getWorldLocation().distanceTo(gV), lIIIIlIIl[1])) break block249;
                                        AccBuilderEasyClues.c = lIIIIIlIl[lIIIIlIIl[212]];
                                        while (true) {
                                            block275: {
                                                block276: {
                                                    block274: {
                                                        String[] stringArray103 = new String[lIIIIlIIl[1]];
                                                        stringArray103[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[213]];
                                                        if (!F.llIllIlllll(Inventory.contains((String[])stringArray103) ? 1 : 0)) break block274;
                                                        String[] stringArray104 = new String[lIIIIlIIl[1]];
                                                        stringArray104[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[214]];
                                                        if (!F.llIlllIlIII(Inventory.getFirst((String[])stringArray104).getQuantity(), lIIIIlIIl[7])) break block275;
                                                    }
                                                    String[] stringArray105 = new String[lIIIIlIIl[1]];
                                                    stringArray105[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[215]];
                                                    if (!F.llIllIlllll(Inventory.contains((String[])stringArray105) ? 1 : 0)) break block276;
                                                    String[] stringArray106 = new String[lIIIIlIIl[1]];
                                                    stringArray106[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[216]];
                                                    if (!F.llIlllIlIII(Inventory.getFirst((String[])stringArray106).getQuantity(), lIIIIlIIl[7])) break block275;
                                                }
                                                String[] stringArray107 = new String[lIIIIlIIl[1]];
                                                stringArray107[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[217]];
                                                if (!F.llIllIlllll(Inventory.contains((String[])stringArray107) ? 1 : 0)) break block249;
                                                String[] stringArray108 = new String[lIIIIlIIl[1]];
                                                stringArray108[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[218]];
                                                if (!F.llIlllIIlll(Inventory.getFirst((String[])stringArray108).getQuantity(), lIIIIlIIl[7])) break block249;
                                            }
                                            if (!F.llIlllIIIIl(AccBuilderEasyClues.d ? 1 : 0)) break block249;
                                            if (F.llIlllIIIIl(Players.getLocal().getWorldLocation().equals((Object)gV) ? 1 : 0)) {
                                                Movement.walkTo((WorldPoint)gV);
                                                0;
                                                Time.sleepTicks((int)lIIIIlIIl[5]);
                                                0;
                                            }
                                            if (!F.llIllIlllll(Players.getLocal().getWorldLocation().equals((Object)gV) ? 1 : 0)) continue;
                                            int[] nArray47 = new int[lIIIIlIIl[1]];
                                            nArray47[F.lIIIIlIIl[0]] = lIIIIlIIl[200];
                                            lIIlIIlIlIlIIll = TileObjects.getFirstAt((WorldPoint)gh, (int[])nArray47);
                                            String[] stringArray109 = new String[lIIIIlIIl[1]];
                                            stringArray109[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[219]];
                                            Inventory.getFirst((String[])stringArray109).useOn((TileObject)lIIlIIlIlIlIIll);
                                            Time.sleepTicks((int)lIIIIlIIl[1]);
                                            0;
                                            String[] stringArray110 = new String[lIIIIlIIl[1]];
                                            stringArray110[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[220]];
                                            Inventory.getFirst((String[])stringArray110).useOn((TileObject)lIIlIIlIlIlIIll);
                                            Time.sleepTicks((int)lIIIIlIIl[1]);
                                            0;
                                            String[] stringArray111 = new String[lIIIIlIIl[1]];
                                            stringArray111[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[221]];
                                            Inventory.getFirst((String[])stringArray111).useOn((TileObject)lIIlIIlIlIlIIll);
                                            Time.sleepTicks((int)lIIIIlIIl[1]);
                                            0;
                                            0;
                                            if (3 == 0) break;
                                        }
                                        return;
                                    }
                                    int[] nArray = new int[lIIIIlIIl[1]];
                                    nArray[F.lIIIIlIIl[0]] = lIIIIlIIl[41];
                                    if (!F.llIllIlllll(Inventory.contains((int[])nArray) ? 1 : 0)) break block250;
                                    String[] stringArray = new String[lIIIIlIIl[1]];
                                    stringArray[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[222]];
                                    if (!F.llIllIlllll(Inventory.contains((String[])stringArray) ? 1 : 0)) break block250;
                                    String[] stringArray112 = new String[lIIIIlIIl[1]];
                                    stringArray112[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[223]];
                                    if (!F.llIlllIIlll(Inventory.getFirst((String[])stringArray112).getQuantity(), lIIIIlIIl[6])) break block250;
                                    String[] stringArray113 = new String[lIIIIlIIl[1]];
                                    stringArray113[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[224]];
                                    if (!F.llIllIlllll(Inventory.contains((String[])stringArray113) ? 1 : 0)) break block250;
                                    String[] stringArray114 = new String[lIIIIlIIl[1]];
                                    stringArray114[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[225]];
                                    if (!F.llIlllIIlll(Inventory.getFirst((String[])stringArray114).getQuantity(), lIIIIlIIl[6])) break block250;
                                    String[] stringArray115 = new String[lIIIIlIIl[1]];
                                    stringArray115[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[226]];
                                    if (!F.llIllIlllll(Inventory.contains((String[])stringArray115) ? 1 : 0)) break block250;
                                    String[] stringArray116 = new String[lIIIIlIIl[1]];
                                    stringArray116[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[227]];
                                    if (!F.llIlllIIlll(Inventory.getFirst((String[])stringArray116).getQuantity(), lIIIIlIIl[6])) break block250;
                                    String[] stringArray117 = new String[lIIIIlIIl[1]];
                                    stringArray117[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[228]];
                                    if (!F.llIllIlllll(Inventory.contains((String[])stringArray117) ? 1 : 0)) break block250;
                                    String[] stringArray118 = new String[lIIIIlIIl[1]];
                                    stringArray118[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[229]];
                                    if (!F.llIllIlllll(Inventory.contains((String[])stringArray118) ? 1 : 0)) break block250;
                                    int[] nArray48 = new int[lIIIIlIIl[1]];
                                    nArray48[F.lIIIIlIIl[0]] = lIIIIlIIl[143];
                                    if (!F.llIlllIIlIl(Inventory.getCount((int[])nArray48)) || !F.llIllIlllll(gf.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block250;
                                    AccBuilderEasyClues.c = lIIIIIlIl[lIIIIlIIl[230]];
                                    while (true) {
                                        block278: {
                                            block279: {
                                                block277: {
                                                    String[] stringArray119 = new String[lIIIIlIIl[1]];
                                                    stringArray119[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[231]];
                                                    if (!F.llIllIlllll(Inventory.contains((String[])stringArray119) ? 1 : 0)) break block277;
                                                    String[] stringArray120 = new String[lIIIIlIIl[1]];
                                                    stringArray120[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[232]];
                                                    if (!F.llIlllIlIII(Inventory.getFirst((String[])stringArray120).getQuantity(), lIIIIlIIl[6])) break block278;
                                                }
                                                String[] stringArray121 = new String[lIIIIlIIl[1]];
                                                stringArray121[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[233]];
                                                if (!F.llIllIlllll(Inventory.contains((String[])stringArray121) ? 1 : 0)) break block279;
                                                String[] stringArray122 = new String[lIIIIlIIl[1]];
                                                stringArray122[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[234]];
                                                if (!F.llIlllIlIII(Inventory.getFirst((String[])stringArray122).getQuantity(), lIIIIlIIl[6])) break block278;
                                            }
                                            String[] stringArray123 = new String[lIIIIlIIl[1]];
                                            stringArray123[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[235]];
                                            if (!F.llIllIlllll(Inventory.contains((String[])stringArray123) ? 1 : 0)) break block250;
                                            String[] stringArray124 = new String[lIIIIlIIl[1]];
                                            stringArray124[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[236]];
                                            if (!F.llIlllIIlll(Inventory.getFirst((String[])stringArray124).getQuantity(), lIIIIlIIl[6])) break block250;
                                        }
                                        if (!F.llIlllIIIIl(AccBuilderEasyClues.d ? 1 : 0)) break block250;
                                        if (F.llIlllIIIIl(Players.getLocal().getWorldLocation().equals((Object)gU) ? 1 : 0)) {
                                            Movement.walkTo((WorldPoint)gU);
                                            0;
                                            Time.sleepTicks((int)lIIIIlIIl[5]);
                                            0;
                                        }
                                        if (!F.llIllIlllll(Players.getLocal().getWorldLocation().equals((Object)gU) ? 1 : 0)) continue;
                                        int[] nArray49 = new int[lIIIIlIIl[1]];
                                        nArray49[F.lIIIIlIIl[0]] = lIIIIlIIl[200];
                                        lIIlIIlIlIlIIll = TileObjects.getFirstAt((WorldPoint)gi, (int[])nArray49);
                                        String[] stringArray125 = new String[lIIIIlIIl[1]];
                                        stringArray125[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[237]];
                                        Inventory.getFirst((String[])stringArray125).useOn((TileObject)lIIlIIlIlIlIIll);
                                        Time.sleepTicks((int)lIIIIlIIl[1]);
                                        0;
                                        String[] stringArray126 = new String[lIIIIlIIl[1]];
                                        stringArray126[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[238]];
                                        Inventory.getFirst((String[])stringArray126).useOn((TileObject)lIIlIIlIlIlIIll);
                                        Time.sleepTicks((int)lIIIIlIIl[1]);
                                        0;
                                        String[] stringArray127 = new String[lIIIIlIIl[1]];
                                        stringArray127[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[239]];
                                        Inventory.getFirst((String[])stringArray127).useOn((TileObject)lIIlIIlIlIlIIll);
                                        Time.sleepTicks((int)lIIIIlIIl[1]);
                                        0;
                                        0;
                                        if (1 == 2) break;
                                    }
                                    return;
                                }
                                int[] nArray = new int[lIIIIlIIl[1]];
                                nArray[F.lIIIIlIIl[0]] = lIIIIlIIl[41];
                                if (!F.llIllIlllll(Inventory.contains((int[])nArray) ? 1 : 0)) break block251;
                                String[] stringArray = new String[lIIIIlIIl[1]];
                                stringArray[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[240]];
                                if (!F.llIllIlllll(Inventory.contains((String[])stringArray) ? 1 : 0)) break block251;
                                String[] stringArray128 = new String[lIIIIlIIl[1]];
                                stringArray128[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[241]];
                                if (!F.llIlllIIlll(Inventory.getFirst((String[])stringArray128).getQuantity(), lIIIIlIIl[5])) break block251;
                                String[] stringArray129 = new String[lIIIIlIIl[1]];
                                stringArray129[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[242]];
                                if (!F.llIllIlllll(Inventory.contains((String[])stringArray129) ? 1 : 0)) break block251;
                                String[] stringArray130 = new String[lIIIIlIIl[1]];
                                stringArray130[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[243]];
                                if (!F.llIlllIIlll(Inventory.getFirst((String[])stringArray130).getQuantity(), lIIIIlIIl[5])) break block251;
                                String[] stringArray131 = new String[lIIIIlIIl[1]];
                                stringArray131[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[244]];
                                if (!F.llIllIlllll(Inventory.contains((String[])stringArray131) ? 1 : 0)) break block251;
                                String[] stringArray132 = new String[lIIIIlIIl[1]];
                                stringArray132[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[245]];
                                if (!F.llIlllIIlll(Inventory.getFirst((String[])stringArray132).getQuantity(), lIIIIlIIl[5])) break block251;
                                String[] stringArray133 = new String[lIIIIlIIl[1]];
                                stringArray133[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[246]];
                                if (!F.llIllIlllll(Inventory.contains((String[])stringArray133) ? 1 : 0)) break block251;
                                String[] stringArray134 = new String[lIIIIlIIl[1]];
                                stringArray134[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[247]];
                                if (!F.llIllIlllll(Inventory.contains((String[])stringArray134) ? 1 : 0)) break block251;
                                int[] nArray50 = new int[lIIIIlIIl[1]];
                                nArray50[F.lIIIIlIIl[0]] = lIIIIlIIl[143];
                                if (!F.llIlllIIlIl(Inventory.getCount((int[])nArray50)) || !F.llIllIlllll(gf.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block251;
                                AccBuilderEasyClues.c = lIIIIIlIl[lIIIIlIIl[248]];
                                while (true) {
                                    block281: {
                                        block282: {
                                            block280: {
                                                String[] stringArray135 = new String[lIIIIlIIl[1]];
                                                stringArray135[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[249]];
                                                if (!F.llIllIlllll(Inventory.contains((String[])stringArray135) ? 1 : 0)) break block280;
                                                String[] stringArray136 = new String[lIIIIlIIl[1]];
                                                stringArray136[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[250]];
                                                if (!F.llIlllIlIII(Inventory.getFirst((String[])stringArray136).getQuantity(), lIIIIlIIl[5])) break block281;
                                            }
                                            String[] stringArray137 = new String[lIIIIlIIl[1]];
                                            stringArray137[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[251]];
                                            if (!F.llIllIlllll(Inventory.contains((String[])stringArray137) ? 1 : 0)) break block282;
                                            String[] stringArray138 = new String[lIIIIlIIl[1]];
                                            stringArray138[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[252]];
                                            if (!F.llIlllIlIII(Inventory.getFirst((String[])stringArray138).getQuantity(), lIIIIlIIl[5])) break block281;
                                        }
                                        String[] stringArray139 = new String[lIIIIlIIl[1]];
                                        stringArray139[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[8]];
                                        if (!F.llIllIlllll(Inventory.contains((String[])stringArray139) ? 1 : 0)) break block251;
                                        String[] stringArray140 = new String[lIIIIlIIl[1]];
                                        stringArray140[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[253]];
                                        if (!F.llIlllIIlll(Inventory.getFirst((String[])stringArray140).getQuantity(), lIIIIlIIl[5])) break block251;
                                    }
                                    if (!F.llIlllIIIIl(AccBuilderEasyClues.d ? 1 : 0)) break block251;
                                    if (F.llIlllIIIIl(Players.getLocal().getWorldLocation().equals((Object)gT) ? 1 : 0)) {
                                        Movement.walkTo((WorldPoint)gT);
                                        0;
                                        Time.sleepTicks((int)lIIIIlIIl[5]);
                                        0;
                                    }
                                    if (!F.llIllIlllll(Players.getLocal().getWorldLocation().equals((Object)gT) ? 1 : 0)) continue;
                                    int[] nArray51 = new int[lIIIIlIIl[1]];
                                    nArray51[F.lIIIIlIIl[0]] = lIIIIlIIl[200];
                                    lIIlIIlIlIlIIll = TileObjects.getFirstAt((WorldPoint)gj, (int[])nArray51);
                                    String[] stringArray141 = new String[lIIIIlIIl[1]];
                                    stringArray141[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[254]];
                                    Inventory.getFirst((String[])stringArray141).useOn((TileObject)lIIlIIlIlIlIIll);
                                    Time.sleepTicks((int)lIIIIlIIl[1]);
                                    0;
                                    String[] stringArray142 = new String[lIIIIlIIl[1]];
                                    stringArray142[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[255]];
                                    Inventory.getFirst((String[])stringArray142).useOn((TileObject)lIIlIIlIlIlIIll);
                                    Time.sleepTicks((int)lIIIIlIIl[1]);
                                    0;
                                    String[] stringArray143 = new String[lIIIIlIIl[1]];
                                    stringArray143[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[256]];
                                    Inventory.getFirst((String[])stringArray143).useOn((TileObject)lIIlIIlIlIlIIll);
                                    Time.sleepTicks((int)lIIIIlIIl[1]);
                                    0;
                                    0;
                                    if (2 <= -1) break;
                                }
                                return;
                            }
                            int[] nArray = new int[lIIIIlIIl[1]];
                            nArray[F.lIIIIlIIl[0]] = lIIIIlIIl[41];
                            if (!F.llIllIlllll(Inventory.contains((int[])nArray) ? 1 : 0)) break block252;
                            String[] stringArray = new String[lIIIIlIIl[1]];
                            stringArray[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[257]];
                            if (!F.llIllIlllll(Inventory.contains((String[])stringArray) ? 1 : 0)) break block252;
                            String[] stringArray144 = new String[lIIIIlIIl[1]];
                            stringArray144[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[258]];
                            if (!F.llIlllIIlll(Inventory.getFirst((String[])stringArray144).getQuantity(), lIIIIlIIl[3])) break block252;
                            String[] stringArray145 = new String[lIIIIlIIl[1]];
                            stringArray145[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[259]];
                            if (!F.llIllIlllll(Inventory.contains((String[])stringArray145) ? 1 : 0)) break block252;
                            String[] stringArray146 = new String[lIIIIlIIl[1]];
                            stringArray146[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[260]];
                            if (!F.llIlllIIlll(Inventory.getFirst((String[])stringArray146).getQuantity(), lIIIIlIIl[3])) break block252;
                            String[] stringArray147 = new String[lIIIIlIIl[1]];
                            stringArray147[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[261]];
                            if (!F.llIllIlllll(Inventory.contains((String[])stringArray147) ? 1 : 0)) break block252;
                            String[] stringArray148 = new String[lIIIIlIIl[1]];
                            stringArray148[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[262]];
                            if (!F.llIlllIIlll(Inventory.getFirst((String[])stringArray148).getQuantity(), lIIIIlIIl[3])) break block252;
                            String[] stringArray149 = new String[lIIIIlIIl[1]];
                            stringArray149[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[263]];
                            if (!F.llIllIlllll(Inventory.contains((String[])stringArray149) ? 1 : 0)) break block252;
                            String[] stringArray150 = new String[lIIIIlIIl[1]];
                            stringArray150[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[264]];
                            if (!F.llIllIlllll(Inventory.contains((String[])stringArray150) ? 1 : 0)) break block252;
                            int[] nArray52 = new int[lIIIIlIIl[1]];
                            nArray52[F.lIIIIlIIl[0]] = lIIIIlIIl[143];
                            if (!F.llIlllIIlIl(Inventory.getCount((int[])nArray52)) || !F.llIllIlllll(gf.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block252;
                            AccBuilderEasyClues.c = lIIIIIlIl[lIIIIlIIl[265]];
                            while (true) {
                                block284: {
                                    block285: {
                                        block283: {
                                            String[] stringArray151 = new String[lIIIIlIIl[1]];
                                            stringArray151[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[266]];
                                            if (!F.llIllIlllll(Inventory.contains((String[])stringArray151) ? 1 : 0)) break block283;
                                            String[] stringArray152 = new String[lIIIIlIIl[1]];
                                            stringArray152[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[267]];
                                            if (!F.llIlllIlIII(Inventory.getFirst((String[])stringArray152).getQuantity(), lIIIIlIIl[3])) break block284;
                                        }
                                        String[] stringArray153 = new String[lIIIIlIIl[1]];
                                        stringArray153[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[268]];
                                        if (!F.llIllIlllll(Inventory.contains((String[])stringArray153) ? 1 : 0)) break block285;
                                        String[] stringArray154 = new String[lIIIIlIIl[1]];
                                        stringArray154[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[269]];
                                        if (!F.llIlllIlIII(Inventory.getFirst((String[])stringArray154).getQuantity(), lIIIIlIIl[3])) break block284;
                                    }
                                    String[] stringArray155 = new String[lIIIIlIIl[1]];
                                    stringArray155[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[270]];
                                    if (!F.llIllIlllll(Inventory.contains((String[])stringArray155) ? 1 : 0)) break block252;
                                    String[] stringArray156 = new String[lIIIIlIIl[1]];
                                    stringArray156[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[271]];
                                    if (!F.llIlllIIlll(Inventory.getFirst((String[])stringArray156).getQuantity(), lIIIIlIIl[3])) break block252;
                                }
                                if (!F.llIlllIIIIl(AccBuilderEasyClues.d ? 1 : 0)) break block252;
                                if (F.llIlllIIIIl(Players.getLocal().getWorldLocation().equals((Object)gS) ? 1 : 0)) {
                                    Movement.walkTo((WorldPoint)gS);
                                    0;
                                    Time.sleepTicks((int)lIIIIlIIl[5]);
                                    0;
                                }
                                if (!F.llIllIlllll(Players.getLocal().getWorldLocation().equals((Object)gS) ? 1 : 0)) continue;
                                int[] nArray53 = new int[lIIIIlIIl[1]];
                                nArray53[F.lIIIIlIIl[0]] = lIIIIlIIl[200];
                                lIIlIIlIlIlIIll = TileObjects.getFirstAt((WorldPoint)gk, (int[])nArray53);
                                String[] stringArray157 = new String[lIIIIlIIl[1]];
                                stringArray157[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[272]];
                                if (F.llIllIlllll(Inventory.contains((String[])stringArray157) ? 1 : 0)) {
                                    String[] stringArray158 = new String[lIIIIlIIl[1]];
                                    stringArray158[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[273]];
                                    Inventory.getFirst((String[])stringArray158).useOn((TileObject)lIIlIIlIlIlIIll);
                                    Time.sleepTicks((int)lIIIIlIIl[1]);
                                    0;
                                }
                                String[] stringArray159 = new String[lIIIIlIIl[1]];
                                stringArray159[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[274]];
                                if (F.llIllIlllll(Inventory.contains((String[])stringArray159) ? 1 : 0)) {
                                    String[] stringArray160 = new String[lIIIIlIIl[1]];
                                    stringArray160[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[275]];
                                    Inventory.getFirst((String[])stringArray160).useOn((TileObject)lIIlIIlIlIlIIll);
                                    Time.sleepTicks((int)lIIIIlIIl[1]);
                                    0;
                                }
                                String[] stringArray161 = new String[lIIIIlIIl[1]];
                                stringArray161[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[276]];
                                if (F.llIllIlllll(Inventory.contains((String[])stringArray161) ? 1 : 0)) {
                                    String[] stringArray162 = new String[lIIIIlIIl[1]];
                                    stringArray162[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[277]];
                                    Inventory.getFirst((String[])stringArray162).useOn((TileObject)lIIlIIlIlIlIIll);
                                    Time.sleepTicks((int)lIIIIlIIl[1]);
                                    0;
                                }
                                0;
                                if (1 < 0) break;
                            }
                            return;
                        }
                        int[] nArray = new int[lIIIIlIIl[1]];
                        nArray[F.lIIIIlIIl[0]] = lIIIIlIIl[41];
                        if (!F.llIllIlllll(Inventory.contains((int[])nArray) ? 1 : 0)) break block253;
                        String[] stringArray = new String[lIIIIlIIl[1]];
                        stringArray[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[278]];
                        if (!F.llIllIlllll(Inventory.contains((String[])stringArray) ? 1 : 0)) break block253;
                        String[] stringArray163 = new String[lIIIIlIIl[1]];
                        stringArray163[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[279]];
                        if (!F.llIlllIIlll(Inventory.getFirst((String[])stringArray163).getQuantity(), lIIIIlIIl[1])) break block253;
                        String[] stringArray164 = new String[lIIIIlIIl[1]];
                        stringArray164[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[280]];
                        if (!F.llIllIlllll(Inventory.contains((String[])stringArray164) ? 1 : 0)) break block253;
                        String[] stringArray165 = new String[lIIIIlIIl[1]];
                        stringArray165[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[281]];
                        if (!F.llIlllIIlll(Inventory.getFirst((String[])stringArray165).getQuantity(), lIIIIlIIl[1])) break block253;
                        String[] stringArray166 = new String[lIIIIlIIl[1]];
                        stringArray166[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[282]];
                        if (!F.llIllIlllll(Inventory.contains((String[])stringArray166) ? 1 : 0)) break block253;
                        String[] stringArray167 = new String[lIIIIlIIl[1]];
                        stringArray167[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[283]];
                        if (!F.llIlllIIlll(Inventory.getFirst((String[])stringArray167).getQuantity(), lIIIIlIIl[1])) break block253;
                        String[] stringArray168 = new String[lIIIIlIIl[1]];
                        stringArray168[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[284]];
                        if (!F.llIllIlllll(Inventory.contains((String[])stringArray168) ? 1 : 0)) break block253;
                        String[] stringArray169 = new String[lIIIIlIIl[1]];
                        stringArray169[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[285]];
                        if (!F.llIllIlllll(Inventory.contains((String[])stringArray169) ? 1 : 0)) break block253;
                        int[] nArray54 = new int[lIIIIlIIl[1]];
                        nArray54[F.lIIIIlIIl[0]] = lIIIIlIIl[143];
                        if (!F.llIlllIIlIl(Inventory.getCount((int[])nArray54)) || !F.llIllIlllll(gf.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block253;
                        AccBuilderEasyClues.c = lIIIIIlIl[lIIIIlIIl[286]];
                        while (true) {
                            block287: {
                                block288: {
                                    block286: {
                                        String[] stringArray170 = new String[lIIIIlIIl[1]];
                                        stringArray170[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[287]];
                                        if (!F.llIllIlllll(Inventory.contains((String[])stringArray170) ? 1 : 0)) break block286;
                                        String[] stringArray171 = new String[lIIIIlIIl[1]];
                                        stringArray171[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[288]];
                                        if (!F.llIlllIlIII(Inventory.getFirst((String[])stringArray171).getQuantity(), lIIIIlIIl[1])) break block287;
                                    }
                                    String[] stringArray172 = new String[lIIIIlIIl[1]];
                                    stringArray172[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[289]];
                                    if (!F.llIllIlllll(Inventory.contains((String[])stringArray172) ? 1 : 0)) break block288;
                                    String[] stringArray173 = new String[lIIIIlIIl[1]];
                                    stringArray173[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[290]];
                                    if (!F.llIlllIlIII(Inventory.getFirst((String[])stringArray173).getQuantity(), lIIIIlIIl[1])) break block287;
                                }
                                String[] stringArray174 = new String[lIIIIlIIl[1]];
                                stringArray174[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[291]];
                                if (!F.llIllIlllll(Inventory.contains((String[])stringArray174) ? 1 : 0)) break block253;
                                String[] stringArray175 = new String[lIIIIlIIl[1]];
                                stringArray175[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[292]];
                                if (!F.llIlllIIlll(Inventory.getFirst((String[])stringArray175).getQuantity(), lIIIIlIIl[1])) break block253;
                            }
                            if (!F.llIlllIIIIl(AccBuilderEasyClues.d ? 1 : 0)) break block253;
                            if (F.llIlllIIIIl(Players.getLocal().getWorldLocation().equals((Object)gR) ? 1 : 0)) {
                                Movement.walkTo((WorldPoint)gR);
                                0;
                            }
                            if (!F.llIllIlllll(Players.getLocal().getWorldLocation().equals((Object)gR) ? 1 : 0)) continue;
                            int[] nArray55 = new int[lIIIIlIIl[1]];
                            nArray55[F.lIIIIlIIl[0]] = lIIIIlIIl[200];
                            lIIlIIlIlIlIIll = TileObjects.getFirstAt((WorldPoint)gl, (int[])nArray55);
                            String[] stringArray176 = new String[lIIIIlIIl[1]];
                            stringArray176[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[293]];
                            if (F.llIllIlllll(Inventory.contains((String[])stringArray176) ? 1 : 0)) {
                                String[] stringArray177 = new String[lIIIIlIIl[1]];
                                stringArray177[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[294]];
                                Inventory.getFirst((String[])stringArray177).useOn((TileObject)lIIlIIlIlIlIIll);
                                Time.sleepTicks((int)lIIIIlIIl[1]);
                                0;
                            }
                            String[] stringArray178 = new String[lIIIIlIIl[1]];
                            stringArray178[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[295]];
                            if (F.llIllIlllll(Inventory.contains((String[])stringArray178) ? 1 : 0)) {
                                String[] stringArray179 = new String[lIIIIlIIl[1]];
                                stringArray179[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[296]];
                                Inventory.getFirst((String[])stringArray179).useOn((TileObject)lIIlIIlIlIlIIll);
                                Time.sleepTicks((int)lIIIIlIIl[1]);
                                0;
                            }
                            String[] stringArray180 = new String[lIIIIlIIl[1]];
                            stringArray180[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[297]];
                            if (F.llIllIlllll(Inventory.contains((String[])stringArray180) ? 1 : 0)) {
                                String[] stringArray181 = new String[lIIIIlIIl[1]];
                                stringArray181[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[298]];
                                Inventory.getFirst((String[])stringArray181).useOn((TileObject)lIIlIIlIlIlIIll);
                                Time.sleepTicks((int)lIIIIlIIl[1]);
                                0;
                            }
                            0;
                            if (null != null) break;
                        }
                        return;
                    }
                    String[] stringArray = new String[lIIIIlIIl[1]];
                    stringArray[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[299]];
                    if (F.llIlllIIIIl(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                        String[] stringArray182 = new String[lIIIIlIIl[1]];
                        stringArray182[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[300]];
                        if (F.llIlllIIIIl(Inventory.contains((String[])stringArray182) ? 1 : 0)) {
                            String[] stringArray183 = new String[lIIIIlIIl[1]];
                            stringArray183[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[301]];
                            if (F.llIlllIIIIl(Inventory.contains((String[])stringArray183) ? 1 : 0)) {
                                AccBuilderEasyClues.c = lIIIIIlIl[lIIIIlIIl[302]];
                                int[] nArray = new int[lIIIIlIIl[1]];
                                nArray[F.lIIIIlIIl[0]] = lIIIIlIIl[303];
                                lIIlIIlIlIlIIll = TileObjects.getNearest((int[])nArray);
                                int[] nArray56 = new int[lIIIIlIIl[1]];
                                nArray56[F.lIIIIlIIl[0]] = lIIIIlIIl[304];
                                lIIlIIlIlIlIIlI = Inventory.getFirst((int[])nArray56);
                                if (F.llIlllIIlII(lIIlIIlIlIlIIll) && F.llIlllIIlII(lIIlIIlIlIlIIlI)) {
                                    lIIlIIlIlIlIIlI.useOn((TileObject)lIIlIIlIlIlIIll);
                                    Time.sleepTicks((int)lIIIIlIIl[5]);
                                    0;
                                }
                            }
                        }
                    }
                }
                if (F.llIlllIIlll(e.j(lIIIIlIIl[10]), lIIIIlIIl[13])) {
                    AccBuilderEasyClues.c = lIIIIIlIl[lIIIIlIIl[305]];
                    int[] nArray = new int[lIIIIlIIl[1]];
                    nArray[F.lIIIIlIIl[0]] = lIIIIlIIl[306];
                    lIIlIIlIlIlIIll = TileObjects.getNearest((int[])nArray);
                    int[] nArray57 = new int[lIIIIlIIl[1]];
                    nArray57[F.lIIIIlIIl[0]] = lIIIIlIIl[307];
                    lIIlIIlIlIlIIlI = Inventory.getFirst((int[])nArray57);
                    if (F.llIlllIIIII(cl, lIIIIlIIl[1])) {
                        an.nb += lIIIIlIIl[1];
                        an.o(AccBuilderEasyClues.m);
                        cl += lIIIIlIIl[1];
                        an.nb = lIIIIlIIl[0];
                        cm = lIIIIlIIl[0];
                    }
                    if (F.llIlllIIlII(lIIlIIlIlIlIIll) && F.llIlllIIlII(lIIlIIlIlIlIIlI)) {
                        lIIlIIlIlIlIIlI.useOn((TileObject)lIIlIIlIlIlIIll);
                        Time.sleepTicks((int)lIIIIlIIl[7]);
                        0;
                        g.a(hl);
                    }
                }
                if (!F.llIlllIIlll(e.j(lIIIIlIIl[10]), lIIIIlIIl[19])) break block254;
                String[] stringArray = new String[lIIIIlIIl[1]];
                stringArray[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[308]];
                if (!F.llIlllIlIIl(TileObjects.getNearest((String[])stringArray))) break block289;
                String[] stringArray184 = new String[lIIIIlIIl[1]];
                stringArray184[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[309]];
                if (!F.llIlllIIlII(TileObjects.getNearest((String[])stringArray184))) break block254;
            }
            String[] stringArray = new String[lIIIIlIIl[1]];
            stringArray[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[310]];
            if (F.llIlllIIlII(TileObjects.getNearest((String[])stringArray))) {
                AccBuilderEasyClues.c = lIIIIIlIl[lIIIIlIIl[311]];
                if (F.llIlllIIIIl(Equipment.contains((int[])f.aN) ? 1 : 0) && F.llIllIlllll(Inventory.contains((int[])f.aN) ? 1 : 0)) {
                    Inventory.getFirst((int[])f.aN).interact(lIIIIIlIl[lIIIIlIIl[312]]);
                    Time.sleepTicks((int)lIIIIlIIl[6]);
                    0;
                }
                if (F.llIllIlllll(Equipment.contains((int[])f.aN) ? 1 : 0)) {
                    Equipment.getFirst((int[])f.aN).interact(lIIIIIlIl[lIIIIlIIl[313]]);
                    Time.sleepTicks((int)lIIIIlIIl[6]);
                    0;
                }
            }
        }
    }

    private static boolean llIlllIIlII(Object object) {
        return object != null;
    }

    private static void llIllIllllI() {
        lIIIIlIIl = new int[414];
        F.lIIIIlIIl[0] = (13 + 48 - 1 + 134 ^ 15 + 65 - 13 + 65) & (0x12 ^ 0x1B ^ (0x63 ^ 0x2C) ^ -1);
        F.lIIIIlIIl[1] = 1;
        F.lIIIIlIIl[2] = 0x47 ^ 0xF ^ (0xEB ^ 0x91);
        F.lIIIIlIIl[3] = 2;
        F.lIIIIlIIl[4] = 0xA4 ^ 0xAA;
        F.lIIIIlIIl[5] = 3;
        F.lIIIIlIIl[6] = 0x3A ^ 0x16 ^ (0x48 ^ 0x60);
        F.lIIIIlIIl[7] = 70 + 141 - 125 + 63 ^ 28 + 143 - 157 + 130;
        F.lIIIIlIIl[8] = 2 + (99 + 170 - 261 + 169) - (0x68 ^ 0x35) + (92 + 68 - 85 + 65);
        F.lIIIIlIIl[9] = 0x82 ^ 0x85;
        F.lIIIIlIIl[10] = 0x4B ^ 0x57 ^ (0xE3 ^ 0xBE);
        F.lIIIIlIIl[11] = 0x5A ^ 0x5C;
        F.lIIIIlIIl[12] = 0xFFFFFF99 & 0x13EE;
        F.lIIIIlIIl[13] = 0xB ^ 3;
        F.lIIIIlIIl[14] = 0xFFFFF36B & 0xEBF;
        F.lIIIIlIIl[15] = -(0xFFFFEDF3 & 0x7F9E) & (0xFFFFEFFD & 0x7FBF);
        F.lIIIIlIIl[16] = -(0xFFFFFBA3 & 0x7DDF) & (0xFFFFFFBF & 0x7BEF);
        F.lIIIIlIIl[17] = 0x26 ^ 0xC ^ (0x28 ^ 0xB);
        F.lIIIIlIIl[18] = -(0xFFFFA6F6 & 0x794B) & (0xFFFFEFFF & 0x33FB);
        F.lIIIIlIIl[19] = 0x7B ^ 0x71;
        F.lIIIIlIIl[20] = -(0xFFFFFF5F & 0x52F9) & (0xFFFFD7DD & 0x7BFB);
        F.lIIIIlIIl[21] = 0xC ^ 0x4E ^ (0xC1 ^ 0x88);
        F.lIIIIlIIl[22] = 0x94 ^ 0x98;
        F.lIIIIlIIl[23] = 0x23 ^ 0x56 ^ (0x21 ^ 0x59);
        F.lIIIIlIIl[24] = -(0xFFFFF68E & 0x7B77) & (0xFFFFFBFF & 0x7FFD);
        F.lIIIIlIIl[25] = 0x9B ^ 0x89;
        F.lIIIIlIIl[26] = 122 + 83 - 142 + 66 ^ 11 + 29 - -30 + 72;
        F.lIIIIlIIl[27] = 0x31 ^ 0x21;
        F.lIIIIlIIl[28] = 40 + 82 - -25 + 8 ^ 0 + 18 - -5 + 115;
        F.lIIIIlIIl[29] = 0x90 ^ 0x83;
        F.lIIIIlIIl[30] = 0xB8 ^ 0xAC;
        F.lIIIIlIIl[31] = 0xFFFFDFFD & 0x27C7;
        F.lIIIIlIIl[32] = 0x7B ^ 0x6E;
        F.lIIIIlIIl[33] = 0x20 ^ 0x36;
        F.lIIIIlIIl[34] = 0x90 ^ 0xB2 ^ (0xAB ^ 0x9E);
        F.lIIIIlIIl[35] = 66 + 86 - 40 + 26 ^ 9 + 4 - -128 + 5;
        F.lIIIIlIIl[36] = -1;
        F.lIIIIlIIl[37] = 2 ^ 0x2C ^ (0xA7 ^ 0x90);
        F.lIIIIlIIl[38] = 0x66 ^ 0x7C;
        F.lIIIIlIIl[39] = 0xBF ^ 0xA4;
        F.lIIIIlIIl[40] = -(0xFFFFEFDD & 0x5AB3) & (0xFFFFFBFF & 0x4FB5);
        F.lIIIIlIIl[41] = 0xFFFF85EF & 0x7B36;
        F.lIIIIlIIl[42] = 0x3F ^ 0x23;
        F.lIIIIlIIl[43] = 0x8F ^ 0xC7 ^ (0xEF ^ 0xBA);
        F.lIIIIlIIl[44] = 0xA3 ^ 0xBD;
        F.lIIIIlIIl[45] = 0xA7 ^ 0xB8;
        F.lIIIIlIIl[46] = 0x8B ^ 0xAB;
        F.lIIIIlIIl[47] = -(0xFFFFEBF5 & 0x5F6B) & (0xFFFFDFF2 & 0x7FEF);
        F.lIIIIlIIl[48] = 0x9C ^ 0xBD;
        F.lIIIIlIIl[49] = 0xFFFFF7EF & 0xFD6;
        F.lIIIIlIIl[50] = 167 + 209 - 273 + 128 ^ 144 + 26 - 80 + 107;
        F.lIIIIlIIl[51] = 0xB0 ^ 0x93;
        F.lIIIIlIIl[52] = 0x9C ^ 0xB8;
        F.lIIIIlIIl[53] = -(0xFFFFCF97 & 0x7A7C) & (0xFFFFEF7B & Short.MAX_VALUE);
        F.lIIIIlIIl[54] = 0x4F ^ 0x6A;
        F.lIIIIlIIl[55] = -(0xFFFFFFBD & 0x707B) & (0xFFFFFFFF & 0x77FF);
        F.lIIIIlIIl[56] = 0x20 ^ 0x15 ^ (0x6D ^ 0x7E);
        F.lIIIIlIIl[57] = 0x35 ^ 0x12;
        F.lIIIIlIIl[58] = 0xB4 ^ 0x9C;
        F.lIIIIlIIl[59] = 0xD ^ 0x24;
        F.lIIIIlIIl[60] = 0x4A ^ 0x25 ^ (0x2A ^ 0x6F);
        F.lIIIIlIIl[61] = 79 + 73 - 87 + 168 ^ 29 + 165 - 10 + 10;
        F.lIIIIlIIl[62] = 0xB2 ^ 0x9E;
        F.lIIIIlIIl[63] = 0xE ^ 0x23;
        F.lIIIIlIIl[64] = 96 + 80 - 175 + 175 ^ 133 + 31 - 143 + 137;
        F.lIIIIlIIl[65] = -(0xFFFFFCA6 & 0x735F) & (0xFFFFF7DF & 0x7FED);
        F.lIIIIlIIl[66] = -(0xFFFFDEAF & 0x7373) & (0xFFFFF7BF & 0x7F7E);
        F.lIIIIlIIl[67] = 0xD4 ^ 0x98 ^ (0xC7 ^ 0xA4);
        F.lIIIIlIIl[68] = 0x75 ^ 0x15 ^ (0x1B ^ 0x4B);
        F.lIIIIlIIl[69] = 0x16 ^ 0x27;
        F.lIIIIlIIl[70] = -(0xFFFFB9B7 & 0x7E5E) & (0xFFFFBFDF & Short.MAX_VALUE);
        F.lIIIIlIIl[71] = 0x4C ^ 0x41 ^ (0x24 ^ 0x1A);
        F.lIIIIlIIl[72] = 0xFFFF8FCF & 0x77FB;
        F.lIIIIlIIl[73] = 0x95 ^ 0xA1;
        F.lIIIIlIIl[74] = 4 + 78 - 22 + 94 ^ 151 + 63 - 48 + 9;
        F.lIIIIlIIl[75] = 0x4C ^ 0x12 ^ (0xF3 ^ 0x9B);
        F.lIIIIlIIl[76] = 0x43 ^ 0x74;
        F.lIIIIlIIl[77] = 0x40 ^ 0x52 ^ (0xB1 ^ 0x9B);
        F.lIIIIlIIl[78] = 0xAC ^ 0x95;
        F.lIIIIlIIl[79] = 0x5E ^ 0x64;
        F.lIIIIlIIl[80] = 41 + 60 - 83 + 129 ^ 147 + 126 - 181 + 76;
        F.lIIIIlIIl[81] = -(0xFFFFB9CF & 0x5E37) & (0xFFFFBFFF & 0x5FCF);
        F.lIIIIlIIl[82] = 107 + 41 - 24 + 24 ^ 119 + 122 - 186 + 113;
        F.lIIIIlIIl[83] = 0x74 ^ 0x49;
        F.lIIIIlIIl[84] = 0x6C ^ 0x52;
        F.lIIIIlIIl[85] = 0x32 ^ 0xD;
        F.lIIIIlIIl[86] = 156 + 175 - 324 + 193 ^ 118 + 11 - 48 + 55;
        F.lIIIIlIIl[87] = 0x56 ^ 0x14;
        F.lIIIIlIIl[88] = 0x1F ^ 0x5C;
        F.lIIIIlIIl[89] = 0x9A ^ 0x87 ^ (0x5D ^ 4);
        F.lIIIIlIIl[90] = 0x3B ^ 0x7E;
        F.lIIIIlIIl[91] = 0x75 ^ 0x33;
        F.lIIIIlIIl[92] = 0x11 ^ 0x57 ^ 1;
        F.lIIIIlIIl[93] = 0xE0 ^ 0xA8;
        F.lIIIIlIIl[94] = 0x7B ^ 0x71 ^ (0x7E ^ 0x3D);
        F.lIIIIlIIl[95] = 154 + 107 - 145 + 91 ^ 61 + 23 - 30 + 79;
        F.lIIIIlIIl[96] = 0x7A ^ 0x31;
        F.lIIIIlIIl[97] = 0x72 ^ 0x3E;
        F.lIIIIlIIl[98] = 0x71 ^ 0x61 ^ (0x7D ^ 0x20);
        F.lIIIIlIIl[99] = 0x14 ^ 0x5A;
        F.lIIIIlIIl[100] = 24 + 46 - -1 + 67 ^ 113 + 114 - 88 + 58;
        F.lIIIIlIIl[101] = 0xC5 ^ 0x99 ^ (0x46 ^ 0x4A);
        F.lIIIIlIIl[102] = 90 + 169 - 54 + 24 ^ 18 + 134 - 92 + 120;
        F.lIIIIlIIl[103] = 0x11 ^ 0x43;
        F.lIIIIlIIl[104] = 0x68 ^ 0x3B;
        F.lIIIIlIIl[105] = 0xDA ^ 0xB9 ^ (0xA6 ^ 0x91);
        F.lIIIIlIIl[106] = 0x28 ^ 0x7D;
        F.lIIIIlIIl[107] = 0xEC ^ 0xBA;
        F.lIIIIlIIl[108] = 0x49 ^ 0x1E;
        F.lIIIIlIIl[109] = 0x6E ^ 0x58 ^ (0x2E ^ 0x40);
        F.lIIIIlIIl[110] = 0x5D ^ 4;
        F.lIIIIlIIl[111] = 0xF1 ^ 0xAB;
        F.lIIIIlIIl[112] = 0xD9 ^ 0x91 ^ (0x2C ^ 0x3F);
        F.lIIIIlIIl[113] = 0x99 ^ 0xC5;
        F.lIIIIlIIl[114] = 0xCA ^ 0x86 ^ (0xD5 ^ 0xC4);
        F.lIIIIlIIl[115] = 117 + 153 - 213 + 177 ^ 168 + 90 - 195 + 117;
        F.lIIIIlIIl[116] = 0x51 ^ 0xE;
        F.lIIIIlIIl[117] = 65 + 151 - 38 + 71 ^ 119 + 46 - 28 + 16;
        F.lIIIIlIIl[118] = 0x1B ^ 0x34 ^ (0x36 ^ 0x78);
        F.lIIIIlIIl[119] = 0x5F ^ 0xF ^ (0x2A ^ 0x18);
        F.lIIIIlIIl[120] = 0xDC ^ 0xBF;
        F.lIIIIlIIl[121] = 0x47 ^ 0x23;
        F.lIIIIlIIl[122] = 2 ^ 0x67;
        F.lIIIIlIIl[123] = 140 + 175 - 187 + 67 ^ 100 + 5 - 13 + 73;
        F.lIIIIlIIl[124] = 0x46 ^ 0x21;
        F.lIIIIlIIl[125] = 0x2D ^ 0x45;
        F.lIIIIlIIl[126] = 0xF5 ^ 0x98 ^ (0x61 ^ 0x65);
        F.lIIIIlIIl[127] = 104 + 89 - 117 + 117 ^ 71 + 146 - 158 + 112;
        F.lIIIIlIIl[128] = 0xFFFF9B7B & 0x7FDC;
        F.lIIIIlIIl[129] = 0x7D ^ 0x16;
        F.lIIIIlIIl[130] = -(0xFFFFF99B & 0x5666) & (0xFFFFD7F7 & 0x7FED);
        F.lIIIIlIIl[131] = 162 + 97 - 142 + 57 ^ 1 + 137 - 79 + 135;
        F.lIIIIlIIl[132] = 0xCC ^ 0xA1;
        F.lIIIIlIIl[133] = 0xC ^ 0x62;
        F.lIIIIlIIl[134] = 0x56 ^ 0x39;
        F.lIIIIlIIl[135] = 0x6E ^ 0x1E;
        F.lIIIIlIIl[136] = 0x31 ^ 0x40;
        F.lIIIIlIIl[137] = 0xED ^ 0x9F;
        F.lIIIIlIIl[138] = 0xFD ^ 0x8E;
        F.lIIIIlIIl[139] = 143 + 6 - 68 + 116 ^ 158 + 76 - 109 + 52;
        F.lIIIIlIIl[140] = 0x50 ^ 0xC ^ (0x51 ^ 0x78);
        F.lIIIIlIIl[141] = 0xC2 ^ 0xB4;
        F.lIIIIlIIl[142] = 0xD7 ^ 0xA0;
        F.lIIIIlIIl[143] = 0xFFFFBB6E & 0x45BB;
        F.lIIIIlIIl[144] = 0x52 ^ 0x2A;
        F.lIIIIlIIl[145] = -(0xFFFFF9D7 & 0x3629) & (0xFFFFBFEF & 0x77DF);
        F.lIIIIlIIl[146] = 0xE6 ^ 0x9F;
        F.lIIIIlIIl[147] = 0xC7 ^ 0xC3 ^ (0xC3 ^ 0xBD);
        F.lIIIIlIIl[148] = 0x4C ^ 0x37;
        F.lIIIIlIIl[149] = 0x84 ^ 0xA1 ^ (0x61 ^ 0x38);
        F.lIIIIlIIl[150] = 0x5D ^ 0x20;
        F.lIIIIlIIl[151] = 0xA1 ^ 0xB7 ^ (0xD9 ^ 0xB1);
        F.lIIIIlIIl[152] = 111 + 112 - 99 + 3;
        F.lIIIIlIIl[153] = (4 ^ 0x5D) + (0x3D ^ 0x27) - (0xBD ^ 0x96) + (0x73 ^ 0x4B);
        F.lIIIIlIIl[154] = 92 + 104 - 164 + 97;
        F.lIIIIlIIl[155] = 89 + 27 - 81 + 95;
        F.lIIIIlIIl[156] = 121 + 54 - 81 + 37;
        F.lIIIIlIIl[157] = 29 + 65 - -19 + 19;
        F.lIIIIlIIl[158] = (6 ^ 0x37) + (0xC4 ^ 0xA2) - (0x69 ^ 0x48) + (0xB ^ 4);
        F.lIIIIlIIl[159] = 36 + 96 - 121 + 123;
        F.lIIIIlIIl[160] = 134 + 27 - 113 + 87;
        F.lIIIIlIIl[161] = (1 ^ 0x3B) + (0x5B ^ 0x12) - (0x9B ^ 0xC4) + (0xD ^ 0x69);
        F.lIIIIlIIl[162] = 57 + 21 - 6 + 65;
        F.lIIIIlIIl[163] = (0x3B ^ 0x43) + (0xA8 ^ 0x85) - (116 + 102 - 128 + 73) + (111 + 93 - 89 + 21);
        F.lIIIIlIIl[164] = 80 + 35 - 75 + 99;
        F.lIIIIlIIl[165] = 0xFFFFFF74 & 0x21BF;
        F.lIIIIlIIl[166] = 118 + 22 - 114 + 114;
        F.lIIIIlIIl[167] = 115 + 48 - 110 + 88;
        F.lIIIIlIIl[168] = 26 + 25 - -79 + 9 + (0x7D ^ 6) - (125 + 150 - 273 + 155) + (0x9C ^ 0xB9);
        F.lIIIIlIIl[169] = 42 + 90 - 44 + 55;
        F.lIIIIlIIl[170] = (0xD0 ^ 0xB1) + (0x3F ^ 0x17) - (0xDF ^ 0x9C) + (0x35 ^ 0x7F);
        F.lIIIIlIIl[171] = (0x38 ^ 0x23) + (0 ^ 0x45) - (0x93 ^ 0xBB) + (0x2C ^ 0x75);
        F.lIIIIlIIl[172] = (0x7C ^ 0x3D) + (0xD5 ^ 0xBC) - (35 + 17 - -32 + 84) + (72 + 67 - 115 + 120);
        F.lIIIIlIIl[173] = 120 + 10 - 35 + 52;
        F.lIIIIlIIl[174] = 133 + 2 - 63 + 76;
        F.lIIIIlIIl[175] = 138 + 22 - 34 + 23;
        F.lIIIIlIIl[176] = 125 + 132 - 223 + 116;
        F.lIIIIlIIl[177] = 41 + 15 - 53 + 148;
        F.lIIIIlIIl[178] = (0x54 ^ 0x74) + (116 + 46 - 126 + 97) - (0xFC ^ 0xA7) + (0x52 ^ 0x1C);
        F.lIIIIlIIl[179] = 122 + 71 - 117 + 77;
        F.lIIIIlIIl[180] = 51 + 120 - 139 + 122;
        F.lIIIIlIIl[181] = 14 + 8 - -33 + 100;
        F.lIIIIlIIl[182] = 108 + 130 - 82 + 0;
        F.lIIIIlIIl[183] = 49 + 42 - 10 + 76;
        F.lIIIIlIIl[184] = (0x9C ^ 0xBF) + (0x4D ^ 0x62) - -(0xF4 ^ 0xB7) + (0x81 ^ 0x88);
        F.lIIIIlIIl[185] = 113 + 29 - 98 + 88 + (0x88 ^ 0x8E) - (0x32 ^ 0x5A) + (0xC9 ^ 0xB4);
        F.lIIIIlIIl[186] = 2 + 102 - -27 + 29;
        F.lIIIIlIIl[187] = 76 + 2 - 4 + 87;
        F.lIIIIlIIl[188] = 2 + 42 - -69 + 49;
        F.lIIIIlIIl[189] = 9 + 14 - -103 + 37;
        F.lIIIIlIIl[190] = (0xFB ^ 0xC2) + (132 + 110 - 102 + 20) - (0xC1 ^ 0x80) + (0x46 ^ 0x4A);
        F.lIIIIlIIl[191] = 91 + 45 - 20 + 49;
        F.lIIIIlIIl[192] = 12 + 130 - 107 + 131;
        F.lIIIIlIIl[193] = 28 + 82 - -51 + 6;
        F.lIIIIlIIl[194] = 133 + 127 - 229 + 137;
        F.lIIIIlIIl[195] = 145 + 131 - 152 + 45;
        F.lIIIIlIIl[196] = 102 + 19 - 28 + 77;
        F.lIIIIlIIl[197] = (0x5F ^ 0x78) + (0xC4 ^ 0xB3) - (42 + 77 - 48 + 62) + (57 + 129 - 137 + 97);
        F.lIIIIlIIl[198] = (0x2E ^ 0x1D) + (0x31 ^ 0x58) - (0x1B ^ 0x47) + (0x75 ^ 0x19);
        F.lIIIIlIIl[199] = 111 + 131 - 110 + 38 + (80 + 61 - 4 + 34) - (0xFFFFAFEB & 0x515E) + (161 + 34 - 136 + 103);
        F.lIIIIlIIl[200] = 0xFFFFF7DF & 0xFF5;
        F.lIIIIlIIl[201] = 82 + 38 - 106 + 113 + (0x16 ^ 3) - (0x7F ^ 2) + (71 + 28 - -37 + 15);
        F.lIIIIlIIl[202] = (0x6F ^ 0x2D) + (0x28 ^ 0x62) - (0x21 ^ 0xD) + (0x4C ^ 3);
        F.lIIIIlIIl[203] = 89 + 110 - 167 + 144;
        F.lIIIIlIIl[204] = (0x1B ^ 0x32) + (0x47 ^ 0x7B) - -(0x3A ^ 0x7A) + (0x71 ^ 0x7D);
        F.lIIIIlIIl[205] = 98 + 166 - 148 + 62;
        F.lIIIIlIIl[206] = (0x1F ^ 0x3D) + (0x1E ^ 0x52) - (0x97 ^ 0x93) + (0xD2 ^ 0x9B);
        F.lIIIIlIIl[207] = 38 + 18 - -78 + 46;
        F.lIIIIlIIl[208] = 126 + 140 - 95 + 10;
        F.lIIIIlIIl[209] = 117 + 71 - 61 + 34 + (0xF0 ^ 0xAE) - (5 + 111 - 52 + 119) + (0x57 ^ 0x39);
        F.lIIIIlIIl[210] = 115 + 169 - 278 + 177;
        F.lIIIIlIIl[211] = (0x4A ^ 0x6C) + (182 + 28 - 197 + 170) - (202 + 39 - 135 + 99) + (14 + 68 - 77 + 163);
        F.lIIIIlIIl[212] = (0xC0 ^ 0x8E) + (0x33 ^ 0x55) - (32 + 0 - 3 + 118) + (52 + 33 - -11 + 56);
        F.lIIIIlIIl[213] = (0x35 ^ 0x57) + (61 + 37 - 60 + 146) - (98 + 236 - 108 + 13) + (69 + 10 - -19 + 45);
        F.lIIIIlIIl[214] = 171 + 113 - 127 + 30;
        F.lIIIIlIIl[215] = 133 + 41 - 157 + 171;
        F.lIIIIlIIl[216] = 92 + 39 - 76 + 99 + (7 + 57 - 51 + 114) - (193 + 70 - 188 + 161) + (7 + 21 - -113 + 3);
        F.lIIIIlIIl[217] = 127 + 49 - 0 + 14;
        F.lIIIIlIIl[218] = 32 + 154 - 73 + 78;
        F.lIIIIlIIl[219] = (0x20 ^ 0x3C) + (0xED ^ 0x88) - -(0x77 ^ 0x66) + (0xA2 ^ 0x8C);
        F.lIIIIlIIl[220] = 1 + 24 - -146 + 22;
        F.lIIIIlIIl[221] = 95 + 98 - 116 + 103 + (0x16 ^ 0x37) - (0x3F ^ 0x25) + (0x2B ^ 0x2C);
        F.lIIIIlIIl[222] = (0xD1 ^ 0xA9) + (94 + 52 - 127 + 109) - (80 + 48 - 9 + 17) + (0x6C ^ 0x3F);
        F.lIIIIlIIl[223] = (0x42 ^ 0x47) + (136 + 187 - 238 + 103) - (21 + 31 - 35 + 152) + (5 + 139 - -11 + 17);
        F.lIIIIlIIl[224] = 58 + 119 - 10 + 19 + (0x89 ^ 0x95) - (39 + 151 - 166 + 138) + (125 + 133 - 124 + 11);
        F.lIIIIlIIl[225] = 178 + 137 - 312 + 195;
        F.lIIIIlIIl[226] = 31 + 153 - 88 + 95 + (0x74 ^ 0x7F) - (0xFB ^ 0x91) + (0x58 ^ 0x3F);
        F.lIIIIlIIl[227] = 168 + 14 - 1 + 15 + (169 + 56 - 121 + 74) - (227 + 175 - 324 + 159) + (0xFC ^ 0xC3);
        F.lIIIIlIIl[228] = 80 + 192 - 177 + 106;
        F.lIIIIlIIl[229] = 195 + 144 - 222 + 85;
        F.lIIIIlIIl[230] = (0x41 ^ 0x2F) + (0x30 ^ 7) - (0x46 ^ 0x6D) + (0xF5 ^ 0xA4);
        F.lIIIIlIIl[231] = 194 + 169 - 177 + 18;
        F.lIIIIlIIl[232] = 118 + 185 - 170 + 72;
        F.lIIIIlIIl[233] = 13 + 204 - 157 + 146;
        F.lIIIIlIIl[234] = 88 + 85 - 155 + 122 + (0x15 ^ 0x71) - (58 + 193 - 60 + 31) + (170 + 140 - 151 + 30);
        F.lIIIIlIIl[235] = 65 + 79 - 94 + 85 + (166 + 161 - 200 + 55) - (0x3D ^ 0x50) + ((0x56 ^ 0x4F) & ~(0x29 ^ 0x30));
        F.lIIIIlIIl[236] = 113 + 71 - 12 + 37;
        F.lIIIIlIIl[237] = 198 + 20 - 79 + 71;
        F.lIIIIlIIl[238] = (0xA6 ^ 0x9C) + (0x9A ^ 0xA3) - (0xAA ^ 0xC2) + (193 + 175 - 313 + 145);
        F.lIIIIlIIl[239] = 11 + 141 - -30 + 30;
        F.lIIIIlIIl[240] = 52 + 158 - 138 + 141;
        F.lIIIIlIIl[241] = 20 + 7 - -166 + 21;
        F.lIIIIlIIl[242] = 197 + 164 - 152 + 4 + (0x7A ^ 0x6E) - (0x70 ^ 0x34) + (0x67 ^ 0x55);
        F.lIIIIlIIl[243] = 203 + 107 - 226 + 132;
        F.lIIIIlIIl[244] = (0x55 ^ 0x30) + (48 + 14 - 31 + 105) - (128 + 116 - 85 + 45) + (52 + 27 - 46 + 151);
        F.lIIIIlIIl[245] = 49 + 64 - -28 + 77;
        F.lIIIIlIIl[246] = 55 + 17 - -40 + 46 + (140 + 134 - 198 + 103) - (0xFFFF932F & 0x6DD5) + (72 + 140 - 151 + 82);
        F.lIIIIlIIl[247] = 142 + 10 - -24 + 3 + (0x8E ^ 0x93) - (0x41 ^ 0x74) + (0x1E ^ 0x5F);
        F.lIIIIlIIl[248] = 102 + 43 - -21 + 34 + (0xD0 ^ 0x88) - (122 + 187 - 147 + 91) + (165 + 139 - 210 + 92);
        F.lIIIIlIIl[249] = (0xAE ^ 0xBD) + (167 + 180 - 167 + 8) - (0x27 ^ 0x44) + (5 ^ 0x77);
        F.lIIIIlIIl[250] = (0x55 ^ 0x68) + (0x7B ^ 0x67) - -(4 ^ 0x54) + (0xF4 ^ 0xC2);
        F.lIIIIlIIl[251] = 91 + 69 - 14 + 9 + (99 + 77 - 169 + 182) - (0xFFFFCF7F & 0x31B3) + (35 + 122 - -13 + 17);
        F.lIIIIlIIl[252] = (0x43 ^ 0x54) + (0xEB ^ 0xB8) - (0xE ^ 5) + (96 + 26 - 43 + 51);
        F.lIIIIlIIl[253] = (0x5E ^ 0x69) + (79 + 115 - 165 + 169) - (129 + 185 - 127 + 9) + (78 + 142 - 207 + 157);
        F.lIIIIlIIl[254] = 41 + 93 - 117 + 145 + (0x1A ^ 0x6F) - (20 + 123 - 120 + 107) + (0x35 ^ 0x7A);
        F.lIIIIlIIl[255] = 52 + 187 - 208 + 182 + (183 + 106 - 120 + 38) - (0xFFFF89B7 & 0x77DF) + (17 + 14 - 11 + 196);
        F.lIIIIlIIl[256] = 139 + 211 - 193 + 73;
        F.lIIIIlIIl[257] = 175 + 122 - 225 + 142 + (106 + 83 - 34 + 24) - (93 + 86 - 161 + 153) + (0x61 ^ 0x68);
        F.lIIIIlIIl[258] = 137 + 142 - 156 + 109;
        F.lIIIIlIIl[259] = (0xFA ^ 0xA7) + (123 + 98 - 126 + 131) - (59 + 176 - 37 + 1) + (0xDB ^ 0xAA);
        F.lIIIIlIIl[260] = 153 + 143 - 216 + 151 + (80 + 109 - 26 + 5) - (0xFFFFE35F & 0x1DF9) + (17 + 80 - -44 + 39);
        F.lIIIIlIIl[261] = 3 + 162 - -42 + 28;
        F.lIIIIlIIl[262] = 3 + (139 + 74 - 61 + 23) - (0x79 ^ 0x32) + (32 + 3 - -71 + 27);
        F.lIIIIlIIl[263] = (0x64 ^ 0x5D) + (32 + 2 - 12 + 113) - (0x13 ^ 5) + (0xFC ^ 0xBF);
        F.lIIIIlIIl[264] = 91 + 127 - 176 + 196;
        F.lIIIIlIIl[265] = 39 + 150 - 156 + 206;
        F.lIIIIlIIl[266] = (0x81 ^ 0xC5) + (0xA8 ^ 0x96) - (0x38 ^ 0x6C) + (4 + 138 - 122 + 174);
        F.lIIIIlIIl[267] = 76 + 21 - 76 + 205 + (30 + 164 - 33 + 41) - (65 + 119 - 46 + 66) + (0xB4 ^ 0xA5);
        F.lIIIIlIIl[268] = 0 + 184 - -28 + 30;
        F.lIIIIlIIl[269] = 239 + 117 - 218 + 105;
        F.lIIIIlIIl[270] = 236 + 220 - 288 + 76;
        F.lIIIIlIIl[271] = 7 + 1 - -124 + 87 + (0x43 ^ 0x52) - (0x7D ^ 0x11) + (0xF3 ^ 0x86);
        F.lIIIIlIIl[272] = 152 + 11 - 111 + 194;
        F.lIIIIlIIl[273] = (0x4A ^ 0x4C) + (43 + 140 - 76 + 93) - (0xE0 ^ 0x8A) + (38 + 78 - -20 + 11);
        F.lIIIIlIIl[274] = 207 + 50 - 230 + 221;
        F.lIIIIlIIl[275] = (0xBC ^ 0x82) + (0x16 ^ 5) - -(0x62 ^ 0x76) + (109 + 40 - 65 + 64);
        F.lIIIIlIIl[276] = (0xE3 ^ 0xA6) + (0x5A ^ 0x5F) - -(0xEF ^ 0xA7) + (0xE1 ^ 0x89);
        F.lIIIIlIIl[277] = (0x5B ^ 0x62) + (7 + 200 - 180 + 211) - (6 + 35 - -65 + 39) + (0x2F ^ 0x4A);
        F.lIIIIlIIl[278] = 203 + 21 - 123 + 151;
        F.lIIIIlIIl[279] = (2 ^ 0x1D) + (188 + 47 - 61 + 57) - (39 + 39 - -96 + 25) + (177 + 97 - 199 + 115);
        F.lIIIIlIIl[280] = 245 + 29 - 77 + 57;
        F.lIIIIlIIl[281] = 23 + 141 - 110 + 132 + (57 + 73 - 123 + 206) - (123 + 96 - 213 + 235) + (0x6B ^ 0xA);
        F.lIIIIlIIl[282] = 0xFFFFC5C8 & 0x3B37;
        F.lIIIIlIIl[283] = 0xFFFFE945 & 0x17BB;
        F.lIIIIlIIl[284] = -(0xFFFFE3ED & 0x3E37) & (0xFFFFB3EE & 0x6F37);
        F.lIIIIlIIl[285] = -(0xFFFFB619 & 0x5FEF) & (0xFFFFDF8B & 0x377F);
        F.lIIIIlIIl[286] = -(0xFFFFFF3B & 0x5AE7) & (0xFFFFFB7E & 0x5FA7);
        F.lIIIIlIIl[287] = -(0xFFFF95DB & 0x7EB7) & (0xFFFF9DD7 & 0x77BF);
        F.lIIIIlIIl[288] = -(0xFFFFFEF9 & 0x27DF) & (0xFFFFA7DF & 0x7FFE);
        F.lIIIIlIIl[289] = 0xFFFFC7EF & 0x3917;
        F.lIIIIlIIl[290] = -(0xFFFFF7AF & 0x1CD7) & (0xFFFFFD8E & 0x17FF);
        F.lIIIIlIIl[291] = -(0xFFFFF79B & 0x6CF5) & (0xFFFFFDFD & 0x679B);
        F.lIIIIlIIl[292] = 0xFFFFA79E & 0x596B;
        F.lIIIIlIIl[293] = -(0xFFFFFADF & 0x2FB1) & (0xFFFFAFFF & 0x7B9B);
        F.lIIIIlIIl[294] = 0xFFFFC39E & 0x3D6D;
        F.lIIIIlIIl[295] = 0xFFFFEFEF & 0x111D;
        F.lIIIIlIIl[296] = 0xFFFF814E & 0x7FBF;
        F.lIIIIlIIl[297] = 0xFFFFFF1F & 0x1EF;
        F.lIIIIlIIl[298] = 0xFFFF9F1C & 0x61F3;
        F.lIIIIlIIl[299] = -(0xFFFFFEDD & 0x6D27) & (0xFFFFED37 & 0x7FDD);
        F.lIIIIlIIl[300] = 0xFFFFE512 & 0x1BFF;
        F.lIIIIlIIl[301] = 0xFFFFF5FB & 0xB17;
        F.lIIIIlIIl[302] = 0xFFFFAD3C & 0x53D7;
        F.lIIIIlIIl[303] = -(0xFFFFFF7A & 0x60AF) & (0xFFFFF7FF & 0x6FFF);
        F.lIIIIlIIl[304] = -(0xFFFFB3C5 & 0x6EFB) & (0xFFFFB7E7 & 0x6BFF);
        F.lIIIIlIIl[305] = 0xFFFFC9D7 & 0x373D;
        F.lIIIIlIIl[306] = -(0xFFFFF97F & 0x7EA2) & (0xFFFFFFFF & Short.MAX_VALUE);
        F.lIIIIlIIl[307] = 0xFFFFC379 & 0x3DAE;
        F.lIIIIlIIl[308] = -(0xFFFFFFB1 & 0x28EF) & (0xFFFFFBB6 & 0x2DFF);
        F.lIIIIlIIl[309] = 0xFFFFC7B7 & 0x395F;
        F.lIIIIlIIl[310] = -(0xFFFFE16F & 0x7ED5) & (0xFFFFF3DF & 0x6D7C);
        F.lIIIIlIIl[311] = 0xFFFFE31F & 0x1DF9;
        F.lIIIIlIIl[312] = 0xFFFFE7DE & 0x193B;
        F.lIIIIlIIl[313] = -(0xFFFFDEF5 & 0x75CB) & (0xFFFFF5DB & 0x5FFF);
        F.lIIIIlIIl[314] = 0xFFFFAF1C & 0x51FF;
        F.lIIIIlIIl[315] = 0xFFFFAFBC & 0x5BFB;
        F.lIIIIlIIl[316] = 0xFFFFBBDF & 0x7571;
        F.lIIIIlIIl[317] = 0xFFFFBFE9 & 0x43FE;
        F.lIIIIlIIl[318] = -(0xFFFFF263 & 0x3DBF) & (0xFFFFBFFF & 0x7F2F);
        F.lIIIIlIIl[319] = 0xFFFFB7DE & 0x4FF1;
        F.lIIIIlIIl[320] = -(0xFFFFEFEE & 0x1173) & (0xFFFFFFFF & 0x3BF9);
        F.lIIIIlIIl[321] = -(0xFFFF91BD & 0x6F56) & (0xFFFFFFFF & 0x2FDF);
        F.lIIIIlIIl[322] = -(0xFFFFB5DE & 0x6EB7) & (0xFFFFEEFF & 0x77FD);
        F.lIIIIlIIl[323] = -(35 + 91 - 41 + 60) & (0xFFFFBFFF & 0x5FD7);
        F.lIIIIlIIl[324] = 0xFFFFF5FD & 0xF16;
        F.lIIIIlIIl[325] = -(0xFFFFFE23 & 0x6FFD) & (0xFFFFEF7F & 0x7FBD);
        F.lIIIIlIIl[326] = 0xFFFF83BF & 0x7D5E;
        F.lIIIIlIIl[327] = 0xFFFFED9F & 0x137F;
        F.lIIIIlIIl[328] = -(0xFFFFEFF5 & 0x325F) & (0xFFFFAFF7 & 0x737C);
        F.lIIIIlIIl[329] = 0xFFFFB169 & 0x4FB7;
        F.lIIIIlIIl[330] = -(0xFFFFFE6D & 0x5D9F) & (0xFFFFFD7F & 0x5FAE);
        F.lIIIIlIIl[331] = 0xFFFFB1B7 & 0x4F6B;
        F.lIIIIlIIl[332] = -(0xFFFFFFDF & 0x3AB9) & (0xFFFFBFFF & 0x7BBC);
        F.lIIIIlIIl[333] = -(0xFFFFD6F7 & 0x7979) & (0xFFFFDF7F & Short.MAX_VALUE);
        F.lIIIIlIIl[334] = 0xFFFFEFF3 & 0x1F1D;
        F.lIIIIlIIl[335] = 0xFFFF8F73 & 0x7F9F;
        F.lIIIIlIIl[336] = 0xFFFF9FBD & 0x6F57;
        F.lIIIIlIIl[337] = 0xFFFF8FF7 & 0x7F1F;
        F.lIIIIlIIl[338] = 0xFFFFBFBD & 0x4F5B;
        F.lIIIIlIIl[339] = 0xFFFF8FFF & 0x7F1B;
        F.lIIIIlIIl[340] = -(93 + 85 - 55 + 18) & (0xFFFFB1DF & Short.MAX_VALUE);
        F.lIIIIlIIl[341] = 0xFFFFB5FD & 0x7B57;
        F.lIIIIlIIl[342] = -(0xFFFFF5DD & 0x4A2B) & (0xFFFFF15F & Short.MAX_VALUE);
        F.lIIIIlIIl[343] = 0xFFFFFFFB & 0x9FE;
        F.lIIIIlIIl[344] = 0xFFFFADFF & 0x5BFE;
        F.lIIIIlIIl[345] = 0xFFFFCBAB & 0x3E54;
        F.lIIIIlIIl[346] = 0xFFFF8F2F & 0x7AD2;
        F.lIIIIlIIl[347] = 0xFFFF9BA7 & 0x6E5C;
        F.lIIIIlIIl[348] = -(0xFFFFE677 & 0x5F8B) & (0xFFFFEFFE & 0x5FFF);
        F.lIIIIlIIl[349] = 0xFFFFEE17 & 0x1BEE;
        F.lIIIIlIIl[350] = 0xFFFFE7AD & 0x3EFF;
        F.lIIIIlIIl[351] = -(0xFFFFB725 & 0x6DFF) & (0xFFFFFFBF & 0x2F6D);
        F.lIIIIlIIl[352] = 0xFFFFE7B7 & 0x3EFE;
        F.lIIIIlIIl[353] = -(0xFFFFD5EE & 0x3B55) & (0xFFFFBFFB & 0x77FF);
        F.lIIIIlIIl[354] = 0xFFFFE6FE & 0x3FBB;
        F.lIIIIlIIl[355] = 0xFFFFCDEF & 0x3BD9;
        F.lIIIIlIIl[356] = 0xFFFF8E76 & 0x7DFF;
        F.lIIIIlIIl[357] = 0xFFFFB9FA & 0x4FDF;
        F.lIIIIlIIl[358] = -(0xFFFFB60E & 0x7BFF) & (0xFFFFFFFF & 0x3E7D);
        F.lIIIIlIIl[359] = 0xFFFFF9FB & 0xFED;
        F.lIIIIlIIl[360] = -(0xFFFFBA87 & 0x47FF) & (0xFFFF9EEF & 0x6FFF);
        F.lIIIIlIIl[361] = -(0xFFFFB3BF & 0x6C45) & (0xFFFFABFD & 0x7DF7);
        F.lIIIIlIIl[362] = -1 & (0xFFFFEFFF & 0x1C57);
        F.lIIIIlIIl[363] = -(0xFFFFFBFD & 0x560B) & (0xFFFFFFFF & 0x5BEE);
        F.lIIIIlIIl[364] = -(0xFFFFD7DD & 0x7A23) & (0xFFFFDFD7 & 0x7E7B);
        F.lIIIIlIIl[365] = -(0xFFFFBE6D & 0x75B7) & (0xFFFFBFFF & 0x7DF7);
        F.lIIIIlIIl[366] = -(0xFFFFD7F5 & 0x7A2B) & (0xFFFFFBFF & 0x5FFF);
        F.lIIIIlIIl[367] = 0xFFFF8D57 & 0x7FFD;
        F.lIIIIlIIl[368] = -(0xFFFFB23F & 0x4FF2) & (0xFFFFDFFF & 0x2BFF);
        F.lIIIIlIIl[369] = -(0xFFFFC2B6 & 0x7F4B) & (0xFFFFDFBF & 0x6FE7);
        F.lIIIIlIIl[370] = -(0xFFFFB7CD & 0x6BB3) & (0xFFFFEFFD & 0x3FDF);
        F.lIIIIlIIl[371] = 0xFFFFAFDF & 0x5DBE;
        F.lIIIIlIIl[372] = -(0xFFFFFEFF & 0x321) & (0xFFFFCBFB & 0x3FFD);
        F.lIIIIlIIl[373] = -(0xFFFFE2BF & 0x5F51) & (0xFFFFEFBE & 0x5FF9);
        F.lIIIIlIIl[374] = -(0xFFFFFDFF & 0x362F) & (0xFFFFFFFE & 0x3DFF);
        F.lIIIIlIIl[375] = -(0xFFFFF68F & 0x4B71) & (0xFFFFEFB5 & 0x5FDF);
        F.lIIIIlIIl[376] = -(0xFFFFFBEF & 0x741B) & (0xFFFFFFFF & 0x79DB);
        F.lIIIIlIIl[377] = 0xFFFFBDFD & 0x4F8E;
        F.lIIIIlIIl[378] = -(0xFFFFD26D & 0x7FD3) & (0xFFFFDFDF & 0x7FF9);
        F.lIIIIlIIl[379] = 0xFFFFDDFF & 0x2BD7;
        F.lIIIIlIIl[380] = -(0xFFFFF8D3 & 0x17BD) & (0xFFFFBDF6 & 0x5FFF);
        F.lIIIIlIIl[381] = -(0xFFFFFFDB & 0x40BD) & (0xFFFFCFFB & 0x7DFF);
        F.lIIIIlIIl[382] = 0xFFFFDF75 & 0x2CDE;
        F.lIIIIlIIl[383] = 0xFFFFE9FC & 0x1FF7;
        F.lIIIIlIIl[384] = 0xFFFFBFFE & 0x655F;
        F.lIIIIlIIl[385] = -(0xFFFFCB73 & 0x3E8E) & (0xFFFFAFF7 & 0x7F6F);
        F.lIIIIlIIl[386] = -(0xFFFFAFDF & 0x5429) & (0xFFFFEDFF & 0x1FEF);
        F.lIIIIlIIl[387] = -(0xFFFFCFDB & 0x322F) & (0xFFFFCFFF & 0x3FFF);
        F.lIIIIlIIl[388] = 0xFFFFEBFD & 0x1DFF;
        F.lIIIIlIIl[389] = 0xFFFFFF77 & 0xDFD;
        F.lIIIIlIIl[390] = -(0xFFFFB2DB & 0x6F2F) & (0xFFFFBFFF & 0x6BEF);
        F.lIIIIlIIl[391] = -(0xFFFFFF23 & 0x11DF) & (0xFFFFFF77 & 0x37FE);
        F.lIIIIlIIl[392] = -(0xFFFFAF15 & 0x74FB) & (0xFFFFAFFE & 0x7DFF);
        F.lIIIIlIIl[393] = -(0xFFFF9FED & 0x79BF) & (0xFFFFBFFF & 0x7FFE);
        F.lIIIIlIIl[394] = 0xFFFFFDFF & 0xBCF;
        F.lIIIIlIIl[395] = 0xFFFFAFC7 & 0x5DBF;
        F.lIIIIlIIl[396] = 0xFFFFFA3D & 0xFDE;
        F.lIIIIlIIl[397] = 0xFFFFBEBB & 0x67E4;
        F.lIIIIlIIl[398] = -(0xFFFFF3B9 & 0x7DCE) & (0xFFFFFF9F & 0x7BEF);
        F.lIIIIlIIl[399] = 0xFFFFAEED & 0x77B7;
        F.lIIIIlIIl[400] = 0xFFFFDF8F & 0x2A73;
        F.lIIIIlIIl[401] = -(0xFFFFFB1D & 0x5EEB) & (0xFFFFFF7F & 0x7FFE);
        F.lIIIIlIIl[402] = -(0xFFFFDFD7 & 0x68FF) & (0xFFFFDDFF & 0x6BFF);
        F.lIIIIlIIl[403] = 0xFFFFA9AB & 0x577F;
        F.lIIIIlIIl[404] = 0xFFFF81FC & 0x7F2F;
        F.lIIIIlIIl[405] = -(0xFFFFAFDB & 0x5EE7) & (0xFFFFEFEF & 0x1FFF);
        F.lIIIIlIIl[406] = 0xFFFFB6AF & 0x6FFE;
        F.lIIIIlIIl[407] = -(0xFFFFE543 & 0x7EFD) & (0xFFFFFDFF & 0x6FFF);
        F.lIIIIlIIl[408] = -(0xFFFFF16B & 0x7E95) & (0xFFFFFDFD & 0x7E3F);
        F.lIIIIlIIl[409] = 0xFFFFDFEF & 0x29D6;
        F.lIIIIlIIl[410] = -(0xFFFFCFCB & 0x33B7) & (0xFFFF9FFA & 0x6FFF);
        F.lIIIIlIIl[411] = 0xFFFFB9DD & 0x4FEF;
        F.lIIIIlIIl[412] = 0xFFFFAFFE & 0x5D6F;
        F.lIIIIlIIl[413] = 0xFFFFBF7E & 0x41AF;
    }

    private static boolean llIlllIlIIl(Object object) {
        return object == null;
    }

    private static String llIlIllllll(String lIIlIIlIIIlllIl, String lIIlIIlIIIllllI) {
        try {
            SecretKeySpec lIIlIIlIIlIIIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIIlIIlIIIllllI.getBytes(StandardCharsets.UTF_8)), lIIIIlIIl[13]), "DES");
            Cipher lIIlIIlIIlIIIIl = Cipher.getInstance("DES");
            lIIlIIlIIlIIIIl.init(lIIIIlIIl[3], lIIlIIlIIlIIIlI);
            return new String(lIIlIIlIIlIIIIl.doFinal(Base64.getDecoder().decode(lIIlIIlIIIlllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIIlIIlIIlIIIII) {
            lIIlIIlIIlIIIII.printStackTrace();
            return null;
        }
    }

    private static String llIllIIIIII(String lIIlIIlIIllllII, String lIIlIIlIlIIIIII) {
        lIIlIIlIIllllII = new String(Base64.getDecoder().decode(lIIlIIlIIllllII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lIIlIIlIIllllll = new StringBuilder();
        char[] lIIlIIlIIlllllI = lIIlIIlIlIIIIII.toCharArray();
        int lIIlIIlIIllllIl = lIIIIlIIl[0];
        char[] lIIlIIlIIllIlll = lIIlIIlIIllllII.toCharArray();
        int lIIlIIlIIllIllI = lIIlIIlIIllIlll.length;
        int lIIlIIlIIllIlIl = lIIIIlIIl[0];
        while (F.llIlllIIIII(lIIlIIlIIllIlIl, lIIlIIlIIllIllI)) {
            char lIIlIIlIlIIIIlI = lIIlIIlIIllIlll[lIIlIIlIIllIlIl];
            lIIlIIlIIllllll.append((char)(lIIlIIlIlIIIIlI ^ lIIlIIlIIlllllI[lIIlIIlIIllllIl % lIIlIIlIIlllllI.length]));
            0;
            ++lIIlIIlIIllllIl;
            ++lIIlIIlIIllIlIl;
            0;
            if ((0xC ^ 0x41 ^ (0x6F ^ 0x26)) >= 0) continue;
            return null;
        }
        return String.valueOf(lIIlIIlIIllllll);
    }

    private static boolean llIlllIIIlI(int n2, int n3) {
        return n2 > n3;
    }

    private static void llIllIlIIII() {
        lIIIIIlIl = new String[lIIIIlIIl[413]];
        F.lIIIIIlIl[F.lIIIIlIIl[0]] = F."Buying items";
        F.lIIIIIlIl[F.lIIIIlIIl[1]] = F."Finished buying items, switching back to questing";
        F.lIIIIIlIl[F.lIIIIlIIl[3]] = F."Drink";
        F.lIIIIIlIl[F.lIIIIlIIl[5]] = F."Shark";
        F.lIIIIIlIl[F.lIIIIlIIl[6]] = F."Shark";
        F.lIIIIIlIl[F.lIIIIlIIl[7]] = F."Eat";
        F.lIIIIIlIl[F.lIIIIlIIl[11]] = F."Navigating to bank";
        F.lIIIIIlIl[F.lIIIIlIIl[9]] = F."Opening bank";
        F.lIIIIIlIl[F.lIIIIlIIl[13]] = F."Handling banking";
        F.lIIIIIlIl[F.lIIIIlIIl[17]] = F."We are missing runessupplies, switching to BUYING";
        F.lIIIIIlIl[F.lIIIIlIIl[19]] = F."Rope";
        F.lIIIIIlIl[F.lIIIIlIIl[21]] = F."Shark";
        F.lIIIIIlIl[F.lIIIIlIIl[22]] = F."We are missing supplies, switching to BUYING";
        F.lIIIIIlIl[F.lIIIIlIIl[23]] = F."Rope";
        F.lIIIIIlIl[F.lIIIIlIIl[4]] = F."Shark";
        F.lIIIIIlIl[F.lIIIIlIIl[26]] = F."Drink";
        F.lIIIIIlIl[F.lIIIIlIIl[27]] = F."Nav to start";
        F.lIIIIIlIl[F.lIIIIlIIl[28]] = F."Chatting";
        F.lIIIIIlIl[F.lIIIIlIIl[25]] = F."Nav to boy";
        F.lIIIIIlIl[F.lIIIIlIIl[29]] = F."Chat boy";
        F.lIIIIIlIl[F.lIIIIlIIl[30]] = F."Nav to bookcase";
        F.lIIIIIlIl[F.lIIIIlIIl[32]] = F."Book on baxtorian";
        F.lIIIIIlIl[F.lIIIIlIIl[33]] = F."Searching bookcase";
        F.lIIIIIlIl[F.lIIIIlIIl[34]] = F."Search";
        F.lIIIIIlIl[F.lIIIIlIIl[35]] = F."Book on baxtorian";
        F.lIIIIIlIl[F.lIIIIlIIl[37]] = F."Book on baxtorian";
        F.lIIIIIlIl[F.lIIIIlIIl[38]] = F."Reading";
        F.lIIIIIlIl[F.lIIIIlIIl[39]] = F."Read";
        F.lIIIIIlIl[F.lIIIIlIIl[42]] = F."Tele to CW";
        F.lIIIIIlIl[F.lIIIIlIIl[43]] = F."Wear";
        F.lIIIIIlIl[F.lIIIIlIIl[44]] = F."Castle Wars";
        F.lIIIIIlIl[F.lIIIIlIIl[45]] = F."Nav to maze ladder";
        F.lIIIIIlIl[F.lIIIIlIIl[46]] = F."Fountain";
        F.lIIIIIlIl[F.lIIIIlIIl[48]] = F."Climb-down";
        F.lIIIIIlIl[F.lIIIIlIIl[50]] = F."nav to box";
        F.lIIIIIlIl[F.lIIIIlIIl[51]] = F."Searching crate";
        F.lIIIIIlIl[F.lIIIIlIIl[52]] = F."Search";
        F.lIIIIIlIl[F.lIIIIlIIl[54]] = F."Nav to cage";
        F.lIIIIIlIl[F.lIIIIlIIl[56]] = F."Entering cage";
        F.lIIIIIlIl[F.lIIIIlIIl[57]] = F."Chat npc";
        F.lIIIIIlIl[F.lIIIIlIIl[58]] = F."Air rune";
        F.lIIIIIlIl[F.lIIIIlIIl[59]] = F."Earth rune";
        F.lIIIIIlIl[F.lIIIIlIIl[60]] = F."Nav to tombstone";
        F.lIIIIIlIl[F.lIIIIlIIl[61]] = F."Wear";
        F.lIIIIIlIl[F.lIIIIlIIl[62]] = F."Air rune";
        F.lIIIIIlIl[F.lIIIIlIIl[63]] = F."Earth rune";
        F.lIIIIIlIl[F.lIIIIlIIl[64]] = F."Entering tomb";
        F.lIIIIIlIl[F.lIIIIlIIl[67]] = F."Stalagmite";
        F.lIIIIIlIl[F.lIIIIlIIl[68]] = F."Glarial's amulet";
        F.lIIIIIlIl[F.lIIIIlIIl[69]] = F."Glarial's urn";
        F.lIIIIIlIl[F.lIIIIlIIl[2]] = F."Getting ammy";
        F.lIIIIIlIl[F.lIIIIlIIl[71]] = F."Open";
        F.lIIIIIlIl[F.lIIIIlIIl[73]] = F."Search";
        F.lIIIIIlIl[F.lIIIIlIIl[74]] = F."Stalagmite";
        F.lIIIIIlIl[F.lIIIIlIIl[75]] = F."Glarial's amulet";
        F.lIIIIIlIl[F.lIIIIlIIl[76]] = F."Glarial's urn";
        F.lIIIIIlIl[F.lIIIIlIIl[77]] = F."Getting ammy";
        F.lIIIIIlIl[F.lIIIIlIIl[78]] = F."Open";
        F.lIIIIIlIl[F.lIIIIlIIl[79]] = F."Search";
        F.lIIIIIlIl[F.lIIIIlIIl[80]] = F."Stalagmite";
        F.lIIIIIlIl[F.lIIIIlIIl[82]] = F."Glarial's amulet";
        F.lIIIIIlIl[F.lIIIIlIIl[83]] = F."Glarial's urn";
        F.lIIIIIlIl[F.lIIIIlIIl[84]] = F."Getting ashes";
        F.lIIIIIlIl[F.lIIIIlIIl[85]] = F."Search";
        F.lIIIIIlIl[F.lIIIIlIIl[86]] = F."Air rune";
        F.lIIIIIlIl[F.lIIIIlIIl[10]] = F."Earth rune";
        F.lIIIIIlIl[F.lIIIIlIIl[87]] = F."Water rune";
        F.lIIIIIlIl[F.lIIIIlIIl[88]] = F."Glarial's amulet";
        F.lIIIIIlIl[F.lIIIIlIIl[89]] = F."Glarial's urn";
        F.lIIIIIlIl[F.lIIIIlIIl[90]] = F."Nav to bank";
        F.lIIIIIlIl[F.lIIIIlIIl[91]] = F."Wear";
        F.lIIIIIlIl[F.lIIIIlIIl[92]] = F."Air rune";
        F.lIIIIIlIl[F.lIIIIlIIl[93]] = F."Earth rune";
        F.lIIIIIlIl[F.lIIIIlIIl[94]] = F."Water rune";
        F.lIIIIIlIl[F.lIIIIlIIl[95]] = F."Glarial's amulet";
        F.lIIIIIlIl[F.lIIIIlIIl[96]] = F."Glarial's urn";
        F.lIIIIIlIl[F.lIIIIlIIl[97]] = F."Opening bank";
        F.lIIIIIlIl[F.lIIIIlIIl[98]] = F."Withdrawing runes";
        F.lIIIIIlIl[F.lIIIIlIIl[99]] = F."Vial";
        F.lIIIIIlIl[F.lIIIIlIIl[100]] = F."Shark";
        F.lIIIIIlIl[F.lIIIIlIIl[101]] = F."Air rune";
        F.lIIIIIlIl[F.lIIIIlIIl[102]] = F."Air rune";
        F.lIIIIIlIl[F.lIIIIlIIl[103]] = F."Air rune";
        F.lIIIIIlIl[F.lIIIIlIIl[104]] = F."Air rune";
        F.lIIIIIlIl[F.lIIIIlIIl[105]] = F."Air rune";
        F.lIIIIIlIl[F.lIIIIlIIl[106]] = F."Earth rune";
        F.lIIIIIlIl[F.lIIIIlIIl[107]] = F."Earth rune";
        F.lIIIIIlIl[F.lIIIIlIIl[108]] = F."Earth rune";
        F.lIIIIIlIl[F.lIIIIlIIl[109]] = F."Earth rune";
        F.lIIIIIlIl[F.lIIIIlIIl[110]] = F."Earth rune";
        F.lIIIIIlIl[F.lIIIIlIIl[111]] = F."Water rune";
        F.lIIIIIlIl[F.lIIIIlIIl[112]] = F."Water rune";
        F.lIIIIIlIl[F.lIIIIlIIl[113]] = F."Water rune";
        F.lIIIIIlIl[F.lIIIIlIIl[114]] = F."Water rune";
        F.lIIIIIlIl[F.lIIIIlIIl[115]] = F."Water rune";
        F.lIIIIIlIl[F.lIIIIlIIl[116]] = F."Air rune";
        F.lIIIIIlIl[F.lIIIIlIIl[117]] = F."Air rune";
        F.lIIIIIlIl[F.lIIIIlIIl[118]] = F."Earth rune";
        F.lIIIIIlIl[F.lIIIIlIIl[119]] = F."Earth rune";
        F.lIIIIIlIl[F.lIIIIlIIl[120]] = F."Water rune";
        F.lIIIIIlIl[F.lIIIIlIIl[121]] = F."Water rune";
        F.lIIIIIlIl[F.lIIIIlIIl[122]] = F."Glarial's amulet";
        F.lIIIIIlIl[F.lIIIIlIIl[123]] = F."Glarial's urn";
        F.lIIIIIlIl[F.lIIIIlIIl[124]] = F."Nav to door entrance";
        F.lIIIIIlIl[F.lIIIIlIIl[125]] = F."Rope";
        F.lIIIIIlIl[F.lIIIIlIIl[126]] = F."Rock";
        F.lIIIIIlIl[F.lIIIIlIIl[127]] = F."Roping rock";
        F.lIIIIIlIl[F.lIIIIlIIl[129]] = F."Rope";
        F.lIIIIIlIl[F.lIIIIlIIl[131]] = F."Roping tree";
        F.lIIIIIlIl[F.lIIIIlIIl[132]] = F."Door";
        F.lIIIIIlIl[F.lIIIIlIIl[133]] = F."Entering door";
        F.lIIIIIlIl[F.lIIIIlIIl[134]] = F."Open";
        F.lIIIIIlIl[F.lIIIIlIIl[135]] = F."Air rune";
        F.lIIIIIlIl[F.lIIIIlIIl[136]] = F."Air rune";
        F.lIIIIIlIl[F.lIIIIlIIl[137]] = F."Earth rune";
        F.lIIIIIlIl[F.lIIIIlIIl[138]] = F."Earth rune";
        F.lIIIIIlIl[F.lIIIIlIIl[139]] = F."Water rune";
        F.lIIIIIlIl[F.lIIIIlIIl[140]] = F."Water rune";
        F.lIIIIIlIl[F.lIIIIlIIl[141]] = F."Glarial's amulet";
        F.lIIIIIlIl[F.lIIIIlIIl[142]] = F."Glarial's urn";
        F.lIIIIIlIl[F.lIIIIlIIl[144]] = F."Nav to key and get";
        F.lIIIIIlIl[F.lIIIIlIIl[146]] = F."Search";
        F.lIIIIIlIl[F.lIIIIlIIl[147]] = F."Air rune";
        F.lIIIIIlIl[F.lIIIIlIIl[148]] = F."Air rune";
        F.lIIIIIlIl[F.lIIIIlIIl[149]] = F."Earth rune";
        F.lIIIIIlIl[F.lIIIIlIIl[150]] = F."Earth rune";
        F.lIIIIIlIl[F.lIIIIlIIl[151]] = F."Water rune";
        F.lIIIIIlIl[F.lIIIIlIIl[152]] = F."Water rune";
        F.lIIIIIlIl[F.lIIIIlIIl[153]] = F."Glarial's amulet";
        F.lIIIIIlIl[F.lIIIIlIIl[154]] = F."Glarial's urn";
        F.lIIIIIlIl[F.lIIIIlIIl[155]] = F."Nav to last room";
        F.lIIIIIlIl[F.lIIIIlIIl[156]] = F."Air rune";
        F.lIIIIIlIl[F.lIIIIlIIl[157]] = F."Air rune";
        F.lIIIIIlIl[F.lIIIIlIIl[158]] = F."Earth rune";
        F.lIIIIIlIl[F.lIIIIlIIl[159]] = F."Earth rune";
        F.lIIIIIlIl[F.lIIIIlIIl[160]] = F."Water rune";
        F.lIIIIIlIl[F.lIIIIlIIl[161]] = F."Water rune";
        F.lIIIIIlIl[F.lIIIIlIIl[162]] = F."Glarial's amulet";
        F.lIIIIIlIl[F.lIIIIlIIl[163]] = F."Glarial's urn";
        F.lIIIIIlIl[F.lIIIIlIIl[164]] = F."Door";
        F.lIIIIIlIl[F.lIIIIlIIl[166]] = F."Air rune";
        F.lIIIIIlIl[F.lIIIIlIIl[167]] = F."Air rune";
        F.lIIIIIlIl[F.lIIIIlIIl[168]] = F."Earth rune";
        F.lIIIIIlIl[F.lIIIIlIIl[169]] = F."Earth rune";
        F.lIIIIIlIl[F.lIIIIlIIl[170]] = F."Water rune";
        F.lIIIIIlIl[F.lIIIIlIIl[171]] = F."Water rune";
        F.lIIIIIlIl[F.lIIIIlIIl[172]] = F."Glarial's amulet";
        F.lIIIIIlIl[F.lIIIIlIIl[173]] = F."Glarial's urn";
        F.lIIIIIlIl[F.lIIIIlIIl[174]] = F."Door";
        F.lIIIIIlIl[F.lIIIIlIIl[175]] = F."Open";
        F.lIIIIIlIl[F.lIIIIlIIl[176]] = F."Air rune";
        F.lIIIIIlIl[F.lIIIIlIIl[177]] = F."Air rune";
        F.lIIIIIlIl[F.lIIIIlIIl[178]] = F."Earth rune";
        F.lIIIIIlIl[F.lIIIIlIIl[179]] = F."Earth rune";
        F.lIIIIIlIl[F.lIIIIlIIl[180]] = F."Water rune";
        F.lIIIIIlIl[F.lIIIIlIIl[181]] = F."Water rune";
        F.lIIIIIlIl[F.lIIIIlIIl[182]] = F."Glarial's amulet";
        F.lIIIIIlIl[F.lIIIIlIIl[183]] = F."Glarial's urn";
        F.lIIIIIlIl[F.lIIIIlIIl[184]] = F."Nav to SE Pillar";
        F.lIIIIIlIl[F.lIIIIlIIl[185]] = F."Air rune";
        F.lIIIIIlIl[F.lIIIIlIIl[186]] = F."Air rune";
        F.lIIIIIlIl[F.lIIIIlIIl[187]] = F."Earth rune";
        F.lIIIIIlIl[F.lIIIIlIIl[188]] = F."Earth rune";
        F.lIIIIIlIl[F.lIIIIlIIl[189]] = F."Water rune";
        F.lIIIIIlIl[F.lIIIIlIIl[190]] = F."Water rune";
        F.lIIIIIlIl[F.lIIIIlIIl[191]] = F."Glarial's amulet";
        F.lIIIIIlIl[F.lIIIIlIIl[192]] = F."Glarial's urn";
        F.lIIIIIlIl[F.lIIIIlIIl[193]] = F."Using runes";
        F.lIIIIIlIl[F.lIIIIlIIl[194]] = F."Air rune";
        F.lIIIIIlIl[F.lIIIIlIIl[195]] = F."Air rune";
        F.lIIIIIlIl[F.lIIIIlIIl[196]] = F."Earth rune";
        F.lIIIIIlIl[F.lIIIIlIIl[197]] = F."Earth rune";
        F.lIIIIIlIl[F.lIIIIlIIl[198]] = F."Water rune";
        F.lIIIIIlIl[F.lIIIIlIIl[199]] = F."Water rune";
        F.lIIIIIlIl[F.lIIIIlIIl[201]] = F."Air rune";
        F.lIIIIIlIl[F.lIIIIlIIl[202]] = F."Earth rune";
        F.lIIIIIlIl[F.lIIIIlIIl[203]] = F."Water rune";
        F.lIIIIIlIl[F.lIIIIlIIl[204]] = F."Air rune";
        F.lIIIIIlIl[F.lIIIIlIIl[205]] = F."Air rune";
        F.lIIIIIlIl[F.lIIIIlIIl[206]] = F."Earth rune";
        F.lIIIIIlIl[F.lIIIIlIIl[207]] = F."Earth rune";
        F.lIIIIIlIl[F.lIIIIlIIl[208]] = F."Water rune";
        F.lIIIIIlIl[F.lIIIIlIIl[209]] = F."Water rune";
        F.lIIIIIlIl[F.lIIIIlIIl[210]] = F."Glarial's amulet";
        F.lIIIIIlIl[F.lIIIIlIIl[211]] = F."Glarial's urn";
        F.lIIIIIlIl[F.lIIIIlIIl[212]] = F."Using runes";
        F.lIIIIIlIl[F.lIIIIlIIl[213]] = F."Air rune";
        F.lIIIIIlIl[F.lIIIIlIIl[214]] = F."Air rune";
        F.lIIIIIlIl[F.lIIIIlIIl[215]] = F."Earth rune";
        F.lIIIIIlIl[F.lIIIIlIIl[216]] = F."Earth rune";
        F.lIIIIIlIl[F.lIIIIlIIl[217]] = F."Water rune";
        F.lIIIIIlIl[F.lIIIIlIIl[218]] = F."Water rune";
        F.lIIIIIlIl[F.lIIIIlIIl[219]] = F."Air rune";
        F.lIIIIIlIl[F.lIIIIlIIl[220]] = F."Earth rune";
        F.lIIIIIlIl[F.lIIIIlIIl[221]] = F."Water rune";
        F.lIIIIIlIl[F.lIIIIlIIl[222]] = F."Air rune";
        F.lIIIIIlIl[F.lIIIIlIIl[223]] = F."Air rune";
        F.lIIIIIlIl[F.lIIIIlIIl[224]] = F."Earth rune";
        F.lIIIIIlIl[F.lIIIIlIIl[225]] = F."Earth rune";
        F.lIIIIIlIl[F.lIIIIlIIl[226]] = F."Water rune";
        F.lIIIIIlIl[F.lIIIIlIIl[227]] = F."Water rune";
        F.lIIIIIlIl[F.lIIIIlIIl[228]] = F."Glarial's amulet";
        F.lIIIIIlIl[F.lIIIIlIIl[229]] = F."Glarial's urn";
        F.lIIIIIlIl[F.lIIIIlIIl[230]] = F."Using runes";
        F.lIIIIIlIl[F.lIIIIlIIl[231]] = F."Air rune";
        F.lIIIIIlIl[F.lIIIIlIIl[232]] = F."Air rune";
        F.lIIIIIlIl[F.lIIIIlIIl[233]] = F."Earth rune";
        F.lIIIIIlIl[F.lIIIIlIIl[234]] = F."Earth rune";
        F.lIIIIIlIl[F.lIIIIlIIl[235]] = F."Water rune";
        F.lIIIIIlIl[F.lIIIIlIIl[236]] = F."Water rune";
        F.lIIIIIlIl[F.lIIIIlIIl[237]] = F."Air rune";
        F.lIIIIIlIl[F.lIIIIlIIl[238]] = F."Earth rune";
        F.lIIIIIlIl[F.lIIIIlIIl[239]] = F."Water rune";
        F.lIIIIIlIl[F.lIIIIlIIl[240]] = F."Air rune";
        F.lIIIIIlIl[F.lIIIIlIIl[241]] = F."Air rune";
        F.lIIIIIlIl[F.lIIIIlIIl[242]] = F."Earth rune";
        F.lIIIIIlIl[F.lIIIIlIIl[243]] = F."Earth rune";
        F.lIIIIIlIl[F.lIIIIlIIl[244]] = F."Water rune";
        F.lIIIIIlIl[F.lIIIIlIIl[245]] = F."Water rune";
        F.lIIIIIlIl[F.lIIIIlIIl[246]] = F."Glarial's amulet";
        F.lIIIIIlIl[F.lIIIIlIIl[247]] = F."Glarial's urn";
        F.lIIIIIlIl[F.lIIIIlIIl[248]] = F."Using runes";
        F.lIIIIIlIl[F.lIIIIlIIl[249]] = F."Air rune";
        F.lIIIIIlIl[F.lIIIIlIIl[250]] = F."Air rune";
        F.lIIIIIlIl[F.lIIIIlIIl[251]] = F."Earth rune";
        F.lIIIIIlIl[F.lIIIIlIIl[252]] = F."Earth rune";
        F.lIIIIIlIl[F.lIIIIlIIl[8]] = F."Water rune";
        F.lIIIIIlIl[F.lIIIIlIIl[253]] = F."Water rune";
        F.lIIIIIlIl[F.lIIIIlIIl[254]] = F."Air rune";
        F.lIIIIIlIl[F.lIIIIlIIl[255]] = F."Earth rune";
        F.lIIIIIlIl[F.lIIIIlIIl[256]] = F."Water rune";
        F.lIIIIIlIl[F.lIIIIlIIl[257]] = F."Air rune";
        F.lIIIIIlIl[F.lIIIIlIIl[258]] = F."Air rune";
        F.lIIIIIlIl[F.lIIIIlIIl[259]] = F."Earth rune";
        F.lIIIIIlIl[F.lIIIIlIIl[260]] = F."Earth rune";
        F.lIIIIIlIl[F.lIIIIlIIl[261]] = F."Water rune";
        F.lIIIIIlIl[F.lIIIIlIIl[262]] = F."Water rune";
        F.lIIIIIlIl[F.lIIIIlIIl[263]] = F."Glarial's amulet";
        F.lIIIIIlIl[F.lIIIIlIIl[264]] = F."Glarial's urn";
        F.lIIIIIlIl[F.lIIIIlIIl[265]] = F."Using runes";
        F.lIIIIIlIl[F.lIIIIlIIl[266]] = F."Air rune";
        F.lIIIIIlIl[F.lIIIIlIIl[267]] = F."Air rune";
        F.lIIIIIlIl[F.lIIIIlIIl[268]] = F."Earth rune";
        F.lIIIIIlIl[F.lIIIIlIIl[269]] = F."Earth rune";
        F.lIIIIIlIl[F.lIIIIlIIl[270]] = F."Water rune";
        F.lIIIIIlIl[F.lIIIIlIIl[271]] = F."Water rune";
        F.lIIIIIlIl[F.lIIIIlIIl[272]] = F."Air rune";
        F.lIIIIIlIl[F.lIIIIlIIl[273]] = F."Air rune";
        F.lIIIIIlIl[F.lIIIIlIIl[274]] = F."Earth rune";
        F.lIIIIIlIl[F.lIIIIlIIl[275]] = F."Earth rune";
        F.lIIIIIlIl[F.lIIIIlIIl[276]] = F."Water rune";
        F.lIIIIIlIl[F.lIIIIlIIl[277]] = F."Water rune";
        F.lIIIIIlIl[F.lIIIIlIIl[278]] = F."Air rune";
        F.lIIIIIlIl[F.lIIIIlIIl[279]] = F."Air rune";
        F.lIIIIIlIl[F.lIIIIlIIl[280]] = F."Earth rune";
        F.lIIIIIlIl[F.lIIIIlIIl[281]] = F."Earth rune";
        F.lIIIIIlIl[F.lIIIIlIIl[282]] = F."Water rune";
        F.lIIIIIlIl[F.lIIIIlIIl[283]] = F."Water rune";
        F.lIIIIIlIl[F.lIIIIlIIl[284]] = F."Glarial's amulet";
        F.lIIIIIlIl[F.lIIIIlIIl[285]] = F."Glarial's urn";
        F.lIIIIIlIl[F.lIIIIlIIl[286]] = F."Using runes";
        F.lIIIIIlIl[F.lIIIIlIIl[287]] = F."Air rune";
        F.lIIIIIlIl[F.lIIIIlIIl[288]] = F."Air rune";
        F.lIIIIIlIl[F.lIIIIlIIl[289]] = F."Earth rune";
        F.lIIIIIlIl[F.lIIIIlIIl[290]] = F."Earth rune";
        F.lIIIIIlIl[F.lIIIIlIIl[291]] = F."Water rune";
        F.lIIIIIlIl[F.lIIIIlIIl[292]] = F."Water rune";
        F.lIIIIIlIl[F.lIIIIlIIl[293]] = F."Air rune";
        F.lIIIIIlIl[F.lIIIIlIIl[294]] = F."Air rune";
        F.lIIIIIlIl[F.lIIIIlIIl[295]] = F."Earth rune";
        F.lIIIIIlIl[F.lIIIIlIIl[296]] = F."Earth rune";
        F.lIIIIIlIl[F.lIIIIlIIl[297]] = F."Water rune";
        F.lIIIIIlIl[F.lIIIIlIIl[298]] = F."Water rune";
        F.lIIIIIlIl[F.lIIIIlIIl[299]] = F."Air rune";
        F.lIIIIIlIl[F.lIIIIlIIl[300]] = F."Earth rune";
        F.lIIIIIlIl[F.lIIIIlIIl[301]] = F."Water rune";
        F.lIIIIIlIl[F.lIIIIlIIl[302]] = F."Putting neck on statue";
        F.lIIIIIlIl[F.lIIIIlIIl[305]] = F."Putting ashes inside";
        F.lIIIIIlIl[F.lIIIIlIIl[308]] = F."Chalice";
        F.lIIIIIlIl[F.lIIIIlIIl[309]] = F."Statue of Glarial";
        F.lIIIIIlIl[F.lIIIIlIIl[310]] = F."Pillar";
        F.lIIIIIlIl[F.lIIIIlIIl[311]] = F."Teleporting to CW";
        F.lIIIIIlIl[F.lIIIIlIIl[312]] = F."Wear";
        F.lIIIIIlIl[F.lIIIIlIIl[313]] = F."Castle Wars";
        F.lIIIIIlIl[F.lIIIIlIIl[314]] = F."Rope";
        F.lIIIIIlIl[F.lIIIIlIIl[325]] = F."Waterfall quest";
        F.lIIIIIlIl[F.lIIIIlIIl[326]] = F."ring of wealth (";
        F.lIIIIIlIl[F.lIIIIlIIl[327]] = F."Stalagmite";
        F.lIIIIIlIl[F.lIIIIlIIl[328]] = F."Games";
        F.lIIIIIlIl[F.lIIIIlIIl[329]] = F."Games";
        F.lIIIIIlIl[F.lIIIIlIIl[330]] = F."Games";
        F.lIIIIIlIl[F.lIIIIlIIl[331]] = F."dueling";
        F.lIIIIIlIl[F.lIIIIlIIl[332]] = F."dueling";
        F.lIIIIIlIl[F.lIIIIlIIl[40]] = F."dueling";
        F.lIIIIIlIl[F.lIIIIlIIl[41]] = F."dueling";
        F.lIIIIIlIl[F.lIIIIlIIl[304]] = F."dueling";
        F.lIIIIIlIl[F.lIIIIlIIl[307]] = F."How can I help?";
        F.lIIIIIlIl[F.lIIIIlIIl[402]] = F."I'm always happy to help a cook in distress.";
        F.lIIIIIlIl[F.lIIIIlIIl[143]] = F."Yes.";
        F.lIIIIIlIl[F.lIIIIlIIl[403]] = F."Golrie";
        F.lIIIIIlIl[F.lIIIIlIIl[404]] = F."Hudon";
        F.lIIIIIlIl[F.lIIIIlIIl[405]] = F."Almera";
    }

    public static void af() {
        d lIIlIIlIlIIlllI;
        Object lIIlIIlIlIIllll;
        block20: {
            block19: {
                int[] nArray = new int[lIIIIlIIl[1]];
                nArray[F.lIIIIlIIl[0]] = lIIIIlIIl[20];
                if (F.llIlllIIIIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                    d d2 = new d(lIIIIlIIl[20], lIIIIlIIl[44], lIIIIlIIl[315]);
                    bv.add(d2);
                    0;
                }
                int[] nArray2 = new int[lIIIIlIIl[1]];
                nArray2[F.lIIIIlIIl[0]] = lIIIIlIIl[316];
                if (F.llIlllIIIIl(Bank.contains((int[])nArray2) ? 1 : 0)) {
                    lIIlIIlIlIIllll = new d(lIIIIlIIl[316], lIIIIlIIl[7], i.bq);
                    bv.add((d)lIIlIIlIlIIllll);
                    0;
                }
                int[] nArray3 = new int[lIIIIlIIl[1]];
                nArray3[F.lIIIIlIIl[0]] = lIIIIlIIl[14];
                if (F.llIllIlllll(Bank.contains((int[])nArray3) ? 1 : 0)) {
                    int[] nArray4 = new int[lIIIIlIIl[1]];
                    nArray4[F.lIIIIlIIl[0]] = lIIIIlIIl[14];
                    if (F.llIlllIIIII(Bank.getFirst((int[])nArray4).getQuantity(), lIIIIlIIl[11])) {
                        lIIlIIlIlIIllll = new d(lIIIIlIIl[14], lIIIIlIIl[317], lIIIIlIIl[19]);
                        bv.add((d)lIIlIIlIlIIllll);
                        0;
                    }
                }
                int[] nArray5 = new int[lIIIIlIIl[1]];
                nArray5[F.lIIIIlIIl[0]] = lIIIIlIIl[15];
                if (F.llIllIlllll(Bank.contains((int[])nArray5) ? 1 : 0)) {
                    int[] nArray6 = new int[lIIIIlIIl[1]];
                    nArray6[F.lIIIIlIIl[0]] = lIIIIlIIl[15];
                    if (F.llIlllIIIII(Bank.getFirst((int[])nArray6).getQuantity(), lIIIIlIIl[11])) {
                        lIIlIIlIlIIllll = new d(lIIIIlIIl[15], lIIIIlIIl[317], lIIIIlIIl[19]);
                        bv.add((d)lIIlIIlIlIIllll);
                        0;
                    }
                }
                int[] nArray7 = new int[lIIIIlIIl[1]];
                nArray7[F.lIIIIlIIl[0]] = lIIIIlIIl[16];
                if (F.llIllIlllll(Bank.contains((int[])nArray7) ? 1 : 0)) {
                    int[] nArray8 = new int[lIIIIlIIl[1]];
                    nArray8[F.lIIIIlIIl[0]] = lIIIIlIIl[16];
                    if (F.llIlllIIIII(Bank.getFirst((int[])nArray8).getQuantity(), lIIIIlIIl[11])) {
                        lIIlIIlIlIIllll = new d(lIIIIlIIl[16], lIIIIlIIl[317], lIIIIlIIl[19]);
                        bv.add((d)lIIlIIlIlIIllll);
                        0;
                    }
                }
                int[] nArray9 = new int[lIIIIlIIl[1]];
                nArray9[F.lIIIIlIIl[0]] = lIIIIlIIl[14];
                if (F.llIlllIIIIl(Bank.contains((int[])nArray9) ? 1 : 0)) {
                    lIIlIIlIlIIllll = new d(lIIIIlIIl[14], lIIIIlIIl[317], lIIIIlIIl[19]);
                    bv.add((d)lIIlIIlIlIIllll);
                    0;
                }
                int[] nArray10 = new int[lIIIIlIIl[1]];
                nArray10[F.lIIIIlIIl[0]] = lIIIIlIIl[15];
                if (F.llIlllIIIIl(Bank.contains((int[])nArray10) ? 1 : 0)) {
                    lIIlIIlIlIIllll = new d(lIIIIlIIl[15], lIIIIlIIl[317], lIIIIlIIl[19]);
                    bv.add((d)lIIlIIlIlIIllll);
                    0;
                }
                int[] nArray11 = new int[lIIIIlIIl[1]];
                nArray11[F.lIIIIlIIl[0]] = lIIIIlIIl[16];
                if (F.llIlllIIIIl(Bank.contains((int[])nArray11) ? 1 : 0)) {
                    lIIlIIlIlIIllll = new d(lIIIIlIIl[16], lIIIIlIIl[317], lIIIIlIIl[19]);
                    bv.add((d)lIIlIIlIlIIllll);
                    0;
                }
                int[] nArray12 = new int[lIIIIlIIl[1]];
                nArray12[F.lIIIIlIIl[0]] = lIIIIlIIl[14];
                if (F.llIlllIIIIl(Bank.contains((int[])nArray12) ? 1 : 0)) {
                    lIIlIIlIlIIllll = new d(lIIIIlIIl[14], lIIIIlIIl[317], lIIIIlIIl[19]);
                    bv.add((d)lIIlIIlIlIIllll);
                    0;
                }
                int[] nArray13 = new int[lIIIIlIIl[1]];
                nArray13[F.lIIIIlIIl[0]] = lIIIIlIIl[318];
                if (F.llIlllIIIIl(Bank.contains((int[])nArray13) ? 1 : 0)) {
                    lIIlIIlIlIIllll = new d(lIIIIlIIl[318], lIIIIlIIl[7], lIIIIlIIl[315]);
                    bv.add((d)lIIlIIlIlIIllll);
                    0;
                }
                int[] nArray14 = new int[lIIIIlIIl[1]];
                nArray14[F.lIIIIlIIl[0]] = lIIIIlIIl[24];
                if (!F.llIllIlllll(Bank.contains((int[])nArray14) ? 1 : 0)) break block19;
                int[] nArray15 = new int[lIIIIlIIl[1]];
                nArray15[F.lIIIIlIIl[0]] = lIIIIlIIl[24];
                if (!F.llIllIlllll(Bank.contains((int[])nArray15) ? 1 : 0)) break block20;
                int[] nArray16 = new int[lIIIIlIIl[1]];
                nArray16[F.lIIIIlIIl[0]] = lIIIIlIIl[24];
                if (!F.llIlllIIIII(Bank.getFirst((int[])nArray16).getQuantity(), lIIIIlIIl[19])) break block20;
            }
            lIIlIIlIlIIllll = new d(lIIIIlIIl[24], lIIIIlIIl[19], lIIIIlIIl[319]);
            bv.add((d)lIIlIIlIlIIllll);
            0;
        }
        int[] nArray = new int[lIIIIlIIl[1]];
        nArray[F.lIIIIlIIl[0]] = lIIIIlIIl[18];
        if (F.llIlllIIIIl(Bank.contains((int[])nArray) ? 1 : 0)) {
            lIIlIIlIlIIllll = new d(lIIIIlIIl[18], lIIIIlIIl[7], lIIIIlIIl[320]);
            bv.add((d)lIIlIIlIlIIllll);
            0;
        }
        if (F.llIlllIIIIl(Bank.contains((Predicate)(lIIlIIlIlIIllll = item -> item.getName().toLowerCase().contains(lIIIIIlIl[lIIIIlIIl[326]]))) ? 1 : 0)) {
            lIIlIIlIlIIlllI = new d(lIIIIlIIl[321], lIIIIlIIl[25], lIIIIlIIl[322]);
            bv.add(lIIlIIlIlIIlllI);
            0;
        }
        int[] nArray17 = new int[lIIIIlIIl[1]];
        nArray17[F.lIIIIlIIl[0]] = lIIIIlIIl[323];
        if (F.llIlllIIIIl(Bank.contains((int[])nArray17) ? 1 : 0)) {
            lIIlIIlIlIIlllI = new d(lIIIIlIIl[323], lIIIIlIIl[58], lIIIIlIIl[324]);
            bv.add(lIIlIIlIlIIlllI);
            0;
        }
    }

    static {
        F.llIllIllllI();
        F.llIllIlIIII();
        gs = lIIIIlIIl[11];
        gu = lIIIIlIIl[19];
        go = lIIIIlIIl[3];
        gm = lIIIIlIIl[10];
        gr = lIIIIlIIl[7];
        hb = lIIIIlIIl[143];
        gp = lIIIIlIIl[5];
        gX = lIIIIlIIl[49];
        gn = lIIIIlIIl[1];
        gZ = lIIIIlIIl[303];
        gt = lIIIIlIIl[13];
        gq = lIIIIlIIl[6];
        gY = lIIIIlIIl[145];
        ha = lIIIIlIIl[306];
        int[] nArray = new int[lIIIIlIIl[17]];
        nArray[F.lIIIIlIIl[0]] = lIIIIlIIl[318];
        nArray[F.lIIIIlIIl[1]] = lIIIIlIIl[333];
        nArray[F.lIIIIlIIl[3]] = lIIIIlIIl[334];
        nArray[F.lIIIIlIIl[5]] = lIIIIlIIl[335];
        nArray[F.lIIIIlIIl[6]] = lIIIIlIIl[336];
        nArray[F.lIIIIlIIl[7]] = lIIIIlIIl[337];
        nArray[F.lIIIIlIIl[11]] = lIIIIlIIl[338];
        nArray[F.lIIIIlIIl[9]] = lIIIIlIIl[339];
        nArray[F.lIIIIlIIl[13]] = lIIIIlIIl[339];
        gc = nArray;
        int[] nArray2 = new int[lIIIIlIIl[6]];
        nArray2[F.lIIIIlIIl[0]] = lIIIIlIIl[316];
        nArray2[F.lIIIIlIIl[1]] = lIIIIlIIl[340];
        nArray2[F.lIIIIlIIl[3]] = lIIIIlIIl[341];
        nArray2[F.lIIIIlIIl[5]] = lIIIIlIIl[342];
        gd = nArray2;
        int[] nArray3 = new int[lIIIIlIIl[17]];
        nArray3[F.lIIIIlIIl[0]] = lIIIIlIIl[24];
        nArray3[F.lIIIIlIIl[1]] = lIIIIlIIl[343];
        nArray3[F.lIIIIlIIl[3]] = lIIIIlIIl[344];
        nArray3[F.lIIIIlIIl[5]] = lIIIIlIIl[345];
        nArray3[F.lIIIIlIIl[6]] = lIIIIlIIl[346];
        nArray3[F.lIIIIlIIl[7]] = lIIIIlIIl[347];
        nArray3[F.lIIIIlIIl[11]] = lIIIIlIIl[348];
        nArray3[F.lIIIIlIIl[9]] = lIIIIlIIl[349];
        nArray3[F.lIIIIlIIl[13]] = lIIIIlIIl[348];
        ge = nArray3;
        gf = new WorldArea(lIIIIlIIl[344], lIIIIlIIl[350], lIIIIlIIl[26], lIIIIlIIl[25], lIIIIlIIl[0]);
        gg = new WorldPoint(lIIIIlIIl[351], lIIIIlIIl[352], lIIIIlIIl[0]);
        gh = new WorldPoint(lIIIIlIIl[351], lIIIIlIIl[353], lIIIIlIIl[0]);
        gi = new WorldPoint(lIIIIlIIl[351], lIIIIlIIl[354], lIIIIlIIl[0]);
        gj = new WorldPoint(lIIIIlIIl[346], lIIIIlIIl[354], lIIIIlIIl[0]);
        gk = new WorldPoint(lIIIIlIIl[346], lIIIIlIIl[353], lIIIIlIIl[0]);
        gl = new WorldPoint(lIIIIlIIl[346], lIIIIlIIl[352], lIIIIlIIl[0]);
        WorldPoint[] worldPointArray = new WorldPoint[lIIIIlIIl[7]];
        worldPointArray[F.lIIIIlIIl[0]] = new WorldPoint(lIIIIlIIl[355], lIIIIlIIl[356], lIIIIlIIl[0]);
        worldPointArray[F.lIIIIlIIl[1]] = new WorldPoint(lIIIIlIIl[357], lIIIIlIIl[358], lIIIIlIIl[0]);
        worldPointArray[F.lIIIIlIIl[3]] = new WorldPoint(lIIIIlIIl[359], lIIIIlIIl[360], lIIIIlIIl[0]);
        worldPointArray[F.lIIIIlIIl[5]] = new WorldPoint(lIIIIlIIl[361], lIIIIlIIl[362], lIIIIlIIl[0]);
        worldPointArray[F.lIIIIlIIl[6]] = new WorldPoint(lIIIIlIIl[363], lIIIIlIIl[364], lIIIIlIIl[0]);
        gv = worldPointArray;
        gw = new WorldPoint(lIIIIlIIl[365], lIIIIlIIl[53], lIIIIlIIl[0]);
        gx = new WorldPoint(lIIIIlIIl[366], lIIIIlIIl[367], lIIIIlIIl[0]);
        gy = new WorldPoint(lIIIIlIIl[368], lIIIIlIIl[369], lIIIIlIIl[0]);
        gz = new WorldPoint(lIIIIlIIl[370], lIIIIlIIl[371], lIIIIlIIl[0]);
        gA = new WorldPoint(lIIIIlIIl[372], lIIIIlIIl[373], lIIIIlIIl[0]);
        gB = new WorldPoint(lIIIIlIIl[374], lIIIIlIIl[375], lIIIIlIIl[0]);
        gC = new WorldPoint(lIIIIlIIl[376], lIIIIlIIl[377], lIIIIlIIl[0]);
        gD = new WorldPoint(lIIIIlIIl[374], lIIIIlIIl[378], lIIIIlIIl[0]);
        gE = new WorldPoint(lIIIIlIIl[379], lIIIIlIIl[380], lIIIIlIIl[0]);
        gF = new WorldPoint(lIIIIlIIl[379], lIIIIlIIl[381], lIIIIlIIl[1]);
        gG = new WorldPoint(lIIIIlIIl[363], lIIIIlIIl[382], lIIIIlIIl[0]);
        gH = new WorldPoint(lIIIIlIIl[383], lIIIIlIIl[384], lIIIIlIIl[0]);
        gI = new WorldPoint(lIIIIlIIl[365], lIIIIlIIl[385], lIIIIlIIl[0]);
        gJ = new WorldPoint(lIIIIlIIl[386], lIIIIlIIl[387], lIIIIlIIl[0]);
        gK = new WorldPoint(lIIIIlIIl[388], lIIIIlIIl[389], lIIIIlIIl[0]);
        gL = new WorldPoint(lIIIIlIIl[390], lIIIIlIIl[391], lIIIIlIIl[0]);
        gM = new WorldPoint(lIIIIlIIl[392], lIIIIlIIl[393], lIIIIlIIl[0]);
        gN = new WorldPoint(lIIIIlIIl[394], lIIIIlIIl[395], lIIIIlIIl[0]);
        gO = new WorldPoint(lIIIIlIIl[396], lIIIIlIIl[397], lIIIIlIIl[0]);
        gP = new WorldPoint(lIIIIlIIl[398], lIIIIlIIl[399], lIIIIlIIl[0]);
        gQ = new WorldPoint(lIIIIlIIl[349], lIIIIlIIl[350], lIIIIlIIl[0]);
        gR = new WorldPoint(lIIIIlIIl[400], lIIIIlIIl[352], lIIIIlIIl[0]);
        gS = new WorldPoint(lIIIIlIIl[400], lIIIIlIIl[353], lIIIIlIIl[0]);
        gT = new WorldPoint(lIIIIlIIl[400], lIIIIlIIl[354], lIIIIlIIl[0]);
        gU = new WorldPoint(lIIIIlIIl[398], lIIIIlIIl[354], lIIIIlIIl[0]);
        gV = new WorldPoint(lIIIIlIIl[398], lIIIIlIIl[353], lIIIIlIIl[0]);
        gW = new WorldPoint(lIIIIlIIl[398], lIIIIlIIl[352], lIIIIlIIl[0]);
        bv = new ArrayList<d>();
        hc = new WorldArea(new WorldPoint(lIIIIlIIl[379], lIIIIlIIl[53], lIIIIlIIl[0]), new WorldPoint(lIIIIlIIl[368], lIIIIlIIl[401], lIIIIlIIl[0]));
        hd = lIIIIlIIl[40];
        he = lIIIIlIIl[41];
        hf = lIIIIlIIl[0];
        hg = lIIIIlIIl[0];
        hh = lIIIIlIIl[0];
        hi = lIIIIlIIl[0];
        hj = lIIIIlIIl[0];
        hk = lIIIIlIIl[0];
        String[] stringArray = new String[lIIIIlIIl[5]];
        stringArray[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[307]];
        stringArray[F.lIIIIlIIl[1]] = lIIIIIlIl[lIIIIlIIl[402]];
        stringArray[F.lIIIIlIIl[3]] = lIIIIIlIl[lIIIIlIIl[143]];
        hl = stringArray;
        hm = lIIIIIlIl[lIIIIlIIl[403]];
        hn = lIIIIIlIl[lIIIIlIIl[404]];
        ho = lIIIIIlIl[lIIIIlIIl[405]];
        hp = new WorldPoint(lIIIIlIIl[349], lIIIIlIIl[406], lIIIIlIIl[0]);
        hq = new WorldArea(lIIIIlIIl[407], lIIIIlIIl[408], lIIIIlIIl[10], lIIIIlIIl[84], lIIIIlIIl[0]);
        hr = new WorldPoint(lIIIIlIIl[409], lIIIIlIIl[410], lIIIIlIIl[0]);
        hs = new WorldArea(lIIIIlIIl[411], lIIIIlIIl[412], lIIIIlIIl[82], lIIIIlIIl[90], lIIIIlIIl[0]);
        bT = lIIIIlIIl[0];
    }

    private static boolean llIlllIIlIl(int n2) {
        return n2 > 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean bH() {
        int n2;
        block2: {
            block3: {
                int[] nArray = new int[lIIIIlIIl[1]];
                nArray[F.lIIIIlIIl[0]] = lIIIIlIIl[20];
                if (!F.llIllIlllll(Inventory.contains((int[])nArray) ? 1 : 0) || !F.llIllIlllll(Inventory.contains((int[])f.aV) ? 1 : 0)) break block2;
                if (!F.llIlllIIIIl(Inventory.contains((int[])f.aO) ? 1 : 0)) break block3;
                if (!F.llIllIlllll(Equipment.contains((int[])f.aO) ? 1 : 0) || F.llIlllIIIIl(Inventory.contains((int[])f.aN) ? 1 : 0) && !F.llIllIlllll(Equipment.contains((int[])f.aN) ? 1 : 0)) break block2;
                String[] stringArray = new String[lIIIIlIIl[1]];
                stringArray[F.lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[314]];
                if (!F.llIllIlllll(Inventory.contains((String[])stringArray) ? 1 : 0)) break block2;
            }
            n2 = lIIIIlIIl[1];
            0;
            if (((0x75 ^ 0x27 ^ (0x5E ^ 0x3D)) & (0x59 ^ 0x1F ^ (0xE6 ^ 0x91) ^ -1)) < 2) return n2 != 0;
            return ((0x1A ^ 0x40 ^ (0x6E ^ 0x6B)) & (195 + 42 - 230 + 197 ^ 12 + 50 - -66 + 19 ^ -1)) != 0;
        }
        n2 = lIIIIlIIl[0];
        return n2 != 0;
    }

    private static boolean llIlllIIIII(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean llIlllIIlll(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean llIlllIIIll(int n2, int n3) {
        return n2 >= n3;
    }

    @Override
    public String U() {
        return lIIIIIlIl[lIIIIlIIl[325]];
    }

    @Override
    public boolean S() {
        return lIIIIlIIl[0];
    }

    @Override
    public boolean V() {
        boolean bl;
        if (F.llIlllIIIll(e.j(lIIIIlIIl[10]), lIIIIlIIl[19])) {
            bl = lIIIIlIIl[1];
            0;
            if (-2 >= 0) {
                return ((0x9E ^ 0x81) & ~(0x7E ^ 0x61)) != 0;
            }
        } else {
            bl = lIIIIlIIl[0];
        }
        return bl;
    }

    @Override
    public int T() {
        try {
            F.bG();
            0;
        }
        catch (Exception lIIlIIlIlIIllII) {
            lIIlIIlIlIIllII.printStackTrace();
        }
        if (-1 > 1) {
            return (0x20 ^ 0x78) & ~(0x37 ^ 0x6F);
        }
        return lIIIIlIIl[121];
    }

    private static boolean llIllIlllll(int n2) {
        return n2 != 0;
    }

    private static boolean llIlllIlIII(int n2, int n3) {
        return n2 != n3;
    }

    private static String llIlIlllllI(String lIIlIIlIIlIllII, String lIIlIIlIIlIlIIl) {
        try {
            SecretKeySpec lIIlIIlIIlIllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIIlIIlIIlIlIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIIlIIlIIlIlllI = Cipher.getInstance("Blowfish");
            lIIlIIlIIlIlllI.init(lIIIIlIIl[3], lIIlIIlIIlIllll);
            return new String(lIIlIIlIIlIlllI.doFinal(Base64.getDecoder().decode(lIIlIIlIIlIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIIlIIlIIlIllIl) {
            lIIlIIlIIlIllIl.printStackTrace();
            return null;
        }
    }

    private static boolean llIlllIIIIl(int n2) {
        return n2 == 0;
    }
}

