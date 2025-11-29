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
import gg.squire.quest.tasks.GameEnum26;
import gg.squire.quest.tasks.GameEnum19;

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
        int[] nArray = new int[lIIIllIIIllII[1]];
        nArray[t.lIIIllIIIllII[0]] = n2;
        TileObject tileObject = (TileObject)TileObjects.getAt((WorldPoint)worldPoint, (int[])nArray).get(lIIIllIIIllII[0]);
        if (t.lIlIIIIllIlllII(tileObject)) {
            System.out.println(lIIIllIIIlIll[lIIIllIIIllII[9]]);
            tileObject.interact(lIIIllIIIlIll[lIIIllIIIllII[10]]);
            this.c(lIIIllIIIllII[10]);

            if (3 == 2) {
                return;
            }
        } else {
            void var1;
            Walker.walkTo((WorldPoint)var1);

        }
    }

    private static boolean lIlIIIIllIllIIl(int n2) {
        return n2 == 0;
    }

    private void bd() {
        t var2;
        int var3;
        WorldPoint var4;
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
            var4 = new WorldPoint(lIIIllIIIllII[19], lIIIllIIIllII[16], lIIIllIIIllII[0]);
            var3 = lIIIllIIIllII[20];
            var2.a(var4, var3);
            return;
        }
        if (t.lIlIIIIllIlllIl(Vars.getBit((int)lIIIllIIIllII[21]), lIIIllIIIllII[7])) {
            var4 = new WorldPoint(lIIIllIIIllII[22], lIIIllIIIllII[16], lIIIllIIIllII[0]);
            var3 = lIIIllIIIllII[23];
            var2.a(var4, var3);
            return;
        }
        if (t.lIlIIIIllIlllIl(Vars.getBit((int)lIIIllIIIllII[24]), lIIIllIIIllII[7])) {
            var4 = new WorldPoint(lIIIllIIIllII[25], lIIIllIIIllII[16], lIIIllIIIllII[0]);
            var3 = lIIIllIIIllII[26];
            var2.a(var4, var3);
            return;
        }
        if (t.lIlIIIIllIlllIl(Vars.getBit((int)lIIIllIIIllII[27]), lIIIllIIIllII[7])) {
            var4 = new WorldPoint(lIIIllIIIllII[28], lIIIllIIIllII[29], lIIIllIIIllII[0]);
            var3 = lIIIllIIIllII[30];
            var2.a(var4, var3);
            return;
        }
        if (t.lIlIIIIllIlllIl(Vars.getBit((int)lIIIllIIIllII[31]), lIIIllIIIllII[7])) {
            var4 = new WorldPoint(lIIIllIIIllII[32], lIIIllIIIllII[29], lIIIllIIIllII[0]);
            var3 = lIIIllIIIllII[33];
            var2.a(var4, var3);
            return;
        }
        if (t.lIlIIIIllIlllIl(Vars.getBit((int)lIIIllIIIllII[34]), lIIIllIIIllII[7])) {
            var4 = new WorldPoint(lIIIllIIIllII[35], lIIIllIIIllII[36], lIIIllIIIllII[0]);
            var3 = lIIIllIIIllII[37];
            var2.a(var4, var3);
            return;
        }
        if (t.lIlIIIIllIlllIl(Vars.getBit((int)lIIIllIIIllII[38]), lIIIllIIIllII[7])) {
            var4 = new WorldPoint(lIIIllIIIllII[39], lIIIllIIIllII[36], lIIIllIIIllII[0]);
            var3 = lIIIllIIIllII[40];
            var2.a(var4, var3);
            return;
        }
        if (t.lIlIIIIllIlllIl(Vars.getBit((int)lIIIllIIIllII[41]), lIIIllIIIllII[7])) {
            var4 = new WorldPoint(lIIIllIIIllII[42], lIIIllIIIllII[43], lIIIllIIIllII[0]);
            var3 = lIIIllIIIllII[44];
            var2.a(var4, var3);
            return;
        }
        if (t.lIlIIIIllIlllIl(Vars.getBit((int)lIIIllIIIllII[45]), lIIIllIIIllII[7])) {
            var4 = new WorldPoint(lIIIllIIIllII[46], lIIIllIIIllII[47], lIIIllIIIllII[0]);
            var3 = lIIIllIIIllII[48];
            var2.a(var4, var3);
            return;
        }
        if (t.lIlIIIIllIlllIl(Vars.getBit((int)lIIIllIIIllII[49]), lIIIllIIIllII[7])) {
            var4 = new WorldPoint(lIIIllIIIllII[50], lIIIllIIIllII[36], lIIIllIIIllII[0]);
            var3 = lIIIllIIIllII[51];
            var2.a(var4, var3);
            return;
        }
        if (t.lIlIIIIllIlllIl(Vars.getBit((int)lIIIllIIIllII[52]), lIIIllIIIllII[7])) {
            var4 = new WorldPoint(lIIIllIIIllII[53], lIIIllIIIllII[36], lIIIllIIIllII[0]);
            var3 = lIIIllIIIllII[54];
            var2.a(var4, var3);
            return;
        }
        if (t.lIlIIIIllIlllIl(Vars.getBit((int)lIIIllIIIllII[55]), lIIIllIIIllII[7])) {
            var4 = new WorldPoint(lIIIllIIIllII[56], lIIIllIIIllII[29], lIIIllIIIllII[0]);
            var3 = lIIIllIIIllII[57];
            var2.a(var4, var3);
            return;
        }
        if (t.lIlIIIIllIlllIl(Vars.getBit((int)lIIIllIIIllII[58]), lIIIllIIIllII[7])) {
            var4 = new WorldPoint(lIIIllIIIllII[59], lIIIllIIIllII[29], lIIIllIIIllII[0]);
            var3 = lIIIllIIIllII[60];
            var2.a(var4, var3);
            return;
        }
        this.b(lIIIllIIIllII[1]);
    }

    private static void lIlIIIIllIlIlll() {
        lIIIllIIIlIll = new String[lIIIllIIIllII[13]];
        t.lIIIllIIIlIll[t.lIIIllIIIllII[0]] = "Turning in quest";
        t.lIIIllIIIlIll[t.lIIIllIIIllII[1]] = "Talk-to";
        t.lIIIllIIIlIll[t.lIIIllIIIllII[4]] = "Talking to orlando";
        t.lIIIllIIIlIll[t.lIIIllIIIllII[7]] = "Skipping dialogue";
        t.lIIIllIIIlIll[t.lIIIllIIIllII[9]] = "Studying";
        t.lIIIllIIIlIll[t.lIIIllIIIllII[10]] = "Study";
        t.lIIIllIIIlIll[t.lIIIllIIIllII[11]] = "Talk-to";
        t.lIIIllIIIlIll[t.lIIIllIIIllII[12]] = "Ok";
    }

    @Inject
    public CompletingNaturalHistoryQuizTask(Client client, SquireQuesterConfig squireQuesterConfig, SquireQuester squireQuester, TaskManager taskManager) {
        this.aG = client;
        this.aH = squireQuesterConfig;
        this.aI = squireQuester;
        this.aJ = taskManager;
    }

    private static boolean lIlIIIIllIlllll(int n2, int n3) {
        return n2 < n3;
    }

        return String.valueOf(var5);
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

                if (2 != 2) {
                    return;
                }
            } else {
                Walker.walkTo((WorldPoint)new WorldPoint(lIIIllIIIllII[5], lIIIllIIIllII[6], lIIIllIIIllII[0]));

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
        t var6;
        if (t.lIlIIIIllIllIIl(this.aH.quest().equals((Object)h.NATURAL_HISTORY_QUIZ) ? 1 : 0)) {
            return lIIIllIIIllII[0];
        }
        if (t.lIlIIIIllIllIIl(Movement.shouldWalk() ? 1 : 0)) {
            return lIIIllIIIllII[0];
        }
        if (t.lIlIIIIllIllIlI(var6.be(), lIIIllIIIllII[1])) {
            var6.aK -= lIIIllIIIllII[1];
            return lIIIllIIIllII[0];
        }
        if (t.lIlIIIIllIllIIl(Vars.getBit((int)lIIIllIIIllII[2]))) {
            var6.M();
            return lIIIllIIIllII[1];
        }
        if (t.lIlIIIIllIllIll(var6.aL ? 1 : 0)) {
            var6.Y();
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

                        if (((0x5E ^ 0x52 ^ (0x84 ^ 0x9F)) & (0x26 ^ 0x4B ^ (0xF8 ^ 0x82) ^ -1)) != 0) {
                            return ((1 ^ (2 ^ 0x21)) & (150 + 100 - 109 + 30 ^ 125 + 124 - 179 + 67 ^ -1)) != 0;
                        }
                    } else {
                        bl = lIIIllIIIllII[0];
                    }
                    return bl;
                });

                }
            } else {
                Walker.walkTo((WorldPoint)new WorldPoint(lIIIllIIIllII[5], lIIIllIIIllII[6], lIIIllIIIllII[0]));

            }

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

    private static boolean lIlIIIIllIlllII(Object object) {
        return object != null;
    }

    @Subscribe
    public void a(WidgetLoaded widgetLoaded) {
        t var7;
        if (t.lIlIIIIllIlllIl(widgetLoaded.getGroupId(), lIIIllIIIllII[64])) {
            return;
        }
        Widget var8 = var7.aG.getWidget(WidgetInfo.VARROCK_MUSEUM_QUESTION);
        if (t.lIlIIIIllIllllI(var8)) {
            return;
        }
        int[] nArray = new int[lIIIllIIIllII[7]];
        nArray[t.lIIIllIIIllII[0]] = WidgetInfo.VARROCK_MUSEUM_FIRST_ANSWER.getId();
        nArray[t.lIIIllIIIllII[1]] = WidgetInfo.VARROCK_MUSEUM_SECOND_ANSWER.getId();
        nArray[t.lIIIllIIIllII[4]] = WidgetInfo.VARROCK_MUSEUM_THIRD_ANSWER.getId();
        Widget var9 = u.a(var7.aG, var8.getText(), nArray);
        if (t.lIlIIIIllIllllI(var9)) {
            return;
        }
        String var10 = var9.getText();
        if (t.lIlIIIIllIllIll(var10.equals(Text.removeTags((String)var10)) ? 1 : 0)) {
            WidgetPackets.widgetAction((Widget)var9, (String)lIIIllIIIlIll[lIIIllIIIllII[12]]);
        }
    }

    private static boolean lIlIIIIllIllllI(Object object) {
        return object == null;
    }

    public int be() {
        return this.aK;
    }

    private static boolean lIlIIIIllIllIll(int n2) {
        return n2 != 0;
    }
}

