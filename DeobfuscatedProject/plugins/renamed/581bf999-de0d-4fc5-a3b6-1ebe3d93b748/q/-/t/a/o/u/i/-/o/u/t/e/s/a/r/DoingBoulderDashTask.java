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
package q.-.t.a.o.u.i.-.o.u.t.e.s.a.r;

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
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aI_Unknown;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.z_Unknown;

/* TASK: Doing boulder dash -> DoingboulderdashTask */
@TaskDesc(name="Doing boulder dash", priority=100, blocking=true, register=true)
public class DoingBoulderDashTask
extends aI_Unknown {
    private /* synthetic */ int dZ;
    private static /* synthetic */ String[] llIIllIIIlI;
    private static final /* synthetic */ int dT;
    private /* synthetic */ NPC dW;
    private final /* synthetic */ Set<NPC> dU;
    private /* synthetic */ int dY;
    private static final /* synthetic */ Point[] dQ;
    private final /* synthetic */ Set<NPC> dV;
    private static final /* synthetic */ int dR;
    private /* synthetic */ int ea;
    private static final /* synthetic */ int[] dS;
    private /* synthetic */ boolean dX;
    private static /* synthetic */ int[] llIIllIlIIl;

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

    private static /* synthetic */ boolean a(NPC nPC, int n2, NPC nPC2) {
        int n3;
        if (aJ.lIlIIIlIllIIll(nPC2.getId(), nPC.getId()) && aJ.lIlIIIlIllIlII(nPC2.getWorldLocation().getX(), nPC.getWorldLocation().getX()) && aJ.lIlIIIlIllIIlI(nPC2.getWorldArea().getX() + nPC2.getWorldArea().getWidth(), nPC.getWorldLocation().getX()) && aJ.lIlIIIlIlIllIl(nPC2.getWorldArea().getX(), n2)) {
            n3 = llIIllIlIIl[1];
            0;
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
            0;
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

    private static String lIlIIIlIIIIllI(String var9, String var15) {
        try {
            SecretKeySpec var33 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var15.getBytes(StandardCharsets.UTF_8)), llIIllIlIIl[12]), "DES");
            Cipher var2 = Cipher.getInstance("DES");
            var2.init(llIIllIlIIl[3], var33);
            return new String(var2.doFinal(Base64.getDecoder().decode(var9.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var24) {
            var24.printStackTrace();
            return null;
        }
    }

    private void bE() {
        Item item2 = Inventory.getFirst(item -> item.getName().toLowerCase().contains(llIIllIIIlI[llIIllIlIIl[3]]));
        if (aJ.lIlIIIlIlIllll(item2)) {
            return;
        }
        int var25 = BoostingPotion.RANGING_POTION.getBoostAmount(Skill.RANGED);
        if (aJ.lIlIIIlIllIlll(Skills.getBoostedLevel((Skill)Skill.RANGED), Skills.getLevel((Skill)Skill.RANGED) + var25 - llIIllIlIIl[4])) {
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

    private static void lIlIIIlIlIlIll() {
        llIIllIlIIl = new int[22];
        aJ.llIIllIlIIl[0] = (0xD8 ^ 0xA1 ^ (8 ^ 0x7D)) & (0x40 ^ 0x33 ^ 69 + 11 - -11 + 36 ^ -1);
        aJ.llIIllIlIIl[1] = 1;
        aJ.llIIllIlIIl[2] = 0x55 ^ 0x51;
        aJ.llIIllIlIIl[3] = 2;
        aJ.llIIllIlIIl[4] = 3;
        aJ.llIIllIlIIl[5] = 0xFFFFBF56 & 0x6EAD;
        aJ.llIIllIlIIl[6] = 0x2D ^ 0x3B;
        aJ.llIIllIlIIl[7] = 0x62 ^ 0x55 ^ (0x4E ^ 0x64);
        aJ.llIIllIlIIl[8] = 0x3E ^ 0x1D;
        aJ.llIIllIlIIl[9] = 235 + 140 - 147 + 17;
        aJ.llIIllIlIIl[10] = 136 + 73 - 186 + 119 ^ 39 + 12 - -82 + 6;
        aJ.llIIllIlIIl[11] = 0xCB ^ 0x9E ^ (0xFD ^ 0xAE);
        aJ.llIIllIlIIl[12] = 0x17 ^ 0x1F;
        aJ.llIIllIlIIl[13] = 0xFFFFF69D & 0x2F77;
        aJ.llIIllIlIIl[14] = -(0xFFFFEDBF & 0x53C9) & (0xFFFFFFDF & 0x6FAF);
        aJ.llIIllIlIIl[15] = 0x70 ^ 0x77;
        aJ.llIIllIlIIl[16] = 0x3E ^ 0x22;
        aJ.llIIllIlIIl[17] = 0xC4 ^ 0x8B ^ (3 ^ 0x6C);
        aJ.llIIllIlIIl[18] = 137 + 54 - 43 + 2 ^ 101 + 40 - 108 + 103;
        aJ.llIIllIlIIl[19] = 0x2B ^ 0xF ^ (0x7D ^ 0x7B);
        aJ.llIIllIlIIl[20] = 0xB1 ^ 0x99;
        aJ.llIIllIlIIl[21] = 0xFFFFBE06 & 0x6FFF;
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

    private static String lIlIIIlIIIlIII(String var16, String var21) {
        try {
            SecretKeySpec var3 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var21.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var30 = Cipher.getInstance("Blowfish");
            var30.init(llIIllIlIIl[3], var3);
            return new String(var30.doFinal(Base64.getDecoder().decode(var16.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var12) {
            var12.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean bC() {
        void var8_12;
        void var17;
        aJ var4;
        NPC nPC2 = this.bB();
        if (aJ.lIlIIIlIlIllll(nPC2)) {
            this.r();
            return llIIllIlIIl[0];
        }
        var4.bE();
        if (aJ.lIlIIIlIllIIII(var4.ea)) {
            var4.ea -= llIIllIlIIl[1];
            if (!aJ.lIlIIIlIllIIIl(var4.dW) || aJ.lIlIIIlIllIIlI(var4.dW.distanceTo((Locatable)Players.getLocal()), llIIllIlIIl[2])) {
                return llIIllIlIIl[1];
            }
        }
        if (aJ.lIlIIIlIllIIll(var4.dZ, llIIllIlIIl[3]) && !aJ.lIlIIIlIllIlII(var4.bA(), llIIllIlIIl[4]) || aJ.lIlIIIlIllIIll(var4.dZ, llIIllIlIIl[1]) && aJ.lIlIIIlIllIIll(var4.bA(), llIIllIlIIl[3])) {
            var4.dX = llIIllIlIIl[1];
        }
        WorldPoint var36 = Players.getLocal().getWorldLocation();
        var4.dZ = var4.bA();
        if (aJ.lIlIIIlIlIllII(var4.dX ? 1 : 0) && aJ.lIlIIIlIllIlII(var17.getId(), llIIllIlIIl[5])) {
            if (aJ.lIlIIIlIllIlIl(Movement.isRunEnabled() ? 1 : 0)) {
                Movement.toggleRun();
            }
            WorldPoint var22 = var4.a(new Point(llIIllIlIIl[6], llIIllIlIIl[7]));
            WorldPoint var6 = var4.a(new Point(llIIllIlIIl[6], llIIllIlIIl[8]));
            WorldPoint var5 = Players.getLocal().getWorldLocation();
            if (aJ.lIlIIIlIllIIII(aJ.lIlIIIlIlIlllI(var22.distanceTo2DHypotenuse(var5), var6.distanceTo2DHypotenuse(var5)))) {
                var22 = var6;
            }
            Movement.setDestination((WorldPoint)var22);
            return llIIllIlIIl[1];
        }
        if (aJ.lIlIIIlIllIIll(Players.getLocal().getGraphic(), llIIllIlIIl[9])) {
            var4.dX = llIIllIlIIl[1];
        }
        if (aJ.lIlIIIlIllIlIl(var4.dX ? 1 : 0)) {
            return llIIllIlIIl[0];
        }
        if (aJ.lIlIIIlIllIllI(var17.getWorldArea().getX(), var36.getWorldX()) && aJ.lIlIIIlIlIllII(var4.cW.redX() ? 1 : 0)) {
            if (aJ.lIlIIIlIlIllIl(var4.a(dQ[llIIllIlIIl[10]]).getWorldX(), var36.getWorldX())) {
                Movement.setDestination((WorldPoint)var36.dx(llIIllIlIIl[1]));
                return llIIllIlIIl[1];
            }
            var4.dX = llIIllIlIIl[0];
            return llIIllIlIIl[0];
        }
        var4.bp();
        if (aJ.lIlIIIlIllIlIl(Movement.isRunEnabled() ? 1 : 0)) {
            Movement.toggleRun();
        }
        List<NPC> var22 = var4.bD();
        WorldPoint var6 = var4.a(dQ[llIIllIlIIl[0]]);
        if (aJ.lIlIIIlIllIlll(var6.getWorldX(), var36.getWorldX())) {
            Movement.setDestination((WorldPoint)var6);
            return llIIllIlIIl[1];
        }
        List<WorldPoint> var5 = List.of(var4.a(dQ[llIIllIlIIl[4]]), var4.a(dQ[llIIllIlIIl[3]]), var4.a(dQ[llIIllIlIIl[2]]));
        List<WorldPoint> var8 = List.of(var4.a(dQ[llIIllIlIIl[10]]), var4.a(dQ[llIIllIlIIl[11]]));
        int var18 = NPCs.getAll((int[])dS).size();
        if (aJ.lIlIIIlIlIllII(var22.isEmpty() ? 1 : 0)) {
            WorldPoint var37 = var4.a(dQ[llIIllIlIIl[1]]);
            if (!aJ.lIlIIIlIllIlII(var18, llIIllIlIIl[12]) || aJ.lIlIIIlIllIIIl(var4.dW) && aJ.lIlIIIlIlIllII(var4.dW.getWorldArea().contains(var36) ? 1 : 0) && aJ.lIlIIIlIllIlll(var18, llIIllIlIIl[10])) {
                var37 = var8.stream().min(Comparator.comparingDouble(worldPoint2 -> worldPoint2.distanceTo2DHypotenuse(var36))).orElse(null);
            }
            if (aJ.lIlIIIlIllIlll(var37.getWorldX(), var36.getWorldX())) {
                Movement.setDestination((WorldPoint)var37);
            }
            return llIIllIlIIl[1];
        }
        NPC var37 = var22.stream().filter(nPC -> {
            int n2;
            if (aJ.lIlIIIlIllIIll(nPC.getId(), llIIllIlIIl[14]) && aJ.lIlIIIlIllIlIl(nPC.isDead() ? 1 : 0)) {
                n2 = llIIllIlIIl[1];
                0;
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
                0;
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
                0;
                if ((0x24 ^ 0x20) == 0) {
                    return false;
                }
            } else {
                bl2 = llIIllIlIIl[0];
            }
            return bl2;
        }).findFirst().orElse(null);
        if (aJ.lIlIIIlIlIllll(var37)) {
            WorldPoint var1 = var4.a(dQ[llIIllIlIIl[4]]);
            WorldPoint var13 = var4.a(dQ[llIIllIlIIl[3]]);
            WorldPoint var23 = var4.a(dQ[llIIllIlIIl[2]]);
            if (aJ.lIlIIIlIlIllll(var4.dW)) {
                return llIIllIlIIl[0];
            }
            WorldArea var14 = var4.dW.getWorldArea();
            WorldPoint[] worldPointArray = new WorldPoint[llIIllIlIIl[4]];
            worldPointArray[aJ.llIIllIlIIl[0]] = var1;
            worldPointArray[aJ.llIIllIlIIl[1]] = var13;
            worldPointArray[aJ.llIIllIlIIl[3]] = var23;
            WorldPoint var26 = Stream.of(worldPointArray).min(Comparator.comparingDouble(worldPoint -> worldPoint.distanceTo2DHypotenuse(var14.getCenter()))).orElse(null);
            if (aJ.lIlIIIlIlIllII(var5.stream().allMatch(worldPoint2 -> {
                boolean bl2;
                if (aJ.lIlIIIlIllIllI(worldPoint2.getWorldX(), var36.getWorldX())) {
                    bl2 = llIIllIlIIl[1];
                    0;
                    if (-1 > 1) {
                        return ((0x7A ^ 0x12 ^ (0x87 ^ 0xB4)) & (101 + 183 - 250 + 206 ^ 140 + 97 - 110 + 44 ^ -1)) != 0;
                    }
                } else {
                    bl2 = llIIllIlIIl[0];
                }
                return bl2;
            }) ? 1 : 0)) {
                if (aJ.lIlIIIlIlIllII(var5.contains(var36) ? 1 : 0)) {
                    var26 = var36.dx(llIIllIlIIl[1]);
                    0;
                    if (-1 > -1) {
                        return false;
                    }
                } else if (aJ.lIlIIIlIlIllII(var14.contains(var36) ? 1 : 0) && aJ.lIlIIIlIllIlll(var18, llIIllIlIIl[10])) {
                    var26 = var8.stream().min(Comparator.comparingDouble(worldPoint2 -> worldPoint2.distanceTo2DHypotenuse(var36))).orElse(null);
                    0;
                    if ((123 + 116 - 104 + 30 ^ 145 + 104 - 148 + 60) <= 0) {
                        return ((0x1F ^ 0x74 ^ (0xD5 ^ 0x97)) & (57 + 125 - 52 + 25 ^ 119 + 23 - -20 + 16 ^ -1)) != 0;
                    }
                } else if (aJ.lIlIIIlIllIlll(Math.abs(var14.getCenter().getWorldY() - var36.getWorldY()), llIIllIlIIl[1])) {
                    var26 = new WorldPoint(var36.getWorldX() + llIIllIlIIl[3], var14.getCenter().getWorldY(), var4.cu.getPlane());
                    0;
                    
                    }
                } else {
                    if (aJ.lIlIIIlIllIllI(var18, llIIllIlIIl[10])) {
                        return llIIllIlIIl[1];
                    }
                    var26 = var14.getCenter();
                }
            }
            Movement.setDestination((WorldPoint)var26);
            return llIIllIlIIl[1];
        }
        var37.interact(llIIllIIIlI[llIIllIlIIl[0]]);
        if (aJ.lIlIIIlIlIllII(Equipment.contains(item -> item.getName().contains(llIIllIIIlI[llIIllIlIIl[4]])) ? 1 : 0)) {
            var4.ea = llIIllIlIIl[1];
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
        aJ.llIIllIIIlI[aJ.llIIllIlIIl[0]] = aJ."Attack";
        aJ.llIIllIIIlI[aJ.llIIllIlIIl[1]] = aJ."Drink";
        aJ.llIIllIIIlI[aJ.llIIllIlIIl[3]] = aJ."ranging";
        aJ.llIIllIIIlI[aJ.llIIllIlIIl[4]] = aJ."faerdhinen";
    }

    @Subscribe
    public void a(AnimationChanged animationChanged) {
        if (aJ.lIlIIIlIlllIII(animationChanged.getActor(), this.bB()) && aJ.lIlIIIlIllIIll(animationChanged.getActor().getAnimation(), llIIllIlIIl[13])) {
            this.dY = Static.getClient().getTickCount();
        }
    }

    @Inject
    protected aJ(Client client, z z2, TOAConfig tOAConfig, SquireAutoTOA squireAutoTOA) {
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
        Iterator var29 = list.iterator();
        while (aJ.lIlIIIlIlIllII(var29.hasNext() ? 1 : 0)) {
            void var34;
            NPC var28 = (NPC)var29.next();
            if (aJ.lIlIIIlIlIllIl(var28.getWorldLocation().getX(), (int)var34) && aJ.lIlIIIlIlIllII(NPCs.getAll(arg_0 -> aJ.a(var28, (int)var34, arg_0)).isEmpty() ? 1 : 0)) {
                int llllllllllllllllIIllllIIIIIlIllI = var28.getWorldLocation().getX();
                0;
                if (((0x15 ^ 0x4A ^ (0x1E ^ 0x70)) & (2 ^ 0x38 ^ (0x5D ^ 0x56) ^ -1)) == 0) break;
                return null;
            }
            0;
            if ((21 + 187 - 25 + 6 ^ 128 + 112 - 74 + 18) != 0) continue;
            return null;
        }
        int n4 = n3;
        return list.stream().filter(nPC -> {
            boolean bl2;
            if (aJ.lIlIIIlIllIIll(nPC.getWorldLocation().getX(), n4)) {
                bl2 = llIIllIlIIl[1];
                0;
                if (-3 > 0) {
                    return ((0xC2 ^ 0x94 ^ (0x14 ^ 0x7A)) & (0x17 ^ 0xE ^ (0x40 ^ 0x61) ^ -1)) != 0;
                }
            } else {
                bl2 = llIIllIlIIl[0];
            }
            return bl2;
        }).collect(Collectors.toList());
    }

    private static String lIlIIIlIIIIlll(String var11, String var10) {
        var11 = new String(Base64.getDecoder().decode(var11.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var27 = new StringBuilder();
        char[] var32 = var10.toCharArray();
        int var7 = llIIllIlIIl[0];
        char[] var35 = var11.toCharArray();
        int var20 = var35.length;
        int var31 = llIIllIlIIl[0];
        while (aJ.lIlIIIlIllIIlI(var31, var20)) {
            char var19 = var35[var31];
            var27.append((char)(var19 ^ var32[var7 % var32.length]));
            0;
            ++var7;
            ++var31;
            0;
            if ((0x3B ^ 0x3F) >= 1) continue;
            return null;
        }
        return String.valueOf(var27);
    }

    private static boolean lIlIIIlIllIIlI(int n2, int n3) {
        return n2 < n3;
    }
}

