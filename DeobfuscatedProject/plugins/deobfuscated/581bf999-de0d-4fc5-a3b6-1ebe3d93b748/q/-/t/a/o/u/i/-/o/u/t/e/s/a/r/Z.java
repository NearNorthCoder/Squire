/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  com.openosrs.client.util.WeaponMap
 *  com.openosrs.client.util.WeaponStyle
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.util.Log
 *  net.runelite.api.Client
 *  net.runelite.api.EquipmentInventorySlot
 *  net.runelite.api.Item
 *  net.runelite.api.NPC
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.coords.RegionPoint
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.game.Prices
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 *  net.unethicalite.api.widgets.Prayers
 *  net.unethicalite.client.Static
 */
package q.-.t.a.o.u.i.-.o.u.t.e.s.a.r;

import com.google.inject.Inject;
import com.openosrs.client.util.WeaponMap;
import com.openosrs.client.util.WeaponStyle;
import gg.squire.autotoa.SquireAutoTOA;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.util.Log;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.EquipmentInventorySlot;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.coords.RegionPoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.game.Prices;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.widgets.Prayers;
import net.unethicalite.client.Static;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.A;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.C;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.e;

public abstract class Z
extends Task {
    private static final /* synthetic */ int cs;
    @Inject
    protected /* synthetic */ A cw;
    private static final /* synthetic */ int ct;
    private static /* synthetic */ String[] llIlIlIIlII;
    @Inject
    protected /* synthetic */ TOAConfig d;
    private static /* synthetic */ int[] llIlIlIIlIl;
    private static final /* synthetic */ int cr;
    protected final /* synthetic */ Client cu;
    @Inject
    protected /* synthetic */ C t;
    private final /* synthetic */ Map<WorldPoint, WorldPoint> cv;
    @Inject
    protected /* synthetic */ SquireAutoTOA aY;

    public int aX() {
        return Vars.getVarp((int)llIlIlIIlIl[2]);
    }

    /*
     * WARNING - void declaration
     */
    public void a(WorldPoint worldPoint, Predicate<WorldPoint> predicate) {
        void var4_4;
        Z llllllllllllllllIIllIlIIIIlIIlIl;
        void llllllllllllllllIIllIlIIIIlIIlII;
        void llllllllllllllllIIllIlIIIIlIIIll;
        if (Z.lIlIIllIlIllII(Reachable.isWalkable((WorldPoint)worldPoint) ? 1 : 0)) {
            return;
        }
        WorldPoint llllllllllllllllIIllIlIIIIlIIIlI = Players.getLocal().getWorldLocation();
        if (Z.lIlIIllIlIllII(llllllllllllllllIIllIlIIIIlIIIll.test(llllllllllllllllIIllIlIIIIlIIIlI) ? 1 : 0)) {
            Movement.setDestination((WorldPoint)llllllllllllllllIIllIlIIIIlIIlII);
            return;
        }
        List<WorldPoint> llllllllllllllllIIllIlIIIIlIIIIl = llllllllllllllllIIllIlIIIIlIIlIl.a(llllllllllllllllIIllIlIIIIlIIIlI, (WorldPoint)llllllllllllllllIIllIlIIIIlIIlII, (Predicate<WorldPoint>)llllllllllllllllIIllIlIIIIlIIIll);
        if (Z.lIlIIllIllIIII(llllllllllllllllIIllIlIIIIlIIIIl.size(), llIlIlIIlIl[1])) {
            Movement.setDestination((WorldPoint)llllllllllllllllIIllIlIIIIlIIlII);
            return;
        }
        WorldPoint worldPoint2 = (WorldPoint)var4_4.get(llIlIlIIlIl[1]);
        Movement.setDestination((WorldPoint)worldPoint2);
    }

    private static boolean lIlIIllIlIIlll(int n2, int n3) {
        return n2 < n3;
    }

    public boolean bc() {
        int n2;
        Z llllllllllllllllIIllIlIIIIlllIlI;
        if (Z.lIlIIllIlIllII(Static.getClient().isInInstancedRegion() ? 1 : 0)) {
            this.cv.clear();
            return llIlIlIIlIl[0];
        }
        if (Z.lIlIIllIlIllII(llllllllllllllllIIllIlIIIIlllIlI.bb() ? 1 : 0) && Z.lIlIIllIlIllII(llllllllllllllllIIllIlIIIIlllIlI.j(llIlIlIIlIl[18]) ? 1 : 0) && Z.lIlIIllIlIllII(llllllllllllllllIIllIlIIIIlllIlI.j(llIlIlIIlIl[19]) ? 1 : 0) && Z.lIlIIllIlIllII(llllllllllllllllIIllIlIIIIlllIlI.j(llIlIlIIlIl[20]) ? 1 : 0)) {
            n2 = llIlIlIIlIl[1];
            0;
            if (1 != 1) {
                return ((0xF0 ^ 0x90 ^ (0xA ^ 0x44)) & (142 + 135 - 214 + 103 ^ 119 + 77 - 153 + 93 ^ -1)) != 0;
            }
        } else {
            n2 = llIlIlIIlIl[0];
        }
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    private List<WorldPoint> a(WorldPoint worldPoint, WorldPoint worldPoint3, Predicate<WorldPoint> predicate) {
        void var8_8;
        void llllllllllllllllIIllIlIIIIIlIIIl;
        void llllllllllllllllIIllIlIIIIIIlllI;
        List llllllllllllllllIIllIlIIIIIIlIIl;
        void llllllllllllllllIIllIlIIIIIlIIII;
        WorldPoint llllllllllllllllIIllIlIIIIIIlIlI;
        void llllllllllllllllIIllIlIIIIIIllII;
        HashMap hashMap = new HashMap();
        HashMap<WorldPoint, Integer> hashMap2 = new HashMap<WorldPoint, Integer>();
        PriorityQueue<WorldPoint> priorityQueue = new PriorityQueue<WorldPoint>(Comparator.comparingInt(worldPoint2 -> (Integer)hashMap2.get(worldPoint2) + worldPoint2.distanceTo(worldPoint3)));
        HashSet hashSet = new HashSet();
        priorityQueue.add(worldPoint);
        0;
        hashMap2.put(worldPoint, llIlIlIIlIl[0]);
        0;
        while (Z.lIlIIllIlIllII(llllllllllllllllIIllIlIIIIIIllII.isEmpty() ? 1 : 0)) {
            void llllllllllllllllIIllIlIIIIIIlIll;
            if (Z.lIlIIllIllIIIl(llllllllllllllllIIllIlIIIIIIllII.size(), llIlIlIIlIl[14])) {
                0;
                if (((0x62 ^ 0x73 ^ (0x1C ^ 0x23)) & (0x49 ^ 0x27 ^ (0xF3 ^ 0xB3) ^ -1)) < 2) break;
                return null;
            }
            llllllllllllllllIIllIlIIIIIIlIlI = (WorldPoint)llllllllllllllllIIllIlIIIIIIllII.poll();
            llllllllllllllllIIllIlIIIIIIlIll.add(llllllllllllllllIIllIlIIIIIIlIlI);
            0;
            if (Z.lIlIIllIlIlIll(llllllllllllllllIIllIlIIIIIlIIII.equals((Object)llllllllllllllllIIllIlIIIIIIlIlI) ? 1 : 0)) {
                0;
                if (1 == 1) break;
                return null;
            }
            llllllllllllllllIIllIlIIIIIIlIIl = llllllllllllllllIIllIlIIIIIIlIlI.createWorldArea(llIlIlIIlIl[8]).toWorldPointList();
            Iterator llllllllllllllllIIllIlIIIIIIlIII = llllllllllllllllIIllIlIIIIIIlIIl.iterator();
            while (Z.lIlIIllIlIlIll(llllllllllllllllIIllIlIIIIIIlIII.hasNext() ? 1 : 0)) {
                void llllllllllllllllIIllIlIIIIIIllIl;
                void llllllllllllllllIIllIlIIIIIIllll;
                Z llllllllllllllllIIllIlIIIIIlIIlI;
                WorldPoint llllllllllllllllIIllIlIIIIIIIlll = (WorldPoint)llllllllllllllllIIllIlIIIIIIlIII.next();
                if (!Z.lIlIIllIlIllII(llllllllllllllllIIllIlIIIIIIlIll.contains(llllllllllllllllIIllIlIIIIIIIlll) ? 1 : 0) || !Z.lIlIIllIlIlIll(llllllllllllllllIIllIlIIIIIIIlll.isInScene(llllllllllllllllIIllIlIIIIIlIIlI.cu) ? 1 : 0) || !Z.lIlIIllIlIlIll(llllllllllllllllIIllIlIIIIIIllll.test(llllllllllllllllIIllIlIIIIIIIlll) ? 1 : 0)) continue;
                if (Z.lIlIIllIlIlIll(Reachable.isObstacle((WorldPoint)llllllllllllllllIIllIlIIIIIIIlll) ? 1 : 0)) {
                    0;
                    if (1 != 0) continue;
                    return null;
                }
                int llllllllllllllllIIllIlIIIIIIIllI = (Integer)llllllllllllllllIIllIlIIIIIIllIl.get(llllllllllllllllIIllIlIIIIIIlIlI) + llIlIlIIlIl[1];
                if (Z.lIlIIllIlIlIll(llllllllllllllllIIllIlIIIIIIllIl.containsKey(llllllllllllllllIIllIlIIIIIIIlll) ? 1 : 0) && Z.lIlIIllIlIIlll((Integer)llllllllllllllllIIllIlIIIIIIllIl.get(llllllllllllllllIIllIlIIIIIIIlll), llllllllllllllllIIllIlIIIIIIIllI)) {
                    0;
                    if (-(0xD1 ^ 0x82 ^ (0x95 ^ 0xC3)) < 0) continue;
                    return null;
                }
                if (Z.lIlIIllIlIllII(llllllllllllllllIIllIlIIIIIIIlll.isInScene(llllllllllllllllIIllIlIIIIIlIIlI.cu) ? 1 : 0)) {
                    0;
                    if (null == null) continue;
                    return null;
                }
                if (!Z.lIlIIllIlIllII(llllllllllllllllIIllIlIIIIIIIlll.equals((Object)llllllllllllllllIIllIlIIIIIIlIlI) ? 1 : 0) || !Z.lIlIIllIlIlIll(llllllllllllllllIIllIlIIIIIIllll.test(llllllllllllllllIIllIlIIIIIIIlll) ? 1 : 0)) continue;
                if (Z.lIlIIllIlIllII(Reachable.isWalkable((WorldPoint)llllllllllllllllIIllIlIIIIIIIlll) ? 1 : 0)) {
                    0;
                    if ((0x1D ^ 0x19) > 3) continue;
                    return null;
                }
                llllllllllllllllIIllIlIIIIIIllIl.put(llllllllllllllllIIllIlIIIIIIIlll, llllllllllllllllIIllIlIIIIIIIllI);
                0;
                llllllllllllllllIIllIlIIIIIIlllI.put(llllllllllllllllIIllIlIIIIIIIlll, llllllllllllllllIIllIlIIIIIIlIlI);
                0;
                llllllllllllllllIIllIlIIIIIIllII.add(llllllllllllllllIIllIlIIIIIIIlll);
                0;
                0;
                if ((0xB8 ^ 0xBC) == (0x6D ^ 0x69)) continue;
                return null;
            }
            0;
            if (2 > 0) continue;
            return null;
        }
        if (Z.lIlIIllIlIllII(llllllllllllllllIIllIlIIIIIIlllI.containsKey(llllllllllllllllIIllIlIIIIIlIIII) ? 1 : 0)) {
            return Collections.emptyList();
        }
        llllllllllllllllIIllIlIIIIIIlIlI = new LinkedList();
        llllllllllllllllIIllIlIIIIIIlIIl = llllllllllllllllIIllIlIIIIIlIIII;
        while (Z.lIlIIllIlIllII(llllllllllllllllIIllIlIIIIIIlIIl.equals(llllllllllllllllIIllIlIIIIIlIIIl) ? 1 : 0)) {
            llllllllllllllllIIllIlIIIIIIlIlI.add(llllllllllllllllIIllIlIIIIIIlIIl);
            0;
            if (Z.lIlIIllIlIllII(llllllllllllllllIIllIlIIIIIIlllI.containsKey(llllllllllllllllIIllIlIIIIIIlIIl) ? 1 : 0)) {
                0;
                if (-1 < 0) break;
                return null;
            }
            llllllllllllllllIIllIlIIIIIIlIIl = (WorldPoint)llllllllllllllllIIllIlIIIIIIlllI.get(llllllllllllllllIIllIlIIIIIIlIIl);
            0;
            if (null == null) continue;
            return null;
        }
        var8_8.add(worldPoint);
        0;
        Collections.reverse(var8_8);
        return var8_8;
    }

    static {
        Z.lIlIIllIlIIllI();
        Z.lIlIIllIlIIlIl();
        cs = llIlIlIIlIl[29];
        ct = llIlIlIIlIl[14];
        cr = llIlIlIIlIl[17];
    }

    public boolean bb() {
        return this.j(llIlIlIIlIl[17]);
    }

    protected Z(Client client) {
        this.cv = new HashMap<WorldPoint, WorldPoint>();
        this.cu = client;
    }

    private static boolean lIlIIllIlIllll(Object object, Object object2) {
        return object == object2;
    }

    public boolean bf() {
        boolean bl2;
        if (Z.lIlIIllIlIllIl(this.bd())) {
            bl2 = llIlIlIIlIl[1];
            0;
            if (((52 + 105 - 81 + 95 ^ 119 + 17 - 121 + 118) & (85 + 183 - 119 + 39 ^ 140 + 18 - 138 + 126 ^ -1)) != 0) {
                return ((0x39 ^ 0x48 ^ (0xF1 ^ 0xB6)) & (50 + 117 - 54 + 23 ^ 77 + 126 - 106 + 93 ^ -1)) != 0;
            }
        } else {
            bl2 = llIlIlIIlIl[0];
        }
        return bl2;
    }

    /*
     * WARNING - void declaration
     */
    public int bg() {
        void llllllllllllllllIIllIlIIIIlIlllI;
        Item item = Equipment.fromSlot((EquipmentInventorySlot)EquipmentInventorySlot.WEAPON);
        if (Z.lIlIIllIlIlIlI(item)) {
            return llIlIlIIlIl[1];
        }
        String llllllllllllllllIIllIlIIIIlIllIl = llllllllllllllllIIllIlIIIIlIlllI.getName().toLowerCase();
        if (Z.lIlIIllIlIlIll(llllllllllllllllIIllIlIIIIlIllIl.contains(llIlIlIIlII[llIlIlIIlIl[27]]) ? 1 : 0)) {
            return llIlIlIIlIl[5];
        }
        if (!Z.lIlIIllIlIllII(llllllllllllllllIIllIlIIIIlIllIl.contains(llIlIlIIlII[llIlIlIIlIl[23]]) ? 1 : 0) || !Z.lIlIIllIlIllII(llllllllllllllllIIllIlIIIIlIllIl.contains(llIlIlIIlII[llIlIlIIlIl[5]]) ? 1 : 0) || !Z.lIlIIllIlIllII(llllllllllllllllIIllIlIIIIlIllIl.contains(llIlIlIIlII[llIlIlIIlIl[30]]) ? 1 : 0) || Z.lIlIIllIlIlIll(llllllllllllllllIIllIlIIIIlIllIl.contains(llIlIlIIlII[llIlIlIIlIl[31]]) ? 1 : 0)) {
            return llIlIlIIlIl[32];
        }
        if (Z.lIlIIllIlIlIll(llllllllllllllllIIllIlIIIIlIllIl.contains(llIlIlIIlII[llIlIlIIlIl[32]]) ? 1 : 0)) {
            return llIlIlIIlIl[33];
        }
        if (!Z.lIlIIllIlIllII(llllllllllllllllIIllIlIIIIlIllIl.contains(llIlIlIIlII[llIlIlIIlIl[34]]) ? 1 : 0) || Z.lIlIIllIlIlIll(llllllllllllllllIIllIlIIIIlIllIl.contains(llIlIlIIlII[llIlIlIIlIl[33]]) ? 1 : 0)) {
            return llIlIlIIlIl[33];
        }
        WeaponStyle llllllllllllllllIIllIlIIIIlIllII = WeaponMap.StyleMap.getOrDefault(llllllllllllllllIIllIlIIIIlIlllI.getId(), WeaponStyle.MELEE);
        if (Z.lIlIIllIlIllll(llllllllllllllllIIllIlIIIIlIllII, WeaponStyle.MELEE)) {
            return llIlIlIIlIl[1];
        }
        return llIlIlIIlIl[5];
    }

    /*
     * WARNING - void declaration
     */
    public boolean j(int n2) {
        void llllllllllllllllIIllIlIIIlIIlIII;
        int[] nArray = this.cu.getMapRegions();
        int n3 = nArray.length;
        int llllllllllllllllIIllIlIIIlIIIlll = llIlIlIIlIl[0];
        while (Z.lIlIIllIlIIlll(llllllllllllllllIIllIlIIIlIIIlll, (int)llllllllllllllllIIllIlIIIlIIlIII)) {
            void llllllllllllllllIIllIlIIIlIIlIlI;
            void llllllllllllllllIIllIlIIIlIIlIIl;
            void llllllllllllllllIIllIlIIIlIIIllI = llllllllllllllllIIllIlIIIlIIlIIl[llllllllllllllllIIllIlIIIlIIIlll];
            if (Z.lIlIIllIlIlIII((int)llllllllllllllllIIllIlIIIlIIIllI, (int)llllllllllllllllIIllIlIIIlIIlIlI)) {
                return llIlIlIIlIl[1];
            }
            ++llllllllllllllllIIllIlIIIlIIIlll;
            0;
            if (((0x61 ^ 0x53) & ~(0x11 ^ 0x23)) == 0) continue;
            return ((0x40 ^ 0x60) & ~(0x39 ^ 0x19)) != 0;
        }
        return llIlIlIIlIl[0];
    }

    private static boolean lIlIIllIlIlIlI(Object object) {
        return object == null;
    }

    private static boolean lIlIIllIlIllII(int n2) {
        return n2 == 0;
    }

    public WorldPoint c(RegionPoint regionPoint) {
        Client client = Static.getClient();
        WorldPoint worldPoint = Players.getLocal().getWorldLocation();
        return WorldPoint.toLocalInstance((Client)client, (WorldPoint)regionPoint.toWorld()).stream().min(Comparator.comparingInt(worldPoint2 -> worldPoint2.distanceTo2D(worldPoint))).orElse(null);
    }

    public boolean aZ() {
        boolean bl2;
        if (Z.lIlIIllIlIlIIl(Vars.getBit((int)llIlIlIIlIl[4]))) {
            bl2 = llIlIlIIlIl[1];
            0;
            if (-2 >= 0) {
                return ((0xC3 ^ 0x9F) & ~(0x76 ^ 0x2A)) != 0;
            }
        } else {
            bl2 = llIlIlIIlIl[0];
        }
        return bl2;
    }

    public boolean ba() {
        int llllllllllllllllIIllIlIIIIlllllI;
        int n2;
        Z llllllllllllllllIIllIlIIIlIIIIII;
        Item llllllllllllllllIIllIlIIIIllllll2;
        if (Z.lIlIIllIlIIlll(this.cu.getTickCount() - this.aY.h(), llIlIlIIlIl[5])) {
            return llIlIlIIlIl[0];
        }
        if (Z.lIlIIllIlIIlll(Prayers.getPoints(), llIlIlIIlIl[6])) {
            llllllllllllllllIIllIlIIIIllllll2 = Inventory.getFirst(item -> {
                int n2;
                if (!Z.lIlIIllIlIllII(e.TEARS_OF_ELIDINIS.d(item.getId()) ? 1 : 0) || !Z.lIlIIllIlIllII(item.getName().contains(llIlIlIIlII[llIlIlIIlIl[45]]) ? 1 : 0) || !Z.lIlIIllIlIllII(item.getName().contains(llIlIlIIlII[llIlIlIIlIl[46]]) ? 1 : 0) || Z.lIlIIllIlIlIll(item.getName().contains(llIlIlIIlII[llIlIlIIlIl[47]]) ? 1 : 0)) {
                    n2 = llIlIlIIlIl[1];
                    0;
                    if (1 >= 3) {
                        return ((8 ^ 0x5F ^ (0x83 ^ 0xC3)) & (118 + 95 - 79 + 42 ^ 126 + 0 - 9 + 50 ^ -1)) != 0;
                    }
                } else {
                    n2 = llIlIlIIlIl[0];
                }
                return n2 != 0;
            });
            if (Z.lIlIIllIlIlIlI(llllllllllllllllIIllIlIIIIllllll2)) {
                llllllllllllllllIIllIlIIIlIIIIII.aY.c();
                return llIlIlIIlIl[0];
            }
            llllllllllllllllIIllIlIIIIllllll2.interact(llIlIlIIlII[llIlIlIIlIl[0]]);
            if (Z.lIlIIllIlIIlll(Prayers.getPoints(), llIlIlIIlIl[7])) {
                return llIlIlIIlIl[1];
            }
            0;
            if (((0x37 ^ 8) & ~(0xA1 ^ 0x9E)) <= -1) {
                return ((0xD4 ^ 0x99) & ~(0xC6 ^ 0x8B)) != 0;
            }
        } else if (Z.lIlIIllIlIlIll(llllllllllllllllIIllIlIIIlIIIIII.d.dehydration() ? 1 : 0) && Z.lIlIIllIlIllII(llllllllllllllllIIllIlIIIlIIIIII.aZ() ? 1 : 0) && Z.lIlIIllIlIlIll(llllllllllllllllIIllIlIIIlIIIIII.aq() ? 1 : 0)) {
            int[] nArray = new int[llIlIlIIlIl[8]];
            nArray[Z.llIlIlIIlIl[0]] = llIlIlIIlIl[9];
            nArray[Z.llIlIlIIlIl[1]] = llIlIlIIlIl[10];
            llllllllllllllllIIllIlIIIIllllll2 = Inventory.getFirst((int[])nArray);
            if (Z.lIlIIllIlIllIl(llllllllllllllllIIllIlIIIIllllll2)) {
                llllllllllllllllIIllIlIIIIllllll2.interact(llIlIlIIlII[llIlIlIIlIl[1]]);
            }
        }
        int llllllllllllllllIIllIlIIIIllllll2 = Vars.getVarp((int)llIlIlIIlIl[11]);
        if (Z.lIlIIllIlIlIll(llllllllllllllllIIllIlIIIlIIIIII.aZ() ? 1 : 0)) {
            n2 = llIlIlIIlIl[12];
            0;
            if (1 <= 0) {
                return ((166 + 57 - 52 + 44 ^ 134 + 28 - 111 + 95) & (0x4C ^ 0x23 ^ (0x86 ^ 0xAC) ^ -1)) != 0;
            }
        } else {
            n2 = llllllllllllllllIIllIlIIIIlllllI = llIlIlIIlIl[13];
        }
        if (Z.lIlIIllIlIlIll(llllllllllllllllIIllIlIIIlIIIIII.d.overlyDraining() ? 1 : 0)) {
            int n3;
            if (Z.lIlIIllIlIlIll(llllllllllllllllIIllIlIIIlIIIIII.aZ() ? 1 : 0)) {
                n3 = llIlIlIIlIl[14];
                0;
                if (((0x3A ^ 0x30 ^ (0x35 ^ 0x6A)) & (62 + 32 - 2 + 104 ^ 11 + 63 - -61 + 10 ^ -1)) < 0) {
                    return ((0x20 ^ 0x2C ^ (0x74 ^ 0x24)) & (198 + 216 - 284 + 111 ^ 90 + 65 - -15 + 3 ^ -1)) != 0;
                }
            } else {
                n3 = llllllllllllllllIIllIlIIIIlllllI = llIlIlIIlIl[15];
            }
        }
        if (Z.lIlIIllIlIIlll(llllllllllllllllIIllIlIIIIllllll2, llllllllllllllllIIllIlIIIIlllllI)) {
            llllllllllllllllIIllIlIIIlIIIIII.aY.c();
            return llIlIlIIlIl[0];
        }
        llllllllllllllllIIllIlIIIlIIIIII.aY.c(llIlIlIIlIl[1]);
        Item llllllllllllllllIIllIlIIIIllllIl = Equipment.fromSlot((EquipmentInventorySlot)EquipmentInventorySlot.WEAPON);
        if (!Z.lIlIIllIlIllIl(llllllllllllllllIIllIlIIIIllllIl) || Z.lIlIIllIlIlllI(llllllllllllllllIIllIlIIIIllllIl.getId(), llIlIlIIlIl[16])) {
            int[] nArray = new int[llIlIlIIlIl[1]];
            nArray[Z.llIlIlIIlIl[0]] = llIlIlIIlIl[16];
            Item llllllllllllllllIIllIlIIIIllllII = Inventory.getFirst((int[])nArray);
            if (Z.lIlIIllIlIlIlI(llllllllllllllllIIllIlIIIIllllII)) {
                return llIlIlIIlIl[0];
            }
            llllllllllllllllIIllIlIIIIllllII.interact(llIlIlIIlII[llIlIlIIlIl[8]]);
        }
        Combat.toggleSpec();
        this.t.ao();
        this.t.an();
        this.aY.c(llIlIlIIlIl[0]);
        this.aY.b(this.cu.getTickCount());
        return llIlIlIIlIl[1];
    }

    private static boolean lIlIIllIlIlllI(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean lIlIIllIlIlIII(int n2, int n3) {
        return n2 == n3;
    }

    protected void bh() {
        Item item2 = Inventory.getAll(item -> {
            int n2;
            String[] stringArray = new String[llIlIlIIlIl[1]];
            stringArray[Z.llIlIlIIlIl[0]] = llIlIlIIlII[llIlIlIIlIl[40]];
            if (Z.lIlIIllIlIlIll(item.hasAction(stringArray) ? 1 : 0) && Z.lIlIIllIlIlIll(item.getName().contains(llIlIlIIlII[llIlIlIIlIl[41]]) ? 1 : 0)) {
                n2 = llIlIlIIlIl[1];
                0;
                if (null != null) {
                    return ((0x44 ^ 0x26) & ~(0x42 ^ 0x20)) != 0;
                }
            } else {
                n2 = llIlIlIIlIl[0];
            }
            return n2 != 0;
        }).stream().filter(item -> {
            String[] stringArray = new String[llIlIlIIlIl[1]];
            stringArray[Z.llIlIlIIlIl[0]] = llIlIlIIlII[llIlIlIIlIl[39]];
            return item.hasAction(stringArray);
        }).min(Comparator.comparingInt(item -> Prices.getItemPrice((int)item.getId()))).orElse(null);
        if (Z.lIlIIllIlIlIlI(item2)) {
            Log.info((String)llIlIlIIlII[llIlIlIIlIl[37]]);
            return;
        }
        item2.interact(llIlIlIIlII[llIlIlIIlIl[38]]);
    }

    private static String lIlIIllIlIIIll(String llllllllllllllllIIllIIllllllIIlI, String llllllllllllllllIIllIIllllllIIIl) {
        try {
            SecretKeySpec llllllllllllllllIIllIIllllllIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIllIIllllllIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllIIllIIllllllIlII = Cipher.getInstance("Blowfish");
            llllllllllllllllIIllIIllllllIlII.init(llIlIlIIlIl[8], llllllllllllllllIIllIIllllllIlIl);
            return new String(llllllllllllllllIIllIIllllllIlII.doFinal(Base64.getDecoder().decode(llllllllllllllllIIllIIllllllIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIIllIIllllllIIll) {
            llllllllllllllllIIllIIllllllIIll.printStackTrace();
            return null;
        }
    }

    private static void lIlIIllIlIIllI() {
        llIlIlIIlIl = new int[49];
        Z.llIlIlIIlIl[0] = (105 + 61 - 66 + 44 ^ 23 + 88 - 30 + 112) & (0x2E ^ 0x34 ^ (0xD9 ^ 0x92) ^ -1);
        Z.llIlIlIIlIl[1] = 1;
        Z.llIlIlIIlIl[2] = 0xFFFFAEFB & 0x5797;
        Z.llIlIlIIlIl[3] = -(0xFFFFF3CD & 0x6C37) & (0xFFFFF7FF & 0x7FD7);
        Z.llIlIlIIlIl[4] = 0xFFFFB97D & 0x7E9B;
        Z.llIlIlIIlIl[5] = 0x2F ^ 0x2A;
        Z.llIlIlIIlIl[6] = 0x37 ^ 4;
        Z.llIlIlIIlIl[7] = 0x56 ^ 0x48;
        Z.llIlIlIIlIl[8] = 2;
        Z.llIlIlIIlIl[9] = -(0xFFFFBFB1 & 0x555F) & (0xFFFFFFDD & Short.MAX_VALUE);
        Z.llIlIlIIlIl[10] = 0xFFFFFBCB & 0x6EFF;
        Z.llIlIlIIlIl[11] = 0xFFFFA93E & 0x57ED;
        Z.llIlIlIIlIl[12] = 0xFFFF9FF7 & 0x617F;
        Z.llIlIlIIlIl[13] = 0xFFFFC2FE & 0x3FEF;
        Z.llIlIlIIlIl[14] = 0xFFFFFDFF & 0x3F4;
        Z.llIlIlIIlIl[15] = -(0xFFFFBEDD & 0x4D36) & (0xFFFFEFFF & 0x1FFB);
        Z.llIlIlIIlIl[16] = -(0xFFFF95A5 & 0x7F5F) & (0xFFFFFFDF & 0x7FBF);
        Z.llIlIlIIlIl[17] = -(0xFFFFD23F & 0x6DE6) & (0xFFFFFFFF & 0x7775);
        Z.llIlIlIIlIl[18] = 0xFFFFBD76 & 0x7FDB;
        Z.llIlIlIIlIl[19] = 0xFFFFFD53 & 0x3BFE;
        Z.llIlIlIIlIl[20] = -(0xFFFFE5A5 & 0x5AFF) & (0xFFFFFFFE & 0x77F7);
        Z.llIlIlIIlIl[21] = 0xFFFFFFFD & 0x3D52;
        Z.llIlIlIIlIl[22] = -(0xFFFFCF77 & 0x348C) & (0xFFFFFF57 & 0x3FFB);
        Z.llIlIlIIlIl[23] = 0x72 ^ 0x2C ^ (0xC7 ^ 0x9D);
        Z.llIlIlIIlIl[24] = 0xFFFFBFF5 & 0x6DFB;
        Z.llIlIlIIlIl[25] = 0xFFFFAFFB & 0x7DF6;
        Z.llIlIlIIlIl[26] = 0xFFFFEDF3 & 0x3FFF;
        Z.llIlIlIIlIl[27] = 3;
        Z.llIlIlIIlIl[28] = 0xFFFFBFF4 & 0x6DFF;
        Z.llIlIlIIlIl[29] = -(0xFFFFD029 & Short.MAX_VALUE) & (0xFFFFFFFF & 0x75FD);
        Z.llIlIlIIlIl[30] = 0x6C ^ 0x1A ^ (0x7E ^ 0xE);
        Z.llIlIlIIlIl[31] = 0xC ^ 0xB;
        Z.llIlIlIIlIl[32] = 37 + 147 - 162 + 135 ^ 27 + 128 - 105 + 99;
        Z.llIlIlIIlIl[33] = 0x62 ^ 0x68;
        Z.llIlIlIIlIl[34] = 0x67 ^ 0x6E;
        Z.llIlIlIIlIl[35] = 0xE5 ^ 0x9F ^ (0xD3 ^ 0xA2);
        Z.llIlIlIIlIl[36] = 50 + 45 - -14 + 74 ^ 96 + 175 - 255 + 171;
        Z.llIlIlIIlIl[37] = 79 + 142 - 87 + 69 ^ 156 + 136 - 99 + 5;
        Z.llIlIlIIlIl[38] = 1 ^ 0x77 ^ (0x70 ^ 8);
        Z.llIlIlIIlIl[39] = 0x4B ^ 0x4E ^ (0x3E ^ 0x34);
        Z.llIlIlIIlIl[40] = 0x6C ^ 0x7C;
        Z.llIlIlIIlIl[41] = 15 + 144 - 109 + 95 ^ 65 + 11 - 15 + 67;
        Z.llIlIlIIlIl[42] = 0xF ^ 0x1D;
        Z.llIlIlIIlIl[43] = 60 + 94 - 2 + 31 ^ 33 + 116 - -6 + 9;
        Z.llIlIlIIlIl[44] = 0xA ^ 0x6A ^ (0xDF ^ 0xAB);
        Z.llIlIlIIlIl[45] = 0x14 ^ 0x28 ^ (0xA ^ 0x23);
        Z.llIlIlIIlIl[46] = 0x19 ^ 0xF;
        Z.llIlIlIIlIl[47] = 0x30 ^ 0x27;
        Z.llIlIlIIlIl[48] = 0x34 ^ 0x57 ^ (0xBD ^ 0xC6);
    }

    public boolean be() {
        int n2;
        NPC nPC = this.bd();
        if (Z.lIlIIllIlIllIl(nPC) && Z.lIlIIllIlIlIII(nPC.getAnimation(), llIlIlIIlIl[29])) {
            n2 = llIlIlIIlIl[1];
            0;
            if (-(98 + 12 - 58 + 127 ^ 61 + 182 - 85 + 25) > 0) {
                return ((0x3A ^ 0x52 ^ (0x4A ^ 0x73)) & (0xE1 ^ 0x99 ^ (0x71 ^ 0x58) ^ -1)) != 0;
            }
        } else {
            n2 = llIlIlIIlIl[0];
        }
        return n2 != 0;
    }

    protected void b(Predicate<Item> predicate) {
        Item item2 = Inventory.getAll(item -> {
            int n2;
            String[] stringArray = new String[llIlIlIIlIl[1]];
            stringArray[Z.llIlIlIIlIl[0]] = llIlIlIIlII[llIlIlIIlIl[43]];
            if (Z.lIlIIllIlIlIll(item.hasAction(stringArray) ? 1 : 0) && Z.lIlIIllIlIlIll(item.getName().contains(llIlIlIIlII[llIlIlIIlIl[44]]) ? 1 : 0)) {
                n2 = llIlIlIIlIl[1];
                0;
                if (null != null) {
                    return ((0x75 ^ 0x4C ^ (0x19 ^ 0x2B)) & (0x93 ^ 0xAD ^ (0x47 ^ 0x72) ^ -1)) != 0;
                }
            } else {
                n2 = llIlIlIIlIl[0];
            }
            return n2 != 0;
        }).stream().filter(predicate).filter(item -> {
            String[] stringArray = new String[llIlIlIIlIl[1]];
            stringArray[Z.llIlIlIIlIl[0]] = llIlIlIIlII[llIlIlIIlIl[42]];
            return item.hasAction(stringArray);
        }).min(Comparator.comparingInt(item -> Prices.getItemPrice((int)item.getId()))).orElse(null);
        if (Z.lIlIIllIlIlIlI(item2)) {
            Log.info((String)llIlIlIIlII[llIlIlIIlIl[35]]);
            return;
        }
        item2.interact(llIlIlIIlII[llIlIlIIlIl[36]]);
    }

    private static void lIlIIllIlIIlIl() {
        llIlIlIIlII = new String[llIlIlIIlIl[48]];
        Z.llIlIlIIlII[Z.llIlIlIIlIl[0]] = Z."Drink";
        Z.llIlIlIIlII[Z.llIlIlIIlIl[1]] = Z."Drink";
        Z.llIlIlIIlII[Z.llIlIlIIlIl[8]] = Z."Wield";
        Z.llIlIlIIlII[Z.llIlIlIIlIl[27]] = Z."blowpipe";
        Z.llIlIlIIlII[Z.llIlIlIIlIl[23]] = Z."trident";
        Z.llIlIlIIlII[Z.llIlIlIIlIl[5]] = Z."crossbow";
        Z.llIlIlIIlII[Z.llIlIlIIlIl[30]] = Z."staff";
        Z.llIlIlIIlII[Z.llIlIlIIlIl[31]] = Z."sceptre";
        Z.llIlIlIIlII[Z.llIlIlIIlIl[32]] = Z."shadow";
        Z.llIlIlIIlII[Z.llIlIlIIlIl[34]] = Z."twisted bow";
        Z.llIlIlIIlII[Z.llIlIlIIlIl[33]] = Z."faerdhinen";
        Z.llIlIlIIlII[Z.llIlIlIIlIl[35]] = Z."Trying to drop a potion (for space) but none can be found";
        Z.llIlIlIIlII[Z.llIlIlIIlIl[36]] = Z."Drop";
        Z.llIlIlIIlII[Z.llIlIlIIlIl[37]] = Z."Trying to drop a potion (for space) but none can be found";
        Z.llIlIlIIlII[Z.llIlIlIIlIl[38]] = Z."Drop";
        Z.llIlIlIIlII[Z.llIlIlIIlIl[39]] = Z."Drop";
        Z.llIlIlIIlII[Z.llIlIlIIlIl[40]] = Z."Empty";
        Z.llIlIlIIlII[Z.llIlIlIIlIl[41]] = Z."(";
        Z.llIlIlIIlII[Z.llIlIlIIlIl[42]] = Z."Drop";
        Z.llIlIlIIlII[Z.llIlIlIIlIl[43]] = Z."Empty";
        Z.llIlIlIIlII[Z.llIlIlIIlIl[44]] = Z."(";
        Z.llIlIlIIlII[Z.llIlIlIIlIl[45]] = Z."restore";
        Z.llIlIlIIlII[Z.llIlIlIIlIl[46]] = Z."Prayer";
        Z.llIlIlIIlII[Z.llIlIlIIlIl[47]] = Z."Sanfew";
    }

    private static String lIlIIllIlIIIlI(String llllllllllllllllIIllIIllllIlIlIl, String llllllllllllllllIIllIIllllIIllll) {
        llllllllllllllllIIllIIllllIlIlIl = new String(Base64.getDecoder().decode(llllllllllllllllIIllIIllllIlIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllIIllIIllllIlIIll = new StringBuilder();
        char[] llllllllllllllllIIllIIllllIlIIlI = llllllllllllllllIIllIIllllIIllll.toCharArray();
        int llllllllllllllllIIllIIllllIlIIIl = llIlIlIIlIl[0];
        char[] llllllllllllllllIIllIIllllIIlIll = llllllllllllllllIIllIIllllIlIlIl.toCharArray();
        int llllllllllllllllIIllIIllllIIlIlI = llllllllllllllllIIllIIllllIIlIll.length;
        int llllllllllllllllIIllIIllllIIlIIl = llIlIlIIlIl[0];
        while (Z.lIlIIllIlIIlll(llllllllllllllllIIllIIllllIIlIIl, llllllllllllllllIIllIIllllIIlIlI)) {
            char llllllllllllllllIIllIIllllIlIllI = llllllllllllllllIIllIIllllIIlIll[llllllllllllllllIIllIIllllIIlIIl];
            llllllllllllllllIIllIIllllIlIIll.append((char)(llllllllllllllllIIllIIllllIlIllI ^ llllllllllllllllIIllIIllllIlIIlI[llllllllllllllllIIllIIllllIlIIIl % llllllllllllllllIIllIIllllIlIIlI.length]));
            0;
            ++llllllllllllllllIIllIIllllIlIIIl;
            ++llllllllllllllllIIllIIllllIIlIIl;
            0;
            if (null == null) continue;
            return null;
        }
        return String.valueOf(llllllllllllllllIIllIIllllIlIIll);
    }

    public int aY() {
        return Vars.getBit((int)llIlIlIIlIl[3]);
    }

    private static boolean lIlIIllIlIlIll(int n2) {
        return n2 != 0;
    }

    private static boolean lIlIIllIlIlIIl(int n2) {
        return n2 > 0;
    }

    private static String lIlIIllIlIIlII(String llllllllllllllllIIllIIlllllIIlIl, String llllllllllllllllIIllIIlllllIIlII) {
        try {
            SecretKeySpec llllllllllllllllIIllIIlllllIlIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIllIIlllllIIlII.getBytes(StandardCharsets.UTF_8)), llIlIlIIlIl[32]), "DES");
            Cipher llllllllllllllllIIllIIlllllIIlll = Cipher.getInstance("DES");
            llllllllllllllllIIllIIlllllIIlll.init(llIlIlIIlIl[8], llllllllllllllllIIllIIlllllIlIII);
            return new String(llllllllllllllllIIllIIlllllIIlll.doFinal(Base64.getDecoder().decode(llllllllllllllllIIllIIlllllIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIIllIIlllllIIllI) {
            llllllllllllllllIIllIIlllllIIllI.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIIllIllIIII(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean lIlIIllIllIIIl(int n2, int n3) {
        return n2 > n3;
    }

    public boolean aq() {
        boolean bl2;
        if (!Z.lIlIIllIlIllII(this.j(llIlIlIIlIl[21]) ? 1 : 0) || Z.lIlIIllIlIlIll(this.j(llIlIlIIlIl[22]) ? 1 : 0)) {
            bl2 = llIlIlIIlIl[1];
            0;
            if (2 < -1) {
                return ((0 ^ 0x51) & ~(0x59 ^ 8)) != 0;
            }
        } else {
            bl2 = llIlIlIIlIl[0];
        }
        return bl2;
    }

    public NPC bd() {
        int[] nArray = new int[llIlIlIIlIl[23]];
        nArray[Z.llIlIlIIlIl[0]] = llIlIlIIlIl[24];
        nArray[Z.llIlIlIIlIl[1]] = llIlIlIIlIl[25];
        nArray[Z.llIlIlIIlIl[8]] = llIlIlIIlIl[26];
        nArray[Z.llIlIlIIlIl[27]] = llIlIlIIlIl[28];
        return NPCs.getNearest((int[])nArray);
    }

    private static boolean lIlIIllIlIllIl(Object object) {
        return object != null;
    }
}

