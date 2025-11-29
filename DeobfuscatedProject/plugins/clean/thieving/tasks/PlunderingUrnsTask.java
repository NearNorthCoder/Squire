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
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
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
        l.lIIlIlIIlIIIIlI();
        l.lIIlIlIIlIIIIIl();
    }

    private static void lIIlIlIIlIIIIIl() {
        llllllIllIII = new String[llllllIllIIl[4]];
        l.llllllIllIII[l.llllllIllIIl[3]] = "Search";
    }

    private static boolean lIIlIlIIlIIIlIl(int n2) {
        return n2 != 0;
    }

    @Inject
    protected PlunderingUrnsTask(a a2, Client client) {
        super(a2, client);
        this.E = ImmutableSet.of((Object)llllllIllIIl[0], (Object)llllllIllIIl[1], (Object)llllllIllIIl[2]);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean j() {
        void var2_2;
        void var1;
        l var2;
        c c2 = c.f();
        if (l.lIIlIlIIlIIIIll((Object)c2)) {
            return llllllIllIIl[3];
        }
        if (l.lIIlIlIIlIIIlII(var2.D.b((GameEnum) ar1) ? 1 : 0)) {
            return llllllIllIIl[3];
        }
        TileObject var3 = TileObjects.getNearest(tileObject -> {
            int n2;
            if (l.lIIlIlIIlIIIlIl(this.D.h.contains(tileObject.getActualId()) ? 1 : 0) && l.lIIlIlIIlIIIlIl(Reachable.isInteractable((Locatable)tileObject) ? 1 : 0)) {
                n2 = llllllIllIIl[4];

                }
            } else {
                n2 = llllllIllIIl[3];
            }
            return n2 != 0;
        });
        if (l.lIIlIlIIlIIIIll(var3)) {
            return llllllIllIIl[3];
        }
        var2_2.interact(llllllIllIII[llllllIllIIl[3]]);
        return llllllIllIIl[4];
    }

    private static boolean lIIlIlIIlIIIIll(Object object) {
        return object == null;
    }

    private static boolean lIIlIlIIlIIIlII(int n2) {
        return n2 == 0;
    }
}

