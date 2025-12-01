package q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r;

import com.openosrs.client.util.WeaponMap;
import com.openosrs.client.util.WeaponStyle;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.EquipmentInventorySlot;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.ChatMessage;
import net.runelite.api.events.GraphicsObjectCreated;
import net.runelite.api.events.NpcChanged;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
@TaskDesc(name = "Solving obelisk puzzle", register = true, priority = 5, blocking = true)
/* renamed from: q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.bp  reason: invalid package and case insensitive filesystem */
/* loaded from: 581bf999-de0d-4fc5-a3b6-1ebe3d93b748.jar:q/-/t/a/o/u/i/-/o/u/t/e/s/a/r/bp.class */
public class C0043bp extends AbstractC0040bm {
    private /* synthetic */ int ft;
    private final /* synthetic */ List<WorldPoint> fr;
    private static final /* synthetic */ int fq;
    private static /* synthetic */ String[] llIIIIlIIll;
    private /* synthetic */ int fu;
    private final /* synthetic */ Set<WorldPoint> fs;
    private static /* synthetic */ int[] llIIIlIIIlI;
    private static final /* synthetic */ int fp;

    private static boolean lIIlllIlllllII(int i, int i2) {
        return i == i2;
    }

    private static boolean lIIlllIlllllIl(int i, int i2) {
        return i < i2;
    }

