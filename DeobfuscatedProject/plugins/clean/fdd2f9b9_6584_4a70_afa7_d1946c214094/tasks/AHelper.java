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
package gg.squire.fdd2f9b9-6584-4a70-afa7-d1946c214094.tasks;

import gg.squire.fdd2f9b9-6584-4a70-afa7-d1946c214094.tasks.DHelper;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.G;
import gg.squire.fdd2f9b9-6584-4a70-afa7-d1946c214094.tasks.UHelper;
import gg.squire.fdd2f9b9-6584-4a70-afa7-d1946c214094.tasks.AHelper;
import gg.squire.fdd2f9b9-6584-4a70-afa7-d1946c214094.tasks.BHelper;
import gg.squire.fdd2f9b9-6584-4a70-afa7-d1946c214094.tasks.DHelper;
import gg.squire.fdd2f9b9-6584-4a70-afa7-d1946c214094.tasks.EHelper;
import gg.squire.fdd2f9b9-6584-4a70-afa7-d1946c214094.tasks.FHelper;
import gg.squire.fdd2f9b9-6584-4a70-afa7-d1946c214094.tasks.GHelper;
import gg.squire.fdd2f9b9-6584-4a70-afa7-d1946c214094.tasks.IHelper;
import gg.squire.fdd2f9b9-6584-4a70-afa7-d1946c214094.tasks.VHelper;
import gg.squire.account.AccBuilderRogues;
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

