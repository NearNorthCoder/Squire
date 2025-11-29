package m.u.a.p000.e.s.q.t.i.r;

import gg.squire.mta.MagicArenaConfig;
import gg.squire.mta.SquireMTA;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import javax.inject.Singleton;
import net.runelite.api.Client;
import net.runelite.api.InventoryID;
import net.runelite.api.Item;
import net.runelite.api.ItemContainer;
import net.runelite.api.Player;
import net.runelite.api.events.GameTick;
import net.runelite.api.events.ItemContainerChanged;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.game.ItemManager;
import net.runelite.client.ui.overlay.infobox.InfoBoxManager;
@Singleton
/* renamed from: m.u.a.-.e.s.q.t.i.r.l  reason: invalid package */
/* loaded from: squire-mta-0.2.1.jar:m/u/a/-/e/s/q/t/i/r/l.class */
public class l extends b {
    private static final /* synthetic */ int S;
    private static /* synthetic */ String[] lllIlIlIlIlI;
    private final /* synthetic */ SquireMTA U;
    static final /* synthetic */ int R;
    private final /* synthetic */ Client T;
    private static /* synthetic */ int[] lllIlIlIlIll;
    private /* synthetic */ int Y;
    private final /* synthetic */ InfoBoxManager W;
    private final /* synthetic */ List<String> X;
    private final /* synthetic */ ItemManager V;
    private /* synthetic */ k Z;

    @Subscribe
    public void a(GameTick gameTick) {
        if (lIIIllIIIIlIlII(c() ? 1 : 0) && lIIIllIIIIlIIlI(this.Z)) {
            this.W.removeIf(infoBox -> {
                return infoBox instanceof k;
            });
            this.Z = null;
        }
    }

    private static boolean lIIIllIIIIlIlII(int i) {
        return i == 0;
    }

    @Inject
    private l(MagicArenaConfig magicArenaConfig, Client client, SquireMTA squireMTA, ItemManager itemManager, InfoBoxManager infoBoxManager) {
        super(magicArenaConfig);
        String[] strArr = new String[lllIlIlIlIll[0]];
        strArr[lllIlIlIlIll[1]] = lllIlIlIlIlI[lllIlIlIlIll[1]];
        strArr[lllIlIlIlIll[2]] = lllIlIlIlIlI[lllIlIlIlIll[2]];
        this.X = Arrays.asList(strArr);
        this.T = client;
        this.U = squireMTA;
        this.V = itemManager;
        this.W = infoBoxManager;
    }

    private int a(int i) {
        switch (i) {
            case 6904:
                return lllIlIlIlIll[2];
            case 6905:
                return lllIlIlIlIll[0];
            case 6906:
                return lllIlIlIlIll[5];
            case 6907:
                return lllIlIlIlIll[6];
            default:
                return lllIlIlIlIll[1];
        }
    }

    private static void lIIIllIIIIlIIIl() {
        lllIlIlIlIll = new int[8];
        lllIlIlIlIll[0] = "  ".length();
        lllIlIlIlIll[1] = (88 ^ 71) & ((55 ^ 40) ^ (-1));
        lllIlIlIlIll[2] = " ".length();
        lllIlIlIlIll[3] = (-18954) & 32415;
        lllIlIlIlIll[4] = (-((-4281) & 29887)) & (-258) & 32767;
        lllIlIlIlIll[5] = "   ".length();
        lllIlIlIlIll[6] = 120 ^ 124;
        lllIlIlIlIll[7] = 122 ^ 106;
    }

    private static boolean lIIIllIIIIlIIll(int i, int i2) {
        return i == i2;
    }

    protected int a(Item[] itemArr) {
        int i = lllIlIlIlIll[1];
        if (lIIIllIIIIlIllI(itemArr)) {
            return i;
        }
        int lllllllllllllllIIllIllIIIlIIIIlI = itemArr.length;
        int i2 = lllIlIlIlIll[1];
        while (lIIIllIIIIlIlll(i2, lllllllllllllllIIllIllIIIlIIIIlI)) {
            i += a(itemArr[i2].getId());
            i2++;
            "".length();
            if ((true ^ true) != (true ^ true)) {
                return (18 ^ 88) & ((243 ^ 185) ^ (-1));
            }
        }
        return i;
    }

