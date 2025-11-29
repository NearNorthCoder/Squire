package k.p000.u.u.l.i.s.r.c.d.p001.q.u.e.u.e.e.s.s.l;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import gg.squire.duke.SquireDukeSucellus;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Collections;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Actor;
import net.runelite.api.ChatMessageType;
import net.runelite.api.Client;
import net.runelite.api.GraphicsObject;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.AnimationChanged;
import net.runelite.api.events.ChatMessage;
import net.runelite.api.events.GraphicsObjectCreated;
import net.runelite.api.events.NpcDespawned;
import net.runelite.api.events.NpcSpawned;
import net.runelite.api.events.ProjectileSpawned;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.game.ItemManager;
import net.unethicalite.api.game.Vars;
import net.unethicalite.client.Static;
@Singleton
/* renamed from: k.-.u.u.l.i.s.r.c.d.-.q.u.e.u.e.e.s.s.l.a  reason: invalid package and case insensitive filesystem */
/* loaded from: 2266a50d-0893-46c4-a132-50718fc51d1a.jar:k/-/u/u/l/i/s/r/c/d/-/q/u/e/u/e/e/s/s/l/a.class */
public class C0000a {
    private static /* synthetic */ int[] lIllIlIIIIlI;
    private /* synthetic */ int H;
    private /* synthetic */ int G = lIllIlIIIIlI[0];
    /* synthetic */ int z;
    final /* synthetic */ Client x;
    @Inject
    private /* synthetic */ ItemManager F;
    /* synthetic */ int C;
    /* synthetic */ int B;
    private /* synthetic */ boolean h;
    /* synthetic */ int y;
    /* synthetic */ int D;
    private static /* synthetic */ String[] lIllIlIIIIIl;
    final /* synthetic */ SquireDukeSucellus w;
    /* synthetic */ GraphicsObject E;
    /* synthetic */ int A;

    @Subscribe(priority = 2.1474836E9f)
    public void a(GraphicsObjectCreated graphicsObjectCreated) {
        GraphicsObject graphicsObject = graphicsObjectCreated.getGraphicsObject();
        int lllllllllllllllIlIllllllllllllll = Static.getClient().getTickCount();
        if (lllIIllIlIlIlI(graphicsObject.getId(), C0004e.J)) {
            this.H = Static.getClient().getTickCount();
            this.E = graphicsObject;
        }
        if (lllIIllIlIlIlI(graphicsObject.getId(), C0004e.N)) {
            this.w.r().add(new C0005f(lllllllllllllllIlIllllllllllllll, graphicsObject));
            "".length();
        }
        if (lllIIllIlIlIlI(graphicsObject.getId(), C0004e.O)) {
            this.w.i().remove(WorldPoint.fromLocal(this.x, graphicsObject.getLocation()));
            "".length();
        }
    }

    public int z() {
        return this.C;
    }

    public int D() {
        return this.H;
    }

    private List<WorldPoint> a(NPC npc) {
        if (lllIIllIlIllII(npc)) {
            return Collections.emptyList();
        }
        WorldPoint worldLocation = npc.getWorldLocation();
        List<WorldPoint> worldPointList = npc.getWorldArea().toWorldPointList();
        worldPointList.remove(worldLocation.dx(lIllIlIIIIlI[1]));
        "".length();
        worldPointList.remove(worldLocation.dx(lIllIlIIIIlI[2]));
        "".length();
        worldPointList.remove(worldLocation.dx(lIllIlIIIIlI[3]));
        "".length();
        worldPointList.remove(worldLocation.dx(lIllIlIIIIlI[2]).dy(lIllIlIIIIlI[1]));
        "".length();
        worldPointList.remove(worldLocation.dx(lIllIlIIIIlI[1]).dy(lIllIlIIIIlI[4]));
        "".length();
        worldPointList.remove(worldLocation.dx(lIllIlIIIIlI[2]).dy(lIllIlIIIIlI[4]));
        "".length();
        worldPointList.remove(worldLocation.dx(lIllIlIIIIlI[3]).dy(lIllIlIIIIlI[4]));
        "".length();
        worldPointList.remove(worldLocation.dx(lIllIlIIIIlI[2]).dy(lIllIlIIIIlI[3]));
        "".length();
        return worldPointList;
    }

