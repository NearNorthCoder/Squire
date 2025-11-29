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

@TaskDesc(name="Moving to next floor", priority=10)
public class MovingToNextFloorTask
extends ThievingTaskBase {
    
    static final  Set<Integer> A;

    private static void lIIlIlIIlIllllI() {
        llllllIlIIll = new String[lllllllIIIII[12]];
        g.llllllIlIIll[g.lllllllIIIII[0]] = "Search";
        g.llllllIlIIll[g.lllllllIIIII[1]] = "Quick-leave";
        g.llllllIlIIll[g.lllllllIIIII[2]] = "Pick-lock";
        g.llllllIlIIll[g.lllllllIIIII[3]] = "Tomb Door";
        g.llllllIlIIll[g.lllllllIIIII[4]] = "Pick-lock";
        g.llllllIlIIll[g.lllllllIIIII[5]] = "Tomb Door";
        g.llllllIlIIll[g.lllllllIIIII[6]] = "Quick-leave";
        g.llllllIlIIll[g.lllllllIIIII[7]] = "Grand Gold Chest";
        g.llllllIlIIll[g.lllllllIIIII[8]] = "Search";
    }

    private static boolean lIIlIlIIllIIIlI(Object object) {
        return object != null;
    }

    private static boolean lIIlIlIIllIIIII(Object object) {
        return object == null;
    }

        return String.valueOf(var1);
    }

    @Inject
    protected MovingToNextFloorTask(a a2, Client client) {
        super(a2, client);
    }

    static {
        g.lIIlIlIIlIlllll();
        g.lIIlIlIIlIllllI();
        A = ImmutableSet.of((Object)lllllllIIIII[9], (Object)lllllllIIIII[10], (Object)lllllllIIIII[11]);
    }

    private static boolean lIIlIlIIllIIIIl(int n2) {
        return n2 != 0;
    }

    private static boolean lIIlIlIIllIIIll(int n2) {
        return n2 == 0;
    }

    private static boolean lIIlIlIIllIIlII(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean j() {
        void var2_2;
        TileObject var2;
        void var3;
        g var4;
        c c2 = c.f();
        if (g.lIIlIlIIllIIIII((Object)c2)) {
            return lllllllIIIII[0];
        }
        if (g.lIIlIlIIllIIIIl(var4.D.a((GameEnum) ar3) ? 1 : 0) && g.lIIlIlIIllIIIlI(var2 = TileObjects.getNearest(tileObject -> {
            int n2;
            if (g.lIIlIlIIllIIIIl(tileObject.getName().equals(llllllIlIIll[lllllllIIIII[7]]) ? 1 : 0)) {
                String[] stringArray = new String[lllllllIIIII[1]];
                stringArray[g.lllllllIIIII[0]] = llllllIlIIll[lllllllIIIII[8]];
                if (g.lIIlIlIIllIIIIl(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lllllllIIIII[1];

                    if (-3 <= 0) return n2 != 0;
                    return ((0x1A ^ 0x59 ^ (0x17 ^ 1)) & (88 + 69 - 131 + 174 ^ 145 + 2 - 93 + 103 ^ -1)) != 0;
                }
            }
            n2 = lllllllIIIII[0];
            return n2 != 0;
        }))) {
            return lllllllIIIII[0];
        }
        if (g.lIIlIlIIllIIIIl(var4.D.b((GameEnum) ar3) ? 1 : 0) && g.lIIlIlIIllIIIlI(var2 = TileObjects.getNearest(tileObject -> {
            int n2;
            if (g.lIIlIlIIllIIIIl(A.contains(tileObject.getActualId()) ? 1 : 0) && g.lIIlIlIIllIIIIl(Reachable.isInteractable((Locatable)tileObject) ? 1 : 0)) {
                n2 = lllllllIIIII[1];

                if (2 <= 0) {
                    return (1 & ~1) != 0;
                }
            } else {
                n2 = lllllllIIIII[0];
            }
            return n2 != 0;
        }))) {
            var2.interact(llllllIlIIll[lllllllIIIII[0]]);
            return lllllllIIIII[1];
        }
        if (g.lIIlIlIIllIIIll(c.MovingToNextFloorTask() ? 1 : 0)) {
            var2 = TileObjects.getNearest(tileObject -> {
                int n2;
                if (g.lIIlIlIIllIIIIl(tileObject.getName().equals(llllllIlIIll[lllllllIIIII[5]]) ? 1 : 0) && g.lIIlIlIIllIIIIl(Reachable.isInteractable((Locatable)tileObject) ? 1 : 0)) {
                    String[] stringArray = new String[lllllllIIIII[1]];
                    stringArray[g.lllllllIIIII[0]] = llllllIlIIll[lllllllIIIII[6]];
                    if (g.lIIlIlIIllIIIIl(tileObject.hasAction(stringArray) ? 1 : 0)) {
                        n2 = lllllllIIIII[1];

                        if (((5 ^ 0x5D ^ (0xF1 ^ 0x97)) & (18 + 25 - -59 + 55 ^ 82 + 12 - 28 + 97 ^ -1)) == 0) return n2 != 0;
                        return ((0x28 ^ 0x51 ^ (0x6D ^ 0xD)) & (24 + 41 - -47 + 52 ^ 106 + 44 - 1 + 40 ^ -1)) != 0;
                    }
                }
                n2 = lllllllIIIII[0];
                return n2 != 0;
            });
            if (g.lIIlIlIIllIIIlI(var2)) {
                var2.interact(llllllIlIIll[lllllllIIIII[1]]);
                return lllllllIIIII[1];
            }
            return lllllllIIIII[0];
        }
        var2 = TileObjects.getNearest(tileObject -> {
            int n2;
            if (g.lIIlIlIIllIIIIl(tileObject.getName().equals(llllllIlIIll[lllllllIIIII[3]]) ? 1 : 0)) {
                String[] stringArray = new String[lllllllIIIII[1]];
                stringArray[g.lllllllIIIII[0]] = llllllIlIIll[lllllllIIIII[4]];
                if (g.lIIlIlIIllIIIIl(tileObject.hasAction(stringArray) ? 1 : 0) && g.lIIlIlIIllIIIIl(Reachable.isInteractable((Locatable)tileObject) ? 1 : 0)) {
                    n2 = lllllllIIIII[1];

                    if (((0x33 ^ 0xC ^ (0xDD ^ 0xBB)) & (0x71 ^ 0x6D ^ (0xC2 ^ 0x87) ^ -1)) == 0) return n2 != 0;
                    return ((0xA9 ^ 0x8A ^ (0x17 ^ 0x28)) & (0xAB ^ 0x89 ^ (0x29 ^ 0x17) ^ -1)) != 0;
                }
            }
            n2 = lllllllIIIII[0];
            return n2 != 0;
        });
        if (g.lIIlIlIIllIIIII(var2)) {
            return lllllllIIIII[0];
        }
        var2_2.interact(llllllIlIIll[lllllllIIIII[2]]);
        return lllllllIIIII[1];
    }
}

