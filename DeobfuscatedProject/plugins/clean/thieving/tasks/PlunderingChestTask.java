/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.Locatable
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.movement.Reachable
 */
package gg.squire.thieving.tasks;

import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
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

@TaskDesc(name="Plundering Chest", priority=10)
public class PlunderingChestTask
extends ThievingTaskBase {

    private static boolean lIIlIlIlIIIIIII(Object object) {
        return object != null;
    }

    private static boolean lIIlIlIIllllllI(int n2) {
        return n2 == 0;
    }

    @Inject
    protected PlunderingChestTask(a a2, Client client) {
        super(a2, client);
    }

    private static void lIIlIlIIllllIll() {
        lllllllIIllI = new String[lllllllIIlll[4]];
        i.lllllllIIllI[i.lllllllIIlll[0]] = "Grand Gold Chest";
        i.lllllllIIllI[i.lllllllIIlll[1]] = "Search";
        i.lllllllIIllI[i.lllllllIIlll[3]] = "Search";
    }

    private static boolean lIIlIlIIlllllIl(Object object) {
        return object == null;
    }

    private static boolean lIIlIlIlIIIIIIl(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIIlIlIIlllllll(int n2) {
        return n2 != 0;
    }

        return String.valueOf(var1);
    }

    static {
        i.lIIlIlIIlllllII();
        i.lIIlIlIIllllIll();
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean j() {
        void var2_2;
        block9: {
            block8: {
                TileObject var2;
                void var3;
                i var4;
                c c2 = c.f();
                if (i.lIIlIlIIlllllIl((Object)c2)) {
                    return lllllllIIlll[0];
                }
                if (i.lIIlIlIIllllllI(var4.D.a((GameEnum) ar3) ? 1 : 0)) {
                    return lllllllIIlll[0];
                }
                if (i.lIIlIlIIlllllll(var4.D.b((GameEnum) ar3) ? 1 : 0) && i.lIIlIlIlIIIIIII(var2 = TileObjects.getNearest(tileObject -> {
                    int n2;
                    if (i.lIIlIlIIlllllll(this.D.h.contains(tileObject.getActualId()) ? 1 : 0) && i.lIIlIlIIlllllll(Reachable.isInteractable((Locatable)tileObject) ? 1 : 0)) {
                        n2 = lllllllIIlll[1];

                        }
                    } else {
                        n2 = lllllllIIlll[0];
                    }
                    return n2 != 0;
                }))) {
                    return lllllllIIlll[0];
                }
                if (i.lIIlIlIIlllllll(var4.D.c((GameEnum) ar3) ? 1 : 0)) {
                    int[] nArray = new int[lllllllIIlll[1]];
                    nArray[i.lllllllIIlll[0]] = lllllllIIlll[2];
                    var2 = TileObjects.getNearest((int[])nArray);
                    if (i.lIIlIlIlIIIIIII(var2)) {
                        return lllllllIIlll[0];
                    }
                }
                String[] stringArray = new String[lllllllIIlll[1]];
                stringArray[i.lllllllIIlll[0]] = lllllllIIllI[lllllllIIlll[0]];
                var2 = TileObjects.getNearest((String[])stringArray);
                if (!i.lIIlIlIlIIIIIII(var2)) break block8;
                String[] stringArray2 = new String[lllllllIIlll[1]];
                stringArray2[i.lllllllIIlll[0]] = lllllllIIllI[lllllllIIlll[1]];
                if (!i.lIIlIlIIllllllI(var2.hasAction(stringArray2) ? 1 : 0)) break block9;
            }
            return lllllllIIlll[0];
        }
        var2_2.interact(lllllllIIllI[lllllllIIlll[3]]);
        return lllllllIIlll[1];
    }
}

