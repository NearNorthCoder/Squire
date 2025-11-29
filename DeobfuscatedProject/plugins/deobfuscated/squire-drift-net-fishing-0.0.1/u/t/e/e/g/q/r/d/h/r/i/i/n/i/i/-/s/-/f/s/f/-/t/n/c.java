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
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
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
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.widgets.Dialog;

@TaskDesc(name="Banking", priority=35, blocking=true)
public class c
extends Task {
    private static /* synthetic */ int[] lIlIIIIIlllI;
    private static /* synthetic */ String[] lIlIIIIIlIlI;
    private /* synthetic */ Player r;
    private final /* synthetic */ Client q;
    private final /* synthetic */ SquireDriftNet p;

    private static String llIlIIllIlIllI(String lllllllllllllllIlllIIlllllIlIIll, String lllllllllllllllIlllIIlllllIlIlII) {
        try {
            SecretKeySpec lllllllllllllllIlllIIlllllIllIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlllIIlllllIlIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlllIIlllllIlIlll = Cipher.getInstance("Blowfish");
            lllllllllllllllIlllIIlllllIlIlll.init(lIlIIIIIlllI[2], lllllllllllllllIlllIIlllllIllIII);
            return new String(lllllllllllllllIlllIIlllllIlIlll.doFinal(Base64.getDecoder().decode(lllllllllllllllIlllIIlllllIlIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlllIIlllllIlIllI) {
            lllllllllllllllIlllIIlllllIlIllI.printStackTrace();
            return null;
        }
    }

    private static String llIlIIllIllIlI(String lllllllllllllllIlllIIllllllIlIlI, String lllllllllllllllIlllIIllllllIIlII) {
        lllllllllllllllIlllIIllllllIlIlI = new String(Base64.getDecoder().decode(lllllllllllllllIlllIIllllllIlIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlllIIllllllIlIII = new StringBuilder();
        char[] lllllllllllllllIlllIIllllllIIlll = lllllllllllllllIlllIIllllllIIlII.toCharArray();
        int lllllllllllllllIlllIIllllllIIllI = lIlIIIIIlllI[0];
        char[] lllllllllllllllIlllIIllllllIIIII = lllllllllllllllIlllIIllllllIlIlI.toCharArray();
        int lllllllllllllllIlllIIlllllIlllll = lllllllllllllllIlllIIllllllIIIII.length;
        int lllllllllllllllIlllIIlllllIllllI = lIlIIIIIlllI[0];
        while (c.llIlIIlllIlIII(lllllllllllllllIlllIIlllllIllllI, lllllllllllllllIlllIIlllllIlllll)) {
            char lllllllllllllllIlllIIllllllIlIll = lllllllllllllllIlllIIllllllIIIII[lllllllllllllllIlllIIlllllIllllI];
            lllllllllllllllIlllIIllllllIlIII.append((char)(lllllllllllllllIlllIIllllllIlIll ^ lllllllllllllllIlllIIllllllIIlll[lllllllllllllllIlllIIllllllIIllI % lllllllllllllllIlllIIllllllIIlll.length]));
            0;
            ++lllllllllllllllIlllIIllllllIIllI;
            ++lllllllllllllllIlllIIlllllIllllI;
            0;
            if (null == null) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIlllIIllllllIlIII);
    }

    public boolean run() {
        c lllllllllllllllIlllIlIIIIIIIIlll;
        if (c.llIlIIlllIIlII(this.q.isInInstancedRegion() ? 1 : 0)) {
            return lIlIIIIIlllI[0];
        }
        lllllllllllllllIlllIlIIIIIIIIlll.r = Players.getLocal();
        if (!c.llIlIIlllIIlIl(lllllllllllllllIlllIlIIIIIIIIlll.r) || c.llIlIIlllIIlII(lllllllllllllllIlllIlIIIIIIIIlll.r.getPlane())) {
            return lIlIIIIIlllI[0];
        }
        Item lllllllllllllllIlllIlIIIIIIIIllI = Equipment.fromSlot((EquipmentInventorySlot)EquipmentInventorySlot.WEAPON);
        if (c.llIlIIlllIIlIl(lllllllllllllllIlllIlIIIIIIIIllI)) {
            if (c.llIlIIlllIIllI(Inventory.getFreeSlots())) {
                lllllllllllllllIlllIlIIIIIIIIllI.interact(lIlIIIIIlIlI[lIlIIIIIlllI[0]]);
                return lIlIIIIIlllI[1];
            }
            String[] stringArray = new String[lIlIIIIIlllI[1]];
            stringArray[c.lIlIIIIIlllI[0]] = lIlIIIIIlIlI[lIlIIIIIlllI[1]];
            Item lllllllllllllllIlllIlIIIIIIIIlIl = Inventory.getFirst((String[])stringArray);
            if (c.llIlIIlllIIlIl(lllllllllllllllIlllIlIIIIIIIIlIl)) {
                lllllllllllllllIlllIlIIIIIIIIlIl.interact(lIlIIIIIlIlI[lIlIIIIIlllI[2]]);
                return lIlIIIIIlllI[1];
            }
            String[] stringArray2 = new String[lIlIIIIIlllI[1]];
            stringArray2[c.lIlIIIIIlllI[0]] = lIlIIIIIlIlI[lIlIIIIIlllI[3]];
            Item lllllllllllllllIlllIlIIIIIIIIlII = Inventory.getFirst((String[])stringArray2);
            if (c.llIlIIlllIIlIl(lllllllllllllllIlllIlIIIIIIIIlII)) {
                lllllllllllllllIlllIlIIIIIIIIlII.interact(lIlIIIIIlIlI[lIlIIIIIlllI[4]]);
            }
            return lIlIIIIIlllI[1];
        }
        if (c.llIlIIlllIIlII(lllllllllllllllIlllIlIIIIIIIIlll.p.g().matchesInventory() ? 1 : 0)) {
            if (c.llIlIIlllIIlII(Dialog.isEnterInputOpen() ? 1 : 0)) {
                Dialog.enterAmount((int)lIlIIIIIlllI[0]);
            }
            if (c.llIlIIlllIIlII(Bank.isOpen() ? 1 : 0)) {
                Bank.close();
                return lIlIIIIIlllI[1];
            }
            if (c.llIlIIlllIIlll(Movement.isRunEnabled() ? 1 : 0)) {
                Movement.toggleRun();
                return lIlIIIIIlllI[1];
            }
            TileObject lllllllllllllllIlllIlIIIIIIIIlIl = TileObjects.getNearest(tileObject -> {
                int n;
                String[] stringArray = new String[lIlIIIIIlllI[1]];
                stringArray[c.lIlIIIIIlllI[0]] = lIlIIIIIlIlI[lIlIIIIIlllI[8]];
                if (c.llIlIIlllIIlII(tileObject.hasAction(stringArray) ? 1 : 0) && c.llIlIIlllIIlII(tileObject.getName().contains(lIlIIIIIlIlI[lIlIIIIIlllI[9]]) ? 1 : 0)) {
                    n = lIlIIIIIlllI[1];
                    0;
                    if (((84 + 30 - 52 + 75 ^ 18 + 127 - -15 + 3) & (0x79 ^ 1 ^ (0xE5 ^ 0xB7) ^ -1)) < 0) {
                        return ((89 + 17 - 61 + 130 ^ 60 + 185 - 60 + 6) & (0x66 ^ 0xF ^ (5 ^ 0x7C) ^ -1)) != 0;
                    }
                } else {
                    n = lIlIIIIIlllI[0];
                }
                return n != 0;
            });
            if (c.llIlIIlllIIlIl(lllllllllllllllIlllIlIIIIIIIIlIl)) {
                if (c.llIlIIlllIlIII(lllllllllllllllIlllIlIIIIIIIIlll.q.getWeight(), lIlIIIIIlllI[5])) {
                    lllllllllllllllIlllIlIIIIIIIIlIl.interact(lIlIIIIIlIlI[lIlIIIIIlllI[6]]);
                    return lIlIIIIIlllI[1];
                }
                Log.error((String)lIlIIIIIlIlI[lIlIIIIIlllI[7]]);
                lllllllllllllllIlllIlIIIIIIIIlll.p.forceStop();
                return lIlIIIIIlllI[1];
            }
            return lIlIIIIIlllI[1];
        }
        if (c.llIlIIlllIIlII(Bank.isOpen() ? 1 : 0)) {
            if (c.llIlIIlllIIlll(lllllllllllllllIlllIlIIIIIIIIlll.p.g().matchesInventory() ? 1 : 0)) {
                lllllllllllllllIlllIlIIIIIIIIlll.p.g().withdraw();
                0;
                lllllllllllllllIlllIlIIIIIIIIlll.sleep(lIlIIIIIlllI[6]);
            }
            return lIlIIIIIlllI[1];
        }
        Bank.open();
        0;
        this.sleep(lIlIIIIIlllI[3]);
        return lIlIIIIIlllI[1];
    }

    private static boolean llIlIIlllIIlIl(Object object) {
        return object != null;
    }

    private static boolean llIlIIlllIlIII(int n, int n2) {
        return n < n2;
    }

    @Inject
    public c(SquireDriftNet squireDriftNet, Client client) {
        this.p = squireDriftNet;
        this.q = client;
    }

    private static boolean llIlIIlllIIlll(int n) {
        return n == 0;
    }

    private static boolean llIlIIlllIIllI(int n) {
        return n > 0;
    }

    private static void llIlIIlllIIIll() {
        lIlIIIIIlllI = new int[11];
        c.lIlIIIIIlllI[0] = (0xEB ^ 0xBC ^ (0xEE ^ 0x94)) & (0x72 ^ 0x2C ^ (0x67 ^ 0x14) ^ -1);
        c.lIlIIIIIlllI[1] = 1;
        c.lIlIIIIIlllI[2] = 2;
        c.lIlIIIIIlllI[3] = 3;
        c.lIlIIIIIlllI[4] = 3 + 84 - 47 + 104 ^ 27 + 85 - 16 + 52;
        c.lIlIIIIIlllI[5] = 0xAF ^ 0xB3;
        c.lIlIIIIIlllI[6] = 0x8B ^ 0x8E;
        c.lIlIIIIIlllI[7] = 0x41 ^ 0x47;
        c.lIlIIIIIlllI[8] = 0xC5 ^ 0xC2;
        c.lIlIIIIIlllI[9] = 170 + 80 - 74 + 11 ^ 122 + 96 - 173 + 134;
        c.lIlIIIIIlllI[10] = 0x34 ^ 0x3D;
    }

    private static String llIlIIllIlIIll(String lllllllllllllllIlllIIllllllllIII, String lllllllllllllllIlllIIllllllllIIl) {
        try {
            SecretKeySpec lllllllllllllllIlllIIlllllllllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlllIIllllllllIIl.getBytes(StandardCharsets.UTF_8)), lIlIIIIIlllI[9]), "DES");
            Cipher lllllllllllllllIlllIIlllllllllII = Cipher.getInstance("DES");
            lllllllllllllllIlllIIlllllllllII.init(lIlIIIIIlllI[2], lllllllllllllllIlllIIlllllllllIl);
            return new String(lllllllllllllllIlllIIlllllllllII.doFinal(Base64.getDecoder().decode(lllllllllllllllIlllIIllllllllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlllIIllllllllIll) {
            lllllllllllllllIlllIIllllllllIll.printStackTrace();
            return null;
        }
    }

    private static void llIlIIllIlllII() {
        lIlIIIIIlIlI = new String[lIlIIIIIlllI[10]];
        c.lIlIIIIIlIlI[c.lIlIIIIIlllI[0]] = c."Remove";
        c.lIlIIIIIlIlI[c.lIlIIIIIlllI[1]] = c."Vial";
        c.lIlIIIIIlIlI[c.lIlIIIIIlllI[2]] = c."Drop";
        c.lIlIIIIIlIlI[c.lIlIIIIIlllI[3]] = c."Drift net";
        c.lIlIIIIIlIlI[c.lIlIIIIIlllI[4]] = c."Drop";
        c.lIlIIIIIlIlI[c.lIlIIIIIlllI[6]] = c."Dive";
        c.lIlIIIIIlIlI[c.lIlIIIIIlllI[7]] = c."You are too heavy! Total weight has to be under 28kg";
        c.lIlIIIIIlIlI[c.lIlIIIIIlllI[8]] = c."Travel";
        c.lIlIIIIIlIlI[c.lIlIIIIIlllI[9]] = c."Rowboat";
    }

    private static boolean llIlIIlllIIlII(int n) {
        return n != 0;
    }

    static {
        c.llIlIIlllIIIll();
        c.llIlIIllIlllII();
    }
}

