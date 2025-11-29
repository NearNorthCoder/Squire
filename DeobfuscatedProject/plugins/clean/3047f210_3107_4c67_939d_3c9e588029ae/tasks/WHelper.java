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
package gg.squire.3047f210-3107-4c67-939d-3c9e588029ae.tasks;

import gg.squire.3047f210-3107-4c67-939d-3c9e588029ae.tasks.GHelper;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.S;
import gg.squire.3047f210-3107-4c67-939d-3c9e588029ae.tasks.AHelper;
import gg.squire.3047f210-3107-4c67-939d-3c9e588029ae.tasks.ACHelper;
import gg.squire.3047f210-3107-4c67-939d-3c9e588029ae.tasks.BHelper;
import gg.squire.3047f210-3107-4c67-939d-3c9e588029ae.tasks.DHelper;
import gg.squire.3047f210-3107-4c67-939d-3c9e588029ae.tasks.EHelper;
import gg.squire.3047f210-3107-4c67-939d-3c9e588029ae.tasks.FHelper;
import gg.squire.3047f210-3107-4c67-939d-3c9e588029ae.tasks.GHelper;
import gg.squire.3047f210-3107-4c67-939d-3c9e588029ae.tasks.IHelper;
import gg.squire.3047f210-3107-4c67-939d-3c9e588029ae.tasks.THelper;
import gg.squire.account.AccBuilderTempleTrek;
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

