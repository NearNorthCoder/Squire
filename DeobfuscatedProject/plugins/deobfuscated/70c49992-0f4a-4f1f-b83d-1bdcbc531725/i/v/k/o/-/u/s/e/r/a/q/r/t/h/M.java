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
package i.v.k.o.-.u.s.e.r.a.q.r.t.h;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.vorkath.SquireVorkathConfig;
import gg.squire.vorkath.SquireVorkathPlugin;
import i.v.k.o.-.u.s.e.r.a.q.r.t.h.N;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.movement.Movement;

@TaskDesc(name="Boarding boat", priority=105, blocking=true)
public class M
extends N {
    private static /* synthetic */ String[] lIlIlIllllIlI;
    private static final /* synthetic */ WorldPoint cs;
    private static /* synthetic */ int[] lIlIlIllllIll;
    private final /* synthetic */ SquireVorkathPlugin ct;

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
        NPC llllllllllllllIllIlIlIIIIIIIllll = NPCs.getNearest((String[])stringArray);
        if (M.lIllllllllllIlI(llllllllllllllIllIlIlIIIIIIIllll)) {
            Movement.walkTo((WorldPoint)cs);
            0;
            return lIlIlIllllIll[1];
        }
        var1_1.interact(lIlIlIllllIlI[lIlIlIllllIll[1]]);
        return lIlIlIllllIll[1];
    }

    @Inject
    protected M(Client client, SquireVorkathConfig squireVorkathConfig, SquireVorkathPlugin squireVorkathPlugin) {
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

    private static void lIllllllllllIII() {
        lIlIlIllllIll = new int[5];
        M.lIlIlIllllIll[0] = (0xB2 ^ 0xBF ^ (0xA1 ^ 0xB3)) & (1 ^ (0x5C ^ 0x42) ^ -1);
        M.lIlIlIllllIll[1] = 1;
        M.lIlIlIllllIll[2] = 0xFFFFDFD4 & 0x2A7B;
        M.lIlIlIllllIll[3] = 0xFFFF9E7F & 0x6FEE;
        M.lIlIlIllllIll[4] = 2;
    }

    private static void lIlllllllllIlll() {
        lIlIlIllllIlI = new String[lIlIlIllllIll[4]];
        M.lIlIlIllllIlI[M.lIlIlIllllIll[0]] = M."Torfinn";
        M.lIlIlIllllIlI[M.lIlIlIllllIll[1]] = M."Ungael";
    }

    private static String lIlllllllllIllI(String llllllllllllllIllIlIlIIIIIIIIlII, String llllllllllllllIllIlIIllllllllllI) {
        llllllllllllllIllIlIlIIIIIIIIlII = new String(Base64.getDecoder().decode(llllllllllllllIllIlIlIIIIIIIIlII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllIlIlIIIIIIIIIlI = new StringBuilder();
        char[] llllllllllllllIllIlIlIIIIIIIIIIl = llllllllllllllIllIlIIllllllllllI.toCharArray();
        int llllllllllllllIllIlIlIIIIIIIIIII = lIlIlIllllIll[0];
        char[] llllllllllllllIllIlIIllllllllIlI = llllllllllllllIllIlIlIIIIIIIIlII.toCharArray();
        int llllllllllllllIllIlIIllllllllIIl = llllllllllllllIllIlIIllllllllIlI.length;
        int llllllllllllllIllIlIIllllllllIII = lIlIlIllllIll[0];
        while (M.lIllllllllllIll(llllllllllllllIllIlIIllllllllIII, llllllllllllllIllIlIIllllllllIIl)) {
            char llllllllllllllIllIlIlIIIIIIIIlIl = llllllllllllllIllIlIIllllllllIlI[llllllllllllllIllIlIIllllllllIII];
            llllllllllllllIllIlIlIIIIIIIIIlI.append((char)(llllllllllllllIllIlIlIIIIIIIIlIl ^ llllllllllllllIllIlIlIIIIIIIIIIl[llllllllllllllIllIlIlIIIIIIIIIII % llllllllllllllIllIlIlIIIIIIIIIIl.length]));
            0;
            ++llllllllllllllIllIlIlIIIIIIIIIII;
            ++llllllllllllllIllIlIIllllllllIII;
            0;
            if (1 < (77 + 44 - -16 + 17 ^ 34 + 140 - 135 + 119)) continue;
            return null;
        }
        return String.valueOf(llllllllllllllIllIlIlIIIIIIIIIlI);
    }

    private static boolean lIllllllllllIIl(int n2) {
        return n2 != 0;
    }
}

