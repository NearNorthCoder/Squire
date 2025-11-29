/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.LocalPoint
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.events.ChatMessage
 *  net.runelite.api.events.GraphicsObjectCreated
 *  net.runelite.client.config.ConfigStorageBox
 *  net.runelite.client.eventbus.Subscribe
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.autotoa.tasks;

import com.google.inject.Inject;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.TileObject;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.ChatMessage;
import net.runelite.api.events.GraphicsObjectCreated;
import net.runelite.client.config.ConfigStorageBox;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import gg.squire.autotoa.tasks.AutotoaTaskBase;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aV;
import gg.squire.autotoa.tasks.GameEnum78;
import gg.squire.autotoa.tasks.AutotoaManager;

@TaskDesc(name="Doing task", priority=50, blocking=true, register=true)
public class DoingTask
extends AutotoaTaskBase {
    private  aW eu;
    
    private static final  int et;
    private static final  int er;
    private static final  int es;

    @Override
    public ConfigStorageBox<EquipmentSetup> br() {
        return this.cW.meleeGearAkkha();
    }

    private static boolean lIIllIllIlllll(int n2, int n3) {
        return n2 == n3;
    }

    @Inject
    protected DoingTask(Client client, z z2, TOAConfig tOAConfig) {
        super(client, z2, tOAConfig);
    }

    private static boolean lIIllIllIllllI(int n2, int n3) {
        return n2 > n3;
    }

    /*
     * WARNING - void declaration
     */
    private void bJ() {
        void var1;
        int[] nArray = new int[lIlllllIllI[1]];
        nArray[aU.lIlllllIllI[0]] = lIlllllIllI[3];
        TileObject tileObject = TileObjects.getNearest((int[])nArray);
        if (aU.lIIllIllIlllIl(tileObject)) {
            return;
        }
        WorldPoint var2 = Players.getLocal().getWorldLocation();
        if (aU.lIIllIllIllllI(var1.distanceTo(var2), lIlllllIllI[4])) {
            aU var3;
            Movement.setDestination((WorldPoint)var3.c(var2, var1.getWorldLocation()));
            return;
        }
        tileObject.interact(lIlllllIlII[lIlllllIllI[4]]);
    }

    private static boolean lIIllIlllIIIII(int n2, int n3) {
        return n2 < n3;
    }

    @Override
    @Subscribe
    public void a(ChatMessage chatMessage) {
        String string = chatMessage.getMessage();
        if (!aU.lIIllIllIllIll(string.contains(lIlllllIlII[lIlllllIllI[0]]) ? 1 : 0) || !aU.lIIllIllIllIll(string.contains(lIlllllIlII[lIlllllIllI[1]]) ? 1 : 0) || aU.lIIllIllIlllII(string.contains(lIlllllIlII[lIlllllIllI[2]]) ? 1 : 0)) {
            var4.eu = null;
        }
    }

    private static boolean lIIllIllIlllIl(Object object) {
        return object == null;
    }

    @Subscribe
    public void c(GraphicsObjectCreated graphicsObjectCreated) {
        if (aU.lIIllIllIlllll(graphicsObjectCreated.getGraphicsObject().getId(), lIlllllIllI[8])) {
            LocalPoint localPoint = graphicsObjectCreated.getGraphicsObject().getLocation();
            WorldPoint worldPoint = WorldPoint.fromLocal((Client)this.cu, (LocalPoint)localPoint);
            int[] nArray = new int[lIlllllIllI[1]];
            nArray[aU.lIlllllIllI[0]] = lIlllllIllI[3];
            TileObject tileObject = TileObjects.getNearest((WorldPoint)worldPoint, (int[])nArray);
            int[] nArray2 = new int[lIlllllIllI[1]];
            nArray2[aU.lIlllllIllI[0]] = lIlllllIllI[5];
            TileObject tileObject2 = TileObjects.getNearest((WorldPoint)worldPoint, (int[])nArray2);
            if (aU.lIIllIlllIIIII(tileObject.distanceTo(worldPoint), tileObject2.distanceTo(worldPoint))) {
                this.eu = aW.PILLARS;

                if (((0x57 ^ 0x34) & ~(0xCD ^ 0xAE)) >= (0x78 ^ 0x7C)) {
                    return;
                }
            } else {
                var5.eu = aW.VENTS;
            }
        }
    }

    @Override
    public boolean bC() {
        aU var6;
        if (aU.lIIllIllIlllIl((Object)this.eu)) {
            return lIlllllIllI[0];
        }
        switch (aV.ev[var6.eu.ordinal()]) {
            case 1: {
                var6.bJ();

                if (((0xFF ^ 0xC7 ^ (0xE3 ^ 0x88)) & (27 + 49 - -18 + 141 ^ 27 + 140 - 30 + 47 ^ -1)) == 0) break;
                return false;
            }
            case 2: {
                var6.bK();
            }
        }
        return lIlllllIllI[1];
    }

    /*
     * WARNING - void declaration
     */
    private void bK() {
        void var2_3;
        void var7;
        int[] nArray = new int[lIlllllIllI[1]];
        nArray[aU.lIlllllIllI[0]] = lIlllllIllI[5];
        TileObject tileObject = TileObjects.getNearest((int[])nArray);
        if (aU.lIIllIllIlllIl(tileObject)) {
            return;
        }
        if (aU.lIIllIllIllIll(Players.getLocal().getWorldLocation().equals((Object)var7.getWorldLocation()) ? 1 : 0)) {
            aU var8;
            WorldPoint var9 = Players.getLocal().getWorldLocation();
            Movement.setDestination((WorldPoint)var8.c(var9, var7.getWorldLocation()));
            return;
        }
        int[] nArray2 = new int[lIlllllIllI[1]];
        nArray2[aU.lIlllllIllI[0]] = lIlllllIllI[6];
        Item var9 = Inventory.getFirst((int[])nArray2);
        if (aU.lIIllIllIlllIl(var9)) {
            return;
        }
        var2_3.interact(lIlllllIlII[lIlllllIllI[7]]);
    }

    static {
        aU.lIIllIllIllIlI();
        aU.lIIllIllIlIIIl();
        et = lIlllllIllI[5];
        es = lIlllllIllI[3];
        er = lIlllllIllI[8];
    }

    private static boolean lIIllIllIlllII(int n2) {
        return n2 != 0;
    }

        return String.valueOf(var10);
    }

    private static void lIIllIllIlIIIl() {
        lIlllllIlII = new String[lIlllllIllI[9]];
        aU.lIlllllIlII[aU.lIlllllIllI[0]] = "repair the damaged";
        aU.lIlllllIlII[aU.lIlllllIllI[1]] = "neutralise the fumes";
        aU.lIlllllIlII[aU.lIlllllIllI[2]] = "You have died";
        aU.lIlllllIlII[aU.lIlllllIllI[4]] = "Repair";
        aU.lIlllllIlII[aU.lIlllllIllI[7]] = "Pour";
    }

    @Override
    public void r() {
        this.eu = null;
    }

    private static boolean lIIllIllIllIll(int n2) {
        return n2 == 0;
    }
}

