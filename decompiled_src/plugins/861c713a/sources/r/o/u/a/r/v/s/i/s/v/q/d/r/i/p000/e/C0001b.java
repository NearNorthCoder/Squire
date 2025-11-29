package r.o.u.a.r.v.s.i.s.v.q.d.r.i.p000.e;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Actor;
import net.runelite.api.ChatMessageType;
import net.runelite.api.Client;
import net.runelite.api.EquipmentInventorySlot;
import net.runelite.api.InventoryID;
import net.runelite.api.Item;
import net.runelite.api.ItemContainer;
import net.runelite.api.NPC;
import net.runelite.api.events.ChatMessage;
import net.runelite.api.events.GameTick;
import net.runelite.api.events.InteractingChanged;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.game.ItemManager;
import net.runelite.http.api.item.ItemStats;
@Singleton
/* renamed from: r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.b  reason: invalid package and case insensitive filesystem */
/* loaded from: 861c713a-2076-4f84-9c7c-f1dff7263a11.jar:r/o/u/a/r/v/s/i/s/v/q/d/r/i/-/e/b.class */
public class C0001b {
    @Inject
    private /* synthetic */ Client w;
    private static /* synthetic */ int[] lIlIlIIIlIIll;
    private static /* synthetic */ String[] lIlIlIIIlIIlI;
    @Inject
    private /* synthetic */ ItemManager G;
    final /* synthetic */ int A = lIlIlIIIlIIll[0];
    private final /* synthetic */ int B = lIlIlIIIlIIll[1];
    private final /* synthetic */ int C = lIlIlIIIlIIll[2];
    public /* synthetic */ int D = lIlIlIIIlIIll[0];
    public /* synthetic */ int E = lIlIlIIIlIIll[0];
    public /* synthetic */ EnumC0003d F = EnumC0003d.NOT_ATTACKING;

    @Subscribe(priority = 2.1474836E9f)
    public void a(GameTick gameTick) {
        boolean t = t();
        switch (C0002c.H[this.F.ordinal()]) {
            case 1:
                if (lIllllIlIllIIIl(t ? 1 : 0)) {
                    u();
                    "".length();
                    if (" ".length() == (-" ".length())) {
                        return;
                    }
                }
                break;
            case 2:
                if (lIllllIlIllIIlI(this.E)) {
                    if (!lIllllIlIllIIIl(t ? 1 : 0)) {
                        this.F = EnumC0003d.NOT_ATTACKING;
                        break;
                    } else {
                        u();
                        "".length();
                        if ((true ^ true) & ((true ^ true) ^ true)) {
                            return;
                        }
                    }
                }
                break;
        }
        this.E -= lIlIlIIIlIIll[6];
    }

    private static boolean lIllllIlIllIIlI(int i) {
        return i <= 0;
    }

    public int w() {
        return this.D;
    }

    @Subscribe
    public void a(ChatMessage chatMessage) {
        int i;
        if (lIllllIlIlIllll(chatMessage.getType(), ChatMessageType.SPAM)) {
            return;
        }
        String message = chatMessage.getMessage();
        if (!lIllllIlIllIIII(message.startsWith(lIlIlIIIlIIlI[lIlIlIIIlIIll[0]]) ? 1 : 0) || lIllllIlIllIIIl(message.startsWith(lIlIlIIIlIIlI[lIlIlIIIlIIll[6]]) ? 1 : 0)) {
            if (lIllllIlIllIIIl(message.toLowerCase().contains(lIlIlIIIlIIlI[lIlIlIIIlIIll[2]]) ? 1 : 0)) {
                i = lIlIlIIIlIIll[2];
                "".length();
                if ("   ".length() <= 0) {
                    return;
                }
            } else {
                i = lIlIlIIIlIIll[1];
            }
            int i2 = i;
            if (lIllllIlIlIllIl(this.F, EnumC0003d.DELAYED)) {
                this.E += i2;
            }
        }
    }

    private static boolean lIllllIlIlIllll(Object obj, Object obj2) {
        return obj != obj2;
    }

    public int v() {
        return lIlIlIIIlIIll[6] + this.E;
    }

    public void x() {
        this.E = lIlIlIIIlIIll[0];
    }

