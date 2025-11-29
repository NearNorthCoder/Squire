package gg.squire.fishing;

import com.google.inject.Provides;
import gg.squire.api.InventorySetup;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.fishing.overlay.FishingInfoBox;
import i.i.p000.h.u.s.e.r.q.r.s.f.e.a;
import i.i.p000.h.u.s.e.r.q.r.s.f.e.b;
import i.i.p000.h.u.s.e.r.q.r.s.f.e.c;
import i.i.p000.h.u.s.e.r.q.r.s.f.e.d;
import i.i.p000.h.u.s.e.r.q.r.s.f.e.e;
import i.i.p000.h.u.s.e.r.q.r.s.f.e.g;
import i.i.p000.h.u.s.e.r.q.r.s.f.e.h;
import i.i.p000.h.u.s.e.r.q.r.s.f.e.i;
import i.i.p000.h.u.s.e.r.q.r.s.f.e.j;
import i.i.p000.h.u.s.e.r.q.r.s.f.e.k;
import i.i.p000.h.u.s.e.r.q.r.s.f.e.l;
import i.i.p000.h.u.s.e.r.q.r.s.f.e.m;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.time.Instant;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Item;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.events.ChatMessage;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.events.ConfigChanged;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.OverlayManager;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import org.pf4j.Extension;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@Extension
@PluginDescriptor(name = "Squire Fishing")
/* loaded from: squire-fisher-0.1.0.jar:gg/squire/fishing/SquireFisherPlugin.class */
public class SquireFisherPlugin extends SquirePlugin {
    @Inject

    /* renamed from: i  reason: collision with root package name */
    private /* synthetic */ OverlayManager f0i;
    private /* synthetic */ InventorySetup n;
    public static /* synthetic */ int c;
    public static /* synthetic */ int d;
    private /* synthetic */ Instant k;
    private static /* synthetic */ int e;
    private static /* synthetic */ int[] lIlllIllIIll;
    private static /* synthetic */ long f;
    public static /* synthetic */ int b;
    private static /* synthetic */ String[] lIlllIllIIlI;
    @Inject
    private /* synthetic */ FishingInfoBox j;
    private static final /* synthetic */ Logger a;
    private /* synthetic */ WorldArea m;
    @Inject
    private /* synthetic */ SquireFisherConfig h;
    private /* synthetic */ boolean l;
    private final /* synthetic */ List<Integer> g = List.of(Integer.valueOf(lIlllIllIIll[0]), Integer.valueOf(lIlllIllIIll[1]), Integer.valueOf(lIlllIllIIll[2]), Integer.valueOf(lIlllIllIIll[3]));

    @Provides
    SquireFisherConfig a(ConfigManager configManager) {
        return (SquireFisherConfig) configManager.getConfig(SquireFisherConfig.class);
    }

    public boolean e() {
        return this.l;
    }

