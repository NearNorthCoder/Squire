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
import net.runelite.api.Client;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.widgets.Dialog;
import gg.squire.quest.tasks.AHelper;
import gg.squire.quest.tasks.BHelper;
import gg.squire.quest.tasks.CHelper;
import gg.squire.quest.tasks.DHelper;
import gg.squire.quest.tasks.EHelper;
import gg.squire.quest.tasks.QuestManager;
import gg.squire.quest.tasks.QuestManager;
import gg.squire.quest.tasks.QuestManager;
import gg.squire.quest.tasks.GameEnum3;
import gg.squire.quest.tasks.QuestManager;
import gg.squire.quest.tasks.QuestManager;
import gg.squire.quest.tasks.RHelper;
import gg.squire.quest.tasks.SHelper;
import gg.squire.quest.tasks.QuestManager;
import gg.squire.quest.tasks.UHelper;
import gg.squire.quest.tasks.QuestManager;
import gg.squire.quest.tasks.WHelper;
import gg.squire.quest.tasks.QuestManager;
import gg.squire.quest.tasks.YHelper;
import gg.squire.quest.tasks.ZHelper;

@TaskDesc(name="Completing Tutorial Island")
public class CompletingTutorialIslandTask
extends Task {
    
    private  int aE;
    private final  SquireTutorialIsland aK;
    
    private final  Client aI;
    private final  SquireQuesterConfig aJ;

    private static boolean var3(int n2, int n3) {
        return n2 != n3;
    }

    @Inject
    public CompletingTutorialIslandTask(Client client, SquireQuesterConfig squireQuesterConfig, SquireTutorialIsland squireTutorialIsland) {
        this.aI = client;
        this.aJ = squireQuesterConfig;
        this.aK = squireTutorialIsland;
    }

    private static String var4(String var5, String var6) {
        var5 = new String(Base64.getDecoder().decode(var5.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var7 = new StringBuilder();
        char[] var8 = var6.toCharArray();
        int var9 = var1[1];
        char[] var10 = var5.toCharArray();
        int var11 = var10.length;
        int var12 = var1[1];
        while (J.var13(var12, var11)) {
            char var14 = var10[var12];
            var7.append((char)(var14 ^ var8[var9 % var8.length]));
            0;
            ++var9;
            ++var12;
            0;
            if null == null continue;
            return null;
        }
        return String.valueOf(var7);
    }

    private static boolean var13(int n2, int n3) {
        return n2 < n3;
    }

    private o a(int n2) {
        switch (n2) {
            case 1: {
                o o2;
                J var15;
                if (J.var16(M.c(var1[5], var1[6]) ? 1 : 0)) {
                    return new QuestManager();
                }
                if (J.var17(var15.aK.c())) {
                    o2 = new CHelper(var15.aK);
                    0;
                    if (3 < ((57 + 38 - -63 + 4 ^ 115 + 10 - -49 + 6) & (124 + 42 - 98 + 61 ^ 62 + 109 - 25 + 5 ^ -1))) {
                        return null;
                    }
                } else {
                    o2 = new QuestManager(var15.aK);
                }
                return o2;
            }
            case 2: {
                o o3;
                if (!J.var18(M.CompletingTutorialIslandTask() ? 1 : 0) || J.var16(M.I() ? 1 : 0)) {
                    o3 = new AHelper();
                    0;
                    if null != null {
                        return null;
                    }
                } else {
                    o3 = new WHelper(var2[var1[1]], var2[var1[2]]);
                }
                return o3;
            }
            case 3: {
                return new DHelper(var1[7], var1[8], var2[var1[6]], var1[9], var1[10], var2[var1[11]]);
            }
            case 7: {
                o o4;
                if (J.var16(M.I() ? 1 : 0)) {
                    o4 = new BHelper();
                    0;
                    if null != null {
                        return null;
                    }
                } else {
                    o4 = new WHelper(var2[var1[12]], var2[var1[13]]);
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
                if (J.var16(M.I() ? 1 : 0)) {
                    o5 = new BHelper();
                    0;
                    if (1 > 1) {
                        return null;
                    }
                } else {
                    o5 = new WHelper(var2[var1[14]], var2[var1[15]]);
                }
                return o5;
            }
            case 30: {
                return new DHelper(var1[7], var1[16], var2[var1[17]], var1[9], var1[18], var2[var1[19]]);
            }
            case 40: {
                return new WHelper(var2[var1[20]], var2[var1[21]]);
            }
            case 50: {
                return new DHelper(var1[7], var1[22], var2[var1[23]], var1[9], var1[24], var2[var1[25]]);
            }
            case 80: {
                return new RHelper();
            }
            case 90: {
                return new QuestManager();
            }
            case 140: {
                o o6;
                if (J.var16(M.I() ? 1 : 0)) {
                    o6 = new BHelper();
                    0;
                    if null != null {
                        return null;
                    }
                } else {
                    o6 = new WHelper(var2[var1[26]], var2[var1[27]]);
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
                return new EHelper(var1[28], var1[29], var2[var1[30]]);
            }
            case 220: 
            case 240: {
                o o7;
                if (J.var16(M.I() ? 1 : 0)) {
                    o7 = new BHelper();
                    0;
                    if (1 != 1) {
                        return null;
                    }
                } else {
                    o7 = new WHelper(var2[var1[31]], var2[var1[32]]);
                }
                return o7;
            }
            case 230: {
                return new DHelper(var1[7], var1[33], var2[var1[34]], var1[9], var1[35], var2[var1[36]]);
            }
            case 260: 
            case 330: {
                o o8;
                String[] stringArray = new String[var1[2]];
                stringArray[J.var1[1]] = var2[var1[37]];
                if (J.var17(NPCs.getNearest((String[])stringArray))) {
                    return new ZHelper(new WorldPoint(var1[38], var1[39], var1[1]));
                }
                if (J.var16(M.I() ? 1 : 0)) {
                    o8 = new BHelper();
                    0;
                    if (((0xE2 ^ 0xBE) & ~(0xDB ^ 0x87)) > 0) {
                        return null;
                    }
                } else {
                    o8 = new WHelper(var2[var1[40]], var2[var1[41]]);
                }
                return o8;
            }
            case 320: {
                return new QuestManager();
            }
            case 350: {
                return new EHelper(var1[42], var1[19], var2[var1[43]]);
            }
            case 370: 
            case 410: 
            case 470: {
                o o9;
                if (J.var16(M.I() ? 1 : 0)) {
                    o9 = new BHelper();
                    0;
                    if (-2 > 0) {
                        return null;
                    }
                } else {
                    o9 = new WHelper(var2[var1[44]], var2[var1[45]]);
                }
                return o9;
            }
            case 390: {
                return new DHelper(var1[7], var1[46], var2[var1[29]], var1[9], var1[47], var2[var1[48]]);
            }
            case 400: {
                return new EHelper(var1[49], var1[2], var2[var1[50]]);
            }
            case 405: {
                return new UHelper(var1[51]);
            }
            case 420: {
                int[] nArray = new int[var1[2]];
                nArray[J.var1[1]] = var1[52];
                if (J.var18(Equipment.contains((int[])nArray) ? 1 : 0)) {
                    return new UHelper(var1[52]);
                }
                return new UHelper(var1[53]);
            }
            case 430: {
                return new DHelper(var1[7], var1[54], var2[var1[55]], var1[9], var1[56], var2[var1[57]]);
            }
            case 440: {
                return new YHelper(new WorldPoint(var1[58], var1[59], var1[1]), var2[var1[60]]);
            }
            case 450: {
                return new QuestManager(var2[var1[61]], var2[var1[62]], var1[1], var1[1]);
            }
            case 480: {
                int[] nArray = new int[var1[2]];
                nArray[J.var1[1]] = var1[63];
                if (J.var18(Equipment.contains((int[])nArray) ? 1 : 0)) {
                    return new UHelper(var1[63]);
                }
                int[] nArray2 = new int[var1[2]];
                nArray2[J.var1[1]] = var1[64];
                if (J.var18(Equipment.contains((int[])nArray2) ? 1 : 0)) {
                    return new UHelper(var1[64]);
                }
                return new QuestManager(var2[var1[65]], var2[var1[66]], var1[2], var1[1]);
            }
            case 530: 
            case 532: {
                o o10;
                if (J.var16(M.I() ? 1 : 0)) {
                    o10 = new BHelper();
                    0;
                    if (((0x98 ^ 0xB0 ^ (0xA0 ^ 0x85)) & (0x29 ^ 0x5A ^ (0x22 ^ 0x5C) ^ -1)) > 3) {
                        return null;
                    }
                } else {
                    o10 = new WHelper(var2[var1[67]], var2[var1[68]]);
                }
                return o10;
            }
            case 531: {
                return new DHelper(var1[7], var1[69], var2[var1[70]], var1[9], var1[70], var2[var1[71]]);
            }
            case 550: 
            case 570: 
            case 600: {
                o o11;
                String[] stringArray = new String[var1[2]];
                stringArray[J.var1[1]] = var2[var1[10]];
                if (J.var17(NPCs.getNearest((String[])stringArray))) {
                    return new ZHelper(new WorldPoint(var1[72], var1[73], var1[1]));
                }
                if (J.var16(M.I() ? 1 : 0)) {
                    o11 = new BHelper();
                    0;
                    if ((73 + 28 - 12 + 71 ^ 100 + 86 - 164 + 142) == 1) {
                        return null;
                    }
                } else {
                    o11 = new WHelper(var2[var1[74]], var2[var1[75]]);
                }
                return o11;
            }
            case 560: {
                return new DHelper(var1[7], var1[76], var2[var1[77]], var1[9], var1[78], var2[var1[79]]);
            }
            case 580: {
                return new DHelper(var1[7], var1[80], var2[var1[81]], var1[9], var1[71], var2[var1[82]]);
            }
            case 620: 
            case 640: 
            case 670: {
                o o12;
                J var15;
                String[] stringArray = new String[var1[2]];
                stringArray[J.var1[1]] = var2[var1[69]];
                if (J.var17(NPCs.getNearest((String[])stringArray))) {
                    return new ZHelper(new WorldPoint(var1[83], var1[84], var1[1]));
                }
                if (J.var16(Dialog.isViewingOptions() ? 1 : 0)) {
                    if (J.var16(var15.aJ.ironman() ? 1 : 0)) {
                        return null;
                    }
                    if (J.var16(Dialog.hasOption((String)var2[var1[80]]) ? 1 : 0)) {
                        Dialog.chooseOption((int)var1[2]);
                        0;
                    }
                    if (J.var16(Dialog.hasOption((String)var2[var1[85]]) ? 1 : 0)) {
                        Dialog.chooseOption((int)var1[11]);
                        0;
                    }
                    if (J.var16(Dialog.hasOption((String)var2[var1[8]]) ? 1 : 0)) {
                        Dialog.chooseOption((int)var1[2]);
                        0;
                    }
                    return null;
                }
                if (J.var16(M.I() ? 1 : 0)) {
                    o12 = new BHelper();
                    0;
                    if (1 == -1) {
                        return null;
                    }
                } else {
                    o12 = new WHelper(var2[var1[56]], var2[var1[24]]);
                }
                return o12;
            }
            case 630: {
                return new DHelper(var1[7], var1[86], var2[var1[35]], var1[9], var1[87], var2[var1[18]]);
            }
            case 650: {
                return new QuestManager(var2[var1[47]], var2[var1[78]], var1[1], var1[2]);
            }
        }
        return null;
    }

    private static boolean var18(int n2) {
        return n2 == 0;
    }

    private static void var19() {
        var1 = new int[88];
        J.var1[0] = -(0xFFFFBE2B & 0x7DD7) & (0xFFFFFFFB & 0x3D1F);
        J.var1[1] = (180 + 178 - 178 + 50 ^ 140 + 161 - 292 + 171) & (0x2E ^ 0x61 ^ (0x59 ^ 0x44) ^ -1);
        J.var1[2] = 1;
        J.var1[3] = -1;
        J.var1[4] = 0xFFFFF3EA & 0xFFD;
        J.var1[5] = -(0xFFFFFB9B & 0x7C75) & (0xFFFFFAFF & 0x7FB7);
        J.var1[6] = 2;
        J.var1[7] = 0xFFFFCB25 & 0x36FE;
        J.var1[8] = 0x2B ^ 0x38 ^ (0xE6 ^ 0xC6);
        J.var1[9] = (0x7A ^ 0x4C) + (0xAF ^ 0xA6) - (0x78 ^ 0x52) + (13 + 102 - 62 + 90);
        J.var1[10] = 77 + 53 - 83 + 100 ^ 53 + 5 - 50 + 178;
        J.var1[11] = 3;
        J.var1[12] = 9 ^ 0x48 ^ (0x7B ^ 0x3E);
        J.var1[13] = 16 + 189 - 91 + 84 ^ 69 + 119 - 35 + 42;
        J.var1[14] = 5 ^ 0x3C ^ (0x74 ^ 0x4B);
        J.var1[15] = 0x42 ^ 0x2C ^ (0x65 ^ 0xC);
        J.var1[16] = 51 + 126 - 96 + 54 ^ 77 + 92 - 140 + 168;
        J.var1[17] = 0xD4 ^ 0xC4 ^ (0x5A ^ 0x42);
        J.var1[18] = 0x65 ^ 0x4F ^ (0x92 ^ 0x8F);
        J.var1[19] = 0x16 ^ 0x1F;
        J.var1[20] = 0x85 ^ 0x8F;
        J.var1[21] = 0x5D ^ 4 ^ (0xE1 ^ 0xB3);
        J.var1[22] = 0x72 ^ 0x20 ^ (0x3B ^ 0x29);
        J.var1[23] = 0x49 ^ 0x15 ^ (0xE9 ^ 0xB9);
        J.var1[24] = 8 ^ 0x23 ^ (0x26 ^ 0x38);
        J.var1[25] = 2 ^ (0x71 ^ 0x7E);
        J.var1[26] = 0xF5 ^ 0xAE ^ (0xD6 ^ 0x83);
        J.var1[27] = 3 ^ (0x65 ^ 0x69);
        J.var1[28] = 36 + 14 - -109 + 1;
        J.var1[29] = (0xB8 ^ 0x99) & ~(0x44 ^ 0x65) ^ (0x3B ^ 0x20);
        J.var1[30] = 0xB9 ^ 0xA9;
        J.var1[31] = 85 + 73 - 12 + 7 ^ 84 + 24 - 83 + 111;
        J.var1[32] = 0x11 ^ 0x39 ^ (5 ^ 0x3F);
        J.var1[33] = 0xD3 ^ 0x92;
        J.var1[34] = 14 + 126 - 46 + 91 ^ 17 + 118 - 99 + 134;
        J.var1[35] = 0x19 ^ 0x2F;
        J.var1[36] = 141 + 14 - 55 + 86 ^ 29 + 37 - -9 + 99;
        J.var1[37] = 0x77 ^ 0x62;
        J.var1[38] = 0xFFFFAF79 & 0x5C8F;
        J.var1[39] = 0xFFFFF7B2 & 0x2D6D;
        J.var1[40] = 0x3B ^ 0xB ^ (0x32 ^ 0x14);
        J.var1[41] = 0x4A ^ 0x5D;
        J.var1[42] = 0xFFFFCBB8 & 0x357F;
        J.var1[43] = 0xBF ^ 0xA7;
        J.var1[44] = 9 ^ 0x3E ^ (0xE8 ^ 0xC6);
        J.var1[45] = 58 + 123 - 40 + 33 ^ 88 + 94 - 165 + 163;
        J.var1[46] = 0x2B ^ 0x68;
        J.var1[47] = 0x61 ^ 0x59;
        J.var1[48] = 0x48 ^ 0x54;
        J.var1[49] = 0xFFFFB7FF & 0x4983;
        J.var1[50] = 0x24 ^ 0x5C ^ (0x19 ^ 0x7C);
        J.var1[51] = 0xFFFFF5FF & 0xEB5;
        J.var1[52] = 0xFFFFDEFF & 0x25FD;
        J.var1[53] = -(0xFFFFC72D & 0x3BDF) & (0xFFFFAFFF & 0x579F);
        J.var1[54] = 3 ^ 0x3C;
        J.var1[55] = 0x68 ^ 0x76;
        J.var1[56] = 0x73 ^ 0x47;
        J.var1[57] = 107 + 93 - 167 + 109 ^ 91 + 30 - 10 + 34;
        J.var1[58] = -(0xFFFFD1FD & 0x3F8B) & (0xFFFFDFAF & 0x3DFF);
        J.var1[59] = -(0xFFFFDB93 & 0x766D) & (0xFFFFF77E & 0x7FAF);
        J.var1[60] = 0x28 ^ 8;
        J.var1[61] = 0x2A ^ 0x38 ^ (0xBC ^ 0x8F);
        J.var1[62] = 0x72 ^ 0x50;
        J.var1[63] = -(0xFFFFFF51 & 0x1CAF) & (0xFFFF9F7F & 0x7FC9);
        J.var1[64] = 0xFFFFF37E & 0xFF3;
        J.var1[65] = 63 + 99 - 69 + 65 ^ 92 + 79 - 52 + 70;
        J.var1[66] = 1 ^ 0x25;
        J.var1[67] = 108 + 127 - 89 + 40 ^ 36 + 101 - 48 + 70;
        J.var1[68] = 0x63 ^ 0x29 ^ (0xF4 ^ 0x98);
        J.var1[69] = 72 + 96 - 137 + 100 ^ 171 + 10 - 44 + 42;
        J.var1[70] = 0x3F ^ 0x18;
        J.var1[71] = 0x2B ^ 0x7E ^ (0x72 ^ 0xF);
        J.var1[72] = 0xFFFFDD3F & 0x2EF5;
        J.var1[73] = -(0xFFFFBFDD & 0x73EF) & (0xFFFFFFFF & 0x3FEF);
        J.var1[74] = 0xBE ^ 0x94;
        J.var1[75] = 0xBA ^ 0x91;
        J.var1[76] = 0xBA ^ 0xA4 ^ (0x3D ^ 0x67);
        J.var1[77] = 0x89 ^ 0xA5;
        J.var1[78] = 0xAF ^ 0xA3 ^ (0xA3 ^ 0x96);
        J.var1[79] = 0x2C ^ 0x5F ^ (0x10 ^ 0x4E);
        J.var1[80] = 0x8E ^ 0xBF;
        J.var1[81] = 0xD1 ^ 0x86 ^ (0xF8 ^ 0x81);
        J.var1[82] = 0x8A ^ 0xA5;
        J.var1[83] = -(0xFFFFE757 & 0x1BA9) & (0xFFFFFFEF & 0xF55);
        J.var1[84] = -(0xFFFFB7D9 & 0x5AE7) & (0xFFFFBFD4 & 0x5EFB);
        J.var1[85] = 0x38 ^ 0xA;
        J.var1[86] = 2 + 144 - -55 + 19 ^ 98 + 108 - 92 + 39;
        J.var1[87] = 0x4F ^ 0x75;
    }

    private static void var20() {
        var2 = new String[var1[87]];
        J.var2[J.var1[1]] = "Gielinor Guide";
        J.var2[J.var1[2]] = "Talk-to";
        J.var2[J.var1[6]] = "Settings";
        J.var2[J.var1[11]] = "Settings";
        J.var2[J.var1[12]] = "Gielinor Guide";
        J.var2[J.var1[13]] = "Talk-to";
        J.var2[J.var1[14]] = "Survival Expert";
        J.var2[J.var1[15]] = "Talk-to";
        J.var2[J.var1[17]] = "Inventory";
        J.var2[J.var1[19]] = "Inventory";
        J.var2[J.var1[20]] = "Fishing spot";
        J.var2[J.var1[21]] = "Net";
        J.var2[J.var1[23]] = "Skills";
        J.var2[J.var1[25]] = "Skills";
        J.var2[J.var1[26]] = "Master Chef";
        J.var2[J.var1[27]] = "Talk-to";
        J.var2[J.var1[30]] = "Toggle Run";
        J.var2[J.var1[31]] = "Quest Guide";
        J.var2[J.var1[32]] = "Talk-to";
        J.var2[J.var1[34]] = "Quest List";
        J.var2[J.var1[36]] = "Quest List";
        J.var2[J.var1[37]] = "Mining Instructor";
        J.var2[J.var1[40]] = "Mining Instructor";
        J.var2[J.var1[41]] = "Talk-to";
        J.var2[J.var1[43]] = "Smith";
        J.var2[J.var1[44]] = "Combat Instructor";
        J.var2[J.var1[45]] = "Talk-to";
        J.var2[J.var1[29]] = "Worn Equipment";
        J.var2[J.var1[48]] = "Worn Equipment";
        J.var2[J.var1[50]] = "View equipment stats";
        J.var2[J.var1[55]] = "Combat Options";
        J.var2[J.var1[57]] = "Combat Options";
        J.var2[J.var1[60]] = "Gate";
        J.var2[J.var1[61]] = "Giant rat";
        J.var2[J.var1[62]] = "Attack";
        J.var2[J.var1[65]] = "Giant rat";
        J.var2[J.var1[66]] = "Attack";
        J.var2[J.var1[67]] = "Account Guide";
        J.var2[J.var1[68]] = "Talk-to";
        J.var2[J.var1[70]] = "Account Management";
        J.var2[J.var1[71]] = "Account Management";
        J.var2[J.var1[10]] = "Brother Brace";
        J.var2[J.var1[74]] = "Brother Brace";
        J.var2[J.var1[75]] = "Talk-to";
        J.var2[J.var1[77]] = "Prayer";
        J.var2[J.var1[79]] = "Prayer";
        J.var2[J.var1[81]] = "Friends List";
        J.var2[J.var1[82]] = "Friends List";
        J.var2[J.var1[69]] = "Magic Instructor";
        J.var2[J.var1[80]] = "Yes.";
        J.var2[J.var1[85]] = "No, I'm not planning to do that.";
        J.var2[J.var1[8]] = "Yes, send me to the mainland";
        J.var2[J.var1[56]] = "Magic Instructor";
        J.var2[J.var1[24]] = "Talk-to";
        J.var2[J.var1[35]] = "Magic";
        J.var2[J.var1[18]] = "Magic";
        J.var2[J.var1[47]] = "Chicken";
        J.var2[J.var1[78]] = "Attack";
    }

    static {
        J.var19();
        J.var20();
    }

        catch (Exception var26) {
            var26.printStackTrace();
            return null;
        }
    }

    private static boolean var27(int n2, int n3) {
        return n2 >= n3;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var28;
        J var29;
        int n2 = Vars.getVarp((int)var1[0]);
        o o2 = this.a(n2);
        if (J.var30(o2)) {
            return o2.D();
        }
        if (J.var18(var29.aJ.quest().equals((Object)h.TUTORIAL_ISLAND) ? 1 : 0)) {
            return var1[1];
        }
        if (J.var27(var29.aE, var1[2])) {
            System.out.println("[DEVELOPER]: Delay " + var29.aE + " Step: " + (int)var28);
            var29.aE -= var1[2];
            return var1[1];
        }
        if (J.var18(Movement.shouldWalk() ? 1 : 0)) {
            return var1[1];
        }
        if (J.var3(Players.getLocal().getAnimation(), var1[3])) {
            return var1[1];
        }
        if (J.var27((int)var28, var1[4])) {
            return var1[1];
        }
        return var1[2];
    }

        catch (Exception var36) {
            var36.printStackTrace();
            return null;
        }
    }

    private static boolean var16(int n2) {
        return n2 != 0;
    }

    private static boolean var17(Object object) {
        return object == null;
    }

    private static boolean var30(Object object) {
        return object != null;
    }
}

