/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  net.runelite.api.Client
 *  net.runelite.api.GameObject
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.Skill
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.events.GraphicsObjectCreated
 *  net.runelite.api.events.NpcChanged
 *  net.runelite.api.events.StatChanged
 *  net.runelite.client.eventbus.Subscribe
 *  net.unethicalite.api.Interactable
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.autotoa.tasks;

import com.google.inject.Inject;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import java.awt.Point;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Set;
import net.runelite.api.Client;
import net.runelite.api.GameObject;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Skill;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.GraphicsObjectCreated;
import net.runelite.api.events.NpcChanged;
import net.runelite.api.events.StatChanged;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.Interactable;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import gg.squire.autotoa.tasks.AutotoaManager;
import gg.squire.autotoa.tasks.GameEnum15;
import gg.squire.autotoa.tasks.AutotoaManager;

@TaskDesc(name="Solving Light Puzzle", register=true)
public class SolvingLightPuzzleTask
extends AutotoaManager {
    
    private  boolean dC;
    private static final  Set<Integer> dz;
    private  int dD;
    private static final  int dB;
    private static final  int dA;
    
    private static final  int dy;

    private static boolean var3(Object object) {
        return object != null;
    }

    private static boolean var4(int n2) {
        return n2 == 0;
    }

    private static void var5() {
        var2 = new int[28];
        aB.var2[0] = -1;
        aB.var2[1] = 1;
        aB.var2[2] = (0xC4 ^ 0xAA ^ (0x19 ^ 0x6B)) & (76 + 8 - 83 + 219 ^ 141 + 140 - 228 + 139 ^ -1);
        aB.var2[3] = 0xFFFFBDFF & 0x6FBB;
        aB.var2[4] = 87 + 60 - 10 + 20 ^ 42 + 56 - 62 + 117;
        aB.var2[5] = 2;
        aB.var2[6] = 3;
        aB.var2[7] = 100 + 116 - 162 + 80 ^ 72 + 3 - 67 + 123;
        aB.var2[8] = 0x4C ^ 0x4A;
        aB.var2[9] = 0x2D ^ 0x2A;
        aB.var2[10] = 0x98 ^ 0x90;
        aB.var2[11] = 0x90 ^ 0x99;
        aB.var2[12] = -(0xFFFFCF4E & 0x70F3) & (0xFFFFEFFF & 0x7DFB);
        aB.var2[13] = 0x71 ^ 0x28 ^ (0x65 ^ 0x36);
        aB.var2[14] = 0x20 ^ 0x2B;
        aB.var2[15] = -(0xFFFFDEFF & 0x3160) & (0xFFFFFAFF & Short.MAX_VALUE);
        aB.var2[16] = -(0xFFFFAD7D & 0x5EF3) & (0xFFFFBDFF & 0xFFFF);
        aB.var2[17] = 5 ^ 0x4F ^ (0xD0 ^ 0x96);
        aB.var2[18] = 0x3B ^ 0x56 ^ (0xA0 ^ 0xC0);
        aB.var2[19] = 97 + 94 - 28 + 10 ^ 88 + 151 - 108 + 32;
        aB.var2[20] = 73 + 65 - 26 + 15 ^ (0x18 ^ 0x47);
        aB.var2[21] = 0x87 ^ 0x88;
        aB.var2[22] = 0xF4 ^ 0xA8 ^ (0x7F ^ 0x33);
        aB.var2[23] = 0x2F ^ 0x5E ^ (0x58 ^ 0x38);
        aB.var2[24] = 0xFFFF9BCB & 0x6C76;
        aB.var2[25] = -(0xFFFFEFE7 & 0x575D) & (0xFFFFEF54 & 0x5FFF);
        aB.var2[26] = 0xFFFFFBE9 & 0xC5E;
        aB.var2[27] = 0x58 ^ 0x4A;
    }

    static {
        aB.var5();
        aB.var6();
        dA = var2[16];
        dB = var2[15];
        dy = var2[11];
        dz = Set.of(Integer.valueOf(var2[24]), Integer.valueOf(var2[25]), Integer.valueOf(var2[26]));
    }

    @Inject
    protected SolvingLightPuzzleTask(Client client, z z2, TOAConfig tOAConfig) {
        super(client, z2, tOAConfig);
        this.dD = var2[0];
    }

    private static  boolean a(WorldPoint worldPoint, TileObject tileObject) {
        int n2;
        if (aB.var7(tileObject.getId(), var2[16]) && aB.var8(tileObject.getWorldLocation().equals((Object)worldPoint) ? 1 : 0)) {
            n2 = var2[1];
            0;
            if (2 <= 0) {
                return ((0xC2 ^ 0x8E ^ (0xEA ^ 0x91)) & (2 ^ (0x31 ^ 4) ^ -1)) != 0;
            }
        } else {
            n2 = var2[2];
        }
        return n2 != 0;
    }

        catch (Exception var14) {
            var14.printStackTrace();
            return null;
        }
    }

        catch (Exception var20) {
            var20.printStackTrace();
            return null;
        }
    }

    private static boolean var21(int n2, int n3) {
        return n2 < n3;
    }

    private static  boolean c(WorldPoint worldPoint, TileObject tileObject) {
        int n2;
        String[] stringArray = new String[var2[1]];
        stringArray[aB.var2[2]] = var1[var2[21]];
        if (aB.var8(tileObject.hasAction(stringArray) ? 1 : 0) && aB.var8(tileObject.getWorldLocation().equals((Object)worldPoint) ? 1 : 0)) {
            n2 = var2[1];
            0;
            if (((0xAF ^ 0x94 ^ (0x22 ^ 0x2F)) & (1 + 114 - 85 + 111 ^ 161 + 144 - 270 + 152 ^ -1)) == 1) {
                return ((0x29 ^ 0x6A ^ (0x1E ^ 0x6E)) & (37 + 41 - -39 + 61 ^ 5 + 44 - 42 + 122 ^ -1)) != 0;
            }
        } else {
            n2 = var2[2];
        }
        return n2 != 0;
    }

    private static boolean var22(Object object) {
        return object == null;
    }

    @Subscribe
    public void a(StatChanged statChanged) {
        if (aB.var23(statChanged.getSkill(), Skill.MINING)) {
            this.dC = var2[1];
        }
    }

    private static boolean var24(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean var25(int n2, int n3) {
        return n2 <= n3;
    }

    @Override
    public boolean bl() {
        WorldPoint var26;
        Point var27;
        Object var28;
        Object var29;
        Point llllllllllllllllIIllllllIllIIIll2;
        Object var30;
        aB var31;
        int[] nArray = new int[var2[1]];
        nArray[aB.var2[2]] = var2[3];
        NPC nPC = NPCs.getNearest((int[])nArray);
        if (aB.var3(nPC)) {
            String[] stringArray = new String[var2[1]];
            stringArray[aB.var2[2]] = var1[var2[2]];
            if (aB.var8(TileObjects.getAll((String[])stringArray).isEmpty() ? 1 : 0)) {
                if (aB.var4(Players.getLocal().isAnimating() ? 1 : 0)) {
                    this.a((Interactable)nPC, var1[var2[1]], var2[4]);
                }
                return var2[1];
            }
        }
        var31.dC = var2[2];
        r var32 = r.aa();
        if (aB.var22((Object)var32)) {
            return var2[2];
        }
        Object[] objectArray = new Object[var2[1]];
        objectArray[aB.var2[2]] = var32;
        Log.info((String)var1[var2[5]], (Object[])objectArray);
        Object[] objectArray2 = new Object[var2[5]];
        objectArray2[aB.var2[2]] = var31.dD;
        objectArray2[aB.var2[1]] = var31.cu.getTickCount();
        Log.info((String)var1[var2[6]], (Object[])objectArray2);
        if (aB.var8(Inventory.isFull() ? 1 : 0)) {
            var30 = Inventory.getFirst(item -> item.hasAction(var1[var2[23]]::equals));
            Object[] objectArray3 = new Object[var2[1]];
            objectArray3[aB.var2[2]] = var30;
            Log.info((String)var1[var2[4]], (Object[])objectArray3);
            if (aB.var3(var30)) {
                var30.interact(var1[var2[7]]);
                return var2[1];
            }
            llllllllllllllllIIllllllIllIIIll2 = Inventory.getFirst(item -> item.hasAction(var1[var2[22]]::equals));
            Object[] objectArray4 = new Object[var2[1]];
            objectArray4[aB.var2[2]] = llllllllllllllllIIllllllIllIIIll2;
            Log.info((String)var1[var2[8]], (Object[])objectArray4);
            if (aB.var3(llllllllllllllllIIllllllIllIIIll2)) {
                llllllllllllllllIIllllllIllIIIll2.interact(var1[var2[9]]);
                return var2[1];
            }
        }
        var30 = var32.ae().iterator();
        while (aB.var8(var30.hasNext() ? 1 : 0)) {
            llllllllllllllllIIllllllIllIIIll2 = (Point)var30.next();
            var29 = var32.a(llllllllllllllllIIllllllIllIIIll2);
            var28 = TileObjects.getNearest(arg_0 -> aB.c((WorldPoint)var29, arg_0));
            if (aB.var3(var28)) {
                var28.interact(var1[var2[10]]);
                var31.sleep(var2[4]);
                return var2[1];
            }
            0;
            if (3 < (0x26 ^ 0x22)) continue;
            return ((0x93 ^ 0xA8) & ~(0x6E ^ 0x55)) != 0;
        }
        var30 = null;
        int llllllllllllllllIIllllllIllIIIll2 = var2[2];
        var29 = new ArrayList<Point>(var32.ad().keySet());
        var29.sort(Comparator.comparingInt(point -> Math.abs(point.y - var2[20])));
        var28 = var29.iterator();
        while (aB.var8(var28.hasNext() ? 1 : 0)) {
            int var33;
            var27 = (Point)var28.next();
            var26 = var32.a(var27);
            TileObject var34 = TileObjects.getNearest(tileObject -> {
                int n2;
                if (aB.var8(tileObject.getName().equals(var1[var2[19]]) ? 1 : 0) && aB.var8(tileObject.getWorldLocation().equals((Object)var26) ? 1 : 0)) {
                    n2 = var2[1];
                    0;
                    if ((86 + 33 - -42 + 25 ^ 170 + 116 - 258 + 162) <= 1) {
                        return ((0x5C ^ 0x2D ^ (0x9E ^ 0xC5)) & (0x49 ^ 0x3D ^ (0x7E ^ 0x20) ^ -1)) != 0;
                    }
                } else {
                    n2 = var2[2];
                }
                return n2 != 0;
            });
            if (aB.var3(var34) && aB.var7(var33 = ((GameObject)var34).getOrientation(), var32.ad().get(var27))) {
                0;
                if (3 == 3) continue;
                return ((0x7D ^ 0x61) & ~(0x22 ^ 0x3E)) != 0;
            }
            ++llllllllllllllllIIllllllIllIIIll2;
            var30 = var26;
            0;
            if (-1 <= 2) continue;
            return ((0xCA ^ 0x94 ^ (0xEC ^ 0x88)) & (5 + 36 - -44 + 98 ^ 24 + 21 - -75 + 21 ^ -1)) != 0;
        }
        if (aB.var22(var30)) {
            Log.info((String)var1[var2[11]]);
            int[] nArray2 = new int[var2[1]];
            nArray2[aB.var2[2]] = var2[12];
            var28 = NPCs.getNearest((int[])nArray2);
            if (aB.var7(var31.cu.getTickCount(), var31.dD - var2[1]) && aB.var3(var28)) {
                var28.interact(var1[var2[13]]);
                return var2[1];
            }
            if (aB.var3(var28) && aB.var4(Players.getLocal().isMoving() ? 1 : 0)) {
                var27 = var32.ab();
                if (aB.var22(var27)) {
                    return var2[2];
                }
                Movement.setDestination((WorldPoint)var32.a(var27));
            }
            return var2[2];
        }
        var28 = var30;
        var27 = (GameObject)TileObjects.getNearest(arg_0 -> aB.a((WorldPoint)var28, arg_0));
        if (aB.var3(var27)) {
            if (!aB.var25(llllllllllllllllIIllllllIllIIIll2, var2[1]) || aB.var24(Math.abs(var31.cu.getTickCount() - var31.dD), var2[8])) {
                var27.interact(var1[var2[14]]);
            }
            return var2[1];
        }
        int[] nArray3 = new int[var2[1]];
        nArray3[aB.var2[2]] = var2[15];
        if (aB.var21(Inventory.getCount((int[])nArray3), llllllllllllllllIIllllllIllIIIll2)) {
            int[] nArray4 = new int[var2[1]];
            nArray4[aB.var2[2]] = var2[16];
            var26 = TileObjects.getAll((int[])nArray4).stream().filter(tileObject -> {
                boolean bl2;
                if (aB.var4(var32.d(tileObject.getWorldLocation()) ? 1 : 0)) {
                    bl2 = var2[1];
                    0;
                    
                } else {
                    bl2 = var2[2];
                }
                return bl2;
            }).min(Comparator.comparingInt(tileObject -> tileObject.getWorldLocation().distanceTo((Locatable)this.cu.getLocalPlayer()))).orElse(null);
            if (aB.var22(var26)) {
                return var2[2];
            }
            var26.interact(var1[var2[17]]);
            return var2[1];
        }
        if (aB.var4(Players.getLocal().getWorldLocation().equals(var30) ? 1 : 0)) {
            Movement.setDestination((WorldPoint)var30);
            0;
            if (1 != 1) {
                return ((0x52 ^ 0x29 ^ (0xE1 ^ 0x80)) & (34 + 155 - 112 + 109 ^ 135 + 151 - 157 + 31 ^ -1)) != 0;
            }
        } else {
            int[] nArray5 = new int[var2[1]];
            nArray5[aB.var2[2]] = var2[15];
            Inventory.getFirst((int[])nArray5).interact(var1[var2[18]]);
        }
        return var2[1];
    }

    private static boolean var7(int n2, int n3) {
        return n2 == n3;
    }

    private static String var35(String var36, String var37) {
        var36 = new String(Base64.getDecoder().decode(var36.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var38 = new StringBuilder();
        char[] var39 = var37.toCharArray();
        int var40 = var2[2];
        char[] var41 = var36.toCharArray();
        int var42 = var41.length;
        int var43 = var2[2];
        while (aB.var21(var43, var42)) {
            char var44 = var41[var43];
            var38.append((char)(var44 ^ var39[var40 % var39.length]));
            0;
            ++var40;
            ++var43;
            0;
            if ((0x2C ^ 0x28) >= 2) continue;
            return null;
        }
        return String.valueOf(var38);
    }

    private static boolean var8(int n2) {
        return n2 != 0;
    }

    private static boolean var23(Object object, Object object2) {
        return object == object2;
    }

    @Subscribe
    public void b(GraphicsObjectCreated graphicsObjectCreated) {
        if (aB.var8(dz.contains(graphicsObjectCreated.getGraphicsObject().getId()) ? 1 : 0)) {
            this.dD = this.cu.getTickCount() + var2[11];
        }
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(NpcChanged npcChanged) {
        void var45;
        if (aB.var7(npcChanged.getOld().getId(), var2[3]) && aB.var7(npcChanged.getNpc().getId(), var2[12])) {
            this.dD = this.cu.getTickCount() + var2[11] + var2[1];
            0;
            if (-(8 ^ 0xC) >= 0) {
                return;
            }
        } else if (aB.var7(var45.getOld().getId(), var2[12]) && aB.var7(var45.getNpc().getId(), var2[3])) {
            var46.dD = var2[0];
        }
    }

    private static void var6() {
        var1 = new String[var2[27]];
        aB.var1[aB.var2[2]] = "Mirror";
        aB.var1[aB.var2[1]] = "Destroy";
        aB.var1[aB.var2[5]] = "Room {}";
        aB.var1[aB.var2[6]] = "Next fire tick {} - current {}";
        aB.var1[aB.var2[4]] = "food {}";
        aB.var1[aB.var2[7]] = "Drop";
        aB.var1[aB.var2[8]] = "other {}";
        aB.var1[aB.var2[9]] = "Drop";
        aB.var1[aB.var2[10]] = "Break";
        aB.var1[aB.var2[11]] = "Next null, walking/mining";
        aB.var1[aB.var2[13]] = "Destroy";
        aB.var1[aB.var2[14]] = "Rotate-clockwise";
        aB.var1[aB.var2[17]] = "Pick-up";
        aB.var1[aB.var2[18]] = "Place";
        aB.var1[aB.var2[19]] = "Mirror";
        aB.var1[aB.var2[21]] = "Break";
        aB.var1[aB.var2[22]] = "Drink";
        aB.var1[aB.var2[23]] = "Eat";
    }
}

