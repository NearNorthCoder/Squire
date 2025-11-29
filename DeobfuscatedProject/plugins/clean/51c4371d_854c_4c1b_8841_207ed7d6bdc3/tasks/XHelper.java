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
package gg.squire.51c4371d-854c-4c1b-8841-207ed7d6bdc3.tasks;

import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.F;
import gg.squire.51c4371d-854c-4c1b-8841-207ed7d6bdc3.tasks.AHelper;
import gg.squire.51c4371d-854c-4c1b-8841-207ed7d6bdc3.tasks.BHelper;
import gg.squire.51c4371d-854c-4c1b-8841-207ed7d6bdc3.tasks.DHelper;
import gg.squire.51c4371d-854c-4c1b-8841-207ed7d6bdc3.tasks.EHelper;
import gg.squire.51c4371d-854c-4c1b-8841-207ed7d6bdc3.tasks.FHelper;
import gg.squire.51c4371d-854c-4c1b-8841-207ed7d6bdc3.tasks.GHelper;
import gg.squire.51c4371d-854c-4c1b-8841-207ed7d6bdc3.tasks.GameEnum;
import gg.squire.51c4371d-854c-4c1b-8841-207ed7d6bdc3.tasks.IHelper;
import gg.squire.account.AccBuilderBarrows;
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

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class XHelper
implements F {
    public static final  String ev;
    public static final  String eg;
    public static final  String ea;
    public static final  String eW;
    public static final  String ee;
    public static final  String eP;
    public static  String[] fn;
    public static final  int dj;
    public static final  String fd;
    public static final  String eh;
    public static final  int dm;
    public static final  String ey;
    public static final  String eV;
    public static final  int dt;
    public static final  String ec;
    public static final  String eE;
    public static final  String ew;
    public static final  String dH;
    public static final  String eB;
    public static final  String eO;
    public static final  String fg;
    public static final  String eo;
    public static final  WorldPoint dA;
    public static final  String eM;
    public static final  String fj;
    public static final  String eF;
    public static final  int dr;
    public static final  String eI;
    public static final  String dR;
    public static final  String ep;
    public static final  WorldPoint dF;
    public static final  String dI;
    public static final  String fh;
    
    public static final  String dP;
    public static final  int do;
    public static final  String eL;
    public static final  String eD;
    public static final  String dZ;
    public static final  int dl;
    public static final  String eX;
    public static final  String ez;
    public static final  String fl;
    public static final  WorldPoint dD;
    public static final  String eJ;
    public static final  WorldPoint dE;
    public static  WorldArea bY;
    public static final  String eS;
    public static final  String eT;
    public static final  String dU;
    public static final  String dY;
    public static final  int dp;
    public static final  String fc;
    public static final  String eK;
    public static final  String el;
    public static final  String et;
    public static final  String eb;
    public static  boolean bz;
    public static final  int dq;
    public static final  String dJ;
    public static final  String ef;
    public static  List<d> bB;
    public static final  String eH;
    public static final  String fk;
    public static final  WorldPoint dG;
    public static final  WorldPoint dB;
    public static final  String dT;
    public static final  String ff;
    public static final  String ei;
    public static final  String eC;
    public static final  String eU;
    public static final  String ej;
    public static final  String dO;
    public static final  String fb;
    public static final  String ex;
    public static final  String fi;
    public static final  String dK;
    public static final  String eN;
    public static final  int ds;
    public static final  String ek;
    public static final  String dL;
    public static final  String em;
    public static final  String eY;
    public static final  String eq;
    public static final  String eR;
    public static final  String dS;
    public static final  String en;
    public static final  String fa;
    public static final  int dk;
    public static final  String dQ;
    public static final  String fe;
    public static final  String dN;
    public static final  int dn;
    public static final  WorldPoint dC;
    public static final  int dy;
    public static final  int dw;
    public static final  String eG;
    public static final  String es;
    public static final  String er;
    public static final  String eZ;
    public static final  String eu;
    public static final  int dz;
    public static final  int du;
    public static final  String ed;
    public static final  String dV;
    public static final  int dx;
    static  boolean cj;
    public static final  String dX;
    static  int ci;
    
    public static final  String eQ;
    public static final  int dv;
    public static final  String eA;
    public static final  String dM;
    public static final  String fm;
    public static final  String dW;

    /*
     * WARNING - void declaration
     */
    private static void bj() {
        void lIIlllIlllIIIll;
        Widget widget2 = Widgets.get((int)llllIIIl[19], (int)llllIIIl[61]);
        if (x.llIIIlllllI(widget2)) {
            System.out.println(lllIllll[llllIIIl[62]]);
            return;
        }
        if (x.llIIIlllIIl(lIIlllIlllIIIll)) {
            System.out.println(lIIlllIlllIIIll.getText());
        }
        int lIIlllIlllIIIlI = llllIIIl[1];
        while (x.llIIIllIlll(lIIlllIlllIIIlI, h.values().length)) {
            if (x.llIIIllIllI(lIIlllIlllIIIll.getText().equalsIgnoreCase(h.values()[lIIlllIlllIIIlI].P()) ? 1 : 0)) {
                System.out.println("answer: " + h.values()[lIIlllIlllIIIlI].Q());
                int lIIlllIlllIIIIl = lIIlllIlllIIIlI;
                Widget lIIlllIlllIIIII = Widgets.get((int)llllIIIl[19], widget -> widget.getText().strip().contains(h.values()[lIIlllIlllIIIIl].Q()));
                if (x.llIIIlllIIl(lIIlllIlllIIIII)) {
                    System.out.println(lllIllll[llllIIIl[63]]);
                    Mouse.click((int)lIIlllIlllIIIII.getClickPoint().getX(), (int)lIIlllIlllIIIII.getClickPoint().getY(), (boolean)llllIIIl[2]);
                    Time.sleepTicks((int)llllIIIl[6]);

                    if (null == null) break;
                    return;
                }
            }
            ++lIIlllIlllIIIlI;

            if (1 >= 0) continue;
            return;
        }
    }

    public static void bi() {
        if (x.llIIIllIllI(Inventory.contains((int[])f.bb) ? 1 : 0) && x.llIIIllIlll(Movement.getRunEnergy(), llllIIIl[0])) {
            Inventory.getFirst((int[])f.bb).interact(lllIllll[llllIIIl[1]]);
            Time.sleepTicks((int)llllIIIl[2]);

        }
        if (x.llIIIlllIII(Movement.isRunEnabled() ? 1 : 0)) {
            Movement.toggleRun();
        }
        if (x.llIIIllIllI(bz ? 1 : 0)) {
            b.a(bB);
            if (x.llIIIllIlll(bB.size(), llllIIIl[2])) {
                System.out.println(lllIllll[llllIIIl[2]]);
                bz = llllIIIl[1];
            }
        }
        if (x.llIIIlllIII(bz ? 1 : 0)) {
            if (x.llIIIlllIII(x.ac() ? 1 : 0) && x.llIIIllIlll(e.j(llllIIIl[3]), llllIIIl[2])) {
                BankLocation lIIlllIlllIlIII = BankLocation.getNearest();
                if (x.llIIIlllIIl(lIIlllIlllIlIII) && x.llIIIlllIII(lIIlllIlllIlIII.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    a.a(lIIlllIlllIlIII);
                }
                if (x.llIIIlllIIl(lIIlllIlllIlIII) && x.llIIIllIllI(lIIlllIlllIlIII.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (x.llIIIlllIII(Bank.isOpen() ? 1 : 0)) {
                        a.a();
                        Time.sleepUntil(() -> Bank.isOpen(), (int)llllIIIl[4]);

                    }
                    if (x.llIIIllIllI(Bank.isOpen() ? 1 : 0)) {
                        if (x.llIIIlllIlI(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks((int)llllIIIl[5]);

                        }
                        if (x.llIIIlllIlI(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks((int)llllIIIl[6]);

                        }
                        int[] nArray = new int[llllIIIl[6]];
                        nArray[x.llllIIIl[1]] = llllIIIl[7];
                        nArray[x.llllIIIl[2]] = llllIIIl[8];
                        if (x.llIIIlllIII(e.b(nArray) ? 1 : 0)) {
                            x.ag();
                            System.out.println(lllIllll[llllIIIl[6]]);
                            bz = llllIIIl[2];
                            return;
                        }
                        int[] nArray2 = new int[llllIIIl[6]];
                        nArray2[x.llllIIIl[1]] = llllIIIl[7];
                        nArray2[x.llllIIIl[2]] = llllIIIl[8];
                        if (x.llIIIllIllI(e.b(nArray2) ? 1 : 0)) {
                            a.a(llllIIIl[7], llllIIIl[9]);
                            a.b(f.bb, llllIIIl[10]);
                        }
                    }
                }
            }
            if (x.llIIIllIllI(x.ac() ? 1 : 0) && x.llIIIlllIII(e.j(llllIIIl[3]))) {
                if (x.llIIIlllIll(Players.getLocal().getWorldLocation().distanceTo(dB), llllIIIl[11])) {
                    if (x.llIIIllIllI(bY.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        int[] nArray = new int[llllIIIl[2]];
                        nArray[x.llllIIIl[1]] = llllIIIl[7];
                        if (x.llIIIllIllI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                            int[] nArray3 = new int[llllIIIl[2]];
                            nArray3[x.llllIIIl[1]] = llllIIIl[7];
                            Inventory.getFirst((int[])nArray3).interact(lllIllll[llllIIIl[12]]);
                            Time.sleepTicks((int)llllIIIl[13]);

                        }
                    }
                    AccBuilderBarrows.c = lllIllll[llllIIIl[5]];
                    Movement.walkTo((WorldPoint)dB);

                    Time.sleepTicks((int)llllIIIl[2]);

                }
                if (x.llIIIllllII(Players.getLocal().getWorldLocation().distanceTo(dB), llllIIIl[13])) {
                    g.a(lllIllll[llllIIIl[10]], fn);
                    Time.sleepTicks((int)llllIIIl[2]);

                }
            }
            if (x.llIIIlllIlI(e.j(llllIIIl[3]))) {
                if (x.llIIIllllIl(e.j(llllIIIl[14]), llllIIIl[15])) {
                    AccBuilderBarrows.c = lllIllll[llllIIIl[16]];
                    if (x.llIIIlllIll(Players.getLocal().getWorldLocation().distanceTo(dC), llllIIIl[17])) {
                        Movement.walkTo((WorldPoint)dC);

                        Time.sleepTicks((int)llllIIIl[2]);

                    }
                    if (x.llIIIllllII(Players.getLocal().getWorldLocation().distanceTo(dC), llllIIIl[17])) {
                        x.p(llllIIIl[18]);
                        if (!x.llIIIllIllI(Widgets.get((int)llllIIIl[19]).isEmpty() ? 1 : 0) || x.llIIIlllIIl(Widgets.get((int)llllIIIl[19]))) {
                            x.bj();
                        }
                    }
                }
                if (x.llIIIllllIl(e.j(llllIIIl[14]), llllIIIl[20])) {
                    AccBuilderBarrows.c = lllIllll[llllIIIl[21]];
                    if (x.llIIIlllIll(Players.getLocal().getWorldLocation().distanceTo(dC), llllIIIl[17])) {
                        Movement.walkTo((WorldPoint)dC);

                        Time.sleepTicks((int)llllIIIl[2]);

                    }
                    if (x.llIIIllllII(Players.getLocal().getWorldLocation().distanceTo(dC), llllIIIl[17])) {
                        x.p(llllIIIl[22]);
                        if (!x.llIIIllIllI(Widgets.get((int)llllIIIl[19]).isEmpty() ? 1 : 0) || x.llIIIlllIIl(Widgets.get((int)llllIIIl[19]))) {
                            x.bj();
                        }
                    }
                }
                if (x.llIIIllllIl(e.j(llllIIIl[14]), llllIIIl[23])) {
                    AccBuilderBarrows.c = lllIllll[llllIIIl[13]];
                    if (x.llIIIlllIll(Players.getLocal().getWorldLocation().distanceTo(dD), llllIIIl[17])) {
                        Movement.walkTo((WorldPoint)dD);

                        Time.sleepTicks((int)llllIIIl[2]);

                    }
                    if (x.llIIIllllII(Players.getLocal().getWorldLocation().distanceTo(dD), llllIIIl[17])) {
                        x.p(llllIIIl[24]);
                        if (!x.llIIIllIllI(Widgets.get((int)llllIIIl[19]).isEmpty() ? 1 : 0) || x.llIIIlllIIl(Widgets.get((int)llllIIIl[19]))) {
                            x.bj();
                        }
                    }
                }
                if (x.llIIIllllIl(e.j(llllIIIl[14]), llllIIIl[25])) {
                    AccBuilderBarrows.c = lllIllll[llllIIIl[17]];
                    if (x.llIIIlllIll(Players.getLocal().getWorldLocation().distanceTo(dD), llllIIIl[17])) {
                        Movement.walkTo((WorldPoint)dD);

                        Time.sleepTicks((int)llllIIIl[2]);

                    }
                    if (x.llIIIllllII(Players.getLocal().getWorldLocation().distanceTo(dD), llllIIIl[17])) {
                        x.p(llllIIIl[26]);
                        if (!x.llIIIllIllI(Widgets.get((int)llllIIIl[19]).isEmpty() ? 1 : 0) || x.llIIIlllIIl(Widgets.get((int)llllIIIl[19]))) {
                            x.bj();
                        }
                    }
                }
                if (x.llIIIllllIl(e.j(llllIIIl[14]), llllIIIl[27])) {
                    AccBuilderBarrows.c = lllIllll[llllIIIl[9]];
                    if (x.llIIIlllIll(Players.getLocal().getWorldLocation().distanceTo(dD), llllIIIl[17])) {
                        Movement.walkTo((WorldPoint)dD);

                        Time.sleepTicks((int)llllIIIl[2]);

                    }
                    if (x.llIIIllllII(Players.getLocal().getWorldLocation().distanceTo(dD), llllIIIl[17])) {
                        x.p(llllIIIl[28]);
                        if (!x.llIIIllIllI(Widgets.get((int)llllIIIl[19]).isEmpty() ? 1 : 0) || x.llIIIlllIIl(Widgets.get((int)llllIIIl[19]))) {
                            x.bj();
                        }
                    }
                }
                if (x.llIIIllllIl(e.j(llllIIIl[14]), llllIIIl[29])) {
                    AccBuilderBarrows.c = lllIllll[llllIIIl[30]];
                    if (x.llIIIlllIll(Players.getLocal().getWorldLocation().distanceTo(dD), llllIIIl[17])) {
                        Movement.walkTo((WorldPoint)dD);

                        Time.sleepTicks((int)llllIIIl[2]);

                    }
                    if (x.llIIIllllII(Players.getLocal().getWorldLocation().distanceTo(dD), llllIIIl[17])) {
                        x.p(llllIIIl[31]);
                        if (!x.llIIIllIllI(Widgets.get((int)llllIIIl[19]).isEmpty() ? 1 : 0) || x.llIIIlllIIl(Widgets.get((int)llllIIIl[19]))) {
                            x.bj();
                        }
                    }
                }
                if (x.llIIIllllIl(e.j(llllIIIl[14]), llllIIIl[32])) {
                    AccBuilderBarrows.c = lllIllll[llllIIIl[33]];
                    if (x.llIIIlllIll(Players.getLocal().getWorldLocation().distanceTo(dE), llllIIIl[17])) {
                        Movement.walkTo((WorldPoint)dE);

                        Time.sleepTicks((int)llllIIIl[2]);

                    }
                    if (x.llIIIllllII(Players.getLocal().getWorldLocation().distanceTo(dE), llllIIIl[17])) {
                        x.p(llllIIIl[34]);
                        if (!x.llIIIllIllI(Widgets.get((int)llllIIIl[19]).isEmpty() ? 1 : 0) || x.llIIIlllIIl(Widgets.get((int)llllIIIl[19]))) {
                            x.bj();
                        }
                    }
                }
                if (x.llIIIllllIl(e.j(llllIIIl[14]), llllIIIl[35])) {
                    AccBuilderBarrows.c = lllIllll[llllIIIl[36]];
                    if (x.llIIIlllIll(Players.getLocal().getWorldLocation().distanceTo(dE), llllIIIl[17])) {
                        Movement.walkTo((WorldPoint)dE);

                        Time.sleepTicks((int)llllIIIl[2]);

                    }
                    if (x.llIIIllllII(Players.getLocal().getWorldLocation().distanceTo(dE), llllIIIl[17])) {
                        x.p(llllIIIl[37]);
                        if (!x.llIIIllIllI(Widgets.get((int)llllIIIl[19]).isEmpty() ? 1 : 0) || x.llIIIlllIIl(Widgets.get((int)llllIIIl[19]))) {
                            x.bj();
                        }
                    }
                }
                if (x.llIIIllllIl(e.j(llllIIIl[14]), llllIIIl[38])) {
                    AccBuilderBarrows.c = lllIllll[llllIIIl[39]];
                    if (x.llIIIlllIll(Players.getLocal().getWorldLocation().distanceTo(dF), llllIIIl[17])) {
                        Movement.walkTo((WorldPoint)dF);

                        Time.sleepTicks((int)llllIIIl[2]);

                    }
                    if (x.llIIIllllII(Players.getLocal().getWorldLocation().distanceTo(dF), llllIIIl[17])) {
                        x.p(llllIIIl[40]);
                        if (!x.llIIIllIllI(Widgets.get((int)llllIIIl[19]).isEmpty() ? 1 : 0) || x.llIIIlllIIl(Widgets.get((int)llllIIIl[19]))) {
                            x.bj();
                        }
                    }
                }
                if (x.llIIIllllIl(e.j(llllIIIl[14]), llllIIIl[41])) {
                    AccBuilderBarrows.c = lllIllll[llllIIIl[42]];
                    if (x.llIIIlllIll(Players.getLocal().getWorldLocation().distanceTo(dF), llllIIIl[17])) {
                        Movement.walkTo((WorldPoint)dF);

                        Time.sleepTicks((int)llllIIIl[2]);

                    }
                    if (x.llIIIllllII(Players.getLocal().getWorldLocation().distanceTo(dF), llllIIIl[17])) {
                        x.p(llllIIIl[43]);
                        if (!x.llIIIllIllI(Widgets.get((int)llllIIIl[19]).isEmpty() ? 1 : 0) || x.llIIIlllIIl(Widgets.get((int)llllIIIl[19]))) {
                            x.bj();
                        }
                    }
                }
                if (x.llIIIllllIl(e.j(llllIIIl[14]), llllIIIl[44])) {
                    AccBuilderBarrows.c = lllIllll[llllIIIl[45]];
                    if (x.llIIIlllIll(Players.getLocal().getWorldLocation().distanceTo(dG), llllIIIl[17])) {
                        Movement.walkTo((WorldPoint)dG);

                        Time.sleepTicks((int)llllIIIl[2]);

                    }
                    if (x.llIIIllllII(Players.getLocal().getWorldLocation().distanceTo(dG), llllIIIl[17])) {
                        x.p(llllIIIl[46]);
                        if (!x.llIIIllIllI(Widgets.get((int)llllIIIl[19]).isEmpty() ? 1 : 0) || x.llIIIlllIIl(Widgets.get((int)llllIIIl[19]))) {
                            x.bj();
                        }
                    }
                }
                if (x.llIIIllllIl(e.j(llllIIIl[14]), llllIIIl[47])) {
                    AccBuilderBarrows.c = lllIllll[llllIIIl[48]];
                    if (x.llIIIlllIll(Players.getLocal().getWorldLocation().distanceTo(dG), llllIIIl[17])) {
                        Movement.walkTo((WorldPoint)dG);

                        Time.sleepTicks((int)llllIIIl[2]);

                    }
                    if (x.llIIIllllII(Players.getLocal().getWorldLocation().distanceTo(dG), llllIIIl[17])) {
                        x.p(llllIIIl[49]);
                        if (!x.llIIIllIllI(Widgets.get((int)llllIIIl[19]).isEmpty() ? 1 : 0) || x.llIIIlllIIl(Widgets.get((int)llllIIIl[19]))) {
                            x.bj();
                        }
                    }
                }
                if (x.llIIIllllIl(e.j(llllIIIl[14]), llllIIIl[50])) {
                    AccBuilderBarrows.c = lllIllll[llllIIIl[51]];
                    if (x.llIIIlllIll(Players.getLocal().getWorldLocation().distanceTo(dG), llllIIIl[17])) {
                        Movement.walkTo((WorldPoint)dG);

                        Time.sleepTicks((int)llllIIIl[2]);

                    }
                    if (x.llIIIllllII(Players.getLocal().getWorldLocation().distanceTo(dG), llllIIIl[17])) {
                        x.p(llllIIIl[52]);
                        if (!x.llIIIllIllI(Widgets.get((int)llllIIIl[19]).isEmpty() ? 1 : 0) || x.llIIIlllIIl(Widgets.get((int)llllIIIl[19]))) {
                            x.bj();
                        }
                    }
                }
                if (x.llIIIllllIl(e.j(llllIIIl[14]), llllIIIl[53])) {
                    AccBuilderBarrows.c = lllIllll[llllIIIl[54]];
                    if (x.llIIIlllIll(Players.getLocal().getWorldLocation().distanceTo(dG), llllIIIl[17])) {
                        Movement.walkTo((WorldPoint)dG);

                        Time.sleepTicks((int)llllIIIl[2]);

                    }
                    if (x.llIIIllllII(Players.getLocal().getWorldLocation().distanceTo(dG), llllIIIl[17])) {
                        x.p(llllIIIl[55]);
                        if (!x.llIIIllIllI(Widgets.get((int)llllIIIl[19]).isEmpty() ? 1 : 0) || x.llIIIlllIIl(Widgets.get((int)llllIIIl[19]))) {
                            x.bj();
                        }
                    }
                }
                if (x.llIIIllllIl(e.j(llllIIIl[14]), llllIIIl[56]) && x.llIIIllIlll(Skills.getLevel((Skill)Skill.HUNTER), llllIIIl[17])) {
                    AccBuilderBarrows.c = lllIllll[llllIIIl[57]];
                    if (x.llIIIlllIll(Players.getLocal().getWorldLocation().distanceTo(dB), llllIIIl[13])) {
                        AccBuilderBarrows.c = lllIllll[llllIIIl[58]];
                        Movement.walkTo((WorldPoint)dB);

                        Time.sleepTicks((int)llllIIIl[2]);

                    }
                    if (x.llIIIllllII(Players.getLocal().getWorldLocation().distanceTo(dB), llllIIIl[13])) {
                        AccBuilderBarrows.c = lllIllll[llllIIIl[59]];
                        g.a(lllIllll[llllIIIl[60]], fn);
                        Time.sleepTicks((int)llllIIIl[2]);

                    }
                }
            }
            System.out.println(e.j(llllIIIl[14]));
        }
    }

    @Override
    public int U() {
        try {
            x.bi();

        }
        catch (Exception exception) {
            // empty catch block
        }
        if (1 < ((132 + 76 - 112 + 48 ^ 155 + 69 - 197 + 163) & (49 + 137 - 160 + 153 ^ 121 + 113 - 128 + 51 ^ -1))) {
            return (42 + 57 - 23 + 54 ^ 26 + 55 - -38 + 33) & (0x15 ^ 0x40 ^ (0x4F ^ 0) ^ -1);
        }
        return llllIIIl[68];
    }

    private static boolean llIIIlllllI(Object object) {
        return object == null;
    }

    @Override
    public String V() {
        return lllIllll[llllIIIl[69]];
    }

    private static boolean llIIIlllIlI(int n2) {
        return n2 > 0;
    }

    private static void p(int n2) {
        if (!x.llIIIlllIII(Widgets.get((int)llllIIIl[19]).isEmpty() ? 1 : 0) || x.llIIIlllllI(Widgets.get((int)llllIIIl[19]))) {
            int lIIlllIllIllllI;
            int[] nArray = new int[llllIIIl[2]];
            nArray[x.llllIIIl[1]] = lIIlllIllIllllI;
            if (x.llIIIlllIIl(TileObjects.getNearest((int[])nArray))) {
                int[] nArray2 = new int[llllIIIl[2]];
                nArray2[x.llllIIIl[1]] = lIIlllIllIllllI;
                TileObjects.getNearest((int[])nArray2).interact(lllIllll[llllIIIl[64]]);
                Time.sleepTicks((int)llllIIIl[6]);

            }
        }
    }

        return String.valueOf(lIIlllIllIIlIll);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean ac() {
        int n2;
        if (x.llIIIlllIlI(Inventory.getCount((int[])f.bb))) {
            int[] nArray = new int[llllIIIl[2]];
            nArray[x.llllIIIl[1]] = llllIIIl[7];
            if (x.llIIIlllIlI(Inventory.getCount((int[])nArray))) {
                n2 = llllIIIl[2];

                if ((0x46 ^ 0x10 ^ (0xF3 ^ 0xA1)) != 2) return n2 != 0;
                return (1 & (1 ^ -1)) != 0;
            }
        }
        n2 = llllIIIl[1];
        return n2 != 0;
    }

    private static boolean llIIIlllIIl(Object object) {
        return object != null;
    }

    @Override
    public boolean T() {
        return llllIIIl[1];
    }

    private static boolean llIIIllllll(int n2, int n3) {
        return n2 >= n3;
    }

    private static void llIIIllIlII() {
        lllIllll = new String[llllIIIl[170]];
        x.lllIllll[x.llllIIIl[1]] = "Drink";
        x.lllIllll[x.llllIIIl[2]] = "Finished buying items, switching back to quest";
        x.lllIllll[x.llllIIIl[6]] = "We are missing quest supplies, switching to BUYING";
        x.lllIllll[x.llllIIIl[12]] = "Break";
        x.lllIllll[x.llllIIIl[5]] = "Nav to start";
        x.lllIllll[x.llllIIIl[10]] = "Orlando Smith";
        x.lllIllll[x.llllIIIl[16]] = "Solving terror bird";
        x.lllIllll[x.llllIIIl[21]] = "Solving kalphite";
        x.lllIllll[x.llllIIIl[13]] = "Solving Monkey";
        x.lllIllll[x.llllIIIl[17]] = "Solving sea slug";
        x.lllIllll[x.llllIIIl[9]] = "Solving snake";
        x.lllIllll[x.llllIIIl[30]] = "Solving east snail";
        x.lllIllll[x.llllIIIl[33]] = "Solving wyvern";
        x.lllIllll[x.llllIIIl[36]] = "Solving dragon";
        x.lllIllll[x.llllIIIl[39]] = "Solving tort";
        x.lllIllll[x.llllIIIl[42]] = "Solving croc";
        x.lllIllll[x.llllIIIl[45]] = "Solving leech";
        x.lllIllll[x.llllIIIl[48]] = "Solving camel";
        x.lllIllll[x.llllIIIl[51]] = "Solving mole";
        x.lllIllll[x.llllIIIl[54]] = "Solving leech";
        x.lllIllll[x.llllIIIl[57]] = "Handing in quest";
        x.lllIllll[x.llllIIIl[58]] = "Nav to start";
        x.lllIllll[x.llllIIIl[59]] = "Talking";
        x.lllIllll[x.llllIIIl[60]] = "Orlando Smith";
        x.lllIllll[x.llllIIIl[62]] = "null question";
        x.lllIllll[x.llllIIIl[63]] = "Found answer";
        x.lllIllll[x.llllIIIl[64]] = "Study";
        x.lllIllll[x.llllIIIl[69]] = "Varrock Quiz";
        x.lllIllll[x.llllIIIl[61]] = "ring of wealth (";
        x.lllIllll[x.llllIIIl[70]] = "During breeding";
        x.lllIllll[x.llllIIIl[71]] = "It is resistant to acid";
        x.lllIllll[x.llllIIIl[72]] = "Defence";
        x.lllIllll[x.llllIIIl[73]] = "An operculum";
        x.lllIllll[x.llllIIIl[74]] = "Subterranean";
        x.lllIllll[x.llllIIIl[75]] = "Worker";
        x.lllIllll[x.llllIIIl[76]] = "They have";
        x.lllIllll[x.llllIIIl[77]] = "The Talpidae family";
        x.lllIllll[x.llllIIIl[78]] = "Sight";
        x.lllIllll[x.llllIIIl[79]] = "They dig holes";
        x.lllIllll[x.llllIIIl[80]] = "Anti-dragon-breath shield";
        x.lllIllll[x.llllIIIl[11]] = "Asgarnia";
        x.lllIllll[x.llllIIIl[81]] = "They attack by jumping";
        x.lllIllll[x.llllIIIl[82]] = "'Y'-shaped";
        x.lllIllll[x.llllIIIl[83]] = "Bitternuts";
        x.lllIllll[x.llllIIIl[84]] = "Three";
        x.lllIllll[x.llllIIIl[85]] = "Water";
        x.lllIllll[x.llllIIIl[86]] = "Scabaras";
        x.lllIllll[x.llllIIIl[87]] = "It doubles in size";
        x.lllIllll[x.llllIIIl[88]] = "Toxic dung";
        x.lllIllll[x.llllIIIl[89]] = "Ardougne";
        x.lllIllll[x.llllIIIl[0]] = "Stones";
        x.lllIllll[x.llllIIIl[90]] = "Red";
        x.lllIllll[x.llllIIIl[91]] = "Insects and other invertebrates";
        x.lllIllll[x.llllIIIl[92]] = "It becomes sleepy";
        x.lllIllll[x.llllIIIl[93]] = "Elemental";
        x.lllIllll[x.llllIIIl[94]] = "Unknown";
        x.lllIllll[x.llllIIIl[95]] = "Twenty years";
        x.lllIllll[x.llllIIIl[96]] = "Hair";
        x.lllIllll[x.llllIIIl[97]] = "Stomach acid";
        x.lllIllll[x.llllIIIl[98]] = "0";
        x.lllIllll[x.llllIIIl[99]] = "Environment";
        x.lllIllll[x.llllIIIl[100]] = "Nematocysts";
        x.lllIllll[x.llllIIIl[101]] = "Four";
        x.lllIllll[x.llllIIIl[102]] = "Carnivores";
        x.lllIllll[x.llllIIIl[103]] = "Milk";
        x.lllIllll[x.llllIIIl[104]] = "Twelve";
        x.lllIllll[x.llllIIIl[105]] = "A labour";
        x.lllIllll[x.llllIIIl[106]] = "A layer of fat";
        x.lllIllll[x.llllIIIl[107]] = "Wyson the Gardener";
        x.lllIllll[x.llllIIIl[108]] = "Below room temperature";
        x.lllIllll[x.llllIIIl[109]] = "Gnomes";
        x.lllIllll[x.llllIIIl[110]] = "Scarab beetles";
        x.lllIllll[x.llllIIIl[111]] = "Acid-spitting snail";
        x.lllIllll[x.llllIIIl[112]] = "Mibbiwocket";
        x.lllIllll[x.llllIIIl[113]] = "Squamata";
        x.lllIllll[x.llllIIIl[114]] = "Reptiles";
        x.lllIllll[x.llllIIIl[115]] = "Gnomes";
        x.lllIllll[x.llllIIIl[116]] = "Fireproof oil";
        x.lllIllll[x.llllIIIl[117]] = "Spitting acid";
        x.lllIllll[x.llllIIIl[118]] = "Orlando Smith";
        x.lllIllll[x.llllIIIl[119]] = "Two";
        x.lllIllll[x.llllIIIl[120]] = "Climate change";
        x.lllIllll[x.llllIIIl[121]] = "Vegetables";
        x.lllIllll[x.llllIIIl[122]] = "Simian";
        x.lllIllll[x.llllIIIl[123]] = "Runite";
        x.lllIllll[x.llllIIIl[124]] = "Squamata";
        x.lllIllll[x.llllIIIl[125]] = "Pasha";
        x.lllIllll[x.llllIIIl[126]] = "Two";
        x.lllIllll[x.llllIIIl[127]] = "Social";
        x.lllIllll[x.llllIIIl[128]] = "Anywhere";
        x.lllIllll[x.llllIIIl[129]] = "Lamellae";
        x.lllIllll[x.llllIIIl[130]] = "Apples";
        x.lllIllll[x.llllIIIl[131]] = "Dragons";
        x.lllIllll[x.llllIIIl[132]] = "Anything";
        x.lllIllll[x.llllIIIl[133]] = "Sunlight";
        x.lllIllll[x.llllIIIl[134]] = "Harmless";
        x.lllIllll[x.llllIIIl[135]] = "Planning";
        x.lllIllll[x.llllIIIl[136]] = "Cold";
        x.lllIllll[x.llllIIIl[137]] = "The researchers";
        x.lllIllll[x.llllIIIl[138]] = "Seaweed";
        x.lllIllll[x.llllIIIl[68]] = "Annoyed";
        x.lllIllll[x.llllIIIl[139]] = "Seaweed";
        x.lllIllll[x.llllIIIl[140]] = "Contracting and stretching";
        x.lllIllll[x.llllIIIl[141]] = "Tongue";
        x.lllIllll[x.llllIIIl[142]] = "Hard shell";
        x.lllIllll[x.llllIIIl[143]] = "Seeing how you smell";
        x.lllIllll[x.llllIIIl[144]] = "Constriction";
        x.lllIllll[x.llllIIIl[145]] = "The Slayer Masters";
        x.lllIllll[x.llllIIIl[146]] = "Eating plants";
        x.lllIllll[x.llllIIIl[147]] = "Al Kharid";
        x.lllIllll[x.llllIIIl[148]] = "Old battle sites";
        x.lllIllll[x.llllIIIl[149]] = "Admiral Bake";
        x.lllIllll[x.llllIIIl[150]] = "Omnivore";
        x.lllIllll[x.llllIIIl[165]] = "Sure thing.";
    }

    @Override
    public boolean W() {
        int n2;
        if (x.llIIIllllll(e.j(llllIIIl[14]), llllIIIl[56]) && x.llIIIllllll(Skills.getLevel((Skill)Skill.HUNTER), llllIIIl[17])) {
            n2 = llllIIIl[2];

            }
        } else {
            n2 = llllIIIl[1];
        }
        return n2 != 0;
    }

    private static void ag() {
        d lIIlllIllIllIlI;
        Predicate<Item> lIIlllIllIllIll;
        int[] nArray = new int[llllIIIl[2]];
        nArray[x.llllIIIl[1]] = llllIIIl[8];
        if (x.llIIIlllIII(Bank.contains((int[])nArray) ? 1 : 0)) {
            d d2 = new DHelper(llllIIIl[8], llllIIIl[10], i.bw);
            bB.add(d2);

        }
        if (x.llIIIlllIII(Bank.contains(lIIlllIllIllIll = item -> item.getName().toLowerCase().contains(lllIllll[llllIIIl[61]])) ? 1 : 0)) {
            lIIlllIllIllIlI = new DHelper(llllIIIl[65], llllIIIl[10], llllIIIl[66]);
            bB.add(lIIlllIllIllIlI);

        }
        int[] nArray2 = new int[llllIIIl[2]];
        nArray2[x.llllIIIl[1]] = llllIIIl[7];
        if (x.llIIIlllIII(Bank.contains((int[])nArray2) ? 1 : 0)) {
            lIIlllIllIllIlI = new DHelper(llllIIIl[7], llllIIIl[11], llllIIIl[67]);
            bB.add(lIIlllIllIllIlI);

        }
    }

    private static boolean llIIIllIlll(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean llIIIlllIll(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean llIIIllllII(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean llIIIlllIII(int n2) {
        return n2 == 0;
    }

    private static boolean llIIIllIllI(int n2) {
        return n2 != 0;
    }

    static {
        x.llIIIllIlIl();
        x.llIIIllIlII();
        eU = lllIllll[llllIIIl[70]];
        dZ = lllIllll[llllIIIl[71]];
        dQ = lllIllll[llllIIIl[72]];
        ee = lllIllll[llllIIIl[73]];
        dp = llllIIIl[26];
        eV = lllIllll[llllIIIl[74]];
        dk = llllIIIl[6];
        do = llllIIIl[24];
        eE = lllIllll[llllIIIl[75]];
        dS = lllIllll[llllIIIl[76]];
        fa = lllIllll[llllIIIl[77]];
        eP = lllIllll[llllIIIl[78]];
        dy = llllIIIl[52];
        eW = lllIllll[llllIIIl[79]];
        em = lllIllll[llllIIIl[80]];
        eh = lllIllll[llllIIIl[11]];
        fl = lllIllll[llllIIIl[81]];
        dt = llllIIIl[37];
        fi = lllIllll[llllIIIl[82]];
        dK = lllIllll[llllIIIl[83]];
        ez = lllIllll[llllIIIl[84]];
        fh = lllIllll[llllIIIl[85]];
        eI = lllIllll[llllIIIl[86]];
        fm = lllIllll[llllIIIl[87]];
        dn = llllIIIl[22];
        fb = lllIllll[llllIIIl[88]];
        dR = lllIllll[llllIIIl[89]];
        eN = lllIllll[llllIIIl[0]];
        dL = lllIllll[llllIIIl[90]];
        dq = llllIIIl[28];
        dl = llllIIIl[19];
        eZ = lllIllll[llllIIIl[91]];
        dv = llllIIIl[43];
        eB = lllIllll[llllIIIl[92]];
        eo = lllIllll[llllIIIl[93]];
        en = lllIllll[llllIIIl[94]];
        ev = lllIllll[llllIIIl[95]];
        eC = lllIllll[llllIIIl[96]];
        du = llllIIIl[40];
        dT = lllIllll[llllIIIl[97]];
        eO = lllIllll[llllIIIl[98]];
        fk = lllIllll[llllIIIl[99]];
        dm = llllIIIl[18];
        dN = lllIllll[llllIIIl[100]];
        eM = lllIllll[llllIIIl[101]];
        eG = lllIllll[llllIIIl[102]];
        fg = lllIllll[llllIIIl[103]];
        eq = lllIllll[llllIIIl[104]];
        eY = lllIllll[llllIIIl[105]];
        dj = llllIIIl[3];
        eR = lllIllll[llllIIIl[106]];
        eX = lllIllll[llllIIIl[107]];
        ek = lllIllll[llllIIIl[108]];
        ew = lllIllll[llllIIIl[109]];
        eH = lllIllll[llllIIIl[110]];
        ec = lllIllll[llllIIIl[111]];
        er = lllIllll[llllIIIl[112]];
        dX = lllIllll[llllIIIl[113]];
        ei = lllIllll[llllIIIl[114]];
        eK = lllIllll[llllIIIl[115]];
        eb = lllIllll[llllIIIl[116]];
        ea = lllIllll[llllIIIl[117]];
        dH = lllIllll[llllIIIl[118]];
        fc = lllIllll[llllIIIl[119]];
        ef = lllIllll[llllIIIl[120]];
        es = lllIllll[llllIIIl[121]];
        dI = lllIllll[llllIIIl[122]];
        el = lllIllll[llllIIIl[123]];
        eA = lllIllll[llllIIIl[124]];
        dr = llllIIIl[31];
        eD = lllIllll[llllIIIl[125]];
        eg = lllIllll[llllIIIl[126]];
        eT = lllIllll[llllIIIl[127]];
        dY = lllIllll[llllIIIl[128]];
        dw = llllIIIl[46];
        eF = lllIllll[llllIIIl[129]];
        fj = lllIllll[llllIIIl[130]];
        ej = lllIllll[llllIIIl[131]];
        eJ = lllIllll[llllIIIl[132]];
        ex = lllIllll[llllIIIl[133]];
        dJ = lllIllll[llllIIIl[134]];
        eQ = lllIllll[llllIIIl[135]];
        eS = lllIllll[llllIIIl[136]];
        dO = lllIllll[llllIIIl[137]];
        dP = lllIllll[llllIIIl[138]];
        fe = lllIllll[llllIIIl[68]];
        dM = lllIllll[llllIIIl[139]];
        ed = lllIllll[llllIIIl[140]];
        dU = lllIllll[llllIIIl[141]];
        eu = lllIllll[llllIIIl[142]];
        dz = llllIIIl[55];
        dV = lllIllll[llllIIIl[143]];
        dW = lllIllll[llllIIIl[144]];
        ey = lllIllll[llllIIIl[145]];
        eL = lllIllll[llllIIIl[146]];
        ff = lllIllll[llllIIIl[147]];
        ep = lllIllll[llllIIIl[148]];
        et = lllIllll[llllIIIl[149]];
        fd = lllIllll[llllIIIl[150]];
        dx = llllIIIl[49];
        ds = llllIIIl[34];
        dA = new WorldPoint(llllIIIl[151], llllIIIl[152], llllIIIl[1]);
        dB = new WorldPoint(llllIIIl[153], llllIIIl[154], llllIIIl[1]);
        dC = new WorldPoint(llllIIIl[155], llllIIIl[156], llllIIIl[1]);
        dD = new WorldPoint(llllIIIl[157], llllIIIl[158], llllIIIl[1]);
        dE = new WorldPoint(llllIIIl[159], llllIIIl[160], llllIIIl[1]);
        dF = new WorldPoint(llllIIIl[161], llllIIIl[162], llllIIIl[1]);
        dG = new WorldPoint(llllIIIl[163], llllIIIl[164], llllIIIl[1]);
        bB = new ArrayList<d>();
        String[] stringArray = new String[llllIIIl[2]];
        stringArray[x.llllIIIl[1]] = lllIllll[llllIIIl[165]];
        fn = stringArray;
        bY = new WorldArea(llllIIIl[166], llllIIIl[167], llllIIIl[168], llllIIIl[169], llllIIIl[1]);
    }

    private static boolean llIIIllllIl(int n2, int n3) {
        return n2 == n3;
    }
}

