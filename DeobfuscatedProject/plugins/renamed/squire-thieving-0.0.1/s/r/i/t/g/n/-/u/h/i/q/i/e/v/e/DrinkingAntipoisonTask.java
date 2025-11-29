/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  javax.inject.Inject
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.items.Inventory
 */
package s.r.i.t.g.n.-.u.h.i.q.i.e.v.e;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.thieving.SquireThieving;
import gg.squire.thieving.SquireThievingConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;
import s.r.i.t.g.n.-.u.h.i.q.i.e.v.e.s_Unknown;

/* TASK: Drinking antipoison -> DrinkingantipoisonTask */
@TaskDesc(name="Drinking antipoison", priority=0x7FFFFFFE, blocking=true)
public class DrinkingAntipoisonTask
extends s_Unknown {
    private static /* synthetic */ int[] lIIllIllllIIl;
    private static /* synthetic */ String[] lIIllIllllIII;

    private static String lIllIIIlllllIIl(String var4, String var3) {
        try {
            SecretKeySpec var9 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var3.getBytes(StandardCharsets.UTF_8)), lIIllIllllIIl[5]), "DES");
            Cipher var5 = Cipher.getInstance("DES");
            var5.init(lIIllIllllIIl[2], var9);
            return new String(var5.doFinal(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean l() {
        if (t.lIllIIIllllllIl(Inventory.contains(item -> item.getName().contains(lIIllIllllIII[lIIllIllllIIl[3]])) ? 1 : 0)) {
            Log.error((String)lIIllIllllIII[lIIllIllllIIl[0]]);
            this.ad.forceStop();
        }
        if (t.lIllIIIllllllIl(Combat.isPoisoned() ? 1 : 0)) {
            return lIIllIllllIIl[0];
        }
        Inventory.getFirst(item -> item.getName().contains(lIIllIllllIII[lIIllIllllIIl[2]])).interact(lIIllIllllIII[lIIllIllllIIl[1]]);
        return lIIllIllllIIl[1];
    }

    private static void lIllIIIlllllIll() {
        lIIllIllllIII = new String[lIIllIllllIIl[4]];
        t.lIIllIllllIII[t.lIIllIllllIIl[0]] = t."We are out of antipoisons!!";
        t.lIIllIllllIII[t.lIIllIllllIIl[1]] = t."Drink";
        t.lIIllIllllIII[t.lIIllIllllIIl[2]] = t."ntipoison";
        t.lIIllIllllIII[t.lIIllIllllIIl[3]] = t."ntipoison";
    }

    @Inject
    public t(SquireThieving squireThieving, SquireThievingConfig squireThievingConfig) {
        super(squireThieving, squireThievingConfig);
    }

    private static String lIllIIIlllllIlI(String var10, String var7) {
        try {
            SecretKeySpec var2 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var7.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var1 = Cipher.getInstance("Blowfish");
            var1.init(lIIllIllllIIl[2], var2);
            return new String(var1.doFinal(Base64.getDecoder().decode(var10.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var6) {
            var6.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIIIllllllIl(int n2) {
        return n2 == 0;
    }

    static {
        t.lIllIIIllllllII();
        t.lIllIIIlllllIll();
    }

    private static void lIllIIIllllllII() {
        lIIllIllllIIl = new int[6];
        t.lIIllIllllIIl[0] = (0x92 ^ 0x9A) & ~(0xBD ^ 0xB5);
        t.lIIllIllllIIl[1] = 1;
        t.lIIllIllllIIl[2] = 2;
        t.lIIllIllllIIl[3] = 3;
        t.lIIllIllllIIl[4] = 0xBC ^ 0xB8;
        t.lIIllIllllIIl[5] = 0xDD ^ 0x8F ^ (0xFA ^ 0xA0);
    }
}

