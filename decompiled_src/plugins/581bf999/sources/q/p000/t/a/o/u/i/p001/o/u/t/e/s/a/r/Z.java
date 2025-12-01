package q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r;

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
/* renamed from: q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.Z  reason: invalid package */
/* loaded from: 581bf999-de0d-4fc5-a3b6-1ebe3d93b748.jar:q/-/t/a/o/u/i/-/o/u/t/e/s/a/r/Z.class */
public abstract class Z extends Task {
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
    private final /* synthetic */ Map<WorldPoint, WorldPoint> cv = new HashMap();
    @Inject
    protected /* synthetic */ SquireAutoTOA aY;

    public int aX() {
        return Vars.getVarp(llIlIlIIlIl[2]);
    }

    public void a(WorldPoint worldPoint, Predicate<WorldPoint> predicate) {
        if (lIlIIllIlIllII(Reachable.isWalkable(worldPoint) ? 1 : 0)) {
            return;
        }
        WorldPoint worldLocation = Players.getLocal().getWorldLocation();
        if (lIlIIllIlIllII(predicate.test(worldLocation) ? 1 : 0)) {
            Movement.setDestination(worldPoint);
            return;
        }
        List<WorldPoint> a = a(worldLocation, worldPoint, predicate);
        if (lIlIIllIllIIII(a.size(), llIlIlIIlIl[1])) {
            Movement.setDestination(worldPoint);
        } else {
            Movement.setDestination(a.get(llIlIlIIlIl[1]));
        }
    }

