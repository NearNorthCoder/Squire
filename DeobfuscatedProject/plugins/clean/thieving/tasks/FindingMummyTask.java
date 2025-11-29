/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.NPC
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.events.ChatMessage
 *  net.runelite.client.eventbus.Subscribe
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.thieving.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.thieving.SquirePlunderConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.ChatMessage;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import gg.squire.thieving.tasks.ThievingManager;

@TaskDesc(name="Finding Mummy", priority=15, register=true)
public class FindingMummyTask
extends Task {
    
    private final  Client H;
    
    private final  a F;
    private final  SquirePlunderConfig G;

    private static void lIIlIlIIIlllIII() {
        llllllIlIllI = new String[llllllIlIlll[15]];
        m.llllllIlIllI[m.llllllIlIlll[1]] = "Tomb Door";
        m.llllllIlIllI[m.llllllIlIlll[2]] = "Quick-leave";
        m.llllllIlIllI[m.llllllIlIlll[4]] = "Tomb Door";
        m.llllllIlIllI[m.llllllIlIlll[5]] = "Leave Tomb";
        m.llllllIlIllI[m.llllllIlIlll[6]] = "An anonymous looking door";
        m.llllllIlIllI[m.llllllIlIlll[13]] = "You find a door! You open it.";
        m.llllllIlIllI[m.llllllIlIlll[14]] = "Search";
    }

    private static boolean lIIlIlIIIllllll(Object object) {
        return object == null;
    }

    private static boolean lIIlIlIIIlllIll(int n2, int n3) {
        return n2 >= n3;
    }

        return String.valueOf(var1);
    }

    private void c(int n2) {
        int[] nArray = new int[llllllIlIlll[2]];
        nArray[m.llllllIlIlll[1]] = n2;
        if (m.lIIlIlIIIllllll(TileObjects.getNearest((int[])nArray))) {
            return;
        }
        int[] nArray2 = new int[llllllIlIlll[2]];
        nArray2[m.llllllIlIlll[1]] = n2;
        TileObjects.getNearest((int[])nArray2).interact(llllllIlIllI[llllllIlIlll[14]]);
    }

    private static boolean lIIlIlIIIllllII(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIIlIlIIIlllllI(int n2) {
        return n2 == 0;
    }

    @Subscribe
    public void a(ChatMessage chatMessage) {
        if (m.lIIlIlIIIlllIlI(chatMessage.getMessage().equals(llllllIlIllI[llllllIlIlll[13]]) ? 1 : 0)) {
            this.F.a(this.F.d() + llllllIlIlll[2]);
        }
    }

    static {
        m.lIIlIlIIIlllIIl();
        m.lIIlIlIIIlllIII();
    }

    private static boolean lIIlIlIIIllllIl(Object object) {
        return object != null;
    }

    public boolean run() {
        m var2;
        if (m.lIIlIlIIIlllIlI(this.H.getVarbitValue(llllllIlIlll[0]))) {
            return llllllIlIlll[1];
        }
        int[] nArray = new int[llllllIlIlll[2]];
        nArray[m.llllllIlIlll[1]] = var2.G.foodID();
        if (!m.lIIlIlIIIlllIll(Inventory.getCount((int[])nArray), var2.G.minFoodAmount()) || m.lIIlIlIIIllllII(Inventory.getCount(item -> item.getName().startsWith(this.G.antiPoison())), var2.G.minAntiAmount())) {
            return llllllIlIlll[1];
        }
        int[] nArray2 = new int[llllllIlIlll[2]];
        nArray2[m.llllllIlIlll[1]] = llllllIlIlll[3];
        NPC var3 = NPCs.getNearest((int[])nArray2);
        if (m.lIIlIlIIIllllIl(var3)) {
            return llllllIlIlll[1];
        }
        if (m.lIIlIlIIIlllllI(Movement.shouldWalk() ? 1 : 0)) {
            return llllllIlIlll[1];
        }
        String[] stringArray = new String[llllllIlIlll[2]];
        stringArray[m.llllllIlIlll[1]] = llllllIlIllI[llllllIlIlll[1]];
        TileObject var4 = TileObjects.getNearest((String[])stringArray);
        if (m.lIIlIlIIIllllIl(var4)) {
            String[] stringArray2 = new String[llllllIlIlll[2]];
            stringArray2[m.llllllIlIlll[1]] = llllllIlIllI[llllllIlIlll[2]];
            if (m.lIIlIlIIIlllIlI(var4.hasAction(stringArray2) ? 1 : 0)) {
                return llllllIlIlll[1];
            }
            String[] stringArray3 = new String[llllllIlIlll[2]];
            stringArray3[m.llllllIlIlll[1]] = llllllIlIllI[llllllIlIlll[4]];
            TileObjects.getNearest((String[])stringArray3).interact(llllllIlIllI[llllllIlIlll[5]]);
            return llllllIlIlll[2];
        }
        if (m.lIIlIlIIIlllIlI(Movement.isRunEnabled() ? 1 : 0)) {
            Movement.toggleRun();
        }
        String[] stringArray4 = new String[llllllIlIlll[2]];
        stringArray4[m.llllllIlIlll[1]] = llllllIlIllI[llllllIlIlll[6]];
        TileObject var5 = TileObjects.getNearest((String[])stringArray4);
        if (m.lIIlIlIIIllllll(var5)) {
            Movement.walkTo((WorldPoint)new WorldPoint(llllllIlIlll[7], llllllIlIlll[8], llllllIlIlll[1]), (boolean)llllllIlIlll[1]);

            return llllllIlIlll[2];
        }
        int[] nArray3 = new int[llllllIlIlll[6]];
        nArray3[m.llllllIlIlll[1]] = llllllIlIlll[9];
        nArray3[m.llllllIlIlll[2]] = llllllIlIlll[10];
        nArray3[m.llllllIlIlll[4]] = llllllIlIlll[11];
        nArray3[m.llllllIlIlll[5]] = llllllIlIlll[12];
        int[] nArray4 = nArray3;
        this.c(nArray4[this.F.d()]);
        return llllllIlIlll[2];
    }

    @Inject
    public FindingMummyTask(a a2, SquirePlunderConfig squirePlunderConfig, Client client) {
        this.F = a2;
        this.G = squirePlunderConfig;
        this.H = client;
    }

    private static boolean lIIlIlIIIlllIlI(int n2) {
        return n2 != 0;
    }
}

