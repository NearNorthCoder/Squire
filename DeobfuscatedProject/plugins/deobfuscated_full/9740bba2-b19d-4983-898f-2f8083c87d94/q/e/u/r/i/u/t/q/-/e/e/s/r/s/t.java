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
 *  net.runelite.api.NPC
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.events.WidgetLoaded
 *  net.runelite.api.widgets.Widget
 *  net.runelite.api.widgets.WidgetInfo
 *  net.runelite.client.eventbus.Subscribe
 *  net.runelite.client.util.Text
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.Walker
 *  net.unethicalite.api.packets.WidgetPackets
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
import net.runelite.api.NPC;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.WidgetLoaded;
import net.runelite.api.widgets.Widget;
import net.runelite.api.widgets.WidgetInfo;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.util.Text;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.Walker;
import net.unethicalite.api.packets.WidgetPackets;
import net.unethicalite.api.widgets.Dialog;
import q.e.u.r.i.u.t.q.-.e.e.s.r.s.h;
import q.e.u.r.i.u.t.q.-.e.e.s.r.s.u;

/* TASK: Completing Natural History Quiz -> CompletingnaturalhistoryquizTask */
@TaskDesc(name="Completing Natural History Quiz", register=true)
public class t
extends Task {
    private final /* synthetic */ TaskManager aJ;
    private /* synthetic */ int aK;
    private static /* synthetic */ int[] lIIIllIIIllII;
    private static /* synthetic */ String[] lIIIllIIIlIll;
    private final /* synthetic */ SquireQuester aI;
    private final /* synthetic */ SquireQuesterConfig aH;
    private final /* synthetic */ Client aG;
    private /* synthetic */ boolean aL;

    /*
     * WARNING - void declaration
     */
    private void a(WorldPoint worldPoint, int n2) {
        int[] nArray = new int[lIIIllIIIllII[1]];
        nArray[t.lIIIllIIIllII[0]] = n2;
        TileObject tileObject = (TileObject)TileObjects.getAt((WorldPoint)worldPoint, (int[])nArray).get(lIIIllIIIllII[0]);
        if (t.lIlIIIIllIlllII(tileObject)) {
            System.out.println(lIIIllIIIlIll[lIIIllIIIllII[9]]);
            tileObject.interact(lIIIllIIIlIll[lIIIllIIIllII[10]]);
            this.c(lIIIllIIIllII[10]);
            0;
            if (3 == 2) {
                return;
            }
        } else {
            void var23;
            Walker.walkTo((WorldPoint)var23);
            0;
        }
    }

    private static boolean lIlIIIIllIllIIl(int n2) {
        return n2 == 0;
    }

    private void bd() {
        t var27;
        int var20;
        WorldPoint var12;
        this.b(lIIIllIIIllII[0]);
        WorldPoint worldPoint = null;
        int n2 = lIIIllIIIllII[0];
        if (t.lIlIIIIllIlllIl(Vars.getBit((int)lIIIllIIIllII[14]), lIIIllIIIllII[7])) {
            worldPoint = new WorldPoint(lIIIllIIIllII[15], lIIIllIIIllII[16], lIIIllIIIllII[0]);
            n2 = lIIIllIIIllII[17];
            this.a(worldPoint, n2);
            return;
        }
        if (t.lIlIIIIllIlllIl(Vars.getBit((int)lIIIllIIIllII[18]), lIIIllIIIllII[7])) {
            var12 = new WorldPoint(lIIIllIIIllII[19], lIIIllIIIllII[16], lIIIllIIIllII[0]);
            var20 = lIIIllIIIllII[20];
            var27.a(var12, var20);
            return;
        }
        if (t.lIlIIIIllIlllIl(Vars.getBit((int)lIIIllIIIllII[21]), lIIIllIIIllII[7])) {
            var12 = new WorldPoint(lIIIllIIIllII[22], lIIIllIIIllII[16], lIIIllIIIllII[0]);
            var20 = lIIIllIIIllII[23];
            var27.a(var12, var20);
            return;
        }
        if (t.lIlIIIIllIlllIl(Vars.getBit((int)lIIIllIIIllII[24]), lIIIllIIIllII[7])) {
            var12 = new WorldPoint(lIIIllIIIllII[25], lIIIllIIIllII[16], lIIIllIIIllII[0]);
            var20 = lIIIllIIIllII[26];
            var27.a(var12, var20);
            return;
        }
        if (t.lIlIIIIllIlllIl(Vars.getBit((int)lIIIllIIIllII[27]), lIIIllIIIllII[7])) {
            var12 = new WorldPoint(lIIIllIIIllII[28], lIIIllIIIllII[29], lIIIllIIIllII[0]);
            var20 = lIIIllIIIllII[30];
            var27.a(var12, var20);
            return;
        }
        if (t.lIlIIIIllIlllIl(Vars.getBit((int)lIIIllIIIllII[31]), lIIIllIIIllII[7])) {
            var12 = new WorldPoint(lIIIllIIIllII[32], lIIIllIIIllII[29], lIIIllIIIllII[0]);
            var20 = lIIIllIIIllII[33];
            var27.a(var12, var20);
            return;
        }
        if (t.lIlIIIIllIlllIl(Vars.getBit((int)lIIIllIIIllII[34]), lIIIllIIIllII[7])) {
            var12 = new WorldPoint(lIIIllIIIllII[35], lIIIllIIIllII[36], lIIIllIIIllII[0]);
            var20 = lIIIllIIIllII[37];
            var27.a(var12, var20);
            return;
        }
        if (t.lIlIIIIllIlllIl(Vars.getBit((int)lIIIllIIIllII[38]), lIIIllIIIllII[7])) {
            var12 = new WorldPoint(lIIIllIIIllII[39], lIIIllIIIllII[36], lIIIllIIIllII[0]);
            var20 = lIIIllIIIllII[40];
            var27.a(var12, var20);
            return;
        }
        if (t.lIlIIIIllIlllIl(Vars.getBit((int)lIIIllIIIllII[41]), lIIIllIIIllII[7])) {
            var12 = new WorldPoint(lIIIllIIIllII[42], lIIIllIIIllII[43], lIIIllIIIllII[0]);
            var20 = lIIIllIIIllII[44];
            var27.a(var12, var20);
            return;
        }
        if (t.lIlIIIIllIlllIl(Vars.getBit((int)lIIIllIIIllII[45]), lIIIllIIIllII[7])) {
            var12 = new WorldPoint(lIIIllIIIllII[46], lIIIllIIIllII[47], lIIIllIIIllII[0]);
            var20 = lIIIllIIIllII[48];
            var27.a(var12, var20);
            return;
        }
        if (t.lIlIIIIllIlllIl(Vars.getBit((int)lIIIllIIIllII[49]), lIIIllIIIllII[7])) {
            var12 = new WorldPoint(lIIIllIIIllII[50], lIIIllIIIllII[36], lIIIllIIIllII[0]);
            var20 = lIIIllIIIllII[51];
            var27.a(var12, var20);
            return;
        }
        if (t.lIlIIIIllIlllIl(Vars.getBit((int)lIIIllIIIllII[52]), lIIIllIIIllII[7])) {
            var12 = new WorldPoint(lIIIllIIIllII[53], lIIIllIIIllII[36], lIIIllIIIllII[0]);
            var20 = lIIIllIIIllII[54];
            var27.a(var12, var20);
            return;
        }
        if (t.lIlIIIIllIlllIl(Vars.getBit((int)lIIIllIIIllII[55]), lIIIllIIIllII[7])) {
            var12 = new WorldPoint(lIIIllIIIllII[56], lIIIllIIIllII[29], lIIIllIIIllII[0]);
            var20 = lIIIllIIIllII[57];
            var27.a(var12, var20);
            return;
        }
        if (t.lIlIIIIllIlllIl(Vars.getBit((int)lIIIllIIIllII[58]), lIIIllIIIllII[7])) {
            var12 = new WorldPoint(lIIIllIIIllII[59], lIIIllIIIllII[29], lIIIllIIIllII[0]);
            var20 = lIIIllIIIllII[60];
            var27.a(var12, var20);
            return;
        }
        this.b(lIIIllIIIllII[1]);
    }

    private static void lIlIIIIllIlIlll() {
        lIIIllIIIlIll = new String[lIIIllIIIllII[13]];
        t.lIIIllIIIlIll[t.lIIIllIIIllII[0]] = t."Turning in quest";
        t.lIIIllIIIlIll[t.lIIIllIIIllII[1]] = t."Talk-to";
        t.lIIIllIIIlIll[t.lIIIllIIIllII[4]] = t."Talking to orlando";
        t.lIIIllIIIlIll[t.lIIIllIIIllII[7]] = t."Skipping dialogue";
        t.lIIIllIIIlIll[t.lIIIllIIIllII[9]] = t."Studying";
        t.lIIIllIIIlIll[t.lIIIllIIIllII[10]] = t."Study";
        t.lIIIllIIIlIll[t.lIIIllIIIllII[11]] = t."Talk-to";
        t.lIIIllIIIlIll[t.lIIIllIIIllII[12]] = t."Ok";
    }

    @Inject
    public t(Client client, SquireQuesterConfig squireQuesterConfig, SquireQuester squireQuester, TaskManager taskManager) {
        this.aG = client;
        this.aH = squireQuesterConfig;
        this.aI = squireQuester;
        this.aJ = taskManager;
    }

    private static boolean lIlIIIIllIlllll(int n2, int n3) {
        return n2 < n3;
    }

    private static String lIlIIIIllIlIlII(String var26, String var17) {
        var26 = new String(Base64.getDecoder().decode(var26.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var1 = new StringBuilder();
        char[] var21 = var17.toCharArray();
        int var28 = lIIIllIIIllII[0];
        char[] var25 = var26.toCharArray();
        int var13 = var25.length;
        int var7 = lIIIllIIIllII[0];
        while (t.lIlIIIIllIlllll(var7, var13)) {
            char var18 = var25[var7];
            var1.append((char)(var18 ^ var21[var28 % var21.length]));
            0;
            ++var28;
            ++var7;
            0;
            if ((0x21 ^ 0x25) > 3) continue;
            return null;
        }
        return String.valueOf(var1);
    }

    private static boolean lIlIIIIllIlllIl(int n2, int n3) {
        return n2 != n3;
    }

    public void c(int n2) {
        this.aK = n2;
    }

    private static boolean lIlIIIIllIllIlI(int n2, int n3) {
        return n2 >= n3;
    }

    public void b(boolean bl) {
        this.aL = bl;
    }

    private void Y() {
        System.out.println(lIIIllIIIlIll[lIIIllIIIllII[0]]);
        if (t.lIlIIIIllIllIIl(Dialog.canContinue() ? 1 : 0) && t.lIlIIIIllIllIIl(Dialog.isViewingOptions() ? 1 : 0)) {
            int[] nArray = new int[lIIIllIIIllII[1]];
            nArray[t.lIIIllIIIllII[0]] = lIIIllIIIllII[3];
            NPC nPC = NPCs.getNearest((int[])nArray);
            if (t.lIlIIIIllIlllII(nPC)) {
                nPC.interact(lIIIllIIIlIll[lIIIllIIIllII[1]]);
                System.out.println(lIIIllIIIlIll[lIIIllIIIllII[4]]);
                0;
                if (2 != 2) {
                    return;
                }
            } else {
                Walker.walkTo((WorldPoint)new WorldPoint(lIIIllIIIllII[5], lIIIllIIIllII[6], lIIIllIIIllII[0]));
                0;
            }
            0;
            if (-3 >= 0) {
                return;
            }
        } else {
            System.out.println(lIIIllIIIlIll[lIIIllIIIllII[7]]);
            DialogOption[] dialogOptionArray = new DialogOption[lIIIllIIIllII[8]];
            dialogOptionArray[t.lIIIllIIIllII[0]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[t.lIIIllIIIllII[1]] = DialogOption.PLAYER_CONTINUE;
            dialogOptionArray[t.lIIIllIIIllII[4]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[t.lIIIllIIIllII[7]] = DialogOption.PLAYER_CONTINUE;
            dialogOptionArray[t.lIIIllIIIllII[9]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[t.lIIIllIIIllII[10]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[t.lIIIllIIIllII[11]] = DialogOption.PLAYER_CONTINUE;
            dialogOptionArray[t.lIIIllIIIllII[12]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[t.lIIIllIIIllII[13]] = DialogOption.PLAYER_CONTINUE;
            Dialog.invokeDialog((DialogOption[])dialogOptionArray);
        }
    }

    public boolean run() {
        t var4;
        if (t.lIlIIIIllIllIIl(this.aH.quest().equals((Object)h.NATURAL_HISTORY_QUIZ) ? 1 : 0)) {
            return lIIIllIIIllII[0];
        }
        if (t.lIlIIIIllIllIIl(Movement.shouldWalk() ? 1 : 0)) {
            return lIIIllIIIllII[0];
        }
        if (t.lIlIIIIllIllIlI(var4.be(), lIIIllIIIllII[1])) {
            var4.aK -= lIIIllIIIllII[1];
            return lIIIllIIIllII[0];
        }
        if (t.lIlIIIIllIllIIl(Vars.getBit((int)lIIIllIIIllII[2]))) {
            var4.M();
            return lIIIllIIIllII[1];
        }
        if (t.lIlIIIIllIllIll(var4.aL ? 1 : 0)) {
            var4.Y();
        }
        this.bd();
        return lIIIllIIIllII[1];
    }

    public boolean bf() {
        return this.aL;
    }

    private void M() {
        if (t.lIlIIIIllIllIIl(Dialog.canContinue() ? 1 : 0) && t.lIlIIIIllIllIIl(Dialog.isViewingOptions() ? 1 : 0)) {
            int[] nArray = new int[lIIIllIIIllII[1]];
            nArray[t.lIIIllIIIllII[0]] = lIIIllIIIllII[3];
            NPC nPC = NPCs.getNearest((int[])nArray);
            if (t.lIlIIIIllIlllII(nPC)) {
                nPC.interact(lIIIllIIIlIll[lIIIllIIIllII[11]]);
                this.sleepWhile(lIIIllIIIllII[61], () -> {
                    boolean bl;
                    if (t.lIlIIIIllIllIIl(Dialog.isOpen() ? 1 : 0)) {
                        bl = lIIIllIIIllII[1];
                        0;
                        if (((0x5E ^ 0x52 ^ (0x84 ^ 0x9F)) & (0x26 ^ 0x4B ^ (0xF8 ^ 0x82) ^ -1)) != 0) {
                            return ((1 ^ (2 ^ 0x21)) & (150 + 100 - 109 + 30 ^ 125 + 124 - 179 + 67 ^ -1)) != 0;
                        }
                    } else {
                        bl = lIIIllIIIllII[0];
                    }
                    return bl;
                });
                0;
                
                }
            } else {
                Walker.walkTo((WorldPoint)new WorldPoint(lIIIllIIIllII[5], lIIIllIIIllII[6], lIIIllIIIllII[0]));
                0;
            }
            0;
            if ((0x87 ^ 0x83) <= 0) {
                return;
            }
        } else {
            DialogOption[] dialogOptionArray = new DialogOption[lIIIllIIIllII[62]];
            dialogOptionArray[t.lIIIllIIIllII[0]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[t.lIIIllIIIllII[1]] = DialogOption.PLAYER_CONTINUE;
            dialogOptionArray[t.lIIIllIIIllII[4]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[t.lIIIllIIIllII[7]] = DialogOption.PLAYER_CONTINUE;
            dialogOptionArray[t.lIIIllIIIllII[9]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[t.lIIIllIIIllII[10]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[t.lIIIllIIIllII[11]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[t.lIIIllIIIllII[12]] = DialogOption.PLAYER_CONTINUE;
            dialogOptionArray[t.lIIIllIIIllII[13]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[t.lIIIllIIIllII[8]] = DialogOption.PLAYER_CONTINUE;
            dialogOptionArray[t.lIIIllIIIllII[61]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[t.lIIIllIIIllII[63]] = DialogOption.CHAT_OPTION_ONE;
            Dialog.invokeDialog((DialogOption[])dialogOptionArray);
        }
    }

    static {
        t.lIlIIIIllIllIII();
        t.lIlIIIIllIlIlll();
    }

    private static void lIlIIIIllIllIII() {
        lIIIllIIIllII = new int[65];
        t.lIIIllIIIllII[0] = (0x13 ^ 8) & ~(0x4C ^ 0x57);
        t.lIIIllIIIllII[1] = 1;
        t.lIIIllIIIllII[2] = -(0xFFFFF0B3 & 0x3FCD) & (0xFFFFFED7 & 0x3FFF);
        t.lIIIllIIIllII[3] = -(0xFFFFF9AF & 0x6ED9) & (0xFFFFFFFD & 0x7FFB);
        t.lIIIllIIIllII[4] = 2;
        t.lIIIllIIIllII[5] = 0xFFFFAEDF & 0x57FF;
        t.lIIIllIIIllII[6] = 0xFFFFB7DB & 0x5B7F;
        t.lIIIllIIIllII[7] = 3;
        t.lIIIllIIIllII[8] = 0x16 ^ 0x7D ^ (0x3B ^ 0x59);
        t.lIIIllIIIllII[9] = 0x73 ^ 0x77;
        t.lIIIllIIIllII[10] = 0xAF ^ 0xAA;
        t.lIIIllIIIllII[11] = 0x66 ^ 0x60;
        t.lIIIllIIIllII[12] = 0x19 ^ 0x1E;
        t.lIIIllIIIllII[13] = 124 + 104 - 207 + 122 ^ 23 + 3 - -43 + 66;
        t.lIIIllIIIllII[14] = 0xFFFFAF7B & 0x5EDF;
        t.lIIIllIIIllII[15] = 0xFFFFD6EF & 0x2FDF;
        t.lIIIllIIIllII[16] = -(0xFFFFFD5B & 0x66AD) & (0xFFFFFF7A & 0x77FF);
        t.lIIIllIIIllII[17] = -(0xFFFFAFE1 & 0x5C7F) & (0xFFFFED7F & 0x7EFD);
        t.lIIIllIIIllII[18] = -(0xFFFFF9DF & 0x76BF) & (0xFFFFFEFE & Short.MAX_VALUE);
        t.lIIIllIIIllII[19] = -(0xFFFFF6A7 & 0x597F) & (0xFFFFD6FF & Short.MAX_VALUE);
        t.lIIIllIIIllII[20] = -(0xFFFFDDAB & 0x3255) & (0xFFFFF13E & 0x7EDF);
        t.lIIIllIIIllII[21] = -(0xFFFFFD4E & 0x72B9) & (0xFFFFFE7F & 0x7FDF);
        t.lIIIllIIIllII[22] = -(0xFFFFFA1D & 0x65F6) & (0xFFFFEFFB & 0x76FF);
        t.lIIIllIIIllII[23] = -(0xFFFFCF6B & 0x36D5) & (0xFFFFFE5F & 0x67FF);
        t.lIIIllIIIllII[24] = -(0xFFFFFBFD & 0x741B) & (0xFFFFFE7B & 0x7FFD);
        t.lIIIllIIIllII[25] = -(0xFFFFCF8F & 0x787D) & (0xFFFFDFFF & 0x6EFE);
        t.lIIIllIIIllII[26] = -(0xFFFFEDDF & 0x1F7D) & (0xFFFFEF7F & 0x7DFC);
        t.lIIIllIIIllII[27] = -(0xFFFFD3BD & 0x3DE3) & (0xFFFF9FFA & Short.MAX_VALUE);
        t.lIIIllIIIllII[28] = -(0xFFFFB1FF & 0x6F0F) & (0xFFFFAFFF & 0x77FE);
        t.lIIIllIIIllII[29] = 0xFFFFDB63 & 0x37FF;
        t.lIIIllIIIllII[30] = 0xFFFFF37F & 0x6CA5;
        t.lIIIllIIIllII[31] = -(0xFFFFADAB & 0x72D5) & (0xFFFFFFDD & 0x2EFF);
        t.lIIIllIIIllII[32] = 0xFFFFE7FF & 0x1EF7;
        t.lIIIllIIIllII[33] = -(0xFFFFD89B & 0x2FFD) & (0xFFFFFCFE & 0x6BBF);
        t.lIIIllIIIllII[34] = 0xFFFFFE7E & 0xFDD;
        t.lIIIllIIIllII[35] = -(0xFFFFDFB3 & 0x395D) & (0xFFFF9FFF & 0x7FFE);
        t.lIIIllIIIllII[36] = 0xFFFF9B7D & 0x77DF;
        t.lIIIllIIIllII[37] = 0xFFFFEA67 & 0x75BF;
        t.lIIIllIIIllII[38] = 0xFFFFEF62 & 0x1EFF;
        t.lIIIllIIIllII[39] = -(0xFFFFFB8D & 0xC73) & (0xFFFFBEF5 & 0x4FFF);
        t.lIIIllIIIllII[40] = 0xFFFFFB2A & 0x64FD;
        t.lIIIllIIIllII[41] = 0xFFFFBEE4 & 0x4F7F;
        t.lIIIllIIIllII[42] = 0xFFFFBEF3 & 0x47EE;
        t.lIIIllIIIllII[43] = -(15 + 85 - -15 + 14) & (0xFFFFF3EA & 0x1FDF);
        t.lIIIllIIIllII[44] = -(0xFFFF8DD3 & 0x7B7E) & (0xFFFFED7B & 0x7BFF);
        t.lIIIllIIIllII[45] = -(0xFFFFF2BD & 0x5D5B) & (0xFFFFFE7B & 0x5FFF);
        t.lIIIllIIIllII[46] = -(0xFFFFD537 & 0x7BED) & (0xFFFFDFFF & 0x77FF);
        t.lIIIllIIIllII[47] = 0xFFFFDB4E & 0x37FD;
        t.lIIIllIIIllII[48] = -(0xFFFFCFFD & 0x36C3) & (0xFFFFF7FF & 0x6EE9);
        t.lIIIllIIIllII[49] = -(0xFFFFDFAF & 0x6177) & (0xFFFFFFFF & 0x4F7F);
        t.lIIIllIIIllII[50] = -(0xFFFFF2B9 & 0x6D57) & (0xFFFFE6FF & 0x7FDE);
        t.lIIIllIIIllII[51] = 0xFFFFF72F & 0x68F4;
        t.lIIIllIIIllII[52] = -(0xFFFFF0A6 & 0x1FDB) & (0xFFFFBFDF & 0x5EFF);
        t.lIIIllIIIllII[53] = -(0xFFFFFBF9 & 0x6537) & (0xFFFFEFF7 & 0x77FF);
        t.lIIIllIIIllII[54] = 0xFFFFF93B & 0x66E7;
        t.lIIIllIIIllII[55] = 0xFFFFCFFF & 0x3E5F;
        t.lIIIllIIIllII[56] = 0xFFFFFFDD & 0x6EB;
        t.lIIIllIIIllII[57] = 0xFFFFE1AB & 0x7E75;
        t.lIIIllIIIllII[58] = -(0xFFFFD49B & 0x7BFF) & (0xFFFFFEFF & 0x5FFF);
        t.lIIIllIIIllII[59] = 0xFFFFBFFB & 0x46D4;
        t.lIIIllIIIllII[60] = -(0xFFFFC70F & 0x3BF9) & (0xFFFFEFBF & 0x736A);
        t.lIIIllIIIllII[61] = 0x39 ^ 0x33;
        t.lIIIllIIIllII[62] = 99 + 28 - 11 + 26 ^ 65 + 47 - 21 + 39;
        t.lIIIllIIIllII[63] = 0xB ^ 0;
        t.lIIIllIIIllII[64] = -(0xFFFFBFEB & 0x657D) & (0xFFFFAF7D & 0x77FF);
    }

    private static boolean lIlIIIIllIlllII(Object object) {
        return object != null;
    }

    @Subscribe
    public void a(WidgetLoaded widgetLoaded) {
        t var10;
        if (t.lIlIIIIllIlllIl(widgetLoaded.getGroupId(), lIIIllIIIllII[64])) {
            return;
        }
        Widget var6 = var10.aG.getWidget(WidgetInfo.VARROCK_MUSEUM_QUESTION);
        if (t.lIlIIIIllIllllI(var6)) {
            return;
        }
        int[] nArray = new int[lIIIllIIIllII[7]];
        nArray[t.lIIIllIIIllII[0]] = WidgetInfo.VARROCK_MUSEUM_FIRST_ANSWER.getId();
        nArray[t.lIIIllIIIllII[1]] = WidgetInfo.VARROCK_MUSEUM_SECOND_ANSWER.getId();
        nArray[t.lIIIllIIIllII[4]] = WidgetInfo.VARROCK_MUSEUM_THIRD_ANSWER.getId();
        Widget var9 = u.a(var10.aG, var6.getText(), nArray);
        if (t.lIlIIIIllIllllI(var9)) {
            return;
        }
        String var24 = var9.getText();
        if (t.lIlIIIIllIllIll(var24.equals(Text.removeTags((String)var24)) ? 1 : 0)) {
            WidgetPackets.widgetAction((Widget)var9, (String)lIIIllIIIlIll[lIIIllIIIllII[12]]);
        }
    }

    private static boolean lIlIIIIllIllllI(Object object) {
        return object == null;
    }

    public int be() {
        return this.aK;
    }

    private static String lIlIIIIllIlIlIl(String var14, String var5) {
        try {
            SecretKeySpec var2 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var5.getBytes(StandardCharsets.UTF_8)), lIIIllIIIllII[13]), "DES");
            Cipher var16 = Cipher.getInstance("DES");
            var16.init(lIIIllIIIllII[4], var2);
            return new String(var16.doFinal(Base64.getDecoder().decode(var14.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var22) {
            var22.printStackTrace();
            return null;
        }
    }

    private static String lIlIIIIllIlIllI(String var3, String var19) {
        try {
            SecretKeySpec var8 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var19.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var15 = Cipher.getInstance("Blowfish");
            var15.init(lIIIllIIIllII[4], var8);
            return new String(var15.doFinal(Base64.getDecoder().decode(var3.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var11) {
            var11.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIIIIllIllIll(int n2) {
        return n2 != 0;
    }
}

