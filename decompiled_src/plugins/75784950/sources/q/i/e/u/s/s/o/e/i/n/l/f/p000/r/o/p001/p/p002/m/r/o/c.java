package q.i.e.u.s.s.o.e.i.n.l.f.p000.r.o.p001.p.p002.m.r.o;

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
import java.util.List;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.EquipmentInventorySlot;
import net.runelite.api.NPC;
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
import net.unethicalite.client.Static;
@TaskDesc(name = "Blue moon")
/* renamed from: q.i.e.u.s.s.o.e.i.n.l.f.-.r.o.-.p.-.m.r.o.c  reason: invalid package */
/* loaded from: 75784950-1a80-40ed-8300-cd0507c03978.jar:q/i/e/u/s/s/o/e/i/n/l/f/-/r/o/-/p/-/m/r/o/c.class */
public class c extends Task {
    private final /* synthetic */ SquireMoonsOfPerilConfig z;
    private /* synthetic */ int A;
    private static /* synthetic */ int[] lIIIIIIIllIIl;
    private static /* synthetic */ String[] lIIIIIIIlIllI;

    /* renamed from: q  reason: collision with root package name */
    /* synthetic */ WorldArea f1q = new WorldArea(lIIIIIIIllIIl[0], lIIIIIIIllIIl[1], lIIIIIIIllIIl[2], lIIIIIIIllIIl[3], lIIIIIIIllIIl[4]);
    /* synthetic */ WorldArea B = new WorldArea(new WorldPoint(lIIIIIIIllIIl[5], lIIIIIIIllIIl[6], lIIIIIIIllIIl[4]), new WorldPoint(lIIIIIIIllIIl[7], lIIIIIIIllIIl[8], lIIIIIIIllIIl[4]));
    /* synthetic */ WorldArea C = new WorldArea(new WorldPoint(lIIIIIIIllIIl[9], lIIIIIIIllIIl[10], lIIIIIIIllIIl[4]), new WorldPoint(lIIIIIIIllIIl[11], lIIIIIIIllIIl[12], lIIIIIIIllIIl[4]));
    /* synthetic */ WorldArea D = new WorldArea(new WorldPoint(lIIIIIIIllIIl[9], lIIIIIIIllIIl[13], lIIIIIIIllIIl[4]), new WorldPoint(lIIIIIIIllIIl[11], lIIIIIIIllIIl[14], lIIIIIIIllIIl[4]));
    /* synthetic */ WorldArea E = new WorldArea(new WorldPoint(lIIIIIIIllIIl[5], lIIIIIIIllIIl[15], lIIIIIIIllIIl[4]), new WorldPoint(lIIIIIIIllIIl[7], lIIIIIIIllIIl[16], lIIIIIIIllIIl[4]));
    /* synthetic */ WorldArea F = new WorldArea(new WorldPoint(lIIIIIIIllIIl[17], lIIIIIIIllIIl[15], lIIIIIIIllIIl[4]), new WorldPoint(lIIIIIIIllIIl[18], lIIIIIIIllIIl[16], lIIIIIIIllIIl[4]));
    /* synthetic */ WorldArea G = new WorldArea(new WorldPoint(lIIIIIIIllIIl[19], lIIIIIIIllIIl[13], lIIIIIIIllIIl[4]), new WorldPoint(lIIIIIIIllIIl[20], lIIIIIIIllIIl[14], lIIIIIIIllIIl[4]));
    /* synthetic */ WorldArea H = new WorldArea(new WorldPoint(lIIIIIIIllIIl[19], lIIIIIIIllIIl[10], lIIIIIIIllIIl[4]), new WorldPoint(lIIIIIIIllIIl[20], lIIIIIIIllIIl[12], lIIIIIIIllIIl[4]));
    /* synthetic */ WorldArea I = new WorldArea(new WorldPoint(lIIIIIIIllIIl[17], lIIIIIIIllIIl[6], lIIIIIIIllIIl[4]), new WorldPoint(lIIIIIIIllIIl[18], lIIIIIIIllIIl[8], lIIIIIIIllIIl[4]));

