/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  com.google.inject.Singleton
 *  net.runelite.api.Actor
 *  net.runelite.api.ChatMessageType
 *  net.runelite.api.Client
 *  net.runelite.api.GraphicsObject
 *  net.runelite.api.NPC
 *  net.runelite.api.Projectile
 *  net.runelite.api.coords.LocalPoint
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.events.AnimationChanged
 *  net.runelite.api.events.ChatMessage
 *  net.runelite.api.events.GraphicsObjectCreated
 *  net.runelite.api.events.NpcDespawned
 *  net.runelite.api.events.NpcSpawned
 *  net.runelite.api.events.ProjectileSpawned
 *  net.runelite.client.eventbus.Subscribe
 *  net.runelite.client.game.ItemManager
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.client.Static
 */
package k.-.u.u.l.i.s.r.c.d.-.q.u.e.u.e.e.s.s.l;

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
import k.-.u.u.l.i.s.r.c.d.-.q.u.e.u.e.e.s.s.l.e;
import k.-.u.u.l.i.s.r.c.d.-.q.u.e.u.e.e.s.s.l.f;
import net.runelite.api.Actor;
import net.runelite.api.ChatMessageType;
import net.runelite.api.Client;
import net.runelite.api.GraphicsObject;
import net.runelite.api.NPC;
import net.runelite.api.Projectile;
import net.runelite.api.coords.LocalPoint;
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
public class a {
    private static /* synthetic */ int[] lIllIlIIIIlI;
    private /* synthetic */ int H;
    private /* synthetic */ int G;
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

    /*
     * WARNING - void declaration
     */
    @Subscribe(priority=2.1474836E9f)
    public void a(GraphicsObjectCreated graphicsObjectCreated) {
        a lllllllllllllllIllIIIIIIIIIIIIlI;
        f lllllllllllllllIlIlllllllllllllI;
        void lllllllllllllllIllIIIIIIIIIIIIII;
        GraphicsObject graphicsObject = graphicsObjectCreated.getGraphicsObject();
        int n2 = Static.getClient().getTickCount();
        if (a.lllIIllIlIlIlI(graphicsObject.getId(), e.J)) {
            this.H = Static.getClient().getTickCount();
            this.E = graphicsObject;
        }
        if (a.lllIIllIlIlIlI(lllllllllllllllIllIIIIIIIIIIIIII.getId(), e.N)) {
            void lllllllllllllllIlIllllllllllllll;
            lllllllllllllllIlIlllllllllllllI = new f((int)lllllllllllllllIlIllllllllllllll, (GraphicsObject)lllllllllllllllIllIIIIIIIIIIIIII);
            lllllllllllllllIllIIIIIIIIIIIIlI.w.r().add(lllllllllllllllIlIlllllllllllllI);
            "".length();
        }
        if (a.lllIIllIlIlIlI(lllllllllllllllIllIIIIIIIIIIIIII.getId(), e.O)) {
            lllllllllllllllIlIlllllllllllllI = WorldPoint.fromLocal((Client)lllllllllllllllIllIIIIIIIIIIIIlI.x, (LocalPoint)lllllllllllllllIllIIIIIIIIIIIIII.getLocation());
            lllllllllllllllIllIIIIIIIIIIIIlI.w.i().remove(lllllllllllllllIlIlllllllllllllI);
            "".length();
        }
    }

    public int z() {
        return this.C;
    }

    public int D() {
        return this.H;
    }

    private List<WorldPoint> a(NPC nPC) {
        if (a.lllIIllIlIllII(nPC)) {
            return Collections.emptyList();
        }
        WorldPoint worldPoint = nPC.getWorldLocation();
        List list = nPC.getWorldArea().toWorldPointList();
        list.remove(worldPoint.dx(lIllIlIIIIlI[1]));
        "".length();
        list.remove(worldPoint.dx(lIllIlIIIIlI[2]));
        "".length();
        list.remove(worldPoint.dx(lIllIlIIIIlI[3]));
        "".length();
        list.remove(worldPoint.dx(lIllIlIIIIlI[2]).dy(lIllIlIIIIlI[1]));
        "".length();
        list.remove(worldPoint.dx(lIllIlIIIIlI[1]).dy(lIllIlIIIIlI[4]));
        "".length();
        list.remove(worldPoint.dx(lIllIlIIIIlI[2]).dy(lIllIlIIIIlI[4]));
        "".length();
        list.remove(worldPoint.dx(lIllIlIIIIlI[3]).dy(lIllIlIIIIlI[4]));
        "".length();
        list.remove(worldPoint.dx(lIllIlIIIIlI[2]).dy(lIllIlIIIIlI[3]));
        "".length();
        return list;
    }

