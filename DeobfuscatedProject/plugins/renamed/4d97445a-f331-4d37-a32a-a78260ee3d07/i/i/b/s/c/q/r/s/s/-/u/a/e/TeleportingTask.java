/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Player
 *  net.unethicalite.api.entities.Players
 */
package i.i.b.s.c.q.r.s.s.-.u.a.e;

import com.google.inject.Inject;
import gg.squire.basics.magic.teleporter.SquireTeleporterConfig;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import i.i.b.s.c.q.r.s.s.-.u.a.e.AWEnum;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import net.runelite.api.Player;
import net.unethicalite.api.entities.Players;

/* TASK: Teleporting -> TeleportingTask */
@TaskDesc(name="Teleporting")
public class TeleportingTask
extends Task {
    private static /* synthetic */ int[] lIlIlIlII;
    private final /* synthetic */ SquireTeleporterConfig fe;

    private static boolean lIIlIlIllIl(Object object) {
        return object == null;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        aV lIllllllllIIlll;
        void lIllllllllIIllI;
        Player player = Players.getLocal();
        if (aV.lIIlIlIllIl(player)) {
            return lIlIlIlII[0];
        }
        if (!aV.lIIlIlIlllI(lIllllllllIIllI.getAnimation(), lIlIlIlII[1]) || !aV.lIIlIlIlllI(lIllllllllIIllI.getAnimation(), lIlIlIlII[2]) || aV.lIIlIlIllll(lIllllllllIIllI.getAnimation(), lIlIlIlII[3])) {
            return lIlIlIlII[4];
        }
        if (aV.lIIlIllIIII((Object)lIllllllllIIlll.fe.teleport(), (Object)aW.PROGRESSIVE)) {
            ArrayList<aW> lIllllllllIIlIl = new ArrayList<aW>(List.of(aW.values()));
            Collections.reverse(lIllllllllIIlIl);
            Iterator lIllllllllIIlII = lIllllllllIIlIl.iterator();
            while (aV.lIIlIllIIIl(lIllllllllIIlII.hasNext() ? 1 : 0)) {
                aW lIllllllllIIIll = (aW)((Object)lIllllllllIIlII.next());
                if (aV.lIIlIllIIIl(lIllllllllIIIll.cn() ? 1 : 0)) {
                    lIllllllllIIIll.co().cast();
                    return lIlIlIlII[4];
                }
                0;
                if (3 > 1) continue;
                return false;
            }
            return lIlIlIlII[0];
        }
        if (aV.lIIlIllIIIl(lIllllllllIIlll.fe.teleport().cn() ? 1 : 0)) {
            lIllllllllIIlll.fe.teleport().co().cast();
            return lIlIlIlII[4];
        }
        return lIlIlIlII[0];
    }

    private static boolean lIIlIllIIII(Object object, Object object2) {
        return object == object2;
    }

    private static boolean lIIlIlIlllI(int n2, int n3) {
        return n2 != n3;
    }

    static {
        aV.lIIlIlIllII();
    }

    private static boolean lIIlIllIIIl(int n2) {
        return n2 != 0;
    }

    private static void lIIlIlIllII() {
        lIlIlIlII = new int[5];
        aV.lIlIlIlII[0] = (190 + 56 - 198 + 143 ^ 116 + 41 - 111 + 136) & (31 + 116 - 143 + 150 ^ 102 + 61 - 154 + 138 ^ -1);
        aV.lIlIlIlII[1] = -(0xFFFFFEB1 & 0x355F) & (0xFFFFB7DA & 0x7EFF);
        aV.lIlIlIlII[2] = -(0xFFFFE423 & 0x5FFF) & (0xFFFFD7FB & 0x6EEF);
        aV.lIlIlIlII[3] = -(0xFFFFFFF8 & 0x793F) & (0xFFFFFBFF & Short.MAX_VALUE);
        aV.lIlIlIlII[4] = 1;
    }

    @Inject
    public aV(SquireTeleporterConfig squireTeleporterConfig) {
        this.fe = squireTeleporterConfig;
    }

    private static boolean lIIlIlIllll(int n2, int n3) {
        return n2 == n3;
    }
}