    private static String lllIlIlllIlIIl(String lllllllllllllllIlIlllIlIIlllllII, String lllllllllllllllIlIlllIlIIllllIll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlllIlIIllllIll.getBytes(StandardCharsets.UTF_8)), lIlllIllIIll[13]), "DES");
            Cipher lllllllllllllllIlIlllIlIIllllllI = Cipher.getInstance("DES");
            lllllllllllllllIlIlllIlIIllllllI.init(lIlllIllIIll[7], secretKeySpec);
            return new String(lllllllllllllllIlIlllIlIIllllllI.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlllIlIIlllllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIlllIlIIlllllIl) {
            lllllllllllllllIlIlllIlIIlllllIl.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v30, types: [boolean] */
    @Subscribe
    public void a(ChatMessage chatMessage) {
        String message = chatMessage.getMessage();
        if (lllIlIlllIllIl(message.contains(lIlllIllIIlI[lIlllIllIIll[5]]) ? 1 : 0)) {
            c += lIlllIllIIll[6];
            this.l = lIlllIllIIll[6];
        }
        if (lllIlIlllIllIl(message.contains(lIlllIllIIlI[lIlllIllIIll[6]]) ? 1 : 0)) {
            b += lIlllIllIIll[6];
        }
        if (lllIlIlllIllIl(message.contains(lIlllIllIIlI[lIlllIllIIll[7]]) ? 1 : 0)) {
            if (!lllIlIlllIllIl(this.h.fish().h().equals(lIlllIllIIlI[lIlllIllIIll[8]]) ? 1 : 0) || !lllIlIlllIllIl(message.contains(lIlllIllIIlI[lIlllIllIIll[9]]) ? 1 : 0)) {
                if (lllIlIlllIllIl(message.contains(lIlllIllIIlI[lIlllIllIIll[10]]) ? 1 : 0)) {
                    d += lIlllIllIIll[6];
                    return;
                }
                return;
            }
            int[] iArr = new int[lIlllIllIIll[10]];
            iArr[lIlllIllIIll[5]] = lIlllIllIIll[21];
            iArr[lIlllIllIIll[6]] = lIlllIllIIll[22];
            iArr[lIlllIllIIll[7]] = lIlllIllIIll[23];
            iArr[lIlllIllIIll[8]] = lIlllIllIIll[24];
            iArr[lIlllIllIIll[9]] = lIlllIllIIll[25];
            if (lllIlIlllIllIl(Equipment.contains(iArr) ? 1 : 0)) {
                d += lIlllIllIIll[26];
                "".length();
                if ((-" ".length()) != (-" ".length())) {
                }
            }
        }
    }

    public static long c() {
        return f;
    }

    private static boolean lllIlIlllIlllI(int i2) {
        return i2 == 0;
    }

    public void a(WorldArea worldArea) {
        this.m = worldArea;
    }

    public void a(InventorySetup inventorySetup) {
        this.n = inventorySetup;
    }

    private static String lllIlIlllIlIII(String lllllllllllllllIlIlllIlIlIIIlIIl, String lllllllllllllllIlIlllIlIlIIIlIII) {
        try {
            SecretKeySpec lllllllllllllllIlIlllIlIlIIIllII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlllIlIlIIIlIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIlllIllIIll[7], lllllllllllllllIlIlllIlIlIIIllII);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlllIlIlIIIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIlllIlIlIIIlIlI) {
            lllllllllllllllIlIlllIlIlIIIlIlI.printStackTrace();
            return null;
        }
    }

    private static void lllIlIlllIlIlI() {
        lIlllIllIIlI = new String[lIlllIllIIll[13]];
        lIlllIllIIlI[lIlllIllIIll[5]] = lllIlIlllIIlll("JSckIlcuKTwzBSQkJzMSKWY3KRg4ITo=", "MFRGw");
        lIlllIllIIlI[lIlllIllIIll[6]] = lllIlIlllIIlll("CiMgLEoJMGMzAgN2MCIL", "fVCGj");
        lIlllIllIIlI[lIlllIllIIll[7]] = lllIlIlllIlIII("teuQtT3RzgU=", "DdHCs");
        lIlllIllIIlI[lIlllIllIIll[8]] = lllIlIlllIlIII("wbwSxl1Y7TkekGA1pPnFyA==", "fjegQ");
        lIlllIllIIlI[lIlllIllIIll[9]] = lllIlIlllIlIII("KUHbmufYxMoiqrTdyX7w2w==", "HQrMh");
        lIlllIllIIlI[lIlllIllIIll[10]] = lllIlIlllIlIII("S+qK4kF3fS8PUP0CTdmduw==", "QMWZJ");
        lIlllIllIIlI[lIlllIllIIll[11]] = lllIlIlllIlIIl("AcwELbfI4f42eRajU2eYdA==", "MPqcv");
        lIlllIllIIlI[lIlllIllIIll[12]] = lllIlIlllIlIII("YwTgNHw/PV8=", "XZmAR");
    }

    protected Class<?>[] tasks() {
        Class<?>[] clsArr = new Class[lIlllIllIIll[4]];
        clsArr[lIlllIllIIll[5]] = m.class;
        clsArr[lIlllIllIIll[6]] = j.class;
        clsArr[lIlllIllIIll[7]] = g.class;
        clsArr[lIlllIllIIll[8]] = i.class;
        clsArr[lIlllIllIIll[9]] = h.class;
        clsArr[lIlllIllIIll[10]] = l.class;
        clsArr[lIlllIllIIll[11]] = e.class;
        clsArr[lIlllIllIIll[12]] = a.class;
        clsArr[lIlllIllIIll[13]] = b.class;
        clsArr[lIlllIllIIll[14]] = c.class;
        clsArr[lIlllIllIIll[15]] = d.class;
        clsArr[lIlllIllIIll[16]] = k.class;
        return clsArr;
    }

    public Instant getStarted() {
        return this.k;
    }

    public static void a(int i2) {
        e = i2;
    }

    private void a() {
        if (lllIlIlllIllIl(g().matchesInventory() ? 1 : 0)) {
            return;
        }
        Item first = Inventory.getFirst(item -> {
            return item.getName().contains(lIlllIllIIlI[lIlllIllIIll[12]]);
        });
        Item first2 = Inventory.getFirst(item2 -> {
            return this.g.contains(Integer.valueOf(item2.getId()));
        });
        int[] iArr = new int[lIlllIllIIll[6]];
        iArr[lIlllIllIIll[5]] = lIlllIllIIll[17];
        Item first3 = Inventory.getFirst(iArr);
        if (lllIlIlllIlllI(Equipment.contains(this.h.fish().k()) ? 1 : 0)) {
            g().add(this.h.fish().k(), lIlllIllIIll[6]);
            "".length();
        }
        if (lllIlIlllIllII(this.h.fish().l())) {
            g().add(this.h.fish().l());
            "".length();
        }
        if (lllIlIlllIllII(first3)) {
            g().add(lIlllIllIIll[17]);
            "".length();
        }
        if (lllIlIlllIllII(first)) {
            g().add(first.getId(), lIlllIllIIll[6]);
            "".length();
            g().add(lIlllIllIIll[18], lIlllIllIIll[6]);
            "".length();
        }
        if (lllIlIlllIllII(first2)) {
            g().add(first2.getId(), lIlllIllIIll[6]);
            "".length();
            g().add(lIlllIllIIll[19], lIlllIllIIll[6]);
            "".length();
            g().add(lIlllIllIIll[20]);
            "".length();
        }
        if (lllIlIlllIllIl(this.h.fishBarrel() ? 1 : 0)) {
            g().add(item3 -> {
                return item3.getName().contains(lIlllIllIIlI[lIlllIllIIll[11]]);
            }, lIlllIllIIll[6]);
            "".length();
        }
    }

    private static void lllIlIlllIlIll() {
        lIlllIllIIll = new int[27];
        lIlllIllIIll[0] = (((((164 + 84) - 232) + 191) + (140 ^ 157)) - (199 ^ 140)) + (108 ^ 8);
        lIlllIllIIll[1] = ((80 + 34) - 74) + 211;
        lIlllIllIIll[2] = ((13 + 168) - (-39)) + 33;
        lIlllIllIIll[3] = ((61 + 54) - (-60)) + 80;
        lIlllIllIIll[4] = 89 ^ 85;
        lIlllIllIIll[5] = (144 ^ 155) & ((105 ^ 98) ^ (-1));
        lIlllIllIIll[6] = " ".length();
        lIlllIllIIll[7] = "  ".length();
        lIlllIllIIll[8] = "   ".length();
        lIlllIllIIll[9] = (119 ^ 53) ^ (249 ^ 191);
        lIlllIllIIll[10] = 93 ^ 88;
        lIlllIllIIll[11] = (8 ^ 23) ^ (94 ^ 71);
        lIlllIllIIll[12] = (231 ^ 139) ^ (84 ^ 63);
        lIlllIllIIll[13] = 126 ^ 118;
        lIlllIllIIll[14] = (24 ^ 8) ^ (11 ^ 18);
        lIlllIllIIll[15] = 98 ^ 104;
        lIlllIllIIll[16] = (((49 + 157) - 150) + 115) ^ (((3 + 79) - 11) + 89);
        lIlllIllIIll[17] = (-3) & 25590;
        lIlllIllIIll[18] = (-17409) & 23741;
        lIlllIllIIll[19] = ((0 + 7) - 2) + 228;
        lIlllIllIIll[20] = (-((-4145) & 30773)) & (-65) & 28631;
        lIlllIllIIll[21] = (-((-22923) & 32239)) & (-649) & 32767;
        lIlllIllIIll[22] = (-((-26005) & 26615)) & (-9217) & 32767;
        lIlllIllIIll[23] = (-9313) & 32255;
        lIlllIllIIll[24] = (-((-29441) & 30559)) & (-1) & 24063;
        lIlllIllIIll[25] = (-1117) & 24063;
        lIlllIllIIll[26] = (((93 + 4) - 24) + 99) ^ (((154 + 91) - 149) + 66);
    }

    private static boolean lllIlIlllIllIl(int i2) {
        return i2 != 0;
    }

    private static boolean lllIlIlllIllll(int i2, int i3) {
        return i2 < i3;
    }

    protected void onStop() {
        this.f0i.remove(this.j);
        "".length();
        e = lIlllIllIIll[5];
        d = lIlllIllIIll[5];
        a((WorldArea) null);
        a((InventorySetup) null);
    }

    public static int b() {
        return e;
    }

    private static String lllIlIlllIIlll(String lllllllllllllllIlIlllIlIlIIllllI, String lllllllllllllllIlIlllIlIlIIlllIl) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIlIlllIlIlIIllllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlIlllIlIlIIlllII = new StringBuilder();
        char[] charArray = lllllllllllllllIlIlllIlIlIIlllIl.toCharArray();
        int lllllllllllllllIlIlllIlIlIIllIlI = lIlllIllIIll[5];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i2 = lIlllIllIIll[5];
        while (lllIlIlllIllll(i2, length)) {
            char lllllllllllllllIlIlllIlIlIIlllll = charArray2[i2];
            lllllllllllllllIlIlllIlIlIIlllII.append((char) (lllllllllllllllIlIlllIlIlIIlllll ^ charArray[lllllllllllllllIlIlllIlIlIIllIlI % charArray.length]));
            "".length();
            lllllllllllllllIlIlllIlIlIIllIlI++;
            i2++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIlIlllIlIlIIlllII);
    }

    public SquireFisherConfig d() {
        return this.h;
    }

    public void a(boolean z) {
        this.l = z;
    }

    public InventorySetup g() {
        return this.n;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [boolean] */
    protected void onStart() {
        this.l = lIlllIllIIll[5];
        this.f0i.add(this.j);
        "".length();
        this.k = Instant.now();
        e = lIlllIllIIll[5];
        a(new InventorySetup());
        if (lllIlIlllIllII(Players.getLocal())) {
            a(Players.getLocal().getWorldArea());
            a();
        }
    }

    public WorldArea f() {
        return this.m;
    }

    @Subscribe
    public void a(ConfigChanged configChanged) {
        a(new InventorySetup());
        a();
    }

    private static boolean lllIlIlllIllII(Object obj) {
        return obj != null;
    }

    static {
        lllIlIlllIlIll();
        lllIlIlllIlIlI();
        a = LoggerFactory.getLogger(SquireFisherPlugin.class);
    }
}
