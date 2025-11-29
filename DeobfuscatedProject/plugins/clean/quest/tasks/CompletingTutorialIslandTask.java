/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.widgets.Dialog
 */
package gg.squire.quest.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.quest.SquireQuesterConfig;
import gg.squire.quest.SquireTutorialIsland;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.widgets.Dialog;
import s.r.s.o.l.t.t.l.r.a.-.i.n.d.u.-.q.i.i.e.a.u.A;
import gg.squire.quest.tasks.BHelper;
import s.r.s.o.l.t.t.l.r.a.-.i.n.d.u.-.q.i.i.e.a.u.C;
import gg.squire.quest.tasks.DHelper;
import s.r.s.o.l.t.t.l.r.a.-.i.n.d.u.-.q.i.i.e.a.u.E;
import gg.squire.quest.tasks.GHelper;
import gg.squire.quest.tasks.HHelper;
import gg.squire.quest.tasks.MHelper;
import gg.squire.quest.tasks.GameEnum20;
import s.r.s.o.l.t.t.l.r.a.-.i.n.d.u.-.q.i.i.e.a.u.o;
import gg.squire.quest.tasks.QuestManager;
import gg.squire.quest.tasks.QHelper;
import s.r.s.o.l.t.t.l.r.a.-.i.n.d.u.-.q.i.i.e.a.u.r;
import gg.squire.quest.tasks.SHelper;
import gg.squire.quest.tasks.THelper;
import s.r.s.o.l.t.t.l.r.a.-.i.n.d.u.-.q.i.i.e.a.u.u;
import gg.squire.quest.tasks.VHelper;
import gg.squire.quest.tasks.WHelper;
import gg.squire.quest.tasks.QuestManager;
import s.r.s.o.l.t.t.l.r.a.-.i.n.d.u.-.q.i.i.e.a.u.y;
import gg.squire.quest.tasks.ZHelper;

