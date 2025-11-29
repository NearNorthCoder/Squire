/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 *  net.unethicalite.api.coords.RectangularArea
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.nightmare.SquireNightmareConfig;
import gg.squire.nightmare.SquireNightmarePlugin;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.coords.RectangularArea;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.al;
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.e;
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.f;
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.j;

@TaskDesc(name="Attacking Parasite", priority=2147483626)
public class ag
extends al {
    private static final /* synthetic */ Logger dS;
    private static /* synthetic */ String[] llllIllIlIII;
    private static /* synthetic */ int[] llllIllIlIIl;

    private static boolean lIIlIIIllIIIIll(Object object) {
        return object != null;
    }

    private static String lIIlIIIlIllllII(String lllllllllllllllIIlIlIllllllIIIIl, String lllllllllllllllIIlIlIllllllIIIII) {
        lllllllllllllllIIlIlIllllllIIIIl = new String(Base64.getDecoder().decode(lllllllllllllllIIlIlIllllllIIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIlIlIlllllIlllll = new StringBuilder();
        char[] lllllllllllllllIIlIlIlllllIllllI = lllllllllllllllIIlIlIllllllIIIII.toCharArray();
        int lllllllllllllllIIlIlIlllllIlllIl = llllIllIlIIl[1];
        char[] lllllllllllllllIIlIlIlllllIlIlll = lllllllllllllllIIlIlIllllllIIIIl.toCharArray();
        int lllllllllllllllIIlIlIlllllIlIllI = lllllllllllllllIIlIlIlllllIlIlll.length;
        int lllllllllllllllIIlIlIlllllIlIlIl = llllIllIlIIl[1];
        while (ag.lIIlIIIllIIIllI(lllllllllllllllIIlIlIlllllIlIlIl, lllllllllllllllIIlIlIlllllIlIllI)) {
            char lllllllllllllllIIlIlIllllllIIIlI = lllllllllllllllIIlIlIlllllIlIlll[lllllllllllllllIIlIlIlllllIlIlIl];
            lllllllllllllllIIlIlIlllllIlllll.append((char)(lllllllllllllllIIlIlIllllllIIIlI ^ lllllllllllllllIIlIlIlllllIllllI[lllllllllllllllIIlIlIlllllIlllIl % lllllllllllllllIIlIlIlllllIllllI.length]));
            0;
            ++lllllllllllllllIIlIlIlllllIlllIl;
            ++lllllllllllllllIIlIlIlllllIlIlIl;
            0;
            if ((0xA5 ^ 0x93 ^ (0xAB ^ 0x99)) > 2) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIIlIlIlllllIlllll);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean cr() {
        void var2_2;
        ag lllllllllllllllIIlIlIlllllllIIII;
        WorldPoint worldPoint = this.cL.getLocalPlayer().getWorldLocation();
        if (ag.lIIlIIIlIllllll(this.cM.ap()) && ag.lIIlIIIllIIIIII(this.cS.getId(), llllIllIlIIl[0])) {
            return llllIllIlIIl[1];
        }
        if (ag.lIIlIIIllIIIIIl(lllllllllllllllIIlIlIlllllllIIII.cM.aq() ? 1 : 0)) {
            return llllIllIlIIl[1];
        }
        if (ag.lIIlIIIlIllllll(lllllllllllllllIIlIlIlllllllIIII.cM.at())) {
            return llllIllIlIIl[1];
        }
        NPC lllllllllllllllIIlIlIllllllIlllI = lllllllllllllllIIlIlIlllllllIIII.cJ.aX();
        if (ag.lIIlIIIllIIIIlI(lllllllllllllllIIlIlIllllllIlllI)) {
            return llllIllIlIIl[1];
        }
        if (ag.lIIlIIIllIIIIll(e.ay())) {
            void lllllllllllllllIIlIlIllllllIllll;
            RectangularArea lllllllllllllllIIlIlIllllllIllIl = e.ay();
            if (ag.lIIlIIIllIIIlII(lllllllllllllllIIlIlIllllllIllIl.contains(lllllllllllllllIIlIlIllllllIlllI.getWorldLocation()) ? 1 : 0) && ag.lIIlIIIllIIIlII(lllllllllllllllIIlIlIllllllIllIl.contains((WorldPoint)lllllllllllllllIIlIlIllllllIllll) ? 1 : 0)) {
                Log.info((String)llllIllIlIII[llllIllIlIIl[1]]);
                return llllIllIlIIl[1];
            }
            if (ag.lIIlIIIllIIIlII(lllllllllllllllIIlIlIllllllIllIl.contains(lllllllllllllllIIlIlIllllllIlllI.getWorldLocation()) ? 1 : 0) && ag.lIIlIIIllIIIIIl(lllllllllllllllIIlIlIllllllIllIl.contains((WorldPoint)lllllllllllllllIIlIlIllllllIllll) ? 1 : 0) && ag.lIIlIIIllIIIlIl(lllllllllllllllIIlIlIllllllIllll.distanceTo((Locatable)lllllllllllllllIIlIlIllllllIlllI), llllIllIlIIl[2])) {
                EquipmentSetup lllllllllllllllIIlIlIllllllIllII = (EquipmentSetup)lllllllllllllllIIlIlIlllllllIIII.cK.totemGear().selected(EquipmentSetup.class);
                lllllllllllllllIIlIlIlllllllIIII.ec.a(lllllllllllllllIIlIlIllllllIlllI, lllllllllllllllIIlIlIllllllIllII);
                0;
                return llllIllIlIIl[3];
            }
        }
        if (ag.lIIlIIIllIIIIIl(lllllllllllllllIIlIlIlllllllIIII.cK.assistantMode() ? 1 : 0)) {
            return llllIllIlIIl[1];
        }
        return this.x((NPC)var2_2);
    }

    private static boolean lIIlIIIllIIIlIl(int n2, int n3) {
        return n2 <= n3;
    }

    @Override
    public EquipmentSetup cq() {
        return (EquipmentSetup)this.cK.parasiteGear().selected(EquipmentSetup.class);
    }

    private static void lIIlIIIlIlllllI() {
        llllIllIlIIl = new int[4];
        ag.llllIllIlIIl[0] = -(0x53 ^ 0x59) & (0xFFFFFFBB & 0x2BDF);
        ag.llllIllIlIIl[1] = (23 + 54 - 2 + 54 ^ 194 + 84 - 214 + 134) & (0xB8 ^ 0x91 ^ (0x15 ^ 0x7B) ^ -1);
        ag.llllIllIlIIl[2] = 94 + 74 - 149 + 122 ^ 99 + 93 - 92 + 32;
        ag.llllIllIlIIl[3] = 1;
    }

    private static boolean lIIlIIIllIIIlII(int n2) {
        return n2 == 0;
    }

    private static void lIIlIIIlIllllIl() {
        llllIllIlIII = new String[llllIllIlIIl[3]];
        ag.llllIllIlIII[ag.llllIllIlIIl[1]] = ag."Not attacking parasite since we are not in flower area, amd it isn't.";
    }

    private static boolean lIIlIIIlIllllll(int n2) {
        return n2 > 0;
    }

    private static boolean lIIlIIIllIIIllI(int n2, int n3) {
        return n2 < n3;
    }

    static {
        ag.lIIlIIIlIlllllI();
        ag.lIIlIIIlIllllIl();
        dS = LoggerFactory.getLogger(ag.class);
    }

    private static boolean lIIlIIIllIIIIIl(int n2) {
        return n2 != 0;
    }

    @Inject
    protected ag(j j2, Client client, SquireNightmareConfig squireNightmareConfig, SquireNightmarePlugin squireNightmarePlugin, f f2) {
        super(j2, client, squireNightmareConfig, squireNightmarePlugin, f2);
    }

    private static boolean lIIlIIIllIIIIII(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean lIIlIIIllIIIIlI(Object object) {
        return object == null;
    }
}

