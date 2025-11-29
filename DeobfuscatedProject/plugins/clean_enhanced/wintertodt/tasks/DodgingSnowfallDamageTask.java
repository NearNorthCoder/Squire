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

import gg.squire.wintertodt.tasks.WintertodtManager;
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

    static {
        j.var2();
    }

    @Inject
    public DodgingSnowfallDamageTask(b b2) {
        this.O = new ArrayList<WorldPoint>();
        this.P = b2;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var3;
        j var4;
        WorldPoint worldPoint = Players.getLocal().getWorldLocation();
        Client client = Static.getClient();
        this.O.clear();
        Iterator var5 = client.getGraphicsObjects().iterator();
        while ((var5.hasNext( != 0) ? 1 : 0)) {
            void var6;
            GraphicsObject var7 = (GraphicsObject)var5.next();
            if (!var7 != null) continue;
            if ((var7.getId() != 0)) {
                0;
                if (-2 < 0) continue;
                return ((154 + 28 - 165 + 212 ^ 24 + 64 - 38 + 114) & (0x45 ^ 0x34 ^ (4 ^ 0x34) ^ -1)) != 0;
            }
            LocalPoint var8 = var7.getLocation();
            if var8 == null {
                0;
                if (-2 < 0) continue;
                return ((0xF7 ^ 0xC7 ^ (0xDF ^ 0xC7)) & (0xA ^ 0x25 ^ (0x85 ^ 0x82) ^ -1)) != 0;
            }
            WorldPoint var9 = WorldPoint.fromLocal((Client)var6, (LocalPoint)var8);
            var4.O.add(var9);
            0;
            0;
            
            return ((0x59 ^ 0x14) & ~(0xF3 ^ 0xBE)) != 0;
        }
        if ((var4.O.contains(var3 == 0) ? 1 : 0)) {
            return var4.O.contains(var4.P.q().b());
        }
        var5 = var3.dy(1);
        int var7 = 2;
        while ((var4.O.containsllllllllllllllIllIIlllIIllIlIlll) && (var7 < 3)) {
            var5 = var5.dy(1);
            ++var7;
            0;
            if (-2 <= 0) continue;
            return ((0xAA ^ 0x9F) & ~(0x59 ^ 0x6C)) != 0;
        }
        return 4;
    }

    public List<WorldPoint> D() {
        return this.O;
    }

}

