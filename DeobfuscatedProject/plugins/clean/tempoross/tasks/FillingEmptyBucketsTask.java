/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.Locatable
 *  net.runelite.api.Player
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.SceneEntity
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.tempoross.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.tempoross.SquireTempoross;
import gg.squire.tempoross.SquireTemporossConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Locatable;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.unethicalite.api.SceneEntity;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import gg.squire.tempoross.tasks.TemporossManager;
import gg.squire.tempoross.tasks.TemporossTaskBase;

@TaskDesc(name="Filling empty buckets", priority=10, blocking=true)
public class FillingEmptyBucketsTask
extends TemporossTaskBase {
    
    private  int ak;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean ak() {
        int n2;
        if (h.lIllIIlIIIlIIlI(this.ar.l() ? 1 : 0) && h.lIllIIlIIIlIIll(this.ar.L() ? 1 : 0) && h.lIllIIlIIIlIIlI(Inventory.contains(item -> {
            int n2;
            if (h.lIllIIlIIIlIIlI(item.getName().contains(lIIlllIIIIIII[lIIlllIIIIIll[10]]) ? 1 : 0)) {
                String[] stringArray = new String[lIIlllIIIIIll[3]];
                stringArray[h.lIIlllIIIIIll[0]] = lIIlllIIIIIII[lIIlllIIIIIll[11]];
                if (h.lIllIIlIIIlIIll(item.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lIIlllIIIIIll[3];

                    if (-1 <= 0) return n2 != 0;
                    return false;
                }
            }
            n2 = lIIlllIIIIIll[0];
            return n2 != 0;
        }) ? 1 : 0)) {
            int[] nArray = new int[lIIlllIIIIIll[1]];
            nArray[h.lIIlllIIIIIll[0]] = lIIlllIIIIIll[2];
            nArray[h.lIIlllIIIIIll[3]] = lIIlllIIIIIll[4];
            if (h.lIllIIlIIIlIIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                n2 = lIIlllIIIIIll[3];

                if (1 != 0) return n2 != 0;
                return ((21 + 144 - 109 + 142 ^ 43 + 74 - 36 + 50) & (0x1D ^ 0x50 ^ (0x64 ^ 0x6C) ^ -1)) != 0;
            }
        }
        n2 = lIIlllIIIIIll[0];
        return n2 != 0;
    }

    static {
        h.lIllIIlIIIlIIIl();
        h.lIllIIlIIIIllII();
    }

    private static boolean lIllIIlIIIlIlII(int n2) {
        return n2 > 0;
    }

        return String.valueOf(var1);
    }

    private static boolean lIllIIlIIIlIIlI(int n2) {
        return n2 != 0;
    }

    private static void lIllIIlIIIIllII() {
        lIIlllIIIIIII = new String[lIIlllIIIIIll[12]];
        h.lIIlllIIIIIII[h.lIIlllIIIIIll[0]] = "Fill-bucket";
        h.lIIlllIIIIIII[h.lIIlllIIIIIll[3]] = "Bucket";
        h.lIIlllIIIIIII[h.lIIlllIIIIIll[1]] = "Empty";
        h.lIIlllIIIIIII[h.lIIlllIIIIIll[5]] = "Water pump";
        h.lIIlllIIIIIII[h.lIIlllIIIIIll[6]] = "Fill-bucket";
        h.lIIlllIIIIIII[h.lIIlllIIIIIll[8]] = "Bucket";
        h.lIIlllIIIIIII[h.lIIlllIIIIIll[9]] = "Empty";
        h.lIIlllIIIIIII[h.lIIlllIIIIIll[10]] = "Bucket";
        h.lIIlllIIIIIII[h.lIIlllIIIIIll[11]] = "Empty";
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean al() {
        void var2_2;
        h var2;
        Player player = Players.getLocal();
        if (h.lIllIIlIIIlIlII(this.ak)) {
            if (h.lIllIIlIIIlIlIl(player) && h.lIllIIlIIIlIIlI(player.isMoving() ? 1 : 0)) {
                return lIIlllIIIIIll[3];
            }
            var2.ak -= lIIlllIIIIIll[3];
            if (h.lIllIIlIIIlIIll(Inventory.contains(item -> {
                int n2;
                if (h.lIllIIlIIIlIIlI(item.getName().contains(lIIlllIIIIIII[lIIlllIIIIIll[8]]) ? 1 : 0)) {
                    String[] stringArray = new String[lIIlllIIIIIll[3]];
                    stringArray[h.lIIlllIIIIIll[0]] = lIIlllIIIIIII[lIIlllIIIIIll[9]];
                    if (h.lIllIIlIIIlIIll(item.hasAction(stringArray) ? 1 : 0)) {
                        n2 = lIIlllIIIIIll[3];

                        if (((0x4A ^ 0xF ^ (0xDF ^ 0x96)) & (0xCF ^ 0x85 ^ (0x3C ^ 0x7A) ^ -1)) == 0) return n2 != 0;
                        return ((0xBB ^ 0xB2 ^ (0x6E ^ 0x6B)) & (0x36 ^ 0x32 ^ (0x2A ^ 0x22) ^ -1)) != 0;
                    }
                }
                n2 = lIIlllIIIIIll[0];
                return n2 != 0;
            }) ? 1 : 0)) {
                var2.ak = lIIlllIIIIIll[0];
                return lIIlllIIIIIll[0];
            }
            return lIIlllIIIIIll[3];
        }
        TileObject var3 = TileObjects.getNearest(tileObject -> {
            int n2;
            if (h.lIllIIlIIIlIIlI(tileObject.getName().contains(lIIlllIIIIIII[lIIlllIIIIIll[5]]) ? 1 : 0)) {
                String[] stringArray = new String[lIIlllIIIIIll[3]];
                stringArray[h.lIIlllIIIIIll[0]] = lIIlllIIIIIII[lIIlllIIIIIll[6]];
                if (h.lIllIIlIIIlIIlI(tileObject.hasAction(stringArray) ? 1 : 0) && h.lIllIIlIIIlIllI(tileObject.getWorldLocation().distanceTo(this.ar.N().ag()), lIIlllIIIIIll[7])) {
                    n2 = lIIlllIIIIIll[3];

                    if (1 != -1) return n2 != 0;
                    return false;
                }
            }
            n2 = lIIlllIIIIIll[0];
            return n2 != 0;
        });
        if (!h.lIllIIlIIIlIlIl(var3) || h.lIllIIlIIIlIIlI(var2.au.a((Locatable)var3) ? 1 : 0)) {
            return lIIlllIIIIIll[3];
        }
        if (h.lIllIIlIIIlIIlI(var2.au.a((Locatable)var3) ? 1 : 0)) {
            return var2.au.b((SceneEntity)var3);
        }
        var2_2.interact(lIIlllIIIIIII[lIIlllIIIIIll[0]]);
        int n2 = Inventory.getAll(item -> {
            int n2;
            if (h.lIllIIlIIIlIIlI(item.getName().contains(lIIlllIIIIIII[lIIlllIIIIIll[3]]) ? 1 : 0)) {
                String[] stringArray = new String[lIIlllIIIIIll[3]];
                stringArray[h.lIIlllIIIIIll[0]] = lIIlllIIIIIII[lIIlllIIIIIll[1]];
                if (h.lIllIIlIIIlIIll(item.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lIIlllIIIIIll[3];

                    if (2 < (0xE6 ^ 0xA1 ^ (9 ^ 0x4A))) return n2 != 0;
                    return ((195 + 180 - 343 + 219 ^ 26 + 159 - 83 + 59) & (7 ^ 0x19 ^ (0xFF ^ 0xBB) ^ -1)) != 0;
                }
            }
            n2 = lIIlllIIIIIll[0];
            return n2 != 0;
        }).size();
        this.ak = n2 * lIIlllIIIIIll[1];
        return lIIlllIIIIIll[3];
    }

    @Inject
    protected FillingEmptyBucketsTask(a a2, SquireTemporossConfig squireTemporossConfig, Client client, SquireTempoross squireTempoross) {
        super(a2, squireTemporossConfig, client, squireTempoross);
        this.ak = lIIlllIIIIIll[0];
    }

    private static boolean lIllIIlIIIlIllI(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIllIIlIIIlIIll(int n2) {
        return n2 == 0;
    }

    private static boolean lIllIIlIIIlIlIl(Object object) {
        return object != null;
    }
}

