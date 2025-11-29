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
package gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks;

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
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.AHelper;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.ac;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.BHelper;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.DHelper;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.EHelper;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.FHelper;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.GHelper;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.GameEnum;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.JHelper;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class NHelper
implements ac {
    public static final  String hy;
    public static final  WorldPoint hv;
    public static final  String ih;
    public static final  String hz;
    
    public static final  String iO;
    public static final  String iB;
    public static final  String ip;
    public static final  String hK;
    public static final  String iA;
    public static final  String if;
    public static final  String ik;
    public static final  String hN;
    public static final  String id;
    public static final  String iW;
    public static final  String hV;
    public static  String[] je;
    public static final  String iD;
    public static final  int hm;
    public static final  String iv;
    public static final  String iF;
    public static final  String hQ;
    public static final  String ib;
    public static final  int hn;
    public static final  String ie;
    public static final  String hC;
    public static final  int hp;
    public static final  String iI;
    public static final  int hg;
    public static final  String hE;
    public static final  String hZ;
    public static final  int hk;
    public static final  String hO;
    public static final  int hj;
    public static final  String hU;
    public static final  String hS;
    public static  WorldArea cF;
    public static final  String iN;
    public static final  WorldPoint hu;
    public static final  String iL;
    public static final  String jc;
    public static final  String in;
    public static final  WorldPoint hw;
    public static final  String hR;
    public static final  WorldPoint hs;
    public static final  int hb;
    public static final  String hJ;
    public static final  String iK;
    public static final  String ic;
    public static final  String iq;
    public static final  WorldPoint hr;
    public static final  String iP;
    public static final  String iu;
    public static final  String hA;
    public static final  int hc;
    public static final  String hB;
    public static final  String iG;
    public static final  WorldPoint ht;
    public static final  String hL;
    public static final  String hT;
    public static final  String io;
    public static final  String iY;
    public static final  int hq;
    public static final  String ix;
    public static final  int hd;
    public static final  String hP;
    static  boolean dj;
    
    public static final  String iy;
    public static final  String iJ;
    public static final  String is;
    public static final  String iS;
    public static final  String hH;
    public static final  int ho;
    public static final  WorldPoint hx;
    public static final  String hY;
    public static final  String iQ;
    public static final  String hG;
    public static final  String hI;
    public static final  String im;
    public static final  int hl;
    public static final  String iC;
    public static final  int ha;
    public static final  String ia;
    public static final  String ja;
    public static  boolean bt;
    public static final  int hf;
    public static final  String jd;
    static  int di;
    public static final  int hh;
    public static final  String ij;
    public static final  String ii;
    public static final  String hW;
    public static final  String ig;
    public static final  String iH;
    public static final  String iZ;
    public static final  String iT;
    public static final  String hX;
    public static final  String it;
    public static final  String iE;
    public static final  String hD;
    public static final  String iU;
    public static final  String iX;
    public static final  String hF;
    public static final  String il;
    public static final  String ir;
    public static final  int he;
    public static final  int hi;
    public static final  String iw;
    public static final  String hM;
    public static  List<d> bv;
    public static final  String iV;
    public static final  String iz;
    public static final  String jb;
    public static final  String iR;
    public static final  String iM;

    private static boolean lIlIIIlIIlllI(Object object) {
        return object != null;
    }

    private static boolean lIlIIIlIlIlII(int n2, int n3) {
        return n2 >= n3;
    }

    private static void q(int n2) {
        if (!N.lIlIIIlIIllIl(Widgets.get((int)llIIIIIIlI[19]).isEmpty() ? 1 : 0) || N.lIlIIIlIlIIll(Widgets.get((int)llIIIIIIlI[19]))) {
            int var1;
            int[] nArray = new int[llIIIIIIlI[2]];
            nArray[N.llIIIIIIlI[1]] = var1;
            if (N.lIlIIIlIIlllI(TileObjects.getNearest((int[])nArray))) {
                int[] nArray2 = new int[llIIIIIIlI[2]];
                nArray2[N.llIIIIIIlI[1]] = var1;
                TileObjects.getNearest((int[])nArray2).interact(llIIIIIIIl[llIIIIIIlI[64]]);
                Time.sleepTicks((int)llIIIIIIlI[6]);

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
                BankLocation var2 = BankLocation.getNearest();
                if (N.lIlIIIlIIlllI(var2) && N.lIlIIIlIIllIl(var2.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    a.a(var2);
                }
                if (N.lIlIIIlIIlllI(var2) && N.lIlIIIlIIlIll(var2.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (N.lIlIIIlIIllIl(Bank.isOpen() ? 1 : 0)) {
                        a.a();
                        Time.sleepUntil(() -> Bank.isOpen(), (int)llIIIIIIlI[4]);

                    }
                    if (N.lIlIIIlIIlIll(Bank.isOpen() ? 1 : 0)) {
                        if (N.lIlIIIlIIllll(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks((int)llIIIIIIlI[5]);

                        }
                        if (N.lIlIIIlIIllll(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks((int)llIIIIIIlI[6]);

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

                        }
                    }
                    AccBuilderSotf.c = llIIIIIIIl[llIIIIIIlI[5]];
                    Movement.walkTo((WorldPoint)hs);

                    Time.sleepTicks((int)llIIIIIIlI[2]);

                }
                if (N.lIlIIIlIlIIIl(Players.getLocal().getWorldLocation().distanceTo(hs), llIIIIIIlI[13])) {
                    g.a(llIIIIIIIl[llIIIIIIlI[10]], je);
                    Time.sleepTicks((int)llIIIIIIlI[2]);

                }
            }
            if (N.lIlIIIlIIllll(e.j(llIIIIIIlI[3]))) {
                if (N.lIlIIIlIlIIlI(e.j(llIIIIIIlI[14]), llIIIIIIlI[15])) {
                    AccBuilderSotf.c = llIIIIIIIl[llIIIIIIlI[16]];
                    if (N.lIlIIIlIlIIII(Players.getLocal().getWorldLocation().distanceTo(ht), llIIIIIIlI[17])) {
                        Movement.walkTo((WorldPoint)ht);

                        Time.sleepTicks((int)llIIIIIIlI[2]);

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

                        Time.sleepTicks((int)llIIIIIIlI[2]);

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

                        Time.sleepTicks((int)llIIIIIIlI[2]);

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

                        Time.sleepTicks((int)llIIIIIIlI[2]);

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

                        Time.sleepTicks((int)llIIIIIIlI[2]);

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

                        Time.sleepTicks((int)llIIIIIIlI[2]);

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

                        Time.sleepTicks((int)llIIIIIIlI[2]);

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

                        Time.sleepTicks((int)llIIIIIIlI[2]);

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

                        Time.sleepTicks((int)llIIIIIIlI[2]);

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

                        Time.sleepTicks((int)llIIIIIIlI[2]);

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

                        Time.sleepTicks((int)llIIIIIIlI[2]);

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

                        Time.sleepTicks((int)llIIIIIIlI[2]);

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

                        Time.sleepTicks((int)llIIIIIIlI[2]);

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

                        Time.sleepTicks((int)llIIIIIIlI[2]);

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

                        Time.sleepTicks((int)llIIIIIIlI[2]);

                    }
                    if (N.lIlIIIlIlIIIl(Players.getLocal().getWorldLocation().distanceTo(hs), llIIIIIIlI[13])) {
                        AccBuilderSotf.c = llIIIIIIIl[llIIIIIIlI[59]];
                        g.a(llIIIIIIIl[llIIIIIIlI[60]], je);
                        Time.sleepTicks((int)llIIIIIIlI[2]);

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

                if (((0x31 ^ 0x62) & ~(0x2B ^ 0x78)) == ((0x1C ^ 0x47) & ~(0x6C ^ 0x37))) return n2 != 0;
                return false;
            }
        }
        n2 = llIIIIIIlI[1];
        return n2 != 0;
    }

    private static boolean lIlIIIlIlIIlI(int n2, int n3) {
        return n2 == n3;
    }

    private static void lIlIIIlIIlIIl() {
        llIIIIIIIl = new String[llIIIIIIlI[170]];
        N.llIIIIIIIl[N.llIIIIIIlI[1]] = "Drink";
        N.llIIIIIIIl[N.llIIIIIIlI[2]] = "Finished buying items, switching back to quest";
        N.llIIIIIIIl[N.llIIIIIIlI[6]] = "We are missing quest supplies, switching to BUYING";
        N.llIIIIIIIl[N.llIIIIIIlI[12]] = "Break";
        N.llIIIIIIIl[N.llIIIIIIlI[5]] = "Nav to start";
        N.llIIIIIIIl[N.llIIIIIIlI[10]] = "Orlando Smith";
        N.llIIIIIIIl[N.llIIIIIIlI[16]] = "Solving terror bird";
        N.llIIIIIIIl[N.llIIIIIIlI[21]] = "Solving kalphite";
        N.llIIIIIIIl[N.llIIIIIIlI[13]] = "Solving Monkey";
        N.llIIIIIIIl[N.llIIIIIIlI[17]] = "Solving sea slug";
        N.llIIIIIIIl[N.llIIIIIIlI[9]] = "Solving snake";
        N.llIIIIIIIl[N.llIIIIIIlI[30]] = "Solving east snail";
        N.llIIIIIIIl[N.llIIIIIIlI[33]] = "Solving wyvern";
        N.llIIIIIIIl[N.llIIIIIIlI[36]] = "Solving dragon";
        N.llIIIIIIIl[N.llIIIIIIlI[39]] = "Solving tort";
        N.llIIIIIIIl[N.llIIIIIIlI[42]] = "Solving croc";
        N.llIIIIIIIl[N.llIIIIIIlI[45]] = "Solving leech";
        N.llIIIIIIIl[N.llIIIIIIlI[48]] = "Solving camel";
        N.llIIIIIIIl[N.llIIIIIIlI[51]] = "Solving mole";
        N.llIIIIIIIl[N.llIIIIIIlI[54]] = "Solving leech";
        N.llIIIIIIIl[N.llIIIIIIlI[57]] = "Handing in quest";
        N.llIIIIIIIl[N.llIIIIIIlI[58]] = "Nav to start";
        N.llIIIIIIIl[N.llIIIIIIlI[59]] = "Talking";
        N.llIIIIIIIl[N.llIIIIIIlI[60]] = "Orlando Smith";
        N.llIIIIIIIl[N.llIIIIIIlI[62]] = "null question";
        N.llIIIIIIIl[N.llIIIIIIlI[63]] = "Found answer";
        N.llIIIIIIIl[N.llIIIIIIlI[64]] = "Study";
        N.llIIIIIIIl[N.llIIIIIIlI[69]] = "Varrock Quiz";
        N.llIIIIIIIl[N.llIIIIIIlI[61]] = "ring of wealth (";
        N.llIIIIIIIl[N.llIIIIIIlI[70]] = "Carnivores";
        N.llIIIIIIIl[N.llIIIIIIlI[71]] = "Scabaras";
        N.llIIIIIIIl[N.llIIIIIIlI[72]] = "Twelve";
        N.llIIIIIIIl[N.llIIIIIIlI[73]] = "Spitting acid";
        N.llIIIIIIIl[N.llIIIIIIlI[74]] = "Mibbiwocket";
        N.llIIIIIIIl[N.llIIIIIIlI[75]] = "Below room temperature";
        N.llIIIIIIIl[N.llIIIIIIlI[76]] = "Orlando Smith";
        N.llIIIIIIIl[N.llIIIIIIlI[77]] = "Runite";
        N.llIIIIIIIl[N.llIIIIIIlI[78]] = "Reptiles";
        N.llIIIIIIIl[N.llIIIIIIlI[79]] = "Toxic dung";
        N.llIIIIIIIl[N.llIIIIIIlI[80]] = "Gnomes";
        N.llIIIIIIIl[N.llIIIIIIlI[11]] = "Cold";
        N.llIIIIIIIl[N.llIIIIIIlI[81]] = "Squamata";
        N.llIIIIIIIl[N.llIIIIIIlI[82]] = "It becomes sleepy";
        N.llIIIIIIIl[N.llIIIIIIlI[83]] = "Annoyed";
        N.llIIIIIIIl[N.llIIIIIIlI[84]] = "Unknown";
        N.llIIIIIIIl[N.llIIIIIIlI[85]] = "Three";
        N.llIIIIIIIl[N.llIIIIIIlI[86]] = "0";
        N.llIIIIIIIl[N.llIIIIIIlI[87]] = "Acid-spitting snail";
        N.llIIIIIIIl[N.llIIIIIIlI[88]] = "Two";
        N.llIIIIIIIl[N.llIIIIIIlI[89]] = "Two";
        N.llIIIIIIIl[N.llIIIIIIlI[0]] = "Seaweed";
        N.llIIIIIIIl[N.llIIIIIIlI[90]] = "Anywhere";
        N.llIIIIIIIl[N.llIIIIIIlI[91]] = "Scarab beetles";
        N.llIIIIIIIl[N.llIIIIIIlI[92]] = "Anything";
        N.llIIIIIIIl[N.llIIIIIIlI[93]] = "Climate change";
        N.llIIIIIIIl[N.llIIIIIIlI[94]] = "Social";
        N.llIIIIIIIl[N.llIIIIIIlI[95]] = "Sight";
        N.llIIIIIIIl[N.llIIIIIIlI[96]] = "Four";
        N.llIIIIIIIl[N.llIIIIIIlI[97]] = "Sunlight";
        N.llIIIIIIIl[N.llIIIIIIlI[98]] = "An operculum";
        N.llIIIIIIIl[N.llIIIIIIlI[99]] = "They attack by jumping";
        N.llIIIIIIIl[N.llIIIIIIlI[100]] = "Elemental";
        N.llIIIIIIIl[N.llIIIIIIlI[101]] = "Defence";
        N.llIIIIIIIl[N.llIIIIIIlI[102]] = "Al Kharid";
        N.llIIIIIIIl[N.llIIIIIIlI[103]] = "Twenty years";
        N.llIIIIIIIl[N.llIIIIIIlI[104]] = "The Slayer Masters";
        N.llIIIIIIIl[N.llIIIIIIlI[105]] = "Constriction";
        N.llIIIIIIIl[N.llIIIIIIlI[106]] = "Hair";
        N.llIIIIIIIl[N.llIIIIIIlI[107]] = "Vegetables";
        N.llIIIIIIIl[N.llIIIIIIlI[108]] = "Omnivore";
        N.llIIIIIIIl[N.llIIIIIIlI[109]] = "Water";
        N.llIIIIIIIl[N.llIIIIIIlI[110]] = "Worker";
        N.llIIIIIIIl[N.llIIIIIIlI[111]] = "Dragons";
        N.llIIIIIIIl[N.llIIIIIIlI[112]] = "Stones";
        N.llIIIIIIIl[N.llIIIIIIlI[113]] = "Seeing how you smell";
        N.llIIIIIIIl[N.llIIIIIIlI[114]] = "It doubles in size";
        N.llIIIIIIIl[N.llIIIIIIlI[115]] = "Gnomes";
        N.llIIIIIIIl[N.llIIIIIIlI[116]] = "Fireproof oil";
        N.llIIIIIIIl[N.llIIIIIIlI[117]] = "Nematocysts";
        N.llIIIIIIIl[N.llIIIIIIlI[118]] = "A layer of fat";
        N.llIIIIIIIl[N.llIIIIIIlI[119]] = "The researchers";
        N.llIIIIIIIl[N.llIIIIIIlI[120]] = "Stomach acid";
        N.llIIIIIIIl[N.llIIIIIIlI[121]] = "Seaweed";
        N.llIIIIIIIl[N.llIIIIIIlI[122]] = "Milk";
        N.llIIIIIIIl[N.llIIIIIIlI[123]] = "They have";
        N.llIIIIIIIl[N.llIIIIIIlI[124]] = "They dig holes";
        N.llIIIIIIIl[N.llIIIIIIlI[125]] = "During breeding";
        N.llIIIIIIIl[N.llIIIIIIlI[126]] = "Wyson the Gardener";
        N.llIIIIIIIl[N.llIIIIIIlI[127]] = "'Y'-shaped";
        N.llIIIIIIIl[N.llIIIIIIlI[128]] = "Hard shell";
        N.llIIIIIIIl[N.llIIIIIIlI[129]] = "Tongue";
        N.llIIIIIIIl[N.llIIIIIIlI[130]] = "Admiral Bake";
        N.llIIIIIIIl[N.llIIIIIIlI[131]] = "Harmless";
        N.llIIIIIIIl[N.llIIIIIIlI[132]] = "Old battle sites";
        N.llIIIIIIIl[N.llIIIIIIlI[133]] = "Pasha";
        N.llIIIIIIIl[N.llIIIIIIlI[134]] = "Insects and other invertebrates";
        N.llIIIIIIIl[N.llIIIIIIlI[135]] = "Ardougne";
        N.llIIIIIIIl[N.llIIIIIIlI[136]] = "Apples";
        N.llIIIIIIIl[N.llIIIIIIlI[137]] = "A labour";
        N.llIIIIIIIl[N.llIIIIIIlI[138]] = "Lamellae";
        N.llIIIIIIIl[N.llIIIIIIlI[68]] = "It is resistant to acid";
        N.llIIIIIIIl[N.llIIIIIIlI[139]] = "Simian";
        N.llIIIIIIIl[N.llIIIIIIlI[140]] = "Red";
        N.llIIIIIIIl[N.llIIIIIIlI[141]] = "Subterranean";
        N.llIIIIIIIl[N.llIIIIIIlI[142]] = "Asgarnia";
        N.llIIIIIIIl[N.llIIIIIIlI[143]] = "Environment";
        N.llIIIIIIIl[N.llIIIIIIlI[144]] = "Squamata";
        N.llIIIIIIIl[N.llIIIIIIlI[145]] = "Planning";
        N.llIIIIIIIl[N.llIIIIIIlI[146]] = "Contracting and stretching";
        N.llIIIIIIIl[N.llIIIIIIlI[147]] = "The Talpidae family";
        N.llIIIIIIIl[N.llIIIIIIlI[148]] = "Eating plants";
        N.llIIIIIIIl[N.llIIIIIIlI[149]] = "Bitternuts";
        N.llIIIIIIIl[N.llIIIIIIlI[150]] = "Anti-dragon-breath shield";
        N.llIIIIIIIl[N.llIIIIIIlI[165]] = "Sure thing.";
    }

    private static boolean lIlIIIlIIllII(int n2, int n3) {
        return n2 < n3;
    }

    @Override
    public String ag() {
        return llIIIIIIIl[llIIIIIIlI[69]];
    }

    private static boolean lIlIIIlIlIIll(Object object) {
        return object == null;
    }

    /*
     * WARNING - void declaration
     */
    private static void cZ() {
        void var3;
        Widget widget2 = Widgets.get((int)llIIIIIIlI[19], (int)llIIIIIIlI[61]);
        if (N.lIlIIIlIlIIll(widget2)) {
            System.out.println(llIIIIIIIl[llIIIIIIlI[62]]);
            return;
        }
        if (N.lIlIIIlIIlllI(var3)) {
            System.out.println(var3.getText());
        }
        int var4 = llIIIIIIlI[1];
        while (N.lIlIIIlIIllII(var4, i.values().length)) {
            if (N.lIlIIIlIIlIll(var3.getText().equalsIgnoreCase(i.values()[var4].aa()) ? 1 : 0)) {
                System.out.println("answer: " + i.values()[var4].ab());
                int var5 = var4;
                Widget var6 = Widgets.get((int)llIIIIIIlI[19], widget -> widget.getText().strip().contains(i.values()[var5].ab()));
                if (N.lIlIIIlIIlllI(var6)) {
                    System.out.println(llIIIIIIIl[llIIIIIIlI[63]]);
                    Mouse.click((int)var6.getClickPoint().getX(), (int)var6.getClickPoint().getY(), (boolean)llIIIIIIlI[2]);
                    Time.sleepTicks((int)llIIIIIIlI[6]);

                    if ((0xC8 ^ 0xB6 ^ (0x59 ^ 0x23)) != 3) break;
                    return;
                }
            }
            ++var4;

            if (1 < 2) continue;
            return;
        }
    }

        return String.valueOf(var7);
    }

    @Override
    public int af() {
        try {
            N.cY();

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
        d var8;
        Predicate<Item> var9;
        int[] nArray = new int[llIIIIIIlI[2]];
        nArray[N.llIIIIIIlI[1]] = llIIIIIIlI[8];
        if (N.lIlIIIlIIllIl(Bank.contains((int[])nArray) ? 1 : 0)) {
            d d2 = new DHelper(llIIIIIIlI[8], llIIIIIIlI[10], j.cf);
            bv.add(d2);

        }
        if (N.lIlIIIlIIllIl(Bank.contains(var9 = item -> item.getName().toLowerCase().contains(llIIIIIIIl[llIIIIIIlI[61]])) ? 1 : 0)) {
            var8 = new DHelper(llIIIIIIlI[65], llIIIIIIlI[10], llIIIIIIlI[66]);
            bv.add(var8);

        }
        int[] nArray2 = new int[llIIIIIIlI[2]];
        nArray2[N.llIIIIIIlI[1]] = llIIIIIIlI[7];
        if (N.lIlIIIlIIllIl(Bank.contains((int[])nArray2) ? 1 : 0)) {
            var8 = new DHelper(llIIIIIIlI[7], llIIIIIIlI[11], llIIIIIIlI[67]);
            bv.add(var8);

        }
    }

    private static boolean lIlIIIlIlIIII(int n2, int n3) {
        return n2 > n3;
    }
}

