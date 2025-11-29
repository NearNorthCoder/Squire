/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.Locatable
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.movement.Reachable
 */
package gg.squire.thieving.tasks;

import com.google.common.collect.ImmutableSet;
import gg.squire.client.plugins.fw.TaskDesc;
import java.util.Set;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.Locatable;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Reachable;
import gg.squire.thieving.tasks.ThievingManager;
import gg.squire.thieving.tasks.GameEnum;
import gg.squire.thieving.tasks.ThievingTaskBase;

@TaskDesc(name="Plundering Urns", priority=1)
public class PlunderingUrnsTask
extends ThievingTaskBase {
    
    private final  Set<Integer> E;

    static {
        l.var3();
        l.var4();
    }

    private static void var3() {
        var1 = new int[7];
        l.var1[0] = -(0xFFFFFC8F & 0x27F3) & (0xFFFFFF9F & 0x77EF);
        l.var1[1] = -(0xFFFFAFB9 & 0x7C77) & (0xFFFFFF3E & Short.MAX_VALUE);
        l.var1[2] = -(0xFFFFE4F5 & 0x1FDB) & (0xFFFFF7FF & 0x5FDF);
        l.var1[3] = (0x8D ^ 0x89) & ~(0x73 ^ 0x77);
        l.var1[4] = 1;
        l.var1[5] = 0xA ^ 2;
        l.var1[6] = 2;
    }

    private static void var4() {
        var2 = new String[var1[4]];
        l.var2[l.var1[3]] = "Search";
    }

    private static boolean var5(int n2) {
        return n2 != 0;
    }

    @Inject
    protected PlunderingUrnsTask(a a2, Client client) {
        super(a2, client);
        this.E = ImmutableSet.of((Object)var1[0], (Object)var1[1], (Object)var1[2]);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean j() {
        void var2_2;
        void var6;
        l var7;
        c c2 = c.f();
        if (l.var8((Object)c2)) {
            return var1[3];
        }
        if (l.var9(var7.D.b((c)var6) ? 1 : 0)) {
            return var1[3];
        }
        TileObject var10 = TileObjects.getNearest(tileObject -> {
            int n2;
            if (l.var5(this.D.h.contains(tileObject.getActualId()) ? 1 : 0) && l.var5(Reachable.isInteractable((Locatable)tileObject) ? 1 : 0)) {
                n2 = var1[4];
                0;
                if null != null {
                    return ((1 ^ (0x17 ^ 0x4B)) & (19 + 54 - -102 + 21 ^ 67 + 12 - -20 + 54 ^ -1)) != 0;
                }
            } else {
                n2 = var1[3];
            }
            return n2 != 0;
        });
        if (l.var8(var10)) {
            return var1[3];
        }
        var2_2.interact(var2[var1[3]]);
        return var1[4];
    }

        catch (Exception var16) {
            var16.printStackTrace();
            return null;
        }
    }

    private static boolean var8(Object object) {
        return object == null;
    }

    private static boolean var9(int n2) {
        return n2 == 0;
    }
}

