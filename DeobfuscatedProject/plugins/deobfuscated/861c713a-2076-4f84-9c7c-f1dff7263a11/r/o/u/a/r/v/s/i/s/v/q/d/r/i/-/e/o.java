/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Item
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 */
package r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.vardorvis.SquireVardorvis;
import gg.squire.vardorvis.SquireVardorvisConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;

@TaskDesc(name="Stamina handler", priority=2137483647)
public class o
extends Task {
    private final /* synthetic */ SquireVardorvisConfig ag;
    private final /* synthetic */ SquireVardorvis af;
    private static /* synthetic */ String[] lIlIlIIIIIIll;
    private static /* synthetic */ int[] lIlIlIIIIIlII;

    @Inject
    o(SquireVardorvis squireVardorvis, SquireVardorvisConfig squireVardorvisConfig) {
        this.af = squireVardorvis;
        this.ag = squireVardorvisConfig;
    }

    private static String lIllllIIlllIlIl(String llllllllllllllIllIllIIlIllIIIIIl, String llllllllllllllIllIllIIlIllIIIIII) {
        try {
            SecretKeySpec llllllllllllllIllIllIIlIllIIIlII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIllIIlIllIIIIII.getBytes(StandardCharsets.UTF_8)), lIlIlIIIIIlII[6]), "DES");
            Cipher llllllllllllllIllIllIIlIllIIIIll = Cipher.getInstance("DES");
            llllllllllllllIllIllIIlIllIIIIll.init(lIlIlIIIIIlII[4], llllllllllllllIllIllIIlIllIIIlII);
            return new String(llllllllllllllIllIllIIlIllIIIIll.doFinal(Base64.getDecoder().decode(llllllllllllllIllIllIIlIllIIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllIllIIlIllIIIIlI) {
            llllllllllllllIllIllIIlIllIIIIlI.printStackTrace();
            return null;
        }
    }

    private static boolean lIllllIIllllIll(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIllllIIllllIlI(int n2) {
        return n2 != 0;
    }

    private static boolean lIllllIIllllIII(Object object) {
        return object == null;
    }

    private static boolean lIllllIIllllIIl(int n2, int n3) {
        return n2 >= n3;
    }

    private static void lIllllIIlllIllI() {
        lIlIlIIIIIIll = new String[lIlIlIIIIIlII[5]];
        o.lIlIlIIIIIIll[o.lIlIlIIIIIlII[0]] = o."Drink";
        o.lIlIlIIIIIIll[o.lIlIlIIIIIlII[3]] = o."Drink";
        o.lIlIlIIIIIIll[o.lIlIlIIIIIlII[4]] = o."Stamina";
    }

    static {
        o.lIllllIIlllIlll();
        o.lIllllIIlllIllI();
    }

    private static String lIllllIIlllIlII(String llllllllllllllIllIllIIlIllIIllII, String llllllllllllllIllIllIIlIllIIllIl) {
        try {
            SecretKeySpec llllllllllllllIllIllIIlIllIlIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIllIIlIllIIllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllIllIIlIllIlIIII = Cipher.getInstance("Blowfish");
            llllllllllllllIllIllIIlIllIlIIII.init(lIlIlIIIIIlII[4], llllllllllllllIllIllIIlIllIlIIIl);
            return new String(llllllllllllllIllIllIIlIllIlIIII.doFinal(Base64.getDecoder().decode(llllllllllllllIllIllIIlIllIIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllIllIIlIllIIllll) {
            llllllllllllllIllIllIIlIllIIllll.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        Item item2 = Inventory.getFirst(item -> item.getName().contains(lIlIlIIIIIIll[lIlIlIIIIIlII[4]]));
        if (o.lIllllIIllllIII(item2)) {
            return lIlIlIIIIIlII[0];
        }
        if (o.lIllllIIllllIIl(Movement.getRunEnergy(), lIlIlIIIIIlII[1])) {
            return lIlIlIIIIIlII[0];
        }
        if (o.lIllllIIllllIlI(Movement.isStaminaBoosted() ? 1 : 0)) {
            if (o.lIllllIIllllIll(Movement.getRunEnergy(), lIlIlIIIIIlII[2])) {
                void llllllllllllllIllIllIIlIllIlIllI;
                llllllllllllllIllIllIIlIllIlIllI.interact(lIlIlIIIIIIll[lIlIlIIIIIlII[0]]);
                return lIlIlIIIIIlII[3];
            }
            return lIlIlIIIIIlII[0];
        }
        item2.interact(lIlIlIIIIIIll[lIlIlIIIIIlII[3]]);
        return lIlIlIIIIIlII[3];
    }

    private static void lIllllIIlllIlll() {
        lIlIlIIIIIlII = new int[7];
        o.lIlIlIIIIIlII[0] = (31 + 1 - -54 + 54 ^ 135 + 156 - 234 + 108) & (0x37 ^ 0x19 ^ (0xA1 ^ 0xA6) ^ -1);
        o.lIlIlIIIIIlII[1] = 0x5E ^ 0x62 ^ (7 ^ 0x25);
        o.lIlIlIIIIIlII[2] = 0xA1 ^ 0xBA ^ (0x3C ^ 0x2D);
        o.lIlIlIIIIIlII[3] = 1;
        o.lIlIlIIIIIlII[4] = 2;
        o.lIlIlIIIIIlII[5] = 3;
        o.lIlIlIIIIIlII[6] = 0x24 ^ 0x2C;
    }
}

