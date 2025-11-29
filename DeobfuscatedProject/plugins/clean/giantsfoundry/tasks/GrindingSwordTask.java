/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  javax.inject.Inject
 *  net.runelite.api.Player
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.Players
 */
package gg.squire.giantsfoundry.tasks;

import gg.squire.giantsfoundry.tasks.GiantsfoundryManager;
import gg.squire.giantsfoundry.tasks.GameEnum;
import gg.squire.giantsfoundry.tasks.GiantsfoundryTaskBase;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import javax.inject.Inject;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;

@TaskDesc(name="Grinding sword", priority=100, blocking=true)
public class GrindingSwordTask
extends GiantsfoundryTaskBase {

    private static final  int ap;

    private static boolean lIIIIIllIIIlllI(Object object) {
        return object == null;
    }

    @Override
    protected boolean M() {
        Player player = Players.getLocal();
        if (q.lIIIIIllIIIllIl(player.getAnimation(), llIlIlIlIIll[0])) {
            this.sleep(llIlIlIlIIll[1]);
            return llIlIlIlIIll[2];
        }
        return this.N();
    }

    private static void lIIIIIllIIIlIll() {
        llIlIlIlIIlI = new String[llIlIlIlIIll[4]];
        q.llIlIlIlIIlI[q.llIlIlIlIIll[3]] = "Grindstone is null";
        q.llIlIlIlIIlI[q.llIlIlIlIIll[2]] = "Use";
    }

    private static boolean lIIIIIllIIIllll(int n2, int n3) {
        return n2 < n3;
    }

    @Override
    protected boolean N() {
        TileObject tileObject = this.P.s();
        if (q.lIIIIIllIIIlllI(tileObject)) {
            Log.info((String)llIlIlIlIIlI[llIlIlIlIIll[3]]);
            return llIlIlIlIIll[3];
        }
        tileObject.interact(llIlIlIlIIlI[llIlIlIlIIll[2]]);
        this.sleep(llIlIlIlIIll[1]);
        return llIlIlIlIIll[2];
    }

    private static boolean lIIIIIllIIIllIl(int n2, int n3) {
        return n2 == n3;
    }

    @Inject
    public GrindingSwordTask(a a2) {
        super(a2, g.GRINDSTONE);
    }

    static {
        q.lIIIIIllIIIllII();
        q.lIIIIIllIIIlIll();
        ap = llIlIlIlIIll[0];
    }

        return String.valueOf(var1);
    }
}

