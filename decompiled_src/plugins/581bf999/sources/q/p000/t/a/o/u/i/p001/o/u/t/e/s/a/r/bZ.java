package q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r;

import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.ChatMessageType;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.runelite.api.Point;
import net.runelite.api.TileItem;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.ChatMessage;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
@TaskDesc(name = "Running water", priority = 50, register = true)
/* renamed from: q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.bZ  reason: invalid package */
/* loaded from: 581bf999-de0d-4fc5-a3b6-1ebe3d93b748.jar:q/-/t/a/o/u/i/-/o/u/t/e/s/a/r/bZ.class */
public class bZ extends ca {
    private static /* synthetic */ int[] lIllIIlllII;
    private /* synthetic */ boolean hz;
    private /* synthetic */ Point hx;
    private /* synthetic */ int hy;
    private static final /* synthetic */ int hv;
    private static final /* synthetic */ int hu;
    private static /* synthetic */ String[] lIllIIllIll;
    private static final /* synthetic */ int hw;

    static {
        lIIlIllIIlIlIl();
        lIIlIllIIlIlII();
        hw = lIllIIlllII[9];
        hu = lIllIIlllII[10];
        hv = lIllIIlllII[11];
    }

    private static String lIIlIllIIlIIll(String llllllllllllllllIlIlIIllIIIllllI, String llllllllllllllllIlIlIIllIIIlllIl) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllllIlIlIIllIIIllllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = llllllllllllllllIlIlIIllIIIlllIl.toCharArray();
        int llllllllllllllllIlIlIIllIIIllIlI = lIllIIlllII[2];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = lIllIIlllII[2];
        while (lIIlIllIIllIll(i, length)) {
            sb.append((char) (charArray2[i] ^ charArray[llllllllllllllllIlIlIIllIIIllIlI % charArray.length]));
            "".length();
            llllllllllllllllIlIlIIllIIIllIlI++;
            i++;
            "".length();
            if (((((14 + 7) - (-56)) + 58) ^ (((92 + 124) - 134) + 48)) <= 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v28, types: [boolean] */
    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0015ao
    public boolean bl() {
        int[] iArr = new int[lIllIIlllII[3]];
        iArr[lIllIIlllII[2]] = lIllIIlllII[4];
        if (lIIlIllIIlIllI(Inventory.contains(iArr) ? 1 : 0)) {
            this.hy = lIllIIlllII[2];
            return cJ();
        }
        WorldPoint a = a(this.hx);
        if (lIIlIllIIlIllI(a.equals(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIIlIllIIlIllI(this.hy)) {
            Log.info(lIllIIllIll[lIllIIlllII[2]]);
            Movement.setDestination(a);
            return lIllIIlllII[3];
        }
        if (lIIlIllIIlIlll(a.equals(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            this.hy = lIllIIlllII[3];
        }
        return lIIlIllIIlIllI(this.hz ? 1 : 0) ? cI() : cH();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v18, types: [boolean] */
    private boolean cH() {
        int[] iArr = new int[lIllIIlllII[3]];
        iArr[lIllIIlllII[2]] = aX();
        NPC nearest = NPCs.getNearest(iArr);
        if (lIIlIllIIllIIl(nearest)) {
            return lIllIIlllII[2];
        }
        int[] iArr2 = new int[lIllIIlllII[3]];
        iArr2[lIllIIlllII[2]] = lIllIIlllII[4];
        Item first = Inventory.getFirst(iArr2);
        if (lIIlIllIIllIIl(first)) {
            return lIllIIlllII[2];
        }
        first.useOn(nearest);
        return lIllIIlllII[3];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    private boolean cJ() {
        if (lIIlIllIIllIIl(cK())) {
            return lIllIIlllII[2];
        }
        if (lIIlIllIIlIlll(Inventory.isFull() ? 1 : 0)) {
            bh();
            return lIllIIlllII[3];
        }
        int[] iArr = new int[lIllIIlllII[3]];
        iArr[lIllIIlllII[2]] = lIllIIlllII[4];
        TileItem nearest = TileItems.getNearest(iArr);
        if (lIIlIllIIllIlI(nearest)) {
            nearest.interact(lIllIIllIll[lIllIIlllII[6]]);
            return lIllIIlllII[3];
        }
        return lIllIIlllII[2];
    }

    private static boolean lIIlIllIIllIII(Object obj, Object obj2) {
        return obj != obj2;
    }

    private TileObject cK() {
        return TileObjects.getNearest(tileObject -> {
            if (lIIlIllIIlIlll(tileObject.getName().equals(lIllIIllIll[lIllIIlllII[7]]) ? 1 : 0)) {
                String[] strArr = new String[lIllIIlllII[3]];
                strArr[lIllIIlllII[2]] = lIllIIllIll[lIllIIlllII[8]];
                if (lIIlIllIIlIlll(tileObject.hasAction(strArr) ? 1 : 0)) {
                    ?? r0 = lIllIIlllII[3];
                    "".length();
                    return " ".length() < (-" ".length()) ? ((((84 + 201) - 140) + 91) ^ (((0 + 45) - (-28)) + 90)) & (((((64 + 117) - 74) + 35) ^ (((2 + 141) - 66) + 116)) ^ (-" ".length())) : r0;
                }
            }
            return lIllIIlllII[2];
        });
    }

    private static boolean lIIlIllIIllIll(int i, int i2) {
        return i < i2;
    }

    private static boolean lIIlIllIIlIllI(int i) {
        return i == 0;
    }

    private static void lIIlIllIIlIlII() {
        lIllIIllIll = new String[lIllIIlllII[12]];
        lIllIIllIll[lIllIIlllII[2]] = lIIlIllIIlIIlI("K2OEbt6ClcbNHU+iAwSVsrFJvYjoYJbC", "pHied");
        lIllIIllIll[lIllIIlllII[3]] = lIIlIllIIlIIll("AB0fTgMwHgZOHDYHGE4GNhweDww3FxhA", "Yrjne");
        lIllIIllIll[lIllIIlllII[5]] = lIIlIllIIlIIlI("MW8GYOtGHCa5PyZIUsCBYA==", "tBgDz");
        lIllIIllIll[lIllIIlllII[6]] = lIIlIllIIlIIll("Di8FLQ==", "ZNnHV");
        lIllIIllIll[lIllIIlllII[7]] = lIIlIllIIlIIlI("uQjYaJGUgl4YXlk2ZLCUTg==", "FwzAo");
        lIllIIllIll[lIllIIlllII[8]] = lIIlIllIIlIIll("KS08FA==", "oDPxX");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v8, types: [boolean] */
    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0015ao
    @Subscribe
    public void a(ChatMessage chatMessage) {
        if (lIIlIllIIllIII(chatMessage.getType(), ChatMessageType.GAMEMESSAGE)) {
            return;
        }
        String message = chatMessage.getMessage();
        if (!lIIlIllIIlIlll(message.contains(lIllIIllIll[lIllIIlllII[3]]) ? 1 : 0)) {
            if (lIIlIllIIlIlll(message.contains(lIllIIllIll[lIllIIlllII[5]]) ? 1 : 0)) {
                this.hz = lIllIIlllII[2];
                return;
            }
            return;
        }
        this.hz = lIllIIlllII[3];
        "".length();
        if ("   ".length() <= ((182 ^ 129) & ((61 ^ 10) ^ (-1)))) {
        }
    }

    @Inject
    protected bZ(Client client, C0077z c0077z, TOAConfig tOAConfig) {
        super(client, c0077z, tOAConfig);
        this.hx = new Point(lIllIIlllII[0], lIllIIlllII[1]);
        this.hy = lIllIIlllII[2];
    }

    private static boolean lIIlIllIIllIlI(Object obj) {
        return obj != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v16, types: [boolean] */
    private boolean cI() {
        TileObject cK = cK();
        if (lIIlIllIIllIIl(cK)) {
            return lIllIIlllII[2];
        }
        int[] iArr = new int[lIllIIlllII[3]];
        iArr[lIllIIlllII[2]] = lIllIIlllII[4];
        Item first = Inventory.getFirst(iArr);
        if (lIIlIllIIllIIl(first)) {
            return lIllIIlllII[2];
        }
        first.useOn(cK);
        return lIllIIlllII[3];
    }

    private static boolean lIIlIllIIllIIl(Object obj) {
        return obj == null;
    }

    private static void lIIlIllIIlIlIl() {
        lIllIIlllII = new int[14];
        lIllIIlllII[0] = 181 ^ 157;
        lIllIIlllII[1] = 68 ^ 105;
        lIllIIlllII[2] = ((175 ^ 196) ^ (89 ^ 127)) & (((108 ^ 118) ^ (95 ^ 8)) ^ (-" ".length()));
        lIllIIlllII[3] = " ".length();
        lIllIIlllII[4] = (-((-10305) & 11617)) & (-4097) & 32703;
        lIllIIlllII[5] = "  ".length();
        lIllIIlllII[6] = "   ".length();
        lIllIIlllII[7] = 87 ^ 83;
        lIllIIlllII[8] = 46 ^ 43;
        lIllIIlllII[9] = (-((-2139) & 20223)) & (-1) & 63487;
        lIllIIlllII[10] = (-3601) & 49015;
        lIllIIlllII[11] = (-((-20813) & 21357)) & (-133) & 10239;
        lIllIIlllII[12] = (204 ^ 196) ^ (36 ^ 42);
        lIllIIlllII[13] = 47 ^ 39;
    }

    private static boolean lIIlIllIIlIlll(int i) {
        return i != 0;
    }

    private static String lIIlIllIIlIIlI(String llllllllllllllllIlIlIIllIIIIlIIl, String llllllllllllllllIlIlIIllIIIIlIII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIlIlIIllIIIIlIII.getBytes(StandardCharsets.UTF_8)), lIllIIlllII[13]), "DES");
            Cipher llllllllllllllllIlIlIIllIIIIlIll = Cipher.getInstance("DES");
            llllllllllllllllIlIlIIllIIIIlIll.init(lIllIIlllII[5], secretKeySpec);
            return new String(llllllllllllllllIlIlIIllIIIIlIll.doFinal(Base64.getDecoder().decode(llllllllllllllllIlIlIIllIIIIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIlIlIIllIIIIlIlI) {
            llllllllllllllllIlIlIIllIIIIlIlI.printStackTrace();
            return null;
        }
    }
}
