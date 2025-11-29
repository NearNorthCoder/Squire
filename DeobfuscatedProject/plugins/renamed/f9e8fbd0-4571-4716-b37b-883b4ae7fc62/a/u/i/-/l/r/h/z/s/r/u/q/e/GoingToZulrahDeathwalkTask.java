/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.NPC
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.movement.Movement
 */
package a.u.i.-.l.r.h.z.s.r.u.q.e;

import a.u.i.-.l.r.h.z.s.r.u.q.e.P_Unknown;
import a.u.i.-.l.r.h.z.s.r.u.q.e.PluginState;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.zulrah.SquireZulrah;
import gg.squire.zulrah.SquireZulrahConfig;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.movement.Movement;

/* TASK: Going to Zulrah (Deathwalk) -> Goingtozulrah(Deathwalk)Task */
@TaskDesc(name="Going to Zulrah (Deathwalk)")
public class GoingToZulrahDeathwalkTask
extends P_Unknown {
    private static /* synthetic */ int[] lIllIIllllIIl;

    static {
        N.llIIIlllIIIlIIl();
    }

    private static void llIIIlllIIIlIIl() {
        lIllIIllllIIl = new int[5];
        N.lIllIIllllIIl[0] = 1;
        N.lIllIIllllIIl[1] = (20 + 79 - -28 + 42 ^ 141 + 52 - 78 + 63) & (113 + 96 - 18 + 32 ^ 49 + 45 - 89 + 191 ^ -1);
        N.lIllIIllllIIl[2] = 0xFFFFD7F5 & 0x2FFB;
        N.lIllIIllllIIl[3] = -(0xFFFFE7B7 & 0x7B5F) & (0xFFFFEFF7 & 0x7BBF);
        N.lIllIIllllIIl[4] = -(0xFFFFFCFF & 0x770B) & (0xFFFFFFFB & Short.MAX_VALUE);
    }

    private static boolean llIIIlllIIIlIlI(int n2) {
        return n2 != 0;
    }

    @Override
    public boolean ac() {
        int[] nArray = new int[lIllIIllllIIl[0]];
        nArray[N.lIllIIllllIIl[1]] = lIllIIllllIIl[2];
        NPC nPC = NPCs.getNearest((int[])nArray);
        if (!N.llIIIlllIIIlIlI(this.ah() ? 1 : 0) || N.llIIIlllIIIlIll(nPC)) {
            if (N.llIIIlllIIIlIlI(Movement.shouldWalk() ? 1 : 0)) {
                Movement.walkTo((int)lIllIIllllIIl[3], (int)lIllIIllllIIl[4], (int)lIllIIllllIIl[1]);
                0;
            }
            return lIllIIllllIIl[0];
        }
        this.al.a(c.COLLECTING_ZULRAH);
        return lIllIIllllIIl[1];
    }

    @Inject
    public N(SquireZulrahConfig squireZulrahConfig, SquireZulrah squireZulrah, Client client) {
        super(squireZulrahConfig, squireZulrah, client, c.TRANSPORTING_ZULRAH);
    }

    private static boolean llIIIlllIIIlIll(Object object) {
        return object == null;
    }
}

