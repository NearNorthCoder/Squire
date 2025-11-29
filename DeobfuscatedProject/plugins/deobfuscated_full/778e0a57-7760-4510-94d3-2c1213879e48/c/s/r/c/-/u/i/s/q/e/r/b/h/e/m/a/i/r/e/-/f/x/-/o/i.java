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
 *  net.runelite.api.Player
 *  net.runelite.api.Prayer
 *  net.runelite.api.Projectile
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.LocalPoint
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.events.ChatMessage
 *  net.runelite.api.events.GameObjectDespawned
 *  net.runelite.api.events.GameObjectSpawned
 *  net.runelite.api.events.GameTick
 *  net.runelite.api.events.GraphicChanged
 *  net.runelite.api.events.NpcSpawned
 *  net.runelite.api.events.ProjectileSpawned
 *  net.runelite.api.util.Text
 *  net.runelite.client.eventbus.Subscribe
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Vars
 */
package c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o;

import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.A;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.B;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.C;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.j;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.y;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.z;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import gg.squire.cox.SquireChambersPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Actor;
import net.runelite.api.ChatMessageType;
import net.runelite.api.Client;
import net.runelite.api.GraphicsObject;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.Prayer;
import net.runelite.api.Projectile;
import net.runelite.api.TileObject;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.ChatMessage;
import net.runelite.api.events.GameObjectDespawned;
import net.runelite.api.events.GameObjectSpawned;
import net.runelite.api.events.GameTick;
import net.runelite.api.events.GraphicChanged;
import net.runelite.api.events.NpcSpawned;
import net.runelite.api.events.ProjectileSpawned;
import net.runelite.api.util.Text;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Vars;

@Singleton
public class i {
    private /* synthetic */ boolean aZ;
    private /* synthetic */ int bf;
    private static final /* synthetic */ Pattern bg;
    final /* synthetic */ SquireChambersPlugin ay;
    public static final /* synthetic */ int aD;
    static final /* synthetic */ int aB;
    final /* synthetic */ Client az;
    public static final /* synthetic */ int aH;
    private static /* synthetic */ String[] lIIllllllIlI;
    public static final /* synthetic */ int aI;
    private /* synthetic */ z aT;
    private final /* synthetic */ Set<B> aM;
    private /* synthetic */ int aN;
    private /* synthetic */ int bd;
    private /* synthetic */ int aY;
    private /* synthetic */ int ba;
    static final /* synthetic */ int aA;
    private final /* synthetic */ List<WorldPoint> aJ;
    private static /* synthetic */ int[] lIlIIIIIIIII;
    private /* synthetic */ Prayer bb;
    private /* synthetic */ boolean aO;
    private /* synthetic */ boolean aQ;
    private final /* synthetic */ List<WorldPoint> aK;
    private /* synthetic */ TileObject aS;
    private /* synthetic */ z aV;
    public static final /* synthetic */ int aC;
    public static final /* synthetic */ int aG;
    private /* synthetic */ TileObject aU;
    private /* synthetic */ int aX;
    public static final /* synthetic */ int aE;
    private /* synthetic */ A aR;
    private /* synthetic */ int be;
    private /* synthetic */ int aW;
    public static final /* synthetic */ int aF;
    private /* synthetic */ long bc;
    private final /* synthetic */ List<WorldPoint> aL;
    private /* synthetic */ boolean aP;

    /*
     * WARNING - void declaration
     */
    @Subscribe(priority=2.1474836E9f)
    private void a(GraphicChanged graphicChanged) {
        void var43;
        if (i.llIlIIllIllIII(this.ay.E() ? 1 : 0)) {
            return;
        }
        if (i.llIlIIllIllIII(var43.getActor() instanceof Player)) {
            return;
        }
        Player var26 = (Player)var43.getActor();
        if (i.llIlIIllIllIIl(var26.getGraphic(), lIlIIIIIIIII[22])) {
            i var16;
            var16.aM.add(new B(var26, C.BURN));
            0;
        }
    }

    void ab() {
        this.aZ = lIlIIIIIIIII[1];
        this.ba = lIlIIIIIIIII[4];
    }

    public List<WorldPoint> ap() {
        return this.aL;
    }

    private static boolean llIlIIllIlIlII(int n2, int n3) {
        return n2 > n3;
    }

    public A au() {
        return this.aR;
    }

    public boolean aC() {
        return this.aZ;
    }

    public void n(int n2) {
        this.bd = n2;
    }

