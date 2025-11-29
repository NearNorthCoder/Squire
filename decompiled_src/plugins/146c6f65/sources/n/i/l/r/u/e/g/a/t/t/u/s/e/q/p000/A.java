package n.i.l.r.u.e.g.a.t.t.u.s.e.q.p000;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Actor;
import net.runelite.api.EquipmentInventorySlot;
import net.runelite.api.HeadIcon;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.NpcChanged;
import net.runelite.api.events.ProjectileSpawned;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.coords.ScenePoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
@TaskDesc(name = "Swapping weapon", priority = 4, register = true)
/* renamed from: n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.A  reason: invalid package */
/* loaded from: 146c6f65-5ac8-4fe6-9d9c-0b402720538d.jar:n/i/l/r/u/e/g/a/t/t/u/s/e/q/-/A.class */
public class A extends AbstractC0013n {
    private final /* synthetic */ C0020u bM;
    private /* synthetic */ HeadIcon bN;
    public static /* synthetic */ int bK;
    private final /* synthetic */ C0001b bL;
    private /* synthetic */ int bO;
    private static /* synthetic */ String[] llIIllIlIIII;
    private static /* synthetic */ int[] llIIllIlIIIl;

    private static String llllllIlllIIll(String lllllllllllllllIlIIlIlIlIIIlIIII, String lllllllllllllllIlIIlIlIlIIIIllll) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIlIIlIlIlIIIlIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlIIlIlIlIIIIlllI = new StringBuilder();
        char[] lllllllllllllllIlIIlIlIlIIIIllIl = lllllllllllllllIlIIlIlIlIIIIllll.toCharArray();
        int lllllllllllllllIlIIlIlIlIIIIllII = llIIllIlIIIl[1];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = llIIllIlIIIl[1];
        while (llllllIlllllIl(i, length)) {
            lllllllllllllllIlIIlIlIlIIIIlllI.append((char) (charArray[i] ^ lllllllllllllllIlIIlIlIlIIIIllIl[lllllllllllllllIlIIlIlIlIIIIllII % lllllllllllllllIlIIlIlIlIIIIllIl.length]));
            "".length();
            lllllllllllllllIlIIlIlIlIIIIllII++;
            i++;
            "".length();
            if ("   ".length() == (((46 ^ 111) ^ (73 ^ 31)) & (((68 ^ 7) ^ (118 ^ 34)) ^ (-" ".length())))) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIlIIlIlIlIIIIlllI);
    }

    private static boolean llllllIlllllIl(int i, int i2) {
        return i < i2;
    }

    static {
        llllllIlllIllI();
        llllllIlllIlIl();
        bK = llIIllIlIIIl[1];
    }

    private static boolean llllllIllllIlI(int i) {
        return i == 0;
    }

    private static String llllllIlllIIlI(String lllllllllllllllIlIIlIlIlIIlIIIII, String lllllllllllllllIlIIlIlIlIIIlllll) {
        try {
            SecretKeySpec lllllllllllllllIlIIlIlIlIIlIIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIlIlIlIIIlllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIIlIlIlIIlIIIlI = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIIlIlIlIIlIIIlI.init(llIIllIlIIIl[2], lllllllllllllllIlIIlIlIlIIlIIIll);
            return new String(lllllllllllllllIlIIlIlIlIIlIIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIlIlIlIIlIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIIlIlIlIIlIIIIl) {
            lllllllllllllllIlIIlIlIlIIlIIIIl.printStackTrace();
            return null;
        }
    }

    @Subscribe
    public void a(ProjectileSpawned projectileSpawned) {
        Actor interacting = projectileSpawned.getProjectile().getInteracting();
        if (llllllIlllIlll(interacting instanceof NPC ? 1 : 0) && llllllIllllIIl(interacting.getName()) && llllllIlllIlll(C0004e.aw.contains(interacting.getName()) ? 1 : 0) && llllllIlllIlll(C0004e.aD.contains(Integer.valueOf(projectileSpawned.getProjectile().getId())) ? 1 : 0)) {
            this.bO = this.bL.z();
            bK += llIIllIlIIIl[0];
        }
    }

    @Override // n.i.l.r.u.e.g.a.t.t.u.s.e.q.p000.AbstractC0013n
    public boolean be() {
        return llllllIlllIlll(this.ba.h().makeT3Offhand() ? 1 : 0) ? bz() : bA();
    }

    private static boolean llllllIllllIII(Object obj, Object obj2) {
        return obj == obj2;
    }

    @Subscribe
    public void a(NpcChanged npcChanged) {
        NPC npc = npcChanged.getNpc();
        if (llllllIllllIIl(npc) && llllllIllllIIl(npc.getName()) && llllllIlllIlll(C0004e.aw.contains(npc.getName()) ? 1 : 0)) {
            short[] rsOverheadIcons = npcChanged.getNpc().getComposition().getRsOverheadIcons();
            if (llllllIlllllII(rsOverheadIcons)) {
                return;
            }
            this.bN = HeadIcon.values()[rsOverheadIcons[llIIllIlIIIl[1]]];
            bK = llIIllIlIIIl[1];
        }
    }

    private static String llllllIlllIlII(String lllllllllllllllIlIIlIlIlIIlIllIl, String lllllllllllllllIlIIlIlIlIIlIllII) {
        try {
            SecretKeySpec lllllllllllllllIlIIlIlIlIIllIIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIlIlIlIIlIllII.getBytes(StandardCharsets.UTF_8)), llIIllIlIIIl[8]), "DES");
            Cipher lllllllllllllllIlIIlIlIlIIlIllll = Cipher.getInstance("DES");
            lllllllllllllllIlIIlIlIlIIlIllll.init(llIIllIlIIIl[2], lllllllllllllllIlIIlIlIlIIllIIII);
            return new String(lllllllllllllllIlIIlIlIlIIlIllll.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIlIlIlIIlIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIIlIlIlIIlIlllI) {
            lllllllllllllllIlIIlIlIlIIlIlllI.printStackTrace();
            return null;
        }
    }

    private static boolean llllllIlllIlll(int i) {
        return i != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v30, types: [boolean] */
    private boolean bz() {
        if (llllllIllllIII(this.ba.X().aD(), HeadIcon.MAGIC)) {
            Item first = Inventory.getFirst(item -> {
                String name = item.getName();
                if (llllllIllllIIl(name) && llllllIlllIlll(name.contains(llIIllIlIIII[llIIllIlIIIl[10]]) ? 1 : 0)) {
                    ?? r0 = llIIllIlIIIl[0];
                    "".length();
                    return "   ".length() < "  ".length() ? ((98 ^ 45) ^ (187 ^ 182)) & (((((4 + 45) - 26) + 108) ^ (((27 + 132) - 121) + 155)) ^ (-" ".length())) : r0;
                }
                return llIIllIlIIIl[1];
            });
            if (llllllIllllIIl(first)) {
                first.interact(llIIllIlIIII[llIIllIlIIIl[1]]);
                return llIIllIlIIIl[0];
            }
            "".length();
            if (((194 ^ 166) ^ (76 ^ 44)) == (((((135 + 112) - 124) + 88) ^ (((133 + 123) - 197) + 140)) & (((((42 + 190) - 201) + 183) ^ (((111 + 55) - 147) + 175)) ^ (-" ".length())))) {
                return ((171 ^ 197) ^ (220 ^ 147)) & (((242 ^ 163) ^ (117 ^ 5)) ^ (-" ".length()));
            }
        } else {
            Item first2 = Inventory.getFirst(item2 -> {
                String name = item2.getName();
                if (llllllIllllIIl(name) && llllllIlllIlll(name.contains(llIIllIlIIII[llIIllIlIIIl[9]]) ? 1 : 0)) {
                    ?? r0 = llIIllIlIIIl[0];
                    "".length();
                    return (-"  ".length()) >= 0 ? ((((172 + 34) - 167) + 135) ^ (((17 + 10) - (-29)) + 95)) & (((18 ^ 114) ^ (98 ^ 59)) ^ (-" ".length())) : r0;
                }
                return llIIllIlIIIl[1];
            });
            if (llllllIllllIIl(first2)) {
                first2.interact(llIIllIlIIII[llIIllIlIIIl[0]]);
                return llIIllIlIIIl[0];
            }
        }
        return llIIllIlIIIl[1];
    }

    private static boolean llllllIllllIll(int i, int i2) {
        return i == i2;
    }

    private static boolean llllllIllllIIl(Object obj) {
        return obj != null;
    }

    private static boolean llllllIlllllII(Object obj) {
        return obj == null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v30, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v56, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v58, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v72, types: [boolean] */
    private boolean bA() {
        HeadIcon aD = this.ba.X().aD();
        if (llllllIllllIlI(bK)) {
            Item first = Inventory.getFirst(item -> {
                String name = item.getName();
                if (llllllIllllIIl(name) && llllllIlllIlll(name.contains(llIIllIlIIII[llIIllIlIIIl[8]]) ? 1 : 0)) {
                    ?? r0 = llIIllIlIIIl[0];
                    "".length();
                    return "   ".length() > "   ".length() ? "   ".length() & ("   ".length() ^ (-1)) : r0;
                }
                return llIIllIlIIIl[1];
            });
            if (llllllIllllIIl(first)) {
                first.interact(llIIllIlIIII[llIIllIlIIIl[2]]);
                return llIIllIlIIIl[0];
            }
            "".length();
            if (0 != 0) {
                return (" ".length() ^ (47 ^ 33)) & (((247 ^ 199) ^ (166 ^ 153)) ^ (-" ".length()));
            }
        } else if (llllllIllllIll(bK, llIIllIlIIIl[3]) && llllllIllllIlI(HeadIcon.RANGED.equals(aD) ? 1 : 0)) {
            Item first2 = Inventory.getFirst(item2 -> {
                String name = item2.getName();
                if (llllllIllllIIl(name) && llllllIlllIlll(name.contains(llIIllIlIIII[llIIllIlIIIl[7]]) ? 1 : 0)) {
                    ?? r0 = llIIllIlIIIl[0];
                    "".length();
                    return (((122 ^ 107) ^ (176 ^ 194)) & (((160 ^ 144) ^ (28 ^ 79)) ^ (-" ".length()))) != 0 ? ((54 ^ 86) ^ (255 ^ 181)) & (((52 ^ 21) ^ (147 ^ 152)) ^ (-" ".length())) & (((((210 ^ 131) ^ (102 ^ 8)) & ((" ".length() ^ (147 ^ 173)) ^ (-" ".length()))) & ((((121 ^ 127) ^ (228 ^ 168)) & (((((119 + 179) - 147) + 41) ^ (((11 + 44) - (-13)) + 70)) ^ (-" ".length()))) ^ (-" ".length()))) ^ (-" ".length())) : r0;
                }
                return llIIllIlIIIl[1];
            });
            if (llllllIllllIIl(first2)) {
                first2.interact(llIIllIlIIII[llIIllIlIIIl[4]]);
                return llIIllIlIIIl[0];
            }
            "".length();
            if ("   ".length() < 0) {
                return ((63 ^ 46) ^ (20 ^ 29)) & (((((53 + 198) - 132) + 104) ^ (((1 + 22) - (-91)) + 85)) ^ (-" ".length()));
            }
        } else if (llllllIllllIll(bK, llIIllIlIIIl[3])) {
            Item fromSlot = Equipment.fromSlot(EquipmentInventorySlot.WEAPON);
            WorldPoint worldLocation = Players.getLocal().getWorldLocation();
            if (llllllIllllIIl(fromSlot)) {
                if (llllllIllllIlI(Inventory.getFreeSlots())) {
                    Item first3 = Inventory.getFirst(item3 -> {
                        String[] strArr = new String[llIIllIlIIIl[0]];
                        strArr[llIIllIlIIIl[1]] = llIIllIlIIII[llIIllIlIIIl[6]];
                        return item3.hasAction(strArr);
                    });
                    if (llllllIllllIIl(first3)) {
                        first3.interact(llIIllIlIIII[llIIllIlIIIl[5]]);
                    }
                }
                ScenePoint fromWorld = ScenePoint.fromWorld(worldLocation);
                List<WorldPoint> c = this.bM.c(worldLocation, this.ba.X().aI().getWorldLocation());
                C0020u c0020u = this.bM;
                Stream<WorldPoint> stream = c.stream();
                C0020u c0020u2 = this.bM;
                Objects.requireNonNull(c0020u2);
                "".length();
                if (llllllIllllIlI(c0020u.d((List) stream.filter(this::n).collect(Collectors.toList())) ? 1 : 0)) {
                    Movement.setDestination(fromWorld.getX(), fromWorld.getY());
                    Time.sleepTick();
                    "".length();
                }
                fromSlot.interact(llIIllIlIIII[llIIllIlIIIl[3]]);
                return llIIllIlIIIl[0];
            }
        }
        return llIIllIlIIIl[1];
    }

    private static void llllllIlllIlIl() {
        llIIllIlIIII = new String[llIIllIlIIIl[11]];
        llIIllIlIIII[llIIllIlIIIl[1]] = llllllIlllIIlI("YO/e0SIoHsE=", "FjBbi");
        llIIllIlIIII[llIIllIlIIIl[0]] = llllllIlllIIll("AyAiOxE=", "TIGWu");
        llIIllIlIIII[llIIllIlIIIl[2]] = llllllIlllIlII("ruu8+4kNytQ=", "xDtpS");
        llIIllIlIIII[llIIllIlIIIl[4]] = llllllIlllIIll("GwQmGyo=", "LmCwN");
        llIIllIlIIII[llIIllIlIIIl[5]] = llllllIlllIIlI("HakYr0RTkqM=", "kvHzo");
        llIIllIlIIII[llIIllIlIIIl[3]] = llllllIlllIIlI("NIAel6yswYE=", "LQbIz");
        llIIllIlIIII[llIIllIlIIIl[6]] = llllllIlllIIlI("BSghh62b8wM=", "OFPra");
        llIIllIlIIII[llIIllIlIIIl[7]] = llllllIlllIIlI("ZcnRjovAgMk=", "KxEqz");
        llIIllIlIIII[llIIllIlIIIl[8]] = llllllIlllIlII("ZWgxZLxGNcs=", "aWiUc");
        llIIllIlIIII[llIIllIlIIIl[9]] = llllllIlllIIll("JxooHyQ=", "TnIyB");
        llIIllIlIIII[llIIllIlIIIl[10]] = llllllIlllIIlI("PEgxIyjdbhI=", "PpsyB");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @Inject
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public A(C0002c c0002c, C0001b c0001b, C0020u c0020u) {
        super(c0002c, r2);
        EnumC0003d[] enumC0003dArr = new EnumC0003d[llIIllIlIIIl[0]];
        enumC0003dArr[llIIllIlIIIl[1]] = EnumC0003d.BOSS_FIGHT;
        this.bN = null;
        this.bL = c0001b;
        this.bM = c0020u;
    }

    private static void llllllIlllIllI() {
        llIIllIlIIIl = new int[12];
        llIIllIlIIIl[0] = " ".length();
        llIIllIlIIIl[1] = ((89 ^ 96) ^ (159 ^ 170)) & (((((73 + 65) - 121) + 150) ^ (((170 + 75) - 238) + 164)) ^ (-" ".length()));
        llIIllIlIIIl[2] = "  ".length();
        llIIllIlIIIl[3] = (((9 + 36) - (-78)) + 64) ^ (((40 + 15) - (-100)) + 35);
        llIIllIlIIIl[4] = "   ".length();
        llIIllIlIIIl[5] = 116 ^ 112;
        llIIllIlIIIl[6] = (195 ^ 191) ^ (70 ^ 60);
        llIIllIlIIIl[7] = 153 ^ 158;
        llIIllIlIIIl[8] = (73 ^ 16) ^ (52 ^ 101);
        llIIllIlIIIl[9] = 130 ^ 139;
        llIIllIlIIIl[10] = (201 ^ 197) ^ (154 ^ 156);
        llIIllIlIIIl[11] = (((69 + 112) - 91) + 95) ^ (((134 + 8) - 8) + 44);
    }
}
