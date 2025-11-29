/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Locatable
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.movement.Reachable
 */
package q.s.-.i.r.e.r.w.r.s.o.u.b.a;

import gg.squire.barrows.SquireBarrows;
import gg.squire.barrows.SquireBarrowsConfig;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Locatable;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Reachable;

/* TASK: Opening chest -> OpeningchestTask */
@TaskDesc(name="Opening chest", priority=220, blocking=true)
public class y
extends Task {
    private final /* synthetic */ SquireBarrows an;
    private final /* synthetic */ SquireBarrowsConfig ao;
    private static /* synthetic */ int[] llllIIIIlII;
    private static /* synthetic */ String[] llllIIIIIll;

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        if (y.lIllIIllIIIlII(this.an.h() ? 1 : 0)) {
            return llllIIIIlII[0];
        }
        String[] stringArray = new String[llllIIIIlII[1]];
        stringArray[y.llllIIIIlII[0]] = llllIIIIIll[llllIIIIlII[0]];
        TileObject var3 = TileObjects.getNearest((String[])stringArray);
        if (y.lIllIIllIIIlIl(var3)) {
            return llllIIIIlII[0];
        }
        String[] stringArray2 = new String[llllIIIIlII[1]];
        stringArray2[y.llllIIIIlII[0]] = llllIIIIIll[llllIIIIlII[1]];
        if (!y.lIllIIllIIIllI(var3.hasAction(stringArray2) ? 1 : 0) || !y.lIllIIllIIIllI(Reachable.isInteractable((Locatable)var3) ? 1 : 0) || y.lIllIIllIIIlll(var3.distanceTo(Players.getLocal().getWorldLocation()), llllIIIIlII[2])) {
            return llllIIIIlII[0];
        }
        var1_1.interact(llllIIIIIll[llllIIIIlII[3]]);
        return llllIIIIlII[1];
    }

    private static boolean lIllIIllIIIlIl(Object object) {
        return object == null;
    }

    private static boolean lIllIIllIIlIII(int n2, int n3) {
        return n2 < n3;
    }

    private static String lIllIIllIIIIIl(String var12, String var10) {
        var12 = new String(Base64.getDecoder().decode(var12.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var4 = new StringBuilder();
        char[] var13 = var10.toCharArray();
        int var9 = llllIIIIlII[0];
        char[] var11 = var12.toCharArray();
        int var1 = var11.length;
        int var15 = llllIIIIlII[0];
        while (y.lIllIIllIIlIII(var15, var1)) {
            char var7 = var11[var15];
            var4.append((char)(var7 ^ var13[var9 % var13.length]));
            0;
            ++var9;
            ++var15;
            0;
            if ((0x96 ^ 0x92) != 0) continue;
            return null;
        }
        return String.valueOf(var4);
    }

    static {
        y.lIllIIllIIIIll();
        y.lIllIIllIIIIlI();
    }

    private static void lIllIIllIIIIll() {
        llllIIIIlII = new int[5];
        y.llllIIIIlII[0] = (0x55 ^ 9) & ~(0x2C ^ 0x70);
        y.llllIIIIlII[1] = 1;
        y.llllIIIIlII[2] = 0x28 ^ 0x2E;
        y.llllIIIIlII[3] = 2;
        y.llllIIIIlII[4] = 3;
    }

    private static void lIllIIllIIIIlI() {
        llllIIIIIll = new String[llllIIIIlII[4]];
        y.llllIIIIIll[y.llllIIIIlII[0]] = y."Chest";
        y.llllIIIIIll[y.llllIIIIlII[1]] = y."Open";
        y.llllIIIIIll[y.llllIIIIlII[3]] = y."Open";
    }

    private static String lIllIIllIIIIII(String var14, String var8) {
        try {
            SecretKeySpec var5 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var8.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var6 = Cipher.getInstance("Blowfish");
            var6.init(llllIIIIlII[3], var5);
            return new String(var6.doFinal(Base64.getDecoder().decode(var14.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var2) {
            var2.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIIllIIIllI(int n2) {
        return n2 != 0;
    }

    private static boolean lIllIIllIIIlII(int n2) {
        return n2 == 0;
    }

    private static boolean lIllIIllIIIlll(int n2, int n3) {
        return n2 > n3;
    }

    @Inject
    public y(SquireBarrows squireBarrows, SquireBarrowsConfig squireBarrowsConfig) {
        this.an = squireBarrows;
        this.ao = squireBarrowsConfig;
    }
}

