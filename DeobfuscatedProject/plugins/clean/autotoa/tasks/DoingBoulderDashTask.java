/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.Point
 *  net.runelite.api.Skill
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.events.AnimationChanged
 *  net.runelite.api.events.StatChanged
 *  net.runelite.client.config.ConfigStorageBox
 *  net.runelite.client.eventbus.Subscribe
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.BoostingPotion
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.client.Static
 */
package gg.squire.autotoa.tasks;

import com.google.inject.Inject;
import gg.squire.autotoa.SquireAutoTOA;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Point;
import net.runelite.api.Skill;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.AnimationChanged;
import net.runelite.api.events.StatChanged;
import net.runelite.client.config.ConfigStorageBox;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.BoostingPotion;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.client.Static;
import gg.squire.autotoa.tasks.AutotoaTaskBase;
import gg.squire.autotoa.tasks.AutotoaManager;

@TaskDesc(name="Doing boulder dash", priority=100, blocking=true, register=true)
public class DoingBoulderDashTask
extends AutotoaTaskBase {
    private  int dZ;
    
    private static final  int dT;
    private  NPC dW;
    private final  Set<NPC> dU;
    private  int dY;
    private static final  Point[] dQ;
    private final  Set<NPC> dV;
    private static final  int dR;
    private  int ea;
    private static final  int[] dS;
    private  boolean dX;

    private static boolean lIlIIIlIlllIIl(Object object, Object object2) {
        return object != object2;
    }

    @Override
    public void r() {
        this.dW = null;
        this.dV.clear();
        this.dU.clear();
        this.dX = llIIllIlIIl[0];
        this.ea = llIIllIlIIl[0];
    }

    private static boolean lIlIIIlIllIIll(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIlIIIlIllIIII(int n2) {
        return n2 > 0;
    }

    private static  boolean a(NPC nPC, int n2, NPC nPC2) {
        int n3;
        if (aJ.lIlIIIlIllIIll(nPC2.getId(), nPC.getId()) && aJ.lIlIIIlIllIlII(nPC2.getWorldLocation().getX(), nPC.getWorldLocation().getX()) && aJ.lIlIIIlIllIIlI(nPC2.getWorldArea().getX() + nPC2.getWorldArea().getWidth(), nPC.getWorldLocation().getX()) && aJ.lIlIIIlIlIllIl(nPC2.getWorldArea().getX(), n2)) {
            n3 = llIIllIlIIl[1];

            if (2 <= 1) {
                return false;
            }
        } else {
            n3 = llIIllIlIIl[0];
        }
        return n3 != 0;
    }

    private static boolean lIlIIIlIllIlIl(int n2) {
        return n2 == 0;
    }

    @Subscribe
    public void b(StatChanged statChanged) {
        if (aJ.lIlIIIlIllIIIl(this.dW)) {
            this.dU.add(this.dW);

        }
    }

    static {
        aJ.lIlIIIlIlIlIll();
        aJ.lIlIIIlIIIlIIl();
        dR = llIIllIlIIl[14];
        dT = llIIllIlIIl[13];
        Point[] pointArray = new Point[llIIllIlIIl[15]];
        pointArray[aJ.llIIllIlIIl[0]] = new Point(llIIllIlIIl[16], llIIllIlIIl[17]);
        pointArray[aJ.llIIllIlIIl[1]] = new Point(llIIllIlIIl[18], llIIllIlIIl[17]);
        pointArray[aJ.llIIllIlIIl[3]] = new Point(llIIllIlIIl[17], llIIllIlIIl[19]);
        pointArray[aJ.llIIllIlIIl[4]] = new Point(llIIllIlIIl[17], llIIllIlIIl[17]);
        pointArray[aJ.llIIllIlIIl[2]] = new Point(llIIllIlIIl[17], llIIllIlIIl[18]);
        pointArray[aJ.llIIllIlIIl[10]] = new Point(llIIllIlIIl[20], llIIllIlIIl[7]);
        pointArray[aJ.llIIllIlIIl[11]] = new Point(llIIllIlIIl[20], llIIllIlIIl[8]);
        dQ = pointArray;
        int[] nArray = new int[llIIllIlIIl[3]];
        nArray[aJ.llIIllIlIIl[0]] = llIIllIlIIl[21];
        nArray[aJ.llIIllIlIIl[1]] = llIIllIlIIl[14];
        dS = nArray;
    }

    private void bE() {
        Item item2 = Inventory.getFirst(item -> item.getName().toLowerCase().contains(llIIllIIIlI[llIIllIlIIl[3]]));
        if (aJ.lIlIIIlIlIllll(item2)) {
            return;
        }
        int var1 = BoostingPotion.RANGING_POTION.getBoostAmount(Skill.RANGED);
        if (aJ.lIlIIIlIllIlll(Skills.getBoostedLevel((Skill)Skill.RANGED), Skills.getLevel((Skill)Skill.RANGED) + var1 - llIIllIlIIl[4])) {
            return;
        }
        item2.interact(llIIllIIIlI[llIIllIlIIl[1]]);
    }

    private static boolean lIlIIIlIlIllIl(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIlIIIlIlllIII(Object object, Object object2) {
        return object == object2;
    }

    private static boolean lIlIIIlIllIllI(int n2, int n3) {
        return n2 <= n3;
    }

    @Override
    public boolean bq() {
        return llIIllIlIIl[1];
    }

    private static boolean lIlIIIlIlIllII(int n2) {
        return n2 != 0;
    }

    private static boolean lIlIIIlIllIlll(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIlIIIlIlIllll(Object object) {
        return object == null;
    }

    private static boolean lIlIIIlIllIIIl(Object object) {
        return object != null;
    }

    private static int lIlIIIlIlIlllI(float f2, float f3) {
        return f2 == f3 ? 0 : (f2 > f3 ? 1 : -1);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean bC() {
        void var8_12;
        void var2;
        aJ var3;
        NPC nPC2 = this.bB();
        if (aJ.lIlIIIlIlIllll(nPC2)) {
            this.r();
            return llIIllIlIIl[0];
        }
        var3.bE();
        if (aJ.lIlIIIlIllIIII(var3.ea)) {
            var3.ea -= llIIllIlIIl[1];
            if (!aJ.lIlIIIlIllIIIl(var3.dW) || aJ.lIlIIIlIllIIlI(var3.dW.distanceTo((Locatable)Players.getLocal()), llIIllIlIIl[2])) {
                return llIIllIlIIl[1];
            }
        }
        if (aJ.lIlIIIlIllIIll(var3.dZ, llIIllIlIIl[3]) && !aJ.lIlIIIlIllIlII(var3.bA(), llIIllIlIIl[4]) || aJ.lIlIIIlIllIIll(var3.dZ, llIIllIlIIl[1]) && aJ.lIlIIIlIllIIll(var3.bA(), llIIllIlIIl[3])) {
            var3.dX = llIIllIlIIl[1];
        }
        WorldPoint var4 = Players.getLocal().getWorldLocation();
        var3.dZ = var3.bA();
        if (aJ.lIlIIIlIlIllII(var3.dX ? 1 : 0) && aJ.lIlIIIlIllIlII(var2.getId(), llIIllIlIIl[5])) {
            if (aJ.lIlIIIlIllIlIl(Movement.isRunEnabled() ? 1 : 0)) {
                Movement.toggleRun();
            }
            WorldPoint var5 = var3.a(new Point(llIIllIlIIl[6], llIIllIlIIl[7]));
            WorldPoint var6 = var3.a(new Point(llIIllIlIIl[6], llIIllIlIIl[8]));
            WorldPoint var7 = Players.getLocal().getWorldLocation();
            if (aJ.lIlIIIlIllIIII(aJ.lIlIIIlIlIlllI(var5.distanceTo2DHypotenuse(var7), var6.distanceTo2DHypotenuse(var7)))) {
                var5 = var6;
            }
            Movement.setDestination((WorldPoint)var5);
            return llIIllIlIIl[1];
        }
        if (aJ.lIlIIIlIllIIll(Players.getLocal().getGraphic(), llIIllIlIIl[9])) {
            var3.dX = llIIllIlIIl[1];
        }
        if (aJ.lIlIIIlIllIlIl(var3.dX ? 1 : 0)) {
            return llIIllIlIIl[0];
        }
        if (aJ.lIlIIIlIllIllI(var2.getWorldArea().getX(), var4.getWorldX()) && aJ.lIlIIIlIlIllII(var3.cW.redX() ? 1 : 0)) {
            if (aJ.lIlIIIlIlIllIl(var3.a(dQ[llIIllIlIIl[10]]).getWorldX(), var4.getWorldX())) {
                Movement.setDestination((WorldPoint)var4.dx(llIIllIlIIl[1]));
                return llIIllIlIIl[1];
            }
            var3.dX = llIIllIlIIl[0];
            return llIIllIlIIl[0];
        }
        var3.bp();
        if (aJ.lIlIIIlIllIlIl(Movement.isRunEnabled() ? 1 : 0)) {
            Movement.toggleRun();
        }
        List<NPC> var5 = var3.bD();
        WorldPoint var6 = var3.a(dQ[llIIllIlIIl[0]]);
        if (aJ.lIlIIIlIllIlll(var6.getWorldX(), var4.getWorldX())) {
            Movement.setDestination((WorldPoint)var6);
            return llIIllIlIIl[1];
        }
        List<WorldPoint> var7 = List.of(var3.a(dQ[llIIllIlIIl[4]]), var3.a(dQ[llIIllIlIIl[3]]), var3.a(dQ[llIIllIlIIl[2]]));
        List<WorldPoint> var8 = List.of(var3.a(dQ[llIIllIlIIl[10]]), var3.a(dQ[llIIllIlIIl[11]]));
        int var9 = NPCs.getAll((int[])dS).size();
        if (aJ.lIlIIIlIlIllII(var5.isEmpty() ? 1 : 0)) {
            WorldPoint var10 = var3.a(dQ[llIIllIlIIl[1]]);
            if (!aJ.lIlIIIlIllIlII(var9, llIIllIlIIl[12]) || aJ.lIlIIIlIllIIIl(var3.dW) && aJ.lIlIIIlIlIllII(var3.dW.getWorldArea().contains(var4) ? 1 : 0) && aJ.lIlIIIlIllIlll(var9, llIIllIlIIl[10])) {
                var10 = var8.stream().min(Comparator.comparingDouble(worldPoint2 -> worldPoint2.distanceTo2DHypotenuse(var4))).orElse(null);
            }
            if (aJ.lIlIIIlIllIlll(var10.getWorldX(), var4.getWorldX())) {
                Movement.setDestination((WorldPoint)var10);
            }
            return llIIllIlIIl[1];
        }
        NPC var10 = var5.stream().filter(nPC -> {
            int n2;
            if (aJ.lIlIIIlIllIIll(nPC.getId(), llIIllIlIIl[14]) && aJ.lIlIIIlIllIlIl(nPC.isDead() ? 1 : 0)) {
                n2 = llIIllIlIIl[1];

                if (3 <= ((25 + 141 - 78 + 64 ^ 80 + 58 - 81 + 85) & (0x8E ^ 0x82 ^ (0xD9 ^ 0xC3) ^ -1))) {
                    return ((0x9E ^ 0x91 ^ (0x47 ^ 0x1E)) & (132 + 46 - 26 + 64 ^ 4 + 16 - -29 + 93 ^ -1)) != 0;
                }
            } else {
                n2 = llIIllIlIIl[0];
            }
            return n2 != 0;
        }).filter(nPC -> {
            boolean bl2;
            if (aJ.lIlIIIlIllIlIl(this.dV.contains(nPC) ? 1 : 0)) {
                bl2 = llIIllIlIIl[1];

                if (((0xB ^ 0x54) & ~(0x7B ^ 0x24)) != 0) {
                    return (1 & ~1) != 0;
                }
            } else {
                bl2 = llIIllIlIIl[0];
            }
            return bl2;
        }).filter(nPC -> {
            boolean bl2;
            if (aJ.lIlIIIlIlllIIl(nPC, this.dW)) {
                bl2 = llIIllIlIIl[1];

                if ((0x24 ^ 0x20) == 0) {
                    return false;
                }
            } else {
                bl2 = llIIllIlIIl[0];
            }
            return bl2;
        }).findFirst().orElse(null);
        if (aJ.lIlIIIlIlIllll(var10)) {
            WorldPoint var11 = var3.a(dQ[llIIllIlIIl[4]]);
            WorldPoint var12 = var3.a(dQ[llIIllIlIIl[3]]);
            WorldPoint var13 = var3.a(dQ[llIIllIlIIl[2]]);
            if (aJ.lIlIIIlIlIllll(var3.dW)) {
                return llIIllIlIIl[0];
            }
            WorldArea var14 = var3.dW.getWorldArea();
            WorldPoint[] worldPointArray = new WorldPoint[llIIllIlIIl[4]];
            worldPointArray[aJ.llIIllIlIIl[0]] = var11;
            worldPointArray[aJ.llIIllIlIIl[1]] = var12;
            worldPointArray[aJ.llIIllIlIIl[3]] = var13;
            WorldPoint var15 = Stream.of(worldPointArray).min(Comparator.comparingDouble(worldPoint -> worldPoint.distanceTo2DHypotenuse(var14.getCenter()))).orElse(null);
            if (aJ.lIlIIIlIlIllII(var7.stream().allMatch(worldPoint2 -> {
                boolean bl2;
                if (aJ.lIlIIIlIllIllI(worldPoint2.getWorldX(), var4.getWorldX())) {
                    bl2 = llIIllIlIIl[1];

                    if (-1 > 1) {
                        return ((0x7A ^ 0x12 ^ (0x87 ^ 0xB4)) & (101 + 183 - 250 + 206 ^ 140 + 97 - 110 + 44 ^ -1)) != 0;
                    }
                } else {
                    bl2 = llIIllIlIIl[0];
                }
                return bl2;
            }) ? 1 : 0)) {
                if (aJ.lIlIIIlIlIllII(var7.contains(var4) ? 1 : 0)) {
                    var15 = var4.dx(llIIllIlIIl[1]);

                    if (-1 > -1) {
                        return false;
                    }
                } else if (aJ.lIlIIIlIlIllII(var14.contains(var4) ? 1 : 0) && aJ.lIlIIIlIllIlll(var9, llIIllIlIIl[10])) {
                    var15 = var8.stream().min(Comparator.comparingDouble(worldPoint2 -> worldPoint2.distanceTo2DHypotenuse(var4))).orElse(null);

                    if ((123 + 116 - 104 + 30 ^ 145 + 104 - 148 + 60) <= 0) {
                        return ((0x1F ^ 0x74 ^ (0xD5 ^ 0x97)) & (57 + 125 - 52 + 25 ^ 119 + 23 - -20 + 16 ^ -1)) != 0;
                    }
                } else if (aJ.lIlIIIlIllIlll(Math.abs(var14.getCenter().getWorldY() - var4.getWorldY()), llIIllIlIIl[1])) {
                    var15 = new WorldPoint(var4.getWorldX() + llIIllIlIIl[3], var14.getCenter().getWorldY(), var3.cu.getPlane());

                    }
                } else {
                    if (aJ.lIlIIIlIllIllI(var9, llIIllIlIIl[10])) {
                        return llIIllIlIIl[1];
                    }
                    var15 = var14.getCenter();
                }
            }
            Movement.setDestination((WorldPoint)var15);
            return llIIllIlIIl[1];
        }
        var10.interact(llIIllIIIlI[llIIllIlIIl[0]]);
        if (aJ.lIlIIIlIlIllII(Equipment.contains(item -> item.getName().contains(llIIllIIIlI[llIIllIlIIl[4]])) ? 1 : 0)) {
            var3.ea = llIIllIlIIl[1];
        }
        this.dW = var8_12;
        return llIIllIlIIl[1];
    }

    @Override
    public ConfigStorageBox<EquipmentSetup> br() {
        return this.cW.babaBoulderAttackStyle();
    }

    private static void lIlIIIlIIIlIIl() {
        llIIllIIIlI = new String[llIIllIlIIl[2]];
        aJ.llIIllIIIlI[aJ.llIIllIlIIl[0]] = "Attack";
        aJ.llIIllIIIlI[aJ.llIIllIlIIl[1]] = "Drink";
        aJ.llIIllIIIlI[aJ.llIIllIlIIl[3]] = "ranging";
        aJ.llIIllIIIlI[aJ.llIIllIlIIl[4]] = "faerdhinen";
    }

    @Subscribe
    public void a(AnimationChanged animationChanged) {
        if (aJ.lIlIIIlIlllIII(animationChanged.getActor(), this.bB()) && aJ.lIlIIIlIllIIll(animationChanged.getActor().getAnimation(), llIIllIlIIl[13])) {
            this.dY = Static.getClient().getTickCount();
        }
    }

    @Inject
    protected DoingBoulderDashTask(Client client, z z2, TOAConfig tOAConfig, SquireAutoTOA squireAutoTOA) {
        super(client, z2, tOAConfig);
        this.dU = new HashSet<NPC>();
        this.dV = new HashSet<NPC>();
        this.dX = llIIllIlIIl[0];
        this.dZ = llIIllIlIIl[0];
        this.ea = llIIllIlIIl[0];
        this.aY = squireAutoTOA;
    }

    private static boolean lIlIIIlIllIlII(int n2, int n3) {
        return n2 != n3;
    }

    /*
     * WARNING - void declaration
     */
    private List<NPC> bD() {
        int n2;
        List list = NPCs.getAll((int[])dS);
        int n3 = n2 = Players.getLocal().getWorldX();
        Iterator var16 = list.iterator();
        while (aJ.lIlIIIlIlIllII(var16.hasNext() ? 1 : 0)) {
            void var17;
            NPC var18 = (NPC)var16.next();
            if (aJ.lIlIIIlIlIllIl(var18.getWorldLocation().getX(), (int)var17) && aJ.lIlIIIlIlIllII(NPCs.getAll(arg_0 -> aJ.a(var18, (int)var17, arg_0)).isEmpty() ? 1 : 0)) {
                int var19 = var18.getWorldLocation().getX();

                if (((0x15 ^ 0x4A ^ (0x1E ^ 0x70)) & (2 ^ 0x38 ^ (0x5D ^ 0x56) ^ -1)) == 0) break;
                return null;
            }

            if ((21 + 187 - 25 + 6 ^ 128 + 112 - 74 + 18) != 0) continue;
            return null;
        }
        int n4 = n3;
        return list.stream().filter(nPC -> {
            boolean bl2;
            if (aJ.lIlIIIlIllIIll(nPC.getWorldLocation().getX(), n4)) {
                bl2 = llIIllIlIIl[1];

            } else {
                bl2 = llIIllIlIIl[0];
            }
            return bl2;
        }).collect(Collectors.toList());
    }

        return String.valueOf(var20);
    }

    private static boolean lIlIIIlIllIIlI(int n2, int n3) {
        return n2 < n3;
    }
}

