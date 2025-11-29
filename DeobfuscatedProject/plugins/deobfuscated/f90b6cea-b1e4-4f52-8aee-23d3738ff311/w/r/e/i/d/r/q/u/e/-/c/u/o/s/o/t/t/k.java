/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  javax.inject.Inject
 *  net.runelite.api.Locatable
 *  net.runelite.api.Player
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldArea
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 */
package w.r.e.i.d.r.q.u.e.-.c.u.o.s.o.t.t;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.woodcutting.SquireWoodcutterConfig;
import gg.squire.woodcutting.SquireWoodcutterPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Locatable;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import w.r.e.i.d.r.q.u.e.-.c.u.o.s.o.t.t.i;

@TaskDesc(name="Chopping (fast)", priority=75, register=true)
public class k
extends Task {
    private static /* synthetic */ int[] lIllIIIIIlIlI;
    private static /* synthetic */ String[] lIllIIIIIlIIl;
    private final /* synthetic */ SquireWoodcutterConfig K;
    private final /* synthetic */ SquireWoodcutterPlugin L;

    static {
        k.llIIIlIIIIIIIII();
        k.llIIIIlllllllll();
    }

    private static boolean llIIIlIIIIIIIlI(int n) {
        return n != 0;
    }

    private static String llIIIIllllllllI(String llllllllllllllIllIIllIlIlIIIlIII, String llllllllllllllIllIIllIlIlIIIIlll) {
        try {
            SecretKeySpec llllllllllllllIllIIllIlIlIIIllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIllIlIlIIIIlll.getBytes(StandardCharsets.UTF_8)), lIllIIIIIlIlI[7]), "DES");
            Cipher llllllllllllllIllIIllIlIlIIIllII = Cipher.getInstance("DES");
            llllllllllllllIllIIllIlIlIIIllII.init(lIllIIIIIlIlI[4], llllllllllllllIllIIllIlIlIIIllIl);
            return new String(llllllllllllllIllIIllIlIlIIIllII.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIllIlIlIIIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllIIllIlIlIIIlIll) {
            llllllllllllllIllIIllIlIlIIIlIll.printStackTrace();
            return null;
        }
    }

    private static void llIIIIlllllllll() {
        lIllIIIIIlIIl = new String[lIllIIIIIlIlI[6]];
        k.lIllIIIIIlIIl[k.lIllIIIIIlIlI[0]] = k."fossil null";
        k.lIllIIIIIlIIl[k.lIllIIIIIlIlI[2]] = k."Missed 4 cycles in a row, restarting.";
        k.lIllIIIIIlIIl[k.lIllIIIIIlIlI[4]] = k."Chop down";
        k.lIllIIIIIlIIl[k.lIllIIIIIlIlI[5]] = k."Chop down";
        k.lIllIIIIIlIIl[k.lIllIIIIIlIlI[1]] = k."Chop down";
    }

    private static void llIIIlIIIIIIIII() {
        lIllIIIIIlIlI = new int[8];
        k.lIllIIIIIlIlI[0] = (0x93 ^ 0x99) & ~(0x7A ^ 0x70);
        k.lIllIIIIIlIlI[1] = 0xA4 ^ 0xA0;
        k.lIllIIIIIlIlI[2] = 1;
        k.lIllIIIIIlIlI[3] = 0x55 ^ 0x40 ^ (0x3E ^ 0x27);
        k.lIllIIIIIlIlI[4] = 2;
        k.lIllIIIIIlIlI[5] = 3;
        k.lIllIIIIIlIlI[6] = 0x96 ^ 0x93;
        k.lIllIIIIIlIlI[7] = 85 + 76 - 146 + 135 ^ 31 + 66 - 41 + 102;
    }

    @Inject
    public k(SquireWoodcutterPlugin squireWoodcutterPlugin, SquireWoodcutterConfig squireWoodcutterConfig) {
        this.L = squireWoodcutterPlugin;
        this.K = squireWoodcutterConfig;
    }

    private static String llIIIIlllllllIl(String llllllllllllllIllIIllIlIIllllIll, String llllllllllllllIllIIllIlIIllllIlI) {
        try {
            SecretKeySpec llllllllllllllIllIIllIlIlIIIIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIllIlIIllllIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllIIllIlIIlllllll = Cipher.getInstance("Blowfish");
            llllllllllllllIllIIllIlIIlllllll.init(lIllIIIIIlIlI[4], llllllllllllllIllIIllIlIlIIIIIII);
            return new String(llllllllllllllIllIIllIlIIlllllll.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIllIlIIllllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllIIllIlIIllllllI) {
            llllllllllllllIllIIllIlIIllllllI.printStackTrace();
            return null;
        }
    }

    private static boolean llIIIlIIIIIIIIl(int n) {
        return n == 0;
    }

    private static boolean llIIIlIIIIIIIll(int n, int n2) {
        return n > n2;
    }

    private static boolean llIIIlIIIIIIllI(int n, int n2) {
        return n <= n2;
    }

    private static boolean llIIIlIIIIIIlII(Object object) {
        return object == null;
    }

    private static boolean llIIIlIIIIIIlIl(int n, int n2) {
        return n >= n2;
    }

    public boolean run() {
        TileObject llllllllllllllIllIIllIlIlIIlIlll;
        k llllllllllllllIllIIllIlIlIIllIIl;
        if (k.llIIIlIIIIIIIIl(this.K.fastTickChop() ? 1 : 0)) {
            return lIllIIIIIlIlI[0];
        }
        if (!k.llIIIlIIIIIIIIl(Bank.isOpen() ? 1 : 0) || k.llIIIlIIIIIIIlI(Inventory.isFull() ? 1 : 0)) {
            return lIllIIIIIlIlI[0];
        }
        if (k.llIIIlIIIIIIIlI(llllllllllllllIllIIllIlIlIIllIIl.L.p() ? 1 : 0)) {
            return lIllIIIIIlIlI[0];
        }
        if (!k.llIIIlIIIIIIIll(Movement.getRunEnergy(), lIllIIIIIlIlI[1]) || k.llIIIlIIIIIIIIl(Movement.isRunEnabled() ? 1 : 0)) {
            return lIllIIIIIlIlI[0];
        }
        Player llllllllllllllIllIIllIlIlIIllIII = Players.getLocal();
        if (k.llIIIlIIIIIIlII(llllllllllllllIllIIllIlIlIIllIII)) {
            return lIllIIIIIlIlI[0];
        }
        WorldArea[] worldAreaArray = new WorldArea[lIllIIIIIlIlI[2]];
        worldAreaArray[k.lIllIIIIIlIlI[0]] = llllllllllllllIllIIllIlIlIIllIIl.L.j();
        if (k.llIIIlIIIIIIIlI(llllllllllllllIllIIllIlIlIIllIII.getWorldLocation().isInArea(worldAreaArray) ? 1 : 0) && k.llIIIlIIIIIIIIl(Movement.isRunEnabled() ? 1 : 0)) {
            Movement.toggleRun();
        }
        if (k.llIIIlIIIIIIlII(llllllllllllllIllIIllIlIlIIlIlll = TileObjects.getNearest(tileObject -> {
            int n;
            if (k.llIIIlIIIIIIIlI(tileObject.getName().equals(this.K.tree().r() + " tree") ? 1 : 0)) {
                String[] stringArray = new String[lIllIIIIIlIlI[2]];
                stringArray[k.lIllIIIIIlIlI[0]] = lIllIIIIIlIIl[lIllIIIIIlIlI[1]];
                if (k.llIIIlIIIIIIIlI(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n = lIllIIIIIlIlI[2];
                    0;
                    if (-(3 ^ 0x54 ^ (0x3E ^ 0x6D)) < 0) return n != 0;
                    return ((156 + 13 - 92 + 117 ^ 3 + 69 - 24 + 82) & (0x74 ^ 0x1D ^ (0x5C ^ 0x75) ^ -1)) != 0;
                }
            }
            n = lIllIIIIIlIlI[0];
            return n != 0;
        }))) {
            return lIllIIIIIlIlI[0];
        }
        i llllllllllllllIllIIllIlIlIIlIllI = i.b(llllllllllllllIllIIllIlIlIIlIlll);
        if (k.llIIIlIIIIIIlII((Object)llllllllllllllIllIIllIlIlIIlIllI)) {
            Log.info((String)lIllIIIIIlIIl[lIllIIIIIlIlI[0]]);
            return lIllIIIIIlIlI[0];
        }
        if (k.llIIIlIIIIIIlIl(llllllllllllllIllIIllIlIlIIllIIl.L.q(), lIllIIIIIlIlI[3]) && k.llIIIlIIIIIIIIl(llllllllllllllIllIIllIlIlIIllIIl.K.bank() ? 1 : 0) && k.llIIIlIIIIIIllI(llllllllllllllIllIIllIlIlIIlIlll.distanceTo((Locatable)llllllllllllllIllIIllIlIlIIllIII), llllllllllllllIllIIllIlIlIIllIIl.L.m()) && k.llIIIlIIIIIIIIl(llllllllllllllIllIIllIlIlIIllIII.isMoving() ? 1 : 0) && k.llIIIlIIIIIIIlI(Inventory.contains(item -> item.getName().contains(this.K.tree().r())) ? 1 : 0)) {
            Log.info((String)lIllIIIIIlIIl[lIllIIIIIlIlI[2]]);
            llllllllllllllIllIIllIlIlIIlIlll.interact(lIllIIIIIlIIl[lIllIIIIIlIlI[4]]);
            return lIllIIIIIlIlI[2];
        }
        if (k.llIIIlIIIIIIlIl(llllllllllllllIllIIllIlIlIIlIlll.distanceTo((Locatable)llllllllllllllIllIIllIlIlIIllIII), llllllllllllllIllIIllIlIlIIllIIl.L.m())) {
            return lIllIIIIIlIlI[0];
        }
        if (k.llIIIlIIIIIIIlI(llllllllllllllIllIIllIlIlIIllIIl.L.b() ? 1 : 0)) {
            llllllllllllllIllIIllIlIlIIlIlll.interact(lIllIIIIIlIIl[lIllIIIIIlIlI[5]]);
            llllllllllllllIllIIllIlIlIIllIIl.sleep(lIllIIIIIlIlI[2]);
            return lIllIIIIIlIlI[2];
        }
        return lIllIIIIIlIlI[0];
    }
}

