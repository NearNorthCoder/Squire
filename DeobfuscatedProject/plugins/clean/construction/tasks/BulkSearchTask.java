/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.events.MenuEntryAdded
 *  net.runelite.client.eventbus.Subscribe
 */
package gg.squire.construction.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.construction.tasks.ConstructionTaskBase;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import java.util.concurrent.ExecutorService;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.events.MenuEntryAdded;
import net.runelite.client.eventbus.Subscribe;

@TaskDesc(name="Bulk search", register=true)
public class BulkSearchTask
extends ConstructionTaskBase {

    private static void lIlIIIlIlll() {
        lIlllIIII = new String[lIlllIllI[3]];
        bC.lIlllIIII[bC.lIlllIllI[0]] = "Search-All";
        bC.lIlllIIII[bC.lIlllIllI[1]] = "Search";
        bC.lIlllIIII[bC.lIlllIllI[2]] = "Bird";
    }

    @Subscribe
    public void c(MenuEntryAdded menuEntryAdded) {
        super.a(menuEntryAdded);
    }

        return String.valueOf(lIlllIlIIllIlll);
    }

    @Override
    public boolean c(String string, String string2) {
        int n2;
        if (bC.lIlIIIllIIl(string.equals(lIlllIIII[lIlllIllI[1]]) ? 1 : 0) && bC.lIlIIIllIIl(string2.contains(lIlllIIII[lIlllIllI[2]]) ? 1 : 0)) {
            n2 = lIlllIllI[1];

            }
        } else {
            n2 = lIlllIllI[0];
        }
        return n2 != 0;
    }

    static {
        bC.lIlIIIllIII();
        bC.lIlIIIlIlll();
    }

    private static boolean lIlIIIllIIl(int n2) {
        return n2 != 0;
    }

    private static boolean lIlIIIllIlI(int n2, int n3) {
        return n2 < n3;
    }

    @Inject
    public BulkSearchTask(Client client, ExecutorService executorService) {
        super(client, executorService, lIlllIIII[lIlllIllI[0]]);
    }

    public boolean run() {
        return lIlllIllI[0];
    }
}

