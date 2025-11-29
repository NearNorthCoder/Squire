package r.o.u.a.r.v.s.i.s.v.q.d.r.i.p000.e;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import gg.squire.vardorvis.SquireVardorvis;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Base64;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.ChatMessageType;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.ChatMessage;
import net.runelite.api.events.GameTick;
import net.runelite.api.events.NpcSpawned;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Vars;
import net.unethicalite.client.Static;
@Singleton
/* renamed from: r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.e  reason: invalid package and case insensitive filesystem */
/* loaded from: 861c713a-2076-4f84-9c7c-f1dff7263a11.jar:r/o/u/a/r/v/s/i/s/v/q/d/r/i/-/e/e.class */
public class C0004e {
    private static /* synthetic */ int[] lIlIIllllllII;
    private static /* synthetic */ String[] lIlIIlllllIll;
    final /* synthetic */ SquireVardorvis I;
    final /* synthetic */ Client J;
    /* synthetic */ int K;
    /* synthetic */ int L;
    /* synthetic */ Set<Integer> M = new HashSet();
    /* synthetic */ List<C0007h> N = new ArrayList();
    /* synthetic */ List<Integer> O = new ArrayList();

    private static boolean lIllllIIlIllllI(int i) {
        return i != 0;
    }

    private int a(int i, int i2) {
        if (lIllllIIlIlllll(i, lIlIIllllllII[4])) {
            if (lIllllIIlIlllll(i2, lIlIIllllllII[4])) {
                return lIlIIllllllII[2];
            }
            if (lIllllIIlIlllll(i2, lIlIIllllllII[1])) {
                return lIlIIllllllII[0];
            }
            if (lIllllIIlIlllll(i2, lIlIIllllllII[7])) {
                return lIlIIllllllII[1];
            }
        }
        if (lIllllIIlIlllll(i, lIlIIllllllII[7])) {
            if (lIllllIIlIlllll(i2, lIlIIllllllII[4])) {
                return lIlIIllllllII[5];
            }
            if (lIllllIIlIlllll(i2, lIlIIllllllII[1])) {
                return lIlIIllllllII[4];
            }
            if (lIllllIIlIlllll(i2, lIlIIllllllII[7])) {
                return lIlIIllllllII[6];
            }
        }
        if (lIllllIIlIlllll(i, lIlIIllllllII[1])) {
            if (lIllllIIlIlllll(i2, lIlIIllllllII[4])) {
                return lIlIIllllllII[8];
            }
            if (lIllllIIlIlllll(i2, lIlIIllllllII[7])) {
                return lIlIIllllllII[9];
            }
        }
        return lIlIIllllllII[10];
    }

    public Set<Integer> B() {
        return this.M;
    }

