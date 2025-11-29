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
import net.runelite.api.Item;
import net.runelite.api.Prayer;
import net.runelite.api.Skill;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Prayers;
/* renamed from: o.c.k.i.-.l.o.f.-.n.c.t.e.s.C  reason: invalid package */
/* loaded from: 7c1d3521-d222-494e-8c51-697efca0674b.jar:o/c/k/i/-/l/o/f/-/n/c/t/e/s/C.class */
public class C implements InterfaceC0003ac {
    public static final /* synthetic */ WorldPoint eD;
    public static /* synthetic */ boolean cJ;
    public static final /* synthetic */ WorldPoint eB;
    public static final /* synthetic */ WorldPoint ex;
    static /* synthetic */ boolean eJ;
    public static final /* synthetic */ WorldPoint eC;
    static /* synthetic */ boolean eW;
    static /* synthetic */ int eG;
    static /* synthetic */ boolean eR;
    static /* synthetic */ boolean eN;
    static /* synthetic */ boolean eU;
    static /* synthetic */ int di;
    public static /* synthetic */ String[] cE;
    static /* synthetic */ boolean eM;
    static /* synthetic */ boolean eP;
    static /* synthetic */ boolean eV;
    static /* synthetic */ boolean eH;
    public static final /* synthetic */ WorldPoint eE;
    static /* synthetic */ boolean eK;
    static /* synthetic */ boolean eI;
    public static final /* synthetic */ WorldPoint ez;
    static /* synthetic */ boolean eS;
    static /* synthetic */ boolean eL;
    private static /* synthetic */ int[] llIIIlIIIl;
    static /* synthetic */ boolean eO;
    public static final /* synthetic */ WorldPoint ew;
    static /* synthetic */ boolean eQ;
    public static final /* synthetic */ WorldPoint eF;
    public static /* synthetic */ String h;
    static /* synthetic */ boolean eT;
    public static /* synthetic */ boolean bt;
    public static final /* synthetic */ WorldPoint eA;
    public static final /* synthetic */ WorldPoint ey;
    public static /* synthetic */ List<C0017d> bv;
    private static /* synthetic */ String[] llIIIlIIII;
    public static /* synthetic */ String da;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v132, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v168, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v204, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v240, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v276, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v312, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v348, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v38, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v384, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v40, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v42, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v420, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v44, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v456, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v46, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v48, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v492, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v50, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v52, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v528, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v54, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v56, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v564, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v58, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v598, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v60, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v62, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v64, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v66, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v96, types: [boolean] */
    public static void bB() {
        if (lIlIIlIlIlIIl(eH ? 1 : 0) && lIlIIlIlIlIIl(C0020g.M() ? 1 : 0)) {
            if (lIlIIlIlIllIl(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llIIIlIIIl[130], llIIIlIIIl[131], llIIIlIIIl[1])), llIIIlIIIl[3])) {
                Movement.walkTo(new WorldPoint(llIIIlIIIl[130], llIIIlIIIl[131], llIIIlIIIl[1]));
                "".length();
                Time.sleepTicks(llIIIlIIIl[0]);
                "".length();
            }
            if (lIlIIlIlIlllI(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llIIIlIIIl[130], llIIIlIIIl[131], llIIIlIIIl[1])), llIIIlIIIl[3]) && lIlIIlIlIlIIl(Players.getLocal().isMoving() ? 1 : 0)) {
                if (lIlIIlIlIlIIl(Dialog.isOpen() ? 1 : 0)) {
                    Time.sleepTicks(llIIIlIIIl[3]);
                    "".length();
                    String[] strArr = new String[llIIIlIIIl[0]];
                    strArr[llIIIlIIIl[1]] = llIIIlIIII[llIIIlIIIl[132]];
                    TileObjects.getNearest(strArr).interact(llIIIlIIII[llIIIlIIIl[133]]);
                    Time.sleepTicks(llIIIlIIIl[3]);
                    "".length();
                    eH = llIIIlIIIl[0];
                }
                C0020g.a(cE);
            }
        }
        if (lIlIIlIlIlIIl(eI ? 1 : 0) && lIlIIlIlIIlll(eH ? 1 : 0) && lIlIIlIlIlIIl(C0020g.M() ? 1 : 0)) {
            if (lIlIIlIlIllIl(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llIIIlIIIl[60], llIIIlIIIl[134], llIIIlIIIl[1])), llIIIlIIIl[3]) && lIlIIlIlIIlll(Movement.walkTo(new WorldPoint(llIIIlIIIl[60], llIIIlIIIl[134], llIIIlIIIl[1])) ? 1 : 0)) {
                Time.sleepTicks(llIIIlIIIl[0]);
                "".length();
            }
            if (lIlIIlIlIlllI(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llIIIlIIIl[60], llIIIlIIIl[134], llIIIlIIIl[1])), llIIIlIIIl[3]) && lIlIIlIlIlIIl(Players.getLocal().isMoving() ? 1 : 0)) {
                if (lIlIIlIlIlIIl(Dialog.isOpen() ? 1 : 0)) {
                    Time.sleepTicks(llIIIlIIIl[3]);
                    "".length();
                    String[] strArr2 = new String[llIIIlIIIl[0]];
                    strArr2[llIIIlIIIl[1]] = llIIIlIIII[llIIIlIIIl[135]];
                    TileObjects.getNearest(strArr2).interact(llIIIlIIII[llIIIlIIIl[136]]);
                    Time.sleepTicks(llIIIlIIIl[3]);
                    "".length();
                    eI = llIIIlIIIl[0];
                }
                C0020g.a(cE);
            }
        }
        if (lIlIIlIlIlIIl(eJ ? 1 : 0) && lIlIIlIlIIlll(eI ? 1 : 0) && lIlIIlIlIlIIl(C0020g.M() ? 1 : 0)) {
            if (lIlIIlIlIllIl(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llIIIlIIIl[137], llIIIlIIIl[134], llIIIlIIIl[1])), llIIIlIIIl[3]) && lIlIIlIlIIlll(Movement.walkTo(new WorldPoint(llIIIlIIIl[137], llIIIlIIIl[134], llIIIlIIIl[1])) ? 1 : 0)) {
                Time.sleepTicks(llIIIlIIIl[0]);
                "".length();
            }
            if (lIlIIlIlIlllI(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llIIIlIIIl[137], llIIIlIIIl[134], llIIIlIIIl[1])), llIIIlIIIl[3]) && lIlIIlIlIlIIl(Players.getLocal().isMoving() ? 1 : 0)) {
                if (lIlIIlIlIlIIl(Dialog.isOpen() ? 1 : 0)) {
                    Time.sleepTicks(llIIIlIIIl[3]);
                    "".length();
                    String[] strArr3 = new String[llIIIlIIIl[0]];
                    strArr3[llIIIlIIIl[1]] = llIIIlIIII[llIIIlIIIl[138]];
                    TileObjects.getNearest(strArr3).interact(llIIIlIIII[llIIIlIIIl[139]]);
                    Time.sleepTicks(llIIIlIIIl[3]);
                    "".length();
                    eJ = llIIIlIIIl[0];
                }
                C0020g.a(cE);
            }
        }
        if (lIlIIlIlIlIIl(eK ? 1 : 0) && lIlIIlIlIIlll(eJ ? 1 : 0) && lIlIIlIlIlIIl(C0020g.M() ? 1 : 0)) {
            if (lIlIIlIlIllIl(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llIIIlIIIl[140], llIIIlIIIl[131], llIIIlIIIl[1])), llIIIlIIIl[3]) && lIlIIlIlIIlll(Movement.walkTo(new WorldPoint(llIIIlIIIl[140], llIIIlIIIl[131], llIIIlIIIl[1])) ? 1 : 0)) {
                Time.sleepTicks(llIIIlIIIl[0]);
                "".length();
            }
            if (lIlIIlIlIlllI(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llIIIlIIIl[140], llIIIlIIIl[131], llIIIlIIIl[1])), llIIIlIIIl[3]) && lIlIIlIlIlIIl(Players.getLocal().isMoving() ? 1 : 0)) {
                if (lIlIIlIlIlIIl(Dialog.isOpen() ? 1 : 0)) {
                    Time.sleepTicks(llIIIlIIIl[3]);
                    "".length();
                    String[] strArr4 = new String[llIIIlIIIl[0]];
                    strArr4[llIIIlIIIl[1]] = llIIIlIIII[llIIIlIIIl[141]];
                    TileObjects.getNearest(strArr4).interact(llIIIlIIII[llIIIlIIIl[82]]);
                    Time.sleepTicks(llIIIlIIIl[3]);
                    "".length();
                    eK = llIIIlIIIl[0];
                }
                C0020g.a(cE);
            }
        }
        if (lIlIIlIlIlIIl(eL ? 1 : 0) && lIlIIlIlIIlll(eK ? 1 : 0) && lIlIIlIlIlIIl(C0020g.M() ? 1 : 0)) {
            if (lIlIIlIlIllIl(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llIIIlIIIl[142], llIIIlIIIl[143], llIIIlIIIl[1])), llIIIlIIIl[3]) && lIlIIlIlIIlll(Movement.walkTo(new WorldPoint(llIIIlIIIl[142], llIIIlIIIl[143], llIIIlIIIl[1])) ? 1 : 0)) {
                Time.sleepTicks(llIIIlIIIl[0]);
                "".length();
            }
            if (lIlIIlIlIlllI(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llIIIlIIIl[142], llIIIlIIIl[143], llIIIlIIIl[1])), llIIIlIIIl[3]) && lIlIIlIlIlIIl(Players.getLocal().isMoving() ? 1 : 0)) {
                if (lIlIIlIlIlIIl(Dialog.isOpen() ? 1 : 0)) {
                    Time.sleepTicks(llIIIlIIIl[3]);
                    "".length();
                    String[] strArr5 = new String[llIIIlIIIl[0]];
                    strArr5[llIIIlIIIl[1]] = llIIIlIIII[llIIIlIIIl[144]];
                    TileObjects.getNearest(strArr5).interact(llIIIlIIII[llIIIlIIIl[145]]);
                    Time.sleepTicks(llIIIlIIIl[3]);
                    "".length();
                    eL = llIIIlIIIl[0];
                }
                C0020g.a(cE);
            }
        }
        if (lIlIIlIlIlIIl(eM ? 1 : 0) && lIlIIlIlIIlll(eL ? 1 : 0) && lIlIIlIlIlIIl(C0020g.M() ? 1 : 0)) {
            if (lIlIIlIlIllIl(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llIIIlIIIl[146], llIIIlIIIl[134], llIIIlIIIl[1])), llIIIlIIIl[3]) && lIlIIlIlIIlll(Movement.walkTo(new WorldPoint(llIIIlIIIl[146], llIIIlIIIl[134], llIIIlIIIl[1])) ? 1 : 0)) {
                Time.sleepTicks(llIIIlIIIl[0]);
                "".length();
            }
            if (lIlIIlIlIlllI(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llIIIlIIIl[146], llIIIlIIIl[134], llIIIlIIIl[1])), llIIIlIIIl[3]) && lIlIIlIlIlIIl(Players.getLocal().isMoving() ? 1 : 0)) {
                if (lIlIIlIlIlIIl(Dialog.isOpen() ? 1 : 0)) {
                    Time.sleepTicks(llIIIlIIIl[3]);
                    "".length();
                    String[] strArr6 = new String[llIIIlIIIl[0]];
                    strArr6[llIIIlIIIl[1]] = llIIIlIIII[llIIIlIIIl[147]];
                    TileObjects.getNearest(strArr6).interact(llIIIlIIII[llIIIlIIIl[148]]);
                    Time.sleepTicks(llIIIlIIIl[3]);
                    "".length();
                    eM = llIIIlIIIl[0];
                }
                C0020g.a(cE);
            }
        }
        if (lIlIIlIlIlIIl(eN ? 1 : 0) && lIlIIlIlIIlll(eM ? 1 : 0) && lIlIIlIlIlIIl(C0020g.M() ? 1 : 0)) {
            if (lIlIIlIlIllIl(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llIIIlIIIl[149], llIIIlIIIl[150], llIIIlIIIl[1])), llIIIlIIIl[3]) && lIlIIlIlIIlll(Movement.walkTo(new WorldPoint(llIIIlIIIl[149], llIIIlIIIl[150], llIIIlIIIl[1])) ? 1 : 0)) {
                Time.sleepTicks(llIIIlIIIl[0]);
                "".length();
            }
            if (lIlIIlIlIlllI(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llIIIlIIIl[149], llIIIlIIIl[150], llIIIlIIIl[1])), llIIIlIIIl[3]) && lIlIIlIlIlIIl(Players.getLocal().isMoving() ? 1 : 0)) {
                if (lIlIIlIlIlIIl(Dialog.isOpen() ? 1 : 0)) {
                    Time.sleepTicks(llIIIlIIIl[3]);
                    "".length();
                    String[] strArr7 = new String[llIIIlIIIl[0]];
                    strArr7[llIIIlIIIl[1]] = llIIIlIIII[llIIIlIIIl[151]];
                    TileObjects.getNearest(strArr7).interact(llIIIlIIII[llIIIlIIIl[152]]);
                    Time.sleepTicks(llIIIlIIIl[3]);
                    "".length();
                    eN = llIIIlIIIl[0];
                }
                C0020g.a(cE);
            }
        }
        if (lIlIIlIlIlIIl(eO ? 1 : 0) && lIlIIlIlIIlll(eN ? 1 : 0) && lIlIIlIlIlIIl(C0020g.M() ? 1 : 0)) {
            if (lIlIIlIlIllIl(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llIIIlIIIl[153], llIIIlIIIl[154], llIIIlIIIl[1])), llIIIlIIIl[3]) && lIlIIlIlIIlll(Movement.walkTo(new WorldPoint(llIIIlIIIl[153], llIIIlIIIl[154], llIIIlIIIl[1])) ? 1 : 0)) {
                Time.sleepTicks(llIIIlIIIl[0]);
                "".length();
            }
            if (lIlIIlIlIlllI(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llIIIlIIIl[153], llIIIlIIIl[154], llIIIlIIIl[1])), llIIIlIIIl[3]) && lIlIIlIlIlIIl(Players.getLocal().isMoving() ? 1 : 0)) {
                if (lIlIIlIlIlIIl(Dialog.isOpen() ? 1 : 0)) {
                    Time.sleepTicks(llIIIlIIIl[3]);
                    "".length();
                    String[] strArr8 = new String[llIIIlIIIl[0]];
                    strArr8[llIIIlIIIl[1]] = llIIIlIIII[llIIIlIIIl[155]];
                    TileObjects.getNearest(strArr8).interact(llIIIlIIII[llIIIlIIIl[156]]);
                    Time.sleepTicks(llIIIlIIIl[3]);
                    "".length();
                    eO = llIIIlIIIl[0];
                }
                C0020g.a(cE);
            }
        }
        if (lIlIIlIlIlIIl(eP ? 1 : 0) && lIlIIlIlIIlll(eO ? 1 : 0) && lIlIIlIlIlIIl(C0020g.M() ? 1 : 0)) {
            if (lIlIIlIlIllIl(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llIIIlIIIl[157], llIIIlIIIl[158], llIIIlIIIl[1])), llIIIlIIIl[3]) && lIlIIlIlIIlll(Movement.walkTo(new WorldPoint(llIIIlIIIl[157], llIIIlIIIl[158], llIIIlIIIl[1])) ? 1 : 0)) {
                Time.sleepTicks(llIIIlIIIl[0]);
                "".length();
            }
            if (lIlIIlIlIlllI(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llIIIlIIIl[157], llIIIlIIIl[158], llIIIlIIIl[1])), llIIIlIIIl[3]) && lIlIIlIlIlIIl(Players.getLocal().isMoving() ? 1 : 0)) {
                if (lIlIIlIlIlIIl(Dialog.isOpen() ? 1 : 0)) {
                    Time.sleepTicks(llIIIlIIIl[3]);
                    "".length();
                    String[] strArr9 = new String[llIIIlIIIl[0]];
                    strArr9[llIIIlIIIl[1]] = llIIIlIIII[llIIIlIIIl[159]];
                    TileObjects.getNearest(strArr9).interact(llIIIlIIII[llIIIlIIIl[100]]);
                    Time.sleepTicks(llIIIlIIIl[3]);
                    "".length();
                    eP = llIIIlIIIl[0];
                }
                C0020g.a(cE);
            }
        }
        if (lIlIIlIlIlIIl(eQ ? 1 : 0) && lIlIIlIlIIlll(eP ? 1 : 0) && lIlIIlIlIlIIl(C0020g.M() ? 1 : 0)) {
            if (lIlIIlIlIllIl(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llIIIlIIIl[160], llIIIlIIIl[161], llIIIlIIIl[1])), llIIIlIIIl[3]) && lIlIIlIlIIlll(Movement.walkTo(new WorldPoint(llIIIlIIIl[160], llIIIlIIIl[161], llIIIlIIIl[1])) ? 1 : 0)) {
                Time.sleepTicks(llIIIlIIIl[0]);
                "".length();
            }
            if (lIlIIlIlIlllI(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llIIIlIIIl[160], llIIIlIIIl[161], llIIIlIIIl[1])), llIIIlIIIl[3]) && lIlIIlIlIlIIl(Players.getLocal().isMoving() ? 1 : 0)) {
                if (lIlIIlIlIlIIl(Dialog.isOpen() ? 1 : 0)) {
                    Time.sleepTicks(llIIIlIIIl[3]);
                    "".length();
                    String[] strArr10 = new String[llIIIlIIIl[0]];
                    strArr10[llIIIlIIIl[1]] = llIIIlIIII[llIIIlIIIl[162]];
                    TileObjects.getNearest(strArr10).interact(llIIIlIIII[llIIIlIIIl[163]]);
                    Time.sleepTicks(llIIIlIIIl[3]);
                    "".length();
                    eQ = llIIIlIIIl[0];
                }
                C0020g.a(cE);
            }
        }
        if (lIlIIlIlIlIIl(eR ? 1 : 0) && lIlIIlIlIIlll(eQ ? 1 : 0) && lIlIIlIlIlIIl(C0020g.M() ? 1 : 0)) {
            if (lIlIIlIlIllIl(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llIIIlIIIl[164], llIIIlIIIl[158], llIIIlIIIl[1])), llIIIlIIIl[3]) && lIlIIlIlIIlll(Movement.walkTo(new WorldPoint(llIIIlIIIl[164], llIIIlIIIl[158], llIIIlIIIl[1])) ? 1 : 0)) {
                Time.sleepTicks(llIIIlIIIl[0]);
                "".length();
            }
            if (lIlIIlIlIlllI(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llIIIlIIIl[164], llIIIlIIIl[158], llIIIlIIIl[1])), llIIIlIIIl[3]) && lIlIIlIlIlIIl(Players.getLocal().isMoving() ? 1 : 0)) {
                if (lIlIIlIlIlIIl(Dialog.isOpen() ? 1 : 0)) {
                    Time.sleepTicks(llIIIlIIIl[3]);
                    "".length();
                    String[] strArr11 = new String[llIIIlIIIl[0]];
                    strArr11[llIIIlIIIl[1]] = llIIIlIIII[llIIIlIIIl[165]];
                    TileObjects.getNearest(strArr11).interact(llIIIlIIII[llIIIlIIIl[166]]);
                    Time.sleepTicks(llIIIlIIIl[3]);
                    "".length();
                    eR = llIIIlIIIl[0];
                }
                C0020g.a(cE);
            }
        }
        if (lIlIIlIlIlIIl(eS ? 1 : 0) && lIlIIlIlIIlll(eR ? 1 : 0) && lIlIIlIlIlIIl(C0020g.M() ? 1 : 0)) {
            if (lIlIIlIlIllIl(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llIIIlIIIl[109], llIIIlIIIl[167], llIIIlIIIl[1])), llIIIlIIIl[3]) && lIlIIlIlIIlll(Movement.walkTo(new WorldPoint(llIIIlIIIl[109], llIIIlIIIl[167], llIIIlIIIl[1])) ? 1 : 0)) {
                Time.sleepTicks(llIIIlIIIl[0]);
                "".length();
            }
            if (lIlIIlIlIlllI(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llIIIlIIIl[109], llIIIlIIIl[167], llIIIlIIIl[1])), llIIIlIIIl[3]) && lIlIIlIlIlIIl(Players.getLocal().isMoving() ? 1 : 0)) {
                if (lIlIIlIlIlIIl(Dialog.isOpen() ? 1 : 0)) {
                    Time.sleepTicks(llIIIlIIIl[3]);
                    "".length();
                    String[] strArr12 = new String[llIIIlIIIl[0]];
                    strArr12[llIIIlIIIl[1]] = llIIIlIIII[llIIIlIIIl[168]];
                    TileObjects.getNearest(strArr12).interact(llIIIlIIII[llIIIlIIIl[169]]);
                    Time.sleepTicks(llIIIlIIIl[3]);
                    "".length();
                    eS = llIIIlIIIl[0];
                }
                C0020g.a(cE);
            }
        }
        if (lIlIIlIlIlIIl(eT ? 1 : 0) && lIlIIlIlIIlll(eS ? 1 : 0) && lIlIIlIlIlIIl(C0020g.M() ? 1 : 0)) {
            if (lIlIIlIlIllIl(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llIIIlIIIl[170], llIIIlIIIl[134], llIIIlIIIl[1])), llIIIlIIIl[3]) && lIlIIlIlIIlll(Movement.walkTo(new WorldPoint(llIIIlIIIl[170], llIIIlIIIl[134], llIIIlIIIl[1])) ? 1 : 0)) {
                Time.sleepTicks(llIIIlIIIl[0]);
                "".length();
            }
            if (lIlIIlIlIlllI(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llIIIlIIIl[170], llIIIlIIIl[134], llIIIlIIIl[1])), llIIIlIIIl[3]) && lIlIIlIlIlIIl(Players.getLocal().isMoving() ? 1 : 0)) {
                if (lIlIIlIlIlIIl(Dialog.isOpen() ? 1 : 0)) {
                    Time.sleepTicks(llIIIlIIIl[3]);
                    "".length();
                    String[] strArr13 = new String[llIIIlIIIl[0]];
                    strArr13[llIIIlIIIl[1]] = llIIIlIIII[llIIIlIIIl[171]];
                    TileObjects.getNearest(strArr13).interact(llIIIlIIII[llIIIlIIIl[172]]);
                    Time.sleepTicks(llIIIlIIIl[3]);
                    "".length();
                    eT = llIIIlIIIl[0];
                }
                C0020g.a(cE);
            }
        }
        if (lIlIIlIlIlIIl(eU ? 1 : 0) && lIlIIlIlIIlll(eT ? 1 : 0) && lIlIIlIlIlIIl(C0020g.M() ? 1 : 0)) {
            if (lIlIIlIlIllIl(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llIIIlIIIl[173], llIIIlIIIl[134], llIIIlIIIl[1])), llIIIlIIIl[3]) && lIlIIlIlIIlll(Movement.walkTo(new WorldPoint(llIIIlIIIl[173], llIIIlIIIl[134], llIIIlIIIl[1])) ? 1 : 0)) {
                Time.sleepTicks(llIIIlIIIl[0]);
                "".length();
            }
            if (lIlIIlIlIlllI(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llIIIlIIIl[173], llIIIlIIIl[134], llIIIlIIIl[1])), llIIIlIIIl[3]) && lIlIIlIlIlIIl(Players.getLocal().isMoving() ? 1 : 0)) {
                if (lIlIIlIlIlIIl(Dialog.isOpen() ? 1 : 0)) {
                    Time.sleepTicks(llIIIlIIIl[3]);
                    "".length();
                    String[] strArr14 = new String[llIIIlIIIl[0]];
                    strArr14[llIIIlIIIl[1]] = llIIIlIIII[llIIIlIIIl[174]];
                    TileObjects.getNearest(strArr14).interact(llIIIlIIII[llIIIlIIIl[103]]);
                    Time.sleepTicks(llIIIlIIIl[3]);
                    "".length();
                    eU = llIIIlIIIl[0];
                }
                C0020g.a(cE);
            }
        }
        if (lIlIIlIlIlIIl(eV ? 1 : 0) && lIlIIlIlIIlll(eU ? 1 : 0) && lIlIIlIlIlIIl(C0020g.M() ? 1 : 0)) {
            if (lIlIIlIlIllIl(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llIIIlIIIl[175], llIIIlIIIl[176], llIIIlIIIl[1])), llIIIlIIIl[3]) && lIlIIlIlIIlll(Movement.walkTo(new WorldPoint(llIIIlIIIl[175], llIIIlIIIl[176], llIIIlIIIl[1])) ? 1 : 0)) {
                Time.sleepTicks(llIIIlIIIl[0]);
                "".length();
            }
            if (lIlIIlIlIlllI(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llIIIlIIIl[175], llIIIlIIIl[176], llIIIlIIIl[1])), llIIIlIIIl[3]) && lIlIIlIlIlIIl(Players.getLocal().isMoving() ? 1 : 0)) {
                if (lIlIIlIlIlIIl(Dialog.isOpen() ? 1 : 0)) {
                    Time.sleepTicks(llIIIlIIIl[3]);
                    "".length();
                    String[] strArr15 = new String[llIIIlIIIl[0]];
                    strArr15[llIIIlIIIl[1]] = llIIIlIIII[llIIIlIIIl[177]];
                    TileObjects.getNearest(strArr15).interact(llIIIlIIII[llIIIlIIIl[178]]);
                    Time.sleepTicks(llIIIlIIIl[3]);
                    "".length();
                    eV = llIIIlIIIl[0];
                }
                C0020g.a(cE);
            }
        }
        if (lIlIIlIlIIlll(eV ? 1 : 0)) {
            String[] strArr16 = new String[llIIIlIIIl[0]];
            strArr16[llIIIlIIIl[1]] = llIIIlIIII[llIIIlIIIl[179]];
            if (lIlIIlIlIlIIl(Inventory.contains(strArr16) ? 1 : 0)) {
                eH = llIIIlIIIl[1];
                eI = llIIIlIIIl[1];
                eJ = llIIIlIIIl[1];
                eK = llIIIlIIIl[1];
                eL = llIIIlIIIl[1];
                eM = llIIIlIIIl[1];
                eN = llIIIlIIIl[1];
                eO = llIIIlIIIl[1];
                eP = llIIIlIIIl[1];
                eQ = llIIIlIIIl[1];
                eR = llIIIlIIIl[1];
                eS = llIIIlIIIl[1];
                eT = llIIIlIIIl[1];
                eU = llIIIlIIIl[1];
                eV = llIIIlIIIl[1];
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public boolean ae() {
        return llIIIlIIIl[1];
    }

    private static boolean lIlIIlIlIllll(int i, int i2) {
        return i != i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x00f1, code lost:
        if (lIlIIlIlIlIII(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.C.llIIIlIIIl[181(0xb5, float:2.54E-43)]) != false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x017b, code lost:
        if (lIlIIlIlIlIII(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.C.llIIIlIIIl[10]) != false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0204, code lost:
        if (lIlIIlIlIlIII(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.C.llIIIlIIIl[12]) != false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x02c8, code lost:
        if (lIlIIlIlIlIII(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.C.llIIIlIIIl[6]) != false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x005d, code lost:
        if (lIlIIlIlIlIII(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.C.llIIIlIIIl[16]) != false) goto L57;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x03dd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void Q() {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        int[] iArr5;
        int[] iArr6;
        int[] iArr7;
        int[] iArr8 = new int[llIIIlIIIl[0]];
        iArr8[llIIIlIIIl[1]] = llIIIlIIIl[15];
        if (lIlIIlIlIIlll(Bank.contains(iArr8) ? 1 : 0)) {
            int[] iArr9 = new int[llIIIlIIIl[0]];
            iArr9[llIIIlIIIl[1]] = llIIIlIIIl[15];
            if (lIlIIlIlIIlll(Bank.contains(iArr9) ? 1 : 0)) {
                int[] iArr10 = new int[llIIIlIIIl[0]];
                iArr10[llIIIlIIIl[1]] = llIIIlIIIl[15];
            }
            iArr = new int[llIIIlIIIl[0]];
            iArr[llIIIlIIIl[1]] = llIIIlIIIl[7];
            if (lIlIIlIlIIlll(Bank.contains(iArr) ? 1 : 0)) {
                int[] iArr11 = new int[llIIIlIIIl[0]];
                iArr11[llIIIlIIIl[1]] = llIIIlIIIl[7];
                if (lIlIIlIlIIlll(Bank.contains(iArr11) ? 1 : 0)) {
                    int[] iArr12 = new int[llIIIlIIIl[0]];
                    iArr12[llIIIlIIIl[1]] = llIIIlIIIl[7];
                }
                iArr2 = new int[llIIIlIIIl[0]];
                iArr2[llIIIlIIIl[1]] = llIIIlIIIl[9];
                if (lIlIIlIlIIlll(Bank.contains(iArr2) ? 1 : 0)) {
                    int[] iArr13 = new int[llIIIlIIIl[0]];
                    iArr13[llIIIlIIIl[1]] = llIIIlIIIl[9];
                    if (lIlIIlIlIIlll(Bank.contains(iArr13) ? 1 : 0)) {
                        int[] iArr14 = new int[llIIIlIIIl[0]];
                        iArr14[llIIIlIIIl[1]] = llIIIlIIIl[9];
                    }
                    iArr3 = new int[llIIIlIIIl[0]];
                    iArr3[llIIIlIIIl[1]] = llIIIlIIIl[11];
                    if (lIlIIlIlIIlll(Bank.contains(iArr3) ? 1 : 0)) {
                        int[] iArr15 = new int[llIIIlIIIl[0]];
                        iArr15[llIIIlIIIl[1]] = llIIIlIIIl[11];
                        if (lIlIIlIlIIlll(Bank.contains(iArr15) ? 1 : 0)) {
                            int[] iArr16 = new int[llIIIlIIIl[0]];
                            iArr16[llIIIlIIIl[1]] = llIIIlIIIl[11];
                        }
                        if (lIlIIlIlIlIIl(Bank.contains(item -> {
                            return item.getName().toLowerCase().contains(llIIIlIIII[llIIIlIIIl[187]]);
                        }) ? 1 : 0)) {
                            bv.add(new C0017d(llIIIlIIIl[182], llIIIlIIIl[12], llIIIlIIIl[183]));
                            "".length();
                        }
                        iArr4 = new int[llIIIlIIIl[0]];
                        iArr4[llIIIlIIIl[1]] = llIIIlIIIl[13];
                        if (lIlIIlIlIIlll(Bank.contains(iArr4) ? 1 : 0)) {
                            int[] iArr17 = new int[llIIIlIIIl[0]];
                            iArr17[llIIIlIIIl[1]] = llIIIlIIIl[13];
                            if (lIlIIlIlIIlll(Bank.contains(iArr17) ? 1 : 0)) {
                                int[] iArr18 = new int[llIIIlIIIl[0]];
                                iArr18[llIIIlIIIl[1]] = llIIIlIIIl[13];
                            }
                            iArr5 = new int[llIIIlIIIl[0]];
                            iArr5[llIIIlIIIl[1]] = llIIIlIIIl[14];
                            if (lIlIIlIlIIlll(Bank.contains(iArr5) ? 1 : 0)) {
                                int[] iArr19 = new int[llIIIlIIIl[0]];
                                iArr19[llIIIlIIIl[1]] = llIIIlIIIl[14];
                                if (lIlIIlIlIlIII(Bank.getFirst(iArr19).getQuantity(), llIIIlIIIl[6])) {
                                    int i = llIIIlIIIl[14];
                                    int i2 = llIIIlIIIl[6];
                                    int[] iArr20 = new int[llIIIlIIIl[0]];
                                    iArr20[llIIIlIIIl[1]] = llIIIlIIIl[14];
                                    bv.add(new C0017d(i, i2 - Bank.getFirst(iArr20).getQuantity(), llIIIlIIIl[184]));
                                    "".length();
                                }
                            }
                            iArr6 = new int[llIIIlIIIl[0]];
                            iArr6[llIIIlIIIl[1]] = llIIIlIIIl[14];
                            if (lIlIIlIlIlIIl(Bank.contains(iArr6) ? 1 : 0)) {
                                bv.add(new C0017d(llIIIlIIIl[14], llIIIlIIIl[6], llIIIlIIIl[184]));
                                "".length();
                            }
                            iArr7 = new int[llIIIlIIIl[0]];
                            iArr7[llIIIlIIIl[1]] = llIIIlIIIl[17];
                            if (lIlIIlIlIIlll(Bank.contains(iArr7) ? 1 : 0)) {
                                int[] iArr21 = new int[llIIIlIIIl[0]];
                                iArr21[llIIIlIIIl[1]] = llIIIlIIIl[17];
                                if (!lIlIIlIlIIlll(Bank.contains(iArr21) ? 1 : 0)) {
                                    return;
                                }
                                int[] iArr22 = new int[llIIIlIIIl[0]];
                                iArr22[llIIIlIIIl[1]] = llIIIlIIIl[17];
                                if (!lIlIIlIlIlIII(Bank.getFirst(iArr22).getQuantity(), llIIIlIIIl[26])) {
                                    return;
                                }
                            }
                            bv.add(new C0017d(llIIIlIIIl[17], llIIIlIIIl[36], llIIIlIIIl[185]));
                            "".length();
                        }
                        bv.add(new C0017d(llIIIlIIIl[13], llIIIlIIIl[6], C0023j.cf));
                        "".length();
                        iArr5 = new int[llIIIlIIIl[0]];
                        iArr5[llIIIlIIIl[1]] = llIIIlIIIl[14];
                        if (lIlIIlIlIIlll(Bank.contains(iArr5) ? 1 : 0)) {
                        }
                        iArr6 = new int[llIIIlIIIl[0]];
                        iArr6[llIIIlIIIl[1]] = llIIIlIIIl[14];
                        if (lIlIIlIlIlIIl(Bank.contains(iArr6) ? 1 : 0)) {
                        }
                        iArr7 = new int[llIIIlIIIl[0]];
                        iArr7[llIIIlIIIl[1]] = llIIIlIIIl[17];
                        if (lIlIIlIlIIlll(Bank.contains(iArr7) ? 1 : 0)) {
                        }
                        bv.add(new C0017d(llIIIlIIIl[17], llIIIlIIIl[36], llIIIlIIIl[185]));
                        "".length();
                    }
                    bv.add(new C0017d(llIIIlIIIl[11], llIIIlIIIl[12], llIIIlIIIl[8]));
                    "".length();
                    if (lIlIIlIlIlIIl(Bank.contains(item2 -> {
                        return item2.getName().toLowerCase().contains(llIIIlIIII[llIIIlIIIl[187]]);
                    }) ? 1 : 0)) {
                    }
                    iArr4 = new int[llIIIlIIIl[0]];
                    iArr4[llIIIlIIIl[1]] = llIIIlIIIl[13];
                    if (lIlIIlIlIIlll(Bank.contains(iArr4) ? 1 : 0)) {
                    }
                    bv.add(new C0017d(llIIIlIIIl[13], llIIIlIIIl[6], C0023j.cf));
                    "".length();
                    iArr5 = new int[llIIIlIIIl[0]];
                    iArr5[llIIIlIIIl[1]] = llIIIlIIIl[14];
                    if (lIlIIlIlIIlll(Bank.contains(iArr5) ? 1 : 0)) {
                    }
                    iArr6 = new int[llIIIlIIIl[0]];
                    iArr6[llIIIlIIIl[1]] = llIIIlIIIl[14];
                    if (lIlIIlIlIlIIl(Bank.contains(iArr6) ? 1 : 0)) {
                    }
                    iArr7 = new int[llIIIlIIIl[0]];
                    iArr7[llIIIlIIIl[1]] = llIIIlIIIl[17];
                    if (lIlIIlIlIIlll(Bank.contains(iArr7) ? 1 : 0)) {
                    }
                    bv.add(new C0017d(llIIIlIIIl[17], llIIIlIIIl[36], llIIIlIIIl[185]));
                    "".length();
                }
                bv.add(new C0017d(llIIIlIIIl[9], llIIIlIIIl[10], llIIIlIIIl[25]));
                "".length();
                iArr3 = new int[llIIIlIIIl[0]];
                iArr3[llIIIlIIIl[1]] = llIIIlIIIl[11];
                if (lIlIIlIlIIlll(Bank.contains(iArr3) ? 1 : 0)) {
                }
                bv.add(new C0017d(llIIIlIIIl[11], llIIIlIIIl[12], llIIIlIIIl[8]));
                "".length();
                if (lIlIIlIlIlIIl(Bank.contains(item22 -> {
                    return item22.getName().toLowerCase().contains(llIIIlIIII[llIIIlIIIl[187]]);
                }) ? 1 : 0)) {
                }
                iArr4 = new int[llIIIlIIIl[0]];
                iArr4[llIIIlIIIl[1]] = llIIIlIIIl[13];
                if (lIlIIlIlIIlll(Bank.contains(iArr4) ? 1 : 0)) {
                }
                bv.add(new C0017d(llIIIlIIIl[13], llIIIlIIIl[6], C0023j.cf));
                "".length();
                iArr5 = new int[llIIIlIIIl[0]];
                iArr5[llIIIlIIIl[1]] = llIIIlIIIl[14];
                if (lIlIIlIlIIlll(Bank.contains(iArr5) ? 1 : 0)) {
                }
                iArr6 = new int[llIIIlIIIl[0]];
                iArr6[llIIIlIIIl[1]] = llIIIlIIIl[14];
                if (lIlIIlIlIlIIl(Bank.contains(iArr6) ? 1 : 0)) {
                }
                iArr7 = new int[llIIIlIIIl[0]];
                iArr7[llIIIlIIIl[1]] = llIIIlIIIl[17];
                if (lIlIIlIlIIlll(Bank.contains(iArr7) ? 1 : 0)) {
                }
                bv.add(new C0017d(llIIIlIIIl[17], llIIIlIIIl[36], llIIIlIIIl[185]));
                "".length();
            }
            bv.add(new C0017d(llIIIlIIIl[7], llIIIlIIIl[181], llIIIlIIIl[25]));
            "".length();
            iArr2 = new int[llIIIlIIIl[0]];
            iArr2[llIIIlIIIl[1]] = llIIIlIIIl[9];
            if (lIlIIlIlIIlll(Bank.contains(iArr2) ? 1 : 0)) {
            }
            bv.add(new C0017d(llIIIlIIIl[9], llIIIlIIIl[10], llIIIlIIIl[25]));
            "".length();
            iArr3 = new int[llIIIlIIIl[0]];
            iArr3[llIIIlIIIl[1]] = llIIIlIIIl[11];
            if (lIlIIlIlIIlll(Bank.contains(iArr3) ? 1 : 0)) {
            }
            bv.add(new C0017d(llIIIlIIIl[11], llIIIlIIIl[12], llIIIlIIIl[8]));
            "".length();
            if (lIlIIlIlIlIIl(Bank.contains(item222 -> {
                return item222.getName().toLowerCase().contains(llIIIlIIII[llIIIlIIIl[187]]);
            }) ? 1 : 0)) {
            }
            iArr4 = new int[llIIIlIIIl[0]];
            iArr4[llIIIlIIIl[1]] = llIIIlIIIl[13];
            if (lIlIIlIlIIlll(Bank.contains(iArr4) ? 1 : 0)) {
            }
            bv.add(new C0017d(llIIIlIIIl[13], llIIIlIIIl[6], C0023j.cf));
            "".length();
            iArr5 = new int[llIIIlIIIl[0]];
            iArr5[llIIIlIIIl[1]] = llIIIlIIIl[14];
            if (lIlIIlIlIIlll(Bank.contains(iArr5) ? 1 : 0)) {
            }
            iArr6 = new int[llIIIlIIIl[0]];
            iArr6[llIIIlIIIl[1]] = llIIIlIIIl[14];
            if (lIlIIlIlIlIIl(Bank.contains(iArr6) ? 1 : 0)) {
            }
            iArr7 = new int[llIIIlIIIl[0]];
            iArr7[llIIIlIIIl[1]] = llIIIlIIIl[17];
            if (lIlIIlIlIIlll(Bank.contains(iArr7) ? 1 : 0)) {
            }
            bv.add(new C0017d(llIIIlIIIl[17], llIIIlIIIl[36], llIIIlIIIl[185]));
            "".length();
        }
        bv.add(new C0017d(llIIIlIIIl[15], llIIIlIIIl[16], C0018e.c(llIIIlIIIl[180], llIIIlIIIl[20])));
        "".length();
        iArr = new int[llIIIlIIIl[0]];
        iArr[llIIIlIIIl[1]] = llIIIlIIIl[7];
        if (lIlIIlIlIIlll(Bank.contains(iArr) ? 1 : 0)) {
        }
        bv.add(new C0017d(llIIIlIIIl[7], llIIIlIIIl[181], llIIIlIIIl[25]));
        "".length();
        iArr2 = new int[llIIIlIIIl[0]];
        iArr2[llIIIlIIIl[1]] = llIIIlIIIl[9];
        if (lIlIIlIlIIlll(Bank.contains(iArr2) ? 1 : 0)) {
        }
        bv.add(new C0017d(llIIIlIIIl[9], llIIIlIIIl[10], llIIIlIIIl[25]));
        "".length();
        iArr3 = new int[llIIIlIIIl[0]];
        iArr3[llIIIlIIIl[1]] = llIIIlIIIl[11];
        if (lIlIIlIlIIlll(Bank.contains(iArr3) ? 1 : 0)) {
        }
        bv.add(new C0017d(llIIIlIIIl[11], llIIIlIIIl[12], llIIIlIIIl[8]));
        "".length();
        if (lIlIIlIlIlIIl(Bank.contains(item2222 -> {
            return item2222.getName().toLowerCase().contains(llIIIlIIII[llIIIlIIIl[187]]);
        }) ? 1 : 0)) {
        }
        iArr4 = new int[llIIIlIIIl[0]];
        iArr4[llIIIlIIIl[1]] = llIIIlIIIl[13];
        if (lIlIIlIlIIlll(Bank.contains(iArr4) ? 1 : 0)) {
        }
        bv.add(new C0017d(llIIIlIIIl[13], llIIIlIIIl[6], C0023j.cf));
        "".length();
        iArr5 = new int[llIIIlIIIl[0]];
        iArr5[llIIIlIIIl[1]] = llIIIlIIIl[14];
        if (lIlIIlIlIIlll(Bank.contains(iArr5) ? 1 : 0)) {
        }
        iArr6 = new int[llIIIlIIIl[0]];
        iArr6[llIIIlIIIl[1]] = llIIIlIIIl[14];
        if (lIlIIlIlIlIIl(Bank.contains(iArr6) ? 1 : 0)) {
        }
        iArr7 = new int[llIIIlIIIl[0]];
        iArr7[llIIIlIIIl[1]] = llIIIlIIIl[17];
        if (lIlIIlIlIIlll(Bank.contains(iArr7) ? 1 : 0)) {
        }
        bv.add(new C0017d(llIIIlIIIl[17], llIIIlIIIl[36], llIIIlIIIl[185]));
        "".length();
    }

    private static void lIlIIlIlIIlIl() {
        llIIIlIIII = new String[llIIIlIIIl[213]];
        llIIIlIIII[llIIIlIIIl[1]] = lIlIIlIIlIlll("KCABOzQGLAtyJRswBjwgTiAbNyodZU8hMAc9DDouAC5PMCYNIk8mKE44Gjc0Gg==", "nIoRG");
        llIIIlIIII[llIIIlIIIl[0]] = lIlIIlIIlIlll("ZXobFhskMy4I", "HZZqr");
        llIIIlIIII[llIIIlIIIl[3]] = lIlIIlIIllIII("XMhiRYAU3MI=", "haBJr");
        llIIIlIIII[llIIIlIIIl[4]] = lIlIIlIIllIIl("z0WK5kdFlS2pwEscTKdlng==", "pyMov");
        llIIIlIIII[llIIIlIIIl[6]] = lIlIIlIIllIII("Bj/3PhaZlLFd33IRFWyRCDZBuN9at0pQ", "QboPt");
        llIIIlIIII[llIIIlIIIl[12]] = lIlIIlIIlIlll("JDxUDicWeRkGJgAwGgh1AiwRHCFTKgEfJR8wERx5UyoDBiEQMR0BMlMtG08XJgA9IRI=", "sYtoU");
        llIIIlIIII[llIIIlIIIl[19]] = lIlIIlIIllIII("M/A3h353zu/Dt0qDmmuinIwsl6jZb8rsTiV5sFVGypDPu5dxO9RCjmL+cozoZKsHI6GctWdqFF8=", "SQsYK");
        llIIIlIIII[llIIIlIIIl[23]] = lIlIIlIIllIIl("43SjrL6n6Jo=", "pnhkY");
        llIIIlIIII[llIIIlIIIl[25]] = lIlIIlIIlIlll("KyAj", "nAWZb");
        llIIIlIIII[llIIIlIIIl[27]] = lIlIIlIIlIlll("PSkyRh8caDcSCgE8", "sHDfk");
        llIIIlIIII[llIIIlIIIl[16]] = lIlIIlIIllIII("AhtNSA7YlJJsq9l/Q+8eOI5NLBmsUJ5e", "OJHSX");
        llIIIlIIII[llIIIlIIIl[29]] = lIlIIlIIllIII("bAYfKuVKQo8Z09iN3e2wq0Tlm8WjZQax", "CFyQX");
        llIIIlIIII[llIIIlIIIl[24]] = lIlIIlIIllIII("2BvgE4jp8lCR/G4kiAvm3yQkLrY4RYXN", "pZZEe");
        llIIIlIIII[llIIIlIIIl[30]] = lIlIIlIIllIII("mGgXuiOWy1Gaiyotd/CjdQ==", "ZdbUS");
        llIIIlIIII[llIIIlIIIl[31]] = lIlIIlIIllIII("VDE5tdNoZoXRvCYetFKIJNi/cEm1P1/R", "PEWvq");
        llIIIlIIII[llIIIlIIIl[26]] = lIlIIlIIllIIl("wFyRHEG21QBMB+6eLoyt0Q==", "yGPBV");
        llIIIlIIII[llIIIlIIIl[32]] = lIlIIlIIllIIl("sgnQiR69QWE=", "vkXzj");
        llIIIlIIII[llIIIlIIIl[37]] = lIlIIlIIllIIl("eNw2cxwE8yUfqlyuKykKi2FTfWhl6zIR", "uDBBM");
        llIIIlIIII[llIIIlIIIl[39]] = lIlIIlIIllIIl("/5KvRVddpuGeie3uHDIAPA==", "AteHi");
        llIIIlIIII[llIIIlIIIl[40]] = lIlIIlIIllIII("dIrS34sw0TE=", "QNMFW");
        llIIIlIIII[llIIIlIIIl[28]] = lIlIIlIIlIlll("LxQGLSYA", "hxiXA");
        llIIIlIIII[llIIIlIIIl[41]] = lIlIIlIIllIIl("FMi3Vq0aIyTfKEMbuHfA2A==", "CzehG");
        llIIIlIIII[llIIIlIIIl[42]] = lIlIIlIIllIIl("S1ogbhcq8TcEzfonc7H4lDbRgEa/YgDB", "TVGQc");
        llIIIlIIII[llIIIlIIIl[43]] = lIlIIlIIlIlll("PQYfbw4cRwonGwELACo=", "sgiOz");
        llIIIlIIII[llIIIlIIIl[44]] = lIlIIlIIllIIl("mIGhnP+sKJU=", "VEBTx");
        llIIIlIIII[llIIIlIIIl[2]] = lIlIIlIIllIII("8kukIVxDrlOgwkaISpZiNA==", "fWNlK");
        llIIIlIIII[llIIIlIIIl[46]] = lIlIIlIIllIIl("0Ha2LjX1jNc=", "fuFDp");
        llIIIlIIII[llIIIlIIIl[47]] = lIlIIlIIllIIl("wfMqLPoKszc=", "bHLAU");
        llIIIlIIII[llIIIlIIIl[48]] = lIlIIlIIllIIl("TQkgBiyXQXxlOULX+LFX0Q==", "xMOQs");
        llIIIlIIII[llIIIlIIIl[49]] = lIlIIlIIlIlll("MCAwJxILZTIgAQEkPicV", "cEQUq");
        llIIIlIIII[llIIIlIIIl[38]] = lIlIIlIIlIlll("LgAyIygMByY=", "muBAG");
        llIIIlIIII[llIIIlIIIl[50]] = lIlIIlIIllIIl("F3dakv5r+hA=", "qjIRb");
        llIIIlIIII[llIIIlIIIl[51]] = lIlIIlIIlIlll("Oj83AAQYOCM=", "yJGbk");
        llIIIlIIII[llIIIlIIIl[52]] = lIlIIlIIlIlll("KQMrCg==", "fsNds");
        llIIIlIIII[llIIIlIIIl[53]] = lIlIIlIIllIII("PJ09uLweNb4mrKrmYiXS8A==", "mtmRe");
        llIIIlIIII[llIIIlIIIl[54]] = lIlIIlIIllIIl("LxQ9S9zge9Y=", "SeUEg");
        llIIIlIIII[llIIIlIIIl[55]] = lIlIIlIIllIIl("xKNv74a6wNZ7Lui4jgKUqA==", "BXIoy");
        llIIIlIIII[llIIIlIIIl[56]] = lIlIIlIIllIIl("I2Q5Gj/gN0I=", "aMxIL");
        llIIIlIIII[llIIIlIIIl[58]] = lIlIIlIIllIII("tjyPROmTKaY=", "DOlLj");
        llIIIlIIII[llIIIlIIIl[59]] = lIlIIlIIllIII("qGQjdLavskU=", "qQiik");
        llIIIlIIII[llIIIlIIIl[36]] = lIlIIlIIllIII("bvlJ8iQajrU=", "ZgkHD");
        llIIIlIIII[llIIIlIIIl[63]] = lIlIIlIIllIIl("rIcSH1XQkoutcZscQHJlDg==", "ueDac");
        llIIIlIIII[llIIIlIIIl[64]] = lIlIIlIIllIII("UYjUvZoQ51JJ8UK/aDfHuw==", "ufLNo");
        llIIIlIIII[llIIIlIIIl[66]] = lIlIIlIIllIIl("8kY5/yKJFjY4mQ2GKX4NVw==", "qiltY");
        llIIIlIIII[llIIIlIIIl[67]] = lIlIIlIIlIlll("HzASCA==", "XQfmV");
        llIIIlIIII[llIIIlIIIl[68]] = lIlIIlIIllIIl("bGfqCuuq9sY=", "PFqvM");
        llIIIlIIII[llIIIlIIIl[69]] = lIlIIlIIllIII("gXNEmluNpx5gv0MtMx7IaA==", "xCnuD");
        llIIIlIIII[llIIIlIIIl[70]] = lIlIIlIIlIlll("KT0UEiUOPA==", "oRfwH");
        llIIIlIIII[llIIIlIIIl[71]] = lIlIIlIIllIIl("xrxvWKg6LNc=", "iEZZs");
        llIIIlIIII[llIIIlIIIl[73]] = lIlIIlIIllIII("nizXGG5gNb3tS6WvOe4IWQ==", "DzYDZ");
        llIIIlIIII[llIIIlIIIl[22]] = lIlIIlIIllIII("v+7etLs3Ci5m5GBWAMZfjg==", "Msptj");
        llIIIlIIII[llIIIlIIIl[74]] = lIlIIlIIllIIl("fnvlQDXn3mw=", "qhYIn");
        llIIIlIIII[llIIIlIIIl[75]] = lIlIIlIIllIIl("Ja63efjNkh44spTIYYo0TQ==", "JjwNA");
        llIIIlIIII[llIIIlIIIl[76]] = lIlIIlIIlIlll("FzsMaR42ehkhCys2Eyw=", "YZzIj");
        llIIIlIIII[llIIIlIIIl[77]] = lIlIIlIIllIIl("C7o9CMjydxA=", "vZRYm");
        llIIIlIIII[llIIIlIIIl[78]] = lIlIIlIIlIlll("CxQrIAk1", "GuODl");
        llIIIlIIII[llIIIlIIIl[79]] = lIlIIlIIllIIl("fIpaSCrO1fM=", "ANqIB");
        llIIIlIIII[llIIIlIIIl[80]] = lIlIIlIIlIlll("FSM5Dwl7OiA=", "VOPbk");
        llIIIlIIII[llIIIlIIIl[81]] = lIlIIlIIllIII("UIMvhOK9Kak=", "xmICW");
        llIIIlIIII[llIIIlIIIl[83]] = lIlIIlIIllIII("X+AmzAnrLnkNJioMnrpA/A==", "WKtBl");
        llIIIlIIII[llIIIlIIIl[45]] = lIlIIlIIllIIl("NwsyNnk4hf0WY4R1tnM17g==", "DLKyL");
        llIIIlIIII[llIIIlIIIl[84]] = lIlIIlIIllIII("2nlu15t/4uw=", "UfrBN");
        llIIIlIIII[llIIIlIIIl[85]] = lIlIIlIIllIIl("gHDFRvDUUmGeNniyTVlOBQ==", "wLNLl");
        llIIIlIIII[llIIIlIIIl[88]] = lIlIIlIIllIIl("zu56DzasAuM=", "UwGbJ");
        llIIIlIIII[llIIIlIIIl[89]] = lIlIIlIIllIII("EVdaJ6TmTP9gzfx3yVEBKg==", "zRbCi");
        llIIIlIIII[llIIIlIIIl[90]] = lIlIIlIIllIII("U3q22rgHSCk8ot35CRpaAw==", "bMNnl");
        llIIIlIIII[llIIIlIIIl[91]] = lIlIIlIIllIIl("g64T16RZLJTbz65i0s/eDw==", "wpnej");
        llIIIlIIII[llIIIlIIIl[92]] = lIlIIlIIllIII("aesI/XTCXxYG+myIq4Dx7w==", "WgIoL");
        llIIIlIIII[llIIIlIIIl[93]] = lIlIIlIIllIII("ZZieW4t12G+aotDBOGBfbA==", "zcwou");
        llIIIlIIII[llIIIlIIIl[95]] = lIlIIlIIllIIl("zmt2xyc00tvysp6qbv09cQ==", "GBUSQ");
        llIIIlIIII[llIIIlIIIl[57]] = lIlIIlIIllIIl("MsECFo/aUcdtTS6U6x9uXg==", "QUrhv");
        llIIIlIIII[llIIIlIIIl[96]] = lIlIIlIIllIIl("8pbwNZay6UUtGWprdhczSQ==", "vPSPV");
        llIIIlIIII[llIIIlIIIl[97]] = lIlIIlIIlIlll("JxspARYAVyUaFhcD", "dwFrs");
        llIIIlIIII[llIIIlIIIl[98]] = lIlIIlIIllIIl("1K7ehpmRBR76wXK3jwCnFA==", "NQkFV");
        llIIIlIIII[llIIIlIIIl[99]] = lIlIIlIIllIIl("+msixraYt7Pe/Cztjdf+XQ==", "Qamxa");
        llIIIlIIII[llIIIlIIIl[101]] = lIlIIlIIllIII("6TJTMR5f3B6mcz3tRNrvcQ==", "NfeJl");
        llIIIlIIII[llIIIlIIIl[102]] = lIlIIlIIllIIl("HofWu6rjxK+KU/1IDFRS7Cz+MMhqMmD/", "LIbfk");
        llIIIlIIII[llIIIlIIIl[104]] = lIlIIlIIllIII("e0JGVms3xBADLZrf0C0Igd/qyuNVH9Tm", "XYpsI");
        llIIIlIIII[llIIIlIIIl[105]] = lIlIIlIIlIlll("BTcNOCc4P0E+OywiDSs=", "VXaNN");
        llIIIlIIII[llIIIlIIIl[115]] = lIlIIlIIllIII("lpHJZmEa/78=", "PRjzy");
        llIIIlIIII[llIIIlIIIl[62]] = lIlIIlIIllIII("oKOWriaskxbp2wKKt6qutg==", "gdPMG");
        llIIIlIIII[llIIIlIIIl[116]] = lIlIIlIIllIII("fTaQbJ7SJ6AeiVb+UV12nw==", "iqVBj");
        llIIIlIIII[llIIIlIIIl[117]] = lIlIIlIIlIlll("MgkmGjFQASIUNR4=", "peGyZ");
        llIIIlIIII[llIIIlIIIl[120]] = lIlIIlIIllIIl("kGMViMoF2y8=", "QLTDZ");
        llIIIlIIII[llIIIlIIIl[121]] = lIlIIlIIllIII("HcKbdwqYVm+LH+QKaoO4uw==", "RNjTl");
        llIIIlIIII[llIIIlIIIl[122]] = lIlIIlIIllIIl("AECqMm39zHg=", "aPyjJ");
        llIIIlIIII[llIIIlIIIl[124]] = lIlIIlIIlIlll("IwwUTD8CTQkFJQpNFwIvCB8FHiQYAwY=", "mmblK");
        llIIIlIIII[llIIIlIIIl[125]] = lIlIIlIIllIIl("NFyHi+lk7/Lu216JcWKcsqWx+L2vkkjW", "uMDbu");
        llIIIlIIII[llIIIlIIIl[126]] = lIlIIlIIlIlll("PQ0kBSsQDWcYKhoH", "ylGjE");
        llIIIlIIII[llIIIlIIIl[127]] = lIlIIlIIllIII("byeI3hMOgbH0ebOXRapx7w==", "JSljV");
        llIIIlIIII[llIIIlIIIl[72]] = lIlIIlIIllIII("Q092L+iIZSBgtAATK5I9HA==", "buCEN");
        llIIIlIIII[llIIIlIIIl[128]] = lIlIIlIIllIII("BqioIpl3EbM4YrZwt7ywt6ouWmNsQDBu", "pKODC");
        llIIIlIIII[llIIIlIIIl[129]] = lIlIIlIIllIIl("4FDpQKCuQFalnUwtzGd6dnjD1/o4TREu", "SquZl");
        llIIIlIIII[llIIIlIIIl[132]] = lIlIIlIIlIlll("HAQ/OQ==", "NkPMh");
        llIIIlIIII[llIIIlIIIl[133]] = lIlIIlIIllIII("Zz4mpIYwsg8=", "DWwwv");
        llIIIlIIII[llIIIlIIIl[135]] = lIlIIlIIllIIl("L2H2zerxUrw=", "ZsOqL");
        llIIIlIIII[llIIIlIIIl[136]] = lIlIIlIIlIlll("JA4oASQf", "wkIsG");
        llIIIlIIII[llIIIlIIIl[138]] = lIlIIlIIlIlll("GT8LBQ==", "KPdqF");
        llIIIlIIII[llIIIlIIIl[139]] = lIlIIlIIllIIl("ej6n+KUn3Pc=", "KiZjD");
        llIIIlIIII[llIIIlIIIl[141]] = lIlIIlIIllIIl("887+1qndhxg=", "zKStQ");
        llIIIlIIII[llIIIlIIIl[82]] = lIlIIlIIlIlll("Ni0kHyQN", "eHEmG");
        llIIIlIIII[llIIIlIIIl[144]] = lIlIIlIIllIIl("oTD0eH8X5cs=", "Qwmfo");
        llIIIlIIII[llIIIlIIIl[145]] = lIlIIlIIlIlll("NwEMHxUM", "ddmmv");
        llIIIlIIII[llIIIlIIIl[147]] = lIlIIlIIlIlll("NCgkJQ==", "fGKQW");
        llIIIlIIII[llIIIlIIIl[148]] = lIlIIlIIllIII("XflWnFe9PyY=", "njfHB");
        llIIIlIIII[llIIIlIIIl[151]] = lIlIIlIIllIIl("kzJqOtH32m0=", "oRPOK");
        llIIIlIIII[llIIIlIIIl[152]] = lIlIIlIIllIII("yTHPtcATr3w=", "KbtOT");
        llIIIlIIII[llIIIlIIIl[155]] = lIlIIlIIlIlll("FTYtBQ==", "GYBqg");
        llIIIlIIII[llIIIlIIIl[156]] = lIlIIlIIllIIl("LBkKZXkU+eU=", "RHTdR");
        llIIIlIIII[llIIIlIIIl[159]] = lIlIIlIIllIIl("W4OHibvNl+Y=", "qDguY");
        llIIIlIIII[llIIIlIIIl[100]] = lIlIIlIIlIlll("GAgHFS8j", "KmfgL");
        llIIIlIIII[llIIIlIIIl[162]] = lIlIIlIIllIII("JSq3O2zqxFM=", "vOYjK");
        llIIIlIIII[llIIIlIIIl[163]] = lIlIIlIIllIIl("QpoSrweyvyk=", "VfDCi");
        llIIIlIIII[llIIIlIIIl[165]] = lIlIIlIIllIII("gfoU9b+HhoQ=", "BUuar");
        llIIIlIIII[llIIIlIIIl[166]] = lIlIIlIIllIII("VmnjxNRNLek=", "ozWdw");
        llIIIlIIII[llIIIlIIIl[168]] = lIlIIlIIllIIl("a466vbkqg6Y=", "Fqwga");
        llIIIlIIII[llIIIlIIIl[169]] = lIlIIlIIlIlll("KwwoJjEQ", "xiITR");
        llIIIlIIII[llIIIlIIIl[171]] = lIlIIlIIllIIl("lQqV/+4CmL8=", "IVtfL");
        llIIIlIIII[llIIIlIIIl[172]] = lIlIIlIIllIII("XGKZvKOtZHs=", "HMUfW");
        llIIIlIIII[llIIIlIIIl[174]] = lIlIIlIIllIIl("vlGCFs2+05g=", "BppTF");
        llIIIlIIII[llIIIlIIIl[103]] = lIlIIlIIllIII("WBKNHU7UXD4=", "tyTZt");
        llIIIlIIII[llIIIlIIIl[177]] = lIlIIlIIllIII("tDiSYYw15PY=", "LYGfI");
        llIIIlIIII[llIIIlIIIl[178]] = lIlIIlIIlIlll("NS4CKCkO", "fKcZJ");
        llIIIlIIII[llIIIlIIIl[179]] = lIlIIlIIlIlll("CjcNGx4nN04GHy09", "NVntp");
        llIIIlIIII[llIIIlIIIl[187]] = lIlIIlIIllIIl("GlTqkQLGM60fwD21aGJ7aCh59D/gG/x/", "JaUFe");
        llIIIlIIII[llIIIlIIIl[200]] = lIlIIlIIllIIl("7t6tcp306Cs=", "bpmBa");
        llIIIlIIII[llIIIlIIIl[201]] = lIlIIlIIlIlll("ECIHbxosKB9vHiY/ACYMLWFSOAEoOVU8STw9TQ==", "IMrOi");
        llIIIlIIII[llIIIlIIIl[202]] = lIlIIlIIllIIl("c1X9eEIFRpJhhcB+Xzl14w==", "UaQCM");
        llIIIlIIII[llIIIlIIIl[203]] = lIlIIlIIllIII("OCfqUYfhRJ81/PyWUa+MBZdT3KqlYBogt8ARoLeFiXm31xLnzkBfew==", "aeMmK");
        llIIIlIIII[llIIIlIIIl[204]] = lIlIIlIIllIIl("06VWu/dRVxikwDFkUqtJYFA+s8tClnwpm5rH2L3rNeY=", "AnuTm");
        llIIIlIIII[llIIIlIIIl[114]] = lIlIIlIIllIIl("rEjOb/BVTpk5lJIyeSJCGn2TpFZphbNTrkoAnClo/2wAMTqVCW4JIg==", "cYDpl");
        llIIIlIIII[llIIIlIIIl[205]] = lIlIIlIIllIIl("jILUUnJz0dGPXZFCp9q5L3LpNGQp+8iL", "dagwP");
        llIIIlIIII[llIIIlIIIl[206]] = lIlIIlIIlIlll("LhMnB0EXF2wWDlo5LRAAFxgtQhEWFy0RBFs=", "zrLba");
        llIIIlIIII[llIIIlIIIl[207]] = lIlIIlIIllIII("2lXfhXDasILrXEn7QofqIg==", "nSknt");
        llIIIlIIII[llIIIlIIIl[208]] = lIlIIlIIllIII("LjHeRhplKX0=", "gmGSp");
        llIIIlIIII[llIIIlIIIl[209]] = lIlIIlIIlIlll("Kx5N", "gkckM");
        llIIIlIIII[llIIIlIIIl[210]] = lIlIIlIIlIlll("KwsoVg==", "fbFxX");
        llIIIlIIII[llIIIlIIIl[211]] = lIlIIlIIlIlll("K1cdOhQSGB0qRBEYQA==", "bwnOd");
        llIIIlIIII[llIIIlIIIl[212]] = lIlIIlIIlIlll("", "afaRE");
    }

    private static boolean lIlIIlIlIlllI(int i, int i2) {
        return i <= i2;
    }

    private static String lIlIIlIIlIlll(String llllllllllllllllllIlIlllllIlIlIl, String llllllllllllllllllIlIlllllIlIlII) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllllllIlIlllllIlIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] llllllllllllllllllIlIlllllIlIIlI = llllllllllllllllllIlIlllllIlIlII.toCharArray();
        int llllllllllllllllllIlIlllllIlIIIl = llIIIlIIIl[1];
        char[] charArray = str.toCharArray();
        int llllllllllllllllllIlIlllllIIlIlI = charArray.length;
        int i = llIIIlIIIl[1];
        while (lIlIIlIlIlIII(i, llllllllllllllllllIlIlllllIIlIlI)) {
            char llllllllllllllllllIlIlllllIlIllI = charArray[i];
            sb.append((char) (llllllllllllllllllIlIlllllIlIllI ^ llllllllllllllllllIlIlllllIlIIlI[llllllllllllllllllIlIlllllIlIIIl % llllllllllllllllllIlIlllllIlIIlI.length]));
            "".length();
            llllllllllllllllllIlIlllllIlIIIl++;
            i++;
            "".length();
            if ((true ^ true) & ((true ^ true) ^ true)) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean lIlIIlIlIlIIl(int i) {
        return i == 0;
    }

    private static boolean lIlIIlIlIIlll(int i) {
        return i != 0;
    }

    private static boolean lIlIIlIlIlIII(int i, int i2) {
        return i < i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:169:0x09e9, code lost:
        if (lIlIIlIlIlIll(net.unethicalite.api.entities.NPCs.getNearest(r0)) != false) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x01ca, code lost:
        if (lIlIIlIlIlIlI(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.C.llIIIlIIIl[8]) != false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x020d, code lost:
        if (lIlIIlIlIlIlI(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.C.llIIIlIIIl[10]) != false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0250, code lost:
        if (lIlIIlIlIlIlI(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.C.llIIIlIIIl[12]) != false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0293, code lost:
        if (lIlIIlIlIlIlI(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.C.llIIIlIIIl[6]) != false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x02d6, code lost:
        if (lIlIIlIlIlIlI(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.C.llIIIlIIIl[6]) != false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0319, code lost:
        if (lIlIIlIlIlIII(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.C.llIIIlIIIl[16]) != false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x031c, code lost:
        Q();
        java.lang.System.out.println(o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.C.llIIIlIIII[o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.C.llIIIlIIIl[12]]);
        o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.C.bt = o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.C.llIIIlIIIl[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0337, code lost:
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1012, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v1045, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v1083, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void bA() {
        if (lIlIIlIlIIlll(bt ? 1 : 0)) {
            C0015b.a(bv);
            if (lIlIIlIlIlIII(bv.size(), llIIIlIIIl[0])) {
                System.out.println(llIIIlIIII[llIIIlIIIl[1]]);
                bt = llIIIlIIIl[1];
            }
        }
        if (lIlIIlIlIlIIl(bt ? 1 : 0)) {
            if (lIlIIlIlIlIII(Skills.getLevel(Skill.AGILITY), llIIIlIIIl[2])) {
                da = llIIIlIIII[llIIIlIIIl[0]];
                av.eA();
            }
            if (lIlIIlIlIlIIl(an() ? 1 : 0) && lIlIIlIlIlIII(C0018e.j(eG), llIIIlIIIl[0]) && lIlIIlIlIlIlI(Skills.getLevel(Skill.AGILITY), llIIIlIIIl[2])) {
                da = llIIIlIIII[llIIIlIIIl[3]];
                BankLocation nearest = BankLocation.getNearest();
                if (lIlIIlIlIlIll(nearest) && lIlIIlIlIlIIl(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderSotf.c = llIIIlIIII[llIIIlIIIl[4]];
                    C0000a.a(nearest);
                }
                if (lIlIIlIlIlIll(nearest) && lIlIIlIlIIlll(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (lIlIIlIlIlIIl(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, llIIIlIIIl[5]);
                        "".length();
                    }
                    if (lIlIIlIlIIlll(Bank.isOpen() ? 1 : 0)) {
                        AccBuilderSotf.c = llIIIlIIII[llIIIlIIIl[6]];
                        if (lIlIIlIlIllII(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(llIIIlIIIl[6]);
                            "".length();
                        }
                        if (lIlIIlIlIllII(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks(llIIIlIIIl[3]);
                            "".length();
                        }
                        while (lIlIIlIlIlIIl(I.co() ? 1 : 0)) {
                            I.cm();
                            Time.sleepTicks(llIIIlIIIl[0]);
                            "".length();
                            "".length();
                            if ((-" ".length()) > " ".length()) {
                                return;
                            }
                        }
                        int[] iArr = new int[llIIIlIIIl[0]];
                        iArr[llIIIlIIIl[1]] = llIIIlIIIl[7];
                        if (lIlIIlIlIIlll(Bank.contains(iArr) ? 1 : 0)) {
                            int[] iArr2 = new int[llIIIlIIIl[0]];
                            iArr2[llIIIlIIIl[1]] = llIIIlIIIl[7];
                        }
                        int[] iArr3 = new int[llIIIlIIIl[0]];
                        iArr3[llIIIlIIIl[1]] = llIIIlIIIl[9];
                        if (lIlIIlIlIIlll(Bank.contains(iArr3) ? 1 : 0)) {
                            int[] iArr4 = new int[llIIIlIIIl[0]];
                            iArr4[llIIIlIIIl[1]] = llIIIlIIIl[9];
                        }
                        int[] iArr5 = new int[llIIIlIIIl[0]];
                        iArr5[llIIIlIIIl[1]] = llIIIlIIIl[11];
                        if (lIlIIlIlIIlll(Bank.contains(iArr5) ? 1 : 0)) {
                            int[] iArr6 = new int[llIIIlIIIl[0]];
                            iArr6[llIIIlIIIl[1]] = llIIIlIIIl[11];
                        }
                        int[] iArr7 = new int[llIIIlIIIl[0]];
                        iArr7[llIIIlIIIl[1]] = llIIIlIIIl[13];
                        if (lIlIIlIlIIlll(Bank.contains(iArr7) ? 1 : 0)) {
                            int[] iArr8 = new int[llIIIlIIIl[0]];
                            iArr8[llIIIlIIIl[1]] = llIIIlIIIl[13];
                        }
                        int[] iArr9 = new int[llIIIlIIIl[0]];
                        iArr9[llIIIlIIIl[1]] = llIIIlIIIl[14];
                        if (lIlIIlIlIIlll(Bank.contains(iArr9) ? 1 : 0)) {
                            int[] iArr10 = new int[llIIIlIIIl[0]];
                            iArr10[llIIIlIIIl[1]] = llIIIlIIIl[14];
                        }
                        int[] iArr11 = new int[llIIIlIIIl[0]];
                        iArr11[llIIIlIIIl[1]] = llIIIlIIIl[15];
                        if (lIlIIlIlIIlll(Bank.contains(iArr11) ? 1 : 0)) {
                            int[] iArr12 = new int[llIIIlIIIl[0]];
                            iArr12[llIIIlIIIl[1]] = llIIIlIIIl[15];
                        }
                        int[] iArr13 = new int[llIIIlIIIl[6]];
                        iArr13[llIIIlIIIl[1]] = llIIIlIIIl[17];
                        iArr13[llIIIlIIIl[0]] = llIIIlIIIl[11];
                        iArr13[llIIIlIIIl[3]] = llIIIlIIIl[13];
                        iArr13[llIIIlIIIl[4]] = llIIIlIIIl[18];
                        if (lIlIIlIlIlIIl(C0018e.c(iArr13) ? 1 : 0)) {
                            Q();
                            System.out.println(llIIIlIIII[llIIIlIIIl[19]]);
                            bt = llIIIlIIIl[0];
                            return;
                        }
                        if (lIlIIlIlIlIIl(Bank.isOpen() ? 1 : 0)) {
                            C0000a.a();
                            Time.sleepTicks(llIIIlIIIl[19]);
                            "".length();
                        }
                        int[] iArr14 = new int[llIIIlIIIl[6]];
                        iArr14[llIIIlIIIl[1]] = llIIIlIIIl[17];
                        iArr14[llIIIlIIIl[0]] = llIIIlIIIl[11];
                        iArr14[llIIIlIIIl[3]] = llIIIlIIIl[13];
                        iArr14[llIIIlIIIl[4]] = llIIIlIIIl[18];
                        if (lIlIIlIlIIlll(C0018e.c(iArr14) ? 1 : 0)) {
                            C0000a.a(llIIIlIIIl[17], llIIIlIIIl[16]);
                            C0000a.a(llIIIlIIIl[13], llIIIlIIIl[4]);
                            Bank.withdraw(llIIIlIIIl[18], llIIIlIIIl[5], Bank.WithdrawMode.ITEM);
                            Bank.withdraw(llIIIlIIIl[11], llIIIlIIIl[0], Bank.WithdrawMode.ITEM);
                            Bank.withdraw(llIIIlIIIl[14], llIIIlIIIl[6], Bank.WithdrawMode.ITEM);
                            C0000a.a(llIIIlIIIl[15], llIIIlIIIl[12]);
                            int[] iArr15 = new int[llIIIlIIIl[0]];
                            iArr15[llIIIlIIIl[1]] = llIIIlIIIl[9];
                            if (lIlIIlIlIIlll(Bank.contains(iArr15) ? 1 : 0)) {
                                int[] iArr16 = new int[llIIIlIIIl[0]];
                                iArr16[llIIIlIIIl[1]] = llIIIlIIIl[9];
                                if (lIlIIlIlIlIII(Inventory.getCount(iArr16), llIIIlIIIl[0])) {
                                    Bank.withdraw(llIIIlIIIl[9], llIIIlIIIl[20], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(llIIIlIIIl[0]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr17 = new int[llIIIlIIIl[0]];
                                        iArr17[llIIIlIIIl[1]] = llIIIlIIIl[9];
                                        if (lIlIIlIlIllII(Inventory.getCount(iArr17))) {
                                            ?? r0 = llIIIlIIIl[0];
                                            "".length();
                                            return (true ^ true) & ((true ^ true) ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                        }
                                        return llIIIlIIIl[1];
                                    }, llIIIlIIIl[5]);
                                    "".length();
                                }
                            }
                            int[] iArr17 = new int[llIIIlIIIl[0]];
                            iArr17[llIIIlIIIl[1]] = llIIIlIIIl[7];
                            if (lIlIIlIlIIlll(Bank.contains(iArr17) ? 1 : 0)) {
                                int[] iArr18 = new int[llIIIlIIIl[0]];
                                iArr18[llIIIlIIIl[1]] = llIIIlIIIl[7];
                                if (lIlIIlIlIlIII(Inventory.getCount(iArr18), llIIIlIIIl[0])) {
                                    Bank.withdraw(llIIIlIIIl[7], llIIIlIIIl[21], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(llIIIlIIIl[0]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr19 = new int[llIIIlIIIl[0]];
                                        iArr19[llIIIlIIIl[1]] = llIIIlIIIl[7];
                                        if (lIlIIlIlIllII(Inventory.getCount(iArr19))) {
                                            ?? r0 = llIIIlIIIl[0];
                                            "".length();
                                            return 0 != 0 ? (!true) & ((true ^ true) ^ true) : r0;
                                        }
                                        return llIIIlIIIl[1];
                                    }, llIIIlIIIl[5]);
                                    "".length();
                                }
                            }
                        }
                    }
                }
            }
            if (lIlIIlIlIIlll(Inventory.contains(C0019f.ba) ? 1 : 0) && lIlIIlIlIlIII(Movement.getRunEnergy(), llIIIlIIIl[22])) {
                Inventory.getFirst(C0019f.ba).interact(llIIIlIIII[llIIIlIIIl[23]]);
                Time.sleepTicks(llIIIlIIIl[0]);
                "".length();
            }
            if (lIlIIlIlIlIlI(Combat.getMissingHealth(), llIIIlIIIl[24])) {
                int[] iArr19 = new int[llIIIlIIIl[0]];
                iArr19[llIIIlIIIl[1]] = llIIIlIIIl[15];
                if (lIlIIlIlIIlll(Inventory.contains(iArr19) ? 1 : 0)) {
                    int[] iArr20 = new int[llIIIlIIIl[0]];
                    iArr20[llIIIlIIIl[1]] = llIIIlIIIl[15];
                    Inventory.getFirst(iArr20).interact(llIIIlIIII[llIIIlIIIl[25]]);
                    Time.sleepTicks(llIIIlIIIl[3]);
                    "".length();
                }
            }
            if (lIlIIlIlIIlll(an() ? 1 : 0) && lIlIIlIlIlIIl(C0018e.j(eG))) {
                C0021h.X();
                if (lIlIIlIlIllIl(Players.getLocal().getWorldLocation().distanceTo(ew), llIIIlIIIl[4]) && lIlIIlIlIllIl(Players.getLocal().getWorldLocation().distanceTo(eF), llIIIlIIIl[26])) {
                    AccBuilderSotf.c = llIIIlIIII[llIIIlIIIl[27]];
                    if (lIlIIlIlIIlll(Dialog.isOpen() ? 1 : 0)) {
                        Dialog.close();
                    }
                    Movement.walkTo(eF);
                    "".length();
                    Time.sleepTicks(llIIIlIIIl[0]);
                    "".length();
                }
                if (!lIlIIlIlIllIl(Players.getLocal().getWorldLocation().distanceTo(ew), llIIIlIIIl[4]) || lIlIIlIlIlllI(Players.getLocal().getWorldLocation().distanceTo(eF), llIIIlIIIl[26])) {
                    C0020g.a(llIIIlIIII[llIIIlIIIl[16]], cE);
                }
            }
            if (!lIlIIlIlIllll(C0018e.j(eG), llIIIlIIIl[16]) || lIlIIlIllIIII(C0018e.j(eG), llIIIlIIIl[28])) {
                String[] strArr = new String[llIIIlIIIl[0]];
                strArr[llIIIlIIIl[1]] = llIIIlIIII[llIIIlIIIl[29]];
                if (lIlIIlIlIlIIl(Inventory.contains(strArr) ? 1 : 0)) {
                    if (!lIlIIlIlIlllI(Players.getLocal().getWorldLocation().distanceTo(ex), llIIIlIIIl[4]) || (lIlIIlIlIllll(Players.getLocal().getWorldLocation().getPlane(), llIIIlIIIl[0]) && lIlIIlIlIlllI(Players.getLocal().getWorldLocation().distanceTo(ex), llIIIlIIIl[4]))) {
                        AccBuilderSotf.c = llIIIlIIII[llIIIlIIIl[24]];
                        Movement.walkTo(ex);
                        "".length();
                        Time.sleepTicks(llIIIlIIIl[0]);
                        "".length();
                    }
                    if (lIlIIlIlIlllI(Players.getLocal().getWorldLocation().distanceTo(ex), llIIIlIIIl[4]) && lIlIIlIllIIII(Players.getLocal().getWorldLocation().getPlane(), llIIIlIIIl[0])) {
                        C0020g.a(llIIIlIIII[llIIIlIIIl[30]], cE);
                    }
                }
                String[] strArr2 = new String[llIIIlIIIl[0]];
                strArr2[llIIIlIIIl[1]] = llIIIlIIII[llIIIlIIIl[31]];
                if (lIlIIlIlIIlll(Inventory.contains(strArr2) ? 1 : 0)) {
                    if (lIlIIlIlIllIl(Players.getLocal().getWorldLocation().distanceTo(ew), llIIIlIIIl[4]) && lIlIIlIlIllIl(Players.getLocal().getWorldLocation().distanceTo(eF), llIIIlIIIl[26])) {
                        AccBuilderSotf.c = llIIIlIIII[llIIIlIIIl[26]];
                        if (lIlIIlIlIlllI(Players.getLocal().getWorldLocation().distanceTo(ex), llIIIlIIIl[28])) {
                            int[] iArr21 = new int[llIIIlIIIl[0]];
                            iArr21[llIIIlIIIl[1]] = llIIIlIIIl[17];
                            Inventory.getFirst(iArr21).interact(llIIIlIIII[llIIIlIIIl[32]]);
                            Time.sleepTicks(llIIIlIIIl[12]);
                            "".length();
                        }
                        WorldPoint worldPoint = new WorldPoint(llIIIlIIIl[33], llIIIlIIIl[34], llIIIlIIIl[1]);
                        if (lIlIIlIlIlllI(Players.getLocal().getWorldLocation().distanceTo(C0015b.I), llIIIlIIIl[35]) && lIlIIlIlIllIl(Players.getLocal().getWorldLocation().distanceTo(worldPoint), llIIIlIIIl[25])) {
                            Movement.walkTo(worldPoint);
                            "".length();
                            Time.sleepTicks(llIIIlIIIl[0]);
                            "".length();
                        }
                        if ((!lIlIIlIlIllIl(Players.getLocal().getWorldLocation().distanceTo(worldPoint), llIIIlIIIl[25]) || lIlIIlIlIlllI(Players.getLocal().getWorldLocation().distanceTo(ew), llIIIlIIIl[35])) && lIlIIlIlIllIl(Players.getLocal().getWorldLocation().distanceTo(ex), llIIIlIIIl[36])) {
                            Movement.walkTo(ew);
                            "".length();
                            Time.sleepTicks(llIIIlIIIl[0]);
                            "".length();
                        }
                    }
                    if (!lIlIIlIlIllIl(Players.getLocal().getWorldLocation().distanceTo(ew), llIIIlIIIl[4]) || lIlIIlIlIlllI(Players.getLocal().getWorldLocation().distanceTo(eF), llIIIlIIIl[26])) {
                        C0020g.a(llIIIlIIII[llIIIlIIIl[37]], cE);
                    }
                }
            }
            if (lIlIIlIllIIII(C0018e.j(eG), llIIIlIIIl[38])) {
                if (lIlIIlIlIllIl(Players.getLocal().getWorldLocation().distanceTo(ey), llIIIlIIIl[23]) && lIlIIlIlIllll(Players.getLocal().getWorldLocation().getPlane(), llIIIlIIIl[0])) {
                    AccBuilderSotf.c = llIIIlIIII[llIIIlIIIl[39]];
                    Movement.walkTo(ey);
                    "".length();
                    Time.sleepTicks(llIIIlIIIl[0]);
                    "".length();
                }
                if (lIlIIlIlIllIl(Players.getLocal().getWorldLocation().distanceTo(ey), llIIIlIIIl[26])) {
                    String[] strArr3 = new String[llIIIlIIIl[0]];
                    strArr3[llIIIlIIIl[1]] = llIIIlIIII[llIIIlIIIl[40]];
                }
                C0020g.a(llIIIlIIII[llIIIlIIIl[28]], cE);
            }
            if (lIlIIlIllIIII(C0018e.j(eG), llIIIlIIIl[36])) {
                if (lIlIIlIlIllIl(Players.getLocal().getWorldLocation().distanceTo(ew), llIIIlIIIl[4]) && lIlIIlIlIllIl(Players.getLocal().getWorldLocation().distanceTo(eF), llIIIlIIIl[26])) {
                    AccBuilderSotf.c = llIIIlIIII[llIIIlIIIl[41]];
                    Movement.walkTo(eF);
                    "".length();
                    Time.sleepTicks(llIIIlIIIl[0]);
                    "".length();
                }
                if (!lIlIIlIlIllIl(Players.getLocal().getWorldLocation().distanceTo(ew), llIIIlIIIl[4]) || lIlIIlIlIlllI(Players.getLocal().getWorldLocation().distanceTo(eF), llIIIlIIIl[26])) {
                    C0020g.a(llIIIlIIII[llIIIlIIIl[42]], cE);
                }
            }
            if (lIlIIlIllIIII(C0018e.j(eG), llIIIlIIIl[22])) {
                if (lIlIIlIlIllIl(Players.getLocal().getWorldLocation().distanceTo(ez), llIIIlIIIl[4]) && lIlIIlIlIllll(Players.getLocal().getWorldLocation().getPlane(), llIIIlIIIl[4])) {
                    AccBuilderSotf.c = llIIIlIIII[llIIIlIIIl[43]];
                    Movement.walkTo(ez);
                    "".length();
                    Time.sleepTicks(llIIIlIIIl[0]);
                    "".length();
                }
                if (lIlIIlIlIlllI(Players.getLocal().getWorldLocation().distanceTo(ez), llIIIlIIIl[4]) && lIlIIlIllIIII(Players.getLocal().getWorldLocation().getPlane(), llIIIlIIIl[4])) {
                    C0020g.a(llIIIlIIII[llIIIlIIIl[44]], cE);
                }
            }
            if (lIlIIlIllIIII(C0018e.j(eG), llIIIlIIIl[45])) {
                if (lIlIIlIlIllIl(Players.getLocal().getWorldLocation().distanceTo(ey), llIIIlIIIl[23]) && lIlIIlIlIllll(Players.getLocal().getWorldLocation().getPlane(), llIIIlIIIl[0])) {
                    AccBuilderSotf.c = llIIIlIIII[llIIIlIIIl[2]];
                    Movement.walkTo(ey);
                    "".length();
                    Time.sleepTicks(llIIIlIIIl[0]);
                    "".length();
                }
                if (!lIlIIlIllIIII(Players.getLocal().getWorldLocation().getPlane(), llIIIlIIIl[0]) || lIlIIlIlIllIl(Players.getLocal().getWorldLocation().distanceTo(ey), llIIIlIIIl[23])) {
                    String[] strArr4 = new String[llIIIlIIIl[0]];
                    strArr4[llIIIlIIIl[1]] = llIIIlIIII[llIIIlIIIl[46]];
                    if (lIlIIlIlIlIll(TileObjects.getNearest(strArr4))) {
                        String[] strArr5 = new String[llIIIlIIIl[0]];
                        strArr5[llIIIlIIIl[1]] = llIIIlIIII[llIIIlIIIl[47]];
                        TileObjects.getNearest(strArr5).interact(llIIIlIIII[llIIIlIIIl[48]]);
                        Time.sleepTicks(llIIIlIIIl[0]);
                        "".length();
                    }
                }
                if (lIlIIlIlIlllI(Players.getLocal().getWorldLocation().distanceTo(ey), llIIIlIIIl[23])) {
                    AccBuilderSotf.c = llIIIlIIII[llIIIlIIIl[49]];
                    String[] strArr6 = new String[llIIIlIIIl[0]];
                    strArr6[llIIIlIIIl[1]] = llIIIlIIII[llIIIlIIIl[38]];
                    TileObject nearest2 = TileObjects.getNearest(strArr6);
                    String[] strArr7 = new String[llIIIlIIIl[0]];
                    strArr7[llIIIlIIIl[1]] = llIIIlIIII[llIIIlIIIl[50]];
                    if (lIlIIlIlIIlll(nearest2.hasAction(strArr7) ? 1 : 0)) {
                        String[] strArr8 = new String[llIIIlIIIl[0]];
                        strArr8[llIIIlIIIl[1]] = llIIIlIIII[llIIIlIIIl[51]];
                        TileObjects.getNearest(strArr8).interact(llIIIlIIII[llIIIlIIIl[52]]);
                        Time.sleepTicks(llIIIlIIIl[4]);
                        "".length();
                    }
                    String[] strArr9 = new String[llIIIlIIIl[0]];
                    strArr9[llIIIlIIIl[1]] = llIIIlIIII[llIIIlIIIl[53]];
                    TileObject nearest3 = TileObjects.getNearest(strArr9);
                    String[] strArr10 = new String[llIIIlIIIl[0]];
                    strArr10[llIIIlIIIl[1]] = llIIIlIIII[llIIIlIIIl[54]];
                    if (lIlIIlIlIIlll(nearest3.hasAction(strArr10) ? 1 : 0)) {
                        String[] strArr11 = new String[llIIIlIIIl[0]];
                        strArr11[llIIIlIIIl[1]] = llIIIlIIII[llIIIlIIIl[55]];
                        TileObjects.getNearest(strArr11).interact(llIIIlIIII[llIIIlIIIl[56]]);
                        Time.sleepTicks(llIIIlIIIl[4]);
                        "".length();
                    }
                }
            }
            if (lIlIIlIllIIII(C0018e.j(eG), llIIIlIIIl[57])) {
                AccBuilderSotf.c = llIIIlIIII[llIIIlIIIl[58]];
                C0020g.a(llIIIlIIII[llIIIlIIIl[59]], cE);
                if (lIlIIlIlIIlll(Players.getLocal().getWorldLocation().equals(new WorldPoint(llIIIlIIIl[60], llIIIlIIIl[61], llIIIlIIIl[4])) ? 1 : 0)) {
                    C0020g.a(llIIIlIIII[llIIIlIIIl[36]], cE);
                }
                C0020g.a(cE);
            }
            if (lIlIIlIllIIII(C0018e.j(eG), llIIIlIIIl[62])) {
                if (lIlIIlIlIlllI(Players.getLocal().getWorldLocation().distanceTo(ez), llIIIlIIIl[28])) {
                    AccBuilderSotf.c = llIIIlIIII[llIIIlIIIl[63]];
                    C0020g.a(llIIIlIIII[llIIIlIIIl[64]], cE);
                }
                if (lIlIIlIlIllIl(Players.getLocal().getWorldLocation().distanceTo(ez), llIIIlIIIl[28])) {
                    if (lIlIIlIlIlIII(Players.getLocal().getWorldLocation().getX(), llIIIlIIIl[65])) {
                        if (lIlIIlIlIllIl(Players.getLocal().getWorldLocation().distanceTo(eA), llIIIlIIIl[4])) {
                            AccBuilderSotf.c = llIIIlIIII[llIIIlIIIl[66]];
                            Movement.walkTo(eA);
                            "".length();
                            Time.sleepTicks(llIIIlIIIl[0]);
                            "".length();
                        }
                        if (lIlIIlIlIlllI(Players.getLocal().getWorldLocation().distanceTo(eA), llIIIlIIIl[4])) {
                            if (lIlIIlIlIlIIl(Dialog.isOpen() ? 1 : 0)) {
                                String[] strArr12 = new String[llIIIlIIIl[0]];
                                strArr12[llIIIlIIIl[1]] = llIIIlIIII[llIIIlIIIl[67]];
                                TileObjects.getNearest(strArr12).interact(llIIIlIIII[llIIIlIIIl[68]]);
                                Time.sleepTicks(llIIIlIIIl[4]);
                                "".length();
                            }
                            C0020g.a(cE);
                        }
                    }
                    if (lIlIIlIlIlIlI(Players.getLocal().getWorldLocation().getX(), llIIIlIIIl[65])) {
                        if (lIlIIlIlIllIl(Players.getLocal().getWorldLocation().distanceTo(eB), llIIIlIIIl[19])) {
                            AccBuilderSotf.c = llIIIlIIII[llIIIlIIIl[69]];
                            Movement.walkTo(eB);
                            "".length();
                            Time.sleepTicks(llIIIlIIIl[0]);
                            "".length();
                        }
                        if (lIlIIlIlIlllI(Players.getLocal().getWorldLocation().distanceTo(eB), llIIIlIIIl[19])) {
                            if (lIlIIlIlIlIIl(C0026m.ap() ? 1 : 0)) {
                                C0026m.aq();
                            }
                            if (lIlIIlIllIIIl(Players.getLocal().getInteracting())) {
                                String[] strArr13 = new String[llIIIlIIIl[0]];
                                strArr13[llIIIlIIIl[1]] = llIIIlIIII[llIIIlIIIl[70]];
                                NPCs.getNearest(strArr13).interact(llIIIlIIII[llIIIlIIIl[71]]);
                                Time.sleepTicks(llIIIlIIIl[0]);
                                "".length();
                            }
                        }
                    }
                }
            }
            if (lIlIIlIllIIII(C0018e.j(eG), llIIIlIIIl[72])) {
                String[] strArr14 = new String[llIIIlIIIl[0]];
                strArr14[llIIIlIIIl[1]] = llIIIlIIII[llIIIlIIIl[73]];
                if (lIlIIlIlIlIIl(Inventory.contains(strArr14) ? 1 : 0)) {
                    String[] strArr15 = new String[llIIIlIIIl[0]];
                    strArr15[llIIIlIIIl[1]] = llIIIlIIII[llIIIlIIIl[22]];
                    TileItems.getNearest(strArr15).interact(llIIIlIIII[llIIIlIIIl[74]]);
                    Time.sleepTicks(llIIIlIIIl[6]);
                    "".length();
                }
                String[] strArr16 = new String[llIIIlIIIl[0]];
                strArr16[llIIIlIIIl[1]] = llIIIlIIII[llIIIlIIIl[75]];
                if (lIlIIlIlIIlll(Inventory.contains(strArr16) ? 1 : 0)) {
                    if (lIlIIlIlIllIl(Players.getLocal().getWorldLocation().distanceTo(ez), llIIIlIIIl[4]) && lIlIIlIlIllll(Players.getLocal().getWorldLocation().getPlane(), llIIIlIIIl[4])) {
                        AccBuilderSotf.c = llIIIlIIII[llIIIlIIIl[76]];
                        WorldPoint worldPoint2 = new WorldPoint(llIIIlIIIl[33], llIIIlIIIl[34], llIIIlIIIl[1]);
                        if (lIlIIlIlIlllI(Players.getLocal().getWorldLocation().distanceTo(eB), llIIIlIIIl[28])) {
                            int[] iArr22 = new int[llIIIlIIIl[0]];
                            iArr22[llIIIlIIIl[1]] = llIIIlIIIl[17];
                            Inventory.getFirst(iArr22).interact(llIIIlIIII[llIIIlIIIl[77]]);
                            Time.sleepTicks(llIIIlIIIl[12]);
                            "".length();
                        }
                        if (lIlIIlIlIlllI(Players.getLocal().getWorldLocation().distanceTo(C0015b.I), llIIIlIIIl[35]) && lIlIIlIlIllIl(Players.getLocal().getWorldLocation().distanceTo(worldPoint2), llIIIlIIIl[25])) {
                            Movement.walkTo(worldPoint2);
                            "".length();
                            Time.sleepTicks(llIIIlIIIl[0]);
                            "".length();
                        }
                        if ((!lIlIIlIlIllIl(Players.getLocal().getWorldLocation().distanceTo(worldPoint2), llIIIlIIIl[25]) || lIlIIlIlIlllI(Players.getLocal().getWorldLocation().distanceTo(ew), llIIIlIIIl[35])) && lIlIIlIlIllIl(Players.getLocal().getWorldLocation().distanceTo(eB), llIIIlIIIl[36])) {
                            Movement.walkTo(ez);
                            "".length();
                            Time.sleepTicks(llIIIlIIIl[0]);
                            "".length();
                        }
                        if (!lIlIIlIlIllll(Players.getLocal().getWorldLocation().getPlane(), llIIIlIIIl[3]) || lIlIIlIllIIII(Players.getLocal().getWorldLocation().getPlane(), llIIIlIIIl[0])) {
                            String[] strArr17 = new String[llIIIlIIIl[0]];
                            strArr17[llIIIlIIIl[1]] = llIIIlIIII[llIIIlIIIl[78]];
                            if (lIlIIlIlIlIll(TileObjects.getNearest(strArr17))) {
                                String[] strArr18 = new String[llIIIlIIIl[0]];
                                strArr18[llIIIlIIIl[1]] = llIIIlIIII[llIIIlIIIl[79]];
                                TileObjects.getNearest(strArr18).interact(llIIIlIIII[llIIIlIIIl[80]]);
                                Time.sleepTicks(llIIIlIIIl[4]);
                                "".length();
                            }
                        }
                    }
                    if (lIlIIlIlIlllI(Players.getLocal().getWorldLocation().distanceTo(ez), llIIIlIIIl[4]) && lIlIIlIllIIII(Players.getLocal().getWorldLocation().getPlane(), llIIIlIIIl[4])) {
                        C0020g.a(llIIIlIIII[llIIIlIIIl[81]], cE);
                    }
                }
            }
            if (lIlIIlIllIIII(C0018e.j(eG), llIIIlIIIl[82])) {
                String[] strArr19 = new String[llIIIlIIIl[0]];
                strArr19[llIIIlIIIl[1]] = llIIIlIIII[llIIIlIIIl[83]];
                if (lIlIIlIlIlIIl(Inventory.contains(strArr19) ? 1 : 0)) {
                    if (lIlIIlIlIllIl(Players.getLocal().getWorldLocation().distanceTo(eC), llIIIlIIIl[12])) {
                        AccBuilderSotf.c = llIIIlIIII[llIIIlIIIl[45]];
                        if (!lIlIIlIlIllll(Players.getLocal().getWorldLocation().getPlane(), llIIIlIIIl[4]) || !lIlIIlIlIllll(Players.getLocal().getWorldLocation().getPlane(), llIIIlIIIl[3]) || lIlIIlIllIIII(Players.getLocal().getWorldLocation().getPlane(), llIIIlIIIl[0])) {
                            String[] strArr20 = new String[llIIIlIIIl[0]];
                            strArr20[llIIIlIIIl[1]] = llIIIlIIII[llIIIlIIIl[84]];
                            TileObjects.getNearest(strArr20).interact(llIIIlIIII[llIIIlIIIl[85]]);
                            Time.sleepTicks(llIIIlIIIl[4]);
                            "".length();
                        }
                        if (lIlIIlIlIlllI(Players.getLocal().getWorldLocation().distanceTo(ew), llIIIlIIIl[12])) {
                            Movement.walkTo(new WorldPoint(llIIIlIIIl[86], llIIIlIIIl[87], llIIIlIIIl[1]));
                            "".length();
                        }
                        if (lIlIIlIlIlIIl(Players.getLocal().getWorldLocation().getPlane()) && lIlIIlIlIllIl(Players.getLocal().getWorldLocation().distanceTo(ew), llIIIlIIIl[12])) {
                            Movement.walkTo(eC);
                            "".length();
                            Time.sleepTicks(llIIIlIIIl[0]);
                            "".length();
                        }
                    }
                    if (lIlIIlIlIlllI(Players.getLocal().getWorldLocation().distanceTo(eC), llIIIlIIIl[12])) {
                        C0020g.a(llIIIlIIII[llIIIlIIIl[88]], cE);
                        if (lIlIIlIlIlIIl(Players.getLocal().getWorldLocation().getPlane())) {
                            String[] strArr21 = new String[llIIIlIIIl[0]];
                            strArr21[llIIIlIIIl[1]] = llIIIlIIII[llIIIlIIIl[89]];
                            TileObjects.getNearest(strArr21).interact(llIIIlIIII[llIIIlIIIl[90]]);
                            Time.sleepTicks(llIIIlIIIl[3]);
                            "".length();
                        }
                    }
                }
                String[] strArr22 = new String[llIIIlIIIl[0]];
                strArr22[llIIIlIIIl[1]] = llIIIlIIII[llIIIlIIIl[91]];
                if (lIlIIlIlIIlll(Inventory.contains(strArr22) ? 1 : 0)) {
                    if (lIlIIlIlIlllI(Players.getLocal().getWorldLocation().distanceTo(eC), llIIIlIIIl[12]) && lIlIIlIllIIII(Players.getLocal().getWorldLocation().getPlane(), llIIIlIIIl[0])) {
                        String[] strArr23 = new String[llIIIlIIIl[0]];
                        strArr23[llIIIlIIIl[1]] = llIIIlIIII[llIIIlIIIl[92]];
                        TileObjects.getNearest(strArr23).interact(llIIIlIIII[llIIIlIIIl[93]]);
                        Time.sleepTicks(llIIIlIIIl[3]);
                        "".length();
                    }
                    if (lIlIIlIlIIlll(new WorldArea(llIIIlIIIl[94], llIIIlIIIl[87], llIIIlIIIl[37], llIIIlIIIl[2], llIIIlIIIl[0]).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        String[] strArr24 = new String[llIIIlIIIl[0]];
                        strArr24[llIIIlIIIl[1]] = llIIIlIIII[llIIIlIIIl[95]];
                        TileObjects.getNearest(strArr24).interact(llIIIlIIII[llIIIlIIIl[57]]);
                        Time.sleepTicks(llIIIlIIIl[3]);
                        "".length();
                    }
                    if (lIlIIlIlIllIl(Players.getLocal().getWorldLocation().distanceTo(ey), llIIIlIIIl[24]) && lIlIIlIlIllll(Players.getLocal().getWorldLocation().getPlane(), llIIIlIIIl[0])) {
                        AccBuilderSotf.c = llIIIlIIII[llIIIlIIIl[96]];
                        Movement.walkTo(ey);
                        "".length();
                        Time.sleepTicks(llIIIlIIIl[0]);
                        "".length();
                    }
                    if (lIlIIlIlIlllI(Players.getLocal().getWorldLocation().distanceTo(ey), llIIIlIIIl[24]) && lIlIIlIllIIII(Players.getLocal().getWorldLocation().getPlane(), llIIIlIIIl[0])) {
                        String[] strArr25 = new String[llIIIlIIIl[0]];
                        strArr25[llIIIlIIIl[1]] = llIIIlIIII[llIIIlIIIl[97]];
                        if (lIlIIlIlIlIll(TileObjects.getNearest(strArr25))) {
                            String[] strArr26 = new String[llIIIlIIIl[0]];
                            strArr26[llIIIlIIIl[1]] = llIIIlIIII[llIIIlIIIl[98]];
                            Item first = Inventory.getFirst(strArr26);
                            String[] strArr27 = new String[llIIIlIIIl[0]];
                            strArr27[llIIIlIIIl[1]] = llIIIlIIII[llIIIlIIIl[99]];
                            first.useOn(TileObjects.getNearest(strArr27));
                            Time.sleepTicks(llIIIlIIIl[4]);
                            "".length();
                        }
                    }
                    C0020g.a(cE);
                }
            }
            if (lIlIIlIllIIII(C0018e.j(eG), llIIIlIIIl[100])) {
                if (lIlIIlIlIllIl(Players.getLocal().getWorldLocation().distanceTo(ew), llIIIlIIIl[4]) && lIlIIlIlIllIl(Players.getLocal().getWorldLocation().distanceTo(eF), llIIIlIIIl[26])) {
                    AccBuilderSotf.c = llIIIlIIII[llIIIlIIIl[101]];
                    Movement.walkTo(eF);
                    "".length();
                    Time.sleepTicks(llIIIlIIIl[0]);
                    "".length();
                }
                if (!lIlIIlIlIllIl(Players.getLocal().getWorldLocation().distanceTo(ew), llIIIlIIIl[4]) || lIlIIlIlIlllI(Players.getLocal().getWorldLocation().distanceTo(eF), llIIIlIIIl[26])) {
                    C0020g.a(llIIIlIIII[llIIIlIIIl[102]], cE);
                }
            }
            if (lIlIIlIllIIII(C0018e.j(eG), llIIIlIIIl[103])) {
                if (lIlIIlIlIllIl(Players.getLocal().getWorldLocation().distanceTo(eE), llIIIlIIIl[12])) {
                    AccBuilderSotf.c = llIIIlIIII[llIIIlIIIl[104]];
                    Movement.walkTo(eE);
                    "".length();
                    Time.sleepTicks(llIIIlIIIl[0]);
                    "".length();
                }
                if (lIlIIlIlIlllI(Players.getLocal().getWorldLocation().distanceTo(eE), llIIIlIIIl[12])) {
                    AccBuilderSotf.c = llIIIlIIII[llIIIlIIIl[105]];
                    int[] iArr23 = new int[llIIIlIIIl[0]];
                    iArr23[llIIIlIIIl[1]] = llIIIlIIIl[106];
                    if (lIlIIlIlIIlll(Inventory.contains(iArr23) ? 1 : 0)) {
                        int[] iArr24 = new int[llIIIlIIIl[0]];
                        iArr24[llIIIlIIIl[1]] = llIIIlIIIl[106];
                        Item first2 = Inventory.getFirst(iArr24);
                        int[] iArr25 = new int[llIIIlIIIl[0]];
                        iArr25[llIIIlIIIl[1]] = llIIIlIIIl[107];
                        first2.useOn(TileObjects.getNearest(iArr25));
                        Time.sleepTicks(llIIIlIIIl[4]);
                        "".length();
                    }
                    int[] iArr26 = new int[llIIIlIIIl[0]];
                    iArr26[llIIIlIIIl[1]] = llIIIlIIIl[108];
                    if (lIlIIlIlIIlll(Inventory.contains(iArr26) ? 1 : 0)) {
                        int[] iArr27 = new int[llIIIlIIIl[0]];
                        iArr27[llIIIlIIIl[1]] = llIIIlIIIl[108];
                        Item first3 = Inventory.getFirst(iArr27);
                        int[] iArr28 = new int[llIIIlIIIl[0]];
                        iArr28[llIIIlIIIl[1]] = llIIIlIIIl[109];
                        first3.useOn(TileObjects.getNearest(iArr28));
                        Time.sleepTicks(llIIIlIIIl[4]);
                        "".length();
                    }
                    int[] iArr29 = new int[llIIIlIIIl[0]];
                    iArr29[llIIIlIIIl[1]] = llIIIlIIIl[110];
                    if (lIlIIlIlIIlll(Inventory.contains(iArr29) ? 1 : 0)) {
                        int[] iArr30 = new int[llIIIlIIIl[0]];
                        iArr30[llIIIlIIIl[1]] = llIIIlIIIl[110];
                        Item first4 = Inventory.getFirst(iArr30);
                        int[] iArr31 = new int[llIIIlIIIl[0]];
                        iArr31[llIIIlIIIl[1]] = llIIIlIIIl[111];
                        first4.useOn(TileObjects.getNearest(iArr31));
                        Time.sleepTicks(llIIIlIIIl[4]);
                        "".length();
                    }
                    int[] iArr32 = new int[llIIIlIIIl[0]];
                    iArr32[llIIIlIIIl[1]] = llIIIlIIIl[112];
                    if (lIlIIlIlIIlll(Inventory.contains(iArr32) ? 1 : 0)) {
                        int[] iArr33 = new int[llIIIlIIIl[0]];
                        iArr33[llIIIlIIIl[1]] = llIIIlIIIl[112];
                        Item first5 = Inventory.getFirst(iArr33);
                        int[] iArr34 = new int[llIIIlIIIl[0]];
                        iArr34[llIIIlIIIl[1]] = llIIIlIIIl[113];
                        first5.useOn(TileObjects.getNearest(iArr34));
                        Time.sleepTicks(llIIIlIIIl[4]);
                        "".length();
                    }
                }
            }
            if (lIlIIlIllIIII(C0018e.j(eG), llIIIlIIIl[114])) {
                if (lIlIIlIlIlllI(Players.getLocal().getWorldLocation().distanceTo(eE), llIIIlIIIl[12]) && lIlIIlIllIIII(Players.getLocal().getWorldLocation().getPlane(), llIIIlIIIl[3])) {
                    AccBuilderSotf.c = llIIIlIIII[llIIIlIIIl[115]];
                    String[] strArr28 = new String[llIIIlIIIl[0]];
                    strArr28[llIIIlIIIl[1]] = llIIIlIIII[llIIIlIIIl[62]];
                    TileObjects.getNearest(strArr28).interact(llIIIlIIII[llIIIlIIIl[116]]);
                    Time.sleepTicks(llIIIlIIIl[4]);
                    "".length();
                }
                String[] strArr29 = new String[llIIIlIIIl[0]];
                strArr29[llIIIlIIIl[1]] = llIIIlIIII[llIIIlIIIl[117]];
                if (lIlIIlIlIlIll(NPCs.getNearest(strArr29))) {
                    WorldPoint worldPoint3 = new WorldPoint(llIIIlIIIl[118], llIIIlIIIl[119], llIIIlIIIl[1]);
                    if (lIlIIlIlIlIIl(Players.getLocal().getWorldLocation().equals(worldPoint3) ? 1 : 0)) {
                        Movement.walkTo(worldPoint3);
                        "".length();
                        Time.sleepTicks(llIIIlIIIl[0]);
                        "".length();
                    }
                    if (lIlIIlIlIlIIl(Prayers.isEnabled(Prayer.PROTECT_FROM_MELEE) ? 1 : 0) && lIlIIlIlIllII(Prayers.getPoints()) && lIlIIlIlIlIlI(Skills.getLevel(Skill.PRAYER), llIIIlIIIl[66])) {
                        Prayers.toggle(Prayer.PROTECT_FROM_MELEE);
                    }
                    if (lIlIIlIlIIlll(Players.getLocal().getWorldLocation().equals(worldPoint3) ? 1 : 0)) {
                        if (lIlIIlIlIlIIl(C0026m.ap() ? 1 : 0)) {
                            C0026m.aq();
                        }
                        if (lIlIIlIlIlIII(Prayers.getPoints(), llIIIlIIIl[43]) && lIlIIlIlIIlll(Inventory.contains(C0019f.aX) ? 1 : 0)) {
                            Inventory.getFirst(C0019f.aX).interact(llIIIlIIII[llIIIlIIIl[120]]);
                            Time.sleepTicks(llIIIlIIIl[0]);
                            "".length();
                        }
                        if (lIlIIlIllIIIl(Players.getLocal().getInteracting())) {
                            String[] strArr30 = new String[llIIIlIIIl[0]];
                            strArr30[llIIIlIIIl[1]] = llIIIlIIII[llIIIlIIIl[121]];
                            NPCs.getNearest(strArr30).interact(llIIIlIIII[llIIIlIIIl[122]]);
                            Time.sleepTicks(llIIIlIIIl[3]);
                            "".length();
                        }
                    }
                }
                C0020g.a(cE);
            }
            if (lIlIIlIllIIII(C0018e.j(eG), llIIIlIIIl[123])) {
                if (lIlIIlIlIIlll(Prayers.isEnabled(Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                    Prayers.toggle(Prayer.PROTECT_FROM_MELEE);
                }
                if (lIlIIlIlIllIl(Players.getLocal().getWorldLocation().distanceTo(eF), llIIIlIIIl[6])) {
                    AccBuilderSotf.c = llIIIlIIII[llIIIlIIIl[124]];
                    Movement.walkTo(eF);
                    "".length();
                    Time.sleepTicks(llIIIlIIIl[0]);
                    "".length();
                }
                if (lIlIIlIlIlllI(Players.getLocal().getWorldLocation().distanceTo(eF), llIIIlIIIl[6])) {
                    C0020g.a(llIIIlIIII[llIIIlIIIl[125]], cE);
                }
                C0020g.a(cE);
            }
            if (lIlIIlIllIIII(C0018e.j(eG), llIIIlIIIl[35])) {
                String[] strArr31 = new String[llIIIlIIIl[0]];
                strArr31[llIIIlIIIl[1]] = llIIIlIIII[llIIIlIIIl[126]];
                if (lIlIIlIlIlIIl(Inventory.contains(strArr31) ? 1 : 0)) {
                    AccBuilderSotf.c = llIIIlIIII[llIIIlIIIl[127]];
                    bB();
                }
                String[] strArr32 = new String[llIIIlIIIl[0]];
                strArr32[llIIIlIIIl[1]] = llIIIlIIII[llIIIlIIIl[72]];
                if (lIlIIlIlIIlll(Inventory.contains(strArr32) ? 1 : 0)) {
                    if (lIlIIlIlIllIl(Players.getLocal().getWorldLocation().distanceTo(eF), llIIIlIIIl[6])) {
                        AccBuilderSotf.c = llIIIlIIII[llIIIlIIIl[128]];
                        Movement.walkTo(eF);
                        "".length();
                        Time.sleepTicks(llIIIlIIIl[0]);
                        "".length();
                    }
                    if (lIlIIlIlIlllI(Players.getLocal().getWorldLocation().distanceTo(eF), llIIIlIIIl[6])) {
                        if (lIlIIlIlIlIII(di, llIIIlIIIl[0])) {
                            aN.qt += llIIIlIIIl[0];
                            aN.u(AccBuilderSotf.m);
                            di += llIIIlIIIl[0];
                            aN.qt = llIIIlIIIl[1];
                        }
                        C0020g.a(llIIIlIIII[llIIIlIIIl[129]], cE);
                    }
                }
            }
        }
    }

    private static boolean lIlIIlIllIIII(int i, int i2) {
        return i == i2;
    }

    private static String lIlIIlIIllIIl(String llllllllllllllllllIlIllllllIIlIl, String llllllllllllllllllIlIllllllIIlII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllllIlIllllllIIlII.getBytes(StandardCharsets.UTF_8)), llIIIlIIIl[25]), "DES");
            Cipher llllllllllllllllllIlIllllllIIlll = Cipher.getInstance("DES");
            llllllllllllllllllIlIllllllIIlll.init(llIIIlIIIl[3], secretKeySpec);
            return new String(llllllllllllllllllIlIllllllIIlll.doFinal(Base64.getDecoder().decode(llllllllllllllllllIlIllllllIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllllIlIllllllIIllI) {
            llllllllllllllllllIlIllllllIIllI.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIIlIlIllII(int i) {
        return i > 0;
    }

    private static boolean lIlIIlIlIlIll(Object obj) {
        return obj != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    private static boolean an() {
        int[] iArr = new int[llIIIlIIIl[6]];
        iArr[llIIIlIIIl[1]] = llIIIlIIIl[17];
        iArr[llIIIlIIIl[0]] = llIIIlIIIl[11];
        iArr[llIIIlIIIl[3]] = llIIIlIIIl[13];
        iArr[llIIIlIIIl[4]] = llIIIlIIIl[18];
        int i = llIIIlIIIl[1];
        while (lIlIIlIlIlIII(i, iArr.length)) {
            int[] iArr2 = new int[llIIIlIIIl[0]];
            iArr2[llIIIlIIIl[1]] = iArr[i];
            if (lIlIIlIlIlIIl(Inventory.contains(iArr2) ? 1 : 0)) {
                return llIIIlIIIl[1];
            }
            i++;
            "".length();
            if (((true ^ true) & ((true ^ true) ^ true)) != ((true ^ true) & ((true ^ true) ^ true))) {
                return (true ^ true) & ((true ^ true) ^ true);
            }
        }
        return llIIIlIIIl[0];
    }

    private static String lIlIIlIIllIII(String llllllllllllllllllIlIlllllIIIIII, String llllllllllllllllllIlIllllIllllll) {
        try {
            SecretKeySpec llllllllllllllllllIlIlllllIIIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllllIlIllllIllllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llIIIlIIIl[3], llllllllllllllllllIlIlllllIIIIll);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllllIlIlllllIIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllllIlIlllllIIIIIl) {
            llllllllllllllllllIlIlllllIIIIIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIIlIllIIIl(Object obj) {
        return obj == null;
    }

    private static boolean lIlIIlIlIllIl(int i, int i2) {
        return i > i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public boolean ah() {
        if (lIlIIlIllIIII(C0018e.j(eG), llIIIlIIIl[186])) {
            ?? r0 = llIIIlIIIl[0];
            "".length();
            return (-"   ".length()) > 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return llIIIlIIIl[1];
    }

    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public String ag() {
        return h;
    }

    private static boolean lIlIIlIlIlIlI(int i, int i2) {
        return i >= i2;
    }

    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public int af() {
        try {
            bA();
            "".length();
            if ((((162 ^ 184) ^ (39 ^ 93)) & (((((98 + 38) - 26) + 52) ^ (((177 + 9) - 101) + 109)) ^ (-" ".length()))) < (((((126 + 111) - 191) + 109) ^ (((42 + 121) - (-2)) + 3)) & (((38 ^ 22) ^ "   ".length()) ^ (-" ".length())))) {
                return ((235 ^ 128) ^ (99 ^ 80)) & (((((50 + 111) - 73) + 158) ^ (((121 + 113) - 156) + 96)) ^ (-" ".length()));
            }
        } catch (Exception e) {
        }
        return llIIIlIIIl[82];
    }

    static {
        lIlIIlIlIIllI();
        lIlIIlIlIIlIl();
        ew = new WorldPoint(llIIIlIIIl[130], llIIIlIIIl[188], llIIIlIIIl[1]);
        ex = new WorldPoint(llIIIlIIIl[189], llIIIlIIIl[190], llIIIlIIIl[0]);
        ey = new WorldPoint(llIIIlIIIl[140], llIIIlIIIl[191], llIIIlIIIl[0]);
        ez = new WorldPoint(llIIIlIIIl[86], llIIIlIIIl[192], llIIIlIIIl[4]);
        eA = new WorldPoint(llIIIlIIIl[193], llIIIlIIIl[194], llIIIlIIIl[1]);
        eB = new WorldPoint(llIIIlIIIl[195], llIIIlIIIl[196], llIIIlIIIl[1]);
        eC = new WorldPoint(llIIIlIIIl[197], llIIIlIIIl[198], llIIIlIIIl[0]);
        eD = new WorldPoint(llIIIlIIIl[142], llIIIlIIIl[191], llIIIlIIIl[0]);
        eE = new WorldPoint(llIIIlIIIl[149], llIIIlIIIl[199], llIIIlIIIl[3]);
        eF = new WorldPoint(llIIIlIIIl[86], llIIIlIIIl[131], llIIIlIIIl[1]);
        bv = new ArrayList();
        String[] strArr = new String[llIIIlIIIl[30]];
        strArr[llIIIlIIIl[1]] = llIIIlIIII[llIIIlIIIl[200]];
        strArr[llIIIlIIIl[0]] = llIIIlIIII[llIIIlIIIl[201]];
        strArr[llIIIlIIIl[3]] = llIIIlIIII[llIIIlIIIl[202]];
        strArr[llIIIlIIIl[4]] = llIIIlIIII[llIIIlIIIl[203]];
        strArr[llIIIlIIIl[6]] = llIIIlIIII[llIIIlIIIl[204]];
        strArr[llIIIlIIIl[12]] = llIIIlIIII[llIIIlIIIl[114]];
        strArr[llIIIlIIIl[19]] = llIIIlIIII[llIIIlIIIl[205]];
        strArr[llIIIlIIIl[23]] = llIIIlIIII[llIIIlIIIl[206]];
        strArr[llIIIlIIIl[25]] = llIIIlIIII[llIIIlIIIl[207]];
        strArr[llIIIlIIIl[27]] = llIIIlIIII[llIIIlIIIl[208]];
        strArr[llIIIlIIIl[16]] = llIIIlIIII[llIIIlIIIl[209]];
        strArr[llIIIlIIIl[29]] = llIIIlIIII[llIIIlIIIl[210]];
        strArr[llIIIlIIIl[24]] = llIIIlIIII[llIIIlIIIl[211]];
        cE = strArr;
        eG = llIIIlIIIl[35];
        da = llIIIlIIII[llIIIlIIIl[212]];
        h = "Grand Tree " + da;
    }

    private static void lIlIIlIlIIllI() {
        llIIIlIIIl = new int[214];
        llIIIlIIIl[0] = " ".length();
        llIIIlIIIl[1] = ((87 ^ 28) ^ (232 ^ 184)) & (((((25 + 165) - 42) + 34) ^ (((160 + 158) - 303) + 158)) ^ (-" ".length()));
        llIIIlIIIl[2] = (99 ^ 8) ^ (47 ^ 93);
        llIIIlIIIl[3] = "  ".length();
        llIIIlIIIl[4] = "   ".length();
        llIIIlIIIl[5] = (-((-5305) & 15613)) & (-17428) & 32735;
        llIIIlIIIl[6] = 185 ^ 189;
        llIIIlIIIl[7] = (-((-4105) & 22750)) & (-1281) & 20479;
        llIIIlIIIl[8] = (-((-19601) & 31931)) & (-2053) & 16382;
        llIIIlIIIl[9] = (-25922) & 26479;
        llIIIlIIIl[10] = (-2065) & 3064;
        llIIIlIIIl[11] = (-12290) & 14841;
        llIIIlIIIl[12] = 184 ^ 189;
        llIIIlIIIl[13] = (-3087) & 15711;
        llIIIlIIIl[14] = (-((-24889) & 25917)) & (-28745) & 32206;
        llIIIlIIIl[15] = (-29189) & 29567;
        llIIIlIIIl[16] = 144 ^ 154;
        llIIIlIIIl[17] = (-16561) & 24567;
        llIIIlIIIl[18] = (-((-481) & 6625)) & (-1045) & 8183;
        llIIIlIIIl[19] = 94 ^ 88;
        llIIIlIIIl[20] = (-11274) & 11773;
        llIIIlIIIl[21] = (-25121) & 26620;
        llIIIlIIIl[22] = 146 ^ 160;
        llIIIlIIIl[23] = 90 ^ 93;
        llIIIlIIIl[24] = 166 ^ 170;
        llIIIlIIIl[25] = 145 ^ 153;
        llIIIlIIIl[26] = (96 ^ 15) ^ (55 ^ 87);
        llIIIlIIIl[27] = 37 ^ 44;
        llIIIlIIIl[28] = 143 ^ 155;
        llIIIlIIIl[29] = (79 ^ 119) ^ (85 ^ 102);
        llIIIlIIIl[30] = (((49 + 81) - 123) + 172) ^ (((32 + 81) - (-75)) + 2);
        llIIIlIIIl[31] = (3 ^ 57) ^ (47 ^ 27);
        llIIIlIIIl[32] = 3 ^ 19;
        llIIIlIIIl[33] = (-((-3337) & 7564)) & (-5) & 7415;
        llIIIlIIIl[34] = (-8261) & 11767;
        llIIIlIIIl[35] = ((50 + 43) - 36) + 93;
        llIIIlIIIl[36] = 104 ^ 64;
        llIIIlIIIl[37] = (223 ^ 186) ^ (11 ^ 127);
        llIIIlIIIl[38] = (((22 + 48) - (-61)) + 14) ^ (((38 + 6) - (-36)) + 63);
        llIIIlIIIl[39] = (167 ^ 159) ^ (239 ^ 197);
        llIIIlIIIl[40] = 68 ^ 87;
        llIIIlIIIl[41] = (28 ^ 4) ^ (80 ^ 93);
        llIIIlIIIl[42] = (((128 + 140) - 146) + 49) ^ (((152 + 101) - 243) + 179);
        llIIIlIIIl[43] = 4 ^ 19;
        llIIIlIIIl[44] = 64 ^ 88;
        llIIIlIIIl[45] = 121 ^ 69;
        llIIIlIIIl[46] = 216 ^ 194;
        llIIIlIIIl[47] = 11 ^ 16;
        llIIIlIIIl[48] = (58 ^ 33) ^ (23 ^ 16);
        llIIIlIIIl[49] = (132 ^ 151) ^ (161 ^ 175);
        llIIIlIIIl[50] = 87 ^ 72;
        llIIIlIIIl[51] = 67 ^ 99;
        llIIIlIIIl[52] = 49 ^ 16;
        llIIIlIIIl[53] = 135 ^ 165;
        llIIIlIIIl[54] = 57 ^ 26;
        llIIIlIIIl[55] = "   ".length() ^ (86 ^ 113);
        llIIIlIIIl[56] = (((49 + 53) - (-36)) + 28) ^ (((107 + 113) - 147) + 58);
        llIIIlIIIl[57] = 192 ^ 134;
        llIIIlIIIl[58] = (92 ^ 77) ^ (174 ^ 153);
        llIIIlIIIl[59] = (((79 + 90) - 119) + 105) ^ (((114 + 9) - 21) + 86);
        llIIIlIIIl[60] = (-4621) & 7084;
        llIIIlIIIl[61] = (-((-25115) & 29279)) & (-24578) & 32237;
        llIIIlIIIl[62] = 66 ^ 18;
        llIIIlIIIl[63] = 55 ^ 30;
        llIIIlIIIl[64] = (213 ^ 181) ^ (13 ^ 71);
        llIIIlIIIl[65] = (-((-8449) & 12565)) & (-25705) & 32765;
        llIIIlIIIl[66] = 43 ^ 0;
        llIIIlIIIl[67] = 84 ^ 120;
        llIIIlIIIl[68] = 125 ^ 80;
        llIIIlIIIl[69] = (((15 + 71) - 40) + 105) ^ (((22 + 15) - (-24)) + 124);
        llIIIlIIIl[70] = (((131 + 125) - 151) + 33) ^ (((84 + 104) - 52) + 29);
        llIIIlIIIl[71] = 84 ^ 100;
        llIIIlIIIl[72] = (((23 + 184) - 44) + 52) ^ (((127 + 139) - 174) + 49);
        llIIIlIIIl[73] = 94 ^ 111;
        llIIIlIIIl[74] = (67 ^ 3) ^ (227 ^ 144);
        llIIIlIIIl[75] = 246 ^ 194;
        llIIIlIIIl[76] = 131 ^ 182;
        llIIIlIIIl[77] = 72 ^ 126;
        llIIIlIIIl[78] = (((172 + 60) - 193) + 138) ^ (((80 + 20) - 16) + 50);
        llIIIlIIIl[79] = 164 ^ 156;
        llIIIlIIIl[80] = (241 ^ 175) ^ (70 ^ 33);
        llIIIlIIIl[81] = 25 ^ 35;
        llIIIlIIIl[82] = (((184 + 40) - 93) + 108) ^ (((31 + 36) - 11) + 83);
        llIIIlIIIl[83] = 5 ^ 62;
        llIIIlIIIl[84] = 252 ^ 193;
        llIIIlIIIl[85] = 33 ^ 31;
        llIIIlIIIl[86] = (-((-1833) & 14203)) & (-16909) & 31743;
        llIIIlIIIl[87] = (-12353) & 15831;
        llIIIlIIIl[88] = 58 ^ 5;
        llIIIlIIIl[89] = (((122 + 156) - 241) + 160) ^ (((118 + 43) - 106) + 78);
        llIIIlIIIl[90] = (((173 + 82) - 115) + 99) ^ (((3 + 94) - 71) + 148);
        llIIIlIIIl[91] = ((252 ^ 157) & ((113 ^ 16) ^ (-1))) ^ (49 ^ 115);
        llIIIlIIIl[92] = 100 ^ 39;
        llIIIlIIIl[93] = (((64 + 144) - 203) + 211) ^ (((55 + 11) - (-51)) + 39);
        llIIIlIIIl[94] = (-21521) & 23927;
        llIIIlIIIl[95] = (((87 + 46) - (-59)) + 9) ^ (((133 + 121) - 240) + 126);
        llIIIlIIIl[96] = 230 ^ 161;
        llIIIlIIIl[97] = (((210 + 112) - 142) + 67) ^ (((87 + 0) - 51) + 155);
        llIIIlIIIl[98] = 93 ^ 20;
        llIIIlIIIl[99] = (2 ^ 89) ^ (9 ^ 24);
        llIIIlIIIl[100] = (199 ^ 183) ^ (126 ^ 96);
        llIIIlIIIl[101] = 111 ^ 36;
        llIIIlIIIl[102] = (184 ^ 144) ^ (222 ^ 186);
        llIIIlIIIl[103] = 55 ^ 79;
        llIIIlIIIl[104] = (88 ^ 83) ^ (105 ^ 47);
        llIIIlIIIl[105] = 86 ^ 24;
        llIIIlIIIl[106] = (-22593) & 23381;
        llIIIlIIIl[107] = (-30326) & 32765;
        llIIIlIIIl[108] = (-18538) & 19327;
        llIIIlIIIl[109] = (-24579) & 27019;
        llIIIlIIIl[110] = (-31753) & 32543;
        llIIIlIIIl[111] = (-((-6147) & 31351)) & (-5121) & 32766;
        llIIIlIIIl[112] = (-21540) & 22331;
        llIIIlIIIl[113] = (-((-18841) & 32765)) & (-16401) & 32767;
        llIIIlIIIl[114] = (((245 ^ 145) + "  ".length()) - (84 ^ 22)) + (234 ^ 180);
        llIIIlIIIl[115] = 84 ^ 27;
        llIIIlIIIl[116] = 20 ^ 69;
        llIIIlIIIl[117] = (128 ^ 153) ^ (127 ^ 52);
        llIIIlIIIl[118] = (-30280) & 32767;
        llIIIlIIIl[119] = (-((-14473) & 30925)) & (-4097) & 30407;
        llIIIlIIIl[120] = 203 ^ 152;
        llIIIlIIIl[121] = (45 ^ 63) ^ (27 ^ 93);
        llIIIlIIIl[122] = (((8 + 16) - (-163)) + 28) ^ (((20 + 65) - 32) + 77);
        llIIIlIIIl[123] = ((93 + 55) - 111) + 103;
        llIIIlIIIl[124] = (159 ^ 183) ^ (105 ^ 23);
        llIIIlIIIl[125] = 224 ^ 183;
        llIIIlIIIl[126] = 104 ^ 48;
        llIIIlIIIl[127] = (((53 + 137) - 64) + 100) ^ (((64 + 24) - 7) + 106);
        llIIIlIIIl[128] = 9 ^ 82;
        llIIIlIIIl[129] = 242 ^ 174;
        llIIIlIIIl[130] = (-((-2499) & 31187)) & (-1094) & 32247;
        llIIIlIIIl[131] = (-6225) & 16120;
        llIIIlIIIl[132] = 72 ^ 21;
        llIIIlIIIl[133] = 83 ^ 13;
        llIIIlIIIl[134] = (-((-16949) & 23165)) & (-257) & 16364;
        llIIIlIIIl[135] = 211 ^ 140;
        llIIIlIIIl[136] = 236 ^ 140;
        llIIIlIIIl[137] = (-21001) & 23471;
        llIIIlIIIl[138] = (53 ^ 106) ^ (31 ^ 33);
        llIIIlIIIl[139] = (105 ^ 80) ^ (16 ^ 75);
        llIIIlIIIl[140] = (-13313) & 15787;
        llIIIlIIIl[141] = (159 ^ 160) ^ (221 ^ 129);
        llIIIlIIIl[142] = (-30285) & 32767;
        llIIIlIIIl[143] = (-6225) & 16127;
        llIIIlIIIl[144] = (119 ^ 103) ^ (36 ^ 81);
        llIIIlIIIl[145] = 2 ^ 100;
        llIIIlIIIl[146] = (-((-114) & 25719)) & (-4609) & 32703;
        llIIIlIIIl[147] = (((11 + 181) - (-40)) + 17) ^ (((59 + 121) - 96) + 74);
        llIIIlIIIl[148] = (((172 + 105) - 184) + 105) ^ (((114 + 46) - 60) + 74);
        llIIIlIIIl[149] = (-26185) & 28670;
        llIIIlIIIl[150] = (-((-5662) & 8061)) & (-4097) & 16383;
        llIIIlIIIl[151] = 10 ^ 99;
        llIIIlIIIl[152] = (189 ^ 142) ^ (1 ^ 88);
        llIIIlIIIl[153] = (-21074) & 23543;
        llIIIlIIIl[154] = (-((-6481) & 22877)) & (-1) & 26269;
        llIIIlIIIl[155] = 32 ^ 75;
        llIIIlIIIl[156] = 172 ^ 192;
        llIIIlIIIl[157] = (-((-1413) & 30695)) & (-2) & 31743;
        llIIIlIIIl[158] = (-20771) & 30650;
        llIIIlIIIl[159] = (235 ^ 191) ^ (103 ^ 94);
        llIIIlIIIl[160] = (-((-31653) & 32742)) & (-4133) & 7679;
        llIIIlIIIl[161] = (-((-25089) & 31597)) & (-16385) & 32767;
        llIIIlIIIl[162] = 253 ^ 146;
        llIIIlIIIl[163] = 236 ^ 156;
        llIIIlIIIl[164] = (-610) & 3055;
        llIIIlIIIl[165] = 205 ^ 188;
        llIIIlIIIl[166] = 40 ^ 90;
        llIIIlIIIl[167] = (-((-9113) & 29692)) & (-257) & 30719;
        llIIIlIIIl[168] = 117 ^ 6;
        llIIIlIIIl[169] = 0 ^ 116;
        llIIIlIIIl[170] = (-20579) & 23023;
        llIIIlIIIl[171] = 229 ^ 144;
        llIIIlIIIl[172] = 228 ^ 146;
        llIIIlIIIl[173] = (-28777) & 31229;
        llIIIlIIIl[174] = 12 ^ 123;
        llIIIlIIIl[175] = (-9833) & 12287;
        llIIIlIIIl[176] = (-(244 ^ 149)) & (-1) & 9983;
        llIIIlIIIl[177] = (107 ^ 6) ^ (181 ^ 161);
        llIIIlIIIl[178] = (108 ^ 122) ^ (80 ^ 60);
        llIIIlIIIl[179] = 252 ^ 135;
        llIIIlIIIl[180] = (-8) & 407;
        llIIIlIIIl[181] = (-((-2097) & 23089)) & (-8209) & 31700;
        llIIIlIIIl[182] = (-274) & 12253;
        llIIIlIIIl[183] = (-((-24585) & 29791)) & (-2050) & 32255;
        llIIIlIIIl[184] = (-((-4116) & 20763)) & (-1089) & 32735;
        llIIIlIIIl[185] = (-26705) & 27604;
        llIIIlIIIl[186] = (((62 ^ 54) + (116 ^ 13)) - (121 ^ 109)) + (83 ^ 96);
        llIIIlIIIl[187] = (160 ^ 151) ^ (120 ^ 51);
        llIIIlIIIl[188] = (-((-5373) & 29951)) & (-69) & 28143;
        llIIIlIIIl[189] = (-((-16549) & 30119)) & (-16393) & 32639;
        llIIIlIIIl[190] = (-24803) & 27890;
        llIIIlIIIl[191] = (-((-1699) & 5819)) & (-65) & 7647;
        llIIIlIIIl[192] = (-((-9353) & 14041)) & (-24577) & 32759;
        llIIIlIIIl[193] = (-((-19767) & 32182)) & (-1) & 15359;
        llIIIlIIIl[194] = (-8197) & 11238;
        llIIIlIIIl[195] = (-((-3513) & 32255)) & (-1025) & 32767;
        llIIIlIIIl[196] = (-9225) & 12270;
        llIIIlIIIl[197] = (-9) & 2396;
        llIIIlIIIl[198] = (-((-7705) & 15898)) & (-4677) & 16383;
        llIIIlIIIl[199] = (-((-1665) & 14071)) & (-1) & 15871;
        llIIIlIIIl[200] = (211 ^ 146) ^ (35 ^ 31);
        llIIIlIIIl[201] = 11 ^ 117;
        llIIIlIIIl[202] = ((48 + 23) - (-47)) + 9;
        llIIIlIIIl[203] = ((24 + 120) - 111) + 95;
        llIIIlIIIl[204] = ((37 + 38) - 27) + 81;
        llIIIlIIIl[205] = ((65 + 107) - 156) + 115;
        llIIIlIIIl[206] = ((0 + 7) - (-10)) + 115;
        llIIIlIIIl[207] = (((145 ^ 197) + (219 ^ 178)) - (226 ^ 186)) + (113 ^ 81);
        llIIIlIIIl[208] = ((102 + 57) - 52) + 27;
        llIIIlIIIl[209] = ((46 + 79) - 41) + 51;
        llIIIlIIIl[210] = ((54 + 48) - 96) + 130;
        llIIIlIIIl[211] = (((9 ^ 67) + (227 ^ 181)) - (57 ^ 92)) + (60 ^ 114);
        llIIIlIIIl[212] = (((97 ^ 109) + (52 ^ 13)) - (119 ^ 69)) + (101 ^ 18);
        llIIIlIIIl[213] = ((113 + 106) - 113) + 33;
    }
}
