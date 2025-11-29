/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.NPC
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.vorkath.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.vorkath.SquireVorkathConfig;
import gg.squire.vorkath.SquireVorkathPlugin;
import gg.squire.vorkath.tasks.VorkathTaskBase;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.movement.Movement;

@TaskDesc(name="Boarding boat", priority=105, blocking=true)
public class BoardingBoatTask
extends VorkathTaskBase {
    
    private static final  WorldPoint cs;
    
    private final  SquireVorkathPlugin ct;

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean Q() {
        void var1_1;
        if (M.lIllllllllllIIl(this.ct.f() ? 1 : 0)) {
            return lIlIlIllllIll[0];
        }
        String[] stringArray = new String[lIlIlIllllIll[1]];
        stringArray[M.lIlIlIllllIll[0]] = lIlIlIllllIlI[lIlIlIllllIll[0]];
        NPC var1 = NPCs.getNearest((String[])stringArray);
        if (M.lIllllllllllIlI(var1)) {
            Movement.walkTo((WorldPoint)cs);

            return lIlIlIllllIll[1];
        }
        var1_1.interact(lIlIlIllllIlI[lIlIlIllllIll[1]]);
        return lIlIlIllllIll[1];
    }

    @Inject
    protected BoardingBoatTask(Client client, SquireVorkathConfig squireVorkathConfig, SquireVorkathPlugin squireVorkathPlugin) {
        super(client, squireVorkathConfig);
        this.ct = squireVorkathPlugin;
    }

    private static boolean lIllllllllllIll(int n2, int n3) {
        return n2 < n3;
    }

    static {
        M.lIllllllllllIII();
        M.lIlllllllllIlll();
        cs = new WorldPoint(lIlIlIllllIll[2], lIlIlIllllIll[3], lIlIlIllllIll[0]);
    }

    private static boolean lIllllllllllIlI(Object object) {
        return object == null;
    }

    private static void lIlllllllllIlll() {
        lIlIlIllllIlI = new String[lIlIlIllllIll[4]];
        M.lIlIlIllllIlI[M.lIlIlIllllIll[0]] = "Torfinn";
        M.lIlIlIllllIlI[M.lIlIlIllllIll[1]] = "Ungael";
    }

        return String.valueOf(var2);
    }

    private static boolean lIllllllllllIIl(int n2) {
        return n2 != 0;
    }
}

