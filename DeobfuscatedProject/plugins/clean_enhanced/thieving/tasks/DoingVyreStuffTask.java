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
import gg.squire.thieving.tasks.ThievingManager;
import gg.squire.thieving.tasks.GameEnum5;

@TaskDesc(name="Doing Vyre stuff", priority=133337, blocking=true)
public class DoingVyreStuffTask
extends ThievingManager {
    private final  int[] at;
    
    private final  WorldArea ap;
    private final  WorldArea aq;
    
    private final  WorldPoint as;
    private final  WorldPoint ar;

    private static boolean var3(int n2, int n3) {
        return n2 != n3;
    }

    private boolean a(Actor actor) {
        boolean bl;
        if (!A.var4(this.ap.contains(actor.getWorldLocation()) ? 1 : 0) || A.var5(this.aq.contains(actor.getWorldLocation()) ? 1 : 0)) {
            bl = var1[12];
            0;
            if (2 > 2) {
                return ((0xBB ^ 0x8F) & ~(0x75 ^ 0x41)) != 0;
            }
        } else {
            bl = var1[4];
        }
        return bl;
    }

    private static boolean var6(int n2, int n3) {
        return n2 == n3;
    }

    private TileObject I() {
        String[] stringArray = new String[var1[12]];
        stringArray[A.var1[4]] = var2[var1[14]];
        return TileObjects.getNearest((WorldPoint)this.ar, (String[])stringArray);
    }

    private boolean J() {
        TileObject tileObject = this.I();
        if (A.var7(tileObject)) {
            return var1[4];
        }
        String[] stringArray = new String[var1[12]];
        stringArray[A.var1[4]] = var2[var1[10]];
        return tileObject.hasAction(stringArray);
    }

    private static boolean var7(Object object) {
        return object == null;
    }

    private static String var8(String var9, String var10) {
        var9 = new String(Base64.getDecoder().decode(var9.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var11 = new StringBuilder();
        char[] var12 = var10.toCharArray();
        int var13 = var1[4];
        char[] var14 = var9.toCharArray();
        int var15 = var14.length;
        int var16 = var1[4];
        while (A.var17(var16, var15)) {
            char var18 = var14[var16];
            var11.append((char)(var18 ^ var12[var13 % var12.length]));
            0;
            ++var13;
            ++var16;
            0;
            if null == null continue;
            return null;
        }
        return String.valueOf(var11);
    }

    private static void var19() {
        var2 = new String[var1[2]];
        A.var2[A.var1[4]] = "Close";
        A.var2[A.var1[12]] = "Wear";
        A.var2[A.var1[14]] = "Door";
        A.var2[A.var1[10]] = "Close";
        A.var2[A.var1[3]] = "We are at {}, the destination is {}. Equality: {}";
        A.var2[A.var1[17]] = "Close";
        A.var2[A.var1[7]] = "Open";
    }

    private static boolean var17(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * WARNING - void declaration
     */
    private boolean e(boolean bl) {
        WorldPoint worldPoint;
        A var20;
        void var21;
        TileObject tileObject = this.I();
        if (!A.var22(tileObject) || A.var4(this.J() ? 1 : 0)) {
            return var1[4];
        }
        Player var23 = Players.getLocal();
        if (A.var7(var23)) {
            return var1[4];
        }
        if (A.var5((int)var21)) {
            worldPoint = var20.ar;
            0;
            if (((116 + 177 - 252 + 193 ^ 121 + 9 - 65 + 131) & (0x57 ^ 0x33 ^ (0xCD ^ 0x87) ^ -1)) >= (0x2C ^ 0x4B ^ (0xCD ^ 0xAE))) {
                return ((18 + 51 - -4 + 64 ^ 88 + 149 - 148 + 108) & (54 + 47 - 45 + 86 ^ 56 + 109 - 51 + 80 ^ -1)) != 0;
            }
        } else {
            worldPoint = var20.as;
        }
        WorldPoint var24 = worldPoint;
        int n2 = var23.getWorldLocation().equals((Object)var24);
        Object[] objectArray = new Object[var1[10]];
        objectArray[A.var1[4]] = var23.getWorldLocation();
        objectArray[A.var1[12]] = var24;
        objectArray[A.var1[14]] = n2 != 0;
        Log.info((String)var2[var1[3]], (Object[])objectArray);
        if (A.var4(n2)) {
            Movement.setDestination((WorldPoint)var24);
            0;
            if (-(0xD6 ^ 0x81 ^ (0xDA ^ 0x89)) > 0) {
                return ((0xD5 ^ 0xB5 ^ (0xCC ^ 0xBB)) & (0xFF ^ 0xC2 ^ (0xEF ^ 0xC5) ^ -1)) != 0;
            }
        } else {
            void var25;
            String[] stringArray = new String[var1[14]];
            stringArray[A.var1[4]] = var2[var1[17]];
            stringArray[A.var1[12]] = var2[var1[7]];
            var25.interact(stringArray);
        }
        return var1[12];
    }

    private static boolean var5(int n2) {
        return n2 != 0;
    }

    static {
        A.var26();
        A.var19();
    }

    private static boolean var27(Object object, Object object2) {
        return object != object2;
    }

        catch (Exception var33) {
            var33.printStackTrace();
            return null;
        }
    }

    private static void var26() {
        var1 = new int[18];
        A.var1[0] = 0xFFFFAFFF & 0x5E4D;
        A.var1[1] = -(0xFFFFE7E9 & 0x5A5F) & (0xFFFFFF7B & 0x4FFE);
        A.var1[2] = 73 + 90 - 132 + 100 ^ 109 + 106 - 162 + 79;
        A.var1[3] = 0x12 ^ 0x16;
        A.var1[4] = (125 + 108 - 223 + 144 ^ 13 + 97 - 96 + 158) & (0x6A ^ 0xE ^ (0xA ^ 0x58) ^ -1);
        A.var1[5] = -(0xFFFFFF44 & 0x71BF) & (0xFFFFFF7B & 0x7FD7);
        A.var1[6] = -(0xFFFFFEDB & 0x63B4) & (0xFFFFEFBF & Short.MAX_VALUE);
        A.var1[7] = 0x67 ^ 0x61;
        A.var1[8] = -(41 + 49 - -13 + 58) & (0xFFFFDEFF & 0x2FEE);
        A.var1[9] = 0xFFFFFDBF & 0xF71;
        A.var1[10] = 3;
        A.var1[11] = -(0xFFFF8D9E & 0x77ED) & (0xFFFFFFEF & 0x65FF);
        A.var1[12] = 1;
        A.var1[13] = -(0xFFFF990F & 0x6EF9) & (0xFFFFED7E & 0x7AEF);
        A.var1[14] = 2;
        A.var1[15] = 0xFFFFF168 & 0x6EFF;
        A.var1[16] = -(0xFFFFBECF & 0x4B33) & (0xFFFFFFEF & 0x2FFB);
        A.var1[17] = 6 + 115 - 7 + 41 ^ 62 + 63 - -16 + 17;
    }

    private static boolean var22(Object object) {
        return object != null;
    }

    @Override
    public boolean l() {
        Player var34;
        A var35;
        if (A.var27((Object)this.p.pickpocketTarget(), (Object)f.VYRE)) {
            return var1[4];
        }
        if (A.var4(var35.o.f().equals((Object)var35.ar) ? 1 : 0)) {
            var35.o.a(var35.ar);
        }
        if (A.var7(var34 = Players.getLocal())) {
            return var1[4];
        }
        if (A.var5(var35.o() ? 1 : 0)) {
            return var1[4];
        }
        TileObject var36 = var35.I();
        if (A.var7(var36)) {
            return var1[4];
        }
        if (A.var5(var35.a((Actor)var34) ? 1 : 0) && A.var5(var35.J() ? 1 : 0) && A.var4(var35.o.j() ? 1 : 0)) {
            var36.interact(var2[var1[4]]);
            return var1[12];
        }
        if (A.var5(var35.o.j() ? 1 : 0)) {
            if (A.var5(Inventory.contains((int[])var35.at) ? 1 : 0)) {
                int[] var37 = var35.at;
                int var38 = var37.length;
                int var39 = var1[4];
                while (A.var17(var39, var38)) {
                    int var40 = var37[var39];
                    int[] nArray = new int[var1[12]];
                    nArray[A.var1[4]] = var40;
                    Inventory.getFirst((int[])nArray).interact(var2[var1[12]]);
                    ++var39;
                    0;
                    if (-2 <= 0) continue;
                    return ((39 + 202 - 203 + 208 ^ 119 + 107 - 87 + 38) & (0x43 ^ 0x16 ^ (0x7F ^ 0x6D) ^ -1)) != 0;
                }
                return var1[12];
            }
            return var35.e(var1[4]);
        }
        if (A.var4(Movement.shouldWalk() ? 1 : 0)) {
            return var1[4];
        }
        NPC var37 = var35.H();
        if (A.var5(var35.a((Actor)var37) ? 1 : 0)) {
            var35.o.a(Worlds.getCurrentId());
            0;
            if (1 < 0) {
                return ((0x93 ^ 0xAA) & ~(0xAF ^ 0x96)) != 0;
            }
        } else {
            var35.o.a(var1[4]);
            World var38 = Worlds.getCurrentWorld();
            Worlds.hopTo((World)Worlds.getRandom(world2 -> {
                int n2;
                if (A.var5(world2.isNormal() ? 1 : 0) && A.var6(world2.getLocation(), var38.getLocation()) && A.var3(world2.getId(), var38.getId()) && A.var5(world2.isMembers() ? 1 : 0)) {
                    n2 = var1[12];
                    0;
                    if (3 < 0) {
                        return ((0x20 ^ 0x34 ^ (0x15 ^ 0x63)) & (115 + 116 - 91 + 94 ^ 28 + 11 - -96 + 1 ^ -1)) != 0;
                    }
                } else {
                    n2 = var1[4];
                }
                return n2 != 0;
            }));
        }
        if (!A.var5(var35.a((Actor)var34) ? 1 : 0) || A.var5(Reachable.isInteractable((Locatable)var37) ? 1 : 0)) {
            return var35.e(var1[12]);
        }
        return var1[4];
    }

    @Inject
    public DoingVyreStuffTask(SquireThieving squireThieving, SquireThievingConfig squireThievingConfig) {
        super(squireThieving, squireThievingConfig);
        this.ap = new WorldArea(var1[0], var1[1], var1[2], var1[3], var1[4]);
        this.aq = new WorldArea(var1[5], var1[6], var1[3], var1[7], var1[4]);
        this.ar = new WorldPoint(var1[8], var1[1], var1[4]);
        this.as = new WorldPoint(var1[8], var1[9], var1[4]);
        int[] nArray = new int[var1[10]];
        nArray[A.var1[4]] = var1[11];
        nArray[A.var1[12]] = var1[13];
        nArray[A.var1[14]] = var1[15];
        this.at = nArray;
    }

    private static boolean var4(int n2) {
        return n2 == 0;
    }

    private NPC H() {
        int[] nArray = new int[var1[12]];
        nArray[A.var1[4]] = var1[16];
        return NPCs.getNearest((int[])nArray);
    }
}