    private static boolean lIlIIllIlIIlll(int i, int i2) {
        return i < i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    public boolean bc() {
        if (lIlIIllIlIllII(Static.getClient().isInInstancedRegion() ? 1 : 0)) {
            this.cv.clear();
            return llIlIlIIlIl[0];
        } else if (lIlIIllIlIllII(bb() ? 1 : 0) && lIlIIllIlIllII(j(llIlIlIIlIl[18]) ? 1 : 0) && lIlIIllIlIllII(j(llIlIlIIlIl[19]) ? 1 : 0) && lIlIIllIlIllII(j(llIlIlIIlIl[20]) ? 1 : 0)) {
            ?? r0 = llIlIlIIlIl[1];
            "".length();
            return " ".length() != " ".length() ? ((240 ^ 144) ^ (10 ^ 68)) & (((((142 + 135) - 214) + 103) ^ (((119 + 77) - 153) + 93)) ^ (-" ".length())) : r0;
        } else {
            return llIlIlIIlIl[0];
        }
    }

    private List<WorldPoint> a(WorldPoint worldPoint, WorldPoint worldPoint2, Predicate<WorldPoint> predicate) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        PriorityQueue priorityQueue = new PriorityQueue(Comparator.comparingInt(worldPoint3 -> {
            return ((Integer) hashMap2.get(worldPoint3)).intValue() + worldPoint3.distanceTo(worldPoint2);
        }));
        HashSet hashSet = new HashSet();
        priorityQueue.add(worldPoint);
        "".length();
        hashMap2.put(worldPoint, Integer.valueOf(llIlIlIIlIl[0]));
        "".length();
        do {
            if (lIlIIllIlIllII(priorityQueue.isEmpty() ? 1 : 0)) {
                if (lIlIIllIllIIIl(priorityQueue.size(), llIlIlIIlIl[14])) {
                    "".length();
                    if ((((98 ^ 115) ^ (28 ^ 35)) & (((73 ^ 39) ^ (243 ^ 179)) ^ (-" ".length()))) >= "  ".length()) {
                        return null;
                    }
                } else {
                    WorldPoint worldPoint4 = (WorldPoint) priorityQueue.poll();
                    hashSet.add(worldPoint4);
                    "".length();
                    if (lIlIIllIlIlIll(worldPoint2.equals(worldPoint4) ? 1 : 0)) {
                        "".length();
                        if (" ".length() != " ".length()) {
                            return null;
                        }
                    } else {
                        for (WorldPoint worldPoint5 : worldPoint4.createWorldArea(llIlIlIIlIl[8]).toWorldPointList()) {
                            if (lIlIIllIlIllII(hashSet.contains(worldPoint5) ? 1 : 0) && lIlIIllIlIlIll(worldPoint5.isInScene(this.cu) ? 1 : 0) && lIlIIllIlIlIll(predicate.test(worldPoint5) ? 1 : 0)) {
                                if (lIlIIllIlIlIll(Reachable.isObstacle(worldPoint5) ? 1 : 0)) {
                                    "".length();
                                    if (" ".length() == 0) {
                                        return null;
                                    }
                                } else {
                                    int intValue = ((Integer) hashMap2.get(worldPoint4)).intValue() + llIlIlIIlIl[1];
                                    if (lIlIIllIlIlIll(hashMap2.containsKey(worldPoint5) ? 1 : 0) && lIlIIllIlIIlll(((Integer) hashMap2.get(worldPoint5)).intValue(), intValue)) {
                                        "".length();
                                        if ((-((209 ^ 130) ^ (149 ^ 195))) >= 0) {
                                            return null;
                                        }
                                    } else if (lIlIIllIlIllII(worldPoint5.isInScene(this.cu) ? 1 : 0)) {
                                        "".length();
                                        if (0 != 0) {
                                            return null;
                                        }
                                    } else if (lIlIIllIlIllII(worldPoint5.equals(worldPoint4) ? 1 : 0) && lIlIIllIlIlIll(predicate.test(worldPoint5) ? 1 : 0)) {
                                        if (lIlIIllIlIllII(Reachable.isWalkable(worldPoint5) ? 1 : 0)) {
                                            "".length();
                                            if ((29 ^ 25) <= "   ".length()) {
                                                return null;
                                            }
                                        } else {
                                            hashMap2.put(worldPoint5, Integer.valueOf(intValue));
                                            "".length();
                                            hashMap.put(worldPoint5, worldPoint4);
                                            "".length();
                                            priorityQueue.add(worldPoint5);
                                            "".length();
                                            "".length();
                                            if ((true ^ true) != (true ^ true)) {
                                                return null;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        "".length();
                    }
                }
            }
            if (lIlIIllIlIllII(hashMap.containsKey(worldPoint2) ? 1 : 0)) {
                return Collections.emptyList();
            }
            LinkedList linkedList = new LinkedList();
            WorldPoint worldPoint6 = worldPoint2;
            do {
                if (lIlIIllIlIllII(worldPoint6.equals(worldPoint) ? 1 : 0)) {
                    linkedList.add(worldPoint6);
                    "".length();
                    if (lIlIIllIlIllII(hashMap.containsKey(worldPoint6) ? 1 : 0)) {
                        "".length();
                        if ((-" ".length()) >= 0) {
                            return null;
                        }
                    } else {
                        worldPoint6 = (WorldPoint) hashMap.get(worldPoint6);
                        "".length();
                    }
                }
                linkedList.add(worldPoint);
                "".length();
                Collections.reverse(linkedList);
                return linkedList;
            } while (0 == 0);
            return null;
        } while ("  ".length() > 0);
        return null;
    }

    static {
        lIlIIllIlIIllI();
        lIlIIllIlIIlIl();
        cs = llIlIlIIlIl[29];
        ct = llIlIlIIlIl[14];
        cr = llIlIlIIlIl[17];
    }

    public boolean bb() {
        return j(llIlIlIIlIl[17]);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Z(Client client) {
        this.cu = client;
    }

    private static boolean lIlIIllIlIllll(Object obj, Object obj2) {
        return obj == obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    public boolean bf() {
        if (lIlIIllIlIllIl(bd())) {
            ?? r0 = llIlIlIIlIl[1];
            "".length();
            return (((((52 + 105) - 81) + 95) ^ (((119 + 17) - 121) + 118)) & (((((85 + 183) - 119) + 39) ^ (((140 + 18) - 138) + 126)) ^ (-" ".length()))) != 0 ? ((57 ^ 72) ^ (241 ^ 182)) & (((((50 + 117) - 54) + 23) ^ (((77 + 126) - 106) + 93)) ^ (-" ".length())) : r0;
        }
        return llIlIlIIlIl[0];
    }

    public int bg() {
        Item fromSlot = Equipment.fromSlot(EquipmentInventorySlot.WEAPON);
        if (lIlIIllIlIlIlI(fromSlot)) {
            return llIlIlIIlIl[1];
        }
        String lowerCase = fromSlot.getName().toLowerCase();
        return lIlIIllIlIlIll(lowerCase.contains(llIlIlIIlII[llIlIlIIlIl[27]]) ? 1 : 0) ? llIlIlIIlIl[5] : (lIlIIllIlIllII(lowerCase.contains(llIlIlIIlII[llIlIlIIlIl[23]]) ? 1 : 0) && lIlIIllIlIllII(lowerCase.contains(llIlIlIIlII[llIlIlIIlIl[5]]) ? 1 : 0) && lIlIIllIlIllII(lowerCase.contains(llIlIlIIlII[llIlIlIIlIl[30]]) ? 1 : 0) && !lIlIIllIlIlIll(lowerCase.contains(llIlIlIIlII[llIlIlIIlIl[31]]) ? 1 : 0)) ? lIlIIllIlIlIll(lowerCase.contains(llIlIlIIlII[llIlIlIIlIl[32]]) ? 1 : 0) ? llIlIlIIlIl[33] : (!lIlIIllIlIllII(lowerCase.contains(llIlIlIIlII[llIlIlIIlIl[34]]) ? 1 : 0) || lIlIIllIlIlIll(lowerCase.contains(llIlIlIIlII[llIlIlIIlIl[33]]) ? 1 : 0)) ? llIlIlIIlIl[33] : lIlIIllIlIllll((WeaponStyle) WeaponMap.StyleMap.getOrDefault(Integer.valueOf(fromSlot.getId()), WeaponStyle.MELEE), WeaponStyle.MELEE) ? llIlIlIIlIl[1] : llIlIlIIlIl[5] : llIlIlIIlIl[32];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v16, types: [boolean] */
    public boolean j(int i) {
        int[] mapRegions = this.cu.getMapRegions();
        int length = mapRegions.length;
        int i2 = llIlIlIIlIl[0];
        while (lIlIIllIlIIlll(i2, length)) {
            if (lIlIIllIlIlIII(mapRegions[i2], i)) {
                return llIlIlIIlIl[1];
            }
            i2++;
            "".length();
            if ((true ^ true) & ((true ^ true) ^ true)) {
                return (true ^ true) & ((true ^ true) ^ true);
            }
        }
        return llIlIlIIlIl[0];
    }

    private static boolean lIlIIllIlIlIlI(Object obj) {
        return obj == null;
    }

    private static boolean lIlIIllIlIllII(int i) {
        return i == 0;
    }

    public WorldPoint c(RegionPoint regionPoint) {
        Client client = Static.getClient();
        WorldPoint worldLocation = Players.getLocal().getWorldLocation();
        return (WorldPoint) WorldPoint.toLocalInstance(client, regionPoint.toWorld()).stream().min(Comparator.comparingInt(worldPoint -> {
            return worldPoint.distanceTo2D(worldLocation);
        })).orElse(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    public boolean aZ() {
        if (lIlIIllIlIlIIl(Vars.getBit(llIlIlIIlIl[4]))) {
            ?? r0 = llIlIlIIlIl[1];
            "".length();
            return (-"  ".length()) >= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return llIlIlIIlIl[0];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v101, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v103, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v53, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v63, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v70, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v97, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v23, types: [boolean] */
    public boolean ba() {
        int i;
        int i2;
        if (lIlIIllIlIIlll(this.cu.getTickCount() - this.aY.h(), llIlIlIIlIl[5])) {
            return llIlIlIIlIl[0];
        }
        if (lIlIIllIlIIlll(Prayers.getPoints(), llIlIlIIlIl[6])) {
            Item first = Inventory.getFirst(item -> {
                if (lIlIIllIlIllII(EnumC0056e.TEARS_OF_ELIDINIS.d(item.getId()) ? 1 : 0) && lIlIIllIlIllII(item.getName().contains(llIlIlIIlII[llIlIlIIlIl[45]]) ? 1 : 0) && lIlIIllIlIllII(item.getName().contains(llIlIlIIlII[llIlIlIIlIl[46]]) ? 1 : 0) && !lIlIIllIlIlIll(item.getName().contains(llIlIlIIlII[llIlIlIIlIl[47]]) ? 1 : 0)) {
                    return llIlIlIIlIl[0];
                }
                ?? r0 = llIlIlIIlIl[1];
                "".length();
                return " ".length() >= "   ".length() ? ((8 ^ 95) ^ (131 ^ 195)) & (((((118 + 95) - 79) + 42) ^ (((126 + 0) - 9) + 50)) ^ (-" ".length())) : r0;
            });
            if (lIlIIllIlIlIlI(first)) {
                this.aY.c();
                return llIlIlIIlIl[0];
            }
            first.interact(llIlIlIIlII[llIlIlIIlIl[0]]);
            if (lIlIIllIlIIlll(Prayers.getPoints(), llIlIlIIlIl[7])) {
                return llIlIlIIlIl[1];
            }
            "".length();
            if (((55 ^ 8) & ((161 ^ 158) ^ (-1))) <= (-" ".length())) {
                return (true ^ true) & ((true ^ true) ^ true);
            }
        } else if (lIlIIllIlIlIll(this.d.dehydration() ? 1 : 0) && lIlIIllIlIllII(aZ() ? 1 : 0) && lIlIIllIlIlIll(aq() ? 1 : 0)) {
            int[] iArr = new int[llIlIlIIlIl[8]];
            iArr[llIlIlIIlIl[0]] = llIlIlIIlIl[9];
            iArr[llIlIlIIlIl[1]] = llIlIlIIlIl[10];
            Item first2 = Inventory.getFirst(iArr);
            if (lIlIIllIlIllIl(first2)) {
                first2.interact(llIlIlIIlII[llIlIlIIlIl[1]]);
            }
        }
        int varp = Vars.getVarp(llIlIlIIlIl[11]);
        if (lIlIIllIlIlIll(aZ() ? 1 : 0)) {
            i = llIlIlIIlIl[12];
            "".length();
            if (" ".length() <= 0) {
                return ((((166 + 57) - 52) + 44) ^ (((134 + 28) - 111) + 95)) & (((76 ^ 35) ^ (134 ^ 172)) ^ (-" ".length()));
            }
        } else {
            i = llIlIlIIlIl[13];
        }
        int i3 = i;
        if (lIlIIllIlIlIll(this.d.overlyDraining() ? 1 : 0)) {
            if (lIlIIllIlIlIll(aZ() ? 1 : 0)) {
                i2 = llIlIlIIlIl[14];
                "".length();
                if ((((58 ^ 48) ^ (53 ^ 106)) & (((((62 + 32) - 2) + 104) ^ (((11 + 63) - (-61)) + 10)) ^ (-" ".length()))) < 0) {
                    return ((32 ^ 44) ^ (116 ^ 36)) & (((((198 + 216) - 284) + 111) ^ (((90 + 65) - (-15)) + 3)) ^ (-" ".length()));
                }
            } else {
                i2 = llIlIlIIlIl[15];
            }
            i3 = i2;
        }
        if (lIlIIllIlIIlll(varp, i3)) {
            this.aY.c();
            return llIlIlIIlIl[0];
        }
        this.aY.c(llIlIlIIlIl[1]);
        Item fromSlot = Equipment.fromSlot(EquipmentInventorySlot.WEAPON);
        if (!lIlIIllIlIllIl(fromSlot) || lIlIIllIlIlllI(fromSlot.getId(), llIlIlIIlIl[16])) {
            int[] iArr2 = new int[llIlIlIIlIl[1]];
            iArr2[llIlIlIIlIl[0]] = llIlIlIIlIl[16];
            Item first3 = Inventory.getFirst(iArr2);
            if (lIlIIllIlIlIlI(first3)) {
                return llIlIlIIlIl[0];
            }
            first3.interact(llIlIlIIlII[llIlIlIIlIl[8]]);
        }
        Combat.toggleSpec();
        this.t.ao();
        this.t.an();
        this.aY.c(llIlIlIIlIl[0]);
        this.aY.b(this.cu.getTickCount());
        return llIlIlIIlIl[1];
    }

    private static boolean lIlIIllIlIlllI(int i, int i2) {
        return i != i2;
    }

    private static boolean lIlIIllIlIlIII(int i, int i2) {
        return i == i2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void bh() {
        Item item = (Item) Inventory.getAll(item2 -> {
            String[] strArr = new String[llIlIlIIlIl[1]];
            strArr[llIlIlIIlIl[0]] = llIlIlIIlII[llIlIlIIlIl[40]];
            if (lIlIIllIlIlIll(item2.hasAction(strArr) ? 1 : 0) && lIlIIllIlIlIll(item2.getName().contains(llIlIlIIlII[llIlIlIIlIl[41]]) ? 1 : 0)) {
                ?? r0 = llIlIlIIlIl[1];
                "".length();
                return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return llIlIlIIlIl[0];
        }).stream().filter(item3 -> {
            String[] strArr = new String[llIlIlIIlIl[1]];
            strArr[llIlIlIIlIl[0]] = llIlIlIIlII[llIlIlIIlIl[39]];
            return item3.hasAction(strArr);
        }).min(Comparator.comparingInt(item4 -> {
            return Prices.getItemPrice(item4.getId());
        })).orElse(null);
        if (lIlIIllIlIlIlI(item)) {
            Log.info(llIlIlIIlII[llIlIlIIlIl[37]]);
        } else {
            item.interact(llIlIlIIlII[llIlIlIIlIl[38]]);
        }
    }

    private static String lIlIIllIlIIIll(String llllllllllllllllIIllIIllllllIIII, String llllllllllllllllIIllIIllllllIIIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIllIIllllllIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llIlIlIIlIl[8], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllIIllIIllllllIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIIllIIllllllIIll) {
            llllllllllllllllIIllIIllllllIIll.printStackTrace();
            return null;
        }
    }

    private static void lIlIIllIlIIllI() {
        llIlIlIIlIl = new int[49];
        llIlIlIIlIl[0] = ((((105 + 61) - 66) + 44) ^ (((23 + 88) - 30) + 112)) & (((46 ^ 52) ^ (217 ^ 146)) ^ (-" ".length()));
        llIlIlIIlIl[1] = " ".length();
        llIlIlIIlIl[2] = (-20741) & 22423;
        llIlIlIIlIl[3] = (-((-3123) & 27703)) & (-2049) & 32727;
        llIlIlIIlIl[4] = (-18051) & 32411;
        llIlIlIIlIl[5] = 47 ^ 42;
        llIlIlIIlIl[6] = 55 ^ 4;
        llIlIlIIlIl[7] = 86 ^ 72;
        llIlIlIIlIl[8] = "  ".length();
        llIlIlIIlIl[9] = (-((-16463) & 21855)) & (-35) & 32767;
        llIlIlIIlIl[10] = (-1077) & 28415;
        llIlIlIIlIl[11] = (-22210) & 22509;
        llIlIlIIlIl[12] = (-24585) & 24959;
        llIlIlIIlIl[13] = (-15618) & 16367;
        llIlIlIIlIl[14] = (-513) & 1012;
        llIlIlIIlIl[15] = (-((-16675) & 19766)) & (-4097) & 8187;
        llIlIlIIlIl[16] = (-((-27227) & 32607)) & (-33) & 32703;
        llIlIlIIlIl[17] = (-((-11713) & 28134)) & (-1) & 30581;
        llIlIlIIlIl[18] = (-17034) & 32731;
        llIlIlIIlIl[19] = (-685) & 15358;
        llIlIlIIlIl[20] = (-((-6747) & 23295)) & (-2) & 30711;
        llIlIlIIlIl[21] = (-3) & 15698;
        llIlIlIIlIl[22] = (-((-12425) & 13452)) & (-169) & 16379;
        llIlIlIIlIl[23] = (114 ^ 44) ^ (199 ^ 157);
        llIlIlIIlIl[24] = (-16395) & 28155;
        llIlIlIIlIl[25] = (-20485) & 32246;
        llIlIlIIlIl[26] = (-4621) & 16383;
        llIlIlIIlIl[27] = "   ".length();
        llIlIlIIlIl[28] = (-16396) & 28159;
        llIlIlIIlIl[29] = (-((-12247) & 32767)) & (-1) & 30205;
        llIlIlIIlIl[30] = (108 ^ 26) ^ (126 ^ 14);
        llIlIlIIlIl[31] = 12 ^ 11;
        llIlIlIIlIl[32] = (((37 + 147) - 162) + 135) ^ (((27 + 128) - 105) + 99);
        llIlIlIIlIl[33] = 98 ^ 104;
        llIlIlIIlIl[34] = 103 ^ 110;
        llIlIlIIlIl[35] = (229 ^ 159) ^ (211 ^ 162);
        llIlIlIIlIl[36] = (((50 + 45) - (-14)) + 74) ^ (((96 + 175) - 255) + 171);
        llIlIlIIlIl[37] = (((79 + 142) - 87) + 69) ^ (((156 + 136) - 99) + 5);
        llIlIlIIlIl[38] = (1 ^ 119) ^ (112 ^ 8);
        llIlIlIIlIl[39] = (75 ^ 78) ^ (62 ^ 52);
        llIlIlIIlIl[40] = 108 ^ 124;
        llIlIlIIlIl[41] = (((15 + 144) - 109) + 95) ^ (((65 + 11) - 15) + 67);
        llIlIlIIlIl[42] = 15 ^ 29;
        llIlIlIIlIl[43] = (((60 + 94) - 2) + 31) ^ (((33 + 116) - (-6)) + 9);
        llIlIlIIlIl[44] = (10 ^ 106) ^ (223 ^ 171);
        llIlIlIIlIl[45] = (20 ^ 40) ^ (10 ^ 35);
        llIlIlIIlIl[46] = 25 ^ 15;
        llIlIlIIlIl[47] = 48 ^ 39;
        llIlIlIIlIl[48] = (52 ^ 87) ^ (189 ^ 198);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    public boolean be() {
        NPC bd = bd();
        if (lIlIIllIlIllIl(bd) && lIlIIllIlIlIII(bd.getAnimation(), llIlIlIIlIl[29])) {
            ?? r0 = llIlIlIIlIl[1];
            "".length();
            return (-((((98 + 12) - 58) + 127) ^ (((61 + 182) - 85) + 25))) > 0 ? ((58 ^ 82) ^ (74 ^ 115)) & (((225 ^ 153) ^ (113 ^ 88)) ^ (-" ".length())) : r0;
        }
        return llIlIlIIlIl[0];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void b(Predicate<Item> predicate) {
        Item item = (Item) Inventory.getAll(item2 -> {
            String[] strArr = new String[llIlIlIIlIl[1]];
            strArr[llIlIlIIlIl[0]] = llIlIlIIlII[llIlIlIIlIl[43]];
            if (lIlIIllIlIlIll(item2.hasAction(strArr) ? 1 : 0) && lIlIIllIlIlIll(item2.getName().contains(llIlIlIIlII[llIlIlIIlIl[44]]) ? 1 : 0)) {
                ?? r0 = llIlIlIIlIl[1];
                "".length();
                return 0 != 0 ? ((117 ^ 76) ^ (25 ^ 43)) & (((147 ^ 173) ^ (71 ^ 114)) ^ (-" ".length())) : r0;
            }
            return llIlIlIIlIl[0];
        }).stream().filter(predicate).filter(item3 -> {
            String[] strArr = new String[llIlIlIIlIl[1]];
            strArr[llIlIlIIlIl[0]] = llIlIlIIlII[llIlIlIIlIl[42]];
            return item3.hasAction(strArr);
        }).min(Comparator.comparingInt(item4 -> {
            return Prices.getItemPrice(item4.getId());
        })).orElse(null);
        if (lIlIIllIlIlIlI(item)) {
            Log.info(llIlIlIIlII[llIlIlIIlIl[35]]);
        } else {
            item.interact(llIlIlIIlII[llIlIlIIlIl[36]]);
        }
    }

    private static void lIlIIllIlIIlIl() {
        llIlIlIIlII = new String[llIlIlIIlIl[48]];
        llIlIlIIlII[llIlIlIIlIl[0]] = lIlIIllIlIIIlI("CTgABB8=", "MJijt");
        llIlIlIIlII[llIlIlIIlIl[1]] = lIlIIllIlIIIlI("FyMuHA8=", "SQGrd");
        llIlIlIIlII[llIlIlIIlIl[8]] = lIlIIllIlIIIll("0FOHyzYsQvo=", "nbxqb");
        llIlIlIIlII[llIlIlIIlIl[27]] = lIlIIllIlIIIll("RhWanhVlUQk9Qxg6LLo8ng==", "TCcor");
        llIlIlIIlII[llIlIlIIlIl[23]] = lIlIIllIlIIIlI("DCYTCi8WIA==", "xTznJ");
        llIlIlIIlII[llIlIlIIlIl[5]] = lIlIIllIlIIIlI("ITo1FjggJy0=", "BHZeK");
        llIlIlIIlII[llIlIlIIlIl[30]] = lIlIIllIlIIlII("FIXiF7io8bQ=", "YxTyM");
        llIlIlIIlII[llIlIlIIlIl[31]] = lIlIIllIlIIIll("9li/5RzXqeY=", "hFtiO");
        llIlIlIIlII[llIlIlIIlIl[32]] = lIlIIllIlIIIlI("CikOAz4O", "yAogQ");
        llIlIlIIlII[llIlIlIIlIl[34]] = lIlIIllIlIIIll("p9Df9lDx54wI1T5O6PiFqQ==", "vErJH");
        llIlIlIIlII[llIlIlIIlIl[33]] = lIlIIllIlIIlII("cZ1wmem4x0DFebU+pNkD1Q==", "NumEa");
        llIlIlIIlII[llIlIlIIlIl[35]] = lIlIIllIlIIIll("/XpO/h2rOd8SIfD3cDIqAfgFkSiecXYPvfDnAMbcREtn5xS8FeuO9DTpKIpqdS97amiQa4efO2Fhn8ebmHr2ig==", "cEHEi");
        llIlIlIIlII[llIlIlIIlIl[36]] = lIlIIllIlIIIlI("NhkrNQ==", "rkDEa");
        llIlIlIIlII[llIlIlIIlIl[37]] = lIlIIllIlIIlII("uB42NwTWps9EOQ3g+JJrfgp5QioHt+P8M+Fchvxa8w9aNtni3G6dHcBo9mD95x9L3IkweUeA297yszNWvCWvRw==", "IiAxn");
        llIlIlIIlII[llIlIlIIlIl[38]] = lIlIIllIlIIIll("U9qRk6jAAN0=", "upCLC");
        llIlIlIIlII[llIlIlIIlIl[39]] = lIlIIllIlIIIlI("ChwjAw==", "NnLsn");
        llIlIlIIlII[llIlIlIIlIl[40]] = lIlIIllIlIIIlI("CyAnLRg=", "NMWYa");
        llIlIlIIlII[llIlIlIIlIl[41]] = lIlIIllIlIIIll("Abt2Gs37kWA=", "boBJB");
        llIlIlIIlII[llIlIlIIlIl[42]] = lIlIIllIlIIIlI("DzQkJA==", "KFKTN");
        llIlIlIIlII[llIlIlIIlIl[43]] = lIlIIllIlIIlII("zdgCFM/lOFE=", "ahtGj");
        llIlIlIIlII[llIlIlIIlIl[44]] = lIlIIllIlIIlII("5ovMFRfHLuY=", "ZbfbW");
        llIlIlIIlII[llIlIlIIlIl[45]] = lIlIIllIlIIlII("F7wMEaLhTUI=", "EvIkr");
        llIlIlIIlII[llIlIlIIlIl[46]] = lIlIIllIlIIIlI("KSYCFwgL", "yTcnm");
        llIlIlIIlII[llIlIlIIlIl[47]] = lIlIIllIlIIIlI("CRYHIBIt", "ZwiFw");
    }

    private static String lIlIIllIlIIIlI(String llllllllllllllllIIllIIllllIlIlIl, String llllllllllllllllIIllIIllllIlIlII) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllllIIllIIllllIlIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = llllllllllllllllIIllIIllllIlIlII.toCharArray();
        int llllllllllllllllIIllIIllllIlIIIl = llIlIlIIlIl[0];
        char[] charArray2 = str.toCharArray();
        int llllllllllllllllIIllIIllllIIlIlI = charArray2.length;
        int i = llIlIlIIlIl[0];
        while (lIlIIllIlIIlll(i, llllllllllllllllIIllIIllllIIlIlI)) {
            char llllllllllllllllIIllIIllllIlIllI = charArray2[i];
            sb.append((char) (llllllllllllllllIIllIIllllIlIllI ^ charArray[llllllllllllllllIIllIIllllIlIIIl % charArray.length]));
            "".length();
            llllllllllllllllIIllIIllllIlIIIl++;
            i++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    public int aY() {
        return Vars.getBit(llIlIlIIlIl[3]);
    }

    private static boolean lIlIIllIlIlIll(int i) {
        return i != 0;
    }

    private static boolean lIlIIllIlIlIIl(int i) {
        return i > 0;
    }

    private static String lIlIIllIlIIlII(String llllllllllllllllIIllIIlllllIIlIl, String llllllllllllllllIIllIIlllllIIlII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIllIIlllllIIlII.getBytes(StandardCharsets.UTF_8)), llIlIlIIlIl[32]), "DES");
            Cipher llllllllllllllllIIllIIlllllIIlll = Cipher.getInstance("DES");
            llllllllllllllllIIllIIlllllIIlll.init(llIlIlIIlIl[8], secretKeySpec);
            return new String(llllllllllllllllIIllIIlllllIIlll.doFinal(Base64.getDecoder().decode(llllllllllllllllIIllIIlllllIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIIllIIlllllIIllI) {
            llllllllllllllllIIllIIlllllIIllI.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIIllIllIIII(int i, int i2) {
        return i <= i2;
    }

    private static boolean lIlIIllIllIIIl(int i, int i2) {
        return i > i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    public boolean aq() {
        if (!lIlIIllIlIllII(j(llIlIlIIlIl[21]) ? 1 : 0) || lIlIIllIlIlIll(j(llIlIlIIlIl[22]) ? 1 : 0)) {
            ?? r0 = llIlIlIIlIl[1];
            "".length();
            return "  ".length() < (-" ".length()) ? (false ^ true) & ((true ^ true) ^ true) : r0;
        }
        return llIlIlIIlIl[0];
    }

    public NPC bd() {
        int[] iArr = new int[llIlIlIIlIl[23]];
        iArr[llIlIlIIlIl[0]] = llIlIlIIlIl[24];
        iArr[llIlIlIIlIl[1]] = llIlIlIIlIl[25];
        iArr[llIlIlIIlIl[8]] = llIlIlIIlIl[26];
        iArr[llIlIlIIlIl[27]] = llIlIlIIlIl[28];
        return NPCs.getNearest(iArr);
    }

    private static boolean lIlIIllIlIllIl(Object obj) {
        return obj != null;
    }
}
