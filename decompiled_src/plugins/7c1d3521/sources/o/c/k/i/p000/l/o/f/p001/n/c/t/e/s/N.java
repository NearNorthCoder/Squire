package o.c.k.i.p000.l.o.f.p001.n.c.t.e.s;

import gg.squire.account.AccBuilderSotf;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
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
/* renamed from: o.c.k.i.-.l.o.f.-.n.c.t.e.s.N  reason: invalid package */
/* loaded from: 7c1d3521-d222-494e-8c51-697efca0674b.jar:o/c/k/i/-/l/o/f/-/n/c/t/e/s/N.class */
public class N implements InterfaceC0003ac {
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

    /* renamed from: if  reason: not valid java name */
    public static final /* synthetic */ String f0if;
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
    public static /* synthetic */ List<C0017d> bv;
    public static final /* synthetic */ String iV;
    public static final /* synthetic */ String iz;
    public static final /* synthetic */ String jb;
    public static final /* synthetic */ String iR;
    public static final /* synthetic */ String iM;

    private static boolean lIlIIIlIIlllI(Object obj) {
        return obj != null;
    }

    private static boolean lIlIIIlIlIlII(int i, int i2) {
        return i >= i2;
    }

    private static void q(int i) {
        if (!lIlIIIlIIllIl(Widgets.get(llIIIIIIlI[19]).isEmpty() ? 1 : 0) || lIlIIIlIlIIll(Widgets.get(llIIIIIIlI[19]))) {
            int[] iArr = new int[llIIIIIIlI[2]];
            iArr[llIIIIIIlI[1]] = i;
            if (lIlIIIlIIlllI(TileObjects.getNearest(iArr))) {
                int[] iArr2 = new int[llIIIIIIlI[2]];
                iArr2[llIIIIIIlI[1]] = i;
                TileObjects.getNearest(iArr2).interact(llIIIIIIIl[llIIIIIIlI[64]]);
                Time.sleepTicks(llIIIIIIlI[6]);
                "".length();
            }
        }
    }

    private static boolean lIlIIIlIIlIll(int i) {
        return i != 0;
    }

