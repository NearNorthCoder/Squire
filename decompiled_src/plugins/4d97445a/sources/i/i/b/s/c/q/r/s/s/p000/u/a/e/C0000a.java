package i.i.b.s.c.q.r.s.s.p000.u.a.e;

import com.google.common.collect.ComparisonChain;
import gg.squire.client.util.Log;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import javax.inject.Singleton;
import net.runelite.api.Actor;
import net.runelite.api.Client;
import net.runelite.api.InventoryID;
import net.runelite.api.Item;
import net.runelite.api.ItemContainer;
import net.runelite.api.NPC;
import net.runelite.api.Prayer;
import net.runelite.api.Projectile;
import net.runelite.api.Skill;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.AnimationChanged;
import net.runelite.api.events.GameTick;
import net.runelite.api.events.NpcDespawned;
import net.runelite.api.events.NpcSpawned;
import net.runelite.api.events.ProjectileSpawned;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.game.ItemManager;
import net.runelite.http.api.item.ItemEquipmentStats;
import net.runelite.http.api.item.ItemStats;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Reachable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@Singleton
/* renamed from: i.i.b.s.c.q.r.s.s.-.u.a.e.a  reason: invalid package and case insensitive filesystem */
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:i/i/b/s/c/q/r/s/s/-/u/a/e/a.class */
public class C0000a {
    private static final /* synthetic */ int k;

    /* renamed from: i  reason: collision with root package name */
    private static final /* synthetic */ int f1i;
    private static final /* synthetic */ int p;
    private static final /* synthetic */ int c;
    private static final /* synthetic */ int e;
    private static final /* synthetic */ int o;
    private /* synthetic */ int C;
    private static final /* synthetic */ int f;
    private static final /* synthetic */ int m;
    private /* synthetic */ EnumC0060i A;
    @Inject
    private /* synthetic */ ItemManager w;
    private static final /* synthetic */ int h;
    @Inject
    private /* synthetic */ Client v;
    private static final /* synthetic */ int j;
    private static final /* synthetic */ int l;
    public static final /* synthetic */ int b;
    private /* synthetic */ int D;
    private static final /* synthetic */ int g;
    private static final /* synthetic */ int d;
    private static /* synthetic */ int[] llIIIII;
    private static final /* synthetic */ Set<Integer> r;
    private static final /* synthetic */ int q;
    private static /* synthetic */ String[] lIlllll;
    private /* synthetic */ C0055d y;
    private static final /* synthetic */ Logger a;
    private static final /* synthetic */ int n;
    private final /* synthetic */ List<NPC> s = new ArrayList();
    private final /* synthetic */ List<C0057f> t = new ArrayList();
    private final /* synthetic */ List<Long> u = new ArrayList();
    private /* synthetic */ Prayer x = Prayer.PROTECT_FROM_MAGIC;
    private /* synthetic */ boolean z = llIIIII[0];
    private /* synthetic */ int B = llIIIII[0];

