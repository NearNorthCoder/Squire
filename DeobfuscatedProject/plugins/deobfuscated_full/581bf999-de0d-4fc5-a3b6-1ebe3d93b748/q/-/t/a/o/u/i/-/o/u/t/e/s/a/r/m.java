/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.inject.Inject
 *  javax.inject.Singleton
 *  net.runelite.api.Client
 *  net.runelite.api.GameObject
 *  net.runelite.api.GameState
 *  net.runelite.api.GraphicsObject
 *  net.runelite.api.NPC
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.LocalPoint
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.events.ChatMessage
 *  net.runelite.api.events.GameObjectDespawned
 *  net.runelite.api.events.GameObjectSpawned
 *  net.runelite.api.events.GameStateChanged
 *  net.runelite.api.events.GraphicsObjectCreated
 *  net.runelite.api.events.NpcDespawned
 *  net.runelite.api.events.NpcSpawned
 *  net.runelite.client.eventbus.Subscribe
 *  net.unethicalite.api.entities.TileObjects
 */
package q.-.t.a.o.u.i.-.o.u.t.e.s.a.r;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import javax.inject.Singleton;
import net.runelite.api.Client;
import net.runelite.api.GameObject;
import net.runelite.api.GameState;
import net.runelite.api.GraphicsObject;
import net.runelite.api.NPC;
import net.runelite.api.TileObject;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.ChatMessage;
import net.runelite.api.events.GameObjectDespawned;
import net.runelite.api.events.GameObjectSpawned;
import net.runelite.api.events.GameStateChanged;
import net.runelite.api.events.GraphicsObjectCreated;
import net.runelite.api.events.NpcDespawned;
import net.runelite.api.events.NpcSpawned;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.TileObjects;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.n;

@Singleton
public class m {
    private /* synthetic */ NPC ak;
    private /* synthetic */ int am;
    private static final /* synthetic */ int ae;
    private final /* synthetic */ Set<TileObject> ag;
    public static final /* synthetic */ int ad;
    private static /* synthetic */ int[] llIIlIIIIIl;
    private static /* synthetic */ String[] llIIlIIIIII;
    private final /* synthetic */ List<NPC> ah;
    private /* synthetic */ GameObject al;
    private /* synthetic */ int aj;
    private /* synthetic */ boolean an;
    private final /* synthetic */ Queue<n> af;
    @Inject
    private /* synthetic */ Client ai;

