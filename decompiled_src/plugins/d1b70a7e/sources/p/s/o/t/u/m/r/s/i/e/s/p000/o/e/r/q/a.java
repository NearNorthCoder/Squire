package p.s.o.t.u.m.r.s.i.e.s.p000.o.e.r.q;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import gg.squire.tempoross.SquireTempoross;
import gg.squire.tempoross.SquireTemporossConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Actor;
import net.runelite.api.ChatMessageType;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.ChatMessage;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.SceneEntity;
import net.unethicalite.api.commons.StopWatch;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
@Singleton
/* renamed from: p.s.o.t.u.m.r.s.i.e.s.-.o.e.r.q.a  reason: invalid package */
/* loaded from: d1b70a7e-d534-4fe7-a2d5-7f0423b04edb.jar:p/s/o/t/u/m/r/s/i/e/s/-/o/e/r/q/a.class */
public class a {
    private final /* synthetic */ SquireTemporossConfig f;
    private /* synthetic */ c s;
    private static /* synthetic */ int[] lIIllIllllIII;
    private final /* synthetic */ SquireTempoross e;
    private /* synthetic */ StopWatch g;
    private static /* synthetic */ String[] lIIllIlllIllI;
    private /* synthetic */ int h = lIIllIllllIII[0];
    private /* synthetic */ int i = lIIllIllllIII[0];
    private /* synthetic */ int j = lIIllIllllIII[1];
    private /* synthetic */ int k = lIIllIllllIII[2];
    private /* synthetic */ int l = lIIllIllllIII[3];
    private /* synthetic */ int m = lIIllIllllIII[4];
    private /* synthetic */ boolean n = lIIllIllllIII[0];
    private /* synthetic */ boolean o = lIIllIllllIII[0];

    /* renamed from: p  reason: collision with root package name */
    private /* synthetic */ boolean f0p = lIIllIllllIII[0];
    private /* synthetic */ boolean q = lIIllIllllIII[0];
    private /* synthetic */ boolean r = lIIllIllllIII[0];

    public void a(boolean z) {
        this.n = z;
    }

