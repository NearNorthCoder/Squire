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
        void lllllllllllllllIlllIIlllIIIIIlIl;
        if (i.llIlIIllIllIII(this.ay.E() ? 1 : 0)) {
            return;
        }
        if (i.llIlIIllIllIII(lllllllllllllllIlllIIlllIIIIIlIl.getActor() instanceof Player)) {
            return;
        }
        Player lllllllllllllllIlllIIlllIIIIIlII = (Player)lllllllllllllllIlllIIlllIIIIIlIl.getActor();
        if (i.llIlIIllIllIIl(lllllllllllllllIlllIIlllIIIIIlII.getGraphic(), lIlIIIIIIIII[22])) {
            i lllllllllllllllIlllIIlllIIIIIllI;
            lllllllllllllllIlllIIlllIIIIIllI.aM.add(new B(lllllllllllllllIlllIIlllIIIIIlII, C.BURN));
            "".length();
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
        Iterator lllllllllllllllIlllIIllIlllIIIIl = this.az.getGraphicsObjects().iterator();
        while (i.llIlIIllIlIIlI(lllllllllllllllIlllIIllIlllIIIIl.hasNext() ? 1 : 0)) {
            i lllllllllllllllIlllIIllIlllIIIlI;
            GraphicsObject lllllllllllllllIlllIIllIlllIIIII = (GraphicsObject)lllllllllllllllIlllIIllIlllIIIIl.next();
            if (i.llIlIIllIllIIl(lllllllllllllllIlllIIllIlllIIIII.getId(), lIlIIIIIIIII[24])) {
                lllllllllllllllIlllIIllIlllIIIlI.aK.add(WorldPoint.fromLocal((Client)lllllllllllllllIlllIIllIlllIIIlI.az, (LocalPoint)lllllllllllllllIlllIIllIlllIIIII.getLocation()));
                "".length();
            }
            if (i.llIlIIllIllIIl(lllllllllllllllIlllIIllIlllIIIII.getId(), lIlIIIIIIIII[25])) {
                lllllllllllllllIlllIIllIlllIIIlI.aJ.add(WorldPoint.fromLocal((Client)lllllllllllllllIlllIIllIlllIIIlI.az, (LocalPoint)lllllllllllllllIlllIIllIlllIIIII.getLocation()));
                "".length();
            }
            if (i.llIlIIllIllIII(lllllllllllllllIlllIIllIlllIIIlI.aK.isEmpty() ? 1 : 0)) {
                lllllllllllllllIlllIIllIlllIIIlI.aN -= lIlIIIIIIIII[3];
                if (i.llIlIIllIllIll(lllllllllllllllIlllIIllIlllIIIlI.aN)) {
                    lllllllllllllllIlllIIllIlllIIIlI.az.clearHintArrow();
                    lllllllllllllllIlllIIllIlllIIIlI.aN = lIlIIIIIIIII[0];
                }
            }
            "".length();
            if (((0x69 ^ 0x7F) & ~(0x70 ^ 0x66)) == 0) continue;
            return;
        }
    }

    public TileObject av() {
        return this.aS;
    }

    @Subscribe(priority=2.1464836E9f)
    public void a(GameTick gameTick) {
        i lllllllllllllllIlllIIlllIIlIlIll;
        Object lllllllllllllllIlllIIlllIIlIlIII;
        int[] nArray = new int[lIlIIIIIIIII[3]];
        nArray[i.lIlIIIIIIIII[1]] = lIlIIIIIIIII[5];
        List list = TileObjects.getAll((int[])nArray);
        this.aL.clear();
        TileObject lllllllllllllllIlllIIlllIIlIlIIl = list.iterator();
        while (i.llIlIIllIlIIlI(lllllllllllllllIlllIIlllIIlIlIIl.hasNext() ? 1 : 0)) {
            lllllllllllllllIlllIIlllIIlIlIII = (TileObject)lllllllllllllllIlllIIlllIIlIlIIl.next();
            lllllllllllllllIlllIIlllIIlIlIll.aL.add(lllllllllllllllIlllIIlllIIlIlIII.getWorldLocation());
            "".length();
            "".length();
            if (((0x17 ^ 0x54) & ~(0xDC ^ 0x9F)) == 0) continue;
            return;
        }
        if (i.llIlIIllIlIIll(lllllllllllllllIlllIIlllIIlIlIll.aS)) {
            int[] nArray2 = new int[lIlIIIIIIIII[3]];
            nArray2[i.lIlIIIIIIIII[1]] = lIlIIIIIIIII[6];
            lllllllllllllllIlllIIlllIIlIlIIl = TileObjects.getNearest((int[])nArray2);
            lllllllllllllllIlllIIlllIIlIlIll.a(lllllllllllllllIlllIIlllIIlIlIIl);
        }
        if (i.llIlIIllIlIIll(lllllllllllllllIlllIIlllIIlIlIll.aU)) {
            int[] nArray3 = new int[lIlIIIIIIIII[3]];
            nArray3[i.lIlIIIIIIIII[1]] = lIlIIIIIIIII[7];
            lllllllllllllllIlllIIlllIIlIlIIl = TileObjects.getNearest((int[])nArray3);
            lllllllllllllllIlllIIlllIIlIlIll.b(lllllllllllllllIlllIIlllIIlIlIIl);
            lllllllllllllllIlllIIlllIIlIlIll.Y();
            "".length();
            if (-" ".length() > "  ".length()) {
                return;
            }
        } else if (i.llIlIIllIlIlII(lllllllllllllllIlllIIlllIIlIlIll.aU.getWorldX(), Players.getLocal().getWorldX())) {
            lllllllllllllllIlllIIlllIIlIlIll.bf = lIlIIIIIIIII[1];
            "".length();
            if (" ".length() == 0) {
                return;
            }
        } else {
            lllllllllllllllIlllIIlllIIlIlIll.bf = lIlIIIIIIIII[3];
        }
        if (i.llIlIIllIlIIlI(lllllllllllllllIlllIIlllIIlIlIll.ay.E() ? 1 : 0)) {
            lllllllllllllllIlllIIlllIIlIlIll.ac();
        }
        if (i.llIlIIllIlIlIl(lllllllllllllllIlllIIlllIIlIlIIl = lllllllllllllllIlllIIlllIIlIlIll.az.getWidget(lIlIIIIIIIII[8])) && i.llIlIIllIlIIlI(lllllllllllllllIlllIIlllIIlIlIIl.isVisible() ? 1 : 0)) {
            lllllllllllllllIlllIIlllIIlIlIII = lllllllllllllllIlllIIlllIIlIlIIl.getText();
            if (i.llIlIIllIlIIlI(((String)lllllllllllllllIlllIIlllIIlIlIII).contains(lIIllllllIlI[lIlIIIIIIIII[1]]) ? 1 : 0)) {
                lllllllllllllllIlllIIlllIIlIlIll.bd = Vars.getBit((int)lIlIIIIIIIII[9]);
            }
            if (i.llIlIIllIlIIlI(((String)lllllllllllllllIlllIIlllIIlIlIII).contains(lIIllllllIlI[lIlIIIIIIIII[3]]) ? 1 : 0)) {
                lllllllllllllllIlllIIlllIIlIlIll.be = Vars.getBit((int)lIlIIIIIIIII[9]);
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
        void lllllllllllllllIlllIIllIlllllIIl;
        if (i.llIlIIllIlIIll(gameObjectSpawned.getGameObject())) {
            return;
        }
        int lllllllllllllllIlllIIllIlllllIII = lllllllllllllllIlllIIllIlllllIIl.getGameObject().getId();
        switch (lllllllllllllllIlllIIllIlllllIII) {
            case 29880: 
            case 29881: {
                i lllllllllllllllIlllIIllIlllllIlI;
                if (i.llIlIIllIlIIll(lllllllllllllllIlllIIllIlllllIlI.ax())) {
                    lllllllllllllllIlllIIllIlllllIlI.Y();
                }
                lllllllllllllllIlllIIllIlllllIlI.b((TileObject)lllllllllllllllIlllIIllIlllllIIl.getGameObject());
                "".length();
                if ("  ".length() != 0) break;
                return;
            }
            case 29883: 
            case 29884: {
                i lllllllllllllllIlllIIllIlllllIlI;
                lllllllllllllllIlllIIllIlllllIlI.a((TileObject)lllllllllllllllIlllIIllIlllllIIl.getGameObject());
                "".length();
                if ((0x10 ^ 0x14) > 0) break;
                return;
            }
            case 30022: {
                i lllllllllllllllIlllIIllIlllllIlI;
                System.out.println(lIIllllllIlI[lIlIIIIIIIII[23]]);
                lllllllllllllllIlllIIllIlllllIlI.aL.add(lllllllllllllllIlllIIllIlllllIIl.getGameObject().getWorldLocation());
                "".length();
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
        i lllllllllllllllIlllIIllIllIlIllI;
        if (i.llIlIIllIlIIll(this.aS)) {
            return;
        }
        int lllllllllllllllIlllIIllIllIlIlIl = y.c(lllllllllllllllIlllIIllIllIlIllI.aS);
        z lllllllllllllllIlllIIllIllIlIlII = z.r(lllllllllllllllIlllIIllIllIlIlIl);
        if (i.llIlIIllIlIlll((Object)lllllllllllllllIlllIIllIllIlIlII, (Object)lllllllllllllllIlllIIllIllIlIllI.aT)) {
            return;
        }
        switch (j.bh[lllllllllllllllIlllIIllIllIlIlII.ordinal()]) {
            case 1: 
            case 2: 
            case 3: 
            case 4: 
            case 5: 
            case 6: 
            case 7: 
            case 8: {
                lllllllllllllllIlllIIllIllIlIllI.a(lllllllllllllllIlllIIllIllIlIlII);
                "".length();
                if (((178 + 218 - 165 + 10 ^ 14 + 23 - 13 + 157) & (0x5E ^ 0x72 ^ (0x25 ^ 0x4D) ^ -" ".length())) < "  ".length()) break;
                return;
            }
            case 17: {
                lllllllllllllllIlllIIllIllIlIllI.aa();
                "".length();
                if ("  ".length() <= "  ".length()) break;
                return;
            }
            case 18: 
            case 19: {
                lllllllllllllllIlllIIllIllIlIllI.ab();
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
        void lllllllllllllllIlllIIlllIIIllIII;
        i lllllllllllllllIlllIIlllIIIllIIl;
        void lllllllllllllllIlllIIlllIIIlIlll;
        String string = chatMessage.getMessage();
        if (i.llIlIIllIlIllI(chatMessage.getType(), ChatMessageType.GAMEMESSAGE) && i.llIlIIllIlIllI(chatMessage.getType(), ChatMessageType.SPAM)) {
            return;
        }
        if (i.llIlIIllIlIIlI(lllllllllllllllIlllIIlllIIIlIlll.startsWith(lIIllllllIlI[lIlIIIIIIIII[13]]) ? 1 : 0)) {
            lllllllllllllllIlllIIlllIIIllIIl.aK.clear();
            return;
        }
        if (i.llIlIIllIlIlll(lllllllllllllllIlllIIlllIIIllIII.getType(), ChatMessageType.GAMEMESSAGE)) {
            Object lllllllllllllllIlllIIlllIIIlIlIl;
            Matcher lllllllllllllllIlllIIlllIIIlIllI = bg.matcher(lllllllllllllllIlllIIlllIIIllIII.getMessage());
            if (i.llIlIIllIlIIlI(lllllllllllllllIlllIIlllIIIlIllI.matches() ? 1 : 0)) {
                lllllllllllllllIlllIIlllIIIlIlIl = lllllllllllllllIlllIIlllIIIllIIl.az.getPlayers().iterator();
                while (i.llIlIIllIlIIlI(lllllllllllllllIlllIIlllIIIlIlIl.hasNext() ? 1 : 0)) {
                    String lllllllllllllllIlllIIlllIIIlIIlI;
                    Player lllllllllllllllIlllIIlllIIIlIlII = (Player)lllllllllllllllIlllIIlllIIIlIlIl.next();
                    String lllllllllllllllIlllIIlllIIIlIIll = lllllllllllllllIlllIIlllIIIlIlII.getName();
                    if (i.llIlIIllIlIlIl(lllllllllllllllIlllIIlllIIIlIIll) && i.llIlIIllIlIIlI((lllllllllllllllIlllIIlllIIIlIIlI = Text.sanitize((String)lllllllllllllllIlllIIlllIIIlIIll)).equals(Text.sanitize((String)lllllllllllllllIlllIIlllIIIlIllI.group(lIlIIIIIIIII[3]))) ? 1 : 0)) {
                        lllllllllllllllIlllIIlllIIIllIIl.aM.add(new B(lllllllllllllllIlllIIlllIIIlIlII, C.TELEPORT));
                        "".length();
                    }
                    "".length();
                    if (-" ".length() < (37 + 93 - 118 + 150 ^ 79 + 153 - 83 + 17)) continue;
                    return;
                }
            }
            lllllllllllllllIlllIIlllIIIlIlIl = Text.standardize((String)lllllllllllllllIlllIIlllIIIllIII.getMessageNode().getValue());
            int lllllllllllllllIlllIIlllIIIlIlII = lIlIIIIIIIII[2];
            switch (((String)lllllllllllllllIlllIIlllIIIlIlIl).hashCode()) {
                case -2064703836: {
                    if (!i.llIlIIllIlIIlI(((String)lllllllllllllllIlllIIlllIIIlIlIl).equals(lIIllllllIlI[lIlIIIIIIIII[14]]) ? 1 : 0)) break;
                    lllllllllllllllIlllIIlllIIIlIlII = lIlIIIIIIIII[1];
                    "".length();
                    if ((0x52 ^ 0x60 ^ (0x4D ^ 0x7B)) > "   ".length()) break;
                    return;
                }
                case -1272924347: {
                    if (!i.llIlIIllIlIIlI(((String)lllllllllllllllIlllIIlllIIIlIlIl).equals(lIIllllllIlI[lIlIIIIIIIII[15]]) ? 1 : 0)) break;
                    lllllllllllllllIlllIIlllIIIlIlII = lIlIIIIIIIII[3];
                    "".length();
                    if (" ".length() < "   ".length()) break;
                    return;
                }
                case 569920040: {
                    if (!i.llIlIIllIlIIlI(((String)lllllllllllllllIlllIIlllIIIlIlIl).equals(lIIllllllIlI[lIlIIIIIIIII[16]]) ? 1 : 0)) break;
                    lllllllllllllllIlllIIlllIIIlIlII = lIlIIIIIIIII[10];
                    "".length();
                    if (((0xE0 ^ 0xA8) & ~(0x64 ^ 0x2C)) <= 0) break;
                    return;
                }
                case 1486918970: {
                    if (!i.llIlIIllIlIIlI(((String)lllllllllllllllIlllIIlllIIIlIlIl).equals(lIIllllllIlI[lIlIIIIIIIII[17]]) ? 1 : 0)) break;
                    lllllllllllllllIlllIIlllIIIlIlII = lIlIIIIIIIII[12];
                    "".length();
                    if (-"   ".length() <= 0) break;
                    return;
                }
                case -525042198: {
                    if (!i.llIlIIllIlIIlI(((String)lllllllllllllllIlllIIlllIIIlIlIl).equals(lIIllllllIlI[lIlIIIIIIIII[18]]) ? 1 : 0)) break;
                    lllllllllllllllIlllIIlllIIIlIlII = lIlIIIIIIIII[13];
                    "".length();
                    if (" ".length() >= 0) break;
                    return;
                }
                case 1947752869: {
                    if (!i.llIlIIllIlIIlI(((String)lllllllllllllllIlllIIlllIIIlIlIl).equals(lIIllllllIlI[lIlIIIIIIIII[0]]) ? 1 : 0)) break;
                    lllllllllllllllIlllIIlllIIIlIlII = lIlIIIIIIIII[14];
                    "".length();
                    if (((0x61 ^ 0x41) & ~(0xAF ^ 0x8F)) == ((0x32 ^ 0x2D) & ~(0x3A ^ 0x25))) break;
                    return;
                }
                case -2094114081: {
                    if (!i.llIlIIllIlIIlI(((String)lllllllllllllllIlllIIlllIIIlIlIl).equals(lIIllllllIlI[lIlIIIIIIIII[19]]) ? 1 : 0)) break;
                    lllllllllllllllIlllIIlllIIIlIlII = lIlIIIIIIIII[15];
                    "".length();
                    if (((0xAE ^ 0xB4 ^ (0xCD ^ 0x8C)) & (85 + 51 - 9 + 91 ^ 117 + 51 - 45 + 6 ^ -" ".length())) < " ".length()) break;
                    return;
                }
                case -127344230: {
                    if (!i.llIlIIllIlIIlI(((String)lllllllllllllllIlllIIlllIIIlIlIl).equals(lIIllllllIlI[lIlIIIIIIIII[20]]) ? 1 : 0)) break;
                    lllllllllllllllIlllIIlllIIIlIlII = lIlIIIIIIIII[16];
                    "".length();
                    if (" ".length() <= (0x83 ^ 0x87)) break;
                    return;
                }
                case -103006838: {
                    if (!i.llIlIIllIlIIlI(((String)lllllllllllllllIlllIIlllIIIlIlIl).equals(lIIllllllIlI[lIlIIIIIIIII[21]]) ? 1 : 0)) break;
                    lllllllllllllllIlllIIlllIIIlIlII = lIlIIIIIIIII[17];
                }
            }
            switch (lllllllllllllllIlllIIlllIIIlIlII) {
                case 0: {
                    lllllllllllllllIlllIIlllIIIllIIl.a(A.ACID);
                    "".length();
                    if ((0x33 ^ 0x5C ^ (0xFB ^ 0x90)) > 0) break;
                    return;
                }
                case 1: {
                    lllllllllllllllIlllIIlllIIIllIIl.a(A.CRYSTAL);
                    "".length();
                    if (-(0x4D ^ 0x74 ^ (0x98 ^ 0xA4)) < 0) break;
                    return;
                }
                case 2: {
                    lllllllllllllllIlllIIlllIIIllIIl.a(A.FLAME);
                    "".length();
                    if (-" ".length() != "  ".length()) break;
                    return;
                }
                case 3: 
                case 4: {
                    lllllllllllllllIlllIIlllIIIllIIl.a(Prayer.PROTECT_FROM_MELEE);
                    "".length();
                    if (-(166 + 64 - 163 + 114 ^ 70 + 87 - 86 + 106) < 0) break;
                    return;
                }
                case 5: 
                case 6: {
                    lllllllllllllllIlllIIlllIIIllIIl.a(Prayer.PROTECT_FROM_MAGIC);
                    "".length();
                    if (null == null) break;
                    return;
                }
                case 7: 
                case 8: {
                    lllllllllllllllIlllIIlllIIIllIIl.a(Prayer.PROTECT_FROM_MISSILES);
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
                lllllllllllllllIlllIIllIlllIllIl.aY = lIlIIIIIIIII[10];
                "".length();
                if ("  ".length() >= ((0x32 ^ 0x2C ^ (0x6F ^ 0x29)) & (0x17 ^ 0x72 ^ (0x9D ^ 0xA0) ^ -" ".length()))) break;
                return;
            }
            case 3: 
            case 4: {
                lllllllllllllllIlllIIllIlllIllIl.aY = lIlIIIIIIIII[12];
                "".length();
                if (-(0x6D ^ 0x69) < 0) break;
                return;
            }
            case 5: 
            case 6: {
                int n2;
                i lllllllllllllllIlllIIllIlllIllIl;
                if (i.llIlIIllIlIIlI(lllllllllllllllIlllIIllIlllIllIl.aQ ? 1 : 0)) {
                    n2 = lIlIIIIIIIII[13];
                    "".length();
                    if (((0x7A ^ 0x4F) & ~(0x65 ^ 0x50)) != ((0x93 ^ 0xBD) & ~(0x7E ^ 0x50))) {
                        return;
                    }
                } else {
                    n2 = lIlIIIIIIIII[3];
                }
                lllllllllllllllIlllIIllIlllIllIl.aY = n2;
                "".length();
                if ((64 + 20 - -15 + 83 ^ 0 + 122 - 18 + 74) > 0) break;
                return;
            }
            case 7: 
            case 8: {
                lllllllllllllllIlllIIllIlllIllIl.aY = lIlIIIIIIIII[3];
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
        i lllllllllllllllIlllIIllIllllIlII;
        if (i.llIlIIllIllIIl(this.aW, lIlIIIIIIIII[3])) {
            this.aW = lIlIIIIIIIII[13];
            this.ae();
            "".length();
            if ((0xC4 ^ 0xC0) < " ".length()) {
                return;
            }
        } else if (i.llIlIIllIllIlI(lllllllllllllllIlllIIllIllllIlII.aW, lIlIIIIIIIII[2])) {
            lllllllllllllllIlllIIllIllllIlII.aW -= lIlIIIIIIIII[3];
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
        i lllllllllllllllIlllIIlllIIIIIIII;
        void lllllllllllllllIlllIIllIllllllll;
        if (i.llIlIIllIlIIll(gameObjectDespawned.getGameObject())) {
            return;
        }
        int lllllllllllllllIlllIIllIlllllllI = lllllllllllllllIlllIIllIllllllll.getGameObject().getId();
        if (i.llIlIIllIllIIl(lllllllllllllllIlllIIllIlllllllI, lIlIIIIIIIII[7])) {
            lllllllllllllllIlllIIlllIIIIIIII.b((TileObject)null);
        }
        if (i.llIlIIllIllIIl(lllllllllllllllIlllIIllIlllllllI, lIlIIIIIIIII[5])) {
            lllllllllllllllIlllIIlllIIIIIIII.aL.remove(lllllllllllllllIlllIIllIllllllll.getGameObject().getWorldLocation());
            "".length();
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
        i.lIIllllllIlI[i.lIlIIIIIIIII[1]] = i.llIlIIllIIllIl("rUp0ORX/TkanL7+ywpVH1A==", "wMxnV");
        i.lIIllllllIlI[i.lIlIIIIIIIII[3]] = i.llIlIIllIIlllI("AAIsIjFyIyokIQ==", "RkKJE");
        i.lIIllllllIlI[i.lIlIIIIIIIII[10]] = i.llIlIIllIIllIl("gd2PjgsgOzEQVMDl4NAKIQ==", "vHZdm");
        i.lIIllllllIlI[i.lIlIIIIIIIII[12]] = i.llIlIIllIIllll("+YcaOxgoLF4PWzjSZOdHvw==", "bSyiU");
        i.lIIllllllIlI[i.lIlIIIIIIIII[13]] = i.llIlIIllIIllll("RVVj0dThH4W1Y7BRPjBn4m3uhirHERQ85F0Jq90wfy8=", "lmTCY");
        i.lIIllllllIlI[i.lIlIIIIIIIII[14]] = i.llIlIIllIIllIl("woF59bOKW9lfdeCEvixEHmNCaH0O12oRyC/j0T9UyquRvHaHkSDA8cN5QJYIHQLv", "dXcOT");
        i.lIIllllllIlI[i.lIlIIIIIIIII[15]] = i.llIlIIllIIllIl("wipstdfUi2D8tPOib1r1y2u6ZrkUSaRKItW/5SWGAGvVKovLBGb3DSgSI6OFfqLu", "BwkAp");
        i.lIIllllllIlI[i.lIlIIIIIIIII[16]] = i.llIlIIllIIlllI("MzARSgQ1PRUeQyg0GUoRLisRGUMwMQACQzMwEUoTKC8RGEMoPlQMDyY1EUQ=", "GXtjc");
        i.lIIllllllIlI[i.lIlIIIIIIIII[17]] = i.llIlIIllIIlllI("BBowWgkCFzQOTh8eOFoIGQAwCU4RUiYKBhUAMFoBFlI0HQkCFyYJBx8cdQMBBQB1DQ8JXHUDAQUAdQocEQswCB1QGjQMC1AQMB8AUAE0Ch4VFns=", "prUzn");
        i.lIIllllllIlI[i.lIlIIIIIIIII[18]] = i.llIlIIllIIllll("KoNRn4IWsduVQ3UvRucMCafwtFAObTgzXWTuUapokVZqElPnJZwvlLsolUGoJH1gMbr31qY41JA=", "MOxdb");
        i.lIIllllllIlI[i.lIlIIIIIIIII[0]] = i.llIlIIllIIllIl("w2tjexY0qHi/K863eBpwT8F/+QpsCiXTTYRu+ByB+Fcs1NIgEt7XeDNtmnPHy9d6ePhRUwg7XHhGctJEZ3UPBh3pFqGRPNypjNAe8te4HoZU8wGT1ZWGPA==", "vQaql");
        i.lIIllllllIlI[i.lIlIIIIIIIII[19]] = i.llIlIIllIIllll("V5NrshXKepi7jwpePmck9bACuRx06h8yoSDvXE2iLnkdqBWbgnymLwmvaFr1grAbZ8WtVxc8FYw=", "foDdA");
        i.lIIllllllIlI[i.lIlIIIIIIIII[20]] = i.llIlIIllIIllIl("UXPR0dwmlcPthH6zjXCYWdnNuz0HcnWr3tmjed3jsrsEs7NJFmBzMbY1Cgx1jHnS6ICJ3R8Q68ubiKU81hCNtnwOr+Y81oBfNBX4zl1vVBTUVRvP/UEX6C9AONaFpa7r", "IMpnT");
        i.lIIllllllIlI[i.lIlIIIIIIIII[21]] = i.llIlIIllIIlllI("LAAVdTAqDREhdzcEHXUxMRoVJnc5SAMlPz0aFXU4PkgRNjQtGhE2LngJHjF3PA0IITIqAQQsdyEHBSd3LwkJew==", "XhpUW");
        i.lIIllllllIlI[i.lIlIIIIIIIII[23]] = i.llIlIIllIIllll("ie0CliFhXuXpCPawq6t53w==", "oBZAd");
        i.lIIllllllIlI[i.lIlIIIIIIIII[26]] = i.llIlIIllIIlllI("TmY=", "cWaCX");
        i.lIIllllllIlI[i.lIlIIIIIIIII[27]] = i.llIlIIllIIlllI("HQ==", "Btdgk");
        i.lIIllllllIlI[i.lIlIIIIIIIII[34]] = i.llIlIIllIIllIl("xYQIgLzH4H/0IkTxGmAkEuixxqDXrgITvk9/psGndWBN3Rh8aY40J7lX0Jrew+rOEGrxkLs3Y740bcR0wK+A2n74qc9XxcGsNIevF2F/r3kurKkP/Fdczg==", "ZXlGJ");
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe(priority=2.1474836E9f)
    public void a(ProjectileSpawned projectileSpawned) {
        Projectile projectile = projectileSpawned.getProjectile();
        switch (projectile.getId()) {
            case 1339: {
                i lllllllllllllllIlllIIlllIIIIllIl;
                lllllllllllllllIlllIIlllIIIIllIl.a(Prayer.PROTECT_FROM_MAGIC);
                "".length();
                if (null == null) break;
                return;
            }
            case 1340: {
                i lllllllllllllllIlllIIlllIIIIllIl;
                lllllllllllllllIlllIIlllIIIIllIl.a(Prayer.PROTECT_FROM_MISSILES);
                "".length();
                if ("   ".length() != " ".length()) break;
                return;
            }
            case 1354: {
                void lllllllllllllllIlllIIlllIIIIlIll;
                i lllllllllllllllIlllIIlllIIIIllIl;
                Actor lllllllllllllllIlllIIlllIIIIlIlI = lllllllllllllllIlllIIlllIIIIlIll.getInteracting();
                if (!i.llIlIIllIlIIlI(lllllllllllllllIlllIIlllIIIIlIlI instanceof Player)) break;
                lllllllllllllllIlllIIlllIIIIllIl.aq().add(new B((Player)lllllllllllllllIlllIIlllIIIIlIlI, C.ACID));
                "".length();
            }
        }
    }

    public TileObject ax() {
        return this.aU;
    }

    void ah() {
        i lllllllllllllllIlllIIllIlllIlIII;
        if (i.llIlIIllIllIII(this.aZ ? 1 : 0)) {
            return;
        }
        lllllllllllllllIlllIIllIlllIlIII.ba -= lIlIIIIIIIII[3];
        if (i.llIlIIllIllIll(lllllllllllllllIlllIIllIlllIlIII.ba)) {
            lllllllllllllllIlllIIllIlllIlIII.aZ = lIlIIIIIIIII[1];
            lllllllllllllllIlllIIllIlllIlIII.ba = lIlIIIIIIIII[4];
        }
    }

    public void af() {
        i lllllllllllllllIlllIIllIllllIIII;
        if (i.llIlIIllIllIIl(this.aY, lIlIIIIIIIII[12]) && !i.llIlIIllIlIIlI(this.aQ ? 1 : 0) || i.llIlIIllIllIIl(lllllllllllllllIlllIIllIllllIIII.aY, lIlIIIIIIIII[13])) {
            lllllllllllllllIlllIIllIllllIIII.aY = lIlIIIIIIIII[3];
            "".length();
            if (" ".length() > " ".length()) {
                return;
            }
        } else {
            lllllllllllllllIlllIIllIllllIIII.aY += lIlIIIIIIIII[3];
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

    private static String llIlIIllIIlllI(String lllllllllllllllIlllIIllIlIlIIIll, String lllllllllllllllIlllIIllIlIIlllIl) {
        lllllllllllllllIlllIIllIlIlIIIll = new String(Base64.getDecoder().decode(lllllllllllllllIlllIIllIlIlIIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlllIIllIlIlIIIIl = new StringBuilder();
        char[] lllllllllllllllIlllIIllIlIlIIIII = lllllllllllllllIlllIIllIlIIlllIl.toCharArray();
        int lllllllllllllllIlllIIllIlIIlllll = lIlIIIIIIIII[1];
        char[] lllllllllllllllIlllIIllIlIIllIIl = lllllllllllllllIlllIIllIlIlIIIll.toCharArray();
        int lllllllllllllllIlllIIllIlIIllIII = lllllllllllllllIlllIIllIlIIllIIl.length;
        int lllllllllllllllIlllIIllIlIIlIlll = lIlIIIIIIIII[1];
        while (i.llIlIIllIlllIl(lllllllllllllllIlllIIllIlIIlIlll, lllllllllllllllIlllIIllIlIIllIII)) {
            char lllllllllllllllIlllIIllIlIlIIlII = lllllllllllllllIlllIIllIlIIllIIl[lllllllllllllllIlllIIllIlIIlIlll];
            lllllllllllllllIlllIIllIlIlIIIIl.append((char)(lllllllllllllllIlllIIllIlIlIIlII ^ lllllllllllllllIlllIIllIlIlIIIII[lllllllllllllllIlllIIllIlIIlllll % lllllllllllllllIlllIIllIlIlIIIII.length]));
            "".length();
            ++lllllllllllllllIlllIIllIlIIlllll;
            ++lllllllllllllllIlllIIllIlIIlIlll;
            "".length();
            if ("  ".length() > 0) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIlllIIllIlIlIIIIl);
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
                    "".length();
                    if (-"  ".length() >= 0) {
                        return ((0x6B ^ 0x4F) & ~(0x38 ^ 0x1C)) != 0;
                    }
                } else {
                    bl2 = lIlIIIIIIIII[1];
                }
                return bl2;
            });
            "".length();
        }
    }

    public int aB() {
        return this.aY;
    }

    private static String llIlIIllIIllIl(String lllllllllllllllIlllIIllIlIllIIll, String lllllllllllllllIlllIIllIlIllIIlI) {
        try {
            SecretKeySpec lllllllllllllllIlllIIllIlIllIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlllIIllIlIllIIlI.getBytes(StandardCharsets.UTF_8)), lIlIIIIIIIII[17]), "DES");
            Cipher lllllllllllllllIlllIIllIlIllIlIl = Cipher.getInstance("DES");
            lllllllllllllllIlllIIllIlIllIlIl.init(lIlIIIIIIIII[10], lllllllllllllllIlllIIllIlIllIllI);
            return new String(lllllllllllllllIlllIIllIlIllIlIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIlllIIllIlIllIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlllIIllIlIllIlII) {
            lllllllllllllllIlllIIllIlIllIlII.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe(priority=2.1474836E9f)
    public void a(NpcSpawned npcSpawned) {
        void lllllllllllllllIlllIIlllIIlIIIlI;
        NPC nPC = npcSpawned.getNpc();
        if (i.llIlIIllIlIIll(nPC)) {
            return;
        }
        if (i.llIlIIllIlIIlI(lllllllllllllllIlllIIlllIIlIIIlI.getName().contains(lIIllllllIlI[lIlIIIIIIIII[10]]) ? 1 : 0)) {
            lllllllllllllllIlllIIlllIIlIIlII.bd = lIlIIIIIIIII[11];
        }
        if (i.llIlIIllIlIIlI(lllllllllllllllIlllIIlllIIlIIIlI.getName().contains(lIIllllllIlI[lIlIIIIIIIII[12]]) ? 1 : 0)) {
            lllllllllllllllIlllIIlllIIlIIlII.be = lIlIIIIIIIII[11];
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

    private static String llIlIIllIIllll(String lllllllllllllllIlllIIllIllIIIIII, String lllllllllllllllIlllIIllIlIllllll) {
        try {
            SecretKeySpec lllllllllllllllIlllIIllIllIIIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlllIIllIlIllllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlllIIllIllIIIIlI = Cipher.getInstance("Blowfish");
            lllllllllllllllIlllIIllIllIIIIlI.init(lIlIIIIIIIII[10], lllllllllllllllIlllIIllIllIIIIll);
            return new String(lllllllllllllllIlllIIllIllIIIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllIlllIIllIllIIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlllIIllIllIIIIIl) {
            lllllllllllllllIlllIIllIllIIIIIl.printStackTrace();
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
        i lllllllllllllllIlllIIllIllIlllII;
        if (i.llIlIIllIlIIll(this.aU)) {
            return;
        }
        int lllllllllllllllIlllIIllIllIllIll = y.c(lllllllllllllllIlllIIllIllIlllII.aU);
        z lllllllllllllllIlllIIllIllIllIlI = z.r(lllllllllllllllIlllIIllIllIllIll);
        if (i.llIlIIllIlIlll((Object)lllllllllllllllIlllIIllIllIllIlI, (Object)lllllllllllllllIlllIIllIllIlllII.aV)) {
            return;
        }
        switch (j.bh[lllllllllllllllIlllIIllIllIllIlI.ordinal()]) {
            case 9: 
            case 10: {
                int n2;
                if (i.llIlIIllIlIIlI(lllllllllllllllIlllIIllIllIlllII.aP ? 1 : 0)) {
                    n2 = lIlIIIIIIIII[15];
                    "".length();
                    if (null != null) {
                        return;
                    }
                } else {
                    n2 = lIlIIIIIIIII[17];
                }
                lllllllllllllllIlllIIllIllIlllII.aW = n2;
                lllllllllllllllIlllIIllIllIlllII.aX = lIlIIIIIIIII[3];
                lllllllllllllllIlllIIllIllIlllII.aY = lIlIIIIIIIII[3];
                "".length();
                if ((0x69 ^ 0x7A ^ (0x89 ^ 0x9F)) != 0) break;
                return;
            }
            case 11: 
            case 12: 
            case 13: {
                lllllllllllllllIlllIIllIllIlllII.aQ = lIlIIIIIIIII[3];
                "".length();
                if (-"   ".length() < 0) break;
                return;
            }
            case 14: 
            case 15: 
            case 16: {
                lllllllllllllllIlllIIllIllIlllII.ag();
            }
        }
        if (i.llIlIIllIlIIlI(lllllllllllllllIlllIIllIllIllIlI.bx() ? 1 : 0)) {
            lllllllllllllllIlllIIllIllIlllII.ag();
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
        i.lIlIIIIIIIII[2] = -" ".length();
        i.lIlIIIIIIIII[3] = " ".length();
        i.lIlIIIIIIIII[4] = 0x72 ^ 0x2A ^ (0x15 ^ 0x60);
        i.lIlIIIIIIIII[5] = 0xFFFFF576 & 0x7FCF;
        i.lIlIIIIIIIII[6] = 0xFFFFFCBF & 0x77FC;
        i.lIlIIIIIIIII[7] = 0xFFFFFCBB & 0x77FD;
        i.lIlIIIIIIIII[8] = 0xFFFFF3E9 & 0x12F0C1F;
        i.lIlIIIIIIIII[9] = 0xFFFF9FF7 & 0x77DB;
        i.lIlIIIIIIIII[10] = "  ".length();
        i.lIlIIIIIIIII[11] = -(0xFFFFE5EF & 0x7FB4) & (0xFFFFEFFB & 0x77FF);
        i.lIlIIIIIIIII[12] = "   ".length();
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
            "".length();
            if ("  ".length() > "  ".length()) {
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
            "".length();
            if (null != null) {
                return;
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

