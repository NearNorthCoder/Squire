/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.vorkath.tasks;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.vorkath.SquireVorkathConfig;
import gg.squire.vorkath.tasks.VorkathManager;
import gg.squire.vorkath.tasks.VorkathTaskBase;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Tick eat", priority=200)
public class TickEatTask
extends VorkathTaskBase {

    private static final  String cn;

    @Inject
    protected TickEatTask(Client client, f f2, SquireVorkathConfig squireVorkathConfig) {
        super(client, f2, squireVorkathConfig);
    }

        return String.valueOf(var1);
    }

    private static boolean lIllllllIllIIII(Object object) {
        return object == null;
    }

    private static boolean lIllllllIlIllll(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean lIllllllIlIllIl(Object object) {
        return object != null;
    }

    private static void lIllllllIlIlIll() {
        lIlIlIlIllIll = new String[lIlIlIlIlllII[4]];
        I.lIlIlIlIllIll[I.lIlIlIlIlllII[1]] = "Zombified Spawn";
        I.lIlIlIlIllIll[I.lIlIlIlIlllII[0]] = "Eat";
        I.lIlIlIlIllIll[I.lIlIlIlIlllII[2]] = "Eat";
        I.lIlIlIlIllIll[I.lIlIlIlIlllII[3]] = "Zombified Spawn";
    }

    private static boolean lIllllllIlIlllI(int n2) {
        return n2 == 0;
    }

    static {
        I.lIllllllIlIllII();
        I.lIllllllIlIlIll();
        cn = lIlIlIlIllIll[lIlIlIlIlllII[3]];
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean Q() {
        String[] stringArray = new String[lIlIlIlIlllII[0]];
        stringArray[I.lIlIlIlIlllII[1]] = lIlIlIlIllIll[lIlIlIlIlllII[1]];
        NPC nPC = NPCs.getNearest((String[])stringArray);
        if (I.lIllllllIlIllIl(nPC) && I.lIllllllIlIlllI(nPC.isDead() ? 1 : 0) && I.lIllllllIlIllll(nPC.distanceTo((Locatable)this.cf.getLocalPlayer()), lIlIlIlIlllII[0])) {
            I var2;
            void var3;
            Item item2 = Inventory.getFirst(item -> item.hasAction(lIlIlIlIllIll[lIlIlIlIlllII[2]]::equals));
            if (I.lIllllllIllIIII(item2)) {
                return lIlIlIlIlllII[1];
            }
            var3.interact(lIlIlIlIllIll[lIlIlIlIlllII[0]]);
            var2.cg.a(var2.cf.getTickCount());
            return lIlIlIlIlllII[1];
        }
        return lIlIlIlIlllII[1];
    }

    private static boolean lIllllllIllIIIl(int n2, int n3) {
        return n2 < n3;
    }
}