    void aj() {
        this.aJ.clear();
        this.aK.clear();
        this.az.clearHintArrow();
        Iterator var15 = this.az.getGraphicsObjects().iterator();
        while (i.llIlIIllIlIIlI(var15.hasNext() ? 1 : 0)) {
            i var47;
            GraphicsObject var19 = (GraphicsObject)var15.next();
            if (i.llIlIIllIllIIl(var19.getId(), lIlIIIIIIIII[24])) {
                var47.aK.add(WorldPoint.fromLocal((Client)var47.az, (LocalPoint)var19.getLocation()));
                0;
            }
            if (i.llIlIIllIllIIl(var19.getId(), lIlIIIIIIIII[25])) {
                var47.aJ.add(WorldPoint.fromLocal((Client)var47.az, (LocalPoint)var19.getLocation()));
                0;
            }
            if (i.llIlIIllIllIII(var47.aK.isEmpty() ? 1 : 0)) {
                var47.aN -= lIlIIIIIIIII[3];
                if (i.llIlIIllIllIll(var47.aN)) {
                    var47.az.clearHintArrow();
                    var47.aN = lIlIIIIIIIII[0];
                }
            }
            0;
            if (((0x69 ^ 0x7F) & ~(0x70 ^ 0x66)) == 0) continue;
            return;
        }
    }

    public TileObject av() {
        return this.aS;
    }

    @Subscribe(priority=2.1464836E9f)
    public void a(GameTick gameTick) {
        i var56;
        Object var9;
        int[] nArray = new int[lIlIIIIIIIII[3]];
        nArray[i.lIlIIIIIIIII[1]] = lIlIIIIIIIII[5];
        List list = TileObjects.getAll((int[])nArray);
        this.aL.clear();
        TileObject var24 = list.iterator();
        while (i.llIlIIllIlIIlI(var24.hasNext() ? 1 : 0)) {
            var9 = (TileObject)var24.next();
            var56.aL.add(var9.getWorldLocation());
            0;
            0;
            if (((0x17 ^ 0x54) & ~(0xDC ^ 0x9F)) == 0) continue;
            return;
        }
        if (i.llIlIIllIlIIll(var56.aS)) {
            int[] nArray2 = new int[lIlIIIIIIIII[3]];
            nArray2[i.lIlIIIIIIIII[1]] = lIlIIIIIIIII[6];
            var24 = TileObjects.getNearest((int[])nArray2);
            var56.a(var24);
        }
        if (i.llIlIIllIlIIll(var56.aU)) {
            int[] nArray3 = new int[lIlIIIIIIIII[3]];
            nArray3[i.lIlIIIIIIIII[1]] = lIlIIIIIIIII[7];
            var24 = TileObjects.getNearest((int[])nArray3);
            var56.b(var24);
            var56.Y();
            0;
            if (-1 > 2) {
                return;
            }
        } else if (i.llIlIIllIlIlII(var56.aU.getWorldX(), Players.getLocal().getWorldX())) {
            var56.bf = lIlIIIIIIIII[1];
            0;
            if (1 == 0) {
                return;
            }
        } else {
            var56.bf = lIlIIIIIIIII[3];
        }
        if (i.llIlIIllIlIIlI(var56.ay.E() ? 1 : 0)) {
            var56.ac();
        }
        if (i.llIlIIllIlIlIl(var24 = var56.az.getWidget(lIlIIIIIIIII[8])) && i.llIlIIllIlIIlI(var24.isVisible() ? 1 : 0)) {
            var9 = var24.getText();
            if (i.llIlIIllIlIIlI(((String)var9).contains(lIIllllllIlI[lIlIIIIIIIII[1]]) ? 1 : 0)) {
                var56.bd = Vars.getBit((int)lIlIIIIIIIII[9]);
            }
            if (i.llIlIIllIlIIlI(((String)var9).contains(lIIllllllIlI[lIlIIIIIIIII[3]]) ? 1 : 0)) {
                var56.be = Vars.getBit((int)lIlIIIIIIIII[9]);
            }
        }
    }

    public Prayer aE() {
        return this.bb;
    }

    public void a(Prayer prayer) {
        this.bb = prayer;
    }

    public boolean at() {
        return this.aQ;
    }

    public void b(z z2) {
        this.aT = z2;
    }

    public void e(boolean bl2) {
        this.aQ = bl2;
    }

    private static boolean llIlIIllIllIlI(int n2, int n3) {
        return n2 != n3;
    }

    public void c(z z2) {
        this.aV = z2;
    }

    public int aI() {
        return this.bf;
    }

    public void c(boolean bl2) {
        this.aO = bl2;
    }

    void aa() {
        this.aZ = lIlIIIIIIIII[3];
        this.ba = lIlIIIIIIIII[4];
    }

    public void ag() {
        if (i.llIlIIllIllIlI(this.aW, lIlIIIIIIIII[13])) {
            System.out.println("Syncing attacks! " + this.az());
            this.aW = lIlIIIIIIIII[13];
        }
    }

