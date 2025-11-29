/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.EquipmentInventorySlot
 *  net.runelite.api.Player
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Equipment
 */
package u.t.e.e.g.q.r.d.h.r.i.i.n.i.i.-.s.-.f.s.f.-.t.n;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
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
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Equipment;

@TaskDesc(name="Stop Diving", priority=40, blocking=true)
public class j
extends Task {
    private final /* synthetic */ SquireDriftNet Q;
    private final /* synthetic */ Client R;
    private /* synthetic */ Player r;
    private static /* synthetic */ String[] lIlIIIIlIlIl;
    private static /* synthetic */ int[] lIlIIIIlIllI;

    private static String llIlIlIIIIIIII(String lllllllllllllllIlllIIlllIIIIlllI, String lllllllllllllllIlllIIlllIIIIlIll) {
        try {
            SecretKeySpec lllllllllllllllIlllIIlllIIIlIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlllIIlllIIIIlIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlllIIlllIIIlIIII = Cipher.getInstance("Blowfish");
            lllllllllllllllIlllIIlllIIIlIIII.init(lIlIIIIlIllI[2], lllllllllllllllIlllIIlllIIIlIIIl);
            return new String(lllllllllllllllIlllIIlllIIIlIIII.doFinal(Base64.getDecoder().decode(lllllllllllllllIlllIIlllIIIIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlllIIlllIIIIllll) {
            lllllllllllllllIlllIIlllIIIIllll.printStackTrace();
            return null;
        }
    }

    private static void llIlIlIIIIIIIl() {
        lIlIIIIlIlIl = new String[lIlIIIIlIllI[2]];
        j.lIlIIIIlIlIl[j.lIlIIIIlIllI[0]] = j.llIlIIllllllll("sHVqK7wjJWE1/pLRm0ffxg==", "BoFiY");
        j.lIlIIIIlIlIl[j.lIlIIIIlIllI[1]] = j.llIlIlIIIIIIII("xFgajuIt7BE=", "UiNGy");
    }

    private static String llIlIIllllllll(String lllllllllllllllIlllIIlllIIIIIIIl, String lllllllllllllllIlllIIlllIIIIIIII) {
        try {
            SecretKeySpec lllllllllllllllIlllIIlllIIIIIlII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlllIIlllIIIIIIII.getBytes(StandardCharsets.UTF_8)), lIlIIIIlIllI[3]), "DES");
            Cipher lllllllllllllllIlllIIlllIIIIIIll = Cipher.getInstance("DES");
            lllllllllllllllIlllIIlllIIIIIIll.init(lIlIIIIlIllI[2], lllllllllllllllIlllIIlllIIIIIlII);
            return new String(lllllllllllllllIlllIIlllIIIIIIll.doFinal(Base64.getDecoder().decode(lllllllllllllllIlllIIlllIIIIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlllIIlllIIIIIIlI) {
            lllllllllllllllIlllIIlllIIIIIIlI.printStackTrace();
            return null;
        }
    }

    private static boolean llIlIlIIIIIIll(int n) {
        return n != 0;
    }

    private static void llIlIlIIIIIIlI() {
        lIlIIIIlIllI = new int[4];
        j.lIlIIIIlIllI[0] = (0x5E ^ 1) & ~(7 ^ 0x58);
        j.lIlIIIIlIllI[1] = " ".length();
        j.lIlIIIIlIllI[2] = "  ".length();
        j.lIlIIIIlIllI[3] = 0x2E ^ 0x26;
    }

    private static boolean llIlIlIIIIIlIl(int n, int n2) {
        return n != n2;
    }

    static {
        j.llIlIlIIIIIIlI();
        j.llIlIlIIIIIIIl();
    }

    public boolean run() {
        j lllllllllllllllIlllIIlllIIIlIlll;
        if (j.llIlIlIIIIIIll(this.R.isInInstancedRegion() ? 1 : 0)) {
            return lIlIIIIlIllI[0];
        }
        lllllllllllllllIlllIIlllIIIlIlll.r = Players.getLocal();
        if (!j.llIlIlIIIIIlII(lllllllllllllllIlllIIlllIIIlIlll.r) || j.llIlIlIIIIIlIl(lllllllllllllllIlllIIlllIIIlIlll.r.getPlane(), lIlIIIIlIllI[1])) {
            return lIlIIIIlIllI[0];
        }
        String[] stringArray = new String[lIlIIIIlIllI[1]];
        stringArray[j.lIlIIIIlIllI[0]] = lIlIIIIlIlIl[lIlIIIIlIllI[0]];
        TileObject lllllllllllllllIlllIIlllIIIlIllI = TileObjects.getNearest((String[])stringArray);
        if (j.llIlIlIIIIIlII(lllllllllllllllIlllIIlllIIIlIllI) && j.llIlIlIIIIIlII(Equipment.fromSlot((EquipmentInventorySlot)EquipmentInventorySlot.WEAPON))) {
            lllllllllllllllIlllIIlllIIIlIllI.interact(lIlIIIIlIlIl[lIlIIIIlIllI[1]]);
            return lIlIIIIlIllI[1];
        }
        return lIlIIIIlIllI[0];
    }

    @Inject
    public j(SquireDriftNet squireDriftNet, Client client) {
        this.Q = squireDriftNet;
        this.R = client;
    }

    private static boolean llIlIlIIIIIlII(Object object) {
        return object != null;
    }
}

