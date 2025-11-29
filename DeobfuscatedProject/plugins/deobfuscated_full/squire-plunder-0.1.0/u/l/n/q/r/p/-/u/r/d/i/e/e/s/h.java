/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 */
package u.l.n.q.r.p.-.u.r.d.i.e.e.s;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;

/* TASK: Passing Trap -> PassingtrapTask */
@TaskDesc(name="Passing Trap", priority=15)
public class h
extends Task {
    private static /* synthetic */ int[] llllllIlllll;
    private static /* synthetic */ String[] llllllIllllI;
    private final /* synthetic */ Client B;

    private static String lIIlIlIIlIlIlll(String var10, String var1) {
        try {
            SecretKeySpec var4 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var1.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var9 = Cipher.getInstance("Blowfish");
            var9.init(llllllIlllll[4], var4);
            return new String(var9.doFinal(Base64.getDecoder().decode(var10.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var2) {
            var2.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIlIIlIlllIl(Object object) {
        return object == null;
    }

    private static boolean lIIlIlIIlIllIlI(int n2) {
        return n2 == 0;
    }

    private static boolean lIIlIlIIlIllIll(int n2, int n3) {
        return n2 != n3;
    }

    private static void lIIlIlIIlIllIIl() {
        llllllIlllll = new int[7];
        h.llllllIlllll[0] = 0xFFFFDBFF & 0x2D3D;
        h.llllllIlllll[1] = 3 & ~3;
        h.llllllIlllll[2] = -(0xFFFFCFE3 & 0x713F) & (0xFFFFFFEF & 0x5F77);
        h.llllllIlllll[3] = 1;
        h.llllllIlllll[4] = 2;
        h.llllllIlllll[5] = 3;
        h.llllllIlllll[6] = 0x50 ^ 0x58;
    }

    private static void lIIlIlIIlIllIII() {
        llllllIllllI = new String[llllllIlllll[5]];
        h.llllllIllllI[h.llllllIlllll[1]] = h."Pass";
        h.llllllIllllI[h.llllllIlllll[3]] = h."Speartrap";
        h.llllllIllllI[h.llllllIlllll[4]] = h."Pass";
    }

    static {
        h.lIIlIlIIlIllIIl();
        h.lIIlIlIIlIllIII();
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        if (h.lIIlIlIIlIllIlI(this.B.getVarbitValue(llllllIlllll[0]))) {
            return llllllIlllll[1];
        }
        if (h.lIIlIlIIlIllIll(Players.getLocal().getWorldLocation().getRegionID(), llllllIlllll[2])) {
            return llllllIlllll[1];
        }
        if (!h.lIIlIlIIlIllIlI(Players.getLocal().isMoving() ? 1 : 0) || h.lIIlIlIIlIlllII(Players.getLocal().isAnimating() ? 1 : 0)) {
            return llllllIlllll[1];
        }
        TileObject var11 = TileObjects.getNearest(tileObject -> {
            int n2;
            if (h.lIIlIlIIlIlllII(tileObject.getName().contains(llllllIllllI[llllllIlllll[3]]) ? 1 : 0)) {
                String[] stringArray = new String[llllllIlllll[3]];
                stringArray[h.llllllIlllll[1]] = llllllIllllI[llllllIlllll[4]];
                if (h.lIIlIlIIlIlllII(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = llllllIlllll[3];
                    0;
                    if ((0x2F ^ 0x38 ^ (0xBF ^ 0xAC)) != 0) return n2 != 0;
                    return false;
                }
            }
            n2 = llllllIlllll[1];
            return n2 != 0;
        });
        if (h.lIIlIlIIlIlllIl(var11)) {
            return llllllIlllll[1];
        }
        var1_1.interact(llllllIllllI[llllllIlllll[1]]);
        return llllllIlllll[3];
    }

    @Inject
    public h(Client client) {
        this.B = client;
    }

    private static String lIIlIlIIlIlIllI(String var7, String var5) {
        try {
            SecretKeySpec var6 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var5.getBytes(StandardCharsets.UTF_8)), llllllIlllll[6]), "DES");
            Cipher var3 = Cipher.getInstance("DES");
            var3.init(llllllIlllll[4], var6);
            return new String(var3.doFinal(Base64.getDecoder().decode(var7.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIlIIlIlllII(int n2) {
        return n2 != 0;
    }
}

