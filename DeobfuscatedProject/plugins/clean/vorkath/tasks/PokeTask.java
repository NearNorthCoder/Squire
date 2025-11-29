/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.NPC
 *  net.unethicalite.api.entities.Players
 */
package gg.squire.vorkath.tasks;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.vorkath.SquireVorkathConfig;
import gg.squire.vorkath.tasks.VorkathManager;
import gg.squire.vorkath.tasks.VorkathTaskBase;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.unethicalite.api.entities.Players;

@TaskDesc(name="Poke", priority=250, blocking=true)
public class PokeTask
extends VorkathTaskBase {

    private static boolean lIllllllIlIIlII(Object object) {
        return object == null;
    }

    private static void lIllllllIlIIIlI() {
        lIlIlIlIllIIl = new String[lIlIlIlIllIlI[1]];
        z.lIlIlIlIllIIl[z.lIlIlIlIllIlI[0]] = "Poke";
    }

        return String.valueOf(var1);
    }

    @Override
    public boolean Q() {
        z var2;
        NPC nPC = this.cg.c(lIlIlIlIllIlI[0]);
        if (z.lIllllllIlIIlII(nPC)) {
            return lIlIlIlIllIlI[0];
        }
        if (z.lIllllllIlIIlIl(var2.V() ? 1 : 0)) {
            var2.x.a(lIlIlIlIllIlI[1]);
            return lIlIlIlIllIlI[0];
        }
        if (z.lIllllllIlIIllI(Players.getLocal().isMoving() ? 1 : 0)) {
            return lIlIlIlIllIlI[0];
        }
        nPC.interact(lIlIlIlIllIIl[lIlIlIlIllIlI[0]]);
        return lIlIlIlIllIlI[1];
    }

    private static boolean lIllllllIlIIllI(int n2) {
        return n2 != 0;
    }

    @Inject
    protected PokeTask(Client client, f f2, SquireVorkathConfig squireVorkathConfig) {
        super(client, f2, squireVorkathConfig);
    }

    private static boolean lIllllllIlIIlIl(int n2) {
        return n2 == 0;
    }

    private static boolean lIllllllIlIIlll(int n2, int n3) {
        return n2 < n3;
    }

    static {
        z.lIllllllIlIIIll();
        z.lIllllllIlIIIlI();
    }
}