    public TileObject b() {
        return TileObjects.getNearest(tileObject -> {
            String[] strArr = new String[llIIIII[1]];
            strArr[llIIIII[0]] = lIlllll[llIIIII[28]];
            if (llIIIlIIl(tileObject.hasAction(strArr) ? 1 : 0) && llIIIlIIl(Reachable.isInteractable(tileObject) ? 1 : 0)) {
                ?? r0 = llIIIII[1];
                "".length();
                return (-"   ".length()) > 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return llIIIII[0];
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v11, types: [boolean] */
    private void e() {
        if (llIIIIIII(this.y)) {
            return;
        }
        int i2 = llIIIII[0];
        int i3 = llIIIII[0];
        int i4 = llIIIII[0];
        ItemContainer itemContainer = this.v.getItemContainer(InventoryID.EQUIPMENT);
        if (llIIIlIII(itemContainer)) {
            Item[] items = itemContainer.getItems();
            int length = items.length;
            int i5 = llIIIII[0];
            while (llIIIIIIl(i5, length)) {
                Item item = items[i5];
                if (llIIIIIII(item)) {
                    "".length();
                    if ("  ".length() > "   ".length()) {
                        return;
                    }
                } else {
                    ItemStats itemStats = this.w.getItemStats(item.getId(), (boolean) llIIIII[0]);
                    if (llIIIIIII(itemStats)) {
                        "".length();
                        if (0 != 0) {
                            return;
                        }
                    } else {
                        ItemEquipmentStats equipment = itemStats.getEquipment();
                        if (llIIIIIII(equipment)) {
                            "".length();
                            if (((true ^ true) & ((true ^ true) ^ true)) != ((true ^ true) & ((true ^ true) ^ true))) {
                                return;
                            }
                        } else {
                            i2 += equipment.getDstab();
                            i3 += equipment.getDmagic();
                            i4 += equipment.getDrange();
                        }
                    }
                }
                i5++;
                "".length();
                if (0 != 0) {
                    return;
                }
            }
        }
        int boostedSkillLevel = this.v.getBoostedSkillLevel(Skill.MAGIC);
        int boostedSkillLevel2 = this.v.getBoostedSkillLevel(Skill.DEFENCE);
        int i6 = ((int) ((boostedSkillLevel * 0.7d) + (boostedSkillLevel2 * 0.3d))) + i3;
        int i7 = boostedSkillLevel2 + i4;
        int i8 = boostedSkillLevel2 + i2;
        if (llIIIlIII(this.v.getLocalPlayer())) {
            WorldPoint worldLocation = this.v.getLocalPlayer().getWorldLocation();
            WorldPoint worldLocation2 = this.y.y().getWorldLocation();
            if (!llIIIlIll(worldLocation.getX(), worldLocation2.getX() - llIIIII[1]) || !llIIIIIll(worldLocation.getX(), worldLocation2.getX() + llIIIII[6]) || !llIIIlIll(worldLocation.getY(), worldLocation2.getY() - llIIIII[1]) || llIIIIllI(worldLocation.getY(), worldLocation2.getY() + llIIIII[6])) {
                i8 = llIIIII[26];
            }
        }
        if (llIIIIIll(i6, i7) && llIIIIIll(i6, i8)) {
            this.x = Prayer.PROTECT_FROM_MAGIC;
            "".length();
            if ((118 ^ 115) <= 0) {
            }
        } else if (!llIIIIIll(i7, i8)) {
            this.x = Prayer.PROTECT_FROM_MELEE;
        } else {
            this.x = Prayer.PROTECT_FROM_MISSILES;
            "".length();
            if ((76 ^ 72) > (63 ^ 59)) {
            }
        }
    }

    private static boolean llIIIIIII(Object obj) {
        return obj == null;
    }

    private static String lIlllllII(String lllIlIllIlIIlll, String lllIlIllIlIIllI) {
        try {
            SecretKeySpec lllIlIllIlIlIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllIlIllIlIIllI.getBytes(StandardCharsets.UTF_8)), llIIIII[11]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llIIIII[2], lllIlIllIlIlIlI);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllIlIllIlIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllIlIllIlIlIII) {
            lllIlIllIlIlIII.printStackTrace();
            return null;
        }
    }

    public Prayer j() {
        return this.x;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v23, types: [boolean] */
    public boolean c() {
        TileObject b2 = b();
        if (llIIIIIII(b2)) {
            Log.info(lIlllll[llIIIII[0]]);
            return llIIIII[0];
        }
        if (!llIIIIIIl(Players.getLocal().getWorldLocation().getY(), b2.getWorldLocation().getY())) {
            Log.info(lIlllll[llIIIII[3]]);
            return llIIIII[0];
        }
        Log.info(lIlllll[llIIIII[1]]);
        b2.interact(lIlllll[llIIIII[2]]);
        return llIIIII[1];
    }

    private static String lIllllIll(String lllIlIllIIllIlI, String lllIlIllIIllIIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllIlIllIIllIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llIIIII[2], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllIlIllIIllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllIlIllIIlIllI) {
            lllIlIllIIlIllI.printStackTrace();
            return null;
        }
    }

    private static boolean llIIIIllI(int i2, int i3) {
        return i2 > i3;
    }

    @Subscribe
    private void a(NpcDespawned npcDespawned) {
        NPC npc = npcDespawned.getNpc();
        EnumC0058g b2 = EnumC0058g.b(npc);
        if (llIIIlIII(b2)) {
            System.out.println("Despawned a " + b2);
            this.s.remove(npc);
            "".length();
        }
        if (llIIIlIII(npc.getName()) && llIIIlIIl(npc.getName().toLowerCase().contains(lIlllll[llIIIII[25]]) ? 1 : 0)) {
            a();
        }
        if (llIIIIIII(this.y) && llIIIIlII(this.s.isEmpty() ? 1 : 0)) {
            this.s.clear();
        }
    }

    public void a(EnumC0060i enumC0060i) {
        this.A = enumC0060i;
    }

    private static int llIIIIIlI(long j2, long j3) {
        return (j2 > j3 ? 1 : (j2 == j3 ? 0 : -1));
    }

    private static boolean llIIIlIII(Object obj) {
        return obj != null;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x04bb A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void d() {
        EnumC0058g enumC0058g;
        this.t.clear();
        if (llIIIIIII(this.y) || llIIIIIII(this.y.C())) {
            return;
        }
        int A = this.y.A();
        EnumC0060i a2 = this.y.a(llIIIII[1], this.y.w());
        EnumC0060i B = this.y.B();
        int i2 = llIIIII[0];
        if (llIIIlIII(B)) {
            i2 = B.S();
        }
        int i3 = this.C + llIIIII[1];
        while (llIIIIIll(i3, this.C + llIIIII[7])) {
            if (llIIIIlIl(this.s.size(), llIIIII[3])) {
                if (llIIIIlIl(this.y.D(), i3 - llIIIII[15])) {
                    enumC0058g = EnumC0058g.b(this.s.get(llIIIII[0]));
                    "".length();
                    if ((((((1 + 161) - 5) + 39) ^ (((146 + 154) - 195) + 52)) & (((77 ^ 39) ^ (167 ^ 148)) ^ (-" ".length()))) > "  ".length()) {
                        return;
                    }
                } else if (llIIIIlIl(this.y.D(), i3 - llIIIII[17])) {
                    enumC0058g = EnumC0058g.b(this.s.get(this.s.size() - llIIIII[2]));
                    "".length();
                    if (0 != 0) {
                        return;
                    }
                } else if (llIIIIlIl(this.y.D(), i3 - llIIIII[19])) {
                    enumC0058g = EnumC0058g.b(this.s.get(this.s.size() - llIIIII[1]));
                    "".length();
                    if ("   ".length() == 0) {
                        return;
                    }
                } else {
                    enumC0058g = null;
                }
                if (llIIIlIII(enumC0058g)) {
                    switch (C0027b.E[enumC0058g.L().ordinal()]) {
                        case 1:
                            this.t.add(new C0057f(i3, EnumC0056e.GHOST_MELEE));
                            "".length();
                            "".length();
                            if ("  ".length() < (((83 ^ 37) ^ (118 ^ 13)) & (((202 ^ 141) ^ (17 ^ 91)) ^ (-" ".length())))) {
                                return;
                            }
                            break;
                        case 2:
                            this.t.add(new C0057f(i3, EnumC0056e.GHOST_RANGED));
                            "".length();
                            "".length();
                            if (" ".length() <= 0) {
                                return;
                            }
                            break;
                        case 3:
                            this.t.add(new C0057f(i3, EnumC0056e.GHOST_MAGIC));
                            "".length();
                            break;
                    }
                    "".length();
                    if ((-"   ".length()) > 0) {
                        return;
                    }
                    i3++;
                    "".length();
                    if ("  ".length() < "  ".length()) {
                        return;
                    }
                }
            }
            if (llIIIlIlI(a2, EnumC0060i.TRIPLE)) {
                if (llIIIlIlI(this.y.F(), EnumC0056e.MAGIC)) {
                    if (llIIIIlIl(A + llIIIII[8], i3)) {
                        this.t.add(new C0057f(i3, EnumC0056e.RANGED));
                        "".length();
                        "".length();
                        if (" ".length() == "   ".length()) {
                            return;
                        }
                    } else if (llIIIIlIl(A + llIIIII[10], i3)) {
                        this.t.add(new C0057f(i3, EnumC0056e.MELEE));
                        "".length();
                        "".length();
                        if ((-" ".length()) > 0) {
                            return;
                        }
                    }
                } else if (llIIIlIlI(this.y.F(), EnumC0056e.RANGED)) {
                    if (llIIIIlIl(A + llIIIII[8], i3)) {
                        this.t.add(new C0057f(i3, EnumC0056e.MELEE));
                        "".length();
                        "".length();
                        if ((((((113 + 60) - 136) + 121) ^ (((162 + 49) - 193) + 167)) & (((201 ^ 195) ^ (127 ^ 82)) ^ (-" ".length()))) != 0) {
                            return;
                        }
                    }
                } else if (llIIIIIII(this.y.F())) {
                    if (llIIIIlIl(A + i2 + llIIIII[2], i3)) {
                        this.t.add(new C0057f(i3, EnumC0056e.MAGIC));
                        "".length();
                        "".length();
                        if ((-"  ".length()) >= 0) {
                            return;
                        }
                    } else if (llIIIIlIl(A + i2 + llIIIII[6], i3)) {
                        this.t.add(new C0057f(i3, EnumC0056e.RANGED));
                        "".length();
                        "".length();
                        if (0 != 0) {
                            return;
                        }
                    }
                }
            } else if (llIIIlIlI(a2, EnumC0060i.AUTO) && llIIIIlIl(A + i2 + llIIIII[1], i3)) {
                if (llIIIlIlI(this.x, Prayer.PROTECT_FROM_MAGIC)) {
                    this.t.add(new C0057f(i3, EnumC0056e.MAGIC));
                    "".length();
                    "".length();
                    if (((76 ^ 10) & ((96 ^ 38) ^ (-1))) < 0) {
                        return;
                    }
                } else if (llIIIlIlI(this.x, Prayer.PROTECT_FROM_MISSILES)) {
                    this.t.add(new C0057f(i3, EnumC0056e.RANGED));
                    "".length();
                    "".length();
                    if (" ".length() == 0) {
                        return;
                    }
                } else if (llIIIlIlI(this.x, Prayer.PROTECT_FROM_MELEE)) {
                    this.t.add(new C0057f(i3, EnumC0056e.MELEE));
                    "".length();
                }
            }
            i3++;
            "".length();
            if ("  ".length() < "  ".length()) {
            }
        }
    }

    private static boolean llIIIIIll(int i2, int i3) {
        return i2 <= i3;
    }

    private static boolean llIIIIlII(int i2) {
        return i2 == 0;
    }

    public C0055d k() {
        return this.y;
    }

    @Subscribe
    private void a(ProjectileSpawned projectileSpawned) {
        if (llIIIIIII(this.y)) {
            return;
        }
        Projectile projectile = projectileSpawned.getProjectile();
        int w = this.y.w();
        EnumC0060i a2 = this.y.a(llIIIII[1], w);
        a(a2);
        switch (projectile.getId()) {
            case 15:
            case 1247:
            default:
                return;
            case 34:
                if (llIIIIlII(this.s.isEmpty() ? 1 : 0)) {
                    String str = lIlllll[llIIIII[11]];
                    Object[] objArr = new Object[llIIIII[6]];
                    objArr[llIIIII[0]] = Integer.valueOf(this.C);
                    objArr[llIIIII[1]] = Integer.valueOf(this.y.z() + llIIIII[1]);
                    objArr[llIIIII[2]] = Integer.valueOf(w);
                    objArr[llIIIII[3]] = a2;
                    objArr[llIIIII[8]] = lIlllll[llIIIII[12]];
                    Log.debug(str, objArr);
                    "".length();
                    if ("  ".length() != "  ".length()) {
                        return;
                    }
                    return;
                }
                return;
            case 100:
                if (llIIIIlII(this.s.isEmpty() ? 1 : 0)) {
                    String str2 = lIlllll[llIIIII[7]];
                    Object[] objArr2 = new Object[llIIIII[6]];
                    objArr2[llIIIII[0]] = Integer.valueOf(this.C);
                    objArr2[llIIIII[1]] = Integer.valueOf(this.y.z() + llIIIII[1]);
                    objArr2[llIIIII[2]] = Integer.valueOf(w);
                    objArr2[llIIIII[3]] = a2;
                    objArr2[llIIIII[8]] = lIlllll[llIIIII[13]];
                    Log.debug(str2, objArr2);
                    "".length();
                    if ((((172 ^ 191) ^ (178 ^ 186)) & (((76 ^ 103) ^ (171 ^ 155)) ^ (-" ".length()))) < 0) {
                        return;
                    }
                    return;
                }
                return;
            case 1242:
                String str3 = lIlllll[llIIIII[8]];
                Object[] objArr3 = new Object[llIIIII[6]];
                objArr3[llIIIII[0]] = Integer.valueOf(this.C);
                objArr3[llIIIII[1]] = Integer.valueOf(this.y.z() + llIIIII[1]);
                objArr3[llIIIII[2]] = Integer.valueOf(w);
                objArr3[llIIIII[3]] = a2;
                objArr3[llIIIII[8]] = lIlllll[llIIIII[6]];
                Log.debug(str3, objArr3);
                if (llIIIIlll(a2, EnumC0060i.TRIPLE)) {
                    this.y.b(EnumC0060i.AUTO);
                    "".length();
                    if ((78 ^ 75) <= 0) {
                        return;
                    }
                } else {
                    this.y.a(EnumC0056e.MAGIC);
                }
                this.y.a(this.C, EnumC0056e.MAGIC);
                "".length();
                if (0 != 0) {
                    return;
                }
                return;
            case 1245:
                Logger logger = a;
                String str4 = lIlllll[llIIIII[9]];
                Object[] objArr4 = new Object[llIIIII[6]];
                objArr4[llIIIII[0]] = Integer.valueOf(this.C);
                objArr4[llIIIII[1]] = Integer.valueOf(this.y.z() + llIIIII[1]);
                objArr4[llIIIII[2]] = Integer.valueOf(w);
                objArr4[llIIIII[3]] = a2;
                objArr4[llIIIII[8]] = lIlllll[llIIIII[10]];
                logger.debug(str4, objArr4);
                if (llIIIIlll(a2, EnumC0060i.TRIPLE)) {
                    this.y.b(EnumC0060i.AUTO);
                    "".length();
                    if ("  ".length() <= 0) {
                        return;
                    }
                } else {
                    this.y.a(EnumC0056e.RANGED);
                }
                this.y.a(this.C, EnumC0056e.RANGED);
                "".length();
                if (true && ((true ^ true) ^ true)) {
                    return;
                }
                return;
            case 1248:
                if (llIIIIlII(this.s.isEmpty() ? 1 : 0)) {
                    String str5 = lIlllll[llIIIII[14]];
                    Object[] objArr5 = new Object[llIIIII[6]];
                    objArr5[llIIIII[0]] = Integer.valueOf(this.C);
                    objArr5[llIIIII[1]] = Integer.valueOf(this.y.z() + llIIIII[1]);
                    objArr5[llIIIII[2]] = Integer.valueOf(w);
                    objArr5[llIIIII[3]] = a2;
                    objArr5[llIIIII[8]] = lIlllll[llIIIII[15]];
                    Log.debug(str5, objArr5);
                    "".length();
                    if ((((50 ^ 38) ^ (21 ^ 53)) & (((((167 + 83) - 182) + 108) ^ (((110 + 50) - 34) + 6)) ^ (-" ".length()))) != 0) {
                        return;
                    }
                    return;
                }
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    public boolean g() {
        if (llIIIlIII(this.y) && llIIIlIII(this.y.y()) && llIIIIlIl(this.y.y().getAnimation(), llIIIII[27])) {
            ?? r0 = llIIIII[1];
            "".length();
            return ((((86 ^ 93) ^ (58 ^ 24)) & (((46 ^ 73) ^ (41 ^ 103)) ^ (-" ".length()))) & ((((84 ^ 68) ^ (38 ^ 127)) & (((((25 + 214) - 66) + 42) ^ (((34 + 131) - 12) + 5)) ^ (-" ".length()))) ^ (-" ".length()))) > (((((127 + 46) - 78) + 110) ^ (((43 + 11) - 53) + 142)) & (((((215 + 8) - 133) + 141) ^ (((122 + 120) - 157) + 80)) ^ (-" ".length()))) ? ((((187 + 12) - 17) + 39) ^ (((139 + 4) - 90) + 135)) & (((166 ^ 161) ^ (227 ^ 133)) ^ (-" ".length())) : r0;
        }
        return llIIIII[0];
    }

    private static boolean llIIIIIIl(int i2, int i3) {
        return i2 < i3;
    }

    private static String lIlllllIl(String lllIlIllIIIlIlI, String lllIlIllIIIlIIl) {
        String str = new String(Base64.getDecoder().decode(lllIlIllIIIlIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllIlIllIIIlIII = new StringBuilder();
        char[] lllIlIllIIIIlll = lllIlIllIIIlIIl.toCharArray();
        int lllIlIllIIIIllI = llIIIII[0];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i2 = llIIIII[0];
        while (llIIIIIIl(i2, length)) {
            lllIlIllIIIlIII.append((char) (charArray[i2] ^ lllIlIllIIIIlll[lllIlIllIIIIllI % lllIlIllIIIIlll.length]));
            "".length();
            lllIlIllIIIIllI++;
            i2++;
            "".length();
            if (((174 ^ 191) & ((124 ^ 109) ^ (-1))) > 0) {
                return null;
            }
        }
        return String.valueOf(lllIlIllIIIlIII);
    }

    public boolean l() {
        return this.z;
    }

    private static boolean llIIIlIll(int i2, int i3) {
        return i2 >= i3;
    }

    public void a(int i2) {
        this.B = i2;
    }

    public int n() {
        return this.B;
    }

    @Subscribe
    private void onGameTick(GameTick gameTick) {
        NPC y;
        if (llIIIIIII(this.y)) {
            y = null;
            "".length();
            if ((-((((18 + 125) - 125) + 159) ^ (((32 + 110) - 3) + 42))) > 0) {
                return;
            }
        } else {
            y = this.y.y();
        }
        if (llIIIIIII(y)) {
            this.s.clear();
        }
        if (llIIIIIIl(this.B + llIIIII[4], this.C)) {
            this.s.clear();
        }
        if (llIIIIIll(this.u.size(), this.D)) {
            this.u.add(Long.valueOf(System.currentTimeMillis()));
            "".length();
            "".length();
            if ((-" ".length()) >= (((153 ^ 165) ^ (174 ^ 164)) & (((((171 + 124) - 161) + 42) ^ (((107 + 90) - 140) + 77)) ^ (-" ".length())))) {
                return;
            }
        } else {
            this.u.set(this.D, Long.valueOf(System.currentTimeMillis()));
            "".length();
        }
        long j2 = 0;
        int i2 = llIIIII[0];
        while (llIIIIIIl(i2, this.u.size())) {
            if (llIIIIlII(llIIIIIlI(j2, 0L))) {
                j2 = this.u.get(i2).longValue() + (llIIIII[5] * (((this.D - i2) + llIIIII[6]) % llIIIII[6]));
                "".length();
                if (!(true ^ true)) {
                    return;
                }
            } else {
                j2 = Math.min(j2, this.u.get(i2).longValue() + (llIIIII[5] * (((this.D - i2) + llIIIII[6]) % llIIIII[6])));
            }
            i2++;
            "".length();
            if (0 != 0) {
                return;
            }
        }
        this.D = (this.D + llIIIII[1]) % llIIIII[6];
        this.C += llIIIII[1];
        if (llIIIIlIl(this.C % llIIIII[7], llIIIII[3])) {
            e();
        }
        d();
        if (llIIIIllI(this.s.size(), llIIIII[1])) {
            this.s.sort(npc, npc2 -> {
                return ComparisonChain.start().compare(npc.getLocalLocation().getY(), npc2.getLocalLocation().getY()).compare(npc.getLocalLocation().getX(), npc2.getLocalLocation().getX()).result();
            });
        }
    }

    @Subscribe
    private void a(AnimationChanged animationChanged) {
        if (llIIIIIII(this.y)) {
            return;
        }
        Actor actor = animationChanged.getActor();
        NPC y = this.y.y();
        if (!llIIIlIII(y) || llIIIIlll(actor, y)) {
            return;
        }
        int animation = y.getAnimation();
        int w = this.y.w();
        EnumC0060i a2 = this.y.a(llIIIII[1], w);
        switch (animation) {
            case -1:
            case 4489:
            case 4490:
                "".length();
                if (true ^ true) {
                    return;
                }
                return;
            case 4486:
            case 4487:
                this.y = new C0055d(this.y.y());
                this.C = llIIIII[0];
                this.t.clear();
                this.u.clear();
                this.D = llIIIII[0];
                this.y.a(this.C, EnumC0056e.SPAWN);
                "".length();
                if ((12 ^ 8) == "   ".length()) {
                    return;
                }
                return;
            case 4491:
                String str = lIlllll[llIIIII[16]];
                Object[] objArr = new Object[llIIIII[6]];
                objArr[llIIIII[0]] = Integer.valueOf(this.C);
                objArr[llIIIII[1]] = Integer.valueOf(this.y.z() + llIIIII[1]);
                objArr[llIIIII[2]] = Integer.valueOf(w);
                objArr[llIIIII[3]] = a2;
                objArr[llIIIII[8]] = lIlllll[llIIIII[17]];
                Log.debug(str, objArr);
                this.y.a((EnumC0056e) null);
                this.y.b(a2);
                this.y.a(this.C, EnumC0056e.MELEE);
                "".length();
                if ((((251 ^ 134) ^ (219 ^ 187)) & (((30 ^ 18) ^ (210 ^ 195)) ^ (-" ".length()))) > 0) {
                    return;
                }
                return;
            case 4493:
                String str2 = lIlllll[llIIIII[18]];
                Object[] objArr2 = new Object[llIIIII[6]];
                objArr2[llIIIII[0]] = Integer.valueOf(this.C);
                objArr2[llIIIII[1]] = Integer.valueOf(this.y.z() + llIIIII[1]);
                objArr2[llIIIII[2]] = Integer.valueOf(w);
                objArr2[llIIIII[3]] = a2;
                objArr2[llIIIII[8]] = lIlllll[llIIIII[19]];
                Log.debug(str2, objArr2);
                this.y.b(EnumC0060i.LAVA);
                this.y.a(this.C, EnumC0056e.LAVA);
                "".length();
                if (((((61 + 143) - 113) + 65) ^ (((66 + 68) - 79) + 98)) <= 0) {
                    return;
                }
                return;
            case 4494:
                String str3 = lIlllll[llIIIII[20]];
                Object[] objArr3 = new Object[llIIIII[6]];
                objArr3[llIIIII[0]] = Integer.valueOf(this.C);
                objArr3[llIIIII[1]] = Integer.valueOf(this.y.z() + llIIIII[1]);
                objArr3[llIIIII[2]] = Integer.valueOf(w);
                objArr3[llIIIII[3]] = a2;
                objArr3[llIIIII[8]] = lIlllll[llIIIII[21]];
                Log.debug(str3, objArr3);
                this.y.b(EnumC0060i.GHOSTS);
                this.y.d(this.C);
                this.y.a(System.currentTimeMillis());
                this.y.a(this.C, EnumC0056e.GHOSTS);
                "".length();
                if (0 != 0) {
                    return;
                }
                return;
            case 4495:
                this.y = null;
                this.s.clear();
                "".length();
                if ("  ".length() < "  ".length()) {
                    return;
                }
                return;
            default:
                String str4 = lIlllll[llIIIII[22]];
                Object[] objArr4 = new Object[llIIIII[2]];
                objArr4[llIIIII[0]] = Integer.valueOf(this.C);
                objArr4[llIIIII[1]] = Integer.valueOf(animation);
                Log.debug(str4, objArr4);
                return;
        }
    }

    private static boolean llIIIlIIl(int i2) {
        return i2 != 0;
    }

    public void a(NPC npc) {
        this.y = new C0055d(npc);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean] */
    public boolean f() {
        int[] mapRegions = this.v.getMapRegions();
        int length = mapRegions.length;
        int i2 = llIIIII[0];
        while (llIIIIIIl(i2, length)) {
            int lllIlIllIllIIll = mapRegions[i2];
            if (llIIIlIIl(r.contains(Integer.valueOf(lllIlIllIllIIll)) ? 1 : 0)) {
                return llIIIII[1];
            }
            i2++;
            "".length();
            if ("   ".length() < "  ".length()) {
                return (true ^ true) & ((true ^ true) ^ true);
            }
        }
        return llIIIII[0];
    }

    private static void lIlllllll() {
        llIIIII = new int[47];
        llIIIII[0] = "  ".length() & ("  ".length() ^ (-" ".length()));
        llIIIII[1] = " ".length();
        llIIIII[2] = "  ".length();
        llIIIII[3] = "   ".length();
        llIIIII[4] = 105 ^ 40;
        llIIIII[5] = (-((-4892) & 16319)) & (-4353) & 16379;
        llIIIII[6] = 95 ^ 90;
        llIIIII[7] = 71 ^ 77;
        llIIIII[8] = (73 ^ 120) ^ (177 ^ 132);
        llIIIII[9] = 64 ^ 70;
        llIIIII[10] = (107 ^ 59) ^ (42 ^ 125);
        llIIIII[11] = (((199 + 142) - 197) + 57) ^ (((81 + 63) - (-37)) + 12);
        llIIIII[12] = 35 ^ 42;
        llIIIII[13] = 38 ^ 45;
        llIIIII[14] = (((88 + 20) - 38) + 83) ^ (((148 + 41) - 59) + 19);
        llIIIII[15] = 35 ^ 46;
        llIIIII[16] = (182 ^ 177) ^ (184 ^ 177);
        llIIIII[17] = 91 ^ 84;
        llIIIII[18] = 79 ^ 95;
        llIIIII[19] = 57 ^ 40;
        llIIIII[20] = 211 ^ 193;
        llIIIII[21] = (((81 + 89) - 23) + 37) ^ (((61 + 149) - 48) + 9);
        llIIIII[22] = (35 ^ 99) ^ (225 ^ 181);
        llIIIII[23] = 122 ^ 111;
        llIIIII[24] = 115 ^ 101;
        llIIIII[25] = (66 ^ 108) ^ (110 ^ 87);
        llIIIII[26] = (-" ".length()) & (-1) & Integer.MAX_VALUE;
        llIIIII[27] = (-10307) & 14799;
        llIIIII[28] = 191 ^ 167;
        llIIIII[29] = (-((-7011) & 31595)) & (-66) & 29135;
        llIIIII[30] = (-4131) & 5375;
        llIIIII[31] = (-3649) & 8143;
        llIIIII[32] = (-((-4391) & 23911)) & (-8217) & 32223;
        llIIIII[33] = -" ".length();
        llIIIII[34] = (-((-7387) & 31999)) & (-3) & 29103;
        llIIIII[35] = (-((-8801) & 27509)) & (-523) & 20478;
        llIIIII[36] = (-24581) & 29071;
        llIIIII[37] = (63 ^ 37) ^ (60 ^ 66);
        llIIIII[38] = (-34) & 4523;
        llIIIII[39] = (((100 + 181) - 112) + 55) ^ (((108 + 57) - 49) + 78);
        llIIIII[40] = (-98) & 4591;
        llIIIII[41] = (-27169) & 28415;
        llIIIII[42] = (-((-17754) & 22367)) & (-18433) & 24287;
        llIIIII[43] = (-((-17267) & 28543)) & (-193) & 16351;
        llIIIII[44] = (-18602) & 23741;
        llIIIII[45] = (-((-1961) & 26541)) & (-2753) & 32727;
        llIIIII[46] = (15 ^ 0) ^ (88 ^ 78);
    }

    public EnumC0060i m() {
        return this.A;
    }

    private static boolean llIIIlIlI(Object obj, Object obj2) {
        return obj == obj2;
    }

    public void a(Prayer prayer) {
        this.x = prayer;
    }

    static {
        lIlllllll();
        lIllllllI();
        d = llIIIII[29];
        m = llIIIII[30];
        k = llIIIII[31];
        e = llIIIII[32];
        c = llIIIII[33];
        q = llIIIII[17];
        f = llIIIII[34];
        p = llIIIII[35];
        h = llIIIII[36];
        o = llIIIII[37];
        g = llIIIII[38];
        n = llIIIII[39];
        j = llIIIII[40];
        b = llIIIII[41];
        l = llIIIII[42];
        f1i = llIIIII[27];
        a = LoggerFactory.getLogger(C0000a.class);
        r = Set.of(Integer.valueOf(llIIIII[43]), Integer.valueOf(llIIIII[44]), Integer.valueOf(llIIIII[45]));
    }

    private static boolean llIIIIlll(Object obj, Object obj2) {
        return obj != obj2;
    }

    public List<C0057f> i() {
        return this.t;
    }

    public List<NPC> h() {
        return this.s;
    }

    public void a() {
        this.x = Prayer.PROTECT_FROM_MAGIC;
        a((EnumC0060i) null);
        a(llIIIII[0]);
        this.y = null;
        this.C = llIIIII[0];
        this.D = llIIIII[0];
        this.s.clear();
        this.t.clear();
        this.u.clear();
    }

    private static void lIllllllI() {
        lIlllll = new String[llIIIII[46]];
        lIlllll[llIIIII[0]] = lIllllIll("7i+eFVearu10a4GO5l4OwLFw+975Nz+P6rKxQKOxnGs=", "gtXxo");
        lIlllll[llIIIII[1]] = lIllllIll("LO9naEgfYF/LmK0eNieiXJRgsbEufMvFcaJajqaNtyTV/8YwyhUfBQ==", "KJHgi");
        lIlllll[llIIIII[2]] = lIllllIll("1oTj4PGHcLYTGbQ+Y4ptoQ==", "pgYmP");
        lIlllll[llIIIII[3]] = lIlllllII("XpdpEGRoBSmTKbnbtAuLFduOnkGO8H+PpN6Uhu25oyFNgyPE7RDyn67KwtbcWTdM", "Yjdln");
        lIlllll[llIIIII[8]] = lIllllIll("J0VpteAfXUltzVLIDGnJaKcHOk0LIMv0rSeqtfQBY8pvkjsh6BBYvKTjBIyWZhbq4+8R+E5Jj/0zfApdmuNiBZ4PZVjv/X1a", "kHRNl");
        lIlllll[llIIIII[6]] = lIllllIll("jSp/Gde/FTc=", "MNGgD");
        lIlllll[llIIIII[9]] = lIlllllIl("MCorHw0+KC1HIipnZhstIyolEWQsNmpaOjI5JDIpajA7VnkyMzYfOiMuIjstIyolEWQsNmpaOjI5JCorOCEjGS0+JyNHIio=", "WKFzY");
        lIlllll[llIIIII[10]] = lIlllllII("br9OncRNhIU=", "BNDhJ");
        lIlllll[llIIIII[11]] = lIlllllIl("FAYBCRcaBAdROA5LTA03BwYPB34IGkBMIBYVDiQzThwRQGMWHxwJIAcCCC03BwYPB34IGkBMJBsIHxgTAQgGCSAHDgAJfgga", "sgllC");
        lIlllll[llIIIII[12]] = lIlllllIl("JQweAiYz", "wMPEc");
        lIlllll[llIIIII[7]] = lIlllllII("Q/0H3wBOXrih71yggCjGhRjDtStYB69PaZB20yW/yEhjF/STeKukOGgCC2CqTKd4UmfNCXNigaiNDHSxZLPjmcfSnlDAjGDpDiaZx3ksASU=", "QajRL");
        lIlllll[llIIIII[13]] = lIlllllIl("GhIrAwY=", "WSlJE");
        lIlllll[llIIIII[14]] = lIllllIll("sG5Rnvl+VFLb/PurRt7onfYTsYuDkPPrKfbFN87Xdw5rcGfPn4Gh063NU5CUdQ3q4A+pvxxhB5/IEp1LOm6QwSW2vsUvjX2Uk6hvEd5bKYE=", "UaudK");
        lIlllll[llIIIII[15]] = lIlllllII("oQa25mthpKw=", "FyEjs");
        lIlllll[llIIIII[16]] = lIlllllII("dasUdeg4gyxzkqcbv2tHPZ8gPWwUHnlelST5n8P7nUPN89U3MfPVLaAFeSjkhs+W8MpgFqCm/GuL1O6lujzd19tkb6FqoWEI", "PhaRF");
        lIlllll[llIIIII[17]] = lIlllllIl("HjUnFxw=", "SpkRY");
        lIlllll[llIIIII[18]] = lIlllllII("P5n6r8HGj3vDzCvKGseUztCHqqDxr9YdYhMkZ/jKZfG8aqKXL2wKM2CeumLnf3QnRIphpNVpSMp0coVku8XvPDN1EU0jX6DZ", "zEDVV");
        lIlllll[llIIIII[19]] = lIlllllIl("BDEjEg==", "HpuSX");
        lIlllll[llIIIII[20]] = lIlllllII("VIHabj6ud2Drg1iRwD0Ah9UxUiflfy4YRU4rbAsPscffxszgHGo8IgEXr85ASrqMnV13Lk27CaxUQTXLRPy9W5H8SQYNhuhr", "FckUw");
        lIlllll[llIIIII[21]] = lIllllIll("jYgBv5jHpe0=", "WjAWB");
        lIlllll[llIIIII[22]] = lIlllllIl("NRs6FyQ7GTxPCy9WdxMeOxc2Bhk9FB4WTSkHd1olHDEZPSccUw==", "RzWrp");
        lIlllll[llIIIII[23]] = lIlllllII("o5twYzbL5DMkMO0z6+l0Lw==", "RjyKS");
        lIlllll[llIIIII[24]] = lIlllllII("PZT+4quvjqjbVCT34jtbAjndBXahDiWDG640pDz+ZEk=", "FkYJV");
        lIlllll[llIIIII[25]] = lIlllllII("gEL47XsukJGwORQp3l6hiQ==", "qpory");
        lIlllll[llIIIII[28]] = lIllllIll("BZgF/FBP2oTTN6Ce7TZ39g==", "dHimo");
    }

    public void a(boolean z) {
        this.z = z;
    }

    public int o() {
        return this.C;
    }

    private static boolean llIIIIlIl(int i2, int i3) {
        return i2 == i3;
    }

    @Subscribe
    private void a(NpcSpawned npcSpawned) {
        NPC npc = npcSpawned.getNpc();
        if (llIIIIIII(this.y) && llIIIlIII(npc) && llIIIlIII(npc.getName()) && llIIIlIIl(npc.getName().toLowerCase().contains(lIlllll[llIIIII[23]]) ? 1 : 0)) {
            String str = lIlllll[llIIIII[24]];
            Object[] objArr = new Object[llIIIII[2]];
            objArr[llIIIII[0]] = npc.getName();
            objArr[llIIIII[1]] = Integer.valueOf(npc.getId());
            Log.debug(str, objArr);
            this.y = new C0055d(npc);
            this.C = llIIIII[0];
            this.D = llIIIII[0];
            this.t.clear();
            this.u.clear();
        }
        if (llIIIIIII(npc)) {
            return;
        }
        EnumC0058g b2 = EnumC0058g.b(npc);
        if (llIIIlIII(b2)) {
            System.out.println("Spawned a " + b2);
            this.s.add(npc);
            "".length();
            a(this.C);
        }
    }
}
