/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  javax.inject.Inject
 *  net.runelite.api.ChatMessageType
 *  net.runelite.api.Item
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.TileObject
 *  net.runelite.api.events.ChatMessage
 *  net.runelite.client.eventbus.Subscribe
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Reachable
 */
package gg.squire.barrows.tasks;

import gg.squire.barrows.SquireBarrows;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.ChatMessageType;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.TileObject;
import net.runelite.api.events.ChatMessage;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Reachable;

@TaskDesc(name="Claiming chest", priority=150, blocking=true, register=true)
public class ClaimingChestTask
extends Task {
    private final  SquireBarrows ak;

    private static boolean lIllIIlllIlIll(Object object) {
        return object == null;
    }

    private static boolean lIllIIlllIlIlI(int n2) {
        return n2 == 0;
    }

    @Inject
    public ClaimingChestTask(SquireBarrows squireBarrows) {
        this.ak = squireBarrows;
    }

    private static boolean lIllIIlllIllII(int n2, int n3) {
        return n2 < n3;
    }

    static {
        w.lIllIIlllIlIII();
        w.lIllIIlllIIlll();
    }

    private static boolean lIllIIlllIllll(Object object, Object object2) {
        return object != object2;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(ChatMessage chatMessage) {
        void var1;
        if (w.lIllIIlllIllll(chatMessage.getType(), ChatMessageType.GAMEMESSAGE)) {
            return;
        }
        if (!w.lIllIIlllIlIlI(var1.getMessage().contains(llllIIIlIlI[llllIIIlIll[6]]) ? 1 : 0) || w.lIllIIlllIlIIl(var1.getMessage().contains(llllIIIlIlI[llllIIIlIll[7]]) ? 1 : 0)) {
            w var2;
            Log.info((String)llllIIIlIlI[llllIIIlIll[5]]);
            var2.ak.b(llllIIIlIll[1]);
        }
    }

    private static boolean lIllIIlllIllIl(Object object) {
        return object != null;
    }

    private static void lIllIIlllIIlll() {
        llllIIIlIlI = new String[llllIIIlIll[4]];
        w.llllIIIlIlI[w.llllIIIlIll[0]] = "Chest";
        w.llllIIIlIlI[w.llllIIIlIll[1]] = "Eat";
        w.llllIIIlIlI[w.llllIIIlIll[3]] = "Open";
        w.llllIIIlIlI[w.llllIIIlIll[2]] = "Search";
        w.llllIIIlIlI[w.llllIIIlIll[6]] = "Barrows chest count";
        w.llllIIIlIlI[w.llllIIIlIll[7]] = "The chest is empty";
        w.llllIIIlIlI[w.llllIIIlIll[5]] = "Looted the chest, resetting";
        w.llllIIIlIlI[w.llllIIIlIll[8]] = "Eat";
    }

    private static boolean lIllIIlllIlIIl(int n2) {
        return n2 != 0;
    }

        return String.valueOf(var3);
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        w var4;
        if (!w.lIllIIlllIlIIl(this.ak.h() ? 1 : 0) || w.lIllIIlllIlIIl(this.ak.v() ? 1 : 0)) {
            return llllIIIlIll[0];
        }
        if (w.lIllIIlllIlIlI(var4.ak.g() ? 1 : 0)) {
            return llllIIIlIll[0];
        }
        String[] stringArray = new String[llllIIIlIll[1]];
        stringArray[w.llllIIIlIll[0]] = llllIIIlIlI[llllIIIlIll[0]];
        TileObject var5 = TileObjects.getNearest((String[])stringArray);
        if (w.lIllIIlllIlIll(var5)) {
            return llllIIIlIll[0];
        }
        Item var6 = Inventory.getFirst(item -> {
            String[] stringArray = new String[llllIIIlIll[1]];
            stringArray[w.llllIIIlIll[0]] = llllIIIlIlI[llllIIIlIll[8]];
            return item.hasAction(stringArray);
        });
        if (w.lIllIIlllIllII(Inventory.getFreeSlots(), llllIIIlIll[2]) && w.lIllIIlllIllIl(var6)) {
            var6.interact(llllIIIlIlI[llllIIIlIll[1]]);
            var4.sleep(llllIIIlIll[2]);
            return llllIIIlIll[1];
        }
        String[] stringArray2 = new String[llllIIIlIll[1]];
        stringArray2[w.llllIIIlIll[0]] = llllIIIlIlI[llllIIIlIll[3]];
        if (!w.lIllIIlllIlIlI(var5.hasAction(stringArray2) ? 1 : 0) || !w.lIllIIlllIlIIl(Reachable.isInteractable((Locatable)var5) ? 1 : 0) || w.lIllIIlllIlllI(var5.distanceTo(Players.getLocal().getWorldLocation()), llllIIIlIll[4])) {
            return llllIIIlIll[0];
        }
        if (w.lIllIIlllIllII(var4.ak.e(), llllIIIlIll[5])) {
            return llllIIIlIll[0];
        }
        NPC var7 = var4.ak.y();
        if (w.lIllIIlllIllIl(var7) && w.lIllIIlllIlIlI(var7.isDead() ? 1 : 0)) {
            return llllIIIlIll[0];
        }
        var1_1.interact(llllIIIlIlI[llllIIIlIll[2]]);
        return llllIIIlIll[1];
    }

    private static boolean lIllIIlllIlllI(int n2, int n3) {
        return n2 > n3;
    }
}