public class WHelper
implements S {
    private static final  WorldPoint fD;
    private static final  WorldArea fP;
    private static final  WorldPoint fy;
    private static final  int fU;
    public static final  WorldArea fd;
    public static final  WorldArea fi;
    public static  int gb;
    public static final  WorldPoint eZ;
    private static final  WorldPoint fA;
    public static final  WorldArea fe;
    private static final  int fQ;
    private static final  WorldPoint fz;
    static  String gc;
    
    private static final  WorldPoint fF;
    private static final  WorldArea fO;
    private static final  int ft;
    private static final  int fv;
    
    private static final  WorldPoint fB;
    private static final  int fq;
    static  boolean cl;
    private static final  WorldPoint fC;
    public static  List<d> bu;
    private static final  int fo;
    private static final  WorldArea fN;
    public static final  WorldArea fg;
    private static final  WorldPoint fE;
    private static final  WorldPoint fH;
    public static final  WorldArea fj;
    private static final  int fV;
    private static final  int fw;
    private static final  int fk;
    private static final  int fl;
    private static final  int fW;
    static  String[] eR;
    private static final  WorldPoint fJ;
    private static final  WorldPoint fK;
    private static final  WorldPoint fx;
    public static final  WorldArea ff;
    private static final  int fr;
    private static final  int fX;
    private static final  int fm;
    public static final  WorldArea fh;
    private static final  int fs;
    private static final  WorldPoint fL;
    
    private static final  WorldPoint fM;
    private static final  int fu;
    private static final  int fR;
    private static final  int fn;
    static  int ck;
    public static final  WorldPoint fa;
    public static final  WorldArea fc;
    private static final  int fY;
    private static final  int fS;
    private static final  WorldPoint fI;
    public static final  WorldPoint fb;
    public static  int ga;
    public static  boolean bs;
    private static final  int fT;
    private static final  WorldPoint fG;
    private static final  int fp;
    private static final  int fZ;

        return String.valueOf(var1);
    }

    public static void bF() {
        TileObject lllllllllllllllllIllIllIIlIIIIll2;
        block91: {
            block93: {
                block92: {
                    block89: {
                        block90: {
                            Widget var2;
                            if (w.llIIIllIIIIll(e.j(lllIlIlIlI[0]), lllIlIlIlI[1])) {
                                try {
                                    G.ct();

                                }
                                catch (Exception lllllllllllllllllIllIllIIlIIIIll2) {
                                    lllllllllllllllllIllIllIIlIIIIll2.printStackTrace();
                                }
                                if (-(33 + 100 - 53 + 102 ^ 60 + 79 - 60 + 100) >= 0) {
                                    return;
                                }
                            }
                            if (w.llIIIllIIIlII(e.j(lllIlIlIlI[0]), lllIlIlIlI[1]) && w.llIIIllIIIIll(e.j(lllIlIlIlI[2]), lllIlIlIlI[3])) {
                                block88: {
                                    if (w.llIIIllIIIlIl(bs ? 1 : 0)) {
                                        AccBuilderTempleTrek.c = lllIlIlIII[lllIlIlIlI[4]];
                                        b.a(bu);
                                        if (w.llIIIllIIIIll(bu.size(), lllIlIlIlI[3])) {
                                            System.out.println(lllIlIlIII[lllIlIlIlI[3]]);
                                            bs = lllIlIlIlI[4];
                                        }
                                    }
                                    do {
                                        if (w.llIIIllIIIlIl(t.bl() ? 1 : 0)) {
                                            int[] nArray = new int[lllIlIlIlI[3]];
                                            nArray[w.lllIlIlIlI[4]] = lllIlIlIlI[5];
                                            if (w.llIIIllIIIlIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                                                int[] nArray2 = new int[lllIlIlIlI[3]];
                                                nArray2[w.lllIlIlIlI[4]] = lllIlIlIlI[6];
                                                if (w.llIIIllIIIlIl(Inventory.contains((int[])nArray2) ? 1 : 0)) {
                                                    int[] nArray3 = new int[lllIlIlIlI[3]];
                                                    nArray3[w.lllIlIlIlI[4]] = lllIlIlIlI[7];
                                                    if (w.llIIIllIIIlIl(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                                                        int[] nArray4 = new int[lllIlIlIlI[3]];
                                                        nArray4[w.lllIlIlIlI[4]] = lllIlIlIlI[8];
                                                        if (w.llIIIllIIIlIl(Inventory.contains((int[])nArray4) ? 1 : 0)) {
                                                            int[] nArray5 = new int[lllIlIlIlI[3]];
                                                            nArray5[w.lllIlIlIlI[4]] = lllIlIlIlI[9];
                                                            if (w.llIIIllIIIlIl(Inventory.contains((int[])nArray5) ? 1 : 0)) {
                                                                int[] nArray6 = new int[lllIlIlIlI[3]];
                                                                nArray6[w.lllIlIlIlI[4]] = lllIlIlIlI[10];
                                                                if (!w.llIIIllIIIllI(Inventory.contains((int[])nArray6) ? 1 : 0)) break block88;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        if (!w.llIIIllIIIllI(AccBuilderTempleTrek.d ? 1 : 0)) break block88;
                                        w.bH();
                                        Time.sleepTicks((int)lllIlIlIlI[3]);

                                    } while ((0x6A ^ 0x3F ^ (0x13 ^ 0x42)) >= 2);
                                    return;
                                }
                                if (w.llIIIllIIIllI(bs ? 1 : 0)) {
                                    if (w.llIIIllIIIlll(Players.getLocal().getWorldLocation().distanceTo(fy), lllIlIlIlI[11])) {
                                        int[] nArray = new int[lllIlIlIlI[3]];
                                        nArray[w.lllIlIlIlI[4]] = lllIlIlIlI[10];
                                        if (w.llIIIllIIIlIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                                            AccBuilderTempleTrek.c = lllIlIlIII[lllIlIlIlI[1]];
                                            int[] nArray7 = new int[lllIlIlIlI[3]];
                                            nArray7[w.lllIlIlIlI[4]] = lllIlIlIlI[10];
                                            Inventory.getFirst((int[])nArray7).interact(lllIlIlIII[lllIlIlIlI[12]]);
                                            Time.sleepTicks((int)lllIlIlIlI[13]);

                                        }
                                    }
                                    if (w.llIIIllIIIIll(Players.getLocal().getWorldLocation().distanceTo(fy), lllIlIlIlI[11]) && w.llIIIllIIIlll(Players.getLocal().getWorldLocation().distanceTo(fy), lllIlIlIlI[14])) {
                                        AccBuilderTempleTrek.c = lllIlIlIII[lllIlIlIlI[15]];
                                        if (w.llIIIllIIIlIl(Inventory.contains((int[])f.aU) ? 1 : 0) && w.llIIIllIIIIll(Movement.getRunEnergy(), lllIlIlIlI[16])) {
                                            Inventory.getFirst((int[])f.aU).interact(lllIlIlIII[lllIlIlIlI[13]]);
                                            Time.sleepTicks((int)lllIlIlIlI[3]);

                                        }
                                        Movement.walkTo((WorldPoint)fy);

                                        Time.sleepTicks((int)lllIlIlIlI[3]);

                                    }
                                    if (w.llIIIllIIlIII(Players.getLocal().getWorldLocation().distanceTo(fy), lllIlIlIlI[14])) {
                                        g.a(lllIlIlIII[lllIlIlIlI[14]], eR);
                                    }
                                }
                            }
                            if (w.llIIIllIIIlII(e.j(lllIlIlIlI[0]), lllIlIlIlI[1]) && w.llIIIllIIIlII(e.j(lllIlIlIlI[2]), lllIlIlIlI[3])) {
                                if (w.llIIIllIIIlll(Players.getLocal().getWorldLocation().distanceTo(fB), lllIlIlIlI[15]) && w.llIIIllIIIllI(fO.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    int[] nArray = new int[lllIlIlIlI[3]];
                                    nArray[w.lllIlIlIlI[4]] = lllIlIlIlI[17];
                                    if (w.llIIIllIIIllI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                                        AccBuilderTempleTrek.c = lllIlIlIII[lllIlIlIlI[18]];
                                        Movement.walkTo((WorldPoint)fB);

                                        Time.sleepTicks((int)lllIlIlIlI[3]);

                                    }
                                }
                                if (w.llIIIllIIlIII(Players.getLocal().getWorldLocation().distanceTo(fB), lllIlIlIlI[15]) && w.llIIIllIIIllI(Players.getLocal().isMoving() ? 1 : 0)) {
                                    int[] nArray = new int[lllIlIlIlI[3]];
                                    nArray[w.lllIlIlIlI[4]] = lllIlIlIlI[17];
                                    if (w.llIIIllIIIllI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                                        int[] nArray8 = new int[lllIlIlIlI[3]];
                                        nArray8[w.lllIlIlIlI[4]] = lllIlIlIlI[19];
                                        lllllllllllllllllIllIllIIlIIIIll2 = TileObjects.getNearest((int[])nArray8);
                                        if (w.llIIIllIIIlIl(Inventory.isFull() ? 1 : 0)) {
                                            int[] nArray9 = new int[lllIlIlIlI[3]];
                                            nArray9[w.lllIlIlIlI[4]] = lllIlIlIlI[8];
                                            Inventory.getFirst((int[])nArray9).interact(lllIlIlIII[lllIlIlIlI[20]]);
                                            Time.sleepTicks((int)lllIlIlIlI[3]);

                                        }
                                        if (w.llIIIllIIIllI(Inventory.isFull() ? 1 : 0)) {
                                            if (w.llIIIllIIlIIl(lllllllllllllllllIllIllIIlIIIIll2) && w.llIIIllIIIllI(Dialog.isOpen() ? 1 : 0)) {
                                                AccBuilderTempleTrek.c = lllIlIlIII[lllIlIlIlI[21]];
                                                lllllllllllllllllIllIllIIlIIIIll2.interact(lllIlIlIII[lllIlIlIlI[22]]);
                                                Dialog.continueSpace();
                                            }
                                            if (w.llIIIllIIlIIl(var2 = Widgets.get((int)lllIlIlIlI[23], (int)lllIlIlIlI[3]))) {
                                                var2.interact(lllIlIlIII[lllIlIlIlI[24]]);
                                                var2.interact(lllIlIlIlI[4]);
                                                var2.interact(lllIlIlIII[lllIlIlIlI[25]]);
                                                Keyboard.type((String)lllIlIlIII[lllIlIlIlI[26]]);
                                            }
                                        }
                                    }
                                }
                                if (w.llIIIllIIlIII(Players.getLocal().getWorldLocation().distanceTo(fB), lllIlIlIlI[15])) {
                                    int[] nArray = new int[lllIlIlIlI[3]];
                                    nArray[w.lllIlIlIlI[4]] = lllIlIlIlI[17];
                                    if (w.llIIIllIIIlIl(Inventory.contains((int[])nArray) ? 1 : 0) && w.llIIIllIIIllI(fN.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                        AccBuilderTempleTrek.c = lllIlIlIII[lllIlIlIlI[27]];
                                        Movement.walkTo((WorldPoint)fF);

                                        Time.sleepTicks((int)lllIlIlIlI[3]);

                                    }
                                }
                                if (w.llIIIllIIIlIl(fO.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    AccBuilderTempleTrek.c = lllIlIlIII[lllIlIlIlI[28]];
                                    if (w.llIIIllIIIlll(Players.getLocal().getWorldLocation().distanceTo(fF), lllIlIlIlI[3])) {
                                        Movement.walkTo((WorldPoint)fF);

                                        Time.sleepTicks((int)lllIlIlIlI[3]);

                                    }
                                    if (w.llIIIllIIlIII(Players.getLocal().getWorldLocation().distanceTo(fF), lllIlIlIlI[3])) {
                                        String[] stringArray = new String[lllIlIlIlI[3]];
                                        stringArray[w.lllIlIlIlI[4]] = lllIlIlIII[lllIlIlIlI[29]];
                                        lllllllllllllllllIllIllIIlIIIIll2 = TileObjects.getNearest((String[])stringArray);
                                        AccBuilderTempleTrek.c = lllIlIlIII[lllIlIlIlI[30]];
                                        if (w.llIIIllIIIlIl(Inventory.isFull() ? 1 : 0)) {
                                            int[] nArray = new int[lllIlIlIlI[3]];
                                            nArray[w.lllIlIlIlI[4]] = lllIlIlIlI[8];
                                            Inventory.getFirst((int[])nArray).interact(lllIlIlIII[lllIlIlIlI[31]]);
                                            Time.sleepTicks((int)lllIlIlIlI[3]);

                                        }
                                        if (w.llIIIllIIlIIl(lllllllllllllllllIllIllIIlIIIIll2)) {
                                            String[] stringArray2 = new String[lllIlIlIlI[3]];
                                            stringArray2[w.lllIlIlIlI[4]] = lllIlIlIII[lllIlIlIlI[32]];
                                            if (w.llIIIllIIIlIl(lllllllllllllllllIllIllIIlIIIIll2.hasAction(stringArray2) ? 1 : 0)) {
                                                lllllllllllllllllIllIllIIlIIIIll2.interact(lllIlIlIII[lllIlIlIlI[33]]);
                                                Time.sleepTicks((int)lllIlIlIlI[1]);

                                            }
                                            String[] stringArray3 = new String[lllIlIlIlI[3]];
                                            stringArray3[w.lllIlIlIlI[4]] = lllIlIlIII[lllIlIlIlI[34]];
                                            if (w.llIIIllIIIlIl(lllllllllllllllllIllIllIIlIIIIll2.hasAction(stringArray3) ? 1 : 0)) {
                                                lllllllllllllllllIllIllIIlIIIIll2.interact(lllIlIlIII[lllIlIlIlI[35]]);
                                                Time.sleepTicks((int)lllIlIlIlI[1]);

                                                var2 = Widgets.get((int)lllIlIlIlI[23], (int)lllIlIlIlI[3]);
                                                if (w.llIIIllIIlIIl(var2)) {
                                                    var2.interact(lllIlIlIII[lllIlIlIlI[36]]);
                                                    var2.interact(lllIlIlIlI[4]);
                                                    var2.interact(lllIlIlIII[lllIlIlIlI[37]]);
                                                    Keyboard.type((String)lllIlIlIII[lllIlIlIlI[38]]);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            if (w.llIIIllIIIlII(e.j(lllIlIlIlI[0]), lllIlIlIlI[1]) && w.llIIIllIIIlII(e.j(lllIlIlIlI[2]), lllIlIlIlI[1])) {
                                ck = lllIlIlIlI[4];
                                if (w.llIIIllIIlIII(Players.getLocal().getWorldLocation().distanceTo(fy), lllIlIlIlI[22])) {
                                    while (w.llIIIllIIIlll(Players.getLocal().getWorldLocation().distanceTo(fB), lllIlIlIlI[1]) && w.llIIIllIIIllI(AccBuilderTempleTrek.d ? 1 : 0)) {
                                        Movement.walkTo((WorldPoint)fB);

                                        Time.sleepTicks((int)lllIlIlIlI[3]);

                                        if (3 == 3) continue;
                                        return;
                                    }
                                }
                                int[] nArray = new int[lllIlIlIlI[3]];
                                nArray[w.lllIlIlIlI[4]] = lllIlIlIlI[39];
                                if (w.llIIIllIIIllI(Inventory.contains((int[])nArray) ? 1 : 0) && w.llIIIllIIIlIl(fO.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    AccBuilderTempleTrek.c = lllIlIlIII[lllIlIlIlI[40]];
                                    if (w.llIIIllIIIlll(Players.getLocal().getWorldLocation().distanceTo(fF), lllIlIlIlI[3])) {
                                        Movement.walkTo((WorldPoint)fF);

                                        Time.sleepTicks((int)lllIlIlIlI[3]);

                                    }
                                    if (w.llIIIllIIlIII(Players.getLocal().getWorldLocation().distanceTo(fF), lllIlIlIlI[3])) {
                                        String[] stringArray = new String[lllIlIlIlI[3]];
                                        stringArray[w.lllIlIlIlI[4]] = lllIlIlIII[lllIlIlIlI[41]];
                                        lllllllllllllllllIllIllIIlIIIIll2 = TileObjects.getNearest((String[])stringArray);
                                        AccBuilderTempleTrek.c = lllIlIlIII[lllIlIlIlI[42]];
                                        if (w.llIIIllIIlIIl(lllllllllllllllllIllIllIIlIIIIll2)) {
                                            String[] stringArray4 = new String[lllIlIlIlI[3]];
                                            stringArray4[w.lllIlIlIlI[4]] = lllIlIlIII[lllIlIlIlI[43]];
                                            if (w.llIIIllIIIlIl(lllllllllllllllllIllIllIIlIIIIll2.hasAction(stringArray4) ? 1 : 0)) {
                                                lllllllllllllllllIllIllIIlIIIIll2.interact(lllIlIlIII[lllIlIlIlI[44]]);
                                                Time.sleepTicks((int)lllIlIlIlI[1]);

                                            }
                                            String[] stringArray5 = new String[lllIlIlIlI[3]];
                                            stringArray5[w.lllIlIlIlI[4]] = lllIlIlIII[lllIlIlIlI[45]];
                                            if (w.llIIIllIIIlIl(lllllllllllllllllIllIllIIlIIIIll2.hasAction(stringArray5) ? 1 : 0)) {
                                                lllllllllllllllllIllIllIIlIIIIll2.interact(lllIlIlIII[lllIlIlIlI[46]]);
                                                Time.sleepTicks((int)lllIlIlIlI[1]);

                                                var2 = Widgets.get((int)lllIlIlIlI[23], (int)lllIlIlIlI[3]);
                                                if (w.llIIIllIIlIIl(var2)) {
                                                    var2.interact(lllIlIlIII[lllIlIlIlI[47]]);
                                                    var2.interact(lllIlIlIlI[4]);
                                                    var2.interact(lllIlIlIII[lllIlIlIlI[48]]);
                                                    Keyboard.type((String)lllIlIlIII[lllIlIlIlI[49]]);
                                                }
                                            }
                                        }
                                    }
                                }
                                int[] nArray10 = new int[lllIlIlIlI[3]];
                                nArray10[w.lllIlIlIlI[4]] = lllIlIlIlI[39];
                                if (w.llIIIllIIIlIl(Inventory.contains((int[])nArray10) ? 1 : 0) && w.llIIIllIIIlll(Players.getLocal().getWorldLocation().distanceTo(fC), lllIlIlIlI[3])) {
                                    AccBuilderTempleTrek.c = lllIlIlIII[lllIlIlIlI[50]];
                                    Movement.walkTo((WorldPoint)fC);

                                    Time.sleepTicks((int)lllIlIlIlI[3]);

                                }
                                if (w.llIIIllIIlIII(Players.getLocal().getWorldLocation().distanceTo(fC), lllIlIlIlI[1])) {
                                    String[] stringArray = new String[lllIlIlIlI[3]];
                                    stringArray[w.lllIlIlIlI[4]] = lllIlIlIII[lllIlIlIlI[51]];
                                    lllllllllllllllllIllIllIIlIIIIll2 = TileObjects.getNearest((String[])stringArray);
                                    String[] stringArray6 = new String[lllIlIlIlI[3]];
                                    stringArray6[w.lllIlIlIlI[4]] = lllIlIlIII[lllIlIlIlI[52]];
                                    var2 = NPCs.getNearest((String[])stringArray6);
                                    if (w.llIIIllIIlIIl(lllllllllllllllllIllIllIIlIIIIll2) && w.llIIIllIIlIlI(var2)) {
                                        AccBuilderTempleTrek.c = lllIlIlIII[lllIlIlIlI[53]];
                                        String[] stringArray7 = new String[lllIlIlIlI[3]];
                                        stringArray7[w.lllIlIlIlI[4]] = lllIlIlIII[lllIlIlIlI[54]];
                                        if (w.llIIIllIIIlIl(Inventory.contains((String[])stringArray7) ? 1 : 0)) {
                                            String[] stringArray8 = new String[lllIlIlIlI[3]];
                                            stringArray8[w.lllIlIlIlI[4]] = lllIlIlIII[lllIlIlIlI[55]];
                                            Inventory.getFirst((String[])stringArray8).useOn(lllllllllllllllllIllIllIIlIIIIll2);
                                        }
                                        Time.sleepTicks((int)lllIlIlIlI[3]);

                                    }
                                    if (w.llIIIllIIlIIl(var2)) {
                                        AccBuilderTempleTrek.c = lllIlIlIII[lllIlIlIlI[56]];
                                        int[] nArray11 = new int[lllIlIlIlI[3]];
                                        nArray11[w.lllIlIlIlI[4]] = lllIlIlIlI[39];
                                        if (w.llIIIllIIIlIl(Inventory.contains((int[])nArray11) ? 1 : 0)) {
                                            int[] nArray12 = new int[lllIlIlIlI[3]];
                                            nArray12[w.lllIlIlIlI[4]] = lllIlIlIlI[39];
                                            Inventory.getFirst((int[])nArray12).useOn((Actor)var2);
                                        }
                                        Time.sleepTicks((int)lllIlIlIlI[3]);

                                    }
                                }
                            }
                            if (w.llIIIllIIIlIl(fN.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && w.llIIIllIIIlII(e.j(lllIlIlIlI[2]), lllIlIlIlI[12])) {
                                AccBuilderTempleTrek.c = lllIlIlIII[lllIlIlIlI[57]];
                                Movement.walkTo((WorldPoint)new WorldPoint(lllIlIlIlI[58], lllIlIlIlI[59], lllIlIlIlI[4]));

                                Time.sleepTicks((int)lllIlIlIlI[3]);

                            }
                            if (!w.llIIIllIIIllI(fN.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || !w.llIIIllIIIlII(e.j(lllIlIlIlI[2]), lllIlIlIlI[12])) break block89;
                            int[] nArray = new int[lllIlIlIlI[3]];
                            nArray[w.lllIlIlIlI[4]] = lllIlIlIlI[60];
                            if (!w.llIIIllIIIlIl(Inventory.contains((int[])nArray) ? 1 : 0)) break block90;
                            int[] nArray13 = new int[lllIlIlIlI[3]];
                            nArray13[w.lllIlIlIlI[4]] = lllIlIlIlI[60];
                            if (!w.llIIIllIIIlIl(Inventory.contains((int[])nArray13) ? 1 : 0) || !w.llIIIllIIIlll(Players.getLocal().getWorldLocation().distanceTo(fL), lllIlIlIlI[12])) break block89;
                        }
                        AccBuilderTempleTrek.c = lllIlIlIII[lllIlIlIlI[61]];
                        if (w.llIIIllIIlIll(Movement.getRunEnergy(), lllIlIlIlI[33])) {
                            w.bG();
                        }
                    }
                    if (w.llIIIllIIlIII(Players.getLocal().getWorldLocation().distanceTo(fL), lllIlIlIlI[12])) {
                        int[] nArray = new int[lllIlIlIlI[3]];
                        nArray[w.lllIlIlIlI[4]] = lllIlIlIlI[60];
                        if (w.llIIIllIIIlIl(Inventory.contains((int[])nArray) ? 1 : 0) && w.llIIIllIIIlII(Players.getLocal().getWorldLocation().getX(), lllIlIlIlI[62])) {
                            String[] stringArray = new String[lllIlIlIlI[3]];
                            stringArray[w.lllIlIlIlI[4]] = lllIlIlIII[lllIlIlIlI[63]];
                            lllllllllllllllllIllIllIIlIIIIll2 = TileObjects.getNearest((String[])stringArray);
                            if (w.llIIIllIIlIIl(lllllllllllllllllIllIllIIlIIIIll2)) {
                                AccBuilderTempleTrek.c = lllIlIlIII[lllIlIlIlI[64]];
                                int[] nArray14 = new int[lllIlIlIlI[3]];
                                nArray14[w.lllIlIlIlI[4]] = lllIlIlIlI[60];
                                if (w.llIIIllIIIlIl(Inventory.contains((int[])nArray14) ? 1 : 0)) {
                                    int[] nArray15 = new int[lllIlIlIlI[3]];
                                    nArray15[w.lllIlIlIlI[4]] = lllIlIlIlI[60];
                                    Inventory.getFirst((int[])nArray15).useOn(lllllllllllllllllIllIllIIlIIIIll2);
                                    Time.sleepTicks((int)lllIlIlIlI[1]);

                                }
                            }
                        }
                    }
                    if (!w.llIIIllIIIlIl(fP.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block91;
                    int[] nArray = new int[lllIlIlIlI[3]];
                    nArray[w.lllIlIlIlI[4]] = lllIlIlIlI[60];
                    if (!w.llIIIllIIIlIl(Inventory.contains((int[])nArray) ? 1 : 0)) break block91;
                    if (w.llIIIllIIIllI(Players.getLocal().getWorldLocation().equals((Object)fz) ? 1 : 0)) {
                        AccBuilderTempleTrek.c = lllIlIlIII[lllIlIlIlI[65]];
                        Movement.walkTo((WorldPoint)fz);

                    }
                    if (w.llIIIllIIlIII(Skills.getBoostedLevel((Skill)Skill.HITPOINTS), lllIlIlIlI[13])) {
                        int[] nArray16 = new int[lllIlIlIlI[3]];
                        nArray16[w.lllIlIlIlI[4]] = lllIlIlIlI[8];
                        if (w.llIIIllIIIlIl(Inventory.contains((int[])nArray16) ? 1 : 0)) {
                            int[] nArray17 = new int[lllIlIlIlI[3]];
                            nArray17[w.lllIlIlIlI[4]] = lllIlIlIlI[8];
                            Inventory.getFirst((int[])nArray17).interact(lllIlIlIII[lllIlIlIlI[66]]);
                        }
                    }
                    if (!w.llIIIllIIIlIl(Players.getLocal().getWorldLocation().equals((Object)fz) ? 1 : 0) || !w.llIIIllIIlIIl(lllllllllllllllllIllIllIIlIIIIll2 = NPCs.getNearest((int[])gd)) || !w.llIIIllIIIllI(lllllllllllllllllIllIllIIlIIIIll2.isDead() ? 1 : 0)) break block91;
                    AccBuilderTempleTrek.c = lllIlIlIII[lllIlIlIlI[67]];
                    if (w.llIIIllIIIIll(Skills.getLevel((Skill)Skill.MAGIC), lllIlIlIlI[21])) {
                        Magic.cast((Spell)SpellBook.Standard.WATER_STRIKE, (NPC)lllllllllllllllllIllIllIIlIIIIll2);
                        Time.sleepTicks((int)lllIlIlIlI[3]);

                    }
                    if (w.llIIIllIIIIll(Skills.getLevel((Skill)Skill.MAGIC), lllIlIlIlI[26]) && !w.llIIIllIIIIll(Skills.getLevel((Skill)Skill.MAGIC), lllIlIlIlI[21])) break block92;
                    if (!w.llIIIllIIlIll(Skills.getLevel((Skill)Skill.MAGIC), lllIlIlIlI[21])) break block93;
                    int[] nArray18 = new int[lllIlIlIlI[3]];
                    nArray18[w.lllIlIlIlI[4]] = lllIlIlIlI[6];
                    if (!w.llIIIllIIIlIl(Inventory.contains((int[])nArray18) ? 1 : 0)) break block93;
                    String[] stringArray = new String[lllIlIlIlI[3]];
                    stringArray[w.lllIlIlIlI[4]] = lllIlIlIII[lllIlIlIlI[68]];
                    if (!w.llIIIllIIIllI(Inventory.contains((String[])stringArray) ? 1 : 0)) break block93;
                }
                Magic.cast((Spell)SpellBook.Standard.EARTH_STRIKE, (NPC)lllllllllllllllllIllIllIIlIIIIll2);
                Time.sleepTicks((int)lllIlIlIlI[3]);

            }
            if (w.llIIIllIIlIll(Skills.getLevel((Skill)Skill.MAGIC), lllIlIlIlI[26])) {
                String[] stringArray = new String[lllIlIlIlI[3]];
                stringArray[w.lllIlIlIlI[4]] = lllIlIlIII[lllIlIlIlI[69]];
                if (w.llIIIllIIIlIl(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    Magic.cast((Spell)SpellBook.Standard.FIRE_STRIKE, (NPC)lllllllllllllllllIllIllIIlIIIIll2);
                    Time.sleepTicks((int)lllIlIlIlI[3]);

                }
            }
        }
        if (w.llIIIllIIIlII(e.j(lllIlIlIlI[2]), lllIlIlIlI[14])) {
            String[] stringArray = new String[lllIlIlIlI[3]];
            stringArray[w.lllIlIlIlI[4]] = lllIlIlIII[lllIlIlIlI[70]];
            if (w.llIIIllIIIllI(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                String[] stringArray9 = new String[lllIlIlIlI[3]];
                stringArray9[w.lllIlIlIlI[4]] = lllIlIlIII[lllIlIlIlI[71]];
                lllllllllllllllllIllIllIIlIIIIll2 = TileItems.getNearest((String[])stringArray9);
                if (w.llIIIllIIlIIl(lllllllllllllllllIllIllIIlIIIIll2)) {
                    AccBuilderTempleTrek.c = lllIlIlIII[lllIlIlIlI[72]];
                    lllllllllllllllllIllIllIIlIIIIll2.interact(lllIlIlIII[lllIlIlIlI[73]]);
                    Time.sleepTicks((int)lllIlIlIlI[1]);

                }
            }
        }
        if (w.llIIIllIIIlII(e.j(lllIlIlIlI[2]), lllIlIlIlI[14])) {
            String[] stringArray = new String[lllIlIlIlI[3]];
            stringArray[w.lllIlIlIlI[4]] = lllIlIlIII[lllIlIlIlI[74]];
            if (w.llIIIllIIIlIl(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                if (w.llIIIllIIIlIl(fP.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    int[] nArray = new int[lllIlIlIlI[3]];
                    nArray[w.lllIlIlIlI[4]] = lllIlIlIlI[10];
                    if (w.llIIIllIIIlIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        AccBuilderTempleTrek.c = lllIlIlIII[lllIlIlIlI[75]];
                        int[] nArray19 = new int[lllIlIlIlI[3]];
                        nArray19[w.lllIlIlIlI[4]] = lllIlIlIlI[10];
                        Inventory.getFirst((int[])nArray19).interact(lllIlIlIII[lllIlIlIlI[76]]);
                        Time.sleepTicks((int)lllIlIlIlI[13]);

                    }
                }
                if (w.llIIIllIIIllI(fP.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && w.llIIIllIIIlll(Players.getLocal().getWorldLocation().distanceTo(fy), lllIlIlIlI[15])) {
                    AccBuilderTempleTrek.c = lllIlIlIII[lllIlIlIlI[77]];
                    Movement.walkTo((WorldPoint)fy);

                    Time.sleepTicks((int)lllIlIlIlI[3]);

                }
                if (w.llIIIllIIlIII(Players.getLocal().getWorldLocation().distanceTo(fy), lllIlIlIlI[13])) {
                    AccBuilderTempleTrek.c = lllIlIlIII[lllIlIlIlI[78]];
                    if (w.llIIIllIIIIll(ck, lllIlIlIlI[3])) {
                        ac.jU += lllIlIlIlI[3];
                        ac.d(AccBuilderTempleTrek.m);
                        ck += lllIlIlIlI[3];
                        ac.jU = lllIlIlIlI[4];
                        cl = lllIlIlIlI[4];
                    }
                    g.a(lllIlIlIII[lllIlIlIlI[79]], eR);
                }
            }
        }
    }

    @Override
    public boolean V() {
        boolean bl;
        if (w.llIIIllIIlIll(e.j(lllIlIlIlI[2]), lllIlIlIlI[18])) {
            bl = lllIlIlIlI[3];

            if (2 < 2) {
                return false;
            }
        } else {
            bl = lllIlIlIlI[4];
        }
        return bl;
    }

    static {
        w.llIIIllIIIIlI();
        w.llIIIllIIIIIl();
        ft = lllIlIlIlI[17];
        fr = lllIlIlIlI[18];
        fn = lllIlIlIlI[3];
        fu = lllIlIlIlI[60];
        fl = lllIlIlIlI[1];
        fZ = lllIlIlIlI[9];
        fR = lllIlIlIlI[118];
        fw = lllIlIlIlI[19];
        fS = lllIlIlIlI[119];
        fk = lllIlIlIlI[0];
        fU = lllIlIlIlI[7];
        fW = lllIlIlIlI[6];
        fm = lllIlIlIlI[2];
        fv = lllIlIlIlI[39];
        fq = lllIlIlIlI[14];
        fT = lllIlIlIlI[120];
        fX = lllIlIlIlI[121];
        fs = lllIlIlIlI[82];
        fQ = lllIlIlIlI[122];
        fV = lllIlIlIlI[5];
        fp = lllIlIlIlI[12];
        fY = lllIlIlIlI[8];
        fo = lllIlIlIlI[1];
        eZ = new WorldPoint(lllIlIlIlI[123], lllIlIlIlI[59], lllIlIlIlI[4]);
        fa = new WorldPoint(lllIlIlIlI[62], lllIlIlIlI[124], lllIlIlIlI[4]);
        fb = new WorldPoint(lllIlIlIlI[125], lllIlIlIlI[94], lllIlIlIlI[4]);
        fc = new WorldArea(lllIlIlIlI[126], lllIlIlIlI[127], lllIlIlIlI[31], lllIlIlIlI[14], lllIlIlIlI[4]);
        fd = new WorldArea(lllIlIlIlI[128], lllIlIlIlI[127], lllIlIlIlI[30], lllIlIlIlI[14], lllIlIlIlI[4]);
        fe = new WorldArea(lllIlIlIlI[129], lllIlIlIlI[130], lllIlIlIlI[15], lllIlIlIlI[22], lllIlIlIlI[4]);
        ff = new WorldArea(lllIlIlIlI[131], lllIlIlIlI[132], lllIlIlIlI[24], lllIlIlIlI[15], lllIlIlIlI[4]);
        fg = new WorldArea(lllIlIlIlI[133], lllIlIlIlI[132], lllIlIlIlI[18], lllIlIlIlI[13], lllIlIlIlI[4]);
        fh = new WorldArea(lllIlIlIlI[134], lllIlIlIlI[135], lllIlIlIlI[21], lllIlIlIlI[18], lllIlIlIlI[4]);
        fi = new WorldArea(lllIlIlIlI[136], lllIlIlIlI[132], lllIlIlIlI[15], lllIlIlIlI[15], lllIlIlIlI[4]);
        fj = new WorldArea(lllIlIlIlI[137], lllIlIlIlI[132], lllIlIlIlI[15], lllIlIlIlI[13], lllIlIlIlI[4]);
        fx = new WorldPoint(lllIlIlIlI[138], lllIlIlIlI[139], lllIlIlIlI[1]);
        fy = new WorldPoint(lllIlIlIlI[140], lllIlIlIlI[141], lllIlIlIlI[4]);
        fz = new WorldPoint(lllIlIlIlI[142], lllIlIlIlI[127], lllIlIlIlI[4]);
        fA = new WorldPoint(lllIlIlIlI[143], lllIlIlIlI[144], lllIlIlIlI[4]);
        fB = new WorldPoint(lllIlIlIlI[145], lllIlIlIlI[146], lllIlIlIlI[4]);
        fC = new WorldPoint(lllIlIlIlI[131], lllIlIlIlI[94], lllIlIlIlI[4]);
        fD = new WorldPoint(lllIlIlIlI[147], lllIlIlIlI[148], lllIlIlIlI[4]);
        fE = new WorldPoint(lllIlIlIlI[149], lllIlIlIlI[150], lllIlIlIlI[4]);
        fF = new WorldPoint(lllIlIlIlI[145], lllIlIlIlI[151], lllIlIlIlI[4]);
        fG = new WorldPoint(lllIlIlIlI[131], lllIlIlIlI[151], lllIlIlIlI[4]);
        fH = new WorldPoint(lllIlIlIlI[131], lllIlIlIlI[152], lllIlIlIlI[4]);
        fI = new WorldPoint(lllIlIlIlI[136], lllIlIlIlI[151], lllIlIlIlI[4]);
        fJ = new WorldPoint(lllIlIlIlI[136], lllIlIlIlI[152], lllIlIlIlI[4]);
        fK = new WorldPoint(lllIlIlIlI[58], lllIlIlIlI[153], lllIlIlIlI[4]);
        fL = new WorldPoint(lllIlIlIlI[62], lllIlIlIlI[135], lllIlIlIlI[4]);
        fM = new WorldPoint(lllIlIlIlI[154], lllIlIlIlI[155], lllIlIlIlI[4]);
        fN = new WorldArea(new WorldPoint(lllIlIlIlI[156], lllIlIlIlI[157], lllIlIlIlI[4]), new WorldPoint(lllIlIlIlI[58], lllIlIlIlI[94], lllIlIlIlI[4]));
        fO = new WorldArea(new WorldPoint(lllIlIlIlI[145], lllIlIlIlI[158], lllIlIlIlI[4]), new WorldPoint(lllIlIlIlI[159], lllIlIlIlI[160], lllIlIlIlI[4]));
        fP = new WorldArea(lllIlIlIlI[62], lllIlIlIlI[130], lllIlIlIlI[14], lllIlIlIlI[22], lllIlIlIlI[4]);
        bu = new ArrayList<d>();
        ga = lllIlIlIlI[161];
        gb = lllIlIlIlI[162];
        gc = lllIlIlIII[lllIlIlIlI[163]];
        String[] stringArray = new String[lllIlIlIlI[14]];
        stringArray[w.lllIlIlIlI[4]] = lllIlIlIII[lllIlIlIlI[164]];
        stringArray[w.lllIlIlIlI[3]] = lllIlIlIII[lllIlIlIlI[165]];
        stringArray[w.lllIlIlIlI[1]] = lllIlIlIII[lllIlIlIlI[166]];
        stringArray[w.lllIlIlIlI[12]] = lllIlIlIII[lllIlIlIlI[167]];
        stringArray[w.lllIlIlIlI[15]] = lllIlIlIII[lllIlIlIlI[168]];
        stringArray[w.lllIlIlIlI[13]] = lllIlIlIII[lllIlIlIlI[169]];
        eR = stringArray;
        int[] nArray = new int[lllIlIlIlI[15]];
        nArray[w.lllIlIlIlI[4]] = lllIlIlIlI[170];
        nArray[w.lllIlIlIlI[3]] = lllIlIlIlI[171];
        nArray[w.lllIlIlIlI[1]] = lllIlIlIlI[172];
        nArray[w.lllIlIlIlI[12]] = lllIlIlIlI[173];
        gd = nArray;
    }

    private static boolean llIIIllIIIlII(int n2, int n3) {
        return n2 == n3;
    }

    /*
     * WARNING - void declaration
     */
    private static void bH() {
        block30: {
            block34: {
                block32: {
                    block33: {
                        block31: {
                            void var3;
                            BankLocation bankLocation = BankLocation.getNearest();
                            if (w.llIIIllIIlIIl(bankLocation) && w.llIIIllIIIllI(bankLocation.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                AccBuilderTempleTrek.c = lllIlIlIII[lllIlIlIlI[97]];
                                a.a(bankLocation);
                            }
                            if (!w.llIIIllIIlIIl(var3) || !w.llIIIllIIIlIl(var3.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block30;
                            if (w.llIIIllIIIllI(Bank.isOpen() ? 1 : 0)) {
                                AccBuilderTempleTrek.c = lllIlIlIII[lllIlIlIlI[98]];
                                a.a();
                                Time.sleepUntil(() -> Bank.isOpen(), (int)lllIlIlIlI[99]);

                            }
                            if (!w.llIIIllIIIlIl(Bank.isOpen() ? 1 : 0)) break block30;
                            AccBuilderTempleTrek.c = lllIlIlIII[lllIlIlIlI[100]];
                            if (w.llIIIllIIllII(Inventory.getAll().size())) {
                                Bank.depositInventory();
                                Time.sleepTicks((int)lllIlIlIlI[12]);

                            }
                            if (w.llIIIllIIllII(Equipment.getAll().size())) {
                                Bank.depositEquipment();
                                Time.sleepTicks((int)lllIlIlIlI[1]);

                            }
                            while (w.llIIIllIIIllI(t.bl() ? 1 : 0) && w.llIIIllIIIllI(AccBuilderTempleTrek.d ? 1 : 0)) {
                                t.bj();
                                Time.sleepTicks((int)lllIlIlIlI[3]);

                                if (3 != 0) continue;
                                return;
                            }
                            int[] nArray = new int[lllIlIlIlI[3]];
                            nArray[w.lllIlIlIlI[4]] = lllIlIlIlI[7];
                            if (w.llIIIllIIIlIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                                int[] nArray2 = new int[lllIlIlIlI[3]];
                                nArray2[w.lllIlIlIlI[4]] = lllIlIlIlI[7];
                                if (w.llIIIllIIIIll(Bank.getFirst((int[])nArray2).getQuantity(), lllIlIlIlI[101])) {
                                    w.ae();
                                    System.out.println(lllIlIlIII[lllIlIlIlI[102]]);
                                    bs = lllIlIlIlI[3];
                                    return;
                                }
                            }
                            int[] nArray3 = new int[lllIlIlIlI[3]];
                            nArray3[w.lllIlIlIlI[4]] = lllIlIlIlI[6];
                            if (w.llIIIllIIIlIl(Bank.contains((int[])nArray3) ? 1 : 0)) {
                                int[] nArray4 = new int[lllIlIlIlI[3]];
                                nArray4[w.lllIlIlIlI[4]] = lllIlIlIlI[6];
                                if (w.llIIIllIIIIll(Bank.getFirst((int[])nArray4).getQuantity(), lllIlIlIlI[101])) {
                                    w.ae();
                                    System.out.println(lllIlIlIII[lllIlIlIlI[16]]);
                                    bs = lllIlIlIlI[3];
                                    return;
                                }
                            }
                            int[] nArray5 = new int[lllIlIlIlI[3]];
                            nArray5[w.lllIlIlIlI[4]] = lllIlIlIlI[5];
                            if (w.llIIIllIIIlIl(Bank.contains((int[])nArray5) ? 1 : 0)) {
                                int[] nArray6 = new int[lllIlIlIlI[3]];
                                nArray6[w.lllIlIlIlI[4]] = lllIlIlIlI[5];
                                if (w.llIIIllIIIIll(Bank.getFirst((int[])nArray6).getQuantity(), lllIlIlIlI[101])) {
                                    w.ae();
                                    System.out.println(lllIlIlIII[lllIlIlIlI[103]]);
                                    bs = lllIlIlIlI[3];
                                    return;
                                }
                            }
                            int[] nArray7 = new int[lllIlIlIlI[3]];
                            nArray7[w.lllIlIlIlI[4]] = lllIlIlIlI[10];
                            if (!w.llIIIllIIIlIl(Bank.contains((int[])nArray7) ? 1 : 0)) break block31;
                            int[] nArray8 = new int[lllIlIlIlI[3]];
                            nArray8[w.lllIlIlIlI[4]] = lllIlIlIlI[10];
                            if (!w.llIIIllIIlIll(Bank.getFirst((int[])nArray8).getQuantity(), lllIlIlIlI[22])) break block32;
                        }
                        int[] nArray = new int[lllIlIlIlI[3]];
                        nArray[w.lllIlIlIlI[4]] = lllIlIlIlI[9];
                        if (!w.llIIIllIIIlIl(Bank.contains((int[])nArray) ? 1 : 0)) break block33;
                        int[] nArray9 = new int[lllIlIlIlI[3]];
                        nArray9[w.lllIlIlIlI[4]] = lllIlIlIlI[9];
                        if (!w.llIIIllIIlIll(Bank.getFirst((int[])nArray9).getQuantity(), lllIlIlIlI[13])) break block32;
                    }
                    int[] nArray = new int[lllIlIlIlI[3]];
                    nArray[w.lllIlIlIlI[4]] = lllIlIlIlI[8];
                    if (!w.llIIIllIIIlIl(Bank.contains((int[])nArray) ? 1 : 0)) break block34;
                    int[] nArray10 = new int[lllIlIlIlI[3]];
                    nArray10[w.lllIlIlIlI[4]] = lllIlIlIlI[8];
                    if (!w.llIIIllIIIIll(Bank.getFirst((int[])nArray10).getQuantity(), lllIlIlIlI[33])) break block34;
                }
                w.ae();
                System.out.println(lllIlIlIII[lllIlIlIlI[104]]);
                bs = lllIlIlIlI[3];
                return;
            }
            int[] nArray = new int[lllIlIlIlI[18]];
            nArray[w.lllIlIlIlI[4]] = lllIlIlIlI[105];
            nArray[w.lllIlIlIlI[3]] = lllIlIlIlI[10];
            nArray[w.lllIlIlIlI[1]] = lllIlIlIlI[9];
            nArray[w.lllIlIlIlI[12]] = lllIlIlIlI[8];
            nArray[w.lllIlIlIlI[15]] = lllIlIlIlI[7];
            nArray[w.lllIlIlIlI[13]] = lllIlIlIlI[5];
            nArray[w.lllIlIlIlI[14]] = lllIlIlIlI[6];
            if (w.llIIIllIIIllI(e.b(nArray) ? 1 : 0)) {
                w.ae();
                System.out.println(lllIlIlIII[lllIlIlIlI[106]]);
                bs = lllIlIlIlI[3];
                return;
            }
            if (w.llIIIllIIIllI(Bank.isOpen() ? 1 : 0)) {
                a.a();
                Time.sleepTicks((int)lllIlIlIlI[15]);

            }
            int[] nArray11 = new int[lllIlIlIlI[3]];
            nArray11[w.lllIlIlIlI[4]] = lllIlIlIlI[10];
            if (w.llIIIllIIIlIl(Bank.contains((int[])nArray11) ? 1 : 0)) {
                int[] nArray12 = new int[lllIlIlIlI[3]];
                nArray12[w.lllIlIlIlI[4]] = lllIlIlIlI[10];
                if (w.llIIIllIIIIll(Inventory.getCount((int[])nArray12), lllIlIlIlI[3])) {
                    Bank.withdraw((int)lllIlIlIlI[10], (int)lllIlIlIlI[13], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                    Time.sleepTicks((int)lllIlIlIlI[3]);

                    Time.sleepUntil(() -> {
                        boolean bl;
                        int[] nArray = new int[lllIlIlIlI[3]];
                        nArray[w.lllIlIlIlI[4]] = lllIlIlIlI[10];
                        if (w.llIIIllIIllII(Inventory.getCount((int[])nArray))) {
                            bl = lllIlIlIlI[3];

                            if (-1 == ((0xC1 ^ 0xAA ^ (0xC9 ^ 0xAC)) & (15 + 51 - -6 + 66 ^ 103 + 119 - 115 + 25 ^ -1))) {
                                return ((0x8E ^ 0xB5 ^ (0x99 ^ 0xAA)) & (0xBD ^ 0x80 ^ (0x98 ^ 0xAD) ^ -1)) != 0;
                            }
                        } else {
                            bl = lllIlIlIlI[4];
                        }
                        return bl;
                    }, (int)lllIlIlIlI[99]);

                }
            }
            int[] nArray13 = new int[lllIlIlIlI[3]];
            nArray13[w.lllIlIlIlI[4]] = lllIlIlIlI[9];
            if (w.llIIIllIIIlIl(Bank.contains((int[])nArray13) ? 1 : 0)) {
                int[] nArray14 = new int[lllIlIlIlI[3]];
                nArray14[w.lllIlIlIlI[4]] = lllIlIlIlI[9];
                if (w.llIIIllIIIIll(Inventory.getCount((int[])nArray14), lllIlIlIlI[3])) {
                    Bank.withdraw((int)lllIlIlIlI[9], (int)lllIlIlIlI[15], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                    Time.sleepTicks((int)lllIlIlIlI[3]);

                    Time.sleepUntil(() -> {
                        boolean bl;
                        int[] nArray = new int[lllIlIlIlI[3]];
                        nArray[w.lllIlIlIlI[4]] = lllIlIlIlI[9];
                        if (w.llIIIllIIllII(Inventory.getCount((int[])nArray))) {
                            bl = lllIlIlIlI[3];

                            if (-1 < -1) {
                                return false;
                            }
                        } else {
                            bl = lllIlIlIlI[4];
                        }
                        return bl;
                    }, (int)lllIlIlIlI[99]);

                }
            }
            int[] nArray15 = new int[lllIlIlIlI[3]];
            nArray15[w.lllIlIlIlI[4]] = lllIlIlIlI[7];
            if (w.llIIIllIIIlIl(Bank.contains((int[])nArray15) ? 1 : 0)) {
                int[] nArray16 = new int[lllIlIlIlI[3]];
                nArray16[w.lllIlIlIlI[4]] = lllIlIlIlI[7];
                if (w.llIIIllIIIIll(Inventory.getCount((int[])nArray16), lllIlIlIlI[3])) {
                    Bank.withdraw((int)lllIlIlIlI[7], (int)lllIlIlIlI[107], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                    Time.sleepTicks((int)lllIlIlIlI[3]);

                    Time.sleepUntil(() -> {
                        boolean bl;
                        int[] nArray = new int[lllIlIlIlI[3]];
                        nArray[w.lllIlIlIlI[4]] = lllIlIlIlI[7];
                        if (w.llIIIllIIllII(Inventory.getCount((int[])nArray))) {
                            bl = lllIlIlIlI[3];

                            if (2 <= 1) {
                                return false;
                            }
                        } else {
                            bl = lllIlIlIlI[4];
                        }
                        return bl;
                    }, (int)lllIlIlIlI[99]);

                }
            }
            int[] nArray17 = new int[lllIlIlIlI[3]];
            nArray17[w.lllIlIlIlI[4]] = lllIlIlIlI[5];
            if (w.llIIIllIIIlIl(Bank.contains((int[])nArray17) ? 1 : 0)) {
                int[] nArray18 = new int[lllIlIlIlI[3]];
                nArray18[w.lllIlIlIlI[4]] = lllIlIlIlI[5];
                if (w.llIIIllIIIIll(Inventory.getCount((int[])nArray18), lllIlIlIlI[3])) {
                    Bank.withdraw((int)lllIlIlIlI[5], (int)lllIlIlIlI[107], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                    Time.sleepTicks((int)lllIlIlIlI[3]);

                    Time.sleepUntil(() -> {
                        boolean bl;
                        int[] nArray = new int[lllIlIlIlI[3]];
                        nArray[w.lllIlIlIlI[4]] = lllIlIlIlI[5];
                        if (w.llIIIllIIllII(Inventory.getCount((int[])nArray))) {
                            bl = lllIlIlIlI[3];

                            if (1 != 1) {
                                return false;
                            }
                        } else {
                            bl = lllIlIlIlI[4];
                        }
                        return bl;
                    }, (int)lllIlIlIlI[99]);

                }
            }
            int[] nArray19 = new int[lllIlIlIlI[3]];
            nArray19[w.lllIlIlIlI[4]] = lllIlIlIlI[6];
            if (w.llIIIllIIIlIl(Bank.contains((int[])nArray19) ? 1 : 0)) {
                int[] nArray20 = new int[lllIlIlIlI[3]];
                nArray20[w.lllIlIlIlI[4]] = lllIlIlIlI[6];
                if (w.llIIIllIIIIll(Inventory.getCount((int[])nArray20), lllIlIlIlI[3])) {
                    Bank.withdraw((int)lllIlIlIlI[6], (int)lllIlIlIlI[107], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                    Time.sleepTicks((int)lllIlIlIlI[3]);

                    Time.sleepUntil(() -> {
                        boolean bl;
                        int[] nArray = new int[lllIlIlIlI[3]];
                        nArray[w.lllIlIlIlI[4]] = lllIlIlIlI[6];
                        if (w.llIIIllIIllII(Inventory.getCount((int[])nArray))) {
                            bl = lllIlIlIlI[3];

                            if ((44 + 31 - -18 + 73 ^ 36 + 134 - 74 + 66) < 0) {
                                return ((0x6A ^ 0x1D ^ (0x2D ^ 0x47)) & (0x3A ^ 0x18 ^ (0x31 ^ 0xE) ^ -1)) != 0;
                            }
                        } else {
                            bl = lllIlIlIlI[4];
                        }
                        return bl;
                    }, (int)lllIlIlIlI[99]);

                }
            }
            int[] nArray21 = new int[lllIlIlIlI[3]];
            nArray21[w.lllIlIlIlI[4]] = lllIlIlIlI[108];
            if (w.llIIIllIIIlIl(Bank.contains((int[])nArray21) ? 1 : 0)) {
                int[] nArray22 = new int[lllIlIlIlI[3]];
                nArray22[w.lllIlIlIlI[4]] = lllIlIlIlI[108];
                if (w.llIIIllIIIllI(Inventory.contains((int[])nArray22) ? 1 : 0)) {
                    Bank.withdraw((int)lllIlIlIlI[108], (int)lllIlIlIlI[3], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                    Time.sleepTicks((int)lllIlIlIlI[3]);

                    Time.sleepUntil(() -> {
                        int[] nArray = new int[lllIlIlIlI[3]];
                        nArray[w.lllIlIlIlI[4]] = lllIlIlIlI[108];
                        return Inventory.contains((int[])nArray);
                    }, (int)lllIlIlIlI[99]);

                }
            }
            int[] nArray23 = new int[lllIlIlIlI[3]];
            nArray23[w.lllIlIlIlI[4]] = lllIlIlIlI[8];
            if (w.llIIIllIIIlIl(Bank.contains((int[])nArray23) ? 1 : 0)) {
                int[] nArray24 = new int[lllIlIlIlI[3]];
                nArray24[w.lllIlIlIlI[4]] = lllIlIlIlI[8];
                if (w.llIIIllIIIIll(Inventory.getCount((int[])nArray24), lllIlIlIlI[3])) {
                    Bank.withdrawAll((int)lllIlIlIlI[8], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                    Time.sleepTicks((int)lllIlIlIlI[3]);

                    Time.sleepUntil(() -> {
                        boolean bl;
                        int[] nArray = new int[lllIlIlIlI[3]];
                        nArray[w.lllIlIlIlI[4]] = lllIlIlIlI[8];
                        if (w.llIIIllIIllII(Inventory.getCount((int[])nArray))) {
                            bl = lllIlIlIlI[3];

                            if (2 > (0x6C ^ 0x68)) {
                                return false;
                            }
                        } else {
                            bl = lllIlIlIlI[4];
                        }
                        return bl;
                    }, (int)lllIlIlIlI[99]);

                }
            }
        }
    }

    private static boolean llIIIllIIIlll(int n2, int n3) {
        return n2 > n3;
    }

    @Override
    public String U() {
        return lllIlIlIII[lllIlIlIlI[116]];
    }

    @Override
    public boolean S() {
        return lllIlIlIlI[4];
    }

    private static boolean llIIIllIIlIll(int n2, int n3) {
        return n2 >= n3;
    }

    public static void bG() {
        if (w.llIIIllIIIlIl(Inventory.contains((int[])f.aU) ? 1 : 0) && w.llIIIllIIIIll(Movement.getRunEnergy(), lllIlIlIlI[68])) {
            Inventory.getFirst((int[])f.aU).interact(lllIlIlIII[lllIlIlIlI[80]]);
            Time.sleepTicks((int)lllIlIlIlI[3]);

        }
        if (w.llIIIllIIIllI(Movement.isRunEnabled() ? 1 : 0)) {
            Movement.toggleRun();
        }
        if (!w.llIIIllIIIllI(fN.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || w.llIIIllIIlIII(Players.getLocal().getWorldLocation().distanceTo(fC), lllIlIlIlI[1])) {
            AccBuilderTempleTrek.c = lllIlIlIII[lllIlIlIlI[81]];
            Movement.walkTo((WorldPoint)new WorldPoint(lllIlIlIlI[58], lllIlIlIlI[59], lllIlIlIlI[4]));

            Time.sleepTicks((int)lllIlIlIlI[3]);

        }
        int[] nArray = new int[lllIlIlIlI[3]];
        nArray[w.lllIlIlIlI[4]] = lllIlIlIlI[82];
        NPC var4 = NPCs.getNearest((int[])nArray);
        int[] nArray2 = new int[lllIlIlIlI[3]];
        nArray2[w.lllIlIlIlI[4]] = lllIlIlIlI[60];
        if (w.llIIIllIIIllI(Inventory.contains((int[])nArray2) ? 1 : 0)) {
            if (w.llIIIllIIIlIl(fc.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && w.llIIIllIIlIIl(var4) && w.llIIIllIIIlIl(fi.contains(var4.getWorldLocation()) ? 1 : 0)) {
                Time.sleepTicks((int)lllIlIlIlI[24]);

                while (w.llIIIllIIIlll(Players.getLocal().getWorldLocation().distanceTo(eZ), lllIlIlIlI[3]) && w.llIIIllIIIllI(AccBuilderTempleTrek.d ? 1 : 0)) {
                    AccBuilderTempleTrek.c = lllIlIlIII[lllIlIlIlI[83]];
                    Movement.walkTo((WorldPoint)eZ);

                    Time.sleepTicks((int)lllIlIlIlI[3]);

                    if (-1 <= 0) continue;
                    return;
                }
            }
            if (w.llIIIllIIIlIl(fd.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && w.llIIIllIIlIIl(var4) && w.llIIIllIIIlIl(ff.contains(var4.getWorldLocation()) ? 1 : 0)) {
                while (w.llIIIllIIIlll(Players.getLocal().getWorldLocation().distanceTo(fa), lllIlIlIlI[3]) && w.llIIIllIIIllI(AccBuilderTempleTrek.d ? 1 : 0)) {
                    AccBuilderTempleTrek.c = lllIlIlIII[lllIlIlIlI[84]];
                    Movement.walkTo((WorldPoint)fa);

                    Time.sleepTicks((int)lllIlIlIlI[3]);

                    if (-1 <= 0) continue;
                    return;
                }
            }
            if (w.llIIIllIIIlIl(fe.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && w.llIIIllIIlIIl(var4) && w.llIIIllIIIlIl(fj.contains(var4.getWorldLocation()) ? 1 : 0)) {
                Time.sleepTicks((int)lllIlIlIlI[18]);

                while (w.llIIIllIIIlll(Players.getLocal().getWorldLocation().distanceTo(fb), lllIlIlIlI[3]) && w.llIIIllIIIllI(AccBuilderTempleTrek.d ? 1 : 0)) {
                    AccBuilderTempleTrek.c = lllIlIlIII[lllIlIlIlI[85]];
                    Movement.walkTo((WorldPoint)fb);

                    Time.sleepTicks((int)lllIlIlIlI[3]);

                    if ((111 + 45 - 81 + 66 ^ 107 + 76 - 114 + 68) != 0) continue;
                    return;
                }
            }
            if (w.llIIIllIIIlIl(fh.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && w.llIIIllIIlIIl(var4) && w.llIIIllIIIlIl(fj.contains(var4.getWorldLocation()) ? 1 : 0)) {
                while (w.llIIIllIIIlll(Players.getLocal().getWorldLocation().distanceTo(fM), lllIlIlIlI[1]) && w.llIIIllIIIllI(AccBuilderTempleTrek.d ? 1 : 0)) {
                    AccBuilderTempleTrek.c = lllIlIlIII[lllIlIlIlI[86]];
                    Movement.walkTo((WorldPoint)fM);

                    Time.sleepTicks((int)lllIlIlIlI[3]);

                    return;
                }
            }
            if (w.llIIIllIIlIII(Players.getLocal().getWorldLocation().distanceTo(fM), lllIlIlIlI[12])) {
                AccBuilderTempleTrek.c = lllIlIlIII[lllIlIlIlI[87]];
                String[] stringArray = new String[lllIlIlIlI[3]];
                stringArray[w.lllIlIlIlI[4]] = lllIlIlIII[lllIlIlIlI[88]];
                TileObject var5 = TileObjects.getNearest((String[])stringArray);
                if (w.llIIIllIIlIIl(var5)) {
                    var5.interact(lllIlIlIII[lllIlIlIlI[89]]);
                    Time.sleepTicks((int)lllIlIlIlI[1]);

                    Widget var6 = Widgets.get((int)lllIlIlIlI[23], (int)lllIlIlIlI[3]);
                    if (w.llIIIllIIlIIl(var6)) {
                        var6.interact(lllIlIlIII[lllIlIlIlI[90]]);
                        var6.interact(lllIlIlIlI[4]);
                        var6.interact(lllIlIlIII[lllIlIlIlI[91]]);
                        Keyboard.type((String)lllIlIlIII[lllIlIlIlI[92]]);
                    }
                }
            }
        }
        int[] nArray3 = new int[lllIlIlIlI[3]];
        nArray3[w.lllIlIlIlI[4]] = lllIlIlIlI[60];
        if (w.llIIIllIIIlIl(Inventory.contains((int[])nArray3) ? 1 : 0)) {
            if (w.llIIIllIIlIII(Players.getLocal().getWorldLocation().distanceTo(fM), lllIlIlIlI[12])) {
                while (w.llIIIllIIIlll(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lllIlIlIlI[93], lllIlIlIlI[94], lllIlIlIlI[4])), lllIlIlIlI[3]) && w.llIIIllIIIllI(AccBuilderTempleTrek.d ? 1 : 0)) {
                    AccBuilderTempleTrek.c = lllIlIlIII[lllIlIlIlI[95]];
                    Movement.walkTo((WorldPoint)new WorldPoint(lllIlIlIlI[93], lllIlIlIlI[94], lllIlIlIlI[4]));

                    Time.sleepTicks((int)lllIlIlIlI[3]);

                    if (((0x42 ^ 0x69) & ~(0xAE ^ 0x85)) <= 2) continue;
                    return;
                }
            }
            if (w.llIIIllIIlIII(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lllIlIlIlI[93], lllIlIlIlI[94], lllIlIlIlI[4])), lllIlIlIlI[1]) && w.llIIIllIIlIIl(var4) && w.llIIIllIIIlIl(fi.contains(var4.getWorldLocation()) ? 1 : 0)) {
                while (w.llIIIllIIIlll(Players.getLocal().getWorldLocation().distanceTo(fa), lllIlIlIlI[3]) && w.llIIIllIIIllI(AccBuilderTempleTrek.d ? 1 : 0)) {
                    AccBuilderTempleTrek.c = lllIlIlIII[lllIlIlIlI[96]];
                    Movement.walkTo((WorldPoint)fa);

                    Time.sleepTicks((int)lllIlIlIlI[3]);

                    if (((70 + 136 - 117 + 50 ^ 87 + 56 - 103 + 103) & (0x5E ^ 0x24 ^ (2 ^ 0x7C) ^ -1)) >= ((96 + 58 - 94 + 73 ^ 133 + 99 - 75 + 2) & (0x99 ^ 0xB4 ^ (0xD ^ 0x3A) ^ -1))) continue;
                    return;
                }
            }
        }
    }

    private static boolean llIIIllIIIlIl(int n2) {
        return n2 != 0;
    }

    private static boolean llIIIllIIIllI(int n2) {
        return n2 == 0;
    }

    private static boolean llIIIllIIlIlI(Object object) {
        return object == null;
    }

    private static void ae() {
        d var7;
        block21: {
            block20: {
                Object var8;
                block19: {
                    block18: {
                        int[] nArray = new int[lllIlIlIlI[3]];
                        nArray[w.lllIlIlIlI[4]] = lllIlIlIlI[8];
                        if (w.llIIIllIIIllI(Bank.contains((int[])nArray) ? 1 : 0)) {
                            d d2 = new DHelper(lllIlIlIlI[8], lllIlIlIlI[109], lllIlIlIlI[110]);
                            bu.add(d2);

                        }
                        int[] nArray2 = new int[lllIlIlIlI[3]];
                        nArray2[w.lllIlIlIlI[4]] = lllIlIlIlI[8];
                        if (w.llIIIllIIIlIl(Bank.contains((int[])nArray2) ? 1 : 0)) {
                            int[] nArray3 = new int[lllIlIlIlI[3]];
                            nArray3[w.lllIlIlIlI[4]] = lllIlIlIlI[8];
                            if (w.llIIIllIIIIll(Bank.getFirst((int[])nArray3).getQuantity(), lllIlIlIlI[33])) {
                                var8 = new DHelper(lllIlIlIlI[8], lllIlIlIlI[54], lllIlIlIlI[110]);
                                bu.add((DHelper) ar8);

                            }
                        }
                        int[] nArray4 = new int[lllIlIlIlI[3]];
                        nArray4[w.lllIlIlIlI[4]] = lllIlIlIlI[9];
                        if (!w.llIIIllIIIlIl(Bank.contains((int[])nArray4) ? 1 : 0)) break block18;
                        int[] nArray5 = new int[lllIlIlIlI[3]];
                        nArray5[w.lllIlIlIlI[4]] = lllIlIlIlI[9];
                        if (!w.llIIIllIIIlIl(Bank.contains((int[])nArray5) ? 1 : 0)) break block19;
                        int[] nArray6 = new int[lllIlIlIlI[3]];
                        nArray6[w.lllIlIlIlI[4]] = lllIlIlIlI[9];
                        if (!w.llIIIllIIIIll(Bank.getFirst((int[])nArray6).getQuantity(), lllIlIlIlI[13])) break block19;
                    }
                    var8 = new DHelper(lllIlIlIlI[9], lllIlIlIlI[13], lllIlIlIlI[111]);
                    bu.add((DHelper) ar8);

                }
                if (w.llIIIllIIIllI(Bank.contains((Predicate)(var8 = item -> item.getName().toLowerCase().contains(lllIlIlIII[lllIlIlIlI[117]]))) ? 1 : 0)) {
                    var7 = new DHelper(lllIlIlIlI[112], lllIlIlIlI[31], lllIlIlIlI[113]);
                    bu.add(var7);

                }
                int[] nArray = new int[lllIlIlIlI[3]];
                nArray[w.lllIlIlIlI[4]] = lllIlIlIlI[105];
                if (w.llIIIllIIIllI(Bank.contains((int[])nArray) ? 1 : 0)) {
                    var7 = new DHelper(lllIlIlIlI[105], lllIlIlIlI[54], lllIlIlIlI[114]);
                    bu.add(var7);

                }
                int[] nArray7 = new int[lllIlIlIlI[3]];
                nArray7[w.lllIlIlIlI[4]] = lllIlIlIlI[10];
                if (!w.llIIIllIIIlIl(Bank.contains((int[])nArray7) ? 1 : 0)) break block20;
                int[] nArray8 = new int[lllIlIlIlI[3]];
                nArray8[w.lllIlIlIlI[4]] = lllIlIlIlI[10];
                if (!w.llIIIllIIIlIl(Bank.contains((int[])nArray8) ? 1 : 0)) break block21;
                int[] nArray9 = new int[lllIlIlIlI[3]];
                nArray9[w.lllIlIlIlI[4]] = lllIlIlIlI[10];
                if (!w.llIIIllIIIIll(Bank.getFirst((int[])nArray9).getQuantity(), lllIlIlIlI[22])) break block21;
            }
            var7 = new DHelper(lllIlIlIlI[10], lllIlIlIlI[33], lllIlIlIlI[114]);
            bu.add(var7);

        }
        int[] nArray = new int[lllIlIlIlI[3]];
        nArray[w.lllIlIlIlI[4]] = lllIlIlIlI[108];
        if (w.llIIIllIIIllI(Bank.contains((int[])nArray) ? 1 : 0)) {
            var7 = new DHelper(lllIlIlIlI[108], lllIlIlIlI[13], i.bp);
            bu.add(var7);

        }
        int[] nArray10 = new int[lllIlIlIlI[3]];
        nArray10[w.lllIlIlIlI[4]] = lllIlIlIlI[7];
        if (w.llIIIllIIIlIl(Bank.contains((int[])nArray10) ? 1 : 0)) {
            int[] nArray11 = new int[lllIlIlIlI[3]];
            nArray11[w.lllIlIlIlI[4]] = lllIlIlIlI[7];
            if (w.llIIIllIIIIll(Bank.getFirst((int[])nArray11).getQuantity(), lllIlIlIlI[101])) {
                var7 = new DHelper(lllIlIlIlI[7], lllIlIlIlI[115], lllIlIlIlI[18]);
                bu.add(var7);

            }
        }
        int[] nArray12 = new int[lllIlIlIlI[3]];
        nArray12[w.lllIlIlIlI[4]] = lllIlIlIlI[5];
        if (w.llIIIllIIIlIl(Bank.contains((int[])nArray12) ? 1 : 0)) {
            int[] nArray13 = new int[lllIlIlIlI[3]];
            nArray13[w.lllIlIlIlI[4]] = lllIlIlIlI[5];
            if (w.llIIIllIIIIll(Bank.getFirst((int[])nArray13).getQuantity(), lllIlIlIlI[101])) {
                var7 = new DHelper(lllIlIlIlI[5], lllIlIlIlI[115], lllIlIlIlI[18]);
                bu.add(var7);

            }
        }
        int[] nArray14 = new int[lllIlIlIlI[3]];
        nArray14[w.lllIlIlIlI[4]] = lllIlIlIlI[6];
        if (w.llIIIllIIIlIl(Bank.contains((int[])nArray14) ? 1 : 0)) {
            int[] nArray15 = new int[lllIlIlIlI[3]];
            nArray15[w.lllIlIlIlI[4]] = lllIlIlIlI[6];
            if (w.llIIIllIIIIll(Bank.getFirst((int[])nArray15).getQuantity(), lllIlIlIlI[101])) {
                var7 = new DHelper(lllIlIlIlI[6], lllIlIlIlI[115], lllIlIlIlI[18]);
                bu.add(var7);

            }
        }
    }

    private static boolean llIIIllIIlIII(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean llIIIllIIllII(int n2) {
        return n2 > 0;
    }

    private static void llIIIllIIIIIl() {
        lllIlIlIII = new String[lllIlIlIlI[174]];
        w.lllIlIlIII[w.lllIlIlIlI[4]] = "Buying items";
        w.lllIlIlIII[w.lllIlIlIlI[3]] = "Finished buying items, switching back to questing";
        w.lllIlIlIII[w.lllIlIlIlI[1]] = "Breaking tab";
        w.lllIlIlIII[w.lllIlIlIlI[12]] = "Break";
        w.lllIlIlIII[w.lllIlIlIlI[15]] = "Nav to start";
        w.lllIlIlIII[w.lllIlIlIlI[13]] = "Drink";
        w.lllIlIlIII[w.lllIlIlIlI[14]] = "Boy";
        w.lllIlIlIII[w.lllIlIlIlI[18]] = "Navigating to outside door";
        w.lllIlIlIII[w.lllIlIlIlI[20]] = "Drop";
        w.lllIlIlIII[w.lllIlIlIlI[21]] = "Stealing key";
        w.lllIlIlIII[w.lllIlIlIlI[22]] = "Look-under";
        w.lllIlIlIII[w.lllIlIlIlI[24]] = "Continue";
        w.lllIlIlIII[w.lllIlIlIlI[25]] = "null";
        w.lllIlIlIII[w.lllIlIlIlI[26]] = " ";
        w.lllIlIlIII[w.lllIlIlIlI[27]] = "Nav to magnet box";
        w.lllIlIlIII[w.lllIlIlIlI[28]] = "Nav to magnet box";
        w.lllIlIlIII[w.lllIlIlIlI[29]] = "ݵ7";
        w.lllIlIlIII[w.lllIlIlIlI[30]] = "Taking magnet";
        w.lllIlIlIII[w.lllIlIlIlI[31]] = "Drop";
        w.lllIlIlIII[w.lllIlIlIlI[32]] = "Open";
        w.lllIlIlIII[w.lllIlIlIlI[33]] = "Open";
        w.lllIlIlIII[w.lllIlIlIlI[34]] = "Search";
        w.lllIlIlIII[w.lllIlIlIlI[35]] = "Search";
        w.lllIlIlIII[w.lllIlIlIlI[36]] = "Continue";
        w.lllIlIlIII[w.lllIlIlIlI[37]] = "null";
        w.lllIlIlIII[w.lllIlIlIlI[38]] = " ";
        w.lllIlIlIII[w.lllIlIlIlI[40]] = "Nav to magnet box";
        w.lllIlIlIII[w.lllIlIlIlI[41]] = "Cupboard";
        w.lllIlIlIII[w.lllIlIlIlI[42]] = "Taking magnet";
        w.lllIlIlIII[w.lllIlIlIlI[43]] = "Open";
        w.lllIlIlIII[w.lllIlIlIlI[44]] = "Open";
        w.lllIlIlIII[w.lllIlIlIlI[45]] = "Search";
        w.lllIlIlIII[w.lllIlIlIlI[46]] = "Search";
        w.lllIlIlIII[w.lllIlIlIlI[47]] = "Continue";
        w.lllIlIlIII[w.lllIlIlIlI[48]] = "null";
        w.lllIlIlIII[w.lllIlIlIlI[49]] = " ";
        w.lllIlIlIII[w.lllIlIlIlI[50]] = "Nav to cheese spot";
        w.lllIlIlIII[w.lllIlIlIlI[51]] = "Mouse hole";
        w.lllIlIlIII[w.lllIlIlIlI[52]] = "Mouse";
        w.lllIlIlIII[w.lllIlIlIlI[53]] = "Using cheese";
        w.lllIlIlIII[w.lllIlIlIlI[54]] = "Cheese";
        w.lllIlIlIII[w.lllIlIlIlI[55]] = "Cheese";
        w.lllIlIlIII[w.lllIlIlIlI[56]] = "Handle mouse";
        w.lllIlIlIII[w.lllIlIlIlI[57]] = "Entering maze";
        w.lllIlIlIII[w.lllIlIlIlI[61]] = "Handling walking";
        w.lllIlIlIII[w.lllIlIlIlI[63]] = "Door";
        w.lllIlIlIII[w.lllIlIlIlI[64]] = "Entering shed";
        w.lllIlIlIII[w.lllIlIlIlI[65]] = "Nav to safe spot";
        w.lllIlIlIII[w.lllIlIlIlI[66]] = "Eat";
        w.lllIlIlIII[w.lllIlIlIlI[67]] = "Casting spell";
        w.lllIlIlIII[w.lllIlIlIlI[68]] = "Fire rune";
        w.lllIlIlIII[w.lllIlIlIlI[69]] = "Fire rune";
        w.lllIlIlIII[w.lllIlIlIlI[70]] = "Ball";
        w.lllIlIlIII[w.lllIlIlIlI[71]] = "Ball";
        w.lllIlIlIII[w.lllIlIlIlI[72]] = "Taking ball";
        w.lllIlIlIII[w.lllIlIlIlI[73]] = "Take";
        w.lllIlIlIII[w.lllIlIlIlI[74]] = "Ball";
        w.lllIlIlIII[w.lllIlIlIlI[75]] = "Breaking tab";
        w.lllIlIlIII[w.lllIlIlIlI[76]] = "Break";
        w.lllIlIlIII[w.lllIlIlIlI[77]] = "Nav to witches start";
        w.lllIlIlIII[w.lllIlIlIlI[78]] = "Turning in quest";
        w.lllIlIlIII[w.lllIlIlIlI[79]] = "Boy";
        w.lllIlIlIII[w.lllIlIlIlI[80]] = "Drink";
        w.lllIlIlIII[w.lllIlIlIlI[81]] = "Entering maze";
        w.lllIlIlIII[w.lllIlIlIlI[83]] = "Nav to first spot";
        w.lllIlIlIII[w.lllIlIlIlI[84]] = "Nav to second spot";
        w.lllIlIlIII[w.lllIlIlIlI[85]] = "Nav to third spot";
        w.lllIlIlIII[w.lllIlIlIlI[86]] = "Nav to fountain";
        w.lllIlIlIII[w.lllIlIlIlI[87]] = "Getting key";
        w.lllIlIlIII[w.lllIlIlIlI[88]] = "Fountain";
        w.lllIlIlIII[w.lllIlIlIlI[89]] = "Check";
        w.lllIlIlIII[w.lllIlIlIlI[90]] = "Continue";
        w.lllIlIlIII[w.lllIlIlIlI[91]] = "null";
        w.lllIlIlIII[w.lllIlIlIlI[92]] = " ";
        w.lllIlIlIII[w.lllIlIlIlI[95]] = "Nav back toward maze";
        w.lllIlIlIII[w.lllIlIlIlI[96]] = "Nav to shed spot";
        w.lllIlIlIII[w.lllIlIlIlI[97]] = "Navigating to bank";
        w.lllIlIlIII[w.lllIlIlIlI[98]] = "Opening bank";
        w.lllIlIlIII[w.lllIlIlIlI[100]] = "Handling banking";
        w.lllIlIlIII[w.lllIlIlIlI[102]] = "We are missing supplies, switching to BUYING";
        w.lllIlIlIII[w.lllIlIlIlI[16]] = "We are missing supplies, switching to BUYING";
        w.lllIlIlIII[w.lllIlIlIlI[103]] = "We are missing supplies, switching to BUYING";
        w.lllIlIlIII[w.lllIlIlIlI[104]] = "We are missing supplies, switching to BUYING";
        w.lllIlIlIII[w.lllIlIlIlI[106]] = "We are missing supplies, switching to BUYING";
        w.lllIlIlIII[w.lllIlIlIlI[116]] = "Witches House quest";
        w.lllIlIlIII[w.lllIlIlIlI[117]] = "ring of wealth (";
        w.lllIlIlIII[w.lllIlIlIlI[163]] = "Wizard Mizgog";
        w.lllIlIlIII[w.lllIlIlIlI[164]] = "Give me a quest please.";
        w.lllIlIlIII[w.lllIlIlIlI[165]] = "I'll try.";
        w.lllIlIlIII[w.lllIlIlIlI[166]] = "Actually, I know where to find this stuff.";
        w.lllIlIlIII[w.lllIlIlIlI[167]] = "Yes.";
        w.lllIlIlIII[w.lllIlIlIlI[168]] = "What's the matter?";
        w.lllIlIlIII[w.lllIlIlIlI[169]] = "Ok, I'll see what I can do.";
    }

    private static boolean llIIIllIIlIIl(Object object) {
        return object != null;
    }

    private static boolean llIIIllIIIIll(int n2, int n3) {
        return n2 < n3;
    }

    @Override
    public int T() {
        w.bF();
        return lllIlIlIlI[109];
    }
}