    public void x() {
        this.I.b();
        this.M.clear();
        this.O.clear();
        this.N.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v6, types: [boolean] */
    @Subscribe(priority = 2.1474836E9f)
    public void a(ChatMessage chatMessage) {
        String message = chatMessage.getMessage();
        if (lIllllIIllIIIII(chatMessage.getType(), ChatMessageType.GAMEMESSAGE) && lIllllIIllIIIII(chatMessage.getType(), ChatMessageType.SPAM)) {
            return;
        }
        if (lIllllIIlIllllI(message.contains(lIlIIlllllIll[lIlIIllllllII[3]]) ? 1 : 0)) {
            x();
            System.out.println(lIlIIlllllIll[lIlIIllllllII[1]]);
            this.I.a();
        }
        if (lIllllIIlIllllI(message.contains(lIlIIlllllIll[lIlIIllllllII[0]]) ? 1 : 0)) {
            this.I.d((boolean) lIlIIllllllII[1]);
            x();
        }
    }

    private static void lIllllIIlIlllII() {
        lIlIIllllllII = new int[12];
        lIlIIllllllII[0] = "  ".length();
        lIlIIllllllII[1] = " ".length();
        lIlIIllllllII[2] = "   ".length();
        lIlIIllllllII[3] = ((16 ^ 71) ^ (230 ^ 154)) & (((32 ^ 47) ^ (56 ^ 28)) ^ (-" ".length()));
        lIlIIllllllII[4] = (72 ^ 87) ^ (174 ^ 183);
        lIlIIllllllII[5] = 53 ^ 48;
        lIlIIllllllII[6] = (((138 + 58) - 179) + 153) ^ (((69 + 2) - (-61)) + 41);
        lIlIIllllllII[7] = -((82 ^ 4) ^ (240 ^ 162));
        lIlIIllllllII[8] = 46 ^ 42;
        lIlIIllllllII[9] = 36 ^ 44;
        lIlIIllllllII[10] = -" ".length();
        lIlIIllllllII[11] = (-24617) & 30715;
    }

    static {
        lIllllIIlIlllII();
        lIllllIIlIllIll();
    }

    public List<C0007h> C() {
        return this.N;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v7, types: [boolean] */
    @Subscribe(priority = -2.1474836E9f)
    public void a(GameTick gameTick) {
        if (lIllllIIlIlllIl(this.O.size())) {
            System.out.println("Axes spawned: " + String.valueOf(this.O));
        }
        int tickCount = this.J.getTickCount();
        if (lIllllIIlIllllI(this.O.contains(Integer.valueOf(lIlIIllllllII[0])) ? 1 : 0)) {
            if (lIllllIIlIllllI(this.O.contains(Integer.valueOf(lIlIIllllllII[1])) ? 1 : 0) && lIllllIIlIllllI(this.O.contains(Integer.valueOf(lIlIIllllllII[2])) ? 1 : 0)) {
                this.N.add(new C0007h(tickCount + lIlIIllllllII[1], lIlIIllllllII[3], lIlIIllllllII[1]));
                "".length();
                "".length();
                if ("   ".length() < " ".length()) {
                    return;
                }
            } else if (lIllllIIlIllllI(this.O.contains(Integer.valueOf(lIlIIllllllII[1])) ? 1 : 0)) {
                this.N.add(new C0007h(tickCount + lIlIIllllllII[1], lIlIIllllllII[1], lIlIIllllllII[3]));
                "".length();
                "".length();
                if ((-"   ".length()) > 0) {
                    return;
                }
            } else {
                this.N.add(new C0007h(tickCount + lIlIIllllllII[1], lIlIIllllllII[3], lIlIIllllllII[3]));
                "".length();
            }
        }
        if (lIllllIIlIllllI(this.O.contains(Integer.valueOf(lIlIIllllllII[4])) ? 1 : 0)) {
            if (lIllllIIlIllllI(this.O.contains(Integer.valueOf(lIlIIllllllII[5])) ? 1 : 0) && lIllllIIlIllllI(this.O.contains(Integer.valueOf(lIlIIllllllII[6])) ? 1 : 0)) {
                this.N.add(new C0007h(tickCount + lIlIIllllllII[4], lIlIIllllllII[3], lIlIIllllllII[1]));
                "".length();
                "".length();
                if ((26 ^ 30) <= 0) {
                    return;
                }
            } else if (lIllllIIlIllllI(this.O.contains(Integer.valueOf(lIlIIllllllII[5])) ? 1 : 0)) {
                this.N.add(new C0007h(tickCount + lIlIIllllllII[4], lIlIIllllllII[1], lIlIIllllllII[3]));
                "".length();
                "".length();
                if ((((((121 + 22) - 37) + 47) ^ (((93 + 62) - 62) + 87)) & (((((112 + 86) - 178) + 113) ^ (((86 + 101) - 42) + 23)) ^ (-" ".length()))) >= " ".length()) {
                    return;
                }
            } else {
                this.N.add(new C0007h(tickCount + lIlIIllllllII[4], lIlIIllllllII[3], lIlIIllllllII[3]));
                "".length();
            }
        }
        this.O.clear();
    }

    public int A() {
        return this.L;
    }

    public List<Integer> D() {
        return this.O;
    }

    @Subscribe(priority = 2.1474836E9f)
    public void a(NpcSpawned npcSpawned) {
        NPC npc = npcSpawned.getNpc();
        if (lIllllIIlIlllll(npc.getId(), C0006g.V)) {
            Static.getClient().getTickCount();
            WorldPoint m = m();
            int worldX = m.getWorldX();
            int worldY = m.getWorldY();
            int worldX2 = npc.getWorldX();
            int worldY2 = npc.getWorldY();
            this.O.add(Integer.valueOf(a(worldX - worldX2, worldY - worldY2)));
            "".length();
        }
    }

    private static void lIllllIIlIllIll() {
        lIlIIlllllIll = new String[lIlIIllllllII[2]];
        lIlIIlllllIll[lIlIIllllllII[3]] = lIllllIIlIllIlI("xZyF/9PWBgzgmab3SvN5VGpWYEJUg8ZIAO+Re58ZiM8=", "UeinH");
        lIlIIlllllIll[lIlIIllllllII[1]] = lIllllIIlIllIlI("6HkJwPVbt0z1UIXXZm4ufw==", "bSnzi");
        lIlIIlllllIll[lIlIIllllllII[0]] = lIllllIIlIllIlI("HxJ3kHdDYHaXUYMo2kyW7z11layKHV02", "yGyKx");
    }

    private static boolean lIllllIIlIlllIl(int i) {
        return i > 0;
    }

    private static boolean lIllllIIlIlllll(int i, int i2) {
        return i == i2;
    }

    private static boolean lIllllIIllIIIIl(Object obj) {
        return obj == null;
    }

    private static boolean lIllllIIllIIIII(Object obj, Object obj2) {
        return obj != obj2;
    }

    private WorldPoint m() {
        int[] iArr = new int[lIlIIllllllII[1]];
        iArr[lIlIIllllllII[3]] = C0006g.R;
        TileObject nearest = TileObjects.getNearest(iArr);
        return lIllllIIllIIIIl(nearest) ? new WorldPoint(lIlIIllllllII[3], lIlIIllllllII[3], lIlIIllllllII[3]) : nearest.getWorldLocation().dx(lIlIIllllllII[0]).dy(lIlIIllllllII[5]);
    }

    private static String lIllllIIlIllIlI(String llllllllllllllIllIllIIllIlIIllII, String llllllllllllllIllIllIIllIlIIlIll) {
        try {
            SecretKeySpec llllllllllllllIllIllIIllIlIIllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIllIIllIlIIlIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllIllIIllIlIIlllI = Cipher.getInstance("Blowfish");
            llllllllllllllIllIllIIllIlIIlllI.init(lIlIIllllllII[0], llllllllllllllIllIllIIllIlIIllll);
            return new String(llllllllllllllIllIllIIllIlIIlllI.doFinal(Base64.getDecoder().decode(llllllllllllllIllIllIIllIlIIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIllIIllIlIIllIl) {
            llllllllllllllIllIllIIllIlIIllIl.printStackTrace();
            return null;
        }
    }

    public int z() {
        return this.K;
    }

    @Inject
    public C0004e(SquireVardorvis squireVardorvis, Client client) {
        this.I = squireVardorvis;
        this.J = client;
    }

    public int y() {
        return Vars.getBit(lIlIIllllllII[11]);
    }
}