    private static boolean lIlIIIlIlIIIl(int i, int i2) {
        return i <= i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public boolean ae() {
        return llIIIIIIlI[1];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v546, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v566, types: [boolean] */
    public static void cY() {
        if (lIlIIIlIIlIll(Inventory.contains(C0019f.ba) ? 1 : 0) && lIlIIIlIIllII(Movement.getRunEnergy(), llIIIIIIlI[0])) {
            Inventory.getFirst(C0019f.ba).interact(llIIIIIIIl[llIIIIIIlI[1]]);
            Time.sleepTicks(llIIIIIIlI[2]);
            "".length();
        }
        if (lIlIIIlIIllIl(Movement.isRunEnabled() ? 1 : 0)) {
            Movement.toggleRun();
        }
        if (lIlIIIlIIlIll(bt ? 1 : 0)) {
            C0015b.a(bv);
            if (lIlIIIlIIllII(bv.size(), llIIIIIIlI[2])) {
                System.out.println(llIIIIIIIl[llIIIIIIlI[2]]);
                bt = llIIIIIIlI[1];
            }
        }
        if (lIlIIIlIIllIl(bt ? 1 : 0)) {
            if (lIlIIIlIIllIl(an() ? 1 : 0) && lIlIIIlIIllII(C0018e.j(llIIIIIIlI[3]), llIIIIIIlI[2])) {
                BankLocation nearest = BankLocation.getNearest();
                if (lIlIIIlIIlllI(nearest) && lIlIIIlIIllIl(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    C0000a.a(nearest);
                }
                if (lIlIIIlIIlllI(nearest) && lIlIIIlIIlIll(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (lIlIIIlIIllIl(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, llIIIIIIlI[4]);
                        "".length();
                    }
                    if (lIlIIIlIIlIll(Bank.isOpen() ? 1 : 0)) {
                        if (lIlIIIlIIllll(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(llIIIIIIlI[5]);
                            "".length();
                        }
                        if (lIlIIIlIIllll(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks(llIIIIIIlI[6]);
                            "".length();
                        }
                        int[] iArr = new int[llIIIIIIlI[6]];
                        iArr[llIIIIIIlI[1]] = llIIIIIIlI[7];
                        iArr[llIIIIIIlI[2]] = llIIIIIIlI[8];
                        if (lIlIIIlIIllIl(C0018e.c(iArr) ? 1 : 0)) {
                            Q();
                            System.out.println(llIIIIIIIl[llIIIIIIlI[6]]);
                            bt = llIIIIIIlI[2];
                            return;
                        }
                        int[] iArr2 = new int[llIIIIIIlI[6]];
                        iArr2[llIIIIIIlI[1]] = llIIIIIIlI[7];
                        iArr2[llIIIIIIlI[2]] = llIIIIIIlI[8];
                        if (lIlIIIlIIlIll(C0018e.c(iArr2) ? 1 : 0)) {
                            C0000a.a(llIIIIIIlI[7], llIIIIIIlI[9]);
                            C0000a.b(C0019f.ba, llIIIIIIlI[10]);
                        }
                    }
                }
            }
            if (lIlIIIlIIlIll(an() ? 1 : 0) && lIlIIIlIIllIl(C0018e.j(llIIIIIIlI[3]))) {
                if (lIlIIIlIlIIII(Players.getLocal().getWorldLocation().distanceTo(hs), llIIIIIIlI[11])) {
                    if (lIlIIIlIIlIll(cF.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        int[] iArr3 = new int[llIIIIIIlI[2]];
                        iArr3[llIIIIIIlI[1]] = llIIIIIIlI[7];
                        if (lIlIIIlIIlIll(Inventory.contains(iArr3) ? 1 : 0)) {
                            int[] iArr4 = new int[llIIIIIIlI[2]];
                            iArr4[llIIIIIIlI[1]] = llIIIIIIlI[7];
                            Inventory.getFirst(iArr4).interact(llIIIIIIIl[llIIIIIIlI[12]]);
                            Time.sleepTicks(llIIIIIIlI[13]);
                            "".length();
                        }
                    }
                    AccBuilderSotf.c = llIIIIIIIl[llIIIIIIlI[5]];
                    Movement.walkTo(hs);
                    "".length();
                    Time.sleepTicks(llIIIIIIlI[2]);
                    "".length();
                }
                if (lIlIIIlIlIIIl(Players.getLocal().getWorldLocation().distanceTo(hs), llIIIIIIlI[13])) {
                    C0020g.a(llIIIIIIIl[llIIIIIIlI[10]], je);
                    Time.sleepTicks(llIIIIIIlI[2]);
                    "".length();
                }
            }
            if (lIlIIIlIIllll(C0018e.j(llIIIIIIlI[3]))) {
                if (lIlIIIlIlIIlI(C0018e.j(llIIIIIIlI[14]), llIIIIIIlI[15])) {
                    AccBuilderSotf.c = llIIIIIIIl[llIIIIIIlI[16]];
                    if (lIlIIIlIlIIII(Players.getLocal().getWorldLocation().distanceTo(ht), llIIIIIIlI[17])) {
                        Movement.walkTo(ht);
                        "".length();
                        Time.sleepTicks(llIIIIIIlI[2]);
                        "".length();
                    }
                    if (lIlIIIlIlIIIl(Players.getLocal().getWorldLocation().distanceTo(ht), llIIIIIIlI[17])) {
                        q(llIIIIIIlI[18]);
                        if (!lIlIIIlIIlIll(Widgets.get(llIIIIIIlI[19]).isEmpty() ? 1 : 0) || lIlIIIlIIlllI(Widgets.get(llIIIIIIlI[19]))) {
                            cZ();
                        }
                    }
                }
                if (lIlIIIlIlIIlI(C0018e.j(llIIIIIIlI[14]), llIIIIIIlI[20])) {
                    AccBuilderSotf.c = llIIIIIIIl[llIIIIIIlI[21]];
                    if (lIlIIIlIlIIII(Players.getLocal().getWorldLocation().distanceTo(ht), llIIIIIIlI[17])) {
                        Movement.walkTo(ht);
                        "".length();
                        Time.sleepTicks(llIIIIIIlI[2]);
                        "".length();
                    }
                    if (lIlIIIlIlIIIl(Players.getLocal().getWorldLocation().distanceTo(ht), llIIIIIIlI[17])) {
                        q(llIIIIIIlI[22]);
                        if (!lIlIIIlIIlIll(Widgets.get(llIIIIIIlI[19]).isEmpty() ? 1 : 0) || lIlIIIlIIlllI(Widgets.get(llIIIIIIlI[19]))) {
                            cZ();
                        }
                    }
                }
                if (lIlIIIlIlIIlI(C0018e.j(llIIIIIIlI[14]), llIIIIIIlI[23])) {
                    AccBuilderSotf.c = llIIIIIIIl[llIIIIIIlI[13]];
                    if (lIlIIIlIlIIII(Players.getLocal().getWorldLocation().distanceTo(hu), llIIIIIIlI[17])) {
                        Movement.walkTo(hu);
                        "".length();
                        Time.sleepTicks(llIIIIIIlI[2]);
                        "".length();
                    }
                    if (lIlIIIlIlIIIl(Players.getLocal().getWorldLocation().distanceTo(hu), llIIIIIIlI[17])) {
                        q(llIIIIIIlI[24]);
                        if (!lIlIIIlIIlIll(Widgets.get(llIIIIIIlI[19]).isEmpty() ? 1 : 0) || lIlIIIlIIlllI(Widgets.get(llIIIIIIlI[19]))) {
                            cZ();
                        }
                    }
                }
                if (lIlIIIlIlIIlI(C0018e.j(llIIIIIIlI[14]), llIIIIIIlI[25])) {
                    AccBuilderSotf.c = llIIIIIIIl[llIIIIIIlI[17]];
                    if (lIlIIIlIlIIII(Players.getLocal().getWorldLocation().distanceTo(hu), llIIIIIIlI[17])) {
                        Movement.walkTo(hu);
                        "".length();
                        Time.sleepTicks(llIIIIIIlI[2]);
                        "".length();
                    }
                    if (lIlIIIlIlIIIl(Players.getLocal().getWorldLocation().distanceTo(hu), llIIIIIIlI[17])) {
                        q(llIIIIIIlI[26]);
                        if (!lIlIIIlIIlIll(Widgets.get(llIIIIIIlI[19]).isEmpty() ? 1 : 0) || lIlIIIlIIlllI(Widgets.get(llIIIIIIlI[19]))) {
                            cZ();
                        }
                    }
                }
                if (lIlIIIlIlIIlI(C0018e.j(llIIIIIIlI[14]), llIIIIIIlI[27])) {
                    AccBuilderSotf.c = llIIIIIIIl[llIIIIIIlI[9]];
                    if (lIlIIIlIlIIII(Players.getLocal().getWorldLocation().distanceTo(hu), llIIIIIIlI[17])) {
                        Movement.walkTo(hu);
                        "".length();
                        Time.sleepTicks(llIIIIIIlI[2]);
                        "".length();
                    }
                    if (lIlIIIlIlIIIl(Players.getLocal().getWorldLocation().distanceTo(hu), llIIIIIIlI[17])) {
                        q(llIIIIIIlI[28]);
                        if (!lIlIIIlIIlIll(Widgets.get(llIIIIIIlI[19]).isEmpty() ? 1 : 0) || lIlIIIlIIlllI(Widgets.get(llIIIIIIlI[19]))) {
                            cZ();
                        }
                    }
                }
                if (lIlIIIlIlIIlI(C0018e.j(llIIIIIIlI[14]), llIIIIIIlI[29])) {
                    AccBuilderSotf.c = llIIIIIIIl[llIIIIIIlI[30]];
                    if (lIlIIIlIlIIII(Players.getLocal().getWorldLocation().distanceTo(hu), llIIIIIIlI[17])) {
                        Movement.walkTo(hu);
                        "".length();
                        Time.sleepTicks(llIIIIIIlI[2]);
                        "".length();
                    }
                    if (lIlIIIlIlIIIl(Players.getLocal().getWorldLocation().distanceTo(hu), llIIIIIIlI[17])) {
                        q(llIIIIIIlI[31]);
                        if (!lIlIIIlIIlIll(Widgets.get(llIIIIIIlI[19]).isEmpty() ? 1 : 0) || lIlIIIlIIlllI(Widgets.get(llIIIIIIlI[19]))) {
                            cZ();
                        }
                    }
                }
                if (lIlIIIlIlIIlI(C0018e.j(llIIIIIIlI[14]), llIIIIIIlI[32])) {
                    AccBuilderSotf.c = llIIIIIIIl[llIIIIIIlI[33]];
                    if (lIlIIIlIlIIII(Players.getLocal().getWorldLocation().distanceTo(hv), llIIIIIIlI[17])) {
                        Movement.walkTo(hv);
                        "".length();
                        Time.sleepTicks(llIIIIIIlI[2]);
                        "".length();
                    }
                    if (lIlIIIlIlIIIl(Players.getLocal().getWorldLocation().distanceTo(hv), llIIIIIIlI[17])) {
                        q(llIIIIIIlI[34]);
                        if (!lIlIIIlIIlIll(Widgets.get(llIIIIIIlI[19]).isEmpty() ? 1 : 0) || lIlIIIlIIlllI(Widgets.get(llIIIIIIlI[19]))) {
                            cZ();
                        }
                    }
                }
                if (lIlIIIlIlIIlI(C0018e.j(llIIIIIIlI[14]), llIIIIIIlI[35])) {
                    AccBuilderSotf.c = llIIIIIIIl[llIIIIIIlI[36]];
                    if (lIlIIIlIlIIII(Players.getLocal().getWorldLocation().distanceTo(hv), llIIIIIIlI[17])) {
                        Movement.walkTo(hv);
                        "".length();
                        Time.sleepTicks(llIIIIIIlI[2]);
                        "".length();
                    }
                    if (lIlIIIlIlIIIl(Players.getLocal().getWorldLocation().distanceTo(hv), llIIIIIIlI[17])) {
                        q(llIIIIIIlI[37]);
                        if (!lIlIIIlIIlIll(Widgets.get(llIIIIIIlI[19]).isEmpty() ? 1 : 0) || lIlIIIlIIlllI(Widgets.get(llIIIIIIlI[19]))) {
                            cZ();
                        }
                    }
                }
                if (lIlIIIlIlIIlI(C0018e.j(llIIIIIIlI[14]), llIIIIIIlI[38])) {
                    AccBuilderSotf.c = llIIIIIIIl[llIIIIIIlI[39]];
                    if (lIlIIIlIlIIII(Players.getLocal().getWorldLocation().distanceTo(hw), llIIIIIIlI[17])) {
                        Movement.walkTo(hw);
                        "".length();
                        Time.sleepTicks(llIIIIIIlI[2]);
                        "".length();
                    }
                    if (lIlIIIlIlIIIl(Players.getLocal().getWorldLocation().distanceTo(hw), llIIIIIIlI[17])) {
                        q(llIIIIIIlI[40]);
                        if (!lIlIIIlIIlIll(Widgets.get(llIIIIIIlI[19]).isEmpty() ? 1 : 0) || lIlIIIlIIlllI(Widgets.get(llIIIIIIlI[19]))) {
                            cZ();
                        }
                    }
                }
                if (lIlIIIlIlIIlI(C0018e.j(llIIIIIIlI[14]), llIIIIIIlI[41])) {
                    AccBuilderSotf.c = llIIIIIIIl[llIIIIIIlI[42]];
                    if (lIlIIIlIlIIII(Players.getLocal().getWorldLocation().distanceTo(hw), llIIIIIIlI[17])) {
                        Movement.walkTo(hw);
                        "".length();
                        Time.sleepTicks(llIIIIIIlI[2]);
                        "".length();
                    }
                    if (lIlIIIlIlIIIl(Players.getLocal().getWorldLocation().distanceTo(hw), llIIIIIIlI[17])) {
                        q(llIIIIIIlI[43]);
                        if (!lIlIIIlIIlIll(Widgets.get(llIIIIIIlI[19]).isEmpty() ? 1 : 0) || lIlIIIlIIlllI(Widgets.get(llIIIIIIlI[19]))) {
                            cZ();
                        }
                    }
                }
                if (lIlIIIlIlIIlI(C0018e.j(llIIIIIIlI[14]), llIIIIIIlI[44])) {
                    AccBuilderSotf.c = llIIIIIIIl[llIIIIIIlI[45]];
                    if (lIlIIIlIlIIII(Players.getLocal().getWorldLocation().distanceTo(hx), llIIIIIIlI[17])) {
                        Movement.walkTo(hx);
                        "".length();
                        Time.sleepTicks(llIIIIIIlI[2]);
                        "".length();
                    }
                    if (lIlIIIlIlIIIl(Players.getLocal().getWorldLocation().distanceTo(hx), llIIIIIIlI[17])) {
                        q(llIIIIIIlI[46]);
                        if (!lIlIIIlIIlIll(Widgets.get(llIIIIIIlI[19]).isEmpty() ? 1 : 0) || lIlIIIlIIlllI(Widgets.get(llIIIIIIlI[19]))) {
                            cZ();
                        }
                    }
                }
                if (lIlIIIlIlIIlI(C0018e.j(llIIIIIIlI[14]), llIIIIIIlI[47])) {
                    AccBuilderSotf.c = llIIIIIIIl[llIIIIIIlI[48]];
                    if (lIlIIIlIlIIII(Players.getLocal().getWorldLocation().distanceTo(hx), llIIIIIIlI[17])) {
                        Movement.walkTo(hx);
                        "".length();
                        Time.sleepTicks(llIIIIIIlI[2]);
                        "".length();
                    }
                    if (lIlIIIlIlIIIl(Players.getLocal().getWorldLocation().distanceTo(hx), llIIIIIIlI[17])) {
                        q(llIIIIIIlI[49]);
                        if (!lIlIIIlIIlIll(Widgets.get(llIIIIIIlI[19]).isEmpty() ? 1 : 0) || lIlIIIlIIlllI(Widgets.get(llIIIIIIlI[19]))) {
                            cZ();
                        }
                    }
                }
                if (lIlIIIlIlIIlI(C0018e.j(llIIIIIIlI[14]), llIIIIIIlI[50])) {
                    AccBuilderSotf.c = llIIIIIIIl[llIIIIIIlI[51]];
                    if (lIlIIIlIlIIII(Players.getLocal().getWorldLocation().distanceTo(hx), llIIIIIIlI[17])) {
                        Movement.walkTo(hx);
                        "".length();
                        Time.sleepTicks(llIIIIIIlI[2]);
                        "".length();
                    }
                    if (lIlIIIlIlIIIl(Players.getLocal().getWorldLocation().distanceTo(hx), llIIIIIIlI[17])) {
                        q(llIIIIIIlI[52]);
                        if (!lIlIIIlIIlIll(Widgets.get(llIIIIIIlI[19]).isEmpty() ? 1 : 0) || lIlIIIlIIlllI(Widgets.get(llIIIIIIlI[19]))) {
                            cZ();
                        }
                    }
                }
                if (lIlIIIlIlIIlI(C0018e.j(llIIIIIIlI[14]), llIIIIIIlI[53])) {
                    AccBuilderSotf.c = llIIIIIIIl[llIIIIIIlI[54]];
                    if (lIlIIIlIlIIII(Players.getLocal().getWorldLocation().distanceTo(hx), llIIIIIIlI[17])) {
                        Movement.walkTo(hx);
                        "".length();
                        Time.sleepTicks(llIIIIIIlI[2]);
                        "".length();
                    }
                    if (lIlIIIlIlIIIl(Players.getLocal().getWorldLocation().distanceTo(hx), llIIIIIIlI[17])) {
                        q(llIIIIIIlI[55]);
                        if (!lIlIIIlIIlIll(Widgets.get(llIIIIIIlI[19]).isEmpty() ? 1 : 0) || lIlIIIlIIlllI(Widgets.get(llIIIIIIlI[19]))) {
                            cZ();
                        }
                    }
                }
                if (lIlIIIlIlIIlI(C0018e.j(llIIIIIIlI[14]), llIIIIIIlI[56]) && lIlIIIlIIllII(Skills.getLevel(Skill.HUNTER), llIIIIIIlI[17])) {
                    AccBuilderSotf.c = llIIIIIIIl[llIIIIIIlI[57]];
                    if (lIlIIIlIlIIII(Players.getLocal().getWorldLocation().distanceTo(hs), llIIIIIIlI[13])) {
                        AccBuilderSotf.c = llIIIIIIIl[llIIIIIIlI[58]];
                        Movement.walkTo(hs);
                        "".length();
                        Time.sleepTicks(llIIIIIIlI[2]);
                        "".length();
                    }
                    if (lIlIIIlIlIIIl(Players.getLocal().getWorldLocation().distanceTo(hs), llIIIIIIlI[13])) {
                        AccBuilderSotf.c = llIIIIIIIl[llIIIIIIlI[59]];
                        C0020g.a(llIIIIIIIl[llIIIIIIlI[60]], je);
                        Time.sleepTicks(llIIIIIIlI[2]);
                        "".length();
                    }
                }
            }
            System.out.println(C0018e.j(llIIIIIIlI[14]));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public boolean ah() {
        if (lIlIIIlIlIlII(C0018e.j(llIIIIIIlI[14]), llIIIIIIlI[56]) && lIlIIIlIlIlII(Skills.getLevel(Skill.HUNTER), llIIIIIIlI[17])) {
            ?? r0 = llIIIIIIlI[2];
            "".length();
            return ((156 ^ 197) & ((82 ^ 11) ^ (-1))) >= " ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return llIIIIIIlI[1];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    private static boolean an() {
        if (lIlIIIlIIllll(Inventory.getCount(C0019f.ba))) {
            int[] iArr = new int[llIIIIIIlI[2]];
            iArr[llIIIIIIlI[1]] = llIIIIIIlI[7];
            if (lIlIIIlIIllll(Inventory.getCount(iArr))) {
                ?? r0 = llIIIIIIlI[2];
                "".length();
                return ((true ^ true) & ((true ^ true) ^ true)) != ((true ^ true) & ((true ^ true) ^ true)) ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
        }
        return llIIIIIIlI[1];
    }

    private static String lIlIIIlIIlIII(String llllllllllllllllllIllIllIIlllIIl, String llllllllllllllllllIllIllIIlllIII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllllIllIllIIlllIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllllIllIllIIlllIll = Cipher.getInstance("Blowfish");
            llllllllllllllllllIllIllIIlllIll.init(llIIIIIIlI[6], secretKeySpec);
            return new String(llllllllllllllllllIllIllIIlllIll.doFinal(Base64.getDecoder().decode(llllllllllllllllllIllIllIIlllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllllIllIllIIlllIlI) {
            llllllllllllllllllIllIllIIlllIlI.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIIIlIlIIlI(int i, int i2) {
        return i == i2;
    }

    private static void lIlIIIlIIlIIl() {
        llIIIIIIIl = new String[llIIIIIIlI[170]];
        llIIIIIIIl[llIIIIIIlI[1]] = lIlIIIlIIIllI("LLdBL5s4wIE=", "rrNuh");
        llIIIIIIIl[llIIIIIIlI[2]] = lIlIIIlIIIlll("PAQ9JAkSCDdtGA8UOiMdWgQnKBcJQXM+DRMZMCUTFApzLxsZBnM5FVocJigJDg==", "zmSMz");
        llIIIIIIIl[llIIIIIIlI[6]] = lIlIIIlIIlIII("aUcbUbHGaXFlSe67gQzTbQBLDSDsIGJSRgRIcS4ZrSl1EE28S6/eu45oqMoCsJZqKg/JJTml4wo=", "uLZyv");
        llIIIIIIIl[llIIIIIIlI[12]] = lIlIIIlIIIlll("EjsNEik=", "PIhsB");
        llIIIIIIIl[llIIIIIIlI[5]] = lIlIIIlIIIlll("KC06dzcJbD8jIhQ4", "fLLWC");
        llIIIIIIIl[llIIIIIIlI[10]] = lIlIIIlIIIllI("17VOQdrhvMG3S9hFJJVFuw==", "YXDrz");
        llIIIIIIIl[llIIIIIIlI[16]] = lIlIIIlIIIllI("6GvSeFd6upFn6wx2Ce+dusK98cVBxoBw", "NdGVd");
        llIIIIIIIl[llIIIIIIlI[21]] = lIlIIIlIIIllI("H5e6g0eoBUE7ZFM15wZC89TGU6I5P4kU", "xXBzs");
        llIIIIIIIl[llIIIIIIlI[13]] = lIlIIIlIIIlll("Ah0BPQc/FU0GAT8ZCDI=", "QrmKn");
        llIIIIIIIl[llIIIIIIlI[17]] = lIlIIIlIIIllI("HZscdG511Bs+OZKSQtAJ3KgG3knUSkIl", "vQenN");
        llIIIIIIIl[llIIIIIIlI[9]] = lIlIIIlIIIllI("2iXVqR4SGmsO8PF+Ppvgvg==", "rbAIb");
        llIIIIIIIl[llIIIIIIlI[30]] = lIlIIIlIIIllI("a+M9Saqg7DSh8fLFmjbja2l5KxW08l9Q", "neIzM");
        llIIIIIIIl[llIIIIIIlI[33]] = lIlIIIlIIlIII("gJEOZwy9WGr6hNhJnF+uhg==", "JZvBG");
        llIIIIIIIl[llIIIIIIlI[36]] = lIlIIIlIIIlll("HiYKMwwjLkYhFywuCSs=", "MIfEe");
        llIIIIIIIl[llIIIIIIlI[39]] = lIlIIIlIIlIII("71rWMJEi3yA1hwbhd66CNg==", "SpciE");
        llIIIIIIIl[llIIIIIIlI[42]] = lIlIIIlIIIllI("TO1a7A3lxDVzpJ47SzetlQ==", "OtAjm");
        llIIIIIIIl[llIIIIIIlI[45]] = lIlIIIlIIIllI("R8y7TZvuMlsxD24v2zhsaA==", "FBFpv");
        llIIIIIIIl[llIIIIIIlI[48]] = lIlIIIlIIIllI("Fvoq6CsTwp5vTYMZcs01zg==", "veyhw");
        llIIIIIIIl[llIIIIIIlI[51]] = lIlIIIlIIIlll("EjoWBgAvMlodBi0w", "AUzpi");
        llIIIIIIIl[llIIIIIIlI[54]] = lIlIIIlIIIlll("ABsULiU9E1g0KTYXEA==", "StxXL");
        llIIIIIIIl[llIIIIIIlI[57]] = lIlIIIlIIIllI("/zXUl4h/smXeJgiAxWeyi1d2v2NMueEA", "huKZP");
        llIIIIIIIl[llIIIIIIlI[58]] = lIlIIIlIIIlll("PykcUw4eaBkHGwM8", "qHjsz");
        llIIIIIIIl[llIIIIIIlI[59]] = lIlIIIlIIlIII("GX1T0rzevdo=", "OykFC");
        llIIIIIIIl[llIIIIIIlI[60]] = lIlIIIlIIlIII("D2ZsCa2HBRYkH6+oq2glcQ==", "XIyIG");
        llIIIIIIIl[llIIIIIIlI[62]] = lIlIIIlIIIlll("GAcaJ1oHBxM4Dh8dGA==", "vrvKz");
        llIIIIIIIl[llIIIIIIlI[63]] = lIlIIIlIIIllI("aB5mgatbUzDmz1Kwlm4m7A==", "rYnKE");
        llIIIIIIIl[llIIIIIIlI[64]] = lIlIIIlIIlIII("d2H4g/+7sVQ=", "lSCDN");
        llIIIIIIIl[llIIIIIIlI[69]] = lIlIIIlIIIlll("EygwBC4mImInNCwz", "EIBvA");
        llIIIIIIIl[llIIIIIIlI[61]] = lIlIIIlIIIllI("MYBIqmjz/mbUiVHKH+nSxu2EKTBkWFP8", "nPFzK");
        llIIIIIIIl[llIIIIIIlI[70]] = lIlIIIlIIlIII("r+D6RnCtyCdRuAdEmxy6GA==", "yiAbf");
        llIIIIIIIl[llIIIIIIlI[71]] = lIlIIIlIIIlll("Ow4vNg4aDD0=", "hmNTo");
        llIIIIIIIl[llIIIIIIlI[72]] = lIlIIIlIIIllI("ho19dx6HcPA=", "VeRIS");
        llIIIIIIIl[llIIIIIIlI[73]] = lIlIIIlIIIllI("QHxk3jvVh69WDcFat5wwag==", "mYrGK");
        llIIIIIIIl[llIIIIIIlI[74]] = lIlIIIlIIIllI("tdHBO1BgYkY7242EQ/xViQ==", "pSFNu");
        llIIIIIIIl[llIIIIIIlI[75]] = lIlIIIlIIlIII("4hKSNFLZ1QyeJKnj/jIDN/FbsI9ee4bd", "PVOEn");
        llIIIIIIIl[llIIIIIIlI[76]] = lIlIIIlIIIlll("HiodKQw1N1EbDzgsGQ==", "QXqHb");
        llIIIIIIIl[llIIIIIIlI[77]] = lIlIIIlIIIlll("BTQkBx8y", "WAJnk");
        llIIIIIIIl[llIIIIIIlI[78]] = lIlIIIlIIIllI("UShEb0LdHWF0ixOuDZy0UA==", "sZKKg");
        llIIIIIIIl[llIIIIIIlI[79]] = lIlIIIlIIIlll("GTkOBgltMgMBDQ==", "MVvoj");
        llIIIIIIIl[llIIIIIIlI[80]] = lIlIIIlIIIllI("TiwwZrd4Z5s=", "CUkVe");
        llIIIIIIIl[llIIIIIIlI[11]] = lIlIIIlIIlIII("UVohDKq/qSk=", "oZfDY");
        llIIIIIIIl[llIIIIIIlI[81]] = lIlIIIlIIIlll("OAIiOygKBzY=", "ksWZE");
        llIIIIIIIl[llIIIIIIlI[82]] = lIlIIIlIIIllI("I895Batup3Bg2arFyVkrDy3dR2vYD5Pr", "DQTMB");
        llIIIIIIIl[llIIIIIIlI[83]] = lIlIIIlIIIllI("ALGUiLUSmfo=", "dshTK");
        llIIIIIIIl[llIIIIIIlI[84]] = lIlIIIlIIIllI("VWULYNNveF4=", "dybEF");
        llIIIIIIIl[llIIIIIIlI[85]] = lIlIIIlIIIlll("AT40JBw=", "UVFAy");
        llIIIIIIIl[llIIIIIIlI[86]] = lIlIIIlIIIllI("ce+VYexlMAg=", "BZdNd");
        llIIIIIIIl[llIIIIIIlI[87]] = lIlIIIlIIlIII("TpN+KegZ8cz8JSG3c1HT9MRyA4QV8pkQ", "amlVE");
        llIIIIIIIl[llIIIIIIlI[88]] = lIlIIIlIIIlll("DTk/", "YNPjL");
        llIIIIIIIl[llIIIIIIlI[89]] = lIlIIIlIIIllI("GnMXFjEIpEQ=", "rWHpC");
        llIIIIIIIl[llIIIIIIlI[0]] = lIlIIIlIIIlll("JCkGDQMSKA==", "wLgzf");
        llIIIIIIIl[llIIIIIIlI[90]] = lIlIIIlIIIllI("XYVamOVx1/GP563KSuR0Cw==", "FSMPt");
        llIIIIIIIl[llIIIIIIlI[91]] = lIlIIIlIIIlll("HzMDKgAucAA9BDg8Bys=", "LPbXa");
        llIIIIIIIl[llIIIIIIlI[92]] = lIlIIIlIIlIII("wu9VtHaRGqIJJNjIYhNWPA==", "akXvt");
        llIIIIIIIl[llIIIIIIlI[93]] = lIlIIIlIIIlll("EQAZHygmCVARITMCFxc=", "RlprI");
        llIIIIIIIl[llIIIIIIlI[94]] = lIlIIIlIIIllI("VEzBX1NZQRU=", "lHaLn");
        llIIIIIIIl[llIIIIIIlI[95]] = lIlIIIlIIIlll("NRoXGA0=", "fsppy");
        llIIIIIIIl[llIIIIIIlI[96]] = lIlIIIlIIIlll("NTs5Bg==", "sTLtq");
        llIIIIIIIl[llIIIIIIlI[97]] = lIlIIIlIIIllI("vVIYBaAlcyeYJb+8ZdyHcg==", "gmSrx");
        llIIIIIIIl[llIIIIIIlI[98]] = lIlIIIlIIIlll("KzdWCwkPKxURFR80", "jYvdy");
        llIIIIIIIl[llIIIIIIlI[99]] = lIlIIIlIIlIII("b1SWUgr56XAEIsnezg3RmgPZ4jR6QWbc", "wzwNu");
        llIIIIIIIl[llIIIIIIlI[100]] = lIlIIIlIIIlll("MwQJISIYHA0g", "vhlLG");
        llIIIIIIIl[llIIIIIIlI[101]] = lIlIIIlIIlIII("DetJ6ge0qQk=", "ljhri");
        llIIIIIIIl[llIIIIIIlI[102]] = lIlIIIlIIIllI("eHBXr/xRj3y+zWShcTyAQw==", "luPqE");
        llIIIIIIIl[llIIIIIIlI[103]] = lIlIIIlIIIlll("GyULHTA2chcWJT0h", "ORnsD");
        llIIIIIIIl[llIIIIIIlI[104]] = lIlIIIlIIIlll("Ny4RUxAPJw0WMUMLFQA3BjQH", "cFtsC");
        llIIIIIIIl[llIIIIIIlI[105]] = lIlIIIlIIIlll("FTYJGAIkMAQfHzk3", "VYgkv");
        llIIIIIIIl[llIIIIIIlI[106]] = lIlIIIlIIIlll("BCwgNw==", "LMIEa");
        llIIIIIIIl[llIIIIIIlI[107]] = lIlIIIlIIIllI("amI80uq/NVWxLeDBM1sDdA==", "KuVRk");
        llIIIIIIIl[llIIIIIIlI[108]] = lIlIIIlIIIlll("KSkZHjQJNhI=", "fDwwB");
        llIIIIIIIl[llIIIIIIlI[109]] = lIlIIIlIIIllI("r0ziyZbYZmc=", "RubEq");
        llIIIIIIIl[llIIIIIIlI[110]] = lIlIIIlIIlIII("WR/jpfvKwOQ=", "iUOFm");
        llIIIIIIIl[llIIIIIIlI[111]] = lIlIIIlIIIllI("HJWbMBi2H6w=", "voIOU");
        llIIIIIIIl[llIIIIIIlI[112]] = lIlIIIlIIIlll("EAckKAAw", "CsKFe");
        llIIIIIIIl[llIIIIIIlI[113]] = lIlIIIlIIIllI("g+sl6KTVgEWFWHe3JacakrEQJx1Kt1HQ", "ahxVD");
        llIIIIIIIl[llIIIIIIlI[114]] = lIlIIIlIIIlll("OBZwCB8EADwJA1ELPkwDGBg1", "qbPlp");
        llIIIIIIIl[llIIIIIIlI[115]] = lIlIIIlIIlIII("xfl9CLZY1Io=", "ZTYGr");
        llIIIIIIIl[llIIIIIIlI[116]] = lIlIIIlIIIllI("UAmD/gLKFkG3Q/X36lSD8A==", "uucns");
        llIIIIIIIl[llIIIIIIlI[117]] = lIlIIIlIIIllI("et5kIx+PKT0MagkpCIN39Q==", "DNYHN");
        llIIIIIIIl[llIIIIIIlI[118]] = lIlIIIlIIlIII("Txb76mfcYShPblll41lXoA==", "jIBVH");
        llIIIIIIIl[llIIIIIIlI[119]] = lIlIIIlIIIlll("MwAoeBQCGyg5FAQAKCoV", "ghMXf");
        llIIIIIIIl[llIIIIIIlI[120]] = lIlIIIlIIIlll("JQMHLwUVH0gjBx8T", "vwhBd");
        llIIIIIIIl[llIIIIIIlI[121]] = lIlIIIlIIIllI("6J8CFI2K9Sk=", "OeAEU");
        llIIIIIIIl[llIIIIIIlI[122]] = lIlIIIlIIlIII("JOjoO5B8T6s=", "AQIhd");
        llIIIIIIIl[llIIIIIIlI[123]] = lIlIIIlIIlIII("tlVBkTTLfqmb2MGFz92KuQ==", "dLOLY");
        llIIIIIIIl[llIIIIIIlI[124]] = lIlIIIlIIIllI("l2fumowcGKQVEyQSZyFexw==", "efbBm");
        llIIIIIIIl[llIIIIIIlI[125]] = lIlIIIlIIIllI("2MhDpGyv0o4t3tDUz1xemA==", "ueEdP");
        llIIIIIIIl[llIIIIIIlI[126]] = lIlIIIlIIIlll("NSwDID1CIRgqcyU0Ais2DDAC", "bUpOS");
        llIIIIIIIl[llIIIIIIlI[127]] = lIlIIIlIIlIII("H9f4Fx7pDQcamDQ0FLVnWA==", "xSVmf");
        llIIIIIIIl[llIIIIIIlI[128]] = lIlIIIlIIIlll("OxgiK2IAETUjLg==", "syPOB");
        llIIIIIIIl[llIIIIIIlI[129]] = lIlIIIlIIIllI("N4V2m+8LEcE=", "LUYjL");
        llIIIIIIIl[llIIIIIIlI[130]] = lIlIIIlIIIllI("gyHQSkhX/3KjoLrgxhqm1g==", "LuRJa");
        llIIIIIIIl[llIIIIIIlI[131]] = lIlIIIlIIIlll("PxEgHwESAyE=", "wpRrm");
        llIIIIIIIl[llIIIIIIlI[132]] = lIlIIIlIIIlll("CgYLYhgkHhsuH2UZBjYfNg==", "EjoBz");
        llIIIIIIIl[llIIIIIIlI[133]] = lIlIIIlIIIllI("0lABmqhCFjM=", "htvxz");
        llIIIIIIIl[llIIIIIIlI[134]] = lIlIIIlIIIlll("IyMlMgAePnY2DQ5tOSMLDz92Pg0cKCQjBgg/NyMGGQ==", "jMVWc");
        llIIIIIIIl[llIIIIIIlI[135]] = lIlIIIlIIIlll("FQQeIzwzGB8=", "TvzLI");
        llIIIIIIIl[llIIIIIIlI[136]] = lIlIIIlIIIllI("bR1nkxL4Dkc=", "wXWBT");
        llIIIIIIIl[llIIIIIIlI[137]] = lIlIIIlIIlIII("v7ic+ZvTsY7EVGirEmCjIQ==", "YHxox");
        llIIIIIIIl[llIIIIIIlI[138]] = lIlIIIlIIlIII("HJrxjeOzKgJdwOEHz9GyUw==", "zIIjv");
        llIIIIIIIl[llIIIIIIlI[68]] = lIlIIIlIIIlll("ODJHDilRNAIUMwIyBgkuUTIIRzsSLwM=", "qFggZ");
        llIIIIIIIl[llIIIIIIlI[139]] = lIlIIIlIIIllI("n54Zjb2Rzcc=", "nDpuU");
        llIIIIIIIl[llIIIIIIlI[140]] = lIlIIIlIIlIII("0IKLMfRPauM=", "qSzpz");
        llIIIIIIIl[llIIIIIIlI[141]] = lIlIIIlIIIlll("ASQpECIgIyoKIjM/", "RQKdG");
        llIIIIIIIl[llIIIIIIlI[142]] = lIlIIIlIIlIII("rMVcGV3XhYrAQrQVpWLbQg==", "nOQNv");
        llIIIIIIIl[llIIIIIIlI[143]] = lIlIIIlIIIllI("NzKeNk6eghIiavEggAJLsA==", "cDdgb");
        llIIIIIIIl[llIIIIIIlI[144]] = lIlIIIlIIIllI("fG1C2o6q/CrfI+qQNBAP7g==", "BZSHX");
        llIIIIIIIl[llIIIIIIlI[145]] = lIlIIIlIIIllI("AwQHdejxjV7SJmobiE+T4w==", "fdsxi");
        llIIIIIIIl[llIIIIIIlI[146]] = lIlIIIlIIlIII("KfhgPJvwBuG4a4PR+Du7XnDPY/XcnEVZVY2j8H6OO24=", "fhkhM");
        llIIIIIIIl[llIIIIIIlI[147]] = lIlIIIlIIIlll("PAAxdxIJBCQ+IgkNdDEnBQE4Lg==", "hhTWF");
        llIIIIIIIl[llIIIIIIlI[148]] = lIlIIIlIIlIII("PlZH601OjtORQuVr19Cm7g==", "HvmRX");
        llIIIIIIIl[llIIIIIIlI[149]] = lIlIIIlIIIllI("9FlusAeBoLi69WVS74JGKA==", "qUzTM");
        llIIIIIIIl[llIIIIIIlI[150]] = lIlIIIlIIIlll("KzYuOXUOKjs3NwR1OCI9CywycCsCMT88PA==", "jXZPX");
        llIIIIIIIl[llIIIIIIlI[165]] = lIlIIIlIIIllI("VdvmNGcV2uDDkTlZbIFaQg==", "zdcon");
    }

    private static boolean lIlIIIlIIllII(int i, int i2) {
        return i < i2;
    }

    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public String ag() {
        return llIIIIIIIl[llIIIIIIlI[69]];
    }

    private static void lIlIIIlIIlIlI() {
        llIIIIIIlI = new int[171];
        llIIIIIIlI[0] = (121 ^ 91) ^ (92 ^ 76);
        llIIIIIIlI[1] = ((((235 + 35) - 160) + 126) ^ (((141 + 49) - 171) + 157)) & (((133 ^ 138) ^ (240 ^ 163)) ^ (-" ".length()));
        llIIIIIIlI[2] = " ".length();
        llIIIIIIlI[3] = (-((-309) & 19773)) & (-8193) & 28670;
        llIIIIIIlI[4] = (-((-21260) & 32607)) & (-16389) & 32735;
        llIIIIIIlI[5] = (((72 + 47) - (-4)) + 63) ^ (((89 + 85) - (-11)) + 5);
        llIIIIIIlI[6] = "  ".length();
        llIIIIIIlI[7] = (-((-7683) & 15915)) & (-16529) & 32767;
        llIIIIIIlI[8] = (-18607) & 31231;
        llIIIIIIlI[9] = 78 ^ 68;
        llIIIIIIlI[10] = (103 ^ 81) ^ (44 ^ 31);
        llIIIIIIlI[11] = 78 ^ 102;
        llIIIIIIlI[12] = "   ".length();
        llIIIIIIlI[13] = 108 ^ 100;
        llIIIIIIlI[14] = (-((-961) & 12229)) & (-20490) & 32767;
        llIIIIIIlI[15] = (-21339) & 23386;
        llIIIIIIlI[16] = 105 ^ 111;
        llIIIIIIlI[17] = (((74 + 118) - 87) + 55) ^ (((52 + 21) - (-72)) + 24);
        llIIIIIIlI[18] = (-19) & 24635;
        llIIIIIIlI[19] = (-((-27143) & 27559)) & (-29763) & 30711;
        llIIIIIIlI[20] = (-22526) & 24575;
        llIIIIIIlI[21] = 37 ^ 34;
        llIIIIIIlI[22] = (-69) & 24686;
        llIIIIIIlI[23] = (-((-2061) & 10399)) & (-21858) & 32247;
        llIIIIIIlI[24] = (-5321) & 29935;
        llIIIIIIlI[25] = (-12849) & 14902;
        llIIIIIIlI[26] = (-836) & 25451;
        llIIIIIIlI[27] = (-12994) & 15049;
        llIIIIIIlI[28] = (-906) & 25519;
        llIIIIIIlI[29] = (-((-18563) & 32723)) & (-166) & 16383;
        llIIIIIIlI[30] = 166 ^ 173;
        llIIIIIIlI[31] = (-2377) & 26989;
        llIIIIIIlI[32] = (-12321) & 14380;
        llIIIIIIlI[33] = 121 ^ 117;
        llIIIIIIlI[34] = (-((-16385) & 18397)) & (-6148) & 32767;
        llIIIIIIlI[35] = (-10066) & 12127;
        llIIIIIIlI[36] = 106 ^ 103;
        llIIIIIIlI[37] = (-((-20791) & 23927)) & (-545) & 28287;
        llIIIIIIlI[38] = (-((-16385) & 25863)) & (-578) & 12119;
        llIIIIIIlI[39] = 56 ^ 54;
        llIIIIIIlI[40] = (-((-8213) & 14293)) & (-2082) & 32767;
        llIIIIIIlI[41] = (-322) & 2387;
        llIIIIIIlI[42] = (152 ^ 172) ^ (29 ^ 38);
        llIIIIIIlI[43] = (-((-37) & 423)) & (-6145) & 31135;
        llIIIIIIlI[44] = (-((-25) & 16731)) & (-13994) & 32767;
        llIIIIIIlI[45] = (11 ^ 16) ^ (168 ^ 163);
        llIIIIIIlI[46] = (-5582) & 30191;
        llIIIIIIlI[47] = (-((-3109) & 11757)) & (-16930) & 27647;
        llIIIIIIlI[48] = (((12 + 50) - (-62)) + 13) ^ (((11 + 3) - (-138)) + 0);
        llIIIIIIlI[49] = (-5505) & 30113;
        llIIIIIIlI[50] = (-((-18969) & 24220)) & (-8545) & 15867;
        llIIIIIIlI[51] = (((93 + 43) - (-63)) + 13) ^ (((68 + 63) - 11) + 78);
        llIIIIIIlI[52] = (-((-9009) & 14329)) & (-785) & 30715;
        llIIIIIIlI[53] = (-((-529) & 26482)) & (-4613) & 32639;
        llIIIIIIlI[54] = (76 ^ 44) ^ (94 ^ 45);
        llIIIIIIlI[55] = (-((-22690) & 23549)) & (-1) & 25471;
        llIIIIIIlI[56] = (-((-8726) & 10071)) & (-4259) & 7679;
        llIIIIIIlI[57] = (231 ^ 192) ^ (84 ^ 103);
        llIIIIIIlI[58] = (247 ^ 186) ^ (245 ^ 173);
        llIIIIIIlI[59] = 162 ^ 180;
        llIIIIIIlI[60] = 4 ^ 19;
        llIIIIIIlI[61] = (((0 + 84) - (-8)) + 70) ^ (((67 + 49) - 42) + 116);
        llIIIIIIlI[62] = (40 ^ 73) ^ (187 ^ 194);
        llIIIIIIlI[63] = 91 ^ 66;
        llIIIIIIlI[64] = (118 ^ 27) ^ (242 ^ 133);
        llIIIIIIlI[65] = (-16418) & 28397;
        llIIIIIIlI[66] = (-((-2597) & 7781)) & (-2580) & 32763;
        llIIIIIIlI[67] = (-((-2049) & 19570)) & (-8193) & 26613;
        llIIIIIIlI[68] = 247 ^ 147;
        llIIIIIIlI[69] = 136 ^ 147;
        llIIIIIIlI[70] = (((110 + 36) - (-28)) + 13) ^ (((124 + 71) - 93) + 64);
        llIIIIIIlI[71] = 163 ^ 189;
        llIIIIIIlI[72] = (((97 + 149) - 95) + 21) ^ (((19 + 103) - (-20)) + 37);
        llIIIIIIlI[73] = (((124 + 132) - 116) + 49) ^ (((130 + 4) - 12) + 35);
        llIIIIIIlI[74] = 44 ^ 13;
        llIIIIIIlI[75] = (132 ^ 142) ^ (132 ^ 172);
        llIIIIIIlI[76] = 135 ^ 164;
        llIIIIIIlI[77] = (71 ^ 10) ^ (213 ^ 188);
        llIIIIIIlI[78] = 178 ^ 151;
        llIIIIIIlI[79] = (((35 + 77) - (-11)) + 9) ^ (((101 + 20) - (-24)) + 17);
        llIIIIIIlI[80] = (208 ^ 195) ^ (159 ^ 171);
        llIIIIIIlI[81] = 187 ^ 146;
        llIIIIIIlI[82] = 85 ^ 127;
        llIIIIIIlI[83] = (((100 + 42) - 92) + 82) ^ (((35 + 46) - 29) + 123);
        llIIIIIIlI[84] = 6 ^ 42;
        llIIIIIIlI[85] = 172 ^ 129;
        llIIIIIIlI[86] = 25 ^ 55;
        llIIIIIIlI[87] = 88 ^ 119;
        llIIIIIIlI[88] = (222 ^ 160) ^ (252 ^ 178);
        llIIIIIIlI[89] = 47 ^ 30;
        llIIIIIIlI[90] = 3 ^ 48;
        llIIIIIIlI[91] = (144 ^ 179) ^ (173 ^ 186);
        llIIIIIIlI[92] = " ".length() ^ (11 ^ 63);
        llIIIIIIlI[93] = 241 ^ 199;
        llIIIIIIlI[94] = 47 ^ 24;
        llIIIIIIlI[95] = 7 ^ 63;
        llIIIIIIlI[96] = 160 ^ 153;
        llIIIIIIlI[97] = 134 ^ 188;
        llIIIIIIlI[98] = (((7 + 65) - 57) + 128) ^ (((98 + 165) - 222) + 139);
        llIIIIIIlI[99] = " ".length() ^ (125 ^ 64);
        llIIIIIIlI[100] = (191 ^ 152) ^ (156 ^ 134);
        llIIIIIIlI[101] = (((6 + 21) - (-59)) + 72) ^ (((76 + 56) - 53) + 81);
        llIIIIIIlI[102] = 48 ^ 15;
        llIIIIIIlI[103] = 58 ^ 122;
        llIIIIIIlI[104] = 7 ^ 70;
        llIIIIIIlI[105] = (206 ^ 182) ^ (27 ^ 33);
        llIIIIIIlI[106] = 222 ^ 157;
        llIIIIIIlI[107] = (((12 + 109) - 110) + 181) ^ (((111 + 25) - 26) + 22);
        llIIIIIIlI[108] = 118 ^ 51;
        llIIIIIIlI[109] = (((151 + 232) - 257) + 118) ^ (((148 + 56) - 54) + 28);
        llIIIIIIlI[110] = (((46 + 175) - 203) + 188) ^ (((136 + 33) - 57) + 25);
        llIIIIIIlI[111] = 205 ^ 133;
        llIIIIIIlI[112] = (((16 + 179) - (-2)) + 38) ^ (((101 + 120) - 146) + 87);
        llIIIIIIlI[113] = (35 ^ 61) ^ (120 ^ 44);
        llIIIIIIlI[114] = (177 ^ 151) ^ (172 ^ 193);
        llIIIIIIlI[115] = 91 ^ 23;
        llIIIIIIlI[116] = (23 ^ 70) ^ (184 ^ 164);
        llIIIIIIlI[117] = (((54 + 74) - (-44)) + 59) ^ (((101 + 104) - 194) + 158);
        llIIIIIIlI[118] = (81 ^ 99) ^ (233 ^ 148);
        llIIIIIIlI[119] = (43 ^ 60) ^ (81 ^ 22);
        llIIIIIIlI[120] = 107 ^ 58;
        llIIIIIIlI[121] = 229 ^ 183;
        llIIIIIIlI[122] = (117 ^ 60) ^ (17 ^ 11);
        llIIIIIIlI[123] = 107 ^ 63;
        llIIIIIIlI[124] = (221 ^ 196) ^ (44 ^ 96);
        llIIIIIIlI[125] = (((230 + 109) - 120) + 32) ^ (((103 + 98) - 162) + 134);
        llIIIIIIlI[126] = 121 ^ 46;
        llIIIIIIlI[127] = (201 ^ 135) ^ (21 ^ 3);
        llIIIIIIlI[128] = (((53 + 110) - (-28)) + 8) ^ (((83 + 98) - 56) + 33);
        llIIIIIIlI[129] = 90 ^ 0;
        llIIIIIIlI[130] = 66 ^ 25;
        llIIIIIIlI[131] = 100 ^ 56;
        llIIIIIIlI[132] = 44 ^ 113;
        llIIIIIIlI[133] = 62 ^ 96;
        llIIIIIIlI[134] = 213 ^ 138;
        llIIIIIIlI[135] = (((133 ^ 199) & ((30 ^ 92) ^ (-1))) & (((101 ^ 104) & ((9 ^ 4) ^ (-1))) ^ (-1))) ^ (43 ^ 75);
        llIIIIIIlI[136] = 3 ^ 98;
        llIIIIIIlI[137] = (183 ^ 169) ^ (10 ^ 118);
        llIIIIIIlI[138] = (((26 + 5) - (-83)) + 107) ^ (((148 + 171) - 205) + 76);
        llIIIIIIlI[139] = (187 ^ 153) ^ (70 ^ 1);
        llIIIIIIlI[140] = (0 ^ 28) ^ (243 ^ 137);
        llIIIIIIlI[141] = 0 ^ 103;
        llIIIIIIlI[142] = (((38 + 220) - 170) + 140) ^ (((20 + 44) - (-3)) + 73);
        llIIIIIIlI[143] = (109 ^ 11) ^ (9 ^ 6);
        llIIIIIIlI[144] = 71 ^ 45;
        llIIIIIIlI[145] = (243 ^ 186) ^ (47 ^ 13);
        llIIIIIIlI[146] = (((75 + 13) - (-107)) + 14) ^ (((155 + 95) - 76) + 15);
        llIIIIIIlI[147] = (47 ^ 2) ^ (61 ^ 125);
        llIIIIIIlI[148] = (((156 + 93) - 75) + 45) ^ (((75 + 163) - 156) + 99);
        llIIIIIIlI[149] = (20 ^ 56) ^ (254 ^ 189);
        llIIIIIIlI[150] = 215 ^ 167;
        llIIIIIIlI[151] = (-((-17618) & 29911)) & (-17217) & 32767;
        llIIIIIIlI[152] = (-((-31) & 4255)) & (-514) & 8189;
        llIIIIIIlI[153] = (-((-8229) & 31013)) & (-34) & 24575;
        llIIIIIIlI[154] = (-((-4121) & 29885)) & (-1) & 30719;
        llIIIIIIlI[155] = (-12289) & 14045;
        llIIIIIIlI[156] = (-((-18757) & 26949)) & (-2081) & 15211;
        llIIIIIIlI[157] = (-7) & 1783;
        llIIIIIIlI[158] = (-1185) & 6143;
        llIIIIIIlI[159] = (-((-1641) & 32633)) & (-1) & 32764;
        llIIIIIIlI[160] = (-((-16747) & 18795)) & (-16515) & 23539;
        llIIIIIIlI[161] = (-((-10306) & 10575)) & (-4097) & 6111;
        llIIIIIIlI[162] = (-10254) & 15229;
        llIIIIIIlI[163] = (-2322) & 4063;
        llIIIIIIlI[164] = (-27787) & 32746;
        llIIIIIIlI[165] = (73 ^ 105) ^ (12 ^ 93);
        llIIIIIIlI[166] = (-6417) & 7582;
        llIIIIIIlI[167] = (-648) & 4031;
        llIIIIIIlI[168] = (-((-22099) & 32343)) & (-17505) & 28535;
        llIIIIIIlI[169] = (-25601) & 26295;
        llIIIIIIlI[170] = (109 ^ 64) ^ (29 ^ 66);
    }

    private static boolean lIlIIIlIlIIll(Object obj) {
        return obj == null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v6, types: [boolean] */
    private static void cZ() {
        Widget widget = Widgets.get(llIIIIIIlI[19], llIIIIIIlI[61]);
        if (lIlIIIlIlIIll(widget)) {
            System.out.println(llIIIIIIIl[llIIIIIIlI[62]]);
            return;
        }
        if (lIlIIIlIIlllI(widget)) {
            System.out.println(widget.getText());
        }
        int i = llIIIIIIlI[1];
        while (lIlIIIlIIllII(i, EnumC0022i.values().length)) {
            if (lIlIIIlIIlIll(widget.getText().equalsIgnoreCase(EnumC0022i.values()[i].aa()) ? 1 : 0)) {
                System.out.println("answer: " + EnumC0022i.values()[i].ab());
                int i2 = i;
                Widget widget2 = Widgets.get(llIIIIIIlI[19], widget3 -> {
                    return widget3.getText().strip().contains(EnumC0022i.values()[i2].ab());
                });
                if (lIlIIIlIIlllI(widget2)) {
                    System.out.println(llIIIIIIIl[llIIIIIIlI[63]]);
                    Mouse.click(widget2.getClickPoint().getX(), widget2.getClickPoint().getY(), (boolean) llIIIIIIlI[2]);
                    Time.sleepTicks(llIIIIIIlI[6]);
                    "".length();
                    "".length();
                    if (((200 ^ 182) ^ (89 ^ 35)) == "   ".length()) {
                        return;
                    }
                    return;
                }
            }
            i++;
            "".length();
            if (" ".length() >= "  ".length()) {
                return;
            }
        }
    }

    private static String lIlIIIlIIIlll(String llllllllllllllllllIllIllIIlIlIIl, String llllllllllllllllllIllIllIIlIlIII) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllllllIllIllIIlIlIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllllIllIllIIlIIlll = new StringBuilder();
        char[] charArray = llllllllllllllllllIllIllIIlIlIII.toCharArray();
        int llllllllllllllllllIllIllIIlIIlIl = llIIIIIIlI[1];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = llIIIIIIlI[1];
        while (lIlIIIlIIllII(i, length)) {
            char llllllllllllllllllIllIllIIlIlIlI = charArray2[i];
            llllllllllllllllllIllIllIIlIIlll.append((char) (llllllllllllllllllIllIllIIlIlIlI ^ charArray[llllllllllllllllllIllIllIIlIIlIl % charArray.length]));
            "".length();
            llllllllllllllllllIllIllIIlIIlIl++;
            i++;
            "".length();
            if ("  ".length() == 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllllllIllIllIIlIIlll);
    }

    private static String lIlIIIlIIIllI(String llllllllllllllllllIllIllIIIlIIlI, String llllllllllllllllllIllIllIIIlIIll) {
        try {
            SecretKeySpec llllllllllllllllllIllIllIIIlIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllllIllIllIIIlIIll.getBytes(StandardCharsets.UTF_8)), llIIIIIIlI[13]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llIIIIIIlI[6], llllllllllllllllllIllIllIIIlIlll);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllllIllIllIIIlIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllllIllIllIIIlIlIl) {
            llllllllllllllllllIllIllIIIlIlIl.printStackTrace();
            return null;
        }
    }

    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public int af() {
        try {
            cY();
            "".length();
            if ("  ".length() >= "   ".length()) {
                return (110 ^ 118) & ((3 ^ 27) ^ (-1));
            }
        } catch (Exception e) {
        }
        return llIIIIIIlI[68];
    }

    static {
        lIlIIIlIIlIlI();
        lIlIIIlIIlIIl();
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
        f0if = llIIIIIIIl[llIIIIIIlI[100]];
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
        bv = new ArrayList();
        String[] strArr = new String[llIIIIIIlI[2]];
        strArr[llIIIIIIlI[1]] = llIIIIIIIl[llIIIIIIlI[165]];
        je = strArr;
        cF = new WorldArea(llIIIIIIlI[166], llIIIIIIlI[167], llIIIIIIlI[168], llIIIIIIlI[169], llIIIIIIlI[1]);
    }

    private static boolean lIlIIIlIIllll(int i) {
        return i > 0;
    }

    private static boolean lIlIIIlIIllIl(int i) {
        return i == 0;
    }

    private static void Q() {
        int[] iArr = new int[llIIIIIIlI[2]];
        iArr[llIIIIIIlI[1]] = llIIIIIIlI[8];
        if (lIlIIIlIIllIl(Bank.contains(iArr) ? 1 : 0)) {
            bv.add(new C0017d(llIIIIIIlI[8], llIIIIIIlI[10], C0023j.cf));
            "".length();
        }
        if (lIlIIIlIIllIl(Bank.contains(item -> {
            return item.getName().toLowerCase().contains(llIIIIIIIl[llIIIIIIlI[61]]);
        }) ? 1 : 0)) {
            bv.add(new C0017d(llIIIIIIlI[65], llIIIIIIlI[10], llIIIIIIlI[66]));
            "".length();
        }
        int[] iArr2 = new int[llIIIIIIlI[2]];
        iArr2[llIIIIIIlI[1]] = llIIIIIIlI[7];
        if (lIlIIIlIIllIl(Bank.contains(iArr2) ? 1 : 0)) {
            bv.add(new C0017d(llIIIIIIlI[7], llIIIIIIlI[11], llIIIIIIlI[67]));
            "".length();
        }
    }

    private static boolean lIlIIIlIlIIII(int i, int i2) {
        return i > i2;
    }
}
