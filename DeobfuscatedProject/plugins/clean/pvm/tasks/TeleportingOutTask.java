/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  javax.inject.Inject
 *  net.runelite.api.ChatMessageType
 *  net.runelite.api.GameState
 *  net.runelite.api.Item
 *  net.runelite.api.NPC
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.events.ChatMessage
 *  net.runelite.api.events.GameStateChanged
 *  net.runelite.client.eventbus.Subscribe
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.widgets.Prayers
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package gg.squire.pvm.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.pvm.SquireShamanConfig;
import gg.squire.pvm.SquireShamansPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.ChatMessageType;
import net.runelite.api.GameState;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.ChatMessage;
import net.runelite.api.events.GameStateChanged;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.widgets.Prayers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import gg.squire.pvm.tasks.CHelper;

@TaskDesc(name="Teleporting out", priority=8, register=true)
public class TeleportingOutTask
extends Task {
    private final  SquireShamansPlugin aH;
    private final  SquireShamanConfig aI;
    private static final  Logger aF;
    private static final  WorldPoint aG;
    
    private final  c aJ;

    private static boolean lIlIllIllllIlIl(Object object, Object object2) {
        return object == object2;
    }

    private static void lIlIllIlllIIlll() {
        lIIlIlllIlIll = new String[lIIlIlllIllII[9]];
        z.lIIlIlllIlIll[z.lIIlIlllIllII[1]] = "Lizardman shaman";
        z.lIIlIlllIlIll[z.lIIlIlllIllII[0]] = "blowpipe needs to be charged";
        z.lIIlIlllIlIll[z.lIIlIlllIllII[2]] = "Oh dear, you are dead!";
        z.lIIlIlllIlIll[z.lIIlIlllIllII[3]] = "You died, stopping plugin";
        z.lIIlIlllIlIll[z.lIIlIlllIllII[4]] = "Eat";
        z.lIIlIlllIlIll[z.lIIlIlllIllII[5]] = "anti";
        z.lIIlIlllIlIll[z.lIIlIlllIllII[6]] = "Drink";
    }

    static {
        z.lIlIllIlllIlllI();
        z.lIlIllIlllIIlll();
        aF = LoggerFactory.getLogger(TeleportingOutTask.class);
        aG = new WorldPoint(lIIlIlllIllII[7], lIIlIlllIllII[8], lIIlIlllIllII[1]);
    }

        return String.valueOf(var1);
    }

    @Inject
    public TeleportingOutTask(SquireShamansPlugin squireShamansPlugin, SquireShamanConfig squireShamanConfig, c c2) {
        this.aH = squireShamansPlugin;
        this.aI = squireShamanConfig;
        this.aJ = c2;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var4_4;
        z var2;
        String[] stringArray = new String[lIIlIlllIllII[0]];
        stringArray[z.lIIlIlllIllII[1]] = lIIlIlllIlIll[lIIlIlllIllII[1]];
        NPC nPC = NPCs.getNearest((String[])stringArray);
        if (z.lIlIllIlllIllll(nPC)) {
            this.aH.f(lIIlIlllIllII[1]);
            return lIIlIlllIllII[1];
        }
        Item var3 = Inventory.getFirst(item -> {
            int n2;
            if (z.lIlIllIllllIIll(item.getName().toLowerCase().contains(lIIlIlllIlIll[lIIlIlllIllII[5]]) ? 1 : 0)) {
                String[] stringArray = new String[lIIlIlllIllII[0]];
                stringArray[z.lIIlIlllIllII[1]] = lIIlIlllIlIll[lIIlIlllIllII[6]];
                if (z.lIlIllIllllIIll(item.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lIIlIlllIllII[0];

                    if ((0xA6 ^ 0xA2) > 0) return n2 != 0;
                    return false;
                }
            }
            n2 = lIIlIlllIllII[1];
            return n2 != 0;
        });
        Item var4 = Inventory.getFirst(item -> item.hasAction(lIIlIlllIlIll[lIIlIlllIllII[4]]::equals));
        if (z.lIlIllIllllIIII(var4) && z.lIlIllIllllIIII(var3) && z.lIlIllIllllIIIl(var2.aH.i() ? 1 : 0) && z.lIlIllIllllIIlI(Prayers.getPoints())) {
            return lIIlIlllIllII[1];
        }
        Item var5 = Inventory.getFirst(var2.aI.teleportItem().u());
        if (z.lIlIllIlllIllll(var5)) {
            return lIIlIlllIllII[1];
        }
        var2.aH.f(lIIlIlllIllII[0]);
        if (z.lIlIllIllllIIll(var2.aJ.s() ? 1 : 0) && z.lIlIllIllllIIll(var2.aI.teleportItem().E() ? 1 : 0)) {
            Movement.walkTo((WorldPoint)aG);

            return lIIlIlllIllII[0];
        }
        this.aI.teleportItem().B().accept((Item)var4_4);
        return lIIlIlllIllII[0];
    }

    private static boolean lIlIllIllllIIlI(int n2) {
        return n2 > 0;
    }

    private static boolean lIlIllIllllIlII(Object object, Object object2) {
        return object != object2;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(ChatMessage chatMessage) {
        z var6;
        void var7;
        if (z.lIlIllIllllIlII(chatMessage.getType(), ChatMessageType.GAMEMESSAGE)) {
            return;
        }
        if (z.lIlIllIllllIIll(var7.getMessage().contains(lIIlIlllIlIll[lIIlIlllIllII[0]]) ? 1 : 0)) {
            var6.aH.e(lIIlIlllIllII[0]);
        }
        if (z.lIlIllIllllIIll(var7.getMessage().contains(lIIlIlllIlIll[lIIlIlllIllII[2]]) ? 1 : 0)) {
            Log.info((String)lIIlIlllIlIll[lIIlIlllIllII[3]]);
            var6.aH.forceStop();
        }
    }

    @Subscribe
    public void a(GameStateChanged gameStateChanged) {
        if (z.lIlIllIllllIlIl(gameStateChanged.getGameState(), GameState.LOADING)) {
            this.aH.f(lIIlIlllIllII[1]);
        }
    }

    private static boolean lIlIllIllllIIIl(int n2) {
        return n2 == 0;
    }

    private static boolean lIlIllIlllIllll(Object object) {
        return object == null;
    }

    private static boolean lIlIllIllllIIII(Object object) {
        return object != null;
    }

    private static boolean lIlIllIllllIIll(int n2) {
        return n2 != 0;
    }

    private static boolean lIlIllIllllIllI(int n2, int n3) {
        return n2 < n3;
    }
}

