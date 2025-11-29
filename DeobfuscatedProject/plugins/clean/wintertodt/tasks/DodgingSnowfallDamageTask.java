/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.GraphicsObject
 *  net.runelite.api.coords.LocalPoint
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.client.Static
 */
package gg.squire.wintertodt.tasks;

import gg.squire.wintertodt.tasks.BHelper;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import net.runelite.api.Client;
import net.runelite.api.GraphicsObject;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.client.Static;

@TaskDesc(name="Dodging snowfall damage", priority=5, blocking=true)
public class DodgingSnowfallDamageTask
extends Task {
    
    private final  b P;
    private final  List<WorldPoint> O;

    private static boolean llIIIIllIlIllII(int n2, int n3) {
        return n2 < n3;
    }

    static {
        j.llIIIIllIlIIllI();
    }

    private static boolean llIIIIllIlIlIIl(int n2, int n3) {
        return n2 != n3;
    }

    @Inject
    public DodgingSnowfallDamageTask(b b2) {
        this.O = new ArrayList<WorldPoint>();
        this.P = b2;
    }

    private static boolean llIIIIllIlIlIll(int n2) {
        return n2 == 0;
    }

    private static boolean llIIIIllIlIIlll(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1;
        j var2;
        WorldPoint worldPoint = Players.getLocal().getWorldLocation();
        Client client = Static.getClient();
        this.O.clear();
        Iterator var3 = client.getGraphicsObjects().iterator();
        while (j.llIIIIllIlIIlll(var3.hasNext() ? 1 : 0)) {
            void var4;
            GraphicsObject var5 = (GraphicsObject)var3.next();
            if (!j.llIIIIllIlIlIII(var5)) continue;
            if (j.llIIIIllIlIlIIl(var5.getId(), lIlIlllllIIll[0])) {

                if (-2 < 0) continue;
                return ((154 + 28 - 165 + 212 ^ 24 + 64 - 38 + 114) & (0x45 ^ 0x34 ^ (4 ^ 0x34) ^ -1)) != 0;
            }
            LocalPoint var6 = var5.getLocation();
            if (j.llIIIIllIlIlIlI(var6)) {

                if (-2 < 0) continue;
                return ((0xF7 ^ 0xC7 ^ (0xDF ^ 0xC7)) & (0xA ^ 0x25 ^ (0x85 ^ 0x82) ^ -1)) != 0;
            }
            WorldPoint var7 = WorldPoint.fromLocal((Client)var4, (LocalPoint)var6);
            var2.O.add(var7);

            if (3 >= 0) continue;
            return false;
        }
        if (j.llIIIIllIlIlIll(var2.O.contains(var1) ? 1 : 0)) {
            return var2.O.contains(var2.P.q().b());
        }
        var3 = var1.dy(lIlIlllllIIll[1]);
        int var5 = lIlIlllllIIll[2];
        while (j.llIIIIllIlIIlll(var2.O.contains(var3) ? 1 : 0) && j.llIIIIllIlIllII(var5, lIlIlllllIIll[3])) {
            var3 = var3.dy(lIlIlllllIIll[1]);
            ++var5;

            if (-2 <= 0) continue;
            return false;
        }
        return lIlIlllllIIll[4];
    }

    private static boolean llIIIIllIlIlIII(Object object) {
        return object != null;
    }

    public List<WorldPoint> D() {
        return this.O;
    }

    private static boolean llIIIIllIlIlIlI(Object object) {
        return object == null;
    }
}