    public List<String> o() {
        return this.X;
    }

    @Subscribe
    public void a(ItemContainerChanged itemContainerChanged) {
        if (lIIIllIIIIlIlII(c() ? 1 : 0)) {
            return;
        }
        ItemContainer itemContainer = itemContainerChanged.getItemContainer();
        if (lIIIllIIIIlIlIl(itemContainer, this.T.getItemContainer(InventoryID.INVENTORY))) {
            this.Y = a(itemContainer.getItems());
            if (lIIIllIIIIlIllI(this.Z)) {
                this.Z = new k(this.V.getImage(lllIlIlIlIll[4]), this.U);
                this.W.addInfoBox(this.Z);
            }
            this.Z.setCount(this.Y);
        }
    }

    private static String lIIIllIIIIIllIl(String lllllllllllllllIIllIllIIIIllIIll, String lllllllllllllllIIllIllIIIIllIIlI) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIIllIllIIIIllIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = lllllllllllllllIIllIllIIIIllIIlI.toCharArray();
        int lllllllllllllllIIllIllIIIIlIllll = lllIlIlIlIll[1];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = lllIlIlIlIll[1];
        while (lIIIllIIIIlIlll(i, length)) {
            char lllllllllllllllIIllIllIIIIllIlII = charArray2[i];
            sb.append((char) (lllllllllllllllIIllIllIIIIllIlII ^ charArray[lllllllllllllllIIllIllIIIIlIllll % charArray.length]));
            "".length();
            lllllllllllllllIIllIllIIIIlIllll++;
            i++;
            "".length();
            if ("  ".length() <= ((34 ^ 40) & ((102 ^ 108) ^ (-1)))) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    @Override // m.u.a.p000.e.s.q.t.i.r.b
    public c d() {
        return c.GRAVEYARD;
    }

    private static boolean lIIIllIIIIlIlll(int i, int i2) {
        return i < i2;
    }

    static {
        lIIIllIIIIlIIIl();
        lIIIllIIIIlIIII();
        S = lllIlIlIlIll[3];
        R = lllIlIlIlIll[7];
    }

    private static boolean lIIIllIIIIlIllI(Object obj) {
        return obj == null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    @Override // m.u.a.p000.e.s.q.t.i.r.b
    public boolean c() {
        Player localPlayer = this.T.getLocalPlayer();
        if (lIIIllIIIIlIIlI(localPlayer) && lIIIllIIIIlIIll(localPlayer.getWorldLocation().getRegionID(), lllIlIlIlIll[3]) && lIIIllIIIIlIIll(localPlayer.getWorldLocation().getPlane(), lllIlIlIlIll[2])) {
            ?? r0 = lllIlIlIlIll[2];
            "".length();
            return !(true ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lllIlIlIlIll[1];
    }

    private static boolean lIIIllIIIIlIIlI(Object obj) {
        return obj != null;
    }

    private static String lIIIllIIIIIlllI(String lllllllllllllllIIllIllIIIIIllllI, String lllllllllllllllIIllIllIIIIIlllIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIllIIIIIlllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lllIlIlIlIll[0], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIllIIIIIllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIllIllIIIIIlllll) {
            lllllllllllllllIIllIllIIIIIlllll.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIllIIIIlIlIl(Object obj, Object obj2) {
        return obj == obj2;
    }

    public int B() {
        return this.Y;
    }

    private static void lIIIllIIIIlIIII() {
        lllIlIlIlIlI = new String[lllIlIlIlIll[0]];
        lllIlIlIlIlI[lllIlIlIlIll[1]] = lIIIllIIIIIllIl("HjYeWS0yNw4VKiA3Gx8p", "SCzyO");
        lllIlIlIlIlI[lllIlIlIlIll[2]] = lIIIllIIIIIlllI("6kGUDjZf533GI9yjwbI5T73xj6h5J8Oe", "RweKw");
    }
}
