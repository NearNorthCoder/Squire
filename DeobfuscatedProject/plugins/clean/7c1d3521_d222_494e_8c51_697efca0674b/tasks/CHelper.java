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
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.IHelper;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.AHelper;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.ANHelper;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.ac;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.AVHelper;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.BHelper;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.DHelper;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.EHelper;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.FHelper;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.GHelper;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.HHelper;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.JHelper;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.MHelper;

public class CHelper
implements ac {
    public static final  WorldPoint eD;
    public static  boolean cJ;
    public static final  WorldPoint eB;
    public static final  WorldPoint ex;
    static  boolean eJ;
    public static final  WorldPoint eC;
    static  boolean eW;
    static  int eG;
    static  boolean eR;
    static  boolean eN;
    static  boolean eU;
    static  int di;
    public static  String[] cE;
    static  boolean eM;
    static  boolean eP;
    static  boolean eV;
    static  boolean eH;
    public static final  WorldPoint eE;
    static  boolean eK;
    static  boolean eI;
    public static final  WorldPoint ez;
    static  boolean eS;
    static  boolean eL;
    
    static  boolean eO;
    public static final  WorldPoint ew;
    static  boolean eQ;
    public static final  WorldPoint eF;
    public static  String h;
    static  boolean eT;
    public static  boolean bt;
    public static final  WorldPoint eA;
    public static final  WorldPoint ey;
    public static  List<d> bv;
    
    public static  String da;

    public static void bB() {
        if (C.lIlIIlIlIlIIl(eH ? 1 : 0) && C.lIlIIlIlIlIIl(g.M() ? 1 : 0)) {
            if (C.lIlIIlIlIllIl(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llIIIlIIIl[130], llIIIlIIIl[131], llIIIlIIIl[1])), llIIIlIIIl[3])) {
                Movement.walkTo((WorldPoint)new WorldPoint(llIIIlIIIl[130], llIIIlIIIl[131], llIIIlIIIl[1]));

                Time.sleepTicks((int)llIIIlIIIl[0]);

            }
            if (C.lIlIIlIlIlllI(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llIIIlIIIl[130], llIIIlIIIl[131], llIIIlIIIl[1])), llIIIlIIIl[3]) && C.lIlIIlIlIlIIl(Players.getLocal().isMoving() ? 1 : 0)) {
                if (C.lIlIIlIlIlIIl(Dialog.isOpen() ? 1 : 0)) {
                    Time.sleepTicks((int)llIIIlIIIl[3]);

                    String[] stringArray = new String[llIIIlIIIl[0]];
                    stringArray[C.llIIIlIIIl[1]] = llIIIlIIII[llIIIlIIIl[132]];
                    TileObjects.getNearest((String[])stringArray).interact(llIIIlIIII[llIIIlIIIl[133]]);
                    Time.sleepTicks((int)llIIIlIIIl[3]);

                    eH = llIIIlIIIl[0];
                }
                g.a(cE);
            }
        }
        if (C.lIlIIlIlIlIIl(eI ? 1 : 0) && C.lIlIIlIlIIlll(eH ? 1 : 0) && C.lIlIIlIlIlIIl(g.M() ? 1 : 0)) {
            if (C.lIlIIlIlIllIl(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llIIIlIIIl[60], llIIIlIIIl[134], llIIIlIIIl[1])), llIIIlIIIl[3]) && C.lIlIIlIlIIlll(Movement.walkTo((WorldPoint)new WorldPoint(llIIIlIIIl[60], llIIIlIIIl[134], llIIIlIIIl[1])) ? 1 : 0)) {
                Time.sleepTicks((int)llIIIlIIIl[0]);

            }
            if (C.lIlIIlIlIlllI(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llIIIlIIIl[60], llIIIlIIIl[134], llIIIlIIIl[1])), llIIIlIIIl[3]) && C.lIlIIlIlIlIIl(Players.getLocal().isMoving() ? 1 : 0)) {
                if (C.lIlIIlIlIlIIl(Dialog.isOpen() ? 1 : 0)) {
                    Time.sleepTicks((int)llIIIlIIIl[3]);

                    String[] stringArray = new String[llIIIlIIIl[0]];
                    stringArray[C.llIIIlIIIl[1]] = llIIIlIIII[llIIIlIIIl[135]];
                    TileObjects.getNearest((String[])stringArray).interact(llIIIlIIII[llIIIlIIIl[136]]);
                    Time.sleepTicks((int)llIIIlIIIl[3]);

                    eI = llIIIlIIIl[0];
                }
                g.a(cE);
            }
        }
        if (C.lIlIIlIlIlIIl(eJ ? 1 : 0) && C.lIlIIlIlIIlll(eI ? 1 : 0) && C.lIlIIlIlIlIIl(g.M() ? 1 : 0)) {
            if (C.lIlIIlIlIllIl(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llIIIlIIIl[137], llIIIlIIIl[134], llIIIlIIIl[1])), llIIIlIIIl[3]) && C.lIlIIlIlIIlll(Movement.walkTo((WorldPoint)new WorldPoint(llIIIlIIIl[137], llIIIlIIIl[134], llIIIlIIIl[1])) ? 1 : 0)) {
                Time.sleepTicks((int)llIIIlIIIl[0]);

            }
            if (C.lIlIIlIlIlllI(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llIIIlIIIl[137], llIIIlIIIl[134], llIIIlIIIl[1])), llIIIlIIIl[3]) && C.lIlIIlIlIlIIl(Players.getLocal().isMoving() ? 1 : 0)) {
                if (C.lIlIIlIlIlIIl(Dialog.isOpen() ? 1 : 0)) {
                    Time.sleepTicks((int)llIIIlIIIl[3]);

                    String[] stringArray = new String[llIIIlIIIl[0]];
                    stringArray[C.llIIIlIIIl[1]] = llIIIlIIII[llIIIlIIIl[138]];
                    TileObjects.getNearest((String[])stringArray).interact(llIIIlIIII[llIIIlIIIl[139]]);
                    Time.sleepTicks((int)llIIIlIIIl[3]);

                    eJ = llIIIlIIIl[0];
                }
                g.a(cE);
            }
        }
        if (C.lIlIIlIlIlIIl(eK ? 1 : 0) && C.lIlIIlIlIIlll(eJ ? 1 : 0) && C.lIlIIlIlIlIIl(g.M() ? 1 : 0)) {
            if (C.lIlIIlIlIllIl(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llIIIlIIIl[140], llIIIlIIIl[131], llIIIlIIIl[1])), llIIIlIIIl[3]) && C.lIlIIlIlIIlll(Movement.walkTo((WorldPoint)new WorldPoint(llIIIlIIIl[140], llIIIlIIIl[131], llIIIlIIIl[1])) ? 1 : 0)) {
                Time.sleepTicks((int)llIIIlIIIl[0]);

            }
            if (C.lIlIIlIlIlllI(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llIIIlIIIl[140], llIIIlIIIl[131], llIIIlIIIl[1])), llIIIlIIIl[3]) && C.lIlIIlIlIlIIl(Players.getLocal().isMoving() ? 1 : 0)) {
                if (C.lIlIIlIlIlIIl(Dialog.isOpen() ? 1 : 0)) {
                    Time.sleepTicks((int)llIIIlIIIl[3]);

                    String[] stringArray = new String[llIIIlIIIl[0]];
                    stringArray[C.llIIIlIIIl[1]] = llIIIlIIII[llIIIlIIIl[141]];
                    TileObjects.getNearest((String[])stringArray).interact(llIIIlIIII[llIIIlIIIl[82]]);
                    Time.sleepTicks((int)llIIIlIIIl[3]);

                    eK = llIIIlIIIl[0];
                }
                g.a(cE);
            }
        }
        if (C.lIlIIlIlIlIIl(eL ? 1 : 0) && C.lIlIIlIlIIlll(eK ? 1 : 0) && C.lIlIIlIlIlIIl(g.M() ? 1 : 0)) {
            if (C.lIlIIlIlIllIl(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llIIIlIIIl[142], llIIIlIIIl[143], llIIIlIIIl[1])), llIIIlIIIl[3]) && C.lIlIIlIlIIlll(Movement.walkTo((WorldPoint)new WorldPoint(llIIIlIIIl[142], llIIIlIIIl[143], llIIIlIIIl[1])) ? 1 : 0)) {
                Time.sleepTicks((int)llIIIlIIIl[0]);

            }
            if (C.lIlIIlIlIlllI(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llIIIlIIIl[142], llIIIlIIIl[143], llIIIlIIIl[1])), llIIIlIIIl[3]) && C.lIlIIlIlIlIIl(Players.getLocal().isMoving() ? 1 : 0)) {
                if (C.lIlIIlIlIlIIl(Dialog.isOpen() ? 1 : 0)) {
                    Time.sleepTicks((int)llIIIlIIIl[3]);

                    String[] stringArray = new String[llIIIlIIIl[0]];
                    stringArray[C.llIIIlIIIl[1]] = llIIIlIIII[llIIIlIIIl[144]];
                    TileObjects.getNearest((String[])stringArray).interact(llIIIlIIII[llIIIlIIIl[145]]);
                    Time.sleepTicks((int)llIIIlIIIl[3]);

                    eL = llIIIlIIIl[0];
                }
                g.a(cE);
            }
        }
        if (C.lIlIIlIlIlIIl(eM ? 1 : 0) && C.lIlIIlIlIIlll(eL ? 1 : 0) && C.lIlIIlIlIlIIl(g.M() ? 1 : 0)) {
            if (C.lIlIIlIlIllIl(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llIIIlIIIl[146], llIIIlIIIl[134], llIIIlIIIl[1])), llIIIlIIIl[3]) && C.lIlIIlIlIIlll(Movement.walkTo((WorldPoint)new WorldPoint(llIIIlIIIl[146], llIIIlIIIl[134], llIIIlIIIl[1])) ? 1 : 0)) {
                Time.sleepTicks((int)llIIIlIIIl[0]);

            }
            if (C.lIlIIlIlIlllI(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llIIIlIIIl[146], llIIIlIIIl[134], llIIIlIIIl[1])), llIIIlIIIl[3]) && C.lIlIIlIlIlIIl(Players.getLocal().isMoving() ? 1 : 0)) {
                if (C.lIlIIlIlIlIIl(Dialog.isOpen() ? 1 : 0)) {
                    Time.sleepTicks((int)llIIIlIIIl[3]);

                    String[] stringArray = new String[llIIIlIIIl[0]];
                    stringArray[C.llIIIlIIIl[1]] = llIIIlIIII[llIIIlIIIl[147]];
                    TileObjects.getNearest((String[])stringArray).interact(llIIIlIIII[llIIIlIIIl[148]]);
                    Time.sleepTicks((int)llIIIlIIIl[3]);

                    eM = llIIIlIIIl[0];
                }
                g.a(cE);
            }
        }
        if (C.lIlIIlIlIlIIl(eN ? 1 : 0) && C.lIlIIlIlIIlll(eM ? 1 : 0) && C.lIlIIlIlIlIIl(g.M() ? 1 : 0)) {
            if (C.lIlIIlIlIllIl(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llIIIlIIIl[149], llIIIlIIIl[150], llIIIlIIIl[1])), llIIIlIIIl[3]) && C.lIlIIlIlIIlll(Movement.walkTo((WorldPoint)new WorldPoint(llIIIlIIIl[149], llIIIlIIIl[150], llIIIlIIIl[1])) ? 1 : 0)) {
                Time.sleepTicks((int)llIIIlIIIl[0]);

            }
            if (C.lIlIIlIlIlllI(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llIIIlIIIl[149], llIIIlIIIl[150], llIIIlIIIl[1])), llIIIlIIIl[3]) && C.lIlIIlIlIlIIl(Players.getLocal().isMoving() ? 1 : 0)) {
                if (C.lIlIIlIlIlIIl(Dialog.isOpen() ? 1 : 0)) {
                    Time.sleepTicks((int)llIIIlIIIl[3]);

                    String[] stringArray = new String[llIIIlIIIl[0]];
                    stringArray[C.llIIIlIIIl[1]] = llIIIlIIII[llIIIlIIIl[151]];
                    TileObjects.getNearest((String[])stringArray).interact(llIIIlIIII[llIIIlIIIl[152]]);
                    Time.sleepTicks((int)llIIIlIIIl[3]);

                    eN = llIIIlIIIl[0];
                }
                g.a(cE);
            }
        }
        if (C.lIlIIlIlIlIIl(eO ? 1 : 0) && C.lIlIIlIlIIlll(eN ? 1 : 0) && C.lIlIIlIlIlIIl(g.M() ? 1 : 0)) {
            if (C.lIlIIlIlIllIl(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llIIIlIIIl[153], llIIIlIIIl[154], llIIIlIIIl[1])), llIIIlIIIl[3]) && C.lIlIIlIlIIlll(Movement.walkTo((WorldPoint)new WorldPoint(llIIIlIIIl[153], llIIIlIIIl[154], llIIIlIIIl[1])) ? 1 : 0)) {
                Time.sleepTicks((int)llIIIlIIIl[0]);

            }
            if (C.lIlIIlIlIlllI(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llIIIlIIIl[153], llIIIlIIIl[154], llIIIlIIIl[1])), llIIIlIIIl[3]) && C.lIlIIlIlIlIIl(Players.getLocal().isMoving() ? 1 : 0)) {
                if (C.lIlIIlIlIlIIl(Dialog.isOpen() ? 1 : 0)) {
                    Time.sleepTicks((int)llIIIlIIIl[3]);

                    String[] stringArray = new String[llIIIlIIIl[0]];
                    stringArray[C.llIIIlIIIl[1]] = llIIIlIIII[llIIIlIIIl[155]];
                    TileObjects.getNearest((String[])stringArray).interact(llIIIlIIII[llIIIlIIIl[156]]);
                    Time.sleepTicks((int)llIIIlIIIl[3]);

                    eO = llIIIlIIIl[0];
                }
                g.a(cE);
            }
        }
        if (C.lIlIIlIlIlIIl(eP ? 1 : 0) && C.lIlIIlIlIIlll(eO ? 1 : 0) && C.lIlIIlIlIlIIl(g.M() ? 1 : 0)) {
            if (C.lIlIIlIlIllIl(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llIIIlIIIl[157], llIIIlIIIl[158], llIIIlIIIl[1])), llIIIlIIIl[3]) && C.lIlIIlIlIIlll(Movement.walkTo((WorldPoint)new WorldPoint(llIIIlIIIl[157], llIIIlIIIl[158], llIIIlIIIl[1])) ? 1 : 0)) {
                Time.sleepTicks((int)llIIIlIIIl[0]);

            }
            if (C.lIlIIlIlIlllI(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llIIIlIIIl[157], llIIIlIIIl[158], llIIIlIIIl[1])), llIIIlIIIl[3]) && C.lIlIIlIlIlIIl(Players.getLocal().isMoving() ? 1 : 0)) {
                if (C.lIlIIlIlIlIIl(Dialog.isOpen() ? 1 : 0)) {
                    Time.sleepTicks((int)llIIIlIIIl[3]);

                    String[] stringArray = new String[llIIIlIIIl[0]];
                    stringArray[C.llIIIlIIIl[1]] = llIIIlIIII[llIIIlIIIl[159]];
                    TileObjects.getNearest((String[])stringArray).interact(llIIIlIIII[llIIIlIIIl[100]]);
                    Time.sleepTicks((int)llIIIlIIIl[3]);

                    eP = llIIIlIIIl[0];
                }
                g.a(cE);
            }
        }
        if (C.lIlIIlIlIlIIl(eQ ? 1 : 0) && C.lIlIIlIlIIlll(eP ? 1 : 0) && C.lIlIIlIlIlIIl(g.M() ? 1 : 0)) {
            if (C.lIlIIlIlIllIl(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llIIIlIIIl[160], llIIIlIIIl[161], llIIIlIIIl[1])), llIIIlIIIl[3]) && C.lIlIIlIlIIlll(Movement.walkTo((WorldPoint)new WorldPoint(llIIIlIIIl[160], llIIIlIIIl[161], llIIIlIIIl[1])) ? 1 : 0)) {
                Time.sleepTicks((int)llIIIlIIIl[0]);

            }
            if (C.lIlIIlIlIlllI(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llIIIlIIIl[160], llIIIlIIIl[161], llIIIlIIIl[1])), llIIIlIIIl[3]) && C.lIlIIlIlIlIIl(Players.getLocal().isMoving() ? 1 : 0)) {
                if (C.lIlIIlIlIlIIl(Dialog.isOpen() ? 1 : 0)) {
                    Time.sleepTicks((int)llIIIlIIIl[3]);

                    String[] stringArray = new String[llIIIlIIIl[0]];
                    stringArray[C.llIIIlIIIl[1]] = llIIIlIIII[llIIIlIIIl[162]];
                    TileObjects.getNearest((String[])stringArray).interact(llIIIlIIII[llIIIlIIIl[163]]);
                    Time.sleepTicks((int)llIIIlIIIl[3]);

                    eQ = llIIIlIIIl[0];
                }
                g.a(cE);
            }
        }
        if (C.lIlIIlIlIlIIl(eR ? 1 : 0) && C.lIlIIlIlIIlll(eQ ? 1 : 0) && C.lIlIIlIlIlIIl(g.M() ? 1 : 0)) {
            if (C.lIlIIlIlIllIl(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llIIIlIIIl[164], llIIIlIIIl[158], llIIIlIIIl[1])), llIIIlIIIl[3]) && C.lIlIIlIlIIlll(Movement.walkTo((WorldPoint)new WorldPoint(llIIIlIIIl[164], llIIIlIIIl[158], llIIIlIIIl[1])) ? 1 : 0)) {
                Time.sleepTicks((int)llIIIlIIIl[0]);

            }
            if (C.lIlIIlIlIlllI(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llIIIlIIIl[164], llIIIlIIIl[158], llIIIlIIIl[1])), llIIIlIIIl[3]) && C.lIlIIlIlIlIIl(Players.getLocal().isMoving() ? 1 : 0)) {
                if (C.lIlIIlIlIlIIl(Dialog.isOpen() ? 1 : 0)) {
                    Time.sleepTicks((int)llIIIlIIIl[3]);

                    String[] stringArray = new String[llIIIlIIIl[0]];
                    stringArray[C.llIIIlIIIl[1]] = llIIIlIIII[llIIIlIIIl[165]];
                    TileObjects.getNearest((String[])stringArray).interact(llIIIlIIII[llIIIlIIIl[166]]);
                    Time.sleepTicks((int)llIIIlIIIl[3]);

                    eR = llIIIlIIIl[0];
                }
                g.a(cE);
            }
        }
        if (C.lIlIIlIlIlIIl(eS ? 1 : 0) && C.lIlIIlIlIIlll(eR ? 1 : 0) && C.lIlIIlIlIlIIl(g.M() ? 1 : 0)) {
            if (C.lIlIIlIlIllIl(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llIIIlIIIl[109], llIIIlIIIl[167], llIIIlIIIl[1])), llIIIlIIIl[3]) && C.lIlIIlIlIIlll(Movement.walkTo((WorldPoint)new WorldPoint(llIIIlIIIl[109], llIIIlIIIl[167], llIIIlIIIl[1])) ? 1 : 0)) {
                Time.sleepTicks((int)llIIIlIIIl[0]);

            }
            if (C.lIlIIlIlIlllI(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llIIIlIIIl[109], llIIIlIIIl[167], llIIIlIIIl[1])), llIIIlIIIl[3]) && C.lIlIIlIlIlIIl(Players.getLocal().isMoving() ? 1 : 0)) {
                if (C.lIlIIlIlIlIIl(Dialog.isOpen() ? 1 : 0)) {
                    Time.sleepTicks((int)llIIIlIIIl[3]);

                    String[] stringArray = new String[llIIIlIIIl[0]];
                    stringArray[C.llIIIlIIIl[1]] = llIIIlIIII[llIIIlIIIl[168]];
                    TileObjects.getNearest((String[])stringArray).interact(llIIIlIIII[llIIIlIIIl[169]]);
                    Time.sleepTicks((int)llIIIlIIIl[3]);

                    eS = llIIIlIIIl[0];
                }
                g.a(cE);
            }
        }
        if (C.lIlIIlIlIlIIl(eT ? 1 : 0) && C.lIlIIlIlIIlll(eS ? 1 : 0) && C.lIlIIlIlIlIIl(g.M() ? 1 : 0)) {
            if (C.lIlIIlIlIllIl(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llIIIlIIIl[170], llIIIlIIIl[134], llIIIlIIIl[1])), llIIIlIIIl[3]) && C.lIlIIlIlIIlll(Movement.walkTo((WorldPoint)new WorldPoint(llIIIlIIIl[170], llIIIlIIIl[134], llIIIlIIIl[1])) ? 1 : 0)) {
                Time.sleepTicks((int)llIIIlIIIl[0]);

            }
            if (C.lIlIIlIlIlllI(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llIIIlIIIl[170], llIIIlIIIl[134], llIIIlIIIl[1])), llIIIlIIIl[3]) && C.lIlIIlIlIlIIl(Players.getLocal().isMoving() ? 1 : 0)) {
                if (C.lIlIIlIlIlIIl(Dialog.isOpen() ? 1 : 0)) {
                    Time.sleepTicks((int)llIIIlIIIl[3]);

                    String[] stringArray = new String[llIIIlIIIl[0]];
                    stringArray[C.llIIIlIIIl[1]] = llIIIlIIII[llIIIlIIIl[171]];
                    TileObjects.getNearest((String[])stringArray).interact(llIIIlIIII[llIIIlIIIl[172]]);
                    Time.sleepTicks((int)llIIIlIIIl[3]);

                    eT = llIIIlIIIl[0];
                }
                g.a(cE);
            }
        }
        if (C.lIlIIlIlIlIIl(eU ? 1 : 0) && C.lIlIIlIlIIlll(eT ? 1 : 0) && C.lIlIIlIlIlIIl(g.M() ? 1 : 0)) {
            if (C.lIlIIlIlIllIl(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llIIIlIIIl[173], llIIIlIIIl[134], llIIIlIIIl[1])), llIIIlIIIl[3]) && C.lIlIIlIlIIlll(Movement.walkTo((WorldPoint)new WorldPoint(llIIIlIIIl[173], llIIIlIIIl[134], llIIIlIIIl[1])) ? 1 : 0)) {
                Time.sleepTicks((int)llIIIlIIIl[0]);

            }
            if (C.lIlIIlIlIlllI(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llIIIlIIIl[173], llIIIlIIIl[134], llIIIlIIIl[1])), llIIIlIIIl[3]) && C.lIlIIlIlIlIIl(Players.getLocal().isMoving() ? 1 : 0)) {
                if (C.lIlIIlIlIlIIl(Dialog.isOpen() ? 1 : 0)) {
                    Time.sleepTicks((int)llIIIlIIIl[3]);

                    String[] stringArray = new String[llIIIlIIIl[0]];
                    stringArray[C.llIIIlIIIl[1]] = llIIIlIIII[llIIIlIIIl[174]];
                    TileObjects.getNearest((String[])stringArray).interact(llIIIlIIII[llIIIlIIIl[103]]);
                    Time.sleepTicks((int)llIIIlIIIl[3]);

                    eU = llIIIlIIIl[0];
                }
                g.a(cE);
            }
        }
        if (C.lIlIIlIlIlIIl(eV ? 1 : 0) && C.lIlIIlIlIIlll(eU ? 1 : 0) && C.lIlIIlIlIlIIl(g.M() ? 1 : 0)) {
            if (C.lIlIIlIlIllIl(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llIIIlIIIl[175], llIIIlIIIl[176], llIIIlIIIl[1])), llIIIlIIIl[3]) && C.lIlIIlIlIIlll(Movement.walkTo((WorldPoint)new WorldPoint(llIIIlIIIl[175], llIIIlIIIl[176], llIIIlIIIl[1])) ? 1 : 0)) {
                Time.sleepTicks((int)llIIIlIIIl[0]);

            }
            if (C.lIlIIlIlIlllI(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llIIIlIIIl[175], llIIIlIIIl[176], llIIIlIIIl[1])), llIIIlIIIl[3]) && C.lIlIIlIlIlIIl(Players.getLocal().isMoving() ? 1 : 0)) {
                if (C.lIlIIlIlIlIIl(Dialog.isOpen() ? 1 : 0)) {
                    Time.sleepTicks((int)llIIIlIIIl[3]);

                    String[] stringArray = new String[llIIIlIIIl[0]];
                    stringArray[C.llIIIlIIIl[1]] = llIIIlIIII[llIIIlIIIl[177]];
                    TileObjects.getNearest((String[])stringArray).interact(llIIIlIIII[llIIIlIIIl[178]]);
                    Time.sleepTicks((int)llIIIlIIIl[3]);

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
            d var1;
            block32: {
                block31: {
                    block30: {
                        Object var2;
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
                                                    var2 = new DHelper(llIIIlIIIl[15], llIIIlIIIl[16], e.c(llIIIlIIIl[180], llIIIlIIIl[20]));
                                                    bv.add((DHelper) ar2);

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
                                            var2 = new DHelper(llIIIlIIIl[7], llIIIlIIIl[181], llIIIlIIIl[25]);
                                            bv.add((DHelper) ar2);

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
                                    var2 = new DHelper(llIIIlIIIl[9], llIIIlIIIl[10], llIIIlIIIl[25]);
                                    bv.add((DHelper) ar2);

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
                            var2 = new DHelper(llIIIlIIIl[11], llIIIlIIIl[12], llIIIlIIIl[8]);
                            bv.add((DHelper) ar2);

                        }
                        if (C.lIlIIlIlIlIIl(Bank.contains((Predicate)(var2 = item -> item.getName().toLowerCase().contains(llIIIlIIII[llIIIlIIIl[187]]))) ? 1 : 0)) {
                            var1 = new DHelper(llIIIlIIIl[182], llIIIlIIIl[12], llIIIlIIIl[183]);
                            bv.add(var1);

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
                    var1 = new DHelper(llIIIlIIIl[13], llIIIlIIIl[6], j.cf);
                    bv.add(var1);

                }
                int[] nArray = new int[llIIIlIIIl[0]];
                nArray[C.llIIIlIIIl[1]] = llIIIlIIIl[14];
                if (C.lIlIIlIlIIlll(Bank.contains((int[])nArray) ? 1 : 0)) {
                    int[] nArray12 = new int[llIIIlIIIl[0]];
                    nArray12[C.llIIIlIIIl[1]] = llIIIlIIIl[14];
                    if (C.lIlIIlIlIlIII(Bank.getFirst((int[])nArray12).getQuantity(), llIIIlIIIl[6])) {
                        int[] nArray13 = new int[llIIIlIIIl[0]];
                        nArray13[C.llIIIlIIIl[1]] = llIIIlIIIl[14];
                        var1 = new DHelper(llIIIlIIIl[14], llIIIlIIIl[6] - Bank.getFirst((int[])nArray13).getQuantity(), llIIIlIIIl[184]);
                        bv.add(var1);

                    }
                }
                int[] nArray14 = new int[llIIIlIIIl[0]];
                nArray14[C.llIIIlIIIl[1]] = llIIIlIIIl[14];
                if (C.lIlIIlIlIlIIl(Bank.contains((int[])nArray14) ? 1 : 0)) {
                    var1 = new DHelper(llIIIlIIIl[14], llIIIlIIIl[6], llIIIlIIIl[184]);
                    bv.add(var1);

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
            var1 = new DHelper(llIIIlIIIl[17], llIIIlIIIl[36], llIIIlIIIl[185]);
            bv.add(var1);

        }
    }

    private static void lIlIIlIlIIlIl() {
        llIIIlIIII = new String[llIIIlIIIl[213]];
        C.llIIIlIIII[C.llIIIlIIIl[1]] = "Finished buying items, switching back to quest";
        C.llIIIlIIII[C.llIIIlIIIl[0]] = "- Agility";
        C.llIIIlIIII[C.llIIIlIIIl[3]] = C.lIlIIlIIllIII("XMhiRYAU3MI=", "haBJr");
        C.llIIIlIIII[C.llIIIlIIIl[4]] = "Nav to bank";
        C.llIIIlIIII[C.llIIIlIIIl[6]] = "Handling banking";
        C.llIIIlIIII[C.llIIIlIIIl[12]] = "We are missing quest supplies, switching to BUYING";
        C.llIIIlIIII[C.llIIIlIIIl[19]] = "We are missing quest supplies, switching to BUYING";
        C.llIIIlIIII[C.llIIIlIIIl[23]] = "Drink";
        C.llIIIlIIII[C.llIIIlIIIl[25]] = "Eat";
        C.llIIIlIIII[C.llIIIlIIIl[27]] = "Nav to start";
        C.llIIIlIIII[C.llIIIlIIIl[16]] = "King Narnode Shareen";
        C.llIIIlIIII[C.llIIIlIIIl[29]] = "Hazelmere's scroll";
        C.llIIIlIIII[C.llIIIlIIIl[24]] = "Nav to hazelmere";
        C.llIIIlIIII[C.llIIIlIIIl[30]] = "Hazelmere";
        C.llIIIlIIII[C.llIIIlIIIl[31]] = "Hazelmere's scroll";
        C.llIIIlIIII[C.llIIIlIIIl[26]] = "Nav to start";
        C.llIIIlIIII[C.llIIIlIIIl[32]] = "Break";
        C.llIIIlIIII[C.llIIIlIIIl[37]] = "King Narnode Shareen";
        C.llIIIlIIII[C.llIIIlIIIl[39]] = "Nav to glough";
        C.llIIIlIIII[C.llIIIlIIIl[40]] = "Glough";
        C.llIIIlIIII[C.llIIIlIIIl[28]] = "Glough";
        C.llIIIlIIII[C.llIIIlIIIl[41]] = "Nav to start";
        C.llIIIlIIII[C.llIIIlIIIl[42]] = "King Narnode Shareen";
        C.llIIIlIIII[C.llIIIlIIIl[43]] = "Nav to charlie";
        C.llIIIlIIII[C.llIIIlIIIl[44]] = "Charlie";
        C.llIIIlIIII[C.llIIIlIIIl[2]] = "Nav to glough";
        C.llIIIlIIII[C.llIIIlIIIl[46]] = "Ladder";
        C.llIIIlIIII[C.llIIIlIIIl[47]] = "Ladder";
        C.llIIIlIIII[C.llIIIlIIIl[48]] = "Climb-down";
        C.llIIIlIIII[C.llIIIlIIIl[49]] = "Search cupbaord";
        C.llIIIlIIII[C.llIIIlIIIl[38]] = "Cupboard";
        C.llIIIlIIII[C.llIIIlIIIl[50]] = "Open";
        C.llIIIlIIII[C.llIIIlIIIl[51]] = "Cupboard";
        C.llIIIlIIII[C.llIIIlIIIl[52]] = "Open";
        C.llIIIlIIII[C.llIIIlIIIl[53]] = "Cupboard";
        C.llIIIlIIII[C.llIIIlIIIl[54]] = "Search";
        C.llIIIlIIII[C.llIIIlIIIl[55]] = "Cupboard";
        C.llIIIlIIII[C.llIIIlIIIl[56]] = "Search";
        C.llIIIlIIII[C.llIIIlIIIl[58]] = "Talk";
        C.llIIIlIIII[C.llIIIlIIIl[59]] = "Glough";
        C.llIIIlIIII[C.llIIIlIIIl[36]] = "Charlie";
        C.llIIIlIIII[C.llIIIlIIIl[63]] = "Talk to pilot";
        C.llIIIlIIII[C.llIIIlIIIl[64]] = "Captain Errdo";
        C.llIIIlIIII[C.llIIIlIIIl[66]] = "Nav to gate";
        C.llIIIlIIII[C.llIIIlIIIl[67]] = "Gate";
        C.llIIIlIIII[C.llIIIlIIIl[68]] = "Open";
        C.llIIIlIIII[C.llIIIlIIIl[69]] = "Nav to foreman";
        C.llIIIlIIII[C.llIIIlIIIl[70]] = "Foreman";
        C.llIIIlIIII[C.llIIIlIIIl[71]] = "Attack";
        C.llIIIlIIII[C.llIIIlIIIl[73]] = "Lumber order";
        C.llIIIlIIII[C.llIIIlIIIl[22]] = "Lumber order";
        C.llIIIlIIII[C.llIIIlIIIl[74]] = "Take";
        C.llIIIlIIII[C.llIIIlIIIl[75]] = "Lumber order";
        C.llIIIlIIII[C.llIIIlIIIl[76]] = "Nav to charlie";
        C.llIIIlIIII[C.llIIIlIIIl[77]] = "Break";
        C.llIIIlIIII[C.llIIIlIIIl[78]] = "Ladder";
        C.llIIIlIIII[C.llIIIlIIIl[79]] = "Ladder";
        C.llIIIlIIII[C.llIIIlIIIl[80]] = "Climb-up";
        C.llIIIlIIII[C.llIIIlIIIl[81]] = "Charlie";
        C.llIIIlIIII[C.llIIIlIIIl[83]] = "Glough's key";
        C.llIIIlIIII[C.llIIIlIIIl[45]] = "Nav to anita";
        C.llIIIlIIII[C.llIIIlIIIl[84]] = "Ladder";
        C.llIIIlIIII[C.llIIIlIIIl[85]] = "Climb-down";
        C.llIIIlIIII[C.llIIIlIIIl[88]] = "Anita";
        C.llIIIlIIII[C.llIIIlIIIl[89]] = "Staircase";
        C.llIIIlIIII[C.llIIIlIIIl[90]] = "Climb-up";
        C.llIIIlIIII[C.llIIIlIIIl[91]] = "Glough's key";
        C.llIIIlIIII[C.llIIIlIIIl[92]] = "Staircase";
        C.llIIIlIIII[C.llIIIlIIIl[93]] = "Climb-down";
        C.llIIIlIIII[C.llIIIlIIIl[95]] = "Staircase";
        C.llIIIlIIII[C.llIIIlIIIl[57]] = "Climb-down";
        C.llIIIlIIII[C.llIIIlIIIl[96]] = "Nav to glough";
        C.llIIIlIIII[C.llIIIlIIIl[97]] = "Closed chest";
        C.llIIIlIIII[C.llIIIlIIIl[98]] = "Glough's key";
        C.llIIIlIIII[C.llIIIlIIIl[99]] = "Closed chest";
        C.llIIIlIIII[C.llIIIlIIIl[101]] = "Nav to start";
        C.llIIIlIIII[C.llIIIlIIIl[102]] = "King Narnode Shareen";
        C.llIIIlIIII[C.llIIIlIIIl[104]] = "Nav to twigs tile";
        C.llIIIlIIII[C.llIIIlIIIl[105]] = "Solving puzzle";
        C.llIIIlIIII[C.llIIIlIIIl[115]] = "Go down";
        C.llIIIlIIII[C.llIIIlIIIl[62]] = "Trapdoor";
        C.llIIIlIIII[C.llIIIlIIIl[116]] = "Climb-down";
        C.llIIIlIIII[C.llIIIlIIIl[117]] = "Black demon";
        C.llIIIlIIII[C.llIIIlIIIl[120]] = "Drink";
        C.llIIIlIIII[C.llIIIlIIIl[121]] = "Black demon";
        C.llIIIlIIII[C.llIIIlIIIl[122]] = "Attack";
        C.llIIIlIIII[C.llIIIlIIIl[124]] = "Nav to king underground";
        C.llIIIlIIII[C.llIIIlIIIl[125]] = "King Narnode Shareen";
        C.llIIIlIIII[C.llIIIlIIIl[126]] = "Daconia rock";
        C.llIIIlIIII[C.llIIIlIIIl[127]] = "Find rock";
        C.llIIIlIIII[C.llIIIlIIIl[72]] = "Daconia rock";
        C.llIIIlIIII[C.llIIIlIIIl[128]] = "Nav to king underground";
        C.llIIIlIIII[C.llIIIlIIIl[129]] = "King Narnode Shareen";
        C.llIIIlIIII[C.llIIIlIIIl[132]] = "Root";
        C.llIIIlIIII[C.llIIIlIIIl[133]] = "Search";
        C.llIIIlIIII[C.llIIIlIIIl[135]] = "Root";
        C.llIIIlIIII[C.llIIIlIIIl[136]] = "Search";
        C.llIIIlIIII[C.llIIIlIIIl[138]] = "Root";
        C.llIIIlIIII[C.llIIIlIIIl[139]] = "Search";
        C.llIIIlIIII[C.llIIIlIIIl[141]] = "Root";
        C.llIIIlIIII[C.llIIIlIIIl[82]] = "Search";
        C.llIIIlIIII[C.llIIIlIIIl[144]] = "Root";
        C.llIIIlIIII[C.llIIIlIIIl[145]] = "Search";
        C.llIIIlIIII[C.llIIIlIIIl[147]] = "Root";
        C.llIIIlIIII[C.llIIIlIIIl[148]] = "Search";
        C.llIIIlIIII[C.llIIIlIIIl[151]] = "Root";
        C.llIIIlIIII[C.llIIIlIIIl[152]] = "Search";
        C.llIIIlIIII[C.llIIIlIIIl[155]] = "Root";
        C.llIIIlIIII[C.llIIIlIIIl[156]] = "Search";
        C.llIIIlIIII[C.llIIIlIIIl[159]] = "Root";
        C.llIIIlIIII[C.llIIIlIIIl[100]] = "Search";
        C.llIIIlIIII[C.llIIIlIIIl[162]] = "Root";
        C.llIIIlIIII[C.llIIIlIIIl[163]] = "Search";
        C.llIIIlIIII[C.llIIIlIIIl[165]] = "Root";
        C.llIIIlIIII[C.llIIIlIIIl[166]] = "Search";
        C.llIIIlIIII[C.llIIIlIIIl[168]] = "Root";
        C.llIIIlIIII[C.llIIIlIIIl[169]] = "Search";
        C.llIIIlIIII[C.llIIIlIIIl[171]] = "Root";
        C.llIIIlIIII[C.llIIIlIIIl[172]] = "Search";
        C.llIIIlIIII[C.llIIIlIIIl[174]] = "Root";
        C.llIIIlIIII[C.llIIIlIIIl[103]] = "Search";
        C.llIIIlIIII[C.llIIIlIIIl[177]] = "Root";
        C.llIIIlIIII[C.llIIIlIIIl[178]] = "Search";
        C.llIIIlIIII[C.llIIIlIIIl[179]] = "Daconia rock";
        C.llIIIlIIII[C.llIIIlIIIl[187]] = "ring of wealth (";
        C.llIIIlIIII[C.llIIIlIIIl[200]] = "Yes.";
        C.llIIIlIIII[C.llIIIlIIIl[201]] = "You seem worried, what's up?";
        C.llIIIlIIII[C.llIIIlIIIl[202]] = "I think so!";
        C.llIIIlIIII[C.llIIIlIIIl[203]] = "A man came to me with the King's seal.";
        C.llIIIlIIII[C.llIIIlIIIl[204]] = "I gave the man Daconia rocks.";
        C.llIIIlIIII[C.llIIIlIIIl[114]] = "And Daconia rocks will kill the tree!";
        C.llIIIlIIII[C.llIIIlIIIl[205]] = "None of the above.";
        C.llIIIlIIII[C.llIIIlIIIl[206]] = "Take me to Karamja please!";
        C.llIIIlIIII[C.llIIIlIIIl[207]] = "Glough sent me.";
        C.llIIIlIIII[C.llIIIlIIIl[208]] = "Ka.";
        C.llIIIlIIII[C.llIIIlIIIl[209]] = "Lu.";
        C.llIIIlIIII[C.llIIIlIIIl[210]] = "Min.";
        C.llIIIlIIII[C.llIIIlIIIl[211]] = "I suppose so.";
        C.llIIIlIIII[C.llIIIlIIIl[212]] = C.lIlIIlIIlIlll("", "afaRE");
    }

    private static boolean lIlIIlIlIlllI(int n2, int n3) {
        return n2 <= n3;
    }

        return String.valueOf(var3);
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
            BankLocation var4;
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
                                                    var4 = BankLocation.getNearest();
                                                    if (C.lIlIIlIlIlIll(var4) && C.lIlIIlIlIlIIl(var4.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                                        AccBuilderSotf.c = llIIIlIIII[llIIIlIIIl[4]];
                                                        a.a(var4);
                                                    }
                                                    if (!C.lIlIIlIlIlIll(var4) || !C.lIlIIlIlIIlll(var4.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block120;
                                                    if (C.lIlIIlIlIlIIl(Bank.isOpen() ? 1 : 0)) {
                                                        a.a();
                                                        Time.sleepUntil(() -> Bank.isOpen(), (int)llIIIlIIIl[5]);

                                                    }
                                                    if (!C.lIlIIlIlIIlll(Bank.isOpen() ? 1 : 0)) break block120;
                                                    AccBuilderSotf.c = llIIIlIIII[llIIIlIIIl[6]];
                                                    if (C.lIlIIlIlIllII(Inventory.getAll().size())) {
                                                        Bank.depositInventory();
                                                        Time.sleepTicks((int)llIIIlIIIl[6]);

                                                    }
                                                    if (C.lIlIIlIlIllII(Equipment.getAll().size())) {
                                                        Bank.depositEquipment();
                                                        Time.sleepTicks((int)llIIIlIIIl[3]);

                                                    }
                                                    while (C.lIlIIlIlIlIIl(I.co() ? 1 : 0)) {
                                                        I.cm();
                                                        Time.sleepTicks((int)llIIIlIIIl[0]);

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

                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[llIIIlIIIl[0]];
                                        nArray[C.llIIIlIIIl[1]] = llIIIlIIIl[9];
                                        if (C.lIlIIlIlIllII(Inventory.getCount((int[])nArray))) {
                                            bl = llIIIlIIIl[0];

                                            if (((0x5F ^ 0x4C) & ~(0x35 ^ 0x26)) != 0) {
                                                return false;
                                            }
                                        } else {
                                            bl = llIIIlIIIl[1];
                                        }
                                        return bl;
                                    }, (int)llIIIlIIIl[5]);

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

                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[llIIIlIIIl[0]];
                                        nArray[C.llIIIlIIIl[1]] = llIIIlIIIl[7];
                                        if (C.lIlIIlIlIllII(Inventory.getCount((int[])nArray))) {
                                            bl = llIIIlIIIl[0];

                                            }
                                        } else {
                                            bl = llIIIlIIIl[1];
                                        }
                                        return bl;
                                    }, (int)llIIIlIIIl[5]);

                                }
                            }
                        }
                    }
                    if (C.lIlIIlIlIIlll(Inventory.contains((int[])f.ba) ? 1 : 0) && C.lIlIIlIlIlIII(Movement.getRunEnergy(), llIIIlIIIl[22])) {
                        Inventory.getFirst((int[])f.ba).interact(llIIIlIIII[llIIIlIIIl[23]]);
                        Time.sleepTicks((int)llIIIlIIIl[0]);

                    }
                    if (C.lIlIIlIlIlIlI(Combat.getMissingHealth(), llIIIlIIIl[24])) {
                        int[] nArray = new int[llIIIlIIIl[0]];
                        nArray[C.llIIIlIIIl[1]] = llIIIlIIIl[15];
                        if (C.lIlIIlIlIIlll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                            int[] nArray13 = new int[llIIIlIIIl[0]];
                            nArray13[C.llIIIlIIIl[1]] = llIIIlIIIl[15];
                            Inventory.getFirst((int[])nArray13).interact(llIIIlIIII[llIIIlIIIl[25]]);
                            Time.sleepTicks((int)llIIIlIIIl[3]);

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

                            Time.sleepTicks((int)llIIIlIIIl[0]);

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

                                Time.sleepTicks((int)llIIIlIIIl[0]);

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

                                }
                                var4 = new WorldPoint(llIIIlIIIl[33], llIIIlIIIl[34], llIIIlIIIl[1]);
                                if (C.lIlIIlIlIlllI(Players.getLocal().getWorldLocation().distanceTo(b.I), llIIIlIIIl[35]) && C.lIlIIlIlIllIl(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)var4), llIIIlIIIl[25])) {
                                    Movement.walkTo((WorldPoint)var4);

                                    Time.sleepTicks((int)llIIIlIIIl[0]);

                                }
                                if ((!C.lIlIIlIlIllIl(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)var4), llIIIlIIIl[25]) || C.lIlIIlIlIlllI(Players.getLocal().getWorldLocation().distanceTo(ew), llIIIlIIIl[35])) && C.lIlIIlIlIllIl(Players.getLocal().getWorldLocation().distanceTo(ex), llIIIlIIIl[36])) {
                                    Movement.walkTo((WorldPoint)ew);

                                    Time.sleepTicks((int)llIIIlIIIl[0]);

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

                        Time.sleepTicks((int)llIIIlIIIl[0]);

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

                    Time.sleepTicks((int)llIIIlIIIl[0]);

                }
                if (!C.lIlIIlIlIllIl(Players.getLocal().getWorldLocation().distanceTo(ew), llIIIlIIIl[4]) || C.lIlIIlIlIlllI(Players.getLocal().getWorldLocation().distanceTo(eF), llIIIlIIIl[26])) {
                    g.a(llIIIlIIII[llIIIlIIIl[42]], cE);
                }
            }
            if (C.lIlIIlIllIIII(e.j(eG), llIIIlIIIl[22])) {
                if (C.lIlIIlIlIllIl(Players.getLocal().getWorldLocation().distanceTo(ez), llIIIlIIIl[4]) && C.lIlIIlIlIllll(Players.getLocal().getWorldLocation().getPlane(), llIIIlIIIl[4])) {
                    AccBuilderSotf.c = llIIIlIIII[llIIIlIIIl[43]];
                    Movement.walkTo((WorldPoint)ez);

                    Time.sleepTicks((int)llIIIlIIIl[0]);

                }
                if (C.lIlIIlIlIlllI(Players.getLocal().getWorldLocation().distanceTo(ez), llIIIlIIIl[4]) && C.lIlIIlIllIIII(Players.getLocal().getWorldLocation().getPlane(), llIIIlIIIl[4])) {
                    g.a(llIIIlIIII[llIIIlIIIl[44]], cE);
                }
            }
            if (C.lIlIIlIllIIII(e.j(eG), llIIIlIIIl[45])) {
                if (C.lIlIIlIlIllIl(Players.getLocal().getWorldLocation().distanceTo(ey), llIIIlIIIl[23]) && C.lIlIIlIlIllll(Players.getLocal().getWorldLocation().getPlane(), llIIIlIIIl[0])) {
                    AccBuilderSotf.c = llIIIlIIII[llIIIlIIIl[2]];
                    Movement.walkTo((WorldPoint)ey);

                    Time.sleepTicks((int)llIIIlIIIl[0]);

                }
                if (!C.lIlIIlIllIIII(Players.getLocal().getWorldLocation().getPlane(), llIIIlIIIl[0]) || C.lIlIIlIlIllIl(Players.getLocal().getWorldLocation().distanceTo(ey), llIIIlIIIl[23])) {
                    String[] stringArray = new String[llIIIlIIIl[0]];
                    stringArray[C.llIIIlIIIl[1]] = llIIIlIIII[llIIIlIIIl[46]];
                    if (C.lIlIIlIlIlIll(TileObjects.getNearest((String[])stringArray))) {
                        String[] stringArray3 = new String[llIIIlIIIl[0]];
                        stringArray3[C.llIIIlIIIl[1]] = llIIIlIIII[llIIIlIIIl[47]];
                        TileObjects.getNearest((String[])stringArray3).interact(llIIIlIIII[llIIIlIIIl[48]]);
                        Time.sleepTicks((int)llIIIlIIIl[0]);

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

                            Time.sleepTicks((int)llIIIlIIIl[0]);

                        }
                        if (C.lIlIIlIlIlllI(Players.getLocal().getWorldLocation().distanceTo(eA), llIIIlIIIl[4])) {
                            if (C.lIlIIlIlIlIIl(Dialog.isOpen() ? 1 : 0)) {
                                String[] stringArray = new String[llIIIlIIIl[0]];
                                stringArray[C.llIIIlIIIl[1]] = llIIIlIIII[llIIIlIIIl[67]];
                                TileObjects.getNearest((String[])stringArray).interact(llIIIlIIII[llIIIlIIIl[68]]);
                                Time.sleepTicks((int)llIIIlIIIl[4]);

                            }
                            g.a(cE);
                        }
                    }
                    if (C.lIlIIlIlIlIlI(Players.getLocal().getWorldLocation().getX(), llIIIlIIIl[65])) {
                        if (C.lIlIIlIlIllIl(Players.getLocal().getWorldLocation().distanceTo(eB), llIIIlIIIl[19])) {
                            AccBuilderSotf.c = llIIIlIIII[llIIIlIIIl[69]];
                            Movement.walkTo((WorldPoint)eB);

                            Time.sleepTicks((int)llIIIlIIIl[0]);

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

                }
                String[] stringArray10 = new String[llIIIlIIIl[0]];
                stringArray10[C.llIIIlIIIl[1]] = llIIIlIIII[llIIIlIIIl[75]];
                if (C.lIlIIlIlIIlll(Inventory.contains((String[])stringArray10) ? 1 : 0)) {
                    if (C.lIlIIlIlIllIl(Players.getLocal().getWorldLocation().distanceTo(ez), llIIIlIIIl[4]) && C.lIlIIlIlIllll(Players.getLocal().getWorldLocation().getPlane(), llIIIlIIIl[4])) {
                        AccBuilderSotf.c = llIIIlIIII[llIIIlIIIl[76]];
                        var4 = new WorldPoint(llIIIlIIIl[33], llIIIlIIIl[34], llIIIlIIIl[1]);
                        if (C.lIlIIlIlIlllI(Players.getLocal().getWorldLocation().distanceTo(eB), llIIIlIIIl[28])) {
                            int[] nArray = new int[llIIIlIIIl[0]];
                            nArray[C.llIIIlIIIl[1]] = llIIIlIIIl[17];
                            Inventory.getFirst((int[])nArray).interact(llIIIlIIII[llIIIlIIIl[77]]);
                            Time.sleepTicks((int)llIIIlIIIl[12]);

                        }
                        if (C.lIlIIlIlIlllI(Players.getLocal().getWorldLocation().distanceTo(b.I), llIIIlIIIl[35]) && C.lIlIIlIlIllIl(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)var4), llIIIlIIIl[25])) {
                            Movement.walkTo((WorldPoint)var4);

                            Time.sleepTicks((int)llIIIlIIIl[0]);

                        }
                        if ((!C.lIlIIlIlIllIl(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)var4), llIIIlIIIl[25]) || C.lIlIIlIlIlllI(Players.getLocal().getWorldLocation().distanceTo(ew), llIIIlIIIl[35])) && C.lIlIIlIlIllIl(Players.getLocal().getWorldLocation().distanceTo(eB), llIIIlIIIl[36])) {
                            Movement.walkTo((WorldPoint)ez);

                            Time.sleepTicks((int)llIIIlIIIl[0]);

                        }
                        if (!C.lIlIIlIlIllll(Players.getLocal().getWorldLocation().getPlane(), llIIIlIIIl[3]) || C.lIlIIlIllIIII(Players.getLocal().getWorldLocation().getPlane(), llIIIlIIIl[0])) {
                            String[] stringArray11 = new String[llIIIlIIIl[0]];
                            stringArray11[C.llIIIlIIIl[1]] = llIIIlIIII[llIIIlIIIl[78]];
                            if (C.lIlIIlIlIlIll(TileObjects.getNearest((String[])stringArray11))) {
                                String[] stringArray12 = new String[llIIIlIIIl[0]];
                                stringArray12[C.llIIIlIIIl[1]] = llIIIlIIII[llIIIlIIIl[79]];
                                TileObjects.getNearest((String[])stringArray12).interact(llIIIlIIII[llIIIlIIIl[80]]);
                                Time.sleepTicks((int)llIIIlIIIl[4]);

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

                        }
                        if (C.lIlIIlIlIlllI(Players.getLocal().getWorldLocation().distanceTo(ew), llIIIlIIIl[12])) {
                            var4 = new WorldPoint(llIIIlIIIl[86], llIIIlIIIl[87], llIIIlIIIl[1]);
                            Movement.walkTo((WorldPoint)var4);

                        }
                        if (C.lIlIIlIlIlIIl(Players.getLocal().getWorldLocation().getPlane()) && C.lIlIIlIlIllIl(Players.getLocal().getWorldLocation().distanceTo(ew), llIIIlIIIl[12])) {
                            Movement.walkTo((WorldPoint)eC);

                            Time.sleepTicks((int)llIIIlIIIl[0]);

                        }
                    }
                    if (C.lIlIIlIlIlllI(Players.getLocal().getWorldLocation().distanceTo(eC), llIIIlIIIl[12])) {
                        g.a(llIIIlIIII[llIIIlIIIl[88]], cE);
                        if (C.lIlIIlIlIlIIl(Players.getLocal().getWorldLocation().getPlane())) {
                            String[] stringArray14 = new String[llIIIlIIIl[0]];
                            stringArray14[C.llIIIlIIIl[1]] = llIIIlIIII[llIIIlIIIl[89]];
                            TileObjects.getNearest((String[])stringArray14).interact(llIIIlIIII[llIIIlIIIl[90]]);
                            Time.sleepTicks((int)llIIIlIIIl[3]);

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

                    }
                    if (C.lIlIIlIlIIlll((var4 = new WorldArea(llIIIlIIIl[94], llIIIlIIIl[87], llIIIlIIIl[37], llIIIlIIIl[2], llIIIlIIIl[0])).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        String[] stringArray17 = new String[llIIIlIIIl[0]];
                        stringArray17[C.llIIIlIIIl[1]] = llIIIlIIII[llIIIlIIIl[95]];
                        TileObjects.getNearest((String[])stringArray17).interact(llIIIlIIII[llIIIlIIIl[57]]);
                        Time.sleepTicks((int)llIIIlIIIl[3]);

                    }
                    if (C.lIlIIlIlIllIl(Players.getLocal().getWorldLocation().distanceTo(ey), llIIIlIIIl[24]) && C.lIlIIlIlIllll(Players.getLocal().getWorldLocation().getPlane(), llIIIlIIIl[0])) {
                        AccBuilderSotf.c = llIIIlIIII[llIIIlIIIl[96]];
                        Movement.walkTo((WorldPoint)ey);

                        Time.sleepTicks((int)llIIIlIIIl[0]);

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

                        }
                    }
                    g.a(cE);
                }
            }
            if (C.lIlIIlIllIIII(e.j(eG), llIIIlIIIl[100])) {
                if (C.lIlIIlIlIllIl(Players.getLocal().getWorldLocation().distanceTo(ew), llIIIlIIIl[4]) && C.lIlIIlIlIllIl(Players.getLocal().getWorldLocation().distanceTo(eF), llIIIlIIIl[26])) {
                    AccBuilderSotf.c = llIIIlIIII[llIIIlIIIl[101]];
                    Movement.walkTo((WorldPoint)eF);

                    Time.sleepTicks((int)llIIIlIIIl[0]);

                }
                if (!C.lIlIIlIlIllIl(Players.getLocal().getWorldLocation().distanceTo(ew), llIIIlIIIl[4]) || C.lIlIIlIlIlllI(Players.getLocal().getWorldLocation().distanceTo(eF), llIIIlIIIl[26])) {
                    g.a(llIIIlIIII[llIIIlIIIl[102]], cE);
                }
            }
            if (C.lIlIIlIllIIII(e.j(eG), llIIIlIIIl[103])) {
                if (C.lIlIIlIlIllIl(Players.getLocal().getWorldLocation().distanceTo(eE), llIIIlIIIl[12])) {
                    AccBuilderSotf.c = llIIIlIIII[llIIIlIIIl[104]];
                    Movement.walkTo((WorldPoint)eE);

                    Time.sleepTicks((int)llIIIlIIIl[0]);

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

                }
                String[] stringArray = new String[llIIIlIIIl[0]];
                stringArray[C.llIIIlIIIl[1]] = llIIIlIIII[llIIIlIIIl[117]];
                if (C.lIlIIlIlIlIll(NPCs.getNearest((String[])stringArray))) {
                    var4 = new WorldPoint(llIIIlIIIl[118], llIIIlIIIl[119], llIIIlIIIl[1]);
                    if (C.lIlIIlIlIlIIl(Players.getLocal().getWorldLocation().equals((Object)var4) ? 1 : 0)) {
                        Movement.walkTo((WorldPoint)var4);

                        Time.sleepTicks((int)llIIIlIIIl[0]);

                    }
                    if (C.lIlIIlIlIlIIl(Prayers.isEnabled((Prayer)Prayer.PROTECT_FROM_MELEE) ? 1 : 0) && C.lIlIIlIlIllII(Prayers.getPoints()) && C.lIlIIlIlIlIlI(Skills.getLevel((Skill)Skill.PRAYER), llIIIlIIIl[66])) {
                        Prayers.toggle((Prayer)Prayer.PROTECT_FROM_MELEE);
                    }
                    if (C.lIlIIlIlIIlll(Players.getLocal().getWorldLocation().equals((Object)var4) ? 1 : 0)) {
                        if (C.lIlIIlIlIlIIl(m.ap() ? 1 : 0)) {
                            m.aq();
                        }
                        if (C.lIlIIlIlIlIII(Prayers.getPoints(), llIIIlIIIl[43]) && C.lIlIIlIlIIlll(Inventory.contains((int[])f.aX) ? 1 : 0)) {
                            Inventory.getFirst((int[])f.aX).interact(llIIIlIIII[llIIIlIIIl[120]]);
                            Time.sleepTicks((int)llIIIlIIIl[0]);

                        }
                        if (C.lIlIIlIllIIIl(Players.getLocal().getInteracting())) {
                            String[] stringArray21 = new String[llIIIlIIIl[0]];
                            stringArray21[C.llIIIlIIIl[1]] = llIIIlIIII[llIIIlIIIl[121]];
                            NPCs.getNearest((String[])stringArray21).interact(llIIIlIIII[llIIIlIIIl[122]]);
                            Time.sleepTicks((int)llIIIlIIIl[3]);

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

                    Time.sleepTicks((int)llIIIlIIIl[0]);

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

                        Time.sleepTicks((int)llIIIlIIIl[0]);

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
        void var5;
        int[] nArray = new int[llIIIlIIIl[6]];
        nArray[C.llIIIlIIIl[1]] = llIIIlIIIl[17];
        nArray[C.llIIIlIIIl[0]] = llIIIlIIIl[11];
        nArray[C.llIIIlIIIl[3]] = llIIIlIIIl[13];
        nArray[C.llIIIlIIIl[4]] = llIIIlIIIl[18];
        int[] nArray2 = nArray;
        int var6 = llIIIlIIIl[1];
        while (C.lIlIIlIlIlIII(var6, ((void)var5).length)) {
            int[] nArray3 = new int[llIIIlIIIl[0]];
            nArray3[C.llIIIlIIIl[1]] = var5[var6];
            if (C.lIlIIlIlIlIIl(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                return llIIIlIIIl[1];
            }
            ++var6;

            if (((0xA1 ^ 0x82) & ~(0x15 ^ 0x36)) == ((0x8B ^ 0xA1) & ~(6 ^ 0x2C))) continue;
            return false;
        }
        return llIIIlIIIl[0];
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

}

