package s.r.i.t.g.n.p000.u.h.i.q.i.e.v.e;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.thieving.SquireThieving;
import gg.squire.thieving.SquireThievingConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.GameState;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.plugins.unethicalite.regions.PathBuilt;
import net.unethicalite.api.coords.ScenePoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Game;
import net.unethicalite.api.game.Worlds;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.movement.pathfinder.LocalCollisionMap;
import net.unethicalite.api.movement.pathfinder.Pathfinder;
import net.unethicalite.api.movement.pathfinder.model.Transport;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.client.Static;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@TaskDesc(name = "Luring new target", priority = 3, blocking = true)
/* renamed from: s.r.i.t.g.n.-.u.h.i.q.i.e.v.e.o  reason: invalid package */
/* loaded from: squire-thieving-0.0.1.jar:s/r/i/t/g/n/-/u/h/i/q/i/e/v/e/o.class */
public class o extends Task {
    private final /* synthetic */ SquireThievingConfig R;
    private final /* synthetic */ SquireThieving S;
    private static /* synthetic */ int[] lIIlllIIIIIII;
    private static /* synthetic */ String[] lIIllIlllllll;
    private /* synthetic */ List<WorldPoint> U = new ArrayList();
    private final /* synthetic */ ExecutorService T;
    private static final /* synthetic */ Logger Q;
    private /* synthetic */ Future<List<WorldPoint>> V;

    @Inject
    public o(SquireThievingConfig squireThievingConfig, SquireThieving squireThieving, ExecutorService executorService) {
        this.R = squireThievingConfig;
        this.S = squireThieving;
        this.T = executorService;
    }

    private static boolean lIllIIlIIIlIIII(Object obj, Object obj2) {
        return obj != obj2;
    }

    private Map<WorldPoint, List<Transport>> E() {
        HashMap hashMap = new HashMap();
        String[] strArr = new String[lIIlllIIIIIII[2]];
        strArr[lIIlllIIIIIII[0]] = lIIllIlllllll[lIIlllIIIIIII[13]];
        for (TileObject tileObject : TileObjects.getAll(strArr)) {
            hashMap.put(tileObject.getWorldLocation(), Collections.singletonList(b(tileObject)));
            "".length();
            "".length();
            if ((-" ".length()) >= " ".length()) {
                return null;
            }
        }
        return hashMap;
    }

    private static boolean lIllIIlIIIlIlII(Object obj) {
        return obj != null;
    }

