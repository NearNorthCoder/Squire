/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  javax.inject.Inject
 *  net.runelite.api.Actor
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.runelite.api.TileObject
 *  net.runelite.api.World
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Worlds
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 */
package gg.squire.thieving.tasks;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.thieving.SquireThieving;
import gg.squire.thieving.SquireThievingConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Actor;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.runelite.api.World;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Worlds;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import gg.squire.thieving.tasks.ThievingTaskBase;
import gg.squire.thieving.tasks.GameEnum32;

@TaskDesc(name="Doing Vyre stuff", priority=133337, blocking=true)
public class DoingVyreStuffTask
extends ThievingTaskBase {
    private final  int[] at;
    
    private final  WorldArea ap;
    private final  WorldArea aq;
    
    private final  WorldPoint as;
    private final  WorldPoint ar;

    private static boolean lIllIIIIlllIIII(int n2, int n3) {
        return n2 != n3;
    }

    private boolean a(Actor actor) {
        boolean bl;
        if (!A.lIllIIIIllIlIlI(this.ap.contains(actor.getWorldLocation()) ? 1 : 0) || A.lIllIIIIllIllII(this.aq.contains(actor.getWorldLocation()) ? 1 : 0)) {
            bl = lIIllIlIlllIl[12];

            if (2 > 2) {
                return false;
            }
        } else {
            bl = lIIllIlIlllIl[4];
        }
        return bl;
    }

    private static boolean lIllIIIIllIllll(int n2, int n3) {
        return n2 == n3;
    }

    private TileObject I() {
        String[] stringArray = new String[lIIllIlIlllIl[12]];
        stringArray[A.lIIllIlIlllIl[4]] = lIIllIlIlllII[lIIllIlIlllIl[14]];
        return TileObjects.getNearest((WorldPoint)this.ar, (String[])stringArray);
    }

    private boolean J() {
        TileObject tileObject = this.I();
        if (A.lIllIIIIllIlIll(tileObject)) {
            return lIIllIlIlllIl[4];
        }
        String[] stringArray = new String[lIIllIlIlllIl[12]];
        stringArray[A.lIIllIlIlllIl[4]] = lIIllIlIlllII[lIIllIlIlllIl[10]];
        return tileObject.hasAction(stringArray);
    }

    private static boolean lIllIIIIllIlIll(Object object) {
        return object == null;
    }

        return String.valueOf(var1);
    }

    private static void lIllIIIIllIIlll() {
        lIIllIlIlllII = new String[lIIllIlIlllIl[2]];
        A.lIIllIlIlllII[A.lIIllIlIlllIl[4]] = "Close";
        A.lIIllIlIlllII[A.lIIllIlIlllIl[12]] = "Wear";
        A.lIIllIlIlllII[A.lIIllIlIlllIl[14]] = "Door";
        A.lIIllIlIlllII[A.lIIllIlIlllIl[10]] = "Close";
        A.lIIllIlIlllII[A.lIIllIlIlllIl[3]] = "We are at {}, the destination is {}. Equality: {}";
        A.lIIllIlIlllII[A.lIIllIlIlllIl[17]] = "Close";
        A.lIIllIlIlllII[A.lIIllIlIlllIl[7]] = "Open";
    }

    private static boolean lIllIIIIllIllIl(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * WARNING - void declaration
     */
    private boolean e(boolean bl) {
        WorldPoint worldPoint;
        A var2;
        void var3;
        TileObject tileObject = this.I();
        if (!A.lIllIIIIllIlllI(tileObject) || A.lIllIIIIllIlIlI(this.J() ? 1 : 0)) {
            return lIIllIlIlllIl[4];
        }
        Player var4 = Players.getLocal();
        if (A.lIllIIIIllIlIll(var4)) {
            return lIIllIlIlllIl[4];
        }
        if (A.lIllIIIIllIllII((int)var3)) {
            worldPoint = var2.ar;

            if (((116 + 177 - 252 + 193 ^ 121 + 9 - 65 + 131) & (0x57 ^ 0x33 ^ (0xCD ^ 0x87) ^ -1)) >= (0x2C ^ 0x4B ^ (0xCD ^ 0xAE))) {
                return false;
            }
        } else {
            worldPoint = var2.as;
        }
        WorldPoint var5 = worldPoint;
        int n2 = var4.getWorldLocation().equals((Object)var5);
        Object[] objectArray = new Object[lIIllIlIlllIl[10]];
        objectArray[A.lIIllIlIlllIl[4]] = var4.getWorldLocation();
        objectArray[A.lIIllIlIlllIl[12]] = var5;
        objectArray[A.lIIllIlIlllIl[14]] = n2 != 0;
        Log.info((String)lIIllIlIlllII[lIIllIlIlllIl[3]], (Object[])objectArray);
        if (A.lIllIIIIllIlIlI(n2)) {
            Movement.setDestination((WorldPoint)var5);

            if (-(0xD6 ^ 0x81 ^ (0xDA ^ 0x89)) > 0) {
                return ((0xD5 ^ 0xB5 ^ (0xCC ^ 0xBB)) & (0xFF ^ 0xC2 ^ (0xEF ^ 0xC5) ^ -1)) != 0;
            }
        } else {
            void var6;
            String[] stringArray = new String[lIIllIlIlllIl[14]];
            stringArray[A.lIIllIlIlllIl[4]] = lIIllIlIlllII[lIIllIlIlllIl[17]];
            stringArray[A.lIIllIlIlllIl[12]] = lIIllIlIlllII[lIIllIlIlllIl[7]];
            var6.interact(stringArray);
        }
        return lIIllIlIlllIl[12];
    }

    private static boolean lIllIIIIllIllII(int n2) {
        return n2 != 0;
    }

    static {
        A.lIllIIIIllIlIII();
        A.lIllIIIIllIIlll();
    }

    private static boolean lIllIIIIllIlIIl(Object object, Object object2) {
        return object != object2;
    }

    private static boolean lIllIIIIllIlllI(Object object) {
        return object != null;
    }

    @Override
    public boolean l() {
        Player var7;
        A var8;
        if (A.lIllIIIIllIlIIl((Object)this.p.pickpocketTarget(), (Object)f.VYRE)) {
            return lIIllIlIlllIl[4];
        }
        if (A.lIllIIIIllIlIlI(var8.o.f().equals((Object)var8.ar) ? 1 : 0)) {
            var8.o.a(var8.ar);
        }
        if (A.lIllIIIIllIlIll(var7 = Players.getLocal())) {
            return lIIllIlIlllIl[4];
        }
        if (A.lIllIIIIllIllII(var8.o() ? 1 : 0)) {
            return lIIllIlIlllIl[4];
        }
        TileObject var9 = var8.I();
        if (A.lIllIIIIllIlIll(var9)) {
            return lIIllIlIlllIl[4];
        }
        if (A.lIllIIIIllIllII(var8.a((Actor)var7) ? 1 : 0) && A.lIllIIIIllIllII(var8.J() ? 1 : 0) && A.lIllIIIIllIlIlI(var8.o.j() ? 1 : 0)) {
            var9.interact(lIIllIlIlllII[lIIllIlIlllIl[4]]);
            return lIIllIlIlllIl[12];
        }
        if (A.lIllIIIIllIllII(var8.o.j() ? 1 : 0)) {
            if (A.lIllIIIIllIllII(Inventory.contains((int[])var8.at) ? 1 : 0)) {
                int[] var10 = var8.at;
                int var11 = var10.length;
                int var12 = lIIllIlIlllIl[4];
                while (A.lIllIIIIllIllIl(var12, var11)) {
                    int var13 = var10[var12];
                    int[] nArray = new int[lIIllIlIlllIl[12]];
                    nArray[A.lIIllIlIlllIl[4]] = var13;
                    Inventory.getFirst((int[])nArray).interact(lIIllIlIlllII[lIIllIlIlllIl[12]]);
                    ++var12;

                    if (-2 <= 0) continue;
                    return ((39 + 202 - 203 + 208 ^ 119 + 107 - 87 + 38) & (0x43 ^ 0x16 ^ (0x7F ^ 0x6D) ^ -1)) != 0;
                }
                return lIIllIlIlllIl[12];
            }
            return var8.e(lIIllIlIlllIl[4]);
        }
        if (A.lIllIIIIllIlIlI(Movement.shouldWalk() ? 1 : 0)) {
            return lIIllIlIlllIl[4];
        }
        NPC var10 = var8.H();
        if (A.lIllIIIIllIllII(var8.a((Actor)var10) ? 1 : 0)) {
            var8.o.a(Worlds.getCurrentId());

            if (1 < 0) {
                return false;
            }
        } else {
            var8.o.a(lIIllIlIlllIl[4]);
            World var11 = Worlds.getCurrentWorld();
            Worlds.hopTo((World)Worlds.getRandom(world2 -> {
                int n2;
                if (A.lIllIIIIllIllII(world2.isNormal() ? 1 : 0) && A.lIllIIIIllIllll(world2.getLocation(), var11.getLocation()) && A.lIllIIIIlllIIII(world2.getId(), var11.getId()) && A.lIllIIIIllIllII(world2.isMembers() ? 1 : 0)) {
                    n2 = lIIllIlIlllIl[12];

                    if (3 < 0) {
                        return ((0x20 ^ 0x34 ^ (0x15 ^ 0x63)) & (115 + 116 - 91 + 94 ^ 28 + 11 - -96 + 1 ^ -1)) != 0;
                    }
                } else {
                    n2 = lIIllIlIlllIl[4];
                }
                return n2 != 0;
            }));
        }
        if (!A.lIllIIIIllIllII(var8.a((Actor)var7) ? 1 : 0) || A.lIllIIIIllIllII(Reachable.isInteractable((Locatable)var10) ? 1 : 0)) {
            return var8.e(lIIllIlIlllIl[12]);
        }
        return lIIllIlIlllIl[4];
    }

    @Inject
    public DoingVyreStuffTask(SquireThieving squireThieving, SquireThievingConfig squireThievingConfig) {
        super(squireThieving, squireThievingConfig);
        this.ap = new WorldArea(lIIllIlIlllIl[0], lIIllIlIlllIl[1], lIIllIlIlllIl[2], lIIllIlIlllIl[3], lIIllIlIlllIl[4]);
        this.aq = new WorldArea(lIIllIlIlllIl[5], lIIllIlIlllIl[6], lIIllIlIlllIl[3], lIIllIlIlllIl[7], lIIllIlIlllIl[4]);
        this.ar = new WorldPoint(lIIllIlIlllIl[8], lIIllIlIlllIl[1], lIIllIlIlllIl[4]);
        this.as = new WorldPoint(lIIllIlIlllIl[8], lIIllIlIlllIl[9], lIIllIlIlllIl[4]);
        int[] nArray = new int[lIIllIlIlllIl[10]];
        nArray[A.lIIllIlIlllIl[4]] = lIIllIlIlllIl[11];
        nArray[A.lIIllIlIlllIl[12]] = lIIllIlIlllIl[13];
        nArray[A.lIIllIlIlllIl[14]] = lIIllIlIlllIl[15];
        this.at = nArray;
    }

    private static boolean lIllIIIIllIlIlI(int n2) {
        return n2 == 0;
    }

    private NPC H() {
        int[] nArray = new int[lIIllIlIlllIl[12]];
        nArray[A.lIIllIlIlllIl[4]] = lIIllIlIlllIl[16];
        return NPCs.getNearest((int[])nArray);
    }
}

