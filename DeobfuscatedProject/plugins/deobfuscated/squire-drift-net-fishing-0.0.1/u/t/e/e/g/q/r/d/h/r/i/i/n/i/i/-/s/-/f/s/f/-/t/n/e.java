/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.EquipmentInventorySlot
 *  net.runelite.api.Item
 *  net.runelite.api.Player
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.widgets.Dialog
 */
package u.t.e.e.g.q.r.d.h.r.i.i.n.i.i.-.s.-.f.s.f.-.t.n;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.driftnet.SquireDriftNet;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.EquipmentInventorySlot;
import net.runelite.api.Item;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Dialog;

@TaskDesc(name="Enter instance", priority=30, blocking=true)
public class e
extends Task {
    private static /* synthetic */ int[] lIlIIIIIIlIl;
    private static /* synthetic */ String[] lIlIIIIIIIIl;
    private /* synthetic */ Player r;
    private final /* synthetic */ SquireDriftNet v;
    private final /* synthetic */ Client w;
    private final /* synthetic */ WorldPoint x;

    private static boolean llIlIIlIlllIII(Object object) {
        return object == null;
    }

    private static String llIlIIlIlIllIl(String lllllllllllllllIlllIlIIlIIIlIIII, String lllllllllllllllIlllIlIIlIIIlIIIl) {
        try {
            SecretKeySpec lllllllllllllllIlllIlIIlIIIlIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlllIlIIlIIIlIIIl.getBytes(StandardCharsets.UTF_8)), lIlIIIIIIlIl[10]), "DES");
            Cipher lllllllllllllllIlllIlIIlIIIlIlII = Cipher.getInstance("DES");
            lllllllllllllllIlllIlIIlIIIlIlII.init(lIlIIIIIIlIl[4], lllllllllllllllIlllIlIIlIIIlIlIl);
            return new String(lllllllllllllllIlllIlIIlIIIlIlII.doFinal(Base64.getDecoder().decode(lllllllllllllllIlllIlIIlIIIlIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlllIlIIlIIIlIIll) {
            lllllllllllllllIlllIlIIlIIIlIIll.printStackTrace();
            return null;
        }
    }

    @Inject
    public e(SquireDriftNet squireDriftNet, Client client) {
        this.x = new WorldPoint(lIlIIIIIIlIl[0], lIlIIIIIIlIl[1], lIlIIIIIIlIl[2]);
        this.v = squireDriftNet;
        this.w = client;
    }

    static {
        e.llIlIIlIllIlll();
        e.llIlIIlIllIIll();
    }

    private static void llIlIIlIllIlll() {
        lIlIIIIIIlIl = new int[20];
        e.lIlIIIIIIlIl[0] = -(0xEB ^ 0xAE) & (0xFFFFEEF5 & 0x1FDF);
        e.lIlIIIIIIlIl[1] = 0xFFFFE8FF & 0x3F37;
        e.lIlIIIIIIlIl[2] = 1;
        e.lIlIIIIIIlIl[3] = (0xBB ^ 0x83) & ~(0x1A ^ 0x22);
        e.lIlIIIIIIlIl[4] = 2;
        e.lIlIIIIIIlIl[5] = 3;
        e.lIlIIIIIIlIl[6] = (0x13 ^ 0x5B) & ~(0x1A ^ 0x52) ^ (0xA6 ^ 0xA2);
        e.lIlIIIIIIlIl[7] = 0x73 ^ 0x76;
        e.lIlIIIIIIlIl[8] = 102 + 67 - 52 + 41 ^ 34 + 37 - -59 + 22;
        e.lIlIIIIIIlIl[9] = 136 + 127 - 184 + 64 ^ 107 + 21 - 15 + 23;
        e.lIlIIIIIIlIl[10] = 0x21 ^ 0x29;
        e.lIlIIIIIIlIl[11] = (0x7A ^ 0x44) & ~(4 ^ 0x3A) ^ (0x69 ^ 0x60);
        e.lIlIIIIIIlIl[12] = (0x7F ^ 0x1E) + (0x40 ^ 0x53) - -(0xBC ^ 0x9C) + (0xB0 ^ 0x84);
        e.lIlIIIIIIlIl[13] = 0x92 ^ 0x98;
        e.lIlIIIIIIlIl[14] = 0xAA ^ 0xA1;
        e.lIlIIIIIIlIl[15] = 0x2D ^ 0x6D ^ (0x1B ^ 0x57);
        e.lIlIIIIIIlIl[16] = 0x35 ^ 0x59 ^ (0x67 ^ 6);
        e.lIlIIIIIIlIl[17] = 0x96 ^ 0x98;
        e.lIlIIIIIIlIl[18] = 120 + 1 - 120 + 143 ^ 28 + 149 - 106 + 88;
        e.lIlIIIIIIlIl[19] = 0x24 ^ 0x34;
    }

    private static String llIlIIlIlIllll(String lllllllllllllllIlllIlIIlIIIIIlIl, String lllllllllllllllIlllIlIIlIIIIIlII) {
        try {
            SecretKeySpec lllllllllllllllIlllIlIIlIIIIlIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlllIlIIlIIIIIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlllIlIIlIIIIIlll = Cipher.getInstance("Blowfish");
            lllllllllllllllIlllIlIIlIIIIIlll.init(lIlIIIIIIlIl[4], lllllllllllllllIlllIlIIlIIIIlIII);
            return new String(lllllllllllllllIlllIlIIlIIIIIlll.doFinal(Base64.getDecoder().decode(lllllllllllllllIlllIlIIlIIIIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlllIlIIlIIIIIllI) {
            lllllllllllllllIlllIlIIlIIIIIllI.printStackTrace();
            return null;
        }
    }

    private static boolean llIlIIlIllllIl(int n, int n2) {
        return n < n2;
    }

    private static boolean llIlIIlIlllIlI(Object object) {
        return object != null;
    }

    public boolean run() {
        e lllllllllllllllIlllIlIIlIIllIllI;
        this.r = Players.getLocal();
        if (e.llIlIIlIlllIII(this.r)) {
            return lIlIIIIIIlIl[3];
        }
        if (e.llIlIIlIlllIIl(lllllllllllllllIlllIlIIlIIllIllI.w.isInInstancedRegion() ? 1 : 0)) {
            String[] stringArray = new String[lIlIIIIIIlIl[2]];
            stringArray[e.lIlIIIIIIlIl[3]] = lIlIIIIIIIIl[lIlIIIIIIlIl[3]];
            TileObject lllllllllllllllIlllIlIIlIIllIlIl = TileObjects.getNearest((String[])stringArray);
            if (e.llIlIIlIlllIlI(lllllllllllllllIlllIlIIlIIllIlIl) && e.llIlIIlIlllIll(lllllllllllllllIlllIlIIlIIllIllI.r.getWorldLocation().getX(), lllllllllllllllIlllIlIIlIIllIlIl.getWorldLocation().getX())) {
                lllllllllllllllIlllIlIIlIIllIlIl.interact(lIlIIIIIIIIl[lIlIIIIIIlIl[2]]);
                return lIlIIIIIIlIl[2];
            }
            Item lllllllllllllllIlllIlIIlIIllIlII = Equipment.fromSlot((EquipmentInventorySlot)EquipmentInventorySlot.WEAPON);
            if (e.llIlIIlIlllIlI(lllllllllllllllIlllIlIIlIIllIlII) && (!e.llIlIIlIllllII(lllllllllllllllIlllIlIIlIIllIlII.getName().toLowerCase().contains(lIlIIIIIIIIl[lIlIIIIIIlIl[4]]) ? 1 : 0) || e.llIlIIlIlllIIl(lllllllllllllllIlllIlIIlIIllIlII.getName().toLowerCase().contains(lIlIIIIIIIIl[lIlIIIIIIlIl[5]]) ? 1 : 0))) {
                return lIlIIIIIIlIl[3];
            }
            if (e.llIlIIlIlllIIl(Dialog.hasOption(string -> string.toLowerCase().contains(lIlIIIIIIIIl[lIlIIIIIIlIl[18]])) ? 1 : 0)) {
                String[] stringArray2 = new String[lIlIIIIIIlIl[2]];
                stringArray2[e.lIlIIIIIIlIl[3]] = lIlIIIIIIIIl[lIlIIIIIIlIl[6]];
                Dialog.chooseOption((String[])stringArray2);
                0;
                return lIlIIIIIIlIl[2];
            }
            lllllllllllllllIlllIlIIlIIllIlII = Inventory.getFirst(item -> {
                boolean bl;
                if (!e.llIlIIlIllllII(item.getName().toLowerCase().contains(lIlIIIIIIIIl[lIlIIIIIIlIl[16]]) ? 1 : 0) || e.llIlIIlIlllIIl(item.getName().toLowerCase().contains(lIlIIIIIIIIl[lIlIIIIIIlIl[17]]) ? 1 : 0)) {
                    bl = lIlIIIIIIlIl[2];
                    0;
                    if (((0x84 ^ 0xAF) & ~(0x83 ^ 0xA8)) != 0) {
                        return ((0x65 ^ 0x50) & ~(0x9B ^ 0xAE)) != 0;
                    }
                } else {
                    bl = lIlIIIIIIlIl[3];
                }
                return bl;
            });
            if (e.llIlIIlIlllIlI(lllllllllllllllIlllIlIIlIIllIlII)) {
                lllllllllllllllIlllIlIIlIIllIlII.interact(lIlIIIIIIIIl[lIlIIIIIIlIl[7]]);
            }
            return lIlIIIIIIlIl[2];
        }
        if (!e.llIlIIlIlllIIl(Dialog.isViewingOptions() ? 1 : 0) || e.llIlIIlIllllII(Dialog.hasOption(string -> string.toLowerCase().contains(lIlIIIIIIIIl[lIlIIIIIIlIl[15]])) ? 1 : 0)) {
            String[] stringArray = new String[lIlIIIIIIlIl[2]];
            stringArray[e.lIlIIIIIIlIl[3]] = lIlIIIIIIIIl[lIlIIIIIIlIl[8]];
            TileObject lllllllllllllllIlllIlIIlIIllIlIl = TileObjects.getFirstAt((WorldPoint)lllllllllllllllIlllIlIIlIIllIllI.x, (String[])stringArray);
            if (e.llIlIIlIlllIlI(lllllllllllllllIlllIlIIlIIllIlIl)) {
                lllllllllllllllIlllIlIIlIIllIlIl.interact(lIlIIIIIIIIl[lIlIIIIIIlIl[9]]);
                return lIlIIIIIIlIl[2];
            }
            return lIlIIIIIIlIl[3];
        }
        if (e.llIlIIlIlllIIl(Dialog.hasOption((String)lIlIIIIIIIIl[lIlIIIIIIlIl[10]]) ? 1 : 0)) {
            String[] stringArray = new String[lIlIIIIIIlIl[2]];
            stringArray[e.lIlIIIIIIlIl[3]] = lIlIIIIIIIIl[lIlIIIIIIlIl[11]];
            if (e.llIlIIlIllllIl(Inventory.getFirst((String[])stringArray).getQuantity(), lIlIIIIIIlIl[12])) {
                Log.error((String)lIlIIIIIIIIl[lIlIIIIIIlIl[13]]);
                lllllllllllllllIlllIlIIlIIllIllI.v.forceStop();
                return lIlIIIIIIlIl[3];
            }
        }
        String[] stringArray = new String[lIlIIIIIIlIl[2]];
        stringArray[e.lIlIIIIIIlIl[3]] = lIlIIIIIIIIl[lIlIIIIIIlIl[14]];
        Dialog.chooseOption((String[])stringArray);
        0;
        return lIlIIIIIIlIl[2];
    }

    private static boolean llIlIIlIlllIll(int n, int n2) {
        return n <= n2;
    }

    private static String llIlIIlIlIlllI(String lllllllllllllllIlllIlIIlIIlIIIlI, String lllllllllllllllIlllIlIIlIIlIIllI) {
        lllllllllllllllIlllIlIIlIIlIIIlI = new String(Base64.getDecoder().decode(lllllllllllllllIlllIlIIlIIlIIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlllIlIIlIIlIIlIl = new StringBuilder();
        char[] lllllllllllllllIlllIlIIlIIlIIlII = lllllllllllllllIlllIlIIlIIlIIllI.toCharArray();
        int lllllllllllllllIlllIlIIlIIlIIIll = lIlIIIIIIlIl[3];
        char[] lllllllllllllllIlllIlIIlIIIlllIl = lllllllllllllllIlllIlIIlIIlIIIlI.toCharArray();
        int lllllllllllllllIlllIlIIlIIIlllII = lllllllllllllllIlllIlIIlIIIlllIl.length;
        int lllllllllllllllIlllIlIIlIIIllIll = lIlIIIIIIlIl[3];
        while (e.llIlIIlIllllIl(lllllllllllllllIlllIlIIlIIIllIll, lllllllllllllllIlllIlIIlIIIlllII)) {
            char lllllllllllllllIlllIlIIlIIlIlIII = lllllllllllllllIlllIlIIlIIIlllIl[lllllllllllllllIlllIlIIlIIIllIll];
            lllllllllllllllIlllIlIIlIIlIIlIl.append((char)(lllllllllllllllIlllIlIIlIIlIlIII ^ lllllllllllllllIlllIlIIlIIlIIlII[lllllllllllllllIlllIlIIlIIlIIIll % lllllllllllllllIlllIlIIlIIlIIlII.length]));
            0;
            ++lllllllllllllllIlllIlIIlIIlIIIll;
            ++lllllllllllllllIlllIlIIlIIIllIll;
            0;
            if (2 != 0) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIlllIlIIlIIlIIlIl);
    }

    private static boolean llIlIIlIlllIIl(int n) {
        return n != 0;
    }

    private static void llIlIIlIllIIll() {
        lIlIIIIIIIIl = new String[lIlIIIIIIlIl[19]];
        e.lIlIIIIIIIIl[e.lIlIIIIIIlIl[3]] = e."Plant door";
        e.lIlIIIIIIIIl[e.lIlIIIIIIlIl[2]] = e."Navigate";
        e.lIlIIIIIIIIl[e.lIlIIIIIIlIl[4]] = e."trident";
        e.lIlIIIIIIIIl[e.lIlIIIIIIlIl[5]] = e."harpoon";
        e.lIlIIIIIIIIl[e.lIlIIIIIIlIl[6]] = e."wield";
        e.lIlIIIIIIIIl[e.lIlIIIIIIlIl[7]] = e."Wield";
        e.lIlIIIIIIIIl[e.lIlIIIIIIlIl[8]] = e."Tunnel";
        e.lIlIIIIIIIIl[e.lIlIIIIIIlIl[9]] = e."Enter";
        e.lIlIIIIIIIIl[e.lIlIIIIIIlIl[10]] = e."200";
        e.lIlIIIIIIIIl[e.lIlIIIIIIlIl[11]] = e."Numulite";
        e.lIlIIIIIIIIl[e.lIlIIIIIIlIl[13]] = e."Not enough numulite to pay entry fee";
        e.lIlIIIIIIIIl[e.lIlIIIIIIlIl[14]] = e."nter instance";
        e.lIlIIIIIIIIl[e.lIlIIIIIIlIl[15]] = e."enter instance";
        e.lIlIIIIIIIIl[e.lIlIIIIIIlIl[16]] = e."trident";
        e.lIlIIIIIIIIl[e.lIlIIIIIIlIl[17]] = e."harpoon";
        e.lIlIIIIIIIIl[e.lIlIIIIIIlIl[18]] = e."wield";
    }

    private static boolean llIlIIlIllllII(int n) {
        return n == 0;
    }
}

