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
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.al_Unknown;
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.e_Unknown;
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.f_Unknown;
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.j_Unknown;

/* TASK: Attacking Parasite -> AttackingparasiteTask */
@TaskDesc(name="Attacking Parasite", priority=2147483626)
public class AttackingParasiteTask
extends al_Unknown {
    private static final /* synthetic */ Logger dS;
    private static /* synthetic */ String[] llllIllIlIII;
    private static /* synthetic */ int[] llllIllIlIIl;

    private static boolean lIIlIIIllIIIIll(Object object) {
        return object != null;
    }

    private static String lIIlIIIlIllllII(String var5, String var12) {
        var5 = new String(Base64.getDecoder().decode(var5.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var14 = new StringBuilder();
        char[] var10 = var12.toCharArray();
        int var3 = llllIllIlIIl[1];
        char[] var1 = var5.toCharArray();
        int var2 = var1.length;
        int var13 = llllIllIlIIl[1];
        while (ag.lIIlIIIllIIIllI(var13, var2)) {
            char var4 = var1[var13];
            var14.append((char)(var4 ^ var10[var3 % var10.length]));
            0;
            ++var3;
            ++var13;
            0;
            if ((0xA5 ^ 0x93 ^ (0xAB ^ 0x99)) > 2) continue;
            return null;
        }
        return String.valueOf(var14);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean cr() {
        void var2_2;
        ag var11;
        WorldPoint worldPoint = this.cL.getLocalPlayer().getWorldLocation();
        if (ag.lIIlIIIlIllllll(this.cM.ap()) && ag.lIIlIIIllIIIIII(this.cS.getId(), llllIllIlIIl[0])) {
            return llllIllIlIIl[1];
        }
        if (ag.lIIlIIIllIIIIIl(var11.cM.aq() ? 1 : 0)) {
            return llllIllIlIIl[1];
        }
        if (ag.lIIlIIIlIllllll(var11.cM.at())) {
            return llllIllIlIIl[1];
        }
        NPC var7 = var11.cJ.aX();
        if (ag.lIIlIIIllIIIIlI(var7)) {
            return llllIllIlIIl[1];
        }
        if (ag.lIIlIIIllIIIIll(e.ay())) {
            void var6;
            RectangularArea var8 = e.ay();
            if (ag.lIIlIIIllIIIlII(var8.contains(var7.getWorldLocation()) ? 1 : 0) && ag.lIIlIIIllIIIlII(var8.contains((WorldPoint)var6) ? 1 : 0)) {
                Log.info((String)llllIllIlIII[llllIllIlIIl[1]]);
                return llllIllIlIIl[1];
            }
            if (ag.lIIlIIIllIIIlII(var8.contains(var7.getWorldLocation()) ? 1 : 0) && ag.lIIlIIIllIIIIIl(var8.contains((WorldPoint)var6) ? 1 : 0) && ag.lIIlIIIllIIIlIl(var6.distanceTo((Locatable)var7), llllIllIlIIl[2])) {
                EquipmentSetup var9 = (EquipmentSetup)var11.cK.totemGear().selected(EquipmentSetup.class);
                var11.ec.a(var7, var9);
                0;
                return llllIllIlIIl[3];
            }
        }
        if (ag.lIIlIIIllIIIIIl(var11.cK.assistantMode() ? 1 : 0)) {
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
        dS = LoggerFactory.getLogger(AttackingParasiteTask.class);
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