    private static boolean lllIIllIlIlIlI(int i, int i2) {
        return i == i2;
    }

    @Inject
    public C0000a(SquireDukeSucellus squireDukeSucellus, Client client) {
        this.w = squireDukeSucellus;
        this.x = client;
    }

    @Subscribe(priority = 2.1474836E9f)
    public void a(AnimationChanged animationChanged) {
        Actor actor = animationChanged.getActor();
        if (!lllIIllIlIllII(actor) && lllIIllIlIllIl(actor.getName().equals(lIllIlIIIIIl[lIllIlIIIIlI[0]]) ? 1 : 0) && lllIIllIlIlIlI(actor.getAnimation(), C0004e.K)) {
            this.G = Static.getClient().getTickCount();
        }
    }

    public int u() {
        return Vars.getBit(lIllIlIIIIlI[8]);
    }

    private static boolean lllIIllIlIllII(Object obj) {
        return obj == null;
    }

    private static String lllIIllIlIIllI(String lllllllllllllllIlIllllllllIlIIlI, String lllllllllllllllIlIllllllllIlIIIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIllllllllIlIIIl.getBytes(StandardCharsets.UTF_8)), lIllIlIIIIlI[9]), "DES");
            Cipher lllllllllllllllIlIllllllllIlIlII = Cipher.getInstance("DES");
            lllllllllllllllIlIllllllllIlIlII.init(lIllIlIIIIlI[2], secretKeySpec);
            return new String(lllllllllllllllIlIllllllllIlIlII.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIllllllllIlIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIllllllllIlIIll) {
            lllllllllllllllIlIllllllllIlIIll.printStackTrace();
            return null;
        }
    }

    private static String lllIIllIlIIlIl(String lllllllllllllllIlIlllllllllIIIlI, String lllllllllllllllIlIlllllllllIIllI) {
        String lllllllllllllllIlIlllllllllIIIlI2 = new String(Base64.getDecoder().decode(lllllllllllllllIlIlllllllllIIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlIlllllllllIIlIl = new StringBuilder();
        char[] charArray = lllllllllllllllIlIlllllllllIIllI.toCharArray();
        int lllllllllllllllIlIlllllllllIIIll = lIllIlIIIIlI[0];
        char[] charArray2 = lllllllllllllllIlIlllllllllIIIlI2.toCharArray();
        int length = charArray2.length;
        int i = lIllIlIIIIlI[0];
        while (lllIIllIlIllll(i, length)) {
            char lllllllllllllllIlIlllllllllIlIII = charArray2[i];
            lllllllllllllllIlIlllllllllIIlIl.append((char) (lllllllllllllllIlIlllllllllIlIII ^ charArray[lllllllllllllllIlIlllllllllIIIll % charArray.length]));
            "".length();
            lllllllllllllllIlIlllllllllIIIll++;
            i++;
            "".length();
            if ((-((225 ^ 180) ^ (248 ^ 168))) >= 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIlIlllllllllIIlIl);
    }

    public int x() {
        return this.A;
    }

    private static boolean lllIIllIlIllIl(int i) {
        return i != 0;
    }

    private static void lllIIllIlIlIIl() {
        lIllIlIIIIlI = new int[10];
        lIllIlIIIIlI[0] = (245 ^ 180) & ((135 ^ 198) ^ (-1));
        lIllIlIIIIlI[1] = " ".length();
        lIllIlIIIIlI[2] = "  ".length();
        lIllIlIIIIlI[3] = "   ".length();
        lIllIlIIIIlI[4] = 173 ^ 169;
        lIllIlIIIIlI[5] = (((16 + 107) - 103) + 123) ^ (((47 + 116) - 127) + 102);
        lIllIlIIIIlI[6] = (((40 + 111) - 105) + 88) ^ (((127 + 28) - 39) + 12);
        lIllIlIIIIlI[7] = 176 ^ 183;
        lIllIlIIIIlI[8] = (-16429) & 22527;
        lIllIlIIIIlI[9] = (((111 + 56) - 75) + 97) ^ (((160 + 91) - 229) + 159);
    }

    private static boolean lllIIllIlIlllI(Object obj, Object obj2) {
        return obj != obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v22, types: [boolean] */
    @Subscribe(priority = 2.1474836E9f)
    public void a(ChatMessage chatMessage) {
        String message = chatMessage.getMessage();
        if (lllIIllIlIlllI(chatMessage.getType(), ChatMessageType.GAMEMESSAGE) && lllIIllIlIlllI(chatMessage.getType(), ChatMessageType.SPAM)) {
            return;
        }
        if (lllIIllIlIllIl(message.contains(lIllIlIIIIIl[lIllIlIIIIlI[1]]) ? 1 : 0)) {
            this.y += lIllIlIIIIlI[1];
        }
        if (lllIIllIlIllIl(message.contains(lIllIlIIIIIl[lIllIlIIIIlI[2]]) ? 1 : 0)) {
            this.z += lIllIlIIIIlI[1];
        }
        if (lllIIllIlIllIl(message.contains(lIllIlIIIIIl[lIllIlIIIIlI[3]]) ? 1 : 0)) {
            this.A += lIllIlIIIIlI[1];
        }
        if (lllIIllIlIllIl(message.contains(lIllIlIIIIIl[lIllIlIIIIlI[4]]) ? 1 : 0)) {
            this.B += lIllIlIIIIlI[1];
        }
        if (lllIIllIlIllIl(message.contains(lIllIlIIIIIl[lIllIlIIIIlI[5]]) ? 1 : 0)) {
            t();
            this.w.b();
            System.out.println(lIllIlIIIIIl[lIllIlIIIIlI[6]]);
            this.D = Static.getClient().getTickCount();
            d(lIllIlIIIIlI[1]);
            this.w.f((boolean) lIllIlIIIIlI[1]);
        }
        if (lllIIllIlIllIl(message.contains(lIllIlIIIIIl[lIllIlIIIIlI[7]]) ? 1 : 0)) {
            e(lIllIlIIIIlI[1]);
            t();
        }
    }

    @Subscribe(priority = 2.1474836E9f)
    public void a(NpcDespawned npcDespawned) {
        NPC npc = npcDespawned.getNpc();
        int id = npc.getId();
        if (lllIIllIlIlIlI(id, C0004e.I)) {
            this.w.b(npc.getWorldArea());
        }
        if (lllIIllIlIlIll(id, C0004e.P) && lllIIllIlIlIll(id, C0004e.Q) && !lllIIllIlIlIlI(id, C0004e.R)) {
            return;
        }
        this.w.d(a(npc));
    }

    public int v() {
        return this.y;
    }

    @Subscribe(priority = 2.1474836E9f)
    public void a(NpcSpawned npcSpawned) {
        NPC npc = npcSpawned.getNpc();
        int id = npc.getId();
        if (lllIIllIlIlIlI(id, C0004e.I)) {
            this.w.a(npc.getWorldArea());
        }
        if (lllIIllIlIlIll(id, C0004e.P) && lllIIllIlIlIll(id, C0004e.Q) && !lllIIllIlIlIlI(id, C0004e.R)) {
            return;
        }
        this.w.c(a(npc));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v13, types: [boolean] */
    public void t() {
        this.w.a();
        this.y = lIllIlIIIIlI[0];
        this.z = lIllIlIIIIlI[0];
        this.A = lIllIlIIIIlI[0];
        this.B = lIllIlIIIIlI[0];
        this.H = lIllIlIIIIlI[0];
        this.h = lIllIlIIIIlI[1];
        this.w.c((boolean) lIllIlIIIIlI[0]);
    }

    private void e(boolean z) {
        this.w.e(z);
    }

    private static void lllIIllIlIlIII() {
        lIllIlIIIIIl = new String[lIllIlIIIIlI[9]];
        lIllIlIIIIIl[lIllIlIIIIlI[0]] = lllIIllIlIIlIl("PgcRH0EpBxkfDRYHCQ==", "zrzza");
        lIllIlIIIIIl[lIllIlIIIIlI[1]] = lllIIllIlIIlIl("FjUaeigrPk8pJiI/Tzs7Kz8dejkgLQs/O28uAHo9Jz9PLCg7", "OZoZI");
        lIllIlIIIIIl[lIllIlIIIIlI[2]] = lllIIllIlIIllI("JuLxiSFUr1Qi5FvLP2myFru44RqkFr1NUrXPiQwnq8wz6ScMz5wQTg==", "dNfav");
        lIllIlIIIIIl[lIllIlIIIIlI[3]] = lllIIllIlIIllI("+fGa9sp/4AZqUP6sTRhDKHnhDIMKdJjFzqD0crkSjIRhOU+B61OaxQ==", "kAunA");
        lIllIlIIIIIl[lIllIlIIIIlI[4]] = lllIIllIlIIllI("NO/jHDswv4/PtfHicDdopmxZ4T/evBXuaTPFUmhbkO5sUQ3FuAkvfA==", "prLVj");
        lIllIlIIIIIl[lIllIlIIIIlI[5]] = lllIIllIlIIllI("W5uGaHYi5i7Br4G4CNj/ws3Mc5+qQ+/kvMpKyU/1QH68bzQpf45N0w==", "mXLzs");
        lIllIlIIIIIl[lIllIlIIIIlI[6]] = lllIIllIlIIlll("vU7jdbceyeaqwRS/g0ZDug==", "wYIdB");
        lIllIlIIIIIl[lIllIlIIIIlI[7]] = lllIIllIlIIlIl("KRxGDC0HBkpIMQkBRgk6A1QCDSkCVQ==", "ftfhH");
    }

    private static boolean lllIIllIlIlIll(int i, int i2) {
        return i != i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [boolean] */
    @Subscribe(priority = 2.1474836E9f)
    public void a(ProjectileSpawned projectileSpawned) {
        if (lllIIllIlIlIlI(projectileSpawned.getProjectile().getId(), C0004e.M)) {
            this.h = this.w.j();
            this.w.c((boolean) lIllIlIIIIlI[1]);
        }
    }

    static {
        lllIIllIlIlIIl();
        lllIIllIlIlIII();
    }

    public int w() {
        return this.z;
    }

    public int y() {
        return this.B;
    }

    public int C() {
        return this.G;
    }

    public GraphicsObject B() {
        return this.E;
    }

    public boolean j() {
        return this.h;
    }

    private void d(boolean z) {
        this.w.d(z);
    }

    private static boolean lllIIllIlIllll(int i, int i2) {
        return i < i2;
    }

    public int A() {
        return this.D;
    }

    private static String lllIIllIlIIlll(String lllllllllllllllIlIllllllllIIIlIl, String lllllllllllllllIlIllllllllIIIlII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIllllllllIIIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIllllllllIIIlll = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIllllllllIIIlll.init(lIllIlIIIIlI[2], secretKeySpec);
            return new String(lllllllllllllllIlIllllllllIIIlll.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIllllllllIIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIllllllllIIIllI) {
            lllllllllllllllIlIllllllllIIIllI.printStackTrace();
            return null;
        }
    }
}
