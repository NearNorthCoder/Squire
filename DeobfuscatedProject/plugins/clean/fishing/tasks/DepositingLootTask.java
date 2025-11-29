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
package gg.squire.fishing.tasks;

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

@TaskDesc(name="Depositing Loot")
public class DepositingLootTask
extends Task {
    private static final  Logger w;
    
    private  int q;
    private final  SquireFisherConfig x;
    
    private final  SquireFisherPlugin y;

    public boolean run() {
        d var1;
        if (d.lllIlIlllIIlIl(Widgets.isVisible((Widget)Widgets.get((int)lIlllIllIIIl[0], (int)lIlllIllIIIl[1])) ? 1 : 0)) {
            return lIlllIllIIIl[2];
        }
        if (d.lllIlIlllIIlIl(var1.y.e() ? 1 : 0)) {
            return lIlllIllIIIl[2];
        }
        if (d.lllIlIlllIIllI(Widgets.isVisible((Widget)Widgets.get((int)lIlllIllIIIl[0], (int)lIlllIllIIIl[1])) ? 1 : 0)) {
            Widgets.get((int)lIlllIllIIIl[0], (int)lIlllIllIIIl[3]).interact(lIlllIllIIII[lIlllIllIIIl[2]]);
            var1.y.a(lIlllIllIIIl[2]);
        }
        return lIlllIllIIIl[4];
    }

    private static boolean lllIlIlllIIllI(int n) {
        return n != 0;
    }

    static {
        d.lllIlIlllIIlII();
        d.lllIlIlllIIIll();
        w = LoggerFactory.getLogger(DepositingLootTask.class);
    }

    private static boolean lllIlIlllIIlIl(int n) {
        return n == 0;
    }

    @Inject
    public DepositingLootTask(SquireFisherConfig squireFisherConfig, SquireFisherPlugin squireFisherPlugin) {
        this.x = squireFisherConfig;
        this.y = squireFisherPlugin;
    }

    private static void lllIlIlllIIIll() {
        lIlllIllIIII = new String[lIlllIllIIIl[4]];
        d.lIlllIllIIII[d.lIlllIllIIIl[2]] = "Bank-all";
    }
}

