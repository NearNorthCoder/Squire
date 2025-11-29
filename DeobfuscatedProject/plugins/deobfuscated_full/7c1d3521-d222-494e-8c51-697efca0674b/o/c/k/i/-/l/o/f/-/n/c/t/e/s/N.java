/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Item
 *  net.runelite.api.Skill
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.widgets.Widget
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.input.Mouse
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 *  net.unethicalite.api.widgets.Widgets
 */
package o.c.k.i.-.l.o.f.-.n.c.t.e.s;

import gg.squire.account.AccBuilderSotf;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.Skill;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.input.Mouse;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Widgets;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.a;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.ac;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.b;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.d;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.e;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.f;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.g;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.i;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.j;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class N
implements ac {
    public static final /* synthetic */ String hy;
    public static final /* synthetic */ WorldPoint hv;
    public static final /* synthetic */ String ih;
    public static final /* synthetic */ String hz;
    private static /* synthetic */ int[] llIIIIIIlI;
    public static final /* synthetic */ String iO;
    public static final /* synthetic */ String iB;
    public static final /* synthetic */ String ip;
    public static final /* synthetic */ String hK;
    public static final /* synthetic */ String iA;
    public static final /* synthetic */ String if;
    public static final /* synthetic */ String ik;
    public static final /* synthetic */ String hN;
    public static final /* synthetic */ String id;
    public static final /* synthetic */ String iW;
    public static final /* synthetic */ String hV;
    public static /* synthetic */ String[] je;
    public static final /* synthetic */ String iD;
    public static final /* synthetic */ int hm;
    public static final /* synthetic */ String iv;
    public static final /* synthetic */ String iF;
    public static final /* synthetic */ String hQ;
    public static final /* synthetic */ String ib;
    public static final /* synthetic */ int hn;
    public static final /* synthetic */ String ie;
    public static final /* synthetic */ String hC;
    public static final /* synthetic */ int hp;
    public static final /* synthetic */ String iI;
    public static final /* synthetic */ int hg;
    public static final /* synthetic */ String hE;
    public static final /* synthetic */ String hZ;
    public static final /* synthetic */ int hk;
    public static final /* synthetic */ String hO;
    public static final /* synthetic */ int hj;
    public static final /* synthetic */ String hU;
    public static final /* synthetic */ String hS;
    public static /* synthetic */ WorldArea cF;
    public static final /* synthetic */ String iN;
    public static final /* synthetic */ WorldPoint hu;
    public static final /* synthetic */ String iL;
    public static final /* synthetic */ String jc;
    public static final /* synthetic */ String in;
    public static final /* synthetic */ WorldPoint hw;
    public static final /* synthetic */ String hR;
    public static final /* synthetic */ WorldPoint hs;
    public static final /* synthetic */ int hb;
    public static final /* synthetic */ String hJ;
    public static final /* synthetic */ String iK;
    public static final /* synthetic */ String ic;
    public static final /* synthetic */ String iq;
    public static final /* synthetic */ WorldPoint hr;
    public static final /* synthetic */ String iP;
    public static final /* synthetic */ String iu;
    public static final /* synthetic */ String hA;
    public static final /* synthetic */ int hc;
    public static final /* synthetic */ String hB;
    public static final /* synthetic */ String iG;
    public static final /* synthetic */ WorldPoint ht;
    public static final /* synthetic */ String hL;
    public static final /* synthetic */ String hT;
    public static final /* synthetic */ String io;
    public static final /* synthetic */ String iY;
    public static final /* synthetic */ int hq;
    public static final /* synthetic */ String ix;
    public static final /* synthetic */ int hd;
    public static final /* synthetic */ String hP;
    static /* synthetic */ boolean dj;
    private static /* synthetic */ String[] llIIIIIIIl;
    public static final /* synthetic */ String iy;
    public static final /* synthetic */ String iJ;
    public static final /* synthetic */ String is;
    public static final /* synthetic */ String iS;
    public static final /* synthetic */ String hH;
    public static final /* synthetic */ int ho;
    public static final /* synthetic */ WorldPoint hx;
    public static final /* synthetic */ String hY;
    public static final /* synthetic */ String iQ;
    public static final /* synthetic */ String hG;
    public static final /* synthetic */ String hI;
    public static final /* synthetic */ String im;
    public static final /* synthetic */ int hl;
    public static final /* synthetic */ String iC;
    public static final /* synthetic */ int ha;
    public static final /* synthetic */ String ia;
    public static final /* synthetic */ String ja;
    public static /* synthetic */ boolean bt;
    public static final /* synthetic */ int hf;
    public static final /* synthetic */ String jd;
    static /* synthetic */ int di;
    public static final /* synthetic */ int hh;
    public static final /* synthetic */ String ij;
    public static final /* synthetic */ String ii;
    public static final /* synthetic */ String hW;
    public static final /* synthetic */ String ig;
    public static final /* synthetic */ String iH;
    public static final /* synthetic */ String iZ;
    public static final /* synthetic */ String iT;
    public static final /* synthetic */ String hX;
    public static final /* synthetic */ String it;
    public static final /* synthetic */ String iE;
    public static final /* synthetic */ String hD;
    public static final /* synthetic */ String iU;
    public static final /* synthetic */ String iX;
    public static final /* synthetic */ String hF;
    public static final /* synthetic */ String il;
    public static final /* synthetic */ String ir;
    public static final /* synthetic */ int he;
    public static final /* synthetic */ int hi;
    public static final /* synthetic */ String iw;
    public static final /* synthetic */ String hM;
    public static /* synthetic */ List<d> bv;
    public static final /* synthetic */ String iV;
    public static final /* synthetic */ String iz;
    public static final /* synthetic */ String jb;
    public static final /* synthetic */ String iR;
    public static final /* synthetic */ String iM;

    private static boolean lIlIIIlIIlllI(Object object) {
        return object != null;
    }

    private static boolean lIlIIIlIlIlII(int n2, int n3) {
        return n2 >= n3;
    }

    private static void q(int n2) {
        if (!N.lIlIIIlIIllIl(Widgets.get((int)llIIIIIIlI[19]).isEmpty() ? 1 : 0) || N.lIlIIIlIlIIll(Widgets.get((int)llIIIIIIlI[19]))) {
            int var26;
            int[] nArray = new int[llIIIIIIlI[2]];
            nArray[N.llIIIIIIlI[1]] = var26;
            if (N.lIlIIIlIIlllI(TileObjects.getNearest((int[])nArray))) {
                int[] nArray2 = new int[llIIIIIIlI[2]];
                nArray2[N.llIIIIIIlI[1]] = var26;
                TileObjects.getNearest((int[])nArray2).interact(llIIIIIIIl[llIIIIIIlI[64]]);
                Time.sleepTicks((int)llIIIIIIlI[6]);
                0;
            }
        }
    }

    private static boolean lIlIIIlIIlIll(int n2) {
        return n2 != 0;
    }

    private static boolean lIlIIIlIlIIIl(int n2, int n3) {
        return n2 <= n3;
    }

    @Override
    public boolean ae() {
        return llIIIIIIlI[1];
    }

    public static void cY() {
        if (N.lIlIIIlIIlIll(Inventory.contains((int[])f.ba) ? 1 : 0) && N.lIlIIIlIIllII(Movement.getRunEnergy(), llIIIIIIlI[0])) {
            Inventory.getFirst((int[])f.ba).interact(llIIIIIIIl[llIIIIIIlI[1]]);
            Time.sleepTicks((int)llIIIIIIlI[2]);
            0;
        }
        if (N.lIlIIIlIIllIl(Movement.isRunEnabled() ? 1 : 0)) {
            Movement.toggleRun();
        }
        if (N.lIlIIIlIIlIll(bt ? 1 : 0)) {
            b.a(bv);
            if (N.lIlIIIlIIllII(bv.size(), llIIIIIIlI[2])) {
                System.out.println(llIIIIIIIl[llIIIIIIlI[2]]);
                bt = llIIIIIIlI[1];
            }
        }
        if (N.lIlIIIlIIllIl(bt ? 1 : 0)) {
            if (N.lIlIIIlIIllIl(N.an() ? 1 : 0) && N.lIlIIIlIIllII(e.j(llIIIIIIlI[3]), llIIIIIIlI[2])) {
                BankLocation var12 = BankLocation.getNearest();
                if (N.lIlIIIlIIlllI(var12) && N.lIlIIIlIIllIl(var12.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    a.a(var12);
                }
                if (N.lIlIIIlIIlllI(var12) && N.lIlIIIlIIlIll(var12.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (N.lIlIIIlIIllIl(Bank.isOpen() ? 1 : 0)) {
                        a.a();
                        Time.sleepUntil(() -> Bank.isOpen(), (int)llIIIIIIlI[4]);
                        0;
                    }
                    if (N.lIlIIIlIIlIll(Bank.isOpen() ? 1 : 0)) {
                        if (N.lIlIIIlIIllll(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks((int)llIIIIIIlI[5]);
                            0;
                        }
                        if (N.lIlIIIlIIllll(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks((int)llIIIIIIlI[6]);
                            0;
                        }
                        int[] nArray = new int[llIIIIIIlI[6]];
                        nArray[N.llIIIIIIlI[1]] = llIIIIIIlI[7];
                        nArray[N.llIIIIIIlI[2]] = llIIIIIIlI[8];
                        if (N.lIlIIIlIIllIl(e.c(nArray) ? 1 : 0)) {
                            N.Q();
                            System.out.println(llIIIIIIIl[llIIIIIIlI[6]]);
                            bt = llIIIIIIlI[2];
                            return;
                        }
                        int[] nArray2 = new int[llIIIIIIlI[6]];
                        nArray2[N.llIIIIIIlI[1]] = llIIIIIIlI[7];
                        nArray2[N.llIIIIIIlI[2]] = llIIIIIIlI[8];
                        if (N.lIlIIIlIIlIll(e.c(nArray2) ? 1 : 0)) {
                            a.a(llIIIIIIlI[7], llIIIIIIlI[9]);
                            a.b(f.ba, llIIIIIIlI[10]);
                        }
                    }
                }
            }
            if (N.lIlIIIlIIlIll(N.an() ? 1 : 0) && N.lIlIIIlIIllIl(e.j(llIIIIIIlI[3]))) {
                if (N.lIlIIIlIlIIII(Players.getLocal().getWorldLocation().distanceTo(hs), llIIIIIIlI[11])) {
                    if (N.lIlIIIlIIlIll(cF.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        int[] nArray = new int[llIIIIIIlI[2]];
                        nArray[N.llIIIIIIlI[1]] = llIIIIIIlI[7];
                        if (N.lIlIIIlIIlIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                            int[] nArray3 = new int[llIIIIIIlI[2]];
                            nArray3[N.llIIIIIIlI[1]] = llIIIIIIlI[7];
                            Inventory.getFirst((int[])nArray3).interact(llIIIIIIIl[llIIIIIIlI[12]]);
                            Time.sleepTicks((int)llIIIIIIlI[13]);
                            0;
                        }
                    }
                    AccBuilderSotf.c = llIIIIIIIl[llIIIIIIlI[5]];
                    Movement.walkTo((WorldPoint)hs);
                    0;
                    Time.sleepTicks((int)llIIIIIIlI[2]);
                    0;
                }
                if (N.lIlIIIlIlIIIl(Players.getLocal().getWorldLocation().distanceTo(hs), llIIIIIIlI[13])) {
                    g.a(llIIIIIIIl[llIIIIIIlI[10]], je);
                    Time.sleepTicks((int)llIIIIIIlI[2]);
                    0;
                }
            }
            if (N.lIlIIIlIIllll(e.j(llIIIIIIlI[3]))) {
                if (N.lIlIIIlIlIIlI(e.j(llIIIIIIlI[14]), llIIIIIIlI[15])) {
                    AccBuilderSotf.c = llIIIIIIIl[llIIIIIIlI[16]];
                    if (N.lIlIIIlIlIIII(Players.getLocal().getWorldLocation().distanceTo(ht), llIIIIIIlI[17])) {
                        Movement.walkTo((WorldPoint)ht);
                        0;
                        Time.sleepTicks((int)llIIIIIIlI[2]);
                        0;
                    }
                    if (N.lIlIIIlIlIIIl(Players.getLocal().getWorldLocation().distanceTo(ht), llIIIIIIlI[17])) {
                        N.q(llIIIIIIlI[18]);
                        if (!N.lIlIIIlIIlIll(Widgets.get((int)llIIIIIIlI[19]).isEmpty() ? 1 : 0) || N.lIlIIIlIIlllI(Widgets.get((int)llIIIIIIlI[19]))) {
                            N.cZ();
                        }
                    }
                }
                if (N.lIlIIIlIlIIlI(e.j(llIIIIIIlI[14]), llIIIIIIlI[20])) {
                    AccBuilderSotf.c = llIIIIIIIl[llIIIIIIlI[21]];
                    if (N.lIlIIIlIlIIII(Players.getLocal().getWorldLocation().distanceTo(ht), llIIIIIIlI[17])) {
                        Movement.walkTo((WorldPoint)ht);
                        0;
                        Time.sleepTicks((int)llIIIIIIlI[2]);
                        0;
                    }
                    if (N.lIlIIIlIlIIIl(Players.getLocal().getWorldLocation().distanceTo(ht), llIIIIIIlI[17])) {
                        N.q(llIIIIIIlI[22]);
                        if (!N.lIlIIIlIIlIll(Widgets.get((int)llIIIIIIlI[19]).isEmpty() ? 1 : 0) || N.lIlIIIlIIlllI(Widgets.get((int)llIIIIIIlI[19]))) {
                            N.cZ();
                        }
                    }
                }
                if (N.lIlIIIlIlIIlI(e.j(llIIIIIIlI[14]), llIIIIIIlI[23])) {
                    AccBuilderSotf.c = llIIIIIIIl[llIIIIIIlI[13]];
                    if (N.lIlIIIlIlIIII(Players.getLocal().getWorldLocation().distanceTo(hu), llIIIIIIlI[17])) {
                        Movement.walkTo((WorldPoint)hu);
                        0;
                        Time.sleepTicks((int)llIIIIIIlI[2]);
                        0;
                    }
                    if (N.lIlIIIlIlIIIl(Players.getLocal().getWorldLocation().distanceTo(hu), llIIIIIIlI[17])) {
                        N.q(llIIIIIIlI[24]);
                        if (!N.lIlIIIlIIlIll(Widgets.get((int)llIIIIIIlI[19]).isEmpty() ? 1 : 0) || N.lIlIIIlIIlllI(Widgets.get((int)llIIIIIIlI[19]))) {
                            N.cZ();
                        }
                    }
                }
                if (N.lIlIIIlIlIIlI(e.j(llIIIIIIlI[14]), llIIIIIIlI[25])) {
                    AccBuilderSotf.c = llIIIIIIIl[llIIIIIIlI[17]];
                    if (N.lIlIIIlIlIIII(Players.getLocal().getWorldLocation().distanceTo(hu), llIIIIIIlI[17])) {
                        Movement.walkTo((WorldPoint)hu);
                        0;
                        Time.sleepTicks((int)llIIIIIIlI[2]);
                        0;
                    }
                    if (N.lIlIIIlIlIIIl(Players.getLocal().getWorldLocation().distanceTo(hu), llIIIIIIlI[17])) {
                        N.q(llIIIIIIlI[26]);
                        if (!N.lIlIIIlIIlIll(Widgets.get((int)llIIIIIIlI[19]).isEmpty() ? 1 : 0) || N.lIlIIIlIIlllI(Widgets.get((int)llIIIIIIlI[19]))) {
                            N.cZ();
                        }
                    }
                }
                if (N.lIlIIIlIlIIlI(e.j(llIIIIIIlI[14]), llIIIIIIlI[27])) {
                    AccBuilderSotf.c = llIIIIIIIl[llIIIIIIlI[9]];
                    if (N.lIlIIIlIlIIII(Players.getLocal().getWorldLocation().distanceTo(hu), llIIIIIIlI[17])) {
                        Movement.walkTo((WorldPoint)hu);
                        0;
                        Time.sleepTicks((int)llIIIIIIlI[2]);
                        0;
                    }
                    if (N.lIlIIIlIlIIIl(Players.getLocal().getWorldLocation().distanceTo(hu), llIIIIIIlI[17])) {
                        N.q(llIIIIIIlI[28]);
                        if (!N.lIlIIIlIIlIll(Widgets.get((int)llIIIIIIlI[19]).isEmpty() ? 1 : 0) || N.lIlIIIlIIlllI(Widgets.get((int)llIIIIIIlI[19]))) {
                            N.cZ();
                        }
                    }
                }
                if (N.lIlIIIlIlIIlI(e.j(llIIIIIIlI[14]), llIIIIIIlI[29])) {
                    AccBuilderSotf.c = llIIIIIIIl[llIIIIIIlI[30]];
                    if (N.lIlIIIlIlIIII(Players.getLocal().getWorldLocation().distanceTo(hu), llIIIIIIlI[17])) {
                        Movement.walkTo((WorldPoint)hu);
                        0;
                        Time.sleepTicks((int)llIIIIIIlI[2]);
                        0;
                    }
                    if (N.lIlIIIlIlIIIl(Players.getLocal().getWorldLocation().distanceTo(hu), llIIIIIIlI[17])) {
                        N.q(llIIIIIIlI[31]);
                        if (!N.lIlIIIlIIlIll(Widgets.get((int)llIIIIIIlI[19]).isEmpty() ? 1 : 0) || N.lIlIIIlIIlllI(Widgets.get((int)llIIIIIIlI[19]))) {
                            N.cZ();
                        }
                    }
                }
                if (N.lIlIIIlIlIIlI(e.j(llIIIIIIlI[14]), llIIIIIIlI[32])) {
                    AccBuilderSotf.c = llIIIIIIIl[llIIIIIIlI[33]];
                    if (N.lIlIIIlIlIIII(Players.getLocal().getWorldLocation().distanceTo(hv), llIIIIIIlI[17])) {
                        Movement.walkTo((WorldPoint)hv);
                        0;
                        Time.sleepTicks((int)llIIIIIIlI[2]);
                        0;
                    }
                    if (N.lIlIIIlIlIIIl(Players.getLocal().getWorldLocation().distanceTo(hv), llIIIIIIlI[17])) {
                        N.q(llIIIIIIlI[34]);
                        if (!N.lIlIIIlIIlIll(Widgets.get((int)llIIIIIIlI[19]).isEmpty() ? 1 : 0) || N.lIlIIIlIIlllI(Widgets.get((int)llIIIIIIlI[19]))) {
                            N.cZ();
                        }
                    }
                }
                if (N.lIlIIIlIlIIlI(e.j(llIIIIIIlI[14]), llIIIIIIlI[35])) {
                    AccBuilderSotf.c = llIIIIIIIl[llIIIIIIlI[36]];
                    if (N.lIlIIIlIlIIII(Players.getLocal().getWorldLocation().distanceTo(hv), llIIIIIIlI[17])) {
                        Movement.walkTo((WorldPoint)hv);
                        0;
                        Time.sleepTicks((int)llIIIIIIlI[2]);
                        0;
                    }
                    if (N.lIlIIIlIlIIIl(Players.getLocal().getWorldLocation().distanceTo(hv), llIIIIIIlI[17])) {
                        N.q(llIIIIIIlI[37]);
                        if (!N.lIlIIIlIIlIll(Widgets.get((int)llIIIIIIlI[19]).isEmpty() ? 1 : 0) || N.lIlIIIlIIlllI(Widgets.get((int)llIIIIIIlI[19]))) {
                            N.cZ();
                        }
                    }
                }
                if (N.lIlIIIlIlIIlI(e.j(llIIIIIIlI[14]), llIIIIIIlI[38])) {
                    AccBuilderSotf.c = llIIIIIIIl[llIIIIIIlI[39]];
                    if (N.lIlIIIlIlIIII(Players.getLocal().getWorldLocation().distanceTo(hw), llIIIIIIlI[17])) {
                        Movement.walkTo((WorldPoint)hw);
                        0;
                        Time.sleepTicks((int)llIIIIIIlI[2]);
                        0;
                    }
                    if (N.lIlIIIlIlIIIl(Players.getLocal().getWorldLocation().distanceTo(hw), llIIIIIIlI[17])) {
                        N.q(llIIIIIIlI[40]);
                        if (!N.lIlIIIlIIlIll(Widgets.get((int)llIIIIIIlI[19]).isEmpty() ? 1 : 0) || N.lIlIIIlIIlllI(Widgets.get((int)llIIIIIIlI[19]))) {
                            N.cZ();
                        }
                    }
                }
                if (N.lIlIIIlIlIIlI(e.j(llIIIIIIlI[14]), llIIIIIIlI[41])) {
                    AccBuilderSotf.c = llIIIIIIIl[llIIIIIIlI[42]];
                    if (N.lIlIIIlIlIIII(Players.getLocal().getWorldLocation().distanceTo(hw), llIIIIIIlI[17])) {
                        Movement.walkTo((WorldPoint)hw);
                        0;
                        Time.sleepTicks((int)llIIIIIIlI[2]);
                        0;
                    }
                    if (N.lIlIIIlIlIIIl(Players.getLocal().getWorldLocation().distanceTo(hw), llIIIIIIlI[17])) {
                        N.q(llIIIIIIlI[43]);
                        if (!N.lIlIIIlIIlIll(Widgets.get((int)llIIIIIIlI[19]).isEmpty() ? 1 : 0) || N.lIlIIIlIIlllI(Widgets.get((int)llIIIIIIlI[19]))) {
                            N.cZ();
                        }
                    }
                }
                if (N.lIlIIIlIlIIlI(e.j(llIIIIIIlI[14]), llIIIIIIlI[44])) {
                    AccBuilderSotf.c = llIIIIIIIl[llIIIIIIlI[45]];
                    if (N.lIlIIIlIlIIII(Players.getLocal().getWorldLocation().distanceTo(hx), llIIIIIIlI[17])) {
                        Movement.walkTo((WorldPoint)hx);
                        0;
                        Time.sleepTicks((int)llIIIIIIlI[2]);
                        0;
                    }
                    if (N.lIlIIIlIlIIIl(Players.getLocal().getWorldLocation().distanceTo(hx), llIIIIIIlI[17])) {
                        N.q(llIIIIIIlI[46]);
                        if (!N.lIlIIIlIIlIll(Widgets.get((int)llIIIIIIlI[19]).isEmpty() ? 1 : 0) || N.lIlIIIlIIlllI(Widgets.get((int)llIIIIIIlI[19]))) {
                            N.cZ();
                        }
                    }
                }
                if (N.lIlIIIlIlIIlI(e.j(llIIIIIIlI[14]), llIIIIIIlI[47])) {
                    AccBuilderSotf.c = llIIIIIIIl[llIIIIIIlI[48]];
                    if (N.lIlIIIlIlIIII(Players.getLocal().getWorldLocation().distanceTo(hx), llIIIIIIlI[17])) {
                        Movement.walkTo((WorldPoint)hx);
                        0;
                        Time.sleepTicks((int)llIIIIIIlI[2]);
                        0;
                    }
                    if (N.lIlIIIlIlIIIl(Players.getLocal().getWorldLocation().distanceTo(hx), llIIIIIIlI[17])) {
                        N.q(llIIIIIIlI[49]);
                        if (!N.lIlIIIlIIlIll(Widgets.get((int)llIIIIIIlI[19]).isEmpty() ? 1 : 0) || N.lIlIIIlIIlllI(Widgets.get((int)llIIIIIIlI[19]))) {
                            N.cZ();
                        }
                    }
                }
                if (N.lIlIIIlIlIIlI(e.j(llIIIIIIlI[14]), llIIIIIIlI[50])) {
                    AccBuilderSotf.c = llIIIIIIIl[llIIIIIIlI[51]];
                    if (N.lIlIIIlIlIIII(Players.getLocal().getWorldLocation().distanceTo(hx), llIIIIIIlI[17])) {
                        Movement.walkTo((WorldPoint)hx);
                        0;
                        Time.sleepTicks((int)llIIIIIIlI[2]);
                        0;
                    }
                    if (N.lIlIIIlIlIIIl(Players.getLocal().getWorldLocation().distanceTo(hx), llIIIIIIlI[17])) {
                        N.q(llIIIIIIlI[52]);
                        if (!N.lIlIIIlIIlIll(Widgets.get((int)llIIIIIIlI[19]).isEmpty() ? 1 : 0) || N.lIlIIIlIIlllI(Widgets.get((int)llIIIIIIlI[19]))) {
                            N.cZ();
                        }
                    }
                }
                if (N.lIlIIIlIlIIlI(e.j(llIIIIIIlI[14]), llIIIIIIlI[53])) {
                    AccBuilderSotf.c = llIIIIIIIl[llIIIIIIlI[54]];
                    if (N.lIlIIIlIlIIII(Players.getLocal().getWorldLocation().distanceTo(hx), llIIIIIIlI[17])) {
                        Movement.walkTo((WorldPoint)hx);
                        0;
                        Time.sleepTicks((int)llIIIIIIlI[2]);
                        0;
                    }
                    if (N.lIlIIIlIlIIIl(Players.getLocal().getWorldLocation().distanceTo(hx), llIIIIIIlI[17])) {
                        N.q(llIIIIIIlI[55]);
                        if (!N.lIlIIIlIIlIll(Widgets.get((int)llIIIIIIlI[19]).isEmpty() ? 1 : 0) || N.lIlIIIlIIlllI(Widgets.get((int)llIIIIIIlI[19]))) {
                            N.cZ();
                        }
                    }
                }
                if (N.lIlIIIlIlIIlI(e.j(llIIIIIIlI[14]), llIIIIIIlI[56]) && N.lIlIIIlIIllII(Skills.getLevel((Skill)Skill.HUNTER), llIIIIIIlI[17])) {
                    AccBuilderSotf.c = llIIIIIIIl[llIIIIIIlI[57]];
                    if (N.lIlIIIlIlIIII(Players.getLocal().getWorldLocation().distanceTo(hs), llIIIIIIlI[13])) {
                        AccBuilderSotf.c = llIIIIIIIl[llIIIIIIlI[58]];
                        Movement.walkTo((WorldPoint)hs);
                        0;
                        Time.sleepTicks((int)llIIIIIIlI[2]);
                        0;
                    }
                    if (N.lIlIIIlIlIIIl(Players.getLocal().getWorldLocation().distanceTo(hs), llIIIIIIlI[13])) {
                        AccBuilderSotf.c = llIIIIIIIl[llIIIIIIlI[59]];
                        g.a(llIIIIIIIl[llIIIIIIlI[60]], je);
                        Time.sleepTicks((int)llIIIIIIlI[2]);
                        0;
                    }
                }
            }
            System.out.println(e.j(llIIIIIIlI[14]));
        }
    }

    @Override
    public boolean ah() {
        int n2;
        if (N.lIlIIIlIlIlII(e.j(llIIIIIIlI[14]), llIIIIIIlI[56]) && N.lIlIIIlIlIlII(Skills.getLevel((Skill)Skill.HUNTER), llIIIIIIlI[17])) {
            n2 = llIIIIIIlI[2];
            0;
            if (((0x9C ^ 0xC5) & ~(0x52 ^ 0xB)) >= 1) {
                return false;
            }
        } else {
            n2 = llIIIIIIlI[1];
        }
        return n2 != 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean an() {
        int n2;
        if (N.lIlIIIlIIllll(Inventory.getCount((int[])f.ba))) {
            int[] nArray = new int[llIIIIIIlI[2]];
            nArray[N.llIIIIIIlI[1]] = llIIIIIIlI[7];
            if (N.lIlIIIlIIllll(Inventory.getCount((int[])nArray))) {
                n2 = llIIIIIIlI[2];
                0;
                if (((0x31 ^ 0x62) & ~(0x2B ^ 0x78)) == ((0x1C ^ 0x47) & ~(0x6C ^ 0x37))) return n2 != 0;
                return false;
            }
        }
        n2 = llIIIIIIlI[1];
        return n2 != 0;
    }

    private static String lIlIIIlIIlIII(String var23, String var24) {
        try {
            SecretKeySpec var15 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var24.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var13 = Cipher.getInstance("Blowfish");
            var13.init(llIIIIIIlI[6], var15);
            return new String(var13.doFinal(Base64.getDecoder().decode(var23.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var18) {
            var18.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIIIlIlIIlI(int n2, int n3) {
        return n2 == n3;
    }

    private static void lIlIIIlIIlIIl() {
        llIIIIIIIl = new String[llIIIIIIlI[170]];
        N.llIIIIIIIl[N.llIIIIIIlI[1]] = N."Drink";
        N.llIIIIIIIl[N.llIIIIIIlI[2]] = N."Finished buying items, switching back to quest";
        N.llIIIIIIIl[N.llIIIIIIlI[6]] = N."We are missing quest supplies, switching to BUYING";
        N.llIIIIIIIl[N.llIIIIIIlI[12]] = N."Break";
        N.llIIIIIIIl[N.llIIIIIIlI[5]] = N."Nav to start";
        N.llIIIIIIIl[N.llIIIIIIlI[10]] = N."Orlando Smith";
        N.llIIIIIIIl[N.llIIIIIIlI[16]] = N."Solving terror bird";
        N.llIIIIIIIl[N.llIIIIIIlI[21]] = N."Solving kalphite";
        N.llIIIIIIIl[N.llIIIIIIlI[13]] = N."Solving Monkey";
        N.llIIIIIIIl[N.llIIIIIIlI[17]] = N."Solving sea slug";
        N.llIIIIIIIl[N.llIIIIIIlI[9]] = N."Solving snake";
        N.llIIIIIIIl[N.llIIIIIIlI[30]] = N."Solving east snail";
        N.llIIIIIIIl[N.llIIIIIIlI[33]] = N."Solving wyvern";
        N.llIIIIIIIl[N.llIIIIIIlI[36]] = N."Solving dragon";
        N.llIIIIIIIl[N.llIIIIIIlI[39]] = N."Solving tort";
        N.llIIIIIIIl[N.llIIIIIIlI[42]] = N."Solving croc";
        N.llIIIIIIIl[N.llIIIIIIlI[45]] = N."Solving leech";
        N.llIIIIIIIl[N.llIIIIIIlI[48]] = N."Solving camel";
        N.llIIIIIIIl[N.llIIIIIIlI[51]] = N."Solving mole";
        N.llIIIIIIIl[N.llIIIIIIlI[54]] = N."Solving leech";
        N.llIIIIIIIl[N.llIIIIIIlI[57]] = N."Handing in quest";
        N.llIIIIIIIl[N.llIIIIIIlI[58]] = N."Nav to start";
        N.llIIIIIIIl[N.llIIIIIIlI[59]] = N."Talking";
        N.llIIIIIIIl[N.llIIIIIIlI[60]] = N."Orlando Smith";
        N.llIIIIIIIl[N.llIIIIIIlI[62]] = N."null question";
        N.llIIIIIIIl[N.llIIIIIIlI[63]] = N."Found answer";
        N.llIIIIIIIl[N.llIIIIIIlI[64]] = N."Study";
        N.llIIIIIIIl[N.llIIIIIIlI[69]] = N."Varrock Quiz";
        N.llIIIIIIIl[N.llIIIIIIlI[61]] = N."ring of wealth (";
        N.llIIIIIIIl[N.llIIIIIIlI[70]] = N."Carnivores";
        N.llIIIIIIIl[N.llIIIIIIlI[71]] = N."Scabaras";
        N.llIIIIIIIl[N.llIIIIIIlI[72]] = N."Twelve";
        N.llIIIIIIIl[N.llIIIIIIlI[73]] = N."Spitting acid";
        N.llIIIIIIIl[N.llIIIIIIlI[74]] = N."Mibbiwocket";
        N.llIIIIIIIl[N.llIIIIIIlI[75]] = N."Below room temperature";
        N.llIIIIIIIl[N.llIIIIIIlI[76]] = N."Orlando Smith";
        N.llIIIIIIIl[N.llIIIIIIlI[77]] = N."Runite";
        N.llIIIIIIIl[N.llIIIIIIlI[78]] = N."Reptiles";
        N.llIIIIIIIl[N.llIIIIIIlI[79]] = N."Toxic dung";
        N.llIIIIIIIl[N.llIIIIIIlI[80]] = N."Gnomes";
        N.llIIIIIIIl[N.llIIIIIIlI[11]] = N."Cold";
        N.llIIIIIIIl[N.llIIIIIIlI[81]] = N."Squamata";
        N.llIIIIIIIl[N.llIIIIIIlI[82]] = N."It becomes sleepy";
        N.llIIIIIIIl[N.llIIIIIIlI[83]] = N."Annoyed";
        N.llIIIIIIIl[N.llIIIIIIlI[84]] = N."Unknown";
        N.llIIIIIIIl[N.llIIIIIIlI[85]] = N."Three";
        N.llIIIIIIIl[N.llIIIIIIlI[86]] = N."0";
        N.llIIIIIIIl[N.llIIIIIIlI[87]] = N."Acid-spitting snail";
        N.llIIIIIIIl[N.llIIIIIIlI[88]] = N."Two";
        N.llIIIIIIIl[N.llIIIIIIlI[89]] = N."Two";
        N.llIIIIIIIl[N.llIIIIIIlI[0]] = N."Seaweed";
        N.llIIIIIIIl[N.llIIIIIIlI[90]] = N."Anywhere";
        N.llIIIIIIIl[N.llIIIIIIlI[91]] = N."Scarab beetles";
        N.llIIIIIIIl[N.llIIIIIIlI[92]] = N."Anything";
        N.llIIIIIIIl[N.llIIIIIIlI[93]] = N."Climate change";
        N.llIIIIIIIl[N.llIIIIIIlI[94]] = N."Social";
        N.llIIIIIIIl[N.llIIIIIIlI[95]] = N."Sight";
        N.llIIIIIIIl[N.llIIIIIIlI[96]] = N."Four";
        N.llIIIIIIIl[N.llIIIIIIlI[97]] = N."Sunlight";
        N.llIIIIIIIl[N.llIIIIIIlI[98]] = N."An operculum";
        N.llIIIIIIIl[N.llIIIIIIlI[99]] = N."They attack by jumping";
        N.llIIIIIIIl[N.llIIIIIIlI[100]] = N."Elemental";
        N.llIIIIIIIl[N.llIIIIIIlI[101]] = N."Defence";
        N.llIIIIIIIl[N.llIIIIIIlI[102]] = N."Al Kharid";
        N.llIIIIIIIl[N.llIIIIIIlI[103]] = N."Twenty years";
        N.llIIIIIIIl[N.llIIIIIIlI[104]] = N."The Slayer Masters";
        N.llIIIIIIIl[N.llIIIIIIlI[105]] = N."Constriction";
        N.llIIIIIIIl[N.llIIIIIIlI[106]] = N."Hair";
        N.llIIIIIIIl[N.llIIIIIIlI[107]] = N."Vegetables";
        N.llIIIIIIIl[N.llIIIIIIlI[108]] = N."Omnivore";
        N.llIIIIIIIl[N.llIIIIIIlI[109]] = N."Water";
        N.llIIIIIIIl[N.llIIIIIIlI[110]] = N."Worker";
        N.llIIIIIIIl[N.llIIIIIIlI[111]] = N."Dragons";
        N.llIIIIIIIl[N.llIIIIIIlI[112]] = N."Stones";
        N.llIIIIIIIl[N.llIIIIIIlI[113]] = N."Seeing how you smell";
        N.llIIIIIIIl[N.llIIIIIIlI[114]] = N."It doubles in size";
        N.llIIIIIIIl[N.llIIIIIIlI[115]] = N."Gnomes";
        N.llIIIIIIIl[N.llIIIIIIlI[116]] = N."Fireproof oil";
        N.llIIIIIIIl[N.llIIIIIIlI[117]] = N."Nematocysts";
        N.llIIIIIIIl[N.llIIIIIIlI[118]] = N."A layer of fat";
        N.llIIIIIIIl[N.llIIIIIIlI[119]] = N."The researchers";
        N.llIIIIIIIl[N.llIIIIIIlI[120]] = N."Stomach acid";
        N.llIIIIIIIl[N.llIIIIIIlI[121]] = N."Seaweed";
        N.llIIIIIIIl[N.llIIIIIIlI[122]] = N."Milk";
        N.llIIIIIIIl[N.llIIIIIIlI[123]] = N."They have";
        N.llIIIIIIIl[N.llIIIIIIlI[124]] = N."They dig holes";
        N.llIIIIIIIl[N.llIIIIIIlI[125]] = N."During breeding";
        N.llIIIIIIIl[N.llIIIIIIlI[126]] = N."Wyson the Gardener";
        N.llIIIIIIIl[N.llIIIIIIlI[127]] = N."'Y'-shaped";
        N.llIIIIIIIl[N.llIIIIIIlI[128]] = N."Hard shell";
        N.llIIIIIIIl[N.llIIIIIIlI[129]] = N."Tongue";
        N.llIIIIIIIl[N.llIIIIIIlI[130]] = N."Admiral Bake";
        N.llIIIIIIIl[N.llIIIIIIlI[131]] = N."Harmless";
        N.llIIIIIIIl[N.llIIIIIIlI[132]] = N."Old battle sites";
        N.llIIIIIIIl[N.llIIIIIIlI[133]] = N."Pasha";
        N.llIIIIIIIl[N.llIIIIIIlI[134]] = N."Insects and other invertebrates";
        N.llIIIIIIIl[N.llIIIIIIlI[135]] = N."Ardougne";
        N.llIIIIIIIl[N.llIIIIIIlI[136]] = N."Apples";
        N.llIIIIIIIl[N.llIIIIIIlI[137]] = N."A labour";
        N.llIIIIIIIl[N.llIIIIIIlI[138]] = N."Lamellae";
        N.llIIIIIIIl[N.llIIIIIIlI[68]] = N."It is resistant to acid";
        N.llIIIIIIIl[N.llIIIIIIlI[139]] = N."Simian";
        N.llIIIIIIIl[N.llIIIIIIlI[140]] = N."Red";
        N.llIIIIIIIl[N.llIIIIIIlI[141]] = N."Subterranean";
        N.llIIIIIIIl[N.llIIIIIIlI[142]] = N."Asgarnia";
        N.llIIIIIIIl[N.llIIIIIIlI[143]] = N."Environment";
        N.llIIIIIIIl[N.llIIIIIIlI[144]] = N."Squamata";
        N.llIIIIIIIl[N.llIIIIIIlI[145]] = N."Planning";
        N.llIIIIIIIl[N.llIIIIIIlI[146]] = N."Contracting and stretching";
        N.llIIIIIIIl[N.llIIIIIIlI[147]] = N."The Talpidae family";
        N.llIIIIIIIl[N.llIIIIIIlI[148]] = N."Eating plants";
        N.llIIIIIIIl[N.llIIIIIIlI[149]] = N."Bitternuts";
        N.llIIIIIIIl[N.llIIIIIIlI[150]] = N."Anti-dragon-breath shield";
        N.llIIIIIIIl[N.llIIIIIIlI[165]] = N."Sure thing.";
    }

    private static boolean lIlIIIlIIllII(int n2, int n3) {
        return n2 < n3;
    }

    @Override
    public String ag() {
        return llIIIIIIIl[llIIIIIIlI[69]];
    }

    private static void lIlIIIlIIlIlI() {
        llIIIIIIlI = new int[171];
        N.llIIIIIIlI[0] = 0x79 ^ 0x5B ^ (0x5C ^ 0x4C);
        N.llIIIIIIlI[1] = (235 + 35 - 160 + 126 ^ 141 + 49 - 171 + 157) & (0x85 ^ 0x8A ^ (0xF0 ^ 0xA3) ^ -1);
        N.llIIIIIIlI[2] = 1;
        N.llIIIIIIlI[3] = -(0xFFFFFECB & 0x4D3D) & (0xFFFFDFFF & 0x6FFE);
        N.llIIIIIIlI[4] = -(0xFFFFACF4 & 0x7F5F) & (0xFFFFBFFB & 0x7FDF);
        N.llIIIIIIlI[5] = 72 + 47 - -4 + 63 ^ 89 + 85 - -11 + 5;
        N.llIIIIIIlI[6] = 2;
        N.llIIIIIIlI[7] = -(0xFFFFE1FD & 0x3E2B) & (0xFFFFBF6F & Short.MAX_VALUE);
        N.llIIIIIIlI[8] = 0xFFFFB751 & 0x79FF;
        N.llIIIIIIlI[9] = 0x4E ^ 0x44;
        N.llIIIIIIlI[10] = 0x67 ^ 0x51 ^ (0x2C ^ 0x1F);
        N.llIIIIIIlI[11] = 0x4E ^ 0x66;
        N.llIIIIIIlI[12] = 3;
        N.llIIIIIIlI[13] = 0x6C ^ 0x64;
        N.llIIIIIIlI[14] = -(0xFFFFFC3F & 0x2FC5) & (0xFFFFAFF6 & Short.MAX_VALUE);
        N.llIIIIIIlI[15] = 0xFFFFACA5 & 0x5B5A;
        N.llIIIIIIlI[16] = 0x69 ^ 0x6F;
        N.llIIIIIIlI[17] = 74 + 118 - 87 + 55 ^ 52 + 21 - -72 + 24;
        N.llIIIIIIlI[18] = 0xFFFFFFED & 0x603B;
        N.llIIIIIIlI[19] = -(0xFFFF95F9 & 0x6BA7) & (0xFFFF8BBD & 0x77F7);
        N.llIIIIIIlI[20] = 0xFFFFA802 & 0x5FFF;
        N.llIIIIIIlI[21] = 0x25 ^ 0x22;
        N.llIIIIIIlI[22] = 0xFFFFFFBB & 0x606E;
        N.llIIIIIIlI[23] = -(0xFFFFF7F3 & 0x289F) & (0xFFFFAA9E & 0x7DF7);
        N.llIIIIIIlI[24] = 0xFFFFEB37 & 0x74EF;
        N.llIIIIIIlI[25] = 0xFFFFCDCF & 0x3A36;
        N.llIIIIIIlI[26] = 0xFFFFFCBC & 0x636B;
        N.llIIIIIIlI[27] = 0xFFFFCD3E & 0x3AC9;
        N.llIIIIIIlI[28] = 0xFFFFFC76 & 0x63AF;
        N.llIIIIIIlI[29] = -(0xFFFFB77D & 0x7FD3) & (0xFFFFFF5A & 0x3FFF);
        N.llIIIIIIlI[30] = 0xA6 ^ 0xAD;
        N.llIIIIIIlI[31] = 0xFFFFF6B7 & 0x696D;
        N.llIIIIIIlI[32] = 0xFFFFCFDF & 0x382C;
        N.llIIIIIIlI[33] = 0x79 ^ 0x75;
        N.llIIIIIIlI[34] = -(0xFFFFBFFF & 0x47DD) & (0xFFFFE7FC & Short.MAX_VALUE);
        N.llIIIIIIlI[35] = 0xFFFFD8AE & 0x2F5F;
        N.llIIIIIIlI[36] = 0x6A ^ 0x67;
        N.llIIIIIIlI[37] = -(0xFFFFAEC9 & 0x5D77) & (0xFFFFFDDF & 0x6E7F);
        N.llIIIIIIlI[38] = -(0xFFFFBFFF & 0x6507) & (0xFFFFFDBE & 0x2F57);
        N.llIIIIIIlI[39] = 0x38 ^ 0x36;
        N.llIIIIIIlI[40] = -(0xFFFFDFEB & 0x37D5) & (0xFFFFF7DE & Short.MAX_VALUE);
        N.llIIIIIIlI[41] = 0xFFFFFEBE & 0x953;
        N.llIIIIIIlI[42] = 0x98 ^ 0xAC ^ (0x1D ^ 0x26);
        N.llIIIIIIlI[43] = -(0xFFFFFFDB & 0x1A7) & (0xFFFFE7FF & 0x799F);
        N.llIIIIIIlI[44] = -(0xFFFFFFE7 & 0x415B) & (0xFFFFC956 & Short.MAX_VALUE);
        N.llIIIIIIlI[45] = 0xB ^ 0x10 ^ (0xA8 ^ 0xA3);
        N.llIIIIIIlI[46] = 0xFFFFEA32 & 0x75EF;
        N.llIIIIIIlI[47] = -(0xFFFFF3DB & 0x2DED) & (0xFFFFBDDE & 0x6BFF);
        N.llIIIIIIlI[48] = 12 + 50 - -62 + 13 ^ 11 + 3 - -138 + 0;
        N.llIIIIIIlI[49] = 0xFFFFEA7F & 0x75A1;
        N.llIIIIIIlI[50] = -(0xFFFFB5E7 & 0x5E9C) & (0xFFFFDE9F & 0x3DFB);
        N.llIIIIIIlI[51] = 93 + 43 - -63 + 13 ^ 68 + 63 - 11 + 78;
        N.llIIIIIIlI[52] = -(0xFFFFDCCF & 0x37F9) & (0xFFFFFCEF & 0x77FB);
        N.llIIIIIIlI[53] = -(0xFFFFFDEF & 0x6772) & (0xFFFFEDFB & 0x7F7F);
        N.llIIIIIIlI[54] = 0x4C ^ 0x2C ^ (0x5E ^ 0x2D);
        N.llIIIIIIlI[55] = -(0xFFFFA75E & 0x5BFD) & (0xFFFFFFFF & 0x637F);
        N.llIIIIIIlI[56] = -(0xFFFFDDEA & 0x2757) & (0xFFFFEF5D & 0x1DFF);
        N.llIIIIIIlI[57] = 0xE7 ^ 0xC0 ^ (0x54 ^ 0x67);
        N.llIIIIIIlI[58] = 0xF7 ^ 0xBA ^ (0xF5 ^ 0xAD);
        N.llIIIIIIlI[59] = 0xA2 ^ 0xB4;
        N.llIIIIIIlI[60] = 4 ^ 0x13;
        N.llIIIIIIlI[61] = 0 + 84 - -8 + 70 ^ 67 + 49 - 42 + 116;
        N.llIIIIIIlI[62] = 0x28 ^ 0x49 ^ (0xBB ^ 0xC2);
        N.llIIIIIIlI[63] = 0x5B ^ 0x42;
        N.llIIIIIIlI[64] = 0x76 ^ 0x1B ^ (0xF2 ^ 0x85);
        N.llIIIIIIlI[65] = 0xFFFFBFDE & 0x6EED;
        N.llIIIIIIlI[66] = -(0xFFFFF5DB & 0x1E65) & (0xFFFFF5EC & 0x7FFB);
        N.llIIIIIIlI[67] = -(0xFFFFF7FF & 0x4C72) & (0xFFFFDFFF & 0x67F5);
        N.llIIIIIIlI[68] = 0xF7 ^ 0x93;
        N.llIIIIIIlI[69] = 0x88 ^ 0x93;
        N.llIIIIIIlI[70] = 110 + 36 - -28 + 13 ^ 124 + 71 - 93 + 64;
        N.llIIIIIIlI[71] = 0xA3 ^ 0xBD;
        N.llIIIIIIlI[72] = 97 + 149 - 95 + 21 ^ 19 + 103 - -20 + 37;
        N.llIIIIIIlI[73] = 124 + 132 - 116 + 49 ^ 130 + 4 - 12 + 35;
        N.llIIIIIIlI[74] = 0x2C ^ 0xD;
        N.llIIIIIIlI[75] = 0x84 ^ 0x8E ^ (0x84 ^ 0xAC);
        N.llIIIIIIlI[76] = 0x87 ^ 0xA4;
        N.llIIIIIIlI[77] = 0x47 ^ 0xA ^ (0xD5 ^ 0xBC);
        N.llIIIIIIlI[78] = 0xB2 ^ 0x97;
        N.llIIIIIIlI[79] = 35 + 77 - -11 + 9 ^ 101 + 20 - -24 + 17;
        N.llIIIIIIlI[80] = 0xD0 ^ 0xC3 ^ (0x9F ^ 0xAB);
        N.llIIIIIIlI[81] = 0xBB ^ 0x92;
        N.llIIIIIIlI[82] = 0x55 ^ 0x7F;
        N.llIIIIIIlI[83] = 100 + 42 - 92 + 82 ^ 35 + 46 - 29 + 123;
        N.llIIIIIIlI[84] = 6 ^ 0x2A;
        N.llIIIIIIlI[85] = 0xAC ^ 0x81;
        N.llIIIIIIlI[86] = 0x19 ^ 0x37;
        N.llIIIIIIlI[87] = 0x58 ^ 0x77;
        N.llIIIIIIlI[88] = 0xDE ^ 0xA0 ^ (0xFC ^ 0xB2);
        N.llIIIIIIlI[89] = 0x2F ^ 0x1E;
        N.llIIIIIIlI[90] = 3 ^ 0x30;
        N.llIIIIIIlI[91] = 0x90 ^ 0xB3 ^ (0xAD ^ 0xBA);
        N.llIIIIIIlI[92] = 1 ^ (0xB ^ 0x3F);
        N.llIIIIIIlI[93] = 0xF1 ^ 0xC7;
        N.llIIIIIIlI[94] = 0x2F ^ 0x18;
        N.llIIIIIIlI[95] = 7 ^ 0x3F;
        N.llIIIIIIlI[96] = 0xA0 ^ 0x99;
        N.llIIIIIIlI[97] = 0x86 ^ 0xBC;
        N.llIIIIIIlI[98] = 7 + 65 - 57 + 128 ^ 98 + 165 - 222 + 139;
        N.llIIIIIIlI[99] = 1 ^ (0x7D ^ 0x40);
        N.llIIIIIIlI[100] = 0xBF ^ 0x98 ^ (0x9C ^ 0x86);
        N.llIIIIIIlI[101] = 6 + 21 - -59 + 72 ^ 76 + 56 - 53 + 81;
        N.llIIIIIIlI[102] = 0x30 ^ 0xF;
        N.llIIIIIIlI[103] = 0x3A ^ 0x7A;
        N.llIIIIIIlI[104] = 7 ^ 0x46;
        N.llIIIIIIlI[105] = 0xCE ^ 0xB6 ^ (0x1B ^ 0x21);
        N.llIIIIIIlI[106] = 0xDE ^ 0x9D;
        N.llIIIIIIlI[107] = 12 + 109 - 110 + 181 ^ 111 + 25 - 26 + 22;
        N.llIIIIIIlI[108] = 0x76 ^ 0x33;
        N.llIIIIIIlI[109] = 151 + 232 - 257 + 118 ^ 148 + 56 - 54 + 28;
        N.llIIIIIIlI[110] = 46 + 175 - 203 + 188 ^ 136 + 33 - 57 + 25;
        N.llIIIIIIlI[111] = 0xCD ^ 0x85;
        N.llIIIIIIlI[112] = 16 + 179 - -2 + 38 ^ 101 + 120 - 146 + 87;
        N.llIIIIIIlI[113] = 0x23 ^ 0x3D ^ (0x78 ^ 0x2C);
        N.llIIIIIIlI[114] = 0xB1 ^ 0x97 ^ (0xAC ^ 0xC1);
        N.llIIIIIIlI[115] = 0x5B ^ 0x17;
        N.llIIIIIIlI[116] = 0x17 ^ 0x46 ^ (0xB8 ^ 0xA4);
        N.llIIIIIIlI[117] = 54 + 74 - -44 + 59 ^ 101 + 104 - 194 + 158;
        N.llIIIIIIlI[118] = 0x51 ^ 0x63 ^ (0xE9 ^ 0x94);
        N.llIIIIIIlI[119] = 0x2B ^ 0x3C ^ (0x51 ^ 0x16);
        N.llIIIIIIlI[120] = 0x6B ^ 0x3A;
        N.llIIIIIIlI[121] = 0xE5 ^ 0xB7;
        N.llIIIIIIlI[122] = 0x75 ^ 0x3C ^ (0x11 ^ 0xB);
        N.llIIIIIIlI[123] = 0x6B ^ 0x3F;
        N.llIIIIIIlI[124] = 0xDD ^ 0xC4 ^ (0x2C ^ 0x60);
        N.llIIIIIIlI[125] = 230 + 109 - 120 + 32 ^ 103 + 98 - 162 + 134;
        N.llIIIIIIlI[126] = 0x79 ^ 0x2E;
        N.llIIIIIIlI[127] = 0xC9 ^ 0x87 ^ (0x15 ^ 3);
        N.llIIIIIIlI[128] = 53 + 110 - -28 + 8 ^ 83 + 98 - 56 + 33;
        N.llIIIIIIlI[129] = 0x5A ^ 0;
        N.llIIIIIIlI[130] = 0x42 ^ 0x19;
        N.llIIIIIIlI[131] = 0x64 ^ 0x38;
        N.llIIIIIIlI[132] = 0x2C ^ 0x71;
        N.llIIIIIIlI[133] = 0x3E ^ 0x60;
        N.llIIIIIIlI[134] = 0xD5 ^ 0x8A;
        N.llIIIIIIlI[135] = (0x85 ^ 0xC7) & ~(0x1E ^ 0x5C) & ~((0x65 ^ 0x68) & ~(9 ^ 4)) ^ (0x2B ^ 0x4B);
        N.llIIIIIIlI[136] = 3 ^ 0x62;
        N.llIIIIIIlI[137] = 0xB7 ^ 0xA9 ^ (0xA ^ 0x76);
        N.llIIIIIIlI[138] = 26 + 5 - -83 + 107 ^ 148 + 171 - 205 + 76;
        N.llIIIIIIlI[139] = 0xBB ^ 0x99 ^ (0x46 ^ 1);
        N.llIIIIIIlI[140] = 0 ^ 0x1C ^ (0xF3 ^ 0x89);
        N.llIIIIIIlI[141] = 0 ^ 0x67;
        N.llIIIIIIlI[142] = 38 + 220 - 170 + 140 ^ 20 + 44 - -3 + 73;
        N.llIIIIIIlI[143] = 0x6D ^ 0xB ^ (9 ^ 6);
        N.llIIIIIIlI[144] = 0x47 ^ 0x2D;
        N.llIIIIIIlI[145] = 0xF3 ^ 0xBA ^ (0x2F ^ 0xD);
        N.llIIIIIIlI[146] = 75 + 13 - -107 + 14 ^ 155 + 95 - 76 + 15;
        N.llIIIIIIlI[147] = 0x2F ^ 2 ^ (0x3D ^ 0x7D);
        N.llIIIIIIlI[148] = 156 + 93 - 75 + 45 ^ 75 + 163 - 156 + 99;
        N.llIIIIIIlI[149] = 0x14 ^ 0x38 ^ (0xFE ^ 0xBD);
        N.llIIIIIIlI[150] = 0xD7 ^ 0xA7;
        N.llIIIIIIlI[151] = -(0xFFFFBB2E & 0x74D7) & (0xFFFFBCBF & Short.MAX_VALUE);
        N.llIIIIIIlI[152] = -(0xFFFFFFE1 & 0x109F) & (0xFFFFFDFE & 0x1FFD);
        N.llIIIIIIlI[153] = -(0xFFFFDFDB & 0x7925) & (0xFFFFFFDE & 0x5FFF);
        N.llIIIIIIlI[154] = -(0xFFFFEFE7 & 0x74BD) & (0xFFFFFFFF & 0x77FF);
        N.llIIIIIIlI[155] = 0xFFFFCFFF & 0x36DD;
        N.llIIIIIIlI[156] = -(0xFFFFB6BB & 0x6945) & (0xFFFFF7DF & 0x3B6B);
        N.llIIIIIIlI[157] = 0xFFFFFFF9 & 0x6F7;
        N.llIIIIIIlI[158] = 0xFFFFFB5F & 0x17FF;
        N.llIIIIIIlI[159] = -(0xFFFFF997 & 0x7F79) & (0xFFFFFFFF & 0x7FFC);
        N.llIIIIIIlI[160] = -(0xFFFFBE95 & 0x496B) & (0xFFFFBF7D & 0x5BF3);
        N.llIIIIIIlI[161] = -(0xFFFFD7BE & 0x294F) & (0xFFFFEFFF & 0x17DF);
        N.llIIIIIIlI[162] = 0xFFFFD7F2 & 0x3B7D;
        N.llIIIIIIlI[163] = 0xFFFFF6EE & 0xFDF;
        N.llIIIIIIlI[164] = 0xFFFF9375 & 0x7FEA;
        N.llIIIIIIlI[165] = 0x49 ^ 0x69 ^ (0xC ^ 0x5D);
        N.llIIIIIIlI[166] = 0xFFFFE6EF & 0x1D9E;
        N.llIIIIIIlI[167] = 0xFFFFFD78 & 0xFBF;
        N.llIIIIIIlI[168] = -(0xFFFFA9AD & 0x7E57) & (0xFFFFBB9F & 0x6F77);
        N.llIIIIIIlI[169] = 0xFFFF9BFF & 0x66B7;
        N.llIIIIIIlI[170] = 0x6D ^ 0x40 ^ (0x1D ^ 0x42);
    }

    private static boolean lIlIIIlIlIIll(Object object) {
        return object == null;
    }

    /*
     * WARNING - void declaration
     */
    private static void cZ() {
        void var6;
        Widget widget2 = Widgets.get((int)llIIIIIIlI[19], (int)llIIIIIIlI[61]);
        if (N.lIlIIIlIlIIll(widget2)) {
            System.out.println(llIIIIIIIl[llIIIIIIlI[62]]);
            return;
        }
        if (N.lIlIIIlIIlllI(var6)) {
            System.out.println(var6.getText());
        }
        int var14 = llIIIIIIlI[1];
        while (N.lIlIIIlIIllII(var14, i.values().length)) {
            if (N.lIlIIIlIIlIll(var6.getText().equalsIgnoreCase(i.values()[var14].aa()) ? 1 : 0)) {
                System.out.println("answer: " + i.values()[var14].ab());
                int var17 = var14;
                Widget var25 = Widgets.get((int)llIIIIIIlI[19], widget -> widget.getText().strip().contains(i.values()[var17].ab()));
                if (N.lIlIIIlIIlllI(var25)) {
                    System.out.println(llIIIIIIIl[llIIIIIIlI[63]]);
                    Mouse.click((int)var25.getClickPoint().getX(), (int)var25.getClickPoint().getY(), (boolean)llIIIIIIlI[2]);
                    Time.sleepTicks((int)llIIIIIIlI[6]);
                    0;
                    0;
                    if ((0xC8 ^ 0xB6 ^ (0x59 ^ 0x23)) != 3) break;
                    return;
                }
            }
            ++var14;
            0;
            if (1 < 2) continue;
            return;
        }
    }

    private static String lIlIIIlIIIlll(String var27, String var16) {
        var27 = new String(Base64.getDecoder().decode(var27.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var4 = new StringBuilder();
        char[] var19 = var16.toCharArray();
        int var8 = llIIIIIIlI[1];
        char[] var2 = var27.toCharArray();
        int var9 = var2.length;
        int var10 = llIIIIIIlI[1];
        while (N.lIlIIIlIIllII(var10, var9)) {
            char var7 = var2[var10];
            var4.append((char)(var7 ^ var19[var8 % var19.length]));
            0;
            ++var8;
            ++var10;
            0;
            if (2 != 0) continue;
            return null;
        }
        return String.valueOf(var4);
    }

    private static String lIlIIIlIIIllI(String var5, String var21) {
        try {
            SecretKeySpec var3 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var21.getBytes(StandardCharsets.UTF_8)), llIIIIIIlI[13]), "DES");
            Cipher var20 = Cipher.getInstance("DES");
            var20.init(llIIIIIIlI[6], var3);
            return new String(var20.doFinal(Base64.getDecoder().decode(var5.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var11) {
            var11.printStackTrace();
            return null;
        }
    }

    @Override
    public int af() {
        try {
            N.cY();
            0;
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (2 >= 3) {
            return (0x6E ^ 0x76) & ~(3 ^ 0x1B);
        }
        return llIIIIIIlI[68];
    }

    static {
        N.lIlIIIlIIlIlI();
        N.lIlIIIlIIlIIl();
        hc = llIIIIIIlI[19];
        ix = llIIIIIIIl[llIIIIIIlI[70]];
        iz = llIIIIIIIl[llIIIIIIlI[71]];
        ih = llIIIIIIIl[llIIIIIIlI[72]];
        hR = llIIIIIIIl[llIIIIIIlI[73]];
        he = llIIIIIIlI[22];
        ii = llIIIIIIIl[llIIIIIIlI[74]];
        ib = llIIIIIIIl[llIIIIIIlI[75]];
        hy = llIIIIIIIl[llIIIIIIlI[76]];
        ic = llIIIIIIIl[llIIIIIIlI[77]];
        hZ = llIIIIIIIl[llIIIIIIlI[78]];
        iS = llIIIIIIIl[llIIIIIIlI[79]];
        iB = llIIIIIIIl[llIIIIIIlI[80]];
        iJ = llIIIIIIIl[llIIIIIIlI[11]];
        hq = llIIIIIIlI[55];
        ir = llIIIIIIIl[llIIIIIIlI[81]];
        is = llIIIIIIIl[llIIIIIIlI[82]];
        hb = llIIIIIIlI[6];
        iV = llIIIIIIIl[llIIIIIIlI[83]];
        ie = llIIIIIIIl[llIIIIIIlI[84]];
        iq = llIIIIIIIl[llIIIIIIlI[85]];
        iF = llIIIIIIIl[llIIIIIIlI[86]];
        hT = llIIIIIIIl[llIIIIIIlI[87]];
        hX = llIIIIIIIl[llIIIIIIlI[88]];
        iT = llIIIIIIIl[llIIIIIIlI[89]];
        hG = llIIIIIIIl[llIIIIIIlI[0]];
        hg = llIIIIIIlI[26];
        hP = llIIIIIIIl[llIIIIIIlI[90]];
        hk = llIIIIIIlI[37];
        iy = llIIIIIIIl[llIIIIIIlI[91]];
        iA = llIIIIIIIl[llIIIIIIlI[92]];
        hW = llIIIIIIIl[llIIIIIIlI[93]];
        hm = llIIIIIIlI[43];
        iK = llIIIIIIIl[llIIIIIIlI[94]];
        iG = llIIIIIIIl[llIIIIIIlI[95]];
        iD = llIIIIIIIl[llIIIIIIlI[96]];
        io = llIIIIIIIl[llIIIIIIlI[97]];
        hV = llIIIIIIIl[llIIIIIIlI[98]];
        jc = llIIIIIIIl[llIIIIIIlI[99]];
        if = llIIIIIIIl[llIIIIIIlI[100]];
        hH = llIIIIIIIl[llIIIIIIlI[101]];
        iW = llIIIIIIIl[llIIIIIIlI[102]];
        hn = llIIIIIIlI[46];
        im = llIIIIIIIl[llIIIIIIlI[103]];
        ip = llIIIIIIIl[llIIIIIIlI[104]];
        ha = llIIIIIIlI[3];
        hN = llIIIIIIIl[llIIIIIIlI[105]];
        it = llIIIIIIIl[llIIIIIIlI[106]];
        ij = llIIIIIIIl[llIIIIIIlI[107]];
        iU = llIIIIIIIl[llIIIIIIlI[108]];
        hf = llIIIIIIlI[24];
        iY = llIIIIIIIl[llIIIIIIlI[109]];
        hj = llIIIIIIlI[34];
        iv = llIIIIIIIl[llIIIIIIlI[110]];
        ia = llIIIIIIIl[llIIIIIIlI[111]];
        iE = llIIIIIIIl[llIIIIIIlI[112]];
        hM = llIIIIIIIl[llIIIIIIlI[113]];
        hh = llIIIIIIlI[28];
        jd = llIIIIIIIl[llIIIIIIlI[114]];
        in = llIIIIIIIl[llIIIIIIlI[115]];
        hS = llIIIIIIIl[llIIIIIIlI[116]];
        ho = llIIIIIIlI[49];
        hE = llIIIIIIIl[llIIIIIIlI[117]];
        iI = llIIIIIIIl[llIIIIIIlI[118]];
        hF = llIIIIIIIl[llIIIIIIlI[119]];
        hK = llIIIIIIIl[llIIIIIIlI[120]];
        hD = llIIIIIIIl[llIIIIIIlI[121]];
        iX = llIIIIIIIl[llIIIIIIlI[122]];
        hJ = llIIIIIIIl[llIIIIIIlI[123]];
        iN = llIIIIIIIl[llIIIIIIlI[124]];
        iL = llIIIIIIIl[llIIIIIIlI[125]];
        iO = llIIIIIIIl[llIIIIIIlI[126]];
        iZ = llIIIIIIIl[llIIIIIIlI[127]];
        il = llIIIIIIIl[llIIIIIIlI[128]];
        hL = llIIIIIIIl[llIIIIIIlI[129]];
        ik = llIIIIIIIl[llIIIIIIlI[130]];
        hA = llIIIIIIIl[llIIIIIIlI[131]];
        ig = llIIIIIIIl[llIIIIIIlI[132]];
        iu = llIIIIIIIl[llIIIIIIlI[133]];
        iQ = llIIIIIIIl[llIIIIIIlI[134]];
        hI = llIIIIIIIl[llIIIIIIlI[135]];
        ja = llIIIIIIIl[llIIIIIIlI[136]];
        iP = llIIIIIIIl[llIIIIIIlI[137]];
        hi = llIIIIIIlI[31];
        iw = llIIIIIIIl[llIIIIIIlI[138]];
        hp = llIIIIIIlI[52];
        hQ = llIIIIIIIl[llIIIIIIlI[68]];
        hd = llIIIIIIlI[18];
        hz = llIIIIIIIl[llIIIIIIlI[139]];
        hC = llIIIIIIIl[llIIIIIIlI[140]];
        iM = llIIIIIIIl[llIIIIIIlI[141]];
        hl = llIIIIIIlI[40];
        hY = llIIIIIIIl[llIIIIIIlI[142]];
        jb = llIIIIIIIl[llIIIIIIlI[143]];
        hO = llIIIIIIIl[llIIIIIIlI[144]];
        iH = llIIIIIIIl[llIIIIIIlI[145]];
        hU = llIIIIIIIl[llIIIIIIlI[146]];
        iR = llIIIIIIIl[llIIIIIIlI[147]];
        iC = llIIIIIIIl[llIIIIIIlI[148]];
        hB = llIIIIIIIl[llIIIIIIlI[149]];
        id = llIIIIIIIl[llIIIIIIlI[150]];
        hr = new WorldPoint(llIIIIIIlI[151], llIIIIIIlI[152], llIIIIIIlI[1]);
        hs = new WorldPoint(llIIIIIIlI[153], llIIIIIIlI[154], llIIIIIIlI[1]);
        ht = new WorldPoint(llIIIIIIlI[155], llIIIIIIlI[156], llIIIIIIlI[1]);
        hu = new WorldPoint(llIIIIIIlI[157], llIIIIIIlI[158], llIIIIIIlI[1]);
        hv = new WorldPoint(llIIIIIIlI[159], llIIIIIIlI[160], llIIIIIIlI[1]);
        hw = new WorldPoint(llIIIIIIlI[161], llIIIIIIlI[162], llIIIIIIlI[1]);
        hx = new WorldPoint(llIIIIIIlI[163], llIIIIIIlI[164], llIIIIIIlI[1]);
        bv = new ArrayList<d>();
        String[] stringArray = new String[llIIIIIIlI[2]];
        stringArray[N.llIIIIIIlI[1]] = llIIIIIIIl[llIIIIIIlI[165]];
        je = stringArray;
        cF = new WorldArea(llIIIIIIlI[166], llIIIIIIlI[167], llIIIIIIlI[168], llIIIIIIlI[169], llIIIIIIlI[1]);
    }

    private static boolean lIlIIIlIIllll(int n2) {
        return n2 > 0;
    }

    private static boolean lIlIIIlIIllIl(int n2) {
        return n2 == 0;
    }

    private static void Q() {
        d var22;
        Predicate<Item> var1;
        int[] nArray = new int[llIIIIIIlI[2]];
        nArray[N.llIIIIIIlI[1]] = llIIIIIIlI[8];
        if (N.lIlIIIlIIllIl(Bank.contains((int[])nArray) ? 1 : 0)) {
            d d2 = new d(llIIIIIIlI[8], llIIIIIIlI[10], j.cf);
            bv.add(d2);
            0;
        }
        if (N.lIlIIIlIIllIl(Bank.contains(var1 = item -> item.getName().toLowerCase().contains(llIIIIIIIl[llIIIIIIlI[61]])) ? 1 : 0)) {
            var22 = new d(llIIIIIIlI[65], llIIIIIIlI[10], llIIIIIIlI[66]);
            bv.add(var22);
            0;
        }
        int[] nArray2 = new int[llIIIIIIlI[2]];
        nArray2[N.llIIIIIIlI[1]] = llIIIIIIlI[7];
        if (N.lIlIIIlIIllIl(Bank.contains((int[])nArray2) ? 1 : 0)) {
            var22 = new d(llIIIIIIlI[7], llIIIIIIlI[11], llIIIIIIlI[67]);
            bv.add(var22);
            0;
        }
    }

    private static boolean lIlIIIlIlIIII(int n2, int n3) {
        return n2 > n3;
    }
}

