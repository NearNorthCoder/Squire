package m.e.i.q.u.r.p000.n.s.e.r.i;

import com.google.common.collect.ImmutableSet;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.ChatMessageType;
import net.runelite.api.Client;
import net.runelite.api.InventoryID;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.runelite.api.events.AnimationChanged;
import net.runelite.api.events.ChatMessage;
import net.runelite.api.events.ItemContainerChanged;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Inventory;
@Singleton
/* renamed from: m.e.i.q.u.r.-.n.s.e.r.i.T  reason: invalid package */
/* loaded from: 3f45ab50-7de6-493f-a8bc-b432dabdf252.jar:m/e/i/q/u/r/-/n/s/e/r/i/T.class */
public class T {
    private final /* synthetic */ Client aA;
    private static final /* synthetic */ int aw;
    public static final /* synthetic */ Set<Integer> av;
    private static final /* synthetic */ int ay;
    private static final /* synthetic */ int ax;
    private /* synthetic */ boolean aD;
    private static /* synthetic */ String[] lllllIllIlII;
    private static /* synthetic */ int[] lllllIllIlIl;
    private /* synthetic */ int aB;
    private /* synthetic */ int aC;
    private static final /* synthetic */ Set<Integer> az;

    private static void lIIlIIlllIlIlII() {
        lllllIllIlII = new String[lllllIllIlIl[23]];
        lllllIllIlII[lllllIllIlIl[0]] = lIIlIIlllIlIIlI("UFV8hjCUVokyE+xQjGpfsyGfO5PX9C+Z", "SBHmL");
        lllllIllIlII[lllllIllIlIl[1]] = lIIlIIlllIlIIll("FOFhQh4K84RJxNnA6qUsiA==", "qAeql");
    }

    private static boolean lIIlIIlllIllIll(int i, int i2) {
        return i > i2;
    }

    @Subscribe
    public void a(AnimationChanged animationChanged) {
        Player actor = animationChanged.getActor();
        if (lIIlIIlllIllIIl(actor instanceof NPC ? 1 : 0)) {
            return;
        }
        Player player = actor;
        if (lIIlIIlllIllllI(player, this.aA.getLocalPlayer()) && lIIlIIlllIlIllI(player.getAnimation(), lllllIllIlIl[7])) {
            this.aB = this.aC;
            this.aC = lllllIllIlIl[0];
            this.aD = G();
        }
    }