    @Subscribe
    public void a(NpcChanged npcChanged) {
        if (!lIIlllIlllllII(npcChanged.getNpc().getId(), llIIIlIIIlI[10])) {
            if (lIIlllIlllllII(npcChanged.getNpc().getId(), llIIIlIIIlI[3])) {
                this.ft = llIIIlIIIlI[1];
                return;
            }
            return;
        }
        NPC npc = npcChanged.getNpc();
        if (lIIlllIllllIlI(this.fr.contains(npc.getWorldLocation()) ? 1 : 0)) {
            this.fr.add(npc.getWorldLocation());
            "".length();
        }
        this.ft += llIIIlIIIlI[2];
        "".length();
        if (" ".length() != " ".length()) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v26, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v30, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v32, types: [boolean] */
    private boolean cc() {
        if (lIIlllIllllIlI(cd() ? 1 : 0)) {
            return llIIIlIIIlI[1];
        }
        Item first = Inventory.getFirst(item -> {
            String[] strArr = new String[llIIIlIIIlI[6]];
            strArr[llIIIlIIIlI[1]] = llIIIIlIIll[llIIIlIIIlI[14]];
            strArr[llIIIlIIIlI[2]] = llIIIIlIIll[llIIIlIIIlI[15]];
            strArr[llIIIlIIIlI[5]] = llIIIIlIIll[llIIIlIIIlI[16]];
            if (lIIlllIllllIlI(item.hasAction(strArr) ? 1 : 0)) {
                return llIIIlIIIlI[1];
            }
            String lowerCase = item.getName().toLowerCase();
            if (lIIlllIllllIlI(lowerCase.contains(llIIIIlIIll[llIIIlIIIlI[17]]) ? 1 : 0) && lIIlllIllllIlI(lowerCase.contains(llIIIIlIIll[llIIIlIIIlI[18]]) ? 1 : 0) && lIIlllIllllIlI(lowerCase.contains(llIIIIlIIll[llIIIlIIIlI[19]]) ? 1 : 0) && lIIlllIllllIlI(lowerCase.contains(llIIIIlIIll[llIIIlIIIlI[20]]) ? 1 : 0) && lIIlllIllllIlI(lowerCase.contains(llIIIIlIIll[llIIIlIIIlI[21]]) ? 1 : 0) && !lIIlllIlllIlll(lowerCase.contains(llIIIIlIIll[llIIIlIIIlI[22]]) ? 1 : 0)) {
                return llIIIlIIIlI[1];
            }
            ?? r0 = llIIIlIIIlI[2];
            "".length();
            return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
        });
        if (lIIlllIlllIllI(first)) {
            return llIIIlIIIlI[1];
        }
        if (!lIIlllIllllIIl(Equipment.fromSlot(EquipmentInventorySlot.SHIELD)) || !lIIlllIlllIlll(Inventory.isFull() ? 1 : 0)) {
            String[] strArr = new String[llIIIlIIIlI[6]];
            strArr[llIIIlIIIlI[1]] = llIIIIlIIll[llIIIlIIIlI[7]];
            strArr[llIIIlIIIlI[2]] = llIIIIlIIll[llIIIlIIIlI[8]];
            strArr[llIIIlIIIlI[5]] = llIIIIlIIll[llIIIlIIIlI[0]];
            first.interact(strArr);
            return llIIIlIIIlI[2];
        }
        Item first2 = Inventory.getFirst(item2 -> {
            String[] strArr2 = new String[llIIIlIIIlI[2]];
            strArr2[llIIIlIIIlI[1]] = llIIIIlIIll[llIIIlIIIlI[13]];
            return item2.hasAction(strArr2);
        });
        if (lIIlllIlllIllI(first2)) {
            first2 = Inventory.getFirst(item3 -> {
                if (lIIlllIlllIlll(item3.getName().contains(llIIIIlIIll[llIIIlIIIlI[12]]) ? 1 : 0)) {
                    String[] strArr2 = new String[llIIIlIIIlI[2]];
                    strArr2[llIIIlIIIlI[1]] = llIIIIlIIll[llIIIlIIIlI[4]];
                    if (lIIlllIlllIlll(item3.hasAction(strArr2) ? 1 : 0)) {
                        ?? r0 = llIIIlIIIlI[2];
                        "".length();
                        return "  ".length() <= " ".length() ? (!true) & ((true ^ true) ^ true) : r0;
                    }
                }
                return llIIIlIIIlI[1];
            });
        }
        if (lIIlllIlllIllI(first2)) {
            return llIIIlIIIlI[1];
        }
        first2.interact(llIIIIlIIll[llIIIlIIIlI[6]]);
        return llIIIlIIIlI[2];
    }

    private static boolean lIIlllIlllIlll(int i) {
        return i != 0;
    }

    private static boolean lIIlllIlllIllI(Object obj) {
        return obj == null;
    }

    @Subscribe
    public void b(GraphicsObjectCreated graphicsObjectCreated) {
        this.fs.add(WorldPoint.fromLocal(this.cu, graphicsObjectCreated.getGraphicsObject().getLocation()));
        "".length();
    }

    static {
        lIIlllIlllIlIl();
        lIIlllIlIlIIII();
        fp = llIIIlIIIlI[3];
        fq = llIIIlIIIlI[10];
    }

    private static String lIIlllIlIIlllI(String llllllllllllllllIlIIIlIllIIIlllI, String llllllllllllllllIlIIIlIllIIIllIl) {
        try {
            SecretKeySpec llllllllllllllllIlIIIlIllIIlIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIlIIIlIllIIIllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllIlIIIlIllIIlIIII = Cipher.getInstance("Blowfish");
            llllllllllllllllIlIIIlIllIIlIIII.init(llIIIlIIIlI[5], llllllllllllllllIlIIIlIllIIlIIIl);
            return new String(llllllllllllllllIlIIIlIllIIlIIII.doFinal(Base64.getDecoder().decode(llllllllllllllllIlIIIlIllIIIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIlIIIlIllIIIllll) {
            llllllllllllllllIlIIIlIllIIIllll.printStackTrace();
            return null;
        }
    }

    public List<WorldPoint> ce() {
        return this.fr;
    }

    private static void lIIlllIlllIlIl() {
        llIIIlIIIlI = new int[24];
        llIIIlIIIlI[0] = (143 ^ 130) ^ (64 ^ 75);
        llIIIlIIIlI[1] = ((119 ^ 23) ^ (67 ^ 20)) & (((((176 + 240) - 218) + 49) ^ (((184 + 139) - 162) + 31)) ^ (-" ".length()));
        llIIIlIIIlI[2] = " ".length();
        llIIIlIIIlI[3] = (-((-433) & 21501)) & (-2) & 32767;
        llIIIlIIIlI[4] = 6 ^ 12;
        llIIIlIIIlI[5] = "  ".length();
        llIIIlIIIlI[6] = "   ".length();
        llIIIlIIIlI[7] = (151 ^ 175) ^ (69 ^ 121);
        llIIIlIIIlI[8] = (((181 + 56) - 190) + 149) ^ (((156 + 61) - 163) + 139);
        llIIIlIIIlI[9] = 19 ^ 20;
        llIIIlIIIlI[10] = (-16389) & 28087;
        llIIIlIIIlI[11] = (198 ^ 135) ^ (81 ^ 24);
        llIIIlIIIlI[12] = 137 ^ 128;
        llIIIlIIIlI[13] = 62 ^ 53;
        llIIIlIIIlI[14] = 9 ^ 5;
        llIIIlIIIlI[15] = (27 ^ 120) ^ (79 ^ 33);
        llIIIlIIIlI[16] = 191 ^ 177;
        llIIIlIIIlI[17] = (((0 + 73) - (-57)) + 9) ^ (((99 + 62) - 154) + 125);
        llIIIlIIIlI[18] = (17 ^ 31) ^ (97 ^ 127);
        llIIIlIIIlI[19] = (58 ^ 65) ^ (243 ^ 153);
        llIIIlIIIlI[20] = (34 ^ 13) ^ (101 ^ 88);
        llIIIlIIIlI[21] = (((48 + 91) - 128) + 202) ^ (((177 + 50) - 62) + 33);
        llIIIlIIIlI[22] = (240 ^ 181) ^ (108 ^ 61);
        llIIIlIIIlI[23] = 113 ^ 100;
    }

    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0040bm
    public int bZ() {
        String[] strArr = new String[llIIIlIIIlI[2]];
        strArr[llIIIlIIIlI[1]] = llIIIIlIIll[llIIIlIIIlI[5]];
        NPC nearest = NPCs.getNearest(strArr);
        return lIIlllIllllIIl(nearest) ? nearest.getWorldLocation().getX() : llIIIlIIIlI[1];
    }

    private static void lIIlllIlIlIIII() {
        llIIIIlIIll = new String[llIIIlIIIlI[23]];
        llIIIIlIIll[llIIIlIIIlI[1]] = lIIlllIlIIllIl("hGBPn2oJx0c=", "WgMOa");
        llIIIIlIIll[llIIIlIIIlI[2]] = lIIlllIlIIlllI("uvXPMU6W4vA=", "dNFKG");
        llIIIIlIIll[llIIIlIIIlI[5]] = lIIlllIlIIllIl("QBWZnu3exP0=", "rGDjI");
        llIIIIlIIll[llIIIlIIIlI[6]] = lIIlllIlIIlllI("TJfOoV1cMgI=", "WEnbo");
        llIIIIlIIll[llIIIlIIIlI[7]] = lIIlllIlIIllIl("rT0IUrxd3o8=", "GitCz");
        llIIIIlIIll[llIIIlIIIlI[8]] = lIIlllIlIIllIl("i6YbtQRI2mc=", "iKeKd");
        llIIIIlIIll[llIIIlIIIlI[0]] = lIIlllIlIIlllI("q/zJwv8uHKI=", "SJgOk");
        llIIIIlIIll[llIIIlIIIlI[9]] = lIIlllIlIIllll("BCI3PiYA", "wJVZI");
        llIIIIlIIll[llIIIlIIIlI[11]] = lIIlllIlIIlllI("PUogPx3ObX4trUGQLADo8SxogJX+Mb48z+dstPpfN5aHt9CacL3RvA8CX3Gy+Yeu", "CESov");
        llIIIIlIIll[llIIIlIIIlI[12]] = lIIlllIlIIllIl("t/golRo010I=", "hbObq");
        llIIIIlIIll[llIIIlIIIlI[4]] = lIIlllIlIIllIl("9MEWhUzGa2U=", "ITkVS");
        llIIIIlIIll[llIIIlIIIlI[13]] = lIIlllIlIIlllI("OKavc/v6VPk=", "eEArL");
        llIIIIlIIll[llIIIlIIIlI[14]] = lIIlllIlIIlllI("CzRu5eW38J8=", "tUgFx");
        llIIIIlIIll[llIIIlIIIlI[15]] = lIIlllIlIIllIl("xEygc1hDPTU=", "rIQff");
        llIIIIlIIll[llIIIlIIIlI[16]] = lIIlllIlIIllll("BQkYBA==", "Rlyva");
        llIIIIlIIll[llIIIlIIIlI[17]] = lIIlllIlIIllll("KSYx", "KIFUS");
        llIIIIlIIll[llIIIlIIIlI[18]] = lIIlllIlIIlllI("dKnvQxtdOVQ=", "CuTDT");
        llIIIIlIIll[llIIIlIIIlI[19]] = lIIlllIlIIllll("OA4MHjE=", "LatwR");
        llIIIIlIIll[llIIIlIIIlI[20]] = lIIlllIlIIllll("NTUsKAkvMw==", "AGELl");
        llIIIIlIIll[llIIIlIIIlI[21]] = lIIlllIlIIllIl("2Qfd4DADn5v+izNkDSBGIA==", "JsnTp");
        llIIIIlIIll[llIIIlIIIlI[22]] = lIIlllIlIIllll("OyAKNh0wPAA=", "YLeAm");
    }

    private static boolean lIIlllIllllIIl(Object obj) {
        return obj != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v19, types: [boolean] */
    private boolean cd() {
        Item fromSlot = Equipment.fromSlot(EquipmentInventorySlot.WEAPON);
        if (!lIIlllIlllIllI(fromSlot) && !lIIlllIlllIlll(fromSlot.getName().toLowerCase().contains(llIIIIlIIll[llIIIlIIIlI[9]]) ? 1 : 0)) {
            if (lIIlllIllllIll(WeaponMap.StyleMap.getOrDefault(Integer.valueOf(fromSlot.getId()), WeaponStyle.MELEE), WeaponStyle.MELEE)) {
                ?? r0 = llIIIlIIIlI[2];
                "".length();
                return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return llIIIlIIIlI[1];
        }
        return llIIIlIIIlI[2];
    }

    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0040bm, q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0015ao
    public boolean bk() {
        int[] iArr = new int[llIIIlIIIlI[2]];
        iArr[llIIIlIIIlI[1]] = llIIIlIIIlI[3];
        return NPCs.getAll(iArr).stream().anyMatch((v0) -> {
            return Reachable.isInteractable(v0);
        });
    }

    private static boolean lIIlllIllllIlI(int i) {
        return i == 0;
    }

    private static String lIIlllIlIIllll(String llllllllllllllllIlIIIlIllIlIIIll, String llllllllllllllllIlIIIlIllIlIIIlI) {
        String llllllllllllllllIlIIIlIllIlIIIll2 = new String(Base64.getDecoder().decode(llllllllllllllllIlIIIlIllIlIIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllIlIIIlIllIlIIIIl = new StringBuilder();
        char[] charArray = llllllllllllllllIlIIIlIllIlIIIlI.toCharArray();
        int llllllllllllllllIlIIIlIllIIllIlI = llIIIlIIIlI[1];
        char[] charArray2 = llllllllllllllllIlIIIlIllIlIIIll2.toCharArray();
        int length = charArray2.length;
        int i = llIIIlIIIlI[1];
        while (lIIlllIlllllIl(i, length)) {
            char llllllllllllllllIlIIIlIllIIlIllI = charArray2[i];
            llllllllllllllllIlIIIlIllIlIIIIl.append((char) (llllllllllllllllIlIIIlIllIIlIllI ^ charArray[llllllllllllllllIlIIIlIllIIllIlI % charArray.length]));
            "".length();
            llllllllllllllllIlIIIlIllIIllIlI++;
            i++;
            "".length();
            if ((((0 ^ 78) ^ (20 ^ 18)) & (((((222 + 100) - 211) + 144) ^ (((125 + 28) - (-22)) + 8)) ^ (-" ".length()))) != 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllllIlIIIlIllIlIIIIl);
    }

    private static boolean lIIlllIllllIII(int i, int i2) {
        return i > i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0040bm, q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0015ao
    public boolean bj() {
        int[] iArr = new int[llIIIlIIIlI[2]];
        iArr[llIIIlIIIlI[1]] = llIIIlIIIlI[3];
        if (lIIlllIlllIllI(NPCs.getNearest(iArr))) {
            ?? r0 = llIIIlIIIlI[2];
            "".length();
            return (true ^ true) != (true ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return llIIIlIIIlI[1];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v25, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v38, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v56, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v58, types: [boolean] */
    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0040bm
    public boolean bY() {
        if (lIIlllIlllIlll(cc() ? 1 : 0)) {
            return llIIIlIIIlI[2];
        }
        WorldPoint worldLocation = Players.getLocal().getWorldLocation();
        if (lIIlllIlllIlll(this.fs.contains(worldLocation) ? 1 : 0)) {
            Optional min = worldLocation.createWorldArea(llIIIlIIIlI[4]).toWorldPointList().stream().filter(worldPoint -> {
                if (lIIlllIllllIlI(this.fs.contains(worldPoint) ? 1 : 0)) {
                    ?? r0 = llIIIlIIIlI[2];
                    "".length();
                    return (-"  ".length()) > 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
                return llIIIlIIIlI[1];
            }).filter(Reachable::isWalkable).min(Comparator.comparingInt(worldPoint2 -> {
                return worldPoint2.distanceTo(worldLocation);
            }));
            if (lIIlllIlllIlll(min.isPresent() ? 1 : 0)) {
                Movement.setDestination((WorldPoint) min.get());
                sleep(llIIIlIIIlI[2]);
                this.fs.clear();
                return llIIIlIIIlI[2];
            }
        }
        if (lIIlllIllllIII(this.fr.size(), this.ft)) {
            WorldPoint worldPoint3 = this.fr.get(this.ft);
            NPC nearest = NPCs.getNearest(npc -> {
                if (lIIlllIlllllII(npc.getId(), llIIIlIIIlI[3]) && lIIlllIlllIlll(npc.getWorldLocation().equals(worldPoint3) ? 1 : 0)) {
                    ?? r0 = llIIIlIIIlI[2];
                    "".length();
                    return (-" ".length()) > (-" ".length()) ? ((19 ^ 7) ^ (141 ^ 131)) & (((211 ^ 177) ^ (92 ^ 36)) ^ (-" ".length())) : r0;
                }
                return llIIIlIIIlI[1];
            });
            if (lIIlllIllllIIl(nearest)) {
                nearest.interact(llIIIIlIIll[llIIIlIIIlI[1]]);
                sleep(llIIIlIIIlI[2]);
                return llIIIlIIIlI[2];
            }
        }
        List all = NPCs.getAll(npc2 -> {
            if (lIIlllIlllllII(npc2.getId(), llIIIlIIIlI[3])) {
                ?? r0 = llIIIlIIIlI[2];
                "".length();
                return "  ".length() == 0 ? "   ".length() & ("   ".length() ^ (-1)) : r0;
            }
            return llIIIlIIIlI[1];
        });
        int i = this.fu;
        this.fu = i + llIIIlIIIlI[2];
        NPC npc3 = (NPC) all.get(i % all.size());
        if (lIIlllIllllIIl(npc3)) {
            npc3.interact(llIIIIlIIll[llIIIlIIIlI[2]]);
            sleep(llIIIlIIIlI[2]);
            return llIIIlIIIlI[2];
        }
        return llIIIlIIIlI[1];
    }

    private static String lIIlllIlIIllIl(String llllllllllllllllIlIIIlIllIIIIIIl, String llllllllllllllllIlIIIlIllIIIIIII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIlIIIlIllIIIIIII.getBytes(StandardCharsets.UTF_8)), llIIIlIIIlI[11]), "DES");
            Cipher llllllllllllllllIlIIIlIllIIIIIll = Cipher.getInstance("DES");
            llllllllllllllllIlIIIlIllIIIIIll.init(llIIIlIIIlI[5], secretKeySpec);
            return new String(llllllllllllllllIlIIIlIllIIIIIll.doFinal(Base64.getDecoder().decode(llllllllllllllllIlIIIlIllIIIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIlIIIlIlIlllllIl) {
            llllllllllllllllIlIIIlIlIlllllIl.printStackTrace();
            return null;
        }
    }

    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0015ao
    @Subscribe
    public void a(ChatMessage chatMessage) {
        if (lIIlllIlllIlll(chatMessage.getMessage().startsWith(llIIIIlIIll[llIIIlIIIlI[11]]) ? 1 : 0)) {
            this.ft = llIIIlIIIlI[1];
            this.fr.clear();
        }
    }

    private static boolean lIIlllIllllIll(Object obj, Object obj2) {
        return obj == obj2;
    }

    public int cf() {
        return this.ft;
    }

    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0040bm, q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0015ao
    public void r() {
        this.ft = llIIIlIIIlI[1];
        this.fr.clear();
        this.fs.clear();
        this.fu = llIIIlIIIlI[1];
    }

    @Inject
    protected C0043bp(Client client, C0077z c0077z, TOAConfig tOAConfig, C0067p c0067p) {
        super(client, c0077z, tOAConfig, c0067p);
        this.fr = new ArrayList(llIIIlIIIlI[0]);
        this.fs = new HashSet();
        this.ft = llIIIlIIIlI[1];
        this.fu = llIIIlIIIlI[1];
    }
}
