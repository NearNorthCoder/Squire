/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.client.Static
 */
package m.e.i.q.u.r.-.n.s.e.r.i;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.mining.SquireMinerConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import m.e.i.q.u.r.-.n.s.e.r.i.a;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.client.Static;

@TaskDesc(name="Depositing into grinder")
public class I
extends Task {
    private final /* synthetic */ SquireMinerConfig ag;
    private static /* synthetic */ String[] lllllIIllIll;
    private static /* synthetic */ int[] lllllIIlllII;
    private /* synthetic */ int ah;

    private static boolean lIIlIIlIlllllIl(Object object) {
        return object != null;
    }

    private static boolean lIIlIIlIllllIll(int n2) {
        return n2 == 0;
    }

    private static void lIIlIIlIllllIII() {
        lllllIIlllII = new int[5];
        I.lllllIIlllII[0] = (0x8F ^ 0xC0) & ~(0x45 ^ 0xA);
        I.lllllIIlllII[1] = 0x6B ^ 0x7F ^ (0x56 ^ 0x46);
        I.lllllIIlllII[2] = 1;
        I.lllllIIlllII[3] = 2;
        I.lllllIIlllII[4] = 0xAD ^ 0x95 ^ (0x55 ^ 0x65);
    }

    private static boolean lIIlIIlIllllIlI(int n2) {
        return n2 != 0;
    }

    private static String lIIlIIlIlllIllI(String lllllllllllllllIIlIIlIllIllIlIll, String lllllllllllllllIIlIIlIllIllIlIlI) {
        try {
            SecretKeySpec lllllllllllllllIIlIIlIllIllIlllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIIlIllIllIlIlI.getBytes(StandardCharsets.UTF_8)), lllllIIlllII[4]), "DES");
            Cipher lllllllllllllllIIlIIlIllIllIllIl = Cipher.getInstance("DES");
            lllllllllllllllIIlIIlIllIllIllIl.init(lllllIIlllII[3], lllllllllllllllIIlIIlIllIllIlllI);
            return new String(lllllllllllllllIIlIIlIllIllIllIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIIlIllIllIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIlIIlIllIllIllII) {
            lllllllllllllllIIlIIlIllIllIllII.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIIlIlllllII(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean lIIlIIlIllllIIl(Object object, Object object2) {
        return object != object2;
    }

    public boolean run() {
        I lllllllllllllllIIlIIlIllIlllIlIl;
        if (I.lIIlIIlIllllIIl((Object)this.ag.activity(), (Object)a.SANDSTONE)) {
            return lllllIIlllII[0];
        }
        if (!I.lIIlIIlIllllIlI(lllllllllllllllIIlIIlIllIlllIlIl.ag.deposit() ? 1 : 0) || I.lIIlIIlIllllIll(Inventory.isFull() ? 1 : 0)) {
            return lllllIIlllII[0];
        }
        int lllllllllllllllIIlIIlIllIlllIlII = Static.getClient().getTickCount();
        if (I.lIIlIIlIlllllII(lllllllllllllllIIlIIlIllIlllIlII - lllllllllllllllIIlIIlIllIlllIlIl.ah, lllllIIlllII[1])) {
            return lllllIIlllII[2];
        }
        if (I.lIIlIIlIllllIlI(Movement.isRunEnabled() ? 1 : 0)) {
            Movement.toggleRun();
            return lllllIIlllII[2];
        }
        String[] stringArray = new String[lllllIIlllII[2]];
        stringArray[I.lllllIIlllII[0]] = lllllIIllIll[lllllIIlllII[0]];
        TileObject lllllllllllllllIIlIIlIllIlllIIll = TileObjects.getNearest((String[])stringArray);
        if (I.lIIlIIlIlllllIl(lllllllllllllllIIlIIlIllIlllIIll) && I.lIIlIIlIllllIll(Players.getLocal().isMoving() ? 1 : 0)) {
            lllllllllllllllIIlIIlIllIlllIIll.interact(lllllIIllIll[lllllIIlllII[2]]);
            lllllllllllllllIIlIIlIllIlllIlIl.ah = lllllllllllllllIIlIIlIllIlllIlII;
        }
        return lllllIIlllII[2];
    }

    static {
        I.lIIlIIlIllllIII();
        I.lIIlIIlIlllIlll();
    }

    private static void lIIlIIlIlllIlll() {
        lllllIIllIll = new String[lllllIIlllII[3]];
        I.lllllIIllIll[I.lllllIIlllII[0]] = I."Grinder";
        I.lllllIIllIll[I.lllllIIlllII[2]] = I."Deposit";
    }

    @Inject
    public I(SquireMinerConfig squireMinerConfig) {
        this.ag = squireMinerConfig;
    }
}