    static {
        m.lIIllllllIlllI();
        m.lIIllllllIllIl();
        ad = llIIlIIIIIl[7];
        ae = llIIlIIIIIl[2];
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(GameObjectSpawned gameObjectSpawned) {
        void var2;
        n var19;
        GameObject gameObject = gameObjectSpawned.getGameObject();
        if (m.lIIlllllllIIll(gameObject.getId(), llIIlIIIIIl[2])) {
            this.ag.add((TileObject)gameObject);
            0;
        }
        if (m.lIIlllllllIlII((Object)(var19 = n.e(var2.getId())))) {
            m var17;
            var17.af.add(var19);
            0;
            var17.am = var17.ai.getTickCount();
        }
        if (m.lIIlllllllIIll(var2.getId(), llIIlIIIIIl[7])) {
            var17.al = var2;
        }
    }

    private static boolean lIIlllllllIllI(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(GameObjectDespawned gameObjectDespawned) {
        void var16;
        GameObject gameObject = gameObjectDespawned.getGameObject();
        if (m.lIIlllllllIIll(gameObject.getId(), llIIlIIIIIl[2])) {
            this.ag.remove(gameObject);
            0;
        }
        if (m.lIIlllllllIIll(var16.getId(), llIIlIIIIIl[7])) {
            llllllllllllllllIlIIIIIlIIlIllll.al = null;
        }
    }

    private static String lIIllllllIllII(String var1, String var3) {
        try {
            SecretKeySpec var13 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var3.getBytes(StandardCharsets.UTF_8)), llIIlIIIIIl[14]), "DES");
            Cipher var5 = Cipher.getInstance("DES");
            var5.init(llIIlIIIIIl[12], var13);
            return new String(var5.doFinal(Base64.getDecoder().decode(var1.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var15) {
            var15.printStackTrace();
            return null;
        }
    }

    public boolean K() {
        return this.an;
    }

    public void w() {
        int[] nArray = new int[llIIlIIIIIl[0]];
        nArray[m.llIIlIIIIIl[1]] = llIIlIIIIIl[2];
        this.ag.addAll(TileObjects.getAll((int[])nArray));
        0;
        this.af.clear();
    }

    private static boolean lIIlllllllIIII(int n2, int n3) {
        return n2 > n3;
    }

    private static void lIIllllllIllIl() {
        llIIlIIIIII = new String[llIIlIIIIIl[13]];
        m.llIIlIIIIII[m.llIIlIIIIIl[1]] = m."begin to materialise";
        m.llIIlIIIIII[m.llIIlIIIIIl[0]] = m."stop materialising";
        m.llIIlIIIIII[m.llIIlIIIIIl[12]] = m."You have died";
    }

    public Queue<n> G() {
        return this.af;
    }

    @Subscribe
    public void a(NpcDespawned npcDespawned) {
        if (m.lIIlllllllIIll(npcDespawned.getNpc().getId(), llIIlIIIIIl[11])) {
            this.ah.remove(npcDespawned.getNpc());
            0;
        }
    }

    private static boolean lIIlllllllIIll(int n2, int n3) {
        return n2 == n3;
    }

    private static String lIIllllllIlIll(String var6, String var4) {
        try {
            SecretKeySpec var7 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var4.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var18 = Cipher.getInstance("Blowfish");
            var18.init(llIIlIIIIIl[12], var7);
            return new String(var18.doFinal(Base64.getDecoder().decode(var6.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var10) {
            var10.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlllllllIIIl(int n2, int n3) {
        return n2 <= n3;
    }

    public NPC J() {
        return this.ak;
    }

    public m() {
        this.af = new LinkedList<n>();
        this.ag = new HashSet<TileObject>();
        this.ah = new ArrayList<NPC>();
    }

    public List<NPC> I() {
        return this.ah;
    }

    @Subscribe
    public void a(GameStateChanged gameStateChanged) {
        if (m.lIIlllllllIlIl(gameStateChanged.getGameState(), GameState.LOADING)) {
            this.w();
        }
    }

    private static void lIIllllllIlllI() {
        llIIlIIIIIl = new int[15];
        m.llIIlIIIIIl[0] = 1;
        m.llIIlIIIIIl[1] = (0 ^ 0x13 ^ (0xEF ^ 0x9C)) & (0x16 ^ 0x3C ^ (0x89 ^ 0xC3) ^ -1);
        m.llIIlIIIIIl[2] = 0xFFFFF9BF & 0xB7CF;
        m.llIIlIIIIIl[3] = 0xFFFFAFDB & 0x58F7;
        m.llIIlIIIIIl[4] = 0xFFFF8DFA & 0x7AD7;
        m.llIIlIIIIIl[5] = -(0xFFFFF7BB & 0x1D45) & (0xFFFF9DDB & 0x7FF5);
        m.llIIlIIIIIl[6] = -(1 ^ 0x22) & (0xFFFFDEF7 & 0x29FA);
        m.llIIlIIIIIl[7] = -(0xFFFFDB7F & 0x6CC3) & (0xFFFFFBFF & 0xFDDE);
        m.llIIlIIIIIl[8] = 0xFFFFEF6E & 0x3E9F;
        m.llIIlIIIIIl[9] = 0xFFFFBE3F & 0x6FCF;
        m.llIIlIIIIIl[10] = -(0xFFFFF2E6 & 0x5DFD) & (0xFFFFFFF3 & 0x7EFF);
        m.llIIlIIIIIl[11] = -(0xFFFFFE0D & 0x13F6) & (0xFFFFBFFF & 0x7FBF);
        m.llIIlIIIIIl[12] = 2;
        m.llIIlIIIIIl[13] = 3;
        m.llIIlIIIIIl[14] = 121 + 9 - 67 + 72 ^ 84 + 122 - 74 + 11;
    }

    public Set<TileObject> H() {
        return this.ag;
    }

    private static boolean lIIlllllllIIlI(int n2) {
        return n2 == 0;
    }

    private static boolean lIIlllllllIlII(Object object) {
        return object != null;
    }

    private static boolean lIIlllllllIlIl(Object object, Object object2) {
        return object == object2;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(NpcSpawned npcSpawned) {
        m var11;
        void var20;
        if (!m.lIIllllllIllll(npcSpawned.getNpc().getId(), llIIlIIIIIl[8]) || !m.lIIllllllIllll(npcSpawned.getNpc().getId(), llIIlIIIIIl[9]) || m.lIIlllllllIIll(npcSpawned.getNpc().getId(), llIIlIIIIIl[10])) {
            var11.ak = var20.getNpc();
            var11.af.clear();
        }
        if (m.lIIlllllllIIll(var20.getNpc().getId(), llIIlIIIIIl[11])) {
            var11.ah.add(var20.getNpc());
            0;
        }
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(ChatMessage chatMessage) {
        void var14;
        String string = chatMessage.getMessage();
        if (m.lIIlllllllIllI(string.contains(llIIlIIIIII[llIIlIIIIIl[1]]) ? 1 : 0)) {
            this.an = llIIlIIIIIl[0];
            0;
            if (3 < 0) {
                return;
            }
        } else if (m.lIIlllllllIllI(var14.contains(llIIlIIIIII[llIIlIIIIIl[0]]) ? 1 : 0)) {
            var9.an = llIIlIIIIIl[1];
            0;
            
            }
        } else if (m.lIIlllllllIllI(var14.contains(llIIlIIIIII[llIIlIIIIIl[12]]) ? 1 : 0)) {
            m var9;
            var9.af.clear();
        }
    }

    private static boolean lIIllllllIllll(int n2, int n3) {
        return n2 != n3;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(GraphicsObjectCreated graphicsObjectCreated) {
        m var12;
        void var8;
        GraphicsObject graphicsObject = graphicsObjectCreated.getGraphicsObject();
        WorldPoint worldPoint = WorldPoint.fromLocal((Client)this.ai, (LocalPoint)graphicsObject.getLocation());
        int n2 = this.ai.getTickCount();
        int n3 = graphicsObjectCreated.getGraphicsObject().getId();
        if (m.lIIllllllIllll(n3, llIIlIIIIIl[3]) && m.lIIllllllIllll(n3, llIIlIIIIIl[4]) && m.lIIllllllIllll(n3, llIIlIIIIIl[5]) && m.lIIllllllIllll(n3, llIIlIIIIIl[6])) {
            return;
        }
        if (!m.lIIlllllllIIII((int)(var8 - var12.aj), llIIlIIIIIl[0]) || m.lIIlllllllIIIl((int)(var8 - var12.am), llIIlIIIIIl[0])) {
            return;
        }
        var12.aj = var8;
        if (m.lIIlllllllIIlI(var12.af.isEmpty() ? 1 : 0)) {
            var12.af.remove();
            0;
        }
    }
}

