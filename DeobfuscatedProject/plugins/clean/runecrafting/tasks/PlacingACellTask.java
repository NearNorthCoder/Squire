/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Item
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 */
package gg.squire.runecrafting.tasks;

import gg.squire.runecrafting.tasks.GameEnum14;
import gg.squire.runecrafting.tasks.RunecraftingTaskBase;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.runecrafting.SquireGOTRPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import java.util.Comparator;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;

@TaskDesc(name="Placing a cell", priority=3, blocking=true)
public class PlacingACellTask
extends RunecraftingTaskBase {
    private static final  Comparator<TileObject> be;

    private static boolean lllllllIIllIll(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lllllllIIlllII(Object object) {
        return object != null;
    }

        return String.valueOf(var1);
    }

    private static boolean lllllllIIlllIl(int n2, int n3) {
        return n2 < n3;
    }

    @Inject
    public PlacingACellTask(SquireGOTRPlugin squireGOTRPlugin) {
        c[] cArray = new c[llIIlllIIlll[0]];
        cArray[v.llIIlllIIlll[1]] = c.ACTIVE;
        cArray[v.llIIlllIIlll[2]] = c.FINISHING;
        super(squireGOTRPlugin, cArray);
    }

    private static boolean lllllllIIllIII(Object object) {
        return object == null;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    protected boolean ak() {
        void var4_4;
        TileObject var2;
        int var3;
        int n2;
        v var4;
        void var5;
        Item item = this.aV.e();
        if (!v.lllllllIIlIlll(this.aV.g() ? 1 : 0) || v.lllllllIIllIII(item)) {
            return llIIlllIIlll[1];
        }
        if (v.lllllllIIlIlll(var5.getName().contains(llIIlllIIllI[llIIlllIIlll[1]]) ? 1 : 0) && v.lllllllIIlIlll(var4.aW.craftGuardian() ? 1 : 0)) {
            return llIIlllIIlll[1];
        }
        Player var6 = Players.getLocal();
        if (!v.lllllllIIllIIl(SquireGOTRPlugin.g.contains((Locatable)var6) ? 1 : 0) || v.lllllllIIlIlll(SquireGOTRPlugin.h.contains((Locatable)var6) ? 1 : 0)) {
            return llIIlllIIlll[1];
        }
        if (v.lllllllIIlIlll(var5.getName().contains(llIIlllIIllI[llIIlllIIlll[2]]) ? 1 : 0)) {
            n2 = llIIlllIIlll[3];

        } else {
            n2 = var3 = llIIlllIIlll[4];
        }
        if (v.lllllllIIllIII(var2 = (TileObject)TileObjects.getAll(tileObject -> tileObject.getName().contains(llIIlllIIllI[llIIlllIIlll[5]])).stream().min(be.thenComparing(TileObject::getId).thenComparing(tileObject -> tileObject.distanceTo((Locatable)var6))).orElse(null))) {
            return llIIlllIIlll[1];
        }
        if (v.lllllllIIllIlI(var2.distanceTo((Locatable)var6), var3)) {
            return llIIlllIIlll[1];
        }
        if (v.lllllllIIlIlll(var6.isMoving() ? 1 : 0)) {
            return llIIlllIIlll[2];
        }
        var4_4.interact(llIIlllIIllI[llIIlllIIlll[0]]);
        return llIIlllIIlll[2];
    }

    private static void lllllllIIlIlIl() {
        llIIlllIIllI = new String[llIIlllIIlll[10]];
        v.llIIlllIIllI[v.llIIlllIIlll[1]] = "Overcharged";
        v.llIIlllIIllI[v.llIIlllIIlll[2]] = "Weak";
        v.llIIlllIIllI[v.llIIlllIIlll[0]] = "Place-cell";
        v.llIIlllIIllI[v.llIIlllIIlll[5]] = "cell tile";
        v.llIIlllIIllI[v.llIIlllIIlll[8]] = "null";
        v.llIIlllIIllI[v.llIIlllIIlll[9]] = "null";
    }

    private static boolean lllllllIIlIlll(int n2) {
        return n2 != 0;
    }

    static {
        v.lllllllIIlIllI();
        v.lllllllIIlIlIl();
        be = (tileObject, tileObject2) -> {
            void var4_4;
            int n2;
            int n3;
            void var7;
            void var8;
            NPC nPC2 = NPCs.getNearest((WorldPoint)tileObject.getWorldLocation(), nPC -> {
                boolean bl;
                if (!v.lllllllIIlllII(nPC.getName()) || v.lllllllIIlIlll(llIIlllIIllI[llIIlllIIlll[9]].equals(nPC.getName()) ? 1 : 0)) {
                    bl = llIIlllIIlll[2];

                    if (((0x74 ^ 0x7A) & ~(0x69 ^ 0x67)) > 0) {
                        return false;
                    }
                } else {
                    bl = llIIlllIIlll[1];
                }
                return bl;
            });
            NPC nPC3 = NPCs.getNearest((WorldPoint)tileObject2.getWorldLocation(), nPC -> {
                int n2;
                if (!v.lllllllIIlllII(nPC.getName()) || v.lllllllIIlIlll(llIIlllIIllI[llIIlllIIlll[8]].equals(nPC.getName()) ? 1 : 0)) {
                    n2 = llIIlllIIlll[2];

                    if (3 == 2) {
                        return false;
                    }
                } else {
                    n2 = llIIlllIIlll[1];
                }
                return n2 != 0;
            });
            if (v.lllllllIIllIII(nPC2) && v.lllllllIIllIII(nPC3)) {
                return llIIlllIIlll[1];
            }
            if (v.lllllllIIllIII(var8)) {
                return llIIlllIIlll[2];
            }
            if (v.lllllllIIllIII(var7)) {
                return llIIlllIIlll[6];
            }
            if (v.lllllllIIllIll(var8.getHealthRatio(), llIIlllIIlll[6])) {
                n3 = llIIlllIIlll[7];

            } else {
                int var9;
                n3 = var9 = var8.getHealthRatio();
            }
            if (v.lllllllIIllIll(var7.getHealthRatio(), llIIlllIIlll[6])) {
                n2 = llIIlllIIlll[7];

                if (((0x6A ^ 0x4C ^ 3) & (0x4D ^ 0x71 ^ (0x64 ^ 0x7D) ^ -1)) != 0) {
                    return (3 ^ (0x4B ^ 0x6A)) & (6 + 48 - -97 + 13 ^ 103 + 26 - 88 + 93 ^ -1);
                }
            } else {
                n2 = var7.getHealthRatio();
            }
            int n4 = n2;
            return Integer.compare((int)var4_4, n4);
        };
    }

    private static boolean lllllllIIllIlI(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lllllllIIllIIl(int n2) {
        return n2 == 0;
    }
}

