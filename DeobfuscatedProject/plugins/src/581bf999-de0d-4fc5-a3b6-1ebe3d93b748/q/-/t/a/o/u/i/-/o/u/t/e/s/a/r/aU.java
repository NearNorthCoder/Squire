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

    private static String lIIllIllIIllll(String llllllllllllllllIlIIlIIllIIllIII, String llllllllllllllllIlIIlIIllIIlIlll) {
        try {
            SecretKeySpec llllllllllllllllIlIIlIIllIIlllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIlIIlIIllIIlIlll.getBytes(StandardCharsets.UTF_8)), lIlllllIllI[10]), "DES");
            Cipher llllllllllllllllIlIIlIIllIIlllII = Cipher.getInstance("DES");
            llllllllllllllllIlIIlIIllIIlllII.init(lIlllllIllI[2], llllllllllllllllIlIIlIIllIIlllIl);
            return new String(llllllllllllllllIlIIlIIllIIlllII.doFinal(Base64.getDecoder().decode(llllllllllllllllIlIIlIIllIIllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIlIIlIIllIIllIll) {
            llllllllllllllllIlIIlIIllIIllIll.printStackTrace();
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
        void llllllllllllllllIlIIlIIlllIllIlI;
        int[] nArray = new int[lIlllllIllI[1]];
        nArray[aU.lIlllllIllI[0]] = lIlllllIllI[3];
        TileObject tileObject = TileObjects.getNearest((int[])nArray);
        if (aU.lIIllIllIlllIl(tileObject)) {
            return;
        }
        WorldPoint llllllllllllllllIlIIlIIlllIllIIl = Players.getLocal().getWorldLocation();
        if (aU.lIIllIllIllllI(llllllllllllllllIlIIlIIlllIllIlI.distanceTo(llllllllllllllllIlIIlIIlllIllIIl), lIlllllIllI[4])) {
            aU llllllllllllllllIlIIlIIlllIllIll;
            Movement.setDestination((WorldPoint)llllllllllllllllIlIIlIIlllIllIll.c(llllllllllllllllIlIIlIIlllIllIIl, llllllllllllllllIlIIlIIlllIllIlI.getWorldLocation()));
            return;
        }
        tileObject.interact(lIlllllIlII[lIlllllIllI[4]]);
    }

    private static boolean lIIllIlllIIIII(int n2, int n3) {
        return n2 < n3;
    }

    private static String lIIllIllIlIIII(String llllllllllllllllIlIIlIIllIlIIlIl, String llllllllllllllllIlIIlIIllIlIIlII) {
        try {
            SecretKeySpec llllllllllllllllIlIIlIIllIlIlIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIlIIlIIllIlIIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllIlIIlIIllIlIlIIl = Cipher.getInstance("Blowfish");
            llllllllllllllllIlIIlIIllIlIlIIl.init(lIlllllIllI[2], llllllllllllllllIlIIlIIllIlIlIlI);
            return new String(llllllllllllllllIlIIlIIllIlIlIIl.doFinal(Base64.getDecoder().decode(llllllllllllllllIlIIlIIllIlIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIlIIlIIllIlIlIII) {
            llllllllllllllllIlIIlIIllIlIlIII.printStackTrace();
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
                "".length();
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
        aU llllllllllllllllIlIIlIIlllIlllll;
        if (aU.lIIllIllIlllIl((Object)this.eu)) {
            return lIlllllIllI[0];
        }
        switch (aV.ev[llllllllllllllllIlIIlIIlllIlllll.eu.ordinal()]) {
            case 1: {
                llllllllllllllllIlIIlIIlllIlllll.bJ();
                "".length();
                if (((0xFF ^ 0xC7 ^ (0xE3 ^ 0x88)) & (27 + 49 - -18 + 141 ^ 27 + 140 - 30 + 47 ^ -" ".length())) == 0) break;
                return ((30 + 26 - 7 + 99 ^ 75 + 30 - 65 + 104) & (80 + 44 - 0 + 29 ^ 129 + 114 - 181 + 95 ^ -" ".length())) != 0;
            }
            case 2: {
                llllllllllllllllIlIIlIIlllIlllll.bK();
            }
        }
        return lIlllllIllI[1];
    }

    private static void lIIllIllIllIlI() {
        lIlllllIllI = new int[11];
        aU.lIlllllIllI[0] = (0x9F ^ 0xA7) & ~(0xB3 ^ 0x8B);
        aU.lIlllllIllI[1] = " ".length();
        aU.lIlllllIllI[2] = "  ".length();
        aU.lIlllllIllI[3] = 0xFFFFFBF6 & 0xB5BF;
        aU.lIlllllIllI[4] = "   ".length();
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
        void llllllllllllllllIlIIlIIlllIlIlII;
        int[] nArray = new int[lIlllllIllI[1]];
        nArray[aU.lIlllllIllI[0]] = lIlllllIllI[5];
        TileObject tileObject = TileObjects.getNearest((int[])nArray);
        if (aU.lIIllIllIlllIl(tileObject)) {
            return;
        }
        if (aU.lIIllIllIllIll(Players.getLocal().getWorldLocation().equals((Object)llllllllllllllllIlIIlIIlllIlIlII.getWorldLocation()) ? 1 : 0)) {
            aU llllllllllllllllIlIIlIIlllIlIlIl;
            WorldPoint llllllllllllllllIlIIlIIlllIlIIll = Players.getLocal().getWorldLocation();
            Movement.setDestination((WorldPoint)llllllllllllllllIlIIlIIlllIlIlIl.c(llllllllllllllllIlIIlIIlllIlIIll, llllllllllllllllIlIIlIIlllIlIlII.getWorldLocation()));
            return;
        }
        int[] nArray2 = new int[lIlllllIllI[1]];
        nArray2[aU.lIlllllIllI[0]] = lIlllllIllI[6];
        Item llllllllllllllllIlIIlIIlllIlIIll = Inventory.getFirst((int[])nArray2);
        if (aU.lIIllIllIlllIl(llllllllllllllllIlIIlIIlllIlIIll)) {
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

    private static String lIIllIllIIlllI(String llllllllllllllllIlIIlIIllIllIlll, String llllllllllllllllIlIIlIIllIlllIll) {
        llllllllllllllllIlIIlIIllIllIlll = new String(Base64.getDecoder().decode(llllllllllllllllIlIIlIIllIllIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllIlIIlIIllIlllIlI = new StringBuilder();
        char[] llllllllllllllllIlIIlIIllIlllIIl = llllllllllllllllIlIIlIIllIlllIll.toCharArray();
        int llllllllllllllllIlIIlIIllIlllIII = lIlllllIllI[0];
        char[] llllllllllllllllIlIIlIIllIllIIlI = llllllllllllllllIlIIlIIllIllIlll.toCharArray();
        int llllllllllllllllIlIIlIIllIllIIIl = llllllllllllllllIlIIlIIllIllIIlI.length;
        int llllllllllllllllIlIIlIIllIllIIII = lIlllllIllI[0];
        while (aU.lIIllIlllIIIII(llllllllllllllllIlIIlIIllIllIIII, llllllllllllllllIlIIlIIllIllIIIl)) {
            char llllllllllllllllIlIIlIIllIllllIl = llllllllllllllllIlIIlIIllIllIIlI[llllllllllllllllIlIIlIIllIllIIII];
            llllllllllllllllIlIIlIIllIlllIlI.append((char)(llllllllllllllllIlIIlIIllIllllIl ^ llllllllllllllllIlIIlIIllIlllIIl[llllllllllllllllIlIIlIIllIlllIII % llllllllllllllllIlIIlIIllIlllIIl.length]));
            "".length();
            ++llllllllllllllllIlIIlIIllIlllIII;
            ++llllllllllllllllIlIIlIIllIllIIII;
            "".length();
            if ("  ".length() >= -" ".length()) continue;
            return null;
        }
        return String.valueOf(llllllllllllllllIlIIlIIllIlllIlI);
    }

    private static void lIIllIllIlIIIl() {
        lIlllllIlII = new String[lIlllllIllI[9]];
        aU.lIlllllIlII[aU.lIlllllIllI[0]] = aU.lIIllIllIIlllI("IDY+Misgczo7J3I3Lz4jNTYq", "RSNSB");
        aU.lIlllllIlII[aU.lIlllllIllI[1]] = aU.lIIllIllIIlllI("Dx0NEzwAFBEUK0EMEAJuBw0VAj0=", "axxgN");
        aU.lIlllllIlII[aU.lIlllllIllI[2]] = aU.lIIllIllIIllll("1rjY6PfHkQvODCqiFbxlCQ==", "KnmKh");
        aU.lIlllllIlII[aU.lIlllllIllI[4]] = aU.lIIllIllIIlllI("HTA7BQU9", "OUKdl");
        aU.lIlllllIlII[aU.lIlllllIllI[7]] = aU.lIIllIllIlIIII("/eB7EQQmc40=", "Cgmrc");
    }

    @Override
    public void r() {
        this.eu = null;
    }

    private static boolean lIIllIllIllIll(int n2) {
        return n2 == 0;
    }
}

