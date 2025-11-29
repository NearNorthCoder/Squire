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
        a var23;
        f var12;
        void var5;
        GraphicsObject graphicsObject = graphicsObjectCreated.getGraphicsObject();
        int n2 = Static.getClient().getTickCount();
        if (a.lllIIllIlIlIlI(graphicsObject.getId(), e.J)) {
            this.H = Static.getClient().getTickCount();
            this.E = graphicsObject;
        }
        if (a.lllIIllIlIlIlI(var5.getId(), e.N)) {
            void var24;
            var12 = new f((int)var24, (GraphicsObject)var5);
            var23.w.r().add(var12);
            0;
        }
        if (a.lllIIllIlIlIlI(var5.getId(), e.O)) {
            var12 = WorldPoint.fromLocal((Client)var23.x, (LocalPoint)var5.getLocation());
            var23.w.i().remove(var12);
            0;
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
        0;
        list.remove(worldPoint.dx(lIllIlIIIIlI[2]));
        0;
        list.remove(worldPoint.dx(lIllIlIIIIlI[3]));
        0;
        list.remove(worldPoint.dx(lIllIlIIIIlI[2]).dy(lIllIlIIIIlI[1]));
        0;
        list.remove(worldPoint.dx(lIllIlIIIIlI[1]).dy(lIllIlIIIIlI[4]));
        0;
        list.remove(worldPoint.dx(lIllIlIIIIlI[2]).dy(lIllIlIIIIlI[4]));
        0;
        list.remove(worldPoint.dx(lIllIlIIIIlI[3]).dy(lIllIlIIIIlI[4]));
        0;
        list.remove(worldPoint.dx(lIllIlIIIIlI[2]).dy(lIllIlIIIIlI[3]));
        0;
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
        void var31;
        Actor actor = animationChanged.getActor();
        if (a.lllIIllIlIllII(actor)) {
            return;
        }
        if (a.lllIIllIlIllIl(var31.getName().equals(lIllIlIIIIIl[lIllIlIIIIlI[0]]) ? 1 : 0) && a.lllIIllIlIlIlI(var31.getAnimation(), e.K)) {
            lllllllllllllllIllIIIIIIIIIIlIlI.G = Static.getClient().getTickCount();
        }
    }

    public int u() {
        return Vars.getBit((int)lIllIlIIIIlI[8]);
    }

    private static boolean lllIIllIlIllII(Object object) {
        return object == null;
    }

    private static String lllIIllIlIIllI(String var14, String var19) {
        try {
            SecretKeySpec var15 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var19.getBytes(StandardCharsets.UTF_8)), lIllIlIIIIlI[9]), "DES");
            Cipher var6 = Cipher.getInstance("DES");
            var6.init(lIllIlIIIIlI[2], var15);
            return new String(var6.doFinal(Base64.getDecoder().decode(var14.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var22) {
            var22.printStackTrace();
            return null;
        }
    }

    private static String lllIIllIlIIlIl(String var20, String var10) {
        var20 = new String(Base64.getDecoder().decode(var20.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var16 = new StringBuilder();
        char[] var2 = var10.toCharArray();
        int var28 = lIllIlIIIIlI[0];
        char[] var17 = var20.toCharArray();
        int var1 = var17.length;
        int var26 = lIllIlIIIIlI[0];
        while (a.lllIIllIlIllll(var26, var1)) {
            char var7 = var17[var26];
            var16.append((char)(var7 ^ var2[var28 % var2.length]));
            0;
            ++var28;
            ++var26;
            0;
            if (-(0xE1 ^ 0xB4 ^ (0xF8 ^ 0xA8)) < 0) continue;
            return null;
        }
        return String.valueOf(var16);
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
        a.lIllIlIIIIlI[1] = 1;
        a.lIllIlIIIIlI[2] = 2;
        a.lIllIlIIIIlI[3] = 3;
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
        a var25;
        void var27;
        String string = chatMessage.getMessage();
        if (a.lllIIllIlIlllI(chatMessage.getType(), ChatMessageType.GAMEMESSAGE) && a.lllIIllIlIlllI(chatMessage.getType(), ChatMessageType.SPAM)) {
            return;
        }
        if (a.lllIIllIlIllIl(var27.contains(lIllIlIIIIIl[lIllIlIIIIlI[1]]) ? 1 : 0)) {
            var25.y += lIllIlIIIIlI[1];
        }
        if (a.lllIIllIlIllIl(var27.contains(lIllIlIIIIIl[lIllIlIIIIlI[2]]) ? 1 : 0)) {
            var25.z += lIllIlIIIIlI[1];
        }
        if (a.lllIIllIlIllIl(var27.contains(lIllIlIIIIIl[lIllIlIIIIlI[3]]) ? 1 : 0)) {
            var25.A += lIllIlIIIIlI[1];
        }
        if (a.lllIIllIlIllIl(var27.contains(lIllIlIIIIIl[lIllIlIIIIlI[4]]) ? 1 : 0)) {
            var25.B += lIllIlIIIIlI[1];
        }
        if (a.lllIIllIlIllIl(var27.contains(lIllIlIIIIIl[lIllIlIIIIlI[5]]) ? 1 : 0)) {
            var25.t();
            var25.w.b();
            System.out.println(lIllIlIIIIIl[lIllIlIIIIlI[6]]);
            var25.D = Static.getClient().getTickCount();
            var25.d(lIllIlIIIIlI[1]);
            var25.w.f(lIllIlIIIIlI[1]);
        }
        if (a.lllIIllIlIllIl(var27.contains(lIllIlIIIIIl[lIllIlIIIIlI[7]]) ? 1 : 0)) {
            var25.e(lIllIlIIIIlI[1]);
            var25.t();
        }
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe(priority=2.1474836E9f)
    public void a(NpcDespawned npcDespawned) {
        void var13;
        NPC nPC = npcDespawned.getNpc();
        int n2 = nPC.getId();
        if (a.lllIIllIlIlIlI(n2, e.I)) {
            this.w.b(nPC.getWorldArea());
        }
        if (!a.lllIIllIlIlIll((int)var13, e.P) || !a.lllIIllIlIlIll((int)var13, e.Q) || a.lllIIllIlIlIlI((int)var13, e.R)) {
            void var30;
            a var11;
            var11.w.d(var11.a((NPC)var30));
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
        void var8;
        NPC nPC = npcSpawned.getNpc();
        int n2 = nPC.getId();
        if (a.lllIIllIlIlIlI(n2, e.I)) {
            this.w.a(nPC.getWorldArea());
        }
        if (!a.lllIIllIlIlIll((int)var8, e.P) || !a.lllIIllIlIlIll((int)var8, e.Q) || a.lllIIllIlIlIlI((int)var8, e.R)) {
            void var9;
            a var3;
            var3.w.c(var3.a((NPC)var9));
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
        a.lIllIlIIIIIl[a.lIllIlIIIIlI[0]] = a."Duke Sucellus";
        a.lIllIlIIIIIl[a.lIllIlIIIIlI[1]] = a."You add some arder powder to the vat";
        a.lIllIlIIIIIl[a.lIllIlIIIIlI[2]] = a."You add some musca powder to the vat";
        a.lIllIlIIIIIl[a.lIllIlIIIIlI[3]] = a."You add some salax salt to the vat";
        a.lIllIlIIIIIl[a.lIllIlIIIIlI[4]] = a."You collect some poison from the vat";
        a.lIllIlIIIIIl[a.lIllIlIIIIlI[5]] = a."Your Duke Sucellus kill count is";
        a.lIllIlIIIIIl[a.lIllIlIIIIlI[6]] = a."Finishing kill";
        a.lIllIlIIIIIl[a.lIllIlIIIIlI[7]] = a."Oh dear, you are dead!";
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

    private static String lllIIllIlIIlll(String var18, String var4) {
        try {
            SecretKeySpec var32 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var4.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var21 = Cipher.getInstance("Blowfish");
            var21.init(lIllIlIIIIlI[2], var32);
            return new String(var21.doFinal(Base64.getDecoder().decode(var18.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var29) {
            var29.printStackTrace();
            return null;
        }
    }
}