    private static boolean lllIIllIlIlIlI(int n2, int n3) {
        return n2 == n3;
    }

    @Inject
    public a(SquireDukeSucellus squireDukeSucellus, Client client) {
        this.G = lIllIlIIIIlI[0];
        this.w = squireDukeSucellus;
        this.x = client;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe(priority=2.1474836E9f)
    public void a(AnimationChanged animationChanged) {
        void lllllllllllllllIllIIIIIIIIIIlIII;
        Actor actor = animationChanged.getActor();
        if (a.lllIIllIlIllII(actor)) {
            return;
        }
        if (a.lllIIllIlIllIl(lllllllllllllllIllIIIIIIIIIIlIII.getName().equals(lIllIlIIIIIl[lIllIlIIIIlI[0]]) ? 1 : 0) && a.lllIIllIlIlIlI(lllllllllllllllIllIIIIIIIIIIlIII.getAnimation(), e.K)) {
            lllllllllllllllIllIIIIIIIIIIlIlI.G = Static.getClient().getTickCount();
        }
    }

    public int u() {
        return Vars.getBit((int)lIllIlIIIIlI[8]);
    }

    private static boolean lllIIllIlIllII(Object object) {
        return object == null;
    }

    private static String lllIIllIlIIllI(String lllllllllllllllIlIllllllllIlIIII, String lllllllllllllllIlIllllllllIIllll) {
        try {
            SecretKeySpec lllllllllllllllIlIllllllllIlIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIllllllllIIllll.getBytes(StandardCharsets.UTF_8)), lIllIlIIIIlI[9]), "DES");
            Cipher lllllllllllllllIlIllllllllIlIlII = Cipher.getInstance("DES");
            lllllllllllllllIlIllllllllIlIlII.init(lIllIlIIIIlI[2], lllllllllllllllIlIllllllllIlIlIl);
            return new String(lllllllllllllllIlIllllllllIlIlII.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIllllllllIlIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIllllllllIlIIll) {
            lllllllllllllllIlIllllllllIlIIll.printStackTrace();
            return null;
        }
    }

    private static String lllIIllIlIIlIl(String lllllllllllllllIlIlllllllllIIlll, String lllllllllllllllIlIlllllllllIIIIl) {
        lllllllllllllllIlIlllllllllIIlll = new String(Base64.getDecoder().decode(lllllllllllllllIlIlllllllllIIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlIlllllllllIIlIl = new StringBuilder();
        char[] lllllllllllllllIlIlllllllllIIlII = lllllllllllllllIlIlllllllllIIIIl.toCharArray();
        int lllllllllllllllIlIlllllllllIIIll = lIllIlIIIIlI[0];
        char[] lllllllllllllllIlIllllllllIlllIl = lllllllllllllllIlIlllllllllIIlll.toCharArray();
        int lllllllllllllllIlIllllllllIlllII = lllllllllllllllIlIllllllllIlllIl.length;
        int lllllllllllllllIlIllllllllIllIll = lIllIlIIIIlI[0];
        while (a.lllIIllIlIllll(lllllllllllllllIlIllllllllIllIll, lllllllllllllllIlIllllllllIlllII)) {
            char lllllllllllllllIlIlllllllllIlIII = lllllllllllllllIlIllllllllIlllIl[lllllllllllllllIlIllllllllIllIll];
            lllllllllllllllIlIlllllllllIIlIl.append((char)(lllllllllllllllIlIlllllllllIlIII ^ lllllllllllllllIlIlllllllllIIlII[lllllllllllllllIlIlllllllllIIIll % lllllllllllllllIlIlllllllllIIlII.length]));
            "".length();
            ++lllllllllllllllIlIlllllllllIIIll;
            ++lllllllllllllllIlIllllllllIllIll;
            "".length();
            if (-(0xE1 ^ 0xB4 ^ (0xF8 ^ 0xA8)) < 0) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIlIlllllllllIIlIl);
    }

    public int x() {
        return this.A;
    }

    private static boolean lllIIllIlIllIl(int n2) {
        return n2 != 0;
    }

    private static void lllIIllIlIlIIl() {
        lIllIlIIIIlI = new int[10];
        a.lIllIlIIIIlI[0] = (0xF5 ^ 0xB4) & ~(0x87 ^ 0xC6);
        a.lIllIlIIIIlI[1] = " ".length();
        a.lIllIlIIIIlI[2] = "  ".length();
        a.lIllIlIIIIlI[3] = "   ".length();
        a.lIllIlIIIIlI[4] = 0xAD ^ 0xA9;
        a.lIllIlIIIIlI[5] = 16 + 107 - 103 + 123 ^ 47 + 116 - 127 + 102;
        a.lIllIlIIIIlI[6] = 40 + 111 - 105 + 88 ^ 127 + 28 - 39 + 12;
        a.lIllIlIIIIlI[7] = 0xB0 ^ 0xB7;
        a.lIllIlIIIIlI[8] = 0xFFFFBFD3 & 0x57FF;
        a.lIllIlIIIIlI[9] = 111 + 56 - 75 + 97 ^ 160 + 91 - 229 + 159;
    }

    private static boolean lllIIllIlIlllI(Object object, Object object2) {
        return object != object2;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe(priority=2.1474836E9f)
    public void a(ChatMessage chatMessage) {
        a lllllllllllllllIlIllllllllllIlII;
        void lllllllllllllllIlIllllllllllIIlI;
        String string = chatMessage.getMessage();
        if (a.lllIIllIlIlllI(chatMessage.getType(), ChatMessageType.GAMEMESSAGE) && a.lllIIllIlIlllI(chatMessage.getType(), ChatMessageType.SPAM)) {
            return;
        }
        if (a.lllIIllIlIllIl(lllllllllllllllIlIllllllllllIIlI.contains(lIllIlIIIIIl[lIllIlIIIIlI[1]]) ? 1 : 0)) {
            lllllllllllllllIlIllllllllllIlII.y += lIllIlIIIIlI[1];
        }
        if (a.lllIIllIlIllIl(lllllllllllllllIlIllllllllllIIlI.contains(lIllIlIIIIIl[lIllIlIIIIlI[2]]) ? 1 : 0)) {
            lllllllllllllllIlIllllllllllIlII.z += lIllIlIIIIlI[1];
        }
        if (a.lllIIllIlIllIl(lllllllllllllllIlIllllllllllIIlI.contains(lIllIlIIIIIl[lIllIlIIIIlI[3]]) ? 1 : 0)) {
            lllllllllllllllIlIllllllllllIlII.A += lIllIlIIIIlI[1];
        }
        if (a.lllIIllIlIllIl(lllllllllllllllIlIllllllllllIIlI.contains(lIllIlIIIIIl[lIllIlIIIIlI[4]]) ? 1 : 0)) {
            lllllllllllllllIlIllllllllllIlII.B += lIllIlIIIIlI[1];
        }
        if (a.lllIIllIlIllIl(lllllllllllllllIlIllllllllllIIlI.contains(lIllIlIIIIIl[lIllIlIIIIlI[5]]) ? 1 : 0)) {
            lllllllllllllllIlIllllllllllIlII.t();
            lllllllllllllllIlIllllllllllIlII.w.b();
            System.out.println(lIllIlIIIIIl[lIllIlIIIIlI[6]]);
            lllllllllllllllIlIllllllllllIlII.D = Static.getClient().getTickCount();
            lllllllllllllllIlIllllllllllIlII.d(lIllIlIIIIlI[1]);
            lllllllllllllllIlIllllllllllIlII.w.f(lIllIlIIIIlI[1]);
        }
        if (a.lllIIllIlIllIl(lllllllllllllllIlIllllllllllIIlI.contains(lIllIlIIIIIl[lIllIlIIIIlI[7]]) ? 1 : 0)) {
            lllllllllllllllIlIllllllllllIlII.e(lIllIlIIIIlI[1]);
            lllllllllllllllIlIllllllllllIlII.t();
        }
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe(priority=2.1474836E9f)
    public void a(NpcDespawned npcDespawned) {
        void lllllllllllllllIllIIIIIIIIIIlllI;
        NPC nPC = npcDespawned.getNpc();
        int n2 = nPC.getId();
        if (a.lllIIllIlIlIlI(n2, e.I)) {
            this.w.b(nPC.getWorldArea());
        }
        if (!a.lllIIllIlIlIll((int)lllllllllllllllIllIIIIIIIIIIlllI, e.P) || !a.lllIIllIlIlIll((int)lllllllllllllllIllIIIIIIIIIIlllI, e.Q) || a.lllIIllIlIlIlI((int)lllllllllllllllIllIIIIIIIIIIlllI, e.R)) {
            void lllllllllllllllIllIIIIIIIIIIllll;
            a lllllllllllllllIllIIIIIIIIIlIIIl;
            lllllllllllllllIllIIIIIIIIIlIIIl.w.d(lllllllllllllllIllIIIIIIIIIlIIIl.a((NPC)lllllllllllllllIllIIIIIIIIIIllll));
        }
    }

    public int v() {
        return this.y;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe(priority=2.1474836E9f)
    public void a(NpcSpawned npcSpawned) {
        void lllllllllllllllIllIIIIIIIIIlllII;
        NPC nPC = npcSpawned.getNpc();
        int n2 = nPC.getId();
        if (a.lllIIllIlIlIlI(n2, e.I)) {
            this.w.a(nPC.getWorldArea());
        }
        if (!a.lllIIllIlIlIll((int)lllllllllllllllIllIIIIIIIIIlllII, e.P) || !a.lllIIllIlIlIll((int)lllllllllllllllIllIIIIIIIIIlllII, e.Q) || a.lllIIllIlIlIlI((int)lllllllllllllllIllIIIIIIIIIlllII, e.R)) {
            void lllllllllllllllIllIIIIIIIIIlllIl;
            a lllllllllllllllIllIIIIIIIIIlllll;
            lllllllllllllllIllIIIIIIIIIlllll.w.c(lllllllllllllllIllIIIIIIIIIlllll.a((NPC)lllllllllllllllIllIIIIIIIIIlllIl));
        }
    }

    public void t() {
        this.w.a();
        this.y = lIllIlIIIIlI[0];
        this.z = lIllIlIIIIlI[0];
        this.A = lIllIlIIIIlI[0];
        this.B = lIllIlIIIIlI[0];
        this.H = lIllIlIIIIlI[0];
        this.h = lIllIlIIIIlI[1];
        this.w.c(lIllIlIIIIlI[0]);
    }

    private void e(boolean bl) {
        this.w.e(bl);
    }

    private static void lllIIllIlIlIII() {
        lIllIlIIIIIl = new String[lIllIlIIIIlI[9]];
        a.lIllIlIIIIIl[a.lIllIlIIIIlI[0]] = a.lllIIllIlIIlIl("PgcRH0EpBxkfDRYHCQ==", "zrzza");
        a.lIllIlIIIIIl[a.lIllIlIIIIlI[1]] = a.lllIIllIlIIlIl("FjUaeigrPk8pJiI/Tzs7Kz8dejkgLQs/O28uAHo9Jz9PLCg7", "OZoZI");
        a.lIllIlIIIIIl[a.lIllIlIIIIlI[2]] = a.lllIIllIlIIllI("JuLxiSFUr1Qi5FvLP2myFru44RqkFr1NUrXPiQwnq8wz6ScMz5wQTg==", "dNfav");
        a.lIllIlIIIIIl[a.lIllIlIIIIlI[3]] = a.lllIIllIlIIllI("+fGa9sp/4AZqUP6sTRhDKHnhDIMKdJjFzqD0crkSjIRhOU+B61OaxQ==", "kAunA");
        a.lIllIlIIIIIl[a.lIllIlIIIIlI[4]] = a.lllIIllIlIIllI("NO/jHDswv4/PtfHicDdopmxZ4T/evBXuaTPFUmhbkO5sUQ3FuAkvfA==", "prLVj");
        a.lIllIlIIIIIl[a.lIllIlIIIIlI[5]] = a.lllIIllIlIIllI("W5uGaHYi5i7Br4G4CNj/ws3Mc5+qQ+/kvMpKyU/1QH68bzQpf45N0w==", "mXLzs");
        a.lIllIlIIIIIl[a.lIllIlIIIIlI[6]] = a.lllIIllIlIIlll("vU7jdbceyeaqwRS/g0ZDug==", "wYIdB");
        a.lIllIlIIIIIl[a.lIllIlIIIIlI[7]] = a.lllIIllIlIIlIl("KRxGDC0HBkpIMQkBRgk6A1QCDSkCVQ==", "ftfhH");
    }

    private static boolean lllIIllIlIlIll(int n2, int n3) {
        return n2 != n3;
    }

    @Subscribe(priority=2.1474836E9f)
    public void a(ProjectileSpawned projectileSpawned) {
        Projectile projectile = projectileSpawned.getProjectile();
        if (a.lllIIllIlIlIlI(projectile.getId(), e.M)) {
            this.h = this.w.j();
            this.w.c(lIllIlIIIIlI[1]);
        }
    }

    static {
        a.lllIIllIlIlIIl();
        a.lllIIllIlIlIII();
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

    private void d(boolean bl) {
        this.w.d(bl);
    }

    private static boolean lllIIllIlIllll(int n2, int n3) {
        return n2 < n3;
    }

    public int A() {
        return this.D;
    }

    private static String lllIIllIlIIlll(String lllllllllllllllIlIllllllllIIIIll, String lllllllllllllllIlIllllllllIIIIlI) {
        try {
            SecretKeySpec lllllllllllllllIlIllllllllIIlIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIllllllllIIIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIllllllllIIIlll = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIllllllllIIIlll.init(lIllIlIIIIlI[2], lllllllllllllllIlIllllllllIIlIII);
            return new String(lllllllllllllllIlIllllllllIIIlll.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIllllllllIIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIllllllllIIIllI) {
            lllllllllllllllIlIllllllllIIIllI.printStackTrace();
            return null;
        }
    }
}

