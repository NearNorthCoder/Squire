/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.plugins.fw.TaskManager
 *  net.runelite.api.Client
 *  net.runelite.api.DialogOption
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.TileItem
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.items.Shop
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 *  net.unethicalite.api.movement.pathfinder.Walker
 *  net.unethicalite.api.widgets.Dialog
 */
package q.e.u.r.i.u.t.q.-.e.e.s.r.s;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.plugins.fw.TaskManager;
import gg.squire.quest.SquireQuester;
import gg.squire.quest.SquireQuesterConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.DialogOption;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.TileItem;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.items.Shop;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.movement.pathfinder.Walker;
import net.unethicalite.api.widgets.Dialog;
import q.e.u.r.i.u.t.q.-.e.e.s.r.s.h;

@TaskDesc(name="Completing Cooks Assistant")
public class p
extends Task {
    private final /* synthetic */ TaskManager at;
    private final /* synthetic */ SquireQuester as;
    private static /* synthetic */ String[] lIIIllIlIIlll;
    private final /* synthetic */ SquireQuesterConfig ar;
    private final /* synthetic */ Client aq;
    private static /* synthetic */ int[] lIIIllIlIlIII;

    private static boolean lIlIIIlIlIlIIll(Object object) {
        return object == null;
    }

    private void R() {
        p lllllllllllllllIIIIlIIlIIlllIIIl;
        if (!p.lIlIIIlIlIIllll(Dialog.canContinue() ? 1 : 0) || p.lIlIIIlIlIlIIIl(Dialog.isViewingOptions() ? 1 : 0)) {
            if (p.lIlIIIlIlIlIIIl(Dialog.hasOption((String)lIIIllIlIIlll[lIIIllIlIlIII[0]]) ? 1 : 0)) {
                String[] stringArray = new String[lIIIllIlIlIII[3]];
                stringArray[p.lIIIllIlIlIII[0]] = lIIIllIlIIlll[lIIIllIlIlIII[3]];
                Dialog.chooseOption((String[])stringArray);
                0;
            }
            DialogOption[] dialogOptionArray = new DialogOption[lIIIllIlIlIII[5]];
            dialogOptionArray[p.lIIIllIlIlIII[0]] = DialogOption.PLAYER_CONTINUE;
            dialogOptionArray[p.lIIIllIlIlIII[3]] = DialogOption.PLAYER_CONTINUE;
            dialogOptionArray[p.lIIIllIlIlIII[1]] = DialogOption.PLAYER_CONTINUE;
            dialogOptionArray[p.lIIIllIlIlIII[2]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[p.lIIIllIlIlIII[6]] = DialogOption.PLAYER_CONTINUE;
            dialogOptionArray[p.lIIIllIlIlIII[7]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[p.lIIIllIlIlIII[8]] = DialogOption.PLAYER_CONTINUE;
            dialogOptionArray[p.lIIIllIlIlIII[9]] = DialogOption.NPC_CONTINUE;
            Dialog.invokeDialog((DialogOption[])dialogOptionArray);
        }
        if (p.lIlIIIlIlIIllll(lllllllllllllllIIIIlIIlIIlllIIIl.V() ? 1 : 0)) {
            int[] nArray = new int[lIIIllIlIlIII[3]];
            nArray[p.lIIIllIlIlIII[0]] = lIIIllIlIlIII[10];
            if (p.lIlIIIlIlIIllll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray2 = new int[lIIIllIlIlIII[3]];
                nArray2[p.lIIIllIlIlIII[0]] = lIIIllIlIlIII[11];
                if (p.lIlIIIlIlIIllll(Inventory.contains((int[])nArray2) ? 1 : 0)) {
                    String[] stringArray = new String[lIIIllIlIlIII[3]];
                    stringArray[p.lIIIllIlIlIII[0]] = lIIIllIlIIlll[lIIIllIlIlIII[1]];
                    TileItem lllllllllllllllIIIIlIIlIIlllIIII = TileItems.getNearest((String[])stringArray);
                    if (p.lIlIIIlIlIlIIlI(lllllllllllllllIIIIlIIlIIlllIIII)) {
                        lllllllllllllllIIIIlIIlIIlllIIII.interact(lIIIllIlIIlll[lIIIllIlIlIII[2]]);
                    }
                    System.out.println(lIIIllIlIIlll[lIIIllIlIlIII[6]]);
                    return;
                }
            }
            int[] nArray3 = new int[lIIIllIlIlIII[3]];
            nArray3[p.lIIIllIlIlIII[0]] = lIIIllIlIlIII[12];
            if (p.lIlIIIlIlIIllll(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                Walker.walkTo((WorldPoint)new WorldPoint(lIIIllIlIlIII[13], lIIIllIlIlIII[14], lIIIllIlIlIII[0]));
                0;
                String[] stringArray = new String[lIIIllIlIlIII[3]];
                stringArray[p.lIIIllIlIlIII[0]] = lIIIllIlIIlll[lIIIllIlIlIII[7]];
                NPCs.getNearest((String[])stringArray).interact(lIIIllIlIIlll[lIIIllIlIlIII[8]]);
                Shop.buyOne((int)lIIIllIlIlIII[12]);
            }
            if (p.lIlIIIlIlIIllll(Dialog.canContinue() ? 1 : 0) && p.lIlIIIlIlIIllll(Dialog.isViewingOptions() ? 1 : 0)) {
                int[] nArray4 = new int[lIIIllIlIlIII[3]];
                nArray4[p.lIIIllIlIlIII[0]] = lIIIllIlIlIII[11];
                if (p.lIlIIIlIlIIllll(Inventory.contains((int[])nArray4) ? 1 : 0)) {
                    lllllllllllllllIIIIlIIlIIlllIIIl.U();
                }
            }
            if (p.lIlIIIlIlIIllll(Dialog.canContinue() ? 1 : 0) && p.lIlIIIlIlIIllll(Dialog.isViewingOptions() ? 1 : 0)) {
                int[] nArray5 = new int[lIIIllIlIlIII[3]];
                nArray5[p.lIIIllIlIlIII[0]] = lIIIllIlIlIII[11];
                if (p.lIlIIIlIlIlIIIl(Inventory.contains((int[])nArray5) ? 1 : 0)) {
                    int[] nArray6 = new int[lIIIllIlIlIII[3]];
                    nArray6[p.lIIIllIlIlIII[0]] = lIIIllIlIlIII[15];
                    if (p.lIlIIIlIlIIllll(Inventory.contains((int[])nArray6) ? 1 : 0)) {
                        lllllllllllllllIIIIlIIlIIlllIIIl.T();
                    }
                }
            }
            if (p.lIlIIIlIlIIllll(Dialog.canContinue() ? 1 : 0) && p.lIlIIIlIlIIllll(Dialog.isViewingOptions() ? 1 : 0)) {
                int[] nArray7 = new int[lIIIllIlIlIII[3]];
                nArray7[p.lIIIllIlIlIII[0]] = lIIIllIlIlIII[16];
                if (p.lIlIIIlIlIIllll(Inventory.contains((int[])nArray7) ? 1 : 0)) {
                    int[] nArray8 = new int[lIIIllIlIlIII[3]];
                    nArray8[p.lIIIllIlIlIII[0]] = lIIIllIlIlIII[11];
                    if (p.lIlIIIlIlIlIIIl(Inventory.contains((int[])nArray8) ? 1 : 0)) {
                        int[] nArray9 = new int[lIIIllIlIlIII[3]];
                        nArray9[p.lIIIllIlIlIII[0]] = lIIIllIlIlIII[15];
                        if (p.lIlIIIlIlIlIIIl(Inventory.contains((int[])nArray9) ? 1 : 0)) {
                            lllllllllllllllIIIIlIIlIIlllIIIl.S();
                        }
                    }
                }
            }
        }
        if (p.lIlIIIlIlIlIIIl(lllllllllllllllIIIIlIIlIIlllIIIl.V() ? 1 : 0)) {
            String[] stringArray = new String[lIIIllIlIlIII[3]];
            stringArray[p.lIIIllIlIlIII[0]] = lIIIllIlIIlll[lIIIllIlIlIII[9]];
            NPC lllllllllllllllIIIIlIIlIIlllIIII = NPCs.getNearest((String[])stringArray);
            if (p.lIlIIIlIlIlIIlI(lllllllllllllllIIIIlIIlIIlllIIII)) {
                lllllllllllllllIIIIlIIlIIlllIIII.interact(lIIIllIlIIlll[lIIIllIlIlIII[5]]);
                lllllllllllllllIIIIlIIlIIlllIIIl.sleepWhile(lIIIllIlIlIII[17], () -> {
                    boolean bl;
                    if (p.lIlIIIlIlIIllll(Dialog.isOpen() ? 1 : 0)) {
                        bl = lIIIllIlIlIII[3];
                        0;
                        if (-(0x6F ^ 0x6B) >= 0) {
                            return ((0x7D ^ 0x51) & ~(0xAB ^ 0x87)) != 0;
                        }
                    } else {
                        bl = lIIIllIlIlIII[0];
                    }
                    return bl;
                });
                0;
                if ((0x1F ^ 0x1B) < 3) {
                    return;
                }
            } else {
                Walker.walkTo((WorldPoint)new WorldPoint(lIIIllIlIlIII[18], lIIIllIlIlIII[19], lIIIllIlIlIII[0]));
                0;
            }
        }
        this.sleep(lIIIllIlIlIII[3]);
    }

    private static boolean lIlIIIlIlIlIIIl(int n2) {
        return n2 != 0;
    }

    private static void lIlIIIlIlIIlllI() {
        lIIIllIlIlIII = new int[53];
        p.lIIIllIlIlIII[0] = 1 & ~1;
        p.lIIIllIlIlIII[1] = 2;
        p.lIIIllIlIlIII[2] = 3;
        p.lIIIllIlIlIII[3] = 1;
        p.lIIIllIlIlIII[4] = 135 + 111 - 209 + 107 ^ 20 + 31 - 12 + 102;
        p.lIIIllIlIlIII[5] = 0xAE ^ 0xA6;
        p.lIIIllIlIlIII[6] = 0xBE ^ 0xBA;
        p.lIIIllIlIlIII[7] = 0x34 ^ 0x60 ^ (0xF3 ^ 0xA2);
        p.lIIIllIlIlIII[8] = 0x5F ^ 0x59;
        p.lIIIllIlIlIII[9] = 123 + 55 - 30 + 26 ^ 105 + 69 - 81 + 76;
        p.lIIIllIlIlIII[10] = -(0xFFFFBE7D & 0x59E7) & (0xFFFF9FFF & 0x7FEF);
        p.lIIIllIlIlIII[11] = -(0xFFFFB1D5 & 0x5E7B) & (0xFFFFDFDD & 0x37FF);
        p.lIIIllIlIlIII[12] = -(0xFFFFEDF3 & 0x7A5F) & (0xFFFFEFD7 & Short.MAX_VALUE);
        p.lIIIllIlIlIII[13] = 0xFFFF9C8C & 0x6FFF;
        p.lIIIllIlIlIII[14] = -(0xFFFFF1FF & 0x7F13) & (0xFFFFFDBF & Short.MAX_VALUE);
        p.lIIIllIlIlIII[15] = 0xFFFFE7DC & 0x1FBB;
        p.lIIIllIlIlIII[16] = -(0xFFFFFBF9 & 0x6C67) & (0xFFFFEFE7 & Short.MAX_VALUE);
        p.lIIIllIlIlIII[17] = 43 + 79 - -21 + 31 ^ 86 + 136 - 172 + 114;
        p.lIIIllIlIlIII[18] = -(0xFFFFF7BA & 0x977) & (0xFFFFDDBF & 0x2FF7);
        p.lIIIllIlIlIII[19] = -(0xFFFFEF73 & 0x319D) & (0xFFFFBDBF & 0x6FDF);
        p.lIIIllIlIlIII[20] = 0x29 ^ 0x75 ^ (0x69 ^ 0x3C);
        p.lIIIllIlIlIII[21] = 50 + 96 - 46 + 36 ^ 11 + 37 - -38 + 45;
        p.lIIIllIlIlIII[22] = 0xFFFFBCBF & 0x4FC7;
        p.lIIIllIlIlIII[23] = -(0xFFFFFF51 & 0x32EF) & (0xFFFFFFFF & 0x3ECD);
        p.lIIIllIlIlIII[24] = 0xFFFFFE7C & 0xDEB;
        p.lIIIllIlIlIII[25] = -(0xFFFFDA27 & 0x67D9) & (0xFFFFEEF8 & 0x5FF7);
        p.lIIIllIlIlIII[26] = 0x74 ^ 0x63 ^ (0x8A ^ 0x91);
        p.lIIIllIlIlIII[27] = 5 ^ 0xA ^ 2;
        p.lIIIllIlIlIII[28] = -(0xFFFFEF2E & 0x33DD) & (0xFFFFBF7F & 0x6FFF);
        p.lIIIllIlIlIII[29] = -(0xFFFFAF7B & 0x5297) & (0xFFFFDEFF & 0x2FDF);
        p.lIIIllIlIlIII[30] = -(0x19 ^ 0x3E) & (0xFFFFBDEF & 0x4EBF);
        p.lIIIllIlIlIII[31] = -(0xFFFFDC47 & 0x6BFD) & (0xFFFFFFDF & 0x4FFF);
        p.lIIIllIlIlIII[32] = -(0xFFFFFF09 & 0x53F7) & (0xFFFFFFFD & 0x5F5B);
        p.lIIIllIlIlIII[33] = 0xFFFFBFDF & 0x4CFC;
        p.lIIIllIlIlIII[34] = 0x81 ^ 0x8F;
        p.lIIIllIlIlIII[35] = 0x1B ^ 0x14;
        p.lIIIllIlIlIII[36] = 0x78 ^ 0x68;
        p.lIIIllIlIlIII[37] = 0x70 ^ 0x54 ^ (0x23 ^ 0x16);
        p.lIIIllIlIlIII[38] = 0x50 ^ 0x60 ^ (0x67 ^ 0x45);
        p.lIIIllIlIlIII[39] = 0xFFFF9FFF & 0x6C5C;
        p.lIIIllIlIlIII[40] = 0xFFFFBCEE & 0x4FFB;
        p.lIIIllIlIlIII[41] = 0x50 ^ 0x43;
        p.lIIIllIlIlIII[42] = 0x22 ^ 0x36;
        p.lIIIllIlIlIII[43] = 0xA1 ^ 0xB4;
        p.lIIIllIlIlIII[44] = 0x28 ^ 0x3E;
        p.lIIIllIlIlIII[45] = 11 + 100 - 98 + 171 ^ 78 + 16 - -59 + 22;
        p.lIIIllIlIlIII[46] = 0x10 ^ 8;
        p.lIIIllIlIlIII[47] = -(0xFFFFFF23 & 0x72DD) & (0xFFFFFFFE & 0x7E5F);
        p.lIIIllIlIlIII[48] = 0xFFFFDEFB & 0x2DED;
        p.lIIIllIlIlIII[49] = 3 ^ 0x1A;
        p.lIIIllIlIlIII[50] = 0x71 ^ 0x19 ^ (0x5C ^ 0x2E);
        p.lIIIllIlIlIII[51] = 0xA5 ^ 0xBE;
        p.lIIIllIlIlIII[52] = 0 + 77 - -48 + 58 ^ 167 + 120 - 270 + 154;
    }

    /*
     * WARNING - void declaration
     */
    public void a(int n2, WorldPoint worldPoint) {
        int[] nArray = new int[lIIIllIlIlIII[3]];
        nArray[p.lIIIllIlIlIII[0]] = n2;
        if (p.lIlIIIlIlIIllll(Inventory.contains((int[])nArray) ? 1 : 0)) {
            void lllllllllllllllIIIIlIIlIIllIIIll;
            int[] nArray2 = new int[lIIIllIlIlIII[3]];
            nArray2[p.lIIIllIlIlIII[0]] = n2;
            TileItem tileItem = TileItems.getNearest((int[])nArray2);
            if (p.lIlIIIlIlIlIIlI(tileItem)) {
                if (p.lIlIIIlIlIlIIIl(Reachable.isInteractable((Locatable)tileItem) ? 1 : 0)) {
                    tileItem.interact(lIIIllIlIIlll[lIIIllIlIlIII[49]]);
                    0;
                    if (-1 >= 0) {
                        return;
                    }
                } else {
                    Walker.walkTo((WorldPoint)lllllllllllllllIIIIlIIlIIllIIIll);
                    0;
                    0;
                    if (((0x13 ^ 1) & ~(0 ^ 0x12)) < 0) {
                        return;
                    }
                }
            } else {
                Walker.walkTo((WorldPoint)lllllllllllllllIIIIlIIlIIllIIIll);
                0;
            }
        }
    }

    private static String lIlIIIlIlIIllII(String lllllllllllllllIIIIlIIlIIIlIIlIl, String lllllllllllllllIIIIlIIlIIIlIIlII) {
        try {
            SecretKeySpec lllllllllllllllIIIIlIIlIIIlIlIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIIlIIlIIIlIIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIIIlIIlIIIlIlIIl = Cipher.getInstance("Blowfish");
            lllllllllllllllIIIIlIIlIIIlIlIIl.init(lIIIllIlIlIII[1], lllllllllllllllIIIIlIIlIIIlIlIlI);
            return new String(lllllllllllllllIIIIlIIlIIIlIlIIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIIlIIlIIIlIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIIIlIIlIIIlIlIII) {
            lllllllllllllllIIIIlIIlIIIlIlIII.printStackTrace();
            return null;
        }
    }

    private void U() {
        p lllllllllllllllIIIIlIIlIIllIlIII;
        this.b(lIIIllIlIlIII[10], new WorldPoint(lIIIllIlIlIII[30], lIIIllIlIlIII[23], lIIIllIlIlIII[0]));
        if (p.lIlIIIlIlIIllll(this.as.a() ? 1 : 0)) {
            this.a(lIIIllIlIlIII[31], new WorldPoint(lIIIllIlIlIII[32], lIIIllIlIlIII[33], lIIIllIlIlIII[0]), lIIIllIlIIlll[lIIIllIlIlIII[34]], lIIIllIlIIlll[lIIIllIlIlIII[35]]);
        }
        int[] nArray = new int[lIIIllIlIlIII[3]];
        nArray[p.lIIIllIlIlIII[0]] = lIIIllIlIlIII[10];
        if (p.lIlIIIlIlIlIIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
            int[] nArray2 = new int[lIIIllIlIlIII[3]];
            nArray2[p.lIIIllIlIlIII[0]] = lIIIllIlIlIII[31];
            if (p.lIlIIIlIlIlIIIl(Inventory.contains((int[])nArray2) ? 1 : 0)) {
                String[] stringArray = new String[lIIIllIlIlIII[3]];
                stringArray[p.lIIIllIlIlIII[0]] = lIIIllIlIIlll[lIIIllIlIlIII[36]];
                if (p.lIlIIIlIlIlIIlI(TileObjects.getNearest((String[])stringArray))) {
                    String[] stringArray2 = new String[lIIIllIlIlIII[3]];
                    stringArray2[p.lIIIllIlIlIII[0]] = lIIIllIlIIlll[lIIIllIlIlIII[37]];
                    TileObjects.getNearest((String[])stringArray2).interact(lIIIllIlIIlll[lIIIllIlIlIII[38]]);
                    0;
                    if (-1 > 0) {
                        return;
                    }
                } else {
                    Walker.walkTo((WorldPoint)new WorldPoint(lIIIllIlIlIII[39], lIIIllIlIlIII[40], lIIIllIlIlIII[1]));
                    0;
                }
            }
        }
        int[] nArray3 = new int[lIIIllIlIlIII[3]];
        nArray3[p.lIIIllIlIlIII[0]] = lIIIllIlIlIII[10];
        if (p.lIlIIIlIlIlIIIl(Inventory.contains((int[])nArray3) ? 1 : 0)) {
            int[] nArray4 = new int[lIIIllIlIlIII[3]];
            nArray4[p.lIIIllIlIlIII[0]] = lIIIllIlIlIII[31];
            if (p.lIlIIIlIlIIllll(Inventory.contains((int[])nArray4) ? 1 : 0)) {
                String[] stringArray = new String[lIIIllIlIlIII[3]];
                stringArray[p.lIIIllIlIlIII[0]] = lIIIllIlIIlll[lIIIllIlIlIII[41]];
                if (p.lIlIIIlIlIlIIlI(TileObjects.getNearest((String[])stringArray)) && p.lIlIIIlIlIIllll(lllllllllllllllIIIIlIIlIIllIlIII.as.a() ? 1 : 0)) {
                    String[] stringArray3 = new String[lIIIllIlIlIII[3]];
                    stringArray3[p.lIIIllIlIlIII[0]] = lIIIllIlIIlll[lIIIllIlIlIII[42]];
                    TileObjects.getNearest((String[])stringArray3).interact(lIIIllIlIIlll[lIIIllIlIlIII[43]]);
                }
            }
        }
        if (p.lIlIIIlIlIlIIIl(lllllllllllllllIIIIlIIlIIllIlIII.as.a() ? 1 : 0)) {
            int[] nArray5 = new int[lIIIllIlIlIII[3]];
            nArray5[p.lIIIllIlIlIII[0]] = lIIIllIlIlIII[11];
            if (p.lIlIIIlIlIIllll(Inventory.contains((int[])nArray5) ? 1 : 0)) {
                String[] stringArray = new String[lIIIllIlIlIII[3]];
                stringArray[p.lIIIllIlIlIII[0]] = lIIIllIlIIlll[lIIIllIlIlIII[44]];
                if (p.lIlIIIlIlIlIIlI(TileObjects.getNearest((String[])stringArray))) {
                    String[] stringArray4 = new String[lIIIllIlIlIII[3]];
                    stringArray4[p.lIIIllIlIlIII[0]] = lIIIllIlIIlll[lIIIllIlIlIII[45]];
                    TileObjects.getNearest((String[])stringArray4).interact(lIIIllIlIIlll[lIIIllIlIlIII[46]]);
                    0;
                    if (3 > 3) {
                        return;
                    }
                } else {
                    Walker.walkTo((WorldPoint)new WorldPoint(lIIIllIlIlIII[47], lIIIllIlIlIII[48], lIIIllIlIlIII[0]));
                    0;
                }
            }
        }
    }

    private static boolean lIlIIIlIlIlIIII(int n2, int n3) {
        return n2 >= n3;
    }

    @Inject
    public p(Client client, SquireQuesterConfig squireQuesterConfig, SquireQuester squireQuester, TaskManager taskManager) {
        this.aq = client;
        this.ar = squireQuesterConfig;
        this.as = squireQuester;
        this.at = taskManager;
    }

    private void M() {
        if (p.lIlIIIlIlIIllll(Dialog.canContinue() ? 1 : 0) && p.lIlIIIlIlIIllll(Dialog.isViewingOptions() ? 1 : 0)) {
            String[] stringArray = new String[lIIIllIlIlIII[3]];
            stringArray[p.lIIIllIlIlIII[0]] = lIIIllIlIIlll[lIIIllIlIlIII[20]];
            NPC nPC = NPCs.getNearest((String[])stringArray);
            if (p.lIlIIIlIlIlIIlI(nPC)) {
                nPC.interact(lIIIllIlIIlll[lIIIllIlIlIII[17]]);
                this.sleepWhile(lIIIllIlIlIII[17], () -> {
                    boolean bl;
                    if (p.lIlIIIlIlIIllll(Dialog.isOpen() ? 1 : 0)) {
                        bl = lIIIllIlIlIII[3];
                        0;
                        if (1 >= (0x82 ^ 0x9F ^ (0x87 ^ 0x9E))) {
                            return ((0x4A ^ 0x39 ^ (0xD ^ 0x60)) & (8 + 70 - 30 + 113 ^ 33 + 141 - 172 + 189 ^ -1)) != 0;
                        }
                    } else {
                        bl = lIIIllIlIlIII[0];
                    }
                    return bl;
                });
                0;
                if (-2 >= 0) {
                    return;
                }
            } else {
                Walker.walkTo((WorldPoint)new WorldPoint(lIIIllIlIlIII[18], lIIIllIlIlIII[19], lIIIllIlIlIII[0]));
                0;
            }
            0;
            if (1 < 0) {
                return;
            }
        } else {
            System.out.println(lIIIllIlIIlll[lIIIllIlIlIII[21]]);
            DialogOption[] dialogOptionArray = new DialogOption[lIIIllIlIlIII[17]];
            dialogOptionArray[p.lIIIllIlIlIII[0]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[p.lIIIllIlIlIII[3]] = DialogOption.CHAT_OPTION_TWO;
            dialogOptionArray[p.lIIIllIlIlIII[1]] = DialogOption.PLAYER_CONTINUE;
            dialogOptionArray[p.lIIIllIlIlIII[2]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[p.lIIIllIlIlIII[6]] = DialogOption.PLAYER_CONTINUE;
            dialogOptionArray[p.lIIIllIlIlIII[7]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[p.lIIIllIlIlIII[8]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[p.lIIIllIlIlIII[9]] = DialogOption.CHAT_OPTION_ONE;
            dialogOptionArray[p.lIIIllIlIlIII[5]] = DialogOption.CHAT_OPTION_FOUR;
            dialogOptionArray[p.lIIIllIlIlIII[20]] = DialogOption.PLAYER_CONTINUE;
            Dialog.invokeDialog((DialogOption[])dialogOptionArray);
        }
    }

    private static void lIlIIIlIlIIllIl() {
        lIIIllIlIIlll = new String[lIIIllIlIlIII[52]];
        p.lIIIllIlIIlll[p.lIIIllIlIlIII[0]] = p."Actually, I know where to find this stuff.";
        p.lIIIllIlIIlll[p.lIIIllIlIlIII[3]] = p."Actually, I know where to find this stuff.";
        p.lIIIllIlIIlll[p.lIIIllIlIlIII[1]] = p."Pot";
        p.lIIIllIlIIlll[p.lIIIllIlIlIII[2]] = p."Take";
        p.lIIIllIlIIlll[p.lIIIllIlIlIII[6]] = p."Collecting pot";
        p.lIIIllIlIIlll[p.lIIIllIlIlIII[7]] = p."Shop keeper";
        p.lIIIllIlIIlll[p.lIIIllIlIlIII[8]] = p."Trade";
        p.lIIIllIlIIlll[p.lIIIllIlIlIII[9]] = p."Cook";
        p.lIIIllIlIIlll[p.lIIIllIlIlIII[5]] = p."Talk-to";
        p.lIIIllIlIIlll[p.lIIIllIlIlIII[20]] = p."Cook";
        p.lIIIllIlIIlll[p.lIIIllIlIlIII[17]] = p."Talk-to";
        p.lIIIllIlIIlll[p.lIIIllIlIlIII[21]] = p."Sending";
        p.lIIIllIlIIlll[p.lIIIllIlIlIII[26]] = p."Dairy cow";
        p.lIIIllIlIIlll[p.lIIIllIlIlIII[27]] = p."Milk";
        p.lIIIllIlIIlll[p.lIIIllIlIlIII[34]] = p."Wheat";
        p.lIIIllIlIIlll[p.lIIIllIlIlIII[35]] = p."Pick";
        p.lIIIllIlIIlll[p.lIIIllIlIlIII[36]] = p."Hopper";
        p.lIIIllIlIIlll[p.lIIIllIlIlIII[37]] = p."Hopper";
        p.lIIIllIlIIlll[p.lIIIllIlIlIII[38]] = p."Fill";
        p.lIIIllIlIIlll[p.lIIIllIlIlIII[41]] = p."Hopper";
        p.lIIIllIlIIlll[p.lIIIllIlIlIII[42]] = p."Hopper controls";
        p.lIIIllIlIIlll[p.lIIIllIlIlIII[43]] = p."Operate";
        p.lIIIllIlIIlll[p.lIIIllIlIlIII[44]] = p."Flour bin";
        p.lIIIllIlIIlll[p.lIIIllIlIlIII[45]] = p."Flour bin";
        p.lIIIllIlIIlll[p.lIIIllIlIlIII[46]] = p."Empty";
        p.lIIIllIlIIlll[p.lIIIllIlIlIII[49]] = p."Take";
        p.lIIIllIlIIlll[p.lIIIllIlIlIII[50]] = p."Take";
        p.lIIIllIlIIlll[p.lIIIllIlIlIII[51]] = p."Walking to location";
    }

    private static String lIlIIIlIlIIlIll(String lllllllllllllllIIIIlIIlIIlIIlIIl, String lllllllllllllllIIIIlIIlIIlIIlIII) {
        lllllllllllllllIIIIlIIlIIlIIlIIl = new String(Base64.getDecoder().decode(lllllllllllllllIIIIlIIlIIlIIlIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIIIlIIlIIlIIIlll = new StringBuilder();
        char[] lllllllllllllllIIIIlIIlIIlIIIllI = lllllllllllllllIIIIlIIlIIlIIlIII.toCharArray();
        int lllllllllllllllIIIIlIIlIIlIIIlIl = lIIIllIlIlIII[0];
        char[] lllllllllllllllIIIIlIIlIIIllllll = lllllllllllllllIIIIlIIlIIlIIlIIl.toCharArray();
        int lllllllllllllllIIIIlIIlIIIlllllI = lllllllllllllllIIIIlIIlIIIllllll.length;
        int lllllllllllllllIIIIlIIlIIIllllIl = lIIIllIlIlIII[0];
        while (p.lIlIIIlIlIlIlII(lllllllllllllllIIIIlIIlIIIllllIl, lllllllllllllllIIIIlIIlIIIlllllI)) {
            char lllllllllllllllIIIIlIIlIIlIIlIlI = lllllllllllllllIIIIlIIlIIIllllll[lllllllllllllllIIIIlIIlIIIllllIl];
            lllllllllllllllIIIIlIIlIIlIIIlll.append((char)(lllllllllllllllIIIIlIIlIIlIIlIlI ^ lllllllllllllllIIIIlIIlIIlIIIllI[lllllllllllllllIIIIlIIlIIlIIIlIl % lllllllllllllllIIIIlIIlIIlIIIllI.length]));
            0;
            ++lllllllllllllllIIIIlIIlIIlIIIlIl;
            ++lllllllllllllllIIIIlIIlIIIllllIl;
            0;
            if (((0x42 ^ 0x79) & ~(0x8E ^ 0xB5)) < 1) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIIIIlIIlIIlIIIlll);
    }

    public boolean V() {
        int[] nArray = new int[lIIIllIlIlIII[3]];
        nArray[p.lIIIllIlIlIII[0]] = lIIIllIlIlIII[16];
        if (p.lIlIIIlIlIIllll(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return lIIIllIlIlIII[0];
        }
        int[] nArray2 = new int[lIIIllIlIlIII[3]];
        nArray2[p.lIIIllIlIlIII[0]] = lIIIllIlIlIII[11];
        if (p.lIlIIIlIlIIllll(Inventory.contains((int[])nArray2) ? 1 : 0)) {
            return lIIIllIlIlIII[0];
        }
        int[] nArray3 = new int[lIIIllIlIlIII[3]];
        nArray3[p.lIIIllIlIlIII[0]] = lIIIllIlIlIII[15];
        if (p.lIlIIIlIlIIllll(Inventory.contains((int[])nArray3) ? 1 : 0)) {
            return lIIIllIlIlIII[0];
        }
        return lIIIllIlIlIII[3];
    }

    /*
     * WARNING - void declaration
     */
    public void a(int n2, WorldPoint worldPoint, String string, String string2) {
        int[] nArray = new int[lIIIllIlIlIII[3]];
        nArray[p.lIIIllIlIlIII[0]] = n2;
        if (p.lIlIIIlIlIIllll(Inventory.contains((int[])nArray) ? 1 : 0)) {
            String[] stringArray = new String[lIIIllIlIlIII[3]];
            stringArray[p.lIIIllIlIlIII[0]] = string;
            if (p.lIlIIIlIlIlIIlI(TileObjects.getNearest((String[])stringArray))) {
                String[] stringArray2 = new String[lIIIllIlIlIII[3]];
                stringArray2[p.lIIIllIlIlIII[0]] = string;
                if (p.lIlIIIlIlIlIIIl(Reachable.isInteractable((Locatable)TileObjects.getNearest((String[])stringArray2)) ? 1 : 0)) {
                    String[] stringArray3 = new String[lIIIllIlIlIII[3]];
                    stringArray3[p.lIIIllIlIlIII[0]] = string;
                    TileObjects.getNearest((String[])stringArray3).interact(string2);
                    0;
                    if (1 > 1) {
                        return;
                    }
                } else {
                    void lllllllllllllllIIIIlIIlIIlIlIlIl;
                    String[] stringArray4 = new String[lIIIllIlIlIII[3]];
                    stringArray4[p.lIIIllIlIlIII[0]] = lllllllllllllllIIIIlIIlIIlIlIlIl;
                    Movement.walkTo((WorldPoint)TileObjects.getNearest((String[])stringArray4).getWorldLocation());
                    0;
                    0;
                    if (-3 >= 0) {
                        return;
                    }
                }
            } else {
                void lllllllllllllllIIIIlIIlIIlIlIllI;
                System.out.println(lIIIllIlIIlll[lIIIllIlIlIII[51]]);
                Walker.walkTo((WorldPoint)lllllllllllllllIIIIlIIlIIlIlIllI);
                0;
            }
        }
    }

    public boolean run() {
        p lllllllllllllllIIIIlIIlIIlllIlIl;
        if (p.lIlIIIlIlIIllll(this.ar.quest().equals((Object)h.COOKS_ASSISTANT) ? 1 : 0)) {
            return lIIIllIlIlIII[0];
        }
        int lllllllllllllllIIIIlIIlIIlllIlII = lllllllllllllllIIIIlIIlIIlllIlIl.Q();
        System.out.println("[COOKS ASSISTANT] Current Progress: " + lllllllllllllllIIIIlIIlIIlllIlII);
        if (p.lIlIIIlIlIlIIII(lllllllllllllllIIIIlIIlIIlllIlII, lIIIllIlIlIII[1])) {
            return lIIIllIlIlIII[0];
        }
        switch (lllllllllllllllIIIIlIIlIIlllIlII) {
            case 0: {
                lllllllllllllllIIIIlIIlIIlllIlIl.M();
                0;
                if (null == null) break;
                return ((0xEC ^ 0x95 ^ (0x75 ^ 0x38)) & (0x78 ^ 0x37 ^ (0x5F ^ 0x24) ^ -1)) != 0;
            }
            case 1: {
                lllllllllllllllIIIIlIIlIIlllIlIl.R();
                lllllllllllllllIIIIlIIlIIlllIlIl.sleep(lIIIllIlIlIII[2]);
                0;
                if ((0x5D ^ 0x6E ^ (0xA6 ^ 0x91)) >= ((52 + 53 - -21 + 51 ^ 88 + 28 - -2 + 44) & (1 + 8 - -175 + 7 ^ 132 + 141 - 228 + 127 ^ -1))) break;
                return ((20 + 37 - -23 + 67 ^ 76 + 38 - 63 + 81) & (81 + 124 - 86 + 66 ^ 23 + 163 - 20 + 8 ^ -1)) != 0;
            }
            default: {
                return lIIIllIlIlIII[0];
            }
        }
        return lIIIllIlIlIII[3];
    }

    private static boolean lIlIIIlIlIlIlII(int n2, int n3) {
        return n2 < n3;
    }

    private static String lIlIIIlIlIIlIlI(String lllllllllllllllIIIIlIIlIIIllIlII, String lllllllllllllllIIIIlIIlIIIllIIll) {
        try {
            SecretKeySpec lllllllllllllllIIIIlIIlIIIllIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIIlIIlIIIllIIll.getBytes(StandardCharsets.UTF_8)), lIIIllIlIlIII[5]), "DES");
            Cipher lllllllllllllllIIIIlIIlIIIllIllI = Cipher.getInstance("DES");
            lllllllllllllllIIIIlIIlIIIllIllI.init(lIIIllIlIlIII[1], lllllllllllllllIIIIlIIlIIIllIlll);
            return new String(lllllllllllllllIIIIlIIlIIIllIllI.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIIlIIlIIIllIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIIIlIIlIIIllIlIl) {
            lllllllllllllllIIIIlIIlIIIllIlIl.printStackTrace();
            return null;
        }
    }

    private int Q() {
        return Vars.getVarp((int)lIIIllIlIlIII[4]);
    }

    private static boolean lIlIIIlIlIIllll(int n2) {
        return n2 == 0;
    }

    static {
        p.lIlIIIlIlIIlllI();
        p.lIlIIIlIlIIllIl();
    }

    private void S() {
        this.b(lIIIllIlIlIII[12], new WorldPoint(lIIIllIlIlIII[22], lIIIllIlIlIII[23], lIIIllIlIlIII[0]));
        int[] nArray = new int[lIIIllIlIlIII[3]];
        nArray[p.lIIIllIlIlIII[0]] = lIIIllIlIlIII[12];
        if (p.lIlIIIlIlIlIIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
            this.a(lIIIllIlIlIII[16], new WorldPoint(lIIIllIlIlIII[24], lIIIllIlIlIII[25], lIIIllIlIlIII[0]), lIIIllIlIIlll[lIIIllIlIlIII[26]], lIIIllIlIIlll[lIIIllIlIlIII[27]]);
        }
    }

    /*
     * WARNING - void declaration
     */
    public void b(int n2, WorldPoint worldPoint) {
        int[] nArray = new int[lIIIllIlIlIII[3]];
        nArray[p.lIIIllIlIlIII[0]] = n2;
        if (p.lIlIIIlIlIIllll(Inventory.contains((int[])nArray) ? 1 : 0)) {
            int[] nArray2 = new int[lIIIllIlIlIII[3]];
            nArray2[p.lIIIllIlIlIII[0]] = n2;
            TileObject tileObject = TileObjects.getNearest((int[])nArray2);
            if (p.lIlIIIlIlIlIIll(tileObject)) {
                Walker.walkTo((WorldPoint)worldPoint);
                0;
                0;
                if (1 > 2) {
                    return;
                }
            } else {
                void lllllllllllllllIIIIlIIlIIlIlllII;
                lllllllllllllllIIIIlIIlIIlIlllII.interact(lIIIllIlIIlll[lIIIllIlIlIII[50]]);
            }
        }
    }

    private static boolean lIlIIIlIlIlIIlI(Object object) {
        return object != null;
    }

    private void T() {
        this.a(lIIIllIlIlIII[15], new WorldPoint(lIIIllIlIlIII[28], lIIIllIlIlIII[29], lIIIllIlIlIII[0]));
    }
}

