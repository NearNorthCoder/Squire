package c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import gg.squire.cox.SquireChambersPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.ChatMessageType;
import net.runelite.api.Client;
import net.runelite.api.GraphicsObject;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.Prayer;
import net.runelite.api.Projectile;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.ChatMessage;
import net.runelite.api.events.GameObjectDespawned;
import net.runelite.api.events.GameObjectSpawned;
import net.runelite.api.events.GameTick;
import net.runelite.api.events.GraphicChanged;
import net.runelite.api.events.NpcSpawned;
import net.runelite.api.events.ProjectileSpawned;
import net.runelite.api.util.Text;
import net.runelite.api.widgets.Widget;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Vars;
@Singleton
/* renamed from: c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.i  reason: invalid package and case insensitive filesystem */
/* loaded from: 778e0a57-7760-4510-94d3-2c1213879e48.jar:c/s/r/c/-/u/i/s/q/e/r/b/h/e/m/a/i/r/e/-/f/x/-/o/i.class */
public class C0034i {
    private static final /* synthetic */ Pattern bg;
    final /* synthetic */ SquireChambersPlugin ay;
    public static final /* synthetic */ int aD;
    static final /* synthetic */ int aB;
    final /* synthetic */ Client az;
    public static final /* synthetic */ int aH;
    private static /* synthetic */ String[] lIIllllllIlI;
    public static final /* synthetic */ int aI;
    static final /* synthetic */ int aA;
    private static /* synthetic */ int[] lIlIIIIIIIII;
    public static final /* synthetic */ int aC;
    public static final /* synthetic */ int aG;
    public static final /* synthetic */ int aE;
    public static final /* synthetic */ int aF;
    private final /* synthetic */ List<WorldPoint> aJ = new ArrayList();
    private final /* synthetic */ List<WorldPoint> aK = new ArrayList();
    private final /* synthetic */ List<WorldPoint> aL = new ArrayList();
    private final /* synthetic */ Set<B> aM = new HashSet();
    private /* synthetic */ int aN = lIlIIIIIIIII[0];
    private /* synthetic */ boolean aO = lIlIIIIIIIII[1];
    private /* synthetic */ boolean aP = lIlIIIIIIIII[1];
    private /* synthetic */ boolean aQ = lIlIIIIIIIII[1];
    private /* synthetic */ A aR = A.UNKNOWN;
    private /* synthetic */ TileObject aS = null;
    private /* synthetic */ EnumC0051z aT = EnumC0051z.UNKNOWN;
    private /* synthetic */ TileObject aU = null;
    private /* synthetic */ EnumC0051z aV = EnumC0051z.UNKNOWN;
    private /* synthetic */ int aW = lIlIIIIIIIII[2];
    private /* synthetic */ int aX = lIlIIIIIIIII[3];
    private /* synthetic */ int aY = lIlIIIIIIIII[3];
    private /* synthetic */ boolean aZ = lIlIIIIIIIII[1];
    private /* synthetic */ int ba = lIlIIIIIIIII[4];
    private /* synthetic */ Prayer bb = null;
    private /* synthetic */ long bc = 0;
    private /* synthetic */ int bd = lIlIIIIIIIII[2];
    private /* synthetic */ int be = lIlIIIIIIIII[2];
    private /* synthetic */ int bf = lIlIIIIIIIII[2];

