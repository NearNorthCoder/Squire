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
import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ExecutorService;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.events.MenuEntryAdded;
import net.runelite.client.eventbus.Subscribe;

@TaskDesc(name="Bulk Cleaning Herbs", register=true)
public class BulkCleaningHerbsTask
extends ConstructionTaskBase {

    public boolean run() {
        return llIlllIlI[0];
    }

    @Inject
    public BulkCleaningHerbsTask(Client client, ExecutorService executorService) {
        super(client, executorService, llIlllIIl[llIlllIlI[0]]);
    }

    private static void lIlllllIlII() {
        llIlllIIl = new String[llIlllIlI[2]];
        bA.llIlllIIl[bA.llIlllIlI[0]] = "Clean-All";
        bA.llIlllIIl[bA.llIlllIlI[1]] = "Clean";
    }

    @Override
    public boolean c(String string, String string2) {
        return string.contains(llIlllIIl[llIlllIlI[1]]);
    }

    @Subscribe
    public void c(MenuEntryAdded menuEntryAdded) {
        super.a(menuEntryAdded);
    }

    static {
        bA.lIlllllIlIl();
        bA.lIlllllIlII();
    }
}

