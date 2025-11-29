/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Actor
 *  net.runelite.api.Client
 *  net.runelite.api.DialogOption
 *  net.runelite.api.GameState
 *  net.runelite.api.Item
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Game
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 *  net.unethicalite.api.widgets.Dialog
 */
package gg.squire.construction.tasks;

import com.google.inject.Inject;
import gg.squire.basics.wilderness.altar.ChaosAltar;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import net.runelite.api.Actor;
import net.runelite.api.Client;
import net.runelite.api.DialogOption;
import net.runelite.api.GameState;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Game;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.widgets.Dialog;

@TaskDesc(name="Altaring")
public class AltaringTask
extends Task {
    private final  Client hg;
    private static  int[] lIIlIIlll;
    private static  String[] lIIlIIllI;
    private final  ChaosAltar hf;

    private boolean cX() {
        String[] stringArray = new String[1];
        stringArray[0] = lIIlIIllI[1];
        TileObject tileObject = TileObjects.getNearest((String[])stringArray);
        if (bX.var1(tileObject)) {
            return 0;
        }
        tileObject.interact(lIIlIIllI[3]);
        this.sleep(5);
        return 1;
    }

    private static boolean var2(int n2, int n3) {
        return n2 < n3;
    }

    private static String var3(String var4, String var5) {
        var4 = new String(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var6 = new StringBuilder();
        char[] var7 = var5.toCharArray();
        int var8 = 0;
        char[] var9 = var4.toCharArray();
        int var10 = var9.length;
        int var11 = 0;
        while (bX.var2(var11, var10)) {
            char var12 = var9[var11];
            var6.append((char)(var12 ^ var7[var8 % var7.length]));
            0;
            ++var8;
            ++var11;
            0;
            if (((0x29 ^ 0x6E) & ~(0xF8 ^ 0xBF)) == 0) continue;
            return null;
        }
        return String.valueOf(var6);
    }

    public boolean run() {
        bX var13;
        if ((this.hg.getGameState() != this.hg.getGameState()2)) {
            return 0;
        }
        if ((var13.hf.cY( != 0) ? 1 : 0)) {
            Game.logout();
            return 1;
        }
        if ((Movement.isRunEnabled( == 0) ? 1 : 0) && (Movement.getRunEnergy() > 2)) {
            Movement.toggleRun();
        }
        if ((Movement.shouldWalk( == 0) ? 1 : 0)) {
            return 0;
        }
        if ((Dialog.isOpen( != 0) ? 1 : 0)) {
            DialogOption[] dialogOptionArray = new DialogOption[3];
            dialogOptionArray[0] = DialogOption.CHAT_OPTION_THREE;
            dialogOptionArray[1] = DialogOption.PLAIN_CONTINUE;
            Dialog.invokeDialog((DialogOption[])dialogOptionArray);
        }
        String[] stringArray = new String[1];
        stringArray[0] = lIIlIIllI[0];
        TileObject var14 = TileObjects.getNearest((String[])stringArray);
        Item var15 = Inventory.getFirst(item -> {
            int n2;
            if ((item.getName( != 0).contains(lIIlIIllI[6]) ? 1 : 0) && (item.isNoted( == 0) ? 1 : 0)) {
                n2 = 1;
                0;
                if ((0xB3 ^ 0xB7) == 0) {
                    return ((0x6E ^ 0x59) & ~(0x77 ^ 0x40)) != 0;
                }
            } else {
                n2 = 0;
            }
            return n2 != 0;
        });
        if (var14 != null && var15 != null) {
            if ((Reachable.isInteractable((Locatable == 0)var14) ? 1 : 0)) {
                return var13.cX();
            }
            var15.useOn(var14);
            return 1;
        }
        if (bX.var1(var15)) {
            int[] nArray = new int[1];
            nArray[0] = 4;
            NPC var16 = NPCs.getNearest((int[])nArray);
            Item var17 = Inventory.getFirst(item -> {
                int n2;
                if ((item.getName( != 0).contains(lIIlIIllI[5]) ? 1 : 0) && (item.isNoted( != 0) ? 1 : 0)) {
                    n2 = 1;
                    0;
                    if (2 != 2) {
                        return ((0xEF ^ 0xAE) & ~(0x1C ^ 0x5D)) != 0;
                    }
                } else {
                    n2 = 0;
                }
                return n2 != 0;
            });
            if (!var16 != null || bX.var1(var17)) {
                return 0;
            }
            if ((Reachable.isInteractable((Locatable == 0)var16) ? 1 : 0)) {
                return var13.cX();
            }
            var17.useOn((Actor)var16);
        }
        return 0;
    }

    @Inject
    public AltaringTask(ChaosAltar chaosAltar, Client client) {
        this.hf = chaosAltar;
        this.hg = client;
    }

    private static boolean var1(Object object) {
        return object == null;
    }

}

