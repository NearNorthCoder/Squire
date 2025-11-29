/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Animation
 *  net.runelite.api.DynamicObject
 *  net.runelite.api.EquipmentInventorySlot
 *  net.runelite.api.GameObject
 *  net.runelite.api.NPC
 *  net.runelite.api.Tile
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.game.Combat$AttackStyle
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 *  net.unethicalite.api.scene.Tiles
 */
package q.i.e.u.s.s.o.e.i.n.l.f.-.r.o.-.p.-.m.r.o;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.moons.SquireMoonsOfPeril;
import gg.squire.moons.SquireMoonsOfPerilConfig;
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
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Animation;
import net.runelite.api.DynamicObject;
import net.runelite.api.EquipmentInventorySlot;
import net.runelite.api.GameObject;
import net.runelite.api.NPC;
import net.runelite.api.Tile;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.scene.Tiles;
import q.i.e.u.s.s.o.e.i.n.l.f.-.r.o.-.p.-.m.r.o.l;

/* TASK: Blood moon -> BloodmoonTask */
@TaskDesc(name="Blood moon")
public class b
extends Task {
    /* synthetic */ List<WorldPoint> v;
    /* synthetic */ List<WorldPoint> s;
    private /* synthetic */ long p;
    /* synthetic */ List<WorldPoint> y;
    /* synthetic */ List<WorldPoint> u;
    private static /* synthetic */ int[] lIIIIIIlIIIII;
    /* synthetic */ List<WorldPoint> w;
    /* synthetic */ WorldArea q;
    /* synthetic */ List<WorldPoint> r;
    private static /* synthetic */ String[] lIIIIIIIlllIl;
    /* synthetic */ List<WorldPoint> t;
    /* synthetic */ List<WorldPoint> x;
    private final /* synthetic */ SquireMoonsOfPerilConfig o;

    @Inject
    public b(SquireMoonsOfPerilConfig squireMoonsOfPerilConfig) {
        this.q = new WorldArea(lIIIIIIlIIIII[0], lIIIIIIlIIIII[1], lIIIIIIlIIIII[2], lIIIIIIlIIIII[3], lIIIIIIlIIIII[4]);
        WorldPoint[] worldPointArray = new WorldPoint[lIIIIIIlIIIII[5]];
        worldPointArray[b.lIIIIIIlIIIII[4]] = new WorldPoint(lIIIIIIlIIIII[6], lIIIIIIlIIIII[7], lIIIIIIlIIIII[4]);
        worldPointArray[b.lIIIIIIlIIIII[8]] = new WorldPoint(lIIIIIIlIIIII[9], lIIIIIIlIIIII[10], lIIIIIIlIIIII[4]);
        worldPointArray[b.lIIIIIIlIIIII[11]] = new WorldPoint(lIIIIIIlIIIII[6], lIIIIIIlIIIII[10], lIIIIIIlIIIII[4]);
        worldPointArray[b.lIIIIIIlIIIII[12]] = new WorldPoint(lIIIIIIlIIIII[9], lIIIIIIlIIIII[7], lIIIIIIlIIIII[4]);
        this.r = Arrays.asList(worldPointArray);
        WorldPoint[] worldPointArray2 = new WorldPoint[lIIIIIIlIIIII[5]];
        worldPointArray2[b.lIIIIIIlIIIII[4]] = new WorldPoint(lIIIIIIlIIIII[13], lIIIIIIlIIIII[14], lIIIIIIlIIIII[4]);
        worldPointArray2[b.lIIIIIIlIIIII[8]] = new WorldPoint(lIIIIIIlIIIII[15], lIIIIIIlIIIII[16], lIIIIIIlIIIII[4]);
        worldPointArray2[b.lIIIIIIlIIIII[11]] = new WorldPoint(lIIIIIIlIIIII[13], lIIIIIIlIIIII[16], lIIIIIIlIIIII[4]);
        worldPointArray2[b.lIIIIIIlIIIII[12]] = new WorldPoint(lIIIIIIlIIIII[15], lIIIIIIlIIIII[14], lIIIIIIlIIIII[4]);
        this.s = Arrays.asList(worldPointArray2);
        WorldPoint[] worldPointArray3 = new WorldPoint[lIIIIIIlIIIII[5]];
        worldPointArray3[b.lIIIIIIlIIIII[4]] = new WorldPoint(lIIIIIIlIIIII[17], lIIIIIIlIIIII[14], lIIIIIIlIIIII[4]);
        worldPointArray3[b.lIIIIIIlIIIII[8]] = new WorldPoint(lIIIIIIlIIIII[18], lIIIIIIlIIIII[16], lIIIIIIlIIIII[4]);
        worldPointArray3[b.lIIIIIIlIIIII[11]] = new WorldPoint(lIIIIIIlIIIII[17], lIIIIIIlIIIII[16], lIIIIIIlIIIII[4]);
        worldPointArray3[b.lIIIIIIlIIIII[12]] = new WorldPoint(lIIIIIIlIIIII[18], lIIIIIIlIIIII[14], lIIIIIIlIIIII[4]);
        this.t = Arrays.asList(worldPointArray3);
        WorldPoint[] worldPointArray4 = new WorldPoint[lIIIIIIlIIIII[5]];
        worldPointArray4[b.lIIIIIIlIIIII[4]] = new WorldPoint(lIIIIIIlIIIII[19], lIIIIIIlIIIII[7], lIIIIIIlIIIII[4]);
        worldPointArray4[b.lIIIIIIlIIIII[8]] = new WorldPoint(lIIIIIIlIIIII[20], lIIIIIIlIIIII[10], lIIIIIIlIIIII[4]);
        worldPointArray4[b.lIIIIIIlIIIII[11]] = new WorldPoint(lIIIIIIlIIIII[19], lIIIIIIlIIIII[10], lIIIIIIlIIIII[4]);
        worldPointArray4[b.lIIIIIIlIIIII[12]] = new WorldPoint(lIIIIIIlIIIII[20], lIIIIIIlIIIII[7], lIIIIIIlIIIII[4]);
        this.u = Arrays.asList(worldPointArray4);
        WorldPoint[] worldPointArray5 = new WorldPoint[lIIIIIIlIIIII[5]];
        worldPointArray5[b.lIIIIIIlIIIII[4]] = new WorldPoint(lIIIIIIlIIIII[19], lIIIIIIlIIIII[21], lIIIIIIlIIIII[4]);
        worldPointArray5[b.lIIIIIIlIIIII[8]] = new WorldPoint(lIIIIIIlIIIII[20], lIIIIIIlIIIII[22], lIIIIIIlIIIII[4]);
        worldPointArray5[b.lIIIIIIlIIIII[11]] = new WorldPoint(lIIIIIIlIIIII[19], lIIIIIIlIIIII[22], lIIIIIIlIIIII[4]);
        worldPointArray5[b.lIIIIIIlIIIII[12]] = new WorldPoint(lIIIIIIlIIIII[20], lIIIIIIlIIIII[21], lIIIIIIlIIIII[4]);
        this.v = Arrays.asList(worldPointArray5);
        WorldPoint[] worldPointArray6 = new WorldPoint[lIIIIIIlIIIII[5]];
        worldPointArray6[b.lIIIIIIlIIIII[4]] = new WorldPoint(lIIIIIIlIIIII[17], lIIIIIIlIIIII[23], lIIIIIIlIIIII[4]);
        worldPointArray6[b.lIIIIIIlIIIII[8]] = new WorldPoint(lIIIIIIlIIIII[18], lIIIIIIlIIIII[24], lIIIIIIlIIIII[4]);
        worldPointArray6[b.lIIIIIIlIIIII[11]] = new WorldPoint(lIIIIIIlIIIII[17], lIIIIIIlIIIII[24], lIIIIIIlIIIII[4]);
        worldPointArray6[b.lIIIIIIlIIIII[12]] = new WorldPoint(lIIIIIIlIIIII[18], lIIIIIIlIIIII[23], lIIIIIIlIIIII[4]);
        this.w = Arrays.asList(worldPointArray6);
        WorldPoint[] worldPointArray7 = new WorldPoint[lIIIIIIlIIIII[5]];
        worldPointArray7[b.lIIIIIIlIIIII[4]] = new WorldPoint(lIIIIIIlIIIII[13], lIIIIIIlIIIII[23], lIIIIIIlIIIII[4]);
        worldPointArray7[b.lIIIIIIlIIIII[8]] = new WorldPoint(lIIIIIIlIIIII[15], lIIIIIIlIIIII[24], lIIIIIIlIIIII[4]);
        worldPointArray7[b.lIIIIIIlIIIII[11]] = new WorldPoint(lIIIIIIlIIIII[13], lIIIIIIlIIIII[24], lIIIIIIlIIIII[4]);
        worldPointArray7[b.lIIIIIIlIIIII[12]] = new WorldPoint(lIIIIIIlIIIII[15], lIIIIIIlIIIII[23], lIIIIIIlIIIII[4]);
        this.x = Arrays.asList(worldPointArray7);
        WorldPoint[] worldPointArray8 = new WorldPoint[lIIIIIIlIIIII[5]];
        worldPointArray8[b.lIIIIIIlIIIII[4]] = new WorldPoint(lIIIIIIlIIIII[6], lIIIIIIlIIIII[21], lIIIIIIlIIIII[4]);
        worldPointArray8[b.lIIIIIIlIIIII[8]] = new WorldPoint(lIIIIIIlIIIII[9], lIIIIIIlIIIII[22], lIIIIIIlIIIII[4]);
        worldPointArray8[b.lIIIIIIlIIIII[11]] = new WorldPoint(lIIIIIIlIIIII[6], lIIIIIIlIIIII[22], lIIIIIIlIIIII[4]);
        worldPointArray8[b.lIIIIIIlIIIII[12]] = new WorldPoint(lIIIIIIlIIIII[9], lIIIIIIlIIIII[21], lIIIIIIlIIIII[4]);
        this.y = Arrays.asList(worldPointArray8);
        this.o = squireMoonsOfPerilConfig;
    }

    private static void lIIlIlllIIIlIII() {
        lIIIIIIlIIIII = new int[49];
        b.lIIIIIIlIIIII[0] = -(0xFFFFAEE1 & 0x7BBF) & (0xFFFFBFFF & 0x6FFB);
        b.lIIIIIIlIIIII[1] = 0xFFFFA5AA & 0x7FDF;
        b.lIIIIIIlIIIII[2] = 0x33 ^ 0x5F ^ (0x1D ^ 0x57);
        b.lIIIIIIlIIIII[3] = 0x12 ^ 4 ^ (0xAC ^ 0x96);
        b.lIIIIIIlIIIII[4] = (0xC3 ^ 0x8C ^ (0xBE ^ 0xB3)) & (83 + 131 - 97 + 121 ^ 47 + 44 - -41 + 40 ^ -1);
        b.lIIIIIIlIIIII[5] = 24 + 145 - 112 + 134 ^ 101 + 117 - 155 + 124;
        b.lIIIIIIlIIIII[6] = -(0xFFFFCD95 & 0x3AEB) & (0xFFFFBFFF & 0x4DF4);
        b.lIIIIIIlIIIII[7] = -(0xFFFFAF25 & 0x5ADB) & (0xFFFFFFBF & 0x2FDF);
        b.lIIIIIIlIIIII[8] = 1;
        b.lIIIIIIlIIIII[9] = 0xFFFFD7F3 & 0x2D7F;
        b.lIIIIIIlIIIII[10] = 0xFFFFEDFF & 0x379E;
        b.lIIIIIIlIIIII[11] = 2;
        b.lIIIIIIlIIIII[12] = 3;
        b.lIIIIIIlIIIII[13] = -(0xFFFFFE9E & 0x79E7) & (0xFFFFFDF7 & Short.MAX_VALUE);
        b.lIIIIIIlIIIII[14] = 0xFFFFE5BF & 0x3FDD;
        b.lIIIIIIlIIIII[15] = 0xFFFFFDFD & 0x773;
        b.lIIIIIIlIIIII[16] = -(0xFFFFBA7F & 0x5FC1) & (0xFFFFBFFF & 0x7FDC);
        b.lIIIIIIlIIIII[17] = 0xFFFFFDFF & 0x76F;
        b.lIIIIIIlIIIII[18] = 0xFFFFA7EF & 0x5D7E;
        b.lIIIIIIlIIIII[19] = -(0xFFFFDADD & 0x7F23) & (0xFFFFFFFD & 0x5F6F);
        b.lIIIIIIlIIIII[20] = 0xFFFFE7EE & 0x1D7D;
        b.lIIIIIIlIIIII[21] = -(0xFFFFDC5E & 0x6BFB) & (0xFFFFFDFB & 0x6FFF);
        b.lIIIIIIlIIIII[22] = -(0xFFFF96B7 & 0x6B4F) & (0xFFFFA7AF & 0x7FF7);
        b.lIIIIIIlIIIII[23] = 0xFFFFFFFE & 0x25A5;
        b.lIIIIIIlIIIII[24] = 0xFFFFEDAF & 0x37F3;
        b.lIIIIIIlIIIII[25] = 0xFFFFE776 & 0xDFEF;
        b.lIIIIIIlIIIII[26] = 0x42 ^ 0x30 ^ (0xB3 ^ 0xC4);
        b.lIIIIIIlIIIII[27] = 0xBA ^ 0xBC;
        b.lIIIIIIlIIIII[28] = -(0xFFFFCF6F & 0x7CB9) & (0xFFFFFFFB & 0x7EFF);
        b.lIIIIIIlIIIII[29] = 167 + 135 - 125 + 12 ^ 7 + 104 - 40 + 115;
        b.lIIIIIIlIIIII[30] = 0x35 ^ 0x17 ^ (0x7A ^ 0x50);
        b.lIIIIIIlIIIII[31] = 0xFFFFDF3E & 0x77F5;
        b.lIIIIIIlIIIII[32] = 0x1B ^ 0x12;
        b.lIIIIIIlIIIII[33] = 0x7C ^ 0x76;
        b.lIIIIIIlIIIII[34] = 0x86 ^ 0x8D;
        b.lIIIIIIlIIIII[35] = -(0xFFFFFDE7 & 0x4B19) & (0xFFFFFFDD & 0x7BFF);
        b.lIIIIIIlIIIII[36] = 0xFFFFAFFF & 0x7AD6;
        b.lIIIIIIlIIIII[37] = 126 + 126 - 121 + 6 ^ 33 + 33 - -23 + 44;
        b.lIIIIIIlIIIII[38] = 0x1B ^ 0x16;
        b.lIIIIIIlIIIII[39] = 0xAC ^ 0xA2;
        b.lIIIIIIlIIIII[40] = 0x25 ^ 0x2A;
        b.lIIIIIIlIIIII[41] = -1;
        b.lIIIIIIlIIIII[42] = 0x1B ^ 0x1C ^ (0x34 ^ 0x2D);
        b.lIIIIIIlIIIII[43] = 0xF9 ^ 0x92 ^ (0x6C ^ 0x17);
        b.lIIIIIIlIIIII[44] = 0x9B ^ 0x8A;
        b.lIIIIIIlIIIII[45] = 0x56 ^ 0x44;
        b.lIIIIIIlIIIII[46] = 0xAB ^ 0xB8;
        b.lIIIIIIlIIIII[47] = 0xFFFFBBFF & 0x76D7;
        b.lIIIIIIlIIIII[48] = 119 + 58 - 43 + 24 ^ 94 + 5 - -37 + 2;
    }

    private static boolean lIIlIlllIIIlllI(int n) {
        return n <= 0;
    }

    private static void lIIlIlllIIIIlll() {
        lIIIIIIIlllIl = new String[lIIIIIIlIIIII[48]];
        b.lIIIIIIIlllIl[b.lIIIIIIlIIIII[4]] = b."Cooked bream";
        b.lIIIIIIIlllIl[b.lIIIIIIlIIIII[8]] = b."Cooked bream";
        b.lIIIIIIIlllIl[b.lIIIIIIlIIIII[11]] = b."Eat";
        b.lIIIIIIIlllIl[b.lIIIIIIlIIIII[12]] = b."Cooked bream";
        b.lIIIIIIIlllIl[b.lIIIIIIlIIIII[5]] = b."Out of food & low HP!!";
        b.lIIIIIIIlllIl[b.lIIIIIIlIIIII[26]] = b."Quick-escape";
        b.lIIIIIIIlllIl[b.lIIIIIIlIIIII[27]] = b."Move to safe spot";
        b.lIIIIIIIlllIl[b.lIIIIIIlIIIII[29]] = b."Attacking";
        b.lIIIIIIIlllIl[b.lIIIIIIlIIIII[30]] = b."Drink";
        b.lIIIIIIIlllIl[b.lIIIIIIlIIIII[32]] = b."Attack";
        b.lIIIIIIIlllIl[b.lIIIIIIlIIIII[33]] = b."Avoiding explosions";
        b.lIIIIIIIlllIl[b.lIIIIIIlIIIII[34]] = b."Move to safe spot";
        b.lIIIIIIIlllIl[b.lIIIIIIlIIIII[37]] = b."Avoiding cat attack";
        b.lIIIIIIIlllIl[b.lIIIIIIlIIIII[38]] = b."halberd";
        b.lIIIIIIIlllIl[b.lIIIIIIlIIIII[39]] = b."Attacking cat";
        b.lIIIIIIIlllIl[b.lIIIIIIlIIIII[40]] = b."Attack";
        b.lIIIIIIIlllIl[b.lIIIIIIlIIIII[43]] = b."Moonlight potion";
        b.lIIIIIIIlllIl[b.lIIIIIIlIIIII[44]] = b."Moonlight potion";
        b.lIIIIIIIlllIl[b.lIIIIIIlIIIII[45]] = b."Stairs";
        b.lIIIIIIIlllIl[b.lIIIIIIlIIIII[46]] = b."Quick-escape";
    }

    private /* synthetic */ boolean a(NPC nPC, Tile tile) {
        int n;
        if (b.lIIlIlllIIIllII(this.b(tile.getWorldLocation()) ? 1 : 0) && b.lIIlIlllIIllIlI(tile.getWorldLocation().distanceTo(nPC.getWorldLocation()), lIIIIIIlIIIII[8])) {
            n = lIIIIIIlIIIII[8];
            0;
            if (-(0x1B ^ 0x1E) >= 0) {
                return false;
            }
        } else {
            n = lIIIIIIlIIIII[4];
        }
        return n != 0;
    }

    private static boolean lIIlIlllIIllIlI(int n, int n2) {
        return n <= n2;
    }

    private static int lIIlIlllIIIlIIl(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    private static boolean lIIlIlllIIllIII(int n, int n2) {
        return n > n2;
    }

    private static /* synthetic */ boolean a(Set set, WorldPoint worldPoint) {
        int n;
        if (b.lIIlIlllIIIllII(Reachable.isWalkable((WorldPoint)worldPoint) ? 1 : 0) && b.lIIlIlllIIIlIll(set.contains(worldPoint) ? 1 : 0)) {
            n = lIIIIIIlIIIII[8];
            0;
            
            }
        } else {
            n = lIIIIIIlIIIII[4];
        }
        return n != 0;
    }

    private static boolean lIIlIlllIIIllll(Object object) {
        return object == null;
    }

    private static boolean lIIlIlllIIlIIII(int n) {
        return n < 0;
    }

    private static boolean lIIlIlllIIlIlIl(int n) {
        return n >= 0;
    }

    private static boolean lIIlIlllIIlIlII(int n, int n2) {
        return n == n2;
    }

    public boolean run() {
        WorldPoint var17;
        List var21;
        TileObject lllllllllllllllIIIllllIlllIlllII2;
        b var26;
        if (b.lIIlIlllIIIlIll(this.a(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            return lIIIIIIlIIIII[4];
        }
        if (b.lIIlIlllIIIlIll(var26.b().isFullyEquipped() ? 1 : 0)) {
            if (b.lIIlIlllIIIllII(Inventory.isFull() ? 1 : 0)) {
                String[] stringArray = new String[lIIIIIIlIIIII[8]];
                stringArray[b.lIIIIIIlIIIII[4]] = lIIIIIIIlllIl[lIIIIIIlIIIII[4]];
                if (b.lIIlIlllIIIllII(Inventory.contains((String[])stringArray) ? 1 : 0) && b.lIIlIlllIIIllIl(Equipment.fromSlot((EquipmentInventorySlot)EquipmentInventorySlot.SHIELD)) && b.lIIlIlllIIIlllI(var26.b().get(EquipmentInventorySlot.SHIELD))) {
                    String[] stringArray2 = new String[lIIIIIIlIIIII[8]];
                    stringArray2[b.lIIIIIIlIIIII[4]] = lIIIIIIIlllIl[lIIIIIIlIIIII[8]];
                    Inventory.getFirst((String[])stringArray2).interact(lIIIIIIIlllIl[lIIIIIIlIIIII[11]]);
                }
            }
            var26.b().swap();
        }
        NPC var11 = NPCs.getNearest(nPC -> {
            int n;
            if (b.lIIlIlllIIlIlII(nPC.getId(), lIIIIIIlIIIII[35]) && b.lIIlIlllIIIllII(this.a(nPC.getWorldLocation()) ? 1 : 0)) {
                n = lIIIIIIlIIIII[8];
                0;
                
                }
            } else {
                n = lIIIIIIlIIIII[4];
            }
            return n != 0;
        });
        NPC var13 = NPCs.getNearest(nPC -> {
            int n;
            if (b.lIIlIlllIIlIlII(nPC.getId(), lIIIIIIlIIIII[47]) && b.lIIlIlllIIIllII(this.a(nPC.getWorldLocation()) ? 1 : 0)) {
                n = lIIIIIIlIIIII[8];
                0;
                if (((0xE6 ^ 0xBD) & ~(0x3A ^ 0x61)) != 0) {
                    return false;
                }
            } else {
                n = lIIIIIIlIIIII[4];
            }
            return n != 0;
        });
        int[] nArray = new int[lIIIIIIlIIIII[8]];
        nArray[b.lIIIIIIlIIIII[4]] = lIIIIIIlIIIII[25];
        TileObject var12 = TileObjects.getNearest((int[])nArray);
        String[] stringArray = new String[lIIIIIIlIIIII[8]];
        stringArray[b.lIIIIIIlIIIII[4]] = lIIIIIIIlllIl[lIIIIIIlIIIII[12]];
        if (b.lIIlIlllIIIlIll(Inventory.contains((String[])stringArray) ? 1 : 0) && b.lIIlIlllIIIllll(var11) && b.lIIlIlllIIIllll(var12) && b.lIIlIlllIIlIIII(b.lIIlIlllIIIlIIl(Combat.getHealthPercent(), 40.0))) {
            SquireMoonsOfPeril.g = lIIIIIIIlllIl[lIIIIIIlIIIII[5]];
            lllllllllllllllIIIllllIlllIlllII2 = TileObjects.getNearest(tileObject -> {
                int n;
                if (b.lIIlIlllIIIllII(tileObject.getName().contains(lIIIIIIIlllIl[lIIIIIIlIIIII[45]]) ? 1 : 0)) {
                    String[] stringArray = new String[lIIIIIIlIIIII[8]];
                    stringArray[b.lIIIIIIlIIIII[4]] = lIIIIIIIlllIl[lIIIIIIlIIIII[46]];
                    if (b.lIIlIlllIIIllII(tileObject.hasAction(stringArray) ? 1 : 0)) {
                        n = lIIIIIIlIIIII[8];
                        0;
                        if (-1 < 0) return n != 0;
                        return false;
                    }
                }
                n = lIIIIIIlIIIII[4];
                return n != 0;
            });
            if (b.lIIlIlllIIIllIl(lllllllllllllllIIIllllIlllIlllII2)) {
                lllllllllllllllIIIllllIlllIlllII2.interact(lIIIIIIIlllIl[lIIIIIIlIIIII[26]]);
                return lIIIIIIlIIIII[4];
            }
        }
        if (b.lIIlIlllIIIllll(var11) && b.lIIlIlllIIIllIl(var13)) {
            int lllllllllllllllIIIllllIlllIlllII2 = var26.b(var13.getWorldLocation()) ? 1 : 0;
            if (b.lIIlIlllIIIlIll(lllllllllllllllIIIllllIlllIlllII2)) {
                SquireMoonsOfPeril.g = lIIIIIIIlllIl[lIIIIIIlIIIII[27]];
                Movement.setDestination((WorldPoint)var13.getWorldLocation());
                return lIIIIIIlIIIII[4];
            }
            if (b.lIIlIlllIIIllII(lllllllllllllllIIIllllIlllIlllII2)) {
                int[] nArray2 = new int[lIIIIIIlIIIII[8]];
                nArray2[b.lIIIIIIlIIIII[4]] = lIIIIIIlIIIII[28];
                var21 = NPCs.getNearest((int[])nArray2);
                if (b.lIIlIlllIIIllIl(var21)) {
                    SquireMoonsOfPeril.g = lIIIIIIIlllIl[lIIIIIIlIIIII[29]];
                    if (b.lIIlIlllIIIllII(l.l() ? 1 : 0) && b.lIIlIlllIIIllII(Inventory.contains(item -> item.getName().contains(lIIIIIIIlllIl[lIIIIIIlIIIII[44]])) ? 1 : 0)) {
                        Inventory.getFirst(item -> item.getName().contains(lIIIIIIIlllIl[lIIIIIIlIIIII[43]])).interact(lIIIIIIIlllIl[lIIIIIIlIIIII[30]]);
                        return lIIIIIIlIIIII[4];
                    }
                    int[] nArray3 = new int[lIIIIIIlIIIII[8]];
                    nArray3[b.lIIIIIIlIIIII[4]] = lIIIIIIlIIIII[31];
                    if (b.lIIlIlllIIIllII(Equipment.contains((int[])nArray3) ? 1 : 0) && b.lIIlIlllIIlIIlI(Combat.getAttackStyle(), Combat.AttackStyle.THIRD)) {
                        Combat.setAttackStyle((Combat.AttackStyle)Combat.AttackStyle.THIRD);
                        return lIIIIIIlIIIII[4];
                    }
                    var21.interact(lIIIIIIIlllIl[lIIIIIIlIIIII[32]]);
                    return lIIIIIIlIIIII[8];
                }
            }
        }
        if (b.lIIlIlllIIIllll(var11) && b.lIIlIlllIIIllIl(var12)) {
            lllllllllllllllIIIllllIlllIlllII2 = var26.c();
            var21 = Players.getLocal().getWorldLocation().createWorldArea(lIIIIIIlIIIII[27]).toWorldPointList();
            var17 = var21.stream().filter(arg_0 -> b.a((Set)lllllllllllllllIIIllllIlllIlllII2, arg_0)).min(Comparator.comparingInt(worldPoint -> worldPoint.distanceTo(Players.getLocal().getWorldLocation()))).orElse(null);
            if (b.lIIlIlllIIIlIll(lllllllllllllllIIIllllIlllIlllII2.isEmpty() ? 1 : 0) && b.lIIlIlllIIIllIl(var17)) {
                SquireMoonsOfPeril.g = lIIIIIIIlllIl[lIIIIIIlIIIII[33]];
                Movement.setDestination((WorldPoint)var17);
                return lIIIIIIlIIIII[4];
            }
        }
        if (b.lIIlIlllIIIllIl(var11) && b.lIIlIlllIIIllIl(var13)) {
            int lllllllllllllllIIIllllIlllIlllII2 = var26.b(var13.getWorldLocation()) ? 1 : 0;
            if (b.lIIlIlllIIIlIll(lllllllllllllllIIIllllIlllIlllII2)) {
                SquireMoonsOfPeril.g = lIIIIIIIlllIl[lIIIIIIlIIIII[34]];
                Movement.setDestination((WorldPoint)var13.getWorldLocation());
                return lIIIIIIlIIIII[4];
            }
            if (b.lIIlIlllIIIllII(lllllllllllllllIIIllllIlllIlllII2)) {
                Object var16;
                int[] nArray4 = new int[lIIIIIIlIIIII[8]];
                nArray4[b.lIIIIIIlIIIII[4]] = lIIIIIIlIIIII[35];
                var21 = NPCs.getNearest((int[])nArray4);
                int[] nArray5 = new int[lIIIIIIlIIIII[8]];
                nArray5[b.lIIIIIIlIIIII[4]] = lIIIIIIlIIIII[25];
                var17 = TileObjects.getNearest((int[])nArray5);
                if (b.lIIlIlllIIIllIl(var17)) {
                    int var25 = b.a((TileObject)var17);
                    if (b.lIIlIlllIIlIlII(var25, lIIIIIIlIIIII[36])) {
                        ++var26.p;
                    }
                    if (b.lIIlIlllIIlIlIl(b.lIIlIlllIIIlIlI(var26.p, 3L))) {
                        int[] nArray6 = new int[lIIIIIIlIIIII[8]];
                        nArray6[b.lIIIIIIlIIIII[4]] = lIIIIIIlIIIII[25];
                        var16 = TileObjects.getNearest((int[])nArray6);
                        if (b.lIIlIlllIIIllIl(var16)) {
                            SquireMoonsOfPeril.g = lIIIIIIIlllIl[lIIIIIIlIIIII[37]];
                            Movement.setDestination((WorldPoint)var16.getWorldLocation());
                            Time.sleepTicks((int)lIIIIIIlIIIII[8]);
                            0;
                            var26.p = 0L;
                            return lIIIIIIlIIIII[8];
                        }
                    }
                }
                if (b.lIIlIlllIIIllIl(var21)) {
                    List var25;
                    String[] stringArray3 = new String[lIIIIIIlIIIII[8]];
                    stringArray3[b.lIIIIIIlIIIII[4]] = lIIIIIIIlllIl[lIIIIIIlIIIII[38]];
                    if (b.lIIlIlllIIIllII(Equipment.contains((String[])stringArray3) ? 1 : 0) && b.lIIlIlllIIllIII(Players.getLocal().getWorldLocation().distanceTo(var21.getWorldLocation()), lIIIIIIlIIIII[8]) && b.lIIlIlllIIIlIll((var16 = (var25 = Tiles.getAll().stream().filter(arg_0 -> b.b((NPC)var21, arg_0)).collect(Collectors.toList())).stream().filter(arg_0 -> var26.a((NPC)var21, arg_0)).collect(Collectors.toList())).isEmpty() ? 1 : 0)) {
                        Movement.setDestination((WorldPoint)((Tile)var16.get(lIIIIIIlIIIII[4])).getWorldLocation());
                        return lIIIIIIlIIIII[4];
                    }
                    SquireMoonsOfPeril.g = lIIIIIIIlllIl[lIIIIIIlIIIII[39]];
                    var21.interact(lIIIIIIIlllIl[lIIIIIIlIIIII[40]]);
                    return lIIIIIIlIIIII[8];
                }
            }
        }
        return lIIIIIIlIIIII[8];
    }

    public static int a(TileObject tileObject) {
        Animation animation;
        GameObject gameObject = (GameObject)tileObject;
        if (b.lIIlIlllIIIllIl(gameObject) && b.lIIlIlllIIIllII(gameObject.getRenderable() instanceof DynamicObject) && b.lIIlIlllIIIllIl(animation = ((DynamicObject)gameObject.getRenderable()).getAnimation())) {
            return animation.getId();
        }
        return lIIIIIIlIIIII[41];
    }

    private static String lIIlIlllIIIIIII(String var10, String var15) {
        try {
            SecretKeySpec var30 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var15.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var23 = Cipher.getInstance("Blowfish");
            var23.init(lIIIIIIlIIIII[11], var30);
            return new String(var23.doFinal(Base64.getDecoder().decode(var10.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var14) {
            var14.printStackTrace();
            return null;
        }
    }

    public EquipmentSetup b() {
        return (EquipmentSetup)this.o.bloodMoonGear().selected(EquipmentSetup.class);
    }

    private static boolean lIIlIlllIIIllIl(Object object) {
        return object != null;
    }

    private static String lIIlIlllIIIIIIl(String var7, String var24) {
        try {
            SecretKeySpec var19 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var24.getBytes(StandardCharsets.UTF_8)), lIIIIIIlIIIII[30]), "DES");
            Cipher var9 = Cipher.getInstance("DES");
            var9.init(lIIIIIIlIIIII[11], var19);
            return new String(var9.doFinal(Base64.getDecoder().decode(var7.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var18) {
            var18.printStackTrace();
            return null;
        }
    }

    private static int lIIlIlllIIIlIlI(long l2, long l3) {
        return l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
    }

    private static boolean lIIlIlllIIIllII(int n) {
        return n != 0;
    }

    /*
     * WARNING - void declaration
     */
    private boolean b(WorldPoint worldPoint) {
        List[] listArray = new List[lIIIIIIlIIIII[30]];
        listArray[b.lIIIIIIlIIIII[4]] = this.r;
        listArray[b.lIIIIIIlIIIII[8]] = this.s;
        listArray[b.lIIIIIIlIIIII[11]] = this.t;
        listArray[b.lIIIIIIlIIIII[12]] = this.u;
        listArray[b.lIIIIIIlIIIII[5]] = this.v;
        listArray[b.lIIIIIIlIIIII[26]] = this.w;
        listArray[b.lIIIIIIlIIIII[27]] = this.x;
        listArray[b.lIIIIIIlIIIII[29]] = this.y;
        Iterator<List> var1 = Arrays.asList(listArray).iterator();
        while (b.lIIlIlllIIIllII(var1.hasNext() ? 1 : 0)) {
            void var29;
            List var2 = var1.next();
            if (b.lIIlIlllIIIllII(var2.contains(var29) ? 1 : 0) && b.lIIlIlllIIIllII(var2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                return lIIIIIIlIIIII[8];
            }
            0;
            if (1 >= 0) continue;
            return ((0xAB ^ 0x8A ^ (0xDA ^ 0xB6)) & (178 + 134 - 230 + 134 ^ 32 + 96 - 122 + 143 ^ -1)) != 0;
        }
        return lIIIIIIlIIIII[4];
    }

    private static /* synthetic */ boolean b(NPC nPC, Tile tile) {
        boolean bl;
        if (b.lIIlIlllIIlllII(tile.getWorldLocation().distanceTo(nPC.getWorldLocation()), lIIIIIIlIIIII[42])) {
            bl = lIIIIIIlIIIII[8];
            0;
            if (((0xA6 ^ 0xB0) & ~(6 ^ 0x10)) != 0) {
                return false;
            }
        } else {
            bl = lIIIIIIlIIIII[4];
        }
        return bl;
    }

    private static String lIIlIlllIIIIIlI(String var20, String var4) {
        var20 = new String(Base64.getDecoder().decode(var20.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var8 = new StringBuilder();
        char[] var22 = var4.toCharArray();
        int var28 = lIIIIIIlIIIII[4];
        char[] var27 = var20.toCharArray();
        int var3 = var27.length;
        int var5 = lIIIIIIlIIIII[4];
        while (b.lIIlIlllIIlllII(var5, var3)) {
            char var6 = var27[var5];
            var8.append((char)(var6 ^ var22[var28 % var22.length]));
            0;
            ++var28;
            ++var5;
            0;
            if ((0xB5 ^ 0xA5 ^ (0x98 ^ 0x8C)) >= 0) continue;
            return null;
        }
        return String.valueOf(var8);
    }

    private Set<WorldPoint> c() {
        HashSet<WorldPoint> hashSet = new HashSet<WorldPoint>();
        int[] nArray = new int[lIIIIIIlIIIII[8]];
        nArray[b.lIIIIIIlIIIII[4]] = lIIIIIIlIIIII[25];
        List list = TileObjects.getAll((int[])nArray);
        list.forEach(tileObject -> {
            hashSet.add(tileObject.getWorldLocation());
            0;
        });
        return hashSet;
    }

    private static boolean lIIlIlllIIIlIll(int n) {
        return n == 0;
    }

    static {
        b.lIIlIlllIIIlIII();
        b.lIIlIlllIIIIlll();
    }

    private static boolean lIIlIlllIIlIIlI(Object object, Object object2) {
        return object != object2;
    }

    private static boolean lIIlIlllIIlllII(int n, int n2) {
        return n < n2;
    }

    protected boolean a(WorldPoint worldPoint) {
        return this.q.contains(worldPoint);
    }
}