    @Inject
    public i(SquireChambersPlugin squireChambersPlugin, Client client) {
        this.aJ = new ArrayList<WorldPoint>();
        this.aK = new ArrayList<WorldPoint>();
        this.aL = new ArrayList<WorldPoint>();
        this.aM = new HashSet<B>();
        this.aN = lIlIIIIIIIII[0];
        this.aO = lIlIIIIIIIII[1];
        this.aP = lIlIIIIIIIII[1];
        this.aQ = lIlIIIIIIIII[1];
        this.aR = A.UNKNOWN;
        this.aS = null;
        this.aT = z.UNKNOWN;
        this.aU = null;
        this.aV = z.UNKNOWN;
        this.aW = lIlIIIIIIIII[2];
        this.aX = lIlIIIIIIIII[3];
        this.aY = lIlIIIIIIIII[3];
        this.aZ = lIlIIIIIIIII[1];
        this.ba = lIlIIIIIIIII[4];
        this.bb = null;
        this.bc = 0L;
        this.bd = lIlIIIIIIIII[2];
        this.be = lIlIIIIIIIII[2];
        this.bf = lIlIIIIIIIII[2];
        this.ay = squireChambersPlugin;
        this.az = client;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe(priority=2.1474836E9f)
    public void a(GameObjectSpawned gameObjectSpawned) {
        void var13;
        if (i.llIlIIllIlIIll(gameObjectSpawned.getGameObject())) {
            return;
        }
        int var39 = var13.getGameObject().getId();
        switch (var39) {
            case 29880: 
            case 29881: {
                i var7;
                if (i.llIlIIllIlIIll(var7.ax())) {
                    var7.Y();
                }
                var7.b((TileObject)var13.getGameObject());
                0;
                if (2 != 0) break;
                return;
            }
            case 29883: 
            case 29884: {
                i var7;
                var7.a((TileObject)var13.getGameObject());
                0;
                if ((0x10 ^ 0x14) > 0) break;
                return;
            }
            case 30022: {
                i var7;
                System.out.println(lIIllllllIlI[lIlIIIIIIIII[23]]);
                var7.aL.add(var13.getGameObject().getWorldLocation());
                0;
            }
        }
    }

    public List<WorldPoint> ao() {
        return this.aK;
    }

    public int aD() {
        return this.ba;
    }

    /*
     * WARNING - void declaration
     */
    private void al() {
        void var2_2;
        i var33;
        if (i.llIlIIllIlIIll(this.aS)) {
            return;
        }
        int var29 = y.c(var33.aS);
        z var8 = z.r(var29);
        if (i.llIlIIllIlIlll((Object)var8, (Object)var33.aT)) {
            return;
        }
        switch (j.bh[var8.ordinal()]) {
            case 1: 
            case 2: 
            case 3: 
            case 4: 
            case 5: 
            case 6: 
            case 7: 
            case 8: {
                var33.a(var8);
                0;
                if (((178 + 218 - 165 + 10 ^ 14 + 23 - 13 + 157) & (0x5E ^ 0x72 ^ (0x25 ^ 0x4D) ^ -1)) < 2) break;
                return;
            }
            case 17: {
                var33.aa();
                0;
                if (2 <= 2) break;
                return;
            }
            case 18: 
            case 19: {
                var33.ab();
            }
        }
        this.aT = var2_2;
    }

    private static boolean llIlIIllIlIlIl(Object object) {
        return object != null;
    }

    public void p(int n2) {
        this.bf = n2;
    }

    public void m(int n2) {
        this.ba = n2;
    }

    public void b(TileObject tileObject) {
        this.aU = tileObject;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe(priority=2.1474836E9f)
    public void a(ChatMessage chatMessage) {
        void var30;
        i var44;
        void var34;
        String string = chatMessage.getMessage();
        if (i.llIlIIllIlIllI(chatMessage.getType(), ChatMessageType.GAMEMESSAGE) && i.llIlIIllIlIllI(chatMessage.getType(), ChatMessageType.SPAM)) {
            return;
        }
        if (i.llIlIIllIlIIlI(var34.startsWith(lIIllllllIlI[lIlIIIIIIIII[13]]) ? 1 : 0)) {
            var44.aK.clear();
            return;
        }
        if (i.llIlIIllIlIlll(var30.getType(), ChatMessageType.GAMEMESSAGE)) {
            Object var32;
            Matcher var48 = bg.matcher(var30.getMessage());
            if (i.llIlIIllIlIIlI(var48.matches() ? 1 : 0)) {
                var32 = var44.az.getPlayers().iterator();
                while (i.llIlIIllIlIIlI(var32.hasNext() ? 1 : 0)) {
                    String var5;
                    Player var40 = (Player)var32.next();
                    String var22 = var40.getName();
                    if (i.llIlIIllIlIlIl(var22) && i.llIlIIllIlIIlI((var5 = Text.sanitize((String)var22)).equals(Text.sanitize((String)var48.group(lIlIIIIIIIII[3]))) ? 1 : 0)) {
                        var44.aM.add(new B(var40, C.TELEPORT));
                        0;
                    }
                    0;
                    if (-1 < (37 + 93 - 118 + 150 ^ 79 + 153 - 83 + 17)) continue;
                    return;
                }
            }
            var32 = Text.standardize((String)var30.getMessageNode().getValue());
            int var40 = lIlIIIIIIIII[2];
            switch (((String)var32).hashCode()) {
                case -2064703836: {
                    if (!i.llIlIIllIlIIlI(((String)var32).equals(lIIllllllIlI[lIlIIIIIIIII[14]]) ? 1 : 0)) break;
                    var40 = lIlIIIIIIIII[1];
                    0;
                    if ((0x52 ^ 0x60 ^ (0x4D ^ 0x7B)) > 3) break;
                    return;
                }
                case -1272924347: {
                    if (!i.llIlIIllIlIIlI(((String)var32).equals(lIIllllllIlI[lIlIIIIIIIII[15]]) ? 1 : 0)) break;
                    var40 = lIlIIIIIIIII[3];
                    0;
                    if (1 < 3) break;
                    return;
                }
                case 569920040: {
                    if (!i.llIlIIllIlIIlI(((String)var32).equals(lIIllllllIlI[lIlIIIIIIIII[16]]) ? 1 : 0)) break;
                    var40 = lIlIIIIIIIII[10];
                    0;
                    if (((0xE0 ^ 0xA8) & ~(0x64 ^ 0x2C)) <= 0) break;
                    return;
                }
                case 1486918970: {
                    if (!i.llIlIIllIlIIlI(((String)var32).equals(lIIllllllIlI[lIlIIIIIIIII[17]]) ? 1 : 0)) break;
                    var40 = lIlIIIIIIIII[12];
                    0;
                    if (-3 <= 0) break;
                    return;
                }
                case -525042198: {
                    if (!i.llIlIIllIlIIlI(((String)var32).equals(lIIllllllIlI[lIlIIIIIIIII[18]]) ? 1 : 0)) break;
                    var40 = lIlIIIIIIIII[13];
                    0;
                    if (1 >= 0) break;
                    return;
                }
                case 1947752869: {
                    if (!i.llIlIIllIlIIlI(((String)var32).equals(lIIllllllIlI[lIlIIIIIIIII[0]]) ? 1 : 0)) break;
                    var40 = lIlIIIIIIIII[14];
                    0;
                    if (((0x61 ^ 0x41) & ~(0xAF ^ 0x8F)) == ((0x32 ^ 0x2D) & ~(0x3A ^ 0x25))) break;
                    return;
                }
                case -2094114081: {
                    if (!i.llIlIIllIlIIlI(((String)var32).equals(lIIllllllIlI[lIlIIIIIIIII[19]]) ? 1 : 0)) break;
                    var40 = lIlIIIIIIIII[15];
                    0;
                    if (((0xAE ^ 0xB4 ^ (0xCD ^ 0x8C)) & (85 + 51 - 9 + 91 ^ 117 + 51 - 45 + 6 ^ -1)) < 1) break;
                    return;
                }
                case -127344230: {
                    if (!i.llIlIIllIlIIlI(((String)var32).equals(lIIllllllIlI[lIlIIIIIIIII[20]]) ? 1 : 0)) break;
                    var40 = lIlIIIIIIIII[16];
                    0;
                    if (1 <= (0x83 ^ 0x87)) break;
                    return;
                }
                case -103006838: {
                    if (!i.llIlIIllIlIIlI(((String)var32).equals(lIIllllllIlI[lIlIIIIIIIII[21]]) ? 1 : 0)) break;
                    var40 = lIlIIIIIIIII[17];
                }
            }
            switch (var40) {
                case 0: {
                    var44.a(A.ACID);
                    0;
                    if ((0x33 ^ 0x5C ^ (0xFB ^ 0x90)) > 0) break;
                    return;
                }
                case 1: {
                    var44.a(A.CRYSTAL);
                    0;
                    if (-(0x4D ^ 0x74 ^ (0x98 ^ 0xA4)) < 0) break;
                    return;
                }
                case 2: {
                    var44.a(A.FLAME);
                    0;
                    if (-1 != 2) break;
                    return;
                }
                case 3: 
                case 4: {
                    var44.a(Prayer.PROTECT_FROM_MELEE);
                    0;
                    if (-(166 + 64 - 163 + 114 ^ 70 + 87 - 86 + 106) < 0) break;
                    return;
                }
                case 5: 
                case 6: {
                    var44.a(Prayer.PROTECT_FROM_MAGIC);
                    0;
                    if (null == null) break;
                    return;
                }
                case 7: 
                case 8: {
                    var44.a(Prayer.PROTECT_FROM_MISSILES);
                }
            }
        }
    }

    static {
        i.llIlIIllIlIIIl();
        i.llIlIIllIlIIII();
        aI = lIlIIIIIIIII[5];
        aF = lIlIIIIIIIII[6];
        aD = lIlIIIIIIIII[7];
        aG = lIlIIIIIIIII[28];
        aA = lIlIIIIIIIII[29];
        aH = lIlIIIIIIIII[30];
        aC = lIlIIIIIIIII[31];
        aB = lIlIIIIIIIII[32];
        aE = lIlIIIIIIIII[33];
        bg = Pattern.compile(lIIllllllIlI[lIlIIIIIIIII[34]]);
    }

    public String am() {
        if (i.llIlIIllIlIIll(this.aU)) {
            return lIIllllllIlI[lIlIIIIIIIII[26]];
        }
        int n2 = y.c(this.aU);
        z z2 = z.r(n2);
        String string = z2.name();
        String[] stringArray = string.split(lIIllllllIlI[lIlIIIIIIIII[27]]);
        return stringArray[stringArray.length - lIlIIIIIIIII[3]];
    }

    private static boolean llIlIIllIllIll(int n2) {
        return n2 <= 0;
    }

    private static boolean llIlIIllIllIIl(int n2, int n3) {
        return n2 == n3;
    }

    public void Z() {
        this.aO = lIlIIIIIIIII[1];
        this.aP = lIlIIIIIIIII[1];
        this.aQ = lIlIIIIIIIII[1];
        this.aR = A.UNKNOWN;
        this.aS = null;
        this.aU = null;
        this.aV = z.UNKNOWN;
        this.aT = z.UNKNOWN;
        this.aW = lIlIIIIIIIII[2];
        this.aX = lIlIIIIIIIII[3];
        this.aY = lIlIIIIIIIII[3];
        this.aJ.clear();
        this.aK.clear();
        this.aN = lIlIIIIIIIII[0];
        this.aM.clear();
        this.aZ = lIlIIIIIIIII[1];
        this.ba = lIlIIIIIIIII[4];
        this.bb = null;
        this.bc = 0L;
        this.bd = lIlIIIIIIIII[2];
        this.be = lIlIIIIIIIII[2];
        this.bf = lIlIIIIIIIII[2];
    }

    public void l(int n2) {
        this.aY = n2;
    }

    public void k(int n2) {
        this.aX = n2;
    }

    public void a(z z2) {
        this.aW = lIlIIIIIIIII[13];
        this.aX = lIlIIIIIIIII[3];
        switch (j.bh[z2.ordinal()]) {
            case 1: 
            case 2: {
                var52.aY = lIlIIIIIIIII[10];
                0;
                if (2 >= ((0x32 ^ 0x2C ^ (0x6F ^ 0x29)) & (0x17 ^ 0x72 ^ (0x9D ^ 0xA0) ^ -1))) break;
                return;
            }
            case 3: 
            case 4: {
                var52.aY = lIlIIIIIIIII[12];
                0;
                if (-(0x6D ^ 0x69) < 0) break;
                return;
            }
            case 5: 
            case 6: {
                int n2;
                i var52;
                if (i.llIlIIllIlIIlI(var52.aQ ? 1 : 0)) {
                    n2 = lIlIIIIIIIII[13];
                    0;
                    if (((0x7A ^ 0x4F) & ~(0x65 ^ 0x50)) != ((0x93 ^ 0xBD) & ~(0x7E ^ 0x50))) {
                        return;
                    }
                } else {
                    n2 = lIlIIIIIIIII[3];
                }
                var52.aY = n2;
                0;
                if ((64 + 20 - -15 + 83 ^ 0 + 122 - 18 + 74) > 0) break;
                return;
            }
            case 7: 
            case 8: {
                var52.aY = lIlIIIIIIIII[3];
            }
        }
    }

    private static boolean llIlIIllIlIlll(Object object, Object object2) {
        return object == object2;
    }

    public long aF() {
        return this.bc;
    }

    public void ad() {
        i var21;
        if (i.llIlIIllIllIIl(this.aW, lIlIIIIIIIII[3])) {
            this.aW = lIlIIIIIIIII[13];
            this.ae();
            0;
            if ((0xC4 ^ 0xC0) < 1) {
                return;
            }
        } else if (i.llIlIIllIllIlI(var21.aW, lIlIIIIIIIII[2])) {
            var21.aW -= lIlIIIIIIIII[3];
        }
    }

    private static boolean llIlIIllIlllIl(int n2, int n3) {
        return n2 < n3;
    }

    public int X() {
        return Vars.getBit((int)lIlIIIIIIIII[9]);
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe(priority=2.1474836E9f)
    public void a(GameObjectDespawned gameObjectDespawned) {
        i var10;
        void var6;
        if (i.llIlIIllIlIIll(gameObjectDespawned.getGameObject())) {
            return;
        }
        int var25 = var6.getGameObject().getId();
        if (i.llIlIIllIllIIl(var25, lIlIIIIIIIII[7])) {
            var10.b((TileObject)null);
        }
        if (i.llIlIIllIllIIl(var25, lIlIIIIIIIII[5])) {
            var10.aL.remove(var6.getGameObject().getWorldLocation());
            0;
        }
    }

    private static boolean llIlIIllIlllII(int n2) {
        return n2 > 0;
    }

    public void o(int n2) {
        this.be = n2;
    }

    public List<WorldPoint> an() {
        return this.aJ;
    }

    private static void llIlIIllIlIIII() {
        lIIllllllIlI = new String[lIlIIIIIIIII[35]];
        i.lIIllllllIlI[i.lIlIIIIIIIII[1]] = i."Left Hand";
        i.lIIllllllIlI[i.lIlIIIIIIIII[3]] = i."Right Hand";
        i.lIIllllllIlI[i.lIlIIIIIIIII[10]] = i."Left claw";
        i.lIIllllllIlI[i.lIlIIIIIIIII[12]] = i."Right claw";
        i.lIIllllllIlI[i.lIlIIIIIIIII[13]] = i."The teleport has no effect";
        i.lIIllllllIlI[i.lIlIIIIIIIII[14]] = i."the great olm rises with the power of acid.";
        i.lIIllllllIlI[i.lIlIIIIIIIII[15]] = i."the great olm rises with the power of crystal.";
        i.lIIllllllIlI[i.lIlIIIIIIIII[16]] = i."the great olm rises with the power of flame.";
        i.lIIllllllIlI[i.lIlIIIIIIIII[17]] = i."the great olm fires a sphere of aggression your way. your prayers have been sapped.";
        i.lIIllllllIlI[i.lIlIIIIIIIII[18]] = i."the great olm fires a sphere of aggression your way.";
        i.lIIllllllIlI[i.lIlIIIIIIIII[0]] = i."the great olm fires a sphere of magical power your way. your prayers have been sapped.";
        i.lIIllllllIlI[i.lIlIIIIIIIII[19]] = i."the great olm fires a sphere of magical power your way.";
        i.lIIllllllIlI[i.lIlIIIIIIIII[20]] = i."the great olm fires a sphere of accuracy and dexterity your way. your prayers have been sapped.";
        i.lIIllllllIlI[i.lIlIIIIIIIII[21]] = i."the great olm fires a sphere of accuracy and dexterity your way.";
        i.lIIllllllIlI[i.lIlIIIIIIIII[23]] = i."Acid spawned!";
        i.lIIllllllIlI[i.lIlIIIIIIIII[26]] = i."-1";
        i.lIIllllllIlI[i.lIlIIIIIIIII[27]] = i."_";
        i.lIIllllllIlI[i.lIlIIIIIIIII[34]] = i."You have been paired with <col=ff0000>(.*)</col>! The magical power will enact soon...";
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe(priority=2.1474836E9f)
    public void a(ProjectileSpawned projectileSpawned) {
        Projectile projectile = projectileSpawned.getProjectile();
        switch (projectile.getId()) {
            case 1339: {
                i var55;
                var55.a(Prayer.PROTECT_FROM_MAGIC);
                0;
                if (null == null) break;
                return;
            }
            case 1340: {
                i var55;
                var55.a(Prayer.PROTECT_FROM_MISSILES);
                0;
                if (3 != 1) break;
                return;
            }
            case 1354: {
                void var2;
                i var55;
                Actor var23 = var2.getInteracting();
                if (!i.llIlIIllIlIIlI(var23 instanceof Player)) break;
                var55.aq().add(new B((Player)var23, C.ACID));
                0;
            }
        }
    }

    public TileObject ax() {
        return this.aU;
    }

    void ah() {
        i var4;
        if (i.llIlIIllIllIII(this.aZ ? 1 : 0)) {
            return;
        }
        var4.ba -= lIlIIIIIIIII[3];
        if (i.llIlIIllIllIll(var4.ba)) {
            var4.aZ = lIlIIIIIIIII[1];
            var4.ba = lIlIIIIIIIII[4];
        }
    }

    public void af() {
        i var18;
        if (i.llIlIIllIllIIl(this.aY, lIlIIIIIIIII[12]) && !i.llIlIIllIlIIlI(this.aQ ? 1 : 0) || i.llIlIIllIllIIl(var18.aY, lIlIIIIIIIII[13])) {
            var18.aY = lIlIIIIIIIII[3];
            0;
            if (1 > 1) {
                return;
            }
        } else {
            var18.aY += lIlIIIIIIIII[3];
        }
    }

    public void f(boolean bl2) {
        this.aZ = bl2;
    }

    public void d(boolean bl2) {
        this.aP = bl2;
    }

    public int aA() {
        return this.aX;
    }

    private static String llIlIIllIIlllI(String var35, String var17) {
        var35 = new String(Base64.getDecoder().decode(var35.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var3 = new StringBuilder();
        char[] var36 = var17.toCharArray();
        int var54 = lIlIIIIIIIII[1];
        char[] var46 = var35.toCharArray();
        int var20 = var46.length;
        int var51 = lIlIIIIIIIII[1];
        while (i.llIlIIllIlllIl(var51, var20)) {
            char var41 = var46[var51];
            var3.append((char)(var41 ^ var36[var54 % var36.length]));
            0;
            ++var54;
            ++var51;
            0;
            if (2 > 0) continue;
            return null;
        }
        return String.valueOf(var3);
    }

    private static boolean llIlIIllIllIII(int n2) {
        return n2 == 0;
    }

    void ai() {
        if (i.llIlIIllIlllII(this.aM.size())) {
            this.aM.forEach(B::by);
            this.aM.removeIf(b2 -> {
                boolean bl2;
                if (i.llIlIIllIllIll(b2.bB())) {
                    bl2 = lIlIIIIIIIII[3];
                    0;
                    if (-2 >= 0) {
                        return false;
                    }
                } else {
                    bl2 = lIlIIIIIIIII[1];
                }
                return bl2;
            });
            0;
        }
    }

    public int aB() {
        return this.aY;
    }

    private static String llIlIIllIIllIl(String var45, String var28) {
        try {
            SecretKeySpec var37 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var28.getBytes(StandardCharsets.UTF_8)), lIlIIIIIIIII[17]), "DES");
            Cipher var27 = Cipher.getInstance("DES");
            var27.init(lIlIIIIIIIII[10], var37);
            return new String(var27.doFinal(Base64.getDecoder().decode(var45.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var11) {
            var11.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe(priority=2.1474836E9f)
    public void a(NpcSpawned npcSpawned) {
        void var12;
        NPC nPC = npcSpawned.getNpc();
        if (i.llIlIIllIlIIll(nPC)) {
            return;
        }
        if (i.llIlIIllIlIIlI(var12.getName().contains(lIIllllllIlI[lIlIIIIIIIII[10]]) ? 1 : 0)) {
            var57.bd = lIlIIIIIIIII[11];
        }
        if (i.llIlIIllIlIIlI(var12.getName().contains(lIIllllllIlI[lIlIIIIIIIII[12]]) ? 1 : 0)) {
            var57.be = lIlIIIIIIIII[11];
        }
    }

    public boolean as() {
        return this.aP;
    }

    public void ac() {
        this.ai();
        this.ah();
        this.aj();
        this.ad();
        this.ak();
        this.al();
    }

    public void a(A a2) {
        this.aR = a2;
    }

    private static String llIlIIllIIllll(String var53, String var42) {
        try {
            SecretKeySpec var14 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var42.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var1 = Cipher.getInstance("Blowfish");
            var1.init(lIlIIIIIIIII[10], var14);
            return new String(var1.doFinal(Base64.getDecoder().decode(var53.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var38) {
            var38.printStackTrace();
            return null;
        }
    }

    private static boolean llIlIIllIlIllI(Object object, Object object2) {
        return object != object2;
    }

    /*
     * WARNING - void declaration
     */
    private void ak() {
        void var2_2;
        i var49;
        if (i.llIlIIllIlIIll(this.aU)) {
            return;
        }
        int var50 = y.c(var49.aU);
        z var31 = z.r(var50);
        if (i.llIlIIllIlIlll((Object)var31, (Object)var49.aV)) {
            return;
        }
        switch (j.bh[var31.ordinal()]) {
            case 9: 
            case 10: {
                int n2;
                if (i.llIlIIllIlIIlI(var49.aP ? 1 : 0)) {
                    n2 = lIlIIIIIIIII[15];
                    0;
                    
                    }
                } else {
                    n2 = lIlIIIIIIIII[17];
                }
                var49.aW = n2;
                var49.aX = lIlIIIIIIIII[3];
                var49.aY = lIlIIIIIIIII[3];
                0;
                if ((0x69 ^ 0x7A ^ (0x89 ^ 0x9F)) != 0) break;
                return;
            }
            case 11: 
            case 12: 
            case 13: {
                var49.aQ = lIlIIIIIIIII[3];
                0;
                if (-3 < 0) break;
                return;
            }
            case 14: 
            case 15: 
            case 16: {
                var49.ag();
            }
        }
        if (i.llIlIIllIlIIlI(var31.bx() ? 1 : 0)) {
            var49.ag();
        }
        this.aV = var2_2;
    }

    private static boolean llIlIIllIlIIll(Object object) {
        return object == null;
    }

    public void T() {
        this.Z();
    }

    private static void llIlIIllIlIIIl() {
        lIlIIIIIIIII = new int[36];
        i.lIlIIIIIIIII[0] = 8 + 128 - -8 + 42 ^ 174 + 161 - 226 + 67;
        i.lIlIIIIIIIII[1] = (0xC6 ^ 0x8D) & ~(0xDB ^ 0x90);
        i.lIlIIIIIIIII[2] = -1;
        i.lIlIIIIIIIII[3] = 1;
        i.lIlIIIIIIIII[4] = 0x72 ^ 0x2A ^ (0x15 ^ 0x60);
        i.lIlIIIIIIIII[5] = 0xFFFFF576 & 0x7FCF;
        i.lIlIIIIIIIII[6] = 0xFFFFFCBF & 0x77FC;
        i.lIlIIIIIIIII[7] = 0xFFFFFCBB & 0x77FD;
        i.lIlIIIIIIIII[8] = 0xFFFFF3E9 & 0x12F0C1F;
        i.lIlIIIIIIIII[9] = 0xFFFF9FF7 & 0x77DB;
        i.lIlIIIIIIIII[10] = 2;
        i.lIlIIIIIIIII[11] = -(0xFFFFE5EF & 0x7FB4) & (0xFFFFEFFB & 0x77FF);
        i.lIlIIIIIIIII[12] = 3;
        i.lIlIIIIIIIII[13] = 0x7B ^ 0x7F;
        i.lIlIIIIIIIII[14] = 0x4A ^ 0x4F;
        i.lIlIIIIIIIII[15] = 0x11 ^ 0x53 ^ (0x55 ^ 0x11);
        i.lIlIIIIIIIII[16] = 0xD6 ^ 0xA7 ^ (0x2A ^ 0x5C);
        i.lIlIIIIIIIII[17] = 0x3C ^ 0x34;
        i.lIlIIIIIIIII[18] = 0x3B ^ 0x32;
        i.lIlIIIIIIIII[19] = 0x5C ^ 0x57;
        i.lIlIIIIIIIII[20] = 0x31 ^ 0x3D;
        i.lIlIIIIIIIII[21] = 0x18 ^ 0x15;
        i.lIlIIIIIIIII[22] = -(0xFFFFF3A1 & 0x7CFF) & (0xFFFFFDFF & 0x77E7);
        i.lIlIIIIIIIII[23] = 0xB ^ 5;
        i.lIlIIIIIIIII[24] = -(0xFFFFBACF & 0x7731) & (0xFFFFF7CF & 0x3F7F);
        i.lIlIIIIIIIII[25] = 0xFFFFEFD3 & 0x157F;
        i.lIlIIIIIIIII[26] = 0x52 ^ 0x5D;
        i.lIlIIIIIIIII[27] = 114 + 69 - 162 + 112 ^ 5 + 92 - 28 + 80;
        i.lIlIIIIIIIII[28] = -(0xFFFFBF82 & 0x437F) & (0xFFFFF7BF & Short.MAX_VALUE);
        i.lIlIIIIIIIII[29] = 0xFFFFADBF & 0x577C;
        i.lIlIIIIIIIII[30] = 0xFFFFFCFF & 0x77BF;
        i.lIlIIIIIIIII[31] = -(0x36 ^ 0x75) & (0xFFFFFDFB & 0x76FE);
        i.lIlIIIIIIIII[32] = 0xFFFFDDBF & 0x277B;
        i.lIlIIIIIIIII[33] = 0xFFFFF6BB & 0x7DFF;
        i.lIlIIIIIIIII[34] = 0x1E ^ 0xF;
        i.lIlIIIIIIIII[35] = 0x60 ^ 0x72;
    }

    public int aG() {
        return this.bd;
    }

    public void ae() {
        if (i.llIlIIllIllIIl(this.aX, lIlIIIIIIIII[13])) {
            this.aX = lIlIIIIIIIII[3];
            this.af();
            0;
            if (2 > 2) {
                return;
            }
        } else {
            lllllllllllllllIlllIIllIllllIIlI.aX += lIlIIIIIIIII[3];
        }
    }

    public z ay() {
        return this.aV;
    }

    private static boolean llIlIIllIlIIlI(int n2) {
        return n2 != 0;
    }

    public int az() {
        return this.aW;
    }

    public void a(TileObject tileObject) {
        this.aS = tileObject;
    }

    public boolean ar() {
        return this.aO;
    }

    public void j(int n2) {
        this.aW = n2;
    }

    public z aw() {
        return this.aT;
    }

    public int aH() {
        return this.be;
    }

    public Set<B> aq() {
        return this.aM;
    }

    public void Y() {
        int n2;
        if (i.llIlIIllIllIII(this.aO ? 1 : 0)) {
            n2 = lIlIIIIIIIII[3];
            0;
            
            }
        } else {
            n2 = lIlIIIIIIIII[1];
        }
        this.aP = n2;
        this.aO = lIlIIIIIIIII[3];
        this.aW = lIlIIIIIIIII[2];
        this.aX = lIlIIIIIIIII[3];
        this.aY = lIlIIIIIIIII[3];
        this.aZ = lIlIIIIIIIII[1];
        this.ba = lIlIIIIIIIII[4];
        this.bb = null;
        this.bc = 0L;
        this.aV = z.UNKNOWN;
        this.aT = z.UNKNOWN;
        this.bd = lIlIIIIIIIII[2];
        this.be = lIlIIIIIIIII[2];
    }

    public void a(long l2) {
        this.bc = l2;
    }
}

