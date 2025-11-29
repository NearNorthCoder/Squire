/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.NPC
 *  net.unethicalite.api.widgets.Dialog
 */
package gg.squire.giantsfoundry.tasks;

import gg.squire.giantsfoundry.tasks.GiantsfoundryManager;
import gg.squire.giantsfoundry.tasks.GiantsfoundryTaskBase;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.giantsfoundry.SquireGiantsConfig;
import gg.squire.giantsfoundry.SquireGiantsFoundry;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.NPC;
import net.unethicalite.api.widgets.Dialog;

@TaskDesc(name="Getting commission", priority=2147483597, blocking=true)
public class GettingCommissionTask
extends GiantsfoundryTaskBase {

    private static boolean lIIIIlIIIIIlIII(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean M() {
        void var1_1;
        t var1;
        if (t.lIIIIlIIIIIlIII(this.T.h() ? 1 : 0)) {
            return llIlIllllIII[0];
        }
        if (t.lIIIIlIIIIIlIII(Dialog.hasOption((String)llIlIlllIlll[llIlIllllIII[0]]) ? 1 : 0)) {
            String[] stringArray = new String[llIlIllllIII[1]];
            stringArray[t.llIlIllllIII[0]] = llIlIlllIlll[llIlIllllIII[1]];
            Dialog.chooseOption((String[])stringArray);

            return llIlIllllIII[1];
        }
        NPC var2 = var1.T.p();
        if (t.lIIIIlIIIIIlIIl(var2)) {
            return llIlIllllIII[0];
        }
        var1_1.interact(llIlIlllIlll[llIlIllllIII[2]]);
        return llIlIllllIII[1];
    }

    private static boolean lIIIIlIIIIIlIlI(int n2, int n3) {
        return n2 < n3;
    }

    static {
        t.lIIIIlIIIIIIlll();
        t.lIIIIlIIIIIIllI();
    }

        return String.valueOf(var3);
    }

    private static void lIIIIlIIIIIIllI() {
        llIlIlllIlll = new String[llIlIllllIII[3]];
        t.llIlIlllIlll[t.llIlIllllIII[0]] = "Yes";
        t.llIlIlllIlll[t.llIlIllllIII[1]] = "Yes";
        t.llIlIlllIlll[t.llIlIllllIII[2]] = "Commission";
    }

    private static boolean lIIIIlIIIIIlIIl(Object object) {
        return object == null;
    }

    @Inject
    public GettingCommissionTask(a a2, SquireGiantsFoundry squireGiantsFoundry, SquireGiantsConfig squireGiantsConfig) {
        super(a2, squireGiantsFoundry, squireGiantsConfig);
    }

}

