package q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r;

import gg.squire.autotoa.TOAConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Comparator;
import java.util.concurrent.Executors;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.Point;
import net.runelite.api.TileItem;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.ChatMessage;
import net.runelite.client.config.ConfigStorageBox;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.Interactable;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.coords.RegionPoint;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Reachable;
/* renamed from: q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.ao  reason: invalid package and case insensitive filesystem */
/* loaded from: 581bf999-de0d-4fc5-a3b6-1ebe3d93b748.jar:q/-/t/a/o/u/i/-/o/u/t/e/s/a/r/ao.class */
public abstract class AbstractC0015ao extends Z {
    @Inject
    protected /* synthetic */ C0076y e;
    protected final /* synthetic */ TOAConfig cW;
    private /* synthetic */ int cX;
    protected final /* synthetic */ C0077z cV;
    private static /* synthetic */ String[] llIIlIIIIlI;
    protected static final /* synthetic */ int cU;
    private static /* synthetic */ int[] llIIlIIIIll;

    private static int lIlIIIIIIIIlll(double d, double d2) {
        return (d > d2 ? 1 : (d == d2 ? 0 : -1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v18, types: [boolean] */
    public boolean bn() {
        if (lIlIIIIIIIIIlI(this.cV.c(this.cV.a(this.cW.kephriGearSwap())) ? 1 : 0)) {
            return llIIlIIIIll[1];
        }
        if (lIlIIIIIIIIIlI(Inventory.isFull() ? 1 : 0)) {
            return llIIlIIIIll[0];
        }
        TileItem nearest = TileItems.getNearest(tileItem -> {
            if (lIlIIIIIIIIIlI(tileItem.isTradable() ? 1 : 0) && lIlIIIIIIIIIlI(Reachable.isInteractable(tileItem) ? 1 : 0) && lIlIIIIIIIIIll(tileItem.getName().equals(llIIlIIIIlI[llIIlIIIIll[7]]) ? 1 : 0)) {
                ?? r0 = llIIlIIIIll[1];
                "".length();
                return "  ".length() <= 0 ? ((95 ^ 19) ^ (82 ^ 74)) & (((103 ^ 97) ^ (100 ^ 54)) ^ (-" ".length())) : r0;
            }
            return llIIlIIIIll[0];
        });
        if (lIlIIIIIIIIlII(nearest)) {
            nearest.interact(llIIlIIIIlI[llIIlIIIIll[0]]);
            return llIIlIIIIll[1];
        }
        return llIIlIIIIll[0];
    }

    public WorldPoint d(RegionPoint regionPoint) {
        WorldPoint world = regionPoint.toWorld();
        return (WorldPoint) WorldPoint.toLocalInstance(this.cu, world).stream().min(Comparator.comparingInt(worldPoint -> {
            return worldPoint.distanceTo(new WorldPoint(this.cu.getBaseX(), this.cu.getBaseY(), this.cu.getPlane()));
        })).orElse(world);
    }

    public abstract ConfigStorageBox<EquipmentSetup> br();

    /* JADX INFO: Access modifiers changed from: protected */
    @Inject
    public AbstractC0015ao(Client client, C0077z c0077z, TOAConfig tOAConfig) {
        super(client);
        this.cV = c0077z;
        this.cW = tOAConfig;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    public boolean bq() {
        return llIIlIIIIll[0];
    }

    private static boolean lIlIIIIIIIlIll(int i, int i2) {
        return i > i2;
    }

    private static boolean lIlIIIIIIIIlII(Object obj) {
        return obj != null;
    }

    private static String lIIllllllllllI(String llllllllllllllllIlIIIIIllIIIlIll, String llllllllllllllllIlIIIIIllIIIlIlI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIlIIIIIllIIIlIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llIIlIIIIll[6], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllIlIIIIIllIIIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIlIIIIIllIIIllII) {
            llllllllllllllllIlIIIIIllIIIllII.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    public boolean bm() {
        return llIIlIIIIll[0];
    }

    @Subscribe
    public void a(ChatMessage chatMessage) {
        if (lIlIIIIIIIIIlI(chatMessage.getMessage().contains(llIIlIIIIlI[llIIlIIIIll[1]]) ? 1 : 0)) {
            r();
        }
        if (lIlIIIIIIIIIlI(chatMessage.getMessage().contains(llIIlIIIIlI[llIIlIIIIll[6]]) ? 1 : 0)) {
            r();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v11, types: [boolean] */
    public boolean a(NPC npc, boolean z) {
        int i;
        int i2;
        int[] iArr = new int[llIIlIIIIll[1]];
        iArr[llIIlIIIIll[0]] = llIIlIIIIll[2];
        if (!lIlIIIIIIIIIlI(Inventory.contains(iArr) ? 1 : 0) || lIlIIIIIIIIlIl(Combat.getMissingHealth(), llIIlIIIIll[3])) {
            i = llIIlIIIIll[1];
            "".length();
            if (" ".length() != " ".length()) {
                return (true ^ true) & ((true ^ true) ^ true);
            }
        } else {
            i = llIIlIIIIll[0];
        }
        if (!lIlIIIIIIIIIlI(i)) {
            e((boolean) llIIlIIIIll[0]);
            "".length();
            return llIIlIIIIll[0];
        }
        if (lIlIIIIIIIIIlI(z ? 1 : 0) && lIlIIIIIIIIIlI(f(npc) ? 1 : 0)) {
            i2 = llIIlIIIIll[1];
            "".length();
            if ("   ".length() <= (((((167 + 108) - 111) + 34) ^ (((97 + 114) - 105) + 30)) & (((((137 + 26) - 10) + 56) ^ (((157 + 97) - 97) + 2)) ^ (-" ".length())))) {
                return ((((166 + 4) - 25) + 79) ^ (((132 + 6) - 33) + 72)) & (((((12 + 92) - (-54)) + 58) ^ (((65 + 107) - 155) + 120)) ^ (-" ".length()));
            }
        } else {
            i2 = llIIlIIIIll[0];
        }
        return e((boolean) i2);
    }

    private static void lIlIIIIIIIIIII() {
        llIIlIIIIlI = new String[llIIlIIIIll[9]];
        llIIlIIIIlI[llIIlIIIIll[0]] = lIIlllllllllIl("WTex+RfbxBs=", "RpEuv");
        llIIlIIIIlI[llIIlIIIIll[1]] = lIIlllllllllIl("vgCXZmFPsCdfvdmyaj2w/dauTeNVGGxu", "GQuzP");
        llIIlIIIIlI[llIIlIIIIll[6]] = lIIllllllllllI("Nr5/DVDrLsnHxfE4EOOY5A==", "XLAwp");
        llIIlIIIIlI[llIIlIIIIll[7]] = lIIlllllllllll("DCoSGQ==", "ZCsuZ");
    }

    public WorldPoint a(Point point) {
        return c(new RegionPoint(point.getX(), point.getY(), this.cu.getPlane(), bi()));
    }

    static {
        lIlIIIIIIIIIIl();
        lIlIIIIIIIIIII();
        cU = llIIlIIIIll[8];
    }

    private static boolean lIlIIIIIIIlIlI(int i) {
        return i >= 0;
    }

    public abstract boolean bl();

    private static void lIlIIIIIIIIIIl() {
        llIIlIIIIll = new int[11];
        llIIlIIIIll[0] = ((214 ^ 132) ^ (173 ^ 166)) & (((((181 + 113) - 278) + 205) ^ (((87 + 80) - 42) + 7)) ^ (-" ".length()));
        llIIlIIIIll[1] = " ".length();
        llIIlIIIIll[2] = (-((-27541) & 32757)) & (-1) & 32507;
        llIIlIIIIll[3] = 11 ^ 35;
        llIIlIIIIll[4] = (-(31 ^ 94)) & (-16419) & 28286;
        llIIlIIIIll[5] = (-(245 ^ 191)) & (-33) & 20475;
        llIIlIIIIll[6] = "  ".length();
        llIIlIIIIll[7] = "   ".length();
        llIIlIIIIll[8] = (-645) & 30638;
        llIIlIIIIll[9] = 148 ^ 144;
        llIIlIIIIll[10] = 9 ^ 1;
    }

    private static boolean lIlIIIIIIIIIlI(int i) {
        return i != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [boolean] */
    public void bp() {
        e((boolean) llIIlIIIIll[1]);
        "".length();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    public boolean run() {
        if (!lIlIIIIIIIIIlI(j(bi()) ? 1 : 0) || lIlIIIIIIIIIll(aS() ? 1 : 0)) {
            r();
            return llIIlIIIIll[0];
        } else if (lIlIIIIIIIIIlI(bj() ? 1 : 0)) {
            return bn();
        } else {
            if (lIlIIIIIIIIIll(bk() ? 1 : 0)) {
                return bm();
            }
            if (lIlIIIIIIIIIlI(bo() ? 1 : 0)) {
                this.cV.c(this.cV.a(br()));
                "".length();
            }
            return bl();
        }
    }

    public abstract boolean bj();

    private static String lIIlllllllllIl(String llllllllllllllllIlIIIIIlIllllllI, String llllllllllllllllIlIIIIIlIlllllIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIlIIIIIlIlllllIl.getBytes(StandardCharsets.UTF_8)), llIIlIIIIll[10]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llIIlIIIIll[6], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllIlIIIIIlIllllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIlIIIIIlIlllllll) {
            llllllllllllllllIlIIIIIlIlllllll.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIIIIIIIllII(int i, int i2) {
        return i != i2;
    }

    private static String lIIlllllllllll(String llllllllllllllllIlIIIIIlIllIlllI, String llllllllllllllllIlIIIIIlIllIllIl) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllllIlIIIIIlIllIlllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = llllllllllllllllIlIIIIIlIllIllIl.toCharArray();
        int llllllllllllllllIlIIIIIlIllIlIlI = llIIlIIIIll[0];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = llIIlIIIIll[0];
        while (lIlIIIIIIIIlIl(i, length)) {
            char llllllllllllllllIlIIIIIlIllIllll = charArray2[i];
            sb.append((char) (llllllllllllllllIlIIIIIlIllIllll ^ charArray[llllllllllllllllIlIIIIIlIllIlIlI % charArray.length]));
            "".length();
            llllllllllllllllIlIIIIIlIllIlIlI++;
            i++;
            "".length();
            if (" ".length() < " ".length()) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    public void a(Interactable interactable, String str, int i) {
        Executors.newSingleThreadExecutor().submit(() -> {
            int i2 = llIIlIIIIll[0];
            while (lIlIIIIIIIIlIl(i2, i)) {
                interactable.interact(str);
                Time.sleep(25L);
                "".length();
                i2++;
                "".length();
                if ("  ".length() == 0) {
                    return;
                }
            }
        });
        "".length();
    }

    public int bt() {
        return llIIlIIIIll[1];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    public boolean e(int... iArr) {
        int length = iArr.length;
        int i = llIIlIIIIll[0];
        while (lIlIIIIIIIIlIl(i, length)) {
            if (lIlIIIIIIIIllI(aX(), iArr[i])) {
                return llIIlIIIIll[1];
            }
            i++;
            "".length();
            if (0 != 0) {
                return (true ^ true) & ((true ^ true) ^ true);
            }
        }
        return llIIlIIIIll[0];
    }

    private static int lIlIIIIIIIlIII(double d, double d2) {
        return (d > d2 ? 1 : (d == d2 ? 0 : -1));
    }

    private static boolean lIlIIIIIIIlIIl(Object obj) {
        return obj == null;
    }

    private static boolean lIlIIIIIIIIlIl(int i, int i2) {
        return i < i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v25, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v37, types: [boolean] */
    public boolean f(NPC npc) {
        if (lIlIIIIIIIlIIl(bs())) {
            return llIIlIIIIll[0];
        }
        int[] a = this.cV.a(bs());
        int llllllllllllllllIlIIIIIllIlIIIll = a.length;
        int i = llIIlIIIIll[0];
        while (lIlIIIIIIIIlIl(i, llllllllllllllllIlIIIIIllIlIIIll)) {
            int i2 = a[i];
            if (!lIlIIIIIIIllII(i2, llIIlIIIIll[4]) || lIlIIIIIIIIllI(i2, llIIlIIIIll[5])) {
                if (lIlIIIIIIIIlIl(this.e.b(npc), bt())) {
                    ?? r0 = llIIlIIIIll[1];
                    "".length();
                    return (true ^ true) & ((true ^ true) ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
                return llIIlIIIIll[0];
            }
            i++;
            "".length();
            if ("   ".length() < ("   ".length() & ("   ".length() ^ (-" ".length())))) {
                return ((19 ^ 122) ^ (168 ^ 160)) & (((121 ^ 60) ^ (65 ^ 101)) ^ (-" ".length()));
            }
        }
        return llIIlIIIIll[1];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    public boolean bo() {
        return llIIlIIIIll[0];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    protected boolean aS() {
        return llIIlIIIIll[1];
    }

    private static boolean lIlIIIIIIIIIll(int i) {
        return i == 0;
    }

    public abstract boolean bk();

    public ConfigStorageBox<EquipmentSetup> bs() {
        return null;
    }

    public void r() {
    }

    public abstract int bi();

    private static boolean lIlIIIIIIIIllI(int i, int i2) {
        return i == i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v38, types: [boolean] */
    public boolean e(boolean z) {
        int[] a;
        double b;
        if (lIlIIIIIIIlIIl(bs())) {
            a = null;
            "".length();
            if (0 != 0) {
                return ((((69 + 1) - (-29)) + 57) ^ (((76 + 13) - (-26)) + 20)) & (((((58 + 42) - 58) + 147) ^ (((81 + 72) - 146) + 159)) ^ (-" ".length()));
            }
        } else {
            a = this.cV.a(bs());
        }
        int[] iArr = a;
        if (lIlIIIIIIIlIIl(iArr)) {
            b = 500.0d;
            "".length();
            if ((-" ".length()) >= ((82 ^ 51) & ((54 ^ 87) ^ (-1)))) {
                return (true ^ true) & ((true ^ true) ^ true);
            }
        } else {
            b = EnumC0055d.b(iArr);
        }
        double d = b;
        if (lIlIIIIIIIIIlI(aZ() ? 1 : 0)) {
            d /= 2.0d;
        }
        if (!lIlIIIIIIIlIlI(lIlIIIIIIIIlll(Combat.getSpecEnergy(), d)) || !lIlIIIIIIIIIlI(z ? 1 : 0) || !lIlIIIIIIIIlII(iArr) || lIlIIIIIIIIIlI(bq() ? 1 : 0)) {
            this.cV.c(this.cV.a(br()));
            "".length();
            return llIIlIIIIll[0];
        }
        this.cV.c(iArr);
        "".length();
        if (lIlIIIIIIIIIll(Combat.isSpecEnabled() ? 1 : 0) && lIlIIIIIIIlIlI(lIlIIIIIIIlIII(Combat.getSpecEnergy(), d)) && lIlIIIIIIIlIll(this.cu.getTickCount() - this.cX, llIIlIIIIll[1])) {
            Combat.toggleSpec();
            this.cX = this.cu.getTickCount();
        }
        return llIIlIIIIll[1];
    }
}
