/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.TileItem
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.items.Inventory
 */
package i.i.b.s.c.q.r.s.s.-.u.a.e;

import gg.squire.basics.loot.LooterConfig;
import gg.squire.basics.loot.SquireLooter;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import i.i.b.s.c.q.r.s.s.-.u.a.e.aH;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import java.util.Iterator;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.TileItem;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Looting Head")
public class aM
extends Task {
    private final /* synthetic */ LooterConfig eC;
    private static /* synthetic */ String[] llIIIll;
    private final /* synthetic */ SquireLooter eD;
    private static /* synthetic */ int[] llIIlII;

    public boolean run() {
        aM lllIlIlIIIllllI;
        if (aM.llIIlIIIl(Players.getLocal().isMoving() ? 1 : 0)) {
            return llIIlII[0];
        }
        Iterator<aH> lllIlIlIIIlllIl = lllIlIlIIIllllI.eD.ch().iterator();
        while (aM.llIIlIIIl(lllIlIlIIIlllIl.hasNext() ? 1 : 0)) {
            aH lllIlIlIIIlllII = lllIlIlIIIlllIl.next();
            int[] nArray = new int[llIIlII[1]];
            nArray[aM.llIIlII[0]] = lllIlIlIIIlllII.P();
            TileItem lllIlIlIIIllIll = TileItems.getFirstAt((WorldPoint)lllIlIlIIIlllII.cd(), (int[])nArray);
            if (aM.llIIlIIlI(lllIlIlIIIllIll)) {
                if (aM.llIIlIIll(lllIlIlIIIllIll.distanceTo(Players.getLocal().getWorldLocation()), lllIlIlIIIllllI.eC.lootRange())) {
                    "".length();
                    if (null == null) continue;
                    return ((0x57 ^ 0x63) & ~(0x8F ^ 0xBB)) != 0;
                }
                if (aM.llIIlIlII(Inventory.isFull() ? 1 : 0)) {
                    lllIlIlIIIllIll.interact(llIIIll[llIIlII[0]]);
                }
                if (aM.llIIlIIIl(Inventory.isFull() ? 1 : 0)) {
                    return llIIlII[0];
                }
            }
            "".length();
            if (-" ".length() != " ".length()) continue;
            return ((0x3A ^ 0x69) & ~(0x1D ^ 0x4E)) != 0;
        }
        return llIIlII[1];
    }

    @Inject
    public aM(LooterConfig looterConfig, SquireLooter squireLooter) {
        this.eC = looterConfig;
        this.eD = squireLooter;
    }

    private static boolean llIIlIIIl(int n2) {
        return n2 != 0;
    }

    private static void llIIIllll() {
        llIIIll = new String[llIIlII[1]];
        aM.llIIIll[aM.llIIlII[0]] = aM.llIIIlllI("J6UKXuc11gU=", "jPKNT");
    }

    static {
        aM.llIIlIIII();
        aM.llIIIllll();
    }

    private static void llIIlIIII() {
        llIIlII = new int[3];
        aM.llIIlII[0] = (0xB1 ^ 0x8B) & ~(0xA8 ^ 0x92);
        aM.llIIlII[1] = " ".length();
        aM.llIIlII[2] = "  ".length();
    }

    private static String llIIIlllI(String lllIlIlIIIlIIIl, String lllIlIlIIIlIIII) {
        try {
            SecretKeySpec lllIlIlIIIlIllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllIlIlIIIlIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllIlIlIIIlIlIl = Cipher.getInstance("Blowfish");
            lllIlIlIIIlIlIl.init(llIIlII[2], lllIlIlIIIlIllI);
            return new String(lllIlIlIIIlIlIl.doFinal(Base64.getDecoder().decode(lllIlIlIIIlIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllIlIlIIIlIlII) {
            lllIlIlIIIlIlII.printStackTrace();
            return null;
        }
    }

    private static boolean llIIlIlII(int n2) {
        return n2 == 0;
    }

    private static boolean llIIlIIll(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean llIIlIIlI(Object object) {
        return object != null;
    }
}