    private static boolean lIIlIIlllIllIIl(int i) {
        return i != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    public boolean G() {
        if (lIIlIIlllIllIII(D(), H())) {
            ?? r0 = lllllIllIlIl[1];
            "".length();
            return " ".length() <= 0 ? ((((52 + 168) - 152) + 175) ^ (((53 + 144) - 102) + 80)) & (((56 ^ 61) ^ (234 ^ 179)) ^ (-" ".length())) : r0;
        }
        return lllllIllIlIl[0];
    }

    public void a(boolean z) {
        this.aD = z;
    }

    private static boolean lIIlIIlllIlllII(int i, int i2) {
        return i < i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    public boolean J() {
        if (lIIlIIlllIllIlI(M())) {
            return lllllIllIlIl[0];
        }
        if (lIIlIIlllIllIIl(Inventory.isFull() ? 1 : 0)) {
            int[] iArr = new int[lllllIllIlIl[1]];
            iArr[lllllIllIlIl[0]] = lllllIllIlIl[2];
            if (lIIlIIlllIllIIl(Inventory.contains(iArr) ? 1 : 0)) {
                return lllllIllIlIl[1];
            }
        }
        if (lIIlIIlllIllIll(M(), lllllIllIlIl[1]) && lIIlIIlllIllIIl(Inventory.isFull() ? 1 : 0)) {
            ?? r0 = lllllIllIlIl[1];
            "".length();
            return (-"   ".length()) > 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lllllIllIlIl[0];
    }

    public boolean O() {
        return this.aD;
    }

    public int N() {
        return this.aC;
    }

    private static boolean lIIlIIlllIlllIl(int i, int i2) {
        return i != i2;
    }

    private static String lIIlIIlllIlIIlI(String lllllllllllllllIIlIIlIIlIIllIIll, String lllllllllllllllIIlIIlIIlIIllIIlI) {
        try {
            SecretKeySpec lllllllllllllllIIlIIlIIlIIllIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIIlIIlIIllIIlI.getBytes(StandardCharsets.UTF_8)), lllllIllIlIl[25]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lllllIllIlIl[23], lllllllllllllllIIlIIlIIlIIllIllI);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIIlIIlIIllIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIIlIIlIIllIlII) {
            lllllllllllllllIIlIIlIIlIIllIlII.printStackTrace();
            return null;
        }
    }

    private static void lIIlIIlllIlIlIl() {
        lllllIllIlIl = new int[26];
        lllllIllIlIl[0] = (101 ^ 52) & ((68 ^ 21) ^ (-1));
        lllllIllIlIl[1] = " ".length();
        lllllIllIlIl[2] = (-((-25969) & 30065)) & (-261) & 16367;
        lllllIllIlIl[3] = (-((-20743) & 31047)) & (-16386) & 32245;
        lllllIllIlIl[4] = (-18954) & 24511;
        lllllIllIlIl[5] = (((47 ^ 55) + (73 ^ 0)) - "   ".length()) + (90 ^ 5);
        lllllIllIlIl[6] = 85 ^ 57;
        lllllIllIlIl[7] = (-22562) & 23393;
        lllllIllIlIl[8] = (-4129) & 4579;
        lllllIllIlIl[9] = (-2073) & 2521;
        lllllIllIlIl[10] = (-22593) & 23039;
        lllllIllIlIl[11] = (-((-16609) & 23777)) & (-514) & 8125;
        lllllIllIlIl[12] = (-((-217) & 31481)) & (-1035) & 32751;
        lllllIllIlIl[13] = (-4097) & 16108;
        lllllIllIlIl[14] = (-513) & 15191;
        lllllIllIlIl[15] = (-((-6659) & 24199)) & (-35) & 32254;
        lllllIllIlIl[16] = (-16391) & 31071;
        lllllIllIlIl[17] = (-17545) & 32479;
        lllllIllIlIl[18] = (-1192) & 16127;
        lllllIllIlIl[19] = (-387) & 15323;
        lllllIllIlIl[20] = "   ".length();
        lllllIllIlIl[21] = (-((-7513) & 24057)) & (-1) & 31735;
        lllllIllIlIl[22] = (-((-2648) & 20095)) & (-129) & 32767;
        lllllIllIlIl[23] = "  ".length();
        lllllIllIlIl[24] = (-17447) & 32639;
        lllllIllIlIl[25] = 131 ^ 139;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    public boolean B() {
        if (lIIlIIlllIlIllI(Vars.getBit(lllllIllIlIl[3]), lllllIllIlIl[1])) {
            ?? r0 = lllllIllIlIl[1];
            "".length();
            return ((6 ^ 86) & ((197 ^ 149) ^ (-1))) <= (-" ".length()) ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lllllIllIlIl[0];
    }

    public int C() {
        return Vars.getBit(lllllIllIlIl[4]);
    }

    static {
        lIIlIIlllIlIlIl();
        lIIlIIlllIlIlII();
        aw = lllllIllIlIl[7];
        ay = lllllIllIlIl[6];
        ax = lllllIllIlIl[5];
        av = ImmutableSet.of(Integer.valueOf(lllllIllIlIl[8]), Integer.valueOf(lllllIllIlIl[9]), Integer.valueOf(lllllIllIlIl[10]), Integer.valueOf(lllllIllIlIl[11]), Integer.valueOf(lllllIllIlIl[12]), Integer.valueOf(lllllIllIlIl[13]), new Integer[lllllIllIlIl[0]]);
        Integer valueOf = Integer.valueOf(lllllIllIlIl[14]);
        Integer valueOf2 = Integer.valueOf(lllllIllIlIl[15]);
        Integer valueOf3 = Integer.valueOf(lllllIllIlIl[16]);
        Integer valueOf4 = Integer.valueOf(lllllIllIlIl[17]);
        Integer valueOf5 = Integer.valueOf(lllllIllIlIl[18]);
        Integer valueOf6 = Integer.valueOf(lllllIllIlIl[19]);
        Integer[] numArr = new Integer[lllllIllIlIl[20]];
        numArr[lllllIllIlIl[0]] = Integer.valueOf(lllllIllIlIl[21]);
        numArr[lllllIllIlIl[1]] = Integer.valueOf(lllllIllIlIl[22]);
        numArr[lllllIllIlIl[23]] = Integer.valueOf(lllllIllIlIl[24]);
        az = ImmutableSet.of(valueOf, valueOf2, valueOf3, valueOf4, valueOf5, valueOf6, numArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v18, types: [boolean] */
    public boolean K() {
        int[] mapRegions = this.aA.getMapRegions();
        int length = mapRegions.length;
        int lllllllllllllllIIlIIlIIlIllIIlIl = lllllIllIlIl[0];
        while (lIIlIIlllIlllII(lllllllllllllllIIlIIlIIlIllIIlIl, length)) {
            if (lIIlIIlllIllIlI(az.contains(Integer.valueOf(mapRegions[lllllllllllllllIIlIIlIIlIllIIlIl])) ? 1 : 0)) {
                return lllllIllIlIl[0];
            }
            lllllllllllllllIIlIIlIIlIllIIlIl++;
            "".length();
            if (((36 ^ 88) ^ (207 ^ 183)) < (((87 ^ 64) ^ (91 ^ 105)) & (((19 ^ 112) ^ (116 ^ 50)) ^ (-" ".length())))) {
                return ((((183 + 103) - 182) + 121) ^ (((80 + 109) - 43) + 33)) & (((((23 + 162) - (-14)) + 5) ^ (((31 + 92) - (-18)) + 17)) ^ (-" ".length()));
            }
        }
        return lllllIllIlIl[1];
    }

    public void A() {
        this.aB = lllllIllIlIl[0];
        int[] iArr = new int[lllllIllIlIl[1]];
        iArr[lllllIllIlIl[0]] = lllllIllIlIl[2];
        this.aC = Inventory.getCount(iArr);
        this.aD = G();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v20, types: [boolean] */
    public boolean I() {
        int[] iArr = new int[lllllIllIlIl[1]];
        iArr[lllllIllIlIl[0]] = lllllIllIlIl[2];
        if (lIIlIIlllIllIlI(Inventory.contains(iArr) ? 1 : 0)) {
            return lllllIllIlIl[0];
        }
        int[] iArr2 = new int[lllllIllIlIl[1]];
        iArr2[lllllIllIlIl[0]] = lllllIllIlIl[2];
        if ((!lIIlIIlllIllIIl(Inventory.contains(iArr2) ? 1 : 0) || lIIlIIlllIllIlI(Inventory.isFull() ? 1 : 0)) && !lIIlIIlllIllIII(D(), H())) {
            return lllllIllIlIl[0];
        }
        ?? r0 = lllllIllIlIl[1];
        "".length();
        return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
    }

    public int H() {
        if (lIIlIIlllIllIIl(B() ? 1 : 0)) {
            int i = lllllIllIlIl[5];
            "".length();
            return (((((46 + 49) - (-35)) + 0) ^ (((102 + 116) - 156) + 93)) & (((42 ^ 8) ^ (31 ^ 36)) ^ (-" ".length()))) != 0 ? ((((99 + 1) - 5) + 72) ^ (((103 + 118) - 193) + 169)) & (((((58 + 129) - (-29)) + 35) ^ (((0 + 30) - (-1)) + 122)) ^ (-" ".length())) : i;
        }
        return lllllIllIlIl[6];
    }

    @Inject
    public T(Client client) {
        this.aA = client;
    }

    public int M() {
        return this.aB;
    }

    public int D() {
        return C() + N() + M();
    }

    @Subscribe
    public void a(ItemContainerChanged itemContainerChanged) {
        if (lIIlIIlllIlllIl(itemContainerChanged.getContainerId(), InventoryID.INVENTORY.getId())) {
            return;
        }
        int[] iArr = new int[lllllIllIlIl[1]];
        iArr[lllllIllIlIl[0]] = lllllIllIlIl[2];
        this.aC = Inventory.getCount(iArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    public boolean L() {
        if (lIIlIIlllIllIlI(M())) {
            ?? r0 = lllllIllIlIl[1];
            "".length();
            return (((((71 + 106) - 72) + 31) ^ (((127 + 122) - 174) + 100)) & (((89 ^ 54) ^ (215 ^ 159)) ^ (-" ".length()))) < 0 ? ((((26 + 44) - (-6)) + 56) ^ (((57 + 7) - 31) + 104)) & (((155 ^ 139) ^ (159 ^ 130)) ^ (-" ".length())) : r0;
        }
        return lllllIllIlIl[0];
    }

    @Subscribe
    public void b(ChatMessage chatMessage) {
        if (!lIIlIIlllIlllll(chatMessage.getType(), ChatMessageType.GAMEMESSAGE) && lIIlIIlllIllIIl(chatMessage.getMessage().contains(lllllIllIlII[lllllIllIlIl[0]]) ? 1 : 0)) {
            this.aB = lllllIllIlIl[0];
        }
    }

    public TileObject a(EnumC0003d enumC0003d) {
        return TileObjects.getNearest(tileObject -> {
            if (lIIlIIlllIllIIl(enumC0003d.f().contains(tileObject.getWorldLocation()) ? 1 : 0) && lIIlIIlllIllIIl(tileObject.getName().equals(lllllIllIlII[lllllIllIlIl[1]]) ? 1 : 0)) {
                ?? r0 = lllllIllIlIl[1];
                "".length();
                return (true ^ true) & ((true ^ true) ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return lllllIllIlIl[0];
        });
    }

    private static boolean lIIlIIlllIlIllI(int i, int i2) {
        return i == i2;
    }

    private static boolean lIIlIIlllIllIII(int i, int i2) {
        return i >= i2;
    }

    private static boolean lIIlIIlllIllllI(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static String lIIlIIlllIlIIll(String lllllllllllllllIIlIIlIIlIlIIIIII, String lllllllllllllllIIlIIlIIlIIllllll) {
        try {
            SecretKeySpec lllllllllllllllIIlIIlIIlIlIIIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIIlIIlIIllllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIlIIlIIlIlIIIIlI = Cipher.getInstance("Blowfish");
            lllllllllllllllIIlIIlIIlIlIIIIlI.init(lllllIllIlIl[23], lllllllllllllllIIlIIlIIlIlIIIIll);
            return new String(lllllllllllllllIIlIIlIIlIlIIIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIIlIIlIlIIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIIlIIlIlIIIIIl) {
            lllllllllllllllIIlIIlIIlIlIIIIIl.printStackTrace();
            return null;
        }
    }

    public int E() {
        return H() - D();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    public boolean F() {
        if (lIIlIIlllIlIlll(E())) {
            ?? r0 = lllllIllIlIl[1];
            "".length();
            return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lllllIllIlIl[0];
    }

    private static boolean lIIlIIlllIllIlI(int i) {
        return i == 0;
    }

    private static boolean lIIlIIlllIlIlll(int i) {
        return i < 0;
    }

    private static boolean lIIlIIlllIlllll(Object obj, Object obj2) {
        return obj != obj2;
    }
}