    private static String lIllllIlIlIIllI(String llllllllllllllIllIllIIIlIlIIIlII, String llllllllllllllIllIllIIIlIlIIIIll) {
        try {
            SecretKeySpec llllllllllllllIllIllIIIlIlIIIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIllIIIlIlIIIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIlIlIIIlIIll[2], llllllllllllllIllIllIIIlIlIIIlll);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIllIllIIIlIlIIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIllIIIlIlIIIlIl) {
            llllllllllllllIllIllIIIlIlIIIlIl.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [boolean] */
    private ItemStats a(ItemContainer itemContainer, int i) {
        Item item = itemContainer.getItem(i);
        if (lIllllIlIlIlIlI(item)) {
            ItemStats itemStats = this.G.getItemStats(item.getId(), (boolean) lIlIlIIIlIIll[0]);
            "".length();
            if ((-"   ".length()) > 0) {
                return null;
            }
            return itemStats;
        }
        return null;
    }

    @Subscribe
    public void a(InteractingChanged interactingChanged) {
        Actor source = interactingChanged.getSource();
        Actor target = interactingChanged.getTarget();
        if (lIllllIlIllIIIl(source.equals(this.w.getLocalPlayer()) ? 1 : 0) && lIllllIlIllIIIl(target instanceof NPC ? 1 : 0)) {
            switch (C0002c.H[this.F.ordinal()]) {
                case 1:
                    if (lIllllIlIllIIIl(t() ? 1 : 0)) {
                        u();
                        "".length();
                        if ("   ".length() > (55 ^ 51)) {
                            return;
                        }
                        return;
                    }
                    return;
                case 2:
                default:
                    return;
            }
        }
    }

    private static String lIllllIlIlIIlll(String llllllllllllllIllIllIIIlIlIlIIIl, String llllllllllllllIllIllIIIlIlIlIIII) {
        try {
            SecretKeySpec llllllllllllllIllIllIIIlIlIlIlII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIllIIIlIlIlIIII.getBytes(StandardCharsets.UTF_8)), lIlIlIIIlIIll[7]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIlIlIIIlIIll[2], llllllllllllllIllIllIIIlIlIlIlII);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIllIllIIIlIlIlIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIllIIIlIlIlIIlI) {
            llllllllllllllIllIllIIIlIlIlIIlI.printStackTrace();
            return null;
        }
    }

    private int s() {
        ItemStats q = q();
        if (lIllllIlIlIllII(q)) {
            return lIlIlIIIlIIll[5];
        }
        int aspeed = q.getEquipment().getAspeed();
        if (lIllllIlIlIllIl(r(), k.RANGING) && lIllllIlIlIlllI(this.w.getVarpValue(lIlIlIIIlIIll[3]), lIlIlIIIlIIll[6])) {
            aspeed--;
        }
        return aspeed;
    }

    private static boolean lIllllIlIlIllIl(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static boolean lIllllIlIllIIIl(int i) {
        return i != 0;
    }

    static {
        lIllllIlIlIlIIl();
        lIllllIlIlIlIII();
    }

    private static void lIllllIlIlIlIIl() {
        lIlIlIIIlIIll = new int[8];
        lIlIlIIIlIIll[0] = (214 ^ 193) & ((69 ^ 82) ^ (-1));
        lIlIlIIIlIIll[1] = "   ".length();
        lIlIlIIIlIIll[2] = "  ".length();
        lIlIlIIIlIIll[3] = (0 ^ 81) ^ (64 ^ 58);
        lIlIlIIIlIIll[4] = (-((-12643) & 32739)) & (-8203) & 28655;
        lIlIlIIIlIIll[5] = 116 ^ 112;
        lIlIlIIIlIIll[6] = " ".length();
        lIlIlIIIlIIll[7] = 138 ^ 130;
    }

    private static void lIllllIlIlIlIII() {
        lIlIlIIIlIIlI = new String[lIlIlIIIlIIll[1]];
        lIlIlIIIlIIlI[lIlIlIIIlIIll[0]] = lIllllIlIlIIllI("sVWlv5yTHqI=", "afeIi");
        lIlIlIIIlIIlI[lIlIlIIIlIIll[6]] = lIllllIlIlIIllI("lYfZ5QdvPFzpcNxzpNiGlOLaMzrsrBIK", "yPQRz");
        lIlIlIIIlIIlI[lIlIlIIIlIIll[2]] = lIllllIlIlIIlll("2TUNnKCWTgZTJEuKFor+dQ==", "qgmOd");
    }

    private ItemStats q() {
        return a(this.w.getItemContainer(InventoryID.EQUIPMENT), EquipmentInventorySlot.WEAPON.getSlotIdx());
    }

    private static boolean lIllllIlIlIlIlI(Object obj) {
        return obj != null;
    }

    private static boolean lIllllIlIlIllII(Object obj) {
        return obj == null;
    }

    private void u() {
        this.F = EnumC0003d.DELAYED;
        this.E = s();
        this.D = this.E;
    }

    private static boolean lIllllIlIlIlllI(int i, int i2) {
        return i == i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    private boolean t() {
        if (lIllllIlIlIlIlI(i.d(this.w.getLocalPlayer().getAnimation()))) {
            ?? r0 = lIlIlIIIlIIll[6];
            "".length();
            return 0 != 0 ? ((((178 + 90) - 87) + 2) ^ (((93 + 102) - 147) + 123)) & (((((7 + 33) - (-143)) + 6) ^ (((46 + 55) - 23) + 83)) ^ (-" ".length())) : r0;
        }
        return lIlIlIIIlIIll[0];
    }

    private k r() {
        int varpValue = this.w.getVarpValue(lIlIlIIIlIIll[3]);
        k[] O = l.e(this.w.getVarbitValue(lIlIlIIIlIIll[4])).O();
        return lIllllIlIlIlIll(varpValue, O.length) ? O[varpValue] : k.ACCURATE;
    }

    private static boolean lIllllIlIllIIII(int i) {
        return i == 0;
    }

    private static boolean lIllllIlIlIlIll(int i, int i2) {
        return i < i2;
    }
}
