/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.widgets.Widget
 *  net.unethicalite.api.widgets.Widgets
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package i.i.-.h.u.s.e.r.q.r.s.f.e;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.fishing.SquireFisherConfig;
import gg.squire.fishing.SquireFisherPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.widgets.Widgets;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* TASK: Depositing Loot -> DepositinglootTask */
@TaskDesc(name="Depositing Loot")
public class DepositingLootTask
extends Task {
    private static final /* synthetic */ Logger w;
    private static /* synthetic */ int[] lIlllIllIIIl;
    private /* synthetic */ int q;
    private final /* synthetic */ SquireFisherConfig x;
    private static /* synthetic */ String[] lIlllIllIIII;
    private final /* synthetic */ SquireFisherPlugin y;

    private static String lllIlIlllIIIlI(String var1, String var6) {
        try {
            SecretKeySpec var5 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var6.getBytes(StandardCharsets.UTF_8)), lIlllIllIIIl[5]), "DES");
            Cipher var2 = Cipher.getInstance("DES");
            var2.init(lIlllIllIIIl[6], var5);
            return new String(var2.doFinal(Base64.getDecoder().decode(var1.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var4) {
            var4.printStackTrace();
            return null;
        }
    }

    private static void lllIlIlllIIlII() {
        lIlllIllIIIl = new int[7];
        d.lIlllIllIIIl[0] = -(0xFFFFF68B & 0x7B75) & (0xFFFFF3FF & 0x7F6F);
        d.lIlllIllIIIl[1] = 0x5F ^ 0x19 ^ (0x6C ^ 0x3C);
        d.lIlllIllIIIl[2] = (0x41 ^ 0x67 ^ (0x5E ^ 0x33)) & (0x52 ^ 0x6D ^ (0xA ^ 0x7E) ^ -1);
        d.lIlllIllIIIl[3] = 0x1F ^ 0x3A ^ (0x14 ^ 0x22);
        d.lIlllIllIIIl[4] = 1;
        d.lIlllIllIIIl[5] = 0x28 ^ 0x63 ^ (0x5A ^ 0x19);
        d.lIlllIllIIIl[6] = 2;
    }

    public boolean run() {
        d var3;
        if (d.lllIlIlllIIlIl(Widgets.isVisible((Widget)Widgets.get((int)lIlllIllIIIl[0], (int)lIlllIllIIIl[1])) ? 1 : 0)) {
            return lIlllIllIIIl[2];
        }
        if (d.lllIlIlllIIlIl(var3.y.e() ? 1 : 0)) {
            return lIlllIllIIIl[2];
        }
        if (d.lllIlIlllIIllI(Widgets.isVisible((Widget)Widgets.get((int)lIlllIllIIIl[0], (int)lIlllIllIIIl[1])) ? 1 : 0)) {
            Widgets.get((int)lIlllIllIIIl[0], (int)lIlllIllIIIl[3]).interact(lIlllIllIIII[lIlllIllIIIl[2]]);
            var3.y.a(lIlllIllIIIl[2]);
        }
        return lIlllIllIIIl[4];
    }

    private static boolean lllIlIlllIIllI(int n) {
        return n != 0;
    }

    static {
        d.lllIlIlllIIlII();
        d.lllIlIlllIIIll();
        w = LoggerFactory.getLogger(d.class);
    }

    private static boolean lllIlIlllIIlIl(int n) {
        return n == 0;
    }

    @Inject
    public d(SquireFisherConfig squireFisherConfig, SquireFisherPlugin squireFisherPlugin) {
        this.x = squireFisherConfig;
        this.y = squireFisherPlugin;
    }

    private static void lllIlIlllIIIll() {
        lIlllIllIIII = new String[lIlllIllIIIl[4]];
        d.lIlllIllIIII[d.lIlllIllIIIl[2]] = d."Bank-all";
    }
}

