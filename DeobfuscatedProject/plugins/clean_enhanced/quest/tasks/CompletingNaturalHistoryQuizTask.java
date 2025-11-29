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
package gg.squire.quest.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.plugins.fw.TaskManager;
import gg.squire.quest.SquireQuester;
import gg.squire.quest.SquireQuesterConfig;
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
import gg.squire.quest.tasks.GameEnum4;
import gg.squire.quest.tasks.GameEnum3;

@TaskDesc(name="Completing Natural History Quiz", register=true)
public class CompletingNaturalHistoryQuizTask
extends Task {
    private final  TaskManager aJ;
    private  int aK;

    private final  SquireQuester aI;
    private final  SquireQuesterConfig aH;
    private final  Client aG;
    private  boolean aL;

    /*
     * WARNING - void declaration
     */
    private void a(WorldPoint worldPoint, int n2) {
        int[] nArray = new int[var1[1]];
        nArray[t.var1[0]] = n2;
        TileObject tileObject = (TileObject)TileObjects.getAt((WorldPoint)worldPoint, (int[])nArray).get(var1[0]);
        if (t.var3(tileObject)) {
            System.out.println(var2[var1[9]]);
            tileObject.interact(var2[var1[10]]);
            this.c(var1[10]);
            0;
            if (3 == 2) {
                return;
            }
        } else {
            void var4;
            Walker.walkTo((WorldPoint)var4);
            0;
        }
    }

    private static boolean var5(int n2) {
        return n2 == 0;
    }

    private void bd() {
        t var6;
        int var7;
        WorldPoint var8;
        this.b(var1[0]);
        WorldPoint worldPoint = null;
        int n2 = var1[0];
        if (t.var9(Vars.getBit((int)var1[14]), var1[7])) {
            worldPoint = new WorldPoint(var1[15], var1[16], var1[0]);
            n2 = var1[17];
            this.a(worldPoint, n2);
            return;
        }
        if (t.var9(Vars.getBit((int)var1[18]), var1[7])) {
            var8 = new WorldPoint(var1[19], var1[16], var1[0]);
            var7 = var1[20];
            var6.a(var8, var7);
            return;
        }
        if (t.var9(Vars.getBit((int)var1[21]), var1[7])) {
            var8 = new WorldPoint(var1[22], var1[16], var1[0]);
            var7 = var1[23];
            var6.a(var8, var7);
            return;
        }
        if (t.var9(Vars.getBit((int)var1[24]), var1[7])) {
            var8 = new WorldPoint(var1[25], var1[16], var1[0]);
            var7 = var1[26];
            var6.a(var8, var7);
            return;
        }
        if (t.var9(Vars.getBit((int)var1[27]), var1[7])) {
            var8 = new WorldPoint(var1[28], var1[29], var1[0]);
            var7 = var1[30];
            var6.a(var8, var7);
            return;
        }
        if (t.var9(Vars.getBit((int)var1[31]), var1[7])) {
            var8 = new WorldPoint(var1[32], var1[29], var1[0]);
            var7 = var1[33];
            var6.a(var8, var7);
            return;
        }
        if (t.var9(Vars.getBit((int)var1[34]), var1[7])) {
            var8 = new WorldPoint(var1[35], var1[36], var1[0]);
            var7 = var1[37];
            var6.a(var8, var7);
            return;
        }
        if (t.var9(Vars.getBit((int)var1[38]), var1[7])) {
            var8 = new WorldPoint(var1[39], var1[36], var1[0]);
            var7 = var1[40];
            var6.a(var8, var7);
            return;
        }
        if (t.var9(Vars.getBit((int)var1[41]), var1[7])) {
            var8 = new WorldPoint(var1[42], var1[43], var1[0]);
            var7 = var1[44];
            var6.a(var8, var7);
            return;
        }
        if (t.var9(Vars.getBit((int)var1[45]), var1[7])) {
            var8 = new WorldPoint(var1[46], var1[47], var1[0]);
            var7 = var1[48];
            var6.a(var8, var7);
            return;
        }
        if (t.var9(Vars.getBit((int)var1[49]), var1[7])) {
            var8 = new WorldPoint(var1[50], var1[36], var1[0]);
            var7 = var1[51];
            var6.a(var8, var7);
            return;
        }
        if (t.var9(Vars.getBit((int)var1[52]), var1[7])) {
            var8 = new WorldPoint(var1[53], var1[36], var1[0]);
            var7 = var1[54];
            var6.a(var8, var7);
            return;
        }
        if (t.var9(Vars.getBit((int)var1[55]), var1[7])) {
            var8 = new WorldPoint(var1[56], var1[29], var1[0]);
            var7 = var1[57];
            var6.a(var8, var7);
            return;
        }
        if (t.var9(Vars.getBit((int)var1[58]), var1[7])) {
            var8 = new WorldPoint(var1[59], var1[29], var1[0]);
            var7 = var1[60];
            var6.a(var8, var7);
            return;
        }
        this.b(var1[1]);
    }

    private static void var10() {
        var2 = new String[var1[13]];
        t.var2[t.var1[0]] = "Turning in quest";
        t.var2[t.var1[1]] = "Talk-to";
        t.var2[t.var1[4]] = "Talking to orlando";
        t.var2[t.var1[7]] = "Skipping dialogue";
        t.var2[t.var1[9]] = "Studying";
        t.var2[t.var1[10]] = "Study";
        t.var2[t.var1[11]] = "Talk-to";
        t.var2[t.var1[12]] = "Ok";
    }

    @Inject
    public CompletingNaturalHistoryQuizTask(Client client, SquireQuesterConfig squireQuesterConfig, SquireQuester squireQuester, TaskManager taskManager) {
        this.aG = client;
        this.aH = squireQuesterConfig;
        this.aI = squireQuester;
        this.aJ = taskManager;
    }

    private static boolean var11(int n2, int n3) {
        return n2 < n3;
    }

    private static String var12(String var13, String var14) {
        var13 = new String(Base64.getDecoder().decode(var13.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var15 = new StringBuilder();
        char[] var16 = var14.toCharArray();
        int var17 = var1[0];
        char[] var18 = var13.toCharArray();
        int var19 = var18.length;
        int var20 = var1[0];
        while (t.var11(var20, var19)) {
            char var21 = var18[var20];
            var15.append((char)(var21 ^ var16[var17 % var16.length]));
            0;
            ++var17;
            ++var20;
            0;
            if ((0x21 ^ 0x25) > 3) continue;
            return null;
        }
        return String.valueOf(var15);
    }

    private static boolean var9(int n2, int n3) {
        return n2 != n3;
    }

    public void c(int n2) {
        this.aK = n2;
    }

    private static boolean var22(int n2, int n3) {
        return n2 >= n3;
    }

    public void b(boolean bl) {
        this.aL = bl;
    }

    private void Y() {
        System.out.println(var2[var1[0]]);
        if (t.var5(Dialog.canContinue() ? 1 : 0) && t.var5(Dialog.isViewingOptions() ? 1 : 0)) {
            int[] nArray = new int[var1[1]];
            nArray[t.var1[0]] = var1[3];
            NPC nPC = NPCs.getNearest((int[])nArray);
            if (t.var3(nPC)) {
                nPC.interact(var2[var1[1]]);
                System.out.println(var2[var1[4]]);
                0;
                if (2 != 2) {
                    return;
                }
            } else {
                Walker.walkTo((WorldPoint)new WorldPoint(var1[5], var1[6], var1[0]));
                0;
            }
            0;
            if (-3 >= 0) {
                return;
            }
        } else {
            System.out.println(var2[var1[7]]);
            DialogOption[] dialogOptionArray = new DialogOption[var1[8]];
            dialogOptionArray[t.var1[0]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[t.var1[1]] = DialogOption.PLAYER_CONTINUE;
            dialogOptionArray[t.var1[4]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[t.var1[7]] = DialogOption.PLAYER_CONTINUE;
            dialogOptionArray[t.var1[9]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[t.var1[10]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[t.var1[11]] = DialogOption.PLAYER_CONTINUE;
            dialogOptionArray[t.var1[12]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[t.var1[13]] = DialogOption.PLAYER_CONTINUE;
            Dialog.invokeDialog((DialogOption[])dialogOptionArray);
        }
    }

    public boolean run() {
        t var23;
        if (t.var5(this.aH.quest().equals((Object)h.NATURAL_HISTORY_QUIZ) ? 1 : 0)) {
            return var1[0];
        }
        if (t.var5(Movement.shouldWalk() ? 1 : 0)) {
            return var1[0];
        }
        if (t.var22(var23.be(), var1[1])) {
            var23.aK -= var1[1];
            return var1[0];
        }
        if (t.var5(Vars.getBit((int)var1[2]))) {
            var23.M();
            return var1[1];
        }
        if (t.var24(var23.aL)) {
            var23.Y();
        }
        this.bd();
        return var1[1];
    }

    public boolean bf() {
        return this.aL;
    }

    private void M() {
        if (t.var5(Dialog.canContinue() ? 1 : 0) && t.var5(Dialog.isViewingOptions() ? 1 : 0)) {
            int[] nArray = new int[var1[1]];
            nArray[t.var1[0]] = var1[3];
            NPC nPC = NPCs.getNearest((int[])nArray);
            if (t.var3(nPC)) {
                nPC.interact(var2[var1[11]]);
                this.sleepWhile(var1[61], () -> {
                    boolean bl;
                    if (t.var5(Dialog.isOpen() ? 1 : 0)) {
                        bl = var1[1];
                        0;
                        if (((0x5E ^ 0x52 ^ (0x84 ^ 0x9F)) & (0x26 ^ 0x4B ^ (0xF8 ^ 0x82) ^ -1)) != 0) {
                            return ((1 ^ (2 ^ 0x21)) & (150 + 100 - 109 + 30 ^ 125 + 124 - 179 + 67 ^ -1)) != 0;
                        }
                    } else {
                        bl = var1[0];
                    }
                    return bl;
                });
                0;
                if null != null {
                    return;
                }
            } else {
                Walker.walkTo((WorldPoint)new WorldPoint(var1[5], var1[6], var1[0]));
                0;
            }
            0;
            if ((0x87 ^ 0x83) <= 0) {
                return;
            }
        } else {
            DialogOption[] dialogOptionArray = new DialogOption[var1[62]];
            dialogOptionArray[t.var1[0]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[t.var1[1]] = DialogOption.PLAYER_CONTINUE;
            dialogOptionArray[t.var1[4]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[t.var1[7]] = DialogOption.PLAYER_CONTINUE;
            dialogOptionArray[t.var1[9]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[t.var1[10]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[t.var1[11]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[t.var1[12]] = DialogOption.PLAYER_CONTINUE;
            dialogOptionArray[t.var1[13]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[t.var1[8]] = DialogOption.PLAYER_CONTINUE;
            dialogOptionArray[t.var1[61]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[t.var1[63]] = DialogOption.CHAT_OPTION_ONE;
            Dialog.invokeDialog((DialogOption[])dialogOptionArray);
        }
    }

    static {
        t.var25();
        t.var10();
    }

    private static void var25() {
        var1 = new int[65];
        t.var1[0] = (0x13 ^ 8) & ~(0x4C ^ 0x57);
        t.var1[1] = 1;
        t.var1[2] = -(0xFFFFF0B3 & 0x3FCD) & (0xFFFFFED7 & 0x3FFF);
        t.var1[3] = -(0xFFFFF9AF & 0x6ED9) & (0xFFFFFFFD & 0x7FFB);
        t.var1[4] = 2;
        t.var1[5] = 0xFFFFAEDF & 0x57FF;
        t.var1[6] = 0xFFFFB7DB & 0x5B7F;
        t.var1[7] = 3;
        t.var1[8] = 0x16 ^ 0x7D ^ (0x3B ^ 0x59);
        t.var1[9] = 0x73 ^ 0x77;
        t.var1[10] = 0xAF ^ 0xAA;
        t.var1[11] = 0x66 ^ 0x60;
        t.var1[12] = 0x19 ^ 0x1E;
        t.var1[13] = 124 + 104 - 207 + 122 ^ 23 + 3 - -43 + 66;
        t.var1[14] = 0xFFFFAF7B & 0x5EDF;
        t.var1[15] = 0xFFFFD6EF & 0x2FDF;
        t.var1[16] = -(0xFFFFFD5B & 0x66AD) & (0xFFFFFF7A & 0x77FF);
        t.var1[17] = -(0xFFFFAFE1 & 0x5C7F) & (0xFFFFED7F & 0x7EFD);
        t.var1[18] = -(0xFFFFF9DF & 0x76BF) & (0xFFFFFEFE & Short.MAX_VALUE);
        t.var1[19] = -(0xFFFFF6A7 & 0x597F) & (0xFFFFD6FF & Short.MAX_VALUE);
        t.var1[20] = -(0xFFFFDDAB & 0x3255) & (0xFFFFF13E & 0x7EDF);
        t.var1[21] = -(0xFFFFFD4E & 0x72B9) & (0xFFFFFE7F & 0x7FDF);
        t.var1[22] = -(0xFFFFFA1D & 0x65F6) & (0xFFFFEFFB & 0x76FF);
        t.var1[23] = -(0xFFFFCF6B & 0x36D5) & (0xFFFFFE5F & 0x67FF);
        t.var1[24] = -(0xFFFFFBFD & 0x741B) & (0xFFFFFE7B & 0x7FFD);
        t.var1[25] = -(0xFFFFCF8F & 0x787D) & (0xFFFFDFFF & 0x6EFE);
        t.var1[26] = -(0xFFFFEDDF & 0x1F7D) & (0xFFFFEF7F & 0x7DFC);
        t.var1[27] = -(0xFFFFD3BD & 0x3DE3) & (0xFFFF9FFA & Short.MAX_VALUE);
        t.var1[28] = -(0xFFFFB1FF & 0x6F0F) & (0xFFFFAFFF & 0x77FE);
        t.var1[29] = 0xFFFFDB63 & 0x37FF;
        t.var1[30] = 0xFFFFF37F & 0x6CA5;
        t.var1[31] = -(0xFFFFADAB & 0x72D5) & (0xFFFFFFDD & 0x2EFF);
        t.var1[32] = 0xFFFFE7FF & 0x1EF7;
        t.var1[33] = -(0xFFFFD89B & 0x2FFD) & (0xFFFFFCFE & 0x6BBF);
        t.var1[34] = 0xFFFFFE7E & 0xFDD;
        t.var1[35] = -(0xFFFFDFB3 & 0x395D) & (0xFFFF9FFF & 0x7FFE);
        t.var1[36] = 0xFFFF9B7D & 0x77DF;
        t.var1[37] = 0xFFFFEA67 & 0x75BF;
        t.var1[38] = 0xFFFFEF62 & 0x1EFF;
        t.var1[39] = -(0xFFFFFB8D & 0xC73) & (0xFFFFBEF5 & 0x4FFF);
        t.var1[40] = 0xFFFFFB2A & 0x64FD;
        t.var1[41] = 0xFFFFBEE4 & 0x4F7F;
        t.var1[42] = 0xFFFFBEF3 & 0x47EE;
        t.var1[43] = -(15 + 85 - -15 + 14) & (0xFFFFF3EA & 0x1FDF);
        t.var1[44] = -(0xFFFF8DD3 & 0x7B7E) & (0xFFFFED7B & 0x7BFF);
        t.var1[45] = -(0xFFFFF2BD & 0x5D5B) & (0xFFFFFE7B & 0x5FFF);
        t.var1[46] = -(0xFFFFD537 & 0x7BED) & (0xFFFFDFFF & 0x77FF);
        t.var1[47] = 0xFFFFDB4E & 0x37FD;
        t.var1[48] = -(0xFFFFCFFD & 0x36C3) & (0xFFFFF7FF & 0x6EE9);
        t.var1[49] = -(0xFFFFDFAF & 0x6177) & (0xFFFFFFFF & 0x4F7F);
        t.var1[50] = -(0xFFFFF2B9 & 0x6D57) & (0xFFFFE6FF & 0x7FDE);
        t.var1[51] = 0xFFFFF72F & 0x68F4;
        t.var1[52] = -(0xFFFFF0A6 & 0x1FDB) & (0xFFFFBFDF & 0x5EFF);
        t.var1[53] = -(0xFFFFFBF9 & 0x6537) & (0xFFFFEFF7 & 0x77FF);
        t.var1[54] = 0xFFFFF93B & 0x66E7;
        t.var1[55] = 0xFFFFCFFF & 0x3E5F;
        t.var1[56] = 0xFFFFFFDD & 0x6EB;
        t.var1[57] = 0xFFFFE1AB & 0x7E75;
        t.var1[58] = -(0xFFFFD49B & 0x7BFF) & (0xFFFFFEFF & 0x5FFF);
        t.var1[59] = 0xFFFFBFFB & 0x46D4;
        t.var1[60] = -(0xFFFFC70F & 0x3BF9) & (0xFFFFEFBF & 0x736A);
        t.var1[61] = 0x39 ^ 0x33;
        t.var1[62] = 99 + 28 - 11 + 26 ^ 65 + 47 - 21 + 39;
        t.var1[63] = 0xB ^ 0;
        t.var1[64] = -(0xFFFFBFEB & 0x657D) & (0xFFFFAF7D & 0x77FF);
    }

    private static boolean var3(Object object) {
        return object != null;
    }

    @Subscribe
    public void a(WidgetLoaded widgetLoaded) {
        t var26;
        if (t.var9(widgetLoaded.getGroupId(), var1[64])) {
            return;
        }
        Widget var27 = var26.aG.getWidget(WidgetInfo.VARROCK_MUSEUM_QUESTION);
        if (t.var28(var27)) {
            return;
        }
        int[] nArray = new int[var1[7]];
        nArray[t.var1[0]] = WidgetInfo.VARROCK_MUSEUM_FIRST_ANSWER.getId();
        nArray[t.var1[1]] = WidgetInfo.VARROCK_MUSEUM_SECOND_ANSWER.getId();
        nArray[t.var1[4]] = WidgetInfo.VARROCK_MUSEUM_THIRD_ANSWER.getId();
        Widget var29 = u.a(var26.aG, var27.getText(), nArray);
        if (t.var28(var29)) {
            return;
        }
        String var30 = var29.getText();
        if (t.var24(var30.equals(Text.removeTags((String)var30)) ? 1 : 0)) {
            WidgetPackets.widgetAction((Widget)var29, (String)var2[var1[12]]);
        }
    }

    private static boolean var28(Object object) {
        return object == null;
    }

    public int be() {
        return this.aK;
    }

        catch (Exception var36) {
            var36.printStackTrace();
            return null;
        }
    }

        catch (Exception var42) {
            var42.printStackTrace();
            return null;
        }
    }

    private static boolean var24(int n2) {
        return n2 != 0;
    }
}