    @Subscribe(priority = 2.1474836E9f)
    private void a(GraphicChanged graphicChanged) {
        if (llIlIIllIllIII(this.ay.E() ? 1 : 0) || llIlIIllIllIII(graphicChanged.getActor() instanceof Player ? 1 : 0)) {
            return;
        }
        Player actor = graphicChanged.getActor();
        if (llIlIIllIllIIl(actor.getGraphic(), lIlIIIIIIIII[22])) {
            this.aM.add(new B(actor, C.BURN));
            "".length();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [boolean] */
    void ab() {
        this.aZ = lIlIIIIIIIII[1];
        this.ba = lIlIIIIIIIII[4];
    }

    public List<WorldPoint> ap() {
        return this.aL;
    }

    private static boolean llIlIIllIlIlII(int i, int i2) {
        return i > i2;
    }

    public A au() {
        return this.aR;
    }

    public boolean aC() {
        return this.aZ;
    }

    public void n(int i) {
        this.bd = i;
    }

    void aj() {
        this.aJ.clear();
        this.aK.clear();
        this.az.clearHintArrow();
        for (GraphicsObject graphicsObject : this.az.getGraphicsObjects()) {
            if (llIlIIllIllIIl(graphicsObject.getId(), lIlIIIIIIIII[24])) {
                this.aK.add(WorldPoint.fromLocal(this.az, graphicsObject.getLocation()));
                "".length();
            }
            if (llIlIIllIllIIl(graphicsObject.getId(), lIlIIIIIIIII[25])) {
                this.aJ.add(WorldPoint.fromLocal(this.az, graphicsObject.getLocation()));
                "".length();
            }
            if (llIlIIllIllIII(this.aK.isEmpty() ? 1 : 0)) {
                this.aN -= lIlIIIIIIIII[3];
                if (llIlIIllIllIll(this.aN)) {
                    this.az.clearHintArrow();
                    this.aN = lIlIIIIIIIII[0];
                }
            }
            "".length();
            if ((true ^ true) & ((true ^ true) ^ true)) {
                return;
            }
        }
    }

    public TileObject av() {
        return this.aS;
    }

    @Subscribe(priority = 2.1464836E9f)
    public void a(GameTick gameTick) {
        int[] iArr = new int[lIlIIIIIIIII[3]];
        iArr[lIlIIIIIIIII[1]] = lIlIIIIIIIII[5];
        List<TileObject> all = TileObjects.getAll(iArr);
        this.aL.clear();
        for (TileObject tileObject : all) {
            this.aL.add(tileObject.getWorldLocation());
            "".length();
            "".length();
            if ((true ^ true) & ((true ^ true) ^ true)) {
                return;
            }
        }
        if (llIlIIllIlIIll(this.aS)) {
            int[] iArr2 = new int[lIlIIIIIIIII[3]];
            iArr2[lIlIIIIIIIII[1]] = lIlIIIIIIIII[6];
            a(TileObjects.getNearest(iArr2));
        }
        if (llIlIIllIlIIll(this.aU)) {
            int[] iArr3 = new int[lIlIIIIIIIII[3]];
            iArr3[lIlIIIIIIIII[1]] = lIlIIIIIIIII[7];
            b(TileObjects.getNearest(iArr3));
            Y();
            "".length();
            if ((-" ".length()) > "  ".length()) {
                return;
            }
        } else if (llIlIIllIlIlII(this.aU.getWorldX(), Players.getLocal().getWorldX())) {
            this.bf = lIlIIIIIIIII[1];
            "".length();
            if (" ".length() == 0) {
                return;
            }
        } else {
            this.bf = lIlIIIIIIIII[3];
        }
        if (llIlIIllIlIIlI(this.ay.E() ? 1 : 0)) {
            ac();
        }
        Widget widget = this.az.getWidget(lIlIIIIIIIII[8]);
        if (llIlIIllIlIlIl(widget) && llIlIIllIlIIlI(widget.isVisible() ? 1 : 0)) {
            String text = widget.getText();
            if (llIlIIllIlIIlI(text.contains(lIIllllllIlI[lIlIIIIIIIII[1]]) ? 1 : 0)) {
                this.bd = Vars.getBit(lIlIIIIIIIII[9]);
            }
            if (llIlIIllIlIIlI(text.contains(lIIllllllIlI[lIlIIIIIIIII[3]]) ? 1 : 0)) {
                this.be = Vars.getBit(lIlIIIIIIIII[9]);
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

    public void b(EnumC0051z enumC0051z) {
        this.aT = enumC0051z;
    }

    public void e(boolean z) {
        this.aQ = z;
    }

    private static boolean llIlIIllIllIlI(int i, int i2) {
        return i != i2;
    }

    public void c(EnumC0051z enumC0051z) {
        this.aV = enumC0051z;
    }

    public int aI() {
        return this.bf;
    }

    public void c(boolean z) {
        this.aO = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [boolean] */
    void aa() {
        this.aZ = lIlIIIIIIIII[3];
        this.ba = lIlIIIIIIIII[4];
    }

    public void ag() {
        if (llIlIIllIllIlI(this.aW, lIlIIIIIIIII[13])) {
            System.out.println("Syncing attacks! " + az());
            this.aW = lIlIIIIIIIII[13];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v9, types: [boolean] */
    @Inject
    public C0034i(SquireChambersPlugin squireChambersPlugin, Client client) {
        this.ay = squireChambersPlugin;
        this.az = client;
    }

    @Subscribe(priority = 2.1474836E9f)
    public void a(GameObjectSpawned gameObjectSpawned) {
        if (llIlIIllIlIIll(gameObjectSpawned.getGameObject())) {
            return;
        }
        long lllllllllllllllIlllIIllIlllllIII = gameObjectSpawned.getGameObject().getId();
        switch (lllllllllllllllIlllIIllIlllllIII) {
            case 29880:
            case 29881:
                if (llIlIIllIlIIll(ax())) {
                    Y();
                }
                b((TileObject) gameObjectSpawned.getGameObject());
                "".length();
                if ("  ".length() == 0) {
                    return;
                }
                return;
            case 29883:
            case 29884:
                a((TileObject) gameObjectSpawned.getGameObject());
                "".length();
                if ((16 ^ 20) <= 0) {
                    return;
                }
                return;
            case 30022:
                System.out.println(lIIllllllIlI[lIlIIIIIIIII[23]]);
                this.aL.add(gameObjectSpawned.getGameObject().getWorldLocation());
                "".length();
                return;
            default:
                return;
        }
    }

    public List<WorldPoint> ao() {
        return this.aK;
    }

    public int aD() {
        return this.ba;
    }

    private void al() {
        if (llIlIIllIlIIll(this.aS)) {
            return;
        }
        EnumC0051z r = EnumC0051z.r(C0050y.c(this.aS));
        if (llIlIIllIlIlll(r, this.aT)) {
            return;
        }
        switch (C0035j.bh[r.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                a(r);
                "".length();
                if ((((((178 + 218) - 165) + 10) ^ (((14 + 23) - 13) + 157)) & (((94 ^ 114) ^ (37 ^ 77)) ^ (-" ".length()))) >= "  ".length()) {
                    return;
                }
                break;
            case 17:
                aa();
                "".length();
                if ("  ".length() > "  ".length()) {
                    return;
                }
                break;
            case 18:
            case 19:
                ab();
                break;
        }
        this.aT = r;
    }

    private static boolean llIlIIllIlIlIl(Object obj) {
        return obj != null;
    }

    public void p(int i) {
        this.bf = i;
    }

    public void m(int i) {
        this.ba = i;
    }

    public void b(TileObject tileObject) {
        this.aU = tileObject;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Subscribe(priority = 2.1474836E9f)
    public void a(ChatMessage chatMessage) {
        String lllllllllllllllIlllIIlllIIIlIlll = chatMessage.getMessage();
        if (llIlIIllIlIllI(chatMessage.getType(), ChatMessageType.GAMEMESSAGE) && llIlIIllIlIllI(chatMessage.getType(), ChatMessageType.SPAM)) {
            return;
        }
        if (llIlIIllIlIIlI(lllllllllllllllIlllIIlllIIIlIlll.startsWith(lIIllllllIlI[lIlIIIIIIIII[13]]) ? 1 : 0)) {
            this.aK.clear();
        } else if (llIlIIllIlIlll(chatMessage.getType(), ChatMessageType.GAMEMESSAGE)) {
            Matcher matcher = bg.matcher(chatMessage.getMessage());
            if (llIlIIllIlIIlI(matcher.matches() ? 1 : 0)) {
                for (Player player : this.az.getPlayers()) {
                    String name = player.getName();
                    if (llIlIIllIlIlIl(name) && llIlIIllIlIIlI(Text.sanitize(name).equals(Text.sanitize(matcher.group(lIlIIIIIIIII[3]))) ? 1 : 0)) {
                        this.aM.add(new B(player, C.TELEPORT));
                        "".length();
                    }
                    "".length();
                    if ((-" ".length()) >= ((((37 + 93) - 118) + 150) ^ (((79 + 153) - 83) + 17))) {
                        return;
                    }
                }
            }
            String standardize = Text.standardize(chatMessage.getMessageNode().getValue());
            int lllllllllllllllIlllIIlllIIIlIlII = lIlIIIIIIIII[2];
            switch (standardize.hashCode()) {
                case -2094114081:
                    if (llIlIIllIlIIlI(standardize.equals(lIIllllllIlI[lIlIIIIIIIII[19]]) ? 1 : 0)) {
                        lllllllllllllllIlllIIlllIIIlIlII = lIlIIIIIIIII[15];
                        "".length();
                        if ((((174 ^ 180) ^ (205 ^ 140)) & (((((85 + 51) - 9) + 91) ^ (((117 + 51) - 45) + 6)) ^ (-" ".length()))) >= " ".length()) {
                            return;
                        }
                    }
                    break;
                case -2064703836:
                    if (llIlIIllIlIIlI(standardize.equals(lIIllllllIlI[lIlIIIIIIIII[14]]) ? 1 : 0)) {
                        lllllllllllllllIlllIIlllIIIlIlII = lIlIIIIIIIII[1];
                        "".length();
                        if (((82 ^ 96) ^ (77 ^ 123)) <= "   ".length()) {
                            return;
                        }
                    }
                    break;
                case -1272924347:
                    if (llIlIIllIlIIlI(standardize.equals(lIIllllllIlI[lIlIIIIIIIII[15]]) ? 1 : 0)) {
                        lllllllllllllllIlllIIlllIIIlIlII = lIlIIIIIIIII[3];
                        "".length();
                        if (" ".length() >= "   ".length()) {
                            return;
                        }
                    }
                    break;
                case -525042198:
                    if (llIlIIllIlIIlI(standardize.equals(lIIllllllIlI[lIlIIIIIIIII[18]]) ? 1 : 0)) {
                        lllllllllllllllIlllIIlllIIIlIlII = lIlIIIIIIIII[13];
                        "".length();
                        if (" ".length() < 0) {
                            return;
                        }
                    }
                    break;
                case -127344230:
                    if (llIlIIllIlIIlI(standardize.equals(lIIllllllIlI[lIlIIIIIIIII[20]]) ? 1 : 0)) {
                        lllllllllllllllIlllIIlllIIIlIlII = lIlIIIIIIIII[16];
                        "".length();
                        if (" ".length() > (131 ^ 135)) {
                            return;
                        }
                    }
                    break;
                case -103006838:
                    if (llIlIIllIlIIlI(standardize.equals(lIIllllllIlI[lIlIIIIIIIII[21]]) ? 1 : 0)) {
                        lllllllllllllllIlllIIlllIIIlIlII = lIlIIIIIIIII[17];
                        break;
                    }
                    break;
                case 569920040:
                    if (llIlIIllIlIIlI(standardize.equals(lIIllllllIlI[lIlIIIIIIIII[16]]) ? 1 : 0)) {
                        lllllllllllllllIlllIIlllIIIlIlII = lIlIIIIIIIII[10];
                        "".length();
                        if (((224 ^ 168) & ((100 ^ 44) ^ (-1))) > 0) {
                            return;
                        }
                    }
                    break;
                case 1486918970:
                    if (llIlIIllIlIIlI(standardize.equals(lIIllllllIlI[lIlIIIIIIIII[17]]) ? 1 : 0)) {
                        lllllllllllllllIlllIIlllIIIlIlII = lIlIIIIIIIII[12];
                        "".length();
                        if ((-"   ".length()) > 0) {
                            return;
                        }
                    }
                    break;
                case 1947752869:
                    if (llIlIIllIlIIlI(standardize.equals(lIIllllllIlI[lIlIIIIIIIII[0]]) ? 1 : 0)) {
                        lllllllllllllllIlllIIlllIIIlIlII = lIlIIIIIIIII[14];
                        "".length();
                        if (((true ^ true) & ((true ^ true) ^ true)) != ((true ^ true) & ((true ^ true) ^ true))) {
                            return;
                        }
                    }
                    break;
            }
            switch (lllllllllllllllIlllIIlllIIIlIlII) {
                case 0:
                    a(A.ACID);
                    "".length();
                    if (((51 ^ 92) ^ (251 ^ 144)) <= 0) {
                        return;
                    }
                    return;
                case 1:
                    a(A.CRYSTAL);
                    "".length();
                    if ((-((77 ^ 116) ^ (152 ^ 164))) >= 0) {
                        return;
                    }
                    return;
                case 2:
                    a(A.FLAME);
                    "".length();
                    if ((-" ".length()) == "  ".length()) {
                        return;
                    }
                    return;
                case 3:
                case 4:
                    a(Prayer.PROTECT_FROM_MELEE);
                    "".length();
                    if ((-((((166 + 64) - 163) + 114) ^ (((70 + 87) - 86) + 106))) >= 0) {
                        return;
                    }
                    return;
                case 5:
                case 6:
                    a(Prayer.PROTECT_FROM_MAGIC);
                    "".length();
                    if (0 != 0) {
                        return;
                    }
                    return;
                case 7:
                case 8:
                    a(Prayer.PROTECT_FROM_MISSILES);
                    return;
                default:
                    return;
            }
        }
    }

    static {
        llIlIIllIlIIIl();
        llIlIIllIlIIII();
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
        if (llIlIIllIlIIll(this.aU)) {
            return lIIllllllIlI[lIlIIIIIIIII[26]];
        }
        String[] split = EnumC0051z.r(C0050y.c(this.aU)).name().split(lIIllllllIlI[lIlIIIIIIIII[27]]);
        return split[split.length - lIlIIIIIIIII[3]];
    }

    private static boolean llIlIIllIllIll(int i) {
        return i <= 0;
    }

    private static boolean llIlIIllIllIIl(int i, int i2) {
        return i == i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v5, types: [boolean] */
    public void Z() {
        this.aO = lIlIIIIIIIII[1];
        this.aP = lIlIIIIIIIII[1];
        this.aQ = lIlIIIIIIIII[1];
        this.aR = A.UNKNOWN;
        this.aS = null;
        this.aU = null;
        this.aV = EnumC0051z.UNKNOWN;
        this.aT = EnumC0051z.UNKNOWN;
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

    public void l(int i) {
        this.aY = i;
    }

    public void k(int i) {
        this.aX = i;
    }

    public void a(EnumC0051z enumC0051z) {
        int i;
        this.aW = lIlIIIIIIIII[13];
        this.aX = lIlIIIIIIIII[3];
        switch (C0035j.bh[enumC0051z.ordinal()]) {
            case 1:
            case 2:
                this.aY = lIlIIIIIIIII[10];
                "".length();
                if ("  ".length() < (((50 ^ 44) ^ (111 ^ 41)) & (((23 ^ 114) ^ (157 ^ 160)) ^ (-" ".length())))) {
                    return;
                }
                return;
            case 3:
            case 4:
                this.aY = lIlIIIIIIIII[12];
                "".length();
                if ((-(109 ^ 105)) >= 0) {
                    return;
                }
                return;
            case 5:
            case 6:
                if (llIlIIllIlIIlI(this.aQ ? 1 : 0)) {
                    i = lIlIIIIIIIII[13];
                    "".length();
                    if (((true ^ true) & ((true ^ true) ^ true)) != ((true ^ true) & ((true ^ true) ^ true))) {
                        return;
                    }
                } else {
                    i = lIlIIIIIIIII[3];
                }
                this.aY = i;
                "".length();
                if (((((64 + 20) - (-15)) + 83) ^ (((0 + 122) - 18) + 74)) <= 0) {
                    return;
                }
                return;
            case 7:
            case 8:
                this.aY = lIlIIIIIIIII[3];
                return;
            default:
                return;
        }
    }

    private static boolean llIlIIllIlIlll(Object obj, Object obj2) {
        return obj == obj2;
    }

    public long aF() {
        return this.bc;
    }

    public void ad() {
        if (!llIlIIllIllIIl(this.aW, lIlIIIIIIIII[3])) {
            if (llIlIIllIllIlI(this.aW, lIlIIIIIIIII[2])) {
                this.aW -= lIlIIIIIIIII[3];
                return;
            }
            return;
        }
        this.aW = lIlIIIIIIIII[13];
        ae();
        "".length();
        if ((196 ^ 192) < " ".length()) {
        }
    }

    private static boolean llIlIIllIlllIl(int i, int i2) {
        return i < i2;
    }

    public int X() {
        return Vars.getBit(lIlIIIIIIIII[9]);
    }

    @Subscribe(priority = 2.1474836E9f)
    public void a(GameObjectDespawned gameObjectDespawned) {
        if (llIlIIllIlIIll(gameObjectDespawned.getGameObject())) {
            return;
        }
        int id = gameObjectDespawned.getGameObject().getId();
        if (llIlIIllIllIIl(id, lIlIIIIIIIII[7])) {
            b((TileObject) null);
        }
        if (llIlIIllIllIIl(id, lIlIIIIIIIII[5])) {
            this.aL.remove(gameObjectDespawned.getGameObject().getWorldLocation());
            "".length();
        }
    }

    private static boolean llIlIIllIlllII(int i) {
        return i > 0;
    }

    public void o(int i) {
        this.be = i;
    }

    public List<WorldPoint> an() {
        return this.aJ;
    }

    private static void llIlIIllIlIIII() {
        lIIllllllIlI = new String[lIlIIIIIIIII[35]];
        lIIllllllIlI[lIlIIIIIIIII[1]] = llIlIIllIIllIl("rUp0ORX/TkanL7+ywpVH1A==", "wMxnV");
        lIIllllllIlI[lIlIIIIIIIII[3]] = llIlIIllIIlllI("AAIsIjFyIyokIQ==", "RkKJE");
        lIIllllllIlI[lIlIIIIIIIII[10]] = llIlIIllIIllIl("gd2PjgsgOzEQVMDl4NAKIQ==", "vHZdm");
        lIIllllllIlI[lIlIIIIIIIII[12]] = llIlIIllIIllll("+YcaOxgoLF4PWzjSZOdHvw==", "bSyiU");
        lIIllllllIlI[lIlIIIIIIIII[13]] = llIlIIllIIllll("RVVj0dThH4W1Y7BRPjBn4m3uhirHERQ85F0Jq90wfy8=", "lmTCY");
        lIIllllllIlI[lIlIIIIIIIII[14]] = llIlIIllIIllIl("woF59bOKW9lfdeCEvixEHmNCaH0O12oRyC/j0T9UyquRvHaHkSDA8cN5QJYIHQLv", "dXcOT");
        lIIllllllIlI[lIlIIIIIIIII[15]] = llIlIIllIIllIl("wipstdfUi2D8tPOib1r1y2u6ZrkUSaRKItW/5SWGAGvVKovLBGb3DSgSI6OFfqLu", "BwkAp");
        lIIllllllIlI[lIlIIIIIIIII[16]] = llIlIIllIIlllI("MzARSgQ1PRUeQyg0GUoRLisRGUMwMQACQzMwEUoTKC8RGEMoPlQMDyY1EUQ=", "GXtjc");
        lIIllllllIlI[lIlIIIIIIIII[17]] = llIlIIllIIlllI("BBowWgkCFzQOTh8eOFoIGQAwCU4RUiYKBhUAMFoBFlI0HQkCFyYJBx8cdQMBBQB1DQ8JXHUDAQUAdQocEQswCB1QGjQMC1AQMB8AUAE0Ch4VFns=", "prUzn");
        lIIllllllIlI[lIlIIIIIIIII[18]] = llIlIIllIIllll("KoNRn4IWsduVQ3UvRucMCafwtFAObTgzXWTuUapokVZqElPnJZwvlLsolUGoJH1gMbr31qY41JA=", "MOxdb");
        lIIllllllIlI[lIlIIIIIIIII[0]] = llIlIIllIIllIl("w2tjexY0qHi/K863eBpwT8F/+QpsCiXTTYRu+ByB+Fcs1NIgEt7XeDNtmnPHy9d6ePhRUwg7XHhGctJEZ3UPBh3pFqGRPNypjNAe8te4HoZU8wGT1ZWGPA==", "vQaql");
        lIIllllllIlI[lIlIIIIIIIII[19]] = llIlIIllIIllll("V5NrshXKepi7jwpePmck9bACuRx06h8yoSDvXE2iLnkdqBWbgnymLwmvaFr1grAbZ8WtVxc8FYw=", "foDdA");
        lIIllllllIlI[lIlIIIIIIIII[20]] = llIlIIllIIllIl("UXPR0dwmlcPthH6zjXCYWdnNuz0HcnWr3tmjed3jsrsEs7NJFmBzMbY1Cgx1jHnS6ICJ3R8Q68ubiKU81hCNtnwOr+Y81oBfNBX4zl1vVBTUVRvP/UEX6C9AONaFpa7r", "IMpnT");
        lIIllllllIlI[lIlIIIIIIIII[21]] = llIlIIllIIlllI("LAAVdTAqDREhdzcEHXUxMRoVJnc5SAMlPz0aFXU4PkgRNjQtGhE2LngJHjF3PA0IITIqAQQsdyEHBSd3LwkJew==", "XhpUW");
        lIIllllllIlI[lIlIIIIIIIII[23]] = llIlIIllIIllll("ie0CliFhXuXpCPawq6t53w==", "oBZAd");
        lIIllllllIlI[lIlIIIIIIIII[26]] = llIlIIllIIlllI("TmY=", "cWaCX");
        lIIllllllIlI[lIlIIIIIIIII[27]] = llIlIIllIIlllI("HQ==", "Btdgk");
        lIIllllllIlI[lIlIIIIIIIII[34]] = llIlIIllIIllIl("xYQIgLzH4H/0IkTxGmAkEuixxqDXrgITvk9/psGndWBN3Rh8aY40J7lX0Jrew+rOEGrxkLs3Y740bcR0wK+A2n74qc9XxcGsNIevF2F/r3kurKkP/Fdczg==", "ZXlGJ");
    }

    @Subscribe(priority = 2.1474836E9f)
    public void a(ProjectileSpawned projectileSpawned) {
        Projectile projectile = projectileSpawned.getProjectile();
        switch (projectile.getId()) {
            case 1339:
                a(Prayer.PROTECT_FROM_MAGIC);
                "".length();
                if (0 != 0) {
                    return;
                }
                return;
            case 1340:
                a(Prayer.PROTECT_FROM_MISSILES);
                "".length();
                if ("   ".length() == " ".length()) {
                    return;
                }
                return;
            case 1354:
                Player interacting = projectile.getInteracting();
                if (llIlIIllIlIIlI(interacting instanceof Player ? 1 : 0)) {
                    aq().add(new B(interacting, C.ACID));
                    "".length();
                    return;
                }
                return;
            default:
                return;
        }
    }

    public TileObject ax() {
        return this.aU;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [boolean] */
    void ah() {
        if (llIlIIllIllIII(this.aZ ? 1 : 0)) {
            return;
        }
        this.ba -= lIlIIIIIIIII[3];
        if (llIlIIllIllIll(this.ba)) {
            this.aZ = lIlIIIIIIIII[1];
            this.ba = lIlIIIIIIIII[4];
        }
    }

    public void af() {
        if ((!llIlIIllIllIIl(this.aY, lIlIIIIIIIII[12]) || llIlIIllIlIIlI(this.aQ ? 1 : 0)) && !llIlIIllIllIIl(this.aY, lIlIIIIIIIII[13])) {
            this.aY += lIlIIIIIIIII[3];
            return;
        }
        this.aY = lIlIIIIIIIII[3];
        "".length();
        if (" ".length() > " ".length()) {
        }
    }

    public void f(boolean z) {
        this.aZ = z;
    }

    public void d(boolean z) {
        this.aP = z;
    }

    public int aA() {
        return this.aX;
    }

    private static String llIlIIllIIlllI(String lllllllllllllllIlllIIllIlIlIIIll, String lllllllllllllllIlllIIllIlIlIIIlI) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIlllIIllIlIlIIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlllIIllIlIlIIIIl = new StringBuilder();
        char[] lllllllllllllllIlllIIllIlIlIIIII = lllllllllllllllIlllIIllIlIlIIIlI.toCharArray();
        int lllllllllllllllIlllIIllIlIIlllll = lIlIIIIIIIII[1];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = lIlIIIIIIIII[1];
        while (llIlIIllIlllIl(i, length)) {
            lllllllllllllllIlllIIllIlIlIIIIl.append((char) (charArray[i] ^ lllllllllllllllIlllIIllIlIlIIIII[lllllllllllllllIlllIIllIlIIlllll % lllllllllllllllIlllIIllIlIlIIIII.length]));
            "".length();
            lllllllllllllllIlllIIllIlIIlllll++;
            i++;
            "".length();
            if ("  ".length() <= 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIlllIIllIlIlIIIIl);
    }

    private static boolean llIlIIllIllIII(int i) {
        return i == 0;
    }

    void ai() {
        if (llIlIIllIlllII(this.aM.size())) {
            this.aM.forEach((v0) -> {
                v0.by();
            });
            this.aM.removeIf(b -> {
                if (llIlIIllIllIll(b.bB())) {
                    ?? r0 = lIlIIIIIIIII[3];
                    "".length();
                    return (-"  ".length()) >= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
                return lIlIIIIIIIII[1];
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
        } catch (Exception lllllllllllllllIlllIIllIlIllIlII) {
            lllllllllllllllIlllIIllIlIllIlII.printStackTrace();
            return null;
        }
    }

    @Subscribe(priority = 2.1474836E9f)
    public void a(NpcSpawned npcSpawned) {
        NPC npc = npcSpawned.getNpc();
        if (llIlIIllIlIIll(npc)) {
            return;
        }
        if (llIlIIllIlIIlI(npc.getName().contains(lIIllllllIlI[lIlIIIIIIIII[10]]) ? 1 : 0)) {
            this.bd = lIlIIIIIIIII[11];
        }
        if (llIlIIllIlIIlI(npc.getName().contains(lIIllllllIlI[lIlIIIIIIIII[12]]) ? 1 : 0)) {
            this.be = lIlIIIIIIIII[11];
        }
    }

    public boolean as() {
        return this.aP;
    }

    public void ac() {
        ai();
        ah();
        aj();
        ad();
        ak();
        al();
    }

    public void a(A a) {
        this.aR = a;
    }

    private static String llIlIIllIIllll(String lllllllllllllllIlllIIllIllIIIIII, String lllllllllllllllIlllIIllIlIllllIl) {
        try {
            SecretKeySpec lllllllllllllllIlllIIllIllIIIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlllIIllIlIllllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlllIIllIllIIIIlI = Cipher.getInstance("Blowfish");
            lllllllllllllllIlllIIllIllIIIIlI.init(lIlIIIIIIIII[10], lllllllllllllllIlllIIllIllIIIIll);
            return new String(lllllllllllllllIlllIIllIllIIIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllIlllIIllIllIIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlllIIllIllIIIIIl) {
            lllllllllllllllIlllIIllIllIIIIIl.printStackTrace();
            return null;
        }
    }

    private static boolean llIlIIllIlIllI(Object obj, Object obj2) {
        return obj != obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v6, types: [boolean] */
    private void ak() {
        int i;
        if (llIlIIllIlIIll(this.aU)) {
            return;
        }
        EnumC0051z r = EnumC0051z.r(C0050y.c(this.aU));
        if (llIlIIllIlIlll(r, this.aV)) {
            return;
        }
        switch (C0035j.bh[r.ordinal()]) {
            case 9:
            case 10:
                if (llIlIIllIlIIlI(this.aP ? 1 : 0)) {
                    i = lIlIIIIIIIII[15];
                    "".length();
                    if (0 != 0) {
                        return;
                    }
                } else {
                    i = lIlIIIIIIIII[17];
                }
                this.aW = i;
                this.aX = lIlIIIIIIIII[3];
                this.aY = lIlIIIIIIIII[3];
                "".length();
                if (!((true ^ true) ^ (true ^ true))) {
                    return;
                }
                break;
            case 11:
            case 12:
            case 13:
                this.aQ = lIlIIIIIIIII[3];
                "".length();
                if ((-"   ".length()) >= 0) {
                    return;
                }
                break;
            case 14:
            case 15:
            case 16:
                ag();
                break;
        }
        if (llIlIIllIlIIlI(r.bx() ? 1 : 0)) {
            ag();
        }
        this.aV = r;
    }

    private static boolean llIlIIllIlIIll(Object obj) {
        return obj == null;
    }

    public void T() {
        Z();
    }

    private static void llIlIIllIlIIIl() {
        lIlIIIIIIIII = new int[36];
        lIlIIIIIIIII[0] = (((8 + 128) - (-8)) + 42) ^ (((174 + 161) - 226) + 67);
        lIlIIIIIIIII[1] = (198 ^ 141) & ((219 ^ 144) ^ (-1));
        lIlIIIIIIIII[2] = -" ".length();
        lIlIIIIIIIII[3] = " ".length();
        lIlIIIIIIIII[4] = (114 ^ 42) ^ (21 ^ 96);
        lIlIIIIIIIII[5] = (-2698) & 32719;
        lIlIIIIIIIII[6] = (-833) & 30716;
        lIlIIIIIIIII[7] = (-837) & 30717;
        lIlIIIIIIIII[8] = (-3095) & 19860511;
        lIlIIIIIIIII[9] = (-24585) & 30683;
        lIlIIIIIIIII[10] = "  ".length();
        lIlIIIIIIIII[11] = (-((-6673) & 32692)) & (-4101) & 30719;
        lIlIIIIIIIII[12] = "   ".length();
        lIlIIIIIIIII[13] = 123 ^ 127;
        lIlIIIIIIIII[14] = 74 ^ 79;
        lIlIIIIIIIII[15] = (17 ^ 83) ^ (85 ^ 17);
        lIlIIIIIIIII[16] = (214 ^ 167) ^ (42 ^ 92);
        lIlIIIIIIIII[17] = 60 ^ 52;
        lIlIIIIIIIII[18] = 59 ^ 50;
        lIlIIIIIIIII[19] = 92 ^ 87;
        lIlIIIIIIIII[20] = 49 ^ 61;
        lIlIIIIIIIII[21] = 24 ^ 21;
        lIlIIIIIIIII[22] = (-((-3167) & 31999)) & (-513) & 30695;
        lIlIIIIIIIII[23] = 11 ^ 5;
        lIlIIIIIIIII[24] = (-((-17713) & 30513)) & (-2097) & 16255;
        lIlIIIIIIIII[25] = (-4141) & 5503;
        lIlIIIIIIIII[26] = 82 ^ 93;
        lIlIIIIIIIII[27] = (((114 + 69) - 162) + 112) ^ (((5 + 92) - 28) + 80);
        lIlIIIIIIIII[28] = (-((-16510) & 17279)) & (-2113) & 32767;
        lIlIIIIIIIII[29] = (-21057) & 22396;
        lIlIIIIIIIII[30] = (-769) & 30655;
        lIlIIIIIIIII[31] = (-(54 ^ 117)) & (-517) & 30462;
        lIlIIIIIIIII[32] = (-8769) & 10107;
        lIlIIIIIIIII[33] = (-2373) & 32255;
        lIlIIIIIIIII[34] = 30 ^ 15;
        lIlIIIIIIIII[35] = 96 ^ 114;
    }

    public int aG() {
        return this.bd;
    }

    public void ae() {
        if (!llIlIIllIllIIl(this.aX, lIlIIIIIIIII[13])) {
            this.aX += lIlIIIIIIIII[3];
            return;
        }
        this.aX = lIlIIIIIIIII[3];
        af();
        "".length();
        if ("  ".length() > "  ".length()) {
        }
    }

    public EnumC0051z ay() {
        return this.aV;
    }

    private static boolean llIlIIllIlIIlI(int i) {
        return i != 0;
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

    public void j(int i) {
        this.aW = i;
    }

    public EnumC0051z aw() {
        return this.aT;
    }

    public int aH() {
        return this.be;
    }

    public Set<B> aq() {
        return this.aM;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v7, types: [boolean] */
    public void Y() {
        boolean z;
        if (llIlIIllIllIII(this.aO ? 1 : 0)) {
            int i = lIlIIIIIIIII[3];
            "".length();
            z = i;
            if (0 != 0) {
                return;
            }
        } else {
            z = lIlIIIIIIIII[1];
        }
        this.aP = z;
        this.aO = lIlIIIIIIIII[3];
        this.aW = lIlIIIIIIIII[2];
        this.aX = lIlIIIIIIIII[3];
        this.aY = lIlIIIIIIIII[3];
        this.aZ = lIlIIIIIIIII[1];
        this.ba = lIlIIIIIIIII[4];
        this.bb = null;
        this.bc = 0L;
        this.aV = EnumC0051z.UNKNOWN;
        this.aT = EnumC0051z.UNKNOWN;
        this.bd = lIlIIIIIIIII[2];
        this.be = lIlIIIIIIIII[2];
    }

    public void a(long j) {
        this.bc = j;
    }
}
