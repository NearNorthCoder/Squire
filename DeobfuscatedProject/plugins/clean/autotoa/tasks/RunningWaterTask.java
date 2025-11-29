/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  javax.inject.Inject
 *  net.runelite.api.Actor
 *  net.runelite.api.ChatMessageType
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.runelite.api.NPC
 *  net.runelite.api.Point
 *  net.runelite.api.TileItem
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.events.ChatMessage
 *  net.runelite.client.eventbus.Subscribe
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.autotoa.tasks;

import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Actor;
import net.runelite.api.ChatMessageType;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.runelite.api.Point;
import net.runelite.api.TileItem;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.ChatMessage;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import gg.squire.autotoa.tasks.AutotoaTaskBase;
import gg.squire.autotoa.tasks.AutotoaManager;

@TaskDesc(name="Running water", priority=50, register=true)
public class RunningWaterTask
extends AutotoaTaskBase {
    
    private  boolean hz;
    private  Point hx;
    private  int hy;
    private static final  int hv;
    private static final  int hu;
    
    private static final  int hw;

    static {
        bZ.lIIlIllIIlIlIl();
        bZ.lIIlIllIIlIlII();
        hw = lIllIIlllII[9];
        hu = lIllIIlllII[10];
        hv = lIllIIlllII[11];
    }

        return String.valueOf(var1);
    }

    @Override
    public boolean bl() {
        bZ var2;
        int[] nArray = new int[lIllIIlllII[3]];
        nArray[bZ.lIllIIlllII[2]] = lIllIIlllII[4];
        if (bZ.lIIlIllIIlIllI(Inventory.contains((int[])nArray) ? 1 : 0)) {
            this.hy = lIllIIlllII[2];
            return this.cJ();
        }
        WorldPoint var3 = var2.a(var2.hx);
        if (bZ.lIIlIllIIlIllI(var3.equals((Object)Players.getLocal().getWorldLocation()) ? 1 : 0) && bZ.lIIlIllIIlIllI(var2.hy)) {
            Log.info((String)lIllIIllIll[lIllIIlllII[2]]);
            Movement.setDestination((WorldPoint)var3);
            return lIllIIlllII[3];
        }
        if (bZ.lIIlIllIIlIlll(var3.equals((Object)Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            var2.hy = lIllIIlllII[3];
        }
        if (bZ.lIIlIllIIlIllI(var2.hz ? 1 : 0)) {
            return var2.cI();
        }
        return this.cH();
    }

    /*
     * WARNING - void declaration
     */
    private boolean cH() {
        void var2_2;
        int[] nArray = new int[lIllIIlllII[3]];
        nArray[bZ.lIllIIlllII[2]] = this.aX();
        NPC nPC = NPCs.getNearest((int[])nArray);
        if (bZ.lIIlIllIIllIIl(nPC)) {
            return lIllIIlllII[2];
        }
        int[] nArray2 = new int[lIllIIlllII[3]];
        nArray2[bZ.lIllIIlllII[2]] = lIllIIlllII[4];
        Item var4 = Inventory.getFirst((int[])nArray2);
        if (bZ.lIIlIllIIllIIl(var4)) {
            return lIllIIlllII[2];
        }
        var2_2.useOn((Actor)nPC);
        return lIllIIlllII[3];
    }

    private boolean cJ() {
        TileObject tileObject = this.cK();
        if (bZ.lIIlIllIIllIIl(tileObject)) {
            return lIllIIlllII[2];
        }
        if (bZ.lIIlIllIIlIlll(Inventory.isFull() ? 1 : 0)) {
            bZ var5;
            var5.bh();
            return lIllIIlllII[3];
        }
        int[] nArray = new int[lIllIIlllII[3]];
        nArray[bZ.lIllIIlllII[2]] = lIllIIlllII[4];
        TileItem var6 = TileItems.getNearest((int[])nArray);
        if (bZ.lIIlIllIIllIlI(var6)) {
            var6.interact(lIllIIllIll[lIllIIlllII[6]]);
            return lIllIIlllII[3];
        }
        return lIllIIlllII[2];
    }

    private static boolean lIIlIllIIllIII(Object object, Object object2) {
        return object != object2;
    }

    private TileObject cK() {
        return TileObjects.getNearest(tileObject -> {
            int n2;
            if (bZ.lIIlIllIIlIlll(tileObject.getName().equals(lIllIIllIll[lIllIIlllII[7]]) ? 1 : 0)) {
                String[] stringArray = new String[lIllIIlllII[3]];
                stringArray[bZ.lIllIIlllII[2]] = lIllIIllIll[lIllIIlllII[8]];
                if (bZ.lIIlIllIIlIlll(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lIllIIlllII[3];

                    if (1 >= -1) return n2 != 0;
                    return false;
                }
            }
            n2 = lIllIIlllII[2];
            return n2 != 0;
        });
    }

    private static boolean lIIlIllIIllIll(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIIlIllIIlIllI(int n2) {
        return n2 == 0;
    }

    private static void lIIlIllIIlIlII() {
        lIllIIllIll = new String[lIllIIlllII[12]];
        bZ.lIllIIllIll[bZ.lIllIIlllII[2]] = "Walking to start";
        bZ.lIllIIllIll[bZ.lIllIIlllII[3]] = "You fill your container.";
        bZ.lIllIIllIll[bZ.lIllIIlllII[5]] = "You empty a";
        bZ.lIllIIllIll[bZ.lIllIIlllII[6]] = "Take";
        bZ.lIllIIllIll[bZ.lIllIIlllII[7]] = "Waterfall";
        bZ.lIllIIllIll[bZ.lIllIIlllII[8]] = "Fill";
    }

    /*
     * WARNING - void declaration
     */
    @Override
    @Subscribe
    public void a(ChatMessage chatMessage) {
        void var7;
        if (bZ.lIIlIllIIllIII(chatMessage.getType(), ChatMessageType.GAMEMESSAGE)) {
            return;
        }
        String var8 = var7.getMessage();
        if (bZ.lIIlIllIIlIlll(var8.contains(lIllIIllIll[lIllIIlllII[3]]) ? 1 : 0)) {
            var9.hz = lIllIIlllII[3];

            if (3 <= ((0xB6 ^ 0x81) & ~(0x3D ^ 0xA))) {
                return;
            }
        } else if (bZ.lIIlIllIIlIlll(var8.contains(lIllIIllIll[lIllIIlllII[5]]) ? 1 : 0)) {
            var9.hz = lIllIIlllII[2];
        }
    }

    @Inject
    protected RunningWaterTask(Client client, z z2, TOAConfig tOAConfig) {
        super(client, z2, tOAConfig);
        this.hx = new Point(lIllIIlllII[0], lIllIIlllII[1]);
        this.hy = lIllIIlllII[2];
    }

    private static boolean lIIlIllIIllIlI(Object object) {
        return object != null;
    }

    /*
     * WARNING - void declaration
     */
    private boolean cI() {
        void var2_2;
        TileObject tileObject = this.cK();
        if (bZ.lIIlIllIIllIIl(tileObject)) {
            return lIllIIlllII[2];
        }
        int[] nArray = new int[lIllIIlllII[3]];
        nArray[bZ.lIllIIlllII[2]] = lIllIIlllII[4];
        Item var10 = Inventory.getFirst((int[])nArray);
        if (bZ.lIIlIllIIllIIl(var10)) {
            return lIllIIlllII[2];
        }
        var2_2.useOn(tileObject);
        return lIllIIlllII[3];
    }

    private static boolean lIIlIllIIllIIl(Object object) {
        return object == null;
    }

    private static boolean lIIlIllIIlIlll(int n2) {
        return n2 != 0;
    }

}

