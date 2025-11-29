/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 */
package w.r.e.i.d.r.q.u.e.-.c.u.o.s.o.t.t;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.woodcutting.SquireWoodcutterConfig;
import gg.squire.woodcutting.SquireWoodcutterPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Dropping logs", priority=5, blocking=true)
public class d
extends Task {
    private final /* synthetic */ SquireWoodcutterPlugin z;
    private static /* synthetic */ String[] lIllIIIIlllII;
    private final /* synthetic */ SquireWoodcutterConfig A;
    private static /* synthetic */ int[] lIllIIIIllllI;

    private static boolean llIIIlIIlIIlIll(Object object) {
        return object == null;
    }

    private static void llIIIlIIlIIIlll() {
        lIllIIIIlllII = new String[lIllIIIIllllI[1]];
        d.lIllIIIIlllII[d.lIllIIIIllllI[0]] = d."Logs";
    }

    static {
        d.llIIIlIIlIIlIII();
        d.llIIIlIIlIIIlll();
    }

    private static boolean llIIIlIIlIIlIlI(int n) {
        return n != 0;
    }

    private static void llIIIlIIlIIlIII() {
        lIllIIIIllllI = new int[3];
        d.lIllIIIIllllI[0] = 3 & (3 ^ -1);
        d.lIllIIIIllllI[1] = 1;
        d.lIllIIIIllllI[2] = 2;
    }

    public boolean run() {
        d llllllllllllllIllIIllIIIllIIIIlI;
        if (!d.llIIIlIIlIIlIIl(this.A.bank() ? 1 : 0) || !d.llIIIlIIlIIlIIl(this.A.fastTickChop() ? 1 : 0) || d.llIIIlIIlIIlIlI(this.A.cutLogs() ? 1 : 0)) {
            return lIllIIIIllllI[0];
        }
        TileObject llllllllllllllIllIIllIIIllIIIIIl = TileObjects.getNearest(tileObject -> tileObject.getName().contains(this.A.tree().r()));
        Predicate<Item> llllllllllllllIllIIllIIIllIIIIII = item -> {
            boolean bl;
            if (!d.llIIIlIIlIIlIIl(item.getName().toLowerCase().contains(this.A.tree().r().toLowerCase()) ? 1 : 0) || d.llIIIlIIlIIlIlI(item.getName().equals(lIllIIIIlllII[lIllIIIIllllI[0]]) ? 1 : 0)) {
                bl = lIllIIIIllllI[1];
                0;
                if ((0xA7 ^ 0xA3) > (0xAA ^ 0xAE)) {
                    return ((0x40 ^ 0x7B) & ~(0x8D ^ 0xB6)) != 0;
                }
            } else {
                bl = lIllIIIIllllI[0];
            }
            return bl;
        };
        if (!d.llIIIlIIlIIlIIl(Inventory.isFull() ? 1 : 0) || d.llIIIlIIlIIlIll(llllllllllllllIllIIllIIIllIIIIIl)) {
            Item llllllllllllllIllIIllIIIlIllllll = Inventory.getFirst(llllllllllllllIllIIllIIIllIIIIII);
            if (d.llIIIlIIlIIlIll(llllllllllllllIllIIllIIIlIllllll)) {
                return lIllIIIIllllI[0];
            }
            Inventory.dropAll(llllllllllllllIllIIllIIIllIIIIII);
            0;
            return lIllIIIIllllI[1];
        }
        return lIllIIIIllllI[0];
    }

    private static String llIIIlIIlIIIIll(String llllllllllllllIllIIllIIIlIllIIll, String llllllllllllllIllIIllIIIlIllIIlI) {
        try {
            SecretKeySpec llllllllllllllIllIIllIIIlIllIllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIllIIIlIllIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllIIllIIIlIllIlIl = Cipher.getInstance("Blowfish");
            llllllllllllllIllIIllIIIlIllIlIl.init(lIllIIIIllllI[2], llllllllllllllIllIIllIIIlIllIllI);
            return new String(llllllllllllllIllIIllIIIlIllIlIl.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIllIIIlIllIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllIIllIIIlIllIlII) {
            llllllllllllllIllIIllIIIlIllIlII.printStackTrace();
            return null;
        }
    }

    private static boolean llIIIlIIlIIlIIl(int n) {
        return n == 0;
    }

    @Inject
    public d(SquireWoodcutterPlugin squireWoodcutterPlugin, SquireWoodcutterConfig squireWoodcutterConfig) {
        this.z = squireWoodcutterPlugin;
        this.A = squireWoodcutterConfig;
    }
}