public class AHelper
implements G {
    private static final  WorldPoint hm;
    private static final  int hA;
    public static final  WorldArea gN;
    private static final  int hH;
    private static final  WorldPoint hh;
    public static  List<d> bv;
    private static final  WorldArea hv;
    private static final  int gT;
    private static final  int hD;
    private static final  int hB;
    private static final  int he;
    private static final  int hG;
    private static final  WorldPoint hs;
    static  String hK;
    private static final  WorldPoint hi;
    
    private static final  WorldPoint hl;
    public static final  WorldPoint gJ;
    public static final  WorldPoint gI;
    private static final  WorldPoint hk;
    
    private static final  WorldPoint hr;
    private static final  WorldArea hw;
    public static final  WorldArea gL;
    public static final  WorldPoint gH;
    private static final  int hc;
    private static final  int gY;
    static  boolean cl;
    private static final  int hE;
    public static final  WorldArea gM;
    public static final  WorldArea gK;
    private static final  int gZ;
    private static final  WorldPoint hp;
    static  String[] gz;
    private static final  int hb;
    private static final  int gW;
    private static final  WorldPoint hf;
    private static final  WorldPoint hj;
    private static final  int ha;
    private static final  WorldPoint hq;
    public static  int hI;
    private static final  WorldPoint hn;
    
    public static final  WorldArea gO;
    public static  int hJ;
    static  int ck;
    private static final  WorldPoint ho;
    public static final  WorldArea gQ;
    private static final  int hC;
    private static final  int gX;
    private static final  int gV;
    private static final  int hd;
    public static  boolean bt;
    private static final  int gU;
    private static final  WorldPoint ht;
    private static final  WorldPoint hg;
    private static final  int hy;
    public static final  WorldArea gP;
    private static final  int gS;
    public static final  WorldArea gR;
    private static final  WorldArea hx;
    private static final  WorldPoint hu;
    private static final  int hF;
    private static final  int hz;

    private static boolean lllllllllIIl(int n2, int n3) {
        return n2 < n3;
    }

        return String.valueOf(var1);
    }

    private static boolean llllllllllII(int n2) {
        return n2 == 0;
    }

    static {
        A.lllllllllIII();
        A.lllllllIlIlI();
        ha = lIIlIllIII[82];
        gV = lIIlIllIII[3];
        hA = lIIlIllIII[118];
        hG = lIIlIllIII[8];
        gY = lIIlIllIII[14];
        hE = lIIlIllIII[6];
        hB = lIIlIllIII[119];
        hH = lIIlIllIII[9];
        hz = lIIlIllIII[120];
        hc = lIIlIllIII[60];
        hF = lIIlIllIII[121];
        gW = lIIlIllIII[1];
        hb = lIIlIllIII[17];
        he = lIIlIllIII[19];
        hy = lIIlIllIII[122];
        hD = lIIlIllIII[5];
        hd = lIIlIllIII[39];
        gX = lIIlIllIII[12];
        gT = lIIlIllIII[1];
        hC = lIIlIllIII[7];
        gS = lIIlIllIII[0];
        gU = lIIlIllIII[2];
        gZ = lIIlIllIII[18];
        gH = new WorldPoint(lIIlIllIII[123], lIIlIllIII[59], lIIlIllIII[4]);
        gI = new WorldPoint(lIIlIllIII[62], lIIlIllIII[124], lIIlIllIII[4]);
        gJ = new WorldPoint(lIIlIllIII[125], lIIlIllIII[94], lIIlIllIII[4]);
        gK = new WorldArea(lIIlIllIII[126], lIIlIllIII[127], lIIlIllIII[31], lIIlIllIII[14], lIIlIllIII[4]);
        gL = new WorldArea(lIIlIllIII[128], lIIlIllIII[127], lIIlIllIII[30], lIIlIllIII[14], lIIlIllIII[4]);
        gM = new WorldArea(lIIlIllIII[129], lIIlIllIII[130], lIIlIllIII[15], lIIlIllIII[22], lIIlIllIII[4]);
        gN = new WorldArea(lIIlIllIII[131], lIIlIllIII[132], lIIlIllIII[24], lIIlIllIII[15], lIIlIllIII[4]);
        gO = new WorldArea(lIIlIllIII[133], lIIlIllIII[132], lIIlIllIII[18], lIIlIllIII[13], lIIlIllIII[4]);
        gP = new WorldArea(lIIlIllIII[134], lIIlIllIII[135], lIIlIllIII[21], lIIlIllIII[18], lIIlIllIII[4]);
        gQ = new WorldArea(lIIlIllIII[136], lIIlIllIII[132], lIIlIllIII[15], lIIlIllIII[15], lIIlIllIII[4]);
        gR = new WorldArea(lIIlIllIII[137], lIIlIllIII[132], lIIlIllIII[15], lIIlIllIII[13], lIIlIllIII[4]);
        hf = new WorldPoint(lIIlIllIII[138], lIIlIllIII[139], lIIlIllIII[1]);
        hg = new WorldPoint(lIIlIllIII[140], lIIlIllIII[141], lIIlIllIII[4]);
        hh = new WorldPoint(lIIlIllIII[142], lIIlIllIII[127], lIIlIllIII[4]);
        hi = new WorldPoint(lIIlIllIII[143], lIIlIllIII[144], lIIlIllIII[4]);
        hj = new WorldPoint(lIIlIllIII[145], lIIlIllIII[146], lIIlIllIII[4]);
        hk = new WorldPoint(lIIlIllIII[131], lIIlIllIII[94], lIIlIllIII[4]);
        hl = new WorldPoint(lIIlIllIII[147], lIIlIllIII[148], lIIlIllIII[4]);
        hm = new WorldPoint(lIIlIllIII[149], lIIlIllIII[150], lIIlIllIII[4]);
        hn = new WorldPoint(lIIlIllIII[145], lIIlIllIII[151], lIIlIllIII[4]);
        ho = new WorldPoint(lIIlIllIII[131], lIIlIllIII[151], lIIlIllIII[4]);
        hp = new WorldPoint(lIIlIllIII[131], lIIlIllIII[152], lIIlIllIII[4]);
        hq = new WorldPoint(lIIlIllIII[136], lIIlIllIII[151], lIIlIllIII[4]);
        hr = new WorldPoint(lIIlIllIII[136], lIIlIllIII[152], lIIlIllIII[4]);
        hs = new WorldPoint(lIIlIllIII[58], lIIlIllIII[153], lIIlIllIII[4]);
        ht = new WorldPoint(lIIlIllIII[62], lIIlIllIII[135], lIIlIllIII[4]);
        hu = new WorldPoint(lIIlIllIII[154], lIIlIllIII[155], lIIlIllIII[4]);
        hv = new WorldArea(new WorldPoint(lIIlIllIII[156], lIIlIllIII[157], lIIlIllIII[4]), new WorldPoint(lIIlIllIII[58], lIIlIllIII[94], lIIlIllIII[4]));
        hw = new WorldArea(new WorldPoint(lIIlIllIII[145], lIIlIllIII[158], lIIlIllIII[4]), new WorldPoint(lIIlIllIII[159], lIIlIllIII[160], lIIlIllIII[4]));
        hx = new WorldArea(lIIlIllIII[62], lIIlIllIII[130], lIIlIllIII[14], lIIlIllIII[22], lIIlIllIII[4]);
        bv = new ArrayList<d>();
        hI = lIIlIllIII[161];
        hJ = lIIlIllIII[162];
        hK = lIIlIlIlII[lIIlIllIII[163]];
        String[] stringArray = new String[lIIlIllIII[14]];
        stringArray[A.lIIlIllIII[4]] = lIIlIlIlII[lIIlIllIII[164]];
        stringArray[A.lIIlIllIII[3]] = lIIlIlIlII[lIIlIllIII[165]];
        stringArray[A.lIIlIllIII[1]] = lIIlIlIlII[lIIlIllIII[166]];
        stringArray[A.lIIlIllIII[12]] = lIIlIlIlII[lIIlIllIII[167]];
        stringArray[A.lIIlIllIII[15]] = lIIlIlIlII[lIIlIllIII[168]];
        stringArray[A.lIIlIllIII[13]] = lIIlIlIlII[lIIlIllIII[169]];
        gz = stringArray;
        int[] nArray = new int[lIIlIllIII[15]];
        nArray[A.lIIlIllIII[4]] = lIIlIllIII[170];
        nArray[A.lIIlIllIII[3]] = lIIlIllIII[171];
        nArray[A.lIIlIllIII[1]] = lIIlIllIII[172];
        nArray[A.lIIlIllIII[12]] = lIIlIllIII[173];
        hL = nArray;
    }

    @Override
    public String U() {
        return lIIlIlIlII[lIIlIllIII[116]];
    }

    public static void bu() {
        TileObject llllllllllllllllllllllIlllIIllII2;
        block91: {
            block93: {
                block92: {
                    block89: {
                        block90: {
                            Widget var2;
                            if (A.lllllllllIIl(e.j(lIIlIllIII[0]), lIIlIllIII[1])) {
                                try {
                                    D.bK();

                                }
                                catch (Exception llllllllllllllllllllllIlllIIllII2) {
                                    llllllllllllllllllllllIlllIIllII2.printStackTrace();
                                }
                                
                            }
                            if (A.lllllllllIlI(e.j(lIIlIllIII[0]), lIIlIllIII[1]) && A.lllllllllIIl(e.j(lIIlIllIII[2]), lIIlIllIII[3])) {
                                block88: {
                                    if (A.lllllllllIll(bt ? 1 : 0)) {
                                        AccBuilderRogues.c = lIIlIlIlII[lIIlIllIII[4]];
                                        b.a(bv);
                                        if (A.lllllllllIIl(bv.size(), lIIlIllIII[3])) {
                                            System.out.println(lIIlIlIlII[lIIlIllIII[3]]);
                                            bt = lIIlIllIII[4];
                                        }
                                    }
                                    do {
                                        if (A.lllllllllIll(v.aX() ? 1 : 0)) {
                                            int[] nArray = new int[lIIlIllIII[3]];
                                            nArray[A.lIIlIllIII[4]] = lIIlIllIII[5];
                                            if (A.lllllllllIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                                                int[] nArray2 = new int[lIIlIllIII[3]];
                                                nArray2[A.lIIlIllIII[4]] = lIIlIllIII[6];
                                                if (A.lllllllllIll(Inventory.contains((int[])nArray2) ? 1 : 0)) {
                                                    int[] nArray3 = new int[lIIlIllIII[3]];
                                                    nArray3[A.lIIlIllIII[4]] = lIIlIllIII[7];
                                                    if (A.lllllllllIll(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                                                        int[] nArray4 = new int[lIIlIllIII[3]];
                                                        nArray4[A.lIIlIllIII[4]] = lIIlIllIII[8];
                                                        if (A.lllllllllIll(Inventory.contains((int[])nArray4) ? 1 : 0)) {
                                                            int[] nArray5 = new int[lIIlIllIII[3]];
                                                            nArray5[A.lIIlIllIII[4]] = lIIlIllIII[9];
                                                            if (A.lllllllllIll(Inventory.contains((int[])nArray5) ? 1 : 0)) {
                                                                int[] nArray6 = new int[lIIlIllIII[3]];
                                                                nArray6[A.lIIlIllIII[4]] = lIIlIllIII[10];
                                                                if (!A.llllllllllII(Inventory.contains((int[])nArray6) ? 1 : 0)) break block88;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        if (!A.llllllllllII(AccBuilderRogues.d ? 1 : 0)) break block88;
                                        A.bw();
                                        Time.sleepTicks((int)lIIlIllIII[3]);

                                    } while (null == null);
                                    return;
                                }
                                if (A.llllllllllII(bt ? 1 : 0)) {
                                    if (A.llllllllllIl(Players.getLocal().getWorldLocation().distanceTo(hg), lIIlIllIII[11])) {
                                        int[] nArray = new int[lIIlIllIII[3]];
                                        nArray[A.lIIlIllIII[4]] = lIIlIllIII[10];
                                        if (A.lllllllllIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                                            AccBuilderRogues.c = lIIlIlIlII[lIIlIllIII[1]];
                                            int[] nArray7 = new int[lIIlIllIII[3]];
                                            nArray7[A.lIIlIllIII[4]] = lIIlIllIII[10];
                                            Inventory.getFirst((int[])nArray7).interact(lIIlIlIlII[lIIlIllIII[12]]);
                                            Time.sleepTicks((int)lIIlIllIII[13]);

                                        }
                                    }
                                    if (A.lllllllllIIl(Players.getLocal().getWorldLocation().distanceTo(hg), lIIlIllIII[11]) && A.llllllllllIl(Players.getLocal().getWorldLocation().distanceTo(hg), lIIlIllIII[14])) {
                                        AccBuilderRogues.c = lIIlIlIlII[lIIlIllIII[15]];
                                        if (A.lllllllllIll(Inventory.contains((int[])f.aV) ? 1 : 0) && A.lllllllllIIl(Movement.getRunEnergy(), lIIlIllIII[16])) {
                                            Inventory.getFirst((int[])f.aV).interact(lIIlIlIlII[lIIlIllIII[13]]);
                                            Time.sleepTicks((int)lIIlIllIII[3]);

                                        }
                                        Movement.walkTo((WorldPoint)hg);

                                        Time.sleepTicks((int)lIIlIllIII[3]);

                                    }
                                    if (A.lllllllllllI(Players.getLocal().getWorldLocation().distanceTo(hg), lIIlIllIII[14])) {
                                        g.a(lIIlIlIlII[lIIlIllIII[14]], gz);
                                    }
                                }
                            }
                            if (A.lllllllllIlI(e.j(lIIlIllIII[0]), lIIlIllIII[1]) && A.lllllllllIlI(e.j(lIIlIllIII[2]), lIIlIllIII[3])) {
                                if (A.llllllllllIl(Players.getLocal().getWorldLocation().distanceTo(hj), lIIlIllIII[15]) && A.llllllllllII(hw.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    int[] nArray = new int[lIIlIllIII[3]];
                                    nArray[A.lIIlIllIII[4]] = lIIlIllIII[17];
                                    if (A.llllllllllII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                                        AccBuilderRogues.c = lIIlIlIlII[lIIlIllIII[18]];
                                        Movement.walkTo((WorldPoint)hj);

                                        Time.sleepTicks((int)lIIlIllIII[3]);

                                    }
                                }
                                if (A.lllllllllllI(Players.getLocal().getWorldLocation().distanceTo(hj), lIIlIllIII[15]) && A.llllllllllII(Players.getLocal().isMoving() ? 1 : 0)) {
                                    int[] nArray = new int[lIIlIllIII[3]];
                                    nArray[A.lIIlIllIII[4]] = lIIlIllIII[17];
                                    if (A.llllllllllII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                                        int[] nArray8 = new int[lIIlIllIII[3]];
                                        nArray8[A.lIIlIllIII[4]] = lIIlIllIII[19];
                                        llllllllllllllllllllllIlllIIllII2 = TileObjects.getNearest((int[])nArray8);
                                        if (A.lllllllllIll(Inventory.isFull() ? 1 : 0)) {
                                            int[] nArray9 = new int[lIIlIllIII[3]];
                                            nArray9[A.lIIlIllIII[4]] = lIIlIllIII[8];
                                            Inventory.getFirst((int[])nArray9).interact(lIIlIlIlII[lIIlIllIII[20]]);
                                            Time.sleepTicks((int)lIIlIllIII[3]);

                                        }
                                        if (A.llllllllllII(Inventory.isFull() ? 1 : 0)) {
                                            if (A.llllllllllll(llllllllllllllllllllllIlllIIllII2) && A.llllllllllII(Dialog.isOpen() ? 1 : 0)) {
                                                AccBuilderRogues.c = lIIlIlIlII[lIIlIllIII[21]];
                                                llllllllllllllllllllllIlllIIllII2.interact(lIIlIlIlII[lIIlIllIII[22]]);
                                                Dialog.continueSpace();
                                            }
                                            if (A.llllllllllll(var2 = Widgets.get((int)lIIlIllIII[23], (int)lIIlIllIII[3]))) {
                                                var2.interact(lIIlIlIlII[lIIlIllIII[24]]);
                                                var2.interact(lIIlIllIII[4]);
                                                var2.interact(lIIlIlIlII[lIIlIllIII[25]]);
                                                Keyboard.type((String)lIIlIlIlII[lIIlIllIII[26]]);
                                            }
                                        }
                                    }
                                }
                                if (A.lllllllllllI(Players.getLocal().getWorldLocation().distanceTo(hj), lIIlIllIII[15])) {
                                    int[] nArray = new int[lIIlIllIII[3]];
                                    nArray[A.lIIlIllIII[4]] = lIIlIllIII[17];
                                    if (A.lllllllllIll(Inventory.contains((int[])nArray) ? 1 : 0) && A.llllllllllII(hv.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                        AccBuilderRogues.c = lIIlIlIlII[lIIlIllIII[27]];
                                        Movement.walkTo((WorldPoint)hn);

                                        Time.sleepTicks((int)lIIlIllIII[3]);

                                    }
                                }
                                if (A.lllllllllIll(hw.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    AccBuilderRogues.c = lIIlIlIlII[lIIlIllIII[28]];
                                    if (A.llllllllllIl(Players.getLocal().getWorldLocation().distanceTo(hn), lIIlIllIII[3])) {
                                        Movement.walkTo((WorldPoint)hn);

                                        Time.sleepTicks((int)lIIlIllIII[3]);

                                    }
                                    if (A.lllllllllllI(Players.getLocal().getWorldLocation().distanceTo(hn), lIIlIllIII[3])) {
                                        String[] stringArray = new String[lIIlIllIII[3]];
                                        stringArray[A.lIIlIllIII[4]] = lIIlIlIlII[lIIlIllIII[29]];
                                        llllllllllllllllllllllIlllIIllII2 = TileObjects.getNearest((String[])stringArray);
                                        AccBuilderRogues.c = lIIlIlIlII[lIIlIllIII[30]];
                                        if (A.lllllllllIll(Inventory.isFull() ? 1 : 0)) {
                                            int[] nArray = new int[lIIlIllIII[3]];
                                            nArray[A.lIIlIllIII[4]] = lIIlIllIII[8];
                                            Inventory.getFirst((int[])nArray).interact(lIIlIlIlII[lIIlIllIII[31]]);
                                            Time.sleepTicks((int)lIIlIllIII[3]);

                                        }
                                        if (A.llllllllllll(llllllllllllllllllllllIlllIIllII2)) {
                                            String[] stringArray2 = new String[lIIlIllIII[3]];
                                            stringArray2[A.lIIlIllIII[4]] = lIIlIlIlII[lIIlIllIII[32]];
                                            if (A.lllllllllIll(llllllllllllllllllllllIlllIIllII2.hasAction(stringArray2) ? 1 : 0)) {
                                                llllllllllllllllllllllIlllIIllII2.interact(lIIlIlIlII[lIIlIllIII[33]]);
                                                Time.sleepTicks((int)lIIlIllIII[1]);

                                            }
                                            String[] stringArray3 = new String[lIIlIllIII[3]];
                                            stringArray3[A.lIIlIllIII[4]] = lIIlIlIlII[lIIlIllIII[34]];
                                            if (A.lllllllllIll(llllllllllllllllllllllIlllIIllII2.hasAction(stringArray3) ? 1 : 0)) {
                                                llllllllllllllllllllllIlllIIllII2.interact(lIIlIlIlII[lIIlIllIII[35]]);
                                                Time.sleepTicks((int)lIIlIllIII[1]);

                                                var2 = Widgets.get((int)lIIlIllIII[23], (int)lIIlIllIII[3]);
                                                if (A.llllllllllll(var2)) {
                                                    var2.interact(lIIlIlIlII[lIIlIllIII[36]]);
                                                    var2.interact(lIIlIllIII[4]);
                                                    var2.interact(lIIlIlIlII[lIIlIllIII[37]]);
                                                    Keyboard.type((String)lIIlIlIlII[lIIlIllIII[38]]);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            if (A.lllllllllIlI(e.j(lIIlIllIII[0]), lIIlIllIII[1]) && A.lllllllllIlI(e.j(lIIlIllIII[2]), lIIlIllIII[1])) {
                                ck = lIIlIllIII[4];
                                if (A.lllllllllllI(Players.getLocal().getWorldLocation().distanceTo(hg), lIIlIllIII[22])) {
                                    while (A.llllllllllIl(Players.getLocal().getWorldLocation().distanceTo(hj), lIIlIllIII[1]) && A.llllllllllII(AccBuilderRogues.d ? 1 : 0)) {
                                        Movement.walkTo((WorldPoint)hj);

                                        Time.sleepTicks((int)lIIlIllIII[3]);

                                        if (((0x53 ^ 0x56 ^ (0x27 ^ 0x65)) & (7 + 82 - 28 + 151 ^ 95 + 24 - 57 + 85 ^ -1)) >= ((0x34 ^ 0x65 ^ (0x11 ^ 0xB)) & (0x55 ^ 0x2C ^ (0x70 ^ 0x42) ^ -1))) continue;
                                        return;
                                    }
                                }
                                int[] nArray = new int[lIIlIllIII[3]];
                                nArray[A.lIIlIllIII[4]] = lIIlIllIII[39];
                                if (A.llllllllllII(Inventory.contains((int[])nArray) ? 1 : 0) && A.lllllllllIll(hw.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    AccBuilderRogues.c = lIIlIlIlII[lIIlIllIII[40]];
                                    if (A.llllllllllIl(Players.getLocal().getWorldLocation().distanceTo(hn), lIIlIllIII[3])) {
                                        Movement.walkTo((WorldPoint)hn);

                                        Time.sleepTicks((int)lIIlIllIII[3]);

                                    }
                                    if (A.lllllllllllI(Players.getLocal().getWorldLocation().distanceTo(hn), lIIlIllIII[3])) {
                                        String[] stringArray = new String[lIIlIllIII[3]];
                                        stringArray[A.lIIlIllIII[4]] = lIIlIlIlII[lIIlIllIII[41]];
                                        llllllllllllllllllllllIlllIIllII2 = TileObjects.getNearest((String[])stringArray);
                                        AccBuilderRogues.c = lIIlIlIlII[lIIlIllIII[42]];
                                        if (A.llllllllllll(llllllllllllllllllllllIlllIIllII2)) {
                                            String[] stringArray4 = new String[lIIlIllIII[3]];
                                            stringArray4[A.lIIlIllIII[4]] = lIIlIlIlII[lIIlIllIII[43]];
                                            if (A.lllllllllIll(llllllllllllllllllllllIlllIIllII2.hasAction(stringArray4) ? 1 : 0)) {
                                                llllllllllllllllllllllIlllIIllII2.interact(lIIlIlIlII[lIIlIllIII[44]]);
                                                Time.sleepTicks((int)lIIlIllIII[1]);

                                            }
                                            String[] stringArray5 = new String[lIIlIllIII[3]];
                                            stringArray5[A.lIIlIllIII[4]] = lIIlIlIlII[lIIlIllIII[45]];
                                            if (A.lllllllllIll(llllllllllllllllllllllIlllIIllII2.hasAction(stringArray5) ? 1 : 0)) {
                                                llllllllllllllllllllllIlllIIllII2.interact(lIIlIlIlII[lIIlIllIII[46]]);
                                                Time.sleepTicks((int)lIIlIllIII[1]);

                                                var2 = Widgets.get((int)lIIlIllIII[23], (int)lIIlIllIII[3]);
                                                if (A.llllllllllll(var2)) {
                                                    var2.interact(lIIlIlIlII[lIIlIllIII[47]]);
                                                    var2.interact(lIIlIllIII[4]);
                                                    var2.interact(lIIlIlIlII[lIIlIllIII[48]]);
                                                    Keyboard.type((String)lIIlIlIlII[lIIlIllIII[49]]);
                                                }
                                            }
                                        }
                                    }
                                }
                                int[] nArray10 = new int[lIIlIllIII[3]];
                                nArray10[A.lIIlIllIII[4]] = lIIlIllIII[39];
                                if (A.lllllllllIll(Inventory.contains((int[])nArray10) ? 1 : 0) && A.llllllllllIl(Players.getLocal().getWorldLocation().distanceTo(hk), lIIlIllIII[3])) {
                                    AccBuilderRogues.c = lIIlIlIlII[lIIlIllIII[50]];
                                    Movement.walkTo((WorldPoint)hk);

                                    Time.sleepTicks((int)lIIlIllIII[3]);

                                }
                                if (A.lllllllllllI(Players.getLocal().getWorldLocation().distanceTo(hk), lIIlIllIII[1])) {
                                    String[] stringArray = new String[lIIlIllIII[3]];
                                    stringArray[A.lIIlIllIII[4]] = lIIlIlIlII[lIIlIllIII[51]];
                                    llllllllllllllllllllllIlllIIllII2 = TileObjects.getNearest((String[])stringArray);
                                    String[] stringArray6 = new String[lIIlIllIII[3]];
                                    stringArray6[A.lIIlIllIII[4]] = lIIlIlIlII[lIIlIllIII[52]];
                                    var2 = NPCs.getNearest((String[])stringArray6);
                                    if (A.llllllllllll(llllllllllllllllllllllIlllIIllII2) && A.lIIIIIIIIIIII(var2)) {
                                        AccBuilderRogues.c = lIIlIlIlII[lIIlIllIII[53]];
                                        String[] stringArray7 = new String[lIIlIllIII[3]];
                                        stringArray7[A.lIIlIllIII[4]] = lIIlIlIlII[lIIlIllIII[54]];
                                        if (A.lllllllllIll(Inventory.contains((String[])stringArray7) ? 1 : 0)) {
                                            String[] stringArray8 = new String[lIIlIllIII[3]];
                                            stringArray8[A.lIIlIllIII[4]] = lIIlIlIlII[lIIlIllIII[55]];
                                            Inventory.getFirst((String[])stringArray8).useOn(llllllllllllllllllllllIlllIIllII2);
                                        }
                                        Time.sleepTicks((int)lIIlIllIII[3]);

                                    }
                                    if (A.llllllllllll(var2)) {
                                        AccBuilderRogues.c = lIIlIlIlII[lIIlIllIII[56]];
                                        int[] nArray11 = new int[lIIlIllIII[3]];
                                        nArray11[A.lIIlIllIII[4]] = lIIlIllIII[39];
                                        if (A.lllllllllIll(Inventory.contains((int[])nArray11) ? 1 : 0)) {
                                            int[] nArray12 = new int[lIIlIllIII[3]];
                                            nArray12[A.lIIlIllIII[4]] = lIIlIllIII[39];
                                            Inventory.getFirst((int[])nArray12).useOn((Actor)var2);
                                        }
                                        Time.sleepTicks((int)lIIlIllIII[3]);

                                    }
                                }
                            }
                            if (A.lllllllllIll(hv.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && A.lllllllllIlI(e.j(lIIlIllIII[2]), lIIlIllIII[12])) {
                                AccBuilderRogues.c = lIIlIlIlII[lIIlIllIII[57]];
                                Movement.walkTo((WorldPoint)new WorldPoint(lIIlIllIII[58], lIIlIllIII[59], lIIlIllIII[4]));

                                Time.sleepTicks((int)lIIlIllIII[3]);

                            }
                            if (!A.llllllllllII(hv.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || !A.lllllllllIlI(e.j(lIIlIllIII[2]), lIIlIllIII[12])) break block89;
                            int[] nArray = new int[lIIlIllIII[3]];
                            nArray[A.lIIlIllIII[4]] = lIIlIllIII[60];
                            if (!A.lllllllllIll(Inventory.contains((int[])nArray) ? 1 : 0)) break block90;
                            int[] nArray13 = new int[lIIlIllIII[3]];
                            nArray13[A.lIIlIllIII[4]] = lIIlIllIII[60];
                            if (!A.lllllllllIll(Inventory.contains((int[])nArray13) ? 1 : 0) || !A.llllllllllIl(Players.getLocal().getWorldLocation().distanceTo(ht), lIIlIllIII[12])) break block89;
                        }
                        AccBuilderRogues.c = lIIlIlIlII[lIIlIllIII[61]];
                        if (A.lIIIIIIIIIIIl(Movement.getRunEnergy(), lIIlIllIII[33])) {
                            A.bv();
                        }
                    }
                    if (A.lllllllllllI(Players.getLocal().getWorldLocation().distanceTo(ht), lIIlIllIII[12])) {
                        int[] nArray = new int[lIIlIllIII[3]];
                        nArray[A.lIIlIllIII[4]] = lIIlIllIII[60];
                        if (A.lllllllllIll(Inventory.contains((int[])nArray) ? 1 : 0) && A.lllllllllIlI(Players.getLocal().getWorldLocation().getX(), lIIlIllIII[62])) {
                            String[] stringArray = new String[lIIlIllIII[3]];
                            stringArray[A.lIIlIllIII[4]] = lIIlIlIlII[lIIlIllIII[63]];
                            llllllllllllllllllllllIlllIIllII2 = TileObjects.getNearest((String[])stringArray);
                            if (A.llllllllllll(llllllllllllllllllllllIlllIIllII2)) {
                                AccBuilderRogues.c = lIIlIlIlII[lIIlIllIII[64]];
                                int[] nArray14 = new int[lIIlIllIII[3]];
                                nArray14[A.lIIlIllIII[4]] = lIIlIllIII[60];
                                if (A.lllllllllIll(Inventory.contains((int[])nArray14) ? 1 : 0)) {
                                    int[] nArray15 = new int[lIIlIllIII[3]];
                                    nArray15[A.lIIlIllIII[4]] = lIIlIllIII[60];
                                    Inventory.getFirst((int[])nArray15).useOn(llllllllllllllllllllllIlllIIllII2);
                                    Time.sleepTicks((int)lIIlIllIII[1]);

                                }
                            }
                        }
                    }
                    if (!A.lllllllllIll(hx.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block91;
                    int[] nArray = new int[lIIlIllIII[3]];
                    nArray[A.lIIlIllIII[4]] = lIIlIllIII[60];
                    if (!A.lllllllllIll(Inventory.contains((int[])nArray) ? 1 : 0)) break block91;
                    if (A.llllllllllII(Players.getLocal().getWorldLocation().equals((Object)hh) ? 1 : 0)) {
                        AccBuilderRogues.c = lIIlIlIlII[lIIlIllIII[65]];
                        Movement.walkTo((WorldPoint)hh);

                    }
                    if (A.lllllllllllI(Skills.getBoostedLevel((Skill)Skill.HITPOINTS), lIIlIllIII[13])) {
                        int[] nArray16 = new int[lIIlIllIII[3]];
                        nArray16[A.lIIlIllIII[4]] = lIIlIllIII[8];
                        if (A.lllllllllIll(Inventory.contains((int[])nArray16) ? 1 : 0)) {
                            int[] nArray17 = new int[lIIlIllIII[3]];
                            nArray17[A.lIIlIllIII[4]] = lIIlIllIII[8];
                            Inventory.getFirst((int[])nArray17).interact(lIIlIlIlII[lIIlIllIII[66]]);
                        }
                    }
                    if (!A.lllllllllIll(Players.getLocal().getWorldLocation().equals((Object)hh) ? 1 : 0) || !A.llllllllllll(llllllllllllllllllllllIlllIIllII2 = NPCs.getNearest((int[])hL)) || !A.llllllllllII(llllllllllllllllllllllIlllIIllII2.isDead() ? 1 : 0)) break block91;
                    AccBuilderRogues.c = lIIlIlIlII[lIIlIllIII[67]];
                    if (A.lllllllllIIl(Skills.getLevel((Skill)Skill.MAGIC), lIIlIllIII[21])) {
                        Magic.cast((Spell)SpellBook.Standard.WATER_STRIKE, (NPC)llllllllllllllllllllllIlllIIllII2);
                        Time.sleepTicks((int)lIIlIllIII[3]);

                    }
                    if (A.lllllllllIIl(Skills.getLevel((Skill)Skill.MAGIC), lIIlIllIII[26]) && !A.lllllllllIIl(Skills.getLevel((Skill)Skill.MAGIC), lIIlIllIII[21])) break block92;
                    if (!A.lIIIIIIIIIIIl(Skills.getLevel((Skill)Skill.MAGIC), lIIlIllIII[21])) break block93;
                    int[] nArray18 = new int[lIIlIllIII[3]];
                    nArray18[A.lIIlIllIII[4]] = lIIlIllIII[6];
                    if (!A.lllllllllIll(Inventory.contains((int[])nArray18) ? 1 : 0)) break block93;
                    String[] stringArray = new String[lIIlIllIII[3]];
                    stringArray[A.lIIlIllIII[4]] = lIIlIlIlII[lIIlIllIII[68]];
                    if (!A.llllllllllII(Inventory.contains((String[])stringArray) ? 1 : 0)) break block93;
                }
                Magic.cast((Spell)SpellBook.Standard.EARTH_STRIKE, (NPC)llllllllllllllllllllllIlllIIllII2);
                Time.sleepTicks((int)lIIlIllIII[3]);

            }
            if (A.lIIIIIIIIIIIl(Skills.getLevel((Skill)Skill.MAGIC), lIIlIllIII[26])) {
                String[] stringArray = new String[lIIlIllIII[3]];
                stringArray[A.lIIlIllIII[4]] = lIIlIlIlII[lIIlIllIII[69]];
                if (A.lllllllllIll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    Magic.cast((Spell)SpellBook.Standard.FIRE_STRIKE, (NPC)llllllllllllllllllllllIlllIIllII2);
                    Time.sleepTicks((int)lIIlIllIII[3]);

                }
            }
        }
        if (A.lllllllllIlI(e.j(lIIlIllIII[2]), lIIlIllIII[14])) {
            String[] stringArray = new String[lIIlIllIII[3]];
            stringArray[A.lIIlIllIII[4]] = lIIlIlIlII[lIIlIllIII[70]];
            if (A.llllllllllII(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                String[] stringArray9 = new String[lIIlIllIII[3]];
                stringArray9[A.lIIlIllIII[4]] = lIIlIlIlII[lIIlIllIII[71]];
                llllllllllllllllllllllIlllIIllII2 = TileItems.getNearest((String[])stringArray9);
                if (A.llllllllllll(llllllllllllllllllllllIlllIIllII2)) {
                    AccBuilderRogues.c = lIIlIlIlII[lIIlIllIII[72]];
                    llllllllllllllllllllllIlllIIllII2.interact(lIIlIlIlII[lIIlIllIII[73]]);
                    Time.sleepTicks((int)lIIlIllIII[1]);

                }
            }
        }
        if (A.lllllllllIlI(e.j(lIIlIllIII[2]), lIIlIllIII[14])) {
            String[] stringArray = new String[lIIlIllIII[3]];
            stringArray[A.lIIlIllIII[4]] = lIIlIlIlII[lIIlIllIII[74]];
            if (A.lllllllllIll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                if (A.lllllllllIll(hx.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    int[] nArray = new int[lIIlIllIII[3]];
                    nArray[A.lIIlIllIII[4]] = lIIlIllIII[10];
                    if (A.lllllllllIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        AccBuilderRogues.c = lIIlIlIlII[lIIlIllIII[75]];
                        int[] nArray19 = new int[lIIlIllIII[3]];
                        nArray19[A.lIIlIllIII[4]] = lIIlIllIII[10];
                        Inventory.getFirst((int[])nArray19).interact(lIIlIlIlII[lIIlIllIII[76]]);
                        Time.sleepTicks((int)lIIlIllIII[13]);

                    }
                }
                if (A.llllllllllII(hx.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && A.llllllllllIl(Players.getLocal().getWorldLocation().distanceTo(hg), lIIlIllIII[15])) {
                    AccBuilderRogues.c = lIIlIlIlII[lIIlIllIII[77]];
                    Movement.walkTo((WorldPoint)hg);

                    Time.sleepTicks((int)lIIlIllIII[3]);

                }
                if (A.lllllllllllI(Players.getLocal().getWorldLocation().distanceTo(hg), lIIlIllIII[13])) {
                    AccBuilderRogues.c = lIIlIlIlII[lIIlIllIII[78]];
                    if (A.lllllllllIIl(ck, lIIlIllIII[3])) {
                        U.jO += lIIlIllIII[3];
                        U.o(AccBuilderRogues.m);
                        ck += lIIlIllIII[3];
                        U.jO = lIIlIllIII[4];
                        cl = lIIlIllIII[4];
                    }
                    g.a(lIIlIlIlII[lIIlIllIII[79]], gz);
                }
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    private static void bw() {
        block30: {
            block34: {
                block32: {
                    block33: {
                        block31: {
                            void var3;
                            BankLocation bankLocation = BankLocation.getNearest();
                            if (A.llllllllllll(bankLocation) && A.llllllllllII(bankLocation.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                AccBuilderRogues.c = lIIlIlIlII[lIIlIllIII[97]];
                                a.a(bankLocation);
                            }
                            if (!A.llllllllllll(var3) || !A.lllllllllIll(var3.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block30;
                            if (A.llllllllllII(Bank.isOpen() ? 1 : 0)) {
                                AccBuilderRogues.c = lIIlIlIlII[lIIlIllIII[98]];
                                a.a();
                                Time.sleepUntil(() -> Bank.isOpen(), (int)lIIlIllIII[99]);

                            }
                            if (!A.lllllllllIll(Bank.isOpen() ? 1 : 0)) break block30;
                            AccBuilderRogues.c = lIIlIlIlII[lIIlIllIII[100]];
                            if (A.lIIIIIIIIIIlI(Inventory.getAll().size())) {
                                Bank.depositInventory();
                                Time.sleepTicks((int)lIIlIllIII[12]);

                            }
                            if (A.lIIIIIIIIIIlI(Equipment.getAll().size())) {
                                Bank.depositEquipment();
                                Time.sleepTicks((int)lIIlIllIII[1]);

                            }
                            while (A.llllllllllII(v.aX() ? 1 : 0) && A.llllllllllII(AccBuilderRogues.d ? 1 : 0)) {
                                v.aV();
                                Time.sleepTicks((int)lIIlIllIII[3]);

                                if (-2 < 0) continue;
                                return;
                            }
                            int[] nArray = new int[lIIlIllIII[3]];
                            nArray[A.lIIlIllIII[4]] = lIIlIllIII[7];
                            if (A.lllllllllIll(Bank.contains((int[])nArray) ? 1 : 0)) {
                                int[] nArray2 = new int[lIIlIllIII[3]];
                                nArray2[A.lIIlIllIII[4]] = lIIlIllIII[7];
                                if (A.lllllllllIIl(Bank.getFirst((int[])nArray2).getQuantity(), lIIlIllIII[101])) {
                                    A.af();
                                    System.out.println(lIIlIlIlII[lIIlIllIII[102]]);
                                    bt = lIIlIllIII[3];
                                    return;
                                }
                            }
                            int[] nArray3 = new int[lIIlIllIII[3]];
                            nArray3[A.lIIlIllIII[4]] = lIIlIllIII[6];
                            if (A.lllllllllIll(Bank.contains((int[])nArray3) ? 1 : 0)) {
                                int[] nArray4 = new int[lIIlIllIII[3]];
                                nArray4[A.lIIlIllIII[4]] = lIIlIllIII[6];
                                if (A.lllllllllIIl(Bank.getFirst((int[])nArray4).getQuantity(), lIIlIllIII[101])) {
                                    A.af();
                                    System.out.println(lIIlIlIlII[lIIlIllIII[16]]);
                                    bt = lIIlIllIII[3];
                                    return;
                                }
                            }
                            int[] nArray5 = new int[lIIlIllIII[3]];
                            nArray5[A.lIIlIllIII[4]] = lIIlIllIII[5];
                            if (A.lllllllllIll(Bank.contains((int[])nArray5) ? 1 : 0)) {
                                int[] nArray6 = new int[lIIlIllIII[3]];
                                nArray6[A.lIIlIllIII[4]] = lIIlIllIII[5];
                                if (A.lllllllllIIl(Bank.getFirst((int[])nArray6).getQuantity(), lIIlIllIII[101])) {
                                    A.af();
                                    System.out.println(lIIlIlIlII[lIIlIllIII[103]]);
                                    bt = lIIlIllIII[3];
                                    return;
                                }
                            }
                            int[] nArray7 = new int[lIIlIllIII[3]];
                            nArray7[A.lIIlIllIII[4]] = lIIlIllIII[10];
                            if (!A.lllllllllIll(Bank.contains((int[])nArray7) ? 1 : 0)) break block31;
                            int[] nArray8 = new int[lIIlIllIII[3]];
                            nArray8[A.lIIlIllIII[4]] = lIIlIllIII[10];
                            if (!A.lIIIIIIIIIIIl(Bank.getFirst((int[])nArray8).getQuantity(), lIIlIllIII[22])) break block32;
                        }
                        int[] nArray = new int[lIIlIllIII[3]];
                        nArray[A.lIIlIllIII[4]] = lIIlIllIII[9];
                        if (!A.lllllllllIll(Bank.contains((int[])nArray) ? 1 : 0)) break block33;
                        int[] nArray9 = new int[lIIlIllIII[3]];
                        nArray9[A.lIIlIllIII[4]] = lIIlIllIII[9];
                        if (!A.lIIIIIIIIIIIl(Bank.getFirst((int[])nArray9).getQuantity(), lIIlIllIII[13])) break block32;
                    }
                    int[] nArray = new int[lIIlIllIII[3]];
                    nArray[A.lIIlIllIII[4]] = lIIlIllIII[8];
                    if (!A.lllllllllIll(Bank.contains((int[])nArray) ? 1 : 0)) break block34;
                    int[] nArray10 = new int[lIIlIllIII[3]];
                    nArray10[A.lIIlIllIII[4]] = lIIlIllIII[8];
                    if (!A.lllllllllIIl(Bank.getFirst((int[])nArray10).getQuantity(), lIIlIllIII[33])) break block34;
                }
                A.af();
                System.out.println(lIIlIlIlII[lIIlIllIII[104]]);
                bt = lIIlIllIII[3];
                return;
            }
            int[] nArray = new int[lIIlIllIII[18]];
            nArray[A.lIIlIllIII[4]] = lIIlIllIII[105];
            nArray[A.lIIlIllIII[3]] = lIIlIllIII[10];
            nArray[A.lIIlIllIII[1]] = lIIlIllIII[9];
            nArray[A.lIIlIllIII[12]] = lIIlIllIII[8];
            nArray[A.lIIlIllIII[15]] = lIIlIllIII[7];
            nArray[A.lIIlIllIII[13]] = lIIlIllIII[5];
            nArray[A.lIIlIllIII[14]] = lIIlIllIII[6];
            if (A.llllllllllII(e.b(nArray) ? 1 : 0)) {
                A.af();
                System.out.println(lIIlIlIlII[lIIlIllIII[106]]);
                bt = lIIlIllIII[3];
                return;
            }
            if (A.llllllllllII(Bank.isOpen() ? 1 : 0)) {
                a.a();
                Time.sleepTicks((int)lIIlIllIII[15]);

            }
            int[] nArray11 = new int[lIIlIllIII[3]];
            nArray11[A.lIIlIllIII[4]] = lIIlIllIII[10];
            if (A.lllllllllIll(Bank.contains((int[])nArray11) ? 1 : 0)) {
                int[] nArray12 = new int[lIIlIllIII[3]];
                nArray12[A.lIIlIllIII[4]] = lIIlIllIII[10];
                if (A.lllllllllIIl(Inventory.getCount((int[])nArray12), lIIlIllIII[3])) {
                    Bank.withdraw((int)lIIlIllIII[10], (int)lIIlIllIII[13], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                    Time.sleepTicks((int)lIIlIllIII[3]);

                    Time.sleepUntil(() -> {
                        boolean bl;
                        int[] nArray = new int[lIIlIllIII[3]];
                        nArray[A.lIIlIllIII[4]] = lIIlIllIII[10];
                        if (A.lIIIIIIIIIIlI(Inventory.getCount((int[])nArray))) {
                            bl = lIIlIllIII[3];

                            if (((0x55 ^ 0x30 ^ (0x5B ^ 0x78)) & (0x9B ^ 0x86 ^ (0x9C ^ 0xC7) ^ -1)) != 0) {
                                return ((0xBC ^ 0x99 ^ (5 ^ 0x31)) & (0x7D ^ 0xB ^ (6 ^ 0x61) ^ -1)) != 0;
                            }
                        } else {
                            bl = lIIlIllIII[4];
                        }
                        return bl;
                    }, (int)lIIlIllIII[99]);

                }
            }
            int[] nArray13 = new int[lIIlIllIII[3]];
            nArray13[A.lIIlIllIII[4]] = lIIlIllIII[9];
            if (A.lllllllllIll(Bank.contains((int[])nArray13) ? 1 : 0)) {
                int[] nArray14 = new int[lIIlIllIII[3]];
                nArray14[A.lIIlIllIII[4]] = lIIlIllIII[9];
                if (A.lllllllllIIl(Inventory.getCount((int[])nArray14), lIIlIllIII[3])) {
                    Bank.withdraw((int)lIIlIllIII[9], (int)lIIlIllIII[15], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                    Time.sleepTicks((int)lIIlIllIII[3]);

                    Time.sleepUntil(() -> {
                        boolean bl;
                        int[] nArray = new int[lIIlIllIII[3]];
                        nArray[A.lIIlIllIII[4]] = lIIlIllIII[9];
                        if (A.lIIIIIIIIIIlI(Inventory.getCount((int[])nArray))) {
                            bl = lIIlIllIII[3];

                            if ((0x5F ^ 0x25 ^ (0xCA ^ 0xB4)) < ((0x6A ^ 0x5B ^ 2) & (79 + 135 - 59 + 4 ^ 141 + 38 - 166 + 159 ^ -1))) {
                                return ((0xC6 ^ 0x84 ^ (0xE0 ^ 0xAC)) & (63 + 25 - 44 + 98 ^ 121 + 119 - 186 + 74 ^ -1)) != 0;
                            }
                        } else {
                            bl = lIIlIllIII[4];
                        }
                        return bl;
                    }, (int)lIIlIllIII[99]);

                }
            }
            int[] nArray15 = new int[lIIlIllIII[3]];
            nArray15[A.lIIlIllIII[4]] = lIIlIllIII[7];
            if (A.lllllllllIll(Bank.contains((int[])nArray15) ? 1 : 0)) {
                int[] nArray16 = new int[lIIlIllIII[3]];
                nArray16[A.lIIlIllIII[4]] = lIIlIllIII[7];
                if (A.lllllllllIIl(Inventory.getCount((int[])nArray16), lIIlIllIII[3])) {
                    Bank.withdraw((int)lIIlIllIII[7], (int)lIIlIllIII[107], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                    Time.sleepTicks((int)lIIlIllIII[3]);

                    Time.sleepUntil(() -> {
                        boolean bl;
                        int[] nArray = new int[lIIlIllIII[3]];
                        nArray[A.lIIlIllIII[4]] = lIIlIllIII[7];
                        if (A.lIIIIIIIIIIlI(Inventory.getCount((int[])nArray))) {
                            bl = lIIlIllIII[3];

                            if (((0x81 ^ 0xC5 ^ (7 ^ 0x65)) & (0xEC ^ 0xC1 ^ (0x27 ^ 0x2C) ^ -1)) < -1) {
                                return ((138 + 76 - 166 + 119 ^ 76 + 12 - -24 + 78) & (0x72 ^ 0x77 ^ (0x45 ^ 0x59) ^ -1)) != 0;
                            }
                        } else {
                            bl = lIIlIllIII[4];
                        }
                        return bl;
                    }, (int)lIIlIllIII[99]);

                }
            }
            int[] nArray17 = new int[lIIlIllIII[3]];
            nArray17[A.lIIlIllIII[4]] = lIIlIllIII[5];
            if (A.lllllllllIll(Bank.contains((int[])nArray17) ? 1 : 0)) {
                int[] nArray18 = new int[lIIlIllIII[3]];
                nArray18[A.lIIlIllIII[4]] = lIIlIllIII[5];
                if (A.lllllllllIIl(Inventory.getCount((int[])nArray18), lIIlIllIII[3])) {
                    Bank.withdraw((int)lIIlIllIII[5], (int)lIIlIllIII[107], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                    Time.sleepTicks((int)lIIlIllIII[3]);

                    Time.sleepUntil(() -> {
                        boolean bl;
                        int[] nArray = new int[lIIlIllIII[3]];
                        nArray[A.lIIlIllIII[4]] = lIIlIllIII[5];
                        if (A.lIIIIIIIIIIlI(Inventory.getCount((int[])nArray))) {
                            bl = lIIlIllIII[3];

                        } else {
                            bl = lIIlIllIII[4];
                        }
                        return bl;
                    }, (int)lIIlIllIII[99]);

                }
            }
            int[] nArray19 = new int[lIIlIllIII[3]];
            nArray19[A.lIIlIllIII[4]] = lIIlIllIII[6];
            if (A.lllllllllIll(Bank.contains((int[])nArray19) ? 1 : 0)) {
                int[] nArray20 = new int[lIIlIllIII[3]];
                nArray20[A.lIIlIllIII[4]] = lIIlIllIII[6];
                if (A.lllllllllIIl(Inventory.getCount((int[])nArray20), lIIlIllIII[3])) {
                    Bank.withdraw((int)lIIlIllIII[6], (int)lIIlIllIII[107], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                    Time.sleepTicks((int)lIIlIllIII[3]);

                    Time.sleepUntil(() -> {
                        boolean bl;
                        int[] nArray = new int[lIIlIllIII[3]];
                        nArray[A.lIIlIllIII[4]] = lIIlIllIII[6];
                        if (A.lIIIIIIIIIIlI(Inventory.getCount((int[])nArray))) {
                            bl = lIIlIllIII[3];

                            if (-1 > 3) {
                                return false;
                            }
                        } else {
                            bl = lIIlIllIII[4];
                        }
                        return bl;
                    }, (int)lIIlIllIII[99]);

                }
            }
            int[] nArray21 = new int[lIIlIllIII[3]];
            nArray21[A.lIIlIllIII[4]] = lIIlIllIII[108];
            if (A.lllllllllIll(Bank.contains((int[])nArray21) ? 1 : 0)) {
                int[] nArray22 = new int[lIIlIllIII[3]];
                nArray22[A.lIIlIllIII[4]] = lIIlIllIII[108];
                if (A.llllllllllII(Inventory.contains((int[])nArray22) ? 1 : 0)) {
                    Bank.withdraw((int)lIIlIllIII[108], (int)lIIlIllIII[3], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                    Time.sleepTicks((int)lIIlIllIII[3]);

                    Time.sleepUntil(() -> {
                        int[] nArray = new int[lIIlIllIII[3]];
                        nArray[A.lIIlIllIII[4]] = lIIlIllIII[108];
                        return Inventory.contains((int[])nArray);
                    }, (int)lIIlIllIII[99]);

                }
            }
            int[] nArray23 = new int[lIIlIllIII[3]];
            nArray23[A.lIIlIllIII[4]] = lIIlIllIII[8];
            if (A.lllllllllIll(Bank.contains((int[])nArray23) ? 1 : 0)) {
                int[] nArray24 = new int[lIIlIllIII[3]];
                nArray24[A.lIIlIllIII[4]] = lIIlIllIII[8];
                if (A.lllllllllIIl(Inventory.getCount((int[])nArray24), lIIlIllIII[3])) {
                    Bank.withdrawAll((int)lIIlIllIII[8], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                    Time.sleepTicks((int)lIIlIllIII[3]);

                    Time.sleepUntil(() -> {
                        boolean bl;
                        int[] nArray = new int[lIIlIllIII[3]];
                        nArray[A.lIIlIllIII[4]] = lIIlIllIII[8];
                        if (A.lIIIIIIIIIIlI(Inventory.getCount((int[])nArray))) {
                            bl = lIIlIllIII[3];

                            if (2 >= (116 + 136 - 169 + 87 ^ 49 + 1 - 36 + 160)) {
                                return (3 & (3 ^ -1)) != 0;
                            }
                        } else {
                            bl = lIIlIllIII[4];
                        }
                        return bl;
                    }, (int)lIIlIllIII[99]);

                }
            }
        }
    }

    public static void bv() {
        if (A.lllllllllIll(Inventory.contains((int[])f.aV) ? 1 : 0) && A.lllllllllIIl(Movement.getRunEnergy(), lIIlIllIII[68])) {
            Inventory.getFirst((int[])f.aV).interact(lIIlIlIlII[lIIlIllIII[80]]);
            Time.sleepTicks((int)lIIlIllIII[3]);

        }
        if (A.llllllllllII(Movement.isRunEnabled() ? 1 : 0)) {
            Movement.toggleRun();
        }
        if (!A.llllllllllII(hv.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || A.lllllllllllI(Players.getLocal().getWorldLocation().distanceTo(hk), lIIlIllIII[1])) {
            AccBuilderRogues.c = lIIlIlIlII[lIIlIllIII[81]];
            Movement.walkTo((WorldPoint)new WorldPoint(lIIlIllIII[58], lIIlIllIII[59], lIIlIllIII[4]));

            Time.sleepTicks((int)lIIlIllIII[3]);

        }
        int[] nArray = new int[lIIlIllIII[3]];
        nArray[A.lIIlIllIII[4]] = lIIlIllIII[82];
        NPC var4 = NPCs.getNearest((int[])nArray);
        int[] nArray2 = new int[lIIlIllIII[3]];
        nArray2[A.lIIlIllIII[4]] = lIIlIllIII[60];
        if (A.llllllllllII(Inventory.contains((int[])nArray2) ? 1 : 0)) {
            if (A.lllllllllIll(gK.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && A.llllllllllll(var4) && A.lllllllllIll(gQ.contains(var4.getWorldLocation()) ? 1 : 0)) {
                Time.sleepTicks((int)lIIlIllIII[24]);

                while (A.llllllllllIl(Players.getLocal().getWorldLocation().distanceTo(gH), lIIlIllIII[3]) && A.llllllllllII(AccBuilderRogues.d ? 1 : 0)) {
                    AccBuilderRogues.c = lIIlIlIlII[lIIlIllIII[83]];
                    Movement.walkTo((WorldPoint)gH);

                    Time.sleepTicks((int)lIIlIllIII[3]);

                    if (((0x5D ^ 0x1B) & ~(0x5E ^ 0x18)) == 0) continue;
                    return;
                }
            }
            if (A.lllllllllIll(gL.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && A.llllllllllll(var4) && A.lllllllllIll(gN.contains(var4.getWorldLocation()) ? 1 : 0)) {
                while (A.llllllllllIl(Players.getLocal().getWorldLocation().distanceTo(gI), lIIlIllIII[3]) && A.llllllllllII(AccBuilderRogues.d ? 1 : 0)) {
                    AccBuilderRogues.c = lIIlIlIlII[lIIlIllIII[84]];
                    Movement.walkTo((WorldPoint)gI);

                    Time.sleepTicks((int)lIIlIllIII[3]);

                    if (2 == 2) continue;
                    return;
                }
            }
            if (A.lllllllllIll(gM.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && A.llllllllllll(var4) && A.lllllllllIll(gR.contains(var4.getWorldLocation()) ? 1 : 0)) {
                Time.sleepTicks((int)lIIlIllIII[18]);

                while (A.llllllllllIl(Players.getLocal().getWorldLocation().distanceTo(gJ), lIIlIllIII[3]) && A.llllllllllII(AccBuilderRogues.d ? 1 : 0)) {
                    AccBuilderRogues.c = lIIlIlIlII[lIIlIllIII[85]];
                    Movement.walkTo((WorldPoint)gJ);

                    Time.sleepTicks((int)lIIlIllIII[3]);

                    if (((0x6F ^ 0x27) & ~(0x3C ^ 0x74)) == 0) continue;
                    return;
                }
            }
            if (A.lllllllllIll(gP.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && A.llllllllllll(var4) && A.lllllllllIll(gR.contains(var4.getWorldLocation()) ? 1 : 0)) {
                while (A.llllllllllIl(Players.getLocal().getWorldLocation().distanceTo(hu), lIIlIllIII[1]) && A.llllllllllII(AccBuilderRogues.d ? 1 : 0)) {
                    AccBuilderRogues.c = lIIlIlIlII[lIIlIllIII[86]];
                    Movement.walkTo((WorldPoint)hu);

                    Time.sleepTicks((int)lIIlIllIII[3]);

                    if (((0x20 ^ 0x68) & ~(0x64 ^ 0x2C)) >= -1) continue;
                    return;
                }
            }
            if (A.lllllllllllI(Players.getLocal().getWorldLocation().distanceTo(hu), lIIlIllIII[12])) {
                AccBuilderRogues.c = lIIlIlIlII[lIIlIllIII[87]];
                String[] stringArray = new String[lIIlIllIII[3]];
                stringArray[A.lIIlIllIII[4]] = lIIlIlIlII[lIIlIllIII[88]];
                TileObject var5 = TileObjects.getNearest((String[])stringArray);
                if (A.llllllllllll(var5)) {
                    var5.interact(lIIlIlIlII[lIIlIllIII[89]]);
                    Time.sleepTicks((int)lIIlIllIII[1]);

                    Widget var6 = Widgets.get((int)lIIlIllIII[23], (int)lIIlIllIII[3]);
                    if (A.llllllllllll(var6)) {
                        var6.interact(lIIlIlIlII[lIIlIllIII[90]]);
                        var6.interact(lIIlIllIII[4]);
                        var6.interact(lIIlIlIlII[lIIlIllIII[91]]);
                        Keyboard.type((String)lIIlIlIlII[lIIlIllIII[92]]);
                    }
                }
            }
        }
        int[] nArray3 = new int[lIIlIllIII[3]];
        nArray3[A.lIIlIllIII[4]] = lIIlIllIII[60];
        if (A.lllllllllIll(Inventory.contains((int[])nArray3) ? 1 : 0)) {
            if (A.lllllllllllI(Players.getLocal().getWorldLocation().distanceTo(hu), lIIlIllIII[12])) {
                while (A.llllllllllIl(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lIIlIllIII[93], lIIlIllIII[94], lIIlIllIII[4])), lIIlIllIII[3]) && A.llllllllllII(AccBuilderRogues.d ? 1 : 0)) {
                    AccBuilderRogues.c = lIIlIlIlII[lIIlIllIII[95]];
                    Movement.walkTo((WorldPoint)new WorldPoint(lIIlIllIII[93], lIIlIllIII[94], lIIlIllIII[4]));

                    Time.sleepTicks((int)lIIlIllIII[3]);

                    if (1 >= 0) continue;
                    return;
                }
            }
            if (A.lllllllllllI(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lIIlIllIII[93], lIIlIllIII[94], lIIlIllIII[4])), lIIlIllIII[1]) && A.llllllllllll(var4) && A.lllllllllIll(gQ.contains(var4.getWorldLocation()) ? 1 : 0)) {
                while (A.llllllllllIl(Players.getLocal().getWorldLocation().distanceTo(gI), lIIlIllIII[3]) && A.llllllllllII(AccBuilderRogues.d ? 1 : 0)) {
                    AccBuilderRogues.c = lIIlIlIlII[lIIlIllIII[96]];
                    Movement.walkTo((WorldPoint)gI);

                    Time.sleepTicks((int)lIIlIllIII[3]);

                    if (-(89 + 38 - 57 + 57 ^ (0x4B ^ 0x30)) < 0) continue;
                    return;
                }
            }
        }
    }

    private static boolean lllllllllllI(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean llllllllllll(Object object) {
        return object != null;
    }

    private static boolean lIIIIIIIIIIII(Object object) {
        return object == null;
    }

    private static boolean lIIIIIIIIIIlI(int n2) {
        return n2 > 0;
    }

    @Override
    public boolean V() {
        boolean bl;
        if (A.lIIIIIIIIIIIl(e.j(lIIlIllIII[2]), lIIlIllIII[18])) {
            bl = lIIlIllIII[3];

            if (((0x82 ^ 0xB4) & ~(0x8D ^ 0xBB)) != 0) {
                return false;
            }
        } else {
            bl = lIIlIllIII[4];
        }
        return bl;
    }

    private static boolean lIIIIIIIIIIIl(int n2, int n3) {
        return n2 >= n3;
    }

    @Override
    public boolean S() {
        return lIIlIllIII[4];
    }

    private static boolean llllllllllIl(int n2, int n3) {
        return n2 > n3;
    }

    private static void lllllllIlIlI() {
        lIIlIlIlII = new String[lIIlIllIII[174]];
        A.lIIlIlIlII[A.lIIlIllIII[4]] = "Buying items";
        A.lIIlIlIlII[A.lIIlIllIII[3]] = "Finished buying items, switching back to questing";
        A.lIIlIlIlII[A.lIIlIllIII[1]] = "Breaking tab";
        A.lIIlIlIlII[A.lIIlIllIII[12]] = "Break";
        A.lIIlIlIlII[A.lIIlIllIII[15]] = "Nav to start";
        A.lIIlIlIlII[A.lIIlIllIII[13]] = "Drink";
        A.lIIlIlIlII[A.lIIlIllIII[14]] = "Boy";
        A.lIIlIlIlII[A.lIIlIllIII[18]] = "Navigating to outside door";
        A.lIIlIlIlII[A.lIIlIllIII[20]] = "Drop";
        A.lIIlIlIlII[A.lIIlIllIII[21]] = "Stealing key";
        A.lIIlIlIlII[A.lIIlIllIII[22]] = "Look-under";
        A.lIIlIlIlII[A.lIIlIllIII[24]] = "Continue";
        A.lIIlIlIlII[A.lIIlIllIII[25]] = "null";
        A.lIIlIlIlII[A.lIIlIllIII[26]] = " ";
        A.lIIlIlIlII[A.lIIlIllIII[27]] = "Nav to magnet box";
        A.lIIlIlIlII[A.lIIlIllIII[28]] = "Nav to magnet box";
        A.lIIlIlIlII[A.lIIlIllIII[29]] = "Cupboard";
        A.lIIlIlIlII[A.lIIlIllIII[30]] = "Taking magnet";
        A.lIIlIlIlII[A.lIIlIllIII[31]] = "Drop";
        A.lIIlIlIlII[A.lIIlIllIII[32]] = "Open";
        A.lIIlIlIlII[A.lIIlIllIII[33]] = "Open";
        A.lIIlIlIlII[A.lIIlIllIII[34]] = "Search";
        A.lIIlIlIlII[A.lIIlIllIII[35]] = "Search";
        A.lIIlIlIlII[A.lIIlIllIII[36]] = "Continue";
        A.lIIlIlIlII[A.lIIlIllIII[37]] = "null";
        A.lIIlIlIlII[A.lIIlIllIII[38]] = " ";
        A.lIIlIlIlII[A.lIIlIllIII[40]] = "Nav to magnet box";
        A.lIIlIlIlII[A.lIIlIllIII[41]] = "Cupboard";
        A.lIIlIlIlII[A.lIIlIllIII[42]] = "Taking magnet";
        A.lIIlIlIlII[A.lIIlIllIII[43]] = "Open";
        A.lIIlIlIlII[A.lIIlIllIII[44]] = "Open";
        A.lIIlIlIlII[A.lIIlIllIII[45]] = "Search";
        A.lIIlIlIlII[A.lIIlIllIII[46]] = "Search";
        A.lIIlIlIlII[A.lIIlIllIII[47]] = "Continue";
        A.lIIlIlIlII[A.lIIlIllIII[48]] = "null";
        A.lIIlIlIlII[A.lIIlIllIII[49]] = " ";
        A.lIIlIlIlII[A.lIIlIllIII[50]] = "Nav to cheese spot";
        A.lIIlIlIlII[A.lIIlIllIII[51]] = "Mouse hole";
        A.lIIlIlIlII[A.lIIlIllIII[52]] = "Mouse";
        A.lIIlIlIlII[A.lIIlIllIII[53]] = "Using cheese";
        A.lIIlIlIlII[A.lIIlIllIII[54]] = "Cheese";
        A.lIIlIlIlII[A.lIIlIllIII[55]] = "Cheese";
        A.lIIlIlIlII[A.lIIlIllIII[56]] = "Handle mouse";
        A.lIIlIlIlII[A.lIIlIllIII[57]] = "Entering maze";
        A.lIIlIlIlII[A.lIIlIllIII[61]] = "Handling walking";
        A.lIIlIlIlII[A.lIIlIllIII[63]] = "Door";
        A.lIIlIlIlII[A.lIIlIllIII[64]] = "Entering shed";
        A.lIIlIlIlII[A.lIIlIllIII[65]] = "Nav to safe spot";
        A.lIIlIlIlII[A.lIIlIllIII[66]] = "Eat";
        A.lIIlIlIlII[A.lIIlIllIII[67]] = "Casting spell";
        A.lIIlIlIlII[A.lIIlIllIII[68]] = "Fire rune";
        A.lIIlIlIlII[A.lIIlIllIII[69]] = "Fire rune";
        A.lIIlIlIlII[A.lIIlIllIII[70]] = "Ball";
        A.lIIlIlIlII[A.lIIlIllIII[71]] = "Ball";
        A.lIIlIlIlII[A.lIIlIllIII[72]] = "Taking ball";
        A.lIIlIlIlII[A.lIIlIllIII[73]] = "Take";
        A.lIIlIlIlII[A.lIIlIllIII[74]] = "Ball";
        A.lIIlIlIlII[A.lIIlIllIII[75]] = "Breaking tab";
        A.lIIlIlIlII[A.lIIlIllIII[76]] = "Break";
        A.lIIlIlIlII[A.lIIlIllIII[77]] = "Nav to witches start";
        A.lIIlIlIlII[A.lIIlIllIII[78]] = "Turning in quest";
        A.lIIlIlIlII[A.lIIlIllIII[79]] = "Boy";
        A.lIIlIlIlII[A.lIIlIllIII[80]] = "Drink";
        A.lIIlIlIlII[A.lIIlIllIII[81]] = "Entering maze";
        A.lIIlIlIlII[A.lIIlIllIII[83]] = "Nav to first spot";
        A.lIIlIlIlII[A.lIIlIllIII[84]] = "Nav to second spot";
        A.lIIlIlIlII[A.lIIlIllIII[85]] = "Nav to third spot";
        A.lIIlIlIlII[A.lIIlIllIII[86]] = "Nav to fountain";
        A.lIIlIlIlII[A.lIIlIllIII[87]] = "Getting key";
        A.lIIlIlIlII[A.lIIlIllIII[88]] = "Fountain";
        A.lIIlIlIlII[A.lIIlIllIII[89]] = "Check";
        A.lIIlIlIlII[A.lIIlIllIII[90]] = "Continue";
        A.lIIlIlIlII[A.lIIlIllIII[91]] = "null";
        A.lIIlIlIlII[A.lIIlIllIII[92]] = " ";
        A.lIIlIlIlII[A.lIIlIllIII[95]] = "Nav back toward maze";
        A.lIIlIlIlII[A.lIIlIllIII[96]] = "Nav to shed spot";
        A.lIIlIlIlII[A.lIIlIllIII[97]] = "Navigating to bank";
        A.lIIlIlIlII[A.lIIlIllIII[98]] = "Opening bank";
        A.lIIlIlIlII[A.lIIlIllIII[100]] = "Handling banking";
        A.lIIlIlIlII[A.lIIlIllIII[102]] = "We are missing supplies, switching to BUYING";
        A.lIIlIlIlII[A.lIIlIllIII[16]] = "We are missing supplies, switching to BUYING";
        A.lIIlIlIlII[A.lIIlIllIII[103]] = "We are missing supplies, switching to BUYING";
        A.lIIlIlIlII[A.lIIlIllIII[104]] = "We are missing supplies, switching to BUYING";
        A.lIIlIlIlII[A.lIIlIllIII[106]] = "We are missing supplies, switching to BUYING";
        A.lIIlIlIlII[A.lIIlIllIII[116]] = "Witches House quest";
        A.lIIlIlIlII[A.lIIlIllIII[117]] = "ring of wealth (";
        A.lIIlIlIlII[A.lIIlIllIII[163]] = "Wizard Mizgog";
        A.lIIlIlIlII[A.lIIlIllIII[164]] = "Give me a quest please.";
        A.lIIlIlIlII[A.lIIlIllIII[165]] = "I'll try.";
        A.lIIlIlIlII[A.lIIlIllIII[166]] = "Actually, I know where to find this stuff.";
        A.lIIlIlIlII[A.lIIlIllIII[167]] = "Yes.";
        A.lIIlIlIlII[A.lIIlIllIII[168]] = "What's the matter?";
        A.lIIlIlIlII[A.lIIlIllIII[169]] = "Ok, I'll see what I can do.";
    }

    @Override
    public int T() {
        A.bu();
        return lIIlIllIII[109];
    }

    private static boolean lllllllllIlI(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lllllllllIll(int n2) {
        return n2 != 0;
    }

    private static void af() {
        d var7;
        block21: {
            block20: {
                Object var8;
                block19: {
                    block18: {
                        int[] nArray = new int[lIIlIllIII[3]];
                        nArray[A.lIIlIllIII[4]] = lIIlIllIII[8];
                        if (A.llllllllllII(Bank.contains((int[])nArray) ? 1 : 0)) {
                            d d2 = new DHelper(lIIlIllIII[8], lIIlIllIII[109], lIIlIllIII[110]);
                            bv.add(d2);

                        }
                        int[] nArray2 = new int[lIIlIllIII[3]];
                        nArray2[A.lIIlIllIII[4]] = lIIlIllIII[8];
                        if (A.lllllllllIll(Bank.contains((int[])nArray2) ? 1 : 0)) {
                            int[] nArray3 = new int[lIIlIllIII[3]];
                            nArray3[A.lIIlIllIII[4]] = lIIlIllIII[8];
                            if (A.lllllllllIIl(Bank.getFirst((int[])nArray3).getQuantity(), lIIlIllIII[33])) {
                                var8 = new DHelper(lIIlIllIII[8], lIIlIllIII[54], lIIlIllIII[110]);
                                bv.add((DHelper) ar8);

                            }
                        }
                        int[] nArray4 = new int[lIIlIllIII[3]];
                        nArray4[A.lIIlIllIII[4]] = lIIlIllIII[9];
                        if (!A.lllllllllIll(Bank.contains((int[])nArray4) ? 1 : 0)) break block18;
                        int[] nArray5 = new int[lIIlIllIII[3]];
                        nArray5[A.lIIlIllIII[4]] = lIIlIllIII[9];
                        if (!A.lllllllllIll(Bank.contains((int[])nArray5) ? 1 : 0)) break block19;
                        int[] nArray6 = new int[lIIlIllIII[3]];
                        nArray6[A.lIIlIllIII[4]] = lIIlIllIII[9];
                        if (!A.lllllllllIIl(Bank.getFirst((int[])nArray6).getQuantity(), lIIlIllIII[13])) break block19;
                    }
                    var8 = new DHelper(lIIlIllIII[9], lIIlIllIII[13], lIIlIllIII[111]);
                    bv.add((DHelper) ar8);

                }
                if (A.llllllllllII(Bank.contains((Predicate)(var8 = item -> item.getName().toLowerCase().contains(lIIlIlIlII[lIIlIllIII[117]]))) ? 1 : 0)) {
                    var7 = new DHelper(lIIlIllIII[112], lIIlIllIII[31], lIIlIllIII[113]);
                    bv.add(var7);

                }
                int[] nArray = new int[lIIlIllIII[3]];
                nArray[A.lIIlIllIII[4]] = lIIlIllIII[105];
                if (A.llllllllllII(Bank.contains((int[])nArray) ? 1 : 0)) {
                    var7 = new DHelper(lIIlIllIII[105], lIIlIllIII[54], lIIlIllIII[114]);
                    bv.add(var7);

                }
                int[] nArray7 = new int[lIIlIllIII[3]];
                nArray7[A.lIIlIllIII[4]] = lIIlIllIII[10];
                if (!A.lllllllllIll(Bank.contains((int[])nArray7) ? 1 : 0)) break block20;
                int[] nArray8 = new int[lIIlIllIII[3]];
                nArray8[A.lIIlIllIII[4]] = lIIlIllIII[10];
                if (!A.lllllllllIll(Bank.contains((int[])nArray8) ? 1 : 0)) break block21;
                int[] nArray9 = new int[lIIlIllIII[3]];
                nArray9[A.lIIlIllIII[4]] = lIIlIllIII[10];
                if (!A.lllllllllIIl(Bank.getFirst((int[])nArray9).getQuantity(), lIIlIllIII[22])) break block21;
            }
            var7 = new DHelper(lIIlIllIII[10], lIIlIllIII[33], lIIlIllIII[114]);
            bv.add(var7);

        }
        int[] nArray = new int[lIIlIllIII[3]];
        nArray[A.lIIlIllIII[4]] = lIIlIllIII[108];
        if (A.llllllllllII(Bank.contains((int[])nArray) ? 1 : 0)) {
            var7 = new DHelper(lIIlIllIII[108], lIIlIllIII[13], i.bq);
            bv.add(var7);

        }
        int[] nArray10 = new int[lIIlIllIII[3]];
        nArray10[A.lIIlIllIII[4]] = lIIlIllIII[7];
        if (A.lllllllllIll(Bank.contains((int[])nArray10) ? 1 : 0)) {
            int[] nArray11 = new int[lIIlIllIII[3]];
            nArray11[A.lIIlIllIII[4]] = lIIlIllIII[7];
            if (A.lllllllllIIl(Bank.getFirst((int[])nArray11).getQuantity(), lIIlIllIII[101])) {
                var7 = new DHelper(lIIlIllIII[7], lIIlIllIII[115], lIIlIllIII[18]);
                bv.add(var7);

            }
        }
        int[] nArray12 = new int[lIIlIllIII[3]];
        nArray12[A.lIIlIllIII[4]] = lIIlIllIII[5];
        if (A.lllllllllIll(Bank.contains((int[])nArray12) ? 1 : 0)) {
            int[] nArray13 = new int[lIIlIllIII[3]];
            nArray13[A.lIIlIllIII[4]] = lIIlIllIII[5];
            if (A.lllllllllIIl(Bank.getFirst((int[])nArray13).getQuantity(), lIIlIllIII[101])) {
                var7 = new DHelper(lIIlIllIII[5], lIIlIllIII[115], lIIlIllIII[18]);
                bv.add(var7);

            }
        }
        int[] nArray14 = new int[lIIlIllIII[3]];
        nArray14[A.lIIlIllIII[4]] = lIIlIllIII[6];
        if (A.lllllllllIll(Bank.contains((int[])nArray14) ? 1 : 0)) {
            int[] nArray15 = new int[lIIlIllIII[3]];
            nArray15[A.lIIlIllIII[4]] = lIIlIllIII[6];
            if (A.lllllllllIIl(Bank.getFirst((int[])nArray15).getQuantity(), lIIlIllIII[101])) {
                var7 = new DHelper(lIIlIllIII[6], lIIlIllIII[115], lIIlIllIII[18]);
                bv.add(var7);

            }
        }
    }
}