    private static String lIllIIlIIIIlIll(String llllllllllllllIlllIllIlIlllIlIII, String llllllllllllllIlllIllIlIlllIIlll) {
        String llllllllllllllIlllIllIlIlllIlIII2 = new String(Base64.getDecoder().decode(llllllllllllllIlllIllIlIlllIlIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = llllllllllllllIlllIllIlIlllIIlll.toCharArray();
        int llllllllllllllIlllIllIlIlllIIlII = lIIlllIIIIIII[0];
        char[] charArray2 = llllllllllllllIlllIllIlIlllIlIII2.toCharArray();
        int length = charArray2.length;
        int i = lIIlllIIIIIII[0];
        while (lIllIIlIIIllIII(i, length)) {
            sb.append((char) (charArray2[i] ^ charArray[llllllllllllllIlllIllIlIlllIIlII % charArray.length]));
            "".length();
            llllllllllllllIlllIllIlIlllIIlII++;
            i++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static String lIllIIlIIIIllII(String llllllllllllllIlllIllIlIllIIIlII, String llllllllllllllIlllIllIlIllIIIlIl) {
        try {
            SecretKeySpec llllllllllllllIlllIllIlIllIIlIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIllIlIllIIIlIl.getBytes(StandardCharsets.UTF_8)), lIIlllIIIIIII[12]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIIlllIIIIIII[3], llllllllllllllIlllIllIlIllIIlIIl);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIllIlIllIIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllIllIlIllIIIlll) {
            llllllllllllllIlllIllIlIllIIIlll.printStackTrace();
            return null;
        }
    }

    private static String lIllIIlIIIIllIl(String llllllllllllllIlllIllIlIllIlIIll, String llllllllllllllIlllIllIlIllIlIIII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIllIlIllIlIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIIlllIIIIIII[3], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIllIlIllIlIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllIllIlIllIlIlII) {
            llllllllllllllIlllIllIlIllIlIlII.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIIlIIIlIIlI(int i) {
        return i != 0;
    }

    private Transport b(TileObject tileObject) {
        return new Transport(tileObject.getWorldLocation(), tileObject.getWorldLocation().dy(lIIlllIIIIIII[2]), lIIlllIIIIIII[2], lIIlllIIIIIII[2], new p(this, tileObject));
    }

    private static boolean lIllIIlIIIlIlIl(Object obj) {
        return obj == null;
    }

    private static int lIllIIlIIIllIlI(float f, float f2) {
        return (f > f2 ? 1 : (f == f2 ? 0 : -1));
    }

    private static void lIllIIlIIIIllll() {
        lIIlllIIIIIII = new int[15];
        lIIlllIIIIIII[0] = ((19 ^ 58) ^ (108 ^ 3)) & (((3 ^ 115) ^ (105 ^ 95)) ^ (-" ".length()));
        lIIlllIIIIIII[1] = -" ".length();
        lIIlllIIIIIII[2] = " ".length();
        lIIlllIIIIIII[3] = "  ".length();
        lIIlllIIIIIII[4] = "   ".length();
        lIIlllIIIIIII[5] = (((106 + 32) - (-16)) + 8) ^ (((157 + 42) - 35) + 2);
        lIIlllIIIIIII[6] = (-12393) & 15737;
        lIIlllIIIIIII[7] = (-24693) & 27646;
        lIIlllIIIIIII[8] = (((68 + 24) - (-58)) + 4) ^ (((29 + 8) - 10) + 132);
        lIIlllIIIIIII[9] = (-24594) & 27933;
        lIIlllIIIIIII[10] = 82 ^ 84;
        lIIlllIIIIIII[11] = (((34 + 79) - 43) + 96) ^ (((80 + 57) - (-7)) + 17);
        lIIlllIIIIIII[12] = (((67 + 37) - 51) + 118) ^ (((17 + 34) - 28) + 140);
        lIIlllIIIIIII[13] = (116 ^ 81) ^ (120 ^ 84);
        lIIlllIIIIIII[14] = 27 ^ 17;
    }

    private static void lIllIIlIIIIlllI() {
        lIIllIlllllll = new String[lIIlllIIIIIII[14]];
        lIIllIlllllll[lIIlllIIIIIII[0]] = lIllIIlIIIIlIll("Dx8cIQ==", "CjnDd");
        lIIllIlllllll[lIIlllIIIIIII[2]] = lIllIIlIIIIlIll("JQoXGj4VRAIXchIRHxQ2UBQXDDo=", "pdvxR");
        lIIllIlllllll[lIIlllIIIIIII[3]] = lIllIIlIIIIlIll("FDc0IxI+LA==", "WBFWs");
        lIIllIlllllll[lIIlllIIIIIII[4]] = lIllIIlIIIIlIll("BSM3BQ==", "JSRkY");
        lIIllIlllllll[lIIlllIIIIIII[5]] = lIllIIlIIIIllII("yzESLEBsskw=", "ndeQM");
        lIIllIlllllll[lIIlllIIIIIII[8]] = lIllIIlIIIIllII("1m7HADdrxj6EXlM7n11Dvx3Z/PnuavKw", "xIMrT");
        lIIllIlllllll[lIIlllIIIIIII[10]] = lIllIIlIIIIllIl("GOHKA5w+sBw=", "wUllr");
        lIIllIlllllll[lIIlllIIIIIII[11]] = lIllIIlIIIIlIll("CiAhPy0=", "ILNLH");
        lIIllIlllllll[lIIlllIIIIIII[12]] = lIllIIlIIIIlIll("BC4GMC8=", "GBiCJ");
        lIIllIlllllll[lIIlllIIIIIII[13]] = lIllIIlIIIIllII("oz45mTOhXnE=", "VVrmF");
    }

    private static boolean lIllIIlIIIlIIll(int i, int i2) {
        return i != i2;
    }

    static {
        lIllIIlIIIIllll();
        lIllIIlIIIIlllI();
        Q = LoggerFactory.getLogger(o.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v105, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v112, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v125, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v182, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v185, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v199, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v223, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v240, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v259, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v261, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v263, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v269, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v275, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v282, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v284, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v286, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v90, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v74, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v76, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v28, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v1, types: [boolean] */
    public boolean run() {
        int i;
        WorldPoint center;
        if (lIllIIlIIIlIIII(this.R.method(), EnumC0001b.BLACK_JACK)) {
            return lIIlllIIIIIII[0];
        }
        if (!lIllIIlIIIlIIII(Game.getState(), GameState.HOPPING) || lIllIIlIIIlIIIl(Game.getState(), GameState.LOADING)) {
            this.U = new ArrayList();
            this.V = null;
            return lIIlllIIIIIII[0];
        } else if (lIllIIlIIIlIIlI(this.S.i() ? 1 : 0)) {
            return lIIlllIIIIIII[0];
        } else {
            if (lIllIIlIIIlIIll(this.S.e(), lIIlllIIIIIII[1]) && lIllIIlIIIlIIll(Worlds.getCurrentId(), this.S.e())) {
                return lIIlllIIIIIII[0];
            }
            EnumC0002c t = this.S.b().t();
            NPC b = this.S.b().b(t);
            Player local = Players.getLocal();
            if (lIllIIlIIIlIlII(b)) {
                return lIllIIlIIIlIIlI(t.p().contains(local) ? 1 : 0) ? this.S.a(local, (boolean) lIIlllIIIIIII[0]) : lIIlllIIIIIII[0];
            } else if (lIllIIlIIIlIIlI(t.p().contains(local) ? 1 : 0) && lIllIIlIIIlIIlI(this.S.a(local, (boolean) lIIlllIIIIIII[2]) ? 1 : 0)) {
                return lIIlllIIIIIII[2];
            } else {
                NPC a = this.S.b().a(npc -> {
                    if (lIllIIlIIIlIIlI(Reachable.isInteractable(npc) ? 1 : 0) && lIllIIlIIIllIll(lIllIIlIIIllIlI(t.p().getCenter().distanceToHypotenuse(npc.getWorldLocation()), 14.0f))) {
                        ?? r0 = lIIlllIIIIIII[2];
                        "".length();
                        return "  ".length() <= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return lIIlllIIIIIII[0];
                });
                if (lIllIIlIIIlIlIl(a)) {
                    return lIIlllIIIIIII[0];
                }
                if (lIllIIlIIIlIIlI(Dialog.canContinue() ? 1 : 0)) {
                    Dialog.continueSpace();
                    return lIIlllIIIIIII[2];
                } else if (lIllIIlIIIlIIlI(NPCs.getAll(npc2 -> {
                    if (lIllIIlIIIlIlII(npc2) && lIllIIlIIIlIIIl(npc2.getInteracting(), local)) {
                        ?? r0 = lIIlllIIIIIII[2];
                        "".length();
                        return "   ".length() >= ((202 ^ 159) ^ (20 ^ 69)) ? ((((44 + 127) - 39) + 7) ^ (((145 + 52) - 80) + 75)) & (((100 ^ 66) ^ (193 ^ 172)) ^ (-" ".length())) : r0;
                    }
                    return lIIlllIIIIIII[0];
                }).isEmpty() ? 1 : 0) && lIllIIlIIIlIIlI(Reachable.isInteractable(a) ? 1 : 0)) {
                    if (lIllIIlIIIlIllI(Movement.isRunEnabled() ? 1 : 0)) {
                        Movement.toggleRun();
                    }
                    this.U = new ArrayList();
                    a.interact(lIIllIlllllll[lIIlllIIIIIII[0]]);
                    return lIIlllIIIIIII[2];
                } else {
                    if (lIllIIlIIIlIIlI(Movement.isRunEnabled() ? 1 : 0)) {
                        Movement.toggleRun();
                    }
                    if (lIllIIlIIIlIIlI(this.U.isEmpty() ? 1 : 0) && lIllIIlIIIlIlIl(this.V)) {
                        List singletonList = Collections.singletonList(local.getWorldLocation());
                        if (lIllIIlIIIlIllI(a.getWorldLocation().equals(t.r()) ? 1 : 0) && lIllIIlIIIlIllI(local.getWorldLocation().equals(t.r()) ? 1 : 0) && !lIllIIlIIIlIIlI(t.p().contains(local) ? 1 : 0)) {
                            i = lIIlllIIIIIII[0];
                        } else {
                            i = lIIlllIIIIIII[2];
                            "".length();
                            if (((64 ^ 107) ^ (153 ^ 182)) <= " ".length()) {
                                return ((219 ^ 176) ^ (86 ^ 35)) & (((51 ^ 99) ^ (34 ^ 108)) ^ (-" ".length()));
                            }
                        }
                        int llllllllllllllIlllIllIllIIIIlllI = i;
                        LocalCollisionMap localCollisionMap = new LocalCollisionMap(Static.getGlobalCollisionMap(), (boolean) lIIlllIIIIIII[0]);
                        ExecutorService executorService = this.T;
                        Map<WorldPoint, List<Transport>> E = E();
                        if (lIllIIlIIIlIIlI(llllllllllllllIlllIllIllIIIIlllI)) {
                            center = t.r();
                            "".length();
                            if (0 != 0) {
                                return ((72 ^ 115) ^ (28 ^ 41)) & (((((42 + 134) - 56) + 29) ^ (((54 + 134) - 169) + 136)) ^ (-" ".length()));
                            }
                        } else {
                            center = t.p().getCenter();
                        }
                        this.V = executorService.submit((Callable) new Pathfinder(localCollisionMap, E, singletonList, center, (boolean) lIIlllIIIIIII[2]));
                        return lIIlllIIIIIII[2];
                    } else if (lIllIIlIIIlIlII(this.V)) {
                        if (lIllIIlIIIlIllI(this.V.isDone() ? 1 : 0) && lIllIIlIIIlIllI(this.V.isCancelled() ? 1 : 0)) {
                            return lIIlllIIIIIII[2];
                        }
                        try {
                            List<WorldPoint> list = this.V.get();
                            if (lIllIIlIIIlIlII(list)) {
                                this.U = list;
                                Static.getEventBus().post(new PathBuilt(this.U));
                            }
                            "".length();
                            if ((((26 ^ 5) ^ (88 ^ 101)) & (((87 ^ 55) ^ (237 ^ 175)) ^ (-" ".length()))) != 0) {
                                return ((60 ^ 33) ^ (82 ^ 18)) & (((19 ^ 82) ^ (155 ^ 135)) ^ (-" ".length()));
                            }
                        } catch (InterruptedException | ExecutionException e) {
                            Q.debug(lIIllIlllllll[lIIlllIIIIIII[2]]);
                        }
                        this.V = null;
                        return lIIlllIIIIIII[0];
                    } else if (lIllIIlIIIlIIlI(a.getWorldLocation().equals(t.q()) ? 1 : 0) && lIllIIlIIIlIIlI(t.p().contains(local) ? 1 : 0)) {
                        return D();
                    } else {
                        int indexOf = this.U.indexOf(local.getWorldLocation());
                        if (lIllIIlIIIlIlll(indexOf, lIIlllIIIIIII[1])) {
                            this.U = new ArrayList();
                            return lIIlllIIIIIII[2];
                        }
                        WorldPoint worldPoint = this.U.get(indexOf);
                        int i2 = lIIlllIIIIIII[0];
                        int i3 = lIIlllIIIIIII[0];
                        int i4 = indexOf;
                        do {
                            if (lIllIIlIIIllIII(i4, this.U.size())) {
                                String[] strArr = new String[lIIlllIIIIIII[2]];
                                strArr[lIIlllIIIIIII[0]] = lIIllIlllllll[lIIlllIIIIIII[3]];
                                TileObject firstAt = TileObjects.getFirstAt(this.U.get(i4), strArr);
                                if (lIllIIlIIIlIlII(firstAt)) {
                                    String str = lIIllIlllllll[lIIlllIIIIIII[4]];
                                    if (lIllIIlIIIlIIlI(firstAt.hasAction((v1) -> {
                                        return r1.equals(v1);
                                    }) ? 1 : 0)) {
                                        firstAt.interact(lIIllIlllllll[lIIlllIIIIIII[5]]);
                                        return lIIlllIIIIIII[2];
                                    }
                                }
                                WorldPoint worldPoint2 = this.U.get(i4);
                                i2 += Math.abs(worldPoint.getX() - worldPoint2.getX());
                                i3 += Math.abs(worldPoint.getY() - worldPoint2.getY());
                                if (!lIllIIlIIIlIIlI(i2) || lIllIIlIIIlIllI(i3)) {
                                    worldPoint = worldPoint2;
                                    "".length();
                                    if (0 != 0) {
                                        return (true ^ true) & ((true ^ true) ^ true);
                                    }
                                    i4++;
                                    "".length();
                                } else if (lIllIIlIIIlIlll(i2, i3)) {
                                    worldPoint = worldPoint2;
                                    "".length();
                                    if (" ".length() < 0) {
                                        return (" ".length() ^ (15 ^ 75)) & (((59 ^ 30) ^ (204 ^ 172)) ^ (-" ".length()));
                                    }
                                }
                            }
                            if (lIllIIlIIIllIIl(a.distanceTo(local), lIIlllIIIIIII[2]) && lIllIIlIIIlIlII(this.S.a(this.S.b().t(), (boolean) lIIlllIIIIIII[2]))) {
                                return this.S.a(local, (boolean) lIIlllIIIIIII[2]);
                            }
                            if (lIllIIlIIIlIIlI(a.getWorldLocation().equals(new WorldPoint(lIIlllIIIIIII[6], lIIlllIIIIIII[7], lIIlllIIIIIII[0])) ? 1 : 0)) {
                                System.out.println(lIIllIlllllll[lIIlllIIIIIII[8]]);
                                WorldPoint r = this.S.b().t().r();
                                if (lIllIIlIIIlIllI(Players.getLocal().getWorldLocation().equals(r) ? 1 : 0)) {
                                    Movement.setDestination(r);
                                    return lIIlllIIIIIII[2];
                                }
                            }
                            if (!lIllIIlIIIlIIlI(worldPoint.isInScene(Static.getClient()) ? 1 : 0)) {
                                this.U = new ArrayList();
                                return lIIlllIIIIIII[0];
                            }
                            if (lIllIIlIIIlIIlI(Players.getLocal().getWorldLocation().equals(this.S.b().t().r()) ? 1 : 0)) {
                                if (lIllIIlIIIlIIlI(this.S.a(local, (boolean) lIIlllIIIIIII[2]) ? 1 : 0)) {
                                    return lIIlllIIIIIII[2];
                                }
                                Movement.setDestination(new WorldPoint(lIIlllIIIIIII[9], lIIlllIIIIIII[7], lIIlllIIIIIII[0]));
                            }
                            ScenePoint fromWorld = ScenePoint.fromWorld(worldPoint);
                            Movement.setDestination(fromWorld.getX(), fromWorld.getY());
                            return lIIlllIIIIIII[2];
                        } while (0 == 0);
                        return (true ^ true) & ((true ^ true) ^ true);
                    }
                }
            }
        }
    }

    private static boolean lIllIIlIIIlIlll(int i, int i2) {
        return i == i2;
    }

    private static boolean lIllIIlIIIllIII(int i, int i2) {
        return i < i2;
    }

    private static boolean lIllIIlIIIllIll(int i) {
        return i <= 0;
    }

    private static boolean lIllIIlIIIlIIIl(Object obj, Object obj2) {
        return obj == obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    private boolean D() {
        if (lIllIIlIIIlIllI(Movement.isRunEnabled() ? 1 : 0)) {
            Movement.toggleRun();
        }
        String[] strArr = new String[lIIlllIIIIIII[2]];
        strArr[lIIlllIIIIIII[0]] = lIIllIlllllll[lIIlllIIIIIII[10]];
        TileObject nearest = TileObjects.getNearest(strArr);
        if (lIllIIlIIIlIlII(nearest)) {
            String str = lIIllIlllllll[lIIlllIIIIIII[11]];
            if (lIllIIlIIIlIIlI(nearest.hasAction((v1) -> {
                return r1.equals(v1);
            }) ? 1 : 0)) {
                nearest.interact(lIIllIlllllll[lIIlllIIIIIII[12]]);
                return lIIlllIIIIIII[2];
            }
        }
        return lIIlllIIIIIII[0];
    }

    private static boolean lIllIIlIIIlIllI(int i) {
        return i == 0;
    }

    private static boolean lIllIIlIIIllIIl(int i, int i2) {
        return i > i2;
    }
}
