/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Item
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.items.Inventory
 */
package u.i.r.d.s.e.r.q.y.a.h.-;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.hydra.SquireAlchemicalHydraConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Item;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;
import u.i.r.d.s.e.r.q.y.a.h.-.a;

@TaskDesc(name="Eating", priority=10)
public class r
extends Task {
    private final /* synthetic */ a av;
    private static /* synthetic */ int[] llllIlIIllIl;
    private final /* synthetic */ SquireAlchemicalHydraConfig aw;
    private static /* synthetic */ String[] llllIlIIllII;

    private static boolean lIIlIIIIlIlllll(int n2, int n3) {
        return n2 > n3;
    }

    @Inject
    public r(a a2, SquireAlchemicalHydraConfig squireAlchemicalHydraConfig) {
        this.av = a2;
        this.aw = squireAlchemicalHydraConfig;
    }

    private static void lIIlIIIIlIlllII() {
        llllIlIIllII = new String[llllIlIIllIl[3]];
        r.llllIlIIllII[r.llllIlIIllIl[0]] = r.lIIlIIIIlIllIlI("iRpk+eojotM=", "tfpdG");
        r.llllIlIIllII[r.llllIlIIllIl[2]] = r.lIIlIIIIlIllIll("r5AMezSgCFM=", "vQXxG");
    }

    private static String lIIlIIIIlIllIll(String lllllllllllllllIIlIlIIlIIlIIllII, String lllllllllllllllIIlIlIIlIIlIIllIl) {
        try {
            SecretKeySpec lllllllllllllllIIlIlIIlIIlIlIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIlIIlIIlIIllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIlIlIIlIIlIlIIII = Cipher.getInstance("Blowfish");
            lllllllllllllllIIlIlIIlIIlIlIIII.init(llllIlIIllIl[3], lllllllllllllllIIlIlIIlIIlIlIIIl);
            return new String(lllllllllllllllIIlIlIIlIIlIlIIII.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIlIIlIIlIIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIlIlIIlIIlIIllll) {
            lllllllllllllllIIlIlIIlIIlIIllll.printStackTrace();
            return null;
        }
    }

    static {
        r.lIIlIIIIlIlllIl();
        r.lIIlIIIIlIlllII();
    }

    private static void lIIlIIIIlIlllIl() {
        llllIlIIllIl = new int[5];
        r.llllIlIIllIl[0] = (0x3A ^ 0x3F ^ (0x14 ^ 2)) & (0x8D ^ 0x83 ^ (0x79 ^ 0x64) ^ -" ".length());
        r.llllIlIIllIl[1] = 72 + 91 - -29 + 0 ^ 10 + 71 - -60 + 55;
        r.llllIlIIllIl[2] = " ".length();
        r.llllIlIIllIl[3] = "  ".length();
        r.llllIlIIllIl[4] = 0x2D ^ 0x3E ^ (0xDC ^ 0xC7);
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        r lllllllllllllllIIlIlIIlIIlIlIlll;
        if (r.lIIlIIIIlIllllI(this.av.g() ? 1 : 0)) {
            return llllIlIIllIl[0];
        }
        if (r.lIIlIIIIlIlllll(Combat.getCurrentHealth(), lllllllllllllllIIlIlIIlIIlIlIlll.aw.eatAt())) {
            return llllIlIIllIl[0];
        }
        Item lllllllllllllllIIlIlIIlIIlIlIllI = Inventory.getFirst(item -> {
            String[] stringArray = new String[llllIlIIllIl[2]];
            stringArray[r.llllIlIIllIl[0]] = llllIlIIllII[llllIlIIllIl[2]];
            return item.hasAction(stringArray);
        });
        if (r.lIIlIIIIllIIIII(lllllllllllllllIIlIlIIlIIlIlIllI)) {
            return llllIlIIllIl[0];
        }
        var1_1.interact(llllIlIIllII[llllIlIIllIl[0]]);
        this.sleep(llllIlIIllIl[1]);
        return llllIlIIllIl[2];
    }

    private static boolean lIIlIIIIllIIIII(Object object) {
        return object == null;
    }

    private static String lIIlIIIIlIllIlI(String lllllllllllllllIIlIlIIlIIlIIIIIl, String lllllllllllllllIIlIlIIlIIlIIIIII) {
        try {
            SecretKeySpec lllllllllllllllIIlIlIIlIIlIIIlII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIlIIlIIlIIIIII.getBytes(StandardCharsets.UTF_8)), llllIlIIllIl[4]), "DES");
            Cipher lllllllllllllllIIlIlIIlIIlIIIIll = Cipher.getInstance("DES");
            lllllllllllllllIIlIlIIlIIlIIIIll.init(llllIlIIllIl[3], lllllllllllllllIIlIlIIlIIlIIIlII);
            return new String(lllllllllllllllIIlIlIIlIIlIIIIll.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIlIIlIIlIIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIlIlIIlIIlIIIIlI) {
            lllllllllllllllIIlIlIIlIIlIIIIlI.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIIIIlIllllI(int n2) {
        return n2 == 0;
    }
}

