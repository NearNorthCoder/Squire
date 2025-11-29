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
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Comparator;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
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
import gg.squire.autotoa.tasks.AutotoaTaskBase;
import gg.squire.autotoa.tasks.GameEnum112;
import gg.squire.autotoa.tasks.AutotoaManager;

@TaskDesc(name="Solving Light Puzzle", register=true)
public class SolvingLightPuzzleTask
extends AutotoaTaskBase {
    
    private  boolean dC;
    private static final  Set<Integer> dz;
    private  int dD;
    private static final  int dB;
    private static final  int dA;
    
    private static final  int dy;

    private static boolean lIlIIIIIllllII(Object object) {
        return object != null;
    }

    private static boolean lIlIIIIIlllllI(int n2) {
        return n2 == 0;
    }

    static {
        aB.lIlIIIIIlllIll();
        aB.lIlIIIIIlllIlI();
        dA = llIIlIlIlII[16];
        dB = llIIlIlIlII[15];
        dy = llIIlIlIlII[11];
        dz = Set.of(Integer.valueOf(llIIlIlIlII[24]), Integer.valueOf(llIIlIlIlII[25]), Integer.valueOf(llIIlIlIlII[26]));
    }

    @Inject
    protected SolvingLightPuzzleTask(Client client, z z2, TOAConfig tOAConfig) {
        super(client, z2, tOAConfig);
        this.dD = llIIlIlIlII[0];
    }

    private static  boolean a(WorldPoint worldPoint, TileObject tileObject) {
        int n2;
        if (aB.lIlIIIIlIIIIII(tileObject.getId(), llIIlIlIlII[16]) && aB.lIlIIIIIllllIl(tileObject.getWorldLocation().equals((Object)worldPoint) ? 1 : 0)) {
            n2 = llIIlIlIlII[1];

            if (2 <= 0) {
                return ((0xC2 ^ 0x8E ^ (0xEA ^ 0x91)) & (2 ^ (0x31 ^ 4) ^ -1)) != 0;
            }
        } else {
            n2 = llIIlIlIlII[2];
        }
        return n2 != 0;
    }

    private static boolean lIlIIIIlIIIIll(int n2, int n3) {
        return n2 < n3;
    }

    private static  boolean c(WorldPoint worldPoint, TileObject tileObject) {
        int n2;
        String[] stringArray = new String[llIIlIlIlII[1]];
        stringArray[aB.llIIlIlIlII[2]] = llIIlIIlIlI[llIIlIlIlII[21]];
        if (aB.lIlIIIIIllllIl(tileObject.hasAction(stringArray) ? 1 : 0) && aB.lIlIIIIIllllIl(tileObject.getWorldLocation().equals((Object)worldPoint) ? 1 : 0)) {
            n2 = llIIlIlIlII[1];

            if (((0xAF ^ 0x94 ^ (0x22 ^ 0x2F)) & (1 + 114 - 85 + 111 ^ 161 + 144 - 270 + 152 ^ -1)) == 1) {
                return ((0x29 ^ 0x6A ^ (0x1E ^ 0x6E)) & (37 + 41 - -39 + 61 ^ 5 + 44 - 42 + 122 ^ -1)) != 0;
            }
        } else {
            n2 = llIIlIlIlII[2];
        }
        return n2 != 0;
    }

    private static boolean lIlIIIIIllllll(Object object) {
        return object == null;
    }

    @Subscribe
    public void a(StatChanged statChanged) {
        if (aB.lIlIIIIlIIIlII(statChanged.getSkill(), Skill.MINING)) {
            this.dC = llIIlIlIlII[1];
        }
    }

    private static boolean lIlIIIIlIIIIlI(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIlIIIIlIIIIIl(int n2, int n3) {
        return n2 <= n3;
    }

    @Override
    public boolean bl() {
        WorldPoint var1;
        Point var2;
        Object var3;
        Object var4;
        Point llllllllllllllllIIllllllIllIIIll2;
        Object var5;
        aB var6;
        int[] nArray = new int[llIIlIlIlII[1]];
        nArray[aB.llIIlIlIlII[2]] = llIIlIlIlII[3];
        NPC nPC = NPCs.getNearest((int[])nArray);
        if (aB.lIlIIIIIllllII(nPC)) {
            String[] stringArray = new String[llIIlIlIlII[1]];
            stringArray[aB.llIIlIlIlII[2]] = llIIlIIlIlI[llIIlIlIlII[2]];
            if (aB.lIlIIIIIllllIl(TileObjects.getAll((String[])stringArray).isEmpty() ? 1 : 0)) {
                if (aB.lIlIIIIIlllllI(Players.getLocal().isAnimating() ? 1 : 0)) {
                    this.a((Interactable)nPC, llIIlIIlIlI[llIIlIlIlII[1]], llIIlIlIlII[4]);
                }
                return llIIlIlIlII[1];
            }
        }
        var6.dC = llIIlIlIlII[2];
        r var7 = r.aa();
        if (aB.lIlIIIIIllllll((Object)var7)) {
            return llIIlIlIlII[2];
        }
        Object[] objectArray = new Object[llIIlIlIlII[1]];
        objectArray[aB.llIIlIlIlII[2]] = var7;
        Log.info((String)llIIlIIlIlI[llIIlIlIlII[5]], (Object[])objectArray);
        Object[] objectArray2 = new Object[llIIlIlIlII[5]];
        objectArray2[aB.llIIlIlIlII[2]] = var6.dD;
        objectArray2[aB.llIIlIlIlII[1]] = var6.cu.getTickCount();
        Log.info((String)llIIlIIlIlI[llIIlIlIlII[6]], (Object[])objectArray2);
        if (aB.lIlIIIIIllllIl(Inventory.isFull() ? 1 : 0)) {
            var5 = Inventory.getFirst(item -> item.hasAction(llIIlIIlIlI[llIIlIlIlII[23]]::equals));
            Object[] objectArray3 = new Object[llIIlIlIlII[1]];
            objectArray3[aB.llIIlIlIlII[2]] = var5;
            Log.info((String)llIIlIIlIlI[llIIlIlIlII[4]], (Object[])objectArray3);
            if (aB.lIlIIIIIllllII(var5)) {
                var5.interact(llIIlIIlIlI[llIIlIlIlII[7]]);
                return llIIlIlIlII[1];
            }
            llllllllllllllllIIllllllIllIIIll2 = Inventory.getFirst(item -> item.hasAction(llIIlIIlIlI[llIIlIlIlII[22]]::equals));
            Object[] objectArray4 = new Object[llIIlIlIlII[1]];
            objectArray4[aB.llIIlIlIlII[2]] = llllllllllllllllIIllllllIllIIIll2;
            Log.info((String)llIIlIIlIlI[llIIlIlIlII[8]], (Object[])objectArray4);
            if (aB.lIlIIIIIllllII(llllllllllllllllIIllllllIllIIIll2)) {
                llllllllllllllllIIllllllIllIIIll2.interact(llIIlIIlIlI[llIIlIlIlII[9]]);
                return llIIlIlIlII[1];
            }
        }
        var5 = var7.ae().iterator();
        while (aB.lIlIIIIIllllIl(var5.hasNext() ? 1 : 0)) {
            llllllllllllllllIIllllllIllIIIll2 = (Point)var5.next();
            var4 = var7.a(llllllllllllllllIIllllllIllIIIll2);
            var3 = TileObjects.getNearest(arg_0 -> aB.c((WorldPoint)var4, arg_0));
            if (aB.lIlIIIIIllllII(var3)) {
                var3.interact(llIIlIIlIlI[llIIlIlIlII[10]]);
                var6.sleep(llIIlIlIlII[4]);
                return llIIlIlIlII[1];
            }

            if (3 < (0x26 ^ 0x22)) continue;
            return false;
        }
        var5 = null;
        int llllllllllllllllIIllllllIllIIIll2 = llIIlIlIlII[2];
        var4 = new ArrayList<Point>(var7.ad().keySet());
        var4.sort(Comparator.comparingInt(point -> Math.abs(point.y - llIIlIlIlII[20])));
        var3 = var4.iterator();
        while (aB.lIlIIIIIllllIl(var3.hasNext() ? 1 : 0)) {
            int var8;
            var2 = (Point)var3.next();
            var1 = var7.a(var2);
            TileObject var9 = TileObjects.getNearest(tileObject -> {
                int n2;
                if (aB.lIlIIIIIllllIl(tileObject.getName().equals(llIIlIIlIlI[llIIlIlIlII[19]]) ? 1 : 0) && aB.lIlIIIIIllllIl(tileObject.getWorldLocation().equals((Object)var1) ? 1 : 0)) {
                    n2 = llIIlIlIlII[1];

                    if ((86 + 33 - -42 + 25 ^ 170 + 116 - 258 + 162) <= 1) {
                        return ((0x5C ^ 0x2D ^ (0x9E ^ 0xC5)) & (0x49 ^ 0x3D ^ (0x7E ^ 0x20) ^ -1)) != 0;
                    }
                } else {
                    n2 = llIIlIlIlII[2];
                }
                return n2 != 0;
            });
            if (aB.lIlIIIIIllllII(var9) && aB.lIlIIIIlIIIIII(var8 = ((GameObject)var9).getOrientation(), var7.ad().get(var2))) {

                if (3 == 3) continue;
                return false;
            }
            ++llllllllllllllllIIllllllIllIIIll2;
            var5 = var1;

            if (-1 <= 2) continue;
            return ((0xCA ^ 0x94 ^ (0xEC ^ 0x88)) & (5 + 36 - -44 + 98 ^ 24 + 21 - -75 + 21 ^ -1)) != 0;
        }
        if (aB.lIlIIIIIllllll(var5)) {
            Log.info((String)llIIlIIlIlI[llIIlIlIlII[11]]);
            int[] nArray2 = new int[llIIlIlIlII[1]];
            nArray2[aB.llIIlIlIlII[2]] = llIIlIlIlII[12];
            var3 = NPCs.getNearest((int[])nArray2);
            if (aB.lIlIIIIlIIIIII(var6.cu.getTickCount(), var6.dD - llIIlIlIlII[1]) && aB.lIlIIIIIllllII(var3)) {
                var3.interact(llIIlIIlIlI[llIIlIlIlII[13]]);
                return llIIlIlIlII[1];
            }
            if (aB.lIlIIIIIllllII(var3) && aB.lIlIIIIIlllllI(Players.getLocal().isMoving() ? 1 : 0)) {
                var2 = var7.ab();
                if (aB.lIlIIIIIllllll(var2)) {
                    return llIIlIlIlII[2];
                }
                Movement.setDestination((WorldPoint)var7.a(var2));
            }
            return llIIlIlIlII[2];
        }
        var3 = var5;
        var2 = (GameObject)TileObjects.getNearest(arg_0 -> aB.a((WorldPoint)var3, arg_0));
        if (aB.lIlIIIIIllllII(var2)) {
            if (!aB.lIlIIIIlIIIIIl(llllllllllllllllIIllllllIllIIIll2, llIIlIlIlII[1]) || aB.lIlIIIIlIIIIlI(Math.abs(var6.cu.getTickCount() - var6.dD), llIIlIlIlII[8])) {
                var2.interact(llIIlIIlIlI[llIIlIlIlII[14]]);
            }
            return llIIlIlIlII[1];
        }
        int[] nArray3 = new int[llIIlIlIlII[1]];
        nArray3[aB.llIIlIlIlII[2]] = llIIlIlIlII[15];
        if (aB.lIlIIIIlIIIIll(Inventory.getCount((int[])nArray3), llllllllllllllllIIllllllIllIIIll2)) {
            int[] nArray4 = new int[llIIlIlIlII[1]];
            nArray4[aB.llIIlIlIlII[2]] = llIIlIlIlII[16];
            var1 = TileObjects.getAll((int[])nArray4).stream().filter(tileObject -> {
                boolean bl2;
                if (aB.lIlIIIIIlllllI(var7.d(tileObject.getWorldLocation()) ? 1 : 0)) {
                    bl2 = llIIlIlIlII[1];

                    if (1 == 0) {
                        return ((0x96 ^ 0xB8 ^ (0x7A ^ 2)) & (27 + 131 - 109 + 155 ^ 73 + 39 - -24 + 18 ^ -1)) != 0;
                    }
                } else {
                    bl2 = llIIlIlIlII[2];
                }
                return bl2;
            }).min(Comparator.comparingInt(tileObject -> tileObject.getWorldLocation().distanceTo((Locatable)this.cu.getLocalPlayer()))).orElse(null);
            if (aB.lIlIIIIIllllll(var1)) {
                return llIIlIlIlII[2];
            }
            var1.interact(llIIlIIlIlI[llIIlIlIlII[17]]);
            return llIIlIlIlII[1];
        }
        if (aB.lIlIIIIIlllllI(Players.getLocal().getWorldLocation().equals(var5) ? 1 : 0)) {
            Movement.setDestination((WorldPoint)var5);

            if (1 != 1) {
                return ((0x52 ^ 0x29 ^ (0xE1 ^ 0x80)) & (34 + 155 - 112 + 109 ^ 135 + 151 - 157 + 31 ^ -1)) != 0;
            }
        } else {
            int[] nArray5 = new int[llIIlIlIlII[1]];
            nArray5[aB.llIIlIlIlII[2]] = llIIlIlIlII[15];
            Inventory.getFirst((int[])nArray5).interact(llIIlIIlIlI[llIIlIlIlII[18]]);
        }
        return llIIlIlIlII[1];
    }

    private static boolean lIlIIIIlIIIIII(int n2, int n3) {
        return n2 == n3;
    }

        return String.valueOf(var10);
    }

    private static boolean lIlIIIIIllllIl(int n2) {
        return n2 != 0;
    }

    private static boolean lIlIIIIlIIIlII(Object object, Object object2) {
        return object == object2;
    }

    @Subscribe
    public void b(GraphicsObjectCreated graphicsObjectCreated) {
        if (aB.lIlIIIIIllllIl(dz.contains(graphicsObjectCreated.getGraphicsObject().getId()) ? 1 : 0)) {
            this.dD = this.cu.getTickCount() + llIIlIlIlII[11];
        }
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(NpcChanged npcChanged) {
        void var11;
        if (aB.lIlIIIIlIIIIII(npcChanged.getOld().getId(), llIIlIlIlII[3]) && aB.lIlIIIIlIIIIII(npcChanged.getNpc().getId(), llIIlIlIlII[12])) {
            this.dD = this.cu.getTickCount() + llIIlIlIlII[11] + llIIlIlIlII[1];

            if (-(8 ^ 0xC) >= 0) {
                return;
            }
        } else if (aB.lIlIIIIlIIIIII(var11.getOld().getId(), llIIlIlIlII[12]) && aB.lIlIIIIlIIIIII(var11.getNpc().getId(), llIIlIlIlII[3])) {
            var12.dD = llIIlIlIlII[0];
        }
    }

    private static void lIlIIIIIlllIlI() {
        llIIlIIlIlI = new String[llIIlIlIlII[27]];
        aB.llIIlIIlIlI[aB.llIIlIlIlII[2]] = "Mirror";
        aB.llIIlIIlIlI[aB.llIIlIlIlII[1]] = "Destroy";
        aB.llIIlIIlIlI[aB.llIIlIlIlII[5]] = "Room {}";
        aB.llIIlIIlIlI[aB.llIIlIlIlII[6]] = "Next fire tick {} - current {}";
        aB.llIIlIIlIlI[aB.llIIlIlIlII[4]] = "food {}";
        aB.llIIlIIlIlI[aB.llIIlIlIlII[7]] = "Drop";
        aB.llIIlIIlIlI[aB.llIIlIlIlII[8]] = "other {}";
        aB.llIIlIIlIlI[aB.llIIlIlIlII[9]] = "Drop";
        aB.llIIlIIlIlI[aB.llIIlIlIlII[10]] = "Break";
        aB.llIIlIIlIlI[aB.llIIlIlIlII[11]] = "Next null, walking/mining";
        aB.llIIlIIlIlI[aB.llIIlIlIlII[13]] = "Destroy";
        aB.llIIlIIlIlI[aB.llIIlIlIlII[14]] = "Rotate-clockwise";
        aB.llIIlIIlIlI[aB.llIIlIlIlII[17]] = "Pick-up";
        aB.llIIlIIlIlI[aB.llIIlIlIlII[18]] = "Place";
        aB.llIIlIIlIlI[aB.llIIlIlIlII[19]] = "Mirror";
        aB.llIIlIIlIlI[aB.llIIlIlIlII[21]] = "Break";
        aB.llIIlIIlIlI[aB.llIIlIlIlII[22]] = "Drink";
        aB.llIIlIIlIlI[aB.llIIlIlIlII[23]] = "Eat";
    }
}

