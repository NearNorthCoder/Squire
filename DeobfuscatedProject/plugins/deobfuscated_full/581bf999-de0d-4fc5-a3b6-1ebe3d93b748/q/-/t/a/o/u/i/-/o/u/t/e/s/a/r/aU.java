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
package q.-.t.a.o.u.i.-.o.u.t.e.s.a.r;

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
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aT;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aV;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aW;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.z;

/* TASK: Doing task -> DoingtaskTask */
@TaskDesc(name="Doing task", priority=50, blocking=true, register=true)
public class aU
extends aT {
    private /* synthetic */ aW eu;
    private static /* synthetic */ String[] lIlllllIlII;
    private static final /* synthetic */ int et;
    private static final /* synthetic */ int er;
    private static final /* synthetic */ int es;
    private static /* synthetic */ int[] lIlllllIllI;

    @Override
    public ConfigStorageBox<EquipmentSetup> br() {
        return this.cW.meleeGearAkkha();
    }

    private static String lIIllIllIIllll(String var16, String var1) {
        try {
            SecretKeySpec var22 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var1.getBytes(StandardCharsets.UTF_8)), lIlllllIllI[10]), "DES");
            Cipher var13 = Cipher.getInstance("DES");
            var13.init(lIlllllIllI[2], var22);
            return new String(var13.doFinal(Base64.getDecoder().decode(var16.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var5) {
            var5.printStackTrace();
            return null;
        }
    }

    private static boolean lIIllIllIlllll(int n2, int n3) {
        return n2 == n3;
    }

    @Inject
    protected aU(Client client, z z2, TOAConfig tOAConfig) {
        super(client, z2, tOAConfig);
    }

    private static boolean lIIllIllIllllI(int n2, int n3) {
        return n2 > n3;
    }

    /*
     * WARNING - void declaration
     */
    private void bJ() {
        void var12;
        int[] nArray = new int[lIlllllIllI[1]];
        nArray[aU.lIlllllIllI[0]] = lIlllllIllI[3];
        TileObject tileObject = TileObjects.getNearest((int[])nArray);
        if (aU.lIIllIllIlllIl(tileObject)) {
            return;
        }
        WorldPoint var10 = Players.getLocal().getWorldLocation();
        if (aU.lIIllIllIllllI(var12.distanceTo(var10), lIlllllIllI[4])) {
            aU var14;
            Movement.setDestination((WorldPoint)var14.c(var10, var12.getWorldLocation()));
            return;
        }
        tileObject.interact(lIlllllIlII[lIlllllIllI[4]]);
    }

    private static boolean lIIllIlllIIIII(int n2, int n3) {
        return n2 < n3;
    }

    private static String lIIllIllIlIIII(String var4, String var20) {
        try {
            SecretKeySpec var9 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var20.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var7 = Cipher.getInstance("Blowfish");
            var7.init(lIlllllIllI[2], var9);
            return new String(var7.doFinal(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var15) {
            var15.printStackTrace();
            return null;
        }
    }

    @Override
    @Subscribe
    public void a(ChatMessage chatMessage) {
        String string = chatMessage.getMessage();
        if (!aU.lIIllIllIllIll(string.contains(lIlllllIlII[lIlllllIllI[0]]) ? 1 : 0) || !aU.lIIllIllIllIll(string.contains(lIlllllIlII[lIlllllIllI[1]]) ? 1 : 0) || aU.lIIllIllIlllII(string.contains(lIlllllIlII[lIlllllIllI[2]]) ? 1 : 0)) {
            llllllllllllllllIlIIlIIllllIIIll.eu = null;
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
                0;
                if (((0x57 ^ 0x34) & ~(0xCD ^ 0xAE)) >= (0x78 ^ 0x7C)) {
                    return;
                }
            } else {
                llllllllllllllllIlIIlIIlllIIllII.eu = aW.VENTS;
            }
        }
    }

    @Override
    public boolean bC() {
        aU var26;
        if (aU.lIIllIllIlllIl((Object)this.eu)) {
            return lIlllllIllI[0];
        }
        switch (aV.ev[var26.eu.ordinal()]) {
            case 1: {
                var26.bJ();
                0;
                if (((0xFF ^ 0xC7 ^ (0xE3 ^ 0x88)) & (27 + 49 - -18 + 141 ^ 27 + 140 - 30 + 47 ^ -1)) == 0) break;
                return false;
            }
            case 2: {
                var26.bK();
            }
        }
        return lIlllllIllI[1];
    }

    private static void lIIllIllIllIlI() {
        lIlllllIllI = new int[11];
        aU.lIlllllIllI[0] = (0x9F ^ 0xA7) & ~(0xB3 ^ 0x8B);
        aU.lIlllllIllI[1] = 1;
        aU.lIlllllIllI[2] = 2;
        aU.lIlllllIllI[3] = 0xFFFFFBF6 & 0xB5BF;
        aU.lIlllllIllI[4] = 3;
        aU.lIlllllIllI[5] = -(0xFFFFEF7F & 0x12C5) & (0xFFFFFFFF & 0xB3FF);
        aU.lIlllllIllI[6] = -(0xFFFFF453 & 0xFFD) & (0xFFFFFFF7 & 0x6EF9);
        aU.lIlllllIllI[7] = 125 + 123 - 110 + 43 ^ 110 + 4 - -14 + 49;
        aU.lIlllllIllI[8] = 0xFFFFAAFE & 0x5D57;
        aU.lIlllllIllI[9] = 8 ^ 0x74 ^ (0x20 ^ 0x59);
        aU.lIlllllIllI[10] = 0x95 ^ 0x9D;
    }

    /*
     * WARNING - void declaration
     */
    private void bK() {
        void var2_3;
        void var23;
        int[] nArray = new int[lIlllllIllI[1]];
        nArray[aU.lIlllllIllI[0]] = lIlllllIllI[5];
        TileObject tileObject = TileObjects.getNearest((int[])nArray);
        if (aU.lIIllIllIlllIl(tileObject)) {
            return;
        }
        if (aU.lIIllIllIllIll(Players.getLocal().getWorldLocation().equals((Object)var23.getWorldLocation()) ? 1 : 0)) {
            aU var24;
            WorldPoint var6 = Players.getLocal().getWorldLocation();
            Movement.setDestination((WorldPoint)var24.c(var6, var23.getWorldLocation()));
            return;
        }
        int[] nArray2 = new int[lIlllllIllI[1]];
        nArray2[aU.lIlllllIllI[0]] = lIlllllIllI[6];
        Item var6 = Inventory.getFirst((int[])nArray2);
        if (aU.lIIllIllIlllIl(var6)) {
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

    private static String lIIllIllIIlllI(String var2, String var19) {
        var2 = new String(Base64.getDecoder().decode(var2.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var11 = new StringBuilder();
        char[] var17 = var19.toCharArray();
        int var18 = lIlllllIllI[0];
        char[] var25 = var2.toCharArray();
        int var8 = var25.length;
        int var3 = lIlllllIllI[0];
        while (aU.lIIllIlllIIIII(var3, var8)) {
            char var21 = var25[var3];
            var11.append((char)(var21 ^ var17[var18 % var17.length]));
            0;
            ++var18;
            ++var3;
            0;
            if (2 >= -1) continue;
            return null;
        }
        return String.valueOf(var11);
    }

    private static void lIIllIllIlIIIl() {
        lIlllllIlII = new String[lIlllllIllI[9]];
        aU.lIlllllIlII[aU.lIlllllIllI[0]] = aU."repair the damaged";
        aU.lIlllllIlII[aU.lIlllllIllI[1]] = aU."neutralise the fumes";
        aU.lIlllllIlII[aU.lIlllllIllI[2]] = aU."You have died";
        aU.lIlllllIlII[aU.lIlllllIllI[4]] = aU."Repair";
        aU.lIlllllIlII[aU.lIlllllIllI[7]] = aU."Pour";
    }

    @Override
    public void r() {
        this.eu = null;
    }

    private static boolean lIIllIllIllIll(int n2) {
        return n2 == 0;
    }
}

