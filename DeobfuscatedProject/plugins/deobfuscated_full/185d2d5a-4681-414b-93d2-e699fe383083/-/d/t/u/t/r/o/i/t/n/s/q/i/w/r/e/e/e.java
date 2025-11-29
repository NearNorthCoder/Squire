/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.movement.Movement
 */
package -.d.t.u.t.r.o.i.t.n.s.q.i.w.r.e.e;

import -.d.t.u.t.r.o.i.t.n.s.q.i.w.r.e.e.b;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.wintertodt.SquireWintertodtConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Movement;

/* TASK: Entering Wintertodt Area -> EnteringwintertodtareaTask */
@TaskDesc(name="Entering Wintertodt Area", priority=1)
public class e
extends Task {
    private static /* synthetic */ int[] lIlIlllllIlll;
    private final /* synthetic */ b B;
    private static final /* synthetic */ WorldPoint A;
    private static final /* synthetic */ int z;
    private final /* synthetic */ SquireWintertodtConfig C;
    private static /* synthetic */ String[] lIlIlllllIlIl;

    @Inject
    public e(b b2, SquireWintertodtConfig squireWintertodtConfig) {
        this.B = b2;
        this.C = squireWintertodtConfig;
    }

    private static boolean llIIIIllIllIIll(int n2) {
        return n2 != 0;
    }

    private static void llIIIIllIlIlllI() {
        lIlIlllllIlIl = new String[lIlIlllllIlll[1]];
        e.lIlIlllllIlIl[e.lIlIlllllIlll[0]] = e."Enter";
    }

    static {
        e.llIIIIllIllIIlI();
        e.llIIIIllIlIlllI();
        z = lIlIlllllIlll[2];
        A = new WorldPoint(lIlIlllllIlll[4], lIlIlllllIlll[5], lIlIlllllIlll[0]);
    }

    private static void llIIIIllIllIIlI() {
        lIlIlllllIlll = new int[7];
        e.lIlIlllllIlll[0] = (0x24 ^ 0x7F) & ~(0xF9 ^ 0xA2);
        e.lIlIlllllIlll[1] = 1;
        e.lIlIlllllIlll[2] = 0xFFFFF78E & 0x7AFB;
        e.lIlIlllllIlll[3] = 2;
        e.lIlIlllllIlll[4] = 0xFFFF9FDE & 0x667F;
        e.lIlIlllllIlll[5] = 0xFFFFFFFF & 0xF7B;
        e.lIlIlllllIlll[6] = 0xE8 ^ 0x99 ^ (0xCB ^ 0xB2);
    }

    private static String llIIIIllIlIllIl(String var1, String var4) {
        try {
            SecretKeySpec var7 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var4.getBytes(StandardCharsets.UTF_8)), lIlIlllllIlll[6]), "DES");
            Cipher var5 = Cipher.getInstance("DES");
            var5.init(lIlIlllllIlll[3], var7);
            return new String(var5.doFinal(Base64.getDecoder().decode(var1.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var3) {
            var3.printStackTrace();
            return null;
        }
    }

    private static boolean llIIIIllIllIlII(Object object) {
        return object == null;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        if (!e.llIIIIllIllIIll(Movement.shouldWalk() ? 1 : 0) || e.llIIIIllIllIIll(this.B.i() ? 1 : 0)) {
            return lIlIlllllIlll[0];
        }
        int[] nArray = new int[lIlIlllllIlll[1]];
        nArray[e.lIlIlllllIlll[0]] = lIlIlllllIlll[2];
        TileObject var6 = TileObjects.getNearest((int[])nArray);
        if (e.llIIIIllIllIlII(var6)) {
            e var2;
            Movement.walk((WorldPoint)A);
            var2.sleep(lIlIlllllIlll[1]);
            return lIlIlllllIlll[0];
        }
        var1_1.interact(lIlIlllllIlIl[lIlIlllllIlll[0]]);
        this.sleep(lIlIlllllIlll[3]);
        return lIlIlllllIlll[1];
    }
}