@TaskDesc(name="Completing Tutorial Island")
public class CompletingTutorialIslandTask
extends Task {
    
    private  int aE;
    private final  SquireTutorialIsland aK;
    
    private final  Client aI;
    private final  SquireQuesterConfig aJ;

    private static boolean lIllIllllllIlll(int n2, int n3) {
        return n2 != n3;
    }

    @Inject
    public CompletingTutorialIslandTask(Client client, SquireQuesterConfig squireQuesterConfig, SquireTutorialIsland squireTutorialIsland) {
        this.aI = client;
        this.aJ = squireQuesterConfig;
        this.aK = squireTutorialIsland;
    }

        return String.valueOf(var1);
    }

    private static boolean lIllIlllllllIll(int n2, int n3) {
        return n2 < n3;
    }

    private o a(int n2) {
        switch (n2) {
            case 1: {
                o o2;
                J var2;
                if (J.lIllIlllllllIII(M.c(lIlIIIlIlIIIl[5], lIlIIIlIlIIIl[6]) ? 1 : 0)) {
                    return new HHelper();
                }
                if (J.lIllIlllllllIIl(var2.aK.c())) {
                    o2 = new C(var2.aK);

                    if (3 < ((57 + 38 - -63 + 4 ^ 115 + 10 - -49 + 6) & (124 + 42 - 98 + 61 ^ 62 + 109 - 25 + 5 ^ -1))) {
                        return null;
                    }
                } else {
                    o2 = new GHelper(var2.aK);
                }
                return o2;
            }
            case 2: {
                o o3;
                if (!J.lIllIllllllIlIl(M.CompletingTutorialIslandTask() ? 1 : 0) || J.lIllIlllllllIII(M.I() ? 1 : 0)) {
                    o3 = new A();

                    }
                } else {
                    o3 = new WHelper(lIlIIIlIlIIII[lIlIIIlIlIIIl[1]], lIlIIIlIlIIII[lIlIIIlIlIIIl[2]]);
                }
                return o3;
            }
            case 3: {
                return new DHelper(lIlIIIlIlIIIl[7], lIlIIIlIlIIIl[8], lIlIIIlIlIIII[lIlIIIlIlIIIl[6]], lIlIIIlIlIIIl[9], lIlIIIlIlIIIl[10], lIlIIIlIlIIII[lIlIIIlIlIIIl[11]]);
            }
            case 7: {
                o o4;
                if (J.lIllIlllllllIII(M.I() ? 1 : 0)) {
                    o4 = new BHelper();

                    }
                } else {
                    o4 = new WHelper(lIlIIIlIlIIII[lIlIIIlIlIIIl[12]], lIlIIIlIlIIII[lIlIIIlIlIIIl[13]]);
                }
                return o4;
            }
            case 10: 
            case 70: 
            case 120: 
            case 130: 
            case 170: 
            case 210: 
            case 250: 
            case 300: 
            case 310: 
            case 340: 
            case 360: 
            case 500: 
            case 510: 
            case 520: 
            case 525: 
            case 540: 
            case 610: {
                return new QuestManager();
            }
            case 20: 
            case 60: {
                o o5;
                if (J.lIllIlllllllIII(M.I() ? 1 : 0)) {
                    o5 = new BHelper();

                    if (1 > 1) {
                        return null;
                    }
                } else {
                    o5 = new WHelper(lIlIIIlIlIIII[lIlIIIlIlIIIl[14]], lIlIIIlIlIIII[lIlIIIlIlIIIl[15]]);
                }
                return o5;
            }
            case 30: {
                return new DHelper(lIlIIIlIlIIIl[7], lIlIIIlIlIIIl[16], lIlIIIlIlIIII[lIlIIIlIlIIIl[17]], lIlIIIlIlIIIl[9], lIlIIIlIlIIIl[18], lIlIIIlIlIIII[lIlIIIlIlIIIl[19]]);
            }
            case 40: {
                return new WHelper(lIlIIIlIlIIII[lIlIIIlIlIIIl[20]], lIlIIIlIlIIII[lIlIIIlIlIIIl[21]]);
            }
            case 50: {
                return new DHelper(lIlIIIlIlIIIl[7], lIlIIIlIlIIIl[22], lIlIIIlIlIIII[lIlIIIlIlIIIl[23]], lIlIIIlIlIIIl[9], lIlIIIlIlIIIl[24], lIlIIIlIlIIII[lIlIIIlIlIIIl[25]]);
            }
            case 80: {
                return new r();
            }
            case 90: {
                return new QHelper();
            }
            case 140: {
                o o6;
                if (J.lIllIlllllllIII(M.I() ? 1 : 0)) {
                    o6 = new BHelper();

                    }
                } else {
                    o6 = new WHelper(lIlIIIlIlIIII[lIlIIIlIlIIIl[26]], lIlIIIlIlIIII[lIlIIIlIlIIIl[27]]);
                }
                return o6;
            }
            case 150: {
                return new SHelper();
            }
            case 160: {
                return new QuestManager();
            }
            case 200: {
                return new E(lIlIIIlIlIIIl[28], lIlIIIlIlIIIl[29], lIlIIIlIlIIII[lIlIIIlIlIIIl[30]]);
            }
            case 220: 
            case 240: {
                o o7;
                if (J.lIllIlllllllIII(M.I() ? 1 : 0)) {
                    o7 = new BHelper();

                    if (1 != 1) {
                        return null;
                    }
                } else {
                    o7 = new WHelper(lIlIIIlIlIIII[lIlIIIlIlIIIl[31]], lIlIIIlIlIIII[lIlIIIlIlIIIl[32]]);
                }
                return o7;
            }
            case 230: {
                return new DHelper(lIlIIIlIlIIIl[7], lIlIIIlIlIIIl[33], lIlIIIlIlIIII[lIlIIIlIlIIIl[34]], lIlIIIlIlIIIl[9], lIlIIIlIlIIIl[35], lIlIIIlIlIIII[lIlIIIlIlIIIl[36]]);
            }
            case 260: 
            case 330: {
                o o8;
                String[] stringArray = new String[lIlIIIlIlIIIl[2]];
                stringArray[J.lIlIIIlIlIIIl[1]] = lIlIIIlIlIIII[lIlIIIlIlIIIl[37]];
                if (J.lIllIlllllllIIl(NPCs.getNearest((String[])stringArray))) {
                    return new ZHelper(new WorldPoint(lIlIIIlIlIIIl[38], lIlIIIlIlIIIl[39], lIlIIIlIlIIIl[1]));
                }
                if (J.lIllIlllllllIII(M.I() ? 1 : 0)) {
                    o8 = new BHelper();

                    if (((0xE2 ^ 0xBE) & ~(0xDB ^ 0x87)) > 0) {
                        return null;
                    }
                } else {
                    o8 = new WHelper(lIlIIIlIlIIII[lIlIIIlIlIIIl[40]], lIlIIIlIlIIII[lIlIIIlIlIIIl[41]]);
                }
                return o8;
            }
            case 320: {
                return new THelper();
            }
            case 350: {
                return new E(lIlIIIlIlIIIl[42], lIlIIIlIlIIIl[19], lIlIIIlIlIIII[lIlIIIlIlIIIl[43]]);
            }
            case 370: 
            case 410: 
            case 470: {
                o o9;
                if (J.lIllIlllllllIII(M.I() ? 1 : 0)) {
                    o9 = new BHelper();

                } else {
                    o9 = new WHelper(lIlIIIlIlIIII[lIlIIIlIlIIIl[44]], lIlIIIlIlIIII[lIlIIIlIlIIIl[45]]);
                }
                return o9;
            }
            case 390: {
                return new DHelper(lIlIIIlIlIIIl[7], lIlIIIlIlIIIl[46], lIlIIIlIlIIII[lIlIIIlIlIIIl[29]], lIlIIIlIlIIIl[9], lIlIIIlIlIIIl[47], lIlIIIlIlIIII[lIlIIIlIlIIIl[48]]);
            }
            case 400: {
                return new E(lIlIIIlIlIIIl[49], lIlIIIlIlIIIl[2], lIlIIIlIlIIII[lIlIIIlIlIIIl[50]]);
            }
            case 405: {
                return new u(lIlIIIlIlIIIl[51]);
            }
            case 420: {
                int[] nArray = new int[lIlIIIlIlIIIl[2]];
                nArray[J.lIlIIIlIlIIIl[1]] = lIlIIIlIlIIIl[52];
                if (J.lIllIllllllIlIl(Equipment.contains((int[])nArray) ? 1 : 0)) {
                    return new u(lIlIIIlIlIIIl[52]);
                }
                return new u(lIlIIIlIlIIIl[53]);
            }
            case 430: {
                return new DHelper(lIlIIIlIlIIIl[7], lIlIIIlIlIIIl[54], lIlIIIlIlIIII[lIlIIIlIlIIIl[55]], lIlIIIlIlIIIl[9], lIlIIIlIlIIIl[56], lIlIIIlIlIIII[lIlIIIlIlIIIl[57]]);
            }
            case 440: {
                return new y(new WorldPoint(lIlIIIlIlIIIl[58], lIlIIIlIlIIIl[59], lIlIIIlIlIIIl[1]), lIlIIIlIlIIII[lIlIIIlIlIIIl[60]]);
            }
            case 450: {
                return new VHelper(lIlIIIlIlIIII[lIlIIIlIlIIIl[61]], lIlIIIlIlIIII[lIlIIIlIlIIIl[62]], lIlIIIlIlIIIl[1], lIlIIIlIlIIIl[1]);
            }
            case 480: {
                int[] nArray = new int[lIlIIIlIlIIIl[2]];
                nArray[J.lIlIIIlIlIIIl[1]] = lIlIIIlIlIIIl[63];
                if (J.lIllIllllllIlIl(Equipment.contains((int[])nArray) ? 1 : 0)) {
                    return new u(lIlIIIlIlIIIl[63]);
                }
                int[] nArray2 = new int[lIlIIIlIlIIIl[2]];
                nArray2[J.lIlIIIlIlIIIl[1]] = lIlIIIlIlIIIl[64];
                if (J.lIllIllllllIlIl(Equipment.contains((int[])nArray2) ? 1 : 0)) {
                    return new u(lIlIIIlIlIIIl[64]);
                }
                return new VHelper(lIlIIIlIlIIII[lIlIIIlIlIIIl[65]], lIlIIIlIlIIII[lIlIIIlIlIIIl[66]], lIlIIIlIlIIIl[2], lIlIIIlIlIIIl[1]);
            }
            case 530: 
            case 532: {
                o o10;
                if (J.lIllIlllllllIII(M.I() ? 1 : 0)) {
                    o10 = new BHelper();

                    if (((0x98 ^ 0xB0 ^ (0xA0 ^ 0x85)) & (0x29 ^ 0x5A ^ (0x22 ^ 0x5C) ^ -1)) > 3) {
                        return null;
                    }
                } else {
                    o10 = new WHelper(lIlIIIlIlIIII[lIlIIIlIlIIIl[67]], lIlIIIlIlIIII[lIlIIIlIlIIIl[68]]);
                }
                return o10;
            }
            case 531: {
                return new DHelper(lIlIIIlIlIIIl[7], lIlIIIlIlIIIl[69], lIlIIIlIlIIII[lIlIIIlIlIIIl[70]], lIlIIIlIlIIIl[9], lIlIIIlIlIIIl[70], lIlIIIlIlIIII[lIlIIIlIlIIIl[71]]);
            }
            case 550: 
            case 570: 
            case 600: {
                o o11;
                String[] stringArray = new String[lIlIIIlIlIIIl[2]];
                stringArray[J.lIlIIIlIlIIIl[1]] = lIlIIIlIlIIII[lIlIIIlIlIIIl[10]];
                if (J.lIllIlllllllIIl(NPCs.getNearest((String[])stringArray))) {
                    return new ZHelper(new WorldPoint(lIlIIIlIlIIIl[72], lIlIIIlIlIIIl[73], lIlIIIlIlIIIl[1]));
                }
                if (J.lIllIlllllllIII(M.I() ? 1 : 0)) {
                    o11 = new BHelper();

                    if ((73 + 28 - 12 + 71 ^ 100 + 86 - 164 + 142) == 1) {
                        return null;
                    }
                } else {
                    o11 = new WHelper(lIlIIIlIlIIII[lIlIIIlIlIIIl[74]], lIlIIIlIlIIII[lIlIIIlIlIIIl[75]]);
                }
                return o11;
            }
            case 560: {
                return new DHelper(lIlIIIlIlIIIl[7], lIlIIIlIlIIIl[76], lIlIIIlIlIIII[lIlIIIlIlIIIl[77]], lIlIIIlIlIIIl[9], lIlIIIlIlIIIl[78], lIlIIIlIlIIII[lIlIIIlIlIIIl[79]]);
            }
            case 580: {
                return new DHelper(lIlIIIlIlIIIl[7], lIlIIIlIlIIIl[80], lIlIIIlIlIIII[lIlIIIlIlIIIl[81]], lIlIIIlIlIIIl[9], lIlIIIlIlIIIl[71], lIlIIIlIlIIII[lIlIIIlIlIIIl[82]]);
            }
            case 620: 
            case 640: 
            case 670: {
                o o12;
                J var2;
                String[] stringArray = new String[lIlIIIlIlIIIl[2]];
                stringArray[J.lIlIIIlIlIIIl[1]] = lIlIIIlIlIIII[lIlIIIlIlIIIl[69]];
                if (J.lIllIlllllllIIl(NPCs.getNearest((String[])stringArray))) {
                    return new ZHelper(new WorldPoint(lIlIIIlIlIIIl[83], lIlIIIlIlIIIl[84], lIlIIIlIlIIIl[1]));
                }
                if (J.lIllIlllllllIII(Dialog.isViewingOptions() ? 1 : 0)) {
                    if (J.lIllIlllllllIII(var2.aJ.ironman() ? 1 : 0)) {
                        return null;
                    }
                    if (J.lIllIlllllllIII(Dialog.hasOption((String)lIlIIIlIlIIII[lIlIIIlIlIIIl[80]]) ? 1 : 0)) {
                        Dialog.chooseOption((int)lIlIIIlIlIIIl[2]);

                    }
                    if (J.lIllIlllllllIII(Dialog.hasOption((String)lIlIIIlIlIIII[lIlIIIlIlIIIl[85]]) ? 1 : 0)) {
                        Dialog.chooseOption((int)lIlIIIlIlIIIl[11]);

                    }
                    if (J.lIllIlllllllIII(Dialog.hasOption((String)lIlIIIlIlIIII[lIlIIIlIlIIIl[8]]) ? 1 : 0)) {
                        Dialog.chooseOption((int)lIlIIIlIlIIIl[2]);

                    }
                    return null;
                }
                if (J.lIllIlllllllIII(M.I() ? 1 : 0)) {
                    o12 = new BHelper();

                    if (1 == -1) {
                        return null;
                    }
                } else {
                    o12 = new WHelper(lIlIIIlIlIIII[lIlIIIlIlIIIl[56]], lIlIIIlIlIIII[lIlIIIlIlIIIl[24]]);
                }
                return o12;
            }
            case 630: {
                return new DHelper(lIlIIIlIlIIIl[7], lIlIIIlIlIIIl[86], lIlIIIlIlIIII[lIlIIIlIlIIIl[35]], lIlIIIlIlIIIl[9], lIlIIIlIlIIIl[87], lIlIIIlIlIIII[lIlIIIlIlIIIl[18]]);
            }
            case 650: {
                return new VHelper(lIlIIIlIlIIII[lIlIIIlIlIIIl[47]], lIlIIIlIlIIII[lIlIIIlIlIIIl[78]], lIlIIIlIlIIIl[1], lIlIIIlIlIIIl[2]);
            }
        }
        return null;
    }

    private static boolean lIllIllllllIlIl(int n2) {
        return n2 == 0;
    }

    private static void lIllIllllllIIlI() {
        lIlIIIlIlIIII = new String[lIlIIIlIlIIIl[87]];
        J.lIlIIIlIlIIII[J.lIlIIIlIlIIIl[1]] = "Gielinor Guide";
        J.lIlIIIlIlIIII[J.lIlIIIlIlIIIl[2]] = "Talk-to";
        J.lIlIIIlIlIIII[J.lIlIIIlIlIIIl[6]] = "Settings";
        J.lIlIIIlIlIIII[J.lIlIIIlIlIIIl[11]] = "Settings";
        J.lIlIIIlIlIIII[J.lIlIIIlIlIIIl[12]] = "Gielinor Guide";
        J.lIlIIIlIlIIII[J.lIlIIIlIlIIIl[13]] = "Talk-to";
        J.lIlIIIlIlIIII[J.lIlIIIlIlIIIl[14]] = "Survival Expert";
        J.lIlIIIlIlIIII[J.lIlIIIlIlIIIl[15]] = "Talk-to";
        J.lIlIIIlIlIIII[J.lIlIIIlIlIIIl[17]] = "Inventory";
        J.lIlIIIlIlIIII[J.lIlIIIlIlIIIl[19]] = "Inventory";
        J.lIlIIIlIlIIII[J.lIlIIIlIlIIIl[20]] = "Fishing spot";
        J.lIlIIIlIlIIII[J.lIlIIIlIlIIIl[21]] = "Net";
        J.lIlIIIlIlIIII[J.lIlIIIlIlIIIl[23]] = "Skills";
        J.lIlIIIlIlIIII[J.lIlIIIlIlIIIl[25]] = "Skills";
        J.lIlIIIlIlIIII[J.lIlIIIlIlIIIl[26]] = "Master Chef";
        J.lIlIIIlIlIIII[J.lIlIIIlIlIIIl[27]] = "Talk-to";
        J.lIlIIIlIlIIII[J.lIlIIIlIlIIIl[30]] = "Toggle Run";
        J.lIlIIIlIlIIII[J.lIlIIIlIlIIIl[31]] = "Quest Guide";
        J.lIlIIIlIlIIII[J.lIlIIIlIlIIIl[32]] = "Talk-to";
        J.lIlIIIlIlIIII[J.lIlIIIlIlIIIl[34]] = "Quest List";
        J.lIlIIIlIlIIII[J.lIlIIIlIlIIIl[36]] = "Quest List";
        J.lIlIIIlIlIIII[J.lIlIIIlIlIIIl[37]] = "Mining Instructor";
        J.lIlIIIlIlIIII[J.lIlIIIlIlIIIl[40]] = "Mining Instructor";
        J.lIlIIIlIlIIII[J.lIlIIIlIlIIIl[41]] = "Talk-to";
        J.lIlIIIlIlIIII[J.lIlIIIlIlIIIl[43]] = "Smith";
        J.lIlIIIlIlIIII[J.lIlIIIlIlIIIl[44]] = "Combat Instructor";
        J.lIlIIIlIlIIII[J.lIlIIIlIlIIIl[45]] = "Talk-to";
        J.lIlIIIlIlIIII[J.lIlIIIlIlIIIl[29]] = "Worn Equipment";
        J.lIlIIIlIlIIII[J.lIlIIIlIlIIIl[48]] = "Worn Equipment";
        J.lIlIIIlIlIIII[J.lIlIIIlIlIIIl[50]] = "View equipment stats";
        J.lIlIIIlIlIIII[J.lIlIIIlIlIIIl[55]] = "Combat Options";
        J.lIlIIIlIlIIII[J.lIlIIIlIlIIIl[57]] = "Combat Options";
        J.lIlIIIlIlIIII[J.lIlIIIlIlIIIl[60]] = "Gate";
        J.lIlIIIlIlIIII[J.lIlIIIlIlIIIl[61]] = "Giant rat";
        J.lIlIIIlIlIIII[J.lIlIIIlIlIIIl[62]] = "Attack";
        J.lIlIIIlIlIIII[J.lIlIIIlIlIIIl[65]] = "Giant rat";
        J.lIlIIIlIlIIII[J.lIlIIIlIlIIIl[66]] = "Attack";
        J.lIlIIIlIlIIII[J.lIlIIIlIlIIIl[67]] = "Account Guide";
        J.lIlIIIlIlIIII[J.lIlIIIlIlIIIl[68]] = "Talk-to";
        J.lIlIIIlIlIIII[J.lIlIIIlIlIIIl[70]] = "Account Management";
        J.lIlIIIlIlIIII[J.lIlIIIlIlIIIl[71]] = "Account Management";
        J.lIlIIIlIlIIII[J.lIlIIIlIlIIIl[10]] = "Brother Brace";
        J.lIlIIIlIlIIII[J.lIlIIIlIlIIIl[74]] = "Brother Brace";
        J.lIlIIIlIlIIII[J.lIlIIIlIlIIIl[75]] = "Talk-to";
        J.lIlIIIlIlIIII[J.lIlIIIlIlIIIl[77]] = "Prayer";
        J.lIlIIIlIlIIII[J.lIlIIIlIlIIIl[79]] = "Prayer";
        J.lIlIIIlIlIIII[J.lIlIIIlIlIIIl[81]] = "Friends List";
        J.lIlIIIlIlIIII[J.lIlIIIlIlIIIl[82]] = "Friends List";
        J.lIlIIIlIlIIII[J.lIlIIIlIlIIIl[69]] = "Magic Instructor";
        J.lIlIIIlIlIIII[J.lIlIIIlIlIIIl[80]] = "Yes.";
        J.lIlIIIlIlIIII[J.lIlIIIlIlIIIl[85]] = "No, I'm not planning to do that.";
        J.lIlIIIlIlIIII[J.lIlIIIlIlIIIl[8]] = "Yes, send me to the mainland";
        J.lIlIIIlIlIIII[J.lIlIIIlIlIIIl[56]] = "Magic Instructor";
        J.lIlIIIlIlIIII[J.lIlIIIlIlIIIl[24]] = "Talk-to";
        J.lIlIIIlIlIIII[J.lIlIIIlIlIIIl[35]] = "Magic";
        J.lIlIIIlIlIIII[J.lIlIIIlIlIIIl[18]] = "Magic";
        J.lIlIIIlIlIIII[J.lIlIIIlIlIIIl[47]] = "Chicken";
        J.lIlIIIlIlIIII[J.lIlIIIlIlIIIl[78]] = "Attack";
    }

    static {
        J.lIllIllllllIIll();
        J.lIllIllllllIIlI();
    }

    private static boolean lIllIllllllIllI(int n2, int n3) {
        return n2 >= n3;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var3;
        J var4;
        int n2 = Vars.getVarp((int)lIlIIIlIlIIIl[0]);
        o o2 = this.a(n2);
        if (J.lIllIllllllIlII(o2)) {
            return o2.D();
        }
        if (J.lIllIllllllIlIl(var4.aJ.quest().equals((Object)h.TUTORIAL_ISLAND) ? 1 : 0)) {
            return lIlIIIlIlIIIl[1];
        }
        if (J.lIllIllllllIllI(var4.aE, lIlIIIlIlIIIl[2])) {
            System.out.println("[DEVELOPER]: Delay " + var4.aE + " Step: " + (int)var3);
            var4.aE -= lIlIIIlIlIIIl[2];
            return lIlIIIlIlIIIl[1];
        }
        if (J.lIllIllllllIlIl(Movement.shouldWalk() ? 1 : 0)) {
            return lIlIIIlIlIIIl[1];
        }
        if (J.lIllIllllllIlll(Players.getLocal().getAnimation(), lIlIIIlIlIIIl[3])) {
            return lIlIIIlIlIIIl[1];
        }
        if (J.lIllIllllllIllI((int)var3, lIlIIIlIlIIIl[4])) {
            return lIlIIIlIlIIIl[1];
        }
        return lIlIIIlIlIIIl[2];
    }

    private static boolean lIllIlllllllIII(int n2) {
        return n2 != 0;
    }

    private static boolean lIllIlllllllIIl(Object object) {
        return object == null;
    }

    private static boolean lIllIllllllIlII(Object object) {
        return object != null;
    }
}

