/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.TileObject
 *  net.runelite.client.plugins.squire.bankloadouts.BankLoadout
 *  net.unethicalite.api.entities.TileObjects
 */
package gg.squire.zulrah.tasks;

import gg.squire.zulrah.tasks.BankingTask;
import gg.squire.zulrah.tasks.THelper;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.zulrah.SquireZulrah;
import gg.squire.zulrah.SquireZulrahConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.TileObject;
import net.runelite.client.plugins.squire.bankloadouts.BankLoadout;
import net.unethicalite.api.entities.TileObjects;

@TaskDesc(name="Entering portal", priority=1000, blocking=true)
public class EnteringPortalTask
extends BankingTask {

    private static void llIIIlllllllIlI() {
        lIllIlIlIIlIl = new String[lIllIlIlIIllI[1]];
        F.lIllIlIlIIlIl[F.lIllIlIlIIllI[0]] = "Enter";
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean run() {
        void var1_1;
        F var1;
        if (!F.llIIIllllllllIl(this.aa.d() ? 1 : 0) || F.llIIIllllllllIl(this.ad() ? 1 : 0)) {
            return lIllIlIlIIllI[0];
        }
        int[] nArray = new int[lIllIlIlIIllI[1]];
        nArray[F.lIllIlIlIIllI[0]] = lIllIlIlIIllI[2];
        TileObject var2 = TileObjects.getNearest((int[])nArray);
        if (F.llIIIlllllllllI(var2)) {
            return lIllIlIlIIllI[0];
        }
        BankLoadout var3 = var1.ae();
        if (F.llIIIllllllllll(var3.needsToBank() ? 1 : 0)) {
            return lIllIlIlIIllI[0];
        }
        var1_1.interact(lIllIlIlIIlIl[lIllIlIlIIllI[0]]);
        return lIllIlIlIIllI[1];
    }

    @Inject
    protected EnteringPortalTask(SquireZulrah squireZulrah, SquireZulrahConfig squireZulrahConfig, Client client, t t2) {
        super(squireZulrah, squireZulrahConfig, client, t2);
    }

    private static boolean llIIIllllllllIl(int n2) {
        return n2 == 0;
    }

    @Override
    public boolean ac() {
        return lIllIlIlIIllI[0];
    }

    static {
        F.llIIIllllllllII();
        F.llIIIlllllllIlI();
    }

    private static boolean llIIIllllllllll(int n2) {
        return n2 != 0;
    }

    private static boolean llIIIlllllllllI(Object object) {
        return object == null;
    }
}

