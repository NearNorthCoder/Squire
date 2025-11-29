/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.unethicalite.api.game.Game
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.driftnet.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.driftnet.SquireDriftNet;
import gg.squire.driftnet.SquireDriftNetConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.unethicalite.api.game.Game;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Start Banking", priority=0x7FFFFFFE, blocking=true)
public class StartBankingTask
extends Task {
    private final  SquireDriftNetConfig A;
    private final  SquireDriftNet y;
    
    private final  Client z;

    private static void llIlIIlIllIIlI() {
        lIlIIIIIIIll = new String[lIlIIIIIIlII[2]];
        f.lIlIIIIIIIll[f.lIlIIIIIIlII[0]] = "Logging out to start banking";
        f.lIlIIIIIIIll[f.lIlIIIIIIlII[1]] = "Stamina";
    }

    public boolean run() {
        f var1;
        if (f.llIlIIlIllIlIl(this.z.isInInstancedRegion() ? 1 : 0)) {
            return lIlIIIIIIlII[0];
        }
        if (f.llIlIIlIllIlIl(var1.A.stamina())) {
            return lIlIIIIIIlII[0];
        }
        Item var2 = Inventory.getFirst(item -> item.getName().contains(lIlIIIIIIIll[lIlIIIIIIlII[1]]));
        if (f.llIlIIlIllIllI(var2)) {
            return lIlIIIIIIlII[0];
        }
        Game.logout();
        System.out.println(lIlIIIIIIIll[lIlIIIIIIlII[0]]);
        return lIlIIIIIIlII[1];
    }

    private static boolean llIlIIlIllIlIl(int n) {
        return n == 0;
    }

    private static boolean llIlIIlIllIllI(Object object) {
        return object != null;
    }

    static {
        f.llIlIIlIllIlII();
        f.llIlIIlIllIIlI();
    }

    @Inject
    public StartBankingTask(SquireDriftNet squireDriftNet, Client client, SquireDriftNetConfig squireDriftNetConfig) {
        this.y = squireDriftNet;
        this.z = client;
        this.A = squireDriftNetConfig;
    }

}