    private static String lIIlIllIllIIIIl(String lllllllllllllllIIIlllllIIlllIIll, String lllllllllllllllIIIlllllIIlllIIlI) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIIIlllllIIlllIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] lllllllllllllllIIIlllllIIlllIIII = lllllllllllllllIIIlllllIIlllIIlI.toCharArray();
        int lllllllllllllllIIIlllllIIllIllll = lIIIIIIIllIIl[4];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = lIIIIIIIllIIl[4];
        while (lIIlIllIlllIlII(i, length)) {
            sb.append((char) (charArray[i] ^ lllllllllllllllIIIlllllIIlllIIII[lllllllllllllllIIIlllllIIllIllll % lllllllllllllllIIIlllllIIlllIIII.length]));
            "".length();
            lllllllllllllllIIIlllllIIllIllll++;
            i++;
            "".length();
            if ((-"  ".length()) > 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static void lIIlIllIllIIIlI() {
        lIIIIIIIlIllI = new String[lIIIIIIIllIIl[52]];
        lIIIIIIIlIllI[lIIIIIIIllIIl[4]] = lIIlIllIlIlIlll("VdcHEgdpXou7YCNAdMw37w==", "YjLIB");
        lIIIIIIIlIllI[lIIIIIIIllIIl[21]] = lIIlIllIlIllIII("lwyoeJbrIEA+7hq8t9LMcQ==", "iSfsZ");
        lIIIIIIIlIllI[lIIIIIIIllIIl[22]] = lIIlIllIlIllIII("PY1ciexFCgs=", "LWbZM");
        lIIIIIIIlIllI[lIIIIIIIllIIl[23]] = lIIlIllIlIlIlll("kUkYxz8XOsZGBqk7MX2AFg==", "PgJTS");
        lIIIIIIIlIllI[lIIIIIIIllIIl[24]] = lIIlIllIlIlIlll("UmylhgsragN6OtygNN95m3ptTWYDfy8R", "tCOyb");
        lIIIIIIIlIllI[lIIIIIIIllIIl[25]] = lIIlIllIlIlIlll("DFgD3E6A9JfqkaWJwu7dzw==", "eGKTW");
        lIIIIIIIlIllI[lIIIIIIIllIIl[26]] = lIIlIllIllIIIIl("OQI1KEEAAmM+ABIIYz4RGxk=", "tmCMa");
        lIIIIIIIlIllI[lIIIIIIIllIIl[28]] = lIIlIllIllIIIIl("GyQVCjsxOQ8M", "ZPakX");
        lIIIIIIIlIllI[lIIIIIIIllIIl[29]] = lIIlIllIlIllIII("fZ3GkpnJiek=", "ileUY");
        lIIIIIIIlIllI[lIIIIIIIllIIl[30]] = lIIlIllIlIlIlll("zGmKyIUqe5s=", "qKAOj");
        lIIIIIIIlIllI[lIIIIIIIllIIl[31]] = lIIlIllIlIllIII("nvxiO+59BptlSHFTps75DxwBZ04Qyq2z", "AvgTa");
        lIIIIIIIlIllI[lIIIIIIIllIIl[32]] = lIIlIllIllIIIIl("Iw0NPzo=", "odjWN");
        lIIIIIIIlIllI[lIIIIIIIllIIl[35]] = lIIlIllIllIIIIl("GQYtblAyADAsF3UbNmIdPAs9LhU=", "UoYBp");
        lIIIIIIIlIllI[lIIIIIIIllIIl[38]] = lIIlIllIlIlIlll("RJuyh10RVTOxF+yqiuSEUw==", "aiylA");
        lIIIIIIIlIllI[lIIIIIIIllIIl[39]] = lIIlIllIlIlIlll("oZ5NC+mKsD4i6FGpSwPI08Vh/VuyxTdQ", "nIcjE");
        lIIIIIIIlIllI[lIIIIIIIllIIl[40]] = lIIlIllIllIIIIl("CAEBJhYi", "IuuGu");
        lIIIIIIIlIllI[lIIIIIIIllIIl[41]] = lIIlIllIlIlIlll("5OnC0XIAg1AAkPGR1+rMvw==", "Fihdu");
        lIIIIIIIlIllI[lIIIIIIIllIIl[42]] = lIIlIllIlIlIlll("HTzkGho/aLQ=", "rIofv");
        lIIIIIIIlIllI[lIIIIIIIllIIl[43]] = lIIlIllIlIlIlll("mQ8RPPuJvOA=", "LKACK");
        lIIIIIIIlIllI[lIIIIIIIllIIl[44]] = lIIlIllIlIlIlll("9ampt/iix7r0QZrrjhrA7Lx80jtCTJIP", "jfJdz");
        lIIIIIIIlIllI[lIIIIIIIllIIl[45]] = lIIlIllIlIllIII("+zkliV3tn9rU4B49DuYocBhqBcW6MrJi", "LXGJI");
        lIIIIIIIlIllI[lIIIIIIIllIIl[47]] = lIIlIllIllIIIIl("JgQgGToG", "upApH");
        lIIIIIIIlIllI[lIIIIIIIllIIl[48]] = lIIlIllIlIllIII("GD8kUkNaYt7L5NnpOIxJoQ==", "blKVl");
    }

    private static boolean lIIlIllIlllIIII(Object obj) {
        return obj == null;
    }

    private static String lIIlIllIlIllIII(String lllllllllllllllIIIlllllIIlIllllI, String lllllllllllllllIIIlllllIIlIlllIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIlllllIIlIlllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIIIIIIIllIIl[22], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIlllllIIlIllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIIlllllIIlIlllll) {
            lllllllllllllllIIIlllllIIlIlllll.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIllIlllIIll(int i, int i2) {
        return i > i2;
    }

    private static String lIIlIllIlIlIlll(String lllllllllllllllIIIlllllIIlIlIIIl, String lllllllllllllllIIIlllllIIlIlIIII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIlllllIIlIlIIII.getBytes(StandardCharsets.UTF_8)), lIIIIIIIllIIl[29]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIIIIIIIllIIl[22], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIlllllIIlIlIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIIlllllIIlIlIIlI) {
            lllllllllllllllIIIlllllIIlIlIIlI.printStackTrace();
            return null;
        }
    }

    @Inject
    public c(SquireMoonsOfPerilConfig squireMoonsOfPerilConfig) {
        this.z = squireMoonsOfPerilConfig;
    }

    private static int lIIlIllIllIlIlI(double d, double d2) {
        return (d > d2 ? 1 : (d == d2 ? 0 : -1));
    }

    private static boolean lIIlIllIlllIllI(int i, int i2) {
        return i == i2;
    }

    private static boolean lIIlIllIlllIIlI(int i) {
        return i < 0;
    }

    public EquipmentSetup b() {
        return (EquipmentSetup) this.z.blueMoonGear().selected(EquipmentSetup.class);
    }

    static {
        lIIlIllIllIIlll();
        lIIlIllIllIIIlI();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v122, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v127, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v129, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v150, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v157, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v163, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v179, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v201, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v29, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v52, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v78, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v95, types: [boolean] */
    public boolean run() {
        if (lIIlIllIllIllII(a(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            return lIIIIIIIllIIl[4];
        }
        if (lIIlIllIllIllII(b().isFullyEquipped() ? 1 : 0)) {
            if (lIIlIllIllIllIl(Inventory.isFull() ? 1 : 0)) {
                String[] strArr = new String[lIIIIIIIllIIl[21]];
                strArr[lIIIIIIIllIIl[4]] = lIIIIIIIlIllI[lIIIIIIIllIIl[4]];
                if (lIIlIllIllIllIl(Inventory.contains(strArr) ? 1 : 0) && lIIlIllIllIlllI(Equipment.fromSlot(EquipmentInventorySlot.SHIELD)) && lIIlIllIllIllll(b().get(EquipmentInventorySlot.SHIELD))) {
                    String[] strArr2 = new String[lIIIIIIIllIIl[21]];
                    strArr2[lIIIIIIIllIIl[4]] = lIIIIIIIlIllI[lIIIIIIIllIIl[21]];
                    Inventory.getFirst(strArr2).interact(lIIIIIIIlIllI[lIIIIIIIllIIl[22]]);
                }
            }
            b().swap();
        }
        NPC nearest = NPCs.getNearest(npc -> {
            if (lIIlIllIlllIllI(npc.getId(), lIIIIIIIllIIl[51]) && lIIlIllIllIllIl(a(npc.getWorldLocation()) ? 1 : 0)) {
                ?? r0 = lIIIIIIIllIIl[21];
                "".length();
                return (-((109 ^ 71) ^ (154 ^ 180))) >= 0 ? ((130 ^ 132) ^ (117 ^ 97)) & (((((136 + 56) - 94) + 65) ^ (((78 + 28) - 14) + 85)) ^ (-" ".length())) : r0;
            }
            return lIIIIIIIllIIl[4];
        });
        NPC nearest2 = NPCs.getNearest(npc2 -> {
            if (lIIlIllIlllIllI(npc2.getId(), lIIIIIIIllIIl[49]) && lIIlIllIlllIllI(npc2.getAnimation(), lIIIIIIIllIIl[50])) {
                ?? r0 = lIIIIIIIllIIl[21];
                "".length();
                return "  ".length() <= " ".length() ? ((94 ^ 118) ^ (17 ^ 9)) & (((144 ^ 191) ^ (132 ^ 155)) ^ (-" ".length())) : r0;
            }
            return lIIIIIIIllIIl[4];
        });
        String[] strArr3 = new String[lIIIIIIIllIIl[21]];
        strArr3[lIIIIIIIllIIl[4]] = lIIIIIIIlIllI[lIIIIIIIllIIl[23]];
        if (lIIlIllIllIllII(Inventory.contains(strArr3) ? 1 : 0) && lIIlIllIlllIIII(nearest) && lIIlIllIlllIIII(nearest2) && lIIlIllIlllIIlI(lIIlIllIllIlIlI(Combat.getHealthPercent(), 40.0d))) {
            SquireMoonsOfPeril.g = lIIIIIIIlIllI[lIIIIIIIllIIl[24]];
            TileObject nearest3 = TileObjects.getNearest(tileObject -> {
                if (lIIlIllIllIllIl(tileObject.getName().contains(lIIIIIIIlIllI[lIIIIIIIllIIl[47]]) ? 1 : 0)) {
                    String[] strArr4 = new String[lIIIIIIIllIIl[21]];
                    strArr4[lIIIIIIIllIIl[4]] = lIIIIIIIlIllI[lIIIIIIIllIIl[48]];
                    if (lIIlIllIllIllIl(tileObject.hasAction(strArr4) ? 1 : 0)) {
                        ?? r0 = lIIIIIIIllIIl[21];
                        "".length();
                        return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                }
                return lIIIIIIIllIIl[4];
            });
            if (lIIlIllIllIlllI(nearest3)) {
                nearest3.interact(lIIIIIIIlIllI[lIIIIIIIllIIl[25]]);
                return lIIIIIIIllIIl[4];
            }
        }
        NPC nearest4 = NPCs.getNearest(npc3 -> {
            if (lIIlIllIlllIllI(npc3.getId(), lIIIIIIIllIIl[46]) && lIIlIllIllIllIl(a(npc3.getWorldLocation()) ? 1 : 0)) {
                ?? r0 = lIIIIIIIllIIl[21];
                "".length();
                return "  ".length() == " ".length() ? ((204 ^ 193) ^ (153 ^ 159)) & (((197 ^ 128) ^ (139 ^ 197)) ^ (-" ".length())) : r0;
            }
            return lIIIIIIIllIIl[4];
        });
        if (lIIlIllIllIlllI(nearest4)) {
            WorldArea d = d(nearest4.getWorldLocation());
            if (lIIlIllIllIllII(d.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                SquireMoonsOfPeril.g = lIIIIIIIlIllI[lIIIIIIIllIIl[26]];
                Movement.setDestination(nearest4.getWorldLocation());
                return lIIIIIIIllIIl[4];
            } else if (lIIlIllIllIllIl(d.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                int[] iArr = new int[lIIIIIIIllIIl[21]];
                iArr[lIIIIIIIllIIl[4]] = lIIIIIIIllIIl[27];
                NPC nearest5 = NPCs.getNearest(iArr);
                if (lIIlIllIllIlllI(nearest5)) {
                    SquireMoonsOfPeril.g = lIIIIIIIlIllI[lIIIIIIIllIIl[28]];
                    if (lIIlIllIllIllIl(l.l() ? 1 : 0) && lIIlIllIllIllIl(Inventory.contains(item -> {
                        return item.getName().contains(lIIIIIIIlIllI[lIIIIIIIllIIl[45]]);
                    }) ? 1 : 0)) {
                        Inventory.getFirst(item2 -> {
                            return item2.getName().contains(lIIIIIIIlIllI[lIIIIIIIllIIl[44]]);
                        }).interact(lIIIIIIIlIllI[lIIIIIIIllIIl[29]]);
                        return lIIIIIIIllIIl[4];
                    }
                    nearest5.interact(lIIIIIIIlIllI[lIIIIIIIllIIl[30]]);
                    return lIIIIIIIllIIl[21];
                }
            }
        }
        if (lIIlIllIllIlllI(nearest)) {
            if (lIIlIllIllIllII(Movement.isRunEnabled() ? 1 : 0)) {
                Movement.toggleRun();
                return lIIIIIIIllIIl[21];
            }
            TileObject nearest6 = TileObjects.getNearest(tileObject2 -> {
                if (lIIlIllIllIllIl(tileObject2.getName().contains(lIIIIIIIlIllI[lIIIIIIIllIIl[42]]) ? 1 : 0)) {
                    String[] strArr4 = new String[lIIIIIIIllIIl[21]];
                    strArr4[lIIIIIIIllIIl[4]] = lIIIIIIIlIllI[lIIIIIIIllIIl[43]];
                    if (lIIlIllIllIllIl(tileObject2.hasAction(strArr4) ? 1 : 0) && lIIlIllIllIllIl(a(tileObject2.getWorldLocation()) ? 1 : 0)) {
                        ?? r0 = lIIIIIIIllIIl[21];
                        "".length();
                        return ((166 ^ 191) & ((94 ^ 71) ^ (-1))) >= "  ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                }
                return lIIIIIIIllIIl[4];
            });
            if (lIIlIllIllIlllI(nearest6)) {
                SquireMoonsOfPeril.g = lIIIIIIIlIllI[lIIIIIIIllIIl[31]];
                nearest6.interact(lIIIIIIIlIllI[lIIIIIIIllIIl[32]]);
                return lIIIIIIIllIIl[21];
            } else if (lIIlIllIlllIIII(nearest6)) {
                if (lIIlIllIlllIIll(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lIIIIIIIllIIl[33], lIIIIIIIllIIl[34], lIIIIIIIllIIl[4])), lIIIIIIIllIIl[24])) {
                    WorldArea worldArea = new WorldArea(lIIIIIIIllIIl[5], lIIIIIIIllIIl[6], lIIIIIIIllIIl[24], lIIIIIIIllIIl[23], lIIIIIIIllIIl[4]);
                    SquireMoonsOfPeril.g = lIIIIIIIlIllI[lIIIIIIIllIIl[35]];
                    Movement.setDestination(worldArea.getRandom());
                    return lIIIIIIIllIIl[21];
                }
            }
        }
        if (lIIlIllIllIlllI(nearest2)) {
            Set<WorldPoint> c = c(lIIIIIIIllIIl[36]);
            Set<WorldPoint> c2 = c(lIIIIIIIllIIl[37]);
            WorldPoint worldPoint = (WorldPoint) Players.getLocal().getWorldLocation().createWorldArea(lIIIIIIIllIIl[26]).toWorldPointList().stream().filter(worldPoint2 -> {
                if (lIIlIllIllIllIl(Reachable.isWalkable(worldPoint2) ? 1 : 0) && lIIlIllIllIllII(c.contains(worldPoint2) ? 1 : 0)) {
                    ?? r0 = lIIIIIIIllIIl[21];
                    "".length();
                    return ((13 ^ 56) & ((175 ^ 154) ^ (-1))) > (184 ^ 188) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
                return lIIIIIIIllIIl[4];
            }).min(Comparator.comparingInt(worldPoint3 -> {
                return worldPoint3.distanceTo(Players.getLocal().getWorldLocation());
            })).orElse(null);
            if (lIIlIllIllIllII(c.isEmpty() ? 1 : 0) && lIIlIllIllIlllI(worldPoint)) {
                if (lIIlIllIlllIlII(this.A, lIIIIIIIllIIl[22])) {
                    this.A += lIIIIIIIllIIl[21];
                    Time.sleepTicks(lIIIIIIIllIIl[21]);
                    "".length();
                    Time.sleep(300L);
                    "".length();
                }
                if (lIIlIllIlllIlIl(this.A, lIIIIIIIllIIl[22])) {
                    SquireMoonsOfPeril.g = lIIIIIIIlIllI[lIIIIIIIllIIl[38]];
                    Movement.setDestination(worldPoint);
                    this.A = lIIIIIIIllIIl[4];
                    return lIIIIIIIllIIl[4];
                }
            }
            if (!lIIlIllIllIllII(c.isEmpty() ? 1 : 0) || lIIlIllIllIllIl(c2.isEmpty() ? 1 : 0)) {
                this.A = lIIIIIIIllIIl[4];
                SquireMoonsOfPeril.g = lIIIIIIIlIllI[lIIIIIIIllIIl[39]];
                nearest2.interact(lIIIIIIIlIllI[lIIIIIIIllIIl[40]]);
                return lIIIIIIIllIIl[21];
            }
        }
        if (lIIlIllIlllIIII(nearest2)) {
            Set<WorldPoint> c3 = c(lIIIIIIIllIIl[36]);
            WorldPoint worldPoint4 = (WorldPoint) Players.getLocal().getWorldLocation().createWorldArea(lIIIIIIIllIIl[26]).toWorldPointList().stream().filter(worldPoint5 -> {
                if (lIIlIllIllIllIl(Reachable.isWalkable(worldPoint5) ? 1 : 0) && lIIlIllIllIllII(c3.contains(worldPoint5) ? 1 : 0)) {
                    ?? r0 = lIIIIIIIllIIl[21];
                    "".length();
                    return 0 != 0 ? ((12 ^ 104) ^ (7 ^ 123)) & (((((82 + 30) - 54) + 76) ^ (((45 + 149) - 167) + 131)) ^ (-" ".length())) : r0;
                }
                return lIIIIIIIllIIl[4];
            }).min(Comparator.comparingInt(worldPoint6 -> {
                return worldPoint6.distanceTo(Players.getLocal().getWorldLocation());
            })).orElse(null);
            if (lIIlIllIllIllII(c3.isEmpty() ? 1 : 0) && lIIlIllIllIlllI(worldPoint4)) {
                SquireMoonsOfPeril.g = lIIIIIIIlIllI[lIIIIIIIllIIl[41]];
                Movement.setDestination(worldPoint4);
                this.A = lIIIIIIIllIIl[4];
                return lIIIIIIIllIIl[4];
            }
        }
        return lIIIIIIIllIIl[21];
    }

    private WorldArea d(WorldPoint worldPoint) {
        WorldArea[] worldAreaArr = new WorldArea[lIIIIIIIllIIl[29]];
        worldAreaArr[lIIIIIIIllIIl[4]] = this.B;
        worldAreaArr[lIIIIIIIllIIl[21]] = this.C;
        worldAreaArr[lIIIIIIIllIIl[22]] = this.D;
        worldAreaArr[lIIIIIIIllIIl[23]] = this.E;
        worldAreaArr[lIIIIIIIllIIl[24]] = this.F;
        worldAreaArr[lIIIIIIIllIIl[25]] = this.G;
        worldAreaArr[lIIIIIIIllIIl[26]] = this.H;
        worldAreaArr[lIIIIIIIllIIl[28]] = this.I;
        List asList = Arrays.asList(worldAreaArr);
        WorldArea worldArea = null;
        int i = lIIIIIIIllIIl[4];
        do {
            if (lIIlIllIlllIlII(i, asList.size())) {
                if (lIIlIllIllIllIl(((WorldArea) asList.get(i)).contains(worldPoint) ? 1 : 0)) {
                    worldArea = (WorldArea) asList.get(i);
                    "".length();
                    if ((-(148 ^ 144)) >= 0) {
                        return null;
                    }
                } else {
                    i++;
                    "".length();
                }
            }
            return worldArea;
        } while ((-(130 ^ 134)) <= 0);
        return null;
    }

    private static boolean lIIlIllIllIlllI(Object obj) {
        return obj != null;
    }

    private static boolean lIIlIllIlllIlII(int i, int i2) {
        return i < i2;
    }

    private static boolean lIIlIllIllIllII(int i) {
        return i == 0;
    }

    private static boolean lIIlIllIllIllIl(int i) {
        return i != 0;
    }

    private static boolean lIIlIllIllIllll(int i) {
        return i <= 0;
    }

    private static void lIIlIllIllIIlll() {
        lIIIIIIIllIIl = new int[53];
        lIIIIIIIllIIl[0] = (-6705) & 8123;
        lIIIIIIIllIIl[1] = (-((-1429) & 20437)) & (-4097) & 32767;
        lIIIIIIIllIIl[2] = (((27 + 66) - 77) + 119) ^ (((46 + 63) - (-61)) + 4);
        lIIIIIIIllIIl[3] = 114 ^ 87;
        lIIIIIIIllIIl[4] = (129 ^ 162) & ((89 ^ 122) ^ (-1));
        lIIIIIIIllIIl[5] = (-((-726) & 15095)) & (-16385) & 32191;
        lIIIIIIIllIIl[6] = (-6162) & 15837;
        lIIIIIIIllIIl[7] = (-((-22531) & 31331)) & (-20481) & 30719;
        lIIIIIIIllIIl[8] = (-((-1161) & 20105)) & (-19) & 28639;
        lIIIIIIIllIIl[9] = (-8226) & 9661;
        lIIIIIIIllIIl[10] = (-((-27922) & 32019)) & (-2065) & 15839;
        lIIIIIIIllIIl[11] = (-31331) & 32767;
        lIIIIIIIllIIl[12] = (-((-1961) & 4025)) & (-20993) & 32735;
        lIIIIIIIllIIl[13] = (-((-1425) & 24499)) & (-9) & 32763;
        lIIIIIIIllIIl[14] = (-2601) & 12282;
        lIIIIIIIllIIl[15] = (-((-1223) & 17615)) & (-2597) & 28671;
        lIIIIIIIllIIl[16] = (-18434) & 28117;
        lIIIIIIIllIIl[17] = (-((-4401) & 29503)) & (-2049) & 28591;
        lIIIIIIIllIIl[18] = (-8218) & 9659;
        lIIIIIIIllIIl[19] = (-20549) & 21991;
        lIIIIIIIllIIl[20] = (-14347) & 15790;
        lIIIIIIIllIIl[21] = " ".length();
        lIIIIIIIllIIl[22] = "  ".length();
        lIIIIIIIllIIl[23] = "   ".length();
        lIIIIIIIllIIl[24] = (185 ^ 176) ^ (107 ^ 102);
        lIIIIIIIllIIl[25] = 115 ^ 118;
        lIIIIIIIllIIl[26] = 146 ^ 148;
        lIIIIIIIllIIl[27] = (-3339) & 16351;
        lIIIIIIIllIIl[28] = 160 ^ 167;
        lIIIIIIIllIIl[29] = 45 ^ 37;
        lIIIIIIIllIIl[30] = (111 ^ 64) ^ (28 ^ 58);
        lIIIIIIIllIIl[31] = 57 ^ 51;
        lIIIIIIIllIIl[32] = 86 ^ 93;
        lIIIIIIIllIIl[33] = (-2641) & 4080;
        lIIIIIIIllIIl[34] = (-4145) & 13819;
        lIIIIIIIllIIl[35] = (((70 + 125) - 159) + 107) ^ (((50 + 101) - 47) + 27);
        lIIIIIIIllIIl[36] = (-29701) & 32471;
        lIIIIIIIllIIl[37] = (-20522) & 23291;
        lIIIIIIIllIIl[38] = 22 ^ 27;
        lIIIIIIIllIIl[39] = (192 ^ 129) ^ (222 ^ 145);
        lIIIIIIIllIIl[40] = 176 ^ 191;
        lIIIIIIIllIIl[41] = (234 ^ 151) ^ (233 ^ 132);
        lIIIIIIIllIIl[42] = (((123 + 5) - 122) + 146) ^ (((49 + 68) - 64) + 84);
        lIIIIIIIllIIl[43] = 32 ^ 50;
        lIIIIIIIllIIl[44] = 45 ^ 62;
        lIIIIIIIllIIl[45] = 119 ^ 99;
        lIIIIIIIllIIl[46] = (-((-10247) & 27951)) & (-2049) & 32767;
        lIIIIIIIllIIl[47] = (((43 + 2) - (-76)) + 56) ^ (((154 + 50) - 138) + 98);
        lIIIIIIIllIIl[48] = 50 ^ 36;
        lIIIIIIIllIIl[49] = (-((-6819) & 8123)) & (-3) & 14331;
        lIIIIIIIllIIl[50] = (-((-11557) & 32229)) & (-1) & 31703;
        lIIIIIIIllIIl[51] = (-((-17089) & 20445)) & (-1) & 16383;
        lIIIIIIIllIIl[52] = (((155 + 93) - 204) + 137) ^ (((9 + 98) - (-46)) + 9);
    }

    protected boolean a(WorldPoint worldPoint) {
        return this.f1q.contains(worldPoint);
    }

    private Set<WorldPoint> c(int i) {
        HashSet hashSet = new HashSet();
        Static.getClient().getGraphicsObjects().forEach(graphicsObject -> {
            if (lIIlIllIlllIllI(graphicsObject.getId(), i)) {
                hashSet.add(WorldPoint.fromLocal(Static.getClient(), graphicsObject.getLocation()));
                "".length();
            }
        });
        return hashSet;
    }

    private static boolean lIIlIllIlllIlIl(int i, int i2) {
        return i >= i2;
    }
}
