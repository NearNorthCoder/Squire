/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Prayer
 *  net.runelite.api.Skill
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Bank$WithdrawMode
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 *  net.unethicalite.api.widgets.Dialog
 *  net.unethicalite.api.widgets.Prayers
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
import net.runelite.api.Prayer;
import net.runelite.api.Skill;
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
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.I;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.a;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.aN;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.ac;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.av;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.b;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.d;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.e;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.f;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.g;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.h;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.j;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.m;

public class C
implements ac {
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
    public static /* synthetic */ List<d> bv;
    private static /* synthetic */ String[] llIIIlIIII;
    public static /* synthetic */ String da;

    public static void bB() {
        if (C.lIlIIlIlIlIIl(eH ? 1 : 0) && C.lIlIIlIlIlIIl(g.M() ? 1 : 0)) {
            if (C.lIlIIlIlIllIl(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llIIIlIIIl[130], llIIIlIIIl[131], llIIIlIIIl[1])), llIIIlIIIl[3])) {
                Movement.walkTo((WorldPoint)new WorldPoint(llIIIlIIIl[130], llIIIlIIIl[131], llIIIlIIIl[1]));
                0;
                Time.sleepTicks((int)llIIIlIIIl[0]);
                0;
            }
            if (C.lIlIIlIlIlllI(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llIIIlIIIl[130], llIIIlIIIl[131], llIIIlIIIl[1])), llIIIlIIIl[3]) && C.lIlIIlIlIlIIl(Players.getLocal().isMoving() ? 1 : 0)) {
                if (C.lIlIIlIlIlIIl(Dialog.isOpen() ? 1 : 0)) {
                    Time.sleepTicks((int)llIIIlIIIl[3]);
                    0;
                    String[] stringArray = new String[llIIIlIIIl[0]];
                    stringArray[C.llIIIlIIIl[1]] = llIIIlIIII[llIIIlIIIl[132]];
                    TileObjects.getNearest((String[])stringArray).interact(llIIIlIIII[llIIIlIIIl[133]]);
                    Time.sleepTicks((int)llIIIlIIIl[3]);
                    0;
                    eH = llIIIlIIIl[0];
                }
                g.a(cE);
            }
        }
        if (C.lIlIIlIlIlIIl(eI ? 1 : 0) && C.lIlIIlIlIIlll(eH ? 1 : 0) && C.lIlIIlIlIlIIl(g.M() ? 1 : 0)) {
            if (C.lIlIIlIlIllIl(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llIIIlIIIl[60], llIIIlIIIl[134], llIIIlIIIl[1])), llIIIlIIIl[3]) && C.lIlIIlIlIIlll(Movement.walkTo((WorldPoint)new WorldPoint(llIIIlIIIl[60], llIIIlIIIl[134], llIIIlIIIl[1])) ? 1 : 0)) {
                Time.sleepTicks((int)llIIIlIIIl[0]);
                0;
            }
            if (C.lIlIIlIlIlllI(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llIIIlIIIl[60], llIIIlIIIl[134], llIIIlIIIl[1])), llIIIlIIIl[3]) && C.lIlIIlIlIlIIl(Players.getLocal().isMoving() ? 1 : 0)) {
                if (C.lIlIIlIlIlIIl(Dialog.isOpen() ? 1 : 0)) {
                    Time.sleepTicks((int)llIIIlIIIl[3]);
                    0;
                    String[] stringArray = new String[llIIIlIIIl[0]];
                    stringArray[C.llIIIlIIIl[1]] = llIIIlIIII[llIIIlIIIl[135]];
                    TileObjects.getNearest((String[])stringArray).interact(llIIIlIIII[llIIIlIIIl[136]]);
                    Time.sleepTicks((int)llIIIlIIIl[3]);
                    0;
                    eI = llIIIlIIIl[0];
                }
                g.a(cE);
            }
        }
        if (C.lIlIIlIlIlIIl(eJ ? 1 : 0) && C.lIlIIlIlIIlll(eI ? 1 : 0) && C.lIlIIlIlIlIIl(g.M() ? 1 : 0)) {
            if (C.lIlIIlIlIllIl(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llIIIlIIIl[137], llIIIlIIIl[134], llIIIlIIIl[1])), llIIIlIIIl[3]) && C.lIlIIlIlIIlll(Movement.walkTo((WorldPoint)new WorldPoint(llIIIlIIIl[137], llIIIlIIIl[134], llIIIlIIIl[1])) ? 1 : 0)) {
                Time.sleepTicks((int)llIIIlIIIl[0]);
                0;
            }
            if (C.lIlIIlIlIlllI(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llIIIlIIIl[137], llIIIlIIIl[134], llIIIlIIIl[1])), llIIIlIIIl[3]) && C.lIlIIlIlIlIIl(Players.getLocal().isMoving() ? 1 : 0)) {
                if (C.lIlIIlIlIlIIl(Dialog.isOpen() ? 1 : 0)) {
                    Time.sleepTicks((int)llIIIlIIIl[3]);
                    0;
                    String[] stringArray = new String[llIIIlIIIl[0]];
                    stringArray[C.llIIIlIIIl[1]] = llIIIlIIII[llIIIlIIIl[138]];
                    TileObjects.getNearest((String[])stringArray).interact(llIIIlIIII[llIIIlIIIl[139]]);
                    Time.sleepTicks((int)llIIIlIIIl[3]);
                    0;
                    eJ = llIIIlIIIl[0];
                }
                g.a(cE);
            }
        }
        if (C.lIlIIlIlIlIIl(eK ? 1 : 0) && C.lIlIIlIlIIlll(eJ ? 1 : 0) && C.lIlIIlIlIlIIl(g.M() ? 1 : 0)) {
            if (C.lIlIIlIlIllIl(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llIIIlIIIl[140], llIIIlIIIl[131], llIIIlIIIl[1])), llIIIlIIIl[3]) && C.lIlIIlIlIIlll(Movement.walkTo((WorldPoint)new WorldPoint(llIIIlIIIl[140], llIIIlIIIl[131], llIIIlIIIl[1])) ? 1 : 0)) {
                Time.sleepTicks((int)llIIIlIIIl[0]);
                0;
            }
            if (C.lIlIIlIlIlllI(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llIIIlIIIl[140], llIIIlIIIl[131], llIIIlIIIl[1])), llIIIlIIIl[3]) && C.lIlIIlIlIlIIl(Players.getLocal().isMoving() ? 1 : 0)) {
                if (C.lIlIIlIlIlIIl(Dialog.isOpen() ? 1 : 0)) {
                    Time.sleepTicks((int)llIIIlIIIl[3]);
                    0;
                    String[] stringArray = new String[llIIIlIIIl[0]];
                    stringArray[C.llIIIlIIIl[1]] = llIIIlIIII[llIIIlIIIl[141]];
                    TileObjects.getNearest((String[])stringArray).interact(llIIIlIIII[llIIIlIIIl[82]]);
                    Time.sleepTicks((int)llIIIlIIIl[3]);
                    0;
                    eK = llIIIlIIIl[0];
                }
                g.a(cE);
            }
        }
        if (C.lIlIIlIlIlIIl(eL ? 1 : 0) && C.lIlIIlIlIIlll(eK ? 1 : 0) && C.lIlIIlIlIlIIl(g.M() ? 1 : 0)) {
            if (C.lIlIIlIlIllIl(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llIIIlIIIl[142], llIIIlIIIl[143], llIIIlIIIl[1])), llIIIlIIIl[3]) && C.lIlIIlIlIIlll(Movement.walkTo((WorldPoint)new WorldPoint(llIIIlIIIl[142], llIIIlIIIl[143], llIIIlIIIl[1])) ? 1 : 0)) {
                Time.sleepTicks((int)llIIIlIIIl[0]);
                0;
            }
            if (C.lIlIIlIlIlllI(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llIIIlIIIl[142], llIIIlIIIl[143], llIIIlIIIl[1])), llIIIlIIIl[3]) && C.lIlIIlIlIlIIl(Players.getLocal().isMoving() ? 1 : 0)) {
                if (C.lIlIIlIlIlIIl(Dialog.isOpen() ? 1 : 0)) {
                    Time.sleepTicks((int)llIIIlIIIl[3]);
                    0;
                    String[] stringArray = new String[llIIIlIIIl[0]];
                    stringArray[C.llIIIlIIIl[1]] = llIIIlIIII[llIIIlIIIl[144]];
                    TileObjects.getNearest((String[])stringArray).interact(llIIIlIIII[llIIIlIIIl[145]]);
                    Time.sleepTicks((int)llIIIlIIIl[3]);
                    0;
                    eL = llIIIlIIIl[0];
                }
                g.a(cE);
            }
        }
        if (C.lIlIIlIlIlIIl(eM ? 1 : 0) && C.lIlIIlIlIIlll(eL ? 1 : 0) && C.lIlIIlIlIlIIl(g.M() ? 1 : 0)) {
            if (C.lIlIIlIlIllIl(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llIIIlIIIl[146], llIIIlIIIl[134], llIIIlIIIl[1])), llIIIlIIIl[3]) && C.lIlIIlIlIIlll(Movement.walkTo((WorldPoint)new WorldPoint(llIIIlIIIl[146], llIIIlIIIl[134], llIIIlIIIl[1])) ? 1 : 0)) {
                Time.sleepTicks((int)llIIIlIIIl[0]);
                0;
            }
            if (C.lIlIIlIlIlllI(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llIIIlIIIl[146], llIIIlIIIl[134], llIIIlIIIl[1])), llIIIlIIIl[3]) && C.lIlIIlIlIlIIl(Players.getLocal().isMoving() ? 1 : 0)) {
                if (C.lIlIIlIlIlIIl(Dialog.isOpen() ? 1 : 0)) {
                    Time.sleepTicks((int)llIIIlIIIl[3]);
                    0;
                    String[] stringArray = new String[llIIIlIIIl[0]];
                    stringArray[C.llIIIlIIIl[1]] = llIIIlIIII[llIIIlIIIl[147]];
                    TileObjects.getNearest((String[])stringArray).interact(llIIIlIIII[llIIIlIIIl[148]]);
                    Time.sleepTicks((int)llIIIlIIIl[3]);
                    0;
                    eM = llIIIlIIIl[0];
                }
                g.a(cE);
            }
        }
        if (C.lIlIIlIlIlIIl(eN ? 1 : 0) && C.lIlIIlIlIIlll(eM ? 1 : 0) && C.lIlIIlIlIlIIl(g.M() ? 1 : 0)) {
            if (C.lIlIIlIlIllIl(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llIIIlIIIl[149], llIIIlIIIl[150], llIIIlIIIl[1])), llIIIlIIIl[3]) && C.lIlIIlIlIIlll(Movement.walkTo((WorldPoint)new WorldPoint(llIIIlIIIl[149], llIIIlIIIl[150], llIIIlIIIl[1])) ? 1 : 0)) {
                Time.sleepTicks((int)llIIIlIIIl[0]);
                0;
            }
            if (C.lIlIIlIlIlllI(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llIIIlIIIl[149], llIIIlIIIl[150], llIIIlIIIl[1])), llIIIlIIIl[3]) && C.lIlIIlIlIlIIl(Players.getLocal().isMoving() ? 1 : 0)) {
                if (C.lIlIIlIlIlIIl(Dialog.isOpen() ? 1 : 0)) {
                    Time.sleepTicks((int)llIIIlIIIl[3]);
                    0;
                    String[] stringArray = new String[llIIIlIIIl[0]];
                    stringArray[C.llIIIlIIIl[1]] = llIIIlIIII[llIIIlIIIl[151]];
                    TileObjects.getNearest((String[])stringArray).interact(llIIIlIIII[llIIIlIIIl[152]]);
                    Time.sleepTicks((int)llIIIlIIIl[3]);
                    0;
                    eN = llIIIlIIIl[0];
                }
                g.a(cE);
            }
        }
        if (C.lIlIIlIlIlIIl(eO ? 1 : 0) && C.lIlIIlIlIIlll(eN ? 1 : 0) && C.lIlIIlIlIlIIl(g.M() ? 1 : 0)) {
            if (C.lIlIIlIlIllIl(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llIIIlIIIl[153], llIIIlIIIl[154], llIIIlIIIl[1])), llIIIlIIIl[3]) && C.lIlIIlIlIIlll(Movement.walkTo((WorldPoint)new WorldPoint(llIIIlIIIl[153], llIIIlIIIl[154], llIIIlIIIl[1])) ? 1 : 0)) {
                Time.sleepTicks((int)llIIIlIIIl[0]);
                0;
            }
            if (C.lIlIIlIlIlllI(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llIIIlIIIl[153], llIIIlIIIl[154], llIIIlIIIl[1])), llIIIlIIIl[3]) && C.lIlIIlIlIlIIl(Players.getLocal().isMoving() ? 1 : 0)) {
                if (C.lIlIIlIlIlIIl(Dialog.isOpen() ? 1 : 0)) {
                    Time.sleepTicks((int)llIIIlIIIl[3]);
                    0;
                    String[] stringArray = new String[llIIIlIIIl[0]];
                    stringArray[C.llIIIlIIIl[1]] = llIIIlIIII[llIIIlIIIl[155]];
                    TileObjects.getNearest((String[])stringArray).interact(llIIIlIIII[llIIIlIIIl[156]]);
                    Time.sleepTicks((int)llIIIlIIIl[3]);
                    0;
                    eO = llIIIlIIIl[0];
                }
                g.a(cE);
            }
        }
        if (C.lIlIIlIlIlIIl(eP ? 1 : 0) && C.lIlIIlIlIIlll(eO ? 1 : 0) && C.lIlIIlIlIlIIl(g.M() ? 1 : 0)) {
            if (C.lIlIIlIlIllIl(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llIIIlIIIl[157], llIIIlIIIl[158], llIIIlIIIl[1])), llIIIlIIIl[3]) && C.lIlIIlIlIIlll(Movement.walkTo((WorldPoint)new WorldPoint(llIIIlIIIl[157], llIIIlIIIl[158], llIIIlIIIl[1])) ? 1 : 0)) {
                Time.sleepTicks((int)llIIIlIIIl[0]);
                0;
            }
            if (C.lIlIIlIlIlllI(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llIIIlIIIl[157], llIIIlIIIl[158], llIIIlIIIl[1])), llIIIlIIIl[3]) && C.lIlIIlIlIlIIl(Players.getLocal().isMoving() ? 1 : 0)) {
                if (C.lIlIIlIlIlIIl(Dialog.isOpen() ? 1 : 0)) {
                    Time.sleepTicks((int)llIIIlIIIl[3]);
                    0;
                    String[] stringArray = new String[llIIIlIIIl[0]];
                    stringArray[C.llIIIlIIIl[1]] = llIIIlIIII[llIIIlIIIl[159]];
                    TileObjects.getNearest((String[])stringArray).interact(llIIIlIIII[llIIIlIIIl[100]]);
                    Time.sleepTicks((int)llIIIlIIIl[3]);
                    0;
                    eP = llIIIlIIIl[0];
                }
                g.a(cE);
            }
        }
        if (C.lIlIIlIlIlIIl(eQ ? 1 : 0) && C.lIlIIlIlIIlll(eP ? 1 : 0) && C.lIlIIlIlIlIIl(g.M() ? 1 : 0)) {
            if (C.lIlIIlIlIllIl(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llIIIlIIIl[160], llIIIlIIIl[161], llIIIlIIIl[1])), llIIIlIIIl[3]) && C.lIlIIlIlIIlll(Movement.walkTo((WorldPoint)new WorldPoint(llIIIlIIIl[160], llIIIlIIIl[161], llIIIlIIIl[1])) ? 1 : 0)) {
                Time.sleepTicks((int)llIIIlIIIl[0]);
                0;
            }
            if (C.lIlIIlIlIlllI(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llIIIlIIIl[160], llIIIlIIIl[161], llIIIlIIIl[1])), llIIIlIIIl[3]) && C.lIlIIlIlIlIIl(Players.getLocal().isMoving() ? 1 : 0)) {
                if (C.lIlIIlIlIlIIl(Dialog.isOpen() ? 1 : 0)) {
                    Time.sleepTicks((int)llIIIlIIIl[3]);
                    0;
                    String[] stringArray = new String[llIIIlIIIl[0]];
                    stringArray[C.llIIIlIIIl[1]] = llIIIlIIII[llIIIlIIIl[162]];
                    TileObjects.getNearest((String[])stringArray).interact(llIIIlIIII[llIIIlIIIl[163]]);
                    Time.sleepTicks((int)llIIIlIIIl[3]);
                    0;
                    eQ = llIIIlIIIl[0];
                }
                g.a(cE);
            }
        }
        if (C.lIlIIlIlIlIIl(eR ? 1 : 0) && C.lIlIIlIlIIlll(eQ ? 1 : 0) && C.lIlIIlIlIlIIl(g.M() ? 1 : 0)) {
            if (C.lIlIIlIlIllIl(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llIIIlIIIl[164], llIIIlIIIl[158], llIIIlIIIl[1])), llIIIlIIIl[3]) && C.lIlIIlIlIIlll(Movement.walkTo((WorldPoint)new WorldPoint(llIIIlIIIl[164], llIIIlIIIl[158], llIIIlIIIl[1])) ? 1 : 0)) {
                Time.sleepTicks((int)llIIIlIIIl[0]);
                0;
            }
            if (C.lIlIIlIlIlllI(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llIIIlIIIl[164], llIIIlIIIl[158], llIIIlIIIl[1])), llIIIlIIIl[3]) && C.lIlIIlIlIlIIl(Players.getLocal().isMoving() ? 1 : 0)) {
                if (C.lIlIIlIlIlIIl(Dialog.isOpen() ? 1 : 0)) {
                    Time.sleepTicks((int)llIIIlIIIl[3]);
                    0;
                    String[] stringArray = new String[llIIIlIIIl[0]];
                    stringArray[C.llIIIlIIIl[1]] = llIIIlIIII[llIIIlIIIl[165]];
                    TileObjects.getNearest((String[])stringArray).interact(llIIIlIIII[llIIIlIIIl[166]]);
                    Time.sleepTicks((int)llIIIlIIIl[3]);
                    0;
                    eR = llIIIlIIIl[0];
                }
                g.a(cE);
            }
        }
        if (C.lIlIIlIlIlIIl(eS ? 1 : 0) && C.lIlIIlIlIIlll(eR ? 1 : 0) && C.lIlIIlIlIlIIl(g.M() ? 1 : 0)) {
            if (C.lIlIIlIlIllIl(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llIIIlIIIl[109], llIIIlIIIl[167], llIIIlIIIl[1])), llIIIlIIIl[3]) && C.lIlIIlIlIIlll(Movement.walkTo((WorldPoint)new WorldPoint(llIIIlIIIl[109], llIIIlIIIl[167], llIIIlIIIl[1])) ? 1 : 0)) {
                Time.sleepTicks((int)llIIIlIIIl[0]);
                0;
            }
            if (C.lIlIIlIlIlllI(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llIIIlIIIl[109], llIIIlIIIl[167], llIIIlIIIl[1])), llIIIlIIIl[3]) && C.lIlIIlIlIlIIl(Players.getLocal().isMoving() ? 1 : 0)) {
                if (C.lIlIIlIlIlIIl(Dialog.isOpen() ? 1 : 0)) {
                    Time.sleepTicks((int)llIIIlIIIl[3]);
                    0;
                    String[] stringArray = new String[llIIIlIIIl[0]];
                    stringArray[C.llIIIlIIIl[1]] = llIIIlIIII[llIIIlIIIl[168]];
                    TileObjects.getNearest((String[])stringArray).interact(llIIIlIIII[llIIIlIIIl[169]]);
                    Time.sleepTicks((int)llIIIlIIIl[3]);
                    0;
                    eS = llIIIlIIIl[0];
                }
                g.a(cE);
            }
        }
        if (C.lIlIIlIlIlIIl(eT ? 1 : 0) && C.lIlIIlIlIIlll(eS ? 1 : 0) && C.lIlIIlIlIlIIl(g.M() ? 1 : 0)) {
            if (C.lIlIIlIlIllIl(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llIIIlIIIl[170], llIIIlIIIl[134], llIIIlIIIl[1])), llIIIlIIIl[3]) && C.lIlIIlIlIIlll(Movement.walkTo((WorldPoint)new WorldPoint(llIIIlIIIl[170], llIIIlIIIl[134], llIIIlIIIl[1])) ? 1 : 0)) {
                Time.sleepTicks((int)llIIIlIIIl[0]);
                0;
            }
            if (C.lIlIIlIlIlllI(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llIIIlIIIl[170], llIIIlIIIl[134], llIIIlIIIl[1])), llIIIlIIIl[3]) && C.lIlIIlIlIlIIl(Players.getLocal().isMoving() ? 1 : 0)) {
                if (C.lIlIIlIlIlIIl(Dialog.isOpen() ? 1 : 0)) {
                    Time.sleepTicks((int)llIIIlIIIl[3]);
                    0;
                    String[] stringArray = new String[llIIIlIIIl[0]];
                    stringArray[C.llIIIlIIIl[1]] = llIIIlIIII[llIIIlIIIl[171]];
                    TileObjects.getNearest((String[])stringArray).interact(llIIIlIIII[llIIIlIIIl[172]]);
                    Time.sleepTicks((int)llIIIlIIIl[3]);
                    0;
                    eT = llIIIlIIIl[0];
                }
                g.a(cE);
            }
        }
        if (C.lIlIIlIlIlIIl(eU ? 1 : 0) && C.lIlIIlIlIIlll(eT ? 1 : 0) && C.lIlIIlIlIlIIl(g.M() ? 1 : 0)) {
            if (C.lIlIIlIlIllIl(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llIIIlIIIl[173], llIIIlIIIl[134], llIIIlIIIl[1])), llIIIlIIIl[3]) && C.lIlIIlIlIIlll(Movement.walkTo((WorldPoint)new WorldPoint(llIIIlIIIl[173], llIIIlIIIl[134], llIIIlIIIl[1])) ? 1 : 0)) {
                Time.sleepTicks((int)llIIIlIIIl[0]);
                0;
            }
            if (C.lIlIIlIlIlllI(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llIIIlIIIl[173], llIIIlIIIl[134], llIIIlIIIl[1])), llIIIlIIIl[3]) && C.lIlIIlIlIlIIl(Players.getLocal().isMoving() ? 1 : 0)) {
                if (C.lIlIIlIlIlIIl(Dialog.isOpen() ? 1 : 0)) {
                    Time.sleepTicks((int)llIIIlIIIl[3]);
                    0;
                    String[] stringArray = new String[llIIIlIIIl[0]];
                    stringArray[C.llIIIlIIIl[1]] = llIIIlIIII[llIIIlIIIl[174]];
                    TileObjects.getNearest((String[])stringArray).interact(llIIIlIIII[llIIIlIIIl[103]]);
                    Time.sleepTicks((int)llIIIlIIIl[3]);
                    0;
                    eU = llIIIlIIIl[0];
                }
                g.a(cE);
            }
        }
        if (C.lIlIIlIlIlIIl(eV ? 1 : 0) && C.lIlIIlIlIIlll(eU ? 1 : 0) && C.lIlIIlIlIlIIl(g.M() ? 1 : 0)) {
            if (C.lIlIIlIlIllIl(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llIIIlIIIl[175], llIIIlIIIl[176], llIIIlIIIl[1])), llIIIlIIIl[3]) && C.lIlIIlIlIIlll(Movement.walkTo((WorldPoint)new WorldPoint(llIIIlIIIl[175], llIIIlIIIl[176], llIIIlIIIl[1])) ? 1 : 0)) {
                Time.sleepTicks((int)llIIIlIIIl[0]);
                0;
            }
            if (C.lIlIIlIlIlllI(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llIIIlIIIl[175], llIIIlIIIl[176], llIIIlIIIl[1])), llIIIlIIIl[3]) && C.lIlIIlIlIlIIl(Players.getLocal().isMoving() ? 1 : 0)) {
                if (C.lIlIIlIlIlIIl(Dialog.isOpen() ? 1 : 0)) {
                    Time.sleepTicks((int)llIIIlIIIl[3]);
                    0;
                    String[] stringArray = new String[llIIIlIIIl[0]];
                    stringArray[C.llIIIlIIIl[1]] = llIIIlIIII[llIIIlIIIl[177]];
                    TileObjects.getNearest((String[])stringArray).interact(llIIIlIIII[llIIIlIIIl[178]]);
                    Time.sleepTicks((int)llIIIlIIIl[3]);
                    0;
                    eV = llIIIlIIIl[0];
                }
                g.a(cE);
            }
        }
        if (C.lIlIIlIlIIlll(eV ? 1 : 0)) {
            String[] stringArray = new String[llIIIlIIIl[0]];
            stringArray[C.llIIIlIIIl[1]] = llIIIlIIII[llIIIlIIIl[179]];
            if (C.lIlIIlIlIlIIl(Inventory.contains((String[])stringArray) ? 1 : 0)) {
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

    @Override
    public boolean ae() {
        return llIIIlIIIl[1];
    }

    private static boolean lIlIIlIlIllll(int n2, int n3) {
        return n2 != n3;
    }

    private static void Q() {
        block33: {
            d llllllllllllllllllIlIllllllIllll;
            block32: {
                block31: {
                    block30: {
                        Object llllllllllllllllllIlIlllllllIIII;
                        block29: {
                            block28: {
                                block27: {
                                    block26: {
                                        block25: {
                                            block24: {
                                                block23: {
                                                    block22: {
                                                        int[] nArray = new int[llIIIlIIIl[0]];
                                                        nArray[C.llIIIlIIIl[1]] = llIIIlIIIl[15];
                                                        if (!C.lIlIIlIlIIlll(Bank.contains((int[])nArray) ? 1 : 0)) break block22;
                                                        int[] nArray2 = new int[llIIIlIIIl[0]];
                                                        nArray2[C.llIIIlIIIl[1]] = llIIIlIIIl[15];
                                                        if (!C.lIlIIlIlIIlll(Bank.contains((int[])nArray2) ? 1 : 0)) break block23;
                                                        int[] nArray3 = new int[llIIIlIIIl[0]];
                                                        nArray3[C.llIIIlIIIl[1]] = llIIIlIIIl[15];
                                                        if (!C.lIlIIlIlIlIII(Bank.getFirst((int[])nArray3).getQuantity(), llIIIlIIIl[16])) break block23;
                                                    }
                                                    llllllllllllllllllIlIlllllllIIII = new d(llIIIlIIIl[15], llIIIlIIIl[16], e.c(llIIIlIIIl[180], llIIIlIIIl[20]));
                                                    bv.add((d)llllllllllllllllllIlIlllllllIIII);
                                                    0;
                                                }
                                                int[] nArray = new int[llIIIlIIIl[0]];
                                                nArray[C.llIIIlIIIl[1]] = llIIIlIIIl[7];
                                                if (!C.lIlIIlIlIIlll(Bank.contains((int[])nArray) ? 1 : 0)) break block24;
                                                int[] nArray4 = new int[llIIIlIIIl[0]];
                                                nArray4[C.llIIIlIIIl[1]] = llIIIlIIIl[7];
                                                if (!C.lIlIIlIlIIlll(Bank.contains((int[])nArray4) ? 1 : 0)) break block25;
                                                int[] nArray5 = new int[llIIIlIIIl[0]];
                                                nArray5[C.llIIIlIIIl[1]] = llIIIlIIIl[7];
                                                if (!C.lIlIIlIlIlIII(Bank.getFirst((int[])nArray5).getQuantity(), llIIIlIIIl[181])) break block25;
                                            }
                                            llllllllllllllllllIlIlllllllIIII = new d(llIIIlIIIl[7], llIIIlIIIl[181], llIIIlIIIl[25]);
                                            bv.add((d)llllllllllllllllllIlIlllllllIIII);
                                            0;
                                        }
                                        int[] nArray = new int[llIIIlIIIl[0]];
                                        nArray[C.llIIIlIIIl[1]] = llIIIlIIIl[9];
                                        if (!C.lIlIIlIlIIlll(Bank.contains((int[])nArray) ? 1 : 0)) break block26;
                                        int[] nArray6 = new int[llIIIlIIIl[0]];
                                        nArray6[C.llIIIlIIIl[1]] = llIIIlIIIl[9];
                                        if (!C.lIlIIlIlIIlll(Bank.contains((int[])nArray6) ? 1 : 0)) break block27;
                                        int[] nArray7 = new int[llIIIlIIIl[0]];
                                        nArray7[C.llIIIlIIIl[1]] = llIIIlIIIl[9];
                                        if (!C.lIlIIlIlIlIII(Bank.getFirst((int[])nArray7).getQuantity(), llIIIlIIIl[10])) break block27;
                                    }
                                    llllllllllllllllllIlIlllllllIIII = new d(llIIIlIIIl[9], llIIIlIIIl[10], llIIIlIIIl[25]);
                                    bv.add((d)llllllllllllllllllIlIlllllllIIII);
                                    0;
                                }
                                int[] nArray = new int[llIIIlIIIl[0]];
                                nArray[C.llIIIlIIIl[1]] = llIIIlIIIl[11];
                                if (!C.lIlIIlIlIIlll(Bank.contains((int[])nArray) ? 1 : 0)) break block28;
                                int[] nArray8 = new int[llIIIlIIIl[0]];
                                nArray8[C.llIIIlIIIl[1]] = llIIIlIIIl[11];
                                if (!C.lIlIIlIlIIlll(Bank.contains((int[])nArray8) ? 1 : 0)) break block29;
                                int[] nArray9 = new int[llIIIlIIIl[0]];
                                nArray9[C.llIIIlIIIl[1]] = llIIIlIIIl[11];
                                if (!C.lIlIIlIlIlIII(Bank.getFirst((int[])nArray9).getQuantity(), llIIIlIIIl[12])) break block29;
                            }
                            llllllllllllllllllIlIlllllllIIII = new d(llIIIlIIIl[11], llIIIlIIIl[12], llIIIlIIIl[8]);
                            bv.add((d)llllllllllllllllllIlIlllllllIIII);
                            0;
                        }
                        if (C.lIlIIlIlIlIIl(Bank.contains((Predicate)(llllllllllllllllllIlIlllllllIIII = item -> item.getName().toLowerCase().contains(llIIIlIIII[llIIIlIIIl[187]]))) ? 1 : 0)) {
                            llllllllllllllllllIlIllllllIllll = new d(llIIIlIIIl[182], llIIIlIIIl[12], llIIIlIIIl[183]);
                            bv.add(llllllllllllllllllIlIllllllIllll);
                            0;
                        }
                        int[] nArray = new int[llIIIlIIIl[0]];
                        nArray[C.llIIIlIIIl[1]] = llIIIlIIIl[13];
                        if (!C.lIlIIlIlIIlll(Bank.contains((int[])nArray) ? 1 : 0)) break block30;
                        int[] nArray10 = new int[llIIIlIIIl[0]];
                        nArray10[C.llIIIlIIIl[1]] = llIIIlIIIl[13];
                        if (!C.lIlIIlIlIIlll(Bank.contains((int[])nArray10) ? 1 : 0)) break block31;
                        int[] nArray11 = new int[llIIIlIIIl[0]];
                        nArray11[C.llIIIlIIIl[1]] = llIIIlIIIl[13];
                        if (!C.lIlIIlIlIlIII(Bank.getFirst((int[])nArray11).getQuantity(), llIIIlIIIl[6])) break block31;
                    }
                    llllllllllllllllllIlIllllllIllll = new d(llIIIlIIIl[13], llIIIlIIIl[6], j.cf);
                    bv.add(llllllllllllllllllIlIllllllIllll);
                    0;
                }
                int[] nArray = new int[llIIIlIIIl[0]];
                nArray[C.llIIIlIIIl[1]] = llIIIlIIIl[14];
                if (C.lIlIIlIlIIlll(Bank.contains((int[])nArray) ? 1 : 0)) {
                    int[] nArray12 = new int[llIIIlIIIl[0]];
                    nArray12[C.llIIIlIIIl[1]] = llIIIlIIIl[14];
                    if (C.lIlIIlIlIlIII(Bank.getFirst((int[])nArray12).getQuantity(), llIIIlIIIl[6])) {
                        int[] nArray13 = new int[llIIIlIIIl[0]];
                        nArray13[C.llIIIlIIIl[1]] = llIIIlIIIl[14];
                        llllllllllllllllllIlIllllllIllll = new d(llIIIlIIIl[14], llIIIlIIIl[6] - Bank.getFirst((int[])nArray13).getQuantity(), llIIIlIIIl[184]);
                        bv.add(llllllllllllllllllIlIllllllIllll);
                        0;
                    }
                }
                int[] nArray14 = new int[llIIIlIIIl[0]];
                nArray14[C.llIIIlIIIl[1]] = llIIIlIIIl[14];
                if (C.lIlIIlIlIlIIl(Bank.contains((int[])nArray14) ? 1 : 0)) {
                    llllllllllllllllllIlIllllllIllll = new d(llIIIlIIIl[14], llIIIlIIIl[6], llIIIlIIIl[184]);
                    bv.add(llllllllllllllllllIlIllllllIllll);
                    0;
                }
                int[] nArray15 = new int[llIIIlIIIl[0]];
                nArray15[C.llIIIlIIIl[1]] = llIIIlIIIl[17];
                if (!C.lIlIIlIlIIlll(Bank.contains((int[])nArray15) ? 1 : 0)) break block32;
                int[] nArray16 = new int[llIIIlIIIl[0]];
                nArray16[C.llIIIlIIIl[1]] = llIIIlIIIl[17];
                if (!C.lIlIIlIlIIlll(Bank.contains((int[])nArray16) ? 1 : 0)) break block33;
                int[] nArray17 = new int[llIIIlIIIl[0]];
                nArray17[C.llIIIlIIIl[1]] = llIIIlIIIl[17];
                if (!C.lIlIIlIlIlIII(Bank.getFirst((int[])nArray17).getQuantity(), llIIIlIIIl[26])) break block33;
            }
            llllllllllllllllllIlIllllllIllll = new d(llIIIlIIIl[17], llIIIlIIIl[36], llIIIlIIIl[185]);
            bv.add(llllllllllllllllllIlIllllllIllll);
            0;
        }
    }

    private static void lIlIIlIlIIlIl() {
        llIIIlIIII = new String[llIIIlIIIl[213]];
        C.llIIIlIIII[C.llIIIlIIIl[1]] = C."Finished buying items, switching back to quest";
        C.llIIIlIIII[C.llIIIlIIIl[0]] = C."- Agility";
        C.llIIIlIIII[C.llIIIlIIIl[3]] = C."";
        C.llIIIlIIII[C.llIIIlIIIl[4]] = C."Nav to bank";
        C.llIIIlIIII[C.llIIIlIIIl[6]] = C."Handling banking";
        C.llIIIlIIII[C.llIIIlIIIl[12]] = C."We are missing quest supplies, switching to BUYING";
        C.llIIIlIIII[C.llIIIlIIIl[19]] = C."We are missing quest supplies, switching to BUYING";
        C.llIIIlIIII[C.llIIIlIIIl[23]] = C."Drink";
        C.llIIIlIIII[C.llIIIlIIIl[25]] = C."Eat";
        C.llIIIlIIII[C.llIIIlIIIl[27]] = C."Nav to start";
        C.llIIIlIIII[C.llIIIlIIIl[16]] = C."King Narnode Shareen";
        C.llIIIlIIII[C.llIIIlIIIl[29]] = C."Hazelmere's scroll";
        C.llIIIlIIII[C.llIIIlIIIl[24]] = C."Nav to hazelmere";
        C.llIIIlIIII[C.llIIIlIIIl[30]] = C."Hazelmere";
        C.llIIIlIIII[C.llIIIlIIIl[31]] = C."Hazelmere's scroll";
        C.llIIIlIIII[C.llIIIlIIIl[26]] = C."Nav to start";
        C.llIIIlIIII[C.llIIIlIIIl[32]] = C."Break";
        C.llIIIlIIII[C.llIIIlIIIl[37]] = C."King Narnode Shareen";
        C.llIIIlIIII[C.llIIIlIIIl[39]] = C."Nav to glough";
        C.llIIIlIIII[C.llIIIlIIIl[40]] = C."Glough";
        C.llIIIlIIII[C.llIIIlIIIl[28]] = C."Glough";
        C.llIIIlIIII[C.llIIIlIIIl[41]] = C."Nav to start";
        C.llIIIlIIII[C.llIIIlIIIl[42]] = C."King Narnode Shareen";
        C.llIIIlIIII[C.llIIIlIIIl[43]] = C."Nav to charlie";
        C.llIIIlIIII[C.llIIIlIIIl[44]] = C."Charlie";
        C.llIIIlIIII[C.llIIIlIIIl[2]] = C."Nav to glough";
        C.llIIIlIIII[C.llIIIlIIIl[46]] = C."Ladder";
        C.llIIIlIIII[C.llIIIlIIIl[47]] = C."Ladder";
        C.llIIIlIIII[C.llIIIlIIIl[48]] = C."Climb-down";
        C.llIIIlIIII[C.llIIIlIIIl[49]] = C."Search cupbaord";
        C.llIIIlIIII[C.llIIIlIIIl[38]] = C."Cupboard";
        C.llIIIlIIII[C.llIIIlIIIl[50]] = C."Open";
        C.llIIIlIIII[C.llIIIlIIIl[51]] = C."Cupboard";
        C.llIIIlIIII[C.llIIIlIIIl[52]] = C."Open";
        C.llIIIlIIII[C.llIIIlIIIl[53]] = C."Cupboard";
        C.llIIIlIIII[C.llIIIlIIIl[54]] = C."Search";
        C.llIIIlIIII[C.llIIIlIIIl[55]] = C."Cupboard";
        C.llIIIlIIII[C.llIIIlIIIl[56]] = C."Search";
        C.llIIIlIIII[C.llIIIlIIIl[58]] = C."Talk";
        C.llIIIlIIII[C.llIIIlIIIl[59]] = C."Glough";
        C.llIIIlIIII[C.llIIIlIIIl[36]] = C."Charlie";
        C.llIIIlIIII[C.llIIIlIIIl[63]] = C."Talk to pilot";
        C.llIIIlIIII[C.llIIIlIIIl[64]] = C."Captain Errdo";
        C.llIIIlIIII[C.llIIIlIIIl[66]] = C."Nav to gate";
        C.llIIIlIIII[C.llIIIlIIIl[67]] = C."Gate";
        C.llIIIlIIII[C.llIIIlIIIl[68]] = C."Open";
        C.llIIIlIIII[C.llIIIlIIIl[69]] = C."Nav to foreman";
        C.llIIIlIIII[C.llIIIlIIIl[70]] = C."Foreman";
        C.llIIIlIIII[C.llIIIlIIIl[71]] = C."Attack";
        C.llIIIlIIII[C.llIIIlIIIl[73]] = C."Lumber order";
        C.llIIIlIIII[C.llIIIlIIIl[22]] = C."Lumber order";
        C.llIIIlIIII[C.llIIIlIIIl[74]] = C."Take";
        C.llIIIlIIII[C.llIIIlIIIl[75]] = C."Lumber order";
        C.llIIIlIIII[C.llIIIlIIIl[76]] = C."Nav to charlie";
        C.llIIIlIIII[C.llIIIlIIIl[77]] = C."Break";
        C.llIIIlIIII[C.llIIIlIIIl[78]] = C."Ladder";
        C.llIIIlIIII[C.llIIIlIIIl[79]] = C."Ladder";
        C.llIIIlIIII[C.llIIIlIIIl[80]] = C."Climb-up";
        C.llIIIlIIII[C.llIIIlIIIl[81]] = C."Charlie";
        C.llIIIlIIII[C.llIIIlIIIl[83]] = C."Glough's key";
        C.llIIIlIIII[C.llIIIlIIIl[45]] = C."Nav to anita";
        C.llIIIlIIII[C.llIIIlIIIl[84]] = C."Ladder";
        C.llIIIlIIII[C.llIIIlIIIl[85]] = C."Climb-down";
        C.llIIIlIIII[C.llIIIlIIIl[88]] = C."Anita";
        C.llIIIlIIII[C.llIIIlIIIl[89]] = C."Staircase";
        C.llIIIlIIII[C.llIIIlIIIl[90]] = C."Climb-up";
        C.llIIIlIIII[C.llIIIlIIIl[91]] = C."Glough's key";
        C.llIIIlIIII[C.llIIIlIIIl[92]] = C."Staircase";
        C.llIIIlIIII[C.llIIIlIIIl[93]] = C."Climb-down";
        C.llIIIlIIII[C.llIIIlIIIl[95]] = C."Staircase";
        C.llIIIlIIII[C.llIIIlIIIl[57]] = C."Climb-down";
        C.llIIIlIIII[C.llIIIlIIIl[96]] = C."Nav to glough";
        C.llIIIlIIII[C.llIIIlIIIl[97]] = C."Closed chest";
        C.llIIIlIIII[C.llIIIlIIIl[98]] = C."Glough's key";
        C.llIIIlIIII[C.llIIIlIIIl[99]] = C."Closed chest";
        C.llIIIlIIII[C.llIIIlIIIl[101]] = C."Nav to start";
        C.llIIIlIIII[C.llIIIlIIIl[102]] = C."King Narnode Shareen";
        C.llIIIlIIII[C.llIIIlIIIl[104]] = C."Nav to twigs tile";
        C.llIIIlIIII[C.llIIIlIIIl[105]] = C."Solving puzzle";
        C.llIIIlIIII[C.llIIIlIIIl[115]] = C."Go down";
        C.llIIIlIIII[C.llIIIlIIIl[62]] = C."Trapdoor";
        C.llIIIlIIII[C.llIIIlIIIl[116]] = C."Climb-down";
        C.llIIIlIIII[C.llIIIlIIIl[117]] = C."Black demon";
        C.llIIIlIIII[C.llIIIlIIIl[120]] = C."Drink";
        C.llIIIlIIII[C.llIIIlIIIl[121]] = C."Black demon";
        C.llIIIlIIII[C.llIIIlIIIl[122]] = C."Attack";
        C.llIIIlIIII[C.llIIIlIIIl[124]] = C."Nav to king underground";
        C.llIIIlIIII[C.llIIIlIIIl[125]] = C."King Narnode Shareen";
        C.llIIIlIIII[C.llIIIlIIIl[126]] = C."Daconia rock";
        C.llIIIlIIII[C.llIIIlIIIl[127]] = C."Find rock";
        C.llIIIlIIII[C.llIIIlIIIl[72]] = C."Daconia rock";
        C.llIIIlIIII[C.llIIIlIIIl[128]] = C."Nav to king underground";
        C.llIIIlIIII[C.llIIIlIIIl[129]] = C."King Narnode Shareen";
        C.llIIIlIIII[C.llIIIlIIIl[132]] = C."Root";
        C.llIIIlIIII[C.llIIIlIIIl[133]] = C."Search";
        C.llIIIlIIII[C.llIIIlIIIl[135]] = C."Root";
        C.llIIIlIIII[C.llIIIlIIIl[136]] = C."Search";
        C.llIIIlIIII[C.llIIIlIIIl[138]] = C."Root";
        C.llIIIlIIII[C.llIIIlIIIl[139]] = C."Search";
        C.llIIIlIIII[C.llIIIlIIIl[141]] = C."Root";
        C.llIIIlIIII[C.llIIIlIIIl[82]] = C."Search";
        C.llIIIlIIII[C.llIIIlIIIl[144]] = C."Root";
        C.llIIIlIIII[C.llIIIlIIIl[145]] = C."Search";
        C.llIIIlIIII[C.llIIIlIIIl[147]] = C."Root";
        C.llIIIlIIII[C.llIIIlIIIl[148]] = C."Search";
        C.llIIIlIIII[C.llIIIlIIIl[151]] = C."Root";
        C.llIIIlIIII[C.llIIIlIIIl[152]] = C."Search";
        C.llIIIlIIII[C.llIIIlIIIl[155]] = C."Root";
        C.llIIIlIIII[C.llIIIlIIIl[156]] = C."Search";
        C.llIIIlIIII[C.llIIIlIIIl[159]] = C."Root";
        C.llIIIlIIII[C.llIIIlIIIl[100]] = C."Search";
        C.llIIIlIIII[C.llIIIlIIIl[162]] = C."Root";
        C.llIIIlIIII[C.llIIIlIIIl[163]] = C."Search";
        C.llIIIlIIII[C.llIIIlIIIl[165]] = C."Root";
        C.llIIIlIIII[C.llIIIlIIIl[166]] = C."Search";
        C.llIIIlIIII[C.llIIIlIIIl[168]] = C."Root";
        C.llIIIlIIII[C.llIIIlIIIl[169]] = C."Search";
        C.llIIIlIIII[C.llIIIlIIIl[171]] = C."Root";
        C.llIIIlIIII[C.llIIIlIIIl[172]] = C."Search";
        C.llIIIlIIII[C.llIIIlIIIl[174]] = C."Root";
        C.llIIIlIIII[C.llIIIlIIIl[103]] = C."Search";
        C.llIIIlIIII[C.llIIIlIIIl[177]] = C."Root";
        C.llIIIlIIII[C.llIIIlIIIl[178]] = C."Search";
        C.llIIIlIIII[C.llIIIlIIIl[179]] = C."Daconia rock";
        C.llIIIlIIII[C.llIIIlIIIl[187]] = C."ring of wealth (";
        C.llIIIlIIII[C.llIIIlIIIl[200]] = C."Yes.";
        C.llIIIlIIII[C.llIIIlIIIl[201]] = C."You seem worried, what's up?";
        C.llIIIlIIII[C.llIIIlIIIl[202]] = C."I think so!";
        C.llIIIlIIII[C.llIIIlIIIl[203]] = C."A man came to me with the King's seal.";
        C.llIIIlIIII[C.llIIIlIIIl[204]] = C."I gave the man Daconia rocks.";
        C.llIIIlIIII[C.llIIIlIIIl[114]] = C."And Daconia rocks will kill the tree!";
        C.llIIIlIIII[C.llIIIlIIIl[205]] = C."None of the above.";
        C.llIIIlIIII[C.llIIIlIIIl[206]] = C."Take me to Karamja please!";
        C.llIIIlIIII[C.llIIIlIIIl[207]] = C."Glough sent me.";
        C.llIIIlIIII[C.llIIIlIIIl[208]] = C."Ka.";
        C.llIIIlIIII[C.llIIIlIIIl[209]] = C."Lu.";
        C.llIIIlIIII[C.llIIIlIIIl[210]] = C."Min.";
        C.llIIIlIIII[C.llIIIlIIIl[211]] = C."I suppose so.";
        C.llIIIlIIII[C.llIIIlIIIl[212]] = C."";
    }

    private static boolean lIlIIlIlIlllI(int n2, int n3) {
        return n2 <= n3;
    }

    private static String lIlIIlIIlIlll(String llllllllllllllllllIlIlllllIlIlIl, String llllllllllllllllllIlIlllllIlIlII) {
        llllllllllllllllllIlIlllllIlIlIl = new String(Base64.getDecoder().decode(llllllllllllllllllIlIlllllIlIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllllIlIlllllIlIIll = new StringBuilder();
        char[] llllllllllllllllllIlIlllllIlIIlI = llllllllllllllllllIlIlllllIlIlII.toCharArray();
        int llllllllllllllllllIlIlllllIlIIIl = llIIIlIIIl[1];
        char[] llllllllllllllllllIlIlllllIIlIll = llllllllllllllllllIlIlllllIlIlIl.toCharArray();
        int llllllllllllllllllIlIlllllIIlIlI = llllllllllllllllllIlIlllllIIlIll.length;
        int llllllllllllllllllIlIlllllIIlIIl = llIIIlIIIl[1];
        while (C.lIlIIlIlIlIII(llllllllllllllllllIlIlllllIIlIIl, llllllllllllllllllIlIlllllIIlIlI)) {
            char llllllllllllllllllIlIlllllIlIllI = llllllllllllllllllIlIlllllIIlIll[llllllllllllllllllIlIlllllIIlIIl];
            llllllllllllllllllIlIlllllIlIIll.append((char)(llllllllllllllllllIlIlllllIlIllI ^ llllllllllllllllllIlIlllllIlIIlI[llllllllllllllllllIlIlllllIlIIIl % llllllllllllllllllIlIlllllIlIIlI.length]));
            0;
            ++llllllllllllllllllIlIlllllIlIIIl;
            ++llllllllllllllllllIlIlllllIIlIIl;
            0;
            if (((0xC5 ^ 0xC2) & ~(0x6B ^ 0x6C)) == 0) continue;
            return null;
        }
        return String.valueOf(llllllllllllllllllIlIlllllIlIIll);
    }

    private static boolean lIlIIlIlIlIIl(int n2) {
        return n2 == 0;
    }

    private static boolean lIlIIlIlIIlll(int n2) {
        return n2 != 0;
    }

    private static boolean lIlIIlIlIlIII(int n2, int n3) {
        return n2 < n3;
    }

    public static void bA() {
        block119: {
            BankLocation llllllllllllllllllIlIlllllllIlll;
            block128: {
                block129: {
                    block120: {
                        block127: {
                            block122: {
                                block126: {
                                    block125: {
                                        block124: {
                                            block123: {
                                                block121: {
                                                    if (C.lIlIIlIlIIlll(bt ? 1 : 0)) {
                                                        b.a(bv);
                                                        if (C.lIlIIlIlIlIII(bv.size(), llIIIlIIIl[0])) {
                                                            System.out.println(llIIIlIIII[llIIIlIIIl[1]]);
                                                            bt = llIIIlIIIl[1];
                                                        }
                                                    }
                                                    if (!C.lIlIIlIlIlIIl(bt ? 1 : 0)) break block119;
                                                    if (C.lIlIIlIlIlIII(Skills.getLevel((Skill)Skill.AGILITY), llIIIlIIIl[2])) {
                                                        da = llIIIlIIII[llIIIlIIIl[0]];
                                                        av.eA();
                                                    }
                                                    if (!C.lIlIIlIlIlIIl(C.an() ? 1 : 0) || !C.lIlIIlIlIlIII(e.j(eG), llIIIlIIIl[0]) || !C.lIlIIlIlIlIlI(Skills.getLevel((Skill)Skill.AGILITY), llIIIlIIIl[2])) break block120;
                                                    da = llIIIlIIII[llIIIlIIIl[3]];
                                                    llllllllllllllllllIlIlllllllIlll = BankLocation.getNearest();
                                                    if (C.lIlIIlIlIlIll(llllllllllllllllllIlIlllllllIlll) && C.lIlIIlIlIlIIl(llllllllllllllllllIlIlllllllIlll.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                                        AccBuilderSotf.c = llIIIlIIII[llIIIlIIIl[4]];
                                                        a.a(llllllllllllllllllIlIlllllllIlll);
                                                    }
                                                    if (!C.lIlIIlIlIlIll(llllllllllllllllllIlIlllllllIlll) || !C.lIlIIlIlIIlll(llllllllllllllllllIlIlllllllIlll.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block120;
                                                    if (C.lIlIIlIlIlIIl(Bank.isOpen() ? 1 : 0)) {
                                                        a.a();
                                                        Time.sleepUntil(() -> Bank.isOpen(), (int)llIIIlIIIl[5]);
                                                        0;
                                                    }
                                                    if (!C.lIlIIlIlIIlll(Bank.isOpen() ? 1 : 0)) break block120;
                                                    AccBuilderSotf.c = llIIIlIIII[llIIIlIIIl[6]];
                                                    if (C.lIlIIlIlIllII(Inventory.getAll().size())) {
                                                        Bank.depositInventory();
                                                        Time.sleepTicks((int)llIIIlIIIl[6]);
                                                        0;
                                                    }
                                                    if (C.lIlIIlIlIllII(Equipment.getAll().size())) {
                                                        Bank.depositEquipment();
                                                        Time.sleepTicks((int)llIIIlIIIl[3]);
                                                        0;
                                                    }
                                                    while (C.lIlIIlIlIlIIl(I.co() ? 1 : 0)) {
                                                        I.cm();
                                                        Time.sleepTicks((int)llIIIlIIIl[0]);
                                                        0;
                                                        0;
                                                        if (-1 <= 1) continue;
                                                        return;
                                                    }
                                                    int[] nArray = new int[llIIIlIIIl[0]];
                                                    nArray[C.llIIIlIIIl[1]] = llIIIlIIIl[7];
                                                    if (!C.lIlIIlIlIIlll(Bank.contains((int[])nArray) ? 1 : 0)) break block121;
                                                    int[] nArray2 = new int[llIIIlIIIl[0]];
                                                    nArray2[C.llIIIlIIIl[1]] = llIIIlIIIl[7];
                                                    if (!C.lIlIIlIlIlIlI(Bank.getFirst((int[])nArray2).getQuantity(), llIIIlIIIl[8])) break block122;
                                                }
                                                int[] nArray = new int[llIIIlIIIl[0]];
                                                nArray[C.llIIIlIIIl[1]] = llIIIlIIIl[9];
                                                if (!C.lIlIIlIlIIlll(Bank.contains((int[])nArray) ? 1 : 0)) break block123;
                                                int[] nArray3 = new int[llIIIlIIIl[0]];
                                                nArray3[C.llIIIlIIIl[1]] = llIIIlIIIl[9];
                                                if (!C.lIlIIlIlIlIlI(Bank.getFirst((int[])nArray3).getQuantity(), llIIIlIIIl[10])) break block122;
                                            }
                                            int[] nArray = new int[llIIIlIIIl[0]];
                                            nArray[C.llIIIlIIIl[1]] = llIIIlIIIl[11];
                                            if (!C.lIlIIlIlIIlll(Bank.contains((int[])nArray) ? 1 : 0)) break block124;
                                            int[] nArray4 = new int[llIIIlIIIl[0]];
                                            nArray4[C.llIIIlIIIl[1]] = llIIIlIIIl[11];
                                            if (!C.lIlIIlIlIlIlI(Bank.getFirst((int[])nArray4).getQuantity(), llIIIlIIIl[12])) break block122;
                                        }
                                        int[] nArray = new int[llIIIlIIIl[0]];
                                        nArray[C.llIIIlIIIl[1]] = llIIIlIIIl[13];
                                        if (!C.lIlIIlIlIIlll(Bank.contains((int[])nArray) ? 1 : 0)) break block125;
                                        int[] nArray5 = new int[llIIIlIIIl[0]];
                                        nArray5[C.llIIIlIIIl[1]] = llIIIlIIIl[13];
                                        if (!C.lIlIIlIlIlIlI(Bank.getFirst((int[])nArray5).getQuantity(), llIIIlIIIl[6])) break block122;
                                    }
                                    int[] nArray = new int[llIIIlIIIl[0]];
                                    nArray[C.llIIIlIIIl[1]] = llIIIlIIIl[14];
                                    if (!C.lIlIIlIlIIlll(Bank.contains((int[])nArray) ? 1 : 0)) break block126;
                                    int[] nArray6 = new int[llIIIlIIIl[0]];
                                    nArray6[C.llIIIlIIIl[1]] = llIIIlIIIl[14];
                                    if (!C.lIlIIlIlIlIlI(Bank.getFirst((int[])nArray6).getQuantity(), llIIIlIIIl[6])) break block122;
                                }
                                int[] nArray = new int[llIIIlIIIl[0]];
                                nArray[C.llIIIlIIIl[1]] = llIIIlIIIl[15];
                                if (!C.lIlIIlIlIIlll(Bank.contains((int[])nArray) ? 1 : 0)) break block127;
                                int[] nArray7 = new int[llIIIlIIIl[0]];
                                nArray7[C.llIIIlIIIl[1]] = llIIIlIIIl[15];
                                if (!C.lIlIIlIlIlIII(Bank.getFirst((int[])nArray7).getQuantity(), llIIIlIIIl[16])) break block127;
                            }
                            C.Q();
                            System.out.println(llIIIlIIII[llIIIlIIIl[12]]);
                            bt = llIIIlIIIl[0];
                            return;
                        }
                        int[] nArray = new int[llIIIlIIIl[6]];
                        nArray[C.llIIIlIIIl[1]] = llIIIlIIIl[17];
                        nArray[C.llIIIlIIIl[0]] = llIIIlIIIl[11];
                        nArray[C.llIIIlIIIl[3]] = llIIIlIIIl[13];
                        nArray[C.llIIIlIIIl[4]] = llIIIlIIIl[18];
                        if (C.lIlIIlIlIlIIl(e.c(nArray) ? 1 : 0)) {
                            C.Q();
                            System.out.println(llIIIlIIII[llIIIlIIIl[19]]);
                            bt = llIIIlIIIl[0];
                            return;
                        }
                        if (C.lIlIIlIlIlIIl(Bank.isOpen() ? 1 : 0)) {
                            a.a();
                            Time.sleepTicks((int)llIIIlIIIl[19]);
                            0;
                        }
                        int[] nArray8 = new int[llIIIlIIIl[6]];
                        nArray8[C.llIIIlIIIl[1]] = llIIIlIIIl[17];
                        nArray8[C.llIIIlIIIl[0]] = llIIIlIIIl[11];
                        nArray8[C.llIIIlIIIl[3]] = llIIIlIIIl[13];
                        nArray8[C.llIIIlIIIl[4]] = llIIIlIIIl[18];
                        if (C.lIlIIlIlIIlll(e.c(nArray8) ? 1 : 0)) {
                            a.a(llIIIlIIIl[17], llIIIlIIIl[16]);
                            a.a(llIIIlIIIl[13], llIIIlIIIl[4]);
                            Bank.withdraw((int)llIIIlIIIl[18], (int)llIIIlIIIl[5], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                            Bank.withdraw((int)llIIIlIIIl[11], (int)llIIIlIIIl[0], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                            Bank.withdraw((int)llIIIlIIIl[14], (int)llIIIlIIIl[6], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                            a.a(llIIIlIIIl[15], llIIIlIIIl[12]);
                            int[] nArray9 = new int[llIIIlIIIl[0]];
                            nArray9[C.llIIIlIIIl[1]] = llIIIlIIIl[9];
                            if (C.lIlIIlIlIIlll(Bank.contains((int[])nArray9) ? 1 : 0)) {
                                int[] nArray10 = new int[llIIIlIIIl[0]];
                                nArray10[C.llIIIlIIIl[1]] = llIIIlIIIl[9];
                                if (C.lIlIIlIlIlIII(Inventory.getCount((int[])nArray10), llIIIlIIIl[0])) {
                                    Bank.withdraw((int)llIIIlIIIl[9], (int)llIIIlIIIl[20], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)llIIIlIIIl[0]);
                                    0;
                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[llIIIlIIIl[0]];
                                        nArray[C.llIIIlIIIl[1]] = llIIIlIIIl[9];
                                        if (C.lIlIIlIlIllII(Inventory.getCount((int[])nArray))) {
                                            bl = llIIIlIIIl[0];
                                            0;
                                            if (((0x5F ^ 0x4C) & ~(0x35 ^ 0x26)) != 0) {
                                                return ((0x5E ^ 0x1B) & ~(0x4B ^ 0xE)) != 0;
                                            }
                                        } else {
                                            bl = llIIIlIIIl[1];
                                        }
                                        return bl;
                                    }, (int)llIIIlIIIl[5]);
                                    0;
                                }
                            }
                            int[] nArray11 = new int[llIIIlIIIl[0]];
                            nArray11[C.llIIIlIIIl[1]] = llIIIlIIIl[7];
                            if (C.lIlIIlIlIIlll(Bank.contains((int[])nArray11) ? 1 : 0)) {
                                int[] nArray12 = new int[llIIIlIIIl[0]];
                                nArray12[C.llIIIlIIIl[1]] = llIIIlIIIl[7];
                                if (C.lIlIIlIlIlIII(Inventory.getCount((int[])nArray12), llIIIlIIIl[0])) {
                                    Bank.withdraw((int)llIIIlIIIl[7], (int)llIIIlIIIl[21], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)llIIIlIIIl[0]);
                                    0;
                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[llIIIlIIIl[0]];
                                        nArray[C.llIIIlIIIl[1]] = llIIIlIIIl[7];
                                        if (C.lIlIIlIlIllII(Inventory.getCount((int[])nArray))) {
                                            bl = llIIIlIIIl[0];
                                            0;
                                            if (null != null) {
                                                return ((7 ^ 1) & ~(0x49 ^ 0x4F)) != 0;
                                            }
                                        } else {
                                            bl = llIIIlIIIl[1];
                                        }
                                        return bl;
                                    }, (int)llIIIlIIIl[5]);
                                    0;
                                }
                            }
                        }
                    }
                    if (C.lIlIIlIlIIlll(Inventory.contains((int[])f.ba) ? 1 : 0) && C.lIlIIlIlIlIII(Movement.getRunEnergy(), llIIIlIIIl[22])) {
                        Inventory.getFirst((int[])f.ba).interact(llIIIlIIII[llIIIlIIIl[23]]);
                        Time.sleepTicks((int)llIIIlIIIl[0]);
                        0;
                    }
                    if (C.lIlIIlIlIlIlI(Combat.getMissingHealth(), llIIIlIIIl[24])) {
                        int[] nArray = new int[llIIIlIIIl[0]];
                        nArray[C.llIIIlIIIl[1]] = llIIIlIIIl[15];
                        if (C.lIlIIlIlIIlll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                            int[] nArray13 = new int[llIIIlIIIl[0]];
                            nArray13[C.llIIIlIIIl[1]] = llIIIlIIIl[15];
                            Inventory.getFirst((int[])nArray13).interact(llIIIlIIII[llIIIlIIIl[25]]);
                            Time.sleepTicks((int)llIIIlIIIl[3]);
                            0;
                        }
                    }
                    if (C.lIlIIlIlIIlll(C.an() ? 1 : 0) && C.lIlIIlIlIlIIl(e.j(eG))) {
                        o.c.k.i.-.l.o.f.-.n.c.t.e.s.h.X();
                        if (C.lIlIIlIlIllIl(Players.getLocal().getWorldLocation().distanceTo(ew), llIIIlIIIl[4]) && C.lIlIIlIlIllIl(Players.getLocal().getWorldLocation().distanceTo(eF), llIIIlIIIl[26])) {
                            AccBuilderSotf.c = llIIIlIIII[llIIIlIIIl[27]];
                            if (C.lIlIIlIlIIlll(Dialog.isOpen() ? 1 : 0)) {
                                Dialog.close();
                            }
                            Movement.walkTo((WorldPoint)eF);
                            0;
                            Time.sleepTicks((int)llIIIlIIIl[0]);
                            0;
                        }
                        if (!C.lIlIIlIlIllIl(Players.getLocal().getWorldLocation().distanceTo(ew), llIIIlIIIl[4]) || C.lIlIIlIlIlllI(Players.getLocal().getWorldLocation().distanceTo(eF), llIIIlIIIl[26])) {
                            g.a(llIIIlIIII[llIIIlIIIl[16]], cE);
                        }
                    }
                    if (!C.lIlIIlIlIllll(e.j(eG), llIIIlIIIl[16]) || C.lIlIIlIllIIII(e.j(eG), llIIIlIIIl[28])) {
                        String[] stringArray = new String[llIIIlIIIl[0]];
                        stringArray[C.llIIIlIIIl[1]] = llIIIlIIII[llIIIlIIIl[29]];
                        if (C.lIlIIlIlIlIIl(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                            if (!C.lIlIIlIlIlllI(Players.getLocal().getWorldLocation().distanceTo(ex), llIIIlIIIl[4]) || C.lIlIIlIlIllll(Players.getLocal().getWorldLocation().getPlane(), llIIIlIIIl[0]) && C.lIlIIlIlIlllI(Players.getLocal().getWorldLocation().distanceTo(ex), llIIIlIIIl[4])) {
                                AccBuilderSotf.c = llIIIlIIII[llIIIlIIIl[24]];
                                Movement.walkTo((WorldPoint)ex);
                                0;
                                Time.sleepTicks((int)llIIIlIIIl[0]);
                                0;
                            }
                            if (C.lIlIIlIlIlllI(Players.getLocal().getWorldLocation().distanceTo(ex), llIIIlIIIl[4]) && C.lIlIIlIllIIII(Players.getLocal().getWorldLocation().getPlane(), llIIIlIIIl[0])) {
                                g.a(llIIIlIIII[llIIIlIIIl[30]], cE);
                            }
                        }
                        String[] stringArray2 = new String[llIIIlIIIl[0]];
                        stringArray2[C.llIIIlIIIl[1]] = llIIIlIIII[llIIIlIIIl[31]];
                        if (C.lIlIIlIlIIlll(Inventory.contains((String[])stringArray2) ? 1 : 0)) {
                            if (C.lIlIIlIlIllIl(Players.getLocal().getWorldLocation().distanceTo(ew), llIIIlIIIl[4]) && C.lIlIIlIlIllIl(Players.getLocal().getWorldLocation().distanceTo(eF), llIIIlIIIl[26])) {
                                AccBuilderSotf.c = llIIIlIIII[llIIIlIIIl[26]];
                                if (C.lIlIIlIlIlllI(Players.getLocal().getWorldLocation().distanceTo(ex), llIIIlIIIl[28])) {
                                    int[] nArray = new int[llIIIlIIIl[0]];
                                    nArray[C.llIIIlIIIl[1]] = llIIIlIIIl[17];
                                    Inventory.getFirst((int[])nArray).interact(llIIIlIIII[llIIIlIIIl[32]]);
                                    Time.sleepTicks((int)llIIIlIIIl[12]);
                                    0;
                                }
                                llllllllllllllllllIlIlllllllIlll = new WorldPoint(llIIIlIIIl[33], llIIIlIIIl[34], llIIIlIIIl[1]);
                                if (C.lIlIIlIlIlllI(Players.getLocal().getWorldLocation().distanceTo(b.I), llIIIlIIIl[35]) && C.lIlIIlIlIllIl(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllllllllllllllllIlIlllllllIlll), llIIIlIIIl[25])) {
                                    Movement.walkTo((WorldPoint)llllllllllllllllllIlIlllllllIlll);
                                    0;
                                    Time.sleepTicks((int)llIIIlIIIl[0]);
                                    0;
                                }
                                if ((!C.lIlIIlIlIllIl(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllllllllllllllllIlIlllllllIlll), llIIIlIIIl[25]) || C.lIlIIlIlIlllI(Players.getLocal().getWorldLocation().distanceTo(ew), llIIIlIIIl[35])) && C.lIlIIlIlIllIl(Players.getLocal().getWorldLocation().distanceTo(ex), llIIIlIIIl[36])) {
                                    Movement.walkTo((WorldPoint)ew);
                                    0;
                                    Time.sleepTicks((int)llIIIlIIIl[0]);
                                    0;
                                }
                            }
                            if (!C.lIlIIlIlIllIl(Players.getLocal().getWorldLocation().distanceTo(ew), llIIIlIIIl[4]) || C.lIlIIlIlIlllI(Players.getLocal().getWorldLocation().distanceTo(eF), llIIIlIIIl[26])) {
                                g.a(llIIIlIIII[llIIIlIIIl[37]], cE);
                            }
                        }
                    }
                    if (!C.lIlIIlIllIIII(e.j(eG), llIIIlIIIl[38])) break block128;
                    if (C.lIlIIlIlIllIl(Players.getLocal().getWorldLocation().distanceTo(ey), llIIIlIIIl[23]) && C.lIlIIlIlIllll(Players.getLocal().getWorldLocation().getPlane(), llIIIlIIIl[0])) {
                        AccBuilderSotf.c = llIIIlIIII[llIIIlIIIl[39]];
                        Movement.walkTo((WorldPoint)ey);
                        0;
                        Time.sleepTicks((int)llIIIlIIIl[0]);
                        0;
                    }
                    if (!C.lIlIIlIlIllIl(Players.getLocal().getWorldLocation().distanceTo(ey), llIIIlIIIl[26])) break block129;
                    String[] stringArray = new String[llIIIlIIIl[0]];
                    stringArray[C.llIIIlIIIl[1]] = llIIIlIIII[llIIIlIIIl[40]];
                    if (!C.lIlIIlIlIlIll(NPCs.getNearest((String[])stringArray))) break block128;
                }
                g.a(llIIIlIIII[llIIIlIIIl[28]], cE);
            }
            if (C.lIlIIlIllIIII(e.j(eG), llIIIlIIIl[36])) {
                if (C.lIlIIlIlIllIl(Players.getLocal().getWorldLocation().distanceTo(ew), llIIIlIIIl[4]) && C.lIlIIlIlIllIl(Players.getLocal().getWorldLocation().distanceTo(eF), llIIIlIIIl[26])) {
                    AccBuilderSotf.c = llIIIlIIII[llIIIlIIIl[41]];
                    Movement.walkTo((WorldPoint)eF);
                    0;
                    Time.sleepTicks((int)llIIIlIIIl[0]);
                    0;
                }
                if (!C.lIlIIlIlIllIl(Players.getLocal().getWorldLocation().distanceTo(ew), llIIIlIIIl[4]) || C.lIlIIlIlIlllI(Players.getLocal().getWorldLocation().distanceTo(eF), llIIIlIIIl[26])) {
                    g.a(llIIIlIIII[llIIIlIIIl[42]], cE);
                }
            }
            if (C.lIlIIlIllIIII(e.j(eG), llIIIlIIIl[22])) {
                if (C.lIlIIlIlIllIl(Players.getLocal().getWorldLocation().distanceTo(ez), llIIIlIIIl[4]) && C.lIlIIlIlIllll(Players.getLocal().getWorldLocation().getPlane(), llIIIlIIIl[4])) {
                    AccBuilderSotf.c = llIIIlIIII[llIIIlIIIl[43]];
                    Movement.walkTo((WorldPoint)ez);
                    0;
                    Time.sleepTicks((int)llIIIlIIIl[0]);
                    0;
                }
                if (C.lIlIIlIlIlllI(Players.getLocal().getWorldLocation().distanceTo(ez), llIIIlIIIl[4]) && C.lIlIIlIllIIII(Players.getLocal().getWorldLocation().getPlane(), llIIIlIIIl[4])) {
                    g.a(llIIIlIIII[llIIIlIIIl[44]], cE);
                }
            }
            if (C.lIlIIlIllIIII(e.j(eG), llIIIlIIIl[45])) {
                if (C.lIlIIlIlIllIl(Players.getLocal().getWorldLocation().distanceTo(ey), llIIIlIIIl[23]) && C.lIlIIlIlIllll(Players.getLocal().getWorldLocation().getPlane(), llIIIlIIIl[0])) {
                    AccBuilderSotf.c = llIIIlIIII[llIIIlIIIl[2]];
                    Movement.walkTo((WorldPoint)ey);
                    0;
                    Time.sleepTicks((int)llIIIlIIIl[0]);
                    0;
                }
                if (!C.lIlIIlIllIIII(Players.getLocal().getWorldLocation().getPlane(), llIIIlIIIl[0]) || C.lIlIIlIlIllIl(Players.getLocal().getWorldLocation().distanceTo(ey), llIIIlIIIl[23])) {
                    String[] stringArray = new String[llIIIlIIIl[0]];
                    stringArray[C.llIIIlIIIl[1]] = llIIIlIIII[llIIIlIIIl[46]];
                    if (C.lIlIIlIlIlIll(TileObjects.getNearest((String[])stringArray))) {
                        String[] stringArray3 = new String[llIIIlIIIl[0]];
                        stringArray3[C.llIIIlIIIl[1]] = llIIIlIIII[llIIIlIIIl[47]];
                        TileObjects.getNearest((String[])stringArray3).interact(llIIIlIIII[llIIIlIIIl[48]]);
                        Time.sleepTicks((int)llIIIlIIIl[0]);
                        0;
                    }
                }
                if (C.lIlIIlIlIlllI(Players.getLocal().getWorldLocation().distanceTo(ey), llIIIlIIIl[23])) {
                    AccBuilderSotf.c = llIIIlIIII[llIIIlIIIl[49]];
                    String[] stringArray = new String[llIIIlIIIl[0]];
                    stringArray[C.llIIIlIIIl[1]] = llIIIlIIII[llIIIlIIIl[38]];
                    String[] stringArray4 = new String[llIIIlIIIl[0]];
                    stringArray4[C.llIIIlIIIl[1]] = llIIIlIIII[llIIIlIIIl[50]];
                    if (C.lIlIIlIlIIlll(TileObjects.getNearest((String[])stringArray).hasAction(stringArray4) ? 1 : 0)) {
                        String[] stringArray5 = new String[llIIIlIIIl[0]];
                        stringArray5[C.llIIIlIIIl[1]] = llIIIlIIII[llIIIlIIIl[51]];
                        TileObjects.getNearest((String[])stringArray5).interact(llIIIlIIII[llIIIlIIIl[52]]);
                        Time.sleepTicks((int)llIIIlIIIl[4]);
                        0;
                    }
                    String[] stringArray6 = new String[llIIIlIIIl[0]];
                    stringArray6[C.llIIIlIIIl[1]] = llIIIlIIII[llIIIlIIIl[53]];
                    String[] stringArray7 = new String[llIIIlIIIl[0]];
                    stringArray7[C.llIIIlIIIl[1]] = llIIIlIIII[llIIIlIIIl[54]];
                    if (C.lIlIIlIlIIlll(TileObjects.getNearest((String[])stringArray6).hasAction(stringArray7) ? 1 : 0)) {
                        String[] stringArray8 = new String[llIIIlIIIl[0]];
                        stringArray8[C.llIIIlIIIl[1]] = llIIIlIIII[llIIIlIIIl[55]];
                        TileObjects.getNearest((String[])stringArray8).interact(llIIIlIIII[llIIIlIIIl[56]]);
                        Time.sleepTicks((int)llIIIlIIIl[4]);
                        0;
                    }
                }
            }
            if (C.lIlIIlIllIIII(e.j(eG), llIIIlIIIl[57])) {
                AccBuilderSotf.c = llIIIlIIII[llIIIlIIIl[58]];
                g.a(llIIIlIIII[llIIIlIIIl[59]], cE);
                if (C.lIlIIlIlIIlll(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(llIIIlIIIl[60], llIIIlIIIl[61], llIIIlIIIl[4])) ? 1 : 0)) {
                    g.a(llIIIlIIII[llIIIlIIIl[36]], cE);
                }
                g.a(cE);
            }
            if (C.lIlIIlIllIIII(e.j(eG), llIIIlIIIl[62])) {
                if (C.lIlIIlIlIlllI(Players.getLocal().getWorldLocation().distanceTo(ez), llIIIlIIIl[28])) {
                    AccBuilderSotf.c = llIIIlIIII[llIIIlIIIl[63]];
                    g.a(llIIIlIIII[llIIIlIIIl[64]], cE);
                }
                if (C.lIlIIlIlIllIl(Players.getLocal().getWorldLocation().distanceTo(ez), llIIIlIIIl[28])) {
                    if (C.lIlIIlIlIlIII(Players.getLocal().getWorldLocation().getX(), llIIIlIIIl[65])) {
                        if (C.lIlIIlIlIllIl(Players.getLocal().getWorldLocation().distanceTo(eA), llIIIlIIIl[4])) {
                            AccBuilderSotf.c = llIIIlIIII[llIIIlIIIl[66]];
                            Movement.walkTo((WorldPoint)eA);
                            0;
                            Time.sleepTicks((int)llIIIlIIIl[0]);
                            0;
                        }
                        if (C.lIlIIlIlIlllI(Players.getLocal().getWorldLocation().distanceTo(eA), llIIIlIIIl[4])) {
                            if (C.lIlIIlIlIlIIl(Dialog.isOpen() ? 1 : 0)) {
                                String[] stringArray = new String[llIIIlIIIl[0]];
                                stringArray[C.llIIIlIIIl[1]] = llIIIlIIII[llIIIlIIIl[67]];
                                TileObjects.getNearest((String[])stringArray).interact(llIIIlIIII[llIIIlIIIl[68]]);
                                Time.sleepTicks((int)llIIIlIIIl[4]);
                                0;
                            }
                            g.a(cE);
                        }
                    }
                    if (C.lIlIIlIlIlIlI(Players.getLocal().getWorldLocation().getX(), llIIIlIIIl[65])) {
                        if (C.lIlIIlIlIllIl(Players.getLocal().getWorldLocation().distanceTo(eB), llIIIlIIIl[19])) {
                            AccBuilderSotf.c = llIIIlIIII[llIIIlIIIl[69]];
                            Movement.walkTo((WorldPoint)eB);
                            0;
                            Time.sleepTicks((int)llIIIlIIIl[0]);
                            0;
                        }
                        if (C.lIlIIlIlIlllI(Players.getLocal().getWorldLocation().distanceTo(eB), llIIIlIIIl[19])) {
                            if (C.lIlIIlIlIlIIl(m.ap() ? 1 : 0)) {
                                m.aq();
                            }
                            if (C.lIlIIlIllIIIl(Players.getLocal().getInteracting())) {
                                String[] stringArray = new String[llIIIlIIIl[0]];
                                stringArray[C.llIIIlIIIl[1]] = llIIIlIIII[llIIIlIIIl[70]];
                                NPCs.getNearest((String[])stringArray).interact(llIIIlIIII[llIIIlIIIl[71]]);
                                Time.sleepTicks((int)llIIIlIIIl[0]);
                                0;
                            }
                        }
                    }
                }
            }
            if (C.lIlIIlIllIIII(e.j(eG), llIIIlIIIl[72])) {
                String[] stringArray = new String[llIIIlIIIl[0]];
                stringArray[C.llIIIlIIIl[1]] = llIIIlIIII[llIIIlIIIl[73]];
                if (C.lIlIIlIlIlIIl(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    String[] stringArray9 = new String[llIIIlIIIl[0]];
                    stringArray9[C.llIIIlIIIl[1]] = llIIIlIIII[llIIIlIIIl[22]];
                    TileItems.getNearest((String[])stringArray9).interact(llIIIlIIII[llIIIlIIIl[74]]);
                    Time.sleepTicks((int)llIIIlIIIl[6]);
                    0;
                }
                String[] stringArray10 = new String[llIIIlIIIl[0]];
                stringArray10[C.llIIIlIIIl[1]] = llIIIlIIII[llIIIlIIIl[75]];
                if (C.lIlIIlIlIIlll(Inventory.contains((String[])stringArray10) ? 1 : 0)) {
                    if (C.lIlIIlIlIllIl(Players.getLocal().getWorldLocation().distanceTo(ez), llIIIlIIIl[4]) && C.lIlIIlIlIllll(Players.getLocal().getWorldLocation().getPlane(), llIIIlIIIl[4])) {
                        AccBuilderSotf.c = llIIIlIIII[llIIIlIIIl[76]];
                        llllllllllllllllllIlIlllllllIlll = new WorldPoint(llIIIlIIIl[33], llIIIlIIIl[34], llIIIlIIIl[1]);
                        if (C.lIlIIlIlIlllI(Players.getLocal().getWorldLocation().distanceTo(eB), llIIIlIIIl[28])) {
                            int[] nArray = new int[llIIIlIIIl[0]];
                            nArray[C.llIIIlIIIl[1]] = llIIIlIIIl[17];
                            Inventory.getFirst((int[])nArray).interact(llIIIlIIII[llIIIlIIIl[77]]);
                            Time.sleepTicks((int)llIIIlIIIl[12]);
                            0;
                        }
                        if (C.lIlIIlIlIlllI(Players.getLocal().getWorldLocation().distanceTo(b.I), llIIIlIIIl[35]) && C.lIlIIlIlIllIl(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllllllllllllllllIlIlllllllIlll), llIIIlIIIl[25])) {
                            Movement.walkTo((WorldPoint)llllllllllllllllllIlIlllllllIlll);
                            0;
                            Time.sleepTicks((int)llIIIlIIIl[0]);
                            0;
                        }
                        if ((!C.lIlIIlIlIllIl(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllllllllllllllllIlIlllllllIlll), llIIIlIIIl[25]) || C.lIlIIlIlIlllI(Players.getLocal().getWorldLocation().distanceTo(ew), llIIIlIIIl[35])) && C.lIlIIlIlIllIl(Players.getLocal().getWorldLocation().distanceTo(eB), llIIIlIIIl[36])) {
                            Movement.walkTo((WorldPoint)ez);
                            0;
                            Time.sleepTicks((int)llIIIlIIIl[0]);
                            0;
                        }
                        if (!C.lIlIIlIlIllll(Players.getLocal().getWorldLocation().getPlane(), llIIIlIIIl[3]) || C.lIlIIlIllIIII(Players.getLocal().getWorldLocation().getPlane(), llIIIlIIIl[0])) {
                            String[] stringArray11 = new String[llIIIlIIIl[0]];
                            stringArray11[C.llIIIlIIIl[1]] = llIIIlIIII[llIIIlIIIl[78]];
                            if (C.lIlIIlIlIlIll(TileObjects.getNearest((String[])stringArray11))) {
                                String[] stringArray12 = new String[llIIIlIIIl[0]];
                                stringArray12[C.llIIIlIIIl[1]] = llIIIlIIII[llIIIlIIIl[79]];
                                TileObjects.getNearest((String[])stringArray12).interact(llIIIlIIII[llIIIlIIIl[80]]);
                                Time.sleepTicks((int)llIIIlIIIl[4]);
                                0;
                            }
                        }
                    }
                    if (C.lIlIIlIlIlllI(Players.getLocal().getWorldLocation().distanceTo(ez), llIIIlIIIl[4]) && C.lIlIIlIllIIII(Players.getLocal().getWorldLocation().getPlane(), llIIIlIIIl[4])) {
                        g.a(llIIIlIIII[llIIIlIIIl[81]], cE);
                    }
                }
            }
            if (C.lIlIIlIllIIII(e.j(eG), llIIIlIIIl[82])) {
                String[] stringArray = new String[llIIIlIIIl[0]];
                stringArray[C.llIIIlIIIl[1]] = llIIIlIIII[llIIIlIIIl[83]];
                if (C.lIlIIlIlIlIIl(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    if (C.lIlIIlIlIllIl(Players.getLocal().getWorldLocation().distanceTo(eC), llIIIlIIIl[12])) {
                        AccBuilderSotf.c = llIIIlIIII[llIIIlIIIl[45]];
                        if (!C.lIlIIlIlIllll(Players.getLocal().getWorldLocation().getPlane(), llIIIlIIIl[4]) || !C.lIlIIlIlIllll(Players.getLocal().getWorldLocation().getPlane(), llIIIlIIIl[3]) || C.lIlIIlIllIIII(Players.getLocal().getWorldLocation().getPlane(), llIIIlIIIl[0])) {
                            String[] stringArray13 = new String[llIIIlIIIl[0]];
                            stringArray13[C.llIIIlIIIl[1]] = llIIIlIIII[llIIIlIIIl[84]];
                            TileObjects.getNearest((String[])stringArray13).interact(llIIIlIIII[llIIIlIIIl[85]]);
                            Time.sleepTicks((int)llIIIlIIIl[4]);
                            0;
                        }
                        if (C.lIlIIlIlIlllI(Players.getLocal().getWorldLocation().distanceTo(ew), llIIIlIIIl[12])) {
                            llllllllllllllllllIlIlllllllIlll = new WorldPoint(llIIIlIIIl[86], llIIIlIIIl[87], llIIIlIIIl[1]);
                            Movement.walkTo((WorldPoint)llllllllllllllllllIlIlllllllIlll);
                            0;
                        }
                        if (C.lIlIIlIlIlIIl(Players.getLocal().getWorldLocation().getPlane()) && C.lIlIIlIlIllIl(Players.getLocal().getWorldLocation().distanceTo(ew), llIIIlIIIl[12])) {
                            Movement.walkTo((WorldPoint)eC);
                            0;
                            Time.sleepTicks((int)llIIIlIIIl[0]);
                            0;
                        }
                    }
                    if (C.lIlIIlIlIlllI(Players.getLocal().getWorldLocation().distanceTo(eC), llIIIlIIIl[12])) {
                        g.a(llIIIlIIII[llIIIlIIIl[88]], cE);
                        if (C.lIlIIlIlIlIIl(Players.getLocal().getWorldLocation().getPlane())) {
                            String[] stringArray14 = new String[llIIIlIIIl[0]];
                            stringArray14[C.llIIIlIIIl[1]] = llIIIlIIII[llIIIlIIIl[89]];
                            TileObjects.getNearest((String[])stringArray14).interact(llIIIlIIII[llIIIlIIIl[90]]);
                            Time.sleepTicks((int)llIIIlIIIl[3]);
                            0;
                        }
                    }
                }
                String[] stringArray15 = new String[llIIIlIIIl[0]];
                stringArray15[C.llIIIlIIIl[1]] = llIIIlIIII[llIIIlIIIl[91]];
                if (C.lIlIIlIlIIlll(Inventory.contains((String[])stringArray15) ? 1 : 0)) {
                    if (C.lIlIIlIlIlllI(Players.getLocal().getWorldLocation().distanceTo(eC), llIIIlIIIl[12]) && C.lIlIIlIllIIII(Players.getLocal().getWorldLocation().getPlane(), llIIIlIIIl[0])) {
                        String[] stringArray16 = new String[llIIIlIIIl[0]];
                        stringArray16[C.llIIIlIIIl[1]] = llIIIlIIII[llIIIlIIIl[92]];
                        TileObjects.getNearest((String[])stringArray16).interact(llIIIlIIII[llIIIlIIIl[93]]);
                        Time.sleepTicks((int)llIIIlIIIl[3]);
                        0;
                    }
                    if (C.lIlIIlIlIIlll((llllllllllllllllllIlIlllllllIlll = new WorldArea(llIIIlIIIl[94], llIIIlIIIl[87], llIIIlIIIl[37], llIIIlIIIl[2], llIIIlIIIl[0])).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        String[] stringArray17 = new String[llIIIlIIIl[0]];
                        stringArray17[C.llIIIlIIIl[1]] = llIIIlIIII[llIIIlIIIl[95]];
                        TileObjects.getNearest((String[])stringArray17).interact(llIIIlIIII[llIIIlIIIl[57]]);
                        Time.sleepTicks((int)llIIIlIIIl[3]);
                        0;
                    }
                    if (C.lIlIIlIlIllIl(Players.getLocal().getWorldLocation().distanceTo(ey), llIIIlIIIl[24]) && C.lIlIIlIlIllll(Players.getLocal().getWorldLocation().getPlane(), llIIIlIIIl[0])) {
                        AccBuilderSotf.c = llIIIlIIII[llIIIlIIIl[96]];
                        Movement.walkTo((WorldPoint)ey);
                        0;
                        Time.sleepTicks((int)llIIIlIIIl[0]);
                        0;
                    }
                    if (C.lIlIIlIlIlllI(Players.getLocal().getWorldLocation().distanceTo(ey), llIIIlIIIl[24]) && C.lIlIIlIllIIII(Players.getLocal().getWorldLocation().getPlane(), llIIIlIIIl[0])) {
                        String[] stringArray18 = new String[llIIIlIIIl[0]];
                        stringArray18[C.llIIIlIIIl[1]] = llIIIlIIII[llIIIlIIIl[97]];
                        if (C.lIlIIlIlIlIll(TileObjects.getNearest((String[])stringArray18))) {
                            String[] stringArray19 = new String[llIIIlIIIl[0]];
                            stringArray19[C.llIIIlIIIl[1]] = llIIIlIIII[llIIIlIIIl[98]];
                            String[] stringArray20 = new String[llIIIlIIIl[0]];
                            stringArray20[C.llIIIlIIIl[1]] = llIIIlIIII[llIIIlIIIl[99]];
                            Inventory.getFirst((String[])stringArray19).useOn(TileObjects.getNearest((String[])stringArray20));
                            Time.sleepTicks((int)llIIIlIIIl[4]);
                            0;
                        }
                    }
                    g.a(cE);
                }
            }
            if (C.lIlIIlIllIIII(e.j(eG), llIIIlIIIl[100])) {
                if (C.lIlIIlIlIllIl(Players.getLocal().getWorldLocation().distanceTo(ew), llIIIlIIIl[4]) && C.lIlIIlIlIllIl(Players.getLocal().getWorldLocation().distanceTo(eF), llIIIlIIIl[26])) {
                    AccBuilderSotf.c = llIIIlIIII[llIIIlIIIl[101]];
                    Movement.walkTo((WorldPoint)eF);
                    0;
                    Time.sleepTicks((int)llIIIlIIIl[0]);
                    0;
                }
                if (!C.lIlIIlIlIllIl(Players.getLocal().getWorldLocation().distanceTo(ew), llIIIlIIIl[4]) || C.lIlIIlIlIlllI(Players.getLocal().getWorldLocation().distanceTo(eF), llIIIlIIIl[26])) {
                    g.a(llIIIlIIII[llIIIlIIIl[102]], cE);
                }
            }
            if (C.lIlIIlIllIIII(e.j(eG), llIIIlIIIl[103])) {
                if (C.lIlIIlIlIllIl(Players.getLocal().getWorldLocation().distanceTo(eE), llIIIlIIIl[12])) {
                    AccBuilderSotf.c = llIIIlIIII[llIIIlIIIl[104]];
                    Movement.walkTo((WorldPoint)eE);
                    0;
                    Time.sleepTicks((int)llIIIlIIIl[0]);
                    0;
                }
                if (C.lIlIIlIlIlllI(Players.getLocal().getWorldLocation().distanceTo(eE), llIIIlIIIl[12])) {
                    AccBuilderSotf.c = llIIIlIIII[llIIIlIIIl[105]];
                    int[] nArray = new int[llIIIlIIIl[0]];
                    nArray[C.llIIIlIIIl[1]] = llIIIlIIIl[106];
                    if (C.lIlIIlIlIIlll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        int[] nArray14 = new int[llIIIlIIIl[0]];
                        nArray14[C.llIIIlIIIl[1]] = llIIIlIIIl[106];
                        int[] nArray15 = new int[llIIIlIIIl[0]];
                        nArray15[C.llIIIlIIIl[1]] = llIIIlIIIl[107];
                        Inventory.getFirst((int[])nArray14).useOn(TileObjects.getNearest((int[])nArray15));
                        Time.sleepTicks((int)llIIIlIIIl[4]);
                        0;
                    }
                    int[] nArray16 = new int[llIIIlIIIl[0]];
                    nArray16[C.llIIIlIIIl[1]] = llIIIlIIIl[108];
                    if (C.lIlIIlIlIIlll(Inventory.contains((int[])nArray16) ? 1 : 0)) {
                        int[] nArray17 = new int[llIIIlIIIl[0]];
                        nArray17[C.llIIIlIIIl[1]] = llIIIlIIIl[108];
                        int[] nArray18 = new int[llIIIlIIIl[0]];
                        nArray18[C.llIIIlIIIl[1]] = llIIIlIIIl[109];
                        Inventory.getFirst((int[])nArray17).useOn(TileObjects.getNearest((int[])nArray18));
                        Time.sleepTicks((int)llIIIlIIIl[4]);
                        0;
                    }
                    int[] nArray19 = new int[llIIIlIIIl[0]];
                    nArray19[C.llIIIlIIIl[1]] = llIIIlIIIl[110];
                    if (C.lIlIIlIlIIlll(Inventory.contains((int[])nArray19) ? 1 : 0)) {
                        int[] nArray20 = new int[llIIIlIIIl[0]];
                        nArray20[C.llIIIlIIIl[1]] = llIIIlIIIl[110];
                        int[] nArray21 = new int[llIIIlIIIl[0]];
                        nArray21[C.llIIIlIIIl[1]] = llIIIlIIIl[111];
                        Inventory.getFirst((int[])nArray20).useOn(TileObjects.getNearest((int[])nArray21));
                        Time.sleepTicks((int)llIIIlIIIl[4]);
                        0;
                    }
                    int[] nArray22 = new int[llIIIlIIIl[0]];
                    nArray22[C.llIIIlIIIl[1]] = llIIIlIIIl[112];
                    if (C.lIlIIlIlIIlll(Inventory.contains((int[])nArray22) ? 1 : 0)) {
                        int[] nArray23 = new int[llIIIlIIIl[0]];
                        nArray23[C.llIIIlIIIl[1]] = llIIIlIIIl[112];
                        int[] nArray24 = new int[llIIIlIIIl[0]];
                        nArray24[C.llIIIlIIIl[1]] = llIIIlIIIl[113];
                        Inventory.getFirst((int[])nArray23).useOn(TileObjects.getNearest((int[])nArray24));
                        Time.sleepTicks((int)llIIIlIIIl[4]);
                        0;
                    }
                }
            }
            if (C.lIlIIlIllIIII(e.j(eG), llIIIlIIIl[114])) {
                if (C.lIlIIlIlIlllI(Players.getLocal().getWorldLocation().distanceTo(eE), llIIIlIIIl[12]) && C.lIlIIlIllIIII(Players.getLocal().getWorldLocation().getPlane(), llIIIlIIIl[3])) {
                    AccBuilderSotf.c = llIIIlIIII[llIIIlIIIl[115]];
                    String[] stringArray = new String[llIIIlIIIl[0]];
                    stringArray[C.llIIIlIIIl[1]] = llIIIlIIII[llIIIlIIIl[62]];
                    TileObjects.getNearest((String[])stringArray).interact(llIIIlIIII[llIIIlIIIl[116]]);
                    Time.sleepTicks((int)llIIIlIIIl[4]);
                    0;
                }
                String[] stringArray = new String[llIIIlIIIl[0]];
                stringArray[C.llIIIlIIIl[1]] = llIIIlIIII[llIIIlIIIl[117]];
                if (C.lIlIIlIlIlIll(NPCs.getNearest((String[])stringArray))) {
                    llllllllllllllllllIlIlllllllIlll = new WorldPoint(llIIIlIIIl[118], llIIIlIIIl[119], llIIIlIIIl[1]);
                    if (C.lIlIIlIlIlIIl(Players.getLocal().getWorldLocation().equals((Object)llllllllllllllllllIlIlllllllIlll) ? 1 : 0)) {
                        Movement.walkTo((WorldPoint)llllllllllllllllllIlIlllllllIlll);
                        0;
                        Time.sleepTicks((int)llIIIlIIIl[0]);
                        0;
                    }
                    if (C.lIlIIlIlIlIIl(Prayers.isEnabled((Prayer)Prayer.PROTECT_FROM_MELEE) ? 1 : 0) && C.lIlIIlIlIllII(Prayers.getPoints()) && C.lIlIIlIlIlIlI(Skills.getLevel((Skill)Skill.PRAYER), llIIIlIIIl[66])) {
                        Prayers.toggle((Prayer)Prayer.PROTECT_FROM_MELEE);
                    }
                    if (C.lIlIIlIlIIlll(Players.getLocal().getWorldLocation().equals((Object)llllllllllllllllllIlIlllllllIlll) ? 1 : 0)) {
                        if (C.lIlIIlIlIlIIl(m.ap() ? 1 : 0)) {
                            m.aq();
                        }
                        if (C.lIlIIlIlIlIII(Prayers.getPoints(), llIIIlIIIl[43]) && C.lIlIIlIlIIlll(Inventory.contains((int[])f.aX) ? 1 : 0)) {
                            Inventory.getFirst((int[])f.aX).interact(llIIIlIIII[llIIIlIIIl[120]]);
                            Time.sleepTicks((int)llIIIlIIIl[0]);
                            0;
                        }
                        if (C.lIlIIlIllIIIl(Players.getLocal().getInteracting())) {
                            String[] stringArray21 = new String[llIIIlIIIl[0]];
                            stringArray21[C.llIIIlIIIl[1]] = llIIIlIIII[llIIIlIIIl[121]];
                            NPCs.getNearest((String[])stringArray21).interact(llIIIlIIII[llIIIlIIIl[122]]);
                            Time.sleepTicks((int)llIIIlIIIl[3]);
                            0;
                        }
                    }
                }
                g.a(cE);
            }
            if (C.lIlIIlIllIIII(e.j(eG), llIIIlIIIl[123])) {
                if (C.lIlIIlIlIIlll(Prayers.isEnabled((Prayer)Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                    Prayers.toggle((Prayer)Prayer.PROTECT_FROM_MELEE);
                }
                if (C.lIlIIlIlIllIl(Players.getLocal().getWorldLocation().distanceTo(eF), llIIIlIIIl[6])) {
                    AccBuilderSotf.c = llIIIlIIII[llIIIlIIIl[124]];
                    Movement.walkTo((WorldPoint)eF);
                    0;
                    Time.sleepTicks((int)llIIIlIIIl[0]);
                    0;
                }
                if (C.lIlIIlIlIlllI(Players.getLocal().getWorldLocation().distanceTo(eF), llIIIlIIIl[6])) {
                    g.a(llIIIlIIII[llIIIlIIIl[125]], cE);
                }
                g.a(cE);
            }
            if (C.lIlIIlIllIIII(e.j(eG), llIIIlIIIl[35])) {
                String[] stringArray = new String[llIIIlIIIl[0]];
                stringArray[C.llIIIlIIIl[1]] = llIIIlIIII[llIIIlIIIl[126]];
                if (C.lIlIIlIlIlIIl(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    AccBuilderSotf.c = llIIIlIIII[llIIIlIIIl[127]];
                    C.bB();
                }
                String[] stringArray22 = new String[llIIIlIIIl[0]];
                stringArray22[C.llIIIlIIIl[1]] = llIIIlIIII[llIIIlIIIl[72]];
                if (C.lIlIIlIlIIlll(Inventory.contains((String[])stringArray22) ? 1 : 0)) {
                    if (C.lIlIIlIlIllIl(Players.getLocal().getWorldLocation().distanceTo(eF), llIIIlIIIl[6])) {
                        AccBuilderSotf.c = llIIIlIIII[llIIIlIIIl[128]];
                        Movement.walkTo((WorldPoint)eF);
                        0;
                        Time.sleepTicks((int)llIIIlIIIl[0]);
                        0;
                    }
                    if (C.lIlIIlIlIlllI(Players.getLocal().getWorldLocation().distanceTo(eF), llIIIlIIIl[6])) {
                        if (C.lIlIIlIlIlIII(di, llIIIlIIIl[0])) {
                            aN.qt += llIIIlIIIl[0];
                            aN.u(AccBuilderSotf.m);
                            di += llIIIlIIIl[0];
                            aN.qt = llIIIlIIIl[1];
                        }
                        g.a(llIIIlIIII[llIIIlIIIl[129]], cE);
                    }
                }
            }
        }
    }

    private static boolean lIlIIlIllIIII(int n2, int n3) {
        return n2 == n3;
    }

    private static String lIlIIlIIllIIl(String llllllllllllllllllIlIllllllIIIll, String llllllllllllllllllIlIllllllIIlII) {
        try {
            SecretKeySpec llllllllllllllllllIlIllllllIlIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllllIlIllllllIIlII.getBytes(StandardCharsets.UTF_8)), llIIIlIIIl[25]), "DES");
            Cipher llllllllllllllllllIlIllllllIIlll = Cipher.getInstance("DES");
            llllllllllllllllllIlIllllllIIlll.init(llIIIlIIIl[3], llllllllllllllllllIlIllllllIlIII);
            return new String(llllllllllllllllllIlIllllllIIlll.doFinal(Base64.getDecoder().decode(llllllllllllllllllIlIllllllIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllllIlIllllllIIllI) {
            llllllllllllllllllIlIllllllIIllI.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIIlIlIllII(int n2) {
        return n2 > 0;
    }

    private static boolean lIlIIlIlIlIll(Object object) {
        return object != null;
    }

    /*
     * WARNING - void declaration
     */
    private static boolean an() {
        void llllllllllllllllllIlIlllllllIlII;
        int[] nArray = new int[llIIIlIIIl[6]];
        nArray[C.llIIIlIIIl[1]] = llIIIlIIIl[17];
        nArray[C.llIIIlIIIl[0]] = llIIIlIIIl[11];
        nArray[C.llIIIlIIIl[3]] = llIIIlIIIl[13];
        nArray[C.llIIIlIIIl[4]] = llIIIlIIIl[18];
        int[] nArray2 = nArray;
        int llllllllllllllllllIlIlllllllIIll = llIIIlIIIl[1];
        while (C.lIlIIlIlIlIII(llllllllllllllllllIlIlllllllIIll, ((void)llllllllllllllllllIlIlllllllIlII).length)) {
            int[] nArray3 = new int[llIIIlIIIl[0]];
            nArray3[C.llIIIlIIIl[1]] = llllllllllllllllllIlIlllllllIlII[llllllllllllllllllIlIlllllllIIll];
            if (C.lIlIIlIlIlIIl(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                return llIIIlIIIl[1];
            }
            ++llllllllllllllllllIlIlllllllIIll;
            0;
            if (((0xA1 ^ 0x82) & ~(0x15 ^ 0x36)) == ((0x8B ^ 0xA1) & ~(6 ^ 0x2C))) continue;
            return ((0xA9 ^ 0xA7) & ~(0xCC ^ 0xC2)) != 0;
        }
        return llIIIlIIIl[0];
    }

    private static String lIlIIlIIllIII(String llllllllllllllllllIlIlllllIIIIII, String llllllllllllllllllIlIllllIllllIl) {
        try {
            SecretKeySpec llllllllllllllllllIlIlllllIIIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllllIlIllllIllllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllllIlIlllllIIIIlI = Cipher.getInstance("Blowfish");
            llllllllllllllllllIlIlllllIIIIlI.init(llIIIlIIIl[3], llllllllllllllllllIlIlllllIIIIll);
            return new String(llllllllllllllllllIlIlllllIIIIlI.doFinal(Base64.getDecoder().decode(llllllllllllllllllIlIlllllIIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllllIlIlllllIIIIIl) {
            llllllllllllllllllIlIlllllIIIIIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIIlIllIIIl(Object object) {
        return object == null;
    }

    private static boolean lIlIIlIlIllIl(int n2, int n3) {
        return n2 > n3;
    }

    @Override
    public boolean ah() {
        boolean bl;
        if (C.lIlIIlIllIIII(e.j(eG), llIIIlIIIl[186])) {
            bl = llIIIlIIIl[0];
            0;
            if (-3 > 0) {
                return ((8 ^ 0x20) & ~(0xAF ^ 0x87)) != 0;
            }
        } else {
            bl = llIIIlIIIl[1];
        }
        return bl;
    }

    @Override
    public String ag() {
        return h;
    }

    private static boolean lIlIIlIlIlIlI(int n2, int n3) {
        return n2 >= n3;
    }

    @Override
    public int af() {
        try {
            C.bA();
            0;
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (((0xA2 ^ 0xB8 ^ (0x27 ^ 0x5D)) & (98 + 38 - 26 + 52 ^ 177 + 9 - 101 + 109 ^ -1)) < ((126 + 111 - 191 + 109 ^ 42 + 121 - -2 + 3) & (0x26 ^ 0x16 ^ 3 ^ -1))) {
            return (0xEB ^ 0x80 ^ (0x63 ^ 0x50)) & (50 + 111 - 73 + 158 ^ 121 + 113 - 156 + 96 ^ -1);
        }
        return llIIIlIIIl[82];
    }

    static {
        C.lIlIIlIlIIllI();
        C.lIlIIlIlIIlIl();
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
        bv = new ArrayList<d>();
        String[] stringArray = new String[llIIIlIIIl[30]];
        stringArray[C.llIIIlIIIl[1]] = llIIIlIIII[llIIIlIIIl[200]];
        stringArray[C.llIIIlIIIl[0]] = llIIIlIIII[llIIIlIIIl[201]];
        stringArray[C.llIIIlIIIl[3]] = llIIIlIIII[llIIIlIIIl[202]];
        stringArray[C.llIIIlIIIl[4]] = llIIIlIIII[llIIIlIIIl[203]];
        stringArray[C.llIIIlIIIl[6]] = llIIIlIIII[llIIIlIIIl[204]];
        stringArray[C.llIIIlIIIl[12]] = llIIIlIIII[llIIIlIIIl[114]];
        stringArray[C.llIIIlIIIl[19]] = llIIIlIIII[llIIIlIIIl[205]];
        stringArray[C.llIIIlIIIl[23]] = llIIIlIIII[llIIIlIIIl[206]];
        stringArray[C.llIIIlIIIl[25]] = llIIIlIIII[llIIIlIIIl[207]];
        stringArray[C.llIIIlIIIl[27]] = llIIIlIIII[llIIIlIIIl[208]];
        stringArray[C.llIIIlIIIl[16]] = llIIIlIIII[llIIIlIIIl[209]];
        stringArray[C.llIIIlIIIl[29]] = llIIIlIIII[llIIIlIIIl[210]];
        stringArray[C.llIIIlIIIl[24]] = llIIIlIIII[llIIIlIIIl[211]];
        cE = stringArray;
        eG = llIIIlIIIl[35];
        da = llIIIlIIII[llIIIlIIIl[212]];
        h = "Grand Tree " + da;
    }

    private static void lIlIIlIlIIllI() {
        llIIIlIIIl = new int[214];
        C.llIIIlIIIl[0] = 1;
        C.llIIIlIIIl[1] = (0x57 ^ 0x1C ^ (0xE8 ^ 0xB8)) & (25 + 165 - 42 + 34 ^ 160 + 158 - 303 + 158 ^ -1);
        C.llIIIlIIIl[2] = 0x63 ^ 8 ^ (0x2F ^ 0x5D);
        C.llIIIlIIIl[3] = 2;
        C.llIIIlIIIl[4] = 3;
        C.llIIIlIIIl[5] = -(0xFFFFEB47 & 0x3CFD) & (0xFFFFBBEC & 0x7FDF);
        C.llIIIlIIIl[6] = 0xB9 ^ 0xBD;
        C.llIIIlIIIl[7] = -(0xFFFFEFF7 & 0x58DE) & (0xFFFFFAFF & 0x4FFF);
        C.llIIIlIIIl[8] = -(0xFFFFB36F & 0x7CBB) & (0xFFFFF7FB & 0x3FFE);
        C.llIIIlIIIl[9] = 0xFFFF9ABE & 0x676F;
        C.llIIIlIIIl[10] = 0xFFFFF7EF & 0xBF8;
        C.llIIIlIIIl[11] = 0xFFFFCFFE & 0x39F9;
        C.llIIIlIIIl[12] = 0xB8 ^ 0xBD;
        C.llIIIlIIIl[13] = 0xFFFFF3F1 & 0x3D5F;
        C.llIIIlIIIl[14] = -(0xFFFF9EC7 & 0x653D) & (0xFFFF8FB7 & 0x7DCE);
        C.llIIIlIIIl[15] = 0xFFFF8DFB & 0x737F;
        C.llIIIlIIIl[16] = 0x90 ^ 0x9A;
        C.llIIIlIIIl[17] = 0xFFFFBF4F & 0x5FF7;
        C.llIIIlIIIl[18] = -(0xFFFFFE1F & 0x19E1) & (0xFFFFFBEB & 0x1FF7);
        C.llIIIlIIIl[19] = 0x5E ^ 0x58;
        C.llIIIlIIIl[20] = 0xFFFFD3F6 & 0x2DFD;
        C.llIIIlIIIl[21] = 0xFFFF9DDF & 0x67FC;
        C.llIIIlIIIl[22] = 0x92 ^ 0xA0;
        C.llIIIlIIIl[23] = 0x5A ^ 0x5D;
        C.llIIIlIIIl[24] = 0xA6 ^ 0xAA;
        C.llIIIlIIIl[25] = 0x91 ^ 0x99;
        C.llIIIlIIIl[26] = 0x60 ^ 0xF ^ (0x37 ^ 0x57);
        C.llIIIlIIIl[27] = 0x25 ^ 0x2C;
        C.llIIIlIIIl[28] = 0x8F ^ 0x9B;
        C.llIIIlIIIl[29] = 0x4F ^ 0x77 ^ (0x55 ^ 0x66);
        C.llIIIlIIIl[30] = 49 + 81 - 123 + 172 ^ 32 + 81 - -75 + 2;
        C.llIIIlIIIl[31] = 3 ^ 0x39 ^ (0x2F ^ 0x1B);
        C.llIIIlIIIl[32] = 3 ^ 0x13;
        C.llIIIlIIIl[33] = -(0xFFFFF2F7 & 0x1D8C) & (0xFFFFFFFB & 0x1CF7);
        C.llIIIlIIIl[34] = 0xFFFFDFBB & 0x2DF7;
        C.llIIIlIIIl[35] = 50 + 43 - 36 + 93;
        C.llIIIlIIIl[36] = 0x68 ^ 0x40;
        C.llIIIlIIIl[37] = 0xDF ^ 0xBA ^ (0xB ^ 0x7F);
        C.llIIIlIIIl[38] = 22 + 48 - -61 + 14 ^ 38 + 6 - -36 + 63;
        C.llIIIlIIIl[39] = 0xA7 ^ 0x9F ^ (0xEF ^ 0xC5);
        C.llIIIlIIIl[40] = 0x44 ^ 0x57;
        C.llIIIlIIIl[41] = 0x1C ^ 4 ^ (0x50 ^ 0x5D);
        C.llIIIlIIIl[42] = 128 + 140 - 146 + 49 ^ 152 + 101 - 243 + 179;
        C.llIIIlIIIl[43] = 4 ^ 0x13;
        C.llIIIlIIIl[44] = 0x40 ^ 0x58;
        C.llIIIlIIIl[45] = 0x79 ^ 0x45;
        C.llIIIlIIIl[46] = 0xD8 ^ 0xC2;
        C.llIIIlIIIl[47] = 0xB ^ 0x10;
        C.llIIIlIIIl[48] = 0x3A ^ 0x21 ^ (0x17 ^ 0x10);
        C.llIIIlIIIl[49] = 0x84 ^ 0x97 ^ (0xA1 ^ 0xAF);
        C.llIIIlIIIl[50] = 0x57 ^ 0x48;
        C.llIIIlIIIl[51] = 0x43 ^ 0x63;
        C.llIIIlIIIl[52] = 0x31 ^ 0x10;
        C.llIIIlIIIl[53] = 0x87 ^ 0xA5;
        C.llIIIlIIIl[54] = 0x39 ^ 0x1A;
        C.llIIIlIIIl[55] = 3 ^ (0x56 ^ 0x71);
        C.llIIIlIIIl[56] = 49 + 53 - -36 + 28 ^ 107 + 113 - 147 + 58;
        C.llIIIlIIIl[57] = 0xC0 ^ 0x86;
        C.llIIIlIIIl[58] = 0x5C ^ 0x4D ^ (0xAE ^ 0x99);
        C.llIIIlIIIl[59] = 79 + 90 - 119 + 105 ^ 114 + 9 - 21 + 86;
        C.llIIIlIIIl[60] = 0xFFFFEDF3 & 0x1BAC;
        C.llIIIlIIIl[61] = -(0xFFFF9DE5 & 0x725F) & (0xFFFF9FFE & 0x7DED);
        C.llIIIlIIIl[62] = 0x42 ^ 0x12;
        C.llIIIlIIIl[63] = 0x37 ^ 0x1E;
        C.llIIIlIIIl[64] = 0xD5 ^ 0xB5 ^ (0xD ^ 0x47);
        C.llIIIlIIIl[65] = -(0xFFFFDEFF & 0x3115) & (0xFFFF9B97 & 0x7FFD);
        C.llIIIlIIIl[66] = 0x2B ^ 0;
        C.llIIIlIIIl[67] = 0x54 ^ 0x78;
        C.llIIIlIIIl[68] = 0x7D ^ 0x50;
        C.llIIIlIIIl[69] = 15 + 71 - 40 + 105 ^ 22 + 15 - -24 + 124;
        C.llIIIlIIIl[70] = 131 + 125 - 151 + 33 ^ 84 + 104 - 52 + 29;
        C.llIIIlIIIl[71] = 0x54 ^ 0x64;
        C.llIIIlIIIl[72] = 23 + 184 - 44 + 52 ^ 127 + 139 - 174 + 49;
        C.llIIIlIIIl[73] = 0x5E ^ 0x6F;
        C.llIIIlIIIl[74] = 0x43 ^ 3 ^ (0xE3 ^ 0x90);
        C.llIIIlIIIl[75] = 0xF6 ^ 0xC2;
        C.llIIIlIIIl[76] = 0x83 ^ 0xB6;
        C.llIIIlIIIl[77] = 0x48 ^ 0x7E;
        C.llIIIlIIIl[78] = 172 + 60 - 193 + 138 ^ 80 + 20 - 16 + 50;
        C.llIIIlIIIl[79] = 0xA4 ^ 0x9C;
        C.llIIIlIIIl[80] = 0xF1 ^ 0xAF ^ (0x46 ^ 0x21);
        C.llIIIlIIIl[81] = 0x19 ^ 0x23;
        C.llIIIlIIIl[82] = 184 + 40 - 93 + 108 ^ 31 + 36 - 11 + 83;
        C.llIIIlIIIl[83] = 5 ^ 0x3E;
        C.llIIIlIIIl[84] = 0xFC ^ 0xC1;
        C.llIIIlIIIl[85] = 0x21 ^ 0x1F;
        C.llIIIlIIIl[86] = -(0xFFFFF8D7 & 0x377B) & (0xFFFFBDF3 & 0x7BFF);
        C.llIIIlIIIl[87] = 0xFFFFCFBF & 0x3DD7;
        C.llIIIlIIIl[88] = 0x3A ^ 5;
        C.llIIIlIIIl[89] = 122 + 156 - 241 + 160 ^ 118 + 43 - 106 + 78;
        C.llIIIlIIIl[90] = 173 + 82 - 115 + 99 ^ 3 + 94 - 71 + 148;
        C.llIIIlIIIl[91] = (0xFC ^ 0x9D) & ~(0x71 ^ 0x10) ^ (0x31 ^ 0x73);
        C.llIIIlIIIl[92] = 0x64 ^ 0x27;
        C.llIIIlIIIl[93] = 64 + 144 - 203 + 211 ^ 55 + 11 - -51 + 39;
        C.llIIIlIIIl[94] = 0xFFFFABEF & 0x5D77;
        C.llIIIlIIIl[95] = 87 + 46 - -59 + 9 ^ 133 + 121 - 240 + 126;
        C.llIIIlIIIl[96] = 0xE6 ^ 0xA1;
        C.llIIIlIIIl[97] = 210 + 112 - 142 + 67 ^ 87 + 0 - 51 + 155;
        C.llIIIlIIIl[98] = 0x5D ^ 0x14;
        C.llIIIlIIIl[99] = 2 ^ 0x59 ^ (9 ^ 0x18);
        C.llIIIlIIIl[100] = 0xC7 ^ 0xB7 ^ (0x7E ^ 0x60);
        C.llIIIlIIIl[101] = 0x6F ^ 0x24;
        C.llIIIlIIIl[102] = 0xB8 ^ 0x90 ^ (0xDE ^ 0xBA);
        C.llIIIlIIIl[103] = 0x37 ^ 0x4F;
        C.llIIIlIIIl[104] = 0x58 ^ 0x53 ^ (0x69 ^ 0x2F);
        C.llIIIlIIIl[105] = 0x56 ^ 0x18;
        C.llIIIlIIIl[106] = 0xFFFFA7BF & 0x5B55;
        C.llIIIlIIIl[107] = 0xFFFF898A & 0x7FFD;
        C.llIIIlIIIl[108] = 0xFFFFB796 & 0x4B7F;
        C.llIIIlIIIl[109] = 0xFFFF9FFD & 0x698B;
        C.llIIIlIIIl[110] = 0xFFFF83F7 & 0x7F1F;
        C.llIIIlIIIl[111] = -(0xFFFFE7FD & 0x7A77) & (0xFFFFEBFF & 0x7FFE);
        C.llIIIlIIIl[112] = 0xFFFFABDC & 0x573B;
        C.llIIIlIIIl[113] = -(0xFFFFB667 & 0x7FFD) & (0xFFFFBFEF & Short.MAX_VALUE);
        C.llIIIlIIIl[114] = (0xF5 ^ 0x91) + 2 - (0x54 ^ 0x16) + (0xEA ^ 0xB4);
        C.llIIIlIIIl[115] = 0x54 ^ 0x1B;
        C.llIIIlIIIl[116] = 0x14 ^ 0x45;
        C.llIIIlIIIl[117] = 0x80 ^ 0x99 ^ (0x7F ^ 0x34);
        C.llIIIlIIIl[118] = 0xFFFF89B8 & Short.MAX_VALUE;
        C.llIIIlIIIl[119] = -(0xFFFFC777 & 0x78CD) & (0xFFFFEFFF & 0x76C7);
        C.llIIIlIIIl[120] = 0xCB ^ 0x98;
        C.llIIIlIIIl[121] = 0x2D ^ 0x3F ^ (0x1B ^ 0x5D);
        C.llIIIlIIIl[122] = 8 + 16 - -163 + 28 ^ 20 + 65 - 32 + 77;
        C.llIIIlIIIl[123] = 93 + 55 - 111 + 103;
        C.llIIIlIIIl[124] = 0x9F ^ 0xB7 ^ (0x69 ^ 0x17);
        C.llIIIlIIIl[125] = 0xE0 ^ 0xB7;
        C.llIIIlIIIl[126] = 0x68 ^ 0x30;
        C.llIIIlIIIl[127] = 53 + 137 - 64 + 100 ^ 64 + 24 - 7 + 106;
        C.llIIIlIIIl[128] = 9 ^ 0x52;
        C.llIIIlIIIl[129] = 0xF2 ^ 0xAE;
        C.llIIIlIIIl[130] = -(0xFFFFF63D & 0x79D3) & (0xFFFFFBBA & 0x7DF7);
        C.llIIIlIIIl[131] = 0xFFFFE7AF & 0x3EF8;
        C.llIIIlIIIl[132] = 0x48 ^ 0x15;
        C.llIIIlIIIl[133] = 0x53 ^ 0xD;
        C.llIIIlIIIl[134] = -(0xFFFFBDCB & 0x5A7D) & (0xFFFFFEFF & 0x3FEC);
        C.llIIIlIIIl[135] = 0xD3 ^ 0x8C;
        C.llIIIlIIIl[136] = 0xEC ^ 0x8C;
        C.llIIIlIIIl[137] = 0xFFFFADF7 & 0x5BAF;
        C.llIIIlIIIl[138] = 0x35 ^ 0x6A ^ (0x1F ^ 0x21);
        C.llIIIlIIIl[139] = 0x69 ^ 0x50 ^ (0x10 ^ 0x4B);
        C.llIIIlIIIl[140] = 0xFFFFCBFF & 0x3DAB;
        C.llIIIlIIIl[141] = 0x9F ^ 0xA0 ^ (0xDD ^ 0x81);
        C.llIIIlIIIl[142] = 0xFFFF89B3 & Short.MAX_VALUE;
        C.llIIIlIIIl[143] = 0xFFFFE7AF & 0x3EFF;
        C.llIIIlIIIl[144] = 0x77 ^ 0x67 ^ (0x24 ^ 0x51);
        C.llIIIlIIIl[145] = 2 ^ 0x64;
        C.llIIIlIIIl[146] = -(0xFFFFFF8E & 0x6477) & (0xFFFFEDFF & 0x7FBF);
        C.llIIIlIIIl[147] = 11 + 181 - -40 + 17 ^ 59 + 121 - 96 + 74;
        C.llIIIlIIIl[148] = 172 + 105 - 184 + 105 ^ 114 + 46 - 60 + 74;
        C.llIIIlIIIl[149] = 0xFFFF99B7 & 0x6FFE;
        C.llIIIlIIIl[150] = -(0xFFFFE9E2 & 0x1F7D) & (0xFFFFEFFF & 0x3FFF);
        C.llIIIlIIIl[151] = 0xA ^ 0x63;
        C.llIIIlIIIl[152] = 0xBD ^ 0x8E ^ (1 ^ 0x58);
        C.llIIIlIIIl[153] = 0xFFFFADAE & 0x5BF7;
        C.llIIIlIIIl[154] = -(0xFFFFE6AF & 0x595D) & (0xFFFFFFFF & 0x669D);
        C.llIIIlIIIl[155] = 0x20 ^ 0x4B;
        C.llIIIlIIIl[156] = 0xAC ^ 0xC0;
        C.llIIIlIIIl[157] = -(0xFFFFFA7B & 0x77E7) & (0xFFFFFFFE & 0x7BFF);
        C.llIIIlIIIl[158] = 0xFFFFAEDD & 0x77BA;
        C.llIIIlIIIl[159] = 0xEB ^ 0xBF ^ (0x67 ^ 0x5E);
        C.llIIIlIIIl[160] = -(0xFFFF845B & 0x7FE6) & (0xFFFFEFDB & 0x1DFF);
        C.llIIIlIIIl[161] = -(0xFFFF9DFF & 0x7B6D) & (0xFFFFBFFF & Short.MAX_VALUE);
        C.llIIIlIIIl[162] = 0xFD ^ 0x92;
        C.llIIIlIIIl[163] = 0xEC ^ 0x9C;
        C.llIIIlIIIl[164] = 0xFFFFFD9E & 0xBEF;
        C.llIIIlIIIl[165] = 0xCD ^ 0xBC;
        C.llIIIlIIIl[166] = 0x28 ^ 0x5A;
        C.llIIIlIIIl[167] = -(0xFFFFDC67 & 0x73FC) & (0xFFFFFEFF & 0x77FF);
        C.llIIIlIIIl[168] = 0x75 ^ 6;
        C.llIIIlIIIl[169] = 0 ^ 0x74;
        C.llIIIlIIIl[170] = 0xFFFFAF9D & 0x59EF;
        C.llIIIlIIIl[171] = 0xE5 ^ 0x90;
        C.llIIIlIIIl[172] = 0xE4 ^ 0x92;
        C.llIIIlIIIl[173] = 0xFFFF8F97 & 0x79FD;
        C.llIIIlIIIl[174] = 0xC ^ 0x7B;
        C.llIIIlIIIl[175] = 0xFFFFD997 & 0x2FFF;
        C.llIIIlIIIl[176] = -(0xF4 ^ 0x95) & (0xFFFFFFFF & 0x26FF);
        C.llIIIlIIIl[177] = 0x6B ^ 6 ^ (0xB5 ^ 0xA1);
        C.llIIIlIIIl[178] = 0x6C ^ 0x7A ^ (0x50 ^ 0x3C);
        C.llIIIlIIIl[179] = 0xFC ^ 0x87;
        C.llIIIlIIIl[180] = 0xFFFFFFF8 & 0x197;
        C.llIIIlIIIl[181] = -(0xFFFFF7CF & 0x5A31) & (0xFFFFDFEF & 0x7BD4);
        C.llIIIlIIIl[182] = 0xFFFFFEEE & 0x2FDD;
        C.llIIIlIIIl[183] = -(0xFFFF9FF7 & 0x745F) & (0xFFFFF7FE & 0x7DFF);
        C.llIIIlIIIl[184] = -(0xFFFFEFEC & 0x511B) & (0xFFFFFBBF & 0x7FDF);
        C.llIIIlIIIl[185] = 0xFFFF97AF & 0x6BD4;
        C.llIIIlIIIl[186] = (0x3E ^ 0x36) + (0x74 ^ 0xD) - (0x79 ^ 0x6D) + (0x53 ^ 0x60);
        C.llIIIlIIIl[187] = 0xA0 ^ 0x97 ^ (0x78 ^ 0x33);
        C.llIIIlIIIl[188] = -(0xFFFFEB03 & 0x74FF) & (0xFFFFFFBB & 0x6DEF);
        C.llIIIlIIIl[189] = -(0xFFFFBF5B & 0x75A7) & (0xFFFFBFF7 & 0x7F7F);
        C.llIIIlIIIl[190] = 0xFFFF9F1D & 0x6CF2;
        C.llIIIlIIIl[191] = -(0xFFFFF95D & 0x16BB) & (0xFFFFFFBF & 0x1DDF);
        C.llIIIlIIIl[192] = -(0xFFFFDB77 & 0x36D9) & (0xFFFF9FFF & 0x7FF7);
        C.llIIIlIIIl[193] = -(0xFFFFB2C9 & 0x7DB6) & (0xFFFFFFFF & 0x3BFF);
        C.llIIIlIIIl[194] = 0xFFFFDFFB & 0x2BE6;
        C.llIIIlIIIl[195] = -(0xFFFFF247 & 0x7DFF) & (0xFFFFFBFF & Short.MAX_VALUE);
        C.llIIIlIIIl[196] = 0xFFFFDBF7 & 0x2FEE;
        C.llIIIlIIIl[197] = 0xFFFFFFF7 & 0x95C;
        C.llIIIlIIIl[198] = -(0xFFFFE1E7 & 0x3E1A) & (0xFFFFEDBB & 0x3FFF);
        C.llIIIlIIIl[199] = -(0xFFFFF97F & 0x36F7) & (0xFFFFFFFF & 0x3DFF);
        C.llIIIlIIIl[200] = 0xD3 ^ 0x92 ^ (0x23 ^ 0x1F);
        C.llIIIlIIIl[201] = 0xB ^ 0x75;
        C.llIIIlIIIl[202] = 48 + 23 - -47 + 9;
        C.llIIIlIIIl[203] = 24 + 120 - 111 + 95;
        C.llIIIlIIIl[204] = 37 + 38 - 27 + 81;
        C.llIIIlIIIl[205] = 65 + 107 - 156 + 115;
        C.llIIIlIIIl[206] = 0 + 7 - -10 + 115;
        C.llIIIlIIIl[207] = (0x91 ^ 0xC5) + (0xDB ^ 0xB2) - (0xE2 ^ 0xBA) + (0x71 ^ 0x51);
        C.llIIIlIIIl[208] = 102 + 57 - 52 + 27;
        C.llIIIlIIIl[209] = 46 + 79 - 41 + 51;
        C.llIIIlIIIl[210] = 54 + 48 - 96 + 130;
        C.llIIIlIIIl[211] = (9 ^ 0x43) + (0xE3 ^ 0xB5) - (0x39 ^ 0x5C) + (0x3C ^ 0x72);
        C.llIIIlIIIl[212] = (0x61 ^ 0x6D) + (0x34 ^ 0xD) - (0x77 ^ 0x45) + (0x65 ^ 0x12);
        C.llIIIlIIIl[213] = 113 + 106 - 113 + 33;
    }
}