    public int F() {
        return this.k;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    public boolean r() {
        int[] iArr = new int[lIIllIllllIII[1]];
        iArr[lIIllIllllIII[0]] = lIIllIllllIII[8];
        if (!lIllIIIlllIIlll(Inventory.contains(iArr) ? 1 : 0) || lIllIIIlllIIllI(s() ? 1 : 0)) {
            ?? r0 = lIIllIllllIII[1];
            "".length();
            return 0 != 0 ? "  ".length() & ("  ".length() ^ (-" ".length())) : r0;
        }
        return lIIllIllllIII[0];
    }

    public boolean M() {
        return this.r;
    }

    public int H() {
        return this.m;
    }

    public c N() {
        return this.s;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v21, types: [boolean] */
    @Inject
    public a(SquireTempoross squireTempoross, SquireTemporossConfig squireTemporossConfig) {
        this.e = squireTempoross;
        this.f = squireTemporossConfig;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [boolean] */
    public void u() {
        this.j += lIIllIllllIII[1];
        if (lIllIIIlllIIllI(this.f.solo() ? 1 : 0)) {
            this.n = lIIllIllllIII[1];
        }
    }

    public void a(c cVar) {
        this.s = cVar;
    }

    private static String lIllIIIllIlIlll(String llllllllllllllIlllIllIlIllllIIIl, String llllllllllllllIlllIllIlIllllIIII) {
        try {
            SecretKeySpec llllllllllllllIlllIllIlIllllIlII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIllIlIllllIIII.getBytes(StandardCharsets.UTF_8)), lIIllIllllIII[18]), "DES");
            Cipher llllllllllllllIlllIllIlIllllIIll = Cipher.getInstance("DES");
            llllllllllllllIlllIllIlIllllIIll.init(lIIllIllllIII[9], llllllllllllllIlllIllIlIllllIlII);
            return new String(llllllllllllllIlllIllIlIllllIIll.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIllIlIllllIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllIllIlIllllIIlI) {
            llllllllllllllIlllIllIlIllllIIlI.printStackTrace();
            return null;
        }
    }

    public boolean c(NPC npc) {
        return lIllIIIlllIIllI(this.e.a((Locatable) npc) ? 1 : 0) ? this.e.b((SceneEntity) npc) : this.e.b((Locatable) npc);
    }

    private static void lIllIIIlllIIIll() {
        lIIllIllllIII = new int[33];
        lIIllIllllIII[0] = ((((85 + 153) - 159) + 105) ^ (((34 + 23) - (-11)) + 62)) & (((74 ^ 7) ^ (86 ^ 33)) ^ (-" ".length()));
        lIIllIllllIII[1] = " ".length();
        lIIllIllllIII[2] = (68 ^ 51) ^ (252 ^ 163);
        lIIllIllllIII[3] = 129 ^ 142;
        lIIllIllllIII[4] = 148 ^ 141;
        lIIllIllllIII[5] = (-21515) & 22346;
        lIIllIllllIII[6] = (-2177) & 4021;
        lIIllIllllIII[7] = (-2113) & 3956;
        lIIllIllllIII[8] = (-((-11155) & 12183)) & (-30722) & 32703;
        lIIllIllllIII[9] = "  ".length();
        lIIllIllllIII[10] = "   ".length();
        lIIllIllllIII[11] = (-1749) & 4095;
        lIIllIllllIII[12] = (-4115) & 29758;
        lIIllIllllIII[13] = (23 ^ 69) ^ (28 ^ 74);
        lIIllIllllIII[14] = 11 ^ 14;
        lIIllIllllIII[15] = 29 ^ 27;
        lIIllIllllIII[16] = (106 ^ 95) ^ (119 ^ 82);
        lIIllIllllIII[17] = (0 ^ 66) ^ (76 ^ 9);
        lIIllIllllIII[18] = (((93 + 14) - 37) + 71) ^ (((83 + 89) - 155) + 116);
        lIIllIllllIII[19] = (121 ^ 95) ^ (59 ^ 20);
        lIIllIllllIII[20] = (95 ^ 39) ^ (109 ^ 31);
        lIIllIllllIII[21] = 50 ^ 57;
        lIIllIllllIII[22] = 163 ^ 175;
        lIIllIllllIII[23] = (((140 + 175) - 283) + 149) ^ (((55 + 2) - 49) + 176);
        lIIllIllllIII[24] = 83 ^ 93;
        lIIllIllllIII[25] = (159 ^ 144) ^ (114 ^ 108);
        lIIllIllllIII[26] = 26 ^ 8;
        lIIllIllllIII[27] = 134 ^ 149;
        lIIllIllllIII[28] = (123 ^ 47) ^ (57 ^ 121);
        lIIllIllllIII[29] = (((105 + 147) - 217) + 115) ^ (((49 + 118) - 59) + 23);
        lIIllIllllIII[30] = 19 ^ 5;
        lIIllIllllIII[31] = (33 ^ 118) ^ (97 ^ 33);
        lIIllIllllIII[32] = 190 ^ 166;
    }

    public void c(int i) {
        this.j = i;
    }

    public SquireTempoross z() {
        return this.e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v29, types: [boolean] */
    @Subscribe
    public void a(ChatMessage chatMessage) {
        ChatMessageType type = chatMessage.getType();
        String message = chatMessage.getMessage();
        if (lIllIIIlllIlIIl(type, ChatMessageType.GAMEMESSAGE)) {
            return;
        }
        if (lIllIIIlllIIllI(message.contains(lIIllIlllIllI[lIIllIllllIII[13]]) ? 1 : 0)) {
            this.r = lIIllIllllIII[1];
            this.i += lIIllIllllIII[1];
            this.s = null;
            System.out.println(lIIllIlllIllI[lIIllIllllIII[14]]);
        }
        if (lIllIIIlllIIllI(message.contains(lIIllIlllIllI[lIIllIllllIII[15]]) ? 1 : 0)) {
            this.h += Integer.parseInt(message.substring(lIIllIllllIII[16], message.indexOf(lIIllIlllIllI[lIIllIllllIII[17]])).replace(lIIllIlllIllI[lIIllIllllIII[18]], lIIllIlllIllI[lIIllIllllIII[19]]).replace(lIIllIlllIllI[lIIllIllllIII[20]], lIIllIlllIllI[lIIllIllllIII[21]]));
        }
        if (lIllIIIlllIIllI(message.toLowerCase().contains(lIIllIlllIllI[lIIllIllllIII[22]]) ? 1 : 0)) {
            this.f0p = lIIllIllllIII[1];
        }
        if (!lIllIIIlllIIlll(message.contains(lIIllIlllIllI[lIIllIllllIII[23]]) ? 1 : 0) || lIllIIIlllIIllI(message.contains(lIIllIlllIllI[lIIllIllllIII[24]]) ? 1 : 0)) {
            this.f0p = lIIllIllllIII[0];
        }
        if (lIllIIIlllIIllI(message.contains(lIIllIlllIllI[lIIllIllllIII[3]]) ? 1 : 0)) {
            this.q = lIIllIllllIII[1];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    public boolean a(NPC npc, String str) {
        if (lIllIIIlllIIllI(this.e.a((Locatable) npc) ? 1 : 0)) {
            return this.e.b((SceneEntity) npc);
        }
        npc.interact(str);
        return lIIllIllllIII[1];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    public boolean k() {
        int graphic = Players.getLocal().getGraphic();
        if (!lIllIIIlllIIlII(Players.getLocal().getAnimation(), lIIllIllllIII[5]) || (lIllIIIlllIIlII(graphic, lIIllIllllIII[6]) && !lIllIIIlllIIlIl(graphic, lIIllIllllIII[7]))) {
            return lIIllIllllIII[0];
        }
        ?? r0 = lIIllIllllIII[1];
        "".length();
        return " ".length() < 0 ? ((((192 + 114) - 102) + 50) ^ (((163 + 149) - 144) + 4)) & (((42 ^ 114) ^ (109 ^ 103)) ^ (-" ".length())) : r0;
    }

    public void a(StopWatch stopWatch) {
        this.g = stopWatch;
    }

    public void y() {
        this.h = lIIllIllllIII[0];
        this.i = lIIllIllllIII[0];
    }

    public boolean f(WorldPoint worldPoint) {
        return lIllIIIlllIIllI(this.e.a(worldPoint) ? 1 : 0) ? this.e.e(worldPoint) : this.e.b(worldPoint);
    }

    public void d(boolean z) {
        this.q = z;
    }

    public TileObject x() {
        return TileObjects.getNearest(tileObject -> {
            String[] strArr = new String[lIIllIllllIII[1]];
            strArr[lIIllIllllIII[0]] = lIIllIlllIllI[lIIllIllllIII[16]];
            return tileObject.hasAction(strArr);
        });
    }

    public void b(int i) {
        this.i = i;
    }

    public void d(int i) {
        this.k = i;
    }

    private static boolean lIllIIIlllIIlIl(int i, int i2) {
        return i == i2;
    }

    public void a(int i) {
        this.h = i;
    }

    private static String lIllIIIllIlIllI(String llllllllllllllIlllIllIllIIIIIllI, String llllllllllllllIlllIllIllIIIIIlIl) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllIlllIllIllIIIIIllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = llllllllllllllIlllIllIllIIIIIlIl.toCharArray();
        int llllllllllllllIlllIllIllIIIIIIlI = lIIllIllllIII[0];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int llllllllllllllIlllIllIlIlllllIlI = lIIllIllllIII[0];
        while (lIllIIIlllIlIlI(llllllllllllllIlllIllIlIlllllIlI, length)) {
            char llllllllllllllIlllIllIllIIIIIlll = charArray2[llllllllllllllIlllIllIlIlllllIlI];
            sb.append((char) (llllllllllllllIlllIllIllIIIIIlll ^ charArray[llllllllllllllIlllIllIllIIIIIIlI % charArray.length]));
            "".length();
            llllllllllllllIlllIllIllIIIIIIlI++;
            llllllllllllllIlllIllIlIlllllIlI++;
            "".length();
            if (((22 ^ 76) & ((43 ^ 113) ^ (-1))) < 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean lIllIIIlllIlIIl(Object obj, Object obj2) {
        return obj != obj2;
    }

    private static boolean lIllIIIlllIlIlI(int i, int i2) {
        return i < i2;
    }

    private static boolean lIllIIIlllIlIII(int i, int i2) {
        return i <= i2;
    }

    public void c(boolean z) {
        this.f0p = z;
    }

    public int E() {
        return this.j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    public boolean q() {
        if (lIllIIIlllIlIII(this.f.numberOfBuckets(), p())) {
            ?? r0 = lIIllIllllIII[1];
            "".length();
            return "  ".length() < 0 ? ((60 ^ 36) ^ (63 ^ 97)) & (((21 ^ 11) ^ (101 ^ 61)) ^ (-" ".length())) : r0;
        }
        return lIIllIllllIII[0];
    }

    public SquireTemporossConfig A() {
        return this.f;
    }

    public NPC j() {
        return NPCs.getNearest(npc -> {
            String[] strArr = new String[lIIllIllllIII[1]];
            strArr[lIIllIllllIII[0]] = lIIllIlllIllI[lIIllIllllIII[30]];
            if (lIllIIIlllIIllI(npc.hasAction(strArr) ? 1 : 0) && lIllIIIlllIlIII(npc.getWorldLocation().distanceTo(this.s.Z()), lIIllIllllIII[20])) {
                String[] strArr2 = new String[lIIllIllllIII[1]];
                strArr2[lIIllIllllIII[0]] = lIIllIlllIllI[lIIllIllllIII[31]];
                if (lIllIIIlllIIllI(npc.hasAction(strArr2) ? 1 : 0) && lIllIIIlllIIllI(this.e.a((Actor) npc) ? 1 : 0)) {
                    ?? r0 = lIIllIllllIII[1];
                    "".length();
                    return (-" ".length()) >= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
            }
            return lIIllIllllIII[0];
        });
    }

    public int n() {
        return Inventory.getCount(item -> {
            if (lIllIIIlllIIllI(item.getName().contains(lIIllIlllIllI[lIIllIllllIII[26]]) ? 1 : 0)) {
                String[] strArr = new String[lIIllIllllIII[1]];
                strArr[lIIllIllllIII[0]] = lIIllIlllIllI[lIIllIllllIII[27]];
                if (lIllIIIlllIIlll(item.hasAction(strArr) ? 1 : 0)) {
                    ?? r0 = lIIllIllllIII[1];
                    "".length();
                    return "   ".length() < "   ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
            }
            return lIIllIllllIII[0];
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    public boolean t() {
        int[] iArr = new int[lIIllIllllIII[1]];
        iArr[lIIllIllllIII[0]] = lIIllIllllIII[11];
        if (lIllIIIlllIIlll(Inventory.contains(iArr) ? 1 : 0)) {
            int[] iArr2 = new int[lIIllIllllIII[1]];
            iArr2[lIIllIllllIII[0]] = lIIllIllllIII[12];
            if (!lIllIIIlllIIllI(Equipment.contains(iArr2) ? 1 : 0)) {
                return lIIllIllllIII[0];
            }
        }
        ?? r0 = lIIllIllllIII[1];
        "".length();
        return (-" ".length()) >= "  ".length() ? ((140 ^ 161) ^ (236 ^ 163)) & (((85 ^ 98) ^ (31 ^ 74)) ^ (-" ".length())) : r0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    public boolean o() {
        if (lIllIIIlllIIlIl(this.f.numberOfBuckets(), n())) {
            ?? r0 = lIIllIllllIII[1];
            "".length();
            return (((57 ^ 14) ^ (163 ^ 178)) & (((86 ^ 92) ^ (35 ^ 15)) ^ (-" ".length()))) == "  ".length() ? ((68 ^ 109) ^ (112 ^ 1)) & (((192 ^ 142) ^ (151 ^ 129)) ^ (-" ".length())) : r0;
        }
        return lIIllIllllIII[0];
    }

    private static boolean lIllIIIlllIIllI(int i) {
        return i != 0;
    }

    public boolean J() {
        return this.o;
    }

    private static String lIllIIIllIlIlIl(String llllllllllllllIlllIllIllIIIlIllI, String llllllllllllllIlllIllIllIIIlIlIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIllIllIIIlIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIIllIllllIII[9], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIllIllIIIlIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllIllIllIIIlIlll) {
            llllllllllllllIlllIllIllIIIlIlll.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIIIlllIIlII(int i, int i2) {
        return i != i2;
    }

    public boolean K() {
        return this.f0p;
    }

    static {
        lIllIIIlllIIIll();
        lIllIIIllIllIII();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    public boolean s() {
        String[] strArr = new String[lIIllIllllIII[1]];
        strArr[lIIllIllllIII[0]] = lIIllIlllIllI[lIIllIllllIII[0]];
        if (lIllIIIlllIIllI(Equipment.contains(strArr) ? 1 : 0)) {
            String[] strArr2 = new String[lIIllIllllIII[1]];
            strArr2[lIIllIllllIII[0]] = lIIllIlllIllI[lIIllIllllIII[1]];
            if (lIllIIIlllIIllI(Equipment.contains(strArr2) ? 1 : 0)) {
                String[] strArr3 = new String[lIIllIllllIII[1]];
                strArr3[lIIllIllllIII[0]] = lIIllIlllIllI[lIIllIllllIII[9]];
                if (lIllIIIlllIIllI(Equipment.contains(strArr3) ? 1 : 0)) {
                    String[] strArr4 = new String[lIIllIllllIII[1]];
                    strArr4[lIIllIllllIII[0]] = lIIllIlllIllI[lIIllIllllIII[10]];
                    if (lIllIIIlllIIllI(Equipment.contains(strArr4) ? 1 : 0)) {
                        ?? r0 = lIIllIllllIII[1];
                        "".length();
                        return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                }
            }
        }
        return lIIllIllllIII[0];
    }

    public boolean L() {
        return this.q;
    }

    private static void lIllIIIllIllIII() {
        lIIllIlllIllI = new String[lIIllIllllIII[32]];
        lIIllIlllIllI[lIIllIllllIII[0]] = lIllIIIllIlIlIl("VqERF/Z9vKeZx6Hrc2L/XWYPwQTgPtKQ", "DCFOr");
        lIIllIlllIllI[lIIllIllllIII[1]] = lIllIIIllIlIllI("MCkICiYXeQAWKA88E1g7DCk=", "cYaxO");
        lIIllIlllIllI[lIIllIllllIII[9]] = lIllIIIllIlIlll("hawIWiuVRZTmNUBmzH7wRz+cD4gpSmfx", "lnyxG");
        lIIllIlllIllI[lIIllIllllIII[10]] = lIllIIIllIlIlIl("Fu5A0VE+M/s9T8cmd0/Kj4AQU/084zhp", "ETHyO");
        lIIllIlllIllI[lIIllIllllIII[13]] = lIllIIIllIlIlIl("KEQbJh1BAWwss8LePxxkpg==", "oSgTg");
        lIIllIlllIllI[lIIllIllllIII[14]] = lIllIIIllIlIlll("kbvZJYgv0u4HbbCRqr/Y2FQV+hSHvZBo", "HGpnL");
        lIIllIlllIllI[lIIllIllllIII[15]] = lIllIIIllIlIlll("uz5yA4tsyiXthNhccEEBwg==", "MKEAZ");
        lIIllIlllIllI[lIIllIllllIII[17]] = lIllIIIllIlIlll("ROEmPCnVDiw=", "LxFLo");
        lIIllIlllIllI[lIIllIllllIII[18]] = lIllIIIllIlIllI("fhU2CH4nEGhUcXJI", "BvYdC");
        lIIllIlllIllI[lIIllIllllIII[19]] = lIllIIIllIlIlll("DPmS47RX9lQ=", "gAfuR");
        lIIllIlllIllI[lIIllIllllIII[20]] = lIllIIIllIlIllI("UF0QIT5S", "lrsNR");
        lIIllIlllIllI[lIIllIllllIII[21]] = lIllIIIllIlIlll("sKGc9dQOECE=", "oUCnN");
        lIIllIlllIllI[lIIllIllllIII[22]] = lIllIIIllIlIlIl("33UaLRlDzGzLFyMr7XQsBokXzA9ljg8Dh6/a0ckxVx4=", "fLTpk");
        lIIllIlllIllI[lIIllIllllIII[23]] = lIllIIIllIlIllI("EwsEajgIEwRqIQIGETlqHgwUajkCABQ4Lwsa", "gcaJJ");
        lIIllIlllIllI[lIIllIllllIII[24]] = lIllIIIllIlIllI("HxsmcS8KBSZxKwcSLiJ4Ah03PngSHDY=", "ksCQX");
        lIIllIlllIllI[lIIllIllllIII[3]] = lIllIIIllIlIlll("6FT/A0+8myU3ZSurPGU3zQzcZQX5K8Db", "PhiAm");
        lIIllIlllIllI[lIIllIllllIII[16]] = lIllIIIllIlIllI("JgI/LBkG", "tgOMp");
        lIIllIlllIllI[lIIllIllllIII[25]] = lIllIIIllIlIlll("TGDJM7Sn9iw=", "gKtOt");
        lIIllIlllIllI[lIIllIllllIII[26]] = lIllIIIllIlIlIl("xtuPkJ7k+Yo=", "DpJtC");
        lIIllIlllIllI[lIIllIllllIII[27]] = lIllIIIllIlIllI("HBoCLBA=", "YwrXi");
        lIIllIlllIllI[lIIllIllllIII[28]] = lIllIIIllIlIlIl("2/7HPemkh/E=", "bgfTj");
        lIIllIlllIllI[lIIllIllllIII[29]] = lIllIIIllIlIllI("AzgqBgcENw==", "kYXvh");
        lIIllIlllIllI[lIIllIllllIII[30]] = lIllIIIllIlIlll("vkR8jiXmSeY=", "UArgI");
        lIIllIlllIllI[lIIllIllllIII[31]] = lIllIIIllIlIllI("CSsgMgVnIig8AQ==", "JCEQn");
    }

    public void f(int i) {
        this.m = i;
    }

    public void e(boolean z) {
        this.r = z;
    }

    public int G() {
        return this.l;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    public boolean l() {
        if (lIllIIIlllIIllI(m() ? 1 : 0) && lIllIIIlllIIllI(r() ? 1 : 0) && lIllIIIlllIIllI(q() ? 1 : 0)) {
            ?? r0 = lIIllIllllIII[1];
            "".length();
            return (((((150 + 214) - 202) + 56) ^ (((132 + 70) - 112) + 64)) & (((32 ^ 87) ^ (66 ^ 117)) ^ (-" ".length()))) >= "  ".length() ? ((((19 + 102) - 113) + 125) ^ (((68 + 148) - 68) + 37)) & (((((103 + 106) - 113) + 51) ^ (((123 + 25) - 69) + 96)) ^ (-" ".length())) : r0;
        }
        return lIIllIllllIII[0];
    }

    public int p() {
        return Inventory.getCount(item -> {
            return item.getName().contains(lIIllIlllIllI[lIIllIllllIII[25]]);
        });
    }

    public boolean I() {
        return this.n;
    }

    public void b(boolean z) {
        this.o = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [boolean] */
    public void v() {
        this.r = lIIllIllllIII[0];
    }

    public int D() {
        return this.i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v7, types: [boolean] */
    public void w() {
        this.j = lIIllIllllIII[1];
        this.n = lIIllIllllIII[0];
        this.q = lIIllIllllIII[0];
        this.f0p = lIIllIllllIII[0];
        this.s = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    public boolean m() {
        if (!lIllIIIlllIIlll(Inventory.contains(item -> {
            return item.getName().toLowerCase().contains(lIIllIlllIllI[lIIllIllllIII[29]]);
        }) ? 1 : 0) || lIllIIIlllIIllI(Equipment.contains(item2 -> {
            return item2.getName().toLowerCase().contains(lIIllIlllIllI[lIIllIllllIII[28]]);
        }) ? 1 : 0)) {
            ?? r0 = lIIllIllllIII[1];
            "".length();
            return 0 != 0 ? ((((68 + 88) - 30) + 60) ^ (((18 + 90) - (-17)) + 28)) & (((((108 + 52) - 19) + 19) ^ (((33 + 69) - (-12)) + 17)) ^ (-" ".length())) : r0;
        }
        return lIIllIllllIII[0];
    }

    public int C() {
        return this.h;
    }

    public StopWatch B() {
        return this.g;
    }

    private static boolean lIllIIIlllIIlll(int i) {
        return i == 0;
    }

    public void e(int i) {
        this.l = i;
    }
}
