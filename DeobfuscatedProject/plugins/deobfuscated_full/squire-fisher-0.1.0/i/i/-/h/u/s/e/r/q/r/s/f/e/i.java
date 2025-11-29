/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Inventory
 */
package i.i.-.h.u.s.e.r.q.r.s.f.e;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.fishing.SquireFisherConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;

/* TASK: Opening the barrel -> OpeningthebarrelTask */
@TaskDesc(name="Opening the barrel")
public class i
extends Task {
    private static final /* synthetic */ int M;
    private final /* synthetic */ SquireFisherConfig N;
    private static /* synthetic */ String[] lIlllIlIllII;
    private static /* synthetic */ int[] lIlllIlIllIl;

    private static String lllIlIllIIllll(String var4, String var2) {
        try {
            SecretKeySpec var3 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var2.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var7 = Cipher.getInstance("Blowfish");
            var7.init(lIlllIlIllIl[4], var3);
            return new String(var7.doFinal(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var6) {
            var6.printStackTrace();
            return null;
        }
    }

    static {
        i.lllIlIllIlIIIl();
        i.lllIlIllIlIIII();
        M = lIlllIlIllIl[3];
    }

    public boolean run() {
        i var1;
        if (i.lllIlIllIlIIlI(this.N.fishBarrel() ? 1 : 0)) {
            return lIlllIlIllIl[0];
        }
        if (!i.lllIlIllIlIIlI(var1.N.fishingTrawler() ? 1 : 0) || i.lllIlIllIlIIll(var1.N.fish().h().equals(lIlllIlIllII[lIlllIlIllIl[0]]) ? 1 : 0)) {
            return lIlllIlIllIl[0];
        }
        if (i.lllIlIllIlIIll(Bank.isOpen() ? 1 : 0)) {
            return lIlllIlIllIl[0];
        }
        int[] nArray = new int[lIlllIlIllIl[1]];
        nArray[i.lIlllIlIllIl[0]] = lIlllIlIllIl[2];
        Item var5 = Inventory.getFirst((int[])nArray);
        if (i.lllIlIllIlIlII(var5)) {
            var5.interact(lIlllIlIllII[lIlllIlIllIl[1]]);
            return lIlllIlIllIl[1];
        }
        return lIlllIlIllIl[0];
    }

    private static boolean lllIlIllIlIIlI(int n) {
        return n == 0;
    }

    private static void lllIlIllIlIIII() {
        lIlllIlIllII = new String[lIlllIlIllIl[4]];
        i.lIlllIlIllII[i.lIlllIlIllIl[0]] = i."Barbarian Fishing";
        i.lIlllIlIllII[i.lIlllIlIllIl[1]] = i."Open";
    }

    private static boolean lllIlIllIlIlII(Object object) {
        return object != null;
    }

    private static void lllIlIllIlIIIl() {
        lIlllIlIllIl = new int[5];
        i.lIlllIlIllIl[0] = (0x54 ^ 4) & ~(0xEF ^ 0xBF);
        i.lIlllIlIllIl[1] = 1;
        i.lIlllIlIllIl[2] = 0xFFFFE7EF & 0x7BFE;
        i.lIlllIlIllIl[3] = -(0xFFFFD95D & 0x77E7) & (0xFFFFFFF6 & 0x7FEF);
        i.lIlllIlIllIl[4] = 2;
    }

    @Inject
    public i(SquireFisherConfig squireFisherConfig) {
        this.N = squireFisherConfig;
    }

    private static boolean lllIlIllIlIIll(int n) {
        return n != 0;
    }
}

