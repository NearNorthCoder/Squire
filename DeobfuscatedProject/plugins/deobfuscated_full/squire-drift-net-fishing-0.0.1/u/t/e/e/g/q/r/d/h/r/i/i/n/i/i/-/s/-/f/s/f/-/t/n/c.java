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

/* TASK: Banking -> BankingTask */
@TaskDesc(name="Banking", priority=35, blocking=true)
public class c
extends Task {
    private static /* synthetic */ int[] lIlIIIIIlllI;
    private static /* synthetic */ String[] lIlIIIIIlIlI;
    private /* synthetic */ Player r;
    private final /* synthetic */ Client q;
    private final /* synthetic */ SquireDriftNet p;

    private static String llIlIIllIlIllI(String var10, String var11) {
        try {
            SecretKeySpec var4 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var11.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var21 = Cipher.getInstance("Blowfish");
            var21.init(lIlIIIIIlllI[2], var4);
            return new String(var21.doFinal(Base64.getDecoder().decode(var10.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var18) {
            var18.printStackTrace();
            return null;
        }
    }

    private static String llIlIIllIllIlI(String var13, String var1) {
        var13 = new String(Base64.getDecoder().decode(var13.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var23 = new StringBuilder();
        char[] var22 = var1.toCharArray();
        int var8 = lIlIIIIIlllI[0];
        char[] var9 = var13.toCharArray();
        int var2 = var9.length;
        int var16 = lIlIIIIIlllI[0];
        while (c.llIlIIlllIlIII(var16, var2)) {
            char var12 = var9[var16];
            var23.append((char)(var12 ^ var22[var8 % var22.length]));
            0;
            ++var8;
            ++var16;
            0;
            
            return null;
        }
        return String.valueOf(var23);
    }

    public boolean run() {
        c var5;
        if (c.llIlIIlllIIlII(this.q.isInInstancedRegion() ? 1 : 0)) {
            return lIlIIIIIlllI[0];
        }
        var5.r = Players.getLocal();
        if (!c.llIlIIlllIIlIl(var5.r) || c.llIlIIlllIIlII(var5.r.getPlane())) {
            return lIlIIIIIlllI[0];
        }
        Item var14 = Equipment.fromSlot((EquipmentInventorySlot)EquipmentInventorySlot.WEAPON);
        if (c.llIlIIlllIIlIl(var14)) {
            if (c.llIlIIlllIIllI(Inventory.getFreeSlots())) {
                var14.interact(lIlIIIIIlIlI[lIlIIIIIlllI[0]]);
                return lIlIIIIIlllI[1];
            }
            String[] stringArray = new String[lIlIIIIIlllI[1]];
            stringArray[c.lIlIIIIIlllI[0]] = lIlIIIIIlIlI[lIlIIIIIlllI[1]];
            Item var19 = Inventory.getFirst((String[])stringArray);
            if (c.llIlIIlllIIlIl(var19)) {
                var19.interact(lIlIIIIIlIlI[lIlIIIIIlllI[2]]);
                return lIlIIIIIlllI[1];
            }
            String[] stringArray2 = new String[lIlIIIIIlllI[1]];
            stringArray2[c.lIlIIIIIlllI[0]] = lIlIIIIIlIlI[lIlIIIIIlllI[3]];
            Item var20 = Inventory.getFirst((String[])stringArray2);
            if (c.llIlIIlllIIlIl(var20)) {
                var20.interact(lIlIIIIIlIlI[lIlIIIIIlllI[4]]);
            }
            return lIlIIIIIlllI[1];
        }
        if (c.llIlIIlllIIlII(var5.p.g().matchesInventory() ? 1 : 0)) {
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
            TileObject var19 = TileObjects.getNearest(tileObject -> {
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
            if (c.llIlIIlllIIlIl(var19)) {
                if (c.llIlIIlllIlIII(var5.q.getWeight(), lIlIIIIIlllI[5])) {
                    var19.interact(lIlIIIIIlIlI[lIlIIIIIlllI[6]]);
                    return lIlIIIIIlllI[1];
                }
                Log.error((String)lIlIIIIIlIlI[lIlIIIIIlllI[7]]);
                var5.p.forceStop();
                return lIlIIIIIlllI[1];
            }
            return lIlIIIIIlllI[1];
        }
        if (c.llIlIIlllIIlII(Bank.isOpen() ? 1 : 0)) {
            if (c.llIlIIlllIIlll(var5.p.g().matchesInventory() ? 1 : 0)) {
                var5.p.g().withdraw();
                0;
                var5.sleep(lIlIIIIIlllI[6]);
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

    private static String llIlIIllIlIIll(String var15, String var3) {
        try {
            SecretKeySpec var7 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var3.getBytes(StandardCharsets.UTF_8)), lIlIIIIIlllI[9]), "DES");
            Cipher var17 = Cipher.getInstance("DES");
            var17.init(lIlIIIIIlllI[2], var7);
            return new String(var17.doFinal(Base64.getDecoder().decode(var15.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var6) {
            var6.printStackTrace();
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

