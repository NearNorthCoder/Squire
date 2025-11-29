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
package e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u;

import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.G;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.S;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.a;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.ac;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.b;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.d;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.e;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.f;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.g;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.i;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.t;
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

public class w
implements S {
    private static final /* synthetic */ WorldPoint fD;
    private static final /* synthetic */ WorldArea fP;
    private static final /* synthetic */ WorldPoint fy;
    private static final /* synthetic */ int fU;
    public static final /* synthetic */ WorldArea fd;
    public static final /* synthetic */ WorldArea fi;
    public static /* synthetic */ int gb;
    public static final /* synthetic */ WorldPoint eZ;
    private static final /* synthetic */ WorldPoint fA;
    public static final /* synthetic */ WorldArea fe;
    private static final /* synthetic */ int fQ;
    private static final /* synthetic */ WorldPoint fz;
    static /* synthetic */ String gc;
    private static /* synthetic */ int[] gd;
    private static final /* synthetic */ WorldPoint fF;
    private static final /* synthetic */ WorldArea fO;
    private static final /* synthetic */ int ft;
    private static final /* synthetic */ int fv;
    private static /* synthetic */ int[] lllIlIlIlI;
    private static final /* synthetic */ WorldPoint fB;
    private static final /* synthetic */ int fq;
    static /* synthetic */ boolean cl;
    private static final /* synthetic */ WorldPoint fC;
    public static /* synthetic */ List<d> bu;
    private static final /* synthetic */ int fo;
    private static final /* synthetic */ WorldArea fN;
    public static final /* synthetic */ WorldArea fg;
    private static final /* synthetic */ WorldPoint fE;
    private static final /* synthetic */ WorldPoint fH;
    public static final /* synthetic */ WorldArea fj;
    private static final /* synthetic */ int fV;
    private static final /* synthetic */ int fw;
    private static final /* synthetic */ int fk;
    private static final /* synthetic */ int fl;
    private static final /* synthetic */ int fW;
    static /* synthetic */ String[] eR;
    private static final /* synthetic */ WorldPoint fJ;
    private static final /* synthetic */ WorldPoint fK;
    private static final /* synthetic */ WorldPoint fx;
    public static final /* synthetic */ WorldArea ff;
    private static final /* synthetic */ int fr;
    private static final /* synthetic */ int fX;
    private static final /* synthetic */ int fm;
    public static final /* synthetic */ WorldArea fh;
    private static final /* synthetic */ int fs;
    private static final /* synthetic */ WorldPoint fL;
    private static /* synthetic */ String[] lllIlIlIII;
    private static final /* synthetic */ WorldPoint fM;
    private static final /* synthetic */ int fu;
    private static final /* synthetic */ int fR;
    private static final /* synthetic */ int fn;
    static /* synthetic */ int ck;
    public static final /* synthetic */ WorldPoint fa;
    public static final /* synthetic */ WorldArea fc;
    private static final /* synthetic */ int fY;
    private static final /* synthetic */ int fS;
    private static final /* synthetic */ WorldPoint fI;
    public static final /* synthetic */ WorldPoint fb;
    public static /* synthetic */ int ga;
    public static /* synthetic */ boolean bs;
    private static final /* synthetic */ int fT;
    private static final /* synthetic */ WorldPoint fG;
    private static final /* synthetic */ int fp;
    private static final /* synthetic */ int fZ;

    private static String llIIIlIllllIl(String var20, String var24) {
        var20 = new String(Base64.getDecoder().decode(var20.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var15 = new StringBuilder();
        char[] var16 = var24.toCharArray();
        int var22 = lllIlIlIlI[4];
        char[] var17 = var20.toCharArray();
        int var4 = var17.length;
        int var26 = lllIlIlIlI[4];
        while (w.llIIIllIIIIll(var26, var4)) {
            char var2 = var17[var26];
            var15.append((char)(var2 ^ var16[var22 % var16.length]));
            0;
            ++var22;
            ++var26;
            0;
            if ((163 + 54 - 156 + 128 ^ 97 + 183 - 189 + 94) != 0) continue;
            return null;
        }
        return String.valueOf(var15);
    }

    public static void bF() {
        TileObject lllllllllllllllllIllIllIIlIIIIll2;
        block91: {
            block93: {
                block92: {
                    block89: {
                        block90: {
                            Widget var9;
                            if (w.llIIIllIIIIll(e.j(lllIlIlIlI[0]), lllIlIlIlI[1])) {
                                try {
                                    G.ct();
                                    0;
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
                                        0;
                                        0;
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
                                            0;
                                        }
                                    }
                                    if (w.llIIIllIIIIll(Players.getLocal().getWorldLocation().distanceTo(fy), lllIlIlIlI[11]) && w.llIIIllIIIlll(Players.getLocal().getWorldLocation().distanceTo(fy), lllIlIlIlI[14])) {
                                        AccBuilderTempleTrek.c = lllIlIlIII[lllIlIlIlI[15]];
                                        if (w.llIIIllIIIlIl(Inventory.contains((int[])f.aU) ? 1 : 0) && w.llIIIllIIIIll(Movement.getRunEnergy(), lllIlIlIlI[16])) {
                                            Inventory.getFirst((int[])f.aU).interact(lllIlIlIII[lllIlIlIlI[13]]);
                                            Time.sleepTicks((int)lllIlIlIlI[3]);
                                            0;
                                        }
                                        Movement.walkTo((WorldPoint)fy);
                                        0;
                                        Time.sleepTicks((int)lllIlIlIlI[3]);
                                        0;
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
                                        0;
                                        Time.sleepTicks((int)lllIlIlIlI[3]);
                                        0;
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
                                            0;
                                        }
                                        if (w.llIIIllIIIllI(Inventory.isFull() ? 1 : 0)) {
                                            if (w.llIIIllIIlIIl(lllllllllllllllllIllIllIIlIIIIll2) && w.llIIIllIIIllI(Dialog.isOpen() ? 1 : 0)) {
                                                AccBuilderTempleTrek.c = lllIlIlIII[lllIlIlIlI[21]];
                                                lllllllllllllllllIllIllIIlIIIIll2.interact(lllIlIlIII[lllIlIlIlI[22]]);
                                                Dialog.continueSpace();
                                            }
                                            if (w.llIIIllIIlIIl(var9 = Widgets.get((int)lllIlIlIlI[23], (int)lllIlIlIlI[3]))) {
                                                var9.interact(lllIlIlIII[lllIlIlIlI[24]]);
                                                var9.interact(lllIlIlIlI[4]);
                                                var9.interact(lllIlIlIII[lllIlIlIlI[25]]);
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
                                        0;
                                        Time.sleepTicks((int)lllIlIlIlI[3]);
                                        0;
                                    }
                                }
                                if (w.llIIIllIIIlIl(fO.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    AccBuilderTempleTrek.c = lllIlIlIII[lllIlIlIlI[28]];
                                    if (w.llIIIllIIIlll(Players.getLocal().getWorldLocation().distanceTo(fF), lllIlIlIlI[3])) {
                                        Movement.walkTo((WorldPoint)fF);
                                        0;
                                        Time.sleepTicks((int)lllIlIlIlI[3]);
                                        0;
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
                                            0;
                                        }
                                        if (w.llIIIllIIlIIl(lllllllllllllllllIllIllIIlIIIIll2)) {
                                            String[] stringArray2 = new String[lllIlIlIlI[3]];
                                            stringArray2[w.lllIlIlIlI[4]] = lllIlIlIII[lllIlIlIlI[32]];
                                            if (w.llIIIllIIIlIl(lllllllllllllllllIllIllIIlIIIIll2.hasAction(stringArray2) ? 1 : 0)) {
                                                lllllllllllllllllIllIllIIlIIIIll2.interact(lllIlIlIII[lllIlIlIlI[33]]);
                                                Time.sleepTicks((int)lllIlIlIlI[1]);
                                                0;
                                            }
                                            String[] stringArray3 = new String[lllIlIlIlI[3]];
                                            stringArray3[w.lllIlIlIlI[4]] = lllIlIlIII[lllIlIlIlI[34]];
                                            if (w.llIIIllIIIlIl(lllllllllllllllllIllIllIIlIIIIll2.hasAction(stringArray3) ? 1 : 0)) {
                                                lllllllllllllllllIllIllIIlIIIIll2.interact(lllIlIlIII[lllIlIlIlI[35]]);
                                                Time.sleepTicks((int)lllIlIlIlI[1]);
                                                0;
                                                var9 = Widgets.get((int)lllIlIlIlI[23], (int)lllIlIlIlI[3]);
                                                if (w.llIIIllIIlIIl(var9)) {
                                                    var9.interact(lllIlIlIII[lllIlIlIlI[36]]);
                                                    var9.interact(lllIlIlIlI[4]);
                                                    var9.interact(lllIlIlIII[lllIlIlIlI[37]]);
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
                                        0;
                                        Time.sleepTicks((int)lllIlIlIlI[3]);
                                        0;
                                        0;
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
                                        0;
                                        Time.sleepTicks((int)lllIlIlIlI[3]);
                                        0;
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
                                                0;
                                            }
                                            String[] stringArray5 = new String[lllIlIlIlI[3]];
                                            stringArray5[w.lllIlIlIlI[4]] = lllIlIlIII[lllIlIlIlI[45]];
                                            if (w.llIIIllIIIlIl(lllllllllllllllllIllIllIIlIIIIll2.hasAction(stringArray5) ? 1 : 0)) {
                                                lllllllllllllllllIllIllIIlIIIIll2.interact(lllIlIlIII[lllIlIlIlI[46]]);
                                                Time.sleepTicks((int)lllIlIlIlI[1]);
                                                0;
                                                var9 = Widgets.get((int)lllIlIlIlI[23], (int)lllIlIlIlI[3]);
                                                if (w.llIIIllIIlIIl(var9)) {
                                                    var9.interact(lllIlIlIII[lllIlIlIlI[47]]);
                                                    var9.interact(lllIlIlIlI[4]);
                                                    var9.interact(lllIlIlIII[lllIlIlIlI[48]]);
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
                                    0;
                                    Time.sleepTicks((int)lllIlIlIlI[3]);
                                    0;
                                }
                                if (w.llIIIllIIlIII(Players.getLocal().getWorldLocation().distanceTo(fC), lllIlIlIlI[1])) {
                                    String[] stringArray = new String[lllIlIlIlI[3]];
                                    stringArray[w.lllIlIlIlI[4]] = lllIlIlIII[lllIlIlIlI[51]];
                                    lllllllllllllllllIllIllIIlIIIIll2 = TileObjects.getNearest((String[])stringArray);
                                    String[] stringArray6 = new String[lllIlIlIlI[3]];
                                    stringArray6[w.lllIlIlIlI[4]] = lllIlIlIII[lllIlIlIlI[52]];
                                    var9 = NPCs.getNearest((String[])stringArray6);
                                    if (w.llIIIllIIlIIl(lllllllllllllllllIllIllIIlIIIIll2) && w.llIIIllIIlIlI(var9)) {
                                        AccBuilderTempleTrek.c = lllIlIlIII[lllIlIlIlI[53]];
                                        String[] stringArray7 = new String[lllIlIlIlI[3]];
                                        stringArray7[w.lllIlIlIlI[4]] = lllIlIlIII[lllIlIlIlI[54]];
                                        if (w.llIIIllIIIlIl(Inventory.contains((String[])stringArray7) ? 1 : 0)) {
                                            String[] stringArray8 = new String[lllIlIlIlI[3]];
                                            stringArray8[w.lllIlIlIlI[4]] = lllIlIlIII[lllIlIlIlI[55]];
                                            Inventory.getFirst((String[])stringArray8).useOn(lllllllllllllllllIllIllIIlIIIIll2);
                                        }
                                        Time.sleepTicks((int)lllIlIlIlI[3]);
                                        0;
                                    }
                                    if (w.llIIIllIIlIIl(var9)) {
                                        AccBuilderTempleTrek.c = lllIlIlIII[lllIlIlIlI[56]];
                                        int[] nArray11 = new int[lllIlIlIlI[3]];
                                        nArray11[w.lllIlIlIlI[4]] = lllIlIlIlI[39];
                                        if (w.llIIIllIIIlIl(Inventory.contains((int[])nArray11) ? 1 : 0)) {
                                            int[] nArray12 = new int[lllIlIlIlI[3]];
                                            nArray12[w.lllIlIlIlI[4]] = lllIlIlIlI[39];
                                            Inventory.getFirst((int[])nArray12).useOn((Actor)var9);
                                        }
                                        Time.sleepTicks((int)lllIlIlIlI[3]);
                                        0;
                                    }
                                }
                            }
                            if (w.llIIIllIIIlIl(fN.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && w.llIIIllIIIlII(e.j(lllIlIlIlI[2]), lllIlIlIlI[12])) {
                                AccBuilderTempleTrek.c = lllIlIlIII[lllIlIlIlI[57]];
                                Movement.walkTo((WorldPoint)new WorldPoint(lllIlIlIlI[58], lllIlIlIlI[59], lllIlIlIlI[4]));
                                0;
                                Time.sleepTicks((int)lllIlIlIlI[3]);
                                0;
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
                                    0;
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
                        0;
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
                        0;
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
                0;
            }
            if (w.llIIIllIIlIll(Skills.getLevel((Skill)Skill.MAGIC), lllIlIlIlI[26])) {
                String[] stringArray = new String[lllIlIlIlI[3]];
                stringArray[w.lllIlIlIlI[4]] = lllIlIlIII[lllIlIlIlI[69]];
                if (w.llIIIllIIIlIl(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    Magic.cast((Spell)SpellBook.Standard.FIRE_STRIKE, (NPC)lllllllllllllllllIllIllIIlIIIIll2);
                    Time.sleepTicks((int)lllIlIlIlI[3]);
                    0;
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
                    0;
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
                        0;
                    }
                }
                if (w.llIIIllIIIllI(fP.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && w.llIIIllIIIlll(Players.getLocal().getWorldLocation().distanceTo(fy), lllIlIlIlI[15])) {
                    AccBuilderTempleTrek.c = lllIlIlIII[lllIlIlIlI[77]];
                    Movement.walkTo((WorldPoint)fy);
                    0;
                    Time.sleepTicks((int)lllIlIlIlI[3]);
                    0;
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
            0;
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

    private static String llIIIlIlllIll(String var5, String var3) {
        try {
            SecretKeySpec var13 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var3.getBytes(StandardCharsets.UTF_8)), lllIlIlIlI[20]), "DES");
            Cipher var6 = Cipher.getInstance("DES");
            var6.init(lllIlIlIlI[1], var13);
            return new String(var6.doFinal(Base64.getDecoder().decode(var5.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var11) {
            var11.printStackTrace();
            return null;
        }
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
                            void var1;
                            BankLocation bankLocation = BankLocation.getNearest();
                            if (w.llIIIllIIlIIl(bankLocation) && w.llIIIllIIIllI(bankLocation.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                AccBuilderTempleTrek.c = lllIlIlIII[lllIlIlIlI[97]];
                                a.a(bankLocation);
                            }
                            if (!w.llIIIllIIlIIl(var1) || !w.llIIIllIIIlIl(var1.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block30;
                            if (w.llIIIllIIIllI(Bank.isOpen() ? 1 : 0)) {
                                AccBuilderTempleTrek.c = lllIlIlIII[lllIlIlIlI[98]];
                                a.a();
                                Time.sleepUntil(() -> Bank.isOpen(), (int)lllIlIlIlI[99]);
                                0;
                            }
                            if (!w.llIIIllIIIlIl(Bank.isOpen() ? 1 : 0)) break block30;
                            AccBuilderTempleTrek.c = lllIlIlIII[lllIlIlIlI[100]];
                            if (w.llIIIllIIllII(Inventory.getAll().size())) {
                                Bank.depositInventory();
                                Time.sleepTicks((int)lllIlIlIlI[12]);
                                0;
                            }
                            if (w.llIIIllIIllII(Equipment.getAll().size())) {
                                Bank.depositEquipment();
                                Time.sleepTicks((int)lllIlIlIlI[1]);
                                0;
                            }
                            while (w.llIIIllIIIllI(t.bl() ? 1 : 0) && w.llIIIllIIIllI(AccBuilderTempleTrek.d ? 1 : 0)) {
                                t.bj();
                                Time.sleepTicks((int)lllIlIlIlI[3]);
                                0;
                                0;
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
                0;
            }
            int[] nArray11 = new int[lllIlIlIlI[3]];
            nArray11[w.lllIlIlIlI[4]] = lllIlIlIlI[10];
            if (w.llIIIllIIIlIl(Bank.contains((int[])nArray11) ? 1 : 0)) {
                int[] nArray12 = new int[lllIlIlIlI[3]];
                nArray12[w.lllIlIlIlI[4]] = lllIlIlIlI[10];
                if (w.llIIIllIIIIll(Inventory.getCount((int[])nArray12), lllIlIlIlI[3])) {
                    Bank.withdraw((int)lllIlIlIlI[10], (int)lllIlIlIlI[13], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                    Time.sleepTicks((int)lllIlIlIlI[3]);
                    0;
                    Time.sleepUntil(() -> {
                        boolean bl;
                        int[] nArray = new int[lllIlIlIlI[3]];
                        nArray[w.lllIlIlIlI[4]] = lllIlIlIlI[10];
                        if (w.llIIIllIIllII(Inventory.getCount((int[])nArray))) {
                            bl = lllIlIlIlI[3];
                            0;
                            if (-1 == ((0xC1 ^ 0xAA ^ (0xC9 ^ 0xAC)) & (15 + 51 - -6 + 66 ^ 103 + 119 - 115 + 25 ^ -1))) {
                                return ((0x8E ^ 0xB5 ^ (0x99 ^ 0xAA)) & (0xBD ^ 0x80 ^ (0x98 ^ 0xAD) ^ -1)) != 0;
                            }
                        } else {
                            bl = lllIlIlIlI[4];
                        }
                        return bl;
                    }, (int)lllIlIlIlI[99]);
                    0;
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
                    0;
                    Time.sleepUntil(() -> {
                        boolean bl;
                        int[] nArray = new int[lllIlIlIlI[3]];
                        nArray[w.lllIlIlIlI[4]] = lllIlIlIlI[9];
                        if (w.llIIIllIIllII(Inventory.getCount((int[])nArray))) {
                            bl = lllIlIlIlI[3];
                            0;
                            if (-1 < -1) {
                                return false;
                            }
                        } else {
                            bl = lllIlIlIlI[4];
                        }
                        return bl;
                    }, (int)lllIlIlIlI[99]);
                    0;
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
                    0;
                    Time.sleepUntil(() -> {
                        boolean bl;
                        int[] nArray = new int[lllIlIlIlI[3]];
                        nArray[w.lllIlIlIlI[4]] = lllIlIlIlI[7];
                        if (w.llIIIllIIllII(Inventory.getCount((int[])nArray))) {
                            bl = lllIlIlIlI[3];
                            0;
                            if (2 <= 1) {
                                return false;
                            }
                        } else {
                            bl = lllIlIlIlI[4];
                        }
                        return bl;
                    }, (int)lllIlIlIlI[99]);
                    0;
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
                    0;
                    Time.sleepUntil(() -> {
                        boolean bl;
                        int[] nArray = new int[lllIlIlIlI[3]];
                        nArray[w.lllIlIlIlI[4]] = lllIlIlIlI[5];
                        if (w.llIIIllIIllII(Inventory.getCount((int[])nArray))) {
                            bl = lllIlIlIlI[3];
                            0;
                            if (1 != 1) {
                                return false;
                            }
                        } else {
                            bl = lllIlIlIlI[4];
                        }
                        return bl;
                    }, (int)lllIlIlIlI[99]);
                    0;
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
                    0;
                    Time.sleepUntil(() -> {
                        boolean bl;
                        int[] nArray = new int[lllIlIlIlI[3]];
                        nArray[w.lllIlIlIlI[4]] = lllIlIlIlI[6];
                        if (w.llIIIllIIllII(Inventory.getCount((int[])nArray))) {
                            bl = lllIlIlIlI[3];
                            0;
                            if ((44 + 31 - -18 + 73 ^ 36 + 134 - 74 + 66) < 0) {
                                return ((0x6A ^ 0x1D ^ (0x2D ^ 0x47)) & (0x3A ^ 0x18 ^ (0x31 ^ 0xE) ^ -1)) != 0;
                            }
                        } else {
                            bl = lllIlIlIlI[4];
                        }
                        return bl;
                    }, (int)lllIlIlIlI[99]);
                    0;
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
                    0;
                    Time.sleepUntil(() -> {
                        int[] nArray = new int[lllIlIlIlI[3]];
                        nArray[w.lllIlIlIlI[4]] = lllIlIlIlI[108];
                        return Inventory.contains((int[])nArray);
                    }, (int)lllIlIlIlI[99]);
                    0;
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
                    0;
                    Time.sleepUntil(() -> {
                        boolean bl;
                        int[] nArray = new int[lllIlIlIlI[3]];
                        nArray[w.lllIlIlIlI[4]] = lllIlIlIlI[8];
                        if (w.llIIIllIIllII(Inventory.getCount((int[])nArray))) {
                            bl = lllIlIlIlI[3];
                            0;
                            if (2 > (0x6C ^ 0x68)) {
                                return false;
                            }
                        } else {
                            bl = lllIlIlIlI[4];
                        }
                        return bl;
                    }, (int)lllIlIlIlI[99]);
                    0;
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
            0;
        }
        if (w.llIIIllIIIllI(Movement.isRunEnabled() ? 1 : 0)) {
            Movement.toggleRun();
        }
        if (!w.llIIIllIIIllI(fN.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || w.llIIIllIIlIII(Players.getLocal().getWorldLocation().distanceTo(fC), lllIlIlIlI[1])) {
            AccBuilderTempleTrek.c = lllIlIlIII[lllIlIlIlI[81]];
            Movement.walkTo((WorldPoint)new WorldPoint(lllIlIlIlI[58], lllIlIlIlI[59], lllIlIlIlI[4]));
            0;
            Time.sleepTicks((int)lllIlIlIlI[3]);
            0;
        }
        int[] nArray = new int[lllIlIlIlI[3]];
        nArray[w.lllIlIlIlI[4]] = lllIlIlIlI[82];
        NPC var10 = NPCs.getNearest((int[])nArray);
        int[] nArray2 = new int[lllIlIlIlI[3]];
        nArray2[w.lllIlIlIlI[4]] = lllIlIlIlI[60];
        if (w.llIIIllIIIllI(Inventory.contains((int[])nArray2) ? 1 : 0)) {
            if (w.llIIIllIIIlIl(fc.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && w.llIIIllIIlIIl(var10) && w.llIIIllIIIlIl(fi.contains(var10.getWorldLocation()) ? 1 : 0)) {
                Time.sleepTicks((int)lllIlIlIlI[24]);
                0;
                while (w.llIIIllIIIlll(Players.getLocal().getWorldLocation().distanceTo(eZ), lllIlIlIlI[3]) && w.llIIIllIIIllI(AccBuilderTempleTrek.d ? 1 : 0)) {
                    AccBuilderTempleTrek.c = lllIlIlIII[lllIlIlIlI[83]];
                    Movement.walkTo((WorldPoint)eZ);
                    0;
                    Time.sleepTicks((int)lllIlIlIlI[3]);
                    0;
                    0;
                    if (-1 <= 0) continue;
                    return;
                }
            }
            if (w.llIIIllIIIlIl(fd.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && w.llIIIllIIlIIl(var10) && w.llIIIllIIIlIl(ff.contains(var10.getWorldLocation()) ? 1 : 0)) {
                while (w.llIIIllIIIlll(Players.getLocal().getWorldLocation().distanceTo(fa), lllIlIlIlI[3]) && w.llIIIllIIIllI(AccBuilderTempleTrek.d ? 1 : 0)) {
                    AccBuilderTempleTrek.c = lllIlIlIII[lllIlIlIlI[84]];
                    Movement.walkTo((WorldPoint)fa);
                    0;
                    Time.sleepTicks((int)lllIlIlIlI[3]);
                    0;
                    0;
                    if (-1 <= 0) continue;
                    return;
                }
            }
            if (w.llIIIllIIIlIl(fe.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && w.llIIIllIIlIIl(var10) && w.llIIIllIIIlIl(fj.contains(var10.getWorldLocation()) ? 1 : 0)) {
                Time.sleepTicks((int)lllIlIlIlI[18]);
                0;
                while (w.llIIIllIIIlll(Players.getLocal().getWorldLocation().distanceTo(fb), lllIlIlIlI[3]) && w.llIIIllIIIllI(AccBuilderTempleTrek.d ? 1 : 0)) {
                    AccBuilderTempleTrek.c = lllIlIlIII[lllIlIlIlI[85]];
                    Movement.walkTo((WorldPoint)fb);
                    0;
                    Time.sleepTicks((int)lllIlIlIlI[3]);
                    0;
                    0;
                    if ((111 + 45 - 81 + 66 ^ 107 + 76 - 114 + 68) != 0) continue;
                    return;
                }
            }
            if (w.llIIIllIIIlIl(fh.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && w.llIIIllIIlIIl(var10) && w.llIIIllIIIlIl(fj.contains(var10.getWorldLocation()) ? 1 : 0)) {
                while (w.llIIIllIIIlll(Players.getLocal().getWorldLocation().distanceTo(fM), lllIlIlIlI[1]) && w.llIIIllIIIllI(AccBuilderTempleTrek.d ? 1 : 0)) {
                    AccBuilderTempleTrek.c = lllIlIlIII[lllIlIlIlI[86]];
                    Movement.walkTo((WorldPoint)fM);
                    0;
                    Time.sleepTicks((int)lllIlIlIlI[3]);
                    0;
                    0;
                    
                    return;
                }
            }
            if (w.llIIIllIIlIII(Players.getLocal().getWorldLocation().distanceTo(fM), lllIlIlIlI[12])) {
                AccBuilderTempleTrek.c = lllIlIlIII[lllIlIlIlI[87]];
                String[] stringArray = new String[lllIlIlIlI[3]];
                stringArray[w.lllIlIlIlI[4]] = lllIlIlIII[lllIlIlIlI[88]];
                TileObject var19 = TileObjects.getNearest((String[])stringArray);
                if (w.llIIIllIIlIIl(var19)) {
                    var19.interact(lllIlIlIII[lllIlIlIlI[89]]);
                    Time.sleepTicks((int)lllIlIlIlI[1]);
                    0;
                    Widget var7 = Widgets.get((int)lllIlIlIlI[23], (int)lllIlIlIlI[3]);
                    if (w.llIIIllIIlIIl(var7)) {
                        var7.interact(lllIlIlIII[lllIlIlIlI[90]]);
                        var7.interact(lllIlIlIlI[4]);
                        var7.interact(lllIlIlIII[lllIlIlIlI[91]]);
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
                    0;
                    Time.sleepTicks((int)lllIlIlIlI[3]);
                    0;
                    0;
                    if (((0x42 ^ 0x69) & ~(0xAE ^ 0x85)) <= 2) continue;
                    return;
                }
            }
            if (w.llIIIllIIlIII(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lllIlIlIlI[93], lllIlIlIlI[94], lllIlIlIlI[4])), lllIlIlIlI[1]) && w.llIIIllIIlIIl(var10) && w.llIIIllIIIlIl(fi.contains(var10.getWorldLocation()) ? 1 : 0)) {
                while (w.llIIIllIIIlll(Players.getLocal().getWorldLocation().distanceTo(fa), lllIlIlIlI[3]) && w.llIIIllIIIllI(AccBuilderTempleTrek.d ? 1 : 0)) {
                    AccBuilderTempleTrek.c = lllIlIlIII[lllIlIlIlI[96]];
                    Movement.walkTo((WorldPoint)fa);
                    0;
                    Time.sleepTicks((int)lllIlIlIlI[3]);
                    0;
                    0;
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

    private static String llIIIlIllllII(String var18, String var23) {
        try {
            SecretKeySpec var8 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var23.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var21 = Cipher.getInstance("Blowfish");
            var21.init(lllIlIlIlI[1], var8);
            return new String(var21.doFinal(Base64.getDecoder().decode(var18.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var14) {
            var14.printStackTrace();
            return null;
        }
    }

    private static void ae() {
        d var25;
        block21: {
            block20: {
                Object var12;
                block19: {
                    block18: {
                        int[] nArray = new int[lllIlIlIlI[3]];
                        nArray[w.lllIlIlIlI[4]] = lllIlIlIlI[8];
                        if (w.llIIIllIIIllI(Bank.contains((int[])nArray) ? 1 : 0)) {
                            d d2 = new d(lllIlIlIlI[8], lllIlIlIlI[109], lllIlIlIlI[110]);
                            bu.add(d2);
                            0;
                        }
                        int[] nArray2 = new int[lllIlIlIlI[3]];
                        nArray2[w.lllIlIlIlI[4]] = lllIlIlIlI[8];
                        if (w.llIIIllIIIlIl(Bank.contains((int[])nArray2) ? 1 : 0)) {
                            int[] nArray3 = new int[lllIlIlIlI[3]];
                            nArray3[w.lllIlIlIlI[4]] = lllIlIlIlI[8];
                            if (w.llIIIllIIIIll(Bank.getFirst((int[])nArray3).getQuantity(), lllIlIlIlI[33])) {
                                var12 = new d(lllIlIlIlI[8], lllIlIlIlI[54], lllIlIlIlI[110]);
                                bu.add((d)var12);
                                0;
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
                    var12 = new d(lllIlIlIlI[9], lllIlIlIlI[13], lllIlIlIlI[111]);
                    bu.add((d)var12);
                    0;
                }
                if (w.llIIIllIIIllI(Bank.contains((Predicate)(var12 = item -> item.getName().toLowerCase().contains(lllIlIlIII[lllIlIlIlI[117]]))) ? 1 : 0)) {
                    var25 = new d(lllIlIlIlI[112], lllIlIlIlI[31], lllIlIlIlI[113]);
                    bu.add(var25);
                    0;
                }
                int[] nArray = new int[lllIlIlIlI[3]];
                nArray[w.lllIlIlIlI[4]] = lllIlIlIlI[105];
                if (w.llIIIllIIIllI(Bank.contains((int[])nArray) ? 1 : 0)) {
                    var25 = new d(lllIlIlIlI[105], lllIlIlIlI[54], lllIlIlIlI[114]);
                    bu.add(var25);
                    0;
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
            var25 = new d(lllIlIlIlI[10], lllIlIlIlI[33], lllIlIlIlI[114]);
            bu.add(var25);
            0;
        }
        int[] nArray = new int[lllIlIlIlI[3]];
        nArray[w.lllIlIlIlI[4]] = lllIlIlIlI[108];
        if (w.llIIIllIIIllI(Bank.contains((int[])nArray) ? 1 : 0)) {
            var25 = new d(lllIlIlIlI[108], lllIlIlIlI[13], i.bp);
            bu.add(var25);
            0;
        }
        int[] nArray10 = new int[lllIlIlIlI[3]];
        nArray10[w.lllIlIlIlI[4]] = lllIlIlIlI[7];
        if (w.llIIIllIIIlIl(Bank.contains((int[])nArray10) ? 1 : 0)) {
            int[] nArray11 = new int[lllIlIlIlI[3]];
            nArray11[w.lllIlIlIlI[4]] = lllIlIlIlI[7];
            if (w.llIIIllIIIIll(Bank.getFirst((int[])nArray11).getQuantity(), lllIlIlIlI[101])) {
                var25 = new d(lllIlIlIlI[7], lllIlIlIlI[115], lllIlIlIlI[18]);
                bu.add(var25);
                0;
            }
        }
        int[] nArray12 = new int[lllIlIlIlI[3]];
        nArray12[w.lllIlIlIlI[4]] = lllIlIlIlI[5];
        if (w.llIIIllIIIlIl(Bank.contains((int[])nArray12) ? 1 : 0)) {
            int[] nArray13 = new int[lllIlIlIlI[3]];
            nArray13[w.lllIlIlIlI[4]] = lllIlIlIlI[5];
            if (w.llIIIllIIIIll(Bank.getFirst((int[])nArray13).getQuantity(), lllIlIlIlI[101])) {
                var25 = new d(lllIlIlIlI[5], lllIlIlIlI[115], lllIlIlIlI[18]);
                bu.add(var25);
                0;
            }
        }
        int[] nArray14 = new int[lllIlIlIlI[3]];
        nArray14[w.lllIlIlIlI[4]] = lllIlIlIlI[6];
        if (w.llIIIllIIIlIl(Bank.contains((int[])nArray14) ? 1 : 0)) {
            int[] nArray15 = new int[lllIlIlIlI[3]];
            nArray15[w.lllIlIlIlI[4]] = lllIlIlIlI[6];
            if (w.llIIIllIIIIll(Bank.getFirst((int[])nArray15).getQuantity(), lllIlIlIlI[101])) {
                var25 = new d(lllIlIlIlI[6], lllIlIlIlI[115], lllIlIlIlI[18]);
                bu.add(var25);
                0;
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
        w.lllIlIlIII[w.lllIlIlIlI[4]] = w."Buying items";
        w.lllIlIlIII[w.lllIlIlIlI[3]] = w."Finished buying items, switching back to questing";
        w.lllIlIlIII[w.lllIlIlIlI[1]] = w."Breaking tab";
        w.lllIlIlIII[w.lllIlIlIlI[12]] = w."Break";
        w.lllIlIlIII[w.lllIlIlIlI[15]] = w."Nav to start";
        w.lllIlIlIII[w.lllIlIlIlI[13]] = w."Drink";
        w.lllIlIlIII[w.lllIlIlIlI[14]] = w."Boy";
        w.lllIlIlIII[w.lllIlIlIlI[18]] = w."Navigating to outside door";
        w.lllIlIlIII[w.lllIlIlIlI[20]] = w."Drop";
        w.lllIlIlIII[w.lllIlIlIlI[21]] = w."Stealing key";
        w.lllIlIlIII[w.lllIlIlIlI[22]] = w."Look-under";
        w.lllIlIlIII[w.lllIlIlIlI[24]] = w."Continue";
        w.lllIlIlIII[w.lllIlIlIlI[25]] = w."null";
        w.lllIlIlIII[w.lllIlIlIlI[26]] = w." ";
        w.lllIlIlIII[w.lllIlIlIlI[27]] = w."Nav to magnet box";
        w.lllIlIlIII[w.lllIlIlIlI[28]] = w."Nav to magnet box";
        w.lllIlIlIII[w.lllIlIlIlI[29]] = w."Cupboard";
        w.lllIlIlIII[w.lllIlIlIlI[30]] = w."Taking magnet";
        w.lllIlIlIII[w.lllIlIlIlI[31]] = w."Drop";
        w.lllIlIlIII[w.lllIlIlIlI[32]] = w."Open";
        w.lllIlIlIII[w.lllIlIlIlI[33]] = w."Open";
        w.lllIlIlIII[w.lllIlIlIlI[34]] = w."Search";
        w.lllIlIlIII[w.lllIlIlIlI[35]] = w."Search";
        w.lllIlIlIII[w.lllIlIlIlI[36]] = w."Continue";
        w.lllIlIlIII[w.lllIlIlIlI[37]] = w."null";
        w.lllIlIlIII[w.lllIlIlIlI[38]] = w." ";
        w.lllIlIlIII[w.lllIlIlIlI[40]] = w."Nav to magnet box";
        w.lllIlIlIII[w.lllIlIlIlI[41]] = w."Cupboard";
        w.lllIlIlIII[w.lllIlIlIlI[42]] = w."Taking magnet";
        w.lllIlIlIII[w.lllIlIlIlI[43]] = w."Open";
        w.lllIlIlIII[w.lllIlIlIlI[44]] = w."Open";
        w.lllIlIlIII[w.lllIlIlIlI[45]] = w."Search";
        w.lllIlIlIII[w.lllIlIlIlI[46]] = w."Search";
        w.lllIlIlIII[w.lllIlIlIlI[47]] = w."Continue";
        w.lllIlIlIII[w.lllIlIlIlI[48]] = w."null";
        w.lllIlIlIII[w.lllIlIlIlI[49]] = w." ";
        w.lllIlIlIII[w.lllIlIlIlI[50]] = w."Nav to cheese spot";
        w.lllIlIlIII[w.lllIlIlIlI[51]] = w."Mouse hole";
        w.lllIlIlIII[w.lllIlIlIlI[52]] = w."Mouse";
        w.lllIlIlIII[w.lllIlIlIlI[53]] = w."Using cheese";
        w.lllIlIlIII[w.lllIlIlIlI[54]] = w."Cheese";
        w.lllIlIlIII[w.lllIlIlIlI[55]] = w."Cheese";
        w.lllIlIlIII[w.lllIlIlIlI[56]] = w."Handle mouse";
        w.lllIlIlIII[w.lllIlIlIlI[57]] = w."Entering maze";
        w.lllIlIlIII[w.lllIlIlIlI[61]] = w."Handling walking";
        w.lllIlIlIII[w.lllIlIlIlI[63]] = w."Door";
        w.lllIlIlIII[w.lllIlIlIlI[64]] = w."Entering shed";
        w.lllIlIlIII[w.lllIlIlIlI[65]] = w."Nav to safe spot";
        w.lllIlIlIII[w.lllIlIlIlI[66]] = w."Eat";
        w.lllIlIlIII[w.lllIlIlIlI[67]] = w."Casting spell";
        w.lllIlIlIII[w.lllIlIlIlI[68]] = w."Fire rune";
        w.lllIlIlIII[w.lllIlIlIlI[69]] = w."Fire rune";
        w.lllIlIlIII[w.lllIlIlIlI[70]] = w."Ball";
        w.lllIlIlIII[w.lllIlIlIlI[71]] = w."Ball";
        w.lllIlIlIII[w.lllIlIlIlI[72]] = w."Taking ball";
        w.lllIlIlIII[w.lllIlIlIlI[73]] = w."Take";
        w.lllIlIlIII[w.lllIlIlIlI[74]] = w."Ball";
        w.lllIlIlIII[w.lllIlIlIlI[75]] = w."Breaking tab";
        w.lllIlIlIII[w.lllIlIlIlI[76]] = w."Break";
        w.lllIlIlIII[w.lllIlIlIlI[77]] = w."Nav to witches start";
        w.lllIlIlIII[w.lllIlIlIlI[78]] = w."Turning in quest";
        w.lllIlIlIII[w.lllIlIlIlI[79]] = w."Boy";
        w.lllIlIlIII[w.lllIlIlIlI[80]] = w."Drink";
        w.lllIlIlIII[w.lllIlIlIlI[81]] = w."Entering maze";
        w.lllIlIlIII[w.lllIlIlIlI[83]] = w."Nav to first spot";
        w.lllIlIlIII[w.lllIlIlIlI[84]] = w."Nav to second spot";
        w.lllIlIlIII[w.lllIlIlIlI[85]] = w."Nav to third spot";
        w.lllIlIlIII[w.lllIlIlIlI[86]] = w."Nav to fountain";
        w.lllIlIlIII[w.lllIlIlIlI[87]] = w."Getting key";
        w.lllIlIlIII[w.lllIlIlIlI[88]] = w."Fountain";
        w.lllIlIlIII[w.lllIlIlIlI[89]] = w."Check";
        w.lllIlIlIII[w.lllIlIlIlI[90]] = w."Continue";
        w.lllIlIlIII[w.lllIlIlIlI[91]] = w."null";
        w.lllIlIlIII[w.lllIlIlIlI[92]] = w." ";
        w.lllIlIlIII[w.lllIlIlIlI[95]] = w."Nav back toward maze";
        w.lllIlIlIII[w.lllIlIlIlI[96]] = w."Nav to shed spot";
        w.lllIlIlIII[w.lllIlIlIlI[97]] = w."Navigating to bank";
        w.lllIlIlIII[w.lllIlIlIlI[98]] = w."Opening bank";
        w.lllIlIlIII[w.lllIlIlIlI[100]] = w."Handling banking";
        w.lllIlIlIII[w.lllIlIlIlI[102]] = w."We are missing supplies, switching to BUYING";
        w.lllIlIlIII[w.lllIlIlIlI[16]] = w."We are missing supplies, switching to BUYING";
        w.lllIlIlIII[w.lllIlIlIlI[103]] = w."We are missing supplies, switching to BUYING";
        w.lllIlIlIII[w.lllIlIlIlI[104]] = w."We are missing supplies, switching to BUYING";
        w.lllIlIlIII[w.lllIlIlIlI[106]] = w."We are missing supplies, switching to BUYING";
        w.lllIlIlIII[w.lllIlIlIlI[116]] = w."Witches House quest";
        w.lllIlIlIII[w.lllIlIlIlI[117]] = w."ring of wealth (";
        w.lllIlIlIII[w.lllIlIlIlI[163]] = w."Wizard Mizgog";
        w.lllIlIlIII[w.lllIlIlIlI[164]] = w."Give me a quest please.";
        w.lllIlIlIII[w.lllIlIlIlI[165]] = w."I'll try.";
        w.lllIlIlIII[w.lllIlIlIlI[166]] = w."Actually, I know where to find this stuff.";
        w.lllIlIlIII[w.lllIlIlIlI[167]] = w."Yes.";
        w.lllIlIlIII[w.lllIlIlIlI[168]] = w."What's the matter?";
        w.lllIlIlIII[w.lllIlIlIlI[169]] = w."Ok, I'll see what I can do.";
    }

    private static void llIIIllIIIIlI() {
        lllIlIlIlI = new int[175];
        w.lllIlIlIlI[0] = (0x32 ^ 0x26) + (0x1F ^ 0x57) - -(0x1A ^ 0x16) + (0x7B ^ 0x43);
        w.lllIlIlIlI[1] = 2;
        w.lllIlIlIlI[2] = 106 + 133 - 62 + 49;
        w.lllIlIlIlI[3] = 1;
        w.lllIlIlIlI[4] = (53 + 126 - 99 + 109 ^ 29 + 36 - 42 + 109) & (0xCE ^ 0xA3 ^ (0x25 ^ 0x71) ^ -1);
        w.lllIlIlIlI[5] = -(0xFFFFCDF7 & 0x761D) & (0xFFFFD6FF & 0x6F3F);
        w.lllIlIlIlI[6] = -(0xFFFFBDB7 & 0x7B59) & (0xFFFFBB7D & 0x7FBF);
        w.lllIlIlIlI[7] = 0xFFFFA27F & 0x5FAE;
        w.lllIlIlIlI[8] = -(0xFFFFDABB & 0x6F45) & (0xFFFFEBFB & 0x5F7F);
        w.lllIlIlIlI[9] = 0xFFFFD7D5 & 0x2FEB;
        w.lllIlIlIlI[10] = 0xFFFFBFDF & 0x5F69;
        w.lllIlIlIlI[11] = 135 + 90 - 181 + 106;
        w.lllIlIlIlI[12] = 3;
        w.lllIlIlIlI[13] = 0xAE ^ 0xAB;
        w.lllIlIlIlI[14] = 0x9B ^ 0x9D;
        w.lllIlIlIlI[15] = 35 + 12 - 42 + 188 ^ 135 + 171 - 144 + 35;
        w.lllIlIlIlI[16] = 0x3D ^ 0xE ^ (0xCF ^ 0xAC);
        w.lllIlIlIlI[17] = -(0xFFFFCCA7 & 0x73DD) & (0xFFFFCFFD & 0x79EF);
        w.lllIlIlIlI[18] = 4 ^ 0x5A ^ (0x3F ^ 0x66);
        w.lllIlIlIlI[19] = -(0xFFFFED79 & 0x768F) & (0xFFFFFFBF & 0x6F7B);
        w.lllIlIlIlI[20] = 0x2D ^ 0x25;
        w.lllIlIlIlI[21] = 3 ^ (0x8B ^ 0x81);
        w.lllIlIlIlI[22] = 0x49 ^ 0x7C ^ (0x22 ^ 0x1D);
        w.lllIlIlIlI[23] = 2 + 136 - -41 + 50;
        w.lllIlIlIlI[24] = 0x4C ^ 0x47;
        w.lllIlIlIlI[25] = 0xAD ^ 0xA1;
        w.lllIlIlIlI[26] = 0x2B ^ 0x26;
        w.lllIlIlIlI[27] = 96 + 58 - 133 + 121 ^ 108 + 114 - 214 + 120;
        w.lllIlIlIlI[28] = 9 ^ 6;
        w.lllIlIlIlI[29] = 0xD0 ^ 0xC0;
        w.lllIlIlIlI[30] = 0x3F ^ 0x2E;
        w.lllIlIlIlI[31] = 0x5C ^ 0x4E;
        w.lllIlIlIlI[32] = 0x40 ^ 0x53;
        w.lllIlIlIlI[33] = 36 + 86 - 97 + 130 ^ 108 + 56 - 71 + 50;
        w.lllIlIlIlI[34] = 86 + 54 - 50 + 78 ^ 90 + 80 - 63 + 82;
        w.lllIlIlIlI[35] = 0x9C ^ 0xAD ^ (0x66 ^ 0x41);
        w.lllIlIlIlI[36] = 0x15 ^ 2;
        w.lllIlIlIlI[37] = 0x67 ^ 0x59 ^ (0x27 ^ 1);
        w.lllIlIlIlI[38] = 0x7E ^ 0x29 ^ (0xDA ^ 0x94);
        w.lllIlIlIlI[39] = 0xFFFFCB6F & 0x3DFA;
        w.lllIlIlIlI[40] = 0x47 ^ 0x5D;
        w.lllIlIlIlI[41] = 0x94 ^ 0x8F;
        w.lllIlIlIlI[42] = 0x92 ^ 0x8E;
        w.lllIlIlIlI[43] = 0xB5 ^ 0xA8;
        w.lllIlIlIlI[44] = 0x6D ^ 0x15 ^ (0xC9 ^ 0xAF);
        w.lllIlIlIlI[45] = 0xE4 ^ 0x9C ^ (0x73 ^ 0x14);
        w.lllIlIlIlI[46] = 7 ^ 0x27;
        w.lllIlIlIlI[47] = 0xB0 ^ 0x91;
        w.lllIlIlIlI[48] = 33 + 111 - -36 + 6 ^ 110 + 108 - 79 + 13;
        w.lllIlIlIlI[49] = 0xCE ^ 0xB8 ^ (0x36 ^ 0x63);
        w.lllIlIlIlI[50] = 0x99 ^ 0xBD;
        w.lllIlIlIlI[51] = 0x99 ^ 0xBC;
        w.lllIlIlIlI[52] = 0x61 ^ 0x34 ^ (0xC3 ^ 0xB0);
        w.lllIlIlIlI[53] = 0x8A ^ 0xAD;
        w.lllIlIlIlI[54] = 0xE ^ 0x5F ^ (0 ^ 0x79);
        w.lllIlIlIlI[55] = 0x69 ^ 0x40;
        w.lllIlIlIlI[56] = 0x70 ^ 0x5A;
        w.lllIlIlIlI[57] = 0x6C ^ 0x47;
        w.lllIlIlIlI[58] = -(0xFFFFB2F7 & 0x7D0B) & (0xFFFFBB57 & Short.MAX_VALUE);
        w.lllIlIlIlI[59] = 0xFFFFEDF5 & 0x1F8E;
        w.lllIlIlIlI[60] = -(0xFFFFFEF9 & 0x7797) & (0xFFFFFFFF & 0x7FFB);
        w.lllIlIlIlI[61] = 0x24 ^ 0x39 ^ (0x8B ^ 0xBA);
        w.lllIlIlIlI[62] = -(0xFFFFFDF3 & 0x768F) & (0xFFFFFFFF & 0x7FF7);
        w.lllIlIlIlI[63] = 138 + 43 - 121 + 93 ^ 143 + 130 - 173 + 80;
        w.lllIlIlIlI[64] = 0x52 ^ 0x7C;
        w.lllIlIlIlI[65] = 0x62 ^ 0x4D;
        w.lllIlIlIlI[66] = 138 + 140 - 199 + 104 ^ 9 + 115 - -9 + 2;
        w.lllIlIlIlI[67] = 0x16 ^ 0x27;
        w.lllIlIlIlI[68] = 0x52 ^ 0x60;
        w.lllIlIlIlI[69] = 129 + 55 - 169 + 164 ^ 101 + 58 - 131 + 100;
        w.lllIlIlIlI[70] = 115 + 108 - 154 + 172 ^ 112 + 195 - 204 + 94;
        w.lllIlIlIlI[71] = 0x33 ^ 0x75 ^ (0x3F ^ 0x4C);
        w.lllIlIlIlI[72] = 0xB3 ^ 0x85;
        w.lllIlIlIlI[73] = 0x92 ^ 0xA2 ^ (0x6B ^ 0x6C);
        w.lllIlIlIlI[74] = 0x58 ^ 0x60;
        w.lllIlIlIlI[75] = 3 ^ 0x3A;
        w.lllIlIlIlI[76] = 0x98 ^ 0xA2;
        w.lllIlIlIlI[77] = 0x43 ^ 0x14 ^ (0x57 ^ 0x3B);
        w.lllIlIlIlI[78] = 144 + 48 - 105 + 86 ^ 62 + 120 - 94 + 57;
        w.lllIlIlIlI[79] = 0x6F ^ 0x52;
        w.lllIlIlIlI[80] = 39 + 102 - 19 + 9 ^ 76 + 23 - -32 + 58;
        w.lllIlIlIlI[81] = 0x1A ^ 0x50 ^ (0x55 ^ 0x20);
        w.lllIlIlIlI[82] = 0xFFFFAFBB & 0x5FDF;
        w.lllIlIlIlI[83] = 0x24 ^ 0x64;
        w.lllIlIlIlI[84] = 0x79 ^ 0x27 ^ (0x6E ^ 0x71);
        w.lllIlIlIlI[85] = 0x12 ^ 0x50;
        w.lllIlIlIlI[86] = 168 + 12 - 11 + 54 ^ 38 + 30 - 60 + 148;
        w.lllIlIlIlI[87] = 0x23 ^ 0x67;
        w.lllIlIlIlI[88] = 99 + 144 - 84 + 48 ^ 129 + 122 - 205 + 92;
        w.lllIlIlIlI[89] = 0x43 ^ 5;
        w.lllIlIlIlI[90] = 41 + 150 - 173 + 225 ^ 12 + 147 - 81 + 102;
        w.lllIlIlIlI[91] = 0x7B ^ 0x33;
        w.lllIlIlIlI[92] = 1 ^ 0x63 ^ (0xBC ^ 0x97);
        w.lllIlIlIlI[93] = 0xFFFF9F67 & 0x6BF9;
        w.lllIlIlIlI[94] = -(0xFFFFF135 & 0x3EFB) & (0xFFFFBDFA & 0x7FBF);
        w.lllIlIlIlI[95] = 0xD2 ^ 0x98;
        w.lllIlIlIlI[96] = 53 + 132 - 124 + 77 ^ 8 + 160 - 111 + 136;
        w.lllIlIlIlI[97] = 0xF2 ^ 0xAD ^ (0x3F ^ 0x2C);
        w.lllIlIlIlI[98] = 0x5B ^ 0x2C ^ (0x19 ^ 0x23);
        w.lllIlIlIlI[99] = -(0xFFFFAAFB & 0x7565) & (0xFFFFB7FA & 0x7BED);
        w.lllIlIlIlI[100] = 0xCF ^ 0xB6 ^ (1 ^ 0x36);
        w.lllIlIlIlI[101] = 0xFFFF9FF9 & 0x63EE;
        w.lllIlIlIlI[102] = 0x20 ^ 0x6F;
        w.lllIlIlIlI[103] = 0x4E ^ 0x5B ^ (0x5D ^ 0x19);
        w.lllIlIlIlI[104] = 0x8F ^ 0xA1 ^ (2 ^ 0x7E);
        w.lllIlIlIlI[105] = 0xFFFFFFDF & 0x1F67;
        w.lllIlIlIlI[106] = 0x58 ^ 0xB;
        w.lllIlIlIlI[107] = -(0xFFFFDDD7 & 0x622A) & (0xFFFFD3F7 & 0x6DFD);
        w.lllIlIlIlI[108] = 0xFFFFF9D1 & 0x377F;
        w.lllIlIlIlI[109] = 0xC5 ^ 0xA1;
        w.lllIlIlIlI[110] = 0xFFFFEDF7 & 0x1398;
        w.lllIlIlIlI[111] = -(0xFFFFCAFF & 0x7D09) & (0xFFFFDBFF & 0x7FFE);
        w.lllIlIlIlI[112] = -(0xFFFF951F & 0x7AF3) & (0xFFFFBEFE & 0x7FDF);
        w.lllIlIlIlI[113] = 0xFFFFD6FC & 0x6B6B;
        w.lllIlIlIlI[114] = -(0xFFFFEAB1 & 0x755F) & (0xFFFFE77D & 0x7FFE);
        w.lllIlIlIlI[115] = 0xFFFFAFF8 & 0x57D7;
        w.lllIlIlIlI[116] = 0x2D ^ 0x79;
        w.lllIlIlIlI[117] = 0x36 ^ 0x60 ^ 3;
        w.lllIlIlIlI[118] = -(0xFFFFF8CB & 0x2F3C) & (0xFFFFAFC7 & 0x7DFF);
        w.lllIlIlIlI[119] = 0xFFFFE5CB & 0x1FF6;
        w.lllIlIlIlI[120] = 0xFFFFB5E7 & 0x4FDC;
        w.lllIlIlIlI[121] = 0xFFFFB6EB & 0x4B3E;
        w.lllIlIlIlI[122] = 0xFFFFADBE & 0x57FF;
        w.lllIlIlIlI[123] = 0xFFFFBBFF & 0x4F64;
        w.lllIlIlIlI[124] = -(0xFFFFF37E & 0x5CC5) & (0xFFFFDFDB & 0x7DEF);
        w.lllIlIlIlI[125] = -(0xFFFFFE1F & 0x15E9) & (0xFFFFBF7F & 0x5FEF);
        w.lllIlIlIlI[126] = -(0xFFFFF0BF & 0x7F63) & (0xFFFFFBF6 & 0x7F7F);
        w.lllIlIlIlI[127] = 0xFFFFADB7 & 0x5FCB;
        w.lllIlIlIlI[128] = -(0xFFFFE5DD & 0x7E3B) & (0xFFFFFFFF & 0x6F7B);
        w.lllIlIlIlI[129] = 0xFFFFDBFA & 0x2F77;
        w.lllIlIlIlI[130] = -(0xFFFFE77F & 0x5AE6) & (0xFFFFEFF7 & 0x5FEF);
        w.lllIlIlIlI[131] = 0xFFFFDBF7 & 0x2F5E;
        w.lllIlIlIlI[132] = 0xFFFFDD9F & 0x2FE5;
        w.lllIlIlIlI[133] = 0xFFFF8BF7 & 0x7F6D;
        w.lllIlIlIlI[134] = -(0xFFFFC785 & 0x3CFF) & (0xFFFF8FE5 & 0x7FFE);
        w.lllIlIlIlI[135] = -(0xFFFFFEC1 & 0x37F) & (0xFFFFAFE7 & 0x5FDF);
        w.lllIlIlIlI[136] = 0xFFFF8BD7 & 0x7F7F;
        w.lllIlIlIlI[137] = 0xFFFFCFF3 & 0x3B7D;
        w.lllIlIlIlI[138] = 0xFFFFBC24 & 0x4FFB;
        w.lllIlIlIlI[139] = 0xFFFFAE7F & 0x5DDB;
        w.lllIlIlIlI[140] = 0xFFFFFFFF & 0xB6F;
        w.lllIlIlIlI[141] = 0xFFFF8DFF & 0x7F7F;
        w.lllIlIlIlI[142] = 0xFFFFDB7E & 0x2FF9;
        w.lllIlIlIlI[143] = 0xFFFFBFFE & 0x4B97;
        w.lllIlIlIlI[144] = 0xFFFFDD7D & 0x2FB7;
        w.lllIlIlIlI[145] = 0xFFFF8FF3 & 0x7B5F;
        w.lllIlIlIlI[146] = -(0xFFFFD2FB & 0x3F6F) & (0xFFFFFFFB & 0x1FFF);
        w.lllIlIlIlI[147] = -(23 + 86 - -3 + 51) & (0xFFFFEBFF & 0x1FFB);
        w.lllIlIlIlI[148] = 0xFFFF8D97 & 0x7FFB;
        w.lllIlIlIlI[149] = 0xFFFFAFFA & 0x5B5F;
        w.lllIlIlIlI[150] = 0xFFFFB7F5 & 0x6E9E;
        w.lllIlIlIlI[151] = -(0xFFFFDBDE & 0x756B) & (0xFFFFF7FF & 0x7FDB);
        w.lllIlIlIlI[152] = -(0xFFFFFAE7 & 0x4D7F) & (0xFFFFEEF7 & Short.MAX_VALUE);
        w.lllIlIlIlI[153] = -(0xFFFFDF77 & 0x609F) & (0xFFFFDFFF & 0x6D9F);
        w.lllIlIlIlI[154] = -(0xFFFFB4E1 & 0x5F3F) & (0xFFFF9F7F & Short.MAX_VALUE);
        w.lllIlIlIlI[155] = 0xFFFF9FDD & 0x6DAF;
        w.lllIlIlIlI[156] = 0xFFFFBB7B & 0x4FDF;
        w.lllIlIlIlI[157] = -(0xFFFFB69F & 0x7B6B) & (0xFFFFFFFE & 0x3F9F);
        w.lllIlIlIlI[158] = 0xFFFFB7DF & 0x6EAE;
        w.lllIlIlIlI[159] = -(0xFFFFF7ED & 0xCB3) & (0xFFFF9FFF & 0x6FFD);
        w.lllIlIlIlI[160] = 0xFFFFBEDF & 0x67B5;
        w.lllIlIlIlI[161] = 0xFFFFBEF3 & 0x7D0F;
        w.lllIlIlIlI[162] = -(0xFFFFFB6F & 0x2CDD) & (0xFFFFBFDF & 0x7C6F);
        w.lllIlIlIlI[163] = 0x1C ^ 0x10 ^ (0x1A ^ 0x40);
        w.lllIlIlIlI[164] = 3 + 200 - 129 + 140 ^ 109 + 82 - 159 + 97;
        w.lllIlIlIlI[165] = 0x35 ^ 0x1C ^ (6 ^ 0x77);
        w.lllIlIlIlI[166] = 0x18 ^ 0x41;
        w.lllIlIlIlI[167] = 0xE8 ^ 0xB2;
        w.lllIlIlIlI[168] = 0x7A ^ 0x21;
        w.lllIlIlIlI[169] = 0x7E ^ 0x22;
        w.lllIlIlIlI[170] = -(0xFFFFFFDA & 0x1067) & (0xFFFFFFFF & 0x1FDD);
        w.lllIlIlIlI[171] = 0xFFFFBFBF & 0x4FDD;
        w.lllIlIlIlI[172] = 0xFFFF8FFF & 0x7F9E;
        w.lllIlIlIlI[173] = -(0x7B ^ 0x3A) & (0xFFFFBFFF & 0x4FDF);
        w.lllIlIlIlI[174] = 0x48 ^ 0x15;
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

